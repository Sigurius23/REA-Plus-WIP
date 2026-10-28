package l31;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import k71.C22254k;
import l83.C23454a0;
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
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import wb3.AbstractC37056f;
import y71.C39271d;

/* JADX INFO: renamed from: l31.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"", "enabled", "Ll83/a0;", "b", "(ZLandroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23307a {
    /* JADX INFO: renamed from: b */
    public static final void m67392b(boolean z4, Composer composer, int i13, int i14) {
        boolean z13;
        int i15;
        boolean z14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1228037570);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            z13 = z4;
        } else if ((i13 & 6) == 0) {
            z13 = z4;
            i15 = (c28655q.m87155h(z13) ? 4 : 2) | i13;
        } else {
            z13 = z4;
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            z14 = i16 != 0 ? true : z13;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q, 6);
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
            int i17 = 4;
            DefaultConstructorMarker defaultConstructorMarker = null;
            boolean z15 = false;
            AbstractC25303l.m74291r(new C39271d(AbstractC8693b.m21278l("WITH DOT MENU"), z14, z15, "weightlifting", "moreOptionsClicked", true, i17, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            AbstractC25303l.m74291r(new C39271d(AbstractC8693b.m21278l("WITHOUT DOT MENU"), z14, z15, "weightlifting", "moreOptionsClicked", false, i17, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            z14 = z13;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22254k(z14, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m67393c(boolean z4, int i13, int i14, Composer composer, int i15) {
        m67392b(z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
