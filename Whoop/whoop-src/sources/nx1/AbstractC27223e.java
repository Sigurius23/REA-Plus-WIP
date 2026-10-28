package nx1;

import am2.C1040r;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import ax1.AbstractC2119a;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.membership.management.navigation.AbstractC9127b;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CheckoutScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import dc0.C11901c;
import fy1.AbstractC14874j;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jx1.AbstractC22007b0;
import jx1.AbstractC22025o;
import jx1.C22015f0;
import jx1.C22029s;
import l83.C23454a0;
import l83.C23465k;
import lx1.C24795f;
import lx1.InterfaceC24792c;
import lx1.InterfaceC24794e;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26960m0;
import no1.C26993g;
import nw0.C27207n;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pv1.AbstractC29579b;
import q21.C29850i;
import vu1.AbstractC36517h;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: nx1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aS\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Ljx1/o;", "viewState", "Lkotlin/Function1;", "Llx1/e;", "Ll83/a0;", "onViewEvent", "Lcom/whoop/membership/management/navigation/b;", "onNavEvent", "Lax1/a;", "onAnalyticEvent", "j", "(Ljx1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ljx1/o$c;", "p", "(Ljx1/o$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27223e {

    /* JADX INFO: renamed from: nx1.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function3 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC25312u f108940w;

        public a(InterfaceC25312u interfaceC25312u) {
            this.f108940w = interfaceC25312u;
        }

        /* JADX INFO: renamed from: a */
        public final Modifier m82001a(InterfaceC25312u it, Composer composer, int i13) {
            Modifier modifierM3396r;
            AbstractC22676k.m65750j(it, "it");
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(394751594);
            boolean z4 = this.f108940w instanceof C29850i;
            C2314t c2314t = C2314t.f9131w;
            if (z4) {
                float f13 = 8;
                modifierM3396r = AbstractC1099a.m3395q(c2314t, 2 * f13, 3 * f13);
            } else {
                modifierM3396r = AbstractC1099a.m3396r(c2314t, 2 * 8, 0.0f, 2);
            }
            c28655q.m87173q(false);
            return modifierM3396r;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m82001a((InterfaceC25312u) obj, (Composer) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: nx1.e$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Function1 f108941E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ FeatureFlagChecker f108942w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC22025o.c f108943x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f108944y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f108945z;

        public b(FeatureFlagChecker featureFlagChecker, AbstractC22025o.c cVar, Function1 function1, Function1 function2, Function1 function3) {
            this.f108942w = featureFlagChecker;
            this.f108943x = cVar;
            this.f108944y = function1;
            this.f108945z = function2;
            this.f108941E = function3;
        }

        /* JADX INFO: renamed from: a */
        public final void m82002a(Object it) {
            AbstractC22676k.m65750j(it, "it");
            if (!(it instanceof C9598e)) {
                if (it instanceof InterfaceC24794e) {
                    this.f108945z.invoke(it);
                    return;
                } else {
                    if (it instanceof AbstractC2119a) {
                        this.f108941E.invoke(it);
                        return;
                    }
                    return;
                }
            }
            C9598e c9598e = (C9598e) it;
            AppScreen screen = c9598e.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String();
            if (!(screen instanceof AppScreen.C9313g1)) {
                if (screen instanceof AppScreen.C9318g6) {
                    this.f108944y.invoke(AbstractC9127b.c.f27304a);
                    return;
                } else {
                    this.f108944y.invoke(new AbstractC9127b.d(c9598e));
                    return;
                }
            }
            if (!this.f108942w.isFeatureEnabled("use-membership-management-checkout-screen")) {
                NavigationScreenModel parameters = c9598e.getParameters();
                AbstractC22676k.m65748h(parameters, "null cannot be cast to non-null type com.whoop.navigation.CheckoutScreenModel");
                CheckoutScreenModel checkoutScreenModel = (CheckoutScreenModel) parameters;
                this.f108945z.invoke(new InterfaceC24792c.a(checkoutScreenModel.getPath(), checkoutScreenModel.getPayload(), null, 4, null));
                return;
            }
            List<C22015f0> listM62962c = this.f108943x.m62962c();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it3 = listM62962c.iterator();
            while (it3.hasNext()) {
                AbstractC25265s.m74141p0(arrayList, ((C22015f0) it3.next()).m62922a());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof C22029s) {
                    arrayList2.add(obj);
                }
            }
            C22029s c22029s = (C22029s) AbstractC25265s.m74100H0(arrayList2);
            NavigationScreenModel parameters2 = c9598e.getParameters();
            AbstractC22676k.m65748h(parameters2, "null cannot be cast to non-null type com.whoop.navigation.CheckoutScreenModel");
            CheckoutScreenModel checkoutScreenModel2 = (CheckoutScreenModel) parameters2;
            Function1 function1 = this.f108944y;
            String path = checkoutScreenModel2.getPath();
            Map<String, String> payload = checkoutScreenModel2.getPayload();
            ArrayList arrayList3 = new ArrayList();
            Iterator<Map.Entry<String, String>> it4 = payload.entrySet().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Map.Entry<String, String> next = it4.next();
                String key = next.getKey();
                String value = next.getValue();
                C23465k c23465k = value != null ? new C23465k(key, value) : null;
                if (c23465k != null) {
                    arrayList3.add(c23465k);
                }
            }
            function1.invoke(new AbstractC9127b.a(path, AbstractC25247g0.m74000i0(arrayList3), c22029s != null ? c22029s.getCard() : null, false, 8, null));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m82002a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nx1.e$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f108946w = new c();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C22015f0 c22015f0) {
            return null;
        }
    }

    /* JADX INFO: renamed from: nx1.e$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f108947w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f108948x;

        public d(Function1 function1, List list) {
            this.f108947w = function1;
            this.f108948x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m82004a(int i13) {
            return this.f108947w.invoke(this.f108948x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m82004a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: nx1.e$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4352n {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Function1 f108949E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ Function1 f108950F;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f108951w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ FeatureFlagChecker f108952x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC22025o.c f108953y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f108954z;

        public e(List list, FeatureFlagChecker featureFlagChecker, AbstractC22025o.c cVar, Function1 function1, Function1 function2, Function1 function3) {
            this.f108951w = list;
            this.f108952x = featureFlagChecker;
            this.f108953y = cVar;
            this.f108954z = function1;
            this.f108949E = function2;
            this.f108950F = function3;
        }

        /* JADX INFO: renamed from: a */
        public final void m82005a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15 = (i14 & 6) == 0 ? i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) : i14;
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C22015f0 c22015f0 = (C22015f0) this.f108951w.get(i13);
            c28655q.m87150e0(-1945698354);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(3 * 4), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(253573004);
            List<InterfaceC25312u> listM62922a = c22015f0.m62922a();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM62922a, 10));
            for (InterfaceC25312u interfaceC25312u : listM62922a) {
                C25307p c25307pM62893b = AbstractC22007b0.m62893b();
                a aVar = new a(interfaceC25312u);
                boolean zM87157i = c28655q.m87157i(this.f108952x) | c28655q.m87157i(this.f108953y) | c28655q.m87153g(this.f108954z) | c28655q.m87153g(this.f108949E) | c28655q.m87153g(this.f108950F);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    b bVar = new b(this.f108952x, this.f108953y, this.f108954z, this.f108949E, this.f108950F);
                    c28655q.m87172p0(bVar);
                    objM87133R = bVar;
                }
                AbstractC25303l.m74291r(interfaceC25312u, c25307pM62893b, aVar, (Function1) objM87133R, c28655q, C25307p.f99300b << 3, 0);
                arrayList.add(C23454a0.f92919a);
            }
            AbstractC25012a.m73392y(c28655q, false, true, false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m82005a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static final void m81990j(AbstractC22025o viewState, Function1 function1, Function1 function2, Function1 onAnalyticEvent, Composer composer, int i13) {
        int i14;
        boolean z4;
        boolean z13;
        Function1 onViewEvent = function1;
        Function1 onNavEvent = function2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        AbstractC22676k.m65750j(onAnalyticEvent, "onAnalyticEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1027343433);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onAnalyticEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            int i16 = i14 & 14;
            AbstractC14874j.m42904c(viewState, "upsell_subscription", c28655q, i16 | 48);
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (viewState.equals(AbstractC22025o.d.f85414b)) {
                c28655q.m87150e0(1186609803);
                z13 = true;
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, true, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 48, 2044);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                boolean z14 = viewState instanceof AbstractC22025o.a;
                C28676v0 c28676v0 = C28635l.f115821a;
                List list = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                Object[] objArr6 = 0;
                Object[] objArr7 = 0;
                Object[] objArr8 = 0;
                Object[] objArr9 = 0;
                Object[] objArr10 = 0;
                Object[] objArr11 = 0;
                if (z14) {
                    c28655q.m87150e0(1186930002);
                    AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC29579b.f120726d, list, i15, objArr11 == true ? 1 : 0), false, null, 6, null);
                    TextResource textResourceM21267a = AbstractC8693b.m21267a();
                    TextResource c8688b = ((AbstractC22025o.a) viewState).m62956b() != null ? new TextResource.C8688b(AbstractC29579b.f120734l, objArr10 == true ? 1 : 0, i15, objArr9 == true ? 1 : 0) : AbstractC8693b.m21267a();
                    boolean z15 = ((i14 & 112) == 32) | (i16 == 4);
                    Object objM87133R = c28655q.m87133R();
                    if (z15 || objM87133R == c28676v0) {
                        objM87133R = new C27222d(viewState, onViewEvent, 0);
                        c28655q.m87172p0(objM87133R);
                    }
                    int i17 = AbstractC33208p0.b.f138467h;
                    int i18 = TextResource.$stable;
                    int i19 = i17 | (i18 << 3) | (i18 << 9);
                    z13 = true;
                    AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, true, c28655q, i19, 48, 2020);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC22025o.c) {
                    c28655q.m87150e0(-515873418);
                    m81996p((AbstractC22025o.c) viewState, function1, onNavEvent, onAnalyticEvent, c28655q, i14 & 8190);
                    onViewEvent = function1;
                    onNavEvent = onNavEvent;
                    c28655q.m87173q(false);
                    z4 = true;
                } else if (viewState.equals(AbstractC22025o.e.f85415b)) {
                    c28655q.m87150e0(1188128648);
                    TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC29579b.f120737o, objArr8 == true ? 1 : 0, i15, objArr7 == true ? 1 : 0);
                    boolean z16 = ((i14 & 112) == 32) | ((i14 & 896) == 256);
                    Object objM87133R2 = c28655q.m87133R();
                    if (z16 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C11901c(onNavEvent, 11, onViewEvent);
                        c28655q.m87172p0(objM87133R2);
                    }
                    z4 = true;
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(c8688b2, 0L, (InterfaceC4339a) objM87133R2, 2, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, true, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 48, 2044);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    z4 = true;
                    if (!(viewState instanceof AbstractC22025o.b)) {
                        throw AbstractC11895b.m32003v(-515910693, c28655q, false);
                    }
                    c28655q.m87150e0(1188823234);
                    AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC29579b.f120727e, objArr6 == true ? 1 : 0, i15, objArr5 == true ? 1 : 0), false, null, 6, null);
                    TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                    TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC29579b.f120734l, objArr4 == true ? 1 : 0, i15, objArr3 == true ? 1 : 0);
                    TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC29579b.f120723a, objArr2 == true ? 1 : 0, i15, objArr == true ? 1 : 0);
                    boolean z17 = ((AbstractC22025o.b) viewState).getPath().length() > 0;
                    int i24 = i14 & 112;
                    boolean z18 = (i16 == 4) | (i24 == 32);
                    Object objM87133R3 = c28655q.m87133R();
                    if (z18 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C27222d(viewState, onViewEvent, 1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
                    boolean z19 = (i24 == 32) | (i16 == 4);
                    Object objM87133R4 = c28655q.m87133R();
                    if (z19 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C27222d(viewState, onViewEvent);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i25 = AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
                    int i26 = TextResource.C8688b.f25889c;
                    AbstractC33199m0.m105214F(bVar2, textResourceM21267a2, null, c8688b3, interfaceC4339a, z17, false, c8688b4, (InterfaceC4339a) objM87133R4, null, false, true, c28655q, i25 | (i26 << 9) | (i26 << 21), 48, 1604);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z4);
            }
            z4 = z13;
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26960m0(viewState, onViewEvent, onNavEvent, onAnalyticEvent, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m81991k(AbstractC22025o abstractC22025o, Function1 function1) {
        AbstractC22025o.a aVar = (AbstractC22025o.a) abstractC22025o;
        if (aVar.m62956b() != null) {
            function1.invoke(new InterfaceC24792c.c(aVar.m62956b()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m81992l(Function1 function1, Function1 function2) {
        function1.invoke(AbstractC9127b.e.f27307a);
        function2.invoke(C24795f.f97043a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m81993m(AbstractC22025o abstractC22025o, Function1 function1) {
        AbstractC22025o.b bVar = (AbstractC22025o.b) abstractC22025o;
        if (bVar.m62958c() != null) {
            function1.invoke(new InterfaceC24792c.a(bVar.getPath(), bVar.m62958c(), bVar.getCard()));
        } else {
            function1.invoke(new InterfaceC24792c.c(bVar.m62959d()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m81994n(Function1 function1, AbstractC22025o abstractC22025o) {
        function1.invoke(new InterfaceC24792c.c(((AbstractC22025o.b) abstractC22025o).m62959d()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m81995o(AbstractC22025o abstractC22025o, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m81990j(abstractC22025o, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m81996p(AbstractC22025o.c cVar, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1354057588);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(cVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(function3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3488c = AbstractC1127a.m3488c(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(28 * f13, c2314t)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C26993g(26);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22953f.m66715b(c28655q, AbstractC18249c.m52565c(AbstractC1125a.m3480c(modifierM3488c, (Function1) objM87133R), cVar.getStyle().getBackground()));
            Modifier modifierM66723l = AbstractC22953f.m66723l(c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getNavigationBarTitle()), null, Integer.valueOf(AbstractC18489d0.m53357C(C38072d.f163053a)), AbstractC8693b.m21273g(AbstractC36517h.f156122e, c28655q, 0), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f13, 7);
            int i15 = i14 & 896;
            boolean z4 = i15 == 256;
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new C27207n(function2, 3);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f13 * 4);
            boolean zM87157i = c28655q.m87157i(cVar) | c28655q.m87157i(featureFlagChecker) | (i15 == 256) | ((i14 & 112) == 32) | ((i14 & 7168) == 2048);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                C1040r c1040r = new C1040r(cVar, featureFlagChecker, function2, function1, function3, 25, false);
                c28655q.m87172p0(c1040r);
                objM87133R3 = c1040r;
            }
            AbstractC22674j.m65717c(null, null, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R3, c28655q, 24576, 495);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26960m0(cVar, function1, function2, function3, i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m81997q(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        List listM118959K = AbstractC37056f.m118959K(new C17919x(C17919x.f69625b), new C17919x(C17919x.f69636m));
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51493k(AbstractC17911t.f69612b, listM118959K, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m81998r(Function1 function1) {
        function1.invoke(AbstractC9127b.c.f27304a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m81999s(AbstractC22025o.c cVar, FeatureFlagChecker featureFlagChecker, Function1 function1, Function1 function2, Function1 function3, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<C22015f0> listM62962c = cVar.m62962c();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM62962c.size(), null, new d(c.f108946w, listM62962c), new C37816b(new e(listM62962c, featureFlagChecker, cVar, function1, function2, function3), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m82000t(AbstractC22025o.c cVar, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m81996p(cVar, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
