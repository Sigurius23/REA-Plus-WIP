package nx1;

import am2.C1040r;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ax1.AbstractC2119a;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import cd0.C4435a;
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
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jx1.AbstractC22007b0;
import jx1.AbstractC22009c0;
import jx1.C22015f0;
import l83.C23454a0;
import l83.C23465k;
import lx1.C24795f;
import lx1.InterfaceC24793d;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26960m0;
import nw0.C27207n;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p329n0.C26053f;
import p329n0.C26057j;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24965t;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pv1.AbstractC29579b;
import vu1.AbstractC36517h;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;
import y71.C39282o;

/* JADX INFO: renamed from: nx1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\u001aS\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001aS\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00102\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a?\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00152\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a7\u0010\u0019\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Ljx1/c0;", "viewState", "Lkotlin/Function1;", "Llx1/e;", "Ll83/a0;", "onViewEvent", "Lcom/whoop/membership/management/navigation/b;", "onNavEvent", "Lax1/a;", "onAnalyticEvent", "z", "(Ljx1/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "x", "(Landroidx/compose/runtime/Composer;I)V", "m", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ljx1/c0$c;", "t", "(Ljx1/c0$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "path", "", "payload", "p", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "B", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27226h {

    /* JADX INFO: renamed from: nx1.h$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function3 {

        /* JADX INFO: renamed from: w */
        public static final a f108964w = new a();

        /* JADX INFO: renamed from: a */
        public final Modifier m82036a(InterfaceC25312u it, Composer composer, int i13) {
            AbstractC22676k.m65750j(it, "it");
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1874787516);
            Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 2 * 8, 0.0f, 2);
            c28655q.m87173q(false);
            return modifierM3396r;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m82036a((InterfaceC25312u) obj, (Composer) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: nx1.h$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Function1 f108965E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC25312u f108966w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ FeatureFlagChecker f108967x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f108968y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f108969z;

        public b(InterfaceC25312u interfaceC25312u, FeatureFlagChecker featureFlagChecker, Function1 function1, Function1 function2, Function1 function3) {
            this.f108966w = interfaceC25312u;
            this.f108967x = featureFlagChecker;
            this.f108968y = function1;
            this.f108969z = function2;
            this.f108965E = function3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final void m82037a(Object it) {
            String trackingId;
            AbstractC22676k.m65750j(it, "it");
            InterfaceC25312u interfaceC25312u = this.f108966w;
            String str = null;
            Object[] objArr = 0;
            if ((interfaceC25312u instanceof C39282o) && (trackingId = ((C39282o) interfaceC25312u).getTrackingId()) != null) {
                this.f108965E.invoke(new AbstractC2119a.j(str, trackingId, 1, objArr == true ? 1 : 0));
            }
            if (!(it instanceof C9598e)) {
                if (it instanceof AbstractC9127b) {
                    this.f108969z.invoke(it);
                    return;
                } else {
                    if (it instanceof AbstractC2119a) {
                        this.f108965E.invoke(it);
                        return;
                    }
                    return;
                }
            }
            C9598e c9598e = (C9598e) it;
            if (!(c9598e.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() instanceof AppScreen.C9313g1) || this.f108967x.isFeatureEnabled("use-membership-management-checkout-screen")) {
                this.f108969z.invoke(new AbstractC9127b.d(c9598e));
                return;
            }
            NavigationScreenModel parameters = c9598e.getParameters();
            AbstractC22676k.m65748h(parameters, "null cannot be cast to non-null type com.whoop.navigation.CheckoutScreenModel");
            CheckoutScreenModel checkoutScreenModel = (CheckoutScreenModel) parameters;
            Function1 function1 = this.f108968y;
            String path = checkoutScreenModel.getPath();
            Map<String, String> payload = checkoutScreenModel.getPayload();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, String> entry : payload.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                C23465k c23465k = value != null ? new C23465k(key, value) : null;
                if (c23465k != null) {
                    arrayList.add(c23465k);
                }
            }
            function1.invoke(new InterfaceC24793d.a(path, AbstractC25247g0.m74000i0(arrayList)));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m82037a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nx1.h$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f108970w = new c();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C22015f0 c22015f0) {
            return null;
        }
    }

    /* JADX INFO: renamed from: nx1.h$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f108971w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f108972x;

        public d(Function1 function1, List list) {
            this.f108971w = function1;
            this.f108972x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m82039a(int i13) {
            return this.f108971w.invoke(this.f108972x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m82039a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: nx1.h$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4352n {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Function1 f108973E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f108974w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f108975x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ FeatureFlagChecker f108976y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f108977z;

        public e(List list, Function1 function1, FeatureFlagChecker featureFlagChecker, Function1 function2, Function1 function3) {
            this.f108974w = list;
            this.f108975x = function1;
            this.f108976y = featureFlagChecker;
            this.f108977z = function2;
            this.f108973E = function3;
        }

        /* JADX INFO: renamed from: a */
        public final void m82040a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15 = (i14 & 6) == 0 ? i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) : i14;
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C22015f0 c22015f0 = (C22015f0) this.f108974w.get(i13);
            c28655q.m87150e0(-1243286094);
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
            c28655q.m87150e0(-873339330);
            List<InterfaceC25312u> listM62922a = c22015f0.m62922a();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM62922a, 10));
            for (InterfaceC25312u interfaceC25312u : listM62922a) {
                C25307p c25307pM62893b = AbstractC22007b0.m62893b();
                a aVar = a.f108964w;
                boolean zM87157i = c28655q.m87157i(interfaceC25312u) | c28655q.m87153g(this.f108975x) | c28655q.m87157i(this.f108976y) | c28655q.m87153g(this.f108977z) | c28655q.m87153g(this.f108973E);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    b bVar = new b(interfaceC25312u, this.f108976y, this.f108977z, this.f108973E, this.f108975x);
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
            m82040a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m82006A(AbstractC22009c0 abstractC22009c0, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m82035z(abstractC22009c0, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    private static final void m82007B(Function1 function1, Function1 function2, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1574833807);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(function1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function2) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC29579b.f120737o, null, i15, 0 == true ? 1 : 0);
            boolean z4 = ((i14 & 112) == 32) | ((i14 & 14) == 4);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C11901c(function2, 12, function1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC33199m0.m105214F(new AbstractC33208p0.h(c8688b, 0L, (InterfaceC4339a) objM87133R, 2, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, true, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 48, 2044);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27224f(function1, function2, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m82008C(Function1 function1, Function1 function2) {
        function1.invoke(AbstractC9127b.e.f27307a);
        function2.invoke(C24795f.f97043a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m82009D(Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m82007B(function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    private static final void m82022m(Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-342835294);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(function1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC29579b.f120726d, null, i15, 0 == true ? 1 : 0), false, null, 6, null);
            TextResource textResourceM21267a = AbstractC8693b.m21267a();
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC29579b.f120734l, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C27207n(function1, 4);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, true, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 48, 2020);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4435a(function1, i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m82023n(Function1 function1) {
        function1.invoke(InterfaceC24793d.b.f97041a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m82024o(Function1 function1, int i13, Composer composer, int i14) {
        m82022m(function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    private static final void m82025p(String str, Map<String, String> map, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1040732896);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(map) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC29579b.f120727e, null, i15, 0 == true ? 1 : 0), false, null, 6, null);
            TextResource textResourceM21267a = AbstractC8693b.m21267a();
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC29579b.f120734l, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC29579b.f120723a, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
            int i16 = i14 & 896;
            boolean zM87157i = ((i14 & 14) == 4) | (i16 == 256) | c28655q2.m87157i(map);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C26057j(function1, str, map, 8);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean z4 = i16 == 256;
            Object objM87133R2 = c28655q2.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new C27207n(function1, 6);
                c28655q2.m87172p0(objM87133R2);
            }
            int i17 = 196608 | AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
            int i18 = TextResource.C8688b.f25889c;
            c28655q = c28655q2;
            AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, interfaceC4339a, true, false, c8688b2, (InterfaceC4339a) objM87133R2, null, false, true, c28655q, i17 | (i18 << 9) | (i18 << 21), 48, 1604);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g(str, map, function1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m82026q(Function1 function1, String str, Map map) {
        function1.invoke(new InterfaceC24793d.a(str, map));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m82027r(Function1 function1) {
        function1.invoke(InterfaceC24793d.b.f97041a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m82028s(String str, Map map, Function1 function1, int i13, Composer composer, int i14) {
        m82025p(str, map, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m82029t(AbstractC22009c0.c cVar, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13) {
        int i14;
        Function1 function4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2013988796);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(cVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            function4 = function1;
            i14 |= c28655q.m87157i(function4) ? 32 : 16;
        } else {
            function4 = function1;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(function3) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
            AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getNavigationBarTitle()), null, Integer.valueOf(AbstractC18489d0.m53357C(C38072d.f163053a)), AbstractC8693b.m21273g(AbstractC36517h.f156122e, c28655q, 0), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            int i15 = i14 & 896;
            boolean z4 = i15 == 256;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C27207n(function2, 5);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(8 * 4);
            boolean zM87157i = c28655q.m87157i(cVar) | ((i14 & 7168) == 2048) | c28655q.m87157i(featureFlagChecker) | ((i14 & 112) == 32) | (i15 == 256);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                C1040r c1040r = new C1040r((Object) cVar, (Object) function3, (Object) featureFlagChecker, (Object) function4, (Object) function2, 26);
                c28655q.m87172p0(c1040r);
                objM87133R2 = c1040r;
            }
            AbstractC22674j.m65717c(null, null, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R2, c28655q, 24576, 495);
            c28655q = c28655q;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26960m0(cVar, function1, function2, function3, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m82030u(Function1 function1) {
        function1.invoke(AbstractC9127b.c.f27304a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m82031v(AbstractC22009c0.c cVar, Function1 function1, FeatureFlagChecker featureFlagChecker, Function1 function2, Function1 function3, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<C22015f0> listM62900b = cVar.m62900b();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM62900b.size(), null, new d(c.f108970w, listM62900b), new C37816b(new e(listM62900b, function1, featureFlagChecker, function2, function3), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m82032w(AbstractC22009c0.c cVar, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m82029t(cVar, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final void m82033x(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1663101799);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, true, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 48, 2044);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24965t(i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m82034y(int i13, Composer composer, int i14) {
        m82033x(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    public static final void m82035z(AbstractC22009c0 viewState, Function1 onViewEvent, Function1 onNavEvent, Function1 onAnalyticEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        AbstractC22676k.m65750j(onAnalyticEvent, "onAnalyticEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(127963975);
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
            Modifier modifierM66723l = AbstractC22953f.m66723l(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q, 6);
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
            if (viewState.equals(AbstractC22009c0.d.f85267a) || viewState.equals(AbstractC22009c0.e.f85268a)) {
                c28655q.m87150e0(219896290);
                m82033x(c28655q, 0);
                c28655q.m87173q(false);
            } else if (viewState.equals(AbstractC22009c0.a.f85262a)) {
                c28655q.m87150e0(220021003);
                m82022m(onViewEvent, c28655q, (i14 >> 3) & 14);
                c28655q.m87173q(false);
            } else if (viewState instanceof AbstractC22009c0.c) {
                c28655q.m87150e0(220177429);
                m82029t((AbstractC22009c0.c) viewState, onViewEvent, onNavEvent, onAnalyticEvent, c28655q, i14 & 8190);
                c28655q.m87173q(false);
            } else if (viewState.equals(AbstractC22009c0.f.f85269a)) {
                c28655q.m87150e0(220513221);
                m82007B(onViewEvent, onNavEvent, c28655q, (i14 >> 3) & 126);
                c28655q.m87173q(false);
            } else {
                if (!(viewState instanceof AbstractC22009c0.b)) {
                    throw AbstractC11895b.m32003v(-685645993, c28655q, false);
                }
                c28655q.m87150e0(220712768);
                AbstractC22009c0.b bVar = (AbstractC22009c0.b) viewState;
                m82025p(bVar.getPath(), bVar.m62898b(), onViewEvent, c28655q, (i14 << 3) & 896);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26960m0(viewState, onViewEvent, onNavEvent, onAnalyticEvent, i13, 15);
        }
    }
}
