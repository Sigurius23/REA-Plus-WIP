.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00da\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u0088\u00012\u00020\u0001:\u0002\u0088\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nJ$\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001e\u0010\u0012\u001a\u00020\u00112\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000bH\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\u000eJ\u001e\u0010\u0015\u001a\u00020\u00112\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000bH\u0096@\u00a2\u0006\u0004\u0008\u0015\u0010\u000eJ\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001e\u0010\u001e\u001a\u00020\u00112\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000bH\u0096@\u00a2\u0006\u0004\u0008\u001e\u0010\u000eJ\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001cH\u0096@\u00a2\u0006\u0004\u0008\u001e\u0010 J\u001d\u0010#\u001a\u00020\u00112\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020!0\u000bH\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0018\u0010%\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008%\u0010\nJ\u001e\u0010&\u001a\u00020\u00112\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@\u00a2\u0006\u0004\u0008&\u0010\u000eJ$\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000b2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020!0\u000bH\u0096@\u00a2\u0006\u0004\u0008(\u0010\u000eJ\u0016\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000bH\u0096@\u00a2\u0006\u0004\u0008)\u0010*J\u0016\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u000bH\u0096@\u00a2\u0006\u0004\u0008+\u0010*J\u001a\u0010-\u001a\u0004\u0018\u00010\u00162\u0006\u0010,\u001a\u00020!H\u0096@\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00100\u001a\u0004\u0018\u00010\u00162\u0006\u0010/\u001a\u00020!H\u0096@\u00a2\u0006\u0004\u00080\u0010.J.\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010,\u001a\u00020!2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0096@\u00a2\u0006\u0004\u00085\u00106J.\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010,\u001a\u00020!2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0096@\u00a2\u0006\u0004\u00087\u00106J.\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010,\u001a\u00020!2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0096@\u00a2\u0006\u0004\u00088\u00106J.\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010,\u001a\u00020!2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0096@\u00a2\u0006\u0004\u00089\u00106J&\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010,\u001a\u00020!2\u0006\u00102\u001a\u000201H\u0096@\u00a2\u0006\u0004\u0008:\u0010;J&\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010<\u001a\u00020!2\u0006\u00102\u001a\u000201H\u0096@\u00a2\u0006\u0004\u0008=\u0010;J\u001a\u0010(\u001a\u0004\u0018\u00010\u001c2\u0006\u0010>\u001a\u00020!H\u0096@\u00a2\u0006\u0004\u0008(\u0010.J$\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000b2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020!0\u000bH\u0096@\u00a2\u0006\u0004\u0008?\u0010\u000eJ&\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010A\u001a\u00020@2\u0006\u00102\u001a\u000201H\u0096@\u00a2\u0006\u0004\u0008B\u0010CJ\u001e\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010D\u001a\u00020!H\u0096@\u00a2\u0006\u0004\u0008E\u0010.J&\u0010F\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010,\u001a\u00020!2\u0006\u0010D\u001a\u00020!H\u0096@\u00a2\u0006\u0004\u0008F\u0010GJ&\u0010H\u001a\u0008\u0012\u0004\u0012\u00020!0\u000b2\u0006\u0010A\u001a\u00020@2\u0006\u00102\u001a\u000201H\u0096@\u00a2\u0006\u0004\u0008H\u0010CJ\u001e\u0010J\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010I\u001a\u00020!H\u0096@\u00a2\u0006\u0004\u0008J\u0010.J:\u0010M\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010,\u001a\u00020!2\u000c\u0010K\u001a\u0008\u0012\u0004\u0012\u0002010\u000b2\u000c\u0010L\u001a\u0008\u0012\u0004\u0012\u00020!0\u000bH\u0096@\u00a2\u0006\u0004\u0008M\u0010NJ\u001d\u0010O\u001a\u00020\u00112\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020!0\u000bH\u0016\u00a2\u0006\u0004\u0008O\u0010$J\u0018\u0010P\u001a\u00020\u00112\u0006\u0010<\u001a\u00020!H\u0096@\u00a2\u0006\u0004\u0008P\u0010.J \u0010R\u001a\u00020\u00112\u0006\u0010,\u001a\u00020!2\u0006\u0010Q\u001a\u000203H\u0096@\u00a2\u0006\u0004\u0008R\u0010SJ \u0010T\u001a\u00020\u00112\u0006\u0010,\u001a\u00020!2\u0006\u0010<\u001a\u00020!H\u0096@\u00a2\u0006\u0004\u0008T\u0010GJ\u0018\u0010U\u001a\u00020\u00112\u0006\u0010,\u001a\u00020!H\u0096@\u00a2\u0006\u0004\u0008U\u0010.J\u001e\u0010U\u001a\u00020\u00112\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020!0\u000bH\u0096@\u00a2\u0006\u0004\u0008U\u0010\u000eJ\u0010\u0010V\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0004\u0008V\u0010*J\u0010\u0010W\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0004\u0008W\u0010*J1\u0010]\u001a\u00020\u00112\u0006\u0010Y\u001a\u00020X2\u0018\u0010\\\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0[0ZH\u0002\u00a2\u0006\u0004\u0008]\u0010^J1\u0010_\u001a\u00020\u00112\u0006\u0010Y\u001a\u00020X2\u0018\u0010\\\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130[0ZH\u0002\u00a2\u0006\u0004\u0008_\u0010^R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010`R\u001a\u0010b\u001a\u0008\u0012\u0004\u0012\u00020\u00060a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008b\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008e\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008h\u0010iR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008k\u0010lR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008n\u0010oR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008q\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008t\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008w\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008z\u0010{R\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008}\u0010~R\u001a\u0010\u007f\u001a\u0008\u0012\u0004\u0012\u00020\u000f0a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u007f\u0010cR\u001c\u0010\u0080\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00130a8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0080\u0001\u0010cR\u001c\u0010\u0081\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00160a8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0081\u0001\u0010cR\u001e\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0082\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0086\u0001\u0010\u0087\u0001\u00a8\u0006\u0089\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;",
        "Landroidx/room/z0;",
        "__db",
        "<init>",
        "(Landroidx/room/z0;)V",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;",
        "messageInnerEntity",
        "",
        "insertMessageInnerEntity",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Lq83/d;)Ljava/lang/Object;",
        "",
        "messageInnerEntities",
        "insertMessageInnerEntities",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;",
        "attachmentEntities",
        "Ll83/a0;",
        "insertAttachments",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
        "reactions",
        "insertReactions",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;",
        "draftMessage",
        "insertDraftMessages",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;Lq83/d;)Ljava/lang/Object;",
        "updateMessageInnerEntity",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;)V",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
        "messageEntities",
        "insert",
        "messageEntity",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;",
        "",
        "messageIds",
        "deleteAttachments",
        "(Ljava/util/List;)V",
        "upsertMessageInnerEntity",
        "upsertMessageInnerEntities",
        "ids",
        "select",
        "selectWaitForAttachments",
        "(Lq83/d;)Ljava/lang/Object;",
        "selectDraftMessages",
        "cid",
        "selectDraftMessageByCid",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "parentId",
        "selectDraftMessageByParentId",
        "",
        "limit",
        "Ljava/util/Date;",
        "dateFilter",
        "messagesForChannelNewerThan",
        "(Ljava/lang/String;ILjava/util/Date;Lq83/d;)Ljava/lang/Object;",
        "messagesForChannelEqualOrNewerThan",
        "messagesForChannelOlderThan",
        "messagesForChannelEqualOrOlderThan",
        "messagesForChannel",
        "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "messageId",
        "messagesForThread",
        "id",
        "selectChunked",
        "Lio/getstream/chat/android/models/SyncStatus;",
        "syncStatus",
        "selectBySyncStatus",
        "(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;",
        "userId",
        "selectByUserId",
        "selectByCidAndUserId",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "selectIdsBySyncStatus",
        "pollId",
        "selectMessagesWithPoll",
        "syncStatuses",
        "types",
        "selectBySyncStatusOrTypeForChannel",
        "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "deleteAttachmentsChunked",
        "deleteDraftMessage",
        "deleteMessagesBefore",
        "deleteChannelMessagesBefore",
        "(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;",
        "deleteMessage",
        "deleteMessages",
        "deleteAll",
        "deleteAllDrafts",
        "Ltb/a;",
        "_connection",
        "La0/g;",
        "",
        "_map",
        "__fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity",
        "(Ltb/a;La0/g;)V",
        "__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity",
        "Landroidx/room/z0;",
        "Landroidx/room/k;",
        "__insertAdapterOfMessageInnerEntity",
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
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;",
        "__moderationConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;",
        "__reminderInfoConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;",
        "__locationConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;",
        "__insertAdapterOfAttachmentEntity",
        "__insertAdapterOfReactionEntity",
        "__insertAdapterOfDraftMessageEntity",
        "Landroidx/room/i;",
        "__updateAdapterOfMessageInnerEntity",
        "Landroidx/room/i;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;",
        "__reactionGroupConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;",
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
.field public static final Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$Companion;


# instance fields
.field private final __dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

.field private final __db:Landroidx/room/z0;

.field private final __extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

.field private final __insertAdapterOfAttachmentEntity:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final __insertAdapterOfDraftMessageEntity:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final __insertAdapterOfMessageInnerEntity:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final __insertAdapterOfReactionEntity:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final __listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

.field private final __locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

.field private final __mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

.field private final __moderationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;

.field private final __moderationDetailsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

.field private final __reactionGroupConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;

.field private final __reminderInfoConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

.field private final __syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

.field private final __updateAdapterOfMessageInnerEntity:Landroidx/room/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/i;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$Companion;

    return-void
.end method

.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    const-string v0, "__db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationDetailsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reminderInfoConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reactionGroupConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__insertAdapterOfMessageInnerEntity:Landroidx/room/k;

    new-instance p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$2;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$2;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__insertAdapterOfAttachmentEntity:Landroidx/room/k;

    new-instance p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$3;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$3;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__insertAdapterOfReactionEntity:Landroidx/room/k;

    new-instance p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$4;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$4;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__insertAdapterOfDraftMessageEntity:Landroidx/room/k;

    new-instance p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$5;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$5;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__updateAdapterOfMessageInnerEntity:Landroidx/room/i;

    return-void
.end method

