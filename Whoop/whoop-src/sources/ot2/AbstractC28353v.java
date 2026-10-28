package ot2;

import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import or2.AbstractC28193q0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39420x;

/* JADX INFO: renamed from: ot2.v */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"", "value", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "targetGoalType", "b", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)Ljava/lang/String;", "Ljava/text/DecimalFormatSymbols;", "a", "()Ljava/text/DecimalFormatSymbols;", "Ljava/util/Locale;", "c", "()Ljava/util/Locale;", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28353v {

    /* JADX INFO: renamed from: ot2.v$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f114398a;

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
                iArr[TargetGoalType.WEIGHT.ordinal()] = 6;
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
                iArr[TargetGoalType.STRENGTH_TRAINING_TIME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f114398a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    private static final DecimalFormatSymbols m86024a() {
        return new DecimalFormatSymbols(m86026c());
    }

    /* JADX INFO: renamed from: b */
    public static final String m86025b(String value, TargetGoalType targetGoalType) {
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(targetGoalType, "targetGoalType");
        switch (a.f114398a[targetGoalType.ordinal()]) {
            case 3:
            case 7:
            case 8:
            case 9:
                Double dM125914x = AbstractC39420x.m125914x(value);
                if (dM125914x == null) {
                    return value;
                }
                int iDoubleValue = (int) dM125914x.doubleValue();
                return String.format(m86026c(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iDoubleValue / 60), Integer.valueOf(iDoubleValue % 60)}, 2));
            case 4:
                Double dM125914x2 = AbstractC39420x.m125914x(value);
                if (dM125914x2 == null) {
                    return value;
                }
                String str = new DecimalFormat("0.0", m86024a()).format(dM125914x2.doubleValue());
                return str == null ? value : str;
            case 5:
                Double dM125914x3 = AbstractC39420x.m125914x(value);
                if (dM125914x3 == null) {
                    return value;
                }
                String str2 = new DecimalFormat("#,###", m86024a()).format(dM125914x3.doubleValue());
                return str2 == null ? value : str2;
            case 6:
                Double dM125914x4 = AbstractC39420x.m125914x(value);
                if (dM125914x4 == null) {
                    return value;
                }
                String str3 = new DecimalFormat("0.0", m86024a()).format(dM125914x4.doubleValue());
                return str3 == null ? value : str3;
            default:
                Double dM125914x5 = AbstractC39420x.m125914x(value);
                return String.valueOf(dM125914x5 != null ? Integer.valueOf((int) dM125914x5.doubleValue()) : null);
        }
    }

    /* JADX INFO: renamed from: c */
    private static final Locale m86026c() {
        Locale locale = Locale.getDefault();
        return AbstractC22676k.m65745e(locale.getLanguage(), "ar") ? AbstractC28193q0.m85323b(locale) : locale;
    }
}
