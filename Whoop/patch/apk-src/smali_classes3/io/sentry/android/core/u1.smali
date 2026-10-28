.class public final Lio/sentry/android/core/u1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/android/core/h0;


# instance fields
.field public final a:Lio/sentry/android/core/SentryAndroidOptions;

.field public final b:Lf1/p1;

.field public final c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/sentry/android/core/u1;->a:Lio/sentry/android/core/SentryAndroidOptions;

    new-instance v0, Lf1/p1;

    invoke-direct {v0, p2}, Lf1/p1;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    iput-object v0, p0, Lio/sentry/android/core/u1;->b:Lf1/p1;

    iput-object p1, p0, Lio/sentry/android/core/u1;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Long;
    .locals 3

    const-string v0, "last_tombstone_report"

    const-string v1, "Tombstone"

    iget-object v2, p0, Lio/sentry/android/core/u1;->a:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-static {v2, v0, v1}, Lio/sentry/android/core/cache/b;->l(Lio/sentry/q6;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/u1;->a:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isReportHistoricalTombstones()Z

    move-result v0

    return v0
.end method

.method public final c(Landroid/app/ApplicationExitInfo;Z)Lgm/r;
    .locals 12

    iget-object v1, p0, Lio/sentry/android/core/u1;->a:Lio/sentry/android/core/SentryAndroidOptions;

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p1}, Landroid/app/ApplicationExitInfo;->getTraceInputStream()Ljava/io/InputStream;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v3, "No tombstone InputStream available for ApplicationExitInfo from %s"

    sget-object v4, Ljava/time/format/DateTimeFormatter;->ISO_INSTANT:Ljava/time/format/DateTimeFormatter;

    invoke-virtual {p1}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v0, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2

    :catchall_0
    move-exception v0

    move-object p2, v0

    goto :goto_2

    :cond_0
    new-instance v3, Lio/sentry/android/core/internal/tombstone/b;

    invoke-virtual {v1}, Lio/sentry/q6;->getInAppIncludes()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1}, Lio/sentry/q6;->getInAppExcludes()Ljava/util/List;

    move-result-object v5

    iget-object v6, p0, Lio/sentry/android/core/u1;->c:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v6

    iget-object v6, v6, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    invoke-direct {v3, v0, v4, v5, v6}, Lio/sentry/android/core/internal/tombstone/b;-><init>(Ljava/io/InputStream;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v3}, Lio/sentry/android/core/internal/tombstone/b;->b()Lio/sentry/e5;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    invoke-virtual {v3}, Lio/sentry/android/core/internal/tombstone/b;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {p1}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljc/x;->P(J)Ljava/util/Date;

    move-result-object p1

    iput-object p1, v4, Lio/sentry/e5;->P:Ljava/util/Date;

    new-instance v5, Lio/sentry/android/core/t1;

    invoke-virtual {v1}, Lio/sentry/q6;->getFlushTimeoutMillis()J

    move-result-wide v6

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v8

    move v11, p2

    invoke-direct/range {v5 .. v11}, Lio/sentry/android/core/t1;-><init>(JLio/sentry/v0;JZ)V

    invoke-static {v5}, Lhg3/i;->C(Ljava/lang/Object;)Lio/sentry/g0;

    move-result-object p1

    :try_start_3
    invoke-virtual {p0, v9, v10, v4, p1}, Lio/sentry/android/core/u1;->e(JLio/sentry/e5;Lio/sentry/g0;)Lio/sentry/e5;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz p2, :cond_1

    move-object v4, p2

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object p2, v0

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string v2, "Failed to merge native event with tombstone, continuing without merge: %s"

    invoke-interface {v0, v1, v2, p2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_0
    new-instance p2, Lgm/r;

    const/4 v0, 0x7

    invoke-direct {p2, v4, p1, v5, v0}, Lgm/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object p2

    :catchall_2
    move-exception v0

    move-object p2, v0

    :try_start_4
    invoke-virtual {v3}, Lio/sentry/android/core/internal/tombstone/b;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v0

    :try_start_5
    invoke-virtual {p2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_2
    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    sget-object v3, Ljava/time/format/DateTimeFormatter;->ISO_INSTANT:Ljava/time/format/DateTimeFormatter;

    invoke-virtual {p1}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "Failed to parse tombstone from %s: %s"

    invoke-interface {v0, v1, p2, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2
.end method

.method public final d()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public final e(JLio/sentry/e5;Lio/sentry/g0;)Lio/sentry/e5;
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    iget-object v3, v1, Lio/sentry/android/core/u1;->b:Lf1/p1;

    iget-object v0, v3, Lf1/p1;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/ArrayList;

    iget-object v0, v3, Lf1/p1;->y:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lio/sentry/android/core/SentryAndroidOptions;

    iget-boolean v0, v3, Lf1/p1;->x:Z

    const/4 v7, 0x0

    if-eqz v0, :cond_0

    :goto_0
    const/16 v16, 0x0

    goto/16 :goto_f

    :cond_0
    const/4 v8, 0x1

    iput-boolean v8, v3, Lf1/p1;->x:Z

    invoke-virtual {v5}, Lio/sentry/q6;->getOutboxPath()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {v5}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v8, "Outbox path is null, skipping native event collection."

    new-array v9, v7, [Ljava/lang/Object;

    invoke-interface {v0, v3, v8, v9}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance v9, Ljava/io/File;

    invoke-direct {v9, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v9

    if-nez v9, :cond_2

    invoke-virtual {v5}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    sget-object v8, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v9, "Outbox path is not a directory or an I/O error occurred: %s"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v8, v9, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    array-length v0, v9

    if-nez v0, :cond_3

    invoke-virtual {v5}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v8, "No envelope files found in outbox."

    new-array v9, v7, [Ljava/lang/Object;

    invoke-interface {v0, v3, v8, v9}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-virtual {v5}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v10, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    array-length v11, v9

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v11

    const-string v12, "Scanning %d files in outbox for native events."

    invoke-interface {v0, v10, v12, v11}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    array-length v10, v9

    move v11, v7

    :goto_1
    if-ge v11, v10, :cond_15

    aget-object v12, v9, v11

    invoke-virtual {v12}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-virtual {v12}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_13

    const-string v13, "session"

    invoke-virtual {v0, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_13

    const-string v13, "previous_session"

    invoke-virtual {v0, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_13

    const-string v13, "startup_crash"

    invoke-virtual {v0, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_13

    :try_start_0
    new-instance v13, Ljava/io/BufferedInputStream;

    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v12}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v13, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    move v0, v7

    :cond_4
    :try_start_1
    invoke-virtual {v13}, Ljava/io/InputStream;->read()I

    move-result v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    const/16 v15, 0xa

    const/16 v16, 0x0

    const/4 v6, -0x1

    if-eq v14, v6, :cond_5

    add-int/lit8 v0, v0, 0x1

    if-ne v14, v15, :cond_4

    goto :goto_2

    :cond_5
    if-lez v0, :cond_6

    goto :goto_2

    :cond_6
    move v0, v6

    :goto_2
    if-gez v0, :cond_7

    :try_start_2
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move/from16 v18, v8

    move-object/from16 v17, v9

    :goto_3
    move-object/from16 v0, v16

    goto/16 :goto_d

    :catchall_0
    move-exception v0

    move/from16 v18, v8

    move-object/from16 v17, v9

    goto/16 :goto_c

    :cond_7
    move v14, v8

    move-object/from16 v17, v9

    int-to-long v8, v0

    :goto_4
    const-wide/32 v18, 0xc800000

    cmp-long v0, v8, v18

    if-gez v0, :cond_11

    :try_start_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move/from16 v18, v14

    :goto_5
    :try_start_4
    invoke-virtual {v13}, Ljava/io/InputStream;->read()I

    move-result v14

    if-eq v14, v6, :cond_9

    if-ne v14, v15, :cond_8

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    :cond_8
    int-to-char v14, v14

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v14

    if-lez v14, :cond_a

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    :cond_a
    move-object/from16 v0, v16

    :goto_6
    if-eqz v0, :cond_12

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_b

    goto :goto_9

    :cond_b
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v14

    add-int/lit8 v14, v14, 0x1

    move-wide/from16 v20, v8

    int-to-long v7, v14

    add-long v8, v20, v7

    invoke-virtual {v3, v0}, Lf1/p1;->r(Ljava/lang/String;)Lai/j;

    move-result-object v0

    if-nez v0, :cond_c

    goto :goto_9

    :cond_c
    iget v7, v0, Lai/j;->w:I

    const-string v14, "event"

    iget-object v0, v0, Lai/j;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {v3, v13, v7, v12}, Lf1/p1;->i(Ljava/io/BufferedInputStream;ILjava/io/File;)Lio/sentry/android/core/x0;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-eqz v0, :cond_d

    :try_start_5
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_d

    :catchall_1
    move-exception v0

    goto :goto_c

    :cond_d
    move-wide/from16 v20, v8

    goto :goto_8

    :catchall_2
    move-exception v0

    :goto_7
    move-object v6, v0

    goto :goto_a

    :cond_e
    move-wide/from16 v20, v8

    int-to-long v8, v7

    :try_start_6
    invoke-static {v13, v8, v9}, Lf1/p1;->w(Ljava/io/BufferedInputStream;J)V

    :goto_8
    int-to-long v7, v7

    add-long v8, v20, v7

    invoke-virtual {v13}, Ljava/io/InputStream;->read()I

    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-ne v0, v6, :cond_f

    goto :goto_9

    :cond_f
    const-wide/16 v20, 0x1

    add-long v8, v8, v20

    if-eq v0, v15, :cond_10

    goto :goto_9

    :cond_10
    move/from16 v14, v18

    const/4 v7, 0x0

    goto/16 :goto_4

    :catchall_3
    move-exception v0

    move/from16 v18, v14

    goto :goto_7

    :cond_11
    move/from16 v18, v14

    :cond_12
    :goto_9
    :try_start_7
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto/16 :goto_3

    :catchall_4
    move-exception v0

    move/from16 v18, v8

    move-object/from16 v17, v9

    const/16 v16, 0x0

    goto :goto_7

    :goto_a
    :try_start_8
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    goto :goto_b

    :catchall_5
    move-exception v0

    :try_start_9
    invoke-virtual {v6, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_b
    throw v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :catchall_6
    move-exception v0

    move/from16 v18, v8

    move-object/from16 v17, v9

    const/16 v16, 0x0

    :goto_c
    invoke-virtual {v5}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v6

    sget-object v7, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    const-string v9, "Error extracting metadata from envelope file: %s"

    invoke-interface {v6, v7, v0, v9, v8}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_3

    :goto_d
    if-eqz v0, :cond_14

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v6

    sget-object v7, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-virtual {v12}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    iget-wide v12, v0, Lio/sentry/android/core/x0;->b:J

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    filled-new-array {v8, v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v8, "Found native event in outbox: %s (timestamp: %d)"

    invoke-interface {v6, v7, v8, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_e

    :cond_13
    move/from16 v18, v8

    move-object/from16 v17, v9

    const/16 v16, 0x0

    :cond_14
    :goto_e
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v9, v17

    move/from16 v8, v18

    const/4 v7, 0x0

    goto/16 :goto_1

    :cond_15
    const/16 v16, 0x0

    invoke-virtual {v5}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const-string v7, "Collected %d native events from outbox."

    invoke-interface {v0, v3, v7, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_f
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/android/core/x0;

    iget-wide v6, v3, Lio/sentry/android/core/x0;->b:J

    sub-long v6, p1, v6

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(J)J

    move-result-wide v6

    const-wide/16 v8, 0x1388

    cmp-long v8, v6, v8

    if-gtz v8, :cond_16

    invoke-virtual {v5}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v8, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const-string v7, "Matched native event by timestamp (diff: %d ms)"

    invoke-interface {v0, v8, v7, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v3, v3, Lio/sentry/android/core/x0;->a:Ljava/io/File;

    :try_start_a
    new-instance v4, Ljava/io/BufferedInputStream;

    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v4, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    :try_start_b
    invoke-virtual {v5}, Lio/sentry/q6;->getEnvelopeReader()Lio/sentry/s0;

    move-result-object v0

    invoke-interface {v0, v4}, Lio/sentry/s0;->a(Ljava/io/BufferedInputStream;)Lcom/google/crypto/tink/internal/l0;

    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    if-nez v0, :cond_18

    :cond_17
    :try_start_c
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    goto/16 :goto_16

    :catchall_7
    move-exception v0

    goto/16 :goto_15

    :cond_18
    :try_start_d
    iget-object v6, v0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_17

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/sentry/c5;

    sget-object v8, Lio/sentry/m5;->Event:Lio/sentry/m5;

    iget-object v9, v7, Lio/sentry/c5;->a:Lio/sentry/d5;

    iget-object v9, v9, Lio/sentry/d5;->E:Lio/sentry/m5;

    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_19

    goto :goto_10

    :cond_19
    new-instance v8, Ljava/io/BufferedReader;

    new-instance v9, Ljava/io/InputStreamReader;

    new-instance v10, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v7}, Lio/sentry/c5;->f()[B

    move-result-object v7

    invoke-direct {v10, v7}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v9, v10, v7}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v8, v9}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    :try_start_e
    invoke-virtual {v5}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v7

    const-class v9, Lio/sentry/e5;

    invoke-interface {v7, v8, v9}, Lio/sentry/j1;->e(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/sentry/e5;

    if-eqz v7, :cond_1a

    const-string v9, "native"

    iget-object v10, v7, Lio/sentry/r4;->H:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1a

    new-instance v6, Lgm/r;

    const/16 v9, 0x8

    invoke-direct {v6, v7, v3, v0, v9}, Lgm/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    :try_start_f
    invoke-virtual {v8}, Ljava/io/Reader;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    :try_start_10
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    goto :goto_17

    :catchall_8
    move-exception v0

    move-object v6, v0

    goto :goto_13

    :catchall_9
    move-exception v0

    move-object v6, v0

    goto :goto_11

    :cond_1a
    :try_start_11
    invoke-virtual {v8}, Ljava/io/Reader;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    goto :goto_10

    :goto_11
    :try_start_12
    invoke-virtual {v8}, Ljava/io/Reader;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    goto :goto_12

    :catchall_a
    move-exception v0

    :try_start_13
    invoke-virtual {v6, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_12
    throw v6
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    :goto_13
    :try_start_14
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_b

    goto :goto_14

    :catchall_b
    move-exception v0

    :try_start_15
    invoke-virtual {v6, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_14
    throw v6
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_7

    :goto_15
    invoke-virtual {v5}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    sget-object v6, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v7, "Error loading envelope file: %s"

    invoke-interface {v4, v6, v0, v7, v3}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1b
    :goto_16
    move-object/from16 v6, v16

    :goto_17
    iget-object v3, v1, Lio/sentry/android/core/u1;->a:Lio/sentry/android/core/SentryAndroidOptions;

    if-nez v6, :cond_1c

    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v3, "No matching native event found for tombstone."

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v16

    :cond_1c
    iget-object v0, v6, Lgm/r;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/io/File;

    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v7, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    const-string v9, "Found matching native event for tombstone, removing from outbox: %s"

    invoke-interface {v0, v7, v9, v8}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_16
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_24

    invoke-virtual {v5}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    const-string v8, "Deleted native event file from outbox: %s"

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v0, v7, v8, v9}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_e

    iget-object v0, v6, Lgm/r;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lio/sentry/e5;

    invoke-virtual {v2}, Lio/sentry/e5;->d()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v5, v2, Lio/sentry/r4;->N:Lio/sentry/protocol/d;

    invoke-virtual {v2}, Lio/sentry/e5;->e()Ljava/util/ArrayList;

    move-result-object v7

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_20

    if-eqz v5, :cond_20

    if-eqz v7, :cond_20

    const/4 v8, 0x0

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/sentry/protocol/u;

    iget-object v8, v8, Lio/sentry/protocol/u;->F:Lio/sentry/protocol/n;

    if-eqz v8, :cond_1d

    sget-object v9, Lio/sentry/android/core/internal/tombstone/a;->TOMBSTONE_MERGED:Lio/sentry/android/core/internal/tombstone/a;

    invoke-virtual {v9}, Lio/sentry/android/core/internal/tombstone/a;->getValue()Ljava/lang/String;

    move-result-object v9

    iput-object v9, v8, Lio/sentry/protocol/n;->w:Ljava/lang/String;

    :cond_1d
    iget-object v8, v4, Lio/sentry/e5;->Q:Lio/sentry/protocol/o;

    if-eqz v8, :cond_1e

    iget-object v8, v8, Lio/sentry/protocol/o;->x:Ljava/lang/String;

    if-eqz v8, :cond_1e

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_1f

    :cond_1e
    iget-object v2, v2, Lio/sentry/e5;->Q:Lio/sentry/protocol/o;

    iput-object v2, v4, Lio/sentry/e5;->Q:Lio/sentry/protocol/o;

    :cond_1f
    new-instance v2, Laa3/u0;

    invoke-direct {v2, v0}, Laa3/u0;-><init>(Ljava/util/List;)V

    iput-object v2, v4, Lio/sentry/e5;->T:Laa3/u0;

    iput-object v5, v4, Lio/sentry/r4;->N:Lio/sentry/protocol/d;

    new-instance v0, Laa3/u0;

    invoke-direct {v0, v7}, Laa3/u0;-><init>(Ljava/util/List;)V

    iput-object v0, v4, Lio/sentry/e5;->S:Laa3/u0;

    :cond_20
    iget-object v0, v6, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/internal/l0;

    iget-object v0, v0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_23

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/c5;

    :try_start_17
    iget-object v5, v0, Lio/sentry/c5;->a:Lio/sentry/d5;

    iget-object v6, v5, Lio/sentry/d5;->y:Ljava/lang/String;

    iget-object v5, v5, Lio/sentry/d5;->E:Lio/sentry/m5;

    sget-object v7, Lio/sentry/m5;->Attachment:Lio/sentry/m5;

    if-ne v5, v7, :cond_21

    if-nez v6, :cond_22

    :cond_21
    move-object/from16 v6, p4

    goto :goto_18

    :cond_22
    new-instance v5, Lio/sentry/a;

    invoke-virtual {v0}, Lio/sentry/c5;->f()[B

    move-result-object v7

    iget-object v0, v0, Lio/sentry/c5;->a:Lio/sentry/d5;

    iget-object v8, v0, Lio/sentry/d5;->w:Ljava/lang/String;

    iget-object v0, v0, Lio/sentry/d5;->H:Ljava/lang/String;

    invoke-direct {v5, v6, v8, v0, v7}, Lio/sentry/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_d

    move-object/from16 v6, p4

    :try_start_18
    iget-object v0, v6, Lio/sentry/g0;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_c

    goto :goto_18

    :catchall_c
    move-exception v0

    goto :goto_19

    :catchall_d
    move-exception v0

    move-object/from16 v6, p4

    :goto_19
    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v5

    sget-object v7, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v8, "Failed to process envelope item: %s"

    invoke-interface {v5, v7, v8, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_18

    :cond_23
    return-object v4

    :catchall_e
    move-exception v0

    goto :goto_1a

    :cond_24
    :try_start_19
    invoke-virtual {v5}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v3, "Failed to delete native event file: %s"

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v0, v2, v3, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_e

    goto :goto_1b

    :goto_1a
    invoke-virtual {v5}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "Error deleting native event file: %s"

    invoke-interface {v2, v3, v0, v5, v4}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1b
    return-object v16
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    const-string v0, "Tombstone"

    return-object v0
.end method
