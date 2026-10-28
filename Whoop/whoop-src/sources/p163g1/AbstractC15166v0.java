package p163g1;

import androidx.compose.runtime.Composer;
import p097ds.AbstractC12313p;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.C22976l1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;

/* JADX INFO: renamed from: g1.v0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15166v0 {

    /* JADX INFO: renamed from: a */
    public static final C22976l1 f56891a;

    /* JADX INFO: renamed from: b */
    public static final float f56892b = 64;

    /* JADX INFO: renamed from: c */
    public static final float f56893c = 36;

    /* JADX INFO: renamed from: d */
    public static final float f56894d = 1;

    /* JADX INFO: renamed from: e */
    public static final C22976l1 f56895e;

    static {
        float f13 = 16;
        float f14 = 8;
        f56891a = new C22976l1(f13, f14, f13, f14);
        f56895e = new C22976l1(f14, f14, f14, f14);
    }

    /* JADX INFO: renamed from: a */
    public static C15077m1 m43196a(long j7, long j13, long j14, long j15, Composer composer, int i13, int i14) {
        if ((i14 & 1) != 0) {
            j7 = ((C14970c1) ((C28655q) composer).m87161k(AbstractC14981d1.f55997a)).m43091f();
        }
        if ((i14 & 2) != 0) {
            j13 = AbstractC14981d1.m43101b(j7, composer);
        }
        if ((i14 & 4) != 0) {
            C28674u2 c28674u2 = AbstractC14981d1.f55997a;
            C28655q c28655q = (C28655q) composer;
            j14 = AbstractC17918w0.m51528p(C17919x.m51541c(0.12f, ((C14970c1) c28655q.m87161k(c28674u2)).m43090e()), ((C14970c1) c28655q.m87161k(c28674u2)).m43093h());
        }
        if ((i14 & 8) != 0) {
            long jM43090e = ((C14970c1) ((C28655q) composer).m87161k(AbstractC14981d1.f55997a)).m43090e();
            AbstractC12313p.m34255G(composer);
            j15 = C17919x.m51541c(0.38f, jM43090e);
        }
        return new C15077m1(j7, j13, j14, j15);
    }

    /* JADX INFO: renamed from: b */
    public static C15117q1 m43197b(float f13, float f14, float f15, float f16, float f17, Composer composer, int i13, int i14) {
        if ((i14 & 1) != 0) {
            f13 = 2;
        }
        if ((i14 & 2) != 0) {
            f14 = 8;
        }
        if ((i14 & 4) != 0) {
            f15 = 0;
        }
        if ((i14 & 8) != 0) {
            f16 = 4;
        }
        if ((i14 & 16) != 0) {
            f17 = 4;
        }
        boolean z4 = ((((i13 & 14) ^ 6) > 4 && ((C28655q) composer).m87147d(f13)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) > 32 && ((C28655q) composer).m87147d(f14)) || (i13 & 48) == 32) | ((((i13 & 896) ^ 384) > 256 && ((C28655q) composer).m87147d(f15)) || (i13 & 384) == 256) | ((((i13 & 7168) ^ 3072) > 2048 && ((C28655q) composer).m87147d(f16)) || (i13 & 3072) == 2048) | ((((57344 & i13) ^ 24576) > 16384 && ((C28655q) composer).m87147d(f17)) || (i13 & 24576) == 16384);
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        if (z4 || objM87133R == C28635l.f115821a) {
            float f18 = f17;
            C15117q1 c15117q1 = new C15117q1(f13, f14, f15, f16, f18);
            c28655q.m87172p0(c15117q1);
            objM87133R = c15117q1;
        }
        return (C15117q1) objM87133R;
    }

    /* JADX INFO: renamed from: c */
    public static C15077m1 m43198c(long j7, long j13, C28655q c28655q, int i13) {
        if ((i13 & 1) != 0) {
            j7 = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h();
        }
        long j14 = j7;
        if ((i13 & 2) != 0) {
            j13 = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43091f();
        }
        long jM43090e = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43090e();
        AbstractC12313p.m34255G(c28655q);
        return new C15077m1(j14, j13, j14, C17919x.m51541c(0.38f, jM43090e));
    }

    /* JADX INFO: renamed from: d */
    public static C15077m1 m43199d(long j7, Composer composer, int i13) {
        long j13 = C17919x.f69636m;
        if ((i13 & 2) != 0) {
            j7 = ((C14970c1) ((C28655q) composer).m87161k(AbstractC14981d1.f55997a)).m43091f();
        }
        long j14 = j7;
        long jM43090e = ((C14970c1) ((C28655q) composer).m87161k(AbstractC14981d1.f55997a)).m43090e();
        AbstractC12313p.m34255G(composer);
        return new C15077m1(j13, j14, j13, C17919x.m51541c(0.38f, jM43090e));
    }
}
