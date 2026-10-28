.class public final Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection$Companion;",
        "",
        "<init>",
        "()V",
        "PUBLISH_CONNECTION",
        "",
        "getPUBLISH_CONNECTION",
        "()Ljava/lang/String;",
        "from",
        "Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;",
        "publishInfo",
        "Lhms/webrtc/RTCStats;",
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
    invoke-direct {p0}, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Lhms/webrtc/RTCStats;)Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;
    .locals 6

    const-string v0, "publishInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lhms/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object p1

    new-instance v0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;

    const-string v1, "bytesSent"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/math/BigInteger;

    const-string v2, "availableOutgoingBitrate"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    const-string v3, "totalRoundTripTime"

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Double;

    const-string v4, "currentRoundTripTime"

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    const-string v5, "packetsSent"

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ljava/math/BigInteger;

    invoke-direct/range {v0 .. v5}, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;-><init>(Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;)V

    return-object v0
.end method

.method public final getPUBLISH_CONNECTION()Ljava/lang/String;
    .locals 1

    invoke-static {}, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->access$getPUBLISH_CONNECTION$cp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
