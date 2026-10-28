.class public final Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$$inlined$call$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->preferAudio(Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0006\u0008\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\n\u00a8\u0006\u0003"
    }
    d2 = {
        "T",
        "Lbc3/c0;",
        "kotlin.jvm.PlatformType",
        "live/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$call$3",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.connection.subscribe.queuemanagement.DataChannelRequestManager$call$3"
    f = "DataChannelRequestManager.kt"
    l = {
        0x43
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $deferredResponse:Lbc3/s;

.field label:I


# direct methods
.method public constructor <init>(Lbc3/s;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$$inlined$call$1;->$deferredResponse:Lbc3/s;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$$inlined$call$1;

    iget-object v0, p0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$$inlined$call$1;->$deferredResponse:Lbc3/s;

    invoke-direct {p1, v0, p2}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$$inlined$call$1;-><init>(Lbc3/s;Lq83/d;)V

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
            "Llive/hms/video/media/streams/models/PreferStateResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$$inlined$call$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$$inlined$call$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$$inlined$call$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$$inlined$call$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$$inlined$call$1;->label:I

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

    iget-object p1, p0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$$inlined$call$1;->$deferredResponse:Lbc3/s;

    iput v2, p0, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$preferAudio$$inlined$call$1;->label:I

    check-cast p1, Lbc3/t;

    invoke-virtual {p1, p0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/google/gson/JsonObject;

    const-string v0, "result"

    invoke-virtual {p1, v0}, Lcom/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Llive/hms/video/utils/GsonUtils;->INSTANCE:Llive/hms/video/utils/GsonUtils;

    invoke-virtual {v0}, Llive/hms/video/utils/GsonUtils;->getGson()Lcom/google/gson/Gson;

    move-result-object v0

    const-class v1, Llive/hms/video/media/streams/models/PreferStateResponse;

    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    const-string v0, "error"

    invoke-virtual {p1, v0}, Lcom/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    sget-object v0, Llive/hms/video/utils/GsonUtils;->INSTANCE:Llive/hms/video/utils/GsonUtils;

    invoke-virtual {v0}, Llive/hms/video/utils/GsonUtils;->getGson()Lcom/google/gson/Gson;

    move-result-object v0

    const-class v2, Llive/hms/video/media/streams/models/PreferStateResponseError;

    invoke-virtual {v0, p1, v2}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llive/hms/video/media/streams/models/PreferStateResponseError;

    sget-object v0, Llive/hms/video/error/ErrorFactory$TracksErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$TracksErrors;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Llive/hms/video/error/ErrorFactory$TracksErrors;->PreferLayerFailed$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/media/streams/models/PreferStateResponseError;Llive/hms/video/error/ErrorFactory$Action;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    goto :goto_1

    :cond_4
    sget-object p1, Llive/hms/video/error/ErrorFactory$TracksErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$TracksErrors;

    invoke-static {p1, v1, v2, v1}, Llive/hms/video/error/ErrorFactory$TracksErrors;->PreferLayerFailedUnknownError$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    :goto_1
    throw p1
.end method
