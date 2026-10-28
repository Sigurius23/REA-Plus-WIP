package io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.events.AnswerCastedEvent;
import io.getstream.chat.android.client.events.ChannelDeletedEvent;
import io.getstream.chat.android.client.events.ChannelHiddenEvent;
import io.getstream.chat.android.client.events.ChannelTruncatedEvent;
import io.getstream.chat.android.client.events.ChannelUpdatedByUserEvent;
import io.getstream.chat.android.client.events.ChannelUpdatedEvent;
import io.getstream.chat.android.client.events.ChannelUserBannedEvent;
import io.getstream.chat.android.client.events.ChannelUserUnbannedEvent;
import io.getstream.chat.android.client.events.ChannelVisibleEvent;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.events.CidEvent;
import io.getstream.chat.android.client.events.HasChannel;
import io.getstream.chat.android.client.events.MarkAllReadEvent;
import io.getstream.chat.android.client.events.MemberAddedEvent;
import io.getstream.chat.android.client.events.MemberRemovedEvent;
import io.getstream.chat.android.client.events.MemberUpdatedEvent;
import io.getstream.chat.android.client.events.MessageDeletedEvent;
import io.getstream.chat.android.client.events.MessageDeliveredEvent;
import io.getstream.chat.android.client.events.MessageReadEvent;
import io.getstream.chat.android.client.events.MessageUpdatedEvent;
import io.getstream.chat.android.client.events.NewMessageEvent;
import io.getstream.chat.android.client.events.NotificationAddedToChannelEvent;
import io.getstream.chat.android.client.events.NotificationChannelMutesUpdatedEvent;
import io.getstream.chat.android.client.events.NotificationChannelTruncatedEvent;
import io.getstream.chat.android.client.events.NotificationInviteAcceptedEvent;
import io.getstream.chat.android.client.events.NotificationInviteRejectedEvent;
import io.getstream.chat.android.client.events.NotificationMarkReadEvent;
import io.getstream.chat.android.client.events.NotificationMarkUnreadEvent;
import io.getstream.chat.android.client.events.NotificationMessageNewEvent;
import io.getstream.chat.android.client.events.NotificationRemovedFromChannelEvent;
import io.getstream.chat.android.client.events.NotificationThreadMessageNewEvent;
import io.getstream.chat.android.client.events.PollClosedEvent;
import io.getstream.chat.android.client.events.PollDeletedEvent;
import io.getstream.chat.android.client.events.PollUpdatedEvent;
import io.getstream.chat.android.client.events.ReactionDeletedEvent;
import io.getstream.chat.android.client.events.ReactionNewEvent;
import io.getstream.chat.android.client.events.ReactionUpdateEvent;
import io.getstream.chat.android.client.events.ReminderCreatedEvent;
import io.getstream.chat.android.client.events.ReminderDeletedEvent;
import io.getstream.chat.android.client.events.ReminderUpdatedEvent;
import io.getstream.chat.android.client.events.TypingStartEvent;
import io.getstream.chat.android.client.events.TypingStopEvent;
import io.getstream.chat.android.client.events.UserMessagesDeletedEvent;
import io.getstream.chat.android.client.events.UserPresenceChangedEvent;
import io.getstream.chat.android.client.events.UserStartWatchingEvent;
import io.getstream.chat.android.client.events.UserStopWatchingEvent;
import io.getstream.chat.android.client.events.UserUpdatedEvent;
import io.getstream.chat.android.client.events.VoteCastedEvent;
import io.getstream.chat.android.client.events.VoteChangedEvent;
import io.getstream.chat.android.client.events.VoteRemovedEvent;
import io.getstream.chat.android.client.extensions.internal.MessageReminderKt;
import io.getstream.chat.android.client.extensions.internal.PollKt;
import io.getstream.chat.android.client.internal.state.event.handler.internal.utils.ChatEventUtilsKt;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelEventHandler;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateLegacyImpl;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelMute;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.MessageReminder;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.Reaction;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010(\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandler;", "", "cid", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;", "stateLogic", "Lkotlin/Function0;", "getCurrentUserId", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Lc93/a;)V", "Lio/getstream/chat/android/client/events/CidEvent;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "handleCidEvent", "(Lio/getstream/chat/android/client/events/CidEvent;)V", "Lio/getstream/chat/android/models/Message;", "message", "", "preserveCreatedLocallyAt", "upsertMessage", "(Lio/getstream/chat/android/models/Message;Z)V", "id", "getMessage", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;", "messageId", "Lio/getstream/chat/android/models/MessageReminder;", NotificationCompat.CATEGORY_REMINDER, "updateReminder", "(Ljava/lang/String;Lio/getstream/chat/android/models/MessageReminder;)V", "deleteReminder", "(Ljava/lang/String;)V", "Lio/getstream/chat/android/client/events/ChatEvent;", "handle", "(Lio/getstream/chat/android/client/events/ChatEvent;)V", "Ljava/lang/String;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;", "Lc93/a;", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;", "getMutableState", "()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;", "mutableState", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelEventHandlerLegacyImpl implements ChannelEventHandler {
    private final String cid;
    private final InterfaceC4339a getCurrentUserId;
    private final ChannelStateLogic stateLogic;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelEventHandlerLegacyImpl$handleCidEvent$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C193033 extends C22672i implements Function1 {
        public C193033(Object obj) {
            super(1, 0, ChannelStateLogic.class, obj, "getPoll", "getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Poll invoke(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((ChannelStateLogic) this.receiver).getPoll(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelEventHandlerLegacyImpl$handleCidEvent$4 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C193044 extends C22672i implements Function1 {
        public C193044(Object obj) {
            super(1, 0, ChannelStateLogic.class, obj, "getPoll", "getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Poll invoke(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((ChannelStateLogic) this.receiver).getPoll(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelEventHandlerLegacyImpl$handleCidEvent$5 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C193055 extends C22672i implements Function1 {
        public C193055(Object obj) {
            super(1, 0, ChannelStateLogic.class, obj, "getPoll", "getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Poll invoke(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((ChannelStateLogic) this.receiver).getPoll(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelEventHandlerLegacyImpl$handleCidEvent$6 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C193066 extends C22672i implements Function1 {
        public C193066(Object obj) {
            super(1, 0, ChannelStateLogic.class, obj, "getPoll", "getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Poll invoke(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((ChannelStateLogic) this.receiver).getPoll(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelEventHandlerLegacyImpl$handleCidEvent$7 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C193077 extends C22672i implements Function1 {
        public C193077(Object obj) {
            super(1, 0, ChannelStateLogic.class, obj, "getPoll", "getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Poll invoke(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((ChannelStateLogic) this.receiver).getPoll(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelEventHandlerLegacyImpl$handleCidEvent$8 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C193088 extends C22672i implements Function1 {
        public C193088(Object obj) {
            super(1, 0, ChannelStateLogic.class, obj, "getPoll", "getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Poll invoke(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((ChannelStateLogic) this.receiver).getPoll(p13);
        }
    }

    public ChannelEventHandlerLegacyImpl(String cid, ChannelStateLogic stateLogic, InterfaceC4339a getCurrentUserId) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(stateLogic, "stateLogic");
        AbstractC22676k.m65750j(getCurrentUserId, "getCurrentUserId");
        this.cid = cid;
        this.stateLogic = stateLogic;
        this.getCurrentUserId = getCurrentUserId;
    }

    private final void deleteReminder(String messageId) {
        Message messageById = this.stateLogic.getMutableState().getMessageById(messageId);
        if (messageById == null) {
            return;
        }
        upsertMessage$default(this, messageById.copy(((-1) & 1) != 0 ? messageById.id : null, ((-1) & 2) != 0 ? messageById.cid : null, ((-1) & 4) != 0 ? messageById.text : null, ((-1) & 8) != 0 ? messageById.html : null, ((-1) & 16) != 0 ? messageById.parentId : null, ((-1) & 32) != 0 ? messageById.command : null, ((-1) & 64) != 0 ? messageById.attachments : null, ((-1) & 128) != 0 ? messageById.mentionedUsersIds : null, ((-1) & 256) != 0 ? messageById.mentionedUsers : null, ((-1) & 512) != 0 ? messageById.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageById.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageById.reactionCounts : null, ((-1) & 4096) != 0 ? messageById.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageById.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageById.syncStatus : null, ((-1) & 32768) != 0 ? messageById.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageById.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageById.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageById.createdAt : null, ((-1) & 524288) != 0 ? messageById.updatedAt : null, ((-1) & 1048576) != 0 ? messageById.deletedAt : null, ((-1) & 2097152) != 0 ? messageById.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? messageById.createdLocallyAt : null, ((-1) & 8388608) != 0 ? messageById.user : null, ((-1) & 16777216) != 0 ? messageById.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageById.silent : false, ((-1) & 67108864) != 0 ? messageById.shadowed : false, ((-1) & 134217728) != 0 ? messageById.i18n : null, ((-1) & 268435456) != 0 ? messageById.showInChannel : false, ((-1) & 536870912) != 0 ? messageById.channelInfo : null, ((-1) & 1073741824) != 0 ? messageById.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? messageById.replyMessageId : null, (65535 & 1) != 0 ? messageById.pinned : false, (65535 & 2) != 0 ? messageById.pinnedAt : null, (65535 & 4) != 0 ? messageById.pinExpires : null, (65535 & 8) != 0 ? messageById.pinnedBy : null, (65535 & 16) != 0 ? messageById.threadParticipants : null, (65535 & 32) != 0 ? messageById.skipPushNotification : false, (65535 & 64) != 0 ? messageById.skipEnrichUrl : false, (65535 & 128) != 0 ? messageById.moderationDetails : null, (65535 & 256) != 0 ? messageById.moderation : null, (65535 & 512) != 0 ? messageById.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageById.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageById.restrictedVisibility : null, (65535 & 4096) != 0 ? messageById.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageById.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageById.channelRole : null, (65535 & 32768) != 0 ? messageById.deletedForMe : false), false, 2, null);
    }

    private final Message getMessage(String id4) {
        Message message = (Message) ((Map) this.stateLogic.getMutableState().getVisibleMessages().getValue()).get(id4);
        if (message != null) {
            return message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
        }
        return null;
    }

    private final ChannelStateLegacyImpl getMutableState() {
        return this.stateLogic.getMutableState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleCidEvent(CidEvent event) {
        Poll poll;
        Message replyTo;
        if (event instanceof NewMessageEvent) {
            NewMessageEvent newMessageEvent = (NewMessageEvent) event;
            upsertMessage(newMessageEvent.getMessage(), AbstractC22676k.m65745e(newMessageEvent.getMessage().getUser().getId(), this.getCurrentUserId.invoke()));
            this.stateLogic.updateCurrentUserRead(newMessageEvent.getCreatedAt(), newMessageEvent.getMessage());
            if (!newMessageEvent.getMessage().getShadowed()) {
                this.stateLogic.setHidden(false);
            }
            Integer channelMessageCount = newMessageEvent.getChannelMessageCount();
            if (channelMessageCount != null) {
                this.stateLogic.updateMessageCount(channelMessageCount.intValue());
            }
            this.stateLogic.updateLastMessageAt(newMessageEvent.getMessage());
            return;
        }
        if (event instanceof NotificationMessageNewEvent) {
            if (!((Boolean) this.stateLogic.getMutableState().getInsideSearch().getValue()).booleanValue()) {
                upsertMessage$default(this, ((NotificationMessageNewEvent) event).getMessage(), false, 2, null);
            }
            NotificationMessageNewEvent notificationMessageNewEvent = (NotificationMessageNewEvent) event;
            this.stateLogic.updateCurrentUserRead(notificationMessageNewEvent.getCreatedAt(), notificationMessageNewEvent.getMessage());
            if (!notificationMessageNewEvent.getMessage().getShadowed()) {
                this.stateLogic.setHidden(false);
            }
            this.stateLogic.updateLastMessageAt(notificationMessageNewEvent.getMessage());
            return;
        }
        if (event instanceof MessageUpdatedEvent) {
            MessageUpdatedEvent messageUpdatedEvent = (MessageUpdatedEvent) event;
            Message messageById = this.stateLogic.getMutableState().getMessageById(messageUpdatedEvent.getMessage().getId());
            Poll poll2 = messageUpdatedEvent.getMessage().getPoll();
            if (poll2 != null) {
                poll = poll2;
            } else if (messageById != null) {
                poll2 = messageById.getPoll();
                poll = poll2;
            } else {
                poll = null;
            }
            String replyMessageId = messageUpdatedEvent.getMessage().getReplyMessageId();
            if (replyMessageId == null || (replyTo = this.stateLogic.getMutableState().getMessageById(replyMessageId)) == null) {
                replyTo = messageUpdatedEvent.getMessage().getReplyTo();
            }
            Message message = replyTo;
            Message message2 = messageUpdatedEvent.getMessage();
            upsertMessage$default(this, message2.copy(((-1) & 1) != 0 ? message2.id : null, ((-1) & 2) != 0 ? message2.cid : null, ((-1) & 4) != 0 ? message2.text : null, ((-1) & 8) != 0 ? message2.html : null, ((-1) & 16) != 0 ? message2.parentId : null, ((-1) & 32) != 0 ? message2.command : null, ((-1) & 64) != 0 ? message2.attachments : null, ((-1) & 128) != 0 ? message2.mentionedUsersIds : null, ((-1) & 256) != 0 ? message2.mentionedUsers : null, ((-1) & 512) != 0 ? message2.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.reactionCounts : null, ((-1) & 4096) != 0 ? message2.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.syncStatus : null, ((-1) & 32768) != 0 ? message2.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message2.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message2.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message2.createdAt : null, ((-1) & 524288) != 0 ? message2.updatedAt : null, ((-1) & 1048576) != 0 ? message2.deletedAt : null, ((-1) & 2097152) != 0 ? message2.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message2.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message2.user : null, ((-1) & 16777216) != 0 ? message2.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message2.silent : false, ((-1) & 67108864) != 0 ? message2.shadowed : false, ((-1) & 134217728) != 0 ? message2.i18n : null, ((-1) & 268435456) != 0 ? message2.showInChannel : false, ((-1) & 536870912) != 0 ? message2.channelInfo : null, ((-1) & 1073741824) != 0 ? message2.replyTo : message, ((-1) & Integer.MIN_VALUE) != 0 ? message2.replyMessageId : null, (65535 & 1) != 0 ? message2.pinned : false, (65535 & 2) != 0 ? message2.pinnedAt : null, (65535 & 4) != 0 ? message2.pinExpires : null, (65535 & 8) != 0 ? message2.pinnedBy : null, (65535 & 16) != 0 ? message2.threadParticipants : null, (65535 & 32) != 0 ? message2.skipPushNotification : false, (65535 & 64) != 0 ? message2.skipEnrichUrl : false, (65535 & 128) != 0 ? message2.moderationDetails : null, (65535 & 256) != 0 ? message2.moderation : null, (65535 & 512) != 0 ? message2.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.poll : poll, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.restrictedVisibility : null, (65535 & 4096) != 0 ? message2.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.channelRole : null, (65535 & 32768) != 0 ? message2.deletedForMe : false), false, 2, null);
            return;
        }
        if (event instanceof MessageDeletedEvent) {
            MessageDeletedEvent messageDeletedEvent = (MessageDeletedEvent) event;
            if (messageDeletedEvent.getHardDelete()) {
                this.stateLogic.deleteMessage(messageDeletedEvent.getMessage());
            } else {
                upsertMessage$default(this, messageDeletedEvent.getMessage(), false, 2, null);
            }
            Integer channelMessageCount2 = messageDeletedEvent.getChannelMessageCount();
            if (channelMessageCount2 != null) {
                this.stateLogic.updateMessageCount(channelMessageCount2.intValue());
                return;
            }
            return;
        }
        if (event instanceof NotificationThreadMessageNewEvent) {
            upsertMessage$default(this, ((NotificationThreadMessageNewEvent) event).getMessage(), false, 2, null);
            return;
        }
        if (event instanceof ReactionNewEvent) {
            upsertMessage$default(this, ((ReactionNewEvent) event).getMessage(), false, 2, null);
            return;
        }
        if (event instanceof ReactionUpdateEvent) {
            upsertMessage$default(this, ((ReactionUpdateEvent) event).getMessage(), false, 2, null);
            return;
        }
        if (event instanceof ReactionDeletedEvent) {
            upsertMessage$default(this, ((ReactionDeletedEvent) event).getMessage(), false, 2, null);
            return;
        }
        if (event instanceof MemberAddedEvent) {
            MemberAddedEvent memberAddedEvent = (MemberAddedEvent) event;
            this.stateLogic.addMember(memberAddedEvent.getMember());
            if (AbstractC22676k.m65745e(memberAddedEvent.getMember().getUserId(), this.getCurrentUserId.invoke())) {
                this.stateLogic.addMembership(memberAddedEvent.getMember());
                return;
            }
            return;
        }
        if (event instanceof MemberRemovedEvent) {
            MemberRemovedEvent memberRemovedEvent = (MemberRemovedEvent) event;
            this.stateLogic.deleteMember(memberRemovedEvent.getMember());
            if (AbstractC22676k.m65745e(memberRemovedEvent.getMember().getUserId(), this.getCurrentUserId.invoke())) {
                this.stateLogic.removeMembership();
                return;
            }
            return;
        }
        if (event instanceof MemberUpdatedEvent) {
            MemberUpdatedEvent memberUpdatedEvent = (MemberUpdatedEvent) event;
            this.stateLogic.upsertMember(memberUpdatedEvent.getMember());
            this.stateLogic.updateMembership(memberUpdatedEvent.getMember());
            return;
        }
        if (event instanceof NotificationAddedToChannelEvent) {
            this.stateLogic.upsertMembers(((NotificationAddedToChannelEvent) event).getChannel().getMembers());
            return;
        }
        if (event instanceof NotificationRemovedFromChannelEvent) {
            NotificationRemovedFromChannelEvent notificationRemovedFromChannelEvent = (NotificationRemovedFromChannelEvent) event;
            this.stateLogic.setMembers(notificationRemovedFromChannelEvent.getChannel().getMembers(), notificationRemovedFromChannelEvent.getChannel().getMemberCount());
            this.stateLogic.setWatchers(notificationRemovedFromChannelEvent.getChannel().getWatchers(), notificationRemovedFromChannelEvent.getChannel().getWatcherCount());
            return;
        }
        if (event instanceof UserStartWatchingEvent) {
            this.stateLogic.upsertWatcher((UserStartWatchingEvent) event);
            return;
        }
        if (event instanceof UserStopWatchingEvent) {
            this.stateLogic.deleteWatcher((UserStopWatchingEvent) event);
            return;
        }
        if (event instanceof ChannelUpdatedEvent) {
            this.stateLogic.updateChannelData((HasChannel) event);
            return;
        }
        if (event instanceof ChannelUpdatedByUserEvent) {
            this.stateLogic.updateChannelData((HasChannel) event);
            return;
        }
        if (event instanceof ChannelHiddenEvent) {
            this.stateLogic.setHidden(true);
            ChannelHiddenEvent channelHiddenEvent = (ChannelHiddenEvent) event;
            if (channelHiddenEvent.getClearHistory()) {
                ChannelStateLogic.removeMessagesBefore$default(this.stateLogic, channelHiddenEvent.getCreatedAt(), null, 2, null);
                return;
            }
            return;
        }
        if (event instanceof ChannelVisibleEvent) {
            this.stateLogic.setHidden(false);
            return;
        }
        if (event instanceof ChannelDeletedEvent) {
            ChannelDeletedEvent channelDeletedEvent = (ChannelDeletedEvent) event;
            ChannelStateLogic.removeMessagesBefore$default(this.stateLogic, channelDeletedEvent.getCreatedAt(), null, 2, null);
            this.stateLogic.deleteChannel(channelDeletedEvent.getCreatedAt());
            return;
        }
        if (event instanceof ChannelTruncatedEvent) {
            ChannelTruncatedEvent channelTruncatedEvent = (ChannelTruncatedEvent) event;
            this.stateLogic.removeMessagesBefore(channelTruncatedEvent.getCreatedAt(), channelTruncatedEvent.getMessage());
            this.stateLogic.updateChannelData((HasChannel) event);
            return;
        }
        if (event instanceof NotificationChannelTruncatedEvent) {
            ChannelStateLogic.removeMessagesBefore$default(this.stateLogic, ((NotificationChannelTruncatedEvent) event).getCreatedAt(), null, 2, null);
            this.stateLogic.updateChannelData((HasChannel) event);
            return;
        }
        if (event instanceof TypingStartEvent) {
            TypingStartEvent typingStartEvent = (TypingStartEvent) event;
            this.stateLogic.setTyping(typingStartEvent.getUser().getId(), typingStartEvent);
            return;
        }
        if (event instanceof TypingStopEvent) {
            this.stateLogic.setTyping(((TypingStopEvent) event).getUser().getId(), null);
            return;
        }
        if (event instanceof MessageReadEvent) {
            MessageReadEvent messageReadEvent = (MessageReadEvent) event;
            if (messageReadEvent.getThread() == null) {
                this.stateLogic.updateRead(ChatEventUtilsKt.toChannelUserRead(messageReadEvent));
                return;
            }
            return;
        }
        if (event instanceof NotificationMarkReadEvent) {
            NotificationMarkReadEvent notificationMarkReadEvent = (NotificationMarkReadEvent) event;
            if (notificationMarkReadEvent.getThread() == null) {
                this.stateLogic.updateRead(ChatEventUtilsKt.toChannelUserRead(notificationMarkReadEvent));
                return;
            }
            return;
        }
        if (event instanceof NotificationMarkUnreadEvent) {
            this.stateLogic.updateRead(ChatEventUtilsKt.toChannelUserRead((NotificationMarkUnreadEvent) event));
            return;
        }
        if (event instanceof MessageDeliveredEvent) {
            this.stateLogic.updateDelivered(ChatEventUtilsKt.toChannelUserRead((MessageDeliveredEvent) event));
            return;
        }
        if (event instanceof NotificationInviteAcceptedEvent) {
            this.stateLogic.addMember(((NotificationInviteAcceptedEvent) event).getMember());
            this.stateLogic.updateChannelData((HasChannel) event);
            return;
        }
        if (event instanceof NotificationInviteRejectedEvent) {
            this.stateLogic.deleteMember(((NotificationInviteRejectedEvent) event).getMember());
            this.stateLogic.updateChannelData((HasChannel) event);
            return;
        }
        if (event instanceof ChannelUserBannedEvent) {
            ChannelUserBannedEvent channelUserBannedEvent = (ChannelUserBannedEvent) event;
            this.stateLogic.updateMemberBanned(channelUserBannedEvent.getUser().getId(), true, channelUserBannedEvent.getExpiration(), channelUserBannedEvent.getShadow());
            return;
        }
        if (event instanceof ChannelUserUnbannedEvent) {
            this.stateLogic.updateMemberBanned(((ChannelUserUnbannedEvent) event).getUser().getId(), false, null, false);
            return;
        }
        if (event instanceof PollClosedEvent) {
            this.stateLogic.upsertPoll(PollKt.processPoll((PollClosedEvent) event, new C193033(this.stateLogic)));
            return;
        }
        if (event instanceof PollUpdatedEvent) {
            this.stateLogic.upsertPoll(PollKt.processPoll((PollUpdatedEvent) event, new C193044(this.stateLogic)));
            return;
        }
        if (event instanceof PollDeletedEvent) {
            this.stateLogic.deletePoll(((PollDeletedEvent) event).getPoll());
            return;
        }
        if (event instanceof VoteCastedEvent) {
            this.stateLogic.upsertPoll(PollKt.processPoll((VoteCastedEvent) event, (String) this.getCurrentUserId.invoke(), new C193055(this.stateLogic)));
            return;
        }
        if (event instanceof VoteChangedEvent) {
            this.stateLogic.upsertPoll(PollKt.processPoll((VoteChangedEvent) event, (String) this.getCurrentUserId.invoke(), new C193066(this.stateLogic)));
            return;
        }
        if (event instanceof VoteRemovedEvent) {
            this.stateLogic.upsertPoll(PollKt.processPoll((VoteRemovedEvent) event, new C193077(this.stateLogic)));
            return;
        }
        if (event instanceof AnswerCastedEvent) {
            this.stateLogic.upsertPoll(PollKt.processPoll((AnswerCastedEvent) event, new C193088(this.stateLogic)));
            return;
        }
        if (event instanceof ReminderCreatedEvent) {
            ReminderCreatedEvent reminderCreatedEvent = (ReminderCreatedEvent) event;
            updateReminder(reminderCreatedEvent.getMessageId(), reminderCreatedEvent.getReminder());
        } else if (event instanceof ReminderUpdatedEvent) {
            ReminderUpdatedEvent reminderUpdatedEvent = (ReminderUpdatedEvent) event;
            updateReminder(reminderUpdatedEvent.getMessageId(), reminderUpdatedEvent.getReminder());
        } else if (event instanceof ReminderDeletedEvent) {
            deleteReminder(((ReminderDeletedEvent) event).getMessageId());
        }
    }

    private final void updateReminder(String messageId, MessageReminder reminder) {
        Message messageById = this.stateLogic.getMutableState().getMessageById(messageId);
        if (messageById == null) {
            return;
        }
        upsertMessage$default(this, messageById.copy(((-1) & 1) != 0 ? messageById.id : null, ((-1) & 2) != 0 ? messageById.cid : null, ((-1) & 4) != 0 ? messageById.text : null, ((-1) & 8) != 0 ? messageById.html : null, ((-1) & 16) != 0 ? messageById.parentId : null, ((-1) & 32) != 0 ? messageById.command : null, ((-1) & 64) != 0 ? messageById.attachments : null, ((-1) & 128) != 0 ? messageById.mentionedUsersIds : null, ((-1) & 256) != 0 ? messageById.mentionedUsers : null, ((-1) & 512) != 0 ? messageById.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageById.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageById.reactionCounts : null, ((-1) & 4096) != 0 ? messageById.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageById.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageById.syncStatus : null, ((-1) & 32768) != 0 ? messageById.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageById.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageById.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageById.createdAt : null, ((-1) & 524288) != 0 ? messageById.updatedAt : null, ((-1) & 1048576) != 0 ? messageById.deletedAt : null, ((-1) & 2097152) != 0 ? messageById.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? messageById.createdLocallyAt : null, ((-1) & 8388608) != 0 ? messageById.user : null, ((-1) & 16777216) != 0 ? messageById.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageById.silent : false, ((-1) & 67108864) != 0 ? messageById.shadowed : false, ((-1) & 134217728) != 0 ? messageById.i18n : null, ((-1) & 268435456) != 0 ? messageById.showInChannel : false, ((-1) & 536870912) != 0 ? messageById.channelInfo : null, ((-1) & 1073741824) != 0 ? messageById.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? messageById.replyMessageId : null, (65535 & 1) != 0 ? messageById.pinned : false, (65535 & 2) != 0 ? messageById.pinnedAt : null, (65535 & 4) != 0 ? messageById.pinExpires : null, (65535 & 8) != 0 ? messageById.pinnedBy : null, (65535 & 16) != 0 ? messageById.threadParticipants : null, (65535 & 32) != 0 ? messageById.skipPushNotification : false, (65535 & 64) != 0 ? messageById.skipEnrichUrl : false, (65535 & 128) != 0 ? messageById.moderationDetails : null, (65535 & 256) != 0 ? messageById.moderation : null, (65535 & 512) != 0 ? messageById.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageById.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageById.restrictedVisibility : null, (65535 & 4096) != 0 ? messageById.reminder : MessageReminderKt.toMessageReminderInfo(reminder), (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageById.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageById.channelRole : null, (65535 & 32768) != 0 ? messageById.deletedForMe : false), false, 2, null);
    }

    private final void upsertMessage(Message message, boolean preserveCreatedLocallyAt) {
        Date createdLocallyAt;
        List<Reaction> ownReactions;
        Message message2 = getMessage(message.getId());
        if (preserveCreatedLocallyAt) {
            createdLocallyAt = message2 != null ? message2.getCreatedLocallyAt() : null;
        } else {
            createdLocallyAt = message.getCreatedLocallyAt();
        }
        Date date = createdLocallyAt;
        if (message2 == null || (ownReactions = message2.getOwnReactions()) == null) {
            ownReactions = message.getOwnReactions();
        }
        Message messageCopy = message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : ownReactions, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : date, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
        this.stateLogic.upsertMessage(messageCopy);
        this.stateLogic.delsertPinnedMessage(messageCopy);
    }

    public static /* synthetic */ void upsertMessage$default(ChannelEventHandlerLegacyImpl channelEventHandlerLegacyImpl, Message message, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        channelEventHandlerLegacyImpl.upsertMessage(message, z4);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelEventHandler
    public final void handle(ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof CidEvent) {
            handleCidEvent((CidEvent) event);
            return;
        }
        if (event instanceof UserPresenceChangedEvent) {
            this.stateLogic.upsertUserPresence(((UserPresenceChangedEvent) event).getUser());
            return;
        }
        if (event instanceof UserUpdatedEvent) {
            this.stateLogic.upsertUserPresence(((UserUpdatedEvent) event).getUser());
            return;
        }
        if (event instanceof MarkAllReadEvent) {
            this.stateLogic.updateRead(ChatEventUtilsKt.toChannelUserRead((MarkAllReadEvent) event));
            return;
        }
        if (!(event instanceof NotificationChannelMutesUpdatedEvent)) {
            if (event instanceof UserMessagesDeletedEvent) {
                UserMessagesDeletedEvent userMessagesDeletedEvent = (UserMessagesDeletedEvent) event;
                this.stateLogic.deleteMessagesFromUser(userMessagesDeletedEvent.getUser().getId(), userMessagesDeletedEvent.getHardDelete(), userMessagesDeletedEvent.getCreatedAt());
                return;
            }
            return;
        }
        List<ChannelMute> channelMutes = ((NotificationChannelMutesUpdatedEvent) event).getMe().getChannelMutes();
        boolean z4 = false;
        if (!(channelMutes instanceof Collection) || !channelMutes.isEmpty()) {
            Iterator<T> it = channelMutes.iterator();
            while (it.hasNext()) {
                Channel channel = ((ChannelMute) it.next()).getChannel();
                if (AbstractC22676k.m65745e(channel != null ? channel.getCid() : null, this.cid)) {
                    z4 = true;
                    break;
                }
            }
        }
        this.stateLogic.updateMute(z4);
    }
}
