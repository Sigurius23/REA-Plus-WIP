.class public final enum Lcom/stripe/android/model/StripeIntent$NextActionType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/StripeIntent$NextActionType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "com/stripe/android/model/StripeIntent$NextActionType",
        "",
        "Lcom/stripe/android/model/StripeIntent$NextActionType;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "t9/c0",
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
.field public static final enum E:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum F:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum G:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum H:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum I:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum J:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum K:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum L:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum M:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum N:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum O:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final synthetic P:[Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final synthetic Q:Lt83/b;

.field public static final x:Lt9/c0;

.field public static final enum y:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum z:Lcom/stripe/android/model/StripeIntent$NextActionType;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    new-instance v0, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/4 v1, 0x0

    const-string v2, "redirect_to_url"

    const-string v3, "RedirectToUrl"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->y:Lcom/stripe/android/model/StripeIntent$NextActionType;

    new-instance v1, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/4 v2, 0x1

    const-string v3, "use_stripe_sdk"

    const-string v4, "UseStripeSdk"

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/model/StripeIntent$NextActionType;->z:Lcom/stripe/android/model/StripeIntent$NextActionType;

    new-instance v2, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/4 v3, 0x2

    const-string v4, "oxxo_display_details"

    const-string v5, "DisplayOxxoDetails"

    invoke-direct {v2, v5, v3, v4}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/stripe/android/model/StripeIntent$NextActionType;->E:Lcom/stripe/android/model/StripeIntent$NextActionType;

    new-instance v3, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/4 v4, 0x3

    const-string v5, "alipay_handle_redirect"

    const-string v6, "AlipayRedirect"

    invoke-direct {v3, v6, v4, v5}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v4, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/4 v5, 0x4

    const-string v6, "blik_authorize"

    const-string v7, "BlikAuthorize"

    invoke-direct {v4, v7, v5, v6}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/stripe/android/model/StripeIntent$NextActionType;->F:Lcom/stripe/android/model/StripeIntent$NextActionType;

    new-instance v5, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/4 v6, 0x5

    const-string v7, "wechat_pay_redirect_to_android_app"

    const-string v8, "WeChatPayRedirect"

    invoke-direct {v5, v8, v6, v7}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v6, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/4 v7, 0x6

    const-string v8, "verify_with_microdeposits"

    const-string v9, "VerifyWithMicrodeposits"

    invoke-direct {v6, v9, v7, v8}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lcom/stripe/android/model/StripeIntent$NextActionType;->G:Lcom/stripe/android/model/StripeIntent$NextActionType;

    new-instance v7, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/4 v8, 0x7

    const-string v9, "upi_await_notification"

    const-string v10, "UpiAwaitNotification"

    invoke-direct {v7, v10, v8, v9}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lcom/stripe/android/model/StripeIntent$NextActionType;->H:Lcom/stripe/android/model/StripeIntent$NextActionType;

    new-instance v8, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/16 v9, 0x8

    const-string v10, "cashapp_handle_redirect_or_display_qr_code"

    const-string v11, "CashAppRedirect"

    invoke-direct {v8, v11, v9, v10}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Lcom/stripe/android/model/StripeIntent$NextActionType;->I:Lcom/stripe/android/model/StripeIntent$NextActionType;

    new-instance v9, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/16 v10, 0x9

    const-string v11, "boleto_display_details"

    const-string v12, "DisplayBoletoDetails"

    invoke-direct {v9, v12, v10, v11}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v9, Lcom/stripe/android/model/StripeIntent$NextActionType;->J:Lcom/stripe/android/model/StripeIntent$NextActionType;

    new-instance v10, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/16 v11, 0xa

    const-string v12, "konbini_display_details"

    const-string v13, "DisplayKonbiniDetails"

    invoke-direct {v10, v13, v11, v12}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, Lcom/stripe/android/model/StripeIntent$NextActionType;->K:Lcom/stripe/android/model/StripeIntent$NextActionType;

    new-instance v11, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/16 v12, 0xb

    const-string v13, "multibanco_display_details"

    const-string v14, "DisplayMultibancoDetails"

    invoke-direct {v11, v14, v12, v13}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v11, Lcom/stripe/android/model/StripeIntent$NextActionType;->L:Lcom/stripe/android/model/StripeIntent$NextActionType;

    new-instance v12, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/16 v13, 0xc

    const-string v14, "paynow_display_qr_code"

    const-string v15, "DisplayPayNowDetails"

    invoke-direct {v12, v15, v13, v14}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, Lcom/stripe/android/model/StripeIntent$NextActionType;->M:Lcom/stripe/android/model/StripeIntent$NextActionType;

    new-instance v13, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/16 v14, 0xd

    const-string v15, "promptpay_display_qr_code"

    move-object/from16 v16, v0

    const-string v0, "DisplayPromptPayDetails"

    invoke-direct {v13, v0, v14, v15}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v13, Lcom/stripe/android/model/StripeIntent$NextActionType;->N:Lcom/stripe/android/model/StripeIntent$NextActionType;

    new-instance v14, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/16 v0, 0xe

    const-string v15, "swish_handle_redirect_or_display_qr_code"

    move-object/from16 v17, v1

    const-string v1, "SwishRedirect"

    invoke-direct {v14, v1, v0, v15}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v14, Lcom/stripe/android/model/StripeIntent$NextActionType;->O:Lcom/stripe/android/model/StripeIntent$NextActionType;

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    filled-new-array/range {v0 .. v14}, [Lcom/stripe/android/model/StripeIntent$NextActionType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->P:[Lcom/stripe/android/model/StripeIntent$NextActionType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->Q:Lt83/b;

    new-instance v0, Lt9/c0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->x:Lt9/c0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/model/StripeIntent$NextActionType;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$NextActionType;
    .locals 1

    const-class v0, Lcom/stripe/android/model/StripeIntent$NextActionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/model/StripeIntent$NextActionType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/StripeIntent$NextActionType;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->P:[Lcom/stripe/android/model/StripeIntent$NextActionType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/model/StripeIntent$NextActionType;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/model/StripeIntent$NextActionType;->w:Ljava/lang/String;

    return-object v0
.end method
