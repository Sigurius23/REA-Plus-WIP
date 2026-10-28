.class public final Llive/hms/video/sdk/SpeedTest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J&\u0010\u0008\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\tJ+\u0010\u0011\u001a\u00020\u000e2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Llive/hms/video/sdk/SpeedTest;",
        "",
        "<init>",
        "()V",
        "Llive/hms/video/signal/init/NetworkHealth;",
        "networkHealth",
        "Ll83/k;",
        "",
        "getTimeToDownload",
        "(Llive/hms/video/signal/init/NetworkHealth;Lq83/d;)Ljava/lang/Object;",
        "",
        "getDownloadSpeedInKilobytesPerSecond",
        "kilobytesPerSecond",
        "Ljava/util/SortedMap;",
        "",
        "Llive/hms/video/signal/init/RangeLimits;",
        "scoreMap",
        "getSpeedTestScore",
        "(Ljava/lang/Double;Ljava/util/SortedMap;)I",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getTimeToDownload(Llive/hms/video/sdk/SpeedTest;Llive/hms/video/signal/init/NetworkHealth;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Llive/hms/video/sdk/SpeedTest;->getTimeToDownload(Llive/hms/video/signal/init/NetworkHealth;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getTimeToDownload(Llive/hms/video/signal/init/NetworkHealth;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/init/NetworkHealth;",
            "Lq83/d<",
            "-",
            "Ll83/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p2, Lud3/n0;

    invoke-direct {p2}, Lud3/n0;-><init>()V

    invoke-virtual {p1}, Llive/hms/video/signal/init/NetworkHealth;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lud3/n0;->f(Ljava/lang/String;)V

    const-string v0, "GET"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Lud3/n0;->e(Ljava/lang/String;Lud3/v0;)V

    new-instance v0, Lud3/o0;

    invoke-direct {v0, p2}, Lud3/o0;-><init>(Lud3/n0;)V

    const-wide/16 v2, 0x0

    :try_start_0
    sget-object p2, Llive/hms/video/factories/OkHttpFactory;->INSTANCE:Llive/hms/video/factories/OkHttpFactory;

    invoke-virtual {p2}, Llive/hms/video/factories/OkHttpFactory;->getClient()Lud3/l0;

    move-result-object p2

    invoke-virtual {p2, v0}, Lud3/l0;->b(Lud3/o0;)Lzd3/o;

    move-result-object p2

    invoke-virtual {p2}, Lzd3/o;->e()Lud3/x0;

    move-result-object p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    :try_start_1
    iget-boolean v0, p2, Lud3/x0;->Q:Z

    if-eqz v0, :cond_4

    iget-object v0, p2, Lud3/x0;->G:Lud3/a1;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lud3/a1;->d1()Lne3/j;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    new-instance v4, Lne3/h;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    new-instance v7, Ljava/lang/Long;

    invoke-direct {v7, v5, v6}, Ljava/lang/Long;-><init>(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_1
    :try_start_2
    invoke-interface {v0}, Lne3/j;->o()Z

    move-result v5

    if-nez v5, :cond_2

    const-wide/16 v5, 0x2000

    invoke-interface {v0, v4, v5, v6}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide v5

    add-long/2addr v2, v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    sub-long/2addr v5, v8

    invoke-virtual {p1}, Llive/hms/video/signal/init/NetworkHealth;->getTimeout()J

    move-result-wide v8

    cmp-long v5, v5, v8

    if-lez v5, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_2
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    new-instance p1, Ljava/lang/Long;

    invoke-direct {p1, v4, v5}, Ljava/lang/Long;-><init>(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :goto_1
    move-object v7, v1

    goto :goto_5

    :catchall_1
    move-exception p1

    goto :goto_1

    :cond_3
    :goto_2
    move-object p1, v1

    move-object v7, p1

    :goto_3
    :try_start_3
    invoke-virtual {p2}, Lud3/x0;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v7, :cond_5

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long/2addr p1, v0

    new-instance v1, Ljava/lang/Long;

    invoke-direct {v1, p1, p2}, Ljava/lang/Long;-><init>(J)V

    goto :goto_7

    :catchall_2
    move-exception p2

    :goto_4
    move-object v1, v7

    goto :goto_8

    :cond_4
    :try_start_4
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Unexpected code"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_5
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v0

    :try_start_6
    invoke-static {p2, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :catchall_4
    move-exception p2

    move-object p1, v1

    goto :goto_4

    :catch_0
    move-object p1, v1

    goto :goto_6

    :catchall_5
    move-exception p2

    move-object p1, v1

    goto :goto_8

    :catch_1
    move-object p1, v1

    move-object v7, p1

    :catch_2
    :goto_6
    :try_start_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    new-instance p2, Ljava/lang/Long;

    invoke-direct {p2, v4, v5}, Ljava/lang/Long;-><init>(J)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    if-eqz v7, :cond_5

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long/2addr p1, v0

    new-instance v1, Ljava/lang/Long;

    invoke-direct {v1, p1, p2}, Ljava/lang/Long;-><init>(J)V

    :cond_5
    :goto_7
    new-instance p1, Ll83/k;

    new-instance p2, Ljava/lang/Long;

    invoke-direct {p2, v2, v3}, Ljava/lang/Long;-><init>(J)V

    invoke-direct {p1, v1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :goto_8
    if-eqz v1, :cond_6

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long/2addr v2, v0

    new-instance p1, Ljava/lang/Long;

    invoke-direct {p1, v2, v3}, Ljava/lang/Long;-><init>(J)V

    :cond_6
    throw p2
.end method


# virtual methods
.method public final getDownloadSpeedInKilobytesPerSecond(Llive/hms/video/signal/init/NetworkHealth;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/init/NetworkHealth;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Double;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Llive/hms/video/sdk/SpeedTest$getDownloadSpeedInKilobytesPerSecond$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Llive/hms/video/sdk/SpeedTest$getDownloadSpeedInKilobytesPerSecond$1;

    iget v1, v0, Llive/hms/video/sdk/SpeedTest$getDownloadSpeedInKilobytesPerSecond$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/sdk/SpeedTest$getDownloadSpeedInKilobytesPerSecond$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Llive/hms/video/sdk/SpeedTest$getDownloadSpeedInKilobytesPerSecond$1;

    invoke-direct {v0, p0, p2}, Llive/hms/video/sdk/SpeedTest$getDownloadSpeedInKilobytesPerSecond$1;-><init>(Llive/hms/video/sdk/SpeedTest;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Llive/hms/video/sdk/SpeedTest$getDownloadSpeedInKilobytesPerSecond$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llive/hms/video/sdk/SpeedTest$getDownloadSpeedInKilobytesPerSecond$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Llive/hms/video/sdk/SpeedTest$getDownloadSpeedInKilobytesPerSecond$1;->label:I

    invoke-direct {p0, p1, v0}, Llive/hms/video/sdk/SpeedTest;->getTimeToDownload(Llive/hms/video/signal/init/NetworkHealth;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ll83/k;

    iget-object p1, p2, Ll83/k;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Long;

    iget-object p2, p2, Ll83/k;->x:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    if-eqz p1, :cond_5

    const-wide/16 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long p2, v4, v2

    if-nez p2, :cond_4

    const-wide/16 p1, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    :goto_2
    long-to-double v0, v0

    const-wide/high16 v2, 0x4090000000000000L    # 1024.0

    div-double/2addr v0, v2

    long-to-double p1, p1

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr p1, v2

    div-double/2addr v0, p1

    new-instance p1, Ljava/lang/Double;

    invoke-direct {p1, v0, v1}, Ljava/lang/Double;-><init>(D)V

    return-object p1

    :cond_5
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getSpeedTestScore(Ljava/lang/Double;Ljava/util/SortedMap;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Double;",
            "Ljava/util/SortedMap<",
            "Ljava/lang/Integer;",
            "Llive/hms/video/signal/init/RangeLimits;",
            ">;)I"
        }
    .end annotation

    const-string v0, "scoreMap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    invoke-interface {p2}, Ljava/util/SortedMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    const-string v0, "<get-entries>(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Map$Entry;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/signal/init/RangeLimits;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {v1}, Llive/hms/video/signal/init/RangeLimits;->getLow()J

    move-result-wide v4

    long-to-double v4, v4

    cmpl-double v2, v2, v4

    if-ltz v2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {v1}, Llive/hms/video/signal/init/RangeLimits;->getHigh()J

    move-result-wide v4

    long-to-double v4, v4

    cmpg-double v2, v2, v4

    if-ltz v2, :cond_3

    invoke-virtual {v1}, Llive/hms/video/signal/init/RangeLimits;->getHigh()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :cond_3
    :goto_0
    check-cast v0, Ljava/util/Map$Entry;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method
