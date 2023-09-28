package com.cdc.apihub.mx.fis2022.client.model;

public class Request {
    private RequestDatosGenerales requestDatosGenerales;
    private RequestFolios requestFolios;

    public RequestDatosGenerales getRequestDatosGenerales() {
        return requestDatosGenerales;
    }

    public void setRequestDatosGenerales(RequestDatosGenerales requestDatosGenerales) {
        this.requestDatosGenerales = requestDatosGenerales;
    }

    public RequestFolios getRequestFolios() {
        return requestFolios;
    }

    public void setRequestFolios(RequestFolios requestFolios) {
        this.requestFolios = requestFolios;
    }
}
