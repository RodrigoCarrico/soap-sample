package com.waiter;


import org.springframework.stereotype.Service;

import com.example.userrequest.UserDataRequest;


@Service
public class UserDataServiceImpl implements UserDataService {

    @Override
    public void add(UserDataRequest  request) {
        // Aqui você pode acessar os dados aleatórios recebidos pelo serviço
        String name = request.getName();
        int age = request.getAge();

        // Faça o que for necessário com os dados recebidos
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
    }
   
}
