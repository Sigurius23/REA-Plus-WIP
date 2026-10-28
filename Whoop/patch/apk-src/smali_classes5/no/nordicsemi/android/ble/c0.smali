.class public abstract Lno/nordicsemi/android/ble/c0;
.super Ljc/x;
.source "SourceFile"


# instance fields
.field private E:Lno/nordicsemi/android/ble/c;

.field private F:Landroid/os/Handler;

.field private final G:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Lno/nordicsemi/android/ble/k0;",
            ">;"
        }
    .end annotation
.end field

.field private H:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Lno/nordicsemi/android/ble/k0;",
            ">;"
        }
    .end annotation
.end field

.field private I:Z

.field private J:Z

.field private K:Z

.field private L:Z

.field private M:J

.field private N:I

.field private O:Z

.field private P:Z

.field private Q:Z

.field private R:Z

.field private S:Z

.field private T:I

.field private U:Z

.field private V:Z

.field private W:I

.field private X:I

.field private Y:I

.field private Z:I

.field private a0:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private b0:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/bluetooth/BluetoothGattCharacteristic;",
            "[B>;"
        }
    .end annotation
.end field

.field private c0:Lno/nordicsemi/android/ble/e0;

.field private d0:Lno/nordicsemi/android/ble/k0;

.field private final e0:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Object;",
            "Lno/nordicsemi/android/ble/o0;",
            ">;"
        }
    .end annotation
.end field

.field private final f0:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private g0:Lno/nordicsemi/android/ble/o0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private final h0:Landroid/content/BroadcastReceiver;

.field private final i0:Landroid/content/BroadcastReceiver;

.field private final j0:Landroid/bluetooth/BluetoothGattCallback;

.field private final x:Ljava/lang/Object;

.field private y:Landroid/bluetooth/BluetoothDevice;

.field z:Landroid/bluetooth/BluetoothGatt;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x15

    invoke-direct {p0, v0}, Ljc/x;-><init>(I)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lno/nordicsemi/android/ble/c0;->x:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    iput-object v0, p0, Lno/nordicsemi/android/ble/c0;->G:Ljava/util/Deque;

    const/4 v0, 0x0

    iput v0, p0, Lno/nordicsemi/android/ble/c0;->N:I

    iput v0, p0, Lno/nordicsemi/android/ble/c0;->T:I

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/c0;->U:Z

    const/16 v0, 0x17

    iput v0, p0, Lno/nordicsemi/android/ble/c0;->W:I

    const/4 v0, -0x1

    iput v0, p0, Lno/nordicsemi/android/ble/c0;->a0:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lno/nordicsemi/android/ble/c0;->e0:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lno/nordicsemi/android/ble/c0;->f0:Ljava/util/HashMap;

    new-instance v0, Lno/nordicsemi/android/ble/l;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lno/nordicsemi/android/ble/l;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lno/nordicsemi/android/ble/c0;->h0:Landroid/content/BroadcastReceiver;

    new-instance v0, Lno/nordicsemi/android/ble/l;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lno/nordicsemi/android/ble/l;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lno/nordicsemi/android/ble/c0;->i0:Landroid/content/BroadcastReceiver;

    new-instance v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;

    invoke-direct {v0, p0}, Lno/nordicsemi/android/ble/BleManagerHandler$4;-><init>(Lno/nordicsemi/android/ble/c0;)V

    iput-object v0, p0, Lno/nordicsemi/android/ble/c0;->j0:Landroid/bluetooth/BluetoothGattCallback;

    return-void
.end method

