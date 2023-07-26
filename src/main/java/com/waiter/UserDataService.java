package com.waiter;

import com.example.userrequest.UserDataRequest;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(targetNamespace = "http://example.com/userrequest")
public interface UserDataService {

    @WebMethod(operationName = "UserDataRequest")
    void add(@WebParam(name = "options") UserDataRequest request);
}

/*
 * URL: http://localhost:8080/user
 * 
 * Example request
 * <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:user="http://example.com/userrequest">
   <soapenv:Header/>
   <soapenv:Body>
      <user:UserDataRequest>
        <options>
           <user:name>John Doe</user:name>
            <user:age>30</user:age>
         </options>
      </user:UserDataRequest>
   </soapenv:Body>
</soapenv:Envelope>
 */