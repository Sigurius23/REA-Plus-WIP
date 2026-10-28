package p076d;

import androidx.health.platform.client.proto.C1533u;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import p001a.C0001h;
import p012ab.C0682h0;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: d.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11286g0 extends FilterInputStream {

    /* JADX INFO: renamed from: w */
    public final int f36208w;

    /* JADX INFO: renamed from: x */
    public final boolean f36209x;

    /* JADX INFO: renamed from: y */
    public final byte[][] f36210y;

    public C11286g0(ByteArrayInputStream byteArrayInputStream, int i13, boolean z4) {
        this(byteArrayInputStream, i13, z4, new byte[11][]);
    }

    /* JADX INFO: renamed from: b */
    public static int m30496b(InputStream inputStream, int i13) throws IOException {
        int i14 = i13 & 31;
        if (i14 != 31) {
            return i14;
        }
        int i15 = inputStream.read();
        if (i15 < 31) {
            if (i15 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - high tag number < 31 found");
        }
        int i16 = i15 & 127;
        if (i16 == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        while ((i15 & 128) != 0) {
            if ((i16 >>> 24) != 0) {
                throw new IOException("Tag number more than 31 bits");
            }
            int i17 = i16 << 7;
            int i18 = inputStream.read();
            if (i18 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            i16 = i17 | (i18 & 127);
            i15 = i18;
        }
        return i16;
    }

    /* JADX INFO: renamed from: h */
    public static int m30497h(InputStream inputStream, int i13, boolean z4) throws IOException {
        int i14 = inputStream.read();
        if ((i14 >>> 7) == 0) {
            return i14;
        }
        if (128 == i14) {
            return -1;
        }
        if (i14 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (255 == i14) {
            throw new IOException("invalid long form definite-length 0xFF");
        }
        int i15 = i14 & 127;
        int i16 = 0;
        int i17 = 0;
        do {
            int i18 = inputStream.read();
            if (i18 < 0) {
                throw new EOFException("EOF found reading length");
            }
            if ((i16 >>> 23) != 0) {
                throw new IOException("long form definite-length more than 31 bits");
            }
            i16 = (i16 << 8) + i18;
            i17++;
        } while (i17 < i15);
        if (i16 < i13 || z4) {
            return i16;
        }
        throw new IOException(AbstractC2875y.m8294g(i16, i13, "corrupted stream - out of bounds length found: ", " >= "));
    }

    /* JADX INFO: renamed from: m */
    public static AbstractC11272b1 m30498m(int i13, C11273c c11273c, byte[][] bArr) throws IOException {
        try {
            switch (i13) {
                case 1:
                    byte[] bArrM30499s = m30499s(c11273c, bArr);
                    if (bArrM30499s.length != 1) {
                        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
                    }
                    byte b = bArrM30499s[0];
                    if (b != -1) {
                        return b != 0 ? new C11301n(b) : C11301n.f36227b;
                    }
                    return C11301n.f36228c;
                case 2:
                    return new C11294j0(c11273c.m30484h());
                case 3:
                    return AbstractC11285g.m30493l(c11273c.m30484h());
                case 4:
                    return new C11297l(c11273c.m30484h());
                case 5:
                    if (c11273c.m30484h().length == 0) {
                        return C11279e.f36201a;
                    }
                    throw new IllegalStateException("malformed NULL encoding encountered");
                case 6:
                    int i14 = c11273c.f36189z;
                    HashMap map = C11312s0.f36247c;
                    if (i14 > 4096) {
                        throw new IllegalArgumentException("exceeded OID contents length limit");
                    }
                    byte[] bArrM30499s2 = m30499s(c11273c, bArr);
                    if (bArrM30499s2.length > 4096) {
                        throw new IllegalArgumentException("exceeded OID contents length limit");
                    }
                    C11306p0 c11306p0 = new C11306p0(bArrM30499s2);
                    HashMap map2 = C11312s0.f36247c;
                    synchronized (map2) {
                        try {
                            C11312s0 c11312s0 = (C11312s0) map2.get(c11306p0);
                            if (c11312s0 != null) {
                                return c11312s0;
                            }
                            if (C11278d1.m30489m(bArrM30499s2)) {
                                return new C11312s0((byte[]) bArrM30499s2.clone());
                            }
                            throw new IllegalArgumentException("invalid OID contents");
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                case 7:
                    return new C11302n0(new C11284f1(c11273c.m30484h()));
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                case 29:
                default:
                    throw new IOException("unknown tag " + i13 + " encountered");
                case 10:
                    byte[] bArrM30499s3 = m30499s(c11273c, bArr);
                    if (bArrM30499s3.length > 1) {
                        return new C11317v(bArrM30499s3);
                    }
                    if (bArrM30499s3.length == 0) {
                        throw new IllegalArgumentException("ENUMERATED has zero length");
                    }
                    int i15 = bArrM30499s3[0] & 255;
                    C11317v[] c11317vArr = C11317v.f36264b;
                    if (i15 >= 12) {
                        return new C11317v(bArrM30499s3);
                    }
                    C11317v c11317v = c11317vArr[i15];
                    if (c11317v != null) {
                        return c11317v;
                    }
                    C11317v c11317v2 = new C11317v(bArrM30499s3);
                    c11317vArr[i15] = c11317v2;
                    return c11317v2;
                case 12:
                    return new C11283f0(c11273c.m30484h());
                case 13:
                    int i16 = c11273c.f36189z;
                    HashMap map3 = C11278d1.f36198c;
                    if (i16 <= 4096) {
                        return C11278d1.m30488l(m30499s(c11273c, bArr));
                    }
                    throw new IllegalArgumentException("exceeded relative OID contents length limit");
                case 14:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    throw new IOException("unsupported tag " + i13 + " encountered");
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    return new C11288h(c11273c.m30484h());
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    return new C11315u(c11273c.m30484h());
                case 20:
                    return new C11271b0(c11273c.m30484h());
                case 21:
                    return new C11298l0(c11273c.m30484h());
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    return new C11270b(c11273c.m30484h());
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    return new C11295k(c11273c.m30484h());
                case 24:
                    return new C11274c0(c11273c.m30484h());
                case 25:
                    return new C11284f1(c11273c.m30484h());
                case 26:
                    return new C11300m0(c11273c.m30484h());
                case 27:
                    return new C11275c1(c11273c.m30484h());
                case 28:
                    return new C11292i0(c11273c.m30484h());
                case 30:
                    return new C11324y0(m30500x(c11273c));
            }
        } catch (IllegalArgumentException e5) {
            throw new C0001h(e5, e5.getMessage());
        } catch (IllegalStateException e13) {
            throw new C0001h(e13, e13.getMessage());
        }
    }

    /* JADX INFO: renamed from: s */
    public static byte[] m30499s(C11273c c11273c, byte[][] bArr) throws IOException {
        int i13 = c11273c.f36189z;
        if (i13 >= bArr.length) {
            return c11273c.m30484h();
        }
        byte[] bArr2 = bArr[i13];
        if (bArr2 == null) {
            bArr2 = new byte[i13];
            bArr[i13] = bArr2;
        }
        if (i13 != bArr2.length) {
            throw new IllegalArgumentException("buffer length not right for data");
        }
        if (i13 == 0) {
            return bArr2;
        }
        int i14 = c11273c.f36235x;
        if (i13 >= i14) {
            throw new IOException("corrupted stream - out of bounds length found: " + c11273c.f36189z + " >= " + i14);
        }
        InputStream inputStream = c11273c.f36234w;
        int length = bArr2.length;
        int i15 = 0;
        while (i15 < length) {
            int i16 = inputStream.read(bArr2, i15, length - i15);
            if (i16 < 0) {
                break;
            }
            i15 += i16;
        }
        int i17 = i13 - i15;
        c11273c.f36189z = i17;
        if (i17 == 0) {
            c11273c.m30513b();
            return bArr2;
        }
        throw new EOFException("DEF length " + c11273c.f36188y + " object truncated by " + c11273c.f36189z);
    }

    /* JADX INFO: renamed from: x */
    public static char[] m30500x(C11273c c11273c) throws IOException {
        int i13 = c11273c.f36189z;
        if ((i13 & 1) != 0) {
            throw new IOException("malformed BMPString encoding encountered");
        }
        int i14 = i13 / 2;
        char[] cArr = new char[i14];
        byte[] bArr = new byte[8];
        int i15 = 0;
        int i16 = 0;
        while (i13 >= 8) {
            int i17 = 0;
            while (i17 < 8) {
                int i18 = c11273c.read(bArr, i17, 8 - i17);
                if (i18 < 0) {
                    break;
                }
                i17 += i18;
            }
            if (i17 != 8) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            cArr[i16] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
            cArr[i16 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
            cArr[i16 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
            cArr[i16 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
            i16 += 4;
            i13 -= 8;
        }
        if (i13 > 0) {
            int i19 = 0;
            while (i19 < i13) {
                int i24 = c11273c.read(bArr, i19, i13 - i19);
                if (i24 < 0) {
                    break;
                }
                i19 += i24;
            }
            if (i19 != i13) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            do {
                int i25 = i15 + 1;
                int i26 = bArr[i15] << 8;
                i15 += 2;
                cArr[i16] = (char) ((bArr[i25] & 255) | i26);
                i16++;
            } while (i15 < i13);
        }
        if (c11273c.f36189z == 0 && i14 == i16) {
            return cArr;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: J */
    public final C11311s m30501J(C11273c c11273c) {
        C11286g0 c11286g0;
        AbstractC11272b1 abstractC11272b1M30502i;
        int i13 = c11273c.f36189z;
        if (i13 >= 1 && (abstractC11272b1M30502i = (c11286g0 = new C11286g0(c11273c, i13, this.f36209x, this.f36210y)).m30502i()) != null) {
            C11311s c11311s = new C11311s(10);
            do {
                c11311s.m30522e(abstractC11272b1M30502i);
                abstractC11272b1M30502i = c11286g0.m30502i();
            } while (abstractC11272b1M30502i != null);
            return c11311s;
        }
        return new C11311s(0);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [byte[][], java.io.Serializable] */
    /* JADX INFO: renamed from: i */
    public final AbstractC11272b1 m30502i() {
        int i13 = read();
        if (i13 <= 0) {
            if (i13 != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int iM30496b = m30496b(this, i13);
        int i14 = this.f36208w;
        int iM30497h = m30497h(this, i14, false);
        if (iM30497h >= 0) {
            try {
                return m30503k(i13, iM30496b, iM30497h);
            } catch (IllegalArgumentException e5) {
                throw new C0001h(e5, "corrupted stream detected");
            }
        }
        if ((i13 & 32) == 0) {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        C0682h0 c0682h0 = new C0682h0(new C11291i(this, i14), i14, this.f36210y, 5);
        int i15 = i13 & 192;
        int i16 = 4;
        int i17 = 3;
        int i18 = 1;
        if (i15 != 0) {
            C11311s c11311sM1688c = c0682h0.m1688c();
            int i19 = c11311sM1688c.f36244a;
            if (i19 == 1) {
                return new C11277d0(i17, i15, iM30496b, c11311sM1688c.m30521d(0), 1);
            }
            C11280e0 c11280e0 = AbstractC11323y.f36278a;
            return new C11277d0(i16, i15, iM30496b, i19 < 1 ? AbstractC11323y.f36278a : new C11280e0(c11311sM1688c), 1);
        }
        if (iM30496b == 3) {
            C11314t0 c11314t0 = new C11314t0(c0682h0);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int i24 = c11314t0.read(bArr, 0, 4096);
                if (i24 < 0) {
                    return new C11313t(byteArrayOutputStream.toByteArray(), c11314t0.f36255y);
                }
                byteArrayOutputStream.write(bArr, 0, i24);
            }
        } else {
            if (iM30496b != 4) {
                if (iM30496b != 8) {
                    if (iM30496b == 16) {
                        return new C11280e0(c0682h0.m1688c());
                    }
                    if (iM30496b == 17) {
                        return new C11296k0(c0682h0.m1688c());
                    }
                    throw new IOException("unknown BER object encountered");
                }
                try {
                    C11321x c11321x = new C11321x(c0682h0.m1688c(), i18);
                    c11321x.f36274c = -1;
                    return new C11316u0(c11321x);
                } catch (IllegalArgumentException e13) {
                    throw new C0001h(e13, e13.getMessage());
                }
            }
            C11318v0 c11318v0 = new C11318v0(c0682h0);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[4096];
            while (true) {
                int i25 = c11318v0.read(bArr2, 0, 4096);
                if (i25 < 0) {
                    return new C11268a0(byteArrayOutputStream2.toByteArray(), null);
                }
                byteArrayOutputStream2.write(bArr2, 0, i25);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC11272b1 m30503k(int i13, int i14, int i15) throws IOException {
        C11321x c11321x;
        C11321x c11321x2;
        C11273c c11273c = new C11273c(this, i15, this.f36208w);
        if ((i13 & 224) == 0) {
            return m30498m(i14, c11273c, this.f36210y);
        }
        int i16 = i13 & 192;
        int i17 = 3;
        int i18 = 0;
        int i19 = 4;
        int i24 = 1;
        if (i16 != 0) {
            if ((i13 & 32) == 0) {
                return new C11277d0(i19, i16, i14, new C11297l(c11273c.m30484h()), 2);
            }
            C11311s c11311sM30501J = m30501J(c11273c);
            int i25 = c11311sM30501J.f36244a;
            if (i25 == 1) {
                return new C11277d0(i17, i16, i14, c11311sM30501J.m30521d(0), 2);
            }
            C11321x c11321x3 = AbstractC11320w0.f36271a;
            if (i25 < 1) {
                c11321x2 = AbstractC11320w0.f36271a;
            } else {
                C11321x c11321x4 = new C11321x(c11311sM30501J, i24);
                c11321x4.f36274c = -1;
                c11321x2 = c11321x4;
            }
            return new C11277d0(i19, i16, i14, c11321x2, 2);
        }
        if (i14 == 3) {
            C11311s c11311sM30501J2 = m30501J(c11273c);
            int i26 = c11311sM30501J2.f36244a;
            AbstractC11285g[] abstractC11285gArr = new AbstractC11285g[i26];
            while (i18 != i26) {
                InterfaceC11307q interfaceC11307qM30521d = c11311sM30501J2.m30521d(i18);
                if (!(interfaceC11307qM30521d instanceof AbstractC11285g)) {
                    throw new C0001h("unknown object encountered in constructed BIT STRING: " + interfaceC11307qM30521d.getClass());
                }
                abstractC11285gArr[i18] = (AbstractC11285g) interfaceC11307qM30521d;
                i18++;
            }
            return new C11313t(abstractC11285gArr);
        }
        if (i14 == 4) {
            C11311s c11311sM30501J3 = m30501J(c11273c);
            int i27 = c11311sM30501J3.f36244a;
            AbstractC11322x0[] abstractC11322x0Arr = new AbstractC11322x0[i27];
            while (i18 != i27) {
                InterfaceC11307q interfaceC11307qM30521d2 = c11311sM30501J3.m30521d(i18);
                if (!(interfaceC11307qM30521d2 instanceof AbstractC11322x0)) {
                    throw new C0001h("unknown object encountered in constructed OCTET STRING: " + interfaceC11307qM30521d2.getClass());
                }
                abstractC11322x0Arr[i18] = (AbstractC11322x0) interfaceC11307qM30521d2;
                i18++;
            }
            return new C11268a0(C11268a0.m30478m(abstractC11322x0Arr), abstractC11322x0Arr);
        }
        if (i14 == 8) {
            C11311s c11311sM30501J4 = m30501J(c11273c);
            C11321x c11321x5 = AbstractC11320w0.f36271a;
            if (c11311sM30501J4.f36244a < 1) {
                c11321x = AbstractC11320w0.f36271a;
            } else {
                C11321x c11321x6 = new C11321x(c11311sM30501J4, i24);
                c11321x6.f36274c = -1;
                c11321x = c11321x6;
            }
            return new C11316u0(c11321x);
        }
        if (i14 != 16) {
            if (i14 != 17) {
                throw new IOException(AbstractC2875y.m8296i(i14, "unknown tag ", " encountered"));
            }
            C11311s c11311sM30501J5 = m30501J(c11273c);
            C11321x c11321x7 = AbstractC11320w0.f36271a;
            if (c11311sM30501J5.f36244a < 1) {
                return AbstractC11320w0.f36272b;
            }
            C11325z c11325z = new C11325z(c11311sM30501J5);
            c11325z.f36281d = -1;
            return c11325z;
        }
        if (c11273c.f36189z < 1) {
            return AbstractC11320w0.f36271a;
        }
        if (this.f36209x) {
            byte[] bArrM30484h = c11273c.m30484h();
            C11299m c11299m = new C11299m();
            c11299m.f36225b = bArrM30484h;
            return c11299m;
        }
        C11311s c11311sM30501J6 = m30501J(c11273c);
        C11321x c11321x8 = AbstractC11320w0.f36271a;
        if (c11311sM30501J6.f36244a < 1) {
            return AbstractC11320w0.f36271a;
        }
        C11321x c11321x9 = new C11321x(c11311sM30501J6, i24);
        c11321x9.f36274c = -1;
        return c11321x9;
    }

    public C11286g0(InputStream inputStream, int i13, boolean z4, byte[][] bArr) {
        super(inputStream);
        this.f36208w = i13;
        this.f36209x = z4;
        this.f36210y = bArr;
    }

    public C11286g0(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length, false);
    }
}
