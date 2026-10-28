package com.stripe.android.networking;

import androidx.annotation.Keep;
import ge3.AbstractC15751g;
import p000.AbstractC11266d;
import p664yy.InterfaceC39847a;
import p715kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v67 com.stripe.android.networking.PaymentAnalyticsEvent[], still in use, count: 1, list:
  (r0v67 com.stripe.android.networking.PaymentAnalyticsEvent[]) from 0x0419: INVOKE (r0v67 com.stripe.android.networking.PaymentAnalyticsEvent[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsEvent;", "Lyy/a;", "", "", "toString", "()Ljava/lang/String;", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class PaymentAnalyticsEvent implements InterfaceC39847a {
    TokenCreate("token_creation"),
    ConfirmationTokenCreate("confirmation_token_creation"),
    PaymentMethodCreate("payment_method_creation"),
    PaymentMethodUpdate("payment_method_update"),
    CustomerRetrieve("retrieve_customer"),
    CustomerRetrievePaymentMethods("retrieve_payment_methods"),
    /* JADX INFO: Fake field, exist only in values array */
    CustomerAttachPaymentMethod("attach_payment_method"),
    CustomerDetachPaymentMethod("detach_payment_method"),
    /* JADX INFO: Fake field, exist only in values array */
    CustomerDeleteSource("delete_source"),
    /* JADX INFO: Fake field, exist only in values array */
    CustomerSetShippingInfo("set_shipping_info"),
    /* JADX INFO: Fake field, exist only in values array */
    CustomerAddSource("add_source"),
    /* JADX INFO: Fake field, exist only in values array */
    CustomerSetDefaultSource("default_source"),
    /* JADX INFO: Fake field, exist only in values array */
    IssuingRetrievePin("issuing_retrieve_pin"),
    /* JADX INFO: Fake field, exist only in values array */
    IssuingUpdatePin("issuing_update_pin"),
    /* JADX INFO: Fake field, exist only in values array */
    SourceCreate("source_creation"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayLauncherInit("retrieve_source"),
    PaymentIntentConfirm("payment_intent_confirmation"),
    PaymentIntentRetrieve("payment_intent_retrieval"),
    /* JADX INFO: Fake field, exist only in values array */
    AuthSourceRedirect("payment_intent_retrieval_ordered"),
    PaymentIntentCancelSource("payment_intent_cancel_source"),
    PaymentIntentRefresh("payment_intent_refresh"),
    SetupIntentConfirm("setup_intent_confirmation"),
    SetupIntentRetrieve("setup_intent_retrieval"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayLauncherInit("setup_intent_retrieval_ordered"),
    SetupIntentCancelSource("setup_intent_cancel_source"),
    SetupIntentRefresh("setup_intent_refresh"),
    PaymentLauncherConfirmStarted("paymenthandler.confirm.started"),
    PaymentLauncherConfirmFinished("paymenthandler.confirm.finished"),
    PaymentLauncherNextActionStarted("paymenthandler.handle_next_action.started"),
    PaymentLauncherNextActionFinished("paymenthandler.handle_next_action.finished"),
    /* JADX INFO: Fake field, exist only in values array */
    AuthSourceRedirect("create_file"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayLauncherInit("3ds1_sdk"),
    Auth3ds1ChallengeStart("3ds1_challenge_start"),
    Auth3ds1ChallengeError("3ds1_challenge_error"),
    Auth3ds1ChallengeComplete("3ds1_challenge_complete"),
    AuthWithWebView("auth_with_webview"),
    AuthWithCustomTabs("auth_with_customtabs"),
    AuthWithDefaultBrowser("auth_with_defaultbrowser"),
    ConfirmReturnUrlNull("confirm_returnurl_null"),
    ConfirmReturnUrlDefault("confirm_returnurl_default"),
    ConfirmReturnUrlCustom("confirm_returnurl_custom"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayLauncherInit("retrieve_fpx_bank_statuses"),
    /* JADX INFO: Fake field, exist only in values array */
    AuthSourceRedirect("retrieve_stripe_url"),
    Auth3ds2RequestParamsFailed("3ds2_authentication_request_params_failed"),
    Auth3ds2Fingerprint("3ds2_fingerprint"),
    Auth3ds2Start("3ds2_authenticate"),
    Auth3ds2Frictionless("3ds2_frictionless_flow"),
    Auth3ds2ChallengePresented("3ds2_challenge_flow_presented"),
    Auth3ds2ChallengeCanceled("3ds2_challenge_flow_canceled"),
    Auth3ds2ChallengeCompleted("3ds2_challenge_flow_completed"),
    Auth3ds2ChallengeErrored("3ds2_challenge_flow_errored"),
    Auth3ds2ChallengeTimedOut("3ds2_challenge_flow_timed_out"),
    Auth3ds2Fallback("3ds2_fallback"),
    AuthRedirect("url_redirect_next_action"),
    /* JADX INFO: Fake field, exist only in values array */
    AuthSourceRedirect("auth_error"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayLauncherInit("auth_source_start"),
    /* JADX INFO: Fake field, exist only in values array */
    AuthSourceRedirect("auth_source_redirect"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayLauncherInit("auth_source_result"),
    RadarSessionCreate("radar_session_create"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayLauncherInit("googlepaylauncher_init"),
    GooglePayPaymentMethodLauncherInit("googlepaypaymentmethodlauncher_init"),
    CardMetadataPublishableKeyAvailable("card_metadata_pk_available"),
    CardMetadataPublishableKeyUnavailable("card_metadata_pk_unavailable"),
    CardMetadataLoadedTooSlow("card_metadata_loaded_too_slow"),
    CardMetadataLoadFailure("card_metadata_load_failure"),
    CardMetadataMissingRange("card_metadata_missing_range"),
    CardMetadataExpectedExtraDigitsButUserEntered16ThenSwitchedFields("card_metadata.expected_extra_digits_but_user_entered_16_then_switched_fields");


    /* JADX INFO: renamed from: w */
    public final String f22322w;

    static {
        AbstractC15751g.m44468u(paymentAnalyticsEventArr);
    }

    public PaymentAnalyticsEvent(String str) {
        super(str, i);
        this.f22322w = str;
    }

    public static PaymentAnalyticsEvent valueOf(String str) {
        return (PaymentAnalyticsEvent) Enum.valueOf(PaymentAnalyticsEvent.class, str);
    }

    public static PaymentAnalyticsEvent[] values() {
        return (PaymentAnalyticsEvent[]) f22318w0.clone();
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        return toString();
    }

    @Override // java.lang.Enum
    @Keep
    public String toString() {
        return AbstractC11266d.m30461o("stripe_android.", this.f22322w);
    }
}
