package p545v6;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v6.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C35714c {

    /* JADX INFO: renamed from: c */
    public static final C35714c f151947c = new C35714c(0, 0);

    /* JADX INFO: renamed from: d */
    public static final C35714c f151948d = new C35714c(1, 1);

    /* JADX INFO: renamed from: a */
    public final int f151949a;

    /* JADX INFO: renamed from: b */
    public final int f151950b;

    public C35714c(int i13, int i14) {
        this.f151949a = i13;
        this.f151950b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C35714c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.glance.layout.Alignment");
        C35714c c35714c = (C35714c) obj;
        return this.f151949a == c35714c.f151949a && this.f151950b == c35714c.f151950b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f151950b) + (Integer.hashCode(this.f151949a) * 31);
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) C35712a.m113184b(this.f151949a)) + ", vertical=" + ((Object) C35713b.m113186b(this.f151950b)) + ')';
    }
}
