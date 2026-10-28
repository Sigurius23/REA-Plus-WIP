.class public final Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;


# instance fields
.field private final __db:Landroidx/room/z0;

.field private final __insertAdapterOfConfigurationDto:Landroidx/room/k;
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

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl$1;

    invoke-direct {p1, p0}, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl$1;-><init>(Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;)V

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;->__insertAdapterOfConfigurationDto:Landroidx/room/k;

    return-void
.end method

.method public static synthetic a(Ltb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;->lambda$deleteAll$2(Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ltb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;->lambda$getAllConfigurations$1(Ltb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;Lcom/whoop/data/local/room/entity/ConfigurationDto;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;->lambda$insert$0(Lcom/whoop/data/local/room/entity/ConfigurationDto;Ltb/a;)Ll83/a0;

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

.method private static synthetic lambda$deleteAll$2(Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "DELETE FROM table_configurations"

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

.method private static synthetic lambda$getAllConfigurations$1(Ltb/a;)Ljava/util/List;
    .locals 6

    const-string v0, "SELECT * FROM table_configurations"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    const-string v0, "configuration_key"

    invoke-static {p0, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v1, "configuration_value"

    invoke-static {p0, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p0, v0}, Ltb/c;->isNull(I)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    move-object v3, v4

    goto :goto_1

    :cond_0
    invoke-interface {p0, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    :goto_1
    invoke-interface {p0, v1}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {p0, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    :goto_2
    new-instance v5, Lcom/whoop/data/local/room/entity/ConfigurationDto;

    invoke-direct {v5, v3, v4}, Lcom/whoop/data/local/room/entity/ConfigurationDto;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_2
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object v2

    :goto_3
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic lambda$insert$0(Lcom/whoop/data/local/room/entity/ConfigurationDto;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;->__insertAdapterOfConfigurationDto:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, La11/g;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, La11/g;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getAllConfigurations(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/ConfigurationDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, La11/g;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, La11/g;-><init>(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public insert(Lcom/whoop/data/local/room/entity/ConfigurationDto;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/room/entity/ConfigurationDto;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lbp0/n;

    const/4 v2, 0x5

    invoke-direct {v1, v2, p0, p1}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
