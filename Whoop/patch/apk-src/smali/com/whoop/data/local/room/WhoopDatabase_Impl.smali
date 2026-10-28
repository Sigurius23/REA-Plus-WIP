.class public final Lcom/whoop/data/local/room/WhoopDatabase_Impl;
.super Lcom/whoop/data/local/room/WhoopDatabase;
.source "SourceFile"


# instance fields
.field private volatile _consolePacketsDao:Lyt0/a;

.field private volatile _featureTeamDao:Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;

.field private volatile _gpsDao:Lcom/whoop/data/local/room/dao/wipeable/GpsDao;

.field private volatile _journalDao:Lcom/whoop/data/local/room/dao/wipeable/JournalDao;

.field private volatile _logEventsDao:Ltr2/f;

.field private volatile _memberStoryDao:Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;

.field private volatile _rawDataDao:Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

.field private volatile _smartAlarmDiagnosticDao:Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;

.field private volatile _teamInviteDao:Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;

.field private volatile _teamsDao:Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/data/local/room/WhoopDatabase;-><init>()V

    return-void
.end method

.method public static synthetic access$000(Lcom/whoop/data/local/room/WhoopDatabase_Impl;Ltb/a;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/room/z0;->internalInitInvalidationTracker(Ltb/a;)V

    return-void
.end method


# virtual methods
.method public clearAllTables()V
    .locals 12

    const-string v10, "table_member_stories"

    const-string v11, "table_smart_alarm_diagnostics"

    const-string v0, "table_teams"

    const-string v1, "table_default_images"

    const-string v2, "table_journal_answers"

    const-string v3, "table_log_stream"

    const-string v4, "table_gps"

    const-string v5, "table_gps_meta_data"

    const-string v6, "table_team_invites"

    const-string v7, "table_console_packets"

    const-string v8, "table_feature_teams"

    const-string v9, "table_raw_data"

    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Landroidx/room/z0;->performClear(Z[Ljava/lang/String;)V

    return-void
.end method

.method public consolePacketsDao()Lyt0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_consolePacketsDao:Lyt0/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_consolePacketsDao:Lyt0/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_consolePacketsDao:Lyt0/a;

    if-nez v0, :cond_1

    new-instance v0, Lyt0/c;

    invoke-direct {v0, p0}, Lyt0/c;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_consolePacketsDao:Lyt0/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_consolePacketsDao:Lyt0/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public createInvalidationTracker()Landroidx/room/v;
    .locals 15

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, Landroidx/room/v;

    const-string v13, "table_member_stories"

    const-string v14, "table_smart_alarm_diagnostics"

    const-string v3, "table_teams"

    const-string v4, "table_default_images"

    const-string v5, "table_journal_answers"

    const-string v6, "table_log_stream"

    const-string v7, "table_gps"

    const-string v8, "table_gps_meta_data"

    const-string v9, "table_team_invites"

    const-string v10, "table_console_packets"

    const-string v11, "table_feature_teams"

    const-string v12, "table_raw_data"

    filled-new-array/range {v3 .. v14}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v0, v2, v3}, Landroidx/room/v;-><init>(Landroidx/room/z0;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;)V

    return-object v1
.end method

.method public createOpenDelegate()Landroidx/room/g1;
    .locals 4

    .line 2
    new-instance v0, Lcom/whoop/data/local/room/WhoopDatabase_Impl$1;

    const-string v1, "7f8f6cda74cddb64af0f9f3afdcd2fad"

    const-string v2, "d680932c422189e1fccc4fe4b5e51a08"

    const/16 v3, 0x2c

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/whoop/data/local/room/WhoopDatabase_Impl$1;-><init>(Lcom/whoop/data/local/room/WhoopDatabase_Impl;ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic createOpenDelegate()Landroidx/room/h1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->createOpenDelegate()Landroidx/room/g1;

    move-result-object v0

    return-object v0
.end method

.method public featureTeamDao()Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_featureTeamDao:Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_featureTeamDao:Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_featureTeamDao:Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;

    invoke-direct {v0, p0}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_featureTeamDao:Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_featureTeamDao:Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;

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

    const-class v1, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;

    invoke-static {}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/whoop/data/local/room/dao/wipeable/JournalDao;

    invoke-static {}, Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Ltr2/f;

    invoke-static {}, Ltr2/g;->q()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/whoop/data/local/room/dao/wipeable/GpsDao;

    invoke-static {}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;

    invoke-static {}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lyt0/a;

    invoke-static {}, Lyt0/c;->k()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;

    invoke-static {}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

    invoke-static {}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;

    invoke-static {}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;

    invoke-static {}, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public gpsDao()Lcom/whoop/data/local/room/dao/wipeable/GpsDao;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_gpsDao:Lcom/whoop/data/local/room/dao/wipeable/GpsDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_gpsDao:Lcom/whoop/data/local/room/dao/wipeable/GpsDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_gpsDao:Lcom/whoop/data/local/room/dao/wipeable/GpsDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;

    invoke-direct {v0, p0}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_gpsDao:Lcom/whoop/data/local/room/dao/wipeable/GpsDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_gpsDao:Lcom/whoop/data/local/room/dao/wipeable/GpsDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public journalDao()Lcom/whoop/data/local/room/dao/wipeable/JournalDao;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_journalDao:Lcom/whoop/data/local/room/dao/wipeable/JournalDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_journalDao:Lcom/whoop/data/local/room/dao/wipeable/JournalDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_journalDao:Lcom/whoop/data/local/room/dao/wipeable/JournalDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;

    invoke-direct {v0, p0}, Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_journalDao:Lcom/whoop/data/local/room/dao/wipeable/JournalDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_journalDao:Lcom/whoop/data/local/room/dao/wipeable/JournalDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public logEventsDao()Ltr2/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_logEventsDao:Ltr2/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_logEventsDao:Ltr2/f;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_logEventsDao:Ltr2/f;

    if-nez v0, :cond_1

    new-instance v0, Ltr2/g;

    invoke-direct {v0, p0}, Ltr2/g;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_logEventsDao:Ltr2/f;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_logEventsDao:Ltr2/f;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public memberStoryDao()Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_memberStoryDao:Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_memberStoryDao:Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_memberStoryDao:Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;

    invoke-direct {v0, p0}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_memberStoryDao:Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_memberStoryDao:Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public rawDataDao()Lcom/whoop/data/local/room/dao/persistent/RawDataDao;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_rawDataDao:Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_rawDataDao:Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_rawDataDao:Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;

    invoke-direct {v0, p0}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_rawDataDao:Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_rawDataDao:Lcom/whoop/data/local/room/dao/persistent/RawDataDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public smartAlarmDiagnosticDao()Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_smartAlarmDiagnosticDao:Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_smartAlarmDiagnosticDao:Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_smartAlarmDiagnosticDao:Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;

    invoke-direct {v0, p0}, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_smartAlarmDiagnosticDao:Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_smartAlarmDiagnosticDao:Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public teamsDao()Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_teamsDao:Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_teamsDao:Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_teamsDao:Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;

    invoke-direct {v0, p0}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_teamsDao:Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_teamsDao:Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public teamsInviteDao()Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_teamInviteDao:Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_teamInviteDao:Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_teamInviteDao:Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;

    if-nez v0, :cond_1

    new-instance v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;

    invoke-direct {v0, p0}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;-><init>(Landroidx/room/z0;)V

    iput-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_teamInviteDao:Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->_teamInviteDao:Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
