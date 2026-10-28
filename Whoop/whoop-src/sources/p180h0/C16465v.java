package p180h0;

import bc3.C2990b0;
import bc3.C3033m;
import p088dc.AbstractC11895b;
import p445r0.C30837e;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35846d;

/* JADX INFO: renamed from: h0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C16465v {

    /* JADX INFO: renamed from: a */
    public final C30837e f63260a;

    /* JADX INFO: renamed from: b */
    public final C3033m f63261b;

    public C16465v(C30837e c30837e, C3033m c3033m) {
        this.f63260a = c30837e;
        this.f63261b = c3033m;
    }

    public final String toString() {
        String strM31996o;
        C3033m c3033m = this.f63261b;
        C2990b0 c2990b0 = (C2990b0) c3033m.f12054E.get(C2990b0.f11996x);
        String str = c2990b0 != null ? c2990b0.f11997w : null;
        StringBuilder sb4 = new StringBuilder("Request@");
        int iHashCode = hashCode();
        AbstractC35846d.m113779c(16);
        String string = Integer.toString(iHashCode, 16);
        AbstractC22676k.m65749i(string, "toString(...)");
        sb4.append(string);
        if (str == null || (strM31996o = AbstractC11895b.m31996o("[", str, "](")) == null) {
            strM31996o = "(";
        }
        sb4.append(strM31996o);
        sb4.append("currentBounds()=");
        sb4.append(this.f63260a.invoke());
        sb4.append(", continuation=");
        sb4.append(c3033m);
        sb4.append(')');
        return sb4.toString();
    }
}
