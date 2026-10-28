package ne3;

import java.util.concurrent.atomic.AtomicReference;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.l0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC26625l0 {

    /* JADX INFO: renamed from: a */
    public static final C26623k0 f105886a = new C26623k0(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: b */
    public static final int f105887b;

    /* JADX INFO: renamed from: c */
    public static final AtomicReference[] f105888c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f105887b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i13 = 0; i13 < iHighestOneBit; i13++) {
            atomicReferenceArr[i13] = new AtomicReference();
        }
        f105888c = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: a */
    public static final void m79267a(C26623k0 segment) {
        AbstractC22676k.m65750j(segment, "segment");
        if (segment.f105879f != null || segment.f105880g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f105877d) {
            return;
        }
        AtomicReference atomicReference = f105888c[(int) (Thread.currentThread().getId() & (((long) f105887b) - 1))];
        C26623k0 c26623k0 = f105886a;
        C26623k0 c26623k1 = (C26623k0) atomicReference.getAndSet(c26623k0);
        if (c26623k1 == c26623k0) {
            return;
        }
        int i13 = c26623k1 != null ? c26623k1.f105876c : 0;
        if (i13 >= 65536) {
            atomicReference.set(c26623k1);
            return;
        }
        segment.f105879f = c26623k1;
        segment.f105875b = 0;
        segment.f105876c = i13 + DfuBaseService.ERROR_REMOTE_MASK;
        atomicReference.set(segment);
    }

    /* JADX INFO: renamed from: b */
    public static final C26623k0 m79268b() {
        AtomicReference atomicReference = f105888c[(int) (Thread.currentThread().getId() & (((long) f105887b) - 1))];
        C26623k0 c26623k0 = f105886a;
        C26623k0 c26623k1 = (C26623k0) atomicReference.getAndSet(c26623k0);
        if (c26623k1 == c26623k0) {
            return new C26623k0();
        }
        if (c26623k1 == null) {
            atomicReference.set(null);
            return new C26623k0();
        }
        atomicReference.set(c26623k1.f105879f);
        c26623k1.f105879f = null;
        c26623k1.f105876c = 0;
        return c26623k1;
    }
}
