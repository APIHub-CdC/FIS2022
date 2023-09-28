package com.cdc.apihub.mx.fis2022.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;


public class RequestFolios {
  @SerializedName("folioOtorgante")
  private String folioOtorgante = null;
  @SerializedName("folioConsulta")
  private String folioConsulta = null;
  public RequestFolios folioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
    return this;
  }
   
  @ApiModelProperty(example = "1.2345678E7", required = true, value = "folioO")
  public String getFolioOtorgante() {
    return folioOtorgante;
  }
  public void setFolioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
  }
  public RequestFolios folioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
    return this;
  }
   
  @ApiModelProperty(example = "2.4689013E7", required = true, value = "folioC")
  public String getFolioConsulta() {
    return folioConsulta;
  }
  public void setFolioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestFolios requestFolios = (RequestFolios) o;
    return Objects.equals(this.folioOtorgante, requestFolios.folioOtorgante) &&
        Objects.equals(this.folioConsulta, requestFolios.folioConsulta);
  }
  @Override
  public int hashCode() {
    return Objects.hash(folioOtorgante, folioConsulta);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestFolios {\n");
    
    sb.append("    folioOtorgante: ").append(toIndentedString(folioOtorgante)).append("\n");
    sb.append("    folioConsulta: ").append(toIndentedString(folioConsulta)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
