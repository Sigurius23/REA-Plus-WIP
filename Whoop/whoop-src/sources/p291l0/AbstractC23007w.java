package p291l0;

import androidx.compose.runtime.Composer;
import p026b2.C2299e;
import p026b2.InterfaceC2300f;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l0.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23007w {

    /* JADX INFO: renamed from: a */
    public static final C23010x f90739a = new C23010x(AbstractC22977m.f90652c, C2299e.f9110M);

    /* JADX INFO: renamed from: a */
    public static final C23010x m66775a(InterfaceC22974l interfaceC22974l, InterfaceC2300f interfaceC2300f, Composer composer, int i13) {
        if (AbstractC22676k.m65745e(interfaceC22974l, AbstractC22977m.f90652c) && AbstractC22676k.m65745e(interfaceC2300f, C2299e.f9110M)) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1446569784);
            c28655q.m87173q(false);
            return f90739a;
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(-1446515937);
        boolean z4 = true;
        boolean z13 = (((i13 & 14) ^ 6) > 4 && c28655q2.m87153g(interfaceC22974l)) || (i13 & 6) == 4;
        if ((((i13 & 112) ^ 48) <= 32 || !c28655q2.m87153g(interfaceC2300f)) && (i13 & 48) != 32) {
            z4 = false;
        }
        boolean z14 = z13 | z4;
        Object objM87133R = c28655q2.m87133R();
        if (z14 || objM87133R == C28635l.f115821a) {
            objM87133R = new C23010x(interfaceC22974l, interfaceC2300f);
            c28655q2.m87172p0(objM87133R);
        }
        C23010x c23010x = (C23010x) objM87133R;
        c28655q2.m87173q(false);
        return c23010x;
    }
}
