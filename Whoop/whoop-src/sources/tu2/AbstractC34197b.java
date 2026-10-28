package tu2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1632v;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weightlifting.StrengthTrainerDestination;
import com.whoop.weightlifting.data.domain.StrapLaterality;
import cu2.AbstractC11128h;
import eu2.AbstractC13653j;
import gb1.AbstractC15673b0;
import gz0.AbstractC16319p0;
import io.sentry.config.AbstractC20301a;
import jf3.C21647a;
import kd1.AbstractC22392e;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mr1.C25919i;
import nf3.C26669a;
import no0.C26967q;
import ny0.AbstractC27289x0;
import ny0.EnumC27291y0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p114eb.AbstractC12939a0;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import ru2.InterfaceC31820a;
import s51.C32209f;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sg2.C32451b;
import sg2.C32458i;
import so2.C32848f;
import su2.C33021a;
import su2.C33023c;
import su2.C33024d;
import su2.InterfaceC33022b;
import uv0.AbstractC35283c;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: tu2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\u000b\u001a+\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\r2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, m65681d2 = {"Leb/a0;", "navController", "Ll83/a0;", "m", "(Leb/a0;Landroidx/compose/runtime/Composer;I)V", "Lsu2/d;", "viewState", "Lkotlin/Function1;", "Lsu2/b;", "onViewEvent", "n", "(Lsu2/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "u", "Lsu2/a;", "k", "(Lsu2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lsu2/c;", "viewModel", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34197b {

    /* JADX INFO: renamed from: tu2.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.devicelocation.view.DeviceLocationScreenKt$DeviceLocationAsyncProcess$1$1", m100430f = "DeviceLocationScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f143432w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f143433x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C33021a f143434y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, C33021a c33021a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f143433x = function1;
            this.f143434y = c33021a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f143433x, this.f143434y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f143432w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f143433x.invoke(this.f143434y.getSendEventOnceSpinnerDisplayed());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tu2.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f143435w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f143436x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f143437y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f143438z;

        /* JADX INFO: renamed from: tu2.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f143439w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C21647a c21647a) {
                super(0);
                this.f143439w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f143439w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f143435w = c38266c;
            this.f143436x = interfaceC35951a;
            this.f143437y = interfaceC4339a;
            this.f143438z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, su2.c] */
        @Override // c93.InterfaceC4339a
        public final C33023c invoke() {
            return AbstractC21598x.m60668X(this.f143435w, this.f143436x, new a(this.f143438z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33023c.class), null, this.f143437y);
        }
    }

    /* JADX INFO: renamed from: tu2.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.devicelocation.view.DeviceLocationScreenKt$DeviceLocationScreen$1$1", m100430f = "DeviceLocationScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f143440w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC12939a0 f143441x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f143442y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC12939a0 abstractC12939a0, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f143441x = abstractC12939a0;
            this.f143442y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f143441x, this.f143442y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f143440w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC31820a interfaceC31820aM104289g = AbstractC34197b.m108090p(this.f143442y).getNavigationEvent();
            if (interfaceC31820aM104289g instanceof InterfaceC31820a.a) {
                this.f143441x.m36410z();
            } else if (interfaceC31820aM104289g instanceof InterfaceC31820a.b) {
                StrengthTrainerDestination.C10738a.m28022l(StrengthTrainerDestination.C10738a.f32750a, this.f143441x, AbstractC34197b.m108090p(this.f143442y).getSelectedStrapLocation(), AbstractC34197b.m108090p(this.f143442y).getSelectedStrapLaterality(), false, 4, null);
            } else if (interfaceC31820aM104289g != null) {
                throw new NoWhenBranchMatchedException();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tu2.b$d */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.devicelocation.view.DeviceLocationScreenKt$DeviceLocationScreen$2$1", m100430f = "DeviceLocationScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f143443w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f143444x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f143444x = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f143444x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f143443w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC34197b.m108089o(this.f143444x).m104281q(InterfaceC33022b.b.f137522a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tu2.b$e */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.devicelocation.view.DeviceLocationScreenKt$DeviceLocationScreen$6$1", m100430f = "DeviceLocationScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "Landroidx/lifecycle/x;", "it", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;Landroidx/lifecycle/x;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f143445w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f143446x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function1 function1, InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f143446x = function1;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, AbstractC1638x abstractC1638x, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return new e(this.f143446x, interfaceC30057d).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f143445w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f143446x.invoke(InterfaceC33022b.d.f137524a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m108085k(C33021a viewState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1069011513);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        int i15 = i14;
        boolean z4 = false;
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
            c28655q = c28655q2;
            boolean z13 = (i15 & 112) == 32;
            if ((i15 & 14) == 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState))) {
                z4 = true;
            }
            boolean z14 = z13 | z4;
            Object objM87133R = c28655q.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                objM87133R = new a(onViewEvent, viewState, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(viewState, onViewEvent, i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m108086l(C33021a c33021a, Function1 function1, int i13, Composer composer, int i14) {
        m108085k(c33021a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m108087m(AbstractC12939a0 navController, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(navController, "navController");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1202808484);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(navController) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q.m87152f0(-1688186518);
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c = c26669a.f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new b(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            InterfaceC23462h interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m108089o(interfaceC23462h).getViewState(), C33024d.INSTANCE.m104292a(), null, c28655q, 0, 2);
            InterfaceC31820a interfaceC31820aM104289g = m108090p(interfaceC28601c1M87260n).getNavigationEvent();
            boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(navController);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new c(navController, interfaceC28601c1M87260n, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, interfaceC31820aM104289g);
            boolean zM87157i = c28655q.m87157i(interfaceC23462h);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new d(interfaceC23462h, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
            boolean zM87153g3 = c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(interfaceC23462h);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g3 || objM87133R4 == c28676v0) {
                objM87133R4 = new C32209f(16, interfaceC28601c1M87260n, interfaceC23462h);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R4, false, c28655q, 0, 1);
            C33024d c33024dM108090p = m108090p(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(interfaceC23462h);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i2 || objM87133R5 == c28676v0) {
                objM87133R5 = new C26967q(interfaceC23462h, 5);
                c28655q.m87172p0(objM87133R5);
            }
            m108088n(c33024dM108090p, (Function1) objM87133R5, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25919i(navController, i13, 1);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m108088n(C33024d viewState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1270871181);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            EnumC1632v enumC1632v = EnumC1632v.ON_CREATE;
            int i15 = i14 & 112;
            boolean z4 = i15 == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new e(onViewEvent, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22392e.m64443d(enumC1632v, (Function3) objM87133R, c28655q, 6);
            if (viewState.getAsyncProcessStarted() != null) {
                c28655q.m87150e0(386882655);
                m108085k(viewState.getAsyncProcessStarted(), onViewEvent, c28655q, i15);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(386973299);
                m108095u(viewState, onViewEvent, c28655q, i14 & 126);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34196a(viewState, onViewEvent, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C33023c m108089o(InterfaceC23462h interfaceC23462h) {
        return (C33023c) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C33024d m108090p(InterfaceC28670t2 interfaceC28670t2) {
        return (C33024d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m108091q(InterfaceC28670t2 interfaceC28670t2, InterfaceC23462h interfaceC23462h) {
        if (m108090p(interfaceC28670t2).getAsyncProcessStarted() == null) {
            m108089o(interfaceC23462h).m104281q(InterfaceC33022b.a.f137521a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m108092r(InterfaceC23462h interfaceC23462h, InterfaceC33022b viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        m108089o(interfaceC23462h).m104281q(viewEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m108093s(AbstractC12939a0 abstractC12939a0, int i13, Composer composer, int i14) {
        m108087m(abstractC12939a0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m108094t(C33024d c33024d, Function1 function1, int i13, Composer composer, int i14) {
        m108088n(c33024d, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0329  */
    /* JADX WARN: Code duplicated, block: B:103:0x0347  */
    /* JADX WARN: Code duplicated, block: B:105:0x034d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0352  */
    /* JADX WARN: Code duplicated, block: B:108:0x0354  */
    /* JADX WARN: Code duplicated, block: B:111:0x035c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0361  */
    /* JADX WARN: Code duplicated, block: B:115:0x0364  */
    /* JADX WARN: Code duplicated, block: B:119:0x0390  */
    /* JADX WARN: Code duplicated, block: B:120:0x0392  */
    /* JADX WARN: Code duplicated, block: B:122:0x0396  */
    /* JADX WARN: Code duplicated, block: B:125:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:126:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:129:0x03b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:95:0x031c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0325  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static final void m108095u(C33024d viewState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        Function1 function1;
        C0209i c0209i;
        C28676v0 c28676v0;
        C28676v0 c28676v1;
        float f13;
        boolean z4;
        boolean z13;
        Object objM87133R;
        C28676v0 c28676v2;
        Object[] objArr;
        boolean z14;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1065328207);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66723l = AbstractC22953f.m66723l(AbstractC15673b0.m44028b0(c2314t));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66723l);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            AbstractC6721d.a aVar = new AbstractC6721d.a(new TextResource.C8688b(AbstractC11128h.f35526z0, null, i15, 0 == true ? 1 : 0), null, Integer.valueOf(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            int i16 = i14 & 112;
            boolean z15 = i16 == 32;
            Object objM87133R3 = c28655q.m87133R();
            C28676v0 c28676v3 = C28635l.f115821a;
            if (z15 || objM87133R3 == c28676v3) {
                objM87133R3 = new C32458i(onViewEvent, 14);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R3, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            float f14 = 8;
            float f15 = 3 * f14;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f15, 0.0f, f15, 0.0f, 10);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            AbstractC11266d.m30469w((float) 1.5d, f14, c2314t, c28655q);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC11128h.f35371A0);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            C0209i c0209i6 = c0209i;
            AbstractC30795n.m94707h(strM92103Y, null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            AbstractC11266d.m30469w((float) 2.5d, f14, c2314t, c28655q);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            float f16 = 1;
            float f17 = f16 * 4;
            Modifier modifierM118994r = AbstractC37056f.m118994r(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), AbstractC33253j.m105489e(f17));
            int i18 = 2;
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC11128h.f35397J, null, i18, 0 == true ? 1 : 0);
            EnumC27291y0 enumC27291y0 = EnumC27291y0.TextLarge;
            boolean z16 = viewState.getSelectedStrapLaterality() == StrapLaterality.Left;
            boolean z17 = i16 == 32;
            Object objM87133R4 = c28655q.m87133R();
            if (z17) {
                c28676v0 = c28676v3;
            } else {
                c28676v0 = c28676v3;
                if (objM87133R4 == c28676v0) {
                }
                int i19 = TextResource.C8688b.f25889c | 113246208;
                c28676v1 = c28676v0;
                AbstractC27289x0.m82331c(c8688b, null, null, modifierM118994r, 0L, z16, false, enumC27291y0, true, (Function1) objM87133R4, c28655q, i19, 86);
                AbstractC38963t7.m124386p(f16, f14, c2314t, c28655q);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                Modifier modifierM118994r2 = AbstractC37056f.m118994r(new LayoutWeightElement(f13, true), AbstractC33253j.m105489e(f17));
                TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC11128h.f35400K, null, i18, 0 == true ? 1 : 0);
                if (viewState.getSelectedStrapLaterality() == StrapLaterality.Right) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    c28676v2 = c28676v1;
                } else {
                    c28676v2 = c28676v1;
                    if (objM87133R == c28676v2) {
                    }
                    Function1 function2 = (Function1) objM87133R;
                    function1 = onViewEvent;
                    AbstractC27289x0.m82331c(c8688b2, null, null, modifierM118994r2, 0L, z4, false, enumC27291y0, true, function2, c28655q, i19, 86);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (1.0f > 0.0d) {
                        objArr = true;
                    } else {
                        objArr = false;
                    }
                    if (objArr == false) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC11895b.m32006y(1.0f, true, c28655q);
                    String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC11128h.f35412O);
                    if (i16 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z14 || objM87133R2 == c28676v2) {
                        objM87133R2 = new C32458i(function1, 15);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC13653j.m38495g(null, strM92103Y2, false, null, false, false, (InterfaceC4339a) objM87133R2, c28655q, 0, 61);
                    c28655q.m87173q(true);
                }
                objM87133R = new C32451b(onViewEvent, 16);
                c28655q.m87172p0(objM87133R);
                Function1 function3 = (Function1) objM87133R;
                function1 = onViewEvent;
                AbstractC27289x0.m82331c(c8688b2, null, null, modifierM118994r2, 0L, z4, false, enumC27291y0, true, function3, c28655q, i19, 86);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (1.0f > 0.0d) {
                    objArr = true;
                } else {
                    objArr = false;
                }
                if (objArr == false) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC11895b.m32006y(1.0f, true, c28655q);
                String strM92103Y3 = AbstractC30060g.m92103Y(c28655q, AbstractC11128h.f35412O);
                if (i16 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    objM87133R2 = new C32458i(function1, 15);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C32458i(function1, 15);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC13653j.m38495g(null, strM92103Y3, false, null, false, false, (InterfaceC4339a) objM87133R2, c28655q, 0, 61);
                c28655q.m87173q(true);
            }
            objM87133R4 = new C32451b(onViewEvent, 15);
            c28655q.m87172p0(objM87133R4);
            int i110 = TextResource.C8688b.f25889c | 113246208;
            c28676v1 = c28676v0;
            AbstractC27289x0.m82331c(c8688b, null, null, modifierM118994r, 0L, z16, false, enumC27291y0, true, (Function1) objM87133R4, c28655q, i110, 86);
            AbstractC38963t7.m124386p(f16, f14, c2314t, c28655q);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = 1.0f;
            }
            Modifier modifierM118994r3 = AbstractC37056f.m118994r(new LayoutWeightElement(f13, true), AbstractC33253j.m105489e(f17));
            TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC11128h.f35400K, null, i18, 0 == true ? 1 : 0);
            if (viewState.getSelectedStrapLaterality() == StrapLaterality.Right) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i16 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                c28676v2 = c28676v1;
                if (objM87133R == c28676v2) {
                }
                Function1 function4 = (Function1) objM87133R;
                function1 = onViewEvent;
                AbstractC27289x0.m82331c(c8688b3, null, null, modifierM118994r3, 0L, z4, false, enumC27291y0, true, function4, c28655q, i110, 86);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (1.0f > 0.0d) {
                    objArr = true;
                } else {
                    objArr = false;
                }
                if (objArr == false) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC11895b.m32006y(1.0f, true, c28655q);
                String strM92103Y4 = AbstractC30060g.m92103Y(c28655q, AbstractC11128h.f35412O);
                if (i16 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    objM87133R2 = new C32458i(function1, 15);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C32458i(function1, 15);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC13653j.m38495g(null, strM92103Y4, false, null, false, false, (InterfaceC4339a) objM87133R2, c28655q, 0, 61);
                c28655q.m87173q(true);
            } else {
                c28676v2 = c28676v1;
            }
            objM87133R = new C32451b(onViewEvent, 16);
            c28655q.m87172p0(objM87133R);
            Function1 function5 = (Function1) objM87133R;
            function1 = onViewEvent;
            AbstractC27289x0.m82331c(c8688b3, null, null, modifierM118994r3, 0L, z4, false, enumC27291y0, true, function5, c28655q, i110, 86);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            if (1.0f > 0.0d) {
                objArr = true;
            } else {
                objArr = false;
            }
            if (objArr == false) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC11895b.m32006y(1.0f, true, c28655q);
            String strM92103Y5 = AbstractC30060g.m92103Y(c28655q, AbstractC11128h.f35412O);
            if (i16 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z14) {
                objM87133R2 = new C32458i(function1, 15);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C32458i(function1, 15);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC13653j.m38495g(null, strM92103Y5, false, null, false, false, (InterfaceC4339a) objM87133R2, c28655q, 0, 61);
            c28655q.m87173q(true);
        } else {
            function1 = onViewEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34196a(viewState, function1, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m108096v(Function1 function1) {
        function1.invoke(InterfaceC33022b.a.f137521a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m108097w(Function1 function1, boolean z4) {
        function1.invoke(InterfaceC33022b.c.f137523a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m108098x(Function1 function1, boolean z4) {
        function1.invoke(InterfaceC33022b.e.f137525a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m108099y(Function1 function1) {
        function1.invoke(InterfaceC33022b.f.f137526a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m108100z(C33024d c33024d, Function1 function1, int i13, Composer composer, int i14) {
        m108095u(c33024d, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
