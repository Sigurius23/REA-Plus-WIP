package io.getstream.chat.android.p226ui.common.feature.mentions;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
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
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.persistance.repository.RepositoryFacade;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Filters;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.SearchMessagesResult;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.querysort.QuerySorter;
import io.getstream.chat.android.p226ui.common.model.MessageResult;
import io.getstream.chat.android.p226ui.common.state.mentions.MentionListEvent;
import io.getstream.chat.android.p226ui.common.state.mentions.MentionListState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020&0)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010$R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020.008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00065"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;", "", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Message;", "sort", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "<init>", "(Lbc3/c0;Lio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/ChatClient;)V", "Ln23/h;", "Lio/getstream/chat/android/models/SearchMessagesResult;", "searchMentions", "(Lq83/d;)Ljava/lang/Object;", "result", "Ll83/a0;", "onSuccessResult", "(Lio/getstream/chat/android/models/SearchMessagesResult;Lq83/d;)Ljava/lang/Object;", "Ln23/e;", "error", "onFailureResult", "(Ln23/e;)V", "loadMore", "()V", "refresh", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/client/ChatClient;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lec3/o1;", "loadRequests", "Lec3/o1;", "Lec3/p1;", "Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;", "_state", "Lec3/p1;", "Lec3/f2;", "state", "Lec3/f2;", "getState", "()Lec3/f2;", "Lio/getstream/chat/android/ui/common/state/mentions/MentionListEvent;", "_events", "Lec3/t1;", "events", "Lec3/t1;", "getEvents", "()Lec3/t1;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MentionListController {
    public static final int $stable = 8;
    private final InterfaceC13072o1 _events;
    private final InterfaceC13075p1 _state;
    private final ChatClient chatClient;
    private final InterfaceC13087t1 events;
    private final InterfaceC13072o1 loadRequests;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final QuerySorter<Message> sort;
    private final InterfaceC13037f2 state;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.mentions.MentionListController$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.mentions.MentionListController$1", m100430f = "MentionListController.kt", m100431l = {77}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195011 extends AbstractC32275i implements InterfaceC4351m {
        private /* synthetic */ Object L$0;
        int label;

        public C195011(InterfaceC30057d<? super C195011> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195011 c195011 = new C195011(2, interfaceC30057d);
            c195011.L$0 = obj;
            return c195011;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195011) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
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

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.mentions.MentionListController$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.mentions.MentionListController$3", m100430f = "MentionListController.kt", m100431l = {81}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/SearchMessagesResult;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195023 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C195023(InterfaceC30057d<? super C195023> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195023 c195023 = MentionListController.this.new C195023(interfaceC30057d);
            c195023.L$0 = obj;
            return c195023;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (abstractC26205h instanceof C26204g) {
                    MentionListController mentionListController = MentionListController.this;
                    SearchMessagesResult searchMessagesResult = (SearchMessagesResult) ((C26204g) abstractC26205h).f103919a;
                    this.L$0 = null;
                    this.label = 1;
                    if (mentionListController.onSuccessResult(searchMessagesResult, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (!(abstractC26205h instanceof C26203f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MentionListController.this.onFailureResult(((C26203f) abstractC26205h).f103918a);
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195023) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.mentions.MentionListController$onSuccessResult$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.mentions.MentionListController", m100430f = "MentionListController.kt", m100431l = {148}, m100432m = "onSuccessResult")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C195031 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C195031(InterfaceC30057d<? super C195031> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MentionListController.this.onSuccessResult(null, this);
        }
    }

    public MentionListController(InterfaceC2994c0 scope, QuerySorter<Message> querySorter, ChatClient chatClient) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        this.sort = querySorter;
        this.chatClient = chatClient;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:MentionListController");
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 1, null, 5);
        this.loadRequests = c13096w1M36592b;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new MentionListState(false, null, null, false, false, false, 63, null));
        this._state = c13045h2M36593c;
        this.state = AbstractC13091v.m36598h(c13045h2M36593c);
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 1, null, 5);
        this._events = c13096w1M36592b2;
        this.events = AbstractC13091v.m36597g(c13096w1M36592b2);
        AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36590P(new C13015a0(new C195011(2, null), c13096w1M36592b), new MentionListController$special$$inlined$flatMapLatest$1(null, this)), new C195023(null), 0), scope);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
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
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, MentionListState.copy$default((MentionListState) value, false, null, null, false, false, false, 14, null)));
        this._events.mo36564a(new MentionListEvent.Error(error.mo77807a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object onSuccessResult(SearchMessagesResult searchMessagesResult, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C195031 c195031;
        List<Message> messages;
        String str;
        Object next;
        if (interfaceC30057d instanceof C195031) {
            c195031 = (C195031) interfaceC30057d;
            int i13 = c195031.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c195031.label = i13 - Integer.MIN_VALUE;
            } else {
                c195031 = new C195031(interfaceC30057d);
            }
        } else {
            c195031 = new C195031(interfaceC30057d);
        }
        Object obj = c195031.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c195031.label;
        int i15 = 10;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            messages = searchMessagesResult.getMessages();
            String next2 = searchMessagesResult.getNext();
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str2 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                logger.f9274b.log(enumC2341g, str2, AbstractC11266d.m30456j(messages.size(), "[onSuccessResult] messages: ", ", next: ", next2), null);
            }
            RepositoryFacade repositoryFacade = this.chatClient.getRepositoryFacade();
            List<Message> list = messages;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Message) it.next()).getCid());
            }
            c195031.L$0 = null;
            c195031.L$1 = messages;
            c195031.L$2 = next2;
            c195031.label = 1;
            Object objSelectChannels = repositoryFacade.selectChannels(arrayList, null, c195031);
            if (objSelectChannels == enumC31071a) {
                return enumC31071a;
            }
            str = next2;
            obj = objSelectChannels;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) c195031.L$2;
            messages = (List) c195031.L$1;
            AbstractC34132o.m107864I(obj);
            str = str3;
        }
        List list2 = (List) obj;
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        while (true) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            Object value = c13045h2.getValue();
            MentionListState mentionListState = (MentionListState) value;
            List<MessageResult> results = mentionListState.isRefreshing() ? C25271y.f99162w : mentionListState.getResults();
            List<Message> list3 = messages;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list3, i15));
            for (Message message : list3) {
                Iterator it3 = list2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!AbstractC22676k.m65745e(((Channel) next).getCid(), message.getCid()));
                arrayList2.add(new MessageResult(message, (Channel) next));
            }
            if (c13045h2.m36569i(value, mentionListState.copy(false, AbstractC25265s.m74129g1(results, arrayList2), str, str != null, false, false))) {
                return C23454a0.f92919a;
            }
            i15 = 10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object searchMentions(InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        User currentUser = this.chatClient.getCurrentUser();
        if (currentUser == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        FilterObject filterObjectM54980in = Filters.m54980in(QueryChannelRequest.KEY_MEMBERS, (List<? extends Object>) AbstractC37056f.m118958J(currentUser.getId()));
        FilterObject filterObjectContains = Filters.contains("mentioned_users.id", currentUser.getId());
        MentionListState mentionListState = (MentionListState) ((C13045h2) this._state).getValue();
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC31061c.m95640p("[searchMentions] currentUser: ", currentUser.getId(), ", limit: 30, nextPage: ", mentionListState.getNextPage$stream_chat_android_ui_common_release()), null);
        }
        return ChatClient.searchMessages$default(this.chatClient, filterObjectM54980in, filterObjectContains, null, new Integer(30), mentionListState.getNextPage$stream_chat_android_ui_common_release(), this.sort, 4, null).await(interfaceC30057d);
    }

    public final InterfaceC13087t1 getEvents() {
        return this.events;
    }

    public final InterfaceC13037f2 getState() {
        return this.state;
    }

    public final void loadMore() {
        MentionListState mentionListState = (MentionListState) this.state.getValue();
        if (!mentionListState.getCanLoadMore()) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[loadMore] no more mentions to load", null);
                return;
            }
            return;
        }
        if (mentionListState.isLoadingMore()) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, "[loadMore] already loading more mentions", null);
                return;
            }
            return;
        }
        if (mentionListState.isRefreshing()) {
            C2345k logger3 = getLogger();
            InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
            String str3 = logger3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                logger3.f9274b.log(enumC2341g3, str3, "[loadMore] already refreshing mentions", null);
                return;
            }
            return;
        }
        C2345k logger4 = getLogger();
        InterfaceC2339e interfaceC2339e4 = logger4.f9275c;
        String str4 = logger4.f9273a;
        EnumC2341g enumC2341g4 = EnumC2341g.DEBUG;
        if (interfaceC2339e4.isLoggable(enumC2341g4, str4)) {
            logger4.f9274b.log(enumC2341g4, str4, "[loadMore] no args", null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        MentionListState mentionListStateCopy$default = MentionListState.copy$default(mentionListState, false, null, null, false, true, false, 47, null);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, mentionListStateCopy$default);
        this.loadRequests.mo36564a(C23454a0.f92919a);
    }

    public final void refresh() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[refresh] no args", null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        MentionListState mentionListState = new MentionListState(false, null, null, false, false, true, 30, null);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, mentionListState);
        this.loadRequests.mo36564a(C23454a0.f92919a);
    }

    public /* synthetic */ MentionListController(InterfaceC2994c0 interfaceC2994c0, QuerySorter querySorter, ChatClient chatClient, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2994c0, querySorter, (i13 & 4) != 0 ? ChatClient.INSTANCE.instance() : chatClient);
    }
}
