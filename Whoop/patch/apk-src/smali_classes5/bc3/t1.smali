.class public Lbc3/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/k1;
.implements Lbc3/r;
.implements Lbc3/b2;


# static fields
.field public static final synthetic w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _parentHandle$volatile:Ljava/lang/Object;

.field private volatile synthetic _state$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "_state$volatile"

    const-class v1, Lbc3/t1;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_parentHandle$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lbc3/t1;->x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    sget-object p1, Lbc3/f0;->j:Lbc3/u0;

    goto :goto_0

    :cond_0
    sget-object p1, Lbc3/f0;->i:Lbc3/u0;

    :goto_0
    iput-object p1, p0, Lbc3/t1;->_state$volatile:Ljava/lang/Object;

    return-void
.end method

.method public static O(Lhc3/k;)Lbc3/q;
    .locals 2

    :goto_0
    invoke-virtual {p0}, Lhc3/k;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lhc3/k;->x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p0}, Lhc3/k;->d()Lhc3/k;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lhc3/k;

    :goto_1
    invoke-virtual {p0}, Lhc3/k;->g()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lhc3/k;

    goto :goto_1

    :cond_1
    move-object p0, v1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lhc3/k;->f()Lhc3/k;

    move-result-object p0

    invoke-virtual {p0}, Lhc3/k;->g()Z

    move-result v0

    if-nez v0, :cond_2

    instance-of v0, p0, Lbc3/q;

    if-eqz v0, :cond_3

    check-cast p0, Lbc3/q;

    return-object p0

    :cond_3
    instance-of v0, p0, Lbc3/x1;

    if-eqz v0, :cond_2

    const/4 p0, 0x0

    return-object p0
.end method

