.class public final Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;


# instance fields
.field private final __db:Landroidx/room/z0;

.field private final __insertAdapterOfOptimalStrainMapping:Landroidx/room/k;
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

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl$1;

    invoke-direct {p1, p0}, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl$1;-><init>(Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;)V

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->__insertAdapterOfOptimalStrainMapping:Landroidx/room/k;

    return-void
.end method

.method public static synthetic a(Ltb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->lambda$getAll$4(Ltb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->lambda$replaceAll$2(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;Lcom/whoop/data/local/room/entity/OptimalStrainMapping;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->lambda$insert$0(Lcom/whoop/data/local/room/entity/OptimalStrainMapping;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ltb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->lambda$deleteAll$5(Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ILtb/a;)Lcom/whoop/data/local/room/entity/OptimalStrainMapping;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->lambda$getOptimalStrainForRecovery$3(ILtb/a;)Lcom/whoop/data/local/room/entity/OptimalStrainMapping;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->lambda$insertAll$1(Ljava/util/List;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static getRequiredConverters()Ljava/util/List;
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

.method private static synthetic lambda$deleteAll$5(Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "DELETE FROM optimal_strain_mapping_table"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    sget-object v0, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic lambda$getAll$4(Ltb/a;)Ljava/util/List;
    .locals 19

    const-string v0, "SELECT * FROM optimal_strain_mapping_table ORDER BY recovery"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_0
    const-string v0, "recovery"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "lower_optimal_strain"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "optimal_strain"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "upper_optimal_strain"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "cycle_id"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v10, v7

    invoke-interface {v1, v2}, Ltb/c;->getDouble(I)D

    move-result-wide v11

    invoke-interface {v1, v3}, Ltb/c;->getDouble(I)D

    move-result-wide v13

    invoke-interface {v1, v4}, Ltb/c;->getDouble(I)D

    move-result-wide v15

    invoke-interface {v1, v5}, Ltb/c;->getLong(I)J

    move-result-wide v17

    new-instance v9, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;

    invoke-direct/range {v9 .. v18}, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;-><init>(IDDDJ)V

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v6

    :goto_1
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic lambda$getOptimalStrainForRecovery$3(ILtb/a;)Lcom/whoop/data/local/room/entity/OptimalStrainMapping;
    .locals 18

    const-string v0, "SELECT * FROM  optimal_strain_mapping_table WHERE recovery == ?"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v0, 0x1

    move/from16 v2, p0

    int-to-long v2, v2

    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const-string v0, "recovery"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "lower_optimal_strain"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "optimal_strain"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "upper_optimal_strain"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "cycle_id"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v9, v6

    invoke-interface {v1, v2}, Ltb/c;->getDouble(I)D

    move-result-wide v10

    invoke-interface {v1, v3}, Ltb/c;->getDouble(I)D

    move-result-wide v12

    invoke-interface {v1, v4}, Ltb/c;->getDouble(I)D

    move-result-wide v14

    invoke-interface {v1, v5}, Ltb/c;->getLong(I)J

    move-result-wide v16

    new-instance v8, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;

    invoke-direct/range {v8 .. v17}, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;-><init>(IDDDJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v8, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v8

    :goto_1
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic lambda$insert$0(Lcom/whoop/data/local/room/entity/OptimalStrainMapping;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->__insertAdapterOfOptimalStrainMapping:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private synthetic lambda$insertAll$1(Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->__insertAdapterOfOptimalStrainMapping:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Iterable;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private synthetic lambda$replaceAll$2(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;->replaceAll(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public deleteAll(Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcj2/a;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Lcj2/a;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getAll(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/OptimalStrainMapping;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcj2/a;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Lcj2/a;-><init>(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getOptimalStrainForRecovery(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/local/room/entity/OptimalStrainMapping;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/e;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/whoop/data/local/room/dao/persistent/e;-><init>(II)V

    const/4 p1, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public insert(Lcom/whoop/data/local/room/entity/OptimalStrainMapping;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/room/entity/OptimalStrainMapping;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lbe1/c;

    const/16 v2, 0x11

    invoke-direct {v1, v2, p0, p1}, Lbe1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public insertAll(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/OptimalStrainMapping;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/f;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/local/room/dao/persistent/f;-><init>(Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;Ljava/util/List;I)V

    const/4 p1, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public replaceAll(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/OptimalStrainMapping;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/local/room/dao/persistent/f;-><init>(Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;Ljava/util/List;I)V

    invoke-static {v0, v1, p2}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
