.class public final Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0004\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0007\n\u0002\u0008\'\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0010\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0014\u0010\u0015JU\u0010\"\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\"\u0010#J-\u0010\"\u001a\u00020\u000c2\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00022\u0006\u0010\'\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\"\u0010(J5\u0010\"\u001a\u00020\u000c2\u0006\u0010)\u001a\u00020\u00022\u0008\u0010+\u001a\u0004\u0018\u00010*2\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010-0,\u00a2\u0006\u0004\u0008\"\u0010/J\u0017\u00100\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u00080\u00101J\u000f\u00102\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u00082\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u00105R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00106\u001a\u0004\u00087\u00108R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00106\u001a\u0004\u00089\u00108R!\u0010@\u001a\u0008\u0012\u0004\u0012\u00020;0:8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u0010?R\"\u0010A\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008A\u00103\u001a\u0004\u0008B\u00105\"\u0004\u0008C\u0010DR$\u0010E\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008E\u0010F\u001a\u0004\u0008G\u0010H\"\u0004\u0008I\u0010JR\u001a\u0010K\u001a\u0008\u0012\u0004\u0012\u00020\u00160:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR\u001a\u0010M\u001a\u0008\u0012\u0004\u0012\u00020\u00160:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010LR\u001a\u0010N\u001a\u0008\u0012\u0004\u0012\u00020\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008N\u0010LR\"\u0010\u0017\u001a\u00020O8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010P\u001a\u0004\u0008Q\u0010R\"\u0004\u0008S\u0010TR\"\u0010\u0019\u001a\u00020O8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010P\u001a\u0004\u0008U\u0010R\"\u0004\u0008V\u0010TR\"\u0010\u001a\u001a\u00020O8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010P\u001a\u0004\u0008W\u0010R\"\u0004\u0008X\u0010TR\"\u0010Y\u001a\u00020O8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008Y\u0010P\u001a\u0004\u0008Z\u0010R\"\u0004\u0008[\u0010TR\"\u0010\\\u001a\u00020O8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\\\u0010P\u001a\u0004\u0008]\u0010R\"\u0004\u0008^\u0010TR\"\u0010_\u001a\u00020O8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008_\u0010P\u001a\u0004\u0008`\u0010R\"\u0004\u0008a\u0010TR\"\u0010b\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008b\u0010c\u001a\u0004\u0008d\u0010e\"\u0004\u0008f\u0010gR\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010c\u001a\u0004\u0008h\u0010e\"\u0004\u0008i\u0010gR\"\u0010$\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008$\u0010c\u001a\u0004\u0008j\u0010e\"\u0004\u0008k\u0010gR\"\u0010%\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008%\u0010c\u001a\u0004\u0008l\u0010e\"\u0004\u0008m\u0010gR\"\u0010&\u001a\u00020O8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008&\u0010P\u001a\u0004\u0008n\u0010R\"\u0004\u0008o\u0010TR\"\u0010\'\u001a\u00020O8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\'\u0010P\u001a\u0004\u0008p\u0010R\"\u0004\u0008q\u0010TR(\u0010r\u001a\u0008\u0012\u0004\u0012\u00020\u00180:8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008r\u0010L\u001a\u0004\u0008s\u0010?\"\u0004\u0008t\u0010u\u00a8\u0006v"
    }
    d2 = {
        "Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;",
        "",
        "",
        "SAMPLE_DURATION",
        "",
        "trackId",
        "ssrc",
        "<init>",
        "(DLjava/lang/String;Ljava/lang/String;)V",
        "",
        "hasSample",
        "()Z",
        "Ll83/a0;",
        "resetSamples",
        "()V",
        "currentTimeStamp",
        "forcePublish",
        "shouldSample",
        "(DZ)Z",
        "Llive/hms/video/connection/stats/clientside/model/VideoAnalytics;",
        "getCollectedSamples",
        "(Z)Llive/hms/video/connection/stats/clientside/model/VideoAnalytics;",
        "",
        "framesReceived",
        "",
        "framesDropped",
        "framesDecoded",
        "",
        "pliCount",
        "nackCount",
        "frameWidth",
        "frameHeight",
        "jitterBufferEmittedCount",
        "jitterBufferDelay",
        "add",
        "(IJJLjava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;D)V",
        "pauseCount",
        "freezeCount",
        "totalPausesDuration",
        "totalFreezesDuration",
        "(JJDD)V",
        "videoEstimatedPlayoutTimestamp",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "peer",
        "Lkotlin/Function1;",
        "Lhms/webrtc/RTCStats;",
        "getAudioStats",
        "(DLlive/hms/video/sdk/models/HMSPeer;Lkotlin/jvm/functions/Function1;)V",
        "shouldSampleVideo",
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
        "Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;",
        "subscribeVideoStatsSample$delegate",
        "Ll83/h;",
        "getSubscribeVideoStatsSample",
        "()Ljava/util/List;",
        "subscribeVideoStatsSample",
        "START_VIDEO_SAMPLE_DURATION",
        "getSTART_VIDEO_SAMPLE_DURATION",
        "setSTART_VIDEO_SAMPLE_DURATION",
        "(D)V",
        "lastSample",
        "Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;",
        "getLastSample",
        "()Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;",
        "setLastSample",
        "(Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;)V",
        "frameWidthAverage",
        "Ljava/util/List;",
        "frameHeightAverage",
        "bufferJitterDelayAverage",
        "",
        "F",
        "getFramesReceived",
        "()F",
        "setFramesReceived",
        "(F)V",
        "getFramesDropped",
        "setFramesDropped",
        "getFramesDecoded",
        "setFramesDecoded",
        "lastFramesReceived",
        "getLastFramesReceived",
        "setLastFramesReceived",
        "lastFramesDropped",
        "getLastFramesDropped",
        "setLastFramesDropped",
        "lastFramesDecoded",
        "getLastFramesDecoded",
        "setLastFramesDecoded",
        "plicount",
        "I",
        "getPlicount",
        "()I",
        "setPlicount",
        "(I)V",
        "getNackCount",
        "setNackCount",
        "getPauseCount",
        "setPauseCount",
        "getFreezeCount",
        "setFreezeCount",
        "getTotalPausesDuration",
        "setTotalPausesDuration",
        "getTotalFreezesDuration",
        "setTotalFreezesDuration",
        "avSyncMsAvg",
        "getAvSyncMsAvg",
        "setAvSyncMsAvg",
        "(Ljava/util/List;)V",
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

.field private START_VIDEO_SAMPLE_DURATION:D

.field private avSyncMsAvg:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final bufferJitterDelayAverage:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private final frameHeightAverage:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final frameWidthAverage:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private framesDecoded:F

.field private framesDropped:F

.field private framesReceived:F

.field private freezeCount:I

.field private lastFramesDecoded:F

.field private lastFramesDropped:F

.field private lastFramesReceived:F

.field private lastSample:Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;

.field private nackCount:I

.field private pauseCount:I

.field private plicount:I

.field private final ssrc:Ljava/lang/String;

.field private final subscribeVideoStatsSample$delegate:Ll83/h;

.field private totalFreezesDuration:F

.field private totalPausesDuration:F

.field private final trackId:Ljava/lang/String;


# direct methods
.method public constructor <init>(DLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "trackId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ssrc"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->SAMPLE_DURATION:D

    iput-object p3, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->trackId:Ljava/lang/String;

    iput-object p4, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->ssrc:Ljava/lang/String;

    new-instance p1, Lga1/a;

    const/16 p2, 0xc

    invoke-direct {p1, p2}, Lga1/a;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->subscribeVideoStatsSample$delegate:Ll83/h;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->frameWidthAverage:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->frameHeightAverage:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->bufferJitterDelayAverage:Ljava/util/List;

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastFramesReceived:F

    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastFramesDropped:F

    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastFramesDecoded:F

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->avSyncMsAvg:Ljava/util/List;

    return-void
.end method

.method public static synthetic a()Ljava/util/List;
    .locals 1

    invoke-static {}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->subscribeVideoStatsSample_delegate$lambda$0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private final getSubscribeVideoStatsSample()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->subscribeVideoStatsSample$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final reset()V
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->frameWidthAverage:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->frameHeightAverage:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->bufferJitterDelayAverage:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->avSyncMsAvg:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public static synthetic shouldSample$default(Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;DZILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->shouldSample(DZ)Z

    move-result p0

    return p0
.end method

.method private final shouldSampleVideo(D)Z
    .locals 6

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->START_VIDEO_SAMPLE_DURATION:D

    const-wide/16 v2, 0x0

    cmpg-double v2, v0, v2

    const/4 v3, 0x0

    if-gtz v2, :cond_0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->START_VIDEO_SAMPLE_DURATION:D

    return v3

    :cond_0
    sub-double v0, p1, v0

    iget-wide v4, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->SAMPLE_DURATION:D

    cmpl-double v0, v0, v4

    if-ltz v0, :cond_1

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->START_VIDEO_SAMPLE_DURATION:D

    const/4 p1, 0x1

    return p1

    :cond_1
    return v3
.end method

.method private static final subscribeVideoStatsSample_delegate$lambda$0()Ljava/util/List;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final add(DLlive/hms/video/sdk/models/HMSPeer;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D",
            "Llive/hms/video/sdk/models/HMSPeer;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "getAudioStats"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide v0, 0x7fffffffffffffffL

    const/4 v2, 0x1

    if-eqz p3, :cond_0

    .line 14
    invoke-virtual {p3}, Llive/hms/video/sdk/models/HMSPeer;->getVideoTrack()Llive/hms/video/media/tracks/HMSVideoTrack;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Llive/hms/video/media/tracks/HMSTrack;->isMute()Z

    move-result v3

    if-ne v3, v2, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Llive/hms/video/sdk/models/HMSPeer;->getAudioTrack()Llive/hms/video/media/tracks/HMSAudioTrack;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Llive/hms/video/media/tracks/HMSTrack;->isMute()Z

    move-result v3

    if-ne v3, v2, :cond_1

    .line 15
    :goto_0
    iget-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->avSyncMsAvg:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    const/4 v2, 0x0

    if-eqz p3, :cond_2

    .line 16
    invoke-virtual {p3}, Llive/hms/video/sdk/models/HMSPeer;->getVideoTrack()Llive/hms/video/media/tracks/HMSVideoTrack;

    move-result-object v3

    goto :goto_1

    :cond_2
    move-object v3, v2

    :goto_1
    if-eqz v3, :cond_9

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Llive/hms/video/sdk/models/HMSPeer;->getAudioTrack()Llive/hms/video/media/tracks/HMSAudioTrack;

    move-result-object v3

    goto :goto_2

    :cond_3
    move-object v3, v2

    :goto_2
    if-eqz v3, :cond_9

    if-eqz p3, :cond_9

    invoke-virtual {p3}, Llive/hms/video/sdk/models/HMSPeer;->getVideoTrack()Llive/hms/video/media/tracks/HMSVideoTrack;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Llive/hms/video/media/tracks/HMSTrack;->isMute()Z

    move-result v3

    if-nez v3, :cond_9

    if-eqz p3, :cond_9

    invoke-virtual {p3}, Llive/hms/video/sdk/models/HMSPeer;->getAudioTrack()Llive/hms/video/media/tracks/HMSAudioTrack;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Llive/hms/video/media/tracks/HMSTrack;->isMute()Z

    move-result v3

    if-nez v3, :cond_9

    if-eqz p3, :cond_4

    .line 17
    invoke-virtual {p3}, Llive/hms/video/sdk/models/HMSPeer;->getAudioTrack()Llive/hms/video/media/tracks/HMSAudioTrack;

    move-result-object p3

    if-eqz p3, :cond_4

    invoke-virtual {p3}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object p3

    goto :goto_3

    :cond_4
    move-object p3, v2

    :goto_3
    if-nez p3, :cond_5

    const-string p3, ""

    .line 18
    :cond_5
    invoke-interface {p4, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lhms/webrtc/RTCStats;

    .line 19
    iget-object p4, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->avSyncMsAvg:Ljava/util/List;

    check-cast p4, Ljava/util/Collection;

    if-nez p3, :cond_6

    goto :goto_5

    .line 20
    :cond_6
    invoke-virtual {p3}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object p3

    const-string v0, "estimatedPlayoutTimestamp"

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    instance-of v0, p3, Ljava/lang/Double;

    if-eqz v0, :cond_7

    move-object v2, p3

    check-cast v2, Ljava/lang/Double;

    :cond_7
    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    goto :goto_4

    :cond_8
    const-wide/16 v0, 0x0

    :goto_4
    double-to-long v0, v0

    double-to-long p1, p1

    sub-long/2addr v0, p1

    .line 21
    :goto_5
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    .line 22
    invoke-interface {p4, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_9
    return-void
.end method

.method public final add(IJJLjava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;D)V
    .locals 1

    const-string v0, "pliCount"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nackCount"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "frameWidth"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "frameHeight"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jitterBufferEmittedCount"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-float p1, p1

    .line 1
    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->framesReceived:F

    long-to-float p1, p2

    .line 2
    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->framesDropped:F

    long-to-float p1, p4

    .line 3
    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->framesDecoded:F

    .line 4
    iget-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->frameWidthAverage:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p8}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->frameHeightAverage:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p9}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 6
    invoke-virtual {p10}, Ljava/lang/Number;->intValue()I

    move-result p1

    if-eqz p1, :cond_0

    .line 7
    iget-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->bufferJitterDelayAverage:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p10}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p2

    div-double/2addr p11, p2

    invoke-static {p11, p12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 8
    :cond_0
    invoke-virtual {p6}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->plicount:I

    .line 9
    invoke-virtual {p7}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->nackCount:I

    return-void
.end method

.method public final add(JJDD)V
    .locals 0

    long-to-int p1, p1

    .line 10
    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->pauseCount:I

    long-to-int p1, p3

    .line 11
    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->freezeCount:I

    double-to-float p1, p5

    .line 12
    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->totalPausesDuration:F

    double-to-float p1, p7

    .line 13
    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->totalFreezesDuration:F

    return-void
.end method

.method public final getAvSyncMsAvg()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->avSyncMsAvg:Ljava/util/List;

    return-object v0
.end method

.method public final getCollectedSamples(Z)Llive/hms/video/connection/stats/clientside/model/VideoAnalytics;
    .locals 25

    move-object/from16 v0, p0

    move/from16 v1, p1

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    long-to-double v2, v2

    invoke-virtual {v0, v2, v3, v1}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->shouldSample(DZ)Z

    :cond_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->getSubscribeVideoStatsSample()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;

    const/16 v23, 0x3fff

    const/16 v24, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v7 .. v24}, Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;->copy$default(Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;JFFFIIIIIIFIFFILjava/lang/Object;)Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;

    move-result-object v2

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v7, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->trackId:Ljava/lang/String;

    iget-object v8, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->ssrc:Ljava/lang/String;

    new-instance v4, Llive/hms/video/connection/stats/clientside/model/VideoAnalytics;

    const/4 v5, 0x0

    const-string v9, "regular"

    invoke-direct/range {v4 .. v9}, Llive/hms/video/connection/stats/clientside/model/VideoAnalytics;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v4
.end method

.method public final getFramesDecoded()F
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->framesDecoded:F

    return v0
.end method

.method public final getFramesDropped()F
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->framesDropped:F

    return v0
.end method

.method public final getFramesReceived()F
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->framesReceived:F

    return v0
.end method

.method public final getFreezeCount()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->freezeCount:I

    return v0
.end method

.method public final getLastFramesDecoded()F
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastFramesDecoded:F

    return v0
.end method

.method public final getLastFramesDropped()F
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastFramesDropped:F

    return v0
.end method

.method public final getLastFramesReceived()F
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastFramesReceived:F

    return v0
.end method

.method public final getLastSample()Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;

    return-object v0
.end method

.method public final getNackCount()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->nackCount:I

    return v0
.end method

.method public final getPauseCount()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->pauseCount:I

    return v0
.end method

.method public final getPlicount()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->plicount:I

    return v0
.end method

.method public final getSAMPLE_DURATION()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->SAMPLE_DURATION:D

    return-wide v0
.end method

.method public final getSTART_VIDEO_SAMPLE_DURATION()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->START_VIDEO_SAMPLE_DURATION:D

    return-wide v0
.end method

.method public final getSsrc()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->ssrc:Ljava/lang/String;

    return-object v0
.end method

.method public final getTotalFreezesDuration()F
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->totalFreezesDuration:F

    return v0
.end method

.method public final getTotalPausesDuration()F
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->totalPausesDuration:F

    return v0
.end method

.method public final getTrackId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->trackId:Ljava/lang/String;

    return-object v0
.end method

.method public final hasSample()Z
    .locals 1

    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->getSubscribeVideoStatsSample()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final resetSamples()V
    .locals 2

    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->getSubscribeVideoStatsSample()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->getSubscribeVideoStatsSample()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    invoke-static {v1, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;

    iput-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;

    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->getSubscribeVideoStatsSample()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final setAvSyncMsAvg(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->avSyncMsAvg:Ljava/util/List;

    return-void
.end method

.method public final setFramesDecoded(F)V
    .locals 0

    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->framesDecoded:F

    return-void
.end method

.method public final setFramesDropped(F)V
    .locals 0

    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->framesDropped:F

    return-void
.end method

.method public final setFramesReceived(F)V
    .locals 0

    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->framesReceived:F

    return-void
.end method

.method public final setFreezeCount(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->freezeCount:I

    return-void
.end method

.method public final setLastFramesDecoded(F)V
    .locals 0

    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastFramesDecoded:F

    return-void
.end method

.method public final setLastFramesDropped(F)V
    .locals 0

    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastFramesDropped:F

    return-void
.end method

.method public final setLastFramesReceived(F)V
    .locals 0

    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastFramesReceived:F

    return-void
.end method

.method public final setLastSample(Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;

    return-void
.end method

.method public final setNackCount(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->nackCount:I

    return-void
.end method

.method public final setPauseCount(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->pauseCount:I

    return-void
.end method

.method public final setPlicount(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->plicount:I

    return-void
.end method

.method public final setSTART_VIDEO_SAMPLE_DURATION(D)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->START_VIDEO_SAMPLE_DURATION:D

    return-void
.end method

.method public final setTotalFreezesDuration(F)V
    .locals 0

    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->totalFreezesDuration:F

    return-void
.end method

.method public final setTotalPausesDuration(F)V
    .locals 0

    iput p1, p0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->totalPausesDuration:F

    return-void
.end method

.method public final shouldSample(DZ)Z
    .locals 22

    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p2}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->shouldSampleVideo(D)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    :goto_0
    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->getSubscribeVideoStatsSample()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->getSubscribeVideoStatsSample()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v3

    invoke-static {v3, v1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;

    iput-object v1, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;

    iget-object v1, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->avSyncMsAvg:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    const-wide v7, 0x7fffffffffffffffL

    cmp-long v5, v5, v7

    if-eqz v5, :cond_2

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    iget-object v1, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->frameWidthAverage:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v4, 0x1

    if-nez v1, :cond_4

    move v1, v4

    goto :goto_2

    :cond_4
    iget-object v1, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->frameWidthAverage:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_2
    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->getSubscribeVideoStatsSample()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    move-wide/from16 v6, p1

    double-to-long v7, v6

    iget-object v6, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->frameWidthAverage:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_5

    move v15, v2

    goto :goto_3

    :cond_5
    iget-object v6, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->frameWidthAverage:Ljava/util/List;

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v6}, Lm83/s;->t0(Ljava/lang/Iterable;)D

    move-result-wide v9

    double-to-int v6, v9

    move v15, v6

    :goto_3
    iget-object v6, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->frameHeightAverage:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_6

    move/from16 v16, v2

    goto :goto_4

    :cond_6
    iget-object v6, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->frameHeightAverage:Ljava/util/List;

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v6}, Lm83/s;->t0(Ljava/lang/Iterable;)D

    move-result-wide v9

    double-to-int v6, v9

    move/from16 v16, v6

    :goto_4
    iget-object v6, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;

    if-nez v6, :cond_7

    iget v6, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->plicount:I

    :goto_5
    move v12, v6

    goto :goto_6

    :cond_7
    iget v9, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->plicount:I

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v6}, Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;->getTotal_pli_count()I

    move-result v6

    sub-int v6, v9, v6

    goto :goto_5

    :goto_6
    iget-object v6, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;

    if-nez v6, :cond_8

    iget v6, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->nackCount:I

    :goto_7
    move v13, v6

    goto :goto_8

    :cond_8
    iget v9, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->nackCount:I

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v6}, Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;->getTotal_nack_count()I

    move-result v6

    sub-int v6, v9, v6

    goto :goto_7

    :goto_8
    iget-object v6, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;

    if-nez v6, :cond_9

    iget v6, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->pauseCount:I

    :goto_9
    move/from16 v17, v6

    goto :goto_a

    :cond_9
    iget v9, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->pauseCount:I

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v6}, Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;->getPause_count()I

    move-result v6

    sub-int v6, v9, v6

    goto :goto_9

    :goto_a
    iget-object v6, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;

    if-nez v6, :cond_a

    iget v6, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->freezeCount:I

    :goto_b
    move/from16 v19, v6

    goto :goto_c

    :cond_a
    iget v9, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->freezeCount:I

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v6}, Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;->getFreeze_count()I

    move-result v6

    sub-int v6, v9, v6

    goto :goto_b

    :goto_c
    iget-object v6, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;

    if-nez v6, :cond_b

    iget v6, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->totalFreezesDuration:F

    :goto_d
    move/from16 v20, v6

    goto :goto_e

    :cond_b
    iget v9, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->totalFreezesDuration:F

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v6}, Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;->getFreeze_duration_seconds()F

    move-result v6

    sub-float v6, v9, v6

    goto :goto_d

    :goto_e
    iget-object v6, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastSample:Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;

    if-nez v6, :cond_c

    iget v6, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->totalPausesDuration:F

    :goto_f
    move/from16 v18, v6

    goto :goto_10

    :cond_c
    iget v9, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->totalPausesDuration:F

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v6}, Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;->getPause_duration_seconds()F

    move-result v6

    sub-float v6, v9, v6

    goto :goto_f

    :goto_10
    iget-object v6, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->bufferJitterDelayAverage:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_d

    const/4 v6, 0x0

    :goto_11
    move/from16 v21, v6

    goto :goto_12

    :cond_d
    iget-object v6, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->bufferJitterDelayAverage:Ljava/util/List;

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v6}, Lm83/s;->s0(Ljava/lang/Iterable;)D

    move-result-wide v9

    double-to-float v6, v9

    goto :goto_11

    :goto_12
    iget v6, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastFramesReceived:F

    const/high16 v9, -0x40800000    # -1.0f

    cmpg-float v10, v6, v9

    if-nez v10, :cond_e

    iget v6, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->framesReceived:F

    int-to-float v10, v1

    div-float/2addr v6, v10

    goto :goto_13

    :cond_e
    iget v10, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->framesReceived:F

    sub-float/2addr v10, v6

    int-to-float v6, v1

    div-float v6, v10, v6

    :goto_13
    iget v10, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastFramesDecoded:F

    cmpg-float v11, v10, v9

    if-nez v11, :cond_f

    iget v10, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->framesDecoded:F

    int-to-float v11, v1

    div-float/2addr v10, v11

    :goto_14
    move v11, v10

    goto :goto_15

    :cond_f
    iget v11, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->framesDecoded:F

    sub-float/2addr v11, v10

    int-to-float v10, v1

    div-float v10, v11, v10

    goto :goto_14

    :goto_15
    iget v10, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastFramesDropped:F

    cmpg-float v9, v10, v9

    if-nez v9, :cond_10

    iget v9, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->framesDropped:F

    :goto_16
    int-to-float v1, v1

    div-float/2addr v9, v1

    move v10, v9

    goto :goto_17

    :cond_10
    iget v9, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->framesDropped:F

    sub-float/2addr v9, v10

    goto :goto_16

    :goto_17
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_11

    :goto_18
    move v14, v2

    move v9, v6

    goto :goto_19

    :cond_11
    invoke-static {v3}, Lm83/s;->u0(Ljava/lang/Iterable;)D

    move-result-wide v1

    double-to-int v2, v1

    goto :goto_18

    :goto_19
    new-instance v6, Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;

    invoke-direct/range {v6 .. v21}, Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;-><init>(JFFFIIIIIIFIFF)V

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget v1, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->framesReceived:F

    iput v1, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastFramesReceived:F

    iget v1, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->framesDropped:F

    iput v1, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastFramesDropped:F

    iget v1, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->framesDecoded:F

    iput v1, v0, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->lastFramesDecoded:F

    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;->reset()V

    return v4
.end method
