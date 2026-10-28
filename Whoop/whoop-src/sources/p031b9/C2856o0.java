package p031b9;

import java.util.Objects;

/* JADX INFO: renamed from: b9.o0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2856o0 {

    /* JADX INFO: renamed from: a */
    public final long f11327a;

    /* JADX INFO: renamed from: b */
    public final float f11328b;

    /* JADX INFO: renamed from: c */
    public final long f11329c;

    public C2856o0(C2854n0 c2854n0) {
        this.f11327a = c2854n0.f11323a;
        this.f11328b = c2854n0.f11324b;
        this.f11329c = c2854n0.f11325c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2856o0)) {
            return false;
        }
        C2856o0 c2856o0 = (C2856o0) obj;
        return this.f11327a == c2856o0.f11327a && this.f11328b == c2856o0.f11328b && this.f11329c == c2856o0.f11329c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f11327a), Float.valueOf(this.f11328b), Long.valueOf(this.f11329c));
    }
}
