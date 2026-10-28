.class public final enum Lb20/c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lb20/b;


# static fields
.field public static final enum E:Lb20/c;

.field public static final enum F:Lb20/c;

.field public static final enum G:Lb20/c;

.field public static final enum H:Lb20/c;

.field public static final enum I:Lb20/c;

.field public static final enum J:Lb20/c;

.field public static final enum K:Lb20/c;

.field public static final enum L:Lb20/c;

.field public static final enum M:Lb20/c;

.field public static final enum N:Lb20/c;

.field public static final enum O:Lb20/c;

.field public static final enum P:Lb20/c;

.field public static final enum Q:Lb20/c;

.field public static final enum R:Lb20/c;

.field public static final enum S:Lb20/c;

.field public static final enum T:Lb20/c;

.field public static final enum U:Lb20/c;

.field public static final enum V:Lb20/c;

.field public static final enum W:Lb20/c;

.field public static final enum X:Lb20/c;

.field public static final enum Y:Lb20/c;

.field public static final enum Z:Lb20/c;

.field public static final enum a0:Lb20/c;

.field public static final enum b0:Lb20/c;

.field public static final synthetic c0:[Lb20/c;

.field public static final enum x:Lb20/c;

.field public static final enum y:Lb20/c;

.field public static final enum z:Lb20/c;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 37

    new-instance v1, Lb20/c;

    const/4 v0, 0x0

    const-string v2, "payments.auth_web_view.failure"

    const-string v3, "AUTH_WEB_VIEW_FAILURE"

    invoke-direct {v1, v3, v0, v2}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lb20/c;->x:Lb20/c;

    new-instance v2, Lb20/c;

    const/4 v0, 0x1

    const-string v3, "payments.auth_web_view.null_args"

    const-string v4, "AUTH_WEB_VIEW_NULL_ARGS"

    invoke-direct {v2, v4, v0, v3}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lb20/c;->y:Lb20/c;

    new-instance v3, Lb20/c;

    const/4 v0, 0x2

    const-string v4, "elements.customer_repository.get_saved_payment_methods_failure"

    const-string v5, "GET_SAVED_PAYMENT_METHODS_FAILURE"

    invoke-direct {v3, v5, v0, v4}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lb20/c;->z:Lb20/c;

    new-instance v4, Lb20/c;

    const/4 v0, 0x3

    const-string v5, "elements.google_pay_repository.is_ready_request_api_call_failure"

    const-string v6, "GOOGLE_PAY_IS_READY_API_CALL"

    invoke-direct {v4, v6, v0, v5}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lb20/c;->E:Lb20/c;

    new-instance v5, Lb20/c;

    const/4 v0, 0x4

    const-string v6, "elements.google_pay_repository.is_ready_timeout"

    const-string v7, "GOOGLE_PAY_IS_READY_TIMEOUT"

    invoke-direct {v5, v7, v0, v6}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lb20/c;->F:Lb20/c;

    new-instance v6, Lb20/c;

    const/4 v0, 0x5

    const-string v7, "elements.customer_sheet.elements_session.load_failure"

    const-string v8, "CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE"

    invoke-direct {v6, v8, v0, v7}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v7, Lb20/c;

    const/4 v0, 0x6

    const-string v8, "elements.customer_sheet.customer_session.elements_session.load_failure"

    const-string v9, "CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_FAILURE"

    invoke-direct {v7, v9, v0, v8}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v8, Lb20/c;

    const/4 v0, 0x7

    const-string v9, "elements.customer_sheet.payment_methods.load_failure"

    const-string v10, "CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE"

    invoke-direct {v8, v10, v0, v9}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v9, Lb20/c;

    const/16 v0, 0x8

    const-string v10, "elements.customer_sheet.payment_methods.refresh_failure"

    const-string v11, "CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE"

    invoke-direct {v9, v11, v0, v10}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v10, Lb20/c;

    const/16 v0, 0x9

    const-string v11, "elements.customer_sheet.customer_adapter.not_found"

    const-string v12, "CUSTOMER_SHEET_ADAPTER_NOT_FOUND"

    invoke-direct {v10, v12, v0, v11}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, Lb20/c;->G:Lb20/c;

    new-instance v11, Lb20/c;

    const/16 v0, 0xa

    const-string v12, "address_element.find_autocomplete.error"

    const-string v13, "PLACES_FIND_AUTOCOMPLETE_ERROR"

    invoke-direct {v11, v13, v0, v12}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v11, Lb20/c;->H:Lb20/c;

    new-instance v12, Lb20/c;

    const/16 v0, 0xb

    const-string v13, "address_element.fetch_place.error"

    const-string v14, "PLACES_FETCH_PLACE_ERROR"

    invoke-direct {v12, v14, v0, v13}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, Lb20/c;->I:Lb20/c;

    new-instance v13, Lb20/c;

    const/16 v0, 0xc

    const-string v14, "link.create_new_card.create_payment_details_failure"

    const-string v15, "LINK_CREATE_PAYMENT_DETAILS_FAILURE"

    invoke-direct {v13, v15, v0, v14}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v13, Lb20/c;->J:Lb20/c;

    new-instance v14, Lb20/c;

    const/16 v0, 0xd

    const-string v15, "link.create_new_card.share_payment_details_failure"

    move-object/from16 v16, v1

    const-string v1, "LINK_SHARE_CARD_FAILURE"

    invoke-direct {v14, v1, v0, v15}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v14, Lb20/c;->K:Lb20/c;

    new-instance v15, Lb20/c;

    const/16 v0, 0xe

    const-string v1, "link.log_out.failure"

    move-object/from16 v17, v2

    const-string v2, "LINK_LOG_OUT_FAILURE"

    invoke-direct {v15, v2, v0, v1}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v15, Lb20/c;->L:Lb20/c;

    new-instance v0, Lb20/c;

    const/16 v1, 0xf

    const-string v2, "link.native.failed_to_get_integrity_token"

    move-object/from16 v18, v3

    const-string v3, "LINK_NATIVE_FAILED_TO_GET_INTEGRITY_TOKEN"

    invoke-direct {v0, v3, v1, v2}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb20/c;->M:Lb20/c;

    new-instance v1, Lb20/c;

    const/16 v2, 0x10

    const-string v3, "link.native.failed_to_attest_request"

    move-object/from16 v19, v0

    const-string v0, "LINK_NATIVE_FAILED_TO_ATTEST_REQUEST"

    invoke-direct {v1, v0, v2, v3}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lb20/c;->N:Lb20/c;

    new-instance v0, Lb20/c;

    const/16 v2, 0x11

    const-string v3, "link.native.integrity.preparation_failed"

    move-object/from16 v20, v1

    const-string v1, "LINK_NATIVE_FAILED_TO_PREPARE_INTEGRITY_MANAGER"

    invoke-direct {v0, v1, v2, v3}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb20/c;->O:Lb20/c;

    new-instance v1, Lb20/c;

    const/16 v2, 0x12

    const-string v3, "payments.paymentlauncherconfirmation.null_args"

    move-object/from16 v21, v0

    const-string v0, "PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS"

    invoke-direct {v1, v0, v2, v3}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lb20/c;->P:Lb20/c;

    new-instance v0, Lb20/c;

    const/16 v2, 0x13

    const-string v3, "payments.paymentlauncherconfirmation.invalid_args"

    move-object/from16 v22, v1

    const-string v1, "PAYMENT_LAUNCHER_CONFIRMATION_INVALID_ARGS"

    invoke-direct {v0, v1, v2, v3}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb20/c;->Q:Lb20/c;

    new-instance v1, Lb20/c;

    const/16 v2, 0x14

    const-string v3, "payments.browserlauncher.activity_not_found"

    move-object/from16 v23, v0

    const-string v0, "BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND"

    invoke-direct {v1, v0, v2, v3}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lb20/c;->R:Lb20/c;

    new-instance v0, Lb20/c;

    const/16 v2, 0x15

    const-string v3, "payments.browserlauncher.null_args"

    move-object/from16 v24, v1

    const-string v1, "BROWSER_LAUNCHER_NULL_ARGS"

    invoke-direct {v0, v1, v2, v3}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb20/c;->S:Lb20/c;

    new-instance v1, Lb20/c;

    const/16 v2, 0x16

    const-string v3, "google_pay.skipped_during_load"

    move-object/from16 v25, v0

    const-string v0, "GOOGLE_PAY_SKIPPED_DURING_LOAD"

    invoke-direct {v1, v0, v2, v3}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lb20/c;->T:Lb20/c;

    new-instance v0, Lb20/c;

    const/16 v2, 0x17

    const-string v3, "google_pay.confirm.error"

    move-object/from16 v26, v1

    const-string v1, "GOOGLE_PAY_FAILED"

    invoke-direct {v0, v1, v2, v3}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb20/c;->U:Lb20/c;

    new-instance v1, Lb20/c;

    const/16 v2, 0x18

    const-string v3, "fraud_detection_data_repository.api_failure"

    move-object/from16 v27, v0

    const-string v0, "FRAUD_DETECTION_API_FAILURE"

    invoke-direct {v1, v0, v2, v3}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lb20/c;->V:Lb20/c;

    new-instance v0, Lb20/c;

    const/16 v2, 0x19

    const-string v3, "stripe_android.saved_payment_method_radar_session_failure"

    move-object/from16 v28, v1

    const-string v1, "SAVED_PAYMENT_METHOD_RADAR_SESSION_FAILURE"

    invoke-direct {v0, v1, v2, v3}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb20/c;->W:Lb20/c;

    new-instance v1, Lb20/c;

    const/16 v2, 0x1a

    const-string v3, "paymentsheet.external_payment_method.confirm_handler_is_null"

    move-object/from16 v29, v0

    const-string v0, "EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL"

    invoke-direct {v1, v0, v2, v3}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lb20/c;->X:Lb20/c;

    new-instance v0, Lb20/c;

    const/16 v2, 0x1b

    const-string v3, "paymentsheet.custom_payment_method.confirm_handler_is_null"

    move-object/from16 v30, v1

    const-string v1, "CUSTOM_PAYMENT_METHOD_CONFIRM_HANDLER_NULL"

    invoke-direct {v0, v1, v2, v3}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb20/c;->Y:Lb20/c;

    new-instance v1, Lb20/c;

    const/16 v2, 0x1c

    const-string v3, "paymentsheet.create_intent_callback.is_null"

    move-object/from16 v31, v0

    const-string v0, "CREATE_INTENT_CALLBACK_NULL"

    invoke-direct {v1, v0, v2, v3}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lb20/c;->Z:Lb20/c;

    new-instance v0, Lb20/c;

    const/16 v2, 0x1d

    const-string v3, "paymentsheet.prepare_payment_method_handler.is_null"

    move-object/from16 v32, v1

    const-string v1, "PREPARE_PAYMENT_METHOD_HANDLER_NULL"

    invoke-direct {v0, v1, v2, v3}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb20/c;->a0:Lb20/c;

    new-instance v1, Lb20/c;

    const/16 v2, 0x1e

    const-string v3, "elements.tap_to_add.create_card_present_setup_intent_callback.is_null"

    move-object/from16 v33, v0

    const-string v0, "CREATE_CARD_PRESENT_SETUP_INTENT_CALLBACK_NULL"

    invoke-direct {v1, v0, v2, v3}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Lb20/c;

    const/16 v2, 0x1f

    const-string v3, "elements.captcha.passive.expected_failure"

    move-object/from16 v34, v1

    const-string v1, "HCAPTCHA_FAILURE"

    invoke-direct {v0, v1, v2, v3}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lb20/c;->b0:Lb20/c;

    new-instance v1, Lb20/c;

    const/16 v2, 0x20

    const-string v3, "elements.tap_to_add.discover_readers_call.failure"

    move-object/from16 v35, v0

    const-string v0, "TAP_TO_ADD_DISCOVER_READERS_CALL_FAILURE"

    invoke-direct {v1, v0, v2, v3}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Lb20/c;

    const/16 v2, 0x21

    const-string v3, "elements.tap_to_add.connect_reader_call.failure"

    move-object/from16 v36, v1

    const-string v1, "TAP_TO_ADD_CONNECT_READER_CALL_FAILURE"

    invoke-direct {v0, v1, v2, v3}, Lb20/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    move-object/from16 v16, v19

    move-object/from16 v17, v20

    move-object/from16 v18, v21

    move-object/from16 v19, v22

    move-object/from16 v20, v23

    move-object/from16 v21, v24

    move-object/from16 v22, v25

    move-object/from16 v23, v26

    move-object/from16 v24, v27

    move-object/from16 v25, v28

    move-object/from16 v26, v29

    move-object/from16 v27, v30

    move-object/from16 v28, v31

    move-object/from16 v29, v32

    move-object/from16 v30, v33

    move-object/from16 v31, v34

    move-object/from16 v32, v35

    move-object/from16 v33, v36

    move-object/from16 v34, v0

    filled-new-array/range {v1 .. v34}, [Lb20/c;

    move-result-object v0

    sput-object v0, Lb20/c;->c0:[Lb20/c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lb20/c;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb20/c;
    .locals 1

    const-class v0, Lb20/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb20/c;

    return-object p0
.end method

.method public static values()[Lb20/c;
    .locals 1

    sget-object v0, Lb20/c;->c0:[Lb20/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb20/c;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb20/c;->w:Ljava/lang/String;

    return-object v0
.end method
