.class final Lio/getstream/chat/android/client/ChatClient$queryChannel$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


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
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Channel;",
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
    c = "io.getstream.chat.android.client.ChatClient$queryChannel$2"
    f = "ChatClient.kt"
    l = {
        0xc15
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channelId:Ljava/lang/String;

.field final synthetic $channelType:Ljava/lang/String;

.field final synthetic $request:Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

.field I$0:I

.field I$1:I

.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$queryChannel$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->$channelType:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->$channelId:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->$request:Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->$channelType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->$channelId:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->$request:Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln23/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->L$0:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ln23/h;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->label:I

    const/4 v7, 0x0

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v9, :cond_0

    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->I$0:I

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->L$7:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/plugin/Plugin;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->L$5:Ljava/lang/Object;

    check-cast v3, Ljava/util/Iterator;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->L$4:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v11, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->L$1:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Iterable;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v5

    move-object v5, v4

    move-object v4, p1

    move p1, v1

    move-object v11, v3

    move-object v3, v6

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->$channelType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->$channelId:Ljava/lang/String;

    iget-object v4, p1, Lb23/k;->c:Lb23/e;

    iget-object v5, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->x:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v2}, Ln23/h;->a()Ln23/e;

    move-result-object v4

    if-nez v4, :cond_2

    move-object v4, v8

    :cond_2
    const-string v11, ":"

    const-string v12, "): "

    const-string v13, "[queryChannel] #doOnResult; completed("

    invoke-static {v13, v1, v11, v3, v12}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v6, v5, v1, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->$channelType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->$channelId:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->$request:Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v11, p1

    move-object v5, v4

    move p1, v7

    move-object v4, v3

    move-object v3, v1

    :cond_4
    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/plugin/Plugin;

    iput-object v2, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->L$0:Ljava/lang/Object;

    iput-object v10, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->L$1:Ljava/lang/Object;

    iput-object v3, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->L$2:Ljava/lang/Object;

    iput-object v4, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->L$3:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->L$4:Ljava/lang/Object;

    iput-object v11, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->L$5:Ljava/lang/Object;

    iput-object v10, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->L$6:Ljava/lang/Object;

    iput-object v10, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->L$7:Ljava/lang/Object;

    iput p1, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->I$0:I

    iput v7, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->I$1:I

    iput v9, p0, Lio/getstream/chat/android/client/ChatClient$queryChannel$2;->label:I

    move-object v6, p0

    invoke-interface/range {v1 .. v6}, Lio/getstream/chat/android/client/plugin/Plugin;->onQueryChannelResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    return-object v0

    :cond_5
    return-object v8
.end method
