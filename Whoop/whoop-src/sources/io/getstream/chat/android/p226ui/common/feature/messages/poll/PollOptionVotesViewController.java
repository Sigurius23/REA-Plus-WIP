package io.getstream.chat.android.p226ui.common.feature.messages.poll;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.C13096w1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.extensions.internal.PollKt;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Filters;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.QueryPollVotesResult;
import io.getstream.chat.android.models.Vote;
import io.getstream.chat.android.models.querysort.QuerySortByField;
import io.getstream.chat.android.p226ui.common.state.messages.poll.PollOptionVotesViewState;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.C25271y;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020.018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010)R\u001d\u00109\u001a\b\u0012\u0004\u0012\u000206088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;", "", "Lio/getstream/chat/android/models/Poll;", "poll", "Lio/getstream/chat/android/models/Option;", "option", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "Lbc3/c0;", "scope", "<init>", "(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;)V", "Ln23/h;", "Lio/getstream/chat/android/models/QueryPollVotesResult;", "fetchPollVotes", "(Lq83/d;)Ljava/lang/Object;", "result", "Ll83/a0;", "onSuccessResult", "(Lio/getstream/chat/android/models/QueryPollVotesResult;)V", "Ln23/e;", "error", "onFailureResult", "(Ln23/e;)V", "loadMore", "()V", "Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewAction;", "action", "onViewAction", "(Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewAction;)V", "Lio/getstream/chat/android/models/Poll;", "Lio/getstream/chat/android/models/Option;", "Lio/getstream/chat/android/client/ChatClient;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lec3/o1;", "loadRequests", "Lec3/o1;", "", "nextPage", "Ljava/lang/String;", "Lec3/p1;", "Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;", "_state", "Lec3/p1;", "Lec3/f2;", "state", "Lec3/f2;", "getState", "()Lec3/f2;", "Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewEvent;", "_events", "Lec3/t1;", "events", "Lec3/t1;", "getEvents", "()Lec3/t1;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PollOptionVotesViewController {
    public static final int $stable = 8;
    private final InterfaceC13072o1 _events;
    private final InterfaceC13075p1 _state;
    private final ChatClient chatClient;
    private final InterfaceC13087t1 events;
    private final InterfaceC13072o1 loadRequests;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private String nextPage;
    private final Option option;
    private final Poll poll;
    private final InterfaceC13037f2 state;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.poll.PollOptionVotesViewController$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.poll.PollOptionVotesViewController$1", m100430f = "PollOptionVotesViewController.kt", m100431l = {102}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195931 extends AbstractC32275i implements InterfaceC4351m {
        private /* synthetic */ Object L$0;
        int label;

        public C195931(InterfaceC30057d<? super C195931> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195931 c195931 = new C195931(2, interfaceC30057d);
            c195931.L$0 = obj;
            return c195931;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195931) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.L$0 = null;
                this.label = 1;
                if (interfaceC13062m.emit(c23454a0, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.poll.PollOptionVotesViewController$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.poll.PollOptionVotesViewController$3", m100430f = "PollOptionVotesViewController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/QueryPollVotesResult;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195943 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C195943(InterfaceC30057d<? super C195943> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195943 c195943 = PollOptionVotesViewController.this.new C195943(interfaceC30057d);
            c195943.L$0 = obj;
            return c195943;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((AbstractC26205h) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            PollOptionVotesViewController pollOptionVotesViewController = PollOptionVotesViewController.this;
            boolean z4 = abstractC26205h instanceof C26204g;
            if (z4) {
                pollOptionVotesViewController.onSuccessResult((QueryPollVotesResult) ((C26204g) abstractC26205h).f103919a);
            } else if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            PollOptionVotesViewController pollOptionVotesViewController2 = PollOptionVotesViewController.this;
            if (!z4) {
                if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                pollOptionVotesViewController2.onFailureResult(((C26203f) abstractC26205h).f103918a);
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195943 c195943 = (C195943) create(abstractC26205h, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195943.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    public PollOptionVotesViewController(Poll poll, Option option, ChatClient chatClient, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC22676k.m65750j(option, "option");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(scope, "scope");
        this.poll = poll;
        this.option = option;
        this.chatClient = chatClient;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:PollOptionVotesViewController");
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 1, null, 5);
        this.loadRequests = c13096w1M36592b;
        Integer num = poll.getVoteCountsByOption().get(option.getId());
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new PollOptionVotesViewState(option, num != null ? num.intValue() : 0, AbstractC22676k.m65745e(PollKt.getWinner(poll), option), false, null, false, false, 120, null));
        this._state = c13045h2M36593c;
        this.state = AbstractC13091v.m36598h(c13045h2M36593c);
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 1, null, 5);
        this._events = c13096w1M36592b2;
        this.events = AbstractC13091v.m36597g(c13096w1M36592b2);
        AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36590P(new C13015a0(new C195931(2, null), c13096w1M36592b), new PollOptionVotesViewController$special$$inlined$flatMapLatest$1(null, this)), new C195943(null), 0), scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchPollVotes(InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            String id4 = this.poll.getId();
            String id5 = this.option.getId();
            String str2 = this.nextPage;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("[fetchPollVotes] Fetching votes for poll: ", id4, ", option: ", id5, ", limit: 25, next: ");
            sbM32001t.append(str2);
            interfaceC2344j.log(enumC2341g, str, sbM32001t.toString(), null);
        }
        return this.chatClient.queryPollVotes(this.poll.getId(), Filters.m54979eq("option_id", this.option.getId()), new Integer(25), this.nextPage, QuerySortByField.INSTANCE.descByName("created_at")).await(interfaceC30057d);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final void loadMore() {
        PollOptionVotesViewState pollOptionVotesViewState = (PollOptionVotesViewState) this.state.getValue();
        if (pollOptionVotesViewState.isLoading()) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[loadMore] still loading initial votes, cannot load more", null);
                return;
            }
            return;
        }
        if (!pollOptionVotesViewState.getCanLoadMore()) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, "[loadMore] no more votes to load", null);
                return;
            }
            return;
        }
        if (pollOptionVotesViewState.isLoadingMore()) {
            C2345k logger3 = getLogger();
            InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
            String str3 = logger3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                logger3.f9274b.log(enumC2341g3, str3, "[loadMore] already loading more votes", null);
                return;
            }
            return;
        }
        C2345k logger4 = getLogger();
        InterfaceC2339e interfaceC2339e4 = logger4.f9275c;
        String str4 = logger4.f9273a;
        EnumC2341g enumC2341g4 = EnumC2341g.DEBUG;
        if (interfaceC2339e4.isLoggable(enumC2341g4, str4)) {
            logger4.f9274b.log(enumC2341g4, str4, "[loadMore] loading more votes", null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        PollOptionVotesViewState pollOptionVotesViewStateCopy$default = PollOptionVotesViewState.copy$default(pollOptionVotesViewState, null, 0, false, false, null, false, true, 63, null);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, pollOptionVotesViewStateCopy$default);
        this.loadRequests.mo36564a(C23454a0.f92919a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFailureResult(AbstractC26202e error) {
        C13045h2 c13045h2;
        Object value;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[onFailureResult] error: ", error.mo77807a()), null);
        }
        this._events.mo36564a(new PollOptionVotesViewEvent.LoadError(error));
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, PollOptionVotesViewState.copy$default((PollOptionVotesViewState) value, null, 0, false, false, null, false, false, 55, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSuccessResult(QueryPollVotesResult result) {
        C13045h2 c13045h2;
        Object value;
        PollOptionVotesViewState pollOptionVotesViewState;
        this.nextPage = result.getNext();
        List<Vote> votes = result.getVotes();
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30456j(votes.size(), "[onSuccessResult] Fetched ", " votes, next: ", this.nextPage), null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            pollOptionVotesViewState = (PollOptionVotesViewState) value;
        } while (!c13045h2.m36569i(value, PollOptionVotesViewState.copy$default(pollOptionVotesViewState, null, 0, false, false, AbstractC25265s.m74129g1(!pollOptionVotesViewState.isLoading() ? pollOptionVotesViewState.getResults() : C25271y.f99162w, votes), this.nextPage != null, false, 7, null)));
    }

    public final InterfaceC13087t1 getEvents() {
        return this.events;
    }

    public final InterfaceC13037f2 getState() {
        return this.state;
    }

    public final void onViewAction(PollOptionVotesViewAction action) {
        AbstractC22676k.m65750j(action, "action");
        if (!action.equals(PollOptionVotesViewAction.LoadMoreRequested.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        loadMore();
    }

    public /* synthetic */ PollOptionVotesViewController(Poll poll, Option option, ChatClient chatClient, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(poll, option, (i13 & 4) != 0 ? ChatClient.INSTANCE.instance() : chatClient, interfaceC2994c0);
    }
}
