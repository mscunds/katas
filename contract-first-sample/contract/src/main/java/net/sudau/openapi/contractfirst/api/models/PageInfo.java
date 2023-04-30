package net.sudau.openapi.contractfirst.api.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Enthält Daten zur Auswahl von Seite und Anzahl der anzuzeigenden Elemente
 */

@Schema(name = "PageInfo", description = "Enthält Daten zur Auswahl von Seite und Anzahl der anzuzeigenden Elemente")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-30T15:24:44.113713700+02:00[Europe/Berlin]")
public class PageInfo implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer page = 0;

  private Integer contentCount = 10;

  public PageInfo page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * minimum: 0
   * @return page
  */
  @Min(0) 
  @Schema(name = "page", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public PageInfo contentCount(Integer contentCount) {
    this.contentCount = contentCount;
    return this;
  }

  /**
   * Get contentCount
   * minimum: 10
   * @return contentCount
  */
  @Min(10) 
  @Schema(name = "contentCount", example = "100", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentCount")
  public Integer getContentCount() {
    return contentCount;
  }

  public void setContentCount(Integer contentCount) {
    this.contentCount = contentCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageInfo pageInfo = (PageInfo) o;
    return Objects.equals(this.page, pageInfo.page) &&
        Objects.equals(this.contentCount, pageInfo.contentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, contentCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageInfo {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    contentCount: ").append(toIndentedString(contentCount)).append("\n");
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