.method public static synthetic A(Ljava/lang/String;Ltb/a;)V
    .locals 1

    const-string v0, "DELETE from stream_chat_message WHERE cid = ?"

    invoke-static {v0, p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->deleteMessages$lambda$28(Ljava/lang/String;Ljava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic B(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;ILtb/a;)Ljava/util/ArrayList;
    .locals 6

    const-string v0, "SELECT * from stream_chat_message WHERE cid = ? AND (createdAt > ? OR createdLocallyAt > ?) ORDER BY CASE WHEN createdAt IS NULL THEN createdLocallyAt ELSE createdAt END ASC LIMIT ?"

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->messagesForChannelNewerThan$lambda$10(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;ILtb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic C(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;Ltb/a;)V
    .locals 1

    const-string v0, "DELETE from stream_chat_message WHERE cid = ? AND createdAt < ?"

    invoke-static {v0, p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->deleteChannelMessagesBefore$lambda$26(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic D(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "SELECT * FROM stream_chat_draft_message_entity"

    invoke-static {v0, p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->selectDraftMessages$lambda$7(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic E(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->insertDraftMessages$lambda$4(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic F(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;La0/g;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity$lambda$33(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;La0/g;)Ll83/a0;

    return-void
.end method

.method public static synthetic G(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/ArrayList;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->selectChunked$lambda$17(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic H(Ljava/lang/String;Ltb/a;)V
    .locals 1

    const-string v0, "DELETE FROM stream_chat_draft_message_entity WHERE id = ?"

    invoke-static {v0, p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->deleteDraftMessage$lambda$25(Ljava/lang/String;Ljava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method private final __fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity(Ltb/a;La0/g;)V
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

    new-instance v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/h;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v0, v4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/h;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;I)V

    invoke-static {v2, v3}, Lse/b;->X(La0/g;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    const-string v5, "SELECT `id`,`messageId`,`authorName`,`titleLink`,`authorLink`,`thumbUrl`,`imageUrl`,`assetUrl`,`ogUrl`,`mimeType`,`fileSize`,`title`,`text`,`type`,`image`,`name`,`fallback`,`uploadFilePath`,`originalHeight`,`originalWidth`,`extraData`,`statusCode`,`errorMessage` FROM `attachment_inner_entity` WHERE `messageId` IN ("

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
    iget-object v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

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
    new-instance v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;

    move-object v10, v6

    invoke-direct/range {v7 .. v29}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;Ljava/util/Map;)V

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

.method private static final __fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity$lambda$32(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;La0/g;)Ll83/a0;
    .locals 1

    const-string v0, "_tmpMap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity(Ltb/a;La0/g;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final __fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V
    .locals 21
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

    new-instance v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/h;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v0, v4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/h;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;I)V

    invoke-static {v2, v3}, Lse/b;->X(La0/g;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    const-string v5, "SELECT `messageId`,`userId`,`type`,`score`,`createdAt`,`createdLocallyAt`,`updatedAt`,`deletedAt`,`enforceUnique`,`skipPush`,`emojiCode`,`extraData`,`syncStatus`,`id` FROM `stream_chat_reaction` WHERE `messageId` IN ("

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

    if-eqz v5, :cond_e

    invoke-interface {v4, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-eqz v5, :cond_d

    const/4 v6, 0x0

    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v4, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    const/4 v7, 0x2

    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v10

    const/4 v7, 0x3

    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v11

    long-to-int v11, v11

    const/4 v7, 0x4

    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v12

    const/4 v13, 0x0

    if-eqz v12, :cond_4

    move-object v7, v13

    goto :goto_2

    :cond_4
    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    :goto_2
    iget-object v12, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v12, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v12

    const/4 v7, 0x5

    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_5

    move-object v7, v13

    goto :goto_3

    :cond_5
    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    :goto_3
    iget-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v14, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v7

    const/4 v14, 0x6

    invoke-interface {v4, v14}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_6

    move-object v14, v13

    goto :goto_4

    :cond_6
    invoke-interface {v4, v14}, Ltb/c;->getLong(I)J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    :goto_4
    iget-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v15, v14}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v14

    const/4 v15, 0x7

    invoke-interface {v4, v15}, Ltb/c;->isNull(I)Z

    move-result v16

    if-eqz v16, :cond_7

    move-object v15, v13

    goto :goto_5

    :cond_7
    invoke-interface {v4, v15}, Ltb/c;->getLong(I)J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    :goto_5
    iget-object v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v3, v15}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v15

    const/16 v3, 0x8

    move-object/from16 v17, v7

    invoke-interface {v4, v3}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v3, v6

    if-eqz v3, :cond_8

    const/16 v16, 0x1

    :goto_6
    const/4 v3, 0x0

    goto :goto_7

    :cond_8
    const/16 v16, 0x0

    goto :goto_6

    :goto_7
    const/16 v6, 0x9

    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    if-eqz v6, :cond_9

    const/4 v6, 0x1

    goto :goto_8

    :cond_9
    move v6, v3

    :goto_8
    const/16 v3, 0xa

    invoke-interface {v4, v3}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_a

    move-object/from16 v18, v13

    goto :goto_9

    :cond_a
    invoke-interface {v4, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v18, v3

    :goto_9
    const/16 v3, 0xb

    invoke-interface {v4, v3}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_b

    goto :goto_a

    :cond_b
    invoke-interface {v4, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v13

    :goto_a
    iget-object v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v3, v13}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v19

    if-eqz v19, :cond_c

    const/16 v3, 0xc

    invoke-interface {v4, v3}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    iget-object v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v20

    new-instance v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    move-object/from16 v13, v17

    move/from16 v17, v6

    invoke-direct/range {v7 .. v20}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;)V

    const/16 v2, 0xd

    invoke-interface {v4, v2}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v7, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->setId(I)V

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, p2

    const/4 v3, 0x1

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    goto :goto_b

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_d
    move-object/from16 v2, p2

    goto/16 :goto_1

    :cond_e
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    return-void

    :goto_b
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final __fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity$lambda$33(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;La0/g;)Ll83/a0;
    .locals 1

    const-string v0, "_tmpMap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/ArrayList;
    .locals 0

    invoke-static/range {p0 .. p6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->selectBySyncStatusOrTypeForChannel$lambda$23(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final synthetic access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    return-object p0
.end method

.method public static final synthetic access$get__extraDataConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    return-object p0
.end method

.method public static final synthetic access$get__listConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    return-object p0
.end method

.method public static final synthetic access$get__locationConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    return-object p0
.end method

.method public static final synthetic access$get__mapConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    return-object p0
.end method

.method public static final synthetic access$get__moderationConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;

    return-object p0
.end method

.method public static final synthetic access$get__moderationDetailsConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationDetailsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    return-object p0
.end method

.method public static final synthetic access$get__reminderInfoConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reminderInfoConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    return-object p0
.end method

.method public static final synthetic access$get__syncStatusConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    return-object p0
.end method

.method public static final access$insert$s302716459(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->insert$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final access$insert$s302716459(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->insert$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final access$select$s302716459(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->select$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final access$selectWaitForAttachments$s302716459(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->selectWaitForAttachments$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final access$upsertMessageInnerEntities$s302716459(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->upsertMessageInnerEntities$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final access$upsertMessageInnerEntity$s302716459(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->upsertMessageInnerEntity$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ltb/a;)V
    .locals 1

    const-string v0, "DELETE FROM stream_chat_draft_message_entity"

    invoke-static {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->deleteAllDrafts$lambda$31(Ljava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic c(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "SELECT * FROM stream_chat_message WHERE cid = ? AND userId = ?"

    invoke-static {v0, p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->selectByCidAndUserId$lambda$20(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "SELECT * FROM stream_chat_message WHERE userId = ?"

    invoke-static {v0, p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->selectByUserId$lambda$19(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method private static final deleteAll$lambda$30(Ljava/lang/String;Ltb/a;)Ll83/a0;
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

.method private static final deleteAllDrafts$lambda$31(Ljava/lang/String;Ltb/a;)Ll83/a0;
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

.method private static final deleteAttachments$lambda$6(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->deleteAttachments(Ljava/util/List;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final deleteAttachmentsChunked$lambda$24(Ljava/lang/String;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p0, p2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private static final deleteChannelMessagesBefore$lambda$26(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p4, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    const/4 p4, 0x1

    :try_start_0
    invoke-interface {p0, p4, p1}, Ltb/c;->L(ILjava/lang/String;)V

    iget-object p1, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {p1, p3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x2

    if-nez p1, :cond_0

    invoke-interface {p0, p2}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    invoke-interface {p0, p2, p3, p4}, Ltb/c;->p(IJ)V

    :goto_0
    invoke-interface {p0}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private static final deleteDraftMessage$lambda$25(Ljava/lang/String;Ljava/lang/String;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    const/4 p2, 0x1

    :try_start_0
    invoke-interface {p0, p2, p1}, Ltb/c;->L(ILjava/lang/String;)V

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

.method private static final deleteMessage$lambda$27(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    const/4 p3, 0x1

    :try_start_0
    invoke-interface {p0, p3, p1}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 p1, 0x2

    invoke-interface {p0, p1, p2}, Ltb/c;->L(ILjava/lang/String;)V

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

.method private static final deleteMessages$lambda$28(Ljava/lang/String;Ljava/lang/String;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    const/4 p2, 0x1

    :try_start_0
    invoke-interface {p0, p2, p1}, Ltb/c;->L(ILjava/lang/String;)V

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

.method private static final deleteMessages$lambda$29(Ljava/lang/String;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p0, p2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method public static synthetic e(Ljava/lang/String;Ljava/util/List;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->deleteAttachmentsChunked$lambda$24(Ljava/lang/String;Ljava/util/List;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic f(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;ILtb/a;)Ljava/util/ArrayList;
    .locals 6

    const-string v0, "SELECT * from stream_chat_message WHERE cid = ? AND (createdAt >= ? OR createdLocallyAt >= ?) ORDER BY CASE WHEN createdAt IS NULL THEN createdLocallyAt ELSE createdAt END ASC LIMIT ?"

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->messagesForChannelEqualOrNewerThan$lambda$11(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;ILtb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/String;Ljava/lang/String;Ltb/a;)V
    .locals 1

    const-string v0, "DELETE from stream_chat_message WHERE cid = ? AND id = ?"

    invoke-static {v0, p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->deleteMessage$lambda$27(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic h(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "SELECT * FROM stream_chat_message WHERE pollId = ?"

    invoke-static {v0, p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->selectMessagesWithPoll$lambda$22(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic i(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->deleteAttachments$lambda$6(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;

    return-void
.end method

.method private static final insertAttachments$lambda$2(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__insertAdapterOfAttachmentEntity:Landroidx/room/k;

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {p0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Iterable;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final insertDraftMessages$lambda$4(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__insertAdapterOfDraftMessageEntity:Landroidx/room/k;

    invoke-virtual {p0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final insertMessageInnerEntities$lambda$1(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Ltb/a;)Ljava/util/List;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__insertAdapterOfMessageInnerEntity:Landroidx/room/k;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p2, p1}, Landroidx/room/k;->insertAndReturnIdsList(Ltb/a;Ljava/util/Collection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final insertMessageInnerEntity$lambda$0(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ltb/a;)J
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__insertAdapterOfMessageInnerEntity:Landroidx/room/k;

    invoke-virtual {p0, p2, p1}, Landroidx/room/k;->insertAndReturnId(Ltb/a;Ljava/lang/Object;)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final insertReactions$lambda$3(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__insertAdapterOfReactionEntity:Landroidx/room/k;

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {p0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Iterable;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;
    .locals 1

    const-string v0, "SELECT * FROM stream_chat_message WHERE id IN (?)"

    invoke-static {v0, p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->select$lambda$16(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;La0/g;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity$lambda$32(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;La0/g;)Ll83/a0;

    return-void
.end method

.method public static synthetic l(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;
    .locals 1

    const-string v0, "SELECT * FROM stream_chat_draft_message_entity WHERE cid = ? AND parentId IS NULL"

    invoke-static {v0, p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->selectDraftMessageByCid$lambda$8(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ltb/a;)J
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->insertMessageInnerEntity$lambda$0(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ltb/a;)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final messagesForChannel$lambda$14(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 109

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    const-string v2, "getValue(...)"

    const-string v3, "_connection"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v3

    const/4 v4, 0x1

    move-object/from16 v5, p1

    :try_start_0
    invoke-interface {v3, v4, v5}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v5, 0x2

    move/from16 v6, p2

    int-to-long v6, v6

    invoke-interface {v3, v5, v6, v7}, Ltb/c;->p(IJ)V

    const-string v5, "id"

    invoke-static {v3, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "cid"

    invoke-static {v3, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "userId"

    invoke-static {v3, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "text"

    invoke-static {v3, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "html"

    invoke-static {v3, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "type"

    invoke-static {v3, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "syncStatus"

    invoke-static {v3, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "replyCount"

    invoke-static {v3, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "deletedReplyCount"

    invoke-static {v3, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "createdAt"

    invoke-static {v3, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "createdLocallyAt"

    invoke-static {v3, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v4, "updatedAt"

    invoke-static {v3, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move-object/from16 v16, v2

    const-string v2, "updatedLocallyAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p1, v2

    const-string v2, "deletedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p2, v2

    const-string v2, "remoteMentionedUserIds"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v17, v2

    const-string v2, "mentionedUsersId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v18, v2

    const-string v2, "reactionCounts"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v19, v2

    const-string v2, "reactionScores"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v20, v2

    const-string v2, "reactionGroups"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v21, v2

    const-string v2, "parentId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v22, v2

    const-string v2, "command"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v23, v2

    const-string v2, "shadowed"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v24, v2

    const-string v2, "i18n"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v25, v2

    const-string v2, "showInChannel"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v26, v2

    const-string v2, "silent"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v27, v2

    const-string v2, "extraData"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v28, v2

    const-string v2, "replyToId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v29, v2

    const-string v2, "pinned"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v30, v2

    const-string v2, "pinnedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v31, v2

    const-string v2, "pinExpires"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v32, v2

    const-string v2, "pinnedByUserId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v33, v2

    const-string v2, "threadParticipantsIds"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v34, v2

    const-string v2, "skipPushNotification"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v35, v2

    const-string v2, "skipEnrichUrl"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v36, v2

    const-string v2, "moderationDetails"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v37, v2

    const-string v2, "moderation"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v38, v2

    const-string v2, "messageTextUpdatedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v39, v2

    const-string v2, "pollId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v40, v2

    const-string v2, "restrictedVisibility"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v41, v2

    const-string v2, "reminder"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v42, v2

    const-string v2, "sharedLocation"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v43, v2

    const-string v2, "channelRole"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v44, v2

    const-string v2, "deletedForMe"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v45, v2

    const-string v2, "channel_infocid"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v46, v2

    const-string v2, "channel_infoid"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v47, v2

    const-string v2, "channel_infotype"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v48, v2

    const-string v2, "channel_infomemberCount"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v49, v2

    const-string v2, "channel_infoname"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v50, v2

    new-instance v2, La0/g;

    move/from16 v51, v4

    const/4 v4, 0x0

    invoke-direct {v2, v4}, La0/f1;-><init>(I)V

    move/from16 v52, v15

    new-instance v15, La0/g;

    invoke-direct {v15, v4}, La0/f1;-><init>(I)V

    move/from16 v53, v14

    new-instance v14, La0/g;

    invoke-direct {v14, v4}, La0/f1;-><init>(I)V

    :goto_0
    invoke-interface {v3}, Ltb/c;->e1()Z

    move-result v54

    if-eqz v54, :cond_3

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v55

    if-nez v55, :cond_0

    move/from16 v55, v13

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v4, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_50

    :cond_0
    move/from16 v55, v13

    :goto_1
    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15, v4}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_1

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v15, v4, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14, v4}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_2

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v14, v4, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    move/from16 v13, v55

    const/4 v4, 0x0

    goto :goto_0

    :cond_3
    move/from16 v55, v13

    invoke-interface {v3}, Ltb/c;->reset()V

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v1, v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v1, v14}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    invoke-interface {v3}, Ltb/c;->e1()Z

    move-result v4

    if-eqz v4, :cond_39

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v57

    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v58

    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v59

    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v60

    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v61

    invoke-interface {v3, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v62

    move v4, v6

    move v13, v7

    invoke-interface {v3, v11}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v63

    invoke-interface {v3, v12}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    move/from16 v101, v9

    move/from16 v7, v55

    move/from16 v55, v8

    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    move/from16 v9, v53

    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v53

    const/16 v56, 0x0

    if-eqz v53, :cond_4

    move/from16 p4, v4

    move-object/from16 v4, v56

    :goto_3
    move/from16 v64, v6

    goto :goto_4

    :cond_4
    invoke-interface {v3, v9}, Ltb/c;->getLong(I)J

    move-result-wide v64

    invoke-static/range {v64 .. v65}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v53

    move/from16 p4, v4

    move-object/from16 v4, v53

    goto :goto_3

    :goto_4
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v66

    move/from16 v4, v52

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_5

    move-object/from16 v6, v56

    :goto_5
    move/from16 v52, v4

    goto :goto_6

    :cond_5
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v52

    invoke-static/range {v52 .. v53}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_5

    :goto_6
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v67

    move/from16 v4, v51

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_6

    move-object/from16 v6, v56

    :goto_7
    move/from16 v51, v4

    goto :goto_8

    :cond_6
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v68

    invoke-static/range {v68 .. v69}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_7

    :goto_8
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v68

    move/from16 v4, p1

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_7

    move-object/from16 v6, v56

    :goto_9
    move/from16 p1, v4

    goto :goto_a

    :cond_7
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v69

    invoke-static/range {v69 .. v70}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_9

    :goto_a
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v69

    move/from16 v4, p2

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_8

    move-object/from16 v6, v56

    :goto_b
    move/from16 p2, v4

    goto :goto_c

    :cond_8
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v70

    invoke-static/range {v70 .. v71}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_b

    :goto_c
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v70

    move/from16 v4, v17

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_9

    move-object/from16 v6, v56

    :goto_d
    move/from16 v17, v4

    goto :goto_e

    :cond_9
    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_d

    :goto_e
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v71
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    if-eqz v71, :cond_38

    move/from16 v6, v18

    :try_start_1
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v18

    if-eqz v18, :cond_a

    move/from16 v53, v6

    move-object/from16 v6, v56

    :goto_f
    move/from16 v18, v7

    goto :goto_10

    :cond_a
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18

    move/from16 v53, v6

    move-object/from16 v6, v18

    goto :goto_f

    :goto_10
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v72

    if-eqz v72, :cond_37

    move/from16 v6, v19

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_b

    move-object/from16 v7, v56

    :goto_11
    move/from16 v19, v6

    goto :goto_12

    :cond_b
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_11

    :goto_12
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v73
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v6, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Int>\', but it was NULL."

    if-eqz v73, :cond_36

    move/from16 v7, v20

    :try_start_2
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v20

    if-eqz v20, :cond_c

    move/from16 v102, v7

    move-object/from16 v7, v56

    :goto_13
    move/from16 v65, v8

    goto :goto_14

    :cond_c
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v20

    move/from16 v102, v7

    move-object/from16 v7, v20

    goto :goto_13

    :goto_14
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v74

    if-eqz v74, :cond_35

    move/from16 v7, v21

    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_d

    move-object/from16 v6, v56

    goto :goto_15

    :cond_d
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_15
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reactionGroupConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;

    invoke-virtual {v8, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;->stringToReactionGroupEntityMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v75

    if-eqz v75, :cond_34

    move/from16 v6, v22

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_e

    move-object/from16 v76, v56

    :goto_16
    move/from16 v8, v23

    goto :goto_17

    :cond_e
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v76, v8

    goto :goto_16

    :goto_17
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v20

    if-eqz v20, :cond_f

    move-object/from16 v77, v56

    :goto_18
    move/from16 v22, v6

    move/from16 v21, v7

    move/from16 v23, v8

    move/from16 v6, v24

    goto :goto_19

    :cond_f
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v77, v20

    goto :goto_18

    :goto_19
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_10

    const/16 v78, 0x1

    :goto_1a
    move/from16 v7, v25

    goto :goto_1b

    :cond_10
    const/16 v78, 0x0

    goto :goto_1a

    :goto_1b
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_11

    move-object/from16 v8, v56

    :goto_1c
    move/from16 v24, v6

    goto :goto_1d

    :cond_11
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_1c

    :goto_1d
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToStringMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v79

    if-eqz v79, :cond_33

    move/from16 v25, v7

    move/from16 v6, v26

    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_12

    const/16 v80, 0x1

    :goto_1e
    move/from16 v20, v9

    move/from16 v7, v27

    goto :goto_1f

    :cond_12
    const/16 v80, 0x0

    goto :goto_1e

    :goto_1f
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_13

    const/16 v82, 0x1

    :goto_20
    move/from16 v8, v28

    goto :goto_21

    :cond_13
    const/16 v82, 0x0

    goto :goto_20

    :goto_21
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_14

    move-object/from16 v9, v56

    :goto_22
    move/from16 v26, v6

    goto :goto_23

    :cond_14
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_22

    :goto_23
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v83

    if-eqz v83, :cond_32

    move/from16 v6, v29

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_15

    move-object/from16 v84, v56

    :goto_24
    move/from16 v29, v6

    move/from16 v27, v7

    move/from16 v9, v30

    goto :goto_25

    :cond_15
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v84, v9

    goto :goto_24

    :goto_25
    invoke-interface {v3, v9}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    if-eqz v6, :cond_16

    const/16 v85, 0x1

    :goto_26
    move/from16 v6, v31

    goto :goto_27

    :cond_16
    const/16 v85, 0x0

    goto :goto_26

    :goto_27
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_17

    move-object/from16 v7, v56

    :goto_28
    move/from16 v31, v6

    goto :goto_29

    :cond_17
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v30

    invoke-static/range {v30 .. v31}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_28

    :goto_29
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v86

    move/from16 v6, v32

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_18

    move-object/from16 v7, v56

    :goto_2a
    move/from16 v32, v6

    goto :goto_2b

    :cond_18
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v87

    invoke-static/range {v87 .. v88}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_2a

    :goto_2b
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v87

    move/from16 v6, v33

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_19

    move-object/from16 v88, v56

    :goto_2c
    move/from16 v7, v34

    goto :goto_2d

    :cond_19
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v88, v7

    goto :goto_2c

    :goto_2d
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v28

    if-eqz v28, :cond_1a

    move/from16 v33, v6

    move-object/from16 v6, v56

    :goto_2e
    move/from16 v34, v7

    goto :goto_2f

    :cond_1a
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v28

    move/from16 v33, v6

    move-object/from16 v6, v28

    goto :goto_2e

    :goto_2f
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v89

    if-eqz v89, :cond_31

    move/from16 v28, v8

    move/from16 v6, v35

    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_1b

    const/16 v90, 0x1

    :goto_30
    move/from16 v30, v9

    move/from16 v7, v36

    goto :goto_31

    :cond_1b
    const/16 v90, 0x0

    goto :goto_30

    :goto_31
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_1c

    const/16 v91, 0x1

    :goto_32
    move/from16 v8, v37

    goto :goto_33

    :cond_1c
    const/16 v91, 0x0

    goto :goto_32

    :goto_33
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1d

    move-object/from16 v9, v56

    :goto_34
    move/from16 v35, v6

    goto :goto_35

    :cond_1d
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_34

    :goto_35
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationDetailsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;->stringToModerationDetails(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-result-object v92

    move/from16 v6, v38

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1e

    move-object/from16 v9, v56

    :goto_36
    move/from16 v38, v6

    goto :goto_37

    :cond_1e
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_36

    :goto_37
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;->stringToModeration(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    move-result-object v93

    move/from16 v6, v39

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1f

    move-object/from16 v9, v56

    :goto_38
    move/from16 v39, v6

    goto :goto_39

    :cond_1f
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v36

    invoke-static/range {v36 .. v37}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    goto :goto_38

    :goto_39
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v94

    move/from16 v6, v40

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_20

    move-object/from16 v95, v56

    :goto_3a
    move/from16 v9, v41

    goto :goto_3b

    :cond_20
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v95, v9

    goto :goto_3a

    :goto_3b
    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v36

    if-eqz v36, :cond_21

    move/from16 v40, v6

    move-object/from16 v6, v56

    :goto_3c
    move/from16 v36, v7

    goto :goto_3d

    :cond_21
    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v36

    move/from16 v40, v6

    move-object/from16 v6, v36

    goto :goto_3c

    :goto_3d
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v96

    if-eqz v96, :cond_30

    move/from16 v6, v42

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_22

    move-object/from16 v4, v56

    goto :goto_3e

    :cond_22
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    :goto_3e
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reminderInfoConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    invoke-virtual {v7, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;->stringToReminderInfo(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-result-object v97

    move/from16 v4, v43

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_23

    move-object/from16 v7, v56

    :goto_3f
    move/from16 v43, v4

    goto :goto_40

    :cond_23
    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_3f

    :goto_40
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    invoke-virtual {v4, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;->stringToLocation(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    move-result-object v98

    move/from16 v4, v44

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_24

    move-object/from16 v99, v56

    :goto_41
    move/from16 v37, v8

    move/from16 v41, v9

    move/from16 v7, v45

    goto :goto_42

    :cond_24
    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v99, v7

    goto :goto_41

    :goto_42
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_25

    const/16 v100, 0x1

    :goto_43
    move/from16 v8, v46

    goto :goto_44

    :cond_25
    const/16 v100, 0x0

    goto :goto_43

    :goto_44
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_2a

    move/from16 v9, v47

    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v42

    if-eqz v42, :cond_29

    move/from16 v0, v48

    invoke-interface {v3, v0}, Ltb/c;->isNull(I)Z

    move-result v42

    if-eqz v42, :cond_28

    move/from16 v44, v4

    move/from16 v4, v49

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v42

    if-eqz v42, :cond_27

    move/from16 v42, v6

    move/from16 v6, v50

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v45

    if-nez v45, :cond_26

    goto :goto_48

    :cond_26
    move/from16 v45, v7

    move/from16 v46, v8

    move-object/from16 v81, v56

    goto/16 :goto_4f

    :cond_27
    move/from16 v42, v6

    :goto_45
    move/from16 v6, v50

    goto :goto_48

    :cond_28
    move/from16 v44, v4

    move/from16 v42, v6

    :goto_46
    move/from16 v4, v49

    goto :goto_45

    :cond_29
    move/from16 v44, v4

    move/from16 v42, v6

    :goto_47
    move/from16 v0, v48

    goto :goto_46

    :cond_2a
    move/from16 v44, v4

    move/from16 v42, v6

    move/from16 v9, v47

    goto :goto_47

    :goto_48
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2b

    move-object/from16 v104, v56

    goto :goto_49

    :cond_2b
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v45

    move-object/from16 v104, v45

    :goto_49
    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2c

    move-object/from16 v105, v56

    goto :goto_4a

    :cond_2c
    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v45

    move-object/from16 v105, v45

    :goto_4a
    invoke-interface {v3, v0}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2d

    move-object/from16 v106, v56

    goto :goto_4b

    :cond_2d
    invoke-interface {v3, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v45

    move-object/from16 v106, v45

    :goto_4b
    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2e

    move/from16 v45, v7

    move/from16 v46, v8

    move-object/from16 v107, v56

    goto :goto_4c

    :cond_2e
    move/from16 v45, v7

    move/from16 v46, v8

    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object/from16 v107, v7

    :goto_4c
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_2f

    :goto_4d
    move-object/from16 v108, v56

    goto :goto_4e

    :cond_2f
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v56

    goto :goto_4d

    :goto_4e
    new-instance v103, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    invoke-direct/range {v103 .. v108}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    move-object/from16 v81, v103

    :goto_4f
    new-instance v56, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    invoke-direct/range {v56 .. v100}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)V

    move-object/from16 v7, v56

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v2}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v8

    move/from16 v48, v0

    move-object/from16 v0, v16

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Ljava/util/List;

    move-object/from16 v16, v2

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v15}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/List;

    move/from16 v49, v4

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v14}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/util/List;

    move-object/from16 v47, v0

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-direct {v0, v7, v8, v2, v4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p3

    move/from16 v50, v6

    move v7, v13

    move-object/from16 v2, v16

    move-object/from16 v16, v47

    move/from16 v8, v55

    move/from16 v6, p4

    move/from16 v47, v9

    move/from16 v55, v18

    move/from16 v18, v53

    move/from16 v9, v101

    move/from16 v53, v20

    move/from16 v20, v102

    goto/16 :goto_2

    :cond_30
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_31
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_32
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_33
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.String>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_35
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_37
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_39
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    return-object v1

    :goto_50
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final messagesForChannelEqualOrNewerThan$lambda$11(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;ILtb/a;)Ljava/util/List;
    .locals 107

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p5

    const-string v3, "getValue(...)"

    const-string v4, "_connection"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p0

    invoke-interface {v2, v4}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v4

    const/4 v5, 0x1

    move-object/from16 v6, p1

    :try_start_0
    invoke-interface {v4, v5, v6}, Ltb/c;->L(ILjava/lang/String;)V

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v6

    const/4 v7, 0x2

    if-nez v6, :cond_0

    invoke-interface {v4, v7}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_51

    :cond_0
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-interface {v4, v7, v8, v9}, Ltb/c;->p(IJ)V

    :goto_0
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v1

    const/4 v6, 0x3

    if-nez v1, :cond_1

    invoke-interface {v4, v6}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-interface {v4, v6, v7, v8}, Ltb/c;->p(IJ)V

    :goto_1
    const/4 v1, 0x4

    move/from16 v6, p4

    int-to-long v6, v6

    invoke-interface {v4, v1, v6, v7}, Ltb/c;->p(IJ)V

    const-string v1, "id"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    const-string v6, "cid"

    invoke-static {v4, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "userId"

    invoke-static {v4, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "text"

    invoke-static {v4, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "html"

    invoke-static {v4, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "type"

    invoke-static {v4, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "syncStatus"

    invoke-static {v4, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "replyCount"

    invoke-static {v4, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "deletedReplyCount"

    invoke-static {v4, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "createdAt"

    invoke-static {v4, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "createdLocallyAt"

    invoke-static {v4, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v5, "updatedAt"

    invoke-static {v4, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    move-object/from16 v16, v3

    const-string v3, "updatedLocallyAt"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p1, v3

    const-string v3, "deletedAt"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p3, v3

    const-string v3, "remoteMentionedUserIds"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p4, v3

    const-string v3, "mentionedUsersId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v17, v3

    const-string v3, "reactionCounts"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v18, v3

    const-string v3, "reactionScores"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v19, v3

    const-string v3, "reactionGroups"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v20, v3

    const-string v3, "parentId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v21, v3

    const-string v3, "command"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v22, v3

    const-string v3, "shadowed"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v23, v3

    const-string v3, "i18n"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v24, v3

    const-string v3, "showInChannel"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v25, v3

    const-string v3, "silent"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v26, v3

    const-string v3, "extraData"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v27, v3

    const-string v3, "replyToId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v28, v3

    const-string v3, "pinned"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v29, v3

    const-string v3, "pinnedAt"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v30, v3

    const-string v3, "pinExpires"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v31, v3

    const-string v3, "pinnedByUserId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v32, v3

    const-string v3, "threadParticipantsIds"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v33, v3

    const-string v3, "skipPushNotification"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v34, v3

    const-string v3, "skipEnrichUrl"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v35, v3

    const-string v3, "moderationDetails"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v36, v3

    const-string v3, "moderation"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v37, v3

    const-string v3, "messageTextUpdatedAt"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v38, v3

    const-string v3, "pollId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v39, v3

    const-string v3, "restrictedVisibility"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v40, v3

    const-string v3, "reminder"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v41, v3

    const-string v3, "sharedLocation"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v42, v3

    const-string v3, "channelRole"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v43, v3

    const-string v3, "deletedForMe"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v44, v3

    const-string v3, "channel_infocid"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v45, v3

    const-string v3, "channel_infoid"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v46, v3

    const-string v3, "channel_infotype"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v47, v3

    const-string v3, "channel_infomemberCount"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v48, v3

    const-string v3, "channel_infoname"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v49, v3

    new-instance v3, La0/g;

    move/from16 v50, v5

    const/4 v5, 0x0

    invoke-direct {v3, v5}, La0/f1;-><init>(I)V

    move/from16 v51, v15

    new-instance v15, La0/g;

    invoke-direct {v15, v5}, La0/f1;-><init>(I)V

    move/from16 v52, v14

    new-instance v14, La0/g;

    invoke-direct {v14, v5}, La0/f1;-><init>(I)V

    :goto_2
    invoke-interface {v4}, Ltb/c;->e1()Z

    move-result v53

    if-eqz v53, :cond_5

    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v54

    if-nez v54, :cond_2

    move/from16 v54, v13

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, v5, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_2
    move/from16 v54, v13

    :goto_3
    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v15, v5}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v15, v5, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v14, v5}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_4

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v14, v5, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    move/from16 v13, v54

    const/4 v5, 0x0

    goto :goto_2

    :cond_5
    move/from16 v54, v13

    invoke-interface {v4}, Ltb/c;->reset()V

    invoke-direct {v0, v2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v2, v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v2, v14}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_4
    invoke-interface {v4}, Ltb/c;->e1()Z

    move-result v5

    if-eqz v5, :cond_3b

    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v56

    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v57

    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v58

    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v59

    invoke-interface {v4, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v60

    invoke-interface {v4, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v61

    move v13, v6

    invoke-interface {v4, v11}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v62

    invoke-interface {v4, v12}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    move/from16 v100, v8

    move/from16 v6, v54

    move/from16 v54, v7

    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    move/from16 v8, v52

    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v52

    const/16 v55, 0x0

    if-eqz v52, :cond_6

    move/from16 v63, v5

    move-object/from16 v5, v55

    :goto_5
    move/from16 v52, v6

    goto :goto_6

    :cond_6
    invoke-interface {v4, v8}, Ltb/c;->getLong(I)J

    move-result-wide v63

    invoke-static/range {v63 .. v64}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v52

    move/from16 v63, v5

    move-object/from16 v5, v52

    goto :goto_5

    :goto_6
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v65

    move/from16 v5, v51

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_7

    move-object/from16 v6, v55

    :goto_7
    move/from16 v51, v5

    goto :goto_8

    :cond_7
    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v66

    invoke-static/range {v66 .. v67}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_7

    :goto_8
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v66

    move/from16 v5, v50

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_8

    move-object/from16 v6, v55

    :goto_9
    move/from16 v50, v5

    goto :goto_a

    :cond_8
    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v67

    invoke-static/range {v67 .. v68}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_9

    :goto_a
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v67

    move/from16 v5, p1

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_9

    move-object/from16 v6, v55

    :goto_b
    move/from16 p1, v5

    goto :goto_c

    :cond_9
    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v68

    invoke-static/range {v68 .. v69}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_b

    :goto_c
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v68

    move/from16 v5, p3

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_a

    move-object/from16 v6, v55

    :goto_d
    move/from16 p3, v5

    goto :goto_e

    :cond_a
    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v69

    invoke-static/range {v69 .. v70}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_d

    :goto_e
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v69

    move/from16 v5, p4

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_b

    move-object/from16 v6, v55

    :goto_f
    move/from16 p4, v5

    goto :goto_10

    :cond_b
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_f

    :goto_10
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v70
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    if-eqz v70, :cond_3a

    move/from16 v6, v17

    :try_start_1
    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_c

    move/from16 p5, v6

    move-object/from16 v6, v55

    :goto_11
    move/from16 v64, v7

    goto :goto_12

    :cond_c
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v17

    move/from16 p5, v6

    move-object/from16 v6, v17

    goto :goto_11

    :goto_12
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v71

    if-eqz v71, :cond_39

    move/from16 v6, v18

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_d

    move-object/from16 v7, v55

    :goto_13
    move/from16 v18, v6

    goto :goto_14

    :cond_d
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_13

    :goto_14
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v72
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v6, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Int>\', but it was NULL."

    if-eqz v72, :cond_38

    move/from16 v7, v19

    :try_start_2
    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_e

    move/from16 v19, v7

    move-object/from16 v7, v55

    :goto_15
    move/from16 v17, v8

    goto :goto_16

    :cond_e
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v17

    move/from16 v19, v7

    move-object/from16 v7, v17

    goto :goto_15

    :goto_16
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v73

    if-eqz v73, :cond_37

    move/from16 v7, v20

    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_f

    move-object/from16 v6, v55

    goto :goto_17

    :cond_f
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_17
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reactionGroupConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;

    invoke-virtual {v8, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;->stringToReactionGroupEntityMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v74

    if-eqz v74, :cond_36

    move/from16 v6, v21

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_10

    move-object/from16 v75, v55

    :goto_18
    move/from16 v8, v22

    goto :goto_19

    :cond_10
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v75, v8

    goto :goto_18

    :goto_19
    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v20

    if-eqz v20, :cond_11

    move-object/from16 v76, v55

    move/from16 v21, v6

    move/from16 v20, v7

    move/from16 v22, v8

    move/from16 v6, v23

    goto :goto_1a

    :cond_11
    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v76, v20

    move/from16 v21, v6

    move/from16 v22, v8

    move/from16 v6, v23

    move/from16 v20, v7

    :goto_1a
    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_12

    const/16 v77, 0x1

    :goto_1b
    move/from16 v7, v24

    goto :goto_1c

    :cond_12
    const/16 v77, 0x0

    goto :goto_1b

    :goto_1c
    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_13

    move-object/from16 v8, v55

    :goto_1d
    move/from16 v23, v6

    goto :goto_1e

    :cond_13
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_1d

    :goto_1e
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToStringMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v78

    if-eqz v78, :cond_35

    move/from16 v24, v7

    move/from16 v6, v25

    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_14

    const/16 v79, 0x1

    :goto_1f
    move/from16 v25, v9

    move/from16 v7, v26

    goto :goto_20

    :cond_14
    const/16 v79, 0x0

    goto :goto_1f

    :goto_20
    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_15

    const/16 v81, 0x1

    :goto_21
    move/from16 v8, v27

    goto :goto_22

    :cond_15
    const/16 v81, 0x0

    goto :goto_21

    :goto_22
    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_16

    move-object/from16 v9, v55

    :goto_23
    move/from16 v26, v6

    goto :goto_24

    :cond_16
    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_23

    :goto_24
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v82

    if-eqz v82, :cond_34

    move/from16 v6, v28

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_17

    move-object/from16 v83, v55

    :goto_25
    move/from16 v28, v6

    move/from16 v27, v7

    move/from16 v9, v29

    goto :goto_26

    :cond_17
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v83, v9

    goto :goto_25

    :goto_26
    invoke-interface {v4, v9}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    if-eqz v6, :cond_18

    const/16 v84, 0x1

    :goto_27
    move/from16 v6, v30

    goto :goto_28

    :cond_18
    const/16 v84, 0x0

    goto :goto_27

    :goto_28
    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_19

    move-object/from16 v7, v55

    :goto_29
    move/from16 v30, v6

    goto :goto_2a

    :cond_19
    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v29

    invoke-static/range {v29 .. v30}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_29

    :goto_2a
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v85

    move/from16 v6, v31

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_1a

    move-object/from16 v7, v55

    :goto_2b
    move/from16 v31, v6

    goto :goto_2c

    :cond_1a
    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v86

    invoke-static/range {v86 .. v87}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_2b

    :goto_2c
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v86

    move/from16 v6, v32

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_1b

    move-object/from16 v87, v55

    :goto_2d
    move/from16 v7, v33

    goto :goto_2e

    :cond_1b
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v87, v7

    goto :goto_2d

    :goto_2e
    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v29

    if-eqz v29, :cond_1c

    move/from16 v32, v6

    move-object/from16 v6, v55

    :goto_2f
    move/from16 v33, v7

    goto :goto_30

    :cond_1c
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v29

    move/from16 v32, v6

    move-object/from16 v6, v29

    goto :goto_2f

    :goto_30
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v88

    if-eqz v88, :cond_33

    move/from16 v29, v8

    move/from16 v6, v34

    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_1d

    const/16 v89, 0x1

    :goto_31
    move/from16 v34, v9

    move/from16 v7, v35

    goto :goto_32

    :cond_1d
    const/16 v89, 0x0

    goto :goto_31

    :goto_32
    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_1e

    const/16 v90, 0x1

    :goto_33
    move/from16 v8, v36

    goto :goto_34

    :cond_1e
    const/16 v90, 0x0

    goto :goto_33

    :goto_34
    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1f

    move-object/from16 v9, v55

    :goto_35
    move/from16 v35, v6

    goto :goto_36

    :cond_1f
    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_35

    :goto_36
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationDetailsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;->stringToModerationDetails(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-result-object v91

    move/from16 v6, v37

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_20

    move-object/from16 v9, v55

    :goto_37
    move/from16 v37, v6

    goto :goto_38

    :cond_20
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_37

    :goto_38
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;->stringToModeration(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    move-result-object v92

    move/from16 v6, v38

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_21

    move-object/from16 v9, v55

    :goto_39
    move/from16 v38, v6

    goto :goto_3a

    :cond_21
    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v93

    invoke-static/range {v93 .. v94}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    goto :goto_39

    :goto_3a
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v93

    move/from16 v6, v39

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_22

    move-object/from16 v94, v55

    :goto_3b
    move/from16 v9, v40

    goto :goto_3c

    :cond_22
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v94, v9

    goto :goto_3b

    :goto_3c
    invoke-interface {v4, v9}, Ltb/c;->isNull(I)Z

    move-result v36

    if-eqz v36, :cond_23

    move/from16 v39, v6

    move-object/from16 v6, v55

    :goto_3d
    move/from16 v36, v7

    goto :goto_3e

    :cond_23
    invoke-interface {v4, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v36

    move/from16 v39, v6

    move-object/from16 v6, v36

    goto :goto_3d

    :goto_3e
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v95

    if-eqz v95, :cond_32

    move/from16 v6, v41

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_24

    move-object/from16 v5, v55

    goto :goto_3f

    :cond_24
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    :goto_3f
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reminderInfoConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    invoke-virtual {v7, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;->stringToReminderInfo(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-result-object v96

    move/from16 v5, v42

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_25

    move-object/from16 v7, v55

    :goto_40
    move/from16 v42, v5

    goto :goto_41

    :cond_25
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_40

    :goto_41
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    invoke-virtual {v5, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;->stringToLocation(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    move-result-object v97

    move/from16 v5, v43

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_26

    move-object/from16 v98, v55

    :goto_42
    move/from16 v43, v5

    move/from16 v41, v6

    move/from16 v7, v44

    goto :goto_43

    :cond_26
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v98, v7

    goto :goto_42

    :goto_43
    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    if-eqz v5, :cond_27

    const/16 v99, 0x1

    :goto_44
    move/from16 v5, v45

    goto :goto_45

    :cond_27
    const/16 v99, 0x0

    goto :goto_44

    :goto_45
    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_2c

    move/from16 v6, v46

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v40

    if-eqz v40, :cond_2b

    move/from16 v0, v47

    invoke-interface {v4, v0}, Ltb/c;->isNull(I)Z

    move-result v40

    if-eqz v40, :cond_2a

    move/from16 v44, v7

    move/from16 v7, v48

    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v40

    if-eqz v40, :cond_29

    move/from16 v40, v8

    move/from16 v8, v49

    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v45

    if-nez v45, :cond_28

    goto :goto_49

    :cond_28
    move/from16 v45, v5

    move/from16 v46, v6

    move-object/from16 v80, v55

    goto/16 :goto_50

    :cond_29
    move/from16 v40, v8

    :goto_46
    move/from16 v8, v49

    goto :goto_49

    :cond_2a
    move/from16 v44, v7

    move/from16 v40, v8

    :goto_47
    move/from16 v7, v48

    goto :goto_46

    :cond_2b
    move/from16 v44, v7

    move/from16 v40, v8

    :goto_48
    move/from16 v0, v47

    goto :goto_47

    :cond_2c
    move/from16 v44, v7

    move/from16 v40, v8

    move/from16 v6, v46

    goto :goto_48

    :goto_49
    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2d

    move-object/from16 v102, v55

    goto :goto_4a

    :cond_2d
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v45

    move-object/from16 v102, v45

    :goto_4a
    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2e

    move-object/from16 v103, v55

    goto :goto_4b

    :cond_2e
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v45

    move-object/from16 v103, v45

    :goto_4b
    invoke-interface {v4, v0}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2f

    move-object/from16 v104, v55

    goto :goto_4c

    :cond_2f
    invoke-interface {v4, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v45

    move-object/from16 v104, v45

    :goto_4c
    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_30

    move/from16 v45, v5

    move/from16 v46, v6

    move-object/from16 v105, v55

    goto :goto_4d

    :cond_30
    move/from16 v45, v5

    move/from16 v46, v6

    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v105, v5

    :goto_4d
    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_31

    :goto_4e
    move-object/from16 v106, v55

    goto :goto_4f

    :cond_31
    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v55

    goto :goto_4e

    :goto_4f
    new-instance v101, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    invoke-direct/range {v101 .. v106}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    move-object/from16 v80, v101

    :goto_50
    new-instance v55, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    invoke-direct/range {v55 .. v99}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)V

    move-object/from16 v5, v55

    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    move/from16 v47, v0

    move-object/from16 v0, v16

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/util/List;

    move-object/from16 v16, v3

    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v15}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/util/List;

    move/from16 v48, v7

    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v14}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/util/List;

    move-object/from16 v49, v0

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-direct {v0, v5, v6, v3, v7}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, v40

    move/from16 v40, v9

    move/from16 v9, v25

    move/from16 v25, v26

    move/from16 v26, v27

    move/from16 v27, v29

    move/from16 v29, v34

    move/from16 v34, v35

    move/from16 v35, v36

    move/from16 v36, v0

    move-object/from16 v0, p2

    move v6, v13

    move-object/from16 v3, v16

    move-object/from16 v16, v49

    move/from16 v7, v54

    move/from16 v49, v8

    move/from16 v54, v52

    move/from16 v8, v100

    move/from16 v52, v17

    move/from16 v17, p5

    goto/16 :goto_4

    :cond_32
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_33
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_35
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.String>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_37
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_39
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3b
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    return-object v2

    :goto_51
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final messagesForChannelEqualOrOlderThan$lambda$13(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;ILtb/a;)Ljava/util/List;
    .locals 107

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p5

    const-string v3, "getValue(...)"

    const-string v4, "_connection"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p0

    invoke-interface {v2, v4}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v4

    const/4 v5, 0x1

    move-object/from16 v6, p1

    :try_start_0
    invoke-interface {v4, v5, v6}, Ltb/c;->L(ILjava/lang/String;)V

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v6

    const/4 v7, 0x2

    if-nez v6, :cond_0

    invoke-interface {v4, v7}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_51

    :cond_0
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-interface {v4, v7, v8, v9}, Ltb/c;->p(IJ)V

    :goto_0
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v1

    const/4 v6, 0x3

    if-nez v1, :cond_1

    invoke-interface {v4, v6}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-interface {v4, v6, v7, v8}, Ltb/c;->p(IJ)V

    :goto_1
    const/4 v1, 0x4

    move/from16 v6, p4

    int-to-long v6, v6

    invoke-interface {v4, v1, v6, v7}, Ltb/c;->p(IJ)V

    const-string v1, "id"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    const-string v6, "cid"

    invoke-static {v4, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "userId"

    invoke-static {v4, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "text"

    invoke-static {v4, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "html"

    invoke-static {v4, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "type"

    invoke-static {v4, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "syncStatus"

    invoke-static {v4, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "replyCount"

    invoke-static {v4, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "deletedReplyCount"

    invoke-static {v4, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "createdAt"

    invoke-static {v4, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "createdLocallyAt"

    invoke-static {v4, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v5, "updatedAt"

    invoke-static {v4, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    move-object/from16 v16, v3

    const-string v3, "updatedLocallyAt"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p1, v3

    const-string v3, "deletedAt"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p3, v3

    const-string v3, "remoteMentionedUserIds"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p4, v3

    const-string v3, "mentionedUsersId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v17, v3

    const-string v3, "reactionCounts"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v18, v3

    const-string v3, "reactionScores"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v19, v3

    const-string v3, "reactionGroups"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v20, v3

    const-string v3, "parentId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v21, v3

    const-string v3, "command"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v22, v3

    const-string v3, "shadowed"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v23, v3

    const-string v3, "i18n"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v24, v3

    const-string v3, "showInChannel"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v25, v3

    const-string v3, "silent"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v26, v3

    const-string v3, "extraData"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v27, v3

    const-string v3, "replyToId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v28, v3

    const-string v3, "pinned"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v29, v3

    const-string v3, "pinnedAt"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v30, v3

    const-string v3, "pinExpires"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v31, v3

    const-string v3, "pinnedByUserId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v32, v3

    const-string v3, "threadParticipantsIds"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v33, v3

    const-string v3, "skipPushNotification"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v34, v3

    const-string v3, "skipEnrichUrl"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v35, v3

    const-string v3, "moderationDetails"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v36, v3

    const-string v3, "moderation"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v37, v3

    const-string v3, "messageTextUpdatedAt"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v38, v3

    const-string v3, "pollId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v39, v3

    const-string v3, "restrictedVisibility"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v40, v3

    const-string v3, "reminder"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v41, v3

    const-string v3, "sharedLocation"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v42, v3

    const-string v3, "channelRole"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v43, v3

    const-string v3, "deletedForMe"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v44, v3

    const-string v3, "channel_infocid"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v45, v3

    const-string v3, "channel_infoid"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v46, v3

    const-string v3, "channel_infotype"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v47, v3

    const-string v3, "channel_infomemberCount"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v48, v3

    const-string v3, "channel_infoname"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v49, v3

    new-instance v3, La0/g;

    move/from16 v50, v5

    const/4 v5, 0x0

    invoke-direct {v3, v5}, La0/f1;-><init>(I)V

    move/from16 v51, v15

    new-instance v15, La0/g;

    invoke-direct {v15, v5}, La0/f1;-><init>(I)V

    move/from16 v52, v14

    new-instance v14, La0/g;

    invoke-direct {v14, v5}, La0/f1;-><init>(I)V

    :goto_2
    invoke-interface {v4}, Ltb/c;->e1()Z

    move-result v53

    if-eqz v53, :cond_5

    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v54

    if-nez v54, :cond_2

    move/from16 v54, v13

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, v5, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_2
    move/from16 v54, v13

    :goto_3
    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v15, v5}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v15, v5, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v14, v5}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_4

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v14, v5, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    move/from16 v13, v54

    const/4 v5, 0x0

    goto :goto_2

    :cond_5
    move/from16 v54, v13

    invoke-interface {v4}, Ltb/c;->reset()V

    invoke-direct {v0, v2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v2, v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v2, v14}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_4
    invoke-interface {v4}, Ltb/c;->e1()Z

    move-result v5

    if-eqz v5, :cond_3b

    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v56

    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v57

    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v58

    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v59

    invoke-interface {v4, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v60

    invoke-interface {v4, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v61

    move v13, v6

    invoke-interface {v4, v11}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v62

    invoke-interface {v4, v12}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    move/from16 v100, v8

    move/from16 v6, v54

    move/from16 v54, v7

    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    move/from16 v8, v52

    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v52

    const/16 v55, 0x0

    if-eqz v52, :cond_6

    move/from16 v63, v5

    move-object/from16 v5, v55

    :goto_5
    move/from16 v52, v6

    goto :goto_6

    :cond_6
    invoke-interface {v4, v8}, Ltb/c;->getLong(I)J

    move-result-wide v63

    invoke-static/range {v63 .. v64}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v52

    move/from16 v63, v5

    move-object/from16 v5, v52

    goto :goto_5

    :goto_6
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v65

    move/from16 v5, v51

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_7

    move-object/from16 v6, v55

    :goto_7
    move/from16 v51, v5

    goto :goto_8

    :cond_7
    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v66

    invoke-static/range {v66 .. v67}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_7

    :goto_8
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v66

    move/from16 v5, v50

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_8

    move-object/from16 v6, v55

    :goto_9
    move/from16 v50, v5

    goto :goto_a

    :cond_8
    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v67

    invoke-static/range {v67 .. v68}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_9

    :goto_a
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v67

    move/from16 v5, p1

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_9

    move-object/from16 v6, v55

    :goto_b
    move/from16 p1, v5

    goto :goto_c

    :cond_9
    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v68

    invoke-static/range {v68 .. v69}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_b

    :goto_c
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v68

    move/from16 v5, p3

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_a

    move-object/from16 v6, v55

    :goto_d
    move/from16 p3, v5

    goto :goto_e

    :cond_a
    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v69

    invoke-static/range {v69 .. v70}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_d

    :goto_e
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v69

    move/from16 v5, p4

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_b

    move-object/from16 v6, v55

    :goto_f
    move/from16 p4, v5

    goto :goto_10

    :cond_b
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_f

    :goto_10
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v70
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    if-eqz v70, :cond_3a

    move/from16 v6, v17

    :try_start_1
    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_c

    move/from16 p5, v6

    move-object/from16 v6, v55

    :goto_11
    move/from16 v64, v7

    goto :goto_12

    :cond_c
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v17

    move/from16 p5, v6

    move-object/from16 v6, v17

    goto :goto_11

    :goto_12
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v71

    if-eqz v71, :cond_39

    move/from16 v6, v18

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_d

    move-object/from16 v7, v55

    :goto_13
    move/from16 v18, v6

    goto :goto_14

    :cond_d
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_13

    :goto_14
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v72
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v6, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Int>\', but it was NULL."

    if-eqz v72, :cond_38

    move/from16 v7, v19

    :try_start_2
    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_e

    move/from16 v19, v7

    move-object/from16 v7, v55

    :goto_15
    move/from16 v17, v8

    goto :goto_16

    :cond_e
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v17

    move/from16 v19, v7

    move-object/from16 v7, v17

    goto :goto_15

    :goto_16
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v73

    if-eqz v73, :cond_37

    move/from16 v7, v20

    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_f

    move-object/from16 v6, v55

    goto :goto_17

    :cond_f
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_17
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reactionGroupConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;

    invoke-virtual {v8, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;->stringToReactionGroupEntityMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v74

    if-eqz v74, :cond_36

    move/from16 v6, v21

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_10

    move-object/from16 v75, v55

    :goto_18
    move/from16 v8, v22

    goto :goto_19

    :cond_10
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v75, v8

    goto :goto_18

    :goto_19
    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v20

    if-eqz v20, :cond_11

    move-object/from16 v76, v55

    move/from16 v21, v6

    move/from16 v20, v7

    move/from16 v22, v8

    move/from16 v6, v23

    goto :goto_1a

    :cond_11
    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v76, v20

    move/from16 v21, v6

    move/from16 v22, v8

    move/from16 v6, v23

    move/from16 v20, v7

    :goto_1a
    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_12

    const/16 v77, 0x1

    :goto_1b
    move/from16 v7, v24

    goto :goto_1c

    :cond_12
    const/16 v77, 0x0

    goto :goto_1b

    :goto_1c
    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_13

    move-object/from16 v8, v55

    :goto_1d
    move/from16 v23, v6

    goto :goto_1e

    :cond_13
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_1d

    :goto_1e
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToStringMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v78

    if-eqz v78, :cond_35

    move/from16 v24, v7

    move/from16 v6, v25

    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_14

    const/16 v79, 0x1

    :goto_1f
    move/from16 v25, v9

    move/from16 v7, v26

    goto :goto_20

    :cond_14
    const/16 v79, 0x0

    goto :goto_1f

    :goto_20
    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_15

    const/16 v81, 0x1

    :goto_21
    move/from16 v8, v27

    goto :goto_22

    :cond_15
    const/16 v81, 0x0

    goto :goto_21

    :goto_22
    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_16

    move-object/from16 v9, v55

    :goto_23
    move/from16 v26, v6

    goto :goto_24

    :cond_16
    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_23

    :goto_24
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v82

    if-eqz v82, :cond_34

    move/from16 v6, v28

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_17

    move-object/from16 v83, v55

    :goto_25
    move/from16 v28, v6

    move/from16 v27, v7

    move/from16 v9, v29

    goto :goto_26

    :cond_17
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v83, v9

    goto :goto_25

    :goto_26
    invoke-interface {v4, v9}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    if-eqz v6, :cond_18

    const/16 v84, 0x1

    :goto_27
    move/from16 v6, v30

    goto :goto_28

    :cond_18
    const/16 v84, 0x0

    goto :goto_27

    :goto_28
    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_19

    move-object/from16 v7, v55

    :goto_29
    move/from16 v30, v6

    goto :goto_2a

    :cond_19
    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v29

    invoke-static/range {v29 .. v30}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_29

    :goto_2a
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v85

    move/from16 v6, v31

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_1a

    move-object/from16 v7, v55

    :goto_2b
    move/from16 v31, v6

    goto :goto_2c

    :cond_1a
    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v86

    invoke-static/range {v86 .. v87}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_2b

    :goto_2c
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v86

    move/from16 v6, v32

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_1b

    move-object/from16 v87, v55

    :goto_2d
    move/from16 v7, v33

    goto :goto_2e

    :cond_1b
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v87, v7

    goto :goto_2d

    :goto_2e
    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v29

    if-eqz v29, :cond_1c

    move/from16 v32, v6

    move-object/from16 v6, v55

    :goto_2f
    move/from16 v33, v7

    goto :goto_30

    :cond_1c
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v29

    move/from16 v32, v6

    move-object/from16 v6, v29

    goto :goto_2f

    :goto_30
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v88

    if-eqz v88, :cond_33

    move/from16 v29, v8

    move/from16 v6, v34

    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_1d

    const/16 v89, 0x1

    :goto_31
    move/from16 v34, v9

    move/from16 v7, v35

    goto :goto_32

    :cond_1d
    const/16 v89, 0x0

    goto :goto_31

    :goto_32
    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_1e

    const/16 v90, 0x1

    :goto_33
    move/from16 v8, v36

    goto :goto_34

    :cond_1e
    const/16 v90, 0x0

    goto :goto_33

    :goto_34
    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1f

    move-object/from16 v9, v55

    :goto_35
    move/from16 v35, v6

    goto :goto_36

    :cond_1f
    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_35

    :goto_36
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationDetailsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;->stringToModerationDetails(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-result-object v91

    move/from16 v6, v37

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_20

    move-object/from16 v9, v55

    :goto_37
    move/from16 v37, v6

    goto :goto_38

    :cond_20
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_37

    :goto_38
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;->stringToModeration(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    move-result-object v92

    move/from16 v6, v38

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_21

    move-object/from16 v9, v55

    :goto_39
    move/from16 v38, v6

    goto :goto_3a

    :cond_21
    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v93

    invoke-static/range {v93 .. v94}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    goto :goto_39

    :goto_3a
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v93

    move/from16 v6, v39

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_22

    move-object/from16 v94, v55

    :goto_3b
    move/from16 v9, v40

    goto :goto_3c

    :cond_22
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v94, v9

    goto :goto_3b

    :goto_3c
    invoke-interface {v4, v9}, Ltb/c;->isNull(I)Z

    move-result v36

    if-eqz v36, :cond_23

    move/from16 v39, v6

    move-object/from16 v6, v55

    :goto_3d
    move/from16 v36, v7

    goto :goto_3e

    :cond_23
    invoke-interface {v4, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v36

    move/from16 v39, v6

    move-object/from16 v6, v36

    goto :goto_3d

    :goto_3e
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v95

    if-eqz v95, :cond_32

    move/from16 v6, v41

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_24

    move-object/from16 v5, v55

    goto :goto_3f

    :cond_24
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    :goto_3f
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reminderInfoConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    invoke-virtual {v7, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;->stringToReminderInfo(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-result-object v96

    move/from16 v5, v42

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_25

    move-object/from16 v7, v55

    :goto_40
    move/from16 v42, v5

    goto :goto_41

    :cond_25
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_40

    :goto_41
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    invoke-virtual {v5, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;->stringToLocation(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    move-result-object v97

    move/from16 v5, v43

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_26

    move-object/from16 v98, v55

    :goto_42
    move/from16 v43, v5

    move/from16 v41, v6

    move/from16 v7, v44

    goto :goto_43

    :cond_26
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v98, v7

    goto :goto_42

    :goto_43
    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    if-eqz v5, :cond_27

    const/16 v99, 0x1

    :goto_44
    move/from16 v5, v45

    goto :goto_45

    :cond_27
    const/16 v99, 0x0

    goto :goto_44

    :goto_45
    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_2c

    move/from16 v6, v46

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v40

    if-eqz v40, :cond_2b

    move/from16 v0, v47

    invoke-interface {v4, v0}, Ltb/c;->isNull(I)Z

    move-result v40

    if-eqz v40, :cond_2a

    move/from16 v44, v7

    move/from16 v7, v48

    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v40

    if-eqz v40, :cond_29

    move/from16 v40, v8

    move/from16 v8, v49

    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v45

    if-nez v45, :cond_28

    goto :goto_49

    :cond_28
    move/from16 v45, v5

    move/from16 v46, v6

    move-object/from16 v80, v55

    goto/16 :goto_50

    :cond_29
    move/from16 v40, v8

    :goto_46
    move/from16 v8, v49

    goto :goto_49

    :cond_2a
    move/from16 v44, v7

    move/from16 v40, v8

    :goto_47
    move/from16 v7, v48

    goto :goto_46

    :cond_2b
    move/from16 v44, v7

    move/from16 v40, v8

    :goto_48
    move/from16 v0, v47

    goto :goto_47

    :cond_2c
    move/from16 v44, v7

    move/from16 v40, v8

    move/from16 v6, v46

    goto :goto_48

    :goto_49
    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2d

    move-object/from16 v102, v55

    goto :goto_4a

    :cond_2d
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v45

    move-object/from16 v102, v45

    :goto_4a
    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2e

    move-object/from16 v103, v55

    goto :goto_4b

    :cond_2e
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v45

    move-object/from16 v103, v45

    :goto_4b
    invoke-interface {v4, v0}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2f

    move-object/from16 v104, v55

    goto :goto_4c

    :cond_2f
    invoke-interface {v4, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v45

    move-object/from16 v104, v45

    :goto_4c
    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_30

    move/from16 v45, v5

    move/from16 v46, v6

    move-object/from16 v105, v55

    goto :goto_4d

    :cond_30
    move/from16 v45, v5

    move/from16 v46, v6

    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v105, v5

    :goto_4d
    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_31

    :goto_4e
    move-object/from16 v106, v55

    goto :goto_4f

    :cond_31
    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v55

    goto :goto_4e

    :goto_4f
    new-instance v101, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    invoke-direct/range {v101 .. v106}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    move-object/from16 v80, v101

    :goto_50
    new-instance v55, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    invoke-direct/range {v55 .. v99}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)V

    move-object/from16 v5, v55

    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    move/from16 v47, v0

    move-object/from16 v0, v16

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/util/List;

    move-object/from16 v16, v3

    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v15}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/util/List;

    move/from16 v48, v7

    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v14}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/util/List;

    move-object/from16 v49, v0

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-direct {v0, v5, v6, v3, v7}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, v40

    move/from16 v40, v9

    move/from16 v9, v25

    move/from16 v25, v26

    move/from16 v26, v27

    move/from16 v27, v29

    move/from16 v29, v34

    move/from16 v34, v35

    move/from16 v35, v36

    move/from16 v36, v0

    move-object/from16 v0, p2

    move v6, v13

    move-object/from16 v3, v16

    move-object/from16 v16, v49

    move/from16 v7, v54

    move/from16 v49, v8

    move/from16 v54, v52

    move/from16 v8, v100

    move/from16 v52, v17

    move/from16 v17, p5

    goto/16 :goto_4

    :cond_32
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_33
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_35
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.String>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_37
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_39
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3b
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    return-object v2

    :goto_51
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final messagesForChannelNewerThan$lambda$10(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;ILtb/a;)Ljava/util/List;
    .locals 107

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p5

    const-string v3, "getValue(...)"

    const-string v4, "_connection"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p0

    invoke-interface {v2, v4}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v4

    const/4 v5, 0x1

    move-object/from16 v6, p1

    :try_start_0
    invoke-interface {v4, v5, v6}, Ltb/c;->L(ILjava/lang/String;)V

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v6

    const/4 v7, 0x2

    if-nez v6, :cond_0

    invoke-interface {v4, v7}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_51

    :cond_0
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-interface {v4, v7, v8, v9}, Ltb/c;->p(IJ)V

    :goto_0
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v1

    const/4 v6, 0x3

    if-nez v1, :cond_1

    invoke-interface {v4, v6}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-interface {v4, v6, v7, v8}, Ltb/c;->p(IJ)V

    :goto_1
    const/4 v1, 0x4

    move/from16 v6, p4

    int-to-long v6, v6

    invoke-interface {v4, v1, v6, v7}, Ltb/c;->p(IJ)V

    const-string v1, "id"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    const-string v6, "cid"

    invoke-static {v4, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "userId"

    invoke-static {v4, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "text"

    invoke-static {v4, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "html"

    invoke-static {v4, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "type"

    invoke-static {v4, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "syncStatus"

    invoke-static {v4, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "replyCount"

    invoke-static {v4, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "deletedReplyCount"

    invoke-static {v4, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "createdAt"

    invoke-static {v4, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "createdLocallyAt"

    invoke-static {v4, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v5, "updatedAt"

    invoke-static {v4, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    move-object/from16 v16, v3

    const-string v3, "updatedLocallyAt"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p1, v3

    const-string v3, "deletedAt"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p3, v3

    const-string v3, "remoteMentionedUserIds"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p4, v3

    const-string v3, "mentionedUsersId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v17, v3

    const-string v3, "reactionCounts"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v18, v3

    const-string v3, "reactionScores"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v19, v3

    const-string v3, "reactionGroups"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v20, v3

    const-string v3, "parentId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v21, v3

    const-string v3, "command"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v22, v3

    const-string v3, "shadowed"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v23, v3

    const-string v3, "i18n"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v24, v3

    const-string v3, "showInChannel"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v25, v3

    const-string v3, "silent"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v26, v3

    const-string v3, "extraData"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v27, v3

    const-string v3, "replyToId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v28, v3

    const-string v3, "pinned"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v29, v3

    const-string v3, "pinnedAt"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v30, v3

    const-string v3, "pinExpires"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v31, v3

    const-string v3, "pinnedByUserId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v32, v3

    const-string v3, "threadParticipantsIds"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v33, v3

    const-string v3, "skipPushNotification"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v34, v3

    const-string v3, "skipEnrichUrl"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v35, v3

    const-string v3, "moderationDetails"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v36, v3

    const-string v3, "moderation"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v37, v3

    const-string v3, "messageTextUpdatedAt"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v38, v3

    const-string v3, "pollId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v39, v3

    const-string v3, "restrictedVisibility"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v40, v3

    const-string v3, "reminder"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v41, v3

    const-string v3, "sharedLocation"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v42, v3

    const-string v3, "channelRole"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v43, v3

    const-string v3, "deletedForMe"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v44, v3

    const-string v3, "channel_infocid"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v45, v3

    const-string v3, "channel_infoid"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v46, v3

    const-string v3, "channel_infotype"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v47, v3

    const-string v3, "channel_infomemberCount"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v48, v3

    const-string v3, "channel_infoname"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v49, v3

    new-instance v3, La0/g;

    move/from16 v50, v5

    const/4 v5, 0x0

    invoke-direct {v3, v5}, La0/f1;-><init>(I)V

    move/from16 v51, v15

    new-instance v15, La0/g;

    invoke-direct {v15, v5}, La0/f1;-><init>(I)V

    move/from16 v52, v14

    new-instance v14, La0/g;

    invoke-direct {v14, v5}, La0/f1;-><init>(I)V

    :goto_2
    invoke-interface {v4}, Ltb/c;->e1()Z

    move-result v53

    if-eqz v53, :cond_5

    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v54

    if-nez v54, :cond_2

    move/from16 v54, v13

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, v5, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_2
    move/from16 v54, v13

    :goto_3
    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v15, v5}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v15, v5, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v14, v5}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_4

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v14, v5, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    move/from16 v13, v54

    const/4 v5, 0x0

    goto :goto_2

    :cond_5
    move/from16 v54, v13

    invoke-interface {v4}, Ltb/c;->reset()V

    invoke-direct {v0, v2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v2, v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v2, v14}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_4
    invoke-interface {v4}, Ltb/c;->e1()Z

    move-result v5

    if-eqz v5, :cond_3b

    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v56

    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v57

    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v58

    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v59

    invoke-interface {v4, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v60

    invoke-interface {v4, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v61

    move v13, v6

    invoke-interface {v4, v11}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v62

    invoke-interface {v4, v12}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    move/from16 v100, v8

    move/from16 v6, v54

    move/from16 v54, v7

    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    move/from16 v8, v52

    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v52

    const/16 v55, 0x0

    if-eqz v52, :cond_6

    move/from16 v63, v5

    move-object/from16 v5, v55

    :goto_5
    move/from16 v52, v6

    goto :goto_6

    :cond_6
    invoke-interface {v4, v8}, Ltb/c;->getLong(I)J

    move-result-wide v63

    invoke-static/range {v63 .. v64}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v52

    move/from16 v63, v5

    move-object/from16 v5, v52

    goto :goto_5

    :goto_6
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v65

    move/from16 v5, v51

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_7

    move-object/from16 v6, v55

    :goto_7
    move/from16 v51, v5

    goto :goto_8

    :cond_7
    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v66

    invoke-static/range {v66 .. v67}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_7

    :goto_8
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v66

    move/from16 v5, v50

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_8

    move-object/from16 v6, v55

    :goto_9
    move/from16 v50, v5

    goto :goto_a

    :cond_8
    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v67

    invoke-static/range {v67 .. v68}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_9

    :goto_a
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v67

    move/from16 v5, p1

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_9

    move-object/from16 v6, v55

    :goto_b
    move/from16 p1, v5

    goto :goto_c

    :cond_9
    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v68

    invoke-static/range {v68 .. v69}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_b

    :goto_c
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v68

    move/from16 v5, p3

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_a

    move-object/from16 v6, v55

    :goto_d
    move/from16 p3, v5

    goto :goto_e

    :cond_a
    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v69

    invoke-static/range {v69 .. v70}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_d

    :goto_e
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v69

    move/from16 v5, p4

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_b

    move-object/from16 v6, v55

    :goto_f
    move/from16 p4, v5

    goto :goto_10

    :cond_b
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_f

    :goto_10
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v70
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    if-eqz v70, :cond_3a

    move/from16 v6, v17

    :try_start_1
    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_c

    move/from16 p5, v6

    move-object/from16 v6, v55

    :goto_11
    move/from16 v64, v7

    goto :goto_12

    :cond_c
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v17

    move/from16 p5, v6

    move-object/from16 v6, v17

    goto :goto_11

    :goto_12
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v71

    if-eqz v71, :cond_39

    move/from16 v6, v18

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_d

    move-object/from16 v7, v55

    :goto_13
    move/from16 v18, v6

    goto :goto_14

    :cond_d
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_13

    :goto_14
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v72
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v6, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Int>\', but it was NULL."

    if-eqz v72, :cond_38

    move/from16 v7, v19

    :try_start_2
    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_e

    move/from16 v19, v7

    move-object/from16 v7, v55

    :goto_15
    move/from16 v17, v8

    goto :goto_16

    :cond_e
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v17

    move/from16 v19, v7

    move-object/from16 v7, v17

    goto :goto_15

    :goto_16
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v73

    if-eqz v73, :cond_37

    move/from16 v7, v20

    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_f

    move-object/from16 v6, v55

    goto :goto_17

    :cond_f
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_17
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reactionGroupConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;

    invoke-virtual {v8, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;->stringToReactionGroupEntityMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v74

    if-eqz v74, :cond_36

    move/from16 v6, v21

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_10

    move-object/from16 v75, v55

    :goto_18
    move/from16 v8, v22

    goto :goto_19

    :cond_10
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v75, v8

    goto :goto_18

    :goto_19
    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v20

    if-eqz v20, :cond_11

    move-object/from16 v76, v55

    move/from16 v21, v6

    move/from16 v20, v7

    move/from16 v22, v8

    move/from16 v6, v23

    goto :goto_1a

    :cond_11
    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v76, v20

    move/from16 v21, v6

    move/from16 v22, v8

    move/from16 v6, v23

    move/from16 v20, v7

    :goto_1a
    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_12

    const/16 v77, 0x1

    :goto_1b
    move/from16 v7, v24

    goto :goto_1c

    :cond_12
    const/16 v77, 0x0

    goto :goto_1b

    :goto_1c
    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_13

    move-object/from16 v8, v55

    :goto_1d
    move/from16 v23, v6

    goto :goto_1e

    :cond_13
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_1d

    :goto_1e
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToStringMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v78

    if-eqz v78, :cond_35

    move/from16 v24, v7

    move/from16 v6, v25

    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_14

    const/16 v79, 0x1

    :goto_1f
    move/from16 v25, v9

    move/from16 v7, v26

    goto :goto_20

    :cond_14
    const/16 v79, 0x0

    goto :goto_1f

    :goto_20
    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_15

    const/16 v81, 0x1

    :goto_21
    move/from16 v8, v27

    goto :goto_22

    :cond_15
    const/16 v81, 0x0

    goto :goto_21

    :goto_22
    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_16

    move-object/from16 v9, v55

    :goto_23
    move/from16 v26, v6

    goto :goto_24

    :cond_16
    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_23

    :goto_24
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v82

    if-eqz v82, :cond_34

    move/from16 v6, v28

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_17

    move-object/from16 v83, v55

    :goto_25
    move/from16 v28, v6

    move/from16 v27, v7

    move/from16 v9, v29

    goto :goto_26

    :cond_17
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v83, v9

    goto :goto_25

    :goto_26
    invoke-interface {v4, v9}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    if-eqz v6, :cond_18

    const/16 v84, 0x1

    :goto_27
    move/from16 v6, v30

    goto :goto_28

    :cond_18
    const/16 v84, 0x0

    goto :goto_27

    :goto_28
    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_19

    move-object/from16 v7, v55

    :goto_29
    move/from16 v30, v6

    goto :goto_2a

    :cond_19
    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v29

    invoke-static/range {v29 .. v30}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_29

    :goto_2a
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v85

    move/from16 v6, v31

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_1a

    move-object/from16 v7, v55

    :goto_2b
    move/from16 v31, v6

    goto :goto_2c

    :cond_1a
    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v86

    invoke-static/range {v86 .. v87}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_2b

    :goto_2c
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v86

    move/from16 v6, v32

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_1b

    move-object/from16 v87, v55

    :goto_2d
    move/from16 v7, v33

    goto :goto_2e

    :cond_1b
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v87, v7

    goto :goto_2d

    :goto_2e
    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v29

    if-eqz v29, :cond_1c

    move/from16 v32, v6

    move-object/from16 v6, v55

    :goto_2f
    move/from16 v33, v7

    goto :goto_30

    :cond_1c
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v29

    move/from16 v32, v6

    move-object/from16 v6, v29

    goto :goto_2f

    :goto_30
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v88

    if-eqz v88, :cond_33

    move/from16 v29, v8

    move/from16 v6, v34

    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_1d

    const/16 v89, 0x1

    :goto_31
    move/from16 v34, v9

    move/from16 v7, v35

    goto :goto_32

    :cond_1d
    const/16 v89, 0x0

    goto :goto_31

    :goto_32
    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_1e

    const/16 v90, 0x1

    :goto_33
    move/from16 v8, v36

    goto :goto_34

    :cond_1e
    const/16 v90, 0x0

    goto :goto_33

    :goto_34
    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1f

    move-object/from16 v9, v55

    :goto_35
    move/from16 v35, v6

    goto :goto_36

    :cond_1f
    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_35

    :goto_36
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationDetailsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;->stringToModerationDetails(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-result-object v91

    move/from16 v6, v37

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_20

    move-object/from16 v9, v55

    :goto_37
    move/from16 v37, v6

    goto :goto_38

    :cond_20
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_37

    :goto_38
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;->stringToModeration(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    move-result-object v92

    move/from16 v6, v38

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_21

    move-object/from16 v9, v55

    :goto_39
    move/from16 v38, v6

    goto :goto_3a

    :cond_21
    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v93

    invoke-static/range {v93 .. v94}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    goto :goto_39

    :goto_3a
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v93

    move/from16 v6, v39

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_22

    move-object/from16 v94, v55

    :goto_3b
    move/from16 v9, v40

    goto :goto_3c

    :cond_22
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v94, v9

    goto :goto_3b

    :goto_3c
    invoke-interface {v4, v9}, Ltb/c;->isNull(I)Z

    move-result v36

    if-eqz v36, :cond_23

    move/from16 v39, v6

    move-object/from16 v6, v55

    :goto_3d
    move/from16 v36, v7

    goto :goto_3e

    :cond_23
    invoke-interface {v4, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v36

    move/from16 v39, v6

    move-object/from16 v6, v36

    goto :goto_3d

    :goto_3e
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v95

    if-eqz v95, :cond_32

    move/from16 v6, v41

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_24

    move-object/from16 v5, v55

    goto :goto_3f

    :cond_24
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    :goto_3f
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reminderInfoConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    invoke-virtual {v7, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;->stringToReminderInfo(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-result-object v96

    move/from16 v5, v42

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_25

    move-object/from16 v7, v55

    :goto_40
    move/from16 v42, v5

    goto :goto_41

    :cond_25
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_40

    :goto_41
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    invoke-virtual {v5, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;->stringToLocation(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    move-result-object v97

    move/from16 v5, v43

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_26

    move-object/from16 v98, v55

    :goto_42
    move/from16 v43, v5

    move/from16 v41, v6

    move/from16 v7, v44

    goto :goto_43

    :cond_26
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v98, v7

    goto :goto_42

    :goto_43
    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    if-eqz v5, :cond_27

    const/16 v99, 0x1

    :goto_44
    move/from16 v5, v45

    goto :goto_45

    :cond_27
    const/16 v99, 0x0

    goto :goto_44

    :goto_45
    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_2c

    move/from16 v6, v46

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v40

    if-eqz v40, :cond_2b

    move/from16 v0, v47

    invoke-interface {v4, v0}, Ltb/c;->isNull(I)Z

    move-result v40

    if-eqz v40, :cond_2a

    move/from16 v44, v7

    move/from16 v7, v48

    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v40

    if-eqz v40, :cond_29

    move/from16 v40, v8

    move/from16 v8, v49

    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v45

    if-nez v45, :cond_28

    goto :goto_49

    :cond_28
    move/from16 v45, v5

    move/from16 v46, v6

    move-object/from16 v80, v55

    goto/16 :goto_50

    :cond_29
    move/from16 v40, v8

    :goto_46
    move/from16 v8, v49

    goto :goto_49

    :cond_2a
    move/from16 v44, v7

    move/from16 v40, v8

    :goto_47
    move/from16 v7, v48

    goto :goto_46

    :cond_2b
    move/from16 v44, v7

    move/from16 v40, v8

    :goto_48
    move/from16 v0, v47

    goto :goto_47

    :cond_2c
    move/from16 v44, v7

    move/from16 v40, v8

    move/from16 v6, v46

    goto :goto_48

    :goto_49
    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2d

    move-object/from16 v102, v55

    goto :goto_4a

    :cond_2d
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v45

    move-object/from16 v102, v45

    :goto_4a
    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2e

    move-object/from16 v103, v55

    goto :goto_4b

    :cond_2e
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v45

    move-object/from16 v103, v45

    :goto_4b
    invoke-interface {v4, v0}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2f

    move-object/from16 v104, v55

    goto :goto_4c

    :cond_2f
    invoke-interface {v4, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v45

    move-object/from16 v104, v45

    :goto_4c
    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_30

    move/from16 v45, v5

    move/from16 v46, v6

    move-object/from16 v105, v55

    goto :goto_4d

    :cond_30
    move/from16 v45, v5

    move/from16 v46, v6

    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v105, v5

    :goto_4d
    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_31

    :goto_4e
    move-object/from16 v106, v55

    goto :goto_4f

    :cond_31
    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v55

    goto :goto_4e

    :goto_4f
    new-instance v101, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    invoke-direct/range {v101 .. v106}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    move-object/from16 v80, v101

    :goto_50
    new-instance v55, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    invoke-direct/range {v55 .. v99}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)V

    move-object/from16 v5, v55

    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    move/from16 v47, v0

    move-object/from16 v0, v16

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/util/List;

    move-object/from16 v16, v3

    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v15}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/util/List;

    move/from16 v48, v7

    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v14}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/util/List;

    move-object/from16 v49, v0

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-direct {v0, v5, v6, v3, v7}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, v40

    move/from16 v40, v9

    move/from16 v9, v25

    move/from16 v25, v26

    move/from16 v26, v27

    move/from16 v27, v29

    move/from16 v29, v34

    move/from16 v34, v35

    move/from16 v35, v36

    move/from16 v36, v0

    move-object/from16 v0, p2

    move v6, v13

    move-object/from16 v3, v16

    move-object/from16 v16, v49

    move/from16 v7, v54

    move/from16 v49, v8

    move/from16 v54, v52

    move/from16 v8, v100

    move/from16 v52, v17

    move/from16 v17, p5

    goto/16 :goto_4

    :cond_32
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_33
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_35
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.String>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_37
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_39
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3b
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    return-object v2

    :goto_51
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final messagesForChannelOlderThan$lambda$12(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;ILtb/a;)Ljava/util/List;
    .locals 107

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p5

    const-string v3, "getValue(...)"

    const-string v4, "_connection"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p0

    invoke-interface {v2, v4}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v4

    const/4 v5, 0x1

    move-object/from16 v6, p1

    :try_start_0
    invoke-interface {v4, v5, v6}, Ltb/c;->L(ILjava/lang/String;)V

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v6

    const/4 v7, 0x2

    if-nez v6, :cond_0

    invoke-interface {v4, v7}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_51

    :cond_0
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-interface {v4, v7, v8, v9}, Ltb/c;->p(IJ)V

    :goto_0
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v1

    const/4 v6, 0x3

    if-nez v1, :cond_1

    invoke-interface {v4, v6}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-interface {v4, v6, v7, v8}, Ltb/c;->p(IJ)V

    :goto_1
    const/4 v1, 0x4

    move/from16 v6, p4

    int-to-long v6, v6

    invoke-interface {v4, v1, v6, v7}, Ltb/c;->p(IJ)V

    const-string v1, "id"

    invoke-static {v4, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    const-string v6, "cid"

    invoke-static {v4, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "userId"

    invoke-static {v4, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "text"

    invoke-static {v4, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "html"

    invoke-static {v4, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "type"

    invoke-static {v4, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "syncStatus"

    invoke-static {v4, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "replyCount"

    invoke-static {v4, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "deletedReplyCount"

    invoke-static {v4, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "createdAt"

    invoke-static {v4, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "createdLocallyAt"

    invoke-static {v4, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v5, "updatedAt"

    invoke-static {v4, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    move-object/from16 v16, v3

    const-string v3, "updatedLocallyAt"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p1, v3

    const-string v3, "deletedAt"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p3, v3

    const-string v3, "remoteMentionedUserIds"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p4, v3

    const-string v3, "mentionedUsersId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v17, v3

    const-string v3, "reactionCounts"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v18, v3

    const-string v3, "reactionScores"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v19, v3

    const-string v3, "reactionGroups"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v20, v3

    const-string v3, "parentId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v21, v3

    const-string v3, "command"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v22, v3

    const-string v3, "shadowed"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v23, v3

    const-string v3, "i18n"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v24, v3

    const-string v3, "showInChannel"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v25, v3

    const-string v3, "silent"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v26, v3

    const-string v3, "extraData"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v27, v3

    const-string v3, "replyToId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v28, v3

    const-string v3, "pinned"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v29, v3

    const-string v3, "pinnedAt"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v30, v3

    const-string v3, "pinExpires"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v31, v3

    const-string v3, "pinnedByUserId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v32, v3

    const-string v3, "threadParticipantsIds"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v33, v3

    const-string v3, "skipPushNotification"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v34, v3

    const-string v3, "skipEnrichUrl"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v35, v3

    const-string v3, "moderationDetails"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v36, v3

    const-string v3, "moderation"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v37, v3

    const-string v3, "messageTextUpdatedAt"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v38, v3

    const-string v3, "pollId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v39, v3

    const-string v3, "restrictedVisibility"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v40, v3

    const-string v3, "reminder"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v41, v3

    const-string v3, "sharedLocation"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v42, v3

    const-string v3, "channelRole"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v43, v3

    const-string v3, "deletedForMe"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v44, v3

    const-string v3, "channel_infocid"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v45, v3

    const-string v3, "channel_infoid"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v46, v3

    const-string v3, "channel_infotype"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v47, v3

    const-string v3, "channel_infomemberCount"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v48, v3

    const-string v3, "channel_infoname"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v49, v3

    new-instance v3, La0/g;

    move/from16 v50, v5

    const/4 v5, 0x0

    invoke-direct {v3, v5}, La0/f1;-><init>(I)V

    move/from16 v51, v15

    new-instance v15, La0/g;

    invoke-direct {v15, v5}, La0/f1;-><init>(I)V

    move/from16 v52, v14

    new-instance v14, La0/g;

    invoke-direct {v14, v5}, La0/f1;-><init>(I)V

    :goto_2
    invoke-interface {v4}, Ltb/c;->e1()Z

    move-result v53

    if-eqz v53, :cond_5

    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v54

    if-nez v54, :cond_2

    move/from16 v54, v13

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, v5, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_2
    move/from16 v54, v13

    :goto_3
    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v15, v5}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v15, v5, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v14, v5}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_4

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v14, v5, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    move/from16 v13, v54

    const/4 v5, 0x0

    goto :goto_2

    :cond_5
    move/from16 v54, v13

    invoke-interface {v4}, Ltb/c;->reset()V

    invoke-direct {v0, v2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v2, v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v2, v14}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_4
    invoke-interface {v4}, Ltb/c;->e1()Z

    move-result v5

    if-eqz v5, :cond_3b

    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v56

    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v57

    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v58

    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v59

    invoke-interface {v4, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v60

    invoke-interface {v4, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v61

    move v13, v6

    invoke-interface {v4, v11}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v62

    invoke-interface {v4, v12}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    move/from16 v100, v8

    move/from16 v6, v54

    move/from16 v54, v7

    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    move/from16 v8, v52

    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v52

    const/16 v55, 0x0

    if-eqz v52, :cond_6

    move/from16 v63, v5

    move-object/from16 v5, v55

    :goto_5
    move/from16 v52, v6

    goto :goto_6

    :cond_6
    invoke-interface {v4, v8}, Ltb/c;->getLong(I)J

    move-result-wide v63

    invoke-static/range {v63 .. v64}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v52

    move/from16 v63, v5

    move-object/from16 v5, v52

    goto :goto_5

    :goto_6
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v65

    move/from16 v5, v51

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_7

    move-object/from16 v6, v55

    :goto_7
    move/from16 v51, v5

    goto :goto_8

    :cond_7
    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v66

    invoke-static/range {v66 .. v67}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_7

    :goto_8
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v66

    move/from16 v5, v50

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_8

    move-object/from16 v6, v55

    :goto_9
    move/from16 v50, v5

    goto :goto_a

    :cond_8
    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v67

    invoke-static/range {v67 .. v68}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_9

    :goto_a
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v67

    move/from16 v5, p1

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_9

    move-object/from16 v6, v55

    :goto_b
    move/from16 p1, v5

    goto :goto_c

    :cond_9
    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v68

    invoke-static/range {v68 .. v69}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_b

    :goto_c
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v68

    move/from16 v5, p3

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_a

    move-object/from16 v6, v55

    :goto_d
    move/from16 p3, v5

    goto :goto_e

    :cond_a
    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v69

    invoke-static/range {v69 .. v70}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_d

    :goto_e
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v69

    move/from16 v5, p4

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_b

    move-object/from16 v6, v55

    :goto_f
    move/from16 p4, v5

    goto :goto_10

    :cond_b
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_f

    :goto_10
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v70
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    if-eqz v70, :cond_3a

    move/from16 v6, v17

    :try_start_1
    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_c

    move/from16 p5, v6

    move-object/from16 v6, v55

    :goto_11
    move/from16 v64, v7

    goto :goto_12

    :cond_c
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v17

    move/from16 p5, v6

    move-object/from16 v6, v17

    goto :goto_11

    :goto_12
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v71

    if-eqz v71, :cond_39

    move/from16 v6, v18

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_d

    move-object/from16 v7, v55

    :goto_13
    move/from16 v18, v6

    goto :goto_14

    :cond_d
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_13

    :goto_14
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v72
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v6, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Int>\', but it was NULL."

    if-eqz v72, :cond_38

    move/from16 v7, v19

    :try_start_2
    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_e

    move/from16 v19, v7

    move-object/from16 v7, v55

    :goto_15
    move/from16 v17, v8

    goto :goto_16

    :cond_e
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v17

    move/from16 v19, v7

    move-object/from16 v7, v17

    goto :goto_15

    :goto_16
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v73

    if-eqz v73, :cond_37

    move/from16 v7, v20

    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_f

    move-object/from16 v6, v55

    goto :goto_17

    :cond_f
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_17
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reactionGroupConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;

    invoke-virtual {v8, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;->stringToReactionGroupEntityMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v74

    if-eqz v74, :cond_36

    move/from16 v6, v21

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_10

    move-object/from16 v75, v55

    :goto_18
    move/from16 v8, v22

    goto :goto_19

    :cond_10
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v75, v8

    goto :goto_18

    :goto_19
    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v20

    if-eqz v20, :cond_11

    move-object/from16 v76, v55

    move/from16 v21, v6

    move/from16 v20, v7

    move/from16 v22, v8

    move/from16 v6, v23

    goto :goto_1a

    :cond_11
    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v76, v20

    move/from16 v21, v6

    move/from16 v22, v8

    move/from16 v6, v23

    move/from16 v20, v7

    :goto_1a
    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_12

    const/16 v77, 0x1

    :goto_1b
    move/from16 v7, v24

    goto :goto_1c

    :cond_12
    const/16 v77, 0x0

    goto :goto_1b

    :goto_1c
    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_13

    move-object/from16 v8, v55

    :goto_1d
    move/from16 v23, v6

    goto :goto_1e

    :cond_13
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_1d

    :goto_1e
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToStringMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v78

    if-eqz v78, :cond_35

    move/from16 v24, v7

    move/from16 v6, v25

    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_14

    const/16 v79, 0x1

    :goto_1f
    move/from16 v25, v9

    move/from16 v7, v26

    goto :goto_20

    :cond_14
    const/16 v79, 0x0

    goto :goto_1f

    :goto_20
    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_15

    const/16 v81, 0x1

    :goto_21
    move/from16 v8, v27

    goto :goto_22

    :cond_15
    const/16 v81, 0x0

    goto :goto_21

    :goto_22
    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_16

    move-object/from16 v9, v55

    :goto_23
    move/from16 v26, v6

    goto :goto_24

    :cond_16
    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_23

    :goto_24
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v82

    if-eqz v82, :cond_34

    move/from16 v6, v28

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_17

    move-object/from16 v83, v55

    :goto_25
    move/from16 v28, v6

    move/from16 v27, v7

    move/from16 v9, v29

    goto :goto_26

    :cond_17
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v83, v9

    goto :goto_25

    :goto_26
    invoke-interface {v4, v9}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    if-eqz v6, :cond_18

    const/16 v84, 0x1

    :goto_27
    move/from16 v6, v30

    goto :goto_28

    :cond_18
    const/16 v84, 0x0

    goto :goto_27

    :goto_28
    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_19

    move-object/from16 v7, v55

    :goto_29
    move/from16 v30, v6

    goto :goto_2a

    :cond_19
    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v29

    invoke-static/range {v29 .. v30}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_29

    :goto_2a
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v85

    move/from16 v6, v31

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_1a

    move-object/from16 v7, v55

    :goto_2b
    move/from16 v31, v6

    goto :goto_2c

    :cond_1a
    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v86

    invoke-static/range {v86 .. v87}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_2b

    :goto_2c
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v86

    move/from16 v6, v32

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_1b

    move-object/from16 v87, v55

    :goto_2d
    move/from16 v7, v33

    goto :goto_2e

    :cond_1b
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v87, v7

    goto :goto_2d

    :goto_2e
    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v29

    if-eqz v29, :cond_1c

    move/from16 v32, v6

    move-object/from16 v6, v55

    :goto_2f
    move/from16 v33, v7

    goto :goto_30

    :cond_1c
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v29

    move/from16 v32, v6

    move-object/from16 v6, v29

    goto :goto_2f

    :goto_30
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v88

    if-eqz v88, :cond_33

    move/from16 v29, v8

    move/from16 v6, v34

    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_1d

    const/16 v89, 0x1

    :goto_31
    move/from16 v34, v9

    move/from16 v7, v35

    goto :goto_32

    :cond_1d
    const/16 v89, 0x0

    goto :goto_31

    :goto_32
    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_1e

    const/16 v90, 0x1

    :goto_33
    move/from16 v8, v36

    goto :goto_34

    :cond_1e
    const/16 v90, 0x0

    goto :goto_33

    :goto_34
    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1f

    move-object/from16 v9, v55

    :goto_35
    move/from16 v35, v6

    goto :goto_36

    :cond_1f
    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_35

    :goto_36
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationDetailsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;->stringToModerationDetails(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-result-object v91

    move/from16 v6, v37

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_20

    move-object/from16 v9, v55

    :goto_37
    move/from16 v37, v6

    goto :goto_38

    :cond_20
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_37

    :goto_38
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;->stringToModeration(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    move-result-object v92

    move/from16 v6, v38

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_21

    move-object/from16 v9, v55

    :goto_39
    move/from16 v38, v6

    goto :goto_3a

    :cond_21
    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v93

    invoke-static/range {v93 .. v94}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    goto :goto_39

    :goto_3a
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v93

    move/from16 v6, v39

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_22

    move-object/from16 v94, v55

    :goto_3b
    move/from16 v9, v40

    goto :goto_3c

    :cond_22
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v94, v9

    goto :goto_3b

    :goto_3c
    invoke-interface {v4, v9}, Ltb/c;->isNull(I)Z

    move-result v36

    if-eqz v36, :cond_23

    move/from16 v39, v6

    move-object/from16 v6, v55

    :goto_3d
    move/from16 v36, v7

    goto :goto_3e

    :cond_23
    invoke-interface {v4, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v36

    move/from16 v39, v6

    move-object/from16 v6, v36

    goto :goto_3d

    :goto_3e
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v95

    if-eqz v95, :cond_32

    move/from16 v6, v41

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_24

    move-object/from16 v5, v55

    goto :goto_3f

    :cond_24
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    :goto_3f
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reminderInfoConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    invoke-virtual {v7, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;->stringToReminderInfo(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-result-object v96

    move/from16 v5, v42

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_25

    move-object/from16 v7, v55

    :goto_40
    move/from16 v42, v5

    goto :goto_41

    :cond_25
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_40

    :goto_41
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    invoke-virtual {v5, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;->stringToLocation(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    move-result-object v97

    move/from16 v5, v43

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_26

    move-object/from16 v98, v55

    :goto_42
    move/from16 v43, v5

    move/from16 v41, v6

    move/from16 v7, v44

    goto :goto_43

    :cond_26
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v98, v7

    goto :goto_42

    :goto_43
    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    if-eqz v5, :cond_27

    const/16 v99, 0x1

    :goto_44
    move/from16 v5, v45

    goto :goto_45

    :cond_27
    const/16 v99, 0x0

    goto :goto_44

    :goto_45
    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_2c

    move/from16 v6, v46

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v40

    if-eqz v40, :cond_2b

    move/from16 v0, v47

    invoke-interface {v4, v0}, Ltb/c;->isNull(I)Z

    move-result v40

    if-eqz v40, :cond_2a

    move/from16 v44, v7

    move/from16 v7, v48

    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v40

    if-eqz v40, :cond_29

    move/from16 v40, v8

    move/from16 v8, v49

    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v45

    if-nez v45, :cond_28

    goto :goto_49

    :cond_28
    move/from16 v45, v5

    move/from16 v46, v6

    move-object/from16 v80, v55

    goto/16 :goto_50

    :cond_29
    move/from16 v40, v8

    :goto_46
    move/from16 v8, v49

    goto :goto_49

    :cond_2a
    move/from16 v44, v7

    move/from16 v40, v8

    :goto_47
    move/from16 v7, v48

    goto :goto_46

    :cond_2b
    move/from16 v44, v7

    move/from16 v40, v8

    :goto_48
    move/from16 v0, v47

    goto :goto_47

    :cond_2c
    move/from16 v44, v7

    move/from16 v40, v8

    move/from16 v6, v46

    goto :goto_48

    :goto_49
    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2d

    move-object/from16 v102, v55

    goto :goto_4a

    :cond_2d
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v45

    move-object/from16 v102, v45

    :goto_4a
    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2e

    move-object/from16 v103, v55

    goto :goto_4b

    :cond_2e
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v45

    move-object/from16 v103, v45

    :goto_4b
    invoke-interface {v4, v0}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2f

    move-object/from16 v104, v55

    goto :goto_4c

    :cond_2f
    invoke-interface {v4, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v45

    move-object/from16 v104, v45

    :goto_4c
    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_30

    move/from16 v45, v5

    move/from16 v46, v6

    move-object/from16 v105, v55

    goto :goto_4d

    :cond_30
    move/from16 v45, v5

    move/from16 v46, v6

    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v105, v5

    :goto_4d
    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_31

    :goto_4e
    move-object/from16 v106, v55

    goto :goto_4f

    :cond_31
    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v55

    goto :goto_4e

    :goto_4f
    new-instance v101, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    invoke-direct/range {v101 .. v106}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    move-object/from16 v80, v101

    :goto_50
    new-instance v55, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    invoke-direct/range {v55 .. v99}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)V

    move-object/from16 v5, v55

    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    move/from16 v47, v0

    move-object/from16 v0, v16

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/util/List;

    move-object/from16 v16, v3

    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v15}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/util/List;

    move/from16 v48, v7

    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v14}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/util/List;

    move-object/from16 v49, v0

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-direct {v0, v5, v6, v3, v7}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, v40

    move/from16 v40, v9

    move/from16 v9, v25

    move/from16 v25, v26

    move/from16 v26, v27

    move/from16 v27, v29

    move/from16 v29, v34

    move/from16 v34, v35

    move/from16 v35, v36

    move/from16 v36, v0

    move-object/from16 v0, p2

    move v6, v13

    move-object/from16 v3, v16

    move-object/from16 v16, v49

    move/from16 v7, v54

    move/from16 v49, v8

    move/from16 v54, v52

    move/from16 v8, v100

    move/from16 v52, v17

    move/from16 v17, p5

    goto/16 :goto_4

    :cond_32
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_33
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_35
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.String>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_37
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_39
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3b
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    return-object v2

    :goto_51
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final messagesForThread$lambda$15(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 108

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    const-string v3, "getValue(...)"

    const-string v4, "_connection"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p0

    invoke-interface {v2, v4}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v4

    const/4 v5, 0x1

    :try_start_0
    invoke-interface {v4, v5, v0}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v6, 0x2

    invoke-interface {v4, v6, v0}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x3

    move/from16 v6, p2

    int-to-long v6, v6

    invoke-interface {v4, v0, v6, v7}, Ltb/c;->p(IJ)V

    const-string v0, "id"

    invoke-static {v4, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v6, "cid"

    invoke-static {v4, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "userId"

    invoke-static {v4, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "text"

    invoke-static {v4, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "html"

    invoke-static {v4, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "type"

    invoke-static {v4, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "syncStatus"

    invoke-static {v4, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "replyCount"

    invoke-static {v4, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "deletedReplyCount"

    invoke-static {v4, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "createdAt"

    invoke-static {v4, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "createdLocallyAt"

    invoke-static {v4, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v5, "updatedAt"

    invoke-static {v4, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    move-object/from16 v16, v3

    const-string v3, "updatedLocallyAt"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p1, v3

    const-string v3, "deletedAt"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p2, v3

    const-string v3, "remoteMentionedUserIds"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v17, v3

    const-string v3, "mentionedUsersId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v18, v3

    const-string v3, "reactionCounts"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v19, v3

    const-string v3, "reactionScores"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v20, v3

    const-string v3, "reactionGroups"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v21, v3

    const-string v3, "parentId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v22, v3

    const-string v3, "command"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v23, v3

    const-string v3, "shadowed"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v24, v3

    const-string v3, "i18n"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v25, v3

    const-string v3, "showInChannel"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v26, v3

    const-string v3, "silent"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v27, v3

    const-string v3, "extraData"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v28, v3

    const-string v3, "replyToId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v29, v3

    const-string v3, "pinned"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v30, v3

    const-string v3, "pinnedAt"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v31, v3

    const-string v3, "pinExpires"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v32, v3

    const-string v3, "pinnedByUserId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v33, v3

    const-string v3, "threadParticipantsIds"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v34, v3

    const-string v3, "skipPushNotification"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v35, v3

    const-string v3, "skipEnrichUrl"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v36, v3

    const-string v3, "moderationDetails"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v37, v3

    const-string v3, "moderation"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v38, v3

    const-string v3, "messageTextUpdatedAt"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v39, v3

    const-string v3, "pollId"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v40, v3

    const-string v3, "restrictedVisibility"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v41, v3

    const-string v3, "reminder"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v42, v3

    const-string v3, "sharedLocation"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v43, v3

    const-string v3, "channelRole"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v44, v3

    const-string v3, "deletedForMe"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v45, v3

    const-string v3, "channel_infocid"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v46, v3

    const-string v3, "channel_infoid"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v47, v3

    const-string v3, "channel_infotype"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v48, v3

    const-string v3, "channel_infomemberCount"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v49, v3

    const-string v3, "channel_infoname"

    invoke-static {v4, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v50, v3

    new-instance v3, La0/g;

    move/from16 v51, v5

    const/4 v5, 0x0

    invoke-direct {v3, v5}, La0/f1;-><init>(I)V

    move/from16 v52, v15

    new-instance v15, La0/g;

    invoke-direct {v15, v5}, La0/f1;-><init>(I)V

    move/from16 v53, v14

    new-instance v14, La0/g;

    invoke-direct {v14, v5}, La0/f1;-><init>(I)V

    :goto_0
    invoke-interface {v4}, Ltb/c;->e1()Z

    move-result v54

    if-eqz v54, :cond_3

    invoke-interface {v4, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v55

    if-nez v55, :cond_0

    move/from16 v55, v13

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, v5, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_4f

    :cond_0
    move/from16 v55, v13

    :goto_1
    invoke-interface {v4, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v15, v5}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_1

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v15, v5, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {v4, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v14, v5}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_2

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v14, v5, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    move/from16 v13, v55

    const/4 v5, 0x0

    goto :goto_0

    :cond_3
    move/from16 v55, v13

    invoke-interface {v4}, Ltb/c;->reset()V

    invoke-direct {v1, v2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity(Ltb/a;La0/g;)V

    invoke-direct {v1, v2, v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    invoke-direct {v1, v2, v14}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    invoke-interface {v4}, Ltb/c;->e1()Z

    move-result v5

    if-eqz v5, :cond_39

    invoke-interface {v4, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v57

    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v58

    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v59

    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v60

    invoke-interface {v4, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v61

    invoke-interface {v4, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v62

    move v13, v6

    invoke-interface {v4, v11}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v63

    invoke-interface {v4, v12}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    move/from16 v101, v8

    move/from16 v6, v55

    move/from16 v55, v7

    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    move/from16 v8, v53

    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v53

    const/16 v56, 0x0

    if-eqz v53, :cond_4

    move/from16 v64, v5

    move-object/from16 v5, v56

    :goto_3
    move/from16 v53, v6

    goto :goto_4

    :cond_4
    invoke-interface {v4, v8}, Ltb/c;->getLong(I)J

    move-result-wide v64

    invoke-static/range {v64 .. v65}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v53

    move/from16 v64, v5

    move-object/from16 v5, v53

    goto :goto_3

    :goto_4
    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v66

    move/from16 v5, v52

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_5

    move-object/from16 v6, v56

    :goto_5
    move/from16 v52, v5

    goto :goto_6

    :cond_5
    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v67

    invoke-static/range {v67 .. v68}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_5

    :goto_6
    iget-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v67

    move/from16 v5, v51

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_6

    move-object/from16 v6, v56

    :goto_7
    move/from16 v51, v5

    goto :goto_8

    :cond_6
    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v68

    invoke-static/range {v68 .. v69}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_7

    :goto_8
    iget-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v68

    move/from16 v5, p1

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_7

    move-object/from16 v6, v56

    :goto_9
    move/from16 p1, v5

    goto :goto_a

    :cond_7
    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v69

    invoke-static/range {v69 .. v70}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_9

    :goto_a
    iget-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v69

    move/from16 v5, p2

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_8

    move-object/from16 v6, v56

    :goto_b
    move/from16 p2, v5

    goto :goto_c

    :cond_8
    invoke-interface {v4, v5}, Ltb/c;->getLong(I)J

    move-result-wide v70

    invoke-static/range {v70 .. v71}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_b

    :goto_c
    iget-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v70

    move/from16 v5, v17

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_9

    move-object/from16 v6, v56

    :goto_d
    move/from16 v17, v5

    goto :goto_e

    :cond_9
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_d

    :goto_e
    iget-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v71
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    if-eqz v71, :cond_38

    move/from16 v6, v18

    :try_start_1
    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v18

    if-eqz v18, :cond_a

    move/from16 p4, v6

    move-object/from16 v6, v56

    :goto_f
    move/from16 v65, v7

    goto :goto_10

    :cond_a
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18

    move/from16 p4, v6

    move-object/from16 v6, v18

    goto :goto_f

    :goto_10
    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v72

    if-eqz v72, :cond_37

    move/from16 v6, v19

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_b

    move-object/from16 v7, v56

    :goto_11
    move/from16 v19, v6

    goto :goto_12

    :cond_b
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_11

    :goto_12
    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v73
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v6, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Int>\', but it was NULL."

    if-eqz v73, :cond_36

    move/from16 v7, v20

    :try_start_2
    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v18

    if-eqz v18, :cond_c

    move/from16 v20, v7

    move-object/from16 v7, v56

    :goto_13
    move/from16 v18, v8

    goto :goto_14

    :cond_c
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18

    move/from16 v20, v7

    move-object/from16 v7, v18

    goto :goto_13

    :goto_14
    iget-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v74

    if-eqz v74, :cond_35

    move/from16 v7, v21

    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_d

    move-object/from16 v6, v56

    goto :goto_15

    :cond_d
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_15
    iget-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reactionGroupConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;

    invoke-virtual {v8, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;->stringToReactionGroupEntityMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v75

    if-eqz v75, :cond_34

    move/from16 v6, v22

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_e

    move-object/from16 v76, v56

    :goto_16
    move/from16 v8, v23

    goto :goto_17

    :cond_e
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v76, v8

    goto :goto_16

    :goto_17
    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v21

    if-eqz v21, :cond_f

    move-object/from16 v77, v56

    move/from16 v22, v6

    move/from16 v21, v7

    move/from16 v23, v8

    move/from16 v6, v24

    goto :goto_18

    :cond_f
    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v21

    move-object/from16 v77, v21

    move/from16 v22, v6

    move/from16 v23, v8

    move/from16 v6, v24

    move/from16 v21, v7

    :goto_18
    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_10

    const/16 v78, 0x1

    :goto_19
    move/from16 v7, v25

    goto :goto_1a

    :cond_10
    const/16 v78, 0x0

    goto :goto_19

    :goto_1a
    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_11

    move-object/from16 v8, v56

    :goto_1b
    move/from16 v24, v6

    goto :goto_1c

    :cond_11
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_1b

    :goto_1c
    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToStringMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v79

    if-eqz v79, :cond_33

    move/from16 v25, v7

    move/from16 v6, v26

    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_12

    const/16 v80, 0x1

    :goto_1d
    move/from16 v26, v9

    move/from16 v7, v27

    goto :goto_1e

    :cond_12
    const/16 v80, 0x0

    goto :goto_1d

    :goto_1e
    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_13

    const/16 v82, 0x1

    :goto_1f
    move/from16 v8, v28

    goto :goto_20

    :cond_13
    const/16 v82, 0x0

    goto :goto_1f

    :goto_20
    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_14

    move-object/from16 v9, v56

    :goto_21
    move/from16 v27, v6

    goto :goto_22

    :cond_14
    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_21

    :goto_22
    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v83

    if-eqz v83, :cond_32

    move/from16 v6, v29

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_15

    move-object/from16 v84, v56

    :goto_23
    move/from16 v29, v6

    move/from16 v28, v7

    move/from16 v9, v30

    goto :goto_24

    :cond_15
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v84, v9

    goto :goto_23

    :goto_24
    invoke-interface {v4, v9}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    if-eqz v6, :cond_16

    const/16 v85, 0x1

    :goto_25
    move/from16 v6, v31

    goto :goto_26

    :cond_16
    const/16 v85, 0x0

    goto :goto_25

    :goto_26
    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_17

    move-object/from16 v7, v56

    :goto_27
    move/from16 v31, v6

    goto :goto_28

    :cond_17
    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v30

    invoke-static/range {v30 .. v31}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_27

    :goto_28
    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v86

    move/from16 v6, v32

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_18

    move-object/from16 v7, v56

    :goto_29
    move/from16 v32, v6

    goto :goto_2a

    :cond_18
    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v87

    invoke-static/range {v87 .. v88}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_29

    :goto_2a
    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v87

    move/from16 v6, v33

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_19

    move-object/from16 v88, v56

    :goto_2b
    move/from16 v7, v34

    goto :goto_2c

    :cond_19
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v88, v7

    goto :goto_2b

    :goto_2c
    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v30

    if-eqz v30, :cond_1a

    move/from16 v33, v6

    move-object/from16 v6, v56

    :goto_2d
    move/from16 v34, v7

    goto :goto_2e

    :cond_1a
    invoke-interface {v4, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v30

    move/from16 v33, v6

    move-object/from16 v6, v30

    goto :goto_2d

    :goto_2e
    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v89

    if-eqz v89, :cond_31

    move/from16 v30, v8

    move/from16 v6, v35

    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_1b

    const/16 v90, 0x1

    :goto_2f
    move/from16 v35, v9

    move/from16 v7, v36

    goto :goto_30

    :cond_1b
    const/16 v90, 0x0

    goto :goto_2f

    :goto_30
    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_1c

    const/16 v91, 0x1

    :goto_31
    move/from16 v8, v37

    goto :goto_32

    :cond_1c
    const/16 v91, 0x0

    goto :goto_31

    :goto_32
    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1d

    move-object/from16 v9, v56

    :goto_33
    move/from16 v36, v6

    goto :goto_34

    :cond_1d
    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_33

    :goto_34
    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationDetailsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;->stringToModerationDetails(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-result-object v92

    move/from16 v6, v38

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1e

    move-object/from16 v9, v56

    :goto_35
    move/from16 v38, v6

    goto :goto_36

    :cond_1e
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_35

    :goto_36
    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;->stringToModeration(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    move-result-object v93

    move/from16 v6, v39

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1f

    move-object/from16 v9, v56

    :goto_37
    move/from16 v39, v6

    goto :goto_38

    :cond_1f
    invoke-interface {v4, v6}, Ltb/c;->getLong(I)J

    move-result-wide v94

    invoke-static/range {v94 .. v95}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    goto :goto_37

    :goto_38
    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v94

    move/from16 v6, v40

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_20

    move-object/from16 v95, v56

    :goto_39
    move/from16 v9, v41

    goto :goto_3a

    :cond_20
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v95, v9

    goto :goto_39

    :goto_3a
    invoke-interface {v4, v9}, Ltb/c;->isNull(I)Z

    move-result v37

    if-eqz v37, :cond_21

    move/from16 v40, v6

    move-object/from16 v6, v56

    :goto_3b
    move/from16 v37, v7

    goto :goto_3c

    :cond_21
    invoke-interface {v4, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v37

    move/from16 v40, v6

    move-object/from16 v6, v37

    goto :goto_3b

    :goto_3c
    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v96

    if-eqz v96, :cond_30

    move/from16 v6, v42

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_22

    move-object/from16 v5, v56

    goto :goto_3d

    :cond_22
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    :goto_3d
    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reminderInfoConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    invoke-virtual {v7, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;->stringToReminderInfo(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-result-object v97

    move/from16 v5, v43

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_23

    move-object/from16 v7, v56

    :goto_3e
    move/from16 v43, v5

    goto :goto_3f

    :cond_23
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_3e

    :goto_3f
    iget-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    invoke-virtual {v5, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;->stringToLocation(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    move-result-object v98

    move/from16 v5, v44

    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_24

    move-object/from16 v99, v56

    :goto_40
    move/from16 v44, v5

    move/from16 v42, v6

    move/from16 v7, v45

    goto :goto_41

    :cond_24
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v99, v7

    goto :goto_40

    :goto_41
    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    if-eqz v5, :cond_25

    const/16 v100, 0x1

    :goto_42
    move/from16 v5, v46

    goto :goto_43

    :cond_25
    const/16 v100, 0x0

    goto :goto_42

    :goto_43
    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_2a

    move/from16 v6, v47

    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v41

    if-eqz v41, :cond_29

    move/from16 v1, v48

    invoke-interface {v4, v1}, Ltb/c;->isNull(I)Z

    move-result v41

    if-eqz v41, :cond_28

    move/from16 v45, v7

    move/from16 v7, v49

    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v41

    if-eqz v41, :cond_27

    move/from16 v41, v8

    move/from16 v8, v50

    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v46

    if-nez v46, :cond_26

    goto :goto_47

    :cond_26
    move/from16 v46, v5

    move/from16 v47, v6

    move-object/from16 v81, v56

    goto/16 :goto_4e

    :cond_27
    move/from16 v41, v8

    :goto_44
    move/from16 v8, v50

    goto :goto_47

    :cond_28
    move/from16 v45, v7

    move/from16 v41, v8

    :goto_45
    move/from16 v7, v49

    goto :goto_44

    :cond_29
    move/from16 v45, v7

    move/from16 v41, v8

    :goto_46
    move/from16 v1, v48

    goto :goto_45

    :cond_2a
    move/from16 v45, v7

    move/from16 v41, v8

    move/from16 v6, v47

    goto :goto_46

    :goto_47
    invoke-interface {v4, v5}, Ltb/c;->isNull(I)Z

    move-result v46

    if-eqz v46, :cond_2b

    move-object/from16 v103, v56

    goto :goto_48

    :cond_2b
    invoke-interface {v4, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v46

    move-object/from16 v103, v46

    :goto_48
    invoke-interface {v4, v6}, Ltb/c;->isNull(I)Z

    move-result v46

    if-eqz v46, :cond_2c

    move-object/from16 v104, v56

    goto :goto_49

    :cond_2c
    invoke-interface {v4, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v46

    move-object/from16 v104, v46

    :goto_49
    invoke-interface {v4, v1}, Ltb/c;->isNull(I)Z

    move-result v46

    if-eqz v46, :cond_2d

    move-object/from16 v105, v56

    goto :goto_4a

    :cond_2d
    invoke-interface {v4, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v46

    move-object/from16 v105, v46

    :goto_4a
    invoke-interface {v4, v7}, Ltb/c;->isNull(I)Z

    move-result v46

    if-eqz v46, :cond_2e

    move/from16 v46, v5

    move/from16 v47, v6

    move-object/from16 v106, v56

    goto :goto_4b

    :cond_2e
    move/from16 v46, v5

    move/from16 v47, v6

    invoke-interface {v4, v7}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v106, v5

    :goto_4b
    invoke-interface {v4, v8}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_2f

    :goto_4c
    move-object/from16 v107, v56

    goto :goto_4d

    :cond_2f
    invoke-interface {v4, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v56

    goto :goto_4c

    :goto_4d
    new-instance v102, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    invoke-direct/range {v102 .. v107}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    move-object/from16 v81, v102

    :goto_4e
    new-instance v56, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    invoke-direct/range {v56 .. v100}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)V

    move-object/from16 v5, v56

    invoke-interface {v4, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    move/from16 v48, v1

    move-object/from16 v1, v16

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/util/List;

    move-object/from16 v16, v3

    invoke-interface {v4, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v15}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/util/List;

    move/from16 v49, v7

    invoke-interface {v4, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v14}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/util/List;

    move/from16 v50, v0

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-direct {v0, v5, v6, v3, v7}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, v41

    move/from16 v41, v9

    move/from16 v9, v26

    move/from16 v26, v27

    move/from16 v27, v28

    move/from16 v28, v30

    move/from16 v30, v35

    move/from16 v35, v36

    move/from16 v36, v37

    move/from16 v37, v0

    move v6, v13

    move-object/from16 v3, v16

    move/from16 v0, v50

    move/from16 v7, v55

    move-object/from16 v16, v1

    move/from16 v50, v8

    move/from16 v55, v53

    move/from16 v8, v101

    move-object/from16 v1, p3

    move/from16 v53, v18

    move/from16 v18, p4

    goto/16 :goto_2

    :cond_30
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_31
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_32
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_33
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.String>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_35
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_37
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_39
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    return-object v2

    :goto_4f
    invoke-interface {v4}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method public static synthetic n(Ltb/a;)V
    .locals 1

    const-string v0, "DELETE FROM stream_chat_message"

    invoke-static {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->deleteAll$lambda$30(Ljava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic o(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;ILtb/a;)Ljava/util/ArrayList;
    .locals 6

    const-string v0, "SELECT * from stream_chat_message WHERE cid = ? AND (createdAt <= ? OR createdLocallyAt <= ?) ORDER BY CASE WHEN createdAt IS NULL THEN createdLocallyAt ELSE createdAt END DESC LIMIT ?"

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->messagesForChannelEqualOrOlderThan$lambda$13(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;ILtb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic p(Ljava/lang/String;ILio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "SELECT * from stream_chat_message WHERE parentId = ? OR id = ? ORDER BY CASE WHEN createdAt IS NULL THEN createdLocallyAt ELSE createdAt END DESC LIMIT ?"

    invoke-static {v0, p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->messagesForThread$lambda$15(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic q(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Ltb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->insertMessageInnerEntities$lambda$1(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Ltb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/models/SyncStatus;ILtb/a;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "SELECT * FROM stream_chat_message WHERE syncStatus = ? ORDER BY CASE WHEN createdAt IS NULL THEN createdLocallyAt ELSE createdAt END ASC LIMIT ?"

    invoke-static {v0, p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->selectBySyncStatus$lambda$18(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/models/SyncStatus;ILtb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic s(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;ILtb/a;)Ljava/util/ArrayList;
    .locals 6

    const-string v0, "SELECT * from stream_chat_message WHERE cid = ? AND (createdAt < ? OR createdLocallyAt < ?) ORDER BY CASE WHEN createdAt IS NULL THEN createdLocallyAt ELSE createdAt END DESC LIMIT ?"

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->messagesForChannelOlderThan$lambda$12(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;ILtb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method private static final select$lambda$16(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;
    .locals 102

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "getValue(...)"

    const-string v3, "_connection"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v3

    const/4 v4, 0x1

    move-object/from16 v5, p1

    :try_start_0
    invoke-interface {v3, v4, v5}, Ltb/c;->L(ILjava/lang/String;)V

    const-string v5, "id"

    invoke-static {v3, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "cid"

    invoke-static {v3, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "userId"

    invoke-static {v3, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "text"

    invoke-static {v3, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "html"

    invoke-static {v3, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "type"

    invoke-static {v3, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "syncStatus"

    invoke-static {v3, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "replyCount"

    invoke-static {v3, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "deletedReplyCount"

    invoke-static {v3, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "createdAt"

    invoke-static {v3, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "createdLocallyAt"

    invoke-static {v3, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v4, "updatedAt"

    invoke-static {v3, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move-object/from16 v16, v2

    const-string v2, "updatedLocallyAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p1, v2

    const-string v2, "deletedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v17, v2

    const-string v2, "remoteMentionedUserIds"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v18, v2

    const-string v2, "mentionedUsersId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v19, v2

    const-string v2, "reactionCounts"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v20, v2

    const-string v2, "reactionScores"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v21, v2

    const-string v2, "reactionGroups"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v22, v2

    const-string v2, "parentId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v23, v2

    const-string v2, "command"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v24, v2

    const-string v2, "shadowed"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v25, v2

    const-string v2, "i18n"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v26, v2

    const-string v2, "showInChannel"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v27, v2

    const-string v2, "silent"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v28, v2

    const-string v2, "extraData"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v29, v2

    const-string v2, "replyToId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v30, v2

    const-string v2, "pinned"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v31, v2

    const-string v2, "pinnedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v32, v2

    const-string v2, "pinExpires"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v33, v2

    const-string v2, "pinnedByUserId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v34, v2

    const-string v2, "threadParticipantsIds"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v35, v2

    const-string v2, "skipPushNotification"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v36, v2

    const-string v2, "skipEnrichUrl"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v37, v2

    const-string v2, "moderationDetails"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v38, v2

    const-string v2, "moderation"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v39, v2

    const-string v2, "messageTextUpdatedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v40, v2

    const-string v2, "pollId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v41, v2

    const-string v2, "restrictedVisibility"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v42, v2

    const-string v2, "reminder"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v43, v2

    const-string v2, "sharedLocation"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v44, v2

    const-string v2, "channelRole"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v45, v2

    const-string v2, "deletedForMe"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v46, v2

    const-string v2, "channel_infocid"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v47, v2

    const-string v2, "channel_infoid"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v48, v2

    const-string v2, "channel_infotype"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v49, v2

    const-string v2, "channel_infomemberCount"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v50, v2

    const-string v2, "channel_infoname"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v51, v2

    new-instance v2, La0/g;

    move/from16 v52, v4

    const/4 v4, 0x0

    invoke-direct {v2, v4}, La0/f1;-><init>(I)V

    move/from16 v53, v15

    new-instance v15, La0/g;

    invoke-direct {v15, v4}, La0/f1;-><init>(I)V

    move/from16 v54, v14

    new-instance v14, La0/g;

    invoke-direct {v14, v4}, La0/f1;-><init>(I)V

    :goto_0
    invoke-interface {v3}, Ltb/c;->e1()Z

    move-result v55

    if-eqz v55, :cond_3

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v56

    if-nez v56, :cond_0

    move/from16 v56, v13

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v4, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_3d

    :cond_0
    move/from16 v56, v13

    :goto_1
    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15, v4}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_1

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v15, v4, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14, v4}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_2

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v14, v4, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    move/from16 v13, v56

    const/4 v4, 0x0

    goto :goto_0

    :cond_3
    move/from16 v56, v13

    invoke-interface {v3}, Ltb/c;->reset()V

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v1, v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v1, v14}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    invoke-interface {v3}, Ltb/c;->e1()Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_39

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v58

    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v59

    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v60

    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v61

    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v62

    invoke-interface {v3, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v63

    invoke-interface {v3, v11}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v1, v6

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v6, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v64

    invoke-interface {v3, v12}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v1, v6

    move/from16 v6, v56

    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    move/from16 v7, v54

    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_4

    move-object v7, v4

    goto :goto_2

    :cond_4
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    :goto_2
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v67

    move/from16 v7, v53

    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_5

    move-object v7, v4

    goto :goto_3

    :cond_5
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    :goto_3
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v68

    move/from16 v7, v52

    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_6

    move-object v7, v4

    goto :goto_4

    :cond_6
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    :goto_4
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v69

    move/from16 v7, p1

    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_7

    move-object v7, v4

    goto :goto_5

    :cond_7
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    :goto_5
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v70

    move/from16 v7, v17

    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_8

    move-object v7, v4

    goto :goto_6

    :cond_8
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    :goto_6
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v71

    move/from16 v7, v18

    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_9

    move-object v7, v4

    goto :goto_7

    :cond_9
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    :goto_7
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v72
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v7, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    if-eqz v72, :cond_38

    move/from16 v8, v19

    :try_start_1
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_a

    move-object v8, v4

    goto :goto_8

    :cond_a
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    :goto_8
    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v9, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v73

    if-eqz v73, :cond_37

    move/from16 v8, v20

    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_b

    move-object v8, v4

    goto :goto_9

    :cond_b
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    :goto_9
    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v9, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v74
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v8, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Int>\', but it was NULL."

    if-eqz v74, :cond_36

    move/from16 v9, v21

    :try_start_2
    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v10

    if-eqz v10, :cond_c

    move-object v9, v4

    goto :goto_a

    :cond_c
    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    :goto_a
    iget-object v10, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v10, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v75

    if-eqz v75, :cond_35

    move/from16 v9, v22

    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_d

    move-object v8, v4

    goto :goto_b

    :cond_d
    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    :goto_b
    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reactionGroupConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;

    invoke-virtual {v9, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;->stringToReactionGroupEntityMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v76

    if-eqz v76, :cond_34

    move/from16 v8, v23

    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_e

    move-object/from16 v77, v4

    :goto_c
    move/from16 v8, v24

    goto :goto_d

    :cond_e
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v77, v8

    goto :goto_c

    :goto_d
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_f

    move-object/from16 v78, v4

    :goto_e
    move/from16 v8, v25

    goto :goto_f

    :cond_f
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v78, v8

    goto :goto_e

    :goto_f
    invoke-interface {v3, v8}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_10

    const/16 v79, 0x1

    :goto_10
    move/from16 v8, v26

    goto :goto_11

    :cond_10
    const/16 v79, 0x0

    goto :goto_10

    :goto_11
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_11

    move-object v8, v4

    goto :goto_12

    :cond_11
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    :goto_12
    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v9, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToStringMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v80

    if-eqz v80, :cond_33

    move/from16 v8, v27

    invoke-interface {v3, v8}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_12

    const/16 v81, 0x1

    :goto_13
    move/from16 v8, v28

    goto :goto_14

    :cond_12
    const/16 v81, 0x0

    goto :goto_13

    :goto_14
    invoke-interface {v3, v8}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_13

    const/16 v83, 0x1

    :goto_15
    move/from16 v8, v29

    goto :goto_16

    :cond_13
    const/16 v83, 0x0

    goto :goto_15

    :goto_16
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_14

    move-object v8, v4

    goto :goto_17

    :cond_14
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    :goto_17
    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v9, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v84

    if-eqz v84, :cond_32

    move/from16 v8, v30

    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_15

    move-object/from16 v85, v4

    :goto_18
    move/from16 v8, v31

    goto :goto_19

    :cond_15
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v85, v8

    goto :goto_18

    :goto_19
    invoke-interface {v3, v8}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_16

    const/16 v86, 0x1

    :goto_1a
    move/from16 v8, v32

    goto :goto_1b

    :cond_16
    const/16 v86, 0x0

    goto :goto_1a

    :goto_1b
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_17

    move-object v8, v4

    goto :goto_1c

    :cond_17
    invoke-interface {v3, v8}, Ltb/c;->getLong(I)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    :goto_1c
    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v9, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v87

    move/from16 v8, v33

    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_18

    move-object v8, v4

    goto :goto_1d

    :cond_18
    invoke-interface {v3, v8}, Ltb/c;->getLong(I)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    :goto_1d
    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v9, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v88

    move/from16 v8, v34

    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_19

    move-object/from16 v89, v4

    :goto_1e
    move/from16 v8, v35

    goto :goto_1f

    :cond_19
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v89, v8

    goto :goto_1e

    :goto_1f
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1a

    move-object v8, v4

    goto :goto_20

    :cond_1a
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    :goto_20
    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v9, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v90

    if-eqz v90, :cond_31

    move/from16 v8, v36

    invoke-interface {v3, v8}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_1b

    const/16 v91, 0x1

    :goto_21
    move/from16 v8, v37

    goto :goto_22

    :cond_1b
    const/16 v91, 0x0

    goto :goto_21

    :goto_22
    invoke-interface {v3, v8}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_1c

    const/16 v92, 0x1

    :goto_23
    move/from16 v8, v38

    goto :goto_24

    :cond_1c
    const/16 v92, 0x0

    goto :goto_23

    :goto_24
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1d

    move-object v8, v4

    goto :goto_25

    :cond_1d
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    :goto_25
    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationDetailsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    invoke-virtual {v9, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;->stringToModerationDetails(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-result-object v93

    move/from16 v8, v39

    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1e

    move-object v8, v4

    goto :goto_26

    :cond_1e
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    :goto_26
    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;

    invoke-virtual {v9, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;->stringToModeration(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    move-result-object v94

    move/from16 v8, v40

    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1f

    move-object v8, v4

    goto :goto_27

    :cond_1f
    invoke-interface {v3, v8}, Ltb/c;->getLong(I)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    :goto_27
    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v9, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v95

    move/from16 v8, v41

    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_20

    move-object/from16 v96, v4

    :goto_28
    move/from16 v8, v42

    goto :goto_29

    :cond_20
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v96, v8

    goto :goto_28

    :goto_29
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_21

    move-object v8, v4

    goto :goto_2a

    :cond_21
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    :goto_2a
    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v9, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v97

    if-eqz v97, :cond_30

    move/from16 v8, v43

    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_22

    move-object v7, v4

    goto :goto_2b

    :cond_22
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    :goto_2b
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reminderInfoConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;->stringToReminderInfo(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-result-object v98

    move/from16 v7, v44

    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_23

    move-object v7, v4

    goto :goto_2c

    :cond_23
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    :goto_2c
    iget-object v0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    invoke-virtual {v0, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;->stringToLocation(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    move-result-object v99

    move/from16 v0, v45

    invoke-interface {v3, v0}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_24

    move-object/from16 v100, v4

    :goto_2d
    move/from16 v0, v46

    goto :goto_2e

    :cond_24
    invoke-interface {v3, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v100, v0

    goto :goto_2d

    :goto_2e
    invoke-interface {v3, v0}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v0, v7

    if-eqz v0, :cond_25

    const/16 v101, 0x1

    :goto_2f
    move/from16 v0, v47

    goto :goto_30

    :cond_25
    const/16 v101, 0x0

    goto :goto_2f

    :goto_30
    invoke-interface {v3, v0}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_2a

    move/from16 v7, v48

    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_29

    move/from16 v8, v49

    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_28

    move/from16 v9, v50

    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v10

    if-eqz v10, :cond_27

    move/from16 v10, v51

    invoke-interface {v3, v10}, Ltb/c;->isNull(I)Z

    move-result v11

    if-nez v11, :cond_26

    goto :goto_34

    :cond_26
    move-object/from16 v82, v4

    goto/16 :goto_3b

    :cond_27
    :goto_31
    move/from16 v10, v51

    goto :goto_34

    :cond_28
    :goto_32
    move/from16 v9, v50

    goto :goto_31

    :cond_29
    :goto_33
    move/from16 v8, v49

    goto :goto_32

    :cond_2a
    move/from16 v7, v48

    goto :goto_33

    :goto_34
    invoke-interface {v3, v0}, Ltb/c;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_2b

    move-object/from16 v18, v4

    goto :goto_35

    :cond_2b
    invoke-interface {v3, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v18, v0

    :goto_35
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_2c

    move-object/from16 v19, v4

    goto :goto_36

    :cond_2c
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v19, v0

    :goto_36
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_2d

    move-object/from16 v20, v4

    goto :goto_37

    :cond_2d
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v20, v0

    :goto_37
    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_2e

    move-object/from16 v21, v4

    goto :goto_38

    :cond_2e
    invoke-interface {v3, v9}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v0, v7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v21, v0

    :goto_38
    invoke-interface {v3, v10}, Ltb/c;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_2f

    :goto_39
    move-object/from16 v22, v4

    goto :goto_3a

    :cond_2f
    invoke-interface {v3, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_39

    :goto_3a
    new-instance v17, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    invoke-direct/range {v17 .. v22}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    move-object/from16 v82, v17

    :goto_3b
    new-instance v57, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    move/from16 v65, v1

    move/from16 v66, v6

    invoke-direct/range {v57 .. v101}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)V

    move-object/from16 v0, v57

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/List;

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v15}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/util/List;

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v14}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/util/List;

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-direct {v2, v0, v1, v4, v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    move-object v4, v2

    goto :goto_3c

    :cond_30
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_31
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_32
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_33
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.String>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_35
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_37
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_39
    :goto_3c
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    return-object v4

    :goto_3d
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final selectByCidAndUserId$lambda$20(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 109

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    const-string v2, "getValue(...)"

    const-string v3, "_connection"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v3

    const/4 v4, 0x1

    move-object/from16 v5, p1

    :try_start_0
    invoke-interface {v3, v4, v5}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v5, 0x2

    move-object/from16 v6, p2

    invoke-interface {v3, v5, v6}, Ltb/c;->L(ILjava/lang/String;)V

    const-string v5, "id"

    invoke-static {v3, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "cid"

    invoke-static {v3, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "userId"

    invoke-static {v3, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "text"

    invoke-static {v3, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "html"

    invoke-static {v3, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "type"

    invoke-static {v3, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "syncStatus"

    invoke-static {v3, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "replyCount"

    invoke-static {v3, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "deletedReplyCount"

    invoke-static {v3, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "createdAt"

    invoke-static {v3, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "createdLocallyAt"

    invoke-static {v3, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v4, "updatedAt"

    invoke-static {v3, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move-object/from16 v16, v2

    const-string v2, "updatedLocallyAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p1, v2

    const-string v2, "deletedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p2, v2

    const-string v2, "remoteMentionedUserIds"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v17, v2

    const-string v2, "mentionedUsersId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v18, v2

    const-string v2, "reactionCounts"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v19, v2

    const-string v2, "reactionScores"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v20, v2

    const-string v2, "reactionGroups"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v21, v2

    const-string v2, "parentId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v22, v2

    const-string v2, "command"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v23, v2

    const-string v2, "shadowed"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v24, v2

    const-string v2, "i18n"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v25, v2

    const-string v2, "showInChannel"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v26, v2

    const-string v2, "silent"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v27, v2

    const-string v2, "extraData"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v28, v2

    const-string v2, "replyToId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v29, v2

    const-string v2, "pinned"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v30, v2

    const-string v2, "pinnedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v31, v2

    const-string v2, "pinExpires"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v32, v2

    const-string v2, "pinnedByUserId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v33, v2

    const-string v2, "threadParticipantsIds"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v34, v2

    const-string v2, "skipPushNotification"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v35, v2

    const-string v2, "skipEnrichUrl"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v36, v2

    const-string v2, "moderationDetails"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v37, v2

    const-string v2, "moderation"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v38, v2

    const-string v2, "messageTextUpdatedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v39, v2

    const-string v2, "pollId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v40, v2

    const-string v2, "restrictedVisibility"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v41, v2

    const-string v2, "reminder"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v42, v2

    const-string v2, "sharedLocation"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v43, v2

    const-string v2, "channelRole"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v44, v2

    const-string v2, "deletedForMe"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v45, v2

    const-string v2, "channel_infocid"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v46, v2

    const-string v2, "channel_infoid"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v47, v2

    const-string v2, "channel_infotype"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v48, v2

    const-string v2, "channel_infomemberCount"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v49, v2

    const-string v2, "channel_infoname"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v50, v2

    new-instance v2, La0/g;

    move/from16 v51, v4

    const/4 v4, 0x0

    invoke-direct {v2, v4}, La0/f1;-><init>(I)V

    move/from16 v52, v15

    new-instance v15, La0/g;

    invoke-direct {v15, v4}, La0/f1;-><init>(I)V

    move/from16 v53, v14

    new-instance v14, La0/g;

    invoke-direct {v14, v4}, La0/f1;-><init>(I)V

    :goto_0
    invoke-interface {v3}, Ltb/c;->e1()Z

    move-result v54

    if-eqz v54, :cond_3

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v55

    if-nez v55, :cond_0

    move/from16 v55, v13

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v4, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_50

    :cond_0
    move/from16 v55, v13

    :goto_1
    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15, v4}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_1

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v15, v4, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14, v4}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_2

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v14, v4, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    move/from16 v13, v55

    const/4 v4, 0x0

    goto :goto_0

    :cond_3
    move/from16 v55, v13

    invoke-interface {v3}, Ltb/c;->reset()V

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v1, v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v1, v14}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    invoke-interface {v3}, Ltb/c;->e1()Z

    move-result v4

    if-eqz v4, :cond_39

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v57

    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v58

    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v59

    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v60

    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v61

    invoke-interface {v3, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v62

    move v4, v6

    move v13, v7

    invoke-interface {v3, v11}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v63

    invoke-interface {v3, v12}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    move/from16 v101, v9

    move/from16 v7, v55

    move/from16 v55, v8

    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    move/from16 v9, v53

    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v53

    const/16 v56, 0x0

    if-eqz v53, :cond_4

    move/from16 p4, v4

    move-object/from16 v4, v56

    :goto_3
    move/from16 v64, v6

    goto :goto_4

    :cond_4
    invoke-interface {v3, v9}, Ltb/c;->getLong(I)J

    move-result-wide v64

    invoke-static/range {v64 .. v65}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v53

    move/from16 p4, v4

    move-object/from16 v4, v53

    goto :goto_3

    :goto_4
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v66

    move/from16 v4, v52

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_5

    move-object/from16 v6, v56

    :goto_5
    move/from16 v52, v4

    goto :goto_6

    :cond_5
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v52

    invoke-static/range {v52 .. v53}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_5

    :goto_6
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v67

    move/from16 v4, v51

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_6

    move-object/from16 v6, v56

    :goto_7
    move/from16 v51, v4

    goto :goto_8

    :cond_6
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v68

    invoke-static/range {v68 .. v69}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_7

    :goto_8
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v68

    move/from16 v4, p1

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_7

    move-object/from16 v6, v56

    :goto_9
    move/from16 p1, v4

    goto :goto_a

    :cond_7
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v69

    invoke-static/range {v69 .. v70}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_9

    :goto_a
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v69

    move/from16 v4, p2

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_8

    move-object/from16 v6, v56

    :goto_b
    move/from16 p2, v4

    goto :goto_c

    :cond_8
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v70

    invoke-static/range {v70 .. v71}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_b

    :goto_c
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v70

    move/from16 v4, v17

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_9

    move-object/from16 v6, v56

    :goto_d
    move/from16 v17, v4

    goto :goto_e

    :cond_9
    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_d

    :goto_e
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v71
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    if-eqz v71, :cond_38

    move/from16 v6, v18

    :try_start_1
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v18

    if-eqz v18, :cond_a

    move/from16 v53, v6

    move-object/from16 v6, v56

    :goto_f
    move/from16 v18, v7

    goto :goto_10

    :cond_a
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18

    move/from16 v53, v6

    move-object/from16 v6, v18

    goto :goto_f

    :goto_10
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v72

    if-eqz v72, :cond_37

    move/from16 v6, v19

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_b

    move-object/from16 v7, v56

    :goto_11
    move/from16 v19, v6

    goto :goto_12

    :cond_b
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_11

    :goto_12
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v73
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v6, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Int>\', but it was NULL."

    if-eqz v73, :cond_36

    move/from16 v7, v20

    :try_start_2
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v20

    if-eqz v20, :cond_c

    move/from16 v102, v7

    move-object/from16 v7, v56

    :goto_13
    move/from16 v65, v8

    goto :goto_14

    :cond_c
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v20

    move/from16 v102, v7

    move-object/from16 v7, v20

    goto :goto_13

    :goto_14
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v74

    if-eqz v74, :cond_35

    move/from16 v7, v21

    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_d

    move-object/from16 v6, v56

    goto :goto_15

    :cond_d
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_15
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reactionGroupConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;

    invoke-virtual {v8, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;->stringToReactionGroupEntityMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v75

    if-eqz v75, :cond_34

    move/from16 v6, v22

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_e

    move-object/from16 v76, v56

    :goto_16
    move/from16 v8, v23

    goto :goto_17

    :cond_e
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v76, v8

    goto :goto_16

    :goto_17
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v20

    if-eqz v20, :cond_f

    move-object/from16 v77, v56

    :goto_18
    move/from16 v22, v6

    move/from16 v21, v7

    move/from16 v23, v8

    move/from16 v6, v24

    goto :goto_19

    :cond_f
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v77, v20

    goto :goto_18

    :goto_19
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_10

    const/16 v78, 0x1

    :goto_1a
    move/from16 v7, v25

    goto :goto_1b

    :cond_10
    const/16 v78, 0x0

    goto :goto_1a

    :goto_1b
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_11

    move-object/from16 v8, v56

    :goto_1c
    move/from16 v24, v6

    goto :goto_1d

    :cond_11
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_1c

    :goto_1d
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToStringMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v79

    if-eqz v79, :cond_33

    move/from16 v25, v7

    move/from16 v6, v26

    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_12

    const/16 v80, 0x1

    :goto_1e
    move/from16 v20, v9

    move/from16 v7, v27

    goto :goto_1f

    :cond_12
    const/16 v80, 0x0

    goto :goto_1e

    :goto_1f
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_13

    const/16 v82, 0x1

    :goto_20
    move/from16 v8, v28

    goto :goto_21

    :cond_13
    const/16 v82, 0x0

    goto :goto_20

    :goto_21
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_14

    move-object/from16 v9, v56

    :goto_22
    move/from16 v26, v6

    goto :goto_23

    :cond_14
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_22

    :goto_23
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v83

    if-eqz v83, :cond_32

    move/from16 v6, v29

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_15

    move-object/from16 v84, v56

    :goto_24
    move/from16 v29, v6

    move/from16 v27, v7

    move/from16 v9, v30

    goto :goto_25

    :cond_15
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v84, v9

    goto :goto_24

    :goto_25
    invoke-interface {v3, v9}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    if-eqz v6, :cond_16

    const/16 v85, 0x1

    :goto_26
    move/from16 v6, v31

    goto :goto_27

    :cond_16
    const/16 v85, 0x0

    goto :goto_26

    :goto_27
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_17

    move-object/from16 v7, v56

    :goto_28
    move/from16 v31, v6

    goto :goto_29

    :cond_17
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v30

    invoke-static/range {v30 .. v31}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_28

    :goto_29
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v86

    move/from16 v6, v32

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_18

    move-object/from16 v7, v56

    :goto_2a
    move/from16 v32, v6

    goto :goto_2b

    :cond_18
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v87

    invoke-static/range {v87 .. v88}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_2a

    :goto_2b
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v87

    move/from16 v6, v33

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_19

    move-object/from16 v88, v56

    :goto_2c
    move/from16 v7, v34

    goto :goto_2d

    :cond_19
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v88, v7

    goto :goto_2c

    :goto_2d
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v28

    if-eqz v28, :cond_1a

    move/from16 v33, v6

    move-object/from16 v6, v56

    :goto_2e
    move/from16 v34, v7

    goto :goto_2f

    :cond_1a
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v28

    move/from16 v33, v6

    move-object/from16 v6, v28

    goto :goto_2e

    :goto_2f
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v89

    if-eqz v89, :cond_31

    move/from16 v28, v8

    move/from16 v6, v35

    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_1b

    const/16 v90, 0x1

    :goto_30
    move/from16 v30, v9

    move/from16 v7, v36

    goto :goto_31

    :cond_1b
    const/16 v90, 0x0

    goto :goto_30

    :goto_31
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_1c

    const/16 v91, 0x1

    :goto_32
    move/from16 v8, v37

    goto :goto_33

    :cond_1c
    const/16 v91, 0x0

    goto :goto_32

    :goto_33
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1d

    move-object/from16 v9, v56

    :goto_34
    move/from16 v35, v6

    goto :goto_35

    :cond_1d
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_34

    :goto_35
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationDetailsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;->stringToModerationDetails(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-result-object v92

    move/from16 v6, v38

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1e

    move-object/from16 v9, v56

    :goto_36
    move/from16 v38, v6

    goto :goto_37

    :cond_1e
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_36

    :goto_37
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;->stringToModeration(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    move-result-object v93

    move/from16 v6, v39

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1f

    move-object/from16 v9, v56

    :goto_38
    move/from16 v39, v6

    goto :goto_39

    :cond_1f
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v36

    invoke-static/range {v36 .. v37}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    goto :goto_38

    :goto_39
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v94

    move/from16 v6, v40

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_20

    move-object/from16 v95, v56

    :goto_3a
    move/from16 v9, v41

    goto :goto_3b

    :cond_20
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v95, v9

    goto :goto_3a

    :goto_3b
    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v36

    if-eqz v36, :cond_21

    move/from16 v40, v6

    move-object/from16 v6, v56

    :goto_3c
    move/from16 v36, v7

    goto :goto_3d

    :cond_21
    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v36

    move/from16 v40, v6

    move-object/from16 v6, v36

    goto :goto_3c

    :goto_3d
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v96

    if-eqz v96, :cond_30

    move/from16 v6, v42

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_22

    move-object/from16 v4, v56

    goto :goto_3e

    :cond_22
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    :goto_3e
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reminderInfoConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    invoke-virtual {v7, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;->stringToReminderInfo(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-result-object v97

    move/from16 v4, v43

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_23

    move-object/from16 v7, v56

    :goto_3f
    move/from16 v43, v4

    goto :goto_40

    :cond_23
    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_3f

    :goto_40
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    invoke-virtual {v4, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;->stringToLocation(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    move-result-object v98

    move/from16 v4, v44

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_24

    move-object/from16 v99, v56

    :goto_41
    move/from16 v37, v8

    move/from16 v41, v9

    move/from16 v7, v45

    goto :goto_42

    :cond_24
    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v99, v7

    goto :goto_41

    :goto_42
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_25

    const/16 v100, 0x1

    :goto_43
    move/from16 v8, v46

    goto :goto_44

    :cond_25
    const/16 v100, 0x0

    goto :goto_43

    :goto_44
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_2a

    move/from16 v9, v47

    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v42

    if-eqz v42, :cond_29

    move/from16 v0, v48

    invoke-interface {v3, v0}, Ltb/c;->isNull(I)Z

    move-result v42

    if-eqz v42, :cond_28

    move/from16 v44, v4

    move/from16 v4, v49

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v42

    if-eqz v42, :cond_27

    move/from16 v42, v6

    move/from16 v6, v50

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v45

    if-nez v45, :cond_26

    goto :goto_48

    :cond_26
    move/from16 v45, v7

    move/from16 v46, v8

    move-object/from16 v81, v56

    goto/16 :goto_4f

    :cond_27
    move/from16 v42, v6

    :goto_45
    move/from16 v6, v50

    goto :goto_48

    :cond_28
    move/from16 v44, v4

    move/from16 v42, v6

    :goto_46
    move/from16 v4, v49

    goto :goto_45

    :cond_29
    move/from16 v44, v4

    move/from16 v42, v6

    :goto_47
    move/from16 v0, v48

    goto :goto_46

    :cond_2a
    move/from16 v44, v4

    move/from16 v42, v6

    move/from16 v9, v47

    goto :goto_47

    :goto_48
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2b

    move-object/from16 v104, v56

    goto :goto_49

    :cond_2b
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v45

    move-object/from16 v104, v45

    :goto_49
    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2c

    move-object/from16 v105, v56

    goto :goto_4a

    :cond_2c
    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v45

    move-object/from16 v105, v45

    :goto_4a
    invoke-interface {v3, v0}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2d

    move-object/from16 v106, v56

    goto :goto_4b

    :cond_2d
    invoke-interface {v3, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v45

    move-object/from16 v106, v45

    :goto_4b
    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2e

    move/from16 v45, v7

    move/from16 v46, v8

    move-object/from16 v107, v56

    goto :goto_4c

    :cond_2e
    move/from16 v45, v7

    move/from16 v46, v8

    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object/from16 v107, v7

    :goto_4c
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_2f

    :goto_4d
    move-object/from16 v108, v56

    goto :goto_4e

    :cond_2f
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v56

    goto :goto_4d

    :goto_4e
    new-instance v103, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    invoke-direct/range {v103 .. v108}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    move-object/from16 v81, v103

    :goto_4f
    new-instance v56, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    invoke-direct/range {v56 .. v100}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)V

    move-object/from16 v7, v56

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v2}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v8

    move/from16 v48, v0

    move-object/from16 v0, v16

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Ljava/util/List;

    move-object/from16 v16, v2

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v15}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/List;

    move/from16 v49, v4

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v14}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/util/List;

    move-object/from16 v47, v0

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-direct {v0, v7, v8, v2, v4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p3

    move/from16 v50, v6

    move v7, v13

    move-object/from16 v2, v16

    move-object/from16 v16, v47

    move/from16 v8, v55

    move/from16 v6, p4

    move/from16 v47, v9

    move/from16 v55, v18

    move/from16 v18, v53

    move/from16 v9, v101

    move/from16 v53, v20

    move/from16 v20, v102

    goto/16 :goto_2

    :cond_30
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_31
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_32
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_33
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.String>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_35
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_37
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_39
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    return-object v1

    :goto_50
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final selectBySyncStatus$lambda$18(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/models/SyncStatus;ILtb/a;)Ljava/util/List;
    .locals 108

    move-object/from16 v0, p1

    move-object/from16 v1, p4

    const-string v2, "getValue(...)"

    const-string v3, "_connection"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v3

    :try_start_0
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    move-object/from16 v5, p2

    invoke-virtual {v4, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->syncStatusToString(Lio/getstream/chat/android/models/SyncStatus;)I

    move-result v4

    int-to-long v4, v4

    const/4 v6, 0x1

    invoke-interface {v3, v6, v4, v5}, Ltb/c;->p(IJ)V

    const/4 v4, 0x2

    move/from16 v5, p3

    int-to-long v7, v5

    invoke-interface {v3, v4, v7, v8}, Ltb/c;->p(IJ)V

    const-string v4, "id"

    invoke-static {v3, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "cid"

    invoke-static {v3, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v7, "userId"

    invoke-static {v3, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "text"

    invoke-static {v3, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "html"

    invoke-static {v3, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "type"

    invoke-static {v3, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "syncStatus"

    invoke-static {v3, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "replyCount"

    invoke-static {v3, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "deletedReplyCount"

    invoke-static {v3, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "createdAt"

    invoke-static {v3, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "createdLocallyAt"

    invoke-static {v3, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v6, "updatedAt"

    invoke-static {v3, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    move-object/from16 v16, v2

    const-string v2, "updatedLocallyAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p2, v2

    const-string v2, "deletedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p3, v2

    const-string v2, "remoteMentionedUserIds"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v17, v2

    const-string v2, "mentionedUsersId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v18, v2

    const-string v2, "reactionCounts"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v19, v2

    const-string v2, "reactionScores"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v20, v2

    const-string v2, "reactionGroups"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v21, v2

    const-string v2, "parentId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v22, v2

    const-string v2, "command"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v23, v2

    const-string v2, "shadowed"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v24, v2

    const-string v2, "i18n"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v25, v2

    const-string v2, "showInChannel"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v26, v2

    const-string v2, "silent"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v27, v2

    const-string v2, "extraData"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v28, v2

    const-string v2, "replyToId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v29, v2

    const-string v2, "pinned"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v30, v2

    const-string v2, "pinnedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v31, v2

    const-string v2, "pinExpires"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v32, v2

    const-string v2, "pinnedByUserId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v33, v2

    const-string v2, "threadParticipantsIds"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v34, v2

    const-string v2, "skipPushNotification"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v35, v2

    const-string v2, "skipEnrichUrl"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v36, v2

    const-string v2, "moderationDetails"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v37, v2

    const-string v2, "moderation"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v38, v2

    const-string v2, "messageTextUpdatedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v39, v2

    const-string v2, "pollId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v40, v2

    const-string v2, "restrictedVisibility"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v41, v2

    const-string v2, "reminder"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v42, v2

    const-string v2, "sharedLocation"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v43, v2

    const-string v2, "channelRole"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v44, v2

    const-string v2, "deletedForMe"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v45, v2

    const-string v2, "channel_infocid"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v46, v2

    const-string v2, "channel_infoid"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v47, v2

    const-string v2, "channel_infotype"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v48, v2

    const-string v2, "channel_infomemberCount"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v49, v2

    const-string v2, "channel_infoname"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v50, v2

    new-instance v2, La0/g;

    move/from16 v51, v6

    const/4 v6, 0x0

    invoke-direct {v2, v6}, La0/f1;-><init>(I)V

    move/from16 v52, v15

    new-instance v15, La0/g;

    invoke-direct {v15, v6}, La0/f1;-><init>(I)V

    move/from16 v53, v14

    new-instance v14, La0/g;

    invoke-direct {v14, v6}, La0/f1;-><init>(I)V

    :goto_0
    invoke-interface {v3}, Ltb/c;->e1()Z

    move-result v54

    if-eqz v54, :cond_3

    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v55

    if-nez v55, :cond_0

    move/from16 v55, v13

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v6, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_4f

    :cond_0
    move/from16 v55, v13

    :goto_1
    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v15, v6}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_1

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v15, v6, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v14, v6}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_2

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v14, v6, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    move/from16 v13, v55

    const/4 v6, 0x0

    goto :goto_0

    :cond_3
    move/from16 v55, v13

    invoke-interface {v3}, Ltb/c;->reset()V

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v1, v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v1, v14}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    invoke-interface {v3}, Ltb/c;->e1()Z

    move-result v6

    if-eqz v6, :cond_39

    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v57

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v58

    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v59

    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v60

    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v61

    invoke-interface {v3, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v62

    move v13, v5

    invoke-interface {v3, v11}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v63

    invoke-interface {v3, v12}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    move/from16 v101, v8

    move/from16 v6, v55

    move/from16 v55, v7

    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    move/from16 v8, v53

    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v53

    const/16 v56, 0x0

    if-eqz v53, :cond_4

    move/from16 v64, v5

    move-object/from16 v5, v56

    :goto_3
    move/from16 v53, v6

    goto :goto_4

    :cond_4
    invoke-interface {v3, v8}, Ltb/c;->getLong(I)J

    move-result-wide v64

    invoke-static/range {v64 .. v65}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v53

    move/from16 v64, v5

    move-object/from16 v5, v53

    goto :goto_3

    :goto_4
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v66

    move/from16 v5, v52

    invoke-interface {v3, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_5

    move-object/from16 v6, v56

    :goto_5
    move/from16 v52, v5

    goto :goto_6

    :cond_5
    invoke-interface {v3, v5}, Ltb/c;->getLong(I)J

    move-result-wide v67

    invoke-static/range {v67 .. v68}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_5

    :goto_6
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v67

    move/from16 v5, v51

    invoke-interface {v3, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_6

    move-object/from16 v6, v56

    :goto_7
    move/from16 v51, v5

    goto :goto_8

    :cond_6
    invoke-interface {v3, v5}, Ltb/c;->getLong(I)J

    move-result-wide v68

    invoke-static/range {v68 .. v69}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_7

    :goto_8
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v68

    move/from16 v5, p2

    invoke-interface {v3, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_7

    move-object/from16 v6, v56

    :goto_9
    move/from16 p2, v5

    goto :goto_a

    :cond_7
    invoke-interface {v3, v5}, Ltb/c;->getLong(I)J

    move-result-wide v69

    invoke-static/range {v69 .. v70}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_9

    :goto_a
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v69

    move/from16 v5, p3

    invoke-interface {v3, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_8

    move-object/from16 v6, v56

    :goto_b
    move/from16 p3, v5

    goto :goto_c

    :cond_8
    invoke-interface {v3, v5}, Ltb/c;->getLong(I)J

    move-result-wide v70

    invoke-static/range {v70 .. v71}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_b

    :goto_c
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v70

    move/from16 v5, v17

    invoke-interface {v3, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_9

    move-object/from16 v6, v56

    :goto_d
    move/from16 v17, v5

    goto :goto_e

    :cond_9
    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_d

    :goto_e
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v71
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    if-eqz v71, :cond_38

    move/from16 v6, v18

    :try_start_1
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v18

    if-eqz v18, :cond_a

    move/from16 p4, v6

    move-object/from16 v6, v56

    :goto_f
    move/from16 v65, v7

    goto :goto_10

    :cond_a
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18

    move/from16 p4, v6

    move-object/from16 v6, v18

    goto :goto_f

    :goto_10
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v72

    if-eqz v72, :cond_37

    move/from16 v6, v19

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_b

    move-object/from16 v7, v56

    :goto_11
    move/from16 v19, v6

    goto :goto_12

    :cond_b
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_11

    :goto_12
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v73
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v6, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Int>\', but it was NULL."

    if-eqz v73, :cond_36

    move/from16 v7, v20

    :try_start_2
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v18

    if-eqz v18, :cond_c

    move/from16 v20, v7

    move-object/from16 v7, v56

    :goto_13
    move/from16 v18, v8

    goto :goto_14

    :cond_c
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18

    move/from16 v20, v7

    move-object/from16 v7, v18

    goto :goto_13

    :goto_14
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v74

    if-eqz v74, :cond_35

    move/from16 v7, v21

    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_d

    move-object/from16 v6, v56

    goto :goto_15

    :cond_d
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_15
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reactionGroupConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;

    invoke-virtual {v8, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;->stringToReactionGroupEntityMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v75

    if-eqz v75, :cond_34

    move/from16 v6, v22

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_e

    move-object/from16 v76, v56

    :goto_16
    move/from16 v8, v23

    goto :goto_17

    :cond_e
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v76, v8

    goto :goto_16

    :goto_17
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v21

    if-eqz v21, :cond_f

    move-object/from16 v77, v56

    move/from16 v22, v6

    move/from16 v21, v7

    move/from16 v23, v8

    move/from16 v6, v24

    goto :goto_18

    :cond_f
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v21

    move-object/from16 v77, v21

    move/from16 v22, v6

    move/from16 v23, v8

    move/from16 v6, v24

    move/from16 v21, v7

    :goto_18
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_10

    const/16 v78, 0x1

    :goto_19
    move/from16 v7, v25

    goto :goto_1a

    :cond_10
    const/16 v78, 0x0

    goto :goto_19

    :goto_1a
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_11

    move-object/from16 v8, v56

    :goto_1b
    move/from16 v24, v6

    goto :goto_1c

    :cond_11
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_1b

    :goto_1c
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToStringMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v79

    if-eqz v79, :cond_33

    move/from16 v25, v7

    move/from16 v6, v26

    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_12

    const/16 v80, 0x1

    :goto_1d
    move/from16 v26, v9

    move/from16 v7, v27

    goto :goto_1e

    :cond_12
    const/16 v80, 0x0

    goto :goto_1d

    :goto_1e
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_13

    const/16 v82, 0x1

    :goto_1f
    move/from16 v8, v28

    goto :goto_20

    :cond_13
    const/16 v82, 0x0

    goto :goto_1f

    :goto_20
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_14

    move-object/from16 v9, v56

    :goto_21
    move/from16 v27, v6

    goto :goto_22

    :cond_14
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_21

    :goto_22
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v83

    if-eqz v83, :cond_32

    move/from16 v6, v29

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_15

    move-object/from16 v84, v56

    :goto_23
    move/from16 v29, v6

    move/from16 v28, v7

    move/from16 v9, v30

    goto :goto_24

    :cond_15
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v84, v9

    goto :goto_23

    :goto_24
    invoke-interface {v3, v9}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    if-eqz v6, :cond_16

    const/16 v85, 0x1

    :goto_25
    move/from16 v6, v31

    goto :goto_26

    :cond_16
    const/16 v85, 0x0

    goto :goto_25

    :goto_26
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_17

    move-object/from16 v7, v56

    :goto_27
    move/from16 v31, v6

    goto :goto_28

    :cond_17
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v30

    invoke-static/range {v30 .. v31}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_27

    :goto_28
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v86

    move/from16 v6, v32

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_18

    move-object/from16 v7, v56

    :goto_29
    move/from16 v32, v6

    goto :goto_2a

    :cond_18
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v87

    invoke-static/range {v87 .. v88}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_29

    :goto_2a
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v87

    move/from16 v6, v33

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_19

    move-object/from16 v88, v56

    :goto_2b
    move/from16 v7, v34

    goto :goto_2c

    :cond_19
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v88, v7

    goto :goto_2b

    :goto_2c
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v30

    if-eqz v30, :cond_1a

    move/from16 v33, v6

    move-object/from16 v6, v56

    :goto_2d
    move/from16 v34, v7

    goto :goto_2e

    :cond_1a
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v30

    move/from16 v33, v6

    move-object/from16 v6, v30

    goto :goto_2d

    :goto_2e
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v89

    if-eqz v89, :cond_31

    move/from16 v30, v8

    move/from16 v6, v35

    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_1b

    const/16 v90, 0x1

    :goto_2f
    move/from16 v35, v9

    move/from16 v7, v36

    goto :goto_30

    :cond_1b
    const/16 v90, 0x0

    goto :goto_2f

    :goto_30
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_1c

    const/16 v91, 0x1

    :goto_31
    move/from16 v8, v37

    goto :goto_32

    :cond_1c
    const/16 v91, 0x0

    goto :goto_31

    :goto_32
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1d

    move-object/from16 v9, v56

    :goto_33
    move/from16 v36, v6

    goto :goto_34

    :cond_1d
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_33

    :goto_34
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationDetailsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;->stringToModerationDetails(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-result-object v92

    move/from16 v6, v38

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1e

    move-object/from16 v9, v56

    :goto_35
    move/from16 v38, v6

    goto :goto_36

    :cond_1e
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_35

    :goto_36
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;->stringToModeration(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    move-result-object v93

    move/from16 v6, v39

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1f

    move-object/from16 v9, v56

    :goto_37
    move/from16 v39, v6

    goto :goto_38

    :cond_1f
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v94

    invoke-static/range {v94 .. v95}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    goto :goto_37

    :goto_38
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v94

    move/from16 v6, v40

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_20

    move-object/from16 v95, v56

    :goto_39
    move/from16 v9, v41

    goto :goto_3a

    :cond_20
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v95, v9

    goto :goto_39

    :goto_3a
    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v37

    if-eqz v37, :cond_21

    move/from16 v40, v6

    move-object/from16 v6, v56

    :goto_3b
    move/from16 v37, v7

    goto :goto_3c

    :cond_21
    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v37

    move/from16 v40, v6

    move-object/from16 v6, v37

    goto :goto_3b

    :goto_3c
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v96

    if-eqz v96, :cond_30

    move/from16 v6, v42

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_22

    move-object/from16 v5, v56

    goto :goto_3d

    :cond_22
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    :goto_3d
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reminderInfoConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    invoke-virtual {v7, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;->stringToReminderInfo(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-result-object v97

    move/from16 v5, v43

    invoke-interface {v3, v5}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_23

    move-object/from16 v7, v56

    :goto_3e
    move/from16 v43, v5

    goto :goto_3f

    :cond_23
    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_3e

    :goto_3f
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    invoke-virtual {v5, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;->stringToLocation(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    move-result-object v98

    move/from16 v5, v44

    invoke-interface {v3, v5}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_24

    move-object/from16 v99, v56

    :goto_40
    move/from16 v44, v5

    move/from16 v42, v6

    move/from16 v7, v45

    goto :goto_41

    :cond_24
    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v99, v7

    goto :goto_40

    :goto_41
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    if-eqz v5, :cond_25

    const/16 v100, 0x1

    :goto_42
    move/from16 v5, v46

    goto :goto_43

    :cond_25
    const/16 v100, 0x0

    goto :goto_42

    :goto_43
    invoke-interface {v3, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_2a

    move/from16 v6, v47

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v41

    if-eqz v41, :cond_29

    move/from16 v0, v48

    invoke-interface {v3, v0}, Ltb/c;->isNull(I)Z

    move-result v41

    if-eqz v41, :cond_28

    move/from16 v45, v7

    move/from16 v7, v49

    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v41

    if-eqz v41, :cond_27

    move/from16 v41, v8

    move/from16 v8, v50

    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v46

    if-nez v46, :cond_26

    goto :goto_47

    :cond_26
    move/from16 v46, v5

    move/from16 v47, v6

    move-object/from16 v81, v56

    goto/16 :goto_4e

    :cond_27
    move/from16 v41, v8

    :goto_44
    move/from16 v8, v50

    goto :goto_47

    :cond_28
    move/from16 v45, v7

    move/from16 v41, v8

    :goto_45
    move/from16 v7, v49

    goto :goto_44

    :cond_29
    move/from16 v45, v7

    move/from16 v41, v8

    :goto_46
    move/from16 v0, v48

    goto :goto_45

    :cond_2a
    move/from16 v45, v7

    move/from16 v41, v8

    move/from16 v6, v47

    goto :goto_46

    :goto_47
    invoke-interface {v3, v5}, Ltb/c;->isNull(I)Z

    move-result v46

    if-eqz v46, :cond_2b

    move-object/from16 v103, v56

    goto :goto_48

    :cond_2b
    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v46

    move-object/from16 v103, v46

    :goto_48
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v46

    if-eqz v46, :cond_2c

    move-object/from16 v104, v56

    goto :goto_49

    :cond_2c
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v46

    move-object/from16 v104, v46

    :goto_49
    invoke-interface {v3, v0}, Ltb/c;->isNull(I)Z

    move-result v46

    if-eqz v46, :cond_2d

    move-object/from16 v105, v56

    goto :goto_4a

    :cond_2d
    invoke-interface {v3, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v46

    move-object/from16 v105, v46

    :goto_4a
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v46

    if-eqz v46, :cond_2e

    move/from16 v46, v5

    move/from16 v47, v6

    move-object/from16 v106, v56

    goto :goto_4b

    :cond_2e
    move/from16 v46, v5

    move/from16 v47, v6

    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v106, v5

    :goto_4b
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_2f

    :goto_4c
    move-object/from16 v107, v56

    goto :goto_4d

    :cond_2f
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v56

    goto :goto_4c

    :goto_4d
    new-instance v102, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    invoke-direct/range {v102 .. v107}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    move-object/from16 v81, v102

    :goto_4e
    new-instance v56, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    invoke-direct/range {v56 .. v100}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)V

    move-object/from16 v5, v56

    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    move/from16 v48, v0

    move-object/from16 v0, v16

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/util/List;

    move-object/from16 v16, v2

    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v15}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/List;

    move/from16 v49, v7

    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v14}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/util/List;

    move-object/from16 v50, v0

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-direct {v0, v5, v6, v2, v7}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, v41

    move/from16 v41, v9

    move/from16 v9, v26

    move/from16 v26, v27

    move/from16 v27, v28

    move/from16 v28, v30

    move/from16 v30, v35

    move/from16 v35, v36

    move/from16 v36, v37

    move/from16 v37, v0

    move-object/from16 v0, p1

    move v5, v13

    move-object/from16 v2, v16

    move-object/from16 v16, v50

    move/from16 v7, v55

    move/from16 v50, v8

    move/from16 v55, v53

    move/from16 v8, v101

    move/from16 v53, v18

    move/from16 v18, p4

    goto/16 :goto_2

    :cond_30
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_31
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_32
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_33
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.String>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_35
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_37
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_39
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    return-object v1

    :goto_4f
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final selectBySyncStatusOrTypeForChannel$lambda$23(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 107

    move-object/from16 v0, p5

    move-object/from16 v1, p6

    const-string v2, "getValue(...)"

    const-string v3, "_connection"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v3

    const/4 v4, 0x1

    move-object/from16 v5, p1

    :try_start_0
    invoke-interface {v3, v4, v5}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v6, 0x2

    move v7, v6

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    int-to-long v8, v8

    invoke-interface {v3, v7, v8, v9}, Ltb/c;->p(IJ)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_52

    :cond_0
    add-int/lit8 v5, p3, 0x2

    invoke-interface/range {p4 .. p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v3, v5, v7}, Ltb/c;->L(ILjava/lang/String;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    const-string v5, "id"

    invoke-static {v3, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "cid"

    invoke-static {v3, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "userId"

    invoke-static {v3, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "text"

    invoke-static {v3, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "html"

    invoke-static {v3, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "type"

    invoke-static {v3, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "syncStatus"

    invoke-static {v3, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "replyCount"

    invoke-static {v3, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "deletedReplyCount"

    invoke-static {v3, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "createdAt"

    invoke-static {v3, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "createdLocallyAt"

    invoke-static {v3, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v4, "updatedAt"

    invoke-static {v3, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move-object/from16 v16, v2

    const-string v2, "updatedLocallyAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p1, v2

    const-string v2, "deletedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p2, v2

    const-string v2, "remoteMentionedUserIds"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p3, v2

    const-string v2, "mentionedUsersId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p4, v2

    const-string v2, "reactionCounts"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v17, v2

    const-string v2, "reactionScores"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v18, v2

    const-string v2, "reactionGroups"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v19, v2

    const-string v2, "parentId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v20, v2

    const-string v2, "command"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v21, v2

    const-string v2, "shadowed"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v22, v2

    const-string v2, "i18n"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v23, v2

    const-string v2, "showInChannel"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v24, v2

    const-string v2, "silent"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v25, v2

    const-string v2, "extraData"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v26, v2

    const-string v2, "replyToId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v27, v2

    const-string v2, "pinned"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v28, v2

    const-string v2, "pinnedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v29, v2

    const-string v2, "pinExpires"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v30, v2

    const-string v2, "pinnedByUserId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v31, v2

    const-string v2, "threadParticipantsIds"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v32, v2

    const-string v2, "skipPushNotification"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v33, v2

    const-string v2, "skipEnrichUrl"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v34, v2

    const-string v2, "moderationDetails"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v35, v2

    const-string v2, "moderation"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v36, v2

    const-string v2, "messageTextUpdatedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v37, v2

    const-string v2, "pollId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v38, v2

    const-string v2, "restrictedVisibility"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v39, v2

    const-string v2, "reminder"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v40, v2

    const-string v2, "sharedLocation"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v41, v2

    const-string v2, "channelRole"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v42, v2

    const-string v2, "deletedForMe"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v43, v2

    const-string v2, "channel_infocid"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v44, v2

    const-string v2, "channel_infoid"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v45, v2

    const-string v2, "channel_infotype"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v46, v2

    const-string v2, "channel_infomemberCount"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v47, v2

    const-string v2, "channel_infoname"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v48, v2

    new-instance v2, La0/g;

    move/from16 v49, v4

    const/4 v4, 0x0

    invoke-direct {v2, v4}, La0/f1;-><init>(I)V

    move/from16 v50, v15

    new-instance v15, La0/g;

    invoke-direct {v15, v4}, La0/f1;-><init>(I)V

    move/from16 v51, v14

    new-instance v14, La0/g;

    invoke-direct {v14, v4}, La0/f1;-><init>(I)V

    :goto_2
    invoke-interface {v3}, Ltb/c;->e1()Z

    move-result v52

    if-eqz v52, :cond_5

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v53

    if-nez v53, :cond_2

    move/from16 v53, v13

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v4, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_2
    move/from16 v53, v13

    :goto_3
    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15, v4}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v15, v4, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14, v4}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_4

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v14, v4, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    move/from16 v13, v53

    const/4 v4, 0x0

    goto :goto_2

    :cond_5
    move/from16 v53, v13

    invoke-interface {v3}, Ltb/c;->reset()V

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v1, v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v1, v14}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_4
    invoke-interface {v3}, Ltb/c;->e1()Z

    move-result v4

    if-eqz v4, :cond_3b

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v55

    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v56

    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v57

    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v58

    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v59

    invoke-interface {v3, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v60

    move v4, v6

    move v13, v7

    invoke-interface {v3, v11}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v61

    invoke-interface {v3, v12}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    move/from16 v99, v9

    move/from16 v7, v53

    move/from16 v53, v8

    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    move/from16 v9, v51

    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v51

    const/16 v54, 0x0

    if-eqz v51, :cond_6

    move/from16 p6, v4

    move-object/from16 v4, v54

    :goto_5
    move/from16 v62, v6

    goto :goto_6

    :cond_6
    invoke-interface {v3, v9}, Ltb/c;->getLong(I)J

    move-result-wide v62

    invoke-static/range {v62 .. v63}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v51

    move/from16 p6, v4

    move-object/from16 v4, v51

    goto :goto_5

    :goto_6
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v64

    move/from16 v4, v50

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_7

    move-object/from16 v6, v54

    :goto_7
    move/from16 v50, v4

    goto :goto_8

    :cond_7
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v50

    invoke-static/range {v50 .. v51}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_7

    :goto_8
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v65

    move/from16 v4, v49

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_8

    move-object/from16 v6, v54

    :goto_9
    move/from16 v49, v4

    goto :goto_a

    :cond_8
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v66

    invoke-static/range {v66 .. v67}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_9

    :goto_a
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v66

    move/from16 v4, p1

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_9

    move-object/from16 v6, v54

    :goto_b
    move/from16 p1, v4

    goto :goto_c

    :cond_9
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v67

    invoke-static/range {v67 .. v68}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_b

    :goto_c
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v67

    move/from16 v4, p2

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_a

    move-object/from16 v6, v54

    :goto_d
    move/from16 p2, v4

    goto :goto_e

    :cond_a
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v68

    invoke-static/range {v68 .. v69}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_d

    :goto_e
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v68

    move/from16 v4, p3

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_b

    move-object/from16 v6, v54

    :goto_f
    move/from16 p3, v4

    goto :goto_10

    :cond_b
    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_f

    :goto_10
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v69
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    if-eqz v69, :cond_3a

    move/from16 v6, p4

    :try_start_1
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v51

    if-eqz v51, :cond_c

    move/from16 p4, v6

    move-object/from16 v6, v54

    :goto_11
    move/from16 v51, v7

    goto :goto_12

    :cond_c
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v51

    move/from16 p4, v6

    move-object/from16 v6, v51

    goto :goto_11

    :goto_12
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v70

    if-eqz v70, :cond_39

    move/from16 v6, v17

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_d

    move-object/from16 v7, v54

    :goto_13
    move/from16 v17, v6

    goto :goto_14

    :cond_d
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_13

    :goto_14
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v71
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v6, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Int>\', but it was NULL."

    if-eqz v71, :cond_38

    move/from16 v7, v18

    :try_start_2
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v18

    if-eqz v18, :cond_e

    move/from16 v100, v7

    move-object/from16 v7, v54

    :goto_15
    move/from16 v63, v8

    goto :goto_16

    :cond_e
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18

    move/from16 v100, v7

    move-object/from16 v7, v18

    goto :goto_15

    :goto_16
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v72

    if-eqz v72, :cond_37

    move/from16 v7, v19

    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_f

    move-object/from16 v6, v54

    goto :goto_17

    :cond_f
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_17
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reactionGroupConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;

    invoke-virtual {v8, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;->stringToReactionGroupEntityMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v73

    if-eqz v73, :cond_36

    move/from16 v6, v20

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_10

    move-object/from16 v74, v54

    :goto_18
    move/from16 v8, v21

    goto :goto_19

    :cond_10
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v74, v8

    goto :goto_18

    :goto_19
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v18

    if-eqz v18, :cond_11

    move-object/from16 v75, v54

    :goto_1a
    move/from16 v20, v6

    move/from16 v19, v7

    move/from16 v21, v8

    move/from16 v6, v22

    goto :goto_1b

    :cond_11
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v75, v18

    goto :goto_1a

    :goto_1b
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_12

    const/16 v76, 0x1

    :goto_1c
    move/from16 v7, v23

    goto :goto_1d

    :cond_12
    const/16 v76, 0x0

    goto :goto_1c

    :goto_1d
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_13

    move-object/from16 v8, v54

    :goto_1e
    move/from16 v22, v6

    goto :goto_1f

    :cond_13
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_1e

    :goto_1f
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToStringMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v77

    if-eqz v77, :cond_35

    move/from16 v23, v7

    move/from16 v6, v24

    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_14

    const/16 v78, 0x1

    :goto_20
    move/from16 v18, v9

    move/from16 v7, v25

    goto :goto_21

    :cond_14
    const/16 v78, 0x0

    goto :goto_20

    :goto_21
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_15

    const/16 v80, 0x1

    :goto_22
    move/from16 v8, v26

    goto :goto_23

    :cond_15
    const/16 v80, 0x0

    goto :goto_22

    :goto_23
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_16

    move-object/from16 v9, v54

    :goto_24
    move/from16 v24, v6

    goto :goto_25

    :cond_16
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_24

    :goto_25
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v81

    if-eqz v81, :cond_34

    move/from16 v6, v27

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_17

    move-object/from16 v82, v54

    :goto_26
    move/from16 v27, v6

    move/from16 v25, v7

    move/from16 v9, v28

    goto :goto_27

    :cond_17
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v82, v9

    goto :goto_26

    :goto_27
    invoke-interface {v3, v9}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    if-eqz v6, :cond_18

    const/16 v83, 0x1

    :goto_28
    move/from16 v6, v29

    goto :goto_29

    :cond_18
    const/16 v83, 0x0

    goto :goto_28

    :goto_29
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_19

    move-object/from16 v7, v54

    :goto_2a
    move/from16 v29, v6

    goto :goto_2b

    :cond_19
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v28

    invoke-static/range {v28 .. v29}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_2a

    :goto_2b
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v84

    move/from16 v6, v30

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_1a

    move-object/from16 v7, v54

    :goto_2c
    move/from16 v30, v6

    goto :goto_2d

    :cond_1a
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v85

    invoke-static/range {v85 .. v86}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_2c

    :goto_2d
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v85

    move/from16 v6, v31

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_1b

    move-object/from16 v86, v54

    :goto_2e
    move/from16 v7, v32

    goto :goto_2f

    :cond_1b
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v86, v7

    goto :goto_2e

    :goto_2f
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v26

    if-eqz v26, :cond_1c

    move/from16 v31, v6

    move-object/from16 v6, v54

    :goto_30
    move/from16 v32, v7

    goto :goto_31

    :cond_1c
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v26

    move/from16 v31, v6

    move-object/from16 v6, v26

    goto :goto_30

    :goto_31
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v87

    if-eqz v87, :cond_33

    move/from16 v26, v8

    move/from16 v6, v33

    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_1d

    const/16 v88, 0x1

    :goto_32
    move/from16 v28, v9

    move/from16 v7, v34

    goto :goto_33

    :cond_1d
    const/16 v88, 0x0

    goto :goto_32

    :goto_33
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_1e

    const/16 v89, 0x1

    :goto_34
    move/from16 v8, v35

    goto :goto_35

    :cond_1e
    const/16 v89, 0x0

    goto :goto_34

    :goto_35
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1f

    move-object/from16 v9, v54

    :goto_36
    move/from16 v33, v6

    goto :goto_37

    :cond_1f
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_36

    :goto_37
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationDetailsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;->stringToModerationDetails(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-result-object v90

    move/from16 v6, v36

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_20

    move-object/from16 v9, v54

    :goto_38
    move/from16 v36, v6

    goto :goto_39

    :cond_20
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_38

    :goto_39
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;->stringToModeration(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    move-result-object v91

    move/from16 v6, v37

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_21

    move-object/from16 v9, v54

    :goto_3a
    move/from16 v37, v6

    goto :goto_3b

    :cond_21
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v34

    invoke-static/range {v34 .. v35}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    goto :goto_3a

    :goto_3b
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v92

    move/from16 v6, v38

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_22

    move-object/from16 v93, v54

    :goto_3c
    move/from16 v9, v39

    goto :goto_3d

    :cond_22
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v93, v9

    goto :goto_3c

    :goto_3d
    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v34

    if-eqz v34, :cond_23

    move/from16 v38, v6

    move-object/from16 v6, v54

    :goto_3e
    move/from16 v34, v7

    goto :goto_3f

    :cond_23
    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v34

    move/from16 v38, v6

    move-object/from16 v6, v34

    goto :goto_3e

    :goto_3f
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v94

    if-eqz v94, :cond_32

    move/from16 v6, v40

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_24

    move-object/from16 v4, v54

    goto :goto_40

    :cond_24
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    :goto_40
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reminderInfoConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    invoke-virtual {v7, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;->stringToReminderInfo(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-result-object v95

    move/from16 v4, v41

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_25

    move-object/from16 v7, v54

    :goto_41
    move/from16 v41, v4

    goto :goto_42

    :cond_25
    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_41

    :goto_42
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    invoke-virtual {v4, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;->stringToLocation(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    move-result-object v96

    move/from16 v4, v42

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_26

    move-object/from16 v97, v54

    :goto_43
    move/from16 v35, v8

    move/from16 v39, v9

    move/from16 v7, v43

    goto :goto_44

    :cond_26
    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v97, v7

    goto :goto_43

    :goto_44
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_27

    const/16 v98, 0x1

    :goto_45
    move/from16 v8, v44

    goto :goto_46

    :cond_27
    const/16 v98, 0x0

    goto :goto_45

    :goto_46
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_2c

    move/from16 v9, v45

    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v40

    if-eqz v40, :cond_2b

    move/from16 v0, v46

    invoke-interface {v3, v0}, Ltb/c;->isNull(I)Z

    move-result v40

    if-eqz v40, :cond_2a

    move/from16 v42, v4

    move/from16 v4, v47

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v40

    if-eqz v40, :cond_29

    move/from16 v40, v6

    move/from16 v6, v48

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v43

    if-nez v43, :cond_28

    goto :goto_4a

    :cond_28
    move/from16 v43, v7

    move/from16 v44, v8

    move-object/from16 v79, v54

    goto/16 :goto_51

    :cond_29
    move/from16 v40, v6

    :goto_47
    move/from16 v6, v48

    goto :goto_4a

    :cond_2a
    move/from16 v42, v4

    move/from16 v40, v6

    :goto_48
    move/from16 v4, v47

    goto :goto_47

    :cond_2b
    move/from16 v42, v4

    move/from16 v40, v6

    :goto_49
    move/from16 v0, v46

    goto :goto_48

    :cond_2c
    move/from16 v42, v4

    move/from16 v40, v6

    move/from16 v9, v45

    goto :goto_49

    :goto_4a
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v43

    if-eqz v43, :cond_2d

    move-object/from16 v102, v54

    goto :goto_4b

    :cond_2d
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v43

    move-object/from16 v102, v43

    :goto_4b
    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v43

    if-eqz v43, :cond_2e

    move-object/from16 v103, v54

    goto :goto_4c

    :cond_2e
    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v43

    move-object/from16 v103, v43

    :goto_4c
    invoke-interface {v3, v0}, Ltb/c;->isNull(I)Z

    move-result v43

    if-eqz v43, :cond_2f

    move-object/from16 v104, v54

    goto :goto_4d

    :cond_2f
    invoke-interface {v3, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v43

    move-object/from16 v104, v43

    :goto_4d
    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v43

    if-eqz v43, :cond_30

    move/from16 v43, v7

    move/from16 v44, v8

    move-object/from16 v105, v54

    goto :goto_4e

    :cond_30
    move/from16 v43, v7

    move/from16 v44, v8

    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object/from16 v105, v7

    :goto_4e
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_31

    :goto_4f
    move-object/from16 v106, v54

    goto :goto_50

    :cond_31
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v54

    goto :goto_4f

    :goto_50
    new-instance v101, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    invoke-direct/range {v101 .. v106}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    move-object/from16 v79, v101

    :goto_51
    new-instance v54, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    invoke-direct/range {v54 .. v98}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)V

    move-object/from16 v7, v54

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v2}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v8

    move/from16 v46, v0

    move-object/from16 v0, v16

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Ljava/util/List;

    move-object/from16 v16, v2

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v15}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/List;

    move/from16 v47, v4

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v14}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/util/List;

    move-object/from16 v45, v0

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-direct {v0, v7, v8, v2, v4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p5

    move/from16 v48, v6

    move v7, v13

    move-object/from16 v2, v16

    move-object/from16 v16, v45

    move/from16 v8, v53

    move/from16 v6, p6

    move/from16 v45, v9

    move/from16 v53, v51

    move/from16 v9, v99

    move/from16 v51, v18

    move/from16 v18, v100

    goto/16 :goto_4

    :cond_32
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_33
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_35
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.String>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_37
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_39
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3b
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    return-object v1

    :goto_52
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final selectByUserId$lambda$19(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 110

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "getValue(...)"

    const-string v3, "_connection"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v3

    const/4 v4, 0x1

    move-object/from16 v5, p1

    :try_start_0
    invoke-interface {v3, v4, v5}, Ltb/c;->L(ILjava/lang/String;)V

    const-string v5, "id"

    invoke-static {v3, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "cid"

    invoke-static {v3, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "userId"

    invoke-static {v3, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "text"

    invoke-static {v3, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "html"

    invoke-static {v3, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "type"

    invoke-static {v3, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "syncStatus"

    invoke-static {v3, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "replyCount"

    invoke-static {v3, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "deletedReplyCount"

    invoke-static {v3, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "createdAt"

    invoke-static {v3, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "createdLocallyAt"

    invoke-static {v3, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v4, "updatedAt"

    invoke-static {v3, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move-object/from16 v16, v2

    const-string v2, "updatedLocallyAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p1, v2

    const-string v2, "deletedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v17, v2

    const-string v2, "remoteMentionedUserIds"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v18, v2

    const-string v2, "mentionedUsersId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v19, v2

    const-string v2, "reactionCounts"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v20, v2

    const-string v2, "reactionScores"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v21, v2

    const-string v2, "reactionGroups"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v22, v2

    const-string v2, "parentId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v23, v2

    const-string v2, "command"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v24, v2

    const-string v2, "shadowed"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v25, v2

    const-string v2, "i18n"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v26, v2

    const-string v2, "showInChannel"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v27, v2

    const-string v2, "silent"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v28, v2

    const-string v2, "extraData"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v29, v2

    const-string v2, "replyToId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v30, v2

    const-string v2, "pinned"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v31, v2

    const-string v2, "pinnedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v32, v2

    const-string v2, "pinExpires"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v33, v2

    const-string v2, "pinnedByUserId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v34, v2

    const-string v2, "threadParticipantsIds"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v35, v2

    const-string v2, "skipPushNotification"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v36, v2

    const-string v2, "skipEnrichUrl"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v37, v2

    const-string v2, "moderationDetails"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v38, v2

    const-string v2, "moderation"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v39, v2

    const-string v2, "messageTextUpdatedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v40, v2

    const-string v2, "pollId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v41, v2

    const-string v2, "restrictedVisibility"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v42, v2

    const-string v2, "reminder"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v43, v2

    const-string v2, "sharedLocation"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v44, v2

    const-string v2, "channelRole"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v45, v2

    const-string v2, "deletedForMe"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v46, v2

    const-string v2, "channel_infocid"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v47, v2

    const-string v2, "channel_infoid"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v48, v2

    const-string v2, "channel_infotype"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v49, v2

    const-string v2, "channel_infomemberCount"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v50, v2

    const-string v2, "channel_infoname"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v51, v2

    new-instance v2, La0/g;

    move/from16 v52, v4

    const/4 v4, 0x0

    invoke-direct {v2, v4}, La0/f1;-><init>(I)V

    move/from16 v53, v15

    new-instance v15, La0/g;

    invoke-direct {v15, v4}, La0/f1;-><init>(I)V

    move/from16 v54, v14

    new-instance v14, La0/g;

    invoke-direct {v14, v4}, La0/f1;-><init>(I)V

    :goto_0
    invoke-interface {v3}, Ltb/c;->e1()Z

    move-result v55

    if-eqz v55, :cond_3

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v56

    if-nez v56, :cond_0

    move/from16 v56, v13

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v4, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_50

    :cond_0
    move/from16 v56, v13

    :goto_1
    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15, v4}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_1

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v15, v4, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14, v4}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_2

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v14, v4, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    move/from16 v13, v56

    const/4 v4, 0x0

    goto :goto_0

    :cond_3
    move/from16 v56, v13

    invoke-interface {v3}, Ltb/c;->reset()V

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v1, v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v1, v14}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    invoke-interface {v3}, Ltb/c;->e1()Z

    move-result v4

    if-eqz v4, :cond_39

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v58

    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v59

    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v60

    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v61

    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v62

    invoke-interface {v3, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v63

    move v4, v6

    move v13, v7

    invoke-interface {v3, v11}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v64

    invoke-interface {v3, v12}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    move/from16 v102, v9

    move/from16 v7, v56

    move/from16 v56, v8

    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    move/from16 v9, v54

    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v54

    const/16 v57, 0x0

    if-eqz v54, :cond_4

    move/from16 p3, v4

    move-object/from16 v4, v57

    :goto_3
    move/from16 v65, v6

    goto :goto_4

    :cond_4
    invoke-interface {v3, v9}, Ltb/c;->getLong(I)J

    move-result-wide v65

    invoke-static/range {v65 .. v66}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v54

    move/from16 p3, v4

    move-object/from16 v4, v54

    goto :goto_3

    :goto_4
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v67

    move/from16 v4, v53

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_5

    move-object/from16 v6, v57

    :goto_5
    move/from16 v53, v4

    goto :goto_6

    :cond_5
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v53

    invoke-static/range {v53 .. v54}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_5

    :goto_6
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v68

    move/from16 v4, v52

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_6

    move-object/from16 v6, v57

    :goto_7
    move/from16 v52, v4

    goto :goto_8

    :cond_6
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v69

    invoke-static/range {v69 .. v70}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_7

    :goto_8
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v69

    move/from16 v4, p1

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_7

    move-object/from16 v6, v57

    :goto_9
    move/from16 p1, v4

    goto :goto_a

    :cond_7
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v70

    invoke-static/range {v70 .. v71}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_9

    :goto_a
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v70

    move/from16 v4, v17

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_8

    move-object/from16 v6, v57

    :goto_b
    move/from16 v17, v4

    goto :goto_c

    :cond_8
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v71

    invoke-static/range {v71 .. v72}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_b

    :goto_c
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v71

    move/from16 v4, v18

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_9

    move-object/from16 v6, v57

    :goto_d
    move/from16 v18, v4

    goto :goto_e

    :cond_9
    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_d

    :goto_e
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v72
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    if-eqz v72, :cond_38

    move/from16 v6, v19

    :try_start_1
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v19

    if-eqz v19, :cond_a

    move/from16 v54, v6

    move-object/from16 v6, v57

    :goto_f
    move/from16 v19, v7

    goto :goto_10

    :cond_a
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v19

    move/from16 v54, v6

    move-object/from16 v6, v19

    goto :goto_f

    :goto_10
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v73

    if-eqz v73, :cond_37

    move/from16 v6, v20

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_b

    move-object/from16 v7, v57

    :goto_11
    move/from16 v20, v6

    goto :goto_12

    :cond_b
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_11

    :goto_12
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v74
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v6, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Int>\', but it was NULL."

    if-eqz v74, :cond_36

    move/from16 v7, v21

    :try_start_2
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v21

    if-eqz v21, :cond_c

    move/from16 v103, v7

    move-object/from16 v7, v57

    :goto_13
    move/from16 v66, v8

    goto :goto_14

    :cond_c
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v21

    move/from16 v103, v7

    move-object/from16 v7, v21

    goto :goto_13

    :goto_14
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v75

    if-eqz v75, :cond_35

    move/from16 v7, v22

    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_d

    move-object/from16 v6, v57

    goto :goto_15

    :cond_d
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_15
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reactionGroupConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;

    invoke-virtual {v8, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;->stringToReactionGroupEntityMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v76

    if-eqz v76, :cond_34

    move/from16 v6, v23

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_e

    move-object/from16 v77, v57

    :goto_16
    move/from16 v8, v24

    goto :goto_17

    :cond_e
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v77, v8

    goto :goto_16

    :goto_17
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v21

    if-eqz v21, :cond_f

    move-object/from16 v78, v57

    :goto_18
    move/from16 v23, v6

    move/from16 v22, v7

    move/from16 v24, v8

    move/from16 v6, v25

    goto :goto_19

    :cond_f
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v21

    move-object/from16 v78, v21

    goto :goto_18

    :goto_19
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_10

    const/16 v79, 0x1

    :goto_1a
    move/from16 v7, v26

    goto :goto_1b

    :cond_10
    const/16 v79, 0x0

    goto :goto_1a

    :goto_1b
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_11

    move-object/from16 v8, v57

    :goto_1c
    move/from16 v25, v6

    goto :goto_1d

    :cond_11
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_1c

    :goto_1d
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToStringMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v80

    if-eqz v80, :cond_33

    move/from16 v26, v7

    move/from16 v6, v27

    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_12

    const/16 v81, 0x1

    :goto_1e
    move/from16 v21, v9

    move/from16 v7, v28

    goto :goto_1f

    :cond_12
    const/16 v81, 0x0

    goto :goto_1e

    :goto_1f
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_13

    const/16 v83, 0x1

    :goto_20
    move/from16 v8, v29

    goto :goto_21

    :cond_13
    const/16 v83, 0x0

    goto :goto_20

    :goto_21
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_14

    move-object/from16 v9, v57

    :goto_22
    move/from16 v27, v6

    goto :goto_23

    :cond_14
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_22

    :goto_23
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v84

    if-eqz v84, :cond_32

    move/from16 v6, v30

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_15

    move-object/from16 v85, v57

    :goto_24
    move/from16 v30, v6

    move/from16 v28, v7

    move/from16 v9, v31

    goto :goto_25

    :cond_15
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v85, v9

    goto :goto_24

    :goto_25
    invoke-interface {v3, v9}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    if-eqz v6, :cond_16

    const/16 v86, 0x1

    :goto_26
    move/from16 v6, v32

    goto :goto_27

    :cond_16
    const/16 v86, 0x0

    goto :goto_26

    :goto_27
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_17

    move-object/from16 v7, v57

    :goto_28
    move/from16 v32, v6

    goto :goto_29

    :cond_17
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v31

    invoke-static/range {v31 .. v32}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_28

    :goto_29
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v87

    move/from16 v6, v33

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_18

    move-object/from16 v7, v57

    :goto_2a
    move/from16 v33, v6

    goto :goto_2b

    :cond_18
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v88

    invoke-static/range {v88 .. v89}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_2a

    :goto_2b
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v88

    move/from16 v6, v34

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_19

    move-object/from16 v89, v57

    :goto_2c
    move/from16 v7, v35

    goto :goto_2d

    :cond_19
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v89, v7

    goto :goto_2c

    :goto_2d
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v29

    if-eqz v29, :cond_1a

    move/from16 v34, v6

    move-object/from16 v6, v57

    :goto_2e
    move/from16 v35, v7

    goto :goto_2f

    :cond_1a
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v29

    move/from16 v34, v6

    move-object/from16 v6, v29

    goto :goto_2e

    :goto_2f
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v90

    if-eqz v90, :cond_31

    move/from16 v29, v8

    move/from16 v6, v36

    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_1b

    const/16 v91, 0x1

    :goto_30
    move/from16 v31, v9

    move/from16 v7, v37

    goto :goto_31

    :cond_1b
    const/16 v91, 0x0

    goto :goto_30

    :goto_31
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_1c

    const/16 v92, 0x1

    :goto_32
    move/from16 v8, v38

    goto :goto_33

    :cond_1c
    const/16 v92, 0x0

    goto :goto_32

    :goto_33
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1d

    move-object/from16 v9, v57

    :goto_34
    move/from16 v36, v6

    goto :goto_35

    :cond_1d
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_34

    :goto_35
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationDetailsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;->stringToModerationDetails(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-result-object v93

    move/from16 v6, v39

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1e

    move-object/from16 v9, v57

    :goto_36
    move/from16 v39, v6

    goto :goto_37

    :cond_1e
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_36

    :goto_37
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;->stringToModeration(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    move-result-object v94

    move/from16 v6, v40

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1f

    move-object/from16 v9, v57

    :goto_38
    move/from16 v40, v6

    goto :goto_39

    :cond_1f
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v37

    invoke-static/range {v37 .. v38}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    goto :goto_38

    :goto_39
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v95

    move/from16 v6, v41

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_20

    move-object/from16 v96, v57

    :goto_3a
    move/from16 v9, v42

    goto :goto_3b

    :cond_20
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v96, v9

    goto :goto_3a

    :goto_3b
    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v37

    if-eqz v37, :cond_21

    move/from16 v41, v6

    move-object/from16 v6, v57

    :goto_3c
    move/from16 v37, v7

    goto :goto_3d

    :cond_21
    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v37

    move/from16 v41, v6

    move-object/from16 v6, v37

    goto :goto_3c

    :goto_3d
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v97

    if-eqz v97, :cond_30

    move/from16 v6, v43

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_22

    move-object/from16 v4, v57

    goto :goto_3e

    :cond_22
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    :goto_3e
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reminderInfoConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    invoke-virtual {v7, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;->stringToReminderInfo(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-result-object v98

    move/from16 v4, v44

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_23

    move-object/from16 v7, v57

    :goto_3f
    move/from16 v44, v4

    goto :goto_40

    :cond_23
    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_3f

    :goto_40
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    invoke-virtual {v4, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;->stringToLocation(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    move-result-object v99

    move/from16 v4, v45

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_24

    move-object/from16 v100, v57

    :goto_41
    move/from16 v38, v8

    move/from16 v42, v9

    move/from16 v7, v46

    goto :goto_42

    :cond_24
    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v100, v7

    goto :goto_41

    :goto_42
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_25

    const/16 v101, 0x1

    :goto_43
    move/from16 v8, v47

    goto :goto_44

    :cond_25
    const/16 v101, 0x0

    goto :goto_43

    :goto_44
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_2a

    move/from16 v9, v48

    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v43

    if-eqz v43, :cond_29

    move/from16 v0, v49

    invoke-interface {v3, v0}, Ltb/c;->isNull(I)Z

    move-result v43

    if-eqz v43, :cond_28

    move/from16 v45, v4

    move/from16 v4, v50

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v43

    if-eqz v43, :cond_27

    move/from16 v43, v6

    move/from16 v6, v51

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v46

    if-nez v46, :cond_26

    goto :goto_48

    :cond_26
    move/from16 v46, v7

    move/from16 v47, v8

    move-object/from16 v82, v57

    goto/16 :goto_4f

    :cond_27
    move/from16 v43, v6

    :goto_45
    move/from16 v6, v51

    goto :goto_48

    :cond_28
    move/from16 v45, v4

    move/from16 v43, v6

    :goto_46
    move/from16 v4, v50

    goto :goto_45

    :cond_29
    move/from16 v45, v4

    move/from16 v43, v6

    :goto_47
    move/from16 v0, v49

    goto :goto_46

    :cond_2a
    move/from16 v45, v4

    move/from16 v43, v6

    move/from16 v9, v48

    goto :goto_47

    :goto_48
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v46

    if-eqz v46, :cond_2b

    move-object/from16 v105, v57

    goto :goto_49

    :cond_2b
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v46

    move-object/from16 v105, v46

    :goto_49
    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v46

    if-eqz v46, :cond_2c

    move-object/from16 v106, v57

    goto :goto_4a

    :cond_2c
    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v46

    move-object/from16 v106, v46

    :goto_4a
    invoke-interface {v3, v0}, Ltb/c;->isNull(I)Z

    move-result v46

    if-eqz v46, :cond_2d

    move-object/from16 v107, v57

    goto :goto_4b

    :cond_2d
    invoke-interface {v3, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v46

    move-object/from16 v107, v46

    :goto_4b
    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v46

    if-eqz v46, :cond_2e

    move/from16 v46, v7

    move/from16 v47, v8

    move-object/from16 v108, v57

    goto :goto_4c

    :cond_2e
    move/from16 v46, v7

    move/from16 v47, v8

    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object/from16 v108, v7

    :goto_4c
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_2f

    :goto_4d
    move-object/from16 v109, v57

    goto :goto_4e

    :cond_2f
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v57

    goto :goto_4d

    :goto_4e
    new-instance v104, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    invoke-direct/range {v104 .. v109}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    move-object/from16 v82, v104

    :goto_4f
    new-instance v57, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    invoke-direct/range {v57 .. v101}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)V

    move-object/from16 v7, v57

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v2}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v8

    move/from16 v49, v0

    move-object/from16 v0, v16

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Ljava/util/List;

    move-object/from16 v16, v2

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v15}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/List;

    move/from16 v50, v4

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v14}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/util/List;

    move-object/from16 v48, v0

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-direct {v0, v7, v8, v2, v4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p2

    move/from16 v51, v6

    move v7, v13

    move-object/from16 v2, v16

    move-object/from16 v16, v48

    move/from16 v8, v56

    move/from16 v6, p3

    move/from16 v48, v9

    move/from16 v56, v19

    move/from16 v19, v54

    move/from16 v9, v102

    move/from16 v54, v21

    move/from16 v21, v103

    goto/16 :goto_2

    :cond_30
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_31
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_32
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_33
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.String>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_35
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_37
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_39
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    return-object v1

    :goto_50
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final selectChunked$lambda$17(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 109

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "getValue(...)"

    const-string v3, "_connection"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v3

    :try_start_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v6, 0x1

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v3, v6, v7}, Ltb/c;->L(ILjava/lang/String;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_50

    :cond_0
    const-string v4, "id"

    invoke-static {v3, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v6, "cid"

    invoke-static {v3, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "userId"

    invoke-static {v3, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "text"

    invoke-static {v3, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "html"

    invoke-static {v3, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "type"

    invoke-static {v3, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "syncStatus"

    invoke-static {v3, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "replyCount"

    invoke-static {v3, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "deletedReplyCount"

    invoke-static {v3, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "createdAt"

    invoke-static {v3, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "createdLocallyAt"

    invoke-static {v3, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v5, "updatedAt"

    invoke-static {v3, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    move-object/from16 v16, v2

    const-string v2, "updatedLocallyAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p1, v2

    const-string v2, "deletedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v17, v2

    const-string v2, "remoteMentionedUserIds"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v18, v2

    const-string v2, "mentionedUsersId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v19, v2

    const-string v2, "reactionCounts"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v20, v2

    const-string v2, "reactionScores"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v21, v2

    const-string v2, "reactionGroups"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v22, v2

    const-string v2, "parentId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v23, v2

    const-string v2, "command"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v24, v2

    const-string v2, "shadowed"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v25, v2

    const-string v2, "i18n"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v26, v2

    const-string v2, "showInChannel"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v27, v2

    const-string v2, "silent"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v28, v2

    const-string v2, "extraData"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v29, v2

    const-string v2, "replyToId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v30, v2

    const-string v2, "pinned"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v31, v2

    const-string v2, "pinnedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v32, v2

    const-string v2, "pinExpires"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v33, v2

    const-string v2, "pinnedByUserId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v34, v2

    const-string v2, "threadParticipantsIds"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v35, v2

    const-string v2, "skipPushNotification"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v36, v2

    const-string v2, "skipEnrichUrl"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v37, v2

    const-string v2, "moderationDetails"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v38, v2

    const-string v2, "moderation"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v39, v2

    const-string v2, "messageTextUpdatedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v40, v2

    const-string v2, "pollId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v41, v2

    const-string v2, "restrictedVisibility"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v42, v2

    const-string v2, "reminder"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v43, v2

    const-string v2, "sharedLocation"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v44, v2

    const-string v2, "channelRole"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v45, v2

    const-string v2, "deletedForMe"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v46, v2

    const-string v2, "channel_infocid"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v47, v2

    const-string v2, "channel_infoid"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v48, v2

    const-string v2, "channel_infotype"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v49, v2

    const-string v2, "channel_infomemberCount"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v50, v2

    const-string v2, "channel_infoname"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v51, v2

    new-instance v2, La0/g;

    move/from16 v52, v5

    const/4 v5, 0x0

    invoke-direct {v2, v5}, La0/f1;-><init>(I)V

    move/from16 v53, v15

    new-instance v15, La0/g;

    invoke-direct {v15, v5}, La0/f1;-><init>(I)V

    move/from16 v54, v14

    new-instance v14, La0/g;

    invoke-direct {v14, v5}, La0/f1;-><init>(I)V

    :goto_1
    invoke-interface {v3}, Ltb/c;->e1()Z

    move-result v55

    if-eqz v55, :cond_4

    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v56

    if-nez v56, :cond_1

    move/from16 v56, v13

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v5, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_1
    move/from16 v56, v13

    :goto_2
    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v15, v5}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_2

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v15, v5, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v14, v5}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v14, v5, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    move/from16 v13, v56

    const/4 v5, 0x0

    goto :goto_1

    :cond_4
    move/from16 v56, v13

    invoke-interface {v3}, Ltb/c;->reset()V

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v1, v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v1, v14}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_3
    invoke-interface {v3}, Ltb/c;->e1()Z

    move-result v5

    if-eqz v5, :cond_3a

    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v58

    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v59

    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v60

    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v61

    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v62

    invoke-interface {v3, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v63

    move v13, v6

    invoke-interface {v3, v11}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v64

    invoke-interface {v3, v12}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    move/from16 v102, v8

    move/from16 v6, v56

    move/from16 v56, v7

    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    move/from16 v8, v54

    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v54

    const/16 v57, 0x0

    if-eqz v54, :cond_5

    move/from16 v65, v5

    move-object/from16 v5, v57

    :goto_4
    move/from16 v54, v6

    goto :goto_5

    :cond_5
    invoke-interface {v3, v8}, Ltb/c;->getLong(I)J

    move-result-wide v65

    invoke-static/range {v65 .. v66}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v54

    move/from16 v65, v5

    move-object/from16 v5, v54

    goto :goto_4

    :goto_5
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v67

    move/from16 v5, v53

    invoke-interface {v3, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_6

    move-object/from16 v6, v57

    :goto_6
    move/from16 v53, v5

    goto :goto_7

    :cond_6
    invoke-interface {v3, v5}, Ltb/c;->getLong(I)J

    move-result-wide v68

    invoke-static/range {v68 .. v69}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_6

    :goto_7
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v68

    move/from16 v5, v52

    invoke-interface {v3, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_7

    move-object/from16 v6, v57

    :goto_8
    move/from16 v52, v5

    goto :goto_9

    :cond_7
    invoke-interface {v3, v5}, Ltb/c;->getLong(I)J

    move-result-wide v69

    invoke-static/range {v69 .. v70}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_8

    :goto_9
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v69

    move/from16 v5, p1

    invoke-interface {v3, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_8

    move-object/from16 v6, v57

    :goto_a
    move/from16 p1, v5

    goto :goto_b

    :cond_8
    invoke-interface {v3, v5}, Ltb/c;->getLong(I)J

    move-result-wide v70

    invoke-static/range {v70 .. v71}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_a

    :goto_b
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v70

    move/from16 v5, v17

    invoke-interface {v3, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_9

    move-object/from16 v6, v57

    :goto_c
    move/from16 v17, v5

    goto :goto_d

    :cond_9
    invoke-interface {v3, v5}, Ltb/c;->getLong(I)J

    move-result-wide v71

    invoke-static/range {v71 .. v72}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_c

    :goto_d
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v71

    move/from16 v5, v18

    invoke-interface {v3, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_a

    move-object/from16 v6, v57

    :goto_e
    move/from16 v18, v5

    goto :goto_f

    :cond_a
    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_e

    :goto_f
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v72
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    if-eqz v72, :cond_39

    move/from16 v6, v19

    :try_start_1
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v19

    if-eqz v19, :cond_b

    move/from16 p3, v6

    move-object/from16 v6, v57

    :goto_10
    move/from16 v66, v7

    goto :goto_11

    :cond_b
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v19

    move/from16 p3, v6

    move-object/from16 v6, v19

    goto :goto_10

    :goto_11
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v73

    if-eqz v73, :cond_38

    move/from16 v6, v20

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_c

    move-object/from16 v7, v57

    :goto_12
    move/from16 v20, v6

    goto :goto_13

    :cond_c
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_12

    :goto_13
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v74
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v6, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Int>\', but it was NULL."

    if-eqz v74, :cond_37

    move/from16 v7, v21

    :try_start_2
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v19

    if-eqz v19, :cond_d

    move/from16 v21, v7

    move-object/from16 v7, v57

    :goto_14
    move/from16 v19, v8

    goto :goto_15

    :cond_d
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v19

    move/from16 v21, v7

    move-object/from16 v7, v19

    goto :goto_14

    :goto_15
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v75

    if-eqz v75, :cond_36

    move/from16 v7, v22

    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_e

    move-object/from16 v6, v57

    goto :goto_16

    :cond_e
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_16
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reactionGroupConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;

    invoke-virtual {v8, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;->stringToReactionGroupEntityMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v76

    if-eqz v76, :cond_35

    move/from16 v6, v23

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_f

    move-object/from16 v77, v57

    :goto_17
    move/from16 v8, v24

    goto :goto_18

    :cond_f
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v77, v8

    goto :goto_17

    :goto_18
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v22

    if-eqz v22, :cond_10

    move-object/from16 v78, v57

    move/from16 v23, v6

    move/from16 v22, v7

    move/from16 v24, v8

    move/from16 v6, v25

    goto :goto_19

    :cond_10
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v78, v22

    move/from16 v23, v6

    move/from16 v24, v8

    move/from16 v6, v25

    move/from16 v22, v7

    :goto_19
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_11

    const/16 v79, 0x1

    :goto_1a
    move/from16 v7, v26

    goto :goto_1b

    :cond_11
    const/16 v79, 0x0

    goto :goto_1a

    :goto_1b
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_12

    move-object/from16 v8, v57

    :goto_1c
    move/from16 v25, v6

    goto :goto_1d

    :cond_12
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_1c

    :goto_1d
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToStringMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v80

    if-eqz v80, :cond_34

    move/from16 v26, v7

    move/from16 v6, v27

    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_13

    const/16 v81, 0x1

    :goto_1e
    move/from16 v27, v9

    move/from16 v7, v28

    goto :goto_1f

    :cond_13
    const/16 v81, 0x0

    goto :goto_1e

    :goto_1f
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_14

    const/16 v83, 0x1

    :goto_20
    move/from16 v8, v29

    goto :goto_21

    :cond_14
    const/16 v83, 0x0

    goto :goto_20

    :goto_21
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_15

    move-object/from16 v9, v57

    :goto_22
    move/from16 v28, v6

    goto :goto_23

    :cond_15
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_22

    :goto_23
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v84

    if-eqz v84, :cond_33

    move/from16 v6, v30

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_16

    move-object/from16 v85, v57

    :goto_24
    move/from16 v30, v6

    move/from16 v29, v7

    move/from16 v9, v31

    goto :goto_25

    :cond_16
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v85, v9

    goto :goto_24

    :goto_25
    invoke-interface {v3, v9}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    if-eqz v6, :cond_17

    const/16 v86, 0x1

    :goto_26
    move/from16 v6, v32

    goto :goto_27

    :cond_17
    const/16 v86, 0x0

    goto :goto_26

    :goto_27
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_18

    move-object/from16 v7, v57

    :goto_28
    move/from16 v32, v6

    goto :goto_29

    :cond_18
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v31

    invoke-static/range {v31 .. v32}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_28

    :goto_29
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v87

    move/from16 v6, v33

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_19

    move-object/from16 v7, v57

    :goto_2a
    move/from16 v33, v6

    goto :goto_2b

    :cond_19
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v88

    invoke-static/range {v88 .. v89}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_2a

    :goto_2b
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v88

    move/from16 v6, v34

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_1a

    move-object/from16 v89, v57

    :goto_2c
    move/from16 v7, v35

    goto :goto_2d

    :cond_1a
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v89, v7

    goto :goto_2c

    :goto_2d
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v31

    if-eqz v31, :cond_1b

    move/from16 v34, v6

    move-object/from16 v6, v57

    :goto_2e
    move/from16 v35, v7

    goto :goto_2f

    :cond_1b
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v31

    move/from16 v34, v6

    move-object/from16 v6, v31

    goto :goto_2e

    :goto_2f
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v90

    if-eqz v90, :cond_32

    move/from16 v31, v8

    move/from16 v6, v36

    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_1c

    const/16 v91, 0x1

    :goto_30
    move/from16 v36, v9

    move/from16 v7, v37

    goto :goto_31

    :cond_1c
    const/16 v91, 0x0

    goto :goto_30

    :goto_31
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_1d

    const/16 v92, 0x1

    :goto_32
    move/from16 v8, v38

    goto :goto_33

    :cond_1d
    const/16 v92, 0x0

    goto :goto_32

    :goto_33
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1e

    move-object/from16 v9, v57

    :goto_34
    move/from16 v37, v6

    goto :goto_35

    :cond_1e
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_34

    :goto_35
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationDetailsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;->stringToModerationDetails(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-result-object v93

    move/from16 v6, v39

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1f

    move-object/from16 v9, v57

    :goto_36
    move/from16 v39, v6

    goto :goto_37

    :cond_1f
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_36

    :goto_37
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;->stringToModeration(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    move-result-object v94

    move/from16 v6, v40

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_20

    move-object/from16 v9, v57

    :goto_38
    move/from16 v40, v6

    goto :goto_39

    :cond_20
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v95

    invoke-static/range {v95 .. v96}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    goto :goto_38

    :goto_39
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v95

    move/from16 v6, v41

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_21

    move-object/from16 v96, v57

    :goto_3a
    move/from16 v9, v42

    goto :goto_3b

    :cond_21
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v96, v9

    goto :goto_3a

    :goto_3b
    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v38

    if-eqz v38, :cond_22

    move/from16 v41, v6

    move-object/from16 v6, v57

    :goto_3c
    move/from16 v38, v7

    goto :goto_3d

    :cond_22
    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v38

    move/from16 v41, v6

    move-object/from16 v6, v38

    goto :goto_3c

    :goto_3d
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v97

    if-eqz v97, :cond_31

    move/from16 v6, v43

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_23

    move-object/from16 v5, v57

    goto :goto_3e

    :cond_23
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    :goto_3e
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reminderInfoConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    invoke-virtual {v7, v5}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;->stringToReminderInfo(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-result-object v98

    move/from16 v5, v44

    invoke-interface {v3, v5}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_24

    move-object/from16 v7, v57

    :goto_3f
    move/from16 v44, v5

    goto :goto_40

    :cond_24
    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_3f

    :goto_40
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    invoke-virtual {v5, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;->stringToLocation(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    move-result-object v99

    move/from16 v5, v45

    invoke-interface {v3, v5}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_25

    move-object/from16 v100, v57

    :goto_41
    move/from16 v45, v5

    move/from16 v43, v6

    move/from16 v7, v46

    goto :goto_42

    :cond_25
    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v100, v7

    goto :goto_41

    :goto_42
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    if-eqz v5, :cond_26

    const/16 v101, 0x1

    :goto_43
    move/from16 v5, v47

    goto :goto_44

    :cond_26
    const/16 v101, 0x0

    goto :goto_43

    :goto_44
    invoke-interface {v3, v5}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_2b

    move/from16 v6, v48

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v42

    if-eqz v42, :cond_2a

    move/from16 v0, v49

    invoke-interface {v3, v0}, Ltb/c;->isNull(I)Z

    move-result v42

    if-eqz v42, :cond_29

    move/from16 v46, v7

    move/from16 v7, v50

    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v42

    if-eqz v42, :cond_28

    move/from16 v42, v8

    move/from16 v8, v51

    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v47

    if-nez v47, :cond_27

    goto :goto_48

    :cond_27
    move/from16 v47, v5

    move/from16 v48, v6

    move-object/from16 v82, v57

    goto/16 :goto_4f

    :cond_28
    move/from16 v42, v8

    :goto_45
    move/from16 v8, v51

    goto :goto_48

    :cond_29
    move/from16 v46, v7

    move/from16 v42, v8

    :goto_46
    move/from16 v7, v50

    goto :goto_45

    :cond_2a
    move/from16 v46, v7

    move/from16 v42, v8

    :goto_47
    move/from16 v0, v49

    goto :goto_46

    :cond_2b
    move/from16 v46, v7

    move/from16 v42, v8

    move/from16 v6, v48

    goto :goto_47

    :goto_48
    invoke-interface {v3, v5}, Ltb/c;->isNull(I)Z

    move-result v47

    if-eqz v47, :cond_2c

    move-object/from16 v104, v57

    goto :goto_49

    :cond_2c
    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v47

    move-object/from16 v104, v47

    :goto_49
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v47

    if-eqz v47, :cond_2d

    move-object/from16 v105, v57

    goto :goto_4a

    :cond_2d
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v47

    move-object/from16 v105, v47

    :goto_4a
    invoke-interface {v3, v0}, Ltb/c;->isNull(I)Z

    move-result v47

    if-eqz v47, :cond_2e

    move-object/from16 v106, v57

    goto :goto_4b

    :cond_2e
    invoke-interface {v3, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v47

    move-object/from16 v106, v47

    :goto_4b
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v47

    if-eqz v47, :cond_2f

    move/from16 v47, v5

    move/from16 v48, v6

    move-object/from16 v107, v57

    goto :goto_4c

    :cond_2f
    move/from16 v47, v5

    move/from16 v48, v6

    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v107, v5

    :goto_4c
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_30

    :goto_4d
    move-object/from16 v108, v57

    goto :goto_4e

    :cond_30
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v57

    goto :goto_4d

    :goto_4e
    new-instance v103, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    invoke-direct/range {v103 .. v108}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    move-object/from16 v82, v103

    :goto_4f
    new-instance v57, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    invoke-direct/range {v57 .. v101}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)V

    move-object/from16 v5, v57

    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    move/from16 v49, v0

    move-object/from16 v0, v16

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/util/List;

    move-object/from16 v16, v2

    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v15}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/List;

    move/from16 v50, v7

    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v14}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/util/List;

    move-object/from16 v51, v0

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-direct {v0, v5, v6, v2, v7}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, v42

    move/from16 v42, v9

    move/from16 v9, v27

    move/from16 v27, v28

    move/from16 v28, v29

    move/from16 v29, v31

    move/from16 v31, v36

    move/from16 v36, v37

    move/from16 v37, v38

    move/from16 v38, v0

    move-object/from16 v0, p2

    move v6, v13

    move-object/from16 v2, v16

    move-object/from16 v16, v51

    move/from16 v7, v56

    move/from16 v51, v8

    move/from16 v56, v54

    move/from16 v8, v102

    move/from16 v54, v19

    move/from16 v19, p3

    goto/16 :goto_3

    :cond_31
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_32
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_33
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.String>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_35
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_37
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_39
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3a
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    return-object v1

    :goto_50
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final selectDraftMessageByCid$lambda$8(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;
    .locals 28

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "_connection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v2, 0x1

    move-object/from16 v3, p1

    :try_start_0
    invoke-interface {v1, v2, v3}, Ltb/c;->L(ILjava/lang/String;)V

    const-string v3, "id"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "cid"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "text"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "parentId"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mentionedUsersIds"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "silent"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "showInChannel"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "replyMessageId"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "command"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "args"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "extraData"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v14

    const/4 v15, 0x0

    if-eqz v14, :cond_a

    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v17

    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18

    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v19

    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object/from16 v20, v15

    goto :goto_0

    :cond_0
    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v20, v3

    :goto_0
    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v3, v15

    goto :goto_1

    :cond_1
    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    :goto_1
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v21

    if-eqz v21, :cond_9

    invoke-interface {v1, v8}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    move/from16 v22, v2

    goto :goto_2

    :cond_2
    move/from16 v22, v4

    :goto_2
    invoke-interface {v1, v9}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v3, v5

    if-eqz v3, :cond_3

    move/from16 v23, v2

    goto :goto_3

    :cond_3
    move/from16 v23, v4

    :goto_3
    invoke-interface {v1, v10}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_4

    move-object/from16 v24, v15

    goto :goto_4

    :cond_4
    invoke-interface {v1, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v24, v2

    :goto_4
    invoke-interface {v1, v11}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object/from16 v25, v15

    goto :goto_5

    :cond_5
    invoke-interface {v1, v11}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v25, v2

    :goto_5
    invoke-interface {v1, v12}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_6

    move-object/from16 v26, v15

    goto :goto_6

    :cond_6
    invoke-interface {v1, v12}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v26, v2

    :goto_6
    invoke-interface {v1, v13}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_7

    :cond_7
    invoke-interface {v1, v13}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    :goto_7
    iget-object v0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v0, v15}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v27

    if-eqz v27, :cond_8

    new-instance v16, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;

    invoke-direct/range {v16 .. v27}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    move-object/from16 v15, v16

    goto :goto_8

    :catchall_0
    move-exception v0

    goto :goto_9

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_a
    :goto_8
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v15

    :goto_9
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final selectDraftMessageByParentId$lambda$9(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;
    .locals 28

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "_connection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v2, 0x1

    move-object/from16 v3, p1

    :try_start_0
    invoke-interface {v1, v2, v3}, Ltb/c;->L(ILjava/lang/String;)V

    const-string v3, "id"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "cid"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "text"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "parentId"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mentionedUsersIds"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "silent"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "showInChannel"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "replyMessageId"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "command"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "args"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "extraData"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v14

    const/4 v15, 0x0

    if-eqz v14, :cond_a

    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v17

    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18

    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v19

    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object/from16 v20, v15

    goto :goto_0

    :cond_0
    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v20, v3

    :goto_0
    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v3, v15

    goto :goto_1

    :cond_1
    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    :goto_1
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v21

    if-eqz v21, :cond_9

    invoke-interface {v1, v8}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    move/from16 v22, v2

    goto :goto_2

    :cond_2
    move/from16 v22, v4

    :goto_2
    invoke-interface {v1, v9}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v3, v5

    if-eqz v3, :cond_3

    move/from16 v23, v2

    goto :goto_3

    :cond_3
    move/from16 v23, v4

    :goto_3
    invoke-interface {v1, v10}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_4

    move-object/from16 v24, v15

    goto :goto_4

    :cond_4
    invoke-interface {v1, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v24, v2

    :goto_4
    invoke-interface {v1, v11}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object/from16 v25, v15

    goto :goto_5

    :cond_5
    invoke-interface {v1, v11}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v25, v2

    :goto_5
    invoke-interface {v1, v12}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_6

    move-object/from16 v26, v15

    goto :goto_6

    :cond_6
    invoke-interface {v1, v12}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v26, v2

    :goto_6
    invoke-interface {v1, v13}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_7

    :cond_7
    invoke-interface {v1, v13}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    :goto_7
    iget-object v0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v0, v15}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v27

    if-eqz v27, :cond_8

    new-instance v16, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;

    invoke-direct/range {v16 .. v27}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    move-object/from16 v15, v16

    goto :goto_8

    :catchall_0
    move-exception v0

    goto :goto_9

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_a
    :goto_8
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v15

    :goto_9
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final selectDraftMessages$lambda$7(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 27

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "_connection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_0
    const-string v2, "id"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "cid"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "text"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "parentId"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mentionedUsersIds"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "silent"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "showInChannel"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "replyMessageId"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "command"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "args"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "extraData"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v14

    if-eqz v14, :cond_a

    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v16

    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v17

    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18

    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_0

    const/16 v19, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v19, v14

    :goto_1
    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_1

    const/4 v14, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v14

    :goto_2
    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v15, v14}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v20

    if-eqz v20, :cond_9

    invoke-interface {v1, v7}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    const/16 v21, 0x1

    if-eqz v14, :cond_2

    goto :goto_3

    :cond_2
    const/16 v21, 0x0

    :goto_3
    invoke-interface {v1, v8}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    if-eqz v14, :cond_3

    const/16 v22, 0x1

    goto :goto_4

    :cond_3
    const/16 v22, 0x0

    :goto_4
    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_4

    const/16 v23, 0x0

    goto :goto_5

    :cond_4
    invoke-interface {v1, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v23, v14

    :goto_5
    invoke-interface {v1, v10}, Ltb/c;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_5

    const/16 v24, 0x0

    goto :goto_6

    :cond_5
    invoke-interface {v1, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v24, v14

    :goto_6
    invoke-interface {v1, v11}, Ltb/c;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_6

    const/16 v25, 0x0

    goto :goto_7

    :cond_6
    invoke-interface {v1, v11}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v25, v14

    :goto_7
    invoke-interface {v1, v12}, Ltb/c;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_7

    const/4 v15, 0x0

    goto :goto_8

    :cond_7
    invoke-interface {v1, v12}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    :goto_8
    iget-object v14, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v14, v15}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v26

    if-eqz v26, :cond_8

    new-instance v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;

    invoke-direct/range {v15 .. v26}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_9

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_a
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v13

    :goto_9
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final selectIdsBySyncStatus$lambda$21(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/models/SyncStatus;ILtb/a;)Ljava/util/List;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p4, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    iget-object p1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->syncStatusToString(Lio/getstream/chat/android/models/SyncStatus;)I

    move-result p1

    int-to-long p1, p1

    const/4 p4, 0x1

    invoke-interface {p0, p4, p1, p2}, Ltb/c;->p(IJ)V

    const/4 p1, 0x2

    int-to-long p2, p3

    invoke-interface {p0, p1, p2, p3}, Ltb/c;->p(IJ)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    invoke-interface {p0, p2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object p1

    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private static final selectMessagesWithPoll$lambda$22(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 110

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "getValue(...)"

    const-string v3, "_connection"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v3

    const/4 v4, 0x1

    move-object/from16 v5, p1

    :try_start_0
    invoke-interface {v3, v4, v5}, Ltb/c;->L(ILjava/lang/String;)V

    const-string v5, "id"

    invoke-static {v3, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "cid"

    invoke-static {v3, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "userId"

    invoke-static {v3, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "text"

    invoke-static {v3, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "html"

    invoke-static {v3, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "type"

    invoke-static {v3, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "syncStatus"

    invoke-static {v3, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "replyCount"

    invoke-static {v3, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "deletedReplyCount"

    invoke-static {v3, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "createdAt"

    invoke-static {v3, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "createdLocallyAt"

    invoke-static {v3, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v4, "updatedAt"

    invoke-static {v3, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move-object/from16 v16, v2

    const-string v2, "updatedLocallyAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p1, v2

    const-string v2, "deletedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v17, v2

    const-string v2, "remoteMentionedUserIds"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v18, v2

    const-string v2, "mentionedUsersId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v19, v2

    const-string v2, "reactionCounts"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v20, v2

    const-string v2, "reactionScores"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v21, v2

    const-string v2, "reactionGroups"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v22, v2

    const-string v2, "parentId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v23, v2

    const-string v2, "command"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v24, v2

    const-string v2, "shadowed"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v25, v2

    const-string v2, "i18n"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v26, v2

    const-string v2, "showInChannel"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v27, v2

    const-string v2, "silent"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v28, v2

    const-string v2, "extraData"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v29, v2

    const-string v2, "replyToId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v30, v2

    const-string v2, "pinned"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v31, v2

    const-string v2, "pinnedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v32, v2

    const-string v2, "pinExpires"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v33, v2

    const-string v2, "pinnedByUserId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v34, v2

    const-string v2, "threadParticipantsIds"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v35, v2

    const-string v2, "skipPushNotification"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v36, v2

    const-string v2, "skipEnrichUrl"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v37, v2

    const-string v2, "moderationDetails"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v38, v2

    const-string v2, "moderation"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v39, v2

    const-string v2, "messageTextUpdatedAt"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v40, v2

    const-string v2, "pollId"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v41, v2

    const-string v2, "restrictedVisibility"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v42, v2

    const-string v2, "reminder"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v43, v2

    const-string v2, "sharedLocation"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v44, v2

    const-string v2, "channelRole"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v45, v2

    const-string v2, "deletedForMe"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v46, v2

    const-string v2, "channel_infocid"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v47, v2

    const-string v2, "channel_infoid"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v48, v2

    const-string v2, "channel_infotype"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v49, v2

    const-string v2, "channel_infomemberCount"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v50, v2

    const-string v2, "channel_infoname"

    invoke-static {v3, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v51, v2

    new-instance v2, La0/g;

    move/from16 v52, v4

    const/4 v4, 0x0

    invoke-direct {v2, v4}, La0/f1;-><init>(I)V

    move/from16 v53, v15

    new-instance v15, La0/g;

    invoke-direct {v15, v4}, La0/f1;-><init>(I)V

    move/from16 v54, v14

    new-instance v14, La0/g;

    invoke-direct {v14, v4}, La0/f1;-><init>(I)V

    :goto_0
    invoke-interface {v3}, Ltb/c;->e1()Z

    move-result v55

    if-eqz v55, :cond_3

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v56

    if-nez v56, :cond_0

    move/from16 v56, v13

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v4, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_50

    :cond_0
    move/from16 v56, v13

    :goto_1
    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15, v4}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_1

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v15, v4, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14, v4}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_2

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v14, v4, v13}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    move/from16 v13, v56

    const/4 v4, 0x0

    goto :goto_0

    :cond_3
    move/from16 v56, v13

    invoke-interface {v3}, Ltb/c;->reset()V

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v1, v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    invoke-direct {v0, v1, v14}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity(Ltb/a;La0/g;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    invoke-interface {v3}, Ltb/c;->e1()Z

    move-result v4

    if-eqz v4, :cond_39

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v58

    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v59

    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v60

    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v61

    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v62

    invoke-interface {v3, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v63

    move v4, v6

    move v13, v7

    invoke-interface {v3, v11}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__syncStatusConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;->stringToSyncStatus(I)Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v64

    invoke-interface {v3, v12}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    move/from16 v102, v9

    move/from16 v7, v56

    move/from16 v56, v8

    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    move/from16 v9, v54

    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v54

    const/16 v57, 0x0

    if-eqz v54, :cond_4

    move/from16 p3, v4

    move-object/from16 v4, v57

    :goto_3
    move/from16 v65, v6

    goto :goto_4

    :cond_4
    invoke-interface {v3, v9}, Ltb/c;->getLong(I)J

    move-result-wide v65

    invoke-static/range {v65 .. v66}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v54

    move/from16 p3, v4

    move-object/from16 v4, v54

    goto :goto_3

    :goto_4
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v67

    move/from16 v4, v53

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_5

    move-object/from16 v6, v57

    :goto_5
    move/from16 v53, v4

    goto :goto_6

    :cond_5
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v53

    invoke-static/range {v53 .. v54}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_5

    :goto_6
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v68

    move/from16 v4, v52

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_6

    move-object/from16 v6, v57

    :goto_7
    move/from16 v52, v4

    goto :goto_8

    :cond_6
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v69

    invoke-static/range {v69 .. v70}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_7

    :goto_8
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v69

    move/from16 v4, p1

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_7

    move-object/from16 v6, v57

    :goto_9
    move/from16 p1, v4

    goto :goto_a

    :cond_7
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v70

    invoke-static/range {v70 .. v71}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_9

    :goto_a
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v70

    move/from16 v4, v17

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_8

    move-object/from16 v6, v57

    :goto_b
    move/from16 v17, v4

    goto :goto_c

    :cond_8
    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v71

    invoke-static/range {v71 .. v72}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_b

    :goto_c
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v71

    move/from16 v4, v18

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_9

    move-object/from16 v6, v57

    :goto_d
    move/from16 v18, v4

    goto :goto_e

    :cond_9
    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_d

    :goto_e
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v4, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v72
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    if-eqz v72, :cond_38

    move/from16 v6, v19

    :try_start_1
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v19

    if-eqz v19, :cond_a

    move/from16 v54, v6

    move-object/from16 v6, v57

    :goto_f
    move/from16 v19, v7

    goto :goto_10

    :cond_a
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v19

    move/from16 v54, v6

    move-object/from16 v6, v19

    goto :goto_f

    :goto_10
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v73

    if-eqz v73, :cond_37

    move/from16 v6, v20

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_b

    move-object/from16 v7, v57

    :goto_11
    move/from16 v20, v6

    goto :goto_12

    :cond_b
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_11

    :goto_12
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v74
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v6, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Int>\', but it was NULL."

    if-eqz v74, :cond_36

    move/from16 v7, v21

    :try_start_2
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v21

    if-eqz v21, :cond_c

    move/from16 v103, v7

    move-object/from16 v7, v57

    :goto_13
    move/from16 v66, v8

    goto :goto_14

    :cond_c
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v21

    move/from16 v103, v7

    move-object/from16 v7, v21

    goto :goto_13

    :goto_14
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v75

    if-eqz v75, :cond_35

    move/from16 v7, v22

    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_d

    move-object/from16 v6, v57

    goto :goto_15

    :cond_d
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_15
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reactionGroupConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;

    invoke-virtual {v8, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;->stringToReactionGroupEntityMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v76

    if-eqz v76, :cond_34

    move/from16 v6, v23

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_e

    move-object/from16 v77, v57

    :goto_16
    move/from16 v8, v24

    goto :goto_17

    :cond_e
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v77, v8

    goto :goto_16

    :goto_17
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v21

    if-eqz v21, :cond_f

    move-object/from16 v78, v57

    :goto_18
    move/from16 v23, v6

    move/from16 v22, v7

    move/from16 v24, v8

    move/from16 v6, v25

    goto :goto_19

    :cond_f
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v21

    move-object/from16 v78, v21

    goto :goto_18

    :goto_19
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_10

    const/16 v79, 0x1

    :goto_1a
    move/from16 v7, v26

    goto :goto_1b

    :cond_10
    const/16 v79, 0x0

    goto :goto_1a

    :goto_1b
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_11

    move-object/from16 v8, v57

    :goto_1c
    move/from16 v25, v6

    goto :goto_1d

    :cond_11
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_1c

    :goto_1d
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v6, v8}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToStringMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v80

    if-eqz v80, :cond_33

    move/from16 v26, v7

    move/from16 v6, v27

    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_12

    const/16 v81, 0x1

    :goto_1e
    move/from16 v21, v9

    move/from16 v7, v28

    goto :goto_1f

    :cond_12
    const/16 v81, 0x0

    goto :goto_1e

    :goto_1f
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_13

    const/16 v83, 0x1

    :goto_20
    move/from16 v8, v29

    goto :goto_21

    :cond_13
    const/16 v83, 0x0

    goto :goto_20

    :goto_21
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_14

    move-object/from16 v9, v57

    :goto_22
    move/from16 v27, v6

    goto :goto_23

    :cond_14
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_22

    :goto_23
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v84

    if-eqz v84, :cond_32

    move/from16 v6, v30

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_15

    move-object/from16 v85, v57

    :goto_24
    move/from16 v30, v6

    move/from16 v28, v7

    move/from16 v9, v31

    goto :goto_25

    :cond_15
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v85, v9

    goto :goto_24

    :goto_25
    invoke-interface {v3, v9}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    if-eqz v6, :cond_16

    const/16 v86, 0x1

    :goto_26
    move/from16 v6, v32

    goto :goto_27

    :cond_16
    const/16 v86, 0x0

    goto :goto_26

    :goto_27
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_17

    move-object/from16 v7, v57

    :goto_28
    move/from16 v32, v6

    goto :goto_29

    :cond_17
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v31

    invoke-static/range {v31 .. v32}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_28

    :goto_29
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v87

    move/from16 v6, v33

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_18

    move-object/from16 v7, v57

    :goto_2a
    move/from16 v33, v6

    goto :goto_2b

    :cond_18
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v88

    invoke-static/range {v88 .. v89}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_2a

    :goto_2b
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v88

    move/from16 v6, v34

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_19

    move-object/from16 v89, v57

    :goto_2c
    move/from16 v7, v35

    goto :goto_2d

    :cond_19
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v89, v7

    goto :goto_2c

    :goto_2d
    invoke-interface {v3, v7}, Ltb/c;->isNull(I)Z

    move-result v29

    if-eqz v29, :cond_1a

    move/from16 v34, v6

    move-object/from16 v6, v57

    :goto_2e
    move/from16 v35, v7

    goto :goto_2f

    :cond_1a
    invoke-interface {v3, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v29

    move/from16 v34, v6

    move-object/from16 v6, v29

    goto :goto_2e

    :goto_2f
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v90

    if-eqz v90, :cond_31

    move/from16 v29, v8

    move/from16 v6, v36

    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_1b

    const/16 v91, 0x1

    :goto_30
    move/from16 v31, v9

    move/from16 v7, v37

    goto :goto_31

    :cond_1b
    const/16 v91, 0x0

    goto :goto_30

    :goto_31
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_1c

    const/16 v92, 0x1

    :goto_32
    move/from16 v8, v38

    goto :goto_33

    :cond_1c
    const/16 v92, 0x0

    goto :goto_32

    :goto_33
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1d

    move-object/from16 v9, v57

    :goto_34
    move/from16 v36, v6

    goto :goto_35

    :cond_1d
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_34

    :goto_35
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationDetailsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;->stringToModerationDetails(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-result-object v93

    move/from16 v6, v39

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1e

    move-object/from16 v9, v57

    :goto_36
    move/from16 v39, v6

    goto :goto_37

    :cond_1e
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_36

    :goto_37
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__moderationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;->stringToModeration(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    move-result-object v94

    move/from16 v6, v40

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1f

    move-object/from16 v9, v57

    :goto_38
    move/from16 v40, v6

    goto :goto_39

    :cond_1f
    invoke-interface {v3, v6}, Ltb/c;->getLong(I)J

    move-result-wide v37

    invoke-static/range {v37 .. v38}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    goto :goto_38

    :goto_39
    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v6, v9}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v95

    move/from16 v6, v41

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_20

    move-object/from16 v96, v57

    :goto_3a
    move/from16 v9, v42

    goto :goto_3b

    :cond_20
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v96, v9

    goto :goto_3a

    :goto_3b
    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v37

    if-eqz v37, :cond_21

    move/from16 v41, v6

    move-object/from16 v6, v57

    :goto_3c
    move/from16 v37, v7

    goto :goto_3d

    :cond_21
    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v37

    move/from16 v41, v6

    move-object/from16 v6, v37

    goto :goto_3c

    :goto_3d
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v7, v6}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v97

    if-eqz v97, :cond_30

    move/from16 v6, v43

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_22

    move-object/from16 v4, v57

    goto :goto_3e

    :cond_22
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    :goto_3e
    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__reminderInfoConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;

    invoke-virtual {v7, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;->stringToReminderInfo(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-result-object v98

    move/from16 v4, v44

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_23

    move-object/from16 v7, v57

    :goto_3f
    move/from16 v44, v4

    goto :goto_40

    :cond_23
    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_3f

    :goto_40
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__locationConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;

    invoke-virtual {v4, v7}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;->stringToLocation(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    move-result-object v99

    move/from16 v4, v45

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_24

    move-object/from16 v100, v57

    :goto_41
    move/from16 v38, v8

    move/from16 v42, v9

    move/from16 v7, v46

    goto :goto_42

    :cond_24
    invoke-interface {v3, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v100, v7

    goto :goto_41

    :goto_42
    invoke-interface {v3, v7}, Ltb/c;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_25

    const/16 v101, 0x1

    :goto_43
    move/from16 v8, v47

    goto :goto_44

    :cond_25
    const/16 v101, 0x0

    goto :goto_43

    :goto_44
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_2a

    move/from16 v9, v48

    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v43

    if-eqz v43, :cond_29

    move/from16 v0, v49

    invoke-interface {v3, v0}, Ltb/c;->isNull(I)Z

    move-result v43

    if-eqz v43, :cond_28

    move/from16 v45, v4

    move/from16 v4, v50

    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v43

    if-eqz v43, :cond_27

    move/from16 v43, v6

    move/from16 v6, v51

    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v46

    if-nez v46, :cond_26

    goto :goto_48

    :cond_26
    move/from16 v46, v7

    move/from16 v47, v8

    move-object/from16 v82, v57

    goto/16 :goto_4f

    :cond_27
    move/from16 v43, v6

    :goto_45
    move/from16 v6, v51

    goto :goto_48

    :cond_28
    move/from16 v45, v4

    move/from16 v43, v6

    :goto_46
    move/from16 v4, v50

    goto :goto_45

    :cond_29
    move/from16 v45, v4

    move/from16 v43, v6

    :goto_47
    move/from16 v0, v49

    goto :goto_46

    :cond_2a
    move/from16 v45, v4

    move/from16 v43, v6

    move/from16 v9, v48

    goto :goto_47

    :goto_48
    invoke-interface {v3, v8}, Ltb/c;->isNull(I)Z

    move-result v46

    if-eqz v46, :cond_2b

    move-object/from16 v105, v57

    goto :goto_49

    :cond_2b
    invoke-interface {v3, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v46

    move-object/from16 v105, v46

    :goto_49
    invoke-interface {v3, v9}, Ltb/c;->isNull(I)Z

    move-result v46

    if-eqz v46, :cond_2c

    move-object/from16 v106, v57

    goto :goto_4a

    :cond_2c
    invoke-interface {v3, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v46

    move-object/from16 v106, v46

    :goto_4a
    invoke-interface {v3, v0}, Ltb/c;->isNull(I)Z

    move-result v46

    if-eqz v46, :cond_2d

    move-object/from16 v107, v57

    goto :goto_4b

    :cond_2d
    invoke-interface {v3, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v46

    move-object/from16 v107, v46

    :goto_4b
    invoke-interface {v3, v4}, Ltb/c;->isNull(I)Z

    move-result v46

    if-eqz v46, :cond_2e

    move/from16 v46, v7

    move/from16 v47, v8

    move-object/from16 v108, v57

    goto :goto_4c

    :cond_2e
    move/from16 v46, v7

    move/from16 v47, v8

    invoke-interface {v3, v4}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object/from16 v108, v7

    :goto_4c
    invoke-interface {v3, v6}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_2f

    :goto_4d
    move-object/from16 v109, v57

    goto :goto_4e

    :cond_2f
    invoke-interface {v3, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v57

    goto :goto_4d

    :goto_4e
    new-instance v104, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    invoke-direct/range {v104 .. v109}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    move-object/from16 v82, v104

    :goto_4f
    new-instance v57, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    invoke-direct/range {v57 .. v101}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)V

    move-object/from16 v7, v57

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v2}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v8

    move/from16 v49, v0

    move-object/from16 v0, v16

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Ljava/util/List;

    move-object/from16 v16, v2

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v15}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/List;

    move/from16 v50, v4

    invoke-interface {v3, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v14}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/util/List;

    move-object/from16 v48, v0

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-direct {v0, v7, v8, v2, v4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p2

    move/from16 v51, v6

    move v7, v13

    move-object/from16 v2, v16

    move-object/from16 v16, v48

    move/from16 v8, v56

    move/from16 v6, p3

    move/from16 v48, v9

    move/from16 v56, v19

    move/from16 v19, v54

    move/from16 v9, v102

    move/from16 v54, v21

    move/from16 v21, v103

    goto/16 :goto_2

    :cond_30
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_31
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_32
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_33
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.String>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_35
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_37
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_39
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    return-object v1

    :goto_50
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method public static synthetic t(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;
    .locals 1

    const-string v0, "SELECT * FROM stream_chat_draft_message_entity WHERE parentId = ?"

    invoke-static {v0, p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->selectDraftMessageByParentId$lambda$9(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Ljava/lang/String;ILio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "SELECT * from stream_chat_message WHERE cid = ? ORDER BY CASE WHEN createdAt IS NULL THEN createdLocallyAt ELSE createdAt END DESC LIMIT ?"

    invoke-static {v0, p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->messagesForChannel$lambda$14(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method private static final updateMessageInnerEntity$lambda$5(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__updateAdapterOfMessageInnerEntity:Landroidx/room/i;

    invoke-virtual {p0, p2, p1}, Landroidx/room/i;->handle(Ltb/a;Ljava/lang/Object;)I

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic v(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->insertReactions$lambda$3(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic w(Ljava/lang/String;Ljava/util/List;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->deleteMessages$lambda$29(Ljava/lang/String;Ljava/util/List;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic x(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->updateMessageInnerEntity$lambda$5(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic y(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/models/SyncStatus;ILtb/a;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "SELECT id FROM stream_chat_message WHERE syncStatus = ? ORDER BY CASE WHEN createdAt IS NULL THEN createdLocallyAt ELSE createdAt END ASC LIMIT ?"

    invoke-static {v0, p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->selectIdsBySyncStatus$lambda$21(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/models/SyncStatus;ILtb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic z(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->insertAttachments$lambda$2(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;

    return-void
.end method


# virtual methods
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/api/state/a;

    const/16 v2, 0xa

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

.method public final deleteAllDrafts(Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/api/state/a;

    const/16 v2, 0xb

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

.method public final deleteAttachments(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "messageIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;

    const/4 v2, 0x3

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;I)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public final deleteAttachmentsChunked(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "messageIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DELETE FROM attachment_inner_entity WHERE messageId in ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1, v0}, Lpf/c;->j(ILjava/lang/StringBuilder;)V

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/a;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/a;-><init>(ILjava/lang/String;Ljava/util/List;)V

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {v1, p1, v0, v2}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public final deleteChannelMessagesBefore(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lig0/h;

    const/16 v2, 0xb

    invoke-direct {v1, p1, p0, p2, v2}, Lig0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteDraftMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lht2/d;

    const/4 v2, 0x5

    invoke-direct {v1, p1, v2}, Lht2/d;-><init>(Ljava/lang/String;I)V

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

.method public final deleteMessage(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, La23/b;

    const/4 v2, 0x4

    invoke-direct {v1, p1, p2, v2}, La23/b;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteMessages(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lht2/d;

    const/4 v2, 0x6

    invoke-direct {v1, p1, v2}, Lht2/d;-><init>(Ljava/lang/String;I)V

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

.method public final deleteMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    const-string v0, "DELETE from stream_chat_message WHERE id IN ("

    .line 3
    invoke-static {v0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 4
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    .line 5
    invoke-static {v1, v0}, Lpf/c;->j(ILjava/lang/StringBuilder;)V

    .line 6
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/a;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/a;-><init>(ILjava/lang/String;Ljava/util/List;)V

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {v1, p1, v0, v2, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insert(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$insert$4;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$insert$4;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

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
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$insert$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$insert$2;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Lq83/d;)V

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
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;I)V

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

.method public final insertDraftMessages(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lh02/h;

    const/16 v2, 0x18

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

.method public final insertMessageInnerEntities(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;I)V

    const/4 p1, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final insertMessageInnerEntity(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/e;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/e;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;I)V

    const/4 p1, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final insertReactions(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;

    const/4 v2, 0x2

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/c;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;I)V

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

.method public final messagesForChannel(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/b;

    const/4 v2, 0x1

    invoke-direct {v1, p1, p2, p0, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/b;-><init>(Ljava/lang/String;ILio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;I)V

    const/4 p1, 0x1

    invoke-static {v0, p1, p1, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final messagesForChannelEqualOrNewerThan(Ljava/lang/String;ILjava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;

    const/4 v6, 0x0

    move-object v3, p0

    move-object v2, p1

    move v5, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;II)V

    const/4 p1, 0x1

    invoke-static {v0, p1, p1, v1, p4}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final messagesForChannelEqualOrOlderThan(Ljava/lang/String;ILjava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;

    const/4 v6, 0x2

    move-object v3, p0

    move-object v2, p1

    move v5, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;II)V

    const/4 p1, 0x1

    invoke-static {v0, p1, p1, v1, p4}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final messagesForChannelNewerThan(Ljava/lang/String;ILjava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;

    const/4 v6, 0x3

    move-object v3, p0

    move-object v2, p1

    move v5, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;II)V

    const/4 p1, 0x1

    invoke-static {v0, p1, p1, v1, p4}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final messagesForChannelOlderThan(Ljava/lang/String;ILjava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;

    const/4 v6, 0x1

    move-object v3, p0

    move-object v2, p1

    move v5, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/f;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/Date;II)V

    const/4 p1, 0x1

    invoke-static {v0, p1, p1, v1, p4}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final messagesForThread(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, p0, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/b;-><init>(Ljava/lang/String;ILio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;I)V

    const/4 p1, 0x1

    invoke-static {v0, p1, p1, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final select(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/g;

    const/4 v2, 0x2

    invoke-direct {v1, p1, p0, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/g;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;I)V

    const/4 p1, 0x1

    invoke-static {v0, p1, p1, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final select(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$select$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$select$2;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectByCidAndUserId(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lig0/h;

    const/16 v2, 0xa

    invoke-direct {v1, p1, p2, p0, v2}, Lig0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectBySyncStatus(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/d;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/models/SyncStatus;II)V

    const/4 p1, 0x1

    invoke-static {v0, p1, p1, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectBySyncStatusOrTypeForChannel(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "SELECT * FROM stream_chat_message WHERE cid = ? AND (syncStatus IN ("

    invoke-static {v0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v5, v0}, Lpf/c;->j(ILjava/lang/StringBuilder;)V

    const-string v1, ") OR type IN ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1, v0}, Lpf/c;->j(ILjava/lang/StringBuilder;)V

    const-string v1, ")) ORDER BY CASE WHEN createdAt IS NULL THEN createdLocallyAt ELSE createdAt END ASC"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v0, "toString(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lim1/z0;

    move-object v7, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v7}, Lim1/z0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)V

    const/4 p1, 0x1

    invoke-static {v0, p1, p1, v1, p4}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectByUserId(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/g;

    const/4 v2, 0x3

    invoke-direct {v1, p1, p0, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/g;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;I)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectChunked(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "SELECT * FROM stream_chat_message WHERE id IN ("

    invoke-static {v0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1, v0}, Lpf/c;->j(ILjava/lang/StringBuilder;)V

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v2, Lig0/h;

    const/16 v3, 0x9

    invoke-direct {v2, v0, p1, p0, v3}, Lig0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 p1, 0x1

    invoke-static {v1, p1, p1, v2, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectDraftMessageByCid(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/g;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/g;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;I)V

    const/4 p1, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectDraftMessageByParentId(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/g;

    const/4 v2, 0x4

    invoke-direct {v1, p1, p0, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/g;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;I)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectDraftMessages(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lhb2/c;

    const/16 v2, 0x10

    invoke-direct {v1, p0, v2}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectIdsBySyncStatus(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/d;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, p2, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/d;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/models/SyncStatus;II)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectMessagesWithPoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/g;

    const/4 v2, 0x1

    invoke-direct {v1, p1, p0, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/g;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;I)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectWaitForAttachments(Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$selectWaitForAttachments$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$selectWaitForAttachments$2;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lq83/d;)V

    invoke-static {v0, v1, p1}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final updateMessageInnerEntity(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;)V
    .locals 3

    const-string v0, "messageInnerEntity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/e;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;I)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public final upsertMessageInnerEntities(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$upsertMessageInnerEntities$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$upsertMessageInnerEntities$2;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Ljava/util/List;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final upsertMessageInnerEntity(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$upsertMessageInnerEntity$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$upsertMessageInnerEntity$2;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
