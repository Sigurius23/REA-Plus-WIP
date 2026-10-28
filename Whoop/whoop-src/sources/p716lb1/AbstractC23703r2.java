package p716lb1;

import com.whoop.design.models.LegendStyle;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lb1.r2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/design/models/LegendStyle;", "Ly81/f;", "a", "(Lcom/whoop/design/models/LegendStyle;)Ly81/f;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23703r2 {

    /* JADX INFO: renamed from: lb1.r2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93948a;

        static {
            int[] iArr = new int[LegendStyle.values().length];
            try {
                iArr[LegendStyle.POSITIVE_TREND_TARGET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LegendStyle.NEUTRAL_TREND_TARGET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LegendStyle.NEGATIVE_TREND_TARGET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f93948a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final EnumC39333f m69349a(LegendStyle legendStyle) {
        AbstractC22676k.m65750j(legendStyle, "<this>");
        int i13 = a.f93948a[legendStyle.ordinal()];
        if (i13 == 1) {
            return EnumC39333f.ACCENT_POSITIVE_TREND;
        }
        if (i13 != 2) {
            return i13 != 3 ? EnumC39333f.WHITE_10 : EnumC39333f.ACCENT_NEGATIVE_TREND;
        }
        return EnumC39333f.WHITE_50;
    }
}
