package g93;

import java.io.Serializable;
import o73.C27648a;

/* JADX INFO: renamed from: g93.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C15613e extends AbstractC15612d implements Serializable {

    /* JADX INFO: renamed from: E */
    public int f58614E;

    /* JADX INFO: renamed from: F */
    public int f58615F;

    /* JADX INFO: renamed from: G */
    public int f58616G;

    /* JADX INFO: renamed from: H */
    public int f58617H;

    /* JADX INFO: renamed from: y */
    public int f58618y;

    /* JADX INFO: renamed from: z */
    public int f58619z;

    public C15613e(int i13, int i14) {
        int i15 = ~i13;
        this.f58618y = i13;
        this.f58619z = i14;
        this.f58614E = 0;
        this.f58615F = 0;
        this.f58616G = i15;
        this.f58617H = (i13 << 10) ^ (i14 >>> 4);
        if ((i13 | i14 | i15) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        for (int i16 = 0; i16 < 64; i16++) {
            mo43928f();
        }
    }

    @Override // g93.AbstractC15612d
    /* JADX INFO: renamed from: a */
    public final int mo43925a(int i13) {
        return C27648a.m83577a0(mo43928f(), i13);
    }

    @Override // g93.AbstractC15612d
    /* JADX INFO: renamed from: f */
    public final int mo43928f() {
        int i13 = this.f58618y;
        int i14 = i13 ^ (i13 >>> 2);
        this.f58618y = this.f58619z;
        this.f58619z = this.f58614E;
        this.f58614E = this.f58615F;
        int i15 = this.f58616G;
        this.f58615F = i15;
        int i16 = ((i14 ^ (i14 << 1)) ^ i15) ^ (i15 << 4);
        this.f58616G = i16;
        int i17 = this.f58617H + 362437;
        this.f58617H = i17;
        return i16 + i17;
    }
}
