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

import org.joda.time.DateTime;

/**
 * LineageDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-14T11:52:34.905+11:00")
public class LineageDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("submissionTime")
  private DateTime submissionTime = null;

  @SerializedName("expiration")
  private DateTime expiration = null;

  @SerializedName("percentCompleted")
  private Integer percentCompleted = null;

  @SerializedName("finished")
  private Boolean finished = false;

  @SerializedName("request")
  private LineageRequestDTO request = null;

  @SerializedName("results")
  private LineageResultsDTO results = null;

  public LineageDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of this lineage query.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of this lineage query.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LineageDTO uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The URI for this lineage query for later retrieval and deletion.
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "The URI for this lineage query for later retrieval and deletion.")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public LineageDTO submissionTime(DateTime submissionTime) {
    this.submissionTime = submissionTime;
    return this;
  }

   /**
   * When the lineage query was submitted.
   * @return submissionTime
  **/
  @ApiModelProperty(example = "null", value = "When the lineage query was submitted.")
  public DateTime getSubmissionTime() {
    return submissionTime;
  }

  public void setSubmissionTime(DateTime submissionTime) {
    this.submissionTime = submissionTime;
  }

  public LineageDTO expiration(DateTime expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * When the lineage query will expire.
   * @return expiration
  **/
  @ApiModelProperty(example = "null", value = "When the lineage query will expire.")
  public DateTime getExpiration() {
    return expiration;
  }

  public void setExpiration(DateTime expiration) {
    this.expiration = expiration;
  }

  public LineageDTO percentCompleted(Integer percentCompleted) {
    this.percentCompleted = percentCompleted;
    return this;
  }

   /**
   * The percent complete for the lineage query.
   * @return percentCompleted
  **/
  @ApiModelProperty(example = "null", value = "The percent complete for the lineage query.")
  public Integer getPercentCompleted() {
    return percentCompleted;
  }

  public void setPercentCompleted(Integer percentCompleted) {
    this.percentCompleted = percentCompleted;
  }

  public LineageDTO finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

   /**
   * Whether the lineage query has finished.
   * @return finished
  **/
  @ApiModelProperty(example = "null", value = "Whether the lineage query has finished.")
  public Boolean getFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }

  public LineageDTO request(LineageRequestDTO request) {
    this.request = request;
    return this;
  }

   /**
   * The initial lineage result.
   * @return request
  **/
  @ApiModelProperty(example = "null", value = "The initial lineage result.")
  public LineageRequestDTO getRequest() {
    return request;
  }

  public void setRequest(LineageRequestDTO request) {
    this.request = request;
  }

  public LineageDTO results(LineageResultsDTO results) {
    this.results = results;
    return this;
  }

   /**
   * The results of the lineage query.
   * @return results
  **/
  @ApiModelProperty(example = "null", value = "The results of the lineage query.")
  public LineageResultsDTO getResults() {
    return results;
  }

  public void setResults(LineageResultsDTO results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineageDTO lineageDTO = (LineageDTO) o;
    return Objects.equals(this.id, lineageDTO.id) &&
        Objects.equals(this.uri, lineageDTO.uri) &&
        Objects.equals(this.submissionTime, lineageDTO.submissionTime) &&
        Objects.equals(this.expiration, lineageDTO.expiration) &&
        Objects.equals(this.percentCompleted, lineageDTO.percentCompleted) &&
        Objects.equals(this.finished, lineageDTO.finished) &&
        Objects.equals(this.request, lineageDTO.request) &&
        Objects.equals(this.results, lineageDTO.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, submissionTime, expiration, percentCompleted, finished, request, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineageDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    submissionTime: ").append(toIndentedString(submissionTime)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    percentCompleted: ").append(toIndentedString(percentCompleted)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
