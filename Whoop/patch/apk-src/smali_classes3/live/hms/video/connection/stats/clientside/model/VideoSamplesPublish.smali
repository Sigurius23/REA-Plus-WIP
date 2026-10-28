.class public final Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/connection/stats/clientside/model/PublishBaseSamples;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0007H\u00c6\u0003J\t\u0010)\u001a\u00020\tH\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u000cH\u00c6\u0003J\t\u0010,\u001a\u00020\tH\u00c6\u0003J\t\u0010-\u001a\u00020\tH\u00c6\u0003J\t\u0010.\u001a\u00020\tH\u00c6\u0003J\t\u0010/\u001a\u00020\u0011H\u00c6\u0003J\t\u00100\u001a\u00020\tH\u00c6\u0003Jw\u00101\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\tH\u00c6\u0001J\u0013\u00102\u001a\u0002032\u0008\u00104\u001a\u0004\u0018\u000105H\u00d6\u0003J\t\u00106\u001a\u00020\u0005H\u00d6\u0001J\t\u00107\u001a\u000208H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0016\u0010\u0008\u001a\u00020\t8\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\n\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u000c8\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0016\u0010\r\u001a\u00020\t8\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001cR\u0016\u0010\u000e\u001a\u00020\t8\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\t8\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001cR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0016\u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u001c\u00a8\u00069"
    }
    d2 = {
        "Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;",
        "Llive/hms/video/connection/stats/clientside/model/PublishBaseSamples;",
        "total_quality_limitation",
        "Llive/hms/video/connection/stats/clientside/model/QualityLimitation;",
        "avg_fps",
        "",
        "resolution",
        "Llive/hms/video/connection/stats/clientside/model/Size;",
        "timestamp",
        "",
        "avgRoundTripTimeMs",
        "avgJitterMs",
        "",
        "totalPacketsLost",
        "avgBitrateBps",
        "avgAvailableOutgoingBitrateBps",
        "totalPacketSendDelay",
        "",
        "packetsSent",
        "<init>",
        "(Llive/hms/video/connection/stats/clientside/model/QualityLimitation;ILlive/hms/video/connection/stats/clientside/model/Size;JIFJJJDJ)V",
        "getTotal_quality_limitation",
        "()Llive/hms/video/connection/stats/clientside/model/QualityLimitation;",
        "getAvg_fps",
        "()I",
        "getResolution",
        "()Llive/hms/video/connection/stats/clientside/model/Size;",
        "getTimestamp",
        "()J",
        "getAvgRoundTripTimeMs",
        "getAvgJitterMs",
        "()F",
        "getTotalPacketsLost",
        "getAvgBitrateBps",
        "getAvgAvailableOutgoingBitrateBps",
        "getTotalPacketSendDelay",
        "()D",
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
        "component11",
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

.field private final avg_fps:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg_fps"
    .end annotation
.end field

.field private final packetsSent:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total_packets_sent"
    .end annotation
.end field

.field private final resolution:Llive/hms/video/connection/stats/clientside/model/Size;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "resolution"
    .end annotation
.end field

.field private final timestamp:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "timestamp"
    .end annotation
.end field

.field private final totalPacketSendDelay:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total_packet_sent_delay_sec"
    .end annotation
.end field

.field private final totalPacketsLost:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total_packets_lost"
    .end annotation
.end field

.field private final total_quality_limitation:Llive/hms/video/connection/stats/clientside/model/QualityLimitation;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total_quality_limitation"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llive/hms/video/connection/stats/clientside/model/QualityLimitation;ILlive/hms/video/connection/stats/clientside/model/Size;JIFJJJDJ)V
    .locals 1

    const-string v0, "total_quality_limitation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resolution"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->total_quality_limitation:Llive/hms/video/connection/stats/clientside/model/QualityLimitation;

    iput p2, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avg_fps:I

    iput-object p3, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->resolution:Llive/hms/video/connection/stats/clientside/model/Size;

    iput-wide p4, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->timestamp:J

    iput p6, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgRoundTripTimeMs:I

    iput p7, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgJitterMs:F

    iput-wide p8, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->totalPacketsLost:J

    iput-wide p10, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgBitrateBps:J

    iput-wide p12, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgAvailableOutgoingBitrateBps:J

    move-wide p1, p14

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->totalPacketSendDelay:D

    move-wide/from16 p1, p16

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->packetsSent:J

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;Llive/hms/video/connection/stats/clientside/model/QualityLimitation;ILlive/hms/video/connection/stats/clientside/model/Size;JIFJJJDJILjava/lang/Object;)Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p18

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->total_quality_limitation:Llive/hms/video/connection/stats/clientside/model/QualityLimitation;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avg_fps:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->resolution:Llive/hms/video/connection/stats/clientside/model/Size;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-wide v5, v0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->timestamp:J

    goto :goto_3

    :cond_3
    move-wide/from16 v5, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget v7, v0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgRoundTripTimeMs:I

    goto :goto_4

    :cond_4
    move/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget v8, v0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgJitterMs:F

    goto :goto_5

    :cond_5
    move/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-wide v9, v0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->totalPacketsLost:J

    goto :goto_6

    :cond_6
    move-wide/from16 v9, p8

    :goto_6
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_7

    iget-wide v11, v0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgBitrateBps:J

    goto :goto_7

    :cond_7
    move-wide/from16 v11, p10

    :goto_7
    and-int/lit16 v13, v1, 0x100

    if-eqz v13, :cond_8

    iget-wide v13, v0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgAvailableOutgoingBitrateBps:J

    goto :goto_8

    :cond_8
    move-wide/from16 v13, p12

    :goto_8
    and-int/lit16 v15, v1, 0x200

    move-object/from16 p1, v2

    move/from16 p2, v3

    if-eqz v15, :cond_9

    iget-wide v2, v0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->totalPacketSendDelay:D

    goto :goto_9

    :cond_9
    move-wide/from16 v2, p14

    :goto_9
    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_a

    move-wide/from16 p3, v2

    iget-wide v1, v0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->packetsSent:J

    move-wide/from16 p15, p3

    move-wide/from16 p17, v1

    move-object/from16 p4, v4

    move-wide/from16 p5, v5

    move/from16 p7, v7

    move/from16 p8, v8

    move-wide/from16 p9, v9

    move-wide/from16 p11, v11

    move-wide/from16 p13, v13

    move/from16 p3, p2

    :goto_a
    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_b

    :cond_a
    move-wide/from16 p17, p16

    move-wide/from16 p15, v2

    move/from16 p3, p2

    move-object/from16 p4, v4

    move-wide/from16 p5, v5

    move/from16 p7, v7

    move/from16 p8, v8

    move-wide/from16 p9, v9

    move-wide/from16 p11, v11

    move-wide/from16 p13, v13

    goto :goto_a

    :goto_b
    invoke-virtual/range {p1 .. p18}, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->copy(Llive/hms/video/connection/stats/clientside/model/QualityLimitation;ILlive/hms/video/connection/stats/clientside/model/Size;JIFJJJDJ)Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Llive/hms/video/connection/stats/clientside/model/QualityLimitation;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->total_quality_limitation:Llive/hms/video/connection/stats/clientside/model/QualityLimitation;

    return-object v0
