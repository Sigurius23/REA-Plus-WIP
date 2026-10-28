package androidx.health.platform.client.proto;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.i1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1475i1 {

    /* JADX INFO: renamed from: a */
    public final C1470h1 f6052a;

    public C1475i1(EnumC1542v3 enumC1542v3, EnumC1542v3 enumC1542v4, AbstractC1534u0 abstractC1534u0) {
        this.f6052a = new C1470h1(enumC1542v3, enumC1542v4, abstractC1534u0);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x010d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    /* JADX WARN: Code duplicated, block: B:46:0x011c  */
    /* JADX WARN: Code duplicated, block: B:47:0x012d  */
    /* JADX WARN: Code duplicated, block: B:48:0x013e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0146  */
    /* JADX WARN: Code duplicated, block: B:52:0x014e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0152  */
    /* JADX WARN: Code duplicated, block: B:55:0x015c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0168  */
    /* JADX WARN: Code duplicated, block: B:57:0x0174  */
    /* JADX WARN: Code duplicated, block: B:59:0x0178  */
    /* JADX WARN: Code duplicated, block: B:61:0x0186  */
    /* JADX WARN: Code duplicated, block: B:62:0x018e  */
    /* JADX WARN: Code duplicated, block: B:63:0x019b  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f5  */
    /* JADX INFO: renamed from: a */
    public static int m4633a(C1470h1 c1470h1, Object obj, Object obj2) {
        int iM4658E;
        int size;
        int iM4657D;
        int i13;
        EnumC1542v3 enumC1542v3;
        int iM4656C;
        int size2;
        int iM4657D2;
        EnumC1542v3 enumC1542v4 = c1470h1.f6048a;
        int i14 = C1504o0.f6080c;
        int iM4658E2 = 1;
        int iM4656C2 = C1483k.m4656C(1);
        C1527s3 c1527s3 = EnumC1542v3.f6129z;
        if (enumC1542v4 == c1527s3) {
            iM4656C2 *= 2;
        }
        switch (enumC1542v4.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iM4658E = 8;
                i13 = iM4658E + iM4656C2;
                enumC1542v3 = c1470h1.f6049b;
                iM4656C = C1483k.m4656C(2);
                if (enumC1542v3 == c1527s3) {
                    iM4656C *= 2;
                }
                switch (enumC1542v3.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 2:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 3:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 4:
                        iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM4658E2 + iM4656C + i13;
                    case 8:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                            iM4658E2 = iM4657D2 + size2;
                        } else {
                            iM4658E2 = C1483k.m4655B((String) obj2);
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 9:
                        iM4658E2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        return iM4658E2 + iM4656C + i13;
                    case 10:
                        size2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        iM4657D2 = C1483k.m4657D(size2);
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 11:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM4657D2 = C1483k.m4657D(size2);
                        }
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 12:
                        iM4658E2 = C1483k.m4657D(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 13:
                        if (obj2 instanceof EnumC1535u1) {
                            iM4658E2 = C1483k.m4654A(((EnumC1535u1) obj2).f6121w);
                        } else {
                            iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iM4658E2 = C1483k.m4657D((iIntValue >> 31) ^ (iIntValue << 1));
                        return iM4658E2 + iM4656C + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue = ((Long) obj2).longValue();
                        iM4658E2 = C1483k.m4658E((jLongValue >> 63) ^ (jLongValue << 1));
                        return iM4658E2 + iM4656C + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                iM4658E = 4;
                i13 = iM4658E + iM4656C2;
                enumC1542v3 = c1470h1.f6049b;
                iM4656C = C1483k.m4656C(2);
                if (enumC1542v3 == c1527s3) {
                    iM4656C *= 2;
                }
                switch (enumC1542v3.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 2:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 3:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 4:
                        iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM4658E2 + iM4656C + i13;
                    case 8:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                            iM4658E2 = iM4657D2 + size2;
                        } else {
                            iM4658E2 = C1483k.m4655B((String) obj2);
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 9:
                        iM4658E2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        return iM4658E2 + iM4656C + i13;
                    case 10:
                        size2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        iM4657D2 = C1483k.m4657D(size2);
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 11:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM4657D2 = C1483k.m4657D(size2);
                        }
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 12:
                        iM4658E2 = C1483k.m4657D(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 13:
                        if (obj2 instanceof EnumC1535u1) {
                            iM4658E2 = C1483k.m4654A(((EnumC1535u1) obj2).f6121w);
                        } else {
                            iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iM4658E2 = C1483k.m4657D((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                        return iM4658E2 + iM4656C + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iM4658E2 = C1483k.m4658E((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                        return iM4658E2 + iM4656C + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 2:
                iM4658E = C1483k.m4658E(((Long) obj).longValue());
                i13 = iM4658E + iM4656C2;
                enumC1542v3 = c1470h1.f6049b;
                iM4656C = C1483k.m4656C(2);
                if (enumC1542v3 == c1527s3) {
                    iM4656C *= 2;
                }
                switch (enumC1542v3.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 2:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 3:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 4:
                        iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM4658E2 + iM4656C + i13;
                    case 8:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                            iM4658E2 = iM4657D2 + size2;
                        } else {
                            iM4658E2 = C1483k.m4655B((String) obj2);
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 9:
                        iM4658E2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        return iM4658E2 + iM4656C + i13;
                    case 10:
                        size2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        iM4657D2 = C1483k.m4657D(size2);
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 11:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM4657D2 = C1483k.m4657D(size2);
                        }
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 12:
                        iM4658E2 = C1483k.m4657D(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 13:
                        if (obj2 instanceof EnumC1535u1) {
                            iM4658E2 = C1483k.m4654A(((EnumC1535u1) obj2).f6121w);
                        } else {
                            iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iM4658E2 = C1483k.m4657D((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                        return iM4658E2 + iM4656C + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iM4658E2 = C1483k.m4658E((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                        return iM4658E2 + iM4656C + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 3:
                iM4658E = C1483k.m4658E(((Long) obj).longValue());
                i13 = iM4658E + iM4656C2;
                enumC1542v3 = c1470h1.f6049b;
                iM4656C = C1483k.m4656C(2);
                if (enumC1542v3 == c1527s3) {
                    iM4656C *= 2;
                }
                switch (enumC1542v3.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 2:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 3:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 4:
                        iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM4658E2 + iM4656C + i13;
                    case 8:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                            iM4658E2 = iM4657D2 + size2;
                        } else {
                            iM4658E2 = C1483k.m4655B((String) obj2);
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 9:
                        iM4658E2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        return iM4658E2 + iM4656C + i13;
                    case 10:
                        size2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        iM4657D2 = C1483k.m4657D(size2);
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 11:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM4657D2 = C1483k.m4657D(size2);
                        }
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 12:
                        iM4658E2 = C1483k.m4657D(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 13:
                        if (obj2 instanceof EnumC1535u1) {
                            iM4658E2 = C1483k.m4654A(((EnumC1535u1) obj2).f6121w);
                        } else {
                            iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iM4658E2 = C1483k.m4657D((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                        return iM4658E2 + iM4656C + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iM4658E2 = C1483k.m4658E((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                        return iM4658E2 + iM4656C + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 4:
                iM4658E = C1483k.m4654A(((Integer) obj).intValue());
                i13 = iM4658E + iM4656C2;
                enumC1542v3 = c1470h1.f6049b;
                iM4656C = C1483k.m4656C(2);
                if (enumC1542v3 == c1527s3) {
                    iM4656C *= 2;
                }
                switch (enumC1542v3.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 2:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 3:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 4:
                        iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM4658E2 + iM4656C + i13;
                    case 8:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                            iM4658E2 = iM4657D2 + size2;
                        } else {
                            iM4658E2 = C1483k.m4655B((String) obj2);
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 9:
                        iM4658E2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        return iM4658E2 + iM4656C + i13;
                    case 10:
                        size2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        iM4657D2 = C1483k.m4657D(size2);
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 11:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM4657D2 = C1483k.m4657D(size2);
                        }
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 12:
                        iM4658E2 = C1483k.m4657D(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 13:
                        if (obj2 instanceof EnumC1535u1) {
                            iM4658E2 = C1483k.m4654A(((EnumC1535u1) obj2).f6121w);
                        } else {
                            iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iM4658E2 = C1483k.m4657D((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                        return iM4658E2 + iM4656C + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iM4658E2 = C1483k.m4658E((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                        return iM4658E2 + iM4656C + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 5:
                ((Long) obj).getClass();
                iM4658E = 8;
                i13 = iM4658E + iM4656C2;
                enumC1542v3 = c1470h1.f6049b;
                iM4656C = C1483k.m4656C(2);
                if (enumC1542v3 == c1527s3) {
                    iM4656C *= 2;
                }
                switch (enumC1542v3.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 2:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 3:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 4:
                        iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM4658E2 + iM4656C + i13;
                    case 8:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                            iM4658E2 = iM4657D2 + size2;
                        } else {
                            iM4658E2 = C1483k.m4655B((String) obj2);
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 9:
                        iM4658E2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        return iM4658E2 + iM4656C + i13;
                    case 10:
                        size2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        iM4657D2 = C1483k.m4657D(size2);
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 11:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM4657D2 = C1483k.m4657D(size2);
                        }
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 12:
                        iM4658E2 = C1483k.m4657D(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 13:
                        if (obj2 instanceof EnumC1535u1) {
                            iM4658E2 = C1483k.m4654A(((EnumC1535u1) obj2).f6121w);
                        } else {
                            iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iM4658E2 = C1483k.m4657D((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                        return iM4658E2 + iM4656C + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iM4658E2 = C1483k.m4658E((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                        return iM4658E2 + iM4656C + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 6:
                ((Integer) obj).getClass();
                iM4658E = 4;
                i13 = iM4658E + iM4656C2;
                enumC1542v3 = c1470h1.f6049b;
                iM4656C = C1483k.m4656C(2);
                if (enumC1542v3 == c1527s3) {
                    iM4656C *= 2;
                }
                switch (enumC1542v3.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 2:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 3:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 4:
                        iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM4658E2 + iM4656C + i13;
                    case 8:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                            iM4658E2 = iM4657D2 + size2;
                        } else {
                            iM4658E2 = C1483k.m4655B((String) obj2);
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 9:
                        iM4658E2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        return iM4658E2 + iM4656C + i13;
                    case 10:
                        size2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        iM4657D2 = C1483k.m4657D(size2);
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 11:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM4657D2 = C1483k.m4657D(size2);
                        }
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 12:
                        iM4658E2 = C1483k.m4657D(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 13:
                        if (obj2 instanceof EnumC1535u1) {
                            iM4658E2 = C1483k.m4654A(((EnumC1535u1) obj2).f6121w);
                        } else {
                            iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iM4658E2 = C1483k.m4657D((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                        return iM4658E2 + iM4656C + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iM4658E2 = C1483k.m4658E((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                        return iM4658E2 + iM4656C + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 7:
                ((Boolean) obj).getClass();
                iM4658E = 1;
                i13 = iM4658E + iM4656C2;
                enumC1542v3 = c1470h1.f6049b;
                iM4656C = C1483k.m4656C(2);
                if (enumC1542v3 == c1527s3) {
                    iM4656C *= 2;
                }
                switch (enumC1542v3.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 2:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 3:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 4:
                        iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM4658E2 + iM4656C + i13;
                    case 8:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                            iM4658E2 = iM4657D2 + size2;
                        } else {
                            iM4658E2 = C1483k.m4655B((String) obj2);
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 9:
                        iM4658E2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        return iM4658E2 + iM4656C + i13;
                    case 10:
                        size2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        iM4657D2 = C1483k.m4657D(size2);
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 11:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM4657D2 = C1483k.m4657D(size2);
                        }
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 12:
                        iM4658E2 = C1483k.m4657D(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 13:
                        if (obj2 instanceof EnumC1535u1) {
                            iM4658E2 = C1483k.m4654A(((EnumC1535u1) obj2).f6121w);
                        } else {
                            iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iM4658E2 = C1483k.m4657D((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                        return iM4658E2 + iM4656C + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iM4658E2 = C1483k.m4658E((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                        return iM4658E2 + iM4656C + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 8:
                if (obj instanceof C1468h) {
                    size = ((C1468h) obj).size();
                    iM4657D = C1483k.m4657D(size);
                    iM4658E = size + iM4657D;
                } else {
                    iM4658E = C1483k.m4655B((String) obj);
                }
                i13 = iM4658E + iM4656C2;
                enumC1542v3 = c1470h1.f6049b;
                iM4656C = C1483k.m4656C(2);
                if (enumC1542v3 == c1527s3) {
                    iM4656C *= 2;
                }
                switch (enumC1542v3.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 2:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 3:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 4:
                        iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM4658E2 + iM4656C + i13;
                    case 8:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                            iM4658E2 = iM4657D2 + size2;
                        } else {
                            iM4658E2 = C1483k.m4655B((String) obj2);
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 9:
                        iM4658E2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        return iM4658E2 + iM4656C + i13;
                    case 10:
                        size2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        iM4657D2 = C1483k.m4657D(size2);
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 11:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM4657D2 = C1483k.m4657D(size2);
                        }
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 12:
                        iM4658E2 = C1483k.m4657D(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 13:
                        if (obj2 instanceof EnumC1535u1) {
                            iM4658E2 = C1483k.m4654A(((EnumC1535u1) obj2).f6121w);
                        } else {
                            iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iM4658E2 = C1483k.m4657D((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                        return iM4658E2 + iM4656C + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iM4658E2 = C1483k.m4658E((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                        return iM4658E2 + iM4656C + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 9:
                iM4658E = ((AbstractC1534u0) ((AbstractC1433a) obj)).mo4563b(null);
                i13 = iM4658E + iM4656C2;
                enumC1542v3 = c1470h1.f6049b;
                iM4656C = C1483k.m4656C(2);
                if (enumC1542v3 == c1527s3) {
                    iM4656C *= 2;
                }
                switch (enumC1542v3.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 2:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 3:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 4:
                        iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM4658E2 + iM4656C + i13;
                    case 8:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                            iM4658E2 = iM4657D2 + size2;
                        } else {
                            iM4658E2 = C1483k.m4655B((String) obj2);
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 9:
                        iM4658E2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        return iM4658E2 + iM4656C + i13;
                    case 10:
                        size2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        iM4657D2 = C1483k.m4657D(size2);
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 11:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM4657D2 = C1483k.m4657D(size2);
                        }
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 12:
                        iM4658E2 = C1483k.m4657D(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 13:
                        if (obj2 instanceof EnumC1535u1) {
                            iM4658E2 = C1483k.m4654A(((EnumC1535u1) obj2).f6121w);
                        } else {
                            iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iM4658E2 = C1483k.m4657D((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                        return iM4658E2 + iM4656C + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iM4658E2 = C1483k.m4658E((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                        return iM4658E2 + iM4656C + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 10:
                size = ((AbstractC1534u0) ((AbstractC1433a) obj)).mo4563b(null);
                iM4657D = C1483k.m4657D(size);
                iM4658E = size + iM4657D;
                i13 = iM4658E + iM4656C2;
                enumC1542v3 = c1470h1.f6049b;
                iM4656C = C1483k.m4656C(2);
                if (enumC1542v3 == c1527s3) {
                    iM4656C *= 2;
                }
                switch (enumC1542v3.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 2:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 3:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 4:
                        iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM4658E2 + iM4656C + i13;
                    case 8:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                            iM4658E2 = iM4657D2 + size2;
                        } else {
                            iM4658E2 = C1483k.m4655B((String) obj2);
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 9:
                        iM4658E2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        return iM4658E2 + iM4656C + i13;
                    case 10:
                        size2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        iM4657D2 = C1483k.m4657D(size2);
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 11:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM4657D2 = C1483k.m4657D(size2);
                        }
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 12:
                        iM4658E2 = C1483k.m4657D(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 13:
                        if (obj2 instanceof EnumC1535u1) {
                            iM4658E2 = C1483k.m4654A(((EnumC1535u1) obj2).f6121w);
                        } else {
                            iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iM4658E2 = C1483k.m4657D((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                        return iM4658E2 + iM4656C + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iM4658E2 = C1483k.m4658E((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                        return iM4658E2 + iM4656C + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 11:
                if (obj instanceof C1468h) {
                    size = ((C1468h) obj).size();
                    iM4657D = C1483k.m4657D(size);
                } else {
                    size = ((byte[]) obj).length;
                    iM4657D = C1483k.m4657D(size);
                }
                iM4658E = size + iM4657D;
                i13 = iM4658E + iM4656C2;
                enumC1542v3 = c1470h1.f6049b;
                iM4656C = C1483k.m4656C(2);
                if (enumC1542v3 == c1527s3) {
                    iM4656C *= 2;
                }
                switch (enumC1542v3.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 2:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 3:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 4:
                        iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM4658E2 + iM4656C + i13;
                    case 8:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                            iM4658E2 = iM4657D2 + size2;
                        } else {
                            iM4658E2 = C1483k.m4655B((String) obj2);
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 9:
                        iM4658E2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        return iM4658E2 + iM4656C + i13;
                    case 10:
                        size2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        iM4657D2 = C1483k.m4657D(size2);
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 11:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM4657D2 = C1483k.m4657D(size2);
                        }
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 12:
                        iM4658E2 = C1483k.m4657D(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 13:
                        if (obj2 instanceof EnumC1535u1) {
                            iM4658E2 = C1483k.m4654A(((EnumC1535u1) obj2).f6121w);
                        } else {
                            iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iM4658E2 = C1483k.m4657D((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                        return iM4658E2 + iM4656C + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iM4658E2 = C1483k.m4658E((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                        return iM4658E2 + iM4656C + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 12:
                iM4658E = C1483k.m4657D(((Integer) obj).intValue());
                i13 = iM4658E + iM4656C2;
                enumC1542v3 = c1470h1.f6049b;
                iM4656C = C1483k.m4656C(2);
                if (enumC1542v3 == c1527s3) {
                    iM4656C *= 2;
                }
                switch (enumC1542v3.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 2:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 3:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 4:
                        iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM4658E2 + iM4656C + i13;
                    case 8:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                            iM4658E2 = iM4657D2 + size2;
                        } else {
                            iM4658E2 = C1483k.m4655B((String) obj2);
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 9:
                        iM4658E2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        return iM4658E2 + iM4656C + i13;
                    case 10:
                        size2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        iM4657D2 = C1483k.m4657D(size2);
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 11:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM4657D2 = C1483k.m4657D(size2);
                        }
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 12:
                        iM4658E2 = C1483k.m4657D(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 13:
                        if (obj2 instanceof EnumC1535u1) {
                            iM4658E2 = C1483k.m4654A(((EnumC1535u1) obj2).f6121w);
                        } else {
                            iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iM4658E2 = C1483k.m4657D((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                        return iM4658E2 + iM4656C + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iM4658E2 = C1483k.m4658E((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                        return iM4658E2 + iM4656C + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 13:
                iM4658E = obj instanceof EnumC1535u1 ? C1483k.m4654A(((EnumC1535u1) obj).f6121w) : C1483k.m4654A(((Integer) obj).intValue());
                i13 = iM4658E + iM4656C2;
                enumC1542v3 = c1470h1.f6049b;
                iM4656C = C1483k.m4656C(2);
                if (enumC1542v3 == c1527s3) {
                    iM4656C *= 2;
                }
                switch (enumC1542v3.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 2:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 3:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 4:
                        iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM4658E2 + iM4656C + i13;
                    case 8:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                            iM4658E2 = iM4657D2 + size2;
                        } else {
                            iM4658E2 = C1483k.m4655B((String) obj2);
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 9:
                        iM4658E2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        return iM4658E2 + iM4656C + i13;
                    case 10:
                        size2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        iM4657D2 = C1483k.m4657D(size2);
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 11:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM4657D2 = C1483k.m4657D(size2);
                        }
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 12:
                        iM4658E2 = C1483k.m4657D(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 13:
                        if (obj2 instanceof EnumC1535u1) {
                            iM4658E2 = C1483k.m4654A(((EnumC1535u1) obj2).f6121w);
                        } else {
                            iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iM4658E2 = C1483k.m4657D((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                        return iM4658E2 + iM4656C + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iM4658E2 = C1483k.m4658E((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                        return iM4658E2 + iM4656C + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 14:
                ((Integer) obj).getClass();
                iM4658E = 4;
                i13 = iM4658E + iM4656C2;
                enumC1542v3 = c1470h1.f6049b;
                iM4656C = C1483k.m4656C(2);
                if (enumC1542v3 == c1527s3) {
                    iM4656C *= 2;
                }
                switch (enumC1542v3.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 2:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 3:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 4:
                        iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM4658E2 + iM4656C + i13;
                    case 8:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                            iM4658E2 = iM4657D2 + size2;
                        } else {
                            iM4658E2 = C1483k.m4655B((String) obj2);
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 9:
                        iM4658E2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        return iM4658E2 + iM4656C + i13;
                    case 10:
                        size2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        iM4657D2 = C1483k.m4657D(size2);
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 11:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM4657D2 = C1483k.m4657D(size2);
                        }
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 12:
                        iM4658E2 = C1483k.m4657D(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 13:
                        if (obj2 instanceof EnumC1535u1) {
                            iM4658E2 = C1483k.m4654A(((EnumC1535u1) obj2).f6121w);
                        } else {
                            iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iM4658E2 = C1483k.m4657D((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                        return iM4658E2 + iM4656C + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iM4658E2 = C1483k.m4658E((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                        return iM4658E2 + iM4656C + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 15:
                ((Long) obj).getClass();
                iM4658E = 8;
                i13 = iM4658E + iM4656C2;
                enumC1542v3 = c1470h1.f6049b;
                iM4656C = C1483k.m4656C(2);
                if (enumC1542v3 == c1527s3) {
                    iM4656C *= 2;
                }
                switch (enumC1542v3.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 2:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 3:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 4:
                        iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM4658E2 + iM4656C + i13;
                    case 8:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                            iM4658E2 = iM4657D2 + size2;
                        } else {
                            iM4658E2 = C1483k.m4655B((String) obj2);
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 9:
                        iM4658E2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        return iM4658E2 + iM4656C + i13;
                    case 10:
                        size2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        iM4657D2 = C1483k.m4657D(size2);
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 11:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM4657D2 = C1483k.m4657D(size2);
                        }
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 12:
                        iM4658E2 = C1483k.m4657D(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 13:
                        if (obj2 instanceof EnumC1535u1) {
                            iM4658E2 = C1483k.m4654A(((EnumC1535u1) obj2).f6121w);
                        } else {
                            iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iM4658E2 = C1483k.m4657D((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                        return iM4658E2 + iM4656C + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iM4658E2 = C1483k.m4658E((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                        return iM4658E2 + iM4656C + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iM4658E = C1483k.m4657D((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                i13 = iM4658E + iM4656C2;
                enumC1542v3 = c1470h1.f6049b;
                iM4656C = C1483k.m4656C(2);
                if (enumC1542v3 == c1527s3) {
                    iM4656C *= 2;
                }
                switch (enumC1542v3.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 2:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 3:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 4:
                        iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM4658E2 + iM4656C + i13;
                    case 8:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                            iM4658E2 = iM4657D2 + size2;
                        } else {
                            iM4658E2 = C1483k.m4655B((String) obj2);
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 9:
                        iM4658E2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        return iM4658E2 + iM4656C + i13;
                    case 10:
                        size2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        iM4657D2 = C1483k.m4657D(size2);
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 11:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM4657D2 = C1483k.m4657D(size2);
                        }
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 12:
                        iM4658E2 = C1483k.m4657D(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 13:
                        if (obj2 instanceof EnumC1535u1) {
                            iM4658E2 = C1483k.m4654A(((EnumC1535u1) obj2).f6121w);
                        } else {
                            iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iM4658E2 = C1483k.m4657D((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                        return iM4658E2 + iM4656C + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iM4658E2 = C1483k.m4658E((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                        return iM4658E2 + iM4656C + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                long jLongValue18 = ((Long) obj).longValue();
                iM4658E = C1483k.m4658E((jLongValue18 >> 63) ^ (jLongValue18 << 1));
                i13 = iM4658E + iM4656C2;
                enumC1542v3 = c1470h1.f6049b;
                iM4656C = C1483k.m4656C(2);
                if (enumC1542v3 == c1527s3) {
                    iM4656C *= 2;
                }
                switch (enumC1542v3.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 2:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 3:
                        iM4658E2 = C1483k.m4658E(((Long) obj2).longValue());
                        return iM4658E2 + iM4656C + i13;
                    case 4:
                        iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 5:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM4658E2 + iM4656C + i13;
                    case 8:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                            iM4658E2 = iM4657D2 + size2;
                        } else {
                            iM4658E2 = C1483k.m4655B((String) obj2);
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 9:
                        iM4658E2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        return iM4658E2 + iM4656C + i13;
                    case 10:
                        size2 = ((AbstractC1534u0) ((AbstractC1433a) obj2)).mo4563b(null);
                        iM4657D2 = C1483k.m4657D(size2);
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 11:
                        if (obj2 instanceof C1468h) {
                            size2 = ((C1468h) obj2).size();
                            iM4657D2 = C1483k.m4657D(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM4657D2 = C1483k.m4657D(size2);
                        }
                        iM4658E2 = iM4657D2 + size2;
                        return iM4658E2 + iM4656C + i13;
                    case 12:
                        iM4658E2 = C1483k.m4657D(((Integer) obj2).intValue());
                        return iM4658E2 + iM4656C + i13;
                    case 13:
                        if (obj2 instanceof EnumC1535u1) {
                            iM4658E2 = C1483k.m4654A(((EnumC1535u1) obj2).f6121w);
                        } else {
                            iM4658E2 = C1483k.m4654A(((Integer) obj2).intValue());
                        }
                        return iM4658E2 + iM4656C + i13;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4658E2 = 4;
                        return iM4658E2 + iM4656C + i13;
                    case 15:
                        ((Long) obj2).getClass();
                        iM4658E2 = 8;
                        return iM4658E2 + iM4656C + i13;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iM4658E2 = C1483k.m4657D((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                        return iM4658E2 + iM4656C + i13;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iM4658E2 = C1483k.m4658E((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                        return iM4658E2 + iM4656C + i13;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4634b(C1483k c1483k, C1470h1 c1470h1, Object obj, Object obj2) {
        C1504o0.m4738b(c1483k, c1470h1.f6048a, 1, obj);
        C1504o0.m4738b(c1483k, c1470h1.f6049b, 2, obj2);
    }
}
