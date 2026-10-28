package io.getstream.chat.android.p226ui.viewmodel.search;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1630u0;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.C13045h2;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.state.Event;
import io.getstream.chat.android.client.persistance.repository.RepositoryFacade;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Filters;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.SearchMessagesResult;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.model.MessageResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import jh3.AbstractC21702c;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
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
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 42\u00020\u0001:\u000254B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0082@¢\u0006\u0004\b\u0007\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060$0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001eR#\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060$0\u001f8\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00066"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;", "Landroidx/lifecycle/w1;", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "<init>", "(Lio/getstream/chat/android/client/ChatClient;)V", "Ll83/a0;", "searchMessages", "()V", "Lio/getstream/chat/android/models/SearchMessagesResult;", "searchResult", "handleSearchMessageSuccess", "(Lio/getstream/chat/android/models/SearchMessagesResult;Lq83/d;)Ljava/lang/Object;", "Ln23/e;", "streamError", "handleSearchMessagesError", "(Ln23/e;)V", "", "query", "next", "Ln23/h;", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "setQuery", "(Ljava/lang/String;)V", "loadMore", "onCleared", "Lio/getstream/chat/android/client/ChatClient;", "Landroidx/lifecycle/u0;", "Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;", "_state", "Landroidx/lifecycle/u0;", "Landroidx/lifecycle/p0;", "state", "Landroidx/lifecycle/p0;", "getState", "()Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/client/api/state/Event;", "_errorEvents", "errorEvents", "getErrorEvents", "Lbc3/c0;", "scope", "Lbc3/c0;", "Lbc3/k1;", "job", "Lbc3/k1;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Companion", "State", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SearchViewModel extends AbstractC1637w1 {
    private static final Companion Companion = new Companion();
    private static final int QUERY_LIMIT = 30;
    private final C1630u0 _errorEvents;
    private final C1630u0 _state;
    private final ChatClient chatClient;
    private final AbstractC1615p0 errorEvents;
    private InterfaceC3027k1 job;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final InterfaceC2994c0 scope;
    private final AbstractC1615p0 state;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$Companion;", "", "<init>", "()V", "QUERY_LIMIT", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u001bJM\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;", "", "query", "", "canLoadMore", "", "results", "", "Lio/getstream/chat/android/ui/common/model/MessageResult;", "isLoading", "isLoadingMore", "next", "<init>", "(Ljava/lang/String;ZLjava/util/List;ZZLjava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "getCanLoadMore", "()Z", "getResults", "()Ljava/util/List;", "getNext$stream_chat_android_ui_components_release", "component1", "component2", "component3", "component4", "component5", "component6", "component6$stream_chat_android_ui_components_release", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class State {
        private final boolean canLoadMore;
        private final boolean isLoading;
        private final boolean isLoadingMore;
        private final String next;
        private final String query;
        private final List<MessageResult> results;

        public State() {
            this(null, false, null, false, false, null, 63, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State copy$default(State state, String str, boolean z4, List list, boolean z13, boolean z14, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = state.query;
            }
            if ((i13 & 2) != 0) {
                z4 = state.canLoadMore;
            }
            if ((i13 & 4) != 0) {
                list = state.results;
            }
            if ((i13 & 8) != 0) {
                z13 = state.isLoading;
            }
            if ((i13 & 16) != 0) {
                z14 = state.isLoadingMore;
            }
            if ((i13 & 32) != 0) {
                str2 = state.next;
            }
            boolean z15 = z14;
            String str3 = str2;
            return state.copy(str, z4, list, z13, z15, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getQuery() {
            return this.query;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getCanLoadMore() {
            return this.canLoadMore;
        }

        public final List<MessageResult> component3() {
            return this.results;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsLoadingMore() {
            return this.isLoadingMore;
        }

        /* JADX INFO: renamed from: component6$stream_chat_android_ui_components_release, reason: from getter */
        public final String getNext() {
            return this.next;
        }

        public final State copy(String query, boolean canLoadMore, List<MessageResult> results, boolean isLoading, boolean isLoadingMore, String next) {
            AbstractC22676k.m65750j(query, "query");
            AbstractC22676k.m65750j(results, "results");
            return new State(query, canLoadMore, results, isLoading, isLoadingMore, next);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return AbstractC22676k.m65745e(this.query, state.query) && this.canLoadMore == state.canLoadMore && AbstractC22676k.m65745e(this.results, state.results) && this.isLoading == state.isLoading && this.isLoadingMore == state.isLoadingMore && AbstractC22676k.m65745e(this.next, state.next);
        }

        public final boolean getCanLoadMore() {
            return this.canLoadMore;
        }

        public final String getNext$stream_chat_android_ui_components_release() {
            return this.next;
        }

        public final String getQuery() {
            return this.query;
        }

        public final List<MessageResult> getResults() {
            return this.results;
        }

        public final int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC2875y.m8289b(this.query.hashCode() * 31, 31, this.canLoadMore), 31, this.results), 31, this.isLoading), 31, this.isLoadingMore);
            String str = this.next;
            return iM8289b + (str == null ? 0 : str.hashCode());
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final boolean isLoadingMore() {
            return this.isLoadingMore;
        }

        public final String toString() {
            String str = this.query;
            boolean z4 = this.canLoadMore;
            List<MessageResult> list = this.results;
            boolean z13 = this.isLoading;
            boolean z14 = this.isLoadingMore;
            String str2 = this.next;
            StringBuilder sbM73379l = AbstractC25012a.m73379l("State(query=", str, ", canLoadMore=", ", results=", z4);
            AbstractC26725a.m79512p(", isLoading=", ", isLoadingMore=", sbM73379l, list, z13);
            return AbstractC21702c.m61139j(sbM73379l, z14, ", next=", str2, ")");
        }

        public State(String query, boolean z4, List<MessageResult> results, boolean z13, boolean z14, String str) {
            AbstractC22676k.m65750j(query, "query");
            AbstractC22676k.m65750j(results, "results");
            this.query = query;
            this.canLoadMore = z4;
            this.results = results;
            this.isLoading = z13;
            this.isLoadingMore = z14;
            this.next = str;
        }

        public /* synthetic */ State(String str, boolean z4, List list, boolean z13, boolean z14, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? true : z4, (i13 & 4) != 0 ? C25271y.f99162w : list, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? false : z14, (i13 & 32) != 0 ? null : str2);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.search.SearchViewModel$handleSearchMessageSuccess$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.search.SearchViewModel", m100430f = "SearchViewModel.kt", m100431l = {142}, m100432m = "handleSearchMessageSuccess")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C199571 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C199571(InterfaceC30057d<? super C199571> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SearchViewModel.this.handleSearchMessageSuccess(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.search.SearchViewModel$searchMessages$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.search.SearchViewModel$searchMessages$1", m100430f = "SearchViewModel.kt", m100431l = {125, 130}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C199581 extends AbstractC32275i implements InterfaceC4351m {
        Object L$0;
        Object L$1;
        int label;

        public C199581(InterfaceC30057d<? super C199581> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SearchViewModel.this.new C199581(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C199581) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
        
            if (r1.handleSearchMessageSuccess(r7, r6) == r0) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r6.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L29
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r6.L$1
                n23.h r0 = (n23.AbstractC26205h) r0
                java.lang.Object r0 = r6.L$0
                io.getstream.chat.android.ui.viewmodel.search.SearchViewModel$State r0 = (io.getstream.chat.android.ui.viewmodel.search.SearchViewModel.State) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L78
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L21:
                java.lang.Object r1 = r6.L$0
                io.getstream.chat.android.ui.viewmodel.search.SearchViewModel$State r1 = (io.getstream.chat.android.ui.viewmodel.search.SearchViewModel.State) r1
                p505ts.AbstractC34132o.m107864I(r7)
                goto L50
            L29:
                p505ts.AbstractC34132o.m107864I(r7)
                io.getstream.chat.android.ui.viewmodel.search.SearchViewModel r7 = io.getstream.chat.android.p226ui.viewmodel.search.SearchViewModel.this
                androidx.lifecycle.u0 r7 = io.getstream.chat.android.p226ui.viewmodel.search.SearchViewModel.access$get_state$p(r7)
                java.lang.Object r7 = r7.getValue()
                p715kotlin.jvm.internal.AbstractC22676k.m65747g(r7)
                io.getstream.chat.android.ui.viewmodel.search.SearchViewModel$State r7 = (io.getstream.chat.android.ui.viewmodel.search.SearchViewModel.State) r7
                io.getstream.chat.android.ui.viewmodel.search.SearchViewModel r1 = io.getstream.chat.android.p226ui.viewmodel.search.SearchViewModel.this
                java.lang.String r5 = r7.getQuery()
                java.lang.String r7 = r7.getNext$stream_chat_android_ui_components_release()
                r6.L$0 = r4
                r6.label = r3
                java.lang.Object r7 = io.getstream.chat.android.p226ui.viewmodel.search.SearchViewModel.access$searchMessages(r1, r5, r7, r6)
                if (r7 != r0) goto L50
                goto L6a
            L50:
                n23.h r7 = (n23.AbstractC26205h) r7
                boolean r1 = r7 instanceof n23.C26204g
                if (r1 == 0) goto L6b
                io.getstream.chat.android.ui.viewmodel.search.SearchViewModel r1 = io.getstream.chat.android.p226ui.viewmodel.search.SearchViewModel.this
                n23.g r7 = (n23.C26204g) r7
                java.lang.Object r7 = r7.f103919a
                io.getstream.chat.android.models.SearchMessagesResult r7 = (io.getstream.chat.android.models.SearchMessagesResult) r7
                r6.L$0 = r4
                r6.L$1 = r4
                r6.label = r2
                java.lang.Object r7 = io.getstream.chat.android.p226ui.viewmodel.search.SearchViewModel.access$handleSearchMessageSuccess(r1, r7, r6)
                if (r7 != r0) goto L78
            L6a:
                return r0
            L6b:
                boolean r0 = r7 instanceof n23.C26203f
                if (r0 == 0) goto L7b
                io.getstream.chat.android.ui.viewmodel.search.SearchViewModel r0 = io.getstream.chat.android.p226ui.viewmodel.search.SearchViewModel.this
                n23.f r7 = (n23.C26203f) r7
                n23.e r7 = r7.f103918a
                io.getstream.chat.android.p226ui.viewmodel.search.SearchViewModel.access$handleSearchMessagesError(r0, r7)
            L78:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            L7b:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.p226ui.viewmodel.search.SearchViewModel.C199581.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchViewModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object handleSearchMessageSuccess(SearchMessagesResult searchMessagesResult, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C199571 c199571;
        State state;
        SearchMessagesResult searchMessagesResult2;
        Object next;
        if (interfaceC30057d instanceof C199571) {
            c199571 = (C199571) interfaceC30057d;
            int i13 = c199571.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c199571.label = i13 - Integer.MIN_VALUE;
            } else {
                c199571 = new C199571(interfaceC30057d);
            }
        } else {
            c199571 = new C199571(interfaceC30057d);
        }
        Object obj = c199571.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c199571.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(searchMessagesResult.getMessages().size(), "Found messages: "), null);
            }
            Object value = this._state.getValue();
            AbstractC22676k.m65747g(value);
            State state2 = (State) value;
            RepositoryFacade repositoryFacade = this.chatClient.getRepositoryFacade();
            List<Message> messages = searchMessagesResult.getMessages();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(messages, 10));
            Iterator<T> it = messages.iterator();
            while (it.hasNext()) {
                arrayList.add(((Message) it.next()).getCid());
            }
            c199571.L$0 = searchMessagesResult;
            c199571.L$1 = state2;
            c199571.label = 1;
            Object objSelectChannels = repositoryFacade.selectChannels(arrayList, null, c199571);
            if (objSelectChannels == enumC31071a) {
                return enumC31071a;
            }
            state = state2;
            obj = objSelectChannels;
            searchMessagesResult2 = searchMessagesResult;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            State state3 = (State) c199571.L$1;
            searchMessagesResult2 = (SearchMessagesResult) c199571.L$0;
            AbstractC34132o.m107864I(obj);
            state = state3;
        }
        List list = (List) obj;
        C1630u0 c1630u0 = this._state;
        List<MessageResult> results = state.getResults();
        List<Message> messages2 = searchMessagesResult2.getMessages();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(messages2, 10));
        for (Message message : messages2) {
            Iterator it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!AbstractC22676k.m65745e(((Channel) next).getCid(), message.getCid()));
            arrayList2.add(new MessageResult(message, (Channel) next));
        }
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(results, arrayList2);
        String next2 = searchMessagesResult2.getNext();
        c1630u0.setValue(State.copy$default(state, null, !(next2 == null || next2.length() == 0), arrayListM74129g1, false, false, searchMessagesResult2.getNext(), 1, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSearchMessagesError(AbstractC26202e streamError) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("Error searching messages: ", streamError.mo77807a()), null);
        }
        C1630u0 c1630u0 = this._state;
        Object value = c1630u0.getValue();
        AbstractC22676k.m65747g(value);
        c1630u0.setValue(State.copy$default((State) value, null, false, null, false, false, null, 39, null));
        this._errorEvents.setValue(new Event(C23454a0.f92919a));
    }

    private final void searchMessages() {
        this.job = AbstractC3006f0.m8732z(this.scope, null, null, new C199581(null), 3);
    }

    public final AbstractC1615p0 getErrorEvents() {
        return this.errorEvents;
    }

    public final AbstractC1615p0 getState() {
        return this.state;
    }

    public final void loadMore() {
        InterfaceC3027k1 interfaceC3027k1 = this.job;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        Object value = this._state.getValue();
        AbstractC22676k.m65747g(value);
        State state = (State) value;
        if (!state.getCanLoadMore() || state.isLoading() || state.isLoadingMore()) {
            return;
        }
        this._state.setValue(State.copy$default(state, null, false, null, false, true, null, 47, null));
        searchMessages();
    }

    @Override // androidx.lifecycle.AbstractC1637w1
    public final void onCleared() {
        super.onCleared();
        AbstractC3006f0.m8714h(this.scope, null);
    }

    public final void setQuery(String query) {
        AbstractC22676k.m65750j(query, "query");
        InterfaceC3027k1 interfaceC3027k1 = this.job;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        int length = query.length();
        C25271y c25271y = C25271y.f99162w;
        if (length == 0) {
            this._state.setValue(new State(query, false, c25271y, false, false, null, 32, null));
            return;
        }
        this._state.setValue(new State(query, true, c25271y, true, false, null, 32, null));
        searchMessages();
    }

    public /* synthetic */ SearchViewModel(ChatClient chatClient, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? ChatClient.INSTANCE.instance() : chatClient);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object searchMessages(String str, String str2, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str3 = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str3)) {
            logger.f9274b.log(enumC2341g, str3, AbstractC31061c.m95640p("Searching for \"", str, "\" with next: ", str2), null);
        }
        Object value = ((C13045h2) this.chatClient.getClientState().getUser()).getValue();
        if (value != null) {
            return ChatClient.searchMessages$default(this.chatClient, Filters.m54980in(QueryChannelRequest.KEY_MEMBERS, (List<? extends Object>) AbstractC37056f.m118958J(((User) value).getId())), Filters.autocomplete("text", str), null, new Integer(30), str2, null, 36, null).await(interfaceC30057d);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public SearchViewModel(ChatClient chatClient) {
        AbstractC22676k.m65750j(chatClient, "chatClient");
        this.chatClient = chatClient;
        C1630u0 c1630u0 = new C1630u0(new State(null, false, null, false, false, null, 63, null));
        this._state = c1630u0;
        this.state = c1630u0;
        C1630u0 c1630u1 = new C1630u0();
        this._errorEvents = c1630u1;
        this.errorEvents = c1630u1;
        this.scope = AbstractC3006f0.m8708b(DispatcherProvider.INSTANCE.getMain());
        this.logger = AbstractC1772c1.m5382S(this, "Chat:SearchViewModel");
    }
}
