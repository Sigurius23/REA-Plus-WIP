.class public Lno/nordicsemi/android/support/v18/scanner/PendingIntentReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 38

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    if-eqz v0, :cond_19

    if-nez v1, :cond_0

    goto/16 :goto_b

    :cond_0
    const-string v2, "no.nordicsemi.android.support.v18.EXTRA_PENDING_INTENT"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/app/PendingIntent;

    if-nez v2, :cond_1

    goto/16 :goto_b

    :cond_1
    const-string v3, "no.nordicsemi.android.support.v18.EXTRA_FILTERS"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    const-string v4, "no.nordicsemi.android.support.v18.EXTRA_SETTINGS"

    invoke-virtual {v1, v4}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Landroid/bluetooth/le/ScanSettings;

    if-eqz v3, :cond_19

    if-nez v4, :cond_2

    goto/16 :goto_b

    :cond_2
    const-string v5, "no.nordicsemi.android.support.v18.EXTRA_USE_HARDWARE_BATCHING"

    const/4 v6, 0x1

    invoke-virtual {v1, v5, v6}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v17

    const-string v5, "no.nordicsemi.android.support.v18.EXTRA_USE_HARDWARE_FILTERING"

    invoke-virtual {v1, v5, v6}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v16

    const-string v5, "no.nordicsemi.android.support.v18.EXTRA_USE_HARDWARE_CALLBACK_TYPES"

    invoke-virtual {v1, v5, v6}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v18

    const-string v5, "no.nordicsemi.android.support.v18.EXTRA_MATCH_LOST_TIMEOUT"

    const-wide/16 v7, 0x2710

    invoke-virtual {v1, v5, v7, v8}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v19

    const-string v5, "no.nordicsemi.android.support.v18.EXTRA_MATCH_LOST_INTERVAL"

    invoke-virtual {v1, v5, v7, v8}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v21

    const-string v5, "no.nordicsemi.android.support.v18.EXTRA_MATCH_MODE"

    invoke-virtual {v1, v5, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v12

    const-string v5, "no.nordicsemi.android.support.v18.EXTRA_NUM_OF_MATCHES"

    const/4 v7, 0x3

    invoke-virtual {v1, v5, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v13

    invoke-static {}, Ltd3/b;->a()Ltd3/b;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Ltd3/f;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/bluetooth/le/ScanFilter;

    new-instance v11, Ltd3/j;

    invoke-direct {v11}, Ltd3/j;-><init>()V

    invoke-virtual {v10}, Landroid/bluetooth/le/ScanFilter;->getDeviceAddress()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_4

    invoke-static {v14}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid device address "

    invoke-virtual {v1, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    iput-object v14, v11, Ltd3/j;->b:Ljava/lang/String;

    invoke-virtual {v10}, Landroid/bluetooth/le/ScanFilter;->getDeviceName()Ljava/lang/String;

    move-result-object v14

    iput-object v14, v11, Ltd3/j;->a:Ljava/lang/String;

    invoke-virtual {v10}, Landroid/bluetooth/le/ScanFilter;->getServiceUuid()Landroid/os/ParcelUuid;

    move-result-object v14

    invoke-virtual {v10}, Landroid/bluetooth/le/ScanFilter;->getServiceUuidMask()Landroid/os/ParcelUuid;

    move-result-object v15

    if-eqz v15, :cond_6

    if-eqz v14, :cond_5

    goto :goto_2

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "uuid is null while uuidMask is not null!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_2
    iput-object v14, v11, Ltd3/j;->c:Landroid/os/ParcelUuid;

    iput-object v15, v11, Ltd3/j;->d:Landroid/os/ParcelUuid;

    invoke-virtual {v10}, Landroid/bluetooth/le/ScanFilter;->getManufacturerId()I

    move-result v14

    invoke-virtual {v10}, Landroid/bluetooth/le/ScanFilter;->getManufacturerData()[B

    move-result-object v15

    invoke-virtual {v10}, Landroid/bluetooth/le/ScanFilter;->getManufacturerDataMask()[B

    move-result-object v7

    invoke-virtual {v11, v14, v15, v7}, Ltd3/j;->a(I[B[B)V

    invoke-virtual {v10}, Landroid/bluetooth/le/ScanFilter;->getServiceDataUuid()Landroid/os/ParcelUuid;

    move-result-object v7

    if-eqz v7, :cond_7

    invoke-virtual {v10}, Landroid/bluetooth/le/ScanFilter;->getServiceDataUuid()Landroid/os/ParcelUuid;

    move-result-object v7

    invoke-virtual {v10}, Landroid/bluetooth/le/ScanFilter;->getServiceData()[B

    move-result-object v14

    invoke-virtual {v10}, Landroid/bluetooth/le/ScanFilter;->getServiceDataMask()[B

    move-result-object v10

    invoke-virtual {v11, v7, v14, v10}, Ltd3/j;->b(Landroid/os/ParcelUuid;[B[B)V

    :cond_7
    new-instance v24, Ltd3/k;

    iget-object v7, v11, Ltd3/j;->a:Ljava/lang/String;

    iget-object v10, v11, Ltd3/j;->b:Ljava/lang/String;

    iget-object v14, v11, Ltd3/j;->c:Landroid/os/ParcelUuid;

    iget-object v15, v11, Ltd3/j;->d:Landroid/os/ParcelUuid;

    iget-object v6, v11, Ltd3/j;->e:Landroid/os/ParcelUuid;

    move-object/from16 v35, v3

    iget-object v3, v11, Ltd3/j;->f:[B

    move-object/from16 v30, v3

    iget-object v3, v11, Ltd3/j;->g:[B

    move-object/from16 v31, v3

    iget v3, v11, Ltd3/j;->h:I

    move/from16 v32, v3

    iget-object v3, v11, Ltd3/j;->i:[B

    iget-object v11, v11, Ltd3/j;->j:[B

    move-object/from16 v33, v3

    move-object/from16 v29, v6

    move-object/from16 v25, v7

    move-object/from16 v26, v10

    move-object/from16 v34, v11

    move-object/from16 v27, v14

    move-object/from16 v28, v15

    invoke-direct/range {v24 .. v34}, Ltd3/k;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;[B[BI[B[B)V

    move-object/from16 v3, v24

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v3, v35

    const/4 v6, 0x1

    const/4 v7, 0x3

    goto/16 :goto_0

    :cond_8
    invoke-virtual {v4}, Landroid/bluetooth/le/ScanSettings;->getLegacy()Z

    move-result v14

    invoke-virtual {v4}, Landroid/bluetooth/le/ScanSettings;->getPhy()I

    move-result v15

    move-object/from16 v26, v9

    invoke-virtual {v4}, Landroid/bluetooth/le/ScanSettings;->getCallbackType()I

    move-result v9

    const/4 v3, 0x2

    const/4 v6, 0x1

    if-eq v9, v6, :cond_a

    if-eq v9, v3, :cond_a

    const/4 v6, 0x4

    if-ne v9, v6, :cond_9

    goto :goto_3

    :cond_9
    const/4 v6, 0x6

    if-ne v9, v6, :cond_b

    :cond_a
    :goto_3
    move-object v6, v8

    goto :goto_4

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid callback type - "

    invoke-static {v9, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_4
    invoke-virtual {v4}, Landroid/bluetooth/le/ScanSettings;->getScanMode()I

    move-result v8

    const/4 v7, -0x1

    if-lt v8, v7, :cond_18

    if-gt v8, v3, :cond_18

    invoke-virtual {v4}, Landroid/bluetooth/le/ScanSettings;->getReportDelayMillis()J

    move-result-wide v10

    const-wide/16 v29, 0x0

    cmp-long v4, v10, v29

    if-ltz v4, :cond_17

    cmp-long v4, v19, v29

    if-lez v4, :cond_16

    cmp-long v4, v21, v29

    if-lez v4, :cond_16

    const/4 v4, 0x1

    if-lt v12, v4, :cond_15

    if-gt v12, v3, :cond_15

    if-lt v13, v4, :cond_14

    const/4 v7, 0x3

    if-gt v13, v7, :cond_14

    cmp-long v7, v29, v29

    if-nez v7, :cond_e

    cmp-long v7, v29, v29

    if-nez v7, :cond_e

    if-eq v8, v4, :cond_d

    if-eq v8, v3, :cond_c

    const-wide/16 v3, 0x1f4

    const-wide/16 v23, 0x1194

    goto :goto_5

    :cond_c
    move-wide/from16 v3, v29

    move-wide/from16 v23, v3

    goto :goto_5

    :cond_d
    const-wide/16 v3, 0x7d0

    const-wide/16 v23, 0xbb8

    :goto_5
    move-wide/from16 v36, v3

    move-object/from16 v3, v26

    move-wide/from16 v25, v23

    move-wide/from16 v23, v36

    goto :goto_6

    :cond_e
    move-object/from16 v3, v26

    move-wide/from16 v23, v29

    move-wide/from16 v25, v23

    :goto_6
    new-instance v7, Ltd3/n;

    invoke-direct/range {v7 .. v26}, Ltd3/n;-><init>(IIJIIZIZZZJJJJ)V

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v4

    invoke-virtual {v4}, Landroid/bluetooth/BluetoothAdapter;->isOffloadedScanBatchingSupported()Z

    move-result v24

    invoke-virtual {v4}, Landroid/bluetooth/BluetoothAdapter;->isOffloadedFilteringSupported()Z

    move-result v25

    monitor-enter v5

    :try_start_0
    invoke-virtual {v6, v2}, Ltd3/f;->f(Landroid/app/PendingIntent;)Ltd3/e;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v4, :cond_f

    :try_start_1
    new-instance v4, Ltd3/h;

    invoke-direct {v4, v2, v7}, Ltd3/h;-><init>(Landroid/app/PendingIntent;Ltd3/n;)V

    new-instance v23, Ltd3/e;

    move-object/from16 v26, v3

    move-object/from16 v28, v4

    move-object/from16 v27, v7

    invoke-direct/range {v23 .. v28}, Ltd3/e;-><init>(ZZLjava/util/ArrayList;Ltd3/n;Ltd3/h;)V

    move-object/from16 v4, v23

    move-object/from16 v7, v27

    iget-object v3, v6, Ltd3/f;->c:Ljava/util/HashMap;

    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v8, v6, Ltd3/f;->c:Ljava/util/HashMap;

    invoke-virtual {v8, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v3

    goto :goto_7

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0

    :catchall_1
    move-exception v0

    goto :goto_a

    :cond_f
    :goto_7
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    iget-object v2, v4, Ltd3/e;->n:Ltd3/h;

    iput-object v0, v2, Ltd3/h;->b:Landroid/content/Context;

    const-string v0, "android.bluetooth.le.extra.LIST_SCAN_RESULT"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_12

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/bluetooth/le/ScanResult;

    invoke-virtual {v6, v5}, Ltd3/f;->e(Landroid/bluetooth/le/ScanResult;)Ltd3/m;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_10
    iget-wide v5, v7, Ltd3/n;->E:J

    cmp-long v0, v5, v29

    if-lez v0, :cond_11

    invoke-virtual {v4, v3}, Ltd3/a;->b(Ljava/util/ArrayList;)V

    goto :goto_9

    :cond_11
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_13

    const-string v0, "android.bluetooth.le.extra.CALLBACK_TYPE"

    const/4 v6, 0x1

    invoke-virtual {v1, v0, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltd3/m;

    invoke-virtual {v4, v0, v1}, Ltd3/a;->a(ILtd3/m;)V

    goto :goto_9

    :cond_12
    const-string v0, "android.bluetooth.le.extra.ERROR_CODE"

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_13

    iget-object v1, v4, Ltd3/a;->h:Ltd3/i;

    invoke-virtual {v1, v0}, Ltd3/i;->b(I)V

    :cond_13
    :goto_9
    iget-object v0, v4, Ltd3/e;->n:Ltd3/h;

    const/4 v1, 0x0

    iput-object v1, v0, Ltd3/h;->b:Landroid/content/Context;

    return-void

    :catch_0
    :try_start_4
    monitor-exit v5

    goto :goto_b

    :goto_a
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    :cond_14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid numOfMatches "

    invoke-static {v13, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid matchMode "

    invoke-static {v12, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "maxDeviceAgeMillis and taskIntervalMillis must be > 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "reportDelay must be > 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid scan mode "

    invoke-static {v8, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    :goto_b
    return-void
.end method
