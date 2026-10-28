package p511u1;

import d93.InterfaceC11820a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u1.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC34397d implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final AbstractC34409p[] f144604w;

    /* JADX INFO: renamed from: x */
    public int f144605x;

    /* JADX INFO: renamed from: y */
    public boolean f144606y = true;

    public AbstractC34397d(C34408o c34408o, AbstractC34409p[] abstractC34409pArr) {
        this.f144604w = abstractC34409pArr;
        abstractC34409pArr[0].m108790a(Integer.bitCount(c34408o.f144624a) * 2, 0, c34408o.f144627d);
        this.f144605x = 0;
        m108761a();
    }

    /* JADX INFO: renamed from: a */
    public final void m108761a() {
        int i13 = this.f144605x;
        AbstractC34409p[] abstractC34409pArr = this.f144604w;
        AbstractC34409p abstractC34409p = abstractC34409pArr[i13];
        if (abstractC34409p.f144630y < abstractC34409p.f144629x) {
            return;
        }
        while (-1 < i13) {
            int iM108762b = m108762b(i13);
            if (iM108762b == -1) {
                AbstractC34409p abstractC34409p2 = abstractC34409pArr[i13];
                int i14 = abstractC34409p2.f144630y;
                Object[] objArr = abstractC34409p2.f144628w;
                if (i14 < objArr.length) {
                    int length = objArr.length;
                    abstractC34409p2.f144630y = i14 + 1;
                    iM108762b = m108762b(i13);
                }
            }
            if (iM108762b != -1) {
                this.f144605x = iM108762b;
                return;
            }
            if (i13 > 0) {
                AbstractC34409p abstractC34409p3 = abstractC34409pArr[i13 - 1];
                int i15 = abstractC34409p3.f144630y;
                int length2 = abstractC34409p3.f144628w.length;
                abstractC34409p3.f144630y = i15 + 1;
            }
            abstractC34409pArr[i13].m108790a(0, 0, C34408o.f144623e.f144627d);
            i13--;
        }
        this.f144606y = false;
    }

    /* JADX INFO: renamed from: b */
    public final int m108762b(int i13) {
        AbstractC34409p[] abstractC34409pArr = this.f144604w;
        AbstractC34409p abstractC34409p = abstractC34409pArr[i13];
        int i14 = abstractC34409p.f144630y;
        if (i14 < abstractC34409p.f144629x) {
            return i13;
        }
        Object[] objArr = abstractC34409p.f144628w;
        if (i14 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i14];
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        C34408o c34408o = (C34408o) obj;
        if (i13 == 6) {
            AbstractC34409p abstractC34409p2 = abstractC34409pArr[i13 + 1];
            Object[] objArr2 = c34408o.f144627d;
            abstractC34409p2.m108790a(objArr2.length, 0, objArr2);
        } else {
            abstractC34409pArr[i13 + 1].m108790a(Integer.bitCount(c34408o.f144624a) * 2, 0, c34408o.f144627d);
        }
        return m108762b(i13 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f144606y;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f144606y) {
            throw new NoSuchElementException();
        }
        Object next = this.f144604w[this.f144605x].next();
        m108761a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
