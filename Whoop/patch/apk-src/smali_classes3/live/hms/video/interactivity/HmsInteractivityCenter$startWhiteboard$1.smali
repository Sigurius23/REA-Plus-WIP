.class final Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/interactivity/HmsInteractivityCenter;->startWhiteboard(Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)V
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
    c = "live.hms.video.interactivity.HmsInteractivityCenter$startWhiteboard$1"
    f = "HmsInteractivityCenter.kt"
    l = {
        0x1d2,
        0x1f0
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $completion:Llive/hms/video/sdk/HMSActionResultListener;

.field final synthetic $currentWhiteBoardId:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic $title:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;


# direct methods
.method public constructor <init>(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/sdk/HMSActionResultListener;Lkotlin/jvm/internal/g0;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/interactivity/HmsInteractivityCenter;",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            "Lkotlin/jvm/internal/g0;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    iput-object p2, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->$completion:Llive/hms/video/sdk/HMSActionResultListener;

    iput-object p3, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->$currentWhiteBoardId:Lkotlin/jvm/internal/g0;

    iput-object p4, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->$title:Ljava/lang/String;

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

    new-instance v0, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;

    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    iget-object v2, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->$completion:Llive/hms/video/sdk/HMSActionResultListener;

    iget-object v3, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->$currentWhiteBoardId:Lkotlin/jvm/internal/g0;

    iget-object v4, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->$title:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;-><init>(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/sdk/HMSActionResultListener;Lkotlin/jvm/internal/g0;Ljava/lang/String;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v0, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->label:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x1

    const-string v6, ""

    if-eqz v0, :cond_2

    if-eq v0, v5, :cond_1

    if-ne v0, v4, :cond_0

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v0, p1

    goto/16 :goto_a

    :catchall_0
    move-exception v0

    goto/16 :goto_b

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v0, p1

    goto :goto_0

    :catchall_1
    move-exception v0

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-virtual {v0, v5}, Llive/hms/video/interactivity/HmsInteractivityCenter;->setLocalWhiteBoardstart$lib_release(Z)V

    iget-object v0, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-static {v0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getCurrentWhiteBoard$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Llive/hms/video/whiteboard/HMSWhiteboard;

    move-result-object v0

    if-nez v0, :cond_d

    iget-object v0, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    iget-object v10, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->$title:Ljava/lang/String;

    :try_start_2
    invoke-static {v0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getCreateWhiteBoard$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Lc93/m;

    move-result-object v8

    move-object v9, v8

    new-instance v8, Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;

    const/16 v15, 0x3d

    const/16 v16, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v7, v17

    invoke-direct/range {v8 .. v16}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v8}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getCreateOptionsWithDefaults(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;)Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;

    move-result-object v0

    iput v5, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->label:I

    invoke-interface {v7, v0, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_3

    goto/16 :goto_9

    :cond_3
    :goto_0
    check-cast v0, Llive/hms/video/whiteboard/network/HMSCreateWhiteBoardResponse;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :goto_1
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_2
    instance-of v5, v0, Ll83/m;

    if-nez v5, :cond_a

    if-eqz v5, :cond_4

    const/4 v7, 0x0

    goto :goto_3

    :cond_4
    move-object v7, v0

    :goto_3
    check-cast v7, Llive/hms/video/whiteboard/network/HMSCreateWhiteBoardResponse;

    if-eqz v7, :cond_5

    invoke-virtual {v7}, Llive/hms/video/whiteboard/network/HMSCreateWhiteBoardResponse;->getId()Ljava/lang/String;

    move-result-object v7

    goto :goto_4

    :cond_5
    const/4 v7, 0x0

    :goto_4
    if-eqz v7, :cond_a

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_6

    goto :goto_6

    :cond_6
    iget-object v7, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->$currentWhiteBoardId:Lkotlin/jvm/internal/g0;

    if-eqz v5, :cond_7

    const/4 v0, 0x0

    :cond_7
    check-cast v0, Llive/hms/video/whiteboard/network/HMSCreateWhiteBoardResponse;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Llive/hms/video/whiteboard/network/HMSCreateWhiteBoardResponse;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_8
    const/4 v0, 0x0

    :goto_5
    if-nez v0, :cond_9

    move-object v0, v6

    :cond_9
    iput-object v0, v7, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto :goto_8

    :cond_a
    :goto_6
    iget-object v2, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->$completion:Llive/hms/video/sdk/HMSActionResultListener;

    sget-object v4, Llive/hms/video/error/ErrorFactory$GenericErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$GenericErrors;

    sget-object v5, Llive/hms/video/error/ErrorFactory$Action;->WHITEBOARD:Llive/hms/video/error/ErrorFactory$Action;

    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    if-eqz v6, :cond_b

    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_c

    :cond_b
    const-string v6, "unable to create white board"

    :cond_c
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Llive/hms/video/error/ErrorFactory$GenericErrors;->Unknown$default(Llive/hms/video/error/ErrorFactory$GenericErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object v0

    invoke-interface {v2, v0}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-object v3

    :cond_d
    iget-object v0, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->$currentWhiteBoardId:Lkotlin/jvm/internal/g0;

    iget-object v5, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-static {v5}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getCurrentWhiteBoard$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Llive/hms/video/whiteboard/HMSWhiteboard;

    move-result-object v5

    if-eqz v5, :cond_e

    invoke-virtual {v5}, Llive/hms/video/whiteboard/HMSWhiteboard;->getId()Ljava/lang/String;

    move-result-object v5

    goto :goto_7

    :cond_e
    const/4 v5, 0x0

    :goto_7
    if-nez v5, :cond_f

    move-object v5, v6

    :cond_f
    iput-object v5, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :goto_8
    iget-object v0, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    iget-object v5, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->$currentWhiteBoardId:Lkotlin/jvm/internal/g0;

    :try_start_3
    invoke-static {v0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getGetWhiteBoard$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Lc93/m;

    move-result-object v0

    iget-object v5, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput v4, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->label:I

    invoke-interface {v0, v5, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_10

    :goto_9
    return-object v2

    :cond_10
    :goto_a
    check-cast v0, Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_c

    :goto_b
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_c
    instance-of v2, v0, Ll83/m;

    if-nez v2, :cond_1f

    if-eqz v2, :cond_11

    const/4 v4, 0x0

    goto :goto_d

    :cond_11
    move-object v4, v0

    :goto_d
    check-cast v4, Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;

    if-eqz v4, :cond_12

    invoke-virtual {v4}, Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;->getId()Ljava/lang/String;

    move-result-object v4

    goto :goto_e

    :cond_12
    const/4 v4, 0x0

    :goto_e
    if-nez v4, :cond_13

    move-object v8, v6

    goto :goto_f

    :cond_13
    move-object v8, v4

    :goto_f
    iget-object v4, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-static {v4}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getSdkStore$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Llive/hms/video/sdk/SDKStore;

    move-result-object v4

    if-eqz v2, :cond_14

    const/4 v5, 0x0

    goto :goto_10

    :cond_14
    move-object v5, v0

    :goto_10
    check-cast v5, Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;

    if-eqz v5, :cond_15

    invoke-virtual {v5}, Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;->getOwner()Ljava/lang/String;

    move-result-object v5

    goto :goto_11

    :cond_15
    const/4 v5, 0x0

    :goto_11
    if-nez v5, :cond_16

    move-object v5, v6

    :cond_16
    invoke-virtual {v4, v5}, Llive/hms/video/sdk/SDKStore;->getPeerByCustomerUserId(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v10

    iget-object v4, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    if-eqz v2, :cond_17

    const/4 v5, 0x0

    goto :goto_12

    :cond_17
    move-object v5, v0

    :goto_12
    check-cast v5, Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;

    if-eqz v5, :cond_18

    invoke-virtual {v5}, Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;->getAddr()Ljava/lang/String;

    move-result-object v5

    goto :goto_13

    :cond_18
    const/4 v5, 0x0

    :goto_13
    if-nez v5, :cond_19

    move-object v5, v6

    :cond_19
    if-eqz v2, :cond_1a

    const/4 v0, 0x0

    :cond_1a
    check-cast v0, Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;->getToken()Ljava/lang/String;

    move-result-object v7

    goto :goto_14

    :cond_1b
    const/4 v7, 0x0

    :goto_14
    if-nez v7, :cond_1c

    goto :goto_15

    :cond_1c
    move-object v6, v7

    :goto_15
    invoke-static {v4, v5, v6}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$formatWhiteBoardUrl(Llive/hms/video/interactivity/HmsInteractivityCenter;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    sget-object v13, Llive/hms/video/whiteboard/State;->Started:Llive/hms/video/whiteboard/State;

    new-instance v7, Llive/hms/video/whiteboard/HMSWhiteboard;

    iget-object v9, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->$title:Ljava/lang/String;

    const/4 v11, 0x1

    invoke-direct/range {v7 .. v13}, Llive/hms/video/whiteboard/HMSWhiteboard;-><init>(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;ZLjava/lang/String;Llive/hms/video/whiteboard/State;)V

    iget-object v0, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-static {v0, v7}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$setCurrentWhiteBoard$p(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/whiteboard/HMSWhiteboard;)V

    iget-object v0, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->$completion:Llive/hms/video/sdk/HMSActionResultListener;

    invoke-interface {v0}, Llive/hms/video/sdk/HMSActionResultListener;->onSuccess()V

    iget-object v0, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-virtual {v0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->getCurrentWhiteBoardState()Llive/hms/video/whiteboard/State;

    move-result-object v0

    if-eq v0, v13, :cond_1e

    iget-object v0, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-static {v0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getWhiteBoardUpdateListener$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Llive/hms/video/whiteboard/HMSWhiteboardUpdateListener;

    move-result-object v0

    if-eqz v0, :cond_1d

    new-instance v2, Llive/hms/video/whiteboard/HMSWhiteboardUpdate$Start;

    invoke-direct {v2, v7}, Llive/hms/video/whiteboard/HMSWhiteboardUpdate$Start;-><init>(Llive/hms/video/whiteboard/HMSWhiteboard;)V

    invoke-interface {v0, v2}, Llive/hms/video/whiteboard/HMSWhiteboardUpdateListener;->onUpdate(Llive/hms/video/whiteboard/HMSWhiteboardUpdate;)V

    :cond_1d
    iget-object v0, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-virtual {v0, v13}, Llive/hms/video/interactivity/HmsInteractivityCenter;->setCurrentWhiteBoardState(Llive/hms/video/whiteboard/State;)V

    :cond_1e
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "current WHiteboard \ud83d\udca3 "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-static {v2}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getCurrentWhiteBoard$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Llive/hms/video/whiteboard/HMSWhiteboard;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Whiteboard"

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lhg3/i;->v(I)Ljava/lang/Integer;

    goto :goto_16

    :cond_1f
    iget-object v2, v1, Llive/hms/video/interactivity/HmsInteractivityCenter$startWhiteboard$1;->$completion:Llive/hms/video/sdk/HMSActionResultListener;

    sget-object v4, Llive/hms/video/error/ErrorFactory$GenericErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$GenericErrors;

    sget-object v5, Llive/hms/video/error/ErrorFactory$Action;->WHITEBOARD:Llive/hms/video/error/ErrorFactory$Action;

    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    if-eqz v6, :cond_20

    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_21

    :cond_20
    const-string v6, "unable to get white board"

    :cond_21
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Llive/hms/video/error/ErrorFactory$GenericErrors;->Unknown$default(Llive/hms/video/error/ErrorFactory$GenericErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object v0

    invoke-interface {v2, v0}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    :goto_16
    return-object v3
.end method
