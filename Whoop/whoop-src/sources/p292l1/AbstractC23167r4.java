package p292l1;

import androidx.compose.runtime.Composer;
import p027b3.AbstractC2453v1;
import p390p1.C28635l;
import p390p1.C28655q;
import p636y3.InterfaceC39171c;
import vf3.AbstractC35952b;

/* JADX INFO: renamed from: l1.r4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23167r4 {

    /* JADX INFO: renamed from: a */
    public static final float f91625a;

    static {
        AbstractC35952b.m114193a(16, 8);
        f91625a = 200;
    }

    /* JADX INFO: renamed from: a */
    public static C23191v4 m67134a(Composer composer) {
        C28655q c28655q = (C28655q) composer;
        int iMo724F = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo724F(AbstractC23185u4.f91709a);
        boolean zM87149e = c28655q.m87149e(iMo724F);
        Object objM87133R = c28655q.m87133R();
        if (zM87149e || objM87133R == C28635l.f115821a) {
            objM87133R = new C23191v4(iMo724F);
            c28655q.m87172p0(objM87133R);
        }
        return (C23191v4) objM87133R;
    }
}
