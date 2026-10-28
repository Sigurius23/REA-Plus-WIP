package p690zr;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: zr.a0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC41005a0 {

    /* JADX INFO: renamed from: a */
    public Object[] f176951a;

    /* JADX INFO: renamed from: b */
    public int f176952b;

    /* JADX INFO: renamed from: c */
    public boolean f176953c;

    public AbstractC41005a0(int i13) {
        AbstractC41047q.m133273c(i13, "initialCapacity");
        this.f176951a = new Object[i13];
        this.f176952b = 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m133221e(int i13, int i14) {
        if (i14 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i14 <= i13) {
            return i13;
        }
        int iHighestOneBit = i13 + (i13 >> 1) + 1;
        if (iHighestOneBit < i14) {
            iHighestOneBit = Integer.highestOneBit(i14 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: a */
    public final void m133222a(Object obj) {
        obj.getClass();
        m133225d(1);
        Object[] objArr = this.f176951a;
        int i13 = this.f176952b;
        this.f176952b = i13 + 1;
        objArr[i13] = obj;
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC41005a0 mo133223b(Object obj);

    /* JADX INFO: renamed from: c */
    public final void m133224c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m133225d(collection.size());
            if (collection instanceof AbstractC41008b0) {
                this.f176952b = ((AbstractC41008b0) collection).mo133228c(this.f176952b, this.f176951a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo133223b(it.next());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m133225d(int i13) {
        Object[] objArr = this.f176951a;
        int iM133221e = m133221e(objArr.length, this.f176952b + i13);
        if (iM133221e > objArr.length || this.f176953c) {
            this.f176951a = Arrays.copyOf(this.f176951a, iM133221e);
            this.f176953c = false;
        }
    }
}
