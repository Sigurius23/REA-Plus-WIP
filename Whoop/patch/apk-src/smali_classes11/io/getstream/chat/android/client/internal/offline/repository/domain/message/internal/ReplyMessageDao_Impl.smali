.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 >2\u00020\u0001:\u0001>B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\u0008H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\u00020\r2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010H\u0096@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\u00020\r2\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0010H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001e\u0010\u001b\u001a\u00020\r2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0010H\u0096@\u00a2\u0006\u0004\u0008\u001b\u0010\u0014J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010!R\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00110\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u001a\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010$R\u001a\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00110;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=\u00a8\u0006?"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;",
        "Landroidx/room/z0;",
        "__db",
        "<init>",
        "(Landroidx/room/z0;)V",
        "Ltb/a;",
        "_connection",
        "La0/g;",
        "",
        "",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;",
        "_map",
        "Ll83/a0;",
        "__fetchRelationshipreplyAttachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalReplyAttachmentEntity",
        "(Ltb/a;La0/g;)V",
        "",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;",
        "replyMessageEntities",
        "insertInnerEntity",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "attachmentEntities",
        "insertAttachments",
        "replyMessageInnerEntity",
        "delete",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;",
        "insert",
        "id",
        "selectById",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "deleteAll",
        "(Lq83/d;)Ljava/lang/Object;",
        "Landroidx/room/z0;",
        "Landroidx/room/k;",
        "__insertAdapterOfReplyMessageInnerEntity",
        "Landroidx/room/k;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;",
        "__syncStatusConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;",
        "__dateConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;",
        "__listConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;",
        "__mapConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;",
        "__extraDataConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;",
        "__moderationDetailsConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;",
        "__reminderInfoConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;",
        "__insertAdapterOfReplyAttachmentEntity",
        "Landroidx/room/i;",
        "__deleteAdapterOfReplyMessageInnerEntity",
        "Landroidx/room/i;",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl$Companion;


# instance fields
.field private final __dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

.field private final __db:Landroidx/room/z0;

.field private final __deleteAdapterOfReplyMessageInnerEntity:Landroidx/room/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/i;"
        }
    .end annotation
.end field

.field private final __extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

.field private final __insertAdapterOfReplyAttachmentEntity:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final __insertAdapterOfReplyMessageInnerEntity:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final __listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

.field private final __mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

.field private final __moderationDetailsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

.field private final __reminderInfoConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

.field private final __syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl$Companion;

    return-void
.end method

.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    const-string v0, "__db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__moderationDetailsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__reminderInfoConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl$1;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__insertAdapterOfReplyMessageInnerEntity:Landroidx/room/k;

    new-instance p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl$2;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl$2;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__insertAdapterOfReplyAttachmentEntity:Landroidx/room/k;

    new-instance p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl$3;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__deleteAdapterOfReplyMessageInnerEntity:Landroidx/room/i;

    return-void
.end method

.method private final __fetchRelationshipreplyAttachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalReplyAttachmentEntity(Ltb/a;La0/g;)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltb/a;",
            "La0/g;",
            ")V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    invoke-virtual {v2}, La0/g;->keySet()Ljava/util/Set;

    move-result-object v3

    check-cast v3, La0/c;

    iget-object v4, v3, La0/c;->w:La0/g;

    invoke-virtual {v4}, La0/f1;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    return-void

    :cond_0
    iget v5, v2, La0/f1;->y:I

    const/16 v6, 0x3e7

    if-le v5, v6, :cond_1

    new-instance v3, Lh02/h;

    const/16 v4, 0x1c

    invoke-direct {v3, v4, v1, v0}, Lh02/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lse/b;->X(La0/g;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    const-string v5, "SELECT `id`,`messageId`,`authorName`,`titleLink`,`authorLink`,`thumbUrl`,`imageUrl`,`assetUrl`,`ogUrl`,`mimeType`,`fileSize`,`title`,`text`,`type`,`image`,`name`,`fallback`,`uploadFilePath`,`originalHeight`,`originalWidth`,`extraData`,`statusCode`,`errorMessage` FROM `reply_attachment_inner_entity` WHERE `messageId` IN ("

    invoke-static {v5}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget v4, v4, La0/f1;->y:I

    invoke-static {v4, v5}, Lpf/c;->j(ILjava/lang/StringBuilder;)V

    const-string v4, ")"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "toString(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v4}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v4

    invoke-virtual {v3}, La0/c;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x1

    move v5, v3

    :goto_0
    move-object v6, v0

    check-cast v6, La0/m;

    invoke-virtual {v6}, La0/m;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v6}, La0/m;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Ltb/c;->L(ILjava/lang/String;)V

    add-int/2addr v5, v3

    goto :goto_0

    :cond_2
    :try_start_0
    const-string v0, "messageId"

    invoke-static {v4, v0}, Ljc/x;->M(Ltb/c;Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v5, -0x1

    if-ne v0, v5, :cond_3

    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    return-void

    :cond_3
    :goto_1
    :try_start_1
    invoke-interface {v4}, Ltb/c;->e1()Z

    move-result v5

    if-eqz v5, :cond_1a

    invoke-interface {v4, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-eqz v5, :cond_3

    const/4 v6, 0x0

    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v4, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    const/4 v6, 0x2

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_4

    const/4 v6, 0x0

    goto :goto_2

    :cond_4
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_2
    const/4 v7, 0x3

    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_5

    const/4 v11, 0x0

    goto :goto_3

    :cond_5
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object v11, v7

    :goto_3
    const/4 v7, 0x4

    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_6

    const/4 v12, 0x0

    goto :goto_4

    :cond_6
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object v12, v7

    :goto_4
    const/4 v7, 0x5

    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_7

    const/4 v13, 0x0

    goto :goto_5

    :cond_7
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object v13, v7

    :goto_5
    const/4 v7, 0x6

    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_8

    const/4 v14, 0x0

    goto :goto_6

    :cond_8
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object v14, v7

    :goto_6
    const/4 v7, 0x7

    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_9

    const/4 v15, 0x0

    goto :goto_7

    :cond_9
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object v15, v7

    :goto_7
    const/16 v7, 0x8

    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v16

    if-eqz v16, :cond_a

    const/16 v16, 0x0

    goto :goto_8

    :cond_a
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v16, v7

    :goto_8
    const/16 v7, 0x9

    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_b

    const/16 v17, 0x0

    goto :goto_9

    :cond_b
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v17, v7

    :goto_9
    const/16 v7, 0xa

    move-object/from16 v18, v11

    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v10

    long-to-int v7, v10

    const/16 v10, 0xb

    invoke-interface {v4, v10}, Ltb/c;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_c

    const/16 v19, 0x0

    goto :goto_a

    :cond_c
    invoke-interface {v4, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v10

    move-object/from16 v19, v10

    :goto_a
    const/16 v10, 0xc

    invoke-interface {v4, v10}, Ltb/c;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_d

    const/16 v20, 0x0

    goto :goto_b

    :cond_d
    invoke-interface {v4, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v10

    move-object/from16 v20, v10

    :goto_b
    const/16 v10, 0xd

    invoke-interface {v4, v10}, Ltb/c;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_e

    const/16 v21, 0x0

    goto :goto_c

    :cond_e
    invoke-interface {v4, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v10

    move-object/from16 v21, v10

    :goto_c
    const/16 v10, 0xe

    invoke-interface {v4, v10}, Ltb/c;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_f

    const/16 v22, 0x0

    goto :goto_d

    :cond_f
    invoke-interface {v4, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v10

    move-object/from16 v22, v10

    :goto_d
    const/16 v10, 0xf

    invoke-interface {v4, v10}, Ltb/c;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_10

    const/16 v23, 0x0

    goto :goto_e

    :cond_10
    invoke-interface {v4, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v10

    move-object/from16 v23, v10

    :goto_e
    const/16 v10, 0x10

    invoke-interface {v4, v10}, Ltb/c;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_11

    const/16 v24, 0x0

    goto :goto_f

    :cond_11
    invoke-interface {v4, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v10

    move-object/from16 v24, v10

    :goto_f
    const/16 v10, 0x11

    invoke-interface {v4, v10}, Ltb/c;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_12

    const/16 v25, 0x0

    goto :goto_10

    :cond_12
    invoke-interface {v4, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v10

    move-object/from16 v25, v10

    :goto_10
    const/16 v10, 0x12

    invoke-interface {v4, v10}, Ltb/c;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_13

    const/16 v26, 0x0

    goto :goto_11

    :cond_13
    invoke-interface {v4, v10}, Ltb/c;->getLong(I)J

    move-result-wide v10

    long-to-int v10, v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    move-object/from16 v26, v10

    :goto_11
    const/16 v10, 0x13

    invoke-interface {v4, v10}, Ltb/c;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_14

    const/16 v27, 0x0

    goto :goto_12

    :cond_14
    invoke-interface {v4, v10}, Ltb/c;->getLong(I)J

    move-result-wide v10

    long-to-int v10, v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    move-object/from16 v27, v10

    :goto_12
    const/16 v10, 0x14

    invoke-interface {v4, v10}, Ltb/c;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_15

    const/4 v10, 0x0

    goto :goto_13

    :cond_15
    invoke-interface {v4, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v10

    :goto_13
    iget-object v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v11, v10}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v29

    if-eqz v29, :cond_19

    const/16 v10, 0x15

    invoke-interface {v4, v10}, Ltb/c;->isNull(I)Z

    move-result v11

    const/16 v3, 0x16

    if-eqz v11, :cond_17

    invoke-interface {v4, v3}, Ltb/c;->isNull(I)Z

    move-result v11

    if-nez v11, :cond_16

    goto :goto_15

    :cond_16
    const/16 v28, 0x0

    :goto_14
    move-object/from16 v11, v18

    move/from16 v18, v7

    goto :goto_17

    :catchall_0
    move-exception v0

    goto :goto_18

    :cond_17
    :goto_15
    invoke-interface {v4, v10}, Ltb/c;->getLong(I)J

    move-result-wide v10

    long-to-int v10, v10

    invoke-interface {v4, v3}, Ltb/c;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_18

    const/4 v3, 0x0

    goto :goto_16

    :cond_18
    invoke-interface {v4, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    :goto_16
    new-instance v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;

    invoke-direct {v11, v10, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;-><init>(ILjava/lang/String;)V

    move-object/from16 v28, v11

    goto :goto_14

    :goto_17
    new-instance v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;

    move-object v10, v6

    invoke-direct/range {v7 .. v29}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;Ljava/util/Map;)V

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x1

    goto/16 :goto_1

    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1a
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    return-void

    :goto_18
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final __fetchRelationshipreplyAttachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalReplyAttachmentEntity$lambda$5(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ltb/a;La0/g;)Ll83/a0;
    .locals 1

    const-string v0, "_tmpMap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__fetchRelationshipreplyAttachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalReplyAttachmentEntity(Ltb/a;La0/g;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ltb/a;La0/g;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__fetchRelationshipreplyAttachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalReplyAttachmentEntity$lambda$5(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ltb/a;La0/g;)Ll83/a0;

    return-void
.end method

.method public static final synthetic access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    return-object p0
.end method

.method public static final synthetic access$get__extraDataConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    return-object p0
.end method

.method public static final synthetic access$get__listConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    return-object p0
.end method

.method public static final synthetic access$get__mapConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    return-object p0
.end method

.method public static final synthetic access$get__moderationDetailsConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__moderationDetailsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    return-object p0
.end method

.method public static final synthetic access$get__reminderInfoConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__reminderInfoConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    return-object p0
.end method

.method public static final synthetic access$get__syncStatusConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    return-object p0
.end method

.method public static final access$insert$s-282016651(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;->insert$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ljava/util/List;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->insertInnerEntity$lambda$0(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic c(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->delete$lambda$2(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic d(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ljava/util/List;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->insertAttachments$lambda$1(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;

    return-void
.end method

.method private static final delete$lambda$2(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__deleteAdapterOfReplyMessageInnerEntity:Landroidx/room/i;

    invoke-virtual {p0, p2, p1}, Landroidx/room/i;->handle(Ltb/a;Ljava/lang/Object;)I

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final deleteAll$lambda$4(Ljava/lang/String;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :catchall_0
    move-exception p1

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method public static synthetic e(Ltb/a;)V
    .locals 1

    const-string v0, "DELETE FROM stream_chat_reply_message"

    invoke-static {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->deleteAll$lambda$4(Ljava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic f(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;
    .locals 1

    const-string v0, "SELECT * FROM stream_chat_reply_message WHERE id = ?"

    invoke-static {v0, p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->selectById$lambda$3(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;

    move-result-object p0

    return-object p0
.end method

.method private static final insertAttachments$lambda$1(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__insertAdapterOfReplyAttachmentEntity:Landroidx/room/k;

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {p0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Iterable;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final insertInnerEntity$lambda$0(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__insertAdapterOfReplyMessageInnerEntity:Landroidx/room/k;

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {p0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Iterable;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final selectById$lambda$3(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;
    .locals 81

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "_connection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    const/4 v3, 0x1

    move-object/from16 v4, p1

    :try_start_0
    invoke-interface {v2, v3, v4}, Ltb/c;->L(ILjava/lang/String;)V

    const-string v4, "id"

    invoke-static {v2, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "cid"

    invoke-static {v2, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "userId"

    invoke-static {v2, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "text"

    invoke-static {v2, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "html"

    invoke-static {v2, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "type"

    invoke-static {v2, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "syncStatus"

    invoke-static {v2, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "replyCount"

    invoke-static {v2, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "deletedReplyCount"

    invoke-static {v2, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "createdAt"

    invoke-static {v2, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "createdLocallyAt"

    invoke-static {v2, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "updatedAt"

    invoke-static {v2, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v3, "updatedLocallyAt"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p1, v3

    const-string v3, "deletedAt"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v16, v3

    const-string v3, "remoteMentionedUserIds"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v17, v3

    const-string v3, "mentionedUsersId"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v18, v3

    const-string v3, "parentId"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v19, v3

    const-string v3, "command"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v20, v3

    const-string v3, "shadowed"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v21, v3

    const-string v3, "i18n"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v22, v3

    const-string v3, "showInChannel"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v23, v3

    const-string v3, "silent"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v24, v3

    const-string v3, "extraData"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v25, v3

    const-string v3, "pinned"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v26, v3

    const-string v3, "pinnedAt"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v27, v3

    const-string v3, "pinExpires"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v28, v3

    const-string v3, "pinnedByUserId"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v29, v3

    const-string v3, "threadParticipantsIds"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v30, v3

    const-string v3, "moderationDetails"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v31, v3

    const-string v3, "messageTextUpdatedAt"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v32, v3

    const-string v3, "pollId"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v33, v3

    const-string v3, "restrictedVisibility"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v34, v3

    const-string v3, "reminder"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v35, v3

    const-string v3, "channelRole"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v36, v3

    const-string v3, "channel_infocid"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v37, v3

    const-string v3, "channel_infoid"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v38, v3

    const-string v3, "channel_infotype"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v39, v3

    const-string v3, "channel_infomemberCount"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v40, v3

    const-string v3, "channel_infoname"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v41, v3

    new-instance v3, La0/g;

    move/from16 v42, v15

    const/4 v15, 0x0

    invoke-direct {v3, v15}, La0/f1;-><init>(I)V

    :goto_0
    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v43

    if-eqz v43, :cond_1

    invoke-interface {v2, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v3, v15}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v44

    if-nez v44, :cond_0

    move/from16 v44, v14

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, v15, v14}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v14, v44

    :cond_0
    const/4 v15, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_2f

    :cond_1
    move/from16 v44, v14

    invoke-interface {v2}, Ltb/c;->reset()V

    invoke-direct {v0, v1, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__fetchRelationshipreplyAttachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalReplyAttachmentEntity(Ltb/a;La0/g;)V

    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v1

    const/4 v14, 0x0

    if-eqz v1, :cond_2b

    invoke-interface {v2, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v46

    invoke-interface {v2, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v47

    invoke-interface {v2, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v48

    invoke-interface {v2, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v49

    invoke-interface {v2, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v50

    invoke-interface {v2, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v51

    invoke-interface {v2, v10}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v1, v5

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v5, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v52

    invoke-interface {v2, v11}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v1, v5

    invoke-interface {v2, v12}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-interface {v2, v13}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_2

    move-object v6, v14

    goto :goto_1

    :cond_2
    invoke-interface {v2, v13}, Ltb/c;->getLong(I)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    :goto_1
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v55

    move/from16 v6, v44

    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_3

    move-object v6, v14

    goto :goto_2

    :cond_3
    invoke-interface {v2, v6}, Ltb/c;->getLong(I)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    :goto_2
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v56

    move/from16 v6, v42

    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_4

    move-object v6, v14

    goto :goto_3

    :cond_4
    invoke-interface {v2, v6}, Ltb/c;->getLong(I)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    :goto_3
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v57

    move/from16 v6, p1

    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_5

    move-object v6, v14

    goto :goto_4

    :cond_5
    invoke-interface {v2, v6}, Ltb/c;->getLong(I)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    :goto_4
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v58

    move/from16 v6, v16

    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_6

    move-object v6, v14

    goto :goto_5

    :cond_6
    invoke-interface {v2, v6}, Ltb/c;->getLong(I)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    :goto_5
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v59

    move/from16 v6, v17

    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_7

    move-object v6, v14

    goto :goto_6

    :cond_7
    invoke-interface {v2, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_6
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v60
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v6, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    if-eqz v60, :cond_2a

    move/from16 v7, v18

    :try_start_1
    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_8

    move-object v7, v14

    goto :goto_7

    :cond_8
    invoke-interface {v2, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    :goto_7
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v61

    if-eqz v61, :cond_29

    move/from16 v7, v19

    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_9

    move-object/from16 v62, v14

    :goto_8
    move/from16 v7, v20

    goto :goto_9

    :cond_9
    invoke-interface {v2, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v62, v7

    goto :goto_8

    :goto_9
    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_a

    move-object/from16 v63, v14

    :goto_a
    move/from16 v7, v21

    goto :goto_b

    :cond_a
    invoke-interface {v2, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v63, v7

    goto :goto_a

    :goto_b
    invoke-interface {v2, v7}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_b

    const/16 v64, 0x1

    :goto_c
    move/from16 v7, v22

    goto :goto_d

    :cond_b
    const/16 v64, 0x0

    goto :goto_c

    :goto_d
    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_c

    move-object v7, v14

    goto :goto_e

    :cond_c
    invoke-interface {v2, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    :goto_e
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToStringMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v65

    if-eqz v65, :cond_28

    move/from16 v7, v23

    invoke-interface {v2, v7}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_d

    const/16 v66, 0x1

    :goto_f
    move/from16 v7, v24

    goto :goto_10

    :cond_d
    const/16 v66, 0x0

    goto :goto_f

    :goto_10
    invoke-interface {v2, v7}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_e

    const/16 v68, 0x1

    :goto_11
    move/from16 v7, v25

    goto :goto_12

    :cond_e
    const/16 v68, 0x0

    goto :goto_11

    :goto_12
    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_f

    move-object v7, v14

    goto :goto_13

    :cond_f
    invoke-interface {v2, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    :goto_13
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v69

    if-eqz v69, :cond_27

    move/from16 v7, v26

    invoke-interface {v2, v7}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_10

    const/16 v70, 0x1

    :goto_14
    move/from16 v7, v27

    goto :goto_15

    :cond_10
    const/16 v70, 0x0

    goto :goto_14

    :goto_15
    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_11

    move-object v7, v14

    goto :goto_16

    :cond_11
    invoke-interface {v2, v7}, Ltb/c;->getLong(I)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    :goto_16
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v71

    move/from16 v7, v28

    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_12

    move-object v7, v14

    goto :goto_17

    :cond_12
    invoke-interface {v2, v7}, Ltb/c;->getLong(I)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    :goto_17
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v72

    move/from16 v7, v29

    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_13

    move-object/from16 v73, v14

    :goto_18
    move/from16 v7, v30

    goto :goto_19

    :cond_13
    invoke-interface {v2, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v73, v7

    goto :goto_18

    :goto_19
    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_14

    move-object v7, v14

    goto :goto_1a

    :cond_14
    invoke-interface {v2, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    :goto_1a
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v74

    if-eqz v74, :cond_26

    move/from16 v7, v31

    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_15

    move-object v7, v14

    goto :goto_1b

    :cond_15
    invoke-interface {v2, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    :goto_1b
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__moderationDetailsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;->stringToModerationDetails(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-result-object v75

    move/from16 v7, v32

    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_16

    move-object v7, v14

    goto :goto_1c

    :cond_16
    invoke-interface {v2, v7}, Ltb/c;->getLong(I)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    :goto_1c
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v76

    move/from16 v7, v33

    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_17

    move-object/from16 v77, v14

    :goto_1d
    move/from16 v7, v34

    goto :goto_1e

    :cond_17
    invoke-interface {v2, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v77, v7

    goto :goto_1d

    :goto_1e
    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_18

    move-object v7, v14

    goto :goto_1f

    :cond_18
    invoke-interface {v2, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    :goto_1f
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v78

    if-eqz v78, :cond_25

    move/from16 v7, v35

    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_19

    move-object v6, v14

    goto :goto_20

    :cond_19
    invoke-interface {v2, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_20
    iget-object v0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__reminderInfoConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    invoke-virtual {v0, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;->stringToReminderInfo(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-result-object v79

    move/from16 v0, v36

    invoke-interface {v2, v0}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_1a

    move-object/from16 v80, v14

    :goto_21
    move/from16 v0, v37

    goto :goto_22

    :cond_1a
    invoke-interface {v2, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v80, v0

    goto :goto_21

    :goto_22
    invoke-interface {v2, v0}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_1f

    move/from16 v6, v38

    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_1e

    move/from16 v7, v39

    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_1d

    move/from16 v8, v40

    invoke-interface {v2, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1c

    move/from16 v9, v41

    invoke-interface {v2, v9}, Ltb/c;->isNull(I)Z

    move-result v10

    if-nez v10, :cond_1b

    goto :goto_26

    :cond_1b
    move-object/from16 v67, v14

    goto/16 :goto_2d

    :cond_1c
    :goto_23
    move/from16 v9, v41

    goto :goto_26

    :cond_1d
    :goto_24
    move/from16 v8, v40

    goto :goto_23

    :cond_1e
    :goto_25
    move/from16 v7, v39

    goto :goto_24

    :cond_1f
    move/from16 v6, v38

    goto :goto_25

    :goto_26
    invoke-interface {v2, v0}, Ltb/c;->isNull(I)Z

    move-result v10

    if-eqz v10, :cond_20

    move-object/from16 v16, v14

    goto :goto_27

    :cond_20
    invoke-interface {v2, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v16, v0

    :goto_27
    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_21

    move-object/from16 v17, v14

    goto :goto_28

    :cond_21
    invoke-interface {v2, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v17, v0

    :goto_28
    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_22

    move-object/from16 v18, v14

    goto :goto_29

    :cond_22
    invoke-interface {v2, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v18, v0

    :goto_29
    invoke-interface {v2, v8}, Ltb/c;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_23

    move-object/from16 v19, v14

    goto :goto_2a

    :cond_23
    invoke-interface {v2, v8}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v0, v6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v19, v0

    :goto_2a
    invoke-interface {v2, v9}, Ltb/c;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_24

    :goto_2b
    move-object/from16 v20, v14

    goto :goto_2c

    :cond_24
    invoke-interface {v2, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v14

    goto :goto_2b

    :goto_2c
    new-instance v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    invoke-direct/range {v15 .. v20}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    move-object/from16 v67, v15

    :goto_2d
    new-instance v45, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;

    move/from16 v53, v1

    move/from16 v54, v5

    invoke-direct/range {v45 .. v80}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Ljava/lang/String;)V

    move-object/from16 v0, v45

    invoke-interface {v2, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v1

    const-string v3, "getValue(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/List;

    new-instance v14, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;

    invoke-direct {v14, v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;Ljava/util/List;)V

    goto :goto_2e

    :cond_25
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_26
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_27
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_28
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.String>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_29
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2b
    :goto_2e
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object v14

    :goto_2f
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method


# virtual methods
.method public final delete(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lh02/h;

    const/16 v2, 0x1d

    invoke-direct {v1, v2, p0, p1}, Lh02/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteAll(Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/api/state/a;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insert(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl$insert$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl$insert$2;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ljava/util/List;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertAttachments(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/i;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/i;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ljava/util/List;I)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertInnerEntity(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/i;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/i;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;Ljava/util/List;I)V

    const/4 p1, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final selectById(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lh02/h;

    const/16 v2, 0x1b

    invoke-direct {v1, v2, p1, p0}, Lh02/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x1

    invoke-static {v0, p1, p1, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
