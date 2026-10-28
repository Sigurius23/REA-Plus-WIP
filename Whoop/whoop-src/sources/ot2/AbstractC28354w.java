package ot2;

import com.whoop.design.atomic.atom.TrendTypeEnum;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: ot2.w */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/design/atomic/atom/TrendTypeEnum;", "Ly81/f;", "a", "(Lcom/whoop/design/atomic/atom/TrendTypeEnum;)Ly81/f;", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28354w {

    /* JADX INFO: renamed from: ot2.w$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f114399a;

        static {
            int[] iArr = new int[TrendTypeEnum.values().length];
            try {
                iArr[TrendTypeEnum.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrendTypeEnum.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrendTypeEnum.NEUTRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TrendTypeEnum.POSITIVE_RANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TrendTypeEnum.CONCERN_RANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TrendTypeEnum.ALERT_RANGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f114399a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final EnumC39333f m86027a(TrendTypeEnum trendTypeEnum) {
        AbstractC22676k.m65750j(trendTypeEnum, "<this>");
        switch (a.f114399a[trendTypeEnum.ordinal()]) {
            case 1:
                return EnumC39333f.ACCENT_ACTION;
            case 2:
                return EnumC39333f.ACCENT_NEGATIVE_TREND;
            case 3:
                return EnumC39333f.WHITE_70;
            case 4:
                return EnumC39333f.ACCENT_ACTION;
            case 5:
                return EnumC39333f.ACCENT_NEGATIVE_TREND;
            case 6:
                return EnumC39333f.ACCENT_NEGATIVE_TREND;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
