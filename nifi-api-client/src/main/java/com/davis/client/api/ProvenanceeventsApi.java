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


package com.davis.client.api;

import com.davis.client.ApiCallback;
import com.davis.client.ApiClient;
import com.davis.client.ApiException;
import com.davis.client.ApiResponse;
import com.davis.client.Configuration;
import com.davis.client.Pair;
import com.davis.client.ProgressRequestBody;
import com.davis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.davis.client.model.ProvenanceEventEntity;
import com.davis.client.model.SubmitReplayRequestEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProvenanceeventsApi {
    private ApiClient apiClient;

    public ProvenanceeventsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProvenanceeventsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getInputContent */
    private com.squareup.okhttp.Call getInputContentCall(String id, String clusterNodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getInputContent(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/provenance-events/{id}/content/input".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (clusterNodeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "clusterNodeId", clusterNodeId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*_/_*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "*_/_*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Gets the input content for a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getInputContent(String id, String clusterNodeId) throws ApiException {
        getInputContentWithHttpInfo(id, clusterNodeId);
    }

    /**
     * Gets the input content for a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getInputContentWithHttpInfo(String id, String clusterNodeId) throws ApiException {
        com.squareup.okhttp.Call call = getInputContentCall(id, clusterNodeId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets the input content for a provenance event (asynchronously)
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getInputContentAsync(String id, String clusterNodeId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getInputContentCall(id, clusterNodeId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getOutputContent */
    private com.squareup.okhttp.Call getOutputContentCall(String id, String clusterNodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getOutputContent(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/provenance-events/{id}/content/output".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (clusterNodeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "clusterNodeId", clusterNodeId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*_/_*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "*_/_*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Gets the output content for a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getOutputContent(String id, String clusterNodeId) throws ApiException {
        getOutputContentWithHttpInfo(id, clusterNodeId);
    }

    /**
     * Gets the output content for a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getOutputContentWithHttpInfo(String id, String clusterNodeId) throws ApiException {
        com.squareup.okhttp.Call call = getOutputContentCall(id, clusterNodeId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets the output content for a provenance event (asynchronously)
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOutputContentAsync(String id, String clusterNodeId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getOutputContentCall(id, clusterNodeId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getProvenanceEvent */
    private com.squareup.okhttp.Call getProvenanceEventCall(String id, String clusterNodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getProvenanceEvent(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/provenance-events/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (clusterNodeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "clusterNodeId", clusterNodeId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "*_/_*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Gets a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where this event exists if clustered. (optional)
     * @return ProvenanceEventEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProvenanceEventEntity getProvenanceEvent(String id, String clusterNodeId) throws ApiException {
        ApiResponse<ProvenanceEventEntity> resp = getProvenanceEventWithHttpInfo(id, clusterNodeId);
        return resp.getData();
    }

    /**
     * Gets a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where this event exists if clustered. (optional)
     * @return ApiResponse&lt;ProvenanceEventEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProvenanceEventEntity> getProvenanceEventWithHttpInfo(String id, String clusterNodeId) throws ApiException {
        com.squareup.okhttp.Call call = getProvenanceEventCall(id, clusterNodeId, null, null);
        Type localVarReturnType = new TypeToken<ProvenanceEventEntity>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a provenance event (asynchronously)
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where this event exists if clustered. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProvenanceEventAsync(String id, String clusterNodeId, final ApiCallback<ProvenanceEventEntity> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getProvenanceEventCall(id, clusterNodeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProvenanceEventEntity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for submitReplay */
    private com.squareup.okhttp.Call submitReplayCall(SubmitReplayRequestEntity body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling submitReplay(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/provenance-events/replays".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Replays content from a provenance event
     * 
     * @param body The replay request. (required)
     * @return ProvenanceEventEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProvenanceEventEntity submitReplay(SubmitReplayRequestEntity body) throws ApiException {
        ApiResponse<ProvenanceEventEntity> resp = submitReplayWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Replays content from a provenance event
     * 
     * @param body The replay request. (required)
     * @return ApiResponse&lt;ProvenanceEventEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProvenanceEventEntity> submitReplayWithHttpInfo(SubmitReplayRequestEntity body) throws ApiException {
        com.squareup.okhttp.Call call = submitReplayCall(body, null, null);
        Type localVarReturnType = new TypeToken<ProvenanceEventEntity>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Replays content from a provenance event (asynchronously)
     * 
     * @param body The replay request. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call submitReplayAsync(SubmitReplayRequestEntity body, final ApiCallback<ProvenanceEventEntity> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = submitReplayCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProvenanceEventEntity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
