package MTS;

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
    comments = "Source: MTS.proto")
public final class MotionTemperatureSensorGrpc {

  private MotionTemperatureSensorGrpc() {}

  public static final String SERVICE_NAME = "MotionTemperatureSensor.MotionTemperatureSensor";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<MTS.LightActivationRequest,
      MTS.LightActivationResponse> getLightActivationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LightActivation",
      requestType = MTS.LightActivationRequest.class,
      responseType = MTS.LightActivationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MTS.LightActivationRequest,
      MTS.LightActivationResponse> getLightActivationMethod() {
    io.grpc.MethodDescriptor<MTS.LightActivationRequest, MTS.LightActivationResponse> getLightActivationMethod;
    if ((getLightActivationMethod = MotionTemperatureSensorGrpc.getLightActivationMethod) == null) {
      synchronized (MotionTemperatureSensorGrpc.class) {
        if ((getLightActivationMethod = MotionTemperatureSensorGrpc.getLightActivationMethod) == null) {
          MotionTemperatureSensorGrpc.getLightActivationMethod = getLightActivationMethod = 
              io.grpc.MethodDescriptor.<MTS.LightActivationRequest, MTS.LightActivationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MotionTemperatureSensor.MotionTemperatureSensor", "LightActivation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MTS.LightActivationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MTS.LightActivationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MotionTemperatureSensorMethodDescriptorSupplier("LightActivation"))
                  .build();
          }
        }
     }
     return getLightActivationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MTS.TempRegulatorRequest,
      MTS.TempRegulatorResponse> getTempRegulatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TempRegulator",
      requestType = MTS.TempRegulatorRequest.class,
      responseType = MTS.TempRegulatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<MTS.TempRegulatorRequest,
      MTS.TempRegulatorResponse> getTempRegulatorMethod() {
    io.grpc.MethodDescriptor<MTS.TempRegulatorRequest, MTS.TempRegulatorResponse> getTempRegulatorMethod;
    if ((getTempRegulatorMethod = MotionTemperatureSensorGrpc.getTempRegulatorMethod) == null) {
      synchronized (MotionTemperatureSensorGrpc.class) {
        if ((getTempRegulatorMethod = MotionTemperatureSensorGrpc.getTempRegulatorMethod) == null) {
          MotionTemperatureSensorGrpc.getTempRegulatorMethod = getTempRegulatorMethod = 
              io.grpc.MethodDescriptor.<MTS.TempRegulatorRequest, MTS.TempRegulatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "MotionTemperatureSensor.MotionTemperatureSensor", "TempRegulator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MTS.TempRegulatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MTS.TempRegulatorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MotionTemperatureSensorMethodDescriptorSupplier("TempRegulator"))
                  .build();
          }
        }
     }
     return getTempRegulatorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MotionTemperatureSensorStub newStub(io.grpc.Channel channel) {
    return new MotionTemperatureSensorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MotionTemperatureSensorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MotionTemperatureSensorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MotionTemperatureSensorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MotionTemperatureSensorFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class MotionTemperatureSensorImplBase implements io.grpc.BindableService {

    /**
     */
    public void lightActivation(MTS.LightActivationRequest request,
        io.grpc.stub.StreamObserver<MTS.LightActivationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLightActivationMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<MTS.TempRegulatorRequest> tempRegulator(
        io.grpc.stub.StreamObserver<MTS.TempRegulatorResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getTempRegulatorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLightActivationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                MTS.LightActivationRequest,
                MTS.LightActivationResponse>(
                  this, METHODID_LIGHT_ACTIVATION)))
          .addMethod(
            getTempRegulatorMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                MTS.TempRegulatorRequest,
                MTS.TempRegulatorResponse>(
                  this, METHODID_TEMP_REGULATOR)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MotionTemperatureSensorStub extends io.grpc.stub.AbstractStub<MotionTemperatureSensorStub> {
    private MotionTemperatureSensorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MotionTemperatureSensorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotionTemperatureSensorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MotionTemperatureSensorStub(channel, callOptions);
    }

    /**
     */
    public void lightActivation(MTS.LightActivationRequest request,
        io.grpc.stub.StreamObserver<MTS.LightActivationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLightActivationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<MTS.TempRegulatorRequest> tempRegulator(
        io.grpc.stub.StreamObserver<MTS.TempRegulatorResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getTempRegulatorMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MotionTemperatureSensorBlockingStub extends io.grpc.stub.AbstractStub<MotionTemperatureSensorBlockingStub> {
    private MotionTemperatureSensorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MotionTemperatureSensorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotionTemperatureSensorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MotionTemperatureSensorBlockingStub(channel, callOptions);
    }

    /**
     */
    public MTS.LightActivationResponse lightActivation(MTS.LightActivationRequest request) {
      return blockingUnaryCall(
          getChannel(), getLightActivationMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MotionTemperatureSensorFutureStub extends io.grpc.stub.AbstractStub<MotionTemperatureSensorFutureStub> {
    private MotionTemperatureSensorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MotionTemperatureSensorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotionTemperatureSensorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MotionTemperatureSensorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<MTS.LightActivationResponse> lightActivation(
        MTS.LightActivationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLightActivationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIGHT_ACTIVATION = 0;
  private static final int METHODID_TEMP_REGULATOR = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MotionTemperatureSensorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MotionTemperatureSensorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIGHT_ACTIVATION:
          serviceImpl.lightActivation((MTS.LightActivationRequest) request,
              (io.grpc.stub.StreamObserver<MTS.LightActivationResponse>) responseObserver);
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
        case METHODID_TEMP_REGULATOR:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.tempRegulator(
              (io.grpc.stub.StreamObserver<MTS.TempRegulatorResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MotionTemperatureSensorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MotionTemperatureSensorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return MTS.MTSServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MotionTemperatureSensor");
    }
  }

  private static final class MotionTemperatureSensorFileDescriptorSupplier
      extends MotionTemperatureSensorBaseDescriptorSupplier {
    MotionTemperatureSensorFileDescriptorSupplier() {}
  }

  private static final class MotionTemperatureSensorMethodDescriptorSupplier
      extends MotionTemperatureSensorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MotionTemperatureSensorMethodDescriptorSupplier(String methodName) {
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
      synchronized (MotionTemperatureSensorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MotionTemperatureSensorFileDescriptorSupplier())
              .addMethod(getLightActivationMethod())
              .addMethod(getTempRegulatorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
