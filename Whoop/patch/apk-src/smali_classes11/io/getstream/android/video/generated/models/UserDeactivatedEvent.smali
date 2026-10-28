.class public final Lio/getstream/android/video/generated/models/UserDeactivatedEvent;
.super Lio/getstream/android/video/generated/models/VideoEvent;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0086\u0008\u0018\u00002\u00020\u0001BU\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0008\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\u0005\u0012\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001e\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0010J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0012J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0016J^\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0016\u0008\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0008\u0008\u0003\u0010\t\u001a\u00020\u00082\u0008\u0008\u0003\u0010\n\u001a\u00020\u00052\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\u0008\u0010 \u001a\u0004\u0018\u00010\u0006H\u00d6\u0003\u00a2\u0006\u0004\u0008\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010$\u001a\u0004\u0008%\u0010\u0012R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010&\u001a\u0004\u0008\'\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010(\u001a\u0004\u0008)\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010*\u001a\u0004\u0008+\u0010\u0010R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010$\u001a\u0004\u0008,\u0010\u0012R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010(\u001a\u0004\u0008-\u0010\u0016\u00a8\u0006."
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/UserDeactivatedEvent;",
        "Lio/getstream/android/video/generated/models/VideoEvent;",
        "Ljg3/i;",
        "createdAt",
        "",
        "",
        "",
        "custom",
        "Lio/getstream/android/video/generated/models/UserResponseCommonFields;",
        "user",
        "type",
        "receivedAt",
        "createdBy",
        "<init>",
        "(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/UserResponseCommonFields;)V",
        "getEventType",
        "()Ljava/lang/String;",
        "component1",
        "()Ljg3/i;",
        "component2",
        "()Ljava/util/Map;",
        "component3",
        "()Lio/getstream/android/video/generated/models/UserResponseCommonFields;",
        "component4",
        "component5",
        "component6",
        "copy",
        "(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/UserResponseCommonFields;)Lio/getstream/android/video/generated/models/UserDeactivatedEvent;",
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
        "Ljava/util/Map;",
        "getCustom",
        "Lio/getstream/android/video/generated/models/UserResponseCommonFields;",
        "getUser",
        "Ljava/lang/String;",
        "getType",
        "getReceivedAt",
        "getCreatedBy",
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

.field private final createdBy:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

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

.field private final receivedAt:Ljg3/i;

.field private final type:Ljava/lang/String;

.field private final user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;


# direct methods
.method public constructor <init>(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/UserResponseCommonFields;)V
    .locals 1
    .param p1    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "custom"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/UserResponseCommonFields;
        .annotation runtime Lqx/q;
            name = "user"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .param p5    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "received_at"
        .end annotation
    .end param
    .param p6    # Lio/getstream/android/video/generated/models/UserResponseCommonFields;
        .annotation runtime Lqx/q;
            name = "created_by"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljg3/i;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/android/video/generated/models/UserResponseCommonFields;",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Lio/getstream/android/video/generated/models/UserResponseCommonFields;",
            ")V"
        }
    .end annotation

    const-string v0, "createdAt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "custom"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lio/getstream/android/video/generated/models/VideoEvent;-><init>()V

    .line 4
    iput-object p1, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->createdAt:Ljg3/i;

    .line 5
    iput-object p2, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->custom:Ljava/util/Map;

    .line 6
    iput-object p3, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    .line 7
    iput-object p4, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->type:Ljava/lang/String;

    .line 8
    iput-object p5, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->receivedAt:Ljg3/i;

    .line 9
    iput-object p6, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->createdBy:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    return-void
.end method

.method public synthetic constructor <init>(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/UserResponseCommonFields;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    .line 1
    sget-object p2, Lm83/z;->w:Lm83/z;

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p7, 0x10

    const/4 p8, 0x0

    if-eqz p2, :cond_1

    move-object v5, p8

    goto :goto_0

    :cond_1
    move-object v5, p5

    :goto_0
    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_2

    move-object v6, p8

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    goto :goto_2

    :cond_2
    move-object v6, p6

    goto :goto_1

    .line 2
    :goto_2
    invoke-direct/range {v0 .. v6}, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;-><init>(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/UserResponseCommonFields;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/UserDeactivatedEvent;Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/UserResponseCommonFields;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/UserDeactivatedEvent;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->createdAt:Ljg3/i;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->custom:Ljava/util/Map;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->type:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->receivedAt:Ljg3/i;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->createdBy:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->copy(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/UserResponseCommonFields;)Lio/getstream/android/video/generated/models/UserDeactivatedEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final component2()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->custom:Ljava/util/Map;

    return-object v0
.end method

.method public final component3()Lio/getstream/android/video/generated/models/UserResponseCommonFields;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->receivedAt:Ljg3/i;

    return-object v0
.end method

.method public final component6()Lio/getstream/android/video/generated/models/UserResponseCommonFields;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->createdBy:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    return-object v0
.end method

.method public final copy(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/UserResponseCommonFields;)Lio/getstream/android/video/generated/models/UserDeactivatedEvent;
    .locals 8
    .param p1    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "custom"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/UserResponseCommonFields;
        .annotation runtime Lqx/q;
            name = "user"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .param p5    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "received_at"
        .end annotation
    .end param
    .param p6    # Lio/getstream/android/video/generated/models/UserResponseCommonFields;
        .annotation runtime Lqx/q;
            name = "created_by"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljg3/i;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/android/video/generated/models/UserResponseCommonFields;",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Lio/getstream/android/video/generated/models/UserResponseCommonFields;",
            ")",
            "Lio/getstream/android/video/generated/models/UserDeactivatedEvent;"
        }
    .end annotation

    const-string v0, "createdAt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "custom"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;-><init>(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/UserResponseCommonFields;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->createdAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->createdAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->custom:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->custom:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->receivedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->receivedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->createdBy:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->createdBy:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCreatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final getCreatedBy()Lio/getstream/android/video/generated/models/UserResponseCommonFields;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->createdBy:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->custom:Ljava/util/Map;

    return-object v0
.end method

.method public getEventType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getReceivedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->receivedAt:Ljg3/i;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUser()Lio/getstream/android/video/generated/models/UserResponseCommonFields;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->createdAt:Ljg3/i;

    invoke-virtual {v0}, Ljg3/i;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->custom:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/UserResponseCommonFields;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->type:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->receivedAt:Ljg3/i;

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

    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->createdBy:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/UserResponseCommonFields;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->createdAt:Ljg3/i;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->custom:Ljava/util/Map;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->type:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->receivedAt:Ljg3/i;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/UserDeactivatedEvent;->createdBy:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "UserDeactivatedEvent(createdAt="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", custom="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", user="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", receivedAt="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", createdBy="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
