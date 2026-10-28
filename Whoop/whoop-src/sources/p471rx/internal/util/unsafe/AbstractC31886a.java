package p471rx.internal.util.unsafe;

import java.util.Iterator;
import p098dt.AbstractC12350b;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: rx.internal.util.unsafe.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC31886a extends AbstractC31887b {

    /* JADX INFO: renamed from: E */
    public static final int f132394E;

    /* JADX INFO: renamed from: y */
    public static final int f132395y;

    /* JADX INFO: renamed from: z */
    public static final long f132396z;

    /* JADX INFO: renamed from: w */
    public final long f132397w;

    /* JADX INFO: renamed from: x */
    public final Object[] f132398x;

    static {
        int iIntValue = Integer.getInteger("sparse.shift", 0).intValue();
        f132395y = iIntValue;
        Unsafe unsafe = AbstractC31895j.f132402a;
        int iArrayIndexScale = unsafe.arrayIndexScale(Object[].class);
        if (4 == iArrayIndexScale) {
            f132394E = iIntValue + 2;
        } else {
            if (8 != iArrayIndexScale) {
                throw new IllegalStateException("Unknown pointer size");
            }
            f132394E = iIntValue + 3;
        }
        f132396z = unsafe.arrayBaseOffset(Object[].class) + (32 << (f132394E - iIntValue));
    }

    public AbstractC31886a(int i13) {
        int iM34564M = AbstractC12350b.m34564M(i13);
        this.f132397w = iM34564M - 1;
        this.f132398x = new Object[(iM34564M << f132395y) + 64];
    }

    /* JADX INFO: renamed from: c */
    public static Object m99136c(Object[] objArr, long j7) {
        return AbstractC31895j.f132402a.getObjectVolatile(objArr, j7);
    }

    /* JADX INFO: renamed from: d */
    public static void m99137d(Object[] objArr, long j7, Object obj) {
        AbstractC31895j.f132402a.putOrderedObject(objArr, j7, obj);
    }

    /* JADX INFO: renamed from: a */
    public final long m99138a(long j7) {
        return f132396z + ((j7 & this.f132397w) << f132394E);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }
}
