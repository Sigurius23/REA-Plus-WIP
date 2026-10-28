package io.getstream.chat.android.p226ui.common.feature.threads;

import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ch.C4588i;
import com.whoop.service.network.model.UserState;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import fc3.C14380k;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.models.QueryThreadsRequest;
import io.getstream.chat.android.client.api.state.QueryThreadsState;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.C19336c;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.p226ui.common.state.threads.ThreadListState;
import l83.C23454a0;
import m83.C25271y;
import o23.C27481k;
import p505ts.AbstractC34132o;
import p710im1.C18656a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\b¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\t8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190\t8F¢\u0006\u0006\u001a\u0004\b%\u0010 ¨\u0006("}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;", "", "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;", "query", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "Lbc3/c0;", "scope", "Lkotlin/Function0;", "Lec3/f2;", "Lio/getstream/chat/android/client/api/state/QueryThreadsState;", "queryThreadsAsState", "<init>", "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lc93/a;)V", "", "getNextPage", "()Ljava/lang/String;", "Ll83/a0;", "load", "()V", "loadNextPage", "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;", "Lio/getstream/chat/android/client/ChatClient;", "Lbc3/c0;", "Lec3/p1;", "Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;", "_state", "Lec3/p1;", "Lio/getstream/chat/android/models/ConnectionState;", "connectionState", "Lec3/f2;", "getConnectionState", "()Lec3/f2;", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "getUser", "queryThreadsState", "getState", "state", "Companion", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadListController {
    public static final int $stable = 8;
    public static final int DEFAULT_THREAD_LIMIT = 25;
    public static final int DEFAULT_THREAD_PARTICIPANT_LIMIT = 10;
    public static final int DEFAULT_THREAD_REPLY_LIMIT = 10;
    private final InterfaceC13075p1 _state;
    private final ChatClient chatClient;
    private final InterfaceC13037f2 connectionState;
    private final QueryThreadsRequest query;
    private final InterfaceC13037f2 queryThreadsState;
    private final InterfaceC2994c0 scope;
    private final InterfaceC13037f2 user;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final ThreadListState INITIAL_STATE = new ThreadListState(C25271y.f99162w, true, false, 0, false);

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.threads.ThreadListController$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.threads.ThreadListController$3", m100430f = "ThreadListController.kt", m100431l = {95}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195983 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.threads.ThreadListController$3$2, reason: invalid class name */
        @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.threads.ThreadListController$3$2", m100430f = "ThreadListController.kt", m100431l = {}, m100432m = "invokeSuspend")
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;", "it", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
        public static final class AnonymousClass2 extends AbstractC32275i implements InterfaceC4351m {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ThreadListController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ThreadListController threadListController, InterfaceC30057d<? super AnonymousClass2> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.this$0 = threadListController;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, interfaceC30057d);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            public final Object invoke(ThreadListState threadListState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(threadListState, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                anonymousClass2.invokeSuspend(c23454a0);
                return c23454a0;
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                ThreadListState threadListState = (ThreadListState) this.L$0;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                ((C13045h2) this.this$0._state).m36570j(threadListState);
                return C23454a0.f92919a;
            }

            @Override // c93.InterfaceC4351m
            public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ThreadListState) obj, (InterfaceC30057d<? super C23454a0>) obj2);
                return C23454a0.f92919a;
            }
        }

        public C195983(InterfaceC30057d<? super C195983> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ThreadListController.this.new C195983(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195983) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C14380k c14380kM36590P = AbstractC13091v.m36590P(new C4588i(ThreadListController.this.queryThreadsState, 2), new ThreadListController$3$invokeSuspend$$inlined$flatMapLatest$1(3, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(ThreadListController.this, null);
                this.label = 1;
                if (AbstractC13091v.m36604n(c14380kM36590P, anonymousClass2, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$Companion;", "", "<init>", "()V", "DEFAULT_THREAD_LIMIT", "", "getDEFAULT_THREAD_LIMIT$annotations", "DEFAULT_THREAD_REPLY_LIMIT", "getDEFAULT_THREAD_REPLY_LIMIT$annotations", "DEFAULT_THREAD_PARTICIPANT_LIMIT", "getDEFAULT_THREAD_PARTICIPANT_LIMIT$annotations", "INITIAL_STATE", "Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @InternalStreamChatApi
        public static /* synthetic */ void getDEFAULT_THREAD_LIMIT$annotations() {
        }

        @InternalStreamChatApi
        public static /* synthetic */ void getDEFAULT_THREAD_PARTICIPANT_LIMIT$annotations() {
        }

        @InternalStreamChatApi
        public static /* synthetic */ void getDEFAULT_THREAD_REPLY_LIMIT$annotations() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ThreadListController(QueryThreadsRequest query, ChatClient chatClient, InterfaceC2994c0 scope, InterfaceC4339a queryThreadsAsState) {
        AbstractC22676k.m65750j(query, "query");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(queryThreadsAsState, "queryThreadsAsState");
        this.query = query;
        this.chatClient = chatClient;
        this.scope = scope;
        this._state = AbstractC13091v.m36593c(INITIAL_STATE);
        this.connectionState = chatClient.getClientState().getConnectionState();
        this.user = chatClient.getClientState().getUser();
        this.queryThreadsState = (InterfaceC13037f2) queryThreadsAsState.invoke();
        AbstractC3006f0.m8732z(scope, null, null, new C195983(null), 3);
    }

    private static final InterfaceC30063j _init_$lambda$0(InterfaceC3027k1 it) {
        AbstractC22676k.m65750j(it, "it");
        return DispatcherProvider.INSTANCE.getIO();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ AbstractC3076z m55066a(InterfaceC3027k1 interfaceC3027k1) {
        return (AbstractC3076z) _init_$lambda$0(interfaceC3027k1);
    }

    private final String getNextPage() {
        QueryThreadsState queryThreadsState;
        InterfaceC13037f2 next;
        ThreadListState threadListState = (ThreadListState) ((C13045h2) this._state).getValue();
        if (threadListState.isLoading() || threadListState.isLoadingMore() || (queryThreadsState = (QueryThreadsState) this.queryThreadsState.getValue()) == null || (next = queryThreadsState.getNext()) == null) {
            return null;
        }
        return (String) next.getValue();
    }

    public final InterfaceC13037f2 getConnectionState() {
        return this.connectionState;
    }

    public final InterfaceC13037f2 getState() {
        return this._state;
    }

    public final InterfaceC13037f2 getUser() {
        return this.user;
    }

    public final void load() {
        ((C27481k) this.chatClient.queryThreads(this.query)).enqueue();
    }

    public final void loadNextPage() {
        String nextPage = getNextPage();
        if (nextPage == null) {
            return;
        }
        ((C27481k) this.chatClient.queryThreads(QueryThreadsRequest.copy$default(this.query, null, null, false, 0, 0, nextPage, 0, null, 0, 479, null))).enqueue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ThreadListController(QueryThreadsRequest queryThreadsRequest, ChatClient chatClient, InterfaceC2994c0 interfaceC2994c0, InterfaceC4339a interfaceC4339a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        chatClient = (i13 & 2) != 0 ? ChatClient.INSTANCE.instance() : chatClient;
        interfaceC2994c0 = (i13 & 4) != 0 ? chatClient.inheritScope(new C19336c(24)) : interfaceC2994c0;
        this(queryThreadsRequest, chatClient, interfaceC2994c0, (i13 & 8) != 0 ? new C18656a0(chatClient, queryThreadsRequest, interfaceC2994c0, 5) : interfaceC4339a);
    }
}
