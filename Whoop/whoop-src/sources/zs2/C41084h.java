package zs2;

import bu2.C3650k;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.weeklyplan.customizeplan.domain.api.DisplayRange;
import com.whoop.weeklyplan.customizeplan.domain.api.DisplayRangeLimits;
import com.whoop.weeklyplan.customizeplan.domain.api.ProgressionRange;
import com.whoop.weeklyplan.customizeplan.domain.api.Range;
import l83.C23465k;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: zs2.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lzs2/h;", "", "<init>", "()V", "Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;", "displayRange", "Lzs2/i;", "percentageSource", "Ll83/k;", "", "b", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;Lzs2/i;)Ll83/k;", "Ly81/e;", "color", "Lbu2/k;", "a", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;Ly81/e;Lzs2/i;)Lbu2/k;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41084h {

    /* JADX INFO: renamed from: zs2.h$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f177120a;

        static {
            int[] iArr = new int[EnumC41085i.values().length];
            try {
                iArr[EnumC41085i.PERCENT_RANGE_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC41085i.PROGRESSION_THEN_PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f177120a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX INFO: renamed from: b */
    private final C23465k m133399b(DisplayRange displayRange, EnumC41085i percentageSource) {
        Range percentRange;
        Range percentRange2;
        float f13;
        Range percentRange3;
        double max;
        Range percentRange4;
        double min;
        ProgressionRange progressionRange;
        ProgressionRange progressionRange2;
        int i13 = a.f177120a[percentageSource.ordinal()];
        float min2 = 0.0f;
        if (i13 == 1) {
            Float fValueOf = Float.valueOf((displayRange == null || (percentRange2 = displayRange.getPercentRange()) == null) ? 0.0f : (float) percentRange2.getMax());
            if (displayRange != null && (percentRange = displayRange.getPercentRange()) != null) {
                min2 = (float) percentRange.getMin();
            }
            return new C23465k(fValueOf, Float.valueOf(min2));
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (displayRange == null || (progressionRange2 = displayRange.getProgressionRange()) == null) {
            if (displayRange == null || (percentRange3 = displayRange.getPercentRange()) == null) {
                f13 = 0.0f;
            } else {
                max = percentRange3.getMax();
            }
            Float fValueOf2 = Float.valueOf(f13);
            if (displayRange != null || (progressionRange = displayRange.getProgressionRange()) == null) {
                if (displayRange != null && (percentRange4 = displayRange.getPercentRange()) != null) {
                    min = percentRange4.getMin();
                }
                return new C23465k(fValueOf2, Float.valueOf(min2));
            }
            min = progressionRange.getBaseline();
            min2 = (float) min;
            return new C23465k(fValueOf2, Float.valueOf(min2));
        }
        max = progressionRange2.getRecommendation();
        f13 = (float) max;
        Float fValueOf3 = Float.valueOf(f13);
        if (displayRange != null) {
            if (displayRange != null) {
                min = percentRange4.getMin();
                min2 = (float) min;
            }
        } else if (displayRange != null) {
            min = percentRange4.getMin();
            min2 = (float) min;
        }
        return new C23465k(fValueOf3, Float.valueOf(min2));
    }

    /* JADX INFO: renamed from: a */
    public final C3650k m133400a(DisplayRange displayRange, InterfaceC39332e color, EnumC41085i percentageSource) {
        DisplayRangeLimits range;
        DisplayRangeLimits range2;
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(percentageSource, "percentageSource");
        C23465k c23465kM133399b = m133399b(displayRange, percentageSource);
        float fFloatValue = ((Number) c23465kM133399b.f92937w).floatValue();
        float fFloatValue2 = ((Number) c23465kM133399b.f92938x).floatValue();
        return new C3650k(AbstractC8693b.m21278l((displayRange == null || (range = displayRange.getRange()) == null) ? null : range.getMax()), fFloatValue, AbstractC8693b.m21267a(), AbstractC8693b.m21278l((displayRange == null || (range2 = displayRange.getRange()) == null) ? null : range2.getMin()), fFloatValue2, AbstractC8693b.m21278l(displayRange != null ? displayRange.getLabelDisplay() : null), color);
    }
}
