.class public final synthetic Lbc/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/maps/SnapshotCompleteCallback;
.implements Ld4/j;
.implements Lo23/a;
.implements Lax/b;
.implements Lio/sentry/a4;
.implements Lio/sentry/b4;
.implements Lx8/d;
.implements Lom/a;
.implements Lnm/g;
.implements Lo9/n;
.implements Lud3/z;
.implements Lcq/d;
.implements Lcq/h;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lbc/i;->w:I

    iput-object p1, p0, Lbc/i;->x:Ljava/lang/Object;

    iput-object p2, p0, Lbc/i;->y:Ljava/lang/Object;

    iput-object p3, p0, Lbc/i;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Runnable;Lbc/w;Ljava/lang/Runnable;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lbc/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbc/i;->x:Ljava/lang/Object;

    iput-object p2, p0, Lbc/i;->z:Ljava/lang/Object;

    iput-object p3, p0, Lbc/i;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lio/sentry/b7;)V
    .locals 7

    iget-object v0, p0, Lbc/i;->x:Ljava/lang/Object;

    check-cast v0, Lcd3/g;

    iget-object v1, p0, Lbc/i;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/e5;

    iget-object v2, p0, Lbc/i;->z:Ljava/lang/Object;

    check-cast v2, Lio/sentry/g0;

    const/4 v3, 0x0

    if-eqz p1, :cond_6

    invoke-virtual {v1}, Lio/sentry/e5;->f()Lio/sentry/protocol/u;

    move-result-object v0

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Lio/sentry/a7;->Crashed:Lio/sentry/a7;

    goto :goto_0

    :cond_0
    move-object v0, v4

    :goto_0
    sget-object v5, Lio/sentry/a7;->Crashed:Lio/sentry/a7;

    if-eq v5, v0, :cond_1

    invoke-virtual {v1}, Lio/sentry/e5;->g()Z

    move-result v5

    if-eqz v5, :cond_2

    :cond_1
    const/4 v3, 0x1

    :cond_2
    iget-object v5, v1, Lio/sentry/r4;->z:Lio/sentry/protocol/q;

    if-eqz v5, :cond_3

    iget-object v5, v5, Lio/sentry/protocol/q;->F:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v5, :cond_3

    const-string v6, "user-agent"

    invoke-virtual {v5, v6}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v1, v1, Lio/sentry/r4;->z:Lio/sentry/protocol/q;

    iget-object v1, v1, Lio/sentry/protocol/q;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_1

    :cond_3
    move-object v1, v4

    :goto_1
    const-string v5, "sentry:typeCheckHint"

    invoke-virtual {v2, v5}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Lio/sentry/hints/a;

    if-eqz v5, :cond_4

    check-cast v2, Lio/sentry/hints/a;

    invoke-interface {v2}, Lio/sentry/hints/a;->d()Ljava/lang/String;

    move-result-object v4

    sget-object v0, Lio/sentry/a7;->Abnormal:Lio/sentry/a7;

    :cond_4
    invoke-virtual {p1, v0, v1, v3, v4}, Lio/sentry/b7;->d(Lio/sentry/a7;Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p1, Lio/sentry/b7;->G:Lio/sentry/a7;

    sget-object v1, Lio/sentry/a7;->Ok:Lio/sentry/a7;

    if-eq v0, v1, :cond_5

    invoke-static {}, Ljc/x;->O()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/sentry/b7;->b(Ljava/util/Date;)V

    :cond_5
    return-void

    :cond_6
    iget-object p1, v0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast p1, Lio/sentry/q6;

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v1, "Session is null on scope.withSession"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lbc/i;->x:Ljava/lang/Object;

    check-cast v0, Lg9/d;

    iget-object v1, p0, Lbc/i;->y:Ljava/lang/Object;

    check-cast v1, Ll9/c0;

    iget-object v2, p0, Lbc/i;->z:Ljava/lang/Object;

    check-cast v2, Ll9/y;

    check-cast p1, Ll9/i0;

    iget v0, v0, Lg9/d;->a:I

    invoke-interface {p1, v0, v1, v2}, Ll9/i0;->e(ILl9/c0;Ll9/y;)V

    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v1, p0

    iget v0, v1, Lbc/i;->w:I

    const-string v2, "bytes"

    const-string v4, "PRAGMA page_size"

    const-string v5, "PRAGMA page_count"

    const/4 v7, 0x5

    const/4 v8, 0x3

    sget-object v9, Ljm/c;->z:Ljm/c;

    const/4 v10, 0x2

    const/4 v11, 0x4

    const/4 v12, 0x1

    iget-object v13, v1, Lbc/i;->z:Ljava/lang/Object;

    iget-object v14, v1, Lbc/i;->y:Ljava/lang/Object;

    iget-object v15, v1, Lbc/i;->x:Ljava/lang/Object;

    const/4 v3, 0x0

    check-cast v15, Lnm/i;

    packed-switch v0, :pswitch_data_0

    check-cast v14, Ljava/util/HashMap;

    check-cast v13, La00/g;

    iget-object v0, v13, La00/g;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    move-object/from16 v2, p1

    check-cast v2, Landroid/database/Cursor;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v16

    if-eqz v16, :cond_8

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v12}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    sget-object v16, Ljm/c;->x:Ljm/c;

    if-nez v3, :cond_0

    :goto_1
    move-object/from16 v3, v16

    goto :goto_2

    :cond_0
    if-ne v3, v12, :cond_1

    sget-object v16, Ljm/c;->y:Ljm/c;

    goto :goto_1

    :cond_1
    if-ne v3, v10, :cond_2

    move-object v3, v9

    goto :goto_2

    :cond_2
    if-ne v3, v8, :cond_3

    sget-object v16, Ljm/c;->E:Ljm/c;

    goto :goto_1

    :cond_3
    if-ne v3, v11, :cond_4

    sget-object v16, Ljm/c;->F:Ljm/c;

    goto :goto_1

    :cond_4
    if-ne v3, v7, :cond_5

    sget-object v16, Ljm/c;->G:Ljm/c;

    goto :goto_1

    :cond_5
    const/4 v7, 0x6

    if-ne v3, v7, :cond_6

    sget-object v16, Ljm/c;->H:Ljm/c;

    goto :goto_1

    :cond_6
    const-string v7, "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v8, "SQLiteEventStore"

    invoke-static {v3, v8, v7}, Ldp/d;->y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :goto_2
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    invoke-virtual {v14, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_7

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v14, v6, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    invoke-virtual {v14, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    new-instance v10, Ljm/d;

    invoke-direct {v10, v7, v8, v3}, Ljm/d;-><init>(JLjm/c;)V

    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/4 v7, 0x5

    const/4 v8, 0x3

    const/4 v10, 0x2

    goto :goto_0

    :cond_8
    invoke-virtual {v14}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    sget v6, Ljm/e;->c:I

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    new-instance v7, Ljm/e;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v7, v6, v3}, Ljm/e;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    iget-object v2, v15, Lnm/i;->x:Lpm/a;

    invoke-interface {v2}, Lpm/a;->getTime()J

    move-result-wide v2

    invoke-virtual {v15}, Lnm/i;->b()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    :try_start_0
    const-string v7, "SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1"

    const/4 v8, 0x0

    new-array v9, v8, [Ljava/lang/String;

    invoke-virtual {v6, v7, v9}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    invoke-interface {v7, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    new-instance v10, Ljm/g;

    invoke-direct {v10, v8, v9, v2, v3}, Ljm/g;-><init>(JJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    iput-object v10, v13, La00/g;->x:Ljava/lang/Object;

    invoke-virtual {v15}, Lnm/i;->b()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v2

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v2

    invoke-virtual {v15}, Lnm/i;->b()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v4

    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v4

    mul-long/2addr v4, v2

    sget-object v2, Lnm/a;->f:Lnm/a;

    iget-wide v2, v2, Lnm/a;->a:J

    new-instance v6, Ljm/f;

    invoke-direct {v6, v4, v5, v2, v3}, Ljm/f;-><init>(JJ)V

    new-instance v2, Ljm/b;

    invoke-direct {v2, v6}, Ljm/b;-><init>(Ljm/f;)V

    iput-object v2, v13, La00/g;->z:Ljava/lang/Object;

    iget-object v2, v15, Lnm/i;->E:Lk83/a;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iput-object v2, v13, La00/g;->E:Ljava/lang/Object;

    new-instance v2, Ljm/a;

    iget-object v3, v13, La00/g;->x:Ljava/lang/Object;

    check-cast v3, Ljm/g;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iget-object v4, v13, La00/g;->z:Ljava/lang/Object;

    check-cast v4, Ljm/b;

    iget-object v5, v13, La00/g;->E:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-direct {v2, v3, v0, v4, v5}, Ljm/a;-><init>(Ljm/g;Ljava/util/List;Ljm/b;Ljava/lang/String;)V

    return-object v2

    :catchall_0
    move-exception v0

    goto :goto_4

    :catchall_1
    move-exception v0

    :try_start_3
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_4
    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    :pswitch_0
    check-cast v14, Lgm/h;

    iget-object v0, v14, Lgm/h;->c:Lgm/m;

    iget-object v3, v14, Lgm/h;->a:Ljava/lang/String;

    check-cast v13, Lgm/i;

    move-object/from16 v6, p1

    check-cast v6, Landroid/database/sqlite/SQLiteDatabase;

    const/16 v17, 0x0

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v15}, Lnm/i;->b()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v8

    invoke-virtual {v8, v5}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v5

    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v10

    invoke-virtual {v15}, Lnm/i;->b()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v4

    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v4

    mul-long/2addr v4, v10

    iget-object v8, v15, Lnm/i;->z:Lnm/a;

    iget-wide v10, v8, Lnm/a;->a:J

    cmp-long v4, v4, v10

    if-ltz v4, :cond_a

    const-wide/16 v4, 0x1

    invoke-virtual {v15, v4, v5, v9, v3}, Lnm/i;->m(JLjm/c;Ljava/lang/String;)V

    const-wide/16 v2, -0x1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto/16 :goto_a

    :cond_a
    invoke-static {v6, v13}, Lnm/i;->h(Landroid/database/sqlite/SQLiteDatabase;Lgm/i;)Ljava/lang/Long;

    move-result-object v4

    if-eqz v4, :cond_b

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    goto :goto_5

    :cond_b
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    const-string v5, "backend_name"

    iget-object v9, v13, Lgm/i;->a:Ljava/lang/String;

    invoke-virtual {v4, v5, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, v13, Lgm/i;->c:Ldm/d;

    invoke-static {v5}, Lqm/a;->a(Ldm/d;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v9, "priority"

    invoke-virtual {v4, v9, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v5, "next_request_ms"

    invoke-virtual {v4, v5, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    iget-object v5, v13, Lgm/i;->b:[B

    if-eqz v5, :cond_c

    const-string v9, "extras"

    const/4 v10, 0x0

    invoke-static {v5, v10}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v9, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_c
    const-string v5, "transport_contexts"

    const/4 v9, 0x0

    invoke-virtual {v6, v5, v9, v4}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v4

    :goto_5
    iget v8, v8, Lnm/a;->e:I

    iget-object v9, v0, Lgm/m;->b:[B

    array-length v10, v9

    if-gt v10, v8, :cond_d

    move v10, v12

    goto :goto_6

    :cond_d
    const/4 v10, 0x0

    :goto_6
    new-instance v11, Landroid/content/ContentValues;

    invoke-direct {v11}, Landroid/content/ContentValues;-><init>()V

    const-string v13, "context_id"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v11, v13, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v4, "transport_name"

    invoke-virtual {v11, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-wide v3, v14, Lgm/h;->d:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "timestamp_ms"

    invoke-virtual {v11, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-wide v3, v14, Lgm/h;->e:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "uptime_ms"

    invoke-virtual {v11, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v0, v0, Lgm/m;->a:Ldm/c;

    iget-object v0, v0, Ldm/c;->a:Ljava/lang/String;

    const-string v3, "payload_encoding"

    invoke-virtual {v11, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "code"

    iget-object v3, v14, Lgm/h;->b:Ljava/lang/Integer;

    invoke-virtual {v11, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "num_attempts"

    invoke-virtual {v11, v0, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "inline"

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v11, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    if-eqz v10, :cond_e

    move-object v0, v9

    goto :goto_7

    :cond_e
    const/4 v0, 0x0

    new-array v0, v0, [B

    :goto_7
    const-string v3, "payload"

    invoke-virtual {v11, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const-string v0, "events"

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v3, v11}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v4

    const-string v0, "event_id"

    if-nez v10, :cond_f

    array-length v3, v9

    int-to-double v10, v3

    int-to-double v12, v8

    div-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    double-to-int v7, v10

    const/4 v12, 0x1

    :goto_8
    if-gt v12, v7, :cond_f

    add-int/lit8 v3, v12, -0x1

    mul-int/2addr v3, v8

    mul-int v10, v12, v8

    array-length v11, v9

    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v10

    invoke-static {v9, v3, v10}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v3

    new-instance v10, Landroid/content/ContentValues;

    invoke-direct {v10}, Landroid/content/ContentValues;-><init>()V

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v10, v0, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v11, "sequence_num"

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v10, v11, v13}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {v10, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const-string v3, "event_payloads"

    const/4 v11, 0x0

    invoke-virtual {v6, v3, v11, v10}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    add-int/lit8 v12, v12, 0x1

    goto :goto_8

    :cond_f
    iget-object v2, v14, Lgm/h;->f:Ljava/util/Map;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v7, v0, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    const-string v9, "name"

    invoke-virtual {v7, v9, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v8, "value"

    invoke-virtual {v7, v8, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "event_metadata"

    const/4 v9, 0x0

    invoke-virtual {v6, v3, v9, v7}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    goto :goto_9

    :cond_10
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_a
    return-object v0

    :pswitch_1
    check-cast v14, Ljava/util/ArrayList;

    check-cast v13, Lgm/i;

    move-object/from16 v0, p1

    check-cast v0, Landroid/database/Cursor;

    :goto_b
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_19

    const/4 v8, 0x0

    invoke-interface {v0, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    const/4 v6, 0x7

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_11

    const/4 v6, 0x1

    goto :goto_c

    :cond_11
    const/4 v6, 0x0

    :goto_c
    new-instance v7, La30/w0;

    invoke-direct {v7, v11}, La30/w0;-><init>(I)V

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    iput-object v8, v7, La30/w0;->G:Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_18

    iput-object v8, v7, La30/w0;->z:Ljava/lang/Object;

    const/4 v8, 0x2

    invoke-interface {v0, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    iput-object v9, v7, La30/w0;->E:Ljava/lang/Object;

    const/4 v9, 0x3

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    iput-object v10, v7, La30/w0;->F:Ljava/lang/Object;

    if-eqz v6, :cond_13

    new-instance v6, Lgm/m;

    invoke-interface {v0, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_12

    sget-object v10, Lnm/i;->F:Ldm/c;

    :goto_d
    const/4 v12, 0x5

    goto :goto_e

    :cond_12
    new-instance v12, Ldm/c;

    invoke-direct {v12, v10}, Ldm/c;-><init>(Ljava/lang/String;)V

    move-object v10, v12

    goto :goto_d

    :goto_e
    invoke-interface {v0, v12}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v3

    invoke-direct {v6, v10, v3}, Lgm/m;-><init>(Ldm/c;[B)V

    iput-object v6, v7, La30/w0;->y:Ljava/lang/Object;

    move-object/from16 v22, v2

    const/4 v8, 0x0

    :goto_f
    const/4 v1, 0x6

    goto/16 :goto_13

    :cond_13
    const/4 v12, 0x5

    new-instance v3, Lgm/m;

    invoke-interface {v0, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_14

    sget-object v6, Lnm/i;->F:Ldm/c;

    goto :goto_10

    :cond_14
    new-instance v10, Ldm/c;

    invoke-direct {v10, v6}, Ldm/c;-><init>(Ljava/lang/String;)V

    move-object v6, v10

    :goto_10
    invoke-virtual {v15}, Lnm/i;->b()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v18

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v20

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/String;

    move-result-object v22

    const/16 v24, 0x0

    const-string v25, "sequence_num"

    const-string v19, "event_payloads"

    const-string v21, "event_id = ?"

    const/16 v23, 0x0

    invoke-virtual/range {v18 .. v25}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    :try_start_4
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    const/4 v9, 0x0

    :goto_11
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v20

    if-eqz v20, :cond_15

    const/4 v11, 0x0

    invoke-interface {v10, v11}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    array-length v11, v12

    add-int/2addr v9, v11

    const/4 v11, 0x4

    const/4 v12, 0x5

    goto :goto_11

    :cond_15
    new-array v9, v9, [B

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_12
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v11, v1, :cond_16

    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    move-object/from16 v22, v2

    array-length v2, v1

    move-object/from16 p1, v8

    const/4 v8, 0x0

    invoke-static {v1, v8, v9, v12, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v1, v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    add-int/2addr v12, v1

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v8, p1

    move-object/from16 v2, v22

    goto :goto_12

    :cond_16
    move-object/from16 v22, v2

    const/4 v8, 0x0

    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    invoke-direct {v3, v6, v9}, Lgm/m;-><init>(Ldm/c;[B)V

    iput-object v3, v7, La30/w0;->y:Ljava/lang/Object;

    goto :goto_f

    :goto_13
    invoke-interface {v0, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v2

    if-nez v2, :cond_17

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v7, La30/w0;->x:Ljava/lang/Object;

    :cond_17
    invoke-virtual {v7}, La30/w0;->m()Lgm/h;

    move-result-object v2

    new-instance v3, Lnm/b;

    invoke-direct {v3, v4, v5, v13, v2}, Lnm/b;-><init>(JLgm/i;Lgm/h;)V

    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p0

    move-object/from16 v2, v22

    const/4 v11, 0x4

    goto/16 :goto_b

    :catchall_2
    move-exception v0

    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_18
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Null transportName"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    const/16 v16, 0x0

    return-object v16

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lzd3/o;)Lud3/a0;
    .locals 9

    iget-object v0, p0, Lbc/i;->x:Ljava/lang/Object;

    check-cast v0, Lud3/l0;

    iget-object v1, p0, Lbc/i;->y:Ljava/lang/Object;

    check-cast v1, Lrf/r;

    iget-object v2, p0, Lbc/i;->z:Ljava/lang/Object;

    move-object v7, v2

    check-cast v7, Lqf/b;

    new-instance v2, Lrf/a;

    new-instance v3, Lrf/f;

    iget-object v4, v0, Lud3/l0;->F:Lud3/q;

    iget-object v5, v1, Lpf/i;->h:Lbg/g;

    iget-object v6, v0, Lud3/l0;->a:Lud3/u;

    move-object v8, p1

    invoke-direct/range {v3 .. v8}, Lrf/f;-><init>(Lud3/q;Lbg/g;Lud3/u;Lqf/b;Lzd3/o;)V

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v2, p1}, Lrf/a;-><init>(Ljava/util/List;)V

    return-object v2
.end method

.method public c(ILu8/p0;[I)Lzr/w0;
    .locals 9

    iget-object v0, p0, Lbc/i;->x:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lo9/j;

    iget-object v0, p0, Lbc/i;->y:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    iget-object v0, p0, Lbc/i;->z:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    invoke-static {}, Lzr/g0;->l()Lzr/d0;

    move-result-object v0

    const/4 v1, 0x0

    move v4, v1

    :goto_0
    iget v1, p2, Lu8/p0;->a:I

    if-ge v4, v1, :cond_0

    new-instance v1, Lo9/m;

    aget v6, p3, v4

    move v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v8}, Lo9/m;-><init>(ILu8/p0;ILo9/j;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lzr/a0;->a(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lzr/d0;->f()Lzr/w0;

    move-result-object p1

    return-object p1
.end method

.method public d(Ld4/i;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lbc/i;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lbc/i;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lbc/i;->z:Ljava/lang/Object;

    check-cast v2, Lc93/a;

    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v4, Lic/p;

    const/4 v5, 0x0

    invoke-direct {v4, v3, v5}, Lic/p;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    sget-object v5, Lic/j;->w:Lic/j;

    iget-object v6, p1, Ld4/i;->c:Ld4/n;

    if-eqz v6, :cond_0

    invoke-virtual {v6, v4, v5}, Ld4/h;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_0
    new-instance v4, Lic/q;

    const/4 v5, 0x0

    invoke-direct {v4, v3, p1, v2, v5}, Lic/q;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ld4/i;Lc93/a;I)V

    invoke-interface {v0, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v1
.end method

.method public e(Lcx/d;Ljava/util/ArrayList;)V
    .locals 3

    iget-object v0, p0, Lbc/i;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/utils/PermissionChecker;

    iget-object v1, p0, Lbc/i;->y:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    iget-object v2, p0, Lbc/i;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1, p2}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->c(Lio/getstream/chat/android/ui/utils/PermissionChecker;Landroid/view/View;Ljava/lang/String;Lcx/d;Ljava/util/ArrayList;)V

    return-void
.end method

.method public execute()Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lbc/i;->x:Ljava/lang/Object;

    check-cast v0, Llm/a;

    iget-object v1, p0, Lbc/i;->y:Ljava/lang/Object;

    check-cast v1, Lgm/i;

    iget-object v2, p0, Lbc/i;->z:Ljava/lang/Object;

    check-cast v2, Lgm/h;

    iget-object v3, v0, Llm/a;->d:Lnm/d;

    check-cast v3, Lnm/i;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v1, Lgm/i;->c:Ldm/d;

    iget-object v5, v2, Lgm/h;->a:Ljava/lang/String;

    iget-object v6, v1, Lgm/i;->a:Ljava/lang/String;

    const-string v7, "TRuntime."

    const-string v8, "SQLiteEventStore"

    invoke-virtual {v7, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x3

    invoke-static {v7, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v8

    if-eqz v8, :cond_0

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Storing event with priority="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", name="

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " for destination "

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v7, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance v4, Lbc/i;

    const/16 v5, 0xb

    invoke-direct {v4, v3, v2, v1, v5}, Lbc/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v3, v4}, Lnm/i;->i(Lnm/g;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Llm/a;->a:Lgm/r;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Lgm/r;->O(Lgm/i;IZ)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public g(Lio/sentry/n1;)V
    .locals 3

    iget-object v0, p0, Lbc/i;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/internal/gestures/g;

    iget-object v1, p0, Lbc/i;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/b1;

    iget-object v2, p0, Lbc/i;->z:Ljava/lang/Object;

    check-cast v2, Lio/sentry/n1;

    if-nez p1, :cond_0

    invoke-interface {v1, v2}, Lio/sentry/b1;->B(Lio/sentry/n1;)V

    return-void

    :cond_0
    iget-object p1, v0, Lio/sentry/android/core/internal/gestures/g;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-interface {v2}, Lio/sentry/n1;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Transaction \'%s\' won\'t be bound to the Scope since there\'s one already in there."

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public i(Ljava/lang/Object;)Lcq/u;
    .locals 8

    iget-object v0, p0, Lbc/i;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    iget-object v1, p0, Lbc/i;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lbc/i;->z:Ljava/lang/Object;

    check-cast v2, Lzt/r;

    check-cast p1, Ljava/lang/String;

    iget-object v3, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    invoke-static {v3}, Lcom/google/firebase/messaging/FirebaseMessaging;->d(Landroid/content/Context;)Lu93/d0;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->e()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->h:Lio/sentry/android/core/j1;

    invoke-virtual {v5}, Lio/sentry/android/core/j1;->b()Ljava/lang/String;

    move-result-object v5

    monitor-enter v3

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v6, v7, p1, v5}, Lzt/r;->a(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v5, :cond_0

    monitor-exit v3

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v6, v3, Lu93/d0;->w:Ljava/lang/Object;

    check-cast v6, Landroid/content/SharedPreferences;

    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    invoke-static {v4, v1}, Lu93/d0;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v1, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v3

    :goto_0
    if-eqz v2, :cond_1

    iget-object v1, v2, Lzt/r;->a:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_1
    const-string v1, "FirebaseMessaging"

    const-string v2, "[DEFAULT]"

    iget-object v3, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Ldt/g;

    invoke-virtual {v3}, Ldt/g;->a()V

    iget-object v4, v3, Ldt/g;->b:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, 0x3

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Invoking onNewToken for app: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ldt/g;->a()V

    iget-object v3, v3, Ldt/g;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.google.firebase.messaging.NEW_TOKEN"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "token"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    new-instance v2, Lzt/j;

    iget-object v0, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    invoke-direct {v2, v0}, Lzt/j;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v1}, Lzt/j;->b(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    :cond_3
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->d(Ljava/lang/Object;)Lcq/u;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public onResult(Ln23/h;)V
    .locals 4

    iget v0, p0, Lbc/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbc/i;->x:Ljava/lang/Object;

    check-cast v0, Lo23/o;

    iget-object v1, p0, Lbc/i;->y:Ljava/lang/Object;

    check-cast v1, Ln23/h;

    iget-object v2, p0, Lbc/i;->z:Ljava/lang/Object;

    check-cast v2, Lo23/a;

    const-string v3, "resultB"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lo23/o;->c:Lac3/a;

    invoke-virtual {v0}, Lac3/a;->a()Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ln23/g;

    if-eqz v0, :cond_1

    invoke-static {v1, p1}, Lo23/o;->a(Ln23/h;Ln23/h;)Ln23/h;

    move-result-object v3

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_2

    check-cast p1, Ln23/f;

    new-instance v3, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    invoke-direct {v3, p1}, Ln23/f;-><init>(Ln23/e;)V

    :cond_2
    :goto_0
    if-eqz v3, :cond_3

    invoke-interface {v2, v3}, Lo23/a;->onResult(Ln23/h;)V

    :cond_3
    return-void

    :pswitch_0
    iget-object v0, p0, Lbc/i;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbc/i;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iget-object v2, p0, Lbc/i;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->F(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ln23/h;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lbc/i;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iget-object v1, p0, Lbc/i;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lbc/i;->z:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v0, v1, v2, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->c(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;Ln23/h;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public q(Lcom/google/android/gms/tasks/Task;)V
    .locals 5

    iget-object v0, p0, Lbc/i;->x:Ljava/lang/Object;

    check-cast v0, Lur/d;

    iget-object v1, p0, Lbc/i;->y:Ljava/lang/Object;

    check-cast v1, Landroid/app/Activity;

    iget-object v2, p0, Lbc/i;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v3, "requestTask"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lur/a;

    invoke-virtual {v0, v1, p1}, Lur/d;->a(Landroid/app/Activity;Lur/a;)Lcq/u;

    move-result-object p1

    new-instance v0, Lqm2/c;

    const/16 v3, 0xa

    invoke-direct {v0, v3, v2, v1}, Lqm2/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lcq/u;->addOnCompleteListener(Lcq/d;)Lcom/google/android/gms/tasks/Task;

    return-void

    :cond_0
    sget-object v0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "PlayStoreHandler: Failed to request review flow: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    const/4 v4, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v4

    :goto_0
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    if-eqz v2, :cond_2

    invoke-static {v1, v2}, Ls4/a;->h(Landroid/app/Activity;Ljava/lang/String;)V

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    :cond_2
    if-nez v4, :cond_3

    const-string p1, "PlayStoreHandler: Failed to open app page - no package name."

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public run(Lcom/mapbox/bindgen/Expected;)V
    .locals 3

    iget-object v0, p0, Lbc/i;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/Snapshotter;

    iget-object v1, p0, Lbc/i;->y:Ljava/lang/Object;

    check-cast v1, Lcom/mapbox/maps/SnapshotResultCallback;

    iget-object v2, p0, Lbc/i;->z:Ljava/lang/Object;

    check-cast v2, Lcom/mapbox/maps/SnapshotOverlayCallback;

    invoke-static {v0, v1, v2, p1}, Lcom/mapbox/maps/Snapshotter;->b(Lcom/mapbox/maps/Snapshotter;Lcom/mapbox/maps/SnapshotResultCallback;Lcom/mapbox/maps/SnapshotOverlayCallback;Lcom/mapbox/bindgen/Expected;)V

    return-void
.end method
