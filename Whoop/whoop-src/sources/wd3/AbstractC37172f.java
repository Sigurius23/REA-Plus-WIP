package wd3;

import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import ne3.AbstractC26604b;
import ne3.AbstractC26632p;
import ne3.C26607c0;
import ne3.C26611e0;
import ne3.C26616h;
import ne3.C26622k;
import ne3.C26624l;
import ne3.InterfaceC26620j;
import p715kotlin.jvm.internal.AbstractC22676k;
import xd3.C38222e;
import yb0.AbstractC39383f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: wd3.f */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC37172f {

    /* JADX INFO: renamed from: a */
    public static final byte[] f158958a = new byte[0];

    /* JADX INFO: renamed from: b */
    public static final C26607c0 f158959b;

    static {
        C26622k c26622k = C26624l.f105882z;
        f158959b = AbstractC26604b.m79161f(C26622k.m79240a("efbbbf"), C26622k.m79240a("feff"), C26622k.m79240a("fffe0000"), C26622k.m79240a("fffe"), C26622k.m79240a("0000feff"));
    }

    /* JADX INFO: renamed from: a */
    public static final void m119116a(long j7, long j13, long j14) {
        if ((j13 | j14) < 0 || j13 > j7 || j7 - j13 < j14) {
            StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "length=", ", offset=");
            sbM125596b.append(j13);
            sbM125596b.append(", count=");
            sbM125596b.append(j13);
            throw new ArrayIndexOutOfBoundsException(sbM125596b.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m119117b(Closeable closeable) {
        AbstractC22676k.m65750j(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m119118c(AbstractC26632p abstractC26632p, C26611e0 c26611e0) throws IOException {
        AbstractC22676k.m65750j(abstractC26632p, "<this>");
        try {
            IOException iOException = null;
            for (C26611e0 c26611e1 : abstractC26632p.mo79147J(c26611e0)) {
                try {
                    if (abstractC26632p.m79271T(c26611e1).f104373c) {
                        m119118c(abstractC26632p, c26611e1);
                    }
                    abstractC26632p.mo79153m(c26611e1);
                } catch (IOException e5) {
                    if (iOException == null) {
                        iOException = e5;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m119119d(C38222e c38222e, C26611e0 path) {
        AbstractC22676k.m65750j(c38222e, "<this>");
        AbstractC22676k.m65750j(path, "path");
        try {
            c38222e.mo79153m(path);
        } catch (FileNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static final int m119120e(char c3, int i13, int i14, String str) {
        AbstractC22676k.m65750j(str, "<this>");
        while (i13 < i14) {
            if (str.charAt(i13) == c3) {
                return i13;
            }
            i13++;
        }
        return i14;
    }

    /* JADX INFO: renamed from: f */
    public static final int m119121f(int i13, int i14, String str, String str2) {
        AbstractC22676k.m65750j(str, "<this>");
        while (i13 < i14) {
            if (AbstractC39414r.m125875T(str2, str.charAt(i13), false)) {
                return i13;
            }
            i13++;
        }
        return i14;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m119122g(String str, char c3, int i13, int i14, int i15) {
        if ((i15 & 2) != 0) {
            i13 = 0;
        }
        if ((i15 & 4) != 0) {
            i14 = str.length();
        }
        return m119120e(c3, i13, i14, str);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m119123h(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC22676k.m65750j(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static final int m119124i(String str) {
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (AbstractC22676k.m65751k(cCharAt, 31) <= 0 || AbstractC22676k.m65751k(cCharAt, 127) >= 0) {
                return i13;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public static final int m119125j(int i13, int i14, String str) {
        AbstractC22676k.m65750j(str, "<this>");
        while (i13 < i14) {
            char cCharAt = str.charAt(i13);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i13;
            }
            i13++;
        }
        return i14;
    }

    /* JADX INFO: renamed from: k */
    public static final int m119126k(int i13, int i14, String str) {
        AbstractC22676k.m65750j(str, "<this>");
        int i15 = i14 - 1;
        if (i13 <= i15) {
            while (true) {
                char cCharAt = str.charAt(i15);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i15 + 1;
                }
                if (i15 == i13) {
                    break;
                }
                i15--;
            }
        }
        return i13;
    }

    /* JADX INFO: renamed from: l */
    public static final String[] m119127l(String[] strArr, String[] other, Comparator comparator) {
        AbstractC22676k.m65750j(strArr, "<this>");
        AbstractC22676k.m65750j(other, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m119128m(String name) {
        AbstractC22676k.m65750j(name, "name");
        return name.equalsIgnoreCase(TokenAuthInterceptor.AUTH_HEADER) || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    /* JADX INFO: renamed from: n */
    public static final int m119129n(char c3) {
        if ('0' <= c3 && c3 < ':') {
            return c3 - '0';
        }
        if ('a' <= c3 && c3 < 'g') {
            return c3 - 'W';
        }
        if ('A' > c3 || c3 >= 'G') {
            return -1;
        }
        return c3 - '7';
    }

    /* JADX INFO: renamed from: o */
    public static final int m119130o(InterfaceC26620j interfaceC26620j) {
        AbstractC22676k.m65750j(interfaceC26620j, "<this>");
        return (interfaceC26620j.readByte() & 255) | ((interfaceC26620j.readByte() & 255) << 16) | ((interfaceC26620j.readByte() & 255) << 8);
    }

    /* JADX INFO: renamed from: p */
    public static final int m119131p(C26616h c26616h) {
        int i13 = 0;
        while (!c26616h.mo79222o() && c26616h.m79229s(0L) == 61) {
            i13++;
            c26616h.readByte();
        }
        return i13;
    }

    /* JADX INFO: renamed from: q */
    public static final int m119132q(int i13, String str) {
        if (str == null) {
            return i13;
        }
        try {
            long j7 = Long.parseLong(str);
            if (j7 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j7 < 0) {
                return 0;
            }
            return (int) j7;
        } catch (NumberFormatException unused) {
            return i13;
        }
    }

    /* JADX INFO: renamed from: r */
    public static final String m119133r(int i13, int i14, String str) {
        int iM119125j = m119125j(i13, i14, str);
        String strSubstring = str.substring(iM119125j, m119126k(iM119125j, i14, str));
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }
}
