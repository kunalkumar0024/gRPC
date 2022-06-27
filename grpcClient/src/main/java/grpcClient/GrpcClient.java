package grpcClient;

import com.kunal.grpc.User.APIResponse;
import com.kunal.grpc.User.LoginRequest;
import com.kunal.grpc.userGrpc;
import com.kunal.grpc.userGrpc.userBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagedChannel channel=	ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
        userBlockingStub userStub=userGrpc.newBlockingStub(channel);
        LoginRequest loginRequest=LoginRequest.newBuilder().setUsername("Kunal").setPassword("Kunal").build();
	    APIResponse response=userStub.login(loginRequest);
	    System.out.println(response.getResponsemessage());
	    
	    channel.shutdown();
	}

}
