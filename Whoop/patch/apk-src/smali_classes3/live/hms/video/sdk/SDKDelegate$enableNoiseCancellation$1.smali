.class final Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/SDKDelegate;->enableNoiseCancellation(ZLlive/hms/video/sdk/HMSActionResultListener;)V
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
    c = "live.hms.video.sdk.SDKDelegate$enableNoiseCancellation$1"
    f = "SDKDelegate.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $enable:Z

.field final synthetic $hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

.field label:I

.field final synthetic this$0:Llive/hms/video/sdk/SDKDelegate;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/SDKDelegate;ZLlive/hms/video/sdk/HMSActionResultListener;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/SDKDelegate;",
            "Z",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iput-boolean p2, p0, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->$enable:Z

    iput-object p3, p0, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->$hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

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

    new-instance p1, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;

    iget-object v0, p0, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-boolean v1, p0, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->$enable:Z

    iget-object v2, p0, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->$hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

    invoke-direct {p1, v0, v1, v2, p2}, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;-><init>(Llive/hms/video/sdk/SDKDelegate;ZLlive/hms/video/sdk/HMSActionResultListener;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->label:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getNoiseCancellationReportingUseCase$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/NoiseCancellationReportingUseCase;

    move-result-object p1

    iget-boolean v0, p0, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->$enable:Z

    invoke-virtual {p1, v0}, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->noiseCancellationState(Z)V

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getTransportLayer(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/ITransport;

    move-result-object p1

    invoke-interface {p1}, Llive/hms/video/transport/ITransport;->noiseCancellation()Llive/hms/video/factories/noisecancellation/NoiseCancellation;

    move-result-object p1

    iget-boolean v0, p0, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->$enable:Z

    invoke-interface {p1, v0}, Llive/hms/video/factories/noisecancellation/NoiseCancellation;->setNoiseCancellationEnabled(Z)V

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {p1}, Llive/hms/video/sdk/SDKDelegate;->isNoiseCancellationSupported()Llive/hms/video/factories/noisecancellation/AvailabilityStatus;

    move-result-object p1

    sget-object v0, Llive/hms/video/factories/noisecancellation/AvailabilityStatus$Available;->INSTANCE:Llive/hms/video/factories/noisecancellation/AvailabilityStatus$Available;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->access$getTransportLayer(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/ITransport;

    move-result-object v0

    invoke-interface {v0}, Llive/hms/video/transport/ITransport;->noiseCancellation()Llive/hms/video/factories/noisecancellation/NoiseCancellation;

    move-result-object v0

    invoke-interface {v0}, Llive/hms/video/factories/noisecancellation/NoiseCancellation;->getNoiseCancellationEnabled()Z

    move-result v0

    iget-boolean v1, p0, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->$enable:Z

    if-ne v0, v1, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->$hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

    invoke-interface {p1}, Llive/hms/video/sdk/HMSActionResultListener;->onSuccess()V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Llive/hms/video/factories/noisecancellation/AvailabilityStatus$NotAvailable;

    if-eqz v0, :cond_1

    iget-object v0, p0, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->$hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

    sget-object v1, Llive/hms/video/error/ErrorFactory;->INSTANCE:Llive/hms/video/error/ErrorFactory;

    check-cast p1, Llive/hms/video/factories/noisecancellation/AvailabilityStatus$NotAvailable;

    invoke-virtual {v1, p1}, Llive/hms/video/error/ErrorFactory;->NoiseCancellationNotAvailable(Llive/hms/video/factories/noisecancellation/AvailabilityStatus$NotAvailable;)Llive/hms/video/error/HMSException;

    move-result-object p1

    invoke-interface {v0, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->$hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

    sget-object v0, Llive/hms/video/error/ErrorFactory;->INSTANCE:Llive/hms/video/error/ErrorFactory;

    iget-boolean v1, p0, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->$enable:Z

    iget-object v2, p0, Llive/hms/video/sdk/SDKDelegate$enableNoiseCancellation$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v2}, Llive/hms/video/sdk/SDKDelegate;->access$getTransportLayer(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/ITransport;

    move-result-object v2

    invoke-interface {v2}, Llive/hms/video/transport/ITransport;->noiseCancellation()Llive/hms/video/factories/noisecancellation/NoiseCancellation;

    move-result-object v2

    invoke-interface {v2}, Llive/hms/video/factories/noisecancellation/NoiseCancellation;->getNoiseCancellationEnabled()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Llive/hms/video/error/ErrorFactory;->NoiseCancellationToggleFailed(ZZ)Llive/hms/video/error/HMSException;

    move-result-object v0

    invoke-interface {p1, v0}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
