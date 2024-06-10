package com.nttdata.dipartimento.server.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.nttdata.dipartimento.server.models.ModelEsamiAll;
import com.nttdata.dipartimento.server.models.ResponseBase;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseEsami
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-07T16:05:14.866195200+02:00[Europe/Berlin]")


public class ResponseEsami extends ResponseBase  {
  @JsonProperty("returnValue")
  private ModelEsamiAll returnValue = null;

  public ResponseEsami returnValue(ModelEsamiAll returnValue) {
    this.returnValue = returnValue;
    return this;
  }

  /**
   * Get returnValue
   * @return returnValue
   **/
  @Schema(description = "")
  
    @Valid
    public ModelEsamiAll getReturnValue() {
    return returnValue;
  }

  public void setReturnValue(ModelEsamiAll returnValue) {
    this.returnValue = returnValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseEsami responseEsami = (ResponseEsami) o;
    return Objects.equals(this.returnValue, responseEsami.returnValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnValue, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseEsami {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    returnValue: ").append(toIndentedString(returnValue)).append("\n");
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
