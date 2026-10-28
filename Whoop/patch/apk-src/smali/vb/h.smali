.class public final Lvb/h;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# static fields
.field public static final synthetic H:I


# instance fields
.field public E:Z

.field public final F:Lxb/a;

.field public G:Z

.field public final w:Landroid/content/Context;

.field public final x:Lbu/c;

.field public final y:Lub/b;

.field public final z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lbu/c;Lub/b;Z)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v5, p4, Lub/b;->a:I

    new-instance v6, Lvb/d;

    invoke-direct {v6, p4, p3}, Lvb/d;-><init>(Lub/b;Lbu/c;)V

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILandroid/database/DatabaseErrorHandler;)V

    iput-object v2, v1, Lvb/h;->w:Landroid/content/Context;

    iput-object p3, v1, Lvb/h;->x:Lbu/c;

    iput-object p4, v1, Lvb/h;->y:Lub/b;

    iput-boolean p5, v1, Lvb/h;->z:Z

    new-instance p1, Lxb/a;

    if-nez v3, :cond_0

    const-string p2, "toString(...)"

    invoke-static {p2}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, v3

    :goto_0
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p3

    const/4 p4, 0x0

    invoke-direct {p1, p4, p3, p2}, Lxb/a;-><init>(ZLjava/io/File;Ljava/lang/String;)V

    iput-object p1, v1, Lvb/h;->F:Lxb/a;

    return-void
.end method


# virtual methods
.method public final b(Z)Lub/a;
    .locals 3

    iget-object v0, p0, Lvb/h;->F:Lxb/a;

    :try_start_0
    iget-boolean v1, p0, Lvb/h;->G:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getDatabaseName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Lxb/a;->a(Z)V

    iput-boolean v2, p0, Lvb/h;->E:Z

    invoke-virtual {p0, p1}, Lvb/h;->h(Z)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    iget-boolean v2, p0, Lvb/h;->E:Z

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lvb/h;->close()V

    invoke-virtual {p0, p1}, Lvb/h;->b(Z)Lub/a;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lxb/a;->b()V

    return-object p1

    :cond_1
    :try_start_1
    iget-object p1, p0, Lvb/h;->x:Lbu/c;

    invoke-static {p1, v1}, Lvb/g;->d(Lbu/c;Landroid/database/sqlite/SQLiteDatabase;)Lvb/c;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v0}, Lxb/a;->b()V

    return-object p1

    :goto_1
    invoke-virtual {v0}, Lxb/a;->b()V

    throw p1
.end method

.method public final close()V
    .locals 3

    iget-object v0, p0, Lvb/h;->F:Lxb/a;

    :try_start_0
    iget-boolean v1, v0, Lxb/a;->a:Z

    invoke-virtual {v0, v1}, Lxb/a;->a(Z)V

    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    iget-object v1, p0, Lvb/h;->x:Lbu/c;

    const/4 v2, 0x0

    iput-object v2, v1, Lbu/c;->w:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lvb/h;->G:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lxb/a;->b()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lxb/a;->b()V

    throw v1
.end method

