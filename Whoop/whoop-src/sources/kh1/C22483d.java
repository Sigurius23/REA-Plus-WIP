package kh1;

import com.whoop.design.models.items.CountryModel;
import com.whoop.design.models.items.CountrySelectorModel;
import com.whoop.gifting.feature.gifting.domain.GetGiftingRequest;
import com.whoop.gifting.feature.gifting.domain.models.GiftingModels;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CartItem;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.UniversalCheckoutPayload;
import com.whoop.navigation.UniversalCheckoutScreenModel;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import nh1.InterfaceC26720a;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qw2.AbstractC30694b;
import qw2.C30695c;
import qw2.C30698f;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: kh1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u000b\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJQ\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\u001f2\b\b\u0002\u0010$\u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020\u00032\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b*\u0010+J#\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, m65681d2 = {"Lkh1/d;", "Lod1/g;", "Lkh1/b;", "Lkh1/c;", "Lnm0/e;", "cachedApiSource", "Lqw2/c;", "actionInteractor", "<init>", "(Lnm0/e;Lqw2/c;)V", "previousState", "action", "g", "(Lkh1/c;Lkh1/b;)Lkh1/c;", "Lcom/whoop/navigation/e;", "destination", "i", "(Lkh1/c;Lcom/whoop/navigation/e;)Lkh1/c;", "", "selectedQuantity", "m", "(Lcom/whoop/navigation/e;I)Lcom/whoop/navigation/e;", "Lkh1/b$e;", "Lkh1/f;", "internalState", "Lec3/l;", "Lkh1/e;", "l", "(Lkh1/b$e;Lkh1/f;)Lec3/l;", "", "manualRefresh", "", "source", "giftType", "testCount", "selectedTier", "country", "j", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "Lpm0/a$c;", "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;", "cacheResult", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lpm0/a$c;)Lkh1/c;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lqw2/c;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22483d implements InterfaceC27844g<AbstractC22481b, C22482c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: kh1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifting.domain.GiftingInteractor$interact$$inlined$flatMapLatest$1", m100430f = "GiftingInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f88082w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f88083x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88084y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22483d f88085z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C22483d c22483d) {
            super(3, interfaceC30057d);
            this.f88085z = c22483d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C22485f c22485f, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f88085z);
            aVar.f88083x = interfaceC13062m;
            aVar.f88084y = c22485f;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM64971l;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f88082w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f88083x;
                C22485f c22485f = (C22485f) this.f88084y;
                AbstractC22481b pendingAction = c22485f.getPendingAction();
                if (pendingAction instanceof AbstractC22481b.g) {
                    AbstractC22481b.g gVar = (AbstractC22481b.g) pendingAction;
                    interfaceC13058lM64971l = new d(C22483d.m64970k(this.f88085z, false, gVar.getSource(), gVar.getGiftType(), gVar.getTestCount(), gVar.getSelectedTier(), null, 33, null));
                } else if (pendingAction instanceof AbstractC22481b.c) {
                    interfaceC13058lM64971l = new e(this.f88085z.m64969j(true, c22485f.getSource(), c22485f.getGiftType(), c22485f.getTestCount(), c22485f.getSelectedTier(), ((AbstractC22481b.c) pendingAction).getCountryCode()));
                } else {
                    interfaceC13058lM64971l = pendingAction instanceof AbstractC22481b.e ? this.f88085z.m64971l((AbstractC22481b.e) pendingAction, c22485f) : new C0456u(new AbstractC22484e.a(pendingAction), 1);
                }
                this.f88083x = null;
                this.f88084y = null;
                this.f88082w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM64971l, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C22485f) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: kh1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifting.domain.GiftingInteractor$interact$1", m100430f = "GiftingInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lkh1/f;", "state", "Lkh1/b;", "action", "<anonymous>", "(Lkh1/f;Lkh1/b;)Lkh1/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f88086w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f88087x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88088y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C22485f c22485f, AbstractC22481b abstractC22481b, InterfaceC30057d<? super C22485f> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f88087x = c22485f;
            bVar.f88088y = abstractC22481b;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C22485f c22485f = (C22485f) this.f88087x;
            AbstractC22481b abstractC22481b = (AbstractC22481b) this.f88088y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f88086w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC22481b instanceof AbstractC22481b.g) {
                AbstractC22481b.g gVar = (AbstractC22481b.g) abstractC22481b;
                return c22485f.m64979a(gVar.getSource(), gVar.getGiftType(), gVar.getTestCount(), gVar.getSelectedTier(), abstractC22481b);
            }
            if (!(abstractC22481b instanceof AbstractC22481b.e) && (abstractC22481b instanceof AbstractC22481b.c)) {
                return C22485f.m64978b(c22485f, null, null, null, null, abstractC22481b, 15, null);
            }
            return C22485f.m64978b(c22485f, null, null, null, null, abstractC22481b, 15, null);
        }
    }

    /* JADX INFO: renamed from: kh1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifting.domain.GiftingInteractor$interact$3", m100430f = "GiftingInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lkh1/c;", "previousState", "Lkh1/e;", "internalAction", "<anonymous>", "(Lkh1/c;Lkh1/e;)Lkh1/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f88089w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f88090x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88091y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C22482c c22482c, AbstractC22484e abstractC22484e, InterfaceC30057d<? super C22482c> interfaceC30057d) {
            c cVar = C22483d.this.new c(interfaceC30057d);
            cVar.f88090x = c22482c;
            cVar.f88091y = abstractC22484e;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C22482c domainState = (C22482c) this.f88090x;
            AbstractC22484e abstractC22484e = (AbstractC22484e) this.f88091y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f88089w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC22484e instanceof AbstractC22484e.a) {
                return C22483d.this.m64966g(domainState, ((AbstractC22484e.a) abstractC22484e).getDomainAction());
            }
            if (!(abstractC22484e instanceof AbstractC22484e.b)) {
                if (abstractC22484e instanceof AbstractC22484e.c) {
                    return C22482c.m64948b(domainState, null, null, null, null, ((AbstractC22484e.c) abstractC22484e).getDialogType(), null, null, 0, null, false, false, false, null, 8175, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            String selectedSegmentId = domainState.getSelectedSegmentId();
            if (selectedSegmentId.length() == 0) {
                selectedSegmentId = ((AbstractC22484e.b) abstractC22484e).getDomainState().getSelectedSegmentId();
            }
            String str = selectedSegmentId;
            AbstractC22484e.b bVar = (AbstractC22484e.b) abstractC22484e;
            String source = (bVar.getDomainState().getSource().length() != 0 || domainState.getSource().length() <= 0) ? bVar.getDomainState().getSource() : domainState.getSource();
            String giftType = (bVar.getDomainState().getGiftType().length() != 0 || domainState.getGiftType().length() <= 0) ? bVar.getDomainState().getGiftType() : domainState.getGiftType();
            String testCount = (bVar.getDomainState().getTestCount().length() != 0 || domainState.getTestCount().length() <= 0) ? bVar.getDomainState().getTestCount() : domainState.getTestCount();
            if (bVar.getDomainState().getSelectedTier().length() != 0 || domainState.getSelectedTier().length() <= 0) {
                domainState = bVar.getDomainState();
            }
            return C22482c.m64948b(bVar.getDomainState(), source, giftType, testCount, domainState.getSelectedTier(), null, null, null, 0, str, false, false, false, null, 7920, null);
        }
    }

    /* JADX INFO: renamed from: kh1.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f88093w;

        /* JADX INFO: renamed from: kh1.d$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f88094w;

            /* JADX INFO: renamed from: kh1.d$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifting.domain.GiftingInteractor$interact$lambda$0$$inlined$map$1$2", m100430f = "GiftingInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41898a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f88095E;

                /* JADX INFO: renamed from: F */
                Object f88096F;

                /* JADX INFO: renamed from: G */
                Object f88097G;

                /* JADX INFO: renamed from: H */
                int f88098H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f88099w;

                /* JADX INFO: renamed from: x */
                int f88100x;

                /* JADX INFO: renamed from: y */
                Object f88101y;

                public C41898a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f88099w = obj;
                    this.f88100x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f88094w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41898a c41898a;
                if (interfaceC30057d instanceof C41898a) {
                    c41898a = (C41898a) interfaceC30057d;
                    int i13 = c41898a.f88100x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41898a.f88100x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41898a = new C41898a(interfaceC30057d);
                    }
                } else {
                    c41898a = new C41898a(interfaceC30057d);
                }
                Object obj2 = c41898a.f88099w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41898a.f88100x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f88094w;
                    AbstractC22484e.b bVar = new AbstractC22484e.b((C22482c) obj);
                    c41898a.f88101y = null;
                    c41898a.f88095E = null;
                    c41898a.f88096F = null;
                    c41898a.f88097G = null;
                    c41898a.f88098H = 0;
                    c41898a.f88100x = 1;
                    if (interfaceC13062m.emit(bVar, c41898a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l) {
            this.f88093w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f88093w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kh1.d$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f88103w;

        /* JADX INFO: renamed from: kh1.d$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f88104w;

            /* JADX INFO: renamed from: kh1.d$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifting.domain.GiftingInteractor$interact$lambda$0$$inlined$map$2$2", m100430f = "GiftingInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41899a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f88105E;

                /* JADX INFO: renamed from: F */
                Object f88106F;

                /* JADX INFO: renamed from: G */
                Object f88107G;

                /* JADX INFO: renamed from: H */
                int f88108H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f88109w;

                /* JADX INFO: renamed from: x */
                int f88110x;

                /* JADX INFO: renamed from: y */
                Object f88111y;

                public C41899a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f88109w = obj;
                    this.f88110x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f88104w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41899a c41899a;
                if (interfaceC30057d instanceof C41899a) {
                    c41899a = (C41899a) interfaceC30057d;
                    int i13 = c41899a.f88110x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41899a.f88110x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41899a = new C41899a(interfaceC30057d);
                    }
                } else {
                    c41899a = new C41899a(interfaceC30057d);
                }
                Object obj2 = c41899a.f88109w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41899a.f88110x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f88104w;
                    AbstractC22484e.b bVar = new AbstractC22484e.b((C22482c) obj);
                    c41899a.f88111y = null;
                    c41899a.f88105E = null;
                    c41899a.f88106F = null;
                    c41899a.f88107G = null;
                    c41899a.f88108H = 0;
                    c41899a.f88110x = 1;
                    if (interfaceC13062m.emit(bVar, c41899a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l) {
            this.f88103w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f88103w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kh1.d$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifting.domain.GiftingInteractor$loadGiftingCache$$inlined$cacheAPI$1", m100430f = "GiftingInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f88113w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f88114x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88115y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f88116z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f88116z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d, this.f88116z);
            fVar.f88114x = interfaceC13062m;
            fVar.f88115y = c26832c;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f88113w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f88114x;
                C26832c c26832c = (C26832c) this.f88115y;
                InterfaceC26834e interfaceC26834e = this.f88116z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(GiftingModels.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(GiftingModels.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f88114x = null;
                this.f88115y = null;
                this.f88113w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: kh1.d$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f88117E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ boolean f88118F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C22483d f88119G;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f88120w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f88121x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f88122y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f88123z;

        /* JADX INFO: renamed from: kh1.d$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ String f88124E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ boolean f88125F;

            /* JADX INFO: renamed from: G */
            final /* synthetic */ C22483d f88126G;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f88127w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f88128x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f88129y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f88130z;

            /* JADX INFO: renamed from: kh1.d$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifting.domain.GiftingInteractor$loadGiftingCache$$inlined$map$1$2", m100430f = "GiftingInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41900a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f88131E;

                /* JADX INFO: renamed from: F */
                Object f88132F;

                /* JADX INFO: renamed from: G */
                Object f88133G;

                /* JADX INFO: renamed from: H */
                int f88134H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f88135w;

                /* JADX INFO: renamed from: x */
                int f88136x;

                /* JADX INFO: renamed from: y */
                Object f88137y;

                public C41900a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f88135w = obj;
                    this.f88136x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, String str, String str2, String str3, String str4, boolean z4, C22483d c22483d) {
                this.f88127w = interfaceC13062m;
                this.f88128x = str;
                this.f88129y = str2;
                this.f88130z = str3;
                this.f88124E = str4;
                this.f88125F = z4;
                this.f88126G = c22483d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41900a c41900a;
                C22482c c22482cM64948b;
                C22482c c22482c;
                CountryModel selectedCountry;
                if (interfaceC30057d instanceof C41900a) {
                    c41900a = (C41900a) interfaceC30057d;
                    int i13 = c41900a.f88136x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41900a.f88136x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41900a = new C41900a(interfaceC30057d);
                    }
                } else {
                    c41900a = new C41900a(interfaceC30057d);
                }
                Object obj2 = c41900a.f88135w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41900a.f88136x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f88127w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c22482cM64948b = new C22482c(this.f88128x, this.f88129y, this.f88130z, this.f88124E, InterfaceC22480a.b.f88051a, null, null, 0, null, false, false, false, null, 8160, null);
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                            String str = this.f88128x;
                            String str2 = this.f88129y;
                            String str3 = this.f88130z;
                            String str4 = this.f88124E;
                            InterfaceC29354a.a.b bVar = (InterfaceC29354a.a.b) interfaceC29354a;
                            GiftingModels giftingModels = (GiftingModels) bVar.getData();
                            String initiallySelectedSegmentId = ((GiftingModels) bVar.getData()).getInitiallySelectedSegmentId();
                            c22482c = new C22482c(str, str2, str3, str4, null, giftingModels, null, 0, initiallySelectedSegmentId == null ? "" : initiallySelectedSegmentId, this.f88125F, true, false, null, 6352, null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                            InterfaceC29354a.a.C42173a c42173a = (InterfaceC29354a.a.C42173a) interfaceC29354a;
                            GiftingModels giftingModels2 = (GiftingModels) c42173a.getData();
                            String initiallySelectedSegmentId2 = ((GiftingModels) c42173a.getData()).getInitiallySelectedSegmentId();
                            String str5 = initiallySelectedSegmentId2 == null ? "" : initiallySelectedSegmentId2;
                            CountrySelectorModel countrySelector = ((GiftingModels) c42173a.getData()).getCountrySelector();
                            c22482c = new C22482c(this.f88128x, this.f88129y, this.f88130z, this.f88124E, null, giftingModels2, (countrySelector == null || (selectedCountry = countrySelector.getSelectedCountry()) == null) ? null : selectedCountry.getAlpha3(), 0, str5, false, false, false, null, 7824, null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                            String str6 = this.f88128x;
                            String str7 = this.f88129y;
                            String str8 = this.f88130z;
                            String str9 = this.f88124E;
                            InterfaceC29354a.d dVar = (InterfaceC29354a.d) interfaceC29354a;
                            GiftingModels giftingModels3 = (GiftingModels) dVar.getData();
                            String initiallySelectedSegmentId3 = ((GiftingModels) dVar.getData()).getInitiallySelectedSegmentId();
                            c22482c = new C22482c(str6, str7, str8, str9, null, giftingModels3, null, 0, initiallySelectedSegmentId3 == null ? "" : initiallySelectedSegmentId3, false, false, false, null, 7888, null);
                        } else {
                            if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c22482cM64948b = C22482c.m64948b(this.f88126G.m64967h((InterfaceC29354a.c) interfaceC29354a), this.f88128x, this.f88129y, this.f88130z, this.f88124E, null, null, null, 0, null, false, false, false, null, 8176, null);
                        }
                        c22482cM64948b = c22482c;
                    }
                    c41900a.f88137y = null;
                    c41900a.f88131E = null;
                    c41900a.f88132F = null;
                    c41900a.f88133G = null;
                    c41900a.f88134H = 0;
                    c41900a.f88136x = 1;
                    if (interfaceC13062m.emit(c22482cM64948b, c41900a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l, String str, String str2, String str3, String str4, boolean z4, C22483d c22483d) {
            this.f88120w = interfaceC13058l;
            this.f88121x = str;
            this.f88122y = str2;
            this.f88123z = str3;
            this.f88117E = str4;
            this.f88118F = z4;
            this.f88119G = c22483d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f88120w.collect(new a(interfaceC13062m, this.f88121x, this.f88122y, this.f88123z, this.f88117E, this.f88118F, this.f88119G), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kh1.d$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifting.domain.GiftingInteractor$performAction$$inlined$flatMapLatest$1", m100430f = "GiftingInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C22485f f88139E;

        /* JADX INFO: renamed from: w */
        int f88140w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f88141x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88142y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22483d f88143z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC30057d interfaceC30057d, C22483d c22483d, C22485f c22485f) {
            super(3, interfaceC30057d);
            this.f88143z = c22483d;
            this.f88139E = c22485f;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC30694b abstractC30694b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            h hVar = new h(interfaceC30057d, this.f88143z, this.f88139E);
            hVar.f88141x = interfaceC13062m;
            hVar.f88142y = abstractC30694b;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f88140w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f88141x;
                AbstractC30694b abstractC30694b = (AbstractC30694b) this.f88142y;
                if (abstractC30694b instanceof AbstractC30694b.f) {
                    c0456u = new i(C22483d.m64970k(this.f88143z, false, this.f88139E.getSource(), this.f88139E.getGiftType(), this.f88139E.getTestCount(), this.f88139E.getSelectedTier(), null, 33, null));
                } else if ((abstractC30694b instanceof AbstractC30694b.c) || (abstractC30694b instanceof AbstractC30694b.i)) {
                    c0456u = new C0456u(new AbstractC22484e.c(InterfaceC22480a.b.f88051a), 1);
                } else if (abstractC30694b instanceof AbstractC30694b.n) {
                    c0456u = new C0456u(new AbstractC22484e.c(InterfaceC22480a.e.f88054a), 1);
                } else if (abstractC30694b instanceof AbstractC30694b.d) {
                    c0456u = new C0456u(new AbstractC22484e.b(new C22482c(this.f88139E.getSource(), this.f88139E.getGiftType(), this.f88139E.getTestCount(), this.f88139E.getSelectedTier(), null, null, null, 0, null, false, false, false, new InterfaceC26720a.c(((AbstractC30694b.d) abstractC30694b).getDestination()), 4080, null)), 1);
                } else if (abstractC30694b instanceof AbstractC30694b.a) {
                    c0456u = new C0456u(new AbstractC22484e.c(AbstractC39414r.m125876U(((AbstractC30694b.a) abstractC30694b).getMessage(), "network", true) ? InterfaceC22480a.c.f88052a : InterfaceC22480a.d.f88053a), 1);
                } else {
                    if (!(abstractC30694b instanceof AbstractC30694b.m) && !(abstractC30694b instanceof AbstractC30694b.l) && !(abstractC30694b instanceof AbstractC30694b.k) && !(abstractC30694b instanceof AbstractC30694b.j) && !(abstractC30694b instanceof AbstractC30694b.g) && !(abstractC30694b instanceof AbstractC30694b.e) && !(abstractC30694b instanceof AbstractC30694b.h) && !(abstractC30694b instanceof AbstractC30694b.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0456u = new C0456u(new AbstractC22484e.c(null), 1);
                }
                this.f88141x = null;
                this.f88142y = null;
                this.f88140w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC30694b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: kh1.d$i */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f88144w;

        /* JADX INFO: renamed from: kh1.d$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f88145w;

            /* JADX INFO: renamed from: kh1.d$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifting.domain.GiftingInteractor$performAction$lambda$0$$inlined$map$1$2", m100430f = "GiftingInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41901a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f88146E;

                /* JADX INFO: renamed from: F */
                Object f88147F;

                /* JADX INFO: renamed from: G */
                Object f88148G;

                /* JADX INFO: renamed from: H */
                int f88149H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f88150w;

                /* JADX INFO: renamed from: x */
                int f88151x;

                /* JADX INFO: renamed from: y */
                Object f88152y;

                public C41901a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f88150w = obj;
                    this.f88151x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f88145w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41901a c41901a;
                if (interfaceC30057d instanceof C41901a) {
                    c41901a = (C41901a) interfaceC30057d;
                    int i13 = c41901a.f88151x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41901a.f88151x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41901a = new C41901a(interfaceC30057d);
                    }
                } else {
                    c41901a = new C41901a(interfaceC30057d);
                }
                Object obj2 = c41901a.f88150w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41901a.f88151x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f88145w;
                    AbstractC22484e.b bVar = new AbstractC22484e.b((C22482c) obj);
                    c41901a.f88152y = null;
                    c41901a.f88146E = null;
                    c41901a.f88147F = null;
                    c41901a.f88148G = null;
                    c41901a.f88149H = 0;
                    c41901a.f88151x = 1;
                    if (interfaceC13062m.emit(bVar, c41901a) == enumC31071a) {
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

        public i(InterfaceC13058l interfaceC13058l) {
            this.f88144w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f88144w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C22483d(InterfaceC26834e cachedApiSource, C30695c actionInteractor) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        this.cachedApiSource = cachedApiSource;
        this.actionInteractor = actionInteractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final C22482c m64966g(C22482c previousState, AbstractC22481b action) {
        if (action instanceof AbstractC22481b.g) {
            return previousState;
        }
        if (action instanceof AbstractC22481b.h) {
            return C22482c.m64948b(previousState, null, null, null, null, null, null, null, 0, ((AbstractC22481b.h) action).getSelectedSegmentId(), false, false, false, null, 7935, null);
        }
        if (action instanceof AbstractC22481b.f) {
            return C22482c.m64948b(previousState, null, null, null, null, null, null, null, ((AbstractC22481b.f) action).getQuantity(), null, false, false, false, null, 8063, null);
        }
        if (action instanceof AbstractC22481b.b) {
            return C22482c.m64948b(previousState, null, null, null, null, null, null, null, 0, null, false, false, true, null, 6143, null);
        }
        if (action instanceof AbstractC22481b.c) {
            return C22482c.m64948b(previousState, null, null, null, null, null, null, ((AbstractC22481b.c) action).getCountryCode(), 0, null, false, false, true, null, 6079, null);
        }
        if (action instanceof AbstractC22481b.a) {
            return C22482c.m64948b(previousState, null, null, null, null, null, null, null, 0, null, false, false, true, null, 6143, null);
        }
        return action instanceof AbstractC22481b.d ? m64968i(previousState, ((AbstractC22481b.d) action).getNavigationAction()) : previousState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final C22482c m64967h(InterfaceC29354a.c<GiftingModels> cacheResult) {
        return AbstractC29355b.m89462a(cacheResult) ? new C22482c(null, null, null, null, InterfaceC22480a.d.f88053a, null, null, 0, null, false, false, false, null, 8175, null) : new C22482c(null, null, null, null, InterfaceC22480a.c.f88052a, null, null, 0, null, false, false, false, null, 8175, null);
    }

    /* JADX INFO: renamed from: i */
    private final C22482c m64968i(C22482c c22482c, C9598e c9598e) {
        return C22482c.m64948b(c22482c, null, null, null, null, null, null, null, 0, null, false, false, false, new InterfaceC26720a.c(m64972m(c9598e, c22482c.getSelectedQuantity())), 4095, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final InterfaceC13058l m64969j(boolean manualRefresh, String source, String giftType, String testCount, String selectedTier, String country) {
        return new g(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetGiftingRequest(giftType, testCount, selectedTier, country), 1), null, null, 3, null), new f(null, this.cachedApiSource)), source, giftType, testCount, selectedTier, manualRefresh, this);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ InterfaceC13058l m64970k(C22483d c22483d, boolean z4, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        if ((i13 & 2) != 0) {
            str = "";
        }
        if ((i13 & 4) != 0) {
            str2 = "";
        }
        if ((i13 & 8) != 0) {
            str3 = "";
        }
        if ((i13 & 16) != 0) {
            str4 = "";
        }
        return c22483d.m64969j(z4, str, str2, str3, str4, (i13 & 32) != 0 ? "" : str5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC13058l m64971l(AbstractC22481b.e action, C22485f internalState) {
        return AbstractC13091v.m36590P(this.actionInteractor.interact(new C0456u(new C30698f(action.getAction()), 1)), new h(null, this, internalState));
    }

    /* JADX INFO: renamed from: m */
    private final C9598e m64972m(C9598e destination, int selectedQuantity) {
        if (!(destination.getParameters() instanceof UniversalCheckoutScreenModel)) {
            return destination;
        }
        NavigationScreenModel parameters = destination.getParameters();
        AbstractC22676k.m65748h(parameters, "null cannot be cast to non-null type com.whoop.navigation.UniversalCheckoutScreenModel");
        UniversalCheckoutScreenModel universalCheckoutScreenModel = (UniversalCheckoutScreenModel) parameters;
        UniversalCheckoutPayload payload = universalCheckoutScreenModel.getPayload();
        UniversalCheckoutPayload universalCheckoutPayloadCopy$default = null;
        if (payload != null) {
            List<CartItem> cartItems = payload.getCartItems();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(cartItems, 10));
            int i13 = 0;
            for (Object obj : cartItems) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                arrayList.add(CartItem.copy$default((CartItem) obj, null, selectedQuantity, null, null, 13, null));
                i13 = i14;
            }
            universalCheckoutPayloadCopy$default = UniversalCheckoutPayload.copy$default(payload, arrayList, null, null, null, null, 30, null);
        }
        return C9598e.m23127b(destination, null, UniversalCheckoutScreenModel.copy$default(universalCheckoutScreenModel, null, universalCheckoutPayloadCopy$default, null, null, 13, null), null, 5, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C22482c(null, null, null, null, InterfaceC22480a.b.f88051a, null, null, 0, null, false, false, false, null, 8175, null), AbstractC13091v.m36590P(AbstractC13091v.m36612v(new C13060l1(new C22485f(null, null, null, null, null, 31, null), upstream, new b(null)), 1), new a(null, this)), new c(null));
    }
}
