package com.yyl.flyplus.utils;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
* @Description:    Http请求通信
* @Author:         Truth
* @CreateDate:     2019/4/21 15:42
* @Version:        1.0
*/
public class HttpUtils {
    private static final Logger logger = LoggerFactory.getLogger(HttpUtils.class);

    public static final String UTF_8 = "utf-8";

    /**
     * 发送http get 请求
     *
     * @return
     */
    public static String httpGet(String url) throws Exception {

        return httpGet(url, null, null);
    }


    /**
     * 发送http get 请求
     *
     * @return
     */
    public static String httpGet(String url, Header header) throws Exception {

        return httpGet(url, header, null);
    }

    /**
     * 发送http get 请求
     *
     * @return
     */
    public static String httpGet(String url,  List<NameValuePair> list) throws Exception {

        return httpGet(url, null, list);
    }

    public static String httpGet(String url, Map header) throws Exception {

        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
//            if (list != null && list.size() > 0) {
//                String params = EntityUtils.toString(new UrlEncodedFormEntity(list, UTF_8));
//                url = url + "?" + params;
//            }
            HttpGet httpget = new HttpGet(url);
            if (header != null) {
                Iterator<Map.Entry<String,String>> it = header.entrySet().iterator();
                while (it.hasNext()){
                    Map.Entry<String,String> entry =it.next();
                    httpget.addHeader(entry.getKey(),entry.getValue());
                }
            }
            // Create a custom response handler
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
                @Override
                public String handleResponse(final HttpResponse response) throws IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Unexpected response  status: " + status);
                    }
                }
            };
            return httpclient.execute(httpget, responseHandler);
        } finally {
            httpclient.close();
        }
    }


    /**
     * 发送http get 请求
     *
     * @return
     */
    public static String httpGet(String url, Header header, List<NameValuePair> list) throws Exception {

        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            if (list != null && list.size() > 0) {
                String params = EntityUtils.toString(new UrlEncodedFormEntity(list, UTF_8));
                url = url + "?" + params;
            }
            HttpGet httpget = new HttpGet(url);
            if (header != null) {
                httpget.addHeader(header);
            }

            // Create a custom response handler
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

                @Override
                public String handleResponse(final HttpResponse response) throws IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Unexpected response status: " + status);
                    }
                }

            };
            return httpclient.execute(httpget, responseHandler);
        } finally {
            httpclient.close();
        }
    }

    public static String httpPost(String url, List<NameValuePair> params) {

        String uriAPI = url;
        String result = "";
        HttpPost httpRequest = new HttpPost(uriAPI);
        CloseableHttpClient httpclient = HttpClients.createDefault();

        try {
            httpRequest.setEntity(new UrlEncodedFormEntity(params, UTF_8));
            HttpResponse httpResponse = httpclient.execute(httpRequest);
            if (httpResponse.getStatusLine().getStatusCode() == 200) {
                HttpEntity httpEntity = httpResponse.getEntity();
                result = EntityUtils.toString(httpEntity);
            }
        } catch (IOException e) {
            logger.error("http post error", e);
            result = e.getMessage();
        }
        return result;
    }

    public static String httpPost(String url, Header header, String params) throws IOException {

        //Post方式没有参数在这里
        String uriAPI = url;
        String result = "";
        HttpPost httpRequest = new HttpPost(uriAPI);
        CloseableHttpClient httpclient = HttpClients.createDefault();

        httpRequest.setHeader(header);
        httpRequest.setEntity(new StringEntity(params,UTF_8));
        HttpResponse httpResponse = httpclient.execute(httpRequest);
        if (httpResponse.getStatusLine().getStatusCode() == 200) {
            HttpEntity httpEntity = httpResponse.getEntity();
            result = EntityUtils.toString(httpEntity);
        }
        return result;
    }

    public static String httpPostWithJson(String url, String JsonStr) {
        HttpClient httpClient = HttpClientBuilder.create().build();
        String result = "";
        try {
            HttpPost request = new HttpPost(url);
            request.setHeader("Content-Type", "application/json;charset=UTF-8");
            StringEntity entity = new StringEntity(JsonStr, UTF_8);
//            entity.setContentEncoding(UTF_8);
            entity.setContentType("application/json");
            request.setEntity(entity);
            HttpResponse response = httpClient.execute(request);
            if (response.getStatusLine().getStatusCode() >= 200 && response.getStatusLine().getStatusCode() < 300) {
                HttpEntity httpEntity = response.getEntity();
                result = EntityUtils.toString(httpEntity, Charset.forName(UTF_8));
            }

        } catch (Exception e) {
            logger.error("http post json error", e);
            result = e.getMessage();
        }
        return result;
    }

    public static String httpPostWithJson(String url, String JsonStr, String token) {
        HttpClient httpClient = HttpClientBuilder.create().build();
        String result = "";
        try {
            HttpPost request = new HttpPost(url);
            request.setHeader("Content-Type", "application/json;charset=UTF-8");
            request.setHeader("X-TOKEN",token);
            StringEntity entity = new StringEntity(JsonStr, UTF_8);
//            entity.setContentEncoding(UTF_8);
            entity.setContentType("application/json");
            request.setEntity(entity);
            HttpResponse response = httpClient.execute(request);
            if (response.getStatusLine().getStatusCode() >= 200 && response.getStatusLine().getStatusCode() < 300) {
                HttpEntity httpEntity = response.getEntity();
                result = EntityUtils.toString(httpEntity, Charset.forName(UTF_8)).concat("success");
            }

        } catch (Exception e) {
            logger.error("http post json error", e);
            result = e.getMessage();
        }
        return result;
    }
}
