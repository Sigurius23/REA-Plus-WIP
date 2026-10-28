package yb1;

import com.whoop.design.models.items.graph.plot.band.BandDataPointModel;
import com.whoop.design.models.items.graph.plot.band.BandPlotStyle;
import com.whoop.design.models.items.graph.plot.band.BandSegmentModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gc1.AbstractC15709a;
import java.util.ArrayList;
import java.util.List;
import k61.C22228a;
import l61.C23378c;
import l61.C23379d;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yb1.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"", "Lcom/whoop/design/models/items/graph/plot/band/BandSegmentModel;", "segments", "Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;", "backupPlotStyle", "Ll61/d;", "a", "(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;)Ljava/util/List;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39392d {
    /* JADX INFO: renamed from: a */
    public static final List<C23379d> m125809a(List<BandSegmentModel> segments, BandPlotStyle backupPlotStyle) {
        AbstractC22676k.m65750j(segments, "segments");
        AbstractC22676k.m65750j(backupPlotStyle, "backupPlotStyle");
        List<BandSegmentModel> list = segments;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (BandSegmentModel bandSegmentModel : list) {
            List<BandDataPointModel> points = bandSegmentModel.getPoints();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(points, 10));
            for (BandDataPointModel bandDataPointModel : points) {
                TextResource textResourceM21278l = AbstractC8693b.m21278l(bandDataPointModel.getAccessibilityLabel());
                float positionBottomY = (float) bandDataPointModel.getPositionBottomY();
                arrayList2.add(new C23378c(textResourceM21278l, (float) bandDataPointModel.getPositionX(), (float) bandDataPointModel.getPositionTopY(), positionBottomY, AbstractC15709a.m44228a(bandDataPointModel.getDataScrubberDetails())));
            }
            BandPlotStyle style = bandSegmentModel.getStyle();
            if (style == null) {
                style = backupPlotStyle;
            }
            C22228a c22228aM125777k = AbstractC39390b.m125777k(style);
            BandPlotStyle style2 = bandSegmentModel.getStyle();
            if (style2 == null) {
                style2 = backupPlotStyle;
            }
            arrayList.add(new C23379d(arrayList2, c22228aM125777k, AbstractC39393e.m125810a(style2)));
        }
        return arrayList;
    }
}
