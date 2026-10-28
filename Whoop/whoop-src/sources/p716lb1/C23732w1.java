package p716lb1;

import com.whoop.design.models.items.GoalTileModel;
import com.whoop.design.models.items.graph.GraphingCardModel;
import p715kotlin.jvm.functions.Function1;
import vb1.AbstractC35869b;

/* JADX INFO: renamed from: lb1.w1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C23732w1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f94040w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C23749z0 f94041x;

    public /* synthetic */ C23732w1(C23749z0 c23749z0, int i13) {
        this.f94040w = i13;
        this.f94041x = c23749z0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f94040w) {
            case 0:
                return AbstractC23738x1.m69648e(this.f94041x, (GoalTileModel) obj);
            default:
                return AbstractC35869b.m113869o(this.f94041x, (GraphingCardModel) obj);
        }
    }
}
