package p163g1;

import androidx.compose.runtime.Composer;
import p000.AbstractC11266d;
import p208i2.C17919x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;

/* JADX INFO: renamed from: g1.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C15077m1 implements InterfaceC15156u0 {

    /* JADX INFO: renamed from: a */
    public final long f56445a;

    /* JADX INFO: renamed from: b */
    public final long f56446b;

    /* JADX INFO: renamed from: c */
    public final long f56447c;

    /* JADX INFO: renamed from: d */
    public final long f56448d;

    public C15077m1(long j7, long j13, long j14, long j15) {
        this.f56445a = j7;
        this.f56446b = j13;
        this.f56447c = j14;
        this.f56448d = j15;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC28601c1 m43155a(boolean z4, Composer composer) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-2133647540);
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(new C17919x(z4 ? this.f56446b : this.f56448d), c28655q);
        c28655q.m87173q(false);
        return interfaceC28601c1M87238F;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15077m1.class != obj.getClass()) {
            return false;
        }
        C15077m1 c15077m1 = (C15077m1) obj;
        return C17919x.m51542d(this.f56445a, c15077m1.f56445a) && C17919x.m51542d(this.f56446b, c15077m1.f56446b) && C17919x.m51542d(this.f56447c, c15077m1.f56447c) && C17919x.m51542d(this.f56448d, c15077m1.f56448d);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f56448d) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.f56445a) * 31, this.f56446b, 31), this.f56447c, 31);
    }
}
