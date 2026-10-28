package tm;

import android.media.AudioAttributes;
import p309lo.AbstractC24567y;
import p465rm.InterfaceC31529f;

/* JADX INFO: renamed from: tm.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C33926d implements InterfaceC31529f {

    /* JADX INFO: renamed from: G */
    public static final C33926d f142162G = new C33926d(0, 0, 1, 1, 0);

    /* JADX INFO: renamed from: E */
    public final int f142163E;

    /* JADX INFO: renamed from: F */
    public AudioAttributes f142164F;

    /* JADX INFO: renamed from: w */
    public final int f142165w;

    /* JADX INFO: renamed from: x */
    public final int f142166x;

    /* JADX INFO: renamed from: y */
    public final int f142167y;

    /* JADX INFO: renamed from: z */
    public final int f142168z;

    public C33926d(int i13, int i14, int i15, int i16, int i17) {
        this.f142165w = i13;
        this.f142166x = i14;
        this.f142167y = i15;
        this.f142168z = i16;
        this.f142163E = i17;
    }

    /* JADX INFO: renamed from: a */
    public final AudioAttributes m107343a() {
        if (this.f142164F == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f142165w).setFlags(this.f142166x).setUsage(this.f142167y);
            int i13 = AbstractC24567y.f95875a;
            if (i13 >= 29) {
                AbstractC33924b.m107341a(usage, this.f142168z);
            }
            if (i13 >= 32) {
                AbstractC33925c.m107342a(usage, this.f142163E);
            }
            this.f142164F = usage.build();
        }
        return this.f142164F;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C33926d.class == obj.getClass()) {
            C33926d c33926d = (C33926d) obj;
            if (this.f142165w == c33926d.f142165w && this.f142166x == c33926d.f142166x && this.f142167y == c33926d.f142167y && this.f142168z == c33926d.f142168z && this.f142163E == c33926d.f142163E) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.f142165w) * 31) + this.f142166x) * 31) + this.f142167y) * 31) + this.f142168z) * 31) + this.f142163E;
    }
}
