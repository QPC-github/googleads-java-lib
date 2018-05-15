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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Indicates the delivery performance of the {@link LineItem}.
 *           
 * 
 * <p>Java class for DeliveryIndicator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryIndicator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="expectedDeliveryPercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="actualDeliveryPercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryIndicator", propOrder = {
    "expectedDeliveryPercentage",
    "actualDeliveryPercentage"
})
public class DeliveryIndicator {

    protected Double expectedDeliveryPercentage;
    protected Double actualDeliveryPercentage;

    /**
     * Gets the value of the expectedDeliveryPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExpectedDeliveryPercentage() {
        return expectedDeliveryPercentage;
    }

    /**
     * Sets the value of the expectedDeliveryPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpectedDeliveryPercentage(Double value) {
        this.expectedDeliveryPercentage = value;
    }

    /**
     * Gets the value of the actualDeliveryPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualDeliveryPercentage() {
        return actualDeliveryPercentage;
    }

    /**
     * Sets the value of the actualDeliveryPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualDeliveryPercentage(Double value) {
        this.actualDeliveryPercentage = value;
    }

}
