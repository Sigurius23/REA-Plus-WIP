.class public final Lp6/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq83/h;


# instance fields
.field public final synthetic w:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic x:Ldc3/u;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Ldc3/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/n;->w:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p2, p0, Lp6/n;->x:Ldc3/u;

    return-void
.end method


# virtual methods
.method public final a(Lc93/m;Ls83/c;)V
    .locals 4

    instance-of v0, p2, Lp6/m;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp6/m;

    iget v1, v0, Lp6/m;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp6/m;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp6/m;

    invoke-direct {v0, p0, p2}, Lp6/m;-><init>(Lp6/n;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lp6/m;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp6/m;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Lp6/m;->w:Lc93/m;

    iput v3, v0, Lp6/m;->z:I

    new-instance p2, Lbc3/m;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    invoke-direct {p2, v3, v0}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {p2}, Lbc3/m;->s()V

    new-instance v0, Ls;

    const/16 v2, 0x10

    iget-object v3, p0, Lp6/n;->x:Ldc3/u;

    invoke-direct {v0, v3, v2}, Ls;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, v0}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, Lp6/n;->w:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/k;

    if-eqz v0, :cond_3

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Lbc3/k;->cancel(Ljava/lang/Throwable;)Z

    :cond_3
    check-cast v3, Ldc3/t;

    invoke-virtual {v3, p1}, Ldc3/t;->s(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-void

    :cond_4
    :goto_1
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Lq83/i;)Lq83/h;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->D(Lq83/h;Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Lq83/i;
    .locals 1

    sget-object v0, Lp6/t;->w:Lp6/t;

    return-object v0
.end method

.method public final minusKey(Lq83/i;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->Q(Lq83/h;Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final plus(Lq83/j;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1
.end method
