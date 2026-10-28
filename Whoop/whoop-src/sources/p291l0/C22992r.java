package p291l0;

import l83.C23454a0;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39133t0;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l0.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22992r implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f90708E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f90709F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f90710G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90711w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f90712x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f90713y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC39133t0 f90714z;

    public /* synthetic */ C22992r(AbstractC39104j1 abstractC39104j1, InterfaceC39124q0 interfaceC39124q0, InterfaceC39133t0 interfaceC39133t0, int i13, int i14, C22998t c22998t) {
        this.f90708E = abstractC39104j1;
        this.f90709F = interfaceC39124q0;
        this.f90714z = interfaceC39133t0;
        this.f90712x = i13;
        this.f90713y = i14;
        this.f90710G = c22998t;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f90711w) {
            case 0:
                AbstractC22989q.m66761b((AbstractC39101i1) obj, (AbstractC39104j1) this.f90708E, (InterfaceC39124q0) this.f90709F, this.f90714z.getLayoutDirection(), this.f90712x, this.f90713y, ((C22998t) this.f90710G).f90724a);
                break;
            default:
                AbstractC39104j1[] abstractC39104j1Arr = (AbstractC39104j1[]) this.f90708E;
                C23010x c23010x = (C23010x) this.f90709F;
                int[] iArr = (int[]) this.f90710G;
                AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
                int length = abstractC39104j1Arr.length;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length) {
                    AbstractC39104j1 abstractC39104j1 = abstractC39104j1Arr[i13];
                    int i15 = i14 + 1;
                    AbstractC22676k.m65747g(abstractC39104j1);
                    Object objMo454p = abstractC39104j1.mo454p();
                    C22985o1 c22985o1 = objMo454p instanceof C22985o1 ? (C22985o1) objMo454p : null;
                    EnumC39181m layoutDirection = this.f90714z.getLayoutDirection();
                    AbstractC22953f abstractC22953f = c22985o1 != null ? c22985o1.f90676c : null;
                    int i16 = this.f90712x;
                    abstractC39101i1.m124632f(abstractC39104j1, abstractC22953f != null ? abstractC22953f.mo66707d(i16 - abstractC39104j1.f168211w, layoutDirection, abstractC39104j1, this.f90713y) : c23010x.f90746b.mo7155a(0, i16 - abstractC39104j1.f168211w, layoutDirection), iArr[i14], 0.0f);
                    i13++;
                    i14 = i15;
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C22992r(AbstractC39104j1[] abstractC39104j1Arr, C23010x c23010x, int i13, int i14, InterfaceC39133t0 interfaceC39133t0, int[] iArr) {
        this.f90708E = abstractC39104j1Arr;
        this.f90709F = c23010x;
        this.f90712x = i13;
        this.f90713y = i14;
        this.f90714z = interfaceC39133t0;
        this.f90710G = iArr;
    }
}
