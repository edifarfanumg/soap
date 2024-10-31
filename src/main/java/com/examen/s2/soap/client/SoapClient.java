package com.examen.s2.soap.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import com.examen.s2.soap.wsdl.TipoCambioDiaStringRequest;
import com.examen.s2.soap.wsdl.TipoCambioDiaStringResponse;

@Component
public class SoapClient {
    @Autowired
    private WebServiceTemplate webServiceTemplate;

    public TipoCambioDiaStringResponse getTipoCambio(TipoCambioDiaStringRequest request) {
        return (TipoCambioDiaStringResponse) webServiceTemplate.marshalSendAndReceive(request);
    }
}
