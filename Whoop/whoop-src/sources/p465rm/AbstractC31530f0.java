package p465rm;

import qa.C30097b;

/* JADX INFO: renamed from: rm.f0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC31530f0 implements InterfaceC31529f {

    /* JADX INFO: renamed from: F */
    public static final C30097b f130139F;

    /* JADX INFO: renamed from: E */
    public final boolean f130140E;

    /* JADX INFO: renamed from: w */
    public final long f130141w;

    /* JADX INFO: renamed from: x */
    public final long f130142x;

    /* JADX INFO: renamed from: y */
    public final boolean f130143y;

    /* JADX INFO: renamed from: z */
    public final boolean f130144z;

    static {
        new C31527e0().m97126a();
        f130139F = new C30097b(18);
    }

    public AbstractC31530f0(C31527e0 c31527e0) {
        this.f130141w = c31527e0.f130125a;
        this.f130142x = c31527e0.f130126b;
        this.f130143y = c31527e0.f130127c;
        this.f130144z = c31527e0.f130128d;
        this.f130140E = c31527e0.f130129e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC31530f0)) {
            return false;
        }
        AbstractC31530f0 abstractC31530f0 = (AbstractC31530f0) obj;
        return this.f130141w == abstractC31530f0.f130141w && this.f130142x == abstractC31530f0.f130142x && this.f130143y == abstractC31530f0.f130143y && this.f130144z == abstractC31530f0.f130144z && this.f130140E == abstractC31530f0.f130140E;
    }

    public final int hashCode() {
        long j7 = this.f130141w;
        int i13 = ((int) (j7 ^ (j7 >>> 32))) * 31;
        long j13 = this.f130142x;
        return ((((((i13 + ((int) ((j13 >>> 32) ^ j13))) * 31) + (this.f130143y ? 1 : 0)) * 31) + (this.f130144z ? 1 : 0)) * 31) + (this.f130140E ? 1 : 0);
    }
}
