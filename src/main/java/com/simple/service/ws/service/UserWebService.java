package com.simple.service.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.simple.domain.User;

@WebService
public interface UserWebService {
 
     @WebMethod
     String getName(@WebParam(name = "userId") String userId);
     @WebMethod
     User getUser(String userId);
 }
