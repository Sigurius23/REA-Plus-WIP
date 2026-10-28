.class public final synthetic Lno/nordicsemi/android/ble/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/ble/b0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lno/nordicsemi/android/ble/r;->a:I

    iput-object p1, p0, Lno/nordicsemi/android/ble/r;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lno/nordicsemi/android/ble/r;->a:I

    iget-object v1, p0, Lno/nordicsemi/android/ble/r;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lno/nordicsemi/android/ble/BleManagerHandler$4;

    iget-object v0, v1, Lno/nordicsemi/android/ble/BleManagerHandler$4;->a:Lno/nordicsemi/android/ble/c0;

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->L0(Lno/nordicsemi/android/ble/c0;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "; reset connected to false"

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    const-string v1, "autoConnect = false called failed; retrying with autoConnect = true"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v1, Landroid/bluetooth/BluetoothGattCharacteristic;

    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Data written to "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v1, Landroid/bluetooth/BluetoothGattDescriptor;

    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Data written to descr. "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGattDescriptor;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
