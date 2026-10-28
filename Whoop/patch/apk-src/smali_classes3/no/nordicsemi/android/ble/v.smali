.class public final synthetic Lno/nordicsemi/android/ble/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/ble/b0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:[B

.field public final synthetic c:Landroid/os/Parcelable;


# direct methods
.method public synthetic constructor <init>(Landroid/os/Parcelable;[BI)V
    .locals 0

    iput p3, p0, Lno/nordicsemi/android/ble/v;->a:I

    iput-object p1, p0, Lno/nordicsemi/android/ble/v;->c:Landroid/os/Parcelable;

    iput-object p2, p0, Lno/nordicsemi/android/ble/v;->b:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lno/nordicsemi/android/ble/v;->a:I

    const-string v1, ", value: "

    iget-object v2, p0, Lno/nordicsemi/android/ble/v;->b:[B

    iget-object v3, p0, Lno/nordicsemi/android/ble/v;->c:Landroid/os/Parcelable;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Landroid/bluetooth/BluetoothGattCharacteristic;

    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "Read Response received from "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lrd3/a;->a([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v3, Landroid/bluetooth/BluetoothGattDescriptor;

    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "Read Response received from descr. "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothGattDescriptor;->getUuid()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lrd3/a;->a([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
