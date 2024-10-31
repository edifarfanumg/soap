package com.examen.s2.soap.wsdl;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TipoCambioDiaStringResponse")
public class TipoCambioDiaStringResponse {
    // Tus atributos y métodos aquí

    // Ejemplo de un atributo
    private String resultado;

    // Getters y setters
    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
