package com.sparta.spacexapi.httpcaller;

import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.sparta.spacexapi.propertysetup.Properties;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HTTPManager {

    private CloseableHttpResponse fullResponse;

    public void makeSingleCapsuleCall(String capsuleCode){

        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet getCapsules = new HttpGet(Properties.getBaseurl() + Properties.getCapsules() +"/" + capsuleCode);
            fullResponse = httpClient.execute(getCapsules);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void makePastCapsuleCall(){

        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet getCapsules = new HttpGet(Properties.getBaseurl() + Properties.getCapsules() + Properties.getPastCapsules());
            fullResponse = httpClient.execute(getCapsules);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void makeUpcomingCapsuleCall(){

        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet getCapsules = new HttpGet(Properties.getBaseurl() + Properties.getCapsules() + Properties.getUpcoming());
            fullResponse = httpClient.execute(getCapsules);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void makeSpacexCompanyInfoCall(){

        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet getCapsules = new HttpGet(Properties.getBaseurl() + Properties.getInfo());
            fullResponse = httpClient.execute(getCapsules);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getResponseBody(){
        String bodyResult = null;
        try{
            bodyResult = EntityUtils.toString(fullResponse.getEntity());
        }catch (IOException e){
            e.printStackTrace();
        }
        return bodyResult;
    }
}
