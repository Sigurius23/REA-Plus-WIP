.class public final Loc3/d;
.super Lbc3/w1;
.source "SourceFile"

# interfaces
.implements Lbc3/k0;


# instance fields
.field public final w:Ll83/p;

.field public final x:Loc3/c;


# direct methods
.method public constructor <init>(Lk80/d;)V
    .locals 0

    invoke-direct {p0}, Lbc3/z;-><init>()V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Loc3/d;->w:Ll83/p;

    new-instance p1, Loc3/c;

    invoke-direct {p1}, Loc3/c;-><init>()V

    iput-object p1, p0, Loc3/d;->x:Loc3/c;

    return-void
.end method


# virtual methods
.method public final T()Lbc3/z;
    .locals 6

    iget-object v0, p0, Loc3/d;->x:Loc3/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Loc3/c;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    new-instance v2, Ljava/lang/Throwable;

    const-string v3, "reader location"

    invoke-direct {v2, v3}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Loc3/c;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    sget-object v2, Loc3/c;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Throwable;

    if-eqz v2, :cond_0

    sget-object v3, Loc3/c;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    new-instance v4, Ljava/lang/IllegalStateException;

    const-string v5, "Dispatchers.Main is used concurrently with setting it"

    invoke-direct {v4, v5, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v3, v0, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    sget-object v2, Loc3/c;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    check-cast v2, Lbc3/z;

    if-nez v2, :cond_1

    iget-object v0, p0, Loc3/d;->w:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/z;

    return-object v0

    :cond_1
    return-object v2
.end method

.method public final dispatch(Lq83/j;Ljava/lang/Runnable;)V
    .locals 1

    invoke-virtual {p0}, Loc3/d;->T()Lbc3/z;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lbc3/z;->dispatch(Lq83/j;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final dispatchYield(Lq83/j;Ljava/lang/Runnable;)V
    .locals 1

    invoke-virtual {p0}, Loc3/d;->T()Lbc3/z;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lbc3/z;->dispatchYield(Lq83/j;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final i(JLjava/lang/Runnable;Lq83/j;)Lbc3/s0;
    .locals 2

    invoke-virtual {p0}, Loc3/d;->T()Lbc3/z;

    move-result-object v0

    instance-of v1, v0, Lbc3/k0;

    if-eqz v1, :cond_0

    check-cast v0, Lbc3/k0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, Lbc3/h0;->a:Lbc3/k0;

    :cond_1
    invoke-interface {v0, p1, p2, p3, p4}, Lbc3/k0;->i(JLjava/lang/Runnable;Lq83/j;)Lbc3/s0;

    move-result-object p1

    return-object p1
.end method

.method public final isDispatchNeeded(Lq83/j;)Z
    .locals 1

    invoke-virtual {p0}, Loc3/d;->T()Lbc3/z;

    move-result-object v0

    invoke-virtual {v0, p1}, Lbc3/z;->isDispatchNeeded(Lq83/j;)Z

    move-result p1

    return p1
.end method

.method public final m(JLbc3/m;)V
    .locals 2

    invoke-virtual {p0}, Loc3/d;->T()Lbc3/z;

    move-result-object v0

    instance-of v1, v0, Lbc3/k0;

    if-eqz v1, :cond_0

    check-cast v0, Lbc3/k0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, Lbc3/h0;->a:Lbc3/k0;

    :cond_1
    invoke-interface {v0, p1, p2, p3}, Lbc3/k0;->m(JLbc3/m;)V

    return-void
.end method

.method public final s()Lbc3/w1;
    .locals 2

    invoke-virtual {p0}, Loc3/d;->T()Lbc3/z;

    move-result-object v0

    instance-of v1, v0, Lbc3/w1;

    if-eqz v1, :cond_0

    check-cast v0, Lbc3/w1;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    return-object p0
.end method
