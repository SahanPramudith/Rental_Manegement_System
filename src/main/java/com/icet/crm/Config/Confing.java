package com.icet.crm.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Confing {
    @Bean
    public ModelMapper getModelMpper(){
        return new ModelMapper();
    }
}
