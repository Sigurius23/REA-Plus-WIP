package io.getstream.chat.android.client.internal.offline.plugin.listener.internal;

import io.getstream.chat.android.client.persistance.repository.MessageRepository;
import io.getstream.chat.android.client.persistance.repository.ReactionRepository;
import io.getstream.chat.android.client.plugin.listeners.DeleteReactionListener;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.models.User;
import l83.C23454a0;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26203f;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ2\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0016\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;", "reactionsRepository", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "messageRepository", "<init>", "(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V", "", "cid", "messageId", "reactionType", "Lio/getstream/chat/android/models/User;", "currentUser", "Ll83/a0;", "onDeleteReactionRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "Ln23/h;", "Lio/getstream/chat/android/models/Message;", "result", "onDeleteReactionResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onDeleteReactionPrecondition", "(Lio/getstream/chat/android/models/User;)Ln23/h;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DeleteReactionListenerDatabase implements DeleteReactionListener {
    private final ClientState clientState;
    private final MessageRepository messageRepository;
    private final ReactionRepository reactionsRepository;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DeleteReactionListenerDatabase$onDeleteReactionRequest$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DeleteReactionListenerDatabase", m100430f = "DeleteReactionListenerDatabase.kt", m100431l = {64, 66, 67}, m100432m = "onDeleteReactionRequest")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191101 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C191101(InterfaceC30057d<? super C191101> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeleteReactionListenerDatabase.this.onDeleteReactionRequest(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DeleteReactionListenerDatabase$onDeleteReactionResult$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DeleteReactionListenerDatabase", m100430f = "DeleteReactionListenerDatabase.kt", m100431l = {88, 93}, m100432m = "onDeleteReactionResult")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191111 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C191111(InterfaceC30057d<? super C191111> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeleteReactionListenerDatabase.this.onDeleteReactionResult(null, null, null, null, null, this);
        }
    }

    public DeleteReactionListenerDatabase(ClientState clientState, ReactionRepository reactionsRepository, MessageRepository messageRepository) {
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(reactionsRepository, "reactionsRepository");
        AbstractC22676k.m65750j(messageRepository, "messageRepository");
        this.clientState = clientState;
        this.reactionsRepository = reactionsRepository;
        this.messageRepository = messageRepository;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.DeleteReactionListener
    public final AbstractC26205h onDeleteReactionPrecondition(User currentUser) {
        return currentUser != null ? new C26204g(C23454a0.f92919a) : new C26203f(new C26198a("Current user is null!"));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0173, code lost:
    
        if (r6.insertMessage(r1, r2) == r3) goto L36;
     */
    @Override // io.getstream.chat.android.client.plugin.listeners.DeleteReactionListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onDeleteReactionRequest(java.lang.String r62, java.lang.String r63, java.lang.String r64, io.getstream.chat.android.models.User r65, q83.InterfaceC30057d<? super l83.C23454a0> r66) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DeleteReactionListenerDatabase.onDeleteReactionRequest(java.lang.String, java.lang.String, java.lang.String, io.getstream.chat.android.models.User, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        if (r7.insertReaction(r8, r6) == r0) goto L23;
     */
    @Override // io.getstream.chat.android.client.plugin.listeners.DeleteReactionListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onDeleteReactionResult(java.lang.String r6, java.lang.String r7, java.lang.String r8, io.getstream.chat.android.models.User r9, n23.AbstractC26205h r10, q83.InterfaceC30057d<? super l83.C23454a0> r11) {
        /*
            r5 = this;
            boolean r6 = r11 instanceof io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DeleteReactionListenerDatabase.C191111
            if (r6 == 0) goto L13
            r6 = r11
            io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DeleteReactionListenerDatabase$onDeleteReactionResult$1 r6 = (io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DeleteReactionListenerDatabase.C191111) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.label = r0
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DeleteReactionListenerDatabase$onDeleteReactionResult$1 r6 = new io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DeleteReactionListenerDatabase$onDeleteReactionResult$1
            r6.<init>(r11)
        L18:
            java.lang.Object r11 = r6.result
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L64
            if (r1 == r3) goto L4b
            if (r1 != r2) goto L43
            java.lang.Object r7 = r6.L$5
            io.getstream.chat.android.models.Reaction r7 = (io.getstream.chat.android.models.Reaction) r7
            java.lang.Object r7 = r6.L$4
            n23.h r7 = (n23.AbstractC26205h) r7
            java.lang.Object r7 = r6.L$3
            io.getstream.chat.android.models.User r7 = (io.getstream.chat.android.models.User) r7
            java.lang.Object r7 = r6.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r6.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.L$0
            java.lang.String r6 = (java.lang.String) r6
            p505ts.AbstractC34132o.m107864I(r11)
            goto La2
        L43:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L4b:
            java.lang.Object r7 = r6.L$4
            r10 = r7
            n23.h r10 = (n23.AbstractC26205h) r10
            java.lang.Object r7 = r6.L$3
            io.getstream.chat.android.models.User r7 = (io.getstream.chat.android.models.User) r7
            java.lang.Object r7 = r6.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r6.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r6.L$0
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r11)
            goto L80
        L64:
            p505ts.AbstractC34132o.m107864I(r11)
            io.getstream.chat.android.client.persistance.repository.ReactionRepository r11 = r5.reactionsRepository
            java.lang.String r9 = r9.getId()
            r6.L$0 = r4
            r6.L$1 = r4
            r6.L$2 = r4
            r6.L$3 = r4
            r6.L$4 = r10
            r6.label = r3
            java.lang.Object r11 = r11.selectUserReactionToMessage(r8, r7, r9, r6)
            if (r11 != r0) goto L80
            goto La1
        L80:
            io.getstream.chat.android.models.Reaction r11 = (io.getstream.chat.android.models.Reaction) r11
            if (r11 == 0) goto La2
            io.getstream.chat.android.client.persistance.repository.ReactionRepository r7 = r5.reactionsRepository
            io.getstream.chat.android.models.Reaction r8 = io.getstream.chat.android.client.extensions.internal.ReactionKt.updateSyncStatus(r11, r10)
            r6.L$0 = r4
            r6.L$1 = r4
            r6.L$2 = r4
            r6.L$3 = r4
            r6.L$4 = r4
            r6.L$5 = r4
            r9 = 0
            r6.I$0 = r9
            r6.label = r2
            java.lang.Object r6 = r7.insertReaction(r8, r6)
            if (r6 != r0) goto La2
        La1:
            return r0
        La2:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DeleteReactionListenerDatabase.onDeleteReactionResult(java.lang.String, java.lang.String, java.lang.String, io.getstream.chat.android.models.User, n23.h, q83.d):java.lang.Object");
    }
}
