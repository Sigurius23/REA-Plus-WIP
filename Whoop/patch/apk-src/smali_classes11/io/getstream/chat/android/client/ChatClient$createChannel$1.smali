.class final Lio/getstream/chat/android/client/ChatClient$createChannel$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->createChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/CreateChannelParams;)Lo23/d;
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
    c = "io.getstream.chat.android.client.ChatClient$createChannel$1"
    f = "ChatClient.kt"
    l = {
        0x1098
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channelId:Ljava/lang/String;

.field final synthetic $channelType:Ljava/lang/String;

.field final synthetic $currentUser:Lio/getstream/chat/android/models/User;

.field final synthetic $params:Lio/getstream/chat/android/client/query/CreateChannelParams;

.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/CreateChannelParams;Lio/getstream/chat/android/models/User;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/query/CreateChannelParams;",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$createChannel$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->$channelType:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->$channelId:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->$params:Lio/getstream/chat/android/client/query/CreateChannelParams;

    iput-object p5, p0, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->$currentUser:Lio/getstream/chat/android/models/User;

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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$createChannel$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->$channelType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->$channelId:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->$params:Lio/getstream/chat/android/client/query/CreateChannelParams;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->$currentUser:Lio/getstream/chat/android/models/User;

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/ChatClient$createChannel$1;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/CreateChannelParams;Lio/getstream/chat/android/models/User;Lq83/d;)V

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->invoke(Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$createChannel$1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v5, p0

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->label:I

    const/4 v8, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v8, :cond_0

    iget v0, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->I$0:I

    iget-object v1, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->L$8:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/plugin/Plugin;

    iget-object v1, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->L$6:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    iget-object v2, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->L$5:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/User;

    iget-object v3, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->L$4:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/query/CreateChannelParams;

    iget-object v4, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v9, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->L$2:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v10, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->L$1:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/ChatClient;

    iget-object v11, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->L$0:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v4

    move-object v4, v2

    move-object v2, v7

    move-object v11, v10

    const/4 v7, 0x0

    move-object v10, v1

    move-object v1, v9

    move v9, v0

    goto/16 :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->$channelType:Ljava/lang/String;

    iget-object v3, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->$channelId:Ljava/lang/String;

    iget-object v4, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->$params:Lio/getstream/chat/android/client/query/CreateChannelParams;

    iget-object v9, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->$currentUser:Lio/getstream/chat/android/models/User;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v10, v0

    move-object v11, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v9

    const/4 v9, 0x0

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/plugin/Plugin;

    invoke-static {v11}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object v12

    iget-object v13, v12, Lb23/k;->c:Lb23/e;

    iget-object v14, v12, Lb23/k;->a:Ljava/lang/String;

    sget-object v15, Lb23/g;->x:Lb23/g;

    invoke-interface {v13, v15, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    const/4 v8, 0x0

    if-eqz v13, :cond_2

    iget-object v12, v12, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-interface {v7}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v7

    const-string v13, "[createChannel] #doOnStart; plugin: "

    invoke-static {v13, v7}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v12, v15, v14, v7, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v8, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->L$0:Ljava/lang/Object;

    iput-object v11, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->L$1:Ljava/lang/Object;

    iput-object v1, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->L$2:Ljava/lang/Object;

    iput-object v2, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->L$3:Ljava/lang/Object;

    iput-object v3, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->L$4:Ljava/lang/Object;

    iput-object v4, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->L$5:Ljava/lang/Object;

    iput-object v10, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->L$6:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->L$7:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->L$8:Ljava/lang/Object;

    iput v9, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->I$0:I

    const/4 v7, 0x0

    iput v7, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->I$1:I

    const/4 v8, 0x1

    iput v8, v5, Lio/getstream/chat/android/client/ChatClient$createChannel$1;->label:I

    invoke-interface/range {v0 .. v5}, Lio/getstream/chat/android/client/plugin/Plugin;->onCreateChannelRequest(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/CreateChannelParams;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_3

    return-object v6

    :cond_3
    :goto_1
    move-object/from16 v5, p0

    goto :goto_0

    :cond_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
