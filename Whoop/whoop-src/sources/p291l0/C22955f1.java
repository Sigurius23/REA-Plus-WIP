package p291l0;

import com.mapbox.maps.MapboxMap;
import l83.C23454a0;
import p027b3.C2404l2;
import p636y3.C39174f;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l0.f1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22955f1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90597w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f90598x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f90599y;

    public /* synthetic */ C22955f1(float f13, float f14, int i13) {
        this.f90597w = i13;
        this.f90598x = f13;
        this.f90599y = f14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C2404l2 c2404l2 = (C2404l2) obj;
        switch (this.f90597w) {
            case 0:
                c2404l2.m7401c(MapboxMap.QFE_OFFSET);
                c2404l2.m7400b().m7292c(new C39174f(this.f90598x), "x");
                c2404l2.m7400b().m7292c(new C39174f(this.f90599y), "y");
                break;
            default:
                c2404l2.m7401c("padding");
                c2404l2.m7400b().m7292c(new C39174f(this.f90598x), "horizontal");
                c2404l2.m7400b().m7292c(new C39174f(this.f90599y), "vertical");
                break;
        }
        return C23454a0.f92919a;
    }
}
