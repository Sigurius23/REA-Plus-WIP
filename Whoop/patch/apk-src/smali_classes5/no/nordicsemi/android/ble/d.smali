.class public final synthetic Lno/nordicsemi/android/ble/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/ble/a0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/bluetooth/BluetoothDevice;


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    iput p2, p0, Lno/nordicsemi/android/ble/d;->a:I

    iput-object p1, p0, Lno/nordicsemi/android/ble/d;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lqd3/b;)V
    .locals 1

    iget v0, p0, Lno/nordicsemi/android/ble/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lno/nordicsemi/android/ble/d;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-interface {p1, v0}, Lqd3/b;->c(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/d;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-interface {p1, v0}, Lqd3/b;->t(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lno/nordicsemi/android/ble/d;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-interface {p1, v0}, Lqd3/b;->t(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
