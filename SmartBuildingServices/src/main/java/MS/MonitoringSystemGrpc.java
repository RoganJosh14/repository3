package MS;

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
    comments = "Source: MS.proto")
public final class MonitoringSystemGrpc {

  private MonitoringSystemGrpc() {}

  public static final String SERVICE_NAME = "MonitoringSystem.MonitoringSystem";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<MS.LiveDashboardRequest,
      MS.LiveDashboardResponse> getLiveDashboardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiveDashboard",
      requestType = MS.LiveDashboardRequest.class,
      responseType = MS.LiveDashboardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<MS.LiveDashboardRequest,
      MS.LiveDashboardResponse> getLiveDashboardMethod() {
    io.grpc.MethodDescriptor<MS.LiveDashboardRequest, MS.LiveDashboardResponse> getLiveDashboardMethod;
    if ((getLiveDashboardMethod = MonitoringSystemGrpc.getLiveDashboardMethod) == null) {
      synchronized (MonitoringSystemGrpc.class) {
        if ((getLiveDashboardMethod = MonitoringSystemGrpc.getLiveDashboardMethod) == null) {
          MonitoringSystemGrpc.getLiveDashboardMethod = getLiveDashboardMethod = 
              io.grpc.MethodDescriptor.<MS.LiveDashboardRequest, MS.LiveDashboardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "MonitoringSystem.MonitoringSystem", "LiveDashboard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MS.LiveDashboardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MS.LiveDashboardResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MonitoringSystemMethodDescriptorSupplier("LiveDashboard"))
                  .build();
          }
        }
     }
     return getLiveDashboardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MS.CallRequest,
      MS.CallResponse> getEmergencyServicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EmergencyServices",
      requestType = MS.CallRequest.class,
      responseType = MS.CallResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<MS.CallRequest,
      MS.CallResponse> getEmergencyServicesMethod() {
    io.grpc.MethodDescriptor<MS.CallRequest, MS.CallResponse> getEmergencyServicesMethod;
    if ((getEmergencyServicesMethod = MonitoringSystemGrpc.getEmergencyServicesMethod) == null) {
      synchronized (MonitoringSystemGrpc.class) {
        if ((getEmergencyServicesMethod = MonitoringSystemGrpc.getEmergencyServicesMethod) == null) {
          MonitoringSystemGrpc.getEmergencyServicesMethod = getEmergencyServicesMethod = 
              io.grpc.MethodDescriptor.<MS.CallRequest, MS.CallResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "MonitoringSystem.MonitoringSystem", "EmergencyServices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MS.CallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MS.CallResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MonitoringSystemMethodDescriptorSupplier("EmergencyServices"))
                  .build();
          }
        }
     }
     return getEmergencyServicesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MonitoringSystemStub newStub(io.grpc.Channel channel) {
    return new MonitoringSystemStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MonitoringSystemBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MonitoringSystemBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MonitoringSystemFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MonitoringSystemFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class MonitoringSystemImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc method for bidirectional streaming calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<MS.LiveDashboardRequest> liveDashboard(
        io.grpc.stub.StreamObserver<MS.LiveDashboardResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getLiveDashboardMethod(), responseObserver);
    }

    /**
     */
    public void emergencyServices(MS.CallRequest request,
        io.grpc.stub.StreamObserver<MS.CallResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEmergencyServicesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLiveDashboardMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                MS.LiveDashboardRequest,
                MS.LiveDashboardResponse>(
                  this, METHODID_LIVE_DASHBOARD)))
          .addMethod(
            getEmergencyServicesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                MS.CallRequest,
                MS.CallResponse>(
                  this, METHODID_EMERGENCY_SERVICES)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MonitoringSystemStub extends io.grpc.stub.AbstractStub<MonitoringSystemStub> {
    private MonitoringSystemStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MonitoringSystemStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitoringSystemStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MonitoringSystemStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for bidirectional streaming calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<MS.LiveDashboardRequest> liveDashboard(
        io.grpc.stub.StreamObserver<MS.LiveDashboardResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getLiveDashboardMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void emergencyServices(MS.CallRequest request,
        io.grpc.stub.StreamObserver<MS.CallResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getEmergencyServicesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MonitoringSystemBlockingStub extends io.grpc.stub.AbstractStub<MonitoringSystemBlockingStub> {
    private MonitoringSystemBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MonitoringSystemBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitoringSystemBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MonitoringSystemBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<MS.CallResponse> emergencyServices(
        MS.CallRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getEmergencyServicesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MonitoringSystemFutureStub extends io.grpc.stub.AbstractStub<MonitoringSystemFutureStub> {
    private MonitoringSystemFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MonitoringSystemFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitoringSystemFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MonitoringSystemFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_EMERGENCY_SERVICES = 0;
  private static final int METHODID_LIVE_DASHBOARD = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MonitoringSystemImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MonitoringSystemImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EMERGENCY_SERVICES:
          serviceImpl.emergencyServices((MS.CallRequest) request,
              (io.grpc.stub.StreamObserver<MS.CallResponse>) responseObserver);
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
        case METHODID_LIVE_DASHBOARD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.liveDashboard(
              (io.grpc.stub.StreamObserver<MS.LiveDashboardResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MonitoringSystemBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MonitoringSystemBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return MS.MSServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MonitoringSystem");
    }
  }

  private static final class MonitoringSystemFileDescriptorSupplier
      extends MonitoringSystemBaseDescriptorSupplier {
    MonitoringSystemFileDescriptorSupplier() {}
  }

  private static final class MonitoringSystemMethodDescriptorSupplier
      extends MonitoringSystemBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MonitoringSystemMethodDescriptorSupplier(String methodName) {
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
      synchronized (MonitoringSystemGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MonitoringSystemFileDescriptorSupplier())
              .addMethod(getLiveDashboardMethod())
              .addMethod(getEmergencyServicesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
