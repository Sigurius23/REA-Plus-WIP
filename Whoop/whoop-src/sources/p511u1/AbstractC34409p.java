package p511u1;

import d93.InterfaceC11820a;
import java.util.Iterator;

/* JADX INFO: renamed from: u1.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC34409p implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public Object[] f144628w = C34408o.f144623e.f144627d;

    /* JADX INFO: renamed from: x */
    public int f144629x;

    /* JADX INFO: renamed from: y */
    public int f144630y;

    /* JADX INFO: renamed from: a */
    public final void m108790a(int i13, int i14, Object[] objArr) {
        this.f144628w = objArr;
        this.f144629x = i13;
        this.f144630y = i14;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f144630y < this.f144629x;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
