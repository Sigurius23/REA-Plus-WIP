package p292l1;

import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.material3.C1122c;
import androidx.compose.runtime.Composer;
import aq1.C1909c;
import b30.C2647w2;
import kotlin.C2032u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p133f1.AbstractC13923a2;
import p133f1.C13995y1;
import p208i2.C17919x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: l1.x1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23200x1 {

    /* JADX INFO: renamed from: a */
    public static final C28674u2 f91803a;

    static {
        AbstractC30060g.m92088H(new C23091f0(4));
        f91803a = new C28674u2(new C23091f0(5));
    }

    /* JADX INFO: renamed from: a */
    public static final void m67157a(C23132m c23132m, InterfaceC23165r2 interfaceC23165r2, C23154p3 c23154p3, C23209y4 c23209y4, C37816b c37816b, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(904511636);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c23132m) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(interfaceC23165r2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(c23154p3) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(c23209y4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
            }
            c28655q.m87175r();
            C1122c c1122cM67110a = AbstractC23130l3.m67110a(0.0f, 7, false);
            long j7 = c23132m.f91437a;
            boolean zM87151f = c28655q.m87151f(j7);
            Object objM87133R = c28655q.m87133R();
            if (zM87151f || objM87133R == C28635l.f115821a) {
                objM87133R = new C13995y1(j7, C17919x.m51541c(0.4f, j7));
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87248b(new C28673u1[]{AbstractC23138n.f91494a.mo86977a(c23132m), f91803a.mo86977a(interfaceC23165r2), AbstractC1095d.f4515a.mo86977a(c1122cM67110a), AbstractC23160q3.f91608a.mo86977a(c23154p3), AbstractC13923a2.f49638a.mo86977a((C13995y1) objM87133R), AbstractC23215z4.f91921a.mo86977a(c23209y4)}, AbstractC37817c.m121344e(-1750539308, c28655q, new C2647w2(20, c23209y4, c37816b)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c(c23132m, interfaceC23165r2, c23154p3, c23209y4, c37816b, i13, 21);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m67158b(C23132m c23132m, C23154p3 c23154p3, C23209y4 c23209y4, C37816b c37816b, Composer composer, int i13) {
        C23154p3 c23154p4;
        C23209y4 c23209y5;
        C23154p3 c23154p5;
        C23209y4 c23209y6;
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-449719819);
        int i15 = i13 | (c28655q.m87153g(c23132m) ? 4 : 2) | 144;
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                c23154p5 = (C23154p3) c28655q.m87161k(AbstractC23160q3.f91608a);
                c23209y6 = (C23209y4) c28655q.m87161k(AbstractC23215z4.f91921a);
                i14 = i15 & (-1009);
            } else {
                c28655q.m87138X();
                i14 = i15 & (-1009);
                c23154p5 = c23154p3;
                c23209y6 = c23209y4;
            }
            c28655q.m87175r();
            m67157a(c23132m, (InterfaceC23165r2) c28655q.m87161k(f91803a), c23154p5, c23209y6, c37816b, c28655q, (i14 & 14) | 24576);
            c23154p4 = c23154p5;
            c23209y5 = c23209y6;
        } else {
            c28655q.m87138X();
            c23154p4 = c23154p3;
            c23209y5 = c23209y4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2032u(c23132m, c23154p4, c23209y5, c37816b, i13, 18);
        }
    }
}
