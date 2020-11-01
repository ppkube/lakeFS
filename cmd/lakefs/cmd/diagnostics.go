package cmd

import (
	"context"
	"log"
	"os"

	"github.com/treeverse/lakefs/diagnostics"

	"github.com/spf13/cobra"
	"github.com/treeverse/lakefs/db"
)

// diagnosticsCmd represents the diagnostics command
var diagnosticsCmd = &cobra.Command{
	Use:   "diagnostics",
	Short: "Collect lakeFS diagnostics",
	Run: func(cmd *cobra.Command, args []string) {
		ctx := context.Background()
		output, _ := cmd.Flags().GetString("output")

		dbPool := db.BuildDatabaseConnection(cfg.GetDatabaseParams())
		defer dbPool.Close()

		c := diagnostics.NewCollector(dbPool)

		f, err := os.Create(output)
		if err != nil {
			log.Fatalf("Create %s failed - %s", output, err)
		}
		defer func() { _ = f.Close() }()

		log.Printf("Collecting...")
		err = c.Collect(ctx, f)
		if err != nil {
			log.Fatalf("Failed to collect data: %s", err)
		}
		log.Printf("Diagnostics collected into %s", output)
	},
}

//nolint:gochecknoinits
func init() {
	rootCmd.AddCommand(diagnosticsCmd)
	diagnosticsCmd.Flags().StringP("output", "o", "", "output zip filename")
	_ = diagnosticsCmd.MarkFlagRequired("output")
}
