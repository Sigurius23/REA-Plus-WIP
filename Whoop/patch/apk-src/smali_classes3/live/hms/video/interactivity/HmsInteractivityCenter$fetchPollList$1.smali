.class final Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/interactivity/HmsInteractivityCenter;->fetchPollList(Llive/hms/video/polls/models/HmsPollState;Llive/hms/video/sdk/HmsTypedActionResultListener;)V
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
    c = "live.hms.video.interactivity.HmsInteractivityCenter$fetchPollList$1"
    f = "HmsInteractivityCenter.kt"
    l = {
        0x15a,
        0x15c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $completion:Llive/hms/video/sdk/HmsTypedActionResultListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llive/hms/video/sdk/HmsTypedActionResultListener<",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/HmsPoll;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $fetchQuestions:Z

.field final synthetic $pollState:Llive/hms/video/polls/models/HmsPollState;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;


# direct methods
.method public constructor <init>(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/polls/models/HmsPollState;Llive/hms/video/sdk/HmsTypedActionResultListener;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/interactivity/HmsInteractivityCenter;",
            "Llive/hms/video/polls/models/HmsPollState;",
            "Llive/hms/video/sdk/HmsTypedActionResultListener<",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/HmsPoll;",
            ">;>;Z",
            "Lq83/d<",
            "-",
            "Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    iput-object p2, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->$pollState:Llive/hms/video/polls/models/HmsPollState;

    iput-object p3, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->$completion:Llive/hms/video/sdk/HmsTypedActionResultListener;

    iput-boolean p4, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->$fetchQuestions:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;

    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    iget-object v2, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->$pollState:Llive/hms/video/polls/models/HmsPollState;

    iget-object v3, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->$completion:Llive/hms/video/sdk/HmsTypedActionResultListener;

    iget-boolean v4, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->$fetchQuestions:Z

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;-><init>(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/polls/models/HmsPollState;Llive/hms/video/sdk/HmsTypedActionResultListener;ZLq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->label:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-boolean v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->Z$0:Z

    iget-object v4, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->L$6:Ljava/lang/Object;

    check-cast v4, Ljava/util/Collection;

    iget-object v5, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->L$5:Ljava/lang/Object;

    check-cast v5, Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;

    iget-object v6, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->L$4:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->L$3:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    iget-object v8, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->L$2:Ljava/lang/Object;

    check-cast v8, Llive/hms/video/sdk/HmsTypedActionResultListener;

    iget-object v9, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->L$1:Ljava/lang/Object;

    check-cast v9, Llive/hms/video/polls/models/HmsPollState;

    iget-object v10, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->L$0:Ljava/lang/Object;

    check-cast v10, Llive/hms/video/interactivity/HmsInteractivityCenter;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v11, v10

    move-object v10, p0

    goto/16 :goto_3

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v10, p0

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Llive/hms/video/error/HMSException; {:try_start_1 .. :try_end_1} :catch_0

    move-object v10, p0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-static {p1}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$throwErrorIfNotConnected(Llive/hms/video/interactivity/HmsInteractivityCenter;)V

    iget-object v5, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    iget-object v6, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->$pollState:Llive/hms/video/polls/models/HmsPollState;

    iput v4, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->label:I
    :try_end_2
    .catch Llive/hms/video/error/HMSException; {:try_start_2 .. :try_end_2} :catch_2

    const/16 v7, 0xa

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x8

    const/4 v12, 0x0

    move-object v10, p0

    :try_start_3
    invoke-static/range {v5 .. v12}, Llive/hms/video/interactivity/HmsInteractivityCenter;->getAllPollsRecursively$default(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Ljava/util/List;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Iterable;

    iget-boolean v1, v10, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->$fetchQuestions:Z

    iget-object v4, v10, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    iget-object v5, v10, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->$pollState:Llive/hms/video/polls/models/HmsPollState;

    iget-object v6, v10, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->$completion:Llive/hms/video/sdk/HmsTypedActionResultListener;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {p1, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v9, v5

    move-object v8, v6

    move-object v6, p1

    move-object p1, v4

    :goto_1
    move-object v4, v7

    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;

    if-eqz v1, :cond_6

    invoke-static {p1}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getGetAllPollQuestions$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Lc93/m;

    move-result-object v7

    invoke-virtual {v5}, Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;->getPollId()Ljava/lang/String;

    move-result-object v11

    iput-object p1, v10, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->L$0:Ljava/lang/Object;

    iput-object v9, v10, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->L$1:Ljava/lang/Object;

    iput-object v8, v10, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->L$2:Ljava/lang/Object;

    iput-object v4, v10, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->L$3:Ljava/lang/Object;

    iput-object v6, v10, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->L$4:Ljava/lang/Object;

    iput-object v5, v10, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->L$5:Ljava/lang/Object;

    iput-object v4, v10, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->L$6:Ljava/lang/Object;

    iput-boolean v1, v10, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->Z$0:Z

    iput v3, v10, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->label:I

    invoke-interface {v7, v11, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_4

    :goto_2
    return-object v0

    :cond_4
    move-object v11, p1

    move-object p1, v7

    move-object v7, v4

    :goto_3
    check-cast p1, Llive/hms/video/polls/network/QuestionContainer;

    invoke-virtual {p1}, Llive/hms/video/polls/network/QuestionContainer;->isSuccess()Z

    move-result v12

    if-eqz v12, :cond_5

    new-instance v12, Llive/hms/video/polls/models/HmsPoll;

    invoke-virtual {p1}, Llive/hms/video/polls/network/QuestionContainer;->getQuestions()Ljava/util/List;

    move-result-object p1

    invoke-static {v11}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getSdkStore$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Llive/hms/video/sdk/SDKStore;

    move-result-object v13

    invoke-direct {v12, v5, p1, v13, v9}, Llive/hms/video/polls/models/HmsPoll;-><init>(Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;Ljava/util/List;Llive/hms/video/sdk/SDKStore;Llive/hms/video/polls/models/HmsPollState;)V

    move-object p1, v11

    goto :goto_5

    :catch_1
    move-exception v0

    :goto_4
    move-object p1, v0

    goto :goto_6

    :cond_5
    invoke-virtual {p1}, Llive/hms/video/polls/network/QuestionContainer;->getError()Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type live.hms.video.error.HMSException"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Llive/hms/video/error/HMSException;

    invoke-interface {v8, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-object v2

    :cond_6
    new-instance v12, Llive/hms/video/polls/models/HmsPoll;

    invoke-static {p1}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getSdkStore$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Llive/hms/video/sdk/SDKStore;

    move-result-object v7

    const/4 v11, 0x0

    invoke-direct {v12, v5, v11, v7, v9}, Llive/hms/video/polls/models/HmsPoll;-><init>(Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;Ljava/util/List;Llive/hms/video/sdk/SDKStore;Llive/hms/video/polls/models/HmsPollState;)V

    move-object v7, v4

    :goto_5
    invoke-interface {v4, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_7
    check-cast v4, Ljava/util/List;

    iget-object p1, v10, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-virtual {p1, v4}, Llive/hms/video/interactivity/HmsInteractivityCenter;->updatePollsList$lib_release(Ljava/util/List;)V

    iget-object p1, v10, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->$completion:Llive/hms/video/sdk/HmsTypedActionResultListener;

    invoke-interface {p1, v4}, Llive/hms/video/sdk/HmsTypedActionResultListener;->onSuccess(Ljava/lang/Object;)V
    :try_end_3
    .catch Llive/hms/video/error/HMSException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_7

    :catch_2
    move-exception v0

    move-object v10, p0

    goto :goto_4

    :goto_6
    iget-object v0, v10, Llive/hms/video/interactivity/HmsInteractivityCenter$fetchPollList$1;->$completion:Llive/hms/video/sdk/HmsTypedActionResultListener;

    invoke-interface {v0, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    :goto_7
    return-object v2
.end method
