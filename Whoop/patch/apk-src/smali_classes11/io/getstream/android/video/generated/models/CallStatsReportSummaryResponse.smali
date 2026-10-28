.class public final Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0086\u0008\u0018\u00002\u00020\u0001B]\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008\u0012\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019Jf\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0003\u0010\t\u001a\u00020\u00082\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u0012J\u001a\u0010!\u001a\u00020 2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010#\u001a\u0004\u0008$\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010%\u001a\u0004\u0008&\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010#\u001a\u0004\u0008\'\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010#\u001a\u0004\u0008(\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010)\u001a\u0004\u0008*\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010)\u001a\u0004\u0008+\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010,\u001a\u0004\u0008-\u0010\u0019R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010,\u001a\u0004\u0008.\u0010\u0019\u00a8\u0006/"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;",
        "",
        "",
        "callCid",
        "",
        "callDurationSeconds",
        "callSessionId",
        "callStatus",
        "Ljg3/i;",
        "firstStatsTime",
        "createdAt",
        "minUserRating",
        "qualityScore",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/Integer;Ljava/lang/Integer;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()I",
        "component3",
        "component4",
        "component5",
        "()Ljg3/i;",
        "component6",
        "component7",
        "()Ljava/lang/Integer;",
        "component8",
        "copy",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getCallCid",
        "I",
        "getCallDurationSeconds",
        "getCallSessionId",
        "getCallStatus",
        "Ljg3/i;",
        "getFirstStatsTime",
        "getCreatedAt",
        "Ljava/lang/Integer;",
        "getMinUserRating",
        "getQualityScore",
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
.field private final callCid:Ljava/lang/String;

.field private final callDurationSeconds:I

.field private final callSessionId:Ljava/lang/String;

.field private final callStatus:Ljava/lang/String;

.field private final createdAt:Ljg3/i;

.field private final firstStatsTime:Ljg3/i;

.field private final minUserRating:Ljava/lang/Integer;

.field private final qualityScore:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_cid"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lqx/q;
            name = "call_duration_seconds"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_session_id"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_status"
        .end annotation
    .end param
    .param p5    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "first_stats_time"
        .end annotation
    .end param
    .param p6    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p7    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "min_user_rating"
        .end annotation
    .end param
    .param p8    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "quality_score"
        .end annotation
    .end param

    const-string v0, "callCid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callSessionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callStatus"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firstStatsTime"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callCid:Ljava/lang/String;

    .line 3
    iput p2, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callDurationSeconds:I

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callSessionId:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callStatus:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->firstStatsTime:Ljg3/i;

    .line 7
    iput-object p6, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->createdAt:Ljg3/i;

    .line 8
    iput-object p7, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->minUserRating:Ljava/lang/Integer;

    .line 9
    iput-object p8, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->qualityScore:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x20

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move-object p6, v0

    :cond_0
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_1

    move-object p7, v0

    :cond_1
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_2

    move-object p9, v0

    :goto_0
    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p9, p8

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p9}, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callCid:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget p2, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callDurationSeconds:I

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callSessionId:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callStatus:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->firstStatsTime:Ljg3/i;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->createdAt:Ljg3/i;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->minUserRating:Ljava/lang/Integer;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->qualityScore:Ljava/lang/Integer;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->copy(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callDurationSeconds:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->firstStatsTime:Ljg3/i;

    return-object v0
.end method

.method public final component6()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final component7()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->minUserRating:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component8()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->qualityScore:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_cid"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lqx/q;
            name = "call_duration_seconds"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_session_id"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_status"
        .end annotation
    .end param
    .param p5    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "first_stats_time"
        .end annotation
    .end param
    .param p6    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p7    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "min_user_rating"
        .end annotation
    .end param
    .param p8    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "quality_score"
        .end annotation
    .end param

    const-string v0, "callCid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callSessionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callStatus"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firstStatsTime"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callCid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callCid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callDurationSeconds:I

    iget v3, p1, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callDurationSeconds:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callSessionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callSessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callStatus:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callStatus:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->firstStatsTime:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->firstStatsTime:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->createdAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->createdAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->minUserRating:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->minUserRating:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->qualityScore:Ljava/lang/Integer;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->qualityScore:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getCallCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallDurationSeconds()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callDurationSeconds:I

    return v0
.end method

.method public final getCallSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final getFirstStatsTime()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->firstStatsTime:Ljg3/i;

    return-object v0
.end method

.method public final getMinUserRating()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->minUserRating:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getQualityScore()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->qualityScore:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callCid:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callDurationSeconds:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callSessionId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callStatus:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->firstStatsTime:Ljg3/i;

    invoke-static {v2, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->createdAt:Ljg3/i;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljg3/i;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->minUserRating:Ljava/lang/Integer;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->qualityScore:Ljava/lang/Integer;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callCid:Ljava/lang/String;

    iget v1, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callDurationSeconds:I

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callSessionId:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->callStatus:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->firstStatsTime:Ljg3/i;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->createdAt:Ljg3/i;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->minUserRating:Ljava/lang/Integer;

    iget-object v7, p0, Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;->qualityScore:Ljava/lang/Integer;

    const-string v8, ", callDurationSeconds="

    const-string v9, ", callSessionId="

    const-string v10, "CallStatsReportSummaryResponse(callCid="

    invoke-static {v1, v10, v0, v8, v9}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", callStatus="

    const-string v8, ", firstStatsTime="

    invoke-static {v0, v2, v1, v3, v8}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", minUserRating="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", qualityScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
