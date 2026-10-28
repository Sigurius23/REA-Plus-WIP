.class public final Lio/getstream/chat/android/models/Message$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/models/Message;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u00084\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u0011\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0002\u0010\u0006J\u000e\u0010H\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0008J\u000e\u0010I\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0008J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0008J\u000e\u0010K\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0008J\u0010\u0010L\u001a\u00020\u00002\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0008J\u0010\u0010M\u001a\u00020\u00002\u0008\u0010\r\u001a\u0004\u0018\u00010\u0008J\u0014\u0010N\u001a\u00020\u00002\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fJ\u0014\u0010O\u001a\u00020\u00002\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000fJ\u0014\u0010P\u001a\u00020\u00002\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000fJ\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010R\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015J\u001a\u0010S\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00150\u0018J\u001a\u0010T\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00150\u0018J\u001a\u0010U\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u001b0\u0018J\u000e\u0010V\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010W\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0008J\u0014\u0010X\u001a\u00020\u00002\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020 0\u000fJ\u0014\u0010Y\u001a\u00020\u00002\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020 0\u000fJ\u0010\u0010Z\u001a\u00020\u00002\u0008\u0010\"\u001a\u0004\u0018\u00010#J\u0010\u0010[\u001a\u00020\u00002\u0008\u0010$\u001a\u0004\u0018\u00010#J\u0010\u0010\\\u001a\u00020\u00002\u0008\u0010%\u001a\u0004\u0018\u00010#J\u0010\u0010]\u001a\u00020\u00002\u0008\u0010&\u001a\u0004\u0018\u00010#J\u0010\u0010^\u001a\u00020\u00002\u0008\u0010\'\u001a\u0004\u0018\u00010#J\u000e\u0010_\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0013J\u001a\u0010`\u001a\u00020\u00002\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00010\u0018J\u000e\u0010a\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+J\u000e\u0010b\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+J\u001a\u0010c\u001a\u00020\u00002\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\u0018J\u000e\u0010d\u001a\u00020\u00002\u0006\u0010.\u001a\u00020+J\u0010\u0010e\u001a\u00020\u00002\u0008\u0010/\u001a\u0004\u0018\u000100J\u0010\u0010f\u001a\u00020\u00002\u0008\u00101\u001a\u0004\u0018\u00010\u0005J\u0010\u0010g\u001a\u00020\u00002\u0008\u00102\u001a\u0004\u0018\u00010\u0008J\u000e\u0010h\u001a\u00020\u00002\u0006\u00103\u001a\u00020+J\u0010\u0010i\u001a\u00020\u00002\u0008\u00104\u001a\u0004\u0018\u00010#J\u0010\u0010j\u001a\u00020\u00002\u0008\u00105\u001a\u0004\u0018\u00010#J\u0010\u0010k\u001a\u00020\u00002\u0008\u00106\u001a\u0004\u0018\u00010\u0013J\u0014\u0010l\u001a\u00020\u00002\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000fJ\u000e\u0010m\u001a\u00020\u00002\u0006\u00108\u001a\u00020+J\u000e\u0010n\u001a\u00020\u00002\u0006\u00109\u001a\u00020+J\u000e\u0010o\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;J\u000e\u0010p\u001a\u00020\u00002\u0006\u0010<\u001a\u00020=J\u0010\u0010q\u001a\u00020\u00002\u0008\u0010>\u001a\u0004\u0018\u00010#J\u0010\u0010r\u001a\u00020\u00002\u0008\u0010?\u001a\u0004\u0018\u00010@J\u0014\u0010s\u001a\u00020\u00002\u000c\u0010A\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000fJ\u0010\u0010t\u001a\u00020\u00002\u0008\u0010B\u001a\u0004\u0018\u00010CJ\u0010\u0010u\u001a\u00020\u00002\u0008\u0010D\u001a\u0004\u0018\u00010EJ\u0010\u0010v\u001a\u00020\u00002\u0008\u0010F\u001a\u0004\u0018\u00010\u0008J\u000e\u0010w\u001a\u00020\u00002\u0006\u0010G\u001a\u00020+J\u0006\u0010x\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00150\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00150\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u001b0\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020 0\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u0008\u0012\u0004\u0012\u00020 0\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010A\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010CX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006y"
    }
    d2 = {
        "Lio/getstream/chat/android/models/Message$Builder;",
        "",
        "<init>",
        "()V",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "(Lio/getstream/chat/android/models/Message;)V",
        "id",
        "",
        "cid",
        "text",
        "html",
        "parentId",
        "command",
        "attachments",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "mentionedUsersIds",
        "mentionedUsers",
        "Lio/getstream/chat/android/models/User;",
        "replyCount",
        "",
        "deletedReplyCount",
        "reactionCounts",
        "",
        "reactionScores",
        "reactionGroups",
        "Lio/getstream/chat/android/models/ReactionGroup;",
        "syncStatus",
        "Lio/getstream/chat/android/models/SyncStatus;",
        "type",
        "latestReactions",
        "Lio/getstream/chat/android/models/Reaction;",
        "ownReactions",
        "createdAt",
        "Ljava/util/Date;",
        "updatedAt",
        "deletedAt",
        "updatedLocallyAt",
        "createdLocallyAt",
        "user",
        "extraData",
        "silent",
        "",
        "shadowed",
        "i18n",
        "showInChannel",
        "channelInfo",
        "Lio/getstream/chat/android/models/ChannelInfo;",
        "replyTo",
        "replyMessageId",
        "pinned",
        "pinnedAt",
        "pinExpires",
        "pinnedBy",
        "threadParticipants",
        "skipPushNotification",
        "skipEnrichUrl",
        "moderationDetails",
        "Lio/getstream/chat/android/models/MessageModerationDetails;",
        "moderation",
        "Lio/getstream/chat/android/models/Moderation;",
        "messageTextUpdatedAt",
        "poll",
        "Lio/getstream/chat/android/models/Poll;",
        "restrictedVisibility",
        "reminder",
        "Lio/getstream/chat/android/models/MessageReminderInfo;",
        "sharedLocation",
        "Lio/getstream/chat/android/models/Location;",
        "channelRole",
        "deletedForMe",
        "withId",
        "withCid",
        "withText",
        "withHtml",
        "withParentId",
        "withCommand",
        "withAttachments",
        "withMentionedUsersIds",
        "withMentionedUsers",
        "withReplyCount",
        "withDeletedReplyCount",
        "withReactionCounts",
        "withReactionScores",
        "withReactionGroups",
        "withSyncStatus",
        "withType",
        "withLatestReactions",
        "withOwnReactions",
        "withCreatedAt",
        "withUpdatedAt",
        "withDeletedAt",
        "withUpdatedLocallyAt",
        "withCreatedLocallyAt",
        "withUser",
        "withExtraData",
        "withSilent",
        "withShadowed",
        "withI18n",
        "withShowInChannel",
        "withChannelInfo",
        "withReplyTo",
        "withReplyMessageId",
        "withPinned",
        "withPinnedAt",
        "withPinExpires",
        "withPinnedBy",
        "withThreadParticipants",
        "withSkipPushNotification",
        "withSkipEnrichUrl",
        "withModerationDetails",
        "withModeration",
        "withMessageTextUpdatedAt",
        "withPoll",
        "withRestrictedVisibility",
        "withReminder",
        "withSharedLocation",
        "withChannelRole",
        "withDeletedForMe",
        "build",
        "stream-chat-android-core"
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
.field private attachments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation
.end field

.field private channelInfo:Lio/getstream/chat/android/models/ChannelInfo;

.field private channelRole:Ljava/lang/String;

.field private cid:Ljava/lang/String;

.field private command:Ljava/lang/String;

.field private createdAt:Ljava/util/Date;

.field private createdLocallyAt:Ljava/util/Date;

.field private deletedAt:Ljava/util/Date;

.field private deletedForMe:Z

.field private deletedReplyCount:I

.field private extraData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private html:Ljava/lang/String;

.field private i18n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private id:Ljava/lang/String;

.field private latestReactions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;"
        }
    .end annotation
