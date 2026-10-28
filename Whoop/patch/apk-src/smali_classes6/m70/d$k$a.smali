.class final Lm70/d$k$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm70/d$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lcom/whoop/membership/extensions/domain/models/ProgressContent;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.activation.domain.interactors.payments.PaymentsInteractor$upcycleCheckout$2$response$1"
    f = "PaymentsInteractor.kt"
    l = {
        0x72
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lm70/d;

.field final synthetic y:Lkotlinx/serialization/json/JsonObject;


# direct methods
.method public constructor <init>(Lm70/d;Lkotlinx/serialization/json/JsonObject;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm70/d;",
            "Lkotlinx/serialization/json/JsonObject;",
            "Lq83/d<",
            "-",
            "Lm70/d$k$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lm70/d$k$a;->x:Lm70/d;

    iput-object p2, p0, Lm70/d$k$a;->y:Lkotlinx/serialization/json/JsonObject;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lm70/d$k$a;

    iget-object v1, p0, Lm70/d$k$a;->x:Lm70/d;

    iget-object v2, p0, Lm70/d$k$a;->y:Lkotlinx/serialization/json/JsonObject;

    invoke-direct {v0, v1, v2, p1}, Lm70/d$k$a;-><init>(Lm70/d;Lkotlinx/serialization/json/JsonObject;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lm70/d$k$a;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lm70/d$k$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lm70/d$k$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lm70/d$k$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lm70/d$k$a;->w:I

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

    iget-object p1, p0, Lm70/d$k$a;->x:Lm70/d;

    invoke-static {p1}, Lm70/d;->g(Lm70/d;)Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;

    move-result-object p1

    iget-object v1, p0, Lm70/d$k$a;->y:Lkotlinx/serialization/json/JsonObject;

    iput v2, p0, Lm70/d$k$a;->w:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;->placeOrderV2(Lkotlinx/serialization/json/JsonObject;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
