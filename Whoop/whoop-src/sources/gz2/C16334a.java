package gz2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import h21.AbstractC16779c;
import kd1.AbstractC22403o;
import rq2.AbstractC31729i;
import vs2.AbstractC36479e;

/* JADX INFO: renamed from: gz2.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C16334a implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f62840E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f62841w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC22403o f62842x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f62843y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f62844z;

    public /* synthetic */ C16334a(AbstractC22403o abstractC22403o, Modifier modifier, int i13, int i14, int i15) {
        this.f62841w = i15;
        this.f62842x = abstractC22403o;
        this.f62843y = modifier;
        this.f62844z = i13;
        this.f62840E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f62841w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC16335b.m46530g(this.f62842x, this.f62843y, this.f62844z, this.f62840E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC16779c.m47305m(this.f62842x, this.f62843y, this.f62844z, this.f62840E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC31729i.m98468o(this.f62842x, this.f62843y, this.f62844z, this.f62840E, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC36479e.m116857S(this.f62842x, this.f62843y, this.f62844z, this.f62840E, (Composer) obj, iIntValue4);
        }
    }
}
