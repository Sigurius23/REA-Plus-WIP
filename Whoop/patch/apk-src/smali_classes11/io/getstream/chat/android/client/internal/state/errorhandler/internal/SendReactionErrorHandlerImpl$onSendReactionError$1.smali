.class final Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;->onSendReactionError(Lo23/d;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;)Lo23/q;
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
        "Lio/getstream/chat/android/models/Reaction;",
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
    c = "io.getstream.chat.android.client.internal.state.errorhandler.internal.SendReactionErrorHandlerImpl$onSendReactionError$1"
    f = "SendReactionErrorHandlerImpl.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $currentUser:Lio/getstream/chat/android/models/User;

.field final synthetic $enforceUnique:Z

.field final synthetic $reaction:Lio/getstream/chat/android/models/Reaction;

.field final synthetic $skipPush:Z

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;Lio/getstream/chat/android/models/Reaction;Lio/getstream/chat/android/models/User;ZZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;",
            "Lio/getstream/chat/android/models/Reaction;",
            "Lio/getstream/chat/android/models/User;",
            "ZZ",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->$reaction:Lio/getstream/chat/android/models/Reaction;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->$currentUser:Lio/getstream/chat/android/models/User;

    iput-boolean p4, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->$enforceUnique:Z

    iput-boolean p5, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->$skipPush:Z

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

    new-instance v0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->$reaction:Lio/getstream/chat/android/models/Reaction;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->$currentUser:Lio/getstream/chat/android/models/User;

    iget-boolean v4, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->$enforceUnique:Z

    iget-boolean v5, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->$skipPush:Z

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;-><init>(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;Lio/getstream/chat/android/models/Reaction;Lio/getstream/chat/android/models/User;ZZLq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln23/e;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->invoke(Ln23/e;Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ln23/e;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->label:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;->access$getClientState$p(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;)Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/client/setup/state/ClientState;->isOnline()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ln23/f;

    invoke-direct {p1, v0}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_0
    new-instance p1, Ln23/g;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->$reaction:Lio/getstream/chat/android/models/Reaction;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->$currentUser:Lio/getstream/chat/android/models/User;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->this$0:Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;

    invoke-static {v2}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;->access$getClientState$p(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;)Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object v2

    invoke-interface {v2}, Lio/getstream/chat/android/client/setup/state/ClientState;->isOnline()Z

    move-result v2

    iget-boolean v3, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->$enforceUnique:Z

    iget-boolean v4, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;->$skipPush:Z

    invoke-static {v0, v1, v2, v3, v4}, Lio/getstream/chat/android/client/extensions/internal/ReactionKt;->enrichWithDataBeforeSending(Lio/getstream/chat/android/models/Reaction;Lio/getstream/chat/android/models/User;ZZZ)Lio/getstream/chat/android/models/Reaction;

    move-result-object v0

    invoke-direct {p1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
