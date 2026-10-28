package zb1;

import com.whoop.design.models.items.graph.plot.BarPlotModel;
import com.whoop.design.models.items.graph.plot.GraphPlotLabelModel;
import com.whoop.design.models.items.graph.plot.bar.BarGroupModel;
import com.whoop.design.models.items.graph.plot.bar.BarModel;
import com.whoop.design.models.items.graph.plot.bar.BarStyle;
import com.whoop.design.models.items.graph.plot.bar.BarTheme;
import com.whoop.design.models.items.graph.plot.bar.BarWidth;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e71.C12800a;
import e71.C12801b;
import gc1.AbstractC15709a;
import i91.AbstractC18247a;
import j71.AbstractC21394b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import u61.C34555d;
import wb3.AbstractC37056f;
import xb1.AbstractC38162a;

/* JADX INFO: renamed from: zb1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/BarPlotModel;", "plot", "Lj71/b$b;", "a", "(Lcom/whoop/design/models/items/graph/plot/BarPlotModel;)Lj71/b$b;", "", "Lcom/whoop/design/models/items/graph/plot/bar/BarModel;", "bars", "", "d", "(Ljava/util/List;)I", "stackedBarsSize", "", "isVisualTop", "Ly3/f;", "c", "(IZ)F", "indexOfBar", "", "yPercent", "b", "(IIF)F", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40257a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final AbstractC21394b.b m129266a(BarPlotModel plot) {
        TextResource textResourceM21267a;
        BarWidth barWidth;
        AbstractC22676k.m65750j(plot, "plot");
        List<BarGroupModel> barGroups = plot.getBarGroups();
        int i13 = 10;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(barGroups, 10));
        Iterator<T> it = barGroups.iterator();
        while (true) {
            int i14 = 0;
            if (!it.hasNext()) {
                String id4 = plot.getId();
                Boolean hideWhileScrubbing = plot.getHideWhileScrubbing();
                boolean zBooleanValue = hideWhileScrubbing != null ? hideWhileScrubbing.booleanValue() : false;
                Boolean skipScrubbing = plot.getSkipScrubbing();
                return new AbstractC21394b.b(arrayList, id4, skipScrubbing != null ? skipScrubbing.booleanValue() : false, zBooleanValue);
            }
            BarGroupModel barGroupModel = (BarGroupModel) it.next();
            int iM129269d = m129269d(barGroupModel.getBars());
            String accessibilityLabel = barGroupModel.getAccessibilityLabel();
            if (accessibilityLabel == null || (textResourceM21267a = AbstractC8693b.m21278l(accessibilityLabel)) == null) {
                textResourceM21267a = AbstractC8693b.m21267a();
            }
            TextResource textResource = textResourceM21267a;
            List<BarModel> bars = barGroupModel.getBars();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(bars, i13));
            int i15 = 0;
            for (Object obj : bars) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                BarModel barModel = (BarModel) obj;
                boolean z4 = barModel.getStyle() == BarStyle.HIDDEN ? 1 : i14;
                float positionY = (float) barModel.getPositionY();
                BarGroupModel barGroupModel2 = barGroupModel;
                float height = (float) barModel.getHeight();
                AbstractC18247a abstractC18247aM129270a = AbstractC40258b.m129270a(barModel.getStyle(), barModel.getTheme());
                float fM129268c = z4 != 0 ? i14 * 4 : m129268c(barGroupModel2.getBars().size(), i15 == iM129269d);
                i14 = 0;
                float fM129267b = z4 != 0 ? 0 * 4 : m129267b(barGroupModel2.getBars().size(), i15, (float) barModel.getPositionY());
                BarModel barModel2 = (BarModel) AbstractC25265s.m74102I0(i15, barGroupModel2.getBars());
                arrayList2.add(new C12801b(positionY, height, abstractC18247aM129270a, fM129268c, fM129267b, AbstractC15709a.m44228a(barModel2 != null ? barModel2.getDataScrubberDetails() : null), z4, null));
                i15 = i16;
                barGroupModel = barGroupModel2;
            }
            BarGroupModel barGroupModel3 = barGroupModel;
            C34555d c34555dM122236a = null;
            float positionX = (float) barGroupModel3.getPositionX();
            float width = (float) barGroupModel3.getWidth();
            Iterator<T> it3 = barGroupModel3.getBars().iterator();
            do {
                if (!it3.hasNext()) {
                    barWidth = null;
                    break;
                }
                BarTheme theme = ((BarModel) it3.next()).getTheme();
                barWidth = theme != null ? theme.getBarWidth() : null;
            } while (barWidth == null);
            Float fValueOf = barWidth != null ? Float.valueOf(AbstractC40259c.m129302a(barWidth)) : null;
            GraphPlotLabelModel bottomLabel = barGroupModel3.getBottomLabel();
            C34555d c34555dM122236a2 = bottomLabel != null ? AbstractC38162a.m122236a(bottomLabel) : null;
            GraphPlotLabelModel topLabel = barGroupModel3.getTopLabel();
            if (topLabel != null) {
                c34555dM122236a = AbstractC38162a.m122236a(topLabel);
            }
            arrayList.add(new C12800a(textResource, arrayList2, positionX, width, fValueOf, c34555dM122236a2, c34555dM122236a, AbstractC15709a.m44228a(barGroupModel3.getDataScrubberDetails()), false, 256, null));
            i13 = 10;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final float m129267b(int i13, int i14, float f13) {
        return ((i13 <= 1 && f13 != 0.0f) ? (float) 0.5d : 0) * 4;
    }

    /* JADX INFO: renamed from: c */
    public static final float m129268c(int i13, boolean z4) {
        return ((i13 == 1 || z4) ? (float) 0.5d : 0) * 4;
    }

    /* JADX INFO: renamed from: d */
    private static final int m129269d(List<BarModel> list) {
        double height;
        double height2;
        Object obj;
        Iterator it = AbstractC37056f.m118950B(list).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                BarModel barModel = list.get(((Number) next).intValue());
                if (barModel.getHeight() <= 0.0d) {
                    height = Double.NEGATIVE_INFINITY;
                } else {
                    height = barModel.getHeight() + barModel.getPositionY();
                }
                do {
                    Object next2 = it.next();
                    BarModel barModel2 = list.get(((Number) next2).intValue());
                    if (barModel2.getHeight() <= 0.0d) {
                        height2 = Double.NEGATIVE_INFINITY;
                    } else {
                        height2 = barModel2.getHeight() + barModel2.getPositionY();
                    }
                    if (Double.compare(height, height2) < 0) {
                        next = next2;
                        height = height2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
