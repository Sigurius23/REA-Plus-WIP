.class public abstract Lno/nordicsemi/android/ble/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final f:Ljava/util/UUID;

.field static final g:Ljava/util/UUID;

.field static final h:Ljava/util/UUID;

.field static final i:Ljava/util/UUID;

.field static final j:Ljava/util/UUID;


# instance fields
.field private final a:Landroid/content/Context;

.field final b:Lno/nordicsemi/android/ble/b;

.field c:Lqd3/a;

.field d:Lqd3/b;

.field private final e:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "00002902-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lno/nordicsemi/android/ble/c;->f:Ljava/util/UUID;

    const-string v0, "0000180F-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lno/nordicsemi/android/ble/c;->g:Ljava/util/UUID;

    const-string v0, "00002A19-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lno/nordicsemi/android/ble/c;->h:Ljava/util/UUID;

    const-string v0, "00001801-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lno/nordicsemi/android/ble/c;->i:Ljava/util/UUID;

    const-string v0, "00002A05-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lno/nordicsemi/android/ble/c;->j:Ljava/util/UUID;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lno/nordicsemi/android/ble/l;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lno/nordicsemi/android/ble/l;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lno/nordicsemi/android/ble/c;->e:Landroid/content/BroadcastReceiver;

    iput-object p1, p0, Lno/nordicsemi/android/ble/c;->a:Landroid/content/Context;

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/c;->H()Lno/nordicsemi/android/ble/b;

    move-result-object v1

    iput-object v1, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v1, p0, p2}, Lno/nordicsemi/android/ble/c0;->D1(Lno/nordicsemi/android/ble/c;Landroid/os/Handler;)V

    new-instance p2, Landroid/content/IntentFilter;

    const-string v1, "android.bluetooth.device.action.PAIRING_REQUEST"

    invoke-direct {p2, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-static {p1, v0, p2, v1}, Ls4/c;->registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final C(Landroid/bluetooth/BluetoothDevice;)Lno/nordicsemi/android/ble/e0;
    .locals 1

    new-instance v0, Lno/nordicsemi/android/ble/e0;

    invoke-direct {v0, p1}, Lno/nordicsemi/android/ble/e0;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/c;->b0()Z

    move-result p1

    iput-boolean p1, v0, Lno/nordicsemi/android/ble/e0;->v:Z

    iget-object p1, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/ble/m0;->n(Ljc/x;)V

    return-object v0
.end method

.method public D()Lno/nordicsemi/android/ble/k0;
    .locals 2

    new-instance v0, Lno/nordicsemi/android/ble/l0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lno/nordicsemi/android/ble/k0;-><init>(I)V

    iget-object v1, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v0, v1}, Lno/nordicsemi/android/ble/k0;->j(Ljc/x;)V

    return-object v0
.end method

.method public final E()Lno/nordicsemi/android/ble/f0;
    .locals 2

    new-instance v0, Lno/nordicsemi/android/ble/f0;

    invoke-direct {v0}, Lno/nordicsemi/android/ble/f0;-><init>()V

    iget-object v1, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v0, v1}, Lno/nordicsemi/android/ble/m0;->n(Ljc/x;)V

    return-object v0
.end method

.method public F(Landroid/bluetooth/BluetoothGattCharacteristic;)Lno/nordicsemi/android/ble/q0;
    .locals 2

    new-instance v0, Lno/nordicsemi/android/ble/q0;

    const/16 v1, 0x10

    invoke-direct {v0, p1, v1}, Lno/nordicsemi/android/ble/q0;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    iget-object p1, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/ble/m0;->n(Ljc/x;)V

    return-object v0
.end method

.method public final G()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c;->a:Landroid/content/Context;

    return-object v0
.end method

.method public H()Lno/nordicsemi/android/ble/b;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lno/nordicsemi/android/ble/a;

    invoke-direct {v0}, Lno/nordicsemi/android/ble/a;-><init>()V

    return-object v0
.end method

.method public abstract I()I
.end method

.method public J()I
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c0;->B1()I

    move-result v0

    return v0
