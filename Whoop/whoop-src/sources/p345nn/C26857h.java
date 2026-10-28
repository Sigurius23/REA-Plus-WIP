package p345nn;

import android.util.Log;
import ed3.C13117a;
import in.C18715c;
import in.C18717e;
import io.sentry.config.AbstractC20301a;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import live.hms.video.factories.C24148c;
import p188ha.C17039h;
import p309lo.AbstractC24567y;
import p309lo.C24561s;
import p460rg.AbstractC31375j;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: nn.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C26857h extends AbstractC20301a {

    /* JADX INFO: renamed from: c */
    public static final C24148c f107175c = new C24148c(19);

    /* JADX INFO: renamed from: b */
    public final InterfaceC26856g f107176b;

    public C26857h(InterfaceC26856g interfaceC26856g) {
        this.f107176b = interfaceC26856g;
    }

    /* JADX INFO: renamed from: g0 */
    public static C26850a m80160g0(C13117a c13117a, int i13, int i14) {
        int iM80177x0;
        String strM96499o;
        int iM36715y = c13117a.m36715y();
        String strM80174u0 = m80174u0(iM36715y);
        int i15 = i13 - 1;
        byte[] bArr = new byte[i15];
        c13117a.m36697g(bArr, 0, i15);
        if (i14 == 2) {
            String strValueOf = String.valueOf(AbstractC31375j.m96499o(new String(bArr, 0, 3, "ISO-8859-1")));
            strM96499o = strValueOf.length() != 0 ? "image/".concat(strValueOf) : new String("image/");
            if ("image/jpg".equals(strM96499o)) {
                strM96499o = "image/jpeg";
            }
            iM80177x0 = 2;
        } else {
            iM80177x0 = m80177x0(0, bArr);
            strM96499o = AbstractC31375j.m96499o(new String(bArr, 0, iM80177x0, "ISO-8859-1"));
            if (strM96499o.indexOf(47) == -1) {
                strM96499o = strM96499o.length() != 0 ? "image/".concat(strM96499o) : new String("image/");
            }
        }
        int i16 = bArr[iM80177x0 + 1] & 255;
        int i17 = iM80177x0 + 2;
        int iM80176w0 = m80176w0(bArr, i17, iM36715y);
        String str = new String(bArr, i17, iM80176w0 - i17, strM80174u0);
        int iM80173t0 = m80173t0(iM36715y) + iM80176w0;
        return new C26850a(strM96499o, str, i16, i15 <= iM80173t0 ? AbstractC24567y.f95880f : Arrays.copyOfRange(bArr, iM80173t0, i15));
    }

    /* JADX INFO: renamed from: h0 */
    public static C26852c m80161h0(C13117a c13117a, int i13, int i14, boolean z4, int i15, InterfaceC26856g interfaceC26856g) throws Throwable {
        int i16 = c13117a.f45382b;
        int iM80177x0 = m80177x0(i16, c13117a.f45381a);
        String str = new String(c13117a.f45381a, i16, iM80177x0 - i16, "ISO-8859-1");
        c13117a.m36689K(iM80177x0 + 1);
        int iM36699i = c13117a.m36699i();
        int iM36699i2 = c13117a.m36699i();
        long jM36716z = c13117a.m36716z();
        if (jM36716z == 4294967295L) {
            jM36716z = -1;
        }
        long jM36716z2 = c13117a.m36716z();
        long j7 = jM36716z2 == 4294967295L ? -1L : jM36716z2;
        ArrayList arrayList = new ArrayList();
        int i17 = i16 + i13;
        while (c13117a.f45382b < i17) {
            AbstractC26858i abstractC26858iM80164k0 = m80164k0(i14, c13117a, z4, i15, interfaceC26856g);
            if (abstractC26858iM80164k0 != null) {
                arrayList.add(abstractC26858iM80164k0);
            }
        }
        return new C26852c(str, iM36699i, iM36699i2, jM36716z, j7, (AbstractC26858i[]) arrayList.toArray(new AbstractC26858i[0]));
    }

    /* JADX INFO: renamed from: i0 */
    public static C26853d m80162i0(C13117a c13117a, int i13, int i14, boolean z4, int i15, InterfaceC26856g interfaceC26856g) throws Throwable {
        int i16 = c13117a.f45382b;
        int iM80177x0 = m80177x0(i16, c13117a.f45381a);
        String str = new String(c13117a.f45381a, i16, iM80177x0 - i16, "ISO-8859-1");
        c13117a.m36689K(iM80177x0 + 1);
        int iM36715y = c13117a.m36715y();
        boolean z13 = (iM36715y & 2) != 0;
        boolean z14 = (iM36715y & 1) != 0;
        int iM36715y2 = c13117a.m36715y();
        String[] strArr = new String[iM36715y2];
        for (int i17 = 0; i17 < iM36715y2; i17++) {
            int i18 = c13117a.f45382b;
            int iM80177x1 = m80177x0(i18, c13117a.f45381a);
            strArr[i17] = new String(c13117a.f45381a, i18, iM80177x1 - i18, "ISO-8859-1");
            c13117a.m36689K(iM80177x1 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i19 = i16 + i13;
        while (c13117a.f45382b < i19) {
            AbstractC26858i abstractC26858iM80164k0 = m80164k0(i14, c13117a, z4, i15, interfaceC26856g);
            if (abstractC26858iM80164k0 != null) {
                arrayList.add(abstractC26858iM80164k0);
            }
        }
        return new C26853d(str, z13, z14, strArr, (AbstractC26858i[]) arrayList.toArray(new AbstractC26858i[0]));
    }

    /* JADX INFO: renamed from: j0 */
    public static C26854e m80163j0(int i13, C13117a c13117a) {
        if (i13 < 4) {
            return null;
        }
        int iM36715y = c13117a.m36715y();
        String strM80174u0 = m80174u0(iM36715y);
        byte[] bArr = new byte[3];
        c13117a.m36697g(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i14 = i13 - 4;
        byte[] bArr2 = new byte[i14];
        c13117a.m36697g(bArr2, 0, i14);
        int iM80176w0 = m80176w0(bArr2, 0, iM36715y);
        String str2 = new String(bArr2, 0, iM80176w0, strM80174u0);
        int iM80173t0 = m80173t0(iM36715y) + iM80176w0;
        return new C26854e(str, str2, m80168o0(strM80174u0, bArr2, iM80173t0, m80176w0(bArr2, iM80173t0, iM36715y)));
    }

    /* JADX WARN: Code duplicated, block: B:137:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:156:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:165:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:167:0x0201  */
    /* JADX WARN: Code duplicated, block: B:172:0x020e A[Catch: all -> 0x01f9, UnsupportedEncodingException -> 0x024a, TryCatch #5 {all -> 0x01f9, blocks: (B:174:0x0220, B:177:0x024a, B:162:0x01f4, B:171:0x0209, B:172:0x020e), top: B:185:0x0109 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0220 A[Catch: all -> 0x01f9, UnsupportedEncodingException -> 0x024a, TRY_LEAVE, TryCatch #5 {all -> 0x01f9, blocks: (B:174:0x0220, B:177:0x024a, B:162:0x01f4, B:171:0x0209, B:172:0x020e), top: B:185:0x0109 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9, types: [nn.i] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [ed3.a] */
    /* JADX WARN: Type inference failed for: r1v12, types: [ed3.a] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [ed3.a] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [int] */
    /* JADX INFO: renamed from: k0 */
    public static AbstractC26858i m80164k0(int i13, C13117a c13117a, boolean z4, int i14, InterfaceC26856g interfaceC26856g) throws Throwable {
        int iM36680B;
        ?? r10;
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r16;
        boolean z16;
        ?? r14;
        int i15;
        int i16;
        ?? r15;
        int i17;
        C13117a c13117a2;
        AbstractC26858i c26851b;
        ?? r17;
        int i18 = i13;
        int iM36715y = c13117a.m36715y();
        int iM36715y2 = c13117a.m36715y();
        int iM36715y3 = c13117a.m36715y();
        int iM36715y4 = i18 >= 3 ? c13117a.m36715y() : 0;
        if (i18 == 4) {
            iM36680B = c13117a.m36680B();
            if (!z4) {
                iM36680B = (((iM36680B >> 24) & 255) << 21) | (iM36680B & 255) | (((iM36680B >> 8) & 255) << 7) | (((iM36680B >> 16) & 255) << 14);
            }
        } else {
            iM36680B = i18 == 3 ? c13117a.m36680B() : c13117a.m36679A();
        }
        int iM80178y0 = iM36680B;
        int iM36682D = i18 >= 3 ? c13117a.m36682D() : 0;
        if (iM36715y == 0 && iM36715y2 == 0 && iM36715y3 == 0 && iM36715y4 == 0 && iM80178y0 == 0 && iM36682D == 0) {
            c13117a.m36689K(c13117a.f45383c);
            return null;
        }
        int i19 = c13117a.f45382b + iM80178y0;
        if (i19 > c13117a.f45383c) {
            Log.w("Id3Decoder", "Frame size exceeds remaining tag data");
            c13117a.m36689K(c13117a.f45383c);
            return null;
        }
        if (interfaceC26856g != null) {
            r10 = iM36715y2;
            if (!interfaceC26856g.mo13596a(i18, iM36715y, iM36715y2, iM36715y3, iM36715y4)) {
                i18 = i18;
                c13117a.m36689K(i19);
                return null;
            }
        } else {
            r10 = iM36715y2;
        }
        i18 = i18;
        if (i18 == 3) {
            z13 = (iM36682D & 128) != 0;
            r16 = (iM36682D & 64) != 0;
            z16 = false;
            z15 = (iM36682D & 32) != 0;
            z14 = z13;
        } else if (i18 == 4) {
            boolean z17 = (iM36682D & 64) != 0;
            boolean z18 = (iM36682D & 8) != 0;
            boolean z19 = (iM36682D & 4) != 0;
            z16 = (iM36682D & 2) != 0;
            z14 = (iM36682D & 1) != 0;
            boolean z24 = z18;
            z15 = z17;
            z13 = z24;
            r16 = z19;
        } else {
            z13 = false;
            z14 = false;
            z15 = false;
            r16 = 0;
            z16 = false;
        }
        if (z13 || r16 != 0) {
            Log.w("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            c13117a.m36689K(i19);
            return null;
        }
        if (z15) {
            iM80178y0--;
            c13117a.m36690L(1);
        }
        if (z14) {
            iM80178y0 -= 4;
            c13117a.m36690L(4);
        }
        if (z16) {
            iM80178y0 = m80178y0(iM80178y0, c13117a);
        }
        try {
            try {
                try {
                    try {
                        if (iM36715y == 84 && r10 == 88 && iM36715y3 == 88 && (i18 == 2 || iM36715y4 == 88)) {
                            c26851b = m80170q0(iM80178y0, c13117a);
                        } else if (iM36715y == 84) {
                            c26851b = m80169p0(iM80178y0, c13117a, m80175v0(i18, iM36715y, r10, iM36715y3, iM36715y4));
                        } else if (iM36715y == 87 && r10 == 88 && iM36715y3 == 88 && (i18 == 2 || iM36715y4 == 88)) {
                            c26851b = m80172s0(iM80178y0, c13117a);
                        } else {
                            if (iM36715y != 87) {
                                if (iM36715y == 80 && r10 == 82 && iM36715y3 == 73 && iM36715y4 == 86) {
                                    c26851b = m80167n0(iM80178y0, c13117a);
                                } else {
                                    r16 = 0;
                                    try {
                                        if (iM36715y == 71 && r10 == 69 && iM36715y3 == 79 && (iM36715y4 == 66 || i18 == 2)) {
                                            c26851b = m80165l0(iM80178y0, c13117a);
                                        } else if (i18 == 2) {
                                            if (iM36715y == 80 && r10 == 73 && iM36715y3 == 67) {
                                                c26851b = m80160g0(c13117a, iM80178y0, i18);
                                            } else if (iM36715y != 67 && r10 == 79 && iM36715y3 == 77 && (iM36715y4 == 77 || i18 == 2)) {
                                                c26851b = m80163j0(iM80178y0, c13117a);
                                            } else if (iM36715y != 67 && r10 == 72 && iM36715y3 == 65 && iM36715y4 == 80) {
                                                int i24 = iM80178y0;
                                                i15 = iM36715y3;
                                                i16 = i24;
                                                r17 = r10;
                                                i17 = iM36715y4;
                                                try {
                                                    c26851b = m80161h0(c13117a, i16, i18, z4, i14, interfaceC26856g);
                                                    i18 = i13;
                                                    r10 = c13117a;
                                                    r16 = r16;
                                                } catch (UnsupportedEncodingException unused) {
                                                    r10 = c13117a;
                                                    Log.w("Id3Decoder", "Unsupported character encoding");
                                                    r10.m36689K(i19);
                                                    return r16;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    r14 = c13117a;
                                                    r14.m36689K(i19);
                                                    throw th;
                                                }
                                            } else {
                                                int i25 = iM80178y0;
                                                i15 = iM36715y3;
                                                i16 = i25;
                                                r15 = r10;
                                                i17 = iM36715y4;
                                                if (iM36715y != 67 && r15 == 84 && i15 == 79 && i17 == 67) {
                                                    i18 = i13;
                                                    C13117a c13117a3 = c13117a;
                                                    c26851b = m80162i0(c13117a3, i16, i18, z4, i14, interfaceC26856g);
                                                    r10 = c13117a3;
                                                    r17 = r15;
                                                    r16 = r16;
                                                } else {
                                                    i18 = i13;
                                                    c13117a2 = c13117a;
                                                    if (iM36715y != 77 && r15 == 76 && i15 == 76 && i17 == 84) {
                                                        c26851b = m80166m0(i16, c13117a2);
                                                    } else {
                                                        String strM80175v0 = m80175v0(i18, iM36715y, r15 == true ? 1 : 0, i15, i17);
                                                        byte[] bArr = new byte[i16];
                                                        c13117a2.m36697g(bArr, 0, i16);
                                                        c26851b = new C26851b(strM80175v0, bArr);
                                                        r10 = c13117a2;
                                                        r17 = r15;
                                                        r16 = r16;
                                                    }
                                                }
                                            }
                                        } else if (iM36715y == 65 && r10 == 80 && iM36715y3 == 73 && iM36715y4 == 67) {
                                            c26851b = m80160g0(c13117a, iM80178y0, i18);
                                        } else {
                                            if (iM36715y != 67) {
                                            }
                                            if (iM36715y != 67) {
                                                int i26 = iM80178y0;
                                                i15 = iM36715y3;
                                                i16 = i26;
                                                r15 = r10;
                                                i17 = iM36715y4;
                                                if (iM36715y != 67) {
                                                    i18 = i13;
                                                    c13117a2 = c13117a;
                                                    if (iM36715y != 77) {
                                                        String strM80175v1 = m80175v0(i18, iM36715y, r15 == true ? 1 : 0, i15, i17);
                                                        byte[] bArr2 = new byte[i16];
                                                        c13117a2.m36697g(bArr2, 0, i16);
                                                        c26851b = new C26851b(strM80175v1, bArr2);
                                                        r10 = c13117a2;
                                                        r17 = r15;
                                                        r16 = r16;
                                                    } else {
                                                        String strM80175v2 = m80175v0(i18, iM36715y, r15 == true ? 1 : 0, i15, i17);
                                                        byte[] bArr3 = new byte[i16];
                                                        c13117a2.m36697g(bArr3, 0, i16);
                                                        c26851b = new C26851b(strM80175v2, bArr3);
                                                        r10 = c13117a2;
                                                        r17 = r15;
                                                        r16 = r16;
                                                    }
                                                } else {
                                                    i18 = i13;
                                                    c13117a2 = c13117a;
                                                    if (iM36715y != 77) {
                                                        String strM80175v3 = m80175v0(i18, iM36715y, r15 == true ? 1 : 0, i15, i17);
                                                        byte[] bArr4 = new byte[i16];
                                                        c13117a2.m36697g(bArr4, 0, i16);
                                                        c26851b = new C26851b(strM80175v3, bArr4);
                                                        r10 = c13117a2;
                                                        r17 = r15;
                                                        r16 = r16;
                                                    } else {
                                                        String strM80175v4 = m80175v0(i18, iM36715y, r15 == true ? 1 : 0, i15, i17);
                                                        byte[] bArr5 = new byte[i16];
                                                        c13117a2.m36697g(bArr5, 0, i16);
                                                        c26851b = new C26851b(strM80175v4, bArr5);
                                                        r10 = c13117a2;
                                                        r17 = r15;
                                                        r16 = r16;
                                                    }
                                                }
                                            } else {
                                                int i27 = iM80178y0;
                                                i15 = iM36715y3;
                                                i16 = i27;
                                                r15 = r10;
                                                i17 = iM36715y4;
                                                if (iM36715y != 67) {
                                                    i18 = i13;
                                                    c13117a2 = c13117a;
                                                    if (iM36715y != 77) {
                                                        String strM80175v5 = m80175v0(i18, iM36715y, r15 == true ? 1 : 0, i15, i17);
                                                        byte[] bArr6 = new byte[i16];
                                                        c13117a2.m36697g(bArr6, 0, i16);
                                                        c26851b = new C26851b(strM80175v5, bArr6);
                                                        r10 = c13117a2;
                                                        r17 = r15;
                                                        r16 = r16;
                                                    } else {
                                                        String strM80175v6 = m80175v0(i18, iM36715y, r15 == true ? 1 : 0, i15, i17);
                                                        byte[] bArr7 = new byte[i16];
                                                        c13117a2.m36697g(bArr7, 0, i16);
                                                        c26851b = new C26851b(strM80175v6, bArr7);
                                                        r10 = c13117a2;
                                                        r17 = r15;
                                                        r16 = r16;
                                                    }
                                                } else {
                                                    i18 = i13;
                                                    c13117a2 = c13117a;
                                                    if (iM36715y != 77) {
                                                        String strM80175v7 = m80175v0(i18, iM36715y, r15 == true ? 1 : 0, i15, i17);
                                                        byte[] bArr8 = new byte[i16];
                                                        c13117a2.m36697g(bArr8, 0, i16);
                                                        c26851b = new C26851b(strM80175v7, bArr8);
                                                        r10 = c13117a2;
                                                        r17 = r15;
                                                        r16 = r16;
                                                    } else {
                                                        String strM80175v8 = m80175v0(i18, iM36715y, r15 == true ? 1 : 0, i15, i17);
                                                        byte[] bArr9 = new byte[i16];
                                                        c13117a2.m36697g(bArr9, 0, i16);
                                                        c26851b = new C26851b(strM80175v8, bArr9);
                                                        r10 = c13117a2;
                                                        r17 = r15;
                                                        r16 = r16;
                                                    }
                                                }
                                            }
                                        }
                                        int i28 = iM80178y0;
                                        i15 = iM36715y3;
                                        i16 = i28;
                                        r17 = r10;
                                        i17 = iM36715y4;
                                        r10 = c13117a;
                                        r16 = r16;
                                    } catch (UnsupportedEncodingException unused2) {
                                        r10 = c13117a;
                                    }
                                }
                                if (c26851b == null) {
                                    r10 = c13117a2;
                                    r17 = r15;
                                    r16 = r16;
                                    String strM80175v9 = m80175v0(i18, iM36715y, r17, i15, i17);
                                    StringBuilder sb4 = new StringBuilder(strM80175v9.length() + 50);
                                    sb4.append("Failed to decode frame: id=");
                                    sb4.append(strM80175v9);
                                    sb4.append(", frameSize=");
                                    sb4.append(i16);
                                    Log.w("Id3Decoder", sb4.toString());
                                }
                                r10 = c13117a2;
                                r17 = r15;
                                r16 = r16;
                                r10.m36689K(i19);
                                return c26851b;
                            }
                            c26851b = m80171r0(iM80178y0, c13117a, m80175v0(i18, iM36715y, r10, iM36715y3, iM36715y4));
                        }
                        int i29 = iM80178y0;
                        i15 = iM36715y3;
                        i16 = i29;
                        r17 = r10;
                        i17 = iM36715y4;
                        r10 = c13117a;
                        r16 = 0;
                        if (c26851b == null) {
                            r10 = c13117a2;
                            r17 = r15;
                            r16 = r16;
                            String strM80175v10 = m80175v0(i18, iM36715y, r17, i15, i17);
                            StringBuilder sb5 = new StringBuilder(strM80175v10.length() + 50);
                            sb5.append("Failed to decode frame: id=");
                            sb5.append(strM80175v10);
                            sb5.append(", frameSize=");
                            sb5.append(i16);
                            Log.w("Id3Decoder", sb5.toString());
                        }
                        r10 = c13117a2;
                        r17 = r15;
                        r16 = r16;
                        r10.m36689K(i19);
                        return c26851b;
                    } catch (Throwable th4) {
                        th = th4;
                        r14 = c13117a;
                    }
                } catch (UnsupportedEncodingException unused3) {
                    r10 = c13117a;
                    r16 = 0;
                }
            } catch (Throwable th5) {
                th = th5;
                r14 = r10;
            }
        } catch (UnsupportedEncodingException unused4) {
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static C26855f m80165l0(int i13, C13117a c13117a) {
        int iM36715y = c13117a.m36715y();
        String strM80174u0 = m80174u0(iM36715y);
        int i14 = i13 - 1;
        byte[] bArr = new byte[i14];
        c13117a.m36697g(bArr, 0, i14);
        int iM80177x0 = m80177x0(0, bArr);
        String str = new String(bArr, 0, iM80177x0, "ISO-8859-1");
        int i15 = iM80177x0 + 1;
        int iM80176w0 = m80176w0(bArr, i15, iM36715y);
        String strM80168o0 = m80168o0(strM80174u0, bArr, i15, iM80176w0);
        int iM80173t0 = m80173t0(iM36715y) + iM80176w0;
        int iM80176w1 = m80176w0(bArr, iM80173t0, iM36715y);
        String strM80168o1 = m80168o0(strM80174u0, bArr, iM80173t0, iM80176w1);
        int iM80173t1 = m80173t0(iM36715y) + iM80176w1;
        return new C26855f(str, strM80168o0, strM80168o1, i14 <= iM80173t1 ? AbstractC24567y.f95880f : Arrays.copyOfRange(bArr, iM80173t1, i14));
    }

    /* JADX INFO: renamed from: m0 */
    public static C26860k m80166m0(int i13, C13117a c13117a) {
        int iM36682D = c13117a.m36682D();
        int iM36679A = c13117a.m36679A();
        int iM36679A2 = c13117a.m36679A();
        int iM36715y = c13117a.m36715y();
        int iM36715y2 = c13117a.m36715y();
        C24561s c24561s = new C24561s(0);
        c24561s.m71638o(c13117a.f45383c, c13117a.f45381a);
        c24561s.m71640q(c13117a.f45382b * 8);
        int i14 = ((i13 - 10) * 8) / (iM36715y + iM36715y2);
        int[] iArr = new int[i14];
        int[] iArr2 = new int[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            int iM71632i = c24561s.m71632i(iM36715y);
            int iM71632i2 = c24561s.m71632i(iM36715y2);
            iArr[i15] = iM71632i;
            iArr2[i15] = iM71632i2;
        }
        return new C26860k(iM36682D, iM36679A, iArr, iArr2, iM36679A2);
    }

    /* JADX INFO: renamed from: n0 */
    public static C26861l m80167n0(int i13, C13117a c13117a) {
        byte[] bArr = new byte[i13];
        c13117a.m36697g(bArr, 0, i13);
        int iM80177x0 = m80177x0(0, bArr);
        String str = new String(bArr, 0, iM80177x0, "ISO-8859-1");
        int i14 = iM80177x0 + 1;
        return new C26861l(str, i13 <= i14 ? AbstractC24567y.f95880f : Arrays.copyOfRange(bArr, i14, i13));
    }

    /* JADX INFO: renamed from: o0 */
    public static String m80168o0(String str, byte[] bArr, int i13, int i14) {
        return (i14 <= i13 || i14 > bArr.length) ? "" : new String(bArr, i13, i14 - i13, str);
    }

    /* JADX INFO: renamed from: p0 */
    public static C26862m m80169p0(int i13, C13117a c13117a, String str) {
        if (i13 < 1) {
            return null;
        }
        int iM36715y = c13117a.m36715y();
        String strM80174u0 = m80174u0(iM36715y);
        int i14 = i13 - 1;
        byte[] bArr = new byte[i14];
        c13117a.m36697g(bArr, 0, i14);
        return new C26862m(str, null, new String(bArr, 0, m80176w0(bArr, 0, iM36715y), strM80174u0));
    }

    /* JADX INFO: renamed from: q0 */
    public static C26862m m80170q0(int i13, C13117a c13117a) {
        if (i13 < 1) {
            return null;
        }
        int iM36715y = c13117a.m36715y();
        String strM80174u0 = m80174u0(iM36715y);
        int i14 = i13 - 1;
        byte[] bArr = new byte[i14];
        c13117a.m36697g(bArr, 0, i14);
        int iM80176w0 = m80176w0(bArr, 0, iM36715y);
        String str = new String(bArr, 0, iM80176w0, strM80174u0);
        int iM80173t0 = m80173t0(iM36715y) + iM80176w0;
        return new C26862m("TXXX", str, m80168o0(strM80174u0, bArr, iM80173t0, m80176w0(bArr, iM80173t0, iM36715y)));
    }

    /* JADX INFO: renamed from: r0 */
    public static C26863n m80171r0(int i13, C13117a c13117a, String str) {
        byte[] bArr = new byte[i13];
        c13117a.m36697g(bArr, 0, i13);
        return new C26863n(str, null, new String(bArr, 0, m80177x0(0, bArr), "ISO-8859-1"));
    }

    /* JADX INFO: renamed from: s0 */
    public static C26863n m80172s0(int i13, C13117a c13117a) {
        if (i13 < 1) {
            return null;
        }
        int iM36715y = c13117a.m36715y();
        String strM80174u0 = m80174u0(iM36715y);
        int i14 = i13 - 1;
        byte[] bArr = new byte[i14];
        c13117a.m36697g(bArr, 0, i14);
        int iM80176w0 = m80176w0(bArr, 0, iM36715y);
        String str = new String(bArr, 0, iM80176w0, strM80174u0);
        int iM80173t0 = m80173t0(iM36715y) + iM80176w0;
        return new C26863n("WXXX", str, m80168o0("ISO-8859-1", bArr, iM80173t0, m80177x0(iM80173t0, bArr)));
    }

    /* JADX INFO: renamed from: t0 */
    public static int m80173t0(int i13) {
        return (i13 == 0 || i13 == 3) ? 1 : 2;
    }

    /* JADX INFO: renamed from: u0 */
    public static String m80174u0(int i13) {
        if (i13 == 1) {
            return "UTF-16";
        }
        if (i13 != 2) {
            return i13 != 3 ? "ISO-8859-1" : "UTF-8";
        }
        return "UTF-16BE";
    }

    /* JADX INFO: renamed from: v0 */
    public static String m80175v0(int i13, int i14, int i15, int i16, int i17) {
        return i13 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17));
    }

    /* JADX INFO: renamed from: w0 */
    public static int m80176w0(byte[] bArr, int i13, int i14) {
        int iM80177x0 = m80177x0(i13, bArr);
        if (i14 == 0 || i14 == 3) {
            return iM80177x0;
        }
        while (iM80177x0 < bArr.length - 1) {
            if ((iM80177x0 - i13) % 2 == 0 && bArr[iM80177x0 + 1] == 0) {
                return iM80177x0;
            }
            iM80177x0 = m80177x0(iM80177x0 + 1, bArr);
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: x0 */
    public static int m80177x0(int i13, byte[] bArr) {
        while (i13 < bArr.length) {
            if (bArr[i13] == 0) {
                return i13;
            }
            i13++;
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: y0 */
    public static int m80178y0(int i13, C13117a c13117a) {
        byte[] bArr = c13117a.f45381a;
        int i14 = c13117a.f45382b;
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
    /* JADX INFO: renamed from: z0 */
    public static boolean m80179z0(C13117a c13117a, int i13, int i14, boolean z4) {
        int iM36679A;
        long jM36679A;
        int iM36682D;
        int i15;
        int i16 = c13117a.f45382b;
        while (true) {
            try {
                boolean z13 = true;
                if (c13117a.m36692a() < i14) {
                    c13117a.m36689K(i16);
                    return true;
                }
                if (i13 >= 3) {
                    iM36679A = c13117a.m36699i();
                    jM36679A = c13117a.m36716z();
                    iM36682D = c13117a.m36682D();
                } else {
                    iM36679A = c13117a.m36679A();
                    jM36679A = c13117a.m36679A();
                    iM36682D = 0;
                }
                if (iM36679A == 0 && jM36679A == 0 && iM36682D == 0) {
                    c13117a.m36689K(i16);
                    return true;
                }
                if (i13 == 4 && !z4) {
                    if ((8421504 & jM36679A) != 0) {
                        c13117a.m36689K(i16);
                        return false;
                    }
                    jM36679A = (((jM36679A >> 24) & 255) << 21) | (jM36679A & 255) | (((jM36679A >> 8) & 255) << 7) | (((jM36679A >> 16) & 255) << 14);
                }
                if (i13 == 4) {
                    i15 = (iM36682D & 64) != 0 ? 1 : 0;
                    if ((iM36682D & 1) == 0) {
                        z13 = false;
                    }
                } else if (i13 == 3) {
                    i15 = (iM36682D & 32) != 0 ? 1 : 0;
                    if ((iM36682D & 128) == 0) {
                        z13 = false;
                    }
                } else {
                    i15 = 0;
                    z13 = false;
                }
                if (z13) {
                    i15 += 4;
                }
                if (jM36679A < i15) {
                    c13117a.m36689K(i16);
                    return false;
                }
                if (c13117a.m36692a() < jM36679A) {
                    c13117a.m36689K(i16);
                    return false;
                }
                c13117a.m36690L((int) jM36679A);
            } catch (Throwable th3) {
                c13117a.m36689K(i16);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00da A[SYNTHETIC] */
    /* JADX INFO: renamed from: f0 */
    public final C18715c m80180f0(int i13, byte[] bArr) {
        boolean z4;
        C17039h c17039h;
        int i14;
        int i15;
        int iM80178y0;
        AbstractC26858i abstractC26858iM80164k0;
        ArrayList arrayList = new ArrayList();
        C13117a c13117a = new C13117a(bArr, i13, 1, false);
        boolean z13 = false;
        if (c13117a.m36692a() < 10) {
            Log.w("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iM36679A = c13117a.m36679A();
            if (iM36679A == 4801587) {
                int iM36715y = c13117a.m36715y();
                c13117a.m36690L(1);
                int iM36715y2 = c13117a.m36715y();
                int iM36713w = c13117a.m36713w();
                if (iM36715y != 2) {
                    if (iM36715y == 3) {
                        if ((iM36715y2 & 64) != 0) {
                            int iM36699i = c13117a.m36699i();
                            c13117a.m36690L(iM36699i);
                            iM36713w -= iM36699i + 4;
                        }
                    } else if (iM36715y == 4) {
                        if ((iM36715y2 & 64) != 0) {
                            int iM36713w2 = c13117a.m36713w();
                            c13117a.m36690L(iM36713w2 - 4);
                            iM36713w -= iM36713w2;
                        }
                        if ((iM36715y2 & 16) != 0) {
                            iM36713w -= 10;
                        }
                    } else {
                        AbstractC30007c.m91850t(57, iM36715y, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    if (iM36715y < 4) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    c17039h = new C17039h(iM36715y, z4, iM36713w);
                } else if ((iM36715y2 & 64) != 0) {
                    Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iM36715y < 4 || (iM36715y2 & 128) == 0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    c17039h = new C17039h(iM36715y, z4, iM36713w);
                }
                if (c17039h == null) {
                    return null;
                }
                i14 = c17039h.f65523a;
                int i16 = c13117a.f45382b;
                i15 = i14 == 2 ? 6 : 10;
                iM80178y0 = c17039h.f65525c;
                if (c17039h.f65524b) {
                    iM80178y0 = m80178y0(iM80178y0, c13117a);
                }
                c13117a.m36688J(i16 + iM80178y0);
                if (!m80179z0(c13117a, i14, i15, false)) {
                    if (i14 == 4 || !m80179z0(c13117a, 4, i15, true)) {
                        AbstractC30007c.m91850t(56, i14, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z13 = true;
                }
                while (c13117a.m36692a() >= i15) {
                    abstractC26858iM80164k0 = m80164k0(i14, c13117a, z13, i15, this.f107176b);
                    if (abstractC26858iM80164k0 != null) {
                        arrayList.add(abstractC26858iM80164k0);
                    }
                }
                return new C18715c(arrayList);
            }
            String str = String.format("%06X", Integer.valueOf(iM36679A));
            Log.w("Id3Decoder", str.length() != 0 ? "Unexpected first three bytes of ID3 tag header: 0x".concat(str) : new String("Unexpected first three bytes of ID3 tag header: 0x"));
        }
        c17039h = null;
        if (c17039h == null) {
            return null;
        }
        i14 = c17039h.f65523a;
        int i17 = c13117a.f45382b;
        if (i14 == 2) {
        }
        iM80178y0 = c17039h.f65525c;
        if (c17039h.f65524b) {
            iM80178y0 = m80178y0(iM80178y0, c13117a);
        }
        c13117a.m36688J(i17 + iM80178y0);
        if (!m80179z0(c13117a, i14, i15, false)) {
            if (i14 == 4) {
            }
            AbstractC30007c.m91850t(56, i14, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
            return null;
        }
        while (c13117a.m36692a() >= i15) {
            abstractC26858iM80164k0 = m80164k0(i14, c13117a, z13, i15, this.f107176b);
            if (abstractC26858iM80164k0 != null) {
                arrayList.add(abstractC26858iM80164k0);
            }
        }
        return new C18715c(arrayList);
    }

    @Override // io.sentry.config.AbstractC20301a
    /* JADX INFO: renamed from: t */
    public final C18715c mo56358t(C18717e c18717e, ByteBuffer byteBuffer) {
        return m80180f0(byteBuffer.limit(), byteBuffer.array());
    }
}
