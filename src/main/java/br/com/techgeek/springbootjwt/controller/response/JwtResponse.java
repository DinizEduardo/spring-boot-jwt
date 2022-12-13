package br.com.techgeek.springbootjwt.controller.response;

import java.io.Serializable;

public class JwtResponse implements Serializable {

    private static final long serialVersionUID = 2017076873901111909L;

    private final String jwttoken;

    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getToken() {
        return this.jwttoken;
    }
}