.class final Lw92/b$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw92/b;->j(ILq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "Lnu0/a;",
        "<anonymous>",
        "(Lbc3/c0;)Ljava/util/List;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.service.store.heartdata.HeartDataTableRoom$queryCachedRoomDbForData$2"
    f = "HeartDataTableRoom.kt"
    l = {
        0x9e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:I

.field w:J

.field x:J

.field y:I

.field final synthetic z:Lw92/b;


# direct methods
.method public constructor <init>(Lw92/b;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw92/b;",
            "I",
            "Lq83/d<",
            "-",
            "Lw92/b$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lw92/b$f;->z:Lw92/b;

    iput p2, p0, Lw92/b$f;->E:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lw92/b$f;

    iget-object v0, p0, Lw92/b$f;->z:Lw92/b;

    iget v1, p0, Lw92/b$f;->E:I

    invoke-direct {p1, v0, v1, p2}, Lw92/b$f;-><init>(Lw92/b;ILq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lnu0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lw92/b$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lw92/b$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lw92/b$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lw92/b$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v5, p0

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lw92/b$f;->y:I

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v8, :cond_0

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v0, p1

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_3

    :catch_1
    move-exception v0

    goto/16 :goto_4

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object v0, v5, Lw92/b$f;->z:Lw92/b;

    invoke-static {v0}, Lw92/b;->b(Lw92/b;)Lzr2/a;

    move-result-object v9

    const/4 v13, 0x7

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lzr2/b;->c(Lzr2/a;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalTime;Lorg/joda/time/DateTimeZone;ILjava/lang/Object;)Lorg/joda/time/DateTime;

    move-result-object v0

    iget v1, v5, Lw92/b$f;->E:I

    invoke-virtual {v0, v1}, Lorg/joda/time/DateTime;->minusSeconds(I)Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v1

    iget-object v0, v5, Lw92/b$f;->z:Lw92/b;

    invoke-static {v0}, Lw92/b;->b(Lw92/b;)Lzr2/a;

    move-result-object v9

    const/4 v13, 0x7

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lzr2/b;->c(Lzr2/a;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalTime;Lorg/joda/time/DateTimeZone;ILjava/lang/Object;)Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v3

    iget-object v0, v5, Lw92/b$f;->z:Lw92/b;

    invoke-static {v0}, Lw92/b;->a(Lw92/b;)Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;

    move-result-object v0

    iput-wide v1, v5, Lw92/b$f;->w:J

    iput-wide v3, v5, Lw92/b$f;->x:J

    iput v8, v5, Lw92/b$f;->y:I

    invoke-interface/range {v0 .. v5}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;->getPacketRevisionThenHeartDataByTimeRanges(JJLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_2

    return-object v6

    :cond_2
    :goto_0
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;

    invoke-virtual {v2}, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->getPacketData()Ljava/nio/ByteBuffer;

    move-result-object v13

    invoke-virtual {v2}, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->getPacketRevision()I

    move-result v10

    invoke-virtual {v2}, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->getTimestamp()J

    move-result-wide v11

    invoke-virtual {v2}, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->getVersionId()I

    move-result v14

    invoke-virtual {v2}, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->getPacketRevision()I

    move-result v2

    sget-object v3, Lhk0/p;->PROCESSED_RESULTS:Lhk0/p;

    invoke-virtual {v3}, Lhk0/p;->getValue()I

    move-result v3

    if-ne v2, v3, :cond_3

    const/4 v2, 0x2

    move v15, v2

    goto :goto_2

    :cond_3
    move v15, v8

    :goto_2
    new-instance v9, Lnu0/a;

    invoke-direct/range {v9 .. v15}, Lnu0/a;-><init>(IJLjava/nio/ByteBuffer;II)V

    invoke-interface {v1, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_4
    return-object v1

    :goto_3
    iget-object v1, v5, Lw92/b$f;->z:Lw92/b;

    invoke-static {v1}, Lw92/b;->c(Lw92/b;)Ltr2/n;

    move-result-object v1

    const-string v2, "Caught an exception when trying to fetch metrics data from Room"

    new-array v3, v7, [Lqr2/a$a;

    invoke-interface {v1, v2, v0, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_5

    :goto_4
    iget-object v1, v5, Lw92/b$f;->z:Lw92/b;

    invoke-static {v1}, Lw92/b;->c(Lw92/b;)Ltr2/n;

    move-result-object v1

    const-string v2, "Caught a SQLiteException when trying to fetch metrics data from Room"

    new-array v3, v7, [Lqr2/a$a;

    invoke-interface {v1, v2, v0, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_5
    const/4 v0, 0x0

    return-object v0
.end method
