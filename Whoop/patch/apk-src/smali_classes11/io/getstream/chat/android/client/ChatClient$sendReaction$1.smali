.class final Lio/getstream/chat/android/client/ChatClient$sendReaction$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->sendReaction(Lio/getstream/chat/android/models/Reaction;ZLjava/lang/String;Z)Lo23/d;
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
    c = "io.getstream.chat.android.client.ChatClient$sendReaction$1"
    f = "ChatClient.kt"
    l = {
        0x4f6
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $cid:Ljava/lang/String;

.field final synthetic $currentUser:Lio/getstream/chat/android/models/User;

.field final synthetic $enforceUnique:Z

.field final synthetic $finalReaction:Lio/getstream/chat/android/models/Reaction;

.field final synthetic $reaction:Lio/getstream/chat/android/models/Reaction;

.field final synthetic $skipPush:Z

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

.field Z$1:Z

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/Reaction;Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/models/Reaction;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Reaction;",
            "ZZ",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$sendReaction$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->$reaction:Lio/getstream/chat/android/models/Reaction;

    iput-object p3, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->$cid:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->$finalReaction:Lio/getstream/chat/android/models/Reaction;

    iput-boolean p5, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->$enforceUnique:Z

    iput-boolean p6, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->$skipPush:Z

    iput-object p7, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->$currentUser:Lio/getstream/chat/android/models/User;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 9
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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->$reaction:Lio/getstream/chat/android/models/Reaction;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->$cid:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->$finalReaction:Lio/getstream/chat/android/models/Reaction;

    iget-boolean v5, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->$enforceUnique:Z

    iget-boolean v6, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->$skipPush:Z

    iget-object v7, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->$currentUser:Lio/getstream/chat/android/models/User;

    move-object v8, p1

    invoke-direct/range {v0 .. v8}, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;-><init>(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/Reaction;Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;Lq83/d;)V

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->invoke(Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->label:I

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v0, :cond_1

    if-ne v0, v9, :cond_0

    iget v0, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->I$0:I

    iget-boolean v1, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->Z$1:Z

    iget-boolean v2, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->Z$0:Z

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->L$6:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/plugin/Plugin;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->L$4:Ljava/lang/Object;

    check-cast v3, Ljava/util/Iterator;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/models/User;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->L$2:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/models/Reaction;

    iget-object v11, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->L$1:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v12, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->L$0:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v3

    move v3, v2

    move-object v2, v5

    move-object v5, v4

    move v4, v1

    move-object v1, v11

    move v11, v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {v0}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->$reaction:Lio/getstream/chat/android/models/Reaction;

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object v1

    const-string v5, "[sendReaction] #doOnStart; reaction: "

    const-string v11, ", messageId: "

    invoke-static {v5, v2, v11, v1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v4, v3, v1, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->$cid:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->$finalReaction:Lio/getstream/chat/android/models/Reaction;

    iget-boolean v3, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->$enforceUnique:Z

    iget-boolean v4, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->$skipPush:Z

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->$currentUser:Lio/getstream/chat/android/models/User;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v12, v0

    move v11, v8

    :cond_3
    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/plugin/Plugin;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v10, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->L$1:Ljava/lang/Object;

    iput-object v2, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->L$2:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->L$3:Ljava/lang/Object;

    iput-object v12, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->L$4:Ljava/lang/Object;

    iput-object v10, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->L$5:Ljava/lang/Object;

    iput-object v10, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->L$6:Ljava/lang/Object;

    iput-boolean v3, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->Z$0:Z

    iput-boolean v4, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->Z$1:Z

    iput v11, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->I$0:I

    iput v8, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->I$1:I

    iput v9, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$1;->label:I

    move-object v6, p0

    invoke-interface/range {v0 .. v6}, Lio/getstream/chat/android/client/plugin/Plugin;->onSendReactionRequest(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_3

    return-object v7

    :cond_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
