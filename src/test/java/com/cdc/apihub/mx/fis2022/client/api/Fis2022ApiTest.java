package com.cdc.apihub.mx.fis2022.client.api;

import com.cdc.apihub.mx.fis2022.client.ApiClient;
import com.cdc.apihub.mx.fis2022.client.model.Request;
import com.cdc.apihub.mx.fis2022.client.model.RequestDatosGenerales;
import com.cdc.apihub.mx.fis2022.client.model.RequestFolios;
import com.cdc.apihub.mx.fis2022.client.model.ResponseScore;
import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;
import okhttp3.OkHttpClient;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

@Ignore
public class Fis2022ApiTest {

    private Logger logger = LoggerFactory.getLogger(Fis2022ApiTest.class.getName());
    private final Fis2022Api api = new Fis2022Api();

    private ApiClient apiClient = null;

    private String keystoreFile = "/keystore.jks";//CHANGE IT TO YOUR KEYSTORE PATH
    private String cdcCertFile = "/cdc_cert.pem"; //CHANGE IT TO YOUR CDC CERTIFICATE PATH
    private String keystorePassword = "keystore_password"; //CHANGE IT TO YOUR KEYSTORE PASSWORD
    private String keyAlias = "key_alias"; //CHANGE IT TO YOUR KEY ALIAS
    private String keyPassword = "key_password"; //CHANGE IT TO YOUR KEY PASSWORD

    private String usernameCDC = "username"; //CHANGE IT TO YOUR CDC USERNAME
    private String passwordCDC = "password"; //CHANGE IT TO YOUR CDC PASSWORD

    private String url = "https://services.circulodecredito.com.mx/v1/fis2022 ";
    private String xApiKey = "your_apikey"; //CHANGE IT TO YOUR API KEY


    private SignerInterceptor interceptor;

    @Before()
    public void Setup() {
        this.apiClient = api.getApiClient();
        this.apiClient.setBasePath(url);
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(new SignerInterceptor(
                        keystoreFile,
                        cdcCertFile,
                        keystorePassword,
                        keyAlias,
                        keyPassword))
                .build();
        apiClient.setHttpClient(okHttpClient);
    }

    @Test
    public void devuelveelScoreFISTest() throws Exception {

        RequestDatosGenerales requestDatosGenerales = new RequestDatosGenerales();
        Request body = new Request();
        RequestFolios requestFolios = new RequestFolios();

        requestDatosGenerales.setPrimerNombre("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setApellidoPaterno("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setApellidoMaterno("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setFechaNacimiento("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setDireccion("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setColoniaPoblacion("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setCiudad("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setEstado("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setPais("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setDelegacionMunicipio("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setCp("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setRfc("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setCurp("null"); //CHANGE TO VALID DATA
        requestDatosGenerales.setFolioOtorgante("NULL"); //CHANGE TO VALID DATA

        requestFolios.setFolioConsulta("NULL"); //CHANGE TO VALID DATA
        requestFolios.setFolioOtorgante("NULL"); //CHANGE TO VALID DATA

        body.setRequestFolios(requestFolios);

        String contentType = "application/json";
        ResponseScore response = api.devuelveelScoreFIS( xApiKey, usernameCDC, passwordCDC, requestFolios, contentType);
    }
    
}
