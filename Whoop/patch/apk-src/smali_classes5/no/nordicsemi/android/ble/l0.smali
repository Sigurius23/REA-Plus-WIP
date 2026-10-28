.class public Lno/nordicsemi/android/ble/l0;
.super Lno/nordicsemi/android/ble/k0;
.source "SourceFile"


# virtual methods
.method public final k()V
    .locals 6

    iget-object v0, p0, Lno/nordicsemi/android/ble/k0;->c:Landroid/os/ConditionVariable;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-eq v1, v2, :cond_6

    iget-object v1, p0, Lno/nordicsemi/android/ble/k0;->f:Lmd3/a;

    iget-object v2, p0, Lno/nordicsemi/android/ble/k0;->g:Lmd3/e;

    iget-object v3, p0, Lno/nordicsemi/android/ble/k0;->h:Lmd3/c;

    :try_start_0
    iget-boolean v4, p0, Lno/nordicsemi/android/ble/k0;->l:Z

    if-nez v4, :cond_5

    iget-boolean v4, p0, Lno/nordicsemi/android/ble/k0;->j:Z

    if-nez v4, :cond_5

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->close()V

    new-instance v4, Lbd3/v;

    const/16 v5, 0x9

    invoke-direct {v4, p0, v5}, Lbd3/v;-><init>(Ljava/lang/Object;I)V

    const/4 v5, 0x0

    iput-object v5, p0, Lno/nordicsemi/android/ble/k0;->f:Lmd3/a;

    invoke-virtual {p0, v4}, Lno/nordicsemi/android/ble/k0;->a(Lmd3/e;)Lno/nordicsemi/android/ble/k0;

    move-result-object v5

    invoke-virtual {v5, v4}, Lno/nordicsemi/android/ble/k0;->c(Lmd3/c;)Lno/nordicsemi/android/ble/k0;

    move-result-object v5

    invoke-virtual {v5, v4}, Lno/nordicsemi/android/ble/k0;->d(Lmd3/d;)Lno/nordicsemi/android/ble/k0;

    move-result-object v5

    invoke-virtual {v5}, Lno/nordicsemi/android/ble/k0;->b()V

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->block()V

    iget v0, v4, Lbd3/v;->x:I

    if-nez v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    if-nez v5, :cond_4

    const/4 v5, -0x1

    if-eq v0, v5, :cond_3

    const/16 v5, -0x64

    if-eq v0, v5, :cond_2

    const v5, -0xf4240

    if-ne v0, v5, :cond_1

    new-instance v0, Lno/nordicsemi/android/ble/exception/InvalidRequestException;

    invoke-direct {v0}, Lno/nordicsemi/android/ble/exception/InvalidRequestException;-><init>()V

    throw v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    new-instance v0, Lno/nordicsemi/android/ble/exception/RequestFailedException;

    iget v4, v4, Lbd3/v;->x:I

    invoke-direct {v0, v4}, Lno/nordicsemi/android/ble/exception/RequestFailedException;-><init>(I)V

    throw v0

    :cond_2
    new-instance v0, Lno/nordicsemi/android/ble/exception/BluetoothDisabledException;

    invoke-direct {v0}, Lno/nordicsemi/android/ble/exception/BluetoothDisabledException;-><init>()V

    throw v0

    :cond_3
    new-instance v0, Lno/nordicsemi/android/ble/exception/DeviceDisconnectedException;

    invoke-direct {v0}, Lno/nordicsemi/android/ble/exception/DeviceDisconnectedException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    iput-object v1, p0, Lno/nordicsemi/android/ble/k0;->f:Lmd3/a;

    iput-object v2, p0, Lno/nordicsemi/android/ble/k0;->g:Lmd3/e;

    iput-object v3, p0, Lno/nordicsemi/android/ble/k0;->h:Lmd3/c;

    return-void

    :cond_5
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    iput-object v1, p0, Lno/nordicsemi/android/ble/k0;->f:Lmd3/a;

    iput-object v2, p0, Lno/nordicsemi/android/ble/k0;->g:Lmd3/e;

    iput-object v3, p0, Lno/nordicsemi/android/ble/k0;->h:Lmd3/c;

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot execute synchronous operation from the UI thread."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
