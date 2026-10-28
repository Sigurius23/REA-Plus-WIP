package io.getstream.chat.android.client.internal.state.plugin.listener.internal;

import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.api.models.PredefinedFilter;
import io.getstream.chat.android.client.api.models.QueryChannelsRequest;
import io.getstream.chat.android.client.api.models.QueryChannelsResult;
import io.getstream.chat.android.client.internal.state.model.querychannels.pagination.internal.MapperKt;
import io.getstream.chat.android.client.internal.state.model.querychannels.pagination.internal.QueryChannelsPaginationRequest;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic;
import io.getstream.chat.android.client.plugin.listeners.QueryChannelsListener;
import io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequest;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.querysort.QuerySorter;
import l83.C23454a0;
import n23.AbstractC26205h;
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
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000f\u0010\u000eJ&\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState;", "Lio/getstream/chat/android/client/plugin/listeners/QueryChannelsListener;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logic", "Lec3/p1;", "", "queryingChannelsFree", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lec3/p1;)V", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "request", "Ln23/h;", "Ll83/a0;", "onQueryChannelsPrecondition", "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;", "onQueryChannelsRequest", "Lio/getstream/chat/android/client/api/models/QueryChannelsResult;", "result", "onQueryChannelsResult", "(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "Lec3/p1;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryChannelsListenerState implements QueryChannelsListener {
    private static final Companion Companion = new Companion();
    private final LogicRegistry logic;
    private final InterfaceC13075p1 queryingChannelsFree;

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0002¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelsListenerState$Companion;", "", "<init>", "()V", "toPagination", "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AnyChannelPaginationRequest toPagination(QueryChannelsRequest queryChannelsRequest) {
            QuerySorter<Channel> querySort = queryChannelsRequest.getQuerySort();
            int limit = queryChannelsRequest.getLimit();
            int offset = queryChannelsRequest.getOffset();
            Integer messageLimit = queryChannelsRequest.getMessageLimit();
            int iIntValue = messageLimit != null ? messageLimit.intValue() : 10;
            Integer memberLimit = queryChannelsRequest.getMemberLimit();
            return MapperKt.toAnyChannelPaginationRequest(new QueryChannelsPaginationRequest(querySort, offset, limit, iIntValue, memberLimit != null ? memberLimit.intValue() : 30));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.listener.internal.QueryChannelsListenerState$onQueryChannelsResult$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.listener.internal.QueryChannelsListenerState", m100430f = "QueryChannelsListenerState.kt", m100431l = {69}, m100432m = "onQueryChannelsResult")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192901 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C192901(InterfaceC30057d<? super C192901> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return QueryChannelsListenerState.this.onQueryChannelsResult(null, null, this);
        }
    }

    public QueryChannelsListenerState(LogicRegistry logic, InterfaceC13075p1 queryingChannelsFree) {
        AbstractC22676k.m65750j(logic, "logic");
        AbstractC22676k.m65750j(queryingChannelsFree, "queryingChannelsFree");
        this.logic = logic;
        this.queryingChannelsFree = queryingChannelsFree;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.QueryChannelsListener
    public final Object onQueryChannelsPrecondition(QueryChannelsRequest queryChannelsRequest, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return new C26204g(C23454a0.f92919a);
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.QueryChannelsListener
    public final Object onQueryChannelsRequest(QueryChannelsRequest queryChannelsRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        InterfaceC13075p1 interfaceC13075p1 = this.queryingChannelsFree;
        Boolean bool = Boolean.FALSE;
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, bool);
        QueryChannelsLogic queryChannelsLogicQueryChannels$stream_chat_android_client_release = this.logic.queryChannels$stream_chat_android_client_release(queryChannelsRequest);
        queryChannelsLogicQueryChannels$stream_chat_android_client_release.setCurrentRequest$stream_chat_android_client_release(queryChannelsRequest);
        Object objQueryOffline$stream_chat_android_client_release = queryChannelsLogicQueryChannels$stream_chat_android_client_release.queryOffline$stream_chat_android_client_release(Companion.toPagination(queryChannelsRequest), interfaceC30057d);
        return objQueryOffline$stream_chat_android_client_release == EnumC31071a.f128113w ? objQueryOffline$stream_chat_android_client_release : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.plugin.listeners.QueryChannelsListener
    public final Object onQueryChannelsResult(AbstractC26205h abstractC26205h, QueryChannelsRequest queryChannelsRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C192901 c192901;
        PredefinedFilter predefinedFilter;
        if (interfaceC30057d instanceof C192901) {
            c192901 = (C192901) interfaceC30057d;
            int i13 = c192901.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c192901.label = i13 - Integer.MIN_VALUE;
            } else {
                c192901 = new C192901(interfaceC30057d);
            }
        } else {
            c192901 = new C192901(interfaceC30057d);
        }
        Object obj = c192901.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c192901.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            QueryChannelsLogic queryChannelsLogicQueryChannels$stream_chat_android_client_release = this.logic.queryChannels$stream_chat_android_client_release(queryChannelsRequest);
            boolean z4 = abstractC26205h instanceof C26204g;
            if (z4 && (predefinedFilter = ((QueryChannelsResult) ((C26204g) abstractC26205h).f103919a).getPredefinedFilter()) != null) {
                queryChannelsLogicQueryChannels$stream_chat_android_client_release.applyResolvedSpec$stream_chat_android_client_release(predefinedFilter.getFilter(), predefinedFilter.getSort());
            }
            if (z4) {
                abstractC26205h = new C26204g(((QueryChannelsResult) ((C26204g) abstractC26205h).f103919a).getChannels());
            } else if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            c192901.L$0 = null;
            c192901.L$1 = null;
            c192901.L$2 = null;
            c192901.L$3 = null;
            c192901.label = 1;
            if (queryChannelsLogicQueryChannels$stream_chat_android_client_release.onQueryChannelsResult(abstractC26205h, queryChannelsRequest, c192901) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        InterfaceC13075p1 interfaceC13075p1 = this.queryingChannelsFree;
        Boolean bool = Boolean.TRUE;
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, bool);
        return C23454a0.f92919a;
    }
}
