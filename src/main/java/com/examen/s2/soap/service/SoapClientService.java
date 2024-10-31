package com.examen.s2.soap.service;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.stereotype.Service;

@Service
public class SoapClientService extends WebServiceGatewaySupport {
    public Object callWebService(String url, Object request) {
        return getWebServiceTemplate().marshalSendAndReceive(url, request);
    }
}
