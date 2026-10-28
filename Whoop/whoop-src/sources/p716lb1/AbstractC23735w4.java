package p716lb1;

import com.whoop.design.models.items.TileBorderStyle;
import d11.C11475j;
import d11.C11476k;
import d11.InterfaceC11466a;
import gb1.AbstractC15673b0;
import p712j91.Function1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lb1.w4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/items/TileBorderStyle;", "tileBorderStyle", "Ld11/a;", "a", "(Lcom/whoop/design/models/items/TileBorderStyle;)Ld11/a;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23735w4 {

    /* JADX INFO: renamed from: lb1.w4$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94046a;

        static {
            int[] iArr = new int[TileBorderStyle.values().length];
            try {
                iArr[TileBorderStyle.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TileBorderStyle.HAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TileBorderStyle.ONBOARDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TileBorderStyle.LOW_STRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TileBorderStyle.MEDIUM_STRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TileBorderStyle.HIGH_STRESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TileBorderStyle.MULTI_DAY_CYCLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TileBorderStyle.HOLIDAY_GIFT_UPGRADE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f94046a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC11466a m69626a(TileBorderStyle tileBorderStyle) {
        AbstractC22676k.m65750j(tileBorderStyle, "tileBorderStyle");
        switch (a.f94046a[tileBorderStyle.ordinal()]) {
            case 1:
                return null;
            case 2:
                return new C11475j(Function1.m60318a(AbstractC15673b0.m43972A()), 0.0f, 2, null);
            case 3:
                return new C11475j(Function1.m60318a(AbstractC15673b0.m43983F0()), 0.0f, 2, null);
            case 4:
                return new C11476k(EnumC39333f.RECOVERY, 0.0f, 2, null);
            case 5:
                return new C11476k(EnumC39333f.ACCENT_NEGATIVE_TREND, 0.0f, 2, null);
            case 6:
                return new C11476k(EnumC39333f.ACCENT_POSITIVE_TREND, 0.0f, 2, null);
            case 7:
                return new C11476k(EnumC39333f.SLEEP, 0.0f, 2, null);
            case 8:
                return new C11475j(Function1.m60318a(AbstractC15673b0.m43994L()), 0.0f, 2, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
