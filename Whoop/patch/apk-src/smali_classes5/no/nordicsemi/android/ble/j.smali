.class public final synthetic Lno/nordicsemi/android/ble/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lno/nordicsemi/android/ble/j;->w:I

    iput-object p2, p0, Lno/nordicsemi/android/ble/j;->x:Ljava/lang/Object;

    iput-object p3, p0, Lno/nordicsemi/android/ble/j;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Lno/nordicsemi/android/ble/j;->w:I

    iget-object v1, p0, Lno/nordicsemi/android/ble/j;->y:Ljava/lang/Object;

    iget-object v2, p0, Lno/nordicsemi/android/ble/j;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lno/nordicsemi/android/ble/q0;

    check-cast v1, Landroid/bluetooth/BluetoothDevice;

    iget-object v0, v2, Lno/nordicsemi/android/ble/n0;->q:Ljava/lang/Object;

    if-eqz v0, :cond_0

    :try_start_0
    check-cast v0, Lpd3/a;

    new-instance v3, Lnd3/a;

    iget-object v2, v2, Lno/nordicsemi/android/ble/q0;->r:[B

    invoke-direct {v3, v2}, Lnd3/a;-><init>([B)V

    invoke-virtual {v0, v1, v3}, Lpd3/a;->a(Landroid/bluetooth/BluetoothDevice;Lnd3/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v1, "k0"

    const-string v2, "Exception in Value callback"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    check-cast v2, Lno/nordicsemi/android/ble/m0;

    check-cast v1, Landroid/bluetooth/BluetoothDevice;

    const/4 v0, 0x0

    iput-object v0, v2, Lno/nordicsemi/android/ble/m0;->n:Lno/nordicsemi/android/ble/j;

    iget-boolean v0, v2, Lno/nordicsemi/android/ble/k0;->l:Z

    if-nez v0, :cond_1

    iget-object v0, v2, Lno/nordicsemi/android/ble/k0;->a:Ljc/x;

    invoke-virtual {v0, v1, v2}, Ljc/x;->e0(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/m0;)V

    :cond_1
    return-void

    :pswitch_1
    check-cast v2, Lno/nordicsemi/android/ble/a0;

    check-cast v1, Lqd3/b;

    invoke-interface {v2, v1}, Lno/nordicsemi/android/ble/a0;->a(Lqd3/b;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