.end method

.method public final component10()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->totalPacketSendDelay:D

    return-wide v0
.end method

.method public final component11()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->packetsSent:J

    return-wide v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avg_fps:I

    return v0
.end method

.method public final component3()Llive/hms/video/connection/stats/clientside/model/Size;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->resolution:Llive/hms/video/connection/stats/clientside/model/Size;

    return-object v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->timestamp:J

    return-wide v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgRoundTripTimeMs:I

    return v0
.end method

.method public final component6()F
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgJitterMs:F

    return v0
.end method

.method public final component7()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->totalPacketsLost:J

    return-wide v0
.end method

.method public final component8()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgBitrateBps:J

    return-wide v0
.end method

.method public final component9()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgAvailableOutgoingBitrateBps:J

    return-wide v0
.end method

.method public final copy(Llive/hms/video/connection/stats/clientside/model/QualityLimitation;ILlive/hms/video/connection/stats/clientside/model/Size;JIFJJJDJ)Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;
    .locals 19

    const-string v0, "total_quality_limitation"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resolution"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;

    move/from16 v3, p2

    move-wide/from16 v5, p4

    move/from16 v7, p6

    move/from16 v8, p7

    move-wide/from16 v9, p8

    move-wide/from16 v11, p10

    move-wide/from16 v13, p12

    move-wide/from16 v15, p14

    move-wide/from16 v17, p16

    invoke-direct/range {v1 .. v18}, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;-><init>(Llive/hms/video/connection/stats/clientside/model/QualityLimitation;ILlive/hms/video/connection/stats/clientside/model/Size;JIFJJJDJ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;

    iget-object v1, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->total_quality_limitation:Llive/hms/video/connection/stats/clientside/model/QualityLimitation;

    iget-object v3, p1, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->total_quality_limitation:Llive/hms/video/connection/stats/clientside/model/QualityLimitation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avg_fps:I

    iget v3, p1, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avg_fps:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->resolution:Llive/hms/video/connection/stats/clientside/model/Size;

    iget-object v3, p1, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->resolution:Llive/hms/video/connection/stats/clientside/model/Size;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->timestamp:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->timestamp:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgRoundTripTimeMs:I

    iget v3, p1, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgRoundTripTimeMs:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgJitterMs:F

    iget v3, p1, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgJitterMs:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->totalPacketsLost:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->totalPacketsLost:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgBitrateBps:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgBitrateBps:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgAvailableOutgoingBitrateBps:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgAvailableOutgoingBitrateBps:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->totalPacketSendDelay:D

    iget-wide v5, p1, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->totalPacketSendDelay:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->packetsSent:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->packetsSent:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public getAvgAvailableOutgoingBitrateBps()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgAvailableOutgoingBitrateBps:J

    return-wide v0
.end method

.method public getAvgBitrateBps()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgBitrateBps:J

    return-wide v0
.end method

.method public getAvgJitterMs()F
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgJitterMs:F

    return v0
.end method

.method public getAvgRoundTripTimeMs()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgRoundTripTimeMs:I

    return v0
.end method

.method public final getAvg_fps()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avg_fps:I

    return v0
.end method

.method public final getPacketsSent()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->packetsSent:J

    return-wide v0
.end method

.method public final getResolution()Llive/hms/video/connection/stats/clientside/model/Size;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->resolution:Llive/hms/video/connection/stats/clientside/model/Size;

    return-object v0
.end method

.method public getTimestamp()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->timestamp:J

    return-wide v0
.end method

.method public final getTotalPacketSendDelay()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->totalPacketSendDelay:D

    return-wide v0
.end method

.method public getTotalPacketsLost()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->totalPacketsLost:J

    return-wide v0
.end method

.method public final getTotal_quality_limitation()Llive/hms/video/connection/stats/clientside/model/QualityLimitation;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->total_quality_limitation:Llive/hms/video/connection/stats/clientside/model/QualityLimitation;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->total_quality_limitation:Llive/hms/video/connection/stats/clientside/model/QualityLimitation;

    invoke-virtual {v0}, Llive/hms/video/connection/stats/clientside/model/QualityLimitation;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avg_fps:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->resolution:Llive/hms/video/connection/stats/clientside/model/Size;

    invoke-virtual {v2}, Llive/hms/video/connection/stats/clientside/model/Size;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->timestamp:J

    invoke-static {v2, v3, v4, v1}, Ld;->e(IJI)I

    move-result v0

    iget v2, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgRoundTripTimeMs:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgJitterMs:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->totalPacketsLost:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgBitrateBps:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgAvailableOutgoingBitrateBps:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->totalPacketSendDelay:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->packetsSent:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "VideoSamplesPublish(total_quality_limitation="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->total_quality_limitation:Llive/hms/video/connection/stats/clientside/model/QualityLimitation;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", avg_fps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avg_fps:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", resolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->resolution:Llive/hms/video/connection/stats/clientside/model/Size;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->timestamp:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", avgRoundTripTimeMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgRoundTripTimeMs:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", avgJitterMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgJitterMs:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", totalPacketsLost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->totalPacketsLost:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", avgBitrateBps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgBitrateBps:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", avgAvailableOutgoingBitrateBps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->avgAvailableOutgoingBitrateBps:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", totalPacketSendDelay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->totalPacketSendDelay:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", packetsSent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;->packetsSent:J

    const/16 v3, 0x29

    invoke-static {v0, v1, v2, v3}, Lb9/y;->o(Ljava/lang/StringBuilder;JC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
