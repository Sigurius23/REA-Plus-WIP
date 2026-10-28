.class public Lio/getstream/chat/android/client/socket/SocketListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/getstream/chat/android/client/socket/SocketListener;",
        "",
        "<init>",
        "()V",
        "Ll83/a0;",
        "onConnecting",
        "Lio/getstream/chat/android/client/events/ConnectedEvent;",
        "event",
        "onConnected",
        "(Lio/getstream/chat/android/client/events/ConnectedEvent;)V",
        "Lio/getstream/chat/android/client/clientstate/DisconnectCause;",
        "cause",
        "onDisconnected",
        "(Lio/getstream/chat/android/client/clientstate/DisconnectCause;)V",
        "Ln23/e;",
        "error",
        "onError",
        "(Ln23/e;)V",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "onEvent",
        "(Lio/getstream/chat/android/client/events/ChatEvent;)V",
        "",
        "deliverOnMainThread",
        "Z",
        "getDeliverOnMainThread",
        "()Z",
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
.field private final deliverOnMainThread:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/getstream/chat/android/client/socket/SocketListener;->deliverOnMainThread:Z

    return-void
.end method


# virtual methods
.method public getDeliverOnMainThread()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/socket/SocketListener;->deliverOnMainThread:Z

    return v0
.end method

.method public onConnected(Lio/getstream/chat/android/client/events/ConnectedEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onConnecting()V
    .locals 0

    return-void
.end method

.method public onDisconnected(Lio/getstream/chat/android/client/clientstate/DisconnectCause;)V
    .locals 1

    const-string v0, "cause"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onError(Ln23/e;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
