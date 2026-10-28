.class public final Llive/hms/video/connection/stats/HMSLocalVideoStats;
.super Llive/hms/video/connection/stats/HMSStats$HMSLocalStats;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bi\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010(\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\t\u0010*\u001a\u00020\u000cH\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010-\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0084\u0001\u0010.\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\u0008\u00102\u001a\u0004\u0018\u000103H\u00d6\u0003J\t\u00104\u001a\u000205H\u00d6\u0001J\t\u00106\u001a\u000207H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\u0008\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0014R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\u0008\u0017\u0010\u0018R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\u0008\u001a\u0010\u0014R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\u0008\u001d\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\u0008\"\u0010\u0018R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\u0008#\u0010\u0018\u00a8\u00068"
    }
    d2 = {
        "Llive/hms/video/connection/stats/HMSLocalVideoStats;",
        "Llive/hms/video/connection/stats/HMSStats$HMSLocalStats;",
        "jitter",
        "",
        "roundTripTime",
        "bytesSent",
        "",
        "bitrate",
        "resolution",
        "Llive/hms/video/media/settings/HMSVideoResolution;",
        "frameRate",
        "qualityLimitationReason",
        "Llive/hms/video/connection/degredation/QualityLimitationReasons;",
        "hmsLayer",
        "Llive/hms/video/media/settings/HMSLayer;",
        "packetLoss",
        "packetsSent",
        "<init>",
        "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Llive/hms/video/media/settings/HMSVideoResolution;Ljava/lang/Double;Llive/hms/video/connection/degredation/QualityLimitationReasons;Llive/hms/video/media/settings/HMSLayer;Ljava/lang/Long;Ljava/lang/Long;)V",
        "getJitter",
        "()Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "getRoundTripTime",
        "getBytesSent",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getBitrate",
        "getResolution",
        "()Llive/hms/video/media/settings/HMSVideoResolution;",
        "getFrameRate",
        "getQualityLimitationReason",
        "()Llive/hms/video/connection/degredation/QualityLimitationReasons;",
        "getHmsLayer",
        "()Llive/hms/video/media/settings/HMSLayer;",
        "getPacketLoss",
        "getPacketsSent",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "copy",
        "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Llive/hms/video/media/settings/HMSVideoResolution;Ljava/lang/Double;Llive/hms/video/connection/degredation/QualityLimitationReasons;Llive/hms/video/media/settings/HMSLayer;Ljava/lang/Long;Ljava/lang/Long;)Llive/hms/video/connection/stats/HMSLocalVideoStats;",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final bitrate:Ljava/lang/Double;

.field private final bytesSent:Ljava/lang/Long;

.field private final frameRate:Ljava/lang/Double;

.field private final hmsLayer:Llive/hms/video/media/settings/HMSLayer;

.field private final jitter:Ljava/lang/Double;

.field private final packetLoss:Ljava/lang/Long;

.field private final packetsSent:Ljava/lang/Long;

.field private final qualityLimitationReason:Llive/hms/video/connection/degredation/QualityLimitationReasons;

.field private final resolution:Llive/hms/video/media/settings/HMSVideoResolution;

.field private final roundTripTime:Ljava/lang/Double;


# direct methods
.method public constructor <init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Llive/hms/video/media/settings/HMSVideoResolution;Ljava/lang/Double;Llive/hms/video/connection/degredation/QualityLimitationReasons;Llive/hms/video/media/settings/HMSLayer;Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 1

    const-string v0, "qualityLimitationReason"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Llive/hms/video/connection/stats/HMSStats$HMSLocalStats;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->jitter:Ljava/lang/Double;

    iput-object p2, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->roundTripTime:Ljava/lang/Double;

    iput-object p3, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->bytesSent:Ljava/lang/Long;

    iput-object p4, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->bitrate:Ljava/lang/Double;

    iput-object p5, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->resolution:Llive/hms/video/media/settings/HMSVideoResolution;

    iput-object p6, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->frameRate:Ljava/lang/Double;

    iput-object p7, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->qualityLimitationReason:Llive/hms/video/connection/degredation/QualityLimitationReasons;

    iput-object p8, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->hmsLayer:Llive/hms/video/media/settings/HMSLayer;

    iput-object p9, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->packetLoss:Ljava/lang/Long;

    iput-object p10, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->packetsSent:Ljava/lang/Long;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/connection/stats/HMSLocalVideoStats;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Llive/hms/video/media/settings/HMSVideoResolution;Ljava/lang/Double;Llive/hms/video/connection/degredation/QualityLimitationReasons;Llive/hms/video/media/settings/HMSLayer;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/Object;)Llive/hms/video/connection/stats/HMSLocalVideoStats;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->jitter:Ljava/lang/Double;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->roundTripTime:Ljava/lang/Double;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->bytesSent:Ljava/lang/Long;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->bitrate:Ljava/lang/Double;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->resolution:Llive/hms/video/media/settings/HMSVideoResolution;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->frameRate:Ljava/lang/Double;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->qualityLimitationReason:Llive/hms/video/connection/degredation/QualityLimitationReasons;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->hmsLayer:Llive/hms/video/media/settings/HMSLayer;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->packetLoss:Ljava/lang/Long;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->packetsSent:Ljava/lang/Long;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Llive/hms/video/connection/stats/HMSLocalVideoStats;->copy(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Llive/hms/video/media/settings/HMSVideoResolution;Ljava/lang/Double;Llive/hms/video/connection/degredation/QualityLimitationReasons;Llive/hms/video/media/settings/HMSLayer;Ljava/lang/Long;Ljava/lang/Long;)Llive/hms/video/connection/stats/HMSLocalVideoStats;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->jitter:Ljava/lang/Double;

    return-object v0
