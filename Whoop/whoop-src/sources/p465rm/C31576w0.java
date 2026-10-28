package p465rm;

import java.util.Locale;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: rm.w0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31576w0 implements InterfaceC31529f {

    /* JADX INFO: renamed from: z */
    public static final C31576w0 f130464z = new C31576w0(1.0f, 1.0f);

    /* JADX INFO: renamed from: w */
    public final float f130465w;

    /* JADX INFO: renamed from: x */
    public final float f130466x;

    /* JADX INFO: renamed from: y */
    public final int f130467y;

    public C31576w0(float f13, float f14) {
        AbstractC24543a.m71569e(f13 > 0.0f);
        AbstractC24543a.m71569e(f14 > 0.0f);
        this.f130465w = f13;
        this.f130466x = f14;
        this.f130467y = Math.round(f13 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C31576w0.class == obj.getClass()) {
            C31576w0 c31576w0 = (C31576w0) obj;
            if (this.f130465w == c31576w0.f130465w && this.f130466x == c31576w0.f130466x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f130466x) + ((Float.floatToRawIntBits(this.f130465w) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f130465w), Float.valueOf(this.f130466x)};
        int i13 = AbstractC24567y.f95875a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
