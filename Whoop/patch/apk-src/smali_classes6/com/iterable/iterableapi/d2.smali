.class public final Lcom/iterable/iterableapi/d2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Lcom/iterable/iterableapi/f;


# instance fields
.field public E:Landroid/os/Handler;

.field public F:Ljava/util/ArrayList;

.field public w:La00/g;

.field public x:Lcom/iterable/iterableapi/g;

.field public y:Lb9/b;

.field public z:Lcom/iterable/iterableapi/a;


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b()V
    .locals 0

    invoke-virtual {p0}, Lcom/iterable/iterableapi/d2;->c()V

    return-void
.end method

.method public final declared-synchronized c()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/iterable/iterableapi/d2;->E:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/iterable/iterableapi/d2;->E:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget v0, v0, Landroid/os/Message;->what:I

    const/16 v3, 0x64

    if-ne v0, v3, :cond_1a

    iget-object v4, v1, Lcom/iterable/iterableapi/d2;->w:La00/g;

    iget-object v5, v1, Lcom/iterable/iterableapi/d2;->z:Lcom/iterable/iterableapi/a;

    iget-object v0, v1, Lcom/iterable/iterableapi/d2;->x:Lcom/iterable/iterableapi/g;

    iget-object v0, v0, Lcom/iterable/iterableapi/g;->b:Ljava/lang/ref/WeakReference;

    const/4 v6, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    move-object v0, v6

    :goto_0
    const/4 v7, 0x1

    const-string v8, "IterableTaskRunner"

    if-eqz v0, :cond_19

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v9, "Health monitor can process: "

    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v9, v5, Lcom/iterable/iterableapi/a;->a:Z

    xor-int/2addr v9, v7

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v9, "HealthMonitor"

    invoke-static {v9, v0}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, v5, Lcom/iterable/iterableapi/a;->a:Z

    if-eqz v0, :cond_2

    :cond_1
    move-object v7, v1

    goto/16 :goto_13

    :cond_2
    :goto_1
    iget-object v0, v1, Lcom/iterable/iterableapi/d2;->y:Lb9/b;

    iget-boolean v0, v0, Lb9/b;->x:Z

    if-eqz v0, :cond_1

    invoke-virtual {v4}, La00/g;->t()Z

    move-result v0

    iget-object v10, v4, La00/g;->x:Ljava/lang/Object;

    check-cast v10, Landroid/database/sqlite/SQLiteDatabase;

    const-string v11, "data"

    if-nez v0, :cond_3

    move/from16 v18, v3

    move-object/from16 v16, v4

    move-object/from16 v20, v5

    move-object/from16 v22, v8

    move-object/from16 v21, v9

    move-object/from16 v17, v10

    move-object/from16 v23, v11

    const/16 p1, 0x0

    move-object v11, v6

    goto/16 :goto_c

    :cond_3
    const-string v0, "select * from OfflineTask order by scheduled limit 1"

    invoke-virtual {v10, v0, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v12

    if-eqz v12, :cond_11

    const-string v12, "task_id"

    invoke-interface {v0, v12}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    invoke-interface {v0, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    const-string v13, "name"

    invoke-interface {v0, v13}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    invoke-interface {v0, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    const-string v13, "version"

    invoke-interface {v0, v13}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    invoke-interface {v0, v13}, Landroid/database/Cursor;->getInt(I)I

    move-result v13

    const-string v14, "created"

    invoke-interface {v0, v14}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    invoke-interface {v0, v14}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14

    const/16 p1, 0x0

    const-string v2, "modified"

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    invoke-interface {v0, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    const-wide/16 v16, 0x0

    if-nez v6, :cond_4

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v18

    move-object v6, v4

    move-wide/from16 v25, v18

    move/from16 v18, v3

    move-wide/from16 v3, v25

    goto :goto_2

    :cond_4
    move/from16 v18, v3

    move-object v6, v4

    move-wide/from16 v3, v16

    :goto_2
    const-string v2, "last_attempt"

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v0, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v7

    if-nez v7, :cond_5

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v16

    :cond_5
    move-wide/from16 v25, v16

    move-object/from16 v16, v6

    move-wide/from16 v6, v25

    const-string v2, "scheduled"

    move-object/from16 v17, v10

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    invoke-interface {v0, v10}, Landroid/database/Cursor;->isNull(I)Z

    move-result v10

    if-nez v10, :cond_6

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J

    :cond_6
    const-string v2, "requested"

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    invoke-interface {v0, v10}, Landroid/database/Cursor;->isNull(I)Z

    move-result v10

    if-nez v10, :cond_7

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J

    :cond_7
    const-string v2, "processing"

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    invoke-interface {v0, v10}, Landroid/database/Cursor;->isNull(I)Z

    move-result v10

    if-nez v10, :cond_8

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    if-lez v2, :cond_8

    const/4 v2, 0x1

    goto :goto_3

    :cond_8
    move/from16 v2, p1

    :goto_3
    const-string v10, "failed"

    invoke-interface {v0, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_9

    invoke-interface {v0, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    if-lez v1, :cond_9

    const/4 v1, 0x1

    goto :goto_4

    :cond_9
    move/from16 v1, p1

    :goto_4
    const-string v10, "blocking"

    move-object/from16 v20, v5

    invoke-interface {v0, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v0, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-nez v5, :cond_a

    invoke-interface {v0, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    if-lez v5, :cond_a

    const/4 v5, 0x1

    goto :goto_5

    :cond_a
    move/from16 v5, p1

    :goto_5
    invoke-interface {v0, v11}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    invoke-interface {v0, v10}, Landroid/database/Cursor;->isNull(I)Z

    move-result v10

    if-nez v10, :cond_b

    invoke-interface {v0, v11}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    invoke-interface {v0, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    :goto_6
    move-object/from16 v21, v9

    goto :goto_7

    :cond_b
    const/4 v10, 0x0

    goto :goto_6

    :goto_7
    const-string v9, "error"

    move-object/from16 v22, v8

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    invoke-interface {v0, v8}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-nez v8, :cond_c

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    invoke-interface {v0, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_8

    :cond_c
    const/4 v8, 0x0

    :goto_8
    const-string v9, "type"

    move-object/from16 v23, v11

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    invoke-interface {v0, v11}, Landroid/database/Cursor;->isNull(I)Z

    move-result v11

    if-nez v11, :cond_f

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_e

    const-string v11, "API"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    const/4 v9, 0x1

    goto :goto_9

    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No enum constant com.iterable.iterableapi.IterableTaskType."

    invoke-virtual {v1, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Name is null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    move/from16 v9, p1

    :goto_9
    const-string v11, "attempts"

    move/from16 v24, v9

    invoke-interface {v0, v11}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    invoke-interface {v0, v9}, Landroid/database/Cursor;->isNull(I)Z

    move-result v9

    if-nez v9, :cond_10

    invoke-interface {v0, v11}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getInt(I)I

    move-result v9

    goto :goto_a

    :cond_10
    move/from16 v9, p1

    :goto_a
    new-instance v11, Lcom/iterable/iterableapi/b2;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    iput-object v12, v11, Lcom/iterable/iterableapi/b2;->a:Ljava/lang/String;

    iput v13, v11, Lcom/iterable/iterableapi/b2;->b:I

    iput-wide v14, v11, Lcom/iterable/iterableapi/b2;->c:J

    iput-wide v3, v11, Lcom/iterable/iterableapi/b2;->d:J

    iput-wide v6, v11, Lcom/iterable/iterableapi/b2;->e:J

    iput-boolean v2, v11, Lcom/iterable/iterableapi/b2;->f:Z

    iput-boolean v1, v11, Lcom/iterable/iterableapi/b2;->g:Z

    iput-boolean v5, v11, Lcom/iterable/iterableapi/b2;->h:Z

    iput-object v10, v11, Lcom/iterable/iterableapi/b2;->i:Ljava/lang/String;

    iput-object v8, v11, Lcom/iterable/iterableapi/b2;->j:Ljava/lang/String;

    move/from16 v1, v24

    iput v1, v11, Lcom/iterable/iterableapi/b2;->k:I

    iput v9, v11, Lcom/iterable/iterableapi/b2;->l:I

    goto :goto_b

    :cond_11
    move/from16 v18, v3

    move-object/from16 v16, v4

    move-object/from16 v20, v5

    move-object/from16 v22, v8

    move-object/from16 v21, v9

    move-object/from16 v17, v10

    move-object/from16 v23, v11

    const/16 p1, 0x0

    const/4 v11, 0x0

    :goto_b
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :goto_c
    if-nez v11, :cond_12

    move-object/from16 v7, p0

    goto/16 :goto_13

    :cond_12
    iget-object v1, v11, Lcom/iterable/iterableapi/b2;->a:Ljava/lang/String;

    iget v0, v11, Lcom/iterable/iterableapi/b2;->k:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_18

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    iget-object v2, v11, Lcom/iterable/iterableapi/b2;->i:Ljava/lang/String;

    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object/from16 v2, v23

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "createdAt"

    iget-wide v4, v11, Lcom/iterable/iterableapi/b2;->c:J

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    invoke-virtual {v2, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_d

    :catch_0
    move-exception v0

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v0, 0x0

    :goto_d
    invoke-static {v0}, Lcom/iterable/iterableapi/o;->a(Lorg/json/JSONObject;)Lcom/iterable/iterableapi/o;

    move-result-object v0

    sget-object v2, Lcom/iterable/iterableapi/n;->x:Lcom/iterable/iterableapi/m;

    iput-object v2, v0, Lcom/iterable/iterableapi/o;->f:Lcom/iterable/iterableapi/n;

    invoke-static {v0}, Lcom/iterable/iterableapi/a2;->b(Lcom/iterable/iterableapi/o;)Lcom/iterable/iterableapi/p;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 v4, v20

    move-object/from16 v2, v21

    move-object/from16 v3, v22

    goto :goto_e

    :catch_1
    move-exception v0

    const-string v2, "Error while processing request task"

    move-object/from16 v3, v22

    invoke-static {v3, v2, v0}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    const-string v0, "DB Error notified to healthMonitor"

    move-object/from16 v2, v21

    invoke-static {v2, v0}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v4, v20

    const/4 v5, 0x1

    iput-boolean v5, v4, Lcom/iterable/iterableapi/a;->a:Z

    const/4 v0, 0x0

    :goto_e
    const/4 v5, 0x3

    const/4 v6, 0x2

    if-eqz v0, :cond_13

    iget-boolean v7, v0, Lcom/iterable/iterableapi/p;->a:Z

    if-eqz v7, :cond_14

    const/4 v6, 0x1

    :cond_13
    move-object/from16 v7, p0

    goto :goto_f

    :cond_14
    iget-object v7, v0, Lcom/iterable/iterableapi/p;->e:Ljava/lang/String;

    const-string v8, "failed to connect"

    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_13

    move-object/from16 v7, p0

    move v6, v5

    :goto_f
    iget-object v8, v7, Lcom/iterable/iterableapi/d2;->F:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_10
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_15

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/iterable/iterableapi/c2;

    new-instance v10, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v11

    invoke-direct {v10, v11}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v11, Lc5/m;

    invoke-direct {v11, v9, v1, v6, v0}, Lc5/m;-><init>(Lcom/iterable/iterableapi/c2;Ljava/lang/String;ILcom/iterable/iterableapi/p;)V

    invoke-virtual {v10, v11}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_10

    :cond_15
    if-ne v6, v5, :cond_16

    goto :goto_12

    :cond_16
    invoke-virtual/range {v16 .. v16}, La00/g;->t()Z

    move-result v0

    if-nez v0, :cond_17

    goto :goto_11

    :cond_17
    const-string v0, "task_id =?"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v5, "OfflineTask"

    move-object/from16 v10, v17

    invoke-virtual {v10, v5, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "Deleted entry - "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "IterableTaskStorage"

    invoke-static {v1, v0}, Ldt/b;->Z(Ljava/lang/String;Ljava/lang/String;)V

    :goto_11
    move-object v9, v2

    move-object v8, v3

    move-object v5, v4

    move-object v1, v7

    move-object/from16 v4, v16

    move/from16 v3, v18

    const/4 v6, 0x0

    const/4 v7, 0x1

    goto/16 :goto_1

    :cond_18
    move-object/from16 v7, p0

    :goto_12
    iget-object v0, v7, Lcom/iterable/iterableapi/d2;->E:Landroid/os/Handler;

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const-wide/32 v1, 0xea60

    move/from16 v3, v18

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :goto_13
    const/16 v19, 0x1

    return v19

    :cond_19
    move/from16 v19, v7

    move-object v3, v8

    move-object v7, v1

    const-string v0, "App not in foreground, skipping processing tasks"

    invoke-static {v3, v0}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    return v19

    :cond_1a
    move-object v7, v1

    const/16 p1, 0x0

    return p1
.end method
