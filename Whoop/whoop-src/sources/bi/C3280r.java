package bi;

import c13.AbstractC3855a;
import p000.AbstractC11266d;
import p461rh.C31420i;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bi.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C3280r {

    /* JADX INFO: renamed from: a */
    public final String f12806a;

    /* JADX INFO: renamed from: b */
    public final String f12807b;

    /* JADX INFO: renamed from: c */
    public final C3279q f12808c;

    /* JADX INFO: renamed from: d */
    public final C31420i f12809d;

    public C3280r(String str, String str2, C3279q c3279q, C31420i c31420i) {
        this.f12806a = str;
        this.f12807b = str2;
        this.f12808c = c3279q;
        this.f12809d = c31420i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3280r)) {
            return false;
        }
        C3280r c3280r = (C3280r) obj;
        return AbstractC22676k.m65745e(this.f12806a, c3280r.f12806a) && AbstractC22676k.m65745e(this.f12807b, c3280r.f12807b) && AbstractC22676k.m65745e(this.f12808c, c3280r.f12808c) && AbstractC22676k.m65745e(this.f12809d, c3280r.f12809d);
    }

    public final int hashCode() {
        return this.f12809d.f129287a.hashCode() + AbstractC3855a.m11821e(this.f12808c.f12805a, AbstractC11266d.m30450d(this.f12806a.hashCode() * 31, 31, this.f12807b), 961);
    }

    public final String toString() {
        return "NetworkRequest(url=" + this.f12806a + ", method=" + this.f12807b + ", headers=" + this.f12808c + ", body=null, extras=" + this.f12809d + ')';
    }
}
