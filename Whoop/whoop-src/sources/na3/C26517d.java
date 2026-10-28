package na3;

import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: na3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C26517d {

    /* JADX INFO: renamed from: e */
    public static final C26517d f105426e = new C26517d(null, false);

    /* JADX INFO: renamed from: a */
    public final EnumC26520g f105427a;

    /* JADX INFO: renamed from: b */
    public final EnumC26518e f105428b;

    /* JADX INFO: renamed from: c */
    public final boolean f105429c;

    /* JADX INFO: renamed from: d */
    public final boolean f105430d;

    public C26517d(EnumC26520g enumC26520g, EnumC26518e enumC26518e, boolean z4, boolean z13) {
        this.f105427a = enumC26520g;
        this.f105428b = enumC26518e;
        this.f105429c = z4;
        this.f105430d = z13;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m78592a() {
        return this.f105429c;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC26520g m78593b() {
        return this.f105427a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m78594c() {
        return this.f105430d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26517d)) {
            return false;
        }
        C26517d c26517d = (C26517d) obj;
        return this.f105427a == c26517d.f105427a && this.f105428b == c26517d.f105428b && this.f105429c == c26517d.f105429c && this.f105430d == c26517d.f105430d;
    }

    public final int hashCode() {
        EnumC26520g enumC26520g = this.f105427a;
        int iHashCode = (enumC26520g == null ? 0 : enumC26520g.hashCode()) * 31;
        EnumC26518e enumC26518e = this.f105428b;
        return Boolean.hashCode(this.f105430d) + AbstractC2875y.m8289b((iHashCode + (enumC26518e != null ? enumC26518e.hashCode() : 0)) * 31, 31, this.f105429c);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb4.append(this.f105427a);
        sb4.append(", mutability=");
        sb4.append(this.f105428b);
        sb4.append(", definitelyNotNull=");
        sb4.append(this.f105429c);
        sb4.append(", isNullabilityQualifierForWarning=");
        return AbstractC2875y.m8305r(sb4, this.f105430d, ')');
    }

    public /* synthetic */ C26517d(EnumC26520g enumC26520g, boolean z4) {
        this(enumC26520g, null, z4, false);
    }
}
