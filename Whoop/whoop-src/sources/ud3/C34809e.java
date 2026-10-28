package ud3;

import ae3.C0803k;
import androidx.room.AbstractC1772c1;
import com.iterable.iterableapi.C5378v;
import fe3.AbstractC14421e;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m83.C25262p;
import m83.C25271y;
import ne3.AbstractC26602a;
import ne3.AbstractC26604b;
import ne3.C26614g;
import ne3.C26616h;
import ne3.C26617h0;
import ne3.C26621j0;
import ne3.C26622k;
import ne3.C26624l;
import ne3.InterfaceC26633p0;
import p031b9.C2817b;
import p460rg.AbstractC31366a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import va3.AbstractC35854l;
import wd3.AbstractC37174h;

/* JADX INFO: renamed from: ud3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C34809e {

    /* JADX INFO: renamed from: k */
    public static final String f146550k;

    /* JADX INFO: renamed from: l */
    public static final String f146551l;

    /* JADX INFO: renamed from: a */
    public final C34810e0 f146552a;

    /* JADX INFO: renamed from: b */
    public final C34807d0 f146553b;

    /* JADX INFO: renamed from: c */
    public final String f146554c;

    /* JADX INFO: renamed from: d */
    public final EnumC34828m0 f146555d;

    /* JADX INFO: renamed from: e */
    public final int f146556e;

    /* JADX INFO: renamed from: f */
    public final String f146557f;

    /* JADX INFO: renamed from: g */
    public final C34807d0 f146558g;

    /* JADX INFO: renamed from: h */
    public final C34804c0 f146559h;

    /* JADX INFO: renamed from: i */
    public final long f146560i;

    /* JADX INFO: renamed from: j */
    public final long f146561j;

    static {
        AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
        AbstractC14421e.f52594a.getClass();
        f146550k = "OkHttp-Sent-Millis";
        AbstractC14421e.f52594a.getClass();
        f146551l = "OkHttp-Received-Millis";
    }

    public C34809e(InterfaceC26633p0 rawSource) throws IOException {
        C34810e0 c34810e0M16526b;
        EnumC34805c1 enumC34805c1M109916d;
        AbstractC22676k.m65750j(rawSource, "rawSource");
        try {
            C26621j0 c26621j0M79158c = AbstractC26604b.m79158c(rawSource);
            String strMo79187M = c26621j0M79158c.mo79187M(Long.MAX_VALUE);
            try {
                C5378v c5378v = new C5378v(1);
                c5378v.m16528d(null, strMo79187M);
                c34810e0M16526b = c5378v.m16526b();
            } catch (IllegalArgumentException unused) {
                c34810e0M16526b = null;
            }
            if (c34810e0M16526b == null) {
                IOException iOException = new IOException("Cache corruption for ".concat(strMo79187M));
                AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
                AbstractC14421e.f52594a.mo41121j("cache corruption", 5, iOException);
                throw iOException;
            }
            this.f146552a = c34810e0M16526b;
            this.f146554c = c26621j0M79158c.mo79187M(Long.MAX_VALUE);
            C22677k0 c22677k0 = new C22677k0(2, false);
            int iM96480t = AbstractC31366a.m96480t(c26621j0M79158c);
            for (int i13 = 0; i13 < iM96480t; i13++) {
                c22677k0.m65762c(c26621j0M79158c.mo79187M(Long.MAX_VALUE));
            }
            this.f146553b = c22677k0.m65766g();
            C0803k c0803kM5372I = AbstractC1772c1.m5372I(c26621j0M79158c.mo79187M(Long.MAX_VALUE));
            this.f146555d = (EnumC34828m0) c0803kM5372I.f2965c;
            this.f146556e = c0803kM5372I.f2964b;
            this.f146557f = (String) c0803kM5372I.f2966d;
            C22677k0 c22677k1 = new C22677k0(2, false);
            int iM96480t2 = AbstractC31366a.m96480t(c26621j0M79158c);
            for (int i14 = 0; i14 < iM96480t2; i14++) {
                c22677k1.m65762c(c26621j0M79158c.mo79187M(Long.MAX_VALUE));
            }
            String str = f146550k;
            String strM65767h = c22677k1.m65767h(str);
            String str2 = f146551l;
            String strM65767h2 = c22677k1.m65767h(str2);
            c22677k1.m65769j(str);
            c22677k1.m65769j(str2);
            this.f146560i = strM65767h != null ? Long.parseLong(strM65767h) : 0L;
            this.f146561j = strM65767h2 != null ? Long.parseLong(strM65767h2) : 0L;
            this.f146558g = c22677k1.m65766g();
            if (this.f146552a.m109877f()) {
                String strMo79187M2 = c26621j0M79158c.mo79187M(Long.MAX_VALUE);
                if (strMo79187M2.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strMo79187M2 + '\"');
                }
                C34831o c34831oM109918c = C34831o.f146692b.m109918c(c26621j0M79158c.mo79187M(Long.MAX_VALUE));
                List listM109869a = m109869a(c26621j0M79158c);
                List listM109869a2 = m109869a(c26621j0M79158c);
                if (c26621j0M79158c.mo79222o()) {
                    enumC34805c1M109916d = EnumC34805c1.SSL_3_0;
                } else {
                    C34841t c34841t = EnumC34805c1.f146539x;
                    String strMo79187M3 = c26621j0M79158c.mo79187M(Long.MAX_VALUE);
                    c34841t.getClass();
                    enumC34805c1M109916d = C34841t.m109916d(strMo79187M3);
                }
                this.f146559h = new C34804c0(enumC34805c1M109916d, c34831oM109918c, AbstractC37174h.m119143j(listM109869a2), new C25262p(AbstractC37174h.m119143j(listM109869a), 15));
            } else {
                this.f146559h = null;
            }
            rawSource.close();
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(rawSource, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static List m109869a(C26621j0 c26621j0) throws IOException {
        int iM96480t = AbstractC31366a.m96480t(c26621j0);
        if (iM96480t == -1) {
            return C25271y.f99162w;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iM96480t);
            for (int i13 = 0; i13 < iM96480t; i13++) {
                String strMo79187M = c26621j0.mo79187M(Long.MAX_VALUE);
                C26616h c26616h = new C26616h();
                C26622k c26622k = C26624l.f105882z;
                byte[] bArrM79145a = AbstractC26602a.m79145a(strMo79187M);
                C26624l c26624l = bArrM79145a != null ? new C26624l(bArrM79145a) : null;
                if (c26624l == null) {
                    throw new IOException("Corrupt certificate in cache entry");
                }
                c26616h.m79217l1(c26624l);
                arrayList.add(certificateFactory.generateCertificate(new C26614g(c26616h)));
            }
            return arrayList;
        } catch (CertificateException e5) {
            throw new IOException(e5.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m109870b(C26617h0 c26617h0, List list) throws IOException {
        try {
            c26617h0.mo79209h0(list.size());
            c26617h0.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                C26622k c26622k = C26624l.f105882z;
                AbstractC22676k.m65747g(encoded);
                c26617h0.mo79193S(AbstractC26602a.m79146b(C26622k.m79242c(-1234567890, encoded).f105883w));
                c26617h0.writeByte(10);
            }
        } catch (CertificateEncodingException e5) {
            throw new IOException(e5.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m109871c(C2817b c2817b) {
        C34810e0 c34810e0 = this.f146552a;
        C34804c0 c34804c0 = this.f146559h;
        C34807d0 c34807d0 = this.f146558g;
        C34807d0 c34807d1 = this.f146553b;
        C26617h0 c26617h0M79157b = AbstractC26604b.m79157b(c2817b.m8016s(0));
        try {
            c26617h0M79157b.mo79193S(c34810e0.f146570i);
            c26617h0M79157b.writeByte(10);
            c26617h0M79157b.mo79193S(this.f146554c);
            c26617h0M79157b.writeByte(10);
            c26617h0M79157b.mo79209h0(c34807d1.size());
            c26617h0M79157b.writeByte(10);
            int size = c34807d1.size();
            for (int i13 = 0; i13 < size; i13++) {
                c26617h0M79157b.mo79193S(c34807d1.m109864c(i13));
                c26617h0M79157b.mo79193S(": ");
                c26617h0M79157b.mo79193S(c34807d1.m109867g(i13));
                c26617h0M79157b.writeByte(10);
            }
            EnumC34828m0 protocol = this.f146555d;
            int i14 = this.f146556e;
            String message = this.f146557f;
            AbstractC22676k.m65750j(protocol, "protocol");
            AbstractC22676k.m65750j(message, "message");
            StringBuilder sb4 = new StringBuilder();
            if (protocol == EnumC34828m0.HTTP_1_0) {
                sb4.append("HTTP/1.0");
            } else {
                sb4.append("HTTP/1.1");
            }
            sb4.append(' ');
            sb4.append(i14);
            sb4.append(' ');
            sb4.append(message);
            c26617h0M79157b.mo79193S(sb4.toString());
            c26617h0M79157b.writeByte(10);
            c26617h0M79157b.mo79209h0(c34807d0.size() + 2);
            c26617h0M79157b.writeByte(10);
            int size2 = c34807d0.size();
            for (int i15 = 0; i15 < size2; i15++) {
                c26617h0M79157b.mo79193S(c34807d0.m109864c(i15));
                c26617h0M79157b.mo79193S(": ");
                c26617h0M79157b.mo79193S(c34807d0.m109867g(i15));
                c26617h0M79157b.writeByte(10);
            }
            c26617h0M79157b.mo79193S(f146550k);
            c26617h0M79157b.mo79193S(": ");
            c26617h0M79157b.mo79209h0(this.f146560i);
            c26617h0M79157b.writeByte(10);
            c26617h0M79157b.mo79193S(f146551l);
            c26617h0M79157b.mo79193S(": ");
            c26617h0M79157b.mo79209h0(this.f146561j);
            c26617h0M79157b.writeByte(10);
            if (c34810e0.m109877f()) {
                c26617h0M79157b.writeByte(10);
                AbstractC22676k.m65747g(c34804c0);
                c26617h0M79157b.mo79193S(c34804c0.f146532b.f146711a);
                c26617h0M79157b.writeByte(10);
                m109870b(c26617h0M79157b, c34804c0.m109862a());
                m109870b(c26617h0M79157b, c34804c0.f146533c);
                c26617h0M79157b.mo79193S(c34804c0.f146531a.f146542w);
                c26617h0M79157b.writeByte(10);
            }
            c26617h0M79157b.close();
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(c26617h0M79157b, th3);
                throw th4;
            }
        }
    }

    public C34809e(C34850x0 c34850x0) {
        C34807d0 c34807d0M65766g;
        C34832o0 c34832o0 = c34850x0.f146789w;
        this.f146552a = c34832o0.f146712a;
        C34850x0 c34850x1 = c34850x0.f146780I;
        AbstractC22676k.m65747g(c34850x1);
        C34807d0 c34807d0 = c34850x1.f146789w.f146714c;
        C34807d0 c34807d1 = c34850x0.f146777F;
        Set setM96481u = AbstractC31366a.m96481u(c34807d1);
        if (setM96481u.isEmpty()) {
            c34807d0M65766g = C34807d0.f146547x;
        } else {
            C22677k0 c22677k0 = new C22677k0(2, false);
            int size = c34807d0.size();
            for (int i13 = 0; i13 < size; i13++) {
                String strM109864c = c34807d0.m109864c(i13);
                if (setM96481u.contains(strM109864c)) {
                    c22677k0.m65761b(strM109864c, c34807d0.m109867g(i13));
                }
            }
            c34807d0M65766g = c22677k0.m65766g();
        }
        this.f146553b = c34807d0M65766g;
        this.f146554c = c34832o0.f146713b;
        this.f146555d = c34850x0.f146790x;
        this.f146556e = c34850x0.f146792z;
        this.f146557f = c34850x0.f146791y;
        this.f146558g = c34807d1;
        this.f146559h = c34850x0.f146776E;
        this.f146560i = c34850x0.f146783L;
        this.f146561j = c34850x0.f146784M;
    }
}
