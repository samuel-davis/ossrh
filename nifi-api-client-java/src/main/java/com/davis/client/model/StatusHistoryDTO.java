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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * StatusHistoryDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-14T11:52:34.905+11:00")
public class StatusHistoryDTO {
  @SerializedName("generated")
  private DateTime generated = null;

  @SerializedName("componentDetails")
  private Map<String, String> componentDetails = new HashMap<String, String>();

  @SerializedName("fieldDescriptors")
  private List<StatusDescriptorDTO> fieldDescriptors = new ArrayList<StatusDescriptorDTO>();

  @SerializedName("aggregateSnapshots")
  private List<StatusSnapshotDTO> aggregateSnapshots = new ArrayList<StatusSnapshotDTO>();

  @SerializedName("nodeSnapshots")
  private List<NodeStatusSnapshotsDTO> nodeSnapshots = new ArrayList<NodeStatusSnapshotsDTO>();

  public StatusHistoryDTO generated(DateTime generated) {
    this.generated = generated;
    return this;
  }

   /**
   * When the status history was generated.
   * @return generated
  **/
  @ApiModelProperty(example = "null", value = "When the status history was generated.")
  public DateTime getGenerated() {
    return generated;
  }

  public void setGenerated(DateTime generated) {
    this.generated = generated;
  }

  public StatusHistoryDTO componentDetails(Map<String, String> componentDetails) {
    this.componentDetails = componentDetails;
    return this;
  }

  public StatusHistoryDTO putComponentDetailsItem(String key, String componentDetailsItem) {
    this.componentDetails.put(key, componentDetailsItem);
    return this;
  }

   /**
   * A Map of key/value pairs that describe the component that the status history belongs to
   * @return componentDetails
  **/
  @ApiModelProperty(example = "null", value = "A Map of key/value pairs that describe the component that the status history belongs to")
  public Map<String, String> getComponentDetails() {
    return componentDetails;
  }

  public void setComponentDetails(Map<String, String> componentDetails) {
    this.componentDetails = componentDetails;
  }

  public StatusHistoryDTO fieldDescriptors(List<StatusDescriptorDTO> fieldDescriptors) {
    this.fieldDescriptors = fieldDescriptors;
    return this;
  }

  public StatusHistoryDTO addFieldDescriptorsItem(StatusDescriptorDTO fieldDescriptorsItem) {
    this.fieldDescriptors.add(fieldDescriptorsItem);
    return this;
  }

   /**
   * The Descriptors that provide information on each of the metrics provided in the status history
   * @return fieldDescriptors
  **/
  @ApiModelProperty(example = "null", value = "The Descriptors that provide information on each of the metrics provided in the status history")
  public List<StatusDescriptorDTO> getFieldDescriptors() {
    return fieldDescriptors;
  }

  public void setFieldDescriptors(List<StatusDescriptorDTO> fieldDescriptors) {
    this.fieldDescriptors = fieldDescriptors;
  }

  public StatusHistoryDTO aggregateSnapshots(List<StatusSnapshotDTO> aggregateSnapshots) {
    this.aggregateSnapshots = aggregateSnapshots;
    return this;
  }

  public StatusHistoryDTO addAggregateSnapshotsItem(StatusSnapshotDTO aggregateSnapshotsItem) {
    this.aggregateSnapshots.add(aggregateSnapshotsItem);
    return this;
  }

   /**
   * A list of StatusSnapshotDTO objects that provide the actual metric values for the component. If the NiFi instance is clustered, this will represent the aggregate status across all nodes. If the NiFi instance is not clustered, this will represent the status of the entire NiFi instance.
   * @return aggregateSnapshots
  **/
  @ApiModelProperty(example = "null", value = "A list of StatusSnapshotDTO objects that provide the actual metric values for the component. If the NiFi instance is clustered, this will represent the aggregate status across all nodes. If the NiFi instance is not clustered, this will represent the status of the entire NiFi instance.")
  public List<StatusSnapshotDTO> getAggregateSnapshots() {
    return aggregateSnapshots;
  }

  public void setAggregateSnapshots(List<StatusSnapshotDTO> aggregateSnapshots) {
    this.aggregateSnapshots = aggregateSnapshots;
  }

  public StatusHistoryDTO nodeSnapshots(List<NodeStatusSnapshotsDTO> nodeSnapshots) {
    this.nodeSnapshots = nodeSnapshots;
    return this;
  }

  public StatusHistoryDTO addNodeSnapshotsItem(NodeStatusSnapshotsDTO nodeSnapshotsItem) {
    this.nodeSnapshots.add(nodeSnapshotsItem);
    return this;
  }

   /**
   * The NodeStatusSnapshotsDTO objects that provide the actual metric values for the component, for each node. If the NiFi instance is not clustered, this value will be null.
   * @return nodeSnapshots
  **/
  @ApiModelProperty(example = "null", value = "The NodeStatusSnapshotsDTO objects that provide the actual metric values for the component, for each node. If the NiFi instance is not clustered, this value will be null.")
  public List<NodeStatusSnapshotsDTO> getNodeSnapshots() {
    return nodeSnapshots;
  }

  public void setNodeSnapshots(List<NodeStatusSnapshotsDTO> nodeSnapshots) {
    this.nodeSnapshots = nodeSnapshots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusHistoryDTO statusHistoryDTO = (StatusHistoryDTO) o;
    return Objects.equals(this.generated, statusHistoryDTO.generated) &&
        Objects.equals(this.componentDetails, statusHistoryDTO.componentDetails) &&
        Objects.equals(this.fieldDescriptors, statusHistoryDTO.fieldDescriptors) &&
        Objects.equals(this.aggregateSnapshots, statusHistoryDTO.aggregateSnapshots) &&
        Objects.equals(this.nodeSnapshots, statusHistoryDTO.nodeSnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generated, componentDetails, fieldDescriptors, aggregateSnapshots, nodeSnapshots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusHistoryDTO {\n");
    
    sb.append("    generated: ").append(toIndentedString(generated)).append("\n");
    sb.append("    componentDetails: ").append(toIndentedString(componentDetails)).append("\n");
    sb.append("    fieldDescriptors: ").append(toIndentedString(fieldDescriptors)).append("\n");
    sb.append("    aggregateSnapshots: ").append(toIndentedString(aggregateSnapshots)).append("\n");
    sb.append("    nodeSnapshots: ").append(toIndentedString(nodeSnapshots)).append("\n");
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

