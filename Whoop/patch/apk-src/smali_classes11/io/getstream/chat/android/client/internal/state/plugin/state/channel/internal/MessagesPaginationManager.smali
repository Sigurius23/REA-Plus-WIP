.class public interface abstract Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J%\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H&\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00042\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00042\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH&\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H&\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00188&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001b\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u001d\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;",
        "",
        "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "query",
        "Ll83/a0;",
        "begin",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Channel;",
        "result",
        "end",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Ln23/h;)V",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "setOldestMessage",
        "(Lio/getstream/chat/android/models/Message;)V",
        "setNewestMessage",
        "",
        "hasLoadedAll",
        "setEndOfOlderMessages",
        "(Z)V",
        "setEndOfNewerMessages",
        "reset",
        "()V",
        "Lec3/f2;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;",
        "getState",
        "()Lec3/f2;",
        "state",
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
.method public abstract begin(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V
.end method

.method public abstract end(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Ln23/h;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            "Ln23/h;",
            ")V"
        }
    .end annotation
.end method

.method public abstract getState()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract reset()V
.end method

.method public abstract setEndOfNewerMessages(Z)V
.end method

.method public abstract setEndOfOlderMessages(Z)V
.end method

.method public abstract setNewestMessage(Lio/getstream/chat/android/models/Message;)V
.end method

.method public abstract setOldestMessage(Lio/getstream/chat/android/models/Message;)V
.end method
