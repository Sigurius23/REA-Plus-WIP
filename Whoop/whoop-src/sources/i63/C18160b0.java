package i63;

import java.util.LinkedHashMap;
import java.util.List;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p088dc.AbstractC11895b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: i63.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18160b0 {

    /* JADX INFO: renamed from: c */
    public static final C18160b0 f70470c;

    /* JADX INFO: renamed from: d */
    public static final LinkedHashMap f70471d;

    /* JADX INFO: renamed from: a */
    public final String f70472a;

    /* JADX INFO: renamed from: b */
    public final int f70473b;

    static {
        C18160b0 c18160b0 = new C18160b0("http", 80);
        f70470c = c18160b0;
        List listM118959K = AbstractC37056f.m118959K(c18160b0, new C18160b0("https", 443), new C18160b0("ws", 80), new C18160b0("wss", 443), new C18160b0("socks", 1080));
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(listM118959K, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : listM118959K) {
            linkedHashMap.put(((C18160b0) obj).f70472a, obj);
        }
        f70471d = linkedHashMap;
    }

    public C18160b0(String str, int i13) {
        this.f70472a = str;
        this.f70473b = i13;
        for (int i14 = 0; i14 < str.length(); i14++) {
            char cCharAt = str.charAt(i14);
            if (Character.toLowerCase(cCharAt) != cCharAt) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18160b0)) {
            return false;
        }
        C18160b0 c18160b0 = (C18160b0) obj;
        return this.f70472a.equals(c18160b0.f70472a) && this.f70473b == c18160b0.f70473b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f70473b) + (this.f70472a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("URLProtocol(name=");
        sb4.append(this.f70472a);
        sb4.append(", defaultPort=");
        return AbstractC11895b.m31999r(sb4, this.f70473b, ')');
    }
}
