.class public final Llive/hms/video/sdk/SpeedTestUseCase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JX\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000c2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J_\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000c2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0003R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Llive/hms/video/sdk/SpeedTestUseCase;",
        "Ljava/io/Closeable;",
        "<init>",
        "()V",
        "Llive/hms/video/sdk/models/HMSConfig;",
        "hmsConfig",
        "Llive/hms/video/signal/init/NetworkHealth;",
        "networkHealth",
        "Llive/hms/video/sdk/SDKStore;",
        "store",
        "Llive/hms/video/sdk/HMSPreviewListener;",
        "hmsPreviewListener",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "analyticsEventsService",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onTimeout",
        "onComplete",
        "run",
        "(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/signal/init/NetworkHealth;Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/HMSPreviewListener;Llive/hms/video/events/AnalyticsEventsService;Lc93/a;Lc93/a;Lq83/d;)Ljava/lang/Object;",
        "Lbc3/c0;",
        "scope",
        "speedTestAndNotify",
        "(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/signal/init/NetworkHealth;Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/HMSPreviewListener;Llive/hms/video/events/AnalyticsEventsService;Lc93/a;Lc93/a;Lbc3/c0;)V",
        "close",
        "Lbc3/k1;",
        "speedTestJob",
        "Lbc3/k1;",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private speedTestJob:Lbc3/k1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$run(Llive/hms/video/sdk/SpeedTestUseCase;Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/signal/init/NetworkHealth;Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/HMSPreviewListener;Llive/hms/video/events/AnalyticsEventsService;Lc93/a;Lc93/a;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p8}, Llive/hms/video/sdk/SpeedTestUseCase;->run(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/signal/init/NetworkHealth;Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/HMSPreviewListener;Llive/hms/video/events/AnalyticsEventsService;Lc93/a;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final run(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/signal/init/NetworkHealth;Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/HMSPreviewListener;Llive/hms/video/events/AnalyticsEventsService;Lc93/a;Lc93/a;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSConfig;",
            "Llive/hms/video/signal/init/NetworkHealth;",
            "Llive/hms/video/sdk/SDKStore;",
            "Llive/hms/video/sdk/HMSPreviewListener;",
            "Llive/hms/video/events/AnalyticsEventsService;",
            "Lc93/a;",
            "Lc93/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p8, Llive/hms/video/sdk/SpeedTestUseCase$run$1;

    if-eqz v0, :cond_0

    move-object v0, p8

    check-cast v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;

    iget v1, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;

    invoke-direct {v0, p0, p8}, Llive/hms/video/sdk/SpeedTestUseCase$run$1;-><init>(Llive/hms/video/sdk/SpeedTestUseCase;Lq83/d;)V

    :goto_0
    iget-object p8, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->I$0:I

    iget-object p2, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->L$1:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Double;

    iget-object p3, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->L$0:Ljava/lang/Object;

    check-cast p3, Llive/hms/video/events/AnalyticsEventsService;

    invoke-static {p8}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->L$5:Ljava/lang/Object;

    check-cast p1, Llive/hms/video/sdk/SpeedTest;

    iget-object p2, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->L$4:Ljava/lang/Object;

    move-object p7, p2

    check-cast p7, Lc93/a;

    iget-object p2, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->L$3:Ljava/lang/Object;

    move-object p5, p2

    check-cast p5, Llive/hms/video/events/AnalyticsEventsService;

    iget-object p2, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->L$2:Ljava/lang/Object;

    move-object p4, p2

    check-cast p4, Llive/hms/video/sdk/HMSPreviewListener;

    iget-object p2, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->L$1:Ljava/lang/Object;

    move-object p3, p2

    check-cast p3, Llive/hms/video/sdk/SDKStore;

    iget-object p2, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->L$0:Ljava/lang/Object;

    check-cast p2, Llive/hms/video/signal/init/NetworkHealth;

    invoke-static {p8}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p8}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p2, :cond_8

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSConfig;->getCaptureNetworkQualityInPreview()Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_4

    :cond_4
    invoke-interface {p6}, Lc93/a;->invoke()Ljava/lang/Object;

    new-instance p1, Llive/hms/video/sdk/SpeedTest;

    invoke-direct {p1}, Llive/hms/video/sdk/SpeedTest;-><init>()V

    iput-object p2, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->L$0:Ljava/lang/Object;

    iput-object p3, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->L$1:Ljava/lang/Object;

    iput-object p4, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->L$2:Ljava/lang/Object;

    iput-object p5, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->L$3:Ljava/lang/Object;

    iput-object p7, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->L$4:Ljava/lang/Object;

    iput-object p1, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->L$5:Ljava/lang/Object;

    iput v4, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->label:I

    invoke-virtual {p1, p2, v0}, Llive/hms/video/sdk/SpeedTest;->getDownloadSpeedInKilobytesPerSecond(Llive/hms/video/signal/init/NetworkHealth;Lq83/d;)Ljava/lang/Object;

    move-result-object p8

    if-ne p8, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    move-object p6, p8

    check-cast p6, Ljava/lang/Double;

    invoke-interface {p7}, Lc93/a;->invoke()Ljava/lang/Object;

    invoke-virtual {p2}, Llive/hms/video/signal/init/NetworkHealth;->getScoreMap()Ljava/util/SortedMap;

    move-result-object p2

    invoke-virtual {p1, p6, p2}, Llive/hms/video/sdk/SpeedTest;->getSpeedTestScore(Ljava/lang/Double;Ljava/util/SortedMap;)I

    move-result p1

    invoke-virtual {p3}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object p2

    if-nez p2, :cond_6

    return-object v5

    :cond_6
    new-instance p3, Llive/hms/video/connection/stats/quality/HMSNetworkQuality;

    invoke-direct {p3, p1}, Llive/hms/video/connection/stats/quality/HMSNetworkQuality;-><init>(I)V

    invoke-virtual {p2, p3}, Llive/hms/video/sdk/models/HMSPeer;->setNetworkQuality$lib_release(Llive/hms/video/connection/stats/quality/HMSNetworkQuality;)V

    sget-object p3, Lbc3/q0;->a:Lkc3/e;

    sget-object p3, Lhc3/o;->a:Lbc3/w1;

    new-instance p7, Llive/hms/video/sdk/SpeedTestUseCase$run$2;

    const/4 p8, 0x0

    invoke-direct {p7, p4, p2, p8}, Llive/hms/video/sdk/SpeedTestUseCase$run$2;-><init>(Llive/hms/video/sdk/HMSPreviewListener;Llive/hms/video/sdk/models/HMSLocalPeer;Lq83/d;)V

    iput-object p5, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->L$0:Ljava/lang/Object;

    iput-object p6, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->L$1:Ljava/lang/Object;

    iput-object p8, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->L$2:Ljava/lang/Object;

    iput-object p8, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->L$3:Ljava/lang/Object;

    iput-object p8, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->L$4:Ljava/lang/Object;

    iput-object p8, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->L$5:Ljava/lang/Object;

    iput p1, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->I$0:I

    iput v3, v0, Llive/hms/video/sdk/SpeedTestUseCase$run$1;->label:I

    invoke-static {p3, p7, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    move-object p3, p5

    move-object p2, p6

    :goto_3
    sget-object p4, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    invoke-virtual {p4, p1, p2}, Llive/hms/video/events/AnalyticsEventFactory;->networkQualityInPreviewResults(ILjava/lang/Double;)Llive/hms/video/events/AnalyticsEvent;

    move-result-object p1

    invoke-virtual {p3, p1}, Llive/hms/video/events/AnalyticsEventsService;->queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/events/AnalyticsEventsService;->flush()V

    :cond_8
    :goto_4
    return-object v5
.end method

.method public static speedTestAndNotify$default(Llive/hms/video/sdk/SpeedTestUseCase;Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/signal/init/NetworkHealth;Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/HMSPreviewListener;Llive/hms/video/events/AnalyticsEventsService;Lc93/a;Lc93/a;Lbc3/c0;ILjava/lang/Object;)V
    .locals 10

    move/from16 v0, p9

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    move-object v9, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    goto :goto_1

    :cond_0
    move-object/from16 v9, p8

    goto :goto_0

    :goto_1
    invoke-virtual/range {v1 .. v9}, Llive/hms/video/sdk/SpeedTestUseCase;->speedTestAndNotify(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/signal/init/NetworkHealth;Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/HMSPreviewListener;Llive/hms/video/events/AnalyticsEventsService;Lc93/a;Lc93/a;Lbc3/c0;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    iget-object v0, p0, Llive/hms/video/sdk/SpeedTestUseCase;->speedTestJob:Lbc3/k1;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method public final speedTestAndNotify(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/signal/init/NetworkHealth;Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/HMSPreviewListener;Llive/hms/video/events/AnalyticsEventsService;Lc93/a;Lc93/a;Lbc3/c0;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSConfig;",
            "Llive/hms/video/signal/init/NetworkHealth;",
            "Llive/hms/video/sdk/SDKStore;",
            "Llive/hms/video/sdk/HMSPreviewListener;",
            "Llive/hms/video/events/AnalyticsEventsService;",
            "Lc93/a;",
            "Lc93/a;",
            "Lbc3/c0;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p8

    const-string v1, "hmsConfig"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "store"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "analyticsEventsService"

    move-object/from16 v8, p5

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onTimeout"

    move-object/from16 v9, p6

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onComplete"

    move-object/from16 v10, p7

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "scope"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Llive/hms/video/sdk/SpeedTestUseCase$speedTestAndNotify$1;

    const/4 v11, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object/from16 v7, p4

    invoke-direct/range {v2 .. v11}, Llive/hms/video/sdk/SpeedTestUseCase$speedTestAndNotify$1;-><init>(Llive/hms/video/sdk/SpeedTestUseCase;Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/signal/init/NetworkHealth;Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/HMSPreviewListener;Llive/hms/video/events/AnalyticsEventsService;Lc93/a;Lc93/a;Lq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v0, p2, p2, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/sdk/SpeedTestUseCase;->speedTestJob:Lbc3/k1;

    return-void
.end method
