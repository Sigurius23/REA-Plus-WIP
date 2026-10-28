package zs2;

import androidx.core.app.NotificationCompat;
import bu2.C3643d;
import bu2.C3650k;
import com.whoop.data.remote.domain.dto.BoundType;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weeklyplan.customizeplan.domain.api.Range;
import com.whoop.weeklyplan.customizeplan.domain.api.SliderContent;
import com.whoop.weeklyplan.customizeplan.domain.api.SmartAlarmOverride;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModel;
import java.util.List;
import java.util.UUID;
import jt2.C21955q;
import m83.C25271y;
import ot2.AbstractC28353v;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import ws2.C37615g;
import ys2.AbstractC39758e;
import ys2.C39755b;
import ys2.C39756c;
import ys2.C39759f;

/* JADX INFO: renamed from: zs2.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lzs2/k;", "", "Lzs2/g;", "rangeContentReducer", "Ljt2/q;", "metricSliderMatcher", "Lzs2/h;", "recommendedRangeMapper", "<init>", "(Lzs2/g;Ljt2/q;Lzs2/h;)V", "Ljava/util/UUID;", "planId", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;", "model", "Lws2/g;", NotificationCompat.CATEGORY_PROGRESS, "", "showLoading", "Lys2/e;", "a", "(Ljava/util/UUID;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Lws2/g;Z)Lys2/e;", "Lzs2/g;", "b", "Ljt2/q;", "c", "Lzs2/h;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41087k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C41083g rangeContentReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21955q metricSliderMatcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C41084h recommendedRangeMapper;

    /* JADX INFO: renamed from: zs2.k$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f177129w = new a();

        /* JADX INFO: renamed from: a */
        public final long m133405a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m133405a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zs2.k$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f177130w = new b();

        /* JADX INFO: renamed from: a */
        public final long m133406a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m133406a((C39336i) obj));
        }
    }

    public C41087k(C41083g rangeContentReducer, C21955q metricSliderMatcher, C41084h recommendedRangeMapper) {
        AbstractC22676k.m65750j(rangeContentReducer, "rangeContentReducer");
        AbstractC22676k.m65750j(metricSliderMatcher, "metricSliderMatcher");
        AbstractC22676k.m65750j(recommendedRangeMapper, "recommendedRangeMapper");
        this.rangeContentReducer = rangeContentReducer;
        this.metricSliderMatcher = metricSliderMatcher;
        this.recommendedRangeMapper = recommendedRangeMapper;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC39758e m133404a(UUID planId, WeeklyPlanCustomizationScreenModel model, C37615g progress, boolean showLoading) {
        Range usableRange;
        Range usableRange2;
        Range usableRange3;
        Range usableRange4;
        AbstractC22676k.m65750j(planId, "planId");
        AbstractC22676k.m65750j(model, "model");
        AbstractC22676k.m65750j(progress, "progress");
        TargetGoalType targetGoalType = TargetGoalType.SLEEP_PERFORMANCE;
        String string = planId.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        C39759f c39759f = new C39759f(AbstractC8693b.m21278l(model.getNavigationTitleDisplay()), AbstractC8693b.m21278l(model.getNavigationSubtitleDisplay()), AbstractC8693b.m21278l(model.getTitle()), AbstractC8693b.m21278l(model.getDescription()));
        SliderContent slider = model.getSlider();
        float value = slider != null ? (float) slider.getValue() : 0.0f;
        SliderContent slider2 = model.getSlider();
        double min = (slider2 == null || (usableRange4 = slider2.getUsableRange()) == null) ? 0.0d : usableRange4.getMin();
        SliderContent slider3 = model.getSlider();
        double max = 1.0d;
        float max2 = (float) (min / ((slider3 == null || (usableRange3 = slider3.getUsableRange()) == null) ? 1.0d : usableRange3.getMax()));
        SliderContent slider4 = model.getSlider();
        double max3 = (slider4 == null || (usableRange2 = slider4.getUsableRange()) == null) ? 1.0d : usableRange2.getMax();
        SliderContent slider5 = model.getSlider();
        if (slider5 != null && (usableRange = slider5.getUsableRange()) != null) {
            max = usableRange.getMax();
        }
        float f13 = (float) (max3 / max);
        double dM62672b = C21955q.m62672b(this.metricSliderMatcher, model, null, 2, null);
        TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC28353v.m86025b(String.valueOf(C21955q.m62672b(this.metricSliderMatcher, model, null, 2, null)), targetGoalType));
        SliderContent slider6 = model.getSlider();
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(slider6 != null ? slider6.getValueLabel() : null);
        InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a(a.f177129w);
        C41084h c41084h = this.recommendedRangeMapper;
        SliderContent slider7 = model.getSlider();
        C3650k c3650kM133400a = c41084h.m133400a(slider7 != null ? slider7.getRecommendedRange() : null, p745y81.Function1.m125323a(b.f177130w), EnumC41085i.PERCENT_RANGE_ONLY);
        C41083g c41083g = this.rangeContentReducer;
        SliderContent slider8 = model.getSlider();
        List listM133397d = C41083g.m133397d(c41083g, slider8 != null ? slider8.getRangeContent() : null, null, BoundType.CLOSED, null, 10, null);
        if (listM133397d == null) {
            listM133397d = C25271y.f99162w;
        }
        C3643d c3643d = new C3643d(value, max2, f13, dM62672b, textResourceM21278l, null, textResourceM21278l2, null, null, c3650kM133400a, null, listM133397d, null, null, null, interfaceC39332eM125323a, 30112, null);
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getContinueButtonDisplay());
        String skipButtonDisplay = model.getSkipButtonDisplay();
        C39755b c39755b = new C39755b(textResourceM21278l3, false, skipButtonDisplay != null ? AbstractC8693b.m21278l(skipButtonDisplay) : null, showLoading, 2, null);
        double dM62672b2 = C21955q.m62672b(this.metricSliderMatcher, model, null, 2, null);
        SmartAlarmOverride smartAlarmOverride = model.getSmartAlarmOverride();
        return new AbstractC39758e.l(string, targetGoalType, c39759f, c3643d, c39755b, dM62672b2, progress, model.getSmartAlarmOverride() != null, smartAlarmOverride != null ? new C39756c(AbstractC8693b.m21278l(smartAlarmOverride.getTitle()), AbstractC8693b.m21278l(smartAlarmOverride.getDescription()), AbstractC8693b.m21278l(smartAlarmOverride.getButtonConfirmTitle()), AbstractC8693b.m21278l(smartAlarmOverride.getButtonRejectTitle())) : null);
    }
}
