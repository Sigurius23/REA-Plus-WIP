.class public final Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;
.super Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RestartConnection"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;",
        "reason",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;",
        "<init>",
        "(Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;)V",
        "getReason",
        "()Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final reason:Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;)V
    .locals 1

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;->reason:Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;ILjava/lang/Object;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;->reason:Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;->copy(Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;->reason:Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;
    .locals 1

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;-><init>(Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    iget-object v1, p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;->reason:Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;

    iget-object p1, p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;->reason:Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getReason()Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;->reason:Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;->reason:Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;->reason:Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "RestartConnection(reason="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
