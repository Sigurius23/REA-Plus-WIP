package b20;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v34 b20.c[], still in use, count: 1, list:
  (r0v34 b20.c[]) from 0x0200: INVOKE (r0v34 b20.c[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: b20.c */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC2323c implements InterfaceC2322b {
    AUTH_WEB_VIEW_FAILURE("payments.auth_web_view.failure"),
    AUTH_WEB_VIEW_NULL_ARGS("payments.auth_web_view.null_args"),
    GET_SAVED_PAYMENT_METHODS_FAILURE("elements.customer_repository.get_saved_payment_methods_failure"),
    GOOGLE_PAY_IS_READY_API_CALL("elements.google_pay_repository.is_ready_request_api_call_failure"),
    GOOGLE_PAY_IS_READY_TIMEOUT("elements.google_pay_repository.is_ready_timeout"),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE("elements.customer_sheet.elements_session.load_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_FAILURE("elements.customer_sheet.customer_session.elements_session.load_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE("elements.customer_sheet.payment_methods.load_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE("elements.customer_sheet.payment_methods.refresh_failure"),
    CUSTOMER_SHEET_ADAPTER_NOT_FOUND("elements.customer_sheet.customer_adapter.not_found"),
    PLACES_FIND_AUTOCOMPLETE_ERROR("address_element.find_autocomplete.error"),
    PLACES_FETCH_PLACE_ERROR("address_element.fetch_place.error"),
    LINK_CREATE_PAYMENT_DETAILS_FAILURE("link.create_new_card.create_payment_details_failure"),
    LINK_SHARE_CARD_FAILURE("link.create_new_card.share_payment_details_failure"),
    LINK_LOG_OUT_FAILURE("link.log_out.failure"),
    LINK_NATIVE_FAILED_TO_GET_INTEGRITY_TOKEN("link.native.failed_to_get_integrity_token"),
    LINK_NATIVE_FAILED_TO_ATTEST_REQUEST("link.native.failed_to_attest_request"),
    LINK_NATIVE_FAILED_TO_PREPARE_INTEGRITY_MANAGER("link.native.integrity.preparation_failed"),
    PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS("payments.paymentlauncherconfirmation.null_args"),
    PAYMENT_LAUNCHER_CONFIRMATION_INVALID_ARGS("payments.paymentlauncherconfirmation.invalid_args"),
    BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND("payments.browserlauncher.activity_not_found"),
    BROWSER_LAUNCHER_NULL_ARGS("payments.browserlauncher.null_args"),
    GOOGLE_PAY_SKIPPED_DURING_LOAD("google_pay.skipped_during_load"),
    GOOGLE_PAY_FAILED("google_pay.confirm.error"),
    FRAUD_DETECTION_API_FAILURE("fraud_detection_data_repository.api_failure"),
    SAVED_PAYMENT_METHOD_RADAR_SESSION_FAILURE("stripe_android.saved_payment_method_radar_session_failure"),
    EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL("paymentsheet.external_payment_method.confirm_handler_is_null"),
    CUSTOM_PAYMENT_METHOD_CONFIRM_HANDLER_NULL("paymentsheet.custom_payment_method.confirm_handler_is_null"),
    CREATE_INTENT_CALLBACK_NULL("paymentsheet.create_intent_callback.is_null"),
    PREPARE_PAYMENT_METHOD_HANDLER_NULL("paymentsheet.prepare_payment_method_handler.is_null"),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_CARD_PRESENT_SETUP_INTENT_CALLBACK_NULL("elements.tap_to_add.create_card_present_setup_intent_callback.is_null"),
    HCAPTCHA_FAILURE("elements.captcha.passive.expected_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    TAP_TO_ADD_DISCOVER_READERS_CALL_FAILURE("elements.tap_to_add.discover_readers_call.failure"),
    /* JADX INFO: Fake field, exist only in values array */
    TAP_TO_ADD_CONNECT_READER_CALL_FAILURE("elements.tap_to_add.connect_reader_call.failure");


    /* JADX INFO: renamed from: w */
    public final String f9185w;

    static {
        AbstractC15751g.m44468u(enumC2323cArr);
    }

    public EnumC2323c(String str) {
        super(str, i);
        this.f9185w = str;
    }

    public static EnumC2323c valueOf(String str) {
        return (EnumC2323c) Enum.valueOf(EnumC2323c.class, str);
    }

    public static EnumC2323c[] values() {
        return (EnumC2323c[]) f9181c0.clone();
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        return this.f9185w;
    }
}
