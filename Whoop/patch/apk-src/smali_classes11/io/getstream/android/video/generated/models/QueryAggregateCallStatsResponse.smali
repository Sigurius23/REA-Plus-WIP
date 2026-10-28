.class public final Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bc\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003Jg\u0010+\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\r2\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\t\u00101\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"\u00a8\u00062"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;",
        "",
        "duration",
        "",
        "callDurationReport",
        "Lio/getstream/android/video/generated/models/CallDurationReportResponse;",
        "callParticipantCountReport",
        "Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;",
        "callsPerDayReport",
        "Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;",
        "networkMetricsReport",
        "Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;",
        "qualityScoreReport",
        "Lio/getstream/android/video/generated/models/QualityScoreReportResponse;",
        "sdkUsageReport",
        "Lio/getstream/android/video/generated/models/SDKUsageReportResponse;",
        "userFeedbackReport",
        "Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;",
        "(Ljava/lang/String;Lio/getstream/android/video/generated/models/CallDurationReportResponse;Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;Lio/getstream/android/video/generated/models/QualityScoreReportResponse;Lio/getstream/android/video/generated/models/SDKUsageReportResponse;Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;)V",
        "getCallDurationReport",
        "()Lio/getstream/android/video/generated/models/CallDurationReportResponse;",
        "getCallParticipantCountReport",
        "()Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;",
        "getCallsPerDayReport",
        "()Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;",
        "getDuration",
        "()Ljava/lang/String;",
        "getNetworkMetricsReport",
        "()Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;",
        "getQualityScoreReport",
        "()Lio/getstream/android/video/generated/models/QualityScoreReportResponse;",
        "getSdkUsageReport",
        "()Lio/getstream/android/video/generated/models/SDKUsageReportResponse;",
        "getUserFeedbackReport",
        "()Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final callDurationReport:Lio/getstream/android/video/generated/models/CallDurationReportResponse;

.field private final callParticipantCountReport:Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;

.field private final callsPerDayReport:Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;

.field private final duration:Ljava/lang/String;

.field private final networkMetricsReport:Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;

.field private final qualityScoreReport:Lio/getstream/android/video/generated/models/QualityScoreReportResponse;

.field private final sdkUsageReport:Lio/getstream/android/video/generated/models/SDKUsageReportResponse;

.field private final userFeedbackReport:Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/getstream/android/video/generated/models/CallDurationReportResponse;Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;Lio/getstream/android/video/generated/models/QualityScoreReportResponse;Lio/getstream/android/video/generated/models/SDKUsageReportResponse;Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "duration"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/CallDurationReportResponse;
        .annotation runtime Lqx/q;
            name = "call_duration_report"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;
        .annotation runtime Lqx/q;
            name = "call_participant_count_report"
        .end annotation
    .end param
    .param p4    # Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;
        .annotation runtime Lqx/q;
            name = "calls_per_day_report"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;
        .annotation runtime Lqx/q;
            name = "network_metrics_report"
        .end annotation
    .end param
    .param p6    # Lio/getstream/android/video/generated/models/QualityScoreReportResponse;
        .annotation runtime Lqx/q;
            name = "quality_score_report"
        .end annotation
    .end param
    .param p7    # Lio/getstream/android/video/generated/models/SDKUsageReportResponse;
        .annotation runtime Lqx/q;
            name = "sdk_usage_report"
        .end annotation
    .end param
    .param p8    # Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;
        .annotation runtime Lqx/q;
            name = "user_feedback_report"
        .end annotation
    .end param

    const-string v0, "duration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->duration:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callDurationReport:Lio/getstream/android/video/generated/models/CallDurationReportResponse;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callParticipantCountReport:Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callsPerDayReport:Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->networkMetricsReport:Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;

    .line 7
    iput-object p6, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->qualityScoreReport:Lio/getstream/android/video/generated/models/QualityScoreReportResponse;

    .line 8
    iput-object p7, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->sdkUsageReport:Lio/getstream/android/video/generated/models/SDKUsageReportResponse;

    .line 9
    iput-object p8, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->userFeedbackReport:Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lio/getstream/android/video/generated/models/CallDurationReportResponse;Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;Lio/getstream/android/video/generated/models/QualityScoreReportResponse;Lio/getstream/android/video/generated/models/SDKUsageReportResponse;Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x2

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_4

    move-object p6, v0

    :cond_4
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_5

    move-object p7, v0

    :cond_5
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_6

    move-object p9, v0

    :goto_0
    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move-object p9, p8

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p9}, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;-><init>(Ljava/lang/String;Lio/getstream/android/video/generated/models/CallDurationReportResponse;Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;Lio/getstream/android/video/generated/models/QualityScoreReportResponse;Lio/getstream/android/video/generated/models/SDKUsageReportResponse;Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallDurationReportResponse;Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;Lio/getstream/android/video/generated/models/QualityScoreReportResponse;Lio/getstream/android/video/generated/models/SDKUsageReportResponse;Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->duration:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callDurationReport:Lio/getstream/android/video/generated/models/CallDurationReportResponse;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callParticipantCountReport:Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callsPerDayReport:Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->networkMetricsReport:Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->qualityScoreReport:Lio/getstream/android/video/generated/models/QualityScoreReportResponse;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->sdkUsageReport:Lio/getstream/android/video/generated/models/SDKUsageReportResponse;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->userFeedbackReport:Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->copy(Ljava/lang/String;Lio/getstream/android/video/generated/models/CallDurationReportResponse;Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;Lio/getstream/android/video/generated/models/QualityScoreReportResponse;Lio/getstream/android/video/generated/models/SDKUsageReportResponse;Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;)Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->duration:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lio/getstream/android/video/generated/models/CallDurationReportResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callDurationReport:Lio/getstream/android/video/generated/models/CallDurationReportResponse;

    return-object v0
.end method

.method public final component3()Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callParticipantCountReport:Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;

    return-object v0
.end method

.method public final component4()Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callsPerDayReport:Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;

    return-object v0
.end method

.method public final component5()Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->networkMetricsReport:Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;

    return-object v0
.end method

.method public final component6()Lio/getstream/android/video/generated/models/QualityScoreReportResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->qualityScoreReport:Lio/getstream/android/video/generated/models/QualityScoreReportResponse;

    return-object v0
.end method

.method public final component7()Lio/getstream/android/video/generated/models/SDKUsageReportResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->sdkUsageReport:Lio/getstream/android/video/generated/models/SDKUsageReportResponse;

    return-object v0
.end method

.method public final component8()Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->userFeedbackReport:Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lio/getstream/android/video/generated/models/CallDurationReportResponse;Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;Lio/getstream/android/video/generated/models/QualityScoreReportResponse;Lio/getstream/android/video/generated/models/SDKUsageReportResponse;Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;)Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "duration"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/CallDurationReportResponse;
        .annotation runtime Lqx/q;
            name = "call_duration_report"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;
        .annotation runtime Lqx/q;
            name = "call_participant_count_report"
        .end annotation
    .end param
    .param p4    # Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;
        .annotation runtime Lqx/q;
            name = "calls_per_day_report"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;
        .annotation runtime Lqx/q;
            name = "network_metrics_report"
        .end annotation
    .end param
    .param p6    # Lio/getstream/android/video/generated/models/QualityScoreReportResponse;
        .annotation runtime Lqx/q;
            name = "quality_score_report"
        .end annotation
    .end param
    .param p7    # Lio/getstream/android/video/generated/models/SDKUsageReportResponse;
        .annotation runtime Lqx/q;
            name = "sdk_usage_report"
        .end annotation
    .end param
    .param p8    # Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;
        .annotation runtime Lqx/q;
            name = "user_feedback_report"
        .end annotation
    .end param

    const-string v0, "duration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;-><init>(Ljava/lang/String;Lio/getstream/android/video/generated/models/CallDurationReportResponse;Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;Lio/getstream/android/video/generated/models/QualityScoreReportResponse;Lio/getstream/android/video/generated/models/SDKUsageReportResponse;Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->duration:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->duration:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callDurationReport:Lio/getstream/android/video/generated/models/CallDurationReportResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callDurationReport:Lio/getstream/android/video/generated/models/CallDurationReportResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callParticipantCountReport:Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callParticipantCountReport:Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callsPerDayReport:Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callsPerDayReport:Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->networkMetricsReport:Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->networkMetricsReport:Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->qualityScoreReport:Lio/getstream/android/video/generated/models/QualityScoreReportResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->qualityScoreReport:Lio/getstream/android/video/generated/models/QualityScoreReportResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->sdkUsageReport:Lio/getstream/android/video/generated/models/SDKUsageReportResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->sdkUsageReport:Lio/getstream/android/video/generated/models/SDKUsageReportResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->userFeedbackReport:Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->userFeedbackReport:Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getCallDurationReport()Lio/getstream/android/video/generated/models/CallDurationReportResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callDurationReport:Lio/getstream/android/video/generated/models/CallDurationReportResponse;

    return-object v0
