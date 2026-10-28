package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C1690i implements InterfaceC1657a1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC1657a1 f6681w;

    /* JADX INFO: renamed from: x */
    public int f6682x = 0;

    /* JADX INFO: renamed from: y */
    public int f6683y = -1;

    /* JADX INFO: renamed from: z */
    public int f6684z = -1;

    /* JADX INFO: renamed from: E */
    public Object f6680E = null;

    public C1690i(InterfaceC1657a1 interfaceC1657a1) {
        this.f6681w = interfaceC1657a1;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1657a1
    /* JADX INFO: renamed from: a */
    public final void mo2214a(int i13, int i14) {
        int i15;
        if (this.f6682x == 1 && i13 >= (i15 = this.f6683y)) {
            int i16 = this.f6684z;
            if (i13 <= i15 + i16) {
                this.f6684z = i16 + i14;
                this.f6683y = Math.min(i13, i15);
                return;
            }
        }
        m5251e();
        this.f6683y = i13;
        this.f6684z = i14;
        this.f6682x = 1;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1657a1
    /* JADX INFO: renamed from: b */
    public final void mo2215b(int i13, int i14) {
        int i15;
        if (this.f6682x == 2 && (i15 = this.f6683y) >= i13 && i15 <= i13 + i14) {
            this.f6684z += i14;
            this.f6683y = i13;
        } else {
            m5251e();
            this.f6683y = i13;
            this.f6684z = i14;
            this.f6682x = 2;
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC1657a1
    /* JADX INFO: renamed from: c */
    public final void mo2216c(int i13, int i14, Object obj) {
        int i15;
        int i16;
        int i17;
        if (this.f6682x == 3 && i13 <= (i16 = this.f6684z + (i15 = this.f6683y)) && (i17 = i13 + i14) >= i15 && this.f6680E == obj) {
            this.f6683y = Math.min(i13, i15);
            this.f6684z = Math.max(i16, i17) - this.f6683y;
            return;
        }
        m5251e();
        this.f6683y = i13;
        this.f6684z = i14;
        this.f6680E = obj;
        this.f6682x = 3;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1657a1
    /* JADX INFO: renamed from: d */
    public final void mo2217d(int i13, int i14) {
        m5251e();
        this.f6681w.mo2217d(i13, i14);
    }

    /* JADX INFO: renamed from: e */
    public final void m5251e() {
        int i13 = this.f6682x;
        if (i13 == 0) {
            return;
        }
        InterfaceC1657a1 interfaceC1657a1 = this.f6681w;
        if (i13 == 1) {
            interfaceC1657a1.mo2214a(this.f6683y, this.f6684z);
        } else if (i13 == 2) {
            interfaceC1657a1.mo2215b(this.f6683y, this.f6684z);
        } else if (i13 == 3) {
            interfaceC1657a1.mo2216c(this.f6683y, this.f6684z, this.f6680E);
        }
        this.f6680E = null;
        this.f6682x = 0;
    }
}
