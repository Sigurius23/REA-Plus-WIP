package okhttp3.internal.publicsuffix;

import com.google.crypto.tink.internal.C5099k0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import m83.AbstractC25265s;
import m83.C25271y;
import ne3.C26622k;
import ne3.C26624l;
import p437qt.C30582e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import xb3.AbstractC38176k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "qt/e", "okhttp"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: b */
    public static final C26624l f112933b;

    /* JADX INFO: renamed from: c */
    public static final List f112934c;

    /* JADX INFO: renamed from: d */
    public static final PublicSuffixDatabase f112935d;

    /* JADX INFO: renamed from: a */
    public final C5099k0 f112936a;

    static {
        byte[] bArrCopyOf = Arrays.copyOf(new byte[]{42}, 1);
        AbstractC22676k.m65749i(bArrCopyOf, "copyOf(...)");
        f112933b = new C26624l(bArrCopyOf);
        f112934c = AbstractC37056f.m118958J("*");
        f112935d = new PublicSuffixDatabase(new C5099k0(2));
    }

    public PublicSuffixDatabase(C5099k0 c5099k0) {
        this.f112936a = c5099k0;
    }

    /* JADX INFO: renamed from: b */
    public static List m84471b(String str) {
        List listM125905x0 = AbstractC39414r.m125905x0(str, new char[]{'.'}, 0, 6);
        return AbstractC22676k.m65745e(AbstractC25265s.m74112P0(listM125905x0), "") ? AbstractC25265s.m74086A0(1, listM125905x0) : listM125905x0;
    }

    /* JADX INFO: renamed from: a */
    public final String m84472a(String domain) {
        String strM93816d;
        String strM93816d2;
        String strM93816d3;
        List listM125905x0;
        int size;
        int size2;
        AbstractC22676k.m65750j(domain, "domain");
        String unicode = IDN.toUnicode(domain);
        AbstractC22676k.m65747g(unicode);
        List listM84471b = m84471b(unicode);
        C5099k0 c5099k0 = this.f112936a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) c5099k0.f21440y;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) c5099k0.f21441z).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z4 = false;
            while (true) {
                try {
                    try {
                        try {
                            c5099k0.m15994L();
                            break;
                        } catch (Throwable th3) {
                            if (z4) {
                                Thread.currentThread().interrupt();
                            }
                            throw th3;
                        }
                    } catch (IOException e5) {
                        c5099k0.f21438w = e5;
                        if (z4) {
                        }
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z4 = true;
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
        if (((C26624l) c5099k0.f21436E) == null) {
            StringBuilder sb4 = new StringBuilder("Unable to load ");
            sb4.append(c5099k0.f21439x);
            sb4.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb4.toString());
            illegalStateException.initCause((IOException) c5099k0.f21438w);
            throw illegalStateException;
        }
        int size3 = listM84471b.size();
        C26624l[] c26624lArr = new C26624l[size3];
        for (int i13 = 0; i13 < size3; i13++) {
            C26622k c26622k = C26624l.f105882z;
            c26624lArr[i13] = C26622k.m79241b((String) listM84471b.get(i13));
        }
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                strM93816d = null;
                break;
            }
            C26624l c26624l = (C26624l) c5099k0.f21436E;
            if (c26624l == null) {
                AbstractC22676k.m65757q("bytes");
                throw null;
            }
            strM93816d = C30582e.m93816d(c26624l, c26624lArr, i14);
            if (strM93816d != null) {
                break;
            }
            i14++;
        }
        if (size3 <= 1) {
            strM93816d2 = null;
            break;
        }
        C26624l[] c26624lArr2 = (C26624l[]) c26624lArr.clone();
        int length = c26624lArr2.length - 1;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                strM93816d2 = null;
                break;
            }
            c26624lArr2[i15] = f112933b;
            C26624l c26624l2 = (C26624l) c5099k0.f21436E;
            if (c26624l2 == null) {
                AbstractC22676k.m65757q("bytes");
                throw null;
            }
            strM93816d2 = C30582e.m93816d(c26624l2, c26624lArr2, i15);
            if (strM93816d2 != null) {
                break;
            }
            i15++;
        }
        if (strM93816d2 == null) {
            strM93816d3 = null;
            break;
        }
        int i16 = size3 - 1;
        int i17 = 0;
        while (true) {
            if (i17 >= i16) {
                strM93816d3 = null;
                break;
            }
            C26624l c26624l3 = (C26624l) c5099k0.f21437F;
            if (c26624l3 == null) {
                AbstractC22676k.m65757q("exceptionBytes");
                throw null;
            }
            strM93816d3 = C30582e.m93816d(c26624l3, c26624lArr, i17);
            if (strM93816d3 != null) {
                break;
            }
            i17++;
        }
        if (strM93816d3 != null) {
            listM125905x0 = AbstractC39414r.m125905x0("!".concat(strM93816d3), new char[]{'.'}, 0, 6);
        } else if (strM93816d == null && strM93816d2 == null) {
            listM125905x0 = f112934c;
        } else {
            List listM125905x1 = C25271y.f99162w;
            List listM125905x2 = strM93816d != null ? AbstractC39414r.m125905x0(strM93816d, new char[]{'.'}, 0, 6) : listM125905x1;
            if (strM93816d2 != null) {
                listM125905x1 = AbstractC39414r.m125905x0(strM93816d2, new char[]{'.'}, 0, 6);
            }
            listM125905x0 = listM125905x2.size() > listM125905x1.size() ? listM125905x2 : listM125905x1;
        }
        if (listM84471b.size() == listM125905x0.size() && ((String) listM125905x0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM125905x0.get(0)).charAt(0) == '!') {
            size = listM84471b.size();
            size2 = listM125905x0.size();
        } else {
            size = listM84471b.size();
            size2 = listM125905x0.size() + 1;
        }
        return AbstractC38176k.m122289y(AbstractC38176k.m122281q(AbstractC25265s.m74145r0(m84471b(domain)), size - size2), ".", null, null, 62);
    }
}
