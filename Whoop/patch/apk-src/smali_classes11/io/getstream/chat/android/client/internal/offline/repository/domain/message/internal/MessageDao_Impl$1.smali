.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;-><init>(Landroidx/room/z0;)V
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
        "io/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1",
        "Landroidx/room/k;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;",
        "",
        "createQuery",
        "()Ljava/lang/String;",
        "Ltb/c;",
        "statement",
        "entity",
        "Ll83/a0;",
        "bind",
        "(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;)V",
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
.field final synthetic this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bind(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;)V
    .locals 6

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x2

    .line 3
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x3

    .line 4
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x4

    .line 5
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x5

    .line 6
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getHtml()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x6

    .line 7
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    .line 8
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__syncStatusConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->syncStatusToString(Lio/getstream/chat/android/models/SyncStatus;)I

    move-result v0

    const/4 v1, 0x7

    int-to-long v2, v0

    .line 9
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 10
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getReplyCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x8

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 11
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getDeletedReplyCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x9

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 12
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object v0

    .line 13
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_0

    .line 14
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 16
    :goto_0
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v0

    .line 17
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0xb

    if-nez v0, :cond_1

    .line 18
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 20
    :goto_1
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getUpdatedAt()Ljava/util/Date;

    move-result-object v0

    .line 21
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0xc

    if-nez v0, :cond_2

    .line 22
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    .line 23
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 24
    :goto_2
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getUpdatedLocallyAt()Ljava/util/Date;

    move-result-object v0

    .line 25
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0xd

    if-nez v0, :cond_3

    .line 26
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_3

    .line 27
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 28
    :goto_3
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getDeletedAt()Ljava/util/Date;

    move-result-object v0

    .line 29
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0xe

    if-nez v0, :cond_4

    .line 30
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_4

    .line 31
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 32
    :goto_4
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__listConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getRemoteMentionedUserIds()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->fromStringList(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xf

    if-nez v0, :cond_5

    .line 33
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_5

    .line 34
    :cond_5
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 35
    :goto_5
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__listConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getMentionedUsersId()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->fromStringList(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    if-nez v0, :cond_6

    .line 36
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_6

    .line 37
    :cond_6
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 38
    :goto_6
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__mapConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getReactionCounts()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->mapToString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x11

    if-nez v0, :cond_7

    .line 39
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_7

    .line 40
    :cond_7
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 41
    :goto_7
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__mapConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getReactionScores()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->mapToString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x12

    if-nez v0, :cond_8

    .line 42
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_8

    .line 43
    :cond_8
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 44
    :goto_8
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__extraDataConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getReactionGroups()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->mapToString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x13

    if-nez v0, :cond_9

    .line 45
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_9

    .line 46
    :cond_9
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 47
    :goto_9
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getParentId()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x14

    if-nez v0, :cond_a

    .line 48
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_a

    .line 49
    :cond_a
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 50
    :goto_a
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getCommand()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x15

    if-nez v0, :cond_b

    .line 51
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_b

    .line 52
    :cond_b
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 53
    :goto_b
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getShadowed()Z

    move-result v0

    const/16 v1, 0x16

    int-to-long v2, v0

    .line 54
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 55
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__mapConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getI18n()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringMapToString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x17

    if-nez v0, :cond_c

    .line 56
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_c

    .line 57
    :cond_c
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 58
    :goto_c
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getShowInChannel()Z

    move-result v0

    const/16 v1, 0x18

    int-to-long v2, v0

    .line 59
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 60
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getSilent()Z

    move-result v0

    const/16 v1, 0x19

    int-to-long v2, v0

    .line 61
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 62
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__extraDataConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getExtraData()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->mapToString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1a

    if-nez v0, :cond_d

    .line 63
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_d

    .line 64
    :cond_d
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 65
    :goto_d
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getReplyToId()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1b

    if-nez v0, :cond_e

    .line 66
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_e

    .line 67
    :cond_e
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 68
    :goto_e
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getPinned()Z

    move-result v0

    const/16 v1, 0x1c

    int-to-long v2, v0

    .line 69
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 70
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getPinnedAt()Ljava/util/Date;

    move-result-object v0

    .line 71
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0x1d

    if-nez v0, :cond_f

    .line 72
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_f

    .line 73
    :cond_f
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 74
    :goto_f
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getPinExpires()Ljava/util/Date;

    move-result-object v0

    .line 75
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0x1e

    if-nez v0, :cond_10

    .line 76
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_10

    .line 77
    :cond_10
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 78
    :goto_10
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getPinnedByUserId()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1f

    if-nez v0, :cond_11

    .line 79
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_11

    .line 80
    :cond_11
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 81
    :goto_11
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__listConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getThreadParticipantsIds()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->fromStringList(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x20

    if-nez v0, :cond_12

    .line 82
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_12

    .line 83
    :cond_12
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 84
    :goto_12
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getSkipPushNotification()Z

    move-result v0

    const/16 v1, 0x21

    int-to-long v2, v0

    .line 85
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 86
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getSkipEnrichUrl()Z

    move-result v0

    const/16 v1, 0x22

    int-to-long v2, v0

    .line 87
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 88
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getModerationDetails()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-result-object v0

    .line 89
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__moderationDetailsConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;->moderationDetailsToString(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x23

    if-nez v0, :cond_13

    .line 90
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_13

    .line 91
    :cond_13
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 92
    :goto_13
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getModeration()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    move-result-object v0

    .line 93
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__moderationConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;->moderationToString(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x24

    if-nez v0, :cond_14

    .line 94
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_14

    .line 95
    :cond_14
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 96
    :goto_14
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getMessageTextUpdatedAt()Ljava/util/Date;

    move-result-object v0

    .line 97
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0x25

    if-nez v0, :cond_15

    .line 98
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_15

    .line 99
    :cond_15
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 100
    :goto_15
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getPollId()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x26

    if-nez v0, :cond_16

    .line 101
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_16

    .line 102
    :cond_16
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 103
    :goto_16
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__listConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getRestrictedVisibility()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->fromStringList(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x27

    if-nez v0, :cond_17

    .line 104
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_17

    .line 105
    :cond_17
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 106
    :goto_17
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getReminder()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-result-object v0

    .line 107
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__reminderInfoConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;->reminderInfoToString(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x28

    if-nez v0, :cond_18

    .line 108
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_18

    .line 109
    :cond_18
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 110
    :goto_18
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getSharedLocation()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    move-result-object v0

    .line 111
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__locationConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;->locationToString(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x29

    if-nez v0, :cond_19

    .line 112
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_19

    .line 113
    :cond_19
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 114
    :goto_19
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getChannelRole()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2a

    if-nez v0, :cond_1a

    .line 115
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1a

    .line 116
    :cond_1a
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 117
    :goto_1a
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getDeletedForMe()Z

    move-result v0

    const/16 v1, 0x2b

    int-to-long v2, v0

    .line 118
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 119
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getChannelInfo()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    move-result-object p2

    const/16 v0, 0x30

    const/16 v1, 0x2f

    const/16 v2, 0x2e

    const/16 v3, 0x2d

    const/16 v4, 0x2c

    if-eqz p2, :cond_20

    .line 120
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;->getCid()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1b

    .line 121
    invoke-interface {p1, v4}, Ltb/c;->u(I)V

    goto :goto_1b

    .line 122
    :cond_1b
    invoke-interface {p1, v4, v5}, Ltb/c;->L(ILjava/lang/String;)V

    .line 123
    :goto_1b
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;->getId()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1c

    .line 124
    invoke-interface {p1, v3}, Ltb/c;->u(I)V

    goto :goto_1c

    .line 125
    :cond_1c
    invoke-interface {p1, v3, v4}, Ltb/c;->L(ILjava/lang/String;)V

    .line 126
    :goto_1c
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;->getType()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1d

    .line 127
    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_1d

    .line 128
    :cond_1d
    invoke-interface {p1, v2, v3}, Ltb/c;->L(ILjava/lang/String;)V

    .line 129
    :goto_1d
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;->getMemberCount()Ljava/lang/Integer;

    move-result-object v2

    if-nez v2, :cond_1e

    .line 130
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1e

    .line 131
    :cond_1e
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 132
    :goto_1e
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;->getName()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1f

    .line 133
    invoke-interface {p1, v0}, Ltb/c;->u(I)V

    return-void

    .line 134
    :cond_1f
    invoke-interface {p1, v0, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void

    .line 135
    :cond_20
    invoke-interface {p1, v4}, Ltb/c;->u(I)V

    .line 136
    invoke-interface {p1, v3}, Ltb/c;->u(I)V

    .line 137
    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    .line 138
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    .line 139
    invoke-interface {p1, v0}, Ltb/c;->u(I)V

    return-void
.end method

.method public final bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;->bind(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;)V

    return-void
.end method

.method public final createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `stream_chat_message` (`id`,`cid`,`userId`,`text`,`html`,`type`,`syncStatus`,`replyCount`,`deletedReplyCount`,`createdAt`,`createdLocallyAt`,`updatedAt`,`updatedLocallyAt`,`deletedAt`,`remoteMentionedUserIds`,`mentionedUsersId`,`reactionCounts`,`reactionScores`,`reactionGroups`,`parentId`,`command`,`shadowed`,`i18n`,`showInChannel`,`silent`,`extraData`,`replyToId`,`pinned`,`pinnedAt`,`pinExpires`,`pinnedByUserId`,`threadParticipantsIds`,`skipPushNotification`,`skipEnrichUrl`,`moderationDetails`,`moderation`,`messageTextUpdatedAt`,`pollId`,`restrictedVisibility`,`reminder`,`sharedLocation`,`channelRole`,`deletedForMe`,`channel_infocid`,`channel_infoid`,`channel_infotype`,`channel_infomemberCount`,`channel_infoname`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
