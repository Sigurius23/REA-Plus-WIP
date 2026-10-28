.class public final Lp1/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/z1;
.implements Lkotlinx/coroutines/CoroutineExceptionHandler;


# instance fields
.field public final w:Lq83/j;

.field public final x:Lc93/m;

.field public final y:Lhc3/d;

.field public z:Lbc3/c2;


# direct methods
.method public constructor <init>(Lq83/j;Lc93/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/s0;->w:Lq83/j;

    iput-object p2, p0, Lp1/s0;->x:Lc93/m;

    sget-object p2, La2/c;->x:Lqt/e;

    invoke-interface {p1, p2}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p2

    if-eqz p2, :cond_0

    move-object p2, p0

    goto :goto_0

    :cond_0
    sget-object p2, Lq83/k;->w:Lq83/k;

    :goto_0
    invoke-interface {p1, p2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Lp1/s0;->y:Lhc3/d;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lp1/s0;->z:Lbc3/c2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "Old job was still running!"

    invoke-static {v2, v1}, Ldc/a;->d(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v2

    invoke-virtual {v0, v2}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lp1/s0;->x:Lc93/m;

    const/4 v2, 0x3

    iget-object v3, p0, Lp1/s0;->y:Lhc3/d;

    invoke-static {v3, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Lp1/s0;->z:Lbc3/c2;

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lp1/s0;->z:Lbc3/c2;

    if-eqz v0, :cond_0

    new-instance v1, Lp1/u0;

    invoke-direct {v1}, Lp1/u0;-><init>()V

    invoke-virtual {v0, v1}, Lbc3/t1;->p(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lp1/s0;->z:Lbc3/c2;

    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lp1/s0;->z:Lbc3/c2;

    if-eqz v0, :cond_0

    new-instance v1, Lp1/u0;

    invoke-direct {v1}, Lp1/u0;-><init>()V

    invoke-virtual {v0, v1}, Lbc3/t1;->p(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lp1/s0;->z:Lbc3/c2;

    return-void
.end method

.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/squareup/wire/n;->C(Lp1/s0;Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Lq83/i;)Lq83/h;
    .locals 0

    invoke-static {p0, p1}, Lcom/squareup/wire/n;->D(Lp1/s0;Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Lq83/i;
    .locals 1

    sget-object v0, Lbc3/a0;->w:Lbc3/a0;

    return-object v0
.end method

.method public final handleException(Lq83/j;Ljava/lang/Throwable;)V
    .locals 3

    sget-object v0, La2/c;->x:Lqt/e;

    invoke-interface {p1, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    check-cast v0, La2/c;

    if-eqz v0, :cond_0

    new-instance v1, Li;

    const/4 v2, 0x2

    invoke-direct {v1, v2, v0, p0}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2, v1}, Ldt/b;->Y(Ljava/lang/Throwable;Lc93/a;)Z

    :cond_0
    iget-object v0, p0, Lp1/s0;->w:Lq83/j;

    sget-object v1, Lbc3/a0;->w:Lbc3/a0;

    invoke-interface {v0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/CoroutineExceptionHandler;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Lkotlinx/coroutines/CoroutineExceptionHandler;->handleException(Lq83/j;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    throw p2
.end method

.method public final minusKey(Lq83/i;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Lcom/squareup/wire/n;->S(Lp1/s0;Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final plus(Lq83/j;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Lcom/squareup/wire/n;->U(Lp1/s0;Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1
.end method
