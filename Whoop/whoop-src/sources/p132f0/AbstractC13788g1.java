package p132f0;

import androidx.compose.runtime.Composer;
import dc1.C11906c;
import p390p1.C28596b0;
import p390p1.C28635l;
import p390p1.C28655q;

/* JADX INFO: renamed from: f0.g1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13788g1 {

    /* JADX INFO: renamed from: a */
    public static final C28596b0 f49194a = new C28596b0(new C11906c(28));

    /* JADX INFO: renamed from: a */
    public static final C13798k m39147a(Composer composer) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(282942128);
        C13801l c13801l = (C13801l) c28655q.m87161k(f49194a);
        if (c13801l == null) {
            c28655q.m87173q(false);
            return null;
        }
        boolean zM87153g = c28655q.m87153g(c13801l);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            C13798k c13798k = new C13798k(c13801l.f49245a, c13801l.f49246b, c13801l.f49247c, c13801l.f49248d);
            c28655q.m87172p0(c13798k);
            objM87133R = c13798k;
        }
        C13798k c13798k2 = (C13798k) objM87133R;
        c28655q.m87173q(false);
        return c13798k2;
    }
}
