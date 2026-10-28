.class public final Lio/getstream/android/video/generated/models/HealthCheckEvent;
.super Lio/getstream/android/video/generated/models/VideoEvent;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0013\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0086\u0008\u0018\u00002\u00020\u0001BU\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0016\u0008\u0003\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0002\u0012\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001e\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u000fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0012J^\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00042\u0016\u0008\u0003\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0008\u0008\u0003\u0010\t\u001a\u00020\u00022\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u00d6\u0003\u00a2\u0006\u0004\u0008 \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\"\u001a\u0004\u0008#\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010$\u001a\u0004\u0008%\u0010\u0012R%\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010&\u001a\u0004\u0008\'\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\"\u001a\u0004\u0008(\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\"\u001a\u0004\u0008)\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010$\u001a\u0004\u0008*\u0010\u0012\u00a8\u0006+"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/HealthCheckEvent;",
        "Lio/getstream/android/video/generated/models/VideoEvent;",
        "",
        "connectionId",
        "Ljg3/i;",
        "createdAt",
        "",
        "",
        "custom",
        "type",
        "cid",
        "receivedAt",
        "<init>",
        "(Ljava/lang/String;Ljg3/i;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljg3/i;)V",
        "getEventType",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "()Ljg3/i;",
        "component3",
        "()Ljava/util/Map;",
        "component4",
        "component5",
        "component6",
        "copy",
        "(Ljava/lang/String;Ljg3/i;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljg3/i;)Lio/getstream/android/video/generated/models/HealthCheckEvent;",
        "toString",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getConnectionId",
        "Ljg3/i;",
        "getCreatedAt",
        "Ljava/util/Map;",
        "getCustom",
        "getType",
        "getCid",
        "getReceivedAt",
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
.field private final cid:Ljava/lang/String;

.field private final connectionId:Ljava/lang/String;

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

.field private final receivedAt:Ljg3/i;

.field private final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljg3/i;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljg3/i;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "connection_id"
        .end annotation
    .end param
    .param p2    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "custom"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "cid"
        .end annotation
    .end param
    .param p6    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "received_at"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljg3/i;",
            ")V"
        }
    .end annotation

    const-string v0, "connectionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "custom"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lio/getstream/android/video/generated/models/VideoEvent;-><init>()V

    .line 4
    iput-object p1, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->connectionId:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->createdAt:Ljg3/i;

    .line 6
    iput-object p3, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->custom:Ljava/util/Map;

    .line 7
    iput-object p4, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->type:Ljava/lang/String;

    .line 8
    iput-object p5, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->cid:Ljava/lang/String;

    .line 9
    iput-object p6, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->receivedAt:Ljg3/i;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljg3/i;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljg3/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    .line 1
    sget-object p3, Lm83/z;->w:Lm83/z;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p7, 0x10

    const/4 p8, 0x0

    if-eqz p3, :cond_1

    move-object v5, p8

    goto :goto_0

    :cond_1
    move-object v5, p5

    :goto_0
    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_2

    move-object v6, p8

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    goto :goto_2

    :cond_2
    move-object v6, p6

    goto :goto_1

    .line 2
    :goto_2
    invoke-direct/range {v0 .. v6}, Lio/getstream/android/video/generated/models/HealthCheckEvent;-><init>(Ljava/lang/String;Ljg3/i;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljg3/i;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/HealthCheckEvent;Ljava/lang/String;Ljg3/i;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljg3/i;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/HealthCheckEvent;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->connectionId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->createdAt:Ljg3/i;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->custom:Ljava/util/Map;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->type:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->cid:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->receivedAt:Ljg3/i;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lio/getstream/android/video/generated/models/HealthCheckEvent;->copy(Ljava/lang/String;Ljg3/i;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljg3/i;)Lio/getstream/android/video/generated/models/HealthCheckEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->connectionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final component3()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->custom:Ljava/util/Map;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->receivedAt:Ljg3/i;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljg3/i;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljg3/i;)Lio/getstream/android/video/generated/models/HealthCheckEvent;
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "connection_id"
        .end annotation
    .end param
    .param p2    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "custom"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "cid"
        .end annotation
    .end param
    .param p6    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "received_at"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljg3/i;",
            ")",
            "Lio/getstream/android/video/generated/models/HealthCheckEvent;"
        }
    .end annotation

    const-string v0, "connectionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "custom"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/HealthCheckEvent;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lio/getstream/android/video/generated/models/HealthCheckEvent;-><init>(Ljava/lang/String;Ljg3/i;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljg3/i;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/HealthCheckEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/HealthCheckEvent;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->connectionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/HealthCheckEvent;->connectionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->createdAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/HealthCheckEvent;->createdAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->custom:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/HealthCheckEvent;->custom:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/HealthCheckEvent;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/HealthCheckEvent;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->receivedAt:Ljg3/i;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/HealthCheckEvent;->receivedAt:Ljg3/i;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getConnectionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->connectionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->createdAt:Ljg3/i;

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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->custom:Ljava/util/Map;

    return-object v0
.end method

.method public getEventType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getReceivedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->receivedAt:Ljg3/i;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->connectionId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->createdAt:Ljg3/i;

    invoke-static {v2, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->custom:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->type:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->cid:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->receivedAt:Ljg3/i;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljg3/i;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->connectionId:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->createdAt:Ljg3/i;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->custom:Ljava/util/Map;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->type:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->cid:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/HealthCheckEvent;->receivedAt:Ljg3/i;

    const-string v6, ", createdAt="

    const-string v7, ", custom="

    const-string v8, "HealthCheckEvent(connectionId="

    invoke-static {v8, v1, v0, v6, v7}, Lr;->p(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", receivedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
