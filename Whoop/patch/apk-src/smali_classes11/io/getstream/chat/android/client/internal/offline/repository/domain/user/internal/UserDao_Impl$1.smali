.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$1;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/k;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "io/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$1",
        "Landroidx/room/k;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;",
        "",
        "createQuery",
        "()Ljava/lang/String;",
        "Ltb/c;",
        "statement",
        "entity",
        "Ll83/a0;",
        "bind",
        "(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;)V",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bind(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;)V
    .locals 4

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x2

    .line 3
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getOriginalId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x3

    .line 4
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x4

    .line 5
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getImage()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x5

    .line 6
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getRole()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    .line 7
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object v0

    .line 8
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_0

    .line 9
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 11
    :goto_0
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getUpdatedAt()Ljava/util/Date;

    move-result-object v0

    .line 12
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_1

    .line 13
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    .line 14
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 15
    :goto_1
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getLastActive()Ljava/util/Date;

    move-result-object v0

    .line 16
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_2

    .line 17
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    .line 18
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 19
    :goto_2
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getInvisible()Z

    move-result v0

    const/16 v1, 0x9

    int-to-long v2, v0

    .line 20
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 21
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getPrivacySettings()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    move-result-object v0

    .line 22
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->access$get__privacySettingsConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PrivacySettingsConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PrivacySettingsConverter;->privacySettingsToString(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_3

    .line 23
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_3

    .line 24
    :cond_3
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 25
    :goto_3
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getBanned()Z

    move-result v0

    const/16 v1, 0xb

    int-to-long v2, v0

    .line 26
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 27
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->access$get__listConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getMutes()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->fromUserMuteList(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xc

    if-nez v0, :cond_4

    .line 28
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_4

    .line 29
    :cond_4
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 30
    :goto_4
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->access$get__listConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getTeams()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->fromStringList(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xd

    if-nez v0, :cond_5

    .line 31
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_5

    .line 32
    :cond_5
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 33
    :goto_5
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->access$get__mapConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getTeamsRole()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringMapToString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xe

    if-nez v0, :cond_6

    .line 34
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_6

    .line 35
    :cond_6
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 36
    :goto_6
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->access$get__extraDataConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getExtraData()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->mapToString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xf

    if-nez v0, :cond_7

    .line 37
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_7

    .line 38
    :cond_7
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 39
    :goto_7
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getAvgResponseTime()Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0x10

    if-nez v0, :cond_8

    .line 40
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_8

    .line 41
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 42
    :goto_8
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getPushPreference()Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;

    move-result-object p2

    .line 43
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->access$get__pushPreferenceConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;

    move-result-object v0

    invoke-virtual {v0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;->pushPreferenceToString(Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;)Ljava/lang/String;

    move-result-object p2

    const/16 v0, 0x11

    if-nez p2, :cond_9

    .line 44
    invoke-interface {p1, v0}, Ltb/c;->u(I)V

    return-void

    .line 45
    :cond_9
    invoke-interface {p1, v0, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public final bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$1;->bind(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;)V

    return-void
.end method

.method public final createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `stream_chat_user` (`id`,`originalId`,`name`,`image`,`role`,`createdAt`,`updatedAt`,`lastActive`,`invisible`,`privacySettings`,`banned`,`mutes`,`teams`,`teamsRole`,`extraData`,`avgResponseTime`,`pushPreference`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
