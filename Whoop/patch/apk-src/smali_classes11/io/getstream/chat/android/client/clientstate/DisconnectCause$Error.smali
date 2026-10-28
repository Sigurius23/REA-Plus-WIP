.class public final Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;
.super Lio/getstream/chat/android/client/clientstate/DisconnectCause;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/clientstate/DisconnectCause;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Error"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001c\u0010\u0008\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0007\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;",
        "Lio/getstream/chat/android/client/clientstate/DisconnectCause;",
        "Ln23/c;",
        "error",
        "<init>",
        "(Ln23/c;)V",
        "component1",
        "()Ln23/c;",
        "copy",
        "(Ln23/c;)Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ln23/c;",
        "getError",
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
.field private final error:Ln23/c;


# direct methods
.method public constructor <init>(Ln23/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;->error:Ln23/c;

    return-void
.end method

.method public static copy$default(Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;Ln23/c;ILjava/lang/Object;)Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;->error:Ln23/c;

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;-><init>(Ln23/c;)V

    return-object p0
.end method


# virtual methods
.method public final component1()Ln23/c;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;->error:Ln23/c;

    return-object v0
.end method

.method public final copy(Ln23/c;)Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;-><init>(Ln23/c;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;

    iget-object v1, p0, Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;->error:Ln23/c;

    iget-object p1, p1, Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;->error:Ln23/c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getError()Ln23/c;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;->error:Ln23/c;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;->error:Ln23/c;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ln23/c;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;->error:Ln23/c;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error(error="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
