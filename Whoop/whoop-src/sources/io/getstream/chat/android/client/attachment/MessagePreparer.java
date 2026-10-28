package io.getstream.chat.android.client.attachment;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.channel.ChannelMessagesUpdateLogic;
import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.client.channel.state.ChannelStateLogicProvider;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.client.extensions.internal.MessageKt;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.client.utils.internal.MessageUtilsKt;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.SyncStatus;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/client/attachment/MessagePreparer;", "", "clientState", "Lio/getstream/chat/android/client/setup/state/ClientState;", "channelStateLogicProvider", "Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;", "<init>", "(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;)V", "prepareMessage", "Lio/getstream/chat/android/models/Message;", "message", "channelId", "", "channelType", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessagePreparer {
    private final ChannelStateLogicProvider channelStateLogicProvider;
    private final ClientState clientState;

    public MessagePreparer(ClientState clientState, ChannelStateLogicProvider channelStateLogicProvider) {
        AbstractC22676k.m65750j(clientState, "clientState");
        this.clientState = clientState;
        this.channelStateLogicProvider = channelStateLogicProvider;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    public final Message prepareMessage(Message message, String channelId, String channelType, User user) {
        SyncStatus syncStatus;
        ChannelState channelState;
        Channel channel;
        Message messagePopulateMentions;
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(user, "user");
        ChannelStateLogicProvider channelStateLogicProvider = this.channelStateLogicProvider;
        ChannelMessagesUpdateLogic channelMessagesUpdateLogicChannelStateLogic = channelStateLogicProvider != null ? channelStateLogicProvider.channelStateLogic(channelType, channelId) : null;
        List<Attachment> listPrepareForUpload = MessagePreparerKt.prepareForUpload(message.getAttachments());
        Message messageEnsureId = MessageUtils.ensureId(message);
        String messageType = MessageUtilsKt.getMessageType(message);
        Date createdAtOrDefault = MessageExtensionsKt.getCreatedAtOrDefault(message, new Date());
        ArrayList arrayList = (ArrayList) listPrepareForUpload;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Attachment) it.next()).getUploadState() instanceof Attachment.UploadState.Idle) {
                        syncStatus = SyncStatus.AWAITING_ATTACHMENTS;
                    }
                } else if (this.clientState.isNetworkAvailable()) {
                    syncStatus = SyncStatus.IN_PROGRESS;
                } else {
                    syncStatus = SyncStatus.SYNC_NEEDED;
                }
            }
        } else if (this.clientState.isNetworkAvailable()) {
            syncStatus = SyncStatus.IN_PROGRESS;
        } else {
            syncStatus = SyncStatus.SYNC_NEEDED;
        }
        Message messageCopy = messageEnsureId.copy(((-1) & 1) != 0 ? messageEnsureId.id : null, ((-1) & 2) != 0 ? messageEnsureId.cid : null, ((-1) & 4) != 0 ? messageEnsureId.text : null, ((-1) & 8) != 0 ? messageEnsureId.html : null, ((-1) & 16) != 0 ? messageEnsureId.parentId : null, ((-1) & 32) != 0 ? messageEnsureId.command : null, ((-1) & 64) != 0 ? messageEnsureId.attachments : listPrepareForUpload, ((-1) & 128) != 0 ? messageEnsureId.mentionedUsersIds : null, ((-1) & 256) != 0 ? messageEnsureId.mentionedUsers : null, ((-1) & 512) != 0 ? messageEnsureId.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageEnsureId.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageEnsureId.reactionCounts : null, ((-1) & 4096) != 0 ? messageEnsureId.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageEnsureId.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageEnsureId.syncStatus : syncStatus, ((-1) & 32768) != 0 ? messageEnsureId.type : messageType, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageEnsureId.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageEnsureId.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageEnsureId.createdAt : null, ((-1) & 524288) != 0 ? messageEnsureId.updatedAt : null, ((-1) & 1048576) != 0 ? messageEnsureId.deletedAt : null, ((-1) & 2097152) != 0 ? messageEnsureId.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? messageEnsureId.createdLocallyAt : createdAtOrDefault, ((-1) & 8388608) != 0 ? messageEnsureId.user : user, ((-1) & 16777216) != 0 ? messageEnsureId.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageEnsureId.silent : false, ((-1) & 67108864) != 0 ? messageEnsureId.shadowed : false, ((-1) & 134217728) != 0 ? messageEnsureId.i18n : null, ((-1) & 268435456) != 0 ? messageEnsureId.showInChannel : false, ((-1) & 536870912) != 0 ? messageEnsureId.channelInfo : null, ((-1) & 1073741824) != 0 ? messageEnsureId.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? messageEnsureId.replyMessageId : null, (65535 & 1) != 0 ? messageEnsureId.pinned : false, (65535 & 2) != 0 ? messageEnsureId.pinnedAt : null, (65535 & 4) != 0 ? messageEnsureId.pinExpires : null, (65535 & 8) != 0 ? messageEnsureId.pinnedBy : null, (65535 & 16) != 0 ? messageEnsureId.threadParticipants : null, (65535 & 32) != 0 ? messageEnsureId.skipPushNotification : false, (65535 & 64) != 0 ? messageEnsureId.skipEnrichUrl : false, (65535 & 128) != 0 ? messageEnsureId.moderationDetails : null, (65535 & 256) != 0 ? messageEnsureId.moderation : null, (65535 & 512) != 0 ? messageEnsureId.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageEnsureId.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageEnsureId.restrictedVisibility : null, (65535 & 4096) != 0 ? messageEnsureId.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageEnsureId.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageEnsureId.channelRole : null, (65535 & 32768) != 0 ? messageEnsureId.deletedForMe : false);
        Message message2 = AbstractC39414r.m125890i0(messageCopy.getCid()) ? messageCopy : null;
        if (message2 != null) {
            Message messageEnrichWithCid = MessageExtensionsKt.enrichWithCid(message2, channelType + ":" + channelId);
            if (messageEnrichWithCid != null) {
                messageCopy = messageEnrichWithCid;
            }
        }
        if (channelMessagesUpdateLogicChannelStateLogic != null && (channelState = channelMessagesUpdateLogicChannelStateLogic.channelState()) != null && (channel = channelState.toChannel()) != null && (messagePopulateMentions = MessageKt.populateMentions(messageCopy, channel)) != null) {
            messageCopy = messagePopulateMentions;
        }
        if (messageCopy.getReplyMessageId() != null && channelMessagesUpdateLogicChannelStateLogic != null) {
            channelMessagesUpdateLogicChannelStateLogic.setRepliedMessage(null);
        }
        return messageCopy;
    }
}
