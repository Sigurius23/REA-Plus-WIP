package op1;

import ad3.AbstractC0757c;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CyclePatternTileModel;
import jb1.C21536b;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;

/* JADX INFO: renamed from: op1.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C28098c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f113648w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC0757c f113649x;

    public /* synthetic */ C28098c(AbstractC0757c abstractC0757c, int i13) {
        this.f113648w = i13;
        this.f113649x = abstractC0757c;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f113648w) {
            case 0:
                return AbstractC28099d.m84910j(this.f113649x, (C21536b) obj);
            case 1:
                return AbstractC28099d.m84911k(this.f113649x, (C23749z0) obj);
            default:
                return AbstractC28099d.m84912l(this.f113649x, (CyclePatternTileModel) obj);
        }
    }
}
