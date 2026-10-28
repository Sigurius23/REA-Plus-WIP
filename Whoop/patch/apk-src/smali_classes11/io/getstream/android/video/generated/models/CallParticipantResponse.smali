.class public final Lio/getstream/android/video/generated/models/CallParticipantResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u000cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u001e\u001a\u0004\u0008\u001f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u001e\u001a\u0004\u0008 \u0010\u000eR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010!\u001a\u0004\u0008\"\u0010\u0011\u00a8\u0006#"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallParticipantResponse;",
        "",
        "Ljg3/i;",
        "joinedAt",
        "",
        "role",
        "userSessionId",
        "Lio/getstream/android/video/generated/models/UserResponse;",
        "user",
        "<init>",
        "(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;)V",
        "component1",
        "()Ljg3/i;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "()Lio/getstream/android/video/generated/models/UserResponse;",
        "copy",
        "(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;)Lio/getstream/android/video/generated/models/CallParticipantResponse;",
        "toString",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljg3/i;",
        "getJoinedAt",
        "Ljava/lang/String;",
        "getRole",
        "getUserSessionId",
        "Lio/getstream/android/video/generated/models/UserResponse;",
        "getUser",
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
.field private final joinedAt:Ljg3/i;

.field private final role:Ljava/lang/String;

.field private final user:Lio/getstream/android/video/generated/models/UserResponse;

.field private final userSessionId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;)V
    .locals 1
    .param p1    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "joined_at"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "role"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_session_id"
        .end annotation
    .end param
    .param p4    # Lio/getstream/android/video/generated/models/UserResponse;
        .annotation runtime Lqx/q;
            name = "user"
        .end annotation
    .end param

    const-string v0, "joinedAt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "role"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userSessionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->joinedAt:Ljg3/i;

    iput-object p2, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->role:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->userSessionId:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->user:Lio/getstream/android/video/generated/models/UserResponse;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallParticipantResponse;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallParticipantResponse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->joinedAt:Ljg3/i;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->role:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->userSessionId:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->user:Lio/getstream/android/video/generated/models/UserResponse;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/CallParticipantResponse;->copy(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;)Lio/getstream/android/video/generated/models/CallParticipantResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->joinedAt:Ljg3/i;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->userSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lio/getstream/android/video/generated/models/UserResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->user:Lio/getstream/android/video/generated/models/UserResponse;

    return-object v0
.end method

.method public final copy(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;)Lio/getstream/android/video/generated/models/CallParticipantResponse;
    .locals 1
    .param p1    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "joined_at"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "role"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_session_id"
        .end annotation
    .end param
    .param p4    # Lio/getstream/android/video/generated/models/UserResponse;
        .annotation runtime Lqx/q;
            name = "user"
        .end annotation
    .end param

    const-string v0, "joinedAt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "role"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userSessionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/android/video/generated/models/CallParticipantResponse;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/CallParticipantResponse;-><init>(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallParticipantResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallParticipantResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->joinedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallParticipantResponse;->joinedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->role:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallParticipantResponse;->role:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->userSessionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallParticipantResponse;->userSessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->user:Lio/getstream/android/video/generated/models/UserResponse;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallParticipantResponse;->user:Lio/getstream/android/video/generated/models/UserResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getJoinedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->joinedAt:Ljg3/i;

    return-object v0
.end method

.method public final getRole()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final getUser()Lio/getstream/android/video/generated/models/UserResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->user:Lio/getstream/android/video/generated/models/UserResponse;

    return-object v0
.end method

.method public final getUserSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->userSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->joinedAt:Ljg3/i;

    invoke-virtual {v0}, Ljg3/i;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->role:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->userSessionId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->user:Lio/getstream/android/video/generated/models/UserResponse;

    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/UserResponse;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->joinedAt:Ljg3/i;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->role:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->userSessionId:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/CallParticipantResponse;->user:Lio/getstream/android/video/generated/models/UserResponse;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "CallParticipantResponse(joinedAt="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", role="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", userSessionId="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", user="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
