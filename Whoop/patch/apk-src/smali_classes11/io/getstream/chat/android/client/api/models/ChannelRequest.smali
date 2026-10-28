.class public interface abstract Lio/getstream/chat/android/client/api/models/ChannelRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lio/getstream/chat/android/client/api/models/ChannelRequest<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008`\u0018\u0000*\u000e\u0008\u0000\u0010\u0001*\u0008\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002J\r\u0010\u000f\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0010J\r\u0010\u0011\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0010J\r\u0010\u0012\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0010J\r\u0010\u0013\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0010J\r\u0010\u0014\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0010J\r\u0010\u0015\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0010R\u0018\u0010\u0003\u001a\u00020\u0004X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\u0018\u0010\t\u001a\u00020\u0004X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\n\u0010\u0006\"\u0004\u0008\u000b\u0010\u0008R\u0018\u0010\u000c\u001a\u00020\u0004X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\r\u0010\u0006\"\u0004\u0008\u000e\u0010\u0008\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0016\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/models/ChannelRequest;",
        "T",
        "",
        "state",
        "",
        "getState",
        "()Z",
        "setState",
        "(Z)V",
        "watch",
        "getWatch",
        "setWatch",
        "presence",
        "getPresence",
        "setPresence",
        "withWatch",
        "()Lio/getstream/chat/android/client/api/models/ChannelRequest;",
        "withState",
        "noWatch",
        "noState",
        "withPresence",
        "noPresence",
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


# virtual methods
.method public abstract getPresence()Z
.end method

.method public abstract getState()Z
.end method

.method public abstract getWatch()Z
.end method

.method public noPresence()Lio/getstream/chat/android/client/api/models/ChannelRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lio/getstream/chat/android/client/api/models/ChannelRequest;->setPresence(Z)V

    return-object p0
.end method

.method public noState()Lio/getstream/chat/android/client/api/models/ChannelRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lio/getstream/chat/android/client/api/models/ChannelRequest;->setState(Z)V

    return-object p0
.end method

.method public noWatch()Lio/getstream/chat/android/client/api/models/ChannelRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lio/getstream/chat/android/client/api/models/ChannelRequest;->setWatch(Z)V

    return-object p0
.end method

.method public abstract setPresence(Z)V
.end method

.method public abstract setState(Z)V
.end method

.method public abstract setWatch(Z)V
.end method

.method public withPresence()Lio/getstream/chat/android/client/api/models/ChannelRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lio/getstream/chat/android/client/api/models/ChannelRequest;->setPresence(Z)V

    return-object p0
.end method

.method public withState()Lio/getstream/chat/android/client/api/models/ChannelRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lio/getstream/chat/android/client/api/models/ChannelRequest;->setState(Z)V

    return-object p0
.end method

.method public withWatch()Lio/getstream/chat/android/client/api/models/ChannelRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lio/getstream/chat/android/client/api/models/ChannelRequest;->setWatch(Z)V

    return-object p0
.end method
