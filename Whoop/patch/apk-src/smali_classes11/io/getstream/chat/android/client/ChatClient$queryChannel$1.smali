.class final Lio/getstream/chat/android/client/ChatClient$queryChannel$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->queryChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Z)Lo23/d;
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
    c = "io.getstream.chat.android.client.ChatClient$queryChannel$1"
    f = "ChatClient.kt"
    l = {
        0xc0c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channelId:Ljava/lang/String;

.field final synthetic $channelType:Ljava/lang/String;

.field final synthetic $request:Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

.field final synthetic $skipOnRequest:Z

.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;ZLjava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$queryChannel$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-boolean p2, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->$skipOnRequest:Z

    iput-object p3, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->$channelType:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->$channelId:Ljava/lang/String;

    iput-object p5, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->$request:Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-boolean v2, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->$skipOnRequest:Z

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->$channelType:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->$channelId:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->$request:Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;-><init>(Lio/getstream/chat/android/client/ChatClient;ZLjava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)V

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->invoke(Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->I$0:I

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->L$6:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/plugin/Plugin;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->L$4:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->L$3:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    iget-object v7, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v8, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object p1

    iget-boolean v1, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->$skipOnRequest:Z

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->$channelType:Ljava/lang/String;

    iget-object v6, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->$channelId:Ljava/lang/String;

    iget-object v7, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->$request:Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    iget-object v8, p1, Lb23/k;->c:Lb23/e;

    iget-object v9, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->y:Lb23/g;

    invoke-interface {v8, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v8, ", cid: "

    const-string v11, ":"

    const-string v12, "[queryChannel] #doOnStart; skipOnRequest: "

    invoke-static {v12, v8, v5, v11, v1}, Lev/n;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", request: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v10, v9, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-boolean p1, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->$skipOnRequest:Z

    if-nez p1, :cond_4

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->$channelType:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->$channelId:Ljava/lang/String;

    iget-object v6, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->$request:Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v8, v1

    move v1, v2

    move-object v7, v5

    move-object v5, p1

    :cond_3
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/plugin/Plugin;

    iput-object v4, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->L$0:Ljava/lang/Object;

    iput-object v8, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->L$1:Ljava/lang/Object;

    iput-object v7, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->L$2:Ljava/lang/Object;

    iput-object v6, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->L$3:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->L$4:Ljava/lang/Object;

    iput-object v4, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->L$5:Ljava/lang/Object;

    iput-object v4, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->L$6:Ljava/lang/Object;

    iput v1, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->I$0:I

    iput v2, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->I$1:I

    iput v3, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$1;->label:I

    invoke-interface {p1, v8, v7, v6, p0}, Lio/getstream/chat/android/client/plugin/Plugin;->onQueryChannelRequest(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
