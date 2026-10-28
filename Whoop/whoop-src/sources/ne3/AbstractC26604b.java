package ne3;

import com.whoop.service.network.model.UserSessionDto;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import m83.AbstractC25260n;
import m83.AbstractC25269w;
import oe3.AbstractC27882b;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb0.AbstractC39383f;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ne3.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC26604b {

    /* JADX INFO: renamed from: a */
    public static final C26612f f105833a = new C26612f();

    /* JADX INFO: renamed from: a */
    public static final boolean m79156a(int i13, int i14, int i15, byte[] a5, byte[] b) {
        AbstractC22676k.m65750j(a5, "a");
        AbstractC22676k.m65750j(b, "b");
        for (int i16 = 0; i16 < i15; i16++) {
            if (a5[i16 + i13] != b[i16 + i14]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final C26617h0 m79157b(InterfaceC26629n0 interfaceC26629n0) {
        AbstractC22676k.m65750j(interfaceC26629n0, "<this>");
        return new C26617h0(interfaceC26629n0);
    }

    /* JADX INFO: renamed from: c */
    public static final C26621j0 m79158c(InterfaceC26633p0 interfaceC26633p0) {
        AbstractC22676k.m65750j(interfaceC26633p0, "<this>");
        return new C26621j0(interfaceC26633p0);
    }

    /* JADX INFO: renamed from: d */
    public static void m79159d(long j7, C26616h c26616h, int i13, ArrayList arrayList, int i14, int i15, ArrayList arrayList2) {
        int i16;
        int i17;
        ArrayList arrayList3;
        long j13;
        int i18;
        int i19 = i13;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i14 >= i15) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i24 = i14; i24 < i15; i24++) {
            if (((C26624l) arrayList4.get(i24)).mo79253d() < i19) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C26624l c26624l = (C26624l) arrayList.get(i14);
        C26624l c26624l2 = (C26624l) arrayList4.get(i15 - 1);
        if (i19 == c26624l.mo79253d()) {
            int iIntValue = ((Number) arrayList5.get(i14)).intValue();
            int i25 = i14 + 1;
            C26624l c26624l3 = (C26624l) arrayList4.get(i25);
            i16 = i25;
            i17 = iIntValue;
            c26624l = c26624l3;
        } else {
            i16 = i14;
            i17 = -1;
        }
        if (c26624l.mo79257i(i19) == c26624l2.mo79257i(i19)) {
            int iMin = Math.min(c26624l.mo79253d(), c26624l2.mo79253d());
            int i26 = 0;
            for (int i27 = i19; i27 < iMin && c26624l.mo79257i(i27) == c26624l2.mo79257i(i27); i27++) {
                i26++;
            }
            long j14 = 4;
            long j15 = (c26616h.f105866x / j14) + j7 + ((long) 2) + ((long) i26) + 1;
            c26616h.m79226p1(-i26);
            c26616h.m79226p1(i17);
            int i28 = i19 + i26;
            while (i19 < i28) {
                c26616h.m79226p1(c26624l.mo79257i(i19) & 255);
                i19++;
            }
            if (i16 + 1 == i15) {
                if (i28 != ((C26624l) arrayList4.get(i16)).mo79253d()) {
                    throw new IllegalStateException("Check failed.");
                }
                c26616h.m79226p1(((Number) arrayList5.get(i16)).intValue());
                return;
            } else {
                C26616h c26616h2 = new C26616h();
                c26616h.m79226p1(((int) ((c26616h2.f105866x / j14) + j15)) * (-1));
                m79159d(j15, c26616h2, i28, arrayList4, i16, i15, arrayList5);
                c26616h.mo79189N0(c26616h2);
                return;
            }
        }
        int i29 = 1;
        for (int i34 = i16 + 1; i34 < i15; i34++) {
            if (((C26624l) arrayList4.get(i34 - 1)).mo79257i(i19) != ((C26624l) arrayList4.get(i34)).mo79257i(i19)) {
                i29++;
            }
        }
        long j16 = 4;
        long j17 = (c26616h.f105866x / j16) + j7 + ((long) 2) + ((long) (i29 * 2));
        c26616h.m79226p1(i29);
        c26616h.m79226p1(i17);
        for (int i35 = i16; i35 < i15; i35++) {
            int iMo79257i = ((C26624l) arrayList4.get(i35)).mo79257i(i19);
            if (i35 == i16 || iMo79257i != ((C26624l) arrayList4.get(i35 - 1)).mo79257i(i19)) {
                c26616h.m79226p1(iMo79257i & 255);
            }
        }
        C26616h c26616h3 = new C26616h();
        int i36 = i16;
        while (i36 < i15) {
            byte bMo79257i = ((C26624l) arrayList4.get(i36)).mo79257i(i19);
            int i37 = i36 + 1;
            int i38 = i37;
            while (true) {
                if (i38 >= i15) {
                    i38 = i15;
                    break;
                } else if (bMo79257i != ((C26624l) arrayList4.get(i38)).mo79257i(i19)) {
                    break;
                } else {
                    i38++;
                }
            }
            if (i37 == i38 && i19 + 1 == ((C26624l) arrayList4.get(i36)).mo79253d()) {
                c26616h.m79226p1(((Number) arrayList5.get(i36)).intValue());
                arrayList3 = arrayList5;
                j13 = j17;
                i18 = i38;
            } else {
                c26616h.m79226p1(((int) ((c26616h3.f105866x / j16) + j17)) * (-1));
                arrayList3 = arrayList5;
                j13 = j17;
                i18 = i38;
                m79159d(j13, c26616h3, i19 + 1, arrayList, i36, i18, arrayList3);
                arrayList4 = arrayList;
            }
            j17 = j13;
            i36 = i18;
            arrayList5 = arrayList3;
        }
        c26616h.mo79189N0(c26616h3);
    }

    /* JADX INFO: renamed from: e */
    public static final void m79160e(long j7, long j13, long j14) {
        if ((j13 | j14) < 0 || j13 > j7 || j7 - j13 < j14) {
            StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "size=", " offset=");
            sbM125596b.append(j13);
            sbM125596b.append(" byteCount=");
            sbM125596b.append(j14);
            throw new ArrayIndexOutOfBoundsException(sbM125596b.toString());
        }
    }

    /* JADX INFO: renamed from: f */
    public static C26607c0 m79161f(C26624l... c26624lArr) {
        if (c26624lArr.length == 0) {
            return new C26607c0(new C26624l[0], new int[]{0, -1});
        }
        ArrayList arrayListM74055Z0 = AbstractC25260n.m74055Z0(c26624lArr);
        AbstractC25269w.m74165k0(arrayListM74055Z0);
        int size = arrayListM74055Z0.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(-1);
        }
        int length = c26624lArr.length;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            arrayList.set(AbstractC37056f.m118986i(arrayListM74055Z0, c26624lArr[i14]), Integer.valueOf(i15));
            i14++;
            i15++;
        }
        if (((C26624l) arrayListM74055Z0.get(0)).mo79253d() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i16 = 0;
        while (i16 < arrayListM74055Z0.size()) {
            C26624l prefix = (C26624l) arrayListM74055Z0.get(i16);
            int i17 = i16 + 1;
            int i18 = i17;
            while (i18 < arrayListM74055Z0.size()) {
                C26624l c26624l = (C26624l) arrayListM74055Z0.get(i18);
                c26624l.getClass();
                AbstractC22676k.m65750j(prefix, "prefix");
                if (!c26624l.mo79260m(0, prefix.mo79253d(), prefix)) {
                    break;
                }
                if (c26624l.mo79253d() == prefix.mo79253d()) {
                    throw new IllegalArgumentException(("duplicate option: " + c26624l).toString());
                }
                if (((Number) arrayList.get(i18)).intValue() > ((Number) arrayList.get(i16)).intValue()) {
                    arrayListM74055Z0.remove(i18);
                    ((Number) arrayList.remove(i18)).intValue();
                } else {
                    i18++;
                }
            }
            i16 = i17;
        }
        C26616h c26616h = new C26616h();
        m79159d(0L, c26616h, 0, arrayListM74055Z0, 0, arrayListM74055Z0.size(), arrayList);
        int i19 = (int) (c26616h.f105866x / ((long) 4));
        int[] iArr = new int[i19];
        for (int i24 = 0; i24 < i19; i24++) {
            iArr[i24] = c26616h.readInt();
        }
        Object[] objArrCopyOf = Arrays.copyOf(c26624lArr, c26624lArr.length);
        AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
        return new C26607c0((C26624l[]) objArrCopyOf, iArr);
    }

    /* JADX INFO: renamed from: g */
    public static final int m79162g(int i13) {
        return ((i13 & 255) << 24) | (((-16777216) & i13) >>> 24) | ((16711680 & i13) >>> 8) | ((65280 & i13) << 8);
    }

    /* JADX INFO: renamed from: h */
    public static final long m79163h(long j7) {
        return ((j7 & 255) << 56) | (((-72057594037927936L) & j7) >>> 56) | ((71776119061217280L & j7) >>> 40) | ((280375465082880L & j7) >>> 24) | ((1095216660480L & j7) >>> 8) | ((4278190080L & j7) << 8) | ((16711680 & j7) << 24) | ((65280 & j7) << 40);
    }

    /* JADX INFO: renamed from: i */
    public static final C26609d0 m79164i(OutputStream outputStream) {
        return new C26609d0(outputStream, new C26637r0());
    }

    /* JADX INFO: renamed from: j */
    public static long m79165j(String str) {
        int i13;
        int length = str.length();
        AbstractC22676k.m65750j(str, "<this>");
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8294g(length, 0, "endIndex < beginIndex: ", " < ").toString());
        }
        if (length > str.length()) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(length, "endIndex > string.length: ", " > ");
            sbM30466t.append(str.length());
            throw new IllegalArgumentException(sbM30466t.toString().toString());
        }
        long j7 = 0;
        int i14 = 0;
        while (i14 < length) {
            char cCharAt = str.charAt(i14);
            if (cCharAt < 128) {
                j7++;
            } else {
                if (cCharAt < 2048) {
                    i13 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i13 = 3;
                } else {
                    int i15 = i14 + 1;
                    char cCharAt2 = i15 < length ? str.charAt(i15) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j7++;
                        i14 = i15;
                    } else {
                        j7 += (long) 4;
                        i14 += 2;
                    }
                }
                j7 += (long) i13;
            }
            i14++;
        }
        return j7;
    }

    /* JADX INFO: renamed from: k */
    public static final C26645y m79166k(InputStream inputStream) {
        AbstractC22676k.m65750j(inputStream, "<this>");
        return new C26645y(inputStream, new C26637r0());
    }

    /* JADX INFO: renamed from: l */
    public static final String m79167l(byte b) {
        char[] cArr = AbstractC27882b.f112427a;
        return new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }

    /* JADX INFO: renamed from: m */
    public static final String m79168m(int i13) {
        if (i13 == 0) {
            return UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE;
        }
        char[] cArr = AbstractC27882b.f112427a;
        int i14 = 0;
        char[] cArr2 = {cArr[(i13 >> 28) & 15], cArr[(i13 >> 24) & 15], cArr[(i13 >> 20) & 15], cArr[(i13 >> 16) & 15], cArr[(i13 >> 12) & 15], cArr[(i13 >> 8) & 15], cArr[(i13 >> 4) & 15], cArr[i13 & 15]};
        while (i14 < 8 && cArr2[i14] == '0') {
            i14++;
        }
        return AbstractC39421y.m125934z(cArr2, i14, 8);
    }
}
