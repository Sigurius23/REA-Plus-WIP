.class public final Lcom/whoop/metrics/domain/db/MetricDatabase_Impl;
.super Lcom/whoop/metrics/domain/db/MetricDatabase;
.source "SourceFile"


# instance fields
.field private volatile a:Ljy1/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/metrics/domain/db/MetricDatabase;-><init>()V

    return-void
.end method

.method public static synthetic c(Lcom/whoop/metrics/domain/db/MetricDatabase_Impl;Ltb/a;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/room/z0;->internalInitInvalidationTracker(Ltb/a;)V

    return-void
.end method


# virtual methods
.method public b()Ljy1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/metrics/domain/db/MetricDatabase_Impl;->a:Ljy1/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/metrics/domain/db/MetricDatabase_Impl;->a:Ljy1/b;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/metrics/domain/db/MetricDatabase_Impl;->a:Ljy1/b;

    if-nez v0, :cond_1

    new-instance v0, Ljy1/c;

    invoke-direct {v0, p0}, Ljy1/c;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/metrics/domain/db/MetricDatabase_Impl;->a:Ljy1/b;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/metrics/domain/db/MetricDatabase_Impl;->a:Ljy1/b;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public clearAllTables()V
    .locals 2

    const-string v0, "metrics_table"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Landroidx/room/z0;->performClear(Z[Ljava/lang/String;)V

    return-void
.end method

.method public createInvalidationTracker()Landroidx/room/v;
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, Landroidx/room/v;

    const-string v3, "metrics_table"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v0, v2, v3}, Landroidx/room/v;-><init>(Landroidx/room/z0;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;)V

    return-object v1
.end method

.method public createOpenDelegate()Landroidx/room/g1;
    .locals 4

    .line 2
    new-instance v0, Lcom/whoop/metrics/domain/db/MetricDatabase_Impl$a;

    const-string v1, "24b29960f175146e05e6ea5109e61c87"

    const-string v2, "57834016dde83ec5656f9871116b09fa"

    const/4 v3, 0x2

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/whoop/metrics/domain/db/MetricDatabase_Impl$a;-><init>(Lcom/whoop/metrics/domain/db/MetricDatabase_Impl;ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic createOpenDelegate()Landroidx/room/h1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/metrics/domain/db/MetricDatabase_Impl;->createOpenDelegate()Landroidx/room/g1;

    move-result-object v0

    return-object v0
.end method

.method public getAutoMigrations(Ljava/util/Map;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lmb/a;",
            ">;",
            "Lmb/a;",
            ">;)",
            "Ljava/util/List<",
            "Lmb/b;",
            ">;"
        }
    .end annotation

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method public getRequiredAutoMigrationSpecs()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Lmb/a;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method

.method public getRequiredTypeConverters()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-class v1, Ljy1/b;

    invoke-static {}, Ljy1/c;->k()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
