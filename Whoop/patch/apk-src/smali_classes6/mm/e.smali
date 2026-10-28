.class public final synthetic Lmm/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lom/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lev/i;

.field public final synthetic y:Lgm/i;


# direct methods
.method public synthetic constructor <init>(Lev/i;Lgm/i;I)V
    .locals 0

    iput p3, p0, Lmm/e;->w:I

    iput-object p1, p0, Lmm/e;->x:Lev/i;

    iput-object p2, p0, Lmm/e;->y:Lgm/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lmm/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmm/e;->x:Lev/i;

    iget-object v0, v0, Lev/i;->c:Ljava/lang/Object;

    check-cast v0, Lnm/d;

    check-cast v0, Lnm/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lc9/c;

    const/16 v2, 0x16

    iget-object v3, p0, Lmm/e;->y:Lgm/i;

    invoke-direct {v1, v2, v0, v3}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lnm/i;->i(Lnm/g;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lmm/e;->y:Lgm/i;

    iget-object v1, p0, Lmm/e;->x:Lev/i;

    iget-object v1, v1, Lev/i;->c:Ljava/lang/Object;

    check-cast v1, Lnm/d;

    check-cast v1, Lnm/i;

    invoke-virtual {v1}, Lnm/i;->b()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    :try_start_0
    invoke-static {v2, v0}, Lnm/i;->h(Landroid/database/sqlite/SQLiteDatabase;Lgm/i;)Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lnm/i;->b()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v3, "SELECT 1 FROM events WHERE context_id = ? LIMIT 1"

    invoke-virtual {v0}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    move-object v0, v1

    :goto_0
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_3
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
