.class Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl$1;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;-><init>(Landroidx/room/z0;)V
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
.field final synthetic this$0:Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Ltb/c;Lcom/whoop/domain/model/teams/MemberStory;)V
    .locals 10

    .line 2
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getMemberStoryId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 3
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getCreatedAt()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    .line 4
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getCreatedAt()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 6
    :goto_0
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getUpdatedAt()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    .line 7
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    .line 8
    :cond_1
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getUpdatedAt()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 9
    :goto_1
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getTitle()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_2

    .line 10
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    .line 11
    :cond_2
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 12
    :goto_2
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getPublishDate()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_3

    .line 13
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_3

    .line 14
    :cond_3
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getPublishDate()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 15
    :goto_3
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_4

    .line 16
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_4

    .line 17
    :cond_4
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 18
    :goto_4
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getImage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_5

    .line 19
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_5

    .line 20
    :cond_5
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getImage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 21
    :goto_5
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getContentType()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_6

    .line 22
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_6

    .line 23
    :cond_6
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getContentType()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 24
    :goto_6
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getShowBadge()Z

    move-result v0

    const/16 v1, 0x9

    int-to-long v2, v0

    .line 25
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 26
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getDescription()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_7

    .line 27
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_7

    .line 28
    :cond_7
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 29
    :goto_7
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getDeleted()Z

    move-result v0

    const/16 v1, 0xb

    int-to-long v2, v0

    .line 30
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 31
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getFeatured()Z

    move-result v0

    const/16 v1, 0xc

    int-to-long v2, v0

    .line 32
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 33
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getLive()Z

    move-result v0

    const/16 v1, 0xd

    int-to-long v2, v0

    .line 34
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 35
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getArchived()Z

    move-result v0

    const/16 v1, 0xe

    int-to-long v2, v0

    .line 36
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 37
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getLiveTime()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xf

    if-nez v0, :cond_8

    .line 38
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_8

    .line 39
    :cond_8
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getLiveTime()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 40
    :goto_8
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getHostId()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x10

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 41
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getUrlText()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x11

    if-nez v0, :cond_9

    .line 42
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_9

    .line 43
    :cond_9
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getUrlText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 44
    :goto_9
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getCtaText()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x12

    if-nez v0, :cond_a

    .line 45
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_a

    .line 46
    :cond_a
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getCtaText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_a
    const/16 v0, 0x13

    .line 47
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getId()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    .line 48
    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/MemberStory;->getHost()Lcom/whoop/data/local/room/entity/AmaHost;

    move-result-object p2

    const/16 v0, 0x1b

    const/16 v1, 0x1a

    const/16 v2, 0x19

    const/16 v3, 0x18

    const/16 v4, 0x17

    const/16 v5, 0x16

    const/16 v6, 0x15

    const/16 v7, 0x14

    if-eqz p2, :cond_13

    .line 49
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/AmaHost;->getUserId()Ljava/lang/Integer;

    move-result-object v8

    if-nez v8, :cond_b

    .line 50
    invoke-interface {p1, v7}, Ltb/c;->u(I)V

    goto :goto_b

    .line 51
    :cond_b
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/AmaHost;->getUserId()Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    int-to-long v8, v8

    invoke-interface {p1, v7, v8, v9}, Ltb/c;->p(IJ)V

    .line 52
    :goto_b
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/AmaHost;->getFirstName()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_c

    .line 53
    invoke-interface {p1, v6}, Ltb/c;->u(I)V

    goto :goto_c

    .line 54
    :cond_c
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/AmaHost;->getFirstName()Ljava/lang/String;

    move-result-object v7

    invoke-interface {p1, v6, v7}, Ltb/c;->L(ILjava/lang/String;)V

    .line 55
    :goto_c
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/AmaHost;->getLastName()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_d

    .line 56
    invoke-interface {p1, v5}, Ltb/c;->u(I)V

    goto :goto_d

    .line 57
    :cond_d
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/AmaHost;->getLastName()Ljava/lang/String;

    move-result-object v6

    invoke-interface {p1, v5, v6}, Ltb/c;->L(ILjava/lang/String;)V

    .line 58
    :goto_d
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/AmaHost;->getName()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_e

    .line 59
    invoke-interface {p1, v4}, Ltb/c;->u(I)V

    goto :goto_e

    .line 60
    :cond_e
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/AmaHost;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v4, v5}, Ltb/c;->L(ILjava/lang/String;)V

    .line 61
    :goto_e
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/AmaHost;->getUsername()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_f

    .line 62
    invoke-interface {p1, v3}, Ltb/c;->u(I)V

    goto :goto_f

    .line 63
    :cond_f
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/AmaHost;->getUsername()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v3, v4}, Ltb/c;->L(ILjava/lang/String;)V

    .line 64
    :goto_f
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/AmaHost;->getAvatarUrl()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_10

    .line 65
    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_10

    .line 66
    :cond_10
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/AmaHost;->getAvatarUrl()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v2, v3}, Ltb/c;->L(ILjava/lang/String;)V

    .line 67
    :goto_10
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/AmaHost;->getHostCreatedAt()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_11

    .line 68
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_11

    .line 69
    :cond_11
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/AmaHost;->getHostCreatedAt()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v1, v2}, Ltb/c;->L(ILjava/lang/String;)V

    .line 70
    :goto_11
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/AmaHost;->getHostUpdatedAt()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_12

    .line 71
    invoke-interface {p1, v0}, Ltb/c;->u(I)V

    return-void

    .line 72
    :cond_12
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/AmaHost;->getHostUpdatedAt()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void

    .line 73
    :cond_13
    invoke-interface {p1, v7}, Ltb/c;->u(I)V

    .line 74
    invoke-interface {p1, v6}, Ltb/c;->u(I)V

    .line 75
    invoke-interface {p1, v5}, Ltb/c;->u(I)V

    .line 76
    invoke-interface {p1, v4}, Ltb/c;->u(I)V

    .line 77
    invoke-interface {p1, v3}, Ltb/c;->u(I)V

    .line 78
    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    .line 79
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    .line 80
    invoke-interface {p1, v0}, Ltb/c;->u(I)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/whoop/domain/model/teams/MemberStory;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl$1;->bind(Ltb/c;Lcom/whoop/domain/model/teams/MemberStory;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `table_member_stories` (`memberStoryId`,`created_at`,`updated_at`,`title`,`publish_date`,`url`,`image`,`content_type`,`showBadge`,`description`,`deleted`,`featured`,`live`,`archived`,`live_time`,`host_id`,`url_text`,`cta_text`,`id`,`user_id`,`first_name`,`last_name`,`name`,`username`,`avatar_url`,`host_created_at`,`host_updated_at`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,nullif(?, 0),?,?,?,?,?,?,?,?)"

    return-object v0
.end method
