package p294l3;

import d13.AbstractC11478a;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p392p3.InterfaceC28770h;
import p636y3.C39169a;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: l3.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23275q0 {

    /* JADX INFO: renamed from: a */
    public final C23254g f92216a;

    /* JADX INFO: renamed from: b */
    public final C23285v0 f92217b;

    /* JADX INFO: renamed from: c */
    public final List f92218c;

    /* JADX INFO: renamed from: d */
    public final int f92219d;

    /* JADX INFO: renamed from: e */
    public final boolean f92220e;

    /* JADX INFO: renamed from: f */
    public final int f92221f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC39171c f92222g;

    /* JADX INFO: renamed from: h */
    public final EnumC39181m f92223h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC28770h f92224i;

    /* JADX INFO: renamed from: j */
    public final long f92225j;

    public C23275q0(C23254g c23254g, C23285v0 c23285v0, List list, int i13, boolean z4, int i14, InterfaceC39171c interfaceC39171c, EnumC39181m enumC39181m, InterfaceC28770h interfaceC28770h, long j7) {
        this.f92216a = c23254g;
        this.f92217b = c23285v0;
        this.f92218c = list;
        this.f92219d = i13;
        this.f92220e = z4;
        this.f92221f = i14;
        this.f92222g = interfaceC39171c;
        this.f92223h = enumC39181m;
        this.f92224i = interfaceC28770h;
        this.f92225j = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23275q0)) {
            return false;
        }
        C23275q0 c23275q0 = (C23275q0) obj;
        return AbstractC22676k.m65745e(this.f92216a, c23275q0.f92216a) && AbstractC22676k.m65745e(this.f92217b, c23275q0.f92217b) && AbstractC22676k.m65745e(this.f92218c, c23275q0.f92218c) && this.f92219d == c23275q0.f92219d && this.f92220e == c23275q0.f92220e && this.f92221f == c23275q0.f92221f && AbstractC22676k.m65745e(this.f92222g, c23275q0.f92222g) && this.f92223h == c23275q0.f92223h && AbstractC22676k.m65745e(this.f92224i, c23275q0.f92224i) && C39169a.m124759c(this.f92225j, c23275q0.f92225j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f92225j) + ((this.f92224i.hashCode() + ((this.f92223h.hashCode() + ((this.f92222g.hashCode() + AbstractC11266d.m30448b(this.f92221f, AbstractC2875y.m8289b((AbstractC11895b.m31983b(AbstractC11478a.m30849a(this.f92216a.hashCode() * 31, 31, this.f92217b), 31, this.f92218c) + this.f92219d) * 31, 31, this.f92220e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f92216a) + ", style=" + this.f92217b + ", placeholders=" + this.f92218c + ", maxLines=" + this.f92219d + ", softWrap=" + this.f92220e + ", overflow=" + ((Object) AbstractC35745c.m113250m(this.f92221f)) + ", density=" + this.f92222g + ", layoutDirection=" + this.f92223h + ", fontFamilyResolver=" + this.f92224i + ", constraints=" + ((Object) C39169a.m124768l(this.f92225j)) + ')';
    }
}
