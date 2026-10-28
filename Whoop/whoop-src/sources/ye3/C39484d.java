package ye3;

import af3.C0823a0;
import af3.C0828d;
import p012ab.C0690l0;
import p047c9.C4320k;
import pg3.C29205p;
import xe3.C38248k;

/* JADX INFO: renamed from: ye3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C39484d implements InterfaceC39487g {
    @Override // ye3.InterfaceC39487g
    /* JADX INFO: renamed from: a */
    public final C29205p mo126141a(C38248k c38248k) {
        C0690l0 c0690l0 = c38248k.f163997e;
        C4320k c4320kM1743m = c0690l0.m1743m();
        int iM1737g = c0690l0.m1737g('`');
        C4320k c4320kM1743m2 = c0690l0.m1743m();
        while (c0690l0.m1732b('`') > 0) {
            C4320k c4320kM1743m3 = c0690l0.m1743m();
            if (c0690l0.m1737g('`') == iM1737g) {
                C0828d c0828d = new C0828d();
                String strReplace = c0690l0.m1734d(c4320kM1743m2, c4320kM1743m3).m1644m().replace('\n', ' ');
                if (strReplace.length() >= 3) {
                    int i13 = 0;
                    if (strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ') {
                        int length = strReplace.length();
                        while (true) {
                            if (i13 >= length) {
                                i13 = length;
                                break;
                            }
                            if (strReplace.charAt(i13) != ' ') {
                                break;
                            }
                            i13++;
                        }
                        if (i13 != length) {
                            strReplace = strReplace.substring(1, strReplace.length() - 1);
                        }
                    }
                }
                c0828d.f3021g = strReplace;
                return new C29205p(c0828d, c0690l0.m1743m(), false, 15);
            }
        }
        return new C29205p(new C0823a0(c0690l0.m1734d(c4320kM1743m, c4320kM1743m2).m1644m()), c4320kM1743m2, false, 15);
    }
}
