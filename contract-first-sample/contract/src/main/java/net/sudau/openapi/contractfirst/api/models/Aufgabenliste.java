package net.sudau.openapi.contractfirst.api.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import net.sudau.openapi.contractfirst.api.models.Aufgabe;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * enthält eine Liste von Todos, die aktuelle Seite und die maximale Anzahl der Seiten
 */

@Schema(name = "Aufgabenliste", description = "enthält eine Liste von Todos, die aktuelle Seite und die maximale Anzahl der Seiten")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-30T15:24:44.113713700+02:00[Europe/Berlin]")
public class Aufgabenliste implements Serializable {

  private static final long serialVersionUID = 1L;

  @Valid
  private List<@Valid Aufgabe> items;

  public Aufgabenliste items(List<@Valid Aufgabe> items) {
    this.items = items;
    return this;
  }

  public Aufgabenliste addItemsItem(Aufgabe itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid Aufgabe> getItems() {
    return items;
  }

  public void setItems(List<@Valid Aufgabe> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Aufgabenliste aufgabenliste = (Aufgabenliste) o;
    return Objects.equals(this.items, aufgabenliste.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Aufgabenliste {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

