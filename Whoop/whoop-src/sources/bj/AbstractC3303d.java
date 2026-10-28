package bj;

import hg3.AbstractC17269i;
import p049cj.C4738d;
import p426qi.C30387i;
import p508ty.C34249c;
import p581we.C37199o;

/* JADX INFO: renamed from: bj.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3303d {

    /* JADX INFO: renamed from: a */
    public static final C37199o f12864a = C37199o.m119195L("ef");

    /* JADX INFO: renamed from: b */
    public static final C37199o f12865b = C37199o.m119195L("ty", "v");

    /* JADX INFO: renamed from: a */
    public static C34249c m9603a(C4738d c4738d, C30387i c30387i) {
        C34249c c34249c = null;
        while (c4738d.hasNext()) {
            if (c4738d.mo14824m(f12864a) != 0) {
                c4738d.mo14825s();
                c4738d.skipValue();
            } else {
                c4738d.beginArray();
                while (c4738d.hasNext()) {
                    c4738d.beginObject();
                    C34249c c34249c2 = null;
                    while (true) {
                        boolean z4 = false;
                        while (true) {
                            if (!c4738d.hasNext()) {
                                break;
                            }
                            int iMo14824m = c4738d.mo14824m(f12865b);
                            if (iMo14824m != 0) {
                                if (iMo14824m != 1) {
                                    c4738d.mo14825s();
                                    c4738d.skipValue();
                                } else if (z4) {
                                    c34249c2 = new C34249c(AbstractC17269i.m48885c0(c4738d, c30387i, true), 26);
                                } else {
                                    c4738d.skipValue();
                                }
                            } else if (c4738d.nextInt() == 0) {
                                z4 = true;
                            }
                        }
                    }
                    c4738d.endObject();
                    if (c34249c2 != null) {
                        c34249c = c34249c2;
                    }
                }
                c4738d.endArray();
            }
        }
        return c34249c;
    }
}
