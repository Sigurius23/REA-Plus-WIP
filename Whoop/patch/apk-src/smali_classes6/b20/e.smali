.class public final enum Lb20/e;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lb20/b;


# static fields
.field public static final enum E:Lb20/e;

.field public static final enum F:Lb20/e;

.field public static final enum G:Lb20/e;

.field public static final enum H:Lb20/e;

.field public static final enum I:Lb20/e;

.field public static final enum J:Lb20/e;

.field public static final enum K:Lb20/e;

.field public static final enum L:Lb20/e;

.field public static final enum M:Lb20/e;

.field public static final enum N:Lb20/e;

.field public static final enum O:Lb20/e;

.field public static final enum P:Lb20/e;

.field public static final enum Q:Lb20/e;

.field public static final enum R:Lb20/e;

.field public static final enum S:Lb20/e;

.field public static final enum T:Lb20/e;

.field public static final enum U:Lb20/e;

.field public static final enum V:Lb20/e;

.field public static final enum W:Lb20/e;

.field public static final enum X:Lb20/e;

.field public static final enum Y:Lb20/e;

.field public static final enum Z:Lb20/e;

.field public static final enum a0:Lb20/e;

.field public static final enum b0:Lb20/e;

.field public static final enum c0:Lb20/e;

.field public static final synthetic d0:[Lb20/e;

.field public static final enum x:Lb20/e;

.field public static final enum y:Lb20/e;

.field public static final enum z:Lb20/e;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 40

    new-instance v1, Lb20/e;

    const/4 v0, 0x0

    const-string v2, "payments.auth_web_view.blank_client_secret"

    const-string v3, "AUTH_WEB_VIEW_BLANK_CLIENT_SECRET"

    invoke-direct {v1, v3, v0, v2}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lb20/e;->x:Lb20/e;

    new-instance v2, Lb20/e;

    const/4 v0, 0x1

    const-string v3, "payments.missing_hosted_voucher_url"

    const-string v4, "MISSING_HOSTED_VOUCHER_URL"

    invoke-direct {v2, v4, v0, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lb20/e;->y:Lb20/e;

    new-instance v3, Lb20/e;

    const/4 v0, 0x2

    const-string v4, "payments.missing_polling_authenticator"

    const-string v5, "MISSING_POLLING_AUTHENTICATOR"

    invoke-direct {v3, v5, v0, v4}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lb20/e;->z:Lb20/e;

    new-instance v4, Lb20/e;

    const/4 v0, 0x3

    const-string v5, "link.signup.failure.invalidSessionState"

    const-string v6, "LINK_INVALID_SESSION_STATE"

    invoke-direct {v4, v6, v0, v5}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lb20/e;->E:Lb20/e;

    new-instance v5, Lb20/e;

    const/4 v0, 0x4

    const-string v6, "google_pay_repository.is_ready_request_json_parsing_failure"

    const-string v7, "GOOGLE_PAY_JSON_REQUEST_PARSING"

    invoke-direct {v5, v7, v0, v6}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lb20/e;->F:Lb20/e;

    new-instance v6, Lb20/e;

    const/4 v0, 0x5

    const-string v7, "google_pay.confirm.unexpected_result"

    const-string v8, "GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT"

    invoke-direct {v6, v8, v0, v7}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lb20/e;->G:Lb20/e;

    new-instance v7, Lb20/e;

    const/4 v0, 0x6

    const-string v8, "google_pay.confirm.unexpected_status_code"

    const-string v9, "GOOGLE_PAY_UNEXPECTED_STATUS_CODE"

    invoke-direct {v7, v9, v0, v8}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lb20/e;->H:Lb20/e;

    new-instance v8, Lb20/e;

    const/4 v0, 0x7

    const-string v9, "google_pay.on_result.missing_data"

    const-string v10, "GOOGLE_PAY_MISSING_INTENT_DATA"

    invoke-direct {v8, v10, v0, v9}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Lb20/e;->I:Lb20/e;

    new-instance v9, Lb20/e;

    const/16 v0, 0x8

    const-string v10, "address_element.find_autocomplete.without_dependency"

    const-string v11, "FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY"

    invoke-direct {v9, v11, v0, v10}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v9, Lb20/e;->J:Lb20/e;

    new-instance v10, Lb20/e;

    const/16 v0, 0x9

    const-string v11, "address_element.fetch_place.without_dependency"

    const-string v12, "FETCH_PLACE_WITHOUT_DEPENDENCY"

    invoke-direct {v10, v12, v0, v11}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, Lb20/e;->K:Lb20/e;

    new-instance v11, Lb20/e;

    const/16 v0, 0xa

    const-string v12, "link.create_new_card.missing_link_account"

    const-string v13, "LINK_ATTACH_CARD_WITH_NULL_ACCOUNT"

    invoke-direct {v11, v13, v0, v12}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v11, Lb20/e;->L:Lb20/e;

    new-instance v12, Lb20/e;

    const/16 v0, 0xb

    const-string v13, "link.create_new_bank_account.missing_link_account"

    const-string v14, "LINK_ATTACH_BANK_ACCOUNT_WITH_NULL_ACCOUNT"

    invoke-direct {v12, v14, v0, v13}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, Lb20/e;->M:Lb20/e;

    new-instance v13, Lb20/e;

    const/16 v0, 0xc

    const-string v14, "link.web.result.parsing_failed"

    const-string v15, "LINK_WEB_FAILED_TO_PARSE_RESULT_URI"

    invoke-direct {v13, v15, v0, v14}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v13, Lb20/e;->N:Lb20/e;

    new-instance v14, Lb20/e;

    const/16 v0, 0xd

    const-string v15, "paymentsheet.authenticators.not_found"

    move-object/from16 v16, v1

    const-string v1, "PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND"

    invoke-direct {v14, v1, v0, v15}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v14, Lb20/e;->O:Lb20/e;

    new-instance v15, Lb20/e;

    const/16 v0, 0xe

    const-string v1, "paymentsheet.loader.elements_session.customer.not_found"

    move-object/from16 v17, v2

    const-string v2, "PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND"

    invoke-direct {v15, v2, v0, v1}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v15, Lb20/e;->P:Lb20/e;

    new-instance v0, Lb20/e;

    const/16 v1, 0xf

    const-string v2, "elements.external_payment_methods_serializer.error"

    move-object/from16 v18, v3

    const-string v3, "EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE"

    invoke-direct {v0, v3, v1, v2}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb20/e;->Q:Lb20/e;

    new-instance v1, Lb20/e;

    const/16 v2, 0x10

    const-string v3, "paymentsheet.no_payment_selection"

    move-object/from16 v19, v0

    const-string v0, "PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT"

    invoke-direct {v1, v0, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lb20/e;->R:Lb20/e;

    new-instance v0, Lb20/e;

    const/16 v2, 0x11

    const-string v3, "paymentsheet.invalid_payment_selection"

    move-object/from16 v20, v1

    const-string v1, "PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT"

    invoke-direct {v0, v1, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb20/e;->S:Lb20/e;

    new-instance v1, Lb20/e;

    const/16 v2, 0x12

    const-string v3, "flow_controller.invalid_payment_selection"

    move-object/from16 v21, v0

    const-string v0, "FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT"

    invoke-direct {v1, v0, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lb20/e;->T:Lb20/e;

    new-instance v0, Lb20/e;

    const/16 v2, 0x13

    const-string v3, "intent_confirmation_handler.invalid_payment_confirmation_option"

    move-object/from16 v22, v1

    const-string v1, "INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION"

    invoke-direct {v0, v1, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb20/e;->U:Lb20/e;

    new-instance v1, Lb20/e;

    const/16 v2, 0x14

    const-string v3, "paymentsheet.external_payment_method.unexpected_result_code"

    move-object/from16 v23, v0

    const-string v0, "EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE"

    invoke-direct {v1, v0, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lb20/e;->V:Lb20/e;

    new-instance v0, Lb20/e;

    const/16 v2, 0x15

    const-string v3, "customersheet.customer_session.attach_called"

    move-object/from16 v24, v1

    const-string v1, "CUSTOMER_SHEET_ATTACH_CALLED_WITH_CUSTOMER_SESSION"

    invoke-direct {v0, v1, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lb20/e;

    const/16 v2, 0x16

    const-string v3, "customersheet.customer_session.elements_session.no_customer_field"

    move-object/from16 v25, v0

    const-string v0, "CUSTOMER_SESSION_ON_CUSTOMER_SHEET_ELEMENTS_SESSION_NO_CUSTOMER_FIELD"

    invoke-direct {v1, v0, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Lb20/e;

    const/16 v2, 0x17

    const-string v3, "embedded.embedded_sheet_launcher.embedded_state_is_null"

    move-object/from16 v26, v1

    const-string v1, "EMBEDDED_SHEET_LAUNCHER_EMBEDDED_STATE_IS_NULL"

    invoke-direct {v0, v1, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lb20/e;

    const/16 v2, 0x18

    const-string v3, "wallet_buttons.wallet_arguments.null_on_confirm"

    move-object/from16 v27, v0

    const-string v0, "WALLET_BUTTONS_NULL_WALLET_ARGUMENTS_ON_CONFIRM"

    invoke-direct {v1, v0, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Lb20/e;

    const/16 v2, 0x19

    const-string v3, "wallet_buttons.confirmation_arguments.null_on_confirm"

    move-object/from16 v28, v1

    const-string v1, "WALLET_BUTTONS_NULL_CONFIRMATION_ARGS_ON_CONFIRM"

    invoke-direct {v0, v1, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lb20/e;

    const/16 v2, 0x1a

    const-string v3, "intent_confirmation_handler.passive_challenge.params_null"

    move-object/from16 v29, v0

    const-string v0, "INTENT_CONFIRMATION_HANDLER_PASSIVE_CHALLENGE_PARAMS_NULL"

    invoke-direct {v1, v0, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lb20/e;->W:Lb20/e;

    new-instance v0, Lb20/e;

    const/16 v2, 0x1b

    const-string v3, "intent_confirmation_handler.attestation.invoked_when_disabled"

    move-object/from16 v30, v1

    const-string v1, "INTENT_CONFIRMATION_HANDLER_ATTESTATION_INVOKED_WHEN_DISABLED"

    invoke-direct {v0, v1, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb20/e;->X:Lb20/e;

    new-instance v1, Lb20/e;

    const/16 v2, 0x1c

    const-string v3, "intent_confirmation_handler.attestation.failed_to_prepare"

    move-object/from16 v31, v0

    const-string v0, "INTENT_CONFIRMATION_HANDLER_ATTESTATION_FAILED_TO_PREPARE"

    invoke-direct {v1, v0, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lb20/e;->Y:Lb20/e;

    new-instance v0, Lb20/e;

    const/16 v2, 0x1d

    const-string v3, "intent_confirmation_challenge.failed_to_parse_success_callback_params"

    move-object/from16 v32, v1

    const-string v1, "INTENT_CONFIRMATION_CHALLENGE_FAILED_TO_PARSE_SUCCESS_CALLBACK_PARAMS"

    invoke-direct {v0, v1, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb20/e;->Z:Lb20/e;

    new-instance v1, Lb20/e;

    const/16 v2, 0x1e

    const-string v3, "intent_confirmation_challenge.failed_to_parse_error_callback_params"

    move-object/from16 v33, v0

    const-string v0, "INTENT_CONFIRMATION_CHALLENGE_FAILED_TO_PARSE_ERROR_CALLBACK_PARAMS"

    invoke-direct {v1, v0, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lb20/e;->a0:Lb20/e;

    new-instance v0, Lb20/e;

    const/16 v2, 0x1f

    const-string v3, "elements.captcha.passive.unexpected_failure"

    move-object/from16 v34, v1

    const-string v1, "HCAPTCHA_UNEXPECTED_FAILURE"

    invoke-direct {v0, v1, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb20/e;->b0:Lb20/e;

    new-instance v1, Lb20/e;

    const/16 v2, 0x20

    const-string v3, "paymentmethodmessaging.element.unable_to_parse_response"

    move-object/from16 v35, v0

    const-string v0, "PAYMENT_METHOD_MESSAGING_ELEMENT_UNABLE_TO_PARSE_RESPONSE"

    invoke-direct {v1, v0, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Lb20/e;

    const/16 v2, 0x21

    const-string v3, "customersheet.confirmation.no_payment_method_metadata"

    move-object/from16 v36, v1

    const-string v1, "CUSTOMER_SHEET_METADATA_NULL_ON_CONFIRM"

    invoke-direct {v0, v1, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb20/e;->c0:Lb20/e;

    new-instance v1, Lb20/e;

    const/16 v2, 0x22

    const-string v3, "elements.tap_to_add.location_permission_required_unexpectedly"

    move-object/from16 v37, v0

    const-string v0, "TAP_TO_ADD_LOCATION_PERMISSIONS_FAILURE"

    invoke-direct {v1, v0, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Lb20/e;

    const/16 v2, 0x23

    const-string v3, "elements.tap_to_add.no_reader_found"

    move-object/from16 v38, v1

    const-string v1, "TAP_TO_ADD_NO_READER_FOUND"

    invoke-direct {v0, v1, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lb20/e;

    const/16 v2, 0x24

    const-string v3, "elements.tap_to_add.no_generated_card_after_successful_intent_confirmation"

    move-object/from16 v39, v0

    const-string v0, "TAP_TO_ADD_NO_GENERATED_CARD_AFTER_SUCCESSFUL_INTENT_CONFIRMATION"

    invoke-direct {v1, v0, v2, v3}, Lb20/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    move-object/from16 v2, v37

    move-object/from16 v37, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v19

    move-object/from16 v19, v22

    move-object/from16 v22, v25

    move-object/from16 v25, v28

    move-object/from16 v28, v31

    move-object/from16 v31, v34

    move-object/from16 v34, v2

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    move-object/from16 v17, v20

    move-object/from16 v18, v21

    move-object/from16 v20, v23

    move-object/from16 v21, v24

    move-object/from16 v23, v26

    move-object/from16 v24, v27

    move-object/from16 v26, v29

    move-object/from16 v27, v30

    move-object/from16 v29, v32

    move-object/from16 v30, v33

    move-object/from16 v32, v35

    move-object/from16 v33, v36

    move-object/from16 v35, v38

    move-object/from16 v36, v39

    filled-new-array/range {v1 .. v37}, [Lb20/e;

    move-result-object v0

    sput-object v0, Lb20/e;->d0:[Lb20/e;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lb20/e;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb20/e;
    .locals 1

    const-class v0, Lb20/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb20/e;

    return-object p0
.end method

.method public static values()[Lb20/e;
    .locals 1

    sget-object v0, Lb20/e;->d0:[Lb20/e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb20/e;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lb20/e;->w:Ljava/lang/String;

    const-string v1, "unexpected_error."

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
