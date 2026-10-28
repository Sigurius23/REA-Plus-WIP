.class public final Lbk/e;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# instance fields
.field public final w:Lfk/a;

.field public final x:Ljava/io/File;

.field public y:Z

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lfk/a;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "databaseName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-direct {p0, p1, p2, v0, v1}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    iput-object p3, p0, Lbk/e;->w:Lfk/a;

    invoke-virtual {p1, p2}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    const-string p2, "context.getDatabasePath(databaseName)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lbk/e;->x:Ljava/io/File;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lbk/e;->y:Z

    iput v1, p0, Lbk/e;->z:I

    return-void
.end method

.method public static h(Ljava/lang/RuntimeException;)V
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "Cursor window allocation of"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "Could not allocate CursorWindow"

    invoke-static {v0, v1, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    new-instance p0, Lcom/amplitude/android/migration/CursorWindowAllocationException;

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    throw p0
.end method


# virtual methods
.method public final J(JLjava/lang/String;)V
    .locals 8

    const-string v0, "Amplitude"

    const-string v1, "message"

    const-string v2, " failed: "

    const-string v3, "remove events from "

    const/4 v4, 0x4

    const/4 v5, 0x2

    :try_start_0
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    const-string v7, "id = ?"

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, p3, v7, p1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_2

    :goto_0
    :try_start_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v4}, Le4/p;->b(II)I

    move-result p2

    if-gtz p2, :cond_0

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p0}, Lbk/e;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    goto :goto_3

    :goto_2
    :try_start_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v4}, Le4/p;->b(II)I

    move-result p2

    if-gtz p2, :cond_1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-virtual {p0}, Lbk/e;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_3
    return-void

    :goto_4
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    throw p1
.end method

.method public final declared-synchronized T(Ljava/lang/String;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lbk/e;->a0(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final a0(Ljava/lang/String;)V
    .locals 8

    const-string v0, "Amplitude"

    const-string v1, "message"

    const-string v2, "remove value from long_store failed: "

    const-string v3, "long_store"

    const/4 v4, 0x4

    const/4 v5, 0x2

    :try_start_0
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    const-string v7, "key = ?"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, v3, v7, p1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_2

    :goto_0
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v4}, Le4/p;->b(II)I

    move-result v1

    if-gtz v1, :cond_0

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p0}, Lbk/e;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    goto :goto_3

    :goto_2
    :try_start_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v4}, Le4/p;->b(II)I

    move-result v1

    if-gtz v1, :cond_1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-virtual {p0}, Lbk/e;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_3
    return-void

    :goto_4
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    throw p1
.end method

.method public final b()V
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "close failed: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgk/b;->a:Lgk/b;

    invoke-virtual {v1, v0}, Lgk/b;->error(Ljava/lang/String;)V

    return-void
.end method

