.class public final synthetic Lio/seon/androidsdk/service/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/seon/androidsdk/service/t0;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(Lio/seon/androidsdk/service/g;I)V
    .locals 0

    iput p2, p0, Lio/seon/androidsdk/service/m;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic b(Ljava/lang/Object;)Landroid/hardware/biometrics/BiometricManager;
    .locals 0

    check-cast p0, Landroid/hardware/biometrics/BiometricManager;

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lio/seon/androidsdk/service/m;->a:I

    const/4 v1, 0x0

    const-wide/16 v2, -0x1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Lio/seon/androidsdk/service/v0;

    invoke-static {}, Ljava/util/Collections;->reverseOrder()Ljava/util/Comparator;

    move-result-object v4

    invoke-direct {v3, v4}, Lio/seon/androidsdk/service/v0;-><init>(Ljava/util/Comparator;)V

    invoke-virtual {v3}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v3, v5}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    sget-object v7, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ge v1, v6, :cond_0

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_0

    :catch_0
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-le v1, v6, :cond_0

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const-string v3, "h"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "m"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    return-object v0

    :pswitch_0
    :try_start_3
    const-string v0, "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {}, Lio/seon/androidsdk/service/s0;->h()J

    move-result-wide v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_5

    :cond_2
    :try_start_4
    new-instance v1, Ljava/io/RandomAccessFile;

    const-string v4, "r"

    invoke-direct {v1, v0, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    :goto_1
    :try_start_5
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readLine()Ljava/lang/String;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v0, :cond_3

    :try_start_6
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    :catch_2
    :goto_2
    move-wide v0, v2

    goto :goto_5

    :catch_3
    move-exception v0

    goto :goto_4

    :cond_3
    :try_start_7
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    div-long v2, v4, v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_8
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v1

    :try_start_9
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    :goto_4
    :try_start_a
    const-string v1, "CPUsp"

    invoke-static {v1, v0}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    goto :goto_2

    :goto_5
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_1
    const/4 v0, 0x0

    move-object v3, v0

    move v2, v1

    :goto_6
    const/4 v4, 0x2

    if-ge v2, v4, :cond_5

    :try_start_b
    invoke-static {}, Lio/seon/androidsdk/service/h0;->m()Lio/seon/androidsdk/service/a0;

    move-result-object v3

    iget-wide v4, v3, Lio/seon/androidsdk/service/a0;->a:J

    iget-wide v6, v3, Lio/seon/androidsdk/service/a0;->b:J

    cmp-long v6, v4, v6

    if-nez v6, :cond_4

    iget-wide v6, v3, Lio/seon/androidsdk/service/a0;->c:J

    cmp-long v4, v4, v6

    if-nez v4, :cond_4

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_7

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_5
    iget-wide v4, v3, Lio/seon/androidsdk/service/a0;->a:J

    iget-wide v6, v3, Lio/seon/androidsdk/service/a0;->c:J

    sub-long v6, v4, v6

    iget-wide v2, v3, Lio/seon/androidsdk/service/a0;->b:J

    sub-long/2addr v4, v2

    const-wide/16 v2, 0x0

    cmp-long v2, v6, v2

    if-nez v2, :cond_6

    const-wide/16 v2, 0x64

    cmp-long v2, v4, v2

    if-lez v2, :cond_6

    const/4 v1, 0x1

    :cond_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_4

    :catch_4
    :goto_7
    return-object v0

    :pswitch_2
    sget-object v0, Lio/seon/androidsdk/service/b0;->o:Lio/seon/androidsdk/service/r0;

    iget-object v1, v0, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_c
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iget-wide v8, v0, Lio/seon/androidsdk/service/r0;->b:J

    sub-long/2addr v6, v8

    iget-wide v8, v0, Lio/seon/androidsdk/service/r0;->c:J

    cmp-long v1, v6, v8

    if-gez v1, :cond_7

    iget-wide v6, v0, Lio/seon/androidsdk/service/r0;->b:J

    cmp-long v1, v6, v2

    if-nez v1, :cond_8

    :cond_7
    invoke-static {}, Lio/seon/androidsdk/service/b0;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    iput-wide v4, v0, Lio/seon/androidsdk/service/r0;->b:J
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :catchall_2
    :cond_8
    iget-object v1, v0, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    iget-object v0, v0, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    return-object v0

    :pswitch_3
    sget-object v0, Lio/seon/androidsdk/service/n;->n:Lio/seon/androidsdk/service/r0;

    iget-object v1, v0, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_d
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iget-wide v8, v0, Lio/seon/androidsdk/service/r0;->b:J

    sub-long/2addr v6, v8

    iget-wide v8, v0, Lio/seon/androidsdk/service/r0;->c:J

    cmp-long v1, v6, v8

    if-gez v1, :cond_9

    iget-wide v6, v0, Lio/seon/androidsdk/service/r0;->b:J

    cmp-long v1, v6, v2

    if-nez v1, :cond_a

    :cond_9
    invoke-static {}, Lio/seon/androidsdk/service/n;->h()[Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    iput-wide v4, v0, Lio/seon/androidsdk/service/r0;->b:J
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    :catchall_3
    :cond_a
    iget-object v1, v0, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    iget-object v0, v0, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/String;

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
