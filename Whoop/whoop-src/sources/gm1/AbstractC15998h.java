package gm1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.home.domain.models.ScoreGaugeStickyDialModel;
import com.whoop.home.domain.models.ScoreGaugeStickyModel;
import gz0.AbstractC16315n0;
import i91.AbstractC18247a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23720u1;
import wb3.AbstractC37056f;
import wm1.C37381c;
import wm1.C37390l;

/* JADX INFO: renamed from: gm1.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/ScoreGaugeStickyModel;", "Lwm1/l;", "b", "(Lcom/whoop/home/domain/models/ScoreGaugeStickyModel;)Lwm1/l;", "Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;", "Lwm1/c;", "a", "(Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;)Lwm1/c;", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15998h {
    /* JADX INFO: renamed from: a */
    public static final C37381c m45295a(ScoreGaugeStickyDialModel scoreGaugeStickyDialModel) {
        AbstractC22676k.m65750j(scoreGaugeStickyDialModel, "<this>");
        String id4 = scoreGaugeStickyDialModel.getId();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(scoreGaugeStickyDialModel.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(scoreGaugeStickyDialModel.getScoreDisplay());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(scoreGaugeStickyDialModel.getScoreDisplaySuffix());
        float gaugeFillPercentage = scoreGaugeStickyDialModel.getGaugeFillPercentage();
        AbstractC18247a abstractC18247aM69480t = AbstractC23720u1.m69480t(scoreGaugeStickyDialModel.getProgressFillStyle());
        String titleEndIcon = scoreGaugeStickyDialModel.getTitleEndIcon();
        return new C37381c(id4, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, titleEndIcon != null ? AbstractC16315n0.m46377b(titleEndIcon) : null, abstractC18247aM69480t, gaugeFillPercentage, scoreGaugeStickyDialModel.getScoreTarget(), scoreGaugeStickyDialModel.getLowerOptimalPercentage(), scoreGaugeStickyDialModel.getHigherOptimalPercentage(), scoreGaugeStickyDialModel.getDestination());
    }

    /* JADX INFO: renamed from: b */
    public static final C37390l m45296b(ScoreGaugeStickyModel scoreGaugeStickyModel) {
        AbstractC22676k.m65750j(scoreGaugeStickyModel, "<this>");
        String id4 = scoreGaugeStickyModel.getId();
        List<ScoreGaugeStickyDialModel> gauges = scoreGaugeStickyModel.getGauges();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(gauges, 10));
        Iterator<T> it = gauges.iterator();
        while (it.hasNext()) {
            arrayList.add(m45295a((ScoreGaugeStickyDialModel) it.next()));
        }
        DesignSystemModel headerItem = scoreGaugeStickyModel.getHeaderItem();
        return new C37390l(id4, arrayList, headerItem != null ? AbstractC37056f.m118958J(AbstractC15993c.m45178C().m60541h(headerItem)) : C25271y.f99162w);
    }
}
