.class public final Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086@\u00a2\u0006\u0004\u0008\u000e\u0010\rJ(\u0010\u0013\u001a\u00028\u0000\"\u0006\u0008\u0000\u0010\u000f\u0018\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0086H\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u001f\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R<\u0010(\u001a*\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150&0%j\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150&`\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)\u00a8\u0006*"
    }
    d2 = {
        "Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;",
        "",
        "<init>",
        "()V",
        "Llive/hms/video/connection/HMSDataChannel;",
        "api",
        "Ll83/a0;",
        "updateDataChannel",
        "(Llive/hms/video/connection/HMSDataChannel;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;",
        "trackedDataMessage",
        "Llive/hms/video/media/streams/models/PreferStateResponse;",
        "preferVideo",
        "(Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;Lq83/d;)Ljava/lang/Object;",
        "preferAudio",
        "T",
        "Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestMethod;",
        "requestId",
        "request",
        "call",
        "(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestMethod;Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;Lq83/d;)Ljava/lang/Object;",
        "Lcom/google/gson/JsonObject;",
        "message",
        "",
        "onResponse",
        "(Lcom/google/gson/JsonObject;Lq83/d;)Ljava/lang/Object;",
        "",
        "kotlin.jvm.PlatformType",
        "TAG",
        "Ljava/lang/String;",
        "getTAG",
        "()Ljava/lang/String;",
        "dataChannel",
        "Llive/hms/video/connection/HMSDataChannel;",
        "Lmc3/a;",
        "waitForDataChannel",
        "Lmc3/a;",
        "Ljava/util/HashMap;",
        "Lbc3/s;",
        "Lkotlin/collections/HashMap;",
        "promiseMap",
        "Ljava/util/HashMap;",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;

.field private dataChannel:Llive/hms/video/connection/HMSDataChannel;

.field private final promiseMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lbc3/s;",
            ">;"
        }
    .end annotation
.end field

.field private final waitForDataChannel:Lmc3/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "DataChannelRequestManager"

    iput-object v0, p0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->TAG:Ljava/lang/String;

    new-instance v0, Lmc3/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lmc3/c;-><init>(Z)V

    iput-object v0, p0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->waitForDataChannel:Lmc3/a;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->promiseMap:Ljava/util/HashMap;

    return-void
.end method

.method public static final synthetic access$getDataChannel$p(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;)Llive/hms/video/connection/HMSDataChannel;
    .locals 0

    iget-object p0, p0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->dataChannel:Llive/hms/video/connection/HMSDataChannel;

    return-object p0
.end method

