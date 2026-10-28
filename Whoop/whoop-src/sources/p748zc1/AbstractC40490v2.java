package p748zc1;

import a71.C0520a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b61.AbstractC2756k;
import b71.AbstractC2781b;
import c41.AbstractC4134v2;
import c41.AbstractC4155y2;
import c41.C4141w2;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cz0.AbstractC11255p;
import cz0.AbstractC11258s;
import d61.InterfaceC11732a;
import d71.AbstractC11759e;
import j61.C21374h;
import j71.AbstractC21394b;
import j71.C21395c;
import java.util.ArrayList;
import java.util.List;
import kd1.AbstractC22399k;
import l61.AbstractC23376a;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31915d;
import r61.AbstractC30986i;
import wb3.AbstractC37056f;
import x30.C37900j1;
import x81.C38072d;
import y71.C39277j;
import yf1.C39516e;

/* JADX INFO: renamed from: zc1.v2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0010\u001a\u00020\u00052\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000e\"\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u0005*\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001c²\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00188\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00188\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Ll83/a0;", "m", "(Landroidx/compose/runtime/Composer;I)V", "", "title", "Lj71/c;", "data", "o", "(Ljava/lang/String;Lj71/c;Landroidx/compose/runtime/Composer;I)V", "galleryTitle", "firstScrubberTitle", "secondScrubberTitle", "f", "(Ljava/lang/String;Lj71/c;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "", "states", "t", "([Lj71/c;)Lj71/c;", "u", "(Lj71/c;)Lj71/c;", "Ly3/f;", "a", "F", "spacerHeight", "Lcom/whoop/design/util/TextResource;", "scrubValue", "firstScrubValue", "secondScrubValue", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40490v2 {

    /* JADX INFO: renamed from: a */
    private static final float f174426a = 6 * 4;

    /* JADX INFO: renamed from: f */
    private static final void m131008f(String str, C21395c c21395c, String str2, String str3, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-29210787);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c21395c) : c28655q.m87157i(c21395c) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(str2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(str3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            float f13 = f174426a;
            C2314t c2314t = C2314t.f9131w;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            AbstractC22399k.m64473c(str, c28655q, i15 & 14);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            AbstractC4155y2.c cVar = new AbstractC4155y2.c(AbstractC8693b.m21278l("f"));
            C38072d c38072d = C38072d.f163053a;
            int iM46335g = c38072d.m121951d().getVarious().getAttention();
            TextResource textResourceM21278l = AbstractC8693b.m21278l(str2);
            TextResource textResourceM131009g = m131009g(interfaceC28601c1);
            if (textResourceM131009g == null) {
                textResourceM131009g = AbstractC8693b.m21278l("--");
            }
            C4141w2 c4141w2 = new C4141w2(null, null, cVar, iM46335g, null, null, textResourceM21278l, null, textResourceM131009g, null, null, null, null, false, 16051, null);
            int i16 = C4141w2.f16853o;
            AbstractC4134v2.m12812m(c4141w2, null, null, c28655q, i16, 6);
            AbstractC4155y2.c cVar2 = new AbstractC4155y2.c(AbstractC8693b.m21278l("f"));
            int iM46335g2 = c38072d.m121951d().getVarious().getAttention();
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(str3);
            TextResource textResourceM131011i = m131011i(interfaceC28601c2);
            if (textResourceM131011i == null) {
                textResourceM131011i = AbstractC8693b.m21278l("--");
            }
            AbstractC4134v2.m12812m(new C4141w2(null, null, cVar2, iM46335g2, null, null, textResourceM21278l2, null, textResourceM131011i, null, null, null, null, false, 16051, null), null, null, c28655q, i16, 6);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = c21395c.m60096f().get(0).getId();
                c28655q.m87172p0(objM87133R3);
            }
            String str4 = (String) objM87133R3;
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = c21395c.m60096f().get(1).getId();
                c28655q.m87172p0(objM87133R4);
            }
            String str5 = (String) objM87133R4;
            Modifier modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, c2314t), false, 1.3333334f);
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C31915d(str4, str5, interfaceC28601c1, interfaceC28601c2, 24);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC2756k.m7799p(modifierM3384f, c21395c, null, null, false, null, (Function1) objM87133R5, c28655q, (C21395c.f81985e << 3) | 1572870 | (i15 & 112), 60);
            c28655q = c28655q;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39277j(str, c21395c, str2, str3, i13, 14);
        }
    }

    /* JADX INFO: renamed from: g */
    private static final TextResource m131009g(InterfaceC28601c1 interfaceC28601c1) {
        return (TextResource) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: h */
    private static final void m131010h(InterfaceC28601c1 interfaceC28601c1, TextResource textResource) {
        interfaceC28601c1.setValue(textResource);
    }

    /* JADX INFO: renamed from: i */
    private static final TextResource m131011i(InterfaceC28601c1 interfaceC28601c1) {
        return (TextResource) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: j */
    private static final void m131012j(InterfaceC28601c1 interfaceC28601c1, TextResource textResource) {
        interfaceC28601c1.setValue(textResource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m131013k(String str, String str2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Object it) {
        List<C0520a> listMo30408a;
        C0520a c0520a;
        List<C0520a> listMo30408a2;
        C0520a c0520a2;
        AbstractC22676k.m65750j(it, "it");
        boolean z4 = it instanceof InterfaceC11732a;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!z4) {
            return c23454a0;
        }
        InterfaceC11732a interfaceC11732a = (InterfaceC11732a) it;
        AbstractC11258s abstractC11258s = interfaceC11732a.mo31360b().get(str);
        TextResource textResourceM1231k = null;
        m131010h(interfaceC28601c1, (abstractC11258s == null || (listMo30408a2 = abstractC11258s.mo30408a()) == null || (c0520a2 = (C0520a) AbstractC25265s.m74102I0(0, listMo30408a2)) == null) ? null : c0520a2.getValueDisplay());
        AbstractC11258s abstractC11258s2 = interfaceC11732a.mo31360b().get(str2);
        if (abstractC11258s2 != null && (listMo30408a = abstractC11258s2.mo30408a()) != null && (c0520a = (C0520a) AbstractC25265s.m74102I0(0, listMo30408a)) != null) {
            textResourceM1231k = c0520a.getValueDisplay();
        }
        m131012j(interfaceC28601c2, textResourceM1231k);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m131014l(String str, C21395c c21395c, String str2, String str3, int i13, Composer composer, int i14) {
        m131008f(str, c21395c, str2, str3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m131015m(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(132268988);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            AbstractC22399k.m64473c("Data Scrubber Lines", c28655q, 6);
            AbstractC11255p.m30397b(c28655q, 0);
            C21395c c21395cM131023u = m131023u(AbstractC30986i.m95388e());
            int i14 = C21395c.f81985e << 3;
            int i15 = i14 | 6;
            m131017o("Single Line Plot Data Scrubber", c21395cM131023u, c28655q, i15);
            m131017o("Single Bar Plot Data Scrubber", m131023u(AbstractC11759e.m31479n(c28655q, 0)), c28655q, i15);
            int i16 = i14 | 3462;
            m131008f("Single Band Plot Data Scrubber", m131023u(AbstractC23376a.m67656c()), "white", "cyan", c28655q, i16);
            m131008f("Dual Line Plot Data Scrubber", m131023u(m131022t(AbstractC30986i.m95388e(), AbstractC30986i.m95386c())), "Blue line", "Red line", c28655q, i16);
            m131008f("Gap Dual Line Data Scrubber", m131023u(m131022t(AbstractC30986i.m95388e(), AbstractC30986i.m95387d())), "Blue line", "Red line", c28655q, i16);
            m131017o("Line and Trend Pot", m131023u(m131022t(AbstractC30986i.m95388e(), AbstractC2781b.m7880d(c28655q, 0))), c28655q, i15);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40388l2(i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m131016n(int i13, Composer composer, int i14) {
        m131015m(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m131017o(String str, C21395c c21395c, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(922655301);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c21395c) : c28655q.m87157i(c21395c) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = f174426a;
            C2314t c2314t = C2314t.f9131w;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            AbstractC22399k.m64473c(str, c28655q, i14 & 14);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(AbstractC8693b.m21267a());
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            AbstractC4134v2.m12812m(new C4141w2(null, null, new AbstractC4155y2.c(AbstractC8693b.m21278l("f")), C38072d.f163053a.m121951d().getVarious().getAttention(), null, null, AbstractC8693b.m21278l("yPercent"), null, m131018p(interfaceC28601c1), null, null, null, null, false, 16051, null), null, null, c28655q, C4141w2.f16853o, 6);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = ((AbstractC21394b) AbstractC25265s.m74096F0(c21395c.m60096f())).getId();
                c28655q.m87172p0(objM87133R2);
            }
            String str2 = (String) objM87133R2;
            Modifier modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, c2314t), false, 1.3333334f);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C37900j1(19, str2, interfaceC28601c1);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC2756k.m7799p(modifierM3384f, c21395c, null, null, false, null, (Function1) objM87133R3, c28655q, (C21395c.f81985e << 3) | 1572870 | (i14 & 112), 60);
            c28655q = c28655q;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(str, c21395c, i13, 14);
        }
    }

    /* JADX INFO: renamed from: p */
    private static final TextResource m131018p(InterfaceC28601c1 interfaceC28601c1) {
        return (TextResource) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: q */
    private static final void m131019q(InterfaceC28601c1 interfaceC28601c1, TextResource textResource) {
        interfaceC28601c1.setValue(textResource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m131020r(String str, InterfaceC28601c1 interfaceC28601c1, Object it) {
        TextResource textResourceM21278l;
        List<C0520a> listMo30408a;
        C0520a c0520a;
        AbstractC22676k.m65750j(it, "it");
        boolean z4 = it instanceof InterfaceC11732a;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!z4) {
            return c23454a0;
        }
        AbstractC11258s abstractC11258s = ((InterfaceC11732a) it).mo31360b().get(str);
        if (abstractC11258s == null || (listMo30408a = abstractC11258s.mo30408a()) == null || (c0520a = (C0520a) AbstractC25265s.m74102I0(0, listMo30408a)) == null || (textResourceM21278l = c0520a.getValueDisplay()) == null) {
            textResourceM21278l = AbstractC8693b.m21278l("--");
        }
        m131019q(interfaceC28601c1, textResourceM21278l);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m131021s(String str, C21395c c21395c, int i13, Composer composer, int i14) {
        m131017o(str, c21395c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final C21395c m131022t(C21395c... c21395cArr) {
        ArrayList arrayList = new ArrayList(c21395cArr.length);
        for (C21395c c21395c : c21395cArr) {
            arrayList.add(c21395c.m60096f());
        }
        return C21395c.m60092b((C21395c) AbstractC25260n.m74078s0(c21395cArr), null, AbstractC25267u.m74164j0(arrayList), null, null, 13, null);
    }

    /* JADX INFO: renamed from: u */
    private static final C21395c m131023u(C21395c c21395c) {
        C21374h plane = c21395c.getPlane();
        return C21395c.m60092b(c21395c, plane.m59985a((8187 & 1) != 0 ? plane.startVerticalAxis : null, (8187 & 2) != 0 ? plane.endVerticalAxis : null, (8187 & 4) != 0 ? plane.bottomHorizontalAxis : null, (8187 & 8) != 0 ? plane.topHorizontalAxis : null, (8187 & 16) != 0 ? plane.insets : null, (8187 & 32) != 0 ? plane.lines : null, (8187 & 64) != 0 ? plane.graphAnnotations : null, (8187 & 128) != 0 ? plane.accessibilityState : null, (8187 & 256) != 0 ? plane.scrubberEnabled : true, (8187 & 512) != 0 ? plane.clickable : false, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? plane.buttons : null, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? plane.longPressTimeoutMillis : 0L, (8187 & 4096) != 0 ? plane.horizontalGridLinePadding : 0.0f), null, null, null, 14, null);
    }
}
