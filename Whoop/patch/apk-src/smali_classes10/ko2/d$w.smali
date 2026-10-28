.class final Lko2/d$w;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lko2/d;->y(Lko2/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lpg3/v0;",
        "Ll83/a0;",
        "<anonymous>",
        "()Lpg3/v0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor$processNoStripeCheckout$checkoutResponse$1"
    f = "UniversalCheckoutInteractor.kt"
    l = {
        0x22c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lko2/d;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Lcom/whoop/universalcheckout/features/checkout/domain/models/ProcessCheckoutRequestBody;


# direct methods
.method public constructor <init>(Lko2/d;Ljava/lang/String;Lcom/whoop/universalcheckout/features/checkout/domain/models/ProcessCheckoutRequestBody;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lko2/d;",
            "Ljava/lang/String;",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/ProcessCheckoutRequestBody;",
            "Lq83/d<",
            "-",
            "Lko2/d$w;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lko2/d$w;->x:Lko2/d;

    iput-object p2, p0, Lko2/d$w;->y:Ljava/lang/String;

    iput-object p3, p0, Lko2/d$w;->z:Lcom/whoop/universalcheckout/features/checkout/domain/models/ProcessCheckoutRequestBody;

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

    new-instance v0, Lko2/d$w;

    iget-object v1, p0, Lko2/d$w;->x:Lko2/d;

    iget-object v2, p0, Lko2/d$w;->y:Ljava/lang/String;

    iget-object v3, p0, Lko2/d$w;->z:Lcom/whoop/universalcheckout/features/checkout/domain/models/ProcessCheckoutRequestBody;

    invoke-direct {v0, v1, v2, v3, p1}, Lko2/d$w;-><init>(Lko2/d;Ljava/lang/String;Lcom/whoop/universalcheckout/features/checkout/domain/models/ProcessCheckoutRequestBody;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lko2/d$w;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lko2/d$w;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lko2/d$w;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lko2/d$w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lko2/d$w;->w:I

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

    iget-object p1, p0, Lko2/d$w;->x:Lko2/d;

    invoke-static {p1}, Lko2/d;->e(Lko2/d;)Lcom/whoop/universalcheckout/features/checkout/domain/CheckoutApi;

    move-result-object p1

    iget-object v1, p0, Lko2/d$w;->y:Ljava/lang/String;

    iget-object v3, p0, Lko2/d$w;->z:Lcom/whoop/universalcheckout/features/checkout/domain/models/ProcessCheckoutRequestBody;

    iput v2, p0, Lko2/d$w;->w:I

    invoke-interface {p1, v1, v3, p0}, Lcom/whoop/universalcheckout/features/checkout/domain/CheckoutApi;->processNoStripeCheckout(Ljava/lang/String;Lcom/whoop/universalcheckout/features/checkout/domain/models/ProcessCheckoutRequestBody;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
