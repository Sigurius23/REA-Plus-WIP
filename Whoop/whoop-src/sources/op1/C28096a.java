package op1;

import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciTileSectionModel;
import jb1.C21536b;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;

/* JADX INFO: renamed from: op1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C28096a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f113625w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C28097b f113626x;

    public /* synthetic */ C28096a(C28097b c28097b, int i13) {
        this.f113625w = i13;
        this.f113626x = c28097b;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f113625w) {
            case 0:
                return C28097b.m84887g(this.f113626x, (C21536b) obj);
            case 1:
                return C28097b.m84888h(this.f113626x, (C23749z0) obj);
            default:
                return C28097b.m84890j(this.f113626x, (MciTileSectionModel) obj);
        }
    }
}
