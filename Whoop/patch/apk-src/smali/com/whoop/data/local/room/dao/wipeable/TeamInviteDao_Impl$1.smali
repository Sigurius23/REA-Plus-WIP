.class Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl$1;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;-><init>(Landroidx/room/z0;)V
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
.field final synthetic this$0:Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Ltb/c;Lcom/whoop/domain/model/teams/TeamInviteDto;)V
    .locals 4

    .line 2
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/TeamInviteDto;->getId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 3
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/TeamInviteDto;->getStatus()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    .line 4
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/TeamInviteDto;->getStatus()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 6
    :goto_0
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/TeamInviteDto;->getDeleted()Z

    move-result v0

    const/4 v1, 0x3

    int-to-long v2, v0

    .line 7
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 8
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/TeamInviteDto;->getCommunityId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x4

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 9
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/TeamInviteDto;->getSenderId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x5

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 10
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/TeamInviteDto;->getRecipientId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x6

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 11
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;

    invoke-static {v0}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->h(Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;)Lcom/whoop/data/local/room/entity/converter/CommunityDtoConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/TeamInviteDto;->getCommunity()Lcom/whoop/domain/model/teams/CommunityDto;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/room/entity/converter/CommunityDtoConverter;->communityDtoToString(Lcom/whoop/domain/model/teams/CommunityDto;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_1

    .line 12
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    .line 13
    :cond_1
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 14
    :goto_1
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;

    invoke-static {v0}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->i(Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;)Lcom/whoop/data/local/room/entity/converter/CommunityMemberDtoConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/TeamInviteDto;->getSender()Lcom/whoop/domain/model/teams/CommunityMemberDto;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/room/entity/converter/CommunityMemberDtoConverter;->communityMemberDtoToString(Lcom/whoop/domain/model/teams/CommunityMemberDto;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_2

    .line 15
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    .line 16
    :cond_2
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 17
    :goto_2
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/TeamInviteDto;->getInviteCode()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x9

    if-nez v0, :cond_3

    .line 18
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_3

    .line 19
    :cond_3
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/TeamInviteDto;->getInviteCode()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 20
    :goto_3
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/TeamInviteDto;->getShowBadge()Z

    move-result p2

    const/16 v0, 0xa

    int-to-long v1, p2

    .line 21
    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/whoop/domain/model/teams/TeamInviteDto;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl$1;->bind(Ltb/c;Lcom/whoop/domain/model/teams/TeamInviteDto;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `table_team_invites` (`id`,`status`,`deleted`,`community_id`,`sender_id`,`recipient_id`,`community`,`sender`,`community_invite_code`,`showBadge`) VALUES (?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
