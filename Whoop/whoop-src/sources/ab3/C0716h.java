package ab3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lb3.AbstractC23811y;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25271y;
import o93.EnumC27738j;
import p000.C31931s;
import r93.InterfaceC31109b0;
import u93.C34673e0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ab3.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C0716h {
    /* JADX INFO: renamed from: a */
    public static C0710b m1778a(List list, InterfaceC31109b0 interfaceC31109b0, EnumC27738j enumC27738j) {
        List listM74093D1 = AbstractC25265s.m74093D1(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM74093D1.iterator();
        while (it.hasNext()) {
            AbstractC0715g abstractC0715gM1780c = m1780c(it.next(), null);
            if (abstractC0715gM1780c != null) {
                arrayList.add(abstractC0715gM1780c);
            }
        }
        return interfaceC31109b0 != null ? new C0733y(arrayList, interfaceC31109b0.mo78661c().m83830r(enumC27738j)) : new C0710b(arrayList, new C31931s(enumC27738j, 1));
    }

    /* JADX INFO: renamed from: b */
    public static C0733y m1779b(ArrayList arrayList, AbstractC23811y abstractC23811y) {
        return new C0733y(arrayList, abstractC23811y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: c */
    public static AbstractC0715g m1780c(Object obj, C34673e0 c34673e0) {
        if (obj instanceof Byte) {
            return new C0712d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C0731w(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C0719k(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C0729u(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C0713e((Character) obj);
        }
        if (obj instanceof Float) {
            return new C0711c(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C0711c(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C0711c((Boolean) obj);
        }
        if (obj instanceof String) {
            return new C0732x(obj);
        }
        boolean z4 = obj instanceof byte[];
        ?? M118958J = C25271y.f99162w;
        int i13 = 0;
        if (z4) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    M118958J = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i13 < length2) {
                        M118958J.add(Byte.valueOf(bArr[i13]));
                        i13++;
                    }
                } else {
                    M118958J = AbstractC37056f.m118958J(Byte.valueOf(bArr[0]));
                }
            }
            return m1778a(M118958J, c34673e0, EnumC27738j.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    M118958J = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i13 < length4) {
                        M118958J.add(Short.valueOf(sArr[i13]));
                        i13++;
                    }
                } else {
                    M118958J = AbstractC37056f.m118958J(Short.valueOf(sArr[0]));
                }
            }
            return m1778a(M118958J, c34673e0, EnumC27738j.SHORT);
        }
        if (obj instanceof int[]) {
            return m1778a(AbstractC25260n.m74045U0((int[]) obj), c34673e0, EnumC27738j.INT);
        }
        if (obj instanceof long[]) {
            return m1778a(AbstractC25260n.m74047V0((long[]) obj), c34673e0, EnumC27738j.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length5 = cArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    M118958J = new ArrayList(cArr.length);
                    int length6 = cArr.length;
                    while (i13 < length6) {
                        M118958J.add(Character.valueOf(cArr[i13]));
                        i13++;
                    }
                } else {
                    M118958J = AbstractC37056f.m118958J(Character.valueOf(cArr[0]));
                }
            }
            return m1778a(M118958J, c34673e0, EnumC27738j.CHAR);
        }
        if (obj instanceof float[]) {
            return m1778a(AbstractC25260n.m74044T0((float[]) obj), c34673e0, EnumC27738j.FLOAT);
        }
        if (!(obj instanceof double[])) {
            if (obj instanceof boolean[]) {
                return m1778a(AbstractC25260n.m74051X0((boolean[]) obj), c34673e0, EnumC27738j.BOOLEAN);
            }
            if (obj == null) {
                return new C0730v(null);
            }
            return null;
        }
        double[] dArr = (double[]) obj;
        int length7 = dArr.length;
        if (length7 != 0) {
            if (length7 != 1) {
                M118958J = new ArrayList(dArr.length);
                int length8 = dArr.length;
                while (i13 < length8) {
                    M118958J.add(Double.valueOf(dArr[i13]));
                    i13++;
                }
            } else {
                M118958J = AbstractC37056f.m118958J(Double.valueOf(dArr[0]));
            }
        }
        return m1778a(M118958J, c34673e0, EnumC27738j.DOUBLE);
    }
}
