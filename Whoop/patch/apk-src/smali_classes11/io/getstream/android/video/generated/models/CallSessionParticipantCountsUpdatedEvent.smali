.class public final Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;
.super Lio/getstream/android/video/generated/models/VideoEvent;
.source "SourceFile"

# interfaces
.implements Lio/getstream/android/video/generated/models/WSCallEvent;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0086\u0008\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0005\u0012\u0014\u0008\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\n\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0010J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0010JX\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0003\u0010\t\u001a\u00020\u00052\u0014\u0008\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\n2\u0008\u0008\u0003\u0010\u000c\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u0013J\u001a\u0010\"\u001a\u00020!2\u0008\u0010 \u001a\u0004\u0018\u00010\u001fH\u00d6\u0003\u00a2\u0006\u0004\u0008\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010$\u001a\u0004\u0008%\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010&\u001a\u0004\u0008\'\u0010\u0010R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010(\u001a\u0004\u0008)\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010&\u001a\u0004\u0008*\u0010\u0010R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010+\u001a\u0004\u0008,\u0010\u0019R\u0017\u0010\u000c\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010&\u001a\u0004\u0008-\u0010\u0010\u00a8\u0006."
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;",
        "Lio/getstream/android/video/generated/models/VideoEvent;",
        "Lio/getstream/android/video/generated/models/WSCallEvent;",
        "",
        "anonymousParticipantCount",
        "",
        "callCid",
        "Ljg3/i;",
        "createdAt",
        "sessionId",
        "",
        "participantsCountByRole",
        "type",
        "<init>",
        "(ILjava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V",
        "getEventType",
        "()Ljava/lang/String;",
        "getCallCID",
        "component1",
        "()I",
        "component2",
        "component3",
        "()Ljg3/i;",
        "component4",
        "component5",
        "()Ljava/util/Map;",
        "component6",
        "copy",
        "(ILjava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getAnonymousParticipantCount",
        "Ljava/lang/String;",
        "getCallCid",
        "Ljg3/i;",
        "getCreatedAt",
        "getSessionId",
        "Ljava/util/Map;",
        "getParticipantsCountByRole",
        "getType",
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
.field private final anonymousParticipantCount:I

.field private final callCid:Ljava/lang/String;

.field private final createdAt:Ljg3/i;

.field private final participantsCountByRole:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final sessionId:Ljava/lang/String;

.field private final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V
    .locals 1
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "anonymous_participant_count"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_cid"
        .end annotation
    .end param
    .param p3    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "session_id"
        .end annotation
    .end param
    .param p5    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "participants_count_by_role"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "callCid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participantsCountByRole"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lio/getstream/android/video/generated/models/VideoEvent;-><init>()V

    .line 4
    iput p1, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->anonymousParticipantCount:I

    .line 5
    iput-object p2, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->callCid:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->createdAt:Ljg3/i;

    .line 7
    iput-object p4, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->sessionId:Ljava/lang/String;

    .line 8
    iput-object p5, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->participantsCountByRole:Ljava/util/Map;

    .line 9
    iput-object p6, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->type:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_0

    .line 1
    sget-object p5, Lm83/z;->w:Lm83/z;

    :cond_0
    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 2
    invoke-direct/range {v0 .. v6}, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;-><init>(ILjava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;ILjava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->anonymousParticipantCount:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->callCid:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->createdAt:Ljg3/i;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->sessionId:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->participantsCountByRole:Ljava/util/Map;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->type:Ljava/lang/String;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->copy(ILjava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->anonymousParticipantCount:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->participantsCountByRole:Ljava/util/Map;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;
    .locals 8
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "anonymous_participant_count"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_cid"
        .end annotation
    .end param
    .param p3    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "session_id"
        .end annotation
    .end param
    .param p5    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "participants_count_by_role"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;"
        }
    .end annotation

    const-string v0, "callCid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participantsCountByRole"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;-><init>(ILjava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;

    iget v1, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->anonymousParticipantCount:I

    iget v3, p1, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->anonymousParticipantCount:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->callCid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->callCid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->createdAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->createdAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->sessionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->sessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->participantsCountByRole:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->participantsCountByRole:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->type:Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->type:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAnonymousParticipantCount()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->anonymousParticipantCount:I

    return v0
.end method

.method public getCallCID()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public getEventType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getParticipantsCountByRole()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->participantsCountByRole:Ljava/util/Map;

    return-object v0
.end method

.method public final getSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->anonymousParticipantCount:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->callCid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->createdAt:Ljg3/i;

    invoke-static {v2, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->sessionId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->participantsCountByRole:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->type:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget v0, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->anonymousParticipantCount:I

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->callCid:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->createdAt:Ljg3/i;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->sessionId:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->participantsCountByRole:Ljava/util/Map;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->type:Ljava/lang/String;

    const-string v6, ", callCid="

    const-string v7, ", createdAt="

    const-string v8, "CallSessionParticipantCountsUpdatedEvent(anonymousParticipantCount="

    invoke-static {v0, v8, v6, v1, v7}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sessionId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", participantsCountByRole="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
