package hc3;

import bc3.AbstractRunnableC3071x0;
import bc3.C3074y0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hc3.b0 */
/* JADX INFO: loaded from: classes5.dex */
public class C17168b0 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f65963b = AtomicIntegerFieldUpdater.newUpdater(C17168b0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a */
    public AbstractRunnableC3071x0[] f65964a;

    /* JADX INFO: renamed from: a */
    public final void m48488a(AbstractRunnableC3071x0 abstractRunnableC3071x0) {
        abstractRunnableC3071x0.m8828c((C3074y0) this);
        AbstractRunnableC3071x0[] abstractRunnableC3071x0Arr = this.f65964a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f65963b;
        if (abstractRunnableC3071x0Arr == null) {
            abstractRunnableC3071x0Arr = new AbstractRunnableC3071x0[4];
            this.f65964a = abstractRunnableC3071x0Arr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC3071x0Arr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(abstractRunnableC3071x0Arr, atomicIntegerFieldUpdater.get(this) * 2);
            AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
            abstractRunnableC3071x0Arr = (AbstractRunnableC3071x0[]) objArrCopyOf;
            this.f65964a = abstractRunnableC3071x0Arr;
        }
        int i13 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i13 + 1);
        abstractRunnableC3071x0Arr[i13] = abstractRunnableC3071x0;
        abstractRunnableC3071x0.f12107x = i13;
        m48490c(i13);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final AbstractRunnableC3071x0 m48489b(int i13) {
        int i14;
        int i15;
        Object[] objArr;
        int i16;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f65964a;
        AbstractC22676k.m65747g(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f65963b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i13 < atomicIntegerFieldUpdater.get(this)) {
            m48491d(i13, atomicIntegerFieldUpdater.get(this));
            int i17 = (i13 - 1) / 2;
            if (i13 > 0) {
                AbstractRunnableC3071x0 abstractRunnableC3071x0 = objArr2[i13];
                AbstractC22676k.m65747g(abstractRunnableC3071x0);
                Object obj2 = objArr2[i17];
                AbstractC22676k.m65747g(obj2);
                if (abstractRunnableC3071x0.compareTo(obj2) < 0) {
                    m48491d(i13, i17);
                    m48490c(i17);
                } else {
                    while (true) {
                        i14 = i13 * 2;
                        i15 = i14 + 1;
                        if (i15 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.f65964a;
                        AbstractC22676k.m65747g(objArr);
                        i16 = i14 + 2;
                        if (i16 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i16];
                            AbstractC22676k.m65747g(comparable3);
                            obj = objArr[i15];
                            AbstractC22676k.m65747g(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i16 = i15;
                            }
                        } else {
                            i16 = i15;
                        }
                        comparable = objArr[i13];
                        AbstractC22676k.m65747g(comparable);
                        comparable2 = objArr[i16];
                        AbstractC22676k.m65747g(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        m48491d(i13, i16);
                        i13 = i16;
                    }
                }
            } else {
                while (true) {
                    i14 = i13 * 2;
                    i15 = i14 + 1;
                    if (i15 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.f65964a;
                    AbstractC22676k.m65747g(objArr);
                    i16 = i14 + 2;
                    if (i16 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i16];
                        AbstractC22676k.m65747g(comparable3);
                        obj = objArr[i15];
                        AbstractC22676k.m65747g(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i16 = i15;
                        }
                    } else {
                        i16 = i15;
                    }
                    comparable = objArr[i13];
                    AbstractC22676k.m65747g(comparable);
                    comparable2 = objArr[i16];
                    AbstractC22676k.m65747g(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    m48491d(i13, i16);
                    i13 = i16;
                }
            }
        }
        AbstractRunnableC3071x0 abstractRunnableC3071x1 = objArr2[atomicIntegerFieldUpdater.get(this)];
        AbstractC22676k.m65747g(abstractRunnableC3071x1);
        abstractRunnableC3071x1.m8828c(null);
        abstractRunnableC3071x1.f12107x = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return abstractRunnableC3071x1;
    }

    /* JADX INFO: renamed from: c */
    public final void m48490c(int i13) {
        while (i13 > 0) {
            AbstractRunnableC3071x0[] abstractRunnableC3071x0Arr = this.f65964a;
            AbstractC22676k.m65747g(abstractRunnableC3071x0Arr);
            int i14 = (i13 - 1) / 2;
            AbstractRunnableC3071x0 abstractRunnableC3071x0 = abstractRunnableC3071x0Arr[i14];
            AbstractC22676k.m65747g(abstractRunnableC3071x0);
            AbstractRunnableC3071x0 abstractRunnableC3071x1 = abstractRunnableC3071x0Arr[i13];
            AbstractC22676k.m65747g(abstractRunnableC3071x1);
            if (abstractRunnableC3071x0.compareTo(abstractRunnableC3071x1) <= 0) {
                return;
            }
            m48491d(i13, i14);
            i13 = i14;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m48491d(int i13, int i14) {
        AbstractRunnableC3071x0[] abstractRunnableC3071x0Arr = this.f65964a;
        AbstractC22676k.m65747g(abstractRunnableC3071x0Arr);
        AbstractRunnableC3071x0 abstractRunnableC3071x0 = abstractRunnableC3071x0Arr[i14];
        AbstractC22676k.m65747g(abstractRunnableC3071x0);
        AbstractRunnableC3071x0 abstractRunnableC3071x1 = abstractRunnableC3071x0Arr[i13];
        AbstractC22676k.m65747g(abstractRunnableC3071x1);
        abstractRunnableC3071x0Arr[i13] = abstractRunnableC3071x0;
        abstractRunnableC3071x0Arr[i14] = abstractRunnableC3071x1;
        abstractRunnableC3071x0.f12107x = i13;
        abstractRunnableC3071x1.f12107x = i14;
    }
}
