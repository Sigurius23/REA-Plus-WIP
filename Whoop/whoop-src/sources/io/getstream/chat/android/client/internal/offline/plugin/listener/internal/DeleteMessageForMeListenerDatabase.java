package io.getstream.chat.android.client.internal.offline.plugin.listener.internal;

import androidx.profileinstaller.ProfileVerifier;
import io.getstream.chat.android.client.persistance.repository.MessageRepository;
import io.getstream.chat.android.client.plugin.listeners.DeleteMessageForMeListener;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.SyncStatus;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import no.nordicsemi.android.dfu.DfuBaseService;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "messageRepository", "<init>", "(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V", "", "messageId", "Ll83/a0;", "onDeleteMessageForMeRequest", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ln23/h;", "Lio/getstream/chat/android/models/Message;", "result", "onDeleteMessageForMeResult", "(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DeleteMessageForMeListenerDatabase implements DeleteMessageForMeListener {
    private final ClientState clientState;
    private final MessageRepository messageRepository;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DeleteMessageForMeListenerDatabase$onDeleteMessageForMeRequest$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DeleteMessageForMeListenerDatabase", m100430f = "DeleteMessageForMeListenerDatabase.kt", m100431l = {36, 43}, m100432m = "onDeleteMessageForMeRequest")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191051 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C191051(InterfaceC30057d<? super C191051> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeleteMessageForMeListenerDatabase.this.onDeleteMessageForMeRequest(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DeleteMessageForMeListenerDatabase$onDeleteMessageForMeResult$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DeleteMessageForMeListenerDatabase", m100430f = "DeleteMessageForMeListenerDatabase.kt", m100431l = {54, 60, 66}, m100432m = "onDeleteMessageForMeResult")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191061 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C191061(InterfaceC30057d<? super C191061> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeleteMessageForMeListenerDatabase.this.onDeleteMessageForMeResult(null, null, this);
        }
    }

    public DeleteMessageForMeListenerDatabase(ClientState clientState, MessageRepository messageRepository) {
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(messageRepository, "messageRepository");
        this.clientState = clientState;
        this.messageRepository = messageRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e8, code lost:
    
        if (r6.insertMessage(r4, r2) == r3) goto L28;
     */
    @Override // io.getstream.chat.android.client.plugin.listeners.DeleteMessageForMeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onDeleteMessageForMeRequest(java.lang.String r61, q83.InterfaceC30057d<? super l83.C23454a0> r62) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DeleteMessageForMeListenerDatabase.onDeleteMessageForMeRequest(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // io.getstream.chat.android.client.plugin.listeners.DeleteMessageForMeListener
    public final Object onDeleteMessageForMeResult(String str, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C191061 c191061;
        if (interfaceC30057d instanceof C191061) {
            c191061 = (C191061) interfaceC30057d;
            int i13 = c191061.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c191061.label = i13 - Integer.MIN_VALUE;
            } else {
                c191061 = new C191061(interfaceC30057d);
            }
        } else {
            c191061 = new C191061(interfaceC30057d);
        }
        Object objSelectMessage = c191061.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c191061.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 == 2) {
                    AbstractC34132o.m107864I(objSelectMessage);
                } else {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            AbstractC34132o.m107864I(objSelectMessage);
            return c23454a0;
        }
        AbstractC34132o.m107864I(objSelectMessage);
        if (abstractC26205h instanceof C26204g) {
            MessageRepository messageRepository = this.messageRepository;
            Message message = (Message) ((C26204g) abstractC26205h).f103919a;
            Message messageCopy = message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : SyncStatus.COMPLETED, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
            c191061.L$0 = null;
            c191061.L$1 = null;
            c191061.label = 1;
            if (messageRepository.insertMessage(messageCopy, c191061) != enumC31071a) {
                return c23454a0;
            }
        } else {
            if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            MessageRepository messageRepository2 = this.messageRepository;
            c191061.L$0 = null;
            c191061.L$1 = null;
            c191061.label = 2;
            objSelectMessage = messageRepository2.selectMessage(str, c191061);
            if (objSelectMessage != enumC31071a) {
            }
        }
        return enumC31071a;
        Message message2 = (Message) objSelectMessage;
        if (message2 != null) {
            Message messageCopy2 = message2.copy(((-1) & 1) != 0 ? message2.id : null, ((-1) & 2) != 0 ? message2.cid : null, ((-1) & 4) != 0 ? message2.text : null, ((-1) & 8) != 0 ? message2.html : null, ((-1) & 16) != 0 ? message2.parentId : null, ((-1) & 32) != 0 ? message2.command : null, ((-1) & 64) != 0 ? message2.attachments : null, ((-1) & 128) != 0 ? message2.mentionedUsersIds : null, ((-1) & 256) != 0 ? message2.mentionedUsers : null, ((-1) & 512) != 0 ? message2.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.reactionCounts : null, ((-1) & 4096) != 0 ? message2.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.syncStatus : SyncStatus.SYNC_NEEDED, ((-1) & 32768) != 0 ? message2.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message2.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message2.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message2.createdAt : null, ((-1) & 524288) != 0 ? message2.updatedAt : null, ((-1) & 1048576) != 0 ? message2.deletedAt : null, ((-1) & 2097152) != 0 ? message2.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message2.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message2.user : null, ((-1) & 16777216) != 0 ? message2.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message2.silent : false, ((-1) & 67108864) != 0 ? message2.shadowed : false, ((-1) & 134217728) != 0 ? message2.i18n : null, ((-1) & 268435456) != 0 ? message2.showInChannel : false, ((-1) & 536870912) != 0 ? message2.channelInfo : null, ((-1) & 1073741824) != 0 ? message2.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message2.replyMessageId : null, (65535 & 1) != 0 ? message2.pinned : false, (65535 & 2) != 0 ? message2.pinnedAt : null, (65535 & 4) != 0 ? message2.pinExpires : null, (65535 & 8) != 0 ? message2.pinnedBy : null, (65535 & 16) != 0 ? message2.threadParticipants : null, (65535 & 32) != 0 ? message2.skipPushNotification : false, (65535 & 64) != 0 ? message2.skipEnrichUrl : false, (65535 & 128) != 0 ? message2.moderationDetails : null, (65535 & 256) != 0 ? message2.moderation : null, (65535 & 512) != 0 ? message2.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.restrictedVisibility : null, (65535 & 4096) != 0 ? message2.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.channelRole : null, (65535 & 32768) != 0 ? message2.deletedForMe : true);
            MessageRepository messageRepository3 = this.messageRepository;
            c191061.L$0 = null;
            c191061.L$1 = null;
            c191061.L$2 = null;
            c191061.L$3 = null;
            c191061.I$0 = 0;
            c191061.label = 3;
            if (messageRepository3.insertMessage(messageCopy2, c191061) == enumC31071a) {
                return enumC31071a;
            }
        }
        return c23454a0;
    }
}
