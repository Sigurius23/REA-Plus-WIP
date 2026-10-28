.class public final Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J3\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00082\u0012\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001e\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J4\u0010\u0019\u001a\u00020\u00102\u0012\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b0\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ(\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ*\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0096@\u00a2\u0006\u0004\u0008\u001f\u0010 J<\u0010!\u001a\u00020\u00102\u0012\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b0\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0004\u0008!\u0010\"J>\u0010#\u001a\u00020\u00102\u0012\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b0\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0096@\u00a2\u0006\u0004\u0008#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010&R\u001b\u0010,\u001a\u00020\'8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+\u00a8\u0006-"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;",
        "Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "logic",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "messageRepository",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;",
        "threadLogic",
        "Ln23/h;",
        "",
        "Lio/getstream/chat/android/models/Message;",
        "result",
        "",
        "limit",
        "Ll83/a0;",
        "onResult",
        "(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;Ln23/h;I)V",
        "",
        "parentId",
        "onGetRepliesPrecondition",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "onGetRepliesRequest",
        "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "onGetRepliesResult",
        "(Ln23/h;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "firstId",
        "onGetRepliesMoreRequest",
        "(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "lastId",
        "onGetNewerRepliesRequest",
        "(Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "onGetRepliesMoreResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "onGetNewerRepliesResult",
        "(Ln23/h;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
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
.field private final logger$delegate:Ll83/h;

.field private final logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

.field private final messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V
    .locals 1

    const-string v0, "logic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    const-string p1, "Chat:ThreadQueryListener"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->logger$delegate:Ll83/h;

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final onResult(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;Ln23/h;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;",
            "Ln23/h;",
            "I)V"
        }
    .end annotation

    instance-of v0, p2, Ln23/g;

    if-eqz v0, :cond_1

    check-cast p2, Ln23/g;

    iget-object p2, p2, Ln23/g;->a:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->updateOldestMessageInThread$stream_chat_android_client_release(Ljava/util/List;)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v0, p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    invoke-virtual {p1, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->setEndOfOlderMessages$stream_chat_android_client_release(Z)V

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->upsertMessages$stream_chat_android_client_release(Ljava/util/List;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final onGetNewerRepliesRequest(Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->thread(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->setLoading$stream_chat_android_client_release(Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onGetNewerRepliesResult(Ln23/h;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p4, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->thread(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object p2

    instance-of p4, p1, Ln23/g;

    const/4 p5, 0x0

    if-eqz p4, :cond_1

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->updateNewestMessageInThread$stream_chat_android_client_release(Ljava/util/List;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p4

    if-ge p4, p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    move p3, p5

    :goto_0
    invoke-virtual {p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->setEndOfNewerMessages$stream_chat_android_client_release(Z)V

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->upsertMessages$stream_chat_android_client_release(Ljava/util/List;)V

    goto :goto_1

    :cond_1
    instance-of p1, p1, Ln23/f;

    if-eqz p1, :cond_2

    :goto_1
    invoke-virtual {p2, p5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->setLoading$stream_chat_android_client_release(Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final onGetRepliesMoreRequest(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->thread(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->setLoading$stream_chat_android_client_release(Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onGetRepliesMoreResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p3, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->thread(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->setLoading$stream_chat_android_client_release(Z)V

    invoke-direct {p0, p2, p1, p4}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->onResult(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;Ln23/h;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onGetRepliesPrecondition(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->thread(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->isLoadingMessages()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->getLogger()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object v0, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v1, Lb23/g;->z:Lb23/g;

    invoke-interface {p2, v1, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    const-string v2, "already loading messages for this thread, ignoring the load requests."

    if-eqz p2, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const/4 p2, 0x0

    invoke-interface {p1, v1, v0, v2, p2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance p1, Ln23/f;

    new-instance p2, Ln23/a;

    invoke-direct {p2, v2}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_1
    new-instance p1, Ln23/g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, p2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final onGetRepliesRequest(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->thread(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->setLoading$stream_chat_android_client_release(Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onGetRepliesResult(Ln23/h;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p4, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->thread(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object p2

    const/4 p4, 0x0

    invoke-virtual {p2, p4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->setLoading$stream_chat_android_client_release(Z)V

    invoke-direct {p0, p2, p1, p3}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;->onResult(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;Ln23/h;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
