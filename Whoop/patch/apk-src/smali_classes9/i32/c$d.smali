.class final Li32/c$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li32/c;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Li32/b;",
        "state",
        "Li32/c$a;",
        "internalAction",
        "<anonymous>",
        "(Li32/b;Li32/c$a;)Li32/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.payments.stripepaymentsheettileminiarch.domain.MiniArchStripePaymentSheetTileInteractor$interact$2"
    f = "MiniArchStripePaymentSheetTileInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Li32/c$d;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Li32/b;Li32/c$a;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li32/b;",
            "Li32/c$a;",
            "Lq83/d<",
            "-",
            "Li32/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Li32/c$d;

    invoke-direct {v0, p3}, Li32/c$d;-><init>(Lq83/d;)V

    iput-object p1, v0, Li32/c$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Li32/c$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Li32/c$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li32/b;

    check-cast p2, Li32/c$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Li32/c$d;->f(Li32/b;Li32/c$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Li32/c$d;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Li32/b;

    iget-object v0, p0, Li32/c$d;->y:Ljava/lang/Object;

    check-cast v0, Li32/c$a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Li32/c$d;->w:I

    if-nez v2, :cond_7

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Li32/c$a$d;

    if-eqz p1, :cond_0

    check-cast v0, Li32/c$a$d;

    invoke-virtual {v0}, Li32/c$a$d;->a()Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x26

    const/4 v9, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Li32/b;->b(Li32/b;ZLcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Li32/b;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v0, Li32/c$a$e;

    if-eqz p1, :cond_3

    check-cast v0, Li32/c$a$e;

    invoke-virtual {v0}, Li32/c$a$e;->a()Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;

    move-result-object v3

    invoke-virtual {v1}, Li32/b;->d()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {v0}, Li32/c$a$e;->a()Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->getDefaultPaymentMethodOnFile()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_0
    move v7, p1

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p1, 0x1

    goto :goto_0

    :goto_2
    const/16 v8, 0x14

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Li32/b;->b(Li32/b;ZLcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Li32/b;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, v0, Li32/c$a$a;

    if-eqz p1, :cond_4

    check-cast v0, Li32/c$a$a;

    invoke-virtual {v0}, Li32/c$a$a;->a()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x36

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Li32/b;->b(Li32/b;ZLcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Li32/b;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, v0, Li32/c$a$c;

    if-eqz p1, :cond_5

    check-cast v0, Li32/c$a$c;

    invoke-virtual {v0}, Li32/c$a$c;->a()Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;

    move-result-object v4

    const/16 v8, 0x3a

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Li32/b;->b(Li32/b;ZLcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Li32/b;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of p1, v0, Li32/c$a$b;

    if-eqz p1, :cond_6

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static/range {v1 .. v9}, Li32/b;->b(Li32/b;ZLcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Li32/b;

    move-result-object p1

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
