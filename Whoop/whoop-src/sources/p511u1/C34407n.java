package p511u1;

import java.util.Iterator;
import m83.AbstractC25234a;

/* JADX INFO: renamed from: u1.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C34407n extends AbstractC25234a {

    /* JADX INFO: renamed from: w */
    public final C34396c f144622w;

    public C34407n(C34396c c34396c) {
        this.f144622w = c34396c;
    }

    @Override // m83.AbstractC25234a
    /* JADX INFO: renamed from: a */
    public final int mo73980a() {
        C34396c c34396c = this.f144622w;
        c34396c.getClass();
        return c34396c.f144603x;
    }

    @Override // m83.AbstractC25234a, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f144622w.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C34408o c34408o = this.f144622w.f144602w;
        AbstractC34409p[] abstractC34409pArr = new AbstractC34409p[8];
        for (int i13 = 0; i13 < 8; i13++) {
            abstractC34409pArr[i13] = new C34411r(1);
        }
        return new C34406m(c34408o, abstractC34409pArr);
    }
}
