package p040c0;

import android.view.ViewConfiguration;
import androidx.compose.runtime.Composer;
import p027b3.AbstractC2453v1;
import p037bu.C3632c;
import p077d0.C11413x;
import p390p1.C28635l;
import p390p1.C28655q;
import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: c0.t1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3781t1 {

    /* JADX INFO: renamed from: a */
    public static final float f15422a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: a */
    public static final C11413x m11572a(Composer composer) {
        C28655q c28655q = (C28655q) composer;
        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
        boolean zM87147d = c28655q.m87147d(interfaceC39171c.getDensity());
        Object objM87133R = c28655q.m87133R();
        if (zM87147d || objM87133R == C28635l.f115821a) {
            objM87133R = new C11413x(new C3632c(interfaceC39171c));
            c28655q.m87172p0(objM87133R);
        }
        return (C11413x) objM87133R;
    }
}
