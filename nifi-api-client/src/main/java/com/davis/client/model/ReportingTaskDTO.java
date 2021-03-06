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

/**
 * ReportingTaskDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-14T11:52:34.905+11:00")
public class ReportingTaskDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("parentGroupId")
  private String parentGroupId = null;

  @SerializedName("position")
  private PositionDTO position = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  /**
   * The state of the reporting task.
   */
  public enum StateEnum {
    @SerializedName("RUNNING")
    RUNNING("RUNNING"),
    
    @SerializedName("STOPPED")
    STOPPED("STOPPED"),
    
    @SerializedName("DISABLED")
    DISABLED("DISABLED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("persistsState")
  private Boolean persistsState = false;

  @SerializedName("schedulingPeriod")
  private String schedulingPeriod = null;

  @SerializedName("schedulingStrategy")
  private String schedulingStrategy = null;

  @SerializedName("defaultSchedulingPeriod")
  private Map<String, String> defaultSchedulingPeriod = new HashMap<String, String>();

  @SerializedName("properties")
  private Map<String, String> properties = new HashMap<String, String>();

  @SerializedName("descriptors")
  private Map<String, PropertyDescriptorDTO> descriptors = new HashMap<String, PropertyDescriptorDTO>();

  @SerializedName("customUiUrl")
  private String customUiUrl = null;

  @SerializedName("annotationData")
  private String annotationData = null;

  @SerializedName("validationErrors")
  private List<String> validationErrors = new ArrayList<String>();

  @SerializedName("activeThreadCount")
  private Integer activeThreadCount = null;

  public ReportingTaskDTO id(String id) {
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

  public ReportingTaskDTO parentGroupId(String parentGroupId) {
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

  public ReportingTaskDTO position(PositionDTO position) {
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

  public ReportingTaskDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the reporting task.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the reporting task.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReportingTaskDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The fully qualified type of the reporting task.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "The fully qualified type of the reporting task.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ReportingTaskDTO state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The state of the reporting task.
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "The state of the reporting task.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public ReportingTaskDTO comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * The comments of the reporting task.
   * @return comments
  **/
  @ApiModelProperty(example = "null", value = "The comments of the reporting task.")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public ReportingTaskDTO persistsState(Boolean persistsState) {
    this.persistsState = persistsState;
    return this;
  }

   /**
   * Whether the reporting task persists state.
   * @return persistsState
  **/
  @ApiModelProperty(example = "null", value = "Whether the reporting task persists state.")
  public Boolean getPersistsState() {
    return persistsState;
  }

  public void setPersistsState(Boolean persistsState) {
    this.persistsState = persistsState;
  }

  public ReportingTaskDTO schedulingPeriod(String schedulingPeriod) {
    this.schedulingPeriod = schedulingPeriod;
    return this;
  }

   /**
   * The frequency with which to schedule the reporting task. The format of the value willd epend on the valud of the schedulingStrategy.
   * @return schedulingPeriod
  **/
  @ApiModelProperty(example = "null", value = "The frequency with which to schedule the reporting task. The format of the value willd epend on the valud of the schedulingStrategy.")
  public String getSchedulingPeriod() {
    return schedulingPeriod;
  }

  public void setSchedulingPeriod(String schedulingPeriod) {
    this.schedulingPeriod = schedulingPeriod;
  }

  public ReportingTaskDTO schedulingStrategy(String schedulingStrategy) {
    this.schedulingStrategy = schedulingStrategy;
    return this;
  }

   /**
   * The scheduling strategy that determines how the schedulingPeriod value should be interpreted.
   * @return schedulingStrategy
  **/
  @ApiModelProperty(example = "null", value = "The scheduling strategy that determines how the schedulingPeriod value should be interpreted.")
  public String getSchedulingStrategy() {
    return schedulingStrategy;
  }

  public void setSchedulingStrategy(String schedulingStrategy) {
    this.schedulingStrategy = schedulingStrategy;
  }

  public ReportingTaskDTO defaultSchedulingPeriod(Map<String, String> defaultSchedulingPeriod) {
    this.defaultSchedulingPeriod = defaultSchedulingPeriod;
    return this;
  }

  public ReportingTaskDTO putDefaultSchedulingPeriodItem(String key, String defaultSchedulingPeriodItem) {
    this.defaultSchedulingPeriod.put(key, defaultSchedulingPeriodItem);
    return this;
  }

   /**
   * The default scheduling period for the different scheduling strategies.
   * @return defaultSchedulingPeriod
  **/
  @ApiModelProperty(example = "null", value = "The default scheduling period for the different scheduling strategies.")
  public Map<String, String> getDefaultSchedulingPeriod() {
    return defaultSchedulingPeriod;
  }

  public void setDefaultSchedulingPeriod(Map<String, String> defaultSchedulingPeriod) {
    this.defaultSchedulingPeriod = defaultSchedulingPeriod;
  }

  public ReportingTaskDTO properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public ReportingTaskDTO putPropertiesItem(String key, String propertiesItem) {
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The properties of the reporting task.
   * @return properties
  **/
  @ApiModelProperty(example = "null", value = "The properties of the reporting task.")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public ReportingTaskDTO descriptors(Map<String, PropertyDescriptorDTO> descriptors) {
    this.descriptors = descriptors;
    return this;
  }

  public ReportingTaskDTO putDescriptorsItem(String key, PropertyDescriptorDTO descriptorsItem) {
    this.descriptors.put(key, descriptorsItem);
    return this;
  }

   /**
   * The descriptors for the reporting tasks properties.
   * @return descriptors
  **/
  @ApiModelProperty(example = "null", value = "The descriptors for the reporting tasks properties.")
  public Map<String, PropertyDescriptorDTO> getDescriptors() {
    return descriptors;
  }

  public void setDescriptors(Map<String, PropertyDescriptorDTO> descriptors) {
    this.descriptors = descriptors;
  }

  public ReportingTaskDTO customUiUrl(String customUiUrl) {
    this.customUiUrl = customUiUrl;
    return this;
  }

   /**
   * The URL for the custom configuration UI for the reporting task.
   * @return customUiUrl
  **/
  @ApiModelProperty(example = "null", value = "The URL for the custom configuration UI for the reporting task.")
  public String getCustomUiUrl() {
    return customUiUrl;
  }

  public void setCustomUiUrl(String customUiUrl) {
    this.customUiUrl = customUiUrl;
  }

  public ReportingTaskDTO annotationData(String annotationData) {
    this.annotationData = annotationData;
    return this;
  }

   /**
   * The anntation data for the repoting task. This is how the custom UI relays configuration to the reporting task.
   * @return annotationData
  **/
  @ApiModelProperty(example = "null", value = "The anntation data for the repoting task. This is how the custom UI relays configuration to the reporting task.")
  public String getAnnotationData() {
    return annotationData;
  }

  public void setAnnotationData(String annotationData) {
    this.annotationData = annotationData;
  }

  public ReportingTaskDTO validationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public ReportingTaskDTO addValidationErrorsItem(String validationErrorsItem) {
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * Gets the validation errors from the reporting task. These validation errors represent the problems with the reporting task that must be resolved before it can be scheduled to run.
   * @return validationErrors
  **/
  @ApiModelProperty(example = "null", value = "Gets the validation errors from the reporting task. These validation errors represent the problems with the reporting task that must be resolved before it can be scheduled to run.")
  public List<String> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
  }

  public ReportingTaskDTO activeThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
    return this;
  }

   /**
   * The number of active threads for the reporting task.
   * @return activeThreadCount
  **/
  @ApiModelProperty(example = "null", value = "The number of active threads for the reporting task.")
  public Integer getActiveThreadCount() {
    return activeThreadCount;
  }

  public void setActiveThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTaskDTO reportingTaskDTO = (ReportingTaskDTO) o;
    return Objects.equals(this.id, reportingTaskDTO.id) &&
        Objects.equals(this.parentGroupId, reportingTaskDTO.parentGroupId) &&
        Objects.equals(this.position, reportingTaskDTO.position) &&
        Objects.equals(this.name, reportingTaskDTO.name) &&
        Objects.equals(this.type, reportingTaskDTO.type) &&
        Objects.equals(this.state, reportingTaskDTO.state) &&
        Objects.equals(this.comments, reportingTaskDTO.comments) &&
        Objects.equals(this.persistsState, reportingTaskDTO.persistsState) &&
        Objects.equals(this.schedulingPeriod, reportingTaskDTO.schedulingPeriod) &&
        Objects.equals(this.schedulingStrategy, reportingTaskDTO.schedulingStrategy) &&
        Objects.equals(this.defaultSchedulingPeriod, reportingTaskDTO.defaultSchedulingPeriod) &&
        Objects.equals(this.properties, reportingTaskDTO.properties) &&
        Objects.equals(this.descriptors, reportingTaskDTO.descriptors) &&
        Objects.equals(this.customUiUrl, reportingTaskDTO.customUiUrl) &&
        Objects.equals(this.annotationData, reportingTaskDTO.annotationData) &&
        Objects.equals(this.validationErrors, reportingTaskDTO.validationErrors) &&
        Objects.equals(this.activeThreadCount, reportingTaskDTO.activeThreadCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentGroupId, position, name, type, state, comments, persistsState, schedulingPeriod, schedulingStrategy, defaultSchedulingPeriod, properties, descriptors, customUiUrl, annotationData, validationErrors, activeThreadCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTaskDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    persistsState: ").append(toIndentedString(persistsState)).append("\n");
    sb.append("    schedulingPeriod: ").append(toIndentedString(schedulingPeriod)).append("\n");
    sb.append("    schedulingStrategy: ").append(toIndentedString(schedulingStrategy)).append("\n");
    sb.append("    defaultSchedulingPeriod: ").append(toIndentedString(defaultSchedulingPeriod)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    descriptors: ").append(toIndentedString(descriptors)).append("\n");
    sb.append("    customUiUrl: ").append(toIndentedString(customUiUrl)).append("\n");
    sb.append("    annotationData: ").append(toIndentedString(annotationData)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("    activeThreadCount: ").append(toIndentedString(activeThreadCount)).append("\n");
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

