.class public abstract Lio/seon/androidsdk/service/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lio/seon/androidsdk/service/j0;->a:Ljava/util/List;

    return-void
.end method

.method public static a()Ljava/util/List;
    .locals 1

    sget-object v0, Lio/seon/androidsdk/service/j0;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public static b(ILjava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    if-lez p0, :cond_1

    const v1, 0xffff

    if-le p0, v1, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    new-instance v1, Ljava/net/Socket;

    invoke-direct {v1}, Ljava/net/Socket;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v2, Ljava/net/InetSocketAddress;

    invoke-direct {v2, p1, p0}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    const/16 p0, 0x7d0

    invoke-virtual {v1, v2, p0}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 p0, 0x1

    :try_start_2
    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return p0

    :catchall_0
    move-exception p0

    :try_start_3
    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :cond_1
    :goto_1
    return v0
.end method

.method public static c()V
    .locals 7

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lio/seon/androidsdk/service/j0;->a:Ljava/util/List;

    invoke-static {}, Lio/seon/androidsdk/service/PortScanHelper$PortScanTarget;->values()[Lio/seon/androidsdk/service/PortScanHelper$PortScanTarget;

    move-result-object v1

    array-length v1, v1

    invoke-static {v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {}, Lio/seon/androidsdk/service/PortScanHelper$PortScanTarget;->values()[Lio/seon/androidsdk/service/PortScanHelper$PortScanTarget;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    new-instance v5, Lio/seon/androidsdk/service/o0;

    const/4 v6, 0x2

    invoke-direct {v5, v4, v6}, Lio/seon/androidsdk/service/o0;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v5}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    if-eqz v0, :cond_2

    goto :goto_2

    :goto_1
    if-eqz v0, :cond_1

    :try_start_1
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_1
    throw v1

    :catch_1
    if-eqz v0, :cond_2

    :goto_2
    :try_start_2
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :cond_2
    return-void
.end method
