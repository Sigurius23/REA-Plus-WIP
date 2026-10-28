package hc3;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kc3.C22361a;

/* JADX INFO: renamed from: hc3.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C17187t {
    private volatile AtomicReferenceArray<Object> array;

    public C17187t(int i13) {
        this.array = new AtomicReferenceArray<>(i13);
    }

    /* JADX INFO: renamed from: a */
    public final int m48539a() {
        return this.array.length();
    }

    /* JADX INFO: renamed from: b */
    public final Object m48540b(int i13) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i13 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i13);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m48541c(int i13, C22361a c22361a) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i13 < length) {
            atomicReferenceArray.set(i13, c22361a);
            return;
        }
        int i14 = i13 + 1;
        int i15 = length * 2;
        if (i14 < i15) {
            i14 = i15;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i14);
        for (int i16 = 0; i16 < length; i16++) {
            atomicReferenceArray2.set(i16, atomicReferenceArray.get(i16));
        }
        atomicReferenceArray2.set(i13, c22361a);
        this.array = atomicReferenceArray2;
    }
}
