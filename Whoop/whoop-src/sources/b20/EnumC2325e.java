package b20;

import ge3.AbstractC15751g;
import p000.AbstractC11266d;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v37 b20.e[], still in use, count: 1, list:
  (r0v37 b20.e[]) from 0x0231: INVOKE (r0v37 b20.e[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: b20.e */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC2325e implements InterfaceC2322b {
    AUTH_WEB_VIEW_BLANK_CLIENT_SECRET("payments.auth_web_view.blank_client_secret"),
    MISSING_HOSTED_VOUCHER_URL("payments.missing_hosted_voucher_url"),
    MISSING_POLLING_AUTHENTICATOR("payments.missing_polling_authenticator"),
    LINK_INVALID_SESSION_STATE("link.signup.failure.invalidSessionState"),
    GOOGLE_PAY_JSON_REQUEST_PARSING("google_pay_repository.is_ready_request_json_parsing_failure"),
    GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT("google_pay.confirm.unexpected_result"),
    GOOGLE_PAY_UNEXPECTED_STATUS_CODE("google_pay.confirm.unexpected_status_code"),
    GOOGLE_PAY_MISSING_INTENT_DATA("google_pay.on_result.missing_data"),
    FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY("address_element.find_autocomplete.without_dependency"),
    FETCH_PLACE_WITHOUT_DEPENDENCY("address_element.fetch_place.without_dependency"),
    LINK_ATTACH_CARD_WITH_NULL_ACCOUNT("link.create_new_card.missing_link_account"),
    LINK_ATTACH_BANK_ACCOUNT_WITH_NULL_ACCOUNT("link.create_new_bank_account.missing_link_account"),
    LINK_WEB_FAILED_TO_PARSE_RESULT_URI("link.web.result.parsing_failed"),
    PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND("paymentsheet.authenticators.not_found"),
    PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND("paymentsheet.loader.elements_session.customer.not_found"),
    EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE("elements.external_payment_methods_serializer.error"),
    PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT("paymentsheet.no_payment_selection"),
    PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT("paymentsheet.invalid_payment_selection"),
    FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT("flow_controller.invalid_payment_selection"),
    INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION("intent_confirmation_handler.invalid_payment_confirmation_option"),
    EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE("paymentsheet.external_payment_method.unexpected_result_code"),
    /* JADX INFO: Fake field, exist only in values array */
    WALLET_BUTTONS_NULL_CONFIRMATION_ARGS_ON_CONFIRM("customersheet.customer_session.attach_called"),
    /* JADX INFO: Fake field, exist only in values array */
    PAYMENT_METHOD_MESSAGING_ELEMENT_UNABLE_TO_PARSE_RESPONSE("customersheet.customer_session.elements_session.no_customer_field"),
    /* JADX INFO: Fake field, exist only in values array */
    WALLET_BUTTONS_NULL_CONFIRMATION_ARGS_ON_CONFIRM("embedded.embedded_sheet_launcher.embedded_state_is_null"),
    /* JADX INFO: Fake field, exist only in values array */
    PAYMENT_METHOD_MESSAGING_ELEMENT_UNABLE_TO_PARSE_RESPONSE("wallet_buttons.wallet_arguments.null_on_confirm"),
    /* JADX INFO: Fake field, exist only in values array */
    WALLET_BUTTONS_NULL_CONFIRMATION_ARGS_ON_CONFIRM("wallet_buttons.confirmation_arguments.null_on_confirm"),
    INTENT_CONFIRMATION_HANDLER_PASSIVE_CHALLENGE_PARAMS_NULL("intent_confirmation_handler.passive_challenge.params_null"),
    INTENT_CONFIRMATION_HANDLER_ATTESTATION_INVOKED_WHEN_DISABLED("intent_confirmation_handler.attestation.invoked_when_disabled"),
    INTENT_CONFIRMATION_HANDLER_ATTESTATION_FAILED_TO_PREPARE("intent_confirmation_handler.attestation.failed_to_prepare"),
    INTENT_CONFIRMATION_CHALLENGE_FAILED_TO_PARSE_SUCCESS_CALLBACK_PARAMS("intent_confirmation_challenge.failed_to_parse_success_callback_params"),
    INTENT_CONFIRMATION_CHALLENGE_FAILED_TO_PARSE_ERROR_CALLBACK_PARAMS("intent_confirmation_challenge.failed_to_parse_error_callback_params"),
    HCAPTCHA_UNEXPECTED_FAILURE("elements.captcha.passive.unexpected_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    PAYMENT_METHOD_MESSAGING_ELEMENT_UNABLE_TO_PARSE_RESPONSE("paymentmethodmessaging.element.unable_to_parse_response"),
    CUSTOMER_SHEET_METADATA_NULL_ON_CONFIRM("customersheet.confirmation.no_payment_method_metadata"),
    /* JADX INFO: Fake field, exist only in values array */
    TAP_TO_ADD_LOCATION_PERMISSIONS_FAILURE("elements.tap_to_add.location_permission_required_unexpectedly"),
    /* JADX INFO: Fake field, exist only in values array */
    TAP_TO_ADD_NO_READER_FOUND("elements.tap_to_add.no_reader_found"),
    /* JADX INFO: Fake field, exist only in values array */
    TAP_TO_ADD_NO_GENERATED_CARD_AFTER_SUCCESSFUL_INTENT_CONFIRMATION("elements.tap_to_add.no_generated_card_after_successful_intent_confirmation");


    /* JADX INFO: renamed from: w */
    public final String f9227w;

    static {
        AbstractC15751g.m44468u(enumC2325eArr);
    }

    public EnumC2325e(String str) {
        super(str, i);
        this.f9227w = str;
    }

    public static EnumC2325e valueOf(String str) {
        return (EnumC2325e) Enum.valueOf(EnumC2325e.class, str);
    }

    public static EnumC2325e[] values() {
        return (EnumC2325e[]) f9223d0.clone();
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        return AbstractC11266d.m30461o("unexpected_error.", this.f9227w);
    }
}
