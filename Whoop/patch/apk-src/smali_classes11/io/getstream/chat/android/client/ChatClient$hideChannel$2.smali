.class final Lio/getstream/chat/android/client/ChatClient$hideChannel$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->hideChannel(Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;
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
    c = "io.getstream.chat.android.client.ChatClient$hideChannel$2"
    f = "ChatClient.kt"
    l = {
        0xcc5
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channelId:Ljava/lang/String;

.field final synthetic $channelType:Ljava/lang/String;

.field final synthetic $clearHistory:Z

.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$hideChannel$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->$channelType:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->$channelId:Ljava/lang/String;

    iput-boolean p4, p0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->$clearHistory:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->$channelType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->$channelId:Ljava/lang/String;

    iget-boolean v4, p0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->$clearHistory:Z

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)V

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->invoke(Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    iget v2, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->I$0:I

    iget-boolean v5, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->Z$0:Z

    iget-object v6, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->L$6:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/client/plugin/Plugin;

    iget-object v6, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->L$4:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->L$3:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v8, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->L$2:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->L$1:Ljava/lang/Object;

    check-cast v9, Lio/getstream/chat/android/client/ChatClient;

    iget-object v10, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->L$0:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    iget-object v5, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v6, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->$channelType:Ljava/lang/String;

    iget-object v7, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->$channelId:Ljava/lang/String;

    iget-boolean v8, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->$clearHistory:Z

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v9, v5

    move v5, v8

    move-object v8, v6

    move-object v6, v2

    move v2, v3

    :cond_2
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/getstream/chat/android/client/plugin/Plugin;

    invoke-static {v9}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object v11

    iget-object v12, v11, Lb23/k;->c:Lb23/e;

    iget-object v13, v11, Lb23/k;->a:Ljava/lang/String;

    sget-object v14, Lb23/g;->x:Lb23/g;

    invoke-interface {v12, v14, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    const/4 v15, 0x0

    if-eqz v12, :cond_3

    iget-object v11, v11, Lb23/k;->b:Lb23/j;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-interface {v4}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v4

    const-string v12, "[hideChannel] #doOnStart; plugin: "

    invoke-static {v12, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v11, v14, v13, v4, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iput-object v15, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->L$0:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->L$1:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->L$3:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->L$4:Ljava/lang/Object;

    iput-object v15, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->L$5:Ljava/lang/Object;

    iput-object v15, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->L$6:Ljava/lang/Object;

    iput-boolean v5, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->Z$0:Z

    iput v2, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->I$1:I

    const/4 v4, 0x1

    iput v4, v0, Lio/getstream/chat/android/client/ChatClient$hideChannel$2;->label:I

    invoke-interface {v10, v8, v7, v5, v0}, Lio/getstream/chat/android/client/plugin/Plugin;->onHideChannelRequest(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v1, :cond_2

    return-object v1

    :cond_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
