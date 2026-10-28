package p185h6;

/* JADX INFO: renamed from: h6.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C16962q implements InterfaceC16961p {

    /* JADX INFO: renamed from: w */
    public final int f65096w;

    /* JADX INFO: renamed from: x */
    public int f65097x = -1;

    /* JADX INFO: renamed from: y */
    public int f65098y = -1;

    public C16962q(int i13) {
        this.f65096w = i13;
    }

    @Override // p185h6.InterfaceC16961p
    /* JADX INFO: renamed from: a */
    public final boolean mo31818a(CharSequence charSequence, int i13, int i14, C16969x c16969x) {
        int i15 = this.f65096w;
        if (i13 > i15 || i15 >= i14) {
            return i14 <= i15;
        }
        this.f65097x = i13;
        this.f65098y = i14;
        return false;
    }

    @Override // p185h6.InterfaceC16961p
    /* JADX INFO: renamed from: d */
    public final Object mo31820d() {
        return this;
    }
}
