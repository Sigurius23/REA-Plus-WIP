.class final Lcom/whoop/universalcheckout/features/cart/domain/d$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/universalcheckout/features/cart/domain/d;->interact(Lec3/l;)Lec3/l;
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
        "Lcom/whoop/universalcheckout/features/cart/domain/c;",
        "state",
        "Lcom/whoop/universalcheckout/features/cart/domain/e;",
        "action",
        "<anonymous>",
        "(Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/e;)Lcom/whoop/universalcheckout/features/cart/domain/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.universalcheckout.features.cart.domain.CartInteractor$interact$2"
    f = "CartInteractor.kt"
    l = {
        0x37,
        0x38
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/universalcheckout/features/cart/domain/d;


# direct methods
.method public constructor <init>(Lcom/whoop/universalcheckout/features/cart/domain/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/universalcheckout/features/cart/domain/d;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/cart/domain/d$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$f;->z:Lcom/whoop/universalcheckout/features/cart/domain/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/universalcheckout/features/cart/domain/c;",
            "Lcom/whoop/universalcheckout/features/cart/domain/e;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/cart/domain/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/universalcheckout/features/cart/domain/d$f;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$f;->z:Lcom/whoop/universalcheckout/features/cart/domain/d;

    invoke-direct {v0, v1, p3}, Lcom/whoop/universalcheckout/features/cart/domain/d$f;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/d;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/universalcheckout/features/cart/domain/d$f;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/universalcheckout/features/cart/domain/d$f;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/universalcheckout/features/cart/domain/d$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/universalcheckout/features/cart/domain/c;

    check-cast p2, Lcom/whoop/universalcheckout/features/cart/domain/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/universalcheckout/features/cart/domain/d$f;->f(Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$f;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/universalcheckout/features/cart/domain/c;

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$f;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/universalcheckout/features/cart/domain/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$f;->w:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lcom/whoop/universalcheckout/features/cart/domain/e$b;->a:Lcom/whoop/universalcheckout/features/cart/domain/e$b;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object v2, Lcom/whoop/universalcheckout/features/cart/domain/b$c;->a:Lcom/whoop/universalcheckout/features/cart/domain/b$c;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/whoop/universalcheckout/features/cart/domain/c;->b(Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/b;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/cart/domain/c;

    move-result-object p1

    return-object p1

    :cond_3
    sget-object p1, Lcom/whoop/universalcheckout/features/cart/domain/e$c;->a:Lcom/whoop/universalcheckout/features/cart/domain/e$c;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/whoop/universalcheckout/features/cart/domain/c;->b(Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/b;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/cart/domain/c;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, v0, Lcom/whoop/universalcheckout/features/cart/domain/e$a;

    const/4 v3, 0x0

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$f;->z:Lcom/whoop/universalcheckout/features/cart/domain/d;

    check-cast v0, Lcom/whoop/universalcheckout/features/cart/domain/e$a;

    iput-object v3, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$f;->x:Ljava/lang/Object;

    iput-object v3, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$f;->y:Ljava/lang/Object;

    iput v5, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$f;->w:I

    invoke-static {p1, v1, v0, p0}, Lcom/whoop/universalcheckout/features/cart/domain/d;->d(Lcom/whoop/universalcheckout/features/cart/domain/d;Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/e$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    goto :goto_1

    :cond_5
    :goto_0
    check-cast p1, Lcom/whoop/universalcheckout/features/cart/domain/c;

    return-object p1

    :cond_6
    instance-of p1, v0, Lcom/whoop/universalcheckout/features/cart/domain/e$d;

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$f;->z:Lcom/whoop/universalcheckout/features/cart/domain/d;

    check-cast v0, Lcom/whoop/universalcheckout/features/cart/domain/e$d;

    iput-object v3, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$f;->x:Ljava/lang/Object;

    iput-object v3, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$f;->y:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$f;->w:I

    invoke-static {p1, v1, v0, p0}, Lcom/whoop/universalcheckout/features/cart/domain/d;->e(Lcom/whoop/universalcheckout/features/cart/domain/d;Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/e$d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_7

    :goto_1
    return-object v2

    :cond_7
    :goto_2
    check-cast p1, Lcom/whoop/universalcheckout/features/cart/domain/c;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
