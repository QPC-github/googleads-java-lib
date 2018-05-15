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
 *       Provides methods for managing {@link PremiumRate} objects.
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
@WebService(name = "PremiumRateServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PremiumRateServiceInterface {


    /**
     * 
     *         Creates a list of new {@link PremiumRate} objects.
     *         
     *         @param premiumRates the premium rates to be created
     *         @return the premium rates with their IDs filled in
     *       
     * 
     * @param premiumRates
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201805.PremiumRate>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805")
    @RequestWrapper(localName = "createPremiumRates", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805", className = "com.google.api.ads.dfp.jaxws.v201805.PremiumRateServiceInterfacecreatePremiumRates")
    @ResponseWrapper(localName = "createPremiumRatesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805", className = "com.google.api.ads.dfp.jaxws.v201805.PremiumRateServiceInterfacecreatePremiumRatesResponse")
    public List<PremiumRate> createPremiumRates(
        @WebParam(name = "premiumRates", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805")
        List<PremiumRate> premiumRates)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link PremiumRatePage} of {@link PremiumRate} objects that
     *         satisfy the given {@link Statement#query}. The following fields are
     *         supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link PremiumRate#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code rateCardId}</td>
     *         <td>{@link PremiumRate#rateCardId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code pricingMethod}</td>
     *         <td>{@link PremiumRate#pricingMethod}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement to filter a
     *         list of premium rates.
     *         @return the premium rates that match the filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201805.PremiumRatePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805")
    @RequestWrapper(localName = "getPremiumRatesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805", className = "com.google.api.ads.dfp.jaxws.v201805.PremiumRateServiceInterfacegetPremiumRatesByStatement")
    @ResponseWrapper(localName = "getPremiumRatesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805", className = "com.google.api.ads.dfp.jaxws.v201805.PremiumRateServiceInterfacegetPremiumRatesByStatementResponse")
    public PremiumRatePage getPremiumRatesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link PremiumRate} objects.
     *         
     *         @param premiumRates the premium rates to be updated
     *         @return the updated premium rates
     *       
     * 
     * @param premiumRates
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201805.PremiumRate>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805")
    @RequestWrapper(localName = "updatePremiumRates", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805", className = "com.google.api.ads.dfp.jaxws.v201805.PremiumRateServiceInterfaceupdatePremiumRates")
    @ResponseWrapper(localName = "updatePremiumRatesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805", className = "com.google.api.ads.dfp.jaxws.v201805.PremiumRateServiceInterfaceupdatePremiumRatesResponse")
    public List<PremiumRate> updatePremiumRates(
        @WebParam(name = "premiumRates", targetNamespace = "https://www.google.com/apis/ads/publisher/v201805")
        List<PremiumRate> premiumRates)
        throws ApiException_Exception
    ;

}
