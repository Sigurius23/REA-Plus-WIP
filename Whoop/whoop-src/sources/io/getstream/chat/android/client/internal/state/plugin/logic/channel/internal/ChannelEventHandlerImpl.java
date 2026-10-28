package io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.C19383k;
import io.getstream.chat.android.client.api.state.C19031a;
import io.getstream.chat.android.client.api2.C19054d;
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
import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.client.extensions.internal.MessageReminderKt;
import io.getstream.chat.android.client.extensions.internal.PollKt;
import io.getstream.chat.android.client.internal.state.event.handler.internal.utils.ChatEventUtilsKt;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl;
import io.getstream.chat.android.client.internal.state.plugin.state.global.internal.MutableGlobalState;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelMute;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.MessageReminder;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.TypingEvent;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p708hb2.C17095c;
import p708hb2.C17098f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandler;", "", "cid", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;", "state", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "globalState", "Lbc3/c0;", "coroutineScope", "Lkotlin/Function0;", "getCurrentUserId", "", "now", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lbc3/c0;Lc93/a;Lc93/a;)V", "Lio/getstream/chat/android/client/events/CidEvent;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "handleCidEvent", "(Lio/getstream/chat/android/client/events/CidEvent;)V", "messageId", "Lio/getstream/chat/android/models/MessageReminder;", NotificationCompat.CATEGORY_REMINDER, "updateReminder", "(Ljava/lang/String;Lio/getstream/chat/android/models/MessageReminder;)V", "deleteReminder", "(Ljava/lang/String;)V", "Lio/getstream/chat/android/models/Message;", "message", "updateMessageWithReaction", "(Lio/getstream/chat/android/models/Message;)V", "enrichWithOwnReactions", "(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;", "Lio/getstream/chat/android/client/events/ChatEvent;", "handle", "(Lio/getstream/chat/android/client/events/ChatEvent;)V", "Ljava/lang/String;", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "Lbc3/c0;", "Lc93/a;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;", "typingEventPruner", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelEventHandlerImpl implements ChannelEventHandler {
    private final String cid;
    private final InterfaceC2994c0 coroutineScope;
    private final InterfaceC4339a getCurrentUserId;
    private final MutableGlobalState globalState;
    private final InterfaceC4339a now;
    private final ChannelStateImpl state;
    private final TypingEventPruner typingEventPruner;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelEventHandlerImpl$handleCidEvent$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C192913 extends C22672i implements Function1 {
        public C192913(Object obj) {
            super(1, 0, ChannelStateImpl.class, obj, "getPoll", "getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Poll invoke(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((ChannelStateImpl) this.receiver).getPoll(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelEventHandlerImpl$handleCidEvent$4 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C192924 extends C22672i implements Function1 {
        public C192924(Object obj) {
            super(1, 0, ChannelStateImpl.class, obj, "getPoll", "getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Poll invoke(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((ChannelStateImpl) this.receiver).getPoll(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelEventHandlerImpl$handleCidEvent$5 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C192935 extends C22672i implements Function1 {
        public C192935(Object obj) {
            super(1, 0, ChannelStateImpl.class, obj, "getPoll", "getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Poll invoke(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((ChannelStateImpl) this.receiver).getPoll(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelEventHandlerImpl$handleCidEvent$6 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C192946 extends C22672i implements Function1 {
        public C192946(Object obj) {
            super(1, 0, ChannelStateImpl.class, obj, "getPoll", "getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Poll invoke(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((ChannelStateImpl) this.receiver).getPoll(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelEventHandlerImpl$handleCidEvent$7 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C192957 extends C22672i implements Function1 {
        public C192957(Object obj) {
            super(1, 0, ChannelStateImpl.class, obj, "getPoll", "getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Poll invoke(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((ChannelStateImpl) this.receiver).getPoll(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelEventHandlerImpl$handleCidEvent$8 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C192968 extends C22672i implements Function1 {
        public C192968(Object obj) {
            super(1, 0, ChannelStateImpl.class, obj, "getPoll", "getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Poll invoke(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((ChannelStateImpl) this.receiver).getPoll(p13);
        }
    }

    public ChannelEventHandlerImpl(String cid, ChannelStateImpl state, MutableGlobalState globalState, InterfaceC2994c0 coroutineScope, InterfaceC4339a getCurrentUserId, InterfaceC4339a now) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(globalState, "globalState");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(getCurrentUserId, "getCurrentUserId");
        AbstractC22676k.m65750j(now, "now");
        this.cid = cid;
        this.state = state;
        this.globalState = globalState;
        this.coroutineScope = coroutineScope;
        this.getCurrentUserId = getCurrentUserId;
        this.now = now;
        this.typingEventPruner = new TypingEventPruner((String) StringExtensionsKt.cidToTypeAndId(cid).f92938x, coroutineScope, 0L, new C17098f(this, 13), 4, null);
    }

    private final void deleteReminder(String messageId) {
        this.state.updateMessageById(messageId, new C19031a(22));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message deleteReminder$lambda$5(Message message) {
        AbstractC22676k.m65750j(message, "message");
        return message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
    }

    private final Message enrichWithOwnReactions(Message message) {
        Message messageById = this.state.getMessageById(message.getId());
        return messageById == null ? message : message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : messageById.getOwnReactions(), ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v1, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r48v0 */
    /* JADX WARN: Type inference failed for: r48v1, types: [io.getstream.chat.android.models.Poll] */
    /* JADX WARN: Type inference failed for: r48v2 */
    /* JADX WARN: Type inference failed for: r58v0, types: [io.getstream.chat.android.client.events.CidEvent] */
    private final void handleCidEvent(CidEvent event) {
        ?? poll;
        List<Reaction> ownReactions;
        Date pinExpires;
        Message message;
        Date pinExpires2;
        if (event instanceof NewMessageEvent) {
            NewMessageEvent newMessageEvent = (NewMessageEvent) event;
            if (AbstractC22676k.m65745e(newMessageEvent.getMessage().getUser().getId(), this.getCurrentUserId.invoke())) {
                Message messageById = this.state.getMessageById(newMessageEvent.getMessage().getId());
                Message message2 = newMessageEvent.getMessage();
                message = message2.copy(((-1) & 1) != 0 ? message2.id : null, ((-1) & 2) != 0 ? message2.cid : null, ((-1) & 4) != 0 ? message2.text : null, ((-1) & 8) != 0 ? message2.html : null, ((-1) & 16) != 0 ? message2.parentId : null, ((-1) & 32) != 0 ? message2.command : null, ((-1) & 64) != 0 ? message2.attachments : null, ((-1) & 128) != 0 ? message2.mentionedUsersIds : null, ((-1) & 256) != 0 ? message2.mentionedUsers : null, ((-1) & 512) != 0 ? message2.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.reactionCounts : null, ((-1) & 4096) != 0 ? message2.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.syncStatus : null, ((-1) & 32768) != 0 ? message2.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message2.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message2.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message2.createdAt : null, ((-1) & 524288) != 0 ? message2.updatedAt : null, ((-1) & 1048576) != 0 ? message2.deletedAt : null, ((-1) & 2097152) != 0 ? message2.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message2.createdLocallyAt : messageById != null ? messageById.getCreatedLocallyAt() : null, ((-1) & 8388608) != 0 ? message2.user : null, ((-1) & 16777216) != 0 ? message2.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message2.silent : false, ((-1) & 67108864) != 0 ? message2.shadowed : false, ((-1) & 134217728) != 0 ? message2.i18n : null, ((-1) & 268435456) != 0 ? message2.showInChannel : false, ((-1) & 536870912) != 0 ? message2.channelInfo : null, ((-1) & 1073741824) != 0 ? message2.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message2.replyMessageId : null, (65535 & 1) != 0 ? message2.pinned : false, (65535 & 2) != 0 ? message2.pinnedAt : null, (65535 & 4) != 0 ? message2.pinExpires : null, (65535 & 8) != 0 ? message2.pinnedBy : null, (65535 & 16) != 0 ? message2.threadParticipants : null, (65535 & 32) != 0 ? message2.skipPushNotification : false, (65535 & 64) != 0 ? message2.skipEnrichUrl : false, (65535 & 128) != 0 ? message2.moderationDetails : null, (65535 & 256) != 0 ? message2.moderation : null, (65535 & 512) != 0 ? message2.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.restrictedVisibility : null, (65535 & 4096) != 0 ? message2.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.channelRole : null, (65535 & 32768) != 0 ? message2.deletedForMe : false);
            } else {
                message = newMessageEvent.getMessage();
            }
            this.state.updateCurrentUserRead(newMessageEvent.getCreatedAt(), message);
            if (!message.getShadowed()) {
                this.state.setHidden(false);
            }
            Integer channelMessageCount = newMessageEvent.getChannelMessageCount();
            if (channelMessageCount != null) {
                this.state.setMessageCount(channelMessageCount.intValue());
            }
            this.state.updateLastMessageAt(message);
            if (((Boolean) this.state.getInsideSearch().getValue()).booleanValue()) {
                this.state.upsertCachedMessage(message);
            } else {
                this.state.upsertMessage(message);
                this.state.trimOldestMessages();
            }
            InterfaceC4339a interfaceC4339a = this.now;
            if (message.getPinned() && !MessageUtils.isDeleted(message) && ((pinExpires2 = message.getPinExpires()) == null || pinExpires2.getTime() >= ((Number) interfaceC4339a.invoke()).longValue())) {
                this.state.addPinnedMessage(message);
            }
            this.state.removePendingMessage(message.getId());
            return;
        }
        if (event instanceof NotificationMessageNewEvent) {
            NotificationMessageNewEvent notificationMessageNewEvent = (NotificationMessageNewEvent) event;
            this.state.updateCurrentUserRead(notificationMessageNewEvent.getCreatedAt(), notificationMessageNewEvent.getMessage());
            if (!notificationMessageNewEvent.getMessage().getShadowed()) {
                this.state.setHidden(false);
            }
            this.state.updateLastMessageAt(notificationMessageNewEvent.getMessage());
            if (((Boolean) this.state.getInsideSearch().getValue()).booleanValue()) {
                this.state.upsertCachedMessage(notificationMessageNewEvent.getMessage());
            } else {
                this.state.upsertMessage(notificationMessageNewEvent.getMessage());
                this.state.trimOldestMessages();
            }
            Message message3 = notificationMessageNewEvent.getMessage();
            InterfaceC4339a interfaceC4339a2 = this.now;
            if (!message3.getPinned() || MessageUtils.isDeleted(message3)) {
                return;
            }
            Date pinExpires3 = message3.getPinExpires();
            if (pinExpires3 == null || pinExpires3.getTime() >= ((Number) interfaceC4339a2.invoke()).longValue()) {
                this.state.addPinnedMessage(notificationMessageNewEvent.getMessage());
                return;
            }
            return;
        }
        if (event instanceof MessageUpdatedEvent) {
            MessageUpdatedEvent messageUpdatedEvent = (MessageUpdatedEvent) event;
            Message messageById2 = this.state.getMessageById(messageUpdatedEvent.getMessage().getId());
            Message message4 = messageUpdatedEvent.getMessage();
            Poll poll2 = messageUpdatedEvent.getMessage().getPoll();
            if (poll2 == null) {
                poll = messageById2 != null ? messageById2.getPoll() : null;
            } else {
                poll = poll2;
            }
            if (messageById2 == null || (ownReactions = messageById2.getOwnReactions()) == null) {
                ownReactions = messageUpdatedEvent.getMessage().getOwnReactions();
            }
            Message messageCopy = message4.copy(((-1) & 1) != 0 ? message4.id : null, ((-1) & 2) != 0 ? message4.cid : null, ((-1) & 4) != 0 ? message4.text : null, ((-1) & 8) != 0 ? message4.html : null, ((-1) & 16) != 0 ? message4.parentId : null, ((-1) & 32) != 0 ? message4.command : null, ((-1) & 64) != 0 ? message4.attachments : null, ((-1) & 128) != 0 ? message4.mentionedUsersIds : null, ((-1) & 256) != 0 ? message4.mentionedUsers : null, ((-1) & 512) != 0 ? message4.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message4.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message4.reactionCounts : null, ((-1) & 4096) != 0 ? message4.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message4.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message4.syncStatus : null, ((-1) & 32768) != 0 ? message4.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message4.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message4.ownReactions : ownReactions, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message4.createdAt : null, ((-1) & 524288) != 0 ? message4.updatedAt : null, ((-1) & 1048576) != 0 ? message4.deletedAt : null, ((-1) & 2097152) != 0 ? message4.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message4.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message4.user : null, ((-1) & 16777216) != 0 ? message4.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message4.silent : false, ((-1) & 67108864) != 0 ? message4.shadowed : false, ((-1) & 134217728) != 0 ? message4.i18n : null, ((-1) & 268435456) != 0 ? message4.showInChannel : false, ((-1) & 536870912) != 0 ? message4.channelInfo : null, ((-1) & 1073741824) != 0 ? message4.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message4.replyMessageId : null, (65535 & 1) != 0 ? message4.pinned : false, (65535 & 2) != 0 ? message4.pinnedAt : null, (65535 & 4) != 0 ? message4.pinExpires : null, (65535 & 8) != 0 ? message4.pinnedBy : null, (65535 & 16) != 0 ? message4.threadParticipants : null, (65535 & 32) != 0 ? message4.skipPushNotification : false, (65535 & 64) != 0 ? message4.skipEnrichUrl : false, (65535 & 128) != 0 ? message4.moderationDetails : null, (65535 & 256) != 0 ? message4.moderation : null, (65535 & 512) != 0 ? message4.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message4.poll : poll, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message4.restrictedVisibility : null, (65535 & 4096) != 0 ? message4.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message4.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message4.channelRole : null, (65535 & 32768) != 0 ? message4.deletedForMe : false);
            this.state.updateMessage(messageCopy);
            this.state.updateQuotedMessageReferences(messageCopy);
            Message message5 = messageUpdatedEvent.getMessage();
            InterfaceC4339a interfaceC4339a3 = this.now;
            if (!message5.getPinned() || MessageUtils.isDeleted(message5) || ((pinExpires = message5.getPinExpires()) != null && pinExpires.getTime() < ((Number) interfaceC4339a3.invoke()).longValue())) {
                this.state.deletePinnedMessage(messageUpdatedEvent.getMessage().getId());
                return;
            } else {
                this.state.addPinnedMessage(messageCopy);
                return;
            }
        }
        if (event instanceof MessageDeletedEvent) {
            MessageDeletedEvent messageDeletedEvent = (MessageDeletedEvent) event;
            if (messageDeletedEvent.getHardDelete()) {
                this.state.deleteMessage(messageDeletedEvent.getMessage().getId());
                this.state.deleteQuotedMessageReferences(messageDeletedEvent.getMessage().getId());
            } else {
                Message messageEnrichWithOwnReactions = enrichWithOwnReactions(messageDeletedEvent.getMessage());
                this.state.updateMessage(messageEnrichWithOwnReactions);
                this.state.updateQuotedMessageReferences(messageEnrichWithOwnReactions);
            }
            Integer channelMessageCount2 = messageDeletedEvent.getChannelMessageCount();
            if (channelMessageCount2 != null) {
                this.state.setMessageCount(channelMessageCount2.intValue());
            }
            if (messageDeletedEvent.getMessage().getPinned()) {
                this.state.deletePinnedMessage(messageDeletedEvent.getMessage().getId());
            }
            this.state.removePendingMessage(messageDeletedEvent.getMessage().getId());
            return;
        }
        if (event instanceof NotificationThreadMessageNewEvent) {
            NotificationThreadMessageNewEvent notificationThreadMessageNewEvent = (NotificationThreadMessageNewEvent) event;
            if (notificationThreadMessageNewEvent.getMessage().getShowInChannel()) {
                if (!notificationThreadMessageNewEvent.getMessage().getShadowed()) {
                    this.state.setHidden(false);
                }
                if (((Boolean) this.state.getInsideSearch().getValue()).booleanValue()) {
                    this.state.upsertCachedMessage(notificationThreadMessageNewEvent.getMessage());
                    return;
                } else {
                    this.state.upsertMessage(notificationThreadMessageNewEvent.getMessage());
                    this.state.trimOldestMessages();
                    return;
                }
            }
            return;
        }
        if (event instanceof ReactionNewEvent) {
            updateMessageWithReaction(((ReactionNewEvent) event).getMessage());
            return;
        }
        if (event instanceof ReactionUpdateEvent) {
            updateMessageWithReaction(((ReactionUpdateEvent) event).getMessage());
            return;
        }
        if (event instanceof ReactionDeletedEvent) {
            updateMessageWithReaction(((ReactionDeletedEvent) event).getMessage());
            return;
        }
        if (event instanceof MemberAddedEvent) {
            MemberAddedEvent memberAddedEvent = (MemberAddedEvent) event;
            this.state.addMember(memberAddedEvent);
            if (AbstractC22676k.m65745e(memberAddedEvent.getMember().getUserId(), this.getCurrentUserId.invoke())) {
                this.state.setMembership(memberAddedEvent.getMember());
                return;
            }
            return;
        }
        if (event instanceof MemberUpdatedEvent) {
            MemberUpdatedEvent memberUpdatedEvent = (MemberUpdatedEvent) event;
            this.state.upsertMember(memberUpdatedEvent.getMember());
            if (AbstractC22676k.m65745e(memberUpdatedEvent.getMember().getUserId(), this.getCurrentUserId.invoke())) {
                this.state.setMembership(memberUpdatedEvent.getMember());
                return;
            }
            return;
        }
        if (event instanceof MemberRemovedEvent) {
            MemberRemovedEvent memberRemovedEvent = (MemberRemovedEvent) event;
            this.state.removeMember(memberRemovedEvent);
            if (AbstractC22676k.m65745e(memberRemovedEvent.getMember().getUserId(), this.getCurrentUserId.invoke())) {
                this.state.deleteMembership();
                return;
            }
            return;
        }
        if (event instanceof NotificationAddedToChannelEvent) {
            this.state.upsertMembers(((NotificationAddedToChannelEvent) event).getChannel().getMembers());
            return;
        }
        if (event instanceof NotificationRemovedFromChannelEvent) {
            NotificationRemovedFromChannelEvent notificationRemovedFromChannelEvent = (NotificationRemovedFromChannelEvent) event;
            this.state.setMemberCount(notificationRemovedFromChannelEvent.getChannel().getMemberCount());
            this.state.setMembers(notificationRemovedFromChannelEvent.getChannel().getMembers());
            this.state.setWatchers(notificationRemovedFromChannelEvent.getChannel().getWatchers(), notificationRemovedFromChannelEvent.getChannel().getWatcherCount());
            return;
        }
        if (event instanceof UserStartWatchingEvent) {
            this.state.addWatcher((UserStartWatchingEvent) event);
            return;
        }
        if (event instanceof UserStopWatchingEvent) {
            this.state.removeWatcher((UserStopWatchingEvent) event);
            return;
        }
        if (event instanceof ChannelUpdatedEvent) {
            this.state.updateChannelData((HasChannel) event);
            return;
        }
        if (event instanceof ChannelUpdatedByUserEvent) {
            this.state.updateChannelData((HasChannel) event);
            return;
        }
        if (event instanceof ChannelHiddenEvent) {
            this.state.setHidden(true);
            ChannelHiddenEvent channelHiddenEvent = (ChannelHiddenEvent) event;
            if (channelHiddenEvent.getClearHistory()) {
                ChannelStateImpl.removeMessagesBefore$default(this.state, channelHiddenEvent.getCreatedAt(), null, 2, null);
                return;
            }
            return;
        }
        if (event instanceof ChannelVisibleEvent) {
            this.state.setHidden(false);
            return;
        }
        if (event instanceof ChannelDeletedEvent) {
            ChannelDeletedEvent channelDeletedEvent = (ChannelDeletedEvent) event;
            ChannelStateImpl.removeMessagesBefore$default(this.state, channelDeletedEvent.getCreatedAt(), null, 2, null);
            this.state.deleteChannel(channelDeletedEvent.getCreatedAt());
            return;
        }
        if (event instanceof ChannelTruncatedEvent) {
            ChannelTruncatedEvent channelTruncatedEvent = (ChannelTruncatedEvent) event;
            this.state.removeMessagesBefore(channelTruncatedEvent.getCreatedAt(), channelTruncatedEvent.getMessage());
            this.state.updateChannelData((HasChannel) event);
            return;
        }
        if (event instanceof NotificationChannelTruncatedEvent) {
            ChannelStateImpl.removeMessagesBefore$default(this.state, ((NotificationChannelTruncatedEvent) event).getCreatedAt(), null, 2, null);
            this.state.updateChannelData((HasChannel) event);
            return;
        }
        if (event instanceof TypingStartEvent) {
            TypingStartEvent typingStartEvent = (TypingStartEvent) event;
            if (AbstractC22676k.m65745e(typingStartEvent.getUser().getId(), this.getCurrentUserId.invoke())) {
                return;
            }
            this.typingEventPruner.processEvent(typingStartEvent.getUser().getId(), typingStartEvent);
            return;
        }
        if (event instanceof TypingStopEvent) {
            TypingStopEvent typingStopEvent = (TypingStopEvent) event;
            if (AbstractC22676k.m65745e(typingStopEvent.getUser().getId(), this.getCurrentUserId.invoke())) {
                return;
            }
            this.typingEventPruner.processEvent(typingStopEvent.getUser().getId(), null);
            return;
        }
        if (event instanceof MessageReadEvent) {
            MessageReadEvent messageReadEvent = (MessageReadEvent) event;
            if (messageReadEvent.getThread() == null) {
                this.state.updateRead(ChatEventUtilsKt.toChannelUserRead(messageReadEvent));
                return;
            }
            return;
        }
        if (event instanceof NotificationMarkReadEvent) {
            NotificationMarkReadEvent notificationMarkReadEvent = (NotificationMarkReadEvent) event;
            if (notificationMarkReadEvent.getThread() == null) {
                this.state.updateRead(ChatEventUtilsKt.toChannelUserRead(notificationMarkReadEvent));
                return;
            }
            return;
        }
        if (event instanceof NotificationMarkUnreadEvent) {
            this.state.updateRead(ChatEventUtilsKt.toChannelUserRead((NotificationMarkUnreadEvent) event));
            return;
        }
        if (event instanceof MessageDeliveredEvent) {
            this.state.updateDelivered(ChatEventUtilsKt.toChannelUserRead((MessageDeliveredEvent) event));
            return;
        }
        if (event instanceof NotificationInviteAcceptedEvent) {
            this.state.upsertMember(((NotificationInviteAcceptedEvent) event).getMember());
            this.state.updateChannelData((HasChannel) event);
            return;
        }
        if (event instanceof NotificationInviteRejectedEvent) {
            this.state.removeMember((NotificationInviteRejectedEvent) event);
            this.state.updateChannelData((HasChannel) event);
            return;
        }
        if (event instanceof ChannelUserBannedEvent) {
            ChannelUserBannedEvent channelUserBannedEvent = (ChannelUserBannedEvent) event;
            this.state.updateMemberBan(channelUserBannedEvent.getUser().getId(), true, channelUserBannedEvent.getExpiration(), channelUserBannedEvent.getShadow());
            return;
        }
        if (event instanceof ChannelUserUnbannedEvent) {
            this.state.updateMemberBan(((ChannelUserUnbannedEvent) event).getUser().getId(), false, null, false);
            return;
        }
        if (event instanceof PollClosedEvent) {
            this.state.upsertPoll(PollKt.processPoll((PollClosedEvent) event, new C192913(this.state)));
            return;
        }
        if (event instanceof PollUpdatedEvent) {
            this.state.upsertPoll(PollKt.processPoll((PollUpdatedEvent) event, new C192924(this.state)));
            return;
        }
        if (event instanceof PollDeletedEvent) {
            this.state.deletePoll(((PollDeletedEvent) event).getPoll());
            return;
        }
        if (event instanceof VoteCastedEvent) {
            this.state.upsertPoll(PollKt.processPoll((VoteCastedEvent) event, (String) this.getCurrentUserId.invoke(), new C192935(this.state)));
            return;
        }
        if (event instanceof VoteChangedEvent) {
            this.state.upsertPoll(PollKt.processPoll((VoteChangedEvent) event, (String) this.getCurrentUserId.invoke(), new C192946(this.state)));
            return;
        }
        if (event instanceof VoteRemovedEvent) {
            this.state.upsertPoll(PollKt.processPoll((VoteRemovedEvent) event, new C192957(this.state)));
            return;
        }
        if (event instanceof AnswerCastedEvent) {
            this.state.upsertPoll(PollKt.processPoll((AnswerCastedEvent) event, new C192968(this.state)));
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 typingEventPruner$lambda$1(ChannelEventHandlerImpl channelEventHandlerImpl, Map map, TypingEvent typingEvent) {
        AbstractC22676k.m65750j(map, "<unused var>");
        AbstractC22676k.m65750j(typingEvent, "typingEvent");
        channelEventHandlerImpl.state.setTyping(typingEvent);
        channelEventHandlerImpl.globalState.tryEmitTypingEvent(channelEventHandlerImpl.cid, typingEvent);
        return C23454a0.f92919a;
    }

    private final void updateMessageWithReaction(Message message) {
        this.state.updateMessageFromEvent(message, new C19054d(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message updateMessageWithReaction$lambda$6(Message old, Message message) {
        AbstractC22676k.m65750j(old, "old");
        AbstractC22676k.m65750j(message, "new");
        return message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : old.getOwnReactions(), ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
    }

    private final void updateReminder(String messageId, MessageReminder reminder) {
        this.state.updateMessageById(messageId, new C17095c(reminder, 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message updateReminder$lambda$4(MessageReminder messageReminder, Message message) {
        AbstractC22676k.m65750j(message, "message");
        return message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : MessageReminderKt.toMessageReminderInfo(messageReminder), (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelEventHandler
    public final void handle(ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof CidEvent) {
            handleCidEvent((CidEvent) event);
            return;
        }
        if (event instanceof UserPresenceChangedEvent) {
            this.state.upsertUserPresence(((UserPresenceChangedEvent) event).getUser());
            return;
        }
        if (event instanceof UserUpdatedEvent) {
            this.state.upsertUserPresence(((UserUpdatedEvent) event).getUser());
            return;
        }
        if (event instanceof MarkAllReadEvent) {
            this.state.updateRead(ChatEventUtilsKt.toChannelUserRead((MarkAllReadEvent) event));
            return;
        }
        if (!(event instanceof NotificationChannelMutesUpdatedEvent)) {
            if (event instanceof UserMessagesDeletedEvent) {
                UserMessagesDeletedEvent userMessagesDeletedEvent = (UserMessagesDeletedEvent) event;
                this.state.deleteMessagesFromUser(userMessagesDeletedEvent.getUser().getId(), userMessagesDeletedEvent.getHardDelete(), userMessagesDeletedEvent.getCreatedAt());
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
        this.state.setMuted(z4);
    }

    public /* synthetic */ ChannelEventHandlerImpl(String str, ChannelStateImpl channelStateImpl, MutableGlobalState mutableGlobalState, InterfaceC2994c0 interfaceC2994c0, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, channelStateImpl, mutableGlobalState, interfaceC2994c0, interfaceC4339a, (i13 & 32) != 0 ? new C19383k(5) : interfaceC4339a2);
    }
}
