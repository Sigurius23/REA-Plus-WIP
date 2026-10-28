.class final Lbx1/c$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbx1/c;->interact(Lec3/l;)Lec3/l;
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
        "Lbx1/b;",
        "<unused var>",
        "Lbx1/d;",
        "action",
        "<anonymous>",
        "(Lbx1/b;Lbx1/d;)Lbx1/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.membership.management.domain.interactors.checkout.CheckoutInteractor$interact$2"
    f = "CheckoutInteractor.kt"
    l = {
        0x38
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lbx1/c;


# direct methods
.method public constructor <init>(Lbx1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbx1/c;",
            "Lq83/d<",
            "-",
            "Lbx1/c$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbx1/c$f;->y:Lbx1/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lbx1/b;Lbx1/d;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbx1/b;",
            "Lbx1/d;",
            "Lq83/d<",
            "-",
            "Lbx1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Lbx1/c$f;

    iget-object v0, p0, Lbx1/c$f;->y:Lbx1/c;

    invoke-direct {p1, v0, p3}, Lbx1/c$f;-><init>(Lbx1/c;Lq83/d;)V

    iput-object p2, p1, Lbx1/c$f;->x:Ljava/lang/Object;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbx1/c$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbx1/b;

    check-cast p2, Lbx1/d;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lbx1/c$f;->f(Lbx1/b;Lbx1/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lbx1/c$f;->x:Ljava/lang/Object;

    check-cast v0, Lbx1/d;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lbx1/c$f;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lbx1/d$b;->a:Lbx1/d$b;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lbx1/b$b;->a:Lbx1/b$b;

    return-object p1

    :cond_2
    instance-of p1, v0, Lbx1/d$a;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lbx1/c$f;->y:Lbx1/c;

    check-cast v0, Lbx1/d$a;

    invoke-virtual {v0}, Lbx1/d$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lbx1/d$a;->c()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v0}, Lbx1/d$a;->a()Lcom/whoop/payments/domain/models/Card;

    move-result-object v0

    const/4 v5, 0x0

    iput-object v5, p0, Lbx1/c$f;->x:Ljava/lang/Object;

    iput v3, p0, Lbx1/c$f;->w:I

    invoke-static {p1, v2, v4, v0, p0}, Lbx1/c;->c(Lbx1/c;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/payments/domain/models/Card;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_0
    check-cast p1, Lbx1/b;

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
