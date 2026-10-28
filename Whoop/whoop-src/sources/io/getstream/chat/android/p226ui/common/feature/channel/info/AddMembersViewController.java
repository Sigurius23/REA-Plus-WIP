package io.getstream.chat.android.p226ui.common.feature.channel.info;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import fc3.C14380k;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.models.QueryUsersRequest;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Filters;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.querysort.QuerySortByField;
import io.getstream.chat.android.p226ui.common.state.channel.info.AddMembersViewState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import m83.AbstractC25265s;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import o23.InterfaceC27474d;
import p098dt.AbstractC12350b;
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
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u0015*\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020(0+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;", "", "Lbc3/c0;", "scope", "", "resultLimit", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "Lec3/l;", "Lio/getstream/chat/android/client/channel/state/ChannelState;", "channelState", "<init>", "(Lbc3/c0;ILio/getstream/chat/android/client/ChatClient;Lec3/l;)V", "", "query", "Ll83/a0;", "searchUsers", "(Ljava/lang/String;)V", "loadMore", "()V", MapboxMap.QFE_OFFSET, "Lio/getstream/chat/android/client/api/models/QueryUsersRequest;", "toSearchRequest", "(Ljava/lang/String;I)Lio/getstream/chat/android/client/api/models/QueryUsersRequest;", "Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction;", "action", "onViewAction", "(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewAction;)V", "Lbc3/c0;", "I", "Lio/getstream/chat/android/client/ChatClient;", "", "Lio/getstream/chat/android/models/Member;", "channelMembers", "Lec3/l;", "Lbc3/k1;", "searchJob", "Lbc3/k1;", "loadMoreJob", "Lec3/p1;", "Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;", "_state", "Lec3/p1;", "Lec3/f2;", "state", "Lec3/f2;", "getState", "()Lec3/f2;", "Companion", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AddMembersViewController {
    public static final int $stable = 8;
    private static final Companion Companion = new Companion();
    private static final int DEFAULT_RESULT_LIMIT = 30;
    private static final long TYPING_DEBOUNCE_TIMEOUT_MS = 300;
    private final InterfaceC13075p1 _state;
    private final InterfaceC13058l channelMembers;
    private final ChatClient chatClient;
    private InterfaceC3027k1 loadMoreJob;
    private final int resultLimit;
    private final InterfaceC2994c0 scope;
    private InterfaceC3027k1 searchJob;
    private final InterfaceC13037f2 state;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.AddMembersViewController$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.AddMembersViewController$2", m100430f = "AddMembersViewController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "", "memberIds", "Ll83/a0;", "<anonymous>", "(Ljava/util/Set;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194742 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C194742(InterfaceC30057d<? super C194742> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C194742 c194742 = AddMembersViewController.this.new C194742(interfaceC30057d);
            c194742.L$0 = obj;
            return c194742;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Set<String>) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13045h2 c13045h2;
            Object value;
            Set set = (Set) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC13075p1 interfaceC13075p1 = AddMembersViewController.this._state;
            do {
                c13045h2 = (C13045h2) interfaceC13075p1;
                value = c13045h2.getValue();
            } while (!c13045h2.m36569i(value, AddMembersViewState.copy$default((AddMembersViewState) value, false, false, null, null, null, set, 31, null)));
            return C23454a0.f92919a;
        }

        public final Object invoke(Set<String> set, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C194742 c194742 = (C194742) create(set, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c194742.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.AddMembersViewController$4 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.AddMembersViewController$4", m100430f = "AddMembersViewController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "query", "Ll83/a0;", "<anonymous>", "(Ljava/lang/String;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194754 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C194754(InterfaceC30057d<? super C194754> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C194754 c194754 = AddMembersViewController.this.new C194754(interfaceC30057d);
            c194754.L$0 = obj;
            return c194754;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AddMembersViewController.this.searchUsers(str);
            return C23454a0.f92919a;
        }

        public final Object invoke(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C194754 c194754 = (C194754) create(str, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c194754.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$Companion;", "", "<init>", "()V", "DEFAULT_RESULT_LIMIT", "", "TYPING_DEBOUNCE_TIMEOUT_MS", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.AddMembersViewController$loadMore$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.AddMembersViewController$loadMore$1", m100430f = "AddMembersViewController.kt", m100431l = {146}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194761 extends AbstractC32275i implements InterfaceC4351m {
        Object L$0;
        int label;

        public C194761(InterfaceC30057d<? super C194761> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AddMembersViewController.this.new C194761(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194761) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13045h2 c13045h2;
            Object value;
            C13045h2 c13045h3;
            Object value2;
            C13045h2 c13045h4;
            Object value3;
            AddMembersViewState addMembersViewState;
            ArrayList arrayList;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                List<User> searchResult = ((AddMembersViewState) ((C13045h2) AddMembersViewController.this._state).getValue()).getSearchResult();
                InterfaceC13075p1 interfaceC13075p1 = AddMembersViewController.this._state;
                do {
                    c13045h2 = (C13045h2) interfaceC13075p1;
                    value = c13045h2.getValue();
                } while (!c13045h2.m36569i(value, AddMembersViewState.copy$default((AddMembersViewState) value, false, true, null, null, null, null, 61, null)));
                ChatClient chatClient = AddMembersViewController.this.chatClient;
                AddMembersViewController addMembersViewController = AddMembersViewController.this;
                InterfaceC27474d interfaceC27474dQueryUsers = chatClient.queryUsers(addMembersViewController.toSearchRequest(AbstractC39414r.m125869O0(((AddMembersViewState) ((C13045h2) addMembersViewController._state).getValue()).getQuery()).toString(), searchResult.size()));
                this.L$0 = null;
                this.label = 1;
                obj = interfaceC27474dQueryUsers.await(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
            AddMembersViewController addMembersViewController2 = AddMembersViewController.this;
            boolean z4 = abstractC26205h instanceof C26204g;
            if (z4) {
                List list = (List) ((C26204g) abstractC26205h).f103919a;
                InterfaceC13075p1 interfaceC13075p2 = addMembersViewController2._state;
                do {
                    c13045h4 = (C13045h2) interfaceC13075p2;
                    value3 = c13045h4.getValue();
                    addMembersViewState = (AddMembersViewState) value3;
                    List<User> searchResult2 = addMembersViewState.getSearchResult();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator<T> it = searchResult2.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(((User) it.next()).getId());
                    }
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!linkedHashSet.contains(((User) obj2).getId())) {
                            arrayList.add(obj2);
                        }
                    }
                } while (!c13045h4.m36569i(value3, AddMembersViewState.copy$default(addMembersViewState, false, false, null, AbstractC25265s.m74129g1(addMembersViewState.getSearchResult(), arrayList), null, null, 53, null)));
            } else if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            AddMembersViewController addMembersViewController3 = AddMembersViewController.this;
            if (!z4) {
                if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC13075p1 interfaceC13075p3 = addMembersViewController3._state;
                do {
                    c13045h3 = (C13045h2) interfaceC13075p3;
                    value2 = c13045h3.getValue();
                } while (!c13045h3.m36569i(value2, AddMembersViewState.copy$default((AddMembersViewState) value2, false, false, null, null, null, null, 61, null)));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.AddMembersViewController$searchUsers$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.AddMembersViewController$searchUsers$1", m100430f = "AddMembersViewController.kt", m100431l = {128}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194771 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $query;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194771(String str, InterfaceC30057d<? super C194771> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$query = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C194771 c194771 = AddMembersViewController.this.new C194771(this.$query, interfaceC30057d);
            c194771.L$0 = obj;
            return c194771;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194771) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13045h2 c13045h2;
            Object value;
            C13045h2 c13045h3;
            Object value2;
            C13045h2 c13045h4;
            Object value3;
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13075p1 interfaceC13075p1 = AddMembersViewController.this._state;
                do {
                    c13045h2 = (C13045h2) interfaceC13075p1;
                    value = c13045h2.getValue();
                } while (!c13045h2.m36569i(value, AddMembersViewState.copy$default((AddMembersViewState) value, true, false, null, null, null, null, 62, null)));
                InterfaceC27474d interfaceC27474dQueryUsers = AddMembersViewController.this.chatClient.queryUsers(AddMembersViewController.this.toSearchRequest(AbstractC39414r.m125869O0(this.$query).toString(), 0));
                this.L$0 = interfaceC2994c0;
                this.label = 1;
                obj = interfaceC27474dQueryUsers.await(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
            AddMembersViewController addMembersViewController = AddMembersViewController.this;
            boolean z4 = abstractC26205h instanceof C26204g;
            if (z4) {
                List list = (List) ((C26204g) abstractC26205h).f103919a;
                if (AbstractC3006f0.m8729w(interfaceC2994c0)) {
                    InterfaceC13075p1 interfaceC13075p2 = addMembersViewController._state;
                    do {
                        c13045h4 = (C13045h2) interfaceC13075p2;
                        value3 = c13045h4.getValue();
                    } while (!c13045h4.m36569i(value3, AddMembersViewState.copy$default((AddMembersViewState) value3, false, false, null, list, null, null, 54, null)));
                }
            } else if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            AddMembersViewController addMembersViewController2 = AddMembersViewController.this;
            if (!z4) {
                if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (AbstractC3006f0.m8729w(interfaceC2994c0)) {
                    InterfaceC13075p1 interfaceC13075p3 = addMembersViewController2._state;
                    do {
                        c13045h3 = (C13045h2) interfaceC13075p3;
                        value2 = c13045h3.getValue();
                    } while (!c13045h3.m36569i(value2, AddMembersViewState.copy$default((AddMembersViewState) value2, false, false, null, null, null, null, 62, null)));
                }
            }
            return C23454a0.f92919a;
        }
    }

    public AddMembersViewController(InterfaceC2994c0 scope, int i13, ChatClient chatClient, InterfaceC13058l channelState) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(channelState, "channelState");
        this.scope = scope;
        this.resultLimit = i13;
        this.chatClient = chatClient;
        final C14380k c14380kM36590P = AbstractC13091v.m36590P(channelState, new AddMembersViewController$special$$inlined$flatMapLatest$1(3, null));
        this.channelMembers = c14380kM36590P;
        final C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new AddMembersViewState(false, false, null, null, null, null, 63, null));
        this._state = c13045h2M36593c;
        this.state = AbstractC13091v.m36598h(c13045h2M36593c);
        AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36610t(new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.common.feature.channel.info.AddMembersViewController$special$$inlined$map$1

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.AddMembersViewController$special$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C194782<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.AddMembersViewController$special$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.AddMembersViewController$special$$inlined$map$1$2", m100430f = "AddMembersViewController.kt", m100431l = {50}, m100432m = "emit")
                @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194782.this.emit(null, this);
                    }
                }

                public C194782(InterfaceC13062m interfaceC13062m) {
                    this.$this_unsafeFlow = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
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
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator<T> it = ((List) obj).iterator();
                        while (it.hasNext()) {
                            linkedHashSet.add(((Member) it.next()).getUserId());
                        }
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(linkedHashSet, anonymousClass1) == enumC31071a) {
                            return enumC31071a;
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
                Object objCollect = c14380kM36590P.collect(new C194782(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }), new C194742(null), 0), scope);
        AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36610t(AbstractC13091v.m36608r(new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.common.feature.channel.info.AddMembersViewController$special$$inlined$map$2

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.AddMembersViewController$special$$inlined$map$2$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C194792<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.AddMembersViewController$special$$inlined$map$2$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.AddMembersViewController$special$$inlined$map$2$2", m100430f = "AddMembersViewController.kt", m100431l = {50}, m100432m = "emit")
                @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194792.this.emit(null, this);
                    }
                }

                public C194792(InterfaceC13062m interfaceC13062m) {
                    this.$this_unsafeFlow = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
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
                        String query = ((AddMembersViewState) obj).getQuery();
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(query, anonymousClass1) == enumC31071a) {
                            return enumC31071a;
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
                Object objCollect = c13045h2M36593c.collect(new C194792(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, 300L)), new C194754(null), 0), scope);
    }

    private final void loadMore() {
        if (((AddMembersViewState) ((C13045h2) this._state).getValue()).isLoading() || ((AddMembersViewState) ((C13045h2) this._state).getValue()).isLoadingMore()) {
            return;
        }
        this.loadMoreJob = AbstractC3006f0.m8732z(this.scope, null, null, new C194761(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void searchUsers(String query) {
        InterfaceC3027k1 interfaceC3027k1 = this.searchJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        InterfaceC3027k1 interfaceC3027k2 = this.loadMoreJob;
        if (interfaceC3027k2 != null) {
            interfaceC3027k2.cancel((CancellationException) null);
        }
        this.searchJob = AbstractC3006f0.m8732z(this.scope, null, null, new C194771(query, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QueryUsersRequest toSearchRequest(String str, int i13) {
        return new QueryUsersRequest(str.length() == 0 ? Filters.neutral() : Filters.m54984or(Filters.autocomplete("name", str), Filters.autocomplete("id", str)), i13, this.resultLimit, QuerySortByField.INSTANCE.ascByName("name"), true);
    }

    public final InterfaceC13037f2 getState() {
        return this.state;
    }

    public final void onViewAction(AddMembersViewAction action) {
        C13045h2 c13045h2;
        Object value;
        AddMembersViewState addMembersViewState;
        String id4;
        C13045h2 c13045h3;
        Object value2;
        AbstractC22676k.m65750j(action, "action");
        if (action instanceof AddMembersViewAction.QueryChanged) {
            InterfaceC13075p1 interfaceC13075p1 = this._state;
            do {
                c13045h3 = (C13045h2) interfaceC13075p1;
                value2 = c13045h3.getValue();
            } while (!c13045h3.m36569i(value2, AddMembersViewState.copy$default((AddMembersViewState) value2, false, false, ((AddMembersViewAction.QueryChanged) action).getQuery(), null, null, null, 59, null)));
            return;
        }
        if (!(action instanceof AddMembersViewAction.UserClick)) {
            if (!(action instanceof AddMembersViewAction.LoadMore)) {
                throw new NoWhenBranchMatchedException();
            }
            loadMore();
        } else {
            InterfaceC13075p1 interfaceC13075p2 = this._state;
            do {
                c13045h2 = (C13045h2) interfaceC13075p2;
                value = c13045h2.getValue();
                addMembersViewState = (AddMembersViewState) value;
                id4 = ((AddMembersViewAction.UserClick) action).getUser().getId();
            } while (!c13045h2.m36569i(value, AddMembersViewState.copy$default(addMembersViewState, false, false, null, null, addMembersViewState.getSelectedUserIds().contains(id4) ? AbstractC12350b.m34604y(id4, addMembersViewState.getSelectedUserIds()) : AbstractC12350b.m34555D(id4, addMembersViewState.getSelectedUserIds()), null, 47, null)));
        }
    }

    public /* synthetic */ AddMembersViewController(InterfaceC2994c0 interfaceC2994c0, int i13, ChatClient chatClient, InterfaceC13058l interfaceC13058l, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2994c0, (i14 & 2) != 0 ? 30 : i13, (i14 & 4) != 0 ? ChatClient.INSTANCE.instance() : chatClient, interfaceC13058l);
    }
}
