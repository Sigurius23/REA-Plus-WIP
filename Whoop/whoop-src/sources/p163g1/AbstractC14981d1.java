package p163g1;

import androidx.compose.runtime.Composer;
import ep0.C13395a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p390p1.C28633k1;
import p390p1.C28655q;
import p390p1.C28674u2;

/* JADX INFO: renamed from: g1.d1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14981d1 {

    /* JADX INFO: renamed from: a */
    public static final C28674u2 f55997a = new C28674u2(new C13395a(13));

    /* JADX INFO: renamed from: a */
    public static final long m43100a(C14970c1 c14970c1, long j7) {
        long jM43091f = c14970c1.m43091f();
        C28633k1 c28633k1 = c14970c1.f55901i;
        if (!C17919x.m51542d(j7, jM43091f) && !C17919x.m51542d(j7, ((C17919x) c14970c1.f55894b.getValue()).f69639a)) {
            if (!C17919x.m51542d(j7, c14970c1.m43092g()) && !C17919x.m51542d(j7, ((C17919x) c14970c1.f55896d.getValue()).f69639a)) {
                if (C17919x.m51542d(j7, c14970c1.m43087b())) {
                    return ((C17919x) c14970c1.f55902j.getValue()).f69639a;
                }
                if (C17919x.m51542d(j7, c14970c1.m43093h())) {
                    return c14970c1.m43090e();
                }
                return C17919x.m51542d(j7, c14970c1.m43088c()) ? ((C17919x) c14970c1.f55904l.getValue()).f69639a : C17919x.f69637n;
            }
            return ((C17919x) c28633k1.getValue()).f69639a;
        }
        return c14970c1.m43089d();
    }

    /* JADX INFO: renamed from: b */
    public static final long m43101b(long j7, Composer composer) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-583916561);
        long jM43100a = m43100a((C14970c1) c28655q.m87161k(f55997a), j7);
        if (jM43100a == 16) {
            jM43100a = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
        }
        c28655q.m87173q(false);
        return jM43100a;
    }

    /* JADX INFO: renamed from: c */
    public static C14970c1 m43102c(long j7, long j13, long j14, long j15) {
        long jM51517e = AbstractC17918w0.m51517e(4281794739L);
        long jM51517e2 = AbstractC17918w0.m51517e(4278442694L);
        long jM51517e3 = AbstractC17918w0.m51517e(4279374354L);
        long j16 = C17919x.f69625b;
        return new C14970c1(j7, jM51517e, jM51517e2, jM51517e2, jM51517e3, j13, j14, j16, j16, C17919x.f69629f, j15, j16, false);
    }

    /* JADX INFO: renamed from: d */
    public static C14970c1 m43103d(long j7, long j13, long j14, long j15, int i13) {
        long jM51517e = (i13 & 1) != 0 ? AbstractC17918w0.m51517e(4284612846L) : j7;
        long jM51517e2 = AbstractC17918w0.m51517e(4281794739L);
        long jM51517e3 = AbstractC17918w0.m51517e(4278442694L);
        long jM51517e4 = AbstractC17918w0.m51517e(4278290310L);
        long j16 = C17919x.f69629f;
        long j17 = (i13 & 32) != 0 ? j16 : j13;
        long jM51517e5 = (i13 & 64) != 0 ? AbstractC17918w0.m51517e(4289724448L) : j14;
        long j18 = C17919x.f69625b;
        return new C14970c1(jM51517e, jM51517e2, jM51517e3, jM51517e4, j16, j17, jM51517e5, j16, j18, j18, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? j18 : j15, j16, true);
    }
}
