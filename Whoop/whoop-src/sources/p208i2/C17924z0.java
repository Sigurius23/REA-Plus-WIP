package p208i2;

import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p127ev.AbstractC13673n;
import p181h2.C16617b;

/* JADX INFO: renamed from: i2.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17924z0 {

    /* JADX INFO: renamed from: d */
    public static final C17924z0 f69668d = new C17924z0(0.0f, 7);

    /* JADX INFO: renamed from: a */
    public final long f69669a;

    /* JADX INFO: renamed from: b */
    public final long f69670b;

    /* JADX INFO: renamed from: c */
    public final float f69671c;

    public C17924z0(long j7, long j13, float f13) {
        this.f69669a = j7;
        this.f69670b = j13;
        this.f69671c = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17924z0)) {
            return false;
        }
        C17924z0 c17924z0 = (C17924z0) obj;
        return C17919x.m51542d(this.f69669a, c17924z0.f69669a) && C16617b.m47187c(this.f69670b, c17924z0.f69670b) && this.f69671c == c17924z0.f69671c;
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Float.hashCode(this.f69671c) + AbstractC11266d.m30451e(Long.hashCode(this.f69669a) * 31, this.f69670b, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Shadow(color=");
        AbstractC13673n.m38574u(this.f69669a, ", offset=", sb4);
        sb4.append((Object) C16617b.m47194j(this.f69670b));
        sb4.append(", blurRadius=");
        return AbstractC30802r.m94763l(sb4, this.f69671c, ')');
    }

    public /* synthetic */ C17924z0(float f13, int i13) {
        this(AbstractC17918w0.m51517e(4278190080L), 0L, (i13 & 4) != 0 ? 0.0f : f13);
    }
}
