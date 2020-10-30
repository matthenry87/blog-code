package com.matthery87.blogcode.resttemplatelogging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.net.URI;
import java.util.Collection;

@Slf4j
class LoggingInterceptor implements ClientHttpRequestInterceptor {

    @Override
    public ClientHttpResponse intercept(HttpRequest httpRequest, byte[] bytes,
                                        ClientHttpRequestExecution clientHttpRequestExecution) throws IOException {

        URI uri = httpRequest.getURI();

        log.info("Sending request to {}", uri);

        ClientHttpResponse response = clientHttpRequestExecution.execute(httpRequest, bytes);

        log.info("Received response from {} with status code {}", uri, response.getRawStatusCode());

        return response;
    }
}
