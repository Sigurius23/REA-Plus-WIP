package hb3;

import c93.InterfaceC4339a;
import jb3.C21559s;
import kb3.C22339h;
import kb3.C22342k;
import qa3.C30146k0;

/* JADX INFO: renamed from: hb3.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C17129r implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65776w;

    /* JADX INFO: renamed from: x */
    public final C17135x f65777x;

    /* JADX INFO: renamed from: y */
    public final C30146k0 f65778y;

    /* JADX INFO: renamed from: z */
    public final C21559s f65779z;

    public /* synthetic */ C17129r(C17135x c17135x, C30146k0 c30146k0, C21559s c21559s, int i13) {
        this.f65776w = i13;
        this.f65777x = c17135x;
        this.f65778y = c30146k0;
        this.f65779z = c21559s;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f65776w) {
            case 0:
                C17135x c17135x = this.f65777x;
                C22342k c22342k = c17135x.f65803a.f65760a.f65735a;
                C17134w c17134w = new C17134w(c17135x, this.f65778y, this.f65779z, 0);
                c22342k.getClass();
                return new C22339h(c22342k, c17134w);
            default:
                C17135x c17135x2 = this.f65777x;
                C22342k c22342k2 = c17135x2.f65803a.f65760a.f65735a;
                C17134w c17134w2 = new C17134w(c17135x2, this.f65778y, this.f65779z, 1);
                c22342k2.getClass();
                return new C22339h(c22342k2, c17134w2);
        }
    }
}
