package i63;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import hg3.AbstractC17269i;
import i93.C18277c;
import io.ktor.http.URLDecodeException;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p002a0.C0006a1;
import p040c0.C3783u0;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import v63.C35747e;
import w63.AbstractC36867b;
import w63.C36866a;
import wb3.AbstractC37056f;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: i63.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18157a {

    /* JADX INFO: renamed from: a */
    public static final Set f70461a;

    /* JADX INFO: renamed from: b */
    public static final Set f70462b;

    /* JADX INFO: renamed from: c */
    public static final Set f70463c;

    /* JADX INFO: renamed from: d */
    public static final ArrayList f70464d;

    /* JADX INFO: renamed from: e */
    public static final Set f70465e;

    /* JADX INFO: renamed from: f */
    public static final ArrayList f70466f;

    static {
        Character chValueOf = Character.valueOf(DateTimeRange.lowerUpperDelimiter);
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(AbstractC25265s.m74126d1(new C18277c('a', 'z'), new C18277c('A', 'Z')), new C18277c('0', '9'));
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM74129g1, 10));
        Iterator it = arrayListM74129g1.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f70461a = AbstractC25265s.m74103I1(arrayList);
        f70462b = AbstractC25265s.m74103I1(AbstractC25265s.m74129g1(AbstractC25265s.m74126d1(new C18277c('a', 'z'), new C18277c('A', 'Z')), new C18277c('0', '9')));
        f70463c = AbstractC25265s.m74103I1(AbstractC25265s.m74129g1(AbstractC25265s.m74126d1(new C18277c('a', 'f'), new C18277c('A', 'F')), new C18277c('0', '9')));
        Set setM74059b1 = AbstractC25260n.m74059b1(new Character[]{':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', chValueOf, ';', '=', '-', '.', '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(setM74059b1, 10));
        Iterator it3 = setM74059b1.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        f70464d = arrayList2;
        f70465e = AbstractC25260n.m74059b1(new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', chValueOf, ';', '=', '-', '.', '_', '~'});
        AbstractC12350b.m34556E(f70462b, AbstractC25260n.m74059b1(new Character[]{'!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'}));
        List listM118959K = AbstractC37056f.m118959K('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM118959K, 10));
        Iterator it4 = listM118959K.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it4.next()).charValue()));
        }
        f70466f = arrayList3;
    }

    /* JADX INFO: renamed from: a */
    public static final String m52151a(byte b) {
        int i13 = (b & 255) >> 4;
        int i14 = b & 15;
        return new String(new char[]{'%', (char) ((i13 < 0 || i13 >= 10) ? ((char) (i13 + 65)) - '\n' : i13 + 48), (char) ((i14 < 0 || i14 >= 10) ? ((char) (i14 + 65)) - '\n' : i14 + 48)});
    }

    /* JADX INFO: renamed from: b */
    public static final int m52152b(char c3) {
        if ('0' <= c3 && c3 < ':') {
            return c3 - '0';
        }
        if ('A' <= c3 && c3 < 'G') {
            return c3 - '7';
        }
        if ('a' > c3 || c3 >= 'g') {
            return -1;
        }
        return c3 - 'W';
    }

    /* JADX INFO: renamed from: c */
    public static final String m52153c(String str, int i13, int i14, boolean z4, Charset charset) throws URLDecodeException {
        int i15 = i13;
        while (i15 < i14) {
            char cCharAt = str.charAt(i15);
            if (cCharAt == '%' || (z4 && cCharAt == '+')) {
                int i16 = i14 - i13;
                if (i16 > 255) {
                    i16 /= 3;
                }
                StringBuilder sb4 = new StringBuilder(i16);
                if (i15 > i13) {
                    sb4.append((CharSequence) str, i13, i15);
                }
                byte[] bArr = null;
                while (i15 < i14) {
                    char cCharAt2 = str.charAt(i15);
                    if (z4 && cCharAt2 == '+') {
                        sb4.append(' ');
                    } else if (cCharAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i14 - i15) / 3];
                        }
                        int i17 = 0;
                        while (i15 < i14 && str.charAt(i15) == '%') {
                            int i18 = i15 + 2;
                            if (i18 >= i14) {
                                throw new URLDecodeException("Incomplete trailing HEX escape: " + str.subSequence(i15, str.length()).toString() + ", in " + ((Object) str) + " at " + i15);
                            }
                            int i19 = i15 + 1;
                            int iM52152b = m52152b(str.charAt(i19));
                            int iM52152b2 = m52152b(str.charAt(i18));
                            if (iM52152b == -1 || iM52152b2 == -1) {
                                throw new URLDecodeException("Wrong HEX escape: %" + str.charAt(i19) + str.charAt(i18) + ", in " + ((Object) str) + ", at " + i15);
                            }
                            bArr[i17] = (byte) ((iM52152b * 16) + iM52152b2);
                            i15 += 3;
                            i17++;
                        }
                        sb4.append(new String(bArr, 0, i17, charset));
                    } else {
                        sb4.append(cCharAt2);
                    }
                    i15++;
                }
                String string = sb4.toString();
                AbstractC22676k.m65749i(string, "sb.toString()");
                return string;
            }
            i15++;
        }
        if (i13 == 0 && i14 == str.length()) {
            return str.toString();
        }
        String strSubstring = str.substring(i13, i14);
        AbstractC22676k.m65749i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: d */
    public static String m52154d(String str) {
        int length = str.length();
        Charset charset = AbstractC39397a.f169546a;
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(charset, "charset");
        return m52153c(str, 0, length, false, charset);
    }

    /* JADX INFO: renamed from: e */
    public static String m52155e(int i13, int i14, int i15, String str, boolean z4) {
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if ((i15 & 2) != 0) {
            i14 = str.length();
        }
        if ((i15 & 4) != 0) {
            z4 = false;
        }
        Charset charset = AbstractC39397a.f169546a;
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(charset, "charset");
        return m52153c(str, i13, i14, z4, charset);
    }

    /* JADX INFO: renamed from: f */
    public static final String m52156f(String str, boolean z4) {
        AbstractC22676k.m65750j(str, "<this>");
        StringBuilder sb4 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = AbstractC39397a.f169546a.newEncoder();
        AbstractC22676k.m65749i(charsetEncoderNewEncoder, "UTF_8.newEncoder()");
        m52158h(AbstractC17269i.m48862H(charsetEncoderNewEncoder, str, 0, str.length()), new C3783u0(sb4, z4));
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: g */
    public static final String m52157g(String str, boolean z4) {
        int i13;
        StringBuilder sb4 = new StringBuilder();
        Charset charset = AbstractC39397a.f169546a;
        int i14 = 0;
        while (i14 < str.length()) {
            char cCharAt = str.charAt(i14);
            if ((!z4 && cCharAt == '/') || f70462b.contains(Character.valueOf(cCharAt)) || f70465e.contains(Character.valueOf(cCharAt))) {
                sb4.append(cCharAt);
                i14++;
            } else {
                if (cCharAt == '%' && (i13 = i14 + 2) < str.length()) {
                    int i15 = i14 + 1;
                    Character chValueOf = Character.valueOf(str.charAt(i15));
                    Set set = f70463c;
                    if (set.contains(chValueOf) && set.contains(Character.valueOf(str.charAt(i13)))) {
                        sb4.append(cCharAt);
                        sb4.append(str.charAt(i15));
                        sb4.append(str.charAt(i13));
                        i14 += 3;
                    }
                }
                int i16 = (55296 > cCharAt || cCharAt >= 57344) ? 1 : 2;
                CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                AbstractC22676k.m65749i(charsetEncoderNewEncoder, "charset.newEncoder()");
                int i17 = i16 + i14;
                m52158h(AbstractC17269i.m48862H(charsetEncoderNewEncoder, str, i14, i17), new C0006a1(sb4, 26));
                i14 = i17;
            }
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: h */
    public static final void m52158h(C35747e c35747e, Function1 function1) {
        boolean z4 = true;
        C36866a c36866aM118252b = AbstractC36867b.m118252b(c35747e, 1);
        if (c36866aM118252b == null) {
            return;
        }
        while (true) {
            try {
                int i13 = c36866aM118252b.f77287c;
                int i14 = c36866aM118252b.f77286b;
                if (i13 > i14) {
                    if (i14 == i13) {
                        throw new EOFException("No readable bytes available.");
                    }
                    c36866aM118252b.f77286b = i14 + 1;
                    function1.invoke(Byte.valueOf(((ByteBuffer) c36866aM118252b.f77291g).get(i14)));
                    if (z4) {
                        AbstractC36867b.m118251a(c35747e, c36866aM118252b);
                    }
                    throw th;
                }
                try {
                    c36866aM118252b = AbstractC36867b.m118253c(c35747e, c36866aM118252b);
                    if (c36866aM118252b == null) {
                        return;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z4 = false;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }
}
