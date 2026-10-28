.class public final Llive/hms/video/connection/stats/HMSRTCStats;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\u000e\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0008\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0008H\u00c6\u0003JO\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\u0008\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0013\u00a8\u0006%"
    }
    d2 = {
        "Llive/hms/video/connection/stats/HMSRTCStats;",
        "",
        "bytesSent",
        "",
        "bytesReceived",
        "packetsReceived",
        "packetsLost",
        "bitrateSent",
        "",
        "bitrateReceived",
        "roundTripTime",
        "<init>",
        "(JJJJDDD)V",
        "getBytesSent",
        "()J",
        "getBytesReceived",
        "getPacketsReceived",
        "getPacketsLost",
        "getBitrateSent",
        "()D",
        "getBitrateReceived",
        "getRoundTripTime",
        "toString",
        "",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
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
.field private final bitrateReceived:D

.field private final bitrateSent:D

.field private final bytesReceived:J

.field private final bytesSent:J

.field private final packetsLost:J

.field private final packetsReceived:J

.field private final roundTripTime:D


# direct methods
.method public constructor <init>(JJJJDDD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bytesSent:J

    iput-wide p3, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bytesReceived:J

    iput-wide p5, p0, Llive/hms/video/connection/stats/HMSRTCStats;->packetsReceived:J

    iput-wide p7, p0, Llive/hms/video/connection/stats/HMSRTCStats;->packetsLost:J

    iput-wide p9, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bitrateSent:D

    iput-wide p11, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bitrateReceived:D

    iput-wide p13, p0, Llive/hms/video/connection/stats/HMSRTCStats;->roundTripTime:D

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/connection/stats/HMSRTCStats;JJJJDDDILjava/lang/Object;)Llive/hms/video/connection/stats/HMSRTCStats;
    .locals 14

    and-int/lit8 v0, p15, 0x1

    if-eqz v0, :cond_0

    iget-wide v0, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bytesSent:J

    goto :goto_0

    :cond_0
    move-wide v0, p1

    :goto_0
    and-int/lit8 v2, p15, 0x2

    if-eqz v2, :cond_1

    iget-wide v2, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bytesReceived:J

    goto :goto_1

    :cond_1
    move-wide/from16 v2, p3

    :goto_1
    and-int/lit8 v4, p15, 0x4

    if-eqz v4, :cond_2

    iget-wide v4, p0, Llive/hms/video/connection/stats/HMSRTCStats;->packetsReceived:J

    goto :goto_2

    :cond_2
    move-wide/from16 v4, p5

    :goto_2
    and-int/lit8 v6, p15, 0x8

    if-eqz v6, :cond_3

    iget-wide v6, p0, Llive/hms/video/connection/stats/HMSRTCStats;->packetsLost:J

    goto :goto_3

    :cond_3
    move-wide/from16 v6, p7

    :goto_3
    and-int/lit8 v8, p15, 0x10

    if-eqz v8, :cond_4

    iget-wide v8, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bitrateSent:D

    goto :goto_4

    :cond_4
    move-wide/from16 v8, p9

    :goto_4
    and-int/lit8 v10, p15, 0x20

    if-eqz v10, :cond_5

    iget-wide v10, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bitrateReceived:D

    goto :goto_5

    :cond_5
    move-wide/from16 v10, p11

    :goto_5
    and-int/lit8 v12, p15, 0x40

    if-eqz v12, :cond_6

    iget-wide v12, p0, Llive/hms/video/connection/stats/HMSRTCStats;->roundTripTime:D

    move-wide/from16 p14, v12

    :goto_6
    move-object p1, p0

    move-wide/from16 p2, v0

    move-wide/from16 p4, v2

    move-wide/from16 p6, v4

    move-wide/from16 p8, v6

    move-wide/from16 p10, v8

    move-wide/from16 p12, v10

    goto :goto_7

    :cond_6
    move-wide/from16 p14, p13

    goto :goto_6

    :goto_7
    invoke-virtual/range {p1 .. p15}, Llive/hms/video/connection/stats/HMSRTCStats;->copy(JJJJDDD)Llive/hms/video/connection/stats/HMSRTCStats;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bytesSent:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bytesReceived:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/HMSRTCStats;->packetsReceived:J

    return-wide v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/HMSRTCStats;->packetsLost:J

    return-wide v0
.end method

.method public final component5()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bitrateSent:D

    return-wide v0
.end method

.method public final component6()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bitrateReceived:D

    return-wide v0
.end method

.method public final component7()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/HMSRTCStats;->roundTripTime:D

    return-wide v0
.end method

.method public final copy(JJJJDDD)Llive/hms/video/connection/stats/HMSRTCStats;
    .locals 15

    new-instance v0, Llive/hms/video/connection/stats/HMSRTCStats;

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move-wide/from16 v9, p9

    move-wide/from16 v11, p11

    move-wide/from16 v13, p13

    invoke-direct/range {v0 .. v14}, Llive/hms/video/connection/stats/HMSRTCStats;-><init>(JJJJDDD)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/connection/stats/HMSRTCStats;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/connection/stats/HMSRTCStats;

    iget-wide v3, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bytesSent:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/HMSRTCStats;->bytesSent:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bytesReceived:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/HMSRTCStats;->bytesReceived:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Llive/hms/video/connection/stats/HMSRTCStats;->packetsReceived:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/HMSRTCStats;->packetsReceived:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Llive/hms/video/connection/stats/HMSRTCStats;->packetsLost:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/HMSRTCStats;->packetsLost:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bitrateSent:D

    iget-wide v5, p1, Llive/hms/video/connection/stats/HMSRTCStats;->bitrateSent:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bitrateReceived:D

    iget-wide v5, p1, Llive/hms/video/connection/stats/HMSRTCStats;->bitrateReceived:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Llive/hms/video/connection/stats/HMSRTCStats;->roundTripTime:D

    iget-wide v5, p1, Llive/hms/video/connection/stats/HMSRTCStats;->roundTripTime:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getBitrateReceived()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bitrateReceived:D

    return-wide v0
.end method

.method public final getBitrateSent()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bitrateSent:D

    return-wide v0
.end method

.method public final getBytesReceived()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bytesReceived:J

    return-wide v0
.end method

.method public final getBytesSent()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bytesSent:J

    return-wide v0
.end method

.method public final getPacketsLost()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/HMSRTCStats;->packetsLost:J

    return-wide v0
.end method

.method public final getPacketsReceived()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/HMSRTCStats;->packetsReceived:J

    return-wide v0
.end method

.method public final getRoundTripTime()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/HMSRTCStats;->roundTripTime:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bytesSent:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bytesReceived:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/connection/stats/HMSRTCStats;->packetsReceived:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/connection/stats/HMSRTCStats;->packetsLost:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bitrateSent:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bitrateReceived:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v1, p0, Llive/hms/video/connection/stats/HMSRTCStats;->roundTripTime:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSRTCStats(bytesSent="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bytesSent:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", bytesReceived="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bytesReceived:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", packetsReceived="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/HMSRTCStats;->packetsReceived:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", packetsLost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/HMSRTCStats;->packetsLost:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", bitrateSent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bitrateSent:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", bitrateReceived="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/HMSRTCStats;->bitrateReceived:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", roundTripTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/HMSRTCStats;->roundTripTime:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
