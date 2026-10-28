package ot2;

import b91.AbstractC2890e;
import bu2.C3637a;
import bu2.C3643d;
import bu2.C3647h;
import bu2.EnumC3642c0;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weeklyplan.customizeplan.domain.api.AverageLine;
import com.whoop.weeklyplan.customizeplan.domain.api.RangeWithTip;
import com.whoop.weeklyplan.customizeplan.domain.api.SliderContent;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModel;
import java.util.Iterator;
import java.util.List;
import jt2.AbstractC21951m;
import jt2.C21942d;
import jt2.C21955q;
import jt2.C21956r;
import l83.C23465k;
import m83.C25271y;
import p026b2.C2299e;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import ws2.C37615g;
import yb3.AbstractC39414r;
import ys2.C39759f;
import zs2.C41083g;

/* JADX INFO: renamed from: ot2.o */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lot2/o;", "", "Lzs2/g;", "rangeContentReducer", "Ljt2/q;", "metricSliderMatcher", "<init>", "(Lzs2/g;Ljt2/q;)V", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;", "model", "Ll83/k;", "", "a", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Ll83/k;", "", "fillPercentage", "Ly81/e;", "b", "(Ljava/lang/Float;)Ly81/e;", "Ljt2/m$i;", "domainState", "Ljt2/d;", "accumulator", "Lot2/t;", "c", "(Ljt2/m$i;Ljt2/d;)Lot2/t;", "Lzs2/g;", "Ljt2/q;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28346o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C41083g rangeContentReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21955q metricSliderMatcher;

    /* JADX INFO: renamed from: ot2.o$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f114348w = new a();

        /* JADX INFO: renamed from: a */
        public final long m85978a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m85978a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ot2.o$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f114349w = new b();

        /* JADX INFO: renamed from: a */
        public final long m85979a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m85979a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ot2.o$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f114350w = new c();

        /* JADX INFO: renamed from: a */
        public final long m85980a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m85980a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ot2.o$d */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f114351w = new d();

        /* JADX INFO: renamed from: a */
        public final long m85981a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m85981a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ot2.o$e */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f114352w = new e();

        /* JADX INFO: renamed from: a */
        public final long m85982a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite90();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m85982a((C39336i) obj));
        }
    }

    public C28346o(C41083g rangeContentReducer, C21955q metricSliderMatcher) {
        AbstractC22676k.m65750j(rangeContentReducer, "rangeContentReducer");
        AbstractC22676k.m65750j(metricSliderMatcher, "metricSliderMatcher");
        this.rangeContentReducer = rangeContentReducer;
        this.metricSliderMatcher = metricSliderMatcher;
    }

    /* JADX INFO: renamed from: a */
    private final C23465k m85975a(WeeklyPlanCustomizationScreenModel model) {
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
    private final InterfaceC39332e m85976b(Float fillPercentage) {
        return (AbstractC22676k.m65743c(fillPercentage, 1.0f) || AbstractC22676k.m65743c(fillPercentage, 0.0f)) ? p745y81.Function1.m125323a(a.f114348w) : p745y81.Function1.m125323a(b.f114349w);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:50:0x0105  */
    /* JADX WARN: Code duplicated, block: B:52:0x010b  */
    /* JADX WARN: Code duplicated, block: B:55:0x013a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0147  */
    /* JADX WARN: Code duplicated, block: B:61:0x014f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0154  */
    /* JADX WARN: Code duplicated, block: B:65:0x0165  */
    /* JADX WARN: Code duplicated, block: B:66:0x016f  */
    /* JADX WARN: Code duplicated, block: B:69:0x017c  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:92:0x020b  */
    /* JADX INFO: renamed from: c */
    public final C28351t m85977c(AbstractC21951m.i domainState, C21942d accumulator) {
        Object next;
        Object next2;
        float f13;
        double value;
        SliderContent slider;
        List<RangeWithTip> rangeContent;
        SliderContent slider2;
        Double dValueOf;
        List listM133397d;
        Iterator<T> it;
        Object next3;
        C21956r c21956r;
        SliderContent slider3;
        double value2;
        SliderContent slider4;
        TextResource textResourceM21278l;
        SliderContent slider5;
        String valueLabel;
        SliderContent slider6;
        Float fValueOf;
        SliderContent slider7;
        C3647h c3647h;
        SliderContent slider8;
        TextResource textResourceM21278l2;
        SliderContent slider9;
        TextResource textResourceM21278l3;
        String bottomText;
        String topText;
        AverageLine averageLine;
        String valueUnits;
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC22676k.m65750j(accumulator, "accumulator");
        Iterator<T> it3 = domainState.getResult().getGoalScreens().iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (((WeeklyPlanCustomizationScreenModel) next).getGoal() != TargetGoalType.WEIGHT);
        WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel = (WeeklyPlanCustomizationScreenModel) next;
        if (weeklyPlanCustomizationScreenModel == null) {
            return null;
        }
        Iterator<T> it4 = accumulator.m62545l().iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (((C21956r) next2).getTargetGoalType() != accumulator.getCurrentSlider());
        C21956r c21956r2 = (C21956r) next2;
        float f14 = 0.0f;
        if (c21956r2 == null) {
            SliderContent slider10 = weeklyPlanCustomizationScreenModel.getSlider();
            if (slider10 != null) {
                value = slider10.getValue();
            } else {
                f13 = 0.0f;
            }
            C23465k c23465kM85975a = m85975a(weeklyPlanCustomizationScreenModel);
            String str = (String) c23465kM85975a.f92937w;
            String str2 = (String) c23465kM85975a.f92938x;
            C41083g c41083g = this.rangeContentReducer;
            slider = weeklyPlanCustomizationScreenModel.getSlider();
            if (slider != null) {
                rangeContent = slider.getRangeContent();
            } else {
                rangeContent = null;
            }
            slider2 = weeklyPlanCustomizationScreenModel.getSlider();
            if (slider2 != null) {
                dValueOf = Double.valueOf(slider2.getIncrement());
            } else {
                dValueOf = null;
            }
            listM133397d = C41083g.m133397d(c41083g, rangeContent, dValueOf, null, null, 12, null);
            if (listM133397d == null) {
                listM133397d = C25271y.f99162w;
            }
            List list = listM133397d;
            TargetGoalType currentSlider = accumulator.getCurrentSlider();
            C39759f c39759f = new C39759f(AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getNavigationTitleDisplay()), AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getNavigationSubtitleDisplay()), AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getTitle()), AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getDescription()));
            it = accumulator.m62545l().iterator();
            do {
                if (it.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it.next();
            } while (((C21956r) next3).getTargetGoalType() != accumulator.getCurrentSlider());
            c21956r = (C21956r) next3;
            if (c21956r != null) {
                slider3 = weeklyPlanCustomizationScreenModel.getSlider();
                if (slider3 != null) {
                    value2 = slider3.getValue();
                }
                float f15 = f14;
                double dM62674a = this.metricSliderMatcher.m62674a(weeklyPlanCustomizationScreenModel, Float.valueOf(f13));
                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(AbstractC28353v.m86025b(String.valueOf(this.metricSliderMatcher.m62674a(weeklyPlanCustomizationScreenModel, Float.valueOf(f13))), weeklyPlanCustomizationScreenModel.getGoal()));
                slider4 = weeklyPlanCustomizationScreenModel.getSlider();
                if (slider4 != null || (valueUnits = slider4.getValueUnits()) == null) {
                    textResourceM21278l = null;
                } else {
                    textResourceM21278l = AbstractC8693b.m21278l(valueUnits);
                }
                slider5 = weeklyPlanCustomizationScreenModel.getSlider();
                if (slider5 != null) {
                    valueLabel = slider5.getValueLabel();
                } else {
                    valueLabel = null;
                }
                TextResource textResourceM21278l5 = AbstractC8693b.m21278l(valueLabel);
                InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a(c.f114350w);
                slider6 = weeklyPlanCustomizationScreenModel.getSlider();
                if (slider6 != null) {
                    fValueOf = Float.valueOf((float) slider6.getValue());
                } else {
                    fValueOf = null;
                }
                InterfaceC39332e interfaceC39332eM85976b = m85976b(fValueOf);
                EnumC3642c0 enumC3642c0 = EnumC3642c0.WEIGHT;
                slider7 = weeklyPlanCustomizationScreenModel.getSlider();
                if (slider7 != null || (averageLine = slider7.getAverageLine()) == null) {
                    c3647h = null;
                } else {
                    C3637a c3637a = new C3637a(AbstractC8693b.m21278l(str), AbstractC8693b.m21278l(str2), p745y81.Function1.m125323a(d.f114351w), AbstractC2890e.m8450e().getN6(), AbstractC2890e.m8450e().getN7(), AbstractC8693b.m21278l(averageLine.getSubtitle()), p745y81.Function1.m125323a(e.f114352w), null, C2299e.f9110M, null, 640, null);
                    Float positionOnSlider = averageLine.getPositionOnSlider();
                    c3647h = new C3647h(c3637a, positionOnSlider != null ? positionOnSlider.floatValue() : 0.5f, C17919x.f69629f, null);
                }
                slider8 = weeklyPlanCustomizationScreenModel.getSlider();
                if (slider8 != null || (topText = slider8.getTopText()) == null) {
                    textResourceM21278l2 = null;
                } else {
                    textResourceM21278l2 = AbstractC8693b.m21278l(topText);
                }
                slider9 = weeklyPlanCustomizationScreenModel.getSlider();
                if (slider9 != null || (bottomText = slider9.getBottomText()) == null) {
                    textResourceM21278l3 = null;
                } else {
                    textResourceM21278l3 = AbstractC8693b.m21278l(bottomText);
                }
                SliderContent slider11 = weeklyPlanCustomizationScreenModel.getSlider();
                return new C28351t(currentSlider, c39759f, new C3643d(f15, 0.0f, 1.0f, dM62674a, textResourceM21278l4, textResourceM21278l, textResourceM21278l5, textResourceM21278l2, textResourceM21278l3, null, c3647h, list, enumC3642c0, interfaceC39332eM85976b, slider11 != null ? Double.valueOf(slider11.getIncrement()) : null, interfaceC39332eM125323a, 512, null), AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getContinueButtonDisplay()), this.metricSliderMatcher.m62674a(weeklyPlanCustomizationScreenModel, Float.valueOf(f13)), new C37615g(0, 0, false, 7, null), false, null);
            }
            value2 = c21956r.getSliderFillValue();
            f14 = (float) value2;
            float f16 = f14;
            double dM62674a2 = this.metricSliderMatcher.m62674a(weeklyPlanCustomizationScreenModel, Float.valueOf(f13));
            TextResource textResourceM21278l6 = AbstractC8693b.m21278l(AbstractC28353v.m86025b(String.valueOf(this.metricSliderMatcher.m62674a(weeklyPlanCustomizationScreenModel, Float.valueOf(f13))), weeklyPlanCustomizationScreenModel.getGoal()));
            slider4 = weeklyPlanCustomizationScreenModel.getSlider();
            if (slider4 != null) {
                textResourceM21278l = null;
            } else {
                textResourceM21278l = null;
            }
            slider5 = weeklyPlanCustomizationScreenModel.getSlider();
            if (slider5 != null) {
                valueLabel = slider5.getValueLabel();
            } else {
                valueLabel = null;
            }
            TextResource textResourceM21278l7 = AbstractC8693b.m21278l(valueLabel);
            InterfaceC39332e interfaceC39332eM125323a2 = p745y81.Function1.m125323a(c.f114350w);
            slider6 = weeklyPlanCustomizationScreenModel.getSlider();
            if (slider6 != null) {
                fValueOf = Float.valueOf((float) slider6.getValue());
            } else {
                fValueOf = null;
            }
            InterfaceC39332e interfaceC39332eM85976b2 = m85976b(fValueOf);
            EnumC3642c0 enumC3642c1 = EnumC3642c0.WEIGHT;
            slider7 = weeklyPlanCustomizationScreenModel.getSlider();
            if (slider7 != null) {
                c3647h = null;
            } else {
                c3647h = null;
            }
            slider8 = weeklyPlanCustomizationScreenModel.getSlider();
            if (slider8 != null) {
                textResourceM21278l2 = null;
            } else {
                textResourceM21278l2 = null;
            }
            slider9 = weeklyPlanCustomizationScreenModel.getSlider();
            if (slider9 != null) {
                textResourceM21278l3 = null;
            } else {
                textResourceM21278l3 = null;
            }
            SliderContent slider12 = weeklyPlanCustomizationScreenModel.getSlider();
            return new C28351t(currentSlider, c39759f, new C3643d(f16, 0.0f, 1.0f, dM62674a2, textResourceM21278l6, textResourceM21278l, textResourceM21278l7, textResourceM21278l2, textResourceM21278l3, null, c3647h, list, enumC3642c1, interfaceC39332eM85976b2, slider12 != null ? Double.valueOf(slider12.getIncrement()) : null, interfaceC39332eM125323a2, 512, null), AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getContinueButtonDisplay()), this.metricSliderMatcher.m62674a(weeklyPlanCustomizationScreenModel, Float.valueOf(f13)), new C37615g(0, 0, false, 7, null), false, null);
        }
        value = c21956r2.getSliderFillValue();
        f13 = (float) value;
        C23465k c23465kM85975a2 = m85975a(weeklyPlanCustomizationScreenModel);
        String str3 = (String) c23465kM85975a2.f92937w;
        String str4 = (String) c23465kM85975a2.f92938x;
        C41083g c41083g2 = this.rangeContentReducer;
        slider = weeklyPlanCustomizationScreenModel.getSlider();
        if (slider != null) {
            rangeContent = slider.getRangeContent();
        } else {
            rangeContent = null;
        }
        slider2 = weeklyPlanCustomizationScreenModel.getSlider();
        if (slider2 != null) {
            dValueOf = Double.valueOf(slider2.getIncrement());
        } else {
            dValueOf = null;
        }
        listM133397d = C41083g.m133397d(c41083g2, rangeContent, dValueOf, null, null, 12, null);
        if (listM133397d == null) {
            listM133397d = C25271y.f99162w;
        }
        List list2 = listM133397d;
        TargetGoalType currentSlider2 = accumulator.getCurrentSlider();
        C39759f c39759f2 = new C39759f(AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getNavigationTitleDisplay()), AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getNavigationSubtitleDisplay()), AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getTitle()), AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getDescription()));
        it = accumulator.m62545l().iterator();
        do {
            if (it.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it.next();
        } while (((C21956r) next3).getTargetGoalType() != accumulator.getCurrentSlider());
        c21956r = (C21956r) next3;
        if (c21956r != null) {
            slider3 = weeklyPlanCustomizationScreenModel.getSlider();
            if (slider3 != null) {
                value2 = slider3.getValue();
            }
            float f17 = f14;
            double dM62674a3 = this.metricSliderMatcher.m62674a(weeklyPlanCustomizationScreenModel, Float.valueOf(f13));
            TextResource textResourceM21278l8 = AbstractC8693b.m21278l(AbstractC28353v.m86025b(String.valueOf(this.metricSliderMatcher.m62674a(weeklyPlanCustomizationScreenModel, Float.valueOf(f13))), weeklyPlanCustomizationScreenModel.getGoal()));
            slider4 = weeklyPlanCustomizationScreenModel.getSlider();
            if (slider4 != null) {
                textResourceM21278l = null;
            } else {
                textResourceM21278l = null;
            }
            slider5 = weeklyPlanCustomizationScreenModel.getSlider();
            if (slider5 != null) {
                valueLabel = slider5.getValueLabel();
            } else {
                valueLabel = null;
            }
            TextResource textResourceM21278l9 = AbstractC8693b.m21278l(valueLabel);
            InterfaceC39332e interfaceC39332eM125323a3 = p745y81.Function1.m125323a(c.f114350w);
            slider6 = weeklyPlanCustomizationScreenModel.getSlider();
            if (slider6 != null) {
                fValueOf = Float.valueOf((float) slider6.getValue());
            } else {
                fValueOf = null;
            }
            InterfaceC39332e interfaceC39332eM85976b3 = m85976b(fValueOf);
            EnumC3642c0 enumC3642c2 = EnumC3642c0.WEIGHT;
            slider7 = weeklyPlanCustomizationScreenModel.getSlider();
            if (slider7 != null) {
                c3647h = null;
            } else {
                c3647h = null;
            }
            slider8 = weeklyPlanCustomizationScreenModel.getSlider();
            if (slider8 != null) {
                textResourceM21278l2 = null;
            } else {
                textResourceM21278l2 = null;
            }
            slider9 = weeklyPlanCustomizationScreenModel.getSlider();
            if (slider9 != null) {
                textResourceM21278l3 = null;
            } else {
                textResourceM21278l3 = null;
            }
            SliderContent slider13 = weeklyPlanCustomizationScreenModel.getSlider();
            return new C28351t(currentSlider2, c39759f2, new C3643d(f17, 0.0f, 1.0f, dM62674a3, textResourceM21278l8, textResourceM21278l, textResourceM21278l9, textResourceM21278l2, textResourceM21278l3, null, c3647h, list2, enumC3642c2, interfaceC39332eM85976b3, slider13 != null ? Double.valueOf(slider13.getIncrement()) : null, interfaceC39332eM125323a3, 512, null), AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getContinueButtonDisplay()), this.metricSliderMatcher.m62674a(weeklyPlanCustomizationScreenModel, Float.valueOf(f13)), new C37615g(0, 0, false, 7, null), false, null);
        }
        value2 = c21956r.getSliderFillValue();
        f14 = (float) value2;
        float f18 = f14;
        double dM62674a4 = this.metricSliderMatcher.m62674a(weeklyPlanCustomizationScreenModel, Float.valueOf(f13));
        TextResource textResourceM21278l10 = AbstractC8693b.m21278l(AbstractC28353v.m86025b(String.valueOf(this.metricSliderMatcher.m62674a(weeklyPlanCustomizationScreenModel, Float.valueOf(f13))), weeklyPlanCustomizationScreenModel.getGoal()));
        slider4 = weeklyPlanCustomizationScreenModel.getSlider();
        if (slider4 != null) {
            textResourceM21278l = null;
        } else {
            textResourceM21278l = null;
        }
        slider5 = weeklyPlanCustomizationScreenModel.getSlider();
        if (slider5 != null) {
            valueLabel = slider5.getValueLabel();
        } else {
            valueLabel = null;
        }
        TextResource textResourceM21278l11 = AbstractC8693b.m21278l(valueLabel);
        InterfaceC39332e interfaceC39332eM125323a4 = p745y81.Function1.m125323a(c.f114350w);
        slider6 = weeklyPlanCustomizationScreenModel.getSlider();
        if (slider6 != null) {
            fValueOf = Float.valueOf((float) slider6.getValue());
        } else {
            fValueOf = null;
        }
        InterfaceC39332e interfaceC39332eM85976b4 = m85976b(fValueOf);
        EnumC3642c0 enumC3642c3 = EnumC3642c0.WEIGHT;
        slider7 = weeklyPlanCustomizationScreenModel.getSlider();
        if (slider7 != null) {
            c3647h = null;
        } else {
            c3647h = null;
        }
        slider8 = weeklyPlanCustomizationScreenModel.getSlider();
        if (slider8 != null) {
            textResourceM21278l2 = null;
        } else {
            textResourceM21278l2 = null;
        }
        slider9 = weeklyPlanCustomizationScreenModel.getSlider();
        if (slider9 != null) {
            textResourceM21278l3 = null;
        } else {
            textResourceM21278l3 = null;
        }
        SliderContent slider14 = weeklyPlanCustomizationScreenModel.getSlider();
        return new C28351t(currentSlider2, c39759f2, new C3643d(f18, 0.0f, 1.0f, dM62674a4, textResourceM21278l10, textResourceM21278l, textResourceM21278l11, textResourceM21278l2, textResourceM21278l3, null, c3647h, list2, enumC3642c3, interfaceC39332eM85976b4, slider14 != null ? Double.valueOf(slider14.getIncrement()) : null, interfaceC39332eM125323a4, 512, null), AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getContinueButtonDisplay()), this.metricSliderMatcher.m62674a(weeklyPlanCustomizationScreenModel, Float.valueOf(f13)), new C37615g(0, 0, false, 7, null), false, null);
    }
}
