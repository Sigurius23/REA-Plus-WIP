package bq1;

import ad3.AbstractC0757c;
import com.whoop.hormonalinsights.naturalcycles.domain.models.NaturalCyclesFertilityCardModel;
import jb1.C21536b;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import to1.AbstractC34019l;

/* JADX INFO: renamed from: bq1.a */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C3549a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14282w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC0757c f14283x;

    public /* synthetic */ C3549a(AbstractC0757c abstractC0757c, int i13) {
        this.f14282w = i13;
        this.f14283x = abstractC0757c;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14282w) {
            case 0:
                return AbstractC3551c.m10598f(this.f14283x, (C21536b) obj);
            case 1:
                return AbstractC3551c.m10599g(this.f14283x, (C23749z0) obj);
            default:
                return AbstractC34019l.m107523F(this.f14283x, (NaturalCyclesFertilityCardModel) obj);
        }
    }
}
