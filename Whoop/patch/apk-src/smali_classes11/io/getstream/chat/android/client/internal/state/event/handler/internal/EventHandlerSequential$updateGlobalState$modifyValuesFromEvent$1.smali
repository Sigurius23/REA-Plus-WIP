.class final Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;
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
        "Lio/getstream/chat/android/client/events/HasUnreadCounts;",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lio/getstream/chat/android/client/events/HasUnreadCounts;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1"
    f = "EventHandlerSequential.kt"
    l = {
        0x180,
        0x183,
        0x185
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channelUnreadCount:Lkotlin/jvm/internal/e0;

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

.field final synthetic $totalUnreadCount:Lkotlin/jvm/internal/e0;

.field I$0:I

.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/internal/e0;",
            "Lkotlin/jvm/internal/e0;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->$hasReadEventsCapability:Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->$totalUnreadCount:Lkotlin/jvm/internal/e0;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->$channelUnreadCount:Lkotlin/jvm/internal/e0;

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

    new-instance v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->$hasReadEventsCapability:Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->$totalUnreadCount:Lkotlin/jvm/internal/e0;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->$channelUnreadCount:Lkotlin/jvm/internal/e0;

    invoke-direct {v0, v1, v2, v3, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;-><init>(Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lio/getstream/chat/android/client/events/HasUnreadCounts;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/events/HasUnreadCounts;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lio/getstream/chat/android/client/events/HasUnreadCounts;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->invoke(Lio/getstream/chat/android/client/events/HasUnreadCounts;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/events/HasUnreadCounts;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/events/HasUnreadCounts;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/events/HasUnreadCounts;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_2
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/events/NewMessageEvent;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/events/HasUnreadCounts;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lio/getstream/chat/android/client/events/MarkAllReadEvent;

    if-eqz p1, :cond_4

    goto/16 :goto_6

    :cond_4
    instance-of p1, v0, Lio/getstream/chat/android/client/events/NewMessageEvent;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->$hasReadEventsCapability:Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/client/events/NewMessageEvent;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getCid()Ljava/lang/String;

    move-result-object v2

    iput-object v7, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->L$0:Ljava/lang/Object;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->L$1:Ljava/lang/Object;

    iput-object v7, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->L$2:Ljava/lang/Object;

    iput v6, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->I$0:I

    iput v5, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->label:I

    invoke-virtual {p1, v2, p0}, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;->invoke(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto/16 :goto_4

    :cond_5
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    goto/16 :goto_6

    :cond_6
    :goto_1
    move-object v0, v7

    goto/16 :goto_6

    :cond_7
    instance-of p1, v0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;

    if-eqz p1, :cond_8

    move-object p1, v0

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->getUnreadChannels()I

    move-result p1

    if-nez p1, :cond_10

    goto :goto_1

    :cond_8
    instance-of p1, v0, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;

    if-eqz p1, :cond_b

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->$hasReadEventsCapability:Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;->getUnreadChannels()I

    move-result v3

    if-nez v3, :cond_a

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object v2

    iput-object v7, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->L$0:Ljava/lang/Object;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->L$1:Ljava/lang/Object;

    iput-object v7, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->L$2:Ljava/lang/Object;

    iput v6, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->I$0:I

    iput v4, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->label:I

    invoke-virtual {p1, v2, p0}, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;->invoke(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_4

    :cond_9
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_a

    goto :goto_3

    :cond_a
    move v5, v6

    :goto_3
    if-nez v5, :cond_6

    goto :goto_6

    :cond_b
    instance-of p1, v0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;

    if-eqz p1, :cond_d

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->$hasReadEventsCapability:Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->getCid()Ljava/lang/String;

    move-result-object v2

    iput-object v7, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->L$0:Ljava/lang/Object;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->L$1:Ljava/lang/Object;

    iput-object v7, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->L$2:Ljava/lang/Object;

    iput v6, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->I$0:I

    iput v3, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->label:I

    invoke-virtual {p1, v2, p0}, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;->invoke(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_c

    :goto_4
    return-object v1

    :cond_c
    :goto_5
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_6

    :cond_d
    instance-of p1, v0, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;

    if-eqz p1, :cond_e

    goto :goto_6

    :cond_e
    instance-of p1, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;

    if-eqz p1, :cond_f

    goto :goto_6

    :cond_f
    instance-of p1, v0, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;

    if-eqz p1, :cond_12

    move-object p1, v0

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getUnreadChannels()I

    move-result p1

    if-nez p1, :cond_10

    goto/16 :goto_1

    :cond_10
    :goto_6
    if-eqz v0, :cond_11

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->$totalUnreadCount:Lkotlin/jvm/internal/e0;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;->$channelUnreadCount:Lkotlin/jvm/internal/e0;

    invoke-interface {v0}, Lio/getstream/chat/android/client/events/HasUnreadCounts;->getTotalUnreadCount()I

    move-result v2

    iput v2, p1, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {v0}, Lio/getstream/chat/android/client/events/HasUnreadCounts;->getUnreadChannels()I

    move-result p1

    iput p1, v1, Lkotlin/jvm/internal/e0;->w:I

    :cond_11
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_12
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
