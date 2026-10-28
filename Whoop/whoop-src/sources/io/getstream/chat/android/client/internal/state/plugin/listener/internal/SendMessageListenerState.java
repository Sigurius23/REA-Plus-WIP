package io.getstream.chat.android.client.internal.state.plugin.listener.internal;

import androidx.profileinstaller.ProfileVerifier;
import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.errors.ChatErrorKt;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.thread.internal.ThreadLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsLogic;
import io.getstream.chat.android.client.plugin.listeners.SendMessageListener;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.SyncStatus;
import java.util.Date;
import java.util.Iterator;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u0018\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendMessageListenerState;", "Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logic", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V", "", "cid", "Lio/getstream/chat/android/models/Message;", "processedMessage", "Ll83/a0;", "handleSendMessageSuccess", "(Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V", "message", "Ln23/e;", "error", "handleSendMessageFailure", "(Lio/getstream/chat/android/models/Message;Ln23/e;)V", "updateState", "(Lio/getstream/chat/android/models/Message;)V", "Ln23/h;", "result", "channelType", "channelId", "onMessageSendResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SendMessageListenerState implements SendMessageListener {
    private final LogicRegistry logic;

    public SendMessageListenerState(LogicRegistry logic) {
        AbstractC22676k.m65750j(logic, "logic");
        this.logic = logic;
    }

    private final void handleSendMessageFailure(Message message, AbstractC26202e error) {
        boolean zIsPermanent = ChatErrorKt.isPermanent(error);
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.WARN;
        if (interfaceC2339e.isLoggable(enumC2341g, "Chat:SendMessageHandler")) {
            C2343i.f9271c.log(enumC2341g, "Chat:SendMessageHandler", AbstractC11266d.m30462p("[handleSendMessageFailure] isPermanentError: ", zIsPermanent), null);
        }
        updateState(message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : zIsPermanent ? SyncStatus.FAILED_PERMANENTLY : SyncStatus.SYNC_NEEDED, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : new Date(), ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false));
    }

    private final void handleSendMessageSuccess(String cid, Message processedMessage) {
        Message messageEnrichWithCid = MessageExtensionsKt.enrichWithCid(processedMessage, cid);
        updateState(messageEnrichWithCid.copy(((-1) & 1) != 0 ? messageEnrichWithCid.id : null, ((-1) & 2) != 0 ? messageEnrichWithCid.cid : null, ((-1) & 4) != 0 ? messageEnrichWithCid.text : null, ((-1) & 8) != 0 ? messageEnrichWithCid.html : null, ((-1) & 16) != 0 ? messageEnrichWithCid.parentId : null, ((-1) & 32) != 0 ? messageEnrichWithCid.command : null, ((-1) & 64) != 0 ? messageEnrichWithCid.attachments : null, ((-1) & 128) != 0 ? messageEnrichWithCid.mentionedUsersIds : null, ((-1) & 256) != 0 ? messageEnrichWithCid.mentionedUsers : null, ((-1) & 512) != 0 ? messageEnrichWithCid.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageEnrichWithCid.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageEnrichWithCid.reactionCounts : null, ((-1) & 4096) != 0 ? messageEnrichWithCid.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageEnrichWithCid.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageEnrichWithCid.syncStatus : SyncStatus.COMPLETED, ((-1) & 32768) != 0 ? messageEnrichWithCid.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageEnrichWithCid.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageEnrichWithCid.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageEnrichWithCid.createdAt : null, ((-1) & 524288) != 0 ? messageEnrichWithCid.updatedAt : null, ((-1) & 1048576) != 0 ? messageEnrichWithCid.deletedAt : null, ((-1) & 2097152) != 0 ? messageEnrichWithCid.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? messageEnrichWithCid.createdLocallyAt : null, ((-1) & 8388608) != 0 ? messageEnrichWithCid.user : null, ((-1) & 16777216) != 0 ? messageEnrichWithCid.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageEnrichWithCid.silent : false, ((-1) & 67108864) != 0 ? messageEnrichWithCid.shadowed : false, ((-1) & 134217728) != 0 ? messageEnrichWithCid.i18n : null, ((-1) & 268435456) != 0 ? messageEnrichWithCid.showInChannel : false, ((-1) & 536870912) != 0 ? messageEnrichWithCid.channelInfo : null, ((-1) & 1073741824) != 0 ? messageEnrichWithCid.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? messageEnrichWithCid.replyMessageId : null, (65535 & 1) != 0 ? messageEnrichWithCid.pinned : false, (65535 & 2) != 0 ? messageEnrichWithCid.pinnedAt : null, (65535 & 4) != 0 ? messageEnrichWithCid.pinExpires : null, (65535 & 8) != 0 ? messageEnrichWithCid.pinnedBy : null, (65535 & 16) != 0 ? messageEnrichWithCid.threadParticipants : null, (65535 & 32) != 0 ? messageEnrichWithCid.skipPushNotification : false, (65535 & 64) != 0 ? messageEnrichWithCid.skipEnrichUrl : false, (65535 & 128) != 0 ? messageEnrichWithCid.moderationDetails : null, (65535 & 256) != 0 ? messageEnrichWithCid.moderation : null, (65535 & 512) != 0 ? messageEnrichWithCid.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageEnrichWithCid.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageEnrichWithCid.restrictedVisibility : null, (65535 & 4096) != 0 ? messageEnrichWithCid.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageEnrichWithCid.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageEnrichWithCid.channelRole : null, (65535 & 32768) != 0 ? messageEnrichWithCid.deletedForMe : false));
    }

    private final void updateState(Message message) {
        Message messageById = this.logic.getMessageById(message.getId());
        Message messageCopy = message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : messageById != null ? messageById.getCreatedLocallyAt() : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
        ChannelLogic channelLogicChannelFromMessage = this.logic.channelFromMessage(messageCopy);
        if (channelLogicChannelFromMessage != null) {
            channelLogicChannelFromMessage.upsertMessage(messageCopy);
        }
        Iterator<T> it = this.logic.getActiveQueryThreadsLogic().iterator();
        while (it.hasNext()) {
            ((QueryThreadsLogic) it.next()).upsertMessage$stream_chat_android_client_release(messageCopy);
        }
        ThreadLogic threadLogicThreadFromMessage = this.logic.threadFromMessage(messageCopy);
        if (threadLogicThreadFromMessage != null) {
            threadLogicThreadFromMessage.upsertMessage$stream_chat_android_client_release(messageCopy);
        }
        Iterator<T> it3 = this.logic.getActiveQueryChannelsLogic().iterator();
        while (it3.hasNext()) {
            ((QueryChannelsLogic) it3.next()).refreshChannelState$stream_chat_android_client_release(messageCopy.getCid());
        }
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.SendMessageListener
    public final Object onMessageSendResult(AbstractC26205h abstractC26205h, String str, String str2, Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        String strM53370k = AbstractC18489d0.m53370k(str, ":", str2);
        Message messageById = this.logic.getMessageById(message.getId());
        SyncStatus syncStatus = messageById != null ? messageById.getSyncStatus() : null;
        SyncStatus syncStatus2 = SyncStatus.COMPLETED;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (syncStatus == syncStatus2) {
            return c23454a0;
        }
        if (abstractC26205h instanceof C26204g) {
            handleSendMessageSuccess(strM53370k, (Message) ((C26204g) abstractC26205h).f103919a);
        } else {
            if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            handleSendMessageFailure(message, ((C26203f) abstractC26205h).f103918a);
        }
        return c23454a0;
    }
}
