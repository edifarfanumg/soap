package com.examen.s2.soap.wsdl;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TipoCambioDiaStringResponse")
public class TipoCambioDiaStringResponse {

    private String resultado;

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
