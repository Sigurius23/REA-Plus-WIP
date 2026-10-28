.class public Lc92/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;
.implements Lst0/a;
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc92/g$d;,
        Lc92/g$c;,
        Lc92/g$e;
    }
.end annotation


# static fields
.field private static final b0:Lorg/joda/time/format/DateTimeFormatter;


# instance fields
.field private final E:Lca2/f;

.field private final F:Lod1/u;

.field private G:Lxg3/t;

.field private final H:Lc92/g$d;

.field private final I:Lc92/a;

.field private final J:Landroid/app/AlarmManager;

.field private final K:Landroid/app/PendingIntent;

.field private L:Lc92/g$e;

.field private M:Landroid/os/Handler;

.field private final N:Ltr2/n;

.field private O:Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;

.field private P:Z

.field private Q:Lq92/c;

.field private final R:J

.field private final S:Lrr2/c;

.field private final T:Landroid/bluetooth/BluetoothAdapter;

.field private final U:Lz82/e;

.field private final V:Lcom/whoop/data/repositories/FeatureFlagRepository;

.field private final W:Ljs0/c;

.field private final X:Ljk0/b;

.field private final Y:Ljava/lang/Runnable;

.field private final Z:Ljava/lang/Runnable;

.field private final a0:Landroid/content/ServiceConnection;

.field private final w:Landroid/content/Context;

.field private final x:Lcom/whoop/service/sync/WhoopSyncService$b;

.field private final y:Ltd1/b;

