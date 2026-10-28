package p641y8;

import p516u8.InterfaceC34583b0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: y8.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C39310e implements InterfaceC34583b0 {

    /* JADX INFO: renamed from: a */
    public final float f169114a;

    /* JADX INFO: renamed from: b */
    public final float f169115b;

    public C39310e(float f13, float f14) {
        AbstractC35849g.m113803e(f13 >= -90.0f && f13 <= 90.0f && f14 >= -180.0f && f14 <= 180.0f, "Invalid latitude or longitude");
        this.f169114a = f13;
        this.f169115b = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C39310e.class == obj.getClass()) {
            C39310e c39310e = (C39310e) obj;
            if (this.f169114a == c39310e.f169114a && this.f169115b == c39310e.f169115b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f169115b).hashCode() + ((Float.valueOf(this.f169114a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f169114a + ", longitude=" + this.f169115b;
    }
}
