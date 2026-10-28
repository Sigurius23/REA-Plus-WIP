package p390p1;

import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p748zc1.AbstractC40304d6;
import p748zc1.AbstractC40422o4;
import p748zc1.AbstractC40504w6;

/* JADX INFO: renamed from: p1.j2 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C28630j2 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f115812w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C28617g1 f115813x;

    public /* synthetic */ C28630j2(C28617g1 c28617g1, int i13) {
        this.f115812w = i13;
        this.f115813x = c28617g1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f115812w;
        float fFloatValue = ((Float) obj).floatValue();
        switch (i13) {
            case 0:
                this.f115813x.m87023y(fFloatValue);
                return C23454a0.f92919a;
            case 1:
                return AbstractC40422o4.m130524f(this.f115813x, fFloatValue);
            case 2:
                return AbstractC40422o4.m130525g(this.f115813x, fFloatValue);
            case 3:
                return AbstractC40422o4.m130526h(this.f115813x, fFloatValue);
            case 4:
                return AbstractC40304d6.m129530N(this.f115813x, fFloatValue);
            case 5:
                return AbstractC40304d6.m129531O(this.f115813x, fFloatValue);
            case 6:
                return AbstractC40304d6.m129520D(this.f115813x, fFloatValue);
            case 7:
                return AbstractC40304d6.m129521E(this.f115813x, fFloatValue);
            case 8:
                return AbstractC40304d6.m129522F(this.f115813x, fFloatValue);
            case 9:
                return AbstractC40304d6.m129525I(this.f115813x, fFloatValue);
            case 10:
                return AbstractC40304d6.m129528L(this.f115813x, fFloatValue);
            case 11:
                return AbstractC40304d6.m129529M(this.f115813x, fFloatValue);
            case 12:
                return AbstractC40504w6.m131102l(this.f115813x, fFloatValue);
            default:
                return AbstractC40504w6.m131103m(this.f115813x, fFloatValue);
        }
    }
}
