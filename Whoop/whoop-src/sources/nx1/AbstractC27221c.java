package nx1;

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
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.membership.management.navigation.AbstractC9127b;
import com.whoop.navigation.C9598e;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.List;
import jp2.C21881l;
import jx1.AbstractC22007b0;
import jx1.AbstractC22022l;
import jx1.C22015f0;
import l83.C23454a0;
import lx1.InterfaceC24791b;
import lx1.InterfaceC24794e;
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
import vu1.AbstractC36517h;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: nx1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aS\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Ljx1/l;", "viewState", "Lkotlin/Function1;", "Llx1/e;", "Ll83/a0;", "onViewEvent", "Lcom/whoop/membership/management/navigation/b;", "onNavEvent", "Lax1/a;", "onAnalyticEvent", "l", "(Ljx1/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ljx1/l$b;", "g", "(Ljx1/l$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27221c {

    /* JADX INFO: renamed from: nx1.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function3 {

        /* JADX INFO: renamed from: w */
        public static final a f108926w = new a();

        /* JADX INFO: renamed from: a */
        public final Modifier m81976a(InterfaceC25312u it, Composer composer, int i13) {
            AbstractC22676k.m65750j(it, "it");
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1623747268);
            Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 2 * 8, 0.0f, 2);
            c28655q.m87173q(false);
            return modifierM3396r;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m81976a((InterfaceC25312u) obj, (Composer) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: nx1.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f108927w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f108928x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f108929y;

        public b(Function1 function1, Function1 function2, Function1 function3) {
            this.f108927w = function1;
            this.f108928x = function2;
            this.f108929y = function3;
        }

        /* JADX INFO: renamed from: a */
        public final void m81977a(Object it) {
            AbstractC22676k.m65750j(it, "it");
            if (it instanceof C9598e) {
                this.f108927w.invoke(new AbstractC9127b.d((C9598e) it));
            } else if (it instanceof InterfaceC24794e) {
                this.f108928x.invoke(it);
            } else if (it instanceof AbstractC2119a) {
                this.f108929y.invoke(it);
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m81977a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nx1.c$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f108930w = new c();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C22015f0 c22015f0) {
            return null;
        }
    }

    /* JADX INFO: renamed from: nx1.c$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f108931w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f108932x;

        public d(Function1 function1, List list) {
            this.f108931w = function1;
            this.f108932x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m81979a(int i13) {
            return this.f108931w.invoke(this.f108932x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m81979a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: nx1.c$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f108933w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f108934x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f108935y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f108936z;

        public e(List list, Function1 function1, Function1 function2, Function1 function3) {
            this.f108933w = list;
            this.f108934x = function1;
            this.f108935y = function2;
            this.f108936z = function3;
        }

        /* JADX INFO: renamed from: a */
        public final void m81980a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15 = (i14 & 6) == 0 ? (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14 : i14;
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C22015f0 c22015f0 = (C22015f0) this.f108933w.get(i13);
            c28655q.m87150e0(-1415913383);
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
            c28655q.m87150e0(578924749);
            List<InterfaceC25312u> listM62922a = c22015f0.m62922a();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM62922a, 10));
            for (InterfaceC25312u interfaceC25312u : listM62922a) {
                C25307p c25307pM62893b = AbstractC22007b0.m62893b();
                a aVar = a.f108926w;
                boolean zM87153g = c28655q.m87153g(this.f108934x) | c28655q.m87153g(this.f108935y) | c28655q.m87153g(this.f108936z);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new b(this.f108934x, this.f108935y, this.f108936z);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(interfaceC25312u, c25307pM62893b, aVar, (Function1) objM87133R, c28655q, C25307p.f99300b << 3, 0);
                arrayList.add(C23454a0.f92919a);
            }
            AbstractC25012a.m73392y(c28655q, false, true, false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m81980a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d3  */
    /* JADX INFO: renamed from: g */
    private static final void m81968g(AbstractC22022l.b bVar, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13) {
        int i14;
        C28676v0 c28676v0;
        boolean z4;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1225511922);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(bVar) ? 4 : 2) | i13;
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
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3488c = AbstractC1127a.m3488c(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(28 * f13, c2314t)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
            Object objM87133R2 = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (objM87133R2 == c28676v1) {
                objM87133R2 = new C26993g(25);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC22953f.m66715b(c28655q, AbstractC18249c.m52565c(AbstractC1125a.m3480c(modifierM3488c, (Function1) objM87133R2), bVar.getStyle().getBackground()));
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
            AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(bVar.getNavigationBarTitle()), null, Integer.valueOf(AbstractC18489d0.m53357C(C38072d.f163053a)), AbstractC8693b.m21273g(AbstractC36517h.f156122e, c28655q, 0), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f13, 7);
            int i15 = i14 & 896;
            boolean z16 = i15 == 256;
            Object objM87133R3 = c28655q.m87133R();
            if (z16) {
                c28676v0 = c28676v1;
            } else {
                c28676v0 = c28676v1;
                if (objM87133R3 == c28676v0) {
                }
                C28676v0 c28676v2 = c28676v0;
                AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R3, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                C22971k c22971kM66746i = AbstractC22977m.m66746i(f13 * 4);
                boolean zM87157i = c28655q.m87157i(bVar);
                if (i15 == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z17 = zM87157i | z4;
                if ((i14 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z18 = z17 | z13;
                if ((i14 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z18 | z14;
                objM87133R = c28655q.m87133R();
                if (z15 || objM87133R == c28676v2) {
                    C21881l c21881l = new C21881l(bVar, function2, function1, function3, 13);
                    c28655q.m87172p0(c21881l);
                    objM87133R = c21881l;
                }
                AbstractC22674j.m65717c(null, null, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R, c28655q, 24576, 495);
                c28655q = c28655q;
                c28655q.m87173q(true);
            }
            objM87133R3 = new C27207n(function2, 2);
            c28655q.m87172p0(objM87133R3);
            C28676v0 c28676v3 = c28676v0;
            AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R3, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f13 * 4);
            boolean zM87157i2 = c28655q.m87157i(bVar);
            if (i15 == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z19 = zM87157i2 | z4;
            if ((i14 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z110 = z19 | z13;
            if ((i14 & 7168) == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z110 | z14;
            objM87133R = c28655q.m87133R();
            if (z15) {
                C21881l c21881l2 = new C21881l(bVar, function2, function1, function3, 13);
                c28655q.m87172p0(c21881l2);
                objM87133R = c21881l2;
            } else {
                C21881l c21881l3 = new C21881l(bVar, function2, function1, function3, 13);
                c28655q.m87172p0(c21881l3);
                objM87133R = c21881l3;
            }
            AbstractC22674j.m65717c(null, null, null, c22971kM66746i2, null, null, false, null, (Function1) objM87133R, c28655q, 24576, 495);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26960m0(bVar, function1, function2, function3, i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m81969h(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        List listM118959K = AbstractC37056f.m118959K(new C17919x(C17919x.f69625b), new C17919x(C17919x.f69636m));
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51493k(AbstractC17911t.f69612b, listM118959K, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m81970i(Function1 function1) {
        function1.invoke(AbstractC9127b.c.f27304a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m81971j(AbstractC22022l.b bVar, Function1 function1, Function1 function2, Function1 function3, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<C22015f0> listM62951b = bVar.m62951b();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM62951b.size(), null, new d(c.f108930w, listM62951b), new C37816b(new e(listM62951b, function1, function2, function3), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m81972k(AbstractC22022l.b bVar, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m81968g(bVar, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static final void m81973l(AbstractC22022l viewState, Function1 onViewEvent, Function1 onNavEvent, Function1 onAnalyticEvent, Composer composer, int i13) {
        int i14;
        boolean z4;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        AbstractC22676k.m65750j(onAnalyticEvent, "onAnalyticEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-198094107);
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
            if (viewState.equals(AbstractC22022l.c.f85400a) || viewState.equals(AbstractC22022l.d.f85401a)) {
                c28655q.m87150e0(336521789);
                z4 = true;
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, true, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 48, 2044);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (viewState.equals(AbstractC22022l.a.f85396a)) {
                c28655q.m87150e0(336816010);
                AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC29579b.f120726d, null, i15, 0 == true ? 1 : 0), false, null, 6, null);
                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC29579b.f120734l, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
                boolean z13 = (i14 & 112) == 32;
                Object objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C27207n(onViewEvent, 1);
                    c28655q.m87172p0(objM87133R);
                }
                z4 = true;
                AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, true, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 48, 2020);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                if (!(viewState instanceof AbstractC22022l.b)) {
                    throw AbstractC11895b.m32003v(-543336427, c28655q, false);
                }
                c28655q.m87150e0(337308383);
                m81968g((AbstractC22022l.b) viewState, onViewEvent, onNavEvent, onAnalyticEvent, c28655q, i14 & 8190);
                c28655q.m87173q(false);
                z4 = true;
            }
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26960m0(viewState, onViewEvent, onNavEvent, onAnalyticEvent, i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m81974m(Function1 function1) {
        function1.invoke(InterfaceC24791b.a.f97026a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m81975n(AbstractC22022l abstractC22022l, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m81973l(abstractC22022l, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
