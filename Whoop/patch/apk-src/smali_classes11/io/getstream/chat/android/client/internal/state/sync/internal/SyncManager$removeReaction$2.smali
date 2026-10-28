.class final Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->removeReaction(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "Ln23/h;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)Ln23/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$removeReaction$2"
    f = "SyncManager.kt"
    l = {
        0x2be
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $reaction:Lio/getstream/chat/android/models/Reaction;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lio/getstream/chat/android/models/Reaction;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;",
            "Lio/getstream/chat/android/models/Reaction;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->$reaction:Lio/getstream/chat/android/models/Reaction;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->$reaction:Lio/getstream/chat/android/models/Reaction;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lio/getstream/chat/android/models/Reaction;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    const-string v0, "[removeReaction] completed: "

    const-string v1, "[removeReaction] reaction.id: "

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->label:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v5, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$getLogger(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lb23/k;

    move-result-object p1

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->$reaction:Lio/getstream/chat/android/models/Reaction;

    iget-object v6, p1, Lb23/k;->c:Lb23/e;

    iget-object v7, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v6, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Reaction;->getId()Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v8, v7, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$getRepos$p(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->$reaction:Lio/getstream/chat/android/models/Reaction;

    iput v5, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->label:I

    invoke-virtual {p1, v1, p0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->deleteReaction(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$getLogicRegistry$p(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->$reaction:Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channelFromMessageId(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->$reaction:Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->getMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->$reaction:Lio/getstream/chat/android/models/Reaction;

    invoke-static {p1, v1}, Lio/getstream/chat/android/client/extensions/internal/MessageReactionsKt;->removeMyReaction(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Reaction;)Lio/getstream/chat/android/models/Message;

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$getLogicRegistry$p(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->$reaction:Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->threadFromMessageId(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->$reaction:Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->getMessage$stream_chat_android_client_release(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->$reaction:Lio/getstream/chat/android/models/Reaction;

    invoke-static {p1, v1}, Lio/getstream/chat/android/client/extensions/internal/MessageReactionsKt;->removeMyReaction(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Reaction;)Lio/getstream/chat/android/models/Message;

    :cond_5
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$getLogger(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lb23/k;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->$reaction:Lio/getstream/chat/android/models/Reaction;

    iget-object v2, p1, Lb23/k;->c:Lb23/e;

    iget-object v3, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v5, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v5, v3, v0, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    new-instance p1, Ln23/g;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p1

    :goto_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$getLogger(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lb23/k;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$removeReaction$2;->$reaction:Lio/getstream/chat/android/models/Reaction;

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->F:Lb23/g;

    invoke-interface {v2, v5, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "[removeReaction] failed("

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "): "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v5, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    new-instance v0, Ln23/f;

    new-instance v1, Ln23/d;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_8

    const-string v2, ""

    :cond_8
    invoke-direct {v1, v2, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Ln23/f;-><init>(Ln23/e;)V

    return-object v0
.end method
