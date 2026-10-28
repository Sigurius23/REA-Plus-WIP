.class final Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->updateGlobalState(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;
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
        "Lio/getstream/chat/android/client/events/HasUnreadThreadCounts;",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lio/getstream/chat/android/client/events/HasUnreadThreadCounts;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1"
    f = "EventHandlerSequential.kt"
    l = {
        0x19c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $hasReadEventsCapability:Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $unreadThreadsCount:Lkotlin/jvm/internal/e0;

.field I$0:I

.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;Lkotlin/jvm/internal/e0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/internal/e0;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;->$hasReadEventsCapability:Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;->$unreadThreadsCount:Lkotlin/jvm/internal/e0;

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

    new-instance v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;->$hasReadEventsCapability:Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;->$unreadThreadsCount:Lkotlin/jvm/internal/e0;

    invoke-direct {v0, v1, v2, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;-><init>(Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;Lkotlin/jvm/internal/e0;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lio/getstream/chat/android/client/events/HasUnreadThreadCounts;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/events/HasUnreadThreadCounts;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lio/getstream/chat/android/client/events/HasUnreadThreadCounts;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;->invoke(Lio/getstream/chat/android/client/events/HasUnreadThreadCounts;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/events/HasUnreadThreadCounts;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/events/HasUnreadThreadCounts;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;->$hasReadEventsCapability:Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;->getCid()Ljava/lang/String;

    move-result-object v2

    iput-object v4, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;->L$0:Ljava/lang/Object;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;->L$1:Ljava/lang/Object;

    iput-object v4, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;->L$2:Ljava/lang/Object;

    const/4 v5, 0x0

    iput v5, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;->I$0:I

    iput v3, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;->label:I

    invoke-virtual {p1, v2, p0}, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;->invoke(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    move-object v0, v4

    goto :goto_1

    :cond_4
    instance-of p1, v0, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_5
    instance-of p1, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;

    if-eqz p1, :cond_8

    :goto_1
    if-eqz v0, :cond_7

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1;->$unreadThreadsCount:Lkotlin/jvm/internal/e0;

    invoke-interface {v0}, Lio/getstream/chat/android/client/events/HasUnreadThreadCounts;->getUnreadThreads()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_2

    :cond_6
    iget v0, p1, Lkotlin/jvm/internal/e0;->w:I

    :goto_2
    iput v0, p1, Lkotlin/jvm/internal/e0;->w:I

    :cond_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
