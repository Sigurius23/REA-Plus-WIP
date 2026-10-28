.class Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl$1;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/k;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Ltb/c;Lcom/whoop/domain/model/teams/FeatureTeam;)V
    .locals 4

    .line 2
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/FeatureTeam;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 3
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/FeatureTeam;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 5
    :goto_0
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/FeatureTeam;->getDescription()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    .line 6
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    .line 7
    :cond_1
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/FeatureTeam;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 8
    :goto_1
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/FeatureTeam;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_2

    .line 9
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    .line 10
    :cond_2
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/FeatureTeam;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 11
    :goto_2
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/FeatureTeam;->getBannerUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_3

    .line 12
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_3

    .line 13
    :cond_3
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/FeatureTeam;->getBannerUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 14
    :goto_3
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/FeatureTeam;->getAthletePrivacyId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x5

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 15
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/FeatureTeam;->getMemberCount()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x6

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 16
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/FeatureTeam;->getInviteCode()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_4

    .line 17
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_4

    .line 18
    :cond_4
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/FeatureTeam;->getInviteCode()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 19
    :goto_4
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;

    invoke-static {v0}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->i(Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;)Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/FeatureTeam;->getTeamType()Lcom/whoop/domain/model/teams/TeamType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;->fromTeamType(Lcom/whoop/domain/model/teams/TeamType;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_5

    .line 20
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_5

    .line 21
    :cond_5
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 22
    :goto_5
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/FeatureTeam;->getCommunityId()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x9

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 23
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/FeatureTeam;->getShowBadge()Z

    move-result v0

    const/16 v1, 0xa

    int-to-long v2, v0

    .line 24
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    const/16 v0, 0xb

    .line 25
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/FeatureTeam;->getId()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/whoop/domain/model/teams/FeatureTeam;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl$1;->bind(Ltb/c;Lcom/whoop/domain/model/teams/FeatureTeam;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `table_feature_teams` (`name`,`description`,`iconUrl`,`bannerUrl`,`athletePrivacyId`,`memberCount`,`inviteCode`,`teamType`,`communityId`,`showBadge`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,nullif(?, 0))"

    return-object v0
.end method
