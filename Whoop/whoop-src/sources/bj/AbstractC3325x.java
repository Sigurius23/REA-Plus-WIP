package bj;

import hg3.AbstractC17269i;
import java.io.EOFException;
import p049cj.C4736b;
import p049cj.C4738d;
import p426qi.C30387i;
import p581we.C37199o;
import p616xi.C38314b;
import p649yi.C39556k;

/* JADX INFO: renamed from: bj.x */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3325x {

    /* JADX INFO: renamed from: a */
    public static final C37199o f12910a = C37199o.m119195L("nm", "r", "hd");

    /* JADX INFO: renamed from: a */
    public static C39556k m9622a(C4738d c4738d, C30387i c30387i) throws C4736b, EOFException {
        boolean zMo14821h = false;
        String strNextString = null;
        C38314b c38314bM48885c0 = null;
        while (c4738d.hasNext()) {
            int iMo14824m = c4738d.mo14824m(f12910a);
            if (iMo14824m == 0) {
                strNextString = c4738d.nextString();
            } else if (iMo14824m == 1) {
                c38314bM48885c0 = AbstractC17269i.m48885c0(c4738d, c30387i, true);
            } else if (iMo14824m != 2) {
                c4738d.skipValue();
            } else {
                zMo14821h = c4738d.mo14821h();
            }
        }
        if (zMo14821h) {
            return null;
        }
        return new C39556k(strNextString, c38314bM48885c0);
    }
}
