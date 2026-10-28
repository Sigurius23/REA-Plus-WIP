package c01;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bz0.C3713c;
import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dp0.C12253i;
import fy1.C14873i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.C25235a0;
import m83.C25271y;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;

/* JADX INFO: renamed from: c01.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006\"\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006\"\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0006\"\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006\"\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006¨\u0006\u0014"}, m65681d2 = {"Ll83/a0;", "e", "(Landroidx/compose/runtime/Composer;I)V", "c", "Lc01/h;", "a", "Lc01/h;", "state1", "b", "state2", "state3", "d", "state4", "state5", "f", "state6", "g", "state7", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "state8", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3807g {

    /* JADX INFO: renamed from: a */
    private static final C3808h f15595a;

    /* JADX INFO: renamed from: b */
    private static final C3808h f15596b;

    /* JADX INFO: renamed from: c */
    private static final C3808h f15597c;

    /* JADX INFO: renamed from: d */
    private static final C3808h f15598d;

    /* JADX INFO: renamed from: e */
    private static final C3808h f15599e;

    /* JADX INFO: renamed from: f */
    private static final C3808h f15600f;

    /* JADX INFO: renamed from: g */
    private static final C3808h f15601g;

    /* JADX INFO: renamed from: h */
    private static final C3808h f15602h;

    /* JADX INFO: renamed from: c01.g$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m11650a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-1937862824);
            AbstractC3807g.m11648e(c28655q, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m11650a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c01.g$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f15603w = new b();

        /* JADX INFO: renamed from: a */
        public final long m11651a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(1.0f, whoopColor.getStrain());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11651a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c01.g$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f15604w = new c();

        /* JADX INFO: renamed from: a */
        public final long m11652a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(0.8f, whoopColor.getStrain());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11652a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c01.g$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f15605w = new d();

        /* JADX INFO: renamed from: a */
        public final long m11653a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(0.6f, whoopColor.getStrain());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11653a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c01.g$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f15606w = new e();

        /* JADX INFO: renamed from: a */
        public final long m11654a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11654a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c01.g$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f15607w = new f();

        /* JADX INFO: renamed from: a */
        public final long m11655a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11655a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c01.g$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f15608w = new g();

        /* JADX INFO: renamed from: a */
        public final long m11656a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11656a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c01.g$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f15609w = new h();

        /* JADX INFO: renamed from: a */
        public final long m11657a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11657a((C39336i) obj));
        }
    }

    static {
        TextResource textResourceM21278l = AbstractC8693b.m21278l("SLEEP BREAKDOWN");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("DAYS");
        List listM118959K = AbstractC37056f.m118959K(new C3801a(EnumC39333f.SLEEP, 0.0f, 1, AbstractC8693b.m21278l("Optimal (85%+)"), 2, null), new C3801a(EnumC39333f.SLEEP_REM_SLEEP, 0.0f, 5, AbstractC8693b.m21278l("Sufficient (85%-70%)"), 2, null), new C3801a(EnumC39333f.SLEEP_AWAKE, 0.0f, 9, AbstractC8693b.m21278l("Poor (<70%)"), 2, null));
        C25271y c25271y = C25271y.f99162w;
        f15595a = new C3808h(textResourceM21278l, textResourceM21278l2, listM118959K, c25271y, 1);
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("RECOVERY");
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("DAYS");
        C3801a c3801a = new C3801a(EnumC39333f.RECOVERY, 0.0f, 24, AbstractC8693b.m21278l("Option 1"), 2, null);
        C3801a c3801a2 = new C3801a(EnumC39333f.RECOVERY_HIGH_RECOVERY, 0.0f, 199, AbstractC8693b.m21278l("Option 2"), 2, null);
        C3801a c3801a3 = new C3801a(EnumC39333f.RECOVERY_LOW_RECOVERY, 0.0f, 9, AbstractC8693b.m21278l("Option 3"), 2, null);
        EnumC39333f enumC39333f = EnumC39333f.BRAND_WHITE;
        f15596b = new C3808h(textResourceM21278l3, textResourceM21278l4, AbstractC37056f.m118959K(c3801a, c3801a2, c3801a3, new C3801a(enumC39333f, 0.0f, 0, AbstractC8693b.m21278l("Option 4"), 2, null)), c25271y, 1);
        f15597c = new C3808h(AbstractC8693b.m21278l("RECOVERY"), AbstractC8693b.m21278l("DAYS"), c25271y, AbstractC37056f.m118959K(new C3809i(enumC39333f, 24.29f, AbstractC8693b.m21278l("17:56"), AbstractC8693b.m21278l("Zone 0")), new C3809i(EnumC39333f.STRAIN_ZONE_1, 54.29f, AbstractC8693b.m21278l("29:36"), AbstractC8693b.m21278l("Zone 1")), new C3809i(EnumC39333f.STRAIN_ZONE_2, 15.42f, AbstractC8693b.m21278l("08:20"), AbstractC8693b.m21278l("Zone 2")), new C3809i(EnumC39333f.STRAIN_ZONE_3, 5.0f, AbstractC8693b.m21278l("02:42"), AbstractC8693b.m21278l("Zone 3")), new C3809i(EnumC39333f.STRAIN_ZONE_4, 15.42f, AbstractC8693b.m21278l("08:20"), AbstractC8693b.m21278l("Zone 4")), new C3809i(EnumC39333f.STRAIN_ZONE_5, 5.0f, AbstractC8693b.m21278l("02:42"), AbstractC8693b.m21278l("Zone 5"))), 2);
        f15598d = new C3808h(AbstractC8693b.m21278l("STRENGTH ACTIVITY BREAKDOWN"), AbstractC8693b.m21278l("(WEEKLY TOTAL)"), c25271y, AbstractC37056f.m118959K(new C3809i(p745y81.Function1.m125323a(b.f15603w), 54.0f, AbstractC8693b.m21278l("29:36"), AbstractC8693b.m21278l("Barre3")), new C3809i(p745y81.Function1.m125323a(c.f15604w), 30.0f, AbstractC8693b.m21278l("17:56"), AbstractC8693b.m21278l("Strength Trainer")), new C3809i(p745y81.Function1.m125323a(d.f15605w), 26.0f, AbstractC8693b.m21278l("08:20"), AbstractC8693b.m21278l("HIIT"))), 1);
        f15599e = new C3808h(AbstractC8693b.m21278l("STRENGTH ACTIVITY BREAKDOWN"), AbstractC8693b.m21278l("(AVERAGE WEEKLY TOTAL)"), c25271y, AbstractC37056f.m118958J(new C3809i(p745y81.Function1.m125323a(e.f15606w), 30.0f, AbstractC8693b.m21278l("17:56"), AbstractC8693b.m21278l("Strength Trainer"))), 1);
        f15600f = new C3808h(AbstractC8693b.m21278l("STRENGTH ACTIVITY BREAKDOWN - WITH MORE TEXT"), AbstractC8693b.m21278l("(AVG. WEEKLY TOTAL)"), c25271y, AbstractC37056f.m118958J(new C3809i(p745y81.Function1.m125323a(f.f15607w), 30.0f, AbstractC8693b.m21278l("17:56"), AbstractC8693b.m21278l("Strength Trainer"))), 1);
        f15601g = new C3808h(AbstractC8693b.m21278l("STRENGTH ACTIVITY BREAKDOWN - WITH MORE TEXT REALLY LONG TO MAKE SURE IT WILL WRAP IN MULTIPLE LINES"), AbstractC8693b.m21278l("(AVG. WEEKLY TOTAL)"), c25271y, AbstractC37056f.m118958J(new C3809i(p745y81.Function1.m125323a(g.f15608w), 30.0f, AbstractC8693b.m21278l("17:56"), AbstractC8693b.m21278l("Strength Trainer"))), 1);
        f15602h = new C3808h(AbstractC8693b.m21278l("STRENGTH ACTIVITY BREAKDOWN - WITH MORE TEXT REALLY LONG TO MAKE SURE IT WILL WRAP IN MULTIPLE LINES"), AbstractC8693b.m21278l("(AVG. WEEKLY TOTAL - WITH MORE TEXT REALLY LONG TO MAKE SURE IT WILL WRAP IN MULTIPLE LINES AT LEAST WITH THREE LINES)"), c25271y, AbstractC37056f.m118958J(new C3809i(p745y81.Function1.m125323a(h.f15609w), 30.0f, AbstractC8693b.m21278l("17:56"), AbstractC8693b.m21278l("Strength Trainer"))), 1);
    }

    /* JADX INFO: renamed from: c */
    public static final void m11646c(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1837652958);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new a()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m11647d(int i13, Composer composer, int i14) {
        m11646c(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m11648e(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(31329967);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            AbstractC3805e.m11617i(null, f15595a, c28655q, 0, 1);
            float f13 = 2 * 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            AbstractC3805e.m11617i(null, f15596b, c28655q, 0, 1);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            AbstractC3805e.m11617i(null, f15597c, c28655q, 0, 1);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            AbstractC3805e.m11617i(null, f15598d, c28655q, 0, 1);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m11649f(int i13, Composer composer, int i14) {
        m11648e(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
