package com.whoop.activation.domain;

import androidx.core.app.NotificationCompat;
import com.whoop.activation.domain.models.ActivationFlowConsentsResponse;
import com.whoop.activation.domain.models.ActivationFlowCreateAccountResponse;
import com.whoop.activation.domain.models.ActivationFlowDeviceEducationResponse;
import com.whoop.activation.domain.models.ActivationFlowSignupBody;
import com.whoop.activation.domain.models.EmailCheckRequest;
import com.whoop.activation.domain.models.EmailCheckResponse;
import com.whoop.activation.domain.models.InAppJoinFlowCountryResponse;
import com.whoop.activation.domain.models.InAppJoinFlowResponse;
import com.whoop.activation.domain.models.InAppJoinFlowSignUpRequest;
import com.whoop.activation.domain.models.PostPairingEmailResponse;
import com.whoop.domain.model.AuthMaterial;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37278i;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0010J\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010\u001f\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001f\u0010\u0010J\u001a\u0010!\u001a\u00020\n2\b\b\u0001\u0010\u0017\u001a\u00020 H§@¢\u0006\u0004\b!\u0010\"¨\u0006#À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/activation/domain/ActivationApi;", "", "", NotificationCompat.CATEGORY_EMAIL, "strapSignature", "Lcom/whoop/activation/domain/models/ActivationFlowCreateAccountResponse;", "startAccount", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;", "signupBody", "Lcom/whoop/domain/model/AuthMaterial;", "signUp", "(Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "region", "Lcom/whoop/activation/domain/models/ActivationFlowConsentsResponse;", "consents", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/activation/domain/models/ActivationFlowDeviceEducationResponse;", "getDeviceEducation", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/activation/domain/models/PostPairingEmailResponse;", "getPostPairingScreens", "Lcom/whoop/activation/domain/models/EmailCheckRequest;", "request", "Lcom/whoop/activation/domain/models/EmailCheckResponse;", "checkEmail", "(Lcom/whoop/activation/domain/models/EmailCheckRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/activation/domain/models/InAppJoinFlowResponse;", "fetchInAppJoinFlowV2", "Lcom/whoop/activation/domain/models/InAppJoinFlowCountryResponse;", "fetchInAppJoinFlowCountryV2", "fetchInAppJoinFlowCreateAccount", "Lcom/whoop/activation/domain/models/InAppJoinFlowSignUpRequest;", "joinSignUp", "(Lcom/whoop/activation/domain/models/InAppJoinFlowSignUpRequest;Lq83/d;)Ljava/lang/Object;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ActivationApi {
    @InterfaceC37284o("onboarding-service/v2/emails/check")
    Object checkEmail(@InterfaceC37270a EmailCheckRequest emailCheckRequest, InterfaceC30057d<? super EmailCheckResponse> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v2/consents")
    Object consents(@InterfaceC37289t("region") String str, InterfaceC30057d<? super ActivationFlowConsentsResponse> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v2/join/country")
    Object fetchInAppJoinFlowCountryV2(InterfaceC30057d<? super InAppJoinFlowCountryResponse> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v2/join/create-account")
    Object fetchInAppJoinFlowCreateAccount(@InterfaceC37289t(NotificationCompat.CATEGORY_EMAIL) String str, InterfaceC30057d<? super ActivationFlowCreateAccountResponse> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v2/join/email-screen")
    Object fetchInAppJoinFlowV2(InterfaceC30057d<? super InAppJoinFlowResponse> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/account/device-education")
    Object getDeviceEducation(InterfaceC30057d<? super ActivationFlowDeviceEducationResponse> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/account/post-pairing")
    Object getPostPairingScreens(@InterfaceC37278i("X-WHOOP-Strap-Signature") String str, InterfaceC30057d<? super PostPairingEmailResponse> interfaceC30057d);

    @InterfaceC37284o("onboarding-service/v1/join/sign-up")
    Object joinSignUp(@InterfaceC37270a InAppJoinFlowSignUpRequest inAppJoinFlowSignUpRequest, InterfaceC30057d<? super AuthMaterial> interfaceC30057d);

    @InterfaceC37284o("onboarding-service/v1/account/sign-up")
    Object signUp(@InterfaceC37270a ActivationFlowSignupBody activationFlowSignupBody, @InterfaceC37278i("X-WHOOP-Strap-Signature") String str, InterfaceC30057d<? super AuthMaterial> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/account/start")
    Object startAccount(@InterfaceC37289t(NotificationCompat.CATEGORY_EMAIL) String str, @InterfaceC37278i("X-WHOOP-Strap-Signature") String str2, InterfaceC30057d<? super ActivationFlowCreateAccountResponse> interfaceC30057d);
}
