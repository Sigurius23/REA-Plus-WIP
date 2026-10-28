package p163g1;

import androidx.compose.material.C1119d;
import ep0.C13395a;
import p208i2.C17919x;
import p269k1.C22111b;
import p390p1.C28596b0;
import p636y3.C39174f;

/* JADX INFO: renamed from: g1.z4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15210z4 {

    /* JADX INFO: renamed from: a */
    public static final C28596b0 f57110a = new C28596b0(new C13395a(18));

    /* JADX INFO: renamed from: b */
    public static final C1119d f57111b;

    /* JADX INFO: renamed from: c */
    public static final C1119d f57112c;

    /* JADX INFO: renamed from: d */
    public static final C22111b f57113d;

    /* JADX INFO: renamed from: e */
    public static final C22111b f57114e;

    /* JADX INFO: renamed from: f */
    public static final C22111b f57115f;

    static {
        long j7 = C17919x.f69637n;
        f57111b = new C1119d(true, Float.NaN, j7);
        f57112c = new C1119d(false, Float.NaN, j7);
        f57113d = new C22111b(0.16f, 0.24f, 0.08f, 0.24f);
        f57114e = new C22111b(0.08f, 0.12f, 0.04f, 0.12f);
        f57115f = new C22111b(0.08f, 0.12f, 0.04f, 0.1f);
    }

    /* JADX INFO: renamed from: a */
    public static C1119d m43228a(long j7, int i13, boolean z4, float f13) {
        if ((i13 & 1) != 0) {
            z4 = true;
        }
        if ((i13 & 2) != 0) {
            f13 = Float.NaN;
        }
        if ((i13 & 4) != 0) {
            j7 = C17919x.f69637n;
        }
        if (C39174f.m124782b(f13, Float.NaN) && C17919x.m51542d(j7, C17919x.f69637n)) {
            return z4 ? f57111b : f57112c;
        }
        return new C1119d(z4, f13, j7);
    }
}
