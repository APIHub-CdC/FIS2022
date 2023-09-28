package com.cdc.apihub.mx.fis2022.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;


public class ResponseScore {
  @SerializedName("ScoreNoHit")
  private ScoreNoHit scoreNoHit = null;
  public ResponseScore scoreNoHit(ScoreNoHit scoreNoHit) {
    this.scoreNoHit = scoreNoHit;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ScoreNoHit getScoreNoHit() {
    return scoreNoHit;
  }
  public void setScoreNoHit(ScoreNoHit scoreNoHit) {
    this.scoreNoHit = scoreNoHit;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseScore responseScore = (ResponseScore) o;
    return Objects.equals(this.scoreNoHit, responseScore.scoreNoHit);
  }
  @Override
  public int hashCode() {
    return Objects.hash(scoreNoHit);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseScore {\n");
    
    sb.append("    scoreNoHit: ").append(toIndentedString(scoreNoHit)).append("\n");
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