.method public static A1(Landroid/bluetooth/BluetoothGattCharacteristic;I)Landroid/bluetooth/BluetoothGattDescriptor;
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result v0

    and-int/2addr p1, v0

    if-nez p1, :cond_1

    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_1
    sget-object p1, Lno/nordicsemi/android/ble/c;->f:Ljava/util/UUID;

    invoke-virtual {p0, p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F0(Lno/nordicsemi/android/ble/c0;Lno/nordicsemi/android/ble/k0;Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->d0:Lno/nordicsemi/android/ble/k0;

    if-ne v0, p1, :cond_0

    const/4 v0, -0x5

    invoke-virtual {p1, p2, v0}, Lno/nordicsemi/android/ble/k0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    :cond_0
    return-void
.end method

.method public static G0(Lno/nordicsemi/android/ble/c0;Lno/nordicsemi/android/ble/k0;Landroid/bluetooth/BluetoothDevice;)V
    .locals 3

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v0

    const/4 v1, 0x4

    if-lt v1, v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v2, "Cache refreshed"

    invoke-virtual {v0, v1, v2}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_0
    invoke-virtual {p1, p2}, Lno/nordicsemi/android/ble/k0;->h(Landroid/bluetooth/BluetoothDevice;)Z

    const/4 p1, 0x0

    iput-object p1, p0, Lno/nordicsemi/android/ble/c0;->d0:Lno/nordicsemi/android/ble/k0;

    const/4 p1, -0x3

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/c0;->w1(I)V

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    iget-boolean p2, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    if-eqz p2, :cond_3

    if-eqz p1, :cond_3

    iget-object p2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/c;->T()V

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/c0;->f2()V

    const/4 p2, 0x1

    iput-boolean p2, p0, Lno/nordicsemi/android/ble/c0;->L:Z

    const/4 p2, 0x0

    iput-boolean p2, p0, Lno/nordicsemi/android/ble/c0;->J:Z

    iget-object p2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/c;->I()I

    move-result p2

    const/4 v0, 0x2

    if-lt v0, p2, :cond_1

    iget-object p2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v1, "Discovering Services..."

    invoke-virtual {p2, v0, v1}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_1
    iget-object p2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/c;->I()I

    move-result p2

    const/4 v0, 0x3

    if-lt v0, p2, :cond_2

    iget-object p0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string p2, "gatt.discoverServices()"

    invoke-virtual {p0, v0, p2}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_2
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    :cond_3
    return-void
.end method

.method public static H0(Lno/nordicsemi/android/ble/c0;Lnd3/a;)V
    .locals 4

    iget-object v0, p1, Lnd3/a;->w:[B

    if-eqz v0, :cond_0

    array-length v0, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    iget-object p1, p1, Lnd3/a;->w:[B

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    array-length v1, p1

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    const/4 v2, 0x1

    if-le v2, v1, :cond_2

    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    aget-byte p1, p1, v0

    and-int/lit16 p1, p1, 0xff

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v0

    const/4 v1, 0x4

    if-lt v1, v0, :cond_3

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Battery Level received: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "%"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_3
    iput p1, p0, Lno/nordicsemi/android/ble/c0;->a0:I

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {p0, v0, p1}, Lno/nordicsemi/android/ble/c0;->X1(Landroid/bluetooth/BluetoothGatt;I)V

    iget-object p0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_4
    return-void
.end method

.method public static bridge synthetic I0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/o0;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/ble/c0;->g0:Lno/nordicsemi/android/ble/o0;

    return-object p0
.end method

.method public static bridge synthetic J0(Lno/nordicsemi/android/ble/c0;)Landroid/bluetooth/BluetoothDevice;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/ble/c0;->y:Landroid/bluetooth/BluetoothDevice;

    return-object p0
.end method

.method public static bridge synthetic K0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/e0;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/ble/c0;->c0:Lno/nordicsemi/android/ble/e0;

    return-object p0
.end method

.method public static bridge synthetic L0(Lno/nordicsemi/android/ble/c0;)Z
    .locals 0

    iget-boolean p0, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    return p0
.end method

.method public static bridge synthetic M0(Lno/nordicsemi/android/ble/c0;)I
    .locals 0

    iget p0, p0, Lno/nordicsemi/android/ble/c0;->N:I

    return p0
.end method

.method public static bridge synthetic N0(Lno/nordicsemi/android/ble/c0;)Z
    .locals 0

    iget-boolean p0, p0, Lno/nordicsemi/android/ble/c0;->U:Z

    return p0
.end method

.method public static bridge synthetic O0(Lno/nordicsemi/android/ble/c0;)J
    .locals 2

    iget-wide v0, p0, Lno/nordicsemi/android/ble/c0;->M:J

    return-wide v0
.end method

.method public static bridge synthetic P0(Lno/nordicsemi/android/ble/c0;)Z
    .locals 0

    iget-boolean p0, p0, Lno/nordicsemi/android/ble/c0;->K:Z

    return p0
.end method

.method public static bridge synthetic Q0(Lno/nordicsemi/android/ble/c0;)Ljava/util/Deque;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/ble/c0;->H:Ljava/util/Deque;

    return-object p0
.end method

.method public static bridge synthetic R0(Lno/nordicsemi/android/ble/c0;)Z
    .locals 0

    iget-boolean p0, p0, Lno/nordicsemi/android/ble/c0;->S:Z

    return p0
.end method

.method public static bridge synthetic S0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/c;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    return-object p0
.end method

.method public static bridge synthetic T0(Lno/nordicsemi/android/ble/c0;)I
    .locals 0

    iget p0, p0, Lno/nordicsemi/android/ble/c0;->W:I

    return p0
.end method

.method public static bridge synthetic U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/ble/c0;->d0:Lno/nordicsemi/android/ble/k0;

    return-object p0
.end method

.method public static bridge synthetic V0(Lno/nordicsemi/android/ble/c0;)Z
    .locals 0

    iget-boolean p0, p0, Lno/nordicsemi/android/ble/c0;->L:Z

    return p0
.end method

.method public static bridge synthetic W0(Lno/nordicsemi/android/ble/c0;)Z
    .locals 0

    iget-boolean p0, p0, Lno/nordicsemi/android/ble/c0;->J:Z

    return p0
.end method

.method public static bridge synthetic X0(Lno/nordicsemi/android/ble/c0;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lno/nordicsemi/android/ble/c0;->e0:Ljava/util/HashMap;

    return-object p0
.end method

.method public static bridge synthetic Y0(Lno/nordicsemi/android/ble/c0;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lno/nordicsemi/android/ble/c0;->c0:Lno/nordicsemi/android/ble/e0;

    return-void
.end method

.method public static bridge synthetic Z0(Lno/nordicsemi/android/ble/c0;Z)V
    .locals 0

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    return-void
.end method

.method public static bridge synthetic a1(Lno/nordicsemi/android/ble/c0;I)V
    .locals 0

    iput p1, p0, Lno/nordicsemi/android/ble/c0;->N:I

    return-void
.end method

.method public static bridge synthetic b1(Lno/nordicsemi/android/ble/c0;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/c0;->U:Z

    return-void
.end method

.method public static bridge synthetic c1(Lno/nordicsemi/android/ble/c0;I)V
    .locals 0

    iput p1, p0, Lno/nordicsemi/android/ble/c0;->T:I

    return-void
.end method

.method public static bridge synthetic d1(Lno/nordicsemi/android/ble/c0;)V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lno/nordicsemi/android/ble/c0;->M:J

    return-void
.end method

.method public static bridge synthetic e1(Lno/nordicsemi/android/ble/c0;Z)V
    .locals 0

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/c0;->K:Z

    return-void
.end method

.method public static bridge synthetic f1(Lno/nordicsemi/android/ble/c0;Ljava/util/Deque;)V
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/c0;->H:Ljava/util/Deque;

    return-void
.end method

.method public static bridge synthetic g1(Lno/nordicsemi/android/ble/c0;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/c0;->S:Z

    return-void
.end method

.method public static bridge synthetic h1(Lno/nordicsemi/android/ble/c0;Z)V
    .locals 0

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/c0;->I:Z

    return-void
.end method

.method public static bridge synthetic i1(Lno/nordicsemi/android/ble/c0;I)V
    .locals 0

    iput p1, p0, Lno/nordicsemi/android/ble/c0;->X:I

    return-void
.end method

.method public static bridge synthetic j1(Lno/nordicsemi/android/ble/c0;I)V
    .locals 0

    iput p1, p0, Lno/nordicsemi/android/ble/c0;->Y:I

    return-void
.end method

.method public static bridge synthetic k1(Lno/nordicsemi/android/ble/c0;I)V
    .locals 0

    iput p1, p0, Lno/nordicsemi/android/ble/c0;->W:I

    return-void
.end method

.method public static bridge synthetic l1(Lno/nordicsemi/android/ble/c0;Z)V
    .locals 0

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/c0;->Q:Z

    return-void
.end method

.method public static bridge synthetic m1(Lno/nordicsemi/android/ble/c0;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/c0;->P:Z

    return-void
.end method

.method public static bridge synthetic n1(Lno/nordicsemi/android/ble/c0;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/c0;->V:Z

    return-void
.end method

.method public static bridge synthetic o1(Lno/nordicsemi/android/ble/c0;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lno/nordicsemi/android/ble/c0;->d0:Lno/nordicsemi/android/ble/k0;

    return-void
.end method

.method public static bridge synthetic p1(Lno/nordicsemi/android/ble/c0;Z)V
    .locals 0

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/c0;->L:Z

    return-void
.end method

.method public static bridge synthetic q1(Lno/nordicsemi/android/ble/c0;Z)V
    .locals 0

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/c0;->J:Z

    return-void
.end method

.method public static bridge synthetic r1(Lno/nordicsemi/android/ble/c0;I)V
    .locals 0

    iput p1, p0, Lno/nordicsemi/android/ble/c0;->Z:I

    return-void
.end method

.method public static bridge synthetic s1(Lno/nordicsemi/android/ble/c0;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/c0;->R:Z

    return-void
.end method

.method public static t1(Lno/nordicsemi/android/ble/c0;I)V
    .locals 2

    new-instance v0, Lno/nordicsemi/android/ble/s;

    const/4 v1, 0x6

    invoke-direct {v0, p1, v1}, Lno/nordicsemi/android/ble/s;-><init>(II)V

    const/4 p1, 0x6

    invoke-virtual {p0, p1, v0}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    iget-object p0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static u1(Lno/nordicsemi/android/ble/c0;Lno/nordicsemi/android/ble/g;)V
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    iget-object v0, v0, Lno/nordicsemi/android/ble/c;->c:Lqd3/a;

    if-eqz v0, :cond_0

    new-instance v1, Lno/nordicsemi/android/ble/i;

    invoke-direct {v1, p1, v0}, Lno/nordicsemi/android/ble/i;-><init>(Lno/nordicsemi/android/ble/g;Lqd3/a;)V

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/c0;->e(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final B1()I
    .locals 1

    iget v0, p0, Lno/nordicsemi/android/ble/c0;->W:I

    return v0
.end method

.method public C1(Ljava/lang/Object;)Lno/nordicsemi/android/ble/o0;
    .locals 3

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->e0:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lno/nordicsemi/android/ble/o0;

    if-nez v0, :cond_1

    new-instance v0, Lno/nordicsemi/android/ble/o0;

    invoke-direct {v0, p0}, Lno/nordicsemi/android/ble/o0;-><init>(Lno/nordicsemi/android/ble/c0;)V

    if-eqz p1, :cond_0

    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->e0:Ljava/util/HashMap;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->e0:Ljava/util/HashMap;

    invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    return-object v0

    :cond_1
    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->y:Landroid/bluetooth/BluetoothDevice;

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    iput-object p1, v0, Lno/nordicsemi/android/ble/o0;->a:Lmd3/b;

    :cond_2
    return-object v0
.end method

.method public D1(Lno/nordicsemi/android/ble/c;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    iput-object p2, p0, Lno/nordicsemi/android/ble/c0;->F:Landroid/os/Handler;

    return-void
.end method

.method public E1(Landroid/bluetooth/BluetoothGatt;)Ljava/util/Deque;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothGatt;",
            ")",
            "Ljava/util/Deque<",
            "Lno/nordicsemi/android/ble/k0;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public final F(Lno/nordicsemi/android/ble/k0;)V
    .locals 1

    iget-boolean v0, p1, Lno/nordicsemi/android/ble/k0;->j:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/c0;->I:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->H:Ljava/util/Deque;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->G:Ljava/util/Deque;

    :goto_0
    invoke-interface {v0, p1}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    iput-boolean v0, p1, Lno/nordicsemi/android/ble/k0;->j:Z

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    return-void
.end method

.method public F1()V
    .locals 0

    return-void
.end method

.method public final G1(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/e0;)Z
    .locals 11

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    iget-boolean v1, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    if-nez v0, :cond_1

    :cond_0
    move-object v4, p1

    goto/16 :goto_6

    :cond_1
    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->G()Landroid/content/Context;

    move-result-object v5

    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->x:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    const/4 v4, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x3

    if-eqz v0, :cond_c

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/c0;->S:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v0

    if-lt v7, v0, :cond_2

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v8, "gatt.close()"

    invoke-virtual {v0, v7, v8}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_2
    :try_start_1
    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :try_start_2
    iput-object v2, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v0

    if-lt v7, v0, :cond_3

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v8, "wait(200)"

    invoke-virtual {v0, v7, v8}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_3
    const-wide/16 v8, 0xc8

    invoke-static {v8, v9}, Ljava/lang/Thread;->sleep(J)V

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    if-nez v0, :cond_4

    if-eqz p2, :cond_d

    iget-boolean v0, p2, Lno/nordicsemi/android/ble/k0;->l:Z
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v0, :cond_d

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object p1, v0

    goto/16 :goto_5

    :cond_4
    :goto_0
    :try_start_4
    monitor-exit v1

    goto/16 :goto_4

    :cond_5
    iput-boolean v4, p0, Lno/nordicsemi/android/ble/c0;->S:Z

    const-wide/16 v8, 0x0

    iput-wide v8, p0, Lno/nordicsemi/android/ble/c0;->M:J

    iput v3, p0, Lno/nordicsemi/android/ble/c0;->T:I

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v0

    if-lt v6, v0, :cond_6

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v2, "Connecting..."

    invoke-virtual {v0, v6, v2}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_6
    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lno/nordicsemi/android/ble/d;

    const/4 v2, 0x1

    invoke-direct {v0, p1, v2}, Lno/nordicsemi/android/ble/d;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/c0;->l2(Lno/nordicsemi/android/ble/a0;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x22

    if-lt v0, v2, :cond_a

    if-eqz p2, :cond_7

    iget p2, p2, Lno/nordicsemi/android/ble/e0;->r:I

    move v9, p2

    goto :goto_1

    :cond_7
    move v9, v3

    :goto_1
    iget-object p2, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v0

    if-lt v7, v0, :cond_8

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v2, "gatt.close()"

    invoke-virtual {v0, v7, v2}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_8
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGatt;->close()V

    iget-object p2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/c;->I()I

    move-result p2

    if-lt v7, p2, :cond_9

    iget-object p2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "gatt = device.connectGatt(autoConnect = true, TRANSPORT_LE, "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v9}, Lrd3/a;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v7, v0}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_9
    iget-object v7, p0, Lno/nordicsemi/android/ble/c0;->j0:Landroid/bluetooth/BluetoothGattCallback;

    iget-object v10, p0, Lno/nordicsemi/android/ble/c0;->F:Landroid/os/Handler;

    const/4 v6, 0x1

    const/4 v8, 0x2

    move-object v4, p1

    invoke-virtual/range {v4 .. v10}, Landroid/bluetooth/BluetoothDevice;->connectGatt(Landroid/content/Context;ZLandroid/bluetooth/BluetoothGattCallback;IILandroid/os/Handler;)Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    iput-object p1, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    goto :goto_2

    :cond_a
    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/c;->I()I

    move-result p1

    if-lt v7, p1, :cond_b

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string p2, "gatt.connect()"

    invoke-virtual {p1, v7, p2}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_b
    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->connect()Z

    :goto_2
    monitor-exit v1

    return v3

    :cond_c
    if-eqz p2, :cond_d

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->h0:Landroid/content/BroadcastReceiver;

    new-instance v8, Landroid/content/IntentFilter;

    const-string v9, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-direct {v8, v9}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-static {v5, v0, v8, v6}, Ls4/c;->registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->i0:Landroid/content/BroadcastReceiver;

    new-instance v8, Landroid/content/IntentFilter;

    const-string v9, "android.bluetooth.device.action.BOND_STATE_CHANGED"

    invoke-direct {v8, v9}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-static {v5, v0, v8, v6}, Ls4/c;->registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    :catch_0
    :cond_d
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-nez p2, :cond_e

    return v4

    :cond_e
    iget-boolean v0, p2, Lno/nordicsemi/android/ble/e0;->v:Z

    if-eqz v0, :cond_f

    iget-boolean v1, p2, Lno/nordicsemi/android/ble/e0;->w:Z

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/c0;->S:Z

    xor-int/lit8 v4, v1, 0x1

    :cond_f
    xor-int/2addr v0, v3

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/c0;->R:Z

    iput-object p1, p0, Lno/nordicsemi/android/ble/c0;->y:Landroid/bluetooth/BluetoothDevice;

    if-nez v4, :cond_12

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v0

    if-lt v6, v0, :cond_11

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    iget v1, p2, Lno/nordicsemi/android/ble/e0;->s:I

    add-int/lit8 v8, v1, 0x1

    iput v8, p2, Lno/nordicsemi/android/ble/e0;->s:I

    if-nez v1, :cond_10

    const-string v1, "Connecting..."

    goto :goto_3

    :cond_10
    const-string v1, "Retrying..."

    :goto_3
    invoke-virtual {v0, v6, v1}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_11
    iput v3, p0, Lno/nordicsemi/android/ble/c0;->T:I

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lno/nordicsemi/android/ble/d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lno/nordicsemi/android/ble/d;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/c0;->l2(Lno/nordicsemi/android/ble/a0;)V

    :cond_12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lno/nordicsemi/android/ble/c0;->M:J

    iget v9, p2, Lno/nordicsemi/android/ble/e0;->r:I

    iget-object p2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/c;->I()I

    move-result p2

    if-lt v7, p2, :cond_13

    iget-object p2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "gatt = device.connectGatt(autoConnect = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", TRANSPORT_LE, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9}, Lrd3/a;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v7, v0}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_13
    iget-object v7, p0, Lno/nordicsemi/android/ble/c0;->j0:Landroid/bluetooth/BluetoothGattCallback;

    const/4 v8, 0x2

    iget-object v10, p0, Lno/nordicsemi/android/ble/c0;->F:Landroid/os/Handler;

    move v6, v4

    move-object v4, p1

    invoke-virtual/range {v4 .. v10}, Landroid/bluetooth/BluetoothDevice;->connectGatt(Landroid/content/Context;ZLandroid/bluetooth/BluetoothGattCallback;IILandroid/os/Handler;)Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    iput-object p1, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    if-eqz v6, :cond_14

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->c0:Lno/nordicsemi/android/ble/e0;

    if-eqz p1, :cond_14

    invoke-virtual {p1, v4}, Lno/nordicsemi/android/ble/m0;->h(Landroid/bluetooth/BluetoothDevice;)Z

    iput-object v2, p0, Lno/nordicsemi/android/ble/c0;->c0:Lno/nordicsemi/android/ble/e0;

    :cond_14
    :goto_4
    return v3

    :goto_5
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1

    :goto_6
    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->y:Landroid/bluetooth/BluetoothDevice;

    if-eqz v0, :cond_15

    if-eqz p1, :cond_15

    invoke-virtual {p1, v4}, Landroid/bluetooth/BluetoothDevice;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_15

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->c0:Lno/nordicsemi/android/ble/e0;

    if-eqz p1, :cond_17

    invoke-virtual {p1, v4}, Lno/nordicsemi/android/ble/m0;->h(Landroid/bluetooth/BluetoothDevice;)Z

    goto :goto_8

    :cond_15
    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->c0:Lno/nordicsemi/android/ble/e0;

    if-eqz p1, :cond_17

    if-eqz v0, :cond_16

    const/4 p2, -0x4

    goto :goto_7

    :cond_16
    const/16 p2, -0x64

    :goto_7
    invoke-virtual {p1, v4, p2}, Lno/nordicsemi/android/ble/m0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_17
    :goto_8
    iput-object v2, p0, Lno/nordicsemi/android/ble/c0;->c0:Lno/nordicsemi/android/ble/e0;

    invoke-virtual {p0, v3}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    return v3
.end method

.method public final H1(Z)Z
    .locals 5

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->y:Landroid/bluetooth/BluetoothDevice;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v1, 0x2

    if-eqz p1, :cond_1

    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v2}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v2

    if-lt v1, v2, :cond_2

    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v3, "Ensuring bonding..."

    invoke-virtual {v2, v1, v3}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v2}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v2

    if-lt v1, v2, :cond_2

    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v3, "Starting bonding..."

    invoke-virtual {v2, v1, v3}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_2
    :goto_0
    const/4 v1, 0x1

    if-nez p1, :cond_4

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v2

    const/16 v3, 0xc

    if-ne v2, v3, :cond_4

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/c;->I()I

    move-result p1

    const/4 v2, 0x5

    if-lt v2, p1, :cond_3

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v3, "Bond information present on client, skipping bonding"

    invoke-virtual {p1, v2, v3}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_3
    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->d0:Lno/nordicsemi/android/ble/k0;

    invoke-virtual {p1, v0}, Lno/nordicsemi/android/ble/k0;->h(Landroid/bluetooth/BluetoothDevice;)Z

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    return v1

    :cond_4
    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v2}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v2

    const/4 v3, 0x3

    if-lt v3, v2, :cond_5

    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v4, "device.createBond()"

    invoke-virtual {v2, v3, v4}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_5
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->createBond()Z

    move-result v0

    if-eqz p1, :cond_6

    if-nez v0, :cond_6

    new-instance p1, Lno/nordicsemi/android/ble/l0;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Lno/nordicsemi/android/ble/k0;-><init>(I)V

    invoke-virtual {p1, p0}, Lno/nordicsemi/android/ble/k0;->j(Ljc/x;)V

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->d0:Lno/nordicsemi/android/ble/k0;

    iget-object v2, v0, Lno/nordicsemi/android/ble/k0;->g:Lmd3/e;

    iput-object v2, p1, Lno/nordicsemi/android/ble/k0;->g:Lmd3/e;

    iget-object v2, v0, Lno/nordicsemi/android/ble/k0;->i:Lmd3/d;

    iput-object v2, p1, Lno/nordicsemi/android/ble/k0;->i:Lmd3/d;

    iget-object v2, v0, Lno/nordicsemi/android/ble/k0;->h:Lmd3/c;

    iput-object v2, p1, Lno/nordicsemi/android/ble/k0;->h:Lmd3/c;

    const/4 v2, 0x0

    iput-object v2, v0, Lno/nordicsemi/android/ble/k0;->g:Lmd3/e;

    iput-object v2, v0, Lno/nordicsemi/android/ble/k0;->i:Lmd3/d;

    iput-object v2, v0, Lno/nordicsemi/android/ble/k0;->h:Lmd3/c;

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/c0;->x1(Lno/nordicsemi/android/ble/k0;)V

    new-instance p1, Lno/nordicsemi/android/ble/l0;

    const/4 v0, 0x6

    invoke-direct {p1, v0}, Lno/nordicsemi/android/ble/k0;-><init>(I)V

    invoke-virtual {p1, p0}, Lno/nordicsemi/android/ble/k0;->j(Ljc/x;)V

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/c0;->x1(Lno/nordicsemi/android/ble/k0;)V

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    return v1

    :cond_6
    return v0
.end method

.method public final I1(Landroid/bluetooth/BluetoothGattCharacteristic;)Z
    .locals 9

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    if-eqz p1, :cond_8

    iget-boolean v2, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    if-nez v2, :cond_0

    goto/16 :goto_1

    :cond_0
    const/16 v2, 0x30

    invoke-static {p1, v2}, Lno/nordicsemi/android/ble/c0;->A1(Landroid/bluetooth/BluetoothGattCharacteristic;I)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v2

    if-eqz v2, :cond_8

    iget-object v3, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v3}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v3

    const/4 v4, 0x3

    if-lt v4, v3, :cond_1

    iget-object v3, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "gatt.setCharacteristicNotification("

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ", false)"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_1
    const/4 v3, 0x6

    :try_start_0
    invoke-virtual {v0, p1, v1}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1

    iget-object v5, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v5}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v5

    const/4 v6, 0x2

    if-lt v6, v5, :cond_2

    iget-object v5, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Disabling notifications and indications for "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, v6, p1}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_2
    :try_start_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x21

    if-lt p1, v5, :cond_4

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/c;->I()I

    move-result p1

    if-lt v4, p1, :cond_3

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v5, "gatt.writeDescriptor(00002902-0000-1000-8000-00805f9b34fb, value=0x00-00)"

    invoke-virtual {p1, v4, v5}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_3
    sget-object p1, Landroid/bluetooth/BluetoothGattDescriptor;->DISABLE_NOTIFICATION_VALUE:[B

    invoke-virtual {v0, v2, p1}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;[B)I

    move-result p1

    if-nez p1, :cond_8

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/c;->I()I

    move-result p1

    if-lt v4, p1, :cond_5

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v5, "descriptor.setValue(0x00-00)"

    invoke-virtual {p1, v4, v5}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_5
    sget-object p1, Landroid/bluetooth/BluetoothGattDescriptor;->DISABLE_NOTIFICATION_VALUE:[B

    invoke-virtual {v2, p1}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/c;->I()I

    move-result p1

    if-lt v4, p1, :cond_6

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v5, "gatt.writeDescriptor(00002902-0000-1000-8000-00805f9b34fb)"

    invoke-virtual {p1, v4, v5}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_6
    invoke-virtual {v0, v2}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0

    return p1

    :goto_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v0

    if-lt v3, v0, :cond_7

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v3, p1}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_7
    return v1

    :catch_1
    move-exception p1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v0

    if-lt v3, v0, :cond_8

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v3, p1}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_8
    :goto_1
    return v1
.end method

.method public final J1(I)V
    .locals 10

    const/4 v0, 0x1

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/c0;->R:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/c0;->S:Z

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/c0;->P:Z

    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->y:Landroid/bluetooth/BluetoothDevice;

    iget-object v3, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    const/4 v4, 0x3

    if-eqz v3, :cond_7

    iget-boolean v5, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    iput v4, p0, Lno/nordicsemi/android/ble/c0;->T:I

    iget-object v6, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v6}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v6

    const/4 v7, 0x2

    if-lt v7, v6, :cond_1

    iget-object v6, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    if-eqz v5, :cond_0

    const-string v8, "Disconnecting..."

    goto :goto_0

    :cond_0
    const-string v8, "Cancelling connection..."

    :goto_0
    invoke-virtual {v6, v7, v8}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_1
    invoke-virtual {v3}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v6

    if-eqz v5, :cond_2

    iget-object v7, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, Lno/nordicsemi/android/ble/g;

    const/4 v8, 0x1

    invoke-direct {v7, v6, v8}, Lno/nordicsemi/android/ble/g;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v7}, Lno/nordicsemi/android/ble/c0;->l2(Lno/nordicsemi/android/ble/a0;)V

    :cond_2
    iget-object v7, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v7}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v7

    if-lt v4, v7, :cond_3

    iget-object v7, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v8, "gatt.disconnect()"

    invoke-virtual {v7, v4, v8}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_3
    :try_start_0
    invoke-virtual {v3}, Landroid/bluetooth/BluetoothGatt;->disconnect()V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v7

    iget-object v8, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v8}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v8

    const/4 v9, 0x6

    if-lt v9, v8, :cond_4

    iget-object v8, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v7}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v9, v7}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_4
    :goto_1
    if-eqz v5, :cond_5

    return-void

    :cond_5
    iput v1, p0, Lno/nordicsemi/android/ble/c0;->T:I

    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v1}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v1

    const/4 v5, 0x4

    if-lt v5, v1, :cond_6

    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v7, "Disconnected"

    invoke-virtual {v1, v5, v7}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_6
    invoke-virtual {p0}, Lno/nordicsemi/android/ble/c0;->v1()V

    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lno/nordicsemi/android/ble/h;

    const/4 v5, 0x3

    invoke-direct {v1, v6, p1, v5}, Lno/nordicsemi/android/ble/h;-><init>(Landroid/bluetooth/BluetoothDevice;II)V

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/c0;->l2(Lno/nordicsemi/android/ble/a0;)V

    :cond_7
    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->d0:Lno/nordicsemi/android/ble/k0;

    if-eqz p1, :cond_b

    iget v1, p1, Lno/nordicsemi/android/ble/k0;->d:I

    if-ne v1, v4, :cond_b

    if-nez v2, :cond_9

    if-eqz v3, :cond_8

    goto :goto_2

    :cond_8
    invoke-virtual {p1}, Lno/nordicsemi/android/ble/k0;->f()V

    goto :goto_4

    :cond_9
    :goto_2
    if-eqz v2, :cond_a

    goto :goto_3

    :cond_a
    invoke-virtual {v3}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    :goto_3
    invoke-virtual {p1, v2}, Lno/nordicsemi/android/ble/k0;->h(Landroid/bluetooth/BluetoothDevice;)Z

    :cond_b
    :goto_4
    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    return-void
