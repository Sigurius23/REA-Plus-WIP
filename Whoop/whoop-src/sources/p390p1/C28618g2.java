package p390p1;

import d93.InterfaceC11820a;
import java.util.Iterator;

/* JADX INFO: renamed from: p1.g2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28618g2 implements Iterable, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final C28614f2 f115774w;

    /* JADX INFO: renamed from: x */
    public final int f115775x;

    /* JADX INFO: renamed from: y */
    public final int f115776y;

    public C28618g2(C28614f2 c28614f2, int i13, int i14) {
        this.f115774w = c28614f2;
        this.f115775x = i13;
        this.f115776y = i14;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C28614f2 c28614f2 = this.f115774w;
        if (c28614f2.f115760H != this.f115776y) {
            AbstractC28622h2.m87031f();
        }
        int i13 = this.f115775x;
        c28614f2.m87019j(i13);
        return new C28640m0(c28614f2, i13 + 1, AbstractC28622h2.m87026a(c28614f2.f115764w, i13) + i13);
    }
}
