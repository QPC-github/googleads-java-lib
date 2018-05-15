// Copyright 2018 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201805;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods to retrieve and perform actions on {@link WorkflowRequest} objects
 *       
 *       <p>To use this service, you need to have the new sales management solution enabled on your
 *       network. If you do not see a "Sales" tab in <a href="https://www.google.com/dfp">DoubleClick for
 *       Publishers (DFP)</a>, you will not be able to use this service.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "WorkflowRequestServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WorkflowRequestServiceInterface {


    /**
     * 
     *         Gets a list of {@link WorkflowRequest} objects that satisfy the given {@link Statement#query}.
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link WorkflowRequest#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code workflowRuleName}</td>
     *         <td>{@link WorkflowRequest#workflowRuleName}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code entityType}</td>
     *         <td>{@link WorkflowRequest#entityType}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code entityId}</td>
     *         <td>{@link WorkflowRequest#entityId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code approvalStatus}</td>
     *         <td>{@link WorkflowApprovalRequest#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code conditionStatus}</td>
     *         <td>{@link WorkflowExternalConditionRequest#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code type}</td>
     *         <td>{@link WorkflowRequest#type}</td>
     *         </tr>
     *         </table>
     *         
     *         <p>The {@code type} filter is required in v201705 and earlier.
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter a set of workflow
     *         requests belonging to an entity
     *         @return the workflow requests that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201805.WorkflowRequestPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805")
    @RequestWrapper(localName = "getWorkflowRequestsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805", className = "com.google.api.ads.dfp.jaxws.v201805.WorkflowRequestServiceInterfacegetWorkflowRequestsByStatement")
    @ResponseWrapper(localName = "getWorkflowRequestsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805", className = "com.google.api.ads.dfp.jaxws.v201805.WorkflowRequestServiceInterfacegetWorkflowRequestsByStatementResponse")
    public WorkflowRequestPage getWorkflowRequestsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Perform actions on {@link WorkflowRequest} objects that match the given
     *         {@link Statement#query}.
     *         
     *         @param action the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter a set of workflow
     *         requests
     *         @return the result of the action performed
     *       
     * 
     * @param filterStatement
     * @param action
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201805.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805")
    @RequestWrapper(localName = "performWorkflowRequestAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805", className = "com.google.api.ads.dfp.jaxws.v201805.WorkflowRequestServiceInterfaceperformWorkflowRequestAction")
    @ResponseWrapper(localName = "performWorkflowRequestActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805", className = "com.google.api.ads.dfp.jaxws.v201805.WorkflowRequestServiceInterfaceperformWorkflowRequestActionResponse")
    public UpdateResult performWorkflowRequestAction(
        @WebParam(name = "action", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805")
        WorkflowRequestAction action,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805")
        Statement filterStatement)
        throws ApiException_Exception
    ;

}