.end field

.field private mentionedUsers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation
.end field

.field private mentionedUsersIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private messageTextUpdatedAt:Ljava/util/Date;

.field private moderation:Lio/getstream/chat/android/models/Moderation;

.field private moderationDetails:Lio/getstream/chat/android/models/MessageModerationDetails;

.field private ownReactions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;"
        }
    .end annotation
.end field

.field private parentId:Ljava/lang/String;

.field private pinExpires:Ljava/util/Date;

.field private pinned:Z

.field private pinnedAt:Ljava/util/Date;

.field private pinnedBy:Lio/getstream/chat/android/models/User;

.field private poll:Lio/getstream/chat/android/models/Poll;

.field private reactionCounts:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private reactionGroups:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/ReactionGroup;",
            ">;"
        }
    .end annotation
.end field

.field private reactionScores:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private reminder:Lio/getstream/chat/android/models/MessageReminderInfo;

.field private replyCount:I

.field private replyMessageId:Ljava/lang/String;

.field private replyTo:Lio/getstream/chat/android/models/Message;

.field private restrictedVisibility:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private shadowed:Z

.field private sharedLocation:Lio/getstream/chat/android/models/Location;

.field private showInChannel:Z

.field private silent:Z

.field private skipEnrichUrl:Z

.field private skipPushNotification:Z

