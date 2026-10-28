package zs2;

import b91.AbstractC2890e;
import bu2.C3637a;
import bu2.C3643d;
import bu2.C3647h;
import bu2.C3650k;
import com.whoop.data.remote.domain.dto.BoundType;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weeklyplan.customizeplan.domain.api.AverageLine;
import com.whoop.weeklyplan.customizeplan.domain.api.Range;
import com.whoop.weeklyplan.customizeplan.domain.api.SliderContent;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModel;
import e93.AbstractC12889b;
import java.util.List;
import l83.C23465k;
import m83.C25271y;
import p026b2.C2299e;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import yb3.AbstractC39414r;
import ys2.C39755b;
import ys2.C39759f;

/* JADX INFO: renamed from: zs2.p */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00172\u0006\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\"\u001a\u00020!2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0004¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010%¨\u0006&"}, m65681d2 = {"Lzs2/p;", "", "Lzs2/g;", "rangeContentReducer", "Lzs2/h;", "recommendedRangeMapper", "<init>", "(Lzs2/g;Lzs2/h;)V", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;", "model", "Lys2/f;", "d", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Lys2/f;", "", "showLoading", "Lys2/b;", "c", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Z)Lys2/b;", "", "fill", "", "b", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;F)D", "Ll83/k;", "", "e", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Ll83/k;", "saveValue", "Lcom/whoop/design/util/TextResource;", "weeklyTargetValue", "weeklyTargetValueSuffix", "Ly81/f;", "color", "Lbu2/d;", "a", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;DLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)Lbu2/d;", "Lzs2/g;", "Lzs2/h;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41092p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C41083g rangeContentReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C41084h recommendedRangeMapper;

    /* JADX INFO: renamed from: zs2.p$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f177151w = new a();

        /* JADX INFO: renamed from: a */
        public final long m133423a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m133423a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zs2.p$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f177152w = new b();

        /* JADX INFO: renamed from: a */
        public final long m133424a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite90();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m133424a((C39336i) obj));
        }
    }

    public AbstractC41092p(C41083g rangeContentReducer, C41084h recommendedRangeMapper) {
        AbstractC22676k.m65750j(rangeContentReducer, "rangeContentReducer");
        AbstractC22676k.m65750j(recommendedRangeMapper, "recommendedRangeMapper");
        this.rangeContentReducer = rangeContentReducer;
        this.recommendedRangeMapper = recommendedRangeMapper;
    }

    /* JADX INFO: renamed from: a */
    public final C3643d m133418a(WeeklyPlanCustomizationScreenModel model, double saveValue, TextResource weeklyTargetValue, TextResource weeklyTargetValueSuffix, EnumC39333f color) {
        C3647h c3647h;
        AverageLine averageLine;
        String bottomText;
        AbstractC22676k.m65750j(model, "model");
        AbstractC22676k.m65750j(weeklyTargetValue, "weeklyTargetValue");
        AbstractC22676k.m65750j(color, "color");
        C23465k c23465kM133422e = m133422e(model);
        String str = (String) c23465kM133422e.f92937w;
        String str2 = (String) c23465kM133422e.f92938x;
        SliderContent slider = model.getSlider();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(slider != null ? slider.getTopText() : null);
        SliderContent slider2 = model.getSlider();
        float value = slider2 != null ? (float) slider2.getValue() : 0.0f;
        SliderContent slider3 = model.getSlider();
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(slider3 != null ? slider3.getValueLabel() : null);
        SliderContent slider4 = model.getSlider();
        TextResource textResourceM21278l3 = (slider4 == null || (bottomText = slider4.getBottomText()) == null) ? null : AbstractC8693b.m21278l(bottomText);
        C41084h c41084h = this.recommendedRangeMapper;
        SliderContent slider5 = model.getSlider();
        C3650k c3650kM133400a = c41084h.m133400a(slider5 != null ? slider5.getRecommendedRange() : null, color, EnumC41085i.PERCENT_RANGE_ONLY);
        C41083g c41083g = this.rangeContentReducer;
        SliderContent slider6 = model.getSlider();
        List listM133397d = C41083g.m133397d(c41083g, slider6 != null ? slider6.getRangeContent() : null, null, BoundType.CLOSED, null, 8, null);
        if (listM133397d == null) {
            listM133397d = C25271y.f99162w;
        }
        List list = listM133397d;
        SliderContent slider7 = model.getSlider();
        if (slider7 == null || (averageLine = slider7.getAverageLine()) == null) {
            c3647h = null;
        } else {
            C3637a c3637a = new C3637a(AbstractC8693b.m21278l(str), AbstractC8693b.m21278l(str2), p745y81.Function1.m125323a(a.f177151w), AbstractC2890e.m8450e().getN6(), AbstractC2890e.m8450e().getN7(), AbstractC8693b.m21278l(averageLine.getSubtitle()), p745y81.Function1.m125323a(b.f177152w), null, C2299e.f9110M, null, 640, null);
            Float positionOnSlider = averageLine.getPositionOnSlider();
            c3647h = new C3647h(c3637a, positionOnSlider != null ? positionOnSlider.floatValue() : 0.5f, C17919x.f69629f, null);
        }
        return new C3643d(value, 0.0f, 1.0f, saveValue, weeklyTargetValue, weeklyTargetValueSuffix, textResourceM21278l2, textResourceM21278l, textResourceM21278l3, c3650kM133400a, c3647h, list, null, color, null, color, 20480, null);
    }

    /* JADX INFO: renamed from: b */
    public final double m133419b(WeeklyPlanCustomizationScreenModel model, float fill) {
        SliderContent slider;
        SliderContent slider2;
        Range range;
        SliderContent slider3;
        Range range2;
        double increment = 1.0d;
        double max = (model == null || (slider3 = model.getSlider()) == null || (range2 = slider3.getRange()) == null) ? 1.0d : range2.getMax();
        double min = (model == null || (slider2 = model.getSlider()) == null || (range = slider2.getRange()) == null) ? 0.0d : range.getMin();
        if (model != null && (slider = model.getSlider()) != null) {
            increment = slider.getIncrement();
        }
        return ((double) AbstractC12889b.m36257W((((max - min) * ((double) fill)) + min) / increment)) * increment;
    }

    /* JADX INFO: renamed from: c */
    public final C39755b m133420c(WeeklyPlanCustomizationScreenModel model, boolean showLoading) {
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getContinueButtonDisplay());
        String skipButtonDisplay = model.getSkipButtonDisplay();
        return new C39755b(textResourceM21278l, false, skipButtonDisplay != null ? AbstractC8693b.m21278l(skipButtonDisplay) : null, showLoading, 2, null);
    }

    /* JADX INFO: renamed from: d */
    public final C39759f m133421d(WeeklyPlanCustomizationScreenModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C39759f(AbstractC8693b.m21278l(model.getNavigationTitleDisplay()), AbstractC8693b.m21278l(model.getNavigationSubtitleDisplay()), AbstractC8693b.m21278l(model.getTitle()), AbstractC8693b.m21278l(model.getDescription()));
    }

    /* JADX INFO: renamed from: e */
    public final C23465k m133422e(WeeklyPlanCustomizationScreenModel model) {
        AverageLine averageLine;
        String title;
        AverageLine averageLine2;
        AbstractC22676k.m65750j(model, "model");
        SliderContent slider = model.getSlider();
        String str = null;
        String title2 = (slider == null || (averageLine2 = slider.getAverageLine()) == null) ? null : averageLine2.getTitle();
        SliderContent slider2 = model.getSlider();
        List listM125906y0 = (slider2 == null || (averageLine = slider2.getAverageLine()) == null || (title = averageLine.getTitle()) == null) ? null : AbstractC39414r.m125906y0(title, new String[]{" "}, 6);
        if (listM125906y0 != null && listM125906y0.size() == 2) {
            title2 = (String) listM125906y0.get(0);
            str = (String) listM125906y0.get(1);
        }
        return new C23465k(title2, str);
    }
}
