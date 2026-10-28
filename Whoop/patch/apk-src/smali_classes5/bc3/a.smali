.class public abstract Lbc3/a;
.super Lbc3/t1;
.source "SourceFile"

# interfaces
.implements Lq83/d;
.implements Lbc3/c0;


# instance fields
.field public final y:Lq83/j;


# direct methods
.method public constructor <init>(Lq83/j;ZZ)V
    .locals 0

    invoke-direct {p0, p3}, Lbc3/t1;-><init>(Z)V

    if-eqz p2, :cond_0

    sget-object p2, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p1, p2}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p2

    check-cast p2, Lbc3/k1;

    invoke-virtual {p0, p2}, Lbc3/t1;->H(Lbc3/k1;)V

    :cond_0
    invoke-interface {p1, p0}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    iput-object p1, p0, Lbc3/a;->y:Lq83/j;

    return-void
.end method


# virtual methods
.method public final G(Lkotlinx/coroutines/CompletionHandlerException;)V
    .locals 1

    iget-object v0, p0, Lbc3/a;->y:Lq83/j;

    invoke-static {v0, p1}, Lbc3/f0;->u(Lq83/j;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final R(Ljava/lang/Object;)V
    .locals 2

    instance-of v0, p1, Lbc3/w;

    if-eqz v0, :cond_1

    check-cast p1, Lbc3/w;

    iget-object v0, p1, Lbc3/w;->a:Ljava/lang/Throwable;

    sget-object v1, Lbc3/w;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0, v0, v1}, Lbc3/a;->Z(Ljava/lang/Throwable;Z)V

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lbc3/a;->a0(Ljava/lang/Object;)V

    return-void
.end method

.method public Z(Ljava/lang/Throwable;Z)V
    .locals 0

    return-void
.end method

.method public a0(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final b0(Lbc3/d0;Lbc3/a;Lc93/m;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_5

    const/4 v1, 0x1

    if-eq p1, v1, :cond_4

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    :try_start_0
    iget-object p1, p0, Lbc3/a;->y:Lq83/j;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lhc3/b;->m(Lq83/j;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    instance-of v2, p3, Ls83/a;

    if-nez v2, :cond_0

    invoke-static {p3, p2, p0}, Lge3/g;->Z(Lc93/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    invoke-static {v1, p3}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {p3, p2, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    :try_start_2
    invoke-static {p1, v0}, Lhc3/b;->f(Lq83/j;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-eq p2, p1, :cond_4

    invoke-virtual {p0, p2}, Lbc3/a;->resumeWith(Ljava/lang/Object;)V

    return-void

    :catchall_1
    move-exception p1

    goto :goto_2

    :goto_1
    :try_start_3
    invoke-static {p1, v0}, Lhc3/b;->f(Lq83/j;Ljava/lang/Object;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    instance-of p2, p1, Lkotlinx/coroutines/DispatchException;

    if-eqz p2, :cond_1

    check-cast p1, Lkotlinx/coroutines/DispatchException;

    iget-object p1, p1, Lkotlinx/coroutines/DispatchException;->w:Ljava/lang/Throwable;

    :cond_1
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbc3/a;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    const-string p1, "<this>"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, p2, p0}, Lge3/g;->p(Lc93/m;Lq83/d;Lq83/d;)Lq83/d;

    move-result-object p1

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    invoke-interface {p1, v0}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    :cond_4
    return-void

    :cond_5
    :try_start_4
    invoke-static {p3, p2, p0}, Lge3/g;->p(Lc93/m;Lq83/d;Lq83/d;)Lq83/d;

    move-result-object p1

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    invoke-static {v0, p1}, Lhc3/b;->g(Ljava/lang/Object;Lq83/d;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    return-void

    :catchall_2
    move-exception p1

    instance-of p2, p1, Lkotlinx/coroutines/DispatchException;

    if-eqz p2, :cond_6

    check-cast p1, Lkotlinx/coroutines/DispatchException;

    iget-object p1, p1, Lkotlinx/coroutines/DispatchException;->w:Ljava/lang/Throwable;

    :cond_6
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    invoke-virtual {p0, p2}, Lbc3/a;->resumeWith(Ljava/lang/Object;)V

    throw p1
.end method

.method public final getContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lbc3/a;->y:Lq83/j;

    return-object v0
.end method

.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lbc3/a;->y:Lq83/j;

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lbc3/w;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lbc3/w;-><init>(Ljava/lang/Throwable;Z)V

    :goto_0
    invoke-virtual {p0, p1}, Lbc3/t1;->M(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lbc3/f0;->e:Lhc3/x;

    if-ne p1, v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lbc3/a;->l(Ljava/lang/Object;)V

    return-void
.end method

.method public final u()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, " was cancelled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
