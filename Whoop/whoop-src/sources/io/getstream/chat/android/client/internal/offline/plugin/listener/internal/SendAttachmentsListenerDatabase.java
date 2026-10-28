package io.getstream.chat.android.client.internal.offline.plugin.listener.internal;

import io.getstream.chat.android.client.persistance.repository.ChannelRepository;
import io.getstream.chat.android.client.persistance.repository.MessageRepository;
import io.getstream.chat.android.client.plugin.listeners.SendAttachmentListener;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase;", "Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "messageRepository", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "channelRepository", "<init>", "(Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;)V", "", "channelType", "channelId", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onAttachmentSendRequest", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SendAttachmentsListenerDatabase implements SendAttachmentListener {
    private final ChannelRepository channelRepository;
    private final MessageRepository messageRepository;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendAttachmentsListenerDatabase$onAttachmentSendRequest$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendAttachmentsListenerDatabase", m100430f = "SendAttachmentsListenerDatabase.kt", m100431l = {41, 42}, m100432m = "onAttachmentSendRequest")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191201 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C191201(InterfaceC30057d<? super C191201> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendAttachmentsListenerDatabase.this.onAttachmentSendRequest(null, null, null, this);
        }
    }

    public SendAttachmentsListenerDatabase(MessageRepository messageRepository, ChannelRepository channelRepository) {
        AbstractC22676k.m65750j(messageRepository, "messageRepository");
        AbstractC22676k.m65750j(channelRepository, "channelRepository");
        this.messageRepository = messageRepository;
        this.channelRepository = channelRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        if (r6.updateLastMessageForChannel(r0, r7, r5) == r8) goto L21;
     */
    @Override // io.getstream.chat.android.client.plugin.listeners.SendAttachmentListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onAttachmentSendRequest(java.lang.String r5, java.lang.String r6, io.getstream.chat.android.models.Message r7, q83.InterfaceC30057d<? super l83.C23454a0> r8) {
        /*
            r4 = this;
            boolean r5 = r8 instanceof io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendAttachmentsListenerDatabase.C191201
            if (r5 == 0) goto L13
            r5 = r8
            io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendAttachmentsListenerDatabase$onAttachmentSendRequest$1 r5 = (io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendAttachmentsListenerDatabase.C191201) r5
            int r6 = r5.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r5.label = r6
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendAttachmentsListenerDatabase$onAttachmentSendRequest$1 r5 = new io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendAttachmentsListenerDatabase$onAttachmentSendRequest$1
            r5.<init>(r8)
        L18:
            java.lang.Object r6 = r5.result
            r83.a r8 = r83.EnumC31071a.f128113w
            int r0 = r5.label
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4f
            if (r0 == r2) goto L3f
            if (r0 != r1) goto L37
            java.lang.Object r7 = r5.L$2
            io.getstream.chat.android.models.Message r7 = (io.getstream.chat.android.models.Message) r7
            java.lang.Object r7 = r5.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r5.L$0
            java.lang.String r5 = (java.lang.String) r5
            p505ts.AbstractC34132o.m107864I(r6)
            goto L78
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            java.lang.Object r7 = r5.L$2
            io.getstream.chat.android.models.Message r7 = (io.getstream.chat.android.models.Message) r7
            java.lang.Object r0 = r5.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r5.L$0
            java.lang.String r0 = (java.lang.String) r0
            p505ts.AbstractC34132o.m107864I(r6)
            goto L63
        L4f:
            p505ts.AbstractC34132o.m107864I(r6)
            io.getstream.chat.android.client.persistance.repository.MessageRepository r6 = r4.messageRepository
            r5.L$0 = r3
            r5.L$1 = r3
            r5.L$2 = r7
            r5.label = r2
            java.lang.Object r6 = r6.insertMessage(r7, r5)
            if (r6 != r8) goto L63
            goto L77
        L63:
            io.getstream.chat.android.client.persistance.repository.ChannelRepository r6 = r4.channelRepository
            java.lang.String r0 = r7.getCid()
            r5.L$0 = r3
            r5.L$1 = r3
            r5.L$2 = r3
            r5.label = r1
            java.lang.Object r5 = r6.updateLastMessageForChannel(r0, r7, r5)
            if (r5 != r8) goto L78
        L77:
            return r8
        L78:
            l83.a0 r5 = l83.C23454a0.f92919a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendAttachmentsListenerDatabase.onAttachmentSendRequest(java.lang.String, java.lang.String, io.getstream.chat.android.models.Message, q83.d):java.lang.Object");
    }
}
