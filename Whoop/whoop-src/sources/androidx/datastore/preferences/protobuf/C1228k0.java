package androidx.datastore.preferences.protobuf;

import androidx.health.platform.client.proto.C1533u;
import p005a3.C0237p;
import p109e6.C12753h;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1228k0 {

    /* JADX INFO: renamed from: a */
    public final C0237p f5420a;

    public C1228k0(EnumC1259u1 enumC1259u1, EnumC1259u1 enumC1259u2, C12753h c12753h) {
        this.f5420a = new C0237p(enumC1259u1, enumC1259u2, c12753h, 2);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0104  */
    /* JADX WARN: Code duplicated, block: B:41:0x010d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0113  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Code duplicated, block: B:45:0x0135  */
    /* JADX WARN: Code duplicated, block: B:47:0x013d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0145  */
    /* JADX WARN: Code duplicated, block: B:50:0x0152  */
    /* JADX WARN: Code duplicated, block: B:51:0x015e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0162  */
    /* JADX WARN: Code duplicated, block: B:55:0x0170  */
    /* JADX WARN: Code duplicated, block: B:56:0x0178  */
    /* JADX WARN: Code duplicated, block: B:57:0x0185  */
    /* JADX WARN: Code duplicated, block: B:58:0x018e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0192  */
    /* JADX WARN: Code duplicated, block: B:61:0x019d  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01df  */
    /* JADX INFO: renamed from: a */
    public static int m3864a(C0237p c0237p, Object obj, Object obj2) {
        int iM3934u0;
        int size;
        int iM3933t0;
        int i13;
        EnumC1259u1 enumC1259u1;
        int iM3932s0;
        int size2;
        int iM3933t1;
        EnumC1259u1 enumC1259u2 = (EnumC1259u1) c0237p.f812x;
        int i14 = C1254t.f5473c;
        int iM3934u1 = 1;
        int iM3932s1 = C1236n.m3932s0(1);
        C1250r1 c1250r1 = EnumC1259u1.f5486z;
        if (enumC1259u2 == c1250r1) {
            iM3932s1 *= 2;
        }
        switch (enumC1259u2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iM3934u0 = 8;
                i13 = iM3934u0 + iM3932s1;
                enumC1259u1 = (EnumC1259u1) c0237p.f813y;
                iM3932s0 = C1236n.m3932s0(2);
                if (enumC1259u1 == c1250r1) {
                    iM3932s0 *= 2;
                }
                switch (enumC1259u1.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 2:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 3:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 4:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3934u1 + iM3932s0 + i13;
                    case 8:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                            iM3934u1 = iM3933t1 + size2;
                        } else {
                            iM3934u1 = C1236n.m3931r0((String) obj2);
                        }
                        return iM3934u1 + iM3932s0 + i13;
                    case 9:
                        iM3934u1 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        return iM3934u1 + iM3932s0 + i13;
                    case 10:
                        size2 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        iM3933t1 = C1236n.m3933t0(size2);
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 11:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3933t1 = C1236n.m3933t0(size2);
                        }
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 12:
                        iM3934u1 = C1236n.m3933t0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 13:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iM3934u1 = C1236n.m3933t0((iIntValue >> 31) ^ (iIntValue << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue = ((Long) obj2).longValue();
                        iM3934u1 = C1236n.m3934u0((jLongValue >> 63) ^ (jLongValue << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                iM3934u0 = 4;
                i13 = iM3934u0 + iM3932s1;
                enumC1259u1 = (EnumC1259u1) c0237p.f813y;
                iM3932s0 = C1236n.m3932s0(2);
                if (enumC1259u1 == c1250r1) {
                    iM3932s0 *= 2;
                }
                switch (enumC1259u1.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 2:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 3:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 4:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3934u1 + iM3932s0 + i13;
                    case 8:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                            iM3934u1 = iM3933t1 + size2;
                        } else {
                            iM3934u1 = C1236n.m3931r0((String) obj2);
                        }
                        return iM3934u1 + iM3932s0 + i13;
                    case 9:
                        iM3934u1 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        return iM3934u1 + iM3932s0 + i13;
                    case 10:
                        size2 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        iM3933t1 = C1236n.m3933t0(size2);
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 11:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3933t1 = C1236n.m3933t0(size2);
                        }
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 12:
                        iM3934u1 = C1236n.m3933t0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 13:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iM3934u1 = C1236n.m3933t0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iM3934u1 = C1236n.m3934u0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 2:
                iM3934u0 = C1236n.m3934u0(((Long) obj).longValue());
                i13 = iM3934u0 + iM3932s1;
                enumC1259u1 = (EnumC1259u1) c0237p.f813y;
                iM3932s0 = C1236n.m3932s0(2);
                if (enumC1259u1 == c1250r1) {
                    iM3932s0 *= 2;
                }
                switch (enumC1259u1.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 2:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 3:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 4:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3934u1 + iM3932s0 + i13;
                    case 8:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                            iM3934u1 = iM3933t1 + size2;
                        } else {
                            iM3934u1 = C1236n.m3931r0((String) obj2);
                        }
                        return iM3934u1 + iM3932s0 + i13;
                    case 9:
                        iM3934u1 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        return iM3934u1 + iM3932s0 + i13;
                    case 10:
                        size2 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        iM3933t1 = C1236n.m3933t0(size2);
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 11:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3933t1 = C1236n.m3933t0(size2);
                        }
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 12:
                        iM3934u1 = C1236n.m3933t0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 13:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iM3934u1 = C1236n.m3933t0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iM3934u1 = C1236n.m3934u0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 3:
                iM3934u0 = C1236n.m3934u0(((Long) obj).longValue());
                i13 = iM3934u0 + iM3932s1;
                enumC1259u1 = (EnumC1259u1) c0237p.f813y;
                iM3932s0 = C1236n.m3932s0(2);
                if (enumC1259u1 == c1250r1) {
                    iM3932s0 *= 2;
                }
                switch (enumC1259u1.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 2:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 3:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 4:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3934u1 + iM3932s0 + i13;
                    case 8:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                            iM3934u1 = iM3933t1 + size2;
                        } else {
                            iM3934u1 = C1236n.m3931r0((String) obj2);
                        }
                        return iM3934u1 + iM3932s0 + i13;
                    case 9:
                        iM3934u1 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        return iM3934u1 + iM3932s0 + i13;
                    case 10:
                        size2 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        iM3933t1 = C1236n.m3933t0(size2);
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 11:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3933t1 = C1236n.m3933t0(size2);
                        }
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 12:
                        iM3934u1 = C1236n.m3933t0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 13:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iM3934u1 = C1236n.m3933t0((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iM3934u1 = C1236n.m3934u0((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 4:
                iM3934u0 = C1236n.m3934u0(((Integer) obj).intValue());
                i13 = iM3934u0 + iM3932s1;
                enumC1259u1 = (EnumC1259u1) c0237p.f813y;
                iM3932s0 = C1236n.m3932s0(2);
                if (enumC1259u1 == c1250r1) {
                    iM3932s0 *= 2;
                }
                switch (enumC1259u1.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 2:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 3:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 4:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3934u1 + iM3932s0 + i13;
                    case 8:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                            iM3934u1 = iM3933t1 + size2;
                        } else {
                            iM3934u1 = C1236n.m3931r0((String) obj2);
                        }
                        return iM3934u1 + iM3932s0 + i13;
                    case 9:
                        iM3934u1 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        return iM3934u1 + iM3932s0 + i13;
                    case 10:
                        size2 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        iM3933t1 = C1236n.m3933t0(size2);
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 11:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3933t1 = C1236n.m3933t0(size2);
                        }
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 12:
                        iM3934u1 = C1236n.m3933t0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 13:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iM3934u1 = C1236n.m3933t0((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iM3934u1 = C1236n.m3934u0((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 5:
                ((Long) obj).getClass();
                iM3934u0 = 8;
                i13 = iM3934u0 + iM3932s1;
                enumC1259u1 = (EnumC1259u1) c0237p.f813y;
                iM3932s0 = C1236n.m3932s0(2);
                if (enumC1259u1 == c1250r1) {
                    iM3932s0 *= 2;
                }
                switch (enumC1259u1.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 2:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 3:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 4:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3934u1 + iM3932s0 + i13;
                    case 8:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                            iM3934u1 = iM3933t1 + size2;
                        } else {
                            iM3934u1 = C1236n.m3931r0((String) obj2);
                        }
                        return iM3934u1 + iM3932s0 + i13;
                    case 9:
                        iM3934u1 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        return iM3934u1 + iM3932s0 + i13;
                    case 10:
                        size2 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        iM3933t1 = C1236n.m3933t0(size2);
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 11:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3933t1 = C1236n.m3933t0(size2);
                        }
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 12:
                        iM3934u1 = C1236n.m3933t0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 13:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iM3934u1 = C1236n.m3933t0((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iM3934u1 = C1236n.m3934u0((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 6:
                ((Integer) obj).getClass();
                iM3934u0 = 4;
                i13 = iM3934u0 + iM3932s1;
                enumC1259u1 = (EnumC1259u1) c0237p.f813y;
                iM3932s0 = C1236n.m3932s0(2);
                if (enumC1259u1 == c1250r1) {
                    iM3932s0 *= 2;
                }
                switch (enumC1259u1.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 2:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 3:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 4:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3934u1 + iM3932s0 + i13;
                    case 8:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                            iM3934u1 = iM3933t1 + size2;
                        } else {
                            iM3934u1 = C1236n.m3931r0((String) obj2);
                        }
                        return iM3934u1 + iM3932s0 + i13;
                    case 9:
                        iM3934u1 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        return iM3934u1 + iM3932s0 + i13;
                    case 10:
                        size2 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        iM3933t1 = C1236n.m3933t0(size2);
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 11:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3933t1 = C1236n.m3933t0(size2);
                        }
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 12:
                        iM3934u1 = C1236n.m3933t0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 13:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iM3934u1 = C1236n.m3933t0((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iM3934u1 = C1236n.m3934u0((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 7:
                ((Boolean) obj).getClass();
                iM3934u0 = 1;
                i13 = iM3934u0 + iM3932s1;
                enumC1259u1 = (EnumC1259u1) c0237p.f813y;
                iM3932s0 = C1236n.m3932s0(2);
                if (enumC1259u1 == c1250r1) {
                    iM3932s0 *= 2;
                }
                switch (enumC1259u1.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 2:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 3:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 4:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3934u1 + iM3932s0 + i13;
                    case 8:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                            iM3934u1 = iM3933t1 + size2;
                        } else {
                            iM3934u1 = C1236n.m3931r0((String) obj2);
                        }
                        return iM3934u1 + iM3932s0 + i13;
                    case 9:
                        iM3934u1 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        return iM3934u1 + iM3932s0 + i13;
                    case 10:
                        size2 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        iM3933t1 = C1236n.m3933t0(size2);
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 11:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3933t1 = C1236n.m3933t0(size2);
                        }
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 12:
                        iM3934u1 = C1236n.m3933t0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 13:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iM3934u1 = C1236n.m3933t0((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iM3934u1 = C1236n.m3934u0((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 8:
                if (obj instanceof C1218h) {
                    size = ((C1218h) obj).size();
                    iM3933t0 = C1236n.m3933t0(size);
                    iM3934u0 = size + iM3933t0;
                } else {
                    iM3934u0 = C1236n.m3931r0((String) obj);
                }
                i13 = iM3934u0 + iM3932s1;
                enumC1259u1 = (EnumC1259u1) c0237p.f813y;
                iM3932s0 = C1236n.m3932s0(2);
                if (enumC1259u1 == c1250r1) {
                    iM3932s0 *= 2;
                }
                switch (enumC1259u1.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 2:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 3:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 4:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3934u1 + iM3932s0 + i13;
                    case 8:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                            iM3934u1 = iM3933t1 + size2;
                        } else {
                            iM3934u1 = C1236n.m3931r0((String) obj2);
                        }
                        return iM3934u1 + iM3932s0 + i13;
                    case 9:
                        iM3934u1 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        return iM3934u1 + iM3932s0 + i13;
                    case 10:
                        size2 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        iM3933t1 = C1236n.m3933t0(size2);
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 11:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3933t1 = C1236n.m3933t0(size2);
                        }
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 12:
                        iM3934u1 = C1236n.m3933t0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 13:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iM3934u1 = C1236n.m3933t0((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iM3934u1 = C1236n.m3934u0((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 9:
                iM3934u0 = ((AbstractC1269z) ((AbstractC1197a) obj)).mo3748a(null);
                i13 = iM3934u0 + iM3932s1;
                enumC1259u1 = (EnumC1259u1) c0237p.f813y;
                iM3932s0 = C1236n.m3932s0(2);
                if (enumC1259u1 == c1250r1) {
                    iM3932s0 *= 2;
                }
                switch (enumC1259u1.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 2:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 3:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 4:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3934u1 + iM3932s0 + i13;
                    case 8:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                            iM3934u1 = iM3933t1 + size2;
                        } else {
                            iM3934u1 = C1236n.m3931r0((String) obj2);
                        }
                        return iM3934u1 + iM3932s0 + i13;
                    case 9:
                        iM3934u1 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        return iM3934u1 + iM3932s0 + i13;
                    case 10:
                        size2 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        iM3933t1 = C1236n.m3933t0(size2);
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 11:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3933t1 = C1236n.m3933t0(size2);
                        }
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 12:
                        iM3934u1 = C1236n.m3933t0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 13:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iM3934u1 = C1236n.m3933t0((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iM3934u1 = C1236n.m3934u0((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 10:
                size = ((AbstractC1269z) ((AbstractC1197a) obj)).mo3748a(null);
                iM3933t0 = C1236n.m3933t0(size);
                iM3934u0 = size + iM3933t0;
                i13 = iM3934u0 + iM3932s1;
                enumC1259u1 = (EnumC1259u1) c0237p.f813y;
                iM3932s0 = C1236n.m3932s0(2);
                if (enumC1259u1 == c1250r1) {
                    iM3932s0 *= 2;
                }
                switch (enumC1259u1.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 2:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 3:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 4:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3934u1 + iM3932s0 + i13;
                    case 8:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                            iM3934u1 = iM3933t1 + size2;
                        } else {
                            iM3934u1 = C1236n.m3931r0((String) obj2);
                        }
                        return iM3934u1 + iM3932s0 + i13;
                    case 9:
                        iM3934u1 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        return iM3934u1 + iM3932s0 + i13;
                    case 10:
                        size2 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        iM3933t1 = C1236n.m3933t0(size2);
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 11:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3933t1 = C1236n.m3933t0(size2);
                        }
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 12:
                        iM3934u1 = C1236n.m3933t0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 13:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iM3934u1 = C1236n.m3933t0((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iM3934u1 = C1236n.m3934u0((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 11:
                if (obj instanceof C1218h) {
                    size = ((C1218h) obj).size();
                    iM3933t0 = C1236n.m3933t0(size);
                } else {
                    size = ((byte[]) obj).length;
                    iM3933t0 = C1236n.m3933t0(size);
                }
                iM3934u0 = size + iM3933t0;
                i13 = iM3934u0 + iM3932s1;
                enumC1259u1 = (EnumC1259u1) c0237p.f813y;
                iM3932s0 = C1236n.m3932s0(2);
                if (enumC1259u1 == c1250r1) {
                    iM3932s0 *= 2;
                }
                switch (enumC1259u1.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 2:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 3:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 4:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3934u1 + iM3932s0 + i13;
                    case 8:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                            iM3934u1 = iM3933t1 + size2;
                        } else {
                            iM3934u1 = C1236n.m3931r0((String) obj2);
                        }
                        return iM3934u1 + iM3932s0 + i13;
                    case 9:
                        iM3934u1 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        return iM3934u1 + iM3932s0 + i13;
                    case 10:
                        size2 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        iM3933t1 = C1236n.m3933t0(size2);
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 11:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3933t1 = C1236n.m3933t0(size2);
                        }
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 12:
                        iM3934u1 = C1236n.m3933t0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 13:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iM3934u1 = C1236n.m3933t0((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iM3934u1 = C1236n.m3934u0((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 12:
                iM3934u0 = C1236n.m3933t0(((Integer) obj).intValue());
                i13 = iM3934u0 + iM3932s1;
                enumC1259u1 = (EnumC1259u1) c0237p.f813y;
                iM3932s0 = C1236n.m3932s0(2);
                if (enumC1259u1 == c1250r1) {
                    iM3932s0 *= 2;
                }
                switch (enumC1259u1.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 2:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 3:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 4:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3934u1 + iM3932s0 + i13;
                    case 8:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                            iM3934u1 = iM3933t1 + size2;
                        } else {
                            iM3934u1 = C1236n.m3931r0((String) obj2);
                        }
                        return iM3934u1 + iM3932s0 + i13;
                    case 9:
                        iM3934u1 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        return iM3934u1 + iM3932s0 + i13;
                    case 10:
                        size2 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        iM3933t1 = C1236n.m3933t0(size2);
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 11:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3933t1 = C1236n.m3933t0(size2);
                        }
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 12:
                        iM3934u1 = C1236n.m3933t0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 13:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iM3934u1 = C1236n.m3933t0((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iM3934u1 = C1236n.m3934u0((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 13:
                iM3934u0 = C1236n.m3934u0(((Integer) obj).intValue());
                i13 = iM3934u0 + iM3932s1;
                enumC1259u1 = (EnumC1259u1) c0237p.f813y;
                iM3932s0 = C1236n.m3932s0(2);
                if (enumC1259u1 == c1250r1) {
                    iM3932s0 *= 2;
                }
                switch (enumC1259u1.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 2:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 3:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 4:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3934u1 + iM3932s0 + i13;
                    case 8:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                            iM3934u1 = iM3933t1 + size2;
                        } else {
                            iM3934u1 = C1236n.m3931r0((String) obj2);
                        }
                        return iM3934u1 + iM3932s0 + i13;
                    case 9:
                        iM3934u1 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        return iM3934u1 + iM3932s0 + i13;
                    case 10:
                        size2 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        iM3933t1 = C1236n.m3933t0(size2);
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 11:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3933t1 = C1236n.m3933t0(size2);
                        }
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 12:
                        iM3934u1 = C1236n.m3933t0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 13:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iM3934u1 = C1236n.m3933t0((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iM3934u1 = C1236n.m3934u0((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 14:
                ((Integer) obj).getClass();
                iM3934u0 = 4;
                i13 = iM3934u0 + iM3932s1;
                enumC1259u1 = (EnumC1259u1) c0237p.f813y;
                iM3932s0 = C1236n.m3932s0(2);
                if (enumC1259u1 == c1250r1) {
                    iM3932s0 *= 2;
                }
                switch (enumC1259u1.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 2:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 3:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 4:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3934u1 + iM3932s0 + i13;
                    case 8:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                            iM3934u1 = iM3933t1 + size2;
                        } else {
                            iM3934u1 = C1236n.m3931r0((String) obj2);
                        }
                        return iM3934u1 + iM3932s0 + i13;
                    case 9:
                        iM3934u1 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        return iM3934u1 + iM3932s0 + i13;
                    case 10:
                        size2 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        iM3933t1 = C1236n.m3933t0(size2);
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 11:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3933t1 = C1236n.m3933t0(size2);
                        }
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 12:
                        iM3934u1 = C1236n.m3933t0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 13:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iM3934u1 = C1236n.m3933t0((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iM3934u1 = C1236n.m3934u0((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 15:
                ((Long) obj).getClass();
                iM3934u0 = 8;
                i13 = iM3934u0 + iM3932s1;
                enumC1259u1 = (EnumC1259u1) c0237p.f813y;
                iM3932s0 = C1236n.m3932s0(2);
                if (enumC1259u1 == c1250r1) {
                    iM3932s0 *= 2;
                }
                switch (enumC1259u1.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 2:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 3:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 4:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3934u1 + iM3932s0 + i13;
                    case 8:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                            iM3934u1 = iM3933t1 + size2;
                        } else {
                            iM3934u1 = C1236n.m3931r0((String) obj2);
                        }
                        return iM3934u1 + iM3932s0 + i13;
                    case 9:
                        iM3934u1 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        return iM3934u1 + iM3932s0 + i13;
                    case 10:
                        size2 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        iM3933t1 = C1236n.m3933t0(size2);
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 11:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3933t1 = C1236n.m3933t0(size2);
                        }
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 12:
                        iM3934u1 = C1236n.m3933t0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 13:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iM3934u1 = C1236n.m3933t0((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iM3934u1 = C1236n.m3934u0((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iM3934u0 = C1236n.m3933t0((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                i13 = iM3934u0 + iM3932s1;
                enumC1259u1 = (EnumC1259u1) c0237p.f813y;
                iM3932s0 = C1236n.m3932s0(2);
                if (enumC1259u1 == c1250r1) {
                    iM3932s0 *= 2;
                }
                switch (enumC1259u1.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 2:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 3:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 4:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3934u1 + iM3932s0 + i13;
                    case 8:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                            iM3934u1 = iM3933t1 + size2;
                        } else {
                            iM3934u1 = C1236n.m3931r0((String) obj2);
                        }
                        return iM3934u1 + iM3932s0 + i13;
                    case 9:
                        iM3934u1 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        return iM3934u1 + iM3932s0 + i13;
                    case 10:
                        size2 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        iM3933t1 = C1236n.m3933t0(size2);
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 11:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3933t1 = C1236n.m3933t0(size2);
                        }
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 12:
                        iM3934u1 = C1236n.m3933t0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 13:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iM3934u1 = C1236n.m3933t0((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iM3934u1 = C1236n.m3934u0((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                long jLongValue18 = ((Long) obj).longValue();
                iM3934u0 = C1236n.m3934u0((jLongValue18 >> 63) ^ (jLongValue18 << 1));
                i13 = iM3934u0 + iM3932s1;
                enumC1259u1 = (EnumC1259u1) c0237p.f813y;
                iM3932s0 = C1236n.m3932s0(2);
                if (enumC1259u1 == c1250r1) {
                    iM3932s0 *= 2;
                }
                switch (enumC1259u1.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 2:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 3:
                        iM3934u1 = C1236n.m3934u0(((Long) obj2).longValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 4:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3934u1 + iM3932s0 + i13;
                    case 8:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                            iM3934u1 = iM3933t1 + size2;
                        } else {
                            iM3934u1 = C1236n.m3931r0((String) obj2);
                        }
                        return iM3934u1 + iM3932s0 + i13;
                    case 9:
                        iM3934u1 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        return iM3934u1 + iM3932s0 + i13;
                    case 10:
                        size2 = ((AbstractC1269z) ((AbstractC1197a) obj2)).mo3748a(null);
                        iM3933t1 = C1236n.m3933t0(size2);
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 11:
                        if (obj2 instanceof C1218h) {
                            size2 = ((C1218h) obj2).size();
                            iM3933t1 = C1236n.m3933t0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3933t1 = C1236n.m3933t0(size2);
                        }
                        iM3934u1 = iM3933t1 + size2;
                        return iM3934u1 + iM3932s0 + i13;
                    case 12:
                        iM3934u1 = C1236n.m3933t0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 13:
                        iM3934u1 = C1236n.m3934u0(((Integer) obj2).intValue());
                        return iM3934u1 + iM3932s0 + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3934u1 = 4;
                        return iM3934u1 + iM3932s0 + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3934u1 = 8;
                        return iM3934u1 + iM3932s0 + i13;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iM3934u1 = C1236n.m3933t0((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iM3934u1 = C1236n.m3934u0((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                        return iM3934u1 + iM3932s0 + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
