package androidx.health.platform.client.proto;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.z2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1559z2 {

    /* JADX INFO: renamed from: a */
    public static final C1551x2 f6171a = new C1551x2();

    /* JADX INFO: renamed from: b */
    public static final C1555y2 f6172b = new C1555y2();

    /* JADX INFO: renamed from: a */
    public static int m4950a(byte[] bArr, int i13, C1448d c1448d) throws InvalidProtocolBufferException {
        int iM4958j = m4958j(bArr, i13, c1448d);
        int i14 = c1448d.f6025a;
        if (i14 < 0) {
            throw InvalidProtocolBufferException.m4559b();
        }
        if (i14 > bArr.length - iM4958j) {
            throw InvalidProtocolBufferException.m4561d();
        }
        if (i14 == 0) {
            c1448d.f6027c = C1468h.f6044y;
            return iM4958j;
        }
        c1448d.f6027c = C1468h.m4631d(bArr, iM4958j, i14);
        return iM4958j + i14;
    }

    /* JADX INFO: renamed from: b */
    public static int m4951b(int i13, byte[] bArr) {
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: c */
    public static long m4952c(int i13, byte[] bArr) {
        return ((((long) bArr[i13 + 7]) & 255) << 56) | (((long) bArr[i13]) & 255) | ((((long) bArr[i13 + 1]) & 255) << 8) | ((((long) bArr[i13 + 2]) & 255) << 16) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((((long) bArr[i13 + 4]) & 255) << 32) | ((((long) bArr[i13 + 5]) & 255) << 40) | ((((long) bArr[i13 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: d */
    public static int m4953d(InterfaceC1536u2 interfaceC1536u2, int i13, byte[] bArr, int i14, int i15, InterfaceC1544w0 interfaceC1544w0, C1448d c1448d) throws InvalidProtocolBufferException {
        AbstractC1534u0 abstractC1534u0Mo4767d = interfaceC1536u2.mo4767d();
        InterfaceC1536u2 interfaceC1536u3 = interfaceC1536u2;
        byte[] bArr2 = bArr;
        int i16 = i15;
        C1448d c1448d2 = c1448d;
        int iM4965s = m4965s(abstractC1534u0Mo4767d, interfaceC1536u3, bArr2, i14, i16, c1448d2);
        interfaceC1536u3.mo4765b(abstractC1534u0Mo4767d);
        c1448d2.f6027c = abstractC1534u0Mo4767d;
        interfaceC1544w0.add(abstractC1534u0Mo4767d);
        while (iM4965s < i16) {
            C1448d c1448d3 = c1448d2;
            int i17 = i16;
            int iM4958j = m4958j(bArr2, iM4965s, c1448d3);
            if (i13 != c1448d3.f6025a) {
                break;
            }
            byte[] bArr3 = bArr2;
            InterfaceC1536u2 interfaceC1536u4 = interfaceC1536u3;
            AbstractC1534u0 abstractC1534u0Mo4767d2 = interfaceC1536u4.mo4767d();
            iM4965s = m4965s(abstractC1534u0Mo4767d2, interfaceC1536u4, bArr3, iM4958j, i17, c1448d3);
            interfaceC1536u3 = interfaceC1536u4;
            bArr2 = bArr3;
            i16 = i17;
            c1448d2 = c1448d3;
            interfaceC1536u3.mo4765b(abstractC1534u0Mo4767d2);
            c1448d2.f6027c = abstractC1534u0Mo4767d2;
            interfaceC1544w0.add(abstractC1534u0Mo4767d2);
        }
        return iM4965s;
    }

    /* JADX INFO: renamed from: e */
    public static int m4954e(byte[] bArr, int i13, C1448d c1448d) throws InvalidProtocolBufferException {
        int iM4958j = m4958j(bArr, i13, c1448d);
        int i14 = c1448d.f6025a;
        if (i14 < 0) {
            throw InvalidProtocolBufferException.m4559b();
        }
        if (i14 == 0) {
            c1448d.f6027c = "";
            return iM4958j;
        }
        c1448d.f6027c = new String(bArr, iM4958j, i14, AbstractC1549x0.f6150a);
        return iM4958j + i14;
    }

    /* JADX INFO: renamed from: f */
    public static int m4955f(byte[] bArr, int i13, C1448d c1448d) throws InvalidProtocolBufferException {
        int iM4958j = m4958j(bArr, i13, c1448d);
        int i14 = c1448d.f6025a;
        if (i14 < 0) {
            throw InvalidProtocolBufferException.m4559b();
        }
        if (i14 == 0) {
            c1448d.f6027c = "";
            return iM4958j;
        }
        c1448d.f6027c = AbstractC1517q3.f6107a.mo4790h(bArr, iM4958j, i14);
        return iM4958j + i14;
    }

    /* JADX INFO: renamed from: g */
    public static int m4956g(int i13, byte[] bArr, int i14, int i15, C1457e3 c1457e3, C1448d c1448d) throws InvalidProtocolBufferException {
        if ((i13 >>> 3) == 0) {
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
        int i16 = i13 & 7;
        if (i16 == 0) {
            int iM4960l = m4960l(bArr, i14, c1448d);
            c1457e3.m4605d(i13, Long.valueOf(c1448d.f6026b));
            return iM4960l;
        }
        if (i16 == 1) {
            c1457e3.m4605d(i13, Long.valueOf(m4952c(i14, bArr)));
            return i14 + 8;
        }
        if (i16 == 2) {
            int iM4958j = m4958j(bArr, i14, c1448d);
            int i17 = c1448d.f6025a;
            if (i17 < 0) {
                throw InvalidProtocolBufferException.m4559b();
            }
            if (i17 > bArr.length - iM4958j) {
                throw InvalidProtocolBufferException.m4561d();
            }
            if (i17 == 0) {
                c1457e3.m4605d(i13, C1468h.f6044y);
            } else {
                c1457e3.m4605d(i13, C1468h.m4631d(bArr, iM4958j, i17));
            }
            return iM4958j + i17;
        }
        if (i16 != 3) {
            if (i16 != 5) {
                throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
            }
            c1457e3.m4605d(i13, Integer.valueOf(m4951b(i14, bArr)));
            return i14 + 4;
        }
        C1457e3 c1457e3M4602c = C1457e3.m4602c();
        int i18 = (i13 & (-8)) | 4;
        int i19 = 0;
        while (i14 < i15) {
            int iM4958j2 = m4958j(bArr, i14, c1448d);
            int i24 = c1448d.f6025a;
            if (i24 == i18) {
                i19 = i24;
                i14 = iM4958j2;
                break;
            }
            i14 = m4956g(i24, bArr, iM4958j2, i15, c1457e3M4602c, c1448d);
            i19 = i24;
        }
        if (i14 > i15 || i19 != i18) {
            throw InvalidProtocolBufferException.m4560c();
        }
        c1457e3.m4605d(i13, c1457e3M4602c);
        return i14;
    }

    /* JADX INFO: renamed from: i */
    public static int m4957i(int i13, byte[] bArr, int i14, C1448d c1448d) {
        int i15 = i13 & 127;
        int i16 = i14 + 1;
        byte b = bArr[i14];
        if (b >= 0) {
            c1448d.f6025a = i15 | (b << 7);
            return i16;
        }
        int i17 = i15 | ((b & 127) << 7);
        int i18 = i14 + 2;
        byte b6 = bArr[i16];
        if (b6 >= 0) {
            c1448d.f6025a = i17 | (b6 << 14);
            return i18;
        }
        int i19 = i17 | ((b6 & 127) << 14);
        int i24 = i14 + 3;
        byte b8 = bArr[i18];
        if (b8 >= 0) {
            c1448d.f6025a = i19 | (b8 << 21);
            return i24;
        }
        int i25 = i19 | ((b8 & 127) << 21);
        int i26 = i14 + 4;
        byte b14 = bArr[i24];
        if (b14 >= 0) {
            c1448d.f6025a = i25 | (b14 << 28);
            return i26;
        }
        int i27 = i25 | ((b14 & 127) << 28);
        while (true) {
            int i28 = i26 + 1;
            if (bArr[i26] >= 0) {
                c1448d.f6025a = i27;
                return i28;
            }
            i26 = i28;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m4958j(byte[] bArr, int i13, C1448d c1448d) {
        int i14 = i13 + 1;
        byte b = bArr[i13];
        if (b < 0) {
            return m4957i(b, bArr, i14, c1448d);
        }
        c1448d.f6025a = b;
        return i14;
    }

    /* JADX INFO: renamed from: k */
    public static int m4959k(int i13, byte[] bArr, int i14, int i15, InterfaceC1544w0 interfaceC1544w0, C1448d c1448d) {
        AbstractC1539v0 abstractC1539v0 = (AbstractC1539v0) interfaceC1544w0;
        int iM4958j = m4958j(bArr, i14, c1448d);
        abstractC1539v0.m4875c(c1448d.f6025a);
        while (iM4958j < i15) {
            int iM4958j2 = m4958j(bArr, iM4958j, c1448d);
            if (i13 != c1448d.f6025a) {
                break;
            }
            iM4958j = m4958j(bArr, iM4958j2, c1448d);
            abstractC1539v0.m4875c(c1448d.f6025a);
        }
        return iM4958j;
    }

    /* JADX INFO: renamed from: l */
    public static int m4960l(byte[] bArr, int i13, C1448d c1448d) {
        int i14 = i13 + 1;
        long j7 = bArr[i13];
        if (j7 >= 0) {
            c1448d.f6026b = j7;
            return i14;
        }
        int i15 = i13 + 2;
        byte b = bArr[i14];
        long j13 = (j7 & 127) | (((long) (b & 127)) << 7);
        int i16 = 7;
        while (b < 0) {
            int i17 = i15 + 1;
            byte b6 = bArr[i15];
            i16 += 7;
            j13 |= ((long) (b6 & 127)) << i16;
            b = b6;
            i15 = i17;
        }
        c1448d.f6026b = j13;
        return i15;
    }

    /* JADX INFO: renamed from: m */
    public static int m4961m(int i13) {
        return (-(i13 & 1)) ^ (i13 >>> 1);
    }

    /* JADX INFO: renamed from: n */
    public static long m4962n(long j7) {
        return (-(j7 & 1)) ^ (j7 >>> 1);
    }

    /* JADX INFO: renamed from: p */
    public static String m4963p(C1468h c1468h) {
        StringBuilder sb4 = new StringBuilder(c1468h.size());
        for (int i13 = 0; i13 < c1468h.size(); i13++) {
            byte bMo4609a = c1468h.mo4609a(i13);
            if (bMo4609a == 34) {
                sb4.append("\\\"");
            } else if (bMo4609a == 39) {
                sb4.append("\\'");
            } else if (bMo4609a != 92) {
                switch (bMo4609a) {
                    case 7:
                        sb4.append("\\a");
                        break;
                    case 8:
                        sb4.append("\\b");
                        break;
                    case 9:
                        sb4.append("\\t");
                        break;
                    case 10:
                        sb4.append("\\n");
                        break;
                    case 11:
                        sb4.append("\\v");
                        break;
                    case 12:
                        sb4.append("\\f");
                        break;
                    case 13:
                        sb4.append("\\r");
                        break;
                    default:
                        if (bMo4609a < 32 || bMo4609a > 126) {
                            sb4.append('\\');
                            sb4.append((char) (((bMo4609a >>> 6) & 3) + 48));
                            sb4.append((char) (((bMo4609a >>> 3) & 7) + 48));
                            sb4.append((char) ((bMo4609a & 7) + 48));
                        } else {
                            sb4.append((char) bMo4609a);
                        }
                        break;
                }
            } else {
                sb4.append("\\\\");
            }
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m4964q(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: s */
    public static int m4965s(Object obj, InterfaceC1536u2 interfaceC1536u2, byte[] bArr, int i13, int i14, C1448d c1448d) throws InvalidProtocolBufferException {
        int iM4957i = i13 + 1;
        int i15 = bArr[i13];
        if (i15 < 0) {
            iM4957i = m4957i(i15, bArr, iM4957i, c1448d);
            i15 = c1448d.f6025a;
        }
        int i16 = iM4957i;
        if (i15 < 0 || i15 > i14 - i16) {
            throw InvalidProtocolBufferException.m4561d();
        }
        int i17 = i16 + i15;
        interfaceC1536u2.mo4768e(obj, bArr, i16, i17, c1448d);
        c1448d.f6027c = obj;
        return i17;
    }

    /* JADX INFO: renamed from: u */
    public static int m4966u(int i13, byte[] bArr, int i14, int i15, C1448d c1448d) throws InvalidProtocolBufferException {
        if ((i13 >>> 3) == 0) {
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
        int i16 = i13 & 7;
        if (i16 == 0) {
            return m4960l(bArr, i14, c1448d);
        }
        if (i16 == 1) {
            return i14 + 8;
        }
        if (i16 == 2) {
            return m4958j(bArr, i14, c1448d) + c1448d.f6025a;
        }
        if (i16 != 3) {
            if (i16 == 5) {
                return i14 + 4;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
        int i17 = (i13 & (-8)) | 4;
        int i18 = 0;
        while (i14 < i15) {
            i14 = m4958j(bArr, i14, c1448d);
            i18 = c1448d.f6025a;
            if (i18 == i17) {
                break;
            }
            i14 = m4966u(i18, bArr, i14, i15, c1448d);
        }
        if (i14 > i15 || i18 != i17) {
            throw InvalidProtocolBufferException.m4560c();
        }
        return i14;
    }

    /* JADX INFO: renamed from: h */
    public abstract String mo4790h(byte[] bArr, int i13, int i14);

    /* JADX INFO: renamed from: o */
    public abstract int mo4791o(String str, byte[] bArr, int i13, int i14);

    /* JADX INFO: renamed from: r */
    public boolean m4967r(byte[] bArr, int i13, int i14) {
        return mo4792t(bArr, i13, i14) == 0;
    }

    /* JADX INFO: renamed from: t */
    public abstract int mo4792t(byte[] bArr, int i13, int i14);
}
