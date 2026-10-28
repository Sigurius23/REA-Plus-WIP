.class final Lio/getstream/chat/android/client/ChatClient$queryThreads$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->queryThreads(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Lo23/d;
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ln23/h;",
        "Lio/getstream/chat/android/models/QueryThreadsResult;",
        "result",
        "Ll83/a0;",
        "<anonymous>",
        "(Ln23/h;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.ChatClient$queryThreads$2"
    f = "ChatClient.kt"
    l = {
        0x1181
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $query:Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

.field I$0:I

.field I$1:I

.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$queryThreads$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->$query:Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->$query:Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

    invoke-direct {v0, v1, v2, p2}, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;-><init>(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln23/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->L$0:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    iget v2, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->I$0:I

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->L$5:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/plugin/Plugin;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->L$2:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

    iget-object v7, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->$query:Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v5, p1

    move-object v6, v2

    move v2, v3

    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/plugin/Plugin;

    iput-object v0, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->L$0:Ljava/lang/Object;

    const/4 v7, 0x0

    iput-object v7, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->L$1:Ljava/lang/Object;

    iput-object v6, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->L$2:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->L$3:Ljava/lang/Object;

    iput-object v7, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->L$4:Ljava/lang/Object;

    iput-object v7, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->L$5:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->I$0:I

    iput v3, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->I$1:I

    iput v4, p0, Lio/getstream/chat/android/client/ChatClient$queryThreads$2;->label:I

    invoke-interface {p1, v0, v6, p0}, Lio/getstream/chat/android/client/plugin/Plugin;->onQueryThreadsResult(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
