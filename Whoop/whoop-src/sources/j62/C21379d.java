package j62;

import bm.C3383g;
import com.whoop.referafriend.api.ReferAFriendApi;
import com.whoop.referafriend.domain.models.Promotion;
import com.whoop.referafriend.domain.models.RafHubResponse;
import com.whoop.referafriend.domain.models.RafHubResponseKt;
import com.whoop.referafriend.domain.models.RafHubType;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import h62.AbstractC16981a;
import h62.C16982b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import live.hms.video.media.tracks.HMSTrackSource;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: j62.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lj62/d;", "Lod1/g;", "Lj62/a;", "Lj62/b;", "Lcom/whoop/referafriend/api/ReferAFriendApi;", "api", "Ltr2/n;", "logger", "Lh62/b;", "analyticsHelper", "<init>", "(Lcom/whoop/referafriend/api/ReferAFriendApi;Ltr2/n;Lh62/b;)V", "", "source", "Lcom/whoop/referafriend/domain/models/RafHubResponse;", "g", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", HMSTrackSource.SCREEN, "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/referafriend/domain/models/RafHubResponse;Ljava/lang/String;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/referafriend/api/ReferAFriendApi;", "b", "Ltr2/n;", "c", "Lh62/b;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21379d implements InterfaceC27844g<AbstractC21376a, C21377b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ReferAFriendApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C16982b analyticsHelper;

    /* JADX INFO: renamed from: j62.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.referafriend.domain.ReferAFriendInteractor", m100430f = "ReferAFriendInteractor.kt", m100431l = {115}, m100432m = "fetchRafHub", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f81775w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f81776x;

        /* JADX INFO: renamed from: z */
        int f81778z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f81776x = obj;
            this.f81778z |= Integer.MIN_VALUE;
            return C21379d.this.m60012g(null, this);
        }
    }

    /* JADX INFO: renamed from: j62.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.referafriend.domain.ReferAFriendInteractor$fetchRafHub$response$1", m100430f = "ReferAFriendInteractor.kt", m100431l = {116}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/referafriend/domain/models/RafHubResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f81779w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f81781y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f81781y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C21379d.this.new b(this.f81781y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f81779w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ReferAFriendApi referAFriendApi = C21379d.this.api;
            String str = this.f81781y;
            this.f81779w = 1;
            Object rafHub = referAFriendApi.getRafHub(str, this);
            return rafHub == enumC31071a ? enumC31071a : rafHub;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super RafHubResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: j62.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.referafriend.domain.ReferAFriendInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ReferAFriendInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f81782w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f81783x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f81784y;

        public c(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC21376a abstractC21376a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f81783x = interfaceC13062m;
            cVar.f81784y = abstractC21376a;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f81782w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f81783x;
                AbstractC21376a abstractC21376a = (AbstractC21376a) this.f81784y;
                if (abstractC21376a instanceof AbstractC21376a.c) {
                    c0456u = new C3383g(new AbstractC21380e[]{AbstractC21380e.d.f81792a, new AbstractC21380e.c(((AbstractC21376a.c) abstractC21376a).getSource())}, 3);
                } else if (AbstractC22676k.m65745e(abstractC21376a, AbstractC21376a.d.f81763a)) {
                    c0456u = new C0456u(AbstractC21380e.e.f81793a, 1);
                } else if (AbstractC22676k.m65745e(abstractC21376a, AbstractC21376a.e.f81764a)) {
                    c0456u = new C0456u(AbstractC21380e.f.f81794a, 1);
                } else if (AbstractC22676k.m65745e(abstractC21376a, AbstractC21376a.a.f81760a)) {
                    c0456u = new C0456u(AbstractC21380e.a.f81789a, 1);
                } else if (AbstractC22676k.m65745e(abstractC21376a, AbstractC21376a.b.f81761a)) {
                    c0456u = new C0456u(AbstractC21380e.b.f81790a, 1);
                } else {
                    if (!AbstractC22676k.m65745e(abstractC21376a, AbstractC21376a.f.f81765a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0456u = new C0456u(AbstractC21380e.g.f81795a, 1);
                }
                this.f81783x = null;
                this.f81784y = null;
                this.f81782w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c0456u, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC21376a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: j62.d$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.referafriend.domain.ReferAFriendInteractor$interact$2", m100430f = "ReferAFriendInteractor.kt", m100431l = {43}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lj62/b;", "internalState", "Lj62/e;", "action", "<anonymous>", "(Lj62/b;Lj62/e;)Lj62/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f81785w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f81786x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f81787y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C21377b c21377b, AbstractC21380e abstractC21380e, InterfaceC30057d<? super C21377b> interfaceC30057d) {
            d dVar = C21379d.this.new d(interfaceC30057d);
            dVar.f81786x = c21377b;
            dVar.f81787y = abstractC21380e;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C21382g c21382g;
            C16982b.Companion.b bVar;
            List<C21382g> listM60027d;
            List<C21382g> listM60027d2;
            Object next;
            Promotion promotion;
            C21377b c21377bM60000a;
            Promotion promotion2;
            C21377b c21377bM60000a2;
            C21377b c21377b = (C21377b) this.f81786x;
            AbstractC21380e abstractC21380e = (AbstractC21380e) this.f81787y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f81785w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (AbstractC22676k.m65745e(abstractC21380e, AbstractC21380e.d.f81792a)) {
                    return c21377b.m60000a(AbstractC21378c.c.f81771a);
                }
                if (!(abstractC21380e instanceof AbstractC21380e.c)) {
                    if (AbstractC22676k.m65745e(abstractC21380e, AbstractC21380e.e.f81793a)) {
                        AbstractC21378c state = c21377b.getState();
                        AbstractC22676k.m65748h(state, "null cannot be cast to non-null type com.whoop.referafriend.domain.ReferAFriendHubDomainResult.Loaded");
                        RafHubType.Full full = ((AbstractC21378c.b) state).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getFull();
                        return (full == null || (promotion2 = full.getPromotion()) == null || (c21377bM60000a2 = c21377b.m60000a(AbstractC21378c.b.m60003b((AbstractC21378c.b) c21377b.getState(), null, null, new AbstractC21381f.a(promotion2.getReward()), 3, null))) == null) ? c21377b : c21377bM60000a2;
                    }
                    if (!AbstractC22676k.m65745e(abstractC21380e, AbstractC21380e.f.f81794a)) {
                        if (AbstractC22676k.m65745e(abstractC21380e, AbstractC21380e.a.f81789a)) {
                            AbstractC21378c state2 = c21377b.getState();
                            AbstractC22676k.m65748h(state2, "null cannot be cast to non-null type com.whoop.referafriend.domain.ReferAFriendHubDomainResult.Loaded");
                            return c21377b.m60000a(AbstractC21378c.b.m60003b((AbstractC21378c.b) state2, null, null, null, 3, null));
                        }
                        Integer num = null;
                        if (AbstractC22676k.m65745e(abstractC21380e, AbstractC21380e.b.f81790a)) {
                            C16982b c16982b = C21379d.this.analyticsHelper;
                            AbstractC16981a.h hVar = new AbstractC16981a.h(null, null, 3, null);
                            AbstractC21378c state3 = c21377b.getState();
                            AbstractC22676k.m65748h(state3, "null cannot be cast to non-null type com.whoop.referafriend.domain.ReferAFriendHubDomainResult.Loaded");
                            c16982b.m47809a(hVar, ((AbstractC21378c.b) state3).getSource());
                            return c21377b;
                        }
                        if (!AbstractC22676k.m65745e(abstractC21380e, AbstractC21380e.g.f81795a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC21378c state4 = c21377b.getState();
                        AbstractC22676k.m65748h(state4, "null cannot be cast to non-null type com.whoop.referafriend.domain.ReferAFriendHubDomainResult.Loaded");
                        String source = ((AbstractC21378c.b) state4).getSource();
                        C21383h trials = ((AbstractC21378c.b) c21377b.getState()).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getTrials();
                        if (trials == null || (listM60027d2 = trials.m60027d()) == null) {
                            c21382g = null;
                        } else {
                            Iterator<T> it = listM60027d2.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (((C21382g) next).getIsShared());
                            c21382g = (C21382g) next;
                        }
                        C21383h trials2 = ((AbstractC21378c.b) c21377b.getState()).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getTrials();
                        if (trials2 != null && (listM60027d = trials2.m60027d()) != null) {
                            num = new Integer(listM60027d.indexOf(c21382g));
                        }
                        if (num != null && num.intValue() == 0) {
                            bVar = C16982b.Companion.b.SHARE_FIRST_CODE;
                        } else if (num != null && num.intValue() == 1) {
                            bVar = C16982b.Companion.b.SHARE_SECOND_CODE;
                        } else {
                            bVar = (num != null && num.intValue() == 2) ? C16982b.Companion.b.SHARE_THIRD_CODE : C16982b.Companion.b.ALL_CODES_SHARED;
                        }
                        C21379d.this.analyticsHelper.m47809a(new AbstractC16981a.i(null, null, false, null, bVar, null, 43, null), source);
                        return c21377b;
                    }
                    AbstractC21378c state5 = c21377b.getState();
                    AbstractC22676k.m65748h(state5, "null cannot be cast to non-null type com.whoop.referafriend.domain.ReferAFriendHubDomainResult.Loaded");
                    RafHubType.Full full2 = ((AbstractC21378c.b) state5).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getFull();
                    if (full2 != null && (promotion = full2.getPromotion()) != null && (c21377bM60000a = c21377b.m60000a(AbstractC21378c.b.m60003b((AbstractC21378c.b) c21377b.getState(), null, null, new AbstractC21381f.b(promotion.getTerms()), 3, null))) != null) {
                        return c21377bM60000a;
                    }
                    return c21377b;
                }
                C21379d c21379d = C21379d.this;
                String source2 = ((AbstractC21380e.c) abstractC21380e).getSource();
                this.f81786x = c21377b;
                this.f81787y = abstractC21380e;
                this.f81785w = 1;
                obj = c21379d.m60012g(source2, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            RafHubResponse rafHubResponse = (RafHubResponse) obj;
            if (rafHubResponse != null) {
                AbstractC21380e.c cVar = (AbstractC21380e.c) abstractC21380e;
                C21379d.this.m60013h(rafHubResponse, cVar.getSource());
                return c21377b.m60000a(new AbstractC21378c.b(RafHubResponseKt.toRafHubDomainState(rafHubResponse), cVar.getSource(), null, 4, null));
            }
            AbstractC21380e.c cVar2 = (AbstractC21380e.c) abstractC21380e;
            C21379d.this.analyticsHelper.m47809a(new AbstractC16981a.b(null, null, null, null, 15, null), cVar2.getSource());
            return c21377b.m60000a(new AbstractC21378c.a(cVar2.getSource()));
        }
    }

    public C21379d(ReferAFriendApi api, InterfaceC34116n logger, C16982b analyticsHelper) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.api = api;
        this.logger = logger;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public final Object m60012g(String str, InterfaceC30057d<? super RafHubResponse> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f81778z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f81778z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f81776x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f81778z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(str, null);
            aVar2.f81775w = null;
            aVar2.f81778z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        return AbstractC34386b.m108737b((InterfaceC34385a) objM108729b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final void m60013h(RafHubResponse screen, String source) {
        RafHubType.Full full = screen.getFull();
        if ((full != null ? full.getPromotion() : null) != null) {
            this.analyticsHelper.m47809a(new AbstractC16981a.f(null, null, null, screen.getFull().getPromotion().getComplete(), screen.getFull().getPromotion().getCard().getReferralsCompleted(), null, 39, null), source);
        } else {
            this.analyticsHelper.m47809a(new AbstractC16981a.k(null, null, null, null, 15, null), source);
        }
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C21377b(null, 1, null), AbstractC13091v.m36590P(upstream, new c(null)), new d(null));
    }

    public /* synthetic */ C21379d(ReferAFriendApi referAFriendApi, InterfaceC34116n interfaceC34116n, C16982b c16982b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(referAFriendApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ReferAFriendInteractor") : interfaceC34116n, c16982b);
    }
}
