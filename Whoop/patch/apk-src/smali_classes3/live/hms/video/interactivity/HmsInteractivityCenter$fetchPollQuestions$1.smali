.class final Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/interactivity/HmsInteractivityCenter;->fetchPollQuestions(Llive/hms/video/polls/models/HmsPoll;Llive/hms/video/sdk/HmsTypedActionResultListener;)V
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
        0x0,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.interactivity.HmsInteractivityCenter$fetchPollQuestions$1"
    f = "HmsInteractivityCenter.kt"
    l = {
        0x144
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $completion:Llive/hms/video/sdk/HmsTypedActionResultListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llive/hms/video/sdk/HmsTypedActionResultListener<",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/question/HMSPollQuestion;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $poll:Llive/hms/video/polls/models/HmsPoll;

.field label:I

.field final synthetic this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;


# direct methods
.method public constructor <init>(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/polls/models/HmsPoll;Llive/hms/video/sdk/HmsTypedActionResultListener;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/interactivity/HmsInteractivityCenter;",
            "Llive/hms/video/polls/models/HmsPoll;",
            "Llive/hms/video/sdk/HmsTypedActionResultListener<",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/question/HMSPollQuestion;",
            ">;>;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    iput-object p2, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;->$poll:Llive/hms/video/polls/models/HmsPoll;

    iput-object p3, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;->$completion:Llive/hms/video/sdk/HmsTypedActionResultListener;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;->$poll:Llive/hms/video/polls/models/HmsPoll;

    iget-object v2, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;->$completion:Llive/hms/video/sdk/HmsTypedActionResultListener;

    invoke-direct {p1, v0, v1, v2, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;-><init>(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/polls/models/HmsPoll;Llive/hms/video/sdk/HmsTypedActionResultListener;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;->label:I

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

    iget-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-static {p1}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getGetAllPollQuestions$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Lc93/m;

    move-result-object p1

    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;->$poll:Llive/hms/video/polls/models/HmsPoll;

    invoke-virtual {v1}, Llive/hms/video/polls/models/HmsPoll;->getPollId()Ljava/lang/String;

    move-result-object v1

    iput v2, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;->label:I

    invoke-interface {p1, v1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Llive/hms/video/polls/network/QuestionContainer;

    invoke-virtual {p1}, Llive/hms/video/polls/network/QuestionContainer;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;->$poll:Llive/hms/video/polls/models/HmsPoll;

    invoke-virtual {p1}, Llive/hms/video/polls/network/QuestionContainer;->getQuestions()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/polls/models/HmsPoll;->setQuestions(Ljava/util/List;)V

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-virtual {v0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->getPolls()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;->$poll:Llive/hms/video/polls/models/HmsPoll;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Llive/hms/video/polls/models/HmsPoll;

    invoke-virtual {v3}, Llive/hms/video/polls/models/HmsPoll;->getPollId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Llive/hms/video/polls/models/HmsPoll;->getPollId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    :goto_1
    check-cast v2, Llive/hms/video/polls/models/HmsPoll;

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Llive/hms/video/polls/network/QuestionContainer;->getQuestions()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Llive/hms/video/polls/models/HmsPoll;->setQuestions(Ljava/util/List;)V

    :cond_5
    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;->$completion:Llive/hms/video/sdk/HmsTypedActionResultListener;

    invoke-virtual {p1}, Llive/hms/video/polls/network/QuestionContainer;->getQuestions()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_6

    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_6
    invoke-interface {v0, p1}, Llive/hms/video/sdk/HmsTypedActionResultListener;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_7
    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollQuestions$1;->$completion:Llive/hms/video/sdk/HmsTypedActionResultListener;

    invoke-virtual {p1}, Llive/hms/video/polls/network/QuestionContainer;->getError()Ljava/lang/Throwable;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type live.hms.video.error.HMSException"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Llive/hms/video/error/HMSException;

    invoke-interface {v0, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
