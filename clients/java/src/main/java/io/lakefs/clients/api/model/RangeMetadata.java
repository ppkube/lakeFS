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
 * RangeMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RangeMetadata {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MIN_KEY = "min_key";
  @SerializedName(SERIALIZED_NAME_MIN_KEY)
  private String minKey;

  public static final String SERIALIZED_NAME_MAX_KEY = "max_key";
  @SerializedName(SERIALIZED_NAME_MAX_KEY)
  private String maxKey;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_ESTIMATED_SIZE = "estimated_size";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_SIZE)
  private Integer estimatedSize;


  public RangeMetadata id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the created range.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "480e19972a6fbe98ab8e81ae5efdfd1a29037587e91244e87abd4adefffdb01c", required = true, value = "ID of the created range.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RangeMetadata minKey(String minKey) {
    
    this.minKey = minKey;
    return this;
  }

   /**
   * First key in the range.
   * @return minKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "production/collections/some/file_1.parquet", required = true, value = "First key in the range.")

  public String getMinKey() {
    return minKey;
  }


  public void setMinKey(String minKey) {
    this.minKey = minKey;
  }


  public RangeMetadata maxKey(String maxKey) {
    
    this.maxKey = maxKey;
    return this;
  }

   /**
   * Last key in the range.
   * @return maxKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "production/collections/some/file_8229.parquet", required = true, value = "Last key in the range.")

  public String getMaxKey() {
    return maxKey;
  }


  public void setMaxKey(String maxKey) {
    this.maxKey = maxKey;
  }


  public RangeMetadata count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Number of records in the range.
   * @return count
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of records in the range.")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public RangeMetadata estimatedSize(Integer estimatedSize) {
    
    this.estimatedSize = estimatedSize;
    return this;
  }

   /**
   * Estimated size of the range in bytes
   * @return estimatedSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Estimated size of the range in bytes")

  public Integer getEstimatedSize() {
    return estimatedSize;
  }


  public void setEstimatedSize(Integer estimatedSize) {
    this.estimatedSize = estimatedSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangeMetadata rangeMetadata = (RangeMetadata) o;
    return Objects.equals(this.id, rangeMetadata.id) &&
        Objects.equals(this.minKey, rangeMetadata.minKey) &&
        Objects.equals(this.maxKey, rangeMetadata.maxKey) &&
        Objects.equals(this.count, rangeMetadata.count) &&
        Objects.equals(this.estimatedSize, rangeMetadata.estimatedSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, minKey, maxKey, count, estimatedSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangeMetadata {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    minKey: ").append(toIndentedString(minKey)).append("\n");
    sb.append("    maxKey: ").append(toIndentedString(maxKey)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    estimatedSize: ").append(toIndentedString(estimatedSize)).append("\n");
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