.end method

.method public final K1(Landroid/bluetooth/BluetoothGattCharacteristic;)Z
    .locals 10

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    if-eqz p1, :cond_8

    iget-boolean v2, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    if-nez v2, :cond_0

    goto/16 :goto_1

    :cond_0
    const/16 v2, 0x20

    invoke-static {p1, v2}, Lno/nordicsemi/android/ble/c0;->A1(Landroid/bluetooth/BluetoothGattCharacteristic;I)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v2

    if-eqz v2, :cond_8

    iget-object v3, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v3}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v3

    const/4 v4, 0x3

    if-lt v4, v3, :cond_1

    iget-object v3, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "gatt.setCharacteristicNotification("

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ", true)"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_1
    const/4 v3, 0x6

    const/4 v5, 0x1

    :try_start_0
    invoke-virtual {v0, p1, v5}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1

    iget-object v6, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v6}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v6

    const/4 v7, 0x2

    if-lt v7, v6, :cond_2

    iget-object v6, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Enabling indications for "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, v7, p1}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_2
    :try_start_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x21

    if-lt p1, v6, :cond_4

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/c;->I()I

    move-result p1

    if-lt v4, p1, :cond_3

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v6, "gatt.writeDescriptor(00002902-0000-1000-8000-00805f9b34fb, value=0x02-00)"

    invoke-virtual {p1, v4, v6}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_3
    sget-object p1, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_INDICATION_VALUE:[B

    invoke-virtual {v0, v2, p1}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;[B)I

    move-result p1

    if-nez p1, :cond_8

    return v5

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/c;->I()I

    move-result p1

    if-lt v4, p1, :cond_5

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v5, "descriptor.setValue(0x02-00)"

    invoke-virtual {p1, v4, v5}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_5
    sget-object p1, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_INDICATION_VALUE:[B

    invoke-virtual {v2, p1}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/c;->I()I

    move-result p1

    if-lt v4, p1, :cond_6

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v5, "gatt.writeDescriptor(00002902-0000-1000-8000-00805f9b34fb)"

    invoke-virtual {p1, v4, v5}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_6
    invoke-virtual {v0, v2}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0

    return p1

    :goto_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v0

    if-lt v3, v0, :cond_7

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v3, p1}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_7
    return v1

    :catch_1
    move-exception p1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v0

    if-lt v3, v0, :cond_8

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v3, p1}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_8
    :goto_1
    return v1
