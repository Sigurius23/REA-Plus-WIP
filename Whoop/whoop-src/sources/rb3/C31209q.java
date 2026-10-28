package rb3;

import java.util.Iterator;
import lb3.C23774g;

/* JADX INFO: renamed from: rb3.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C31209q extends AbstractC31193a {

    /* JADX INFO: renamed from: w */
    public final C23774g f128553w;

    /* JADX INFO: renamed from: x */
    public final int f128554x;

    public C31209q(C23774g c23774g, int i13) {
        this.f128553w = c23774g;
        this.f128554x = i13;
    }

    @Override // rb3.AbstractC31193a
    /* JADX INFO: renamed from: a */
    public final int mo96145a() {
        return 1;
    }

    @Override // rb3.AbstractC31193a
    /* JADX INFO: renamed from: c */
    public final void mo96146c(int i13, Object obj) {
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: d */
    public final int m96153d() {
        return this.f128554x;
    }

    /* JADX INFO: renamed from: e */
    public final Object m96154e() {
        return this.f128553w;
    }

    @Override // rb3.AbstractC31193a
    public final Object get(int i13) {
        if (i13 == this.f128554x) {
            return this.f128553w;
        }
        return null;
    }

    @Override // rb3.AbstractC31193a, java.lang.Iterable
    public final Iterator iterator() {
        return new C31208p(this, 0);
    }
}