.field private syncStatus:Lio/getstream/chat/android/models/SyncStatus;

.field private text:Ljava/lang/String;

.field private threadParticipants:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation
.end field

.field private type:Ljava/lang/String;

.field private updatedAt:Ljava/util/Date;

.field private updatedLocallyAt:Ljava/util/Date;

.field private user:Lio/getstream/chat/android/models/User;


# direct methods
.method public constructor <init>()V
    .locals 33

    move-object/from16 v0, p0

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v1, ""

    iput-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->id:Ljava/lang/String;

    .line 3
    iput-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->cid:Ljava/lang/String;

    .line 4
    iput-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->text:Ljava/lang/String;

    .line 5
    iput-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->html:Ljava/lang/String;

    .line 6
    sget-object v2, Lm83/y;->w:Lm83/y;

    iput-object v2, v0, Lio/getstream/chat/android/models/Message$Builder;->attachments:Ljava/util/List;

    .line 7
    iput-object v2, v0, Lio/getstream/chat/android/models/Message$Builder;->mentionedUsersIds:Ljava/util/List;

    .line 8
    iput-object v2, v0, Lio/getstream/chat/android/models/Message$Builder;->mentionedUsers:Ljava/util/List;

    .line 9
    sget-object v3, Lm83/z;->w:Lm83/z;

    iput-object v3, v0, Lio/getstream/chat/android/models/Message$Builder;->reactionCounts:Ljava/util/Map;

    .line 10
    iput-object v3, v0, Lio/getstream/chat/android/models/Message$Builder;->reactionScores:Ljava/util/Map;

    .line 11
    iput-object v3, v0, Lio/getstream/chat/android/models/Message$Builder;->reactionGroups:Ljava/util/Map;

    .line 12
    sget-object v4, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    iput-object v4, v0, Lio/getstream/chat/android/models/Message$Builder;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    .line 13
    iput-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->type:Ljava/lang/String;

    .line 14
    iput-object v2, v0, Lio/getstream/chat/android/models/Message$Builder;->latestReactions:Ljava/util/List;

    .line 15
    iput-object v2, v0, Lio/getstream/chat/android/models/Message$Builder;->ownReactions:Ljava/util/List;

    .line 16
    new-instance v5, Lio/getstream/chat/android/models/User;

    const v31, 0x1ffffff

    const/16 v32, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v5 .. v32}, Lio/getstream/chat/android/models/User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v5, v0, Lio/getstream/chat/android/models/Message$Builder;->user:Lio/getstream/chat/android/models/User;

    .line 17
    iput-object v3, v0, Lio/getstream/chat/android/models/Message$Builder;->extraData:Ljava/util/Map;

    .line 18
    iput-object v3, v0, Lio/getstream/chat/android/models/Message$Builder;->i18n:Ljava/util/Map;

    .line 19
    iput-object v2, v0, Lio/getstream/chat/android/models/Message$Builder;->threadParticipants:Ljava/util/List;

    .line 20
    iput-object v2, v0, Lio/getstream/chat/android/models/Message$Builder;->restrictedVisibility:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Lio/getstream/chat/android/models/Message$Builder;-><init>()V

    .line 22
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->id:Ljava/lang/String;

    .line 23
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->cid:Ljava/lang/String;

    .line 24
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->text:Ljava/lang/String;

    .line 25
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getHtml()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->html:Ljava/lang/String;

    .line 26
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->parentId:Ljava/lang/String;

    .line 27
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getCommand()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->command:Ljava/lang/String;

    .line 28
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->attachments:Ljava/util/List;

    .line 29
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getMentionedUsersIds()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->mentionedUsersIds:Ljava/util/List;

    .line 30
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getMentionedUsers()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->mentionedUsers:Ljava/util/List;

    .line 31
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getReplyCount()I

    move-result v0

    iput v0, p0, Lio/getstream/chat/android/models/Message$Builder;->replyCount:I

    .line 32
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getDeletedReplyCount()I

    move-result v0

    iput v0, p0, Lio/getstream/chat/android/models/Message$Builder;->deletedReplyCount:I

    .line 33
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getReactionCounts()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->reactionCounts:Ljava/util/Map;

    .line 34
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getReactionScores()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->reactionScores:Ljava/util/Map;

    .line 35
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getReactionGroups()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->reactionGroups:Ljava/util/Map;

    .line 36
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    .line 37
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->type:Ljava/lang/String;

    .line 38
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getLatestReactions()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->latestReactions:Ljava/util/List;

    .line 39
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->ownReactions:Ljava/util/List;

    .line 40
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getCreatedAt()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->createdAt:Ljava/util/Date;

    .line 41
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUpdatedAt()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->updatedAt:Ljava/util/Date;

    .line 42
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getDeletedAt()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->deletedAt:Ljava/util/Date;

    .line 43
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUpdatedLocallyAt()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->updatedLocallyAt:Ljava/util/Date;

    .line 44
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->createdLocallyAt:Ljava/util/Date;

    .line 45
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->user:Lio/getstream/chat/android/models/User;

    .line 46
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getExtraData()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->extraData:Ljava/util/Map;

    .line 47
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getSilent()Z

    move-result v0

    iput-boolean v0, p0, Lio/getstream/chat/android/models/Message$Builder;->silent:Z

    .line 48
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getShadowed()Z

    move-result v0

    iput-boolean v0, p0, Lio/getstream/chat/android/models/Message$Builder;->shadowed:Z

    .line 49
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getI18n()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->i18n:Ljava/util/Map;

    .line 50
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getShowInChannel()Z

    move-result v0

    iput-boolean v0, p0, Lio/getstream/chat/android/models/Message$Builder;->showInChannel:Z

    .line 51
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getChannelInfo()Lio/getstream/chat/android/models/ChannelInfo;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->channelInfo:Lio/getstream/chat/android/models/ChannelInfo;

    .line 52
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getReplyTo()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->replyTo:Lio/getstream/chat/android/models/Message;

    .line 53
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getReplyMessageId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->replyMessageId:Ljava/lang/String;

    .line 54
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v0

    iput-boolean v0, p0, Lio/getstream/chat/android/models/Message$Builder;->pinned:Z

    .line 55
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getPinnedAt()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->pinnedAt:Ljava/util/Date;

    .line 56
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->pinExpires:Ljava/util/Date;

    .line 57
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getPinnedBy()Lio/getstream/chat/android/models/User;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->pinnedBy:Lio/getstream/chat/android/models/User;

    .line 58
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getThreadParticipants()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->threadParticipants:Ljava/util/List;

    .line 59
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getSkipPushNotification()Z

    move-result v0

    iput-boolean v0, p0, Lio/getstream/chat/android/models/Message$Builder;->skipPushNotification:Z

    .line 60
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getSkipEnrichUrl()Z

    move-result v0

    iput-boolean v0, p0, Lio/getstream/chat/android/models/Message$Builder;->skipEnrichUrl:Z

    .line 61
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getModerationDetails()Lio/getstream/chat/android/models/MessageModerationDetails;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->moderationDetails:Lio/getstream/chat/android/models/MessageModerationDetails;

    .line 62
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getModeration()Lio/getstream/chat/android/models/Moderation;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->moderation:Lio/getstream/chat/android/models/Moderation;

    .line 63
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getMessageTextUpdatedAt()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->messageTextUpdatedAt:Ljava/util/Date;

    .line 64
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->poll:Lio/getstream/chat/android/models/Poll;

    .line 65
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getRestrictedVisibility()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->restrictedVisibility:Ljava/util/List;

    .line 66
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getReminder()Lio/getstream/chat/android/models/MessageReminderInfo;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->reminder:Lio/getstream/chat/android/models/MessageReminderInfo;

    .line 67
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getSharedLocation()Lio/getstream/chat/android/models/Location;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->sharedLocation:Lio/getstream/chat/android/models/Location;

    .line 68
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getChannelRole()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Message$Builder;->channelRole:Ljava/lang/String;

    .line 69
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getDeletedForMe()Z

    move-result p1

    iput-boolean p1, p0, Lio/getstream/chat/android/models/Message$Builder;->deletedForMe:Z

    return-void
