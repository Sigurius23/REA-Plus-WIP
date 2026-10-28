.class public final Lio/sentry/android/core/cache/b;
.super Lio/sentry/cache/c;
.source "SourceFile"


# static fields
.field public static final L:Ljava/util/List;


# instance fields
.field public final K:Lio/sentry/android/core/internal/util/d;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lio/sentry/android/core/cache/a;

    new-instance v1, Li5/c;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, Li5/c;-><init>(I)V

    const-class v2, Lio/sentry/android/core/x;

    const-string v3, "ANR"

    const-string v4, "last_anr_report"

    invoke-direct {v0, v2, v3, v4, v1}, Lio/sentry/android/core/cache/a;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Li5/c;)V

    new-instance v1, Lio/sentry/android/core/cache/a;

    new-instance v2, Li5/c;

    const/16 v3, 0x1a

    invoke-direct {v2, v3}, Li5/c;-><init>(I)V

    const-class v3, Lio/sentry/android/core/t1;

    const-string v4, "Tombstone"

    const-string v5, "last_tombstone_report"

    invoke-direct {v1, v3, v4, v5, v2}, Lio/sentry/android/core/cache/a;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Li5/c;)V

    filled-new-array {v0, v1}, [Lio/sentry/android/core/cache/a;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lio/sentry/android/core/cache/b;->L:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 2

    invoke-virtual {p1}, Lio/sentry/q6;->getCacheDirPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "cacheDirPath must not be null"

    invoke-static {v0, v1}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/sentry/q6;->getMaxCacheItems()I

    move-result v1

    invoke-direct {p0, p1, v0, v1}, Lio/sentry/cache/c;-><init>(Lio/sentry/q6;Ljava/lang/String;I)V

    sget-object p1, Lio/sentry/android/core/internal/util/d;->w:Lio/sentry/android/core/internal/util/d;

    iput-object p1, p0, Lio/sentry/android/core/cache/b;->K:Lio/sentry/android/core/internal/util/d;

    return-void
.end method

.method public static l(Lio/sentry/q6;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;
    .locals 4

    invoke-virtual {p0}, Lio/sentry/q6;->getCacheDirPath()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cache dir path should be set for getting "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "s reported"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    invoke-static {v1}, Lge3/g;->Q(Ljava/io/File;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string v0, "null"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p1

    instance-of v0, p1, Ljava/io/FileNotFoundException;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p0

    sget-object p1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v0, "Last "

    const-string v2, " marker does not exist. %s."

    invoke-static {v0, p2, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, p1, p2, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p0

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v1, "Error reading last "

    const-string v2, " marker"

    invoke-static {v1, p2, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, v0, p2, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final a0(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Z
    .locals 11

    invoke-super {p0, p1, p2}, Lio/sentry/cache/c;->a0(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Z

    move-result p1

    iget-object v0, p0, Lio/sentry/cache/c;->w:Lio/sentry/q6;

    move-object v1, v0

    check-cast v1, Lio/sentry/android/core/SentryAndroidOptions;

    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    move-result-object v2

    iget-object v2, v2, Lio/sentry/android/core/performance/g;->E:Lio/sentry/android/core/performance/h;

    const-string v3, "sentry:typeCheckHint"

    invoke-virtual {p2, v3}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    const-class v5, Lio/sentry/o7;

    invoke-virtual {v5, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v2}, Lio/sentry/android/core/performance/h;->b()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lio/sentry/android/core/cache/b;->K:Lio/sentry/android/core/internal/util/d;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iget-wide v6, v2, Lio/sentry/android/core/performance/h;->y:J

    sub-long/2addr v4, v6

    invoke-virtual {v1}, Lio/sentry/android/core/SentryAndroidOptions;->getStartupCrashDurationThresholdMillis()J

    move-result-wide v6

    cmp-long v2, v4, v6

    if-gtz v2, :cond_1

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v6, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk."

    invoke-interface {v2, v6, v5, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/sentry/q6;->getOutboxPath()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v4, "Outbox path is null, the startup crash marker file will not be written"

    invoke-interface {v0, v6, v4, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v4, Ljava/io/File;

    const-string v5, "startup_crash"

    invoke-direct {v4, v2, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v4, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v5, "Error writing the startup crash marker file to the disk"

    invoke-interface {v0, v4, v5, v2}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    sget-object v0, Lio/sentry/android/core/cache/b;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/android/core/cache/a;

    iget-object v4, v2, Lio/sentry/android/core/cache/a;->a:Ljava/lang/Class;

    new-instance v5, Lic/o;

    invoke-direct {v5, v2, v1, p0}, Lic/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, v3}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2, v3}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    if-eqz v2, :cond_2

    iget-object v4, v5, Lic/o;->w:Ljava/lang/Object;

    check-cast v4, Lio/sentry/android/core/cache/a;

    iget-object v6, v5, Lic/o;->x:Ljava/lang/Object;

    check-cast v6, Lio/sentry/android/core/SentryAndroidOptions;

    iget-object v5, v5, Lic/o;->y:Ljava/lang/Object;

    check-cast v5, Lio/sentry/android/core/cache/b;

    iget-object v7, v4, Lio/sentry/android/core/cache/a;->d:Li5/c;

    iget v7, v7, Li5/c;->w:I

    packed-switch v7, :pswitch_data_0

    check-cast v2, Lio/sentry/android/core/t1;

    iget-wide v7, v2, Lio/sentry/android/core/t1;->z:J

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    goto :goto_2

    :pswitch_0
    check-cast v2, Lio/sentry/android/core/x;

    iget-wide v7, v2, Lio/sentry/android/core/x;->z:J

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_2
    invoke-virtual {v6}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v6

    sget-object v7, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    iget-object v8, v4, Lio/sentry/android/core/cache/a;->b:Ljava/lang/String;

    filled-new-array {v8, v2}, [Ljava/lang/Object;

    move-result-object v9

    const-string v10, "Writing last reported %s marker with timestamp %d"

    invoke-interface {v6, v7, v10, v9}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v4, v4, Lio/sentry/android/core/cache/a;->c:Ljava/lang/String;

    iget-object v5, v5, Lio/sentry/cache/c;->w:Lio/sentry/q6;

    invoke-virtual {v5}, Lio/sentry/q6;->getCacheDirPath()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_3

    invoke-virtual {v5}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    const-string v4, "Cache dir path is null, the "

    const-string v5, " marker will not be written"

    invoke-static {v4, v8, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-interface {v2, v7, v4, v5}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v6, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget-object v6, Lio/sentry/cache/c;->I:Ljava/nio/charset/Charset;

    invoke-virtual {v2, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto/16 :goto_1

    :catchall_1
    move-exception v2

    goto :goto_4

    :catchall_2
    move-exception v2

    :try_start_4
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v4

    :try_start_5
    invoke-virtual {v2, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_4
    invoke-virtual {v5}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    sget-object v5, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v6, "Error writing the "

    const-string v7, " marker to the disk"

    invoke-static {v6, v8, v7}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6, v2}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_1

    :cond_4
    return p1

    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_0
    .end packed-switch
.end method
