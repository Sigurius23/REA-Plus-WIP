.class public final Lcom/stripe/android/core/exception/AuthenticationException;
.super Lcom/stripe/android/core/exception/StripeException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lcom/stripe/android/core/exception/AuthenticationException;",
        "Lcom/stripe/android/core/exception/StripeException;",
        "stripe-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Lqy/f;Ljava/lang/String;)V
    .locals 7

    const/4 v4, 0x0

    const/16 v2, 0x18

    const/16 v1, 0x191

    const/4 v5, 0x0

    move-object v0, p0

    move-object v6, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/core/exception/StripeException;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "authError"

    return-object v0
.end method
