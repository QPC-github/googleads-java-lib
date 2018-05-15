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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartSizeMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SmartSizeMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="SMART_BANNER"/>
 *     &lt;enumeration value="DYNAMIC_SIZE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SmartSizeMode")
@XmlEnum
public enum SmartSizeMode {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested
     *                 API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Fixed size mode (default).
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 The height is fixed for the request, the width is a range.
     *               
     * 
     */
    SMART_BANNER,

    /**
     * 
     *                 Height and width are ranges.
     *               
     * 
     */
    DYNAMIC_SIZE;

    public String value() {
        return name();
    }

    public static SmartSizeMode fromValue(String v) {
        return valueOf(v);
    }

}
