.class public final Luh1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luh1/a;


# instance fields
.field private final a:Landroidx/room/z0;

.field private final b:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luh1/b;->a:Landroidx/room/z0;

    new-instance p1, Luh1/b$a;

    invoke-direct {p1, p0}, Luh1/b$a;-><init>(Luh1/b;)V

    iput-object p1, p0, Luh1/b;->b:Landroidx/room/k;

    return-void
.end method

.method public static synthetic f(ILtb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1}, Luh1/b;->p(ILtb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/String;Ljava/util/List;Ltb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1, p2}, Luh1/b;->m(Ljava/lang/String;Ljava/util/List;Ltb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Luh1/b;Lvh1/a;Ltb/a;)Ljava/lang/Long;
    .locals 0

    invoke-direct {p0, p1, p2}, Luh1/b;->o(Lvh1/a;Ltb/a;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(ILtb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Luh1/b;->n(ILtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ltb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Luh1/b;->l(Ltb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method private static synthetic l(Ltb/a;)Ljava/lang/Integer;
    .locals 3

    const-string v0, "SELECT COUNT(*) FROM gps_locations"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0, v0}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object v1

    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic m(Ljava/lang/String;Ljava/util/List;Ltb/a;)Ljava/lang/Integer;
    .locals 3

    invoke-interface {p2, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    if-nez v1, :cond_0

    invoke-interface {p0, v0}, Ltb/c;->u(I)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p0, v0, v1, v2}, Ltb/c;->p(IJ)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Ltb/c;->e1()Z

    invoke-static {p2}, Lj93/l0;->H(Ltb/a;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object p1

    :goto_2
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private static synthetic n(ILtb/a;)Ljava/util/List;
    .locals 30

    const-string v0, "SELECT * FROM gps_locations ORDER BY timestamp ASC LIMIT ?"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v0, 0x1

    move/from16 v2, p0

    int-to-long v2, v2

    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const-string v0, "timestamp"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "latitude"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "longitude"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "altitude"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "horizontal_accuracy_meters"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "vertical_accuracy_meters"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "speed_value"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "speed_unit"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "speed_accuracy"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "trigger"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v14

    invoke-interface {v1, v2}, Ltb/c;->getDouble(I)D

    move-result-wide v16

    invoke-interface {v1, v3}, Ltb/c;->getDouble(I)D

    move-result-wide v18

    invoke-interface {v1, v4}, Ltb/c;->getDouble(I)D

    move-result-wide v20

    invoke-interface {v1, v5}, Ltb/c;->getDouble(I)D

    move-result-wide v22

    invoke-interface {v1, v6}, Ltb/c;->getDouble(I)D

    move-result-wide v24

    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v12

    const/4 v13, 0x0

    if-eqz v12, :cond_0

    move-object/from16 v26, v13

    goto :goto_1

    :cond_0
    invoke-interface {v1, v7}, Ltb/c;->getDouble(I)D

    move-result-wide v26

    invoke-static/range {v26 .. v27}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    move-object/from16 v26, v12

    :goto_1
    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_1

    move-object/from16 v27, v13

    goto :goto_2

    :cond_1
    invoke-interface {v1, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v27, v12

    :goto_2
    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_2

    move-object/from16 v28, v13

    goto :goto_3

    :cond_2
    invoke-interface {v1, v9}, Ltb/c;->getDouble(I)D

    move-result-wide v28

    invoke-static/range {v28 .. v29}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    move-object/from16 v28, v12

    :goto_3
    invoke-interface {v1, v10}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_3

    :goto_4
    move-object/from16 v29, v13

    goto :goto_5

    :cond_3
    invoke-interface {v1, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v13

    goto :goto_4

    :goto_5
    new-instance v13, Lvh1/a;

    invoke-direct/range {v13 .. v29}, Lvh1/a;-><init>(JDDDDDLjava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_6

    :cond_4
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v11

    :goto_6
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic o(Lvh1/a;Ltb/a;)Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Luh1/b;->b:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insertAndReturnId(Ltb/a;Ljava/lang/Object;)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic p(ILtb/a;)Ljava/lang/Integer;
    .locals 4

    const-string v0, "\n        DELETE FROM gps_locations\n        WHERE timestamp < (\n          SELECT timestamp FROM gps_locations\n          ORDER BY timestamp DESC\n          LIMIT 1 OFFSET ? - 1\n        )\n    "

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v0

    const/4 v1, 0x1

    int-to-long v2, p0

    :try_start_0
    invoke-interface {v0, v1, v2, v3}, Ltb/c;->p(IJ)V

    invoke-interface {v0}, Ltb/c;->e1()Z

    invoke-static {p1}, Lj93/l0;->H(Ltb/a;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method


# virtual methods
.method public a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "DELETE FROM gps_locations WHERE timestamp IN ("

    invoke-static {v0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1, v0}, Lpf/c;->j(ILjava/lang/StringBuilder;)V

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Luh1/b;->a:Landroidx/room/z0;

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/a;

    const/4 v3, 0x4

    invoke-direct {v2, v3, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/a;-><init>(ILjava/lang/String;Ljava/util/List;)V

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {v1, p1, v0, v2, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lvh1/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Luh1/b;->a:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/e;

    const/16 v2, 0x1c

    invoke-direct {v1, p1, v2}, Lcom/whoop/data/local/room/dao/persistent/e;-><init>(II)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Luh1/b;->a:Landroidx/room/z0;

    new-instance v1, Lu71/c;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Lu71/c;-><init>(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(ILq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Luh1/b;->a:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/e;

    const/16 v2, 0x1b

    invoke-direct {v1, p1, v2}, Lcom/whoop/data/local/room/dao/persistent/e;-><init>(II)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Lvh1/a;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvh1/a;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Luh1/b;->a:Landroidx/room/z0;

    new-instance v1, Lsg2/t;

    const/16 v2, 0x1a

    invoke-direct {v1, v2, p0, p1}, Lsg2/t;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
