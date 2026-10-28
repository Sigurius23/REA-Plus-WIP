.class public final Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;
.super Lcom/whoop/data/local/room/PersistentWhoopDatabase;
.source "SourceFile"


# instance fields
.field private volatile _activeActivitySessionDao:Lx90/a;

.field private volatile _activitiesDao:Lha0/a;

.field private volatile _appConfigurationCacheDao:Lji0/a;

.field private volatile _configurationsDao:Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;

.field private volatile _entitlementDao:Lwe1/b;

.field private volatile _foregroundGpsRoutePointDao:Lai1/a;

.field private volatile _gpsLocationDao:Luh1/a;

.field private volatile _hrZonesDao:Ldq1/b;

.field private volatile _labsDao:Lfx2/a;

.field private volatile _membershipTypeDao:Lwe1/j;

.field private volatile _onboardingStatusDao:Lcom/whoop/data/onboarding/OnboardingStatusDao;

.field private volatile _optimalStrainMappingDao:Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;

.field private volatile _pendingActivitySaveDao:Lrk2/c;

.field private volatile _recentActivitiesDao:Lha0/e;

.field private volatile _smartAlarmUserInfoDao:Lrf2/a;

.field private volatile _userDao:Laa2/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/data/local/room/PersistentWhoopDatabase;-><init>()V

    return-void
.end method

