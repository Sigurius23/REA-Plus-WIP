.class final Lbx1/c$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbx1/c;->h(Lcom/whoop/payments/domain/models/Card;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.membership.management.domain.interactors.checkout.CheckoutInteractor$getCardToken$2"
    f = "CheckoutInteractor.kt"
    l = {
        0x61
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lbx1/c;

.field final synthetic y:Lcom/whoop/payments/domain/models/Card;


# direct methods
.method public constructor <init>(Lbx1/c;Lcom/whoop/payments/domain/models/Card;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbx1/c;",
            "Lcom/whoop/payments/domain/models/Card;",
            "Lq83/d<",
            "-",
            "Lbx1/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbx1/c$c;->x:Lbx1/c;

    iput-object p2, p0, Lbx1/c$c;->y:Lcom/whoop/payments/domain/models/Card;

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

    new-instance p1, Lbx1/c$c;

    iget-object v0, p0, Lbx1/c$c;->x:Lbx1/c;

    iget-object v1, p0, Lbx1/c$c;->y:Lcom/whoop/payments/domain/models/Card;

    invoke-direct {p1, v0, v1, p2}, Lbx1/c$c;-><init>(Lbx1/c;Lcom/whoop/payments/domain/models/Card;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lbx1/c$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbx1/c$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbx1/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbx1/c$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    const-string v0, "substring(...)"

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lbx1/c$c;->w:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v6, :cond_0

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v3, p1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object v3, v1, Lbx1/c$c;->x:Lbx1/c;

    invoke-static {v3}, Lbx1/c;->f(Lbx1/c;)Lh32/a;

    move-result-object v3

    iput v6, v1, Lbx1/c$c;->w:I

    invoke-interface {v3, v1}, Lh32/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    check-cast v3, Lux/j0;

    if-eqz v3, :cond_3

    iget-object v2, v1, Lbx1/c$c;->y:Lcom/whoop/payments/domain/models/Card;

    new-instance v6, Ly00/m;

    invoke-virtual {v2}, Lcom/whoop/payments/domain/models/Card;->getCardNumber()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lcom/whoop/payments/domain/models/Card;->getCardExpiration()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x2

    invoke-virtual {v8, v5, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v2}, Lcom/whoop/payments/domain/models/Card;->getCardExpiration()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x4

    invoke-virtual {v10, v9, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    invoke-virtual {v2}, Lcom/whoop/payments/domain/models/Card;->getCardCvv()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Lcom/whoop/payments/domain/models/Card;->getCardZip()Ljava/lang/String;

    move-result-object v16

    new-instance v11, Ly00/c;

    const/16 v17, 0x0

    const/4 v15, 0x0

    const/4 v14, 0x0

    const/4 v13, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v11 .. v17}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct/range {v6 .. v11}, Ly00/m;-><init>(Ljava/lang/String;IILjava/lang/String;Ly00/c;)V

    invoke-static {v3, v6}, Lux/j0;->a(Lux/j0;Ly00/m;)Ly00/g8;

    move-result-object v0

    iget-object v0, v0, Ly00/g8;->w:Ljava/lang/String;
    :try_end_1
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :cond_3
    return-object v4

    :goto_1
    iget-object v2, v1, Lbx1/c$c;->x:Lbx1/c;

    invoke-static {v2}, Lbx1/c;->d(Lbx1/c;)Ltr2/n;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Stripe Exception - Create card token - "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v3, v5, [Lqr2/a$a;

    invoke-interface {v2, v0, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v4
.end method
