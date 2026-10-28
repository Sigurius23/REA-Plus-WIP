package p465rm;

/* JADX INFO: renamed from: rm.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C31538i implements InterfaceC31529f {

    /* JADX INFO: renamed from: w */
    public final int f130170w;

    /* JADX INFO: renamed from: x */
    public final int f130171x;

    /* JADX INFO: renamed from: y */
    public final int f130172y;

    public C31538i(int i13, int i14, int i15) {
        this.f130170w = i13;
        this.f130171x = i14;
        this.f130172y = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31538i)) {
            return false;
        }
        C31538i c31538i = (C31538i) obj;
        return this.f130170w == c31538i.f130170w && this.f130171x == c31538i.f130171x && this.f130172y == c31538i.f130172y;
    }

    public final int hashCode() {
        return ((((527 + this.f130170w) * 31) + this.f130171x) * 31) + this.f130172y;
    }
}
