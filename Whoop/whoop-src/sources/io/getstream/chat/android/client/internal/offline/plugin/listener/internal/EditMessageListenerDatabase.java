package io.getstream.chat.android.client.internal.offline.plugin.listener.internal;

import androidx.profileinstaller.ProfileVerifier;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.client.persistance.repository.MessageRepository;
import io.getstream.chat.android.client.persistance.repository.UserRepository;
import io.getstream.chat.android.client.plugin.listeners.EditMessageListener;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.SyncStatus;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u000eJ&\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase;", "Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "userRepository", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "messageRepository", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "<init>", "(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/setup/state/ClientState;)V", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "saveMessage", "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "onMessageEditRequest", "originalMessage", "Ln23/h;", "result", "onMessageEditResult", "(Lio/getstream/chat/android/models/Message;Ln23/h;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class EditMessageListenerDatabase implements EditMessageListener {
    private final ClientState clientState;
    private final MessageRepository messageRepository;
    private final UserRepository userRepository;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.EditMessageListenerDatabase$saveMessage$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.EditMessageListenerDatabase", m100430f = "EditMessageListenerDatabase.kt", m100431l = {71, 72}, m100432m = "saveMessage")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191151 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C191151(InterfaceC30057d<? super C191151> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EditMessageListenerDatabase.this.saveMessage(null, this);
        }
    }

    public EditMessageListenerDatabase(UserRepository userRepository, MessageRepository messageRepository, ClientState clientState) {
        AbstractC22676k.m65750j(userRepository, "userRepository");
        AbstractC22676k.m65750j(messageRepository, "messageRepository");
        AbstractC22676k.m65750j(clientState, "clientState");
        this.userRepository = userRepository;
        this.messageRepository = messageRepository;
        this.clientState = clientState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r7.insertMessage(r6, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveMessage(io.getstream.chat.android.models.Message r6, q83.InterfaceC30057d<? super l83.C23454a0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.getstream.chat.android.client.internal.offline.plugin.listener.internal.EditMessageListenerDatabase.C191151
            if (r0 == 0) goto L13
            r0 = r7
            io.getstream.chat.android.client.internal.offline.plugin.listener.internal.EditMessageListenerDatabase$saveMessage$1 r0 = (io.getstream.chat.android.client.internal.offline.plugin.listener.internal.EditMessageListenerDatabase.C191151) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.plugin.listener.internal.EditMessageListenerDatabase$saveMessage$1 r0 = new io.getstream.chat.android.client.internal.offline.plugin.listener.internal.EditMessageListenerDatabase$saveMessage$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.L$0
            io.getstream.chat.android.models.Message r6 = (io.getstream.chat.android.models.Message) r6
            p505ts.AbstractC34132o.m107864I(r7)
            goto L60
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.L$0
            io.getstream.chat.android.models.Message r6 = (io.getstream.chat.android.models.Message) r6
            p505ts.AbstractC34132o.m107864I(r7)
            goto L52
        L3e:
            p505ts.AbstractC34132o.m107864I(r7)
            io.getstream.chat.android.client.persistance.repository.UserRepository r7 = r5.userRepository
            java.util.List r2 = io.getstream.chat.android.client.extensions.internal.MessageKt.users(r6)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.insertUsers(r2, r0)
            if (r7 != r1) goto L52
            goto L5f
        L52:
            io.getstream.chat.android.client.persistance.repository.MessageRepository r7 = r5.messageRepository
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r7.insertMessage(r6, r0)
            if (r6 != r1) goto L60
        L5f:
            return r1
        L60:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.EditMessageListenerDatabase.saveMessage(io.getstream.chat.android.models.Message, q83.d):java.lang.Object");
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.EditMessageListener
    public final Object onMessageEditRequest(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objSaveMessage = saveMessage(MessageExtensionsKt.updateMessageOnlineState(message, this.clientState.isNetworkAvailable()), interfaceC30057d);
        return objSaveMessage == EnumC31071a.f128113w ? objSaveMessage : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.EditMessageListener
    public final Object onMessageEditResult(Message message, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Message messageUpdateFailedMessage;
        if (abstractC26205h instanceof C26204g) {
            Message message2 = (Message) ((C26204g) abstractC26205h).f103919a;
            messageUpdateFailedMessage = message2.copy(((-1) & 1) != 0 ? message2.id : null, ((-1) & 2) != 0 ? message2.cid : null, ((-1) & 4) != 0 ? message2.text : null, ((-1) & 8) != 0 ? message2.html : null, ((-1) & 16) != 0 ? message2.parentId : null, ((-1) & 32) != 0 ? message2.command : null, ((-1) & 64) != 0 ? message2.attachments : null, ((-1) & 128) != 0 ? message2.mentionedUsersIds : null, ((-1) & 256) != 0 ? message2.mentionedUsers : null, ((-1) & 512) != 0 ? message2.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.reactionCounts : null, ((-1) & 4096) != 0 ? message2.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.syncStatus : SyncStatus.COMPLETED, ((-1) & 32768) != 0 ? message2.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message2.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message2.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message2.createdAt : null, ((-1) & 524288) != 0 ? message2.updatedAt : null, ((-1) & 1048576) != 0 ? message2.deletedAt : null, ((-1) & 2097152) != 0 ? message2.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message2.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message2.user : null, ((-1) & 16777216) != 0 ? message2.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message2.silent : false, ((-1) & 67108864) != 0 ? message2.shadowed : false, ((-1) & 134217728) != 0 ? message2.i18n : null, ((-1) & 268435456) != 0 ? message2.showInChannel : false, ((-1) & 536870912) != 0 ? message2.channelInfo : null, ((-1) & 1073741824) != 0 ? message2.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message2.replyMessageId : null, (65535 & 1) != 0 ? message2.pinned : false, (65535 & 2) != 0 ? message2.pinnedAt : null, (65535 & 4) != 0 ? message2.pinExpires : null, (65535 & 8) != 0 ? message2.pinnedBy : null, (65535 & 16) != 0 ? message2.threadParticipants : null, (65535 & 32) != 0 ? message2.skipPushNotification : false, (65535 & 64) != 0 ? message2.skipEnrichUrl : false, (65535 & 128) != 0 ? message2.moderationDetails : null, (65535 & 256) != 0 ? message2.moderation : null, (65535 & 512) != 0 ? message2.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.restrictedVisibility : null, (65535 & 4096) != 0 ? message2.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.channelRole : null, (65535 & 32768) != 0 ? message2.deletedForMe : false);
        } else {
            if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            messageUpdateFailedMessage = MessageExtensionsKt.updateFailedMessage(message, ((C26203f) abstractC26205h).f103918a);
        }
        Object objSaveMessage = saveMessage(messageUpdateFailedMessage, interfaceC30057d);
        return objSaveMessage == EnumC31071a.f128113w ? objSaveMessage : C23454a0.f92919a;
    }
}