.method public static final synthetic access$getPromiseMap$p(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->promiseMap:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic access$getWaitForDataChannel$p(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;)Lmc3/a;
    .locals 0

    iget-object p0, p0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->waitForDataChannel:Lmc3/a;

    return-object p0
.end method


# virtual methods
.method public final call(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestMethod;Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestMethod;",
            "Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;",
            "Lq83/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v0

    new-instance v1, Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;

    invoke-virtual {p1}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestMethod;->getMethod()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;-><init>(Ljava/lang/String;Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->getTAG()Ljava/lang/String;

    move-result-object p1

    const-string p2, "<get-TAG>(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v2, "Sending prefer-layer request "

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->access$getPromiseMap$p(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;)Ljava/util/HashMap;

    move-result-object p1

    invoke-virtual {v1}, Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->access$getWaitForDataChannel$p(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;)Lmc3/a;

    move-result-object p1

    invoke-interface {p1, p3}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    const/4 p2, 0x0

    :try_start_0
    invoke-static {p0}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->access$getDataChannel$p(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;)Llive/hms/video/connection/HMSDataChannel;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-static {v1}, Llive/hms/video/utils/ExtensionUtilsKt;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0, p2}, Llive/hms/video/connection/HMSDataChannel;->send(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p3, v0

    goto :goto_2

    :cond_0
    :goto_0
    invoke-interface {p1, p2}, Lmc3/a;->i(Ljava/lang/Object;)V

    const/4 p1, 0x1

    :try_start_1
    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw p2
    :try_end_1
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catch_0
    :try_start_2
    sget-object p3, Llive/hms/video/error/ErrorFactory$TracksErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$TracksErrors;

    invoke-static {p3, p2, p1, p2}, Llive/hms/video/error/ErrorFactory$TracksErrors;->PreferLayerFailedUnknownError$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    throw p1

    :catchall_1
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :catch_1
    sget-object p3, Llive/hms/video/error/ErrorFactory$TracksErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$TracksErrors;

    invoke-static {p3, p2, p1, p2}, Llive/hms/video/error/ErrorFactory$TracksErrors;->PreferLayerTimeoutError$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_1
    invoke-static {p0}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->access$getPromiseMap$p(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;)Ljava/util/HashMap;

    move-result-object p2

    invoke-virtual {v1}, Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;->getId()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    throw p1

    :goto_2
    invoke-interface {p1, p2}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p3
.end method

.method public final getTAG()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public final onResponse(Lcom/google/gson/JsonObject;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/JsonObject;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string p2, "id"

    invoke-virtual {p1, p2}, Lcom/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, p2}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->promiseMap:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/s;

    if-eqz v0, :cond_0

    check-cast v0, Lbc3/t;

    invoke-virtual {v0, p1}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    iget-object p1, p0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->promiseMap:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->TAG:Ljava/lang/String;

    const-string v0, "TAG"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, " No defferred found for message with id : "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final preferAudio(Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;Lq83/d;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/media/streams/models/PreferStateResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;

    iget v3, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;

    invoke-direct {v2, v1, v0}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;-><init>(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;Lq83/d;)V

    :goto_0
    iget-object v0, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->label:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$1:Ljava/lang/Object;

    check-cast v3, Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;

    iget-object v2, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$0:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v4, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lmc3/a;

    iget-object v6, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$2:Ljava/lang/Object;

    check-cast v6, Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;

    iget-object v9, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$1:Ljava/lang/Object;

    check-cast v9, Lbc3/s;

    iget-object v10, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$0:Ljava/lang/Object;

    check-cast v10, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_2

    :catchall_1
    move-exception v0

    goto/16 :goto_9

    :cond_3
    iget-object v4, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lmc3/a;

    iget-object v9, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$2:Ljava/lang/Object;

    check-cast v9, Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;

    iget-object v10, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$1:Ljava/lang/Object;

    check-cast v10, Lbc3/s;

    iget-object v11, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$0:Ljava/lang/Object;

    check-cast v11, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestMethod;->PREFER_AUDIO_TRACK_STATE:Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestMethod;

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v4

    new-instance v9, Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;

    invoke-virtual {v0}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestMethod;->getMethod()Ljava/lang/String;

    move-result-object v10

    const/16 v14, 0xc

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v11, p1

    invoke-direct/range {v9 .. v15}, Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;-><init>(Ljava/lang/String;Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->getTAG()Ljava/lang/String;

    move-result-object v0

    const-string v10, "<get-TAG>(...)"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Sending prefer-layer request "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v11, p1

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v0, v10}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->access$getPromiseMap$p(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v9}, Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v0, v10, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->access$getWaitForDataChannel$p(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;)Lmc3/a;

    move-result-object v0

    iput-object v1, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$0:Ljava/lang/Object;

    iput-object v4, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$1:Ljava/lang/Object;

    iput-object v9, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$2:Ljava/lang/Object;

    iput-object v0, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$3:Ljava/lang/Object;

    iput v7, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->label:I

    invoke-interface {v0, v2}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v3, :cond_5

    goto :goto_4

    :cond_5
    move-object v11, v1

    move-object v10, v4

    move-object v4, v0

    :goto_1
    :try_start_2
    invoke-static {v11}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->access$getDataChannel$p(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;)Llive/hms/video/connection/HMSDataChannel;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {v9}, Llive/hms/video/utils/ExtensionUtilsKt;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    iput-object v11, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$0:Ljava/lang/Object;

    iput-object v10, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$1:Ljava/lang/Object;

    iput-object v9, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$2:Ljava/lang/Object;

    iput-object v4, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$3:Ljava/lang/Object;

    iput v6, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->label:I

    invoke-virtual {v0, v12, v2}, Llive/hms/video/connection/HMSDataChannel;->send(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_6

    goto :goto_4

    :cond_6
    move-object v6, v9

    move-object v9, v10

    move-object v10, v11

    :goto_2
    check-cast v0, Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :cond_7
    move-object v6, v9

    move-object v9, v10

    move-object v10, v11

    :goto_3
    invoke-interface {v4, v8}, Lmc3/a;->i(Ljava/lang/Object;)V

    :try_start_3
    new-instance v0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$$inlined$call$1;

    invoke-direct {v0, v9, v8}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$$inlined$call$1;-><init>(Lbc3/s;Lq83/d;)V

    iput-object v10, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$0:Ljava/lang/Object;

    iput-object v6, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->L$3:Ljava/lang/Object;

    iput v5, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$1;->label:I

    const-wide/32 v4, 0xea60

    invoke-static {v4, v5, v0, v2}, Lbc3/k2;->b(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne v0, v3, :cond_8

    :goto_4
    return-object v3

    :cond_8
    move-object v3, v6

    move-object v2, v10

    :goto_5
    invoke-static {v2}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->access$getPromiseMap$p(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;)Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v3}, Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :catchall_2
    move-exception v0

    move-object v3, v6

    move-object v2, v10

    goto :goto_8

    :catch_0
    move-object v3, v6

    move-object v2, v10

    goto :goto_6

    :catch_1
    move-object v3, v6

    move-object v2, v10

    goto :goto_7

    :catch_2
    :goto_6
    :try_start_4
    sget-object v0, Llive/hms/video/error/ErrorFactory$TracksErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$TracksErrors;

    invoke-static {v0, v8, v7, v8}, Llive/hms/video/error/ErrorFactory$TracksErrors;->PreferLayerFailedUnknownError$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object v0

    throw v0

    :catch_3
    :goto_7
    sget-object v0, Llive/hms/video/error/ErrorFactory$TracksErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$TracksErrors;

    invoke-static {v0, v8, v7, v8}, Llive/hms/video/error/ErrorFactory$TracksErrors;->PreferLayerTimeoutError$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object v0

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_8
    invoke-static {v2}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->access$getPromiseMap$p(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;)Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v3}, Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0

    :goto_9
    invoke-interface {v4, v8}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0
.end method

.method public final preferVideo(Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;Lq83/d;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/media/streams/models/PreferStateResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;

    iget v3, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;

    invoke-direct {v2, v1, v0}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;-><init>(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;Lq83/d;)V

    :goto_0
    iget-object v0, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->label:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$1:Ljava/lang/Object;

    check-cast v3, Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;

    iget-object v2, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$0:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v4, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lmc3/a;

    iget-object v6, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$2:Ljava/lang/Object;

    check-cast v6, Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;

    iget-object v9, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$1:Ljava/lang/Object;

    check-cast v9, Lbc3/s;

    iget-object v10, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$0:Ljava/lang/Object;

    check-cast v10, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_2

    :catchall_1
    move-exception v0

    goto/16 :goto_9

    :cond_3
    iget-object v4, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lmc3/a;

    iget-object v9, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$2:Ljava/lang/Object;

    check-cast v9, Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;

    iget-object v10, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$1:Ljava/lang/Object;

    check-cast v10, Lbc3/s;

    iget-object v11, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$0:Ljava/lang/Object;

    check-cast v11, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestMethod;->PREFER_VIDEO_TRACK_STATE:Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestMethod;

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v4

    new-instance v9, Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;

    invoke-virtual {v0}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestMethod;->getMethod()Ljava/lang/String;

    move-result-object v10

    const/16 v14, 0xc

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v11, p1

    invoke-direct/range {v9 .. v15}, Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;-><init>(Ljava/lang/String;Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->getTAG()Ljava/lang/String;

    move-result-object v0

    const-string v10, "<get-TAG>(...)"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Sending prefer-layer request "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v11, p1

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v0, v10}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->access$getPromiseMap$p(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v9}, Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v0, v10, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->access$getWaitForDataChannel$p(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;)Lmc3/a;

    move-result-object v0

    iput-object v1, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$0:Ljava/lang/Object;

    iput-object v4, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$1:Ljava/lang/Object;

    iput-object v9, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$2:Ljava/lang/Object;

    iput-object v0, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$3:Ljava/lang/Object;

    iput v7, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->label:I

    invoke-interface {v0, v2}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v3, :cond_5

    goto :goto_4

    :cond_5
    move-object v11, v1

    move-object v10, v4

    move-object v4, v0

    :goto_1
    :try_start_2
    invoke-static {v11}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->access$getDataChannel$p(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;)Llive/hms/video/connection/HMSDataChannel;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {v9}, Llive/hms/video/utils/ExtensionUtilsKt;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    iput-object v11, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$0:Ljava/lang/Object;

    iput-object v10, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$1:Ljava/lang/Object;

    iput-object v9, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$2:Ljava/lang/Object;

    iput-object v4, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$3:Ljava/lang/Object;

    iput v6, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->label:I

    invoke-virtual {v0, v12, v2}, Llive/hms/video/connection/HMSDataChannel;->send(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_6

    goto :goto_4

    :cond_6
    move-object v6, v9

    move-object v9, v10

    move-object v10, v11

    :goto_2
    check-cast v0, Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :cond_7
    move-object v6, v9

    move-object v9, v10

    move-object v10, v11

    :goto_3
    invoke-interface {v4, v8}, Lmc3/a;->i(Ljava/lang/Object;)V

    :try_start_3
    new-instance v0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$$inlined$call$1;

    invoke-direct {v0, v9, v8}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$$inlined$call$1;-><init>(Lbc3/s;Lq83/d;)V

    iput-object v10, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$0:Ljava/lang/Object;

    iput-object v6, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->L$3:Ljava/lang/Object;

    iput v5, v2, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferVideo$1;->label:I

    const-wide/32 v4, 0xea60

    invoke-static {v4, v5, v0, v2}, Lbc3/k2;->b(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne v0, v3, :cond_8

    :goto_4
    return-object v3

    :cond_8
    move-object v3, v6

    move-object v2, v10

    :goto_5
    invoke-static {v2}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->access$getPromiseMap$p(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;)Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v3}, Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :catchall_2
    move-exception v0

    move-object v3, v6

    move-object v2, v10

    goto :goto_8

    :catch_0
    move-object v3, v6

    move-object v2, v10

    goto :goto_6

    :catch_1
    move-object v3, v6

    move-object v2, v10

    goto :goto_7

    :catch_2
    :goto_6
    :try_start_4
    sget-object v0, Llive/hms/video/error/ErrorFactory$TracksErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$TracksErrors;

    invoke-static {v0, v8, v7, v8}, Llive/hms/video/error/ErrorFactory$TracksErrors;->PreferLayerFailedUnknownError$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object v0

    throw v0

    :catch_3
    :goto_7
    sget-object v0, Llive/hms/video/error/ErrorFactory$TracksErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$TracksErrors;

    invoke-static {v0, v8, v7, v8}, Llive/hms/video/error/ErrorFactory$TracksErrors;->PreferLayerTimeoutError$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object v0

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_8
    invoke-static {v2}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->access$getPromiseMap$p(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;)Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v3}, Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0

    :goto_9
    invoke-interface {v4, v8}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0
.end method

.method public final updateDataChannel(Llive/hms/video/connection/HMSDataChannel;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/connection/HMSDataChannel;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->waitForDataChannel:Lmc3/a;

    invoke-interface {p2}, Lmc3/a;->h()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->waitForDataChannel:Lmc3/a;

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    :cond_0
    iput-object p1, p0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->dataChannel:Llive/hms/video/connection/HMSDataChannel;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