.end method

.method public final L1(Landroid/bluetooth/BluetoothGattCharacteristic;)Z
    .locals 10

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    if-eqz p1, :cond_8

    iget-boolean v2, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    if-nez v2, :cond_0

    goto/16 :goto_1

    :cond_0
    const/16 v2, 0x10

    invoke-static {p1, v2}, Lno/nordicsemi/android/ble/c0;->A1(Landroid/bluetooth/BluetoothGattCharacteristic;I)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v2

    if-eqz v2, :cond_8

    iget-object v3, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v3}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v3

    const/4 v4, 0x3

    if-lt v4, v3, :cond_1

    iget-object v3, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "gatt.setCharacteristicNotification("

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ", true)"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_1
    const/4 v3, 0x6

    const/4 v5, 0x1

    :try_start_0
    invoke-virtual {v0, p1, v5}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1

    iget-object v6, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v6}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v6

    const/4 v7, 0x2

    if-lt v7, v6, :cond_2

    iget-object v6, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Enabling notifications for "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, v7, p1}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_2
    :try_start_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x21

    if-lt p1, v6, :cond_4

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/c;->I()I

    move-result p1

    if-lt v4, p1, :cond_3

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v6, "gatt.writeDescriptor(00002902-0000-1000-8000-00805f9b34fb, value=0x01-00)"

    invoke-virtual {p1, v4, v6}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_3
    sget-object p1, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_NOTIFICATION_VALUE:[B

    invoke-virtual {v0, v2, p1}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;[B)I

    move-result p1

    if-nez p1, :cond_8

    return v5

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/c;->I()I

    move-result p1

    if-lt v4, p1, :cond_5

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v5, "descriptor.setValue(0x01-00)"

    invoke-virtual {p1, v4, v5}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_5
    sget-object p1, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_NOTIFICATION_VALUE:[B

    invoke-virtual {v2, p1}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/c;->I()I

    move-result p1

    if-lt v4, p1, :cond_6

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v5, "gatt.writeDescriptor(00002902-0000-1000-8000-00805f9b34fb)"

    invoke-virtual {p1, v4, v5}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_6
    invoke-virtual {v0, v2}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0

    return p1

    :goto_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v0

    if-lt v3, v0, :cond_7

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v3, p1}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_7
    return v1

    :catch_1
    move-exception p1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v0

    if-lt v3, v0, :cond_8

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v3, p1}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_8
    :goto_1
    return v1
.end method

