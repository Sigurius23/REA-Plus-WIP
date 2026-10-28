package bj;

import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import p049cj.C4736b;
import p049cj.C4738d;
import p108e4.AbstractC12682p;
import p119ej.C13224a;
import p426qi.C30387i;
import p581we.C37199o;
import p616xi.C38313a;
import p616xi.C38314b;
import p649yi.C39550e;

/* JADX INFO: renamed from: bj.n */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3315n {

    /* JADX INFO: renamed from: a */
    public static final C37199o f12891a = C37199o.m119195L("nm", "g", "o", "t", "s", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "lc", "lj", "ml", "hd", "d");

    /* JADX INFO: renamed from: b */
    public static final C37199o f12892b = C37199o.m119195L("p", "k");

    /* JADX INFO: renamed from: c */
    public static final C37199o f12893c = C37199o.m119195L("n", "v");

    /* JADX INFO: renamed from: a */
    public static C39550e m9609a(C4738d c4738d, C30387i c30387i) throws C4736b, EOFException {
        C38313a c38313a;
        C38313a c38313a2;
        ArrayList arrayList = new ArrayList();
        C38313a c38313aM48887d0 = null;
        String strNextString = null;
        C38313a c38313aM48891f0 = null;
        C38313a c38313aM48891f1 = null;
        C38314b c38314bM48885c0 = null;
        C38314b c38314b = null;
        float fNextDouble = 0.0f;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean zMo14821h = false;
        C38313a c38313aM48889e0 = null;
        while (c4738d.hasNext()) {
            switch (c4738d.mo14824m(f12891a)) {
                case 0:
                    strNextString = c4738d.nextString();
                    continue;
                case 1:
                    c4738d.beginObject();
                    int iNextInt = -1;
                    while (c4738d.hasNext()) {
                        C38313a c38313a3 = c38313aM48887d0;
                        int iMo14824m = c4738d.mo14824m(f12892b);
                        if (iMo14824m != 0) {
                            c38313a = c38313aM48889e0;
                            if (iMo14824m != 1) {
                                c4738d.mo14825s();
                                c4738d.skipValue();
                            } else {
                                c38313aM48887d0 = AbstractC17269i.m48887d0(c4738d, c30387i, iNextInt);
                            }
                            c38313aM48889e0 = c38313a;
                        } else {
                            c38313a = c38313aM48889e0;
                            iNextInt = c4738d.nextInt();
                        }
                        c38313aM48887d0 = c38313a3;
                        c38313aM48889e0 = c38313a;
                    }
                    c4738d.endObject();
                    continue;
                case 2:
                    c38313aM48889e0 = AbstractC17269i.m48889e0(c4738d, c30387i);
                    continue;
                case 3:
                    c38313a2 = c38313aM48887d0;
                    i13 = c4738d.nextInt() != 1 ? 2 : 1;
                    break;
                case 4:
                    c38313aM48891f0 = AbstractC17269i.m48891f0(c4738d, c30387i);
                    continue;
                case 5:
                    c38313aM48891f1 = AbstractC17269i.m48891f0(c4738d, c30387i);
                    continue;
                case 6:
                    c38313a2 = c38313aM48887d0;
                    c38314bM48885c0 = AbstractC17269i.m48885c0(c4738d, c30387i, true);
                    break;
                case 7:
                    c38313a2 = c38313aM48887d0;
                    i14 = AbstractC12682p.m35486f(3)[c4738d.nextInt() - 1];
                    break;
                case 8:
                    c38313a2 = c38313aM48887d0;
                    i15 = AbstractC12682p.m35486f(3)[c4738d.nextInt() - 1];
                    break;
                case 9:
                    c38313a2 = c38313aM48887d0;
                    fNextDouble = (float) c4738d.nextDouble();
                    break;
                case 10:
                    zMo14821h = c4738d.mo14821h();
                    continue;
                case 11:
                    c4738d.beginArray();
                    while (c4738d.hasNext()) {
                        c4738d.beginObject();
                        String strNextString2 = null;
                        C38314b c38314bM48885c1 = null;
                        while (c4738d.hasNext()) {
                            int iMo14824m2 = c4738d.mo14824m(f12893c);
                            if (iMo14824m2 != 0) {
                                C38313a c38313a4 = c38313aM48887d0;
                                if (iMo14824m2 != 1) {
                                    c4738d.mo14825s();
                                    c4738d.skipValue();
                                } else {
                                    c38314bM48885c1 = AbstractC17269i.m48885c0(c4738d, c30387i, true);
                                }
                                c38313aM48887d0 = c38313a4;
                            } else {
                                strNextString2 = c4738d.nextString();
                            }
                        }
                        C38313a c38313a5 = c38313aM48887d0;
                        c4738d.endObject();
                        String str = strNextString2;
                        if (str.equals("o")) {
                            c38314b = c38314bM48885c1;
                        } else if (str.equals("d") || str.equals("g")) {
                            arrayList.add(c38314bM48885c1);
                        }
                        c38313aM48887d0 = c38313a5;
                    }
                    c38313a2 = c38313aM48887d0;
                    c4738d.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add((C38314b) arrayList.get(0));
                    }
                    break;
                default:
                    c4738d.mo14825s();
                    c4738d.skipValue();
                    continue;
            }
            c38313aM48887d0 = c38313a2;
        }
        C38313a c38313a6 = c38313aM48889e0;
        return new C39550e(strNextString, i13, c38313aM48887d0, c38313a6 == null ? new C38313a(Collections.singletonList(new C13224a(100)), 2) : c38313a6, c38313aM48891f0, c38313aM48891f1, c38314bM48885c0, i14, i15, fNextDouble, arrayList, c38314b, zMo14821h);
    }
}
