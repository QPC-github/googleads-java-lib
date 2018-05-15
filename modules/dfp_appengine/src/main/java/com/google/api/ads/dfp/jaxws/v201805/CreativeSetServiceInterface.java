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
 *       Provides methods for adding, updating and retrieving {@link CreativeSet}
 *       objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CreativeSetServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CreativeSetServiceInterface {


    /**
     * 
     *         Creates a new {@link CreativeSet}.
     *         
     *         @param creativeSet the creative set to create
     *         @return the creative set with its ID filled in
     *       
     * 
     * @param creativeSet
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201805.CreativeSet
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805")
    @RequestWrapper(localName = "createCreativeSet", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805", className = "com.google.api.ads.dfp.jaxws.v201805.CreativeSetServiceInterfacecreateCreativeSet")
    @ResponseWrapper(localName = "createCreativeSetResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805", className = "com.google.api.ads.dfp.jaxws.v201805.CreativeSetServiceInterfacecreateCreativeSetResponse")
    public CreativeSet createCreativeSet(
        @WebParam(name = "creativeSet", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805")
        CreativeSet creativeSet)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link CreativeSetPage} of {@link CreativeSet} objects that satisfy the
     *         given {@link Statement#query}. The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link CreativeSet#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link CreativeSet#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code masterCreativeId}</td>
     *         <td>{@link CreativeSet#masterCreativeId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link CreativeSet#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         @param statement a Publisher Query Language statement used to filter
     *         a set of creative sets
     *         @return the creative sets that match the given filter
     *       
     * 
     * @param statement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201805.CreativeSetPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805")
    @RequestWrapper(localName = "getCreativeSetsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805", className = "com.google.api.ads.dfp.jaxws.v201805.CreativeSetServiceInterfacegetCreativeSetsByStatement")
    @ResponseWrapper(localName = "getCreativeSetsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805", className = "com.google.api.ads.dfp.jaxws.v201805.CreativeSetServiceInterfacegetCreativeSetsByStatementResponse")
    public CreativeSetPage getCreativeSetsByStatement(
        @WebParam(name = "statement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805")
        Statement statement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link CreativeSet}.
     *         
     *         @param creativeSet the creative set to update
     *         @return the updated creative set
     *       
     * 
     * @param creativeSet
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201805.CreativeSet
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805")
    @RequestWrapper(localName = "updateCreativeSet", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805", className = "com.google.api.ads.dfp.jaxws.v201805.CreativeSetServiceInterfaceupdateCreativeSet")
    @ResponseWrapper(localName = "updateCreativeSetResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805", className = "com.google.api.ads.dfp.jaxws.v201805.CreativeSetServiceInterfaceupdateCreativeSetResponse")
    public CreativeSet updateCreativeSet(
        @WebParam(name = "creativeSet", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805")
        CreativeSet creativeSet)
        throws ApiException_Exception
    ;

}
