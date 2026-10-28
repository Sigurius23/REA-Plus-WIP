package i80;

import c31.C3927k;
import c31.EnumC3920d;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.steps.EnterYourPasswordStepModel;
import com.whoop.activation.domain.models.steps.HealthConnectStepModel;
import com.whoop.activation.domain.models.steps.PaymentMethodStepModel;
import com.whoop.activation.domain.models.steps.PrivacyConsentModel;
import com.whoop.activation.domain.models.steps.TrialOfferCheckoutModel;
import com.whoop.activation.domain.models.steps.UpcycleJoinTodayModel;
import com.whoop.activation.domain.models.steps.WelcomeTransitionStepModel;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import f70.AbstractC14209u0;
import f70.EnumC14195n0;
import gb1.AbstractC15673b0;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23465k;
import m70.InterfaceC25188b;
import p208i2.AbstractC17911t;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import x60.AbstractC38022b;

/* JADX INFO: renamed from: i80.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020 2\u0006\u0010#\u001a\u00020\u001eH\u0002¢\u0006\u0004\b$\u0010%J1\u0010(\u001a\u00020 2\u0006\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010)J'\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b,\u0010-J#\u00101\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010/\u0012\u0006\u0012\u0004\u0018\u0001000.*\u00020*H\u0002¢\u0006\u0004\b1\u00102Ji\u00108\u001a\u0004\u0018\u0001072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u0002032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u00106\u001a\u00020\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b8\u00109J\u0019\u0010:\u001a\u0004\u0018\u00010 2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b:\u0010;¨\u0006<"}, m65681d2 = {"Li80/e;", "", "<init>", "()V", "Lc31/d;", "buttonState", "", "currentScreenIcon", "", "isInGoogleHealthConnectedState", "Lgz0/m0;", "f", "(Lc31/d;Ljava/lang/String;Z)Lgz0/m0;", "Ly81/f;", "currentColor", "c", "(Ly81/f;Z)Ly81/f;", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "currentScreen", "Lcom/whoop/design/models/ProgressButtonModel$ButtonType;", "initialType", "Lm70/b;", "paymentsDomainResult", "isProgressButtonError", "isProgressButtonLoading", "g", "(Lcom/whoop/activation/domain/models/ActivationFlowStepModel;Lcom/whoop/design/models/ProgressButtonModel$ButtonType;Lm70/b;ZZZ)Lc31/d;", "Lf70/n0;", "loginErrorType", "shouldDismissErrorMessage", "Lf70/u0;", "passwordPolicyError", "Lcom/whoop/design/util/TextResource;", "b", "(Lcom/whoop/activation/domain/models/ActivationFlowStepModel;Lm70/b;Lf70/n0;ZLf70/u0;)Lcom/whoop/design/util/TextResource;", "error", "e", "(Lf70/u0;)Lcom/whoop/design/util/TextResource;", "initialTextResource", "updatedState", "i", "(Lcom/whoop/design/util/TextResource;Lc31/d;Lcom/whoop/activation/domain/models/ActivationFlowStepModel;Z)Lcom/whoop/design/util/TextResource;", "Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;", "initialStyle", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;Lc31/d;Z)Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;", "Ll83/k;", "Ly81/e;", "Li2/t;", "a", "(Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;)Ll83/k;", "", "totalCount", "filledCount", "hasConnectedGoogleHealth", "Lc31/k;", "j", "(Lcom/whoop/activation/domain/models/ActivationFlowStepModel;IILm70/b;ZZZLf70/n0;ZLf70/u0;)Lc31/k;", "d", "(Lf70/n0;)Lcom/whoop/design/util/TextResource;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18214e {

    /* JADX INFO: renamed from: i80.e$a */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f70791a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f70792b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f70793c;

        static {
            int[] iArr = new int[ProgressButtonModel.ButtonType.values().length];
            try {
                iArr[ProgressButtonModel.ButtonType.FILLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProgressButtonModel.ButtonType.PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f70791a = iArr;
            int[] iArr2 = new int[EnumC14195n0.values().length];
            try {
                iArr2[EnumC14195n0.GENERIC_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC14195n0.INCORRECT_CREDENTIALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC14195n0.NETWORK_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f70792b = iArr2;
            int[] iArr3 = new int[ProgressButtonModel.ButtonStyle.values().length];
            try {
                iArr3[ProgressButtonModel.ButtonStyle.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ProgressButtonModel.ButtonStyle.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ProgressButtonModel.ButtonStyle.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ProgressButtonModel.ButtonStyle.RECOVERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ProgressButtonModel.ButtonStyle.ONBOARDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            f70793c = iArr3;
        }
    }

    /* JADX INFO: renamed from: a */
    private final C23465k m52390a(ProgressButtonModel.ButtonStyle buttonStyle) {
        int i13 = a.f70793c[buttonStyle.ordinal()];
        if (i13 == 1) {
            return new C23465k(EnumC39333f.ACCENT_ACTION, null);
        }
        if (i13 == 2) {
            return new C23465k(EnumC39333f.STRAIN, null);
        }
        if (i13 == 3) {
            return new C23465k(EnumC39333f.ACCENT_NEGATIVE_TREND, null);
        }
        if (i13 == 4) {
            return new C23465k(EnumC39333f.RECOVERY, null);
        }
        if (i13 == 5) {
            return new C23465k(null, AbstractC15673b0.m43983F0());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    private final TextResource m52391b(ActivationFlowStepModel currentScreen, InterfaceC25188b paymentsDomainResult, EnumC14195n0 loginErrorType, boolean shouldDismissErrorMessage, AbstractC14209u0 passwordPolicyError) {
        if (shouldDismissErrorMessage || (currentScreen instanceof EnterYourPasswordStepModel)) {
            return null;
        }
        if (passwordPolicyError != null) {
            return m52393e(passwordPolicyError);
        }
        if (!(paymentsDomainResult instanceof InterfaceC25188b.e) && !(paymentsDomainResult instanceof InterfaceC25188b.h) && !(paymentsDomainResult instanceof InterfaceC25188b.f)) {
            return m52398d(loginErrorType);
        }
        if (currentScreen instanceof PaymentMethodStepModel) {
            return ((PaymentMethodStepModel) currentScreen).getErrorMessages().getGenericError();
        }
        if (currentScreen instanceof UpcycleJoinTodayModel) {
            return ((UpcycleJoinTodayModel) currentScreen).getPaymentMethod().getErrorMessages().getGenericError();
        }
        if (currentScreen instanceof TrialOfferCheckoutModel) {
            return ((TrialOfferCheckoutModel) currentScreen).getPaymentMethod().getErrorMessages().getGenericError();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private final EnumC39333f m52392c(EnumC39333f currentColor, boolean isInGoogleHealthConnectedState) {
        return isInGoogleHealthConnectedState ? EnumC39333f.BRAND_BLACK : currentColor;
    }

    /* JADX INFO: renamed from: e */
    private final TextResource m52393e(AbstractC14209u0 error) {
        if (error instanceof AbstractC14209u0.a) {
            return new TextResource.C8688b(AbstractC38022b.f162881V, null, 2, null);
        }
        if (error instanceof AbstractC14209u0.b) {
            return new TextResource.C8688b(AbstractC38022b.f162880U, null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x002a A[RETURN] */
    /* JADX INFO: renamed from: f */
    private final EnumC16313m0 m52394f(EnumC3920d buttonState, String currentScreenIcon, boolean isInGoogleHealthConnectedState) {
        if (buttonState == EnumC3920d.ERROR) {
            return EnumC16313m0.UNDO;
        }
        if (isInGoogleHealthConnectedState) {
            return EnumC16313m0.CHECKMARK;
        }
        EnumC16313m0 enumC16313m0 = EnumC16313m0.ARROW_FORWARD;
        for (EnumC16313m0 enumC16313m1 : EnumC16313m0.values()) {
            if (AbstractC22676k.m65745e(enumC16313m1.name(), currentScreenIcon)) {
                if (enumC16313m1 == null) {
                    return enumC16313m0;
                }
                return enumC16313m1;
            }
        }
        enumC16313m1 = null;
        if (enumC16313m1 == null) {
            return enumC16313m0;
        }
        return enumC16313m1;
    }

    /* JADX INFO: renamed from: g */
    private final EnumC3920d m52395g(ActivationFlowStepModel currentScreen, ProgressButtonModel.ButtonType initialType, InterfaceC25188b paymentsDomainResult, boolean isProgressButtonError, boolean isProgressButtonLoading, boolean isInGoogleHealthConnectedState) {
        int i13;
        if ((!(currentScreen instanceof PrivacyConsentModel) || !(paymentsDomainResult instanceof InterfaceC25188b.d)) && !isProgressButtonLoading && !(paymentsDomainResult instanceof InterfaceC25188b.b)) {
            if (!(paymentsDomainResult instanceof InterfaceC25188b.e) && !isProgressButtonError) {
                if (!isInGoogleHealthConnectedState && (i13 = a.f70791a[initialType.ordinal()]) != 1) {
                    if (i13 == 2) {
                        return EnumC3920d.PROGRESS;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return EnumC3920d.FILLED;
            }
            return EnumC3920d.ERROR;
        }
        return EnumC3920d.LOADING;
    }

    /* JADX INFO: renamed from: h */
    private final ProgressButtonModel.ButtonStyle m52396h(ProgressButtonModel.ButtonStyle initialStyle, EnumC3920d updatedState, boolean isInGoogleHealthConnectedState) {
        if (updatedState == EnumC3920d.ERROR) {
            return ProgressButtonModel.ButtonStyle.ERROR;
        }
        return isInGoogleHealthConnectedState ? ProgressButtonModel.ButtonStyle.SUCCESS : initialStyle;
    }

    /* JADX INFO: renamed from: i */
    private final TextResource m52397i(TextResource initialTextResource, EnumC3920d updatedState, ActivationFlowStepModel currentScreen, boolean isInGoogleHealthConnectedState) {
        EnumC3920d enumC3920d = EnumC3920d.LOADING;
        if (updatedState == enumC3920d && (currentScreen instanceof PaymentMethodStepModel)) {
            return AbstractC8693b.m21277k(AbstractC38022b.f162895f);
        }
        if (updatedState == enumC3920d) {
            return AbstractC8693b.m21277k(AbstractC38022b.f162894e);
        }
        if (updatedState == EnumC3920d.ERROR) {
            return AbstractC8693b.m21277k(AbstractC38022b.f162896g);
        }
        return isInGoogleHealthConnectedState ? AbstractC8693b.m21277k(AbstractC38022b.f162892d) : initialTextResource;
    }

    /* JADX INFO: renamed from: d */
    public final TextResource m52398d(EnumC14195n0 loginErrorType) {
        int i13 = loginErrorType == null ? -1 : a.f70792b[loginErrorType.ordinal()];
        if (i13 == 1) {
            return new TextResource.C8688b(AbstractC38022b.f162864E, null, 2, null);
        }
        if (i13 == 2) {
            return new TextResource.C8688b(AbstractC38022b.f162867H, null, 2, null);
        }
        if (i13 != 3) {
            return null;
        }
        return new TextResource.C8688b(AbstractC38022b.f162870K, null, 2, null);
    }

    /* JADX INFO: renamed from: j */
    public final C3927k m52399j(ActivationFlowStepModel currentScreen, int totalCount, int filledCount, InterfaceC25188b paymentsDomainResult, boolean isProgressButtonError, boolean isProgressButtonLoading, boolean hasConnectedGoogleHealth, EnumC14195n0 loginErrorType, boolean shouldDismissErrorMessage, AbstractC14209u0 passwordPolicyError) {
        AbstractC22676k.m65750j(currentScreen, "currentScreen");
        AbstractC22676k.m65750j(paymentsDomainResult, "paymentsDomainResult");
        ProgressButtonModel progressCircle = currentScreen.getProgressCircle();
        if (progressCircle == null) {
            return null;
        }
        boolean z4 = hasConnectedGoogleHealth && (currentScreen instanceof HealthConnectStepModel);
        EnumC3920d enumC3920dM52395g = m52395g(currentScreen, progressCircle.getButtonType(), paymentsDomainResult, isProgressButtonError, isProgressButtonLoading, z4);
        C23465k c23465kM52390a = m52390a(m52396h(progressCircle.getStyle(), enumC3920dM52395g, z4));
        return new C3927k(enumC3920dM52395g, m52397i(progressCircle.getText(), enumC3920dM52395g, currentScreen, z4), null, m52391b(currentScreen, paymentsDomainResult, loginErrorType, shouldDismissErrorMessage, passwordPolicyError), null, m52394f(enumC3920dM52395g, progressCircle.getIcon(), z4), totalCount, filledCount, null, false, !(currentScreen instanceof WelcomeTransitionStepModel), (InterfaceC39332e) c23465kM52390a.f92937w, (AbstractC17911t) c23465kM52390a.f92938x, m52392c(progressCircle.getIconColor(), z4), null, null, null, 115476, null);
    }
}
