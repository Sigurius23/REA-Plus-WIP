package c30;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import nq2.AbstractC27062e;
import p00.AbstractC28571h;
import p097ds.AbstractC12313p;
import p390p1.AbstractC28683x;
import p734sl0.AbstractC32681u2;

/* JADX INFO: renamed from: c30.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C3911b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15995w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f15996x;

    public /* synthetic */ C3911b(boolean z4, int i13) {
        this.f15995w = i13;
        this.f15996x = z4;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15995w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC12313p.m34275a(this.f15996x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 1:
                return AbstractC27062e.m81303A(this.f15996x, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return AbstractC27062e.m81304B(this.f15996x, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                ((Integer) obj2).getClass();
                AbstractC28571h.m86902e(this.f15996x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 4:
                return AbstractC32681u2.m102488x(this.f15996x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && (this.f15996x || ((Boolean) obj2).booleanValue()));
        }
    }

    public /* synthetic */ C3911b(boolean z4, int i13, int i14) {
        this.f15995w = i14;
        this.f15996x = z4;
    }
}
