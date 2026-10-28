.class public final synthetic Lno/nordicsemi/android/ble/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/ble/a0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lno/nordicsemi/android/ble/g;->a:I

    iput-object p1, p0, Lno/nordicsemi/android/ble/g;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lqd3/b;)V
    .locals 2

    iget v0, p0, Lno/nordicsemi/android/ble/g;->a:I

    iget-object v1, p0, Lno/nordicsemi/android/ble/g;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Landroid/bluetooth/BluetoothGatt;

    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    const/4 v1, 0x5

    invoke-interface {p1, v0, v1}, Lqd3/b;->e(Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    :pswitch_0
    check-cast v1, Landroid/bluetooth/BluetoothDevice;

    invoke-interface {p1, v1}, Lqd3/b;->u(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :pswitch_1
    check-cast v1, Landroid/bluetooth/BluetoothDevice;

    const/4 v0, 0x0

    invoke-interface {p1, v1, v0}, Lqd3/b;->q(Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
