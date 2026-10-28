package wd3;

import ce3.C4500c;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import live.hms.video.utils.HMSConstantsKt;
import m83.AbstractC25260n;
import m83.C25271y;
import ne3.C26616h;
import ne3.InterfaceC26620j;
import ne3.InterfaceC26633p0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import r80.AbstractC31061c;
import ud3.C34807d0;
import ud3.C34810e0;
import ud3.C34826l0;
import ud3.C34850x0;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: wd3.h */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC37174h {

    /* JADX INFO: renamed from: a */
    public static final TimeZone f158962a;

    /* JADX INFO: renamed from: b */
    public static final String f158963b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        AbstractC22676k.m65747g(timeZone);
        f158962a = timeZone;
        f158963b = AbstractC39414r.m125900s0(AbstractC39414r.m125898q0(C34826l0.class.getName(), "okhttp3."), "Client");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m119134a(C34810e0 c34810e0, C34810e0 other) {
        AbstractC22676k.m65750j(c34810e0, "<this>");
        AbstractC22676k.m65750j(other, "other");
        return AbstractC22676k.m65745e(c34810e0.f146565d, other.f146565d) && c34810e0.f146566e == other.f146566e && AbstractC22676k.m65745e(c34810e0.f146562a, other.f146562a);
    }

    /* JADX INFO: renamed from: b */
    public static final int m119135b(String str, long j7, TimeUnit unit) {
        AbstractC22676k.m65750j(unit, "unit");
        if (j7 < 0) {
            throw new IllegalStateException(str.concat(" < 0").toString());
        }
        long millis = unit.toMillis(j7);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(str.concat(" too large").toString());
        }
        if (millis != 0 || j7 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(str.concat(" too small").toString());
    }

    /* JADX INFO: renamed from: c */
    public static final void m119136c(Socket socket) {
        AbstractC22676k.m65750j(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e5) {
            throw e5;
        } catch (RuntimeException e13) {
            if (!AbstractC22676k.m65745e(e13.getMessage(), "bio == null")) {
                throw e13;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static final String m119137d(String format, Object... objArr) {
        AbstractC22676k.m65750j(format, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* JADX INFO: renamed from: e */
    public static final long m119138e(C34850x0 c34850x0) {
        String strM109863a = c34850x0.f146777F.m109863a("Content-Length");
        if (strM109863a == null) {
            return -1L;
        }
        byte[] bArr = AbstractC37172f.f158958a;
        try {
            return Long.parseLong(strM109863a);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Charset m119139f(InterfaceC26620j interfaceC26620j, Charset charset) {
        AbstractC22676k.m65750j(interfaceC26620j, "<this>");
        AbstractC22676k.m65750j(charset, "default");
        int iMo79198Y0 = interfaceC26620j.mo79198Y0(AbstractC37172f.f158959b);
        if (iMo79198Y0 == -1) {
            return charset;
        }
        if (iMo79198Y0 == 0) {
            return AbstractC39397a.f169546a;
        }
        if (iMo79198Y0 == 1) {
            return AbstractC39397a.f169547b;
        }
        if (iMo79198Y0 == 2) {
            Charset charset2 = AbstractC39397a.f169546a;
            Charset charset3 = AbstractC39397a.f169551f;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            AbstractC22676k.m65749i(charsetForName, "forName(...)");
            AbstractC39397a.f169551f = charsetForName;
            return charsetForName;
        }
        if (iMo79198Y0 == 3) {
            return AbstractC39397a.f169548c;
        }
        if (iMo79198Y0 != 4) {
            throw new AssertionError();
        }
        Charset charset4 = AbstractC39397a.f169546a;
        Charset charset5 = AbstractC39397a.f169552g;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        AbstractC22676k.m65749i(charsetForName2, "forName(...)");
        AbstractC39397a.f169552g = charsetForName2;
        return charsetForName2;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m119140g(InterfaceC26633p0 interfaceC26633p0, int i13) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC22676k.m65750j(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jMo79280c = interfaceC26633p0.timeout().mo79281e() ? interfaceC26633p0.timeout().mo79280c() - jNanoTime : Long.MAX_VALUE;
        interfaceC26633p0.timeout().mo79275d(Math.min(jMo79280c, timeUnit.toNanos(i13)) + jNanoTime);
        try {
            C26616h c26616h = new C26616h();
            while (interfaceC26633p0.mo9164h1(c26616h, HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE) != -1) {
                c26616h.m79200b();
            }
            if (jMo79280c == Long.MAX_VALUE) {
                interfaceC26633p0.timeout().mo79278a();
                return true;
            }
            interfaceC26633p0.timeout().mo79275d(jNanoTime + jMo79280c);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo79280c == Long.MAX_VALUE) {
                interfaceC26633p0.timeout().mo79278a();
                return false;
            }
            interfaceC26633p0.timeout().mo79275d(jNanoTime + jMo79280c);
            return false;
        } catch (Throwable th3) {
            if (jMo79280c == Long.MAX_VALUE) {
                interfaceC26633p0.timeout().mo79278a();
            } else {
                interfaceC26633p0.timeout().mo79275d(jNanoTime + jMo79280c);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final C34807d0 m119141h(List list) {
        C22677k0 c22677k0 = new C22677k0(2, false);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4500c c4500c = (C4500c) it.next();
            c22677k0.m65763d(c4500c.f18131a.m79265s(), c4500c.f18132b.m79265s());
        }
        return c22677k0.m65766g();
    }

    /* JADX INFO: renamed from: i */
    public static final String m119142i(C34810e0 c34810e0, boolean z4) {
        int i13;
        AbstractC22676k.m65750j(c34810e0, "<this>");
        int i14 = c34810e0.f146566e;
        String strM95633i = c34810e0.f146565d;
        if (AbstractC39414r.m125876U(strM95633i, ":", false)) {
            strM95633i = AbstractC31061c.m95633i(']', "[", strM95633i);
        }
        if (!z4) {
            String scheme = c34810e0.f146562a;
            AbstractC22676k.m65750j(scheme, "scheme");
            if (scheme.equals("http")) {
                i13 = 80;
            } else {
                i13 = scheme.equals("https") ? 443 : -1;
            }
            if (i14 == i13) {
                return strM95633i;
            }
        }
        return strM95633i + ':' + i14;
    }

    /* JADX INFO: renamed from: j */
    public static final List m119143j(List list) {
        AbstractC22676k.m65750j(list, "<this>");
        if (list.isEmpty()) {
            return C25271y.f99162w;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            AbstractC22676k.m65749i(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        AbstractC22676k.m65749i(array, "toArray(...)");
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC25260n.m74048W(array));
        AbstractC22676k.m65749i(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: k */
    public static final List m119144k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return C25271y.f99162w;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            AbstractC22676k.m65749i(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC25260n.m74048W((Object[]) objArr.clone()));
        AbstractC22676k.m65749i(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }
}
