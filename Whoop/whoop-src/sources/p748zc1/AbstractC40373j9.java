package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.service.network.model.UserSessionDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22399k;
import l83.C23454a0;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p745y81.EnumC39333f;
import u41.C34534b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.j9 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\"\u001a\u0010\b\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\n\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0005\u001a\u0004\b\t\u0010\u0007\"\u001a\u0010\r\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u001a\u0010\u000f\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007\"\u001a\u0010\u0013\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007\"\u001a\u0010\u0015\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0016"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "Lu41/b;", "a", "Lu41/b;", "d", "()Lu41/b;", "hrZoneBar", "e", "intensityBar", "c", "getUnevenWeightBar", "unevenWeightBar", "f", "zoneBarNoBarTitle", "g", "zoneBarNoZoneLabels", "getZoneBarNoZoneTitles", "zoneBarNoZoneTitles", "getZoneBarNoZoneText", "zoneBarNoZoneText", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40373j9 {

    /* JADX INFO: renamed from: a */
    private static final C34534b f174322a;

    /* JADX INFO: renamed from: b */
    private static final C34534b f174323b;

    /* JADX INFO: renamed from: c */
    private static final C34534b f174324c;

    /* JADX INFO: renamed from: d */
    private static final C34534b f174325d;

    /* JADX INFO: renamed from: e */
    private static final C34534b f174326e;

    /* JADX INFO: renamed from: f */
    private static final C34534b f174327f;

    /* JADX INFO: renamed from: g */
    private static final C34534b f174328g;

    static {
        EnumC39333f enumC39333f = EnumC39333f.STRAIN_ZONE_1;
        C34534b.a aVar = new C34534b.a("Zone 1", "10 min ", enumC39333f, 20.0f);
        EnumC39333f enumC39333f2 = EnumC39333f.STRAIN_ZONE_2;
        C34534b.a aVar2 = new C34534b.a("Zone 2", "20 min", enumC39333f2, 15.0f);
        EnumC39333f enumC39333f3 = EnumC39333f.STRAIN_ZONE_3;
        C34534b.a aVar3 = new C34534b.a("Zone 3", "25 min", enumC39333f3, 20.0f);
        EnumC39333f enumC39333f4 = EnumC39333f.STRAIN_ZONE_4;
        C34534b.a aVar4 = new C34534b.a("Zone 4", "7 min", enumC39333f4, 10.0f);
        EnumC39333f enumC39333f5 = EnumC39333f.STRAIN_ZONE_5;
        C34534b c34534b = new C34534b("HR Zone Targets:", AbstractC37056f.m118959K(aVar, aVar2, aVar3, aVar4, new C34534b.a("Zone 5", "5 min", enumC39333f5, 5.0f)), null);
        f174322a = c34534b;
        f174323b = new C34534b("Intensity Level:", AbstractC37056f.m118959K(new C34534b.a("Low", null, enumC39333f2, 1.0f), new C34534b.a("Medium", null, enumC39333f3, 1.0f), new C34534b.a("High", null, enumC39333f4, 1.0f)), Float.valueOf(0.66f));
        f174324c = new C34534b("Uneven Weights", AbstractC37056f.m118959K(new C34534b.a("A", "2", enumC39333f, 2.0f), new C34534b.a("B", "4", enumC39333f3, 4.0f), new C34534b.a("C", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, enumC39333f5, 1.0f)), null);
        f174325d = C34534b.m109113b(c34534b, null, null, null, 6, null);
        List<C34534b.a> listM109117f = c34534b.m109117f();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM109117f, 10));
        Iterator<T> it = listM109117f.iterator();
        while (it.hasNext()) {
            arrayList.add(C34534b.a.m109118b((C34534b.a) it.next(), null, null, null, 0.0f, 13, null));
        }
        f174326e = C34534b.m109113b(c34534b, null, arrayList, null, 5, null);
        C34534b c34534b2 = f174322a;
        List<C34534b.a> listM109117f2 = c34534b2.m109117f();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM109117f2, 10));
        Iterator<T> it3 = listM109117f2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(C34534b.a.m109118b((C34534b.a) it3.next(), null, null, null, 0.0f, 14, null));
        }
        f174327f = C34534b.m109113b(c34534b2, null, arrayList2, null, 5, null);
        C34534b c34534b3 = f174322a;
        List<C34534b.a> listM109117f3 = c34534b3.m109117f();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM109117f3, 10));
        Iterator<T> it4 = listM109117f3.iterator();
        while (it4.hasNext()) {
            arrayList3.add(C34534b.a.m109118b((C34534b.a) it4.next(), null, null, null, 0.0f, 12, null));
        }
        f174328g = C34534b.m109113b(c34534b3, null, arrayList3, null, 5, null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m130132b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1094295900);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(3 * f13), C2299e.f9110M, c28655q, 6);
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
            AbstractC22399k.m64473c("HR zones — 5 zones, labeled", c28655q, 6);
            C34534b c34534b = f174322a;
            int i14 = C34534b.f145154d;
            AbstractC25303l.m74291r(c34534b, null, null, null, c28655q, i14, 14);
            AbstractC22399k.m64473c("Intensity — 3 zones, indicator @ 0.66", c28655q, 6);
            C34534b c34534b2 = f174323b;
            AbstractC25303l.m74291r(c34534b2, null, null, null, c28655q, i14, 14);
            AbstractC22399k.m64473c("Intensity — indicator @ 0.1", c28655q, 6);
            AbstractC25303l.m74291r(C34534b.m109113b(c34534b2, null, null, Float.valueOf(0.1f), 3, null), null, null, null, c28655q, i14, 14);
            AbstractC22399k.m64473c("HR zones — weights that don't sum to 1", c28655q, 6);
            AbstractC25303l.m74291r(f174324c, null, null, null, c28655q, i14, 14);
            AbstractC22399k.m64473c("No bar title", c28655q, 6);
            AbstractC25303l.m74291r(f174325d, null, null, null, c28655q, i14, 14);
            AbstractC22399k.m64473c("Zones without labels", c28655q, 6);
            AbstractC25303l.m74291r(f174326e, null, null, null, c28655q, i14, 14);
            AbstractC22399k.m64473c("Zones without titles", c28655q, 6);
            AbstractC25303l.m74291r(f174327f, null, null, null, c28655q, i14, 14);
            AbstractC22399k.m64473c("Zones without titles or labels", c28655q, 6);
            AbstractC25303l.m74291r(f174328g, null, null, null, c28655q, i14, 14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40506w8(i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m130133c(int i13, Composer composer, int i14) {
        m130132b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public static final C34534b m130134d() {
        return f174322a;
    }

    /* JADX INFO: renamed from: e */
    public static final C34534b m130135e() {
        return f174323b;
    }

    /* JADX INFO: renamed from: f */
    public static final C34534b m130136f() {
        return f174325d;
    }

    /* JADX INFO: renamed from: g */
    public static final C34534b m130137g() {
        return f174326e;
    }
}
