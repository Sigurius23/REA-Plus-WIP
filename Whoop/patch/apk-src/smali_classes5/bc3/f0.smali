.class public abstract Lbc3/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lhc3/x;

.field public static final b:Lhc3/x;

.field public static final c:Lhc3/x;

.field public static final d:Lhc3/x;

.field public static final e:Lhc3/x;

.field public static final f:Lhc3/x;

.field public static final g:Lhc3/x;

.field public static final h:Lhc3/x;

.field public static final i:Lbc3/u0;

.field public static final j:Lbc3/u0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lhc3/x;

    const-string v1, "RESUME_TOKEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbc3/f0;->a:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "REMOVED_TASK"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbc3/f0;->b:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "CLOSED_EMPTY"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbc3/f0;->c:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "COMPLETING_ALREADY"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbc3/f0;->d:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "COMPLETING_WAITING_CHILDREN"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbc3/f0;->e:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "COMPLETING_RETRY"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbc3/f0;->f:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "TOO_LATE_TO_CANCEL"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbc3/f0;->g:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "SEALED"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbc3/f0;->h:Lhc3/x;

    new-instance v0, Lbc3/u0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbc3/u0;-><init>(Z)V

    sput-object v0, Lbc3/f0;->i:Lbc3/u0;

    new-instance v0, Lbc3/u0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lbc3/u0;-><init>(Z)V

    sput-object v0, Lbc3/f0;->j:Lbc3/u0;

    return-void
.end method

