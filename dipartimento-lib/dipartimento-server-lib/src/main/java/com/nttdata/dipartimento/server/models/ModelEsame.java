package com.nttdata.dipartimento.server.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ModelEsame
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-07T16:05:14.866195200+02:00[Europe/Berlin]")


public class ModelEsame   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("cfu")
  private Integer cfu = null;

  public ModelEsame id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ModelEsame nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Get nome
   * @return nome
   **/
  @Schema(description = "")
  
    public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ModelEsame cfu(Integer cfu) {
    this.cfu = cfu;
    return this;
  }

  /**
   * Get cfu
   * @return cfu
   **/
  @Schema(description = "")
  
    public Integer getCfu() {
    return cfu;
  }

  public void setCfu(Integer cfu) {
    this.cfu = cfu;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelEsame modelEsame = (ModelEsame) o;
    return Objects.equals(this.id, modelEsame.id) &&
        Objects.equals(this.nome, modelEsame.nome) &&
        Objects.equals(this.cfu, modelEsame.cfu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, cfu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelEsame {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cfu: ").append(toIndentedString(cfu)).append("\n");
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
