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


package com.google.api.ads.admanager.jaxws.v202205;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The action used for approving {@link Order} objects. All {@link LineItem}
 *             objects within the order will be approved as well. For more information on what happens to an
 *             order and its line items when it is approved, see the
 *             <a href="https://support.google.com/dfp_premium/answer/177334">Ad Manager Help Center</a>.
 *             </p>
 *           
 * 
 * <p>Java class for ApproveOrders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApproveOrders">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v202205}OrderAction">
 *       &lt;sequence>
 *         &lt;element name="skipInventoryCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApproveOrders", propOrder = {
    "skipInventoryCheck"
})
@XmlSeeAlso({
    ApproveAndOverbookOrders.class
})
public class ApproveOrders
    extends OrderAction
{

    protected Boolean skipInventoryCheck;

    /**
     * Gets the value of the skipInventoryCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipInventoryCheck() {
        return skipInventoryCheck;
    }

    /**
     * Sets the value of the skipInventoryCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipInventoryCheck(Boolean value) {
        this.skipInventoryCheck = value;
    }

}