.end method

.method public K(Z)I
    .locals 0

    if-eqz p1, :cond_0

    const/16 p1, 0x640

    return p1

    :cond_0
    const/16 p1, 0x12c

    return p1
.end method

.method public L()V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c0;->F1()V

    return-void
.end method

.method public final M()Z
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c0;->z1()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public N(Landroid/bluetooth/BluetoothGatt;)Z
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/ble/c0;->S1(Landroid/bluetooth/BluetoothGatt;)Z

    move-result p1

    return p1
.end method

.method public O(Landroid/bluetooth/BluetoothGatt;)Z
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/ble/c0;->T1(Landroid/bluetooth/BluetoothGatt;)Z

    move-result p1

    return p1
.end method

.method public P(ILjava/lang/String;)V
    .locals 0

    return-void
.end method

.method public Q()V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c0;->g2()V

    return-void
.end method

.method public R()V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c0;->h2()V

    return-void
.end method

.method public S(Landroid/bluetooth/BluetoothDevice;II)V
    .locals 0

    return-void
.end method

.method public T()V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c0;->j2()V

    return-void
.end method

.method public U()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lno/nordicsemi/android/ble/h0;

    invoke-direct {v0}, Lno/nordicsemi/android/ble/h0;-><init>()V

    iget-object v1, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v0, v1}, Lno/nordicsemi/android/ble/m0;->n(Ljc/x;)V

    iget-object v1, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v1}, Lno/nordicsemi/android/ble/c0;->y1()Lmd3/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lno/nordicsemi/android/ble/h0;->q(Lmd3/b;)V

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/k0;->b()V

    return-void
.end method

.method public V()Lno/nordicsemi/android/ble/k0;
    .locals 2

    new-instance v0, Lno/nordicsemi/android/ble/l0;

    const/16 v1, 0x24

    invoke-direct {v0, v1}, Lno/nordicsemi/android/ble/k0;-><init>(I)V

    iget-object v1, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v0, v1}, Lno/nordicsemi/android/ble/k0;->j(Ljc/x;)V

    return-object v0
.end method

.method public W()Lno/nordicsemi/android/ble/k0;
    .locals 2

    new-instance v0, Lno/nordicsemi/android/ble/l0;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lno/nordicsemi/android/ble/k0;-><init>(I)V

    iget-object v1, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v0, v1}, Lno/nordicsemi/android/ble/k0;->j(Ljc/x;)V

    return-object v0
.end method

.method public X(I)Lno/nordicsemi/android/ble/g0;
    .locals 1

    new-instance v0, Lno/nordicsemi/android/ble/g0;

    invoke-direct {v0, p1}, Lno/nordicsemi/android/ble/g0;-><init>(I)V

    iget-object p1, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/ble/g0;->l(Ljc/x;)V

    return-object v0
.end method

.method public final Y(Lqd3/a;)V
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/c;->c:Lqd3/a;

    return-void
.end method

.method public final Z(Lqd3/b;)V
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/c;->d:Lqd3/b;

    return-void
.end method

.method public a0(Landroid/bluetooth/BluetoothGattCharacteristic;)Lno/nordicsemi/android/ble/o0;
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/ble/c0;->C1(Ljava/lang/Object;)Lno/nordicsemi/android/ble/o0;

    move-result-object p1

    return-object p1
.end method

.method public b0()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public c0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public close()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/c;->a:Landroid/content/Context;

    iget-object v1, p0, Lno/nordicsemi/android/ble/c;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c0;->v1()V

    return-void
.end method

.method public d0(Landroid/bluetooth/BluetoothGattCharacteristic;[BI)Lno/nordicsemi/android/ble/q0;
    .locals 2

    new-instance v0, Lno/nordicsemi/android/ble/q0;

    if-eqz p2, :cond_0

    array-length v1, p2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {v0, p1, p2, v1, p3}, Lno/nordicsemi/android/ble/q0;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;[BII)V

    iget-object p1, p0, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/ble/m0;->n(Ljc/x;)V

    return-object v0
.end method
