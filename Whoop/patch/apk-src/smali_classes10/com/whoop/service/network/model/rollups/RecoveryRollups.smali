.class public final Lcom/whoop/service/network/model/rollups/RecoveryRollups;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0010\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u00081\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00a7\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0014H\u00c6\u0003J\t\u0010C\u001a\u00020\u0016H\u00c6\u0003J\t\u0010D\u001a\u00020\u0014H\u00c6\u0003J\t\u0010E\u001a\u00020\u0014H\u00c6\u0003J\u00d1\u0001\u0010F\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0014H\u00c6\u0001J\u0014\u0010G\u001a\u00020H2\u0008\u0010I\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010J\u001a\u00020\u0014H\u00d6\u0081\u0004J\n\u0010K\u001a\u00020\u0016H\u00d6\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001cR\u0016\u0010\u0008\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001cR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001cR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001cR\u0016\u0010\u000c\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u001cR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u001cR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u001cR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\u001cR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010\u001cR\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010/R\u0016\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010-R\u0016\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010-\u00a8\u0006L"
    }
    d2 = {
        "Lcom/whoop/service/network/model/rollups/RecoveryRollups;",
        "",
        "avgHrvTrendDelta",
        "",
        "avgRhrTrendDelta",
        "medianHrvTrendDelta",
        "medianRhrTrendDelta",
        "avgHrv",
        "avgRhr",
        "maxHrv",
        "medianHrv",
        "medianRhr",
        "maxRhr",
        "minHrv",
        "hrvPercentile25",
        "hrvPercentile75",
        "rhrPercentile25",
        "rhrPercentile75",
        "minRhr",
        "recoveryCount",
        "",
        "updatedAt",
        "",
        "minRecoveryScore",
        "maxRecoveryScore",
        "<init>",
        "(DDDDDDDDDDDDDDDDILjava/lang/String;II)V",
        "getAvgHrvTrendDelta",
        "()D",
        "getAvgRhrTrendDelta",
        "getMedianHrvTrendDelta",
        "getMedianRhrTrendDelta",
        "getAvgHrv",
        "getAvgRhr",
        "getMaxHrv",
        "getMedianHrv",
        "getMedianRhr",
        "getMaxRhr",
        "getMinHrv",
        "getHrvPercentile25",
        "getHrvPercentile75",
        "getRhrPercentile25",
        "getRhrPercentile75",
        "getMinRhr",
        "getRecoveryCount",
        "()I",
        "getUpdatedAt",
        "()Ljava/lang/String;",
        "getMinRecoveryScore",
        "getMaxRecoveryScore",
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
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final avgHrv:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg_hrv"
    .end annotation
.end field

.field private final avgHrvTrendDelta:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg_hrv_trend_delta"
    .end annotation
.end field

.field private final avgRhr:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg_rhr"
    .end annotation
.end field

.field private final avgRhrTrendDelta:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg_rhr_trend_delta"
    .end annotation
.end field

.field private final hrvPercentile25:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "hrv_twenty_fifth_percentile"
    .end annotation
.end field

.field private final hrvPercentile75:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "hrv_seventy_fifth_percentile"
    .end annotation
.end field

.field private final maxHrv:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "max_hrv"
    .end annotation
.end field

.field private final maxRecoveryScore:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "max_recovery_score"
    .end annotation
.end field

.field private final maxRhr:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "max_rhr"
    .end annotation
.end field

.field private final medianHrv:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "hrv_median"
    .end annotation
.end field

.field private final medianHrvTrendDelta:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "median_hrv_trend_delta"
    .end annotation
.end field

.field private final medianRhr:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "rhr_median"
    .end annotation
.end field

.field private final medianRhrTrendDelta:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "median_rhr_trend_delta"
    .end annotation
.end field

.field private final minHrv:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "min_hrv"
    .end annotation
.end field

.field private final minRecoveryScore:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "min_recovery_score"
    .end annotation
.end field

.field private final minRhr:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "min_rhr"
    .end annotation
.end field

.field private final recoveryCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "recovery_count"
    .end annotation
.end field

.field private final rhrPercentile25:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "rhr_twenty_fifth_percentile"
    .end annotation
.end field

.field private final rhrPercentile75:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "rhr_seventy_fifth_percentile"
    .end annotation
.end field

.field private final updatedAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field


# direct methods
.method public constructor <init>(DDDDDDDDDDDDDDDDILjava/lang/String;II)V
    .locals 2

    move-object/from16 v0, p34

    const-string v1, "updatedAt"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgHrvTrendDelta:D

    iput-wide p3, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgRhrTrendDelta:D

    iput-wide p5, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianHrvTrendDelta:D

    iput-wide p7, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianRhrTrendDelta:D

    iput-wide p9, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgHrv:D

    iput-wide p11, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgRhr:D

    move-wide p1, p13

    iput-wide p1, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxHrv:D

    move-wide/from16 p1, p15

    iput-wide p1, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianHrv:D

    move-wide/from16 p1, p17

    iput-wide p1, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianRhr:D

    move-wide/from16 p1, p19

    iput-wide p1, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxRhr:D

    move-wide/from16 p1, p21

    iput-wide p1, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minHrv:D

    move-wide/from16 p1, p23

    iput-wide p1, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->hrvPercentile25:D

    move-wide/from16 p1, p25

    iput-wide p1, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->hrvPercentile75:D

    move-wide/from16 p1, p27

    iput-wide p1, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->rhrPercentile25:D

    move-wide/from16 p1, p29

    iput-wide p1, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->rhrPercentile75:D

    move-wide/from16 p1, p31

    iput-wide p1, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minRhr:D

    move/from16 p1, p33

    iput p1, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->recoveryCount:I

    iput-object v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->updatedAt:Ljava/lang/String;

    move/from16 p1, p35

    iput p1, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minRecoveryScore:I

    move/from16 p1, p36

    iput p1, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxRecoveryScore:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/service/network/model/rollups/RecoveryRollups;DDDDDDDDDDDDDDDDILjava/lang/String;IIILjava/lang/Object;)Lcom/whoop/service/network/model/rollups/RecoveryRollups;
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p37

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-wide v2, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgHrvTrendDelta:D

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-wide v4, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgRhrTrendDelta:D

    goto :goto_1

    :cond_1
    move-wide/from16 v4, p3

    :goto_1
    and-int/lit8 v6, v1, 0x4

    if-eqz v6, :cond_2

    iget-wide v6, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianHrvTrendDelta:D

    goto :goto_2

    :cond_2
    move-wide/from16 v6, p5

    :goto_2
    and-int/lit8 v8, v1, 0x8

    if-eqz v8, :cond_3

    iget-wide v8, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianRhrTrendDelta:D

    goto :goto_3

    :cond_3
    move-wide/from16 v8, p7

    :goto_3
    and-int/lit8 v10, v1, 0x10

    if-eqz v10, :cond_4

    iget-wide v10, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgHrv:D

    goto :goto_4

    :cond_4
    move-wide/from16 v10, p9

    :goto_4
    and-int/lit8 v12, v1, 0x20

    if-eqz v12, :cond_5

    iget-wide v12, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgRhr:D

    goto :goto_5

    :cond_5
    move-wide/from16 v12, p11

    :goto_5
    and-int/lit8 v14, v1, 0x40

    if-eqz v14, :cond_6

    iget-wide v14, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxHrv:D

    goto :goto_6

    :cond_6
    move-wide/from16 v14, p13

    :goto_6
    move-wide/from16 v16, v2

    and-int/lit16 v2, v1, 0x80

    if-eqz v2, :cond_7

    iget-wide v2, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianHrv:D

    goto :goto_7

    :cond_7
    move-wide/from16 v2, p15

    :goto_7
    move-wide/from16 p1, v2

    and-int/lit16 v2, v1, 0x100

    if-eqz v2, :cond_8

    iget-wide v2, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianRhr:D

    goto :goto_8

    :cond_8
    move-wide/from16 v2, p17

    :goto_8
    move-wide/from16 p3, v2

    and-int/lit16 v2, v1, 0x200

    if-eqz v2, :cond_9

    iget-wide v2, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxRhr:D

    goto :goto_9

    :cond_9
    move-wide/from16 v2, p19

    :goto_9
    move-wide/from16 p5, v2

    and-int/lit16 v2, v1, 0x400

    if-eqz v2, :cond_a

    iget-wide v2, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minHrv:D

    goto :goto_a

    :cond_a
    move-wide/from16 v2, p21

    :goto_a
    move-wide/from16 p7, v2

    and-int/lit16 v2, v1, 0x800

    if-eqz v2, :cond_b

    iget-wide v2, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->hrvPercentile25:D

    goto :goto_b

    :cond_b
    move-wide/from16 v2, p23

    :goto_b
    move-wide/from16 p9, v2

    and-int/lit16 v2, v1, 0x1000

    if-eqz v2, :cond_c

    iget-wide v2, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->hrvPercentile75:D

    goto :goto_c

    :cond_c
    move-wide/from16 v2, p25

    :goto_c
    move-wide/from16 p11, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget-wide v2, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->rhrPercentile25:D

    goto :goto_d

    :cond_d
    move-wide/from16 v2, p27

    :goto_d
    move-wide/from16 p13, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-wide v2, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->rhrPercentile75:D

    goto :goto_e

    :cond_e
    move-wide/from16 v2, p29

    :goto_e
    const v18, 0x8000

    and-int v18, v1, v18

    move-wide/from16 p15, v2

    if-eqz v18, :cond_f

    iget-wide v1, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minRhr:D

    goto :goto_f

    :cond_f
    move-wide/from16 v1, p31

    :goto_f
    const/high16 v3, 0x10000

    and-int v3, p37, v3

    if-eqz v3, :cond_10

    iget v3, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->recoveryCount:I

    goto :goto_10

    :cond_10
    move/from16 v3, p33

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, p37, v18

    move-wide/from16 p17, v1

    if-eqz v18, :cond_11

    iget-object v1, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->updatedAt:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p34

    :goto_11
    const/high16 v2, 0x40000

    and-int v2, p37, v2

    if-eqz v2, :cond_12

    iget v2, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minRecoveryScore:I

    goto :goto_12

    :cond_12
    move/from16 v2, p35

    :goto_12
    const/high16 v18, 0x80000

    and-int v18, p37, v18

    if-eqz v18, :cond_13

    move-object/from16 p19, v1

    iget v1, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxRecoveryScore:I

    move-object/from16 p35, p19

    move/from16 p37, v1

    :goto_13
    move-wide/from16 p20, p5

    move-wide/from16 p22, p7

    move-wide/from16 p24, p9

    move-wide/from16 p26, p11

    move-wide/from16 p28, p13

    move-wide/from16 p30, p15

    move-wide/from16 p32, p17

    move/from16 p36, v2

    move/from16 p34, v3

    move-wide/from16 p6, v6

    move-wide/from16 p8, v8

    move-wide/from16 p10, v10

    move-wide/from16 p12, v12

    move-wide/from16 p14, v14

    move-wide/from16 p16, p1

    move-wide/from16 p18, p3

    move-object/from16 p1, v0

    move-wide/from16 p4, v4

    move-wide/from16 p2, v16

    goto :goto_14

    :cond_13
    move/from16 p37, p36

    move-object/from16 p35, v1

    goto :goto_13

    :goto_14
    invoke-virtual/range {p1 .. p37}, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->copy(DDDDDDDDDDDDDDDDILjava/lang/String;II)Lcom/whoop/service/network/model/rollups/RecoveryRollups;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgHrvTrendDelta:D

    return-wide v0
