.class final Lio/getstream/chat/android/client/ChatClient$sendReaction$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


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
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Reaction;",
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
    c = "io.getstream.chat.android.client.ChatClient$sendReaction$2"
    f = "ChatClient.kt"
    l = {
        0x502
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $cid:Ljava/lang/String;

.field final synthetic $currentUser:Lio/getstream/chat/android/models/User;

.field final synthetic $enforceUnique:Z

.field final synthetic $finalReaction:Lio/getstream/chat/android/models/Reaction;

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

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/models/User;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Reaction;",
            "Z",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$sendReaction$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->$cid:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->$finalReaction:Lio/getstream/chat/android/models/Reaction;

    iput-boolean p4, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->$enforceUnique:Z

    iput-object p5, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->$currentUser:Lio/getstream/chat/android/models/User;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->$cid:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->$finalReaction:Lio/getstream/chat/android/models/Reaction;

    iget-boolean v4, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->$enforceUnique:Z

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->$currentUser:Lio/getstream/chat/android/models/User;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/models/User;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln23/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->L$0:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ln23/h;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->label:I

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v9, :cond_0

    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->I$0:I

    iget-boolean v2, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->Z$0:Z

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->L$7:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/plugin/Plugin;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->L$5:Ljava/lang/Object;

    check-cast v3, Ljava/util/Iterator;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->L$4:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/models/User;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->L$3:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/models/Reaction;

    iget-object v7, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v11, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->L$1:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Iterable;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move p1, v1

    move-object v11, v3

    move-object v3, v5

    move-object v5, v4

    move v4, v2

    move-object v2, v7

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object p1

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[sendReaction] #doOnResult; completed: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v3, v2, v1, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->$cid:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->$finalReaction:Lio/getstream/chat/android/models/Reaction;

    iget-boolean v3, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->$enforceUnique:Z

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->$currentUser:Lio/getstream/chat/android/models/User;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v11, p1

    move-object v5, v4

    move p1, v8

    move v4, v3

    move-object v3, v2

    move-object v2, v1

    :cond_3
    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/plugin/Plugin;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v6, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->L$0:Ljava/lang/Object;

    iput-object v10, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->L$1:Ljava/lang/Object;

    iput-object v2, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->L$2:Ljava/lang/Object;

    iput-object v3, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->L$3:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->L$4:Ljava/lang/Object;

    iput-object v11, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->L$5:Ljava/lang/Object;

    iput-object v10, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->L$6:Ljava/lang/Object;

    iput-object v10, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->L$7:Ljava/lang/Object;

    iput-boolean v4, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->Z$0:Z

    iput p1, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->I$0:I

    iput v8, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->I$1:I

    iput v9, p0, Lio/getstream/chat/android/client/ChatClient$sendReaction$2;->label:I

    move-object v7, p0

    invoke-interface/range {v1 .. v7}, Lio/getstream/chat/android/client/plugin/Plugin;->onSendReactionResult(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3

    return-object v0

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
