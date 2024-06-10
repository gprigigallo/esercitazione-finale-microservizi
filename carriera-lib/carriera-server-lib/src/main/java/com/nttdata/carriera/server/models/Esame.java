package com.nttdata.carriera.server.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Esame
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-07T15:32:56.382909200+02:00[Europe/Rome]")


public class Esame   {
  @JsonProperty("ID")
  private String ID = null;

  @JsonProperty("Voto")
  private Integer voto = null;

  public Esame ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * Get ID
   * @return ID
   **/
  @Schema(description = "")
  
    public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public Esame voto(Integer voto) {
    this.voto = voto;
    return this;
  }

  /**
   * Get voto
   * @return voto
   **/
  @Schema(description = "")
  
    public Integer getVoto() {
    return voto;
  }

  public void setVoto(Integer voto) {
    this.voto = voto;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Esame esame = (Esame) o;
    return Objects.equals(this.ID, esame.ID) &&
        Objects.equals(this.voto, esame.voto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, voto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Esame {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    voto: ").append(toIndentedString(voto)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
