package p699b70;

import com.whoop.analytics.AnalyticEventModel;
import dn0.AbstractC12216p;
import java.time.LocalDate;
import ld1.AbstractC23864c;
import p715kotlin.jvm.functions.Function1;
import p741vn1.EnumC36205i;
import rm1.AbstractC31595i;
import yl0.AbstractC39631n;

/* JADX INFO: renamed from: b70.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2776b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10916w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC23864c f10917x;

    public /* synthetic */ C2776b(AbstractC23864c abstractC23864c, int i13) {
        this.f10916w = i13;
        this.f10917x = abstractC23864c;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10916w) {
            case 0:
                return Function1.m7859p(this.f10917x, (AnalyticEventModel) obj);
            case 1:
                return AbstractC12216p.m33875B(this.f10917x, ((Integer) obj).intValue());
            case 2:
                return AbstractC12216p.m33876C(this.f10917x, ((Integer) obj).intValue());
            case 3:
                return AbstractC12216p.m33878E(this.f10917x, (LocalDate) obj);
            case 4:
                return AbstractC31595i.m97476y(this.f10917x, (EnumC36205i) obj);
            default:
                return AbstractC39631n.m126678k(this.f10917x, ((Double) obj).doubleValue());
        }
    }
}
