package am2;

import androidx.compose.runtime.Composer;
import b30.C2571m0;
import c41.AbstractC4021f1;
import c93.InterfaceC4351m;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p507tx.AbstractC34235f;
import p715kotlin.jvm.functions.Function1;
import qu2.AbstractC30640h;
import xq2.AbstractC38586q0;

/* JADX INFO: renamed from: am2.k0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1027k0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f3906E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3907w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f3908x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f3909y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f3910z;

    public /* synthetic */ C1027k0(Object obj, float f13, int i13, int i14, int i15) {
        this.f3907w = i15;
        this.f3906E = obj;
        this.f3908x = f13;
        this.f3909y = i13;
        this.f3910z = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3907w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC1035o0.m2877f0((C1034o) this.f3906E, this.f3908x, this.f3909y, this.f3910z, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(this.f3909y | 1);
                AbstractC34235f.m108215a((C2571m0) this.f3906E, this.f3908x, (Composer) obj, iM87244L, this.f3910z);
                return C23454a0.f92919a;
            case 2:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC4021f1.m12241r((List) this.f3906E, this.f3908x, this.f3909y, this.f3910z, (Composer) obj, iIntValue2);
            case 3:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC30640h.m94113b1((Function1) this.f3906E, this.f3908x, this.f3909y, this.f3910z, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC38586q0.m123753r((AbstractC22403o) this.f3906E, this.f3908x, this.f3909y, this.f3910z, (Composer) obj, iIntValue4);
        }
    }
}
