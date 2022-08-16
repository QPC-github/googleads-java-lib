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
 *       Provides methods for the creation and management of {@link CustomField} objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CustomFieldServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CustomFieldServiceInterface {


    /**
     * 
     *         Creates new {@link CustomFieldOption} objects.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link CustomFieldOption#displayName}</li>
     *         <li>{@link CustomFieldOption#customFieldId}</li>
     *         </ul>
     *         
     *         @param customFieldOptions the custom fields to create
     *         @return the created custom field options with their IDs filled in
     *       
     * 
     * @param customFieldOptions
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202208.CustomFieldOption>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "createCustomFieldOptions", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomFieldServiceInterfacecreateCustomFieldOptions")
    @ResponseWrapper(localName = "createCustomFieldOptionsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomFieldServiceInterfacecreateCustomFieldOptionsResponse")
    public List<CustomFieldOption> createCustomFieldOptions(
        @WebParam(name = "customFieldOptions", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        List<CustomFieldOption> customFieldOptions)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Creates new {@link CustomField} objects.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link CustomField#name}</li>
     *         <li>{@link CustomField#entityType}</li>
     *         <li>{@link CustomField#dataType}</li>
     *         <li>{@link CustomField#visibility}</li>
     *         </ul>
     *         
     *         @param customFields the custom fields to create
     *         @return the created custom fields with their IDs filled in
     *       
     * 
     * @param customFields
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202208.CustomField>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "createCustomFields", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomFieldServiceInterfacecreateCustomFields")
    @ResponseWrapper(localName = "createCustomFieldsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomFieldServiceInterfacecreateCustomFieldsResponse")
    public List<CustomField> createCustomFields(
        @WebParam(name = "customFields", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        List<CustomField> customFields)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the {@link CustomFieldOption} uniquely identified by the given ID.
     *         
     *         @param customFieldOptionId the ID of the custom field option, which must already exist
     *         @return the {@code CustomFieldOption} uniquely identified by the given ID
     *       
     * 
     * @param customFieldOptionId
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202208.CustomFieldOption
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "getCustomFieldOption", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomFieldServiceInterfacegetCustomFieldOption")
    @ResponseWrapper(localName = "getCustomFieldOptionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomFieldServiceInterfacegetCustomFieldOptionResponse")
    public CustomFieldOption getCustomFieldOption(
        @WebParam(name = "customFieldOptionId", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        Long customFieldOptionId)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link CustomFieldPage} of {@link CustomField} objects that satisfy the
     *         given {@link Statement#query}.
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link CustomField#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code entityType}</td>
     *         <td>{@link CustomField#entityType}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link CustomField#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isActive}</td>
     *         <td>{@link CustomField#isActive}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code visibility}</td>
     *         <td>{@link CustomField#visibility}</td>
     *         </tr>
     *         </table>
     *         
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of custom fields.
     *         @return the custom fields that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202208.CustomFieldPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "getCustomFieldsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomFieldServiceInterfacegetCustomFieldsByStatement")
    @ResponseWrapper(localName = "getCustomFieldsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomFieldServiceInterfacegetCustomFieldsByStatementResponse")
    public CustomFieldPage getCustomFieldsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link CustomField} objects that match the given
     *         {@link Statement#query}.
     *         
     *         @param customFieldAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of custom fields
     *         @return the result of the action performed
     *       
     * 
     * @param customFieldAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202208.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "performCustomFieldAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomFieldServiceInterfaceperformCustomFieldAction")
    @ResponseWrapper(localName = "performCustomFieldActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomFieldServiceInterfaceperformCustomFieldActionResponse")
    public UpdateResult performCustomFieldAction(
        @WebParam(name = "customFieldAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        CustomFieldAction customFieldAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link CustomFieldOption} objects.
     *         
     *         @param customFieldOptions the custom field options to update
     *         @return the updated custom field options
     *       
     * 
     * @param customFieldOptions
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202208.CustomFieldOption>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "updateCustomFieldOptions", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomFieldServiceInterfaceupdateCustomFieldOptions")
    @ResponseWrapper(localName = "updateCustomFieldOptionsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomFieldServiceInterfaceupdateCustomFieldOptionsResponse")
    public List<CustomFieldOption> updateCustomFieldOptions(
        @WebParam(name = "customFieldOptions", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        List<CustomFieldOption> customFieldOptions)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link CustomField} objects.
     *         
     *         @param customFields the custom fields to update
     *         @return the updated custom fields
     *       
     * 
     * @param customFields
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202208.CustomField>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "updateCustomFields", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomFieldServiceInterfaceupdateCustomFields")
    @ResponseWrapper(localName = "updateCustomFieldsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CustomFieldServiceInterfaceupdateCustomFieldsResponse")
    public List<CustomField> updateCustomFields(
        @WebParam(name = "customFields", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        List<CustomField> customFields)
        throws ApiException_Exception
    ;

}
