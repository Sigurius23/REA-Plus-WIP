.class final Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->emitConnectionEvents(Lio/getstream/chat/android/client/events/ChatEvent;)V
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
    c = "io.getstream.chat.android.client.utils.observable.ChatEventsObservable$emitConnectionEvents$1"
    f = "ChatEventsObservable.kt"
    l = {
        0x3b,
        0x3e,
        0x45
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $event:Lio/getstream/chat/android/client/events/ChatEvent;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/events/ChatEvent;Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;->$event:Lio/getstream/chat/android/client/events/ChatEvent;

    iput-object p2, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;->this$0:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;->$event:Lio/getstream/chat/android/client/events/ChatEvent;

    iget-object v1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;->this$0:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;-><init>(Lio/getstream/chat/android/client/events/ChatEvent;Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ln23/c;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;->$event:Lio/getstream/chat/android/client/events/ChatEvent;

    instance-of v1, p1, Lio/getstream/chat/android/client/events/ConnectedEvent;

    if-eqz v1, :cond_3

    iget-object p1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;->this$0:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->access$getWaitConnection$p(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;)Lec3/m;

    move-result-object p1

    new-instance v1, Ln23/g;

    new-instance v2, Lio/getstream/chat/android/models/ConnectionData;

    iget-object v3, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;->$event:Lio/getstream/chat/android/client/events/ChatEvent;

    check-cast v3, Lio/getstream/chat/android/client/events/ConnectedEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/ConnectedEvent;->getMe()Lio/getstream/chat/android/models/User;

    move-result-object v3

    iget-object v5, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;->$event:Lio/getstream/chat/android/client/events/ChatEvent;

    check-cast v5, Lio/getstream/chat/android/client/events/ConnectedEvent;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/events/ConnectedEvent;->getConnectionId()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v3, v5}, Lio/getstream/chat/android/models/ConnectionData;-><init>(Lio/getstream/chat/android/models/User;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    iput v4, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;->label:I

    invoke-interface {p1, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_3

    :cond_3
    instance-of v1, p1, Lio/getstream/chat/android/client/events/ErrorEvent;

    if-eqz v1, :cond_4

    iget-object p1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;->this$0:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->access$getWaitConnection$p(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;)Lec3/m;

    move-result-object p1

    new-instance v1, Ln23/f;

    iget-object v2, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;->$event:Lio/getstream/chat/android/client/events/ChatEvent;

    check-cast v2, Lio/getstream/chat/android/client/events/ErrorEvent;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/ErrorEvent;->getError()Ln23/e;

    move-result-object v2

    invoke-direct {v1, v2}, Ln23/f;-><init>(Ln23/e;)V

    iput v3, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;->label:I

    invoke-interface {p1, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_3

    :cond_4
    instance-of v1, p1, Lio/getstream/chat/android/client/events/DisconnectedEvent;

    if-eqz v1, :cond_7

    check-cast p1, Lio/getstream/chat/android/client/events/DisconnectedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/DisconnectedEvent;->getDisconnectCause()Lio/getstream/chat/android/client/clientstate/DisconnectCause;

    move-result-object p1

    instance-of v1, p1, Lio/getstream/chat/android/client/clientstate/DisconnectCause$UnrecoverableError;

    const/4 v3, 0x0

    if-eqz v1, :cond_5

    check-cast p1, Lio/getstream/chat/android/client/clientstate/DisconnectCause$UnrecoverableError;

    goto :goto_1

    :cond_5
    move-object p1, v3

    :goto_1
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lio/getstream/chat/android/client/clientstate/DisconnectCause$UnrecoverableError;->getError()Ln23/c;

    move-result-object p1

    goto :goto_2

    :cond_6
    move-object p1, v3

    :goto_2
    if-eqz p1, :cond_7

    iget-object v1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;->this$0:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;

    invoke-static {v1}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->access$getWaitConnection$p(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;)Lec3/m;

    move-result-object v1

    new-instance v4, Ln23/f;

    invoke-direct {v4, p1}, Ln23/f;-><init>(Ln23/e;)V

    iput-object v3, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;->label:I

    invoke-interface {v1, v4, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_3
    return-object v0

    :cond_7
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
