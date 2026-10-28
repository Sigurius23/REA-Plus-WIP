package np0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: np0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lnp0/h;", "", "<init>", "()V", "", "sleepCoachResponse", "Lnp0/k;", "onboardingState", "Lnp0/g;", "a", "(Ljava/lang/String;Lnp0/k;)Lnp0/g;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27015h {

    /* JADX INFO: renamed from: np0.h$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f107715a;

        static {
            int[] iArr = new int[EnumC27018k.values().length];
            try {
                iArr[EnumC27018k.ALARM_OFF_ONBOARDING_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f107715a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C27014g m81007a(String sleepCoachResponse, EnumC27018k onboardingState) {
        AbstractC22676k.m65750j(onboardingState, "onboardingState");
        if (b.f107715a[onboardingState.ordinal()] == 1 && AbstractC22676k.m65745e(sleepCoachResponse, "TO_DO")) {
            return new C27014g(EnumC27013f.INCOMPLETE);
        }
        return new C27014g(EnumC27013f.COMPLETE);
    }
}
