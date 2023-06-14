package com.grpc.demo.service;
import com.chatapp.gprc.chat.*;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ChatServiceImpl extends ChatServiceGrpc.ChatServiceImplBase {

    @Override
    public void sendMessage(MessageRequest request, StreamObserver<MessageResponse> responseObserver) {
        String message = request.getMessage();
        String reply = "Received: " + message;
        MessageResponse response = MessageResponse.newBuilder().setReply(reply).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}