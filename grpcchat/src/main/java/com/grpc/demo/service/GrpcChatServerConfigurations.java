package com.grpc.demo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.grpc.Server;
import io.grpc.ServerBuilder;

@Configuration
public class GrpcChatServerConfigurations {

   @Bean
    public Server grpcServer(ChatServiceImpl chatService) {
        return ServerBuilder.forPort(8000)
                .addService(chatService)
                .build();
    }
}
