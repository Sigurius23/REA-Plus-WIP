.class public final Llive/hms/video/database/EventsDatabase_Impl;
.super Llive/hms/video/database/EventsDatabase;
.source "SourceFile"


# instance fields
.field private volatile _analyticsEventsDao:Llive/hms/video/database/dao/AnalyticsEventsDao;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Llive/hms/video/database/EventsDatabase;-><init>()V

    return-void
.end method

.method public static synthetic access$000(Llive/hms/video/database/EventsDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/z0;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic access$100(Llive/hms/video/database/EventsDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/z0;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic access$202(Llive/hms/video/database/EventsDatabase_Impl;Lub/a;)Lub/a;
    .locals 0

    iput-object p1, p0, Landroidx/room/z0;->mDatabase:Lub/a;

    return-object p1
.end method

.method public static synthetic access$300(Llive/hms/video/database/EventsDatabase_Impl;Lub/a;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/room/z0;->internalInitInvalidationTracker(Lub/a;)V

    return-void
.end method

.method public static synthetic access$400(Llive/hms/video/database/EventsDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/room/z0;->mCallbacks:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public clearAllTables()V
    .locals 4

    const-string v0, "VACUUM"

    const-string v1, "PRAGMA wal_checkpoint(FULL)"

    invoke-super {p0}, Landroidx/room/z0;->assertNotMainThread()V

    invoke-super {p0}, Landroidx/room/z0;->getOpenHelper()Lub/e;

    move-result-object v2

    invoke-interface {v2}, Lub/e;->E0()Lub/a;

    move-result-object v2

    :try_start_0
    invoke-super {p0}, Landroidx/room/z0;->beginTransaction()V

    const-string v3, "DELETE FROM `analytics_table`"

    invoke-interface {v2, v3}, Lub/a;->E(Ljava/lang/String;)V

    invoke-super {p0}, Landroidx/room/z0;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-super {p0}, Landroidx/room/z0;->endTransaction()V

    invoke-interface {v2, v1}, Lub/a;->G0(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    invoke-interface {v2}, Lub/a;->v()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v2, v0}, Lub/a;->E(Ljava/lang/String;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v3

    invoke-super {p0}, Landroidx/room/z0;->endTransaction()V

    invoke-interface {v2, v1}, Lub/a;->G0(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    invoke-interface {v2}, Lub/a;->v()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v2, v0}, Lub/a;->E(Ljava/lang/String;)V

    :cond_1
    throw v3
.end method

.method public createInvalidationTracker()Landroidx/room/v;
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, Landroidx/room/v;

    const-string v3, "analytics_table"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v0, v2, v3}, Landroidx/room/v;-><init>(Landroidx/room/z0;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;)V

    return-object v1
.end method

.method public createOpenHelper(Landroidx/room/g;)Lub/e;
    .locals 6

    new-instance v3, Landroidx/room/k1;

    new-instance v0, Llive/hms/video/database/EventsDatabase_Impl$1;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Llive/hms/video/database/EventsDatabase_Impl$1;-><init>(Llive/hms/video/database/EventsDatabase_Impl;I)V

    invoke-direct {v3, p1, v0}, Landroidx/room/k1;-><init>(Landroidx/room/g;Landroidx/room/i1;)V

    iget-object v1, p1, Landroidx/room/g;->a:Landroid/content/Context;

    const-string v0, "context"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p1, Landroidx/room/g;->b:Ljava/lang/String;

    new-instance v0, Lub/c;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lub/c;-><init>(Landroid/content/Context;Ljava/lang/String;Lub/b;ZZ)V

    iget-object p1, p1, Landroidx/room/g;->c:Lub/d;

    invoke-interface {p1, v0}, Lub/d;->a(Lub/c;)Lub/e;

    move-result-object p1

    return-object p1
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

    const-class v1, Llive/hms/video/database/dao/AnalyticsEventsDao;

    invoke-static {}, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public logDao()Llive/hms/video/database/dao/AnalyticsEventsDao;
    .locals 1

    iget-object v0, p0, Llive/hms/video/database/EventsDatabase_Impl;->_analyticsEventsDao:Llive/hms/video/database/dao/AnalyticsEventsDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Llive/hms/video/database/EventsDatabase_Impl;->_analyticsEventsDao:Llive/hms/video/database/dao/AnalyticsEventsDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Llive/hms/video/database/EventsDatabase_Impl;->_analyticsEventsDao:Llive/hms/video/database/dao/AnalyticsEventsDao;

    if-nez v0, :cond_1

    new-instance v0, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;

    invoke-direct {v0, p0}, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Llive/hms/video/database/EventsDatabase_Impl;->_analyticsEventsDao:Llive/hms/video/database/dao/AnalyticsEventsDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Llive/hms/video/database/EventsDatabase_Impl;->_analyticsEventsDao:Llive/hms/video/database/dao/AnalyticsEventsDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
