.class public Lno/nordicsemi/android/support/v18/scanner/ScannerService;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field public final w:Ljava/lang/Object;

.field public x:Ljava/util/HashMap;

.field public y:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScannerService;->w:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final onCreate()V
    .locals 1

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScannerService;->x:Ljava/util/HashMap;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScannerService;->y:Landroid/os/Handler;

    return-void
.end method

.method public final onDestroy()V
    .locals 3

    invoke-static {}, Ltd3/b;->a()Ltd3/b;

    move-result-object v0

    iget-object v1, p0, Lno/nordicsemi/android/support/v18/scanner/ScannerService;->x:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :catch_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltd3/i;

    :try_start_0
    invoke-virtual {v0, v2}, Ltd3/b;->d(Ltd3/i;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScannerService;->x:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScannerService;->x:Ljava/util/HashMap;

    iput-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScannerService;->y:Landroid/os/Handler;

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    const-string v3, "no.nordicsemi.android.support.v18.EXTRA_PENDING_INTENT"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/app/PendingIntent;

    const-string v4, "no.nordicsemi.android.support.v18.REQUEST_CODE"

    const/4 v5, 0x0

    invoke-virtual {v0, v4, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    const-string v6, "no.nordicsemi.android.support.v18.EXTRA_START"

    invoke-virtual {v0, v6, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v5

    if-nez v3, :cond_0

    iget-object v6, v1, Lno/nordicsemi/android/support/v18/scanner/ScannerService;->w:Ljava/lang/Object;

    monitor-enter v6

    :try_start_0
    iget-object v0, v1, Lno/nordicsemi/android/support/v18/scanner/ScannerService;->x:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_5

    invoke-virtual {v1}, Landroid/app/Service;->stopSelf()V

    return v2

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_0
    iget-object v6, v1, Lno/nordicsemi/android/support/v18/scanner/ScannerService;->w:Ljava/lang/Object;

    monitor-enter v6

    :try_start_2
    iget-object v7, v1, Lno/nordicsemi/android/support/v18/scanner/ScannerService;->x:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-eqz v5, :cond_3

    if-nez v7, :cond_3

    const-string v5, "no.nordicsemi.android.support.v18.EXTRA_FILTERS"

    invoke-virtual {v0, v5}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    const-string v6, "no.nordicsemi.android.support.v18.EXTRA_SETTINGS"

    invoke-virtual {v0, v6}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Ltd3/n;

    if-eqz v5, :cond_1

    goto :goto_0

    :cond_1
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :goto_0
    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v6, Ltd3/n;

    const/4 v7, 0x0

    const/4 v8, 0x1

    const-wide/16 v9, 0x0

    const/4 v12, 0x3

    const/16 v14, 0xff

    const-wide/16 v18, 0x2710

    const-wide/16 v22, 0x1f4

    const-wide/16 v24, 0x1194

    move v11, v8

    move v13, v8

    move v15, v8

    move/from16 v16, v8

    move/from16 v17, v8

    move-wide/from16 v20, v18

    invoke-direct/range {v6 .. v25}, Ltd3/n;-><init>(IIJIIZIZZZJJJJ)V

    move-object v0, v6

    :goto_1
    new-instance v6, Ltd3/h;

    invoke-direct {v6, v3, v0, v1}, Ltd3/h;-><init>(Landroid/app/PendingIntent;Ltd3/n;Lno/nordicsemi/android/support/v18/scanner/ScannerService;)V

    iget-object v3, v1, Lno/nordicsemi/android/support/v18/scanner/ScannerService;->w:Ljava/lang/Object;

    monitor-enter v3

    :try_start_3
    iget-object v7, v1, Lno/nordicsemi/android/support/v18/scanner/ScannerService;->x:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v7, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-static {}, Ltd3/b;->a()Ltd3/b;

    move-result-object v3

    iget-object v4, v1, Lno/nordicsemi/android/support/v18/scanner/ScannerService;->y:Landroid/os/Handler;

    invoke-virtual {v3, v5, v0, v6, v4}, Ltd3/b;->c(Ljava/util/List;Ltd3/n;Ltd3/i;Landroid/os/Handler;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    const-string v3, "ScannerService"

    const-string v4, "Starting scanning failed"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_3

    :catchall_1
    move-exception v0

    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0

    :cond_3
    if-nez v5, :cond_5

    if-eqz v7, :cond_5

    iget-object v3, v1, Lno/nordicsemi/android/support/v18/scanner/ScannerService;->w:Ljava/lang/Object;

    monitor-enter v3

    :try_start_6
    iget-object v0, v1, Lno/nordicsemi/android/support/v18/scanner/ScannerService;->x:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltd3/i;

    iget-object v4, v1, Lno/nordicsemi/android/support/v18/scanner/ScannerService;->x:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    move-result v4

    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    :try_start_7
    invoke-static {}, Ltd3/b;->a()Ltd3/b;

    move-result-object v3

    invoke-virtual {v3, v0}, Ltd3/b;->d(Ltd3/i;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    const-string v3, "ScannerService"

    const-string v5, "Stopping scanning failed"

    invoke-static {v3, v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_2
    if-eqz v4, :cond_5

    invoke-virtual {v1}, Landroid/app/Service;->stopSelf()V

    goto :goto_3

    :catchall_2
    move-exception v0

    :try_start_8
    monitor-exit v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    throw v0

    :catchall_3
    move-exception v0

    :try_start_9
    monitor-exit v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    throw v0

    :cond_5
    :goto_3
    return v2
.end method
