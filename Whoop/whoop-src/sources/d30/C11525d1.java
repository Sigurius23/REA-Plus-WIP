package d30;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p512u2.AbstractC34454d0;
import p512u2.C34472r;
import p599wz.AbstractC37713e1;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d30.d1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C11525d1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37133w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f37134x;

    public /* synthetic */ C11525d1(int i13, InterfaceC4351m interfaceC4351m) {
        this.f37133w = i13;
        this.f37134x = interfaceC4351m;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37133w) {
            case 0:
                InterfaceC39147y coordinates = (InterfaceC39147y) obj;
                AbstractC22676k.m65750j(coordinates, "coordinates");
                this.f37134x.invoke("saved", coordinates);
                break;
            case 1:
                C34472r c34472r = (C34472r) obj;
                this.f37134x.invoke(c34472r, Float.valueOf(Float.intBitsToFloat((int) (AbstractC34454d0.m108920k(c34472r, false) >> 32))));
                c34472r.m108946a();
                break;
            case 2:
                C34472r c34472r2 = (C34472r) obj;
                this.f37134x.invoke(c34472r2, Float.valueOf(Float.intBitsToFloat((int) (AbstractC34454d0.m108920k(c34472r2, false) & 4294967295L))));
                c34472r2.m108946a();
                break;
            default:
                AbstractC37713e1 screen = (AbstractC37713e1) obj;
                AbstractC22676k.m65750j(screen, "screen");
                this.f37134x.invoke(screen, Boolean.TRUE);
                break;
        }
        return C23454a0.f92919a;
    }
}
