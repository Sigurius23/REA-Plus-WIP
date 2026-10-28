package g00;

import d13.AbstractC11478a;
import p294l3.C23285v0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g00.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C14934e {

    /* JADX INFO: renamed from: a */
    public final C23285v0 f55694a;

    /* JADX INFO: renamed from: b */
    public final C23285v0 f55695b;

    /* JADX INFO: renamed from: c */
    public final C23285v0 f55696c;

    /* JADX INFO: renamed from: d */
    public final C23285v0 f55697d;

    /* JADX INFO: renamed from: e */
    public final C23285v0 f55698e;

    /* JADX INFO: renamed from: f */
    public final C23285v0 f55699f;

    /* JADX INFO: renamed from: g */
    public final C23285v0 f55700g;

    public C14934e(C23285v0 c23285v0, C23285v0 c23285v1, C23285v0 c23285v2, C23285v0 c23285v3, C23285v0 c23285v4, C23285v0 c23285v5, C23285v0 c23285v6) {
        this.f55694a = c23285v0;
        this.f55695b = c23285v1;
        this.f55696c = c23285v2;
        this.f55697d = c23285v3;
        this.f55698e = c23285v4;
        this.f55699f = c23285v5;
        this.f55700g = c23285v6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14934e)) {
            return false;
        }
        C14934e c14934e = (C14934e) obj;
        return AbstractC22676k.m65745e(this.f55694a, c14934e.f55694a) && AbstractC22676k.m65745e(this.f55695b, c14934e.f55695b) && AbstractC22676k.m65745e(this.f55696c, c14934e.f55696c) && AbstractC22676k.m65745e(this.f55697d, c14934e.f55697d) && AbstractC22676k.m65745e(this.f55698e, c14934e.f55698e) && AbstractC22676k.m65745e(this.f55699f, c14934e.f55699f) && AbstractC22676k.m65745e(this.f55700g, c14934e.f55700g);
    }

    public final int hashCode() {
        return this.f55700g.hashCode() + AbstractC11478a.m30849a(AbstractC11478a.m30849a(AbstractC11478a.m30849a(AbstractC11478a.m30849a(AbstractC11478a.m30849a(this.f55694a.hashCode() * 31, 31, this.f55695b), 31, this.f55696c), 31, this.f55697d), 31, this.f55698e), 31, this.f55699f);
    }

    public final String toString() {
        return "LinkTypography(title=" + this.f55694a + ", body=" + this.f55695b + ", bodyEmphasized=" + this.f55696c + ", detail=" + this.f55697d + ", detailEmphasized=" + this.f55698e + ", caption=" + this.f55699f + ", captionEmphasized=" + this.f55700g + ")";
    }
}
