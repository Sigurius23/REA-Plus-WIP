package io.getstream.chat.android.client.internal.state.plugin.listener.internal;

import androidx.profileinstaller.ProfileVerifier;
import io.getstream.chat.android.client.errors.ChatErrorKt;
import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.client.extensions.internal.MessageReactionsKt;
import io.getstream.chat.android.client.extensions.internal.ReactionKt;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.thread.internal.ThreadLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsLogic;
import io.getstream.chat.android.client.plugin.listeners.SendReactionListener;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.SyncStatus;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25267u;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26203f;
import n23.C26204g;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0012\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\n*\u00020\n2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\u001c\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ@\u0010\u001e\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ2\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u00162\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006$"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;", "Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logic", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;)V", "", "cid", "Lio/getstream/chat/android/models/Reaction;", "reaction", "", "enforceUnique", "skipPush", "Lio/getstream/chat/android/models/User;", "currentUser", "Ll83/a0;", "saveReactionInState", "(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLjava/lang/Boolean;Lio/getstream/chat/android/models/User;)V", "Lio/getstream/chat/android/models/Message;", "originReaction", "Ln23/h;", "result", "updateReactionSyncStatus", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Reaction;Ln23/h;)Lio/getstream/chat/android/models/Message;", "updateSyncStatus", "(Lio/getstream/chat/android/models/Reaction;Ln23/h;)Lio/getstream/chat/android/models/Reaction;", "onSendReactionRequest", "(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "onSendReactionResult", "(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onSendReactionPrecondition", "(Ljava/lang/String;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SendReactionListenerState implements SendReactionListener {
    private final ClientState clientState;
    private final LogicRegistry logic;

    public SendReactionListenerState(LogicRegistry logic, ClientState clientState) {
        AbstractC22676k.m65750j(logic, "logic");
        AbstractC22676k.m65750j(clientState, "clientState");
        this.logic = logic;
        this.clientState = clientState;
    }

    private final void saveReactionInState(String cid, Reaction reaction, boolean enforceUnique, Boolean skipPush, User currentUser) {
        ChannelLogic channelLogicChannelFromMessageId;
        Message message$stream_chat_android_client_release;
        Message message;
        Reaction reactionEnrichWithDataBeforeSending = ReactionKt.enrichWithDataBeforeSending(reaction, currentUser, this.clientState.isNetworkAvailable(), enforceUnique, skipPush != null ? skipPush.booleanValue() : false);
        if (cid != null) {
            C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(cid);
            channelLogicChannelFromMessageId = this.logic.channel((String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x);
        } else {
            channelLogicChannelFromMessageId = this.logic.channelFromMessageId(reaction.getMessageId());
        }
        Message messageAddMyReaction = null;
        Message messageAddMyReaction2 = (channelLogicChannelFromMessageId == null || (message = channelLogicChannelFromMessageId.getMessage(reaction.getMessageId())) == null) ? null : MessageReactionsKt.addMyReaction(message, reactionEnrichWithDataBeforeSending, enforceUnique);
        if (messageAddMyReaction2 != null) {
            channelLogicChannelFromMessageId.upsertMessage(messageAddMyReaction2);
        }
        for (QueryThreadsLogic queryThreadsLogic : this.logic.getActiveQueryThreadsLogic()) {
            Message message$stream_chat_android_client_release2 = queryThreadsLogic.getMessage$stream_chat_android_client_release(reaction.getMessageId());
            Message messageAddMyReaction3 = message$stream_chat_android_client_release2 != null ? MessageReactionsKt.addMyReaction(message$stream_chat_android_client_release2, reactionEnrichWithDataBeforeSending, enforceUnique) : null;
            if (messageAddMyReaction3 != null) {
                queryThreadsLogic.upsertMessage$stream_chat_android_client_release(messageAddMyReaction3);
            }
        }
        ThreadLogic threadLogicThreadFromMessageId = this.logic.threadFromMessageId(reaction.getMessageId());
        if (threadLogicThreadFromMessageId != null && (message$stream_chat_android_client_release = threadLogicThreadFromMessageId.getMessage$stream_chat_android_client_release(reaction.getMessageId())) != null) {
            messageAddMyReaction = MessageReactionsKt.addMyReaction(message$stream_chat_android_client_release, reactionEnrichWithDataBeforeSending, enforceUnique);
        }
        if (messageAddMyReaction != null) {
            threadLogicThreadFromMessageId.upsertMessage$stream_chat_android_client_release(messageAddMyReaction);
        }
    }

    private final Message updateReactionSyncStatus(Message message, Reaction reaction, AbstractC26205h abstractC26205h) {
        List<Reaction> ownReactions = message.getOwnReactions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(ownReactions, 10));
        for (Reaction reactionUpdateSyncStatus : ownReactions) {
            if (AbstractC22676k.m65745e(reactionUpdateSyncStatus.getId(), reaction.getId())) {
                reactionUpdateSyncStatus = updateSyncStatus(reactionUpdateSyncStatus, abstractC26205h);
            }
            arrayList.add(reactionUpdateSyncStatus);
        }
        List<Reaction> latestReactions = message.getLatestReactions();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(latestReactions, 10));
        for (Reaction reactionUpdateSyncStatus2 : latestReactions) {
            if (AbstractC22676k.m65745e(reactionUpdateSyncStatus2.getId(), reaction.getId())) {
                reactionUpdateSyncStatus2 = updateSyncStatus(reactionUpdateSyncStatus2, abstractC26205h);
            }
            arrayList2.add(reactionUpdateSyncStatus2);
        }
        return message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : arrayList2, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : arrayList, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
    }

    private final Reaction updateSyncStatus(Reaction reaction, AbstractC26205h abstractC26205h) {
        SyncStatus syncStatus;
        if (abstractC26205h instanceof C26204g) {
            syncStatus = SyncStatus.COMPLETED;
        } else {
            if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            syncStatus = ChatErrorKt.isPermanent(((C26203f) abstractC26205h).f103918a) ? SyncStatus.FAILED_PERMANENTLY : SyncStatus.SYNC_NEEDED;
        }
        return reaction.copy((16319 & 1) != 0 ? reaction.messageId : null, (16319 & 2) != 0 ? reaction.type : null, (16319 & 4) != 0 ? reaction.score : 0, (16319 & 8) != 0 ? reaction.user : null, (16319 & 16) != 0 ? reaction.userId : null, (16319 & 32) != 0 ? reaction.createdAt : null, (16319 & 64) != 0 ? reaction.createdLocallyAt : null, (16319 & 128) != 0 ? reaction.updatedAt : null, (16319 & 256) != 0 ? reaction.deletedAt : null, (16319 & 512) != 0 ? reaction.syncStatus : syncStatus, (16319 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? reaction.extraData : null, (16319 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? reaction.enforceUnique : false, (16319 & 4096) != 0 ? reaction.skipPush : false, (16319 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? reaction.emojiCode : null);
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.SendReactionListener
    public final Object onSendReactionPrecondition(String str, User user, Reaction reaction, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        if (user == null) {
            return new C26203f(new C26198a("Current user is null!"));
        }
        return (AbstractC39414r.m125890i0(reaction.getMessageId()) || AbstractC39414r.m125890i0(reaction.getType())) ? new C26203f(new C26198a("Reaction::messageId and Reaction::type cannot be empty!")) : new C26204g(C23454a0.f92919a);
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.SendReactionListener
    public final Object onSendReactionRequest(String str, Reaction reaction, boolean z4, boolean z13, User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        saveReactionInState(str, reaction, z4, Boolean.valueOf(z13), user);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.SendReactionListener
    public final Object onSendReactionResult(String str, Reaction reaction, boolean z4, User user, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ChannelLogic channelLogicChannelFromMessageId;
        Message message$stream_chat_android_client_release;
        Message message;
        if (str != null) {
            C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(str);
            channelLogicChannelFromMessageId = this.logic.channel((String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x);
        } else {
            channelLogicChannelFromMessageId = this.logic.channelFromMessageId(reaction.getMessageId());
        }
        if (channelLogicChannelFromMessageId != null && (message = channelLogicChannelFromMessageId.getMessage(reaction.getMessageId())) != null) {
            channelLogicChannelFromMessageId.upsertMessage(updateReactionSyncStatus(message, reaction, abstractC26205h));
        }
        for (QueryThreadsLogic queryThreadsLogic : this.logic.getActiveQueryThreadsLogic()) {
            Message message$stream_chat_android_client_release2 = queryThreadsLogic.getMessage$stream_chat_android_client_release(reaction.getMessageId());
            Message messageUpdateReactionSyncStatus = message$stream_chat_android_client_release2 != null ? updateReactionSyncStatus(message$stream_chat_android_client_release2, reaction, abstractC26205h) : null;
            if (messageUpdateReactionSyncStatus != null) {
                queryThreadsLogic.upsertMessage$stream_chat_android_client_release(messageUpdateReactionSyncStatus);
            }
        }
        ThreadLogic threadLogicThreadFromMessageId = this.logic.threadFromMessageId(reaction.getMessageId());
        if (threadLogicThreadFromMessageId != null && (message$stream_chat_android_client_release = threadLogicThreadFromMessageId.getMessage$stream_chat_android_client_release(reaction.getMessageId())) != null) {
            threadLogicThreadFromMessageId.upsertMessage$stream_chat_android_client_release(updateReactionSyncStatus(message$stream_chat_android_client_release, reaction, abstractC26205h));
        }
        return C23454a0.f92919a;
    }
}
