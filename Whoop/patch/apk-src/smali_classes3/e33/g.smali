.class public final Le33/g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Le33/n;

.field public final synthetic F:Z

.field public final synthetic G:Ljava/lang/String;

.field public w:Ljava/lang/Object;

.field public x:Ljava/io/Serializable;

.field public y:Le33/n;

.field public z:I


# direct methods
.method public constructor <init>(Le33/n;ZLjava/lang/String;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Le33/g;->E:Le33/n;

    iput-boolean p2, p0, Le33/g;->F:Z

    iput-object p3, p0, Le33/g;->G:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4

    new-instance v0, Le33/g;

    iget-boolean v1, p0, Le33/g;->F:Z

    iget-object v2, p0, Le33/g;->G:Ljava/lang/String;

    iget-object v3, p0, Le33/g;->E:Le33/n;

    invoke-direct {v0, v3, v1, v2, p1}, Le33/g;-><init>(Le33/n;ZLjava/lang/String;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Le33/g;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le33/g;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Le33/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v1, p0

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const-string v0, "rejoin cause error in sfuClient.setPublisher, message:"

    const-string v3, "SetPublisherRequest Received error: "

    const-string v4, "Received answer: "

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v1, Le33/g;->z:I

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x3

    const/4 v10, 0x2

    const-string v11, "unknown"

    const/4 v12, 0x1

    if-eqz v6, :cond_5

    if-eq v6, v12, :cond_4

    if-eq v6, v10, :cond_2

    if-eq v6, v9, :cond_1

    if-ne v6, v8, :cond_0

    iget-object v0, v1, Le33/g;->w:Ljava/lang/Object;

    check-cast v0, Le33/n;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v6, v0

    move-object/from16 v0, p1

    goto/16 :goto_6

    :catch_0
    move-exception v0

    goto/16 :goto_9

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v6, v1, Le33/g;->x:Ljava/io/Serializable;

    check-cast v6, Lstream/video/sfu/signal/SetPublisherRequest;

    iget-object v9, v1, Le33/g;->w:Ljava/lang/Object;

    check-cast v9, Le33/n;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v8, v6

    move-object v6, v9

    move-object/from16 v9, p1

    goto/16 :goto_4

    :cond_2
    iget-object v6, v1, Le33/g;->y:Le33/n;

    iget-object v10, v1, Le33/g;->x:Ljava/io/Serializable;

    check-cast v10, Ljava/util/List;

    iget-object v13, v1, Le33/g;->w:Ljava/lang/Object;

    check-cast v13, Lorg/webrtc/SessionDescription;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object/from16 v8, p1

    :cond_3
    move-object/from16 v19, v10

    goto/16 :goto_2

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v6, p1

    goto :goto_1

    :cond_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v6, v1, Le33/g;->E:Le33/n;

    invoke-virtual {v6}, Le33/u;->f()Lb23/k;

    move-result-object v6

    iget-object v13, v1, Le33/g;->G:Ljava/lang/String;

    iget-boolean v14, v1, Le33/g;->F:Z

    iget-object v15, v6, Lb23/k;->c:Lb23/e;

    sget-object v8, Lb23/g;->y:Lb23/g;

    iget-object v9, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v15, v8, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    iget-object v9, v6, Lb23/k;->b:Lb23/j;

    iget-object v6, v6, Lb23/k;->a:Ljava/lang/String;

    const-string v15, "[negotiate] source: "

    const-string v10, ", iceRestart:"

    invoke-static {v15, v13, v10, v14}, Ld13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v8, v6, v10, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iget-object v6, v1, Le33/g;->E:Le33/n;

    iget-boolean v8, v6, Le33/n;->K:Z

    if-eqz v8, :cond_7

    invoke-virtual {v6}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->z:Lb23/g;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v3, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v5, "ICE restart in progress, skipping negotiation"

    invoke-interface {v3, v4, v0, v5, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v2

    :cond_7
    iget-boolean v8, v1, Le33/g;->F:Z

    if-eqz v8, :cond_8

    sget-object v8, Ln53/c;->b:Lorg/webrtc/MediaConstraints;

    goto :goto_0

    :cond_8
    sget-object v8, Ln53/c;->a:Lorg/webrtc/MediaConstraints;

    :goto_0
    iput v12, v1, Le33/g;->z:I

    invoke-virtual {v6, v8, v1}, Le33/u;->d(Lorg/webrtc/MediaConstraints;Ls83/c;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_9

    goto/16 :goto_5

    :cond_9
    :goto_1
    check-cast v6, Ln23/h;

    invoke-virtual {v6}, Ln23/h;->c()Ljava/lang/Object;

    move-result-object v6

    move-object v13, v6

    check-cast v13, Lorg/webrtc/SessionDescription;

    iget-object v6, v1, Le33/g;->E:Le33/n;

    iget-object v8, v6, Le33/n;->J:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    iget-object v9, v13, Lorg/webrtc/SessionDescription;->description:Ljava/lang/String;

    invoke-virtual {v6, v8, v9}, Le33/n;->r(Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v17

    iget-object v6, v1, Le33/g;->E:Le33/n;

    iget-object v6, v6, Le33/n;->G:Ll53/m;

    sget-object v21, Le33/e;->x:Le33/e;

    const/16 v22, 0x1e

    const-string v18, ";"

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v10, v17

    const-string v9, "negotiate-with-tracks"

    invoke-virtual {v6, v8, v9}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_b

    iget-object v0, v1, Le33/g;->E:Le33/n;

    invoke-virtual {v0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->y:Lb23/g;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v3, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v5, "No local tracks to publish, skipping publisher negotiate"

    invoke-interface {v3, v4, v0, v5, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_a
    return-object v2

    :cond_b
    iget-object v6, v1, Le33/g;->E:Le33/n;

    invoke-virtual {v6}, Le33/u;->f()Lb23/k;

    move-result-object v6

    iget-object v8, v6, Lb23/k;->c:Lb23/e;

    sget-object v9, Lb23/g;->z:Lb23/g;

    iget-object v14, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v8, v9, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_c

    iget-object v8, v6, Lb23/k;->b:Lb23/j;

    iget-object v6, v6, Lb23/k;->a:Ljava/lang/String;

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "Negotiating with tracks: "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v8, v9, v6, v14, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    iget-object v6, v1, Le33/g;->E:Le33/n;

    invoke-virtual {v6}, Le33/u;->f()Lb23/k;

    move-result-object v6

    iget-object v8, v6, Lb23/k;->c:Lb23/e;

    iget-object v14, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v8, v9, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_d

    iget-object v8, v6, Lb23/k;->b:Lb23/j;

    iget-object v6, v6, Lb23/k;->a:Ljava/lang/String;

    iget-object v14, v13, Lorg/webrtc/SessionDescription;->description:Ljava/lang/String;

    const-string v15, "Offer: "

    invoke-static {v15, v14}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v8, v9, v6, v14, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_d
    iget-object v6, v1, Le33/g;->E:Le33/n;

    iget-boolean v8, v1, Le33/g;->F:Z

    :try_start_3
    iput-boolean v8, v6, Le33/n;->K:Z

    iput-object v13, v1, Le33/g;->w:Ljava/lang/Object;

    iput-object v10, v1, Le33/g;->x:Ljava/io/Serializable;

    iput-object v6, v1, Le33/g;->y:Le33/n;

    const/4 v8, 0x2

    iput v8, v1, Le33/g;->z:I

    invoke-virtual {v6, v13, v1}, Le33/u;->k(Lorg/webrtc/SessionDescription;Ls83/c;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v5, :cond_3

    goto/16 :goto_5

    :goto_2
    check-cast v8, Ln23/h;

    instance-of v9, v8, Ln23/g;

    if-nez v9, :cond_10

    instance-of v9, v8, Ln23/f;

    if-eqz v9, :cond_f

    check-cast v8, Ln23/f;

    iget-object v8, v8, Ln23/f;->a:Ln23/e;

    iget-object v9, v6, Le33/n;->G:Ll53/m;

    const-string v10, "negotiate-error-setlocaldescription"

    invoke-virtual {v8}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_e

    move-object v8, v11

    :cond_e
    invoke-virtual {v9, v8, v10}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_f
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_10
    :goto_3
    iget-object v8, v13, Lorg/webrtc/SessionDescription;->description:Ljava/lang/String;

    iget-object v9, v6, Le33/n;->C:Ljava/lang/String;

    new-instance v16, Lstream/video/sfu/signal/SetPublisherRequest;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v21, 0x8

    const/16 v22, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, v8

    move-object/from16 v18, v9

    invoke-direct/range {v16 .. v22}, Lstream/video/sfu/signal/SetPublisherRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v8, v16

    iget-object v9, v6, Le33/n;->B:Lio/getstream/video/android/core/api/SignalServerService;

    iput-object v6, v1, Le33/g;->w:Ljava/lang/Object;

    iput-object v8, v1, Le33/g;->x:Ljava/io/Serializable;

    iput-object v7, v1, Le33/g;->y:Le33/n;

    const/4 v10, 0x3

    iput v10, v1, Le33/g;->z:I

    invoke-interface {v9, v8, v1}, Lio/getstream/video/android/core/api/SignalServerService;->setPublisher(Lstream/video/sfu/signal/SetPublisherRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v5, :cond_11

    goto/16 :goto_5

    :cond_11
    :goto_4
    check-cast v9, Lstream/video/sfu/signal/SetPublisherResponse;

    invoke-virtual {v6}, Le33/u;->f()Lb23/k;

    move-result-object v10

    iget-object v13, v10, Lb23/k;->c:Lb23/e;

    sget-object v14, Lb23/g;->z:Lb23/g;

    iget-object v15, v10, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v13, v14, v15}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_12

    iget-object v13, v10, Lb23/k;->b:Lb23/j;

    iget-object v10, v10, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v9}, Lstream/video/sfu/signal/SetPublisherResponse;->getSdp()Ljava/lang/String;

    move-result-object v15

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v13, v14, v10, v4, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_12
    invoke-virtual {v9}, Lstream/video/sfu/signal/SetPublisherResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object v4

    if-eqz v4, :cond_16

    invoke-virtual {v6}, Le33/u;->f()Lb23/k;

    move-result-object v4

    iget-object v10, v4, Lb23/k;->c:Lb23/e;

    sget-object v12, Lb23/g;->F:Lb23/g;

    iget-object v13, v4, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v10, v12, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_13

    iget-object v10, v4, Lb23/k;->b:Lb23/j;

    iget-object v4, v4, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v9}, Lstream/video/sfu/signal/SetPublisherResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object v13

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", SetPublisherRequest: "

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v10, v12, v4, v3, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_13
    iget-object v3, v6, Le33/n;->G:Ll53/m;

    const-string v4, "negotiate-error-setpublisher"

    invoke-virtual {v9}, Lstream/video/sfu/signal/SetPublisherResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object v8

    invoke-virtual {v8}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_14

    move-object v8, v11

    :cond_14
    invoke-virtual {v3, v8, v4}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Le33/u;->f()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v8, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v12, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_15

    iget-object v4, v3, Lb23/k;->b:Lb23/j;

    iget-object v3, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v9}, Lstream/video/sfu/signal/SetPublisherResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object v8

    invoke-virtual {v8}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object v8

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v12, v3, v0, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_15
    invoke-virtual {v9}, Lstream/video/sfu/signal/SetPublisherResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object v0

    invoke-virtual {v0}, Lstream/video/sfu/models/Error;->getCode()Lstream/video/sfu/models/ErrorCode;

    move-result-object v0

    sget-object v3, Le33/f;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_16

    iget-object v0, v6, Le33/n;->D:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_16
    new-instance v0, Lorg/webrtc/SessionDescription;

    sget-object v3, Lorg/webrtc/SessionDescription$Type;->ANSWER:Lorg/webrtc/SessionDescription$Type;

    invoke-virtual {v9}, Lstream/video/sfu/signal/SetPublisherResponse;->getSdp()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Lorg/webrtc/SessionDescription;-><init>(Lorg/webrtc/SessionDescription$Type;Ljava/lang/String;)V

    iput-object v6, v1, Le33/g;->w:Ljava/lang/Object;

    iput-object v7, v1, Le33/g;->x:Ljava/io/Serializable;

    const/4 v3, 0x4

    iput v3, v1, Le33/g;->z:I

    invoke-virtual {v6, v0, v1}, Le33/u;->l(Lorg/webrtc/SessionDescription;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_17

    :goto_5
    return-object v5

    :cond_17
    :goto_6
    check-cast v0, Ln23/h;

    instance-of v3, v0, Ln23/g;

    if-nez v3, :cond_1a

    instance-of v3, v0, Ln23/f;

    if-eqz v3, :cond_19

    move-object v3, v0

    check-cast v3, Ln23/f;

    iget-object v3, v3, Ln23/f;->a:Ln23/e;

    iget-object v4, v6, Le33/n;->G:Ll53/m;

    const-string v5, "negotiate-error-setremotedescription"

    invoke-virtual {v3}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_18

    goto :goto_7

    :cond_18
    move-object v11, v3

    :goto_7
    invoke-virtual {v4, v11, v5}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_8

    :cond_19
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1a
    :goto_8
    instance-of v3, v0, Ln23/g;

    if-eqz v3, :cond_1b

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    check-cast v0, Ll83/a0;

    invoke-virtual {v6}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->y:Lb23/g;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1d

    iget-object v3, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v5, "Publisher negotiation successfully done \u2705"

    invoke-interface {v3, v4, v0, v5, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_a

    :cond_1b
    instance-of v0, v0, Ln23/f;

    if-eqz v0, :cond_1c

    goto :goto_a

    :cond_1c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :goto_9
    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->F:Lb23/g;

    const-string v5, "SafeCall"

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1d

    sget-object v3, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    const-string v7, "Exception occurred: "

    invoke-static {v7, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v4, v5, v6, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1d
    :goto_a
    iget-object v0, v1, Le33/g;->E:Le33/n;

    const/4 v3, 0x0

    iput-boolean v3, v0, Le33/n;->K:Z

    return-object v2
.end method
