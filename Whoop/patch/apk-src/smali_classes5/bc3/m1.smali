.class public abstract Lbc3/m1;
.super Lhc3/k;
.source "SourceFile"

# interfaces
.implements Lbc3/s0;
.implements Lbc3/g1;


# instance fields
.field public z:Lbc3/t1;


# virtual methods
.method public final b()Lbc3/x1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final dispose()V
    .locals 5

    invoke-virtual {p0}, Lbc3/m1;->h()Lbc3/t1;

    move-result-object v0

    :goto_0
    sget-object v1, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lbc3/m1;

    if-eqz v3, :cond_3

    if-eq v2, p0, :cond_0

    goto :goto_2

    :cond_0
    sget-object v3, Lbc3/f0;->j:Lbc3/u0;

    :cond_1
    invoke-virtual {v1, v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v2, :cond_1

    goto :goto_0

    :cond_3
    instance-of v0, v2, Lbc3/g1;

    if-eqz v0, :cond_8

    check-cast v2, Lbc3/g1;

    invoke-interface {v2}, Lbc3/g1;->b()Lbc3/x1;

    move-result-object v0

    if-eqz v0, :cond_8

    :goto_1
    sget-object v0, Lhc3/k;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lhc3/s;

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    if-ne v1, p0, :cond_5

    check-cast v1, Lhc3/k;

    return-void

    :cond_5
    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v1

    check-cast v2, Lhc3/k;

    sget-object v3, Lhc3/k;->y:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lhc3/s;

    if-nez v4, :cond_6

    new-instance v4, Lhc3/s;

    invoke-direct {v4, v2}, Lhc3/s;-><init>(Lhc3/k;)V

    invoke-virtual {v3, v2, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {v0, p0, v1, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v2}, Lhc3/k;->d()Lhc3/k;

    return-void

    :cond_7
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_6

    goto :goto_1

    :cond_8
    :goto_2
    return-void
.end method

.method public getParent()Lbc3/k1;
    .locals 1

    invoke-virtual {p0}, Lbc3/m1;->h()Lbc3/t1;

    move-result-object v0

    return-object v0
.end method

.method public final h()Lbc3/t1;
    .locals 1

    iget-object v0, p0, Lbc3/m1;->z:Lbc3/t1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "job"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public abstract i()Z
.end method

.method public final isActive()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public abstract j(Ljava/lang/Throwable;)V
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lbc3/f0;->r(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[job@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbc3/m1;->h()Lbc3/t1;

    move-result-object v1

    invoke-static {v1}, Lbc3/f0;->r(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
