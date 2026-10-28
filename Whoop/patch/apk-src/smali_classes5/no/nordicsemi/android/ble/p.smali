.class public final synthetic Lno/nordicsemi/android/ble/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lno/nordicsemi/android/ble/BleManagerHandler$4;ILandroid/bluetooth/BluetoothGatt;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lno/nordicsemi/android/ble/p;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/nordicsemi/android/ble/p;->y:Ljava/lang/Object;

    iput p2, p0, Lno/nordicsemi/android/ble/p;->x:I

    iput-object p3, p0, Lno/nordicsemi/android/ble/p;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lno/nordicsemi/android/ble/g0;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lno/nordicsemi/android/ble/p;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/nordicsemi/android/ble/p;->y:Ljava/lang/Object;

    iput-object p2, p0, Lno/nordicsemi/android/ble/p;->z:Ljava/lang/Object;

    iput p3, p0, Lno/nordicsemi/android/ble/p;->x:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Lno/nordicsemi/android/ble/p;->w:I

    iget v1, p0, Lno/nordicsemi/android/ble/p;->x:I

    iget-object v2, p0, Lno/nordicsemi/android/ble/p;->z:Ljava/lang/Object;

    iget-object v3, p0, Lno/nordicsemi/android/ble/p;->y:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lno/nordicsemi/android/ble/g0;

    check-cast v2, Landroid/bluetooth/BluetoothDevice;

    iget-object v0, v3, Lno/nordicsemi/android/ble/g0;->n:Lio/sentry/android/replay/m;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0, v2, v1}, Lio/sentry/android/replay/m;->a(Landroid/bluetooth/BluetoothDevice;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v1, "k0"

    const-string v2, "Exception in Value callback"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    check-cast v3, Lno/nordicsemi/android/ble/BleManagerHandler$4;

    check-cast v2, Landroid/bluetooth/BluetoothGatt;

    iget-object v0, v3, Lno/nordicsemi/android/ble/BleManagerHandler$4;->a:Lno/nordicsemi/android/ble/c0;

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->M0(Lno/nordicsemi/android/ble/c0;)I

    move-result v3

    if-eq v1, v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->L0(Lno/nordicsemi/android/ble/c0;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->W0(Lno/nordicsemi/android/ble/c0;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->V0(Lno/nordicsemi/android/ble/c0;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v1

    const/16 v3, 0xb

    if-eq v1, v3, :cond_2

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lno/nordicsemi/android/ble/c0;->p1(Lno/nordicsemi/android/ble/c0;Z)V

    new-instance v1, Lno/nordicsemi/android/ble/m;

    invoke-direct {v1, v3}, Lno/nordicsemi/android/ble/m;-><init>(I)V

    const/4 v3, 0x2

    invoke-virtual {v0, v3, v1}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    new-instance v1, Lno/nordicsemi/android/ble/m;

    const/16 v3, 0xa

    invoke-direct {v1, v3}, Lno/nordicsemi/android/ble/m;-><init>(I)V

    const/4 v3, 0x3

    invoke-virtual {v0, v3, v1}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    :cond_2
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
