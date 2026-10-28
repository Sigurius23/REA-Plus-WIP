.class public final Lw92/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001e\u0010\u0013\u001a\u00020\u00122\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u0017\u0010\u000eJ(\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ \u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u001b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u001c\u0010\u000eJ8\u0010 \u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u000c2\u0006\u0010\u001e\u001a\u00020\u000c2\u0006\u0010\u001f\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000cH\u0086@\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*\u00a8\u0006,"
    }
    d2 = {
        "Lw92/b;",
        "",
        "Lmu0/a;",
        "metricsDataDao",
        "Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;",
        "cachedStrapDataDao",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "<init>",
        "(Lmu0/a;Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;Lzr2/a;)V",
        "",
        "packetRevision",
        "",
        "e",
        "(ILq83/d;)Ljava/lang/Object;",
        "",
        "Lnu0/a;",
        "metricsDataDtoList",
        "Ll83/a0;",
        "i",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "g",
        "()I",
        "h",
        "versionId",
        "k",
        "(IILq83/d;)Ljava/lang/Object;",
        "seconds",
        "j",
        "numRecords",
        "oldestTimeStamp",
        "newestTimeStamp",
        "f",
        "(JJJIJLq83/d;)Ljava/lang/Object;",
        "a",
        "Lmu0/a;",
        "b",
        "Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;",
        "c",
        "Lzr2/a;",
        "Ltr2/n;",
        "d",
        "Ltr2/n;",
        "logger",
        "core_release"
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
.field private final a:Lmu0/a;

.field private final b:Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;

.field private final c:Lzr2/a;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Lmu0/a;Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;Lzr2/a;)V
    .locals 1

    const-string v0, "metricsDataDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cachedStrapDataDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateAndTimeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw92/b;->a:Lmu0/a;

    iput-object p2, p0, Lw92/b;->b:Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;

    iput-object p3, p0, Lw92/b;->c:Lzr2/a;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "HeartDataTableRoom"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lw92/b;->d:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lw92/b;)Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;
    .locals 0

    iget-object p0, p0, Lw92/b;->b:Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;

    return-object p0
.end method

.method public static final synthetic b(Lw92/b;)Lzr2/a;
    .locals 0

    iget-object p0, p0, Lw92/b;->c:Lzr2/a;

    return-object p0
.end method

