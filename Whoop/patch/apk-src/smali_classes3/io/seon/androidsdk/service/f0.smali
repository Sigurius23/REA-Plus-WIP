.class public final synthetic Lio/seon/androidsdk/service/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/seon/androidsdk/service/t0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/seon/androidsdk/service/h0;


# direct methods
.method public synthetic constructor <init>(Lio/seon/androidsdk/service/h0;I)V
    .locals 0

    iput p2, p0, Lio/seon/androidsdk/service/f0;->a:I

    iput-object p1, p0, Lio/seon/androidsdk/service/f0;->b:Lio/seon/androidsdk/service/h0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lio/seon/androidsdk/service/f0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/seon/androidsdk/service/f0;->b:Lio/seon/androidsdk/service/h0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    iget-object v2, v0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    iget-object v3, v0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x1000

    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    iget-object v3, v3, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    if-eqz v3, :cond_2

    array-length v4, v3

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v4, :cond_2

    aget-object v7, v3, v6

    iget-object v8, v0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v7, v8}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v8

    const/4 v9, 0x1

    if-nez v8, :cond_0

    move v8, v9

    goto :goto_1

    :cond_0
    move v8, v5

    :goto_1
    const/16 v10, 0x2e

    invoke-virtual {v7, v10}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v10

    const/4 v11, -0x1

    if-eq v10, v11, :cond_1

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v11

    sub-int/2addr v11, v9

    if-ge v10, v11, :cond_1

    add-int/lit8 v10, v10, 0x1

    invoke-virtual {v7, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    :cond_1
    sget-object v9, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ": "

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    :cond_2
    return-object v1

    :pswitch_0
    iget-object v0, p0, Lio/seon/androidsdk/service/f0;->b:Lio/seon/androidsdk/service/h0;

    new-instance v1, Lcom/iterable/iterableapi/g1;

    iget-object v0, v0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/iterable/iterableapi/g1;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/iterable/iterableapi/g1;->h()V

    sget-object v0, Lio/seon/androidsdk/service/h0;->m:Lio/seon/androidsdk/service/r0;

    new-instance v2, Lio/seon/androidsdk/service/g0;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lio/seon/androidsdk/service/g0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Lio/seon/androidsdk/service/r0;->a(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lio/seon/androidsdk/service/f0;->b:Lio/seon/androidsdk/service/h0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lio/seon/androidsdk/service/h0;->l:Lio/seon/androidsdk/service/r0;

    iget-object v2, v1, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, v1, Lio/seon/androidsdk/service/r0;->b:J

    sub-long/2addr v4, v6

    iget-wide v6, v1, Lio/seon/androidsdk/service/r0;->c:J

    cmp-long v4, v4, v6

    if-gez v4, :cond_3

    iget-wide v4, v1, Lio/seon/androidsdk/service/r0;->b:J

    const-wide/16 v6, -0x1

    cmp-long v4, v4, v6

    if-nez v4, :cond_4

    :cond_3
    invoke-virtual {v0}, Lio/seon/androidsdk/service/h0;->l()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    iput-wide v2, v1, Lio/seon/androidsdk/service/r0;->b:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :cond_4
    iget-object v0, v1, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    iget-object v0, v1, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lio/seon/androidsdk/service/f0;->b:Lio/seon/androidsdk/service/h0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lio/seon/androidsdk/service/h0;->k:Lio/seon/androidsdk/service/r0;

    iget-object v2, v1, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, v1, Lio/seon/androidsdk/service/r0;->b:J

    sub-long/2addr v4, v6

    iget-wide v6, v1, Lio/seon/androidsdk/service/r0;->c:J

    cmp-long v4, v4, v6

    if-gez v4, :cond_5

    iget-wide v4, v1, Lio/seon/androidsdk/service/r0;->b:J

    const-wide/16 v6, -0x1

    cmp-long v4, v4, v6

    if-nez v4, :cond_6

    :cond_5
    invoke-virtual {v0}, Lio/seon/androidsdk/service/h0;->k()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    iput-wide v2, v1, Lio/seon/androidsdk/service/r0;->b:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    :cond_6
    iget-object v0, v1, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    iget-object v0, v1, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lio/seon/androidsdk/service/f0;->b:Lio/seon/androidsdk/service/h0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_3
    iget-object v0, v0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.hardware.usb.action.USB_STATE"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "connected"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v0, Lio/seon/androidsdk/service/OSProbe$OSEnum;->USB_CONNECTED:Lio/seon/androidsdk/service/OSProbe$OSEnum;

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_2

    :cond_7
    sget-object v0, Lio/seon/androidsdk/service/OSProbe$OSEnum;->USB_DISCONNECTED:Lio/seon/androidsdk/service/OSProbe$OSEnum;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_3

    :goto_2
    const-string v1, "USBStateError"

    invoke-static {v1, v0}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v0, Lio/seon/androidsdk/service/OSProbe$OSEnum;->UNKNOWN:Lio/seon/androidsdk/service/OSProbe$OSEnum;

    :goto_3
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
