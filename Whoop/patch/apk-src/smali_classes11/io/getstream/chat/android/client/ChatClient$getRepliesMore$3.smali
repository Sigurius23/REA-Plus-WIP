.class final Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->getRepliesMore(Ljava/lang/String;Ljava/lang/String;I)Lo23/d;
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Ln23/h;",
        "",
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
    c = "io.getstream.chat.android.client.ChatClient$getRepliesMore$3"
    f = "ChatClient.kt"
    l = {
        0x932
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $firstId:Ljava/lang/String;

.field final synthetic $limit:I

.field final synthetic $messageId:Ljava/lang/String;

.field I$0:I

.field I$1:I

.field I$2:I

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
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->$messageId:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->$firstId:Ljava/lang/String;

    iput p4, p0, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->$limit:I

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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->$messageId:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->$firstId:Ljava/lang/String;

    iget v4, p0, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->$limit:I

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;ILq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln23/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v5, p0

    iget-object v0, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->L$0:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ln23/h;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->label:I

    const/4 v8, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v8, :cond_0

    iget v0, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->I$1:I

    iget v2, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->I$0:I

    iget-object v3, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->L$7:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/plugin/Plugin;

    iget-object v3, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->L$5:Ljava/lang/Object;

    check-cast v3, Ljava/util/Iterator;

    iget-object v4, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->L$4:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v9, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->L$3:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v10, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->L$2:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/ChatClient;

    iget-object v11, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->L$1:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, v10

    const/4 v7, 0x0

    move-object v10, v3

    move-object v3, v4

    move v4, v2

    move-object v2, v9

    move v9, v0

    goto/16 :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v2, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v3, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->$messageId:Ljava/lang/String;

    iget-object v4, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->$firstId:Ljava/lang/String;

    iget v9, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->$limit:I

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v10, v0

    move-object v11, v2

    move-object v2, v3

    move-object v3, v4

    move v4, v9

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

    const-string v13, "[getRepliesMore] #doOnResult; plugin: "

    invoke-static {v13, v7}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v12, v15, v14, v7, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iput-object v1, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->L$0:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->L$1:Ljava/lang/Object;

    iput-object v11, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->L$2:Ljava/lang/Object;

    iput-object v2, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->L$3:Ljava/lang/Object;

    iput-object v3, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->L$4:Ljava/lang/Object;

    iput-object v10, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->L$5:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->L$6:Ljava/lang/Object;

    iput-object v8, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->L$7:Ljava/lang/Object;

    iput v4, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->I$0:I

    iput v9, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->I$1:I

    const/4 v7, 0x0

    iput v7, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->I$2:I

    const/4 v8, 0x1

    iput v8, v5, Lio/getstream/chat/android/client/ChatClient$getRepliesMore$3;->label:I

    invoke-interface/range {v0 .. v5}, Lio/getstream/chat/android/client/plugin/Plugin;->onGetRepliesMoreResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

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
