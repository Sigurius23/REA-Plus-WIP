package p392p3;

import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p3.x */
/* JADX INFO: loaded from: classes.dex */
public final class C28786x {

    /* JADX INFO: renamed from: a */
    public final int f116553a;

    /* JADX INFO: renamed from: b */
    public final C28780r f116554b;

    /* JADX INFO: renamed from: c */
    public final C28779q f116555c;

    public C28786x(int i13, C28780r c28780r, C28779q c28779q) {
        this.f116553a = i13;
        this.f116554b = c28780r;
        this.f116555c = c28779q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28786x)) {
            return false;
        }
        C28786x c28786x = (C28786x) obj;
        return this.f116553a == c28786x.f116553a && AbstractC22676k.m65745e(this.f116554b, c28786x.f116554b) && this.f116555c.equals(c28786x.f116555c);
    }

    public final int hashCode() {
        return this.f116555c.f116537a.hashCode() + AbstractC11266d.m30448b(0, AbstractC11266d.m30448b(0, ((this.f116553a * 31) + this.f116554b.f116547w) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.f116553a + ", weight=" + this.f116554b + ", style=" + ((Object) C28776n.m87530a(0)) + ", loadingStrategy=Blocking)";
    }
}
