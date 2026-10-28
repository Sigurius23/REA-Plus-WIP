package p216ia;

import p516u8.InterfaceC34583b0;

/* JADX INFO: renamed from: ia.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C18291d implements InterfaceC34583b0 {

    /* JADX INFO: renamed from: a */
    public final float f71158a;

    /* JADX INFO: renamed from: b */
    public final int f71159b;

    public C18291d(float f13, int i13) {
        this.f71158a = f13;
        this.f71159b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18291d.class == obj.getClass()) {
            C18291d c18291d = (C18291d) obj;
            if (this.f71158a == c18291d.f71158a && this.f71159b == c18291d.f71159b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f71158a).hashCode() + 527) * 31) + this.f71159b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f71158a + ", svcTemporalLayerCount=" + this.f71159b;
    }
}
