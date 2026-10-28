.class public final Lcom/stripe/android/paymentelement/confirmation/intent/InvalidDeferredIntentUsageException;
.super Lcom/stripe/android/core/exception/StripeException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/intent/InvalidDeferredIntentUsageException;",
        "Lcom/stripe/android/core/exception/StripeException;",
        "<init>",
        "()V",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final F:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v4, 0x0

    const/16 v2, 0x1f

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/core/exception/StripeException;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V

    const-string v1, "The payment method on the intent doesn\'t match the one provided in the createIntentCallback. When using deferred\nintent creation, ensure you\'re either creating a new intent with the correct payment method or updating an\nexisting intent with the new payment method ID."

    iput-object v1, v0, Lcom/stripe/android/paymentelement/confirmation/intent/InvalidDeferredIntentUsageException;->F:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "invalidDeferredIntentUsage"

    return-object v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/intent/InvalidDeferredIntentUsageException;->F:Ljava/lang/String;

    return-object v0
.end method
