.class final Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/utils/TokenUtils;->getAuthTokenByRoomCode(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/signal/init/HMSTokenListener;Llive/hms/video/utils/HMSAgentOs;)V
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
    c = "live.hms.video.utils.TokenUtils$getAuthTokenByRoomCode$1"
    f = "TokenUtils.kt"
    l = {
        0x26
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $agentOs:Llive/hms/video/utils/HMSAgentOs;

.field final synthetic $hmsTokenListener:Llive/hms/video/signal/init/HMSTokenListener;

.field final synthetic $tokenRequest:Llive/hms/video/signal/init/TokenRequest;

.field final synthetic $tokenRequestOptions:Llive/hms/video/signal/init/TokenRequestOptions;

.field label:I


# direct methods
.method public constructor <init>(Llive/hms/video/signal/init/HMSTokenListener;Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/utils/HMSAgentOs;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/init/HMSTokenListener;",
            "Llive/hms/video/signal/init/TokenRequest;",
            "Llive/hms/video/signal/init/TokenRequestOptions;",
            "Llive/hms/video/utils/HMSAgentOs;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;->$hmsTokenListener:Llive/hms/video/signal/init/HMSTokenListener;

    iput-object p2, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;->$tokenRequest:Llive/hms/video/signal/init/TokenRequest;

    iput-object p3, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;->$tokenRequestOptions:Llive/hms/video/signal/init/TokenRequestOptions;

    iput-object p4, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;->$agentOs:Llive/hms/video/utils/HMSAgentOs;

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

    new-instance v0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;

    iget-object v1, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;->$hmsTokenListener:Llive/hms/video/signal/init/HMSTokenListener;

    iget-object v2, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;->$tokenRequest:Llive/hms/video/signal/init/TokenRequest;

    iget-object v3, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;->$tokenRequestOptions:Llive/hms/video/signal/init/TokenRequestOptions;

    iget-object v4, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;->$agentOs:Llive/hms/video/utils/HMSAgentOs;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;-><init>(Llive/hms/video/signal/init/HMSTokenListener;Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/utils/HMSAgentOs;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;->label:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v11, p0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v11, p0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;->$tokenRequest:Llive/hms/video/signal/init/TokenRequest;

    iget-object v1, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;->$tokenRequestOptions:Llive/hms/video/signal/init/TokenRequestOptions;

    iget-object v4, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;->$agentOs:Llive/hms/video/utils/HMSAgentOs;

    :try_start_1
    new-instance v5, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;

    invoke-direct {v5, p1, v1, v4, v3}, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;-><init>(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/utils/HMSAgentOs;Lq83/d;)V

    new-instance v6, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$2;

    invoke-direct {v6, v3}, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$2;-><init>(Lq83/d;)V

    iput v2, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;->label:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v12, 0x38

    const/4 v13, 0x0

    move-object v11, p0

    :try_start_2
    invoke-static/range {v5 .. v13}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Llive/hms/video/signal/init/TokenResult;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    :goto_1
    move-object p1, v0

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v11, p0

    goto :goto_1

    :goto_2
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_3
    instance-of v0, p1, Ll83/m;

    if-nez v0, :cond_7

    if-eqz v0, :cond_3

    move-object v1, v3

    goto :goto_4

    :cond_3
    move-object v1, p1

    :goto_4
    if-eqz v1, :cond_7

    iget-object v1, v11, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;->$hmsTokenListener:Llive/hms/video/signal/init/HMSTokenListener;

    if-eqz v0, :cond_4

    move-object p1, v3

    :cond_4
    check-cast p1, Llive/hms/video/signal/init/TokenResult;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Llive/hms/video/signal/init/TokenResult;->getToken()Ljava/lang/String;

    move-result-object v3

    :cond_5
    if-nez v3, :cond_6

    const-string v3, ""

    :cond_6
    invoke-interface {v1, v3}, Llive/hms/video/signal/init/HMSTokenListener;->onTokenSuccess(Ljava/lang/String;)V

    goto :goto_5

    :cond_7
    if-eqz v0, :cond_8

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Llive/hms/video/error/HMSException;

    if-eqz v0, :cond_8

    iget-object v0, v11, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;->$hmsTokenListener:Llive/hms/video/signal/init/HMSTokenListener;

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type live.hms.video.error.HMSException"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Llive/hms/video/error/HMSException;

    invoke-interface {v0, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    goto :goto_5

    :cond_8
    iget-object v0, v11, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;->$hmsTokenListener:Llive/hms/video/signal/init/HMSTokenListener;

    sget-object v1, Llive/hms/video/error/ErrorFactory$GenericErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$GenericErrors;

    sget-object v2, Llive/hms/video/error/ErrorFactory$Action;->GET_TOKEN:Llive/hms/video/error/ErrorFactory$Action;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "failed to fetch token! "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Llive/hms/video/error/ErrorFactory$GenericErrors;->Unknown$default(Llive/hms/video/error/ErrorFactory$GenericErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    invoke-interface {v0, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
