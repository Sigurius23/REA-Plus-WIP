package com.whoop.activation.domain;

import com.whoop.activation.domain.models.AccountTransitionLegacyAfterActivationResponse;
import com.whoop.activation.domain.models.ActivationBody;
import com.whoop.activation.domain.models.ActivationFlowActivateResponse;
import com.whoop.activation.domain.models.ActivationFlowCreateAccountResponse;
import com.whoop.activation.domain.models.AfterActivationFinalScreensResponse;
import com.whoop.activation.domain.models.AlAfterActivationResponse;
import com.whoop.activation.domain.models.AlPermissionsBody;
import com.whoop.activation.domain.models.AlPermissionsResponse;
import com.whoop.activation.domain.models.AlProfileResponse;
import com.whoop.activation.domain.models.FinishAccountCreationBody;
import com.whoop.activation.domain.models.HwOnlyAfterActivationResponse;
import com.whoop.activation.domain.models.HwOnlyPermissionsBody;
import com.whoop.activation.domain.models.HwOnlyPermissionsResponse;
import com.whoop.activation.domain.models.HwOnlyProfileResponse;
import com.whoop.activation.domain.models.MedicareAfterActivationResponse;
import com.whoop.activation.domain.models.MedicarePermissionsBody;
import com.whoop.activation.domain.models.MedicarePermissionsResponse;
import com.whoop.activation.domain.models.PostAccountInfoResponse;
import com.whoop.activation.domain.models.PostPairingEmailResponse;
import com.whoop.activation.domain.models.UpsertProfileBody;
import com.whoop.navigation.C9598e;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37278i;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006J$\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0019\u0010\u0006J(\u0010\u001d\u001a\u00020\u001c2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH§@¢\u0006\u0004\b \u0010!J\u001c\u0010#\u001a\u00020\"2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b#\u0010\u0006J&\u0010&\u001a\u00020\u00112\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010%\u001a\u00020$H§@¢\u0006\u0004\b&\u0010'J\u001c\u0010)\u001a\u00020(2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b)\u0010\u0006J\u001c\u0010+\u001a\u00020*2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b+\u0010\u0006J&\u0010-\u001a\u00020\u00112\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010%\u001a\u00020,H§@¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/H§@¢\u0006\u0004\b0\u0010!J\u001c\u00102\u001a\u0002012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b2\u0010\u0006J(\u00105\u001a\u0002042\n\b\u0001\u00103\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b5\u0010\u001eJ\u0010\u00107\u001a\u000206H§@¢\u0006\u0004\b7\u0010!J\u001a\u00109\u001a\u00020\u00112\b\b\u0001\u0010%\u001a\u000208H§@¢\u0006\u0004\b9\u0010:J\u0010\u0010<\u001a\u00020;H§@¢\u0006\u0004\b<\u0010!J\u001c\u0010>\u001a\u00020=2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b>\u0010\u0006J(\u0010?\u001a\u00020\u001c2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b?\u0010\u001e¨\u0006@À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "", "", "strapSignature", "Lcom/whoop/activation/domain/models/ActivationFlowCreateAccountResponse;", "startAccountAuthenticated", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/activation/domain/models/ActivationFlowActivateResponse;", "activateAccount", "Lcom/whoop/activation/domain/models/ActivationBody;", "activationBody", "Lcom/whoop/activation/domain/models/PostAccountInfoResponse;", "postAccountInfo", "(Ljava/lang/String;Lcom/whoop/activation/domain/models/ActivationBody;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/activation/domain/models/UpsertProfileBody;", "upsertProfileBody", "Lpg3/v0;", "Ll83/a0;", "upsertUserProfile", "(Ljava/lang/String;Lcom/whoop/activation/domain/models/UpsertProfileBody;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/activation/domain/models/FinishAccountCreationBody;", "finishAccountCreationBody", "finishAccountCreation", "(Lcom/whoop/activation/domain/models/FinishAccountCreationBody;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/activation/domain/models/PostPairingEmailResponse;", "getPostPairingAuthScreens", "userId", "flow", "Lcom/whoop/navigation/e;", "fetchPostSignInDestination", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/activation/domain/models/HwOnlyProfileResponse;", "fetchHwOnlyProfile", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/activation/domain/models/HwOnlyPermissionsResponse;", "fetchHwOnlyPermissions", "Lcom/whoop/activation/domain/models/HwOnlyPermissionsBody;", "body", "putHwOnlyPermissions", "(Ljava/lang/String;Lcom/whoop/activation/domain/models/HwOnlyPermissionsBody;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/activation/domain/models/HwOnlyAfterActivationResponse;", "fetchHwOnlyAfterActivation", "Lcom/whoop/activation/domain/models/MedicarePermissionsResponse;", "fetchMedicarePermissions", "Lcom/whoop/activation/domain/models/MedicarePermissionsBody;", "putMedicarePermissions", "(Ljava/lang/String;Lcom/whoop/activation/domain/models/MedicarePermissionsBody;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/activation/domain/models/AlProfileResponse;", "fetchAlProfile", "Lcom/whoop/activation/domain/models/MedicareAfterActivationResponse;", "fetchMedicareAfterActivation", "source", "Lcom/whoop/activation/domain/models/AfterActivationFinalScreensResponse;", "fetchAfterActivationFinalScreens", "Lcom/whoop/activation/domain/models/AlPermissionsResponse;", "fetchAlPermissions", "Lcom/whoop/activation/domain/models/AlPermissionsBody;", "putAlPermissions", "(Lcom/whoop/activation/domain/models/AlPermissionsBody;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/activation/domain/models/AlAfterActivationResponse;", "fetchAlAfterActivation", "Lcom/whoop/activation/domain/models/AccountTransitionLegacyAfterActivationResponse;", "fetchAccountTransitionLegacyAfterActivation", "fetchAppDestination", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ActivationAuthenticatedApi {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ Object m17051a(ActivationAuthenticatedApi activationAuthenticatedApi, String str, String str2, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchPostSignInDestination");
        }
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        return activationAuthenticatedApi.fetchPostSignInDestination(str, str2, interfaceC30057d);
    }

    @InterfaceC37275f("onboarding-service/v1/account/activate")
    Object activateAccount(@InterfaceC37278i("X-WHOOP-Strap-Signature") String str, InterfaceC30057d<? super ActivationFlowActivateResponse> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/wearable-transition/legacy-after-activation")
    Object fetchAccountTransitionLegacyAfterActivation(@InterfaceC37278i("X-WHOOP-Strap-Signature") String str, InterfaceC30057d<? super AccountTransitionLegacyAfterActivationResponse> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/account/after-activation-final-screens")
    Object fetchAfterActivationFinalScreens(@InterfaceC37289t("source") String str, @InterfaceC37278i("X-WHOOP-Strap-Signature") String str2, InterfaceC30057d<? super AfterActivationFinalScreensResponse> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/advanced-labs/after-activation")
    Object fetchAlAfterActivation(InterfaceC30057d<? super AlAfterActivationResponse> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/advanced-labs/permissions")
    Object fetchAlPermissions(InterfaceC30057d<? super AlPermissionsResponse> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/advanced-labs/profile")
    Object fetchAlProfile(InterfaceC30057d<? super AlProfileResponse> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/app/destination")
    Object fetchAppDestination(@InterfaceC37278i("X-WHOOP-Strap-Signature") String str, @InterfaceC37289t("flow") String str2, InterfaceC30057d<? super C9598e> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/hw-only/after-activation")
    Object fetchHwOnlyAfterActivation(@InterfaceC37278i("X-WHOOP-Strap-Signature") String str, InterfaceC30057d<? super HwOnlyAfterActivationResponse> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/hw-only/permissions")
    Object fetchHwOnlyPermissions(@InterfaceC37278i("X-WHOOP-Strap-Signature") String str, InterfaceC30057d<? super HwOnlyPermissionsResponse> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/hw-only/profile")
    Object fetchHwOnlyProfile(InterfaceC30057d<? super HwOnlyProfileResponse> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/medicare/after-activation")
    Object fetchMedicareAfterActivation(@InterfaceC37278i("X-WHOOP-Strap-Signature") String str, InterfaceC30057d<? super MedicareAfterActivationResponse> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/medicare/permissions")
    Object fetchMedicarePermissions(@InterfaceC37278i("X-WHOOP-Strap-Signature") String str, InterfaceC30057d<? super MedicarePermissionsResponse> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/join/post-signin-destination")
    Object fetchPostSignInDestination(@InterfaceC37289t("userid") String str, @InterfaceC37289t("flow") String str2, InterfaceC30057d<? super C9598e> interfaceC30057d);

    @InterfaceC37285p("onboarding-service/v1/account/sign-up")
    Object finishAccountCreation(@InterfaceC37270a FinishAccountCreationBody finishAccountCreationBody, @InterfaceC37278i("X-WHOOP-Strap-Signature") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/account/post-pairing-auth")
    Object getPostPairingAuthScreens(@InterfaceC37278i("X-WHOOP-Strap-Signature") String str, InterfaceC30057d<? super PostPairingEmailResponse> interfaceC30057d);

    @InterfaceC37284o("onboarding-service/v1/account/activate")
    Object postAccountInfo(@InterfaceC37278i("X-WHOOP-Strap-Signature") String str, @InterfaceC37270a ActivationBody activationBody, InterfaceC30057d<? super PostAccountInfoResponse> interfaceC30057d);

    @InterfaceC37285p("onboarding-service/v1/advanced-labs/permissions")
    Object putAlPermissions(@InterfaceC37270a AlPermissionsBody alPermissionsBody, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    @InterfaceC37285p("onboarding-service/v1/hw-only/permissions")
    Object putHwOnlyPermissions(@InterfaceC37278i("X-WHOOP-Strap-Signature") String str, @InterfaceC37270a HwOnlyPermissionsBody hwOnlyPermissionsBody, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    @InterfaceC37285p("onboarding-service/v1/medicare/permissions")
    Object putMedicarePermissions(@InterfaceC37278i("X-WHOOP-Strap-Signature") String str, @InterfaceC37270a MedicarePermissionsBody medicarePermissionsBody, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/account/start-auth")
    Object startAccountAuthenticated(@InterfaceC37278i("X-WHOOP-Strap-Signature") String str, InterfaceC30057d<? super ActivationFlowCreateAccountResponse> interfaceC30057d);

    @InterfaceC37285p("onboarding-service/v1/account/profile")
    Object upsertUserProfile(@InterfaceC37278i("X-WHOOP-Strap-Signature") String str, @InterfaceC37270a UpsertProfileBody upsertProfileBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
