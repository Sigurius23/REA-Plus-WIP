package p291l0;

import l83.C23454a0;
import p026b2.C2306l;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39133t0;
import p636y3.C39178j;
import p636y3.C39180l;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l0.q1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22991q1 implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f90702E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f90703F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90704w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f90705x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f90706y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f90707z;

    public /* synthetic */ C22991q1(C22964h2 c22964h2, int i13, AbstractC39104j1 abstractC39104j1, int i14, InterfaceC39133t0 interfaceC39133t0) {
        this.f90707z = c22964h2;
        this.f90705x = i13;
        this.f90702E = abstractC39104j1;
        this.f90706y = i14;
        this.f90703F = interfaceC39133t0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f90704w) {
            case 0:
                AbstractC39104j1[] abstractC39104j1Arr = (AbstractC39104j1[]) this.f90707z;
                C22994r1 c22994r1 = (C22994r1) this.f90702E;
                int[] iArr = (int[]) this.f90703F;
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
                    AbstractC22953f abstractC22953f = c22985o1 != null ? c22985o1.f90676c : null;
                    int i16 = this.f90705x;
                    abstractC39101i1.m124632f(abstractC39104j1, iArr[i14], abstractC22953f != null ? abstractC22953f.mo66707d(i16 - abstractC39104j1.f168212x, EnumC39181m.f168423w, abstractC39104j1, this.f90706y) : ((C2306l) c22994r1.f90717b).m7157a(0, i16 - abstractC39104j1.f168212x), 0.0f);
                    i13++;
                    i14 = i15;
                }
                break;
            default:
                C22964h2 c22964h2 = (C22964h2) this.f90707z;
                AbstractC39104j1 abstractC39104j2 = (AbstractC39104j1) this.f90702E;
                AbstractC39101i1.m124623k((AbstractC39101i1) obj, abstractC39104j2, ((C39178j) c22964h2.f90620Q.invoke(new C39180l((((long) (this.f90705x - abstractC39104j2.f168211w)) << 32) | (((long) (this.f90706y - abstractC39104j2.f168212x)) & 4294967295L)), ((InterfaceC39133t0) this.f90703F).getLayoutDirection())).f168416a);
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C22991q1(AbstractC39104j1[] abstractC39104j1Arr, C22994r1 c22994r1, int i13, int i14, int[] iArr) {
        this.f90707z = abstractC39104j1Arr;
        this.f90702E = c22994r1;
        this.f90705x = i13;
        this.f90706y = i14;
        this.f90703F = iArr;
    }
}
