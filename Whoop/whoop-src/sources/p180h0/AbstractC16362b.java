package p180h0;

import androidx.compose.runtime.Composer;
import go1.C16016a;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p163g1.C15126r0;
import p206i0.AbstractC17833k;
import p390p1.C28635l;
import p390p1.C28655q;
import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: h0.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16362b {

    /* JADX INFO: renamed from: a */
    public static final C11347e2 f62900a = AbstractC11348f.m30574v(0, 0, null, 7);

    /* JADX INFO: renamed from: b */
    public static final C16016a f62901b = new C16016a(20);

    /* JADX INFO: renamed from: c */
    public static final int f62902c;

    static {
        AbstractC11348f.m30567o();
        f62902c = 8;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC16439p3 m46564a(C16435p c16435p, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
        boolean zM87153g = c28655q.m87153g(interfaceC39171c) | ((((i13 & 14) ^ 6) > 4 && c28655q.m87153g(c16435p)) || (i13 & 6) == 4);
        int i14 = (i13 & 112) ^ 48;
        C16016a c16016a = f62901b;
        boolean z4 = zM87153g | ((i14 > 32 && c28655q.m87153g(c16016a)) || (i13 & 48) == 32);
        C11347e2 c11347e2 = f62900a;
        boolean zM87153g2 = z4 | c28655q.m87153g(c11347e2);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g2 || objM87133R == C28635l.f115821a) {
            objM87133R = AbstractC17833k.m51268e(new C16368c(c16435p, c16016a, new C15126r0(2, interfaceC39171c), 0), c11347e2);
            c28655q.m87172p0(objM87133R);
        }
        return (InterfaceC16439p3) objM87133R;
    }
}
