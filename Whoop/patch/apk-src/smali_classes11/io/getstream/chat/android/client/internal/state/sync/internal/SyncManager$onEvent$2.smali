.class final Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->onEvent$stream_chat_android_client_release(Lio/getstream/chat/android/client/events/ChatEvent;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$onEvent$2"
    f = "SyncManager.kt"
    l = {
        0xc9
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-direct {p1, v0, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$getLogger(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lb23/k;

    move-result-object p1

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v4, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->z:Lb23/g;

    invoke-interface {v1, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v1, "[onEvent] ConnectedEvent received"

    invoke-interface {p1, v5, v4, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$getCurrentUserId$p(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Ljava/lang/String;

    move-result-object v1

    iput v3, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2;->label:I

    invoke-static {p1, v1, p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$onConnectionEstablished(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$getSyncScope$p(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lbc3/c0;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2$2;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$onEvent$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$scheduleLiveLocationMessageUpdates(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
