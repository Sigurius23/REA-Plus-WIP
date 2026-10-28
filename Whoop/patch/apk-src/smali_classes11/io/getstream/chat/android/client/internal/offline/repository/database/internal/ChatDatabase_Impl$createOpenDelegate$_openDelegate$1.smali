.class public final Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl$createOpenDelegate$_openDelegate$1;
.super Landroidx/room/g1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->createOpenDelegate()Landroidx/room/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0006J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "io/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl$createOpenDelegate$_openDelegate$1",
        "Landroidx/room/g1;",
        "Ltb/a;",
        "connection",
        "Ll83/a0;",
        "createAllTables",
        "(Ltb/a;)V",
        "dropAllTables",
        "onCreate",
        "onOpen",
        "onPreMigrate",
        "onPostMigrate",
        "Landroidx/room/f1;",
        "onValidateSchema",
        "(Ltb/a;)Landroidx/room/f1;",
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
.field final synthetic this$0:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;)V
    .locals 2

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl$createOpenDelegate$_openDelegate$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;

    const-string p1, "38d0772e5357ecc647da230de280d8d2"

    const-string v0, "07113e8f228ba656b99be06a80b5ac50"

    const/16 v1, 0xc8

    invoke-direct {p0, v1, p1, v0}, Landroidx/room/g1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final createAllTables(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `stream_channel_query` (`id` TEXT NOT NULL, `filter` TEXT NOT NULL, `querySort` TEXT NOT NULL, `cids` TEXT NOT NULL, `predefinedFilterName` TEXT, `predefinedFilterValues` TEXT, `predefinedSortValues` TEXT, PRIMARY KEY(`id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `stream_chat_message` (`id` TEXT NOT NULL, `cid` TEXT NOT NULL, `userId` TEXT NOT NULL, `text` TEXT NOT NULL, `html` TEXT NOT NULL, `type` TEXT NOT NULL, `syncStatus` INTEGER NOT NULL, `replyCount` INTEGER NOT NULL, `deletedReplyCount` INTEGER NOT NULL, `createdAt` INTEGER, `createdLocallyAt` INTEGER, `updatedAt` INTEGER, `updatedLocallyAt` INTEGER, `deletedAt` INTEGER, `remoteMentionedUserIds` TEXT NOT NULL, `mentionedUsersId` TEXT NOT NULL, `reactionCounts` TEXT NOT NULL, `reactionScores` TEXT NOT NULL, `reactionGroups` TEXT NOT NULL, `parentId` TEXT, `command` TEXT, `shadowed` INTEGER NOT NULL, `i18n` TEXT NOT NULL, `showInChannel` INTEGER NOT NULL, `silent` INTEGER NOT NULL, `extraData` TEXT NOT NULL, `replyToId` TEXT, `pinned` INTEGER NOT NULL, `pinnedAt` INTEGER, `pinExpires` INTEGER, `pinnedByUserId` TEXT, `threadParticipantsIds` TEXT NOT NULL, `skipPushNotification` INTEGER NOT NULL, `skipEnrichUrl` INTEGER NOT NULL, `moderationDetails` TEXT, `moderation` TEXT, `messageTextUpdatedAt` INTEGER, `pollId` TEXT, `restrictedVisibility` TEXT NOT NULL, `reminder` TEXT, `sharedLocation` TEXT, `channelRole` TEXT, `deletedForMe` INTEGER NOT NULL, `channel_infocid` TEXT, `channel_infoid` TEXT, `channel_infotype` TEXT, `channel_infomemberCount` INTEGER, `channel_infoname` TEXT, PRIMARY KEY(`id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_stream_chat_message_cid_createdAt` ON `stream_chat_message` (`cid`, `createdAt`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_stream_chat_message_syncStatus` ON `stream_chat_message` (`syncStatus`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `stream_chat_reply_message` (`id` TEXT NOT NULL, `cid` TEXT NOT NULL, `userId` TEXT NOT NULL, `text` TEXT NOT NULL, `html` TEXT NOT NULL, `type` TEXT NOT NULL, `syncStatus` INTEGER NOT NULL, `replyCount` INTEGER NOT NULL, `deletedReplyCount` INTEGER NOT NULL, `createdAt` INTEGER, `createdLocallyAt` INTEGER, `updatedAt` INTEGER, `updatedLocallyAt` INTEGER, `deletedAt` INTEGER, `remoteMentionedUserIds` TEXT NOT NULL, `mentionedUsersId` TEXT NOT NULL, `parentId` TEXT, `command` TEXT, `shadowed` INTEGER NOT NULL, `i18n` TEXT NOT NULL, `showInChannel` INTEGER NOT NULL, `silent` INTEGER NOT NULL, `extraData` TEXT NOT NULL, `pinned` INTEGER NOT NULL, `pinnedAt` INTEGER, `pinExpires` INTEGER, `pinnedByUserId` TEXT, `threadParticipantsIds` TEXT NOT NULL, `moderationDetails` TEXT, `messageTextUpdatedAt` INTEGER, `pollId` TEXT, `restrictedVisibility` TEXT NOT NULL, `reminder` TEXT, `channelRole` TEXT, `channel_infocid` TEXT, `channel_infoid` TEXT, `channel_infotype` TEXT, `channel_infomemberCount` INTEGER, `channel_infoname` TEXT, PRIMARY KEY(`id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_stream_chat_reply_message_cid_createdAt` ON `stream_chat_reply_message` (`cid`, `createdAt`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_stream_chat_reply_message_syncStatus` ON `stream_chat_reply_message` (`syncStatus`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `attachment_inner_entity` (`id` TEXT NOT NULL, `messageId` TEXT NOT NULL, `authorName` TEXT, `titleLink` TEXT, `authorLink` TEXT, `thumbUrl` TEXT, `imageUrl` TEXT, `assetUrl` TEXT, `ogUrl` TEXT, `mimeType` TEXT, `fileSize` INTEGER NOT NULL, `title` TEXT, `text` TEXT, `type` TEXT, `image` TEXT, `name` TEXT, `fallback` TEXT, `uploadFilePath` TEXT, `originalHeight` INTEGER, `originalWidth` INTEGER, `extraData` TEXT NOT NULL, `statusCode` INTEGER, `errorMessage` TEXT, PRIMARY KEY(`id`), FOREIGN KEY(`messageId`) REFERENCES `stream_chat_message`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_attachment_inner_entity_messageId` ON `attachment_inner_entity` (`messageId`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_attachment_inner_entity_id` ON `attachment_inner_entity` (`id`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `reply_attachment_inner_entity` (`id` TEXT NOT NULL, `messageId` TEXT NOT NULL, `authorName` TEXT, `titleLink` TEXT, `authorLink` TEXT, `thumbUrl` TEXT, `imageUrl` TEXT, `assetUrl` TEXT, `ogUrl` TEXT, `mimeType` TEXT, `fileSize` INTEGER NOT NULL, `title` TEXT, `text` TEXT, `type` TEXT, `image` TEXT, `name` TEXT, `fallback` TEXT, `uploadFilePath` TEXT, `originalHeight` INTEGER, `originalWidth` INTEGER, `extraData` TEXT NOT NULL, `statusCode` INTEGER, `errorMessage` TEXT, PRIMARY KEY(`id`), FOREIGN KEY(`messageId`) REFERENCES `stream_chat_reply_message`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_reply_attachment_inner_entity_messageId` ON `reply_attachment_inner_entity` (`messageId`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_reply_attachment_inner_entity_id` ON `reply_attachment_inner_entity` (`id`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `stream_chat_user` (`id` TEXT NOT NULL, `originalId` TEXT NOT NULL, `name` TEXT NOT NULL, `image` TEXT NOT NULL, `role` TEXT NOT NULL, `createdAt` INTEGER, `updatedAt` INTEGER, `lastActive` INTEGER, `invisible` INTEGER NOT NULL, `privacySettings` TEXT, `banned` INTEGER NOT NULL, `mutes` TEXT NOT NULL, `teams` TEXT NOT NULL, `teamsRole` TEXT NOT NULL, `extraData` TEXT NOT NULL, `avgResponseTime` INTEGER, `pushPreference` TEXT, PRIMARY KEY(`id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_stream_chat_user_name` ON `stream_chat_user` (`name`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `stream_chat_reaction` (`messageId` TEXT NOT NULL, `userId` TEXT NOT NULL, `type` TEXT NOT NULL, `score` INTEGER NOT NULL, `createdAt` INTEGER, `createdLocallyAt` INTEGER, `updatedAt` INTEGER, `deletedAt` INTEGER, `enforceUnique` INTEGER NOT NULL, `skipPush` INTEGER NOT NULL, `emojiCode` TEXT, `extraData` TEXT NOT NULL, `syncStatus` INTEGER NOT NULL, `id` INTEGER NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`messageId`) REFERENCES `stream_chat_message`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE UNIQUE INDEX IF NOT EXISTS `index_stream_chat_reaction_messageId_userId_type` ON `stream_chat_reaction` (`messageId`, `userId`, `type`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_stream_chat_reaction_syncStatus` ON `stream_chat_reaction` (`syncStatus`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_stream_chat_reaction_messageId` ON `stream_chat_reaction` (`messageId`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `stream_chat_channel_state` (`type` TEXT NOT NULL, `channelId` TEXT NOT NULL, `name` TEXT NOT NULL, `image` TEXT NOT NULL, `cooldown` INTEGER NOT NULL, `createdByUserId` TEXT NOT NULL, `filterTags` TEXT NOT NULL, `frozen` INTEGER NOT NULL, `hidden` INTEGER, `hideMessagesBefore` INTEGER, `members` TEXT NOT NULL, `memberCount` INTEGER NOT NULL, `watcherIds` TEXT NOT NULL, `watcherCount` INTEGER NOT NULL, `reads` TEXT NOT NULL, `lastMessageAt` INTEGER, `lastMessageId` TEXT, `createdAt` INTEGER, `updatedAt` INTEGER, `deletedAt` INTEGER, `extraData` TEXT NOT NULL, `syncStatus` INTEGER NOT NULL, `team` TEXT NOT NULL, `ownCapabilities` TEXT NOT NULL, `membership` TEXT, `activeLiveLocations` TEXT NOT NULL, `messageCount` INTEGER, `cid` TEXT NOT NULL, PRIMARY KEY(`cid`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_stream_chat_channel_state_syncStatus` ON `stream_chat_channel_state` (`syncStatus`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `stream_chat_channel_config` (`channelType` TEXT NOT NULL, `createdAt` INTEGER, `updatedAt` INTEGER, `name` TEXT NOT NULL, `isTypingEvents` INTEGER NOT NULL, `isReadEvents` INTEGER NOT NULL, `deliveryEventsEnabled` INTEGER NOT NULL, `isConnectEvents` INTEGER NOT NULL, `isSearch` INTEGER NOT NULL, `isReactionsEnabled` INTEGER NOT NULL, `isThreadEnabled` INTEGER NOT NULL, `isMutes` INTEGER NOT NULL, `uploadsEnabled` INTEGER NOT NULL, `urlEnrichmentEnabled` INTEGER NOT NULL, `customEventsEnabled` INTEGER NOT NULL, `pushNotificationsEnabled` INTEGER NOT NULL, `messageRetention` TEXT NOT NULL, `maxMessageLength` INTEGER NOT NULL, `automod` TEXT NOT NULL, `automodBehavior` TEXT NOT NULL, `blocklistBehavior` TEXT NOT NULL, `messageRemindersEnabled` INTEGER NOT NULL, `markMessagesPending` INTEGER NOT NULL, PRIMARY KEY(`channelType`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `command_inner_entity` (`name` TEXT NOT NULL, `description` TEXT NOT NULL, `args` TEXT NOT NULL, `set` TEXT NOT NULL, `channelType` TEXT NOT NULL, `id` INTEGER NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`channelType`) REFERENCES `stream_chat_channel_config`(`channelType`) ON UPDATE CASCADE ON DELETE CASCADE )"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_command_inner_entity_channelType` ON `command_inner_entity` (`channelType`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `stream_sync_state` (`userId` TEXT NOT NULL, `activeChannelIds` TEXT NOT NULL, `lastSyncedAt` INTEGER, `rawLastSyncedAt` TEXT, `markedAllReadAt` INTEGER, PRIMARY KEY(`userId`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `stream_chat_poll` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `options` TEXT NOT NULL, `votingVisibility` TEXT NOT NULL, `enforceUniqueVote` INTEGER NOT NULL, `maxVotesAllowed` INTEGER, `allowUserSuggestedOptions` INTEGER NOT NULL, `allowAnswers` INTEGER NOT NULL, `voteCount` INTEGER NOT NULL, `voteCountsByOption` TEXT NOT NULL, `votes` TEXT NOT NULL, `ownVotes` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, `closed` INTEGER NOT NULL, `answersCount` INTEGER NOT NULL, `answers` TEXT NOT NULL, `createdById` TEXT, `extraData` TEXT NOT NULL, PRIMARY KEY(`id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `stream_chat_thread` (`parentMessageId` TEXT NOT NULL, `cid` TEXT NOT NULL, `createdByUserId` TEXT NOT NULL, `activeParticipantCount` INTEGER NOT NULL, `participantCount` INTEGER NOT NULL, `threadParticipants` TEXT NOT NULL, `lastMessageAt` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, `deletedAt` INTEGER, `title` TEXT NOT NULL, `read` TEXT NOT NULL, `latestReplyIds` TEXT NOT NULL, `extraData` TEXT NOT NULL, PRIMARY KEY(`parentMessageId`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `stream_chat_thread_order` (`id` TEXT NOT NULL, `order` TEXT NOT NULL, PRIMARY KEY(`id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `stream_chat_draft_message_entity` (`id` TEXT NOT NULL, `cid` TEXT NOT NULL, `text` TEXT NOT NULL, `parentId` TEXT, `mentionedUsersIds` TEXT NOT NULL, `silent` INTEGER NOT NULL, `showInChannel` INTEGER NOT NULL, `replyMessageId` TEXT, `command` TEXT, `args` TEXT, `extraData` TEXT NOT NULL, PRIMARY KEY(`id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'38d0772e5357ecc647da230de280d8d2\')"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method

.method public final dropAllTables(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS `stream_channel_query`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `stream_chat_message`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `stream_chat_reply_message`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `attachment_inner_entity`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `reply_attachment_inner_entity`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `stream_chat_user`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `stream_chat_reaction`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `stream_chat_channel_state`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `stream_chat_channel_config`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `command_inner_entity`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `stream_sync_state`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `stream_chat_poll`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `stream_chat_thread`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `stream_chat_thread_order`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `stream_chat_draft_message_entity`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method

.method public final onCreate(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onOpen(Ltb/a;)V
    .locals 2

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "PRAGMA foreign_keys = ON"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl$createOpenDelegate$_openDelegate$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;

    sget v1, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->a:I

    invoke-virtual {v0, p1}, Landroidx/room/z0;->internalInitInvalidationTracker(Ltb/a;)V

    return-void
.end method

.method public final onPostMigrate(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onPreMigrate(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lse/a;->I(Ltb/a;)V

    return-void
.end method

.method public final onValidateSchema(Ltb/a;)Landroidx/room/f1;
    .locals 54

    move-object/from16 v0, p1

    const-string v1, "connection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v2, Lob/h;

    const/4 v7, 0x0

    const/4 v4, 0x1

    const/4 v3, 0x1

    const-string v5, "id"

    const-string v6, "TEXT"

    const/4 v8, 0x1

    invoke-direct/range {v2 .. v8}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v3, "id"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lob/h;

    const/4 v9, 0x0

    const/4 v6, 0x1

    const/4 v5, 0x0

    const-string v7, "filter"

    const-string v8, "TEXT"

    const/4 v10, 0x1

    invoke-direct/range {v4 .. v10}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "filter"

    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lob/h;

    const/4 v10, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    const-string v8, "querySort"

    const-string v9, "TEXT"

    const/4 v11, 0x1

    invoke-direct/range {v5 .. v11}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "querySort"

    invoke-interface {v1, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lob/h;

    const/4 v11, 0x0

    const/4 v8, 0x1

    const/4 v7, 0x0

    const-string v9, "cids"

    const-string v10, "TEXT"

    const/4 v12, 0x1

    invoke-direct/range {v6 .. v12}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "cids"

    invoke-interface {v1, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lob/h;

    const/4 v12, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x0

    const-string v10, "predefinedFilterName"

    const-string v11, "TEXT"

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v13}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "predefinedFilterName"

    invoke-interface {v1, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lob/h;

    const/4 v13, 0x0

    const/4 v10, 0x1

    const/4 v9, 0x0

    const-string v11, "predefinedFilterValues"

    const-string v12, "TEXT"

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v14}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "predefinedFilterValues"

    invoke-interface {v1, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v9, Lob/h;

    const/4 v14, 0x0

    const/4 v11, 0x1

    const/4 v10, 0x0

    const-string v12, "predefinedSortValues"

    const-string v13, "TEXT"

    const/4 v15, 0x0

    invoke-direct/range {v9 .. v15}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "predefinedSortValues"

    invoke-static {v1, v2, v9}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v5, Lob/k;

    const-string v6, "stream_channel_query"

    invoke-direct {v5, v6, v1, v2, v4}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v6, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v5, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v4, "\n Found:\n"

    const/4 v6, 0x0

    if-nez v2, :cond_0

    new-instance v0, Landroidx/room/f1;

    const-string v2, "stream_channel_query(io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.QueryChannelsEntity).\n Expected:\n"

    invoke-static {v2, v5, v4, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v6, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v7, Lob/h;

    const/4 v12, 0x0

    const/4 v9, 0x1

    const/4 v13, 0x1

    const/4 v8, 0x1

    const-string v10, "id"

    const-string v11, "TEXT"

    invoke-direct/range {v7 .. v13}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v1, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lob/h;

    const/4 v13, 0x0

    const/4 v10, 0x1

    const/4 v14, 0x1

    const/4 v9, 0x0

    const-string v11, "cid"

    const-string v12, "TEXT"

    invoke-direct/range {v8 .. v14}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "cid"

    invoke-interface {v1, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v9, Lob/h;

    const/4 v14, 0x0

    const/4 v11, 0x1

    const/4 v15, 0x1

    const/4 v10, 0x0

    const-string v12, "userId"

    const-string v13, "TEXT"

    invoke-direct/range {v9 .. v15}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v5, "userId"

    invoke-interface {v1, v5, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, Lob/h;

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/16 v16, 0x1

    const/4 v11, 0x0

    const-string v13, "text"

    const-string v14, "TEXT"

    invoke-direct/range {v10 .. v16}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "text"

    invoke-interface {v1, v7, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Lob/h;

    const/16 v16, 0x0

    const/4 v13, 0x1

    const/16 v17, 0x1

    const/4 v12, 0x0

    const-string v14, "html"

    const-string v15, "TEXT"

    invoke-direct/range {v11 .. v17}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v8, "html"

    invoke-interface {v1, v8, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v12, Lob/h;

    const/16 v17, 0x0

    const/4 v14, 0x1

    const/16 v18, 0x1

    const/4 v13, 0x0

    const-string v15, "type"

    const-string v16, "TEXT"

    invoke-direct/range {v12 .. v18}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v9, "type"

    invoke-interface {v1, v9, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/16 v19, 0x1

    const/4 v14, 0x0

    const-string v16, "syncStatus"

    const-string v17, "INTEGER"

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "syncStatus"

    invoke-interface {v1, v10, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/16 v20, 0x1

    const/4 v15, 0x0

    const-string v17, "replyCount"

    const-string v18, "INTEGER"

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v11, "replyCount"

    invoke-interface {v1, v11, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const/16 v21, 0x1

    const/16 v16, 0x0

    const-string v18, "deletedReplyCount"

    const-string v19, "INTEGER"

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v12, "deletedReplyCount"

    invoke-interface {v1, v12, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v16, Lob/h;

    const/16 v21, 0x0

    const/16 v18, 0x1

    const/16 v22, 0x0

    const/16 v17, 0x0

    const-string v19, "createdAt"

    const-string v20, "INTEGER"

    invoke-direct/range {v16 .. v22}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v13, v16

    const-string v14, "createdAt"

    invoke-interface {v1, v14, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const/16 v21, 0x0

    const/16 v16, 0x0

    const-string v18, "createdLocallyAt"

    const-string v19, "INTEGER"

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v13, "createdLocallyAt"

    invoke-interface {v1, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v16, Lob/h;

    const/16 v21, 0x0

    const/16 v18, 0x1

    const/16 v17, 0x0

    const-string v19, "updatedAt"

    const-string v20, "INTEGER"

    invoke-direct/range {v16 .. v22}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v15, v16

    const-string v6, "updatedAt"

    invoke-interface {v1, v6, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v17, Lob/h;

    const/16 v22, 0x0

    const/16 v19, 0x1

    const/16 v23, 0x0

    const/16 v18, 0x0

    const-string v20, "updatedLocallyAt"

    const-string v21, "INTEGER"

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v15, v17

    move-object/from16 v17, v6

    const-string v6, "updatedLocallyAt"

    invoke-interface {v1, v6, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const/16 v23, 0x0

    const/16 v20, 0x1

    const/16 v24, 0x0

    const/16 v19, 0x0

    const-string v21, "deletedAt"

    const-string v22, "INTEGER"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v15, v18

    move-object/from16 v18, v6

    const-string v6, "deletedAt"

    invoke-interface {v1, v6, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const/16 v24, 0x0

    const/16 v21, 0x1

    const/16 v25, 0x1

    const/16 v20, 0x0

    const-string v22, "remoteMentionedUserIds"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v15, v19

    move-object/from16 v19, v6

    const-string v6, "remoteMentionedUserIds"

    invoke-interface {v1, v6, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v20, Lob/h;

    const/16 v25, 0x0

    const/16 v22, 0x1

    const/16 v26, 0x1

    const/16 v21, 0x0

    const-string v23, "mentionedUsersId"

    const-string v24, "TEXT"

    invoke-direct/range {v20 .. v26}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v15, v20

    move-object/from16 v20, v6

    const-string v6, "mentionedUsersId"

    invoke-interface {v1, v6, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v21, Lob/h;

    const/16 v26, 0x0

    const/16 v23, 0x1

    const/16 v27, 0x1

    const/16 v22, 0x0

    const-string v24, "reactionCounts"

    const-string v25, "TEXT"

    invoke-direct/range {v21 .. v27}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v15, v21

    move-object/from16 v21, v6

    const-string v6, "reactionCounts"

    invoke-interface {v1, v6, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v22, Lob/h;

    const/16 v27, 0x0

    const/16 v24, 0x1

    const/16 v28, 0x1

    const/16 v23, 0x0

    const-string v25, "reactionScores"

    const-string v26, "TEXT"

    invoke-direct/range {v22 .. v28}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v22

    const-string v15, "reactionScores"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v22, Lob/h;

    const-string v25, "reactionGroups"

    const-string v26, "TEXT"

    invoke-direct/range {v22 .. v28}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v22

    const-string v15, "reactionGroups"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v22, Lob/h;

    const/16 v28, 0x0

    const-string v25, "parentId"

    const-string v26, "TEXT"

    invoke-direct/range {v22 .. v28}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v22

    const-string v15, "parentId"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v22, Lob/h;

    const-string v25, "command"

    const-string v26, "TEXT"

    invoke-direct/range {v22 .. v28}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v22

    move-object/from16 v22, v15

    const-string v15, "command"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v23, Lob/h;

    const/16 v28, 0x0

    const/16 v25, 0x1

    const/16 v29, 0x1

    const/16 v24, 0x0

    const-string v26, "shadowed"

    const-string v27, "INTEGER"

    invoke-direct/range {v23 .. v29}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v23

    move-object/from16 v23, v15

    const-string v15, "shadowed"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v24, Lob/h;

    const/16 v29, 0x0

    const/16 v26, 0x1

    const/16 v30, 0x1

    const/16 v25, 0x0

    const-string v27, "i18n"

    const-string v28, "TEXT"

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v24

    move-object/from16 v24, v15

    const-string v15, "i18n"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v25, Lob/h;

    const/16 v30, 0x0

    const/16 v27, 0x1

    const/16 v31, 0x1

    const/16 v26, 0x0

    const-string v28, "showInChannel"

    const-string v29, "INTEGER"

    invoke-direct/range {v25 .. v31}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v25

    move-object/from16 v25, v15

    const-string v15, "showInChannel"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v26, Lob/h;

    const/16 v31, 0x0

    const/16 v28, 0x1

    const/16 v32, 0x1

    const/16 v27, 0x0

    const-string v29, "silent"

    const-string v30, "INTEGER"

    invoke-direct/range {v26 .. v32}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v26

    move-object/from16 v26, v15

    const-string v15, "silent"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v27, Lob/h;

    const/16 v32, 0x0

    const/16 v29, 0x1

    const/16 v33, 0x1

    const/16 v28, 0x0

    const-string v30, "extraData"

    const-string v31, "TEXT"

    invoke-direct/range {v27 .. v33}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v27

    move-object/from16 v27, v15

    const-string v15, "extraData"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v33, 0x0

    const/16 v30, 0x1

    const/16 v34, 0x0

    const/16 v29, 0x0

    const-string v31, "replyToId"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v28

    move-object/from16 v28, v15

    const-string v15, "replyToId"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const/16 v34, 0x0

    const/16 v31, 0x1

    const/16 v35, 0x1

    const/16 v30, 0x0

    const-string v32, "pinned"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v29

    const-string v15, "pinned"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const/16 v35, 0x0

    const-string v32, "pinnedAt"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v29

    move-object/from16 v29, v15

    const-string v15, "pinnedAt"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v30, Lob/h;

    const/16 v35, 0x0

    const/16 v32, 0x1

    const/16 v36, 0x0

    const/16 v31, 0x0

    const-string v33, "pinExpires"

    const-string v34, "INTEGER"

    invoke-direct/range {v30 .. v36}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v30

    move-object/from16 v30, v15

    const-string v15, "pinExpires"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v31, Lob/h;

    const/16 v36, 0x0

    const/16 v33, 0x1

    const/16 v37, 0x0

    const/16 v32, 0x0

    const-string v34, "pinnedByUserId"

    const-string v35, "TEXT"

    invoke-direct/range {v31 .. v37}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v31

    move-object/from16 v31, v15

    const-string v15, "pinnedByUserId"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v37, 0x0

    const/16 v34, 0x1

    const/16 v38, 0x1

    const/16 v33, 0x0

    const-string v35, "threadParticipantsIds"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v32

    move-object/from16 v32, v15

    const-string v15, "threadParticipantsIds"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v33, Lob/h;

    const/16 v38, 0x0

    const/16 v35, 0x1

    const/16 v39, 0x1

    const/16 v34, 0x0

    const-string v36, "skipPushNotification"

    const-string v37, "INTEGER"

    invoke-direct/range {v33 .. v39}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v33

    move-object/from16 v33, v15

    const-string v15, "skipPushNotification"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v34, Lob/h;

    const/16 v39, 0x0

    const/16 v36, 0x1

    const/16 v40, 0x1

    const/16 v35, 0x0

    const-string v37, "skipEnrichUrl"

    const-string v38, "INTEGER"

    invoke-direct/range {v34 .. v40}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v34

    const-string v15, "skipEnrichUrl"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v34, Lob/h;

    const/16 v40, 0x0

    const-string v37, "moderationDetails"

    const-string v38, "TEXT"

    invoke-direct/range {v34 .. v40}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v34

    const-string v15, "moderationDetails"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v34, Lob/h;

    const-string v37, "moderation"

    const-string v38, "TEXT"

    invoke-direct/range {v34 .. v40}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v34

    move-object/from16 v34, v15

    const-string v15, "moderation"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v35, Lob/h;

    const/16 v40, 0x0

    const/16 v37, 0x1

    const/16 v41, 0x0

    const/16 v36, 0x0

    const-string v38, "messageTextUpdatedAt"

    const-string v39, "INTEGER"

    invoke-direct/range {v35 .. v41}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v35

    const-string v15, "messageTextUpdatedAt"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v35, Lob/h;

    const-string v38, "pollId"

    const-string v39, "TEXT"

    invoke-direct/range {v35 .. v41}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v35

    move-object/from16 v35, v15

    const-string v15, "pollId"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v36, Lob/h;

    const/16 v41, 0x0

    const/16 v38, 0x1

    const/16 v42, 0x1

    const/16 v37, 0x0

    const-string v39, "restrictedVisibility"

    const-string v40, "TEXT"

    invoke-direct/range {v36 .. v42}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v36

    move-object/from16 v36, v15

    const-string v15, "restrictedVisibility"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v37, Lob/h;

    const/16 v42, 0x0

    const/16 v39, 0x1

    const/16 v43, 0x0

    const/16 v38, 0x0

    const-string v40, "reminder"

    const-string v41, "TEXT"

    invoke-direct/range {v37 .. v43}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v37

    move-object/from16 v37, v15

    const-string v15, "reminder"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v38, Lob/h;

    const/16 v43, 0x0

    const/16 v40, 0x1

    const/16 v44, 0x0

    const/16 v39, 0x0

    const-string v41, "sharedLocation"

    const-string v42, "TEXT"

    invoke-direct/range {v38 .. v44}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v38

    move-object/from16 v38, v15

    const-string v15, "sharedLocation"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v39, Lob/h;

    const/16 v44, 0x0

    const/16 v41, 0x1

    const/16 v45, 0x0

    const/16 v40, 0x0

    const-string v42, "channelRole"

    const-string v43, "TEXT"

    invoke-direct/range {v39 .. v45}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v39

    const-string v15, "channelRole"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v39, Lob/h;

    const/16 v45, 0x1

    const-string v42, "deletedForMe"

    const-string v43, "INTEGER"

    invoke-direct/range {v39 .. v45}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v39

    move-object/from16 v39, v15

    const-string v15, "deletedForMe"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v40, Lob/h;

    const/16 v45, 0x0

    const/16 v42, 0x1

    const/16 v46, 0x0

    const/16 v41, 0x0

    const-string v43, "channel_infocid"

    const-string v44, "TEXT"

    invoke-direct/range {v40 .. v46}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v40

    const-string v15, "channel_infocid"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v40, Lob/h;

    const-string v43, "channel_infoid"

    const-string v44, "TEXT"

    invoke-direct/range {v40 .. v46}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v40

    move-object/from16 v40, v15

    const-string v15, "channel_infoid"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v41, Lob/h;

    const/16 v46, 0x0

    const/16 v43, 0x1

    const/16 v47, 0x0

    const/16 v42, 0x0

    const-string v44, "channel_infotype"

    const-string v45, "TEXT"

    invoke-direct/range {v41 .. v47}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v41

    const-string v15, "channel_infotype"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v41, Lob/h;

    const-string v44, "channel_infomemberCount"

    const-string v45, "INTEGER"

    invoke-direct/range {v41 .. v47}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v41

    const-string v15, "channel_infomemberCount"

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v41, Lob/h;

    const-string v44, "channel_infoname"

    const-string v45, "TEXT"

    invoke-direct/range {v41 .. v47}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v41

    const-string v15, "channel_infoname"

    invoke-static {v1, v15, v6}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v6

    new-instance v15, Ljava/util/LinkedHashSet;

    invoke-direct {v15}, Ljava/util/LinkedHashSet;-><init>()V

    move-object/from16 v41, v13

    new-instance v13, Lob/j;

    filled-new-array {v2, v14}, [Ljava/lang/String;

    move-result-object v42

    move-object/from16 v43, v14

    invoke-static/range {v42 .. v42}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    move-object/from16 v42, v12

    const-string v12, "ASC"

    filled-new-array {v12, v12}, [Ljava/lang/String;

    move-result-object v44

    move-object/from16 v45, v12

    invoke-static/range {v44 .. v44}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    move-object/from16 v44, v11

    const-string v11, "index_stream_chat_message_cid_createdAt"

    move-object/from16 v46, v10

    const/4 v10, 0x0

    invoke-direct {v13, v11, v14, v12, v10}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v15, v13}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v11, Lob/j;

    invoke-static/range {v46 .. v46}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    invoke-static/range {v45 .. v45}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const-string v14, "index_stream_chat_message_syncStatus"

    invoke-direct {v11, v14, v12, v13, v10}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v15, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v10, Lob/k;

    const-string v11, "stream_chat_message"

    invoke-direct {v10, v11, v1, v6, v15}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "stream_chat_message"

    invoke-static {v1, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v10, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    new-instance v0, Landroidx/room/f1;

    const-string v2, "stream_chat_message(io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageInnerEntity).\n Expected:\n"

    invoke-static {v2, v10, v4, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x0

    invoke-direct {v0, v10, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v47, Lob/h;

    const/16 v52, 0x0

    const/16 v49, 0x1

    const/16 v53, 0x1

    const/16 v48, 0x1

    const-string v50, "id"

    const-string v51, "TEXT"

    invoke-direct/range {v47 .. v53}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v47

    invoke-interface {v1, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v47, Lob/h;

    const/16 v48, 0x0

    const-string v50, "cid"

    const-string v51, "TEXT"

    invoke-direct/range {v47 .. v53}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v47

    invoke-interface {v1, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v47, Lob/h;

    const-string v50, "userId"

    const-string v51, "TEXT"

    invoke-direct/range {v47 .. v53}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v47

    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v47, Lob/h;

    const-string v50, "text"

    const-string v51, "TEXT"

    invoke-direct/range {v47 .. v53}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v47

    invoke-interface {v1, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v47, Lob/h;

    const-string v50, "html"

    const-string v51, "TEXT"

    invoke-direct/range {v47 .. v53}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v47

    invoke-interface {v1, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v47, Lob/h;

    const-string v50, "type"

    const-string v51, "TEXT"

    invoke-direct/range {v47 .. v53}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v47

    invoke-interface {v1, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v47, Lob/h;

    const-string v50, "syncStatus"

    const-string v51, "INTEGER"

    invoke-direct/range {v47 .. v53}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v8, v46

    move-object/from16 v6, v47

    invoke-interface {v1, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const/16 v51, 0x0

    const/16 v48, 0x1

    const/16 v52, 0x1

    const/16 v47, 0x0

    const-string v49, "replyCount"

    const-string v50, "INTEGER"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v10, v44

    move-object/from16 v6, v46

    invoke-interface {v1, v10, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const-string v49, "deletedReplyCount"

    const-string v50, "INTEGER"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v10, v42

    move-object/from16 v6, v46

    invoke-interface {v1, v10, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const/16 v52, 0x0

    const-string v49, "createdAt"

    const-string v50, "INTEGER"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v10, v43

    move-object/from16 v6, v46

    invoke-interface {v1, v10, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const-string v49, "createdLocallyAt"

    const-string v50, "INTEGER"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v11, v41

    move-object/from16 v6, v46

    invoke-interface {v1, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const-string v49, "updatedAt"

    const-string v50, "INTEGER"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v12, v17

    move-object/from16 v6, v46

    invoke-interface {v1, v12, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const-string v49, "updatedLocallyAt"

    const-string v50, "INTEGER"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v13, v18

    move-object/from16 v6, v46

    invoke-interface {v1, v13, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const-string v49, "deletedAt"

    const-string v50, "INTEGER"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v13, v19

    move-object/from16 v6, v46

    invoke-interface {v1, v13, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const/16 v52, 0x1

    const-string v49, "remoteMentionedUserIds"

    const-string v50, "TEXT"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v14, v20

    move-object/from16 v6, v46

    invoke-interface {v1, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const-string v49, "mentionedUsersId"

    const-string v50, "TEXT"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v14, v21

    move-object/from16 v6, v46

    invoke-interface {v1, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const/16 v52, 0x0

    const-string v49, "parentId"

    const-string v50, "TEXT"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v14, v22

    move-object/from16 v6, v46

    invoke-interface {v1, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const-string v49, "command"

    const-string v50, "TEXT"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v15, v23

    move-object/from16 v6, v46

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v17, Lob/h;

    const/16 v22, 0x0

    const/16 v19, 0x1

    const/16 v23, 0x1

    const/16 v18, 0x0

    const-string v20, "shadowed"

    const-string v21, "INTEGER"

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v23, v15

    move-object/from16 v6, v17

    move-object/from16 v15, v24

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const/16 v52, 0x1

    const-string v49, "i18n"

    const-string v50, "TEXT"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v15, v25

    move-object/from16 v6, v46

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const-string v49, "showInChannel"

    const-string v50, "INTEGER"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v15, v26

    move-object/from16 v6, v46

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const-string v49, "silent"

    const-string v50, "INTEGER"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v15, v27

    move-object/from16 v6, v46

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const-string v49, "extraData"

    const-string v50, "TEXT"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v15, v28

    move-object/from16 v6, v46

    invoke-interface {v1, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const-string v49, "pinned"

    const-string v50, "INTEGER"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v22, v14

    move-object/from16 v14, v29

    move-object/from16 v6, v46

    invoke-interface {v1, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const/16 v52, 0x0

    const-string v49, "pinnedAt"

    const-string v50, "INTEGER"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v14, v30

    move-object/from16 v6, v46

    invoke-interface {v1, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const-string v49, "pinExpires"

    const-string v50, "INTEGER"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v14, v31

    move-object/from16 v6, v46

    invoke-interface {v1, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const-string v49, "pinnedByUserId"

    const-string v50, "TEXT"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v14, v32

    move-object/from16 v6, v46

    invoke-interface {v1, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const/16 v52, 0x1

    const-string v49, "threadParticipantsIds"

    const-string v50, "TEXT"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v14, v33

    move-object/from16 v6, v46

    invoke-interface {v1, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v46, Lob/h;

    const/16 v52, 0x0

    const-string v49, "moderationDetails"

    const-string v50, "TEXT"

    invoke-direct/range {v46 .. v52}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v14, v34

    move-object/from16 v6, v46

    invoke-interface {v1, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v33, 0x0

    const/16 v30, 0x1

    const/16 v34, 0x0

    const/16 v29, 0x0

    const-string v31, "messageTextUpdatedAt"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v28

    move-object/from16 v14, v35

    invoke-interface {v1, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "pollId"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v28

    move-object/from16 v14, v36

    invoke-interface {v1, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x1

    const-string v31, "restrictedVisibility"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v28

    move-object/from16 v14, v37

    invoke-interface {v1, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x0

    const-string v31, "reminder"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v28

    move-object/from16 v14, v38

    invoke-interface {v1, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "channelRole"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v28

    move-object/from16 v14, v39

    invoke-interface {v1, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "channel_infocid"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v28

    move-object/from16 v14, v40

    invoke-interface {v1, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "channel_infoid"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v28

    const-string v14, "channel_infoid"

    invoke-interface {v1, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "channel_infotype"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v28

    const-string v14, "channel_infotype"

    invoke-interface {v1, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "channel_infomemberCount"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v28

    const-string v14, "channel_infomemberCount"

    invoke-interface {v1, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "channel_infoname"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v28

    const-string v14, "channel_infoname"

    invoke-static {v1, v14, v6}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v6

    new-instance v14, Ljava/util/LinkedHashSet;

    invoke-direct {v14}, Ljava/util/LinkedHashSet;-><init>()V

    move-object/from16 v46, v8

    new-instance v8, Lob/j;

    filled-new-array {v2, v10}, [Ljava/lang/String;

    move-result-object v17

    move-object/from16 v18, v2

    invoke-static/range {v17 .. v17}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    move-object/from16 v19, v13

    move-object/from16 v13, v45

    filled-new-array {v13, v13}, [Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const-string v11, "index_stream_chat_reply_message_cid_createdAt"

    move-object/from16 v17, v5

    const/4 v5, 0x0

    invoke-direct {v8, v11, v2, v13, v5}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v14, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v2, Lob/j;

    invoke-static/range {v46 .. v46}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-static/range {v45 .. v45}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    const-string v13, "index_stream_chat_reply_message_syncStatus"

    invoke-direct {v2, v13, v8, v11, v5}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v14, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v2, Lob/k;

    const-string v5, "stream_chat_reply_message"

    invoke-direct {v2, v5, v1, v6, v14}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "stream_chat_reply_message"

    invoke-static {v1, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v2, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    new-instance v0, Landroidx/room/f1;

    const-string v3, "stream_chat_reply_message(io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageInnerEntity).\n Expected:\n"

    invoke-static {v3, v2, v4, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x0

    invoke-direct {v0, v10, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_2
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v28, Lob/h;

    const/16 v33, 0x0

    const/16 v30, 0x1

    const/16 v34, 0x1

    const/16 v29, 0x1

    const-string v31, "id"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v29, 0x0

    const-string v31, "messageId"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "messageId"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x0

    const-string v31, "authorName"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v6, "authorName"

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "titleLink"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v6, "titleLink"

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "authorLink"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v6, "authorLink"

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "thumbUrl"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v6, "thumbUrl"

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "imageUrl"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v6, "imageUrl"

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "assetUrl"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v6, "assetUrl"

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "ogUrl"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v6, "ogUrl"

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "mimeType"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v6, "mimeType"

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x1

    const-string v31, "fileSize"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v6, "fileSize"

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x0

    const-string v31, "title"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v6, "title"

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "text"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "type"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "image"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v8, "image"

    invoke-interface {v1, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "name"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v11, "name"

    invoke-interface {v1, v11, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "fallback"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v13, "fallback"

    invoke-interface {v1, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "uploadFilePath"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v13, "uploadFilePath"

    invoke-interface {v1, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "originalHeight"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v13, "originalHeight"

    invoke-interface {v1, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "originalWidth"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v13, "originalWidth"

    invoke-interface {v1, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x1

    const-string v31, "extraData"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v15, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x0

    const-string v31, "statusCode"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v13, "statusCode"

    invoke-interface {v1, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "errorMessage"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v13, "errorMessage"

    invoke-static {v1, v13, v2}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v28, Lob/i;

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v31

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v33

    const-string v29, "stream_chat_message"

    const-string v30, "CASCADE"

    const-string v32, "NO ACTION"

    invoke-direct/range {v28 .. v33}, Lob/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    move-object/from16 v13, v28

    invoke-interface {v2, v13}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v13, Ljava/util/LinkedHashSet;

    invoke-direct {v13}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v14, Lob/j;

    move-object/from16 v20, v12

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    move-object/from16 v43, v10

    invoke-static/range {v45 .. v45}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    move-object/from16 v28, v15

    const-string v15, "index_attachment_inner_entity_messageId"

    move-object/from16 v21, v11

    const/4 v11, 0x0

    invoke-direct {v14, v15, v12, v10, v11}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v13, v14}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v10, Lob/j;

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    invoke-static/range {v45 .. v45}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const-string v15, "index_attachment_inner_entity_id"

    invoke-direct {v10, v15, v12, v14, v11}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v13, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v10, Lob/k;

    const-string v11, "attachment_inner_entity"

    invoke-direct {v10, v11, v1, v2, v13}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "attachment_inner_entity"

    invoke-static {v1, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v10, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    new-instance v0, Landroidx/room/f1;

    const-string v2, "attachment_inner_entity(io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.AttachmentEntity).\n Expected:\n"

    invoke-static {v2, v10, v4, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x0

    invoke-direct {v0, v10, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_3
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v29, Lob/h;

    const/16 v34, 0x0

    const/16 v31, 0x1

    const/16 v35, 0x1

    const/16 v30, 0x1

    const-string v32, "id"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const/16 v30, 0x0

    const-string v32, "messageId"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const/16 v35, 0x0

    const-string v32, "authorName"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v10, "authorName"

    invoke-interface {v1, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "titleLink"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v10, "titleLink"

    invoke-interface {v1, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "authorLink"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v10, "authorLink"

    invoke-interface {v1, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "thumbUrl"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v10, "thumbUrl"

    invoke-interface {v1, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "imageUrl"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v10, "imageUrl"

    invoke-interface {v1, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "assetUrl"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v10, "assetUrl"

    invoke-interface {v1, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "ogUrl"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v10, "ogUrl"

    invoke-interface {v1, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "mimeType"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v10, "mimeType"

    invoke-interface {v1, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const/16 v35, 0x1

    const-string v32, "fileSize"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v10, "fileSize"

    invoke-interface {v1, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const/16 v35, 0x0

    const-string v32, "title"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "text"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "type"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    invoke-interface {v1, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "image"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    invoke-interface {v1, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "name"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v10, v21

    move-object/from16 v2, v29

    invoke-interface {v1, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "fallback"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v11, "fallback"

    invoke-interface {v1, v11, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "uploadFilePath"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v11, "uploadFilePath"

    invoke-interface {v1, v11, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "originalHeight"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v11, "originalHeight"

    invoke-interface {v1, v11, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "originalWidth"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v11, "originalWidth"

    invoke-interface {v1, v11, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const/16 v35, 0x1

    const-string v32, "extraData"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v15, v28

    move-object/from16 v2, v29

    invoke-interface {v1, v15, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v33, 0x0

    const/16 v30, 0x1

    const/16 v34, 0x0

    const/16 v29, 0x0

    const-string v31, "statusCode"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v11, "statusCode"

    invoke-interface {v1, v11, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "errorMessage"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v11, "errorMessage"

    invoke-static {v1, v11, v2}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v28, Lob/i;

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v31

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v33

    const-string v29, "stream_chat_reply_message"

    const-string v30, "CASCADE"

    const-string v32, "NO ACTION"

    invoke-direct/range {v28 .. v33}, Lob/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    move-object/from16 v11, v28

    invoke-interface {v2, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v11, Ljava/util/LinkedHashSet;

    invoke-direct {v11}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v12, Lob/j;

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    invoke-static/range {v45 .. v45}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    move-object/from16 v21, v7

    const-string v7, "index_reply_attachment_inner_entity_messageId"

    move-object/from16 v24, v6

    const/4 v6, 0x0

    invoke-direct {v12, v7, v13, v14, v6}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v11, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v7, Lob/j;

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    invoke-static/range {v45 .. v45}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const-string v14, "index_reply_attachment_inner_entity_id"

    invoke-direct {v7, v14, v12, v13, v6}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v11, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v6, Lob/k;

    const-string v7, "reply_attachment_inner_entity"

    invoke-direct {v6, v7, v1, v2, v11}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "reply_attachment_inner_entity"

    invoke-static {v1, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v6, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    new-instance v0, Landroidx/room/f1;

    const-string v2, "reply_attachment_inner_entity(io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.ReplyAttachmentEntity).\n Expected:\n"

    invoke-static {v2, v6, v4, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x0

    invoke-direct {v0, v10, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_4
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v28, Lob/h;

    const/16 v33, 0x0

    const/16 v30, 0x1

    const/16 v34, 0x1

    const/16 v29, 0x1

    const-string v31, "id"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v29, 0x0

    const-string v31, "originalId"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v6, "originalId"

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "name"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "image"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "role"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v6, "role"

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x0

    const-string v31, "createdAt"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    move-object/from16 v6, v43

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "updatedAt"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v12, v20

    move-object/from16 v2, v28

    invoke-interface {v1, v12, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "lastActive"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v7, "lastActive"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x1

    const-string v31, "invisible"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v7, "invisible"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x0

    const-string v31, "privacySettings"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v7, "privacySettings"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x1

    const-string v31, "banned"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v7, "banned"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "mutes"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v7, "mutes"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "teams"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v7, "teams"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "teamsRole"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v7, "teamsRole"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "extraData"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v15, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x0

    const-string v31, "avgResponseTime"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v7, "avgResponseTime"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "pushPreference"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v7, "pushPreference"

    invoke-static {v1, v7, v2}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v7, Ljava/util/LinkedHashSet;

    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v11, Lob/j;

    invoke-static {v10}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    invoke-static/range {v45 .. v45}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    move-object/from16 v20, v8

    const-string v8, "index_stream_chat_user_name"

    move-object/from16 v25, v10

    const/4 v10, 0x0

    invoke-direct {v11, v8, v13, v14, v10}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v7, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v8, Lob/k;

    const-string v10, "stream_chat_user"

    invoke-direct {v8, v10, v1, v2, v7}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "stream_chat_user"

    invoke-static {v1, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v8, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    new-instance v0, Landroidx/room/f1;

    const-string v2, "stream_chat_user(io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserEntity).\n Expected:\n"

    invoke-static {v2, v8, v4, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x0

    invoke-direct {v0, v10, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_5
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v28, Lob/h;

    const/16 v33, 0x0

    const/16 v30, 0x1

    const/16 v34, 0x1

    const/16 v29, 0x0

    const-string v31, "messageId"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "userId"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v7, v17

    move-object/from16 v2, v28

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "type"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "score"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v8, "score"

    invoke-interface {v1, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x0

    const-string v31, "createdAt"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "createdLocallyAt"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    move-object/from16 v11, v41

    invoke-interface {v1, v11, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "updatedAt"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v12, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "deletedAt"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v13, v19

    move-object/from16 v2, v28

    invoke-interface {v1, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x1

    const-string v31, "enforceUnique"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v8, "enforceUnique"

    invoke-interface {v1, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "skipPush"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v8, "skipPush"

    invoke-interface {v1, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x0

    const-string v31, "emojiCode"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v8, "emojiCode"

    invoke-interface {v1, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x1

    const-string v31, "extraData"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v15, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "syncStatus"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    move-object/from16 v8, v46

    invoke-interface {v1, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v29, 0x1

    const-string v31, "id"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-static {v1, v3, v2}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v28, Lob/i;

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v31

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v33

    const-string v29, "stream_chat_message"

    const-string v30, "CASCADE"

    const-string v32, "NO ACTION"

    invoke-direct/range {v28 .. v33}, Lob/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    move-object/from16 v10, v28

    invoke-interface {v2, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v10, Ljava/util/LinkedHashSet;

    invoke-direct {v10}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v11, Lob/j;

    filled-new-array {v5, v7, v9}, [Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    move-object/from16 v17, v5

    move-object/from16 v5, v45

    filled-new-array {v5, v5, v5}, [Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    move-object/from16 v19, v7

    const/4 v7, 0x1

    move-object/from16 v28, v3

    const-string v3, "index_stream_chat_reaction_messageId_userId_type"

    invoke-direct {v11, v3, v14, v5, v7}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v10, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v3, Lob/j;

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static/range {v45 .. v45}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const-string v11, "index_stream_chat_reaction_syncStatus"

    const/4 v14, 0x0

    invoke-direct {v3, v11, v5, v7, v14}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v10, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v3, Lob/j;

    invoke-static/range {v17 .. v17}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static/range {v45 .. v45}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const-string v11, "index_stream_chat_reaction_messageId"

    invoke-direct {v3, v11, v5, v7, v14}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v10, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v3, Lob/k;

    const-string v5, "stream_chat_reaction"

    invoke-direct {v3, v5, v1, v2, v10}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "stream_chat_reaction"

    invoke-static {v1, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v3, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    new-instance v0, Landroidx/room/f1;

    const-string v2, "stream_chat_reaction(io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity).\n Expected:\n"

    invoke-static {v2, v3, v4, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x0

    invoke-direct {v0, v10, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_6
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v29, Lob/h;

    const/16 v34, 0x0

    const/16 v31, 0x1

    const/16 v35, 0x1

    const/16 v30, 0x0

    const-string v32, "type"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    invoke-interface {v1, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "channelId"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v3, "channelId"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "name"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v10, v25

    move-object/from16 v2, v29

    invoke-interface {v1, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "image"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v3, v20

    move-object/from16 v2, v29

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "cooldown"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v3, "cooldown"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "createdByUserId"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v3, "createdByUserId"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "filterTags"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v3, "filterTags"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "frozen"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v3, "frozen"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const/16 v35, 0x0

    const-string v32, "hidden"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v3, "hidden"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "hideMessagesBefore"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v3, "hideMessagesBefore"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const/16 v35, 0x1

    const-string v32, "members"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v3, "members"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "memberCount"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v3, "memberCount"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "watcherIds"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v3, "watcherIds"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "watcherCount"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v3, "watcherCount"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "reads"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v3, "reads"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const/16 v35, 0x0

    const-string v32, "lastMessageAt"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v3, "lastMessageAt"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "lastMessageId"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v3, "lastMessageId"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "createdAt"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "updatedAt"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    invoke-interface {v1, v12, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "deletedAt"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    invoke-interface {v1, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const/16 v35, 0x1

    const-string v32, "extraData"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    invoke-interface {v1, v15, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "syncStatus"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    invoke-interface {v1, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "team"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v3, "team"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "ownCapabilities"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v3, "ownCapabilities"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const/16 v35, 0x0

    const-string v32, "membership"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v3, "membership"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const/16 v35, 0x1

    const-string v32, "activeLiveLocations"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v3, "activeLiveLocations"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const/16 v35, 0x0

    const-string v32, "messageCount"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v3, "messageCount"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const/16 v35, 0x1

    const/16 v30, 0x1

    const-string v32, "cid"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v3, v18

    move-object/from16 v2, v29

    invoke-static {v1, v3, v2}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v7, Lob/j;

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-static/range {v45 .. v45}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const-string v11, "index_stream_chat_channel_state_syncStatus"

    const/4 v14, 0x0

    invoke-direct {v7, v11, v8, v9, v14}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v5, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v7, Lob/k;

    const-string v8, "stream_chat_channel_state"

    invoke-direct {v7, v8, v1, v2, v5}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "stream_chat_channel_state"

    invoke-static {v1, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v7, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    new-instance v0, Landroidx/room/f1;

    const-string v2, "stream_chat_channel_state(io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelEntity).\n Expected:\n"

    invoke-static {v2, v7, v4, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x0

    invoke-direct {v0, v10, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_7
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v29, Lob/h;

    const/16 v34, 0x0

    const/16 v31, 0x1

    const/16 v35, 0x1

    const/16 v30, 0x1

    const-string v32, "channelType"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v5, "channelType"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const/16 v35, 0x0

    const/16 v30, 0x0

    const-string v32, "createdAt"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "updatedAt"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    invoke-interface {v1, v12, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const/16 v35, 0x1

    const-string v32, "name"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    invoke-interface {v1, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "isTypingEvents"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "isTypingEvents"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "isReadEvents"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "isReadEvents"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "deliveryEventsEnabled"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "deliveryEventsEnabled"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "isConnectEvents"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "isConnectEvents"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "isSearch"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "isSearch"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "isReactionsEnabled"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "isReactionsEnabled"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "isThreadEnabled"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "isThreadEnabled"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "isMutes"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "isMutes"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "uploadsEnabled"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "uploadsEnabled"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "urlEnrichmentEnabled"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "urlEnrichmentEnabled"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "customEventsEnabled"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "customEventsEnabled"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "pushNotificationsEnabled"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "pushNotificationsEnabled"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "messageRetention"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "messageRetention"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "maxMessageLength"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "maxMessageLength"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "automod"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "automod"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "automodBehavior"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "automodBehavior"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "blocklistBehavior"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "blocklistBehavior"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "messageRemindersEnabled"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "messageRemindersEnabled"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "markMessagesPending"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "markMessagesPending"

    invoke-static {v1, v7, v2}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v7, Ljava/util/LinkedHashSet;

    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v8, Lob/k;

    const-string v9, "stream_chat_channel_config"

    invoke-direct {v8, v9, v1, v2, v7}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "stream_chat_channel_config"

    invoke-static {v1, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v8, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    new-instance v0, Landroidx/room/f1;

    const-string v2, "stream_chat_channel_config(io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigInnerEntity).\n Expected:\n"

    invoke-static {v2, v8, v4, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x0

    invoke-direct {v0, v10, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_8
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v29, Lob/h;

    const/16 v34, 0x0

    const/16 v31, 0x1

    const/16 v30, 0x0

    const-string v32, "name"

    const-string v33, "TEXT"

    const/16 v35, 0x1

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    invoke-interface {v1, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "description"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "description"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "args"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "args"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "set"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    const-string v7, "set"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const-string v32, "channelType"

    const-string v33, "TEXT"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v29

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v29, Lob/h;

    const/16 v30, 0x1

    const-string v32, "id"

    const-string v33, "INTEGER"

    invoke-direct/range {v29 .. v35}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v7, v28

    move-object/from16 v2, v29

    invoke-static {v1, v7, v2}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v28, Lob/i;

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v31

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v33

    const-string v29, "stream_chat_channel_config"

    const-string v30, "CASCADE"

    const-string v32, "CASCADE"

    invoke-direct/range {v28 .. v33}, Lob/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    move-object/from16 v8, v28

    invoke-interface {v2, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v8, Ljava/util/LinkedHashSet;

    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v9, Lob/j;

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static/range {v45 .. v45}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    const-string v14, "index_command_inner_entity_channelType"

    move-object/from16 v17, v13

    const/4 v13, 0x0

    invoke-direct {v9, v14, v5, v11, v13}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v8, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v5, Lob/k;

    const-string v9, "command_inner_entity"

    invoke-direct {v5, v9, v1, v2, v8}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "command_inner_entity"

    invoke-static {v1, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v5, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    new-instance v0, Landroidx/room/f1;

    const-string v2, "command_inner_entity(io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.CommandInnerEntity).\n Expected:\n"

    invoke-static {v2, v5, v4, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x0

    invoke-direct {v0, v10, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_9
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v28, Lob/h;

    const/16 v33, 0x0

    const/16 v30, 0x1

    const/16 v29, 0x1

    const-string v31, "userId"

    const-string v32, "TEXT"

    const/16 v34, 0x1

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v5, v19

    move-object/from16 v2, v28

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v29, 0x0

    const-string v31, "activeChannelIds"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "activeChannelIds"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "lastSyncedAt"

    const-string v32, "INTEGER"

    const/16 v34, 0x0

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "lastSyncedAt"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "rawLastSyncedAt"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "rawLastSyncedAt"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "markedAllReadAt"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "markedAllReadAt"

    invoke-static {v1, v5, v2}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v8, Lob/k;

    const-string v9, "stream_sync_state"

    invoke-direct {v8, v9, v1, v2, v5}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "stream_sync_state"

    invoke-static {v1, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v8, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    new-instance v0, Landroidx/room/f1;

    const-string v2, "stream_sync_state(io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal.SyncStateEntity).\n Expected:\n"

    invoke-static {v2, v8, v4, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x0

    invoke-direct {v0, v10, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_a
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v28, Lob/h;

    const/16 v33, 0x0

    const/16 v30, 0x1

    const/16 v34, 0x1

    const/16 v29, 0x1

    const-string v31, "id"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v29, 0x0

    const-string v31, "name"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "description"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "description"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "options"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "options"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "votingVisibility"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "votingVisibility"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "enforceUniqueVote"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "enforceUniqueVote"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x0

    const-string v31, "maxVotesAllowed"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "maxVotesAllowed"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x1

    const-string v31, "allowUserSuggestedOptions"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "allowUserSuggestedOptions"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "allowAnswers"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "allowAnswers"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "voteCount"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "voteCount"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "voteCountsByOption"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "voteCountsByOption"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "votes"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "votes"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "ownVotes"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "ownVotes"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "createdAt"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "updatedAt"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v12, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "closed"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "closed"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "answersCount"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "answersCount"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "answers"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "answers"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x0

    const-string v31, "createdById"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "createdById"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x1

    const-string v31, "extraData"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-static {v1, v15, v2}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v8, Lob/k;

    const-string v9, "stream_chat_poll"

    invoke-direct {v8, v9, v1, v2, v5}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "stream_chat_poll"

    invoke-static {v1, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v8, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    new-instance v0, Landroidx/room/f1;

    const-string v2, "stream_chat_poll(io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollEntity).\n Expected:\n"

    invoke-static {v2, v8, v4, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x0

    invoke-direct {v0, v10, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_b
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v28, Lob/h;

    const/16 v33, 0x0

    const/16 v30, 0x1

    const/16 v34, 0x1

    const/16 v29, 0x1

    const-string v31, "parentMessageId"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "parentMessageId"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v29, 0x0

    const-string v31, "cid"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "createdByUserId"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "createdByUserId"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "activeParticipantCount"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "activeParticipantCount"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "participantCount"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "participantCount"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "threadParticipants"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "threadParticipants"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "lastMessageAt"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "lastMessageAt"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "createdAt"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "updatedAt"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v12, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x0

    const-string v31, "deletedAt"

    const-string v32, "INTEGER"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v13, v17

    move-object/from16 v2, v28

    invoke-interface {v1, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v34, 0x1

    const-string v31, "title"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v5, v24

    move-object/from16 v2, v28

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lob/h;

    const/4 v13, 0x0

    const/4 v10, 0x1

    const/4 v14, 0x1

    const/4 v9, 0x0

    const-string v11, "read"

    const-string v12, "TEXT"

    invoke-direct/range {v8 .. v14}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "read"

    invoke-interface {v1, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const-string v31, "latestReplyIds"

    const-string v32, "TEXT"

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "latestReplyIds"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lob/h;

    const-string v11, "extraData"

    const-string v12, "TEXT"

    invoke-direct/range {v8 .. v14}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {v1, v15, v8}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v6, Lob/k;

    const-string v8, "stream_chat_thread"

    invoke-direct {v6, v8, v1, v2, v5}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "stream_chat_thread"

    invoke-static {v1, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v6, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    new-instance v0, Landroidx/room/f1;

    const-string v2, "stream_chat_thread(io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadEntity).\n Expected:\n"

    invoke-static {v2, v6, v4, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x0

    invoke-direct {v0, v10, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_c
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v8, Lob/h;

    const/4 v13, 0x0

    const/4 v10, 0x1

    const/4 v9, 0x1

    const-string v11, "id"

    const-string v12, "TEXT"

    const/4 v14, 0x1

    invoke-direct/range {v8 .. v14}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v1, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v33, 0x0

    const/16 v30, 0x1

    const/16 v29, 0x0

    const-string v31, "order"

    const-string v32, "TEXT"

    const/16 v34, 0x1

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    const-string v5, "order"

    invoke-static {v1, v5, v2}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v6, Lob/k;

    const-string v8, "stream_chat_thread_order"

    invoke-direct {v6, v8, v1, v2, v5}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "stream_chat_thread_order"

    invoke-static {v1, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v6, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    new-instance v0, Landroidx/room/f1;

    const-string v2, "stream_chat_thread_order(io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadOrderEntity).\n Expected:\n"

    invoke-static {v2, v6, v4, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x0

    invoke-direct {v0, v10, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_d
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v8, Lob/h;

    const/4 v13, 0x0

    const/4 v10, 0x1

    const/4 v9, 0x1

    const-string v11, "id"

    const-string v12, "TEXT"

    const/4 v14, 0x1

    invoke-direct/range {v8 .. v14}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v1, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v28, Lob/h;

    const/16 v33, 0x0

    const/16 v30, 0x1

    const/16 v29, 0x0

    const-string v31, "cid"

    const-string v32, "TEXT"

    const/16 v34, 0x1

    invoke-direct/range {v28 .. v34}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v28

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lob/h;

    const/4 v10, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    const-string v8, "text"

    const-string v9, "TEXT"

    const/4 v11, 0x1

    invoke-direct/range {v5 .. v11}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v21

    invoke-interface {v1, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lob/h;

    const/4 v11, 0x0

    const/4 v8, 0x1

    const/4 v7, 0x0

    const-string v9, "parentId"

    const-string v10, "TEXT"

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v12}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v14, v22

    invoke-interface {v1, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lob/h;

    const/4 v12, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x0

    const-string v10, "mentionedUsersIds"

    const-string v11, "TEXT"

    const/4 v13, 0x1

    invoke-direct/range {v7 .. v13}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "mentionedUsersIds"

    invoke-interface {v1, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lob/h;

    const/4 v13, 0x0

    const/4 v10, 0x1

    const/4 v9, 0x0

    const-string v11, "silent"

    const-string v12, "INTEGER"

    const/4 v14, 0x1

    invoke-direct/range {v8 .. v14}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v27

    invoke-interface {v1, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v27, Lob/h;

    const/16 v32, 0x0

    const/16 v29, 0x1

    const/16 v28, 0x0

    const-string v30, "showInChannel"

    const-string v31, "INTEGER"

    const/16 v33, 0x1

    invoke-direct/range {v27 .. v33}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v3, v26

    move-object/from16 v2, v27

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lob/h;

    const/4 v10, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    const-string v8, "replyMessageId"

    const-string v9, "TEXT"

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v11}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "replyMessageId"

    invoke-interface {v1, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lob/h;

    const/4 v11, 0x0

    const/4 v8, 0x1

    const/4 v7, 0x0

    const-string v9, "command"

    const-string v10, "TEXT"

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v12}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v23

    invoke-interface {v1, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lob/h;

    const/4 v12, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x0

    const-string v10, "args"

    const-string v11, "TEXT"

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v13}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "args"

    invoke-interface {v1, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lob/h;

    const/4 v13, 0x0

    const/4 v10, 0x1

    const/4 v9, 0x0

    const-string v11, "extraData"

    const-string v12, "TEXT"

    invoke-direct/range {v8 .. v14}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {v1, v15, v8}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v5, Lob/k;

    const-string v6, "stream_chat_draft_message_entity"

    invoke-direct {v5, v6, v1, v2, v3}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "stream_chat_draft_message_entity"

    invoke-static {v1, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v0

    invoke-virtual {v5, v0}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    new-instance v1, Landroidx/room/f1;

    const-string v2, "stream_chat_draft_message_entity(io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DraftMessageEntity).\n Expected:\n"

    invoke-static {v2, v5, v4, v0}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x0

    invoke-direct {v1, v10, v0}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v1

    :cond_e
    new-instance v0, Landroidx/room/f1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method
