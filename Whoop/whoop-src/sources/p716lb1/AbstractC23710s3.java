package p716lb1;

import com.whoop.design.models.items.ProgressStyle;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lb1.s3 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ProgressStyle;", "style", "Ly81/f;", "b", "(Lcom/whoop/design/models/items/ProgressStyle;)Ly81/f;", "c", "d", "a", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23710s3 {

    /* JADX INFO: renamed from: lb1.s3$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93965a;

        static {
            int[] iArr = new int[ProgressStyle.values().length];
            try {
                iArr[ProgressStyle.STEPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProgressStyle.STRENGTH_TRAINING_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProgressStyle.HR_ZONES_ONE_TO_THREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProgressStyle.HR_ZONES_FOUR_TO_FIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProgressStyle.HEALTH_INTAKE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f93965a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final EnumC39333f m69404a(ProgressStyle style) {
        AbstractC22676k.m65750j(style, "style");
        return a.f93965a[style.ordinal()] == 5 ? EnumC39333f.ACCENT_POSITIVE_TREND_15 : EnumC39333f.BLACK_20;
    }

    /* JADX INFO: renamed from: b */
    public static final EnumC39333f m69405b(ProgressStyle style) {
        AbstractC22676k.m65750j(style, "style");
        int i13 = a.f93965a[style.ordinal()];
        if (i13 == 1 || i13 == 2) {
            return EnumC39333f.STRAIN;
        }
        if (i13 == 3) {
            return EnumC39333f.STRAIN_ZONE_2;
        }
        if (i13 == 4) {
            return EnumC39333f.STRAIN_ZONE_4;
        }
        if (i13 == 5) {
            return EnumC39333f.ACCENT_POSITIVE_TREND;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public static final EnumC39333f m69406c(ProgressStyle style) {
        AbstractC22676k.m65750j(style, "style");
        int i13 = a.f93965a[style.ordinal()];
        if (i13 == 1) {
            return EnumC39333f.BRAND_WHITE;
        }
        if (i13 == 2) {
            return EnumC39333f.STRAIN;
        }
        if (i13 == 3) {
            return EnumC39333f.STRAIN_ZONE_2;
        }
        if (i13 == 4) {
            return EnumC39333f.STRAIN_ZONE_4;
        }
        if (i13 == 5) {
            return EnumC39333f.BRAND_WHITE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public static final EnumC39333f m69407d(ProgressStyle style) {
        AbstractC22676k.m65750j(style, "style");
        int i13 = a.f93965a[style.ordinal()];
        if (i13 == 1) {
            return EnumC39333f.BRAND_WHITE;
        }
        if (i13 == 2) {
            return EnumC39333f.STRAIN;
        }
        if (i13 == 3) {
            return EnumC39333f.STRAIN_ZONE_2;
        }
        if (i13 == 4) {
            return EnumC39333f.STRAIN_ZONE_4;
        }
        if (i13 == 5) {
            return EnumC39333f.BRAND_WHITE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