.end method

.method public final component10()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->packetsSent:Ljava/lang/Long;

    return-object v0
.end method

.method public final component2()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->roundTripTime:Ljava/lang/Double;

    return-object v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->bytesSent:Ljava/lang/Long;

    return-object v0
.end method

.method public final component4()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->bitrate:Ljava/lang/Double;

    return-object v0
.end method

.method public final component5()Llive/hms/video/media/settings/HMSVideoResolution;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->resolution:Llive/hms/video/media/settings/HMSVideoResolution;

    return-object v0
.end method

.method public final component6()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->frameRate:Ljava/lang/Double;

    return-object v0
.end method

.method public final component7()Llive/hms/video/connection/degredation/QualityLimitationReasons;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->qualityLimitationReason:Llive/hms/video/connection/degredation/QualityLimitationReasons;

    return-object v0
.end method

.method public final component8()Llive/hms/video/media/settings/HMSLayer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->hmsLayer:Llive/hms/video/media/settings/HMSLayer;

    return-object v0
.end method

.method public final component9()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->packetLoss:Ljava/lang/Long;

    return-object v0
.end method

.method public final copy(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Llive/hms/video/media/settings/HMSVideoResolution;Ljava/lang/Double;Llive/hms/video/connection/degredation/QualityLimitationReasons;Llive/hms/video/media/settings/HMSLayer;Ljava/lang/Long;Ljava/lang/Long;)Llive/hms/video/connection/stats/HMSLocalVideoStats;
    .locals 12

    const-string v0, "qualityLimitationReason"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/connection/stats/HMSLocalVideoStats;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Llive/hms/video/connection/stats/HMSLocalVideoStats;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Llive/hms/video/media/settings/HMSVideoResolution;Ljava/lang/Double;Llive/hms/video/connection/degredation/QualityLimitationReasons;Llive/hms/video/media/settings/HMSLayer;Ljava/lang/Long;Ljava/lang/Long;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/connection/stats/HMSLocalVideoStats;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/connection/stats/HMSLocalVideoStats;

    iget-object v1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->jitter:Ljava/lang/Double;

    iget-object v3, p1, Llive/hms/video/connection/stats/HMSLocalVideoStats;->jitter:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->roundTripTime:Ljava/lang/Double;

    iget-object v3, p1, Llive/hms/video/connection/stats/HMSLocalVideoStats;->roundTripTime:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->bytesSent:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/connection/stats/HMSLocalVideoStats;->bytesSent:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->bitrate:Ljava/lang/Double;

    iget-object v3, p1, Llive/hms/video/connection/stats/HMSLocalVideoStats;->bitrate:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->resolution:Llive/hms/video/media/settings/HMSVideoResolution;

    iget-object v3, p1, Llive/hms/video/connection/stats/HMSLocalVideoStats;->resolution:Llive/hms/video/media/settings/HMSVideoResolution;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->frameRate:Ljava/lang/Double;

    iget-object v3, p1, Llive/hms/video/connection/stats/HMSLocalVideoStats;->frameRate:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->qualityLimitationReason:Llive/hms/video/connection/degredation/QualityLimitationReasons;

    iget-object v3, p1, Llive/hms/video/connection/stats/HMSLocalVideoStats;->qualityLimitationReason:Llive/hms/video/connection/degredation/QualityLimitationReasons;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->hmsLayer:Llive/hms/video/media/settings/HMSLayer;

    iget-object v3, p1, Llive/hms/video/connection/stats/HMSLocalVideoStats;->hmsLayer:Llive/hms/video/media/settings/HMSLayer;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->packetLoss:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/connection/stats/HMSLocalVideoStats;->packetLoss:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->packetsSent:Ljava/lang/Long;

    iget-object p1, p1, Llive/hms/video/connection/stats/HMSLocalVideoStats;->packetsSent:Ljava/lang/Long;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getBitrate()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->bitrate:Ljava/lang/Double;

    return-object v0
