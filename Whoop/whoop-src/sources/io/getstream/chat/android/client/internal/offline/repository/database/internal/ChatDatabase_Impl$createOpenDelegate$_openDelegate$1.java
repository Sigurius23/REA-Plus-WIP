package io.getstream.chat.android.client.internal.offline.repository.database.internal;

import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1788g1;
import androidx.room.C1784f1;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressField;
import hc3.AbstractC17176i;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelEntityKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigEntityKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.AttachmentEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.ReplyAttachmentEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DraftMessageEntityKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntityKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageEntityKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.QueryChannelsEntityKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntityKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal.SyncStateEntityKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadEntityKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadOrderEntityKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserEntityKt;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p363ob.C27785h;
import p363ob.C27786i;
import p363ob.C27787j;
import p363ob.C27788k;
import p500tb.InterfaceC33687a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32410a;
import se.AbstractC32417h;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"io/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl$createOpenDelegate$_openDelegate$1", "Landroidx/room/g1;", "Ltb/a;", "connection", "Ll83/a0;", "createAllTables", "(Ltb/a;)V", "dropAllTables", "onCreate", "onOpen", "onPreMigrate", "onPostMigrate", "Landroidx/room/f1;", "onValidateSchema", "(Ltb/a;)Landroidx/room/f1;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatDatabase_Impl$createOpenDelegate$_openDelegate$1 extends AbstractC1788g1 {
    final /* synthetic */ ChatDatabase_Impl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatDatabase_Impl$createOpenDelegate$_openDelegate$1(ChatDatabase_Impl chatDatabase_Impl) {
        super(200, "38d0772e5357ecc647da230de280d8d2", "07113e8f228ba656b99be06a80b5ac50");
        this.this$0 = chatDatabase_Impl;
    }

    @Override // androidx.room.AbstractC1788g1
    public final void createAllTables(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `stream_channel_query` (`id` TEXT NOT NULL, `filter` TEXT NOT NULL, `querySort` TEXT NOT NULL, `cids` TEXT NOT NULL, `predefinedFilterName` TEXT, `predefinedFilterValues` TEXT, `predefinedSortValues` TEXT, PRIMARY KEY(`id`))", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `stream_chat_message` (`id` TEXT NOT NULL, `cid` TEXT NOT NULL, `userId` TEXT NOT NULL, `text` TEXT NOT NULL, `html` TEXT NOT NULL, `type` TEXT NOT NULL, `syncStatus` INTEGER NOT NULL, `replyCount` INTEGER NOT NULL, `deletedReplyCount` INTEGER NOT NULL, `createdAt` INTEGER, `createdLocallyAt` INTEGER, `updatedAt` INTEGER, `updatedLocallyAt` INTEGER, `deletedAt` INTEGER, `remoteMentionedUserIds` TEXT NOT NULL, `mentionedUsersId` TEXT NOT NULL, `reactionCounts` TEXT NOT NULL, `reactionScores` TEXT NOT NULL, `reactionGroups` TEXT NOT NULL, `parentId` TEXT, `command` TEXT, `shadowed` INTEGER NOT NULL, `i18n` TEXT NOT NULL, `showInChannel` INTEGER NOT NULL, `silent` INTEGER NOT NULL, `extraData` TEXT NOT NULL, `replyToId` TEXT, `pinned` INTEGER NOT NULL, `pinnedAt` INTEGER, `pinExpires` INTEGER, `pinnedByUserId` TEXT, `threadParticipantsIds` TEXT NOT NULL, `skipPushNotification` INTEGER NOT NULL, `skipEnrichUrl` INTEGER NOT NULL, `moderationDetails` TEXT, `moderation` TEXT, `messageTextUpdatedAt` INTEGER, `pollId` TEXT, `restrictedVisibility` TEXT NOT NULL, `reminder` TEXT, `sharedLocation` TEXT, `channelRole` TEXT, `deletedForMe` INTEGER NOT NULL, `channel_infocid` TEXT, `channel_infoid` TEXT, `channel_infotype` TEXT, `channel_infomemberCount` INTEGER, `channel_infoname` TEXT, PRIMARY KEY(`id`))", connection);
        AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_stream_chat_message_cid_createdAt` ON `stream_chat_message` (`cid`, `createdAt`)", connection);
        AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_stream_chat_message_syncStatus` ON `stream_chat_message` (`syncStatus`)", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `stream_chat_reply_message` (`id` TEXT NOT NULL, `cid` TEXT NOT NULL, `userId` TEXT NOT NULL, `text` TEXT NOT NULL, `html` TEXT NOT NULL, `type` TEXT NOT NULL, `syncStatus` INTEGER NOT NULL, `replyCount` INTEGER NOT NULL, `deletedReplyCount` INTEGER NOT NULL, `createdAt` INTEGER, `createdLocallyAt` INTEGER, `updatedAt` INTEGER, `updatedLocallyAt` INTEGER, `deletedAt` INTEGER, `remoteMentionedUserIds` TEXT NOT NULL, `mentionedUsersId` TEXT NOT NULL, `parentId` TEXT, `command` TEXT, `shadowed` INTEGER NOT NULL, `i18n` TEXT NOT NULL, `showInChannel` INTEGER NOT NULL, `silent` INTEGER NOT NULL, `extraData` TEXT NOT NULL, `pinned` INTEGER NOT NULL, `pinnedAt` INTEGER, `pinExpires` INTEGER, `pinnedByUserId` TEXT, `threadParticipantsIds` TEXT NOT NULL, `moderationDetails` TEXT, `messageTextUpdatedAt` INTEGER, `pollId` TEXT, `restrictedVisibility` TEXT NOT NULL, `reminder` TEXT, `channelRole` TEXT, `channel_infocid` TEXT, `channel_infoid` TEXT, `channel_infotype` TEXT, `channel_infomemberCount` INTEGER, `channel_infoname` TEXT, PRIMARY KEY(`id`))", connection);
        AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_stream_chat_reply_message_cid_createdAt` ON `stream_chat_reply_message` (`cid`, `createdAt`)", connection);
        AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_stream_chat_reply_message_syncStatus` ON `stream_chat_reply_message` (`syncStatus`)", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `attachment_inner_entity` (`id` TEXT NOT NULL, `messageId` TEXT NOT NULL, `authorName` TEXT, `titleLink` TEXT, `authorLink` TEXT, `thumbUrl` TEXT, `imageUrl` TEXT, `assetUrl` TEXT, `ogUrl` TEXT, `mimeType` TEXT, `fileSize` INTEGER NOT NULL, `title` TEXT, `text` TEXT, `type` TEXT, `image` TEXT, `name` TEXT, `fallback` TEXT, `uploadFilePath` TEXT, `originalHeight` INTEGER, `originalWidth` INTEGER, `extraData` TEXT NOT NULL, `statusCode` INTEGER, `errorMessage` TEXT, PRIMARY KEY(`id`), FOREIGN KEY(`messageId`) REFERENCES `stream_chat_message`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)", connection);
        AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_attachment_inner_entity_messageId` ON `attachment_inner_entity` (`messageId`)", connection);
        AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_attachment_inner_entity_id` ON `attachment_inner_entity` (`id`)", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `reply_attachment_inner_entity` (`id` TEXT NOT NULL, `messageId` TEXT NOT NULL, `authorName` TEXT, `titleLink` TEXT, `authorLink` TEXT, `thumbUrl` TEXT, `imageUrl` TEXT, `assetUrl` TEXT, `ogUrl` TEXT, `mimeType` TEXT, `fileSize` INTEGER NOT NULL, `title` TEXT, `text` TEXT, `type` TEXT, `image` TEXT, `name` TEXT, `fallback` TEXT, `uploadFilePath` TEXT, `originalHeight` INTEGER, `originalWidth` INTEGER, `extraData` TEXT NOT NULL, `statusCode` INTEGER, `errorMessage` TEXT, PRIMARY KEY(`id`), FOREIGN KEY(`messageId`) REFERENCES `stream_chat_reply_message`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)", connection);
        AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_reply_attachment_inner_entity_messageId` ON `reply_attachment_inner_entity` (`messageId`)", connection);
        AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_reply_attachment_inner_entity_id` ON `reply_attachment_inner_entity` (`id`)", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `stream_chat_user` (`id` TEXT NOT NULL, `originalId` TEXT NOT NULL, `name` TEXT NOT NULL, `image` TEXT NOT NULL, `role` TEXT NOT NULL, `createdAt` INTEGER, `updatedAt` INTEGER, `lastActive` INTEGER, `invisible` INTEGER NOT NULL, `privacySettings` TEXT, `banned` INTEGER NOT NULL, `mutes` TEXT NOT NULL, `teams` TEXT NOT NULL, `teamsRole` TEXT NOT NULL, `extraData` TEXT NOT NULL, `avgResponseTime` INTEGER, `pushPreference` TEXT, PRIMARY KEY(`id`))", connection);
        AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_stream_chat_user_name` ON `stream_chat_user` (`name`)", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `stream_chat_reaction` (`messageId` TEXT NOT NULL, `userId` TEXT NOT NULL, `type` TEXT NOT NULL, `score` INTEGER NOT NULL, `createdAt` INTEGER, `createdLocallyAt` INTEGER, `updatedAt` INTEGER, `deletedAt` INTEGER, `enforceUnique` INTEGER NOT NULL, `skipPush` INTEGER NOT NULL, `emojiCode` TEXT, `extraData` TEXT NOT NULL, `syncStatus` INTEGER NOT NULL, `id` INTEGER NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`messageId`) REFERENCES `stream_chat_message`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)", connection);
        AbstractC17269i.m48864K("CREATE UNIQUE INDEX IF NOT EXISTS `index_stream_chat_reaction_messageId_userId_type` ON `stream_chat_reaction` (`messageId`, `userId`, `type`)", connection);
        AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_stream_chat_reaction_syncStatus` ON `stream_chat_reaction` (`syncStatus`)", connection);
        AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_stream_chat_reaction_messageId` ON `stream_chat_reaction` (`messageId`)", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `stream_chat_channel_state` (`type` TEXT NOT NULL, `channelId` TEXT NOT NULL, `name` TEXT NOT NULL, `image` TEXT NOT NULL, `cooldown` INTEGER NOT NULL, `createdByUserId` TEXT NOT NULL, `filterTags` TEXT NOT NULL, `frozen` INTEGER NOT NULL, `hidden` INTEGER, `hideMessagesBefore` INTEGER, `members` TEXT NOT NULL, `memberCount` INTEGER NOT NULL, `watcherIds` TEXT NOT NULL, `watcherCount` INTEGER NOT NULL, `reads` TEXT NOT NULL, `lastMessageAt` INTEGER, `lastMessageId` TEXT, `createdAt` INTEGER, `updatedAt` INTEGER, `deletedAt` INTEGER, `extraData` TEXT NOT NULL, `syncStatus` INTEGER NOT NULL, `team` TEXT NOT NULL, `ownCapabilities` TEXT NOT NULL, `membership` TEXT, `activeLiveLocations` TEXT NOT NULL, `messageCount` INTEGER, `cid` TEXT NOT NULL, PRIMARY KEY(`cid`))", connection);
        AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_stream_chat_channel_state_syncStatus` ON `stream_chat_channel_state` (`syncStatus`)", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `stream_chat_channel_config` (`channelType` TEXT NOT NULL, `createdAt` INTEGER, `updatedAt` INTEGER, `name` TEXT NOT NULL, `isTypingEvents` INTEGER NOT NULL, `isReadEvents` INTEGER NOT NULL, `deliveryEventsEnabled` INTEGER NOT NULL, `isConnectEvents` INTEGER NOT NULL, `isSearch` INTEGER NOT NULL, `isReactionsEnabled` INTEGER NOT NULL, `isThreadEnabled` INTEGER NOT NULL, `isMutes` INTEGER NOT NULL, `uploadsEnabled` INTEGER NOT NULL, `urlEnrichmentEnabled` INTEGER NOT NULL, `customEventsEnabled` INTEGER NOT NULL, `pushNotificationsEnabled` INTEGER NOT NULL, `messageRetention` TEXT NOT NULL, `maxMessageLength` INTEGER NOT NULL, `automod` TEXT NOT NULL, `automodBehavior` TEXT NOT NULL, `blocklistBehavior` TEXT NOT NULL, `messageRemindersEnabled` INTEGER NOT NULL, `markMessagesPending` INTEGER NOT NULL, PRIMARY KEY(`channelType`))", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `command_inner_entity` (`name` TEXT NOT NULL, `description` TEXT NOT NULL, `args` TEXT NOT NULL, `set` TEXT NOT NULL, `channelType` TEXT NOT NULL, `id` INTEGER NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`channelType`) REFERENCES `stream_chat_channel_config`(`channelType`) ON UPDATE CASCADE ON DELETE CASCADE )", connection);
        AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_command_inner_entity_channelType` ON `command_inner_entity` (`channelType`)", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `stream_sync_state` (`userId` TEXT NOT NULL, `activeChannelIds` TEXT NOT NULL, `lastSyncedAt` INTEGER, `rawLastSyncedAt` TEXT, `markedAllReadAt` INTEGER, PRIMARY KEY(`userId`))", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `stream_chat_poll` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `options` TEXT NOT NULL, `votingVisibility` TEXT NOT NULL, `enforceUniqueVote` INTEGER NOT NULL, `maxVotesAllowed` INTEGER, `allowUserSuggestedOptions` INTEGER NOT NULL, `allowAnswers` INTEGER NOT NULL, `voteCount` INTEGER NOT NULL, `voteCountsByOption` TEXT NOT NULL, `votes` TEXT NOT NULL, `ownVotes` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, `closed` INTEGER NOT NULL, `answersCount` INTEGER NOT NULL, `answers` TEXT NOT NULL, `createdById` TEXT, `extraData` TEXT NOT NULL, PRIMARY KEY(`id`))", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `stream_chat_thread` (`parentMessageId` TEXT NOT NULL, `cid` TEXT NOT NULL, `createdByUserId` TEXT NOT NULL, `activeParticipantCount` INTEGER NOT NULL, `participantCount` INTEGER NOT NULL, `threadParticipants` TEXT NOT NULL, `lastMessageAt` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, `deletedAt` INTEGER, `title` TEXT NOT NULL, `read` TEXT NOT NULL, `latestReplyIds` TEXT NOT NULL, `extraData` TEXT NOT NULL, PRIMARY KEY(`parentMessageId`))", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `stream_chat_thread_order` (`id` TEXT NOT NULL, `order` TEXT NOT NULL, PRIMARY KEY(`id`))", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `stream_chat_draft_message_entity` (`id` TEXT NOT NULL, `cid` TEXT NOT NULL, `text` TEXT NOT NULL, `parentId` TEXT, `mentionedUsersIds` TEXT NOT NULL, `silent` INTEGER NOT NULL, `showInChannel` INTEGER NOT NULL, `replyMessageId` TEXT, `command` TEXT, `args` TEXT, `extraData` TEXT NOT NULL, PRIMARY KEY(`id`))", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", connection);
        AbstractC17269i.m48864K("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '38d0772e5357ecc647da230de280d8d2')", connection);
    }

    @Override // androidx.room.AbstractC1788g1
    public final void dropAllTables(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `stream_channel_query`", connection);
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `stream_chat_message`", connection);
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `stream_chat_reply_message`", connection);
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `attachment_inner_entity`", connection);
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `reply_attachment_inner_entity`", connection);
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `stream_chat_user`", connection);
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `stream_chat_reaction`", connection);
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `stream_chat_channel_state`", connection);
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `stream_chat_channel_config`", connection);
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `command_inner_entity`", connection);
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `stream_sync_state`", connection);
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `stream_chat_poll`", connection);
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `stream_chat_thread`", connection);
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `stream_chat_thread_order`", connection);
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `stream_chat_draft_message_entity`", connection);
    }

    @Override // androidx.room.AbstractC1788g1
    public final void onCreate(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
    }

    @Override // androidx.room.AbstractC1788g1
    public final void onOpen(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        AbstractC17269i.m48864K("PRAGMA foreign_keys = ON", connection);
        ChatDatabase_Impl chatDatabase_Impl = this.this$0;
        int i13 = ChatDatabase_Impl.f73810a;
        chatDatabase_Impl.internalInitInvalidationTracker(connection);
    }

    @Override // androidx.room.AbstractC1788g1
    public final void onPostMigrate(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
    }

    @Override // androidx.room.AbstractC1788g1
    public final void onPreMigrate(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        AbstractC32410a.m101001I(connection);
    }

    @Override // androidx.room.AbstractC1788g1
    public final C1784f1 onValidateSchema(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new C27785h(1, 1, "id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap.put("filter", new C27785h(0, 1, "filter", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap.put("querySort", new C27785h(0, 1, "querySort", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap.put("cids", new C27785h(0, 1, "cids", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap.put("predefinedFilterName", new C27785h(0, 1, "predefinedFilterName", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap.put("predefinedFilterValues", new C27785h(0, 1, "predefinedFilterValues", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        C27788k c27788k = new C27788k(QueryChannelsEntityKt.QUERY_CHANNELS_ENTITY_TABLE_NAME, linkedHashMap, AbstractC17176i.m48507i(linkedHashMap, "predefinedSortValues", new C27785h(0, 1, "predefinedSortValues", ShippingAddressField.TEXT_FIELD_TYPE, null, false)), new LinkedHashSet());
        C27788k c27788kM101188S = AbstractC32417h.m101188S(QueryChannelsEntityKt.QUERY_CHANNELS_ENTITY_TABLE_NAME, connection);
        if (!c27788k.equals(c27788kM101188S)) {
            return new C1784f1(false, AbstractC17176i.m48505g("stream_channel_query(io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.QueryChannelsEntity).\n Expected:\n", c27788k, "\n Found:\n", c27788kM101188S));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new C27785h(1, 1, "id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap2.put("cid", new C27785h(0, 1, "cid", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap2.put("userId", new C27785h(0, 1, "userId", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap2.put("text", new C27785h(0, 1, "text", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap2.put("html", new C27785h(0, 1, "html", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap2.put("type", new C27785h(0, 1, "type", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap2.put("syncStatus", new C27785h(0, 1, "syncStatus", "INTEGER", null, true));
        linkedHashMap2.put("replyCount", new C27785h(0, 1, "replyCount", "INTEGER", null, true));
        linkedHashMap2.put("deletedReplyCount", new C27785h(0, 1, "deletedReplyCount", "INTEGER", null, true));
        linkedHashMap2.put("createdAt", new C27785h(0, 1, "createdAt", "INTEGER", null, false));
        linkedHashMap2.put("createdLocallyAt", new C27785h(0, 1, "createdLocallyAt", "INTEGER", null, false));
        linkedHashMap2.put("updatedAt", new C27785h(0, 1, "updatedAt", "INTEGER", null, false));
        linkedHashMap2.put("updatedLocallyAt", new C27785h(0, 1, "updatedLocallyAt", "INTEGER", null, false));
        linkedHashMap2.put("deletedAt", new C27785h(0, 1, "deletedAt", "INTEGER", null, false));
        linkedHashMap2.put("remoteMentionedUserIds", new C27785h(0, 1, "remoteMentionedUserIds", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap2.put("mentionedUsersId", new C27785h(0, 1, "mentionedUsersId", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap2.put("reactionCounts", new C27785h(0, 1, "reactionCounts", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap2.put("reactionScores", new C27785h(0, 1, "reactionScores", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap2.put("reactionGroups", new C27785h(0, 1, "reactionGroups", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap2.put("parentId", new C27785h(0, 1, "parentId", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap2.put("command", new C27785h(0, 1, "command", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap2.put("shadowed", new C27785h(0, 1, "shadowed", "INTEGER", null, true));
        linkedHashMap2.put("i18n", new C27785h(0, 1, "i18n", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap2.put("showInChannel", new C27785h(0, 1, "showInChannel", "INTEGER", null, true));
        linkedHashMap2.put(NotificationCompat.GROUP_KEY_SILENT, new C27785h(0, 1, NotificationCompat.GROUP_KEY_SILENT, "INTEGER", null, true));
        linkedHashMap2.put("extraData", new C27785h(0, 1, "extraData", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap2.put("replyToId", new C27785h(0, 1, "replyToId", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap2.put("pinned", new C27785h(0, 1, "pinned", "INTEGER", null, true));
        linkedHashMap2.put("pinnedAt", new C27785h(0, 1, "pinnedAt", "INTEGER", null, false));
        linkedHashMap2.put("pinExpires", new C27785h(0, 1, "pinExpires", "INTEGER", null, false));
        linkedHashMap2.put("pinnedByUserId", new C27785h(0, 1, "pinnedByUserId", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap2.put("threadParticipantsIds", new C27785h(0, 1, "threadParticipantsIds", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap2.put("skipPushNotification", new C27785h(0, 1, "skipPushNotification", "INTEGER", null, true));
        linkedHashMap2.put("skipEnrichUrl", new C27785h(0, 1, "skipEnrichUrl", "INTEGER", null, true));
        linkedHashMap2.put("moderationDetails", new C27785h(0, 1, "moderationDetails", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap2.put("moderation", new C27785h(0, 1, "moderation", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap2.put("messageTextUpdatedAt", new C27785h(0, 1, "messageTextUpdatedAt", "INTEGER", null, false));
        linkedHashMap2.put("pollId", new C27785h(0, 1, "pollId", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap2.put("restrictedVisibility", new C27785h(0, 1, "restrictedVisibility", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap2.put(NotificationCompat.CATEGORY_REMINDER, new C27785h(0, 1, NotificationCompat.CATEGORY_REMINDER, ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap2.put("sharedLocation", new C27785h(0, 1, "sharedLocation", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap2.put("channelRole", new C27785h(0, 1, "channelRole", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap2.put("deletedForMe", new C27785h(0, 1, "deletedForMe", "INTEGER", null, true));
        linkedHashMap2.put("channel_infocid", new C27785h(0, 1, "channel_infocid", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap2.put("channel_infoid", new C27785h(0, 1, "channel_infoid", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap2.put("channel_infotype", new C27785h(0, 1, "channel_infotype", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap2.put("channel_infomemberCount", new C27785h(0, 1, "channel_infomemberCount", "INTEGER", null, false));
        LinkedHashSet linkedHashSetM48507i = AbstractC17176i.m48507i(linkedHashMap2, "channel_infoname", new C27785h(0, 1, "channel_infoname", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C27787j("index_stream_chat_message_cid_createdAt", AbstractC37056f.m118959K("cid", "createdAt"), AbstractC37056f.m118959K("ASC", "ASC"), false));
        linkedHashSet.add(new C27787j("index_stream_chat_message_syncStatus", AbstractC37056f.m118958J("syncStatus"), AbstractC37056f.m118958J("ASC"), false));
        C27788k c27788k2 = new C27788k(MessageEntityKt.MESSAGE_ENTITY_TABLE_NAME, linkedHashMap2, linkedHashSetM48507i, linkedHashSet);
        C27788k c27788kM101188S2 = AbstractC32417h.m101188S(MessageEntityKt.MESSAGE_ENTITY_TABLE_NAME, connection);
        if (!c27788k2.equals(c27788kM101188S2)) {
            return new C1784f1(false, AbstractC17176i.m48505g("stream_chat_message(io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageInnerEntity).\n Expected:\n", c27788k2, "\n Found:\n", c27788kM101188S2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id", new C27785h(1, 1, "id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap3.put("cid", new C27785h(0, 1, "cid", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap3.put("userId", new C27785h(0, 1, "userId", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap3.put("text", new C27785h(0, 1, "text", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap3.put("html", new C27785h(0, 1, "html", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap3.put("type", new C27785h(0, 1, "type", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap3.put("syncStatus", new C27785h(0, 1, "syncStatus", "INTEGER", null, true));
        linkedHashMap3.put("replyCount", new C27785h(0, 1, "replyCount", "INTEGER", null, true));
        linkedHashMap3.put("deletedReplyCount", new C27785h(0, 1, "deletedReplyCount", "INTEGER", null, true));
        linkedHashMap3.put("createdAt", new C27785h(0, 1, "createdAt", "INTEGER", null, false));
        linkedHashMap3.put("createdLocallyAt", new C27785h(0, 1, "createdLocallyAt", "INTEGER", null, false));
        linkedHashMap3.put("updatedAt", new C27785h(0, 1, "updatedAt", "INTEGER", null, false));
        linkedHashMap3.put("updatedLocallyAt", new C27785h(0, 1, "updatedLocallyAt", "INTEGER", null, false));
        linkedHashMap3.put("deletedAt", new C27785h(0, 1, "deletedAt", "INTEGER", null, false));
        linkedHashMap3.put("remoteMentionedUserIds", new C27785h(0, 1, "remoteMentionedUserIds", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap3.put("mentionedUsersId", new C27785h(0, 1, "mentionedUsersId", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap3.put("parentId", new C27785h(0, 1, "parentId", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap3.put("command", new C27785h(0, 1, "command", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap3.put("shadowed", new C27785h(0, 1, "shadowed", "INTEGER", null, true));
        linkedHashMap3.put("i18n", new C27785h(0, 1, "i18n", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap3.put("showInChannel", new C27785h(0, 1, "showInChannel", "INTEGER", null, true));
        linkedHashMap3.put(NotificationCompat.GROUP_KEY_SILENT, new C27785h(0, 1, NotificationCompat.GROUP_KEY_SILENT, "INTEGER", null, true));
        linkedHashMap3.put("extraData", new C27785h(0, 1, "extraData", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap3.put("pinned", new C27785h(0, 1, "pinned", "INTEGER", null, true));
        linkedHashMap3.put("pinnedAt", new C27785h(0, 1, "pinnedAt", "INTEGER", null, false));
        linkedHashMap3.put("pinExpires", new C27785h(0, 1, "pinExpires", "INTEGER", null, false));
        linkedHashMap3.put("pinnedByUserId", new C27785h(0, 1, "pinnedByUserId", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap3.put("threadParticipantsIds", new C27785h(0, 1, "threadParticipantsIds", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap3.put("moderationDetails", new C27785h(0, 1, "moderationDetails", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap3.put("messageTextUpdatedAt", new C27785h(0, 1, "messageTextUpdatedAt", "INTEGER", null, false));
        linkedHashMap3.put("pollId", new C27785h(0, 1, "pollId", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap3.put("restrictedVisibility", new C27785h(0, 1, "restrictedVisibility", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap3.put(NotificationCompat.CATEGORY_REMINDER, new C27785h(0, 1, NotificationCompat.CATEGORY_REMINDER, ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap3.put("channelRole", new C27785h(0, 1, "channelRole", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap3.put("channel_infocid", new C27785h(0, 1, "channel_infocid", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap3.put("channel_infoid", new C27785h(0, 1, "channel_infoid", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap3.put("channel_infotype", new C27785h(0, 1, "channel_infotype", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap3.put("channel_infomemberCount", new C27785h(0, 1, "channel_infomemberCount", "INTEGER", null, false));
        LinkedHashSet linkedHashSetM48507i2 = AbstractC17176i.m48507i(linkedHashMap3, "channel_infoname", new C27785h(0, 1, "channel_infoname", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new C27787j("index_stream_chat_reply_message_cid_createdAt", AbstractC37056f.m118959K("cid", "createdAt"), AbstractC37056f.m118959K("ASC", "ASC"), false));
        linkedHashSet2.add(new C27787j("index_stream_chat_reply_message_syncStatus", AbstractC37056f.m118958J("syncStatus"), AbstractC37056f.m118958J("ASC"), false));
        C27788k c27788k3 = new C27788k(ReplyMessageEntityKt.REPLY_MESSAGE_ENTITY_TABLE_NAME, linkedHashMap3, linkedHashSetM48507i2, linkedHashSet2);
        C27788k c27788kM101188S3 = AbstractC32417h.m101188S(ReplyMessageEntityKt.REPLY_MESSAGE_ENTITY_TABLE_NAME, connection);
        if (!c27788k3.equals(c27788kM101188S3)) {
            return new C1784f1(false, AbstractC17176i.m48505g("stream_chat_reply_message(io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageInnerEntity).\n Expected:\n", c27788k3, "\n Found:\n", c27788kM101188S3));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("id", new C27785h(1, 1, "id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap4.put("messageId", new C27785h(0, 1, "messageId", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap4.put("authorName", new C27785h(0, 1, "authorName", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap4.put("titleLink", new C27785h(0, 1, "titleLink", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap4.put("authorLink", new C27785h(0, 1, "authorLink", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap4.put("thumbUrl", new C27785h(0, 1, "thumbUrl", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap4.put("imageUrl", new C27785h(0, 1, "imageUrl", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap4.put("assetUrl", new C27785h(0, 1, "assetUrl", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap4.put("ogUrl", new C27785h(0, 1, "ogUrl", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap4.put("mimeType", new C27785h(0, 1, "mimeType", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap4.put("fileSize", new C27785h(0, 1, "fileSize", "INTEGER", null, true));
        linkedHashMap4.put("title", new C27785h(0, 1, "title", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap4.put("text", new C27785h(0, 1, "text", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap4.put("type", new C27785h(0, 1, "type", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap4.put("image", new C27785h(0, 1, "image", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap4.put("name", new C27785h(0, 1, "name", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap4.put("fallback", new C27785h(0, 1, "fallback", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap4.put("uploadFilePath", new C27785h(0, 1, "uploadFilePath", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap4.put("originalHeight", new C27785h(0, 1, "originalHeight", "INTEGER", null, false));
        linkedHashMap4.put("originalWidth", new C27785h(0, 1, "originalWidth", "INTEGER", null, false));
        linkedHashMap4.put("extraData", new C27785h(0, 1, "extraData", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap4.put("statusCode", new C27785h(0, 1, "statusCode", "INTEGER", null, false));
        LinkedHashSet linkedHashSetM48507i3 = AbstractC17176i.m48507i(linkedHashMap4, "errorMessage", new C27785h(0, 1, "errorMessage", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashSetM48507i3.add(new C27786i(MessageEntityKt.MESSAGE_ENTITY_TABLE_NAME, "CASCADE", AbstractC37056f.m118958J("messageId"), "NO ACTION", AbstractC37056f.m118958J("id")));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        linkedHashSet3.add(new C27787j("index_attachment_inner_entity_messageId", AbstractC37056f.m118958J("messageId"), AbstractC37056f.m118958J("ASC"), false));
        linkedHashSet3.add(new C27787j("index_attachment_inner_entity_id", AbstractC37056f.m118958J("id"), AbstractC37056f.m118958J("ASC"), false));
        C27788k c27788k4 = new C27788k(AttachmentEntity.ATTACHMENT_ENTITY_TABLE_NAME, linkedHashMap4, linkedHashSetM48507i3, linkedHashSet3);
        C27788k c27788kM101188S4 = AbstractC32417h.m101188S(AttachmentEntity.ATTACHMENT_ENTITY_TABLE_NAME, connection);
        if (!c27788k4.equals(c27788kM101188S4)) {
            return new C1784f1(false, AbstractC17176i.m48505g("attachment_inner_entity(io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.AttachmentEntity).\n Expected:\n", c27788k4, "\n Found:\n", c27788kM101188S4));
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("id", new C27785h(1, 1, "id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap5.put("messageId", new C27785h(0, 1, "messageId", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap5.put("authorName", new C27785h(0, 1, "authorName", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap5.put("titleLink", new C27785h(0, 1, "titleLink", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap5.put("authorLink", new C27785h(0, 1, "authorLink", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap5.put("thumbUrl", new C27785h(0, 1, "thumbUrl", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap5.put("imageUrl", new C27785h(0, 1, "imageUrl", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap5.put("assetUrl", new C27785h(0, 1, "assetUrl", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap5.put("ogUrl", new C27785h(0, 1, "ogUrl", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap5.put("mimeType", new C27785h(0, 1, "mimeType", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap5.put("fileSize", new C27785h(0, 1, "fileSize", "INTEGER", null, true));
        linkedHashMap5.put("title", new C27785h(0, 1, "title", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap5.put("text", new C27785h(0, 1, "text", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap5.put("type", new C27785h(0, 1, "type", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap5.put("image", new C27785h(0, 1, "image", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap5.put("name", new C27785h(0, 1, "name", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap5.put("fallback", new C27785h(0, 1, "fallback", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap5.put("uploadFilePath", new C27785h(0, 1, "uploadFilePath", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap5.put("originalHeight", new C27785h(0, 1, "originalHeight", "INTEGER", null, false));
        linkedHashMap5.put("originalWidth", new C27785h(0, 1, "originalWidth", "INTEGER", null, false));
        linkedHashMap5.put("extraData", new C27785h(0, 1, "extraData", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap5.put("statusCode", new C27785h(0, 1, "statusCode", "INTEGER", null, false));
        LinkedHashSet linkedHashSetM48507i4 = AbstractC17176i.m48507i(linkedHashMap5, "errorMessage", new C27785h(0, 1, "errorMessage", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashSetM48507i4.add(new C27786i(ReplyMessageEntityKt.REPLY_MESSAGE_ENTITY_TABLE_NAME, "CASCADE", AbstractC37056f.m118958J("messageId"), "NO ACTION", AbstractC37056f.m118958J("id")));
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new C27787j("index_reply_attachment_inner_entity_messageId", AbstractC37056f.m118958J("messageId"), AbstractC37056f.m118958J("ASC"), false));
        linkedHashSet4.add(new C27787j("index_reply_attachment_inner_entity_id", AbstractC37056f.m118958J("id"), AbstractC37056f.m118958J("ASC"), false));
        C27788k c27788k5 = new C27788k(ReplyAttachmentEntity.REPLY_ATTACHMENT_ENTITY_TABLE_NAME, linkedHashMap5, linkedHashSetM48507i4, linkedHashSet4);
        C27788k c27788kM101188S5 = AbstractC32417h.m101188S(ReplyAttachmentEntity.REPLY_ATTACHMENT_ENTITY_TABLE_NAME, connection);
        if (!c27788k5.equals(c27788kM101188S5)) {
            return new C1784f1(false, AbstractC17176i.m48505g("reply_attachment_inner_entity(io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.ReplyAttachmentEntity).\n Expected:\n", c27788k5, "\n Found:\n", c27788kM101188S5));
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("id", new C27785h(1, 1, "id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap6.put("originalId", new C27785h(0, 1, "originalId", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap6.put("name", new C27785h(0, 1, "name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap6.put("image", new C27785h(0, 1, "image", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap6.put("role", new C27785h(0, 1, "role", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap6.put("createdAt", new C27785h(0, 1, "createdAt", "INTEGER", null, false));
        linkedHashMap6.put("updatedAt", new C27785h(0, 1, "updatedAt", "INTEGER", null, false));
        linkedHashMap6.put("lastActive", new C27785h(0, 1, "lastActive", "INTEGER", null, false));
        linkedHashMap6.put("invisible", new C27785h(0, 1, "invisible", "INTEGER", null, true));
        linkedHashMap6.put("privacySettings", new C27785h(0, 1, "privacySettings", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap6.put("banned", new C27785h(0, 1, "banned", "INTEGER", null, true));
        linkedHashMap6.put("mutes", new C27785h(0, 1, "mutes", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap6.put("teams", new C27785h(0, 1, "teams", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap6.put("teamsRole", new C27785h(0, 1, "teamsRole", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap6.put("extraData", new C27785h(0, 1, "extraData", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap6.put("avgResponseTime", new C27785h(0, 1, "avgResponseTime", "INTEGER", null, false));
        LinkedHashSet linkedHashSetM48507i5 = AbstractC17176i.m48507i(linkedHashMap6, "pushPreference", new C27785h(0, 1, "pushPreference", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new C27787j("index_stream_chat_user_name", AbstractC37056f.m118958J("name"), AbstractC37056f.m118958J("ASC"), false));
        C27788k c27788k6 = new C27788k(UserEntityKt.USER_ENTITY_TABLE_NAME, linkedHashMap6, linkedHashSetM48507i5, linkedHashSet5);
        C27788k c27788kM101188S6 = AbstractC32417h.m101188S(UserEntityKt.USER_ENTITY_TABLE_NAME, connection);
        if (!c27788k6.equals(c27788kM101188S6)) {
            return new C1784f1(false, AbstractC17176i.m48505g("stream_chat_user(io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserEntity).\n Expected:\n", c27788k6, "\n Found:\n", c27788kM101188S6));
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("messageId", new C27785h(0, 1, "messageId", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap7.put("userId", new C27785h(0, 1, "userId", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap7.put("type", new C27785h(0, 1, "type", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap7.put("score", new C27785h(0, 1, "score", "INTEGER", null, true));
        linkedHashMap7.put("createdAt", new C27785h(0, 1, "createdAt", "INTEGER", null, false));
        linkedHashMap7.put("createdLocallyAt", new C27785h(0, 1, "createdLocallyAt", "INTEGER", null, false));
        linkedHashMap7.put("updatedAt", new C27785h(0, 1, "updatedAt", "INTEGER", null, false));
        linkedHashMap7.put("deletedAt", new C27785h(0, 1, "deletedAt", "INTEGER", null, false));
        linkedHashMap7.put("enforceUnique", new C27785h(0, 1, "enforceUnique", "INTEGER", null, true));
        linkedHashMap7.put("skipPush", new C27785h(0, 1, "skipPush", "INTEGER", null, true));
        linkedHashMap7.put("emojiCode", new C27785h(0, 1, "emojiCode", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap7.put("extraData", new C27785h(0, 1, "extraData", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap7.put("syncStatus", new C27785h(0, 1, "syncStatus", "INTEGER", null, true));
        LinkedHashSet linkedHashSetM48507i6 = AbstractC17176i.m48507i(linkedHashMap7, "id", new C27785h(1, 1, "id", "INTEGER", null, true));
        linkedHashSetM48507i6.add(new C27786i(MessageEntityKt.MESSAGE_ENTITY_TABLE_NAME, "CASCADE", AbstractC37056f.m118958J("messageId"), "NO ACTION", AbstractC37056f.m118958J("id")));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new C27787j("index_stream_chat_reaction_messageId_userId_type", AbstractC37056f.m118959K("messageId", "userId", "type"), AbstractC37056f.m118959K("ASC", "ASC", "ASC"), true));
        linkedHashSet6.add(new C27787j("index_stream_chat_reaction_syncStatus", AbstractC37056f.m118958J("syncStatus"), AbstractC37056f.m118958J("ASC"), false));
        linkedHashSet6.add(new C27787j("index_stream_chat_reaction_messageId", AbstractC37056f.m118958J("messageId"), AbstractC37056f.m118958J("ASC"), false));
        C27788k c27788k7 = new C27788k(ReactionEntityKt.REACTION_ENTITY_TABLE_NAME, linkedHashMap7, linkedHashSetM48507i6, linkedHashSet6);
        C27788k c27788kM101188S7 = AbstractC32417h.m101188S(ReactionEntityKt.REACTION_ENTITY_TABLE_NAME, connection);
        if (!c27788k7.equals(c27788kM101188S7)) {
            return new C1784f1(false, AbstractC17176i.m48505g("stream_chat_reaction(io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity).\n Expected:\n", c27788k7, "\n Found:\n", c27788kM101188S7));
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        linkedHashMap8.put("type", new C27785h(0, 1, "type", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap8.put("channelId", new C27785h(0, 1, "channelId", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap8.put("name", new C27785h(0, 1, "name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap8.put("image", new C27785h(0, 1, "image", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap8.put("cooldown", new C27785h(0, 1, "cooldown", "INTEGER", null, true));
        linkedHashMap8.put("createdByUserId", new C27785h(0, 1, "createdByUserId", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap8.put("filterTags", new C27785h(0, 1, "filterTags", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap8.put("frozen", new C27785h(0, 1, "frozen", "INTEGER", null, true));
        linkedHashMap8.put("hidden", new C27785h(0, 1, "hidden", "INTEGER", null, false));
        linkedHashMap8.put("hideMessagesBefore", new C27785h(0, 1, "hideMessagesBefore", "INTEGER", null, false));
        linkedHashMap8.put(QueryChannelRequest.KEY_MEMBERS, new C27785h(0, 1, QueryChannelRequest.KEY_MEMBERS, ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap8.put("memberCount", new C27785h(0, 1, "memberCount", "INTEGER", null, true));
        linkedHashMap8.put("watcherIds", new C27785h(0, 1, "watcherIds", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap8.put("watcherCount", new C27785h(0, 1, "watcherCount", "INTEGER", null, true));
        linkedHashMap8.put("reads", new C27785h(0, 1, "reads", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap8.put("lastMessageAt", new C27785h(0, 1, "lastMessageAt", "INTEGER", null, false));
        linkedHashMap8.put("lastMessageId", new C27785h(0, 1, "lastMessageId", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap8.put("createdAt", new C27785h(0, 1, "createdAt", "INTEGER", null, false));
        linkedHashMap8.put("updatedAt", new C27785h(0, 1, "updatedAt", "INTEGER", null, false));
        linkedHashMap8.put("deletedAt", new C27785h(0, 1, "deletedAt", "INTEGER", null, false));
        linkedHashMap8.put("extraData", new C27785h(0, 1, "extraData", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap8.put("syncStatus", new C27785h(0, 1, "syncStatus", "INTEGER", null, true));
        linkedHashMap8.put("team", new C27785h(0, 1, "team", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap8.put("ownCapabilities", new C27785h(0, 1, "ownCapabilities", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap8.put("membership", new C27785h(0, 1, "membership", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap8.put("activeLiveLocations", new C27785h(0, 1, "activeLiveLocations", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap8.put("messageCount", new C27785h(0, 1, "messageCount", "INTEGER", null, false));
        LinkedHashSet linkedHashSetM48507i7 = AbstractC17176i.m48507i(linkedHashMap8, "cid", new C27785h(1, 1, "cid", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new C27787j("index_stream_chat_channel_state_syncStatus", AbstractC37056f.m118958J("syncStatus"), AbstractC37056f.m118958J("ASC"), false));
        C27788k c27788k8 = new C27788k(ChannelEntityKt.CHANNEL_ENTITY_TABLE_NAME, linkedHashMap8, linkedHashSetM48507i7, linkedHashSet7);
        C27788k c27788kM101188S8 = AbstractC32417h.m101188S(ChannelEntityKt.CHANNEL_ENTITY_TABLE_NAME, connection);
        if (!c27788k8.equals(c27788kM101188S8)) {
            return new C1784f1(false, AbstractC17176i.m48505g("stream_chat_channel_state(io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelEntity).\n Expected:\n", c27788k8, "\n Found:\n", c27788kM101188S8));
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
        linkedHashMap9.put("channelType", new C27785h(1, 1, "channelType", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap9.put("createdAt", new C27785h(0, 1, "createdAt", "INTEGER", null, false));
        linkedHashMap9.put("updatedAt", new C27785h(0, 1, "updatedAt", "INTEGER", null, false));
        linkedHashMap9.put("name", new C27785h(0, 1, "name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap9.put("isTypingEvents", new C27785h(0, 1, "isTypingEvents", "INTEGER", null, true));
        linkedHashMap9.put("isReadEvents", new C27785h(0, 1, "isReadEvents", "INTEGER", null, true));
        linkedHashMap9.put("deliveryEventsEnabled", new C27785h(0, 1, "deliveryEventsEnabled", "INTEGER", null, true));
        linkedHashMap9.put("isConnectEvents", new C27785h(0, 1, "isConnectEvents", "INTEGER", null, true));
        linkedHashMap9.put("isSearch", new C27785h(0, 1, "isSearch", "INTEGER", null, true));
        linkedHashMap9.put("isReactionsEnabled", new C27785h(0, 1, "isReactionsEnabled", "INTEGER", null, true));
        linkedHashMap9.put("isThreadEnabled", new C27785h(0, 1, "isThreadEnabled", "INTEGER", null, true));
        linkedHashMap9.put("isMutes", new C27785h(0, 1, "isMutes", "INTEGER", null, true));
        linkedHashMap9.put("uploadsEnabled", new C27785h(0, 1, "uploadsEnabled", "INTEGER", null, true));
        linkedHashMap9.put("urlEnrichmentEnabled", new C27785h(0, 1, "urlEnrichmentEnabled", "INTEGER", null, true));
        linkedHashMap9.put("customEventsEnabled", new C27785h(0, 1, "customEventsEnabled", "INTEGER", null, true));
        linkedHashMap9.put("pushNotificationsEnabled", new C27785h(0, 1, "pushNotificationsEnabled", "INTEGER", null, true));
        linkedHashMap9.put("messageRetention", new C27785h(0, 1, "messageRetention", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap9.put("maxMessageLength", new C27785h(0, 1, "maxMessageLength", "INTEGER", null, true));
        linkedHashMap9.put("automod", new C27785h(0, 1, "automod", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap9.put("automodBehavior", new C27785h(0, 1, "automodBehavior", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap9.put("blocklistBehavior", new C27785h(0, 1, "blocklistBehavior", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap9.put("messageRemindersEnabled", new C27785h(0, 1, "messageRemindersEnabled", "INTEGER", null, true));
        C27788k c27788k9 = new C27788k(ChannelConfigEntityKt.CHANNEL_CONFIG_INNER_ENTITY_TABLE_NAME, linkedHashMap9, AbstractC17176i.m48507i(linkedHashMap9, "markMessagesPending", new C27785h(0, 1, "markMessagesPending", "INTEGER", null, true)), new LinkedHashSet());
        C27788k c27788kM101188S9 = AbstractC32417h.m101188S(ChannelConfigEntityKt.CHANNEL_CONFIG_INNER_ENTITY_TABLE_NAME, connection);
        if (!c27788k9.equals(c27788kM101188S9)) {
            return new C1784f1(false, AbstractC17176i.m48505g("stream_chat_channel_config(io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigInnerEntity).\n Expected:\n", c27788k9, "\n Found:\n", c27788kM101188S9));
        }
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        linkedHashMap10.put("name", new C27785h(0, 1, "name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap10.put("description", new C27785h(0, 1, "description", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap10.put("args", new C27785h(0, 1, "args", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap10.put("set", new C27785h(0, 1, "set", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap10.put("channelType", new C27785h(0, 1, "channelType", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        LinkedHashSet linkedHashSetM48507i8 = AbstractC17176i.m48507i(linkedHashMap10, "id", new C27785h(1, 1, "id", "INTEGER", null, true));
        linkedHashSetM48507i8.add(new C27786i(ChannelConfigEntityKt.CHANNEL_CONFIG_INNER_ENTITY_TABLE_NAME, "CASCADE", AbstractC37056f.m118958J("channelType"), "CASCADE", AbstractC37056f.m118958J("channelType")));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new C27787j("index_command_inner_entity_channelType", AbstractC37056f.m118958J("channelType"), AbstractC37056f.m118958J("ASC"), false));
        C27788k c27788k10 = new C27788k(ChannelConfigEntityKt.COMMAND_INNER_ENTITY_TABLE_NAME, linkedHashMap10, linkedHashSetM48507i8, linkedHashSet8);
        C27788k c27788kM101188S10 = AbstractC32417h.m101188S(ChannelConfigEntityKt.COMMAND_INNER_ENTITY_TABLE_NAME, connection);
        if (!c27788k10.equals(c27788kM101188S10)) {
            return new C1784f1(false, AbstractC17176i.m48505g("command_inner_entity(io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.CommandInnerEntity).\n Expected:\n", c27788k10, "\n Found:\n", c27788kM101188S10));
        }
        LinkedHashMap linkedHashMap11 = new LinkedHashMap();
        linkedHashMap11.put("userId", new C27785h(1, 1, "userId", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap11.put("activeChannelIds", new C27785h(0, 1, "activeChannelIds", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap11.put("lastSyncedAt", new C27785h(0, 1, "lastSyncedAt", "INTEGER", null, false));
        linkedHashMap11.put("rawLastSyncedAt", new C27785h(0, 1, "rawLastSyncedAt", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        C27788k c27788k11 = new C27788k(SyncStateEntityKt.SYNC_STATE_ENTITY_TABLE_NAME, linkedHashMap11, AbstractC17176i.m48507i(linkedHashMap11, "markedAllReadAt", new C27785h(0, 1, "markedAllReadAt", "INTEGER", null, false)), new LinkedHashSet());
        C27788k c27788kM101188S11 = AbstractC32417h.m101188S(SyncStateEntityKt.SYNC_STATE_ENTITY_TABLE_NAME, connection);
        if (!c27788k11.equals(c27788kM101188S11)) {
            return new C1784f1(false, AbstractC17176i.m48505g("stream_sync_state(io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal.SyncStateEntity).\n Expected:\n", c27788k11, "\n Found:\n", c27788kM101188S11));
        }
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        linkedHashMap12.put("id", new C27785h(1, 1, "id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap12.put("name", new C27785h(0, 1, "name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap12.put("description", new C27785h(0, 1, "description", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap12.put("options", new C27785h(0, 1, "options", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap12.put("votingVisibility", new C27785h(0, 1, "votingVisibility", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap12.put("enforceUniqueVote", new C27785h(0, 1, "enforceUniqueVote", "INTEGER", null, true));
        linkedHashMap12.put("maxVotesAllowed", new C27785h(0, 1, "maxVotesAllowed", "INTEGER", null, false));
        linkedHashMap12.put("allowUserSuggestedOptions", new C27785h(0, 1, "allowUserSuggestedOptions", "INTEGER", null, true));
        linkedHashMap12.put("allowAnswers", new C27785h(0, 1, "allowAnswers", "INTEGER", null, true));
        linkedHashMap12.put("voteCount", new C27785h(0, 1, "voteCount", "INTEGER", null, true));
        linkedHashMap12.put("voteCountsByOption", new C27785h(0, 1, "voteCountsByOption", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap12.put("votes", new C27785h(0, 1, "votes", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap12.put("ownVotes", new C27785h(0, 1, "ownVotes", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap12.put("createdAt", new C27785h(0, 1, "createdAt", "INTEGER", null, true));
        linkedHashMap12.put("updatedAt", new C27785h(0, 1, "updatedAt", "INTEGER", null, true));
        linkedHashMap12.put("closed", new C27785h(0, 1, "closed", "INTEGER", null, true));
        linkedHashMap12.put("answersCount", new C27785h(0, 1, "answersCount", "INTEGER", null, true));
        linkedHashMap12.put("answers", new C27785h(0, 1, "answers", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap12.put("createdById", new C27785h(0, 1, "createdById", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        C27788k c27788k12 = new C27788k(PollKt.POLL_ENTITY_TABLE_NAME, linkedHashMap12, AbstractC17176i.m48507i(linkedHashMap12, "extraData", new C27785h(0, 1, "extraData", ShippingAddressField.TEXT_FIELD_TYPE, null, true)), new LinkedHashSet());
        C27788k c27788kM101188S12 = AbstractC32417h.m101188S(PollKt.POLL_ENTITY_TABLE_NAME, connection);
        if (!c27788k12.equals(c27788kM101188S12)) {
            return new C1784f1(false, AbstractC17176i.m48505g("stream_chat_poll(io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollEntity).\n Expected:\n", c27788k12, "\n Found:\n", c27788kM101188S12));
        }
        LinkedHashMap linkedHashMap13 = new LinkedHashMap();
        linkedHashMap13.put("parentMessageId", new C27785h(1, 1, "parentMessageId", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap13.put("cid", new C27785h(0, 1, "cid", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap13.put("createdByUserId", new C27785h(0, 1, "createdByUserId", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap13.put("activeParticipantCount", new C27785h(0, 1, "activeParticipantCount", "INTEGER", null, true));
        linkedHashMap13.put("participantCount", new C27785h(0, 1, "participantCount", "INTEGER", null, true));
        linkedHashMap13.put("threadParticipants", new C27785h(0, 1, "threadParticipants", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap13.put("lastMessageAt", new C27785h(0, 1, "lastMessageAt", "INTEGER", null, true));
        linkedHashMap13.put("createdAt", new C27785h(0, 1, "createdAt", "INTEGER", null, true));
        linkedHashMap13.put("updatedAt", new C27785h(0, 1, "updatedAt", "INTEGER", null, true));
        linkedHashMap13.put("deletedAt", new C27785h(0, 1, "deletedAt", "INTEGER", null, false));
        linkedHashMap13.put("title", new C27785h(0, 1, "title", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap13.put("read", new C27785h(0, 1, "read", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap13.put("latestReplyIds", new C27785h(0, 1, "latestReplyIds", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        C27788k c27788k13 = new C27788k(ThreadEntityKt.THREAD_ENTITY_TABLE_NAME, linkedHashMap13, AbstractC17176i.m48507i(linkedHashMap13, "extraData", new C27785h(0, 1, "extraData", ShippingAddressField.TEXT_FIELD_TYPE, null, true)), new LinkedHashSet());
        C27788k c27788kM101188S13 = AbstractC32417h.m101188S(ThreadEntityKt.THREAD_ENTITY_TABLE_NAME, connection);
        if (!c27788k13.equals(c27788kM101188S13)) {
            return new C1784f1(false, AbstractC17176i.m48505g("stream_chat_thread(io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadEntity).\n Expected:\n", c27788k13, "\n Found:\n", c27788kM101188S13));
        }
        LinkedHashMap linkedHashMap14 = new LinkedHashMap();
        linkedHashMap14.put("id", new C27785h(1, 1, "id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        C27788k c27788k14 = new C27788k(ThreadOrderEntityKt.THREAD_ORDER_ENTITY_TABLE_NAME, linkedHashMap14, AbstractC17176i.m48507i(linkedHashMap14, "order", new C27785h(0, 1, "order", ShippingAddressField.TEXT_FIELD_TYPE, null, true)), new LinkedHashSet());
        C27788k c27788kM101188S14 = AbstractC32417h.m101188S(ThreadOrderEntityKt.THREAD_ORDER_ENTITY_TABLE_NAME, connection);
        if (!c27788k14.equals(c27788kM101188S14)) {
            return new C1784f1(false, AbstractC17176i.m48505g("stream_chat_thread_order(io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadOrderEntity).\n Expected:\n", c27788k14, "\n Found:\n", c27788kM101188S14));
        }
        LinkedHashMap linkedHashMap15 = new LinkedHashMap();
        linkedHashMap15.put("id", new C27785h(1, 1, "id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap15.put("cid", new C27785h(0, 1, "cid", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap15.put("text", new C27785h(0, 1, "text", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap15.put("parentId", new C27785h(0, 1, "parentId", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap15.put("mentionedUsersIds", new C27785h(0, 1, "mentionedUsersIds", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap15.put(NotificationCompat.GROUP_KEY_SILENT, new C27785h(0, 1, NotificationCompat.GROUP_KEY_SILENT, "INTEGER", null, true));
        linkedHashMap15.put("showInChannel", new C27785h(0, 1, "showInChannel", "INTEGER", null, true));
        linkedHashMap15.put("replyMessageId", new C27785h(0, 1, "replyMessageId", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap15.put("command", new C27785h(0, 1, "command", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap15.put("args", new C27785h(0, 1, "args", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        C27788k c27788k15 = new C27788k(DraftMessageEntityKt.DRAFT_MESSAGE_ENTITY_TABLE_NAME, linkedHashMap15, AbstractC17176i.m48507i(linkedHashMap15, "extraData", new C27785h(0, 1, "extraData", ShippingAddressField.TEXT_FIELD_TYPE, null, true)), new LinkedHashSet());
        C27788k c27788kM101188S15 = AbstractC32417h.m101188S(DraftMessageEntityKt.DRAFT_MESSAGE_ENTITY_TABLE_NAME, connection);
        return !c27788k15.equals(c27788kM101188S15) ? new C1784f1(false, AbstractC17176i.m48505g("stream_chat_draft_message_entity(io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DraftMessageEntity).\n Expected:\n", c27788k15, "\n Found:\n", c27788kM101188S15)) : new C1784f1(true, null);
    }
}
