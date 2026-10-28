package i92;

import android.text.TextUtils;
import bh3.InterfaceC3260g;
import e50.C12723b;
import ge3.AbstractC15751g;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kh3.C22488a;
import lh3.AbstractC24088k;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p211i5.C18090c;
import pg3.C29218v0;
import qr2.AbstractC30556a;
import ud3.AbstractC34799a1;
import ud3.C34850x0;
import ud3.C34854z0;
import xg3.AbstractC38284k;
import xg3.C38280g;
import ze1.C40588d;

/* JADX INFO: renamed from: i92.s */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18274s {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC3260g f71121a = new C18090c(9);

    /* JADX INFO: renamed from: c */
    public static <T> AbstractC24088k m52638c(C38280g<T> c38280g) {
        C40588d c40588dM131622Y = C40588d.m131622Y();
        c38280g.m122663M(c40588dM131622Y);
        return c40588dM131622Y;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m52639d(Throwable th3) {
        while (th3 != null) {
            if ((th3 instanceof UnknownHostException) || (th3 instanceof SocketTimeoutException) || (th3 instanceof SocketException)) {
                return true;
            }
            th3 = th3.getCause();
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    private static <T> C38280g<C29218v0<T>> m52640e(C38280g<C29218v0<T>> c38280g, final C18271p c18271p) {
        return c38280g.m122658H(new InterfaceC3260g() { // from class: i92.r
            @Override // bh3.InterfaceC3260g
            /* JADX INFO: renamed from: b */
            public final Object mo1678b(Object obj) {
                return AbstractC18274s.m52643h(c18271p, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static String m52641f(C29218v0<?> c29218v0) {
        return c29218v0.f118269a.f146792z + ": " + c29218v0.f118269a.f146791y;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m52642g(C29218v0<?> c29218v0) {
        return c29218v0 != null && c29218v0.f118269a.f146788Q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static C29218v0 m52643h(C18271p c18271p, Throwable th3) {
        m52645j(c18271p, th3, "converting to response");
        C34854z0 c34854z0 = AbstractC34799a1.f146522x;
        return C29218v0.m88723a(650, AbstractC12350b.m34590k("", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static C29218v0 m52644i(String str, C18271p c18271p, C29218v0 c29218v0) {
        C34850x0 c34850x0 = c29218v0.f118269a;
        int i13 = c34850x0.f146792z;
        if (!c34850x0.f146788Q && i13 < 400) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            StringBuilder sb4 = new StringBuilder("Response unsuccessful: ");
            sb4.append(!zIsEmpty ? AbstractC2875y.m8299l(str, ": ") : "");
            sb4.append(m52641f(c29218v0));
            String string = sb4.toString();
            if (i13 == 304) {
                C12723b.m35566a().m35569d().mo85214e("Web Error", string, new AbstractC30556a.a[0]);
                return c29218v0;
            }
            C12723b.m35566a().m35569d().mo85215f("Web Error", string, c18271p, new AbstractC30556a.a[0]);
        }
        return c29218v0;
    }

    /* JADX INFO: renamed from: j */
    private static void m52645j(C18271p c18271p, Throwable th3, String str) {
        StringBuilder sb4 = new StringBuilder("Caught network error, ");
        sb4.append(str);
        boolean zM52639d = m52639d(th3);
        if (zM52639d) {
            sb4.append(" (Network IO Exception)");
        } else {
            c18271p.m52635a(th3);
        }
        sb4.append("(networkState=");
        sb4.append(((InterfaceC18260e) AbstractC15751g.m44472y(InterfaceC18260e.class, null, null)).mo52606c());
        sb4.append(")");
        if (zM52639d) {
            C12723b.m35566a().m35569d().mo85225p("Web Error", sb4.toString(), new AbstractC30556a.a[0]);
        } else {
            C12723b.m35566a().m35569d().mo85221l("Web Error", sb4.toString(), c18271p, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: k */
    public static <T> C38280g<C29218v0<T>> m52646k(C38280g<C29218v0<T>> c38280g, final String str, final C18271p c18271p) {
        return (C38280g<C29218v0<T>>) c38280g.m122682x(new InterfaceC3260g() { // from class: i92.q
            @Override // bh3.InterfaceC3260g
            /* JADX INFO: renamed from: b */
            public final Object mo1678b(Object obj) {
                return AbstractC18274s.m52644i(str, c18271p, (C29218v0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static Exception m52647l(Throwable th3) {
        return new C18266k(th3).m52622e();
    }

    /* JADX INFO: renamed from: m */
    public static <T> AbstractC24088k m52648m(C38280g<C29218v0<T>> c38280g) {
        return m52649n(c38280g, null);
    }

    /* JADX INFO: renamed from: n */
    public static <T> AbstractC24088k m52649n(C38280g<C29218v0<T>> c38280g, String str) {
        return m52650o(c38280g, str, C22488a.m64989a().f88182b);
    }

    /* JADX INFO: renamed from: o */
    public static <T> AbstractC24088k m52650o(C38280g<C29218v0<T>> c38280g, String str, AbstractC38284k abstractC38284k) {
        C18271p c18271p = new C18271p();
        return m52638c(m52646k(m52640e(c38280g.m122665P(abstractC38284k), c18271p), str, c18271p));
    }
}
