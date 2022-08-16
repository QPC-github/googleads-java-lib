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

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CreativeReviewServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CreativeReviewServiceInterface {


    /**
     * 
     *         Gets a {@link CreativeReviewPage} of {@link CreativeReview} objects that satisfy the given
     *         {@link Statement#query}. This will allow you to review creatives that have displayed (or could
     *         have displayed) on your pages or apps in the last 30 days. To ensure that you are always
     *         reviewing the most important creatives first, the {@link CreativeReview} objects are ranked
     *         according to the number of impressions that they've received.
     *         
     *         @param statement a Publisher Query Language statement used to specify the page of {@link
     *         CreativeReview} to be fetch. Only {@code LIMIT} is supported.
     *         @return the {@link CreativeReview}s that match the given filter
     *       
     * 
     * @param statement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202208.CreativeReviewPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "getCreativeReviewsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CreativeReviewServiceInterfacegetCreativeReviewsByStatement")
    @ResponseWrapper(localName = "getCreativeReviewsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CreativeReviewServiceInterfacegetCreativeReviewsByStatementResponse")
    public CreativeReviewPage getCreativeReviewsByStatement(
        @WebParam(name = "statement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        Statement statement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link CreativeReview} objects that match the given {@link
     *         Statement#query}. You can use actions to approve (allow) or disapprove (block) creatives, as
     *         seen in the corresponding {@link CreativeReview} objects. You can also archive creatives to
     *         allow you to retrieve new {@link CreativeReview} objects while previously retrieved {@link
     *         CreativeReview} objects are in pending approval.
     *         
     *         @param creativeReviewAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter a set of creative
     *         reviews. Only {@code "WHERE id = <value>"} and {@code "WHERE id IN <list>"} are supported.
     *         @return the result of the action performed
     *       
     * 
     * @param filterStatement
     * @param creativeReviewAction
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202208.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "performCreativeReviewAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CreativeReviewServiceInterfaceperformCreativeReviewAction")
    @ResponseWrapper(localName = "performCreativeReviewActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.CreativeReviewServiceInterfaceperformCreativeReviewActionResponse")
    public UpdateResult performCreativeReviewAction(
        @WebParam(name = "creativeReviewAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        CreativeReviewAction creativeReviewAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        Statement filterStatement)
        throws ApiException_Exception
    ;

}
