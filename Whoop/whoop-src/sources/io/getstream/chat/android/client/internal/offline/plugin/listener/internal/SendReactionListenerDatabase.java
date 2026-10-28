package io.getstream.chat.android.client.internal.offline.plugin.listener.internal;

import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.client.persistance.repository.MessageRepository;
import io.getstream.chat.android.client.persistance.repository.ReactionRepository;
import io.getstream.chat.android.client.persistance.repository.UserRepository;
import io.getstream.chat.android.client.plugin.listeners.SendReactionListener;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import java.util.Set;
import l83.C23454a0;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26203f;
import n23.C26204g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u001a\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ@\u0010\u001e\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ2\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&¨\u0006'"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;", "Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;", "reactionsRepository", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "messageRepository", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "userRepository", "", "", "ignoredChannelTypes", "<init>", "(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/persistance/repository/UserRepository;Ljava/util/Set;)V", "Lio/getstream/chat/android/models/Reaction;", "reaction", "", "enforceUnique", "skipPush", "Lio/getstream/chat/android/models/User;", "currentUser", "Ll83/a0;", "saveReactionInDatabase", "(Lio/getstream/chat/android/models/Reaction;ZLjava/lang/Boolean;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "cid", "onSendReactionRequest", "(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "Ln23/h;", "result", "onSendReactionResult", "(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onSendReactionPrecondition", "(Ljava/lang/String;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "Ljava/util/Set;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SendReactionListenerDatabase implements SendReactionListener {
    private final ClientState clientState;
    private final Set<String> ignoredChannelTypes;
    private final MessageRepository messageRepository;
    private final ReactionRepository reactionsRepository;
    private final UserRepository userRepository;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendReactionListenerDatabase$onSendReactionPrecondition$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendReactionListenerDatabase", m100430f = "SendReactionListenerDatabase.kt", m100431l = {103}, m100432m = "onSendReactionPrecondition")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191241 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C191241(InterfaceC30057d<? super C191241> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendReactionListenerDatabase.this.onSendReactionPrecondition(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendReactionListenerDatabase$onSendReactionResult$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendReactionListenerDatabase", m100430f = "SendReactionListenerDatabase.kt", m100431l = {79, 84}, m100432m = "onSendReactionResult")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191251 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C191251(InterfaceC30057d<? super C191251> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendReactionListenerDatabase.this.onSendReactionResult(null, null, false, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendReactionListenerDatabase$saveReactionInDatabase$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendReactionListenerDatabase", m100430f = "SendReactionListenerDatabase.kt", m100431l = {128, 135, 136, 138, 139}, m100432m = "saveReactionInDatabase")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191261 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C191261(InterfaceC30057d<? super C191261> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendReactionListenerDatabase.this.saveReactionInDatabase(null, false, null, null, this);
        }
    }

    public SendReactionListenerDatabase(ClientState clientState, ReactionRepository reactionsRepository, MessageRepository messageRepository, UserRepository userRepository, Set<String> ignoredChannelTypes) {
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(reactionsRepository, "reactionsRepository");
        AbstractC22676k.m65750j(messageRepository, "messageRepository");
        AbstractC22676k.m65750j(userRepository, "userRepository");
        AbstractC22676k.m65750j(ignoredChannelTypes, "ignoredChannelTypes");
        this.clientState = clientState;
        this.reactionsRepository = reactionsRepository;
        this.messageRepository = messageRepository;
        this.userRepository = userRepository;
        this.ignoredChannelTypes = ignoredChannelTypes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x0135  */
    /* JADX WARN: Code duplicated, block: B:46:0x0151 A[PHI: r1 r2 r3
      0x0151: PHI (r1v10 boolean) = (r1v9 boolean), (r1v18 boolean) binds: [B:44:0x014d, B:18:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r2v8 io.getstream.chat.android.models.Reaction) = (r2v7 io.getstream.chat.android.models.Reaction), (r2v20 io.getstream.chat.android.models.Reaction) binds: [B:44:0x014d, B:18:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r3v10 java.lang.Object) = (r3v9 java.lang.Object), (r3v1 java.lang.Object) binds: [B:44:0x014d, B:18:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0156  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01dd, code lost:
    
        if (r6.insertMessage(r2, r4) == r5) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveReactionInDatabase(io.getstream.chat.android.models.Reaction r67, boolean r68, java.lang.Boolean r69, io.getstream.chat.android.models.User r70, q83.InterfaceC30057d<? super l83.C23454a0> r71) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendReactionListenerDatabase.saveReactionInDatabase(io.getstream.chat.android.models.Reaction, boolean, java.lang.Boolean, io.getstream.chat.android.models.User, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.plugin.listeners.SendReactionListener
    public final Object onSendReactionPrecondition(String str, User user, Reaction reaction, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C191241 c191241;
        if (interfaceC30057d instanceof C191241) {
            c191241 = (C191241) interfaceC30057d;
            int i13 = c191241.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c191241.label = i13 - Integer.MIN_VALUE;
            } else {
                c191241 = new C191241(interfaceC30057d);
            }
        } else {
            c191241 = new C191241(interfaceC30057d);
        }
        Object objSelectMessage = c191241.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c191241.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelectMessage);
            String str2 = str != null ? (String) StringExtensionsKt.cidToTypeAndId(str).f92937w : null;
            if (user == null) {
                return new C26203f(new C26198a("Current user is null!"));
            }
            if (AbstractC39414r.m125890i0(reaction.getMessageId()) || AbstractC39414r.m125890i0(reaction.getType())) {
                return new C26203f(new C26198a("Reaction::messageId and Reaction::type cannot be empty!"));
            }
            if (str2 == null || this.ignoredChannelTypes.contains(str2)) {
                return new C26204g(c23454a0);
            }
            MessageRepository messageRepository = this.messageRepository;
            String messageId = reaction.getMessageId();
            c191241.L$0 = null;
            c191241.L$1 = null;
            c191241.L$2 = null;
            c191241.L$3 = null;
            c191241.label = 1;
            objSelectMessage = messageRepository.selectMessage(messageId, c191241);
            if (objSelectMessage == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objSelectMessage);
        }
        return objSelectMessage == null ? new C26203f(new C26198a("Reaction::messageId cannot be found in DB!")) : new C26204g(c23454a0);
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.SendReactionListener
    public final Object onSendReactionRequest(String str, Reaction reaction, boolean z4, boolean z13, User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objSaveReactionInDatabase = saveReactionInDatabase(reaction, z4, Boolean.valueOf(z13), user, interfaceC30057d);
        return objSaveReactionInDatabase == EnumC31071a.f128113w ? objSaveReactionInDatabase : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a1, code lost:
    
        if (r7.insertReaction(r9, r6) == r0) goto L23;
     */
    @Override // io.getstream.chat.android.client.plugin.listeners.SendReactionListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onSendReactionResult(java.lang.String r6, io.getstream.chat.android.models.Reaction r7, boolean r8, io.getstream.chat.android.models.User r9, n23.AbstractC26205h r10, q83.InterfaceC30057d<? super l83.C23454a0> r11) {
        /*
            r5 = this;
            boolean r6 = r11 instanceof io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendReactionListenerDatabase.C191251
            if (r6 == 0) goto L13
            r6 = r11
            io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendReactionListenerDatabase$onSendReactionResult$1 r6 = (io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendReactionListenerDatabase.C191251) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.label = r0
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendReactionListenerDatabase$onSendReactionResult$1 r6 = new io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendReactionListenerDatabase$onSendReactionResult$1
            r6.<init>(r11)
        L18:
            java.lang.Object r11 = r6.result
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L5e
            if (r1 == r3) goto L47
            if (r1 != r2) goto L3f
            java.lang.Object r7 = r6.L$4
            io.getstream.chat.android.models.Reaction r7 = (io.getstream.chat.android.models.Reaction) r7
            java.lang.Object r7 = r6.L$3
            n23.h r7 = (n23.AbstractC26205h) r7
            java.lang.Object r7 = r6.L$2
            io.getstream.chat.android.models.User r7 = (io.getstream.chat.android.models.User) r7
            java.lang.Object r7 = r6.L$1
            io.getstream.chat.android.models.Reaction r7 = (io.getstream.chat.android.models.Reaction) r7
            java.lang.Object r6 = r6.L$0
            java.lang.String r6 = (java.lang.String) r6
            p505ts.AbstractC34132o.m107864I(r11)
            goto La4
        L3f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L47:
            boolean r8 = r6.Z$0
            java.lang.Object r7 = r6.L$3
            r10 = r7
            n23.h r10 = (n23.AbstractC26205h) r10
            java.lang.Object r7 = r6.L$2
            io.getstream.chat.android.models.User r7 = (io.getstream.chat.android.models.User) r7
            java.lang.Object r7 = r6.L$1
            io.getstream.chat.android.models.Reaction r7 = (io.getstream.chat.android.models.Reaction) r7
            java.lang.Object r7 = r6.L$0
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r11)
            goto L82
        L5e:
            p505ts.AbstractC34132o.m107864I(r11)
            io.getstream.chat.android.client.persistance.repository.ReactionRepository r11 = r5.reactionsRepository
            java.lang.String r1 = r7.getType()
            java.lang.String r7 = r7.getMessageId()
            java.lang.String r9 = r9.getId()
            r6.L$0 = r4
            r6.L$1 = r4
            r6.L$2 = r4
            r6.L$3 = r10
            r6.Z$0 = r8
            r6.label = r3
            java.lang.Object r11 = r11.selectUserReactionToMessage(r1, r7, r9, r6)
            if (r11 != r0) goto L82
            goto La3
        L82:
            io.getstream.chat.android.models.Reaction r11 = (io.getstream.chat.android.models.Reaction) r11
            if (r11 == 0) goto La4
            io.getstream.chat.android.client.persistance.repository.ReactionRepository r7 = r5.reactionsRepository
            io.getstream.chat.android.models.Reaction r9 = io.getstream.chat.android.client.extensions.internal.ReactionKt.updateSyncStatus(r11, r10)
            r6.L$0 = r4
            r6.L$1 = r4
            r6.L$2 = r4
            r6.L$3 = r4
            r6.L$4 = r4
            r6.Z$0 = r8
            r8 = 0
            r6.I$0 = r8
            r6.label = r2
            java.lang.Object r6 = r7.insertReaction(r9, r6)
            if (r6 != r0) goto La4
        La3:
            return r0
        La4:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendReactionListenerDatabase.onSendReactionResult(java.lang.String, io.getstream.chat.android.models.Reaction, boolean, io.getstream.chat.android.models.User, n23.h, q83.d):java.lang.Object");
    }
}
