.class public final Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/connection/stats/clientside/model/SubscribeBaseSample;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u000bH\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u000fH\u00c6\u0003Jw\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\u0008\u0010.\u001a\u0004\u0018\u00010/H\u00d6\u0003J\t\u00100\u001a\u000201H\u00d6\u0001J\t\u00102\u001a\u000203H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0013R\u0016\u0010\u0008\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0013R\u0016\u0010\n\u001a\u00020\u000b8\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u000c\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0013R\u0016\u0010\r\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u000f8\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u00064"
    }
    d2 = {
        "Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;",
        "Llive/hms/video/connection/stats/clientside/model/SubscribeBaseSample;",
        "timestamp",
        "",
        "audio_level_high_seconds",
        "audio_concealed_samples",
        "audio_total_samples_received",
        "audio_concealment_events",
        "fec_packets_discarded",
        "fec_packets_received",
        "total_samples_duration",
        "",
        "total_packets_received",
        "total_packets_lost",
        "jitter_buffer_delay",
        "",
        "<init>",
        "(JJJJJJJFJJD)V",
        "getTimestamp",
        "()J",
        "getAudio_level_high_seconds",
        "getAudio_concealed_samples",
        "getAudio_total_samples_received",
        "getAudio_concealment_events",
        "getFec_packets_discarded",
        "getFec_packets_received",
        "getTotal_samples_duration",
        "()F",
        "getTotal_packets_received",
        "getTotal_packets_lost",
        "getJitter_buffer_delay",
        "()D",
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
        "",
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
.field private final audio_concealed_samples:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "audio_concealed_samples"
    .end annotation
.end field

.field private final audio_concealment_events:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "audio_concealment_events"
    .end annotation
.end field

.field private final audio_level_high_seconds:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "audio_level_high_seconds"
    .end annotation
.end field

.field private final audio_total_samples_received:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "audio_total_samples_received"
    .end annotation
.end field

.field private final fec_packets_discarded:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "fec_packets_discarded"
    .end annotation
.end field

.field private final fec_packets_received:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "fec_packets_received"
    .end annotation
.end field

.field private final jitter_buffer_delay:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "jitter_buffer_delay"
    .end annotation
.end field

.field private final timestamp:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "timestamp"
    .end annotation
.end field

.field private final total_packets_lost:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total_packets_lost"
    .end annotation
.end field

.field private final total_packets_received:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total_packets_received"
    .end annotation
.end field

.field private final total_samples_duration:F
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total_samples_duration"
    .end annotation
.end field


# direct methods
.method public constructor <init>(JJJJJJJFJJD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->timestamp:J

    iput-wide p3, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_level_high_seconds:J

    iput-wide p5, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_concealed_samples:J

    iput-wide p7, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_total_samples_received:J

    iput-wide p9, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_concealment_events:J

    iput-wide p11, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->fec_packets_discarded:J

    iput-wide p13, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->fec_packets_received:J

    iput p15, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_samples_duration:F

    move-wide/from16 p1, p16

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_packets_received:J

    move-wide/from16 p1, p18

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_packets_lost:J

    move-wide/from16 p1, p20

    iput-wide p1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->jitter_buffer_delay:D

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;JJJJJJJFJJDILjava/lang/Object;)Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p22

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-wide v2, v0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->timestamp:J

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-wide v4, v0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_level_high_seconds:J

    goto :goto_1

    :cond_1
    move-wide/from16 v4, p3

    :goto_1
    and-int/lit8 v6, v1, 0x4

    if-eqz v6, :cond_2

    iget-wide v6, v0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_concealed_samples:J

    goto :goto_2

    :cond_2
    move-wide/from16 v6, p5

    :goto_2
    and-int/lit8 v8, v1, 0x8

    if-eqz v8, :cond_3

    iget-wide v8, v0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_total_samples_received:J

    goto :goto_3

    :cond_3
    move-wide/from16 v8, p7

    :goto_3
    and-int/lit8 v10, v1, 0x10

    if-eqz v10, :cond_4

    iget-wide v10, v0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_concealment_events:J

    goto :goto_4

    :cond_4
    move-wide/from16 v10, p9

    :goto_4
    and-int/lit8 v12, v1, 0x20

    if-eqz v12, :cond_5

    iget-wide v12, v0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->fec_packets_discarded:J

    goto :goto_5

    :cond_5
    move-wide/from16 v12, p11

    :goto_5
    and-int/lit8 v14, v1, 0x40

    if-eqz v14, :cond_6

    iget-wide v14, v0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->fec_packets_received:J

    goto :goto_6

    :cond_6
    move-wide/from16 v14, p13

    :goto_6
    move-wide/from16 v16, v2

    and-int/lit16 v2, v1, 0x80

    if-eqz v2, :cond_7

    iget v2, v0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_samples_duration:F

    goto :goto_7

    :cond_7
    move/from16 v2, p15

    :goto_7
    and-int/lit16 v3, v1, 0x100

    move/from16 p1, v2

    if-eqz v3, :cond_8

    iget-wide v2, v0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_packets_received:J

    goto :goto_8

    :cond_8
    move-wide/from16 v2, p16

    :goto_8
    move-wide/from16 p2, v2

    and-int/lit16 v2, v1, 0x200

    if-eqz v2, :cond_9

    iget-wide v2, v0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_packets_lost:J

    goto :goto_9

    :cond_9
    move-wide/from16 v2, p18

    :goto_9
    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_a

    move-wide/from16 p4, v2

    iget-wide v1, v0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->jitter_buffer_delay:D

    move-wide/from16 p19, p4

    move-wide/from16 p21, v1

    :goto_a
    move/from16 p16, p1

    move-wide/from16 p17, p2

    move-object/from16 p1, v0

    move-wide/from16 p4, v4

    move-wide/from16 p6, v6

    move-wide/from16 p8, v8

    move-wide/from16 p10, v10

    move-wide/from16 p12, v12

    move-wide/from16 p14, v14

    move-wide/from16 p2, v16

    goto :goto_b

    :cond_a
    move-wide/from16 p21, p20

    move-wide/from16 p19, v2

    goto :goto_a

    :goto_b
    invoke-virtual/range {p1 .. p22}, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->copy(JJJJJJJFJJD)Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->timestamp:J

    return-wide v0
.end method

.method public final component10()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_packets_lost:J

    return-wide v0
.end method

.method public final component11()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->jitter_buffer_delay:D

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_level_high_seconds:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_concealed_samples:J

    return-wide v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_total_samples_received:J

    return-wide v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_concealment_events:J

    return-wide v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->fec_packets_discarded:J

    return-wide v0
.end method

.method public final component7()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->fec_packets_received:J

    return-wide v0
.end method

.method public final component8()F
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_samples_duration:F

    return v0
.end method

.method public final component9()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_packets_received:J

    return-wide v0
.end method

.method public final copy(JJJJJJJFJJD)Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;
    .locals 22

    new-instance v0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move-wide/from16 v9, p9

    move-wide/from16 v11, p11

    move-wide/from16 v13, p13

    move/from16 v15, p15

    move-wide/from16 v16, p16

    move-wide/from16 v18, p18

    move-wide/from16 v20, p20

    invoke-direct/range {v0 .. v21}, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;-><init>(JJJJJJJFJJD)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;

    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->timestamp:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->timestamp:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_level_high_seconds:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_level_high_seconds:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_concealed_samples:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_concealed_samples:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_total_samples_received:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_total_samples_received:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_concealment_events:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_concealment_events:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->fec_packets_discarded:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->fec_packets_discarded:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->fec_packets_received:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->fec_packets_received:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_samples_duration:F

    iget v3, p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_samples_duration:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_packets_received:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_packets_received:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_packets_lost:J

    iget-wide v5, p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_packets_lost:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget-wide v3, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->jitter_buffer_delay:D

    iget-wide v5, p1, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->jitter_buffer_delay:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public getAudio_concealed_samples()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_concealed_samples:J

    return-wide v0
.end method

.method public getAudio_concealment_events()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_concealment_events:J

    return-wide v0
.end method

.method public getAudio_level_high_seconds()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_level_high_seconds:J

    return-wide v0
.end method

.method public getAudio_total_samples_received()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_total_samples_received:J

    return-wide v0
.end method

.method public getFec_packets_discarded()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->fec_packets_discarded:J

    return-wide v0
.end method

.method public getFec_packets_received()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->fec_packets_received:J

    return-wide v0
.end method

.method public getJitter_buffer_delay()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->jitter_buffer_delay:D

    return-wide v0
.end method

.method public getTimestamp()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->timestamp:J

    return-wide v0
.end method

.method public getTotal_packets_lost()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_packets_lost:J

    return-wide v0
.end method

.method public getTotal_packets_received()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_packets_received:J

    return-wide v0
.end method

.method public getTotal_samples_duration()F
    .locals 1

    iget v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_samples_duration:F

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->timestamp:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_level_high_seconds:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_concealed_samples:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_total_samples_received:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_concealment_events:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->fec_packets_discarded:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->fec_packets_received:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v2, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_samples_duration:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_packets_received:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_packets_lost:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->jitter_buffer_delay:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AudioSamplesSubscribe(timestamp="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->timestamp:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", audio_level_high_seconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_level_high_seconds:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", audio_concealed_samples="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_concealed_samples:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", audio_total_samples_received="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_total_samples_received:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", audio_concealment_events="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->audio_concealment_events:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", fec_packets_discarded="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->fec_packets_discarded:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", fec_packets_received="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->fec_packets_received:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", total_samples_duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_samples_duration:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", total_packets_received="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_packets_received:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", total_packets_lost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->total_packets_lost:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", jitter_buffer_delay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;->jitter_buffer_delay:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