.end method


# virtual methods
.method public final build()Lio/getstream/chat/android/models/Message;
    .locals 50

    move-object/from16 v0, p0

    iget-object v2, v0, Lio/getstream/chat/android/models/Message$Builder;->id:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/models/Message$Builder;->cid:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/models/Message$Builder;->text:Ljava/lang/String;

    iget-object v5, v0, Lio/getstream/chat/android/models/Message$Builder;->html:Ljava/lang/String;

    iget-object v6, v0, Lio/getstream/chat/android/models/Message$Builder;->parentId:Ljava/lang/String;

    iget-object v7, v0, Lio/getstream/chat/android/models/Message$Builder;->command:Ljava/lang/String;

    iget-object v8, v0, Lio/getstream/chat/android/models/Message$Builder;->attachments:Ljava/util/List;

    iget-object v9, v0, Lio/getstream/chat/android/models/Message$Builder;->mentionedUsersIds:Ljava/util/List;

    iget-object v10, v0, Lio/getstream/chat/android/models/Message$Builder;->mentionedUsers:Ljava/util/List;

    iget v11, v0, Lio/getstream/chat/android/models/Message$Builder;->replyCount:I

    iget v12, v0, Lio/getstream/chat/android/models/Message$Builder;->deletedReplyCount:I

    iget-object v13, v0, Lio/getstream/chat/android/models/Message$Builder;->reactionCounts:Ljava/util/Map;

    iget-object v14, v0, Lio/getstream/chat/android/models/Message$Builder;->reactionScores:Ljava/util/Map;

    iget-object v15, v0, Lio/getstream/chat/android/models/Message$Builder;->reactionGroups:Ljava/util/Map;

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    move-object/from16 v16, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->type:Ljava/lang/String;

    move-object/from16 v17, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->latestReactions:Ljava/util/List;

    move-object/from16 v18, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->ownReactions:Ljava/util/List;

    move-object/from16 v19, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->createdAt:Ljava/util/Date;

    move-object/from16 v20, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->updatedAt:Ljava/util/Date;

    move-object/from16 v21, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->deletedAt:Ljava/util/Date;

    move-object/from16 v22, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->updatedLocallyAt:Ljava/util/Date;

    move-object/from16 v23, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->createdLocallyAt:Ljava/util/Date;

    move-object/from16 v24, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->user:Lio/getstream/chat/android/models/User;

    move-object/from16 v25, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->extraData:Ljava/util/Map;

    move-object/from16 v26, v1

    iget-boolean v1, v0, Lio/getstream/chat/android/models/Message$Builder;->silent:Z

    move/from16 v27, v1

    iget-boolean v1, v0, Lio/getstream/chat/android/models/Message$Builder;->shadowed:Z

    move/from16 v28, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->i18n:Ljava/util/Map;

    move-object/from16 v29, v1

    iget-boolean v1, v0, Lio/getstream/chat/android/models/Message$Builder;->showInChannel:Z

    move/from16 v30, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->channelInfo:Lio/getstream/chat/android/models/ChannelInfo;

    move-object/from16 v31, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->replyTo:Lio/getstream/chat/android/models/Message;

    move-object/from16 v32, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->replyMessageId:Ljava/lang/String;

    move-object/from16 v33, v1

    iget-boolean v1, v0, Lio/getstream/chat/android/models/Message$Builder;->pinned:Z

    move/from16 v34, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->pinnedAt:Ljava/util/Date;

    move-object/from16 v35, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->pinExpires:Ljava/util/Date;

    move-object/from16 v36, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->pinnedBy:Lio/getstream/chat/android/models/User;

    move-object/from16 v37, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->threadParticipants:Ljava/util/List;

    move-object/from16 v38, v1

    iget-boolean v1, v0, Lio/getstream/chat/android/models/Message$Builder;->skipPushNotification:Z

    move/from16 v39, v1

    iget-boolean v1, v0, Lio/getstream/chat/android/models/Message$Builder;->skipEnrichUrl:Z

    move/from16 v40, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->moderationDetails:Lio/getstream/chat/android/models/MessageModerationDetails;

    move-object/from16 v41, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->moderation:Lio/getstream/chat/android/models/Moderation;

    move-object/from16 v42, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->messageTextUpdatedAt:Ljava/util/Date;

    move-object/from16 v43, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->restrictedVisibility:Ljava/util/List;

    move-object/from16 v45, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->poll:Lio/getstream/chat/android/models/Poll;

    move-object/from16 v44, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->reminder:Lio/getstream/chat/android/models/MessageReminderInfo;

    move-object/from16 v46, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->sharedLocation:Lio/getstream/chat/android/models/Location;

    move-object/from16 v47, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Message$Builder;->channelRole:Ljava/lang/String;

    move-object/from16 v48, v1

    iget-boolean v1, v0, Lio/getstream/chat/android/models/Message$Builder;->deletedForMe:Z

    move/from16 v49, v1

    new-instance v1, Lio/getstream/chat/android/models/Message;

    invoke-direct/range {v1 .. v49}, Lio/getstream/chat/android/models/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public final withAttachments(Ljava/util/List;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;)",
            "Lio/getstream/chat/android/models/Message$Builder;"
        }
    .end annotation

    const-string v0, "attachments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->attachments:Ljava/util/List;

    return-object p0
