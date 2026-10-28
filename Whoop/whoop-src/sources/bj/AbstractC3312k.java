package bj;

import java.io.EOFException;
import p049cj.C4736b;
import p049cj.C4738d;
import p581we.C37199o;
import p584wi.C37303c;

/* JADX INFO: renamed from: bj.k */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3312k {

    /* JADX INFO: renamed from: a */
    public static final C37199o f12887a = C37199o.m119195L("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: renamed from: a */
    public static C37303c m9608a(C4738d c4738d) throws C4736b, EOFException {
        c4738d.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        while (c4738d.hasNext()) {
            int iMo14824m = c4738d.mo14824m(f12887a);
            if (iMo14824m == 0) {
                strNextString = c4738d.nextString();
            } else if (iMo14824m == 1) {
                strNextString2 = c4738d.nextString();
            } else if (iMo14824m == 2) {
                strNextString3 = c4738d.nextString();
            } else if (iMo14824m != 3) {
                c4738d.mo14825s();
                c4738d.skipValue();
            } else {
                c4738d.nextDouble();
            }
        }
        c4738d.endObject();
        return new C37303c(strNextString, strNextString2, strNextString3);
    }
}
