package com.examen.s2.soap.wsdl;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TipoCambioDiaStringRequest")
public class TipoCambioDiaStringRequest {
    private String fecha;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

