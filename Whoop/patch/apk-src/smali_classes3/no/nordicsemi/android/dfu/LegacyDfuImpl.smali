.class Lno/nordicsemi/android/dfu/LegacyDfuImpl;
.super Lno/nordicsemi/android/dfu/BaseCustomDfuImpl;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "MissingPermission"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lno/nordicsemi/android/dfu/LegacyDfuImpl$LegacyBluetoothCallback;
    }
.end annotation


# static fields
.field static final DEFAULT_DFU_CONTROL_POINT_UUID:Ljava/util/UUID;

.field static final DEFAULT_DFU_PACKET_UUID:Ljava/util/UUID;

.field static final DEFAULT_DFU_SERVICE_UUID:Ljava/util/UUID;

.field static final DEFAULT_DFU_VERSION_UUID:Ljava/util/UUID;

.field static DFU_CONTROL_POINT_UUID:Ljava/util/UUID; = null

.field static DFU_PACKET_UUID:Ljava/util/UUID; = null

.field static DFU_SERVICE_UUID:Ljava/util/UUID; = null

.field private static final DFU_STATUS_SUCCESS:I = 0x1

.field static DFU_VERSION_UUID:Ljava/util/UUID; = null

.field private static final OP_CODE_ACTIVATE_AND_RESET:[B

.field private static final OP_CODE_ACTIVATE_AND_RESET_KEY:I = 0x5

.field private static final OP_CODE_INIT_DFU_PARAMS:[B

.field private static final OP_CODE_INIT_DFU_PARAMS_COMPLETE:[B

.field private static final OP_CODE_INIT_DFU_PARAMS_KEY:I = 0x2

.field private static final OP_CODE_INIT_DFU_PARAMS_START:[B

.field private static final OP_CODE_PACKET_RECEIPT_NOTIF_KEY:I = 0x11

.field private static final OP_CODE_PACKET_RECEIPT_NOTIF_REQ:[B

.field private static final OP_CODE_PACKET_RECEIPT_NOTIF_REQ_KEY:I = 0x8

.field private static final OP_CODE_RECEIVE_FIRMWARE_IMAGE:[B

.field private static final OP_CODE_RECEIVE_FIRMWARE_IMAGE_KEY:I = 0x3

.field private static final OP_CODE_RESET:[B

.field private static final OP_CODE_RESET_KEY:I = 0x6

.field private static final OP_CODE_RESPONSE_CODE_KEY:I = 0x10

.field private static final OP_CODE_START_DFU:[B

.field private static final OP_CODE_START_DFU_KEY:I = 0x1

.field private static final OP_CODE_START_DFU_V1:[B

.field private static final OP_CODE_VALIDATE:[B

.field private static final OP_CODE_VALIDATE_KEY:I = 0x4


# instance fields
.field private final mBluetoothCallback:Lno/nordicsemi/android/dfu/LegacyDfuImpl$LegacyBluetoothCallback;

.field private mControlPointCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

.field private mImageSizeInProgress:Z

.field private mPacketCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Ljava/util/UUID;

    const-wide v1, 0x15301212efdeL

    const-wide v3, 0x1523785feabcd123L    # 7.580602127171364E-207

    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    sput-object v0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->DEFAULT_DFU_SERVICE_UUID:Ljava/util/UUID;

    new-instance v1, Ljava/util/UUID;

    const-wide v5, 0x15311212efdeL

    invoke-direct {v1, v5, v6, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    sput-object v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->DEFAULT_DFU_CONTROL_POINT_UUID:Ljava/util/UUID;

    new-instance v2, Ljava/util/UUID;

    const-wide v5, 0x15321212efdeL

    invoke-direct {v2, v5, v6, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    sput-object v2, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->DEFAULT_DFU_PACKET_UUID:Ljava/util/UUID;

    new-instance v5, Ljava/util/UUID;

    const-wide v6, 0x15341212efdeL

    invoke-direct {v5, v6, v7, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    sput-object v5, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->DEFAULT_DFU_VERSION_UUID:Ljava/util/UUID;

    sput-object v0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->DFU_SERVICE_UUID:Ljava/util/UUID;

    sput-object v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->DFU_CONTROL_POINT_UUID:Ljava/util/UUID;

    sput-object v2, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->DFU_PACKET_UUID:Ljava/util/UUID;

    sput-object v5, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->DFU_VERSION_UUID:Ljava/util/UUID;

    const/4 v0, 0x2

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_START_DFU:[B

    const/4 v1, 0x1

    new-array v2, v1, [B

    const/4 v3, 0x0

    aput-byte v1, v2, v3

    sput-object v2, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_START_DFU_V1:[B

    new-array v2, v1, [B

    aput-byte v0, v2, v3

    sput-object v2, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_INIT_DFU_PARAMS:[B

    new-array v2, v0, [B

    fill-array-data v2, :array_1

    sput-object v2, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_INIT_DFU_PARAMS_START:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    sput-object v0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_INIT_DFU_PARAMS_COMPLETE:[B

    new-array v0, v1, [B

    const/4 v2, 0x3

    aput-byte v2, v0, v3

    sput-object v0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_RECEIVE_FIRMWARE_IMAGE:[B

    new-array v0, v1, [B

    const/4 v4, 0x4

    aput-byte v4, v0, v3

    sput-object v0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_VALIDATE:[B

    new-array v0, v1, [B

    const/4 v4, 0x5

    aput-byte v4, v0, v3

    sput-object v0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_ACTIVATE_AND_RESET:[B

    new-array v0, v1, [B

    const/4 v1, 0x6

    aput-byte v1, v0, v3

    sput-object v0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_RESET:[B

    new-array v0, v2, [B

    fill-array-data v0, :array_3

    sput-object v0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_PACKET_RECEIPT_NOTIF_REQ:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x1t
        0x0t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x2t
        0x0t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x2t
        0x1t
    .end array-data

    nop

    :array_3
    .array-data 1
        0x8t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Intent;Lno/nordicsemi/android/dfu/DfuBaseService;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lno/nordicsemi/android/dfu/BaseCustomDfuImpl;-><init>(Landroid/content/Intent;Lno/nordicsemi/android/dfu/DfuBaseService;)V

    new-instance p1, Lno/nordicsemi/android/dfu/LegacyDfuImpl$LegacyBluetoothCallback;

    invoke-direct {p1, p0}, Lno/nordicsemi/android/dfu/LegacyDfuImpl$LegacyBluetoothCallback;-><init>(Lno/nordicsemi/android/dfu/LegacyDfuImpl;)V

    iput-object p1, p0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mBluetoothCallback:Lno/nordicsemi/android/dfu/LegacyDfuImpl$LegacyBluetoothCallback;

    return-void
.end method

.method private getStatusCode([BI)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lno/nordicsemi/android/dfu/internal/exception/UnknownResponseException;
        }
    .end annotation

    const/16 v0, 0x10

    if-eqz p1, :cond_0

    array-length v1, p1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    aget-byte v1, p1, v1

    if-ne v1, v0, :cond_0

    const/4 v1, 0x1

    aget-byte v2, p1, v1

    if-ne v2, p2, :cond_0

    const/4 v2, 0x2

    aget-byte v2, p1, v2

    if-lt v2, v1, :cond_0

    const/4 v1, 0x6

    if-gt v2, v1, :cond_0

    return v2

    :cond_0
    new-instance v1, Lno/nordicsemi/android/dfu/internal/exception/UnknownResponseException;

    const-string v2, "Invalid response received"

    invoke-direct {v1, v2, p1, v0, p2}, Lno/nordicsemi/android/dfu/internal/exception/UnknownResponseException;-><init>(Ljava/lang/String;[BII)V

    throw v1
.end method

.method public static bridge synthetic h(Lno/nordicsemi/android/dfu/LegacyDfuImpl;)Z
    .locals 0

    iget-boolean p0, p0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mImageSizeInProgress:Z

    return p0
.end method

.method public static bridge synthetic i(Lno/nordicsemi/android/dfu/LegacyDfuImpl;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mImageSizeInProgress:Z

    return-void
.end method

.method private readVersion(Landroid/bluetooth/BluetoothGattCharacteristic;)I
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/16 v1, 0x12

    invoke-virtual {p1, v1, v0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getIntValue(II)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_0
    return v0
.end method

.method private resetAndRestart(Landroid/bluetooth/BluetoothGatt;Landroid/content/Intent;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lno/nordicsemi/android/dfu/internal/exception/DfuException;,
            Lno/nordicsemi/android/dfu/internal/exception/DeviceDisconnectedException;,
            Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException;
        }
    .end annotation

    iget-object v0, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const/16 v1, 0xf

    const-string v2, "Last upload interrupted. Restarting device..."

    invoke-virtual {v0, v1, v2}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    iget-object v0, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mProgressInfo:Lno/nordicsemi/android/dfu/DfuProgressInfo;

    const/4 v1, -0x5

    invoke-virtual {v0, v1}, Lno/nordicsemi/android/dfu/DfuProgressInfo;->setProgress(I)V

    const-string v0, "Sending Reset command (Op Code = 6)"

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v0, p0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mControlPointCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    sget-object v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_RESET:[B

    invoke-direct {p0, v0, v1}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->writeOpCode(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    iget-object v0, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const/16 v1, 0xa

    const-string v2, "Reset request sent"

    invoke-virtual {v0, v1, v2}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    iget-object v0, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-virtual {v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->waitUntilDisconnected()V

    iget-object v0, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const/4 v1, 0x5

    const-string v2, "Disconnected by the remote device"

    invoke-virtual {v0, v1, v2}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    sget-object v0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->GENERIC_ATTRIBUTE_SERVICE_UUID:Ljava/util/UUID;

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    sget-object v3, Lno/nordicsemi/android/dfu/BaseDfuImpl;->SERVICE_CHANGED_UUID:Ljava/util/UUID;

    invoke-virtual {v0, v3}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v3, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    xor-int/2addr v0, v2

    invoke-virtual {v3, p1, v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->refreshDeviceCache(Landroid/bluetooth/BluetoothGatt;Z)V

    iget-object v0, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/dfu/DfuBaseService;->close(Landroid/bluetooth/BluetoothGatt;)V

    const-string p1, "Restarting the service"

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const/16 v0, 0x18

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->fillIn(Landroid/content/Intent;I)I

    invoke-virtual {p0, p1, v1}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->restartService(Landroid/content/Intent;Z)V

    return-void
.end method

.method private setImageSize([BII)V
    .locals 2

    and-int/lit16 v0, p2, 0xff

    int-to-byte v0, v0

    aput-byte v0, p1, p3

    add-int/lit8 v0, p3, 0x1

    shr-int/lit8 v1, p2, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 v0, p3, 0x2

    shr-int/lit8 v1, p2, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 p3, p3, 0x3

    shr-int/lit8 p2, p2, 0x18

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    aput-byte p2, p1, p3

    return-void
.end method

.method private setNumberOfPackets([BI)V
    .locals 2

    and-int/lit16 v0, p2, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x1

    aput-byte v0, p1, v1

    shr-int/lit8 p2, p2, 0x8

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    const/4 v0, 0x2

    aput-byte p2, p1, v0

    return-void
.end method

.method private writeImageSize(Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lno/nordicsemi/android/dfu/internal/exception/DeviceDisconnectedException;,
            Lno/nordicsemi/android/dfu/internal/exception/DfuException;,
            Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mReceivedData:[B

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mError:I

    const/4 v1, 0x1

    .line 3
    iput-boolean v1, p0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mImageSizeInProgress:Z

    const/4 v2, 0x4

    .line 4
    new-array v2, v2, [B

    .line 5
    invoke-direct {p0, v2, p2, v0}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->setImageSize([BII)V

    .line 6
    iget-object p2, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Writing to characteristic "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", value (0x): "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->parse([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v1, v3}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    .line 7
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    if-lt p2, v3, :cond_0

    .line 8
    iget-object p2, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "gatt.writeCharacteristic("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", value="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->parse([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", WRITE_TYPE_NO_RESPONSE)"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v0, v3}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    .line 9
    iget-object p2, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mGatt:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {p2, p1, v2, v1}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;[BI)I

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p1, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->setWriteType(I)V

    .line 11
    invoke-virtual {p1, v2}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    .line 12
    iget-object p2, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "gatt.writeCharacteristic("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    .line 13
    iget-object p2, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mGatt:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {p2, p1}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    .line 14
    :goto_0
    :try_start_0
    iget-object p1, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mLock:Ljava/lang/Object;

    monitor-enter p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    :goto_1
    :try_start_1
    iget-boolean p2, p0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mImageSizeInProgress:Z

    if-eqz p2, :cond_1

    iget-boolean p2, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mConnected:Z

    if-eqz p2, :cond_1

    iget p2, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mError:I

    if-nez p2, :cond_1

    iget-boolean p2, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mAborted:Z

    if-eqz p2, :cond_2

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    :goto_2
    iget-boolean p2, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mPaused:Z

    if-eqz p2, :cond_3

    .line 16
    :cond_2
    iget-object p2, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mLock:Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Object;->wait()V

    goto :goto_1

    .line 17
    :cond_3
    monitor-exit p1

    goto :goto_4

    :goto_3
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p2
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p1

    .line 18
    const-string p2, "Sleeping interrupted"

    invoke-virtual {p0, p2, p1}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->loge(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    :goto_4
    iget-boolean p1, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mAborted:Z

    if-nez p1, :cond_6

    .line 20
    iget-boolean p1, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mConnected:Z

    if-eqz p1, :cond_5

    .line 21
    iget p1, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mError:I

    if-nez p1, :cond_4

    return-void

    .line 22
    :cond_4
    new-instance p1, Lno/nordicsemi/android/dfu/internal/exception/DfuException;

    const-string p2, "Unable to write Image Size"

    iget v0, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mError:I

    invoke-direct {p1, p2, v0}, Lno/nordicsemi/android/dfu/internal/exception/DfuException;-><init>(Ljava/lang/String;I)V

    throw p1

    .line 23
    :cond_5
    new-instance p1, Lno/nordicsemi/android/dfu/internal/exception/DeviceDisconnectedException;

    const-string p2, "Unable to write Image Size: device disconnected"

    invoke-direct {p1, p2}, Lno/nordicsemi/android/dfu/internal/exception/DeviceDisconnectedException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 24
    :cond_6
    new-instance p1, Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException;

    invoke-direct {p1}, Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException;-><init>()V

    throw p1
.end method

.method private writeImageSize(Landroid/bluetooth/BluetoothGattCharacteristic;III)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lno/nordicsemi/android/dfu/internal/exception/DeviceDisconnectedException;,
            Lno/nordicsemi/android/dfu/internal/exception/DfuException;,
            Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mReceivedData:[B

    const/4 v0, 0x0

    .line 26
    iput v0, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mError:I

    const/4 v1, 0x1

    .line 27
    iput-boolean v1, p0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mImageSizeInProgress:Z

    const/16 v2, 0xc

    .line 28
    new-array v2, v2, [B

    .line 29
    invoke-direct {p0, v2, p2, v0}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->setImageSize([BII)V

    const/4 p2, 0x4

    .line 30
    invoke-direct {p0, v2, p3, p2}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->setImageSize([BII)V

    const/16 p2, 0x8

    .line 31
    invoke-direct {p0, v2, p4, p2}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->setImageSize([BII)V

    .line 32
    iget-object p2, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Writing to characteristic "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p4, ", value (0x): "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->parse([B)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, v1, p3}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    .line 33
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x21

    if-lt p2, p3, :cond_0

    .line 34
    iget-object p2, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "gatt.writeCharacteristic("

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p4, ", value="

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->parse([B)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", WRITE_TYPE_NO_RESPONSE)"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, v0, p3}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    .line 35
    iget-object p2, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mGatt:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {p2, p1, v2, v1}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;[BI)I

    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p1, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->setWriteType(I)V

    .line 37
    invoke-virtual {p1, v2}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    .line 38
    iget-object p2, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "gatt.writeCharacteristic("

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p4, ")"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, v0, p3}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    .line 39
    iget-object p2, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mGatt:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {p2, p1}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    .line 40
    :goto_0
    :try_start_0
    iget-object p1, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mLock:Ljava/lang/Object;

    monitor-enter p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    :goto_1
    :try_start_1
    iget-boolean p2, p0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mImageSizeInProgress:Z

    if-eqz p2, :cond_1

    iget-boolean p2, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mConnected:Z

    if-eqz p2, :cond_1

    iget p2, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mError:I

    if-nez p2, :cond_1

    iget-boolean p2, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mAborted:Z

    if-eqz p2, :cond_2

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    :goto_2
    iget-boolean p2, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mPaused:Z

    if-eqz p2, :cond_3

    .line 42
    :cond_2
    iget-object p2, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mLock:Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Object;->wait()V

    goto :goto_1

    .line 43
    :cond_3
    monitor-exit p1

    goto :goto_4

    :goto_3
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p2
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p1

    .line 44
    const-string p2, "Sleeping interrupted"

    invoke-virtual {p0, p2, p1}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->loge(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    :goto_4
    iget-boolean p1, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mAborted:Z

    if-nez p1, :cond_6

    .line 46
    iget-boolean p1, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mConnected:Z

    if-eqz p1, :cond_5

    .line 47
    iget p1, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mError:I

    if-nez p1, :cond_4

    return-void

    .line 48
    :cond_4
    new-instance p1, Lno/nordicsemi/android/dfu/internal/exception/DfuException;

    const-string p2, "Unable to write Image Sizes"

    iget p3, p0, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mError:I

    invoke-direct {p1, p2, p3}, Lno/nordicsemi/android/dfu/internal/exception/DfuException;-><init>(Ljava/lang/String;I)V

    throw p1

    .line 49
    :cond_5
    new-instance p1, Lno/nordicsemi/android/dfu/internal/exception/DeviceDisconnectedException;

    const-string p2, "Unable to write Image Sizes: device disconnected"

    invoke-direct {p1, p2}, Lno/nordicsemi/android/dfu/internal/exception/DeviceDisconnectedException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 50
    :cond_6
    new-instance p1, Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException;

    invoke-direct {p1}, Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException;-><init>()V

    throw p1
.end method

.method private writeOpCode(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lno/nordicsemi/android/dfu/internal/exception/DeviceDisconnectedException;,
            Lno/nordicsemi/android/dfu/internal/exception/DfuException;,
            Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException;
        }
    .end annotation

    const/4 v0, 0x0

    aget-byte v1, p2, v0

    const/4 v2, 0x6

    if-eq v1, v2, :cond_0

    const/4 v2, 0x5

    if-ne v1, v2, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    invoke-virtual {p0, p1, p2, v0}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->writeOpCode(Landroid/bluetooth/BluetoothGattCharacteristic;[BZ)V

    return-void
.end method


# virtual methods
.method public getControlPointCharacteristicUUID()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->DFU_CONTROL_POINT_UUID:Ljava/util/UUID;

    return-object v0
.end method

.method public getDfuServiceUUID()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->DFU_SERVICE_UUID:Ljava/util/UUID;

    return-object v0
.end method

.method public getGattCallback()Lno/nordicsemi/android/dfu/BaseCustomDfuImpl$BaseCustomBluetoothCallback;
    .locals 1

    .line 2
    iget-object v0, p0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mBluetoothCallback:Lno/nordicsemi/android/dfu/LegacyDfuImpl$LegacyBluetoothCallback;

    return-object v0
.end method

.method public bridge synthetic getGattCallback()Lno/nordicsemi/android/dfu/DfuCallback$DfuGattCallback;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->getGattCallback()Lno/nordicsemi/android/dfu/BaseCustomDfuImpl$BaseCustomBluetoothCallback;

    move-result-object v0

    return-object v0
.end method

.method public getPacketCharacteristicUUID()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->DFU_PACKET_UUID:Ljava/util/UUID;

    return-object v0
.end method

.method public isClientCompatible(Landroid/content/Intent;Landroid/bluetooth/BluetoothGatt;)Z
    .locals 2

    sget-object p1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->DFU_SERVICE_UUID:Ljava/util/UUID;

    invoke-virtual {p2, p1}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return p2

    :cond_0
    sget-object v0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->DFU_CONTROL_POINT_UUID:Ljava/util/UUID;

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->CLIENT_CHARACTERISTIC_CONFIG:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iput-object v0, p0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mControlPointCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    sget-object v0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->DFU_PACKET_UUID:Ljava/util/UUID;

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object p1

    iput-object p1, p0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mPacketCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return p2
.end method

.method public performDfu(Landroid/content/Intent;)V
    .locals 36
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lno/nordicsemi/android/dfu/internal/exception/DfuException;,
            Lno/nordicsemi/android/dfu/internal/exception/DeviceDisconnectedException;,
            Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v3, " Status = "

    const-string v0, "b)"

    const-string v4, "Starting DFU failed"

    const-string v5, "Reset request sent"

    const-string v6, "Sending Reset command (Op Code = 6)"

    const-string v7, ", Status = "

    const-string v8, "b, "

    const-string v9, ")"

    const-string v10, "Response received (Op Code = "

    const-string v11, "Upload completed in "

    const-string v12, "Transfer of "

    const-string v13, "Packet Receipt Notif Req (Op Code = 8) sent (Value = "

    const-string v14, "Sending the number of packets before notifications (Op Code = 8, Value = "

    const-string v15, "Firmware image size sent ("

    move-object/from16 v16, v11

    const-string v11, "Sending application image size to DFU Packet: "

    move-object/from16 v17, v12

    const-string v12, "b, 0b]"

    move-object/from16 v18, v13

    const-string v13, "Firmware image size sent ["

    move-object/from16 v19, v14

    const-string v14, "Sending image size array to DFU Packet: ["

    move-object/from16 v20, v7

    const-string v7, "DFU Start sent (Op Code = 1, Upload Mode = "

    move-object/from16 v21, v11

    const-string v11, "Resending Start DFU command (Op Code = 1, Upload Mode = "

    move-object/from16 v22, v13

    const-string v13, "Sending image size array to DFU Packet ("

    move-object/from16 v23, v12

    const-string v12, "Sending Start DFU command (Op Code = 1, Upload Mode = "

    move-object/from16 v24, v14

    const-string v14, "Legacy DFU bootloader found"

    invoke-virtual {v1, v14}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logw(Ljava/lang/String;)V

    iget-object v14, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mProgressInfo:Lno/nordicsemi/android/dfu/DfuProgressInfo;

    move-object/from16 v25, v11

    const/4 v11, -0x2

    invoke-virtual {v14, v11}, Lno/nordicsemi/android/dfu/DfuProgressInfo;->setProgress(I)V

    const-string v11, "no.nordicsemi.android.dfu.extra.EXTRA_MTU"

    invoke-virtual {v2, v11}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_0

    const/16 v14, 0x205

    invoke-virtual {v2, v11, v14}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v11

    const-string v14, "Requesting MTU = "

    invoke-static {v11, v14}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1, v14}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    invoke-virtual {v1, v11}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->requestMtu(I)V

    :cond_0
    iget-object v11, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mGatt:Landroid/bluetooth/BluetoothGatt;

    sget-object v14, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->DFU_SERVICE_UUID:Ljava/util/UUID;

    invoke-virtual {v11, v14}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v14

    move-object/from16 v26, v4

    sget-object v4, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->DFU_VERSION_UUID:Ljava/util/UUID;

    invoke-virtual {v14, v4}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v4

    invoke-direct {v1, v4}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->readVersion(Landroid/bluetooth/BluetoothGattCharacteristic;)I

    move-result v4

    const/4 v14, 0x5

    const/16 v2, 0x14

    if-lt v4, v14, :cond_1

    iget-object v14, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mInitPacketStream:Ljava/io/InputStream;

    if-nez v14, :cond_1

    const-string v0, "Init packet not set for the DFU Bootloader version "

    invoke-static {v4, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logw(Ljava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const-string v3, "The Init packet is required by this version DFU Bootloader"

    invoke-virtual {v0, v2, v3}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const/16 v2, 0x100b

    invoke-virtual {v0, v11, v2}, Lno/nordicsemi/android/dfu/DfuBaseService;->terminateConnection(Landroid/bluetooth/BluetoothGatt;I)V

    return-void

    :cond_1
    :try_start_0
    iget-object v2, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mControlPointCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;
    :try_end_0
    .catch Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lno/nordicsemi/android/dfu/internal/exception/UnknownResponseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v14, 0x1

    :try_start_1
    invoke-virtual {v1, v2, v14}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->enableCCCD(Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    iget-object v2, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    move/from16 v28, v14

    const-string v14, "Notifications enabled"

    move/from16 v29, v4

    const/16 v4, 0xa

    invoke-virtual {v2, v4, v14}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    iget v2, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mFileType:I
    :try_end_1
    .catch Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException; {:try_start_1 .. :try_end_1} :catch_10
    .catch Lno/nordicsemi/android/dfu/internal/exception/UnknownResponseException; {:try_start_1 .. :try_end_1} :catch_f
    .catch Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException; {:try_start_1 .. :try_end_1} :catch_0

    and-int/lit8 v4, v2, 0x1

    if-lez v4, :cond_2

    :try_start_2
    iget v4, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mImageSizeInBytes:I

    goto :goto_0

    :catch_0
    move-exception v0

    move-object/from16 v31, v5

    move-object/from16 v32, v6

    move-object v12, v11

    goto/16 :goto_12

    :catch_1
    move-exception v0

    move-object v4, v5

    move-object v3, v6

    move-object v12, v11

    goto/16 :goto_13

    :catch_2
    move-exception v0

    move-object v4, v5

    move-object v3, v6

    goto/16 :goto_15

    :cond_2
    const/4 v4, 0x0

    :goto_0
    and-int/lit8 v14, v2, 0x2

    if-lez v14, :cond_3

    iget v14, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mImageSizeInBytes:I

    goto :goto_1

    :cond_3
    const/4 v14, 0x0

    :goto_1
    and-int/lit8 v30, v2, 0x4

    if-lez v30, :cond_4

    move/from16 v31, v4

    iget v4, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mImageSizeInBytes:I
    :try_end_2
    .catch Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lno/nordicsemi/android/dfu/internal/exception/UnknownResponseException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException; {:try_start_2 .. :try_end_2} :catch_0

    move/from16 v32, v4

    goto :goto_2

    :cond_4
    move/from16 v31, v4

    const/16 v32, 0x0

    :goto_2
    :try_start_3
    iget-object v4, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mFirmwareStream:Ljava/io/InputStream;

    move/from16 v33, v14

    instance-of v14, v4, Lno/nordicsemi/android/dfu/internal/ArchiveInputStream;
    :try_end_3
    .catch Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException; {:try_start_3 .. :try_end_3} :catch_10
    .catch Lno/nordicsemi/android/dfu/internal/exception/UnknownResponseException; {:try_start_3 .. :try_end_3} :catch_f
    .catch Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException; {:try_start_3 .. :try_end_3} :catch_0

    if-eqz v14, :cond_6

    :try_start_4
    check-cast v4, Lno/nordicsemi/android/dfu/internal/ArchiveInputStream;

    invoke-virtual {v4}, Lno/nordicsemi/android/dfu/internal/ArchiveInputStream;->isSecureDfuRequired()Z

    move-result v14

    if-eqz v14, :cond_5

    const-string v0, "Secure DFU is required to upload selected firmware"

    invoke-virtual {v1, v0}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->loge(Ljava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const-string v2, "The device does not support given firmware."

    const/16 v3, 0x14

    invoke-virtual {v0, v3, v2}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    invoke-virtual {v1, v6}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mControlPointCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    sget-object v2, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_RESET:[B

    invoke-direct {v1, v0, v2}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->writeOpCode(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const/16 v4, 0xa

    invoke-virtual {v0, v4, v5}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const/16 v2, 0x1003

    invoke-virtual {v0, v11, v2}, Lno/nordicsemi/android/dfu/DfuBaseService;->terminateConnection(Landroid/bluetooth/BluetoothGatt;I)V

    return-void

    :cond_5
    invoke-virtual {v4}, Lno/nordicsemi/android/dfu/internal/ArchiveInputStream;->softDeviceImageSize()I

    move-result v14

    invoke-virtual {v4}, Lno/nordicsemi/android/dfu/internal/ArchiveInputStream;->bootloaderImageSize()I

    move-result v31

    invoke-virtual {v4}, Lno/nordicsemi/android/dfu/internal/ArchiveInputStream;->applicationImageSize()I

    move-result v4
    :try_end_4
    .catch Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Lno/nordicsemi/android/dfu/internal/exception/UnknownResponseException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException; {:try_start_4 .. :try_end_4} :catch_0

    move/from16 v32, v14

    move v14, v4

    move/from16 v4, v32

    move/from16 v32, v31

    move-object/from16 v31, v5

    move/from16 v5, v32

    :goto_3
    move-object/from16 v32, v6

    goto :goto_4

    :cond_6
    move/from16 v4, v31

    move/from16 v14, v32

    move-object/from16 v31, v5

    move/from16 v5, v33

    goto :goto_3

    :goto_4
    :try_start_5
    sget-object v6, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_START_DFU:[B
    :try_end_5
    .catch Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException; {:try_start_5 .. :try_end_5} :catch_a
    .catch Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Lno/nordicsemi/android/dfu/internal/exception/UnknownResponseException; {:try_start_5 .. :try_end_5} :catch_9

    move-object/from16 v35, v11

    int-to-byte v11, v2

    :try_start_6
    aput-byte v11, v6, v28

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1, v11}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v11, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mControlPointCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-direct {v1, v11, v6}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->writeOpCode(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    iget-object v6, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const/16 v12, 0xa

    invoke-virtual {v6, v12, v11}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v6, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mPacketCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-direct {v1, v6, v4, v5, v14}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->writeImageSize(Landroid/bluetooth/BluetoothGattCharacteristic;III)V

    iget-object v6, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v12, 0xa

    invoke-virtual {v6, v12, v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    invoke-virtual {v1}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->readNotificationResponse()[B

    move-result-object v0

    move/from16 v6, v28

    invoke-direct {v1, v0, v6}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->getStatusCode([BI)I

    move-result v11

    iget-object v12, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-byte v0, v0, v6

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v6, 0xa

    invoke-virtual {v12, v6, v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V
    :try_end_6
    .catch Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException; {:try_start_6 .. :try_end_6} :catch_8
    .catch Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Lno/nordicsemi/android/dfu/internal/exception/UnknownResponseException; {:try_start_6 .. :try_end_6} :catch_7

    const/4 v6, 0x2

    if-ne v11, v6, :cond_7

    move-object/from16 v6, p1

    move-object/from16 v12, v35

    :try_start_7
    invoke-direct {v1, v12, v6}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->resetAndRestart(Landroid/bluetooth/BluetoothGatt;Landroid/content/Intent;)V

    return-void

    :catch_3
    move-exception v0

    :goto_5
    move-object/from16 v4, v31

    move-object/from16 v3, v32

    goto/16 :goto_13

    :catch_4
    move-exception v0

    :goto_6
    move-object/from16 v4, v31

    move-object/from16 v3, v32

    goto/16 :goto_15

    :catch_5
    move-exception v0

    :goto_7
    move-object/from16 v13, v26

    goto :goto_9

    :cond_7
    move-object/from16 v6, p1

    move-object/from16 v12, v35

    const/4 v13, 0x1

    if-ne v11, v13, :cond_8

    goto/16 :goto_a

    :cond_8
    new-instance v0, Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException;
    :try_end_7
    .catch Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Lno/nordicsemi/android/dfu/internal/exception/UnknownResponseException; {:try_start_7 .. :try_end_7} :catch_3

    move-object/from16 v13, v26

    :try_start_8
    invoke-direct {v0, v13, v11}, Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException;-><init>(Ljava/lang/String;I)V

    throw v0
    :try_end_8
    .catch Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException; {:try_start_8 .. :try_end_8} :catch_6
    .catch Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Lno/nordicsemi/android/dfu/internal/exception/UnknownResponseException; {:try_start_8 .. :try_end_8} :catch_3

    :catch_6
    move-exception v0

    goto :goto_9

    :catch_7
    move-exception v0

    move-object/from16 v12, v35

    goto :goto_5

    :catch_8
    move-exception v0

    move-object/from16 v6, p1

    move-object/from16 v13, v26

    move-object/from16 v12, v35

    goto :goto_9

    :catch_9
    move-exception v0

    :goto_8
    move-object v12, v11

    goto :goto_5

    :catch_a
    move-exception v0

    move-object/from16 v6, p1

    move-object v12, v11

    goto :goto_7

    :goto_9
    :try_start_9
    invoke-virtual {v0}, Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException;->getErrorNumber()I

    move-result v11

    const/4 v14, 0x3

    if-ne v11, v14, :cond_c

    if-lez v30, :cond_b

    and-int/lit8 v11, v2, 0x3

    if-lez v11, :cond_b

    const/4 v11, 0x0

    iput-boolean v11, v1, Lno/nordicsemi/android/dfu/BaseCustomDfuImpl;->mRemoteErrorOccurred:Z

    const-string v0, "DFU target does not support (SD/BL)+App update"

    invoke-virtual {v1, v0}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logw(Ljava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const-string v11, "DFU target does not support (SD/BL)+App update"

    const/16 v14, 0xf

    invoke-virtual {v0, v14, v11}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    and-int/lit8 v2, v2, -0x5

    iput v2, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mFileType:I

    sget-object v0, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_START_DFU:[B

    int-to-byte v11, v2

    const/16 v28, 0x1

    aput-byte v11, v0, v28

    iget-object v11, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mProgressInfo:Lno/nordicsemi/android/dfu/DfuProgressInfo;

    const/4 v14, 0x2

    invoke-virtual {v11, v14}, Lno/nordicsemi/android/dfu/DfuProgressInfo;->setTotalPart(I)Lno/nordicsemi/android/dfu/DfuProgressInfo;

    iget-object v11, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mFirmwareStream:Ljava/io/InputStream;

    check-cast v11, Lno/nordicsemi/android/dfu/internal/ArchiveInputStream;

    invoke-virtual {v11, v2}, Lno/nordicsemi/android/dfu/internal/ArchiveInputStream;->setContentType(I)I

    iget-object v11, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const-string v14, "Sending only SD/BL"
    :try_end_9
    .catch Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException; {:try_start_9 .. :try_end_9} :catch_c
    .catch Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException; {:try_start_9 .. :try_end_9} :catch_4
    .catch Lno/nordicsemi/android/dfu/internal/exception/UnknownResponseException; {:try_start_9 .. :try_end_9} :catch_3

    move-object/from16 v26, v15

    const/4 v15, 0x1

    :try_start_a
    invoke-virtual {v11, v15, v14}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    new-instance v11, Ljava/lang/StringBuilder;

    move-object/from16 v14, v25

    invoke-direct {v11, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1, v11}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v11, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mControlPointCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-direct {v1, v11, v0}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->writeOpCode(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v11, 0xa

    invoke-virtual {v0, v11, v7}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v7, v24

    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v7, v23

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mPacketCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    const/4 v11, 0x0

    invoke-direct {v1, v0, v4, v5, v11}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->writeImageSize(Landroid/bluetooth/BluetoothGattCharacteristic;III)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance v11, Ljava/lang/StringBuilder;

    move-object/from16 v14, v22

    invoke-direct {v11, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v11, 0xa

    invoke-virtual {v0, v11, v4}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    invoke-virtual {v1}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->readNotificationResponse()[B

    move-result-object v0

    const/4 v15, 0x1

    invoke-direct {v1, v0, v15}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->getStatusCode([BI)I

    move-result v4

    iget-object v5, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-byte v0, v0, v15

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v11, 0xa

    invoke-virtual {v5, v11, v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    const/4 v14, 0x2

    if-ne v4, v14, :cond_9

    invoke-direct {v1, v12, v6}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->resetAndRestart(Landroid/bluetooth/BluetoothGatt;Landroid/content/Intent;)V

    goto/16 :goto_14

    :catch_b
    move-exception v0

    goto :goto_b

    :cond_9
    const/4 v15, 0x1

    if-ne v4, v15, :cond_a

    :goto_a
    move-object/from16 v5, v20

    const/4 v0, 0x1

    goto/16 :goto_c

    :cond_a
    new-instance v0, Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException;

    invoke-direct {v0, v13, v4}, Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException;-><init>(Ljava/lang/String;I)V

    throw v0

    :catch_c
    move-exception v0

    move-object/from16 v26, v15

    goto :goto_b

    :cond_b
    move-object/from16 v26, v15

    throw v0

    :cond_c
    move-object/from16 v26, v15

    throw v0
    :try_end_a
    .catch Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException; {:try_start_a .. :try_end_a} :catch_b
    .catch Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException; {:try_start_a .. :try_end_a} :catch_4
    .catch Lno/nordicsemi/android/dfu/internal/exception/UnknownResponseException; {:try_start_a .. :try_end_a} :catch_3

    :goto_b
    :try_start_b
    invoke-virtual {v0}, Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException;->getErrorNumber()I

    move-result v3

    const/4 v14, 0x3

    if-ne v3, v14, :cond_19

    const/4 v3, 0x4

    if-ne v2, v3, :cond_18

    const/4 v11, 0x0

    iput-boolean v11, v1, Lno/nordicsemi/android/dfu/BaseCustomDfuImpl;->mRemoteErrorOccurred:Z

    const-string v0, "DFU target does not support DFU v.2"

    invoke-virtual {v1, v0}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logw(Ljava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const-string v2, "DFU target does not support DFU v.2"

    const/16 v3, 0xf

    invoke-virtual {v0, v3, v2}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const-string v2, "Switching to DFU v.1"

    const/4 v15, 0x1

    invoke-virtual {v0, v15, v2}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    const-string v0, "Resending Start DFU command (Op Code = 1)"

    invoke-virtual {v1, v0}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mControlPointCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    sget-object v2, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_START_DFU_V1:[B

    invoke-direct {v1, v0, v2}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->writeOpCode(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const-string v2, "DFU Start sent (Op Code = 1)"

    const/16 v11, 0xa

    invoke-virtual {v0, v11, v2}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v2, v21

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mImageSizeInBytes:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " bytes"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mPacketCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget v2, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mImageSizeInBytes:I

    invoke-direct {v1, v0, v2}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->writeImageSize(Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance v2, Ljava/lang/StringBuilder;

    move-object/from16 v3, v26

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mImageSizeInBytes:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " bytes)"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v11, 0xa

    invoke-virtual {v0, v11, v2}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    invoke-virtual {v1}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->readNotificationResponse()[B

    move-result-object v0

    const/4 v15, 0x1

    invoke-direct {v1, v0, v15}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->getStatusCode([BI)I

    move-result v2

    iget-object v3, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-byte v0, v0, v15

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v5, v20

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v11, 0xa

    invoke-virtual {v3, v11, v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    const/4 v14, 0x2

    if-ne v2, v14, :cond_d

    invoke-direct {v1, v12, v6}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->resetAndRestart(Landroid/bluetooth/BluetoothGatt;Landroid/content/Intent;)V

    goto/16 :goto_14

    :catch_d
    move-exception v0

    goto/16 :goto_12

    :cond_d
    const/4 v15, 0x1

    if-ne v2, v15, :cond_17

    const/4 v0, 0x0

    :goto_c
    iget-object v2, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mInitPacketStream:Ljava/io/InputStream;

    if-eqz v2, :cond_10

    iget-object v2, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const-string v3, "Writing Initialize DFU Parameters..."

    const/16 v11, 0xa

    invoke-virtual {v2, v11, v3}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V
    :try_end_b
    .catch Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException; {:try_start_b .. :try_end_b} :catch_4
    .catch Lno/nordicsemi/android/dfu/internal/exception/UnknownResponseException; {:try_start_b .. :try_end_b} :catch_3
    .catch Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException; {:try_start_b .. :try_end_b} :catch_d

    const-string v2, "Sending "

    if-eqz v0, :cond_e

    :try_start_c
    const-string v3, "Sending the Initialize DFU Parameters START (Op Code = 2, Value = 0)"

    invoke-virtual {v1, v3}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v3, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mControlPointCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    sget-object v4, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_INIT_DFU_PARAMS_START:[B

    invoke-direct {v1, v3, v4}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->writeOpCode(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mInitPacketSizeInBytes:I

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " bytes of init packet"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v2, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mPacketCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lno/nordicsemi/android/dfu/BaseCustomDfuImpl;->writeInitData(Landroid/bluetooth/BluetoothGattCharacteristic;Ljava/util/zip/CRC32;)V

    const-string v2, "Sending the Initialize DFU Parameters COMPLETE (Op Code = 2, Value = 1)"

    invoke-virtual {v1, v2}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v2, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mControlPointCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    sget-object v3, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_INIT_DFU_PARAMS_COMPLETE:[B

    invoke-direct {v1, v2, v3}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->writeOpCode(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    iget-object v2, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const-string v3, "Initialize DFU Parameters completed"

    const/16 v11, 0xa

    invoke-virtual {v2, v11, v3}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    goto :goto_d

    :cond_e
    const-string v3, "Sending the Initialize DFU Parameters (Op Code = 2)"

    invoke-virtual {v1, v3}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v3, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mControlPointCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    sget-object v4, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_INIT_DFU_PARAMS:[B

    invoke-direct {v1, v3, v4}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->writeOpCode(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mInitPacketSizeInBytes:I

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " bytes of init packet"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v2, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mPacketCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lno/nordicsemi/android/dfu/BaseCustomDfuImpl;->writeInitData(Landroid/bluetooth/BluetoothGattCharacteristic;Ljava/util/zip/CRC32;)V

    :goto_d
    invoke-virtual {v1}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->readNotificationResponse()[B

    move-result-object v2

    const/4 v14, 0x2

    invoke-direct {v1, v2, v14}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->getStatusCode([BI)I

    move-result v3

    iget-object v4, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v28, 0x1

    aget-byte v2, v2, v28

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v11, 0xa

    invoke-virtual {v4, v11, v2}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    const/4 v15, 0x1

    if-ne v3, v15, :cond_f

    goto :goto_e

    :cond_f
    new-instance v0, Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException;

    const-string v2, "Device returned error after sending init packet"

    invoke-direct {v0, v2, v3}, Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_10
    :goto_e
    if-nez v0, :cond_12

    iget v0, v1, Lno/nordicsemi/android/dfu/BaseCustomDfuImpl;->mPacketsBeforeNotification:I

    if-lez v0, :cond_11

    const/16 v11, 0xa

    if-gt v0, v11, :cond_11

    goto :goto_f

    :cond_11
    const/16 v0, 0xa

    goto :goto_10

    :cond_12
    :goto_f
    iget v0, v1, Lno/nordicsemi/android/dfu/BaseCustomDfuImpl;->mPacketsBeforeNotification:I

    :goto_10
    if-lez v0, :cond_13

    iput v0, v1, Lno/nordicsemi/android/dfu/BaseCustomDfuImpl;->mPacketsBeforeNotification:I

    new-instance v2, Ljava/lang/StringBuilder;

    move-object/from16 v3, v19

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    sget-object v2, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_PACKET_RECEIPT_NOTIF_REQ:[B

    invoke-direct {v1, v2, v0}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->setNumberOfPackets([BI)V

    iget-object v3, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mControlPointCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-direct {v1, v3, v2}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->writeOpCode(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    iget-object v2, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance v3, Ljava/lang/StringBuilder;

    move-object/from16 v4, v18

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v11, 0xa

    invoke-virtual {v2, v11, v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    :cond_13
    const-string v0, "Sending Receive Firmware Image request (Op Code = 3)"

    invoke-virtual {v1, v0}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mControlPointCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    sget-object v2, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_RECEIVE_FIRMWARE_IMAGE:[B

    invoke-direct {v1, v0, v2}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->writeOpCode(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const-string v2, "Receive Firmware Image request sent"

    const/16 v11, 0xa

    invoke-virtual {v0, v11, v2}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mProgressInfo:Lno/nordicsemi/android/dfu/DfuProgressInfo;

    const/4 v11, 0x0

    invoke-virtual {v0, v11}, Lno/nordicsemi/android/dfu/DfuProgressInfo;->setBytesSent(I)V
    :try_end_c
    .catch Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException; {:try_start_c .. :try_end_c} :catch_4
    .catch Lno/nordicsemi/android/dfu/internal/exception/UnknownResponseException; {:try_start_c .. :try_end_c} :catch_3
    .catch Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException; {:try_start_c .. :try_end_c} :catch_d

    :try_start_d
    const-string v0, "Uploading firmware..."

    invoke-virtual {v1, v0}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const-string v4, "Uploading firmware..."

    const/16 v11, 0xa

    invoke-virtual {v0, v11, v4}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mPacketCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {v1, v0}, Lno/nordicsemi/android/dfu/BaseCustomDfuImpl;->uploadFirmwareImage(Landroid/bluetooth/BluetoothGattCharacteristic;)V
    :try_end_d
    .catch Lno/nordicsemi/android/dfu/internal/exception/DeviceDisconnectedException; {:try_start_d .. :try_end_d} :catch_e
    .catch Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException; {:try_start_d .. :try_end_d} :catch_4
    .catch Lno/nordicsemi/android/dfu/internal/exception/UnknownResponseException; {:try_start_d .. :try_end_d} :catch_3
    .catch Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException; {:try_start_d .. :try_end_d} :catch_d

    :try_start_e
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v7

    invoke-virtual {v1}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->readNotificationResponse()[B

    move-result-object v0

    const/4 v14, 0x3

    invoke-direct {v1, v0, v14}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->getStatusCode([BI)I

    move-result v4

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v27, 0x0

    aget-byte v13, v0, v27

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v13, ", Req Op Code = "

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v28, 0x1

    aget-byte v13, v0, v28

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v34, 0x2

    aget-byte v13, v0, v34

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1, v11}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v11, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v28, 0x1

    aget-byte v0, v0, v28

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v13, 0xa

    invoke-virtual {v11, v13, v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    const/4 v15, 0x1

    if-ne v4, v15, :cond_16

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v4, v17

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mProgressInfo:Lno/nordicsemi/android/dfu/DfuProgressInfo;

    invoke-virtual {v4}, Lno/nordicsemi/android/dfu/DfuProgressInfo;->getBytesSent()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " bytes has taken "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-long/2addr v7, v2

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " ms"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance v2, Ljava/lang/StringBuilder;

    move-object/from16 v3, v16

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " ms"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v11, 0xa

    invoke-virtual {v0, v11, v2}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    const-string v0, "Sending Validate request (Op Code = 4)"

    invoke-virtual {v1, v0}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mControlPointCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    sget-object v2, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_VALIDATE:[B

    invoke-direct {v1, v0, v2}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->writeOpCode(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const-string v2, "Validate request sent"

    const/16 v11, 0xa

    invoke-virtual {v0, v11, v2}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    invoke-virtual {v1}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->readNotificationResponse()[B

    move-result-object v0

    const/4 v3, 0x4

    invoke-direct {v1, v0, v3}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->getStatusCode([BI)I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v27, 0x0

    aget-byte v4, v0, v27

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", Req Op Code = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v28, 0x1

    aget-byte v4, v0, v28

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v34, 0x2

    aget-byte v4, v0, v34

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v3, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v28, 0x1

    aget-byte v0, v0, v28

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v11, 0xa

    invoke-virtual {v3, v11, v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    const/4 v15, 0x1

    if-ne v2, v15, :cond_15

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mProgressInfo:Lno/nordicsemi/android/dfu/DfuProgressInfo;

    const/4 v2, -0x5

    invoke-virtual {v0, v2}, Lno/nordicsemi/android/dfu/DfuProgressInfo;->setProgress(I)V

    const-string v0, "Sending Activate and Reset request (Op Code = 5)"

    invoke-virtual {v1, v0}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mControlPointCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    sget-object v2, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_ACTIVATE_AND_RESET:[B

    invoke-direct {v1, v0, v2}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->writeOpCode(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const-string v2, "Activate and Reset request sent"

    const/16 v11, 0xa

    invoke-virtual {v0, v11, v2}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-virtual {v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->waitUntilDisconnected()V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const-string v2, "Disconnected by the remote device"

    const/4 v3, 0x5

    invoke-virtual {v0, v3, v2}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    move/from16 v2, v29

    if-ne v2, v3, :cond_14

    move v14, v15

    goto :goto_11

    :cond_14
    const/4 v14, 0x0

    :goto_11
    invoke-virtual {v1, v6, v14}, Lno/nordicsemi/android/dfu/BaseCustomDfuImpl;->finalize(Landroid/content/Intent;Z)V

    goto/16 :goto_14

    :cond_15
    new-instance v0, Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException;

    const-string v3, "Device returned validation error"

    invoke-direct {v0, v3, v2}, Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_16
    new-instance v0, Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException;

    const-string v2, "Device returned error after sending file"

    invoke-direct {v0, v2, v4}, Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException;-><init>(Ljava/lang/String;I)V

    throw v0

    :catch_e
    move-exception v0

    const-string v2, "Disconnected while sending data"

    invoke-virtual {v1, v2}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->loge(Ljava/lang/String;)V

    throw v0

    :cond_17
    new-instance v0, Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException;

    invoke-direct {v0, v13, v2}, Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_18
    throw v0

    :cond_19
    throw v0
    :try_end_e
    .catch Lno/nordicsemi/android/dfu/internal/exception/UploadAbortedException; {:try_start_e .. :try_end_e} :catch_4
    .catch Lno/nordicsemi/android/dfu/internal/exception/UnknownResponseException; {:try_start_e .. :try_end_e} :catch_3
    .catch Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException; {:try_start_e .. :try_end_e} :catch_d

    :catch_f
    move-exception v0

    move-object/from16 v31, v5

    move-object/from16 v32, v6

    goto/16 :goto_8

    :catch_10
    move-exception v0

    move-object/from16 v31, v5

    move-object/from16 v32, v6

    goto/16 :goto_6

    :goto_12
    invoke-virtual {v0}, Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException;->getErrorNumber()I

    move-result v2

    or-int/lit16 v3, v2, 0x100

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lno/nordicsemi/android/dfu/internal/exception/RemoteDfuException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Lrg/j;->j(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->loge(Ljava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v3}, Lrg/j;->j(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Remote DFU error: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x14

    invoke-virtual {v0, v4, v3}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    move-object/from16 v3, v32

    invoke-virtual {v1, v3}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mControlPointCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    sget-object v3, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_RESET:[B

    invoke-direct {v1, v0, v3}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->writeOpCode(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    move-object/from16 v4, v31

    const/16 v11, 0xa

    invoke-virtual {v0, v11, v4}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    or-int/lit16 v2, v2, 0x2100

    invoke-virtual {v0, v12, v2}, Lno/nordicsemi/android/dfu/DfuBaseService;->terminateConnection(Landroid/bluetooth/BluetoothGatt;I)V

    goto :goto_14

    :goto_13
    invoke-virtual {v0}, Lno/nordicsemi/android/dfu/internal/exception/UnknownResponseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->loge(Ljava/lang/String;)V

    iget-object v2, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    invoke-virtual {v0}, Lno/nordicsemi/android/dfu/internal/exception/UnknownResponseException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/16 v5, 0x14

    invoke-virtual {v2, v5, v0}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    invoke-virtual {v1, v3}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mControlPointCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    sget-object v2, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_RESET:[B

    invoke-direct {v1, v0, v2}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->writeOpCode(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const/16 v11, 0xa

    invoke-virtual {v0, v11, v4}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    iget-object v0, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const/16 v2, 0x1008

    invoke-virtual {v0, v12, v2}, Lno/nordicsemi/android/dfu/DfuBaseService;->terminateConnection(Landroid/bluetooth/BluetoothGatt;I)V

    :goto_14
    return-void

    :goto_15
    invoke-virtual {v1, v3}, Lno/nordicsemi/android/dfu/BaseDfuImpl;->logi(Ljava/lang/String;)V

    const/4 v11, 0x0

    iput-boolean v11, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mAborted:Z

    iget-object v2, v1, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->mControlPointCharacteristic:Landroid/bluetooth/BluetoothGattCharacteristic;

    sget-object v3, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->OP_CODE_RESET:[B

    invoke-direct {v1, v2, v3}, Lno/nordicsemi/android/dfu/LegacyDfuImpl;->writeOpCode(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    iget-object v2, v1, Lno/nordicsemi/android/dfu/BaseDfuImpl;->mService:Lno/nordicsemi/android/dfu/DfuBaseService;

    const/16 v11, 0xa

    invoke-virtual {v2, v11, v4}, Lno/nordicsemi/android/dfu/DfuBaseService;->sendLogBroadcast(ILjava/lang/String;)V

    throw v0
.end method
