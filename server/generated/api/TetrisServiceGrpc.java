package api;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Define the TetrisService service, which provides methods for connecting to the game server, disconnecting from the game server, creating a new game, joining an existing game, and moving the current piece.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.28.1)",
    comments = "Source: tetris.proto")
public final class TetrisServiceGrpc {

  private TetrisServiceGrpc() {}

  public static final String SERVICE_NAME = "api.TetrisService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.Tetris.ConnectRequest,
      api.Tetris.ConnectResponse> getConnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Connect",
      requestType = api.Tetris.ConnectRequest.class,
      responseType = api.Tetris.ConnectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.Tetris.ConnectRequest,
      api.Tetris.ConnectResponse> getConnectMethod() {
    io.grpc.MethodDescriptor<api.Tetris.ConnectRequest, api.Tetris.ConnectResponse> getConnectMethod;
    if ((getConnectMethod = TetrisServiceGrpc.getConnectMethod) == null) {
      synchronized (TetrisServiceGrpc.class) {
        if ((getConnectMethod = TetrisServiceGrpc.getConnectMethod) == null) {
          TetrisServiceGrpc.getConnectMethod = getConnectMethod =
              io.grpc.MethodDescriptor.<api.Tetris.ConnectRequest, api.Tetris.ConnectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Connect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.Tetris.ConnectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.Tetris.ConnectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TetrisServiceMethodDescriptorSupplier("Connect"))
              .build();
        }
      }
    }
    return getConnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.Tetris.DisconnectRequest,
      api.Tetris.DisconnectResponse> getDisconnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Disconnect",
      requestType = api.Tetris.DisconnectRequest.class,
      responseType = api.Tetris.DisconnectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.Tetris.DisconnectRequest,
      api.Tetris.DisconnectResponse> getDisconnectMethod() {
    io.grpc.MethodDescriptor<api.Tetris.DisconnectRequest, api.Tetris.DisconnectResponse> getDisconnectMethod;
    if ((getDisconnectMethod = TetrisServiceGrpc.getDisconnectMethod) == null) {
      synchronized (TetrisServiceGrpc.class) {
        if ((getDisconnectMethod = TetrisServiceGrpc.getDisconnectMethod) == null) {
          TetrisServiceGrpc.getDisconnectMethod = getDisconnectMethod =
              io.grpc.MethodDescriptor.<api.Tetris.DisconnectRequest, api.Tetris.DisconnectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Disconnect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.Tetris.DisconnectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.Tetris.DisconnectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TetrisServiceMethodDescriptorSupplier("Disconnect"))
              .build();
        }
      }
    }
    return getDisconnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.Tetris.CreateGameRequest,
      api.Tetris.CreateGameResponse> getCreateGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGame",
      requestType = api.Tetris.CreateGameRequest.class,
      responseType = api.Tetris.CreateGameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.Tetris.CreateGameRequest,
      api.Tetris.CreateGameResponse> getCreateGameMethod() {
    io.grpc.MethodDescriptor<api.Tetris.CreateGameRequest, api.Tetris.CreateGameResponse> getCreateGameMethod;
    if ((getCreateGameMethod = TetrisServiceGrpc.getCreateGameMethod) == null) {
      synchronized (TetrisServiceGrpc.class) {
        if ((getCreateGameMethod = TetrisServiceGrpc.getCreateGameMethod) == null) {
          TetrisServiceGrpc.getCreateGameMethod = getCreateGameMethod =
              io.grpc.MethodDescriptor.<api.Tetris.CreateGameRequest, api.Tetris.CreateGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.Tetris.CreateGameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.Tetris.CreateGameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TetrisServiceMethodDescriptorSupplier("CreateGame"))
              .build();
        }
      }
    }
    return getCreateGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.Tetris.JoinGameRequest,
      api.Tetris.JoinGameResponse> getJoinGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JoinGame",
      requestType = api.Tetris.JoinGameRequest.class,
      responseType = api.Tetris.JoinGameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.Tetris.JoinGameRequest,
      api.Tetris.JoinGameResponse> getJoinGameMethod() {
    io.grpc.MethodDescriptor<api.Tetris.JoinGameRequest, api.Tetris.JoinGameResponse> getJoinGameMethod;
    if ((getJoinGameMethod = TetrisServiceGrpc.getJoinGameMethod) == null) {
      synchronized (TetrisServiceGrpc.class) {
        if ((getJoinGameMethod = TetrisServiceGrpc.getJoinGameMethod) == null) {
          TetrisServiceGrpc.getJoinGameMethod = getJoinGameMethod =
              io.grpc.MethodDescriptor.<api.Tetris.JoinGameRequest, api.Tetris.JoinGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JoinGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.Tetris.JoinGameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.Tetris.JoinGameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TetrisServiceMethodDescriptorSupplier("JoinGame"))
              .build();
        }
      }
    }
    return getJoinGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.Tetris.MovePieceRequest,
      api.Tetris.MovePieceResponse> getMovePieceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MovePiece",
      requestType = api.Tetris.MovePieceRequest.class,
      responseType = api.Tetris.MovePieceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.Tetris.MovePieceRequest,
      api.Tetris.MovePieceResponse> getMovePieceMethod() {
    io.grpc.MethodDescriptor<api.Tetris.MovePieceRequest, api.Tetris.MovePieceResponse> getMovePieceMethod;
    if ((getMovePieceMethod = TetrisServiceGrpc.getMovePieceMethod) == null) {
      synchronized (TetrisServiceGrpc.class) {
        if ((getMovePieceMethod = TetrisServiceGrpc.getMovePieceMethod) == null) {
          TetrisServiceGrpc.getMovePieceMethod = getMovePieceMethod =
              io.grpc.MethodDescriptor.<api.Tetris.MovePieceRequest, api.Tetris.MovePieceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MovePiece"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.Tetris.MovePieceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.Tetris.MovePieceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TetrisServiceMethodDescriptorSupplier("MovePiece"))
              .build();
        }
      }
    }
    return getMovePieceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.Tetris.GameState,
      api.Tetris.Empty> getUpdateGameStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGameState",
      requestType = api.Tetris.GameState.class,
      responseType = api.Tetris.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.Tetris.GameState,
      api.Tetris.Empty> getUpdateGameStateMethod() {
    io.grpc.MethodDescriptor<api.Tetris.GameState, api.Tetris.Empty> getUpdateGameStateMethod;
    if ((getUpdateGameStateMethod = TetrisServiceGrpc.getUpdateGameStateMethod) == null) {
      synchronized (TetrisServiceGrpc.class) {
        if ((getUpdateGameStateMethod = TetrisServiceGrpc.getUpdateGameStateMethod) == null) {
          TetrisServiceGrpc.getUpdateGameStateMethod = getUpdateGameStateMethod =
              io.grpc.MethodDescriptor.<api.Tetris.GameState, api.Tetris.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGameState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.Tetris.GameState.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.Tetris.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TetrisServiceMethodDescriptorSupplier("UpdateGameState"))
              .build();
        }
      }
    }
    return getUpdateGameStateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TetrisServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TetrisServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TetrisServiceStub>() {
        @java.lang.Override
        public TetrisServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TetrisServiceStub(channel, callOptions);
        }
      };
    return TetrisServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TetrisServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TetrisServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TetrisServiceBlockingStub>() {
        @java.lang.Override
        public TetrisServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TetrisServiceBlockingStub(channel, callOptions);
        }
      };
    return TetrisServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TetrisServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TetrisServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TetrisServiceFutureStub>() {
        @java.lang.Override
        public TetrisServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TetrisServiceFutureStub(channel, callOptions);
        }
      };
    return TetrisServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Define the TetrisService service, which provides methods for connecting to the game server, disconnecting from the game server, creating a new game, joining an existing game, and moving the current piece.
   * </pre>
   */
  public static abstract class TetrisServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Connect to the game server.
     * </pre>
     */
    public void connect(api.Tetris.ConnectRequest request,
        io.grpc.stub.StreamObserver<api.Tetris.ConnectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConnectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Disconnect from the game server.
     * </pre>
     */
    public void disconnect(api.Tetris.DisconnectRequest request,
        io.grpc.stub.StreamObserver<api.Tetris.DisconnectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDisconnectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new game.
     * </pre>
     */
    public void createGame(api.Tetris.CreateGameRequest request,
        io.grpc.stub.StreamObserver<api.Tetris.CreateGameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateGameMethod(), responseObserver);
    }

    /**
     * <pre>
     * Join an existing game.
     * </pre>
     */
    public void joinGame(api.Tetris.JoinGameRequest request,
        io.grpc.stub.StreamObserver<api.Tetris.JoinGameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getJoinGameMethod(), responseObserver);
    }

    /**
     * <pre>
     * Move the current piece.
     * </pre>
     */
    public void movePiece(api.Tetris.MovePieceRequest request,
        io.grpc.stub.StreamObserver<api.Tetris.MovePieceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMovePieceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Define the UpdateGameState method, which is used by the server to update the game state and send the updated game state to all players in the game.
     * </pre>
     */
    public void updateGameState(api.Tetris.GameState request,
        io.grpc.stub.StreamObserver<api.Tetris.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateGameStateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConnectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                api.Tetris.ConnectRequest,
                api.Tetris.ConnectResponse>(
                  this, METHODID_CONNECT)))
          .addMethod(
            getDisconnectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                api.Tetris.DisconnectRequest,
                api.Tetris.DisconnectResponse>(
                  this, METHODID_DISCONNECT)))
          .addMethod(
            getCreateGameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                api.Tetris.CreateGameRequest,
                api.Tetris.CreateGameResponse>(
                  this, METHODID_CREATE_GAME)))
          .addMethod(
            getJoinGameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                api.Tetris.JoinGameRequest,
                api.Tetris.JoinGameResponse>(
                  this, METHODID_JOIN_GAME)))
          .addMethod(
            getMovePieceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                api.Tetris.MovePieceRequest,
                api.Tetris.MovePieceResponse>(
                  this, METHODID_MOVE_PIECE)))
          .addMethod(
            getUpdateGameStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                api.Tetris.GameState,
                api.Tetris.Empty>(
                  this, METHODID_UPDATE_GAME_STATE)))
          .build();
    }
  }

  /**
   * <pre>
   * Define the TetrisService service, which provides methods for connecting to the game server, disconnecting from the game server, creating a new game, joining an existing game, and moving the current piece.
   * </pre>
   */
  public static final class TetrisServiceStub extends io.grpc.stub.AbstractAsyncStub<TetrisServiceStub> {
    private TetrisServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TetrisServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TetrisServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Connect to the game server.
     * </pre>
     */
    public void connect(api.Tetris.ConnectRequest request,
        io.grpc.stub.StreamObserver<api.Tetris.ConnectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Disconnect from the game server.
     * </pre>
     */
    public void disconnect(api.Tetris.DisconnectRequest request,
        io.grpc.stub.StreamObserver<api.Tetris.DisconnectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisconnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new game.
     * </pre>
     */
    public void createGame(api.Tetris.CreateGameRequest request,
        io.grpc.stub.StreamObserver<api.Tetris.CreateGameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Join an existing game.
     * </pre>
     */
    public void joinGame(api.Tetris.JoinGameRequest request,
        io.grpc.stub.StreamObserver<api.Tetris.JoinGameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getJoinGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Move the current piece.
     * </pre>
     */
    public void movePiece(api.Tetris.MovePieceRequest request,
        io.grpc.stub.StreamObserver<api.Tetris.MovePieceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMovePieceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Define the UpdateGameState method, which is used by the server to update the game state and send the updated game state to all players in the game.
     * </pre>
     */
    public void updateGameState(api.Tetris.GameState request,
        io.grpc.stub.StreamObserver<api.Tetris.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateGameStateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Define the TetrisService service, which provides methods for connecting to the game server, disconnecting from the game server, creating a new game, joining an existing game, and moving the current piece.
   * </pre>
   */
  public static final class TetrisServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TetrisServiceBlockingStub> {
    private TetrisServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TetrisServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TetrisServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Connect to the game server.
     * </pre>
     */
    public api.Tetris.ConnectResponse connect(api.Tetris.ConnectRequest request) {
      return blockingUnaryCall(
          getChannel(), getConnectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Disconnect from the game server.
     * </pre>
     */
    public api.Tetris.DisconnectResponse disconnect(api.Tetris.DisconnectRequest request) {
      return blockingUnaryCall(
          getChannel(), getDisconnectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new game.
     * </pre>
     */
    public api.Tetris.CreateGameResponse createGame(api.Tetris.CreateGameRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateGameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Join an existing game.
     * </pre>
     */
    public api.Tetris.JoinGameResponse joinGame(api.Tetris.JoinGameRequest request) {
      return blockingUnaryCall(
          getChannel(), getJoinGameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Move the current piece.
     * </pre>
     */
    public api.Tetris.MovePieceResponse movePiece(api.Tetris.MovePieceRequest request) {
      return blockingUnaryCall(
          getChannel(), getMovePieceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Define the UpdateGameState method, which is used by the server to update the game state and send the updated game state to all players in the game.
     * </pre>
     */
    public api.Tetris.Empty updateGameState(api.Tetris.GameState request) {
      return blockingUnaryCall(
          getChannel(), getUpdateGameStateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Define the TetrisService service, which provides methods for connecting to the game server, disconnecting from the game server, creating a new game, joining an existing game, and moving the current piece.
   * </pre>
   */
  public static final class TetrisServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TetrisServiceFutureStub> {
    private TetrisServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TetrisServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TetrisServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Connect to the game server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.Tetris.ConnectResponse> connect(
        api.Tetris.ConnectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConnectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Disconnect from the game server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.Tetris.DisconnectResponse> disconnect(
        api.Tetris.DisconnectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDisconnectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new game.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.Tetris.CreateGameResponse> createGame(
        api.Tetris.CreateGameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateGameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Join an existing game.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.Tetris.JoinGameResponse> joinGame(
        api.Tetris.JoinGameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getJoinGameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Move the current piece.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.Tetris.MovePieceResponse> movePiece(
        api.Tetris.MovePieceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMovePieceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Define the UpdateGameState method, which is used by the server to update the game state and send the updated game state to all players in the game.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.Tetris.Empty> updateGameState(
        api.Tetris.GameState request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateGameStateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONNECT = 0;
  private static final int METHODID_DISCONNECT = 1;
  private static final int METHODID_CREATE_GAME = 2;
  private static final int METHODID_JOIN_GAME = 3;
  private static final int METHODID_MOVE_PIECE = 4;
  private static final int METHODID_UPDATE_GAME_STATE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TetrisServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TetrisServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONNECT:
          serviceImpl.connect((api.Tetris.ConnectRequest) request,
              (io.grpc.stub.StreamObserver<api.Tetris.ConnectResponse>) responseObserver);
          break;
        case METHODID_DISCONNECT:
          serviceImpl.disconnect((api.Tetris.DisconnectRequest) request,
              (io.grpc.stub.StreamObserver<api.Tetris.DisconnectResponse>) responseObserver);
          break;
        case METHODID_CREATE_GAME:
          serviceImpl.createGame((api.Tetris.CreateGameRequest) request,
              (io.grpc.stub.StreamObserver<api.Tetris.CreateGameResponse>) responseObserver);
          break;
        case METHODID_JOIN_GAME:
          serviceImpl.joinGame((api.Tetris.JoinGameRequest) request,
              (io.grpc.stub.StreamObserver<api.Tetris.JoinGameResponse>) responseObserver);
          break;
        case METHODID_MOVE_PIECE:
          serviceImpl.movePiece((api.Tetris.MovePieceRequest) request,
              (io.grpc.stub.StreamObserver<api.Tetris.MovePieceResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GAME_STATE:
          serviceImpl.updateGameState((api.Tetris.GameState) request,
              (io.grpc.stub.StreamObserver<api.Tetris.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TetrisServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TetrisServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return api.Tetris.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TetrisService");
    }
  }

  private static final class TetrisServiceFileDescriptorSupplier
      extends TetrisServiceBaseDescriptorSupplier {
    TetrisServiceFileDescriptorSupplier() {}
  }

  private static final class TetrisServiceMethodDescriptorSupplier
      extends TetrisServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TetrisServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TetrisServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TetrisServiceFileDescriptorSupplier())
              .addMethod(getConnectMethod())
              .addMethod(getDisconnectMethod())
              .addMethod(getCreateGameMethod())
              .addMethod(getJoinGameMethod())
              .addMethod(getMovePieceMethod())
              .addMethod(getUpdateGameStateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
