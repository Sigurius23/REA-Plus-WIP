.class public final Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;
.super Lio/getstream/android/video/generated/models/VideoEvent;
.source "SourceFile"

# interfaces
.implements Lio/getstream/android/video/generated/models/WSCallEvent;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000f\u0008\u0086\u0008\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0010\u0008\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0013J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ`\u0010 \u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0003\u0010\t\u001a\u00020\u00082\u0008\u0008\u0003\u0010\n\u001a\u00020\u00032\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0010\u0008\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u0013J\u0010\u0010$\u001a\u00020#H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010(\u001a\u00020\u000b2\u0008\u0010\'\u001a\u0004\u0018\u00010&H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010*\u001a\u0004\u0008+\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010,\u001a\u0004\u0008-\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010*\u001a\u0004\u0008.\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010/\u001a\u0004\u00080\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010*\u001a\u0004\u00081\u0010\u0013R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00102\u001a\u0004\u0008\u000c\u0010\u001dR\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u00103\u001a\u0004\u00084\u0010\u001f\u00a8\u00065"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;",
        "Lio/getstream/android/video/generated/models/VideoEvent;",
        "Lio/getstream/android/video/generated/models/WSCallEvent;",
        "",
        "callCid",
        "Ljg3/i;",
        "createdAt",
        "sessionId",
        "Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;",
        "counts",
        "type",
        "",
        "isTrimmed",
        "",
        "Lio/getstream/android/video/generated/models/CallStatsParticipant;",
        "participantsOverview",
        "<init>",
        "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V",
        "getEventType",
        "()Ljava/lang/String;",
        "getCallCID",
        "component1",
        "component2",
        "()Ljg3/i;",
        "component3",
        "component4",
        "()Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;",
        "component5",
        "component6",
        "()Ljava/lang/Boolean;",
        "component7",
        "()Ljava/util/List;",
        "copy",
        "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;",
        "toString",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getCallCid",
        "Ljg3/i;",
        "getCreatedAt",
        "getSessionId",
        "Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;",
        "getCounts",
        "getType",
        "Ljava/lang/Boolean;",
        "Ljava/util/List;",
        "getParticipantsOverview",
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

.field private final counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

.field private final createdAt:Ljg3/i;

.field private final isTrimmed:Ljava/lang/Boolean;

.field private final participantsOverview:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallStatsParticipant;",
            ">;"
        }
    .end annotation
.end field

.field private final sessionId:Ljava/lang/String;

.field private final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_cid"
        .end annotation
    .end param
    .param p2    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "session_id"
        .end annotation
    .end param
    .param p4    # Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;
        .annotation runtime Lqx/q;
            name = "counts"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "is_trimmed"
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "participants_overview"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallStatsParticipant;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callCid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "counts"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lio/getstream/android/video/generated/models/VideoEvent;-><init>()V

    .line 4
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->callCid:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->createdAt:Ljg3/i;

    .line 6
    iput-object p3, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->sessionId:Ljava/lang/String;

    .line 7
    iput-object p4, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    .line 8
    iput-object p5, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->type:Ljava/lang/String;

    .line 9
    iput-object p6, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->isTrimmed:Ljava/lang/Boolean;

    .line 10
    iput-object p7, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->participantsOverview:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_0

    const/4 p6, 0x0

    :cond_0
    move-object v6, p6

    and-int/lit8 p6, p8, 0x40

    if-eqz p6, :cond_1

    .line 1
    sget-object p6, Lm83/y;->w:Lm83/y;

    move-object v7, p6

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    goto :goto_1

    :cond_1
    move-object v7, p7

    goto :goto_0

    .line 2
    :goto_1
    invoke-direct/range {v0 .. v7}, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;-><init>(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->callCid:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->createdAt:Ljg3/i;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->sessionId:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->type:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->isTrimmed:Ljava/lang/Boolean;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->participantsOverview:Ljava/util/List;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->copy(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->isTrimmed:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallStatsParticipant;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->participantsOverview:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_cid"
        .end annotation
    .end param
    .param p2    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "session_id"
        .end annotation
    .end param
    .param p4    # Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;
        .annotation runtime Lqx/q;
            name = "counts"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "is_trimmed"
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "participants_overview"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallStatsParticipant;",
            ">;)",
            "Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;"
        }
    .end annotation

    const-string v0, "callCid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "counts"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;-><init>(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->callCid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->callCid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->createdAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->createdAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->sessionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->sessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->isTrimmed:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->isTrimmed:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->participantsOverview:Ljava/util/List;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->participantsOverview:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public getCallCID()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCounts()Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    return-object v0
.end method

.method public final getCreatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public getEventType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getParticipantsOverview()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallStatsParticipant;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->participantsOverview:Ljava/util/List;

    return-object v0
.end method

.method public final getSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->callCid:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->createdAt:Ljg3/i;

    invoke-static {v2, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->sessionId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->type:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->isTrimmed:Ljava/lang/Boolean;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->participantsOverview:Ljava/util/List;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public final isTrimmed()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->isTrimmed:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->callCid:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->createdAt:Ljg3/i;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->sessionId:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->counts:Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->type:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->isTrimmed:Ljava/lang/Boolean;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;->participantsOverview:Ljava/util/List;

    const-string v7, ", createdAt="

    const-string v8, ", sessionId="

    const-string v9, "CallStatsReportReadyEvent(callCid="

    invoke-static {v9, v1, v0, v7, v8}, Lr;->p(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", counts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isTrimmed="

    const-string v2, ", participantsOverview="

    invoke-static {v5, v4, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ")"

    invoke-static {v0, v6, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
