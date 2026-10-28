.class public interface abstract Lcom/whoop/payments/domain/PaymentsApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0004\u0008\u0007\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00062\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/payments/domain/PaymentsApi;",
        "",
        "",
        "Lcom/whoop/payments/domain/models/PaymentsResponse;",
        "getPayments",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lud3/a1;",
        "getPublicStripeToken",
        "",
        "country",
        "getPublicStripeTokenOnboarding",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
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
.method public abstract getPayments(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/payments/domain/models/PaymentsResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "membership-service/v1/billing/payment_method"
    .end annotation
.end method

.method public abstract getPublicStripeToken(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lud3/a1;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "membership-service/v1/payment/public-stripe-key"
    .end annotation
.end method

.method public abstract getPublicStripeTokenOnboarding(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "country"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lud3/a1;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "membership-service/v1/payment/public-stripe-key/onboarding"
    .end annotation
.end method
