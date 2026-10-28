.class public final Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bq\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003Ju\u0010+\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00032\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\t\u00101\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0013R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0013\u00a8\u00062"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;",
        "",
        "callId",
        "",
        "callSessionId",
        "callType",
        "duration",
        "userId",
        "userSessionId",
        "publisher",
        "Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;",
        "subscriber",
        "Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;",
        "timeframe",
        "Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;",
        "user",
        "Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;)V",
        "getCallId",
        "()Ljava/lang/String;",
        "getCallSessionId",
        "getCallType",
        "getDuration",
        "getPublisher",
        "()Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;",
        "getSubscriber",
        "()Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;",
        "getTimeframe",
        "()Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;",
        "getUser",
        "()Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;",
        "getUserId",
        "getUserSessionId",
        "component1",
        "component10",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
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
.field private final callId:Ljava/lang/String;

.field private final callSessionId:Ljava/lang/String;

.field private final callType:Ljava/lang/String;

.field private final duration:Ljava/lang/String;

.field private final publisher:Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;

.field private final subscriber:Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;

.field private final timeframe:Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;

.field private final user:Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;

.field private final userId:Ljava/lang/String;

.field private final userSessionId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_session_id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_type"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "duration"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_id"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_session_id"
        .end annotation
    .end param
    .param p7    # Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;
        .annotation runtime Lqx/q;
            name = "publisher"
        .end annotation
    .end param
    .param p8    # Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;
        .annotation runtime Lqx/q;
            name = "subscriber"
        .end annotation
    .end param
    .param p9    # Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;
        .annotation runtime Lqx/q;
            name = "timeframe"
        .end annotation
    .end param
    .param p10    # Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;
        .annotation runtime Lqx/q;
            name = "user"
        .end annotation
    .end param

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callSessionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "duration"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userSessionId"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callSessionId:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callType:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->duration:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->userId:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->userSessionId:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->publisher:Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;

    .line 9
    iput-object p8, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->subscriber:Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;

    .line 10
    iput-object p9, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->timeframe:Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;

    .line 11
    iput-object p10, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->user:Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p11, 0x40

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move-object p7, v0

    :cond_0
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_1

    move-object p8, v0

    :cond_1
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_2

    move-object p9, v0

    :cond_2
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_3

    move-object p11, v0

    :goto_0
    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_3
    move-object p11, p10

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {p1 .. p11}, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callSessionId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callType:Ljava/lang/String;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->duration:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->userId:Ljava/lang/String;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->userSessionId:Ljava/lang/String;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->publisher:Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->subscriber:Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->timeframe:Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->user:Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;)Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->user:Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callType:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->duration:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->userSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->publisher:Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;

    return-object v0
.end method

.method public final component8()Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->subscriber:Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;

    return-object v0
.end method

.method public final component9()Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->timeframe:Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;)Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;
    .locals 12
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_session_id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_type"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "duration"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_id"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_session_id"
        .end annotation
    .end param
    .param p7    # Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;
        .annotation runtime Lqx/q;
            name = "publisher"
        .end annotation
    .end param
    .param p8    # Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;
        .annotation runtime Lqx/q;
            name = "subscriber"
        .end annotation
    .end param
    .param p9    # Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;
        .annotation runtime Lqx/q;
            name = "timeframe"
        .end annotation
    .end param
    .param p10    # Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;
        .annotation runtime Lqx/q;
            name = "user"
        .end annotation
    .end param

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callSessionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "duration"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userSessionId"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callSessionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callSessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callType:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->duration:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->duration:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->userId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->userId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->userSessionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->userSessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->publisher:Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->publisher:Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->subscriber:Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->subscriber:Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->timeframe:Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->timeframe:Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->user:Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->user:Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getCallId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callType:Ljava/lang/String;

    return-object v0
.end method

.method public final getDuration()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->duration:Ljava/lang/String;

    return-object v0
.end method

.method public final getPublisher()Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->publisher:Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;

    return-object v0
.end method

.method public final getSubscriber()Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->subscriber:Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;

    return-object v0
.end method

.method public final getTimeframe()Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->timeframe:Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;

    return-object v0
.end method

.method public final getUser()Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->user:Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;

    return-object v0
.end method

.method public final getUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->userSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callSessionId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->duration:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->userId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->userSessionId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->publisher:Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->subscriber:Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->timeframe:Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->user:Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callId:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callSessionId:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->callType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->duration:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->userId:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->userSessionId:Ljava/lang/String;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->publisher:Lio/getstream/android/video/generated/models/ParticipantSeriesPublisherStats;

    iget-object v7, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->subscriber:Lio/getstream/android/video/generated/models/ParticipantSeriesSubscriberStats;

    iget-object v8, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->timeframe:Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;

    iget-object v9, p0, Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;->user:Lio/getstream/android/video/generated/models/ParticipantSeriesUserStats;

    const-string v10, ", callSessionId="

    const-string v11, ", callType="

    const-string v12, "GetCallSessionParticipantStatsDetailsResponse(callId="

    invoke-static {v12, v0, v10, v1, v11}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", duration="

    const-string v10, ", userId="

    invoke-static {v0, v2, v1, v3, v10}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", userSessionId="

    const-string v2, ", publisher="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subscriber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timeframe="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", user="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
