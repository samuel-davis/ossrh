/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.davis.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * PeerDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-14T11:52:34.905+11:00")
public class PeerDTO {
  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("secure")
  private Boolean secure = false;

  @SerializedName("flowFileCount")
  private Integer flowFileCount = null;

  public PeerDTO hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * The hostname of this peer.
   * @return hostname
  **/
  @ApiModelProperty(example = "null", value = "The hostname of this peer.")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public PeerDTO port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * The port number of this peer.
   * @return port
  **/
  @ApiModelProperty(example = "null", value = "The port number of this peer.")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public PeerDTO secure(Boolean secure) {
    this.secure = secure;
    return this;
  }

   /**
   * Returns if this peer connection is secure.
   * @return secure
  **/
  @ApiModelProperty(example = "null", value = "Returns if this peer connection is secure.")
  public Boolean getSecure() {
    return secure;
  }

  public void setSecure(Boolean secure) {
    this.secure = secure;
  }

  public PeerDTO flowFileCount(Integer flowFileCount) {
    this.flowFileCount = flowFileCount;
    return this;
  }

   /**
   * The number of flowFiles this peer holds.
   * @return flowFileCount
  **/
  @ApiModelProperty(example = "null", value = "The number of flowFiles this peer holds.")
  public Integer getFlowFileCount() {
    return flowFileCount;
  }

  public void setFlowFileCount(Integer flowFileCount) {
    this.flowFileCount = flowFileCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeerDTO peerDTO = (PeerDTO) o;
    return Objects.equals(this.hostname, peerDTO.hostname) &&
        Objects.equals(this.port, peerDTO.port) &&
        Objects.equals(this.secure, peerDTO.secure) &&
        Objects.equals(this.flowFileCount, peerDTO.flowFileCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, port, secure, flowFileCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeerDTO {\n");
    
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
    sb.append("    flowFileCount: ").append(toIndentedString(flowFileCount)).append("\n");
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

