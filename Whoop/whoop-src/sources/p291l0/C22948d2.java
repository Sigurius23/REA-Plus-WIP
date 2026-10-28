package p291l0;

import androidx.compose.runtime.Composer;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: l0.d2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22948d2 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90580w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC22940b2 f90581x;

    public /* synthetic */ C22948d2(InterfaceC22940b2 interfaceC22940b2, int i13) {
        this.f90580w = i13;
        this.f90581x = interfaceC22940b2;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f90580w) {
            case 0:
                ((Number) obj3).intValue();
                C28655q c28655q = (C28655q) ((Composer) obj2);
                c28655q.m87150e0(788931215);
                InterfaceC22940b2 interfaceC22940b2 = this.f90581x;
                boolean zM87153g = c28655q.m87153g(interfaceC22940b2);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C23012x1(interfaceC22940b2);
                    c28655q.m87172p0(objM87133R);
                }
                C23012x1 c23012x1 = (C23012x1) objM87133R;
                c28655q.m87173q(false);
                return c23012x1;
            default:
                ((Number) obj3).intValue();
                C28655q c28655q2 = (C28655q) ((Composer) obj2);
                c28655q2.m87150e0(-1415685722);
                InterfaceC22940b2 interfaceC22940b3 = this.f90581x;
                boolean zM87153g2 = c28655q2.m87153g(interfaceC22940b3);
                Object objM87133R2 = c28655q2.m87133R();
                if (zM87153g2 || objM87133R2 == C28635l.f115821a) {
                    objM87133R2 = new C23008w0(interfaceC22940b3);
                    c28655q2.m87172p0(objM87133R2);
                }
                C23008w0 c23008w0 = (C23008w0) objM87133R2;
                c28655q2.m87173q(false);
                return c23008w0;
        }
    }
}
