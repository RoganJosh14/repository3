package Authorization;

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
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Login.proto")
public final class AuthorizationGrpc {

  private AuthorizationGrpc() {}

  public static final String SERVICE_NAME = "Access.Authorization";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Authorization.LoginRequest,
      Authorization.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = Authorization.LoginRequest.class,
      responseType = Authorization.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Authorization.LoginRequest,
      Authorization.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<Authorization.LoginRequest, Authorization.LoginResponse> getLoginMethod;
    if ((getLoginMethod = AuthorizationGrpc.getLoginMethod) == null) {
      synchronized (AuthorizationGrpc.class) {
        if ((getLoginMethod = AuthorizationGrpc.getLoginMethod) == null) {
          AuthorizationGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<Authorization.LoginRequest, Authorization.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Access.Authorization", "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Authorization.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Authorization.LoginResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthorizationMethodDescriptorSupplier("Login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Authorization.Message,
      Authorization.Empty> getEmptyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "empty",
      requestType = Authorization.Message.class,
      responseType = Authorization.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Authorization.Message,
      Authorization.Empty> getEmptyMethod() {
    io.grpc.MethodDescriptor<Authorization.Message, Authorization.Empty> getEmptyMethod;
    if ((getEmptyMethod = AuthorizationGrpc.getEmptyMethod) == null) {
      synchronized (AuthorizationGrpc.class) {
        if ((getEmptyMethod = AuthorizationGrpc.getEmptyMethod) == null) {
          AuthorizationGrpc.getEmptyMethod = getEmptyMethod = 
              io.grpc.MethodDescriptor.<Authorization.Message, Authorization.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Access.Authorization", "empty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Authorization.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Authorization.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthorizationMethodDescriptorSupplier("empty"))
                  .build();
          }
        }
     }
     return getEmptyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Authorization.FloorUnitSelectionRequest,
      Authorization.FloorUnitSelectionResponse> getFloorUnitSelectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FloorUnitSelection",
      requestType = Authorization.FloorUnitSelectionRequest.class,
      responseType = Authorization.FloorUnitSelectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Authorization.FloorUnitSelectionRequest,
      Authorization.FloorUnitSelectionResponse> getFloorUnitSelectionMethod() {
    io.grpc.MethodDescriptor<Authorization.FloorUnitSelectionRequest, Authorization.FloorUnitSelectionResponse> getFloorUnitSelectionMethod;
    if ((getFloorUnitSelectionMethod = AuthorizationGrpc.getFloorUnitSelectionMethod) == null) {
      synchronized (AuthorizationGrpc.class) {
        if ((getFloorUnitSelectionMethod = AuthorizationGrpc.getFloorUnitSelectionMethod) == null) {
          AuthorizationGrpc.getFloorUnitSelectionMethod = getFloorUnitSelectionMethod = 
              io.grpc.MethodDescriptor.<Authorization.FloorUnitSelectionRequest, Authorization.FloorUnitSelectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Access.Authorization", "FloorUnitSelection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Authorization.FloorUnitSelectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Authorization.FloorUnitSelectionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthorizationMethodDescriptorSupplier("FloorUnitSelection"))
                  .build();
          }
        }
     }
     return getFloorUnitSelectionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthorizationStub newStub(io.grpc.Channel channel) {
    return new AuthorizationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthorizationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthorizationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthorizationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthorizationFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class AuthorizationImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc method for unary calls
     * </pre>
     */
    public void login(Authorization.LoginRequest request,
        io.grpc.stub.StreamObserver<Authorization.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void empty(Authorization.Message request,
        io.grpc.stub.StreamObserver<Authorization.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEmptyMethod(), responseObserver);
    }

    /**
     */
    public void floorUnitSelection(Authorization.FloorUnitSelectionRequest request,
        io.grpc.stub.StreamObserver<Authorization.FloorUnitSelectionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFloorUnitSelectionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Authorization.LoginRequest,
                Authorization.LoginResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getEmptyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Authorization.Message,
                Authorization.Empty>(
                  this, METHODID_EMPTY)))
          .addMethod(
            getFloorUnitSelectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Authorization.FloorUnitSelectionRequest,
                Authorization.FloorUnitSelectionResponse>(
                  this, METHODID_FLOOR_UNIT_SELECTION)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AuthorizationStub extends io.grpc.stub.AbstractStub<AuthorizationStub> {
    private AuthorizationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorizationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorizationStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for unary calls
     * </pre>
     */
    public void login(Authorization.LoginRequest request,
        io.grpc.stub.StreamObserver<Authorization.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void empty(Authorization.Message request,
        io.grpc.stub.StreamObserver<Authorization.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmptyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void floorUnitSelection(Authorization.FloorUnitSelectionRequest request,
        io.grpc.stub.StreamObserver<Authorization.FloorUnitSelectionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFloorUnitSelectionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AuthorizationBlockingStub extends io.grpc.stub.AbstractStub<AuthorizationBlockingStub> {
    private AuthorizationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorizationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorizationBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for unary calls
     * </pre>
     */
    public Authorization.LoginResponse login(Authorization.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public Authorization.Empty empty(Authorization.Message request) {
      return blockingUnaryCall(
          getChannel(), getEmptyMethod(), getCallOptions(), request);
    }

    /**
     */
    public Authorization.FloorUnitSelectionResponse floorUnitSelection(Authorization.FloorUnitSelectionRequest request) {
      return blockingUnaryCall(
          getChannel(), getFloorUnitSelectionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AuthorizationFutureStub extends io.grpc.stub.AbstractStub<AuthorizationFutureStub> {
    private AuthorizationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorizationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorizationFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for unary calls
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Authorization.LoginResponse> login(
        Authorization.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Authorization.Empty> empty(
        Authorization.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getEmptyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Authorization.FloorUnitSelectionResponse> floorUnitSelection(
        Authorization.FloorUnitSelectionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFloorUnitSelectionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_EMPTY = 1;
  private static final int METHODID_FLOOR_UNIT_SELECTION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthorizationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthorizationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((Authorization.LoginRequest) request,
              (io.grpc.stub.StreamObserver<Authorization.LoginResponse>) responseObserver);
          break;
        case METHODID_EMPTY:
          serviceImpl.empty((Authorization.Message) request,
              (io.grpc.stub.StreamObserver<Authorization.Empty>) responseObserver);
          break;
        case METHODID_FLOOR_UNIT_SELECTION:
          serviceImpl.floorUnitSelection((Authorization.FloorUnitSelectionRequest) request,
              (io.grpc.stub.StreamObserver<Authorization.FloorUnitSelectionResponse>) responseObserver);
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

  private static abstract class AuthorizationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthorizationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Authorization.AServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Authorization");
    }
  }

  private static final class AuthorizationFileDescriptorSupplier
      extends AuthorizationBaseDescriptorSupplier {
    AuthorizationFileDescriptorSupplier() {}
  }

  private static final class AuthorizationMethodDescriptorSupplier
      extends AuthorizationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthorizationMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthorizationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthorizationFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getEmptyMethod())
              .addMethod(getFloorUnitSelectionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
