.class public final Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;
.super Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase;
.source "SourceFile"


# instance fields
.field private volatile a:Lmu0/a;

.field private volatile b:Lku0/a;

.field private volatile c:Lau0/a;

.field private volatile d:Lyt0/d;

.field private volatile e:Lqu0/a;

.field private volatile f:Lhu0/a;

.field private volatile g:Lju0/a;

.field private volatile h:Lfu0/d;

.field private volatile i:Lfu0/a;

.field private volatile j:Lou0/a;

.field private volatile k:Lou0/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase;-><init>()V

    return-void
.end method

.method public static synthetic m(Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;Ltb/a;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/room/z0;->internalInitInvalidationTracker(Ltb/a;)V

    return-void
.end method


# virtual methods
.method public b()Lyt0/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->d:Lyt0/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->d:Lyt0/d;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->d:Lyt0/d;

    if-nez v0, :cond_1

    new-instance v0, Lyt0/f;

    invoke-direct {v0, p0}, Lyt0/f;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->d:Lyt0/d;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->d:Lyt0/d;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public c()Lju0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->g:Lju0/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->g:Lju0/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->g:Lju0/a;

    if-nez v0, :cond_1

    new-instance v0, Lju0/b;

    invoke-direct {v0, p0}, Lju0/b;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->g:Lju0/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->g:Lju0/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public clearAllTables()V
    .locals 11

    const-string v9, "table_rev2_raw_data"

    const-string v10, "table_rev2_data_settings"

    const-string v0, "table_metrics_data"

    const-string v1, "table_heart_data_versions"

    const-string v2, "table_strap_firmware_events"

    const-string v3, "console_packets"

    const-string v4, "table_research_packets"

    const-string v5, "sensor_data_packets"

    const-string v6, "memfault_packets"

    const-string v7, "table_battery_pack_relative_console_packets"

    const-string v8, "table_battery_pack_relative_firmware_packets"

    filled-new-array/range {v0 .. v10}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Landroidx/room/z0;->performClear(Z[Ljava/lang/String;)V

    return-void
.end method

.method public createInvalidationTracker()Landroidx/room/v;
    .locals 14

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, Landroidx/room/v;

    const-string v12, "table_rev2_raw_data"

    const-string v13, "table_rev2_data_settings"

    const-string v3, "table_metrics_data"

    const-string v4, "table_heart_data_versions"

    const-string v5, "table_strap_firmware_events"

    const-string v6, "console_packets"

    const-string v7, "table_research_packets"

    const-string v8, "sensor_data_packets"

    const-string v9, "memfault_packets"

    const-string v10, "table_battery_pack_relative_console_packets"

    const-string v11, "table_battery_pack_relative_firmware_packets"

    filled-new-array/range {v3 .. v13}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v0, v2, v3}, Landroidx/room/v;-><init>(Landroidx/room/z0;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;)V

    return-object v1
.end method

.method public createOpenDelegate()Landroidx/room/g1;
    .locals 4

    .line 2
    new-instance v0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl$a;

    const-string v1, "6e6c7540db7fb622e48555d647c1c077"

    const-string v2, "c0f462397688da90d9dc22c8c3d1de88"

    const/16 v3, 0x11

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl$a;-><init>(Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic createOpenDelegate()Landroidx/room/h1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->createOpenDelegate()Landroidx/room/g1;

    move-result-object v0

    return-object v0
.end method

.method public d()Lmu0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->a:Lmu0/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->a:Lmu0/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->a:Lmu0/a;

    if-nez v0, :cond_1

    new-instance v0, Lmu0/e;

    invoke-direct {v0, p0}, Lmu0/e;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->a:Lmu0/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->a:Lmu0/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public e()Lou0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->j:Lou0/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->j:Lou0/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->j:Lou0/a;

    if-nez v0, :cond_1

    new-instance v0, Lou0/d;

    invoke-direct {v0, p0}, Lou0/d;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->j:Lou0/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->j:Lou0/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public f()Lou0/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->k:Lou0/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->k:Lou0/e;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->k:Lou0/e;

    if-nez v0, :cond_1

    new-instance v0, Lou0/f;

    invoke-direct {v0, p0}, Lou0/f;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->k:Lou0/e;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->k:Lou0/e;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public g()Lqu0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->e:Lqu0/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->e:Lqu0/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->e:Lqu0/a;

    if-nez v0, :cond_1

    new-instance v0, Lqu0/c;

    invoke-direct {v0, p0}, Lqu0/c;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->e:Lqu0/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->e:Lqu0/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getAutoMigrations(Ljava/util/Map;)Ljava/util/List;
    .locals 1
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

    new-instance v0, Lcom/whoop/connectivityDataPackets/g;

    invoke-direct {v0}, Lcom/whoop/connectivityDataPackets/g;-><init>()V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/whoop/connectivityDataPackets/h;

    invoke-direct {v0}, Lcom/whoop/connectivityDataPackets/h;-><init>()V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/whoop/connectivityDataPackets/i;

    invoke-direct {v0}, Lcom/whoop/connectivityDataPackets/i;-><init>()V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/whoop/connectivityDataPackets/j;

    invoke-direct {v0}, Lcom/whoop/connectivityDataPackets/j;-><init>()V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/whoop/connectivityDataPackets/k;

    invoke-direct {v0}, Lcom/whoop/connectivityDataPackets/k;-><init>()V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/whoop/connectivityDataPackets/l;

    invoke-direct {v0}, Lcom/whoop/connectivityDataPackets/l;-><init>()V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/whoop/connectivityDataPackets/a;

    invoke-direct {v0}, Lcom/whoop/connectivityDataPackets/a;-><init>()V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/whoop/connectivityDataPackets/b;

    invoke-direct {v0}, Lcom/whoop/connectivityDataPackets/b;-><init>()V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/whoop/connectivityDataPackets/c;

    invoke-direct {v0}, Lcom/whoop/connectivityDataPackets/c;-><init>()V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/whoop/connectivityDataPackets/d;

    invoke-direct {v0}, Lcom/whoop/connectivityDataPackets/d;-><init>()V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/whoop/connectivityDataPackets/e;

    invoke-direct {v0}, Lcom/whoop/connectivityDataPackets/e;-><init>()V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/whoop/connectivityDataPackets/f;

    invoke-direct {v0}, Lcom/whoop/connectivityDataPackets/f;-><init>()V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

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

    const-class v1, Lmu0/a;

    invoke-static {}, Lmu0/e;->w()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lku0/a;

    invoke-static {}, Lku0/d;->h()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lau0/a;

    invoke-static {}, Lau0/f;->n()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lyt0/d;

    invoke-static {}, Lyt0/f;->o()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lqu0/a;

    invoke-static {}, Lqu0/c;->g()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lhu0/a;

    invoke-static {}, Lhu0/c;->g()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lju0/a;

    invoke-static {}, Lju0/b;->g()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lfu0/d;

    invoke-static {}, Lfu0/f;->h()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lfu0/a;

    invoke-static {}, Lfu0/c;->h()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lou0/a;

    invoke-static {}, Lou0/d;->k()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lou0/e;

    invoke-static {}, Lou0/f;->k()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public h()Lfu0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->i:Lfu0/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->i:Lfu0/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->i:Lfu0/a;

    if-nez v0, :cond_1

    new-instance v0, Lfu0/c;

    invoke-direct {v0, p0}, Lfu0/c;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->i:Lfu0/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->i:Lfu0/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public i()Lfu0/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->h:Lfu0/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->h:Lfu0/d;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->h:Lfu0/d;

    if-nez v0, :cond_1

    new-instance v0, Lfu0/f;

    invoke-direct {v0, p0}, Lfu0/f;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->h:Lfu0/d;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->h:Lfu0/d;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public j()Lhu0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->f:Lhu0/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->f:Lhu0/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->f:Lhu0/a;

    if-nez v0, :cond_1

    new-instance v0, Lhu0/c;

    invoke-direct {v0, p0}, Lhu0/c;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->f:Lhu0/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->f:Lhu0/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public k()Lau0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->c:Lau0/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->c:Lau0/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->c:Lau0/a;

    if-nez v0, :cond_1

    new-instance v0, Lau0/f;

    invoke-direct {v0, p0}, Lau0/f;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->c:Lau0/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->c:Lau0/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public l()Lku0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->b:Lku0/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->b:Lku0/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->b:Lku0/a;

    if-nez v0, :cond_1

    new-instance v0, Lku0/d;

    invoke-direct {v0, p0}, Lku0/d;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->b:Lku0/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->b:Lku0/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
