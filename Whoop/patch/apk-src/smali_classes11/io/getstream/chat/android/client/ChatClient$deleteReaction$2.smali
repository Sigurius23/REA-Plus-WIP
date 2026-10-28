.class final Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->deleteReaction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
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
        "Lio/getstream/chat/android/models/Message;",
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
    c = "io.getstream.chat.android.client.ChatClient$deleteReaction$2"
    f = "ChatClient.kt"
    l = {
        0x4c6
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $cid:Ljava/lang/String;

.field final synthetic $currentUser:Lio/getstream/chat/android/models/User;

.field final synthetic $messageId:Ljava/lang/String;

.field final synthetic $reactionType:Ljava/lang/String;

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

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->$cid:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->$messageId:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->$reactionType:Ljava/lang/String;

    iput-object p5, p0, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->$currentUser:Lio/getstream/chat/android/models/User;

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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->$cid:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->$messageId:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->$reactionType:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->$currentUser:Lio/getstream/chat/android/models/User;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln23/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v6, p0

    iget-object v0, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->L$0:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ln23/h;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v0, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->label:I

    const/4 v9, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v9, :cond_0

    iget v0, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->I$0:I

    iget-object v1, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->L$9:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/plugin/Plugin;

    iget-object v1, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->L$7:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    iget-object v2, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->L$6:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/User;

    iget-object v3, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->L$5:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->L$4:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v10, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->L$3:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v11, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->L$2:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/client/ChatClient;

    iget-object v12, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->L$1:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, v4

    move-object v4, v2

    move-object v2, v8

    move-object v12, v11

    const/4 v8, 0x0

    move-object v11, v1

    move-object v1, v10

    move v10, v0

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->$cid:Ljava/lang/String;

    iget-object v3, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->$messageId:Ljava/lang/String;

    iget-object v4, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->$reactionType:Ljava/lang/String;

    iget-object v10, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->$currentUser:Lio/getstream/chat/android/models/User;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v11, v0

    move-object v12, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v10

    const/4 v10, 0x0

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/plugin/Plugin;

    invoke-static {v12}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object v13

    iget-object v14, v13, Lb23/k;->c:Lb23/e;

    iget-object v15, v13, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->x:Lb23/g;

    invoke-interface {v14, v9, v15}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_2

    iget-object v13, v13, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v14

    sget-object v8, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v8, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-interface {v8}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v8

    const-string v14, "[deleteReaction] #doOnResult; plugin: "

    invoke-static {v14, v8}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v14, 0x0

    invoke-interface {v13, v9, v15, v8, v14}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_2
    const/4 v14, 0x0

    :goto_1
    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v5, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->L$0:Ljava/lang/Object;

    iput-object v14, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->L$1:Ljava/lang/Object;

    iput-object v12, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->L$2:Ljava/lang/Object;

    iput-object v1, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->L$3:Ljava/lang/Object;

    iput-object v2, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->L$4:Ljava/lang/Object;

    iput-object v3, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->L$5:Ljava/lang/Object;

    iput-object v4, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->L$6:Ljava/lang/Object;

    iput-object v11, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->L$7:Ljava/lang/Object;

    iput-object v14, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->L$8:Ljava/lang/Object;

    iput-object v14, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->L$9:Ljava/lang/Object;

    iput v10, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->I$0:I

    const/4 v8, 0x0

    iput v8, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->I$1:I

    const/4 v9, 0x1

    iput v9, v6, Lio/getstream/chat/android/client/ChatClient$deleteReaction$2;->label:I

    invoke-interface/range {v0 .. v6}, Lio/getstream/chat/android/client/plugin/Plugin;->onDeleteReactionResult(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_3

    return-object v7

    :cond_3
    :goto_2
    move-object/from16 v6, p0

    goto :goto_0

    :cond_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
