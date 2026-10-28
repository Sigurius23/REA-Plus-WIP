.class public final Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendGiphyListenerState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/SendGiphyListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J%\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendGiphyListenerState;",
        "Lio/getstream/chat/android/client/plugin/listeners/SendGiphyListener;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "logic",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V",
        "",
        "cid",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Message;",
        "result",
        "Ll83/a0;",
        "onGiphySendResult",
        "(Ljava/lang/String;Ln23/h;)V",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
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
.field private final logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V
    .locals 1

    const-string v0, "logic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendGiphyListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    return-void
.end method


# virtual methods
.method public final onGiphySendResult(Ljava/lang/String;Ln23/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln23/h;",
            ")V"
        }
    .end annotation

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "result"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p2, Ln23/g;

    if-eqz p1, :cond_2

    check-cast p2, Ln23/g;

    iget-object p1, p2, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendGiphyListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channelFromMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_0
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendGiphyListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->getActiveQueryThreadsLogic()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->upsertMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendGiphyListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->threadFromMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->stateLogic$stream_chat_android_client_release()Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_2
    return-void
.end method
