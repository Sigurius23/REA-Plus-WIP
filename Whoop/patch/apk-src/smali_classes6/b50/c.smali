.class public final Lb50/c;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"

# interfaces
.implements Landroid/bluetooth/BluetoothProfile$ServiceListener;


# static fields
.field public static final synthetic K:I


# instance fields
.field public final E:Lkr/e;

.field public F:Landroid/bluetooth/BluetoothHeadset;

.field public G:Z

.field public H:Lx30/s0;

.field public final I:Lb50/a;

.field public final J:Lb50/a;

.field public final w:Landroid/content/Context;

.field public final x:Lkr/e;

.field public final y:Landroid/bluetooth/BluetoothAdapter;

.field public z:Lz40/k;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lkr/e;Landroid/bluetooth/BluetoothAdapter;Lz40/f;)V
    .locals 7

    new-instance v4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v4, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v5, Lu00/e;

    const/4 v0, 0x4

    invoke-direct {v5, v0}, Lu00/e;-><init>(I)V

    new-instance v0, Lkr/e;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lkr/e;-><init>(I)V

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    iput-object p1, p0, Lb50/c;->w:Landroid/content/Context;

    iput-object p2, p0, Lb50/c;->x:Lkr/e;

    iput-object p3, p0, Lb50/c;->y:Landroid/bluetooth/BluetoothAdapter;

    const/4 p1, 0x0

    iput-object p1, p0, Lb50/c;->z:Lz40/k;

    iput-object v0, p0, Lb50/c;->E:Lkr/e;

    iput-object p1, p0, Lb50/c;->F:Landroid/bluetooth/BluetoothHeadset;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lb50/c;->G:Z

    sget-object p1, Lb50/b;->f:Lb50/b;

    iput-object p1, p0, Lb50/c;->H:Lx30/s0;

    new-instance v0, Lb50/a;

    const/4 v6, 0x1

    move-object v1, p0

    move-object v2, p2

    move-object v3, p4

    invoke-direct/range {v0 .. v6}, Lb50/a;-><init>(Lb50/c;Lkr/e;Lz40/f;Landroid/os/Handler;Lu00/e;I)V

    iput-object v0, v1, Lb50/c;->I:Lb50/a;

    new-instance v0, Lb50/a;

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lb50/a;-><init>(Lb50/c;Lkr/e;Lz40/f;Landroid/os/Handler;Lu00/e;I)V

    iput-object v0, v1, Lb50/c;->J:Lb50/a;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lb50/c;->H:Lx30/s0;

    sget-object v1, Lb50/b;->b:Lb50/b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb50/c;->J:Lb50/a;

    invoke-virtual {v0}, Lb3/b;->m()V

    return-void

    :cond_0
    iget-object v0, p0, Lb50/c;->H:Lx30/s0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot deactivate when in the "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " state"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lb50/c;->x:Lkr/e;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "message"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lb50/c;->F:Landroid/bluetooth/BluetoothHeadset;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothHeadset;->getConnectedDevices()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const-string v4, "message"

    const/4 v5, 0x1

    iget-object v6, p0, Lb50/c;->x:Lkr/e;

    if-le v3, v5, :cond_3

    invoke-virtual {p0}, Lb50/c;->c()Z

    move-result v3

    if-eqz v3, :cond_3

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, v5}, Landroid/bluetooth/BluetoothHeadset;->isAudioConnected(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_1
    move-object v3, v1

    :goto_0
    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v1

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Device size > 1 with device name: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    :cond_3
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v5, :cond_4

    invoke-static {v2}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Device size 1 with device name: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_4
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_5
    return-object v1
.end method

.method public final c()Z
    .locals 4

    iget-object v0, p0, Lb50/c;->F:Landroid/bluetooth/BluetoothHeadset;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothHeadset;->getConnectedDevices()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_3

    check-cast v2, Ljava/lang/Iterable;

    instance-of v3, v2, Ljava/util/Collection;

    if-eqz v3, :cond_1

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, v3}, Landroid/bluetooth/BluetoothHeadset;->isAudioConnected(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_4
    return v1
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lb50/c;->F:Landroid/bluetooth/BluetoothHeadset;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothHeadset;->getConnectedDevices()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final e(Lx30/s0;)V
    .locals 3

    iget-object v0, p0, Lb50/c;->H:Lx30/s0;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lb50/c;->H:Lx30/s0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Headset state changed to "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lb50/c;->x:Lkr/e;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "message"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb50/b;->f:Lb50/b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lb50/c;->I:Lb50/a;

    invoke-virtual {p1}, Lb3/b;->g()V

    :cond_0
    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    sget-object v0, Lb50/b;->e:Lb50/b;

    sget-object v1, Lb50/b;->b:Lb50/b;

    const-string v2, "context"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v2, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "android.media.ACTION_SCO_AUDIO_STATE_UPDATED"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    :cond_0
    iget-object p1, p0, Lb50/c;->E:Lkr/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "android.bluetooth.device.extra.DEVICE"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    new-instance v3, La50/a;

    invoke-direct {v3, p1}, La50/a;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    goto :goto_0

    :cond_1
    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_3

    iget-object p1, v3, La50/a;->c:Ljava/lang/Integer;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    const/16 v4, 0x408

    if-eq p1, v4, :cond_2

    const/16 v4, 0x404

    if-eq p1, v4, :cond_2

    const/16 v4, 0x420

    if-eq p1, v4, :cond_2

    const/16 v4, 0x418

    if-eq p1, v4, :cond_2

    const/16 v4, 0x1f00

    if-ne p1, v4, :cond_3

    :cond_2
    move-object v2, v3

    :cond_3
    const/4 p1, 0x2

    const/4 v3, 0x0

    iget-object v4, p0, Lb50/c;->x:Lkr/e;

    if-eqz v2, :cond_c

    iget-object v5, v2, La50/a;->b:Ljava/lang/String;

    const-string v6, "android.bluetooth.profile.extra.STATE"

    invoke-virtual {p2, v6, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    const-string v7, "message"

    const-string v8, "Bluetooth headset "

    if-eqz v6, :cond_9

    if-eq v6, p1, :cond_7

    iget-object v0, p0, Lb50/c;->I:Lb50/a;

    const/16 v8, 0xa

    if-eq v6, v8, :cond_5

    const/16 v8, 0xc

    if-eq v6, v8, :cond_4

    goto/16 :goto_2

    :cond_4
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "Bluetooth audio connected on device "

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lb3/b;->g()V

    invoke-virtual {p0, v1}, Lb50/c;->e(Lx30/s0;)V

    iget-object v0, p0, Lb50/c;->z:Lz40/k;

    if-eqz v0, :cond_c

    invoke-virtual {v0, v5}, Lz40/k;->a(Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_5
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "Bluetooth audio disconnected on device "

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lb50/c;->J:Lb50/a;

    invoke-virtual {v2}, Lb3/b;->g()V

    iget-object v2, p0, Lb50/c;->H:Lx30/s0;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lb50/c;->d()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lb50/c;->c()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v0}, Lb3/b;->m()V

    :cond_6
    iget-object v0, p0, Lb50/c;->z:Lz40/k;

    if-eqz v0, :cond_c

    invoke-virtual {v0, v5}, Lz40/k;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " connected"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lb50/c;->c()Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {p0, v0}, Lb50/c;->e(Lx30/s0;)V

    :cond_8
    iget-object v0, p0, Lb50/c;->z:Lz40/k;

    if-eqz v0, :cond_c

    invoke-virtual {v0, v5}, Lz40/k;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_9
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " disconnected"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lb50/c;->c()Z

    move-result v2

    if-eqz v2, :cond_a

    move-object v0, v1

    goto :goto_1

    :cond_a
    invoke-virtual {p0}, Lb50/c;->d()Z

    move-result v1

    if-eqz v1, :cond_b

    goto :goto_1

    :cond_b
    sget-object v0, Lb50/b;->f:Lb50/b;

    :goto_1
    invoke-virtual {p0, v0}, Lb50/c;->e(Lx30/s0;)V

    iget-object v0, p0, Lb50/c;->z:Lz40/k;

    if-eqz v0, :cond_c

    invoke-virtual {v0, v5}, Lz40/k;->a(Ljava/lang/String;)V

    :cond_c
    :goto_2
    const-string v0, "android.media.extra.SCO_AUDIO_STATE"

    invoke-virtual {p2, v0, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    if-eqz p2, :cond_10

    const/4 v0, 0x1

    if-eq p2, v0, :cond_f

    if-eq p2, p1, :cond_e

    :cond_d
    return-void

    :cond_e
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_f
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_10
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final onServiceConnected(ILandroid/bluetooth/BluetoothProfile;)V
    .locals 2

    const-string p1, "bluetoothProfile"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/bluetooth/BluetoothHeadset;

    iput-object p2, p0, Lb50/c;->F:Landroid/bluetooth/BluetoothHeadset;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothHeadset;->getConnectedDevices()Ljava/util/List;

    move-result-object p1

    const-string p2, "bluetoothProfile.connectedDevices"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Bluetooth "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " connected"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lb50/c;->x:Lkr/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lb50/c;->d()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lb50/c;->c()Z

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, Lb50/b;->e:Lb50/b;

    invoke-virtual {p0, p1}, Lb50/c;->e(Lx30/s0;)V

    :cond_1
    iget-object p1, p0, Lb50/c;->z:Lz40/k;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lb50/c;->b()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x2

    invoke-static {p1, p2, v0}, Lvp/c;->j0(Lz40/k;Ljava/lang/String;I)V

    :cond_2
    return-void
.end method

.method public final onServiceDisconnected(I)V
    .locals 2

    iget-object p1, p0, Lb50/c;->x:Lkr/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lb50/b;->f:Lb50/b;

    invoke-virtual {p0, p1}, Lb50/c;->e(Lx30/s0;)V

    iget-object p1, p0, Lb50/c;->z:Lz40/k;

    if-eqz p1, :cond_0

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Lvp/c;->j0(Lz40/k;Ljava/lang/String;I)V

    :cond_0
    return-void
.end method
