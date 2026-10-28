package ch3;

import java.util.concurrent.atomic.AtomicLong;
import p088dc.AbstractC11895b;
import xg3.AbstractC38292s;
import xg3.InterfaceC38282i;

/* JADX INFO: renamed from: ch3.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C4695m extends AtomicLong implements InterfaceC38282i {

    /* JADX INFO: renamed from: w */
    public final AbstractC38292s f19229w;

    /* JADX INFO: renamed from: x */
    public final Object[] f19230x;

    /* JADX INFO: renamed from: y */
    public int f19231y;

    public C4695m(AbstractC38292s abstractC38292s, Object[] objArr) {
        this.f19229w = abstractC38292s;
        this.f19230x = objArr;
    }

    @Override // xg3.InterfaceC38282i
    public final void request(long j7) {
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "n >= 0 required but it was "));
        }
        Object[] objArr = this.f19230x;
        AbstractC38292s abstractC38292s = this.f19229w;
        if (j7 == Long.MAX_VALUE) {
            if (AbstractC4677d.m14745b(this, j7) == 0) {
                for (Object obj : objArr) {
                    if (abstractC38292s.mo14749a()) {
                        return;
                    }
                    abstractC38292s.onNext(obj);
                }
                if (abstractC38292s.mo14749a()) {
                    return;
                }
                abstractC38292s.onCompleted();
                return;
            }
            return;
        }
        if (j7 == 0 || AbstractC4677d.m14745b(this, j7) != 0) {
            return;
        }
        int length = objArr.length;
        int i13 = this.f19231y;
        do {
            long j13 = 0;
            while (true) {
                if (j7 == 0 || i13 == length) {
                    j7 = get() + j13;
                    if (j7 == 0) {
                        break;
                    }
                } else {
                    if (abstractC38292s.mo14749a()) {
                        return;
                    }
                    abstractC38292s.onNext(objArr[i13]);
                    i13++;
                    if (i13 == length) {
                        if (abstractC38292s.mo14749a()) {
                            return;
                        }
                        abstractC38292s.onCompleted();
                        return;
                    }
                    j7--;
                    j13--;
                }
            }
            this.f19231y = i13;
            j7 = addAndGet(j13);
        } while (j7 != 0);
    }
}
