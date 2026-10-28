package p716lb1;

import com.whoop.design.models.ImpactMagnitudeTileModel;
import com.whoop.design.models.MagnitudeDetailCardModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import o21.C27465c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import s71.C32241c;

/* JADX INFO: renamed from: lb1.f2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/ImpactMagnitudeTileModel;", "model", "Ls71/c;", "a", "(Lcom/whoop/design/models/ImpactMagnitudeTileModel;)Ls71/c;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23625f2 {
    /* JADX INFO: renamed from: a */
    public static final C32241c m68745a(ImpactMagnitudeTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getMagnitudeHeaderDisplay());
        List<MagnitudeDetailCardModel> magnitudeCards = model.getMagnitudeCards();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(magnitudeCards, 10));
        for (MagnitudeDetailCardModel magnitudeDetailCardModel : magnitudeCards) {
            arrayList.add(new C27465c(AbstractC8693b.m21278l(magnitudeDetailCardModel.getMagnitudeDisplay()), AbstractC8693b.m21278l(magnitudeDetailCardModel.getCountDisplay()), AbstractC8693b.m21278l(magnitudeDetailCardModel.getImpactDisplay()), C23639h2.f93783a.m68833d(magnitudeDetailCardModel.getImpactStyle())));
        }
        return new C32241c(textResourceM21278l, arrayList, AbstractC8693b.m21278l(model.getMagnitudeCalloutDisplay()));
    }
}
