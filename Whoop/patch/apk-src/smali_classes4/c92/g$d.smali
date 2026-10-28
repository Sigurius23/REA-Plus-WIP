.class Lc92/g$d;
.super Lu92/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc92/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "BluetoothSyncDevicesPrefs"

    invoke-direct {p0, p1, v0}, Lu92/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private y(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public A(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    invoke-direct {p0, p1}, Lc92/g$d;->y(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lu92/d;->q(Ljava/lang/String;Z)V

    return-void
.end method

.method public z(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    invoke-direct {p0, p1}, Lc92/g$d;->y(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lu92/d;->q(Ljava/lang/String;Z)V

    return-void
.end method
