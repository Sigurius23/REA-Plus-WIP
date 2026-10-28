.class public final Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;


# instance fields
.field private final __db:Landroidx/room/z0;

.field private final __insertAdapterOfMemberStory:Landroidx/room/k;
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

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl$1;

    invoke-direct {p1, p0}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl$1;-><init>(Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;)V

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->__insertAdapterOfMemberStory:Landroidx/room/k;

    return-void
.end method

.method public static synthetic a(ILtb/a;)Lcom/whoop/domain/model/teams/MemberStory;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->lambda$getMemberStoryById$5(ILtb/a;)Lcom/whoop/domain/model/teams/MemberStory;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;ZLjava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->lambda$updateAllBadgeStatus$2(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;Lcom/whoop/domain/model/teams/MemberStory;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->lambda$saveMemberStory$0(Lcom/whoop/domain/model/teams/MemberStory;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ltb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->lambda$deleteAllMemberStories$6(Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ZILtb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->lambda$updateBannerStatus$7(ZILtb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ltb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->lambda$getFlowMemberStoryData$4(Ltb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ltb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->lambda$getMemberStoryData$3(Ltb/a;)Ljava/util/List;

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

.method public static synthetic h(Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->lambda$addMemberStories$1(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic lambda$addMemberStories$1(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;->addMemberStories(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic lambda$deleteAllMemberStories$6(Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "DELETE FROM table_member_stories"

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

.method private static synthetic lambda$getFlowMemberStoryData$4(Ltb/a;)Ljava/util/List;
    .locals 60

    const-string v0, "SELECT * FROM table_member_stories"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_0
    const-string v0, "memberStoryId"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "created_at"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "updated_at"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "title"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "publish_date"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "url"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "image"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "content_type"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "showBadge"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "description"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "deleted"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "featured"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "live"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "archived"

    invoke-static {v1, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "live_time"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 p0, v15

    const-string v15, "host_id"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v16, v15

    const-string v15, "url_text"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v17, v15

    const-string v15, "cta_text"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v18, v15

    const-string v15, "id"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v19, v15

    const-string v15, "user_id"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v20, v15

    const-string v15, "first_name"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v21, v15

    const-string v15, "last_name"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v22, v15

    const-string v15, "name"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v23, v15

    const-string v15, "username"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v24, v15

    const-string v15, "avatar_url"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v25, v15

    const-string v15, "host_created_at"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v26, v15

    const-string v15, "host_updated_at"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v27, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v28

    if-eqz v28, :cond_20

    move/from16 v28, v14

    move-object/from16 v29, v15

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v15

    const/16 v30, 0x0

    if-eqz v15, :cond_0

    move-object/from16 v32, v30

    goto :goto_1

    :cond_0
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v32, v15

    :goto_1
    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_1

    move-object/from16 v33, v30

    goto :goto_2

    :cond_1
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v33, v15

    :goto_2
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_2

    move-object/from16 v34, v30

    goto :goto_3

    :cond_2
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v34, v15

    :goto_3
    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_3

    move-object/from16 v35, v30

    goto :goto_4

    :cond_3
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v35, v15

    :goto_4
    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_4

    move-object/from16 v36, v30

    goto :goto_5

    :cond_4
    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v36, v15

    :goto_5
    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_5

    move-object/from16 v37, v30

    goto :goto_6

    :cond_5
    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v37, v15

    :goto_6
    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_6

    move-object/from16 v38, v30

    move v15, v2

    move/from16 v50, v3

    goto :goto_7

    :cond_6
    invoke-interface {v1, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v38, v15

    move/from16 v50, v3

    move v15, v2

    :goto_7
    invoke-interface {v1, v9}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    const/16 v31, 0x1

    if-eqz v2, :cond_7

    move/from16 v39, v31

    goto :goto_8

    :cond_7
    const/16 v39, 0x0

    :goto_8
    invoke-interface {v1, v10}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_8

    move-object/from16 v40, v30

    :goto_9
    move v2, v4

    goto :goto_a

    :cond_8
    invoke-interface {v1, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v40, v2

    goto :goto_9

    :goto_a
    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    if-eqz v3, :cond_9

    move/from16 v41, v31

    goto :goto_b

    :cond_9
    const/16 v41, 0x0

    :goto_b
    invoke-interface {v1, v12}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    if-eqz v3, :cond_a

    move/from16 v42, v31

    goto :goto_c

    :cond_a
    const/16 v42, 0x0

    :goto_c
    invoke-interface {v1, v13}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    if-eqz v3, :cond_b

    move/from16 v43, v31

    :goto_d
    move/from16 v3, v28

    move/from16 v28, v5

    goto :goto_e

    :cond_b
    const/16 v43, 0x0

    goto :goto_d

    :goto_e
    invoke-interface {v1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    if-eqz v4, :cond_c

    move/from16 v44, v31

    :goto_f
    move/from16 v4, p0

    goto :goto_10

    :cond_c
    const/16 v44, 0x0

    goto :goto_f

    :goto_10
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_d

    move-object/from16 v45, v30

    :goto_11
    move/from16 p0, v2

    move/from16 v5, v16

    move/from16 v16, v3

    goto :goto_12

    :cond_d
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v45, v5

    goto :goto_11

    :goto_12
    invoke-interface {v1, v5}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v3, v17

    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_e

    move-object/from16 v47, v30

    :goto_13
    move/from16 v17, v0

    move/from16 v0, v18

    goto :goto_14

    :cond_e
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v47, v17

    goto :goto_13

    :goto_14
    invoke-interface {v1, v0}, Ltb/c;->isNull(I)Z

    move-result v18

    if-eqz v18, :cond_f

    move-object/from16 v48, v30

    :goto_15
    move/from16 v18, v0

    move/from16 v0, v20

    goto :goto_16

    :cond_f
    invoke-interface {v1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v48, v18

    goto :goto_15

    :goto_16
    invoke-interface {v1, v0}, Ltb/c;->isNull(I)Z

    move-result v20

    if-eqz v20, :cond_17

    move/from16 v46, v2

    move/from16 v2, v21

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v20

    if-eqz v20, :cond_16

    move/from16 v20, v3

    move/from16 v3, v22

    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v21

    if-eqz v21, :cond_15

    move/from16 v21, v4

    move/from16 v4, v23

    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v22

    if-eqz v22, :cond_14

    move/from16 v22, v5

    move/from16 v5, v24

    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v23

    if-eqz v23, :cond_13

    move/from16 v23, v6

    move/from16 v6, v25

    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_12

    move/from16 v24, v7

    move/from16 v7, v26

    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v25

    if-eqz v25, :cond_11

    move/from16 v25, v8

    move/from16 v8, v27

    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v26

    if-nez v26, :cond_10

    goto :goto_1d

    :cond_10
    move/from16 v26, v9

    move/from16 v27, v10

    move-object/from16 v49, v30

    goto/16 :goto_27

    :catchall_0
    move-exception v0

    goto/16 :goto_28

    :cond_11
    :goto_17
    move/from16 v25, v8

    :goto_18
    move/from16 v8, v27

    goto :goto_1d

    :cond_12
    :goto_19
    move/from16 v24, v7

    move/from16 v25, v8

    move/from16 v7, v26

    goto :goto_18

    :cond_13
    :goto_1a
    move/from16 v23, v6

    move/from16 v24, v7

    move/from16 v6, v25

    move/from16 v7, v26

    goto :goto_17

    :cond_14
    :goto_1b
    move/from16 v22, v5

    move/from16 v23, v6

    move/from16 v5, v24

    move/from16 v6, v25

    goto :goto_19

    :cond_15
    :goto_1c
    move/from16 v21, v4

    move/from16 v22, v5

    move/from16 v4, v23

    move/from16 v5, v24

    goto :goto_1a

    :cond_16
    move/from16 v20, v3

    move/from16 v21, v4

    move/from16 v3, v22

    move/from16 v4, v23

    goto :goto_1b

    :cond_17
    move/from16 v46, v2

    move/from16 v20, v3

    move/from16 v2, v21

    move/from16 v3, v22

    goto :goto_1c

    :goto_1d
    invoke-interface {v1, v0}, Ltb/c;->isNull(I)Z

    move-result v26

    if-eqz v26, :cond_18

    move/from16 v26, v9

    move/from16 v27, v10

    move-object/from16 v52, v30

    goto :goto_1e

    :cond_18
    move/from16 v26, v9

    move/from16 v27, v10

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v9

    long-to-int v9, v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object/from16 v52, v9

    :goto_1e
    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_19

    move-object/from16 v53, v30

    goto :goto_1f

    :cond_19
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v53, v9

    :goto_1f
    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1a

    move-object/from16 v54, v30

    goto :goto_20

    :cond_1a
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v54, v9

    :goto_20
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1b

    move-object/from16 v55, v30

    goto :goto_21

    :cond_1b
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v55, v9

    :goto_21
    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1c

    move-object/from16 v56, v30

    goto :goto_22

    :cond_1c
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v56, v9

    :goto_22
    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1d

    move-object/from16 v57, v30

    goto :goto_23

    :cond_1d
    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v57, v9

    :goto_23
    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1e

    move-object/from16 v58, v30

    goto :goto_24

    :cond_1e
    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v58, v9

    :goto_24
    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1f

    :goto_25
    move-object/from16 v59, v30

    goto :goto_26

    :cond_1f
    invoke-interface {v1, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v30

    goto :goto_25

    :goto_26
    new-instance v51, Lcom/whoop/data/local/room/entity/AmaHost;

    invoke-direct/range {v51 .. v59}, Lcom/whoop/data/local/room/entity/AmaHost;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v49, v51

    :goto_27
    new-instance v30, Lcom/whoop/domain/model/teams/MemberStory;

    move/from16 v31, v14

    invoke-direct/range {v30 .. v49}, Lcom/whoop/domain/model/teams/MemberStory;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/whoop/data/local/room/entity/AmaHost;)V

    move-object/from16 v9, v30

    move v14, v2

    move/from16 v10, v19

    move/from16 v19, v3

    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v9, v2, v3}, Lcom/whoop/domain/model/teams/MemberStory;->setId(J)V

    move-object/from16 v2, v29

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v3, v4

    move/from16 v4, p0

    move/from16 p0, v21

    move/from16 v21, v14

    move/from16 v14, v16

    move/from16 v16, v22

    move/from16 v22, v19

    move/from16 v19, v10

    move/from16 v10, v27

    move/from16 v27, v8

    move/from16 v8, v25

    move/from16 v25, v6

    move/from16 v6, v23

    move/from16 v23, v3

    move/from16 v3, v20

    move/from16 v20, v0

    move/from16 v0, v17

    move/from16 v17, v3

    move v3, v15

    move-object v15, v2

    move v2, v3

    move/from16 v9, v26

    move/from16 v3, v50

    move/from16 v26, v7

    move/from16 v7, v24

    move/from16 v24, v5

    move/from16 v5, v28

    goto/16 :goto_0

    :cond_20
    move-object v2, v15

    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v2

    :goto_28
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic lambda$getMemberStoryById$5(ILtb/a;)Lcom/whoop/domain/model/teams/MemberStory;
    .locals 58

    const-string v0, "SELECT * from table_member_stories WHERE memberStoryId= (?)"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    move/from16 v0, p0

    int-to-long v2, v0

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const-string v2, "memberStoryId"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "created_at"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "updated_at"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "title"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "publish_date"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "url"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "image"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "content_type"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "showBadge"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "description"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "deleted"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "featured"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "live"

    invoke-static {v1, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "archived"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v0, "live_time"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 p1, v0

    const-string v0, "host_id"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v16, v0

    const-string v0, "url_text"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v17, v0

    const-string v0, "cta_text"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v18, v0

    const-string v0, "id"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v19, v0

    const-string v0, "user_id"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v20, v0

    const-string v0, "first_name"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v21, v0

    const-string v0, "last_name"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v22, v0

    const-string v0, "name"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v23, v0

    const-string v0, "username"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v24, v0

    const-string v0, "avatar_url"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v25, v0

    const-string v0, "host_created_at"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    move/from16 v26, v0

    const-string v0, "host_updated_at"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v27

    const/16 v28, 0x0

    if-eqz v27, :cond_20

    move/from16 v27, v14

    move/from16 v29, v15

    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v2, v14

    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_0

    move-object/from16 v32, v28

    goto :goto_0

    :cond_0
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v32, v3

    :goto_0
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object/from16 v33, v28

    goto :goto_1

    :cond_1
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v33, v3

    :goto_1
    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object/from16 v34, v28

    goto :goto_2

    :cond_2
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v34, v3

    :goto_2
    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_3

    move-object/from16 v35, v28

    goto :goto_3

    :cond_3
    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v35, v3

    :goto_3
    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_4

    move-object/from16 v36, v28

    goto :goto_4

    :cond_4
    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v36, v3

    :goto_4
    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_5

    move-object/from16 v37, v28

    goto :goto_5

    :cond_5
    invoke-interface {v1, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v37, v3

    :goto_5
    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_6

    move-object/from16 v38, v28

    goto :goto_6

    :cond_6
    invoke-interface {v1, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v38, v3

    :goto_6
    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    const/4 v4, 0x0

    if-eqz v3, :cond_7

    const/16 v39, 0x1

    goto :goto_7

    :cond_7
    move/from16 v39, v4

    :goto_7
    invoke-interface {v1, v11}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_8

    move-object/from16 v40, v28

    goto :goto_8

    :cond_8
    invoke-interface {v1, v11}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v40, v3

    :goto_8
    invoke-interface {v1, v12}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v3, v5

    if-eqz v3, :cond_9

    const/16 v41, 0x1

    goto :goto_9

    :cond_9
    move/from16 v41, v4

    :goto_9
    invoke-interface {v1, v13}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v3, v5

    if-eqz v3, :cond_a

    const/16 v42, 0x1

    :goto_a
    move/from16 v3, v27

    goto :goto_b

    :cond_a
    move/from16 v42, v4

    goto :goto_a

    :goto_b
    invoke-interface {v1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v3, v5

    if-eqz v3, :cond_b

    const/16 v43, 0x1

    :goto_c
    move/from16 v3, v29

    goto :goto_d

    :cond_b
    move/from16 v43, v4

    goto :goto_c

    :goto_d
    invoke-interface {v1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v3, v5

    if-eqz v3, :cond_c

    const/16 v44, 0x1

    :goto_e
    move/from16 v3, p1

    goto :goto_f

    :cond_c
    move/from16 v44, v4

    goto :goto_e

    :goto_f
    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_d

    move-object/from16 v45, v28

    :goto_10
    move/from16 v3, v16

    goto :goto_11

    :cond_d
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v45, v3

    goto :goto_10

    :goto_11
    invoke-interface {v1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v4, v17

    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_e

    move-object/from16 v47, v28

    :goto_12
    move/from16 v4, v18

    goto :goto_13

    :cond_e
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v47, v4

    goto :goto_12

    :goto_13
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_f

    move-object/from16 v48, v28

    :goto_14
    move/from16 v4, v20

    goto :goto_15

    :cond_f
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v48, v4

    goto :goto_14

    :goto_15
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_16

    move/from16 v5, v21

    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_15

    move/from16 v6, v22

    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_14

    move/from16 v7, v23

    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_13

    move/from16 v8, v24

    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_12

    move/from16 v9, v25

    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v10

    if-eqz v10, :cond_11

    move/from16 v10, v26

    invoke-interface {v1, v10}, Ltb/c;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_17

    invoke-interface {v1, v0}, Ltb/c;->isNull(I)Z

    move-result v11

    if-nez v11, :cond_10

    goto :goto_1b

    :cond_10
    move-object/from16 v49, v28

    goto/16 :goto_25

    :catchall_0
    move-exception v0

    goto/16 :goto_26

    :cond_11
    :goto_16
    move/from16 v10, v26

    goto :goto_1b

    :cond_12
    :goto_17
    move/from16 v9, v25

    goto :goto_16

    :cond_13
    :goto_18
    move/from16 v8, v24

    goto :goto_17

    :cond_14
    :goto_19
    move/from16 v7, v23

    goto :goto_18

    :cond_15
    :goto_1a
    move/from16 v6, v22

    goto :goto_19

    :cond_16
    move/from16 v5, v21

    goto :goto_1a

    :cond_17
    :goto_1b
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_18

    move-object/from16 v50, v28

    goto :goto_1c

    :cond_18
    invoke-interface {v1, v4}, Ltb/c;->getLong(I)J

    move-result-wide v11

    long-to-int v4, v11

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v50, v4

    :goto_1c
    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_19

    move-object/from16 v51, v28

    goto :goto_1d

    :cond_19
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v51, v4

    :goto_1d
    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1a

    move-object/from16 v52, v28

    goto :goto_1e

    :cond_1a
    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v52, v4

    :goto_1e
    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1b

    move-object/from16 v53, v28

    goto :goto_1f

    :cond_1b
    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v53, v4

    :goto_1f
    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1c

    move-object/from16 v54, v28

    goto :goto_20

    :cond_1c
    invoke-interface {v1, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v54, v4

    :goto_20
    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1d

    move-object/from16 v55, v28

    goto :goto_21

    :cond_1d
    invoke-interface {v1, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v55, v4

    :goto_21
    invoke-interface {v1, v10}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1e

    move-object/from16 v56, v28

    goto :goto_22

    :cond_1e
    invoke-interface {v1, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v56, v4

    :goto_22
    invoke-interface {v1, v0}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1f

    :goto_23
    move-object/from16 v57, v28

    goto :goto_24

    :cond_1f
    invoke-interface {v1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v28

    goto :goto_23

    :goto_24
    new-instance v49, Lcom/whoop/data/local/room/entity/AmaHost;

    invoke-direct/range {v49 .. v57}, Lcom/whoop/data/local/room/entity/AmaHost;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_25
    new-instance v30, Lcom/whoop/domain/model/teams/MemberStory;

    move/from16 v31, v2

    move/from16 v46, v3

    invoke-direct/range {v30 .. v49}, Lcom/whoop/domain/model/teams/MemberStory;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/whoop/data/local/room/entity/AmaHost;)V

    move-object/from16 v0, v30

    move/from16 v2, v19

    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/whoop/domain/model/teams/MemberStory;->setId(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v28, v0

    :cond_20
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v28

    :goto_26
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic lambda$getMemberStoryData$3(Ltb/a;)Ljava/util/List;
    .locals 60

    const-string v0, "SELECT * FROM table_member_stories"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_0
    const-string v0, "memberStoryId"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "created_at"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "updated_at"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "title"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "publish_date"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "url"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "image"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "content_type"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "showBadge"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "description"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "deleted"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "featured"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "live"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "archived"

    invoke-static {v1, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "live_time"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 p0, v15

    const-string v15, "host_id"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v16, v15

    const-string v15, "url_text"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v17, v15

    const-string v15, "cta_text"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v18, v15

    const-string v15, "id"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v19, v15

    const-string v15, "user_id"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v20, v15

    const-string v15, "first_name"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v21, v15

    const-string v15, "last_name"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v22, v15

    const-string v15, "name"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v23, v15

    const-string v15, "username"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v24, v15

    const-string v15, "avatar_url"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v25, v15

    const-string v15, "host_created_at"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v26, v15

    const-string v15, "host_updated_at"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v27, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v28

    if-eqz v28, :cond_20

    move/from16 v28, v14

    move-object/from16 v29, v15

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v15

    const/16 v30, 0x0

    if-eqz v15, :cond_0

    move-object/from16 v32, v30

    goto :goto_1

    :cond_0
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v32, v15

    :goto_1
    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_1

    move-object/from16 v33, v30

    goto :goto_2

    :cond_1
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v33, v15

    :goto_2
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_2

    move-object/from16 v34, v30

    goto :goto_3

    :cond_2
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v34, v15

    :goto_3
    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_3

    move-object/from16 v35, v30

    goto :goto_4

    :cond_3
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v35, v15

    :goto_4
    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_4

    move-object/from16 v36, v30

    goto :goto_5

    :cond_4
    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v36, v15

    :goto_5
    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_5

    move-object/from16 v37, v30

    goto :goto_6

    :cond_5
    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v37, v15

    :goto_6
    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_6

    move-object/from16 v38, v30

    move v15, v2

    move/from16 v50, v3

    goto :goto_7

    :cond_6
    invoke-interface {v1, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v38, v15

    move/from16 v50, v3

    move v15, v2

    :goto_7
    invoke-interface {v1, v9}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    const/16 v31, 0x1

    if-eqz v2, :cond_7

    move/from16 v39, v31

    goto :goto_8

    :cond_7
    const/16 v39, 0x0

    :goto_8
    invoke-interface {v1, v10}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_8

    move-object/from16 v40, v30

    :goto_9
    move v2, v4

    goto :goto_a

    :cond_8
    invoke-interface {v1, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v40, v2

    goto :goto_9

    :goto_a
    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    if-eqz v3, :cond_9

    move/from16 v41, v31

    goto :goto_b

    :cond_9
    const/16 v41, 0x0

    :goto_b
    invoke-interface {v1, v12}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    if-eqz v3, :cond_a

    move/from16 v42, v31

    goto :goto_c

    :cond_a
    const/16 v42, 0x0

    :goto_c
    invoke-interface {v1, v13}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    if-eqz v3, :cond_b

    move/from16 v43, v31

    :goto_d
    move/from16 v3, v28

    move/from16 v28, v5

    goto :goto_e

    :cond_b
    const/16 v43, 0x0

    goto :goto_d

    :goto_e
    invoke-interface {v1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    if-eqz v4, :cond_c

    move/from16 v44, v31

    :goto_f
    move/from16 v4, p0

    goto :goto_10

    :cond_c
    const/16 v44, 0x0

    goto :goto_f

    :goto_10
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_d

    move-object/from16 v45, v30

    :goto_11
    move/from16 p0, v2

    move/from16 v5, v16

    move/from16 v16, v3

    goto :goto_12

    :cond_d
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v45, v5

    goto :goto_11

    :goto_12
    invoke-interface {v1, v5}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v3, v17

    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_e

    move-object/from16 v47, v30

    :goto_13
    move/from16 v17, v0

    move/from16 v0, v18

    goto :goto_14

    :cond_e
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v47, v17

    goto :goto_13

    :goto_14
    invoke-interface {v1, v0}, Ltb/c;->isNull(I)Z

    move-result v18

    if-eqz v18, :cond_f

    move-object/from16 v48, v30

    :goto_15
    move/from16 v18, v0

    move/from16 v0, v20

    goto :goto_16

    :cond_f
    invoke-interface {v1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v48, v18

    goto :goto_15

    :goto_16
    invoke-interface {v1, v0}, Ltb/c;->isNull(I)Z

    move-result v20

    if-eqz v20, :cond_17

    move/from16 v46, v2

    move/from16 v2, v21

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v20

    if-eqz v20, :cond_16

    move/from16 v20, v3

    move/from16 v3, v22

    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v21

    if-eqz v21, :cond_15

    move/from16 v21, v4

    move/from16 v4, v23

    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v22

    if-eqz v22, :cond_14

    move/from16 v22, v5

    move/from16 v5, v24

    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v23

    if-eqz v23, :cond_13

    move/from16 v23, v6

    move/from16 v6, v25

    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_12

    move/from16 v24, v7

    move/from16 v7, v26

    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v25

    if-eqz v25, :cond_11

    move/from16 v25, v8

    move/from16 v8, v27

    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v26

    if-nez v26, :cond_10

    goto :goto_1d

    :cond_10
    move/from16 v26, v9

    move/from16 v27, v10

    move-object/from16 v49, v30

    goto/16 :goto_27

    :catchall_0
    move-exception v0

    goto/16 :goto_28

    :cond_11
    :goto_17
    move/from16 v25, v8

    :goto_18
    move/from16 v8, v27

    goto :goto_1d

    :cond_12
    :goto_19
    move/from16 v24, v7

    move/from16 v25, v8

    move/from16 v7, v26

    goto :goto_18

    :cond_13
    :goto_1a
    move/from16 v23, v6

    move/from16 v24, v7

    move/from16 v6, v25

    move/from16 v7, v26

    goto :goto_17

    :cond_14
    :goto_1b
    move/from16 v22, v5

    move/from16 v23, v6

    move/from16 v5, v24

    move/from16 v6, v25

    goto :goto_19

    :cond_15
    :goto_1c
    move/from16 v21, v4

    move/from16 v22, v5

    move/from16 v4, v23

    move/from16 v5, v24

    goto :goto_1a

    :cond_16
    move/from16 v20, v3

    move/from16 v21, v4

    move/from16 v3, v22

    move/from16 v4, v23

    goto :goto_1b

    :cond_17
    move/from16 v46, v2

    move/from16 v20, v3

    move/from16 v2, v21

    move/from16 v3, v22

    goto :goto_1c

    :goto_1d
    invoke-interface {v1, v0}, Ltb/c;->isNull(I)Z

    move-result v26

    if-eqz v26, :cond_18

    move/from16 v26, v9

    move/from16 v27, v10

    move-object/from16 v52, v30

    goto :goto_1e

    :cond_18
    move/from16 v26, v9

    move/from16 v27, v10

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v9

    long-to-int v9, v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object/from16 v52, v9

    :goto_1e
    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_19

    move-object/from16 v53, v30

    goto :goto_1f

    :cond_19
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v53, v9

    :goto_1f
    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1a

    move-object/from16 v54, v30

    goto :goto_20

    :cond_1a
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v54, v9

    :goto_20
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1b

    move-object/from16 v55, v30

    goto :goto_21

    :cond_1b
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v55, v9

    :goto_21
    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1c

    move-object/from16 v56, v30

    goto :goto_22

    :cond_1c
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v56, v9

    :goto_22
    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1d

    move-object/from16 v57, v30

    goto :goto_23

    :cond_1d
    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v57, v9

    :goto_23
    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1e

    move-object/from16 v58, v30

    goto :goto_24

    :cond_1e
    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v58, v9

    :goto_24
    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1f

    :goto_25
    move-object/from16 v59, v30

    goto :goto_26

    :cond_1f
    invoke-interface {v1, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v30

    goto :goto_25

    :goto_26
    new-instance v51, Lcom/whoop/data/local/room/entity/AmaHost;

    invoke-direct/range {v51 .. v59}, Lcom/whoop/data/local/room/entity/AmaHost;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v49, v51

    :goto_27
    new-instance v30, Lcom/whoop/domain/model/teams/MemberStory;

    move/from16 v31, v14

    invoke-direct/range {v30 .. v49}, Lcom/whoop/domain/model/teams/MemberStory;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/whoop/data/local/room/entity/AmaHost;)V

    move-object/from16 v9, v30

    move v14, v2

    move/from16 v10, v19

    move/from16 v19, v3

    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v9, v2, v3}, Lcom/whoop/domain/model/teams/MemberStory;->setId(J)V

    move-object/from16 v2, v29

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v3, v4

    move/from16 v4, p0

    move/from16 p0, v21

    move/from16 v21, v14

    move/from16 v14, v16

    move/from16 v16, v22

    move/from16 v22, v19

    move/from16 v19, v10

    move/from16 v10, v27

    move/from16 v27, v8

    move/from16 v8, v25

    move/from16 v25, v6

    move/from16 v6, v23

    move/from16 v23, v3

    move/from16 v3, v20

    move/from16 v20, v0

    move/from16 v0, v17

    move/from16 v17, v3

    move v3, v15

    move-object v15, v2

    move v2, v3

    move/from16 v9, v26

    move/from16 v3, v50

    move/from16 v26, v7

    move/from16 v7, v24

    move/from16 v24, v5

    move/from16 v5, v28

    goto/16 :goto_0

    :cond_20
    move-object v2, v15

    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v2

    :goto_28
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic lambda$saveMemberStory$0(Lcom/whoop/domain/model/teams/MemberStory;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->__insertAdapterOfMemberStory:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private synthetic lambda$updateAllBadgeStatus$2(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao;->updateAllBadgeStatus(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic lambda$updateBannerStatus$7(ZILtb/a;)Ll83/a0;
    .locals 2

    const-string v0, "UPDATE table_member_stories SET showBadge = (?) WHERE memberStoryId = (?)"

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
.method public addMemberStories(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/MemberStory;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lbe1/c;

    const/16 v2, 0x18

    invoke-direct {v1, v2, p0, p1}, Lbe1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1, p2}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public deleteAllMemberStories(Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/i;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getFlowMemberStoryData()Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->__db:Landroidx/room/z0;

    const-string v1, "table_member_stories"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/data/local/room/dao/persistent/i;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    invoke-static {v0, v1, v2}, Ldt/b;->l(Landroidx/room/z0;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lec3/l1;

    move-result-object v0

    return-object v0
.end method

.method public getMemberStoryById(I)Lcom/whoop/domain/model/teams/MemberStory;
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/e;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lcom/whoop/data/local/room/dao/persistent/e;-><init>(II)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/domain/model/teams/MemberStory;

    return-object p1
.end method

.method public getMemberStoryData(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/MemberStory;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/i;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public saveMemberStory(Lcom/whoop/domain/model/teams/MemberStory;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/teams/MemberStory;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lbe1/c;

    const/16 v2, 0x17

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
            "Lcom/whoop/domain/model/teams/MemberStory;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lam2/i0;

    const/4 v2, 0x3

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

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/a;

    const/4 v2, 0x1

    invoke-direct {v1, p1, p2, v2}, Lcom/whoop/data/local/room/dao/wipeable/a;-><init>(ZII)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
