.class public final synthetic Lno/nordicsemi/android/ble/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/ble/b0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lno/nordicsemi/android/ble/s;->a:I

    iput p1, p0, Lno/nordicsemi/android/ble/s;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lno/nordicsemi/android/ble/l;I)V
    .locals 0

    .line 2
    const/4 p1, 0x7

    iput p1, p0, Lno/nordicsemi/android/ble/s;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lno/nordicsemi/android/ble/s;->b:I

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lno/nordicsemi/android/ble/s;->a:I

    const-string v1, "Authentication required ("

    const-string v2, "UNKNOWN ("

    const-string v3, ")"

    iget v4, p0, Lno/nordicsemi/android/ble/s;->b:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[Broadcast] Action received: android.bluetooth.device.action.BOND_STATE_CHANGED, bond state changed to: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lrd3/a;->a:[C

    packed-switch v4, :pswitch_data_1

    invoke-static {v4, v2, v3}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :pswitch_0
    const-string v1, "BOND_BONDED"

    goto :goto_0

    :pswitch_1
    const-string v1, "BOND_BONDING"

    goto :goto_0

    :pswitch_2
    const-string v1, "BOND_NONE"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[Broadcast] Action received: android.bluetooth.adapter.action.STATE_CHANGED, state changed to "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    packed-switch v4, :pswitch_data_2

    invoke-static {v4, v2, v3}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :pswitch_4
    const-string v1, "TURNING OFF"

    goto :goto_1

    :pswitch_5
    const-string v1, "ON"

    goto :goto_1

    :pswitch_6
    const-string v1, "TURNING ON"

    goto :goto_1

    :pswitch_7
    const-string v1, "OFF"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_8
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Error (0x"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x22

    if-eq v4, v1, :cond_5

    const/16 v1, 0x29

    if-eq v4, v1, :cond_4

    const/16 v1, 0x93

    if-eq v4, v1, :cond_3

    const/16 v1, 0x101

    if-eq v4, v1, :cond_2

    const/16 v1, 0x3a

    if-eq v4, v1, :cond_1

    const/16 v1, 0x3b

    if-eq v4, v1, :cond_0

    packed-switch v4, :pswitch_data_3

    packed-switch v4, :pswitch_data_4

    packed-switch v4, :pswitch_data_5

    invoke-static {v4, v2, v3}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_2

    :pswitch_9
    const-string v1, "GATT VALUE OUT OF RANGE"

    goto/16 :goto_2

    :pswitch_a
    const-string v1, "GATT PROCEDURE IN PROGRESS"

    goto/16 :goto_2

    :pswitch_b
    const-string v1, "GATT CCCD CFG ERROR"

    goto/16 :goto_2

    :pswitch_c
    const-string v1, "GATT CONGESTED"

    goto/16 :goto_2

    :pswitch_d
    const-string v1, "GATT NOT ENCRYPTED"

    goto/16 :goto_2

    :pswitch_e
    const-string v1, "GATT ENCRYPTED NO MITM"

    goto/16 :goto_2

    :pswitch_f
    const-string v1, "GATT SERVICE STARTED"

    goto/16 :goto_2

    :pswitch_10
    const-string v1, "GATT INVALID CFG"

    goto/16 :goto_2

    :pswitch_11
    const-string v1, "GATT MORE"

    goto/16 :goto_2

    :pswitch_12
    const-string v1, "GATT AUTH FAIL"

    goto/16 :goto_2

    :pswitch_13
    const-string v1, "GATT PENDING"

    goto/16 :goto_2

    :pswitch_14
    const-string v1, "GATT ILLEGAL PARAMETER"

    goto/16 :goto_2

    :pswitch_15
    const-string v1, "GATT CMD STARTED"

    goto/16 :goto_2

    :pswitch_16
    const-string v1, "GATT ERROR"

    goto/16 :goto_2

    :pswitch_17
    const-string v1, "GATT BUSY"

    goto/16 :goto_2

    :pswitch_18
    const-string v1, "GATT DB FULL"

    goto/16 :goto_2

    :pswitch_19
    const-string v1, "GATT WRONG STATE"

    goto :goto_2

    :pswitch_1a
    const-string v1, "GATT INTERNAL ERROR"

    goto :goto_2

    :pswitch_1b
    const-string v1, "GATT NO RESOURCES"

    goto :goto_2

    :pswitch_1c
    const-string v1, "GATT INSUF RESOURCE"

    goto :goto_2

    :pswitch_1d
    const-string v1, "GATT UNSUPPORT GRP TYPE"

    goto :goto_2

    :pswitch_1e
    const-string v1, "GATT INSUF ENCRYPTION"

    goto :goto_2

    :pswitch_1f
    const-string v1, "GATT ERR UNLIKELY"

    goto :goto_2

    :pswitch_20
    const-string v1, "GATT INVALID ATTR LEN"

    goto :goto_2

    :pswitch_21
    const-string v1, "GATT INSUF KEY SIZE"

    goto :goto_2

    :pswitch_22
    const-string v1, "GATT NOT LONG"

    goto :goto_2

    :pswitch_23
    const-string v1, "GATT NOT FOUND"

    goto :goto_2

    :pswitch_24
    const-string v1, "GATT PREPARE Q FULL"

    goto :goto_2

    :pswitch_25
    const-string v1, "GATT INSUF AUTHORIZATION"

    goto :goto_2

    :pswitch_26
    const-string v1, "GATT INVALID OFFSET"

    goto :goto_2

    :pswitch_27
    const-string v1, "GATT REQ NOT SUPPORTED"

    goto :goto_2

    :pswitch_28
    const-string v1, "GATT INSUF AUTHENTICATION"

    goto :goto_2

    :pswitch_29
    const-string v1, "GATT INVALID PDU"

    goto :goto_2

    :pswitch_2a
    const-string v1, "GATT WRITE NOT PERMIT"

    goto :goto_2

    :pswitch_2b
    const-string v1, "GATT READ NOT PERMIT"

    goto :goto_2

    :pswitch_2c
    const-string v1, "GATT INVALID HANDLE"

    goto :goto_2

    :cond_0
    const-string v1, "GATT UNACCEPT CONN INTERVAL"

    goto :goto_2

    :cond_1
    const-string v1, "GATT CONTROLLER BUSY"

    goto :goto_2

    :cond_2
    const-string v1, "TOO MANY OPEN CONNECTIONS"

    goto :goto_2

    :cond_3
    const-string v1, "GATT TIMEOUT"

    goto :goto_2

    :cond_4
    const-string v1, "GATT PAIRING WITH UNIT KEY NOT SUPPORTED"

    goto :goto_2

    :cond_5
    const-string v1, "GATT CONN LMP TIMEOUT"

    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2d
    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    const-string v0, "PHY updated failed with status "

    invoke-static {v4, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2e
    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    invoke-static {v4, v1, v3}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2f
    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    invoke-static {v4, v1, v3}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_30
    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    const-string v0, "PHY read failed with status "

    invoke-static {v4, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_31
    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    const-string v0, "Reading remote RSSI failed with status "

    invoke-static {v4, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_32
    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    const-string v0, "Remote RSSI received: "

    const-string v1, " dBm"

    invoke-static {v4, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_8
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xa
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0xa
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x80
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0xfd
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method
