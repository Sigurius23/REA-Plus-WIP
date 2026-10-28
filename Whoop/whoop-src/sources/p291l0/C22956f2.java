package p291l0;

import androidx.compose.runtime.Composer;
import java.util.WeakHashMap;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: l0.f2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22956f2 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90600w;

    public /* synthetic */ C22956f2(int i13) {
        this.f90600w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f90600w;
        C28676v0 c28676v0 = C28635l.f115821a;
        switch (i13) {
            case 0:
                ((Number) obj3).intValue();
                C28655q c28655q = (C28655q) ((Composer) obj2);
                c28655q.m87150e0(359872873);
                WeakHashMap weakHashMap = C22944c2.f90553v;
                C22944c2 c22944c2M66712e = C22949e.m66712e(c28655q);
                boolean zM87153g = c28655q.m87153g(c22944c2M66712e);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = new C23008w0(c22944c2M66712e.f90558e);
                    c28655q.m87172p0(objM87133R);
                }
                C23008w0 c23008w0 = (C23008w0) objM87133R;
                c28655q.m87173q(false);
                return c23008w0;
            default:
                ((Number) obj3).intValue();
                C28655q c28655q2 = (C28655q) ((Composer) obj2);
                c28655q2.m87150e0(359872873);
                WeakHashMap weakHashMap2 = C22944c2.f90553v;
                C22944c2 c22944c2M66712e2 = C22949e.m66712e(c28655q2);
                boolean zM87153g2 = c28655q2.m87153g(c22944c2M66712e2);
                Object objM87133R2 = c28655q2.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C23008w0(c22944c2M66712e2.f90559f);
                    c28655q2.m87172p0(objM87133R2);
                }
                C23008w0 c23008w1 = (C23008w0) objM87133R2;
                c28655q2.m87173q(false);
                return c23008w1;
        }
    }
}
