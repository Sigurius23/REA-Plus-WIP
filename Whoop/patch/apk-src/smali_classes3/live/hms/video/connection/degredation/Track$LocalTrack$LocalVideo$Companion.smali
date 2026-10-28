.class public final Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JQ\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00010\u00072\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u0007\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo$Companion;",
        "",
        "<init>",
        "()V",
        "from",
        "Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;",
        "videoStat",
        "",
        "",
        "extraData",
        "Lhms/webrtc/RTCStats;",
        "candidatePairInfo",
        "primaryTimestamp",
        "",
        "localTracksJitter",
        "",
        "(Ljava/util/Map;Lhms/webrtc/RTCStats;Lhms/webrtc/RTCStats;Ljava/lang/Double;Ljava/util/Map;)Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Ljava/util/Map;Lhms/webrtc/RTCStats;Lhms/webrtc/RTCStats;Ljava/lang/Double;Ljava/util/Map;)Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lhms/webrtc/RTCStats;",
            "Lhms/webrtc/RTCStats;",
            "Ljava/lang/Double;",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Double;",
            ">;)",
            "Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p5

    const-string v2, "videoStat"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "localTracksJitter"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "frameWidth"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    long-to-int v2, v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    const-string v4, "frameHeight"

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v3

    :goto_1
    if-eqz v2, :cond_2

    if-eqz v4, :cond_2

    new-instance v5, Llive/hms/video/media/settings/HMSVideoResolution;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-direct {v5, v2, v4}, Llive/hms/video/media/settings/HMSVideoResolution;-><init>(II)V

    move-object v10, v5

    goto :goto_2

    :cond_2
    move-object v10, v3

    :goto_2
    const-string v2, "qualityLimitationDurations"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/HashMap;

    const-string v4, "ssrc"

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    if-eqz v4, :cond_3

    move-object/from16 v17, v4

    goto :goto_3

    :cond_3
    move-object/from16 v17, v3

    :goto_3
    if-eqz v17, :cond_4

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    move-object v7, v1

    goto :goto_4

    :cond_4
    move-object v7, v3

    :goto_4
    const-string v1, "framesPerSecond"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Ljava/lang/Number;

    const-string v1, "bytesSent"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Ljava/math/BigInteger;

    if-eqz p3, :cond_5

    invoke-virtual/range {p3 .. p3}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_5

    const-string v4, "currentRoundTripTime"

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_5

    :cond_5
    move-object v1, v3

    :goto_5
    move-object v8, v1

    check-cast v8, Ljava/lang/Double;

    if-eqz p2, :cond_6

    invoke-virtual/range {p2 .. p2}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_6

    const-string v4, "trackIdentifier"

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_6

    :cond_6
    move-object v1, v3

    :goto_6
    move-object v12, v1

    check-cast v12, Ljava/lang/String;

    const-string v1, "packetsSent"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Ljava/lang/Long;

    new-instance v15, Llive/hms/video/connection/degredation/QualityLimitationReasons;

    const-string v1, "qualityLimitationReason"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v19, v1

    check-cast v19, Ljava/lang/String;

    if-eqz v2, :cond_7

    const-string v1, "bandwidth"

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    move-object/from16 v20, v1

    goto :goto_7

    :cond_7
    move-object/from16 v20, v3

    :goto_7
    if-eqz v2, :cond_8

    const-string v1, "cpu"

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    move-object/from16 v21, v1

    goto :goto_8

    :cond_8
    move-object/from16 v21, v3

    :goto_8
    if-eqz v2, :cond_9

    const-string v1, "none"

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    move-object/from16 v22, v1

    goto :goto_9

    :cond_9
    move-object/from16 v22, v3

    :goto_9
    if-eqz v2, :cond_a

    const-string v1, "other"

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/Double;

    :cond_a
    move-object/from16 v23, v3

    const/16 v25, 0x20

    const/16 v26, 0x0

    const/16 v24, 0x0

    move-object/from16 v18, v15

    invoke-direct/range {v18 .. v26}, Llive/hms/video/connection/degredation/QualityLimitationReasons;-><init>(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, Llive/hms/video/utils/HMSUtils;->INSTANCE:Llive/hms/video/utils/HMSUtils;

    const-string v2, "rid"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Llive/hms/video/utils/HMSUtils;->ridToHMSLayerMapper$lib_release(Ljava/lang/String;)Llive/hms/video/media/settings/HMSLayer;

    move-result-object v16

    new-instance v6, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;

    const/16 v18, 0x0

    move-object/from16 v13, p4

    invoke-direct/range {v6 .. v18}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;Llive/hms/video/media/settings/HMSVideoResolution;Ljava/lang/Number;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Llive/hms/video/connection/degredation/QualityLimitationReasons;Llive/hms/video/media/settings/HMSLayer;Ljava/lang/Long;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method
