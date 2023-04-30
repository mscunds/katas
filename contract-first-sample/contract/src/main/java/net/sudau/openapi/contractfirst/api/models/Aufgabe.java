package net.sudau.openapi.contractfirst.api.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Beschreibung einer Aufgabe
 */

@Schema(name = "Aufgabe", description = "Beschreibung einer Aufgabe")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-30T15:24:44.113713700+02:00[Europe/Berlin]")
public class Aufgabe implements Serializable {

  private static final long serialVersionUID = 1L;

  private BigDecimal id;

  private String title;

  private String description;

  private net.sudau.openapi.contractfirst.api.enums.AufgabenStatus status = null;

  public Aufgabe id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * id der Aufgabe
   * @return id
  */
  @Valid 
  @Schema(name = "id", example = "1", description = "id der Aufgabe", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public Aufgabe title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Schlagwort der Aufgabe
   * @return title
  */
  
  @Schema(name = "title", example = "Aufgabe 1", description = "Schlagwort der Aufgabe", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Aufgabe description(String description) {
    this.description = description;
    return this;
  }

  /**
   * längere Beschreibung der Aufgabe
   * @return description
  */
  
  @Schema(name = "description", example = "Beschreibung der Aufgabe mit allen notwendigen Informationen und einer maximalen Gesamtlänge von 200 Zeichen", description = "längere Beschreibung der Aufgabe", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Aufgabe status(net.sudau.openapi.contractfirst.api.enums.AufgabenStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public net.sudau.openapi.contractfirst.api.enums.AufgabenStatus getStatus() {
    return status;
  }

  public void setStatus(net.sudau.openapi.contractfirst.api.enums.AufgabenStatus status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Aufgabe aufgabe = (Aufgabe) o;
    return Objects.equals(this.id, aufgabe.id) &&
        Objects.equals(this.title, aufgabe.title) &&
        Objects.equals(this.description, aufgabe.description) &&
        Objects.equals(this.status, aufgabe.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Aufgabe {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

