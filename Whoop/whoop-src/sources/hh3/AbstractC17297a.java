package hh3;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: hh3.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17297a extends AbstractQueue {

    /* JADX INFO: renamed from: w */
    public final AtomicReferenceArray f66474w;

    /* JADX INFO: renamed from: x */
    public final int f66475x;

    public AbstractC17297a(int i13) {
        int iM34564M = AbstractC12350b.m34564M(i13);
        this.f66475x = iM34564M - 1;
        this.f66474w = new AtomicReferenceArray(iM34564M);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        while (true) {
            if (((C17298b) this).poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }
}
