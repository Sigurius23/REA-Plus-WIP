.class public final Lio/getstream/chat/android/client/events/ConnectionErrorEvent;
.super Lio/getstream/chat/android/client/events/ChatEvent;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\tH\u00c6\u0003J;\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\rR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006!"
    }
    d2 = {
        "Lio/getstream/chat/android/client/events/ConnectionErrorEvent;",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "type",
        "",
        "createdAt",
        "Ljava/util/Date;",
        "rawCreatedAt",
        "connectionId",
        "error",
        "Lio/getstream/chat/android/client/errors/ChatError;",
        "<init>",
        "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/errors/ChatError;)V",
        "getType",
        "()Ljava/lang/String;",
        "getCreatedAt",
        "()Ljava/util/Date;",
        "getRawCreatedAt",
        "getConnectionId",
        "getError",
        "()Lio/getstream/chat/android/client/errors/ChatError;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final connectionId:Ljava/lang/String;

.field private final createdAt:Ljava/util/Date;

.field private final error:Lio/getstream/chat/android/client/errors/ChatError;

.field private final rawCreatedAt:Ljava/lang/String;

.field private final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/errors/ChatError;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawCreatedAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/events/ChatEvent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->type:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->createdAt:Ljava/util/Date;

    iput-object p3, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->rawCreatedAt:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->connectionId:Ljava/lang/String;

    iput-object p5, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->error:Lio/getstream/chat/android/client/errors/ChatError;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/events/ConnectionErrorEvent;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/errors/ChatError;ILjava/lang/Object;)Lio/getstream/chat/android/client/events/ConnectionErrorEvent;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->type:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->createdAt:Ljava/util/Date;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->rawCreatedAt:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->connectionId:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->error:Lio/getstream/chat/android/client/errors/ChatError;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->copy(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/errors/ChatError;)Lio/getstream/chat/android/client/events/ConnectionErrorEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->rawCreatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->connectionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lio/getstream/chat/android/client/errors/ChatError;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->error:Lio/getstream/chat/android/client/errors/ChatError;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/errors/ChatError;)Lio/getstream/chat/android/client/events/ConnectionErrorEvent;
    .locals 7

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawCreatedAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/errors/ChatError;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;

    iget-object v1, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->rawCreatedAt:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->rawCreatedAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->connectionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->connectionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->error:Lio/getstream/chat/android/client/errors/ChatError;

    iget-object p1, p1, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->error:Lio/getstream/chat/android/client/errors/ChatError;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getConnectionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->connectionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getError()Lio/getstream/chat/android/client/errors/ChatError;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->error:Lio/getstream/chat/android/client/errors/ChatError;

    return-object v0
.end method

.method public final getRawCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->rawCreatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->createdAt:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->rawCreatedAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->connectionId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->error:Lio/getstream/chat/android/client/errors/ChatError;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/errors/ChatError;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->type:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->createdAt:Ljava/util/Date;

    iget-object v2, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->rawCreatedAt:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->connectionId:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->error:Lio/getstream/chat/android/client/errors/ChatError;

    const-string v5, ", createdAt="

    const-string v6, ", rawCreatedAt="

    const-string v7, "ConnectionErrorEvent(type="

    invoke-static {v7, v0, v5, v1, v6}, Lc13/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", connectionId="

    const-string v5, ", error="

    invoke-static {v0, v2, v1, v3, v5}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