.method public final M1(Landroid/bluetooth/BluetoothGattCharacteristic;)Z
    .locals 6

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    iget-boolean v2, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result v2

    const/4 v3, 0x2

    and-int/2addr v2, v3

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v2}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v2

    if-lt v3, v2, :cond_2

    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Reading characteristic "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_2
    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v2}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v2

    const/4 v3, 0x3

    if-lt v3, v2, :cond_3

    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "gatt.readCharacteristic("

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ")"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_3
    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothGatt;->readCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v0

    const/4 v2, 0x6

    if-lt v2, v0, :cond_4

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_4
    :goto_0
    return v1
.end method

.method public final N1()Z
    .locals 5

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v2}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v2

    const/4 v3, 0x2

    if-lt v3, v2, :cond_1

    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v4, "Refreshing device cache..."

    invoke-virtual {v2, v3, v4}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_1
    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v2}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v2

    const/4 v3, 0x3

    if-lt v3, v2, :cond_2

    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v4, "gatt.refresh() (hidden)"

    invoke-virtual {v2, v3, v4}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_2
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "refresh"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v0, v2, :cond_3

    const/4 v0, 0x1

    return v0

    :cond_3
    :goto_0
    return v1

    :catch_0
    move-exception v0

    const-string v2, "BleManager"

    const-string v3, "An exception occurred while refreshing device"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v0

    const/4 v2, 0x5

    if-lt v2, v0, :cond_4

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v3, "gatt.refresh() method not found"

    invoke-virtual {v0, v2, v3}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_4
    return v1
.end method

