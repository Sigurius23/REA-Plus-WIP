.class public final synthetic Llh1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Llh1/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llh1/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->l()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->h()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->m()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->o()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->g()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->i()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->n()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->d()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->k()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->q()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->f()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->p()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->b()Lmc3/a;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Llive/hms/video/sdk/SDKDelegate;->l()Landroid/os/HandlerThread;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Llive/hms/video/sdk/SDKDelegate;->b()Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Llive/hms/video/sdk/SDKDelegate;->w()Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Llive/hms/video/sdk/NetworkObserverUseCase;->b()Llive/hms/video/connection/stats/quality/NetworkQualityCalculator;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->a()Ljava/util/HashSet;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Llive/hms/video/media/capturers/camera/CameraControl;->e()Landroid/os/HandlerThread;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Llive/hms/video/factories/SafeVariable;->a()Landroid/os/HandlerThread;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Llive/hms/video/factories/HappyEyeballsDns;->e()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Llive/hms/video/factories/HMSVideoDecoderFactory;->a()Lhms/webrtc/SoftwareVideoDecoderFactory;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lcom/whoop/stories/OnboardingStoryFragment;->O()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingStickyModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
