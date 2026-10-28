package io.getstream.chat.android.client.internal.offline.plugin.listener.internal;

import io.getstream.chat.android.client.persistance.repository.MessageRepository;
import io.getstream.chat.android.client.persistance.repository.UserRepository;
import io.getstream.chat.android.client.plugin.listeners.SendMessageListener;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.SyncStatus;
import l83.C23454a0;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u0018\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;", "Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "userRepository", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "messageRepository", "<init>", "(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V", "", "cid", "Lio/getstream/chat/android/models/Message;", "processedMessage", "Ll83/a0;", "handleSendMessageSuccess", "(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "message", "Ln23/e;", "error", "handleSendMessageFailure", "(Lio/getstream/chat/android/models/Message;Ln23/e;Lq83/d;)Ljava/lang/Object;", "Ln23/h;", "result", "channelType", "channelId", "onMessageSendResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SendMessageListenerDatabase implements SendMessageListener {
    private final MessageRepository messageRepository;
    private final UserRepository userRepository;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendMessageListenerDatabase$handleSendMessageFailure$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendMessageListenerDatabase", m100430f = "SendMessageListenerDatabase.kt", m100431l = {93, 94}, m100432m = "handleSendMessageFailure")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191211 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C191211(InterfaceC30057d<? super C191211> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendMessageListenerDatabase.this.handleSendMessageFailure(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendMessageListenerDatabase$handleSendMessageSuccess$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendMessageListenerDatabase", m100430f = "SendMessageListenerDatabase.kt", m100431l = {73, 74}, m100432m = "handleSendMessageSuccess")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191221 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C191221(InterfaceC30057d<? super C191221> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendMessageListenerDatabase.this.handleSendMessageSuccess(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendMessageListenerDatabase$onMessageSendResult$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendMessageListenerDatabase", m100430f = "SendMessageListenerDatabase.kt", m100431l = {58, 61, 62}, m100432m = "onMessageSendResult")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191231 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C191231(InterfaceC30057d<? super C191231> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendMessageListenerDatabase.this.onMessageSendResult(null, null, null, null, this);
        }
    }

    public SendMessageListenerDatabase(UserRepository userRepository, MessageRepository messageRepository) {
        AbstractC22676k.m65750j(userRepository, "userRepository");
        AbstractC22676k.m65750j(messageRepository, "messageRepository");
        this.userRepository = userRepository;
        this.messageRepository = messageRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0126, code lost:
    
        if (r1.insertMessage(r8, r2) == r3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleSendMessageFailure(io.getstream.chat.android.models.Message r61, n23.AbstractC26202e r62, q83.InterfaceC30057d<? super l83.C23454a0> r63) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendMessageListenerDatabase.handleSendMessageFailure(io.getstream.chat.android.models.Message, n23.e, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00fd, code lost:
    
        if (r1.insertMessage(r6, r2) == r3) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleSendMessageSuccess(java.lang.String r61, io.getstream.chat.android.models.Message r62, q83.InterfaceC30057d<? super l83.C23454a0> r63) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendMessageListenerDatabase.handleSendMessageSuccess(java.lang.String, io.getstream.chat.android.models.Message, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.plugin.listeners.SendMessageListener
    public final Object onMessageSendResult(AbstractC26205h abstractC26205h, String str, String str2, Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C191231 c191231;
        String str3;
        if (interfaceC30057d instanceof C191231) {
            c191231 = (C191231) interfaceC30057d;
            int i13 = c191231.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c191231.label = i13 - Integer.MIN_VALUE;
            } else {
                c191231 = new C191231(interfaceC30057d);
            }
        } else {
            c191231 = new C191231(interfaceC30057d);
        }
        Object objSelectMessage = c191231.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c191231.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelectMessage);
            str3 = str + ":" + str2;
            MessageRepository messageRepository = this.messageRepository;
            String id4 = message.getId();
            c191231.L$0 = abstractC26205h;
            c191231.L$1 = null;
            c191231.L$2 = null;
            c191231.L$3 = message;
            c191231.L$4 = str3;
            c191231.label = 1;
            objSelectMessage = messageRepository.selectMessage(id4, c191231);
            if (objSelectMessage != obj) {
            }
            return obj;
        }
        if (i14 != 1) {
            if (i14 == 2) {
                AbstractC34132o.m107864I(objSelectMessage);
                return c23454a0;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objSelectMessage);
            return c23454a0;
        }
        String str4 = (String) c191231.L$4;
        message = (Message) c191231.L$3;
        AbstractC26205h abstractC26205h2 = (AbstractC26205h) c191231.L$0;
        AbstractC34132o.m107864I(objSelectMessage);
        str3 = str4;
        abstractC26205h = abstractC26205h2;
        Message message2 = (Message) objSelectMessage;
        if ((message2 != null ? message2.getSyncStatus() : null) == SyncStatus.COMPLETED) {
            return c23454a0;
        }
        if (abstractC26205h instanceof C26204g) {
            Message message3 = (Message) ((C26204g) abstractC26205h).f103919a;
            c191231.L$0 = null;
            c191231.L$1 = null;
            c191231.L$2 = null;
            c191231.L$3 = null;
            c191231.L$4 = null;
            c191231.label = 2;
            if (handleSendMessageSuccess(str3, message3, c191231) != obj) {
                return c23454a0;
            }
        } else {
            if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC26202e abstractC26202e = ((C26203f) abstractC26205h).f103918a;
            c191231.L$0 = null;
            c191231.L$1 = null;
            c191231.L$2 = null;
            c191231.L$3 = null;
            c191231.L$4 = null;
            c191231.label = 3;
            if (handleSendMessageFailure(message, abstractC26202e, c191231) != obj) {
                return c23454a0;
            }
        }
        return obj;
    }
}