.field private z:Ljk0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "H:mm"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Lc92/g;->b0:Lorg/joda/time/format/DateTimeFormatter;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;Ltd1/d;Lca2/f;Lod1/u;Lcom/whoop/data/repositories/FeatureFlagRepository;Ljs0/c;Ljk0/b;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lmh3/e;->a:Lmh3/d;

    iput-object v0, p0, Lc92/g;->G:Lxg3/t;

    const-class v0, Lc92/a;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc92/a;

    iput-object v0, p0, Lc92/g;->I:Lc92/a;

    const/4 v2, 0x0

    iput-boolean v2, p0, Lc92/g;->P:Z

    new-instance v3, Lvf3/c;

    const-string v4, "bluetoothSyncManagerDelay"

    invoke-direct {v3, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Ljava/lang/Long;

    invoke-static {v4, v3, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iput-wide v3, p0, Lc92/g;->R:J

    const-class v3, Lrr2/c;

    invoke-static {v3, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lrr2/c;

    iput-object v3, p0, Lc92/g;->S:Lrr2/c;

    const-class v3, Lz82/e;

    invoke-static {v3, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz82/e;

    iput-object v3, p0, Lc92/g;->U:Lz82/e;

    new-instance v3, Lc92/g$a;

    invoke-direct {v3, p0}, Lc92/g$a;-><init>(Lc92/g;)V

    iput-object v3, p0, Lc92/g;->Y:Ljava/lang/Runnable;

    new-instance v3, Lc92/d;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lc92/d;-><init>(Lc92/g;I)V

    iput-object v3, p0, Lc92/g;->Z:Ljava/lang/Runnable;

    new-instance v3, Lc92/g$b;

    invoke-direct {v3, p0}, Lc92/g$b;-><init>(Lc92/g;)V

    iput-object v3, p0, Lc92/g;->a0:Landroid/content/ServiceConnection;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v4, "bluetooth-syncing-extended-logging-droid"

    invoke-interface {p6, v4}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v4

    const-string v5, "BluetoothSyncManager"

    invoke-static {v5, v4}, Ltr2/n;->r(Ljava/lang/String;Z)Ltr2/n;

    move-result-object v4

    iput-object v4, p0, Lc92/g;->N:Ltr2/n;

    iput-object p1, p0, Lc92/g;->w:Landroid/content/Context;

    invoke-static {p1}, Lcom/whoop/service/sync/WhoopSyncService;->b(Landroid/content/Context;)Lcom/whoop/service/sync/WhoopSyncService$b;

    move-result-object v5

    iput-object v5, p0, Lc92/g;->x:Lcom/whoop/service/sync/WhoopSyncService$b;

    iput-object p3, p0, Lc92/g;->y:Ltd1/b;

    iput-object p4, p0, Lc92/g;->E:Lca2/f;

    iput-object p5, p0, Lc92/g;->F:Lod1/u;

    new-instance p3, Lc92/g$d;

    invoke-direct {p3, p1}, Lc92/g$d;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lc92/g;->H:Lc92/g$d;

    iput-object p2, p0, Lc92/g;->T:Landroid/bluetooth/BluetoothAdapter;

    const-string p3, "alarm"

    invoke-virtual {p1, p3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/app/AlarmManager;

    iput-object p3, p0, Lc92/g;->J:Landroid/app/AlarmManager;

    iput-object p6, p0, Lc92/g;->V:Lcom/whoop/data/repositories/FeatureFlagRepository;

    iput-object p7, p0, Lc92/g;->W:Ljs0/c;

    iput-object p8, p0, Lc92/g;->X:Ljk0/b;

    invoke-static {p1}, Lc92/h;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p3

    const/high16 p6, 0x4000000

    const/16 p7, 0x240

    invoke-static {p1, p7, p3, p6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p3

    iput-object p3, p0, Lc92/g;->K:Landroid/app/PendingIntent;

    const-class p3, Lq92/h;

    invoke-static {p3, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lq92/h;

    sget-object p6, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->K:Lcom/whoop/service/rearchitect/BleWhoopStrapService$b;

    invoke-virtual {p3}, Lq92/h;->a()Landroid/bluetooth/BluetoothDevice;

    move-result-object p3

    invoke-virtual {p6, p1, v3, p3}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$b;->a(Landroid/content/Context;Landroid/content/ServiceConnection;Landroid/bluetooth/BluetoothDevice;)V

    new-instance p3, Lc92/c;

    const/4 p6, 0x1

    invoke-direct {p3, p0, p6}, Lc92/c;-><init>(Lc92/g;I)V

    invoke-interface {p4, p3}, Lca2/f;->f(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    invoke-static {p1}, Lsk/a;->a(Landroid/content/Context;)Lxg3/g;

    move-result-object p1

    invoke-static {}, Lkh3/a;->a()Lkh3/a;

    move-result-object p3

    iget-object p3, p3, Lkh3/a;->a:Leh3/i;

    invoke-virtual {p1, p3}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object p1

    new-instance p3, Lc92/e;

    const/4 p4, 0x0

    invoke-direct {p3, p0, p4}, Lc92/e;-><init>(Lc92/g;I)V

    invoke-virtual {p1, p3}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    invoke-virtual {p5}, Lod1/u;->n()Lxg3/g;

    move-result-object p1

    invoke-static {}, Lkh3/a;->a()Lkh3/a;

    move-result-object p3

    iget-object p3, p3, Lkh3/a;->a:Leh3/i;

    invoke-virtual {p1, p3}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object p1

    new-instance p3, Lc92/e;

    const/4 p4, 0x1

    invoke-direct {p3, p0, p4}, Lc92/e;-><init>(Lc92/g;I)V

    invoke-virtual {p1, p3}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    if-eqz p2, :cond_0

    invoke-interface {v4}, Ltr2/n;->w()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "Initial Bluetooth State: "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothAdapter;->getState()I

    move-result p2

    invoke-virtual {v0, p2}, Lc92/a;->c(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p2, v2, [Lqr2/a$a;

    invoke-interface {v4, p1, p2}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_0

    :cond_0
    invoke-interface {v4}, Ltr2/n;->w()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "Initial Bluetooth State: No Adapter"

    new-array p2, v2, [Lqr2/a$a;

    invoke-interface {v4, p1, p2}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_1
    :goto_0
    invoke-direct {p0}, Lc92/g;->b0()V

    return-void
.end method

.method private A()V
    .locals 11

    invoke-direct {p0}, Lc92/g;->H()Lc92/g$c;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lc92/g;->y:Ltd1/b;

    invoke-interface {v0}, Ltd1/b;->A()Ltd1/e;

    move-result-object v0

    sget-object v1, Ltd1/e;->READY:Ltd1/e;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {v0}, Ltr2/n;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Scheduling BLE tickle"

    invoke-interface {v0, v2, v1}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    sget-object v3, Ly82/b;->BLE_RECONNECT_TICKLE:Ly82/b;

    iget-object v4, p0, Lc92/g;->w:Landroid/content/Context;

    invoke-direct {p0}, Lc92/g;->G()J

    move-result-wide v6

    invoke-direct {p0}, Lc92/g;->F()J

    move-result-wide v8

    iget-object v10, p0, Lc92/g;->S:Lrr2/c;

    const/16 v5, 0x258

    invoke-static/range {v3 .. v10}, Ly82/e;->i(Ly82/b;Landroid/content/Context;IJJLrr2/c;)V

    :cond_1
    return-void
.end method

.method private B()Z
    .locals 4

    invoke-direct {p0}, Lc92/g;->Q()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v2, "doLenientSync()"

    new-array v3, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lc92/g;->r0()V

    invoke-direct {p0}, Lc92/g;->H()Lc92/g$c;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v2, "Starting lenient sync"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lc92/g;->x:Lcom/whoop/service/sync/WhoopSyncService$b;

    invoke-virtual {v0}, Lcom/whoop/service/sync/WhoopSyncService$b;->d()Z

    const/4 v0, 0x1

    return v0

    :cond_1
    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {v0}, Ltr2/n;->w()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v2, "Starting lenient sync but no device connected"

    new-array v3, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_2
    return v1
.end method

.method private D()V
    .locals 4

    invoke-direct {p0}, Lc92/g;->Q()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lc92/g;->P()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v2, "Not starting strict sync: Bluetooth isn\'t on"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_1
    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v2, "Starting strict sync"

    new-array v3, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lc92/g;->r0()V

    iget-object v0, p0, Lc92/g;->x:Lcom/whoop/service/sync/WhoopSyncService$b;

    invoke-virtual {v0}, Lcom/whoop/service/sync/WhoopSyncService$b;->e()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v2, "Failed to start strict sync service"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_2
    invoke-direct {p0}, Lc92/g;->k0()V

    return-void
.end method

.method private E()Landroid/os/Handler;
    .locals 2

    iget-object v0, p0, Lc92/g;->M:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "Bluetooth Sync Manager Background Thread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lc92/g;->M:Landroid/os/Handler;

    :cond_0
    iget-object v0, p0, Lc92/g;->M:Landroid/os/Handler;

    return-object v0
.end method

.method private F()J
    .locals 4

    invoke-direct {p0}, Lc92/g;->G()J

    move-result-wide v0

    const-wide/16 v2, 0x1388

    add-long/2addr v0, v2

    return-wide v0
.end method

.method private G()J
    .locals 2

    iget-object v0, p0, Lc92/g;->W:Ljs0/c;

    sget-object v1, Lcom/whoop/data/repositories/ConnectionRequestInterval;->INSTANCE:Lcom/whoop/data/repositories/ConnectionRequestInterval;

    invoke-virtual {v0, v1}, Ljs0/c;->getConfigurationValueFromJava(Ljs0/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method private H()Lc92/g$c;
    .locals 2

    iget-object v0, p0, Lc92/g;->z:Ljk0/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lst0/l;->getConnectionState()Lst0/f;

    move-result-object v0

    sget-object v1, Lst0/n;->a:Lst0/n;

    if-ne v0, v1, :cond_0

    new-instance v0, Lc92/g$c;

    iget-object v1, p0, Lc92/g;->z:Ljk0/d;

    invoke-interface {v1}, Lst0/l;->A()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-direct {v0, v1}, Lc92/g$c;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private I()J
    .locals 4

    invoke-direct {p0}, Lc92/g;->M()Lc92/g$e;

    move-result-object v0

    invoke-virtual {v0}, Lc92/g$e;->A()J

    move-result-wide v0

    invoke-direct {p0}, Lc92/g;->M()Lc92/g$e;

    move-result-object v2

    invoke-virtual {v2}, Lc92/g$e;->B()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method private K()J
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xc

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    return-wide v0
.end method

.method private L()J
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x6

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    return-wide v0
.end method

.method private M()Lc92/g$e;
    .locals 3

    iget-object v0, p0, Lc92/g;->L:Lc92/g$e;

    if-nez v0, :cond_0

    new-instance v0, Lc92/g$e;

    iget-object v1, p0, Lc92/g;->w:Landroid/content/Context;

    iget-object v2, p0, Lc92/g;->F:Lod1/u;

    invoke-direct {v0, v1, v2}, Lc92/g$e;-><init>(Landroid/content/Context;Lod1/u;)V

    iput-object v0, p0, Lc92/g;->L:Lc92/g$e;

    :cond_0
    iget-object v0, p0, Lc92/g;->L:Lc92/g$e;

    return-object v0
.end method

.method private N()J
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    return-wide v0
.end method

.method private O()J
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0}, Lc92/g;->I()J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method private P()Z
    .locals 2

    iget-object v0, p0, Lc92/g;->T:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getState()I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private Q()Z
    .locals 1

    iget-object v0, p0, Lc92/g;->T:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private synthetic R(Ljava/lang/Integer;)V
    .locals 5

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {v0}, Ltr2/n;->w()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Bluetooth state: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lc92/g;->I:Lc92/a;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v3, v4}, Lc92/a;->c(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    const/16 v0, 0xa

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-direct {p0}, Lc92/g;->l0()V

    iget-object p1, p0, Lc92/g;->x:Lcom/whoop/service/sync/WhoopSyncService$b;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/service/sync/WhoopSyncService$b;->f()Z

    return-void

    :cond_1
    const/16 v0, 0xc

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne v0, p1, :cond_2

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    const-string v0, "tickling from bluetooth adapter state on"

    new-array v2, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0, v1}, Lc92/g;->q0(Z)V

    :cond_2
    return-void
.end method

.method private synthetic S(Lod1/u$a;)V
    .locals 0

    invoke-direct {p0}, Lc92/g;->t0()V

    return-void
.end method

.method private synthetic U(Ltd1/e;)V
    .locals 3

    invoke-virtual {p1}, Ltd1/e;->isReady()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lc92/g;->w()V

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {p1}, Ltr2/n;->w()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    const-string v1, "Strap ready, scheduling"

    new-array v2, v0, [Lqr2/a$a;

    invoke-interface {p1, v1, v2}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    invoke-direct {p0}, Lc92/g;->t0()V

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    const-string v1, "strapStateSubscription calling trySync()"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, v1, v0}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lc92/g;->r0()V

    return-void

    :cond_1
    invoke-direct {p0}, Lc92/g;->n0()V

    return-void
.end method

.method private synthetic V()V
    .locals 4

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    const-string v3, "posted quick nordic ble settling tickle"

    invoke-interface {v0, v3, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0, v1}, Lc92/g;->q0(Z)V

    return-void
.end method

.method private synthetic W(Lst0/f;)V
    .locals 3

    sget-object v0, Lst0/n;->a:Lst0/n;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    const-string v0, "Nordic BLE strap ready"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lc92/g;->v()V

    invoke-direct {p0}, Lc92/g;->t0()V

    return-void

    :cond_0
    sget-object v0, Lst0/g;->a:Lst0/g;

    if-eq p1, v0, :cond_3

    instance-of v0, p1, Lst0/i;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lst0/k;->a:Lst0/k;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    const-string v0, "Got notified of the Faulty State!"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lc92/g;->h0()V

    :cond_2
    return-void

    :cond_3
    :goto_0
    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    const-string v0, "nordic ble reconnected tickle"

    new-array v2, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0, v1}, Lc92/g;->q0(Z)V

    invoke-direct {p0}, Lc92/g;->E()Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lc92/d;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lc92/d;-><init>(Lc92/g;I)V

    iget-wide v1, p0, Lc92/g;->R:J

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private synthetic X()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lc92/g;->q0(Z)V

    return-void
.end method

.method public static synthetic b(Lc92/g;Lst0/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lc92/g;->W(Lst0/f;)V

    return-void
.end method

.method private b0()V
    .locals 3

    iget-object v0, p0, Lc92/g;->z:Ljk0/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v2, "got nordic source from service connection"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lq92/c;

    invoke-direct {v0}, Lq92/c;-><init>()V

    iget-object v1, p0, Lc92/g;->z:Ljk0/d;

    invoke-interface {v1, v0}, Lst0/l;->M(Lc83/a;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v2, "did not get nordic source"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_0
    iget-object v0, p0, Lc92/g;->G:Lxg3/t;

    invoke-interface {v0}, Lxg3/t;->b()V

    iget-object v0, p0, Lc92/g;->y:Ltd1/b;

    invoke-interface {v0}, Ltd1/b;->i()Lxg3/g;

    move-result-object v0

    invoke-static {}, Lkh3/a;->a()Lkh3/a;

    move-result-object v1

    iget-object v1, v1, Lkh3/a;->b:Leh3/e;

    invoke-virtual {v0, v1}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object v0

    new-instance v1, Lc92/f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lc92/f;-><init>(Lc92/g;I)V

    invoke-virtual {v0, v1}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v0

    iput-object v0, p0, Lc92/g;->G:Lxg3/t;

    return-void
.end method

.method public static synthetic c(Lc92/g;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0, p1}, Lc92/g;->R(Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic d(Lc92/g;Ltd1/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lc92/g;->U(Ltd1/e;)V

    return-void
.end method

.method public static synthetic e(Lc92/g;)V
    .locals 0

    invoke-direct {p0}, Lc92/g;->e0()V

    return-void
.end method

.method private e0()V
    .locals 3

    invoke-direct {p0}, Lc92/g;->M()Lc92/g$e;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lc92/g$e;->I(J)V

    invoke-direct {p0}, Lc92/g;->M()Lc92/g$e;

    move-result-object v0

    invoke-virtual {v0}, Lc92/g$e;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc92/g;->U:Lz82/e;

    invoke-virtual {v0}, Lz82/e;->r()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lc92/g;->M()Lc92/g$e;

    move-result-object v0

    invoke-virtual {v0}, Lc92/g$e;->E()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc92/g;->U:Lz82/e;

    invoke-virtual {v0}, Lz82/e;->s()V

    :cond_1
    :goto_0
    invoke-direct {p0}, Lc92/g;->M()Lc92/g$e;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc92/g$e;->G(Z)V

    invoke-direct {p0}, Lc92/g;->M()Lc92/g$e;

    move-result-object v0

    invoke-virtual {v0, v1}, Lc92/g$e;->H(Z)V

    invoke-direct {p0}, Lc92/g;->M()Lc92/g$e;

    move-result-object v0

    invoke-virtual {v0, v1}, Lc92/g$e;->F(Z)V

    invoke-direct {p0}, Lc92/g;->n0()V

    invoke-direct {p0}, Lc92/g;->t0()V

    return-void
.end method

.method public static synthetic f(Lc92/g;)V
    .locals 0

    invoke-direct {p0}, Lc92/g;->X()V

    return-void
.end method

.method private f0()V
    .locals 3

    iget-object v0, p0, Lc92/g;->z:Ljk0/d;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc92/g;->Q:Lq92/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc83/a;->dispose()V

    :cond_0
    new-instance v0, Lq92/c;

    invoke-direct {v0}, Lq92/c;-><init>()V

    iput-object v0, p0, Lc92/g;->Q:Lq92/c;

    iget-object v1, p0, Lc92/g;->z:Ljk0/d;

    invoke-interface {v1, v0}, Lst0/l;->M(Lc83/a;)V

    iget-object v0, p0, Lc92/g;->Q:Lq92/c;

    invoke-virtual {v0}, Lq92/c;->c()Lxg3/g;

    move-result-object v0

    new-instance v1, Lc92/f;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lc92/f;-><init>(Lc92/g;I)V

    invoke-virtual {v0, v1}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    :cond_1
    return-void
.end method

.method public static synthetic g(Lc92/g;)V
    .locals 0

    invoke-direct {p0}, Lc92/g;->V()V

    return-void
.end method

.method private h0()V
    .locals 4

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    const-string v3, "Cancelling all scheduled Tickle reconnection jobs"

    invoke-interface {v0, v3, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lc92/g;->v()V

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v2, "Removing Connection State observer in BSM"

    new-array v3, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lc92/g;->z:Ljk0/d;

    iget-object v2, p0, Lc92/g;->Q:Lq92/c;

    invoke-interface {v0, v2}, Lst0/l;->f0(Lc83/a;)V

    iget-boolean v0, p0, Lc92/g;->P:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v2, "Setting strap ble device in the whoopStrapServiceBinder"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lc92/g;->O:Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;

    iget-object v1, p0, Lc92/g;->z:Ljk0/d;

    invoke-interface {v1}, Lst0/l;->A()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->h(Landroid/bluetooth/BluetoothDevice;)V

    :cond_0
    return-void
.end method

.method private i0(JJ)V
    .locals 8

    sget-object v0, Ly82/b;->LENIENT_STRAP_SYNC:Ly82/b;

    iget-object v1, p0, Lc92/g;->w:Landroid/content/Context;

    const/16 v2, 0x23f

    iget-object v7, p0, Lc92/g;->S:Lrr2/c;

    move-wide v3, p1

    move-wide v5, p3

    invoke-static/range {v0 .. v7}, Ly82/e;->g(Ly82/b;Landroid/content/Context;IJJLrr2/c;)V

    return-void
.end method

.method public static synthetic j(Lc92/g;Lod1/u$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lc92/g;->S(Lod1/u$a;)V

    return-void
.end method

.method private j0(J)V
    .locals 6

    const-wide/16 v0, 0x7530

    add-long/2addr v0, p1

    iget-object v2, p0, Lc92/g;->N:Ltr2/n;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Scheduling strict sync for "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v4, Lc92/g;->b0:Lorg/joda/time/format/DateTimeFormatter;

    invoke-virtual {v4, p1, p2}, Lorg/joda/time/format/DateTimeFormatter;->print(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " / "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0, v1}, Lorg/joda/time/format/DateTimeFormatter;->print(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v5, v4, [Lqr2/a$a;

    invoke-interface {v2, v3, v5}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v2, p0, Lc92/g;->J:Landroid/app/AlarmManager;

    iget-object v3, p0, Lc92/g;->K:Landroid/app/PendingIntent;

    invoke-virtual {v2, v4, v0, v1, v3}, Landroid/app/AlarmManager;->setAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr p1, v0

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    invoke-direct {p0}, Lc92/g;->E()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lc92/g;->Z:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method private k0()V
    .locals 4

    invoke-direct {p0}, Lc92/g;->E()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lc92/g;->Y:Ljava/lang/Runnable;

    const-wide/16 v2, 0x4e20

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static bridge synthetic l(Lc92/g;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lc92/g;->N:Ltr2/n;

    return-object p0
.end method

.method private l0()V
    .locals 3

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {v0}, Ltr2/n;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "stopAllSyncs()"

    invoke-interface {v0, v2, v1}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    invoke-direct {p0}, Lc92/g;->n0()V

    invoke-direct {p0}, Lc92/g;->m0()V

    invoke-direct {p0}, Lc92/g;->y()V

    invoke-direct {p0}, Lc92/g;->z()V

    return-void
.end method

.method private m0()V
    .locals 0

    return-void
.end method

.method public static bridge synthetic n(Lc92/g;)Ltd1/b;
    .locals 0

    iget-object p0, p0, Lc92/g;->y:Ltd1/b;

    return-object p0
.end method

.method private n0()V
    .locals 4

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    const-string v3, "stopStrictSync()"

    invoke-interface {v0, v3, v2}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lc92/g;->x:Lcom/whoop/service/sync/WhoopSyncService$b;

    invoke-virtual {v0}, Lcom/whoop/service/sync/WhoopSyncService$b;->g()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v2, "Failed to stop strict sync"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic o(Lc92/g;)Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;
    .locals 0

    iget-object p0, p0, Lc92/g;->O:Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;

    return-object p0
.end method

.method public static bridge synthetic p(Lc92/g;Z)V
    .locals 0

    iput-boolean p1, p0, Lc92/g;->P:Z

    return-void
.end method

.method private p0()V
    .locals 3

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {v0}, Ltr2/n;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "tickling a lenientSync"

    invoke-interface {v0, v2, v1}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    invoke-direct {p0}, Lc92/g;->B()Z

    invoke-direct {p0}, Lc92/g;->t0()V

    return-void
.end method

.method public static bridge synthetic r(Lc92/g;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lc92/g;->z:Ljk0/d;

    return-void
.end method

.method private r0()V
    .locals 4

    invoke-direct {p0}, Lc92/g;->O()J

    move-result-wide v0

    const-wide/16 v2, 0x3a98

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-lez v0, :cond_2

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v2, "Trying to sync"

    new-array v3, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lc92/g;->y:Ltd1/b;

    invoke-interface {v0}, Ltd1/b;->A()Ltd1/e;

    move-result-object v0

    invoke-virtual {v0}, Ltd1/e;->isReady()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v2, "Syncing history data from Gen 3 on new connectivity flow"

    new-array v3, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lc92/g;->z:Ljk0/d;

    if-eqz v0, :cond_0

    iget-object v2, p0, Lc92/g;->E:Lca2/f;

    const-string v3, ""

    invoke-interface {v2, v0, v1, v3}, Lca2/f;->a(Ljk0/d;ZLjava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v2, "Sensor HPS: sync skipped, no strap available"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_1
    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Tried to sync but Gen3 nordic status: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lc92/g;->y:Ltd1/b;

    invoke-interface {v3}, Ltd1/b;->A()Ltd1/e;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_2
    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v2, "Tried to sync, but not beyond sync threshold"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private s0(J)V
    .locals 5

    const-wide/32 v0, 0x2932e00

    cmp-long v0, p1, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_1

    invoke-direct {p0}, Lc92/g;->M()Lc92/g$e;

    move-result-object v0

    invoke-virtual {v0}, Lc92/g$e;->C()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {p1}, Ltr2/n;->w()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    const-string p2, "extremely lagged"

    new-array v0, v1, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    invoke-direct {p0}, Lc92/g;->M()Lc92/g$e;

    move-result-object p1

    invoke-virtual {p1, v2}, Lc92/g$e;->F(Z)V

    invoke-direct {p0}, Lc92/g;->M()Lc92/g$e;

    move-result-object p1

    invoke-virtual {p1, v2}, Lc92/g$e;->H(Z)V

    invoke-direct {p0}, Lc92/g;->M()Lc92/g$e;

    move-result-object p1

    invoke-virtual {p1, v2}, Lc92/g$e;->G(Z)V

    return-void

    :cond_1
    const-wide/32 v3, 0xdbba00

    cmp-long v0, p1, v3

    if-lez v0, :cond_3

    invoke-direct {p0}, Lc92/g;->M()Lc92/g$e;

    move-result-object v0

    invoke-virtual {v0}, Lc92/g$e;->E()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {p1}, Ltr2/n;->w()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    const-string p2, "very lagged"

    new-array v0, v1, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_2
    invoke-direct {p0}, Lc92/g;->M()Lc92/g$e;

    move-result-object p1

    invoke-virtual {p1, v2}, Lc92/g$e;->H(Z)V

    invoke-direct {p0}, Lc92/g;->M()Lc92/g$e;

    move-result-object p1

    invoke-virtual {p1, v2}, Lc92/g$e;->G(Z)V

    return-void

    :cond_3
    const-wide/32 v3, 0x6ddd00

    cmp-long p1, p1, v3

    if-lez p1, :cond_5

    invoke-direct {p0}, Lc92/g;->M()Lc92/g$e;

    move-result-object p1

    invoke-virtual {p1}, Lc92/g$e;->D()Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {p1}, Ltr2/n;->w()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    const-string p2, "lagged"

    new-array v0, v1, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_4
    invoke-direct {p0}, Lc92/g;->M()Lc92/g$e;

    move-result-object p1

    invoke-virtual {p1, v2}, Lc92/g$e;->G(Z)V

    :cond_5
    return-void
.end method

.method public static bridge synthetic t(Lc92/g;Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;)V
    .locals 0

    iput-object p1, p0, Lc92/g;->O:Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;

    return-void
.end method

.method private t0()V
    .locals 13

    invoke-direct {p0}, Lc92/g;->Q()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0}, Lc92/g;->I()J

    move-result-wide v2

    invoke-direct {p0}, Lc92/g;->M()Lc92/g$e;

    move-result-object v4

    invoke-virtual {v4}, Lc92/g$e;->B()J

    move-result-wide v4

    sub-long v6, v0, v4

    iget-object v8, p0, Lc92/g;->F:Lod1/u;

    invoke-virtual {v8}, Lod1/u;->e()Z

    move-result v8

    iget-object v9, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {v9}, Ltr2/n;->w()Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_1

    iget-object v9, p0, Lc92/g;->N:Ltr2/n;

    const-string v11, "updateSyncScheduling() "

    invoke-static {v6, v7, v11}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v11

    new-array v12, v10, [Lqr2/a$a;

    invoke-interface {v9, v11, v12}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_1
    const-wide/16 v11, 0x0

    cmp-long v4, v4, v11

    if-eqz v4, :cond_2

    invoke-direct {p0, v6, v7}, Lc92/g;->s0(J)V

    :cond_2
    invoke-direct {p0}, Lc92/g;->H()Lc92/g$c;

    move-result-object v4

    if-eqz v4, :cond_8

    if-eqz v8, :cond_8

    invoke-direct {p0}, Lc92/g;->P()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-direct {p0}, Lc92/g;->y()V

    invoke-direct {p0}, Lc92/g;->z()V

    invoke-direct {p0}, Lc92/g;->N()J

    move-result-wide v4

    add-long/2addr v4, v2

    invoke-direct {p0}, Lc92/g;->K()J

    move-result-wide v8

    const-wide/16 v11, 0x2

    mul-long/2addr v8, v11

    cmp-long v11, v4, v0

    if-gez v11, :cond_4

    cmp-long v6, v6, v8

    if-lez v6, :cond_4

    iget-object v2, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {v2}, Ltr2/n;->w()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lc92/g;->N:Ltr2/n;

    const-string v3, "Strict time passed"

    new-array v4, v10, [Lqr2/a$a;

    invoke-interface {v2, v3, v4}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_3
    invoke-virtual {p0}, Lc92/g;->o0()V

    invoke-direct {p0}, Lc92/g;->N()J

    move-result-wide v2

    add-long/2addr v0, v2

    invoke-direct {p0, v0, v1}, Lc92/g;->j0(J)V

    invoke-direct {p0}, Lc92/g;->L()J

    move-result-wide v0

    invoke-direct {p0}, Lc92/g;->K()J

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Lc92/g;->i0(JJ)V

    return-void

    :cond_4
    invoke-direct {p0, v4, v5}, Lc92/g;->j0(J)V

    invoke-direct {p0}, Lc92/g;->L()J

    move-result-wide v4

    add-long/2addr v4, v2

    invoke-direct {p0}, Lc92/g;->K()J

    move-result-wide v6

    add-long/2addr v2, v6

    cmp-long v6, v4, v0

    if-gez v6, :cond_6

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {v0}, Ltr2/n;->w()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v1, "Lenient start time passed"

    new-array v2, v10, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_5
    invoke-virtual {p0}, Lc92/g;->Y()Z

    invoke-direct {p0}, Lc92/g;->L()J

    move-result-wide v0

    invoke-direct {p0}, Lc92/g;->K()J

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Lc92/g;->i0(JJ)V

    return-void

    :cond_6
    iget-object v6, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {v6}, Ltr2/n;->w()Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v6, p0, Lc92/g;->N:Ltr2/n;

    const-string v7, "Scheduling for future"

    new-array v8, v10, [Lqr2/a$a;

    invoke-interface {v6, v7, v8}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_7
    sub-long/2addr v4, v0

    sub-long/2addr v2, v0

    invoke-direct {p0, v4, v5, v2, v3}, Lc92/g;->i0(JJ)V

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v1, "updateSyncScheduling()"

    new-array v2, v10, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lc92/g;->r0()V

    return-void

    :cond_8
    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {v0}, Ltr2/n;->w()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v1, "updateSyncScheduling() is stopping all syncs"

    new-array v2, v10, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_9
    invoke-direct {p0}, Lc92/g;->l0()V

    return-void
.end method

.method public static bridge synthetic u(Lc92/g;)V
    .locals 0

    invoke-direct {p0}, Lc92/g;->n0()V

    return-void
.end method

.method private v()V
    .locals 3

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {v0}, Ltr2/n;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Cancelling scheduled BLE tickles"

    invoke-interface {v0, v2, v1}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    iget-object v0, p0, Lc92/g;->w:Landroid/content/Context;

    const/16 v1, 0x258

    invoke-static {v0, v1}, Ly82/e;->c(Landroid/content/Context;I)V

    return-void
.end method

.method private w()V
    .locals 2

    invoke-direct {p0}, Lc92/g;->E()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lc92/g;->Y:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method private y()V
    .locals 3

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {v0}, Ltr2/n;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Canceling lenient sync"

    invoke-interface {v0, v2, v1}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    iget-object v0, p0, Lc92/g;->w:Landroid/content/Context;

    const/16 v1, 0x23f

    invoke-static {v0, v1}, Ly82/e;->c(Landroid/content/Context;I)V

    return-void
.end method

.method private z()V
    .locals 3

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {v0}, Ltr2/n;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Canceling strict sync"

    invoke-interface {v0, v2, v1}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    iget-object v0, p0, Lc92/g;->J:Landroid/app/AlarmManager;

    iget-object v1, p0, Lc92/g;->K:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    invoke-direct {p0}, Lc92/g;->E()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lc92/g;->Z:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public C(Ljk0/d;)V
    .locals 3

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "received nordic ble strap"

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iput-object p1, p0, Lc92/g;->z:Ljk0/d;

    invoke-direct {p0}, Lc92/g;->b0()V

    invoke-direct {p0}, Lc92/g;->f0()V

    return-void
.end method

.method public Y()Z
    .locals 1

    invoke-direct {p0}, Lc92/g;->B()Z

    move-result v0

    return v0
.end method

.method public Z()Z
    .locals 3

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {v0}, Ltr2/n;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Lenient Sync From Scheduler"

    invoke-interface {v0, v2, v1}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    invoke-virtual {p0}, Lc92/g;->Y()Z

    move-result v0

    return v0
.end method

.method public a(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    const-string v0, "tickling with isForced set to true"

    invoke-interface {p1, v0, p2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lc92/g;->q0(Z)V

    return-void

    :cond_0
    invoke-direct {p0}, Lc92/g;->E()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lc92/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lc92/c;-><init>(Lc92/g;I)V

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public c0(Landroid/bluetooth/BluetoothDevice;)V
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_1

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {p1}, Ltr2/n;->w()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    const-string v1, "non-whoop device, ignoring"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, v1, v0}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    move v1, v0

    :goto_0
    iget-object v2, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {v2}, Ltr2/n;->w()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lc92/g;->N:Ltr2/n;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Connected: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lc92/g;->I:Lc92/a;

    invoke-virtual {v4, p1}, Lc92/a;->a(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " (isBle="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v0, [Lqr2/a$a;

    invoke-interface {v2, v3, v4}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_3
    if-nez v1, :cond_4

    iget-object v2, p0, Lc92/g;->H:Lc92/g$d;

    invoke-virtual {v2, p1}, Lc92/g$d;->z(Landroid/bluetooth/BluetoothDevice;)V

    :cond_4
    if-eqz v1, :cond_5

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    const-string v1, "tickling from on device connected"

    new-array v2, v0, [Lqr2/a$a;

    invoke-interface {p1, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0, v0}, Lc92/g;->q0(Z)V

    :cond_5
    invoke-direct {p0}, Lc92/g;->t0()V

    return-void
.end method

.method public d0(Landroid/bluetooth/BluetoothDevice;)V
    .locals 4

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {v0}, Ltr2/n;->w()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Disconnected: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lc92/g;->I:Lc92/a;

    invoke-virtual {v3, p1}, Lc92/a;->a(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    if-nez p1, :cond_2

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {p1}, Ltr2/n;->w()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    const-string v0, "non-whoop device, ignoring"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lc92/g;->H:Lc92/g$d;

    invoke-virtual {v0, p1}, Lc92/g$d;->A(Landroid/bluetooth/BluetoothDevice;)V

    invoke-direct {p0}, Lc92/g;->t0()V

    return-void
.end method

.method public g0()V
    .locals 3

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {v0}, Ltr2/n;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Reboot"

    invoke-interface {v0, v2, v1}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    iget-object v0, p0, Lc92/g;->H:Lc92/g$d;

    invoke-virtual {v0}, Lu92/d;->a()V

    invoke-direct {p0}, Lc92/g;->t0()V

    return-void
.end method

.method public o0()V
    .locals 4

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {v0}, Ltr2/n;->w()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v2, "strictSync()"

    new-array v3, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    invoke-direct {p0}, Lc92/g;->m0()V

    invoke-direct {p0}, Lc92/g;->H()Lc92/g$c;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lc92/g;->z()V

    invoke-direct {p0}, Lc92/g;->D()V

    return-void

    :cond_1
    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {v0}, Ltr2/n;->w()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v2, "Starting strict sync but no device connected"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_2
    return-void
.end method

.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lc92/g;->onStart(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public onStart(Landroidx/lifecycle/g0;)V
    .locals 3

    invoke-direct {p0}, Lc92/g;->p0()V

    iget-object p1, p0, Lc92/g;->x:Lcom/whoop/service/sync/WhoopSyncService$b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/service/sync/WhoopSyncService$b;->d()Z

    :cond_0
    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {p1}, Ltr2/n;->w()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    const-string v1, "App Foreground - BLE"

    new-array v2, v0, [Lqr2/a$a;

    invoke-interface {p1, v1, v2}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_1
    iget-object p1, p0, Lc92/g;->z:Ljk0/d;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    const-string v1, "App Foreground - Nordic BLE"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, v1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lc92/g;->z:Ljk0/d;

    invoke-interface {p1}, Lst0/l;->O()V

    :cond_2
    return-void
.end method

.method public q()V
    .locals 3

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Lost whoop strap reference"

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lc92/g;->z:Ljk0/d;

    return-void
.end method

.method public q0(Z)V
    .locals 4

    iget-object v0, p0, Lc92/g;->X:Ljk0/b;

    invoke-virtual {v0, p1}, Ljk0/b;->c(Z)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    invoke-interface {v0}, Ltr2/n;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    const-string v2, "BLE Tickle"

    new-array v3, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    if-nez p1, :cond_1

    const/16 p1, 0x258

    invoke-static {p1}, Ly82/e;->e(I)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    const-string v0, "Throttle connection requests feature flag is on and there is already a pending tickle job scheduled, so returning."

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_1
    iget-object p1, p0, Lc92/g;->z:Ljk0/d;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lst0/l;->getConnectionState()Lst0/f;

    move-result-object p1

    sget-object v0, Lst0/n;->a:Lst0/n;

    if-eq p1, v0, :cond_3

    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    const-string v0, "Tickle nordic ble reconnect"

    new-array v2, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lq92/a;->w:Lq92/a;

    invoke-virtual {p1}, Lq92/a;->k()Lst0/f;

    move-result-object p1

    sget-object v0, Lst0/k;->a:Lst0/k;

    if-eq p1, v0, :cond_2

    iget-object p1, p0, Lc92/g;->z:Ljk0/d;

    invoke-interface {p1}, Lst0/l;->O()V

    invoke-direct {p0}, Lc92/g;->A()V

    return-void

    :cond_2
    iget-object v0, p0, Lc92/g;->N:Ltr2/n;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Received a tickle nordic reconnect when current state is "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". Dropping the connection request!"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_3
    return-void

    :cond_4
    iget-object p1, p0, Lc92/g;->N:Ltr2/n;

    const-string v0, "Dropping connection request tickle due to throttle"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lc92/g;->A()V

    return-void
.end method
