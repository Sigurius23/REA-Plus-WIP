package dj1;

import com.whoop.health.domain.models.HeartScreenerUpdatedAtInfoModel;
import com.whoop.health.domain.models.ImageVisualizationCardBodyModel;
import com.whoop.health.domain.models.ScreenerStatusTileBodyModel;
import jb1.C21536b;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;

/* JADX INFO: renamed from: dj1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C12089b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40249w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ HeartScreenerUpdatedAtInfoModel f40250x;

    public /* synthetic */ C12089b(HeartScreenerUpdatedAtInfoModel heartScreenerUpdatedAtInfoModel, int i13) {
        this.f40249w = i13;
        this.f40250x = heartScreenerUpdatedAtInfoModel;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f40249w) {
            case 0:
                return AbstractC12090c.m33394v(this.f40250x, (C21536b) obj);
            case 1:
                return AbstractC12090c.m33395w(this.f40250x, (C23749z0) obj);
            case 2:
                return AbstractC12090c.m33397y(this.f40250x, (ImageVisualizationCardBodyModel) obj);
            default:
                return AbstractC12090c.m33398z(this.f40250x, (ScreenerStatusTileBodyModel) obj);
        }
    }
}
