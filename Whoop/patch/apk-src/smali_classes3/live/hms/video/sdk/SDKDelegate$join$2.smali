.class final Llive/hms/video/sdk/SDKDelegate$join$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/SDKDelegate;->join(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSUpdateListener;Lq83/d;)Ljava/lang/Object;
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
    c = "live.hms.video.sdk.SDKDelegate$join$2"
    f = "SDKDelegate.kt"
    l = {
        0x5f0
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $config:Llive/hms/video/sdk/models/HMSConfig;

.field final synthetic $hmsUpdateListener:Llive/hms/video/sdk/HMSUpdateListener;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/sdk/SDKDelegate;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/HMSUpdateListener;Llive/hms/video/sdk/models/HMSConfig;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/SDKDelegate;",
            "Llive/hms/video/sdk/HMSUpdateListener;",
            "Llive/hms/video/sdk/models/HMSConfig;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/SDKDelegate$join$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iput-object p2, p0, Llive/hms/video/sdk/SDKDelegate$join$2;->$hmsUpdateListener:Llive/hms/video/sdk/HMSUpdateListener;

    iput-object p3, p0, Llive/hms/video/sdk/SDKDelegate$join$2;->$config:Llive/hms/video/sdk/models/HMSConfig;

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

    new-instance p1, Llive/hms/video/sdk/SDKDelegate$join$2;

    iget-object v0, p0, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$join$2;->$hmsUpdateListener:Llive/hms/video/sdk/HMSUpdateListener;

    iget-object v2, p0, Llive/hms/video/sdk/SDKDelegate$join$2;->$config:Llive/hms/video/sdk/models/HMSConfig;

    invoke-direct {p1, v0, v1, v2, p2}, Llive/hms/video/sdk/SDKDelegate$join$2;-><init>(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/HMSUpdateListener;Llive/hms/video/sdk/models/HMSConfig;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$join$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/SDKDelegate$join$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/SDKDelegate$join$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$join$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v1, p0

    const-string v0, "time taken to parse auth token : "

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->label:I

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v5, :cond_0

    iget-object v0, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->L$0:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/sdk/models/HMSLocalPeer;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v3, v6, v7}, Llive/hms/video/sdk/SDKDelegate;->access$setTimeBeforeJoin$p(Llive/hms/video/sdk/SDKDelegate;J)V

    iget-object v3, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v3}, Llive/hms/video/sdk/SDKDelegate;->access$getHasJoined$p(Llive/hms/video/sdk/SDKDelegate;)Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v6, Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;

    sget-object v7, Llive/hms/video/error/ErrorFactory$Action;->JOIN:Llive/hms/video/error/ErrorFactory$Action;

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v6 .. v12}, Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;->AlreadyJoined$default(Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object v0

    iget-object v2, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->$hmsUpdateListener:Llive/hms/video/sdk/HMSUpdateListener;

    invoke-interface {v2, v0}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-object v4

    :cond_2
    iget-object v3, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v3}, Llive/hms/video/sdk/SDKDelegate;->access$isQalink$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/IsQaLink;

    move-result-object v3

    iget-object v6, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->$config:Llive/hms/video/sdk/models/HMSConfig;

    invoke-virtual {v3, v6}, Llive/hms/video/transport/IsQaLink;->updateIsQaLink(Llive/hms/video/sdk/models/HMSConfig;)V

    iget-object v3, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v3}, Llive/hms/video/sdk/SDKDelegate;->access$getPerformanceMeasurement(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/models/PerformanceMeasurement;

    move-result-object v3

    sget-object v6, Llive/hms/video/sdk/models/EVENT_TYPE;->JOIN_CALL:Llive/hms/video/sdk/models/EVENT_TYPE;

    invoke-virtual {v3, v6}, Llive/hms/video/sdk/models/PerformanceMeasurement;->start$lib_release(Llive/hms/video/sdk/models/EVENT_TYPE;)V

    iget-object v3, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-object v6, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->$config:Llive/hms/video/sdk/models/HMSConfig;

    invoke-virtual {v3, v6}, Llive/hms/video/sdk/SDKDelegate;->setHmsConfig(Llive/hms/video/sdk/models/HMSConfig;)V

    iget-object v3, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v3}, Llive/hms/video/sdk/SDKDelegate;->access$getLowSpeedDuringPreviewEarlyWarning$p(Llive/hms/video/sdk/SDKDelegate;)Lbc3/i0;

    move-result-object v3

    const/4 v6, 0x0

    if-eqz v3, :cond_3

    check-cast v3, Lbc3/t1;

    invoke-virtual {v3, v6}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_3
    iget-object v3, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v3}, Llive/hms/video/sdk/SDKDelegate;->access$getPreviewSpeedTestUseCase$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SpeedTestUseCase;

    move-result-object v3

    invoke-virtual {v3}, Llive/hms/video/sdk/SpeedTestUseCase;->close()V

    iget-object v3, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-object v7, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->$hmsUpdateListener:Llive/hms/video/sdk/HMSUpdateListener;

    invoke-static {v3, v7}, Llive/hms/video/sdk/SDKDelegate;->access$setErrorListener$p(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/IErrorListener;)V

    iget-object v3, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-object v7, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->$hmsUpdateListener:Llive/hms/video/sdk/HMSUpdateListener;

    invoke-static {v3, v7}, Llive/hms/video/sdk/SDKDelegate;->access$setHmsUpdateListener$p(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/HMSUpdateListener;)V

    iget-object v3, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v3}, Llive/hms/video/sdk/SDKDelegate;->access$getStore$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SDKStore;

    move-result-object v3

    invoke-virtual {v3}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v3

    const/4 v7, 0x0

    if-eqz v3, :cond_5

    iget-object v3, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v3}, Llive/hms/video/sdk/SDKDelegate;->access$getStore$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SDKStore;

    move-result-object v3

    invoke-virtual {v3}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSPeer;->getName()Ljava/lang/String;

    move-result-object v6

    :cond_4
    iget-object v3, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->$config:Llive/hms/video/sdk/models/HMSConfig;

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSConfig;->getUserName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    move v13, v5

    goto :goto_0

    :cond_5
    move v13, v7

    :goto_0
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    iget-object v3, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v3}, Llive/hms/video/sdk/SDKDelegate;->access$getStore$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SDKStore;

    move-result-object v3

    iget-object v6, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->$config:Llive/hms/video/sdk/models/HMSConfig;

    invoke-virtual {v3, v6}, Llive/hms/video/sdk/SDKStore;->initWithConfig(Llive/hms/video/sdk/models/HMSConfig;)V

    const-string v3, "Profiling"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    sub-long/2addr v10, v8

    invoke-virtual {v6, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->access$getStore$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SDKStore;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore;->getHmsSessionStore()Llive/hms/video/sessionstore/HmsSessionStore;

    move-result-object v0

    if-nez v0, :cond_6

    iget-object v0, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->access$getStore$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SDKStore;

    move-result-object v0

    new-instance v14, Llive/hms/video/sessionstore/HmsSessionStore;

    new-instance v15, Llive/hms/video/sdk/SDKDelegate$join$2$1;

    iget-object v3, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v3}, Llive/hms/video/sdk/SDKDelegate;->access$getTransportLayer(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/ITransport;

    move-result-object v3

    invoke-direct {v15, v3}, Llive/hms/video/sdk/SDKDelegate$join$2$1;-><init>(Ljava/lang/Object;)V

    new-instance v3, Llive/hms/video/sdk/SDKDelegate$join$2$2;

    iget-object v6, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v6}, Llive/hms/video/sdk/SDKDelegate;->access$getTransportLayer(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/ITransport;

    move-result-object v6

    invoke-direct {v3, v6}, Llive/hms/video/sdk/SDKDelegate$join$2$2;-><init>(Ljava/lang/Object;)V

    new-instance v6, Llive/hms/video/sdk/SDKDelegate$join$2$3;

    iget-object v8, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v8}, Llive/hms/video/sdk/SDKDelegate;->access$getTransportLayer(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/ITransport;

    move-result-object v8

    invoke-direct {v6, v8}, Llive/hms/video/sdk/SDKDelegate$join$2$3;-><init>(Ljava/lang/Object;)V

    const/16 v19, 0x8

    const/16 v20, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v3

    move-object/from16 v17, v6

    invoke-direct/range {v14 .. v20}, Llive/hms/video/sessionstore/HmsSessionStore;-><init>(Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v14}, Llive/hms/video/sdk/SDKStore;->setHmsSessionStore(Llive/hms/video/sessionstore/HmsSessionStore;)V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_4

    :cond_6
    :goto_1
    iget-object v0, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->access$createHmsInteractivityCenterIfNeeded(Llive/hms/video/sdk/SDKDelegate;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->access$getStore$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SDKStore;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v11

    if-eqz v11, :cond_8

    iget-object v9, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-object v10, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->$config:Llive/hms/video/sdk/models/HMSConfig;

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    invoke-virtual {v0}, Llive/hms/video/utils/HMSCoroutineScope;->getCoroutineContext()Lq83/j;

    move-result-object v0

    new-instance v8, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;

    const/4 v14, 0x0

    move-object v12, v11

    invoke-direct/range {v8 .. v14}, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;-><init>(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/models/HMSLocalPeer;Llive/hms/video/sdk/models/HMSLocalPeer;ZLq83/d;)V

    iput-object v11, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->L$0:Ljava/lang/Object;

    iput v5, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->label:I

    invoke-static {v0, v8, v1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_7

    return-object v2

    :cond_7
    move-object v0, v11

    :goto_2
    move-object v15, v0

    goto :goto_3

    :cond_8
    const-string v0, "SDKDelegate"

    const-string v2, "Local Peer is null"

    invoke-static {v0, v2}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    move-object v15, v11

    :goto_3
    iget-object v0, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->access$getTransportLayer(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/ITransport;

    move-result-object v12

    iget-object v0, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->$config:Llive/hms/video/sdk/models/HMSConfig;

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSConfig;->getAuthtoken()Ljava/lang/String;

    move-result-object v13

    iget-object v0, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->access$getStore$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SDKStore;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore;->get_room()Llive/hms/video/sdk/models/HMSRoom;

    move-result-object v16

    const/16 v18, 0x10

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    invoke-static/range {v12 .. v19}, Llive/hms/video/transport/ITransport$DefaultImpls;->updateAnalyticsParams$default(Llive/hms/video/transport/ITransport;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/HMSRoom;Ljava/lang/String;ILjava/lang/Object;)V

    return-object v4

    :goto_4
    iget-object v2, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v2}, Llive/hms/video/sdk/SDKDelegate;->access$getPerformanceMeasurement(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/models/PerformanceMeasurement;

    move-result-object v2

    sget-object v3, Llive/hms/video/sdk/models/EVENT_TYPE;->JOIN_CALL:Llive/hms/video/sdk/models/EVENT_TYPE;

    invoke-virtual {v2, v3}, Llive/hms/video/sdk/models/PerformanceMeasurement;->end$lib_release(Llive/hms/video/sdk/models/EVENT_TYPE;)Llive/hms/video/sdk/models/PerformanceMeasurement;

    move-result-object v2

    invoke-virtual {v2, v7}, Llive/hms/video/sdk/models/PerformanceMeasurement;->fireJoinPerformanceMeasurementEvent$lib_release(Z)V

    iget-object v2, v1, Llive/hms/video/sdk/SDKDelegate$join$2;->$hmsUpdateListener:Llive/hms/video/sdk/HMSUpdateListener;

    invoke-interface {v2, v0}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-object v4
.end method
