.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$1;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;-><init>(Landroidx/room/z0;)V
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
        "io/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$1",
        "Landroidx/room/k;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;",
        "",
        "createQuery",
        "()Ljava/lang/String;",
        "Ltb/c;",
        "statement",
        "entity",
        "Ll83/a0;",
        "bind",
        "(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;)V",
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
.field final synthetic this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bind(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;)V
    .locals 4

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x2

    .line 3
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getChannelId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x3

    .line 4
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x4

    .line 5
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getImage()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    .line 6
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getCooldown()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x5

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    const/4 v0, 0x6

    .line 7
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getCreatedByUserId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    .line 8
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->access$get__listConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getFilterTags()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->fromStringList(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_0

    .line 9
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    .line 10
    :cond_0
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 11
    :goto_0
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getFrozen()Z

    move-result v0

    const/16 v1, 0x8

    int-to-long v2, v0

    .line 12
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 13
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getHidden()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    const/16 v1, 0x9

    if-nez v0, :cond_2

    .line 15
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    .line 16
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 17
    :goto_2
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getHideMessagesBefore()Ljava/util/Date;

    move-result-object v0

    .line 18
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_3

    .line 19
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_3

    .line 20
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 21
    :goto_3
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->access$get__mapConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->memberMapToString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xb

    if-nez v0, :cond_4

    .line 22
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_4

    .line 23
    :cond_4
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 24
    :goto_4
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getMemberCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xc

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 25
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->access$get__listConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getWatcherIds()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->fromStringList(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xd

    if-nez v0, :cond_5

    .line 26
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_5

    .line 27
    :cond_5
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 28
    :goto_5
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getWatcherCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xe

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 29
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->access$get__mapConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getReads()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->readMapToString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xf

    if-nez v0, :cond_6

    .line 30
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_6

    .line 31
    :cond_6
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 32
    :goto_6
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getLastMessageAt()Ljava/util/Date;

    move-result-object v0

    .line 33
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0x10

    if-nez v0, :cond_7

    .line 34
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_7

    .line 35
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 36
    :goto_7
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getLastMessageId()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x11

    if-nez v0, :cond_8

    .line 37
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_8

    .line 38
    :cond_8
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 39
    :goto_8
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object v0

    .line 40
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0x12

    if-nez v0, :cond_9

    .line 41
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_9

    .line 42
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 43
    :goto_9
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getUpdatedAt()Ljava/util/Date;

    move-result-object v0

    .line 44
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0x13

    if-nez v0, :cond_a

    .line 45
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_a

    .line 46
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 47
    :goto_a
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getDeletedAt()Ljava/util/Date;

    move-result-object v0

    .line 48
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0x14

    if-nez v0, :cond_b

    .line 49
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_b

    .line 50
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 51
    :goto_b
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->access$get__extraDataConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getExtraData()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->mapToString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x15

    if-nez v0, :cond_c

    .line 52
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_c

    .line 53
    :cond_c
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 54
    :goto_c
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->access$get__syncStatusConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->syncStatusToString(Lio/getstream/chat/android/models/SyncStatus;)I

    move-result v0

    const/16 v1, 0x16

    int-to-long v2, v0

    .line 55
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    const/16 v0, 0x17

    .line 56
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getTeam()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    .line 57
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->access$get__setConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SetConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getOwnCapabilities()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SetConverter;->sortedSetToString(Ljava/util/Set;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x18

    if-nez v0, :cond_d

    .line 58
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_d

    .line 59
    :cond_d
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 60
    :goto_d
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getMembership()Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    move-result-object v0

    .line 61
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->access$get__memberConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MemberConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MemberConverter;->memberToString(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x19

    if-nez v0, :cond_e

    .line 62
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_e

    .line 63
    :cond_e
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 64
    :goto_e
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->access$get__locationConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getActiveLiveLocations()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;->locationListToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1a

    if-nez v0, :cond_f

    .line 65
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_f

    .line 66
    :cond_f
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 67
    :goto_f
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getMessageCount()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x1b

    if-nez v0, :cond_10

    .line 68
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_10

    .line 69
    :cond_10
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    :goto_10
    const/16 v0, 0x1c

    .line 70
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getCid()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public final bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$1;->bind(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;)V

    return-void
.end method

.method public final createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `stream_chat_channel_state` (`type`,`channelId`,`name`,`image`,`cooldown`,`createdByUserId`,`filterTags`,`frozen`,`hidden`,`hideMessagesBefore`,`members`,`memberCount`,`watcherIds`,`watcherCount`,`reads`,`lastMessageAt`,`lastMessageId`,`createdAt`,`updatedAt`,`deletedAt`,`extraData`,`syncStatus`,`team`,`ownCapabilities`,`membership`,`activeLiveLocations`,`messageCount`,`cid`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
