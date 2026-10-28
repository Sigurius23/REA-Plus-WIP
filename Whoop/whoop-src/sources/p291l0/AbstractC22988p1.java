package p291l0;

import androidx.compose.runtime.Composer;
import p026b2.C2299e;
import p026b2.InterfaceC2301g;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l0.p1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22988p1 {

    /* JADX INFO: renamed from: a */
    public static final C22994r1 f90690a = new C22994r1(AbstractC22977m.f90650a, C2299e.f9107J);

    /* JADX INFO: renamed from: a */
    public static final C22994r1 m66759a(InterfaceC22965i interfaceC22965i, InterfaceC2301g interfaceC2301g, Composer composer, int i13) {
        if (AbstractC22676k.m65745e(interfaceC22965i, AbstractC22977m.f90650a) && AbstractC22676k.m65745e(interfaceC2301g, C2299e.f9107J)) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1073795767);
            c28655q.m87173q(false);
            return f90690a;
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(-1073744896);
        boolean z4 = true;
        boolean z13 = (((i13 & 14) ^ 6) > 4 && c28655q2.m87153g(interfaceC22965i)) || (i13 & 6) == 4;
        if ((((i13 & 112) ^ 48) <= 32 || !c28655q2.m87153g(interfaceC2301g)) && (i13 & 48) != 32) {
            z4 = false;
        }
        boolean z14 = z13 | z4;
        Object objM87133R = c28655q2.m87133R();
        if (z14 || objM87133R == C28635l.f115821a) {
            objM87133R = new C22994r1(interfaceC22965i, interfaceC2301g);
            c28655q2.m87172p0(objM87133R);
        }
        C22994r1 c22994r1 = (C22994r1) objM87133R;
        c28655q2.m87173q(false);
        return c22994r1;
    }
}
