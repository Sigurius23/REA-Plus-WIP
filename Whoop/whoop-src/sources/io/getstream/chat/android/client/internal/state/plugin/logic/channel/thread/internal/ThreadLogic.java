package io.getstream.chat.android.client.internal.state.plugin.logic.channel.thread.internal;

import androidx.profileinstaller.ProfileVerifier;
import bd3.C3131k0;
import io.getstream.chat.android.client.events.AnswerCastedEvent;
import io.getstream.chat.android.client.events.HasMessage;
import io.getstream.chat.android.client.events.HasPoll;
import io.getstream.chat.android.client.events.HasReminder;
import io.getstream.chat.android.client.events.MessageUpdatedEvent;
import io.getstream.chat.android.client.events.PollClosedEvent;
import io.getstream.chat.android.client.events.PollDeletedEvent;
import io.getstream.chat.android.client.events.PollUpdatedEvent;
import io.getstream.chat.android.client.events.ReminderCreatedEvent;
import io.getstream.chat.android.client.events.ReminderDeletedEvent;
import io.getstream.chat.android.client.events.ReminderUpdatedEvent;
import io.getstream.chat.android.client.events.VoteCastedEvent;
import io.getstream.chat.android.client.events.VoteChangedEvent;
import io.getstream.chat.android.client.events.VoteRemovedEvent;
import io.getstream.chat.android.client.extensions.internal.MessageReminderKt;
import io.getstream.chat.android.client.extensions.internal.PollKt;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.thread.internal.ThreadMutableState;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.Reaction;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u001d\u0010!\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\"\u0010\u0019J\u0017\u0010&\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0006H\u0000¢\u0006\u0004\b%\u0010\fJ\u001d\u0010(\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001dH\u0000¢\u0006\u0004\b'\u0010 J\u0017\u0010*\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0006H\u0000¢\u0006\u0004\b)\u0010\fJ\u001d\u0010,\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001dH\u0000¢\u0006\u0004\b+\u0010 J\u001d\u00100\u001a\u00020\n2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u001dH\u0000¢\u0006\u0004\b/\u0010 J\u001d\u00103\u001a\u00020\n2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002010\u001dH\u0000¢\u0006\u0004\b2\u0010 J'\u00108\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u00010\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002050\u001dH\u0000¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;", "", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;", "threadStateLogic", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;)V", "", "isLoadingMessages", "()Z", "isLoading", "Ll83/a0;", "setLoading$stream_chat_android_client_release", "(Z)V", "setLoading", "", "messageId", "Lio/getstream/chat/android/models/Message;", "getMessage$stream_chat_android_client_release", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;", "getMessage", "stateLogic$stream_chat_android_client_release", "()Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;", "stateLogic", "message", "deleteMessage$stream_chat_android_client_release", "(Lio/getstream/chat/android/models/Message;)V", "deleteMessage", "upsertMessage$stream_chat_android_client_release", "upsertMessage", "", "messages", "upsertMessages$stream_chat_android_client_release", "(Ljava/util/List;)V", "upsertMessages", "removeLocalMessage$stream_chat_android_client_release", "removeLocalMessage", "isEnd", "setEndOfOlderMessages$stream_chat_android_client_release", "setEndOfOlderMessages", "updateOldestMessageInThread$stream_chat_android_client_release", "updateOldestMessageInThread", "setEndOfNewerMessages$stream_chat_android_client_release", "setEndOfNewerMessages", "updateNewestMessageInThread$stream_chat_android_client_release", "updateNewestMessageInThread", "Lio/getstream/chat/android/client/events/HasMessage;", "events", "handleMessageEvents$stream_chat_android_client_release", "handleMessageEvents", "Lio/getstream/chat/android/client/events/HasReminder;", "handleReminderEvents$stream_chat_android_client_release", "handleReminderEvents", "currentUserId", "Lio/getstream/chat/android/client/events/HasPoll;", "handlePollEvents$stream_chat_android_client_release", "(Ljava/lang/String;Ljava/util/List;)V", "handlePollEvents", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;", "mutableState", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadLogic {
    private final ThreadMutableState mutableState;
    private final ThreadStateLogic threadStateLogic;

    public ThreadLogic(ThreadStateLogic threadStateLogic) {
        AbstractC22676k.m65750j(threadStateLogic, "threadStateLogic");
        this.threadStateLogic = threadStateLogic;
        this.mutableState = threadStateLogic.getMutableState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Poll handlePollEvents$lambda$12$lambda$10(C22669g0 c22669g0, String it) {
        AbstractC22676k.m65750j(it, "it");
        return (Poll) c22669g0.f89336w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Poll handlePollEvents$lambda$12$lambda$11(C22669g0 c22669g0, String it) {
        AbstractC22676k.m65750j(it, "it");
        return (Poll) c22669g0.f89336w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Poll handlePollEvents$lambda$12$lambda$6(C22669g0 c22669g0, String it) {
        AbstractC22676k.m65750j(it, "it");
        return (Poll) c22669g0.f89336w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Poll handlePollEvents$lambda$12$lambda$7(C22669g0 c22669g0, String it) {
        AbstractC22676k.m65750j(it, "it");
        return (Poll) c22669g0.f89336w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Poll handlePollEvents$lambda$12$lambda$8(C22669g0 c22669g0, String it) {
        AbstractC22676k.m65750j(it, "it");
        return (Poll) c22669g0.f89336w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Poll handlePollEvents$lambda$12$lambda$9(C22669g0 c22669g0, String it) {
        AbstractC22676k.m65750j(it, "it");
        return (Poll) c22669g0.f89336w;
    }

    public final void deleteMessage$stream_chat_android_client_release(Message message) {
        AbstractC22676k.m65750j(message, "message");
        this.threadStateLogic.deleteMessage(message);
    }

    public final Message getMessage$stream_chat_android_client_release(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        Message message = (Message) ((Map) this.mutableState.getRawMessage().getValue()).get(messageId);
        if (message != null) {
            return message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
        }
        return null;
    }

    public final void handleMessageEvents$stream_chat_android_client_release(List<? extends HasMessage> events) {
        List<Reaction> ownReactions;
        Poll poll;
        Message messageCopy;
        AbstractC22676k.m65750j(events, "events");
        List<? extends HasMessage> list = events;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (HasMessage hasMessage : list) {
            Message message$stream_chat_android_client_release = getMessage$stream_chat_android_client_release(hasMessage.getMessage().getId());
            if (message$stream_chat_android_client_release == null || (ownReactions = message$stream_chat_android_client_release.getOwnReactions()) == null) {
                ownReactions = hasMessage.getMessage().getOwnReactions();
            }
            List<Reaction> list2 = ownReactions;
            Poll poll2 = hasMessage.getMessage().getPoll();
            if (poll2 != null) {
                poll = poll2;
            } else if (message$stream_chat_android_client_release != null) {
                poll2 = message$stream_chat_android_client_release.getPoll();
                poll = poll2;
            } else {
                poll = null;
            }
            if (hasMessage instanceof MessageUpdatedEvent) {
                MessageUpdatedEvent messageUpdatedEvent = (MessageUpdatedEvent) hasMessage;
                Object obj = null;
                Message message = messageUpdatedEvent.getMessage();
                for (Object obj2 : (Iterable) this.mutableState.getMessages().getValue()) {
                    if (AbstractC22676k.m65745e(((Message) obj2).getId(), messageUpdatedEvent.getMessage().getReplyMessageId())) {
                        obj = obj2;
                        break;
                    }
                }
                messageCopy = message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : list2, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : (Message) obj, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : poll, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
            } else {
                Message message2 = hasMessage.getMessage();
                messageCopy = message2.copy(((-1) & 1) != 0 ? message2.id : null, ((-1) & 2) != 0 ? message2.cid : null, ((-1) & 4) != 0 ? message2.text : null, ((-1) & 8) != 0 ? message2.html : null, ((-1) & 16) != 0 ? message2.parentId : null, ((-1) & 32) != 0 ? message2.command : null, ((-1) & 64) != 0 ? message2.attachments : null, ((-1) & 128) != 0 ? message2.mentionedUsersIds : null, ((-1) & 256) != 0 ? message2.mentionedUsers : null, ((-1) & 512) != 0 ? message2.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.reactionCounts : null, ((-1) & 4096) != 0 ? message2.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.syncStatus : null, ((-1) & 32768) != 0 ? message2.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message2.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message2.ownReactions : list2, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message2.createdAt : null, ((-1) & 524288) != 0 ? message2.updatedAt : null, ((-1) & 1048576) != 0 ? message2.deletedAt : null, ((-1) & 2097152) != 0 ? message2.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message2.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message2.user : null, ((-1) & 16777216) != 0 ? message2.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message2.silent : false, ((-1) & 67108864) != 0 ? message2.shadowed : false, ((-1) & 134217728) != 0 ? message2.i18n : null, ((-1) & 268435456) != 0 ? message2.showInChannel : false, ((-1) & 536870912) != 0 ? message2.channelInfo : null, ((-1) & 1073741824) != 0 ? message2.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message2.replyMessageId : null, (65535 & 1) != 0 ? message2.pinned : false, (65535 & 2) != 0 ? message2.pinnedAt : null, (65535 & 4) != 0 ? message2.pinExpires : null, (65535 & 8) != 0 ? message2.pinnedBy : null, (65535 & 16) != 0 ? message2.threadParticipants : null, (65535 & 32) != 0 ? message2.skipPushNotification : false, (65535 & 64) != 0 ? message2.skipEnrichUrl : false, (65535 & 128) != 0 ? message2.moderationDetails : null, (65535 & 256) != 0 ? message2.moderation : null, (65535 & 512) != 0 ? message2.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.restrictedVisibility : null, (65535 & 4096) != 0 ? message2.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.channelRole : null, (65535 & 32768) != 0 ? message2.deletedForMe : false);
            }
            arrayList.add(messageCopy);
        }
        upsertMessages$stream_chat_android_client_release(arrayList);
    }

    public final void handlePollEvents$stream_chat_android_client_release(String currentUserId, List<? extends HasPoll> events) {
        Poll poll;
        Poll pollProcessPoll;
        AbstractC22676k.m65750j(events, "events");
        Message parentMessage = this.mutableState.getParentMessage();
        if (parentMessage == null || (poll = parentMessage.getPoll()) == null) {
            return;
        }
        C22669g0 c22669g0 = new C22669g0();
        c22669g0.f89336w = poll;
        ArrayList<HasPoll> arrayList = new ArrayList();
        for (Object obj : events) {
            if (AbstractC22676k.m65745e(((HasPoll) obj).getPoll().getId(), poll.getId())) {
                arrayList.add(obj);
            }
        }
        for (HasPoll hasPoll : arrayList) {
            if (hasPoll instanceof AnswerCastedEvent) {
                pollProcessPoll = PollKt.processPoll((AnswerCastedEvent) hasPoll, new C3131k0(c22669g0, 1));
            } else if (hasPoll instanceof PollClosedEvent) {
                pollProcessPoll = PollKt.processPoll((PollClosedEvent) hasPoll, new C3131k0(c22669g0, 2));
            } else if (hasPoll instanceof PollUpdatedEvent) {
                pollProcessPoll = PollKt.processPoll((PollUpdatedEvent) hasPoll, new C3131k0(c22669g0, 3));
            } else if (hasPoll instanceof VoteRemovedEvent) {
                pollProcessPoll = PollKt.processPoll((VoteRemovedEvent) hasPoll, new C3131k0(c22669g0, 4));
            } else if (hasPoll instanceof VoteCastedEvent) {
                pollProcessPoll = PollKt.processPoll((VoteCastedEvent) hasPoll, currentUserId, new C3131k0(c22669g0, 5));
            } else if (hasPoll instanceof VoteChangedEvent) {
                pollProcessPoll = PollKt.processPoll((VoteChangedEvent) hasPoll, currentUserId, new C3131k0(c22669g0, 6));
            } else {
                if (!(hasPoll instanceof PollDeletedEvent)) {
                    throw new NoWhenBranchMatchedException();
                }
                pollProcessPoll = null;
            }
            c22669g0.f89336w = pollProcessPoll;
        }
        if (AbstractC22676k.m65745e(c22669g0.f89336w, poll)) {
            return;
        }
        this.mutableState.updateParentMessagePoll((Poll) c22669g0.f89336w);
    }

    public final void handleReminderEvents$stream_chat_android_client_release(List<? extends HasReminder> events) {
        AbstractC22676k.m65750j(events, "events");
        ArrayList arrayList = new ArrayList();
        for (HasReminder hasReminder : events) {
            Message message$stream_chat_android_client_release = getMessage$stream_chat_android_client_release(hasReminder.getReminder().getMessageId());
            Message messageCopy = null;
            if ((hasReminder instanceof ReminderCreatedEvent) || (hasReminder instanceof ReminderUpdatedEvent)) {
                if (message$stream_chat_android_client_release != null) {
                    messageCopy = message$stream_chat_android_client_release.copy(((-1) & 1) != 0 ? message$stream_chat_android_client_release.id : null, ((-1) & 2) != 0 ? message$stream_chat_android_client_release.cid : null, ((-1) & 4) != 0 ? message$stream_chat_android_client_release.text : null, ((-1) & 8) != 0 ? message$stream_chat_android_client_release.html : null, ((-1) & 16) != 0 ? message$stream_chat_android_client_release.parentId : null, ((-1) & 32) != 0 ? message$stream_chat_android_client_release.command : null, ((-1) & 64) != 0 ? message$stream_chat_android_client_release.attachments : null, ((-1) & 128) != 0 ? message$stream_chat_android_client_release.mentionedUsersIds : null, ((-1) & 256) != 0 ? message$stream_chat_android_client_release.mentionedUsers : null, ((-1) & 512) != 0 ? message$stream_chat_android_client_release.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message$stream_chat_android_client_release.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message$stream_chat_android_client_release.reactionCounts : null, ((-1) & 4096) != 0 ? message$stream_chat_android_client_release.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message$stream_chat_android_client_release.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message$stream_chat_android_client_release.syncStatus : null, ((-1) & 32768) != 0 ? message$stream_chat_android_client_release.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message$stream_chat_android_client_release.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message$stream_chat_android_client_release.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message$stream_chat_android_client_release.createdAt : null, ((-1) & 524288) != 0 ? message$stream_chat_android_client_release.updatedAt : null, ((-1) & 1048576) != 0 ? message$stream_chat_android_client_release.deletedAt : null, ((-1) & 2097152) != 0 ? message$stream_chat_android_client_release.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message$stream_chat_android_client_release.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message$stream_chat_android_client_release.user : null, ((-1) & 16777216) != 0 ? message$stream_chat_android_client_release.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message$stream_chat_android_client_release.silent : false, ((-1) & 67108864) != 0 ? message$stream_chat_android_client_release.shadowed : false, ((-1) & 134217728) != 0 ? message$stream_chat_android_client_release.i18n : null, ((-1) & 268435456) != 0 ? message$stream_chat_android_client_release.showInChannel : false, ((-1) & 536870912) != 0 ? message$stream_chat_android_client_release.channelInfo : null, ((-1) & 1073741824) != 0 ? message$stream_chat_android_client_release.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message$stream_chat_android_client_release.replyMessageId : null, (65535 & 1) != 0 ? message$stream_chat_android_client_release.pinned : false, (65535 & 2) != 0 ? message$stream_chat_android_client_release.pinnedAt : null, (65535 & 4) != 0 ? message$stream_chat_android_client_release.pinExpires : null, (65535 & 8) != 0 ? message$stream_chat_android_client_release.pinnedBy : null, (65535 & 16) != 0 ? message$stream_chat_android_client_release.threadParticipants : null, (65535 & 32) != 0 ? message$stream_chat_android_client_release.skipPushNotification : false, (65535 & 64) != 0 ? message$stream_chat_android_client_release.skipEnrichUrl : false, (65535 & 128) != 0 ? message$stream_chat_android_client_release.moderationDetails : null, (65535 & 256) != 0 ? message$stream_chat_android_client_release.moderation : null, (65535 & 512) != 0 ? message$stream_chat_android_client_release.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message$stream_chat_android_client_release.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message$stream_chat_android_client_release.restrictedVisibility : null, (65535 & 4096) != 0 ? message$stream_chat_android_client_release.reminder : MessageReminderKt.toMessageReminderInfo(hasReminder.getReminder()), (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message$stream_chat_android_client_release.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message$stream_chat_android_client_release.channelRole : null, (65535 & 32768) != 0 ? message$stream_chat_android_client_release.deletedForMe : false);
                }
            } else if ((hasReminder instanceof ReminderDeletedEvent) && message$stream_chat_android_client_release != null) {
                messageCopy = message$stream_chat_android_client_release.copy(((-1) & 1) != 0 ? message$stream_chat_android_client_release.id : null, ((-1) & 2) != 0 ? message$stream_chat_android_client_release.cid : null, ((-1) & 4) != 0 ? message$stream_chat_android_client_release.text : null, ((-1) & 8) != 0 ? message$stream_chat_android_client_release.html : null, ((-1) & 16) != 0 ? message$stream_chat_android_client_release.parentId : null, ((-1) & 32) != 0 ? message$stream_chat_android_client_release.command : null, ((-1) & 64) != 0 ? message$stream_chat_android_client_release.attachments : null, ((-1) & 128) != 0 ? message$stream_chat_android_client_release.mentionedUsersIds : null, ((-1) & 256) != 0 ? message$stream_chat_android_client_release.mentionedUsers : null, ((-1) & 512) != 0 ? message$stream_chat_android_client_release.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message$stream_chat_android_client_release.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message$stream_chat_android_client_release.reactionCounts : null, ((-1) & 4096) != 0 ? message$stream_chat_android_client_release.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message$stream_chat_android_client_release.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message$stream_chat_android_client_release.syncStatus : null, ((-1) & 32768) != 0 ? message$stream_chat_android_client_release.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message$stream_chat_android_client_release.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message$stream_chat_android_client_release.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message$stream_chat_android_client_release.createdAt : null, ((-1) & 524288) != 0 ? message$stream_chat_android_client_release.updatedAt : null, ((-1) & 1048576) != 0 ? message$stream_chat_android_client_release.deletedAt : null, ((-1) & 2097152) != 0 ? message$stream_chat_android_client_release.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message$stream_chat_android_client_release.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message$stream_chat_android_client_release.user : null, ((-1) & 16777216) != 0 ? message$stream_chat_android_client_release.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message$stream_chat_android_client_release.silent : false, ((-1) & 67108864) != 0 ? message$stream_chat_android_client_release.shadowed : false, ((-1) & 134217728) != 0 ? message$stream_chat_android_client_release.i18n : null, ((-1) & 268435456) != 0 ? message$stream_chat_android_client_release.showInChannel : false, ((-1) & 536870912) != 0 ? message$stream_chat_android_client_release.channelInfo : null, ((-1) & 1073741824) != 0 ? message$stream_chat_android_client_release.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message$stream_chat_android_client_release.replyMessageId : null, (65535 & 1) != 0 ? message$stream_chat_android_client_release.pinned : false, (65535 & 2) != 0 ? message$stream_chat_android_client_release.pinnedAt : null, (65535 & 4) != 0 ? message$stream_chat_android_client_release.pinExpires : null, (65535 & 8) != 0 ? message$stream_chat_android_client_release.pinnedBy : null, (65535 & 16) != 0 ? message$stream_chat_android_client_release.threadParticipants : null, (65535 & 32) != 0 ? message$stream_chat_android_client_release.skipPushNotification : false, (65535 & 64) != 0 ? message$stream_chat_android_client_release.skipEnrichUrl : false, (65535 & 128) != 0 ? message$stream_chat_android_client_release.moderationDetails : null, (65535 & 256) != 0 ? message$stream_chat_android_client_release.moderation : null, (65535 & 512) != 0 ? message$stream_chat_android_client_release.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message$stream_chat_android_client_release.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message$stream_chat_android_client_release.restrictedVisibility : null, (65535 & 4096) != 0 ? message$stream_chat_android_client_release.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message$stream_chat_android_client_release.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message$stream_chat_android_client_release.channelRole : null, (65535 & 32768) != 0 ? message$stream_chat_android_client_release.deletedForMe : false);
            }
            if (messageCopy != null) {
                arrayList.add(messageCopy);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        upsertMessages$stream_chat_android_client_release(arrayList);
    }

    public final boolean isLoadingMessages() {
        return ((Boolean) this.mutableState.getLoading().getValue()).booleanValue();
    }

    public final void removeLocalMessage$stream_chat_android_client_release(Message message) {
        AbstractC22676k.m65750j(message, "message");
        this.threadStateLogic.deleteMessage(message);
    }

    public final void setEndOfNewerMessages$stream_chat_android_client_release(boolean isEnd) {
        this.mutableState.setEndOfNewerMessages(isEnd);
    }

    public final void setEndOfOlderMessages$stream_chat_android_client_release(boolean isEnd) {
        this.mutableState.setEndOfOlderMessages(isEnd);
    }

    public final void setLoading$stream_chat_android_client_release(boolean isLoading) {
        this.mutableState.setLoading(isLoading);
    }

    /* JADX INFO: renamed from: stateLogic$stream_chat_android_client_release, reason: from getter */
    public final ThreadStateLogic getThreadStateLogic() {
        return this.threadStateLogic;
    }

    public final void updateNewestMessageInThread$stream_chat_android_client_release(List<Message> messages) {
        AbstractC22676k.m65750j(messages, "messages");
        ThreadMutableState threadMutableState = this.mutableState;
        Message message = (Message) AbstractC25265s.m74114R0(AbstractC25265s.m74152u1(messages, new ThreadLogic$updateNewestMessageInThread$$inlined$sortedBy$1()));
        if (message == null) {
            message = (Message) this.mutableState.getNewestInThread().getValue();
        }
        threadMutableState.setNewestInThread(message);
    }

    public final void updateOldestMessageInThread$stream_chat_android_client_release(List<Message> messages) {
        AbstractC22676k.m65750j(messages, "messages");
        ThreadMutableState threadMutableState = this.mutableState;
        Message message = (Message) AbstractC25265s.m74100H0(AbstractC25265s.m74152u1(messages, new ThreadLogic$updateOldestMessageInThread$$inlined$sortedBy$1()));
        if (message == null) {
            message = (Message) this.mutableState.getOldestInThread().getValue();
        }
        threadMutableState.setOldestInThread(message);
    }

    public final void upsertMessage$stream_chat_android_client_release(Message message) {
        AbstractC22676k.m65750j(message, "message");
        upsertMessages$stream_chat_android_client_release(AbstractC37056f.m118958J(message));
    }

    public final void upsertMessages$stream_chat_android_client_release(List<Message> messages) {
        AbstractC22676k.m65750j(messages, "messages");
        this.threadStateLogic.upsertMessages(messages);
    }
}
