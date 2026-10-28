.class public final Lio/getstream/android/video/generated/models/CallStatsSessionResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0086\u0008\u0018\u00002\u00020\u0001BQ\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008\u0012\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0013JZ\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0003\u0010\t\u001a\u00020\u00082\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u00062\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008 \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\"\u001a\u0004\u0008#\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\"\u001a\u0004\u0008$\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\"\u001a\u0004\u0008%\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010&\u001a\u0004\u0008\'\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010(\u001a\u0004\u0008)\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010&\u001a\u0004\u0008*\u0010\u0013R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010&\u001a\u0004\u0008+\u0010\u0013\u00a8\u0006,"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallStatsSessionResponse;",
        "",
        "",
        "callId",
        "callSessionId",
        "callType",
        "Ljg3/i;",
        "generatedAt",
        "Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;",
        "counts",
        "callEndedAt",
        "callStartedAt",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Ljg3/i;",
        "component5",
        "()Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;",
        "component6",
        "component7",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;)Lio/getstream/android/video/generated/models/CallStatsSessionResponse;",
        "toString",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getCallId",
        "getCallSessionId",
        "getCallType",
        "Ljg3/i;",
        "getGeneratedAt",
        "Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;",
        "getCounts",
        "getCallEndedAt",
        "getCallStartedAt",
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
.field private final callEndedAt:Ljg3/i;

.field private final callId:Ljava/lang/String;

.field private final callSessionId:Ljava/lang/String;

.field private final callStartedAt:Ljg3/i;

.field private final callType:Ljava/lang/String;

.field private final counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

.field private final generatedAt:Ljg3/i;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;)V
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
    .param p4    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "generated_at"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;
        .annotation runtime Lqx/q;
            name = "counts"
        .end annotation
    .end param
    .param p6    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "call_ended_at"
        .end annotation
    .end param
    .param p7    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "call_started_at"
        .end annotation
    .end param

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callSessionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "generatedAt"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "counts"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callSessionId:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callType:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->generatedAt:Ljg3/i;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    .line 7
    iput-object p6, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callEndedAt:Ljg3/i;

    .line 8
    iput-object p7, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callStartedAt:Ljg3/i;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x20

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p6, v0

    :cond_0
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_1

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move-object p8, p7

    goto :goto_0

    .line 9
    :goto_1
    invoke-direct/range {p1 .. p8}, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallStatsSessionResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallStatsSessionResponse;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callSessionId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callType:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->generatedAt:Ljg3/i;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callEndedAt:Ljg3/i;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callStartedAt:Ljg3/i;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;)Lio/getstream/android/video/generated/models/CallStatsSessionResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callType:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->generatedAt:Ljg3/i;

    return-object v0
.end method

.method public final component5()Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    return-object v0
.end method

.method public final component6()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callEndedAt:Ljg3/i;

    return-object v0
.end method

.method public final component7()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callStartedAt:Ljg3/i;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;)Lio/getstream/android/video/generated/models/CallStatsSessionResponse;
    .locals 9
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
    .param p4    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "generated_at"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;
        .annotation runtime Lqx/q;
            name = "counts"
        .end annotation
    .end param
    .param p6    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "call_ended_at"
        .end annotation
    .end param
    .param p7    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "call_started_at"
        .end annotation
    .end param

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callSessionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "generatedAt"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "counts"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callSessionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callSessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callType:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->generatedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->generatedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callEndedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callEndedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callStartedAt:Ljg3/i;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callStartedAt:Ljg3/i;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCallEndedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callEndedAt:Ljg3/i;

    return-object v0
.end method

.method public final getCallId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallStartedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callStartedAt:Ljg3/i;

    return-object v0
.end method

.method public final getCallType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callType:Ljava/lang/String;

    return-object v0
.end method

.method public final getCounts()Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    return-object v0
.end method

.method public final getGeneratedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->generatedAt:Ljg3/i;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callSessionId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->generatedAt:Ljg3/i;

    invoke-static {v2, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callEndedAt:Ljg3/i;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljg3/i;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callStartedAt:Ljg3/i;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljg3/i;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callId:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callSessionId:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->generatedAt:Ljg3/i;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callEndedAt:Ljg3/i;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/CallStatsSessionResponse;->callStartedAt:Ljg3/i;

    const-string v7, ", callSessionId="

    const-string v8, ", callType="

    const-string v9, "CallStatsSessionResponse(callId="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", generatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", counts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", callEndedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", callStartedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
