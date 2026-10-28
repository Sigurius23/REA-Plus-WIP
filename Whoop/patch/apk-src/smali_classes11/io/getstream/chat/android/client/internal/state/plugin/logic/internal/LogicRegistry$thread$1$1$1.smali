.class final Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->thread(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry$thread$1$1$1"
    f = "LogicRegistry.kt"
    l = {
        0xe8,
        0xea
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $messageId:Ljava/lang/String;

.field final synthetic $threadLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Ljava/lang/String;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->this$0:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->$messageId:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->$threadLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->this$0:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->$messageId:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->$threadLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    invoke-direct {p1, v0, v1, v2, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Ljava/lang/String;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;Lq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Message;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->this$0:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->$messageId:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->this$0:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->access$getRepos$p(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->$messageId:Ljava/lang/String;

    iput v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->label:I

    invoke-virtual {p1, v1, p0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lio/getstream/chat/android/models/Message;

    :cond_4
    if-eqz p1, :cond_5

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->$threadLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    invoke-virtual {v1, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->upsertMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V

    :cond_5
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->this$0:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->access$getRepos$p(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->$messageId:Ljava/lang/String;

    const/4 v3, 0x0

    iput-object v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->label:I

    const/16 v2, 0x1e

    invoke-virtual {p1, v1, v2, p0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectMessagesForThread(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_1
    return-object v0

    :cond_6
    :goto_2
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;->$threadLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    check-cast p1, Ljava/util/List;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->upsertMessages$stream_chat_android_client_release(Ljava/util/List;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
