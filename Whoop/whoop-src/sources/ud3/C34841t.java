package ud3;

import e93.AbstractC12889b;
import i93.C18282h;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.LinkedHashMap;
import java.util.List;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ud3.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C34841t implements InterfaceC34845v, InterfaceC34808d1 {

    /* JADX INFO: renamed from: w */
    public static final C34841t f146748w = new C34841t();

    /* JADX INFO: renamed from: a */
    public static final C34831o m109914a(C34841t c34841t, String str) {
        C34831o c34831o = new C34831o(str);
        C34831o.f146694d.put(str, c34831o);
        return c34831o;
    }

    /* JADX INFO: renamed from: b */
    public static final void m109915b(StringBuilder sb4, List list) {
        C18282h c18282hM36268d0 = AbstractC12889b.m36268d0(2, AbstractC12889b.m36278i0(0, list.size()));
        int i13 = c18282hM36268d0.f71133w;
        int i14 = c18282hM36268d0.f71134x;
        int i15 = c18282hM36268d0.f71135y;
        if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i13);
            String str2 = (String) list.get(i13 + 1);
            if (i13 > 0) {
                sb4.append('&');
            }
            sb4.append(str);
            if (str2 != null) {
                sb4.append('=');
                sb4.append(str2);
            }
            if (i13 == i14) {
                return;
            } else {
                i13 += i15;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    public static EnumC34805c1 m109916d(String javaName) {
        AbstractC22676k.m65750j(javaName, "javaName");
        int iHashCode = javaName.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return EnumC34805c1.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return EnumC34805c1.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return EnumC34805c1.TLS_1_3;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return EnumC34805c1.TLS_1_0;
            }
        } else if (javaName.equals("SSLv3")) {
            return EnumC34805c1.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
    }

    /* JADX INFO: renamed from: e */
    public static EnumC34828m0 m109917e(String str) throws IOException {
        EnumC34828m0 enumC34828m0 = EnumC34828m0.HTTP_1_0;
        if (str.equals("http/1.0")) {
            return enumC34828m0;
        }
        EnumC34828m0 enumC34828m1 = EnumC34828m0.HTTP_1_1;
        if (str.equals("http/1.1")) {
            return enumC34828m1;
        }
        EnumC34828m0 enumC34828m2 = EnumC34828m0.H2_PRIOR_KNOWLEDGE;
        if (str.equals("h2_prior_knowledge")) {
            return enumC34828m2;
        }
        EnumC34828m0 enumC34828m3 = EnumC34828m0.HTTP_2;
        if (str.equals("h2")) {
            return enumC34828m3;
        }
        EnumC34828m0 enumC34828m4 = EnumC34828m0.SPDY_3;
        if (str.equals("spdy/3.1")) {
            return enumC34828m4;
        }
        EnumC34828m0 enumC34828m5 = EnumC34828m0.QUIC;
        if (str.equals("quic")) {
            return enumC34828m5;
        }
        EnumC34828m0 enumC34828m6 = EnumC34828m0.HTTP_3;
        if (AbstractC39421y.m125930O(str, "h3", false)) {
            return enumC34828m6;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    /* JADX INFO: renamed from: c */
    public synchronized C34831o m109918c(String javaName) {
        C34831o c34831o;
        String strConcat;
        try {
            AbstractC22676k.m65750j(javaName, "javaName");
            LinkedHashMap linkedHashMap = C34831o.f146694d;
            c34831o = (C34831o) linkedHashMap.get(javaName);
            if (c34831o == null) {
                if (AbstractC39421y.m125930O(javaName, "TLS_", false)) {
                    String strSubstring = javaName.substring(4);
                    AbstractC22676k.m65749i(strSubstring, "substring(...)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (AbstractC39421y.m125930O(javaName, "SSL_", false)) {
                    String strSubstring2 = javaName.substring(4);
                    AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = javaName;
                }
                c34831o = (C34831o) linkedHashMap.get(strConcat);
                if (c34831o == null) {
                    c34831o = new C34831o(javaName);
                }
                linkedHashMap.put(javaName, c34831o);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return c34831o;
    }

    @Override // ud3.InterfaceC34845v
    public List lookup(String hostname) throws UnknownHostException {
        AbstractC22676k.m65750j(hostname, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            AbstractC22676k.m65749i(allByName, "getAllByName(...)");
            return AbstractC25260n.m74049W0(allByName);
        } catch (NullPointerException e5) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostname));
            unknownHostException.initCause(e5);
            throw unknownHostException;
        }
    }
}
