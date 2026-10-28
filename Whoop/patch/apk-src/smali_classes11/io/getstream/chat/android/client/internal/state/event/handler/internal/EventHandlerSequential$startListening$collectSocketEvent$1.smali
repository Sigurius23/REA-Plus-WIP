.class final Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->startListening()V
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "event",
        "Ll83/a0;",
        "<anonymous>",
        "(Lio/getstream/chat/android/client/events/ChatEvent;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$startListening$collectSocketEvent$1"
    f = "EventHandlerSequential.kt"
    l = {
        0x103,
        0x104,
        0x105
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $initJob:Lbc3/k1;

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lbc3/k1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;",
            "Lbc3/k1;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;->this$0:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;->$initJob:Lbc3/k1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;->this$0:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;->$initJob:Lbc3/k1;

    invoke-direct {v0, v1, v2, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lbc3/k1;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lio/getstream/chat/android/client/events/ChatEvent;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;->invoke(Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/events/ChatEvent;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;->this$0:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->access$getCollectedCount$p(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;->$initJob:Lbc3/k1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;->L$0:Ljava/lang/Object;

    iput v5, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;->label:I

    invoke-interface {p1, p0}, Lbc3/k1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;->this$0:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->access$getSideEffect$p(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;->L$0:Ljava/lang/Object;

    iput v4, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;->label:I

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;->this$0:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->access$getSocketEventCollector$p(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;)Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;

    move-result-object p1

    const/4 v2, 0x0

    iput-object v2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$collectSocketEvent$1;->label:I

    invoke-virtual {p1, v0, p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->collect$stream_chat_android_client_release(Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
