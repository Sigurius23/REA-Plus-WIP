.class public final Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;


# instance fields
.field private final __avatarUrlConverter:Lcom/whoop/data/local/room/entity/converter/AvatarUrlConverter;

.field private final __bannerUrlConverter:Lcom/whoop/data/local/room/entity/converter/BannerUrlConverter;

.field private final __db:Landroidx/room/z0;

.field private final __enableTabConverter:Lcom/whoop/data/local/room/entity/converter/EnableTabConverter;

.field private final __insertAdapterOfDefaultImages:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final __insertAdapterOfTeamsDto:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final __privacyTypeConverter:Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;

.field private final __teamTypeConverter:Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/whoop/data/local/room/entity/converter/EnableTabConverter;

    invoke-direct {v0}, Lcom/whoop/data/local/room/entity/converter/EnableTabConverter;-><init>()V

    iput-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__enableTabConverter:Lcom/whoop/data/local/room/entity/converter/EnableTabConverter;

    new-instance v0, Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;

    invoke-direct {v0}, Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;-><init>()V

    iput-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__teamTypeConverter:Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;

    new-instance v0, Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;

    invoke-direct {v0}, Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;-><init>()V

    iput-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__privacyTypeConverter:Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;

    new-instance v0, Lcom/whoop/data/local/room/entity/converter/BannerUrlConverter;

    invoke-direct {v0}, Lcom/whoop/data/local/room/entity/converter/BannerUrlConverter;-><init>()V

    iput-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__bannerUrlConverter:Lcom/whoop/data/local/room/entity/converter/BannerUrlConverter;

    new-instance v0, Lcom/whoop/data/local/room/entity/converter/AvatarUrlConverter;

    invoke-direct {v0}, Lcom/whoop/data/local/room/entity/converter/AvatarUrlConverter;-><init>()V

    iput-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__avatarUrlConverter:Lcom/whoop/data/local/room/entity/converter/AvatarUrlConverter;

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl$1;

    invoke-direct {p1, p0}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl$1;-><init>(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;)V

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__insertAdapterOfTeamsDto:Landroidx/room/k;

    new-instance p1, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl$2;

    invoke-direct {p1, p0}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl$2;-><init>(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;)V

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__insertAdapterOfDefaultImages:Landroidx/room/k;

    return-void
.end method

