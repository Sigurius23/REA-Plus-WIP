package p465rm;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: rm.n1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31555n1 implements InterfaceC31529f {

    /* JADX INFO: renamed from: R */
    public static final Object f130306R = new Object();

    /* JADX INFO: renamed from: S */
    public static final Object f130307S = new Object();

    /* JADX INFO: renamed from: T */
    public static final C31545k0 f130308T;

    /* JADX INFO: renamed from: E */
    public long f130309E;

    /* JADX INFO: renamed from: F */
    public long f130310F;

    /* JADX INFO: renamed from: G */
    public long f130311G;

    /* JADX INFO: renamed from: H */
    public boolean f130312H;

    /* JADX INFO: renamed from: I */
    public boolean f130313I;

    /* JADX INFO: renamed from: J */
    public boolean f130314J;

    /* JADX INFO: renamed from: K */
    public C31536h0 f130315K;

    /* JADX INFO: renamed from: L */
    public boolean f130316L;

    /* JADX INFO: renamed from: M */
    public long f130317M;

    /* JADX INFO: renamed from: N */
    public long f130318N;

    /* JADX INFO: renamed from: O */
    public int f130319O;

    /* JADX INFO: renamed from: P */
    public int f130320P;

    /* JADX INFO: renamed from: Q */
    public long f130321Q;

    /* JADX INFO: renamed from: x */
    public Object f130323x;

    /* JADX INFO: renamed from: z */
    public Object f130325z;

    /* JADX INFO: renamed from: w */
    public Object f130322w = f130306R;

    /* JADX INFO: renamed from: y */
    public C31545k0 f130324y = f130308T;

    static {
        C31527e0 c31527e0 = new C31527e0();
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        C41060w0 c41060w0 = C41060w0.f177067E;
        List list = Collections.EMPTY_LIST;
        C41060w0 c41060w1 = C41060w0.f177067E;
        Uri uri = Uri.EMPTY;
        f130308T = new C31545k0("com.google.android.exoplayer2.Timeline", new C31533g0(c31527e0), uri != null ? new C31539i0(uri, null, list, c41060w1) : null, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m97166a() {
        AbstractC24543a.m71573i(this.f130314J == (this.f130315K != null));
        return this.f130315K != null;
    }

    /* JADX INFO: renamed from: b */
    public final void m97167b(Object obj, C31545k0 c31545k0, Object obj2, long j7, long j13, long j14, boolean z4, boolean z13, C31536h0 c31536h0, long j15, long j16, int i13, int i14, long j17) {
        this.f130322w = obj;
        this.f130324y = c31545k0 != null ? c31545k0 : f130308T;
        if (c31545k0 != null) {
            C31539i0 c31539i0 = c31545k0.f130206x;
        }
        this.f130323x = null;
        this.f130325z = obj2;
        this.f130309E = j7;
        this.f130310F = j13;
        this.f130311G = j14;
        this.f130312H = z4;
        this.f130313I = z13;
        this.f130314J = c31536h0 != null;
        this.f130315K = c31536h0;
        this.f130317M = j15;
        this.f130318N = j16;
        this.f130319O = i13;
        this.f130320P = i14;
        this.f130321Q = j17;
        this.f130316L = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C31555n1.class.equals(obj.getClass())) {
            C31555n1 c31555n1 = (C31555n1) obj;
            if (AbstractC24567y.m71670a(this.f130322w, c31555n1.f130322w) && AbstractC24567y.m71670a(this.f130324y, c31555n1.f130324y) && AbstractC24567y.m71670a(this.f130325z, c31555n1.f130325z) && AbstractC24567y.m71670a(this.f130315K, c31555n1.f130315K) && this.f130309E == c31555n1.f130309E && this.f130310F == c31555n1.f130310F && this.f130311G == c31555n1.f130311G && this.f130312H == c31555n1.f130312H && this.f130313I == c31555n1.f130313I && this.f130316L == c31555n1.f130316L && this.f130317M == c31555n1.f130317M && this.f130318N == c31555n1.f130318N && this.f130319O == c31555n1.f130319O && this.f130320P == c31555n1.f130320P && this.f130321Q == c31555n1.f130321Q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f130324y.hashCode() + AbstractC33745d.m106644c(217, 31, this.f130322w)) * 31;
        Object obj = this.f130325z;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C31536h0 c31536h0 = this.f130315K;
        int iHashCode3 = (iHashCode2 + (c31536h0 != null ? c31536h0.hashCode() : 0)) * 31;
        long j7 = this.f130309E;
        int i13 = (iHashCode3 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j13 = this.f130310F;
        int i14 = (i13 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f130311G;
        int i15 = (((((((i14 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + (this.f130312H ? 1 : 0)) * 31) + (this.f130313I ? 1 : 0)) * 31) + (this.f130316L ? 1 : 0)) * 31;
        long j15 = this.f130317M;
        int i16 = (i15 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f130318N;
        int i17 = (((((i16 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + this.f130319O) * 31) + this.f130320P) * 31;
        long j17 = this.f130321Q;
        return i17 + ((int) (j17 ^ (j17 >>> 32)));
    }
}
