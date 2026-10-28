package p716lb1;

import com.whoop.design.models.TrendStateEnum;
import gz0.AbstractC16319p0;
import ly0.C24797a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import y71.C39274g;

/* JADX INFO: renamed from: lb1.o */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/TrendStateEnum;", "Ly81/f;", "b", "(Lcom/whoop/design/models/TrendStateEnum;)Ly81/f;", "arrowStat", "Lly0/a;", "a", "(Lcom/whoop/design/models/TrendStateEnum;)Lly0/a;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23682o {

    /* JADX INFO: renamed from: lb1.o$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93892a;

        static {
            int[] iArr = new int[TrendStateEnum.values().length];
            try {
                iArr[TrendStateEnum.HIGHER_POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrendStateEnum.LOWER_POSITIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrendStateEnum.HIGHER_NEUTRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TrendStateEnum.EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TrendStateEnum.LOWER_NEUTRAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TrendStateEnum.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TrendStateEnum.HIGHER_NEGATIVE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TrendStateEnum.LOWER_NEGATIVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f93892a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C24797a m69171a(TrendStateEnum arrowStat) {
        AbstractC22676k.m65750j(arrowStat, "arrowStat");
        switch (a.f93892a[arrowStat.ordinal()]) {
            case 1:
                return new C24797a(new C39274g(AbstractC16319p0.m46430a().getVarious().getArrowUp(), null, 2, null), m69172b(arrowStat));
            case 2:
                return new C24797a(new C39274g(AbstractC16319p0.m46430a().getVarious().getArrowDown(), null, 2, null), m69172b(arrowStat));
            case 3:
                return new C24797a(new C39274g(AbstractC16319p0.m46430a().getVarious().getArrowUp(), null, 2, null), m69172b(arrowStat));
            case 4:
                return new C24797a(new C39274g(AbstractC16319p0.m46430a().getTinyIcons().getEllipse(), null, 2, null), m69172b(arrowStat));
            case 5:
                return new C24797a(new C39274g(AbstractC16319p0.m46430a().getVarious().getArrowDown(), null, 2, null), m69172b(arrowStat));
            case 6:
                return new C24797a(null, m69172b(arrowStat));
            case 7:
                return new C24797a(new C39274g(AbstractC16319p0.m46430a().getVarious().getArrowUp(), null, 2, null), m69172b(arrowStat));
            case 8:
                return new C24797a(new C39274g(AbstractC16319p0.m46430a().getVarious().getArrowDown(), null, 2, null), m69172b(arrowStat));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final EnumC39333f m69172b(TrendStateEnum trendStateEnum) {
        AbstractC22676k.m65750j(trendStateEnum, "<this>");
        switch (a.f93892a[trendStateEnum.ordinal()]) {
            case 1:
            case 2:
                return EnumC39333f.ACCENT_POSITIVE_TREND;
            case 3:
            case 4:
            case 5:
            case 6:
                return EnumC39333f.WHITE_50;
            case 7:
            case 8:
                return EnumC39333f.ACCENT_NEGATIVE_TREND;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
