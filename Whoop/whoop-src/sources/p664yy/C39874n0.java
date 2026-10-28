package p664yy;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: yy.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C39874n0 {

    /* JADX INFO: renamed from: a */
    public final int f172186a;

    /* JADX INFO: renamed from: b */
    public final Object f172187b;

    /* JADX INFO: renamed from: c */
    public final Map f172188c;

    /* JADX INFO: renamed from: d */
    public final boolean f172189d;

    /* JADX INFO: renamed from: e */
    public final boolean f172190e;

    /* JADX INFO: renamed from: f */
    public final C39858f0 f172191f;

    public C39874n0(int i13, String str, Map map) {
        this.f172186a = i13;
        this.f172187b = str;
        this.f172188c = map;
        this.f172189d = i13 == 200;
        this.f172190e = i13 < 200 || i13 >= 300;
        List listM127943a = m127943a("Request-Id");
        String str2 = listM127943a != null ? (String) AbstractC25265s.m74100H0(listM127943a) : null;
        str2 = (str2 == null || AbstractC39414r.m125890i0(str2)) ? null : str2;
        this.f172191f = str2 != null ? new C39858f0(str2) : null;
    }

    /* JADX INFO: renamed from: a */
    public final List m127943a(String str) {
        Object next;
        Iterator it = this.f172188c.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC39421y.m125921F((String) ((Map.Entry) next).getKey(), str, true));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (List) entry.getValue();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39874n0)) {
            return false;
        }
        C39874n0 c39874n0 = (C39874n0) obj;
        return this.f172186a == c39874n0.f172186a && AbstractC22676k.m65745e(this.f172187b, c39874n0.f172187b) && AbstractC22676k.m65745e(this.f172188c, c39874n0.f172188c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f172186a) * 31;
        Object obj = this.f172187b;
        return this.f172188c.hashCode() + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    public final String toString() {
        return "Request-Id: " + this.f172191f + ", Status Code: " + this.f172186a;
    }
}
