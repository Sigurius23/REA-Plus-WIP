.class Lno/nordicsemi/android/dfu/DfuBaseService$5;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lno/nordicsemi/android/dfu/DfuBaseService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lno/nordicsemi/android/dfu/DfuBaseService;


# direct methods
.method public constructor <init>(Lno/nordicsemi/android/dfu/DfuBaseService;)V
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->b(Lno/nordicsemi/android/dfu/DfuBaseService;)Lno/nordicsemi/android/dfu/DfuCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->b(Lno/nordicsemi/android/dfu/DfuBaseService;)Lno/nordicsemi/android/dfu/DfuCallback;

    move-result-object v0

    invoke-interface {v0}, Lno/nordicsemi/android/dfu/DfuCallback;->getGattCallback()Lno/nordicsemi/android/dfu/DfuCallback$DfuGattCallback;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    :cond_0
    return-void
.end method

.method public onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->b(Lno/nordicsemi/android/dfu/DfuBaseService;)Lno/nordicsemi/android/dfu/DfuCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->b(Lno/nordicsemi/android/dfu/DfuBaseService;)Lno/nordicsemi/android/dfu/DfuCallback;

    move-result-object v0

    invoke-interface {v0}, Lno/nordicsemi/android/dfu/DfuCallback;->getGattCallback()Lno/nordicsemi/android/dfu/DfuCallback$DfuGattCallback;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    :cond_0
    return-void
.end method

