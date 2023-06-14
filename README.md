

# gRPC Sample Chat Application
This repository contains the code for a gRPC-based chat application. It allows clients to send messages and receive replies from a server using the gRPC protocol.
## Prerequisites
Before running this application, make sure you have the     following prerequisites installed on your system:
- Java JDK (version 17 or higher)
- Maven
- Protobuf (protobuf-java version 3.17.3)

## Getting Started
Follow the steps below to get started with the chat application:
1. Clone the repository to your local machine:  ```bash git clone <repository-url>`


2.  Compile and build the application using Maven:

bash code

- cd proto-files
- mvn clean install

3.  Run the gRPC server:

bash  code
- cd grpcchat
- mvn clean install
`java -jar target/chatgrpc.jar` 
- start or run jar with help of IDE

Usage
-----

To interact with the gRPC chat server, you can use any gRPC client. Follow the steps below to send requests and receive responses:

1.  Create a gRPC channel to connect to the server:

javaCopy code

`ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8000).usePlaintext().build();`

2.  Create a stub for the ChatService:

javacode

`ChatServiceGrpc.ChatServiceBlockingStub stub = ChatServiceGrpc.newBlockingStub(channel);`

3.  Create a message request:

java code

`MessageRequest request = MessageRequest.newBuilder().setMessage("Hello, server!").build();`

4.  Send the message request and receive the response:

javaCopy code

`MessageResponse response = stub.sendMessage(request);`

5.  Access the server's reply from the response:

javaCopy code

`System.out.println("Server reply: " + response.getReply());`

6.  Shutdown the channel when you are done:

java code

`channel.shutdown();`

Note: If you are running the server on a remote machine, replace "localhost" in the channel creation with the actual server address.

Protobuf Files
--------------

The application relies on the following protobuf files located in the `com.common.gprc` package:

*   `MessageRequest.proto`: Defines the message request structure with a single field `message` of type string.
*   `MessageResponse.proto`: Defines the message response structure with a single field `reply` of type string.

Feel free to modify these files to suit your application's needs.

License
-------

This project is licensed under the MIT License. Feel free to modify and use the code for your own purposes.

if it helps Follow me
- youtube @iamthatsoftwareguy
- insta @abhinavsinghvirsen
- facebook @iamthatsoftwareguy