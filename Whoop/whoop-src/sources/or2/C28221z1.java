package or2;

import com.whoop.p069ui.AbstractC10538f;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: or2.z1 */
/* JADX INFO: loaded from: classes10.dex */
public class C28221z1 {

    /* JADX INFO: renamed from: a */
    private long f114004a;

    public C28221z1(long j7) {
        this.f114004a = j7;
    }

    /* JADX INFO: renamed from: a */
    public C28221z1 m85450a() {
        return new C28221z1(m85452c());
    }

    /* JADX INFO: renamed from: b */
    public long m85451b() {
        return this.f114004a;
    }

    /* JADX INFO: renamed from: c */
    public long m85452c() {
        return AbstractC28209v1.m85387a(this.f114004a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f114004a == ((C28221z1) obj).f114004a;
    }

    public int hashCode() {
        long j7 = this.f114004a;
        return (int) (j7 ^ (j7 >>> 32));
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(AbstractC10538f.m27178c(this));
        sb4.append("(");
        return AbstractC11266d.m30457k(this.f114004a, ")", sb4);
    }

    public C28221z1(double d3) {
        this.f114004a = (long) d3;
    }
}
