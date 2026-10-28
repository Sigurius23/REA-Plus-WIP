package lh3;

import ch3.AbstractC4677d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p088dc.AbstractC11895b;
import xg3.AbstractC38292s;
import xg3.InterfaceC38282i;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: lh3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C24083f extends AtomicInteger implements InterfaceC38282i, InterfaceC38293t {

    /* JADX INFO: renamed from: w */
    public final AbstractC38292s f95138w;

    /* JADX INFO: renamed from: x */
    public final AtomicLong f95139x = new AtomicLong();

    /* JADX INFO: renamed from: y */
    public final C24081d f95140y;

    /* JADX INFO: renamed from: z */
    public C24084g f95141z;

    public C24083f(C24081d c24081d, AbstractC38292s abstractC38292s) {
        this.f95138w = abstractC38292s;
        this.f95140y = c24081d;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: a */
    public final boolean mo14749a() {
        return this.f95138w.mo14749a();
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: b */
    public final void mo14750b() {
        this.f95140y.m70999c(this);
    }

    @Override // xg3.InterfaceC38282i
    public final void request(long j7) {
        if (j7 > 0) {
            AbstractC4677d.m14745b(this.f95139x, j7);
            ((C24085h) this.f95140y.f95136x).m71001a(this);
        } else if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "n >= required but it was "));
        }
    }
}