.end method

.method public final getBytesSent()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->bytesSent:Ljava/lang/Long;

    return-object v0
.end method

.method public final getFrameRate()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->frameRate:Ljava/lang/Double;

    return-object v0
.end method

.method public final getHmsLayer()Llive/hms/video/media/settings/HMSLayer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->hmsLayer:Llive/hms/video/media/settings/HMSLayer;

    return-object v0
.end method

.method public final getJitter()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->jitter:Ljava/lang/Double;

    return-object v0
.end method

.method public final getPacketLoss()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->packetLoss:Ljava/lang/Long;

    return-object v0
.end method

.method public final getPacketsSent()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->packetsSent:Ljava/lang/Long;

    return-object v0
.end method

.method public final getQualityLimitationReason()Llive/hms/video/connection/degredation/QualityLimitationReasons;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->qualityLimitationReason:Llive/hms/video/connection/degredation/QualityLimitationReasons;

    return-object v0
.end method

.method public final getResolution()Llive/hms/video/media/settings/HMSVideoResolution;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->resolution:Llive/hms/video/media/settings/HMSVideoResolution;

    return-object v0
.end method

.method public final getRoundTripTime()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->roundTripTime:Ljava/lang/Double;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->jitter:Ljava/lang/Double;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->roundTripTime:Ljava/lang/Double;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->bytesSent:Ljava/lang/Long;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->bitrate:Ljava/lang/Double;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->resolution:Llive/hms/video/media/settings/HMSVideoResolution;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Llive/hms/video/media/settings/HMSVideoResolution;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->frameRate:Ljava/lang/Double;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->qualityLimitationReason:Llive/hms/video/connection/degredation/QualityLimitationReasons;

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/QualityLimitationReasons;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->hmsLayer:Llive/hms/video/media/settings/HMSLayer;

    if-nez v0, :cond_6

    move v0, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_6
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->packetLoss:Ljava/lang/Long;

    if-nez v0, :cond_7

    move v0, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_7
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->packetsSent:Ljava/lang/Long;

    if-nez v0, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v2, v1

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSLocalVideoStats(jitter="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->jitter:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", roundTripTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->roundTripTime:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bytesSent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->bytesSent:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bitrate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->bitrate:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", resolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->resolution:Llive/hms/video/media/settings/HMSVideoResolution;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", frameRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->frameRate:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", qualityLimitationReason="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->qualityLimitationReason:Llive/hms/video/connection/degredation/QualityLimitationReasons;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hmsLayer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->hmsLayer:Llive/hms/video/media/settings/HMSLayer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", packetLoss="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->packetLoss:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", packetsSent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/stats/HMSLocalVideoStats;->packetsSent:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
