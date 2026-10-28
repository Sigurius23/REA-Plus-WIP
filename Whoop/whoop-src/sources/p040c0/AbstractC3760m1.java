package p040c0;

import androidx.compose.runtime.Composer;
import p005a3.C0227m1;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p077d0.C11351f2;
import p077d0.C11362i1;
import p077d0.InterfaceC11337c0;
import p208i2.C17919x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28670t2;

/* JADX INFO: renamed from: c0.m1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3760m1 {

    /* JADX INFO: renamed from: a */
    public static final C11362i1 f15367a = AbstractC11348f.m30573u(0.0f, 0.0f, 7, null);

    /* JADX INFO: renamed from: a */
    public static final InterfaceC28670t2 m11569a(long j7, InterfaceC11337c0 interfaceC11337c0, String str, Composer composer, int i13, int i14) {
        if ((i14 & 2) != 0) {
            interfaceC11337c0 = f15367a;
        }
        InterfaceC11337c0 interfaceC11337c1 = interfaceC11337c0;
        if ((i14 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(C17919x.m51545g(j7));
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            C11351f2 c11351f2 = new C11351f2(C3731d.f15261z, new C0227m1(C17919x.m51545g(j7), 9));
            c28655q.m87172p0(c11351f2);
            objM87133R = c11351f2;
        }
        int i15 = i13 << 6;
        return AbstractC11352g.m30590d(new C17919x(j7), (C11351f2) objM87133R, interfaceC11337c1, null, str2, null, c28655q, (i13 & 14) | ((i13 << 3) & 896) | (57344 & i15) | (i15 & 458752), 8);
    }
}
