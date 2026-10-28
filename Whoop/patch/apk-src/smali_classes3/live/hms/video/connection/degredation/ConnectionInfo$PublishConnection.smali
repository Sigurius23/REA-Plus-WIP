.class public final Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;
.super Llive/hms/video/connection/degredation/ConnectionInfo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/connection/degredation/ConnectionInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PublishConnection"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 )2\u00020\u0001:\u0001)B9\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JJ\u0010\u001f\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\u0008\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0010\"\u0004\u0008\u0015\u0010\u0012R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\u0008\u0016\u0010\u0010\"\u0004\u0008\u0017\u0010\u0012R\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u000c\"\u0004\u0008\u0019\u0010\u000e\u00a8\u0006*"
    }
    d2 = {
        "Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;",
        "Llive/hms/video/connection/degredation/ConnectionInfo;",
        "bytesSent",
        "Ljava/math/BigInteger;",
        "availableOutgoingBitrate",
        "",
        "totalRoundTripTime",
        "currentRoundTripTime",
        "packetsSent",
        "<init>",
        "(Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;)V",
        "getBytesSent",
        "()Ljava/math/BigInteger;",
        "setBytesSent",
        "(Ljava/math/BigInteger;)V",
        "getAvailableOutgoingBitrate",
        "()Ljava/lang/Double;",
        "setAvailableOutgoingBitrate",
        "(Ljava/lang/Double;)V",
        "Ljava/lang/Double;",
        "getTotalRoundTripTime",
        "setTotalRoundTripTime",
        "getCurrentRoundTripTime",
        "setCurrentRoundTripTime",
        "getPacketsSent",
        "setPacketsSent",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "(Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;)Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;",
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
.field public static final Companion:Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection$Companion;

.field private static final PUBLISH_CONNECTION:Ljava/lang/String;


# instance fields
.field private availableOutgoingBitrate:Ljava/lang/Double;

.field private bytesSent:Ljava/math/BigInteger;

.field private currentRoundTripTime:Ljava/lang/Double;

.field private packetsSent:Ljava/math/BigInteger;

.field private totalRoundTripTime:Ljava/lang/Double;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->Companion:Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection$Companion;

    const-string v0, "PUBLISH_CONNECTION"

    sput-object v0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->PUBLISH_CONNECTION:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Llive/hms/video/connection/degredation/ConnectionInfo;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->bytesSent:Ljava/math/BigInteger;

    iput-object p2, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->availableOutgoingBitrate:Ljava/lang/Double;

    iput-object p3, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->totalRoundTripTime:Ljava/lang/Double;

    iput-object p4, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->currentRoundTripTime:Ljava/lang/Double;

    iput-object p5, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->packetsSent:Ljava/math/BigInteger;

    return-void
.end method

.method public static final synthetic access$getPUBLISH_CONNECTION$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->PUBLISH_CONNECTION:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic copy$default(Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;ILjava/lang/Object;)Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->bytesSent:Ljava/math/BigInteger;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->availableOutgoingBitrate:Ljava/lang/Double;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->totalRoundTripTime:Ljava/lang/Double;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->currentRoundTripTime:Ljava/lang/Double;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->packetsSent:Ljava/math/BigInteger;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->copy(Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;)Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->bytesSent:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final component2()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->availableOutgoingBitrate:Ljava/lang/Double;

    return-object v0
.end method

.method public final component3()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->totalRoundTripTime:Ljava/lang/Double;

    return-object v0
.end method

.method public final component4()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->currentRoundTripTime:Ljava/lang/Double;

    return-object v0
.end method

.method public final component5()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->packetsSent:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final copy(Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;)Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;
    .locals 6

    new-instance v0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;-><init>(Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;

    iget-object v1, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->bytesSent:Ljava/math/BigInteger;

    iget-object v3, p1, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->bytesSent:Ljava/math/BigInteger;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->availableOutgoingBitrate:Ljava/lang/Double;

    iget-object v3, p1, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->availableOutgoingBitrate:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->totalRoundTripTime:Ljava/lang/Double;

    iget-object v3, p1, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->totalRoundTripTime:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->currentRoundTripTime:Ljava/lang/Double;

    iget-object v3, p1, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->currentRoundTripTime:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->packetsSent:Ljava/math/BigInteger;

    iget-object p1, p1, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->packetsSent:Ljava/math/BigInteger;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAvailableOutgoingBitrate()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->availableOutgoingBitrate:Ljava/lang/Double;

    return-object v0
.end method

.method public final getBytesSent()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->bytesSent:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final getCurrentRoundTripTime()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->currentRoundTripTime:Ljava/lang/Double;

    return-object v0
.end method

.method public final getPacketsSent()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->packetsSent:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final getTotalRoundTripTime()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->totalRoundTripTime:Ljava/lang/Double;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->bytesSent:Ljava/math/BigInteger;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/math/BigInteger;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->availableOutgoingBitrate:Ljava/lang/Double;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->totalRoundTripTime:Ljava/lang/Double;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->currentRoundTripTime:Ljava/lang/Double;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->packetsSent:Ljava/math/BigInteger;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/math/BigInteger;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public final setAvailableOutgoingBitrate(Ljava/lang/Double;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->availableOutgoingBitrate:Ljava/lang/Double;

    return-void
.end method

.method public final setBytesSent(Ljava/math/BigInteger;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->bytesSent:Ljava/math/BigInteger;

    return-void
.end method

.method public final setCurrentRoundTripTime(Ljava/lang/Double;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->currentRoundTripTime:Ljava/lang/Double;

    return-void
.end method

.method public final setPacketsSent(Ljava/math/BigInteger;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->packetsSent:Ljava/math/BigInteger;

    return-void
.end method

.method public final setTotalRoundTripTime(Ljava/lang/Double;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->totalRoundTripTime:Ljava/lang/Double;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PublishConnection(bytesSent="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->bytesSent:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", availableOutgoingBitrate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->availableOutgoingBitrate:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", totalRoundTripTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->totalRoundTripTime:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currentRoundTripTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->currentRoundTripTime:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", packetsSent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;->packetsSent:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
