.class final Lio/getstream/chat/android/client/ChatClient$sendMessage$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->sendMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Z)Lo23/d;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Message;",
        "<anonymous>",
        "(Lbc3/c0;)Ln23/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.ChatClient$sendMessage$1"
    f = "ChatClient.kt"
    l = {
        0x9e1,
        0x9e6,
        0x9e9
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channelId:Ljava/lang/String;

.field final synthetic $channelType:Ljava/lang/String;

.field final synthetic $isRetrying:Z

.field final synthetic $messageWithId:Lio/getstream/chat/android/models/Message;

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
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$sendMessage$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->$messageWithId:Lio/getstream/chat/android/models/Message;

    iput-object p3, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->$channelType:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->$channelId:Ljava/lang/String;

    iput-boolean p5, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->$isRetrying:Z

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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->$messageWithId:Lio/getstream/chat/android/models/Message;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->$channelType:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->$channelId:Ljava/lang/String;

    iget-boolean v5, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->$isRetrying:Z

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;-><init>(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$5:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Message;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$4:Ljava/lang/Object;

    check-cast v1, Lq83/d;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$3:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ln23/h;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/debugger/SendMessageDebugger;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, p0

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->I$0:I

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$4:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/debugger/SendMessageDebugger;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/models/Message;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v7, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v8, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v3

    move v3, v1

    move-object v1, v13

    move-object v13, p0

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->$messageWithId:Lio/getstream/chat/android/models/Message;

    iget-object v7, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->$channelType:Ljava/lang/String;

    iget-object v8, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->$channelId:Ljava/lang/String;

    const-string v9, ":"

    invoke-static {v7, v9, v8}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput v4, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->label:I

    invoke-static {p1, v1, v7, p0}, Lio/getstream/chat/android/client/ChatClient;->access$ensureCreatedLocallyAt(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    move-object v13, p0

    goto :goto_2

    :cond_4
    :goto_0
    iget-object v7, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v8, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->$channelType:Ljava/lang/String;

    iget-object v9, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->$channelId:Ljava/lang/String;

    iget-boolean v11, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->$isRetrying:Z

    move-object v10, p1

    check-cast v10, Lio/getstream/chat/android/models/Message;

    invoke-static {v7}, Lio/getstream/chat/android/client/ChatClient;->access$getClientDebugger$p(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/debugger/ChatClientDebugger;

    move-result-object p1

    invoke-interface {p1, v8, v9, v10, v11}, Lio/getstream/chat/android/client/debugger/ChatClientDebugger;->debugSendMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Z)Lio/getstream/chat/android/client/debugger/SendMessageDebugger;

    move-result-object v12

    invoke-interface {v12, v10}, Lio/getstream/chat/android/client/debugger/SendMessageDebugger;->onStart(Lio/getstream/chat/android/models/Message;)V

    iput-object v7, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$0:Ljava/lang/Object;

    iput-object v8, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$1:Ljava/lang/Object;

    iput-object v9, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$2:Ljava/lang/Object;

    iput-object v6, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$3:Ljava/lang/Object;

    iput-object v12, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$4:Ljava/lang/Object;

    iput v5, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->I$0:I

    iput v3, p0, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->label:I

    move-object v13, p0

    invoke-static/range {v7 .. v13}, Lio/getstream/chat/android/client/ChatClient;->access$sendAttachments(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/client/debugger/SendMessageDebugger;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_5
    move-object v1, v8

    move-object v8, v7

    move-object v7, v1

    move v3, v5

    move-object v4, v9

    move-object v1, v12

    :goto_1
    check-cast p1, Ln23/h;

    instance-of v9, p1, Ln23/g;

    if-eqz v9, :cond_7

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-interface {v1, p1}, Lio/getstream/chat/android/client/debugger/SendMessageDebugger;->onSendStart(Lio/getstream/chat/android/models/Message;)V

    iput-object v6, v13, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$0:Ljava/lang/Object;

    iput-object v1, v13, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$1:Ljava/lang/Object;

    iput-object v6, v13, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$2:Ljava/lang/Object;

    iput-object v6, v13, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$3:Ljava/lang/Object;

    iput-object v6, v13, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$4:Ljava/lang/Object;

    iput-object p1, v13, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->L$5:Ljava/lang/Object;

    iput v3, v13, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->I$0:I

    iput v5, v13, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->I$1:I

    iput v5, v13, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->I$2:I

    iput v2, v13, Lio/getstream/chat/android/client/ChatClient$sendMessage$1;->label:I

    invoke-static {v8, v7, v4, p1, p0}, Lio/getstream/chat/android/client/ChatClient;->access$doSendMessage(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    move-object v0, p1

    move-object p1, v2

    :goto_3
    move-object v2, p1

    check-cast v2, Ln23/h;

    invoke-interface {v1, v2, v0}, Lio/getstream/chat/android/client/debugger/SendMessageDebugger;->onSendStop(Ln23/h;Lio/getstream/chat/android/models/Message;)V

    invoke-interface {v1, v2, v0}, Lio/getstream/chat/android/client/debugger/SendMessageDebugger;->onStop(Ln23/h;Lio/getstream/chat/android/models/Message;)V

    goto :goto_4

    :cond_7
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_8

    :goto_4
    check-cast p1, Ln23/h;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
