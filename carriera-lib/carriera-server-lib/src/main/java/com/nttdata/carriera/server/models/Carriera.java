package com.nttdata.carriera.server.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.nttdata.carriera.server.models.Esame;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Carriera
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-07T15:32:56.382909200+02:00[Europe/Rome]")


public class Carriera   {
  @JsonProperty("Matricola")
  private String matricola = null;

  @JsonProperty("ListaEsami")
  @Valid
  private List<Esame> listaEsami = null;

  public Carriera matricola(String matricola) {
    this.matricola = matricola;
    return this;
  }

  /**
   * Get matricola
   * @return matricola
   **/
  @Schema(description = "")
  
    public String getMatricola() {
    return matricola;
  }

  public void setMatricola(String matricola) {
    this.matricola = matricola;
  }

  public Carriera listaEsami(List<Esame> listaEsami) {
    this.listaEsami = listaEsami;
    return this;
  }

  public Carriera addListaEsamiItem(Esame listaEsamiItem) {
    if (this.listaEsami == null) {
      this.listaEsami = new ArrayList<>();
    }
    this.listaEsami.add(listaEsamiItem);
    return this;
  }

  /**
   * Get listaEsami
   * @return listaEsami
   **/
  @Schema(description = "")
      @Valid
    public List<Esame> getListaEsami() {
    return listaEsami;
  }

  public void setListaEsami(List<Esame> listaEsami) {
    this.listaEsami = listaEsami;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Carriera carriera = (Carriera) o;
    return Objects.equals(this.matricola, carriera.matricola) &&
        Objects.equals(this.listaEsami, carriera.listaEsami);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matricola, listaEsami);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carriera {\n");
    
    sb.append("    matricola: ").append(toIndentedString(matricola)).append("\n");
    sb.append("    listaEsami: ").append(toIndentedString(listaEsami)).append("\n");
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
