package bj;

import hg3.AbstractC17269i;
import java.io.EOFException;
import p049cj.C4736b;
import p049cj.C4738d;
import p108e4.AbstractC12682p;
import p426qi.C30387i;
import p581we.C37199o;
import p616xi.C38314b;
import p616xi.InterfaceC38318f;
import p649yi.C39553h;

/* JADX INFO: renamed from: bj.u */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3322u {

    /* JADX INFO: renamed from: a */
    public static final C37199o f12907a = C37199o.m119195L("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: a */
    public static C39553h m9620a(C4738d c4738d, C30387i c30387i, int i13) throws C4736b, EOFException {
        boolean z4 = false;
        boolean z13 = true;
        int i14 = 0;
        boolean zMo14821h = false;
        boolean z14 = i13 == 3;
        String strNextString = null;
        C38314b c38314bM48885c0 = null;
        InterfaceC38318f interfaceC38318fM9600b = null;
        C38314b c38314bM48885c1 = null;
        C38314b c38314bM48885c2 = null;
        C38314b c38314bM48885c3 = null;
        C38314b c38314bM48885c4 = null;
        C38314b c38314bM48885c5 = null;
        while (c4738d.hasNext()) {
            switch (c4738d.mo14824m(f12907a)) {
                case 0:
                    strNextString = c4738d.nextString();
                    break;
                case 1:
                    int iNextInt = c4738d.nextInt();
                    int[] iArrM35486f = AbstractC12682p.m35486f(2);
                    int length = iArrM35486f.length;
                    ?? r10 = z4;
                    while (true) {
                        if (r10 >= length) {
                            i14 = 0;
                        } else {
                            int i15 = iArrM35486f[r10];
                            int i16 = 1;
                            if (i15 != 1) {
                                i16 = 2;
                                if (i15 != 2) {
                                    throw null;
                                }
                            }
                            if (i16 == iNextInt) {
                                i14 = i15;
                            } else {
                                r10++;
                            }
                        }
                        break;
                    }
                    break;
                case 2:
                    c38314bM48885c0 = AbstractC17269i.m48885c0(c4738d, c30387i, z4);
                    continue;
                case 3:
                    interfaceC38318fM9600b = AbstractC3297a.m9600b(c4738d, c30387i);
                    continue;
                case 4:
                    c38314bM48885c1 = AbstractC17269i.m48885c0(c4738d, c30387i, z4);
                    continue;
                case 5:
                    c38314bM48885c3 = AbstractC17269i.m48885c0(c4738d, c30387i, z13);
                    continue;
                case 6:
                    c38314bM48885c5 = AbstractC17269i.m48885c0(c4738d, c30387i, z4);
                    continue;
                case 7:
                    c38314bM48885c2 = AbstractC17269i.m48885c0(c4738d, c30387i, z13);
                    continue;
                case 8:
                    c38314bM48885c4 = AbstractC17269i.m48885c0(c4738d, c30387i, z4);
                    continue;
                case 9:
                    zMo14821h = c4738d.mo14821h();
                    continue;
                case 10:
                    if (c4738d.nextInt() == 3) {
                        z14 = z13;
                    } else {
                        z14 = z4;
                        continue;
                    }
                    break;
                default:
                    c4738d.mo14825s();
                    c4738d.skipValue();
                    continue;
            }
            z4 = false;
            z13 = true;
        }
        return new C39553h(strNextString, i14, c38314bM48885c0, interfaceC38318fM9600b, c38314bM48885c1, c38314bM48885c2, c38314bM48885c3, c38314bM48885c4, c38314bM48885c5, zMo14821h, z14);
    }
}
