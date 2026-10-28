.class public final synthetic Lno/nordicsemi/android/ble/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:Lno/nordicsemi/android/ble/g;

.field public final synthetic x:Lqd3/a;


# direct methods
.method public synthetic constructor <init>(Lno/nordicsemi/android/ble/g;Lqd3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/nordicsemi/android/ble/i;->w:Lno/nordicsemi/android/ble/g;

    iput-object p2, p0, Lno/nordicsemi/android/ble/i;->x:Lqd3/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lno/nordicsemi/android/ble/i;->w:Lno/nordicsemi/android/ble/g;

    iget v1, v0, Lno/nordicsemi/android/ble/g;->a:I

    iget-object v2, p0, Lno/nordicsemi/android/ble/i;->x:Lqd3/a;

    iget-object v0, v0, Lno/nordicsemi/android/ble/g;->b:Ljava/lang/Object;

    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    packed-switch v1, :pswitch_data_0

    invoke-interface {v2, v0}, Lqd3/a;->o(Landroid/bluetooth/BluetoothDevice;)V

    goto :goto_0

    :pswitch_0
    invoke-interface {v2, v0}, Lqd3/a;->n(Landroid/bluetooth/BluetoothDevice;)V

    goto :goto_0

    :pswitch_1
    invoke-interface {v2, v0}, Lqd3/a;->m(Landroid/bluetooth/BluetoothDevice;)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
