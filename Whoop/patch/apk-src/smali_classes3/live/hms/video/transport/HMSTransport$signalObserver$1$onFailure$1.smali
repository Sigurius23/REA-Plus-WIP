.class final Llive/hms/video/transport/HMSTransport$signalObserver$1$onFailure$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/transport/HMSTransport$signalObserver$1;->onFailure(Llive/hms/video/error/HMSException;)V
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
    c = "live.hms.video.transport.HMSTransport$signalObserver$1$onFailure$1"
    f = "HMSTransport.kt"
    l = {
        0x199
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $exception:Llive/hms/video/error/HMSException;

.field label:I

.field final synthetic this$0:Llive/hms/video/transport/HMSTransport;


# direct methods
.method public constructor <init>(Llive/hms/video/transport/HMSTransport;Llive/hms/video/error/HMSException;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/transport/HMSTransport;",
            "Llive/hms/video/error/HMSException;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/transport/HMSTransport$signalObserver$1$onFailure$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1$onFailure$1;->this$0:Llive/hms/video/transport/HMSTransport;

    iput-object p2, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1$onFailure$1;->$exception:Llive/hms/video/error/HMSException;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Llive/hms/video/transport/HMSTransport$signalObserver$1$onFailure$1;

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1$onFailure$1;->this$0:Llive/hms/video/transport/HMSTransport;

    iget-object v1, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1$onFailure$1;->$exception:Llive/hms/video/error/HMSException;

    invoke-direct {p1, v0, v1, p2}, Llive/hms/video/transport/HMSTransport$signalObserver$1$onFailure$1;-><init>(Llive/hms/video/transport/HMSTransport;Llive/hms/video/error/HMSException;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/transport/HMSTransport$signalObserver$1$onFailure$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/transport/HMSTransport$signalObserver$1$onFailure$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/transport/HMSTransport$signalObserver$1$onFailure$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/transport/HMSTransport$signalObserver$1$onFailure$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1$onFailure$1;->label:I

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

    iget-object p1, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1$onFailure$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Llive/hms/video/transport/HMSTransport;->access$getConnectParameters$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/transport/models/ConnectParameters;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1$onFailure$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Llive/hms/video/transport/HMSTransport;->access$getRetryScheduler$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/transport/RetryScheduler;

    move-result-object v3

    sget-object v4, Llive/hms/video/transport/models/TransportFailureCategory;->SignalDisconnect:Llive/hms/video/transport/models/TransportFailureCategory;

    iget-object v5, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1$onFailure$1;->$exception:Llive/hms/video/error/HMSException;

    iget-object p1, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1$onFailure$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Llive/hms/video/transport/HMSTransport;->access$getRetrySignalDisconnectTask$p(Llive/hms/video/transport/HMSTransport;)Lkotlin/jvm/functions/Function1;

    move-result-object v7

    iput v2, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1$onFailure$1;->label:I

    const/4 v6, 0x1

    const-wide/16 v8, 0x0

    const/16 v11, 0x10

    const/4 v12, 0x0

    move-object v10, p0

    invoke-static/range {v3 .. v12}, Llive/hms/video/transport/RetryScheduler;->schedule$default(Llive/hms/video/transport/RetryScheduler;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/error/HMSException;ZLkotlin/jvm/functions/Function1;JLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