.end method

.method public final withChannelInfo(Lio/getstream/chat/android/models/ChannelInfo;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->channelInfo:Lio/getstream/chat/android/models/ChannelInfo;

    return-object p0
.end method

.method public final withChannelRole(Ljava/lang/String;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->channelRole:Ljava/lang/String;

    return-object p0
.end method

.method public final withCid(Ljava/lang/String;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->cid:Ljava/lang/String;

    return-object p0
.end method

.method public final withCommand(Ljava/lang/String;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->command:Ljava/lang/String;

    return-object p0
.end method

.method public final withCreatedAt(Ljava/util/Date;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->createdAt:Ljava/util/Date;

    return-object p0
.end method

.method public final withCreatedLocallyAt(Ljava/util/Date;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->createdLocallyAt:Ljava/util/Date;

    return-object p0
.end method

.method public final withDeletedAt(Ljava/util/Date;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->deletedAt:Ljava/util/Date;

    return-object p0
.end method

.method public final withDeletedForMe(Z)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/models/Message$Builder;->deletedForMe:Z

    return-object p0
.end method

.method public final withDeletedReplyCount(I)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/models/Message$Builder;->deletedReplyCount:I

    return-object p0
.end method

.method public final withExtraData(Ljava/util/Map;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/models/Message$Builder;"
        }
    .end annotation

    const-string v0, "extraData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->extraData:Ljava/util/Map;

    return-object p0
.end method

.method public final withHtml(Ljava/lang/String;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1

    const-string v0, "html"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->html:Ljava/lang/String;

    return-object p0
.end method

.method public final withI18n(Ljava/util/Map;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/getstream/chat/android/models/Message$Builder;"
        }
    .end annotation

    const-string v0, "i18n"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->i18n:Ljava/util/Map;

    return-object p0
.end method

.method public final withId(Ljava/lang/String;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->id:Ljava/lang/String;

    return-object p0
.end method

.method public final withLatestReactions(Ljava/util/List;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;)",
            "Lio/getstream/chat/android/models/Message$Builder;"
        }
    .end annotation

    const-string v0, "latestReactions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->latestReactions:Ljava/util/List;

    return-object p0
.end method

.method public final withMentionedUsers(Ljava/util/List;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;)",
            "Lio/getstream/chat/android/models/Message$Builder;"
        }
    .end annotation

    const-string v0, "mentionedUsers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->mentionedUsers:Ljava/util/List;

    return-object p0
.end method

.method public final withMentionedUsersIds(Ljava/util/List;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/getstream/chat/android/models/Message$Builder;"
        }
    .end annotation

    const-string v0, "mentionedUsersIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->mentionedUsersIds:Ljava/util/List;

    return-object p0
.end method

.method public final withMessageTextUpdatedAt(Ljava/util/Date;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->messageTextUpdatedAt:Ljava/util/Date;

    return-object p0
.end method

.method public final withModeration(Lio/getstream/chat/android/models/Moderation;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1

    const-string v0, "moderation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->moderation:Lio/getstream/chat/android/models/Moderation;

    return-object p0
.end method

.method public final withModerationDetails(Lio/getstream/chat/android/models/MessageModerationDetails;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1

    const-string v0, "moderationDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->moderationDetails:Lio/getstream/chat/android/models/MessageModerationDetails;

    return-object p0
.end method

.method public final withOwnReactions(Ljava/util/List;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;)",
            "Lio/getstream/chat/android/models/Message$Builder;"
        }
    .end annotation

    const-string v0, "ownReactions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->ownReactions:Ljava/util/List;

    return-object p0
.end method

.method public final withParentId(Ljava/lang/String;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->parentId:Ljava/lang/String;

    return-object p0
.end method

.method public final withPinExpires(Ljava/util/Date;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->pinExpires:Ljava/util/Date;

    return-object p0
.end method

.method public final withPinned(Z)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/models/Message$Builder;->pinned:Z

    return-object p0
.end method

.method public final withPinnedAt(Ljava/util/Date;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->pinnedAt:Ljava/util/Date;

    return-object p0
.end method

.method public final withPinnedBy(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->pinnedBy:Lio/getstream/chat/android/models/User;

    return-object p0
.end method

.method public final withPoll(Lio/getstream/chat/android/models/Poll;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->poll:Lio/getstream/chat/android/models/Poll;

    return-object p0
.end method

.method public final withReactionCounts(Ljava/util/Map;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)",
            "Lio/getstream/chat/android/models/Message$Builder;"
        }
    .end annotation

    const-string v0, "reactionCounts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->reactionCounts:Ljava/util/Map;

    return-object p0
.end method

.method public final withReactionGroups(Ljava/util/Map;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/ReactionGroup;",
            ">;)",
            "Lio/getstream/chat/android/models/Message$Builder;"
        }
    .end annotation

    const-string v0, "reactionGroups"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->reactionGroups:Ljava/util/Map;

    return-object p0
.end method

.method public final withReactionScores(Ljava/util/Map;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)",
            "Lio/getstream/chat/android/models/Message$Builder;"
        }
    .end annotation

    const-string v0, "reactionScores"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->reactionScores:Ljava/util/Map;

    return-object p0
.end method

.method public final withReminder(Lio/getstream/chat/android/models/MessageReminderInfo;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->reminder:Lio/getstream/chat/android/models/MessageReminderInfo;

    return-object p0
.end method

.method public final withReplyCount(I)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/models/Message$Builder;->replyCount:I

    return-object p0
.end method

.method public final withReplyMessageId(Ljava/lang/String;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->replyMessageId:Ljava/lang/String;

    return-object p0
.end method

.method public final withReplyTo(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->replyTo:Lio/getstream/chat/android/models/Message;

    return-object p0
.end method

.method public final withRestrictedVisibility(Ljava/util/List;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/getstream/chat/android/models/Message$Builder;"
        }
    .end annotation

    const-string v0, "restrictedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->restrictedVisibility:Ljava/util/List;

    return-object p0
.end method

.method public final withShadowed(Z)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/models/Message$Builder;->shadowed:Z

    return-object p0
.end method

.method public final withSharedLocation(Lio/getstream/chat/android/models/Location;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->sharedLocation:Lio/getstream/chat/android/models/Location;

    return-object p0
.end method

.method public final withShowInChannel(Z)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/models/Message$Builder;->showInChannel:Z

    return-object p0
.end method

.method public final withSilent(Z)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/models/Message$Builder;->silent:Z

    return-object p0
.end method

.method public final withSkipEnrichUrl(Z)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/models/Message$Builder;->skipEnrichUrl:Z

    return-object p0
.end method

.method public final withSkipPushNotification(Z)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/models/Message$Builder;->skipPushNotification:Z

    return-object p0
.end method

.method public final withSyncStatus(Lio/getstream/chat/android/models/SyncStatus;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1

    const-string v0, "syncStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    return-object p0
.end method

.method public final withText(Ljava/lang/String;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->text:Ljava/lang/String;

    return-object p0
.end method

.method public final withThreadParticipants(Ljava/util/List;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;)",
            "Lio/getstream/chat/android/models/Message$Builder;"
        }
    .end annotation

    const-string v0, "threadParticipants"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->threadParticipants:Ljava/util/List;

    return-object p0
.end method

.method public final withType(Ljava/lang/String;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->type:Ljava/lang/String;

    return-object p0
.end method

.method public final withUpdatedAt(Ljava/util/Date;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->updatedAt:Ljava/util/Date;

    return-object p0
.end method

.method public final withUpdatedLocallyAt(Ljava/util/Date;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->updatedLocallyAt:Ljava/util/Date;

    return-object p0
.end method

.method public final withUser(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/Message$Builder;
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Message$Builder;->user:Lio/getstream/chat/android/models/User;

    return-object p0
.end method
