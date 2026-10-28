package p188ha;

import ca.C4358a;
import com.mapbox.maps.C5538l;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p309lo.C24561s;
import p460rg.AbstractC31375j;
import p516u8.AbstractC34587d0;
import p516u8.C34585c0;
import p550vd.AbstractC35903f;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41060w0;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ha.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C17040i extends AbstractC35903f {

    /* JADX INFO: renamed from: b */
    public static final C5538l f65526b = new C5538l(29);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17038g f65527a;

    public C17040i(InterfaceC17038g interfaceC17038g) {
        this.f65527a = interfaceC17038g;
    }

    /* JADX INFO: renamed from: b0 */
    public static C17032a m48100b0(C38059n c38059n, int i13, int i14) {
        int iM48118t0;
        String strConcat;
        int iM121867t = c38059n.m121867t();
        Charset charsetM48115q0 = m48115q0(iM121867t);
        int i15 = i13 - 1;
        byte[] bArr = new byte[i15];
        c38059n.m121852e(bArr, 0, i15);
        if (i14 == 2) {
            strConcat = "image/" + AbstractC31375j.m96499o(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iM48118t0 = 2;
        } else {
            iM48118t0 = m48118t0(0, bArr);
            String strM96499o = AbstractC31375j.m96499o(new String(bArr, 0, iM48118t0, StandardCharsets.ISO_8859_1));
            strConcat = strM96499o.indexOf(47) == -1 ? "image/".concat(strM96499o) : strM96499o;
        }
        int i16 = bArr[iM48118t0 + 1] & 255;
        int i17 = iM48118t0 + 2;
        int iM48117s0 = m48117s0(bArr, i17, iM121867t);
        String str = new String(bArr, i17, iM48117s0 - i17, charsetM48115q0);
        int iM48114p0 = m48114p0(iM121867t) + iM48117s0;
        return new C17032a(strConcat, str, i16, i15 <= iM48114p0 ? AbstractC38065t.f163033c : Arrays.copyOfRange(bArr, iM48114p0, i15));
    }

    /* JADX INFO: renamed from: c0 */
    public static C17034c m48101c0(C38059n c38059n, int i13, int i14, boolean z4, int i15, InterfaceC17038g interfaceC17038g) throws Throwable {
        int i16 = c38059n.f163018b;
        int iM48118t0 = m48118t0(i16, c38059n.f163017a);
        String str = new String(c38059n.f163017a, i16, iM48118t0 - i16, StandardCharsets.ISO_8859_1);
        c38059n.m121846F(iM48118t0 + 1);
        int iM121854g = c38059n.m121854g();
        int iM121854g2 = c38059n.m121854g();
        long jM121869v = c38059n.m121869v();
        if (jM121869v == 4294967295L) {
            jM121869v = -1;
        }
        long jM121869v2 = c38059n.m121869v();
        long j7 = jM121869v2 == 4294967295L ? -1L : jM121869v2;
        ArrayList arrayList = new ArrayList();
        int i17 = i16 + i13;
        while (c38059n.f163018b < i17) {
            AbstractC17041j abstractC17041jM48104f0 = m48104f0(i14, c38059n, z4, i15, interfaceC17038g);
            if (abstractC17041jM48104f0 != null) {
                arrayList.add(abstractC17041jM48104f0);
            }
        }
        return new C17034c(str, iM121854g, iM121854g2, jM121869v, j7, (AbstractC17041j[]) arrayList.toArray(new AbstractC17041j[0]));
    }

    /* JADX INFO: renamed from: d0 */
    public static C17035d m48102d0(C38059n c38059n, int i13, int i14, boolean z4, int i15, InterfaceC17038g interfaceC17038g) throws Throwable {
        int i16 = c38059n.f163018b;
        int iM48118t0 = m48118t0(i16, c38059n.f163017a);
        String str = new String(c38059n.f163017a, i16, iM48118t0 - i16, StandardCharsets.ISO_8859_1);
        c38059n.m121846F(iM48118t0 + 1);
        int iM121867t = c38059n.m121867t();
        boolean z13 = (iM121867t & 2) != 0;
        boolean z14 = (iM121867t & 1) != 0;
        int iM121867t2 = c38059n.m121867t();
        String[] strArr = new String[iM121867t2];
        for (int i17 = 0; i17 < iM121867t2; i17++) {
            int i18 = c38059n.f163018b;
            int iM48118t1 = m48118t0(i18, c38059n.f163017a);
            strArr[i17] = new String(c38059n.f163017a, i18, iM48118t1 - i18, StandardCharsets.ISO_8859_1);
            c38059n.m121846F(iM48118t1 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i19 = i16 + i13;
        while (c38059n.f163018b < i19) {
            AbstractC17041j abstractC17041jM48104f0 = m48104f0(i14, c38059n, z4, i15, interfaceC17038g);
            if (abstractC17041jM48104f0 != null) {
                arrayList.add(abstractC17041jM48104f0);
            }
        }
        return new C17035d(str, z13, z14, strArr, (AbstractC17041j[]) arrayList.toArray(new AbstractC17041j[0]));
    }

    /* JADX INFO: renamed from: e0 */
    public static C17036e m48103e0(int i13, C38059n c38059n) {
        if (i13 < 4) {
            return null;
        }
        int iM121867t = c38059n.m121867t();
        Charset charsetM48115q0 = m48115q0(iM121867t);
        byte[] bArr = new byte[3];
        c38059n.m121852e(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i14 = i13 - 4;
        byte[] bArr2 = new byte[i14];
        c38059n.m121852e(bArr2, 0, i14);
        int iM48117s0 = m48117s0(bArr2, 0, iM121867t);
        String str2 = new String(bArr2, 0, iM48117s0, charsetM48115q0);
        int iM48114p0 = m48114p0(iM121867t) + iM48117s0;
        return new C17036e(str, str2, m48108j0(bArr2, iM48114p0, m48117s0(bArr2, iM48114p0, iM121867t), charsetM48115q0));
    }

    /* JADX WARN: Code duplicated, block: B:143:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:167:0x0201 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x021c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0222  */
    /* JADX WARN: Code duplicated, block: B:185:0x022f A[Catch: all -> 0x0216, Exception -> 0x0218, OutOfMemoryError -> 0x021a, TRY_LEAVE, TryCatch #8 {Exception -> 0x0218, OutOfMemoryError -> 0x021a, all -> 0x0216, blocks: (B:171:0x0211, B:184:0x022a, B:185:0x022f), top: B:199:0x01ff }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0251  */
    /* JADX WARN: Instruction removed from duplicated block: B:192:0x0251, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [ha.j] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [x8.n] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [x8.n] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [x8.n] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: f0 */
    public static AbstractC17041j m48104f0(int i13, C38059n c38059n, boolean z4, int i14, InterfaceC17038g interfaceC17038g) throws Throwable {
        int iM121871x;
        int i15;
        ?? r10;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        ?? r14;
        int i16;
        int i17;
        ?? r15;
        Throwable th3;
        ?? r16;
        ?? r17;
        ?? r18;
        ?? r19;
        C38059n c38059n2;
        Object c17033b;
        int i18 = i13;
        int iM121867t = c38059n.m121867t();
        int iM121867t2 = c38059n.m121867t();
        int iM121867t3 = c38059n.m121867t();
        int iM121867t4 = i18 >= 3 ? c38059n.m121867t() : 0;
        if (i18 == 4) {
            iM121871x = c38059n.m121871x();
            if (!z4) {
                iM121871x = (((iM121871x >> 24) & 255) << 21) | (iM121871x & 255) | (((iM121871x >> 8) & 255) << 7) | (((iM121871x >> 16) & 255) << 14);
            }
        } else {
            iM121871x = i18 == 3 ? c38059n.m121871x() : c38059n.m121870w();
        }
        int iM48119u0 = iM121871x;
        int iM121873z = i18 >= 3 ? c38059n.m121873z() : 0;
        if (iM121867t == 0 && iM121867t2 == 0 && iM121867t3 == 0 && iM121867t4 == 0 && iM48119u0 == 0 && iM121873z == 0) {
            c38059n.m121846F(c38059n.f163019c);
            return null;
        }
        int i19 = c38059n.f163018b + iM48119u0;
        if (i19 > c38059n.f163019c) {
            AbstractC38046a.m121826u("Id3Decoder", "Frame size exceeds remaining tag data");
            c38059n.m121846F(c38059n.f163019c);
            return null;
        }
        if (interfaceC17038g != null) {
            boolean zMo16708a = interfaceC17038g.mo16708a(i18, iM121867t, iM121867t2, iM121867t3, iM121867t4);
            r10 = iM121867t;
            i15 = iM121867t2;
            if (!zMo16708a) {
                i18 = i18;
                c38059n.m121846F(i19);
                return null;
            }
        } else {
            i15 = iM121867t2;
            r10 = iM121867t;
        }
        i18 = i18;
        if (i18 == 3) {
            z13 = (iM121873z & 128) != 0;
            z16 = (iM121873z & 64) != 0;
            z17 = false;
            z15 = (iM121873z & 32) != 0;
            z14 = z13;
        } else if (i18 == 4) {
            boolean z18 = (iM121873z & 64) != 0;
            boolean z19 = (iM121873z & 8) != 0;
            z16 = (iM121873z & 4) != 0;
            z17 = (iM121873z & 2) != 0;
            z14 = (iM121873z & 1) != 0;
            boolean z24 = z19;
            z15 = z18;
            z13 = z24;
        } else {
            z13 = false;
            z14 = false;
            z15 = false;
            z16 = false;
            z17 = false;
        }
        if (z13 || z16) {
            AbstractC38046a.m121826u("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            c38059n.m121846F(i19);
            return null;
        }
        if (z15) {
            iM48119u0--;
            c38059n.m121847G(1);
        }
        if (z14) {
            iM48119u0 -= 4;
            c38059n.m121847G(4);
        }
        if (z17) {
            iM48119u0 = m48119u0(iM48119u0, c38059n);
        }
        try {
            try {
                if (r10 == 84 && i15 == 88 && iM121867t3 == 88 && (i18 == 2 || iM121867t4 == 88)) {
                    c17033b = m48111m0(iM48119u0, c38059n);
                } else if (r10 == 84) {
                    c17033b = m48109k0(iM48119u0, m48116r0(i18, r10, i15, iM121867t3, iM121867t4), c38059n);
                } else if (r10 == 87 && i15 == 88 && iM121867t3 == 88 && (i18 == 2 || iM121867t4 == 88)) {
                    c17033b = m48113o0(iM48119u0, c38059n);
                } else {
                    if (r10 != 87) {
                        if (r10 == 80 && i15 == 82 && iM121867t3 == 73 && iM121867t4 == 86) {
                            c17033b = m48107i0(iM48119u0, c38059n);
                        } else {
                            th3 = null;
                            try {
                                if (r10 != 71 || i15 != 69 || iM121867t3 != 79 || (iM121867t4 != 66 && i18 != 2)) {
                                    if (i18 == 2) {
                                        if (r10 == 80 && i15 == 73 && iM121867t3 == 67) {
                                            c17033b = m48100b0(c38059n, iM48119u0, i18);
                                        } else if (r10 != 67 && i15 == 79 && iM121867t3 == 77 && (iM121867t4 == 77 || i18 == 2)) {
                                            c17033b = m48103e0(iM48119u0, c38059n);
                                        } else if (r10 != 67 && i15 == 72 && iM121867t3 == 65 && iM121867t4 == 80) {
                                            int i24 = iM48119u0;
                                            iM48119u0 = i15;
                                            i15 = i24;
                                            r19 = r10;
                                            i16 = iM121867t3;
                                            i17 = iM121867t4;
                                            try {
                                                c17033b = m48101c0(c38059n, i15, i18, z4, i14, interfaceC17038g);
                                                i18 = i13;
                                                r10 = c38059n;
                                            } catch (Exception e5) {
                                                e = e5;
                                                i18 = i13;
                                                r15 = c38059n;
                                                r14 = r19;
                                                r15.m121846F(i19);
                                                r17 = th3;
                                                r18 = r14;
                                            } catch (OutOfMemoryError e13) {
                                                e = e13;
                                                i18 = i13;
                                                r15 = c38059n;
                                                r14 = r19;
                                                r15.m121846F(i19);
                                                r17 = th3;
                                                r18 = r14;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                r16 = c38059n;
                                                r16.m121846F(i19);
                                                throw th;
                                            }
                                        } else {
                                            int i25 = iM48119u0;
                                            iM48119u0 = i15;
                                            i15 = i25;
                                            r19 = r10;
                                            i16 = iM121867t3;
                                            i17 = iM121867t4;
                                            try {
                                                if (r19 != 67 && iM48119u0 == 84 && i16 == 79 && i17 == 67) {
                                                    i18 = i13;
                                                    C38059n c38059n3 = c38059n;
                                                    c17033b = m48102d0(c38059n3, i15, i18, z4, i14, interfaceC17038g);
                                                    r10 = c38059n3;
                                                } else {
                                                    i18 = i13;
                                                    c38059n2 = c38059n;
                                                    if (r19 != 77 && iM48119u0 == 76 && i16 == 76 && i17 == 84) {
                                                        c17033b = m48106h0(i15, c38059n2);
                                                        r10 = c38059n2;
                                                    } else {
                                                        String strM48116r0 = m48116r0(i18, r19 == true ? 1 : 0, iM48119u0, i16, i17);
                                                        byte[] bArr = new byte[i15];
                                                        c38059n2.m121852e(bArr, 0, i15);
                                                        c17033b = new C17033b(strM48116r0, bArr);
                                                        r10 = c38059n2;
                                                    }
                                                }
                                            } catch (Exception e14) {
                                                e = e14;
                                                r15 = r10;
                                                r14 = r19;
                                                r15.m121846F(i19);
                                                r17 = th3;
                                                r18 = r14;
                                            } catch (OutOfMemoryError e15) {
                                                e = e15;
                                                r15 = r10;
                                                r14 = r19;
                                                r15.m121846F(i19);
                                                r17 = th3;
                                                r18 = r14;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                r16 = r10;
                                                r16.m121846F(i19);
                                                throw th;
                                            }
                                        }
                                    } else if (r10 == 65 && i15 == 80 && iM121867t3 == 73 && iM121867t4 == 67) {
                                        c17033b = m48100b0(c38059n, iM48119u0, i18);
                                    } else {
                                        if (r10 != 67) {
                                        }
                                        if (r10 != 67) {
                                            int i26 = iM48119u0;
                                            iM48119u0 = i15;
                                            i15 = i26;
                                            r19 = r10;
                                            i16 = iM121867t3;
                                            i17 = iM121867t4;
                                            if (r19 != 67) {
                                                i18 = i13;
                                                c38059n2 = c38059n;
                                                if (r19 != 77) {
                                                    String strM48116r1 = m48116r0(i18, r19 == true ? 1 : 0, iM48119u0, i16, i17);
                                                    byte[] bArr2 = new byte[i15];
                                                    c38059n2.m121852e(bArr2, 0, i15);
                                                    c17033b = new C17033b(strM48116r1, bArr2);
                                                    r10 = c38059n2;
                                                } else {
                                                    String strM48116r2 = m48116r0(i18, r19 == true ? 1 : 0, iM48119u0, i16, i17);
                                                    byte[] bArr3 = new byte[i15];
                                                    c38059n2.m121852e(bArr3, 0, i15);
                                                    c17033b = new C17033b(strM48116r2, bArr3);
                                                    r10 = c38059n2;
                                                }
                                            } else {
                                                i18 = i13;
                                                c38059n2 = c38059n;
                                                if (r19 != 77) {
                                                    String strM48116r3 = m48116r0(i18, r19 == true ? 1 : 0, iM48119u0, i16, i17);
                                                    byte[] bArr4 = new byte[i15];
                                                    c38059n2.m121852e(bArr4, 0, i15);
                                                    c17033b = new C17033b(strM48116r3, bArr4);
                                                    r10 = c38059n2;
                                                } else {
                                                    String strM48116r4 = m48116r0(i18, r19 == true ? 1 : 0, iM48119u0, i16, i17);
                                                    byte[] bArr5 = new byte[i15];
                                                    c38059n2.m121852e(bArr5, 0, i15);
                                                    c17033b = new C17033b(strM48116r4, bArr5);
                                                    r10 = c38059n2;
                                                }
                                            }
                                        } else {
                                            int i27 = iM48119u0;
                                            iM48119u0 = i15;
                                            i15 = i27;
                                            r19 = r10;
                                            i16 = iM121867t3;
                                            i17 = iM121867t4;
                                            if (r19 != 67) {
                                                i18 = i13;
                                                c38059n2 = c38059n;
                                                if (r19 != 77) {
                                                    String strM48116r5 = m48116r0(i18, r19 == true ? 1 : 0, iM48119u0, i16, i17);
                                                    byte[] bArr6 = new byte[i15];
                                                    c38059n2.m121852e(bArr6, 0, i15);
                                                    c17033b = new C17033b(strM48116r5, bArr6);
                                                    r10 = c38059n2;
                                                } else {
                                                    String strM48116r6 = m48116r0(i18, r19 == true ? 1 : 0, iM48119u0, i16, i17);
                                                    byte[] bArr7 = new byte[i15];
                                                    c38059n2.m121852e(bArr7, 0, i15);
                                                    c17033b = new C17033b(strM48116r6, bArr7);
                                                    r10 = c38059n2;
                                                }
                                            } else {
                                                i18 = i13;
                                                c38059n2 = c38059n;
                                                if (r19 != 77) {
                                                    String strM48116r7 = m48116r0(i18, r19 == true ? 1 : 0, iM48119u0, i16, i17);
                                                    byte[] bArr8 = new byte[i15];
                                                    c38059n2.m121852e(bArr8, 0, i15);
                                                    c17033b = new C17033b(strM48116r7, bArr8);
                                                    r10 = c38059n2;
                                                } else {
                                                    String strM48116r8 = m48116r0(i18, r19 == true ? 1 : 0, iM48119u0, i16, i17);
                                                    byte[] bArr9 = new byte[i15];
                                                    c38059n2.m121852e(bArr9, 0, i15);
                                                    c17033b = new C17033b(strM48116r8, bArr9);
                                                    r10 = c38059n2;
                                                }
                                            }
                                        }
                                    }
                                    if (r17 == 0) {
                                        AbstractC38046a.m121827v("Id3Decoder", "Failed to decode frame: id=" + m48116r0(i18, r18, iM48119u0, i16, i17) + ", frameSize=" + i15, e);
                                    }
                                    return r17;
                                }
                                c17033b = m48105g0(iM48119u0, c38059n);
                                int i28 = iM48119u0;
                                iM48119u0 = i15;
                                i15 = i28;
                                r19 = r10;
                                i16 = iM121867t3;
                                i17 = iM121867t4;
                                r10 = c38059n;
                            } catch (Exception e16) {
                                e = e16;
                                int i29 = iM48119u0;
                                iM48119u0 = i15;
                                i15 = i29;
                                r14 = r10;
                                i16 = iM121867t3;
                                i17 = iM121867t4;
                                r15 = c38059n;
                                r15.m121846F(i19);
                                r17 = th3;
                                r18 = r14;
                                if (r17 == 0) {
                                    AbstractC38046a.m121827v("Id3Decoder", "Failed to decode frame: id=" + m48116r0(i18, r18, iM48119u0, i16, i17) + ", frameSize=" + i15, e);
                                }
                                return r17;
                            } catch (OutOfMemoryError e17) {
                                e = e17;
                                int i210 = iM48119u0;
                                iM48119u0 = i15;
                                i15 = i210;
                                r14 = r10;
                                i16 = iM121867t3;
                                i17 = iM121867t4;
                                r15 = c38059n;
                                r15.m121846F(i19);
                                r17 = th3;
                                r18 = r14;
                                if (r17 == 0) {
                                    AbstractC38046a.m121827v("Id3Decoder", "Failed to decode frame: id=" + m48116r0(i18, r18, iM48119u0, i16, i17) + ", frameSize=" + i15, e);
                                }
                                return r17;
                            }
                        }
                        r10.m121846F(i19);
                        r17 = c17033b;
                        e = th3;
                        r18 = r19;
                        if (r17 == 0) {
                            AbstractC38046a.m121827v("Id3Decoder", "Failed to decode frame: id=" + m48116r0(i18, r18, iM48119u0, i16, i17) + ", frameSize=" + i15, e);
                        }
                        return r17;
                    }
                    c17033b = m48112n0(iM48119u0, m48116r0(i18, r10, i15, iM121867t3, iM121867t4), c38059n);
                }
                int i34 = iM48119u0;
                iM48119u0 = i15;
                i15 = i34;
                r19 = r10;
                i16 = iM121867t3;
                i17 = iM121867t4;
                r10 = c38059n;
                th3 = null;
                r10.m121846F(i19);
                r17 = c17033b;
                e = th3;
                r18 = r19;
            } catch (Throwable th6) {
                th = th6;
                r16 = c38059n;
            }
        } catch (Exception e18) {
            e = e18;
            int i35 = iM48119u0;
            iM48119u0 = i15;
            i15 = i35;
            r14 = r10;
            i16 = iM121867t3;
            i17 = iM121867t4;
            r15 = c38059n;
            th3 = null;
            r15.m121846F(i19);
            r17 = th3;
            r18 = r14;
            if (r17 == 0) {
                AbstractC38046a.m121827v("Id3Decoder", "Failed to decode frame: id=" + m48116r0(i18, r18, iM48119u0, i16, i17) + ", frameSize=" + i15, e);
            }
            return r17;
        } catch (OutOfMemoryError e19) {
            e = e19;
            int i36 = iM48119u0;
            iM48119u0 = i15;
            i15 = i36;
            r14 = r10;
            i16 = iM121867t3;
            i17 = iM121867t4;
            r15 = c38059n;
            th3 = null;
            r15.m121846F(i19);
            r17 = th3;
            r18 = r14;
            if (r17 == 0) {
                AbstractC38046a.m121827v("Id3Decoder", "Failed to decode frame: id=" + m48116r0(i18, r18, iM48119u0, i16, i17) + ", frameSize=" + i15, e);
            }
            return r17;
        }
        if (r17 == 0) {
            AbstractC38046a.m121827v("Id3Decoder", "Failed to decode frame: id=" + m48116r0(i18, r18, iM48119u0, i16, i17) + ", frameSize=" + i15, e);
        }
        return r17;
    }

    /* JADX INFO: renamed from: g0 */
    public static C17037f m48105g0(int i13, C38059n c38059n) {
        int iM121867t = c38059n.m121867t();
        Charset charsetM48115q0 = m48115q0(iM121867t);
        int i14 = i13 - 1;
        byte[] bArr = new byte[i14];
        c38059n.m121852e(bArr, 0, i14);
        int iM48118t0 = m48118t0(0, bArr);
        String strM109382o = AbstractC34587d0.m109382o(new String(bArr, 0, iM48118t0, StandardCharsets.ISO_8859_1));
        int i15 = iM48118t0 + 1;
        int iM48117s0 = m48117s0(bArr, i15, iM121867t);
        String strM48108j0 = m48108j0(bArr, i15, iM48117s0, charsetM48115q0);
        int iM48114p0 = m48114p0(iM121867t) + iM48117s0;
        int iM48117s1 = m48117s0(bArr, iM48114p0, iM121867t);
        String strM48108j1 = m48108j0(bArr, iM48114p0, iM48117s1, charsetM48115q0);
        int iM48114p1 = m48114p0(iM121867t) + iM48117s1;
        return new C17037f(strM109382o, strM48108j0, strM48108j1, i14 <= iM48114p1 ? AbstractC38065t.f163033c : Arrays.copyOfRange(bArr, iM48114p1, i14));
    }

    /* JADX INFO: renamed from: h0 */
    public static C17044m m48106h0(int i13, C38059n c38059n) {
        int iM121873z = c38059n.m121873z();
        int iM121870w = c38059n.m121870w();
        int iM121870w2 = c38059n.m121870w();
        int iM121867t = c38059n.m121867t();
        int iM121867t2 = c38059n.m121867t();
        C24561s c24561s = new C24561s(5);
        c24561s.m71639p(c38059n);
        int i14 = ((i13 - 10) * 8) / (iM121867t + iM121867t2);
        int[] iArr = new int[i14];
        int[] iArr2 = new int[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            int iM71632i = c24561s.m71632i(iM121867t);
            int iM71632i2 = c24561s.m71632i(iM121867t2);
            iArr[i15] = iM71632i;
            iArr2[i15] = iM71632i2;
        }
        return new C17044m(iM121873z, iM121870w, iArr, iArr2, iM121870w2);
    }

    /* JADX INFO: renamed from: i0 */
    public static C17045n m48107i0(int i13, C38059n c38059n) {
        byte[] bArr = new byte[i13];
        c38059n.m121852e(bArr, 0, i13);
        int iM48118t0 = m48118t0(0, bArr);
        String str = new String(bArr, 0, iM48118t0, StandardCharsets.ISO_8859_1);
        int i14 = iM48118t0 + 1;
        return new C17045n(str, i13 <= i14 ? AbstractC38065t.f163033c : Arrays.copyOfRange(bArr, i14, i13));
    }

    /* JADX INFO: renamed from: j0 */
    public static String m48108j0(byte[] bArr, int i13, int i14, Charset charset) {
        return (i14 <= i13 || i14 > bArr.length) ? "" : new String(bArr, i13, i14 - i13, charset);
    }

    /* JADX INFO: renamed from: k0 */
    public static C17046o m48109k0(int i13, String str, C38059n c38059n) {
        if (i13 < 1) {
            return null;
        }
        int iM121867t = c38059n.m121867t();
        int i14 = i13 - 1;
        byte[] bArr = new byte[i14];
        c38059n.m121852e(bArr, 0, i14);
        return new C17046o(str, null, m48110l0(bArr, iM121867t, 0));
    }

    /* JADX INFO: renamed from: l0 */
    public static C41060w0 m48110l0(byte[] bArr, int i13, int i14) {
        if (i14 >= bArr.length) {
            return AbstractC41023g0.m133256r("");
        }
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        int iM48117s0 = m48117s0(bArr, i14, i13);
        while (i14 < iM48117s0) {
            c41014d0M133251l.m133222a(new String(bArr, i14, iM48117s0 - i14, m48115q0(i13)));
            i14 = m48114p0(i13) + iM48117s0;
            iM48117s0 = m48117s0(bArr, i14, i13);
        }
        C41060w0 c41060w0M133239f = c41014d0M133251l.m133239f();
        return c41060w0M133239f.isEmpty() ? AbstractC41023g0.m133256r("") : c41060w0M133239f;
    }

    /* JADX INFO: renamed from: m0 */
    public static C17046o m48111m0(int i13, C38059n c38059n) {
        if (i13 < 1) {
            return null;
        }
        int iM121867t = c38059n.m121867t();
        int i14 = i13 - 1;
        byte[] bArr = new byte[i14];
        c38059n.m121852e(bArr, 0, i14);
        int iM48117s0 = m48117s0(bArr, 0, iM121867t);
        return new C17046o("TXXX", new String(bArr, 0, iM48117s0, m48115q0(iM121867t)), m48110l0(bArr, iM121867t, m48114p0(iM121867t) + iM48117s0));
    }

    /* JADX INFO: renamed from: n0 */
    public static C17047p m48112n0(int i13, String str, C38059n c38059n) {
        byte[] bArr = new byte[i13];
        c38059n.m121852e(bArr, 0, i13);
        return new C17047p(str, null, new String(bArr, 0, m48118t0(0, bArr), StandardCharsets.ISO_8859_1));
    }

    /* JADX INFO: renamed from: o0 */
    public static C17047p m48113o0(int i13, C38059n c38059n) {
        if (i13 < 1) {
            return null;
        }
        int iM121867t = c38059n.m121867t();
        int i14 = i13 - 1;
        byte[] bArr = new byte[i14];
        c38059n.m121852e(bArr, 0, i14);
        int iM48117s0 = m48117s0(bArr, 0, iM121867t);
        String str = new String(bArr, 0, iM48117s0, m48115q0(iM121867t));
        int iM48114p0 = m48114p0(iM121867t) + iM48117s0;
        return new C17047p("WXXX", str, m48108j0(bArr, iM48114p0, m48118t0(iM48114p0, bArr), StandardCharsets.ISO_8859_1));
    }

    /* JADX INFO: renamed from: p0 */
    public static int m48114p0(int i13) {
        return (i13 == 0 || i13 == 3) ? 1 : 2;
    }

    /* JADX INFO: renamed from: q0 */
    public static Charset m48115q0(int i13) {
        if (i13 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i13 != 2) {
            return i13 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    /* JADX INFO: renamed from: r0 */
    public static String m48116r0(int i13, int i14, int i15, int i16, int i17) {
        return i13 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17));
    }

    /* JADX INFO: renamed from: s0 */
    public static int m48117s0(byte[] bArr, int i13, int i14) {
        int iM48118t0 = m48118t0(i13, bArr);
        if (i14 == 0 || i14 == 3) {
            return iM48118t0;
        }
        while (iM48118t0 < bArr.length - 1) {
            if ((iM48118t0 - i13) % 2 == 0 && bArr[iM48118t0 + 1] == 0) {
                return iM48118t0;
            }
            iM48118t0 = m48118t0(iM48118t0 + 1, bArr);
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: t0 */
    public static int m48118t0(int i13, byte[] bArr) {
        while (i13 < bArr.length) {
            if (bArr[i13] == 0) {
                return i13;
            }
            i13++;
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: u0 */
    public static int m48119u0(int i13, C38059n c38059n) {
        byte[] bArr = c38059n.f163017a;
        int i14 = c38059n.f163018b;
        int i15 = i14;
        while (true) {
            int i16 = i15 + 1;
            if (i16 >= i14 + i13) {
                return i13;
            }
            if ((bArr[i15] & 255) == 255 && bArr[i16] == 0) {
                System.arraycopy(bArr, i15 + 2, bArr, i16, (i13 - (i15 - i14)) - 2);
                i13--;
            }
            i15 = i16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
      0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: v0 */
    public static boolean m48120v0(C38059n c38059n, int i13, int i14, boolean z4) {
        int iM121870w;
        long jM121870w;
        int iM121873z;
        int i15;
        int i16 = c38059n.f163018b;
        while (true) {
            try {
                boolean z13 = true;
                if (c38059n.m121848a() < i14) {
                    c38059n.m121846F(i16);
                    return true;
                }
                if (i13 >= 3) {
                    iM121870w = c38059n.m121854g();
                    jM121870w = c38059n.m121869v();
                    iM121873z = c38059n.m121873z();
                } else {
                    iM121870w = c38059n.m121870w();
                    jM121870w = c38059n.m121870w();
                    iM121873z = 0;
                }
                if (iM121870w == 0 && jM121870w == 0 && iM121873z == 0) {
                    c38059n.m121846F(i16);
                    return true;
                }
                if (i13 == 4 && !z4) {
                    if ((8421504 & jM121870w) != 0) {
                        c38059n.m121846F(i16);
                        return false;
                    }
                    jM121870w = (((jM121870w >> 24) & 255) << 21) | (jM121870w & 255) | (((jM121870w >> 8) & 255) << 7) | (((jM121870w >> 16) & 255) << 14);
                }
                if (i13 == 4) {
                    i15 = (iM121873z & 64) != 0 ? 1 : 0;
                    if ((iM121873z & 1) == 0) {
                        z13 = false;
                    }
                } else if (i13 == 3) {
                    i15 = (iM121873z & 32) != 0 ? 1 : 0;
                    if ((iM121873z & 128) == 0) {
                        z13 = false;
                    }
                } else {
                    i15 = 0;
                    z13 = false;
                }
                if (z13) {
                    i15 += 4;
                }
                if (jM121870w < i15) {
                    c38059n.m121846F(i16);
                    return false;
                }
                if (c38059n.m121848a() < jM121870w) {
                    c38059n.m121846F(i16);
                    return false;
                }
                c38059n.m121847G((int) jM121870w);
            } catch (Throwable th3) {
                c38059n.m121846F(i16);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a0 */
    public final C34585c0 m48121a0(int i13, byte[] bArr) throws Throwable {
        boolean z4;
        C17039h c17039h;
        int i14;
        int i15;
        int iM48119u0;
        AbstractC17041j abstractC17041jM48104f0;
        ArrayList arrayList = new ArrayList();
        C38059n c38059n = new C38059n(bArr, i13);
        boolean z13 = false;
        if (c38059n.m121848a() < 10) {
            AbstractC38046a.m121826u("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iM121870w = c38059n.m121870w();
            if (iM121870w == 4801587) {
                int iM121867t = c38059n.m121867t();
                c38059n.m121847G(1);
                int iM121867t2 = c38059n.m121867t();
                int iM121866s = c38059n.m121866s();
                if (iM121867t != 2) {
                    if (iM121867t == 3) {
                        if ((iM121867t2 & 64) != 0) {
                            int iM121854g = c38059n.m121854g();
                            c38059n.m121847G(iM121854g);
                            iM121866s -= iM121854g + 4;
                        }
                    } else if (iM121867t == 4) {
                        if ((iM121867t2 & 64) != 0) {
                            int iM121866s2 = c38059n.m121866s();
                            c38059n.m121847G(iM121866s2 - 4);
                            iM121866s -= iM121866s2;
                        }
                        if ((iM121867t2 & 16) != 0) {
                            iM121866s -= 10;
                        }
                    } else {
                        AbstractC38963t7.m124388r(iM121867t, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    if (iM121867t < 4) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    c17039h = new C17039h(iM121867t, z4, iM121866s);
                } else if ((iM121867t2 & 64) != 0) {
                    AbstractC38046a.m121826u("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iM121867t < 4 || (iM121867t2 & 128) == 0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    c17039h = new C17039h(iM121867t, z4, iM121866s);
                }
                if (c17039h == null) {
                    return null;
                }
                i14 = c17039h.f65523a;
                int i16 = c38059n.f163018b;
                i15 = i14 == 2 ? 6 : 10;
                iM48119u0 = c17039h.f65525c;
                if (c17039h.f65524b) {
                    iM48119u0 = m48119u0(iM48119u0, c38059n);
                }
                c38059n.m121845E(i16 + iM48119u0);
                if (!m48120v0(c38059n, i14, i15, false)) {
                    if (i14 == 4 || !m48120v0(c38059n, 4, i15, true)) {
                        AbstractC38963t7.m124388r(i14, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z13 = true;
                }
                while (c38059n.m121848a() >= i15) {
                    abstractC17041jM48104f0 = m48104f0(i14, c38059n, z13, i15, this.f65527a);
                    if (abstractC17041jM48104f0 != null) {
                        arrayList.add(abstractC17041jM48104f0);
                    }
                }
                return new C34585c0(arrayList);
            }
            AbstractC38046a.m121826u("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iM121870w))));
        }
        c17039h = null;
        if (c17039h == null) {
            return null;
        }
        i14 = c17039h.f65523a;
        int i17 = c38059n.f163018b;
        if (i14 == 2) {
        }
        iM48119u0 = c17039h.f65525c;
        if (c17039h.f65524b) {
            iM48119u0 = m48119u0(iM48119u0, c38059n);
        }
        c38059n.m121845E(i17 + iM48119u0);
        if (!m48120v0(c38059n, i14, i15, false)) {
            if (i14 == 4) {
            }
            AbstractC38963t7.m124388r(i14, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
            return null;
        }
        while (c38059n.m121848a() >= i15) {
            abstractC17041jM48104f0 = m48104f0(i14, c38059n, z13, i15, this.f65527a);
            if (abstractC17041jM48104f0 != null) {
                arrayList.add(abstractC17041jM48104f0);
            }
        }
        return new C34585c0(arrayList);
    }

    @Override // p550vd.AbstractC35903f
    /* JADX INFO: renamed from: n */
    public final C34585c0 mo31690n(C4358a c4358a, ByteBuffer byteBuffer) {
        return m48121a0(byteBuffer.limit(), byteBuffer.array());
    }
}
