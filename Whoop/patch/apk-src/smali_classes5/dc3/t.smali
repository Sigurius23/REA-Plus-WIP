.class public final Ldc3/t;
.super Lbc3/a;
.source "SourceFile"

# interfaces
.implements Ldc3/u;
.implements Ldc3/l;


# instance fields
.field public final z:Ldc3/h;


# direct methods
.method public constructor <init>(Lq83/j;Ldc3/h;ZZ)V
    .locals 0

    invoke-direct {p0, p1, p3, p4}, Lbc3/a;-><init>(Lq83/j;ZZ)V

    iput-object p2, p0, Ldc3/t;->z:Ldc3/h;

    return-void
.end method


# virtual methods
.method public final Z(Ljava/lang/Throwable;Z)V
    .locals 2

    iget-object v0, p0, Ldc3/t;->z:Ldc3/h;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ldc3/h;->h(Ljava/lang/Throwable;Z)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    iget-object p2, p0, Lbc3/a;->y:Lq83/j;

    invoke-static {p2, p1}, Lbc3/f0;->u(Lq83/j;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final a(Lfc3/o;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldc3/t;->z:Ldc3/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, p1}, Ldc3/h;->C(Ldc3/h;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method public final a0(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ll83/a0;

    iget-object p1, p0, Ldc3/t;->z:Ldc3/h;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ldc3/h;->r(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final c0(Ldc3/s;)V
    .locals 5

    iget-object v0, p0, Ldc3/t;->z:Ldc3/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Ldc3/h;->J:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-void

    :cond_1
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    :goto_0
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Ldc3/j;->q:Lhc3/x;

    if-ne v2, v3, :cond_4

    sget-object v4, Ldc3/j;->r:Lhc3/x;

    :cond_2
    invoke-virtual {v1, v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Ldc3/h;->n()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p1, v0}, Ldc3/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_3
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v3, :cond_2

    goto :goto_0

    :cond_4
    sget-object p1, Ldc3/j;->r:Lhc3/x;

    if-ne v2, p1, :cond_5

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Another handler was already registered and successfully invoked"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Another handler is already registered: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final synthetic cancel()V
    .locals 3

    .line 6
    new-instance v0, Lkotlinx/coroutines/JobCancellationException;

    .line 7
    invoke-virtual {p0}, Lbc3/a;->u()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v1, v2, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lbc3/k1;)V

    .line 9
    invoke-virtual {p0, v0}, Ldc3/t;->p(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lbc3/t1;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    .line 2
    new-instance p1, Lkotlinx/coroutines/JobCancellationException;

    .line 3
    invoke-virtual {p0}, Lbc3/a;->u()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 4
    invoke-direct {p1, v0, v1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lbc3/k1;)V

    .line 5
    :cond_1
    invoke-virtual {p0, p1}, Ldc3/t;->p(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final synthetic cancel(Ljava/lang/Throwable;)Z
    .locals 2

    .line 10
    new-instance p1, Lkotlinx/coroutines/JobCancellationException;

    .line 11
    invoke-virtual {p0}, Lbc3/a;->u()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 12
    invoke-direct {p1, v0, v1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lbc3/k1;)V

    .line 13
    invoke-virtual {p0, p1}, Ldc3/t;->p(Ljava/util/concurrent/CancellationException;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final d()Lwe/o;
    .locals 1

    iget-object v0, p0, Ldc3/t;->z:Ldc3/h;

    invoke-virtual {v0}, Ldc3/h;->d()Lwe/o;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldc3/t;->z:Ldc3/h;

    invoke-virtual {v0}, Ldc3/h;->f()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final i(Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldc3/t;->z:Ldc3/h;

    invoke-virtual {v0, p1}, Ldc3/h;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ldc3/c;
    .locals 2

    iget-object v0, p0, Ldc3/t;->z:Ldc3/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ldc3/c;

    invoke-direct {v1, v0}, Ldc3/c;-><init>(Ldc3/h;)V

    return-object v1
.end method

.method public final p(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    invoke-static {p0, p1}, Lbc3/t1;->W(Lbc3/t1;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    iget-object v0, p0, Ldc3/t;->z:Ldc3/h;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Ldc3/h;->h(Ljava/lang/Throwable;Z)Z

    invoke-virtual {p0, p1}, Lbc3/t1;->o(Ljava/lang/Object;)Z

    return-void
.end method

.method public r(Ljava/lang/Throwable;)Z
    .locals 2

    iget-object v0, p0, Ldc3/t;->z:Ldc3/h;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ldc3/h;->h(Ljava/lang/Throwable;Z)Z

    move-result p1

    return p1
.end method

.method public s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v0, p1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v0, p1, p2}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
