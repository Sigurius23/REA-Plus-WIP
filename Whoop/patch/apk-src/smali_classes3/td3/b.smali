.class public abstract Ltd3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ltd3/f;


# direct methods
.method public static declared-synchronized a()Ltd3/b;
    .locals 2

    const-class v0, Ltd3/b;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ltd3/b;->a:Ltd3/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    :try_start_1
    new-instance v1, Ltd3/f;

    invoke-direct {v1}, Ltd3/f;-><init>()V

    sput-object v1, Ltd3/b;->a:Ltd3/f;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method


# virtual methods
.method public final b(Ljava/util/ArrayList;Ltd3/n;Ltd3/i;)V
    .locals 22

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    if-eqz p2, :cond_0

    move-object/from16 v2, p2

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p3

    goto :goto_1

    :cond_0
    new-instance v2, Ltd3/n;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-wide/16 v5, 0x0

    const/4 v8, 0x3

    const/16 v10, 0xff

    const-wide/16 v14, 0x2710

    const-wide/16 v18, 0x1f4

    const-wide/16 v20, 0x1194

    move v7, v4

    move v9, v4

    move v11, v4

    move v12, v4

    move v13, v4

    move-wide/from16 v16, v14

    invoke-direct/range {v2 .. v21}, Ltd3/n;-><init>(IIJIIZIZZZJJJJ)V

    goto :goto_0

    :goto_1
    invoke-virtual {v1, v3, v2, v4, v0}, Ltd3/b;->c(Ljava/util/List;Ltd3/n;Ltd3/i;Landroid/os/Handler;)V

    return-void
.end method

.method public abstract c(Ljava/util/List;Ltd3/n;Ltd3/i;Landroid/os/Handler;)V
.end method

.method public final d(Ltd3/i;)V
    .locals 2

    if-eqz p1, :cond_2

    move-object v0, p0

    check-cast v0, Ltd3/f;

    iget-object v1, v0, Ltd3/f;->b:La8/d;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Ltd3/f;->b:La8/d;

    invoke-virtual {v0, p1}, La8/d;->a(Ltd3/i;)Ltd3/a;

    move-result-object p1

    check-cast p1, Ltd3/d;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p1, Ltd3/a;->e:Z

    iget-object v0, p1, Ltd3/a;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p1, Ltd3/a;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    iget-object v1, p1, Ltd3/a;->l:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    iget-object v1, p1, Ltd3/a;->k:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    iget-object v1, p1, Ltd3/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Ltd3/d;->n:Ltd3/c;

    invoke-virtual {v0, p1}, Landroid/bluetooth/le/BluetoothLeScanner;->stopScan(Landroid/bluetooth/le/ScanCallback;)V

    :cond_1
    :goto_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "callback is null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
