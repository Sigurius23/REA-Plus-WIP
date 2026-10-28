.class public final Lio/getstream/android/video/generated/models/MemberResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0086\u0008\u0018\u00002\u00020\u0001B_\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0016\u0008\u0003\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\t\u0012\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0010J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0013Jh\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00052\u0016\u0008\u0003\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\u0008\u0008\u0003\u0010\n\u001a\u00020\t2\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\u001dH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\u0008\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010$\u001a\u0004\u0008%\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010$\u001a\u0004\u0008&\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\'\u001a\u0004\u0008(\u0010\u0013R%\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010)\u001a\u0004\u0008*\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010+\u001a\u0004\u0008,\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010$\u001a\u0004\u0008-\u0010\u0010R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\'\u001a\u0004\u0008.\u0010\u0013\u00a8\u0006/"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/MemberResponse;",
        "",
        "Ljg3/i;",
        "createdAt",
        "updatedAt",
        "",
        "userId",
        "",
        "custom",
        "Lio/getstream/android/video/generated/models/UserResponse;",
        "user",
        "deletedAt",
        "role",
        "<init>",
        "(Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponse;Ljg3/i;Ljava/lang/String;)V",
        "component1",
        "()Ljg3/i;",
        "component2",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Ljava/util/Map;",
        "component5",
        "()Lio/getstream/android/video/generated/models/UserResponse;",
        "component6",
        "component7",
        "copy",
        "(Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponse;Ljg3/i;Ljava/lang/String;)Lio/getstream/android/video/generated/models/MemberResponse;",
        "toString",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljg3/i;",
        "getCreatedAt",
        "getUpdatedAt",
        "Ljava/lang/String;",
        "getUserId",
        "Ljava/util/Map;",
        "getCustom",
        "Lio/getstream/android/video/generated/models/UserResponse;",
        "getUser",
        "getDeletedAt",
        "getRole",
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
.field private final createdAt:Ljg3/i;

.field private final custom:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final deletedAt:Ljg3/i;

.field private final role:Ljava/lang/String;

.field private final updatedAt:Ljg3/i;

.field private final user:Lio/getstream/android/video/generated/models/UserResponse;

