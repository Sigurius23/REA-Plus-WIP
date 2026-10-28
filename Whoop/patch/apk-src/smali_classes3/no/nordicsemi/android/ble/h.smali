.class public final synthetic Lno/nordicsemi/android/ble/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/ble/a0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothDevice;II)V
    .locals 0

    iput p3, p0, Lno/nordicsemi/android/ble/h;->a:I

    iput-object p1, p0, Lno/nordicsemi/android/ble/h;->b:Landroid/bluetooth/BluetoothDevice;

    iput p2, p0, Lno/nordicsemi/android/ble/h;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lqd3/b;)V
    .locals 2

    iget v0, p0, Lno/nordicsemi/android/ble/h;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lno/nordicsemi/android/ble/h;->b:Landroid/bluetooth/BluetoothDevice;

    iget v1, p0, Lno/nordicsemi/android/ble/h;->c:I

    invoke-interface {p1, v0, v1}, Lqd3/b;->q(Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/h;->b:Landroid/bluetooth/BluetoothDevice;

    iget v1, p0, Lno/nordicsemi/android/ble/h;->c:I

    invoke-interface {p1, v0, v1}, Lqd3/b;->q(Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lno/nordicsemi/android/ble/h;->b:Landroid/bluetooth/BluetoothDevice;

    iget v1, p0, Lno/nordicsemi/android/ble/h;->c:I

    invoke-interface {p1, v0, v1}, Lqd3/b;->q(Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lno/nordicsemi/android/ble/h;->b:Landroid/bluetooth/BluetoothDevice;

    iget v1, p0, Lno/nordicsemi/android/ble/h;->c:I

    invoke-interface {p1, v0, v1}, Lqd3/b;->e(Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
