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

import com.davis.client.ApiException;
import com.davis.client.model.PortEntity;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InputportsApi
 */
public class InputportsApiTest {

    private final InputportsApi api = new InputportsApi();

    
    /**
     * Gets an input port
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInputPortTest() throws ApiException {
        String id = null;
        // PortEntity response = api.getInputPort(id);

        // TODO: test validations
    }
    
    /**
     * Deletes an input port
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeInputPortTest() throws ApiException {
        String id = null;
        String version = null;
        String clientId = null;
        // PortEntity response = api.removeInputPort(id, version, clientId);

        // TODO: test validations
    }
    
    /**
     * Updates an input port
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateInputPortTest() throws ApiException {
        String id = null;
        PortEntity body = null;
        // PortEntity response = api.updateInputPort(id, body);

        // TODO: test validations
    }
    
}
