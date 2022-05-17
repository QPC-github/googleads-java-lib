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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentStatusDefinedBy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentStatusDefinedBy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CMS"/>
 *     &lt;enumeration value="USER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentStatusDefinedBy")
@XmlEnum
public enum ContentStatusDefinedBy {


    /**
     * 
     *                 Indicates that the status of the {@code Content} is defined by the CMS.
     *               
     * 
     */
    CMS,

    /**
     * 
     *                 Indicates that the status of the {@code Content} is defined by the user.
     *               
     * 
     */
    USER;

    public String value() {
        return name();
    }

    public static ContentStatusDefinedBy fromValue(String v) {
        return valueOf(v);
    }

}
