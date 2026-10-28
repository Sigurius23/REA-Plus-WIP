package b20;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v17 b20.d[], still in use, count: 1, list:
  (r0v17 b20.d[]) from 0x00df: INVOKE (r0v17 b20.d[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: b20.d */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC2324d implements InterfaceC2322b {
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_SUCCESS("elements.customer_sheet.elements_session.load_success"),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_SUCCESS("elements.customer_sheet.customer_session.elements_session.load_success"),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_SUCCESS("elements.customer_sheet.payment_methods.load_success"),
    GET_SAVED_PAYMENT_METHODS_SUCCESS("elements.customer_repository.get_saved_payment_methods_success"),
    PLACES_FIND_AUTOCOMPLETE_SUCCESS("address_element.find_autocomplete.success"),
    PLACES_FETCH_PLACE_SUCCESS("address_element.fetch_place.success"),
    LINK_CREATE_CARD_SUCCESS("link.create_new_card.success"),
    LINK_LOG_OUT_SUCCESS("link.log_out.success"),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_SUCCESS("elements.customer_sheet.payment_methods.refresh_success"),
    EXTERNAL_PAYMENT_METHODS_LAUNCH_SUCCESS("paymentsheet.external_payment_method.launch_success"),
    CUSTOM_PAYMENT_METHODS_LAUNCH_SUCCESS("paymentsheet.custom_payment_method.launch_success"),
    FOUND_CREATE_INTENT_CALLBACK_WHILE_POLLING("paymentsheet.polling_for_create_intent_callback.found"),
    FOUND_CREATE_INTENT_WITH_CONFIRMATION_TOKEN_CALLBACK_WHILE_POLLING("paymentsheet.polling_for_create_intent_with_confirmation_token_callback.found"),
    FOUND_PREPARE_PAYMENT_METHOD_HANDLER_WHILE_POLLING("paymentsheet.polling_for_prepare_payment_method_handler.found"),
    /* JADX INFO: Fake field, exist only in values array */
    TAP_TO_ADD_DISCOVER_READERS_CALL_SUCCESS("elements.tap_to_add.discover_readers_call.success"),
    /* JADX INFO: Fake field, exist only in values array */
    TAP_TO_ADD_CONNECT_READER_CALL_SUCCESS("elements.tap_to_add.connect_reader_call.success"),
    /* JADX INFO: Fake field, exist only in values array */
    FOUND_CREATE_CARD_PRESENT_SETUP_INTENT_CALLBACK_WHILE_POLLING("elements.tap_to_add.polling_for_create_card_present_setup_intent_callback.success");


    /* JADX INFO: renamed from: w */
    public final String f9197w;

    static {
        AbstractC15751g.m44468u(enumC2324dArr);
    }

    public EnumC2324d(String str) {
        super(str, i);
        this.f9197w = str;
    }

    public static EnumC2324d valueOf(String str) {
        return (EnumC2324d) Enum.valueOf(EnumC2324d.class, str);
    }

    public static EnumC2324d[] values() {
        return (EnumC2324d[]) f9193L.clone();
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        return this.f9197w;
    }
}
