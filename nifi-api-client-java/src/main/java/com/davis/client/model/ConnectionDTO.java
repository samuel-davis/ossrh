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

import java.util.ArrayList;
import java.util.List;

/**
 * ConnectionDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-14T11:52:34.905+11:00")
public class ConnectionDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("parentGroupId")
  private String parentGroupId = null;

  @SerializedName("position")
  private PositionDTO position = null;

  @SerializedName("source")
  private ConnectableDTO source = null;

  @SerializedName("destination")
  private ConnectableDTO destination = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("labelIndex")
  private Integer labelIndex = null;

  @SerializedName("getzIndex")
  private Long getzIndex = null;

  @SerializedName("selectedRelationships")
  private List<String> selectedRelationships = new ArrayList<String>();

  @SerializedName("availableRelationships")
  private List<String> availableRelationships = new ArrayList<String>();

  @SerializedName("backPressureObjectThreshold")
  private Long backPressureObjectThreshold = null;

  @SerializedName("backPressureDataSizeThreshold")
  private String backPressureDataSizeThreshold = null;

  @SerializedName("flowFileExpiration")
  private String flowFileExpiration = null;

  @SerializedName("prioritizers")
  private List<String> prioritizers = new ArrayList<String>();

  @SerializedName("bends")
  private List<PositionDTO> bends = new ArrayList<PositionDTO>();

  public ConnectionDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the component.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the component.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConnectionDTO parentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
    return this;
  }

   /**
   * The id of parent process group of this component if applicable.
   * @return parentGroupId
  **/
  @ApiModelProperty(example = "null", value = "The id of parent process group of this component if applicable.")
  public String getParentGroupId() {
    return parentGroupId;
  }

  public void setParentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
  }

  public ConnectionDTO position(PositionDTO position) {
    this.position = position;
    return this;
  }

   /**
   * The position of this component in the UI if applicable.
   * @return position
  **/
  @ApiModelProperty(example = "null", value = "The position of this component in the UI if applicable.")
  public PositionDTO getPosition() {
    return position;
  }

  public void setPosition(PositionDTO position) {
    this.position = position;
  }

  public ConnectionDTO source(ConnectableDTO source) {
    this.source = source;
    return this;
  }

   /**
   * The source of the connection.
   * @return source
  **/
  @ApiModelProperty(example = "null", value = "The source of the connection.")
  public ConnectableDTO getSource() {
    return source;
  }

  public void setSource(ConnectableDTO source) {
    this.source = source;
  }

  public ConnectionDTO destination(ConnectableDTO destination) {
    this.destination = destination;
    return this;
  }

   /**
   * The destination of the connection.
   * @return destination
  **/
  @ApiModelProperty(example = "null", value = "The destination of the connection.")
  public ConnectableDTO getDestination() {
    return destination;
  }

  public void setDestination(ConnectableDTO destination) {
    this.destination = destination;
  }

  public ConnectionDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the connection.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the connection.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConnectionDTO labelIndex(Integer labelIndex) {
    this.labelIndex = labelIndex;
    return this;
  }

   /**
   * The index of the bend point where to place the connection label.
   * @return labelIndex
  **/
  @ApiModelProperty(example = "null", value = "The index of the bend point where to place the connection label.")
  public Integer getLabelIndex() {
    return labelIndex;
  }

  public void setLabelIndex(Integer labelIndex) {
    this.labelIndex = labelIndex;
  }

  public ConnectionDTO getzIndex(Long getzIndex) {
    this.getzIndex = getzIndex;
    return this;
  }

   /**
   * The z index of the connection.
   * @return getzIndex
  **/
  @ApiModelProperty(example = "null", value = "The z index of the connection.")
  public Long getGetzIndex() {
    return getzIndex;
  }

  public void setGetzIndex(Long getzIndex) {
    this.getzIndex = getzIndex;
  }

  public ConnectionDTO selectedRelationships(List<String> selectedRelationships) {
    this.selectedRelationships = selectedRelationships;
    return this;
  }

  public ConnectionDTO addSelectedRelationshipsItem(String selectedRelationshipsItem) {
    this.selectedRelationships.add(selectedRelationshipsItem);
    return this;
  }

   /**
   * The selected relationship that comprise the connection.
   * @return selectedRelationships
  **/
  @ApiModelProperty(example = "null", value = "The selected relationship that comprise the connection.")
  public List<String> getSelectedRelationships() {
    return selectedRelationships;
  }

  public void setSelectedRelationships(List<String> selectedRelationships) {
    this.selectedRelationships = selectedRelationships;
  }

  public ConnectionDTO availableRelationships(List<String> availableRelationships) {
    this.availableRelationships = availableRelationships;
    return this;
  }

  public ConnectionDTO addAvailableRelationshipsItem(String availableRelationshipsItem) {
    this.availableRelationships.add(availableRelationshipsItem);
    return this;
  }

   /**
   * The relationships that the source of the connection currently supports.
   * @return availableRelationships
  **/
  @ApiModelProperty(example = "null", value = "The relationships that the source of the connection currently supports.")
  public List<String> getAvailableRelationships() {
    return availableRelationships;
  }

  public void setAvailableRelationships(List<String> availableRelationships) {
    this.availableRelationships = availableRelationships;
  }

  public ConnectionDTO backPressureObjectThreshold(Long backPressureObjectThreshold) {
    this.backPressureObjectThreshold = backPressureObjectThreshold;
    return this;
  }

   /**
   * The object count threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won't impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue.
   * @return backPressureObjectThreshold
  **/
  @ApiModelProperty(example = "null", value = "The object count threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won't impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue.")
  public Long getBackPressureObjectThreshold() {
    return backPressureObjectThreshold;
  }

  public void setBackPressureObjectThreshold(Long backPressureObjectThreshold) {
    this.backPressureObjectThreshold = backPressureObjectThreshold;
  }

  public ConnectionDTO backPressureDataSizeThreshold(String backPressureDataSizeThreshold) {
    this.backPressureDataSizeThreshold = backPressureDataSizeThreshold;
    return this;
  }

   /**
   * The object data size threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won't impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue.
   * @return backPressureDataSizeThreshold
  **/
  @ApiModelProperty(example = "null", value = "The object data size threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won't impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue.")
  public String getBackPressureDataSizeThreshold() {
    return backPressureDataSizeThreshold;
  }

  public void setBackPressureDataSizeThreshold(String backPressureDataSizeThreshold) {
    this.backPressureDataSizeThreshold = backPressureDataSizeThreshold;
  }

  public ConnectionDTO flowFileExpiration(String flowFileExpiration) {
    this.flowFileExpiration = flowFileExpiration;
    return this;
  }

   /**
   * The amount of time a flow file may be in the flow before it will be automatically aged out of the flow. Once a flow file reaches this age it will be terminated from the flow the next time a processor attempts to start work on it.
   * @return flowFileExpiration
  **/
  @ApiModelProperty(example = "null", value = "The amount of time a flow file may be in the flow before it will be automatically aged out of the flow. Once a flow file reaches this age it will be terminated from the flow the next time a processor attempts to start work on it.")
  public String getFlowFileExpiration() {
    return flowFileExpiration;
  }

  public void setFlowFileExpiration(String flowFileExpiration) {
    this.flowFileExpiration = flowFileExpiration;
  }

  public ConnectionDTO prioritizers(List<String> prioritizers) {
    this.prioritizers = prioritizers;
    return this;
  }

  public ConnectionDTO addPrioritizersItem(String prioritizersItem) {
    this.prioritizers.add(prioritizersItem);
    return this;
  }

   /**
   * The comparators used to prioritize the queue.
   * @return prioritizers
  **/
  @ApiModelProperty(example = "null", value = "The comparators used to prioritize the queue.")
  public List<String> getPrioritizers() {
    return prioritizers;
  }

  public void setPrioritizers(List<String> prioritizers) {
    this.prioritizers = prioritizers;
  }

  public ConnectionDTO bends(List<PositionDTO> bends) {
    this.bends = bends;
    return this;
  }

  public ConnectionDTO addBendsItem(PositionDTO bendsItem) {
    this.bends.add(bendsItem);
    return this;
  }

   /**
   * The bend points on the connection.
   * @return bends
  **/
  @ApiModelProperty(example = "null", value = "The bend points on the connection.")
  public List<PositionDTO> getBends() {
    return bends;
  }

  public void setBends(List<PositionDTO> bends) {
    this.bends = bends;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionDTO connectionDTO = (ConnectionDTO) o;
    return Objects.equals(this.id, connectionDTO.id) &&
        Objects.equals(this.parentGroupId, connectionDTO.parentGroupId) &&
        Objects.equals(this.position, connectionDTO.position) &&
        Objects.equals(this.source, connectionDTO.source) &&
        Objects.equals(this.destination, connectionDTO.destination) &&
        Objects.equals(this.name, connectionDTO.name) &&
        Objects.equals(this.labelIndex, connectionDTO.labelIndex) &&
        Objects.equals(this.getzIndex, connectionDTO.getzIndex) &&
        Objects.equals(this.selectedRelationships, connectionDTO.selectedRelationships) &&
        Objects.equals(this.availableRelationships, connectionDTO.availableRelationships) &&
        Objects.equals(this.backPressureObjectThreshold, connectionDTO.backPressureObjectThreshold) &&
        Objects.equals(this.backPressureDataSizeThreshold, connectionDTO.backPressureDataSizeThreshold) &&
        Objects.equals(this.flowFileExpiration, connectionDTO.flowFileExpiration) &&
        Objects.equals(this.prioritizers, connectionDTO.prioritizers) &&
        Objects.equals(this.bends, connectionDTO.bends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentGroupId, position, source, destination, name, labelIndex, getzIndex, selectedRelationships, availableRelationships, backPressureObjectThreshold, backPressureDataSizeThreshold, flowFileExpiration, prioritizers, bends);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labelIndex: ").append(toIndentedString(labelIndex)).append("\n");
    sb.append("    getzIndex: ").append(toIndentedString(getzIndex)).append("\n");
    sb.append("    selectedRelationships: ").append(toIndentedString(selectedRelationships)).append("\n");
    sb.append("    availableRelationships: ").append(toIndentedString(availableRelationships)).append("\n");
    sb.append("    backPressureObjectThreshold: ").append(toIndentedString(backPressureObjectThreshold)).append("\n");
    sb.append("    backPressureDataSizeThreshold: ").append(toIndentedString(backPressureDataSizeThreshold)).append("\n");
    sb.append("    flowFileExpiration: ").append(toIndentedString(flowFileExpiration)).append("\n");
    sb.append("    prioritizers: ").append(toIndentedString(prioritizers)).append("\n");
    sb.append("    bends: ").append(toIndentedString(bends)).append("\n");
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

