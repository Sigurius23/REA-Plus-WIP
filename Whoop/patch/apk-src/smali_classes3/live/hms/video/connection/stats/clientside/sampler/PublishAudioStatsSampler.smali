.class public final Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\t\n\u0002\u0008\u000f\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J%\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\u0008 \u0010!J\r\u0010\"\u001a\u00020\n\u00a2\u0006\u0004\u0008\"\u0010\u000cJ\r\u0010#\u001a\u00020\n\u00a2\u0006\u0004\u0008#\u0010\u000cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010$\u001a\u0004\u0008%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\'\u001a\u0004\u0008(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\'\u001a\u0004\u0008*\u0010)R\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\'\u001a\u0004\u0008+\u0010)R!\u00102\u001a\u0008\u0012\u0004\u0012\u00020-0,8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101R\"\u00103\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00083\u0010$\u001a\u0004\u00084\u0010&\"\u0004\u00085\u00106R\u001a\u00108\u001a\u0008\u0012\u0004\u0012\u0002070,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u001d\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\u00020,8\u0006\u00a2\u0006\u000c\n\u0004\u0008:\u00109\u001a\u0004\u0008;\u00101R\"\u0010<\u001a\u0002078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u0010?\"\u0004\u0008@\u0010AR\u001d\u0010B\u001a\u0008\u0012\u0004\u0012\u0002070,8\u0006\u00a2\u0006\u000c\n\u0004\u0008B\u00109\u001a\u0004\u0008C\u00101R\u001d\u0010D\u001a\u0008\u0012\u0004\u0012\u0002070,8\u0006\u00a2\u0006\u000c\n\u0004\u0008D\u00109\u001a\u0004\u0008E\u00101\u00a8\u0006F"
    }
    d2 = {
        "Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;",
        "",
        "",
        "SAMPLE_DURATION",
        "",
        "trackId",
        "ssrc",
        "source",
        "<init>",
        "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "Ll83/a0;",
        "reset",
        "()V",
        "currentTimeStamp",
        "",
        "shouldSampleAudio",
        "(D)Z",
        "force",
        "shouldSample",
        "(DZ)Z",
        "availableOutgoingBitrate",
        "bitRate",
        "add",
        "(DD)V",
        "jitter",
        "",
        "packetLoss",
        "roundTripTime",
        "(DID)V",
        "hasSample",
        "()Z",
        "Llive/hms/video/connection/stats/clientside/model/AudioAnalytics;",
        "getCollectedSamples",
        "(Z)Llive/hms/video/connection/stats/clientside/model/AudioAnalytics;",
        "resetSamples",
        "clearCurrentSampledStats",
        "D",
        "getSAMPLE_DURATION",
        "()D",
        "Ljava/lang/String;",
        "getTrackId",
        "()Ljava/lang/String;",
        "getSsrc",
        "getSource",
        "",
        "Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;",
        "localAudioSamples$delegate",
        "Ll83/h;",
        "getLocalAudioSamples",
        "()Ljava/util/List;",
        "localAudioSamples",
        "START_AUDIO_SAMPLE_DURATION",
        "getSTART_AUDIO_SAMPLE_DURATION",
        "setSTART_AUDIO_SAMPLE_DURATION",
        "(D)V",
        "",
        "roundTripTimeMs",
        "Ljava/util/List;",
        "jitterMs",
        "getJitterMs",
        "totalPacketsLost",
        "J",
        "getTotalPacketsLost",
        "()J",
        "setTotalPacketsLost",
        "(J)V",
        "avgBitrateBps",
        "getAvgBitrateBps",
        "avgAvailableOutgoingBitrateBps",
        "getAvgAvailableOutgoingBitrateBps",
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

.field private final avgAvailableOutgoingBitrateBps:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final avgBitrateBps:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final jitterMs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private final localAudioSamples$delegate:Ll83/h;

.field private final roundTripTimeMs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final source:Ljava/lang/String;

.field private final ssrc:Ljava/lang/String;

.field private totalPacketsLost:J

.field private final trackId:Ljava/lang/String;


# direct methods
.method public constructor <init>(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "trackId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ssrc"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->SAMPLE_DURATION:D

    .line 3
    iput-object p3, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->trackId:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->ssrc:Ljava/lang/String;

    .line 5
    iput-object p5, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->source:Ljava/lang/String;

    .line 6
    new-instance p1, Lga1/a;

    const/16 p2, 0x9

    invoke-direct {p1, p2}, Lga1/a;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->localAudioSamples$delegate:Ll83/h;

    .line 7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->roundTripTimeMs:Ljava/util/List;

    .line 8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->jitterMs:Ljava/util/List;

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->avgBitrateBps:Ljava/util/List;

    .line 10
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->avgAvailableOutgoingBitrateBps:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    .line 11
    const-string p5, "regular"

    :cond_0
    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 12
    invoke-direct/range {v0 .. v5}, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;-><init>(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a()Ljava/util/List;
    .locals 1

    invoke-static {}, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->localAudioSamples_delegate$lambda$0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getCollectedSamples$default(Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;ZILjava/lang/Object;)Llive/hms/video/connection/stats/clientside/model/AudioAnalytics;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->getCollectedSamples(Z)Llive/hms/video/connection/stats/clientside/model/AudioAnalytics;

    move-result-object p0

    return-object p0
.end method

.method private final getLocalAudioSamples()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->localAudioSamples$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private static final localAudioSamples_delegate$lambda$0()Ljava/util/List;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method private final reset()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->START_AUDIO_SAMPLE_DURATION:D

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->roundTripTimeMs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->avgAvailableOutgoingBitrateBps:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->jitterMs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->totalPacketsLost:J

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->avgBitrateBps:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public static synthetic shouldSample$default(Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;DZILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->shouldSample(DZ)Z

    move-result p0

    return p0
.end method

.method private final shouldSampleAudio(D)Z
    .locals 6

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->START_AUDIO_SAMPLE_DURATION:D

    const-wide/16 v2, 0x0

    cmpg-double v2, v0, v2

    const/4 v3, 0x0

    if-gtz v2, :cond_0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->START_AUDIO_SAMPLE_DURATION:D

    return v3

    :cond_0
    sub-double v0, p1, v0

    iget-wide v4, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->SAMPLE_DURATION:D

    cmpl-double v0, v0, v4

    if-ltz v0, :cond_1

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->START_AUDIO_SAMPLE_DURATION:D

    const/4 p1, 0x1

    return p1

    :cond_1
    return v3
.end method


# virtual methods
.method public final add(DD)V
    .locals 2

    const-wide/16 v0, 0x0

    cmpg-double v0, p1, v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->avgAvailableOutgoingBitrateBps:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    double-to-long p1, p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 2
    :goto_0
    iget-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->avgBitrateBps:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    double-to-long p2, p3

    const-wide/16 v0, 0x3e8

    mul-long/2addr p2, v0

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final add(DID)V
    .locals 3

    .line 3
    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->roundTripTimeMs:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    const/16 v1, 0x3e8

    int-to-double v1, v1

    mul-double/2addr p4, v1

    double-to-long p4, p4

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p4

    invoke-interface {v0, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    int-to-long p3, p3

    .line 4
    iput-wide p3, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->totalPacketsLost:J

    .line 5
    iget-object p3, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->jitterMs:Ljava/util/List;

    check-cast p3, Ljava/util/Collection;

    const-wide p4, 0x408f400000000000L    # 1000.0

    mul-double/2addr p1, p4

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final clearCurrentSampledStats()V
    .locals 0

    invoke-virtual {p0}, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->resetSamples()V

    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->reset()V

    return-void
.end method

.method public final getAvgAvailableOutgoingBitrateBps()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->avgAvailableOutgoingBitrateBps:Ljava/util/List;

    return-object v0
.end method

.method public final getAvgBitrateBps()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->avgBitrateBps:Ljava/util/List;

    return-object v0
.end method

.method public final getCollectedSamples(Z)Llive/hms/video/connection/stats/clientside/model/AudioAnalytics;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    long-to-double v2, v2

    invoke-virtual {v0, v2, v3, v1}, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->shouldSample(DZ)Z

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->getLocalAudioSamples()Ljava/util/List;

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

    check-cast v4, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;

    const/16 v15, 0x3f

    const/16 v16, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    invoke-static/range {v4 .. v16}, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->copy$default(Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;JIFJJJILjava/lang/Object;)Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v2, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->trackId:Ljava/lang/String;

    iget-object v3, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->ssrc:Ljava/lang/String;

    iget-object v4, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->source:Ljava/lang/String;

    new-instance v5, Llive/hms/video/connection/stats/clientside/model/AudioAnalytics;

    invoke-direct {v5, v1, v2, v3, v4}, Llive/hms/video/connection/stats/clientside/model/AudioAnalytics;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v5
.end method

.method public final getJitterMs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->jitterMs:Ljava/util/List;

    return-object v0
.end method

.method public final getSAMPLE_DURATION()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->SAMPLE_DURATION:D

    return-wide v0
.end method

.method public final getSTART_AUDIO_SAMPLE_DURATION()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->START_AUDIO_SAMPLE_DURATION:D

    return-wide v0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final getSsrc()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->ssrc:Ljava/lang/String;

    return-object v0
.end method

.method public final getTotalPacketsLost()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->totalPacketsLost:J

    return-wide v0
.end method

.method public final getTrackId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->trackId:Ljava/lang/String;

    return-object v0
.end method

.method public final hasSample()Z
    .locals 1

    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->getLocalAudioSamples()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final resetSamples()V
    .locals 1

    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->getLocalAudioSamples()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final setSTART_AUDIO_SAMPLE_DURATION(D)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->START_AUDIO_SAMPLE_DURATION:D

    return-void
.end method

.method public final setTotalPacketsLost(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->totalPacketsLost:J

    return-void
.end method

.method public final shouldSample(DZ)Z
    .locals 13

    invoke-direct/range {p0 .. p2}, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->shouldSampleAudio(D)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->getLocalAudioSamples()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    double-to-long v3, p1

    iget-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->roundTripTimeMs:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_1
    move v5, v1

    goto :goto_2

    :cond_2
    iget-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->roundTripTimeMs:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->u0(Ljava/lang/Iterable;)D

    move-result-wide p1

    double-to-int v1, p1

    goto :goto_1

    :goto_2
    iget-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->avgAvailableOutgoingBitrateBps:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    const-wide/16 v1, 0x0

    if-eqz p1, :cond_3

    move-wide v11, v1

    goto :goto_3

    :cond_3
    iget-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->avgAvailableOutgoingBitrateBps:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->u0(Ljava/lang/Iterable;)D

    move-result-wide p1

    double-to-long p1, p1

    move-wide v11, p1

    :goto_3
    iget-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->avgBitrateBps:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    :goto_4
    move-wide v9, v1

    goto :goto_5

    :cond_4
    iget-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->avgBitrateBps:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->u0(Ljava/lang/Iterable;)D

    move-result-wide p1

    double-to-long v1, p1

    goto :goto_4

    :goto_5
    iget-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->jitterMs:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x0

    :goto_6
    move v6, p1

    goto :goto_7

    :cond_5
    iget-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->jitterMs:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->s0(Ljava/lang/Iterable;)D

    move-result-wide p1

    double-to-float p1, p1

    goto :goto_6

    :goto_7
    iget-wide v7, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->totalPacketsLost:J

    new-instance v2, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;

    invoke-direct/range {v2 .. v12}, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;-><init>(JIFJJJ)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;->reset()V

    const/4 p1, 0x1

    return p1
.end method
