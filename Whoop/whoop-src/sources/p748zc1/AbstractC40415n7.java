package p748zc1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import kd1.AbstractC22399k;
import l83.C23454a0;
import nz0.AbstractC27302a;
import nz0.AbstractC27304c;
import nz0.C27303b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: zc1.n7 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40415n7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m130447b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1855808436);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3409f, c38072d.m121949b(c28655q, i14).getWhite10(), AbstractC17918w0.f69621a);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC22399k.m64473c("With Text", c28655q, 6);
            C27303b c27303b = new C27303b(new AbstractC27302a.b(AbstractC8693b.m21278l("8:18")));
            TextResource textResourceM21278l = AbstractC8693b.m21278l("HOURS OF SLEEP");
            long jM125393f0 = c38072d.m121949b(c28655q, i14).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
            int i15 = (C27303b.f109363b << 3) | (TextResource.$stable << 6);
            AbstractC27304c.m82400e(null, c27303b, textResourceM21278l, jM125393f0, null, false, c28655q, i15, 49);
            AbstractC27304c.m82400e(null, new C27303b(new AbstractC27302a.b(AbstractC8693b.m21278l("--:--"))), AbstractC8693b.m21278l("SLEEP NEEDED"), c38072d.m121949b(c28655q, i14).getAccentAction(), null, false, c28655q, i15, 49);
            C23454a0 c23454a0 = C23454a0.f92919a;
            AbstractC37056f.m118959K(c23454a0, c23454a0);
            AbstractC22399k.m64473c("With Icon", c28655q, 6);
            int i16 = 2;
            AbstractC27304c.m82400e(null, new C27303b(new AbstractC27302a.a(new C39274g(c38072d.m121951d().getVarious().getMissingData(), null, i16, 0 == true ? 1 : 0))), AbstractC8693b.m21278l("SLEEP NEEDED"), c38072d.m121949b(c28655q, i14).getAccentAction(), null, false, c28655q, i15, 49);
            AbstractC27304c.m82400e(null, new C27303b(new AbstractC27302a.a(new C39274g(AbstractC25012a.m73369b(c38072d), 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0))), AbstractC8693b.m21278l("SLEEP NEEDED"), c38072d.m121949b(c28655q, i14).getAccentAction(), null, false, c28655q, i15, 49);
            AbstractC37056f.m118959K(c23454a0, c23454a0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40337g6(i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m130448c(int i13, Composer composer, int i14) {
        m130447b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
