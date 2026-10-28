package bj;

import b30.C2570m;
import hg3.AbstractC17269i;
import java.util.Collections;
import p049cj.C4738d;
import p119ej.C13224a;
import p426qi.C30387i;
import p581we.C37199o;
import p616xi.C38313a;
import p616xi.C38314b;
import p673z7.C40137a;
import so.C32800q;

/* JADX INFO: renamed from: bj.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3299b {

    /* JADX INFO: renamed from: a */
    public static final C37199o f12856a = C37199o.m119195L("s", "a");

    /* JADX INFO: renamed from: b */
    public static final C37199o f12857b = C37199o.m119195L("s", "e", "o", "r");

    /* JADX INFO: renamed from: c */
    public static final C37199o f12858c = C37199o.m119195L("fc", "sc", "sw", "t", "o");

    /* JADX INFO: renamed from: a */
    public static C32800q m9601a(C4738d c4738d, C30387i c30387i) {
        c4738d.beginObject();
        C2570m c2570m = null;
        C40137a c40137a = null;
        while (c4738d.hasNext()) {
            int iMo14824m = c4738d.mo14824m(f12856a);
            if (iMo14824m == 0) {
                c4738d.beginObject();
                C38313a c38313a = null;
                C38313a c38313aM48889e0 = null;
                C38313a c38313aM48889e1 = null;
                int i13 = 0;
                while (c4738d.hasNext()) {
                    int iMo14824m2 = c4738d.mo14824m(f12857b);
                    if (iMo14824m2 == 0) {
                        c38313a = AbstractC17269i.m48889e0(c4738d, c30387i);
                    } else if (iMo14824m2 == 1) {
                        c38313aM48889e0 = AbstractC17269i.m48889e0(c4738d, c30387i);
                    } else if (iMo14824m2 == 2) {
                        c38313aM48889e1 = AbstractC17269i.m48889e0(c4738d, c30387i);
                    } else if (iMo14824m2 != 3) {
                        c4738d.mo14825s();
                        c4738d.skipValue();
                    } else {
                        int iNextInt = c4738d.nextInt();
                        if (iNextInt != 1 && iNextInt != 2) {
                            c30387i.m92858a("Unsupported text range units: " + iNextInt);
                        } else if (iNextInt == 1) {
                            i13 = 1;
                        }
                        i13 = 2;
                    }
                }
                c4738d.endObject();
                if (c38313a == null && c38313aM48889e0 != null) {
                    c38313a = new C38313a(Collections.singletonList(new C13224a(0)), 2);
                }
                c40137a = new C40137a();
                c40137a.f173193b = c38313a;
                c40137a.f173194c = c38313aM48889e0;
                c40137a.f173195d = c38313aM48889e1;
                c40137a.f173192a = i13;
            } else if (iMo14824m != 1) {
                c4738d.mo14825s();
                c4738d.skipValue();
            } else {
                c4738d.beginObject();
                C38313a c38313aM48883b0 = null;
                C38313a c38313aM48883b1 = null;
                C38314b c38314bM48885c0 = null;
                C38314b c38314bM48885c1 = null;
                C38313a c38313aM48889e2 = null;
                while (c4738d.hasNext()) {
                    int iMo14824m3 = c4738d.mo14824m(f12858c);
                    if (iMo14824m3 == 0) {
                        c38313aM48883b0 = AbstractC17269i.m48883b0(c4738d, c30387i);
                    } else if (iMo14824m3 == 1) {
                        c38313aM48883b1 = AbstractC17269i.m48883b0(c4738d, c30387i);
                    } else if (iMo14824m3 == 2) {
                        c38314bM48885c0 = AbstractC17269i.m48885c0(c4738d, c30387i, true);
                    } else if (iMo14824m3 == 3) {
                        c38314bM48885c1 = AbstractC17269i.m48885c0(c4738d, c30387i, true);
                    } else if (iMo14824m3 != 4) {
                        c4738d.mo14825s();
                        c4738d.skipValue();
                    } else {
                        c38313aM48889e2 = AbstractC17269i.m48889e0(c4738d, c30387i);
                    }
                }
                c4738d.endObject();
                c2570m = new C2570m(c38313aM48883b0, c38313aM48883b1, c38314bM48885c0, c38314bM48885c1, c38313aM48889e2, 27);
            }
        }
        c4738d.endObject();
        return new C32800q(c2570m, c40137a);
    }
}
