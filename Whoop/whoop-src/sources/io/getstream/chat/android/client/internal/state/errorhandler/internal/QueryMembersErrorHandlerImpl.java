package io.getstream.chat.android.client.internal.state.errorhandler.internal;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.errorhandler.QueryMembersErrorHandler;
import io.getstream.chat.android.client.extensions.internal.PairKt;
import io.getstream.chat.android.client.persistance.repository.ChannelRepository;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import o23.AbstractC27476f;
import o23.C27487q;
import o23.InterfaceC27474d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJs\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00192\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;", "Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "channelRepository", "<init>", "(Lbc3/c0;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;)V", "Lo23/d;", "", "Lio/getstream/chat/android/models/Member;", "originalCall", "", "channelType", "channelId", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "sort", QueryChannelRequest.KEY_MEMBERS, "Lo23/q;", "onQueryMembersError", "(Lo23/d;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/q;", "Lbc3/c0;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryMembersErrorHandlerImpl implements QueryMembersErrorHandler {
    private final ChannelRepository channelRepository;
    private final ClientState clientState;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.errorhandler.internal.QueryMembersErrorHandlerImpl$onQueryMembersError$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.errorhandler.internal.QueryMembersErrorHandlerImpl$onQueryMembersError$1", m100430f = "QueryMembersErrorHandlerImpl.kt", m100431l = {73}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Ln23/e;", "originalError", "Ln23/h;", "", "Lio/getstream/chat/android/models/Member;", "<anonymous>", "(Ln23/e;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C192571 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ int $limit;
        final /* synthetic */ int $offset;
        final /* synthetic */ InterfaceC27474d $originalCall;
        final /* synthetic */ QuerySorter<Member> $sort;
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192571(int i13, int i14, String str, String str2, QuerySorter<Member> querySorter, InterfaceC27474d interfaceC27474d, InterfaceC30057d<? super C192571> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$offset = i13;
            this.$limit = i14;
            this.$channelType = str;
            this.$channelId = str2;
            this.$sort = querySorter;
            this.$originalCall = interfaceC27474d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C192571 c192571 = QueryMembersErrorHandlerImpl.this.new C192571(this.$offset, this.$limit, this.$channelType, this.$channelId, this.$sort, this.$originalCall, interfaceC30057d);
            c192571.L$0 = obj;
            return c192571;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            int i13;
            int i14;
            AbstractC26202e abstractC26202e = (AbstractC26202e) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i15 = this.label;
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                C2345k logger = QueryMembersErrorHandlerImpl.this.getLogger();
                InterfaceC27474d interfaceC27474d = this.$originalCall;
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, "An error happened while wuery members. Error message: " + abstractC26202e.mo77807a() + ". Full error: " + interfaceC27474d, null);
                }
                if (QueryMembersErrorHandlerImpl.this.clientState.isOnline()) {
                    return new C26203f(abstractC26202e);
                }
                int i16 = this.$offset;
                if (i16 < 0) {
                    i16 = 0;
                }
                int i17 = this.$limit;
                i13 = i17 >= 0 ? i17 : 0;
                ChannelRepository channelRepository = QueryMembersErrorHandlerImpl.this.channelRepository;
                String cid = PairKt.toCid(new C23465k(this.$channelType, this.$channelId));
                this.L$0 = null;
                this.I$0 = i16;
                this.I$1 = i13;
                this.label = 1;
                Object objSelectMembersForChannel = channelRepository.selectMembersForChannel(cid, this);
                if (objSelectMembersForChannel == enumC31071a) {
                    return enumC31071a;
                }
                i14 = i16;
                obj = objSelectMembersForChannel;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$1;
                i14 = this.I$0;
                AbstractC34132o.m107864I(obj);
            }
            List listM74161z0 = AbstractC25265s.m74161z0(AbstractC25265s.m74152u1((Iterable) obj, this.$sort.getComparator()), i14);
            if (i13 > 0) {
                listM74161z0 = AbstractC25265s.m74156w1(listM74161z0, i13);
            }
            return new C26204g(listM74161z0);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26202e abstractC26202e, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C192571) create(abstractC26202e, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public QueryMembersErrorHandlerImpl(InterfaceC2994c0 scope, ClientState clientState, ChannelRepository channelRepository) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(channelRepository, "channelRepository");
        this.scope = scope;
        this.clientState = clientState;
        this.channelRepository = channelRepository;
        this.logger = AbstractC1772c1.m5382S(this, "QueryMembersError");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    @Override // io.getstream.chat.android.client.errorhandler.QueryMembersErrorHandler
    public final C27487q onQueryMembersError(InterfaceC27474d originalCall, String channelType, String channelId, int offset, int limit, FilterObject filter, QuerySorter<Member> sort, List<Member> members) {
        AbstractC22676k.m65750j(originalCall, "originalCall");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(members, "members");
        return AbstractC27476f.m82910h(originalCall, this.scope, new C192571(offset, limit, channelType, channelId, sort, originalCall, null));
    }
}
