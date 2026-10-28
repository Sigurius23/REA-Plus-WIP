.class public Lcom/whoop/service/OnBluetoothConnect;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field private final a:Ltr2/n;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    const-string v0, "BluetoothReceiver"

    invoke-static {v0}, Ltr2/n;->d(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/service/OnBluetoothConnect;->a:Ltr2/n;

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    const-string p1, "android.bluetooth.device.extra.DEVICE"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v0, "null"

    move-object v1, v0

    :goto_0
    const-class v2, Lc92/g;

    const/4 v3, 0x0

    invoke-static {v2, v3, v3}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc92/g;

    const-string v4, "android.bluetooth.device.action.ACL_CONNECTED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    iget-object p2, p0, Lcom/whoop/service/OnBluetoothConnect;->a:Ltr2/n;

    const-string v4, "("

    const-string v6, ") PowerSaver="

    const-string v7, "Bluetooth ACL device connected: "

    invoke-static {v7, v0, v4, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-class v1, Lx82/c;

    invoke-static {v1, v3, v3}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx82/c;

    invoke-virtual {v1}, Lx82/c;->b()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v5, [Lqr2/a$a;

    invoke-interface {p2, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {v2, p1}, Lc92/g;->c0(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_1
    const-string v3, "android.bluetooth.device.action.ACL_DISCONNECTED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2, p1}, Lc92/g;->d0(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_2
    const-string v3, "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    const-string v3, "android.bluetooth.adapter.extra.CONNECTION_STATE"

    const/4 v4, -0x1

    invoke-virtual {p2, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    if-eqz p2, :cond_6

    const/4 v3, 0x1

    if-eq p2, v3, :cond_5

    const/4 v3, 0x2

    if-eq p2, v3, :cond_4

    const/4 p1, 0x3

    if-eq p2, p1, :cond_3

    const-string p1, "unknown"

    goto :goto_1

    :cond_3
    const-string p1, "disconnecting"

    goto :goto_1

    :cond_4
    invoke-virtual {v2, p1}, Lc92/g;->c0(Landroid/bluetooth/BluetoothDevice;)V

    const-string p1, "connected"

    goto :goto_1

    :cond_5
    invoke-virtual {v2, p1}, Lc92/g;->d0(Landroid/bluetooth/BluetoothDevice;)V

    const-string p1, "connecting"

    goto :goto_1

    :cond_6
    const-string p1, "disconnected"

    :goto_1
    const-string p2, " for device: "

    const-string v2, " ("

    const-string v3, "Bluetooth Connection Change - State: "

    invoke-static {v3, p1, p2, v0, v2}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, ")."

    invoke-static {v1, p2, p1}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/whoop/service/OnBluetoothConnect;->a:Ltr2/n;

    new-array v0, v5, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_7
    return-void
.end method
