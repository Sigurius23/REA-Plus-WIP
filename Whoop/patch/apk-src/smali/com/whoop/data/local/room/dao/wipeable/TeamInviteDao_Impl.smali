.class public final Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;


# instance fields
.field private final __communityDtoConverter:Lcom/whoop/data/local/room/entity/converter/CommunityDtoConverter;

.field private final __communityMemberDtoConverter:Lcom/whoop/data/local/room/entity/converter/CommunityMemberDtoConverter;

.field private final __db:Landroidx/room/z0;

.field private final __insertAdapterOfTeamInviteDto:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/whoop/data/local/room/entity/converter/CommunityDtoConverter;

    invoke-direct {v0}, Lcom/whoop/data/local/room/entity/converter/CommunityDtoConverter;-><init>()V

    iput-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->__communityDtoConverter:Lcom/whoop/data/local/room/entity/converter/CommunityDtoConverter;

    new-instance v0, Lcom/whoop/data/local/room/entity/converter/CommunityMemberDtoConverter;

    invoke-direct {v0}, Lcom/whoop/data/local/room/entity/converter/CommunityMemberDtoConverter;-><init>()V

    iput-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->__communityMemberDtoConverter:Lcom/whoop/data/local/room/entity/converter/CommunityMemberDtoConverter;

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl$1;

    invoke-direct {p1, p0}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl$1;-><init>(Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;)V

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->__insertAdapterOfTeamInviteDto:Landroidx/room/k;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;ILjava/util/List;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->lambda$addInvites$1(ILjava/util/List;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->lambda$getLiveTeamInviteData$3(Ltb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;Lcom/whoop/domain/model/teams/TeamInviteDto;Ltb/a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->lambda$saveTeamInvite$0(Lcom/whoop/domain/model/teams/TeamInviteDto;Ltb/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ltb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->lambda$removeAllInvites$6(Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ZILtb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->lambda$updateBadgeStatus$4(ZILtb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(ILtb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->lambda$removeInvite$5(ILtb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;ZLjava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->lambda$updateAllBadgeStatus$2(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;

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

.method public static bridge synthetic h(Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;)Lcom/whoop/data/local/room/entity/converter/CommunityDtoConverter;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->__communityDtoConverter:Lcom/whoop/data/local/room/entity/converter/CommunityDtoConverter;

    return-object p0
.end method

.method public static bridge synthetic i(Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;)Lcom/whoop/data/local/room/entity/converter/CommunityMemberDtoConverter;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->__communityMemberDtoConverter:Lcom/whoop/data/local/room/entity/converter/CommunityMemberDtoConverter;

    return-object p0
.end method

.method private synthetic lambda$addInvites$1(ILjava/util/List;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;->addInvites(ILjava/util/List;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private synthetic lambda$getLiveTeamInviteData$3(Ltb/a;)Ljava/util/List;
    .locals 27

    move-object/from16 v1, p0

    const-string v0, "SELECT * FROM table_team_invites"

    move-object/from16 v2, p1

    invoke-interface {v2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_0
    const-string v0, "id"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v3, "status"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "deleted"

    invoke-static {v2, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "community_id"

    invoke-static {v2, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "sender_id"

    invoke-static {v2, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "recipient_id"

    invoke-static {v2, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "community"

    invoke-static {v2, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "sender"

    invoke-static {v2, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "community_invite_code"

    invoke-static {v2, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "showBadge"

    invoke-static {v2, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v13

    if-eqz v13, :cond_6

    invoke-interface {v2, v0}, Ltb/c;->getLong(I)J

    move-result-wide v13

    long-to-int v13, v13

    invoke-interface {v2, v3}, Ltb/c;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_0

    const/16 v17, 0x0

    :goto_1
    move/from16 v16, v13

    goto :goto_2

    :cond_0
    invoke-interface {v2, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v17, v14

    goto :goto_1

    :goto_2
    invoke-interface {v2, v4}, Ltb/c;->getLong(I)J

    move-result-wide v13

    long-to-int v13, v13

    const/16 v18, 0x1

    if-eqz v13, :cond_1

    goto :goto_3

    :cond_1
    const/16 v18, 0x0

    :goto_3
    invoke-interface {v2, v5}, Ltb/c;->getLong(I)J

    move-result-wide v13

    long-to-int v13, v13

    move v14, v3

    move/from16 v26, v4

    invoke-interface {v2, v6}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v20, v3

    invoke-interface {v2, v7}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-interface {v2, v8}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v4, 0x0

    goto :goto_4

    :cond_2
    invoke-interface {v2, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    :goto_4
    iget-object v15, v1, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->__communityDtoConverter:Lcom/whoop/data/local/room/entity/converter/CommunityDtoConverter;

    invoke-virtual {v15, v4}, Lcom/whoop/data/local/room/entity/converter/CommunityDtoConverter;->fromCommunityDto(Ljava/lang/String;)Lcom/whoop/domain/model/teams/CommunityDto;

    move-result-object v22

    invoke-interface {v2, v9}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v4, 0x0

    goto :goto_5

    :cond_3
    invoke-interface {v2, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    :goto_5
    iget-object v15, v1, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->__communityMemberDtoConverter:Lcom/whoop/data/local/room/entity/converter/CommunityMemberDtoConverter;

    invoke-virtual {v15, v4}, Lcom/whoop/data/local/room/entity/converter/CommunityMemberDtoConverter;->fromCommunityMemberDto(Ljava/lang/String;)Lcom/whoop/domain/model/teams/CommunityMemberDto;

    move-result-object v23

    invoke-interface {v2, v10}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v24, 0x0

    :goto_6
    move v4, v0

    goto :goto_7

    :cond_4
    invoke-interface {v2, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v24, v15

    goto :goto_6

    :goto_7
    invoke-interface {v2, v11}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    if-eqz v0, :cond_5

    const/16 v25, 0x1

    goto :goto_8

    :cond_5
    const/16 v25, 0x0

    :goto_8
    new-instance v15, Lcom/whoop/domain/model/teams/TeamInviteDto;

    move/from16 v21, v3

    move/from16 v19, v13

    invoke-direct/range {v15 .. v25}, Lcom/whoop/domain/model/teams/TeamInviteDto;-><init>(ILjava/lang/String;ZIIILcom/whoop/domain/model/teams/CommunityDto;Lcom/whoop/domain/model/teams/CommunityMemberDto;Ljava/lang/String;Z)V

    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v1, p0

    move v0, v4

    move v3, v14

    move/from16 v4, v26

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_9

    :cond_6
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object v12

    :goto_9
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic lambda$removeAllInvites$6(Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "DELETE FROM table_team_invites"

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

.method private static synthetic lambda$removeInvite$5(ILtb/a;)Ll83/a0;
    .locals 3

    const-string v0, "DELETE FROM table_team_invites WHERE id = (?)"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    const/4 v0, 0x1

    int-to-long v1, p0

    :try_start_0
    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    invoke-interface {p1}, Ltb/c;->e1()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private synthetic lambda$saveTeamInvite$0(Lcom/whoop/domain/model/teams/TeamInviteDto;Ltb/a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->__insertAdapterOfTeamInviteDto:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic lambda$updateAllBadgeStatus$2(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;->updateAllBadgeStatus(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic lambda$updateBadgeStatus$4(ZILtb/a;)Ll83/a0;
    .locals 2

    const-string v0, "UPDATE table_team_invites SET showBadge = (?) WHERE id = (?)"

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
.method public addInvites(ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/TeamInviteDto;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lcom/whoop/data/local/room/dao/wipeable/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public getLiveTeamInviteData()Landroidx/lifecycle/p0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->__db:Landroidx/room/z0;

    invoke-virtual {v0}, Landroidx/room/z0;->getInvalidationTracker()Landroidx/room/v;

    move-result-object v0

    const-string v1, "table_team_invites"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lck1/c;

    const/4 v3, 0x4

    invoke-direct {v2, p0, v3}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Landroidx/room/v;->b([Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Landroidx/room/e1;

    move-result-object v0

    return-object v0
.end method

.method public removeAllInvites(Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/i;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public removeInvite(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/e;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Lcom/whoop/data/local/room/dao/persistent/e;-><init>(II)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public saveTeamInvite(Lcom/whoop/domain/model/teams/TeamInviteDto;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lbe1/c;

    const/16 v2, 0x19

    invoke-direct {v1, v2, p0, p1}, Lbe1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public updateAllBadgeStatus(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/TeamInviteDto;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lam2/i0;

    const/4 v2, 0x4

    invoke-direct {v1, p0, p1, p2, v2}, Lam2/i0;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    invoke-static {v0, v1, p3}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public updateBadgeStatus(ZILq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/a;

    const/4 v2, 0x2

    invoke-direct {v1, p1, p2, v2}, Lcom/whoop/data/local/room/dao/wipeable/a;-><init>(ZII)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
