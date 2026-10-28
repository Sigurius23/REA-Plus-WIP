package dy0;

import com.whoop.deepdive.domain.models.ArchMiniLastNightModel;
import com.whoop.design.models.items.ContributorTileModel;
import jb1.C21535a;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;

/* JADX INFO: renamed from: dy0.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C12443b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42386w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21535a f42387x;

    public /* synthetic */ C12443b(C21535a c21535a, int i13) {
        this.f42386w = i13;
        this.f42387x = c21535a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f42386w) {
            case 0:
                return AbstractC12444c.m35012i(this.f42387x, (C23749z0) obj);
            case 1:
                return AbstractC12444c.m35014k(this.f42387x, (ArchMiniLastNightModel) obj);
            default:
                return AbstractC12444c.m35016m(this.f42387x, (ContributorTileModel) obj);
        }
    }
}
