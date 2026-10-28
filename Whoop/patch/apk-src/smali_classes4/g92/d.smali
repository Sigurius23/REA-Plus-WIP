.class public final Lg92/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcu0/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\n\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J&\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J(\u0010\u001e\u001a\u00020\u001d2\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00152\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001e\u0010!\u001a\u00020\u00132\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015H\u0096@\u00a2\u0006\u0004\u0008!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lg92/d;",
        "Lcu0/b;",
        "Lcom/whoop/data/local/room/dao/persistent/RawDataDao;",
        "rawDataDao",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/data/local/room/dao/persistent/RawDataDao;Ltr2/n;)V",
        "",
        "",
        "f",
        "(S)Ljava/lang/String;",
        "Ll83/a0;",
        "g",
        "(Lq83/d;)Ljava/lang/Object;",
        "revision",
        "Lcu0/a;",
        "d",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "numberOfPackets",
        "",
        "Ldu0/a;",
        "b",
        "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "Lnt0/h;",
        "listRawDataPacket",
        "Lcu0/c;",
        "strapInfo",
        "",
        "a",
        "(Ljava/util/List;Lcu0/c;Lq83/d;)Ljava/lang/Object;",
        "rawDataDtoList",
        "c",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/local/room/dao/persistent/RawDataDao;",
        "Ltr2/n;",
        "app_prodStandardRelease"
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
.field private final a:Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/room/dao/persistent/RawDataDao;Ltr2/n;)V
    .locals 1

    const-string v0, "rawDataDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg92/d;->a:Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

    iput-object p2, p0, Lg92/d;->b:Ltr2/n;

    return-void
.end method

