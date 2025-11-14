package com.example.Consumer_App02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumerApp02Application {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApp02Application.class, args);

        //create header object to passuser name password in hrader
        HttpHeaders headers = new HttpHeaders();
       headers.setBasicAuth("arjun","Arjun@12345");

       //send header to request
        HttpEntity<String>reEntity= new HttpEntity<>(headers);

        String apiUrl ="http://localhost:8080/msg";

        //want to accees  provider secured api
        RestTemplate rt = new RestTemplate();
        ResponseEntity<String> forEntity=
                //rt.getForEntity(apiUrl,String.class);
                rt.exchange(apiUrl, HttpMethod.GET, reEntity, String.class);
        System.out.println(forEntity.getBody());
	}

}
