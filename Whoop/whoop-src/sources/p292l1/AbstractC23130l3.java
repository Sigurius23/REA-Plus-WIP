package p292l1;

import androidx.compose.material3.C1122c;
import p208i2.C17919x;
import p390p1.C28596b0;
import p636y3.C39174f;

/* JADX INFO: renamed from: l1.l3 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23130l3 {

    /* JADX INFO: renamed from: a */
    public static final C28596b0 f91392a = new C28596b0(new C23091f0(7));

    /* JADX INFO: renamed from: b */
    public static final C1122c f91393b;

    /* JADX INFO: renamed from: c */
    public static final C1122c f91394c;

    static {
        long j7 = C17919x.f69637n;
        f91393b = new C1122c(true, Float.NaN, j7);
        f91394c = new C1122c(false, Float.NaN, j7);
    }

    /* JADX INFO: renamed from: a */
    public static C1122c m67110a(float f13, int i13, boolean z4) {
        if ((i13 & 1) != 0) {
            z4 = true;
        }
        if ((i13 & 2) != 0) {
            f13 = Float.NaN;
        }
        long j7 = C17919x.f69637n;
        if (C39174f.m124782b(f13, Float.NaN) && C17919x.m51542d(j7, j7)) {
            return z4 ? f91393b : f91394c;
        }
        return new C1122c(z4, f13, j7);
    }
}
