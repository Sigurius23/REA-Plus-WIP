.class public final Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0004\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\"\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\r\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0014\u0010\u0015Je\u0010$\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0019\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010&\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010(\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008(\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010,\u001a\u0004\u0008-\u0010.R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010,\u001a\u0004\u0008/\u0010.R!\u00106\u001a\u0008\u0012\u0004\u0012\u000201008BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105R\"\u00107\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00087\u0010)\u001a\u0004\u00088\u0010+\"\u0004\u00089\u0010:R\u001d\u0010<\u001a\u0008\u0012\u0004\u0012\u00020;008\u0006\u00a2\u0006\u000c\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u00105R\u001d\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u0002008\u0006\u00a2\u0006\u000c\n\u0004\u0008?\u0010=\u001a\u0004\u0008@\u00105R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010A\u001a\u0004\u0008B\u0010C\"\u0004\u0008D\u0010ER\"\u0010\u001a\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010A\u001a\u0004\u0008F\u0010C\"\u0004\u0008G\u0010ER\"\u0010\u001b\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010A\u001a\u0004\u0008H\u0010C\"\u0004\u0008I\u0010ER\"\u0010\u001c\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010A\u001a\u0004\u0008J\u0010C\"\u0004\u0008K\u0010ER\"\u0010\u001d\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010A\u001a\u0004\u0008L\u0010C\"\u0004\u0008M\u0010ER\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010N\u001a\u0004\u0008O\u0010P\"\u0004\u0008Q\u0010RR\"\u0010 \u001a\u00020\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008 \u0010A\u001a\u0004\u0008S\u0010C\"\u0004\u0008T\u0010ER\"\u0010!\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008!\u0010A\u001a\u0004\u0008U\u0010C\"\u0004\u0008V\u0010ER$\u0010W\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008W\u0010X\u001a\u0004\u0008Y\u0010Z\"\u0004\u0008[\u0010\\\u00a8\u0006]"
    }
    d2 = {
        "Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;",
        "",
        "",
        "SAMPLE_DURATION",
        "",
        "trackId",
        "ssrc",
        "<init>",
        "(DLjava/lang/String;Ljava/lang/String;)V",
        "currentTimeStamp",
        "",
        "forcePublish",
        "shouldSample",
        "(DZ)Z",
        "hasSample",
        "()Z",
        "Llive/hms/video/connection/stats/clientside/model/AudioAnalytics;",
        "getCollectedSamples",
        "(Z)Llive/hms/video/connection/stats/clientside/model/AudioAnalytics;",
        "Ll83/a0;",
        "resetSamples",
        "()V",
        "audioLevel",
        "",
        "audioConcealedSamples",
        "",
        "audioTotalSampleReceived",
        "audioConcealmentEvents",
        "fecPacketDiscarded",
        "fecPacketReceived",
        "",
        "totalSampleDuration",
        "totalPacketReceived",
        "totalPacketLost",
        "jitterBufferDelay",
        "jitterBufferEmittedCount",
        "add",
        "(DJLjava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;FJJDLjava/lang/Number;)V",
        "shouldSampleAudio",
        "(D)Z",
        "reset",
        "D",
        "getSAMPLE_DURATION",
        "()D",
        "Ljava/lang/String;",
        "getTrackId",
        "()Ljava/lang/String;",
        "getSsrc",
        "",
        "Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;",
        "subscribeAudioStatsSample$delegate",
        "Ll83/h;",
        "getSubscribeAudioStatsSample",
        "()Ljava/util/List;",
        "subscribeAudioStatsSample",
        "START_AUDIO_SAMPLE_DURATION",
        "getSTART_AUDIO_SAMPLE_DURATION",
        "setSTART_AUDIO_SAMPLE_DURATION",
        "(D)V",
        "",
        "audioLevelList",
        "Ljava/util/List;",
        "getAudioLevelList",
        "jitterBufferDelayAverage",
        "getJitterBufferDelayAverage",
        "J",
        "getAudioConcealedSamples",
        "()J",
        "setAudioConcealedSamples",
        "(J)V",
        "getAudioTotalSampleReceived",
        "setAudioTotalSampleReceived",
        "getAudioConcealmentEvents",
        "setAudioConcealmentEvents",
        "getFecPacketDiscarded",
        "setFecPacketDiscarded",
        "getFecPacketReceived",
        "setFecPacketReceived",
        "F",
        "getTotalSampleDuration",
        "()F",
        "setTotalSampleDuration",
        "(F)V",
        "getTotalPacketReceived",
        "setTotalPacketReceived",
        "getTotalPacketLost",
        "setTotalPacketLost",
        "lastSample",
        "Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;",
        "getLastSample",
        "()Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;",
        "setLastSample",
        "(Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;)V",
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
.field private final SAMPLE_DURATION:D

.field private START_AUDIO_SAMPLE_DURATION:D

.field private audioConcealedSamples:J

.field private audioConcealmentEvents:J

.field private final audioLevelList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private audioTotalSampleReceived:J

.field private fecPacketDiscarded:J

.field private fecPacketReceived:J

.field private final jitterBufferDelayAverage:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private lastSample:Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

.field private final ssrc:Ljava/lang/String;

.field private final subscribeAudioStatsSample$delegate:Ll83/h;

.field private totalPacketLost:J

.field private totalPacketReceived:J

.field private totalSampleDuration:F

.field private final trackId:Ljava/lang/String;


# direct methods
.method public constructor <init>(DLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "trackId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ssrc"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->SAMPLE_DURATION:D

    iput-object p3, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->trackId:Ljava/lang/String;

    iput-object p4, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->ssrc:Ljava/lang/String;

    new-instance p1, Lga1/a;

    const/16 p2, 0xb

    invoke-direct {p1, p2}, Lga1/a;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->subscribeAudioStatsSample$delegate:Ll83/h;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioLevelList:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->jitterBufferDelayAverage:Ljava/util/List;

    return-void
.end method

.method public static synthetic a()Ljava/util/List;
    .locals 1

    invoke-static {}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->subscribeAudioStatsSample_delegate$lambda$0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private final getSubscribeAudioStatsSample()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->subscribeAudioStatsSample$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final reset()V
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioLevelList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->jitterBufferDelayAverage:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public static synthetic shouldSample$default(Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;DZILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->shouldSample(DZ)Z

    move-result p0

    return p0
.end method

.method private final shouldSampleAudio(D)Z
    .locals 6

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->START_AUDIO_SAMPLE_DURATION:D

    const-wide/16 v2, 0x0

    cmpg-double v2, v0, v2

    const/4 v3, 0x0

    if-gtz v2, :cond_0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->START_AUDIO_SAMPLE_DURATION:D

    return v3

    :cond_0
    sub-double v0, p1, v0

    iget-wide v4, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->SAMPLE_DURATION:D

    cmpl-double v0, v0, v4

    if-ltz v0, :cond_1

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->START_AUDIO_SAMPLE_DURATION:D

    const/4 p1, 0x1

    return p1

    :cond_1
    return v3
.end method

.method private static final subscribeAudioStatsSample_delegate$lambda$0()Ljava/util/List;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final add(DJLjava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;FJJDLjava/lang/Number;)V
    .locals 4

    const-string v0, "audioTotalSampleReceived"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioConcealmentEvents"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fecPacketDiscarded"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fecPacketReceived"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jitterBufferEmittedCount"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioLevelList:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    const-wide v2, 0x3fa999999999999aL    # 0.05

    cmpl-double p1, p1, v2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iput-wide p3, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioConcealedSamples:J

    invoke-virtual {p5}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioTotalSampleReceived:J

    invoke-virtual {p6}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioConcealmentEvents:J

    invoke-virtual {p7}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->fecPacketDiscarded:J

    invoke-virtual {p8}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->fecPacketReceived:J

    iput p9, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->totalSampleDuration:F

    move-wide p1, p10

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->totalPacketReceived:J

    move-wide/from16 p1, p12

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->totalPacketLost:J

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->jitterBufferDelayAverage:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p2

    div-double p2, p14, p2

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public final getAudioConcealedSamples()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioConcealedSamples:J

    return-wide v0
.end method

.method public final getAudioConcealmentEvents()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioConcealmentEvents:J

    return-wide v0
.end method

.method public final getAudioLevelList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioLevelList:Ljava/util/List;

    return-object v0
.end method

.method public final getAudioTotalSampleReceived()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioTotalSampleReceived:J

    return-wide v0
.end method

.method public final getCollectedSamples(Z)Llive/hms/video/connection/stats/clientside/model/AudioAnalytics;
    .locals 28

    move-object/from16 v0, p0

    move/from16 v1, p1

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    long-to-double v2, v2

    invoke-virtual {v0, v2, v3, v1}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->shouldSample(DZ)Z

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->getSubscribeAudioStatsSample()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    const/16 v26, 0x7ff

    const/16 v27, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    invoke-static/range {v4 .. v27}, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->copy$default(Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;JJJJJJJFJJDILjava/lang/Object;)Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v2, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->trackId:Ljava/lang/String;

    iget-object v3, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->ssrc:Ljava/lang/String;

    new-instance v4, Llive/hms/video/connection/stats/clientside/model/AudioAnalytics;

    const-string v5, "regular"

    invoke-direct {v4, v1, v2, v3, v5}, Llive/hms/video/connection/stats/clientside/model/AudioAnalytics;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v4
.end method

.method public final getFecPacketDiscarded()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->fecPacketDiscarded:J

    return-wide v0
.end method

.method public final getFecPacketReceived()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->fecPacketReceived:J

    return-wide v0
.end method

.method public final getJitterBufferDelayAverage()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->jitterBufferDelayAverage:Ljava/util/List;

    return-object v0
.end method

.method public final getLastSample()Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    return-object v0
.end method

.method public final getSAMPLE_DURATION()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->SAMPLE_DURATION:D

    return-wide v0
.end method

.method public final getSTART_AUDIO_SAMPLE_DURATION()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->START_AUDIO_SAMPLE_DURATION:D

    return-wide v0
.end method

.method public final getSsrc()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->ssrc:Ljava/lang/String;

    return-object v0
.end method

.method public final getTotalPacketLost()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->totalPacketLost:J

    return-wide v0
.end method

.method public final getTotalPacketReceived()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->totalPacketReceived:J

    return-wide v0
.end method

.method public final getTotalSampleDuration()F
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->totalSampleDuration:F

    return v0
.end method

.method public final getTrackId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->trackId:Ljava/lang/String;

    return-object v0
.end method

.method public final hasSample()Z
    .locals 1

    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->getSubscribeAudioStatsSample()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final resetSamples()V
    .locals 2

    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->getSubscribeAudioStatsSample()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->getSubscribeAudioStatsSample()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    invoke-static {v1, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    iput-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->getSubscribeAudioStatsSample()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final setAudioConcealedSamples(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioConcealedSamples:J

    return-void
.end method

.method public final setAudioConcealmentEvents(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioConcealmentEvents:J

    return-void
.end method

.method public final setAudioTotalSampleReceived(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioTotalSampleReceived:J

    return-void
.end method

.method public final setFecPacketDiscarded(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->fecPacketDiscarded:J

    return-void
.end method

.method public final setFecPacketReceived(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->fecPacketReceived:J

    return-void
.end method

.method public final setLastSample(Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    return-void
.end method

.method public final setSTART_AUDIO_SAMPLE_DURATION(D)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->START_AUDIO_SAMPLE_DURATION:D

    return-void
.end method

.method public final setTotalPacketLost(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->totalPacketLost:J

    return-void
.end method

.method public final setTotalPacketReceived(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->totalPacketReceived:J

    return-void
.end method

.method public final setTotalSampleDuration(F)V
    .locals 0

    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->totalSampleDuration:F

    return-void
.end method

.method public final shouldSample(DZ)Z
    .locals 26

    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p2}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->shouldSampleAudio(D)Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    return v1

    :cond_1
    :goto_0
    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->getSubscribeAudioStatsSample()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->getSubscribeAudioStatsSample()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v2

    invoke-static {v2, v1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    iput-object v1, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->getSubscribeAudioStatsSample()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    new-instance v2, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    move-wide/from16 v3, p1

    double-to-long v3, v3

    iget-object v5, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioLevelList:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_2

    const-wide/16 v5, 0x0

    goto :goto_1

    :cond_2
    iget-object v5, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioLevelList:Ljava/util/List;

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5}, Lm83/s;->v1(Ljava/lang/Iterable;)I

    move-result v5

    int-to-long v5, v5

    :goto_1
    iget-object v7, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    if-nez v7, :cond_3

    iget-wide v7, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioConcealedSamples:J

    goto :goto_2

    :cond_3
    iget-wide v8, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioConcealedSamples:J

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v7}, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->getAudio_concealed_samples()J

    move-result-wide v10

    sub-long v7, v8, v10

    :goto_2
    iget-object v9, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    if-nez v9, :cond_4

    iget-wide v9, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioTotalSampleReceived:J

    goto :goto_3

    :cond_4
    iget-wide v10, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioTotalSampleReceived:J

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v9}, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->getAudio_total_samples_received()J

    move-result-wide v12

    sub-long v9, v10, v12

    :goto_3
    iget-object v11, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    if-nez v11, :cond_5

    iget-wide v11, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioConcealmentEvents:J

    goto :goto_4

    :cond_5
    iget-wide v12, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->audioConcealmentEvents:J

    invoke-static {v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v11}, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->getAudio_concealment_events()J

    move-result-wide v14

    sub-long v11, v12, v14

    :goto_4
    iget-object v13, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    if-nez v13, :cond_6

    iget-wide v13, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->fecPacketDiscarded:J

    goto :goto_5

    :cond_6
    iget-wide v14, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->fecPacketDiscarded:J

    invoke-static {v13}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v13}, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->getFec_packets_discarded()J

    move-result-wide v16

    sub-long v13, v14, v16

    :goto_5
    iget-object v15, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    move-object/from16 p3, v2

    move-wide/from16 v16, v3

    iget-wide v2, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->fecPacketReceived:J

    if-nez v15, :cond_7

    goto :goto_6

    :cond_7
    invoke-static {v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v15}, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->getFec_packets_received()J

    move-result-wide v18

    sub-long v2, v2, v18

    :goto_6
    iget-object v4, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    if-nez v4, :cond_8

    iget v4, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->totalSampleDuration:F

    goto :goto_7

    :cond_8
    iget v15, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->totalSampleDuration:F

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->getTotal_samples_duration()F

    move-result v4

    sub-float v4, v15, v4

    :goto_7
    iget-object v15, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    move-wide/from16 p1, v2

    iget-wide v2, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->totalPacketReceived:J

    if-nez v15, :cond_9

    :goto_8
    move-wide/from16 v18, v2

    goto :goto_9

    :cond_9
    invoke-static {v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v15}, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->getTotal_packets_received()J

    move-result-wide v18

    sub-long v2, v2, v18

    goto :goto_8

    :goto_9
    iget-object v2, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    if-nez v2, :cond_a

    iget-wide v2, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->totalPacketLost:J

    :goto_a
    move-wide/from16 v20, v2

    goto :goto_b

    :cond_a
    move-object v15, v2

    iget-wide v2, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->totalPacketLost:J

    invoke-static {v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v15}, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->getTotal_packets_lost()J

    move-result-wide v20

    sub-long v2, v2, v20

    goto :goto_a

    :goto_b
    iget-object v2, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->jitterBufferDelayAverage:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_b

    const-wide/16 v2, 0x0

    :goto_c
    move-wide/from16 v22, v2

    move-object/from16 v2, p3

    move-wide/from16 v24, v16

    move/from16 v17, v4

    move-wide/from16 v15, p1

    move-wide/from16 v3, v24

    goto :goto_d

    :cond_b
    iget-object v2, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->jitterBufferDelayAverage:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->s0(Ljava/lang/Iterable;)D

    move-result-wide v2

    goto :goto_c

    :goto_d
    invoke-direct/range {v2 .. v23}, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;-><init>(JJJJJJJFJJD)V

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;->reset()V

    const/4 v1, 0x1

    return v1
.end method
