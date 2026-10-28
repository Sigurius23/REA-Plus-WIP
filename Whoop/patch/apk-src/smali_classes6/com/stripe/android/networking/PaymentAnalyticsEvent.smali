.class public final enum Lcom/stripe/android/networking/PaymentAnalyticsEvent;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lyy/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/networking/PaymentAnalyticsEvent;",
        ">;",
        "Lyy/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/stripe/android/networking/PaymentAnalyticsEvent;",
        "Lyy/a;",
        "",
        "",
        "toString",
        "()Ljava/lang/String;",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum E:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum F:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum G:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum H:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum I:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum J:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum K:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum L:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum M:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum N:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum O:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum P:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Q:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum R:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum S:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum T:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum U:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum V:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum W:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum X:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Y:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Z:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum a0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum b0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum c0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum d0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum e0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum f0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum g0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum h0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum i0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum j0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum k0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum l0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum m0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum n0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum o0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum p0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum q0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum r0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum s0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum t0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum u0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum v0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final synthetic w0:[Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum x:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum y:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum z:Lcom/stripe/android/networking/PaymentAnalyticsEvent;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 70

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v0, 0x0

    const-string v2, "token_creation"

    const-string v3, "TokenCreate"

    invoke-direct {v1, v3, v0, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->x:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v0, 0x1

    const-string v3, "confirmation_token_creation"

    const-string v4, "ConfirmationTokenCreate"

    invoke-direct {v2, v4, v0, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->y:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v3, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v0, 0x2

    const-string v4, "payment_method_creation"

    const-string v5, "PaymentMethodCreate"

    invoke-direct {v3, v5, v0, v4}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->z:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v4, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v0, 0x3

    const-string v5, "payment_method_update"

    const-string v6, "PaymentMethodUpdate"

    invoke-direct {v4, v6, v0, v5}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->E:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v5, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v0, 0x4

    const-string v6, "retrieve_customer"

    const-string v7, "CustomerRetrieve"

    invoke-direct {v5, v7, v0, v6}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->F:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v6, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v0, 0x5

    const-string v7, "retrieve_payment_methods"

    const-string v8, "CustomerRetrievePaymentMethods"

    invoke-direct {v6, v8, v0, v7}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->G:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v7, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v0, 0x6

    const-string v8, "attach_payment_method"

    const-string v9, "CustomerAttachPaymentMethod"

    invoke-direct {v7, v9, v0, v8}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v8, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v0, 0x7

    const-string v9, "detach_payment_method"

    const-string v10, "CustomerDetachPaymentMethod"

    invoke-direct {v8, v10, v0, v9}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->H:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v9, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v0, 0x8

    const-string v10, "delete_source"

    const-string v11, "CustomerDeleteSource"

    invoke-direct {v9, v11, v0, v10}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v10, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v0, 0x9

    const-string v11, "set_shipping_info"

    const-string v12, "CustomerSetShippingInfo"

    invoke-direct {v10, v12, v0, v11}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v11, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v0, 0xa

    const-string v12, "add_source"

    const-string v13, "CustomerAddSource"

    invoke-direct {v11, v13, v0, v12}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v12, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v0, 0xb

    const-string v13, "default_source"

    const-string v14, "CustomerSetDefaultSource"

    invoke-direct {v12, v14, v0, v13}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v13, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v0, 0xc

    const-string v14, "issuing_retrieve_pin"

    const-string v15, "IssuingRetrievePin"

    invoke-direct {v13, v15, v0, v14}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v14, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v0, 0xd

    const-string v15, "issuing_update_pin"

    move-object/from16 v16, v1

    const-string v1, "IssuingUpdatePin"

    invoke-direct {v14, v1, v0, v15}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v15, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v0, 0xe

    const-string v1, "source_creation"

    move-object/from16 v17, v2

    const-string v2, "SourceCreate"

    invoke-direct {v15, v2, v0, v1}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0xf

    const-string v2, "retrieve_source"

    move-object/from16 v18, v3

    const-string v3, "SourceRetrieve"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x10

    const-string v3, "payment_intent_confirmation"

    move-object/from16 v19, v0

    const-string v0, "PaymentIntentConfirm"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->I:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x11

    const-string v3, "payment_intent_retrieval"

    move-object/from16 v20, v1

    const-string v1, "PaymentIntentRetrieve"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->J:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x12

    const-string v3, "payment_intent_retrieval_ordered"

    move-object/from16 v21, v0

    const-string v0, "PaymentIntentRetrieveOrdered"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x13

    const-string v3, "payment_intent_cancel_source"

    move-object/from16 v22, v1

    const-string v1, "PaymentIntentCancelSource"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->K:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x14

    const-string v3, "payment_intent_refresh"

    move-object/from16 v23, v0

    const-string v0, "PaymentIntentRefresh"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->L:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x15

    const-string v3, "setup_intent_confirmation"

    move-object/from16 v24, v1

    const-string v1, "SetupIntentConfirm"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->M:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x16

    const-string v3, "setup_intent_retrieval"

    move-object/from16 v25, v0

    const-string v0, "SetupIntentRetrieve"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->N:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x17

    const-string v3, "setup_intent_retrieval_ordered"

    move-object/from16 v26, v1

    const-string v1, "SetupIntentRetrieveOrdered"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x18

    const-string v3, "setup_intent_cancel_source"

    move-object/from16 v27, v0

    const-string v0, "SetupIntentCancelSource"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->O:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x19

    const-string v3, "setup_intent_refresh"

    move-object/from16 v28, v1

    const-string v1, "SetupIntentRefresh"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->P:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x1a

    const-string v3, "paymenthandler.confirm.started"

    move-object/from16 v29, v0

    const-string v0, "PaymentLauncherConfirmStarted"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Q:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x1b

    const-string v3, "paymenthandler.confirm.finished"

    move-object/from16 v30, v1

    const-string v1, "PaymentLauncherConfirmFinished"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->R:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x1c

    const-string v3, "paymenthandler.handle_next_action.started"

    move-object/from16 v31, v0

    const-string v0, "PaymentLauncherNextActionStarted"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->S:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x1d

    const-string v3, "paymenthandler.handle_next_action.finished"

    move-object/from16 v32, v1

    const-string v1, "PaymentLauncherNextActionFinished"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->T:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x1e

    const-string v3, "create_file"

    move-object/from16 v33, v0

    const-string v0, "FileCreate"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x1f

    const-string v3, "3ds1_sdk"

    move-object/from16 v34, v1

    const-string v1, "Auth3ds1Sdk"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x20

    const-string v3, "3ds1_challenge_start"

    move-object/from16 v35, v0

    const-string v0, "Auth3ds1ChallengeStart"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->U:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x21

    const-string v3, "3ds1_challenge_error"

    move-object/from16 v36, v1

    const-string v1, "Auth3ds1ChallengeError"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->V:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x22

    const-string v3, "3ds1_challenge_complete"

    move-object/from16 v37, v0

    const-string v0, "Auth3ds1ChallengeComplete"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->W:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x23

    const-string v3, "auth_with_webview"

    move-object/from16 v38, v1

    const-string v1, "AuthWithWebView"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->X:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x24

    const-string v3, "auth_with_customtabs"

    move-object/from16 v39, v0

    const-string v0, "AuthWithCustomTabs"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Y:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x25

    const-string v3, "auth_with_defaultbrowser"

    move-object/from16 v40, v1

    const-string v1, "AuthWithDefaultBrowser"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Z:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x26

    const-string v3, "confirm_returnurl_null"

    move-object/from16 v41, v0

    const-string v0, "ConfirmReturnUrlNull"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->a0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x27

    const-string v3, "confirm_returnurl_default"

    move-object/from16 v42, v1

    const-string v1, "ConfirmReturnUrlDefault"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->b0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x28

    const-string v3, "confirm_returnurl_custom"

    move-object/from16 v43, v0

    const-string v0, "ConfirmReturnUrlCustom"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->c0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x29

    const-string v3, "retrieve_fpx_bank_statuses"

    move-object/from16 v44, v1

    const-string v1, "FpxBankStatusesRetrieve"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x2a

    const-string v3, "retrieve_stripe_url"

    move-object/from16 v45, v0

    const-string v0, "StripeUrlRetrieve"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x2b

    const-string v3, "3ds2_authentication_request_params_failed"

    move-object/from16 v46, v1

    const-string v1, "Auth3ds2RequestParamsFailed"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->d0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x2c

    const-string v3, "3ds2_fingerprint"

    move-object/from16 v47, v0

    const-string v0, "Auth3ds2Fingerprint"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->e0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x2d

    const-string v3, "3ds2_authenticate"

    move-object/from16 v48, v1

    const-string v1, "Auth3ds2Start"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->f0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x2e

    const-string v3, "3ds2_frictionless_flow"

    move-object/from16 v49, v0

    const-string v0, "Auth3ds2Frictionless"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->g0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x2f

    const-string v3, "3ds2_challenge_flow_presented"

    move-object/from16 v50, v1

    const-string v1, "Auth3ds2ChallengePresented"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->h0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x30

    const-string v3, "3ds2_challenge_flow_canceled"

    move-object/from16 v51, v0

    const-string v0, "Auth3ds2ChallengeCanceled"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->i0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x31

    const-string v3, "3ds2_challenge_flow_completed"

    move-object/from16 v52, v1

    const-string v1, "Auth3ds2ChallengeCompleted"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->j0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x32

    const-string v3, "3ds2_challenge_flow_errored"

    move-object/from16 v53, v0

    const-string v0, "Auth3ds2ChallengeErrored"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->k0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x33

    const-string v3, "3ds2_challenge_flow_timed_out"

    move-object/from16 v54, v1

    const-string v1, "Auth3ds2ChallengeTimedOut"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->l0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x34

    const-string v3, "3ds2_fallback"

    move-object/from16 v55, v0

    const-string v0, "Auth3ds2Fallback"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->m0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x35

    const-string v3, "url_redirect_next_action"

    move-object/from16 v56, v1

    const-string v1, "AuthRedirect"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->n0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x36

    const-string v3, "auth_error"

    move-object/from16 v57, v0

    const-string v0, "AuthError"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x37

    const-string v3, "auth_source_start"

    move-object/from16 v58, v1

    const-string v1, "AuthSourceStart"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x38

    const-string v3, "auth_source_redirect"

    move-object/from16 v59, v0

    const-string v0, "AuthSourceRedirect"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x39

    const-string v3, "auth_source_result"

    move-object/from16 v60, v1

    const-string v1, "AuthSourceResult"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x3a

    const-string v3, "radar_session_create"

    move-object/from16 v61, v0

    const-string v0, "RadarSessionCreate"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->o0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x3b

    const-string v3, "googlepaylauncher_init"

    move-object/from16 v62, v1

    const-string v1, "GooglePayLauncherInit"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x3c

    const-string v3, "googlepaypaymentmethodlauncher_init"

    move-object/from16 v63, v0

    const-string v0, "GooglePayPaymentMethodLauncherInit"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->p0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x3d

    const-string v3, "card_metadata_pk_available"

    move-object/from16 v64, v1

    const-string v1, "CardMetadataPublishableKeyAvailable"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->q0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x3e

    const-string v3, "card_metadata_pk_unavailable"

    move-object/from16 v65, v0

    const-string v0, "CardMetadataPublishableKeyUnavailable"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->r0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x3f

    const-string v3, "card_metadata_loaded_too_slow"

    move-object/from16 v66, v1

    const-string v1, "CardMetadataLoadedTooSlow"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->s0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x40

    const-string v3, "card_metadata_load_failure"

    move-object/from16 v67, v0

    const-string v0, "CardMetadataLoadFailure"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->t0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x41

    const-string v3, "card_metadata_missing_range"

    move-object/from16 v68, v1

    const-string v1, "CardMetadataMissingRange"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->u0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    new-instance v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v2, 0x42

    const-string v3, "card_metadata.expected_extra_digits_but_user_entered_16_then_switched_fields"

    move-object/from16 v69, v0

    const-string v0, "CardMetadataExpectedExtraDigitsButUserEntered16ThenSwitchedFields"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->v0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    move-object/from16 v2, v67

    move-object/from16 v67, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v19

    move-object/from16 v19, v22

    move-object/from16 v22, v25

    move-object/from16 v25, v28

    move-object/from16 v28, v31

    move-object/from16 v31, v34

    move-object/from16 v34, v37

    move-object/from16 v37, v40

    move-object/from16 v40, v43

    move-object/from16 v43, v46

    move-object/from16 v46, v49

    move-object/from16 v49, v52

    move-object/from16 v52, v55

    move-object/from16 v55, v58

    move-object/from16 v58, v61

    move-object/from16 v61, v64

    move-object/from16 v64, v2

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

    move-object/from16 v38, v41

    move-object/from16 v39, v42

    move-object/from16 v41, v44

    move-object/from16 v42, v45

    move-object/from16 v44, v47

    move-object/from16 v45, v48

    move-object/from16 v47, v50

    move-object/from16 v48, v51

    move-object/from16 v50, v53

    move-object/from16 v51, v54

    move-object/from16 v53, v56

    move-object/from16 v54, v57

    move-object/from16 v56, v59

    move-object/from16 v57, v60

    move-object/from16 v59, v62

    move-object/from16 v60, v63

    move-object/from16 v62, v65

    move-object/from16 v63, v66

    move-object/from16 v65, v68

    move-object/from16 v66, v69

    filled-new-array/range {v1 .. v67}, [Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->w0:[Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/networking/PaymentAnalyticsEvent;
    .locals 1

    const-class v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/networking/PaymentAnalyticsEvent;
    .locals 1

    sget-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->w0:[Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->w:Ljava/lang/String;

    const-string v1, "stripe_android."

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
