package io.getstream.chat.android.client.user;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3028k2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.api.ChatApiConfig;
import io.getstream.chat.android.client.errors.ChatErrorCode;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.events.ConnectedEvent;
import io.getstream.chat.android.client.network.NetworkStateProvider;
import io.getstream.chat.android.client.socket.SocketFactory;
import io.getstream.chat.android.client.socket.StreamWebSocket;
import io.getstream.chat.android.client.socket.StreamWebSocketEvent;
import io.getstream.chat.android.models.User;
import java.io.UnsupportedEncodingException;
import l83.C23454a0;
import l83.InterfaceC23462h;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26200c;
import n23.C26201d;
import n23.C26203f;
import n23.C26204g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0019\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, m65681d2 = {"Lio/getstream/chat/android/client/user/CurrentUserFetcher;", "", "Lio/getstream/chat/android/client/network/NetworkStateProvider;", "networkStateProvider", "Lio/getstream/chat/android/client/socket/SocketFactory;", "socketFactory", "Lio/getstream/chat/android/client/api/ChatApiConfig;", "config", "<init>", "(Lio/getstream/chat/android/client/network/NetworkStateProvider;Lio/getstream/chat/android/client/socket/SocketFactory;Lio/getstream/chat/android/client/api/ChatApiConfig;)V", "Lio/getstream/chat/android/models/User;", "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;", "toConnectionConf", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/api/ChatApiConfig;)Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;", "Lec3/l;", "Lio/getstream/chat/android/client/socket/StreamWebSocketEvent;", "", "timeMillis", "Ln23/h;", "firstUserWithTimeout", "(Lec3/l;JLq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/errors/ChatErrorCode;", "Ln23/c;", "toNetworkError", "(Lio/getstream/chat/android/client/errors/ChatErrorCode;)Ln23/c;", "currentUser", "fetch", "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/network/NetworkStateProvider;", "Lio/getstream/chat/android/client/socket/SocketFactory;", "Lio/getstream/chat/android/client/api/ChatApiConfig;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CurrentUserFetcher {
    private static final Companion Companion = new Companion();
    private static final long TIMEOUT_MS = 15000;
    private final ChatApiConfig config;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final NetworkStateProvider networkStateProvider;
    private final SocketFactory socketFactory;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/user/CurrentUserFetcher$Companion;", "", "<init>", "()V", "TIMEOUT_MS", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.user.CurrentUserFetcher$fetch$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.user.CurrentUserFetcher", m100430f = "CurrentUserFetcher.kt", m100431l = {59}, m100432m = "fetch")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194461 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C194461(InterfaceC30057d<? super C194461> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CurrentUserFetcher.this.fetch(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.user.CurrentUserFetcher$firstUserWithTimeout$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.user.CurrentUserFetcher", m100430f = "CurrentUserFetcher.kt", m100431l = {81}, m100432m = "firstUserWithTimeout")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194471 extends AbstractC32269c {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C194471(InterfaceC30057d<? super C194471> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CurrentUserFetcher.this.firstUserWithTimeout(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.user.CurrentUserFetcher$firstUserWithTimeout$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.user.CurrentUserFetcher$firstUserWithTimeout$2", m100430f = "CurrentUserFetcher.kt", m100431l = {88}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Lio/getstream/chat/android/models/User;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194482 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ InterfaceC13058l $this_firstUserWithTimeout;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194482(InterfaceC13058l interfaceC13058l, InterfaceC30057d<? super C194482> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$this_firstUserWithTimeout = interfaceC13058l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C194482(this.$this_firstUserWithTimeout, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C194482) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            final InterfaceC13058l interfaceC13058l = this.$this_firstUserWithTimeout;
            InterfaceC13058l interfaceC13058l2 = new InterfaceC13058l() { // from class: io.getstream.chat.android.client.user.CurrentUserFetcher$firstUserWithTimeout$2$invokeSuspend$$inlined$mapNotNull$1

                /* JADX INFO: renamed from: io.getstream.chat.android.client.user.CurrentUserFetcher$firstUserWithTimeout$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                public static final class AnonymousClass2<T> implements InterfaceC13062m {
                    final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                    /* JADX INFO: renamed from: io.getstream.chat.android.client.user.CurrentUserFetcher$firstUserWithTimeout$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.user.CurrentUserFetcher$firstUserWithTimeout$2$invokeSuspend$$inlined$mapNotNull$1$2", m100430f = "CurrentUserFetcher.kt", m100431l = {56}, m100432m = "emit")
                    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                    public static final class AnonymousClass1 extends AbstractC32269c {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        Object L$4;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                            super(interfaceC30057d);
                        }

                        @Override // s83.AbstractC32267a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC13062m interfaceC13062m) {
                        this.$this_unsafeFlow = interfaceC13062m;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // ec3.InterfaceC13062m
                    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                        AnonymousClass1 anonymousClass1;
                        Object c26204g;
                        if (interfaceC30057d instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                            int i13 = anonymousClass1.label;
                            if ((i13 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i13 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                        }
                        Object obj2 = anonymousClass1.result;
                        EnumC31071a enumC31071a = EnumC31071a.f128113w;
                        int i14 = anonymousClass1.label;
                        if (i14 == 0) {
                            AbstractC34132o.m107864I(obj2);
                            InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                            StreamWebSocketEvent streamWebSocketEvent = (StreamWebSocketEvent) obj;
                            if (streamWebSocketEvent instanceof StreamWebSocketEvent.Error) {
                                c26204g = new C26203f(((StreamWebSocketEvent.Error) streamWebSocketEvent).getStreamError());
                            } else {
                                if (!(streamWebSocketEvent instanceof StreamWebSocketEvent.Message)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ChatEvent chatEvent = ((StreamWebSocketEvent.Message) streamWebSocketEvent).getChatEvent();
                                ConnectedEvent connectedEvent = chatEvent instanceof ConnectedEvent ? (ConnectedEvent) chatEvent : null;
                                c26204g = connectedEvent != null ? new C26204g(connectedEvent.getMe()) : null;
                            }
                            if (c26204g != null) {
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.L$4 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (interfaceC13062m.emit(c26204g, anonymousClass1) == enumC31071a) {
                                    return enumC31071a;
                                }
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC34132o.m107864I(obj2);
                        }
                        return C23454a0.f92919a;
                    }
                }

                @Override // ec3.InterfaceC13058l
                public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                    Object objCollect = interfaceC13058l.collect(new AnonymousClass2(interfaceC13062m), interfaceC30057d);
                    return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
                }
            };
            this.label = 1;
            Object objM36575A = AbstractC13091v.m36575A(interfaceC13058l2, this);
            return objM36575A == enumC31071a ? enumC31071a : objM36575A;
        }
    }

    public CurrentUserFetcher(NetworkStateProvider networkStateProvider, SocketFactory socketFactory, ChatApiConfig config) {
        AbstractC22676k.m65750j(networkStateProvider, "networkStateProvider");
        AbstractC22676k.m65750j(socketFactory, "socketFactory");
        AbstractC22676k.m65750j(config, "config");
        this.networkStateProvider = networkStateProvider;
        this.socketFactory = socketFactory;
        this.config = config;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:CurrentUserFetcher");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object firstUserWithTimeout(InterfaceC13058l interfaceC13058l, long j7, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C194471 c194471;
        if (interfaceC30057d instanceof C194471) {
            c194471 = (C194471) interfaceC30057d;
            int i13 = c194471.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c194471.label = i13 - Integer.MIN_VALUE;
            } else {
                c194471 = new C194471(interfaceC30057d);
            }
        } else {
            c194471 = new C194471(interfaceC30057d);
        }
        Object objM8750d = c194471.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c194471.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8750d);
            C194482 c194482 = new C194482(interfaceC13058l, null);
            c194471.L$0 = null;
            c194471.J$0 = j7;
            c194471.label = 1;
            objM8750d = AbstractC3028k2.m8750d(j7, c194482, c194471);
            if (objM8750d == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8750d);
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) objM8750d;
        return abstractC26205h == null ? new C26203f(new C26198a("Timeout while fetching current user")) : abstractC26205h;
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final SocketFactory.ConnectionConf toConnectionConf(User user, ChatApiConfig chatApiConfig) {
        SocketFactory.ConnectionConf userConnectionConf;
        boolean isAnonymous = chatApiConfig.getIsAnonymous();
        if (isAnonymous) {
            userConnectionConf = new SocketFactory.ConnectionConf.AnonymousConnectionConf(chatApiConfig.getWssUrl(), chatApiConfig.getApiKey(), user);
        } else {
            if (isAnonymous) {
                throw new NoWhenBranchMatchedException();
            }
            userConnectionConf = new SocketFactory.ConnectionConf.UserConnectionConf(chatApiConfig.getWssUrl(), chatApiConfig.getApiKey(), user);
        }
        userConnectionConf.asReconnectionConf$stream_chat_android_client_release();
        return userConnectionConf;
    }

    private final C26200c toNetworkError(ChatErrorCode chatErrorCode) {
        return new C26200c(chatErrorCode.getDescription(), chatErrorCode.getCode(), 0, 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13, types: [io.getstream.chat.android.client.socket.StreamWebSocket] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v5 */
    public final Object fetch(User user, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C194461 c194461;
        if (interfaceC30057d instanceof C194461) {
            c194461 = (C194461) interfaceC30057d;
            int i13 = c194461.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c194461.label = i13 - Integer.MIN_VALUE;
            } else {
                c194461 = new C194461(interfaceC30057d);
            }
        } else {
            c194461 = new C194461(interfaceC30057d);
        }
        Object objFirstUserWithTimeout = c194461.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c194461.label;
        try {
            try {
                if (i14 == 0) {
                    AbstractC34132o.m107864I(objFirstUserWithTimeout);
                    C2345k logger = getLogger();
                    InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
                    EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                    if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                        logger.m7230a().log(enumC2341g, logger.m7231b(), "[fetch] no args", null);
                    }
                    if (!this.networkStateProvider.isConnected()) {
                        C2345k logger2 = getLogger();
                        InterfaceC2339e interfaceC2339eM7232c2 = logger2.m7232c();
                        EnumC2341g enumC2341g2 = EnumC2341g.WARN;
                        if (interfaceC2339eM7232c2.isLoggable(enumC2341g2, logger2.m7231b())) {
                            logger2.m7230a().log(enumC2341g2, logger2.m7231b(), "[fetch] rejected (no internet connection)", null);
                        }
                        return new C26203f(toNetworkError(ChatErrorCode.NETWORK_FAILED));
                    }
                    try {
                        StreamWebSocket streamWebSocketCreateSocket = this.socketFactory.createSocket(toConnectionConf(user, this.config));
                        InterfaceC13058l interfaceC13058lListen = streamWebSocketCreateSocket.listen();
                        c194461.L$0 = null;
                        c194461.L$1 = streamWebSocketCreateSocket;
                        c194461.label = 1;
                        objFirstUserWithTimeout = firstUserWithTimeout(interfaceC13058lListen, TIMEOUT_MS, c194461);
                        user = streamWebSocketCreateSocket;
                        if (objFirstUserWithTimeout == obj) {
                            return obj;
                        }
                    } catch (UnsupportedEncodingException e5) {
                        e = e5;
                        user = 0;
                        C2345k logger3 = getLogger();
                        InterfaceC2339e interfaceC2339eM7232c3 = logger3.m7232c();
                        EnumC2341g enumC2341g3 = EnumC2341g.ERROR;
                        if (interfaceC2339eM7232c3.isLoggable(enumC2341g3, logger3.m7231b())) {
                            logger3.m7230a().log(enumC2341g3, logger3.m7231b(), "[fetch] failed: " + e, null);
                        }
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        C26203f c26203f = new C26203f(new C26201d(message, e));
                        if (user != 0) {
                            try {
                                user.close();
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        return c26203f;
                    } catch (Throwable th3) {
                        th = th3;
                        user = 0;
                        if (user != 0) {
                            try {
                                user.close();
                            } catch (IllegalArgumentException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    StreamWebSocket streamWebSocket = (StreamWebSocket) c194461.L$1;
                    AbstractC34132o.m107864I(objFirstUserWithTimeout);
                    user = streamWebSocket;
                }
                AbstractC26205h abstractC26205h = (AbstractC26205h) objFirstUserWithTimeout;
                C2345k logger4 = getLogger();
                InterfaceC2339e interfaceC2339eM7232c4 = logger4.m7232c();
                EnumC2341g enumC2341g4 = EnumC2341g.VERBOSE;
                if (interfaceC2339eM7232c4.isLoggable(enumC2341g4, logger4.m7231b())) {
                    logger4.m7230a().log(enumC2341g4, logger4.m7231b(), "[fetch] completed: " + abstractC26205h, null);
                }
                AbstractC26205h abstractC26205h2 = (AbstractC26205h) objFirstUserWithTimeout;
                if (user == 0) {
                    return abstractC26205h2;
                }
                try {
                    user.close();
                    return abstractC26205h2;
                } catch (IllegalArgumentException unused3) {
                    return abstractC26205h2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (UnsupportedEncodingException e13) {
            e = e13;
        }
    }
}
