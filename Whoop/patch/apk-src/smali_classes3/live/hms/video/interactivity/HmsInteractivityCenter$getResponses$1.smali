.class final Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/interactivity/HmsInteractivityCenter;->getResponses(Llive/hms/video/polls/models/HmsPoll;IIZLlive/hms/video/sdk/HmsTypedActionResultListener;)V
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
        "\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Llive/hms/video/polls/models/network/HMSPollQuestionResponse;",
        "i",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;"
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
    c = "live.hms.video.interactivity.HmsInteractivityCenter$getResponses$1"
    f = "HmsInteractivityCenter.kt"
    l = {
        0x10b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $poll:Llive/hms/video/polls/models/HmsPoll;

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;


# direct methods
.method public constructor <init>(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/polls/models/HmsPoll;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/interactivity/HmsInteractivityCenter;",
            "Llive/hms/video/polls/models/HmsPoll;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    iput-object p2, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;->$poll:Llive/hms/video/polls/models/HmsPoll;

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

    new-instance v0, Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;

    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    iget-object v2, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;->$poll:Llive/hms/video/polls/models/HmsPoll;

    invoke-direct {v0, v1, v2, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;-><init>(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/polls/models/HmsPoll;Lq83/d;)V

    iput-object p1, v0, Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;->invoke(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/network/HMSPollQuestionResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;->label:I

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

    iget-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;->L$0:Ljava/lang/Object;

    check-cast p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;

    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-static {v1}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getGetResponsesInternal$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Lc93/m;

    move-result-object v1

    iput v2, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;->label:I

    invoke-interface {v1, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Llive/hms/video/polls/network/PollGetResponsesReply;

    iget-object v0, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-static {v0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getSdkStore$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Llive/hms/video/sdk/SDKStore;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v0

    invoke-virtual {p1}, Llive/hms/video/polls/network/PollGetResponsesReply;->getResponses()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    iget-object v2, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$getResponses$1;->$poll:Llive/hms/video/polls/models/HmsPoll;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llive/hms/video/polls/models/network/SingleResponse;

    invoke-virtual {v3}, Llive/hms/video/polls/models/network/SingleResponse;->getPeer()Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;

    move-result-object v4

    invoke-virtual {v4}, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->getPeerid()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSPeer;->getPeerID()Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_4
    move-object v6, v5

    :goto_2
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    invoke-virtual {v3}, Llive/hms/video/polls/models/network/SingleResponse;->getPeer()Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;

    move-result-object v4

    invoke-virtual {v4}, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->getUserid()Ljava/lang/String;

    move-result-object v4

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSPeer;->getCustomerUserID()Ljava/lang/String;

    move-result-object v6

    goto :goto_3

    :cond_5
    move-object v6, v5

    :goto_3
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_6
    invoke-virtual {v2}, Llive/hms/video/polls/models/HmsPoll;->getQuestions()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_3

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Llive/hms/video/polls/models/question/HMSPollQuestion;

    invoke-virtual {v7}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getQuestionID()I

    move-result v7

    invoke-virtual {v3}, Llive/hms/video/polls/models/network/SingleResponse;->getResponse()Llive/hms/video/polls/models/network/HMSPollQuestionResponse;

    move-result-object v8

    invoke-virtual {v8}, Llive/hms/video/polls/models/network/HMSPollQuestionResponse;->getIndex()I

    move-result v8

    if-ne v7, v8, :cond_7

    move-object v5, v6

    :cond_8
    check-cast v5, Llive/hms/video/polls/models/question/HMSPollQuestion;

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Llive/hms/video/polls/models/question/HMSPollQuestion;->getMyResponses()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_3

    new-instance v5, Llive/hms/video/polls/models/answer/HmsPollAnswer;

    invoke-virtual {v3}, Llive/hms/video/polls/models/network/SingleResponse;->getResponse()Llive/hms/video/polls/models/network/HMSPollQuestionResponse;

    move-result-object v3

    invoke-direct {v5, v3}, Llive/hms/video/polls/models/answer/HmsPollAnswer;-><init>(Llive/hms/video/polls/models/network/HMSPollQuestionResponse;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_9
    invoke-virtual {p1}, Llive/hms/video/polls/network/PollGetResponsesReply;->getResponses()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/polls/models/network/SingleResponse;

    invoke-virtual {v1}, Llive/hms/video/polls/models/network/SingleResponse;->getResponse()Llive/hms/video/polls/models/network/HMSPollQuestionResponse;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    return-object v0
.end method
