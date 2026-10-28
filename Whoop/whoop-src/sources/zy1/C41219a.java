package zy1;

import androidx.core.app.NotificationCompat;
import c31.C3927k;
import c31.EnumC3920d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import py1.AbstractC29625d;
import xy1.EnumC38706g;

/* JADX INFO: renamed from: zy1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lzy1/a;", "", "<init>", "()V", "", NotificationCompat.CATEGORY_PROGRESS, "Lxy1/g;", "submissionUIState", "Lc31/k;", "a", "(FLxy1/g;)Lc31/k;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41219a {

    /* JADX INFO: renamed from: zy1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f177857a;

        static {
            int[] iArr = new int[EnumC41227i.values().length];
            try {
                iArr[EnumC41227i.LAST_STEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC41227i.FIRST_STEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC41227i.MIDDLE_STEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f177857a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C3927k m133903a(float progress, EnumC38706g submissionUIState) {
        EnumC41227i enumC41227i;
        EnumC3920d enumC3920d;
        TextResource.C8688b c8688bM21277k;
        EnumC16313m0 enumC16313m0;
        EnumC39333f enumC39333f;
        EnumC39333f enumC39333f2;
        AbstractC22676k.m65750j(submissionUIState, "submissionUIState");
        if (progress <= 0.0f) {
            enumC41227i = EnumC41227i.FIRST_STEP;
        } else {
            enumC41227i = progress >= 1.0f ? EnumC41227i.LAST_STEP : EnumC41227i.MIDDLE_STEP;
        }
        EnumC38706g enumC38706g = EnumC38706g.LOADING;
        if (submissionUIState == enumC38706g) {
            enumC3920d = EnumC3920d.LOADING;
        } else {
            enumC3920d = (enumC41227i == EnumC41227i.FIRST_STEP || enumC41227i == EnumC41227i.LAST_STEP) ? EnumC3920d.FILLED : EnumC3920d.PROGRESS;
        }
        EnumC3920d enumC3920d2 = enumC3920d;
        if (submissionUIState == enumC38706g) {
            c8688bM21277k = AbstractC8693b.m21277k(AbstractC29625d.f121011y);
        } else if (submissionUIState == EnumC38706g.FAILED) {
            c8688bM21277k = AbstractC8693b.m21277k(AbstractC29625d.f120970A);
        } else if (enumC41227i == EnumC41227i.FIRST_STEP) {
            c8688bM21277k = AbstractC8693b.m21277k(AbstractC29625d.f121010x);
        } else {
            c8688bM21277k = enumC41227i == EnumC41227i.LAST_STEP ? AbstractC8693b.m21277k(AbstractC29625d.f120971B) : AbstractC8693b.m21277k(AbstractC29625d.f121012z);
        }
        TextResource.C8688b c8688b = c8688bM21277k;
        int iFloor = (int) Math.floor(100 * progress);
        EnumC38706g enumC38706g2 = EnumC38706g.FAILED;
        if (submissionUIState == enumC38706g2) {
            enumC16313m0 = EnumC16313m0.TINY_REFRESH;
        } else {
            enumC16313m0 = enumC41227i == EnumC41227i.LAST_STEP ? EnumC16313m0.CHECKMARK : EnumC16313m0.ARROW_FORWARD;
        }
        EnumC16313m0 enumC16313m1 = enumC16313m0;
        if (submissionUIState == enumC38706g2) {
            enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
        } else if (enumC41227i == EnumC41227i.FIRST_STEP) {
            enumC39333f = EnumC39333f.STRAIN;
        } else {
            enumC39333f = enumC41227i == EnumC41227i.LAST_STEP ? EnumC39333f.ACCENT_POSITIVE_TREND : EnumC39333f.ACCENT_ACTION;
        }
        EnumC39333f enumC39333f3 = enumC39333f;
        int[] iArr = b.f177857a;
        int i13 = iArr[enumC41227i.ordinal()];
        if (i13 == 1) {
            enumC39333f2 = EnumC39333f.BRAND_BLACK;
        } else {
            if (i13 != 2 && i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            enumC39333f2 = EnumC39333f.BRAND_WHITE;
        }
        EnumC39333f enumC39333f4 = enumC39333f2;
        int i14 = iArr[enumC41227i.ordinal()];
        if (i14 != 1 && i14 != 2 && i14 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        EnumC39333f enumC39333f5 = EnumC39333f.BRAND_WHITE;
        return new C3927k(enumC3920d2, c8688b, enumC39333f5, null, null, enumC16313m1, 100, iFloor, null, true, false, enumC39333f3, null, enumC39333f4, null, null, null, 120088, null);
    }
}
