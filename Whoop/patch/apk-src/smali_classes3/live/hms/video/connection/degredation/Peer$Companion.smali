.class public final Llive/hms/video/connection/degredation/Peer$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/connection/degredation/Peer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\r"
    }
    d2 = {
        "Llive/hms/video/connection/degredation/Peer$Companion;",
        "",
        "<init>",
        "()V",
        "LOCAL_PEER",
        "",
        "getLOCAL_PEER",
        "()Ljava/lang/String;",
        "from",
        "Llive/hms/video/connection/degredation/Peer;",
        "transportInfo",
        "Lhms/webrtc/RTCStats;",
        "icePairInfo",
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
    invoke-direct {p0}, Llive/hms/video/connection/degredation/Peer$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Lhms/webrtc/RTCStats;Lhms/webrtc/RTCStats;)Llive/hms/video/connection/degredation/Peer;
    .locals 13

    const-string v0, "transportInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icePairInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lhms/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v0

    invoke-virtual {p2}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object p2

    const-string v2, "bytesSent"

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/math/BigInteger;

    const-string v2, "bytesReceived"

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/math/BigInteger;

    invoke-virtual {p1}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    const-string v3, "packetsSent"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/math/BigInteger;

    invoke-virtual {p1}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object p1

    const-string v2, "packetsReceived"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Ljava/math/BigInteger;

    const-string p1, "totalRoundTripTime"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Ljava/lang/Double;

    const-string p1, "currentRoundTripTime"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v9, p1

    check-cast v9, Ljava/lang/Double;

    const-string p1, "availableOutgoingBitrate"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v10, p1

    check-cast v10, Ljava/lang/Double;

    const-string p1, "availableIncomingBitrate"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v11, p1

    check-cast v11, Ljava/lang/Double;

    new-instance v3, Llive/hms/video/connection/degredation/Peer;

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    invoke-direct/range {v3 .. v12}, Llive/hms/video/connection/degredation/Peer;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V

    return-object v3
.end method

.method public final getLOCAL_PEER()Ljava/lang/String;
    .locals 1

    invoke-static {}, Llive/hms/video/connection/degredation/Peer;->access$getLOCAL_PEER$cp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
