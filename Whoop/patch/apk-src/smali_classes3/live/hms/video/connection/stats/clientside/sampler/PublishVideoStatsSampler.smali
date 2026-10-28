.class public final Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008&\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJa\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ%\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\"J\r\u0010#\u001a\u00020\u000c\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010\'\u001a\u00020&2\u0008\u0008\u0002\u0010%\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\'\u0010(J\r\u0010)\u001a\u00020\u001c\u00a2\u0006\u0004\u0008)\u0010*J\r\u0010+\u001a\u00020\u001c\u00a2\u0006\u0004\u0008+\u0010*J\u000f\u0010,\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008,\u0010*J\u0017\u0010-\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00102\u001a\u0004\u00083\u00104R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00102\u001a\u0004\u00085\u00104R\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00102\u001a\u0004\u00086\u00104R\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00087\u00104R!\u0010>\u001a\u0008\u0012\u0004\u0012\u000209088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008:\u0010;\u001a\u0004\u0008<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008A\u0010@R\u001d\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\u0019088\u0006\u00a2\u0006\u000c\n\u0004\u0008B\u0010C\u001a\u0004\u0008D\u0010=R\u001d\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u0002088\u0006\u00a2\u0006\u000c\n\u0004\u0008E\u0010C\u001a\u0004\u0008F\u0010=R\"\u0010G\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008G\u0010H\u001a\u0004\u0008I\u0010J\"\u0004\u0008K\u0010LR\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010/\u001a\u0004\u0008M\u00101\"\u0004\u0008N\u0010OR\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010H\u001a\u0004\u0008P\u0010J\"\u0004\u0008Q\u0010LR\u001d\u0010R\u001a\u0008\u0012\u0004\u0012\u00020\u0019088\u0006\u00a2\u0006\u000c\n\u0004\u0008R\u0010C\u001a\u0004\u0008S\u0010=R\u001d\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u0010088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010C\u001a\u0004\u0008T\u0010=R\u001d\u0010U\u001a\u0008\u0012\u0004\u0012\u00020\u0019088\u0006\u00a2\u0006\u000c\n\u0004\u0008U\u0010C\u001a\u0004\u0008V\u0010=R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010W\u001a\u0004\u0008X\u0010Y\"\u0004\u0008Z\u0010[R\"\u0010\\\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\\\u0010/\u001a\u0004\u0008]\u00101\"\u0004\u0008^\u0010O\u00a8\u0006_"
    }
    d2 = {
        "Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;",
        "",
        "",
        "SAMPLE_DURATION",
        "",
        "trackId",
        "rid",
        "ssrc",
        "source",
        "<init>",
        "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "currentTimeStamp",
        "",
        "isForceSample",
        "shouldSample",
        "(DZ)Z",
        "",
        "width",
        "height",
        "Llive/hms/video/connection/degredation/QualityLimitationReasons;",
        "qualityReasons",
        "availableOutgoingBitrate",
        "fps",
        "bitRate",
        "totalPacketSendDelay",
        "",
        "packetsSent",
        "timestamp",
        "Ll83/a0;",
        "add",
        "(Ljava/lang/Integer;Ljava/lang/Integer;Llive/hms/video/connection/degredation/QualityLimitationReasons;DILjava/lang/String;DDJD)V",
        "jitter",
        "packetLoss",
        "roundTripTime",
        "(DID)V",
        "hasSample",
        "()Z",
        "force",
        "Llive/hms/video/connection/stats/clientside/model/VideoAnalytics;",
        "getCollectedSamples",
        "(Z)Llive/hms/video/connection/stats/clientside/model/VideoAnalytics;",
        "resetSamples",
        "()V",
        "clearCurrentSampledStats",
        "reset",
        "shouldSampleVideo",
        "(D)Z",
        "D",
        "getSAMPLE_DURATION",
        "()D",
        "Ljava/lang/String;",
        "getTrackId",
        "()Ljava/lang/String;",
        "getRid",
        "getSsrc",
        "getSource",
        "",
        "Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;",
        "localVideoSamples$delegate",
        "Ll83/h;",
        "getLocalVideoSamples",
        "()Ljava/util/List;",
        "localVideoSamples",
        "lastKnownWidth",
        "Ljava/lang/Integer;",
        "lastKnownHeight",
        "roundTripTimeMs",
        "Ljava/util/List;",
        "getRoundTripTimeMs",
        "jitterMs",
        "getJitterMs",
        "totalPacketsLost",
        "J",
        "getTotalPacketsLost",
        "()J",
        "setTotalPacketsLost",
        "(J)V",
        "getTotalPacketSendDelay",
        "setTotalPacketSendDelay",
        "(D)V",
        "getPacketsSent",
        "setPacketsSent",
        "avgBitrateBps",
        "getAvgBitrateBps",
        "getFps",
        "avgAvailableOutgoingBitrateBps",
        "getAvgAvailableOutgoingBitrateBps",
        "Llive/hms/video/connection/degredation/QualityLimitationReasons;",
        "getQualityReasons",
        "()Llive/hms/video/connection/degredation/QualityLimitationReasons;",
        "setQualityReasons",
        "(Llive/hms/video/connection/degredation/QualityLimitationReasons;)V",
        "START_VIDEO_SAMPLE_DURATION",
        "getSTART_VIDEO_SAMPLE_DURATION",
        "setSTART_VIDEO_SAMPLE_DURATION",
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

.field private final fps:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
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

.field private lastKnownHeight:Ljava/lang/Integer;

.field private lastKnownWidth:Ljava/lang/Integer;

.field private final localVideoSamples$delegate:Ll83/h;

.field private packetsSent:J

.field private qualityReasons:Llive/hms/video/connection/degredation/QualityLimitationReasons;

.field private final rid:Ljava/lang/String;

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

.field private totalPacketSendDelay:D

.field private totalPacketsLost:J

.field private final trackId:Ljava/lang/String;


# direct methods
.method public constructor <init>(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "trackId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ssrc"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->SAMPLE_DURATION:D

    .line 3
    iput-object p3, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->trackId:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->rid:Ljava/lang/String;

    .line 5
    iput-object p5, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->ssrc:Ljava/lang/String;

    .line 6
    iput-object p6, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->source:Ljava/lang/String;

    .line 7
    new-instance p1, Lga1/a;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Lga1/a;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->localVideoSamples$delegate:Ll83/h;

    .line 8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->roundTripTimeMs:Ljava/util/List;

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->jitterMs:Ljava/util/List;

    .line 10
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->avgBitrateBps:Ljava/util/List;

    .line 11
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->fps:Ljava/util/List;

    .line 12
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->avgAvailableOutgoingBitrateBps:Ljava/util/List;

    const-wide/high16 p1, -0x4010000000000000L    # -1.0

    .line 13
    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->START_VIDEO_SAMPLE_DURATION:D

    return-void
.end method

.method public synthetic constructor <init>(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_0

    .line 14
    const-string p6, "regular"

    :cond_0
    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 15
    invoke-direct/range {v0 .. v6}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;-><init>(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a()Ljava/util/List;
    .locals 1

    invoke-static {}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->localVideoSamples_delegate$lambda$0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getCollectedSamples$default(Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;ZILjava/lang/Object;)Llive/hms/video/connection/stats/clientside/model/VideoAnalytics;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->getCollectedSamples(Z)Llive/hms/video/connection/stats/clientside/model/VideoAnalytics;

    move-result-object p0

    return-object p0
.end method

.method private final getLocalVideoSamples()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->localVideoSamples$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private static final localVideoSamples_delegate$lambda$0()Ljava/util/List;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method private final reset()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->START_VIDEO_SAMPLE_DURATION:D

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->roundTripTimeMs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->avgAvailableOutgoingBitrateBps:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->fps:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->jitterMs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->totalPacketsLost:J

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->avgBitrateBps:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public static synthetic shouldSample$default(Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;DZILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->shouldSample(DZ)Z

    move-result p0

    return p0
.end method

.method private final shouldSampleVideo(D)Z
    .locals 6

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->START_VIDEO_SAMPLE_DURATION:D

    const-wide/16 v2, 0x0

    cmpg-double v2, v0, v2

    const/4 v3, 0x0

    if-gtz v2, :cond_0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->START_VIDEO_SAMPLE_DURATION:D

    return v3

    :cond_0
    sub-double v0, p1, v0

    iget-wide v4, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->SAMPLE_DURATION:D

    cmpl-double v0, v0, v4

    if-ltz v0, :cond_1

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->START_VIDEO_SAMPLE_DURATION:D

    const/4 p1, 0x1

    return p1

    :cond_1
    return v3
.end method


# virtual methods
.method public final add(DID)V
    .locals 2

    int-to-long v0, p3

    .line 13
    iput-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->totalPacketsLost:J

    .line 14
    iget-object p3, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->jitterMs:Ljava/util/List;

    check-cast p3, Ljava/util/Collection;

    const-wide v0, 0x408f400000000000L    # 1000.0

    mul-double/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 15
    iget-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->roundTripTimeMs:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    mul-double/2addr p4, v0

    double-to-long p2, p4

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final add(Ljava/lang/Integer;Ljava/lang/Integer;Llive/hms/video/connection/degredation/QualityLimitationReasons;DILjava/lang/String;DDJD)V
    .locals 1

    const-string v0, "qualityReasons"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackId"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p7, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->lastKnownWidth:Ljava/lang/Integer;

    if-eqz p7, :cond_0

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->lastKnownHeight:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-static {p7, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p7

    if-nez p7, :cond_0

    iget-object p7, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->lastKnownHeight:Ljava/lang/Integer;

    invoke-static {p7, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p7

    if-nez p7, :cond_0

    .line 2
    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->lastKnownWidth:Ljava/lang/Integer;

    .line 3
    iput-object p2, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->lastKnownHeight:Ljava/lang/Integer;

    const/4 p1, 0x1

    move-wide p2, p14

    .line 4
    invoke-virtual {p0, p2, p3, p1}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->shouldSample(DZ)Z

    goto :goto_1

    .line 5
    :cond_0
    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->lastKnownWidth:Ljava/lang/Integer;

    .line 6
    iput-object p2, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->lastKnownHeight:Ljava/lang/Integer;

    const-wide/16 p1, 0x0

    cmpg-double p1, p4, p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->avgAvailableOutgoingBitrateBps:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    double-to-long p4, p4

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 8
    :goto_0
    iput-object p3, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->qualityReasons:Llive/hms/video/connection/degredation/QualityLimitationReasons;

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 9
    iget-object p2, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->fps:Ljava/util/List;

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 10
    iget-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->avgBitrateBps:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    double-to-long p2, p8

    const-wide/16 p4, 0x3e8

    mul-long/2addr p2, p4

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 11
    :goto_1
    iput-wide p12, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->packetsSent:J

    .line 12
    iput-wide p10, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->totalPacketSendDelay:D

    return-void
.end method

.method public final clearCurrentSampledStats()V
    .locals 0

    invoke-virtual {p0}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->resetSamples()V

    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->reset()V

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

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->avgAvailableOutgoingBitrateBps:Ljava/util/List;

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

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->avgBitrateBps:Ljava/util/List;

    return-object v0
.end method

.method public final getCollectedSamples(Z)Llive/hms/video/connection/stats/clientside/model/VideoAnalytics;
    .locals 27

    move-object/from16 v0, p0

    if-eqz p1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    long-to-double v1, v1

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->shouldSample(DZ)Z

    :cond_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->getLocalVideoSamples()Ljava/util/List;

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

    check-cast v7, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;

    const/16 v25, 0x7ff

    const/16 v26, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    invoke-static/range {v7 .. v26}, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->copy$default(Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;Llive/hms/video/connection/stats/clientside/model/QualityLimitation;ILlive/hms/video/connection/stats/clientside/model/Size;JIFJJJDJILjava/lang/Object;)Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;

    move-result-object v2

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v5, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->rid:Ljava/lang/String;

    iget-object v7, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->trackId:Ljava/lang/String;

    iget-object v8, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->ssrc:Ljava/lang/String;

    iget-object v9, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->source:Ljava/lang/String;

    new-instance v4, Llive/hms/video/connection/stats/clientside/model/VideoAnalytics;

    invoke-direct/range {v4 .. v9}, Llive/hms/video/connection/stats/clientside/model/VideoAnalytics;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v4
.end method

.method public final getFps()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->fps:Ljava/util/List;

    return-object v0
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

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->jitterMs:Ljava/util/List;

    return-object v0
.end method

.method public final getPacketsSent()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->packetsSent:J

    return-wide v0
.end method

.method public final getQualityReasons()Llive/hms/video/connection/degredation/QualityLimitationReasons;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->qualityReasons:Llive/hms/video/connection/degredation/QualityLimitationReasons;

    return-object v0
.end method

.method public final getRid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->rid:Ljava/lang/String;

    return-object v0
.end method

.method public final getRoundTripTimeMs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->roundTripTimeMs:Ljava/util/List;

    return-object v0
.end method

.method public final getSAMPLE_DURATION()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->SAMPLE_DURATION:D

    return-wide v0
.end method

.method public final getSTART_VIDEO_SAMPLE_DURATION()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->START_VIDEO_SAMPLE_DURATION:D

    return-wide v0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final getSsrc()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->ssrc:Ljava/lang/String;

    return-object v0
.end method

.method public final getTotalPacketSendDelay()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->totalPacketSendDelay:D

    return-wide v0
.end method

.method public final getTotalPacketsLost()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->totalPacketsLost:J

    return-wide v0
.end method

.method public final getTrackId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->trackId:Ljava/lang/String;

    return-object v0
.end method

.method public final hasSample()Z
    .locals 1

    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->getLocalVideoSamples()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final resetSamples()V
    .locals 1

    invoke-direct {p0}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->getLocalVideoSamples()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final setPacketsSent(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->packetsSent:J

    return-void
.end method

.method public final setQualityReasons(Llive/hms/video/connection/degredation/QualityLimitationReasons;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->qualityReasons:Llive/hms/video/connection/degredation/QualityLimitationReasons;

    return-void
.end method

.method public final setSTART_VIDEO_SAMPLE_DURATION(D)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->START_VIDEO_SAMPLE_DURATION:D

    return-void
.end method

.method public final setTotalPacketSendDelay(D)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->totalPacketSendDelay:D

    return-void
.end method

.method public final setTotalPacketsLost(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->totalPacketsLost:J

    return-void
.end method

.method public final shouldSample(DZ)Z
    .locals 21

    move-object/from16 v0, p0

    const/4 v1, 0x0

    if-nez p3, :cond_1

    invoke-direct/range {p0 .. p2}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->shouldSampleVideo(D)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->getLocalVideoSamples()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    move-wide/from16 v3, p1

    double-to-long v7, v3

    iget-object v3, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->roundTripTimeMs:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    move v9, v1

    goto :goto_1

    :cond_2
    iget-object v3, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->roundTripTimeMs:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lm83/s;->u0(Ljava/lang/Iterable;)D

    move-result-wide v3

    double-to-int v3, v3

    move v9, v3

    :goto_1
    iget-object v3, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->avgAvailableOutgoingBitrateBps:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    const-wide/16 v4, 0x0

    if-eqz v3, :cond_3

    move-wide v15, v4

    goto :goto_2

    :cond_3
    iget-object v3, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->avgAvailableOutgoingBitrateBps:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lm83/s;->u0(Ljava/lang/Iterable;)D

    move-result-wide v10

    double-to-long v10, v10

    move-wide v15, v10

    :goto_2
    iget-object v3, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->avgBitrateBps:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    :goto_3
    move-wide v13, v4

    goto :goto_4

    :cond_4
    iget-object v3, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->avgBitrateBps:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lm83/s;->u0(Ljava/lang/Iterable;)D

    move-result-wide v3

    double-to-long v4, v3

    goto :goto_3

    :goto_4
    iget-object v3, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->jitterMs:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_5

    move v10, v4

    goto :goto_5

    :cond_5
    iget-object v3, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->jitterMs:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lm83/s;->s0(Ljava/lang/Iterable;)D

    move-result-wide v5

    double-to-float v3, v5

    move v10, v3

    :goto_5
    iget-wide v11, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->totalPacketsLost:J

    iget-object v3, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->fps:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_6

    move v5, v1

    :goto_6
    move v3, v4

    goto :goto_7

    :cond_6
    iget-object v3, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->fps:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lm83/s;->t0(Ljava/lang/Iterable;)D

    move-result-wide v5

    double-to-int v3, v5

    move v5, v3

    goto :goto_6

    :goto_7
    new-instance v4, Llive/hms/video/connection/stats/clientside/model/QualityLimitation;

    iget-object v6, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->qualityReasons:Llive/hms/video/connection/degredation/QualityLimitationReasons;

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Llive/hms/video/connection/degredation/QualityLimitationReasons;->getBandWidth()Ljava/lang/Double;

    move-result-object v6

    if-eqz v6, :cond_7

    move-object/from16 p3, v2

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    double-to-float v1, v1

    goto :goto_8

    :cond_7
    move-object/from16 p3, v2

    move v1, v3

    :goto_8
    iget-object v2, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->qualityReasons:Llive/hms/video/connection/degredation/QualityLimitationReasons;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/QualityLimitationReasons;->getCpu()Ljava/lang/Double;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    double-to-float v2, v2

    goto :goto_9

    :cond_8
    move v2, v3

    :goto_9
    invoke-direct {v4, v1, v2}, Llive/hms/video/connection/stats/clientside/model/QualityLimitation;-><init>(FF)V

    new-instance v6, Llive/hms/video/connection/stats/clientside/model/Size;

    iget-object v1, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->lastKnownWidth:Ljava/lang/Integer;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_a

    :cond_9
    const/4 v1, 0x0

    :goto_a
    iget-object v2, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->lastKnownHeight:Ljava/lang/Integer;

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_b

    :cond_a
    const/4 v2, 0x0

    :goto_b
    invoke-direct {v6, v1, v2}, Llive/hms/video/connection/stats/clientside/model/Size;-><init>(II)V

    iget-wide v1, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->packetsSent:J

    move-wide/from16 v19, v1

    iget-wide v1, v0, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->totalPacketSendDelay:D

    new-instance v3, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;

    move-wide/from16 v17, v1

    invoke-direct/range {v3 .. v20}, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;-><init>(Llive/hms/video/connection/stats/clientside/model/QualityLimitation;ILlive/hms/video/connection/stats/clientside/model/Size;JIFJJJDJ)V

    move-object/from16 v2, p3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    invoke-direct {v0}, Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;->reset()V

    const/4 v1, 0x1

    return v1
.end method
