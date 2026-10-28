package p292l1;

import p208i2.C17919x;

/* JADX INFO: renamed from: l1.j3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23118j3 {

    /* JADX INFO: renamed from: a */
    public final long f91346a = C17919x.f69637n;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C23118j3) {
            return C17919x.m51542d(this.f91346a, ((C23118j3) obj).f91346a);
        }
        return false;
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f91346a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) C17919x.m51548j(this.f91346a)) + ", rippleAlpha=null)";
    }
}
