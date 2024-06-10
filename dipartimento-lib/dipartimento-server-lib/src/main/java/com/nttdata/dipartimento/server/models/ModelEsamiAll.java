package com.nttdata.dipartimento.server.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.nttdata.dipartimento.server.models.ModelEsame;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ModelEsamiAll
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-07T16:05:14.866195200+02:00[Europe/Berlin]")


public class ModelEsamiAll   {
  @JsonProperty("listaEsami")
  @Valid
  private List<ModelEsame> listaEsami = null;

  public ModelEsamiAll listaEsami(List<ModelEsame> listaEsami) {
    this.listaEsami = listaEsami;
    return this;
  }

  public ModelEsamiAll addListaEsamiItem(ModelEsame listaEsamiItem) {
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
    public List<ModelEsame> getListaEsami() {
    return listaEsami;
  }

  public void setListaEsami(List<ModelEsame> listaEsami) {
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
    ModelEsamiAll modelEsamiAll = (ModelEsamiAll) o;
    return Objects.equals(this.listaEsami, modelEsamiAll.listaEsami);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listaEsami);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelEsamiAll {\n");
    
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
