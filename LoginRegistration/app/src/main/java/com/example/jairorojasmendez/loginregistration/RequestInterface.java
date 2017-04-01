package com.example.jairorojasmendez.loginregistration;

import com.example.jairorojasmendez.loginregistration.models.ServerRequest;
import com.example.jairorojasmendez.loginregistration.models.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("learn2crack-login-register/")
    call<ServerResponse> operation(@Body ServerRequest request);

}
