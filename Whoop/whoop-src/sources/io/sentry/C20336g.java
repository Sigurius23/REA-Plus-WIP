package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: renamed from: io.sentry.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C20336g extends AbstractCollection implements Queue, Serializable {

    /* JADX INFO: renamed from: E */
    public final int f76342E;

    /* JADX INFO: renamed from: w */
    public final transient Object[] f76343w;

    /* JADX INFO: renamed from: x */
    public transient int f76344x = 0;

    /* JADX INFO: renamed from: y */
    public transient int f76345y = 0;

    /* JADX INFO: renamed from: z */
    public transient boolean f76346z = false;

    public C20336g(int i13) {
        if (i13 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        Object[] objArr = new Object[i13];
        this.f76343w = objArr;
        this.f76342E = objArr.length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        int size = size();
        int i13 = this.f76342E;
        if (size == i13) {
            remove();
        }
        int i14 = this.f76345y;
        int i15 = i14 + 1;
        this.f76345y = i15;
        this.f76343w[i14] = obj;
        if (i15 >= i13) {
            this.f76345y = 0;
        }
        if (this.f76345y == this.f76344x) {
            this.f76346z = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f76346z = false;
        this.f76344x = 0;
        this.f76345y = 0;
        Arrays.fill(this.f76343w, (Object) null);
    }

    @Override // java.util.Queue
    public final Object element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C20324f(this);
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f76343w[this.f76344x];
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public final Object remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        int i13 = this.f76344x;
        Object[] objArr = this.f76343w;
        Object obj = objArr[i13];
        if (obj != null) {
            int i14 = i13 + 1;
            this.f76344x = i14;
            objArr[i13] = null;
            if (i14 >= this.f76342E) {
                this.f76344x = 0;
            }
            this.f76346z = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i13 = this.f76345y;
        int i14 = this.f76344x;
        int i15 = this.f76342E;
        if (i13 < i14) {
            return (i15 - i14) + i13;
        }
        if (i13 != i14) {
            return i13 - i14;
        }
        if (this.f76346z) {
            return i15;
        }
        return 0;
    }
}
