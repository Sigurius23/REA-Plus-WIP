.class final Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->scheduleTimeout()V
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
    c = "io.getstream.chat.android.client.internal.state.event.handler.internal.batch.SocketEventCollector$scheduleTimeout$1"
    f = "SocketEventCollector.kt"
    l = {
        0x72,
        0xda,
        0x75
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->this$0:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;

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

    new-instance p1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->this$0:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;

    invoke-direct {p1, v0, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lmc3/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->I$0:I

    iget-object v4, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v5

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->this$0:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->access$getTimeout$p(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;)J

    move-result-wide v7

    iput v5, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->label:I

    invoke-static {v7, v8, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->this$0:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->access$getLogger(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;)Lb23/k;

    move-result-object p1

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v5, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->z:Lb23/g;

    invoke-interface {v1, v7, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v1, "[scheduleTimeout] timeout is triggered"

    invoke-interface {p1, v7, v5, v1, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->this$0:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->access$getMutex$p(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;)Lmc3/a;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->this$0:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->L$1:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->I$0:I

    iput v4, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->label:I

    invoke-interface {p1, p0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_6

    goto :goto_2

    :cond_6
    move-object v4, v1

    move v1, v2

    :goto_1
    :try_start_1
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->L$0:Ljava/lang/Object;

    iput-object v6, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->L$1:Ljava/lang/Object;

    iput v1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->I$0:I

    iput v2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->I$1:I

    iput v3, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;->label:I

    invoke-static {v4, p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->access$doFire(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;Lq83/d;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v1, v0, :cond_7

    :goto_2
    return-object v0

    :cond_7
    move-object v0, p1

    :goto_3
    invoke-interface {v0, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_1
    move-exception v0

    move-object v9, v0

    move-object v0, p1

    move-object p1, v9

    :goto_4
    invoke-interface {v0, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method
