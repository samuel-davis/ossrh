# InputportsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInputPort**](InputportsApi.md#getInputPort) | **GET** /input-ports/{id} | Gets an input port
[**removeInputPort**](InputportsApi.md#removeInputPort) | **DELETE** /input-ports/{id} | Deletes an input port
[**updateInputPort**](InputportsApi.md#updateInputPort) | **PUT** /input-ports/{id} | Updates an input port


<a name="getInputPort"></a>
# **getInputPort**
> PortEntity getInputPort(id)

Gets an input port



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InputportsApi;


InputportsApi apiInstance = new InputportsApi();
String id = "id_example"; // String | The input port id.
try {
    PortEntity result = apiInstance.getInputPort(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputportsApi#getInputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The input port id. |

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/json

<a name="removeInputPort"></a>
# **removeInputPort**
> PortEntity removeInputPort(id, version, clientId)

Deletes an input port



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InputportsApi;


InputportsApi apiInstance = new InputportsApi();
String id = "id_example"; // String | The input port id.
String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
try {
    PortEntity result = apiInstance.removeInputPort(id, version, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputportsApi#removeInputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The input port id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: *_/_*
 - **Accept**: application/json

<a name="updateInputPort"></a>
# **updateInputPort**
> PortEntity updateInputPort(id, body)

Updates an input port



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InputportsApi;


InputportsApi apiInstance = new InputportsApi();
String id = "id_example"; // String | The input port id.
PortEntity body = new PortEntity(); // PortEntity | The input port configuration details.
try {
    PortEntity result = apiInstance.updateInputPort(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputportsApi#updateInputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The input port id. |
 **body** | [**PortEntity**](PortEntity.md)| The input port configuration details. |

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

