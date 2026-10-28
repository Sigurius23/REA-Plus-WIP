.class public final synthetic Lno/nordicsemi/android/ble/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lno/nordicsemi/android/ble/q;->w:I

    iput-object p1, p0, Lno/nordicsemi/android/ble/q;->x:Ljava/lang/Object;

    iput-object p2, p0, Lno/nordicsemi/android/ble/q;->y:Ljava/lang/Object;

    iput-object p3, p0, Lno/nordicsemi/android/ble/q;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Lno/nordicsemi/android/ble/q;->w:I

    iget-object v1, p0, Lno/nordicsemi/android/ble/q;->z:Ljava/lang/Object;

    iget-object v2, p0, Lno/nordicsemi/android/ble/q;->y:Ljava/lang/Object;

    iget-object v3, p0, Lno/nordicsemi/android/ble/q;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lmd3/b;

    check-cast v2, Landroid/bluetooth/BluetoothDevice;

    check-cast v1, Lnd3/a;

    :try_start_0
    invoke-interface {v3, v2, v1}, Lmd3/b;->a(Landroid/bluetooth/BluetoothDevice;Lnd3/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v1, "o0"

    const-string v2, "Exception in Value callback"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void

    :pswitch_0
    check-cast v3, Lno/nordicsemi/android/ble/BleManagerHandler$4;

    check-cast v2, Landroid/bluetooth/BluetoothGatt;

    check-cast v1, Lno/nordicsemi/android/ble/e0;

    iget-object v0, v3, Lno/nordicsemi/android/ble/BleManagerHandler$4;->a:Lno/nordicsemi/android/ble/c0;

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lno/nordicsemi/android/ble/c0;->G1(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/e0;)Z

    return-void

    :pswitch_1
    check-cast v3, Lno/nordicsemi/android/ble/BleManagerHandler$4;

    check-cast v2, Landroid/bluetooth/BluetoothGatt;

    check-cast v1, Lno/nordicsemi/android/ble/e0;

    iget-object v0, v3, Lno/nordicsemi/android/ble/BleManagerHandler$4;->a:Lno/nordicsemi/android/ble/c0;

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    invoke-virtual {v0, v3, v1}, Lno/nordicsemi/android/ble/c0;->G1(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/e0;)Z

    iget-object v1, v0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lno/nordicsemi/android/ble/c0;->c1(Lno/nordicsemi/android/ble/c0;I)V

    new-instance v1, Lno/nordicsemi/android/ble/u;

    const/4 v3, 0x5

    invoke-direct {v1, v3}, Lno/nordicsemi/android/ble/u;-><init>(I)V

    const/4 v4, 0x4

    invoke-virtual {v0, v4, v1}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c0;->k2()V

    new-instance v1, Lno/nordicsemi/android/ble/g;

    invoke-direct {v1, v2, v3}, Lno/nordicsemi/android/ble/g;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Lno/nordicsemi/android/ble/c0;->l2(Lno/nordicsemi/android/ble/a0;)V

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c0;->f2()V

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
