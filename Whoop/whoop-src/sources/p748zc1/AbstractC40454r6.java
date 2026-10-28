package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dp0.C12253i;
import fy1.C14873i;
import gz0.EnumC16313m0;
import h31.AbstractC16812e;
import h31.AbstractC16819l;
import h31.C16814g;
import h31.C16824q;
import h31.EnumC16810c;
import h31.EnumC16813f;
import h31.EnumC16821n;
import hy0.AbstractC17755i2;
import hy0.EnumC17740f;
import i31.AbstractC18048c;
import java.util.ArrayList;
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
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;

/* JADX INFO: renamed from: zc1.r6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40454r6 {

    /* JADX INFO: renamed from: zc1.r6$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m130760a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(306114996);
            float f13 = 2;
            Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f13, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13 * 4), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            TextResource textResourceM21278l = AbstractC8693b.m21278l("Tiles");
            EnumC17740f enumC17740f = EnumC17740f.LEFT;
            int i14 = (TextResource.$stable << 9) | 384;
            AbstractC17755i2.m50938j(null, null, enumC17740f, textResourceM21278l, null, 0L, 0L, null, c28655q, i14, 243);
            C16824q c16824qM47388l = AbstractC16819l.m47388l(null, null, null, null, null, false, 63, null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = b.f174398w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC16819l.m47379c(c16824qM47388l, (Function1) objM87133R, null, c28655q, 48, 4);
            EnumC16821n enumC16821n = EnumC16821n.COMMITTED;
            EnumC16813f enumC16813f = EnumC16813f.COMMITTED;
            EnumC16313m0 enumC16313m0 = EnumC16313m0.CHECKMARK;
            C16824q c16824qM47388l2 = AbstractC16819l.m47388l(null, enumC16821n, null, null, AbstractC16812e.m47360k(enumC16813f, "COMMITTED", enumC16313m0, false, null, 24, null), false, 45, null);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = f.f174402w;
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC16819l.m47379c(c16824qM47388l2, (Function1) objM87133R2, null, c28655q, 48, 4);
            EnumC16821n enumC16821n2 = EnumC16821n.COMPLETED;
            EnumC16813f enumC16813f2 = EnumC16813f.COMPLETED;
            C16824q c16824qM47388l3 = AbstractC16819l.m47388l(null, enumC16821n2, null, null, AbstractC16812e.m47360k(enumC16813f2, "COMPLETED", enumC16313m0, false, null, 24, null), false, 45, null);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = g.f174403w;
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC16819l.m47379c(c16824qM47388l3, (Function1) objM87133R3, null, c28655q, 48, 4);
            C25271y c25271y = C25271y.f99162w;
            C16824q c16824qM47388l4 = AbstractC16819l.m47388l(null, null, AbstractC18048c.m51834n(null, null, null, null, null, c25271y, null, null, false, false, null, 1943, null), AbstractC37056f.m118958J(AbstractC40373j9.m130135e()), null, false, 51, null);
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = h.f174404w;
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC16819l.m47379c(c16824qM47388l4, (Function1) objM87133R4, null, c28655q, 48, 4);
            C16824q c16824qM47388l5 = AbstractC16819l.m47388l("recommendation-with-zone-bars", null, null, AbstractC37056f.m118958J(AbstractC40373j9.m130134d()), null, false, 54, null);
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = i.f174405w;
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC16819l.m47379c(c16824qM47388l5, (Function1) objM87133R5, null, c28655q, 48, 4);
            AbstractC17755i2.m50938j(null, null, enumC17740f, AbstractC8693b.m21278l("Header"), null, 0L, 0L, null, c28655q, i14, 243);
            AbstractC18048c.m51828h(AbstractC18048c.m51836p(null, null, true, false, false, null, 43, null), null, null, c28655q, 0, 6);
            AbstractC18048c.m51828h(AbstractC18048c.m51836p(null, null, false, false, false, null, 47, null), null, null, c28655q, 0, 6);
            AbstractC18048c.m51828h(AbstractC18048c.m51834n(null, null, null, null, null, null, null, null, false, false, null, 2047, null), null, null, c28655q, 0, 6);
            AbstractC18048c.m51828h(AbstractC18048c.m51834n(null, null, null, null, null, c25271y, null, null, false, false, null, 1943, null), null, null, c28655q, 0, 6);
            AbstractC17755i2.m50938j(null, null, enumC17740f, AbstractC8693b.m21278l("Button"), null, 0L, 0L, null, c28655q, i14, 243);
            EnumC16813f enumC16813f3 = EnumC16813f.UNCOMMITTED;
            C16814g c16814gM47360k = AbstractC16812e.m47360k(enumC16813f3, "COMMIT", null, false, null, 28, null);
            Object objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = j.f174406w;
                c28655q.m87172p0(objM87133R6);
            }
            int i15 = C16814g.f64579g | 48;
            AbstractC16812e.m47353d(c16814gM47360k, (Function1) objM87133R6, null, c28655q, i15, 4);
            C16814g c16814gM47360k2 = AbstractC16812e.m47360k(enumC16813f, "COMMITTED", enumC16313m0, false, null, 24, null);
            Object objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = k.f174407w;
                c28655q.m87172p0(objM87133R7);
            }
            AbstractC16812e.m47353d(c16814gM47360k2, (Function1) objM87133R7, null, c28655q, i15, 4);
            C16814g c16814gM47360k3 = AbstractC16812e.m47360k(enumC16813f2, "COMPLETED", enumC16313m0, false, null, 24, null);
            Object objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = l.f174408w;
                c28655q.m87172p0(objM87133R8);
            }
            AbstractC16812e.m47353d(c16814gM47360k3, (Function1) objM87133R8, null, c28655q, i15, 4);
            EnumC16810c enumC16810c = EnumC16810c.LIST;
            C16814g c16814gM47360k4 = AbstractC16812e.m47360k(enumC16813f, "COMMITTED", enumC16313m0, false, enumC16810c, 8, null);
            Object objM87133R9 = c28655q.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = m.f174409w;
                c28655q.m87172p0(objM87133R9);
            }
            AbstractC16812e.m47353d(c16814gM47360k4, (Function1) objM87133R9, null, c28655q, i15, 4);
            EnumC16813f enumC16813f4 = EnumC16813f.LOADING;
            C16814g c16814gM47360k5 = AbstractC16812e.m47360k(enumC16813f4, "COMMIT", null, false, null, 28, null);
            Object objM87133R10 = c28655q.m87133R();
            if (objM87133R10 == c28676v0) {
                objM87133R10 = c.f174399w;
                c28655q.m87172p0(objM87133R10);
            }
            AbstractC16812e.m47353d(c16814gM47360k5, (Function1) objM87133R10, null, c28655q, i15, 4);
            C16814g c16814gM47360k6 = AbstractC16812e.m47360k(enumC16813f4, "COMMIT", null, false, enumC16810c, 12, null);
            Object objM87133R11 = c28655q.m87133R();
            if (objM87133R11 == c28676v0) {
                objM87133R11 = d.f174400w;
                c28655q.m87172p0(objM87133R11);
            }
            AbstractC16812e.m47353d(c16814gM47360k6, (Function1) objM87133R11, null, c28655q, i15, 4);
            C16814g c16814gM47360k7 = AbstractC16812e.m47360k(enumC16813f3, "COMMIT", null, false, null, 20, null);
            Object objM87133R12 = c28655q.m87133R();
            if (objM87133R12 == c28676v0) {
                objM87133R12 = e.f174401w;
                c28655q.m87172p0(objM87133R12);
            }
            AbstractC16812e.m47353d(c16814gM47360k7, (Function1) objM87133R12, null, c28655q, i15, 4);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m130760a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zc1.r6$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f174398w = new b();

        /* JADX INFO: renamed from: a */
        public final void m130761a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m130761a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zc1.r6$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f174399w = new c();

        /* JADX INFO: renamed from: a */
        public final void m130762a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m130762a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zc1.r6$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f174400w = new d();

        /* JADX INFO: renamed from: a */
        public final void m130763a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m130763a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zc1.r6$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f174401w = new e();

        /* JADX INFO: renamed from: a */
        public final void m130764a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m130764a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zc1.r6$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f174402w = new f();

        /* JADX INFO: renamed from: a */
        public final void m130765a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m130765a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zc1.r6$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f174403w = new g();

        /* JADX INFO: renamed from: a */
        public final void m130766a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m130766a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zc1.r6$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f174404w = new h();

        /* JADX INFO: renamed from: a */
        public final void m130767a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m130767a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zc1.r6$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f174405w = new i();

        /* JADX INFO: renamed from: a */
        public final void m130768a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m130768a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zc1.r6$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f174406w = new j();

        /* JADX INFO: renamed from: a */
        public final void m130769a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m130769a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zc1.r6$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f174407w = new k();

        /* JADX INFO: renamed from: a */
        public final void m130770a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m130770a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zc1.r6$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f174408w = new l();

        /* JADX INFO: renamed from: a */
        public final void m130771a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m130771a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zc1.r6$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f174409w = new m();

        /* JADX INFO: renamed from: a */
        public final void m130772a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m130772a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m130758b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1778083560);
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
            c28677v1M87180u.f115982d = new C40337g6(i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m130759c(int i13, Composer composer, int i14) {
        m130758b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
