.class public final Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;
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
        "Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio$Companion;",
        "",
        "<init>",
        "()V",
        "from",
        "Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;",
        "audioStat",
        "",
        "",
        "extraData",
        "Lhms/webrtc/RTCStats;",
        "candidatePairInfo",
        "primaryTimestamp",
        "",
        "localTracksJitter",
        "",
        "(Ljava/util/Map;Lhms/webrtc/RTCStats;Lhms/webrtc/RTCStats;Ljava/lang/Double;Ljava/util/Map;)Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;",
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
    invoke-direct {p0}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Ljava/util/Map;Lhms/webrtc/RTCStats;Lhms/webrtc/RTCStats;Ljava/lang/Double;Ljava/util/Map;)Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;
    .locals 10
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
            "Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;"
        }
    .end annotation

    const-string p4, "audioStat"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "localTracksJitter"

    invoke-static {p5, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p4, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lhms/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object v5, p4

    :goto_0
    const-string v0, "ssrc"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_1

    move-object v8, v0

    goto :goto_1

    :cond_1
    move-object v8, p4

    :goto_1
    if-eqz v8, :cond_2

    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/Double;

    move-object v2, p5

    goto :goto_2

    :cond_2
    move-object v2, p4

    :goto_2
    if-eqz p3, :cond_3

    invoke-virtual {p3}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object p3

    if-eqz p3, :cond_3

    const-string p5, "currentRoundTripTime"

    invoke-interface {p3, p5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    goto :goto_3

    :cond_3
    move-object p3, p4

    :goto_3
    move-object v3, p3

    check-cast v3, Ljava/lang/Double;

    const-string p3, "bytesSent"

    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    move-object v4, p3

    check-cast v4, Ljava/math/BigInteger;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object p2

    if-eqz p2, :cond_4

    const-string p3, "trackIdentifier"

    invoke-interface {p2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    :cond_4
    move-object v6, p4

    check-cast v6, Ljava/lang/String;

    const-string p2, "packetsSent"

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Ljava/lang/Long;

    new-instance v1, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v9}, Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
