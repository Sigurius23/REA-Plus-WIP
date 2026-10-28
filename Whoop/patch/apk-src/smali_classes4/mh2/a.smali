.class public final Lmh2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00082\u0006\u0010\r\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00082\u0006\u0010\r\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\r\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lmh2/a;",
        "",
        "Lku0/a;",
        "strapMetadataDao",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lku0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "",
        "id",
        "Loh2/d;",
        "e",
        "(ILq83/d;)Ljava/lang/Object;",
        "version",
        "f",
        "(Loh2/d;Lq83/d;)Ljava/lang/Object;",
        "i",
        "h",
        "(I)Loh2/d;",
        "historyHeartDataVersion",
        "j",
        "(Loh2/d;)I",
        "Loh2/a;",
        "g",
        "(I)Loh2/a;",
        "a",
        "Lku0/a;",
        "b",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Ltr2/n;",
        "c",
        "Ltr2/n;",
        "logger",
        "Lmh2/c;",
        "d",
        "Lmh2/c;",
        "versionCache",
        "strap-metadata_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lku0/a;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final c:Ltr2/n;

.field private final d:Lmh2/c;


# direct methods
.method public constructor <init>(Lku0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "strapMetadataDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmh2/a;->a:Lku0/a;

    iput-object p2, p0, Lmh2/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "StrapMetadataDaoInteractor"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lmh2/a;->c:Ltr2/n;

    new-instance p1, Lmh2/c;

    invoke-direct {p1}, Lmh2/c;-><init>()V

    iput-object p1, p0, Lmh2/a;->d:Lmh2/c;

    return-void
.end method

.method public static final synthetic a(Lmh2/a;ILq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lmh2/a;->e(ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lmh2/a;Loh2/d;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lmh2/a;->f(Loh2/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lmh2/a;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lmh2/a;->c:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic d(Lmh2/a;Loh2/d;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lmh2/a;->i(Loh2/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final e(ILq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Loh2/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lmh2/a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lmh2/a$a;

    iget v1, v0, Lmh2/a$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmh2/a$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lmh2/a$a;

    invoke-direct {v0, p0, p2}, Lmh2/a$a;-><init>(Lmh2/a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lmh2/a$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lmh2/a$a;->z:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lmh2/a;->c:Ltr2/n;

    const-string v2, "Fetching HistoryHeartDataVersion from room db"

    new-array v5, v4, [Lqr2/a$a;

    invoke-interface {p2, v2, v5}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :try_start_1
    iget-object p2, p0, Lmh2/a;->a:Lku0/a;

    iput p1, v0, Lmh2/a$a;->w:I

    iput v3, v0, Lmh2/a$a;->z:I

    invoke-interface {p2, p1, v0}, Lku0/a;->c(ILq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Llu0/c;

    iget-object p1, p0, Lmh2/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v0, "castle-fw-version-string-read"

    invoke-interface {p1, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p2, p1}, Lph2/a;->a(Llu0/c;Z)Loh2/d;

    move-result-object p1
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    iget-object p2, p0, Lmh2/a;->c:Ltr2/n;

    const-string v0, "Caught an exception when trying to fetch HeartDataVersionDto from HeartDataVersionDao!"

    new-array v1, v4, [Lqr2/a$a;

    invoke-interface {p2, v0, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_4

    :goto_3
    iget-object p2, p0, Lmh2/a;->c:Ltr2/n;

    const-string v0, "Caught a SQLiteException when trying to fetch HeartDataVersionDto from HeartDataVersionDao!"

    new-array v1, v4, [Lqr2/a$a;

    invoke-interface {p2, v0, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_4
    const/4 p1, 0x0

    return-object p1
.end method

.method private final f(Loh2/d;Lq83/d;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loh2/d;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lmh2/a$b;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lmh2/a$b;

    iget v3, v2, Lmh2/a$b;->G:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lmh2/a$b;->G:I

    goto :goto_0

    :cond_0
    new-instance v2, Lmh2/a$b;

    invoke-direct {v2, v1, v0}, Lmh2/a$b;-><init>(Lmh2/a;Lq83/d;)V

    :goto_0
    iget-object v0, v2, Lmh2/a$b;->E:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lmh2/a$b;->G:I

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v3, v2, Lmh2/a$b;->z:Ljava/lang/Object;

    check-cast v3, Loh2/b$b;

    iget-object v3, v2, Lmh2/a$b;->y:Ljava/lang/Object;

    check-cast v3, Loh2/e;

    iget-object v3, v2, Lmh2/a$b;->x:Ljava/lang/Object;

    check-cast v3, Loh2/c;

    iget-object v2, v2, Lmh2/a$b;->w:Ljava/lang/Object;

    check-cast v2, Loh2/d;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x0

    const/16 v19, 0x0

    goto/16 :goto_3

    :catch_0
    move-exception v0

    const/4 v2, 0x0

    :goto_1
    const/16 v19, 0x0

    goto/16 :goto_4

    :catch_1
    move-exception v0

    const/4 v2, 0x0

    :goto_2
    const/16 v19, 0x0

    goto/16 :goto_5

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Loh2/d;->f()Loh2/c;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Loh2/d;->g()Loh2/e;

    move-result-object v4

    :try_start_1
    invoke-virtual/range {p1 .. p1}, Loh2/d;->e()Loh2/b;

    move-result-object v8

    const-string v9, "getFirmwareVersion(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, Lmh2/b;->a(Loh2/b;)Loh2/b$b;

    move-result-object v8

    move-object v9, v3

    iget-object v3, v1, Lmh2/a;->a:Lku0/a;

    invoke-virtual {v0}, Loh2/c;->a()J

    move-result-wide v10

    long-to-int v10, v10

    invoke-virtual {v0}, Loh2/c;->c()J

    move-result-wide v11

    long-to-int v11, v11

    invoke-virtual {v0}, Loh2/c;->b()J

    move-result-wide v12

    long-to-int v0, v12

    invoke-virtual {v8}, Loh2/b$b;->c()J

    move-result-wide v12

    long-to-int v12, v12

    invoke-virtual {v8}, Loh2/b$b;->d()J

    move-result-wide v13

    long-to-int v13, v13

    invoke-virtual {v8}, Loh2/b$b;->b()J

    move-result-wide v14

    long-to-int v14, v14

    invoke-virtual {v8}, Loh2/b$b;->e()J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual/range {p1 .. p1}, Loh2/d;->e()Loh2/b;

    move-result-object v6

    invoke-interface {v6}, Loh2/b;->a()Ljava/lang/String;

    move-result-object v6

    move v8, v12

    invoke-virtual {v4}, Loh2/e;->c()S

    move-result v12

    move/from16 v16, v8

    move v8, v13

    invoke-virtual {v4}, Loh2/e;->d()S

    move-result v13

    invoke-virtual {v4}, Loh2/e;->e()S

    move-result v4
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const/16 v17, 0x0

    :try_start_2
    invoke-virtual/range {p1 .. p1}, Loh2/d;->d()B

    move-result v15

    move/from16 v18, v16

    invoke-virtual/range {p1 .. p1}, Loh2/d;->c()B

    move-result v16

    invoke-virtual/range {p1 .. p1}, Loh2/d;->h()Ljava/lang/String;

    move-result-object v7

    move/from16 v20, v0

    const-string v0, "getStrapId(...)"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    move-object v0, v3

    const/4 v3, 0x0

    :try_start_3
    iput-object v3, v2, Lmh2/a$b;->w:Ljava/lang/Object;

    iput-object v3, v2, Lmh2/a$b;->x:Ljava/lang/Object;

    iput-object v3, v2, Lmh2/a$b;->y:Ljava/lang/Object;

    iput-object v3, v2, Lmh2/a$b;->z:Ljava/lang/Object;
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6

    const/4 v3, 0x1

    :try_start_4
    iput v3, v2, Lmh2/a$b;->G:I
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    move/from16 v3, v18

    move-object/from16 v18, v2

    move/from16 v2, v17

    move-object/from16 v17, v7

    move v7, v3

    move-object v3, v0

    move-object v0, v9

    move v9, v14

    const/16 v19, 0x0

    move v14, v4

    move v4, v10

    move v10, v5

    move v5, v11

    move-object v11, v6

    move/from16 v6, v20

    :try_start_5
    invoke-interface/range {v3 .. v18}, Lku0/a;->b(IIIIIIILjava/lang/String;IIIIILjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    return-object v0

    :cond_3
    move-object v0, v3

    :goto_3
    check-cast v0, Ljava/lang/Integer;
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    return-object v0

    :catch_2
    move-exception v0

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_5

    :catch_4
    move-exception v0

    move/from16 v2, v17

    goto/16 :goto_1

    :catch_5
    move-exception v0

    move/from16 v2, v17

    goto/16 :goto_2

    :catch_6
    move-exception v0

    move-object/from16 v19, v3

    move/from16 v2, v17

    goto :goto_4

    :catch_7
    move-exception v0

    move-object/from16 v19, v3

    move/from16 v2, v17

    goto :goto_5

    :goto_4
    iget-object v3, v1, Lmh2/a;->c:Ltr2/n;

    const-string v4, "Caught an exception when trying to fetch version_id from HeartDataVersionDao!"

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v3, v4, v0, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_6

    :goto_5
    iget-object v3, v1, Lmh2/a;->c:Ltr2/n;

    const-string v4, "Caught a SQLiteException when trying to fetch version_id from HeartDataVersionDao!"

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v3, v4, v0, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_6
    return-object v19
.end method

.method private final i(Loh2/d;Lq83/d;)Ljava/lang/Object;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loh2/d;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    const-string v2, "getFirmwareVersion(...)"

    instance-of v3, v0, Lmh2/a$d;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lmh2/a$d;

    iget v4, v3, Lmh2/a$d;->H:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lmh2/a$d;->H:I

    goto :goto_0

    :cond_0
    new-instance v3, Lmh2/a$d;

    invoke-direct {v3, v1, v0}, Lmh2/a$d;-><init>(Lmh2/a;Lq83/d;)V

    :goto_0
    iget-object v0, v3, Lmh2/a$d;->F:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lmh2/a$d;->H:I

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v5, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v2, v3, Lmh2/a$d;->E:Ljava/lang/Object;

    check-cast v2, Llu0/c;

    iget-object v2, v3, Lmh2/a$d;->z:Ljava/lang/Object;

    check-cast v2, Loh2/b$b;

    iget-object v2, v3, Lmh2/a$d;->y:Ljava/lang/Object;

    check-cast v2, Loh2/e;

    iget-object v2, v3, Lmh2/a$d;->x:Ljava/lang/Object;

    check-cast v2, Loh2/c;

    iget-object v2, v3, Lmh2/a$d;->w:Ljava/lang/Object;

    check-cast v2, Loh2/d;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :catch_0
    move-exception v0

    goto/16 :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, v3, Lmh2/a$d;->E:Ljava/lang/Object;

    check-cast v2, Llu0/c;

    iget-object v2, v3, Lmh2/a$d;->z:Ljava/lang/Object;

    check-cast v2, Loh2/b$b;

    iget-object v2, v3, Lmh2/a$d;->y:Ljava/lang/Object;

    check-cast v2, Loh2/e;

    iget-object v2, v3, Lmh2/a$d;->x:Ljava/lang/Object;

    check-cast v2, Loh2/c;

    iget-object v2, v3, Lmh2/a$d;->w:Ljava/lang/Object;

    check-cast v2, Loh2/d;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v7, 0x0

    goto/16 :goto_1

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Loh2/d;->f()Loh2/c;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Loh2/d;->g()Loh2/e;

    move-result-object v5

    :try_start_2
    invoke-virtual/range {p1 .. p1}, Loh2/d;->e()Loh2/b;

    move-result-object v9

    invoke-static {v9, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, Lmh2/b;->a(Loh2/b;)Loh2/b$b;

    move-result-object v9

    new-instance v10, Llu0/c;

    invoke-virtual {v0}, Loh2/c;->a()J

    move-result-wide v11

    long-to-int v12, v11

    invoke-virtual {v0}, Loh2/c;->c()J

    move-result-wide v13

    long-to-int v13, v13

    invoke-virtual {v0}, Loh2/c;->b()J

    move-result-wide v14

    long-to-int v14, v14

    invoke-virtual {v9}, Loh2/b$b;->c()J

    move-result-wide v6

    long-to-int v15, v6

    invoke-virtual {v9}, Loh2/b$b;->d()J

    move-result-wide v6

    long-to-int v6, v6

    move-object v11, v9

    invoke-virtual {v11}, Loh2/b$b;->b()J

    move-result-wide v8

    long-to-int v8, v8

    move/from16 v17, v8

    invoke-virtual {v11}, Loh2/b$b;->e()J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual/range {p1 .. p1}, Loh2/d;->e()Loh2/b;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Loh2/e;->c()S

    move-result v20

    invoke-virtual {v5}, Loh2/e;->d()S

    move-result v21

    invoke-virtual {v5}, Loh2/e;->e()S

    move-result v22

    invoke-virtual/range {p1 .. p1}, Loh2/d;->d()B

    move-result v23

    invoke-virtual/range {p1 .. p1}, Loh2/d;->c()B

    move-result v24

    invoke-virtual/range {p1 .. p1}, Loh2/d;->h()Ljava/lang/String;

    move-result-object v2

    const-string v5, "getStrapId(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v26, 0x1

    const/16 v27, 0x0

    const/4 v11, 0x0

    move-object/from16 v25, v2

    move/from16 v16, v6

    move/from16 v18, v7

    move-object/from16 v19, v8

    invoke-direct/range {v10 .. v27}, Llu0/c;-><init>(IIIIIIIILoh2/b;IIIIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, v1, Lmh2/a;->a:Lku0/a;

    move-object/from16 v5, p1

    iput-object v5, v3, Lmh2/a$d;->w:Ljava/lang/Object;

    const/4 v7, 0x0

    iput-object v7, v3, Lmh2/a$d;->x:Ljava/lang/Object;

    iput-object v7, v3, Lmh2/a$d;->y:Ljava/lang/Object;

    iput-object v7, v3, Lmh2/a$d;->z:Ljava/lang/Object;

    iput-object v7, v3, Lmh2/a$d;->E:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, v3, Lmh2/a$d;->H:I

    invoke-interface {v2, v10, v3}, Lku0/a;->a(Llu0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, v5

    :goto_1
    iput-object v7, v3, Lmh2/a$d;->w:Ljava/lang/Object;

    iput-object v7, v3, Lmh2/a$d;->x:Ljava/lang/Object;

    iput-object v7, v3, Lmh2/a$d;->y:Ljava/lang/Object;

    iput-object v7, v3, Lmh2/a$d;->z:Ljava/lang/Object;

    iput-object v7, v3, Lmh2/a$d;->E:Ljava/lang/Object;

    const/4 v0, 0x2

    iput v0, v3, Lmh2/a$d;->H:I

    invoke-direct {v1, v2, v3}, Lmh2/a;->f(Loh2/d;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_5

    :goto_2
    return-object v4

    :cond_5
    :goto_3
    check-cast v0, Ljava/lang/Integer;
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :goto_4
    iget-object v2, v1, Lmh2/a;->c:Ltr2/n;

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    const-string v4, "Caught an exception when trying to insert version_id in HeartDataVersionDao"

    invoke-interface {v2, v4, v0, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const/4 v7, 0x0

    return-object v7
.end method


# virtual methods
.method public final g(I)Loh2/a;
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    invoke-virtual {p0, p1}, Lmh2/a;->h(I)Loh2/d;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Loh2/d;->a()Loh2/a;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v1
.end method

.method public final h(I)Loh2/d;
    .locals 3

    iget-object v0, p0, Lmh2/a;->d:Lmh2/c;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lmh2/c;->a(J)Loh2/d;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Lmh2/a$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lmh2/a$c;-><init>(Lmh2/a;ILq83/d;)V

    invoke-static {v0, v1}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Loh2/d;

    return-object p1
.end method

.method public final j(Loh2/d;)I
    .locals 6

    const-string v0, "historyHeartDataVersion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lmh2/a;->d:Lmh2/c;

    invoke-virtual {v0, p1}, Lmh2/c;->b(Loh2/d;)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    long-to-int v0, v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_1
    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v2, Lmh2/a$e;

    invoke-direct {v2, p0, p1, v1}, Lmh2/a$e;-><init>(Lmh2/a;Loh2/d;Lq83/d;)V

    invoke-static {v0, v2}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    const/4 v3, 0x0

    if-nez v2, :cond_2

    iget-object v2, p0, Lmh2/a;->c:Ltr2/n;

    const-string v4, "Trying to save a new version"

    new-array v5, v3, [Lqr2/a$a;

    invoke-interface {v2, v4, v5}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v2, Lmh2/a$f;

    invoke-direct {v2, p0, p1, v1}, Lmh2/a$f;-><init>(Lmh2/a;Loh2/d;Lq83/d;)V

    invoke-static {v0, v2}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Integer;

    :cond_2
    if-nez v2, :cond_3

    iget-object p1, p0, Lmh2/a;->c:Ltr2/n;

    const-string v0, "Failed to save a new version, returning missing"

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 p1, -0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lmh2/a;->d:Lmh2/c;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v3, v1

    invoke-virtual {v0, v3, v4, p1}, Lmh2/c;->c(JLoh2/d;)V

    :goto_1
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method
