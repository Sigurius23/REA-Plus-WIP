.class public final synthetic Lno/nordicsemi/android/ble/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/ble/b0;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lno/nordicsemi/android/ble/u;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lno/nordicsemi/android/ble/u;->a:I

    const-string v1, "gatt.discoverServices()"

    packed-switch v0, :pswitch_data_0

    sget v0, Lno/nordicsemi/android/ble/l;->c:I

    const-string v0, "Device bonded"

    return-object v0

    :pswitch_0
    sget v0, Lno/nordicsemi/android/ble/l;->c:I

    const-string v0, "Bond information removed"

    return-object v0

    :pswitch_1
    sget v0, Lno/nordicsemi/android/ble/l;->c:I

    const-string v0, "Bonding failed"

    return-object v0

    :pswitch_2
    sget v0, Lno/nordicsemi/android/ble/l;->c:I

    return-object v1

    :pswitch_3
    sget v0, Lno/nordicsemi/android/ble/l;->c:I

    const-string v0, "Discovering services..."

    return-object v0

    :pswitch_4
    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    const-string v0, "Disconnected"

    return-object v0

    :pswitch_5
    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    const-string v0, "Reliable Write aborted"

    return-object v0

    :pswitch_6
    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    const-string v0, "Reliable Write executed"

    return-object v0

    :pswitch_7
    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    return-object v1

    :pswitch_8
    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    const-string v0, "Discovering Services..."

    return-object v0

    :pswitch_9
    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    const-string v0, "Service changed, invalidating services"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
