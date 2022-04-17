/*
 * lakeFS API
 * lakeFS HTTP API
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.lakefs.clients.api;

import io.lakefs.clients.api.ApiCallback;
import io.lakefs.clients.api.ApiClient;
import io.lakefs.clients.api.ApiException;
import io.lakefs.clients.api.ApiResponse;
import io.lakefs.clients.api.Configuration;
import io.lakefs.clients.api.Pair;
import io.lakefs.clients.api.ProgressRequestBody;
import io.lakefs.clients.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.lakefs.clients.api.model.Error;
import io.lakefs.clients.api.model.InlineResponse201;
import io.lakefs.clients.api.model.MetaRangeCreation;
import io.lakefs.clients.api.model.RangeMetadata;
import io.lakefs.clients.api.model.StageRangeCreation;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImportApi {
    private ApiClient localVarApiClient;

    public ImportApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ImportApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createMetaRange
     * @param repository  (required)
     * @param metaRangeCreation  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> metarange metadata </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createMetaRangeCall(String repository, MetaRangeCreation metaRangeCreation, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = metaRangeCreation;

        // create path and map variables
        String localVarPath = "/repositories/{repository}/branches/metaranges"
            .replaceAll("\\{" + "repository" + "\\}", localVarApiClient.escapeString(repository.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basic_auth", "cookie_auth", "jwt_token" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createMetaRangeValidateBeforeCall(String repository, MetaRangeCreation metaRangeCreation, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'repository' is set
        if (repository == null) {
            throw new ApiException("Missing the required parameter 'repository' when calling createMetaRange(Async)");
        }
        
        // verify the required parameter 'metaRangeCreation' is set
        if (metaRangeCreation == null) {
            throw new ApiException("Missing the required parameter 'metaRangeCreation' when calling createMetaRange(Async)");
        }
        

        okhttp3.Call localVarCall = createMetaRangeCall(repository, metaRangeCreation, _callback);
        return localVarCall;

    }

    /**
     * create a lakeFS metarange file from the given ranges
     * 
     * @param repository  (required)
     * @param metaRangeCreation  (required)
     * @return InlineResponse201
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> metarange metadata </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse201 createMetaRange(String repository, MetaRangeCreation metaRangeCreation) throws ApiException {
        ApiResponse<InlineResponse201> localVarResp = createMetaRangeWithHttpInfo(repository, metaRangeCreation);
        return localVarResp.getData();
    }

    /**
     * create a lakeFS metarange file from the given ranges
     * 
     * @param repository  (required)
     * @param metaRangeCreation  (required)
     * @return ApiResponse&lt;InlineResponse201&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> metarange metadata </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse201> createMetaRangeWithHttpInfo(String repository, MetaRangeCreation metaRangeCreation) throws ApiException {
        okhttp3.Call localVarCall = createMetaRangeValidateBeforeCall(repository, metaRangeCreation, null);
        Type localVarReturnType = new TypeToken<InlineResponse201>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * create a lakeFS metarange file from the given ranges (asynchronously)
     * 
     * @param repository  (required)
     * @param metaRangeCreation  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> metarange metadata </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createMetaRangeAsync(String repository, MetaRangeCreation metaRangeCreation, final ApiCallback<InlineResponse201> _callback) throws ApiException {

        okhttp3.Call localVarCall = createMetaRangeValidateBeforeCall(repository, metaRangeCreation, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse201>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ingestRange
     * @param repository  (required)
     * @param stageRangeCreation  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> range metadata </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ingestRangeCall(String repository, StageRangeCreation stageRangeCreation, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = stageRangeCreation;

        // create path and map variables
        String localVarPath = "/repositories/{repository}/branches/ranges"
            .replaceAll("\\{" + "repository" + "\\}", localVarApiClient.escapeString(repository.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basic_auth", "cookie_auth", "jwt_token" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call ingestRangeValidateBeforeCall(String repository, StageRangeCreation stageRangeCreation, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'repository' is set
        if (repository == null) {
            throw new ApiException("Missing the required parameter 'repository' when calling ingestRange(Async)");
        }
        
        // verify the required parameter 'stageRangeCreation' is set
        if (stageRangeCreation == null) {
            throw new ApiException("Missing the required parameter 'stageRangeCreation' when calling ingestRange(Async)");
        }
        

        okhttp3.Call localVarCall = ingestRangeCall(repository, stageRangeCreation, _callback);
        return localVarCall;

    }

    /**
     * create a lakeFS range file from the source uri
     * 
     * @param repository  (required)
     * @param stageRangeCreation  (required)
     * @return RangeMetadata
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> range metadata </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public RangeMetadata ingestRange(String repository, StageRangeCreation stageRangeCreation) throws ApiException {
        ApiResponse<RangeMetadata> localVarResp = ingestRangeWithHttpInfo(repository, stageRangeCreation);
        return localVarResp.getData();
    }

    /**
     * create a lakeFS range file from the source uri
     * 
     * @param repository  (required)
     * @param stageRangeCreation  (required)
     * @return ApiResponse&lt;RangeMetadata&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> range metadata </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RangeMetadata> ingestRangeWithHttpInfo(String repository, StageRangeCreation stageRangeCreation) throws ApiException {
        okhttp3.Call localVarCall = ingestRangeValidateBeforeCall(repository, stageRangeCreation, null);
        Type localVarReturnType = new TypeToken<RangeMetadata>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * create a lakeFS range file from the source uri (asynchronously)
     * 
     * @param repository  (required)
     * @param stageRangeCreation  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> range metadata </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ingestRangeAsync(String repository, StageRangeCreation stageRangeCreation, final ApiCallback<RangeMetadata> _callback) throws ApiException {

        okhttp3.Call localVarCall = ingestRangeValidateBeforeCall(repository, stageRangeCreation, _callback);
        Type localVarReturnType = new TypeToken<RangeMetadata>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