.method public static final synthetic e(Lg92/d;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lg92/d;->g(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final f(S)Ljava/lang/String;
    .locals 1

    const-string v0, "R"

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final g(Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lg92/d$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lg92/d$c;

    iget v1, v0, Lg92/d$c;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lg92/d$c;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lg92/d$c;

    invoke-direct {v0, p0, p1}, Lg92/d$c;-><init>(Lg92/d;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lg92/d$c;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lg92/d$c;->F:I

    const-string v3, "R11"

    const-string v4, "R10"

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v8, :cond_4

    if-eq v2, v7, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    iget-object v1, v0, Lg92/d$c;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    iget-object v2, v0, Lg92/d$c;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    iget-object v0, v0, Lg92/d$c;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lg92/d$c;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    iget-object v4, v0, Lg92/d$c;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Long;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v4

    move-object v4, v2

    move-object v2, v9

    goto :goto_3

    :cond_3
    iget-object v2, v0, Lg92/d$c;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg92/d;->a:Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

    iput v8, v0, Lg92/d$c;->F:I

    invoke-interface {p1, v4, v0}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao;->getNewestTimestampByPacketVersion(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_1
    move-object v2, p1

    check-cast v2, Ljava/lang/Long;

    iget-object p1, p0, Lg92/d;->a:Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

    iput-object v2, v0, Lg92/d$c;->w:Ljava/lang/Object;

    iput v7, v0, Lg92/d$c;->F:I

    invoke-interface {p1, v4, v0}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao;->getOldestTimestampByPacketVersion(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_4

    :cond_7
    :goto_2
    check-cast p1, Ljava/lang/Long;

    iget-object v4, p0, Lg92/d;->a:Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

    iput-object v2, v0, Lg92/d$c;->w:Ljava/lang/Object;

    iput-object p1, v0, Lg92/d$c;->x:Ljava/lang/Object;

    iput v6, v0, Lg92/d$c;->F:I

    invoke-interface {v4, v3, v0}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao;->getNewestTimestampByPacketVersion(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_8

    goto :goto_4

    :cond_8
    move-object v9, v4

    move-object v4, p1

    move-object p1, v9

    :goto_3
    check-cast p1, Ljava/lang/Long;

    iget-object v6, p0, Lg92/d;->a:Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

    iput-object v2, v0, Lg92/d$c;->w:Ljava/lang/Object;

    iput-object v4, v0, Lg92/d$c;->x:Ljava/lang/Object;

    iput-object p1, v0, Lg92/d$c;->y:Ljava/lang/Object;

    iput v5, v0, Lg92/d$c;->F:I

    invoke-interface {v6, v3, v0}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao;->getOldestTimestampByPacketVersion(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_9

    :goto_4
    return-object v1

    :cond_9
    move-object v1, p1

    move-object p1, v0

    move-object v0, v2

    move-object v2, v4

    :goto_5
    check-cast p1, Ljava/lang/Long;

    const/4 v3, 0x0

    const-string v4, " - "

    if-eqz v0, :cond_a

    if-eqz v2, :cond_a

    iget-object v5, p0, Lg92/d;->b:Ltr2/n;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-static {v6, v7}, Lor2/v1;->b(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-static {v6, v7}, Lor2/v1;->b(J)Ljava/lang/String;

    move-result-object v0

    const-string v6, "Current R10 timestamps in Room DB = "

    invoke-static {v6, v2, v4, v0}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v3, [Lqr2/a$a;

    invoke-interface {v5, v0, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_a
    if-eqz v1, :cond_b

    if-eqz p1, :cond_b

    iget-object v0, p0, Lg92/d;->b:Ltr2/n;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-static {v5, v6}, Lor2/v1;->b(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Lor2/v1;->b(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Current R11 timestamps in Room DB = "

    invoke-static {v2, p1, v4, v1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_b
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public a(Ljava/util/List;Lcu0/c;Lq83/d;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnt0/h;",
            ">;",
            "Lcu0/c;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const-string v2, "Strap info passed as null, Cannot save "

    instance-of v3, v1, Lg92/d$d;

    if-eqz v3, :cond_0

    move-object v3, v1

    check-cast v3, Lg92/d$d;

    iget v4, v3, Lg92/d$d;->F:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lg92/d$d;->F:I

    goto :goto_0

    :cond_0
    new-instance v3, Lg92/d$d;

    invoke-direct {v3, v0, v1}, Lg92/d$d;-><init>(Lg92/d;Lq83/d;)V

    :goto_0
    iget-object v1, v3, Lg92/d$d;->z:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lg92/d$d;->F:I

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v5, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v2, v3, Lg92/d$d;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v2, v3, Lg92/d$d;->x:Ljava/lang/Object;

    check-cast v2, Lcu0/c;

    iget-object v2, v3, Lg92/d$d;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    :try_start_0
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v2, v3, Lg92/d$d;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v5, v3, Lg92/d$d;->x:Ljava/lang/Object;

    check-cast v5, Lcu0/c;

    iget-object v5, v3, Lg92/d$d;->w:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    :try_start_1
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p2, :cond_8

    :try_start_2
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnt0/h;

    new-instance v10, Ldu0/a;

    invoke-virtual {v5}, Lnt0/h;->e0()J

    move-result-wide v11

    invoke-virtual/range {p2 .. p2}, Lcu0/c;->b()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p2 .. p2}, Lcu0/c;->c()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p2 .. p2}, Lcu0/c;->e()Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_4

    const-string v15, ""

    :cond_4
    invoke-virtual/range {p2 .. p2}, Lcu0/c;->d()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {p2 .. p2}, Lcu0/c;->a()I

    move-result v17

    invoke-virtual {v5}, Llt0/b;->R()S

    move-result v18

    invoke-virtual {v5}, Llt0/b;->U()S

    move-result v6

    invoke-direct {v0, v6}, Lg92/d;->f(S)Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v5}, Lnt0/h;->d0()Ljava/nio/ByteBuffer;

    move-result-object v20

    invoke-direct/range {v10 .. v20}, Ldu0/a;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/nio/ByteBuffer;)V

    invoke-interface {v2, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v6, 0x2

    goto :goto_1

    :cond_5
    iget-object v1, v0, Lg92/d;->a:Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

    iput-object v9, v3, Lg92/d$d;->w:Ljava/lang/Object;

    iput-object v9, v3, Lg92/d$d;->x:Ljava/lang/Object;

    iput-object v2, v3, Lg92/d$d;->y:Ljava/lang/Object;

    iput v7, v3, Lg92/d$d;->F:I

    invoke-interface {v1, v2, v3}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao;->insertList(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    iget-object v1, v0, Lg92/d;->b:Ltr2/n;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Saved "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " raw data packets in database"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v5, v8, [Lqr2/a$a;

    invoke-interface {v1, v2, v5}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iput-object v9, v3, Lg92/d$d;->w:Ljava/lang/Object;

    iput-object v9, v3, Lg92/d$d;->x:Ljava/lang/Object;

    iput-object v9, v3, Lg92/d$d;->y:Ljava/lang/Object;

    const/4 v1, 0x2

    iput v1, v3, Lg92/d$d;->F:I

    invoke-direct {v0, v3}, Lg92/d;->g(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_7

    :goto_3
    return-object v4

    :cond_7
    :goto_4
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v1

    :cond_8
    iget-object v1, v0, Lg92/d;->b:Ltr2/n;

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " raw data packets!"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v8, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v1

    :catch_0
    iget-object v1, v0, Lg92/d;->b:Ltr2/n;

    const-string v2, "Something went wrong when trying to insert raw data packets in the db"

    new-array v3, v8, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v1
.end method

.method public b(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ldu0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lg92/d;->a:Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

    invoke-interface {v0, p1, p2, p3}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao;->getPacketsByRevisionAndCount(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldu0/a;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lg92/d$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lg92/d$a;

    iget v1, v0, Lg92/d$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lg92/d$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lg92/d$a;

    invoke-direct {v0, p0, p2}, Lg92/d$a;-><init>(Lg92/d;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lg92/d$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lg92/d$a;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lg92/d$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lg92/d;->a:Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

    const/4 v2, 0x0

    iput-object v2, v0, Lg92/d$a;->w:Ljava/lang/Object;

    iput v3, v0, Lg92/d$a;->z:I

    invoke-interface {p2, p1, v0}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao;->deleteByPacketsList(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    move-object p1, p2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p0, Lg92/d;->b:Ltr2/n;

    const-string v1, "Deleted "

    const-string v2, " packets after a successful upload"

    invoke-static {p1, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object p2
.end method

.method public d(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcu0/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lg92/d$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lg92/d$b;

    iget v1, v0, Lg92/d$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lg92/d$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lg92/d$b;

    invoke-direct {v0, p0, p2}, Lg92/d$b;-><init>(Lg92/d;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lg92/d$b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lg92/d$b;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lg92/d$b;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lg92/d;->a:Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

    iput-object v3, v0, Lg92/d$b;->w:Ljava/lang/Object;

    iput v4, v0, Lg92/d$b;->z:I

    invoke-interface {p2, p1, v4, v0}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao;->getPacketsByRevisionAndCount(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/util/List;

    move-object p1, p2

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-static {p2}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldu0/a;

    new-instance v0, Lcu0/a;

    invoke-virtual {p1}, Ldu0/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ldu0/a;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ldu0/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Ldu0/a;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Ldu0/a;->b()I

    move-result v5

    invoke-virtual {p1}, Ldu0/a;->a()I

    move-result v6

    invoke-virtual {p1}, Ldu0/a;->h()Ljava/lang/String;

    move-result-object v7

    invoke-direct/range {v0 .. v7}, Lcu0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V

    return-object v0

    :cond_4
    return-object v3
.end method
