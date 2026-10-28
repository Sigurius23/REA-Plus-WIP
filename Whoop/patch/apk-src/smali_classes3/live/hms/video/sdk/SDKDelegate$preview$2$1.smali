.class final Llive/hms/video/sdk/SDKDelegate$preview$2$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/SDKDelegate$preview$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.sdk.SDKDelegate$preview$2$1"
    f = "SDKDelegate.kt"
    l = {
        0x5a0
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $config:Llive/hms/video/sdk/models/HMSConfig;

.field final synthetic $listener:Llive/hms/video/sdk/HMSPreviewListener;

.field final synthetic $peer:Llive/hms/video/sdk/models/HMSLocalPeer;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/sdk/SDKDelegate;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/models/HMSLocalPeer;Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/HMSPreviewListener;Llive/hms/video/sdk/models/HMSConfig;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSLocalPeer;",
            "Llive/hms/video/sdk/SDKDelegate;",
            "Llive/hms/video/sdk/HMSPreviewListener;",
            "Llive/hms/video/sdk/models/HMSConfig;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/SDKDelegate$preview$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->$peer:Llive/hms/video/sdk/models/HMSLocalPeer;

    iput-object p2, p0, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iput-object p3, p0, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->$listener:Llive/hms/video/sdk/HMSPreviewListener;

    iput-object p4, p0, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->$config:Llive/hms/video/sdk/models/HMSConfig;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->invokeSuspend$lambda$3$lambda$2(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Llive/hms/video/sdk/SDKDelegate;Lbc3/c0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->invokeSuspend$lambda$3$lambda$0(Llive/hms/video/sdk/SDKDelegate;Lbc3/c0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Llive/hms/video/sdk/SDKDelegate;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->invokeSuspend$lambda$3$lambda$1(Llive/hms/video/sdk/SDKDelegate;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final invokeSuspend$lambda$3$lambda$0(Llive/hms/video/sdk/SDKDelegate;Lbc3/c0;)Ll83/a0;
    .locals 3

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    new-instance v1, Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1;-><init>(Llive/hms/video/sdk/SDKDelegate;Lq83/d;)V

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object p1

    invoke-static {p0, p1}, Llive/hms/video/sdk/SDKDelegate;->access$setLowSpeedDuringPreviewEarlyWarning$p(Llive/hms/video/sdk/SDKDelegate;Lbc3/i0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final invokeSuspend$lambda$3$lambda$1(Llive/hms/video/sdk/SDKDelegate;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Llive/hms/video/sdk/SDKDelegate;->access$getLowSpeedDuringPreviewEarlyWarning$p(Llive/hms/video/sdk/SDKDelegate;)Lbc3/i0;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    check-cast p0, Lbc3/t1;

    invoke-virtual {p0, v0}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_0
    return-object v0
.end method

.method private static final invokeSuspend$lambda$3$lambda$2(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/sdk/SDKDelegate$preview$2$1;

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->$peer:Llive/hms/video/sdk/models/HMSLocalPeer;

    iget-object v2, p0, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-object v3, p0, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->$listener:Llive/hms/video/sdk/HMSPreviewListener;

    iget-object v4, p0, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->$config:Llive/hms/video/sdk/models/HMSConfig;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Llive/hms/video/sdk/SDKDelegate$preview$2$1;-><init>(Llive/hms/video/sdk/models/HMSLocalPeer;Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/HMSPreviewListener;Llive/hms/video/sdk/models/HMSConfig;Lq83/d;)V

    iput-object p1, v0, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/SDKDelegate$preview$2$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v7, p0

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v0, v7, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->label:I

    const/4 v1, 0x1

    const/4 v9, 0x0

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    iget-object v0, v7, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->L$4:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/sdk/SDKDelegate;

    iget-object v1, v7, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->L$3:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    iget-object v2, v7, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lc93/a;

    iget-object v3, v7, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->L$1:Ljava/lang/Object;

    check-cast v3, Llive/hms/video/sdk/models/HMSConfig;

    iget-object v4, v7, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->L$0:Ljava/lang/Object;

    check-cast v4, Llive/hms/video/sdk/SDKDelegate;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v10, v0

    move-object/from16 v17, v2

    move-object v12, v3

    move-object/from16 v0, p1

    goto/16 :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v7, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    :try_start_1
    iget-object v2, v7, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->$peer:Llive/hms/video/sdk/models/HMSLocalPeer;

    if-eqz v2, :cond_5

    iget-object v10, v7, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-object v3, v7, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->$listener:Llive/hms/video/sdk/HMSPreviewListener;

    iget-object v11, v7, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->$config:Llive/hms/video/sdk/models/HMSConfig;

    invoke-static {v10, v3}, Llive/hms/video/sdk/SDKDelegate;->access$setHmsPreviewListener$p(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/HMSPreviewListener;)V

    invoke-static {v10}, Llive/hms/video/sdk/SDKDelegate;->access$getLowSpeedDuringPreviewEarlyWarning$p(Llive/hms/video/sdk/SDKDelegate;)Lbc3/i0;

    move-result-object v3

    if-eqz v3, :cond_2

    check-cast v3, Lbc3/t1;

    invoke-virtual {v3, v9}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_2
    new-instance v12, Llive/hms/video/sdk/e;

    const/4 v3, 0x0

    invoke-direct {v12, v10, v0, v3}, Llive/hms/video/sdk/e;-><init>(Llive/hms/video/sdk/SDKDelegate;Ljava/lang/Object;I)V

    new-instance v13, Llive/hms/video/sdk/f;

    const/4 v0, 0x0

    invoke-direct {v13, v10, v0}, Llive/hms/video/sdk/f;-><init>(Llive/hms/video/sdk/SDKDelegate;I)V

    invoke-static {v10}, Llive/hms/video/sdk/SDKDelegate;->access$getTransportLayer(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/ITransport;

    move-result-object v0

    invoke-virtual {v11}, Llive/hms/video/sdk/models/HMSConfig;->getAuthtoken()Ljava/lang/String;

    move-result-object v3

    move-object v4, v2

    invoke-virtual {v11}, Llive/hms/video/sdk/models/HMSConfig;->getInitEndpoint()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4}, Llive/hms/video/sdk/models/HMSPeer;->getPeerID()Ljava/lang/String;

    move-result-object v4

    move-object v5, v3

    move-object v3, v4

    sget-object v4, Llive/hms/video/sdk/models/enums/RetrySchedulerState;->PREVIEW:Llive/hms/video/sdk/models/enums/RetrySchedulerState;

    move-object v6, v5

    invoke-static {v10}, Llive/hms/video/sdk/SDKDelegate;->access$getPerformanceMeasurement(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/models/PerformanceMeasurement;

    move-result-object v5

    invoke-static {v10}, Llive/hms/video/sdk/SDKDelegate;->access$getStore$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SDKStore;

    move-result-object v14

    invoke-static {v10, v14}, Llive/hms/video/sdk/SDKDelegate;->access$setSdkStoreConfig(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/SDKStore;)Lkotlin/jvm/functions/Function1;

    move-result-object v14

    iput-object v10, v7, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->L$0:Ljava/lang/Object;

    iput-object v11, v7, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->L$1:Ljava/lang/Object;

    iput-object v12, v7, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->L$2:Ljava/lang/Object;

    iput-object v13, v7, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->L$3:Ljava/lang/Object;

    iput-object v10, v7, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->L$4:Ljava/lang/Object;

    iput v1, v7, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->label:I

    move-object v1, v6

    move-object v6, v14

    invoke-interface/range {v0 .. v7}, Llive/hms/video/transport/ITransport;->connect(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/enums/RetrySchedulerState;Llive/hms/video/sdk/models/PerformanceMeasurement;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_3

    return-object v8

    :cond_3
    move-object v4, v10

    move-object/from16 v17, v12

    move-object v1, v13

    move-object v12, v11

    :goto_0
    check-cast v0, Llive/hms/video/signal/init/InitConfig;

    invoke-static {v10, v0}, Llive/hms/video/sdk/SDKDelegate;->access$setInitConfig$p(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/signal/init/InitConfig;)V

    invoke-static {v4}, Llive/hms/video/sdk/SDKDelegate;->access$updateConfig(Llive/hms/video/sdk/SDKDelegate;)V

    invoke-static {v4}, Llive/hms/video/sdk/SDKDelegate;->access$getPreviewSpeedTestUseCase$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SpeedTestUseCase;

    move-result-object v11

    invoke-static {v4}, Llive/hms/video/sdk/SDKDelegate;->access$getInitConfig$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/signal/init/InitConfig;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Llive/hms/video/signal/init/InitConfig;->getServerConfiguration()Llive/hms/video/signal/init/ServerConfiguration;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Llive/hms/video/signal/init/ServerConfiguration;->getNetworkHealth()Llive/hms/video/signal/init/NetworkHealth;

    move-result-object v0

    move-object v13, v0

    goto :goto_1

    :cond_4
    move-object v13, v9

    :goto_1
    invoke-static {v4}, Llive/hms/video/sdk/SDKDelegate;->access$getStore$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SDKStore;

    move-result-object v14

    invoke-static {v4}, Llive/hms/video/sdk/SDKDelegate;->access$getHmsPreviewListener$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/HMSPreviewListener;

    move-result-object v15

    invoke-static {v4}, Llive/hms/video/sdk/SDKDelegate;->access$getTransportLayer(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/ITransport;

    move-result-object v0

    invoke-interface {v0}, Llive/hms/video/transport/ITransport;->getAnalyticsEventsService()Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v16

    new-instance v0, Llive/hms/video/sdk/b;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Llive/hms/video/sdk/b;-><init>(Ljava/lang/Object;I)V

    const/16 v20, 0x80

    const/16 v21, 0x0

    const/16 v19, 0x0

    move-object/from16 v18, v0

    invoke-static/range {v11 .. v21}, Llive/hms/video/sdk/SpeedTestUseCase;->speedTestAndNotify$default(Llive/hms/video/sdk/SpeedTestUseCase;Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/signal/init/NetworkHealth;Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/HMSPreviewListener;Llive/hms/video/events/AnalyticsEventsService;Lc93/a;Lc93/a;Lbc3/c0;ILjava/lang/Object;)V

    const-string v0, "profiling"

    const-string v1, "preview under lock done "

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    const-string v0, "SDKDelegate"

    const-string v1, "Local Peer is null"

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Llive/hms/video/error/HMSException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :goto_2
    iget-object v1, v7, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v1}, Llive/hms/video/sdk/SDKDelegate;->access$getPerformanceMeasurement(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/models/PerformanceMeasurement;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Llive/hms/video/sdk/models/PerformanceMeasurement;->firePreviewPerformanceMeasurementEvent$lib_release(Z)V

    iget-object v1, v7, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->$listener:Llive/hms/video/sdk/HMSPreviewListener;

    invoke-interface {v1, v0}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    iget-object v0, v7, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->access$getStore$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SDKStore;

    move-result-object v0

    invoke-virtual {v0, v9}, Llive/hms/video/sdk/SDKStore;->set_room(Llive/hms/video/sdk/models/HMSRoom;)V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
