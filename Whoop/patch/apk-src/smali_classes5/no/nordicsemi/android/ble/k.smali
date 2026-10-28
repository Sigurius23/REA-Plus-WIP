.class public final synthetic Lno/nordicsemi/android/ble/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lno/nordicsemi/android/ble/c0;

.field public final synthetic y:Lno/nordicsemi/android/ble/k0;

.field public final synthetic z:Landroid/bluetooth/BluetoothDevice;


# direct methods
.method public synthetic constructor <init>(Lno/nordicsemi/android/ble/c0;Lno/nordicsemi/android/ble/k0;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    iput p4, p0, Lno/nordicsemi/android/ble/k;->w:I

    iput-object p1, p0, Lno/nordicsemi/android/ble/k;->x:Lno/nordicsemi/android/ble/c0;

    iput-object p2, p0, Lno/nordicsemi/android/ble/k;->y:Lno/nordicsemi/android/ble/k0;

    iput-object p3, p0, Lno/nordicsemi/android/ble/k;->z:Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lno/nordicsemi/android/ble/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lno/nordicsemi/android/ble/k;->y:Lno/nordicsemi/android/ble/k0;

    iget-object v1, p0, Lno/nordicsemi/android/ble/k;->z:Landroid/bluetooth/BluetoothDevice;

    iget-object v2, p0, Lno/nordicsemi/android/ble/k;->x:Lno/nordicsemi/android/ble/c0;

    invoke-static {v2, v0, v1}, Lno/nordicsemi/android/ble/c0;->G0(Lno/nordicsemi/android/ble/c0;Lno/nordicsemi/android/ble/k0;Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/k;->y:Lno/nordicsemi/android/ble/k0;

    iget-object v1, p0, Lno/nordicsemi/android/ble/k;->z:Landroid/bluetooth/BluetoothDevice;

    iget-object v2, p0, Lno/nordicsemi/android/ble/k;->x:Lno/nordicsemi/android/ble/c0;

    invoke-static {v2, v0, v1}, Lno/nordicsemi/android/ble/c0;->F0(Lno/nordicsemi/android/ble/c0;Lno/nordicsemi/android/ble/k0;Landroid/bluetooth/BluetoothDevice;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
