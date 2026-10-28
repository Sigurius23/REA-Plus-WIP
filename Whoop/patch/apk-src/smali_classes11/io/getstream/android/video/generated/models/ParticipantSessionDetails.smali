.class public final Lio/getstream/android/video/generated/models/ParticipantSessionDetails;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0086\u0008\u0018\u00002\u00020\u0001BY\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u000e\u0008\u0003\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0010J\u0016\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018Jb\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u000e\u0008\u0003\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00062\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010#\u001a\u0004\u0008$\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010#\u001a\u0004\u0008%\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010#\u001a\u0004\u0008&\u0010\u0010R\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\'\u001a\u0004\u0008(\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010)\u001a\u0004\u0008*\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010+\u001a\u0004\u0008,\u0010\u0018R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010+\u001a\u0004\u0008-\u0010\u0018\u00a8\u0006."
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/ParticipantSessionDetails;",
        "",
        "",
        "publisherType",
        "userId",
        "userSessionId",
        "",
        "roles",
        "",
        "durationInSeconds",
        "Ljg3/i;",
        "joinedAt",
        "leftAt",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljg3/i;Ljg3/i;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "()Ljava/lang/Integer;",
        "component6",
        "()Ljg3/i;",
        "component7",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljg3/i;Ljg3/i;)Lio/getstream/android/video/generated/models/ParticipantSessionDetails;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getPublisherType",
        "getUserId",
        "getUserSessionId",
        "Ljava/util/List;",
        "getRoles",
        "Ljava/lang/Integer;",
        "getDurationInSeconds",
        "Ljg3/i;",
        "getJoinedAt",
        "getLeftAt",
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
.field private final durationInSeconds:Ljava/lang/Integer;

.field private final joinedAt:Ljg3/i;

.field private final leftAt:Ljg3/i;

.field private final publisherType:Ljava/lang/String;

.field private final roles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final userId:Ljava/lang/String;

.field private final userSessionId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljg3/i;Ljg3/i;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "publisher_type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_session_id"
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "roles"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "duration_in_seconds"
        .end annotation
    .end param
    .param p6    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "joined_at"
        .end annotation
    .end param
    .param p7    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "left_at"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljg3/i;",
            "Ljg3/i;",
            ")V"
        }
    .end annotation

    const-string v0, "publisherType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userSessionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "roles"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->publisherType:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->userId:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->userSessionId:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->roles:Ljava/util/List;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->durationInSeconds:Ljava/lang/Integer;

    .line 7
    iput-object p6, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->joinedAt:Ljg3/i;

    .line 8
    iput-object p7, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->leftAt:Ljg3/i;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljg3/i;Ljg3/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_0

    .line 9
    sget-object p4, Lm83/y;->w:Lm83/y;

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p8, 0x10

    const/4 v0, 0x0

    if-eqz p4, :cond_1

    move-object v5, v0

    goto :goto_0

    :cond_1
    move-object v5, p5

    :goto_0
    and-int/lit8 p4, p8, 0x20

    if-eqz p4, :cond_2

    move-object v6, v0

    goto :goto_1

    :cond_2
    move-object v6, p6

    :goto_1
    and-int/lit8 p4, p8, 0x40

    if-eqz p4, :cond_3

    move-object v7, v0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v0, p0

    goto :goto_2

    :cond_3
    move-object v7, p7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 10
    :goto_2
    invoke-direct/range {v0 .. v7}, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljg3/i;Ljg3/i;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/ParticipantSessionDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljg3/i;Ljg3/i;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/ParticipantSessionDetails;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->publisherType:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->userId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->userSessionId:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->roles:Ljava/util/List;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->durationInSeconds:Ljava/lang/Integer;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->joinedAt:Ljg3/i;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->leftAt:Ljg3/i;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljg3/i;Ljg3/i;)Lio/getstream/android/video/generated/models/ParticipantSessionDetails;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->publisherType:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->userSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->roles:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->durationInSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->joinedAt:Ljg3/i;

    return-object v0
.end method

.method public final component7()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->leftAt:Ljg3/i;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljg3/i;Ljg3/i;)Lio/getstream/android/video/generated/models/ParticipantSessionDetails;
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "publisher_type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_session_id"
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "roles"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "duration_in_seconds"
        .end annotation
    .end param
    .param p6    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "joined_at"
        .end annotation
    .end param
    .param p7    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "left_at"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljg3/i;",
            "Ljg3/i;",
            ")",
            "Lio/getstream/android/video/generated/models/ParticipantSessionDetails;"
        }
    .end annotation

    const-string v0, "publisherType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userSessionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "roles"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljg3/i;Ljg3/i;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->publisherType:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->publisherType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->userId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->userId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->userSessionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->userSessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->roles:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->roles:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->durationInSeconds:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->durationInSeconds:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->joinedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->joinedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->leftAt:Ljg3/i;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->leftAt:Ljg3/i;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getDurationInSeconds()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->durationInSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getJoinedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->joinedAt:Ljg3/i;

    return-object v0
.end method

.method public final getLeftAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->leftAt:Ljg3/i;

    return-object v0
.end method

.method public final getPublisherType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->publisherType:Ljava/lang/String;

    return-object v0
.end method

.method public final getRoles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->roles:Ljava/util/List;

    return-object v0
.end method

.method public final getUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->userSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->publisherType:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->userId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->userSessionId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->roles:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->durationInSeconds:Ljava/lang/Integer;

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

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->joinedAt:Ljg3/i;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljg3/i;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->leftAt:Ljg3/i;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljg3/i;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->publisherType:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->userId:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->userSessionId:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->roles:Ljava/util/List;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->durationInSeconds:Ljava/lang/Integer;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->joinedAt:Ljg3/i;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/ParticipantSessionDetails;->leftAt:Ljg3/i;

    const-string v7, ", userId="

    const-string v8, ", userSessionId="

    const-string v9, "ParticipantSessionDetails(publisherType="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", roles="

    const-string v7, ", durationInSeconds="

    invoke-static {v2, v1, v7, v0, v3}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", joinedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", leftAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
