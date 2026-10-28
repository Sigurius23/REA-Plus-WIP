package p299l9;

/* JADX INFO: renamed from: l9.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23524r0 {

    /* JADX INFO: renamed from: a */
    public final int f93109a;

    /* JADX INFO: renamed from: b */
    public final boolean f93110b;

    public C23524r0(int i13, boolean z4) {
        this.f93109a = i13;
        this.f93110b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C23524r0.class != obj.getClass()) {
            return false;
        }
        C23524r0 c23524r0 = (C23524r0) obj;
        return this.f93109a == c23524r0.f93109a && this.f93110b == c23524r0.f93110b;
    }

    public final int hashCode() {
        return (this.f93109a * 31) + (this.f93110b ? 1 : 0);
    }
}
