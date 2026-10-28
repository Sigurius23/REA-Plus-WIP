package jk1;

import com.whoop.healthspan.domain.models.ContributorsContainerResponse;
import com.whoop.healthspan.domain.models.LabsImpactCardModel;
import com.whoop.healthspan.domain.models.TileSectionModel;
import fk1.C14553a;
import jb1.C21536b;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;

/* JADX INFO: renamed from: jk1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C21756a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f83670w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14553a f83671x;

    public /* synthetic */ C21756a(C14553a c14553a, int i13) {
        this.f83670w = i13;
        this.f83671x = c14553a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f83670w) {
            case 0:
                return AbstractC21757b.m61414v(this.f83671x, (C21536b) obj);
            case 1:
                return AbstractC21757b.m61416x(this.f83671x, (TileSectionModel) obj);
            case 2:
                return AbstractC21757b.m61418z(this.f83671x, (C21536b) obj);
            case 3:
                return AbstractC21757b.m61406n(this.f83671x, (ContributorsContainerResponse) obj);
            case 4:
                return AbstractC21757b.m61407o(this.f83671x, (LabsImpactCardModel) obj);
            default:
                return AbstractC21757b.m61392A(this.f83671x, (C23749z0) obj);
        }
    }
}
