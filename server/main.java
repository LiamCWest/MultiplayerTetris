import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import api.*;

import java.io.IOException;

public class Main {
    private static final int PORT = 50051;

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(PORT)
                .addService(new TetrisServiceImpl())
                .build()
                .start();
        System.out.println("Server started, listening on " + PORT);

        server.awaitTermination();
    }

    static class TetrisServiceImpl extends TetrisServiceGrpc.TetrisServiceImplBase {
        @Override
        public void joinGame(JoinGameRequest request, StreamObserver<JoinGameResponse> responseObserver) {
            // Handle join game request
        }

        @Override
        public void sendMove(SendMoveRequest request, StreamObserver<SendMoveResponse> responseObserver) {
            // Handle send move request
        }

        @Override
        public void getGameState(GetGameStateRequest request, StreamObserver<GetGameStateResponse> responseObserver) {
            // Handle get game state request
        }
    }
}