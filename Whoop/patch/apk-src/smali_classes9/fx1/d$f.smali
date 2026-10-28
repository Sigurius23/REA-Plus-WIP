.class final Lfx1/d$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfx1/d;->m(Lcom/whoop/payments/domain/models/Card;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "<anonymous>",
        "(Lbc3/c0;)Ljava/lang/String;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.membership.management.domain.interactors.membershipAdjustment.MembershipAdjustmentCheckoutInteractor$getCardToken$2"
    f = "MembershipAdjustmentCheckoutInteractor.kt"
    l = {
        0xcb
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lfx1/d;

.field final synthetic y:Lcom/whoop/payments/domain/models/Card;


# direct methods
.method public constructor <init>(Lfx1/d;Lcom/whoop/payments/domain/models/Card;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfx1/d;",
            "Lcom/whoop/payments/domain/models/Card;",
            "Lq83/d<",
            "-",
            "Lfx1/d$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfx1/d$f;->x:Lfx1/d;

    iput-object p2, p0, Lfx1/d$f;->y:Lcom/whoop/payments/domain/models/Card;

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

    new-instance p1, Lfx1/d$f;

    iget-object v0, p0, Lfx1/d$f;->x:Lfx1/d;

    iget-object v1, p0, Lfx1/d$f;->y:Lcom/whoop/payments/domain/models/Card;

    invoke-direct {p1, v0, v1, p2}, Lfx1/d$f;-><init>(Lfx1/d;Lcom/whoop/payments/domain/models/Card;Lq83/d;)V

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
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lfx1/d$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfx1/d$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfx1/d$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfx1/d$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    const-string v0, "substring(...)"

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lfx1/d$f;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lfx1/d$f;->x:Lfx1/d;

    invoke-static {p1}, Lfx1/d;->f(Lfx1/d;)Lh32/a;

    move-result-object p1

    iput v3, p0, Lfx1/d$f;->w:I

    invoke-interface {p1, p0}, Lh32/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast p1, Lux/j0;

    if-eqz p1, :cond_3

    iget-object v1, p0, Lfx1/d$f;->y:Lcom/whoop/payments/domain/models/Card;

    new-instance v2, Ly00/m;

    invoke-virtual {v1}, Lcom/whoop/payments/domain/models/Card;->getCardNumber()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/payments/domain/models/Card;->getCardExpiration()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v1}, Lcom/whoop/payments/domain/models/Card;->getCardExpiration()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x4

    invoke-virtual {v5, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v1}, Lcom/whoop/payments/domain/models/Card;->getCardCvv()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/payments/domain/models/Card;->getCardZip()Ljava/lang/String;

    move-result-object v12

    new-instance v7, Ly00/c;

    const/4 v13, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x0

    const/4 v9, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v7 .. v13}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct/range {v2 .. v7}, Ly00/m;-><init>(Ljava/lang/String;IILjava/lang/String;Ly00/c;)V

    invoke-static {p1, v2}, Lux/j0;->a(Lux/j0;Ly00/m;)Ly00/g8;

    move-result-object p1

    iget-object p1, p1, Ly00/g8;->w:Ljava/lang/String;
    :try_end_1
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method