.end method

.method public final component10()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxRhr:D

    return-wide v0
.end method

.method public final component11()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minHrv:D

    return-wide v0
.end method

.method public final component12()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->hrvPercentile25:D

    return-wide v0
.end method

.method public final component13()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->hrvPercentile75:D

    return-wide v0
.end method

.method public final component14()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->rhrPercentile25:D

    return-wide v0
.end method

.method public final component15()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->rhrPercentile75:D

    return-wide v0
.end method

.method public final component16()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minRhr:D

    return-wide v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->recoveryCount:I

    return v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minRecoveryScore:I

    return v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgRhrTrendDelta:D

    return-wide v0
.end method

.method public final component20()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxRecoveryScore:I

    return v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianHrvTrendDelta:D

    return-wide v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianRhrTrendDelta:D

    return-wide v0
.end method

.method public final component5()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgHrv:D

    return-wide v0
.end method

.method public final component6()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgRhr:D

    return-wide v0
.end method

.method public final component7()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxHrv:D

    return-wide v0
.end method

.method public final component8()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianHrv:D

    return-wide v0
.end method

.method public final component9()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianRhr:D

    return-wide v0
.end method

.method public final copy(DDDDDDDDDDDDDDDDILjava/lang/String;II)Lcom/whoop/service/network/model/rollups/RecoveryRollups;
    .locals 38

    const-string v0, "updatedAt"

    move-object/from16 v1, p34

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-wide/from16 v10, p9

    move-wide/from16 v12, p11

    move-wide/from16 v14, p13

    move-wide/from16 v16, p15

    move-wide/from16 v18, p17

    move-wide/from16 v20, p19

    move-wide/from16 v22, p21

    move-wide/from16 v24, p23

    move-wide/from16 v26, p25

    move-wide/from16 v28, p27

    move-wide/from16 v30, p29

    move-wide/from16 v32, p31

    move/from16 v34, p33

    move-object/from16 v35, p34

    move/from16 v36, p35

    move/from16 v37, p36

    invoke-direct/range {v1 .. v37}, Lcom/whoop/service/network/model/rollups/RecoveryRollups;-><init>(DDDDDDDDDDDDDDDDILjava/lang/String;II)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;

    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgHrvTrendDelta:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgHrvTrendDelta:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgRhrTrendDelta:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgRhrTrendDelta:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianHrvTrendDelta:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianHrvTrendDelta:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianRhrTrendDelta:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianRhrTrendDelta:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgHrv:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgHrv:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgRhr:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgRhr:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxHrv:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxHrv:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianHrv:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianHrv:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianRhr:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianRhr:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxRhr:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxRhr:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minHrv:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minHrv:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->hrvPercentile25:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->hrvPercentile25:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_d

    return v2

    :cond_d
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->hrvPercentile75:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->hrvPercentile75:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_e

    return v2

    :cond_e
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->rhrPercentile25:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->rhrPercentile25:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_f

    return v2

    :cond_f
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->rhrPercentile75:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->rhrPercentile75:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_10

    return v2

    :cond_10
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minRhr:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minRhr:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->recoveryCount:I

    iget v3, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->recoveryCount:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->updatedAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->updatedAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minRecoveryScore:I

    iget v3, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minRecoveryScore:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget v1, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxRecoveryScore:I

    iget p1, p1, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxRecoveryScore:I

    if-eq v1, p1, :cond_15

    return v2

    :cond_15
    return v0
