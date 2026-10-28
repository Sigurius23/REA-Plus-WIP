package p465rm;

import java.util.Arrays;
import p463rj.AbstractC31479j;

/* JADX INFO: renamed from: rm.a1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31516a1 implements InterfaceC31529f {

    /* JADX INFO: renamed from: E */
    public final int f130021E;

    /* JADX INFO: renamed from: F */
    public final long f130022F;

    /* JADX INFO: renamed from: G */
    public final long f130023G;

    /* JADX INFO: renamed from: H */
    public final int f130024H;

    /* JADX INFO: renamed from: I */
    public final int f130025I;

    /* JADX INFO: renamed from: w */
    public final Object f130026w;

    /* JADX INFO: renamed from: x */
    public final int f130027x;

    /* JADX INFO: renamed from: y */
    public final C31545k0 f130028y;

    /* JADX INFO: renamed from: z */
    public final Object f130029z;

    public C31516a1(Object obj, int i13, C31545k0 c31545k0, Object obj2, int i14, long j7, long j13, int i15, int i16) {
        this.f130026w = obj;
        this.f130027x = i13;
        this.f130028y = c31545k0;
        this.f130029z = obj2;
        this.f130021E = i14;
        this.f130022F = j7;
        this.f130023G = j13;
        this.f130024H = i15;
        this.f130025I = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C31516a1.class == obj.getClass()) {
            C31516a1 c31516a1 = (C31516a1) obj;
            if (this.f130027x == c31516a1.f130027x && this.f130021E == c31516a1.f130021E && this.f130022F == c31516a1.f130022F && this.f130023G == c31516a1.f130023G && this.f130024H == c31516a1.f130024H && this.f130025I == c31516a1.f130025I && AbstractC31479j.m96940s(this.f130026w, c31516a1.f130026w) && AbstractC31479j.m96940s(this.f130029z, c31516a1.f130029z) && AbstractC31479j.m96940s(this.f130028y, c31516a1.f130028y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f130026w, Integer.valueOf(this.f130027x), this.f130028y, this.f130029z, Integer.valueOf(this.f130021E), Long.valueOf(this.f130022F), Long.valueOf(this.f130023G), Integer.valueOf(this.f130024H), Integer.valueOf(this.f130025I)});
    }
}
