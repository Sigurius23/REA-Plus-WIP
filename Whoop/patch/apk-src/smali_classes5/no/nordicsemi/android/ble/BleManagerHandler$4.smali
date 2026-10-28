.class Lno/nordicsemi/android/ble/BleManagerHandler$4;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# static fields
.field public static final synthetic b:I


# instance fields
.field public final synthetic a:Lno/nordicsemi/android/ble/c0;


# direct methods
.method public constructor <init>(Lno/nordicsemi/android/ble/c0;)V
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->a:Lno/nordicsemi/android/ble/c0;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lno/nordicsemi/android/ble/BleManagerHandler$4;->onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    return-void
.end method

.method public final onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V
    .locals 7

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x4

    .line 2
    iget-object v3, p0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->a:Lno/nordicsemi/android/ble/c0;

    if-eqz p2, :cond_0

    sget-object v4, Lno/nordicsemi/android/ble/c;->j:Ljava/util/UUID;

    .line 3
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 4
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1e

    if-gt p2, p3, :cond_6

    .line 5
    new-instance p2, Lno/nordicsemi/android/ble/m;

    const/16 p3, 0x8

    invoke-direct {p2, p3}, Lno/nordicsemi/android/ble/m;-><init>(I)V

    invoke-virtual {v3, v2, p2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    .line 6
    invoke-static {v3, v1}, Lno/nordicsemi/android/ble/c0;->l1(Lno/nordicsemi/android/ble/c0;Z)V

    .line 7
    invoke-static {v3}, Lno/nordicsemi/android/ble/c0;->S0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/c;

    move-result-object p2

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/c;->T()V

    .line 8
    invoke-virtual {v3}, Lno/nordicsemi/android/ble/c0;->f2()V

    const/4 p2, -0x3

    .line 9
    invoke-virtual {v3, p2}, Lno/nordicsemi/android/ble/c0;->w1(I)V

    .line 10
    invoke-static {v3, v1}, Lno/nordicsemi/android/ble/c0;->p1(Lno/nordicsemi/android/ble/c0;Z)V

    .line 11
    new-instance p2, Lno/nordicsemi/android/ble/m;

    const/16 p3, 0x9

    invoke-direct {p2, p3}, Lno/nordicsemi/android/ble/m;-><init>(I)V

    invoke-virtual {v3, v0, p2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    .line 12
    new-instance p2, Lno/nordicsemi/android/ble/m;

    const/16 p3, 0xa

    invoke-direct {p2, p3}, Lno/nordicsemi/android/ble/m;-><init>(I)V

    const/4 p3, 0x3

    invoke-virtual {v3, p3, p2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    .line 13
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    return-void

    .line 14
    :cond_0
    sget-object v4, Lno/nordicsemi/android/ble/c;->f:Ljava/util/UUID;

    .line 15
    invoke-virtual {p2, v4}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 16
    invoke-virtual {v4}, Landroid/bluetooth/BluetoothGattDescriptor;->getValue()[B

    move-result-object v5

    if-eqz v5, :cond_2

    .line 17
    invoke-virtual {v4}, Landroid/bluetooth/BluetoothGattDescriptor;->getValue()[B

    move-result-object v5

    array-length v5, v5

    if-ne v5, v0, :cond_2

    invoke-virtual {v4}, Landroid/bluetooth/BluetoothGattDescriptor;->getValue()[B

    move-result-object v0

    const/4 v4, 0x0

    aget-byte v0, v0, v4

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 18
    :cond_1
    new-instance v0, Lno/nordicsemi/android/ble/y;

    const/4 v1, 0x1

    invoke-direct {v0, p2, p3, v1}, Lno/nordicsemi/android/ble/y;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;[BI)V

    invoke-virtual {v3, v2, v0}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    .line 19
    invoke-virtual {v3, p1, p2}, Lno/nordicsemi/android/ble/c0;->Y1(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    goto :goto_1

    .line 20
    :cond_2
    :goto_0
    new-instance v0, Lno/nordicsemi/android/ble/y;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p3, v1}, Lno/nordicsemi/android/ble/y;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;[BI)V

    invoke-virtual {v3, v2, v0}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    .line 21
    invoke-virtual {v3, p1, p2}, Lno/nordicsemi/android/ble/c0;->Z1(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    .line 22
    :goto_1
    invoke-static {v3}, Lno/nordicsemi/android/ble/c0;->I0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/o0;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 23
    sget-object v0, Lno/nordicsemi/android/ble/c;->h:Ljava/util/UUID;

    .line 24
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 25
    invoke-static {v3}, Lno/nordicsemi/android/ble/c0;->I0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/o0;

    move-result-object v0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    .line 26
    iget-object v2, v0, Lno/nordicsemi/android/ble/o0;->a:Lmd3/b;

    if-nez v2, :cond_3

    goto :goto_2

    .line 27
    :cond_3
    new-instance v4, Lnd3/a;

    invoke-direct {v4, p3}, Lnd3/a;-><init>([B)V

    .line 28
    iget-object v0, v0, Lno/nordicsemi/android/ble/o0;->b:Lno/nordicsemi/android/ble/c0;

    new-instance v5, Lno/nordicsemi/android/ble/q;

    const/4 v6, 0x2

    invoke-direct {v5, v2, v1, v4, v6}, Lno/nordicsemi/android/ble/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v0, v5}, Lno/nordicsemi/android/ble/d0;->e(Ljava/lang/Runnable;)V

    .line 29
    :cond_4
    :goto_2
    invoke-static {v3}, Lno/nordicsemi/android/ble/c0;->X0(Lno/nordicsemi/android/ble/c0;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lno/nordicsemi/android/ble/o0;

    if-eqz p2, :cond_6

    .line 30
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    .line 31
    iget-object v0, p2, Lno/nordicsemi/android/ble/o0;->a:Lmd3/b;

    if-nez v0, :cond_5

    goto :goto_3

    .line 32
    :cond_5
    new-instance v1, Lnd3/a;

    invoke-direct {v1, p3}, Lnd3/a;-><init>([B)V

    .line 33
    iget-object p2, p2, Lno/nordicsemi/android/ble/o0;->b:Lno/nordicsemi/android/ble/c0;

    new-instance p3, Lno/nordicsemi/android/ble/q;

    const/4 v2, 0x2

    invoke-direct {p3, v0, p1, v1, v2}, Lno/nordicsemi/android/ble/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {p2, p3}, Lno/nordicsemi/android/ble/d0;->e(Ljava/lang/Runnable;)V

    :cond_6
    :goto_3
    return-void
.end method

.method public final onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0, p3}, Lno/nordicsemi/android/ble/BleManagerHandler$4;->onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[BI)V

    return-void
.end method

.method public final onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[BI)V
    .locals 3

    .line 2
    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->a:Lno/nordicsemi/android/ble/c0;

    if-nez p4, :cond_1

    .line 3
    new-instance p4, Lno/nordicsemi/android/ble/v;

    const/4 v1, 0x1

    invoke-direct {p4, p2, p3, v1}, Lno/nordicsemi/android/ble/v;-><init>(Landroid/os/Parcelable;[BI)V

    const/4 v1, 0x4

    invoke-virtual {v0, v1, p4}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    .line 4
    invoke-virtual {v0, p1, p2}, Lno/nordicsemi/android/ble/c0;->a2(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    .line 5
    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    instance-of p4, p2, Lno/nordicsemi/android/ble/h0;

    if-eqz p4, :cond_7

    check-cast p2, Lno/nordicsemi/android/ble/h0;

    .line 6
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p4

    invoke-virtual {p2, p4, p3}, Lno/nordicsemi/android/ble/h0;->p(Landroid/bluetooth/BluetoothDevice;[B)V

    .line 7
    invoke-virtual {p2}, Lno/nordicsemi/android/ble/h0;->o()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 8
    invoke-virtual {v0, p2}, Lno/nordicsemi/android/ble/c0;->x1(Lno/nordicsemi/android/ble/k0;)V

    goto/16 :goto_1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/m0;->h(Landroid/bluetooth/BluetoothDevice;)Z

    goto/16 :goto_1

    :cond_1
    const/16 p2, 0x89

    .line 10
    const-string p3, "BleManager"

    if-ne p4, p2, :cond_2

    .line 11
    const-string p1, "Reading failed with status "

    .line 12
    invoke-static {p4, p1, p3}, Lb9/y;->z(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    const/4 p2, 0x5

    if-eq p4, p2, :cond_5

    const/16 v1, 0x8

    if-ne p4, v1, :cond_3

    goto :goto_0

    .line 13
    :cond_3
    const-string p2, "onCharacteristicRead error "

    const-string v1, ", bond state: "

    .line 14
    invoke-static {p4, p2, v1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 15
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    instance-of p3, p2, Lno/nordicsemi/android/ble/h0;

    if-eqz p3, :cond_4

    check-cast p2, Lno/nordicsemi/android/ble/h0;

    .line 17
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p3

    invoke-virtual {p2, p3, p4}, Lno/nordicsemi/android/ble/m0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    .line 18
    :cond_4
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, p4}, Lno/nordicsemi/android/ble/c0;->t1(Lno/nordicsemi/android/ble/c0;I)V

    goto :goto_1

    .line 19
    :cond_5
    :goto_0
    new-instance v1, Lno/nordicsemi/android/ble/s;

    const/4 v2, 0x4

    invoke-direct {v1, p4, v2}, Lno/nordicsemi/android/ble/s;-><init>(II)V

    invoke-virtual {v0, p2, v1}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    .line 20
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result p2

    const/16 v1, 0xc

    if-ne p2, v1, :cond_6

    .line 21
    const-string p2, "Phone has lost bonding information"

    invoke-static {p3, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c0;->k2()V

    .line 23
    :cond_6
    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    instance-of p3, p2, Lno/nordicsemi/android/ble/h0;

    if-eqz p3, :cond_7

    check-cast p2, Lno/nordicsemi/android/ble/h0;

    .line 24
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1, p4}, Lno/nordicsemi/android/ble/m0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_7
    :goto_1
    const/4 p1, 0x1

    .line 25
    invoke-virtual {v0, p1}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    return-void
.end method

.method public final onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 4

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->a:Lno/nordicsemi/android/ble/c0;

    if-nez p3, :cond_1

    new-instance p3, Lno/nordicsemi/android/ble/r;

    const/4 v1, 0x1

    invoke-direct {p3, p2, v1}, Lno/nordicsemi/android/ble/r;-><init>(Ljava/lang/Object;I)V

    const/4 v1, 0x4

    invoke-virtual {v0, v1, p3}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-virtual {v0, p1, p2}, Lno/nordicsemi/android/ble/c0;->b2(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p3

    instance-of v1, p3, Lno/nordicsemi/android/ble/q0;

    if-eqz v1, :cond_7

    check-cast p3, Lno/nordicsemi/android/ble/q0;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p2

    invoke-virtual {p3, v1, p2}, Lno/nordicsemi/android/ble/q0;->o(Landroid/bluetooth/BluetoothDevice;[B)Z

    iget-boolean p2, p3, Lno/nordicsemi/android/ble/q0;->v:Z

    if-nez p2, :cond_0

    iget-boolean p2, p3, Lno/nordicsemi/android/ble/m0;->o:Z

    if-nez p2, :cond_0

    iget-boolean p2, p3, Lno/nordicsemi/android/ble/k0;->l:Z

    if-nez p2, :cond_0

    invoke-virtual {v0, p3}, Lno/nordicsemi/android/ble/c0;->x1(Lno/nordicsemi/android/ble/k0;)V

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p3, p1}, Lno/nordicsemi/android/ble/m0;->h(Landroid/bluetooth/BluetoothDevice;)Z

    goto/16 :goto_1

    :cond_1
    const/16 p2, 0x89

    const-string v1, "BleManager"

    if-ne p3, p2, :cond_2

    const-string p1, "Writing failed with status "

    invoke-static {p3, p1, v1}, Lb9/y;->z(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    const/4 p2, 0x5

    if-eq p3, p2, :cond_5

    const/16 v2, 0x8

    if-ne p3, v2, :cond_3

    goto :goto_0

    :cond_3
    const-string p2, "onCharacteristicWrite error "

    const-string v2, ", bond state: "

    invoke-static {p3, p2, v2}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    instance-of v1, p2, Lno/nordicsemi/android/ble/q0;

    if-eqz v1, :cond_4

    check-cast p2, Lno/nordicsemi/android/ble/q0;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p2, v1, p3}, Lno/nordicsemi/android/ble/m0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_4
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, p3}, Lno/nordicsemi/android/ble/c0;->t1(Lno/nordicsemi/android/ble/c0;I)V

    goto :goto_1

    :cond_5
    :goto_0
    new-instance v2, Lno/nordicsemi/android/ble/o;

    const/4 v3, 0x5

    invoke-direct {v2, p3, v3}, Lno/nordicsemi/android/ble/o;-><init>(II)V

    invoke-virtual {v0, p2, v2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result p2

    const/16 v2, 0xc

    if-ne p2, v2, :cond_6

    const-string p2, "Phone has lost bonding information"

    invoke-static {v1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c0;->k2()V

    :cond_6
    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    instance-of v1, p2, Lno/nordicsemi/android/ble/q0;

    if-eqz v1, :cond_7

    check-cast p2, Lno/nordicsemi/android/ble/q0;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1, p3}, Lno/nordicsemi/android/ble/m0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_7
    :goto_1
    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    return-void
.end method

.method public final onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    new-instance v4, Lno/nordicsemi/android/ble/z;

    invoke-direct {v4, v2, v3}, Lno/nordicsemi/android/ble/z;-><init>(II)V

    iget-object v5, v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->a:Lno/nordicsemi/android/ble/c0;

    const/4 v6, 0x3

    invoke-virtual {v5, v6, v4}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    const/4 v4, 0x4

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-nez v2, :cond_3

    if-ne v3, v7, :cond_3

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->J0(Lno/nordicsemi/android/ble/c0;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, "BleManager"

    const-string v3, "Device received notification after disconnection."

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v2, Lno/nordicsemi/android/ble/m;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Lno/nordicsemi/android/ble/m;-><init>(I)V

    invoke-virtual {v5, v6, v2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    :try_start_0
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void

    :cond_0
    new-instance v2, Lno/nordicsemi/android/ble/n;

    invoke-direct {v2, v1}, Lno/nordicsemi/android/ble/n;-><init>(Landroid/bluetooth/BluetoothGatt;)V

    invoke-virtual {v5, v4, v2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-static {v5, v8}, Lno/nordicsemi/android/ble/c0;->Z0(Lno/nordicsemi/android/ble/c0;Z)V

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->d1(Lno/nordicsemi/android/ble/c0;)V

    invoke-static {v5, v7}, Lno/nordicsemi/android/ble/c0;->c1(Lno/nordicsemi/android/ble/c0;I)V

    invoke-virtual {v5}, Lno/nordicsemi/android/ble/c0;->k2()V

    new-instance v2, Lno/nordicsemi/android/ble/n;

    invoke-direct {v2, v1}, Lno/nordicsemi/android/ble/n;-><init>(Landroid/bluetooth/BluetoothGatt;)V

    invoke-virtual {v5, v2}, Lno/nordicsemi/android/ble/c0;->l2(Lno/nordicsemi/android/ble/a0;)V

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->V0(Lno/nordicsemi/android/ble/c0;)Z

    move-result v2

    if-nez v2, :cond_1a

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v2

    const/16 v3, 0xc

    if-ne v2, v3, :cond_1

    move v9, v8

    :cond_1
    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->S0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/c;

    move-result-object v2

    invoke-virtual {v2, v9}, Lno/nordicsemi/android/ble/c;->K(Z)I

    move-result v2

    if-lez v2, :cond_2

    new-instance v3, Lno/nordicsemi/android/ble/o;

    const/4 v4, 0x0

    invoke-direct {v3, v2, v4}, Lno/nordicsemi/android/ble/o;-><init>(II)V

    invoke-virtual {v5, v6, v3}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    :cond_2
    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->M0(Lno/nordicsemi/android/ble/c0;)I

    move-result v3

    add-int/2addr v3, v8

    invoke-static {v5, v3}, Lno/nordicsemi/android/ble/c0;->a1(Lno/nordicsemi/android/ble/c0;I)V

    new-instance v4, Lno/nordicsemi/android/ble/p;

    invoke-direct {v4, v0, v3, v1}, Lno/nordicsemi/android/ble/p;-><init>(Lno/nordicsemi/android/ble/BleManagerHandler$4;ILandroid/bluetooth/BluetoothGatt;)V

    int-to-long v1, v2

    invoke-virtual {v5, v4, v1, v2}, Lno/nordicsemi/android/ble/c0;->g(Ljava/lang/Runnable;J)V

    return-void

    :cond_3
    const/4 v10, 0x6

    if-nez v3, :cond_1b

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object v3

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->K0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/e0;

    move-result-object v11

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v12

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->O0(Lno/nordicsemi/android/ble/c0;)J

    move-result-wide v14

    const-wide/16 v16, 0x0

    cmp-long v14, v14, v16

    if-lez v14, :cond_4

    move v14, v8

    goto :goto_0

    :cond_4
    move v14, v9

    :goto_0
    if-eqz v14, :cond_5

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->O0(Lno/nordicsemi/android/ble/c0;)J

    move-result-wide v15

    const-wide/16 v17, 0x4e20

    add-long v15, v15, v17

    cmp-long v12, v12, v15

    if-lez v12, :cond_5

    move v12, v8

    goto :goto_1

    :cond_5
    move v12, v9

    :goto_1
    if-eqz v2, :cond_6

    new-instance v13, Lno/nordicsemi/android/ble/o;

    const/4 v15, 0x1

    invoke-direct {v13, v2, v15}, Lno/nordicsemi/android/ble/o;-><init>(II)V

    const/4 v15, 0x5

    invoke-virtual {v5, v15, v13}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    :cond_6
    if-eqz v2, :cond_8

    if-eqz v14, :cond_8

    if-nez v12, :cond_8

    if-eqz v11, :cond_8

    iget v13, v11, Lno/nordicsemi/android/ble/e0;->t:I

    if-lez v13, :cond_8

    sub-int/2addr v13, v8

    iput v13, v11, Lno/nordicsemi/android/ble/e0;->t:I

    iget v2, v11, Lno/nordicsemi/android/ble/e0;->u:I

    if-lez v2, :cond_7

    new-instance v3, Lno/nordicsemi/android/ble/o;

    const/4 v4, 0x2

    invoke-direct {v3, v2, v4}, Lno/nordicsemi/android/ble/o;-><init>(II)V

    invoke-virtual {v5, v6, v3}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    :cond_7
    new-instance v3, Lno/nordicsemi/android/ble/q;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v11, v4}, Lno/nordicsemi/android/ble/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    int-to-long v1, v2

    invoke-virtual {v5, v3, v1, v2}, Lno/nordicsemi/android/ble/c0;->g(Ljava/lang/Runnable;J)V

    return-void

    :cond_8
    if-eqz v11, :cond_a

    iget-boolean v13, v11, Lno/nordicsemi/android/ble/e0;->v:Z

    if-eqz v13, :cond_a

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->R0(Lno/nordicsemi/android/ble/c0;)Z

    move-result v13

    if-eqz v13, :cond_a

    new-instance v2, Lno/nordicsemi/android/ble/r;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, Lno/nordicsemi/android/ble/r;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v5, v6, v2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->L0(Lno/nordicsemi/android/ble/c0;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-static {v5, v9}, Lno/nordicsemi/android/ble/c0;->Z0(Lno/nordicsemi/android/ble/c0;Z)V

    invoke-static {v5, v9}, Lno/nordicsemi/android/ble/c0;->c1(Lno/nordicsemi/android/ble/c0;I)V

    :cond_9
    new-instance v2, Lno/nordicsemi/android/ble/q;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v11, v3}, Lno/nordicsemi/android/ble/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v5, v2}, Lno/nordicsemi/android/ble/c0;->e(Ljava/lang/Runnable;)V

    return-void

    :cond_a
    invoke-static {v5, v8}, Lno/nordicsemi/android/ble/c0;->l1(Lno/nordicsemi/android/ble/c0;Z)V

    const/4 v13, -0x1

    invoke-virtual {v5, v13}, Lno/nordicsemi/android/ble/c0;->w1(I)V

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->m1(Lno/nordicsemi/android/ble/c0;)V

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->L0(Lno/nordicsemi/android/ble/c0;)Z

    move-result v14

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->P0(Lno/nordicsemi/android/ble/c0;)Z

    move-result v15

    const/16 v7, 0xa

    if-eqz v12, :cond_b

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    invoke-virtual {v5, v4, v7}, Lno/nordicsemi/android/ble/c0;->W1(Landroid/bluetooth/BluetoothDevice;I)V

    goto :goto_3

    :cond_b
    if-eqz v15, :cond_c

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v7

    invoke-virtual {v5, v7, v4}, Lno/nordicsemi/android/ble/c0;->W1(Landroid/bluetooth/BluetoothDevice;I)V

    goto :goto_3

    :cond_c
    if-eqz v3, :cond_d

    iget v4, v3, Lno/nordicsemi/android/ble/k0;->d:I

    if-ne v4, v6, :cond_d

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    invoke-virtual {v5, v4, v9}, Lno/nordicsemi/android/ble/c0;->W1(Landroid/bluetooth/BluetoothDevice;I)V

    goto :goto_3

    :cond_d
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    if-eqz v2, :cond_10

    const/16 v7, 0x8

    if-eq v2, v7, :cond_10

    const/16 v7, 0x13

    if-eq v2, v7, :cond_f

    const/16 v7, 0x16

    if-eq v2, v7, :cond_e

    move v7, v13

    goto :goto_2

    :cond_e
    move v7, v8

    goto :goto_2

    :cond_f
    const/4 v7, 0x2

    goto :goto_2

    :cond_10
    const/16 v7, 0xa

    :goto_2
    invoke-virtual {v5, v4, v7}, Lno/nordicsemi/android/ble/c0;->W1(Landroid/bluetooth/BluetoothDevice;I)V

    :goto_3
    if-eqz v3, :cond_12

    iget v4, v3, Lno/nordicsemi/android/ble/k0;->d:I

    if-eq v4, v6, :cond_12

    if-eq v4, v10, :cond_12

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    if-nez v2, :cond_11

    move v6, v13

    goto :goto_4

    :cond_11
    move v6, v2

    :goto_4
    invoke-virtual {v3, v4, v6}, Lno/nordicsemi/android/ble/k0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->o1(Lno/nordicsemi/android/ble/c0;)V

    :cond_12
    if-eqz v11, :cond_17

    if-eqz v15, :cond_13

    const/4 v13, -0x2

    goto :goto_5

    :cond_13
    if-nez v2, :cond_14

    goto :goto_5

    :cond_14
    const/16 v4, 0x85

    if-eq v2, v4, :cond_15

    const/16 v4, 0x93

    if-ne v2, v4, :cond_16

    :cond_15
    if-eqz v12, :cond_16

    const/4 v13, -0x5

    goto :goto_5

    :cond_16
    move v13, v2

    :goto_5
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    invoke-virtual {v11, v4, v13}, Lno/nordicsemi/android/ble/m0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->Y0(Lno/nordicsemi/android/ble/c0;)V

    :cond_17
    invoke-static {v5, v9}, Lno/nordicsemi/android/ble/c0;->l1(Lno/nordicsemi/android/ble/c0;Z)V

    if-eqz v3, :cond_18

    iget v3, v3, Lno/nordicsemi/android/ble/k0;->d:I

    if-ne v3, v10, :cond_18

    goto :goto_7

    :cond_18
    if-eqz v14, :cond_19

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->R0(Lno/nordicsemi/android/ble/c0;)Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v5, v1, v3}, Lno/nordicsemi/android/ble/c0;->G1(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/e0;)Z

    goto :goto_6

    :cond_19
    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->g1(Lno/nordicsemi/android/ble/c0;)V

    invoke-virtual {v5, v9}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    :goto_6
    if-nez v14, :cond_1a

    if-nez v2, :cond_1c

    :cond_1a
    :goto_7
    return-void

    :cond_1b
    if-eqz v2, :cond_1c

    new-instance v1, Lno/nordicsemi/android/ble/o;

    const/4 v3, 0x6

    invoke-direct {v1, v2, v3}, Lno/nordicsemi/android/ble/o;-><init>(II)V

    invoke-virtual {v5, v10, v1}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    :cond_1c
    invoke-virtual {v5}, Lno/nordicsemi/android/ble/c0;->k2()V

    return-void
.end method

.method public onConnectionUpdated(Landroid/bluetooth/BluetoothGatt;IIII)V
    .locals 6
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->a:Lno/nordicsemi/android/ble/c0;

    if-nez p5, :cond_0

    new-instance p5, Lno/nordicsemi/android/ble/w;

    const/4 v1, 0x0

    invoke-direct {p5, p2, p3, p4, v1}, Lno/nordicsemi/android/ble/w;-><init>(IIII)V

    const/4 v1, 0x4

    invoke-virtual {v0, v1, p5}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-static {v0, p2}, Lno/nordicsemi/android/ble/c0;->i1(Lno/nordicsemi/android/ble/c0;I)V

    invoke-static {v0, p3}, Lno/nordicsemi/android/ble/c0;->j1(Lno/nordicsemi/android/ble/c0;I)V

    invoke-static {v0, p4}, Lno/nordicsemi/android/ble/c0;->r1(Lno/nordicsemi/android/ble/c0;I)V

    invoke-virtual {v0, p1, p2, p3, p4}, Lno/nordicsemi/android/ble/c0;->c2(Landroid/bluetooth/BluetoothGatt;III)V

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    goto :goto_0

    :cond_0
    const/16 p1, 0x3b

    const/4 v1, 0x5

    const-string v2, ", timeout: "

    const-string v3, ", latency: "

    const-string v4, "BleManager"

    if-ne p5, p1, :cond_1

    const-string p1, "onConnectionUpdated received status: Unacceptable connection interval, interval: "

    invoke-static {p2, p3, p1, v3, v2}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Lno/nordicsemi/android/ble/w;

    const/4 p5, 0x1

    invoke-direct {p1, p2, p3, p4, p5}, Lno/nordicsemi/android/ble/w;-><init>(IIII)V

    invoke-virtual {v0, v1, p1}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    goto :goto_0

    :cond_1
    const-string p1, "onConnectionUpdated received status: "

    const-string v5, ", interval: "

    invoke-static {p5, p2, p1, v5, v3}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Lno/nordicsemi/android/ble/x;

    invoke-direct {p1, p5, p2, p3, p4}, Lno/nordicsemi/android/ble/x;-><init>(IIII)V

    invoke-virtual {v0, v1, p1}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c0;->k2()V

    :goto_0
    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->N0(Lno/nordicsemi/android/ble/c0;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->b1(Lno/nordicsemi/android/ble/c0;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    :cond_2
    return-void
.end method

.method public final onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getValue()[B

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, v0}, Lno/nordicsemi/android/ble/BleManagerHandler$4;->onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I[B)V

    return-void
.end method

.method public final onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I[B)V
    .locals 3

    .line 2
    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->a:Lno/nordicsemi/android/ble/c0;

    if-nez p3, :cond_1

    .line 3
    new-instance p3, Lno/nordicsemi/android/ble/v;

    const/4 v1, 0x0

    invoke-direct {p3, p2, p4, v1}, Lno/nordicsemi/android/ble/v;-><init>(Landroid/os/Parcelable;[BI)V

    const/4 v1, 0x4

    invoke-virtual {v0, v1, p3}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    .line 4
    invoke-virtual {v0, p1, p2}, Lno/nordicsemi/android/ble/c0;->d2(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;)V

    .line 5
    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    instance-of p3, p2, Lno/nordicsemi/android/ble/h0;

    if-eqz p3, :cond_7

    check-cast p2, Lno/nordicsemi/android/ble/h0;

    .line 6
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p3

    invoke-virtual {p2, p3, p4}, Lno/nordicsemi/android/ble/h0;->p(Landroid/bluetooth/BluetoothDevice;[B)V

    .line 7
    invoke-virtual {p2}, Lno/nordicsemi/android/ble/h0;->o()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 8
    invoke-virtual {v0, p2}, Lno/nordicsemi/android/ble/c0;->x1(Lno/nordicsemi/android/ble/k0;)V

    goto/16 :goto_1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/m0;->h(Landroid/bluetooth/BluetoothDevice;)Z

    goto/16 :goto_1

    :cond_1
    const/16 p2, 0x89

    .line 10
    const-string p4, "BleManager"

    if-ne p3, p2, :cond_2

    .line 11
    const-string p1, "Reading descriptor failed with status "

    .line 12
    invoke-static {p3, p1, p4}, Lb9/y;->z(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    const/4 p2, 0x5

    if-eq p3, p2, :cond_5

    const/16 v1, 0x8

    if-ne p3, v1, :cond_3

    goto :goto_0

    .line 13
    :cond_3
    const-string p2, "onDescriptorRead error "

    const-string v1, ", bond state: "

    .line 14
    invoke-static {p3, p2, v1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 15
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p4, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    instance-of p4, p2, Lno/nordicsemi/android/ble/h0;

    if-eqz p4, :cond_4

    check-cast p2, Lno/nordicsemi/android/ble/h0;

    .line 17
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p4

    invoke-virtual {p2, p4, p3}, Lno/nordicsemi/android/ble/m0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    .line 18
    :cond_4
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, p3}, Lno/nordicsemi/android/ble/c0;->t1(Lno/nordicsemi/android/ble/c0;I)V

    goto :goto_1

    .line 19
    :cond_5
    :goto_0
    new-instance v1, Lno/nordicsemi/android/ble/s;

    const/4 v2, 0x3

    invoke-direct {v1, p3, v2}, Lno/nordicsemi/android/ble/s;-><init>(II)V

    invoke-virtual {v0, p2, v1}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    .line 20
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result p2

    const/16 v1, 0xc

    if-ne p2, v1, :cond_6

    .line 21
    const-string p2, "Phone has lost bonding information"

    invoke-static {p4, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c0;->k2()V

    .line 23
    :cond_6
    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    instance-of p4, p2, Lno/nordicsemi/android/ble/h0;

    if-eqz p4, :cond_7

    check-cast p2, Lno/nordicsemi/android/ble/h0;

    .line 24
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1, p3}, Lno/nordicsemi/android/ble/m0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_7
    :goto_1
    const/4 p1, 0x1

    .line 25
    invoke-virtual {v0, p1}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    return-void
.end method

.method public final onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 5

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getValue()[B

    move-result-object v0

    const/4 v1, 0x1

    iget-object v2, p0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->a:Lno/nordicsemi/android/ble/c0;

    if-nez p3, :cond_7

    new-instance p3, Lno/nordicsemi/android/ble/r;

    const/4 v3, 0x0

    invoke-direct {p3, p2, v3}, Lno/nordicsemi/android/ble/r;-><init>(Ljava/lang/Object;I)V

    const/4 v3, 0x4

    invoke-virtual {v2, v3, p3}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    sget-object p3, Lno/nordicsemi/android/ble/c;->j:Ljava/util/UUID;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getCharacteristic()Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v4

    invoke-virtual {v4}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {p3, v4}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    new-instance p2, Lno/nordicsemi/android/ble/m;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Lno/nordicsemi/android/ble/m;-><init>(I)V

    invoke-virtual {v2, v3, p2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    goto :goto_1

    :cond_0
    sget-object p3, Lno/nordicsemi/android/ble/c;->f:Ljava/util/UUID;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getUuid()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {p3, v4}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    if-eqz v0, :cond_5

    array-length p3, v0

    const/4 v4, 0x2

    if-ne p3, v4, :cond_5

    aget-byte p3, v0, v1

    if-nez p3, :cond_5

    const/4 p3, 0x0

    aget-byte p3, v0, p3

    if-eqz p3, :cond_3

    if-eq p3, v1, :cond_2

    if-eq p3, v4, :cond_1

    goto :goto_0

    :cond_1
    new-instance p3, Lno/nordicsemi/android/ble/m;

    const/4 v4, 0x5

    invoke-direct {p3, v4}, Lno/nordicsemi/android/ble/m;-><init>(I)V

    invoke-virtual {v2, v3, p3}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    goto :goto_0

    :cond_2
    new-instance p3, Lno/nordicsemi/android/ble/m;

    const/4 v4, 0x3

    invoke-direct {p3, v4}, Lno/nordicsemi/android/ble/m;-><init>(I)V

    invoke-virtual {v2, v3, p3}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    goto :goto_0

    :cond_3
    new-instance p3, Lno/nordicsemi/android/ble/m;

    const/4 v4, 0x2

    invoke-direct {p3, v4}, Lno/nordicsemi/android/ble/m;-><init>(I)V

    invoke-virtual {v2, v3, p3}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    :goto_0
    invoke-virtual {v2, p1, p2}, Lno/nordicsemi/android/ble/c0;->e2(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v2, p1, p2}, Lno/nordicsemi/android/ble/c0;->e2(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;)V

    :cond_5
    :goto_1
    invoke-static {v2}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    instance-of p3, p2, Lno/nordicsemi/android/ble/q0;

    if-eqz p3, :cond_d

    check-cast p2, Lno/nordicsemi/android/ble/q0;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p3

    invoke-virtual {p2, p3, v0}, Lno/nordicsemi/android/ble/q0;->o(Landroid/bluetooth/BluetoothDevice;[B)Z

    iget-boolean p3, p2, Lno/nordicsemi/android/ble/q0;->v:Z

    if-nez p3, :cond_6

    iget-boolean p3, p2, Lno/nordicsemi/android/ble/m0;->o:Z

    if-nez p3, :cond_6

    iget-boolean p3, p2, Lno/nordicsemi/android/ble/k0;->l:Z

    if-nez p3, :cond_6

    invoke-virtual {v2, p2}, Lno/nordicsemi/android/ble/c0;->x1(Lno/nordicsemi/android/ble/k0;)V

    goto/16 :goto_3

    :cond_6
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/m0;->h(Landroid/bluetooth/BluetoothDevice;)Z

    goto/16 :goto_3

    :cond_7
    const/16 p2, 0x89

    const-string v0, "BleManager"

    if-ne p3, p2, :cond_8

    const-string p1, "Writing descriptor failed with status "

    invoke-static {p3, p1, v0}, Lb9/y;->z(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_8
    const/4 p2, 0x5

    if-eq p3, p2, :cond_b

    const/16 v3, 0x8

    if-ne p3, v3, :cond_9

    goto :goto_2

    :cond_9
    const-string p2, "onDescriptorWrite error "

    const-string v3, ", bond state: "

    invoke-static {p3, p2, v3}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v3

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v2}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    instance-of v0, p2, Lno/nordicsemi/android/ble/q0;

    if-eqz v0, :cond_a

    check-cast p2, Lno/nordicsemi/android/ble/q0;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p2, v0, p3}, Lno/nordicsemi/android/ble/m0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_a
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    invoke-static {v2, p3}, Lno/nordicsemi/android/ble/c0;->t1(Lno/nordicsemi/android/ble/c0;I)V

    goto :goto_3

    :cond_b
    :goto_2
    new-instance v3, Lno/nordicsemi/android/ble/o;

    const/4 v4, 0x3

    invoke-direct {v3, p3, v4}, Lno/nordicsemi/android/ble/o;-><init>(II)V

    invoke-virtual {v2, p2, v3}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result p2

    const/16 v3, 0xc

    if-ne p2, v3, :cond_c

    const-string p2, "Phone has lost bonding information"

    invoke-static {v0, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v2}, Lno/nordicsemi/android/ble/c0;->k2()V

    :cond_c
    invoke-static {v2}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    instance-of v0, p2, Lno/nordicsemi/android/ble/q0;

    if-eqz v0, :cond_d

    check-cast p2, Lno/nordicsemi/android/ble/q0;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1, p3}, Lno/nordicsemi/android/ble/m0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_d
    :goto_3
    invoke-virtual {v2, v1}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    return-void
.end method

.method public final onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 4

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->a:Lno/nordicsemi/android/ble/c0;

    if-nez p3, :cond_0

    new-instance p3, Lno/nordicsemi/android/ble/o;

    const/4 v1, 0x4

    invoke-direct {p3, p2, v1}, Lno/nordicsemi/android/ble/o;-><init>(II)V

    invoke-virtual {v0, v1, p3}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    const/16 p3, 0x203

    invoke-static {p3, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {v0, p2}, Lno/nordicsemi/android/ble/c0;->k1(Lno/nordicsemi/android/ble/c0;I)V

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->T0(Lno/nordicsemi/android/ble/c0;)I

    move-result p2

    invoke-virtual {v0, p1, p2}, Lno/nordicsemi/android/ble/c0;->i2(Landroid/bluetooth/BluetoothGatt;I)V

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    instance-of p3, p2, Lno/nordicsemi/android/ble/g0;

    if-eqz p3, :cond_2

    check-cast p2, Lno/nordicsemi/android/ble/g0;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p3

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->T0(Lno/nordicsemi/android/ble/c0;)I

    move-result v1

    iget-object v2, p2, Lno/nordicsemi/android/ble/k0;->b:Lno/nordicsemi/android/ble/d0;

    new-instance v3, Lno/nordicsemi/android/ble/p;

    invoke-direct {v3, p2, p3, v1}, Lno/nordicsemi/android/ble/p;-><init>(Lno/nordicsemi/android/ble/g0;Landroid/bluetooth/BluetoothDevice;I)V

    invoke-interface {v2, v3}, Lno/nordicsemi/android/ble/d0;->e(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/k0;->h(Landroid/bluetooth/BluetoothDevice;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onMtuChanged error: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", mtu: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "BleManager"

    invoke-static {v1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    instance-of v1, p2, Lno/nordicsemi/android/ble/g0;

    if-eqz v1, :cond_1

    check-cast p2, Lno/nordicsemi/android/ble/g0;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p2, v1, p3}, Lno/nordicsemi/android/ble/k0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_1
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, p3}, Lno/nordicsemi/android/ble/c0;->t1(Lno/nordicsemi/android/ble/c0;I)V

    :cond_2
    :goto_0
    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->W0(Lno/nordicsemi/android/ble/c0;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    :cond_3
    return-void
.end method

.method public final onPhyRead(Landroid/bluetooth/BluetoothGatt;III)V
    .locals 1

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->a:Lno/nordicsemi/android/ble/c0;

    if-nez p4, :cond_0

    new-instance p4, Lno/nordicsemi/android/ble/t;

    const/4 v0, 0x0

    invoke-direct {p4, p2, p3, v0}, Lno/nordicsemi/android/ble/t;-><init>(III)V

    const/4 p2, 0x4

    invoke-virtual {p1, p2, p4}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-static {p1}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    goto :goto_0

    :cond_0
    new-instance p2, Lno/nordicsemi/android/ble/s;

    const/4 p3, 0x2

    invoke-direct {p2, p4, p3}, Lno/nordicsemi/android/ble/s;-><init>(II)V

    const/4 p3, 0x5

    invoke-virtual {p1, p3, p2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-static {p1}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/c0;->k2()V

    :goto_0
    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    return-void
.end method

.method public final onPhyUpdate(Landroid/bluetooth/BluetoothGatt;III)V
    .locals 1

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->a:Lno/nordicsemi/android/ble/c0;

    if-nez p4, :cond_0

    new-instance p4, Lno/nordicsemi/android/ble/t;

    const/4 v0, 0x1

    invoke-direct {p4, p2, p3, v0}, Lno/nordicsemi/android/ble/t;-><init>(III)V

    const/4 p2, 0x4

    invoke-virtual {p1, p2, p4}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-static {p1}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    goto :goto_0

    :cond_0
    new-instance p2, Lno/nordicsemi/android/ble/s;

    const/4 p3, 0x5

    invoke-direct {p2, p4, p3}, Lno/nordicsemi/android/ble/s;-><init>(II)V

    invoke-virtual {p1, p3, p2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-static {p1}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/c0;->k2()V

    :goto_0
    invoke-static {p1}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    return-void
.end method

.method public final onReadRemoteRssi(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 1

    iget-object p1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->a:Lno/nordicsemi/android/ble/c0;

    if-nez p3, :cond_0

    new-instance p3, Lno/nordicsemi/android/ble/s;

    const/4 v0, 0x0

    invoke-direct {p3, p2, v0}, Lno/nordicsemi/android/ble/s;-><init>(II)V

    const/4 p2, 0x4

    invoke-virtual {p1, p2, p3}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-static {p1}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    goto :goto_0

    :cond_0
    new-instance p2, Lno/nordicsemi/android/ble/s;

    const/4 v0, 0x1

    invoke-direct {p2, p3, v0}, Lno/nordicsemi/android/ble/s;-><init>(II)V

    const/4 p3, 0x5

    invoke-virtual {p1, p3, p2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-static {p1}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/c0;->k2()V

    :goto_0
    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    return-void
.end method

.method public final onReliableWriteCompleted(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 5

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->a:Lno/nordicsemi/android/ble/c0;

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object v1

    iget v1, v1, Lno/nordicsemi/android/ble/k0;->d:I

    const/16 v2, 0xe

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->n1(Lno/nordicsemi/android/ble/c0;)V

    if-nez p2, :cond_2

    if-eqz v1, :cond_1

    new-instance p2, Lno/nordicsemi/android/ble/u;

    const/4 v1, 0x3

    invoke-direct {p2, v1}, Lno/nordicsemi/android/ble/u;-><init>(I)V

    const/4 v1, 0x4

    invoke-virtual {v0, v1, p2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/k0;->h(Landroid/bluetooth/BluetoothDevice;)Z

    goto :goto_1

    :cond_1
    new-instance p2, Lno/nordicsemi/android/ble/u;

    const/4 v1, 0x4

    invoke-direct {p2, v1}, Lno/nordicsemi/android/ble/u;-><init>(I)V

    const/4 v1, 0x5

    invoke-virtual {v0, v1, p2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p2, v0}, Lno/nordicsemi/android/ble/k0;->h(Landroid/bluetooth/BluetoothDevice;)Z

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    const/4 p1, 0x0

    throw p1

    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "onReliableWriteCompleted execute "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", error "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "BleManager"

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object v1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v1, v2, p2}, Lno/nordicsemi/android/ble/k0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, p2}, Lno/nordicsemi/android/ble/c0;->t1(Lno/nordicsemi/android/ble/c0;I)V

    :goto_1
    invoke-virtual {v0, v3}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    return-void
.end method

.method public onServiceChanged(Landroid/bluetooth/BluetoothGatt;)V
    .locals 3
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    new-instance v0, Lno/nordicsemi/android/ble/u;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lno/nordicsemi/android/ble/u;-><init>(I)V

    iget-object v1, p0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->a:Lno/nordicsemi/android/ble/c0;

    const/4 v2, 0x4

    invoke-virtual {v1, v2, v0}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    const/4 v0, 0x1

    invoke-static {v1, v0}, Lno/nordicsemi/android/ble/c0;->l1(Lno/nordicsemi/android/ble/c0;Z)V

    invoke-static {v1}, Lno/nordicsemi/android/ble/c0;->S0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/c;

    move-result-object v2

    invoke-virtual {v2}, Lno/nordicsemi/android/ble/c;->T()V

    invoke-virtual {v1}, Lno/nordicsemi/android/ble/c0;->f2()V

    const/4 v2, -0x3

    invoke-virtual {v1, v2}, Lno/nordicsemi/android/ble/c0;->w1(I)V

    invoke-static {v1, v0}, Lno/nordicsemi/android/ble/c0;->p1(Lno/nordicsemi/android/ble/c0;Z)V

    const/4 v0, 0x0

    invoke-static {v1, v0}, Lno/nordicsemi/android/ble/c0;->q1(Lno/nordicsemi/android/ble/c0;Z)V

    new-instance v0, Lno/nordicsemi/android/ble/u;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, Lno/nordicsemi/android/ble/u;-><init>(I)V

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v0}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    new-instance v0, Lno/nordicsemi/android/ble/u;

    invoke-direct {v0, v2}, Lno/nordicsemi/android/ble/u;-><init>(I)V

    const/4 v2, 0x3

    invoke-virtual {v1, v2, v0}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    return-void
.end method

.method public final onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 5

    iget-object v0, p0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->a:Lno/nordicsemi/android/ble/c0;

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->V0(Lno/nordicsemi/android/ble/c0;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lno/nordicsemi/android/ble/c0;->p1(Lno/nordicsemi/android/ble/c0;Z)V

    if-nez p2, :cond_8

    new-instance p2, Lno/nordicsemi/android/ble/m;

    invoke-direct {p2, v1}, Lno/nordicsemi/android/ble/m;-><init>(I)V

    const/4 v2, 0x4

    invoke-virtual {v0, v2, p2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    const/4 p2, 0x1

    invoke-static {v0, p2}, Lno/nordicsemi/android/ble/c0;->q1(Lno/nordicsemi/android/ble/c0;Z)V

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->S0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/c;

    move-result-object v3

    invoke-virtual {v3, p1}, Lno/nordicsemi/android/ble/c;->O(Landroid/bluetooth/BluetoothGatt;)Z

    move-result v3

    if-eqz v3, :cond_7

    new-instance v3, Lno/nordicsemi/android/ble/m;

    invoke-direct {v3, v2}, Lno/nordicsemi/android/ble/m;-><init>(I)V

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v3}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-static {v0, v1}, Lno/nordicsemi/android/ble/c0;->e1(Lno/nordicsemi/android/ble/c0;Z)V

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->S0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/c;

    move-result-object v3

    invoke-virtual {v3, p1}, Lno/nordicsemi/android/ble/c;->N(Landroid/bluetooth/BluetoothGatt;)Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v3, Lno/nordicsemi/android/ble/m;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, Lno/nordicsemi/android/ble/m;-><init>(I)V

    invoke-virtual {v0, v2, v3}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    :cond_1
    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c0;->k2()V

    invoke-static {v0, p2}, Lno/nordicsemi/android/ble/c0;->l1(Lno/nordicsemi/android/ble/c0;Z)V

    invoke-static {v0, p2}, Lno/nordicsemi/android/ble/c0;->h1(Lno/nordicsemi/android/ble/c0;Z)V

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/ble/c0;->E1(Landroid/bluetooth/BluetoothGatt;)Ljava/util/Deque;

    move-result-object p1

    invoke-static {v0, p1}, Lno/nordicsemi/android/ble/c0;->f1(Lno/nordicsemi/android/ble/c0;Ljava/util/Deque;)V

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->Q0(Lno/nordicsemi/android/ble/c0;)Ljava/util/Deque;

    move-result-object p1

    if-eqz p1, :cond_2

    move p1, p2

    goto :goto_0

    :cond_2
    move p1, v1

    :goto_0
    if-eqz p1, :cond_3

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->Q0(Lno/nordicsemi/android/ble/c0;)Ljava/util/Deque;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lno/nordicsemi/android/ble/k0;

    invoke-virtual {v3, v0}, Lno/nordicsemi/android/ble/k0;->j(Ljc/x;)V

    iput-boolean p2, v3, Lno/nordicsemi/android/ble/k0;->j:Z

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->Q0(Lno/nordicsemi/android/ble/c0;)Ljava/util/Deque;

    move-result-object v2

    if-nez v2, :cond_4

    new-instance v2, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v2}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    invoke-static {v0, v2}, Lno/nordicsemi/android/ble/c0;->f1(Lno/nordicsemi/android/ble/c0;Ljava/util/Deque;)V

    :cond_4
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1c

    if-ne v2, v3, :cond_5

    new-instance v2, Lno/nordicsemi/android/ble/q0;

    const/16 v3, 0x1e

    const/4 v4, 0x0

    invoke-direct {v2, v4, v3}, Lno/nordicsemi/android/ble/q0;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    invoke-virtual {v2, v0}, Lno/nordicsemi/android/ble/m0;->n(Ljc/x;)V

    invoke-virtual {v0, v2}, Lno/nordicsemi/android/ble/c0;->x1(Lno/nordicsemi/android/ble/k0;)V

    invoke-static {v0, p2}, Lno/nordicsemi/android/ble/c0;->l1(Lno/nordicsemi/android/ble/c0;Z)V

    :cond_5
    if-eqz p1, :cond_6

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->S0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/c;

    move-result-object p1

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/c;->U()V

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->S0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_6
    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->S0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/c;

    move-result-object p1

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/c;->L()V

    invoke-static {v0, v1}, Lno/nordicsemi/android/ble/c0;->h1(Lno/nordicsemi/android/ble/c0;Z)V

    invoke-virtual {v0, p2}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    return-void

    :cond_7
    new-instance p1, Lno/nordicsemi/android/ble/m;

    const/4 v1, 0x7

    invoke-direct {p1, v1}, Lno/nordicsemi/android/ble/m;-><init>(I)V

    const/4 v1, 0x5

    invoke-virtual {v0, v1, p1}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-static {v0, p2}, Lno/nordicsemi/android/ble/c0;->e1(Lno/nordicsemi/android/ble/c0;Z)V

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c0;->k2()V

    invoke-virtual {v0, v2}, Lno/nordicsemi/android/ble/c0;->J1(I)V

    return-void

    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onServicesDiscovered error "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "BleManager"

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, p2}, Lno/nordicsemi/android/ble/c0;->t1(Lno/nordicsemi/android/ble/c0;I)V

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->K0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/e0;

    move-result-object p2

    if-eqz p2, :cond_9

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->K0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/e0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    const/4 v1, -0x4

    invoke-virtual {p2, p1, v1}, Lno/nordicsemi/android/ble/m0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-static {v0}, Lno/nordicsemi/android/ble/c0;->Y0(Lno/nordicsemi/android/ble/c0;)V

    :cond_9
    const/4 p1, -0x1

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/ble/c0;->J1(I)V

    return-void
.end method
