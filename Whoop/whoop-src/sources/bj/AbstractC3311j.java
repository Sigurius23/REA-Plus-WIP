package bj;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.EOFException;
import java.util.ArrayList;
import p049cj.C4736b;
import p049cj.C4738d;
import p426qi.C30387i;
import p581we.C37199o;
import p584wi.C37304d;
import p649yi.C39559n;

/* JADX INFO: renamed from: bj.j */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3311j {

    /* JADX INFO: renamed from: a */
    public static final C37199o f12885a = C37199o.m119195L("ch", "size", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "style", "fFamily", "data");

    /* JADX INFO: renamed from: b */
    public static final C37199o f12886b = C37199o.m119195L("shapes");

    /* JADX INFO: renamed from: a */
    public static C37304d m9607a(C4738d c4738d, C30387i c30387i) throws C4736b, EOFException {
        ArrayList arrayList = new ArrayList();
        c4738d.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        double dNextDouble = 0.0d;
        char cCharAt = 0;
        while (c4738d.hasNext()) {
            int iMo14824m = c4738d.mo14824m(f12885a);
            if (iMo14824m == 0) {
                cCharAt = c4738d.nextString().charAt(0);
            } else if (iMo14824m == 1) {
                c4738d.nextDouble();
            } else if (iMo14824m == 2) {
                dNextDouble = c4738d.nextDouble();
            } else if (iMo14824m == 3) {
                strNextString = c4738d.nextString();
            } else if (iMo14824m == 4) {
                strNextString2 = c4738d.nextString();
            } else if (iMo14824m != 5) {
                c4738d.mo14825s();
                c4738d.skipValue();
            } else {
                c4738d.beginObject();
                while (c4738d.hasNext()) {
                    if (c4738d.mo14824m(f12886b) != 0) {
                        c4738d.mo14825s();
                        c4738d.skipValue();
                    } else {
                        c4738d.beginArray();
                        while (c4738d.hasNext()) {
                            arrayList.add((C39559n) AbstractC3308g.m9605a(c4738d, c30387i));
                        }
                        c4738d.endArray();
                    }
                }
                c4738d.endObject();
            }
        }
        c4738d.endObject();
        return new C37304d(arrayList, cCharAt, dNextDouble, strNextString, strNextString2);
    }
}
