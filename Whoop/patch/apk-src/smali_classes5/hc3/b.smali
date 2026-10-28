.class public abstract Lhc3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lhc3/x;

.field public static final b:Lhc3/x;

.field public static final c:Lhc3/x;

.field public static final d:Lhc3/x;

.field public static final e:Lgj2/a;

.field public static final f:Lgj2/a;

.field public static final g:Lgj2/a;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lhc3/x;

    const-string v1, "CLOSED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhc3/b;->a:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhc3/b;->b:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "REUSABLE_CLAIMED"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhc3/b;->c:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "NO_THREAD_ELEMENTS"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhc3/b;->d:Lhc3/x;

    new-instance v0, Lgj2/a;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lgj2/a;-><init>(I)V

    sput-object v0, Lhc3/b;->e:Lgj2/a;

    new-instance v0, Lgj2/a;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lgj2/a;-><init>(I)V

    sput-object v0, Lhc3/b;->f:Lgj2/a;

    new-instance v0, Lgj2/a;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lgj2/a;-><init>(I)V

    sput-object v0, Lhc3/b;->g:Lgj2/a;

    return-void
.end method

.method public static final a(I)V
    .locals 1

    const/4 v0, 0x1

    if-lt p0, v0, :cond_0

    return-void

    :cond_0
    const-string v0, "Expected positive parallelism level, but got "

    invoke-static {p0, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final b(Lhc3/v;JLc93/m;)Ljava/lang/Object;
    .locals 5

    :goto_0
    iget-wide v0, p0, Lhc3/v;->y:J

    cmp-long v0, v0, p1

    if-ltz v0, :cond_1

    invoke-virtual {p0}, Lhc3/v;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    return-object p0

    :cond_1
    :goto_1
    sget-object v0, Lhc3/c;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lhc3/b;->a:Lhc3/x;

    if-ne v1, v2, :cond_2

    return-object v2

    :cond_2
    check-cast v1, Lhc3/c;

    check-cast v1, Lhc3/v;

    if-eqz v1, :cond_4

    :cond_3
    :goto_2
    move-object p0, v1

    goto :goto_0

    :cond_4
    iget-wide v1, p0, Lhc3/v;->y:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p3, v1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhc3/v;

    :cond_5
    const/4 v2, 0x0

    invoke-virtual {v0, p0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p0}, Lhc3/v;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lhc3/c;->e()V

    goto :goto_2

    :cond_6
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_5

    goto :goto_0
.end method

.method public static final c(Ljava/lang/Object;)Lhc3/v;
    .locals 1

    sget-object v0, Lhc3/b;->a:Lhc3/x;

    if-eq p0, v0, :cond_0

    check-cast p0, Lhc3/v;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Does not contain segment"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final d(Ljava/lang/Object;)Z
    .locals 1

    sget-object v0, Lhc3/b;->a:Lhc3/x;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    instance-of v0, p0, Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static final f(Lq83/j;Ljava/lang/Object;)V
    .locals 5

    sget-object v0, Lhc3/b;->d:Lhc3/x;

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lhc3/c0;

    if-eqz v0, :cond_3

    check-cast p1, Lhc3/c0;

    iget-object v0, p1, Lhc3/c0;->c:[Lbc3/f2;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_2

    :goto_0
    add-int/lit8 v2, v1, -0x1

    aget-object v3, v0, v1

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v4, p1, Lhc3/c0;->b:[Ljava/lang/Object;

    aget-object v1, v4, v1

    invoke-interface {v3, p0, v1}, Lbc3/f2;->x(Lq83/j;Ljava/lang/Object;)V

    if-gez v2, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    goto :goto_0

    :cond_2
    :goto_1
    return-void

    :cond_3
    const/4 v0, 0x0

    sget-object v1, Lhc3/b;->f:Lgj2/a;

    invoke-interface {p0, v0, v1}, Lq83/j;->fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lbc3/f2;

    invoke-interface {v0, p0, p1}, Lbc3/f2;->x(Lq83/j;Ljava/lang/Object;)V

    return-void
.end method

.method public static final g(Ljava/lang/Object;Lq83/d;)V
    .locals 9

    instance-of v0, p1, Lhc3/f;

    if-eqz v0, :cond_9

    check-cast p1, Lhc3/f;

    iget-object v0, p1, Lhc3/f;->z:Lbc3/z;

    iget-object v1, p1, Lhc3/f;->E:Lq83/d;

    invoke-static {p0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_0

    move-object v3, p0

    goto :goto_0

    :cond_0
    new-instance v3, Lbc3/w;

    const/4 v4, 0x0

    invoke-direct {v3, v2, v4}, Lbc3/w;-><init>(Ljava/lang/Throwable;Z)V

    :goto_0
    invoke-interface {v1}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    invoke-static {v0, v2}, Lhc3/b;->i(Lbc3/z;Lq83/j;)Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    iput-object v3, p1, Lhc3/f;->F:Ljava/lang/Object;

    iput v4, p1, Lbc3/o0;->y:I

    invoke-interface {v1}, Lq83/d;->getContext()Lq83/j;

    move-result-object p0

    invoke-static {v0, p0, p1}, Lhc3/b;->h(Lbc3/z;Lq83/j;Ljava/lang/Runnable;)V

    return-void

    :cond_1
    invoke-static {}, Lbc3/g2;->a()Lbc3/a1;

    move-result-object v0

    iget-wide v5, v0, Lbc3/a1;->w:J

    const-wide v7, 0x100000000L

    cmp-long v2, v5, v7

    if-ltz v2, :cond_2

    iput-object v3, p1, Lhc3/f;->F:Ljava/lang/Object;

    iput v4, p1, Lbc3/o0;->y:I

    invoke-virtual {v0, p1}, Lbc3/a1;->T(Lbc3/o0;)V

    goto :goto_5

    :cond_2
    invoke-virtual {v0, v4}, Lbc3/a1;->b0(Z)V

    :try_start_0
    invoke-interface {v1}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    sget-object v3, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v2, v3}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v2

    check-cast v2, Lbc3/k1;

    if-eqz v2, :cond_3

    invoke-interface {v2}, Lbc3/k1;->isActive()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-interface {v2}, Lbc3/k1;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    invoke-virtual {p1, p0}, Lhc3/f;->resumeWith(Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_4

    :cond_3
    iget-object v2, p1, Lhc3/f;->G:Ljava/lang/Object;

    invoke-interface {v1}, Lq83/d;->getContext()Lq83/j;

    move-result-object v3

    invoke-static {v3, v2}, Lhc3/b;->m(Lq83/j;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v5, Lhc3/b;->d:Lhc3/x;

    if-eq v2, v5, :cond_4

    invoke-static {v1, v3, v2}, Lbc3/f0;->J(Lq83/d;Lq83/j;Ljava/lang/Object;)Lbc3/m2;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_4
    const/4 v5, 0x0

    :goto_1
    :try_start_1
    invoke-interface {v1, p0}, Lq83/d;->resumeWith(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v5, :cond_5

    :try_start_2
    invoke-virtual {v5}, Lbc3/m2;->d0()Z

    move-result p0

    if-eqz p0, :cond_6

    :cond_5
    invoke-static {v3, v2}, Lhc3/b;->f(Lq83/j;Ljava/lang/Object;)V

    :cond_6
    :goto_2
    invoke-virtual {v0}, Lbc3/a1;->p0()Z

    move-result p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p0, :cond_6

    :goto_3
    invoke-virtual {v0, v4}, Lbc3/a1;->s(Z)V

    goto :goto_5

    :catchall_1
    move-exception p0

    if-eqz v5, :cond_7

    :try_start_3
    invoke-virtual {v5}, Lbc3/m2;->d0()Z

    move-result v1

    if-eqz v1, :cond_8

    :cond_7
    invoke-static {v3, v2}, Lhc3/b;->f(Lq83/j;Ljava/lang/Object;)V

    :cond_8
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_4
    :try_start_4
    invoke-virtual {p1, p0}, Lbc3/o0;->i(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_3

    :goto_5
    return-void

    :catchall_2
    move-exception p0

    invoke-virtual {v0, v4}, Lbc3/a1;->s(Z)V

    throw p0

    :cond_9
    invoke-interface {p1, p0}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public static final h(Lbc3/z;Lq83/j;Ljava/lang/Runnable;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lbc3/z;->dispatch(Lq83/j;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p2

    new-instance v0, Lkotlinx/coroutines/DispatchException;

    invoke-direct {v0, p2, p0, p1}, Lkotlinx/coroutines/DispatchException;-><init>(Ljava/lang/Throwable;Lbc3/z;Lq83/j;)V

    throw v0
.end method

.method public static final i(Lbc3/z;Lq83/j;)Z
    .locals 2

    :try_start_0
    invoke-virtual {p0, p1}, Lbc3/z;->isDispatchNeeded(Lq83/j;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    move-exception v0

    new-instance v1, Lkotlinx/coroutines/DispatchException;

    invoke-direct {v1, v0, p0, p1}, Lkotlinx/coroutines/DispatchException;-><init>(Ljava/lang/Throwable;Lbc3/z;Lq83/j;)V

    throw v1
.end method

.method public static final j(Ljava/lang/String;JJJ)J
    .locals 4

    sget v0, Lhc3/y;->a:I

    :try_start_0
    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_0

    return-wide p1

    :cond_0
    invoke-static {v0}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    const/16 p2, 0x27

    const-string v1, "System property \'"

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p1, p3, v2

    if-gtz p1, :cond_1

    cmp-long p1, v2, p5

    if-gtz p1, :cond_1

    return-wide v2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "\' should be in range "

    invoke-static {v1, p0, p3, p4, v0}, Ldc/b;->s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p3, ".."

    const-string p4, ", but is \'"

    invoke-static {p0, p3, p5, p6, p4}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\' has unrecognized value \'"

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static k(IILjava/lang/String;)I
    .locals 7

    and-int/lit8 p1, p1, 0x8

    if-eqz p1, :cond_0

    const p1, 0x7fffffff

    goto :goto_0

    :cond_0
    const p1, 0x1ffffe

    :goto_0
    int-to-long v1, p0

    const/4 p0, 0x1

    int-to-long v3, p0

    int-to-long v5, p1

    move-object v0, p2

    invoke-static/range {v0 .. v6}, Lhc3/b;->j(Ljava/lang/String;JJJ)J

    move-result-wide p0

    long-to-int p0, p0

    return p0
.end method

.method public static final l(Lq83/j;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Lhc3/b;->e:Lgj2/a;

    invoke-interface {p0, v0, v1}, Lq83/j;->fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final m(Lq83/j;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    invoke-static {p0}, Lhc3/b;->l(Lq83/j;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne p1, v0, :cond_1

    sget-object p0, Lhc3/b;->d:Lhc3/x;

    return-object p0

    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    new-instance v0, Lhc3/c0;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, p1, p0}, Lhc3/c0;-><init>(ILq83/j;)V

    sget-object p1, Lhc3/b;->g:Lgj2/a;

    invoke-interface {p0, v0, p1}, Lq83/j;->fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_2
    check-cast p1, Lbc3/f2;

    invoke-interface {p1, p0}, Lbc3/f2;->J(Lq83/j;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
