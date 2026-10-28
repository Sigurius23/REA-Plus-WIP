.class public final synthetic Lio/seon/androidsdk/service/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lio/seon/androidsdk/service/o0;->w:I

    iput-object p1, p0, Lio/seon/androidsdk/service/o0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget v0, p0, Lio/seon/androidsdk/service/o0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/seon/androidsdk/service/o0;->x:Ljava/lang/Object;

    check-cast v0, Lio/seon/androidsdk/service/PortScanHelper$PortScanTarget;

    const/16 v1, 0x457

    :try_start_0
    invoke-static {v1}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    iget-object v1, v0, Lio/seon/androidsdk/service/PortScanHelper$PortScanTarget;->proto:Lio/seon/androidsdk/service/PortScanHelper$Protocol;

    sget-object v2, Lio/seon/androidsdk/service/PortScanHelper$Protocol;->TCP:Lio/seon/androidsdk/service/PortScanHelper$Protocol;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v2, :cond_3

    iget-object v1, v0, Lio/seon/androidsdk/service/PortScanHelper$PortScanTarget;->ports:[Ljava/lang/Integer;

    array-length v2, v1

    move v5, v4

    move v6, v5

    :goto_0
    if-ge v5, v2, :cond_2

    aget-object v7, v1, v5

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-nez v6, :cond_1

    iget-object v6, v0, Lio/seon/androidsdk/service/PortScanHelper$PortScanTarget;->address:Ljava/lang/String;

    invoke-static {v7, v6}, Lio/seon/androidsdk/service/j0;->b(ILjava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    move v6, v4

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_8

    :cond_1
    :goto_1
    move v6, v3

    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    move v4, v6

    goto :goto_7

    :cond_3
    iget-object v1, v0, Lio/seon/androidsdk/service/PortScanHelper$PortScanTarget;->address:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v0, Lio/seon/androidsdk/service/PortScanHelper$PortScanTarget;->proto:Lio/seon/androidsdk/service/PortScanHelper$Protocol;

    sget-object v2, Lio/seon/androidsdk/service/PortScanHelper$Protocol;->UDP:Lio/seon/androidsdk/service/PortScanHelper$Protocol;

    if-ne v1, v2, :cond_7

    iget-object v1, v0, Lio/seon/androidsdk/service/PortScanHelper$PortScanTarget;->ports:[Ljava/lang/Integer;

    array-length v2, v1

    move v5, v4

    move v6, v5

    :goto_3
    if-ge v5, v2, :cond_2

    aget-object v7, v1, v5

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v6, :cond_6

    if-lez v7, :cond_5

    const v6, 0xffff

    if-le v7, v6, :cond_4

    goto :goto_5

    :cond_4
    :try_start_1
    new-instance v6, Ljava/net/DatagramSocket;

    invoke-direct {v6, v7}, Ljava/net/DatagramSocket;-><init>(I)V
    :try_end_1
    .catch Ljava/net/SocketException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v6}, Ljava/net/DatagramSocket;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v6}, Ljava/net/DatagramSocket;->close()V
    :try_end_3
    .catch Ljava/net/SocketException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_5

    :catchall_1
    move-exception v7

    :try_start_4
    invoke-virtual {v6}, Ljava/net/DatagramSocket;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v6

    :try_start_5
    invoke-virtual {v7, v6}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v7
    :try_end_5
    .catch Ljava/net/SocketException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catch_0
    :cond_5
    :goto_5
    move v6, v4

    goto :goto_6

    :catch_1
    :cond_6
    move v6, v3

    :goto_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_7
    :goto_7
    if-eqz v4, :cond_8

    :try_start_6
    sget-object v1, Lio/seon/androidsdk/service/j0;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_9

    :goto_8
    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    throw v0

    :catch_2
    :cond_8
    :goto_9
    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/seon/androidsdk/service/o0;->x:Ljava/lang/Object;

    check-cast v0, Lio/seon/androidsdk/service/p0;

    invoke-virtual {v0}, Lio/seon/androidsdk/service/p0;->g()V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/seon/androidsdk/service/o0;->x:Ljava/lang/Object;

    check-cast v0, Lio/seon/androidsdk/service/p0;

    :try_start_7
    iget-object v1, v0, Lio/seon/androidsdk/service/p0;->f:Lio/sentry/hints/j;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lio/seon/androidsdk/service/p0;->g()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_a

    :catch_3
    invoke-virtual {v0}, Lio/seon/androidsdk/service/p0;->g()V

    :goto_a
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
