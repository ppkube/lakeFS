/*
 * lakeFS API
 * lakeFS HTTP API
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.lakefs.clients.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * StageRangeCreation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StageRangeCreation {
  public static final String SERIALIZED_NAME_FROM_SOURCE_U_R_I = "fromSourceURI";
  @SerializedName(SERIALIZED_NAME_FROM_SOURCE_U_R_I)
  private String fromSourceURI;

  public static final String SERIALIZED_NAME_AFTER = "after";
  @SerializedName(SERIALIZED_NAME_AFTER)
  private String after;

  public static final String SERIALIZED_NAME_PREPEND = "prepend";
  @SerializedName(SERIALIZED_NAME_PREPEND)
  private String prepend;


  public StageRangeCreation fromSourceURI(String fromSourceURI) {
    
    this.fromSourceURI = fromSourceURI;
    return this;
  }

   /**
   * The source location of the ingested files. Must match the lakeFS installation blockstore type.
   * @return fromSourceURI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "s3://my-bucket/production/collections/", required = true, value = "The source location of the ingested files. Must match the lakeFS installation blockstore type.")

  public String getFromSourceURI() {
    return fromSourceURI;
  }


  public void setFromSourceURI(String fromSourceURI) {
    this.fromSourceURI = fromSourceURI;
  }


  public StageRangeCreation after(String after) {
    
    this.after = after;
    return this;
  }

   /**
   * Only objects after this key would be ingested.
   * @return after
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "production/collections/some/file.parquet", required = true, value = "Only objects after this key would be ingested.")

  public String getAfter() {
    return after;
  }


  public void setAfter(String after) {
    this.after = after;
  }


  public StageRangeCreation prepend(String prepend) {
    
    this.prepend = prepend;
    return this;
  }

   /**
   * A prefix to prepend to ingested objects.
   * @return prepend
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "collections/", required = true, value = "A prefix to prepend to ingested objects.")

  public String getPrepend() {
    return prepend;
  }


  public void setPrepend(String prepend) {
    this.prepend = prepend;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StageRangeCreation stageRangeCreation = (StageRangeCreation) o;
    return Objects.equals(this.fromSourceURI, stageRangeCreation.fromSourceURI) &&
        Objects.equals(this.after, stageRangeCreation.after) &&
        Objects.equals(this.prepend, stageRangeCreation.prepend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromSourceURI, after, prepend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StageRangeCreation {\n");
    sb.append("    fromSourceURI: ").append(toIndentedString(fromSourceURI)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    prepend: ").append(toIndentedString(prepend)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