.end method

.method public final getCallParticipantCountReport()Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callParticipantCountReport:Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;

    return-object v0
.end method

.method public final getCallsPerDayReport()Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callsPerDayReport:Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;

    return-object v0
.end method

.method public final getDuration()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->duration:Ljava/lang/String;

    return-object v0
.end method

.method public final getNetworkMetricsReport()Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->networkMetricsReport:Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;

    return-object v0
.end method

.method public final getQualityScoreReport()Lio/getstream/android/video/generated/models/QualityScoreReportResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->qualityScoreReport:Lio/getstream/android/video/generated/models/QualityScoreReportResponse;

    return-object v0
.end method

.method public final getSdkUsageReport()Lio/getstream/android/video/generated/models/SDKUsageReportResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->sdkUsageReport:Lio/getstream/android/video/generated/models/SDKUsageReportResponse;

    return-object v0
.end method

.method public final getUserFeedbackReport()Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->userFeedbackReport:Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->duration:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callDurationReport:Lio/getstream/android/video/generated/models/CallDurationReportResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/CallDurationReportResponse;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callParticipantCountReport:Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callsPerDayReport:Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->networkMetricsReport:Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->qualityScoreReport:Lio/getstream/android/video/generated/models/QualityScoreReportResponse;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/QualityScoreReportResponse;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->sdkUsageReport:Lio/getstream/android/video/generated/models/SDKUsageReportResponse;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/SDKUsageReportResponse;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->userFeedbackReport:Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->duration:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callDurationReport:Lio/getstream/android/video/generated/models/CallDurationReportResponse;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callParticipantCountReport:Lio/getstream/android/video/generated/models/CallParticipantCountReportResponse;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->callsPerDayReport:Lio/getstream/android/video/generated/models/CallsPerDayReportResponse;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->networkMetricsReport:Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->qualityScoreReport:Lio/getstream/android/video/generated/models/QualityScoreReportResponse;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->sdkUsageReport:Lio/getstream/android/video/generated/models/SDKUsageReportResponse;

    iget-object v7, p0, Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;->userFeedbackReport:Lio/getstream/android/video/generated/models/UserFeedbackReportResponse;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "QueryAggregateCallStatsResponse(duration="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", callDurationReport="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", callParticipantCountReport="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", callsPerDayReport="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", networkMetricsReport="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", qualityScoreReport="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sdkUsageReport="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", userFeedbackReport="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