.field private final userId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponse;Ljg3/i;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p2    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "updated_at"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_id"
        .end annotation
    .end param
    .param p4    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "custom"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/UserResponse;
        .annotation runtime Lqx/q;
            name = "user"
        .end annotation
    .end param
    .param p6    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "deleted_at"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "role"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljg3/i;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/android/video/generated/models/UserResponse;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "createdAt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "custom"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/MemberResponse;->createdAt:Ljg3/i;

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/MemberResponse;->updatedAt:Ljg3/i;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/MemberResponse;->userId:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/MemberResponse;->custom:Ljava/util/Map;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/MemberResponse;->user:Lio/getstream/android/video/generated/models/UserResponse;

    .line 7
    iput-object p6, p0, Lio/getstream/android/video/generated/models/MemberResponse;->deletedAt:Ljg3/i;

    .line 8
    iput-object p7, p0, Lio/getstream/android/video/generated/models/MemberResponse;->role:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponse;Ljg3/i;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_0

    .line 9
    sget-object p4, Lm83/z;->w:Lm83/z;

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p8, 0x20

    const/4 v0, 0x0

    if-eqz p4, :cond_1

    move-object v6, v0

    goto :goto_0

    :cond_1
    move-object v6, p6

    :goto_0
    and-int/lit8 p4, p8, 0x40

    if-eqz p4, :cond_2

    move-object v7, v0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v0, p0

    goto :goto_1

    :cond_2
    move-object v7, p7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    .line 10
    :goto_1
    invoke-direct/range {v0 .. v7}, Lio/getstream/android/video/generated/models/MemberResponse;-><init>(Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponse;Ljg3/i;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/MemberResponse;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponse;Ljg3/i;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/MemberResponse;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/MemberResponse;->createdAt:Ljg3/i;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/MemberResponse;->updatedAt:Ljg3/i;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/MemberResponse;->userId:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/MemberResponse;->custom:Ljava/util/Map;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/MemberResponse;->user:Lio/getstream/android/video/generated/models/UserResponse;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/MemberResponse;->deletedAt:Ljg3/i;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/MemberResponse;->role:Ljava/lang/String;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lio/getstream/android/video/generated/models/MemberResponse;->copy(Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponse;Ljg3/i;Ljava/lang/String;)Lio/getstream/android/video/generated/models/MemberResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/MemberResponse;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final component2()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/MemberResponse;->updatedAt:Ljg3/i;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/MemberResponse;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/MemberResponse;->custom:Ljava/util/Map;

    return-object v0
.end method

.method public final component5()Lio/getstream/android/video/generated/models/UserResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/MemberResponse;->user:Lio/getstream/android/video/generated/models/UserResponse;

    return-object v0
.end method

.method public final component6()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/MemberResponse;->deletedAt:Ljg3/i;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/MemberResponse;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponse;Ljg3/i;Ljava/lang/String;)Lio/getstream/android/video/generated/models/MemberResponse;
    .locals 9
    .param p1    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p2    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "updated_at"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_id"
        .end annotation
    .end param
    .param p4    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "custom"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/UserResponse;
        .annotation runtime Lqx/q;
            name = "user"
        .end annotation
    .end param
    .param p6    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "deleted_at"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "role"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljg3/i;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/android/video/generated/models/UserResponse;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/android/video/generated/models/MemberResponse;"
        }
    .end annotation

    const-string v0, "createdAt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "custom"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/MemberResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lio/getstream/android/video/generated/models/MemberResponse;-><init>(Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponse;Ljg3/i;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/MemberResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/MemberResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/MemberResponse;->createdAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/MemberResponse;->createdAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/MemberResponse;->updatedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/MemberResponse;->updatedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/MemberResponse;->userId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/MemberResponse;->userId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/MemberResponse;->custom:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/MemberResponse;->custom:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/MemberResponse;->user:Lio/getstream/android/video/generated/models/UserResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/MemberResponse;->user:Lio/getstream/android/video/generated/models/UserResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/MemberResponse;->deletedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/MemberResponse;->deletedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/MemberResponse;->role:Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/MemberResponse;->role:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCreatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/MemberResponse;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final getCustom()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/MemberResponse;->custom:Ljava/util/Map;

    return-object v0
.end method

.method public final getDeletedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/MemberResponse;->deletedAt:Ljg3/i;

    return-object v0
.end method

.method public final getRole()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/MemberResponse;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/MemberResponse;->updatedAt:Ljg3/i;

    return-object v0
.end method

.method public final getUser()Lio/getstream/android/video/generated/models/UserResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/MemberResponse;->user:Lio/getstream/android/video/generated/models/UserResponse;

    return-object v0
.end method

.method public final getUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/MemberResponse;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/MemberResponse;->createdAt:Ljg3/i;

    invoke-virtual {v0}, Ljg3/i;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/MemberResponse;->updatedAt:Ljg3/i;

    invoke-static {v2, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/MemberResponse;->userId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/MemberResponse;->custom:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/MemberResponse;->user:Lio/getstream/android/video/generated/models/UserResponse;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/UserResponse;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/MemberResponse;->deletedAt:Ljg3/i;

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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/MemberResponse;->role:Ljava/lang/String;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lio/getstream/android/video/generated/models/MemberResponse;->createdAt:Ljg3/i;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/MemberResponse;->updatedAt:Ljg3/i;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/MemberResponse;->userId:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/MemberResponse;->custom:Ljava/util/Map;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/MemberResponse;->user:Lio/getstream/android/video/generated/models/UserResponse;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/MemberResponse;->deletedAt:Ljg3/i;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/MemberResponse;->role:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "MemberResponse(createdAt="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", updatedAt="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", userId="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", custom="

    const-string v1, ", user="

    invoke-static {v7, v2, v0, v3, v1}, Lvl/b;->w(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", deletedAt="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", role="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v6, v0, v7}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
