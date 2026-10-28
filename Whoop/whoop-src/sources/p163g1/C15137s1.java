package p163g1;

import androidx.compose.runtime.Composer;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p390p1.C28655q;
import p390p1.C28674u2;

/* JADX INFO: renamed from: g1.s1 */
/* JADX INFO: loaded from: classes.dex */
public final class C15137s1 {

    /* JADX INFO: renamed from: a */
    public static final C15137s1 f56749a = new C15137s1();

    /* JADX INFO: renamed from: a */
    public final long m43186a(long j7, float f13, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1687113661);
        C14970c1 c14970c1 = (C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a);
        if (Float.compare(f13, 0) <= 0 || c14970c1.m43094i()) {
            c28655q.m87150e0(-1095440862);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1095579370);
            C28674u2 c28674u2 = AbstractC15158u2.f56854a;
            j7 = AbstractC17918w0.m51528p(C17919x.m51541c(((((float) Math.log(f13 + 1)) * 4.5f) + 2.0f) / 100.0f, AbstractC14981d1.m43101b(j7, c28655q)), j7);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(false);
        return j7;
    }
}
