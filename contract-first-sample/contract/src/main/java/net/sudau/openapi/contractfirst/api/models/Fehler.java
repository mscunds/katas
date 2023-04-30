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
 * Antwort bei einem Fehler.
 */

@Schema(name = "Fehler", description = "Antwort bei einem Fehler.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-30T15:24:44.113713700+02:00[Europe/Berlin]")
public class Fehler implements Serializable {

  private static final long serialVersionUID = 1L;

  private String meldung;

  private Integer status;

  private String zeitpunkt;

  public Fehler meldung(String meldung) {
    this.meldung = meldung;
    return this;
  }

  /**
   * Beschreibung des Fehler
   * @return meldung
  */
  
  @Schema(name = "meldung", example = "Fehler beim Speichern", description = "Beschreibung des Fehler", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meldung")
  public String getMeldung() {
    return meldung;
  }

  public void setMeldung(String meldung) {
    this.meldung = meldung;
  }

  public Fehler status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * der Wert entspricht dem HttpStatus der Antwort
   * @return status
  */
  
  @Schema(name = "status", description = "der Wert entspricht dem HttpStatus der Antwort", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Fehler zeitpunkt(String zeitpunkt) {
    this.zeitpunkt = zeitpunkt;
    return this;
  }

  /**
   * Zeitpunkt der Fehlermeldung in ISO Formatierung
   * @return zeitpunkt
  */
  
  @Schema(name = "zeitpunkt", description = "Zeitpunkt der Fehlermeldung in ISO Formatierung", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("zeitpunkt")
  public String getZeitpunkt() {
    return zeitpunkt;
  }

  public void setZeitpunkt(String zeitpunkt) {
    this.zeitpunkt = zeitpunkt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fehler fehler = (Fehler) o;
    return Objects.equals(this.meldung, fehler.meldung) &&
        Objects.equals(this.status, fehler.status) &&
        Objects.equals(this.zeitpunkt, fehler.zeitpunkt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meldung, status, zeitpunkt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fehler {\n");
    sb.append("    meldung: ").append(toIndentedString(meldung)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    zeitpunkt: ").append(toIndentedString(zeitpunkt)).append("\n");
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

