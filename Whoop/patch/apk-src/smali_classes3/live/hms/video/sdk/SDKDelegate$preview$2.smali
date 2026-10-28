.class final Llive/hms/video/sdk/SDKDelegate$preview$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/SDKDelegate;->preview(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSPreviewListener;Lq83/d;)Ljava/lang/Object;
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
    c = "live.hms.video.sdk.SDKDelegate$preview$2"
    f = "SDKDelegate.kt"
    l = {
        0x586
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $config:Llive/hms/video/sdk/models/HMSConfig;

.field final synthetic $listener:Llive/hms/video/sdk/HMSPreviewListener;

.field label:I

.field final synthetic this$0:Llive/hms/video/sdk/SDKDelegate;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/HMSPreviewListener;Llive/hms/video/sdk/models/HMSConfig;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/SDKDelegate;",
            "Llive/hms/video/sdk/HMSPreviewListener;",
            "Llive/hms/video/sdk/models/HMSConfig;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/SDKDelegate$preview$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iput-object p2, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->$listener:Llive/hms/video/sdk/HMSPreviewListener;

    iput-object p3, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->$config:Llive/hms/video/sdk/models/HMSConfig;

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

    new-instance p1, Llive/hms/video/sdk/SDKDelegate$preview$2;

    iget-object v0, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->$listener:Llive/hms/video/sdk/HMSPreviewListener;

    iget-object v2, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->$config:Llive/hms/video/sdk/models/HMSConfig;

    invoke-direct {p1, v0, v1, v2, p2}, Llive/hms/video/sdk/SDKDelegate$preview$2;-><init>(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/HMSPreviewListener;Llive/hms/video/sdk/models/HMSConfig;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$preview$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/SDKDelegate$preview$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/SDKDelegate$preview$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$preview$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->label:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getHasJoined$p(Llive/hms/video/sdk/SDKDelegate;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->$listener:Llive/hms/video/sdk/HMSPreviewListener;

    invoke-static {p1, v1}, Llive/hms/video/sdk/SDKDelegate;->access$setErrorListener$p(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/IErrorListener;)V

    :cond_2
    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$isQalink$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/IsQaLink;

    move-result-object p1

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->$config:Llive/hms/video/sdk/models/HMSConfig;

    invoke-virtual {p1, v1}, Llive/hms/video/transport/IsQaLink;->updateIsQaLink(Llive/hms/video/sdk/models/HMSConfig;)V

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getPerformanceMeasurement(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/models/PerformanceMeasurement;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/sdk/models/PerformanceMeasurement;->startPreview$lib_release()V

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getTransportLayer(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/ITransport;

    move-result-object p1

    invoke-interface {p1}, Llive/hms/video/transport/ITransport;->isSocketConnectionOpen()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object v4, Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;

    sget-object v5, Llive/hms/video/error/ErrorFactory$Action;->PREVIEW:Llive/hms/video/error/ErrorFactory$Action;

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;->PreviewAlreadyStarted$default(Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    iget-object v0, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->$listener:Llive/hms/video/sdk/HMSPreviewListener;

    invoke-interface {v0, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-object v2

    :cond_3
    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Llive/hms/video/sdk/SDKDelegate;->access$setPreviewListenerCalled$p(Llive/hms/video/sdk/SDKDelegate;Z)V

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getStore$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SDKStore;

    move-result-object p1

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->$config:Llive/hms/video/sdk/models/HMSConfig;

    invoke-virtual {p1, v1}, Llive/hms/video/sdk/SDKStore;->initWithConfig(Llive/hms/video/sdk/models/HMSConfig;)V

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getStore$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SDKStore;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v5

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getTransportLayer(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/ITransport;

    move-result-object v4

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->$config:Llive/hms/video/sdk/models/HMSConfig;

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSConfig;->getAuthtoken()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v1}, Llive/hms/video/sdk/SDKDelegate;->access$getStore$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SDKStore;

    move-result-object v1

    invoke-virtual {v1}, Llive/hms/video/sdk/SDKStore;->get_room()Llive/hms/video/sdk/models/HMSRoom;

    move-result-object v8

    const/16 v10, 0x10

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    move-object v7, v5

    move-object v5, p1

    invoke-static/range {v4 .. v11}, Llive/hms/video/transport/ITransport$DefaultImpls;->updateAnalyticsParams$default(Llive/hms/video/transport/ITransport;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/HMSRoom;Ljava/lang/String;ILjava/lang/Object;)V

    move-object v5, v7

    sget-object p1, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    invoke-virtual {p1}, Llive/hms/video/utils/HMSCoroutineScope;->getCoroutineContext()Lq83/j;

    move-result-object p1

    new-instance v4, Llive/hms/video/sdk/SDKDelegate$preview$2$1;

    iget-object v6, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-object v7, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->$listener:Llive/hms/video/sdk/HMSPreviewListener;

    iget-object v8, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->$config:Llive/hms/video/sdk/models/HMSConfig;

    invoke-direct/range {v4 .. v9}, Llive/hms/video/sdk/SDKDelegate$preview$2$1;-><init>(Llive/hms/video/sdk/models/HMSLocalPeer;Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/HMSPreviewListener;Llive/hms/video/sdk/models/HMSConfig;Lq83/d;)V

    iput v3, p0, Llive/hms/video/sdk/SDKDelegate$preview$2;->label:I

    invoke-static {p1, v4, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    return-object v2
.end method
