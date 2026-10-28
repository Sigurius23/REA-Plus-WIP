package p748zc1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import kd1.AbstractC22399k;
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
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: zc1.s4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "", "d", "()Ljava/lang/String;", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40462s4 {
    /* JADX INFO: renamed from: b */
    public static final void m130829b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1739982184);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9111N, c28655q, 54);
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
            AbstractC22399k.m64473c("Markdown", c28655q, 6);
            AbstractC21048g.m58840j0(c28655q, 0);
            AbstractC22399k.m64473c("Markdown with Custom Styling", c28655q, 6);
            String strM130831d = m130831d();
            C21053l c21053l = C21053l.f79834a;
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            c28655q = c28655q;
            AbstractC21048g.m58807M(strM130831d, null, false, c21053l.m58880a(c38072d.m121952e(c28655q, i14).getB3().getStyle(), c38072d.m121949b(c28655q, i14).getAccentAlert(), c38072d.m121949b(c28655q, i14).getRecoveryHighRecovery(), c38072d.m121949b(c28655q, i14).getStrainZone4(), null, c38072d.m121949b(c28655q, i14).getSleepDeepSleep(), 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, C21053l.f79835b << 15, 32720), null, 0, 0, 0, false, c28655q, C21054m.f79836p << 9, 502);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40461s3(i13, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m130830c(int i13, Composer composer, int i14) {
        m130829b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    private static final String m130831d() {
        return "This workout might help you.\n\n**6 exercises, 18 total sets, 30 mins.**\n\n> * Back Squat - Barbell\n> * Deadlift - Sumo - Barbell\n> * Hip Thrust - Barbell\n> * Lateral Lunge - Goblet - Alternating-Dumbbell\n> * Back Extensions\n> * Hanging Leg Raises\n\nThis text is not in the block quote\n\n[This is a link](https://www.whoop.com/us/en/thelocker/)";
    }
}
