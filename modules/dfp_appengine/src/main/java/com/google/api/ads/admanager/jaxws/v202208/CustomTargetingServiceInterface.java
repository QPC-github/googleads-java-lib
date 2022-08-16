// Copyright 2022 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.admanager.jaxws.v202208;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides operations for creating, updating and retrieving {@link CustomTargetingKey} and {@link
 *       CustomTargetingValue} objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CustomTargetingServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CustomTargetingServiceInterface {


    /**
     * 
     *         Creates new {@link CustomTargetingKey} objects.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link CustomTargetingKey#name}</li>
     *         <li>{@link CustomTargetingKey#type}</li>
     *         </ul>
     *         
     *         @param keys the custom targeting keys to update
     *         @return the updated custom targeting keys
     *       
     * 
     * @param keys
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202208.CustomTargetingKey>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "createCustomTargetingKeys", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomTargetingServiceInterfacecreateCustomTargetingKeys")
    @ResponseWrapper(localName = "createCustomTargetingKeysResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomTargetingServiceInterfacecreateCustomTargetingKeysResponse")
    public List<CustomTargetingKey> createCustomTargetingKeys(
        @WebParam(name = "keys", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        List<CustomTargetingKey> keys)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Creates new {@link CustomTargetingValue} objects.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link CustomTargetingValue#customTargetingKeyId}</li>
     *         <li>{@link CustomTargetingValue#name}</li>
     *         </ul>
     *         
     *         @param values the custom targeting values to update
     *         @return the updated custom targeting keys
     *       
     * 
     * @param values
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202208.CustomTargetingValue>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "createCustomTargetingValues", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomTargetingServiceInterfacecreateCustomTargetingValues")
    @ResponseWrapper(localName = "createCustomTargetingValuesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomTargetingServiceInterfacecreateCustomTargetingValuesResponse")
    public List<CustomTargetingValue> createCustomTargetingValues(
        @WebParam(name = "values", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        List<CustomTargetingValue> values)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link CustomTargetingKeyPage} of {@link CustomTargetingKey} objects
     *         that satisfy the given {@link Statement#query}. The following fields are
     *         supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link CustomTargetingKey#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link CustomTargetingKey#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code displayName}</td>
     *         <td>{@link CustomTargetingKey#displayName}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code type}</td>
     *         <td>{@link CustomTargetingKey#type}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of custom targeting keys
     *         @return the custom targeting keys that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202208.CustomTargetingKeyPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "getCustomTargetingKeysByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomTargetingServiceInterfacegetCustomTargetingKeysByStatement")
    @ResponseWrapper(localName = "getCustomTargetingKeysByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomTargetingServiceInterfacegetCustomTargetingKeysByStatementResponse")
    public CustomTargetingKeyPage getCustomTargetingKeysByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link CustomTargetingValuePage} of {@link CustomTargetingValue}
     *         objects that satisfy the given {@link Statement#query}.
     *         <p>
     *         The {@code WHERE} clause in the {@link Statement#query} must always contain
     *         {@link CustomTargetingValue#customTargetingKeyId} as one of its columns in
     *         a way that it is AND'ed with the rest of the query. So, if you want to
     *         retrieve values for a known set of key ids, valid {@link Statement#query}
     *         would look like:
     *         </p>
     *         <ol>
     *         <li>
     *         "WHERE customTargetingKeyId IN ('17','18','19')" retrieves all values that
     *         are associated with keys having ids 17, 18, 19.
     *         </li>
     *         <li>
     *         "WHERE customTargetingKeyId = '17' AND name = 'red'" retrieves values that
     *         are associated with keys having id 17 and value name is 'red'.
     *         </li>
     *         </ol>
     *         </p>
     *         <p>
     *         The following fields are supported for filtering:
     *         </p>
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link CustomTargetingValue#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code customTargetingKeyId}</td>
     *         <td>{@link CustomTargetingValue#customTargetingKeyId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link CustomTargetingValue#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code displayName}</td>
     *         <td>{@link CustomTargetingValue#displayName}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code matchType}</td>
     *         <td>{@link CustomTargetingValue#matchType}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of custom targeting values
     *         @return the custom targeting values that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202208.CustomTargetingValuePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "getCustomTargetingValuesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomTargetingServiceInterfacegetCustomTargetingValuesByStatement")
    @ResponseWrapper(localName = "getCustomTargetingValuesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomTargetingServiceInterfacegetCustomTargetingValuesByStatementResponse")
    public CustomTargetingValuePage getCustomTargetingValuesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link CustomTargetingKey} objects that match the given
     *         {@link Statement#query}.
     *         
     *         @param customTargetingKeyAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of custom targeting keys
     *         @return the result of the action performed
     *       
     * 
     * @param filterStatement
     * @param customTargetingKeyAction
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202208.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "performCustomTargetingKeyAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomTargetingServiceInterfaceperformCustomTargetingKeyAction")
    @ResponseWrapper(localName = "performCustomTargetingKeyActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomTargetingServiceInterfaceperformCustomTargetingKeyActionResponse")
    public UpdateResult performCustomTargetingKeyAction(
        @WebParam(name = "customTargetingKeyAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        CustomTargetingKeyAction customTargetingKeyAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link CustomTargetingValue} objects that match the
     *         given {@link Statement#query}.
     *         
     *         @param customTargetingValueAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of ad units
     *         @return the result of the action performed
     *       
     * 
     * @param filterStatement
     * @param customTargetingValueAction
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202208.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "performCustomTargetingValueAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomTargetingServiceInterfaceperformCustomTargetingValueAction")
    @ResponseWrapper(localName = "performCustomTargetingValueActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomTargetingServiceInterfaceperformCustomTargetingValueActionResponse")
    public UpdateResult performCustomTargetingValueAction(
        @WebParam(name = "customTargetingValueAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        CustomTargetingValueAction customTargetingValueAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link CustomTargetingKey} objects.
     *         
     *         @param keys the custom targeting keys to update
     *         @return the updated custom targeting keys
     *       
     * 
     * @param keys
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202208.CustomTargetingKey>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "updateCustomTargetingKeys", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomTargetingServiceInterfaceupdateCustomTargetingKeys")
    @ResponseWrapper(localName = "updateCustomTargetingKeysResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomTargetingServiceInterfaceupdateCustomTargetingKeysResponse")
    public List<CustomTargetingKey> updateCustomTargetingKeys(
        @WebParam(name = "keys", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        List<CustomTargetingKey> keys)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link CustomTargetingValue} objects.
     *         
     *         @param values the custom targeting values to update
     *         @return the updated custom targeting values
     *       
     * 
     * @param values
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202208.CustomTargetingValue>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "updateCustomTargetingValues", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomTargetingServiceInterfaceupdateCustomTargetingValues")
    @ResponseWrapper(localName = "updateCustomTargetingValuesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomTargetingServiceInterfaceupdateCustomTargetingValuesResponse")
    public List<CustomTargetingValue> updateCustomTargetingValues(
        @WebParam(name = "values", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        List<CustomTargetingValue> values)
        throws ApiException_Exception
    ;

}
