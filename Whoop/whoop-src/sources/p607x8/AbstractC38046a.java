package p607x8;

import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.common.util.GlUtil$GlException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k33.ThreadFactoryC22176a;
import org.xmlpull.v1.XmlPullParser;
import p031b9.AbstractC2875y;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: x8.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC38046a {

    /* JADX INFO: renamed from: a */
    public static ExecutorService f162975a;

    /* JADX INFO: renamed from: b */
    public static final Object f162976b = new Object();

    /* JADX INFO: renamed from: a */
    public static String m121806a(String str, Throwable th3) {
        String strReplace;
        if (th3 != null) {
            synchronized (f162976b) {
                Throwable cause = th3;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th3).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbM35484d = AbstractC12682p.m35484d(str, "\n  ");
        sbM35484d.append(strReplace.replace("\n", "\n  "));
        sbM35484d.append('\n');
        return sbM35484d.toString();
    }

    /* JADX INFO: renamed from: b */
    public static void m121807b(int i13, int i14) throws GlUtil$GlException {
        GLES20.glBindTexture(i13, i14);
        m121808c();
        GLES20.glTexParameteri(i13, 10240, 9729);
        m121808c();
        GLES20.glTexParameteri(i13, 10241, 9729);
        m121808c();
        GLES20.glTexParameteri(i13, 10242, 33071);
        m121808c();
        GLES20.glTexParameteri(i13, 10243, 33071);
        m121808c();
    }

    /* JADX INFO: renamed from: c */
    public static void m121808c() throws GlUtil$GlException {
        StringBuilder sb4 = new StringBuilder();
        boolean z4 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z4) {
                sb4.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb4.append("glError: ");
            sb4.append(strGluErrorString);
            z4 = true;
        }
        if (z4) {
            throw new GlUtil$GlException(sb4.toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m121809d(String str, boolean z4) throws GlUtil$GlException {
        if (!z4) {
            throw new GlUtil$GlException(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static FloatBuffer m121810e(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    /* JADX INFO: renamed from: f */
    public static void m121811f(String str, String str2) {
        synchronized (f162976b) {
            Log.d(str, m121806a(str2, null));
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m121812g(String str, String str2) {
        synchronized (f162976b) {
            Log.e(str, m121806a(str2, null));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m121813h(String str, String str2, Throwable th3) {
        synchronized (f162976b) {
            Log.e(str, m121806a(str2, th3));
        }
    }

    /* JADX INFO: renamed from: i */
    public static synchronized Executor m121814i() {
        try {
            if (f162975a == null) {
                int i13 = AbstractC38065t.f163031a;
                f162975a = Executors.newSingleThreadExecutor(new ThreadFactoryC22176a("ExoPlayer:BackgroundExecutor", 2));
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f162975a;
    }

    /* JADX INFO: renamed from: j */
    public static String m121815j(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i13 = 0; i13 < attributeCount; i13++) {
            if (xmlPullParser.getAttributeName(i13).equals(str)) {
                return xmlPullParser.getAttributeValue(i13);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static int m121816k(int i13, int i14) {
        for (int i15 = 1; i15 <= 2; i15++) {
            int i16 = (i13 + i15) % 3;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2 || (i14 & 2) == 0) {
                    }
                } else if ((i14 & 1) == 0) {
                }
            }
            return i16;
        }
        return i13;
    }

    /* JADX INFO: renamed from: l */
    public static int[] m121817l(String str) {
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

    /* JADX INFO: renamed from: m */
    public static void m121818m(String str, String str2) {
        synchronized (f162976b) {
            Log.i(str, m121806a(str2, null));
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m121819n(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m121820o(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: p */
    public static void m121821p(MediaFormat mediaFormat, String str, int i13) {
        if (i13 != -1) {
            mediaFormat.setInteger(str, i13);
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m121822q(StringBuilder sb4, int i13, int i14) {
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

    /* JADX INFO: renamed from: r */
    public static String m121823r(String str, String str2) {
        StringBuilder sb4 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrM121817l = m121817l(str2);
        if (iArrM121817l[0] != -1) {
            sb4.append(str2);
            m121822q(sb4, iArrM121817l[1], iArrM121817l[2]);
            return sb4.toString();
        }
        int[] iArrM121817l2 = m121817l(str);
        if (iArrM121817l[3] == 0) {
            sb4.append((CharSequence) str, 0, iArrM121817l2[3]);
            sb4.append(str2);
            return sb4.toString();
        }
        if (iArrM121817l[2] == 0) {
            sb4.append((CharSequence) str, 0, iArrM121817l2[2]);
            sb4.append(str2);
            return sb4.toString();
        }
        int i13 = iArrM121817l[1];
        if (i13 != 0) {
            int i14 = iArrM121817l2[0] + 1;
            sb4.append((CharSequence) str, 0, i14);
            sb4.append(str2);
            return m121822q(sb4, iArrM121817l[1] + i14, i14 + iArrM121817l[2]);
        }
        if (str2.charAt(i13) == '/') {
            sb4.append((CharSequence) str, 0, iArrM121817l2[1]);
            sb4.append(str2);
            int i15 = iArrM121817l2[1];
            return m121822q(sb4, i15, iArrM121817l[2] + i15);
        }
        int i16 = iArrM121817l2[0] + 2;
        int i17 = iArrM121817l2[1];
        if (i16 >= i17 || i17 != iArrM121817l2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrM121817l2[2] - 1);
            int i18 = iLastIndexOf == -1 ? iArrM121817l2[1] : iLastIndexOf + 1;
            sb4.append((CharSequence) str, 0, i18);
            sb4.append(str2);
            return m121822q(sb4, iArrM121817l2[1], i18 + iArrM121817l[2]);
        }
        sb4.append((CharSequence) str, 0, i17);
        sb4.append('/');
        sb4.append(str2);
        int i19 = iArrM121817l2[1];
        return m121822q(sb4, i19, iArrM121817l[2] + i19 + 1);
    }

    /* JADX INFO: renamed from: s */
    public static Uri m121824s(String str, String str2) {
        return Uri.parse(m121823r(str, str2));
    }

    /* JADX INFO: renamed from: t */
    public static void m121825t(MediaFormat mediaFormat, List list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            mediaFormat.setByteBuffer(AbstractC2875y.m8295h(i13, "csd-"), ByteBuffer.wrap((byte[]) list.get(i13)));
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m121826u(String str, String str2) {
        synchronized (f162976b) {
            Log.w(str, m121806a(str2, null));
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m121827v(String str, String str2, Throwable th3) {
        synchronized (f162976b) {
            Log.w(str, m121806a(str2, th3));
        }
    }
}
