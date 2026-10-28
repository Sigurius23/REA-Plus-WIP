package bj;

import hg3.AbstractC17269i;
import java.io.EOFException;
import p049cj.C4736b;
import p049cj.C4738d;
import p426qi.C30387i;
import p581we.C37199o;
import p616xi.C38314b;
import p616xi.C38317e;
import p649yi.C39555j;

/* JADX INFO: renamed from: bj.w */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3324w {

    /* JADX INFO: renamed from: a */
    public static final C37199o f12909a = C37199o.m119195L("nm", "c", "o", "tr", "hd");

    /* JADX INFO: renamed from: a */
    public static C39555j m9621a(C4738d c4738d, C30387i c30387i) throws C4736b, EOFException {
        String strNextString = null;
        C38314b c38314bM48885c0 = null;
        C38314b c38314bM48885c1 = null;
        C38317e c38317eM9602a = null;
        boolean zMo14821h = false;
        while (c4738d.hasNext()) {
            int iMo14824m = c4738d.mo14824m(f12909a);
            if (iMo14824m == 0) {
                strNextString = c4738d.nextString();
            } else if (iMo14824m == 1) {
                c38314bM48885c0 = AbstractC17269i.m48885c0(c4738d, c30387i, false);
            } else if (iMo14824m == 2) {
                c38314bM48885c1 = AbstractC17269i.m48885c0(c4738d, c30387i, false);
            } else if (iMo14824m == 3) {
                c38317eM9602a = AbstractC3301c.m9602a(c4738d, c30387i);
            } else if (iMo14824m != 4) {
                c4738d.skipValue();
            } else {
                zMo14821h = c4738d.mo14821h();
            }
        }
        return new C39555j(strNextString, c38314bM48885c0, c38314bM48885c1, c38317eM9602a, zMo14821h);
    }
}
