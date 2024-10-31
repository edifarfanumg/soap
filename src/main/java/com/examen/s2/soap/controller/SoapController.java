package com.examen.s2.soap.controller;

import com.examen.s2.soap.client.SoapClient;
import com.examen.s2.soap.wsdl.TipoCambioDiaStringRequest;
import com.examen.s2.soap.wsdl.TipoCambioDiaStringResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoapController {
    @Autowired
    private SoapClient soapClient;

    @GetMapping("/tipo-cambio")
    public TipoCambioDiaStringResponse getTipoCambio(@RequestParam String fecha) {
        TipoCambioDiaStringRequest request = new TipoCambioDiaStringRequest();
        request.setFecha(fecha);
        return soapClient.getTipoCambio(request);
    }
}
