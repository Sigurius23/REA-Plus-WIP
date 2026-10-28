package p511u1;

import java.util.Iterator;
import m83.AbstractC25246g;

/* JADX INFO: renamed from: u1.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C34402i extends AbstractC25246g {

    /* JADX INFO: renamed from: w */
    public final C34398e f144619w;

    public C34402i(C34398e c34398e) {
        this.f144619w = c34398e;
    }

    @Override // m83.AbstractC25246g
    /* JADX INFO: renamed from: a */
    public final int mo73985a() {
        return this.f144619w.mo74011c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f144619w.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f144619w.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        AbstractC34409p[] abstractC34409pArr = new AbstractC34409p[8];
        for (int i13 = 0; i13 < 8; i13++) {
            abstractC34409pArr[i13] = new C34411r(1);
        }
        return new C34401h(this.f144619w, abstractC34409pArr);
    }
}
