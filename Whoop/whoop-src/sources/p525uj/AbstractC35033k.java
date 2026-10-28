package p525uj;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import p088dc.AbstractC11894a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p427qj.C30416a;
import p602x1.C37816b;

/* JADX INFO: renamed from: uj.k */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC35033k {

    /* JADX INFO: renamed from: a */
    public static final C28674u2 f148295a = new C28674u2(C35025c.f148209F);

    /* JADX INFO: renamed from: a */
    public static final void m110709a(C35035m c35035m, boolean z4, C37816b c37816b, Composer composer, int i13) {
        C35035m c35035m2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1557574904);
        if ((((c28655q.m87153g(c35035m) ? 4 : 2) | i13 | 16) & 731) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                z4 = AbstractC11894a.m31939G(c28655q);
            } else {
                c28655q.m87138X();
            }
            c28655q.m87175r();
            if (c35035m == null) {
                c35035m2 = z4 ? C35035m.f148303p0 : C35035m.f148302o0;
            } else {
                c35035m2 = c35035m;
            }
            AbstractC28683x.m87247a(f148295a.mo86977a(c35035m2), c37816b, c28655q, 56);
        }
        boolean z13 = z4;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C30416a(c35035m, z13, c37816b, i13, 2);
    }

    /* JADX INFO: renamed from: b */
    public static final int m110710b(Activity activity) {
        Configuration configuration;
        Resources resources = activity.getResources();
        Integer numValueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.uiMode & 48);
        return (numValueOf != null && numValueOf.intValue() == 32) ? 2 : 1;
    }
}
