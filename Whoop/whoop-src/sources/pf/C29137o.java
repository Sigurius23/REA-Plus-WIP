package pf;

import cg.C4560o;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: pf.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C29137o {

    /* JADX INFO: renamed from: a */
    public final String f117929a;

    /* JADX INFO: renamed from: b */
    public final Integer f117930b;

    public C29137o(String hostMatch, Integer num) {
        AbstractC22676k.m65750j(hostMatch, "hostMatch");
        this.f117929a = hostMatch;
        this.f117930b = num;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m88550a(C4560o c4560o) {
        String str = this.f117929a;
        if (!AbstractC22676k.m65745e(str, "*")) {
            Integer num = this.f117930b;
            if (num == null || c4560o.f18370c == num.intValue()) {
                String string = c4560o.f18369b.toString();
                if (AbstractC39421y.m125920E(str, "*", false)) {
                    return AbstractC39421y.m125930O(string, AbstractC39414r.m125900s0(str, "*"), false);
                }
                if (AbstractC39421y.m125930O(str, "*", false)) {
                    return AbstractC39421y.m125920E(string, AbstractC39414r.m125898q0(str, "*"), false);
                }
                if (str.length() <= string.length()) {
                    boolean zM125920E = AbstractC39421y.m125920E(string, str, false);
                    int length = (string.length() - str.length()) - 1;
                    if (!zM125920E || (length >= 0 && string.charAt(length) != '.')) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29137o)) {
            return false;
        }
        C29137o c29137o = (C29137o) obj;
        return AbstractC22676k.m65745e(this.f117929a, c29137o.f117929a) && AbstractC22676k.m65745e(this.f117930b, c29137o.f117930b);
    }

    public final int hashCode() {
        int iHashCode = this.f117929a.hashCode() * 31;
        Integer num = this.f117930b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "NonProxyHost(hostMatch=" + this.f117929a + ", port=" + this.f117930b + ')';
    }
}
