package l03;

import android.content.Context;
import androidx.compose.runtime.Composer;
import d03.AbstractC11447b;
import gy0.AbstractC16272a;
import j11.C21205h;
import k03.AbstractC22109n;
import l83.C23454a0;
import o03.AbstractC27356a;
import p335n6.AbstractC26391h;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p477s2.AbstractC32072d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l03.i */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"", "batteryPercentage", "Ll83/a0;", "b", "(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V", "widget_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23059i {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m67037b(Integer num, Composer composer, int i13) {
        int i14;
        String string;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2084623898);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(num) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            if (num != null) {
                c28655q.m87150e0(2098521731);
                c28655q.m87173q(false);
                string = num + "%";
            } else {
                c28655q.m87150e0(1868810983);
                string = ((Context) c28655q.m87161k(AbstractC26391h.f104841b)).getString(AbstractC11447b.f36719b);
                AbstractC22676k.m65747g(string);
                c28655q.m87173q(false);
            }
            AbstractC22109n.m63308u(AbstractC16272a.f62006T4, string, AbstractC27356a.m82536c(num), AbstractC27356a.m82537d(num), AbstractC32072d.m99710t(24), c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21205h(num, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m67038c(Integer num, int i13, Composer composer, int i14) {
        m67037b(num, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
