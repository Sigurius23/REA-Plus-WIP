package p390p1;

import d93.InterfaceC11820a;
import java.util.Iterator;

/* JADX INFO: renamed from: p1.s2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28666s2 implements Iterable, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final C28614f2 f115960w;

    /* JADX INFO: renamed from: x */
    public final int f115961x;

    /* JADX INFO: renamed from: y */
    public final C28595b f115962y;

    public C28666s2(C28614f2 c28614f2, int i13, AbstractC28644n0 abstractC28644n0, C28595b c28595b) {
        this.f115960w = c28614f2;
        this.f115961x = i13;
        this.f115962y = c28595b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C28640m0(this.f115960w, this.f115961x, null, this.f115962y);
    }
}