.method public final h(Z)Landroid/database/sqlite/SQLiteDatabase;
    .locals 5

    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getDatabaseName()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lvb/h;->G:Z

    iget-object v2, p0, Lvb/h;->w:Landroid/content/Context;

    if-eqz v0, :cond_0

    if-nez v1, :cond_0

    invoke-virtual {v2, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-nez v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Invalid database parent file, not a directory: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "SupportSQLite"

    invoke-static {v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v1

    :cond_1
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    const-wide/16 v3, 0x1f4

    :try_start_1
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    if-eqz p1, :cond_2

    :try_start_2
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_1
    move-exception v1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_0
    return-object v1

    :goto_1
    instance-of v3, v1, Lvb/e;

    if-eqz v3, :cond_6

    check-cast v1, Lvb/e;

    iget-object v3, v1, Lvb/e;->w:Lvb/f;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    iget-object v1, v1, Lvb/e;->x:Ljava/lang/Throwable;

    if-eqz v3, :cond_5

    const/4 v4, 0x1

    if-eq v3, v4, :cond_5

    const/4 v4, 0x2

    if-eq v3, v4, :cond_5

    const/4 v4, 0x3

    if-eq v3, v4, :cond_5

    const/4 v4, 0x4

    if-ne v3, v4, :cond_4

    instance-of v3, v1, Landroid/database/sqlite/SQLiteException;

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    throw v1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    throw v1

    :cond_6
    :goto_2
    instance-of v3, v1, Landroid/database/sqlite/SQLiteException;

    if-eqz v3, :cond_8

    if-eqz v0, :cond_8

    iget-boolean v3, p0, Lvb/h;->z:Z

    if-eqz v3, :cond_8

    invoke-virtual {v2, v0}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    if-eqz p1, :cond_7

    :try_start_3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_4

    :cond_7
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_3
    .catch Lvb/e; {:try_start_3 .. :try_end_3} :catch_1

    :goto_3
    return-object p1

    :goto_4
    iget-object p1, p1, Lvb/e;->x:Ljava/lang/Throwable;

    throw p1

    :cond_8
    throw v1
.end method

.method public final onConfigure(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 3

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lvb/h;->E:Z

    iget-object v1, p0, Lvb/h;->y:Lub/b;

    if-nez v0, :cond_0

    iget v0, v1, Lub/b;->a:I

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->getVersion()I

    move-result v2

    if-eq v0, v2, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->setMaxSqlCacheSize(I)V

    :cond_0
    :try_start_0
    iget-object v0, p0, Lvb/h;->x:Lbu/c;

    invoke-static {v0, p1}, Lvb/g;->d(Lbu/c;Landroid/database/sqlite/SQLiteDatabase;)Lvb/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Lub/b;->b(Lvb/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance v0, Lvb/e;

    sget-object v1, Lvb/f;->w:Lvb/f;

    invoke-direct {v0, v1, p1}, Lvb/e;-><init>(Lvb/f;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    const-string v0, "sqLiteDatabase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lvb/h;->y:Lub/b;

    iget-object v1, p0, Lvb/h;->x:Lbu/c;

    invoke-static {v1, p1}, Lvb/g;->d(Lbu/c;Landroid/database/sqlite/SQLiteDatabase;)Lvb/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lub/b;->c(Lvb/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance v0, Lvb/e;

    sget-object v1, Lvb/f;->x:Lvb/f;

    invoke-direct {v0, v1, p1}, Lvb/e;-><init>(Lvb/f;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 2

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lvb/h;->E:Z

    :try_start_0
    iget-object v0, p0, Lvb/h;->y:Lub/b;

    iget-object v1, p0, Lvb/h;->x:Lbu/c;

    invoke-static {v1, p1}, Lvb/g;->d(Lbu/c;Landroid/database/sqlite/SQLiteDatabase;)Lvb/c;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Lub/b;->d(Lvb/c;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance p2, Lvb/e;

    sget-object p3, Lvb/f;->z:Lvb/f;

    invoke-direct {p2, p3, p1}, Lvb/e;-><init>(Lvb/f;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final onOpen(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lvb/h;->E:Z

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lvb/h;->y:Lub/b;

    iget-object v1, p0, Lvb/h;->x:Lbu/c;

    invoke-static {v1, p1}, Lvb/g;->d(Lbu/c;Landroid/database/sqlite/SQLiteDatabase;)Lvb/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lub/b;->e(Lvb/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-instance v0, Lvb/e;

    sget-object v1, Lvb/f;->E:Lvb/f;

    invoke-direct {v0, v1, p1}, Lvb/e;-><init>(Lvb/f;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lvb/h;->G:Z

    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 2

    const-string v0, "sqLiteDatabase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lvb/h;->E:Z

    :try_start_0
    iget-object v0, p0, Lvb/h;->y:Lub/b;

    iget-object v1, p0, Lvb/h;->x:Lbu/c;

    invoke-static {v1, p1}, Lvb/g;->d(Lbu/c;Landroid/database/sqlite/SQLiteDatabase;)Lvb/c;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Lub/b;->f(Lvb/c;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance p2, Lvb/e;

    sget-object p3, Lvb/f;->y:Lvb/f;

    invoke-direct {p2, p3, p1}, Lvb/e;-><init>(Lvb/f;Ljava/lang/Throwable;)V

    throw p2
.end method
