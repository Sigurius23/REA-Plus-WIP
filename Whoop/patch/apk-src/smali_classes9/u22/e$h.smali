.class final Lu22/e$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu22/e;->interact(Lec3/l;)Lec3/l;
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
        "Lu22/d;",
        "previousState",
        "Lu22/g;",
        "action",
        "<anonymous>",
        "(Lu22/d;Lu22/g;)Lu22/d;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.payments.feature.paymentmethodmanagement.domain.PaymentMethodManagementInteractor$interact$2"
    f = "PaymentMethodManagementInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lu22/e;


# direct methods
.method public constructor <init>(Lu22/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu22/e;",
            "Lq83/d<",
            "-",
            "Lu22/e$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lu22/e$h;->z:Lu22/e;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lu22/d;Lu22/g;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu22/d;",
            "Lu22/g;",
            "Lq83/d<",
            "-",
            "Lu22/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lu22/e$h;

    iget-object v1, p0, Lu22/e$h;->z:Lu22/e;

    invoke-direct {v0, v1, p3}, Lu22/e$h;-><init>(Lu22/e;Lq83/d;)V

    iput-object p1, v0, Lu22/e$h;->x:Ljava/lang/Object;

    iput-object p2, v0, Lu22/e$h;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lu22/e$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu22/d;

    check-cast p2, Lu22/g;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lu22/e$h;->f(Lu22/d;Lu22/g;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lu22/e$h;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lu22/d;

    iget-object v0, p0, Lu22/e$h;->y:Ljava/lang/Object;

    check-cast v0, Lu22/g;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lu22/e$h;->w:I

    if-nez v2, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lu22/g$a;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu22/e$h;->z:Lu22/e;

    check-cast v0, Lu22/g$a;

    invoke-virtual {v0}, Lu22/g$a;->a()Lu22/c;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lu22/e;->j(Lu22/e;Lu22/d;Lu22/c;)Lu22/d;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v0, Lu22/g$b;

    if-eqz p1, :cond_1

    check-cast v0, Lu22/g$b;

    invoke-virtual {v0}, Lu22/g$b;->a()Lu22/d;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v0, Lu22/g$d;

    if-eqz p1, :cond_2

    check-cast v0, Lu22/g$d;

    invoke-virtual {v0}, Lu22/g$d;->a()Lu22/b;

    move-result-object v2

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lu22/d;->b(Lu22/d;Lu22/b;Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;ZZLx22/a;ZILjava/lang/Object;)Lu22/d;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, v0, Lu22/g$c;

    if-eqz p1, :cond_3

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lu22/d;->b(Lu22/d;Lu22/b;Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;ZZLx22/a;ZILjava/lang/Object;)Lu22/d;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
