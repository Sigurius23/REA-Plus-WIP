.class public final Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;


# instance fields
.field private final __db:Landroidx/room/z0;

.field private final __insertAdapterOfFeatureTeam:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final __teamTypeConverter:Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;

    invoke-direct {v0}, Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;-><init>()V

    iput-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->__teamTypeConverter:Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl$1;

    invoke-direct {p1, p0}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl$1;-><init>(Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;)V

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->__insertAdapterOfFeatureTeam:Landroidx/room/k;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->lambda$addFeatureTeams$2(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ltb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->lambda$deleteAllFeatureTeams$7(Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->lambda$getFlowFeatureTeamData$4(Ltb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->lambda$getFeatureTeamData$3(Ltb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;ILtb/a;)Lcom/whoop/domain/model/teams/FeatureTeam;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->lambda$getFeatureTeamByCommunityId$5(ILtb/a;)Lcom/whoop/domain/model/teams/FeatureTeam;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(ZILtb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->lambda$updateBannerStatus$6(ZILtb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;Lcom/whoop/domain/model/teams/FeatureTeam;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->lambda$saveFeatureTeam$0(Lcom/whoop/domain/model/teams/FeatureTeam;Ltb/a;)Ll83/a0;

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

.method public static synthetic h(Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;ZLjava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->lambda$updateAllBadgeStatus$1(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic i(Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;)Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->__teamTypeConverter:Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;

    return-object p0
.end method

.method private synthetic lambda$addFeatureTeams$2(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;->addFeatureTeams(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic lambda$deleteAllFeatureTeams$7(Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "DELETE FROM table_feature_teams"

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

.method private synthetic lambda$getFeatureTeamByCommunityId$5(ILtb/a;)Lcom/whoop/domain/model/teams/FeatureTeam;
    .locals 26

    const-string v0, "SELECT * from table_feature_teams WHERE communityId= (?)"

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    move/from16 v0, p1

    int-to-long v2, v0

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const-string v2, "name"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "description"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "iconUrl"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "bannerUrl"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "athletePrivacyId"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "memberCount"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "inviteCode"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "teamType"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "communityId"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "showBadge"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "id"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v13

    const/4 v14, 0x0

    if-eqz v13, :cond_7

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_0

    move-object/from16 v16, v14

    goto :goto_0

    :cond_0
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v16, v2

    :goto_0
    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object/from16 v17, v14

    goto :goto_1

    :cond_1
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v17, v2

    :goto_1
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_2

    move-object/from16 v18, v14

    goto :goto_2

    :cond_2
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v18, v2

    :goto_2
    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object/from16 v19, v14

    goto :goto_3

    :cond_3
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v19, v2

    :goto_3
    invoke-interface {v1, v6}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-interface {v1, v7}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_4

    move-object/from16 v22, v14

    goto :goto_4

    :cond_4
    invoke-interface {v1, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v22, v4

    :goto_4
    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_5

    :goto_5
    move-object/from16 v4, p0

    goto :goto_6

    :cond_5
    invoke-interface {v1, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_5

    :goto_6
    :try_start_1
    iget-object v5, v4, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->__teamTypeConverter:Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;

    invoke-virtual {v5, v14}, Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;->toTeamType(Ljava/lang/String;)Lcom/whoop/domain/model/teams/TeamType;

    move-result-object v23

    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    if-eqz v6, :cond_6

    :goto_7
    move/from16 v25, v0

    goto :goto_8

    :cond_6
    const/4 v0, 0x0

    goto :goto_7

    :goto_8
    new-instance v15, Lcom/whoop/domain/model/teams/FeatureTeam;

    move/from16 v20, v2

    move/from16 v21, v3

    move/from16 v24, v5

    invoke-direct/range {v15 .. v25}, Lcom/whoop/domain/model/teams/FeatureTeam;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lcom/whoop/domain/model/teams/TeamType;IZ)V

    invoke-interface {v1, v12}, Ltb/c;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v15, v2, v3}, Lcom/whoop/domain/model/teams/FeatureTeam;->setId(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v14, v15

    goto :goto_9

    :catchall_0
    move-exception v0

    goto :goto_a

    :catchall_1
    move-exception v0

    move-object/from16 v4, p0

    goto :goto_a

    :cond_7
    move-object/from16 v4, p0

    :goto_9
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v14

    :goto_a
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic lambda$getFeatureTeamData$3(Ltb/a;)Ljava/util/List;
    .locals 27

    const-string v0, "SELECT * FROM table_feature_teams"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_0
    const-string v0, "name"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "description"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "iconUrl"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "bannerUrl"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "athletePrivacyId"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "memberCount"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "inviteCode"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "teamType"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "communityId"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "showBadge"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "id"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v1, v0}, Ltb/c;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_0

    const/16 v16, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v16, v13

    :goto_1
    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_1

    const/16 v17, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v17, v13

    :goto_2
    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_2

    const/16 v18, 0x0

    goto :goto_3

    :cond_2
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v18, v13

    :goto_3
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_3

    const/16 v19, 0x0

    goto :goto_4

    :cond_3
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v19, v13

    :goto_4
    invoke-interface {v1, v5}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v13, v14

    invoke-interface {v1, v6}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_4

    const/16 v22, 0x0

    goto :goto_5

    :cond_4
    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v22, v15

    :goto_5
    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_5

    const/4 v15, 0x0

    :goto_6
    move/from16 v26, v0

    move/from16 p1, v2

    move-object/from16 v2, p0

    goto :goto_7

    :cond_5
    invoke-interface {v1, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    goto :goto_6

    :goto_7
    iget-object v0, v2, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->__teamTypeConverter:Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;

    invoke-virtual {v0, v15}, Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;->toTeamType(Ljava/lang/String;)Lcom/whoop/domain/model/teams/TeamType;

    move-result-object v23

    move v0, v3

    invoke-interface {v1, v9}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v24, v2

    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    if-eqz v2, :cond_6

    const/4 v2, 0x1

    :goto_8
    move/from16 v25, v2

    goto :goto_9

    :cond_6
    const/4 v2, 0x0

    goto :goto_8

    :goto_9
    new-instance v15, Lcom/whoop/domain/model/teams/FeatureTeam;

    move/from16 v20, v13

    move/from16 v21, v14

    invoke-direct/range {v15 .. v25}, Lcom/whoop/domain/model/teams/FeatureTeam;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lcom/whoop/domain/model/teams/TeamType;IZ)V

    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v15, v2, v3}, Lcom/whoop/domain/model/teams/FeatureTeam;->setId(J)V

    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v2, p1

    move v3, v0

    move/from16 v0, v26

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_a

    :cond_7
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v12

    :goto_a
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic lambda$getFlowFeatureTeamData$4(Ltb/a;)Ljava/util/List;
    .locals 27

    const-string v0, "SELECT * FROM table_feature_teams"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_0
    const-string v0, "name"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "description"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "iconUrl"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "bannerUrl"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "athletePrivacyId"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "memberCount"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "inviteCode"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "teamType"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "communityId"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "showBadge"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "id"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v1, v0}, Ltb/c;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_0

    const/16 v16, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v16, v13

    :goto_1
    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_1

    const/16 v17, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v17, v13

    :goto_2
    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_2

    const/16 v18, 0x0

    goto :goto_3

    :cond_2
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v18, v13

    :goto_3
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_3

    const/16 v19, 0x0

    goto :goto_4

    :cond_3
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v19, v13

    :goto_4
    invoke-interface {v1, v5}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v13, v14

    invoke-interface {v1, v6}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_4

    const/16 v22, 0x0

    goto :goto_5

    :cond_4
    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v22, v15

    :goto_5
    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_5

    const/4 v15, 0x0

    :goto_6
    move/from16 v26, v0

    move/from16 p1, v2

    move-object/from16 v2, p0

    goto :goto_7

    :cond_5
    invoke-interface {v1, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    goto :goto_6

    :goto_7
    iget-object v0, v2, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->__teamTypeConverter:Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;

    invoke-virtual {v0, v15}, Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;->toTeamType(Ljava/lang/String;)Lcom/whoop/domain/model/teams/TeamType;

    move-result-object v23

    move v0, v3

    invoke-interface {v1, v9}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v24, v2

    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    if-eqz v2, :cond_6

    const/4 v2, 0x1

    :goto_8
    move/from16 v25, v2

    goto :goto_9

    :cond_6
    const/4 v2, 0x0

    goto :goto_8

    :goto_9
    new-instance v15, Lcom/whoop/domain/model/teams/FeatureTeam;

    move/from16 v20, v13

    move/from16 v21, v14

    invoke-direct/range {v15 .. v25}, Lcom/whoop/domain/model/teams/FeatureTeam;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lcom/whoop/domain/model/teams/TeamType;IZ)V

    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v15, v2, v3}, Lcom/whoop/domain/model/teams/FeatureTeam;->setId(J)V

    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v2, p1

    move v3, v0

    move/from16 v0, v26

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_a

    :cond_7
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v12

    :goto_a
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic lambda$saveFeatureTeam$0(Lcom/whoop/domain/model/teams/FeatureTeam;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->__insertAdapterOfFeatureTeam:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private synthetic lambda$updateAllBadgeStatus$1(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao;->updateAllBadgeStatus(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic lambda$updateBannerStatus$6(ZILtb/a;)Ll83/a0;
    .locals 2

    const-string v0, "UPDATE table_feature_teams SET showBadge = (?) WHERE communityId = (?)"

    invoke-interface {p2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p2

    int-to-long v0, p0

    const/4 p0, 0x1

    :try_start_0
    invoke-interface {p2, p0, v0, v1}, Ltb/c;->p(IJ)V

    const/4 p0, 0x2

    int-to-long v0, p1

    invoke-interface {p2, p0, v0, v1}, Ltb/c;->p(IJ)V

    invoke-interface {p2}, Ltb/c;->e1()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method


# virtual methods
.method public addFeatureTeams(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/FeatureTeam;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lbe1/c;

    const/16 v2, 0x13

    invoke-direct {v1, v2, p0, p1}, Lbe1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1, p2}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public deleteAllFeatureTeams(Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/i;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getFeatureTeamByCommunityId(I)Lcom/whoop/domain/model/teams/FeatureTeam;
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/local/room/dao/wipeable/c;-><init>(Ljava/lang/Object;II)V

    const/4 p1, 0x1

    invoke-static {v0, p1, v2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/domain/model/teams/FeatureTeam;

    return-object p1
.end method

.method public getFeatureTeamData(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/FeatureTeam;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/local/room/dao/wipeable/b;-><init>(Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getFlowFeatureTeamData()Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->__db:Landroidx/room/z0;

    const-string v1, "table_feature_teams"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/data/local/room/dao/wipeable/b;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lcom/whoop/data/local/room/dao/wipeable/b;-><init>(Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;I)V

    invoke-static {v0, v1, v2}, Ldt/b;->l(Landroidx/room/z0;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lec3/l1;

    move-result-object v0

    return-object v0
.end method

.method public saveFeatureTeam(Lcom/whoop/domain/model/teams/FeatureTeam;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/teams/FeatureTeam;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lbe1/c;

    const/16 v2, 0x12

    invoke-direct {v1, v2, p0, p1}, Lbe1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public updateAllBadgeStatus(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/FeatureTeam;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lam2/i0;

    const/4 v2, 0x2

    invoke-direct {v1, p0, p1, p2, v2}, Lam2/i0;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    invoke-static {v0, v1, p3}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public updateBannerStatus(ZILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lcom/whoop/data/local/room/dao/wipeable/a;-><init>(ZII)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
