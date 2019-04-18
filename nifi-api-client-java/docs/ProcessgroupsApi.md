# ProcessgroupsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copySnippet**](ProcessgroupsApi.md#copySnippet) | **POST** /process-groups/{id}/snippet-instance | Copies a snippet
[**createConnection**](ProcessgroupsApi.md#createConnection) | **POST** /process-groups/{id}/connections | Creates a connection
[**createControllerService**](ProcessgroupsApi.md#createControllerService) | **POST** /process-groups/{id}/controller-services | Creates a new controller service
[**createFunnel**](ProcessgroupsApi.md#createFunnel) | **POST** /process-groups/{id}/funnels | Creates a funnel
[**createInputPort**](ProcessgroupsApi.md#createInputPort) | **POST** /process-groups/{id}/input-ports | Creates an input port
[**createLabel**](ProcessgroupsApi.md#createLabel) | **POST** /process-groups/{id}/labels | Creates a label
[**createOutputPort**](ProcessgroupsApi.md#createOutputPort) | **POST** /process-groups/{id}/output-ports | Creates an output port
[**createProcessGroup**](ProcessgroupsApi.md#createProcessGroup) | **POST** /process-groups/{id}/process-groups | Creates a process group
[**createProcessor**](ProcessgroupsApi.md#createProcessor) | **POST** /process-groups/{id}/processors | Creates a new processor
[**createRemoteProcessGroup**](ProcessgroupsApi.md#createRemoteProcessGroup) | **POST** /process-groups/{id}/remote-process-groups | Creates a new process group
[**createTemplate**](ProcessgroupsApi.md#createTemplate) | **POST** /process-groups/{id}/templates | Creates a template
[**getConnections**](ProcessgroupsApi.md#getConnections) | **GET** /process-groups/{id}/connections | Gets all connections
[**getFunnels**](ProcessgroupsApi.md#getFunnels) | **GET** /process-groups/{id}/funnels | Gets all funnels
[**getInputPorts**](ProcessgroupsApi.md#getInputPorts) | **GET** /process-groups/{id}/input-ports | Gets all input ports
[**getLabels**](ProcessgroupsApi.md#getLabels) | **GET** /process-groups/{id}/labels | Gets all labels
[**getOutputPorts**](ProcessgroupsApi.md#getOutputPorts) | **GET** /process-groups/{id}/output-ports | Gets all output ports
[**getProcessGroup**](ProcessgroupsApi.md#getProcessGroup) | **GET** /process-groups/{id} | Gets a process group
[**getProcessGroups**](ProcessgroupsApi.md#getProcessGroups) | **GET** /process-groups/{id}/process-groups | Gets all process groups
[**getProcessors**](ProcessgroupsApi.md#getProcessors) | **GET** /process-groups/{id}/processors | Gets all processors
[**getRemoteProcessGroups**](ProcessgroupsApi.md#getRemoteProcessGroups) | **GET** /process-groups/{id}/remote-process-groups | Gets all remote process groups
[**importTemplate**](ProcessgroupsApi.md#importTemplate) | **POST** /process-groups/{id}/templates/import | Imports a template
[**instantiateTemplate**](ProcessgroupsApi.md#instantiateTemplate) | **POST** /process-groups/{id}/template-instance | Instantiates a template
[**removeProcessGroup**](ProcessgroupsApi.md#removeProcessGroup) | **DELETE** /process-groups/{id} | Deletes a process group
[**updateProcessGroup**](ProcessgroupsApi.md#updateProcessGroup) | **PUT** /process-groups/{id} | Updates a process group
[**uploadTemplate**](ProcessgroupsApi.md#uploadTemplate) | **POST** /process-groups/{id}/templates/upload | Uploads a template


<a name="copySnippet"></a>
# **copySnippet**
> FlowSnippetEntity copySnippet(id, body)

Copies a snippet



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
CopySnippetRequestEntity body = new CopySnippetRequestEntity(); // CopySnippetRequestEntity | The copy snippet request.
try {
    FlowSnippetEntity result = apiInstance.copySnippet(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#copySnippet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**CopySnippetRequestEntity**](CopySnippetRequestEntity.md)| The copy snippet request. |

### Return type

[**FlowSnippetEntity**](FlowSnippetEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createConnection"></a>
# **createConnection**
> ConnectionEntity createConnection(id, body)

Creates a connection



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
ConnectionEntity body = new ConnectionEntity(); // ConnectionEntity | The connection configuration details.
try {
    ConnectionEntity result = apiInstance.createConnection(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#createConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**ConnectionEntity**](ConnectionEntity.md)| The connection configuration details. |

### Return type

[**ConnectionEntity**](ConnectionEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createControllerService"></a>
# **createControllerService**
> ControllerServiceEntity createControllerService(id, body)

Creates a new controller service



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
ControllerServiceEntity body = new ControllerServiceEntity(); // ControllerServiceEntity | The controller service configuration details.
try {
    ControllerServiceEntity result = apiInstance.createControllerService(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#createControllerService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**ControllerServiceEntity**](ControllerServiceEntity.md)| The controller service configuration details. |

### Return type

[**ControllerServiceEntity**](ControllerServiceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createFunnel"></a>
# **createFunnel**
> FunnelEntity createFunnel(id, body)

Creates a funnel



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
FunnelEntity body = new FunnelEntity(); // FunnelEntity | The funnel configuration details.
try {
    FunnelEntity result = apiInstance.createFunnel(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#createFunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**FunnelEntity**](FunnelEntity.md)| The funnel configuration details. |

### Return type

[**FunnelEntity**](FunnelEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createInputPort"></a>
# **createInputPort**
> PortEntity createInputPort(id, body)

Creates an input port



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
PortEntity body = new PortEntity(); // PortEntity | The input port configuration details.
try {
    PortEntity result = apiInstance.createInputPort(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#createInputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**PortEntity**](PortEntity.md)| The input port configuration details. |

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLabel"></a>
# **createLabel**
> LabelEntity createLabel(id, body)

Creates a label



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
LabelEntity body = new LabelEntity(); // LabelEntity | The label configuration details.
try {
    LabelEntity result = apiInstance.createLabel(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#createLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**LabelEntity**](LabelEntity.md)| The label configuration details. |

### Return type

[**LabelEntity**](LabelEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOutputPort"></a>
# **createOutputPort**
> PortEntity createOutputPort(id, body)

Creates an output port



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
PortEntity body = new PortEntity(); // PortEntity | The output port configuration.
try {
    PortEntity result = apiInstance.createOutputPort(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#createOutputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**PortEntity**](PortEntity.md)| The output port configuration. |

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProcessGroup"></a>
# **createProcessGroup**
> ProcessGroupEntity createProcessGroup(id, body)

Creates a process group



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
ProcessGroupEntity body = new ProcessGroupEntity(); // ProcessGroupEntity | The process group configuration details.
try {
    ProcessGroupEntity result = apiInstance.createProcessGroup(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#createProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**ProcessGroupEntity**](ProcessGroupEntity.md)| The process group configuration details. |

### Return type

[**ProcessGroupEntity**](ProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProcessor"></a>
# **createProcessor**
> ProcessorEntity createProcessor(id, body)

Creates a new processor



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
ProcessorEntity body = new ProcessorEntity(); // ProcessorEntity | The processor configuration details.
try {
    ProcessorEntity result = apiInstance.createProcessor(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#createProcessor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**ProcessorEntity**](ProcessorEntity.md)| The processor configuration details. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRemoteProcessGroup"></a>
# **createRemoteProcessGroup**
> RemoteProcessGroupEntity createRemoteProcessGroup(id, body)

Creates a new process group



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
RemoteProcessGroupEntity body = new RemoteProcessGroupEntity(); // RemoteProcessGroupEntity | The remote process group configuration details.
try {
    RemoteProcessGroupEntity result = apiInstance.createRemoteProcessGroup(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#createRemoteProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)| The remote process group configuration details. |

### Return type

[**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTemplate"></a>
# **createTemplate**
> TemplateEntity createTemplate(id, body)

Creates a template



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
CreateTemplateRequestEntity body = new CreateTemplateRequestEntity(); // CreateTemplateRequestEntity | The create template request.
try {
    TemplateEntity result = apiInstance.createTemplate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#createTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**CreateTemplateRequestEntity**](CreateTemplateRequestEntity.md)| The create template request. |

### Return type

[**TemplateEntity**](TemplateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConnections"></a>
# **getConnections**
> ConnectionsEntity getConnections(id)

Gets all connections



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
try {
    ConnectionsEntity result = apiInstance.getConnections(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#getConnections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**ConnectionsEntity**](ConnectionsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/json

<a name="getFunnels"></a>
# **getFunnels**
> FunnelsEntity getFunnels(id)

Gets all funnels



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
try {
    FunnelsEntity result = apiInstance.getFunnels(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#getFunnels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**FunnelsEntity**](FunnelsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/json

<a name="getInputPorts"></a>
# **getInputPorts**
> InputPortsEntity getInputPorts(id)

Gets all input ports



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
try {
    InputPortsEntity result = apiInstance.getInputPorts(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#getInputPorts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**InputPortsEntity**](InputPortsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/json

<a name="getLabels"></a>
# **getLabels**
> LabelsEntity getLabels(id)

Gets all labels



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
try {
    LabelsEntity result = apiInstance.getLabels(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#getLabels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**LabelsEntity**](LabelsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/json

<a name="getOutputPorts"></a>
# **getOutputPorts**
> OutputPortsEntity getOutputPorts(id)

Gets all output ports



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
try {
    OutputPortsEntity result = apiInstance.getOutputPorts(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#getOutputPorts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**OutputPortsEntity**](OutputPortsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/json

<a name="getProcessGroup"></a>
# **getProcessGroup**
> ProcessGroupEntity getProcessGroup(id)

Gets a process group



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
try {
    ProcessGroupEntity result = apiInstance.getProcessGroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#getProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**ProcessGroupEntity**](ProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/json

<a name="getProcessGroups"></a>
# **getProcessGroups**
> ProcessorsEntity getProcessGroups(id)

Gets all process groups



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
try {
    ProcessorsEntity result = apiInstance.getProcessGroups(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#getProcessGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**ProcessorsEntity**](ProcessorsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/json

<a name="getProcessors"></a>
# **getProcessors**
> ProcessorsEntity getProcessors(id)

Gets all processors



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
try {
    ProcessorsEntity result = apiInstance.getProcessors(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#getProcessors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**ProcessorsEntity**](ProcessorsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/json

<a name="getRemoteProcessGroups"></a>
# **getRemoteProcessGroups**
> RemoteProcessGroupsEntity getRemoteProcessGroups(id)

Gets all remote process groups



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
try {
    RemoteProcessGroupsEntity result = apiInstance.getRemoteProcessGroups(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#getRemoteProcessGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**RemoteProcessGroupsEntity**](RemoteProcessGroupsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/json

<a name="importTemplate"></a>
# **importTemplate**
> TemplateEntity importTemplate(id)

Imports a template



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
try {
    TemplateEntity result = apiInstance.importTemplate(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#importTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**TemplateEntity**](TemplateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

<a name="instantiateTemplate"></a>
# **instantiateTemplate**
> FlowEntity instantiateTemplate(id, body)

Instantiates a template



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
InstantiateTemplateRequestEntity body = new InstantiateTemplateRequestEntity(); // InstantiateTemplateRequestEntity | The instantiate template request.
try {
    FlowEntity result = apiInstance.instantiateTemplate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#instantiateTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**InstantiateTemplateRequestEntity**](InstantiateTemplateRequestEntity.md)| The instantiate template request. |

### Return type

[**FlowEntity**](FlowEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeProcessGroup"></a>
# **removeProcessGroup**
> ProcessGroupEntity removeProcessGroup(id, version, clientId)

Deletes a process group



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
try {
    ProcessGroupEntity result = apiInstance.removeProcessGroup(id, version, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#removeProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**ProcessGroupEntity**](ProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/json

<a name="updateProcessGroup"></a>
# **updateProcessGroup**
> ProcessGroupEntity updateProcessGroup(id, body)

Updates a process group



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
ProcessGroupEntity body = new ProcessGroupEntity(); // ProcessGroupEntity | The process group configuration details.
try {
    ProcessGroupEntity result = apiInstance.updateProcessGroup(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#updateProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**ProcessGroupEntity**](ProcessGroupEntity.md)| The process group configuration details. |

### Return type

[**ProcessGroupEntity**](ProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadTemplate"></a>
# **uploadTemplate**
> TemplateEntity uploadTemplate(id, template)

Uploads a template



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcessgroupsApi;


ProcessgroupsApi apiInstance = new ProcessgroupsApi();
String id = "id_example"; // String | The process group id.
File template = new File("/path/to/file.txt"); // File | 
try {
    TemplateEntity result = apiInstance.uploadTemplate(id, template);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessgroupsApi#uploadTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **template** | **File**|  | [optional]

### Return type

[**TemplateEntity**](TemplateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/xml

