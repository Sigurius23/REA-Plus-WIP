.class public final Landroidx/room/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public final c:Landroidx/room/g;

.field public final d:Landroidx/room/g1;

.field public final e:Ljava/util/List;

.field public final f:Llb/b;

.field public final g:Lub/e;

.field public h:Lub/a;


# direct methods
.method public constructor <init>(Landroidx/room/g;La6/i;Landroidx/room/v0;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v9, v1, Landroidx/room/g;->g:Landroidx/room/s0;

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object v1, v0, Landroidx/room/n0;->c:Landroidx/room/g;

    .line 3
    new-instance v2, Landroidx/room/k0;

    invoke-direct {v2}, Landroidx/room/k0;-><init>()V

    iput-object v2, v0, Landroidx/room/n0;->d:Landroidx/room/g1;

    .line 4
    iget-object v2, v1, Landroidx/room/g;->e:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    if-nez v2, :cond_0

    move-object v4, v3

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    iput-object v4, v0, Landroidx/room/n0;->e:Ljava/util/List;

    .line 5
    new-instance v4, La1/b;

    const/4 v5, 0x6

    invoke-direct {v4, v0, v5}, La1/b;-><init>(Ljava/lang/Object;I)V

    if-nez v2, :cond_1

    move-object v2, v3

    .line 6
    :cond_1
    check-cast v2, Ljava/util/Collection;

    .line 7
    new-instance v3, Landroidx/room/m0;

    invoke-direct {v3, v4}, Landroidx/room/m0;-><init>(La1/b;)V

    .line 8
    invoke-static {v3, v2}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v7

    .line 9
    iget-object v3, v1, Landroidx/room/g;->a:Landroid/content/Context;

    .line 10
    iget-object v4, v1, Landroidx/room/g;->b:Ljava/lang/String;

    .line 11
    iget-object v5, v1, Landroidx/room/g;->c:Lub/d;

    .line 12
    iget-object v6, v1, Landroidx/room/g;->d:Landroidx/room/t0;

    .line 13
    iget-boolean v8, v1, Landroidx/room/g;->f:Z

    .line 14
    iget-object v10, v1, Landroidx/room/g;->h:Ljava/util/concurrent/Executor;

    .line 15
    iget-object v11, v1, Landroidx/room/g;->i:Ljava/util/concurrent/Executor;

    .line 16
    iget-object v12, v1, Landroidx/room/g;->j:Landroid/content/Intent;

    .line 17
    iget-boolean v13, v1, Landroidx/room/g;->k:Z

    .line 18
    iget-boolean v14, v1, Landroidx/room/g;->l:Z

    .line 19
    iget-object v15, v1, Landroidx/room/g;->m:Ljava/util/Set;

    .line 20
    iget-object v2, v1, Landroidx/room/g;->n:Ljava/lang/String;

    move-object/from16 v16, v2

    .line 21
    iget-object v2, v1, Landroidx/room/g;->o:Ljava/io/File;

    move-object/from16 v17, v2

    .line 22
    iget-object v2, v1, Landroidx/room/g;->p:Ljava/util/concurrent/Callable;

    move-object/from16 v18, v2

    .line 23
    iget-object v2, v1, Landroidx/room/g;->q:Ljava/util/List;

    move-object/from16 v19, v4

    .line 24
    iget-object v4, v1, Landroidx/room/g;->r:Ljava/util/List;

    move-object/from16 v20, v5

    .line 25
    iget-boolean v5, v1, Landroidx/room/g;->s:Z

    move/from16 v21, v5

    .line 26
    iget-object v5, v1, Landroidx/room/g;->t:Ltb/b;

    move-object/from16 v22, v5

    .line 27
    iget-object v5, v1, Landroidx/room/g;->u:Lq83/j;

    move-object/from16 v23, v5

    .line 28
    const-string v5, "context"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "migrationContainer"

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "queryExecutor"

    invoke-static {v10, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "transactionExecutor"

    invoke-static {v11, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "typeConverters"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "autoMigrationSpecs"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, v20

    move-object/from16 v20, v4

    move-object/from16 v4, v19

    move-object/from16 v19, v2

    .line 29
    new-instance v2, Landroidx/room/g;

    invoke-direct/range {v2 .. v23}, Landroidx/room/g;-><init>(Landroid/content/Context;Ljava/lang/String;Lub/d;Landroidx/room/t0;Ljava/util/List;ZLandroidx/room/s0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Ljava/util/List;Ljava/util/List;ZLtb/b;Lq83/j;)V

    .line 30
    iget-boolean v3, v1, Landroidx/room/g;->v:Z

    iput-boolean v3, v2, Landroidx/room/g;->v:Z

    move-object/from16 v3, p2

    .line 31
    invoke-virtual {v3, v2}, La6/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lub/e;

    iput-object v2, v0, Landroidx/room/n0;->g:Lub/e;

    .line 32
    new-instance v3, Llb/p;

    .line 33
    new-instance v4, Lbu/c;

    invoke-direct {v4, v2}, Lbu/c;-><init>(Lub/e;)V

    .line 34
    iget-object v1, v1, Landroidx/room/g;->b:Ljava/lang/String;

    if-nez v1, :cond_2

    const-string v1, ":memory:"

    :cond_2
    move-object/from16 v5, p3

    .line 35
    invoke-direct {v3, v4, v1, v5}, Llb/p;-><init>(Ltb/b;Ljava/lang/String;Lc93/m;)V

    .line 36
    iput-object v3, v0, Landroidx/room/n0;->f:Llb/b;

    .line 37
    sget-object v1, Landroidx/room/s0;->y:Landroidx/room/s0;

    if-ne v9, v1, :cond_3

    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    if-eqz v2, :cond_4

    .line 38
    invoke-interface {v2, v1}, Lub/e;->setWriteAheadLoggingEnabled(Z)V

    :cond_4
    return-void
.end method

.method public constructor <init>(Landroidx/room/g;Landroidx/room/g1;Landroidx/room/w0;)V
    .locals 11

    iget-object v0, p1, Landroidx/room/g;->g:Landroidx/room/s0;

    iget-object v1, p1, Landroidx/room/g;->c:Lub/d;

    iget-object v2, p1, Landroidx/room/g;->t:Ltb/b;

    iget-object v5, p1, Landroidx/room/g;->b:Ljava/lang/String;

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Landroidx/room/n0;->c:Landroidx/room/g;

    .line 41
    iput-object p2, p0, Landroidx/room/n0;->d:Landroidx/room/g1;

    .line 42
    iget-object v3, p1, Landroidx/room/g;->e:Ljava/util/List;

    if-nez v3, :cond_0

    sget-object v3, Lm83/y;->w:Lm83/y;

    :cond_0
    iput-object v3, p0, Landroidx/room/n0;->e:Ljava/util/List;

    const/4 v9, 0x1

    .line 43
    const-string v10, ":memory:"

    if-nez v2, :cond_3

    if-eqz v1, :cond_2

    .line 44
    iget-object v4, p1, Landroidx/room/g;->a:Landroid/content/Context;

    .line 45
    const-string p1, "context"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    new-instance v6, Landroidx/room/l0;

    invoke-virtual {p2}, Landroidx/room/g1;->getVersion()I

    move-result p1

    invoke-direct {v6, p0, p1}, Landroidx/room/l0;-><init>(Landroidx/room/n0;I)V

    .line 47
    new-instance v3, Lub/c;

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, Lub/c;-><init>(Landroid/content/Context;Ljava/lang/String;Lub/b;ZZ)V

    .line 48
    invoke-interface {v1, v3}, Lub/d;->a(Lub/c;)Lub/e;

    move-result-object p1

    iput-object p1, p0, Landroidx/room/n0;->g:Lub/e;

    .line 49
    new-instance p2, Llb/p;

    .line 50
    new-instance v1, Lbu/c;

    invoke-direct {v1, p1}, Lbu/c;-><init>(Lub/e;)V

    if-nez v5, :cond_1

    move-object v5, v10

    .line 51
    :cond_1
    invoke-direct {p2, v1, v5, p3}, Llb/p;-><init>(Ltb/b;Ljava/lang/String;Lc93/m;)V

    .line 52
    iput-object p2, p0, Landroidx/room/n0;->f:Llb/b;

    goto/16 :goto_3

    .line 53
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "SQLiteManager was constructed with both null driver and open helper factory!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const/4 p1, 0x0

    .line 54
    iput-object p1, p0, Landroidx/room/n0;->g:Lub/e;

    .line 55
    invoke-interface {v2}, Ltb/b;->z()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 56
    new-instance p1, Llb/p;

    .line 57
    new-instance p2, Lio/sentry/internal/debugmeta/c;

    invoke-direct {p2, p0, v2}, Lio/sentry/internal/debugmeta/c;-><init>(Landroidx/room/n0;Ltb/b;)V

    if-nez v5, :cond_4

    move-object v5, v10

    .line 58
    :cond_4
    invoke-direct {p1, p2, v5, p3}, Llb/p;-><init>(Ltb/b;Ljava/lang/String;Lc93/m;)V

    goto :goto_2

    :cond_5
    if-nez v5, :cond_6

    .line 59
    new-instance p1, Lio/sentry/internal/debugmeta/c;

    invoke-direct {p1, p0, v2}, Lio/sentry/internal/debugmeta/c;-><init>(Landroidx/room/n0;Ltb/b;)V

    .line 60
    invoke-static {p1}, Lbp/b;->E(Lio/sentry/internal/debugmeta/c;)Llb/e;

    move-result-object p1

    goto :goto_2

    .line 61
    :cond_6
    new-instance p1, Lio/sentry/internal/debugmeta/c;

    invoke-direct {p1, p0, v2}, Lio/sentry/internal/debugmeta/c;-><init>(Landroidx/room/n0;Ltb/b;)V

    .line 62
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    const/16 p3, 0x27

    const/4 v1, 0x2

    if-eq p2, v9, :cond_8

    if-ne p2, v1, :cond_7

    const/4 p2, 0x4

    goto :goto_0

    .line 63
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 64
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Can\'t get max number of reader for journal mode \'"

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    move p2, v9

    .line 65
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eq v2, v9, :cond_a

    if-ne v2, v1, :cond_9

    goto :goto_1

    .line 66
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 67
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Can\'t get max number of writers for journal mode \'"

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 68
    :cond_a
    :goto_1
    invoke-static {p1, v5, p2}, Lbp/b;->D(Lio/sentry/internal/debugmeta/c;Ljava/lang/String;I)Llb/e;

    move-result-object p1

    .line 69
    :goto_2
    iput-object p1, p0, Landroidx/room/n0;->f:Llb/b;

    .line 70
    :goto_3
    sget-object p1, Landroidx/room/s0;->y:Landroidx/room/s0;

    if-ne v0, p1, :cond_b

    goto :goto_4

    :cond_b
    const/4 v9, 0x0

    .line 71
    :goto_4
    iget-object p1, p0, Landroidx/room/n0;->g:Lub/e;

    if-eqz p1, :cond_c

    invoke-interface {p1, v9}, Lub/e;->setWriteAheadLoggingEnabled(Z)V

    :cond_c
    return-void
.end method

.method public static final a(Landroidx/room/n0;Ltb/a;)V
    .locals 5

    iget-object v0, p0, Landroidx/room/n0;->d:Landroidx/room/g1;

    const-string v1, "PRAGMA user_version = "

    invoke-static {p1}, Landroidx/room/n0;->b(Ltb/a;)V

    iget-object v2, p0, Landroidx/room/n0;->c:Landroidx/room/g;

    iget-object v3, v2, Landroidx/room/g;->g:Landroidx/room/s0;

    sget-object v4, Landroidx/room/s0;->y:Landroidx/room/s0;

    if-ne v3, v4, :cond_0

    const-string v3, "PRAGMA journal_mode = WAL"

    invoke-static {v3, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    goto :goto_0

    :cond_0
    const-string v3, "PRAGMA journal_mode = TRUNCATE"

    invoke-static {v3, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    :goto_0
    iget-object v2, v2, Landroidx/room/g;->g:Landroidx/room/s0;

    if-ne v2, v4, :cond_1

    const-string v2, "PRAGMA synchronous = NORMAL"

    invoke-static {v2, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    goto :goto_1

    :cond_1
    const-string v2, "PRAGMA synchronous = FULL"

    invoke-static {v2, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    :goto_1
    const-string v2, "PRAGMA user_version"

    invoke-interface {p1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_0
    invoke-interface {v2}, Ltb/c;->e1()Z

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ltb/c;->getLong(I)J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    long-to-int v3, v3

    const/4 v4, 0x0

    invoke-static {v2, v4}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Landroidx/room/g1;->getVersion()I

    move-result v2

    if-eq v3, v2, :cond_5

    const-string v2, "BEGIN EXCLUSIVE TRANSACTION"

    invoke-static {v2, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    if-nez v3, :cond_2

    :try_start_1
    invoke-virtual {p0, p1}, Landroidx/room/n0;->c(Ltb/a;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_2
    invoke-virtual {v0}, Landroidx/room/g1;->getVersion()I

    move-result v2

    invoke-virtual {p0, v3, v2, p1}, Landroidx/room/n0;->d(IILtb/a;)V

    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/room/g1;->getVersion()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :goto_3
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_4
    instance-of v1, v0, Ll83/m;

    if-nez v1, :cond_3

    move-object v1, v0

    check-cast v1, Ll83/a0;

    const-string v1, "END TRANSACTION"

    invoke-static {v1, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    :cond_3
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_5

    :cond_4
    const-string p0, "ROLLBACK TRANSACTION"

    invoke-static {p0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    throw v0

    :cond_5
    :goto_5
    invoke-virtual {p0, p1}, Landroidx/room/n0;->e(Ltb/a;)V

    return-void

    :catchall_1
    move-exception p0

    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    move-exception p1

    invoke-static {v2, p0}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static b(Ltb/a;)V
    .locals 5

    const-string v0, "PRAGMA busy_timeout"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v0

    :try_start_0
    invoke-interface {v0}, Ltb/c;->e1()Z

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ltb/c;->getLong(I)J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x0

    invoke-static {v0, v3}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    const-wide/16 v3, 0xbb8

    cmp-long v0, v1, v3

    if-gez v0, :cond_0

    const-string v0, "PRAGMA busy_timeout = 3000"

    invoke-static {v0, p0}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v0, p0}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final c(Ltb/a;)V
    .locals 7

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "SELECT count(*) FROM sqlite_master WHERE name != \'android_metadata\'"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v0

    :try_start_0
    invoke-interface {v0}, Ltb/c;->e1()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v0, v2}, Ltb/c;->getLong(I)J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-nez v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    :goto_0
    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    iget-object v0, p0, Landroidx/room/n0;->d:Landroidx/room/g1;

    invoke-virtual {v0, p1}, Landroidx/room/g1;->createAllTables(Ltb/a;)V

    if-nez v2, :cond_2

    invoke-virtual {v0, p1}, Landroidx/room/g1;->onValidateSchema(Ltb/a;)Landroidx/room/f1;

    move-result-object v1

    iget-boolean v2, v1, Landroidx/room/f1;->a:Z

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Pre-packaged database has an invalid schema: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/room/f1;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, Landroidx/room/n0;->f(Ltb/a;)V

    invoke-virtual {v0, p1}, Landroidx/room/g1;->onCreate(Ltb/a;)V

    iget-object v0, p0, Landroidx/room/n0;->e:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/room/q0;

    invoke-virtual {v1, p1}, Landroidx/room/q0;->onCreate(Ltb/a;)V

    goto :goto_2

    :cond_3
    return-void

    :goto_3
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v0, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final d(IILtb/a;)V
    .locals 4

    const-string v0, "connection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/n0;->c:Landroidx/room/g;

    iget-object v1, v0, Landroidx/room/g;->d:Landroidx/room/t0;

    invoke-static {v1, p1, p2}, Lhg3/i;->N(Landroidx/room/t0;II)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Landroidx/room/n0;->d:Landroidx/room/g1;

    if-eqz v1, :cond_2

    invoke-virtual {v2, p3}, Landroidx/room/g1;->onPreMigrate(Ltb/a;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lmb/b;

    invoke-virtual {p2, p3}, Lmb/b;->migrate(Ltb/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2, p3}, Landroidx/room/g1;->onValidateSchema(Ltb/a;)Landroidx/room/f1;

    move-result-object p1

    iget-boolean p2, p1, Landroidx/room/f1;->a:Z

    if-eqz p2, :cond_1

    invoke-virtual {v2, p3}, Landroidx/room/g1;->onPostMigrate(Ltb/a;)V

    invoke-virtual {p0, p3}, Landroidx/room/n0;->f(Ltb/a;)V

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Migration didn\'t properly handle: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Landroidx/room/f1;->b:Ljava/lang/String;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    invoke-static {v0, p1, p2}, Lhg3/i;->Y(Landroidx/room/g;II)Z

    move-result v1

    if-nez v1, :cond_a

    iget-boolean p1, v0, Landroidx/room/g;->s:Z

    if-eqz p1, :cond_7

    const-string p1, "SELECT name, type FROM sqlite_master WHERE type = \'table\' OR type = \'view\'"

    invoke-interface {p3, p1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    :try_start_0
    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object p2

    :cond_3
    :goto_1
    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-interface {p1, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "sqlite_"

    invoke-static {v0, v3, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "android_metadata"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v1, 0x1

    invoke-interface {p1, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "view"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_5
    invoke-static {p2}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    invoke-virtual {p2, v1}, Ln83/c;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    :goto_2
    move-object p2, p1

    check-cast p2, Ln83/b;

    invoke-virtual {p2}, Ln83/b;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p2}, Ln83/b;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll83/k;

    iget-object v0, p2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object p2, p2, Ll83/k;->x:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const/16 v1, 0x60

    if-eqz p2, :cond_6

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v3, "DROP VIEW IF EXISTS `"

    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p3}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    goto :goto_2

    :cond_6
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v3, "DROP TABLE IF EXISTS `"

    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p3}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    goto :goto_2

    :goto_3
    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p3

    invoke-static {p1, p2}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p3

    :cond_7
    invoke-virtual {v2, p3}, Landroidx/room/g1;->dropAllTables(Ltb/a;)V

    :cond_8
    iget-object p1, p0, Landroidx/room/n0;->e:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/room/q0;

    invoke-virtual {p2, p3}, Landroidx/room/q0;->onDestructiveMigration(Ltb/a;)V

    goto :goto_4

    :cond_9
    invoke-virtual {v2, p3}, Landroidx/room/g1;->createAllTables(Ltb/a;)V

    return-void

    :cond_a
    new-instance p3, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "A migration from "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p3
.end method

.method public final e(Ltb/a;)V
    .locals 9

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Pre-packaged database has an invalid schema: "

    const-string v1, "SELECT 1 FROM sqlite_master WHERE type = \'table\' AND name = \'room_master_table\'"

    invoke-interface {p1, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v1, v4}, Ltb/c;->getLong(I)J

    move-result-wide v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v7, 0x0

    cmp-long v2, v5, v7

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :cond_0
    move v2, v4

    :goto_0
    const/4 v5, 0x0

    invoke-static {v1, v5}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    iget-object v1, p0, Landroidx/room/n0;->d:Landroidx/room/g1;

    if-eqz v2, :cond_3

    const-string v0, "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v0

    :try_start_1
    invoke-interface {v0}, Ltb/c;->e1()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_1
    move-object v2, v5

    :goto_1
    invoke-static {v0, v5}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    invoke-virtual {v1}, Landroidx/room/g1;->getIdentityHash()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v1}, Landroidx/room/g1;->getLegacyIdentityHash()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_5

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroidx/room/g1;->getIdentityHash()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", found: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_2
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    move-exception v1

    invoke-static {v0, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v1

    :cond_3
    const-string v2, "BEGIN EXCLUSIVE TRANSACTION"

    invoke-static {v2, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    :try_start_3
    invoke-virtual {v1, p1}, Landroidx/room/g1;->onValidateSchema(Ltb/a;)Landroidx/room/f1;

    move-result-object v2

    iget-boolean v4, v2, Landroidx/room/f1;->a:Z

    if-eqz v4, :cond_4

    invoke-virtual {v1, p1}, Landroidx/room/g1;->onPostMigrate(Ltb/a;)V

    invoke-virtual {p0, p1}, Landroidx/room/n0;->f(Ltb/a;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_4

    :catchall_3
    move-exception v0

    goto :goto_3

    :cond_4
    new-instance v4, Ljava/lang/IllegalStateException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v2, Landroidx/room/f1;->b:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :goto_3
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_4
    instance-of v2, v0, Ll83/m;

    if-nez v2, :cond_5

    move-object v2, v0

    check-cast v2, Ll83/a0;

    const-string v2, "END TRANSACTION"

    invoke-static {v2, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    :cond_5
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_8

    :cond_6
    :goto_5
    invoke-virtual {v1, p1}, Landroidx/room/g1;->onOpen(Ltb/a;)V

    iget-object v0, p0, Landroidx/room/n0;->e:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/room/q0;

    invoke-virtual {v1, p1}, Landroidx/room/q0;->onOpen(Ltb/a;)V

    goto :goto_6

    :cond_7
    iput-boolean v3, p0, Landroidx/room/n0;->a:Z

    return-void

    :cond_8
    const-string v1, "ROLLBACK TRANSACTION"

    invoke-static {v1, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    throw v0

    :goto_7
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :catchall_4
    move-exception v0

    invoke-static {v1, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final f(Ltb/a;)V
    .locals 3

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    iget-object v0, p0, Landroidx/room/n0;->d:Landroidx/room/g1;

    invoke-virtual {v0}, Landroidx/room/g1;->getIdentityHash()Ljava/lang/String;

    move-result-object v0

    const-string v1, "hash"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\')"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method