.end method

.method public final getAvgHrv()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgHrv:D

    return-wide v0
.end method

.method public final getAvgHrvTrendDelta()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgHrvTrendDelta:D

    return-wide v0
.end method

.method public final getAvgRhr()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgRhr:D

    return-wide v0
.end method

.method public final getAvgRhrTrendDelta()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgRhrTrendDelta:D

    return-wide v0
.end method

.method public final getHrvPercentile25()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->hrvPercentile25:D

    return-wide v0
.end method

.method public final getHrvPercentile75()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->hrvPercentile75:D

    return-wide v0
.end method

.method public final getMaxHrv()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxHrv:D

    return-wide v0
.end method

.method public final getMaxRecoveryScore()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxRecoveryScore:I

    return v0
.end method

.method public final getMaxRhr()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxRhr:D

    return-wide v0
.end method

.method public final getMedianHrv()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianHrv:D

    return-wide v0
.end method

.method public final getMedianHrvTrendDelta()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianHrvTrendDelta:D

    return-wide v0
.end method

.method public final getMedianRhr()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianRhr:D

    return-wide v0
.end method

.method public final getMedianRhrTrendDelta()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianRhrTrendDelta:D

    return-wide v0
.end method

.method public final getMinHrv()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minHrv:D

    return-wide v0
