/*
 * Azure Blockchain Workbench REST API
 * The Azure Blockchain Workbench REST API is a Workbench extensibility point, which allows developers to create and manage blockchain applications, manage users and organizations within a consortium, integrate blockchain applications into services and platforms, perform transactions on a blockchain, and retrieve transactional and contract data from a blockchain.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * ContractCode
 */

public class ContractCode {
  @SerializedName("contractCodeID")
  private Integer contractCodeID = null;

  @SerializedName("ledgerID")
  private Integer ledgerID = null;

  @SerializedName("createdByUserId")
  private Integer createdByUserId = null;

  @SerializedName("createdDtTm")
  private DateTime createdDtTm = null;

  public ContractCode contractCodeID(Integer contractCodeID) {
    this.contractCodeID = contractCodeID;
    return this;
  }

   /**
   * Get contractCodeID
   * @return contractCodeID
  **/
  @ApiModelProperty(value = "")
  public Integer getContractCodeID() {
    return contractCodeID;
  }

  public void setContractCodeID(Integer contractCodeID) {
    this.contractCodeID = contractCodeID;
  }

  public ContractCode ledgerID(Integer ledgerID) {
    this.ledgerID = ledgerID;
    return this;
  }

   /**
   * Get ledgerID
   * @return ledgerID
  **/
  @ApiModelProperty(value = "")
  public Integer getLedgerID() {
    return ledgerID;
  }

  public void setLedgerID(Integer ledgerID) {
    this.ledgerID = ledgerID;
  }

  public ContractCode createdByUserId(Integer createdByUserId) {
    this.createdByUserId = createdByUserId;
    return this;
  }

   /**
   * Get createdByUserId
   * @return createdByUserId
  **/
  @ApiModelProperty(value = "")
  public Integer getCreatedByUserId() {
    return createdByUserId;
  }

  public void setCreatedByUserId(Integer createdByUserId) {
    this.createdByUserId = createdByUserId;
  }

  public ContractCode createdDtTm(DateTime createdDtTm) {
    this.createdDtTm = createdDtTm;
    return this;
  }

   /**
   * Get createdDtTm
   * @return createdDtTm
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreatedDtTm() {
    return createdDtTm;
  }

  public void setCreatedDtTm(DateTime createdDtTm) {
    this.createdDtTm = createdDtTm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractCode contractCode = (ContractCode) o;
    return Objects.equals(this.contractCodeID, contractCode.contractCodeID) &&
        Objects.equals(this.ledgerID, contractCode.ledgerID) &&
        Objects.equals(this.createdByUserId, contractCode.createdByUserId) &&
        Objects.equals(this.createdDtTm, contractCode.createdDtTm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractCodeID, ledgerID, createdByUserId, createdDtTm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractCode {\n");
    
    sb.append("    contractCodeID: ").append(toIndentedString(contractCodeID)).append("\n");
    sb.append("    ledgerID: ").append(toIndentedString(ledgerID)).append("\n");
    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    sb.append("    createdDtTm: ").append(toIndentedString(createdDtTm)).append("\n");
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