.method public static final A(Lbc3/c0;Lq83/j;)Lq83/j;
    .locals 1

    invoke-interface {p0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lbc3/f0;->p(Lq83/j;Lq83/j;Z)Lq83/j;

    move-result-object p0

    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    if-eq p0, p1, :cond_0

    sget-object v0, Lq83/e;->w:Lq83/e;

    invoke-interface {p0, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p0, p1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final B(Lbc3/c0;Lq83/j;)Lhc3/d;
    .locals 1

    new-instance v0, Lhc3/d;

    invoke-interface {p0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p0

    invoke-interface {p0, p1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p0

    invoke-direct {v0, p0}, Lhc3/d;-><init>(Lq83/j;)V

    return-object v0
.end method

.method public static final C(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Lbc3/w;

    if-eqz v0, :cond_0

    check-cast p0, Lbc3/w;

    iget-object p0, p0, Lbc3/w;->a:Ljava/lang/Throwable;

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final D(Lbc3/m;Lq83/d;Z)V
    .locals 2

    sget-object v0, Lbc3/m;->G:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lbc3/m;->f(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lbc3/m;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    if-eqz p2, :cond_6

    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lhc3/f;

    iget-object p2, p1, Lhc3/f;->E:Lq83/d;

    iget-object p1, p1, Lhc3/f;->G:Ljava/lang/Object;

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0, p1}, Lhc3/b;->m(Lq83/j;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lhc3/b;->d:Lhc3/x;

    if-eq p1, v1, :cond_1

    invoke-static {p2, v0, p1}, Lbc3/f0;->J(Lq83/d;Lq83/j;Ljava/lang/Object;)Lbc3/m2;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    :try_start_0
    invoke-interface {p2, p0}, Lq83/d;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lbc3/m2;->d0()Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_2

    :cond_2
    return-void

    :cond_3
    :goto_2
    invoke-static {v0, p1}, Lhc3/b;->f(Lq83/j;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p0

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lbc3/m2;->d0()Z

    move-result p2

    if-eqz p2, :cond_5

    :cond_4
    invoke-static {v0, p1}, Lhc3/b;->f(Lq83/j;Ljava/lang/Object;)V

    :cond_5
    throw p0

    :cond_6
    invoke-interface {p1, p0}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public static final E(Lq83/j;Lc93/m;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    sget-object v1, Lq83/e;->w:Lq83/e;

    invoke-interface {p0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v2

    check-cast v2, Lq83/f;

    sget-object v3, Lq83/k;->w:Lq83/k;

    const/4 v4, 0x1

    if-nez v2, :cond_0

    invoke-static {}, Lbc3/g2;->a()Lbc3/a1;

    move-result-object v2

    invoke-interface {p0, v2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p0

    invoke-static {v3, p0, v4}, Lbc3/f0;->p(Lq83/j;Lq83/j;Z)Lq83/j;

    move-result-object p0

    sget-object v3, Lbc3/q0;->a:Lkc3/e;

    if-eq p0, v3, :cond_2

    invoke-interface {p0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-interface {p0, v3}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p0

    goto :goto_0

    :cond_0
    instance-of v5, v2, Lbc3/a1;

    if-eqz v5, :cond_1

    check-cast v2, Lbc3/a1;

    :cond_1
    sget-object v2, Lbc3/g2;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbc3/a1;

    invoke-static {v3, p0, v4}, Lbc3/f0;->p(Lq83/j;Lq83/j;Z)Lq83/j;

    move-result-object p0

    sget-object v3, Lbc3/q0;->a:Lkc3/e;

    if-eq p0, v3, :cond_2

    invoke-interface {p0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-interface {p0, v3}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p0

    :cond_2
    :goto_0
    new-instance v1, Lbc3/f;

    invoke-direct {v1, p0, v0, v2}, Lbc3/f;-><init>(Lq83/j;Ljava/lang/Thread;Lbc3/a1;)V

    sget-object p0, Lbc3/d0;->w:Lbc3/d0;

    invoke-virtual {v1, p0, v1, p1}, Lbc3/a;->b0(Lbc3/d0;Lbc3/a;Lc93/m;)V

    const/4 p0, 0x0

    iget-object p1, v1, Lbc3/f;->E:Lbc3/a1;

    if-eqz p1, :cond_3

    sget v0, Lbc3/a1;->z:I

    invoke-virtual {p1, p0}, Lbc3/a1;->b0(Z)V

    :cond_3
    :goto_1
    if-eqz p1, :cond_4

    :try_start_0
    invoke-virtual {p1}, Lbc3/a1;->o0()J

    move-result-wide v2

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_4
    const-wide v2, 0x7fffffffffffffffL

    :goto_2
    invoke-virtual {v1}, Lbc3/t1;->isCompleted()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {v1, v2, v3}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    invoke-virtual {v1, v0}, Lbc3/t1;->o(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_5
    if-eqz p1, :cond_6

    sget v0, Lbc3/a1;->z:I

    invoke-virtual {p1, p0}, Lbc3/a1;->s(Z)V

    :cond_6
    sget-object p0, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lbc3/f0;->I(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of p1, p0, Lbc3/w;

    if-eqz p1, :cond_7

    move-object p1, p0

    check-cast p1, Lbc3/w;

    goto :goto_3

    :cond_7
    const/4 p1, 0x0

    :goto_3
    if-nez p1, :cond_8

    return-object p0

    :cond_8
    iget-object p0, p1, Lbc3/w;->a:Ljava/lang/Throwable;

    throw p0

    :goto_4
    if-eqz p1, :cond_9

    sget v1, Lbc3/a1;->z:I

    invoke-virtual {p1, p0}, Lbc3/a1;->s(Z)V

    :cond_9
    throw v0
.end method

.method public static synthetic F(Lc93/m;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lq83/k;->w:Lq83/k;

    invoke-static {v0, p0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static G(Lc93/a;Ls83/c;)Ljava/lang/Object;
    .locals 3

    new-instance v0, La6/q;

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-direct {v0, p0, v1, v2}, La6/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    sget-object p0, Lq83/k;->w:Lq83/k;

    invoke-static {p0, v0, p1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final H(Lq83/d;)Ljava/lang/String;
    .locals 3

    instance-of v0, p0, Lhc3/f;

    if-eqz v0, :cond_0

    check-cast p0, Lhc3/f;

    invoke-virtual {p0}, Lhc3/f;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 v0, 0x40

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lbc3/f0;->r(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    :goto_0
    invoke-static {v1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lbc3/f0;->r(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_1
    check-cast v1, Ljava/lang/String;

    return-object v1
.end method

.method public static final I(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Lbc3/h1;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lbc3/h1;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, v0, Lbc3/h1;->a:Lbc3/g1;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static final J(Lq83/d;Lq83/j;Ljava/lang/Object;)Lbc3/m2;
    .locals 2

    instance-of v0, p0, Ls83/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Lbc3/n2;->w:Lbc3/n2;

    invoke-interface {p1, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast p0, Ls83/d;

    :cond_1
    instance-of v0, p0, Lbc3/n0;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {p0}, Ls83/d;->getCallerFrame()Ls83/d;

    move-result-object p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    instance-of v0, p0, Lbc3/m2;

    if-eqz v0, :cond_1

    move-object v1, p0

    check-cast v1, Lbc3/m2;

    :goto_0
    if-eqz v1, :cond_4

    invoke-virtual {v1, p1, p2}, Lbc3/m2;->f0(Lq83/j;Ljava/lang/Object;)V

    :cond_4
    :goto_1
    return-object v1
.end method

.method public static final K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 5

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v2, Lb52/a;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lb52/a;-><init>(I)V

    invoke-interface {p0, v1, v2}, Lq83/j;->fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-interface {v0, p0}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {v0, p0, v2}, Lbc3/f0;->p(Lq83/j;Lq83/j;Z)Lq83/j;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lbc3/f0;->o(Lq83/j;)V

    const/4 v1, 0x1

    if-ne p0, v0, :cond_1

    new-instance v0, Lhc3/u;

    invoke-direct {v0, p0, p2}, Lhc3/u;-><init>(Lq83/j;Lq83/d;)V

    invoke-static {v0, v1, v0, p1}, Le93/b;->c0(Lhc3/u;ZLhc3/u;Lc93/m;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_1

    :cond_1
    sget-object v3, Lq83/e;->w:Lq83/e;

    invoke-interface {p0, v3}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v4

    invoke-interface {v0, v3}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lbc3/m2;

    invoke-direct {v0, p0, p2}, Lbc3/m2;-><init>(Lq83/j;Lq83/d;)V

    const/4 p0, 0x0

    iget-object p2, v0, Lbc3/a;->y:Lq83/j;

    invoke-static {p2, p0}, Lhc3/b;->m(Lq83/j;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :try_start_0
    invoke-static {v0, v1, v0, p1}, Le93/b;->c0(Lhc3/u;ZLhc3/u;Lc93/m;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p2, p0}, Lhc3/b;->f(Lq83/j;Ljava/lang/Object;)V

    move-object p0, p1

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-static {p2, p0}, Lhc3/b;->f(Lq83/j;Ljava/lang/Object;)V

    throw p1

    :cond_2
    new-instance v0, Lbc3/n0;

    invoke-direct {v0, p0, p2}, Lhc3/u;-><init>(Lq83/j;Lq83/d;)V

    :try_start_1
    invoke-static {p1, v0, v0}, Lge3/g;->p(Lc93/m;Lq83/d;Lq83/d;)Lq83/d;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p0

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-static {p1, p0}, Lhc3/b;->g(Ljava/lang/Object;Lq83/d;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    sget-object p0, Lbc3/n0;->E:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    :cond_3
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_6

    const/4 p0, 0x2

    if-ne p1, p0, :cond_5

    sget-object p0, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lbc3/f0;->I(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of p1, p0, Lbc3/w;

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    check-cast p0, Lbc3/w;

    iget-object p0, p0, Lbc3/w;->a:Ljava/lang/Throwable;

    throw p0

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Already suspended"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-virtual {p0, v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p0, Lr83/a;->w:Lr83/a;

    :goto_1
    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0

    :catchall_1
    move-exception p0

    instance-of p1, p0, Lkotlinx/coroutines/DispatchException;

    if-eqz p1, :cond_7

    check-cast p0, Lkotlinx/coroutines/DispatchException;

    iget-object p0, p0, Lkotlinx/coroutines/DispatchException;->w:Ljava/lang/Throwable;

    :cond_7
    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbc3/a;->resumeWith(Ljava/lang/Object;)V

    throw p0
.end method

.method public static final L(Ls83/c;)Ljava/lang/Object;
    .locals 7

    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->o(Lq83/j;)V

    invoke-static {p0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p0

    instance-of v1, p0, Lhc3/f;

    if-eqz v1, :cond_0

    check-cast p0, Lhc3/f;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-nez p0, :cond_1

    :goto_1
    move-object p0, v1

    goto/16 :goto_6

    :cond_1
    iget-object v2, p0, Lhc3/f;->z:Lbc3/z;

    invoke-static {v2, v0}, Lhc3/b;->i(Lbc3/z;Lq83/j;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    iput-object v1, p0, Lhc3/f;->F:Ljava/lang/Object;

    iput v4, p0, Lbc3/o0;->y:I

    invoke-virtual {v2, v0, p0}, Lbc3/z;->dispatchYield(Lq83/j;Ljava/lang/Runnable;)V

    goto :goto_5

    :cond_2
    new-instance v3, Lbc3/p2;

    sget-object v5, Lbc3/p2;->x:Lbc3/j1;

    invoke-direct {v3, v5}, Lq83/a;-><init>(Lq83/i;)V

    invoke-interface {v0, v3}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    iput-object v1, p0, Lhc3/f;->F:Ljava/lang/Object;

    iput v4, p0, Lbc3/o0;->y:I

    invoke-virtual {v2, v0, p0}, Lbc3/z;->dispatchYield(Lq83/j;Ljava/lang/Runnable;)V

    iget-boolean v0, v3, Lbc3/p2;->w:Z

    if-eqz v0, :cond_8

    invoke-static {}, Lbc3/g2;->a()Lbc3/a1;

    move-result-object v0

    iget-object v2, v0, Lbc3/a1;->y:Lm83/m;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lm83/m;->isEmpty()Z

    move-result v2

    goto :goto_2

    :cond_3
    move v2, v4

    :goto_2
    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    iget-wide v2, v0, Lbc3/a1;->w:J

    const-wide v5, 0x100000000L

    cmp-long v2, v2, v5

    if-ltz v2, :cond_5

    move v2, v4

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    :goto_3
    if-eqz v2, :cond_6

    iput-object v1, p0, Lhc3/f;->F:Ljava/lang/Object;

    iput v4, p0, Lbc3/o0;->y:I

    invoke-virtual {v0, p0}, Lbc3/a1;->T(Lbc3/o0;)V

    sget-object p0, Lr83/a;->w:Lr83/a;

    goto :goto_6

    :cond_6
    invoke-virtual {v0, v4}, Lbc3/a1;->b0(Z)V

    :try_start_0
    invoke-virtual {p0}, Lbc3/o0;->run()V

    :cond_7
    invoke-virtual {v0}, Lbc3/a1;->p0()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_7

    :goto_4
    invoke-virtual {v0, v4}, Lbc3/a1;->s(Z)V

    goto :goto_1

    :catchall_0
    move-exception v2

    :try_start_1
    invoke-virtual {p0, v2}, Lbc3/o0;->i(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p0

    invoke-virtual {v0, v4}, Lbc3/a1;->s(Z)V

    throw p0

    :cond_8
    :goto_5
    sget-object p0, Lr83/a;->w:Lr83/a;

    :goto_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p0, v0, :cond_9

    return-object p0

    :cond_9
    return-object v1
.end method

.method public static a()Lbc3/t;
    .locals 2

    new-instance v0, Lbc3/t;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbc3/t;-><init>(Lbc3/k1;)V

    return-object v0
.end method

.method public static final b(Lq83/j;)Lhc3/d;
    .locals 2

    new-instance v0, Lhc3/d;

    sget-object v1, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lbc3/f0;->c()Lbc3/l1;

    move-result-object v1

    invoke-interface {p0, v1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p0

    :goto_0
    invoke-direct {v0, p0}, Lhc3/d;-><init>(Lq83/j;)V

    return-object v0
.end method

.method public static c()Lbc3/l1;
    .locals 2

    new-instance v0, Lbc3/l1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbc3/l1;-><init>(Lbc3/k1;)V

    return-object v0
.end method

.method public static d()Lbc3/e2;
    .locals 2

    new-instance v0, Lbc3/e2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbc3/l1;-><init>(Lbc3/k1;)V

    return-object v0
.end method

.method public static e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;
    .locals 2

    sget-object v0, Lbc3/d0;->x:Lbc3/d0;

    and-int/lit8 v1, p3, 0x1

    if-eqz v1, :cond_0

    sget-object p1, Lq83/k;->w:Lq83/k;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    sget-object p3, Lbc3/d0;->w:Lbc3/d0;

    goto :goto_0

    :cond_1
    move-object p3, v0

    :goto_0
    invoke-static {p0, p1}, Lbc3/f0;->A(Lbc3/c0;Lq83/j;)Lq83/j;

    move-result-object p0

    if-ne p3, v0, :cond_2

    new-instance p1, Lbc3/u1;

    invoke-direct {p1, p0, p2}, Lbc3/u1;-><init>(Lq83/j;Lc93/m;)V

    goto :goto_1

    :cond_2
    new-instance p1, Lbc3/j0;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0, v0}, Lbc3/a;-><init>(Lq83/j;ZZ)V

    :goto_1
    invoke-virtual {p1, p3, p1, p2}, Lbc3/a;->b0(Lbc3/d0;Lbc3/a;Lc93/m;)V

    return-object p1
.end method

.method public static final f(Ljava/util/ArrayList;Lq83/d;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0

    :cond_0
    new-instance v0, Lbc3/e;

    const/4 v1, 0x0

    new-array v1, v1, [Lbc3/i0;

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lbc3/i0;

    invoke-direct {v0, p0}, Lbc3/e;-><init>([Lbc3/i0;)V

    invoke-virtual {v0, p1}, Lbc3/e;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final g([Lbc3/i0;Ls83/i;)Ljava/lang/Object;
    .locals 1

    array-length v0, p0

    if-nez v0, :cond_0

    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0

    :cond_0
    new-instance v0, Lbc3/e;

    invoke-direct {v0, p0}, Lbc3/e;-><init>([Lbc3/i0;)V

    invoke-virtual {v0, p1}, Lbc3/e;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V
    .locals 2

    invoke-interface {p0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    sget-object v1, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    check-cast v0, Lbc3/k1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Scope cannot be cancelled because it does not have a job: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final i(Lq83/j;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    sget-object v0, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p0, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p0

    check-cast p0, Lbc3/k1;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method public static final j(Lbc3/k1;Ls83/c;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    invoke-interface {p0, p1}, Lbc3/k1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static k(Lbc3/k1;)V
    .locals 2

    invoke-interface {p0}, Lbc3/k1;->getChildren()Lxb3/i;

    move-result-object p0

    invoke-interface {p0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/k1;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static l(Lq83/j;)V
    .locals 2

    sget-object v0, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p0, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p0

    check-cast p0, Lbc3/k1;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lbc3/k1;->getChildren()Lxb3/i;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/k1;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final m(Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lhc3/u;

    invoke-interface {p1}, Lq83/d;->getContext()Lq83/j;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lhc3/u;-><init>(Lq83/j;Lq83/d;)V

    const/4 p1, 0x1

    invoke-static {v0, p1, v0, p0}, Le93/b;->c0(Lhc3/u;ZLhc3/u;Lc93/m;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static final n(Lbc3/c0;)V
    .locals 0

    invoke-interface {p0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p0

    invoke-static {p0}, Lbc3/f0;->o(Lq83/j;)V

    return-void
.end method

.method public static final o(Lq83/j;)V
    .locals 1

    sget-object v0, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p0, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p0

    check-cast p0, Lbc3/k1;

    if-eqz p0, :cond_1

    invoke-interface {p0}, Lbc3/k1;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lbc3/k1;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method public static final p(Lq83/j;Lq83/j;Z)Lq83/j;
    .locals 3

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v0, Lb52/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lb52/a;-><init>(I)V

    invoke-interface {p0, p2, v0}, Lq83/j;->fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    new-instance v1, Lb52/a;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lb52/a;-><init>(I)V

    invoke-interface {p1, p2, v1}, Lq83/j;->fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    invoke-interface {p0, p1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lb52/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lb52/a;-><init>(I)V

    sget-object v1, Lq83/k;->w:Lq83/k;

    invoke-interface {p0, v1, v0}, Lq83/j;->fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lq83/j;

    if-eqz p2, :cond_1

    check-cast p1, Lq83/j;

    new-instance p2, Lb52/a;

    const/4 v0, 0x5

    invoke-direct {p2, v0}, Lb52/a;-><init>(I)V

    invoke-interface {p1, v1, p2}, Lq83/j;->fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    :cond_1
    check-cast p1, Lq83/j;

    invoke-interface {p0, p1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p0

    return-object p0
.end method

.method public static final q(Ljava/util/concurrent/Executor;)Lbc3/z;
    .locals 1

    instance-of v0, p0, Lbc3/p0;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lbc3/p0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, v0, Lbc3/p0;->w:Lbc3/z;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    new-instance v0, Lbc3/d1;

    invoke-direct {v0, p0}, Lbc3/d1;-><init>(Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static final r(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final s(Lq83/j;)Lbc3/k1;
    .locals 3

    sget-object v0, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p0, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    check-cast v0, Lbc3/k1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Current context doesn\'t contain Job in it: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final t(Lq83/d;)Lbc3/m;
    .locals 6

    instance-of v0, p0, Lhc3/f;

    if-nez v0, :cond_0

    new-instance v0, Lbc3/m;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Lbc3/m;-><init>(ILq83/d;)V

    return-object v0

    :cond_0
    move-object v0, p0

    check-cast v0, Lhc3/f;

    sget-object v1, Lhc3/b;->c:Lhc3/x;

    sget-object v2, Lhc3/f;->H:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_1
    :goto_0
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_2

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v3, v4

    goto :goto_1

    :cond_2
    instance-of v5, v3, Lbc3/m;

    if-eqz v5, :cond_8

    :cond_3
    invoke-virtual {v2, v0, v3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    check-cast v3, Lbc3/m;

    :goto_1
    if-eqz v3, :cond_6

    sget-object v0, Lbc3/m;->G:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lbc3/v;

    if-eqz v2, :cond_4

    check-cast v1, Lbc3/v;

    iget-object v1, v1, Lbc3/v;->d:Ljava/lang/Object;

    if-eqz v1, :cond_4

    invoke-virtual {v3}, Lbc3/m;->o()V

    goto :goto_2

    :cond_4
    sget-object v1, Lbc3/m;->F:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const v2, 0x1fffffff

    invoke-virtual {v1, v3, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    sget-object v1, Lbc3/b;->w:Lbc3/b;

    invoke-virtual {v0, v3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v4, v3

    :goto_2
    if-nez v4, :cond_5

    goto :goto_3

    :cond_5
    return-object v4

    :cond_6
    :goto_3
    new-instance v0, Lbc3/m;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Lbc3/m;-><init>(ILq83/d;)V

    return-object v0

    :cond_7
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, v3, :cond_3

    goto :goto_0

    :cond_8
    if-eq v3, v1, :cond_1

    instance-of v4, v3, Ljava/lang/Throwable;

    if-eqz v4, :cond_9

    goto :goto_0

    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Inconsistent state "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final u(Lq83/j;Ljava/lang/Throwable;)V
    .locals 3

    instance-of v0, p1, Lkotlinx/coroutines/DispatchException;

    if-eqz v0, :cond_0

    check-cast p1, Lkotlinx/coroutines/DispatchException;

    iget-object p1, p1, Lkotlinx/coroutines/DispatchException;->w:Ljava/lang/Throwable;

    :cond_0
    :try_start_0
    sget-object v0, Lbc3/a0;->w:Lbc3/a0;

    invoke-interface {p0, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/CoroutineExceptionHandler;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0, p1}, Lkotlinx/coroutines/CoroutineExceptionHandler;->handleException(Lq83/j;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, Ldp/d;->O(Lq83/j;Ljava/lang/Throwable;)V

    return-void

    :goto_0
    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Exception while trying to handle coroutine exception"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v1, p1}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    move-object p1, v1

    :goto_1
    invoke-static {p0, p1}, Ldp/d;->O(Lq83/j;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final v(Lbc3/k1;ZLbc3/m1;)Lbc3/s0;
    .locals 9

    instance-of v0, p0, Lbc3/t1;

    if-eqz v0, :cond_0

    check-cast p0, Lbc3/t1;

    invoke-virtual {p0, p1, p2}, Lbc3/t1;->I(ZLbc3/m1;)Lbc3/s0;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p2}, Lbc3/m1;->i()Z

    move-result v0

    new-instance v1, Landroidx/room/u;

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v2, 0x1

    const-class v4, Lbc3/m1;

    const-string v5, "invoke"

    const-string v6, "invoke(Ljava/lang/Throwable;)V"

    move-object v3, p2

    invoke-direct/range {v1 .. v8}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-interface {p0, v0, p1, v1}, Lbc3/k1;->invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lbc3/s0;

    move-result-object p0

    return-object p0
.end method

.method public static final w(Lbc3/c0;)Z
    .locals 1

    invoke-interface {p0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p0

    sget-object v0, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p0, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p0

    check-cast p0, Lbc3/k1;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lbc3/k1;->isActive()Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final x(Lq83/j;)Z
    .locals 1

    sget-object v0, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p0, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p0

    check-cast p0, Lbc3/k1;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lbc3/k1;->isActive()Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final y(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;)Lbc3/c2;
    .locals 1

    invoke-static {p0, p1}, Lbc3/f0;->A(Lbc3/c0;Lq83/j;)Lq83/j;

    move-result-object p0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lbc3/d0;->x:Lbc3/d0;

    if-ne p2, p1, :cond_0

    new-instance p1, Lbc3/v1;

    invoke-direct {p1, p0, p3}, Lbc3/v1;-><init>(Lq83/j;Lc93/m;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lbc3/c2;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0, v0}, Lbc3/a;-><init>(Lq83/j;ZZ)V

    :goto_0
    invoke-virtual {p1, p2, p1, p3}, Lbc3/a;->b0(Lbc3/d0;Lbc3/a;Lc93/m;)V

    return-object p1
.end method

.method public static synthetic z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;
    .locals 1

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    sget-object p1, Lq83/k;->w:Lq83/k;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    sget-object p2, Lbc3/d0;->w:Lbc3/d0;

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lbc3/f0;->y(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;)Lbc3/c2;

    move-result-object p0

    return-object p0
.end method
