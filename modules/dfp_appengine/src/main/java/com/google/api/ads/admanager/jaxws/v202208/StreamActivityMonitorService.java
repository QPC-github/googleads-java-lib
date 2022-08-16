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

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "StreamActivityMonitorService", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v202208/StreamActivityMonitorService?wsdl")
public class StreamActivityMonitorService
    extends Service
{

    private final static URL STREAMACTIVITYMONITORSERVICE_WSDL_LOCATION;
    private final static WebServiceException STREAMACTIVITYMONITORSERVICE_EXCEPTION;
    private final static QName STREAMACTIVITYMONITORSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v202208", "StreamActivityMonitorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v202208/StreamActivityMonitorService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STREAMACTIVITYMONITORSERVICE_WSDL_LOCATION = url;
        STREAMACTIVITYMONITORSERVICE_EXCEPTION = e;
    }

    public StreamActivityMonitorService() {
        super(__getWsdlLocation(), STREAMACTIVITYMONITORSERVICE_QNAME);
    }

    public StreamActivityMonitorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns StreamActivityMonitorServiceInterface
     */
    @WebEndpoint(name = "StreamActivityMonitorServiceInterfacePort")
    public StreamActivityMonitorServiceInterface getStreamActivityMonitorServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v202208", "StreamActivityMonitorServiceInterfacePort"), StreamActivityMonitorServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StreamActivityMonitorServiceInterface
     */
    @WebEndpoint(name = "StreamActivityMonitorServiceInterfacePort")
    public StreamActivityMonitorServiceInterface getStreamActivityMonitorServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v202208", "StreamActivityMonitorServiceInterfacePort"), StreamActivityMonitorServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STREAMACTIVITYMONITORSERVICE_EXCEPTION!= null) {
            throw STREAMACTIVITYMONITORSERVICE_EXCEPTION;
        }
        return STREAMACTIVITYMONITORSERVICE_WSDL_LOCATION;
    }

}
