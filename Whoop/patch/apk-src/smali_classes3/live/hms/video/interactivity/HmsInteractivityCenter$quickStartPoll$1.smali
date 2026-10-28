.class final Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/interactivity/HmsInteractivityCenter;->quickStartPoll(Llive/hms/video/polls/HMSPollBuilder;Llive/hms/video/sdk/HMSActionResultListener;)V
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
    c = "live.hms.video.interactivity.HmsInteractivityCenter$quickStartPoll$1"
    f = "HmsInteractivityCenter.kt"
    l = {
        0x8d,
        0x8d,
        0x99
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $completion:Llive/hms/video/sdk/HMSActionResultListener;

.field final synthetic $poll:Llive/hms/video/polls/HMSPollBuilder;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/HMSActionResultListener;Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/polls/HMSPollBuilder;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            "Llive/hms/video/interactivity/HmsInteractivityCenter;",
            "Llive/hms/video/polls/HMSPollBuilder;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->$completion:Llive/hms/video/sdk/HMSActionResultListener;

    iput-object p2, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    iput-object p3, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->$poll:Llive/hms/video/polls/HMSPollBuilder;

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

    new-instance v0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;

    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->$completion:Llive/hms/video/sdk/HMSActionResultListener;

    iget-object v2, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    iget-object v3, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->$poll:Llive/hms/video/polls/HMSPollBuilder;

    invoke-direct {v0, v1, v2, v3, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;-><init>(Llive/hms/video/sdk/HMSActionResultListener;Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/polls/HMSPollBuilder;Lq83/d;)V

    iput-object p1, v0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->L$0:Ljava/lang/Object;

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->label:I

    const-string v2, "null cannot be cast to non-null type live.hms.video.error.HMSException"

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x0

    if-eqz v0, :cond_3

    if-eq v0, v5, :cond_2

    if-eq v0, v4, :cond_1

    if-ne v0, v3, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_6

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_7

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_2
    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    :try_start_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iget-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->$poll:Llive/hms/video/polls/HMSPollBuilder;

    :try_start_3
    invoke-static {p1}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getPollCreate$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Lc93/m;

    move-result-object v8

    iput-object v8, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->L$0:Ljava/lang/Object;

    iput v5, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->label:I

    invoke-static {p1, v0, p0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getParams(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/polls/HMSPollBuilder;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_5

    :cond_4
    move-object v0, v8

    :goto_0
    iput-object v7, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->L$0:Ljava/lang/Object;

    iput v4, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->label:I

    invoke-interface {v0, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_5

    :cond_5
    :goto_1
    check-cast p1, Llive/hms/video/polls/network/PollCreateResponse;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :goto_2
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_3
    instance-of v0, p1, Ll83/m;

    if-eqz v0, :cond_6

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->$completion:Llive/hms/video/sdk/HMSActionResultListener;

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Llive/hms/video/error/HMSException;

    invoke-interface {v0, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-object v6

    :cond_6
    if-eqz v0, :cond_7

    move-object p1, v7

    :cond_7
    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Llive/hms/video/polls/network/PollCreateResponse;

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->$poll:Llive/hms/video/polls/HMSPollBuilder;

    iget-object v4, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    :try_start_4
    invoke-virtual {p1}, Llive/hms/video/polls/network/PollCreateResponse;->getPollId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Llive/hms/video/polls/HMSPollBuilder;->getQuestions()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/polls/models/question/HMSPollQuestion;

    new-instance v5, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;

    invoke-direct {v5, v0}, Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;-><init>(Llive/hms/video/polls/models/question/HMSPollQuestion;)V

    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    new-instance v8, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;

    const/4 v11, 0x0

    const/4 v12, 0x4

    const/4 v13, 0x0

    invoke-direct/range {v8 .. v13}, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v4}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getAddQuestion$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Lc93/m;

    move-result-object p1

    iput-object v7, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->label:I

    invoke-interface {p1, v8, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_5
    return-object v1

    :cond_9
    :goto_6
    check-cast p1, Llive/hms/video/polls/network/SetQuestionsResponse;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_8

    :goto_7
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_8
    instance-of v0, p1, Ll83/m;

    if-eqz v0, :cond_a

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->$completion:Llive/hms/video/sdk/HMSActionResultListener;

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Llive/hms/video/error/HMSException;

    invoke-interface {v0, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-object v6

    :cond_a
    iget-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->$poll:Llive/hms/video/polls/HMSPollBuilder;

    invoke-virtual {v0}, Llive/hms/video/polls/HMSPollBuilder;->getPollId()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-static {v1}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getStartPoll$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Lc93/m;

    move-result-object v1

    iget-object v2, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$quickStartPoll$1;->$completion:Llive/hms/video/sdk/HMSActionResultListener;

    invoke-static {p1, v0, v1, v2}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$runNetworkOperationSafely(Llive/hms/video/interactivity/HmsInteractivityCenter;Ljava/lang/Object;Lc93/m;Llive/hms/video/sdk/HMSActionResultListener;)V

    return-object v6
.end method
