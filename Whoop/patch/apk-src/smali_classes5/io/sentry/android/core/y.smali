.class public final Lio/sentry/android/core/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/android/core/h0;


# instance fields
.field public final a:Lio/sentry/android/core/SentryAndroidOptions;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/y;->a:Lio/sentry/android/core/SentryAndroidOptions;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Long;
    .locals 3

    const-string v0, "last_anr_report"

    const-string v1, "ANR"

    iget-object v2, p0, Lio/sentry/android/core/y;->a:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-static {v2, v0, v1}, Lio/sentry/android/core/cache/b;->l(Lio/sentry/q6;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/y;->a:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isReportHistoricalAnrs()Z

    move-result v0

    return v0
.end method

.method public final c(Landroid/app/ApplicationExitInfo;Z)Lgm/r;
    .locals 17

    move-object/from16 v1, p0

    iget-object v2, v1, Lio/sentry/android/core/y;->a:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual/range {p1 .. p1}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    move-result-wide v7

    invoke-virtual/range {p1 .. p1}, Landroid/app/ApplicationExitInfo;->getImportance()I

    move-result v0

    const/16 v3, 0x64

    const/4 v4, 0x0

    if-eq v0, v3, :cond_0

    const/4 v0, 0x1

    move v10, v0

    goto :goto_0

    :cond_0
    move v10, v4

    :goto_0
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Landroid/app/ApplicationExitInfo;->getTraceInputStream()Ljava/io/InputStream;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_1

    :try_start_1
    new-instance v0, La00/g;

    sget-object v4, Lio/sentry/android/core/z;->NO_DUMP:Lio/sentry/android/core/z;

    invoke-direct {v0, v4}, La00/g;-><init>(Lio/sentry/android/core/z;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v3, :cond_5

    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_a

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :catchall_1
    move-exception v0

    move-object v4, v0

    goto/16 :goto_7

    :cond_1
    :try_start_3
    new-instance v5, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v5}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/16 v0, 0x400

    :try_start_4
    new-array v6, v0, [B

    :goto_1
    invoke-virtual {v3, v6, v4, v0}, Ljava/io/InputStream;->read([BII)I

    move-result v9

    const/4 v11, -0x1

    if-eq v9, v11, :cond_2

    invoke-virtual {v5, v6, v4, v9}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v4, v0

    goto/16 :goto_5

    :cond_2
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    new-instance v3, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-direct {v4, v13}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v0, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v3, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :try_start_8
    invoke-static {v3}, Lcom/google/android/material/datepicker/n;->u(Ljava/io/BufferedReader;)Lcom/google/android/material/datepicker/n;

    move-result-object v0

    new-instance v4, Lio/sentry/android/core/internal/threaddump/b;

    invoke-direct {v4, v2, v10}, Lio/sentry/android/core/internal/threaddump/b;-><init>(Lio/sentry/q6;Z)V

    invoke-virtual {v4, v0}, Lio/sentry/android/core/internal/threaddump/b;->f(Lcom/google/android/material/datepicker/n;)V

    invoke-virtual {v4}, Lio/sentry/android/core/internal/threaddump/b;->d()Ljava/util/ArrayList;

    move-result-object v14

    invoke-virtual {v4}, Lio/sentry/android/core/internal/threaddump/b;->b()Ljava/util/ArrayList;

    move-result-object v15

    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, La00/g;

    sget-object v4, Lio/sentry/android/core/z;->NO_DUMP:Lio/sentry/android/core/z;

    invoke-direct {v0, v4}, La00/g;-><init>(Lio/sentry/android/core/z;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :try_start_9
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_a

    :catchall_3
    move-exception v0

    goto :goto_4

    :catchall_4
    move-exception v0

    move-object v4, v0

    goto :goto_2

    :cond_3
    :try_start_a
    new-instance v11, La00/g;

    sget-object v12, Lio/sentry/android/core/z;->DUMP:Lio/sentry/android/core/z;

    const/16 v16, 0xe

    invoke-direct/range {v11 .. v16}, La00/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :try_start_b
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    move-object v0, v11

    goto :goto_a

    :goto_2
    :try_start_c
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    goto :goto_3

    :catchall_5
    move-exception v0

    :try_start_d
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v4
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    :goto_4
    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    sget-object v4, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v5, "Failed to parse ANR thread dump"

    invoke-interface {v3, v4, v5, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, La00/g;

    sget-object v3, Lio/sentry/android/core/z;->ERROR:Lio/sentry/android/core/z;

    const/16 v4, 0xe

    invoke-direct {v0, v3, v13, v4}, La00/g;-><init>(Ljava/lang/Object;Ljava/io/Serializable;I)V

    goto :goto_a

    :goto_5
    :try_start_e
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    goto :goto_6

    :catchall_6
    move-exception v0

    :try_start_f
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw v4
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    :goto_7
    if-eqz v3, :cond_4

    :try_start_10
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    goto :goto_8

    :catchall_7
    move-exception v0

    :try_start_11
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_8
    throw v4
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    :goto_9
    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    sget-object v4, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v5, "Failed to read ANR thread dump"

    invoke-interface {v3, v4, v5, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, La00/g;

    sget-object v3, Lio/sentry/android/core/z;->NO_DUMP:Lio/sentry/android/core/z;

    invoke-direct {v0, v3}, La00/g;-><init>(Lio/sentry/android/core/z;)V

    :cond_5
    :goto_a
    iget-object v3, v0, La00/g;->x:Ljava/lang/Object;

    move-object v11, v3

    check-cast v11, Lio/sentry/android/core/z;

    sget-object v3, Lio/sentry/android/core/z;->NO_DUMP:Lio/sentry/android/core/z;

    if-ne v11, v3, :cond_6

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    invoke-virtual/range {p1 .. p1}, Landroid/app/ApplicationExitInfo;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "Not reporting ANR event as there was no thread dump for the ANR %s"

    invoke-interface {v0, v2, v4, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    return-object v0

    :cond_6
    new-instance v3, Lio/sentry/android/core/x;

    invoke-virtual {v2}, Lio/sentry/q6;->getFlushTimeoutMillis()J

    move-result-wide v4

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v6

    move/from16 v9, p2

    invoke-direct/range {v3 .. v10}, Lio/sentry/android/core/x;-><init>(JLio/sentry/v0;JZZ)V

    invoke-static {v3}, Lhg3/i;->C(Ljava/lang/Object;)Lio/sentry/g0;

    move-result-object v4

    new-instance v5, Lio/sentry/e5;

    invoke-direct {v5}, Lio/sentry/e5;-><init>()V

    sget-object v6, Lio/sentry/android/core/z;->ERROR:Lio/sentry/android/core/z;

    if-ne v11, v6, :cond_7

    new-instance v6, Lio/sentry/protocol/o;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    const-string v9, "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub."

    iput-object v9, v6, Lio/sentry/protocol/o;->w:Ljava/lang/String;

    iput-object v6, v5, Lio/sentry/e5;->Q:Lio/sentry/protocol/o;

    goto :goto_b

    :cond_7
    sget-object v6, Lio/sentry/android/core/z;->DUMP:Lio/sentry/android/core/z;

    if-ne v11, v6, :cond_8

    iget-object v6, v0, La00/g;->z:Ljava/lang/Object;

    check-cast v6, Ljava/util/ArrayList;

    new-instance v9, Laa3/u0;

    invoke-direct {v9, v6}, Laa3/u0;-><init>(Ljava/util/List;)V

    iput-object v9, v5, Lio/sentry/e5;->S:Laa3/u0;

    iget-object v6, v0, La00/g;->E:Ljava/lang/Object;

    check-cast v6, Ljava/util/ArrayList;

    if-eqz v6, :cond_8

    new-instance v9, Lio/sentry/protocol/d;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v10, v9, Lio/sentry/protocol/d;->x:Ljava/util/List;

    iput-object v9, v5, Lio/sentry/r4;->N:Lio/sentry/protocol/d;

    :cond_8
    :goto_b
    sget-object v6, Lio/sentry/n5;->FATAL:Lio/sentry/n5;

    iput-object v6, v5, Lio/sentry/e5;->U:Lio/sentry/n5;

    invoke-static {v7, v8}, Ljc/x;->P(J)Ljava/util/Date;

    move-result-object v6

    iput-object v6, v5, Lio/sentry/e5;->P:Ljava/util/Date;

    invoke-virtual {v2}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachAnrThreadDump()Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v0, v0, La00/g;->y:Ljava/lang/Object;

    check-cast v0, [B

    if-eqz v0, :cond_9

    invoke-static {v0}, Lio/sentry/a;->b([B)Lio/sentry/a;

    move-result-object v0

    iput-object v0, v4, Lio/sentry/g0;->f:Lio/sentry/a;

    :cond_9
    new-instance v0, Lgm/r;

    const/4 v2, 0x7

    invoke-direct {v0, v5, v4, v3, v2}, Lgm/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object v0
.end method

.method public final d()I
    .locals 1

    const/4 v0, 0x6

    return v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    const-string v0, "ANR"

    return-object v0
.end method
