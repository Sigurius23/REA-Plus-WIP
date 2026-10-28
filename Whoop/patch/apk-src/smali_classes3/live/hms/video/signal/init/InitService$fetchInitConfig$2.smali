.class public final Llive/hms/video/signal/init/InitService$fetchInitConfig$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/signal/init/InitService;->fetchInitConfig(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "live/hms/video/signal/init/InitService$fetchInitConfig$2",
        "Lud3/k;",
        "Lud3/j;",
        "call",
        "Ljava/io/IOException;",
        "e",
        "Ll83/a0;",
        "onFailure",
        "(Lud3/j;Ljava/io/IOException;)V",
        "Lud3/x0;",
        "response",
        "onResponse",
        "(Lud3/j;Lud3/x0;)V",
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
.field final synthetic $deferred:Lbc3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/s;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbc3/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/s;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/signal/init/InitService$fetchInitConfig$2;->$deferred:Lbc3/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lud3/j;Ljava/io/IOException;)V
    .locals 9

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "e"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "fetchInitConfig: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InitService"

    invoke-virtual {p1, v1, v0, p2}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, Llive/hms/video/error/ErrorFactory$APIErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$APIErrors;

    sget-object v3, Llive/hms/video/error/ErrorFactory$Action;->INIT:Llive/hms/video/error/ErrorFactory$Action;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    move-object v4, p1

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v5, p2

    invoke-static/range {v2 .. v8}, Llive/hms/video/error/ErrorFactory$APIErrors;->EndpointUnreachable$default(Llive/hms/video/error/ErrorFactory$APIErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    iget-object p2, p0, Llive/hms/video/signal/init/InitService$fetchInitConfig$2;->$deferred:Lbc3/s;

    check-cast p2, Lbc3/t;

    invoke-virtual {p2, p1}, Lbc3/t;->completeExceptionally(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public onResponse(Lud3/j;Lud3/x0;)V
    .locals 10

    const-string v0, "fetchInitConfig: config="

    const-string v1, "call"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "response"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "fetchInitConfig: response="

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "InitService"

    invoke-static {v1, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget v3, p2, Lud3/x0;->z:I

    const/16 p1, 0xc8

    if-eq v3, p1, :cond_0

    sget-object v2, Llive/hms/video/error/ErrorFactory$APIErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$APIErrors;

    sget-object v4, Llive/hms/video/error/ErrorFactory$Action;->INIT:Llive/hms/video/error/ErrorFactory$Action;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Received "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, p2, Lud3/x0;->y:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Llive/hms/video/error/ErrorFactory$APIErrors;->HTTPError$default(Llive/hms/video/error/ErrorFactory$APIErrors;ILlive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    iget-object p2, p0, Llive/hms/video/signal/init/InitService$fetchInitConfig$2;->$deferred:Lbc3/s;

    check-cast p2, Lbc3/t;

    invoke-virtual {p2, p1}, Lbc3/t;->completeExceptionally(Ljava/lang/Throwable;)Z

    return-void

    :cond_0
    iget-object p1, p2, Lud3/x0;->G:Lud3/a1;

    const-string p2, ""

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lud3/a1;->m()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v4, p1

    goto :goto_1

    :cond_2
    :goto_0
    move-object v4, p2

    :goto_1
    :try_start_0
    sget-object p1, Llive/hms/video/utils/GsonUtils;->INSTANCE:Llive/hms/video/utils/GsonUtils;

    invoke-virtual {p1}, Llive/hms/video/utils/GsonUtils;->getGson()Lcom/google/gson/Gson;

    move-result-object p1

    const-class v2, Llive/hms/video/signal/init/InitConfig;

    invoke-virtual {p1, v4, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llive/hms/video/signal/init/InitConfig;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/signal/init/InitService$fetchInitConfig$2;->$deferred:Lbc3/s;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Lbc3/t;

    invoke-virtual {v0, p1}, Lbc3/t1;->L(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_2
    move-object v6, p1

    goto :goto_3

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :goto_3
    sget-object v2, Llive/hms/video/error/ErrorFactory$GenericErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$GenericErrors;

    sget-object v3, Llive/hms/video/error/ErrorFactory$Action;->INIT:Llive/hms/video/error/ErrorFactory$Action;

    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    move-object v5, p2

    goto :goto_4

    :cond_3
    move-object v5, p1

    :goto_4
    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Llive/hms/video/error/ErrorFactory$GenericErrors;->JsonParsingFailed$default(Llive/hms/video/error/ErrorFactory$GenericErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    sget-object p2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "fetchInitConfig: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/error/HMSException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v1, v0, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p2, p0, Llive/hms/video/signal/init/InitService$fetchInitConfig$2;->$deferred:Lbc3/s;

    check-cast p2, Lbc3/t;

    invoke-virtual {p2, p1}, Lbc3/t;->completeExceptionally(Ljava/lang/Throwable;)Z

    return-void
.end method
