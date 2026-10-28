package wb1;

import com.whoop.design.models.items.graph.plane.axis.GraphAxisModel;
import com.whoop.design.models.items.graph.plane.axis.GraphAxisTheme;
import com.whoop.design.models.items.graph.plane.axis.label.AxisLabelModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import g61.C15529b;
import g61.EnumC15530c;
import g61.EnumC15531d;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wb1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a#\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;", "axis", "Lwb1/c;", "axisPosition", "Lg61/b;", "a", "(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lwb1/c;)Lg61/b;", "", "axisSize", "c", "(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lwb1/c;Ljava/lang/Float;)Lg61/b;", "b", "(Lwb1/c;)F", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37045f {

    /* JADX INFO: renamed from: wb1.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f158528a;

        static {
            int[] iArr = new int[EnumC37042c.values().length];
            try {
                iArr[EnumC37042c.START_Y.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC37042c.END_Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC37042c.BOTTOM_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC37042c.TOP_X.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f158528a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C15529b m118924a(GraphAxisModel graphAxisModel, EnumC37042c axisPosition) {
        TextResource textResourceM21267a;
        AbstractC22676k.m65750j(axisPosition, "axisPosition");
        if (graphAxisModel == null) {
            return null;
        }
        float fM118925b = m118925b(axisPosition);
        List<AxisLabelModel> labels = graphAxisModel.getLabels();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(labels, 10));
        for (AxisLabelModel axisLabelModel : labels) {
            EnumC15531d type = graphAxisModel.getType();
            GraphAxisTheme theme = graphAxisModel.getTheme();
            arrayList.add(AbstractC37044e.m118921b(axisLabelModel, axisPosition, type, theme != null ? theme.getLabelColor() : null));
        }
        float offset = (graphAxisModel.getType() == EnumC15531d.TIME_MARKER || graphAxisModel.getType() == EnumC15531d.TIME_MARKER_WITHOUT_BULB) ? (float) graphAxisModel.getOffset() : 0.0f;
        EnumC15531d type2 = graphAxisModel.getType();
        String axisDescription = graphAxisModel.getAxisDescription();
        if (axisDescription == null || (textResourceM21267a = AbstractC8693b.m21278l(axisDescription)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        TextResource textResource = textResourceM21267a;
        boolean scrimPresent = graphAxisModel.getScrimPresent();
        EnumC15530c style = graphAxisModel.getStyle();
        GraphAxisTheme theme2 = graphAxisModel.getTheme();
        return new C15529b(fM118925b, arrayList, offset, type2, textResource, scrimPresent, style, theme2 != null ? theme2.getAxisColor() : null);
    }

    /* JADX INFO: renamed from: b */
    private static final float m118925b(EnumC37042c enumC37042c) {
        int i13 = a.f158528a[enumC37042c.ordinal()];
        if (i13 == 1 || i13 == 2) {
            return 0.1f;
        }
        if (i13 == 3) {
            return 0.15f;
        }
        if (i13 == 4) {
            return 0.05f;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public static final C15529b m118926c(GraphAxisModel graphAxisModel, EnumC37042c axisPosition, Float f13) {
        TextResource textResourceM21267a;
        AbstractC22676k.m65750j(axisPosition, "axisPosition");
        if (graphAxisModel == null) {
            return null;
        }
        float fFloatValue = f13 != null ? f13.floatValue() : m118925b(axisPosition);
        List<AxisLabelModel> labels = graphAxisModel.getLabels();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(labels, 10));
        for (AxisLabelModel axisLabelModel : labels) {
            EnumC15531d type = graphAxisModel.getType();
            GraphAxisTheme theme = graphAxisModel.getTheme();
            arrayList.add(AbstractC37044e.m118921b(axisLabelModel, axisPosition, type, theme != null ? theme.getLabelColor() : null));
        }
        EnumC15531d type2 = graphAxisModel.getType();
        String axisDescription = graphAxisModel.getAxisDescription();
        if (axisDescription == null || (textResourceM21267a = AbstractC8693b.m21278l(axisDescription)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        TextResource textResource = textResourceM21267a;
        boolean scrimPresent = graphAxisModel.getScrimPresent();
        EnumC15530c style = graphAxisModel.getStyle();
        GraphAxisTheme theme2 = graphAxisModel.getTheme();
        return new C15529b(fFloatValue, arrayList, 0.0f, type2, textResource, scrimPresent, style, theme2 != null ? theme2.getAxisColor() : null);
    }
}