.method public static V(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    instance-of v0, p0, Lbc3/p1;

    const-string v1, "Active"

    if-eqz v0, :cond_2

    check-cast p0, Lbc3/p1;

    invoke-virtual {p0}, Lbc3/p1;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Cancelling"

    return-object p0

    :cond_0
    sget-object v0, Lbc3/p1;->x:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    const-string p0, "Completing"

    return-object p0

    :cond_1
    return-object v1

    :cond_2
    instance-of v0, p0, Lbc3/g1;

    if-eqz v0, :cond_4

    check-cast p0, Lbc3/g1;

    invoke-interface {p0}, Lbc3/g1;->isActive()Z

    move-result p0

    if-eqz p0, :cond_3

    return-object v1

    :cond_3
    const-string p0, "New"

    return-object p0

    :cond_4
    instance-of p0, p0, Lbc3/w;

    if-eqz p0, :cond_5

    const-string p0, "Cancelled"

    return-object p0

    :cond_5
    const-string p0, "Completed"

    return-object p0
.end method

.method public static W(Lbc3/t1;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;
    .locals 2

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/concurrent/CancellationException;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    new-instance v0, Lkotlinx/coroutines/JobCancellationException;

    invoke-virtual {p0}, Lbc3/t1;->u()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lbc3/k1;)V

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final A()Ljava/lang/Object;
    .locals 2

    sget-object v0, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lbc3/g1;

    if-nez v1, :cond_1

    instance-of v1, v0, Lbc3/w;

    if-nez v1, :cond_0

    invoke-static {v0}, Lbc3/f0;->I(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    check-cast v0, Lbc3/w;

    iget-object v0, v0, Lbc3/w;->a:Ljava/lang/Throwable;

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This job has not completed yet"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final B(Lbc3/p1;Ljava/util/ArrayList;)Ljava/lang/Throwable;
    .locals 3

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lbc3/p1;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lkotlinx/coroutines/JobCancellationException;

    invoke-virtual {p0}, Lbc3/t1;->u()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lbc3/k1;)V

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Throwable;

    instance-of v2, v2, Ljava/util/concurrent/CancellationException;

    if-nez v2, :cond_2

    goto :goto_0

    :cond_3
    move-object v0, v1

    :goto_0
    check-cast v0, Ljava/lang/Throwable;

    if-eqz v0, :cond_4

    return-object v0

    :cond_4
    const/4 p1, 0x0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    instance-of v0, p1, Lkotlinx/coroutines/TimeoutCancellationException;

    if-eqz v0, :cond_7

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Throwable;

    if-eq v2, p1, :cond_5

    instance-of v2, v2, Lkotlinx/coroutines/TimeoutCancellationException;

    if-eqz v2, :cond_5

    move-object v1, v0

    :cond_6
    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_7

    return-object v1

    :cond_7
    return-object p1
.end method

.method public C()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public D()Z
    .locals 1

    instance-of v0, p0, Lbc3/t;

    return v0
.end method

.method public final E(Lbc3/g1;)Lbc3/x1;
    .locals 3

    invoke-interface {p1}, Lbc3/g1;->b()Lbc3/x1;

    move-result-object v0

    if-nez v0, :cond_2

    instance-of v0, p1, Lbc3/u0;

    if-eqz v0, :cond_0

    new-instance p1, Lbc3/x1;

    invoke-direct {p1}, Lhc3/k;-><init>()V

    return-object p1

    :cond_0
    instance-of v0, p1, Lbc3/m1;

    if-eqz v0, :cond_1

    check-cast p1, Lbc3/m1;

    invoke-virtual {p0, p1}, Lbc3/t1;->T(Lbc3/m1;)V

    const/4 p1, 0x0

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "State should have list: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-object v0
.end method

.method public F(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public G(Lkotlinx/coroutines/CompletionHandlerException;)V
    .locals 0

    throw p1
.end method

.method public final H(Lbc3/k1;)V
    .locals 3

    sget-object v0, Lbc3/t1;->x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    sget-object v1, Lbc3/z1;->w:Lbc3/z1;

    if-nez p1, :cond_0

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-interface {p1}, Lbc3/k1;->start()Z

    invoke-interface {p1, p0}, Lbc3/k1;->attachChild(Lbc3/r;)Lbc3/p;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lbc3/t1;->isCompleted()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Lbc3/s0;->dispose()V

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final I(ZLbc3/m1;)Lbc3/s0;
    .locals 7

    iput-object p0, p2, Lbc3/m1;->z:Lbc3/t1;

    :cond_0
    :goto_0
    sget-object v0, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lbc3/u0;

    sget-object v3, Lbc3/z1;->w:Lbc3/z1;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_5

    move-object v2, v1

    check-cast v2, Lbc3/u0;

    iget-boolean v6, v2, Lbc3/u0;->w:Z

    if-eqz v6, :cond_3

    :cond_1
    invoke-virtual {v0, p0, v1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_5

    :cond_2
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v1, :cond_1

    goto :goto_0

    :cond_3
    new-instance v1, Lbc3/x1;

    invoke-direct {v1}, Lhc3/k;-><init>()V

    if-eqz v6, :cond_4

    goto :goto_1

    :cond_4
    new-instance v3, Lbc3/f1;

    invoke-direct {v3, v1}, Lbc3/f1;-><init>(Lbc3/x1;)V

    move-object v1, v3

    :goto_1
    invoke-static {v0, p0, v2, v1}, Lr;->y(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Lbc3/t1;Lbc3/u0;Lbc3/g1;)V

    goto :goto_0

    :cond_5
    instance-of v2, v1, Lbc3/g1;

    if-eqz v2, :cond_b

    move-object v2, v1

    check-cast v2, Lbc3/g1;

    invoke-interface {v2}, Lbc3/g1;->b()Lbc3/x1;

    move-result-object v6

    if-nez v6, :cond_6

    check-cast v1, Lbc3/m1;

    invoke-virtual {p0, v1}, Lbc3/t1;->T(Lbc3/m1;)V

    goto :goto_0

    :cond_6
    invoke-virtual {p2}, Lbc3/m1;->i()Z

    move-result v1

    if-eqz v1, :cond_a

    instance-of v1, v2, Lbc3/p1;

    if-eqz v1, :cond_7

    check-cast v2, Lbc3/p1;

    goto :goto_2

    :cond_7
    move-object v2, v5

    :goto_2
    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lbc3/p1;->c()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_3

    :cond_8
    move-object v1, v5

    :goto_3
    if-nez v1, :cond_9

    const/4 v1, 0x5

    invoke-virtual {v6, p2, v1}, Lhc3/k;->c(Lhc3/k;I)Z

    move-result v1

    goto :goto_4

    :cond_9
    if-eqz p1, :cond_f

    invoke-virtual {p2, v1}, Lbc3/m1;->j(Ljava/lang/Throwable;)V

    return-object v3

    :cond_a
    invoke-virtual {v6, p2, v4}, Lhc3/k;->c(Lhc3/k;I)Z

    move-result v1

    :goto_4
    if-eqz v1, :cond_0

    goto :goto_5

    :cond_b
    const/4 v4, 0x0

    :goto_5
    if-eqz v4, :cond_c

    return-object p2

    :cond_c
    if-eqz p1, :cond_f

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lbc3/w;

    if-eqz v0, :cond_d

    check-cast p1, Lbc3/w;

    goto :goto_6

    :cond_d
    move-object p1, v5

    :goto_6
    if-eqz p1, :cond_e

    iget-object v5, p1, Lbc3/w;->a:Ljava/lang/Throwable;

    :cond_e
    invoke-virtual {p2, v5}, Lbc3/m1;->j(Ljava/lang/Throwable;)V

    :cond_f
    return-object v3
.end method

.method public K()Z
    .locals 1

    instance-of v0, p0, Lbc3/f;

    return v0
.end method

.method public final L(Ljava/lang/Object;)Z
    .locals 3

    :cond_0
    sget-object v0, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lbc3/t1;->X(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lbc3/f0;->d:Lhc3/x;

    if-ne v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    sget-object v1, Lbc3/f0;->e:Lhc3/x;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_2

    return v2

    :cond_2
    sget-object v1, Lbc3/f0;->f:Lhc3/x;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v0}, Lbc3/t1;->j(Ljava/lang/Object;)V

    return v2
.end method

.method public final M(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    :cond_0
    sget-object v0, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lbc3/t1;->X(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lbc3/f0;->d:Lhc3/x;

    if-ne v0, v1, :cond_3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Job "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is already complete or completing, but is being completed with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    instance-of v2, p1, Lbc3/w;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast p1, Lbc3/w;

    goto :goto_0

    :cond_1
    move-object p1, v3

    :goto_0
    if-eqz p1, :cond_2

    iget-object v3, p1, Lbc3/w;->a:Ljava/lang/Throwable;

    :cond_2
    invoke-direct {v0, v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_3
    sget-object v1, Lbc3/f0;->f:Lhc3/x;

    if-eq v0, v1, :cond_0

    return-object v0
.end method

.method public N()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final P(Lbc3/x1;Ljava/lang/Throwable;)V
    .locals 5

    new-instance v0, Lhc3/h;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lhc3/h;-><init>(I)V

    invoke-virtual {p1, v0, v1}, Lhc3/k;->c(Lhc3/k;I)Z

    sget-object v0, Lhc3/k;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lhc3/k;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    instance-of v2, v0, Lbc3/m1;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lbc3/m1;

    invoke-virtual {v2}, Lbc3/m1;->i()Z

    move-result v2

    if-eqz v2, :cond_1

    :try_start_0
    move-object v2, v0

    check-cast v2, Lbc3/m1;

    invoke-virtual {v2, p2}, Lbc3/m1;->j(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    if-eqz v1, :cond_0

    invoke-static {v1, v2}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    new-instance v1, Lkotlinx/coroutines/CompletionHandlerException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Exception in completion handler "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lhc3/k;->f()Lhc3/k;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, Lbc3/t1;->G(Lkotlinx/coroutines/CompletionHandlerException;)V

    :cond_3
    invoke-virtual {p0, p2}, Lbc3/t1;->q(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public Q(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public R(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public S()V
    .locals 0

    return-void
.end method

.method public final T(Lbc3/m1;)V
    .locals 3

    new-instance v0, Lbc3/x1;

    invoke-direct {v0}, Lhc3/k;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lhc3/k;->x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lhc3/k;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1, p1, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0, p1}, Lhc3/k;->e(Lhc3/k;)V

    :goto_1
    invoke-virtual {p1}, Lhc3/k;->f()Lhc3/k;

    move-result-object v2

    :cond_1
    sget-object v0, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0, p1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-void

    :cond_2
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p1, :cond_1

    return-void

    :cond_3
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_0

    goto :goto_0
.end method

.method public final U(Ljava/lang/Object;)I
    .locals 4

    instance-of v0, p1, Lbc3/u0;

    const/4 v1, 0x1

    sget-object v2, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Lbc3/u0;

    iget-boolean v0, v0, Lbc3/u0;->w:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Lbc3/f0;->j:Lbc3/u0;

    :cond_1
    invoke-virtual {v2, p0, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lbc3/t1;->S()V

    return v1

    :cond_2
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, p1, :cond_1

    goto :goto_0

    :cond_3
    instance-of v0, p1, Lbc3/f1;

    if-eqz v0, :cond_6

    move-object v0, p1

    check-cast v0, Lbc3/f1;

    iget-object v0, v0, Lbc3/f1;->w:Lbc3/x1;

    :cond_4
    invoke-virtual {v2, p0, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p0}, Lbc3/t1;->S()V

    return v1

    :cond_5
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, p1, :cond_4

    :goto_0
    const/4 p1, -0x1

    return p1

    :cond_6
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final X(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lbc3/g1;

    if-nez v0, :cond_0

    sget-object p1, Lbc3/f0;->d:Lhc3/x;

    return-object p1

    :cond_0
    instance-of v0, p1, Lbc3/u0;

    if-nez v0, :cond_1

    instance-of v0, p1, Lbc3/m1;

    if-eqz v0, :cond_4

    :cond_1
    instance-of v0, p1, Lbc3/q;

    if-nez v0, :cond_4

    instance-of v0, p2, Lbc3/w;

    if-nez v0, :cond_4

    check-cast p1, Lbc3/g1;

    sget-object v0, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    instance-of v1, p2, Lbc3/g1;

    if-eqz v1, :cond_2

    new-instance v1, Lbc3/h1;

    move-object v2, p2

    check-cast v2, Lbc3/g1;

    invoke-direct {v1, v2}, Lbc3/h1;-><init>(Lbc3/g1;)V

    goto :goto_0

    :cond_2
    move-object v1, p2

    :goto_0
    invoke-static {v0, p0, p1, v1}, Lr;->A(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Lbc3/t1;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object p1, Lbc3/f0;->f:Lhc3/x;

    return-object p1

    :cond_3
    invoke-virtual {p0, p2}, Lbc3/t1;->R(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lbc3/t1;->w(Lbc3/g1;Ljava/lang/Object;)V

    return-object p2

    :cond_4
    check-cast p1, Lbc3/g1;

    invoke-virtual {p0, p1}, Lbc3/t1;->E(Lbc3/g1;)Lbc3/x1;

    move-result-object v0

    if-nez v0, :cond_5

    sget-object p1, Lbc3/f0;->f:Lhc3/x;

    return-object p1

    :cond_5
    instance-of v1, p1, Lbc3/p1;

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    move-object v1, p1

    check-cast v1, Lbc3/p1;

    goto :goto_1

    :cond_6
    move-object v1, v2

    :goto_1
    if-nez v1, :cond_7

    new-instance v1, Lbc3/p1;

    invoke-direct {v1, v0, v2}, Lbc3/p1;-><init>(Lbc3/x1;Ljava/lang/Throwable;)V

    :cond_7
    monitor-enter v1

    :try_start_0
    sget-object v3, Lbc3/p1;->x:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_8

    move v4, v5

    goto :goto_2

    :cond_8
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_9

    sget-object p1, Lbc3/f0;->d:Lhc3/x;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_9
    :try_start_1
    invoke-virtual {v3, v1, v5}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    if-eq v1, p1, :cond_c

    sget-object v3, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_a
    invoke-virtual {v3, p0, p1, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_3

    :cond_b
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, p1, :cond_a

    sget-object p1, Lbc3/f0;->f:Lhc3/x;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object p1

    :cond_c
    :goto_3
    :try_start_2
    invoke-virtual {v1}, Lbc3/p1;->d()Z

    move-result p1

    instance-of v3, p2, Lbc3/w;

    if-eqz v3, :cond_d

    move-object v3, p2

    check-cast v3, Lbc3/w;

    goto :goto_4

    :cond_d
    move-object v3, v2

    :goto_4
    if-eqz v3, :cond_e

    iget-object v3, v3, Lbc3/w;->a:Ljava/lang/Throwable;

    invoke-virtual {v1, v3}, Lbc3/p1;->a(Ljava/lang/Throwable;)V

    :cond_e
    invoke-virtual {v1}, Lbc3/p1;->c()Ljava/lang/Throwable;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p1, :cond_f

    move-object v2, v3

    :cond_f
    monitor-exit v1

    if-eqz v2, :cond_10

    invoke-virtual {p0, v0, v2}, Lbc3/t1;->P(Lbc3/x1;Ljava/lang/Throwable;)V

    :cond_10
    invoke-static {v0}, Lbc3/t1;->O(Lhc3/k;)Lbc3/q;

    move-result-object p1

    if-eqz p1, :cond_11

    invoke-virtual {p0, v1, p1, p2}, Lbc3/t1;->Y(Lbc3/p1;Lbc3/q;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_11

    sget-object p1, Lbc3/f0;->e:Lhc3/x;

    return-object p1

    :cond_11
    new-instance p1, Lhc3/h;

    const/4 v2, 0x2

    invoke-direct {p1, v2}, Lhc3/h;-><init>(I)V

    invoke-virtual {v0, p1, v2}, Lhc3/k;->c(Lhc3/k;I)Z

    invoke-static {v0}, Lbc3/t1;->O(Lhc3/k;)Lbc3/q;

    move-result-object p1

    if-eqz p1, :cond_12

    invoke-virtual {p0, v1, p1, p2}, Lbc3/t1;->Y(Lbc3/p1;Lbc3/q;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_12

    sget-object p1, Lbc3/f0;->e:Lhc3/x;

    return-object p1

    :cond_12
    invoke-virtual {p0, v1, p2}, Lbc3/t1;->z(Lbc3/p1;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :goto_5
    monitor-exit v1

    throw p1
.end method

.method public final Y(Lbc3/p1;Lbc3/q;Ljava/lang/Object;)Z
    .locals 3

    :cond_0
    iget-object v0, p2, Lbc3/q;->E:Lbc3/r;

    new-instance v1, Lbc3/o1;

    invoke-direct {v1, p0, p1, p2, p3}, Lbc3/o1;-><init>(Lbc3/t1;Lbc3/p1;Lbc3/q;Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lbc3/f0;->v(Lbc3/k1;ZLbc3/m1;)Lbc3/s0;

    move-result-object v0

    sget-object v1, Lbc3/z1;->w:Lbc3/z1;

    if-eq v0, v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-static {p2}, Lbc3/t1;->O(Lhc3/k;)Lbc3/q;

    move-result-object p2

    if-nez p2, :cond_0

    return v2
.end method

.method public final attachChild(Lbc3/r;)Lbc3/p;
    .locals 5

    new-instance v0, Lbc3/q;

    invoke-direct {v0, p1}, Lbc3/q;-><init>(Lbc3/r;)V

    iput-object p0, v0, Lbc3/m1;->z:Lbc3/t1;

    :cond_0
    :goto_0
    sget-object p1, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lbc3/u0;

    if-eqz v2, :cond_3

    check-cast v1, Lbc3/u0;

    iget-boolean v2, v1, Lbc3/u0;->w:Z

    if-eqz v2, :cond_1

    invoke-static {p1, p0, v1, v0}, Lr;->z(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Lbc3/t1;Lbc3/u0;Lbc3/q;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_4

    :cond_1
    new-instance v3, Lbc3/x1;

    invoke-direct {v3}, Lhc3/k;-><init>()V

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    new-instance v2, Lbc3/f1;

    invoke-direct {v2, v3}, Lbc3/f1;-><init>(Lbc3/x1;)V

    move-object v3, v2

    :goto_1
    invoke-static {p1, p0, v1, v3}, Lr;->y(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Lbc3/t1;Lbc3/u0;Lbc3/g1;)V

    goto :goto_0

    :cond_3
    instance-of v2, v1, Lbc3/g1;

    sget-object v3, Lbc3/z1;->w:Lbc3/z1;

    const/4 v4, 0x0

    if-eqz v2, :cond_a

    move-object v2, v1

    check-cast v2, Lbc3/g1;

    invoke-interface {v2}, Lbc3/g1;->b()Lbc3/x1;

    move-result-object v2

    if-nez v2, :cond_4

    check-cast v1, Lbc3/m1;

    invoke-virtual {p0, v1}, Lbc3/t1;->T(Lbc3/m1;)V

    goto :goto_0

    :cond_4
    const/4 v1, 0x7

    invoke-virtual {v2, v0, v1}, Lhc3/k;->c(Lhc3/k;I)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_4

    :cond_5
    const/4 v1, 0x3

    invoke-virtual {v2, v0, v1}, Lhc3/k;->c(Lhc3/k;I)Z

    move-result v1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v2, p1, Lbc3/p1;

    if-eqz v2, :cond_6

    check-cast p1, Lbc3/p1;

    invoke-virtual {p1}, Lbc3/p1;->c()Ljava/lang/Throwable;

    move-result-object v4

    goto :goto_3

    :cond_6
    instance-of v2, p1, Lbc3/w;

    if-eqz v2, :cond_7

    check-cast p1, Lbc3/w;

    goto :goto_2

    :cond_7
    move-object p1, v4

    :goto_2
    if-eqz p1, :cond_8

    iget-object v4, p1, Lbc3/w;->a:Ljava/lang/Throwable;

    :cond_8
    :goto_3
    invoke-virtual {v0, v4}, Lbc3/q;->j(Ljava/lang/Throwable;)V

    if-eqz v1, :cond_9

    :goto_4
    return-object v0

    :cond_9
    return-object v3

    :cond_a
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Lbc3/w;

    if-eqz v1, :cond_b

    check-cast p1, Lbc3/w;

    goto :goto_5

    :cond_b
    move-object p1, v4

    :goto_5
    if-eqz p1, :cond_c

    iget-object v4, p1, Lbc3/w;->a:Ljava/lang/Throwable;

    :cond_c
    invoke-virtual {v0, v4}, Lbc3/q;->j(Ljava/lang/Throwable;)V

    return-object v3
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbc3/t1;->A()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public synthetic cancel()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-interface {p0, v0}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    if-nez p1, :cond_0

    .line 7
    new-instance p1, Lkotlinx/coroutines/JobCancellationException;

    .line 8
    invoke-virtual {p0}, Lbc3/t1;->u()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 9
    invoke-direct {p1, v0, v1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lbc3/k1;)V

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Lbc3/t1;->p(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public synthetic cancel(Ljava/lang/Throwable;)Z
    .locals 2

    if-eqz p1, :cond_0

    .line 2
    invoke-static {p0, p1}, Lbc3/t1;->W(Lbc3/t1;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    goto :goto_0

    .line 3
    :cond_0
    new-instance p1, Lkotlinx/coroutines/JobCancellationException;

    .line 4
    invoke-virtual {p0}, Lbc3/t1;->u()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 5
    invoke-direct {p1, v0, v1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lbc3/k1;)V

    .line 6
    :goto_0
    invoke-virtual {p0, p1}, Lbc3/t1;->p(Ljava/util/concurrent/CancellationException;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Le93/b;->B(Lq83/h;Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Lq83/i;)Lq83/h;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->D(Lq83/h;Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1
.end method

.method public final getCancellationException()Ljava/util/concurrent/CancellationException;
    .locals 4

    sget-object v0, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lbc3/p1;

    const-string v2, "Job is still new or active: "

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    check-cast v0, Lbc3/p1;

    invoke-virtual {v0}, Lbc3/p1;->c()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v2, " is cancelling"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v2, :cond_0

    move-object v3, v0

    check-cast v3, Ljava/util/concurrent/CancellationException;

    :cond_0
    if-nez v3, :cond_2

    new-instance v2, Lkotlinx/coroutines/JobCancellationException;

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lbc3/t1;->u()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-direct {v2, v1, v0, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lbc3/k1;)V

    return-object v2

    :cond_2
    return-object v3

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    instance-of v1, v0, Lbc3/g1;

    if-nez v1, :cond_6

    instance-of v1, v0, Lbc3/w;

    if-eqz v1, :cond_5

    check-cast v0, Lbc3/w;

    iget-object v0, v0, Lbc3/w;->a:Ljava/lang/Throwable;

    invoke-static {p0, v0}, Lbc3/t1;->W(Lbc3/t1;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    return-object v0

    :cond_5
    new-instance v0, Lkotlinx/coroutines/JobCancellationException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v2, " has completed normally"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v3, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lbc3/k1;)V

    return-object v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getChildren()Lxb3/i;
    .locals 3

    new-instance v0, Lbc3/r1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lbc3/r1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v1, Lm83/r;

    invoke-direct {v1, v0}, Lm83/r;-><init>(Lc93/m;)V

    return-object v1
.end method

.method public final getKey()Lq83/i;
    .locals 1

    sget-object v0, Lbc3/j1;->w:Lbc3/j1;

    return-object v0
.end method

.method public final getOnJoin()Llc3/c;
    .locals 3

    new-instance v0, Lad3/z;

    sget-object v1, Lbc3/s1;->w:Lbc3/s1;

    const/4 v2, 0x3

    invoke-static {v2, v1}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-direct {v0, p0, v1}, Lad3/z;-><init>(Lbc3/t1;Lkotlin/jvm/functions/Function3;)V

    return-object v0
.end method

.method public final getParent()Lbc3/k1;
    .locals 1

    sget-object v0, Lbc3/t1;->x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/p;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lbc3/p;->getParent()Lbc3/k1;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;
    .locals 2

    .line 1
    new-instance v0, Lbc3/t0;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lbc3/t0;-><init>(Ljava/lang/Object;I)V

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lbc3/t1;->I(ZLbc3/m1;)Lbc3/s0;

    move-result-object p1

    return-object p1
.end method

.method public final invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lbc3/s0;
    .locals 1

    if-eqz p1, :cond_0

    .line 3
    new-instance p1, Lbc3/i1;

    invoke-direct {p1, p3}, Lbc3/i1;-><init>(Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Lbc3/t0;

    const/4 v0, 0x1

    invoke-direct {p1, p3, v0}, Lbc3/t0;-><init>(Ljava/lang/Object;I)V

    .line 5
    :goto_0
    invoke-virtual {p0, p2, p1}, Lbc3/t1;->I(ZLbc3/m1;)Lbc3/s0;

    move-result-object p1

    return-object p1
.end method

.method public isActive()Z
    .locals 2

    sget-object v0, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lbc3/g1;

    if-eqz v1, :cond_0

    check-cast v0, Lbc3/g1;

    invoke-interface {v0}, Lbc3/g1;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isCancelled()Z
    .locals 2

    sget-object v0, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lbc3/w;

    if-nez v1, :cond_1

    instance-of v1, v0, Lbc3/p1;

    if-eqz v1, :cond_0

    check-cast v0, Lbc3/p1;

    invoke-virtual {v0}, Lbc3/p1;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final isCompleted()Z
    .locals 1

    sget-object v0, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lbc3/g1;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public j(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final join(Lq83/d;)Ljava/lang/Object;
    .locals 4

    :cond_0
    sget-object v0, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lbc3/g1;

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-nez v1, :cond_1

    invoke-interface {p1}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->o(Lq83/j;)V

    return-object v2

    :cond_1
    invoke-virtual {p0, v0}, Lbc3/t1;->U(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    new-instance v0, Lbc3/m;

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance p1, Lbc3/o;

    const/4 v3, 0x1

    invoke-direct {p1, v0, v3}, Lbc3/o;-><init>(Lbc3/m;I)V

    invoke-static {p0, v1, p1}, Lbc3/f0;->v(Lbc3/k1;ZLbc3/m1;)Lbc3/s0;

    move-result-object p1

    new-instance v1, Lbc3/i;

    invoke-direct {v1, p1, v3}, Lbc3/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Lbc3/m;->v(Lbc3/a2;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_3

    return-object p1

    :cond_3
    return-object v2
.end method

.method public l(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lbc3/t1;->j(Ljava/lang/Object;)V

    return-void
.end method

.method public final m(Lq83/d;)Ljava/lang/Object;
    .locals 3

    :cond_0
    sget-object v0, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lbc3/g1;

    if-nez v1, :cond_2

    instance-of p1, v0, Lbc3/w;

    if-nez p1, :cond_1

    invoke-static {v0}, Lbc3/f0;->I(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    check-cast v0, Lbc3/w;

    iget-object p1, v0, Lbc3/w;->a:Ljava/lang/Throwable;

    throw p1

    :cond_2
    invoke-virtual {p0, v0}, Lbc3/t1;->U(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    new-instance v0, Lbc3/n1;

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Lbc3/n1;-><init>(Lq83/d;Lbc3/t1;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance p1, Lbc3/t0;

    const/4 v1, 0x2

    invoke-direct {p1, v0, v1}, Lbc3/t0;-><init>(Ljava/lang/Object;I)V

    const/4 v1, 0x1

    invoke-static {p0, v1, p1}, Lbc3/f0;->v(Lbc3/k1;ZLbc3/m1;)Lbc3/s0;

    move-result-object p1

    new-instance v2, Lbc3/i;

    invoke-direct {v2, p1, v1}, Lbc3/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Lbc3/m;->v(Lbc3/a2;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method public final minusKey(Lq83/i;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->Q(Lq83/h;Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final o(Ljava/lang/Object;)Z
    .locals 9

    sget-object v0, Lbc3/f0;->d:Lhc3/x;

    invoke-virtual {p0}, Lbc3/t1;->D()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    :cond_0
    sget-object v0, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lbc3/g1;

    if-eqz v1, :cond_2

    instance-of v1, v0, Lbc3/p1;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lbc3/p1;

    sget-object v4, Lbc3/p1;->x:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v4, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    if-ne v1, v3, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lbc3/w;

    invoke-virtual {p0, p1}, Lbc3/t1;->y(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    invoke-direct {v1, v4, v2}, Lbc3/w;-><init>(Ljava/lang/Throwable;Z)V

    invoke-virtual {p0, v0, v1}, Lbc3/t1;->X(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lbc3/f0;->f:Lhc3/x;

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Lbc3/f0;->d:Lhc3/x;

    :goto_1
    sget-object v1, Lbc3/f0;->e:Lhc3/x;

    if-ne v0, v1, :cond_3

    goto/16 :goto_7

    :cond_3
    sget-object v1, Lbc3/f0;->d:Lhc3/x;

    if-ne v0, v1, :cond_14

    const/4 v0, 0x0

    move-object v1, v0

    :cond_4
    :goto_2
    sget-object v4, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lbc3/p1;

    if-eqz v6, :cond_c

    monitor-enter v5

    :try_start_0
    move-object v4, v5

    check-cast v4, Lbc3/p1;

    sget-object v6, Lbc3/p1;->z:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v6, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v6, Lbc3/f0;->h:Lhc3/x;

    if-ne v4, v6, :cond_5

    move v4, v3

    goto :goto_3

    :cond_5
    move v4, v2

    :goto_3
    if-eqz v4, :cond_6

    sget-object p1, Lbc3/f0;->g:Lhc3/x;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v5

    :goto_4
    move-object v0, p1

    goto/16 :goto_6

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_6
    :try_start_1
    move-object v4, v5

    check-cast v4, Lbc3/p1;

    invoke-virtual {v4}, Lbc3/p1;->d()Z

    move-result v4

    if-nez p1, :cond_7

    if-nez v4, :cond_9

    :cond_7
    if-nez v1, :cond_8

    invoke-virtual {p0, p1}, Lbc3/t1;->y(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_8
    move-object p1, v5

    check-cast p1, Lbc3/p1;

    invoke-virtual {p1, v1}, Lbc3/p1;->a(Ljava/lang/Throwable;)V

    :cond_9
    move-object p1, v5

    check-cast p1, Lbc3/p1;

    invoke-virtual {p1}, Lbc3/p1;->c()Ljava/lang/Throwable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v4, :cond_a

    move-object v0, p1

    :cond_a
    monitor-exit v5

    if-eqz v0, :cond_b

    check-cast v5, Lbc3/p1;

    iget-object p1, v5, Lbc3/p1;->w:Lbc3/x1;

    invoke-virtual {p0, p1, v0}, Lbc3/t1;->P(Lbc3/x1;Ljava/lang/Throwable;)V

    :cond_b
    sget-object p1, Lbc3/f0;->d:Lhc3/x;

    goto :goto_4

    :goto_5
    monitor-exit v5

    throw p1

    :cond_c
    instance-of v6, v5, Lbc3/g1;

    if-eqz v6, :cond_13

    if-nez v1, :cond_d

    invoke-virtual {p0, p1}, Lbc3/t1;->y(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_d
    move-object v6, v5

    check-cast v6, Lbc3/g1;

    invoke-interface {v6}, Lbc3/g1;->isActive()Z

    move-result v7

    if-eqz v7, :cond_11

    invoke-virtual {p0, v6}, Lbc3/t1;->E(Lbc3/g1;)Lbc3/x1;

    move-result-object v7

    if-nez v7, :cond_e

    goto :goto_2

    :cond_e
    new-instance v8, Lbc3/p1;

    invoke-direct {v8, v7, v1}, Lbc3/p1;-><init>(Lbc3/x1;Ljava/lang/Throwable;)V

    :cond_f
    invoke-virtual {v4, p0, v6, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-virtual {p0, v7, v1}, Lbc3/t1;->P(Lbc3/x1;Ljava/lang/Throwable;)V

    sget-object p1, Lbc3/f0;->d:Lhc3/x;

    goto :goto_4

    :cond_10
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, v6, :cond_f

    goto/16 :goto_2

    :cond_11
    new-instance v4, Lbc3/w;

    invoke-direct {v4, v1, v2}, Lbc3/w;-><init>(Ljava/lang/Throwable;Z)V

    invoke-virtual {p0, v5, v4}, Lbc3/t1;->X(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v6, Lbc3/f0;->d:Lhc3/x;

    if-eq v4, v6, :cond_12

    sget-object v5, Lbc3/f0;->f:Lhc3/x;

    if-eq v4, v5, :cond_4

    move-object v0, v4

    goto :goto_6

    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot happen in "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_13
    sget-object p1, Lbc3/f0;->g:Lhc3/x;

    goto/16 :goto_4

    :cond_14
    :goto_6
    sget-object p1, Lbc3/f0;->d:Lhc3/x;

    if-ne v0, p1, :cond_15

    goto :goto_7

    :cond_15
    sget-object p1, Lbc3/f0;->e:Lhc3/x;

    if-ne v0, p1, :cond_16

    :goto_7
    return v3

    :cond_16
    sget-object p1, Lbc3/f0;->g:Lhc3/x;

    if-ne v0, p1, :cond_17

    return v2

    :cond_17
    invoke-virtual {p0, v0}, Lbc3/t1;->j(Ljava/lang/Object;)V

    return v3
.end method

.method public p(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    invoke-virtual {p0, p1}, Lbc3/t1;->o(Ljava/lang/Object;)Z

    return-void
.end method

.method public final parentCancelled(Lbc3/b2;)V
    .locals 0

    invoke-virtual {p0, p1}, Lbc3/t1;->o(Ljava/lang/Object;)Z

    return-void
.end method

.method public final plus(Lbc3/k1;)Lbc3/k1;
    .locals 0

    .line 1
    return-object p1
.end method

.method public final plus(Lq83/j;)Lq83/j;
    .locals 0

    .line 2
    invoke-static {p0, p1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final q(Ljava/lang/Throwable;)Z
    .locals 3

    invoke-virtual {p0}, Lbc3/t1;->K()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    sget-object v1, Lbc3/t1;->x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/p;

    if-eqz v1, :cond_4

    sget-object v2, Lbc3/z1;->w:Lbc3/z1;

    if-ne v1, v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v1, p1}, Lbc3/p;->a(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_1
    return v0
.end method

.method public final start()Z
    .locals 2

    :goto_0
    sget-object v0, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lbc3/t1;->U(Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lbc3/t1;->N()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x7b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v2, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lbc3/t1;->V(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x7d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lbc3/f0;->r(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ljava/lang/String;
    .locals 1

    const-string v0, "Job was cancelled"

    return-object v0
.end method

.method public v(Ljava/lang/Throwable;)Z
    .locals 1

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lbc3/t1;->o(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lbc3/t1;->C()Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final w(Lbc3/g1;Ljava/lang/Object;)V
    .locals 6

    sget-object v0, Lbc3/t1;->x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/p;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lbc3/s0;->dispose()V

    sget-object v1, Lbc3/z1;->w:Lbc3/z1;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    instance-of v0, p2, Lbc3/w;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p2, Lbc3/w;

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_2

    iget-object p2, p2, Lbc3/w;->a:Ljava/lang/Throwable;

    goto :goto_1

    :cond_2
    move-object p2, v1

    :goto_1
    instance-of v0, p1, Lbc3/m1;

    const-string v2, " for "

    const-string v3, "Exception in completion handler "

    if-eqz v0, :cond_3

    :try_start_0
    move-object v0, p1

    check-cast v0, Lbc3/m1;

    invoke-virtual {v0, p2}, Lbc3/m1;->j(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p2

    new-instance v0, Lkotlinx/coroutines/CompletionHandlerException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lbc3/t1;->G(Lkotlinx/coroutines/CompletionHandlerException;)V

    goto :goto_4

    :cond_3
    invoke-interface {p1}, Lbc3/g1;->b()Lbc3/x1;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance v0, Lhc3/h;

    const/4 v4, 0x1

    invoke-direct {v0, v4}, Lhc3/h;-><init>(I)V

    invoke-virtual {p1, v0, v4}, Lhc3/k;->c(Lhc3/k;I)Z

    sget-object v0, Lhc3/k;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lhc3/k;

    :goto_2
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    instance-of v4, v0, Lbc3/m1;

    if-eqz v4, :cond_5

    :try_start_1
    move-object v4, v0

    check-cast v4, Lbc3/m1;

    invoke-virtual {v4, p2}, Lbc3/m1;->j(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v4

    if-eqz v1, :cond_4

    invoke-static {v1, v4}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_4
    new-instance v1, Lkotlinx/coroutines/CompletionHandlerException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v5, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    invoke-virtual {v0}, Lhc3/k;->f()Lhc3/k;

    move-result-object v0

    goto :goto_2

    :cond_6
    if-eqz v1, :cond_7

    invoke-virtual {p0, v1}, Lbc3/t1;->G(Lkotlinx/coroutines/CompletionHandlerException;)V

    :cond_7
    :goto_4
    return-void
.end method

.method public final y(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 4

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/lang/Throwable;

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Ljava/lang/Throwable;

    if-nez p1, :cond_1

    new-instance p1, Lkotlinx/coroutines/JobCancellationException;

    invoke-virtual {p0}, Lbc3/t1;->u()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0, v1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lbc3/k1;)V

    :cond_1
    return-object p1

    :cond_2
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lbc3/b2;

    check-cast p1, Lbc3/t1;

    sget-object v0, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Lbc3/p1;

    if-eqz v2, :cond_3

    move-object v2, v0

    check-cast v2, Lbc3/p1;

    invoke-virtual {v2}, Lbc3/p1;->c()Ljava/lang/Throwable;

    move-result-object v2

    goto :goto_1

    :cond_3
    instance-of v2, v0, Lbc3/w;

    if-eqz v2, :cond_4

    move-object v2, v0

    check-cast v2, Lbc3/w;

    iget-object v2, v2, Lbc3/w;->a:Ljava/lang/Throwable;

    goto :goto_1

    :cond_4
    instance-of v2, v0, Lbc3/g1;

    if-nez v2, :cond_7

    move-object v2, v1

    :goto_1
    instance-of v3, v2, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_5

    move-object v1, v2

    check-cast v1, Ljava/util/concurrent/CancellationException;

    :cond_5
    if-nez v1, :cond_6

    new-instance v1, Lkotlinx/coroutines/JobCancellationException;

    invoke-static {v0}, Lbc3/t1;->V(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "Parent job is "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, v2, p1}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lbc3/k1;)V

    :cond_6
    return-object v1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot be cancelling child in this state: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final z(Lbc3/p1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lbc3/w;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lbc3/w;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, v0, Lbc3/w;->a:Ljava/lang/Throwable;

    :cond_1
    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Lbc3/p1;->d()Z

    invoke-virtual {p1, v1}, Lbc3/p1;->e(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lbc3/t1;->B(Lbc3/p1;Ljava/util/ArrayList;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-gt v4, v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    new-instance v5, Ljava/util/IdentityHashMap;

    invoke-direct {v5, v4}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-static {v5}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v4

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Throwable;

    if-eq v5, v2, :cond_3

    if-eq v5, v2, :cond_3

    instance-of v6, v5, Ljava/util/concurrent/CancellationException;

    if-nez v6, :cond_3

    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v2, v5}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_4
    :goto_2
    monitor-exit p1

    const/4 v0, 0x0

    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    if-ne v2, v1, :cond_6

    goto :goto_3

    :cond_6
    new-instance p2, Lbc3/w;

    invoke-direct {p2, v2, v0}, Lbc3/w;-><init>(Ljava/lang/Throwable;Z)V

    :goto_3
    if-eqz v2, :cond_8

    invoke-virtual {p0, v2}, Lbc3/t1;->q(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {p0, v2}, Lbc3/t1;->F(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_8

    :cond_7
    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p2

    check-cast v1, Lbc3/w;

    sget-object v2, Lbc3/w;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v2, v1, v0, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    :cond_8
    invoke-virtual {p0, p2}, Lbc3/t1;->R(Ljava/lang/Object;)V

    sget-object v0, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    instance-of v1, p2, Lbc3/g1;

    if-eqz v1, :cond_9

    new-instance v1, Lbc3/h1;

    move-object v2, p2

    check-cast v2, Lbc3/g1;

    invoke-direct {v1, v2}, Lbc3/h1;-><init>(Lbc3/g1;)V

    goto :goto_4

    :cond_9
    move-object v1, p2

    :cond_a
    :goto_4
    invoke-virtual {v0, p0, p1, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_5

    :cond_b
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_a

    :goto_5
    invoke-virtual {p0, p1, p2}, Lbc3/t1;->w(Lbc3/g1;Ljava/lang/Object;)V

    return-object p2

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2
.end method
