package p716lb1;

import com.whoop.design.models.items.CyclePhaseStyle;
import com.whoop.design.models.items.DailyTickMarkHeaderModel;
import com.whoop.design.models.items.DailyTickMarkPlotModel;
import com.whoop.design.models.items.DailyTickMarkWidthStyle;
import com.whoop.design.models.items.ExpectedAnnotationModel;
import com.whoop.design.models.items.TickLabelModel;
import com.whoop.design.models.items.TickMarkFooterModel;
import com.whoop.design.models.items.TickMarkStateModel;
import com.whoop.design.models.items.TickMarkStyle;
import com.whoop.design.models.items.TickMarksStyle;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import f11.C14001a;
import f11.C14002b;
import f11.C14005e;
import f11.C14006f;
import f11.C14007g;
import f11.C14008h;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lb1.t0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/items/DailyTickMarkPlotModel;", "model", "Lf11/e;", "a", "(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;)Lf11/e;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23713t0 {

    /* JADX INFO: renamed from: lb1.t0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93970a;

        static {
            int[] iArr = new int[DailyTickMarkWidthStyle.values().length];
            try {
                iArr[DailyTickMarkWidthStyle.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DailyTickMarkWidthStyle.HEALTH_TAB_V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DailyTickMarkWidthStyle.HEALTH_TAB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f93970a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C14005e m69422a(DailyTickMarkPlotModel model) {
        C14002b c14002b;
        ArrayList arrayList;
        C14001a c14001a;
        CyclePhaseStyle cyclePhaseStyle;
        EnumC39333f enumC39333fM69376a;
        CyclePhaseStyle cyclePhaseStyle2;
        AbstractC22676k.m65750j(model, "model");
        boolean z4 = false;
        boolean z13 = model.getTickMarkWidthStyle() == DailyTickMarkWidthStyle.HEALTH_TAB_V2;
        boolean z14 = model.getTickMarkWidthStyle() == DailyTickMarkWidthStyle.HEALTH_TAB || z13;
        DailyTickMarkHeaderModel header = model.getHeader();
        if (header != null) {
            String titleDisplay = header.getTitleDisplay();
            TextResource textResourceM21278l = titleDisplay != null ? AbstractC8693b.m21278l(titleDisplay) : null;
            String subtitleDisplay = header.getSubtitleDisplay();
            TextResource textResourceM21278l2 = subtitleDisplay != null ? AbstractC8693b.m21278l(subtitleDisplay) : null;
            String currentStatusDisplay = header.getCurrentStatusDisplay();
            TextResource textResourceM21278l3 = currentStatusDisplay != null ? AbstractC8693b.m21278l(currentStatusDisplay) : null;
            String descriptionDisplay = header.getDescriptionDisplay();
            TextResource textResourceM21278l4 = descriptionDisplay != null ? AbstractC8693b.m21278l(descriptionDisplay) : null;
            String currentStatusStyle = header.getCurrentStatusStyle();
            if (currentStatusStyle != null) {
                CyclePhaseStyle[] cyclePhaseStyleArrValues = CyclePhaseStyle.values();
                int length = cyclePhaseStyleArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        cyclePhaseStyle2 = null;
                        break;
                    }
                    cyclePhaseStyle2 = cyclePhaseStyleArrValues[i13];
                    if (AbstractC22676k.m65745e(cyclePhaseStyle2.name(), currentStatusStyle)) {
                        break;
                    }
                    i13++;
                }
                enumC39333fM69376a = cyclePhaseStyle2 != null ? AbstractC23707s0.m69376a(cyclePhaseStyle2) : null;
            } else {
                enumC39333fM69376a = null;
            }
            String rightAlignedDescription = header.getRightAlignedDescription();
            TextResource textResourceM21278l5 = rightAlignedDescription != null ? AbstractC8693b.m21278l(rightAlignedDescription) : null;
            String supertitleDisplay = header.getSupertitleDisplay();
            c14002b = new C14002b(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, enumC39333fM69376a, textResourceM21278l5, supertitleDisplay != null ? AbstractC8693b.m21278l(supertitleDisplay) : null);
        } else {
            c14002b = null;
        }
        boolean fillFullSpace = model.getFillFullSpace();
        boolean z15 = model.getStyle() == TickMarksStyle.FADE_IN;
        List<TickMarkStateModel> tickMarks = model.getTickMarks();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(tickMarks, 10));
        for (TickMarkStateModel tickMarkStateModel : tickMarks) {
            EnumC39333f enumC39333fM69594b = AbstractC23729v4.m69594b(tickMarkStateModel.getStyle(), z4, 2, null);
            Boolean boolIsToday = tickMarkStateModel.isToday();
            arrayList2.add(new C14008h(enumC39333fM69594b, boolIsToday != null ? boolIsToday.booleanValue() : z4, tickMarkStateModel.getStyle() == TickMarkStyle.PREDICTED ? EnumC39333f.WHITE_50 : null));
            z4 = false;
        }
        int i14 = a.f93970a[model.getTickMarkWidthStyle().ordinal()];
        float f13 = 8.0f;
        float f14 = i14 != 1 ? i14 != 2 ? 4.0f : 8.0f : 2.5f;
        List<TickLabelModel> tickMarksLabels = model.getTickMarksLabels();
        if (tickMarksLabels != null) {
            List<TickLabelModel> list = tickMarksLabels;
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (TickLabelModel tickLabelModel : list) {
                int index = tickLabelModel.getIndex();
                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(tickLabelModel.getLabel());
                String subLabel = tickLabelModel.getSubLabel();
                TextResource textResourceM21278l7 = subLabel != null ? AbstractC8693b.m21278l(subLabel) : null;
                EnumC39333f enumC39333fM69593a = AbstractC23729v4.m69593a(tickLabelModel.getLabelStyle(), true);
                TickMarkStyle subLabelStyle = tickLabelModel.getSubLabelStyle();
                arrayList3.add(new C14007g(index, textResourceM21278l6, textResourceM21278l7, enumC39333fM69593a, subLabelStyle != null ? AbstractC23729v4.m69593a(subLabelStyle, true) : null, tickLabelModel.isBelow(), z14 ? Float.valueOf(0.6f) : null));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        int i15 = a.f93970a[model.getTickMarkWidthStyle().ordinal()];
        if (i15 == 2) {
            f13 = 24.0f;
        } else if (i15 == 3) {
            f13 = 12.0f;
        }
        float f15 = f13;
        ExpectedAnnotationModel expectedAnnotation = model.getExpectedAnnotation();
        C14006f c14006f = expectedAnnotation != null ? new C14006f(expectedAnnotation.getIndex(), expectedAnnotation.getLabel()) : null;
        TickMarkFooterModel footer = model.getFooter();
        if (footer != null) {
            TextResource textResourceM21278l8 = AbstractC8693b.m21278l(footer.getTitle());
            String titleStyle = footer.getTitleStyle();
            CyclePhaseStyle[] cyclePhaseStyleArrValues2 = CyclePhaseStyle.values();
            int length2 = cyclePhaseStyleArrValues2.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length2) {
                    cyclePhaseStyle = null;
                    break;
                }
                CyclePhaseStyle cyclePhaseStyle3 = cyclePhaseStyleArrValues2[i16];
                if (AbstractC22676k.m65745e(cyclePhaseStyle3.name(), titleStyle)) {
                    cyclePhaseStyle = cyclePhaseStyle3;
                    break;
                }
                i16++;
            }
            if (cyclePhaseStyle == null) {
                cyclePhaseStyle = CyclePhaseStyle.NO_PHASE;
            }
            c14001a = new C14001a(textResourceM21278l8, AbstractC23707s0.m69376a(cyclePhaseStyle));
        } else {
            c14001a = null;
        }
        return new C14005e(c14002b, false, fillFullSpace, arrayList2, arrayList, z15, z13, f14, f15, z13, c14006f, c14001a, 2, null);
    }
}
