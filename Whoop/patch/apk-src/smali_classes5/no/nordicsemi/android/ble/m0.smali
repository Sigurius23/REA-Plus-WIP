.class public abstract Lno/nordicsemi/android/ble/m0;
.super Lno/nordicsemi/android/ble/k0;
.source "SourceFile"


# instance fields
.field public n:Lno/nordicsemi/android/ble/j;

.field public o:Z

.field public p:J


# virtual methods
.method public e(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/m0;->n:Lno/nordicsemi/android/ble/j;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lno/nordicsemi/android/ble/k0;->b:Lno/nordicsemi/android/ble/d0;

    invoke-interface {v1, v0}, Lno/nordicsemi/android/ble/d0;->a(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lno/nordicsemi/android/ble/m0;->n:Lno/nordicsemi/android/ble/j;

    :cond_0
    invoke-super {p0, p1, p2}, Lno/nordicsemi/android/ble/k0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/m0;->n:Lno/nordicsemi/android/ble/j;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lno/nordicsemi/android/ble/k0;->b:Lno/nordicsemi/android/ble/d0;

    invoke-interface {v1, v0}, Lno/nordicsemi/android/ble/d0;->a(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lno/nordicsemi/android/ble/m0;->n:Lno/nordicsemi/android/ble/j;

    :cond_0
    invoke-super {p0}, Lno/nordicsemi/android/ble/k0;->f()V

    return-void
.end method

.method public final g(Landroid/bluetooth/BluetoothDevice;)V
    .locals 4

    iget-wide v0, p0, Lno/nordicsemi/android/ble/m0;->p:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    new-instance v2, Lno/nordicsemi/android/ble/j;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p0, p1}, Lno/nordicsemi/android/ble/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, p0, Lno/nordicsemi/android/ble/m0;->n:Lno/nordicsemi/android/ble/j;

    iget-object v3, p0, Lno/nordicsemi/android/ble/k0;->b:Lno/nordicsemi/android/ble/d0;

    invoke-interface {v3, v2, v0, v1}, Lno/nordicsemi/android/ble/d0;->g(Ljava/lang/Runnable;J)V

    :cond_0
    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/k0;->g(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public final h(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/m0;->n:Lno/nordicsemi/android/ble/j;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lno/nordicsemi/android/ble/k0;->b:Lno/nordicsemi/android/ble/d0;

    invoke-interface {v1, v0}, Lno/nordicsemi/android/ble/d0;->a(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lno/nordicsemi/android/ble/m0;->n:Lno/nordicsemi/android/ble/j;

    :cond_0
    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/k0;->h(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public final k()V
    .locals 6

    iget-object v0, p0, Lno/nordicsemi/android/ble/k0;->c:Landroid/os/ConditionVariable;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-eq v1, v2, :cond_9

    iget-boolean v1, p0, Lno/nordicsemi/android/ble/m0;->o:Z

    if-nez v1, :cond_8

    iget-boolean v1, p0, Lno/nordicsemi/android/ble/k0;->l:Z

    if-nez v1, :cond_7

    iget-boolean v1, p0, Lno/nordicsemi/android/ble/k0;->j:Z

    if-nez v1, :cond_7

    iget-object v1, p0, Lno/nordicsemi/android/ble/k0;->g:Lmd3/e;

    iget-object v2, p0, Lno/nordicsemi/android/ble/k0;->h:Lmd3/c;

    :try_start_0
    invoke-virtual {v0}, Landroid/os/ConditionVariable;->close()V

    new-instance v3, Lbd3/v;

    const/16 v4, 0x9

    invoke-direct {v3, p0, v4}, Lbd3/v;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v3}, Lno/nordicsemi/android/ble/k0;->a(Lmd3/e;)Lno/nordicsemi/android/ble/k0;

    move-result-object v4

    invoke-virtual {v4, v3}, Lno/nordicsemi/android/ble/k0;->c(Lmd3/c;)Lno/nordicsemi/android/ble/k0;

    move-result-object v4

    invoke-virtual {v4, v3}, Lno/nordicsemi/android/ble/k0;->d(Lmd3/d;)Lno/nordicsemi/android/ble/k0;

    move-result-object v4

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/k0;->b()V

    iget-wide v4, p0, Lno/nordicsemi/android/ble/m0;->p:J

    invoke-virtual {v0, v4, v5}, Landroid/os/ConditionVariable;->block(J)Z

    move-result v0

    if-eqz v0, :cond_6

    iget v0, v3, Lbd3/v;->x:I

    if-nez v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-nez v4, :cond_5

    const/4 v4, -0x7

    if-eq v0, v4, :cond_4

    const/4 v4, -0x1

    if-eq v0, v4, :cond_3

    const/16 v4, -0x64

    if-eq v0, v4, :cond_2

    const v4, -0xf4240

    if-ne v0, v4, :cond_1

    new-instance v0, Lno/nordicsemi/android/ble/exception/InvalidRequestException;

    invoke-direct {v0}, Lno/nordicsemi/android/ble/exception/InvalidRequestException;-><init>()V

    throw v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    new-instance v0, Lno/nordicsemi/android/ble/exception/RequestFailedException;

    iget v3, v3, Lbd3/v;->x:I

    invoke-direct {v0, v3}, Lno/nordicsemi/android/ble/exception/RequestFailedException;-><init>(I)V

    throw v0

    :cond_2
    new-instance v0, Lno/nordicsemi/android/ble/exception/BluetoothDisabledException;

    invoke-direct {v0}, Lno/nordicsemi/android/ble/exception/BluetoothDisabledException;-><init>()V

    throw v0

    :cond_3
    new-instance v0, Lno/nordicsemi/android/ble/exception/DeviceDisconnectedException;

    invoke-direct {v0}, Lno/nordicsemi/android/ble/exception/DeviceDisconnectedException;-><init>()V

    throw v0

    :cond_4
    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    iput-object v1, p0, Lno/nordicsemi/android/ble/k0;->g:Lmd3/e;

    iput-object v2, p0, Lno/nordicsemi/android/ble/k0;->h:Lmd3/c;

    return-void

    :cond_6
    :try_start_1
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    iput-object v1, p0, Lno/nordicsemi/android/ble/k0;->g:Lmd3/e;

    iput-object v2, p0, Lno/nordicsemi/android/ble/k0;->h:Lmd3/c;

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_8
    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot execute synchronous operation from the UI thread."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public l()V
    .locals 2

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/k0;->k:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/m0;->o:Z

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/k0;->l:Z

    return-void

    :cond_0
    iget-boolean v0, p0, Lno/nordicsemi/android/ble/k0;->l:Z

    if-nez v0, :cond_1

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/m0;->o:Z

    iget-object v0, p0, Lno/nordicsemi/android/ble/k0;->a:Ljc/x;

    invoke-virtual {v0}, Ljc/x;->n()V

    :cond_1
    return-void
.end method

.method public m(Landroid/os/Handler;)Lno/nordicsemi/android/ble/m0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/k0;->i(Landroid/os/Handler;)Lno/nordicsemi/android/ble/k0;

    return-object p0
.end method

.method public final n(Ljc/x;)V
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/k0;->j(Ljc/x;)V

    return-void
.end method
