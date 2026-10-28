.class public final synthetic Lno/nordicsemi/android/ble/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lno/nordicsemi/android/ble/k0;

.field public final synthetic y:Landroid/bluetooth/BluetoothDevice;


# direct methods
.method public synthetic constructor <init>(Lno/nordicsemi/android/ble/k0;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    iput p3, p0, Lno/nordicsemi/android/ble/i0;->w:I

    iput-object p1, p0, Lno/nordicsemi/android/ble/i0;->x:Lno/nordicsemi/android/ble/k0;

    iput-object p2, p0, Lno/nordicsemi/android/ble/i0;->y:Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Lno/nordicsemi/android/ble/i0;->w:I

    const-string v1, "k0"

    iget-object v2, p0, Lno/nordicsemi/android/ble/i0;->y:Landroid/bluetooth/BluetoothDevice;

    iget-object v3, p0, Lno/nordicsemi/android/ble/i0;->x:Lno/nordicsemi/android/ble/k0;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v3, Lno/nordicsemi/android/ble/k0;->f:Lmd3/a;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0, v2}, Lmd3/a;->a(Landroid/bluetooth/BluetoothDevice;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v2, "Exception in Before callback"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    iget-object v0, v3, Lno/nordicsemi/android/ble/k0;->g:Lmd3/e;

    if-eqz v0, :cond_1

    :try_start_1
    invoke-interface {v0, v2}, Lmd3/e;->d(Landroid/bluetooth/BluetoothDevice;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    const-string v2, "Exception in Success callback"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
