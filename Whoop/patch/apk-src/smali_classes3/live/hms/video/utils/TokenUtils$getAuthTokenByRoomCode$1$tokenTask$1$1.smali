.class final Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Llive/hms/video/signal/init/TokenResult;"
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
    c = "live.hms.video.utils.TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1"
    f = "TokenUtils.kt"
    l = {
        0x27
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $agentOs:Llive/hms/video/utils/HMSAgentOs;

.field final synthetic $tokenRequest:Llive/hms/video/signal/init/TokenRequest;

.field final synthetic $tokenRequestOptions:Llive/hms/video/signal/init/TokenRequestOptions;

.field label:I


# direct methods
.method public constructor <init>(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/utils/HMSAgentOs;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/init/TokenRequest;",
            "Llive/hms/video/signal/init/TokenRequestOptions;",
            "Llive/hms/video/utils/HMSAgentOs;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;->$tokenRequest:Llive/hms/video/signal/init/TokenRequest;

    iput-object p2, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;->$tokenRequestOptions:Llive/hms/video/signal/init/TokenRequestOptions;

    iput-object p3, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;->$agentOs:Llive/hms/video/utils/HMSAgentOs;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;

    iget-object v1, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;->$tokenRequest:Llive/hms/video/signal/init/TokenRequest;

    iget-object v2, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;->$tokenRequestOptions:Llive/hms/video/signal/init/TokenRequestOptions;

    iget-object v3, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;->$agentOs:Llive/hms/video/utils/HMSAgentOs;

    invoke-direct {v0, v1, v2, v3, p1}, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;-><init>(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/utils/HMSAgentOs;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Llive/hms/video/signal/init/TokenResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Llive/hms/video/utils/TokenUtils;->INSTANCE:Llive/hms/video/utils/TokenUtils;

    iget-object v1, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;->$tokenRequest:Llive/hms/video/signal/init/TokenRequest;

    iget-object v3, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;->$tokenRequestOptions:Llive/hms/video/signal/init/TokenRequestOptions;

    iget-object v4, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;->$agentOs:Llive/hms/video/utils/HMSAgentOs;

    iput v2, p0, Llive/hms/video/utils/TokenUtils$getAuthTokenByRoomCode$1$tokenTask$1$1;->label:I

    invoke-static {p1, v1, v3, v4, p0}, Llive/hms/video/utils/TokenUtils;->access$getToken(Llive/hms/video/utils/TokenUtils;Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/utils/HMSAgentOs;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
