package p292l1;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p316m1.C24900f;
import p316m1.C24902g;
import p715kotlin.jvm.internal.C22663d0;

/* JADX INFO: renamed from: l1.u3 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23184u3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91706w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C24900f f91707x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C22663d0 f91708y;

    public /* synthetic */ C23184u3(C24900f c24900f, C22663d0 c22663d0, int i13) {
        this.f91706w = i13;
        this.f91707x = c24900f;
        this.f91708y = c22663d0;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f91706w;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (i13) {
            case 0:
                C24902g c24902g = this.f91707x.f97535a;
                c24902g.f97550j.m87023y(fFloatValue);
                c24902g.f97551k.m87023y(fFloatValue2);
                this.f91708y.f89331w = fFloatValue;
                break;
            default:
                C24902g c24902g2 = this.f91707x.f97535a;
                c24902g2.f97550j.m87023y(fFloatValue);
                c24902g2.f97551k.m87023y(fFloatValue2);
                this.f91708y.f89331w = fFloatValue;
                break;
        }
        return C23454a0.f92919a;
    }
}
