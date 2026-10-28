package zm;

import ed3.C13117a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import p004a2.AbstractC0152a;

/* JADX INFO: renamed from: zm.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C40883c extends AbstractC0152a {

    /* JADX INFO: renamed from: E */
    public long[] f176199E;

    /* JADX INFO: renamed from: y */
    public long f176200y;

    /* JADX INFO: renamed from: z */
    public long[] f176201z;

    /* JADX INFO: renamed from: Q */
    public static Serializable m132500Q(int i13, C13117a c13117a) {
        if (i13 == 0) {
            return Double.valueOf(Double.longBitsToDouble(c13117a.m36706p()));
        }
        if (i13 == 1) {
            return Boolean.valueOf(c13117a.m36715y() == 1);
        }
        if (i13 == 2) {
            return m132502S(c13117a);
        }
        if (i13 != 3) {
            if (i13 == 8) {
                return m132501R(c13117a);
            }
            if (i13 != 10) {
                if (i13 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c13117a.m36706p()));
                c13117a.m36690L(2);
                return date;
            }
            int iM36680B = c13117a.m36680B();
            ArrayList arrayList = new ArrayList(iM36680B);
            for (int i14 = 0; i14 < iM36680B; i14++) {
                Serializable serializableM132500Q = m132500Q(c13117a.m36715y(), c13117a);
                if (serializableM132500Q != null) {
                    arrayList.add(serializableM132500Q);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM132502S = m132502S(c13117a);
            int iM36715y = c13117a.m36715y();
            if (iM36715y == 9) {
                return map;
            }
            Serializable serializableM132500Q2 = m132500Q(iM36715y, c13117a);
            if (serializableM132500Q2 != null) {
                map.put(strM132502S, serializableM132500Q2);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public static HashMap m132501R(C13117a c13117a) {
        int iM36680B = c13117a.m36680B();
        HashMap map = new HashMap(iM36680B);
        for (int i13 = 0; i13 < iM36680B; i13++) {
            String strM132502S = m132502S(c13117a);
            Serializable serializableM132500Q = m132500Q(c13117a.m36715y(), c13117a);
            if (serializableM132500Q != null) {
                map.put(strM132502S, serializableM132500Q);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: S */
    public static String m132502S(C13117a c13117a) {
        int iM36682D = c13117a.m36682D();
        int i13 = c13117a.f45382b;
        c13117a.m36690L(iM36682D);
        return new String(c13117a.f45381a, i13, iM36682D);
    }
}
