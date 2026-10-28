package p664yy;

import i93.C18284j;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import yv0.C39805h;

/* JADX INFO: renamed from: yy.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C39849b extends AbstractC39872m0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f172099a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f172100b;

    /* JADX INFO: renamed from: c */
    public final EnumC39868k0 f172101c;

    /* JADX INFO: renamed from: d */
    public final C18284j f172102d;

    /* JADX INFO: renamed from: e */
    public final String f172103e;

    public C39849b(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f172099a = linkedHashMap;
        this.f172100b = linkedHashMap2;
        String strM74110N0 = AbstractC25265s.m74110N0(AbstractC39877q.m127950g(null, AbstractC39877q.m127945b(linkedHashMap)), "&", null, null, new C39805h(10), 30);
        strM74110N0 = strM74110N0 == null ? "" : strM74110N0;
        this.f172101c = EnumC39868k0.GET;
        EnumC39870l0 enumC39870l0 = EnumC39870l0.Form;
        this.f172102d = new C18284j(429, 429, 1);
        this.f172103e = AbstractC25265s.m74110N0(AbstractC25260n.m74077r0(new String[]{"https://q.stripe.com", strM74110N0.length() > 0 ? strM74110N0 : null}), "?", null, null, null, 62);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39849b)) {
            return false;
        }
        C39849b c39849b = (C39849b) obj;
        return this.f172099a.equals(c39849b.f172099a) && this.f172100b.equals(c39849b.f172100b);
    }

    @Override // p664yy.AbstractC39872m0
    public final Map getHeaders() {
        return this.f172100b;
    }

    @Override // p664yy.AbstractC39872m0
    public final EnumC39868k0 getMethod() {
        return this.f172101c;
    }

    @Override // p664yy.AbstractC39872m0
    public final Iterable getRetryResponseCodes() {
        return this.f172102d;
    }

    @Override // p664yy.AbstractC39872m0
    public final String getUrl() {
        return this.f172103e;
    }

    public final int hashCode() {
        return this.f172100b.hashCode() + (this.f172099a.hashCode() * 31);
    }

    public final String toString() {
        return "AnalyticsRequest(params=" + this.f172099a + ", headers=" + this.f172100b + ")";
    }
}
