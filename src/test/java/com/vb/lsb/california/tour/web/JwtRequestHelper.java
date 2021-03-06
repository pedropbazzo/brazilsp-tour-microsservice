package com.vb.lsb.sampa.tour.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import java.util.Arrays;

import com.vb.lsb.sampa.tour.model.Role;
import com.vb.lsb.sampa.tour.security.JwtProvider;

import static org.springframework.http.MediaType.APPLICATION_JSON;

/**
 * Helper class for creating HTTP Headers before invoking an API with TestRestClient.
 */
@Component
public class JwtRequestHelper {

    @Autowired
    private JwtProvider jwtProvider;

    /**
     * Generate the appropriate headers for JWT Authentication.
     *
     * @param roleName role identifier
     * @return Http Headers for Content-Type and Authorization
     */
    public HttpHeaders withRole(String roleName) {
        HttpHeaders headers = new HttpHeaders();
        Role r = new Role();
        r.setRoleName(roleName);
        String token = jwtProvider.createToken("anonymous", Arrays.asList(r));
        headers.setContentType(APPLICATION_JSON);
        headers.add("Authorization", "Bearer " + token);
        return headers;
    }
}