.method public final O1()Z
    .locals 8

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->y:Landroid/bluetooth/BluetoothDevice;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v2}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v2

    const/4 v3, 0x2

    if-lt v3, v2, :cond_1

    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v4, "Removing bond information..."

    invoke-virtual {v2, v3, v4}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_1
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v2

    const/16 v3, 0xa

    const/4 v4, 0x1

    if-ne v2, v3, :cond_3

    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v1}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v1

    const/4 v2, 0x5

    if-lt v2, v1, :cond_2

    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v3, "Device is not bonded"

    invoke-virtual {v1, v2, v3}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_2
    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->d0:Lno/nordicsemi/android/ble/k0;

    invoke-virtual {v1, v0}, Lno/nordicsemi/android/ble/k0;->h(Landroid/bluetooth/BluetoothDevice;)Z

    invoke-virtual {p0, v4}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    return v4

    :cond_3
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "removeBond"

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    iget-object v3, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v3}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v3

    const/4 v6, 0x3

    if-lt v6, v3, :cond_4

    iget-object v3, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v7, "device.removeBond() (hidden)"

    invoke-virtual {v3, v6, v7}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_4
    iput-boolean v4, p0, Lno/nordicsemi/android/ble/c0;->R:Z

    invoke-virtual {v2, v0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v0, v2, :cond_5

    return v4

    :cond_5
    return v1

    :catch_0
    move-exception v0

    const-string v2, "BleManager"

    const-string v3, "An exception occurred while removing bond"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v1
.end method

.method public final P1(Z)Z
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_3

    iget-boolean v1, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lno/nordicsemi/android/ble/c;->g:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v1, Lno/nordicsemi/android/ble/c;->h:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    if-eqz p1, :cond_2

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/c0;->L1(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/c0;->I1(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final Q1(Landroid/bluetooth/BluetoothGattCharacteristic;[BI)Z
    .locals 8

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    if-eqz p1, :cond_7

    iget-boolean v2, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    if-nez v2, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result v2

    and-int/lit8 v2, v2, 0xc

    if-nez v2, :cond_1

    goto/16 :goto_2

    :cond_1
    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    :try_start_0
    new-array p2, v1, [B

    :goto_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v3, 0x21

    const-string v4, "gatt.writeCharacteristic("

    const-string v5, ")"

    const/4 v6, 0x2

    const/4 v7, 0x3

    if-lt v2, v3, :cond_4

    :try_start_1
    new-instance v2, Lno/nordicsemi/android/ble/e;

    const/4 v3, 0x1

    invoke-direct {v2, p1, p3, v3}, Lno/nordicsemi/android/ble/e;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;II)V

    invoke-virtual {p0, v6, v2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v2}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v2

    if-lt v7, v2, :cond_3

    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", value="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lrd3/a;->b([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p3}, Lrd3/a;->e(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v7, v3}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_3
    invoke-virtual {v0, p1, p2, p3}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;[BI)I

    move-result p1

    if-nez p1, :cond_7

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_4
    new-instance v2, Lno/nordicsemi/android/ble/e;

    const/4 v3, 0x0

    invoke-direct {v2, p1, p3, v3}, Lno/nordicsemi/android/ble/e;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;II)V

    invoke-virtual {p0, v6, v2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v2}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v2

    if-lt v7, v2, :cond_5

    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "characteristic.setValue("

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Lrd3/a;->b([B)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v7, v3}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_5
    invoke-virtual {p1, p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    new-instance p2, Lno/nordicsemi/android/ble/o;

    const/4 v2, 0x7

    invoke-direct {p2, p3, v2}, Lno/nordicsemi/android/ble/o;-><init>(II)V

    invoke-virtual {p0, v7, p2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-virtual {p1, p3}, Landroid/bluetooth/BluetoothGattCharacteristic;->setWriteType(I)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/c;->I()I

    move-result p2

    if-lt v7, p2, :cond_6

    iget-object p2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, v7, p3}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_6
    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0

    return p1

    :goto_1
    iget-object p2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/c;->I()I

    move-result p2

    const/4 p3, 0x6

    if-lt p3, p2, :cond_7

    iget-object p2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_7
    :goto_2
    return v1
.end method

.method public final R1()Z
    .locals 1

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    return v0
.end method

.method public S1(Landroid/bluetooth/BluetoothGatt;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public abstract T1(Landroid/bluetooth/BluetoothGatt;)Z
.end method

.method public final U1(ILno/nordicsemi/android/ble/b0;)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v0

    if-lt p1, v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-interface {p2}, Lno/nordicsemi/android/ble/b0;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final declared-synchronized V1(Z)V
    .locals 9

    monitor-enter p0

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    iget-boolean p1, p0, Lno/nordicsemi/android/ble/c0;->Q:Z

    if-eqz p1, :cond_0

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/c0;->Q:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_e

    :cond_0
    :goto_0
    iget-boolean p1, p0, Lno/nordicsemi/android/ble/c0;->Q:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->y:Landroid/bluetooth/BluetoothDevice;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x0

    :try_start_2
    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->H:Ljava/util/Deque;

    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/util/Deque;->poll()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lno/nordicsemi/android/ble/k0;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catch_0
    :cond_2
    move-object v2, v1

    :goto_1
    const/4 v3, 0x1

    if-nez v2, :cond_5

    :try_start_3
    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->H:Ljava/util/Deque;

    if-eqz v2, :cond_4

    iput-object v1, p0, Lno/nordicsemi/android/ble/c0;->H:Ljava/util/Deque;

    iput-boolean v3, p0, Lno/nordicsemi/android/ble/c0;->Q:Z

    iput-boolean v3, p0, Lno/nordicsemi/android/ble/c0;->P:Z

    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v2}, Lno/nordicsemi/android/ble/c;->Q()V

    if-eqz p1, :cond_3

    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lno/nordicsemi/android/ble/d;

    const/4 v4, 0x2

    invoke-direct {v2, p1, v4}, Lno/nordicsemi/android/ble/d;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v2}, Lno/nordicsemi/android/ble/c0;->l2(Lno/nordicsemi/android/ble/a0;)V

    :cond_3
    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->c0:Lno/nordicsemi/android/ble/e0;

    if-eqz v2, :cond_4

    iget-object v4, v2, Lno/nordicsemi/android/ble/e0;->q:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v2, v4}, Lno/nordicsemi/android/ble/m0;->h(Landroid/bluetooth/BluetoothDevice;)Z

    iput-object v1, p0, Lno/nordicsemi/android/ble/c0;->c0:Lno/nordicsemi/android/ble/e0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_4
    :try_start_4
    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->G:Ljava/util/Deque;

    invoke-interface {v2}, Ljava/util/Deque;->remove()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lno/nordicsemi/android/ble/k0;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    :catch_1
    :try_start_5
    iput-boolean v0, p0, Lno/nordicsemi/android/ble/c0;->Q:Z

    iput-object v1, p0, Lno/nordicsemi/android/ble/c0;->d0:Lno/nordicsemi/android/ble/k0;

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/c;->R()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p0

    return-void

    :cond_5
    :goto_2
    :try_start_6
    iget-boolean v4, v2, Lno/nordicsemi/android/ble/k0;->l:Z

    if-eqz v4, :cond_6

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/c0;->V1(Z)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    monitor-exit p0

    return-void

    :cond_6
    :try_start_7
    iput-boolean v3, p0, Lno/nordicsemi/android/ble/c0;->Q:Z

    iput-object v2, p0, Lno/nordicsemi/android/ble/c0;->d0:Lno/nordicsemi/android/ble/k0;

    instance-of v4, v2, Lno/nordicsemi/android/ble/e0;

    if-eqz v4, :cond_7

    move-object v4, v2

    check-cast v4, Lno/nordicsemi/android/ble/e0;

    iget-object v5, v4, Lno/nordicsemi/android/ble/e0;->q:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v4, v5}, Lno/nordicsemi/android/ble/m0;->g(Landroid/bluetooth/BluetoothDevice;)V

    goto :goto_3

    :cond_7
    if-eqz p1, :cond_2c

    invoke-virtual {v2, p1}, Lno/nordicsemi/android/ble/k0;->g(Landroid/bluetooth/BluetoothDevice;)V

    :goto_3
    iget v4, v2, Lno/nordicsemi/android/ble/k0;->d:I

    invoke-static {v4}, Le4/p;->e(I)I

    move-result v4

    const/4 v5, 0x6

    const/4 v6, 0x2

    const/4 v7, 0x3

    packed-switch v4, :pswitch_data_0

    packed-switch v4, :pswitch_data_1

    :cond_8
    :goto_4
    :pswitch_0
    move v1, v0

    goto/16 :goto_c

    :pswitch_1
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_2
    invoke-virtual {p0}, Lno/nordicsemi/android/ble/c0;->N1()Z

    move-result v1

    if-eqz v1, :cond_28

    new-instance v4, Lno/nordicsemi/android/ble/k;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v2, p1, v5}, Lno/nordicsemi/android/ble/k;-><init>(Lno/nordicsemi/android/ble/c0;Lno/nordicsemi/android/ble/k0;Landroid/bluetooth/BluetoothDevice;I)V

    const-wide/16 v5, 0xc8

    invoke-virtual {p0, v4, v5, v6}, Lno/nordicsemi/android/ble/c0;->g(Ljava/lang/Runnable;J)V

    goto/16 :goto_c

    :pswitch_3
    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    if-eqz v1, :cond_c

    iget-boolean v4, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    if-nez v4, :cond_9

    goto :goto_5

    :cond_9
    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v4

    if-lt v6, v4, :cond_a

    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v5, "Reading remote RSSI..."

    invoke-virtual {v4, v6, v5}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_a
    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v4

    if-lt v7, v4, :cond_b

    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v5, "gatt.readRemoteRssi()"

    invoke-virtual {v4, v7, v5}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_b
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->readRemoteRssi()Z

    move-result v1

    goto :goto_6

    :cond_c
    :goto_5
    move v1, v0

    :goto_6
    if-eqz v1, :cond_28

    new-instance v4, Lno/nordicsemi/android/ble/k;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v2, p1, v5}, Lno/nordicsemi/android/ble/k;-><init>(Lno/nordicsemi/android/ble/c0;Lno/nordicsemi/android/ble/k0;Landroid/bluetooth/BluetoothDevice;I)V

    const-wide/16 v5, 0x3e8

    invoke-virtual {p0, v4, v5, v6}, Lno/nordicsemi/android/ble/c0;->g(Ljava/lang/Runnable;J)V

    goto/16 :goto_c

    :pswitch_4
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_5
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_6
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_7
    move-object v1, v2

    check-cast v1, Lno/nordicsemi/android/ble/g0;

    iget v4, p0, Lno/nordicsemi/android/ble/c0;->W:I

    iget v5, v1, Lno/nordicsemi/android/ble/g0;->o:I

    if-eq v4, v5, :cond_10

    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    if-eqz v1, :cond_8

    iget-boolean v4, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    if-nez v4, :cond_d

    goto :goto_4

    :cond_d
    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v4

    if-lt v6, v4, :cond_e

    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v8, "Requesting new MTU..."

    invoke-virtual {v4, v6, v8}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_e
    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v4

    if-lt v7, v4, :cond_f

    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "gatt.requestMtu("

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ")"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v7, v6}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_f
    invoke-virtual {v1, v5}, Landroid/bluetooth/BluetoothGatt;->requestMtu(I)Z

    move-result v1

    goto/16 :goto_c

    :cond_10
    iget-boolean v5, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    if-eqz v5, :cond_11

    iget-object v0, v1, Lno/nordicsemi/android/ble/k0;->b:Lno/nordicsemi/android/ble/d0;

    new-instance v2, Lno/nordicsemi/android/ble/p;

    invoke-direct {v2, v1, p1, v4}, Lno/nordicsemi/android/ble/p;-><init>(Lno/nordicsemi/android/ble/g0;Landroid/bluetooth/BluetoothDevice;I)V

    invoke-interface {v0, v2}, Lno/nordicsemi/android/ble/d0;->e(Ljava/lang/Runnable;)V

    invoke-virtual {v1, p1}, Lno/nordicsemi/android/ble/k0;->h(Landroid/bluetooth/BluetoothDevice;)Z

    invoke-virtual {p0, v3}, Lno/nordicsemi/android/ble/c0;->V1(Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    monitor-exit p0

    return-void

    :cond_11
    move v1, v5

    goto/16 :goto_c

    :pswitch_8
    :try_start_8
    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    if-eqz v1, :cond_8

    iget-boolean v4, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    if-nez v4, :cond_12

    goto/16 :goto_4

    :cond_12
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    invoke-virtual {v4}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v4

    const/16 v5, 0xc

    if-eq v4, v5, :cond_13

    goto/16 :goto_4

    :cond_13
    sget-object v4, Lno/nordicsemi/android/ble/c;->i:Ljava/util/UUID;

    invoke-virtual {v1, v4}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v1

    if-nez v1, :cond_14

    goto/16 :goto_4

    :cond_14
    sget-object v4, Lno/nordicsemi/android/ble/c;->j:Ljava/util/UUID;

    invoke-virtual {v1, v4}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    if-nez v1, :cond_15

    goto/16 :goto_4

    :cond_15
    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v4

    const/4 v5, 0x4

    if-lt v5, v4, :cond_16

    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v6, "Service Changed characteristic found on a bonded device"

    invoke-virtual {v4, v5, v6}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_16
    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/c0;->K1(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v1

    goto/16 :goto_c

    :pswitch_9
    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/c0;->P1(Z)Z

    move-result v1

    goto/16 :goto_c

    :pswitch_a
    invoke-virtual {p0, v3}, Lno/nordicsemi/android/ble/c0;->P1(Z)Z

    move-result v1

    goto/16 :goto_c

    :pswitch_b
    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    if-eqz v1, :cond_8

    iget-boolean v4, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    if-nez v4, :cond_17

    goto/16 :goto_4

    :cond_17
    sget-object v4, Lno/nordicsemi/android/ble/c;->g:Ljava/util/UUID;

    invoke-virtual {v1, v4}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v1

    if-nez v1, :cond_18

    goto/16 :goto_4

    :cond_18
    sget-object v4, Lno/nordicsemi/android/ble/c;->h:Ljava/util/UUID;

    invoke-virtual {v1, v4}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/c0;->M1(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v1

    goto/16 :goto_c

    :pswitch_c
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_d
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_e
    iget-object v1, v2, Lno/nordicsemi/android/ble/k0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/c0;->I1(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v1

    goto/16 :goto_c

    :pswitch_f
    iget-object v1, v2, Lno/nordicsemi/android/ble/k0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/c0;->I1(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v1

    goto/16 :goto_c

    :pswitch_10
    iget-object v1, v2, Lno/nordicsemi/android/ble/k0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/c0;->K1(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v1

    goto/16 :goto_c

    :pswitch_11
    iget-object v1, v2, Lno/nordicsemi/android/ble/k0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/c0;->L1(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v1

    goto/16 :goto_c

    :pswitch_12
    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    if-eqz v1, :cond_8

    iget-boolean v4, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    if-nez v4, :cond_19

    goto/16 :goto_4

    :cond_19
    iget-boolean v4, p0, Lno/nordicsemi/android/ble/c0;->V:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-nez v4, :cond_1a

    goto/16 :goto_4

    :cond_1a
    :try_start_9
    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v4

    if-lt v6, v4, :cond_1b

    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v8, "Aborting reliable write..."

    invoke-virtual {v4, v6, v8}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_1b
    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v4

    if-lt v7, v4, :cond_1c

    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v6, "gatt.abortReliableWrite()"

    invoke-virtual {v4, v7, v6}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_1c
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->abortReliableWrite()V
    :try_end_9
    .catch Ljava/lang/SecurityException; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto/16 :goto_b

    :catch_2
    move-exception v1

    :try_start_a
    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v4

    if-lt v5, v4, :cond_8

    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v5, v1}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    goto/16 :goto_4

    :pswitch_13
    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    if-eqz v1, :cond_8

    iget-boolean v4, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    if-nez v4, :cond_1d

    goto/16 :goto_4

    :cond_1d
    iget-boolean v4, p0, Lno/nordicsemi/android/ble/c0;->V:Z

    if-nez v4, :cond_1e

    goto/16 :goto_4

    :cond_1e
    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v4

    if-lt v6, v4, :cond_1f

    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v8, "Executing reliable write..."

    invoke-virtual {v4, v6, v8}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_1f
    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v4

    if-lt v7, v4, :cond_20

    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v6, "gatt.executeReliableWrite()"

    invoke-virtual {v4, v7, v6}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :cond_20
    :try_start_b
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->executeReliableWrite()Z

    move-result v1
    :try_end_b
    .catch Ljava/lang/SecurityException; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    goto/16 :goto_c

    :catch_3
    move-exception v1

    :try_start_c
    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v4

    if-lt v5, v4, :cond_8

    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v5, v1}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    goto/16 :goto_4

    :pswitch_14
    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    if-eqz v1, :cond_25

    iget-boolean v4, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    if-nez v4, :cond_21

    goto :goto_7

    :cond_21
    iget-boolean v4, p0, Lno/nordicsemi/android/ble/c0;->V:Z

    if-eqz v4, :cond_22

    move v1, v3

    goto :goto_8

    :cond_22
    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v4

    if-lt v6, v4, :cond_23

    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v8, "Beginning reliable write..."

    invoke-virtual {v4, v6, v8}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_23
    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v4

    if-lt v7, v4, :cond_24

    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v6, "gatt.beginReliableWrite()"

    invoke-virtual {v4, v7, v6}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :cond_24
    :try_start_d
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->beginReliableWrite()Z

    move-result v1

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/c0;->V:Z
    :try_end_d
    .catch Ljava/lang/SecurityException; {:try_start_d .. :try_end_d} :catch_4
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    goto :goto_8

    :catch_4
    move-exception v1

    :try_start_e
    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v4}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v4

    if-lt v5, v4, :cond_25

    iget-object v4, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v5, v1}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_25
    :goto_7
    move v1, v0

    :goto_8
    if-eqz v1, :cond_28

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->d0:Lno/nordicsemi/android/ble/k0;

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/ble/k0;->h(Landroid/bluetooth/BluetoothDevice;)Z

    invoke-virtual {p0, v3}, Lno/nordicsemi/android/ble/c0;->V1(Z)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    monitor-exit p0

    return-void

    :pswitch_15
    :try_start_f
    move-object v1, v2

    check-cast v1, Lno/nordicsemi/android/ble/q0;

    iput-boolean v3, v1, Lno/nordicsemi/android/ble/q0;->v:Z

    iget-object v4, v1, Lno/nordicsemi/android/ble/q0;->r:[B

    iput-object v4, v1, Lno/nordicsemi/android/ble/q0;->t:[B

    goto/16 :goto_4

    :pswitch_16
    iget-object v1, v2, Lno/nordicsemi/android/ble/k0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/c0;->M1(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v1

    goto :goto_c

    :pswitch_17
    move-object v1, v2

    check-cast v1, Lno/nordicsemi/android/ble/q0;

    iput-boolean v3, v1, Lno/nordicsemi/android/ble/q0;->v:Z

    iget-object v4, v1, Lno/nordicsemi/android/ble/q0;->r:[B

    iput-object v4, v1, Lno/nordicsemi/android/ble/q0;->t:[B

    if-eqz v4, :cond_26

    goto :goto_9

    :cond_26
    new-array v4, v0, [B

    :goto_9
    iget-object v5, v1, Lno/nordicsemi/android/ble/k0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    if-eqz v5, :cond_8

    invoke-virtual {v5, v4}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    iget-object v5, p0, Lno/nordicsemi/android/ble/c0;->b0:Ljava/util/Map;

    if-eqz v5, :cond_8

    iget-object v6, v1, Lno/nordicsemi/android/ble/k0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-interface {v5, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    iget-object v5, p0, Lno/nordicsemi/android/ble/c0;->b0:Ljava/util/Map;

    iget-object v1, v1, Lno/nordicsemi/android/ble/k0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-interface {v5, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_4

    :pswitch_18
    move-object v1, v2

    check-cast v1, Lno/nordicsemi/android/ble/q0;

    iget-object v4, v1, Lno/nordicsemi/android/ble/k0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    iput-boolean v3, v1, Lno/nordicsemi/android/ble/q0;->v:Z

    iget-object v5, v1, Lno/nordicsemi/android/ble/q0;->r:[B

    iput-object v5, v1, Lno/nordicsemi/android/ble/q0;->t:[B

    if-eqz v5, :cond_27

    goto :goto_a

    :cond_27
    new-array v5, v0, [B

    :goto_a
    iget v1, v1, Lno/nordicsemi/android/ble/q0;->s:I

    invoke-virtual {p0, v4, v5, v1}, Lno/nordicsemi/android/ble/c0;->Q1(Landroid/bluetooth/BluetoothGattCharacteristic;[BI)Z

    move-result v1

    goto :goto_c

    :pswitch_19
    invoke-virtual {p0}, Lno/nordicsemi/android/ble/c0;->O1()Z

    move-result v1

    goto :goto_c

    :pswitch_1a
    invoke-virtual {p0, v3}, Lno/nordicsemi/android/ble/c0;->H1(Z)Z

    move-result v1

    goto :goto_c

    :pswitch_1b
    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/c0;->H1(Z)Z

    move-result v1

    goto :goto_c

    :pswitch_1c
    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/c0;->J1(I)V

    :goto_b
    move v1, v3

    goto :goto_c

    :pswitch_1d
    move-object v4, v2

    check-cast v4, Lno/nordicsemi/android/ble/e0;

    iput-object v4, p0, Lno/nordicsemi/android/ble/c0;->c0:Lno/nordicsemi/android/ble/e0;

    iput-object v1, p0, Lno/nordicsemi/android/ble/c0;->d0:Lno/nordicsemi/android/ble/k0;

    iget-object v1, v4, Lno/nordicsemi/android/ble/e0;->q:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p0, v1, v4}, Lno/nordicsemi/android/ble/c0;->G1(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/e0;)Z

    move-result v1

    :cond_28
    :goto_c
    if-nez v1, :cond_2b

    if-eqz p1, :cond_2b

    iget-boolean v1, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    if-eqz v1, :cond_29

    const/4 v1, -0x3

    goto :goto_d

    :cond_29
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_2a

    const/4 v1, -0x1

    goto :goto_d

    :cond_2a
    const/16 v1, -0x64

    :goto_d
    invoke-virtual {v2, p1, v1}, Lno/nordicsemi/android/ble/k0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/c0;->U:Z

    invoke-virtual {p0, v3}, Lno/nordicsemi/android/ble/c0;->V1(Z)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    :cond_2b
    monitor-exit p0

    return-void

    :pswitch_1e
    :try_start_10
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_2c
    invoke-virtual {v2}, Lno/nordicsemi/android/ble/k0;->f()V

    invoke-virtual {p0, v3}, Lno/nordicsemi/android/ble/c0;->V1(Z)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    monitor-exit p0

    return-void

    :goto_e
    :try_start_11
    monitor-exit p0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x18
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public W1(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 6

    iget v0, p0, Lno/nordicsemi/android/ble/c0;->T:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    iget-boolean v1, p0, Lno/nordicsemi/android/ble/c0;->J:Z

    const/4 v2, 0x0

    iput-boolean v2, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    iput-boolean v2, p0, Lno/nordicsemi/android/ble/c0;->P:Z

    iput-boolean v2, p0, Lno/nordicsemi/android/ble/c0;->J:Z

    iput-boolean v2, p0, Lno/nordicsemi/android/ble/c0;->L:Z

    iput-boolean v2, p0, Lno/nordicsemi/android/ble/c0;->K:Z

    const/16 v3, 0x17

    iput v3, p0, Lno/nordicsemi/android/ble/c0;->W:I

    iput v2, p0, Lno/nordicsemi/android/ble/c0;->Z:I

    iput v2, p0, Lno/nordicsemi/android/ble/c0;->Y:I

    iput v2, p0, Lno/nordicsemi/android/ble/c0;->X:I

    iput v2, p0, Lno/nordicsemi/android/ble/c0;->T:I

    const/4 v2, 0x0

    const/4 v3, 0x5

    if-nez v0, :cond_2

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v0

    if-lt v3, v0, :cond_1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v4, "Connection attempt timed out"

    invoke-virtual {v0, v3, v4}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, Lno/nordicsemi/android/ble/c0;->v1()V

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lno/nordicsemi/android/ble/h;

    const/4 v3, 0x0

    invoke-direct {v0, p1, p2, v3}, Lno/nordicsemi/android/ble/h;-><init>(Landroid/bluetooth/BluetoothDevice;II)V

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/c0;->l2(Lno/nordicsemi/android/ble/a0;)V

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Lno/nordicsemi/android/ble/c0;->R:Z

    const/4 v4, 0x3

    if-eqz v0, :cond_6

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v0

    const/4 v3, 0x4

    if-lt v3, v0, :cond_3

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v5, "Disconnected"

    invoke-virtual {v0, v3, v5}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_3
    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->d0:Lno/nordicsemi/android/ble/k0;

    if-eqz v0, :cond_4

    iget v3, v0, Lno/nordicsemi/android/ble/k0;->d:I

    const/4 v5, 0x6

    if-eq v3, v5, :cond_5

    :cond_4
    invoke-virtual {p0}, Lno/nordicsemi/android/ble/c0;->v1()V

    :cond_5
    iget-object v3, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lno/nordicsemi/android/ble/h;

    const/4 v5, 0x1

    invoke-direct {v3, p1, p2, v5}, Lno/nordicsemi/android/ble/h;-><init>(Landroid/bluetooth/BluetoothDevice;II)V

    invoke-virtual {p0, v3}, Lno/nordicsemi/android/ble/c0;->l2(Lno/nordicsemi/android/ble/a0;)V

    if-eqz v0, :cond_9

    iget p2, v0, Lno/nordicsemi/android/ble/k0;->d:I

    if-ne p2, v4, :cond_9

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/ble/k0;->h(Landroid/bluetooth/BluetoothDevice;)Z

    iput-object v2, p0, Lno/nordicsemi/android/ble/c0;->d0:Lno/nordicsemi/android/ble/k0;

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v0

    if-lt v3, v0, :cond_7

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v5, "Connection lost"

    invoke-virtual {v0, v3, v5}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_7
    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x2

    if-ne p2, v0, :cond_8

    move v4, v0

    :cond_8
    new-instance p2, Lno/nordicsemi/android/ble/h;

    const/4 v0, 0x2

    invoke-direct {p2, p1, v4, v0}, Lno/nordicsemi/android/ble/h;-><init>(Landroid/bluetooth/BluetoothDevice;II)V

    invoke-virtual {p0, p2}, Lno/nordicsemi/android/ble/c0;->l2(Lno/nordicsemi/android/ble/a0;)V

    :cond_9
    :goto_0
    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->e0:Ljava/util/HashMap;

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, Lno/nordicsemi/android/ble/c0;->e0:Ljava/util/HashMap;

    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lno/nordicsemi/android/ble/o0;

    iput-object v2, v0, Lno/nordicsemi/android/ble/o0;->a:Lmd3/b;

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_a
    iget-object p2, p0, Lno/nordicsemi/android/ble/c0;->e0:Ljava/util/HashMap;

    invoke-virtual {p2}, Ljava/util/HashMap;->clear()V

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->f0:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    iput-object v2, p0, Lno/nordicsemi/android/ble/c0;->g0:Lno/nordicsemi/android/ble/o0;

    const/4 p1, -0x1

    iput p1, p0, Lno/nordicsemi/android/ble/c0;->a0:I

    if-eqz v1, :cond_b

    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/c;->T()V

    :cond_b
    invoke-virtual {p0}, Lno/nordicsemi/android/ble/c0;->f2()V

    return-void

    :goto_2
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2
.end method

.method public X1(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public Y1(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public Z1(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->F:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a2(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public b2(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public c2(Landroid/bluetooth/BluetoothGatt;III)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public d2(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public e(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->F:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final e0(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/m0;)V
    .locals 3

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v0

    const/4 v1, 0x5

    if-lt v1, v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v2, "Request timed out"

    invoke-virtual {v0, v1, v2}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->d0:Lno/nordicsemi/android/ble/k0;

    instance-of v1, v0, Lno/nordicsemi/android/ble/m0;

    const/4 v2, -0x5

    if-eqz v1, :cond_1

    check-cast v0, Lno/nordicsemi/android/ble/m0;

    invoke-virtual {v0, p1, v2}, Lno/nordicsemi/android/ble/m0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_1
    invoke-virtual {p2, p1, v2}, Lno/nordicsemi/android/ble/m0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    iget p1, p2, Lno/nordicsemi/android/ble/k0;->d:I

    const/4 p2, 0x2

    if-ne p1, p2, :cond_2

    const/4 p1, 0x0

    iput-object p1, p0, Lno/nordicsemi/android/ble/c0;->c0:Lno/nordicsemi/android/ble/e0;

    const/16 p1, 0xa

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/c0;->J1(I)V

    return-void

    :cond_2
    const/4 p2, 0x3

    if-ne p1, p2, :cond_3

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/c0;->v1()V

    return-void

    :cond_3
    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->d0:Lno/nordicsemi/android/ble/k0;

    if-eqz p1, :cond_5

    iget-boolean p1, p1, Lno/nordicsemi/android/ble/k0;->l:Z

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    goto :goto_1

    :cond_5
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    return-void
.end method

.method public e2(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public f2()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public g(Ljava/lang/Runnable;J)V
    .locals 3

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    new-instance v1, Lio/sentry/o;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Lio/sentry/o;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1, p2, p3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method public g2()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public h2()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public i2(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public abstract j2()V
.end method

.method public final k2()V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final l2(Lno/nordicsemi/android/ble/a0;)V
    .locals 3

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    iget-object v0, v0, Lno/nordicsemi/android/ble/c;->d:Lqd3/b;

    if-eqz v0, :cond_0

    new-instance v1, Lno/nordicsemi/android/ble/j;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1, v0}, Lno/nordicsemi/android/ble/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/c0;->e(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final n()V
    .locals 4

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->y:Landroid/bluetooth/BluetoothDevice;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v1}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v1

    const/4 v2, 0x5

    if-lt v2, v1, :cond_1

    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v3, "Request cancelled"

    invoke-virtual {v1, v2, v3}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    :cond_1
    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->d0:Lno/nordicsemi/android/ble/k0;

    instance-of v2, v1, Lno/nordicsemi/android/ble/m0;

    if-eqz v2, :cond_2

    check-cast v1, Lno/nordicsemi/android/ble/m0;

    const/4 v2, -0x7

    invoke-virtual {v1, v0, v2}, Lno/nordicsemi/android/ble/m0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_2
    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->d0:Lno/nordicsemi/android/ble/k0;

    if-eqz v0, :cond_4

    iget-boolean v0, v0, Lno/nordicsemi/android/ble/k0;->l:Z

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    return-void
.end method

.method public final o()V
    .locals 3

    const/4 v0, -0x7

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/c0;->w1(I)V

    const/4 v1, 0x0

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/c0;->I:Z

    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->y:Landroid/bluetooth/BluetoothDevice;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v2, p0, Lno/nordicsemi/android/ble/c0;->Q:Z

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/c0;->n()V

    :cond_1
    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->c0:Lno/nordicsemi/android/ble/e0;

    if-eqz v2, :cond_2

    invoke-virtual {v2, v1, v0}, Lno/nordicsemi/android/ble/m0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    const/4 v0, 0x0

    iput-object v0, p0, Lno/nordicsemi/android/ble/c0;->c0:Lno/nordicsemi/android/ble/e0;

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lno/nordicsemi/android/ble/c0;->J1(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public v1()V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c;->G()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->h0:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->i0:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->x:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    iget-boolean v1, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    iget-object v2, p0, Lno/nordicsemi/android/ble/c0;->y:Landroid/bluetooth/BluetoothDevice;

    iget-object v3, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    iget-object v3, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v3}, Lno/nordicsemi/android/ble/c;->c0()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/c0;->N1()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v3}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v3

    const/4 v5, 0x4

    if-lt v5, v3, :cond_1

    iget-object v3, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v6, "Cache refreshed"

    invoke-virtual {v3, v5, v6}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v3}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v3

    const/4 v5, 0x5

    if-lt v5, v3, :cond_1

    iget-object v3, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v6, "Refreshing failed"

    invoke-virtual {v3, v5, v6}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v3, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v3}, Lno/nordicsemi/android/ble/c;->I()I

    move-result v3

    const/4 v5, 0x3

    if-lt v5, v3, :cond_2

    iget-object v3, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    const-string v6, "gatt.close()"

    invoke-virtual {v3, v5, v6}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    :try_start_2
    iget-object v3, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothGatt;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    :try_start_3
    iput-object v4, p0, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    :cond_3
    const/4 v3, 0x0

    iput-boolean v3, p0, Lno/nordicsemi/android/ble/c0;->V:Z

    iput-boolean v3, p0, Lno/nordicsemi/android/ble/c0;->S:Z

    const/4 v5, -0x1

    invoke-virtual {p0, v5}, Lno/nordicsemi/android/ble/c0;->w1(I)V

    iput-boolean v3, p0, Lno/nordicsemi/android/ble/c0;->I:Z

    iput-object v4, p0, Lno/nordicsemi/android/ble/c0;->y:Landroid/bluetooth/BluetoothDevice;

    iput-boolean v3, p0, Lno/nordicsemi/android/ble/c0;->O:Z

    iput v3, p0, Lno/nordicsemi/android/ble/c0;->T:I

    const/16 v4, 0x17

    iput v4, p0, Lno/nordicsemi/android/ble/c0;->W:I

    iput v3, p0, Lno/nordicsemi/android/ble/c0;->Z:I

    iput v3, p0, Lno/nordicsemi/android/ble/c0;->Y:I

    iput v3, p0, Lno/nordicsemi/android/ble/c0;->X:I

    if-eqz v1, :cond_4

    if-eqz v2, :cond_4

    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->E:Lno/nordicsemi/android/ble/c;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lno/nordicsemi/android/ble/g;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lno/nordicsemi/android/ble/g;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/c0;->l2(Lno/nordicsemi/android/ble/a0;)V

    :cond_4
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public final w1(I)V
    .locals 4

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->y:Landroid/bluetooth/BluetoothDevice;

    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->H:Ljava/util/Deque;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lno/nordicsemi/android/ble/k0;

    if-eqz v0, :cond_0

    invoke-virtual {v2, v0, p1}, Lno/nordicsemi/android/ble/k0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lno/nordicsemi/android/ble/k0;->f()V

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    iput-object v1, p0, Lno/nordicsemi/android/ble/c0;->H:Ljava/util/Deque;

    :cond_2
    iget-object v1, p0, Lno/nordicsemi/android/ble/c0;->G:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lno/nordicsemi/android/ble/k0;

    if-eqz v0, :cond_4

    const/16 v3, -0x64

    if-eq p1, v3, :cond_3

    iget-object v3, v2, Lno/nordicsemi/android/ble/k0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    if-nez v3, :cond_3

    const/4 v3, -0x7

    invoke-virtual {v2, v0, v3}, Lno/nordicsemi/android/ble/k0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    goto :goto_1

    :cond_3
    invoke-virtual {v2, v0, p1}, Lno/nordicsemi/android/ble/k0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Lno/nordicsemi/android/ble/k0;->f()V

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lno/nordicsemi/android/ble/c0;->G:Ljava/util/Deque;

    invoke-interface {p1}, Ljava/util/Collection;->clear()V

    return-void
.end method

.method public final x1(Lno/nordicsemi/android/ble/k0;)V
    .locals 1

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/c0;->I:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->H:Ljava/util/Deque;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->G:Ljava/util/Deque;

    :goto_0
    invoke-interface {v0, p1}, Ljava/util/Deque;->addFirst(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p1, Lno/nordicsemi/android/ble/k0;->j:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/c0;->Q:Z

    return-void
.end method

.method public y1()Lmd3/b;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lno/nordicsemi/android/ble/f;

    invoke-direct {v0, p0}, Lno/nordicsemi/android/ble/f;-><init>(Lno/nordicsemi/android/ble/c0;)V

    return-object v0
.end method

.method public z1()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/c0;->y:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method
