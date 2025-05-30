package edu.comillas.icai.gitt.pat.spring.may24.vuelos.response;

import jakarta.validation.constraints.NotBlank;

public class AeropuertoResponse {
    @NotBlank(message = "no debe estar vacío")
    private String codigoAeropuerto;

    @NotBlank(message = "no debe estar vacío")
    private String pais;

    public String getCodigoAeropuerto() {
        return codigoAeropuerto;
    }

    public void setCodigoAeropuerto(String codigoAeropuerto) {
        this.codigoAeropuerto = codigoAeropuerto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