.end method

.method public final getMinRecoveryScore()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minRecoveryScore:I

    return v0
.end method

.method public final getMinRhr()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minRhr:D

    return-wide v0
.end method

.method public final getRecoveryCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->recoveryCount:I

    return v0
.end method

.method public final getRhrPercentile25()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->rhrPercentile25:D

    return-wide v0
.end method

.method public final getRhrPercentile75()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->rhrPercentile75:D

    return-wide v0
.end method

.method public final getUpdatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgHrvTrendDelta:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgRhrTrendDelta:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianHrvTrendDelta:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianRhrTrendDelta:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgHrv:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgRhr:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxHrv:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianHrv:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianRhr:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxRhr:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minHrv:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->hrvPercentile25:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->hrvPercentile75:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->rhrPercentile25:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->rhrPercentile75:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minRhr:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget v2, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->recoveryCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->updatedAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minRecoveryScore:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxRecoveryScore:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 38

    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgHrvTrendDelta:D

    iget-wide v3, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgRhrTrendDelta:D

    iget-wide v5, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianHrvTrendDelta:D

    iget-wide v7, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianRhrTrendDelta:D

    iget-wide v9, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgHrv:D

    iget-wide v11, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->avgRhr:D

    iget-wide v13, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxHrv:D

    move-wide v15, v13

    iget-wide v13, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianHrv:D

    move-wide/from16 v17, v13

    iget-wide v13, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->medianRhr:D

    move-wide/from16 v19, v13

    iget-wide v13, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxRhr:D

    move-wide/from16 v21, v13

    iget-wide v13, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minHrv:D

    move-wide/from16 v23, v13

    iget-wide v13, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->hrvPercentile25:D

    move-wide/from16 v25, v13

    iget-wide v13, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->hrvPercentile75:D

    move-wide/from16 v27, v13

    iget-wide v13, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->rhrPercentile25:D

    move-wide/from16 v29, v13

    iget-wide v13, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->rhrPercentile75:D

    move-wide/from16 v31, v13

    iget-wide v13, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minRhr:D

    move-wide/from16 v33, v15

    iget v15, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->recoveryCount:I

    move/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->updatedAt:Ljava/lang/String;

    move-object/from16 v35, v15

    iget v15, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->minRecoveryScore:I

    move/from16 v36, v15

    iget v15, v0, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->maxRecoveryScore:I

    const-string v0, "RecoveryRollups(avgHrvTrendDelta="

    move/from16 v37, v15

    const-string v15, ", avgRhrTrendDelta="

    invoke-static {v0, v1, v2, v15}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", medianHrvTrendDelta="

    const-string v2, ", medianRhrTrendDelta="

    invoke-static {v0, v1, v5, v6, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", avgHrv="

    const-string v2, ", avgRhr="

    invoke-static {v0, v1, v9, v10, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v0, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", maxHrv="

    const-string v2, ", medianHrv="

    move-wide/from16 v3, v33

    invoke-static {v0, v1, v3, v4, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    move-wide/from16 v1, v17

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", medianRhr="

    const-string v2, ", maxRhr="

    move-wide/from16 v3, v19

    invoke-static {v0, v1, v3, v4, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    move-wide/from16 v1, v21

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", minHrv="

    const-string v2, ", hrvPercentile25="

    move-wide/from16 v3, v23

    invoke-static {v0, v1, v3, v4, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    move-wide/from16 v1, v25

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", hrvPercentile75="

    const-string v2, ", rhrPercentile25="

    move-wide/from16 v3, v27

    invoke-static {v0, v1, v3, v4, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    move-wide/from16 v1, v29

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", rhrPercentile75="

    const-string v2, ", minRhr="

    move-wide/from16 v3, v31

    invoke-static {v0, v1, v3, v4, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v0, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", recoveryCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", minRecoveryScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxRecoveryScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
