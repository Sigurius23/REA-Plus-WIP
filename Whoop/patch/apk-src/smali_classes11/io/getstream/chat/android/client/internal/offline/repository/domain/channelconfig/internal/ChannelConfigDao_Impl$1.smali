.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl$1;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;-><init>(Landroidx/room/z0;)V
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
        "io/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl$1",
        "Landroidx/room/k;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;",
        "",
        "createQuery",
        "()Ljava/lang/String;",
        "Ltb/c;",
        "statement",
        "entity",
        "Ll83/a0;",
        "bind",
        "(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;)V",
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
.field final synthetic this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bind(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;)V
    .locals 4

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getChannelType()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    .line 3
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    .line 5
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 7
    :goto_0
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getUpdatedAt()Ljava/util/Date;

    move-result-object v0

    .line 8
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    .line 9
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    .line 10
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    :goto_1
    const/4 v0, 0x4

    .line 11
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    .line 12
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->isTypingEvents()Z

    move-result v0

    const/4 v1, 0x5

    int-to-long v2, v0

    .line 13
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 14
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->isReadEvents()Z

    move-result v0

    const/4 v1, 0x6

    int-to-long v2, v0

    .line 15
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 16
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getDeliveryEventsEnabled()Z

    move-result v0

    const/4 v1, 0x7

    int-to-long v2, v0

    .line 17
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 18
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->isConnectEvents()Z

    move-result v0

    const/16 v1, 0x8

    int-to-long v2, v0

    .line 19
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 20
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->isSearch()Z

    move-result v0

    const/16 v1, 0x9

    int-to-long v2, v0

    .line 21
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 22
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->isReactionsEnabled()Z

    move-result v0

    const/16 v1, 0xa

    int-to-long v2, v0

    .line 23
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 24
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->isThreadEnabled()Z

    move-result v0

    const/16 v1, 0xb

    int-to-long v2, v0

    .line 25
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 26
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->isMutes()Z

    move-result v0

    const/16 v1, 0xc

    int-to-long v2, v0

    .line 27
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 28
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getUploadsEnabled()Z

    move-result v0

    const/16 v1, 0xd

    int-to-long v2, v0

    .line 29
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 30
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getUrlEnrichmentEnabled()Z

    move-result v0

    const/16 v1, 0xe

    int-to-long v2, v0

    .line 31
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 32
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getCustomEventsEnabled()Z

    move-result v0

    const/16 v1, 0xf

    int-to-long v2, v0

    .line 33
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 34
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getPushNotificationsEnabled()Z

    move-result v0

    const/16 v1, 0x10

    int-to-long v2, v0

    .line 35
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    const/16 v0, 0x11

    .line 36
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getMessageRetention()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    .line 37
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getMaxMessageLength()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x12

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    const/16 v0, 0x13

    .line 38
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getAutomod()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    const/16 v0, 0x14

    .line 39
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getAutomodBehavior()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    const/16 v0, 0x15

    .line 40
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getBlocklistBehavior()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    .line 41
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getMessageRemindersEnabled()Z

    move-result v0

    const/16 v1, 0x16

    int-to-long v2, v0

    .line 42
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 43
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->getMarkMessagesPending()Z

    move-result p2

    const/16 v0, 0x17

    int-to-long v1, p2

    .line 44
    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public final bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl$1;->bind(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;)V

    return-void
.end method

.method public final createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `stream_chat_channel_config` (`channelType`,`createdAt`,`updatedAt`,`name`,`isTypingEvents`,`isReadEvents`,`deliveryEventsEnabled`,`isConnectEvents`,`isSearch`,`isReactionsEnabled`,`isThreadEnabled`,`isMutes`,`uploadsEnabled`,`urlEnrichmentEnabled`,`customEventsEnabled`,`pushNotificationsEnabled`,`messageRetention`,`maxMessageLength`,`automod`,`automodBehavior`,`blocklistBehavior`,`messageRemindersEnabled`,`markMessagesPending`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