.method public static synthetic access$000(Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;Ltb/a;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/room/z0;->internalInitInvalidationTracker(Ltb/a;)V

    return-void
.end method


# virtual methods
.method public activeActivitySessionDao()Lx90/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_activeActivitySessionDao:Lx90/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_activeActivitySessionDao:Lx90/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_activeActivitySessionDao:Lx90/a;

    if-nez v0, :cond_1

    new-instance v0, Lx90/b;

    invoke-direct {v0, p0}, Lx90/b;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_activeActivitySessionDao:Lx90/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_activeActivitySessionDao:Lx90/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public activitiesDao()Lha0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_activitiesDao:Lha0/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_activitiesDao:Lha0/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_activitiesDao:Lha0/a;

    if-nez v0, :cond_1

    new-instance v0, Lha0/c;

    invoke-direct {v0, p0}, Lha0/c;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_activitiesDao:Lha0/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_activitiesDao:Lha0/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public appConfigurationCacheDao()Lji0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_appConfigurationCacheDao:Lji0/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_appConfigurationCacheDao:Lji0/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_appConfigurationCacheDao:Lji0/a;

    if-nez v0, :cond_1

    new-instance v0, Lji0/c;

    invoke-direct {v0, p0}, Lji0/c;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_appConfigurationCacheDao:Lji0/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_appConfigurationCacheDao:Lji0/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public clearAllTables()V
    .locals 30

    const-string v28, "membership_type_table"

    const-string v29, "foreground_gps_route_points"

    const-string v1, "active_activity_session_table"

    const-string v2, "table_activities_list"

    const-string v3, "app_configuration_cache_table"

    const-string v4, "table_configurations"

    const-string v5, "entitlement_table"

    const-string v6, "table_hr_zone_list"

    const-string v7, "labs_campaign"

    const-string v8, "legal_document_to_campaign"

    const-string v9, "whoop_labs_session"

    const-string v10, "whoop_labs_strap_info"

    const-string v11, "whoop_labs_legal_ducment"

    const-string v12, "table_onboarding_status"

    const-string v13, "optimal_strain_mapping_table"

    const-string v14, "pending_activity_save_table"

    const-string v15, "protocol_step"

    const-string v16, "whoop_labs_protocol_step_result"

    const-string v17, "table_recent_activities"

    const-string v18, "smart_alarm_user_info_table"

    const-string v19, "table_smart_alarm_triggered"

    const-string v20, "table_user"

    const-string v21, "table_user_profile"

    const-string v22, "whoop_labs_hr_device"

    const-string v23, "whoop_labs_study"

    const-string v24, "whoop_labs_study_tag"

    const-string v25, "whoop_labs_input_option"

    const-string v26, "whoop_labs_protocol_step_config"

    const-string v27, "gps_locations"

    filled-new-array/range {v1 .. v29}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    move-object/from16 v2, p0

    invoke-virtual {v2, v1, v0}, Landroidx/room/z0;->performClear(Z[Ljava/lang/String;)V

    return-void
.end method

.method public configurationsDao()Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_configurationsDao:Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_configurationsDao:Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_configurationsDao:Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;

    invoke-direct {v0, p0}, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_configurationsDao:Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_configurationsDao:Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public createInvalidationTracker()Landroidx/room/v;
    .locals 32

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, Landroidx/room/v;

    const-string v30, "membership_type_table"

    const-string v31, "foreground_gps_route_points"

    const-string v3, "active_activity_session_table"

    const-string v4, "table_activities_list"

    const-string v5, "app_configuration_cache_table"

    const-string v6, "table_configurations"

    const-string v7, "entitlement_table"

    const-string v8, "table_hr_zone_list"

    const-string v9, "labs_campaign"

    const-string v10, "legal_document_to_campaign"

    const-string v11, "whoop_labs_session"

    const-string v12, "whoop_labs_strap_info"

    const-string v13, "whoop_labs_legal_ducment"

    const-string v14, "table_onboarding_status"

    const-string v15, "optimal_strain_mapping_table"

    const-string v16, "pending_activity_save_table"

    const-string v17, "protocol_step"

    const-string v18, "whoop_labs_protocol_step_result"

    const-string v19, "table_recent_activities"

    const-string v20, "smart_alarm_user_info_table"

    const-string v21, "table_smart_alarm_triggered"

    const-string v22, "table_user"

    const-string v23, "table_user_profile"

    const-string v24, "whoop_labs_hr_device"

    const-string v25, "whoop_labs_study"

    const-string v26, "whoop_labs_study_tag"

    const-string v27, "whoop_labs_input_option"

    const-string v28, "whoop_labs_protocol_step_config"

    const-string v29, "gps_locations"

    filled-new-array/range {v3 .. v31}, [Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, p0

    invoke-direct {v1, v4, v0, v2, v3}, Landroidx/room/v;-><init>(Landroidx/room/z0;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;)V

    return-object v1
.end method

.method public createOpenDelegate()Landroidx/room/g1;
    .locals 4

    .line 2
    new-instance v0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl$1;

    const-string v1, "320843d67212caa754e8ddcd3a67c5df"

    const-string v2, "46d010973847809645a792bee843c856"

    const/16 v3, 0x45

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl$1;-><init>(Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic createOpenDelegate()Landroidx/room/h1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->createOpenDelegate()Landroidx/room/g1;

    move-result-object v0

    return-object v0
.end method

.method public entitlementDao()Lwe1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_entitlementDao:Lwe1/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_entitlementDao:Lwe1/b;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_entitlementDao:Lwe1/b;

    if-nez v0, :cond_1

    new-instance v0, Lwe1/d;

    invoke-direct {v0, p0}, Lwe1/d;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_entitlementDao:Lwe1/b;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_entitlementDao:Lwe1/b;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public foregroundGpsRoutePointDao()Lai1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_foregroundGpsRoutePointDao:Lai1/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_foregroundGpsRoutePointDao:Lai1/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_foregroundGpsRoutePointDao:Lai1/a;

    if-nez v0, :cond_1

    new-instance v0, Lai1/d;

    invoke-direct {v0, p0}, Lai1/d;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_foregroundGpsRoutePointDao:Lai1/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_foregroundGpsRoutePointDao:Lai1/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
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

    const-class v1, Lx90/a;

    invoke-static {}, Lx90/b;->g()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lha0/a;

    invoke-static {}, Lha0/c;->k()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lji0/a;

    invoke-static {}, Lji0/c;->f()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;

    invoke-static {}, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lwe1/b;

    invoke-static {}, Lwe1/d;->h()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lwe1/j;

    invoke-static {}, Lwe1/k;->f()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Ldq1/b;

    invoke-static {}, Ldq1/d;->k()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/whoop/data/onboarding/OnboardingStatusDao;

    invoke-static {}, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;

    invoke-static {}, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lrk2/c;

    invoke-static {}, Lrk2/d;->h()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lha0/e;

    invoke-static {}, Lha0/g;->k()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lrf2/a;

    invoke-static {}, Lrf2/c;->q()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Laa2/e;

    invoke-static {}, Laa2/f;->t()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lfx2/a;

    invoke-static {}, Lfx2/g;->v0()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Luh1/a;

    invoke-static {}, Luh1/b;->k()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lai1/a;

    invoke-static {}, Lai1/d;->i()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public gpsLocationDao()Luh1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_gpsLocationDao:Luh1/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_gpsLocationDao:Luh1/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_gpsLocationDao:Luh1/a;

    if-nez v0, :cond_1

    new-instance v0, Luh1/b;

    invoke-direct {v0, p0}, Luh1/b;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_gpsLocationDao:Luh1/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_gpsLocationDao:Luh1/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public hrZonesDao()Ldq1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_hrZonesDao:Ldq1/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_hrZonesDao:Ldq1/b;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_hrZonesDao:Ldq1/b;

    if-nez v0, :cond_1

    new-instance v0, Ldq1/d;

    invoke-direct {v0, p0}, Ldq1/d;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_hrZonesDao:Ldq1/b;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_hrZonesDao:Ldq1/b;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public membershipTypeDao()Lwe1/j;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_membershipTypeDao:Lwe1/j;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_membershipTypeDao:Lwe1/j;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_membershipTypeDao:Lwe1/j;

    if-nez v0, :cond_1

    new-instance v0, Lwe1/k;

    invoke-direct {v0, p0}, Lwe1/k;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_membershipTypeDao:Lwe1/j;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_membershipTypeDao:Lwe1/j;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onboardingStatusDao()Lcom/whoop/data/onboarding/OnboardingStatusDao;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_onboardingStatusDao:Lcom/whoop/data/onboarding/OnboardingStatusDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_onboardingStatusDao:Lcom/whoop/data/onboarding/OnboardingStatusDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_onboardingStatusDao:Lcom/whoop/data/onboarding/OnboardingStatusDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;

    invoke-direct {v0, p0}, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_onboardingStatusDao:Lcom/whoop/data/onboarding/OnboardingStatusDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_onboardingStatusDao:Lcom/whoop/data/onboarding/OnboardingStatusDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public optimalStrainMappingDao()Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_optimalStrainMappingDao:Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_optimalStrainMappingDao:Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_optimalStrainMappingDao:Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;

    invoke-direct {v0, p0}, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_optimalStrainMappingDao:Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_optimalStrainMappingDao:Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public pendingActivitySaveDao()Lrk2/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_pendingActivitySaveDao:Lrk2/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_pendingActivitySaveDao:Lrk2/c;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_pendingActivitySaveDao:Lrk2/c;

    if-nez v0, :cond_1

    new-instance v0, Lrk2/d;

    invoke-direct {v0, p0}, Lrk2/d;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_pendingActivitySaveDao:Lrk2/c;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_pendingActivitySaveDao:Lrk2/c;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public recentActivitiesDao()Lha0/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_recentActivitiesDao:Lha0/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_recentActivitiesDao:Lha0/e;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_recentActivitiesDao:Lha0/e;

    if-nez v0, :cond_1

    new-instance v0, Lha0/g;

    invoke-direct {v0, p0}, Lha0/g;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_recentActivitiesDao:Lha0/e;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_recentActivitiesDao:Lha0/e;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public smartAlarmUserInfoDao()Lrf2/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_smartAlarmUserInfoDao:Lrf2/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_smartAlarmUserInfoDao:Lrf2/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_smartAlarmUserInfoDao:Lrf2/a;

    if-nez v0, :cond_1

    new-instance v0, Lrf2/c;

    invoke-direct {v0, p0}, Lrf2/c;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_smartAlarmUserInfoDao:Lrf2/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_smartAlarmUserInfoDao:Lrf2/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public userDao()Laa2/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_userDao:Laa2/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_userDao:Laa2/e;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_userDao:Laa2/e;

    if-nez v0, :cond_1

    new-instance v0, Laa2/f;

    invoke-direct {v0, p0}, Laa2/f;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_userDao:Laa2/e;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_userDao:Laa2/e;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public whoopLabsDao()Lfx2/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_labsDao:Lfx2/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_labsDao:Lfx2/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_labsDao:Lfx2/a;

    if-nez v0, :cond_1

    new-instance v0, Lfx2/g;

    invoke-direct {v0, p0}, Lfx2/g;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_labsDao:Lfx2/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->_labsDao:Lfx2/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
