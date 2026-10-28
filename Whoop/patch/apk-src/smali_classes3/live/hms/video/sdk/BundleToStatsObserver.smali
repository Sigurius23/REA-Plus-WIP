.class public final Llive/hms/video/sdk/BundleToStatsObserver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/sdk/BundleToStatsObserver$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JI\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J[\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00192\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00192\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f\u00a2\u0006\u0004\u0008\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Llive/hms/video/sdk/BundleToStatsObserver;",
        "",
        "<init>",
        "()V",
        "Llive/hms/video/sdk/PublishConnection;",
        "audioPubConnection",
        "videoPubConnection",
        "Llive/hms/video/sdk/SubscribeConnection;",
        "audioSubConnection",
        "videoSubConnection",
        "Llive/hms/video/connection/stats/HMSStatsObserver;",
        "hmsStatsObserver",
        "",
        "subscribeRoundTripTime",
        "publishRoundTripTime",
        "Ll83/a0;",
        "sendOverallRtcStats",
        "(Llive/hms/video/sdk/PublishConnection;Llive/hms/video/sdk/PublishConnection;Llive/hms/video/sdk/SubscribeConnection;Llive/hms/video/sdk/SubscribeConnection;Llive/hms/video/connection/stats/HMSStatsObserver;DD)V",
        "Llive/hms/video/media/settings/HMSLayer;",
        "hmsLayer",
        "",
        "layerSortOrder",
        "(Llive/hms/video/media/settings/HMSLayer;)I",
        "Llive/hms/video/connection/degredation/StatsBundle;",
        "bundle",
        "Lkotlin/Function1;",
        "",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "getTrackForId",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "getRemotePeerForTrackId",
        "Lkotlin/Function0;",
        "Llive/hms/video/sdk/models/HMSLocalPeer;",
        "getLocalPeer",
        "convertBundleToStatsObserverEvents",
        "(Llive/hms/video/connection/degredation/StatsBundle;Llive/hms/video/connection/stats/HMSStatsObserver;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;)V",
        "Llive/hms/video/connection/stats/BitrateCalculator;",
        "bitrateCalculator",
        "Llive/hms/video/connection/stats/BitrateCalculator;",
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
.field private final bitrateCalculator:Llive/hms/video/connection/stats/BitrateCalculator;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Llive/hms/video/connection/stats/BitrateCalculator;

    invoke-direct {v0}, Llive/hms/video/connection/stats/BitrateCalculator;-><init>()V

    iput-object v0, p0, Llive/hms/video/sdk/BundleToStatsObserver;->bitrateCalculator:Llive/hms/video/connection/stats/BitrateCalculator;

    return-void
.end method

.method public static final synthetic access$layerSortOrder(Llive/hms/video/sdk/BundleToStatsObserver;Llive/hms/video/media/settings/HMSLayer;)I
    .locals 0

    invoke-direct {p0, p1}, Llive/hms/video/sdk/BundleToStatsObserver;->layerSortOrder(Llive/hms/video/media/settings/HMSLayer;)I

    move-result p0

    return p0
.end method

.method private final layerSortOrder(Llive/hms/video/media/settings/HMSLayer;)I
    .locals 3

    const/4 v0, -0x1

    if-nez p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    sget-object v1, Llive/hms/video/sdk/BundleToStatsObserver$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    :goto_0
    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_1

    return v0

    :cond_1
    return v2

    :cond_2
    return v1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method private final sendOverallRtcStats(Llive/hms/video/sdk/PublishConnection;Llive/hms/video/sdk/PublishConnection;Llive/hms/video/sdk/SubscribeConnection;Llive/hms/video/sdk/SubscribeConnection;Llive/hms/video/connection/stats/HMSStatsObserver;DD)V
    .locals 34

    move-object/from16 v0, p5

    new-instance v1, Llive/hms/video/connection/stats/HMSRTCStats;

    invoke-virtual/range {p2 .. p2}, Llive/hms/video/sdk/PublishConnection;->getBytesSent()J

    move-result-wide v2

    invoke-virtual/range {p4 .. p4}, Llive/hms/video/sdk/SubscribeConnection;->getBytesReceived()J

    move-result-wide v4

    invoke-virtual/range {p4 .. p4}, Llive/hms/video/sdk/SubscribeConnection;->getPacketsReceived()J

    move-result-wide v6

    invoke-virtual/range {p2 .. p2}, Llive/hms/video/sdk/PublishConnection;->getPacketLoss()J

    move-result-wide v8

    invoke-virtual/range {p2 .. p2}, Llive/hms/video/sdk/PublishConnection;->getAvailableOutgoingBitrates()Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    invoke-static {v10}, Lm83/s;->s0(Ljava/lang/Iterable;)D

    move-result-wide v10

    invoke-virtual/range {p4 .. p4}, Llive/hms/video/sdk/SubscribeConnection;->getAvailableIncomingBitrates()Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/lang/Iterable;

    invoke-static {v12}, Lm83/s;->s0(Ljava/lang/Iterable;)D

    move-result-wide v12

    add-double v14, p6, p8

    move-object/from16 v16, v1

    const/4 v1, 0x2

    move-wide/from16 v17, v2

    int-to-double v1, v1

    div-double v32, v14, v1

    move-object/from16 v1, v16

    move-wide/from16 v2, v17

    move-wide/from16 v14, v32

    invoke-direct/range {v1 .. v15}, Llive/hms/video/connection/stats/HMSRTCStats;-><init>(JJJJDDD)V

    new-instance v19, Llive/hms/video/connection/stats/HMSRTCStats;

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/sdk/PublishConnection;->getBytesSent()J

    move-result-wide v20

    invoke-virtual/range {p3 .. p3}, Llive/hms/video/sdk/SubscribeConnection;->getBytesReceived()J

    move-result-wide v22

    invoke-virtual/range {p3 .. p3}, Llive/hms/video/sdk/SubscribeConnection;->getPacketsReceived()J

    move-result-wide v24

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/sdk/PublishConnection;->getPacketLoss()J

    move-result-wide v26

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/sdk/PublishConnection;->getAvailableOutgoingBitrates()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->s0(Ljava/lang/Iterable;)D

    move-result-wide v28

    invoke-virtual/range {p3 .. p3}, Llive/hms/video/sdk/SubscribeConnection;->getAvailableIncomingBitrates()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->s0(Ljava/lang/Iterable;)D

    move-result-wide v30

    invoke-direct/range {v19 .. v33}, Llive/hms/video/connection/stats/HMSRTCStats;-><init>(JJJJDDD)V

    move-object/from16 v2, v19

    new-instance v19, Llive/hms/video/connection/stats/HMSRTCStats;

    invoke-virtual {v2}, Llive/hms/video/connection/stats/HMSRTCStats;->getBytesSent()J

    move-result-wide v3

    invoke-virtual {v1}, Llive/hms/video/connection/stats/HMSRTCStats;->getBytesSent()J

    move-result-wide v5

    add-long v20, v5, v3

    invoke-virtual {v2}, Llive/hms/video/connection/stats/HMSRTCStats;->getBytesReceived()J

    move-result-wide v3

    invoke-virtual {v1}, Llive/hms/video/connection/stats/HMSRTCStats;->getBytesReceived()J

    move-result-wide v5

    add-long v22, v5, v3

    invoke-virtual {v2}, Llive/hms/video/connection/stats/HMSRTCStats;->getPacketsReceived()J

    move-result-wide v3

    invoke-virtual {v1}, Llive/hms/video/connection/stats/HMSRTCStats;->getPacketsReceived()J

    move-result-wide v5

    add-long v24, v5, v3

    invoke-virtual {v2}, Llive/hms/video/connection/stats/HMSRTCStats;->getPacketsLost()J

    move-result-wide v3

    invoke-virtual {v1}, Llive/hms/video/connection/stats/HMSRTCStats;->getPacketsLost()J

    move-result-wide v5

    add-long v26, v5, v3

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/sdk/PublishConnection;->getAvailableOutgoingBitrates()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-virtual/range {p2 .. p2}, Llive/hms/video/sdk/PublishConnection;->getAvailableOutgoingBitrates()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v3, v4}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-static {v3}, Lm83/s;->s0(Ljava/lang/Iterable;)D

    move-result-wide v28

    invoke-virtual/range {p3 .. p3}, Llive/hms/video/sdk/SubscribeConnection;->getAvailableIncomingBitrates()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-virtual/range {p4 .. p4}, Llive/hms/video/sdk/SubscribeConnection;->getAvailableIncomingBitrates()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v3, v4}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-static {v3}, Lm83/s;->s0(Ljava/lang/Iterable;)D

    move-result-wide v30

    invoke-direct/range {v19 .. v33}, Llive/hms/video/connection/stats/HMSRTCStats;-><init>(JJJJDDD)V

    move-object/from16 v3, v19

    new-instance v4, Llive/hms/video/connection/stats/HMSRTCStatsReport;

    invoke-direct {v4, v3, v2, v1}, Llive/hms/video/connection/stats/HMSRTCStatsReport;-><init>(Llive/hms/video/connection/stats/HMSRTCStats;Llive/hms/video/connection/stats/HMSRTCStats;Llive/hms/video/connection/stats/HMSRTCStats;)V

    if-eqz v0, :cond_0

    invoke-interface {v0, v4}, Llive/hms/video/connection/stats/HMSStatsObserver;->onRTCStats(Llive/hms/video/connection/stats/HMSRTCStatsReport;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final convertBundleToStatsObserverEvents(Llive/hms/video/connection/degredation/StatsBundle;Llive/hms/video/connection/stats/HMSStatsObserver;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;)V
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/connection/degredation/StatsBundle;",
            "Llive/hms/video/connection/stats/HMSStatsObserver;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v5, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    const-string v1, "bundle"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "getTrackForId"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "getRemotePeerForTrackId"

    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "getLocalPeer"

    move-object/from16 v12, p5

    invoke-static {v12, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v13, Llive/hms/video/sdk/PublishConnection;

    const/16 v21, 0xf

    const/16 v22, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    invoke-direct/range {v13 .. v22}, Llive/hms/video/sdk/PublishConnection;-><init>(JLjava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Llive/hms/video/sdk/PublishConnection;

    const/16 v22, 0xf

    const/16 v23, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    invoke-direct/range {v14 .. v23}, Llive/hms/video/sdk/PublishConnection;-><init>(JLjava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Llive/hms/video/sdk/SubscribeConnection;

    const/16 v23, 0xf

    const/16 v24, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    invoke-direct/range {v15 .. v24}, Llive/hms/video/sdk/SubscribeConnection;-><init>(JLjava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Llive/hms/video/sdk/SubscribeConnection;

    const/16 v24, 0xf

    const/16 v25, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v22, 0x0

    invoke-direct/range {v16 .. v25}, Llive/hms/video/sdk/SubscribeConnection;-><init>(JLjava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v16

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/StatsBundle;->getAllStats()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v16

    const-wide/16 v17, 0x0

    move-wide/from16 v6, v17

    move-wide v8, v6

    move-object/from16 v2, v19

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2c

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 p1, v2

    move-object/from16 v2, v20

    check-cast v2, Llive/hms/video/connection/degredation/WebrtcStats;

    move-object/from16 v20, v3

    instance-of v3, v2, Llive/hms/video/connection/degredation/Peer;

    if-nez v3, :cond_2b

    instance-of v3, v2, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;

    const-wide/16 v21, 0x0

    if-eqz v3, :cond_11

    iget-object v3, v0, Llive/hms/video/sdk/BundleToStatsObserver;->bitrateCalculator:Llive/hms/video/connection/stats/BitrateCalculator;

    move-wide/from16 v23, v6

    move-object v6, v2

    check-cast v6, Llive/hms/video/connection/degredation/Track;

    invoke-virtual {v3, v6}, Llive/hms/video/connection/stats/BitrateCalculator;->getBitrateFromTrackUpdatePrev(Llive/hms/video/connection/degredation/Track;)D

    move-result-wide v6

    check-cast v2, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getBytesTransported()Ljava/math/BigInteger;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v25

    goto :goto_1

    :cond_0
    move-wide/from16 v25, v21

    :goto_1
    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getTrackIdentifier()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    const-string v3, ""

    :cond_1
    invoke-interface {v10, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llive/hms/video/media/tracks/HMSTrack;

    invoke-interface {v12}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Llive/hms/video/sdk/models/HMSLocalPeer;

    if-eqz v20, :cond_4

    invoke-virtual/range {v20 .. v20}, Llive/hms/video/sdk/models/HMSPeer;->getAuxiliaryTracks()Ljava/util/List;

    move-result-object v20

    if-eqz v20, :cond_4

    check-cast v20, Ljava/lang/Iterable;

    invoke-interface/range {v20 .. v20}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_2
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v27

    if-eqz v27, :cond_3

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v27

    move-object/from16 v28, v27

    check-cast v28, Llive/hms/video/media/tracks/HMSTrack;

    move-object/from16 p1, v2

    invoke-virtual/range {v28 .. v28}, Llive/hms/video/media/tracks/HMSTrack;->getSource()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v28, v3

    const-string v3, "screen"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_3

    :cond_2
    move-object/from16 v2, p1

    move-object/from16 v3, v28

    goto :goto_2

    :cond_3
    move-object/from16 p1, v2

    move-object/from16 v28, v3

    move-object/from16 v27, v19

    :goto_3
    check-cast v27, Llive/hms/video/media/tracks/HMSTrack;

    move-object/from16 v2, v27

    goto :goto_4

    :cond_4
    move-object/from16 p1, v2

    move-object/from16 v28, v3

    move-object/from16 v2, v19

    :goto_4
    if-nez v28, :cond_a

    if-eqz v2, :cond_a

    new-instance v29, Llive/hms/video/connection/stats/HMSLocalVideoStats;

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getJitter()Ljava/lang/Double;

    move-result-object v30

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getRoundTripTime()Ljava/lang/Double;

    move-result-object v31

    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v32

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v33

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getResolution()Llive/hms/video/media/settings/HMSVideoResolution;

    move-result-object v34

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getFrameRate()Ljava/lang/Number;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v35

    invoke-static/range {v35 .. v36}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    move-object/from16 v35, v3

    goto :goto_5

    :cond_5
    move-object/from16 v35, v19

    :goto_5
    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getQualityLimitations()Llive/hms/video/connection/degredation/QualityLimitationReasons;

    move-result-object v36

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getHmsLayer()Llive/hms/video/media/settings/HMSLayer;

    move-result-object v37

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack;->getPacketLoss()J

    move-result-wide v38

    invoke-static/range {v38 .. v39}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v38

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getPacketsSent()Ljava/lang/Long;

    move-result-object v39

    invoke-direct/range {v29 .. v39}, Llive/hms/video/connection/stats/HMSLocalVideoStats;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Llive/hms/video/media/settings/HMSVideoResolution;Ljava/lang/Double;Llive/hms/video/connection/degredation/QualityLimitationReasons;Llive/hms/video/media/settings/HMSLayer;Ljava/lang/Long;Ljava/lang/Long;)V

    invoke-virtual {v14}, Llive/hms/video/sdk/PublishConnection;->getAvailableOutgoingBitrates()Ljava/util/List;

    move-result-object v3

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    cmp-long v3, v25, v21

    if-lez v3, :cond_6

    invoke-virtual {v14}, Llive/hms/video/sdk/PublishConnection;->getBytesSent()J

    move-result-wide v6

    add-long v6, v6, v25

    invoke-virtual {v14, v6, v7}, Llive/hms/video/sdk/PublishConnection;->setBytesSent(J)V

    :cond_6
    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getPacketsSent()Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    goto :goto_6

    :cond_7
    move-wide/from16 v6, v21

    :goto_6
    cmp-long v3, v6, v21

    if-lez v3, :cond_9

    invoke-virtual {v14}, Llive/hms/video/sdk/PublishConnection;->getPacketsSent()J

    move-result-wide v6

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getPacketsSent()Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v21

    :cond_8
    add-long v6, v6, v21

    invoke-virtual {v14, v6, v7}, Llive/hms/video/sdk/PublishConnection;->setPacketsSent(J)V

    :cond_9
    if-eqz v5, :cond_10

    invoke-static/range {v29 .. v29}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v12}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Llive/hms/video/sdk/models/HMSPeer;

    invoke-interface {v5, v3, v2, v6}, Llive/hms/video/connection/stats/HMSStatsObserver;->onLocalVideoStats(Ljava/util/List;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V

    goto/16 :goto_9

    :cond_a
    new-instance v29, Llive/hms/video/connection/stats/HMSLocalVideoStats;

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getJitter()Ljava/lang/Double;

    move-result-object v30

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getRoundTripTime()Ljava/lang/Double;

    move-result-object v31

    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v32

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v33

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getResolution()Llive/hms/video/media/settings/HMSVideoResolution;

    move-result-object v34

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getFrameRate()Ljava/lang/Number;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v35, v2

    goto :goto_7

    :cond_b
    move-object/from16 v35, v19

    :goto_7
    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getQualityLimitations()Llive/hms/video/connection/degredation/QualityLimitationReasons;

    move-result-object v36

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getHmsLayer()Llive/hms/video/media/settings/HMSLayer;

    move-result-object v37

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack;->getPacketLoss()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v38

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getPacketsSent()Ljava/lang/Long;

    move-result-object v39

    invoke-direct/range {v29 .. v39}, Llive/hms/video/connection/stats/HMSLocalVideoStats;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Llive/hms/video/media/settings/HMSVideoResolution;Ljava/lang/Double;Llive/hms/video/connection/degredation/QualityLimitationReasons;Llive/hms/video/media/settings/HMSLayer;Ljava/lang/Long;Ljava/lang/Long;)V

    move-object/from16 v2, v29

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v14}, Llive/hms/video/sdk/PublishConnection;->getAvailableOutgoingBitrates()Ljava/util/List;

    move-result-object v2

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    cmp-long v2, v25, v21

    if-lez v2, :cond_c

    invoke-virtual {v14}, Llive/hms/video/sdk/PublishConnection;->getBytesSent()J

    move-result-wide v2

    add-long v2, v2, v25

    invoke-virtual {v14, v2, v3}, Llive/hms/video/sdk/PublishConnection;->setBytesSent(J)V

    :cond_c
    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getPacketsSent()Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    goto :goto_8

    :cond_d
    move-wide/from16 v2, v21

    :goto_8
    cmp-long v2, v2, v21

    if-lez v2, :cond_f

    invoke-virtual {v14}, Llive/hms/video/sdk/PublishConnection;->getPacketsSent()J

    move-result-wide v2

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;->getPacketsSent()Ljava/lang/Long;

    move-result-object v6

    if-eqz v6, :cond_e

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v21

    :cond_e
    add-long v2, v2, v21

    invoke-virtual {v14, v2, v3}, Llive/hms/video/sdk/PublishConnection;->setPacketsSent(J)V

    :cond_f
    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/degredation/Track$LocalTrack;->getPacketLoss()J

    move-result-wide v2

    invoke-virtual {v14, v2, v3}, Llive/hms/video/sdk/PublishConnection;->setPacketLoss(J)V

    :cond_10
    :goto_9
    move-wide/from16 v6, v23

    move-object/from16 v2, v28

    goto/16 :goto_0

    :cond_11
    move-wide/from16 v23, v6

    instance-of v3, v2, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;

    const/4 v6, 0x6

    const-string v25, "_"

    if-eqz v3, :cond_19

    iget-object v3, v0, Llive/hms/video/sdk/BundleToStatsObserver;->bitrateCalculator:Llive/hms/video/connection/stats/BitrateCalculator;

    move-object v7, v2

    check-cast v7, Llive/hms/video/connection/degredation/Track;

    invoke-virtual {v3, v7}, Llive/hms/video/connection/stats/BitrateCalculator;->getBitrateFromTrackUpdatePrev(Llive/hms/video/connection/degredation/Track;)D

    move-result-wide v27

    check-cast v2, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;->getBytesTransported()Ljava/math/BigInteger;

    move-result-object v3

    if-eqz v3, :cond_12

    invoke-virtual {v3}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v29

    goto :goto_a

    :cond_12
    move-wide/from16 v29, v21

    :goto_a
    if-eqz v5, :cond_14

    new-instance v31, Llive/hms/video/connection/stats/HMSLocalAudioStats;

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;->getJitter()Ljava/lang/Double;

    move-result-object v32

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;->getRoundTripTime()Ljava/lang/Double;

    move-result-object v33

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;->getBytesTransported()Ljava/math/BigInteger;

    move-result-object v3

    if-eqz v3, :cond_13

    invoke-virtual {v3}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v34

    invoke-static/range {v34 .. v35}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object/from16 v34, v3

    goto :goto_b

    :cond_13
    move-object/from16 v34, v19

    :goto_b
    invoke-static/range {v27 .. v28}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v35

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Track$LocalTrack;->getPacketLoss()J

    move-result-wide v36

    invoke-static/range {v36 .. v37}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v36

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;->getPacketsSent()Ljava/lang/Long;

    move-result-object v37

    invoke-direct/range {v31 .. v37}, Llive/hms/video/connection/stats/HMSLocalAudioStats;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;)V

    move-object/from16 v3, v31

    invoke-interface/range {v20 .. v20}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    move-object/from16 v31, v1

    filled-new-array/range {v25 .. v25}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1, v6}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    const/4 v6, 0x0

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v10, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/media/tracks/HMSTrack;

    invoke-interface {v12}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Llive/hms/video/sdk/models/HMSPeer;

    invoke-interface {v5, v3, v1, v6}, Llive/hms/video/connection/stats/HMSStatsObserver;->onLocalAudioStats(Llive/hms/video/connection/stats/HMSLocalAudioStats;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V

    goto :goto_c

    :cond_14
    move-object/from16 v31, v1

    :goto_c
    invoke-virtual {v13}, Llive/hms/video/sdk/PublishConnection;->getAvailableOutgoingBitrates()Ljava/util/List;

    move-result-object v1

    invoke-static/range {v27 .. v28}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    cmp-long v1, v29, v21

    if-lez v1, :cond_15

    invoke-virtual {v13}, Llive/hms/video/sdk/PublishConnection;->getBytesSent()J

    move-result-wide v6

    add-long v6, v6, v29

    invoke-virtual {v13, v6, v7}, Llive/hms/video/sdk/PublishConnection;->setBytesSent(J)V

    :cond_15
    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;->getPacketsSent()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_16

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    goto :goto_d

    :cond_16
    move-wide/from16 v6, v21

    :goto_d
    cmp-long v1, v6, v21

    if-lez v1, :cond_18

    invoke-virtual {v13}, Llive/hms/video/sdk/PublishConnection;->getPacketsSent()J

    move-result-wide v6

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;->getPacketsSent()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_17

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v21

    :cond_17
    add-long v6, v6, v21

    invoke-virtual {v13, v6, v7}, Llive/hms/video/sdk/PublishConnection;->setPacketsSent(J)V

    :cond_18
    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Track$LocalTrack;->getPacketLoss()J

    move-result-wide v1

    invoke-virtual {v13, v1, v2}, Llive/hms/video/sdk/PublishConnection;->setPacketLoss(J)V

    goto/16 :goto_14

    :cond_19
    move-object/from16 v31, v1

    instance-of v1, v2, Llive/hms/video/connection/degredation/Audio;

    if-eqz v1, :cond_1f

    iget-object v1, v0, Llive/hms/video/sdk/BundleToStatsObserver;->bitrateCalculator:Llive/hms/video/connection/stats/BitrateCalculator;

    move-object v3, v2

    check-cast v3, Llive/hms/video/connection/degredation/Track;

    invoke-virtual {v1, v3}, Llive/hms/video/connection/stats/BitrateCalculator;->getBitrateFromTrackUpdatePrev(Llive/hms/video/connection/degredation/Track;)D

    move-result-wide v27

    check-cast v2, Llive/hms/video/connection/degredation/Audio;

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Audio;->getBytesTransported()Ljava/math/BigInteger;

    move-result-object v1

    if-eqz v1, :cond_1a

    invoke-virtual {v1}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v29

    goto :goto_e

    :cond_1a
    move-wide/from16 v29, v21

    :goto_e
    new-instance v32, Llive/hms/video/connection/stats/HMSRemoteAudioStats;

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Audio;->getJitter()Ljava/lang/Double;

    move-result-object v33

    invoke-static/range {v29 .. v30}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v34

    invoke-static/range {v27 .. v28}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v35

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Audio;->getPacketsReceived()Ljava/lang/Long;

    move-result-object v36

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Audio;->getPacketsLost()Ljava/lang/Integer;

    move-result-object v37

    invoke-direct/range {v32 .. v37}, Llive/hms/video/connection/stats/HMSRemoteAudioStats;-><init>(Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;)V

    move-object/from16 v1, v32

    if-eqz v5, :cond_1b

    invoke-interface/range {v20 .. v20}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    filled-new-array/range {v25 .. v25}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7, v6}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v3

    const/4 v7, 0x0

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v10, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llive/hms/video/media/tracks/HMSTrack;

    invoke-interface/range {v20 .. v20}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v7, v20

    check-cast v7, Ljava/lang/CharSequence;

    move-object/from16 v32, v2

    filled-new-array/range {v25 .. v25}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v2, v6}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v2

    const/4 v6, 0x0

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v11, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/sdk/models/HMSPeer;

    invoke-interface {v5, v1, v3, v2}, Llive/hms/video/connection/stats/HMSStatsObserver;->onRemoteAudioStats(Llive/hms/video/connection/stats/HMSRemoteAudioStats;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V

    goto :goto_f

    :cond_1b
    move-object/from16 v32, v2

    :goto_f
    cmp-long v1, v29, v21

    if-lez v1, :cond_1c

    invoke-virtual {v15}, Llive/hms/video/sdk/SubscribeConnection;->getBytesReceived()J

    move-result-wide v1

    add-long v1, v1, v29

    invoke-virtual {v15, v1, v2}, Llive/hms/video/sdk/SubscribeConnection;->setBytesReceived(J)V

    :cond_1c
    invoke-virtual {v15}, Llive/hms/video/sdk/SubscribeConnection;->getAvailableIncomingBitrates()Ljava/util/List;

    move-result-object v1

    invoke-static/range {v27 .. v28}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {v32 .. v32}, Llive/hms/video/connection/degredation/Audio;->getPacketsReceived()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_1d

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    goto :goto_10

    :cond_1d
    move-wide/from16 v1, v21

    :goto_10
    cmp-long v1, v1, v21

    if-lez v1, :cond_28

    invoke-virtual {v15}, Llive/hms/video/sdk/SubscribeConnection;->getPacketsReceived()J

    move-result-wide v1

    invoke-virtual/range {v32 .. v32}, Llive/hms/video/connection/degredation/Audio;->getPacketsReceived()Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_1e

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v21

    :cond_1e
    add-long v1, v1, v21

    invoke-virtual {v15, v1, v2}, Llive/hms/video/sdk/SubscribeConnection;->setPacketsReceived(J)V

    goto/16 :goto_14

    :cond_1f
    instance-of v1, v2, Llive/hms/video/connection/degredation/Video;

    if-eqz v1, :cond_26

    iget-object v1, v0, Llive/hms/video/sdk/BundleToStatsObserver;->bitrateCalculator:Llive/hms/video/connection/stats/BitrateCalculator;

    move-object v3, v2

    check-cast v3, Llive/hms/video/connection/degredation/Track;

    invoke-virtual {v1, v3}, Llive/hms/video/connection/stats/BitrateCalculator;->getBitrateFromTrackUpdatePrev(Llive/hms/video/connection/degredation/Track;)D

    move-result-wide v27

    check-cast v2, Llive/hms/video/connection/degredation/Video;

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Video;->getBytesTransported()Ljava/math/BigInteger;

    move-result-object v1

    if-eqz v1, :cond_20

    invoke-virtual {v1}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v29

    goto :goto_11

    :cond_20
    move-wide/from16 v29, v21

    :goto_11
    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Video;->getFrameWidth()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_21

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Video;->getFrameHeight()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_21

    new-instance v1, Llive/hms/video/media/settings/HMSVideoResolution;

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Video;->getFrameWidth()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    long-to-int v3, v6

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Video;->getFrameHeight()Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    long-to-int v6, v6

    invoke-direct {v1, v3, v6}, Llive/hms/video/media/settings/HMSVideoResolution;-><init>(II)V

    move-object/from16 v39, v1

    goto :goto_12

    :cond_21
    move-object/from16 v39, v19

    :goto_12
    new-instance v33, Llive/hms/video/connection/stats/HMSRemoteVideoStats;

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Video;->getJitter()Ljava/lang/Double;

    move-result-object v34

    invoke-static/range {v29 .. v30}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v35

    invoke-static/range {v27 .. v28}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v36

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Video;->getPacketsReceived()Ljava/lang/Long;

    move-result-object v37

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Video;->getPacketsLost()Ljava/lang/Integer;

    move-result-object v38

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Video;->getFramesPerSecond()Ljava/lang/Double;

    move-result-object v40

    invoke-direct/range {v33 .. v40}, Llive/hms/video/connection/stats/HMSRemoteVideoStats;-><init>(Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Llive/hms/video/media/settings/HMSVideoResolution;Ljava/lang/Double;)V

    move-object/from16 v1, v33

    if-eqz v5, :cond_22

    invoke-interface/range {v20 .. v20}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    filled-new-array/range {v25 .. v25}, [Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x6

    invoke-static {v3, v6, v7}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v3

    const/4 v6, 0x0

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v10, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llive/hms/video/media/tracks/HMSTrack;

    invoke-interface/range {v20 .. v20}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v6, v20

    check-cast v6, Ljava/lang/CharSequence;

    filled-new-array/range {v25 .. v25}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0, v7}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    const/4 v6, 0x0

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v11, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/sdk/models/HMSPeer;

    invoke-interface {v5, v1, v3, v0}, Llive/hms/video/connection/stats/HMSStatsObserver;->onRemoteVideoStats(Llive/hms/video/connection/stats/HMSRemoteVideoStats;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V

    :cond_22
    cmp-long v0, v29, v21

    if-lez v0, :cond_23

    invoke-virtual {v4}, Llive/hms/video/sdk/SubscribeConnection;->getBytesReceived()J

    move-result-wide v0

    add-long v0, v0, v29

    invoke-virtual {v4, v0, v1}, Llive/hms/video/sdk/SubscribeConnection;->setBytesReceived(J)V

    :cond_23
    invoke-virtual {v4}, Llive/hms/video/sdk/SubscribeConnection;->getAvailableIncomingBitrates()Ljava/util/List;

    move-result-object v0

    invoke-static/range {v27 .. v28}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Video;->getPacketsReceived()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_24

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_13

    :cond_24
    move-wide/from16 v0, v21

    :goto_13
    cmp-long v0, v0, v21

    if-lez v0, :cond_28

    invoke-virtual {v4}, Llive/hms/video/sdk/SubscribeConnection;->getPacketsReceived()J

    move-result-wide v0

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/Video;->getPacketsReceived()Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_25

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v21

    :cond_25
    add-long v0, v0, v21

    invoke-virtual {v4, v0, v1}, Llive/hms/video/sdk/SubscribeConnection;->setPacketsReceived(J)V

    goto :goto_14

    :cond_26
    instance-of v0, v2, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;

    if-eqz v0, :cond_29

    check-cast v2, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->getCurrentRoundTripTime()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_27

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    move-wide v8, v0

    goto :goto_14

    :cond_27
    move-wide/from16 v8, v17

    :cond_28
    :goto_14
    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-wide/from16 v6, v23

    :goto_15
    move-object/from16 v1, v31

    goto/16 :goto_0

    :cond_29
    instance-of v0, v2, Llive/hms/video/connection/degredation/ConnectionInfo$SubscribeConnection;

    if-eqz v0, :cond_28

    check-cast v2, Llive/hms/video/connection/degredation/ConnectionInfo$SubscribeConnection;

    invoke-virtual {v2}, Llive/hms/video/connection/degredation/ConnectionInfo$SubscribeConnection;->getCurrentRoundTripTime()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_2a

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    move-wide v6, v0

    goto :goto_16

    :cond_2a
    move-wide/from16 v6, v17

    :goto_16
    move-object/from16 v0, p0

    move-object/from16 v2, p1

    goto :goto_15

    :cond_2b
    move-object/from16 v31, v1

    move-wide/from16 v23, v6

    goto :goto_14

    :cond_2c
    move-object v3, v13

    move-object v13, v1

    move-object v1, v3

    move-object v3, v14

    move-object v14, v2

    move-object v2, v3

    move-object v3, v15

    invoke-direct/range {v0 .. v9}, Llive/hms/video/sdk/BundleToStatsObserver;->sendOverallRtcStats(Llive/hms/video/sdk/PublishConnection;Llive/hms/video/sdk/PublishConnection;Llive/hms/video/sdk/SubscribeConnection;Llive/hms/video/sdk/SubscribeConnection;Llive/hms/video/connection/stats/HMSStatsObserver;DD)V

    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2e

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_2d

    new-instance v1, Llive/hms/video/sdk/BundleToStatsObserver$convertBundleToStatsObserverEvents$$inlined$sortBy$1;

    invoke-direct {v1, v0}, Llive/hms/video/sdk/BundleToStatsObserver$convertBundleToStatsObserverEvents$$inlined$sortBy$1;-><init>(Llive/hms/video/sdk/BundleToStatsObserver;)V

    invoke-static {v13, v1}, Lm83/w;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_2d
    if-eqz v5, :cond_2e

    invoke-interface {v12}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/sdk/models/HMSPeer;

    invoke-interface {v5, v13, v14, v1}, Llive/hms/video/connection/stats/HMSStatsObserver;->onLocalVideoStats(Ljava/util/List;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V

    :cond_2e
    return-void
.end method
