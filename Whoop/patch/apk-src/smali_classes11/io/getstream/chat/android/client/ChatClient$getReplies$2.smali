.class final Lio/getstream/chat/android/client/ChatClient$getReplies$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->getReplies(Ljava/lang/String;I)Lo23/d;
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
    c = "io.getstream.chat.android.client.ChatClient$getReplies$2"
    f = "ChatClient.kt"
    l = {
        0x8f0
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $limit:I

.field final synthetic $messageId:Ljava/lang/String;

.field I$0:I

.field I$1:I

.field I$2:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$getReplies$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->$messageId:Ljava/lang/String;

    iput p3, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->$limit:I

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->$messageId:Ljava/lang/String;

    iget v3, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->$limit:I

    invoke-direct {v0, v1, v2, v3, p1}, Lio/getstream/chat/android/client/ChatClient$getReplies$2;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILq83/d;)V

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->invoke(Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$getReplies$2;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->I$1:I

    iget v4, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->I$0:I

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->L$5:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/plugin/Plugin;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->L$1:Ljava/lang/Object;

    check-cast v7, Lio/getstream/chat/android/client/ChatClient;

    iget-object v8, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->L$0:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->$messageId:Ljava/lang/String;

    iget v5, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->$limit:I

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v7, v1

    move v1, v2

    move-object v6, v4

    move v4, v5

    move-object v5, p1

    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/plugin/Plugin;

    invoke-static {v7}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object v8

    iget-object v9, v8, Lb23/k;->c:Lb23/e;

    iget-object v10, v8, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->x:Lb23/g;

    invoke-interface {v9, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    const/4 v12, 0x0

    if-eqz v9, :cond_3

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    sget-object v13, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v13, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-interface {v9}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v9

    const-string v13, "[getReplies] #doOnStart; plugin: "

    invoke-static {v13, v9}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v11, v10, v9, v12}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iput-object v12, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->L$0:Ljava/lang/Object;

    iput-object v7, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->L$1:Ljava/lang/Object;

    iput-object v6, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->L$2:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->L$3:Ljava/lang/Object;

    iput-object v12, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->L$4:Ljava/lang/Object;

    iput-object v12, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->L$5:Ljava/lang/Object;

    iput v4, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->I$0:I

    iput v1, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->I$1:I

    iput v2, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->I$2:I

    iput v3, p0, Lio/getstream/chat/android/client/ChatClient$getReplies$2;->label:I

    invoke-interface {p1, v6, v4, p0}, Lio/getstream/chat/android/client/plugin/Plugin;->onGetRepliesRequest(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
