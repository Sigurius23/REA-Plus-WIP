package p309lo;

import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import p465rm.InterfaceC31526e;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41060w0;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: lo.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24543a {

    /* JADX INFO: renamed from: a */
    public static final byte[] f95797a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final String[] f95798b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c */
    public static final byte[] f95799c = {0, 0, 0, 1};

    /* JADX INFO: renamed from: d */
    public static final float[] f95800d = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: e */
    public static final Object f95801e = new Object();

    /* JADX INFO: renamed from: f */
    public static int[] f95802f = new int[10];

    /* JADX INFO: renamed from: A */
    public static String m71559A(StringBuilder sb4, int i13, int i14) {
        int i15;
        int iLastIndexOf;
        if (i13 >= i14) {
            return sb4.toString();
        }
        if (sb4.charAt(i13) == '/') {
            i13++;
        }
        int i16 = i13;
        int i17 = i16;
        while (i16 <= i14) {
            if (i16 == i14) {
                i15 = i16;
            } else if (sb4.charAt(i16) == '/') {
                i15 = i16 + 1;
            } else {
                i16++;
            }
            int i18 = i17 + 1;
            if (i16 == i18 && sb4.charAt(i17) == '.') {
                sb4.delete(i17, i15);
                i14 -= i15 - i17;
            } else {
                if (i16 == i17 + 2 && sb4.charAt(i17) == '.' && sb4.charAt(i18) == '.') {
                    iLastIndexOf = sb4.lastIndexOf("/", i17 - 2) + 1;
                    int i19 = iLastIndexOf > i13 ? iLastIndexOf : i13;
                    sb4.delete(i19, i15);
                    i14 -= i15 - i19;
                } else {
                    iLastIndexOf = i16 + 1;
                }
                i17 = iLastIndexOf;
            }
            i16 = i17;
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: B */
    public static String m71560B(String str, String str2) {
        StringBuilder sb4 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrM71583s = m71583s(str2);
        if (iArrM71583s[0] != -1) {
            sb4.append(str2);
            m71559A(sb4, iArrM71583s[1], iArrM71583s[2]);
            return sb4.toString();
        }
        int[] iArrM71583s2 = m71583s(str);
        if (iArrM71583s[3] == 0) {
            sb4.append((CharSequence) str, 0, iArrM71583s2[3]);
            sb4.append(str2);
            return sb4.toString();
        }
        if (iArrM71583s[2] == 0) {
            sb4.append((CharSequence) str, 0, iArrM71583s2[2]);
            sb4.append(str2);
            return sb4.toString();
        }
        int i13 = iArrM71583s[1];
        if (i13 != 0) {
            int i14 = iArrM71583s2[0] + 1;
            sb4.append((CharSequence) str, 0, i14);
            sb4.append(str2);
            return m71559A(sb4, iArrM71583s[1] + i14, i14 + iArrM71583s[2]);
        }
        if (str2.charAt(i13) == '/') {
            sb4.append((CharSequence) str, 0, iArrM71583s2[1]);
            sb4.append(str2);
            int i15 = iArrM71583s2[1];
            return m71559A(sb4, i15, iArrM71583s[2] + i15);
        }
        int i16 = iArrM71583s2[0] + 2;
        int i17 = iArrM71583s2[1];
        if (i16 >= i17 || i17 != iArrM71583s2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrM71583s2[2] - 1);
            int i18 = iLastIndexOf == -1 ? iArrM71583s2[1] : iLastIndexOf + 1;
            sb4.append((CharSequence) str, 0, i18);
            sb4.append(str2);
            return m71559A(sb4, iArrM71583s2[1], i18 + iArrM71583s[2]);
        }
        sb4.append((CharSequence) str, 0, i17);
        sb4.append('/');
        sb4.append(str2);
        int i19 = iArrM71583s2[1];
        return m71559A(sb4, i19, iArrM71583s[2] + i19 + 1);
    }

    /* JADX INFO: renamed from: C */
    public static Uri m71561C(String str, String str2) {
        return Uri.parse(m71560B(str, str2));
    }

    /* JADX INFO: renamed from: D */
    public static void m71562D(MediaFormat mediaFormat, List list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            mediaFormat.setByteBuffer(AbstractC31061c.m95634j(15, i13, "csd-"), ByteBuffer.wrap((byte[]) list.get(i13)));
        }
    }

    /* JADX INFO: renamed from: E */
    public static int m71563E(int i13, byte[] bArr) {
        int i14;
        synchronized (f95801e) {
            int i15 = 0;
            int i16 = 0;
            while (i15 < i13) {
                while (true) {
                    if (i15 >= i13 - 2) {
                        i15 = i13;
                        break;
                    }
                    try {
                        if (bArr[i15] == 0 && bArr[i15 + 1] == 0 && bArr[i15 + 2] == 3) {
                            break;
                        }
                        i15++;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (i15 < i13) {
                    int[] iArr = f95802f;
                    if (iArr.length <= i16) {
                        f95802f = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f95802f[i16] = i15;
                    i15 += 3;
                    i16++;
                }
            }
            i14 = i13 - i16;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < i16; i19++) {
                int i24 = f95802f[i19] - i18;
                System.arraycopy(bArr, i18, bArr, i17, i24);
                int i25 = i17 + i24;
                int i26 = i25 + 1;
                bArr[i25] = 0;
                i17 = i25 + 2;
                bArr[i26] = 0;
                i18 += i24 + 3;
            }
            System.arraycopy(bArr, i18, bArr, i17, i14 - i17);
        }
        return i14;
    }

    /* JADX INFO: renamed from: F */
    public static void m71564F(String str, String str2, Exception exc) {
        Log.w(str, m71566b(str2, exc));
    }

    /* JADX INFO: renamed from: a */
    public static void m71565a(int i13, int i14, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i14);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
            StringBuilder sb4 = new StringBuilder(str.length() + AbstractC30007c.m91832b(10, strGlGetShaderInfoLog));
            sb4.append(strGlGetShaderInfoLog);
            sb4.append(", source: ");
            sb4.append(str);
            Log.e("GlUtil", sb4.toString());
        }
        GLES20.glAttachShader(i13, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        m71571g();
    }

    /* JADX INFO: renamed from: b */
    public static String m71566b(String str, Throwable th3) {
        String strReplace;
        if (th3 != null) {
            Throwable cause = th3;
            while (true) {
                if (cause == null) {
                    strReplace = Log.getStackTraceString(th3).trim().replace("\t", "    ");
                    break;
                }
                if (cause instanceof UnknownHostException) {
                    strReplace = "UnknownHostException (no network)";
                    break;
                }
                cause = cause.getCause();
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        String strValueOf = String.valueOf(str);
        String strReplace2 = strReplace.replace("\n", "\n  ");
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(strValueOf.length() + 4, strReplace2));
        sb4.append(strValueOf);
        sb4.append("\n  ");
        sb4.append(strReplace2);
        sb4.append('\n');
        return sb4.toString();
    }

    /* JADX INFO: renamed from: c */
    public static void m71567c(String str) {
        if (AbstractC24567y.f95875a >= 18) {
            Trace.beginSection(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m71568d(int i13, boolean z4, int i14, int i15, int[] iArr, int i16) {
        Object[] objArr = {f95798b[i13], Integer.valueOf(i14), Integer.valueOf(i15), Character.valueOf(z4 ? 'H' : 'L'), Integer.valueOf(i16)};
        int i17 = AbstractC24567y.f95875a;
        StringBuilder sb4 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i18 = 0; i18 < length; i18++) {
            sb4.append(String.format(".%02X", Integer.valueOf(iArr[i18])));
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: e */
    public static void m71569e(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m71570f(boolean z4, String str) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m71571g() {
        int i13 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            String strValueOf = String.valueOf(GLU.gluErrorString(iGlGetError));
            Log.e("GlUtil", strValueOf.length() != 0 ? "glError: ".concat(strValueOf) : new String("glError: "));
            i13 = iGlGetError;
        }
        if (i13 != 0) {
            String strValueOf2 = String.valueOf(GLU.gluErrorString(i13));
            Log.e("GlUtil", strValueOf2.length() != 0 ? "glError: ".concat(strValueOf2) : new String("glError: "));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m71572h(int i13, int i14) {
        if (i13 < 0 || i13 >= i14) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m71573i(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m71574j(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m71575k(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m71576l(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX INFO: renamed from: m */
    public static FloatBuffer m71577m(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    /* JADX INFO: renamed from: n */
    public static void m71578n(String str, String str2, Throwable th3) {
        Log.e(str, m71566b(str2, th3));
    }

    /* JADX INFO: renamed from: o */
    public static void m71579o() {
        if (AbstractC24567y.f95875a >= 18) {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: p */
    public static int m71580p(byte[] bArr, int i13, int i14, boolean[] zArr) {
        int i15 = i14 - i13;
        m71573i(i15 >= 0);
        if (i15 == 0) {
            return i14;
        }
        if (zArr[0]) {
            m71576l(zArr);
            return i13 - 3;
        }
        if (i15 > 1 && zArr[1] && bArr[i13] == 1) {
            m71576l(zArr);
            return i13 - 2;
        }
        if (i15 > 2 && zArr[2] && bArr[i13] == 0 && bArr[i13 + 1] == 1) {
            m71576l(zArr);
            return i13 - 1;
        }
        int i16 = i14 - 1;
        int i17 = i13 + 2;
        while (i17 < i16) {
            byte b = bArr[i17];
            if ((b & 254) == 0) {
                int i18 = i17 - 2;
                if (bArr[i18] == 0 && bArr[i17 - 1] == 0 && b == 1) {
                    m71576l(zArr);
                    return i18;
                }
                i17 -= 2;
            }
            i17 += 3;
        }
        zArr[0] = i15 <= 2 ? !(i15 != 2 ? !(zArr[1] && bArr[i16] == 1) : !(zArr[2] && bArr[i14 + (-2)] == 0 && bArr[i16] == 1)) : bArr[i14 + (-3)] == 0 && bArr[i14 + (-2)] == 0 && bArr[i16] == 1;
        zArr[1] = i15 <= 1 ? zArr[2] && bArr[i16] == 0 : bArr[i14 + (-2)] == 0 && bArr[i16] == 0;
        zArr[2] = bArr[i16] == 0;
        return i14;
    }

    /* JADX INFO: renamed from: q */
    public static C41060w0 m71581q(InterfaceC31526e interfaceC31526e, ArrayList arrayList) {
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            Bundle bundle = (Bundle) arrayList.get(i13);
            bundle.getClass();
            c41014d0M133251l.m133222a(interfaceC31526e.mo52217e(bundle));
        }
        return c41014d0M133251l.m133239f();
    }

    /* JADX INFO: renamed from: r */
    public static String m71582r(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i13 = 0; i13 < attributeCount; i13++) {
            if (xmlPullParser.getAttributeName(i13).equals(str)) {
                return xmlPullParser.getAttributeValue(i13);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static int[] m71583s(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i13 = iIndexOf5 + 2;
        if (i13 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i13) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    /* JADX INFO: renamed from: t */
    public static int m71584t(String str) {
        String str2 = str;
        if (str2 == null) {
            return -1;
        }
        ArrayList arrayList = AbstractC24555m.f95827a;
        switch (str2) {
            case "audio/x-flac":
                str2 = "audio/flac";
                break;
            case "audio/x-wav":
                str2 = "audio/wav";
                break;
            case "audio/mp3":
                str2 = "audio/mpeg";
                break;
        }
        switch (str2) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/eac3":
                return 0;
            case "video/mp2p":
                return 10;
            case "video/mp2t":
                return 11;
            case "video/webm":
            case "audio/x-matroska":
            case "application/webm":
            case "audio/webm":
            case "video/x-matroska":
                return 6;
            case "audio/amr-wb":
            case "audio/amr":
            case "audio/3gpp":
                return 3;
            case "image/jpeg":
                return 14;
            case "application/mp4":
            case "audio/mp4":
            case "video/mp4":
                return 8;
            case "text/vtt":
                return 13;
            case "video/x-flv":
                return 5;
            case "audio/ac4":
                return 1;
            case "audio/ogg":
                return 9;
            case "audio/wav":
                return 12;
            case "audio/flac":
                return 4;
            case "audio/mpeg":
                return 7;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: u */
    public static int m71585u(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        return (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) ? 14 : -1;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m71586v(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m71587w(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: x */
    public static void m71588x(MediaFormat mediaFormat, String str, int i13) {
        if (i13 != -1) {
            mediaFormat.setInteger(str, i13);
        }
    }

    /* JADX INFO: renamed from: y */
    public static C24556n m71589y(byte[] bArr, int i13, int i14) {
        C24561s c24561s = new C24561s(i13 + 2, i14, 1, bArr);
        int i15 = 4;
        c24561s.m71643t(4);
        int iM71632i = c24561s.m71632i(3);
        c24561s.m71642s();
        int iM71632i2 = c24561s.m71632i(2);
        boolean zM71631h = c24561s.m71631h();
        int iM71632i3 = c24561s.m71632i(5);
        int i16 = 0;
        for (int i17 = 0; i17 < 32; i17++) {
            if (c24561s.m71631h()) {
                i16 |= 1 << i17;
            }
        }
        int i18 = 6;
        int[] iArr = new int[6];
        for (int i19 = 0; i19 < 6; i19++) {
            iArr[i19] = c24561s.m71632i(8);
        }
        int i24 = 0;
        int iM71632i4 = c24561s.m71632i(8);
        for (int i25 = 0; i25 < iM71632i; i25++) {
            if (c24561s.m71631h()) {
                i24 += 89;
            }
            if (c24561s.m71631h()) {
                i24 += 8;
            }
        }
        c24561s.m71643t(i24);
        if (iM71632i > 0) {
            c24561s.m71643t((8 - iM71632i) * 2);
        }
        c24561s.m71636m();
        int iM71636m = c24561s.m71636m();
        if (iM71636m == 3) {
            c24561s.m71642s();
        }
        int iM71636m2 = c24561s.m71636m();
        int iM71636m3 = c24561s.m71636m();
        if (c24561s.m71631h()) {
            int iM71636m4 = c24561s.m71636m();
            int iM71636m5 = c24561s.m71636m();
            int iM71636m6 = c24561s.m71636m();
            int iM71636m7 = c24561s.m71636m();
            iM71636m2 -= (iM71636m4 + iM71636m5) * ((iM71636m == 1 || iM71636m == 2) ? 2 : 1);
            iM71636m3 -= (iM71636m6 + iM71636m7) * (iM71636m == 1 ? 2 : 1);
        }
        c24561s.m71636m();
        c24561s.m71636m();
        int iM71636m8 = c24561s.m71636m();
        for (int i26 = c24561s.m71631h() ? 0 : iM71632i; i26 <= iM71632i; i26++) {
            c24561s.m71636m();
            c24561s.m71636m();
            c24561s.m71636m();
        }
        c24561s.m71636m();
        c24561s.m71636m();
        c24561s.m71636m();
        c24561s.m71636m();
        c24561s.m71636m();
        c24561s.m71636m();
        if (c24561s.m71631h() && c24561s.m71631h()) {
            int i27 = 0;
            while (i27 < i15) {
                int i28 = 0;
                while (i28 < i18) {
                    if (c24561s.m71631h()) {
                        int iMin = Math.min(64, 1 << ((i27 << 1) + 4));
                        if (i27 > 1) {
                            c24561s.m71637n();
                        }
                        for (int i29 = 0; i29 < iMin; i29++) {
                            c24561s.m71637n();
                        }
                    } else {
                        c24561s.m71636m();
                    }
                    i28 += i27 == 3 ? 3 : 1;
                    i18 = 6;
                }
                i27++;
                i15 = 4;
                i18 = 6;
            }
        }
        c24561s.m71643t(2);
        if (c24561s.m71631h()) {
            c24561s.m71643t(8);
            c24561s.m71636m();
            c24561s.m71636m();
            c24561s.m71642s();
        }
        int iM71636m9 = c24561s.m71636m();
        boolean zM71631h2 = false;
        int i34 = 0;
        for (int i35 = 0; i35 < iM71636m9; i35++) {
            if (i35 != 0) {
                zM71631h2 = c24561s.m71631h();
            }
            if (zM71631h2) {
                c24561s.m71642s();
                c24561s.m71636m();
                for (int i36 = 0; i36 <= i34; i36++) {
                    if (!c24561s.m71631h()) {
                        c24561s.m71642s();
                    }
                }
            } else {
                int iM71636m10 = c24561s.m71636m();
                int iM71636m11 = c24561s.m71636m();
                int i37 = iM71636m10 + iM71636m11;
                for (int i38 = 0; i38 < iM71636m10; i38++) {
                    c24561s.m71636m();
                    c24561s.m71642s();
                }
                for (int i39 = 0; i39 < iM71636m11; i39++) {
                    c24561s.m71636m();
                    c24561s.m71642s();
                }
                i34 = i37;
            }
        }
        if (c24561s.m71631h()) {
            for (int i44 = 0; i44 < c24561s.m71636m(); i44++) {
                c24561s.m71643t(iM71636m8 + 5);
            }
        }
        c24561s.m71643t(2);
        float f13 = 1.0f;
        if (c24561s.m71631h()) {
            if (c24561s.m71631h()) {
                int iM71632i5 = c24561s.m71632i(8);
                if (iM71632i5 == 255) {
                    int iM71632i6 = c24561s.m71632i(16);
                    int iM71632i7 = c24561s.m71632i(16);
                    if (iM71632i6 != 0 && iM71632i7 != 0) {
                        f13 = iM71632i6 / iM71632i7;
                    }
                } else if (iM71632i5 < 17) {
                    f13 = f95800d[iM71632i5];
                } else {
                    AbstractC30007c.m91850t(46, iM71632i5, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (c24561s.m71631h()) {
                c24561s.m71642s();
            }
            if (c24561s.m71631h()) {
                c24561s.m71643t(4);
                if (c24561s.m71631h()) {
                    c24561s.m71643t(24);
                }
            }
            if (c24561s.m71631h()) {
                c24561s.m71636m();
                c24561s.m71636m();
            }
            c24561s.m71642s();
            if (c24561s.m71631h()) {
                iM71636m3 *= 2;
            }
        }
        return new C24556n(iM71632i2, zM71631h, iM71632i3, i16, iArr, iM71632i4, iM71636m2, iM71636m3, f13);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:66:0x010d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0120  */
    /* JADX WARN: Code duplicated, block: B:71:0x0124  */
    /* JADX WARN: Code duplicated, block: B:72:0x0126  */
    /* JADX WARN: Code duplicated, block: B:74:0x012a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0152  */
    /* JADX WARN: Code duplicated, block: B:87:0x0165  */
    /* JADX WARN: Code duplicated, block: B:89:0x0169  */
    /* JADX WARN: Code duplicated, block: B:90:0x016e  */
    /* JADX INFO: renamed from: z */
    public static C24558p m71590z(byte[] bArr, int i13, int i14) {
        int iM71636m;
        boolean zM71631h;
        int i15;
        int iM71636m2;
        boolean z4;
        boolean zM71631h2;
        int i16;
        int i17;
        int i18;
        float f13;
        int iM71632i;
        int iM71632i2;
        int iM71632i3;
        int i19;
        int i24 = 1;
        C24561s c24561s = new C24561s(i13 + 1, i14, 1, bArr);
        int i25 = 8;
        int iM71632i4 = c24561s.m71632i(8);
        int iM71632i5 = c24561s.m71632i(8);
        int iM71632i6 = c24561s.m71632i(8);
        int iM71636m3 = c24561s.m71636m();
        if (iM71632i4 == 100 || iM71632i4 == 110 || iM71632i4 == 122 || iM71632i4 == 244 || iM71632i4 == 44 || iM71632i4 == 83 || iM71632i4 == 86 || iM71632i4 == 118 || iM71632i4 == 128 || iM71632i4 == 138) {
            iM71636m = c24561s.m71636m();
            zM71631h = iM71636m == 3 ? c24561s.m71631h() : false;
            c24561s.m71636m();
            c24561s.m71636m();
            c24561s.m71642s();
            if (c24561s.m71631h()) {
                int i26 = iM71636m != 3 ? 8 : 12;
                int i27 = 0;
                while (i27 < i26) {
                    if (c24561s.m71631h()) {
                        int i28 = i27 < 6 ? 16 : 64;
                        int iM71637n = 8;
                        int i29 = 8;
                        for (int i34 = 0; i34 < i28; i34++) {
                            if (iM71637n != 0) {
                                iM71637n = ((c24561s.m71637n() + i29) + 256) % 256;
                            }
                            if (iM71637n != 0) {
                                i29 = iM71637n;
                            }
                        }
                    }
                    i27++;
                }
            }
        } else {
            iM71636m = 1;
            zM71631h = false;
        }
        int iM71636m4 = c24561s.m71636m() + 4;
        int iM71636m5 = c24561s.m71636m();
        if (iM71636m5 != 0) {
            if (iM71636m5 == 1) {
                boolean zM71631h3 = c24561s.m71631h();
                c24561s.m71637n();
                c24561s.m71637n();
                i15 = 16;
                long jM71636m = c24561s.m71636m();
                c24561s = c24561s;
                for (int i35 = 0; i35 < jM71636m; i35++) {
                    c24561s.m71636m();
                }
                z4 = zM71631h3;
                i25 = 8;
                iM71636m2 = 0;
            } else {
                i15 = 16;
                iM71636m2 = 0;
            }
            c24561s.m71636m();
            c24561s.m71642s();
            int iM71636m6 = c24561s.m71636m() + 1;
            int iM71636m7 = c24561s.m71636m() + 1;
            zM71631h2 = c24561s.m71631h();
            i16 = 2 - (zM71631h2 ? 1 : 0);
            int i36 = iM71636m7 * i16;
            if (!zM71631h2) {
                c24561s.m71642s();
            }
            c24561s.m71642s();
            i17 = iM71636m6 * 16;
            i18 = i36 * 16;
            if (c24561s.m71631h()) {
                int iM71636m8 = c24561s.m71636m();
                int iM71636m9 = c24561s.m71636m();
                int iM71636m10 = c24561s.m71636m();
                int iM71636m11 = c24561s.m71636m();
                if (iM71636m != 0) {
                    if (iM71636m == 3) {
                        i19 = 1;
                    } else {
                        i19 = 2;
                    }
                    i16 *= iM71636m == 1 ? 2 : 1;
                    i24 = i19;
                }
                i17 -= (iM71636m8 + iM71636m9) * i24;
                i18 -= (iM71636m10 + iM71636m11) * i16;
            }
            int i37 = i17;
            f13 = 1.0f;
            if (c24561s.m71631h() && c24561s.m71631h()) {
                iM71632i = c24561s.m71632i(i25);
                if (iM71632i == 255) {
                    int i38 = i15;
                    iM71632i2 = c24561s.m71632i(i38);
                    iM71632i3 = c24561s.m71632i(i38);
                    if (iM71632i2 != 0 && iM71632i3 != 0) {
                        f13 = iM71632i2 / iM71632i3;
                    }
                } else if (iM71632i < 17) {
                    f13 = f95800d[iM71632i];
                } else {
                    AbstractC30007c.m91850t(46, iM71632i, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            return new C24558p(iM71632i4, iM71632i5, iM71632i6, iM71636m3, i37, i18, f13, zM71631h, zM71631h2, iM71636m4, iM71636m5, iM71636m2, z4);
        }
        iM71636m2 = c24561s.m71636m() + 4;
        i15 = 16;
        z4 = false;
        c24561s.m71636m();
        c24561s.m71642s();
        int iM71636m12 = c24561s.m71636m() + 1;
        int iM71636m13 = c24561s.m71636m() + 1;
        zM71631h2 = c24561s.m71631h();
        i16 = 2 - (zM71631h2 ? 1 : 0);
        int i39 = iM71636m13 * i16;
        if (!zM71631h2) {
            c24561s.m71642s();
        }
        c24561s.m71642s();
        i17 = iM71636m12 * 16;
        i18 = i39 * 16;
        if (c24561s.m71631h()) {
            int iM71636m14 = c24561s.m71636m();
            int iM71636m15 = c24561s.m71636m();
            int iM71636m16 = c24561s.m71636m();
            int iM71636m17 = c24561s.m71636m();
            if (iM71636m != 0) {
                if (iM71636m == 3) {
                    i19 = 1;
                } else {
                    i19 = 2;
                }
                i16 *= iM71636m == 1 ? 2 : 1;
                i24 = i19;
            }
            i17 -= (iM71636m14 + iM71636m15) * i24;
            i18 -= (iM71636m16 + iM71636m17) * i16;
        }
        int i310 = i17;
        f13 = 1.0f;
        if (c24561s.m71631h()) {
            iM71632i = c24561s.m71632i(i25);
            if (iM71632i == 255) {
                int i311 = i15;
                iM71632i2 = c24561s.m71632i(i311);
                iM71632i3 = c24561s.m71632i(i311);
                if (iM71632i2 != 0) {
                    f13 = iM71632i2 / iM71632i3;
                }
            } else if (iM71632i < 17) {
                f13 = f95800d[iM71632i];
            } else {
                AbstractC30007c.m91850t(46, iM71632i, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
            }
        }
        return new C24558p(iM71632i4, iM71632i5, iM71632i6, iM71636m3, i310, i18, f13, zM71631h, zM71631h2, iM71636m4, iM71636m5, iM71636m2, z4);
    }
}
