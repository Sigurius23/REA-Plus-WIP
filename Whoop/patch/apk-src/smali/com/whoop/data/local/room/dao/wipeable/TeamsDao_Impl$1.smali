.class Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl$1;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;-><init>(Landroidx/room/z0;)V
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
.field final synthetic this$0:Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Ltb/c;Lcom/whoop/data/local/room/entity/TeamsDto;)V
    .locals 5

    .line 2
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getUserId()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 3
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getUserId()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 5
    :goto_0
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x2

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 6
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    .line 7
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    .line 8
    :cond_1
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 9
    :goto_1
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getDescription()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_2

    .line 10
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    .line 11
    :cond_2
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 12
    :goto_2
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_3

    .line 13
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_3

    .line 14
    :cond_3
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 15
    :goto_3
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getBannerUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_4

    .line 16
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_4

    .line 17
    :cond_4
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getBannerUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 18
    :goto_4
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getAthletePrivacyId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x7

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 19
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;

    invoke-static {v0}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->k(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;)Lcom/whoop/data/local/room/entity/converter/EnableTabConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getEnabledTabs()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/room/entity/converter/EnableTabConverter;->languagesToStoredString(Ljava/util/List;)Ljava/lang/String;

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
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getAdminId()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x9

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 23
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;

    invoke-static {v0}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->m(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;)Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getTeamType()Lcom/whoop/domain/model/teams/TeamType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;->fromTeamType(Lcom/whoop/domain/model/teams/TeamType;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_6

    .line 24
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_6

    .line 25
    :cond_6
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 26
    :goto_6
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getMemberCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xb

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 27
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getRank()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xc

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 28
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getChatEnabled()Z

    move-result v0

    const/16 v1, 0xd

    int-to-long v2, v0

    .line 29
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 30
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getUnreadCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xe

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 31
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getPrivacyProfile()Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->getId()Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xf

    if-nez v1, :cond_7

    .line 33
    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_7

    .line 34
    :cond_7
    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->getId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v3, v1

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    .line 35
    :goto_7
    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->getName()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    if-nez v1, :cond_8

    .line 36
    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_8

    .line 37
    :cond_8
    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v2, v1}, Ltb/c;->L(ILjava/lang/String;)V

    .line 38
    :goto_8
    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->getBasic()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_9

    const/4 v1, 0x0

    goto :goto_9

    :cond_9
    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->getBasic()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_9
    const/16 v2, 0x11

    if-nez v1, :cond_a

    .line 39
    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_a

    .line 40
    :cond_a
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v3, v1

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    .line 41
    :goto_a
    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;

    invoke-static {v1}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->l(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;)Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->getStats()Lcom/whoop/domain/model/teams/PrivacyType;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;->fromPrivacyType(Lcom/whoop/domain/model/teams/PrivacyType;)I

    move-result v1

    const/16 v2, 0x12

    int-to-long v3, v1

    .line 42
    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    .line 43
    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;

    invoke-static {v1}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->l(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;)Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->getComps()Lcom/whoop/domain/model/teams/PrivacyType;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;->fromPrivacyType(Lcom/whoop/domain/model/teams/PrivacyType;)I

    move-result v1

    const/16 v2, 0x13

    int-to-long v3, v1

    .line 44
    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    .line 45
    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;

    invoke-static {v1}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->l(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;)Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->getOverview()Lcom/whoop/domain/model/teams/PrivacyType;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;->fromPrivacyType(Lcom/whoop/domain/model/teams/PrivacyType;)I

    move-result v1

    const/16 v2, 0x14

    int-to-long v3, v1

    .line 46
    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    .line 47
    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;

    invoke-static {v1}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->l(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;)Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->getIntensity()Lcom/whoop/domain/model/teams/PrivacyType;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;->fromPrivacyType(Lcom/whoop/domain/model/teams/PrivacyType;)I

    move-result v1

    const/16 v2, 0x15

    int-to-long v3, v1

    .line 48
    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    .line 49
    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;

    invoke-static {v1}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->l(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;)Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->getRecovery()Lcom/whoop/domain/model/teams/PrivacyType;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;->fromPrivacyType(Lcom/whoop/domain/model/teams/PrivacyType;)I

    move-result v1

    const/16 v2, 0x16

    int-to-long v3, v1

    .line 50
    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    .line 51
    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;

    invoke-static {v1}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->l(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;)Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->getSleep()Lcom/whoop/domain/model/teams/PrivacyType;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;->fromPrivacyType(Lcom/whoop/domain/model/teams/PrivacyType;)I

    move-result v0

    const/16 v1, 0x17

    int-to-long v2, v0

    .line 52
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 53
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/TeamsDto;->getChatChannel()Lcom/whoop/domain/model/teams/ChatChannel;

    move-result-object p2

    const/16 v0, 0x1b

    const/16 v1, 0x1a

    const/16 v2, 0x19

    const/16 v3, 0x18

    if-eqz p2, :cond_f

    .line 54
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/ChatChannel;->getCid()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_b

    .line 55
    invoke-interface {p1, v3}, Ltb/c;->u(I)V

    goto :goto_b

    .line 56
    :cond_b
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/ChatChannel;->getCid()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v3, v4}, Ltb/c;->L(ILjava/lang/String;)V

    .line 57
    :goto_b
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/ChatChannel;->getId()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_c

    .line 58
    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_c

    .line 59
    :cond_c
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/ChatChannel;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v2, v3}, Ltb/c;->L(ILjava/lang/String;)V

    .line 60
    :goto_c
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/ChatChannel;->getType()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_d

    .line 61
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_d

    .line 62
    :cond_d
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/ChatChannel;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v1, v2}, Ltb/c;->L(ILjava/lang/String;)V

    .line 63
    :goto_d
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/ChatChannel;->getName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_e

    .line 64
    invoke-interface {p1, v0}, Ltb/c;->u(I)V

    return-void

    .line 65
    :cond_e
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/ChatChannel;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void

    .line 66
    :cond_f
    invoke-interface {p1, v3}, Ltb/c;->u(I)V

    .line 67
    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    .line 68
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    .line 69
    invoke-interface {p1, v0}, Ltb/c;->u(I)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/whoop/data/local/room/entity/TeamsDto;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl$1;->bind(Ltb/c;Lcom/whoop/data/local/room/entity/TeamsDto;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `table_teams` (`user_id`,`id`,`name`,`description`,`icon_url`,`banner_url`,`athlete_privacy_id`,`scores`,`admin_id`,`team_type`,`member_count`,`rank`,`chat_enable`,`unread_count`,`team_privacy_profile_id`,`team_privacy_profile_name`,`basic`,`stats`,`comps`,`overview`,`intensity`,`recovery`,`sleep`,`cid`,`channel_id`,`channel_type`,`channel_name`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
