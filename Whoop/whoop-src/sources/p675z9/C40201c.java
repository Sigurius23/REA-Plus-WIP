package p675z9;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import p004a2.AbstractC0152a;
import p607x8.C38059n;

/* JADX INFO: renamed from: z9.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C40201c extends AbstractC0152a {

    /* JADX INFO: renamed from: E */
    public long[] f173519E;

    /* JADX INFO: renamed from: y */
    public long f173520y;

    /* JADX INFO: renamed from: z */
    public long[] f173521z;

    /* JADX INFO: renamed from: Q */
    public static Serializable m129086Q(int i13, C38059n c38059n) {
        if (i13 == 0) {
            return Double.valueOf(Double.longBitsToDouble(c38059n.m121861n()));
        }
        if (i13 == 1) {
            return Boolean.valueOf(c38059n.m121867t() == 1);
        }
        if (i13 == 2) {
            return m129088S(c38059n);
        }
        if (i13 != 3) {
            if (i13 == 8) {
                return m129087R(c38059n);
            }
            if (i13 != 10) {
                if (i13 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c38059n.m121861n()));
                c38059n.m121847G(2);
                return date;
            }
            int iM121871x = c38059n.m121871x();
            ArrayList arrayList = new ArrayList(iM121871x);
            for (int i14 = 0; i14 < iM121871x; i14++) {
                Serializable serializableM129086Q = m129086Q(c38059n.m121867t(), c38059n);
                if (serializableM129086Q != null) {
                    arrayList.add(serializableM129086Q);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM129088S = m129088S(c38059n);
            int iM121867t = c38059n.m121867t();
            if (iM121867t == 9) {
                return map;
            }
            Serializable serializableM129086Q2 = m129086Q(iM121867t, c38059n);
            if (serializableM129086Q2 != null) {
                map.put(strM129088S, serializableM129086Q2);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public static HashMap m129087R(C38059n c38059n) {
        int iM121871x = c38059n.m121871x();
        HashMap map = new HashMap(iM121871x);
        for (int i13 = 0; i13 < iM121871x; i13++) {
            String strM129088S = m129088S(c38059n);
            Serializable serializableM129086Q = m129086Q(c38059n.m121867t(), c38059n);
            if (serializableM129086Q != null) {
                map.put(strM129088S, serializableM129086Q);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: S */
    public static String m129088S(C38059n c38059n) {
        int iM121873z = c38059n.m121873z();
        int i13 = c38059n.f163018b;
        c38059n.m121847G(iM121873z);
        return new String(c38059n.f163017a, i13, iM121873z);
    }
}
