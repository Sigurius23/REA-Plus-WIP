package p392p3;

import q30.C29934u0;

/* JADX INFO: renamed from: p3.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C28783u extends AbstractC28771i {

    /* JADX INFO: renamed from: F */
    public final C29934u0 f116551F;

    public C28783u(C29934u0 c29934u0) {
        this.f116551F = c29934u0;
    }

    /* JADX INFO: renamed from: a */
    public final C29934u0 m87533a() {
        return this.f116551F;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C28783u) {
            return this.f116551F.equals(((C28783u) obj).f116551F);
        }
        return false;
    }

    public final int hashCode() {
        return this.f116551F.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f116551F + ')';
    }
}
