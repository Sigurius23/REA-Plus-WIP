.class final Lio/getstream/chat/android/client/ChatClient$markAllRead$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->markAllRead()Lo23/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "<anonymous>",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.ChatClient$markAllRead$1"
    f = "ChatClient.kt"
    l = {
        0xdaf
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$markAllRead$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-direct {v0, v1, p1}, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;-><init>(Lio/getstream/chat/android/client/ChatClient;Lq83/d;)V

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;->I$0:I

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;->L$3:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/plugin/Plugin;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;->L$1:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, p0, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;->L$0:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object p1

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v5, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v1, "[markAllRead] #doOnStart; no args"

    invoke-interface {p1, v6, v5, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v5, p1

    move v1, v2

    :cond_3
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/plugin/Plugin;

    iput-object v4, p0, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;->L$0:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;->L$1:Ljava/lang/Object;

    iput-object v4, p0, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;->L$2:Ljava/lang/Object;

    iput-object v4, p0, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;->L$3:Ljava/lang/Object;

    iput v1, p0, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;->I$0:I

    iput v2, p0, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;->I$1:I

    iput v3, p0, Lio/getstream/chat/android/client/ChatClient$markAllRead$1;->label:I

    invoke-interface {p1, p0}, Lio/getstream/chat/android/client/plugin/Plugin;->onMarkAllReadRequest(Lq83/d;)Ljava/lang/Object;

    if-ne v6, v0, :cond_3

    return-object v0

    :cond_4
    return-object v6
.end method