.method public static final synthetic c(Lw92/b;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lw92/b;->d:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic d(Lw92/b;)Lmu0/a;
    .locals 0

    iget-object p0, p0, Lw92/b;->a:Lmu0/a;

    return-object p0
.end method


# virtual methods
.method public final e(ILq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lw92/b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lw92/b$a;

    iget v1, v0, Lw92/b$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw92/b$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw92/b$a;

    invoke-direct {v0, p0, p2}, Lw92/b$a;-><init>(Lw92/b;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lw92/b$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lw92/b$a;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lw92/b;->a:Lmu0/a;

    iput p1, v0, Lw92/b$a;->w:I

    iput v3, v0, Lw92/b$a;->z:I

    invoke-interface {p2, p1, v0}, Lmu0/a;->f(ILq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    int-to-long p1, p1

    goto :goto_3

    :goto_2
    iget-object p2, p0, Lw92/b;->d:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Caught an exception when trying to count packets in metrics database"

    invoke-interface {p2, v1, p1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const-wide/16 p1, 0x0

    :goto_3
    new-instance v0, Ljava/lang/Long;

    invoke-direct {v0, p1, p2}, Ljava/lang/Long;-><init>(J)V

    return-object v0
.end method

.method public final f(JJJIJLq83/d;)Ljava/lang/Object;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJIJ",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-wide/from16 v2, p8

    move-object/from16 v0, p10

    const-string v4, "Current metrics timestamps in Room DB = "

    const-string v5, "Deleted "

    instance-of v6, v0, Lw92/b$b;

    if-eqz v6, :cond_0

    move-object v6, v0

    check-cast v6, Lw92/b$b;

    iget v7, v6, Lw92/b$b;->J:I

    const/high16 v8, -0x80000000

    and-int v9, v7, v8

    if-eqz v9, :cond_0

    sub-int/2addr v7, v8

    iput v7, v6, Lw92/b$b;->J:I

    goto :goto_0

    :cond_0
    new-instance v6, Lw92/b$b;

    invoke-direct {v6, v1, v0}, Lw92/b$b;-><init>(Lw92/b;Lq83/d;)V

    :goto_0
    iget-object v0, v6, Lw92/b$b;->H:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v8, v6, Lw92/b$b;->J:I

    const/4 v9, 0x3

    const/4 v10, 0x2

    const/4 v11, 0x1

    if-eqz v8, :cond_4

    if-eq v8, v11, :cond_3

    if-eq v8, v10, :cond_2

    if-ne v8, v9, :cond_1

    iget-object v2, v6, Lw92/b$b;->G:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v16, v4

    goto/16 :goto_4

    :catch_0
    move-exception v0

    goto/16 :goto_6

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v2, v6, Lw92/b$b;->F:I

    iget-wide v10, v6, Lw92/b$b;->z:J

    iget v3, v6, Lw92/b$b;->E:I

    iget-wide v13, v6, Lw92/b$b;->y:J

    move-wide v15, v10

    iget-wide v9, v6, Lw92/b$b;->x:J

    move-wide/from16 p1, v13

    iget-wide v12, v6, Lw92/b$b;->w:J

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v8, v6

    move-wide v5, v15

    move-wide/from16 v14, p1

    move-object/from16 v16, v4

    move-object v4, v7

    goto/16 :goto_2

    :cond_3
    iget-wide v2, v6, Lw92/b$b;->z:J

    iget v9, v6, Lw92/b$b;->E:I

    iget-wide v11, v6, Lw92/b$b;->y:J

    iget-wide v13, v6, Lw92/b$b;->x:J

    move/from16 v16, v9

    iget-wide v8, v6, Lw92/b$b;->w:J

    :try_start_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-wide/from16 v18, v8

    move-wide v9, v2

    move-wide/from16 v2, v18

    move-object v15, v0

    move-object v8, v6

    move-object v0, v7

    move/from16 v7, v16

    const/4 v6, 0x0

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, v7

    :try_start_3
    iget-object v7, v1, Lw92/b;->a:Lmu0/a;

    const/4 v8, 0x0

    long-to-int v15, v2

    move-wide/from16 v12, p1

    iput-wide v12, v6, Lw92/b$b;->w:J

    move-wide/from16 v8, p3

    iput-wide v8, v6, Lw92/b$b;->x:J

    move/from16 v16, v15

    move-wide/from16 v14, p5

    iput-wide v14, v6, Lw92/b$b;->y:J

    move/from16 v10, p7

    iput v10, v6, Lw92/b$b;->E:I

    iput-wide v2, v6, Lw92/b$b;->z:J

    iput v11, v6, Lw92/b$b;->J:I

    move-wide/from16 v18, v12

    move-wide v11, v8

    move-wide/from16 v8, v18

    move-wide v13, v14

    move/from16 v15, v16

    move-object/from16 v16, v6

    const/4 v6, 0x0

    invoke-interface/range {v7 .. v16}, Lmu0/a;->b(JIJJILq83/d;)Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v8, v16

    if-ne v7, v0, :cond_5

    move-object v4, v0

    goto/16 :goto_3

    :cond_5
    move-wide/from16 v13, p3

    move-wide/from16 v11, p5

    move-wide v9, v2

    move-object v15, v7

    move-wide/from16 v2, p1

    move/from16 v7, p7

    :goto_1
    check-cast v15, Ljava/lang/Number;

    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    move-result v15

    iget-object v6, v1, Lw92/b;->d:Ltr2/n;

    move-object/from16 v16, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " of R"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " data from Room db"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v17, v0

    const/4 v5, 0x0

    new-array v0, v5, [Lqr2/a$a;

    invoke-interface {v6, v4, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, v1, Lw92/b;->a:Lmu0/a;

    iput-wide v2, v8, Lw92/b$b;->w:J

    iput-wide v13, v8, Lw92/b$b;->x:J

    iput-wide v11, v8, Lw92/b$b;->y:J

    iput v7, v8, Lw92/b$b;->E:I

    iput-wide v9, v8, Lw92/b$b;->z:J

    iput v15, v8, Lw92/b$b;->F:I

    const/4 v4, 0x2

    iput v4, v8, Lw92/b$b;->J:I

    invoke-interface {v0, v7, v8}, Lmu0/a;->g(ILq83/d;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v4, v17

    if-ne v0, v4, :cond_6

    goto :goto_3

    :cond_6
    move-wide v5, v9

    move-wide v9, v13

    move-wide/from16 v18, v2

    move v3, v7

    move v2, v15

    move-wide v14, v11

    move-wide/from16 v12, v18

    :goto_2
    check-cast v0, Ljava/lang/Long;

    iget-object v7, v1, Lw92/b;->a:Lmu0/a;

    iput-object v0, v8, Lw92/b$b;->G:Ljava/lang/Object;

    iput-wide v12, v8, Lw92/b$b;->w:J

    iput-wide v9, v8, Lw92/b$b;->x:J

    iput-wide v14, v8, Lw92/b$b;->y:J

    iput v3, v8, Lw92/b$b;->E:I

    iput-wide v5, v8, Lw92/b$b;->z:J

    iput v2, v8, Lw92/b$b;->F:I

    const/4 v2, 0x3

    iput v2, v8, Lw92/b$b;->J:I

    invoke-interface {v7, v3, v8}, Lmu0/a;->k(ILq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_7

    :goto_3
    return-object v4

    :cond_7
    move-object/from16 v18, v2

    move-object v2, v0

    move-object/from16 v0, v18

    :goto_4
    check-cast v0, Ljava/lang/Long;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :try_start_4
    iget-object v3, v1, Lw92/b;->d:Ltr2/n;

    const/4 v4, 0x0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-static {v5, v6}, Lor2/v1;->b(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_8
    move-object v0, v4

    :goto_5
    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Lor2/v1;->b(J)Ljava/lang/String;

    move-result-object v4

    :cond_9
    new-instance v2, Ljava/lang/StringBuilder;

    move-object/from16 v5, v16

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " - "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v8, 0x0

    new-array v2, v8, [Lqr2/a$a;

    invoke-interface {v3, v0, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_4
    .catch Ljava/lang/NullPointerException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_7

    :goto_6
    iget-object v2, v1, Lw92/b;->d:Ltr2/n;

    const-string v3, "Exception when trying to delete metrics data with time range"

    const/4 v8, 0x0

    new-array v4, v8, [Lqr2/a$a;

    invoke-interface {v2, v3, v0, v4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :catch_1
    :goto_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public final g()I
    .locals 3

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Lw92/b$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lw92/b$c;-><init>(Lw92/b;Lq83/d;)V

    invoke-static {v0, v1}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final h(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Lw92/b$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lw92/b$d;-><init>(Lw92/b;ILq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final i(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnu0/a;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lw92/b$e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lw92/b$e;

    iget v1, v0, Lw92/b$e;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw92/b$e;->z:I

    :goto_0
    move-object p2, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lw92/b$e;

    invoke-direct {v0, p0, p2}, Lw92/b$e;-><init>(Lw92/b;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, p2, Lw92/b$e;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p2, Lw92/b$e;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, p2, Lw92/b$e;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_7

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_5

    :catch_1
    move-exception v0

    move-object p1, v0

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, p2, Lw92/b$e;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object v0, p0, Lw92/b;->a:Lmu0/a;

    iput-object p1, p2, Lw92/b$e;->w:Ljava/lang/Object;

    iput v5, p2, Lw92/b$e;->z:I

    invoke-interface {v0, p1, p2}, Lmu0/a;->insertList(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    goto :goto_4

    :cond_4
    :goto_2
    iget-object v0, p0, Lw92/b;->b:Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {p1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnu0/a;

    new-instance v6, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;

    invoke-virtual {v5}, Lnu0/a;->d()I

    move-result v7

    invoke-virtual {v5}, Lnu0/a;->getTimestamp()J

    move-result-wide v8

    invoke-virtual {v5}, Lnu0/a;->a()Ljava/nio/ByteBuffer;

    move-result-object v10

    invoke-virtual {v5}, Lnu0/a;->b()I

    move-result v11

    invoke-direct/range {v6 .. v11}, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;-><init>(IJLjava/nio/ByteBuffer;I)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lw92/b;->c:Lzr2/a;

    invoke-interface {p1}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object p1

    sget-object v5, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-virtual {p1, v5}, Lorg/joda/time/DateTime;->withZone(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object p1

    const/16 v5, 0xf

    invoke-virtual {p1, v5}, Lorg/joda/time/DateTime;->minusMinutes(I)Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v5

    const/4 p1, 0x0

    iput-object p1, p2, Lw92/b$e;->w:Ljava/lang/Object;

    iput v4, p2, Lw92/b$e;->z:I

    invoke-interface {v0, v2, v5, v6, p2}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;->insertAllThenDeleteOldHeartDataByTimeStamp(Ljava/util/List;JLq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-ne p1, v1, :cond_6

    :goto_4
    return-object v1

    :goto_5
    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    invoke-static {p2}, Lbc3/f0;->o(Lq83/j;)V

    iget-object p2, p0, Lw92/b;->d:Ltr2/n;

    const-string v0, "Something went wrong when trying to insert list of metrics data in metrics table"

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p2, v0, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_7

    :goto_6
    iget-object p2, p0, Lw92/b;->d:Ltr2/n;

    const-string v0, "Error inserting metrics data list"

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p2, v0, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_6
    :goto_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final j(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lnu0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Lw92/b$f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lw92/b$f;-><init>(Lw92/b;ILq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(IILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lnu0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Lw92/b$g;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lw92/b$g;-><init>(Lw92/b;IILq83/d;)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
