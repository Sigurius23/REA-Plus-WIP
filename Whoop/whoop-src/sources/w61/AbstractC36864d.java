package w61;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import az0.AbstractC2159b;
import bp0.C3527o;
import com.whoop.data.local.room.dao.persistent.C6493d;
import i91.AbstractC18249c;
import k91.C22302a;
import l83.C23454a0;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p91.AbstractC29011e;
import p91.C29007a;
import wb3.AbstractC37056f;
import y61.C39261b;

/* JADX INFO: renamed from: w61.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Ly61/b;", "barState", "Ll83/a0;", "c", "(Ly61/b;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36864d {
    /* JADX INFO: renamed from: c */
    public static final void m118237c(C39261b barState, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(barState, "barState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-449868728);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(barState) : c28655q.m87157i(barState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            long jMo134584toComposableColorWaAFU9c = barState.getColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
            Modifier modifierM88145f = AbstractC29011e.m88145f(C2314t.f9131w, barState.getXPercent(), 0.0f, 1.0f, 0.0f, new C29007a(0.0f, 0.0f, false, false, 15, null), 8, null);
            boolean zM87151f = c28655q.m87151f(jMo134584toComposableColorWaAFU9c);
            Object objM87133R = c28655q.m87133R();
            if (zM87151f || objM87133R == C28635l.f115821a) {
                objM87133R = new C6493d(jMo134584toComposableColorWaAFU9c, 4);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC2159b.m6721b(modifierM88145f, AbstractC18249c.m52572j((Function1) objM87133R), C22302a.INSTANCE.m64093a(0), c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3527o(barState, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final AbstractC17911t m118238d(long j7, C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, j7)), new C17919x(C17919x.f69636m)), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m118239e(C39261b c39261b, int i13, Composer composer, int i14) {
        m118237c(c39261b, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
