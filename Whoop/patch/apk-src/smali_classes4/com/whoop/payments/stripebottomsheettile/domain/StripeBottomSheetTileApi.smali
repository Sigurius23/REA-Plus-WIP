.class public interface abstract Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J \u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;",
        "",
        "Lcom/whoop/payments/stripebottomsheettile/domain/models/SetupIntentResponse;",
        "createSetupIntent",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/payments/stripebottomsheettile/domain/models/UpdateDefaultPaymentMethodRequest;",
        "body",
        "Lpg3/v0;",
        "Ll83/a0;",
        "updateDefaultPaymentMethod",
        "(Lcom/whoop/payments/stripebottomsheettile/domain/models/UpdateDefaultPaymentMethodRequest;Lq83/d;)Ljava/lang/Object;",
        "payments_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract createSetupIntent(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/payments/stripebottomsheettile/domain/models/SetupIntentResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "membership-service/v2/payment/setup"
    .end annotation
.end method

.method public abstract updateDefaultPaymentMethod(Lcom/whoop/payments/stripebottomsheettile/domain/models/UpdateDefaultPaymentMethodRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/payments/stripebottomsheettile/domain/models/UpdateDefaultPaymentMethodRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/payments/stripebottomsheettile/domain/models/UpdateDefaultPaymentMethodRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "membership-service/v2/payment/default"
    .end annotation
.end method
