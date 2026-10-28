package n20;

import p408q.C29662f;
import p508ty.C34249c;
import v03.InterfaceC35521h;

/* JADX INFO: renamed from: n20.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C26166a implements InterfaceC35521h {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103677w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f103678x;

    public /* synthetic */ C26166a(Object obj, int i13) {
        this.f103677w = i13;
        this.f103678x = obj;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f103677w) {
            case 0:
                return new C26169d(((C26167b) this.f103678x).f103705a, 0);
            case 1:
                return new C26168c(((C26167b) this.f103678x).f103705a, 0);
            default:
                return new C34249c((C29662f) ((C29662f) this.f103678x).f121231y, 3);
        }
    }
}
