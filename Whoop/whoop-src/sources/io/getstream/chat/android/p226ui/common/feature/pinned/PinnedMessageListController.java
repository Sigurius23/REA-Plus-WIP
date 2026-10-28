package io.getstream.chat.android.p226ui.common.feature.pinned;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.models.PinnedMessagesPagination;
import io.getstream.chat.android.client.channel.ChannelClient;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.querysort.QuerySortByField;
import io.getstream.chat.android.p226ui.common.model.MessageResult;
import io.getstream.chat.android.p226ui.common.state.pinned.PinnedMessageListState;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import o23.InterfaceC27474d;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
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

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0'8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;", "", "", "cid", "Lio/getstream/chat/android/client/channel/ChannelClient;", "channelClient", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelClient;)V", "Ll83/a0;", "loadPinnedMessages", "(Lq83/d;)Ljava/lang/Object;", "", "shouldLoadMore", "()Z", "load", "()V", "loadMore", "Ljava/lang/String;", "Lio/getstream/chat/android/client/channel/ChannelClient;", "Lec3/p1;", "Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;", "_state", "Lec3/p1;", "Lec3/o1;", "_errorEvents", "Lec3/o1;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lbc3/c0;", "scope", "Lbc3/c0;", "Lec3/f2;", "getState", "()Lec3/f2;", "state", "Lec3/t1;", "getErrorEvents", "()Lec3/t1;", "errorEvents", "Companion", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PinnedMessageListController {
    public static final int $stable = 8;
    private static final Companion Companion = new Companion();
    private static final int QUERY_LIMIT = 30;
    private final InterfaceC13072o1 _errorEvents;
    private final InterfaceC13075p1 _state;
    private final ChannelClient channelClient;
    private final String cid;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final InterfaceC2994c0 scope;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController$Companion;", "", "<init>", "()V", "QUERY_LIMIT", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.pinned.PinnedMessageListController$load$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.pinned.PinnedMessageListController$load$1", m100430f = "PinnedMessageListController.kt", m100431l = {83}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195951 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C195951(InterfaceC30057d<? super C195951> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return PinnedMessageListController.this.new C195951(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195951) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13075p1 interfaceC13075p1 = PinnedMessageListController.this._state;
                PinnedMessageListState pinnedMessageListState = new PinnedMessageListState(false, null, false, null, 15, null);
                C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
                c13045h2.getClass();
                c13045h2.m36571k(null, pinnedMessageListState);
                PinnedMessageListController pinnedMessageListController = PinnedMessageListController.this;
                this.label = 1;
                if (pinnedMessageListController.loadPinnedMessages(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.pinned.PinnedMessageListController$loadMore$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.pinned.PinnedMessageListController$loadMore$1", m100430f = "PinnedMessageListController.kt", m100431l = {103}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195961 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C195961(InterfaceC30057d<? super C195961> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return PinnedMessageListController.this.new C195961(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195961) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13045h2 c13045h2;
            Object value;
            PinnedMessageListState pinnedMessageListState;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            if (PinnedMessageListController.this.shouldLoadMore()) {
                InterfaceC13075p1 interfaceC13075p1 = PinnedMessageListController.this._state;
                do {
                    c13045h2 = (C13045h2) interfaceC13075p1;
                    value = c13045h2.getValue();
                    pinnedMessageListState = (PinnedMessageListState) value;
                } while (!c13045h2.m36569i(value, PinnedMessageListState.copy$default(pinnedMessageListState, false, AbstractC25265s.m74128f1(new MessageResult(new Message(null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, false, -1, 65535, null), null), pinnedMessageListState.getResults()), true, null, 9, null)));
                PinnedMessageListController pinnedMessageListController = PinnedMessageListController.this;
                this.label = 1;
                if (pinnedMessageListController.loadPinnedMessages(this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.pinned.PinnedMessageListController$loadPinnedMessages$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.pinned.PinnedMessageListController", m100430f = "PinnedMessageListController.kt", m100431l = {114, 141}, m100432m = "loadPinnedMessages")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C195971 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C195971(InterfaceC30057d<? super C195971> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PinnedMessageListController.this.loadPinnedMessages(this);
        }
    }

    public PinnedMessageListController(String cid, ChannelClient channelClient) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelClient, "channelClient");
        this.cid = cid;
        this.channelClient = channelClient;
        this._state = AbstractC13091v.m36593c(new PinnedMessageListState(false, null, false, null, 15, null));
        this._errorEvents = AbstractC13091v.m36592b(0, 0, null, 7);
        this.logger = AbstractC1772c1.m5382S(this, "PinnedMessageListController");
        this.scope = AbstractC3006f0.m8708b(DispatcherProvider.INSTANCE.getMain().plus(AbstractC3006f0.m8710d()));
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object loadPinnedMessages(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C195971 c195971;
        Date nextDate;
        C13045h2 c13045h2;
        Object value;
        C13045h2 c13045h3;
        Object value2;
        PinnedMessageListState pinnedMessageListState;
        ArrayList arrayList;
        boolean z4;
        Date pinnedAt;
        if (interfaceC30057d instanceof C195971) {
            c195971 = (C195971) interfaceC30057d;
            int i13 = c195971.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c195971.label = i13 - Integer.MIN_VALUE;
            } else {
                c195971 = new C195971(interfaceC30057d);
            }
        } else {
            c195971 = new C195971(interfaceC30057d);
        }
        Object objAwait = c195971.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c195971.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objAwait);
            nextDate = ((PinnedMessageListState) ((C13045h2) this._state).getValue()).getNextDate();
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "Loading pinned messages (cid: " + this.cid + ", before: " + nextDate + ", limit: 30)", null);
            }
            InterfaceC27474d pinnedMessages = this.channelClient.getPinnedMessages(30, QuerySortByField.INSTANCE.descByName("pinned_at"), new PinnedMessagesPagination.BeforeDate(nextDate, false));
            c195971.L$0 = nextDate;
            c195971.label = 1;
            objAwait = pinnedMessages.await(c195971);
            if (objAwait != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objAwait);
            return c23454a0;
        }
        nextDate = (Date) c195971.L$0;
        AbstractC34132o.m107864I(objAwait);
        AbstractC26205h abstractC26205h = (AbstractC26205h) objAwait;
        if (abstractC26205h instanceof C26204g) {
            List list = (List) ((C26204g) abstractC26205h).f103919a;
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, AbstractC2875y.m8296i(list.size(), "Loaded ", " pinned messages"), null);
            }
            InterfaceC13075p1 interfaceC13075p1 = this._state;
            do {
                c13045h3 = (C13045h2) interfaceC13075p1;
                value2 = c13045h3.getValue();
                pinnedMessageListState = (PinnedMessageListState) value2;
                List<MessageResult> results = pinnedMessageListState.getResults();
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new MessageResult((Message) it.next(), null));
                }
                ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(results, arrayList2);
                arrayList = new ArrayList();
                for (Object obj : arrayListM74129g1) {
                    if (((MessageResult) obj).getMessage().getId().length() > 0) {
                        arrayList.add(obj);
                    }
                }
                z4 = list.size() == 30;
                Message message = (Message) AbstractC25265s.m74114R0(list);
                if (message == null || (pinnedAt = message.getPinnedAt()) == null) {
                    pinnedAt = nextDate;
                }
            } while (!c13045h3.m36569i(value2, pinnedMessageListState.copy(z4, arrayList, false, pinnedAt)));
        } else {
            if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            C2345k logger3 = getLogger();
            InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
            String str3 = logger3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                logger3.f9274b.log(enumC2341g3, str3, AbstractC11266d.m30461o("Loading pinned messages failed: ", ((C26203f) abstractC26205h).f103918a.mo77807a()), null);
            }
            InterfaceC13075p1 interfaceC13075p2 = this._state;
            do {
                c13045h2 = (C13045h2) interfaceC13075p2;
                value = c13045h2.getValue();
            } while (!c13045h2.m36569i(value, PinnedMessageListState.copy$default((PinnedMessageListState) value, true, null, false, null, 10, null)));
            InterfaceC13072o1 interfaceC13072o1 = this._errorEvents;
            c195971.L$0 = null;
            c195971.L$1 = null;
            c195971.label = 2;
            if (interfaceC13072o1.emit(c23454a0, c195971) == enumC31071a) {
                return enumC31071a;
            }
        }
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldLoadMore() {
        PinnedMessageListState pinnedMessageListState = (PinnedMessageListState) ((C13045h2) this._state).getValue();
        if (!pinnedMessageListState.getCanLoadMore()) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "No more messages to load", null);
                return false;
            }
        } else {
            if (!pinnedMessageListState.isLoading()) {
                return true;
            }
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, "Already loading", null);
            }
        }
        return false;
    }

    public final InterfaceC13087t1 getErrorEvents() {
        return this._errorEvents;
    }

    public final InterfaceC13037f2 getState() {
        return this._state;
    }

    public final void load() {
        AbstractC3006f0.m8732z(this.scope, null, null, new C195951(null), 3);
    }

    public final void loadMore() {
        AbstractC3006f0.m8732z(this.scope, null, null, new C195961(null), 3);
    }

    public /* synthetic */ PinnedMessageListController(String str, ChannelClient channelClient, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? ChatClient.INSTANCE.instance().channel(str) : channelClient);
    }
}