.method public onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->b(Lno/nordicsemi/android/dfu/DfuBaseService;)Lno/nordicsemi/android/dfu/DfuCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->b(Lno/nordicsemi/android/dfu/DfuBaseService;)Lno/nordicsemi/android/dfu/DfuCallback;

    move-result-object v0

    invoke-interface {v0}, Lno/nordicsemi/android/dfu/DfuCallback;->getGattCallback()Lno/nordicsemi/android/dfu/DfuCallback$DfuGattCallback;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    :cond_0
    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 3

    const/4 v0, 0x0

    if-nez p2, :cond_4

    const/4 p2, 0x2

    if-ne p3, p2, :cond_3

    iget-object p2, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    const-string p3, "Connected to GATT server"

    invoke-static {p2, p3}, Lno/nordicsemi/android/dfu/DfuBaseService;->g(Lno/nordicsemi/android/dfu/DfuBaseService;Ljava/lang/String;)V

    iget-object p2, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v1, "Connected to "

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {v1}, Lno/nordicsemi/android/dfu/DfuBaseService;->a(Lno/nordicsemi/android/dfu/DfuBaseService;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const/4 v1, 0x5

    invoke-virtual {p2, v1, p3}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    iget-object p2, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    const/4 p3, -0x2

    iput p3, p2, Lno/nordicsemi/android/dfu/DfuBaseService;->mConnectionState:I

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result p2

    const/16 p3, 0xc

    if-ne p2, p3, :cond_0

    iget-object p2, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    const-string p3, "Waiting 1600 ms for a possible Service Changed indication..."

    invoke-static {p2, p3}, Lno/nordicsemi/android/dfu/DfuBaseService;->g(Lno/nordicsemi/android/dfu/DfuBaseService;Ljava/lang/String;)V

    iget-object p2, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    const-wide/16 v1, 0x640

    invoke-virtual {p2, v1, v2}, Lno/nordicsemi/android/dfu/DfuBaseService;->waitFor(J)V

    :cond_0
    iget-object p2, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    const/4 p3, 0x1

    const-string v1, "Discovering services..."

    invoke-virtual {p2, p3, v1}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    iget-object p2, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    const-string p3, "gatt.discoverServices()"

    invoke-virtual {p2, v0, p3}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    move-result p1

    iget-object p2, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    if-eqz p1, :cond_1

    const-string p3, "succeed"

    goto :goto_0

    :cond_1
    const-string p3, "failed"

    :goto_0
    const-string v0, "Attempting to start service discovery... "

    invoke-virtual {v0, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Lno/nordicsemi/android/dfu/DfuBaseService;->g(Lno/nordicsemi/android/dfu/DfuBaseService;Ljava/lang/String;)V

    if-nez p1, :cond_2

    iget-object p1, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    const/16 p2, 0x1005

    invoke-static {p1, p2}, Lno/nordicsemi/android/dfu/DfuBaseService;->e(Lno/nordicsemi/android/dfu/DfuBaseService;I)V

    goto/16 :goto_3

    :cond_2
    return-void

    :cond_3
    if-nez p3, :cond_7

    iget-object p1, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    const-string p2, "Disconnected from GATT server"

    invoke-static {p1, p2}, Lno/nordicsemi/android/dfu/DfuBaseService;->g(Lno/nordicsemi/android/dfu/DfuBaseService;Ljava/lang/String;)V

    iget-object p1, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    iput v0, p1, Lno/nordicsemi/android/dfu/DfuBaseService;->mConnectionState:I

    invoke-static {p1}, Lno/nordicsemi/android/dfu/DfuBaseService;->b(Lno/nordicsemi/android/dfu/DfuBaseService;)Lno/nordicsemi/android/dfu/DfuCallback;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {p1}, Lno/nordicsemi/android/dfu/DfuBaseService;->b(Lno/nordicsemi/android/dfu/DfuBaseService;)Lno/nordicsemi/android/dfu/DfuCallback;

    move-result-object p1

    invoke-interface {p1}, Lno/nordicsemi/android/dfu/DfuCallback;->getGattCallback()Lno/nordicsemi/android/dfu/DfuCallback$DfuGattCallback;

    move-result-object p1

    invoke-virtual {p1}, Lno/nordicsemi/android/dfu/DfuCallback$DfuGattCallback;->onDisconnected()V

    goto :goto_3

    :cond_4
    const/16 p1, 0x8

    if-eq p2, p1, :cond_6

    const/16 p1, 0x13

    if-ne p2, p1, :cond_5

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Connection state change error: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " newState: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lno/nordicsemi/android/dfu/DfuBaseService;->f(Lno/nordicsemi/android/dfu/DfuBaseService;Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    :goto_1
    iget-object p1, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Target device disconnected with status: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lno/nordicsemi/android/dfu/DfuBaseService;->h(Lno/nordicsemi/android/dfu/DfuBaseService;Ljava/lang/String;)V

    :goto_2
    iget-object p1, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    const v1, 0x8000

    or-int/2addr p2, v1

    invoke-static {p1, p2}, Lno/nordicsemi/android/dfu/DfuBaseService;->e(Lno/nordicsemi/android/dfu/DfuBaseService;I)V

    if-nez p3, :cond_7

    iget-object p1, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    iput v0, p1, Lno/nordicsemi/android/dfu/DfuBaseService;->mConnectionState:I

    invoke-static {p1}, Lno/nordicsemi/android/dfu/DfuBaseService;->b(Lno/nordicsemi/android/dfu/DfuBaseService;)Lno/nordicsemi/android/dfu/DfuCallback;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {p1}, Lno/nordicsemi/android/dfu/DfuBaseService;->b(Lno/nordicsemi/android/dfu/DfuBaseService;)Lno/nordicsemi/android/dfu/DfuCallback;

    move-result-object p1

    invoke-interface {p1}, Lno/nordicsemi/android/dfu/DfuCallback;->getGattCallback()Lno/nordicsemi/android/dfu/DfuCallback$DfuGattCallback;

    move-result-object p1

    invoke-virtual {p1}, Lno/nordicsemi/android/dfu/DfuCallback$DfuGattCallback;->onDisconnected()V

    :cond_7
    :goto_3
    iget-object p1, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {p1}, Lno/nordicsemi/android/dfu/DfuBaseService;->c(Lno/nordicsemi/android/dfu/DfuBaseService;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {p2}, Lno/nordicsemi/android/dfu/DfuBaseService;->c(Lno/nordicsemi/android/dfu/DfuBaseService;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->b(Lno/nordicsemi/android/dfu/DfuBaseService;)Lno/nordicsemi/android/dfu/DfuCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->b(Lno/nordicsemi/android/dfu/DfuBaseService;)Lno/nordicsemi/android/dfu/DfuCallback;

    move-result-object v0

    invoke-interface {v0}, Lno/nordicsemi/android/dfu/DfuCallback;->getGattCallback()Lno/nordicsemi/android/dfu/DfuCallback$DfuGattCallback;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    :cond_0
    return-void
.end method

.method public onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->b(Lno/nordicsemi/android/dfu/DfuBaseService;)Lno/nordicsemi/android/dfu/DfuCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->b(Lno/nordicsemi/android/dfu/DfuBaseService;)Lno/nordicsemi/android/dfu/DfuCallback;

    move-result-object v0

    invoke-interface {v0}, Lno/nordicsemi/android/dfu/DfuCallback;->getGattCallback()Lno/nordicsemi/android/dfu/DfuCallback$DfuGattCallback;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    :cond_0
    return-void
.end method

.method public onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    iget-object v0, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->b(Lno/nordicsemi/android/dfu/DfuBaseService;)Lno/nordicsemi/android/dfu/DfuCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->b(Lno/nordicsemi/android/dfu/DfuBaseService;)Lno/nordicsemi/android/dfu/DfuCallback;

    move-result-object v0

    invoke-interface {v0}, Lno/nordicsemi/android/dfu/DfuCallback;->getGattCallback()Lno/nordicsemi/android/dfu/DfuCallback$DfuGattCallback;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V

    :cond_0
    return-void
.end method

.method public onPhyUpdate(Landroid/bluetooth/BluetoothGatt;III)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    iget-object v0, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->b(Lno/nordicsemi/android/dfu/DfuBaseService;)Lno/nordicsemi/android/dfu/DfuCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->b(Lno/nordicsemi/android/dfu/DfuBaseService;)Lno/nordicsemi/android/dfu/DfuCallback;

    move-result-object v0

    invoke-interface {v0}, Lno/nordicsemi/android/dfu/DfuCallback;->getGattCallback()Lno/nordicsemi/android/dfu/DfuCallback$DfuGattCallback;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/bluetooth/BluetoothGattCallback;->onPhyUpdate(Landroid/bluetooth/BluetoothGatt;III)V

    :cond_0
    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 2

    if-nez p2, :cond_0

    iget-object p1, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    const-string p2, "Services discovered"

    invoke-static {p1, p2}, Lno/nordicsemi/android/dfu/DfuBaseService;->g(Lno/nordicsemi/android/dfu/DfuBaseService;Ljava/lang/String;)V

    iget-object p1, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    const/4 p2, -0x3

    iput p2, p1, Lno/nordicsemi/android/dfu/DfuBaseService;->mConnectionState:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Service discovery error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->f(Lno/nordicsemi/android/dfu/DfuBaseService;Ljava/lang/String;)V

    iget-object p1, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    or-int/lit16 p2, p2, 0x4000

    invoke-static {p1, p2}, Lno/nordicsemi/android/dfu/DfuBaseService;->e(Lno/nordicsemi/android/dfu/DfuBaseService;I)V

    :goto_0
    iget-object p1, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {p1}, Lno/nordicsemi/android/dfu/DfuBaseService;->c(Lno/nordicsemi/android/dfu/DfuBaseService;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, Lno/nordicsemi/android/dfu/DfuBaseService$5;->this$0:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-static {p2}, Lno/nordicsemi/android/dfu/DfuBaseService;->c(Lno/nordicsemi/android/dfu/DfuBaseService;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
