.class public final Llive/hms/video/connection/degredation/Peer;
.super Llive/hms/video/connection/degredation/WebrtcStats;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/connection/degredation/Peer$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 .2\u00020\u0001:\u0001.Ba\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010 \u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010!\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010#\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015Jz\u0010$\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\'2\u0008\u0010(\u001a\u0004\u0018\u00010)H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020-H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\u0008\u0014\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\u0008\u0018\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\u0008\u0019\u0010\u0015R\u0015\u0010\u000c\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\u0008\u001a\u0010\u0015\u00a8\u0006/"
    }
    d2 = {
        "Llive/hms/video/connection/degredation/Peer;",
        "Llive/hms/video/connection/degredation/WebrtcStats;",
        "bytesSent",
        "Ljava/math/BigInteger;",
        "packetsSent",
        "bytesReceived",
        "packetsReceived",
        "totalRoundTripTime",
        "",
        "currentRoundTripTime",
        "availableOutgoingBitrate",
        "availableIncomingBitrate",
        "timestampUs",
        "<init>",
        "(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V",
        "getBytesSent",
        "()Ljava/math/BigInteger;",
        "getPacketsSent",
        "getBytesReceived",
        "getPacketsReceived",
        "getTotalRoundTripTime",
        "()Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "getCurrentRoundTripTime",
        "getAvailableOutgoingBitrate",
        "getAvailableIncomingBitrate",
        "getTimestampUs",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Llive/hms/video/connection/degredation/Peer;",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
        "Companion",
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


# static fields
.field public static final Companion:Llive/hms/video/connection/degredation/Peer$Companion;

.field private static final LOCAL_PEER:Ljava/lang/String;


# instance fields
.field private final availableIncomingBitrate:Ljava/lang/Double;

.field private final availableOutgoingBitrate:Ljava/lang/Double;

.field private final bytesReceived:Ljava/math/BigInteger;

.field private final bytesSent:Ljava/math/BigInteger;

.field private final currentRoundTripTime:Ljava/lang/Double;

.field private final packetsReceived:Ljava/math/BigInteger;

.field private final packetsSent:Ljava/math/BigInteger;

.field private final timestampUs:Ljava/lang/Double;

.field private final totalRoundTripTime:Ljava/lang/Double;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/connection/degredation/Peer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/connection/degredation/Peer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/connection/degredation/Peer;->Companion:Llive/hms/video/connection/degredation/Peer$Companion;

    const-string v0, "LOCAL_PEER"

    sput-object v0, Llive/hms/video/connection/degredation/Peer;->LOCAL_PEER:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Llive/hms/video/connection/degredation/WebrtcStats;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Llive/hms/video/connection/degredation/Peer;->bytesSent:Ljava/math/BigInteger;

    iput-object p2, p0, Llive/hms/video/connection/degredation/Peer;->packetsSent:Ljava/math/BigInteger;

    iput-object p3, p0, Llive/hms/video/connection/degredation/Peer;->bytesReceived:Ljava/math/BigInteger;

    iput-object p4, p0, Llive/hms/video/connection/degredation/Peer;->packetsReceived:Ljava/math/BigInteger;

    iput-object p5, p0, Llive/hms/video/connection/degredation/Peer;->totalRoundTripTime:Ljava/lang/Double;

    iput-object p6, p0, Llive/hms/video/connection/degredation/Peer;->currentRoundTripTime:Ljava/lang/Double;

    iput-object p7, p0, Llive/hms/video/connection/degredation/Peer;->availableOutgoingBitrate:Ljava/lang/Double;

    iput-object p8, p0, Llive/hms/video/connection/degredation/Peer;->availableIncomingBitrate:Ljava/lang/Double;

    iput-object p9, p0, Llive/hms/video/connection/degredation/Peer;->timestampUs:Ljava/lang/Double;

    return-void
.end method

.method public static final synthetic access$getLOCAL_PEER$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Llive/hms/video/connection/degredation/Peer;->LOCAL_PEER:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic copy$default(Llive/hms/video/connection/degredation/Peer;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/Object;)Llive/hms/video/connection/degredation/Peer;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Llive/hms/video/connection/degredation/Peer;->bytesSent:Ljava/math/BigInteger;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Llive/hms/video/connection/degredation/Peer;->packetsSent:Ljava/math/BigInteger;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Llive/hms/video/connection/degredation/Peer;->bytesReceived:Ljava/math/BigInteger;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Llive/hms/video/connection/degredation/Peer;->packetsReceived:Ljava/math/BigInteger;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Llive/hms/video/connection/degredation/Peer;->totalRoundTripTime:Ljava/lang/Double;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Llive/hms/video/connection/degredation/Peer;->currentRoundTripTime:Ljava/lang/Double;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Llive/hms/video/connection/degredation/Peer;->availableOutgoingBitrate:Ljava/lang/Double;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Llive/hms/video/connection/degredation/Peer;->availableIncomingBitrate:Ljava/lang/Double;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Llive/hms/video/connection/degredation/Peer;->timestampUs:Ljava/lang/Double;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Llive/hms/video/connection/degredation/Peer;->copy(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Llive/hms/video/connection/degredation/Peer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/Peer;->bytesSent:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final component2()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/Peer;->packetsSent:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final component3()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/Peer;->bytesReceived:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final component4()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/Peer;->packetsReceived:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final component5()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/Peer;->totalRoundTripTime:Ljava/lang/Double;

    return-object v0
.end method

.method public final component6()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/Peer;->currentRoundTripTime:Ljava/lang/Double;

    return-object v0
.end method

.method public final component7()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/Peer;->availableOutgoingBitrate:Ljava/lang/Double;

    return-object v0
.end method

.method public final component8()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/Peer;->availableIncomingBitrate:Ljava/lang/Double;

    return-object v0
.end method

.method public final component9()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/Peer;->timestampUs:Ljava/lang/Double;

    return-object v0
.end method

.method public final copy(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Llive/hms/video/connection/degredation/Peer;
    .locals 10

    new-instance v0, Llive/hms/video/connection/degredation/Peer;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Llive/hms/video/connection/degredation/Peer;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/connection/degredation/Peer;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/connection/degredation/Peer;

    iget-object v1, p0, Llive/hms/video/connection/degredation/Peer;->bytesSent:Ljava/math/BigInteger;

    iget-object v3, p1, Llive/hms/video/connection/degredation/Peer;->bytesSent:Ljava/math/BigInteger;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/connection/degredation/Peer;->packetsSent:Ljava/math/BigInteger;

    iget-object v3, p1, Llive/hms/video/connection/degredation/Peer;->packetsSent:Ljava/math/BigInteger;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/connection/degredation/Peer;->bytesReceived:Ljava/math/BigInteger;

    iget-object v3, p1, Llive/hms/video/connection/degredation/Peer;->bytesReceived:Ljava/math/BigInteger;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/connection/degredation/Peer;->packetsReceived:Ljava/math/BigInteger;

    iget-object v3, p1, Llive/hms/video/connection/degredation/Peer;->packetsReceived:Ljava/math/BigInteger;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llive/hms/video/connection/degredation/Peer;->totalRoundTripTime:Ljava/lang/Double;

    iget-object v3, p1, Llive/hms/video/connection/degredation/Peer;->totalRoundTripTime:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Llive/hms/video/connection/degredation/Peer;->currentRoundTripTime:Ljava/lang/Double;

    iget-object v3, p1, Llive/hms/video/connection/degredation/Peer;->currentRoundTripTime:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Llive/hms/video/connection/degredation/Peer;->availableOutgoingBitrate:Ljava/lang/Double;

    iget-object v3, p1, Llive/hms/video/connection/degredation/Peer;->availableOutgoingBitrate:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Llive/hms/video/connection/degredation/Peer;->availableIncomingBitrate:Ljava/lang/Double;

    iget-object v3, p1, Llive/hms/video/connection/degredation/Peer;->availableIncomingBitrate:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Llive/hms/video/connection/degredation/Peer;->timestampUs:Ljava/lang/Double;

    iget-object p1, p1, Llive/hms/video/connection/degredation/Peer;->timestampUs:Ljava/lang/Double;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAvailableIncomingBitrate()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/Peer;->availableIncomingBitrate:Ljava/lang/Double;

    return-object v0
.end method

.method public final getAvailableOutgoingBitrate()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/Peer;->availableOutgoingBitrate:Ljava/lang/Double;

    return-object v0
.end method

.method public final getBytesReceived()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/Peer;->bytesReceived:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final getBytesSent()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/Peer;->bytesSent:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final getCurrentRoundTripTime()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/Peer;->currentRoundTripTime:Ljava/lang/Double;

    return-object v0
.end method

.method public final getPacketsReceived()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/Peer;->packetsReceived:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final getPacketsSent()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/Peer;->packetsSent:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final getTimestampUs()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/Peer;->timestampUs:Ljava/lang/Double;

    return-object v0
.end method

.method public final getTotalRoundTripTime()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/Peer;->totalRoundTripTime:Ljava/lang/Double;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/connection/degredation/Peer;->bytesSent:Ljava/math/BigInteger;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/math/BigInteger;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/connection/degredation/Peer;->packetsSent:Ljava/math/BigInteger;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/math/BigInteger;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/connection/degredation/Peer;->bytesReceived:Ljava/math/BigInteger;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/math/BigInteger;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/connection/degredation/Peer;->packetsReceived:Ljava/math/BigInteger;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/math/BigInteger;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/connection/degredation/Peer;->totalRoundTripTime:Ljava/lang/Double;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/connection/degredation/Peer;->currentRoundTripTime:Ljava/lang/Double;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/connection/degredation/Peer;->availableOutgoingBitrate:Ljava/lang/Double;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/connection/degredation/Peer;->availableIncomingBitrate:Ljava/lang/Double;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/connection/degredation/Peer;->timestampUs:Ljava/lang/Double;

    if-nez v2, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Peer(bytesSent="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/connection/degredation/Peer;->bytesSent:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", packetsSent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/degredation/Peer;->packetsSent:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bytesReceived="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/degredation/Peer;->bytesReceived:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", packetsReceived="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/degredation/Peer;->packetsReceived:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", totalRoundTripTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/degredation/Peer;->totalRoundTripTime:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currentRoundTripTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/degredation/Peer;->currentRoundTripTime:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", availableOutgoingBitrate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/degredation/Peer;->availableOutgoingBitrate:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", availableIncomingBitrate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/degredation/Peer;->availableIncomingBitrate:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timestampUs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/degredation/Peer;->timestampUs:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
