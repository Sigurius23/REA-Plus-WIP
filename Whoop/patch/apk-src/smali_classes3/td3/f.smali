.class public final Ltd3/f;
.super Ltd3/b;
.source "SourceFile"


# instance fields
.field public final b:La8/d;

.field public final c:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La8/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, La8/d;-><init>(I)V

    iput-object v0, p0, Ltd3/f;->b:La8/d;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltd3/f;->c:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final c(Ljava/util/List;Ltd3/n;Ltd3/i;Landroid/os/Handler;)V
    .locals 10

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isOffloadedScanBatchingSupported()Z

    move-result v3

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isOffloadedFilteringSupported()Z

    move-result v4

    iget-object v9, p0, Ltd3/f;->b:La8/d;

    monitor-enter v9

    :try_start_0
    iget-object v2, p0, Ltd3/f;->b:La8/d;

    iget-object v2, v2, La8/d;->a:Ljava/util/HashSet;

    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ltd3/a;

    iget-object v5, v5, Ltd3/a;->h:Ltd3/i;

    if-ne v5, p3, :cond_1

    goto :goto_0

    :cond_1
    instance-of v6, v5, Ltd3/o;

    if-eqz v6, :cond_0

    check-cast v5, Ltd3/o;

    iget-object v5, v5, Ltd3/o;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ltd3/i;

    if-ne v5, p3, :cond_0

    :goto_0
    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_a

    new-instance v7, Ltd3/o;

    invoke-direct {v7, p3}, Ltd3/o;-><init>(Ltd3/i;)V

    new-instance v2, Ltd3/d;

    move-object v5, p1

    move-object v6, p2

    move-object v8, p4

    invoke-direct/range {v2 .. v8}, Ltd3/d;-><init>(ZZLjava/util/List;Ltd3/n;Ltd3/o;Landroid/os/Handler;)V

    iget-object p1, p0, Ltd3/f;->b:La8/d;

    iget-object p1, p1, La8/d;->a:Ljava/util/HashSet;

    invoke-virtual {p1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance p1, Landroid/bluetooth/le/ScanSettings$Builder;

    invoke-direct {p1}, Landroid/bluetooth/le/ScanSettings$Builder;-><init>()V

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isOffloadedScanBatchingSupported()Z

    move-result p2

    if-eqz p2, :cond_3

    iget-boolean p2, v6, Ltd3/n;->I:Z

    if-eqz p2, :cond_3

    iget-wide p2, v6, Ltd3/n;->E:J

    invoke-virtual {p1, p2, p3}, Landroid/bluetooth/le/ScanSettings$Builder;->setReportDelay(J)Landroid/bluetooth/le/ScanSettings$Builder;

    :cond_3
    iget-boolean p2, v6, Ltd3/n;->J:Z

    if-eqz p2, :cond_4

    iget p2, v6, Ltd3/n;->z:I

    invoke-virtual {p1, p2}, Landroid/bluetooth/le/ScanSettings$Builder;->setCallbackType(I)Landroid/bluetooth/le/ScanSettings$Builder;

    move-result-object p2

    iget p3, v6, Ltd3/n;->F:I

    invoke-virtual {p2, p3}, Landroid/bluetooth/le/ScanSettings$Builder;->setMatchMode(I)Landroid/bluetooth/le/ScanSettings$Builder;

    move-result-object p2

    iget p3, v6, Ltd3/n;->G:I

    invoke-virtual {p2, p3}, Landroid/bluetooth/le/ScanSettings$Builder;->setNumOfMatches(I)Landroid/bluetooth/le/ScanSettings$Builder;

    :cond_4
    iget p2, v6, Ltd3/n;->y:I

    invoke-virtual {p1, p2}, Landroid/bluetooth/le/ScanSettings$Builder;->setScanMode(I)Landroid/bluetooth/le/ScanSettings$Builder;

    move-result-object p2

    iget-boolean p3, v6, Ltd3/n;->M:Z

    invoke-virtual {p2, p3}, Landroid/bluetooth/le/ScanSettings$Builder;->setLegacy(Z)Landroid/bluetooth/le/ScanSettings$Builder;

    move-result-object p2

    iget p3, v6, Ltd3/n;->N:I

    invoke-virtual {p2, p3}, Landroid/bluetooth/le/ScanSettings$Builder;->setPhy(I)Landroid/bluetooth/le/ScanSettings$Builder;

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanSettings$Builder;->build()Landroid/bluetooth/le/ScanSettings;

    move-result-object p1

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_8

    if-eqz v4, :cond_8

    iget-boolean p2, v6, Ltd3/n;->H:Z

    if-eqz p2, :cond_8

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_9

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ltd3/k;

    new-instance v0, Landroid/bluetooth/le/ScanFilter$Builder;

    invoke-direct {v0}, Landroid/bluetooth/le/ScanFilter$Builder;-><init>()V

    iget-object v3, p4, Ltd3/k;->y:Landroid/os/ParcelUuid;

    iget-object v4, p4, Ltd3/k;->z:Landroid/os/ParcelUuid;

    invoke-virtual {v0, v3, v4}, Landroid/bluetooth/le/ScanFilter$Builder;->setServiceUuid(Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;)Landroid/bluetooth/le/ScanFilter$Builder;

    move-result-object v3

    iget v4, p4, Ltd3/k;->H:I

    iget-object v5, p4, Ltd3/k;->I:[B

    iget-object v6, p4, Ltd3/k;->J:[B

    invoke-virtual {v3, v4, v5, v6}, Landroid/bluetooth/le/ScanFilter$Builder;->setManufacturerData(I[B[B)Landroid/bluetooth/le/ScanFilter$Builder;

    iget-object v3, p4, Ltd3/k;->x:Ljava/lang/String;

    if-eqz v3, :cond_5

    invoke-virtual {v0, v3}, Landroid/bluetooth/le/ScanFilter$Builder;->setDeviceAddress(Ljava/lang/String;)Landroid/bluetooth/le/ScanFilter$Builder;

    :cond_5
    iget-object v3, p4, Ltd3/k;->w:Ljava/lang/String;

    if-eqz v3, :cond_6

    invoke-virtual {v0, v3}, Landroid/bluetooth/le/ScanFilter$Builder;->setDeviceName(Ljava/lang/String;)Landroid/bluetooth/le/ScanFilter$Builder;

    :cond_6
    iget-object v3, p4, Ltd3/k;->E:Landroid/os/ParcelUuid;

    if-eqz v3, :cond_7

    iget-object v4, p4, Ltd3/k;->F:[B

    iget-object p4, p4, Ltd3/k;->G:[B

    invoke-virtual {v0, v3, v4, p4}, Landroid/bluetooth/le/ScanFilter$Builder;->setServiceData(Landroid/os/ParcelUuid;[B[B)Landroid/bluetooth/le/ScanFilter$Builder;

    :cond_7
    invoke-virtual {v0}, Landroid/bluetooth/le/ScanFilter$Builder;->build()Landroid/bluetooth/le/ScanFilter;

    move-result-object p4

    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    const/4 p2, 0x0

    :cond_9
    iget-object p3, v2, Ltd3/d;->n:Ltd3/c;

    invoke-virtual {v1, p2, p1, p3}, Landroid/bluetooth/le/BluetoothLeScanner;->startScan(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/bluetooth/le/ScanCallback;)V

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_a
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "scanner already started with given callback"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_3
    monitor-exit v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "BT le scanner not available"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Landroid/bluetooth/le/ScanResult;)Ltd3/m;
    .locals 14

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getDataStatus()I

    move-result v0

    shl-int/lit8 v0, v0, 0x5

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->isLegacy()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x10

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->isConnectable()Z

    move-result v1

    or-int v4, v0, v1

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/le/ScanRecord;->getBytes()[B

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    new-instance v2, Ltd3/m;

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getPrimaryPhy()I

    move-result v5

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getSecondaryPhy()I

    move-result v6

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getAdvertisingSid()I

    move-result v7

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getTxPower()I

    move-result v8

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getRssi()I

    move-result v9

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getPeriodicAdvertisingInterval()I

    move-result v10

    invoke-static {v0}, Ltd3/l;->a([B)Ltd3/l;

    move-result-object v11

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getTimestampNanos()J

    move-result-wide v12

    invoke-direct/range {v2 .. v13}, Ltd3/m;-><init>(Landroid/bluetooth/BluetoothDevice;IIIIIIILtd3/l;J)V

    return-object v2
.end method

.method public final f(Landroid/app/PendingIntent;)Ltd3/e;
    .locals 2

    iget-object v0, p0, Ltd3/f;->c:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltd3/f;->c:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ltd3/f;->c:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltd3/e;

    if-eqz p1, :cond_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Scanning has been stopped"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 p1, 0x0

    monitor-exit v0

    return-object p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
