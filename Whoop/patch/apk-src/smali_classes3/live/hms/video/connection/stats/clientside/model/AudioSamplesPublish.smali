.class public final Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/connection/stats/clientside/model/PublishBaseSamples;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0008\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000e\u00a8\u0006$"
    }
    d2 = {
        "Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;",
        "Llive/hms/video/connection/stats/clientside/model/PublishBaseSamples;",
        "timestamp",
        "",
        "avgRoundTripTimeMs",
        "",
        "avgJitterMs",
        "",
        "totalPacketsLost",
        "avgBitrateBps",
        "avgAvailableOutgoingBitrateBps",
        "<init>",
        "(JIFJJJ)V",
        "getTimestamp",
        "()J",
        "getAvgRoundTripTimeMs",
        "()I",
        "getAvgJitterMs",
        "()F",
        "getTotalPacketsLost",
        "getAvgBitrateBps",
        "getAvgAvailableOutgoingBitrateBps",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
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
.field private final avgAvailableOutgoingBitrateBps:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg_available_outgoing_bitrate_bps"
    .end annotation
.end field

.field private final avgBitrateBps:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg_bitrate_bps"
    .end annotation
.end field

.field private final avgJitterMs:F
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg_jitter_ms"
    .end annotation
.end field

.field private final avgRoundTripTimeMs:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg_round_trip_time_ms"
    .end annotation
.end field

.field private final timestamp:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "timestamp"
    .end annotation
.end field

.field private final totalPacketsLost:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total_packets_lost"
    .end annotation
.end field


# direct methods
.method public constructor <init>(JIFJJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->timestamp:J

    iput p3, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgRoundTripTimeMs:I

    iput p4, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgJitterMs:F

    iput-wide p5, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->totalPacketsLost:J

    iput-wide p7, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgBitrateBps:J

    iput-wide p9, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgAvailableOutgoingBitrateBps:J

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;JIFJJJILjava/lang/Object;)Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;
    .locals 11

    and-int/lit8 v0, p11, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->timestamp:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p11, 0x2

    if-eqz p1, :cond_1

    iget p3, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgRoundTripTimeMs:I

    :cond_1
    move v3, p3

    and-int/lit8 p1, p11, 0x4

    if-eqz p1, :cond_2

    iget p4, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgJitterMs:F

    :cond_2
    move v4, p4

    and-int/lit8 p1, p11, 0x8

    if-eqz p1, :cond_3

    iget-wide p1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->totalPacketsLost:J

    move-wide v5, p1

    goto :goto_0

    :cond_3
    move-wide/from16 v5, p5

    :goto_0
    and-int/lit8 p1, p11, 0x10

    if-eqz p1, :cond_4

    iget-wide p1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgBitrateBps:J

    move-wide v7, p1

    goto :goto_1

    :cond_4
    move-wide/from16 v7, p7

    :goto_1
    and-int/lit8 p1, p11, 0x20

    if-eqz p1, :cond_5

    iget-wide p1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgAvailableOutgoingBitrateBps:J

    move-wide v9, p1

    :goto_2
    move-object v0, p0

    goto :goto_3

    :cond_5
    move-wide/from16 v9, p9

    goto :goto_2

    :goto_3
    invoke-virtual/range {v0 .. v10}, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->copy(JIFJJJ)Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->timestamp:J

    return-wide v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgRoundTripTimeMs:I

    return v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgJitterMs:F

    return v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->totalPacketsLost:J

    return-wide v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgBitrateBps:J

    return-wide v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgAvailableOutgoingBitrateBps:J

    return-wide v0
.end method

.method public final copy(JIFJJJ)Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;
    .locals 11

    new-instance v0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move-wide/from16 v9, p9

    invoke-direct/range {v0 .. v10}, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;-><init>(JIFJJJ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;

    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->timestamp:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->timestamp:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgRoundTripTimeMs:I

    iget v3, p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgRoundTripTimeMs:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgJitterMs:F

    iget v3, p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgJitterMs:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->totalPacketsLost:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->totalPacketsLost:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgBitrateBps:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgBitrateBps:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgAvailableOutgoingBitrateBps:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgAvailableOutgoingBitrateBps:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public getAvgAvailableOutgoingBitrateBps()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgAvailableOutgoingBitrateBps:J

    return-wide v0
.end method

.method public getAvgBitrateBps()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgBitrateBps:J

    return-wide v0
.end method

.method public getAvgJitterMs()F
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgJitterMs:F

    return v0
.end method

.method public getAvgRoundTripTimeMs()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgRoundTripTimeMs:I

    return v0
.end method

.method public getTimestamp()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->timestamp:J

    return-wide v0
.end method

.method public getTotalPacketsLost()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->totalPacketsLost:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->timestamp:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgRoundTripTimeMs:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgJitterMs:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->totalPacketsLost:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgBitrateBps:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgAvailableOutgoingBitrateBps:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AudioSamplesPublish(timestamp="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->timestamp:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", avgRoundTripTimeMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgRoundTripTimeMs:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", avgJitterMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgJitterMs:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", totalPacketsLost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->totalPacketsLost:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", avgBitrateBps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgBitrateBps:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", avgAvailableOutgoingBitrateBps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;->avgAvailableOutgoingBitrateBps:J

    const/16 v3, 0x29

    invoke-static {v0, v1, v2, v3}, Lb9/y;->o(Ljava/lang/StringBuilder;JC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