.method public final declared-synchronized i(Ljava/lang/String;)Ljava/lang/Long;
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "long_store"

    invoke-virtual {p0, v0, p1}, Lbk/e;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized k(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "store"

    invoke-virtual {p0, v0, p1}, Lbk/e;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    const-string v11, "Amplitude"

    const-string v12, "message"

    const-string v13, " failed: "

    const-string v14, "getValue from "

    iget-object v0, v1, Lbk/e;->x:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    const/4 v15, 0x0

    if-nez v0, :cond_0

    move-object/from16 v16, v15

    goto/16 :goto_c

    :cond_0
    const/4 v2, 0x4

    const/4 v3, 0x2

    move v4, v2

    :try_start_0
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_c
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_a
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_8
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget-boolean v0, v1, Lbk/e;->y:Z
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_b
    .catch Ljava/lang/StackOverflowError; {:try_start_1 .. :try_end_1} :catch_a
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_8
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-nez v0, :cond_1

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    return-object v15

    :cond_1
    :try_start_2
    const-string v0, "db"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    const-string v5, "value"

    filled-new-array {v0, v5}, [Ljava/lang/String;

    move-result-object v0

    const-string v5, "key = ?"

    filled-new-array/range {p2 .. p2}, [Ljava/lang/String;

    move-result-object v6
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_b
    .catch Ljava/lang/StackOverflowError; {:try_start_2 .. :try_end_2} :catch_a
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_8
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object/from16 v17, v11

    move-object/from16 v16, v15

    move v11, v3

    move v15, v4

    move-object/from16 v3, p1

    move-object v4, v0

    :try_start_3
    invoke-virtual/range {v2 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/StackOverflowError; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "store"

    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v4, 0x1

    if-eqz v0, :cond_2

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v15, v0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v15, v2

    goto/16 :goto_d

    :catch_0
    move-exception v0

    goto/16 :goto_7

    :catch_1
    move-exception v0

    goto/16 :goto_8

    :catch_2
    move-exception v0

    goto/16 :goto_a

    :catch_3
    move-exception v0

    :goto_1
    move-object/from16 v4, v17

    goto/16 :goto_b

    :cond_2
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/StackOverflowError; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    :cond_3
    move-object/from16 v15, v16

    :goto_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    return-object v15

    :catchall_1
    move-exception v0

    move-object/from16 v15, v16

    goto/16 :goto_d

    :catch_4
    move-exception v0

    :goto_3
    move-object/from16 v2, v16

    goto :goto_7

    :catch_5
    move-exception v0

    :goto_4
    move-object/from16 v2, v16

    goto :goto_8

    :catch_6
    move-exception v0

    :goto_5
    move-object/from16 v2, v16

    goto :goto_a

    :catch_7
    move-exception v0

    :goto_6
    move-object/from16 v2, v16

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object/from16 v16, v15

    goto/16 :goto_d

    :catch_8
    move-exception v0

    move-object/from16 v16, v15

    goto :goto_3

    :catch_9
    move-exception v0

    move-object/from16 v16, v15

    goto :goto_4

    :catch_a
    move-exception v0

    move-object/from16 v17, v11

    move-object/from16 v16, v15

    move v11, v3

    move v15, v4

    move-object/from16 v3, p1

    goto :goto_5

    :catch_b
    move-exception v0

    move-object/from16 v17, v11

    move-object/from16 v16, v15

    move v11, v3

    move v15, v4

    move-object/from16 v3, p1

    goto :goto_6

    :goto_7
    :try_start_5
    invoke-static {v0}, Lbk/e;->h(Ljava/lang/RuntimeException;)V

    throw v16

    :goto_8
    invoke-virtual {v1, v0}, Lbk/e;->s(Ljava/lang/IllegalStateException;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v2, :cond_4

    :goto_9
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_4
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    goto :goto_c

    :goto_a
    :try_start_6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11, v15}, Le4/p;->b(II)I

    move-result v3

    if-gtz v3, :cond_5

    move-object/from16 v4, v17

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    invoke-virtual {v1}, Lbk/e;->b()V

    if-eqz v2, :cond_4

    goto :goto_9

    :catch_c
    move-exception v0

    move-object/from16 v16, v15

    move v15, v4

    move-object v4, v11

    move v11, v3

    move-object/from16 v3, p1

    move-object/from16 v2, v16

    :goto_b
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11, v15}, Le4/p;->b(II)I

    move-result v3

    if-gtz v3, :cond_6

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    invoke-virtual {v1}, Lbk/e;->b()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz v2, :cond_4

    goto :goto_9

    :goto_c
    return-object v16

    :goto_d
    if-eqz v15, :cond_7

    invoke-interface {v15}, Landroid/database/Cursor;->close()V

    :cond_7
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    throw v0
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lbk/e;->y:Z

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Attempt to re-create existing legacy database file "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lbk/e;->x:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lbk/e;->w:Lfk/a;

    invoke-interface {v0, p1}, Lfk/a;->error(Ljava/lang/String;)V

    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    iput p2, p0, Lbk/e;->z:I

    return-void
.end method

.method public final s(Ljava/lang/IllegalStateException;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "Couldn\'t read"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "CursorWindow"

    invoke-static {v0, v1, v2}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbk/e;->b()V

    return-void

    :cond_0
    throw p1
.end method

.method public final x(Ljava/lang/String;)Ljava/util/AbstractList;
    .locals 18

    move-object/from16 v1, p0

    const-string v11, "Amplitude"

    const-string v12, "message"

    const-string v13, " failed: "

    const-string v14, "read events from "

    iget-object v0, v1, Lbk/e;->x:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    :cond_0
    new-instance v15, Ljava/util/LinkedList;

    invoke-direct {v15}, Ljava/util/LinkedList;-><init>()V

    const/4 v2, 0x4

    const/4 v3, 0x2

    const/16 v16, 0x0

    move v4, v2

    :try_start_0
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-boolean v0, v1, Lbk/e;->y:Z
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_a
    .catch Ljava/lang/StackOverflowError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    :try_start_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/StackOverflowError; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :catch_0
    move-exception v0

    move-object/from16 v2, v16

    goto/16 :goto_2

    :catch_1
    move-exception v0

    goto/16 :goto_3

    :catch_2
    move-exception v0

    move-object/from16 v3, p1

    move-object/from16 v17, v11

    move v11, v4

    goto/16 :goto_5

    :catch_3
    move-exception v0

    move-object v2, v11

    move v11, v4

    move-object v4, v2

    move v2, v3

    move-object/from16 v3, p1

    goto/16 :goto_6

    :cond_1
    :try_start_3
    const-string v0, "db"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    const-string v5, "event"

    filled-new-array {v0, v5}, [Ljava/lang/String;

    move-result-object v0

    const-string v9, "id ASC"
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_a
    .catch Ljava/lang/StackOverflowError; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v3, p1

    move-object/from16 v17, v11

    move v11, v4

    move-object v4, v0

    :try_start_4
    invoke-virtual/range {v2 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_9
    .catch Ljava/lang/StackOverflowError; {:try_start_4 .. :try_end_4} :catch_8
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_2
    :goto_0
    :try_start_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    const/4 v0, 0x1

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_3

    goto :goto_0

    :cond_3
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "$rowId"

    invoke-virtual {v6, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    invoke-virtual {v15, v6}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_7
    .catch Ljava/lang/StackOverflowError; {:try_start_5 .. :try_end_5} :catch_6
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object/from16 v16, v2

    goto/16 :goto_8

    :catch_4
    move-exception v0

    goto :goto_2

    :catch_5
    move-exception v0

    move-object/from16 v16, v2

    goto :goto_3

    :catch_6
    move-exception v0

    move-object/from16 v16, v2

    goto :goto_5

    :catch_7
    move-exception v0

    move-object/from16 v16, v2

    :goto_1
    move-object/from16 v4, v17

    const/4 v2, 0x2

    goto :goto_6

    :cond_4
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    return-object v15

    :catch_8
    move-exception v0

    goto :goto_5

    :catch_9
    move-exception v0

    goto :goto_1

    :catch_a
    move-exception v0

    move-object/from16 v3, p1

    move-object/from16 v17, v11

    move v11, v4

    goto :goto_1

    :goto_2
    :try_start_6
    invoke-static {v0}, Lbk/e;->h(Ljava/lang/RuntimeException;)V

    throw v16
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_3
    :try_start_7
    invoke-virtual {v1, v0}, Lbk/e;->s(Ljava/lang/IllegalStateException;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-eqz v16, :cond_5

    :goto_4
    invoke-interface/range {v16 .. v16}, Landroid/database/Cursor;->close()V

    :cond_5
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    goto :goto_7

    :goto_5
    :try_start_8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    invoke-static {v2, v11}, Le4/p;->b(II)I

    move-result v2

    if-gtz v2, :cond_6

    move-object/from16 v4, v17

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    invoke-virtual {v1}, Lbk/e;->b()V

    if-eqz v16, :cond_5

    goto :goto_4

    :goto_6
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v11}, Le4/p;->b(II)I

    move-result v2

    if-gtz v2, :cond_7

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    invoke-virtual {v1}, Lbk/e;->b()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-eqz v16, :cond_5

    goto :goto_4

    :goto_7
    return-object v15

    :goto_8
    if-eqz v16, :cond_8

    invoke-interface/range {v16 .. v16}, Landroid/database/Cursor;->close()V

    :cond_8
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    throw v0
.end method
