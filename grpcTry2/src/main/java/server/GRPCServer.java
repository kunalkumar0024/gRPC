package server;

import java.io.IOException;

import com.kunal.grpc.user.UserService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GRPCServer {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		 System.out.println("starting GRPC Server");
		 Server server = ServerBuilder.forPort(9090).addService(

				 new UserService()).build();
		 
		 server.start();
		 System.out.println("server started at "+ server.getPort());
	        server.awaitTermination();

	}

}
