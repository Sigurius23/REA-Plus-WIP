.class public final Lio/getstream/android/video/generated/models/CallLevelEventPayload;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B=\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0018\u0008\u0003\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u0019\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0008H\u00c6\u0003JA\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u0018\u0008\u0003\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0008H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000b\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallLevelEventPayload;",
        "",
        "eventType",
        "",
        "timestamp",
        "",
        "userId",
        "payload",
        "",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)V",
        "getEventType",
        "()Ljava/lang/String;",
        "getPayload",
        "()Ljava/util/Map;",
        "getTimestamp",
        "()I",
        "getUserId",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
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
.field private final eventType:Ljava/lang/String;

.field private final payload:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final timestamp:I

.field private final userId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "event_type"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lqx/q;
            name = "timestamp"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_id"
        .end annotation
    .end param
    .param p4    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "payload"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "eventType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->eventType:Ljava/lang/String;

    .line 3
    iput p2, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->timestamp:I

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->userId:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->payload:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    sget-object p4, Lm83/z;->w:Lm83/z;

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/CallLevelEventPayload;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallLevelEventPayload;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallLevelEventPayload;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->eventType:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->timestamp:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->userId:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->payload:Ljava/util/Map;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->copy(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)Lio/getstream/android/video/generated/models/CallLevelEventPayload;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->eventType:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->timestamp:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->userId:Ljava/lang/String;

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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->payload:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)Lio/getstream/android/video/generated/models/CallLevelEventPayload;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "event_type"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lqx/q;
            name = "timestamp"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_id"
        .end annotation
    .end param
    .param p4    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "payload"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/android/video/generated/models/CallLevelEventPayload;"
        }
    .end annotation

    const-string v0, "eventType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/CallLevelEventPayload;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallLevelEventPayload;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallLevelEventPayload;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->eventType:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->eventType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->timestamp:I

    iget v3, p1, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->timestamp:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->userId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->userId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->payload:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->payload:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getEventType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->eventType:Ljava/lang/String;

    return-object v0
.end method

.method public final getPayload()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->payload:Ljava/util/Map;

    return-object v0
.end method

.method public final getTimestamp()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->timestamp:I

    return v0
.end method

.method public final getUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->eventType:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->timestamp:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->userId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->payload:Ljava/util/Map;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->eventType:Ljava/lang/String;

    iget v1, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->timestamp:I

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->userId:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/CallLevelEventPayload;->payload:Ljava/util/Map;

    const-string v4, ", timestamp="

    const-string v5, ", userId="

    const-string v6, "CallLevelEventPayload(eventType="

    invoke-static {v1, v6, v0, v4, v5}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", payload="

    const-string v4, ")"

    invoke-static {v0, v2, v1, v3, v4}, Lq63/c;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
