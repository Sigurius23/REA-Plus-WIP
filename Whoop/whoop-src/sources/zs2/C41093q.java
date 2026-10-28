package zs2;

import androidx.core.app.NotificationCompat;
import b91.AbstractC2890e;
import bu2.C3637a;
import bu2.C3643d;
import bu2.C3647h;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weeklyplan.customizeplan.domain.api.AverageLine;
import com.whoop.weeklyplan.customizeplan.domain.api.RangeWithTip;
import com.whoop.weeklyplan.customizeplan.domain.api.SliderContent;
import com.whoop.weeklyplan.customizeplan.domain.api.SmartAlarmOverride;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModel;
import java.util.List;
import java.util.UUID;
import jt2.C21955q;
import l83.C23465k;
import m83.C25271y;
import ot2.AbstractC28353v;
import p026b2.C2299e;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import ws2.C37615g;
import yb3.AbstractC39414r;
import ys2.AbstractC39758e;
import ys2.C39755b;
import ys2.C39756c;
import ys2.C39759f;

/* JADX INFO: renamed from: zs2.q */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lzs2/q;", "", "Lzs2/g;", "rangeContentReducer", "Ljt2/q;", "metricSliderMatcher", "<init>", "(Lzs2/g;Ljt2/q;)V", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;", "model", "Ll83/k;", "", "a", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Ll83/k;", "", "fillPercentage", "Ly81/e;", "b", "(Ljava/lang/Float;)Ly81/e;", "Ljava/util/UUID;", "planId", "Lws2/g;", NotificationCompat.CATEGORY_PROGRESS, "", "showLoading", "Lys2/e;", "c", "(Ljava/util/UUID;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Lws2/g;Z)Lys2/e;", "Lzs2/g;", "Ljt2/q;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41093q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C41083g rangeContentReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21955q metricSliderMatcher;

    /* JADX INFO: renamed from: zs2.q$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f177155w = new a();

        /* JADX INFO: renamed from: a */
        public final long m133428a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m133428a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zs2.q$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f177156w = new b();

        /* JADX INFO: renamed from: a */
        public final long m133429a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m133429a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zs2.q$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f177157w = new c();

        /* JADX INFO: renamed from: a */
        public final long m133430a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m133430a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zs2.q$d */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f177158w = new d();

        /* JADX INFO: renamed from: a */
        public final long m133431a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m133431a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zs2.q$e */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f177159w = new e();

        /* JADX INFO: renamed from: a */
        public final long m133432a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite90();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m133432a((C39336i) obj));
        }
    }

    public C41093q(C41083g rangeContentReducer, C21955q metricSliderMatcher) {
        AbstractC22676k.m65750j(rangeContentReducer, "rangeContentReducer");
        AbstractC22676k.m65750j(metricSliderMatcher, "metricSliderMatcher");
        this.rangeContentReducer = rangeContentReducer;
        this.metricSliderMatcher = metricSliderMatcher;
    }

    /* JADX INFO: renamed from: a */
    private final C23465k m133425a(WeeklyPlanCustomizationScreenModel model) {
        AverageLine averageLine;
        String title;
        AverageLine averageLine2;
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

    /* JADX INFO: renamed from: b */
    private final InterfaceC39332e m133426b(Float fillPercentage) {
        return (AbstractC22676k.m65743c(fillPercentage, 1.0f) || AbstractC22676k.m65743c(fillPercentage, 0.0f)) ? p745y81.Function1.m125323a(a.f177155w) : p745y81.Function1.m125323a(b.f177156w);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC39758e m133427c(UUID planId, WeeklyPlanCustomizationScreenModel model, C37615g progress, boolean showLoading) {
        C3647h c3647h;
        String bottomText;
        String topText;
        AverageLine averageLine;
        String valueUnits;
        AbstractC22676k.m65750j(planId, "planId");
        AbstractC22676k.m65750j(model, "model");
        AbstractC22676k.m65750j(progress, "progress");
        C23465k c23465kM133425a = m133425a(model);
        String str = (String) c23465kM133425a.f92937w;
        String str2 = (String) c23465kM133425a.f92938x;
        C41083g c41083g = this.rangeContentReducer;
        SliderContent slider = model.getSlider();
        List<RangeWithTip> rangeContent = slider != null ? slider.getRangeContent() : null;
        SliderContent slider2 = model.getSlider();
        List listM133397d = C41083g.m133397d(c41083g, rangeContent, slider2 != null ? Double.valueOf(slider2.getIncrement()) : null, null, null, 12, null);
        if (listM133397d == null) {
            listM133397d = C25271y.f99162w;
        }
        List list = listM133397d;
        String string = planId.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        TargetGoalType targetGoalType = TargetGoalType.WEIGHT;
        C39759f c39759f = new C39759f(AbstractC8693b.m21278l(model.getNavigationTitleDisplay()), AbstractC8693b.m21278l(model.getNavigationSubtitleDisplay()), AbstractC8693b.m21278l(model.getTitle()), AbstractC8693b.m21278l(model.getDescription()));
        SliderContent slider3 = model.getSlider();
        float value = slider3 != null ? (float) slider3.getValue() : 0.0f;
        double dM62672b = C21955q.m62672b(this.metricSliderMatcher, model, null, 2, null);
        TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC28353v.m86025b(String.valueOf(C21955q.m62672b(this.metricSliderMatcher, model, null, 2, null)), targetGoalType));
        SliderContent slider4 = model.getSlider();
        TextResource textResourceM21278l2 = (slider4 == null || (valueUnits = slider4.getValueUnits()) == null) ? null : AbstractC8693b.m21278l(valueUnits);
        SliderContent slider5 = model.getSlider();
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(slider5 != null ? slider5.getValueLabel() : null);
        InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a(c.f177157w);
        SliderContent slider6 = model.getSlider();
        InterfaceC39332e interfaceC39332eM133426b = m133426b(slider6 != null ? Float.valueOf((float) slider6.getValue()) : null);
        SliderContent slider7 = model.getSlider();
        if (slider7 == null || (averageLine = slider7.getAverageLine()) == null) {
            c3647h = null;
        } else {
            C3637a c3637a = new C3637a(AbstractC8693b.m21278l(str), AbstractC8693b.m21278l(str2), p745y81.Function1.m125323a(d.f177158w), AbstractC2890e.m8450e().getN6(), AbstractC2890e.m8450e().getN7(), AbstractC8693b.m21278l(averageLine.getSubtitle()), p745y81.Function1.m125323a(e.f177159w), null, C2299e.f9110M, null, 640, null);
            Float positionOnSlider = averageLine.getPositionOnSlider();
            c3647h = new C3647h(c3637a, positionOnSlider != null ? positionOnSlider.floatValue() : 0.5f, C17919x.f69629f, null);
        }
        SliderContent slider8 = model.getSlider();
        TextResource textResourceM21278l4 = (slider8 == null || (topText = slider8.getTopText()) == null) ? null : AbstractC8693b.m21278l(topText);
        SliderContent slider9 = model.getSlider();
        TextResource textResourceM21278l5 = (slider9 == null || (bottomText = slider9.getBottomText()) == null) ? null : AbstractC8693b.m21278l(bottomText);
        SliderContent slider10 = model.getSlider();
        C3643d c3643d = new C3643d(value, 0.0f, 1.0f, dM62672b, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, textResourceM21278l5, null, c3647h, list, null, interfaceC39332eM133426b, slider10 != null ? Double.valueOf(slider10.getIncrement()) : null, interfaceC39332eM125323a, 4608, null);
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l(model.getContinueButtonDisplay());
        String skipButtonDisplay = model.getSkipButtonDisplay();
        C39755b c39755b = new C39755b(textResourceM21278l6, false, skipButtonDisplay != null ? AbstractC8693b.m21278l(skipButtonDisplay) : null, showLoading, 2, null);
        double dM62672b2 = C21955q.m62672b(this.metricSliderMatcher, model, null, 2, null);
        SmartAlarmOverride smartAlarmOverride = model.getSmartAlarmOverride();
        return new AbstractC39758e.q(string, targetGoalType, c39759f, c3643d, c39755b, dM62672b2, progress, smartAlarmOverride != null ? new C39756c(AbstractC8693b.m21278l(smartAlarmOverride.getTitle()), AbstractC8693b.m21278l(smartAlarmOverride.getDescription()), AbstractC8693b.m21278l(smartAlarmOverride.getButtonConfirmTitle()), AbstractC8693b.m21278l(smartAlarmOverride.getButtonRejectTitle())) : null);
    }
}
