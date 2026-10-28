.class final Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;->onDeleteReactionError(Lo23/d;Ljava/lang/String;Ljava/lang/String;)Lo23/q;
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ln23/e;",
        "originalError",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Message;",
        "<anonymous>",
        "(Ln23/e;)Ln23/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.state.errorhandler.internal.DeleteReactionErrorHandlerImpl$onDeleteReactionError$1"
    f = "DeleteReactionErrorHandlerImpl.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $cid:Ljava/lang/String;

.field final synthetic $messageId:Ljava/lang/String;

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;->$cid:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;->this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;->$messageId:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;->$cid:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;->this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;->$messageId:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln23/e;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;->invoke(Ln23/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ln23/e;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/e;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ln23/e;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;->label:I

    if-nez v1, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;->$cid:Ljava/lang/String;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;->this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;->access$getClientState$p(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;)Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/client/setup/state/ClientState;->isOnline()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;->$cid:Ljava/lang/String;

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object p1

    iget-object v0, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;->this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;->access$getLogic$p(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;)Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;->$messageId:Ljava/lang/String;

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->getMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v0, Ln23/g;

    invoke-direct {v0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance p1, Ln23/f;

    new-instance v0, Ln23/a;

    const-string v1, "Local message was not found."

    invoke-direct {v0, v1}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_2
    :goto_0
    new-instance p1, Ln23/f;

    invoke-direct {p1, v0}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
