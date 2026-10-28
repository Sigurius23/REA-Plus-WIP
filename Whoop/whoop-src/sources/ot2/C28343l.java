package ot2;

import b91.AbstractC2890e;
import bu2.C3637a;
import bu2.C3643d;
import bu2.C3647h;
import bu2.C3650k;
import bu2.EnumC3642c0;
import com.whoop.data.remote.domain.dto.BoundType;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weeklyplan.customizeplan.domain.api.AverageLine;
import com.whoop.weeklyplan.customizeplan.domain.api.RangeWithTip;
import com.whoop.weeklyplan.customizeplan.domain.api.SliderContent;
import com.whoop.weeklyplan.customizeplan.domain.api.SmartAlarmOverride;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModel;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import java.util.List;
import jt2.AbstractC21951m;
import jt2.C21942d;
import jt2.C21955q;
import jt2.C21956r;
import ks2.AbstractC22822a;
import l83.C23465k;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2299e;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import ws2.C37615g;
import yb3.AbstractC39414r;
import ys2.C39756c;
import ys2.C39759f;
import zs2.C41083g;
import zs2.C41084h;
import zs2.EnumC41085i;

/* JADX INFO: renamed from: ot2.l */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b!\u0010\"J-\u0010&\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010%0\u001d2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010%0\u001d2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020%2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u0014H\u0000¢\u0006\u0004\b4\u0010\"J\u0017\u00106\u001a\u0002052\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010;¨\u0006<"}, m65681d2 = {"Lot2/l;", "", "Lzs2/g;", "rangeContentReducer", "Ljt2/q;", "metricSliderMatcher", "Lot2/o;", "weightGoalSliderReducer", "Lzs2/h;", "recommendedRangeMapper", "<init>", "(Lzs2/g;Ljt2/q;Lot2/o;Lzs2/h;)V", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;", "model", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)F", "g", "Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;", "slider", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "goalType", "Lbu2/h;", "f", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)Lbu2/h;", "Ly81/e;", "targetColor", "a", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;Ly81/e;)Lbu2/h;", "Ll83/k;", "", "d", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;)Ll83/k;", "j", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)Ly81/e;", "", "value", "Lcom/whoop/design/util/TextResource;", "c", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;D)Ll83/k;", "b", "(D)Ll83/k;", "Ljt2/m$i;", "domainState", "Ljt2/d;", "accumulator", "Lot2/t;", "l", "(Ljt2/m$i;Ljt2/d;)Lot2/t;", "i", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Lcom/whoop/design/util/TextResource;", "targetGoalType", "e", "Lbu2/c0;", "k", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)Lbu2/c0;", "Lzs2/g;", "Ljt2/q;", "Lot2/o;", "Lzs2/h;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28343l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C41083g rangeContentReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21955q metricSliderMatcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C28346o weightGoalSliderReducer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C41084h recommendedRangeMapper;

    /* JADX INFO: renamed from: ot2.l$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f114315a;

        static {
            int[] iArr = new int[TargetGoalType.values().length];
            try {
                iArr[TargetGoalType.SLEEP_PERFORMANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TargetGoalType.SLEEP_CONSISTENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TargetGoalType.SLEEP_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TargetGoalType.STRAIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TargetGoalType.STEPS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TargetGoalType.STRENGTH_TRAINING_TIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TargetGoalType.HR_ZONES_ONE_TO_THREE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TargetGoalType.HR_ZONES_FOUR_TO_FIVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TargetGoalType.WEIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f114315a = iArr;
        }
    }

    /* JADX INFO: renamed from: ot2.l$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f114316w = new b();

        /* JADX INFO: renamed from: a */
        public final long m85954a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite70();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m85954a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ot2.l$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f114317w = new c();

        /* JADX INFO: renamed from: a */
        public final long m85955a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone2();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m85955a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ot2.l$d */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f114318w = new d();

        /* JADX INFO: renamed from: a */
        public final long m85956a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone4();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m85956a((C39336i) obj));
        }
    }

    public C28343l(C41083g rangeContentReducer, C21955q metricSliderMatcher, C28346o weightGoalSliderReducer, C41084h recommendedRangeMapper) {
        AbstractC22676k.m65750j(rangeContentReducer, "rangeContentReducer");
        AbstractC22676k.m65750j(metricSliderMatcher, "metricSliderMatcher");
        AbstractC22676k.m65750j(weightGoalSliderReducer, "weightGoalSliderReducer");
        AbstractC22676k.m65750j(recommendedRangeMapper, "recommendedRangeMapper");
        this.rangeContentReducer = rangeContentReducer;
        this.metricSliderMatcher = metricSliderMatcher;
        this.weightGoalSliderReducer = weightGoalSliderReducer;
        this.recommendedRangeMapper = recommendedRangeMapper;
    }

    /* JADX INFO: renamed from: a */
    private final C3647h m85942a(SliderContent slider, InterfaceC39332e targetColor) {
        C23465k c23465kM85945d = m85945d(slider);
        String str = (String) c23465kM85945d.f92937w;
        String str2 = (String) c23465kM85945d.f92938x;
        AverageLine averageLine = slider.getAverageLine();
        if (averageLine == null) {
            return null;
        }
        C3637a c3637a = new C3637a(AbstractC8693b.m21278l(str), AbstractC8693b.m21278l(str2), targetColor, AbstractC2890e.m8450e().getN6(), AbstractC2890e.m8450e().getN7(), AbstractC8693b.m21278l(averageLine.getSubtitle()), p745y81.Function1.m125323a(b.f114316w), null, C2299e.f9110M, null, 640, null);
        Float positionOnSlider = averageLine.getPositionOnSlider();
        return new C3647h(c3637a, positionOnSlider != null ? positionOnSlider.floatValue() : 0.5f, C17919x.f69629f, null);
    }

    /* JADX INFO: renamed from: b */
    private final C23465k m85943b(double value) {
        return value >= 60.0d ? new C23465k(AbstractC8693b.m21278l(AbstractC28353v.m86025b(String.valueOf(value), TargetGoalType.HR_ZONES_ONE_TO_THREE)), AbstractC8693b.m21277k(AbstractC22822a.f89940l)) : new C23465k(AbstractC8693b.m21278l(String.valueOf((int) value)), AbstractC8693b.m21277k(AbstractC22822a.f89941m));
    }

    /* JADX INFO: renamed from: c */
    private final C23465k m85944c(WeeklyPlanCustomizationScreenModel model, double value) {
        return (model.getGoal() == TargetGoalType.HR_ZONES_ONE_TO_THREE || model.getGoal() == TargetGoalType.HR_ZONES_FOUR_TO_FIVE) ? m85943b(value) : new C23465k(AbstractC8693b.m21278l(AbstractC28353v.m86025b(String.valueOf(value), model.getGoal())), m85951i(model));
    }

    /* JADX INFO: renamed from: d */
    private final C23465k m85945d(SliderContent slider) {
        String title;
        AverageLine averageLine = slider.getAverageLine();
        String str = null;
        String title2 = averageLine != null ? averageLine.getTitle() : null;
        AverageLine averageLine2 = slider.getAverageLine();
        List listM125906y0 = (averageLine2 == null || (title = averageLine2.getTitle()) == null) ? null : AbstractC39414r.m125906y0(title, new String[]{" "}, 6);
        if (listM125906y0 != null && listM125906y0.size() == 2) {
            title2 = (String) listM125906y0.get(0);
            str = (String) listM125906y0.get(1);
        }
        return new C23465k(title2, str);
    }

    /* JADX INFO: renamed from: f */
    private final C3647h m85946f(SliderContent slider, TargetGoalType goalType) {
        int i13 = a.f114315a[goalType.ordinal()];
        if (i13 == 7) {
            return m85942a(slider, p745y81.Function1.m125323a(c.f114317w));
        }
        if (i13 != 8) {
            return null;
        }
        return m85942a(slider, p745y81.Function1.m125323a(d.f114318w));
    }

    /* JADX INFO: renamed from: g */
    private final float m85947g(WeeklyPlanCustomizationScreenModel model) {
        if (model.getGoal() == TargetGoalType.STEPS || model.getGoal() == TargetGoalType.SLEEP_HOURS || model.getGoal() == TargetGoalType.HR_ZONES_ONE_TO_THREE || model.getGoal() == TargetGoalType.HR_ZONES_FOUR_TO_FIVE || model.getGoal() == TargetGoalType.STRENGTH_TRAINING_TIME) {
            return 1.0f;
        }
        SliderContent slider = model.getSlider();
        double max = slider != null ? slider.getUsableRange().getMax() : 1.0d;
        SliderContent slider2 = model.getSlider();
        return (float) (max / (slider2 != null ? slider2.getRange().getMax() : 1.0d));
    }

    /* JADX INFO: renamed from: h */
    private final float m85948h(WeeklyPlanCustomizationScreenModel model) {
        if (model.getGoal() == TargetGoalType.STEPS || model.getGoal() == TargetGoalType.SLEEP_HOURS || model.getGoal() == TargetGoalType.HR_ZONES_ONE_TO_THREE || model.getGoal() == TargetGoalType.HR_ZONES_FOUR_TO_FIVE || model.getGoal() == TargetGoalType.STRENGTH_TRAINING_TIME) {
            return 0.0f;
        }
        SliderContent slider = model.getSlider();
        double min = slider != null ? slider.getUsableRange().getMin() : 0.0d;
        SliderContent slider2 = model.getSlider();
        return (float) (min / (slider2 != null ? slider2.getRange().getMax() : 1.0d));
    }

    /* JADX INFO: renamed from: j */
    private final InterfaceC39332e m85949j(TargetGoalType goalType) {
        int i13 = a.f114315a[goalType.ordinal()];
        if (i13 == 7) {
            return EnumC39333f.STRAIN_ZONE_2;
        }
        if (i13 != 8) {
            return null;
        }
        return EnumC39333f.STRAIN_ZONE_4;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC39332e m85950e(TargetGoalType targetGoalType) {
        AbstractC22676k.m65750j(targetGoalType, "targetGoalType");
        switch (a.f114315a[targetGoalType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return EnumC39333f.SLEEP;
            case 4:
            case 5:
            case 6:
                return EnumC39333f.STRAIN;
            case 7:
                return EnumC39333f.STRAIN_ZONE_2;
            case 8:
                return EnumC39333f.STRAIN_ZONE_4;
            default:
                return EnumC39333f.RECOVERY;
        }
    }

    /* JADX INFO: renamed from: i */
    public final TextResource m85951i(WeeklyPlanCustomizationScreenModel model) {
        String valueUnits;
        TextResource textResourceM21278l;
        AbstractC22676k.m65750j(model, "model");
        SliderContent slider = model.getSlider();
        if (slider != null && (valueUnits = slider.getValueUnits()) != null && (textResourceM21278l = AbstractC8693b.m21278l(valueUnits)) != null) {
            return textResourceM21278l;
        }
        int i13 = a.f114315a[model.getGoal().ordinal()];
        return (i13 == 1 || i13 == 2) ? AbstractC8693b.m21278l("%") : AbstractC8693b.m21267a();
    }

    /* JADX INFO: renamed from: k */
    public final EnumC3642c0 m85952k(TargetGoalType goalType) {
        AbstractC22676k.m65750j(goalType, "goalType");
        switch (a.f114315a[goalType.ordinal()]) {
            case 4:
            case 6:
                return EnumC3642c0.STRAIN;
            case 5:
            default:
                return EnumC3642c0.SLEEP;
            case 7:
            case 8:
            case 9:
                return EnumC3642c0.WEIGHT;
        }
    }

    /* JADX INFO: renamed from: l */
    public final C28351t m85953l(AbstractC21951m.i domainState, C21942d accumulator) {
        Object next;
        Object next2;
        Number numberValueOf;
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC22676k.m65750j(accumulator, "accumulator");
        Iterator<T> it = domainState.getResult().getGoalScreens().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((WeeklyPlanCustomizationScreenModel) next).getGoal() != accumulator.getCurrentSlider());
        WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel = (WeeklyPlanCustomizationScreenModel) next;
        if (weeklyPlanCustomizationScreenModel == null) {
            return null;
        }
        Iterator<T> it3 = accumulator.m62545l().iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (((C21956r) next2).getTargetGoalType() != accumulator.getCurrentSlider());
        C21956r c21956r = (C21956r) next2;
        if (c21956r != null) {
            numberValueOf = Double.valueOf(c21956r.getSliderFillValue());
        } else {
            SliderContent slider = weeklyPlanCustomizationScreenModel.getSlider();
            numberValueOf = Float.valueOf(slider != null ? (float) slider.getValue() : 0.0f);
        }
        if (weeklyPlanCustomizationScreenModel.getGoal() == TargetGoalType.WEIGHT) {
            return this.weightGoalSliderReducer.m85977c(domainState, accumulator);
        }
        double dM62674a = this.metricSliderMatcher.m62674a(weeklyPlanCustomizationScreenModel, Float.valueOf(numberValueOf.floatValue()));
        C23465k c23465kM85944c = m85944c(weeklyPlanCustomizationScreenModel, dM62674a);
        TextResource textResource = (TextResource) c23465kM85944c.f92937w;
        TextResource textResource2 = (TextResource) c23465kM85944c.f92938x;
        TargetGoalType currentSlider = accumulator.getCurrentSlider();
        C39759f c39759f = new C39759f(AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getNavigationTitleDisplay()), AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getNavigationSubtitleDisplay()), AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getTitle()), AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getDescription()));
        float fFloatValue = numberValueOf.floatValue();
        float fM85948h = m85948h(weeklyPlanCustomizationScreenModel);
        float fM85947g = m85947g(weeklyPlanCustomizationScreenModel);
        SliderContent slider2 = weeklyPlanCustomizationScreenModel.getSlider();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(slider2 != null ? slider2.getValueLabel() : null);
        EnumC3642c0 enumC3642c0M85952k = m85952k(weeklyPlanCustomizationScreenModel.getGoal());
        SliderContent slider3 = weeklyPlanCustomizationScreenModel.getSlider();
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(slider3 != null ? slider3.getTopText() : null);
        SliderContent slider4 = weeklyPlanCustomizationScreenModel.getSlider();
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(slider4 != null ? slider4.getBottomText() : null);
        InterfaceC39332e interfaceC39332eM85950e = m85950e(weeklyPlanCustomizationScreenModel.getGoal());
        C41084h c41084h = this.recommendedRangeMapper;
        SliderContent slider5 = weeklyPlanCustomizationScreenModel.getSlider();
        C3650k c3650kM133400a = c41084h.m133400a(slider5 != null ? slider5.getRecommendedRange() : null, m85950e(weeklyPlanCustomizationScreenModel.getGoal()), EnumC41085i.PROGRESSION_THEN_PERCENT);
        C41083g c41083g = this.rangeContentReducer;
        SliderContent slider6 = weeklyPlanCustomizationScreenModel.getSlider();
        List<RangeWithTip> rangeContent = slider6 != null ? slider6.getRangeContent() : null;
        BoundType boundType = BoundType.CLOSED;
        InterfaceC39332e interfaceC39332eM85950e2 = m85950e(weeklyPlanCustomizationScreenModel.getGoal());
        AbstractC22676k.m65748h(interfaceC39332eM85950e2, "null cannot be cast to non-null type com.whoop.design.atomic.theme.color.WhoopColorKey");
        List listM133397d = C41083g.m133397d(c41083g, rangeContent, null, boundType, (EnumC39333f) interfaceC39332eM85950e2, 2, null);
        if (listM133397d == null) {
            listM133397d = C25271y.f99162w;
        }
        List list = listM133397d;
        SliderContent slider7 = weeklyPlanCustomizationScreenModel.getSlider();
        C3643d c3643d = new C3643d(fFloatValue, fM85948h, fM85947g, dM62674a, textResource, textResource2, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, c3650kM133400a, slider7 != null ? m85946f(slider7, weeklyPlanCustomizationScreenModel.getGoal()) : null, list, enumC3642c0M85952k, m85949j(weeklyPlanCustomizationScreenModel.getGoal()), null, interfaceC39332eM85950e, DfuBaseService.ERROR_CONNECTION_MASK, null);
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(weeklyPlanCustomizationScreenModel.getContinueButtonDisplay());
        boolean z4 = weeklyPlanCustomizationScreenModel.getSmartAlarmOverride() != null;
        C37615g c37615g = new C37615g(0, 0, false, 7, null);
        SmartAlarmOverride smartAlarmOverride = weeklyPlanCustomizationScreenModel.getSmartAlarmOverride();
        return new C28351t(currentSlider, c39759f, c3643d, textResourceM21278l4, dM62674a, c37615g, z4, smartAlarmOverride != null ? new C39756c(AbstractC8693b.m21278l(smartAlarmOverride.getTitle()), AbstractC8693b.m21278l(smartAlarmOverride.getDescription()), AbstractC8693b.m21278l(smartAlarmOverride.getButtonConfirmTitle()), AbstractC8693b.m21278l(smartAlarmOverride.getButtonRejectTitle())) : null);
    }
}
