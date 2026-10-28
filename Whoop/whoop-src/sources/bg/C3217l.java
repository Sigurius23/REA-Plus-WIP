package bg;

import java.util.LinkedHashMap;
import java.util.List;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: bg.l */
/* JADX INFO: loaded from: classes.dex */
public final class C3217l {

    /* JADX INFO: renamed from: c */
    public static final C3217l f12583c;

    /* JADX INFO: renamed from: d */
    public static final C3217l f12584d;

    /* JADX INFO: renamed from: e */
    public static final LinkedHashMap f12585e;

    /* JADX INFO: renamed from: a */
    public final String f12586a;

    /* JADX INFO: renamed from: b */
    public final int f12587b;

    static {
        C3217l c3217l = new C3217l("https", 443);
        f12583c = c3217l;
        C3217l c3217l2 = new C3217l("http", 80);
        f12584d = c3217l2;
        List listM118959K = AbstractC37056f.m118959K(c3217l2, c3217l, new C3217l("ws", 80), new C3217l("wss", 443));
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(listM118959K, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : listM118959K) {
            linkedHashMap.put(((C3217l) obj).f12586a, obj);
        }
        f12585e = linkedHashMap;
    }

    public C3217l(String protocolName, int i13) {
        AbstractC22676k.m65750j(protocolName, "protocolName");
        this.f12586a = protocolName;
        this.f12587b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3217l)) {
            return false;
        }
        C3217l c3217l = (C3217l) obj;
        return AbstractC22676k.m65745e(this.f12586a, c3217l.f12586a) && this.f12587b == c3217l.f12587b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12587b) + (this.f12586a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Scheme(protocolName=");
        sb4.append(this.f12586a);
        sb4.append(", defaultPort=");
        return AbstractC11895b.m31999r(sb4, this.f12587b, ')');
    }
}
