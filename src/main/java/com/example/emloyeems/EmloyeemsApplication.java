package com.example.emloyeems;

import com.example.emloyeems.DbConn.DbCon;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Connection;

@SpringBootApplication
public class EmloyeemsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmloyeemsApplication.class, args);

        System.out.println("---- Program Started ----");
        System.setProperty("https.protocols", "TLSv1.2");
        System.setProperty("https.cipherSuites", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");

        try (Connection conn = new DbCon().getConn()){

            if (conn != null) {
                System.out.println("********* DB Connected **********");

            } else {
                throw new Exception("******** Db Connection Failed **********", null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