.method public static synthetic a(ILjava/lang/String;Ltb/a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->lambda$removeTeam$6(ILjava/lang/String;Ltb/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;Lcom/whoop/service/network/model/DefaultImages;Ltb/a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->lambda$saveDefaultImages$1(Lcom/whoop/service/network/model/DefaultImages;Ltb/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;Lcom/whoop/data/local/room/entity/TeamsDto;Ltb/a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->lambda$saveTeam$0(Lcom/whoop/data/local/room/entity/TeamsDto;Ltb/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILtb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->lambda$getTeamCount$5(ILtb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;Ltb/a;)Lcom/whoop/service/network/model/DefaultImages;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->lambda$getDefaultImagesLiveData$4(Ltb/a;)Lcom/whoop/service/network/model/DefaultImages;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;ILjava/util/List;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->lambda$updateTeams$2(ILjava/util/List;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(ILtb/a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->lambda$removeAllTeams$7(ILtb/a;)Ljava/lang/Object;

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

.method public static synthetic h(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;ILtb/a;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->lambda$getLiveTeamData$3(ILtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic i(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;)Lcom/whoop/data/local/room/entity/converter/AvatarUrlConverter;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__avatarUrlConverter:Lcom/whoop/data/local/room/entity/converter/AvatarUrlConverter;

    return-object p0
.end method

.method public static bridge synthetic j(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;)Lcom/whoop/data/local/room/entity/converter/BannerUrlConverter;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__bannerUrlConverter:Lcom/whoop/data/local/room/entity/converter/BannerUrlConverter;

    return-object p0
.end method

.method public static bridge synthetic k(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;)Lcom/whoop/data/local/room/entity/converter/EnableTabConverter;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__enableTabConverter:Lcom/whoop/data/local/room/entity/converter/EnableTabConverter;

    return-object p0
.end method

.method public static bridge synthetic l(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;)Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__privacyTypeConverter:Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;

    return-object p0
.end method

.method private synthetic lambda$getDefaultImagesLiveData$4(Ltb/a;)Lcom/whoop/service/network/model/DefaultImages;
    .locals 7

    const-string v0, "SELECT * FROM table_default_images"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    :try_start_0
    const-string v0, "id"

    invoke-static {p1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v1, "banners"

    invoke-static {p1, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    const-string v2, "avatars"

    invoke-static {p1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-interface {p1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v0, v5

    invoke-interface {p1, v1}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v1, v4

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    iget-object v3, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__bannerUrlConverter:Lcom/whoop/data/local/room/entity/converter/BannerUrlConverter;

    invoke-virtual {v3, v1}, Lcom/whoop/data/local/room/entity/converter/BannerUrlConverter;->stringToList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {p1, v2}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    :goto_1
    iget-object v2, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__avatarUrlConverter:Lcom/whoop/data/local/room/entity/converter/AvatarUrlConverter;

    invoke-virtual {v2, v4}, Lcom/whoop/data/local/room/entity/converter/AvatarUrlConverter;->stringToList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    new-instance v4, Lcom/whoop/service/network/model/DefaultImages;

    invoke-direct {v4, v0, v1, v2}, Lcom/whoop/service/network/model/DefaultImages;-><init>(ILjava/util/List;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-object v4

    :goto_3
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic lambda$getLiveTeamData$3(ILtb/a;)Ljava/util/List;
    .locals 61

    move-object/from16 v1, p0

    const-string v0, "SELECT * from table_teams WHERE user_id == (?)"

    move-object/from16 v2, p2

    invoke-interface {v2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    move/from16 v0, p1

    int-to-long v3, v0

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {v2, v0, v3, v4}, Ltb/c;->p(IJ)V

    const-string v3, "user_id"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "id"

    invoke-static {v2, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "name"

    invoke-static {v2, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "description"

    invoke-static {v2, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "icon_url"

    invoke-static {v2, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "banner_url"

    invoke-static {v2, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "athlete_privacy_id"

    invoke-static {v2, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "scores"

    invoke-static {v2, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "admin_id"

    invoke-static {v2, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "team_type"

    invoke-static {v2, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "member_count"

    invoke-static {v2, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "rank"

    invoke-static {v2, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "chat_enable"

    invoke-static {v2, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v0, "unread_count"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 p2, v0

    const-string v0, "team_privacy_profile_id"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v16, v0

    const-string v0, "team_privacy_profile_name"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v17, v0

    const-string v0, "basic"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v18, v0

    const-string v0, "stats"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v19, v0

    const-string v0, "comps"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v20, v0

    const-string v0, "overview"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v21, v0

    const-string v0, "intensity"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v22, v0

    const-string v0, "recovery"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v23, v0

    const-string v0, "sleep"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v24, v0

    const-string v0, "cid"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v25, v0

    const-string v0, "channel_id"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v26, v0

    const-string v0, "channel_type"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v27, v0

    const-string v0, "channel_name"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v28, v0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v29

    if-eqz v29, :cond_15

    invoke-interface {v2, v3}, Ltb/c;->isNull(I)Z

    move-result v29

    const/16 v30, 0x0

    if-eqz v29, :cond_0

    move/from16 v29, v14

    move/from16 v31, v15

    move-object/from16 v33, v30

    goto :goto_1

    :cond_0
    move/from16 v29, v14

    move/from16 v31, v15

    invoke-interface {v2, v3}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    move-object/from16 v33, v14

    :goto_1
    invoke-interface {v2, v4}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    invoke-interface {v2, v5}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_1

    move-object/from16 v35, v30

    goto :goto_2

    :cond_1
    invoke-interface {v2, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v35, v15

    :goto_2
    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_2

    move-object/from16 v36, v30

    goto :goto_3

    :cond_2
    invoke-interface {v2, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v36, v15

    :goto_3
    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_3

    move-object/from16 v37, v30

    goto :goto_4

    :cond_3
    invoke-interface {v2, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v37, v15

    :goto_4
    invoke-interface {v2, v8}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_4

    move-object/from16 v38, v30

    move v15, v3

    move/from16 v49, v4

    goto :goto_5

    :cond_4
    invoke-interface {v2, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v38, v15

    move/from16 v49, v4

    move v15, v3

    :goto_5
    invoke-interface {v2, v9}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-interface {v2, v10}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_5

    move-object/from16 v4, v30

    :goto_6
    move/from16 v39, v3

    goto :goto_7

    :cond_5
    invoke-interface {v2, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_6

    :goto_7
    iget-object v3, v1, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__enableTabConverter:Lcom/whoop/data/local/room/entity/converter/EnableTabConverter;

    invoke-virtual {v3, v4}, Lcom/whoop/data/local/room/entity/converter/EnableTabConverter;->storedStringToEnum(Ljava/lang/String;)Ljava/util/List;

    move-result-object v41

    invoke-interface {v2, v11}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-interface {v2, v12}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_6

    move-object/from16 v4, v30

    :goto_8
    move/from16 v42, v3

    goto :goto_9

    :cond_6
    invoke-interface {v2, v12}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_8

    :goto_9
    iget-object v3, v1, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__teamTypeConverter:Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;

    invoke-virtual {v3, v4}, Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;->toTeamType(Ljava/lang/String;)Lcom/whoop/domain/model/teams/TeamType;

    move-result-object v43

    invoke-interface {v2, v13}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v50, v6

    move/from16 v4, v29

    move/from16 v29, v5

    invoke-interface {v2, v4}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    move/from16 v44, v3

    move/from16 v6, v31

    move/from16 v31, v4

    invoke-interface {v2, v6}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    if-eqz v3, :cond_7

    const/16 v47, 0x1

    :goto_a
    move/from16 v3, p2

    move/from16 v45, v5

    goto :goto_b

    :cond_7
    const/16 v47, 0x0

    goto :goto_a

    :goto_b
    invoke-interface {v2, v3}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    move/from16 v5, v16

    invoke-interface {v2, v5}, Ltb/c;->isNull(I)Z

    move-result v16

    if-eqz v16, :cond_8

    move/from16 v16, v3

    move/from16 v48, v4

    move-object/from16 v52, v30

    :goto_c
    move/from16 v3, v17

    goto :goto_d

    :cond_8
    move/from16 v16, v3

    move/from16 v48, v4

    invoke-interface {v2, v5}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v52, v3

    goto :goto_c

    :goto_d
    invoke-interface {v2, v3}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_9

    move-object/from16 v53, v30

    :goto_e
    move/from16 v4, v18

    goto :goto_f

    :cond_9
    invoke-interface {v2, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v53, v4

    goto :goto_e

    :goto_f
    invoke-interface {v2, v4}, Ltb/c;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_a

    move/from16 v18, v5

    move/from16 v17, v6

    move-object/from16 v5, v30

    goto :goto_10

    :cond_a
    move/from16 v18, v5

    move/from16 v17, v6

    invoke-interface {v2, v4}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :goto_10
    if-nez v5, :cond_b

    move-object/from16 v54, v30

    :goto_11
    move v6, v3

    move/from16 v5, v19

    move/from16 v19, v4

    goto :goto_13

    :cond_b
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-eqz v5, :cond_c

    const/4 v5, 0x1

    goto :goto_12

    :cond_c
    const/4 v5, 0x0

    :goto_12
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    move-object/from16 v54, v5

    goto :goto_11

    :goto_13
    invoke-interface {v2, v5}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    iget-object v4, v1, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__privacyTypeConverter:Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;

    invoke-virtual {v4, v3}, Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;->toPrivacyType(I)Lcom/whoop/domain/model/teams/PrivacyType;

    move-result-object v55

    move/from16 v3, v20

    move/from16 v20, v5

    invoke-interface {v2, v3}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    iget-object v5, v1, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__privacyTypeConverter:Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;

    invoke-virtual {v5, v4}, Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;->toPrivacyType(I)Lcom/whoop/domain/model/teams/PrivacyType;

    move-result-object v56

    move/from16 p2, v6

    move/from16 v4, v21

    invoke-interface {v2, v4}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    iget-object v6, v1, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__privacyTypeConverter:Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;

    invoke-virtual {v6, v5}, Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;->toPrivacyType(I)Lcom/whoop/domain/model/teams/PrivacyType;

    move-result-object v57

    move v6, v3

    move/from16 v21, v4

    move/from16 v5, v22

    invoke-interface {v2, v5}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    iget-object v4, v1, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__privacyTypeConverter:Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;

    invoke-virtual {v4, v3}, Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;->toPrivacyType(I)Lcom/whoop/domain/model/teams/PrivacyType;

    move-result-object v58

    move/from16 v22, v5

    move/from16 v3, v23

    invoke-interface {v2, v3}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    iget-object v5, v1, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__privacyTypeConverter:Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;

    invoke-virtual {v5, v4}, Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;->toPrivacyType(I)Lcom/whoop/domain/model/teams/PrivacyType;

    move-result-object v59

    move/from16 v23, v6

    move/from16 v4, v24

    invoke-interface {v2, v4}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    iget-object v6, v1, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__privacyTypeConverter:Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;

    invoke-virtual {v6, v5}, Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;->toPrivacyType(I)Lcom/whoop/domain/model/teams/PrivacyType;

    move-result-object v60

    new-instance v51, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    invoke-direct/range {v51 .. v60}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;)V

    move/from16 v5, v25

    invoke-interface {v2, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_10

    move/from16 v6, v26

    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_f

    move/from16 v1, v27

    invoke-interface {v2, v1}, Ltb/c;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_e

    move/from16 v24, v3

    move/from16 v3, v28

    invoke-interface {v2, v3}, Ltb/c;->isNull(I)Z

    move-result v25

    if-nez v25, :cond_d

    goto :goto_16

    :cond_d
    move/from16 v28, v1

    move-object/from16 v25, v2

    move/from16 v26, v4

    move/from16 v27, v5

    move-object/from16 v46, v30

    move/from16 v30, v3

    goto/16 :goto_1c

    :catchall_0
    move-exception v0

    move-object/from16 v25, v2

    goto/16 :goto_1d

    :cond_e
    move/from16 v24, v3

    :goto_14
    move/from16 v3, v28

    goto :goto_16

    :cond_f
    move/from16 v24, v3

    :goto_15
    move/from16 v1, v27

    goto :goto_14

    :cond_10
    move/from16 v24, v3

    move/from16 v6, v26

    goto :goto_15

    :goto_16
    invoke-interface {v2, v5}, Ltb/c;->isNull(I)Z

    move-result v25

    if-eqz v25, :cond_11

    move/from16 v26, v4

    move-object/from16 v4, v30

    goto :goto_17

    :cond_11
    invoke-interface {v2, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v25

    move/from16 v26, v4

    move-object/from16 v4, v25

    :goto_17
    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v25

    if-eqz v25, :cond_12

    move/from16 v27, v5

    move-object/from16 v5, v30

    goto :goto_18

    :cond_12
    invoke-interface {v2, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v25

    move/from16 v27, v5

    move-object/from16 v5, v25

    :goto_18
    invoke-interface {v2, v1}, Ltb/c;->isNull(I)Z

    move-result v25

    if-eqz v25, :cond_13

    move/from16 v28, v1

    move-object/from16 v1, v30

    goto :goto_19

    :cond_13
    invoke-interface {v2, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v25

    move/from16 v28, v1

    move-object/from16 v1, v25

    :goto_19
    invoke-interface {v2, v3}, Ltb/c;->isNull(I)Z

    move-result v25

    if-eqz v25, :cond_14

    :goto_1a
    move-object/from16 v25, v2

    move-object/from16 v2, v30

    move/from16 v30, v3

    goto :goto_1b

    :cond_14
    invoke-interface {v2, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v30
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1a

    :goto_1b
    :try_start_1
    new-instance v3, Lcom/whoop/domain/model/teams/ChatChannel;

    invoke-direct {v3, v4, v5, v1, v2}, Lcom/whoop/domain/model/teams/ChatChannel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v46, v3

    :goto_1c
    new-instance v32, Lcom/whoop/data/local/room/entity/TeamsDto;

    move/from16 v34, v14

    move-object/from16 v40, v51

    invoke-direct/range {v32 .. v48}, Lcom/whoop/data/local/room/entity/TeamsDto;-><init>(Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)V

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v1, p0

    move v3, v15

    move/from16 v15, v17

    move-object/from16 v2, v25

    move/from16 v25, v27

    move/from16 v27, v28

    move/from16 v5, v29

    move/from16 v28, v30

    move/from16 v14, v31

    move/from16 v4, v49

    move/from16 v17, p2

    move/from16 p2, v16

    move/from16 v16, v18

    move/from16 v18, v19

    move/from16 v19, v20

    move/from16 v20, v23

    move/from16 v23, v24

    move/from16 v24, v26

    move/from16 v26, v6

    move/from16 v6, v50

    goto/16 :goto_0

    :catchall_1
    move-exception v0

    goto :goto_1d

    :cond_15
    move-object/from16 v25, v2

    invoke-interface/range {v25 .. v25}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_1d
    invoke-interface/range {v25 .. v25}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic lambda$getTeamCount$5(ILtb/a;)Ljava/lang/Integer;
    .locals 3

    const-string v0, "SELECT COUNT(*) FROM table_teams WHERE user_id = (?)"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    const/4 v0, 0x1

    int-to-long v1, p0

    :try_start_0
    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    const/4 p0, 0x0

    invoke-interface {p1, p0}, Ltb/c;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1, p0}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int p0, v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic lambda$removeAllTeams$7(ILtb/a;)Ljava/lang/Object;
    .locals 3

    const-string v0, "DELETE FROM table_teams WHERE user_id = (?)"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    const/4 v0, 0x1

    int-to-long v1, p0

    :try_start_0
    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    invoke-interface {p1}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic lambda$removeTeam$6(ILjava/lang/String;Ltb/a;)Ljava/lang/Object;
    .locals 3

    const-string v0, "DELETE FROM table_teams WHERE id = (?) and team_type=(?)"

    invoke-interface {p2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p2

    const/4 v0, 0x1

    int-to-long v1, p0

    :try_start_0
    invoke-interface {p2, v0, v1, v2}, Ltb/c;->p(IJ)V

    const/4 p0, 0x2

    if-nez p1, :cond_0

    invoke-interface {p2, p0}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    invoke-interface {p2, p0, p1}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-interface {p2}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    const/4 p0, 0x0

    return-object p0

    :goto_1
    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private synthetic lambda$saveDefaultImages$1(Lcom/whoop/service/network/model/DefaultImages;Ltb/a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__insertAdapterOfDefaultImages:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic lambda$saveTeam$0(Lcom/whoop/data/local/room/entity/TeamsDto;Ltb/a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__insertAdapterOfTeamsDto:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic lambda$updateTeams$2(ILjava/util/List;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;->updateTeams(ILjava/util/List;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public static bridge synthetic m(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;)Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__teamTypeConverter:Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;

    return-object p0
.end method


# virtual methods
.method public getDefaultImagesLiveData()Landroidx/lifecycle/p0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__db:Landroidx/room/z0;

    invoke-virtual {v0}, Landroidx/room/z0;->getInvalidationTracker()Landroidx/room/v;

    move-result-object v0

    const-string v1, "table_default_images"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lck1/c;

    const/4 v3, 0x5

    invoke-direct {v2, p0, v3}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Landroidx/room/v;->b([Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Landroidx/room/e1;

    move-result-object v0

    return-object v0
.end method

.method public getLiveTeamData(I)Landroidx/lifecycle/p0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__db:Landroidx/room/z0;

    invoke-virtual {v0}, Landroidx/room/z0;->getInvalidationTracker()Landroidx/room/v;

    move-result-object v0

    const-string v1, "table_teams"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/data/local/room/dao/wipeable/c;

    const/4 v3, 0x1

    invoke-direct {v2, p0, p1, v3}, Lcom/whoop/data/local/room/dao/wipeable/c;-><init>(Ljava/lang/Object;II)V

    const/4 p1, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroidx/room/v;->b([Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Landroidx/room/e1;

    move-result-object p1

    return-object p1
.end method

.method public getTeamCount(ILq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/e;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/whoop/data/local/room/dao/wipeable/e;-><init>(II)V

    const/4 p1, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public removeAllTeams(I)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/e;

    const/4 v2, 0x3

    invoke-direct {v1, p1, v2}, Lcom/whoop/data/local/room/dao/persistent/e;-><init>(II)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public removeTeam(ILjava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/c;

    const/4 v2, 0x2

    invoke-direct {v1, p1, p2, v2}, Lcom/whoop/data/local/room/dao/wipeable/c;-><init>(ILjava/lang/Object;I)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public saveDefaultImages(Lcom/whoop/service/network/model/DefaultImages;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lbe1/c;

    const/16 v2, 0x1b

    invoke-direct {v1, v2, p0, p1}, Lbe1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public saveTeam(Lcom/whoop/data/local/room/entity/TeamsDto;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lbe1/c;

    const/16 v2, 0x1a

    invoke-direct {v1, v2, p0, p1}, Lbe1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public updateTeams(ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/TeamsDto;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/d;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, p2, v2}, Lcom/whoop/data/local/room/dao/wipeable/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method
