.class final Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/polls/network/HmsPollsStartManager;->manage(Llive/hms/video/sdk/models/HMSNotifications$OnPollStart;)Ljava/util/List;
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
    c = "live.hms.video.polls.network.HmsPollsStartManager$manage$1"
    f = "HmsPollsStartManager.kt"
    l = {
        0x25,
        0x37
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $params:Llive/hms/video/sdk/models/HMSNotifications$OnPollStart;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/polls/network/HmsPollsStartManager;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/models/HMSNotifications$OnPollStart;Llive/hms/video/polls/network/HmsPollsStartManager;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSNotifications$OnPollStart;",
            "Llive/hms/video/polls/network/HmsPollsStartManager;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->$params:Llive/hms/video/sdk/models/HMSNotifications$OnPollStart;

    iput-object p2, p0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->this$0:Llive/hms/video/polls/network/HmsPollsStartManager;

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

    new-instance p1, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;

    iget-object v0, p0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->$params:Llive/hms/video/sdk/models/HMSNotifications$OnPollStart;

    iget-object v1, p0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->this$0:Llive/hms/video/polls/network/HmsPollsStartManager;

    invoke-direct {p1, v0, v1, p2}, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;-><init>(Llive/hms/video/sdk/models/HMSNotifications$OnPollStart;Llive/hms/video/polls/network/HmsPollsStartManager;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v2, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->L$3:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/polls/models/HmsPoll;

    iget-object v5, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/util/Collection;

    iget-object v7, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->L$0:Ljava/lang/Object;

    check-cast v7, Llive/hms/video/polls/network/HmsPollsStartManager;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v2, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->L$3:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;

    iget-object v5, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/util/Collection;

    iget-object v7, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->L$0:Ljava/lang/Object;

    check-cast v7, Llive/hms/video/polls/network/HmsPollsStartManager;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v8, p1

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->$params:Llive/hms/video/sdk/models/HMSNotifications$OnPollStart;

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSNotifications$OnPollStart;->getPolls()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    iget-object v5, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->this$0:Llive/hms/video/polls/network/HmsPollsStartManager;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;

    invoke-static {v5}, Llive/hms/video/polls/network/HmsPollsStartManager;->access$getGetAllPollQuestions$p(Llive/hms/video/polls/network/HmsPollsStartManager;)Lc93/m;

    move-result-object v8

    invoke-virtual {v7}, Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;->getPollId()Ljava/lang/String;

    move-result-object v9

    iput-object v5, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->L$3:Ljava/lang/Object;

    iput v4, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->label:I

    invoke-interface {v8, v9, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v1, :cond_3

    goto :goto_2

    :cond_3
    move-object/from16 v17, v5

    move-object v5, v2

    move-object v2, v7

    move-object/from16 v7, v17

    :goto_1
    check-cast v8, Llive/hms/video/polls/network/QuestionContainer;

    invoke-virtual {v7}, Llive/hms/video/polls/network/HmsPollsStartManager;->getTAG()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "PreGet "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v9

    invoke-virtual {v8}, Llive/hms/video/polls/network/QuestionContainer;->isSuccess()Z

    move-result v10

    if-eqz v10, :cond_6

    new-instance v12, Llive/hms/video/polls/models/HmsPoll;

    invoke-virtual {v8}, Llive/hms/video/polls/network/QuestionContainer;->getQuestions()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v7}, Llive/hms/video/polls/network/HmsPollsStartManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v10

    sget-object v11, Llive/hms/video/polls/models/HmsPollState;->STARTED:Llive/hms/video/polls/models/HmsPollState;

    invoke-direct {v12, v2, v8, v10, v11}, Llive/hms/video/polls/models/HmsPoll;-><init>(Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;Ljava/util/List;Llive/hms/video/sdk/SDKStore;Llive/hms/video/polls/models/HmsPollState;)V

    invoke-virtual {v7}, Llive/hms/video/polls/network/HmsPollsStartManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v2

    invoke-virtual {v2}, Llive/hms/video/sdk/SDKStore;->getHmsInteractivityCenter()Llive/hms/video/interactivity/HmsInteractivityCenter;

    move-result-object v11

    if-eqz v11, :cond_4

    new-instance v2, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1$validPolls$1$1;

    invoke-direct {v2, v7, v12, v9}, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1$validPolls$1$1;-><init>(Llive/hms/video/polls/network/HmsPollsStartManager;Llive/hms/video/polls/models/HmsPoll;Lbc3/s;)V

    const/4 v13, 0x0

    const/16 v14, 0x32

    const/4 v15, 0x1

    move-object/from16 v16, v2

    invoke-virtual/range {v11 .. v16}, Llive/hms/video/interactivity/HmsInteractivityCenter;->getResponses(Llive/hms/video/polls/models/HmsPoll;IIZLlive/hms/video/sdk/HmsTypedActionResultListener;)V

    :cond_4
    iput-object v7, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->L$2:Ljava/lang/Object;

    iput-object v12, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->L$3:Ljava/lang/Object;

    iput v3, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->label:I

    invoke-virtual {v9, v0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    sget-object v8, Lr83/a;->w:Lr83/a;

    if-ne v2, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v2, v12

    :goto_3
    invoke-virtual {v7}, Llive/hms/video/polls/network/HmsPollsStartManager;->getTAG()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Success sending poll "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v7}, Llive/hms/video/polls/network/HmsPollsStartManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v8

    invoke-virtual {v8}, Llive/hms/video/sdk/SDKStore;->getHmsInteractivityCenter()Llive/hms/video/interactivity/HmsInteractivityCenter;

    move-result-object v8

    if-eqz v8, :cond_7

    invoke-virtual {v8}, Llive/hms/video/interactivity/HmsInteractivityCenter;->getPollUpdateListener()Llive/hms/video/interactivity/HmsPollUpdateListener;

    move-result-object v8

    if-eqz v8, :cond_7

    sget-object v9, Llive/hms/video/polls/models/HMSPollUpdateType;->started:Llive/hms/video/polls/models/HMSPollUpdateType;

    invoke-interface {v8, v2, v9}, Llive/hms/video/interactivity/HmsPollUpdateListener;->onPollUpdate(Llive/hms/video/polls/models/HmsPoll;Llive/hms/video/polls/models/HMSPollUpdateType;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v7}, Llive/hms/video/polls/network/HmsPollsStartManager;->getTAG()Ljava/lang/String;

    move-result-object v2

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Failure "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Llive/hms/video/polls/network/QuestionContainer;->exceptionOrNull()Ljava/lang/Throwable;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v2, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v2, 0x0

    :cond_7
    :goto_4
    if-eqz v2, :cond_8

    invoke-interface {v6, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_8
    move-object v2, v5

    move-object v5, v7

    goto/16 :goto_0

    :cond_9
    check-cast v6, Ljava/util/List;

    iget-object v1, v0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->this$0:Llive/hms/video/polls/network/HmsPollsStartManager;

    invoke-virtual {v1}, Llive/hms/video/polls/network/HmsPollsStartManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v1

    invoke-virtual {v1}, Llive/hms/video/sdk/SDKStore;->getHmsInteractivityCenter()Llive/hms/video/interactivity/HmsInteractivityCenter;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1, v6}, Llive/hms/video/interactivity/HmsInteractivityCenter;->updatePollsList$lib_release(Ljava/util/List;)V

    :cond_a
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
