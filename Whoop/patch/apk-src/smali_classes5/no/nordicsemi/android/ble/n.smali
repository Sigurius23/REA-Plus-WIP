.class public final synthetic Lno/nordicsemi/android/ble/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/ble/a0;
.implements Lno/nordicsemi/android/ble/b0;


# instance fields
.field public final synthetic a:Landroid/bluetooth/BluetoothGatt;


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothGatt;)V
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/n;->a:Landroid/bluetooth/BluetoothGatt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lqd3/b;)V
    .locals 1

    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    iget-object v0, p0, Lno/nordicsemi/android/ble/n;->a:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-interface {p1, v0}, Lqd3/b;->f(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 2

    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Connected to "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lno/nordicsemi/android/ble/n;->a:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
