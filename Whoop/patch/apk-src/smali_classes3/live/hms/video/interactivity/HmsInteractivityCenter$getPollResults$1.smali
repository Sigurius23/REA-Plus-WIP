.class final Llive/hms/video/interactivity/HmsInteractivityCenter$getPollResults$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/interactivity/HmsInteractivityCenter;->getPollResults(Llive/hms/video/polls/models/HmsPoll;Llive/hms/video/sdk/HmsTypedActionResultListener;)V
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
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "Llive/hms/video/polls/models/HmsPoll;",
        "i",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.interactivity.HmsInteractivityCenter$getPollResults$1"
    f = "HmsInteractivityCenter.kt"
    l = {
        0x123
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;


# direct methods
.method public constructor <init>(Llive/hms/video/interactivity/HmsInteractivityCenter;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/interactivity/HmsInteractivityCenter;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/interactivity/HmsInteractivityCenter$getPollResults$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$getPollResults$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Llive/hms/video/interactivity/HmsInteractivityCenter$getPollResults$1;

    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$getPollResults$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-direct {v0, v1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$getPollResults$1;-><init>(Llive/hms/video/interactivity/HmsInteractivityCenter;Lq83/d;)V

    iput-object p1, v0, Llive/hms/video/interactivity/HmsInteractivityCenter$getPollResults$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$getPollResults$1;->invoke(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/polls/models/HmsPoll;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$getPollResults$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/interactivity/HmsInteractivityCenter$getPollResults$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$getPollResults$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$getPollResults$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$getPollResults$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$getPollResults$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-static {v1}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getGetPollResults$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Lc93/m;

    move-result-object v1

    iput v2, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$getPollResults$1;->label:I

    invoke-interface {v1, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Llive/hms/video/polls/network/PollResultsResponse;

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$getPollResults$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    new-instance v1, Llive/hms/video/sdk/models/HMSNotifications$PollStats;

    invoke-virtual {p1}, Llive/hms/video/polls/network/PollResultsResponse;->getPollId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Llive/hms/video/polls/network/PollResultsResponse;->getQuestion()Ljava/util/List;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Llive/hms/video/sdk/models/HMSNotifications$PollStats;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Llive/hms/video/polls/network/PollResultsResponse;->getTotalResponses()J

    move-result-wide v2

    new-instance v4, Ljava/lang/Long;

    invoke-direct {v4, v2, v3}, Ljava/lang/Long;-><init>(J)V

    invoke-virtual {p1}, Llive/hms/video/polls/network/PollResultsResponse;->getVotingUsers()J

    move-result-wide v2

    new-instance v5, Ljava/lang/Long;

    invoke-direct {v5, v2, v3}, Ljava/lang/Long;-><init>(J)V

    invoke-virtual {p1}, Llive/hms/video/polls/network/PollResultsResponse;->getTotalDistinctUsers()J

    move-result-wide v2

    new-instance v6, Ljava/lang/Long;

    invoke-direct {v6, v2, v3}, Ljava/lang/Long;-><init>(J)V

    invoke-virtual {v0, v1, v4, v5, v6}, Llive/hms/video/interactivity/HmsInteractivityCenter;->updatePollStats$lib_release(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$getPollResults$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-static {v0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$get_polls$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Llive/hms/video/polls/models/HmsPoll;

    invoke-virtual {v2}, Llive/hms/video/polls/models/HmsPoll;->getPollId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Llive/hms/video/polls/network/PollResultsResponse;->getPollId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    check-cast v1, Llive/hms/video/polls/models/HmsPoll;

    if-eqz v1, :cond_5

    return-object v1

    :cond_5
    sget-object v2, Llive/hms/video/error/ErrorFactory$GenericErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$GenericErrors;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Llive/hms/video/error/ErrorFactory$GenericErrors;->PollNotFound$default(Llive/hms/video/error/ErrorFactory$GenericErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    throw p1
.end method
