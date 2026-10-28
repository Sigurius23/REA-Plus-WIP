.class public final Lcc3/b;
.super Lbc3/w1;
.source "SourceFile"

# interfaces
.implements Lbc3/k0;


# instance fields
.field public final w:Landroid/os/Handler;

.field public final x:Ljava/lang/String;

.field public final y:Z

.field public final z:Lcc3/b;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 7
    invoke-direct {p0, p1, v0, v1}, Lcc3/b;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lbc3/z;-><init>()V

    .line 2
    iput-object p1, p0, Lcc3/b;->w:Landroid/os/Handler;

    .line 3
    iput-object p2, p0, Lcc3/b;->x:Ljava/lang/String;

    .line 4
    iput-boolean p3, p0, Lcc3/b;->y:Z

    if-eqz p3, :cond_0

    move-object p3, p0

    goto :goto_0

    .line 5
    :cond_0
    new-instance p3, Lcc3/b;

    const/4 v0, 0x1

    invoke-direct {p3, p1, p2, v0}, Lcc3/b;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    .line 6
    :goto_0
    iput-object p3, p0, Lcc3/b;->z:Lcc3/b;

    return-void
.end method


# virtual methods
.method public final T(Lq83/j;Ljava/lang/Runnable;)V
    .locals 3

    new-instance v0, Ljava/util/concurrent/CancellationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The task was rejected, the handler underlying the dispatcher \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\' was closed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, Lbc3/f0;->i(Lq83/j;Ljava/util/concurrent/CancellationException;)V

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    invoke-virtual {v0, p1, p2}, Lkc3/d;->dispatch(Lq83/j;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final dispatch(Lq83/j;Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcc3/b;->w:Landroid/os/Handler;

    invoke-virtual {v0, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lcc3/b;->T(Lq83/j;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcc3/b;

    if-eqz v0, :cond_0

    check-cast p1, Lcc3/b;

    iget-object v0, p1, Lcc3/b;->w:Landroid/os/Handler;

    iget-object v1, p0, Lcc3/b;->w:Landroid/os/Handler;

    if-ne v0, v1, :cond_0

    iget-boolean p1, p1, Lcc3/b;->y:Z

    iget-boolean v0, p0, Lcc3/b;->y:Z

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcc3/b;->w:Landroid/os/Handler;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, Lcc3/b;->y:Z

    if-eqz v1, :cond_0

    const/16 v1, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v1, 0x4d5

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method

.method public final i(JLjava/lang/Runnable;Lq83/j;)Lbc3/s0;
    .locals 3

    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    move-wide p1, v0

    :cond_0
    iget-object v0, p0, Lcc3/b;->w:Landroid/os/Handler;

    invoke-virtual {v0, p3, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lcc3/a;

    invoke-direct {p1, p0, p3}, Lcc3/a;-><init>(Lcc3/b;Ljava/lang/Runnable;)V

    return-object p1

    :cond_1
    invoke-virtual {p0, p4, p3}, Lcc3/b;->T(Lq83/j;Ljava/lang/Runnable;)V

    sget-object p1, Lbc3/z1;->w:Lbc3/z1;

    return-object p1
.end method

.method public final isDispatchNeeded(Lq83/j;)Z
    .locals 1

    iget-boolean p1, p0, Lcc3/b;->y:Z

    if-eqz p1, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    iget-object v0, p0, Lcc3/b;->w:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final m(JLbc3/m;)V
    .locals 4

    new-instance v0, Landroidx/lifecycle/m;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p3, p0}, Landroidx/lifecycle/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-wide v1, 0x3fffffffffffffffL    # 1.9999999999999998

    cmp-long v3, p1, v1

    if-lez v3, :cond_0

    move-wide p1, v1

    :cond_0
    iget-object v1, p0, Lcc3/b;->w:Landroid/os/Handler;

    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lbp0/n;

    const/4 p2, 0x1

    invoke-direct {p1, p2, p0, v0}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    iget-object p1, p3, Lbc3/m;->E:Lq83/j;

    invoke-virtual {p0, p1, v0}, Lcc3/b;->T(Lq83/j;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final s()Lbc3/w1;
    .locals 1

    iget-object v0, p0, Lcc3/b;->z:Lcc3/b;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    if-ne p0, v0, :cond_0

    const-string v0, "Dispatchers.Main"

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, v1

    :goto_0
    if-ne p0, v0, :cond_1

    const-string v0, "Dispatchers.Main.immediate"

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_3

    iget-object v0, p0, Lcc3/b;->x:Ljava/lang/String;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcc3/b;->w:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    iget-boolean v1, p0, Lcc3/b;->y:Z

    if-eqz v1, :cond_3

    const-string v1, ".immediate"

    invoke-static {v0, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_3
    return-object v0
.end method
