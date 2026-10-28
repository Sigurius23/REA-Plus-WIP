.class public final Lcom/stripe/android/core/exception/RateLimitException;
.super Lcom/stripe/android/core/exception/StripeException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lcom/stripe/android/core/exception/RateLimitException;",
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
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/16 v1, 0xf

    invoke-direct {p0, v0, v0, v1}, Lcom/stripe/android/core/exception/RateLimitException;-><init>(Lqy/f;Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Lqy/f;Ljava/lang/String;I)V
    .locals 8

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object v3, p1

    :goto_0
    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_1

    move-object v4, v1

    goto :goto_1

    :cond_1
    move-object v4, p2

    :goto_1
    if-eqz v3, :cond_2

    .line 2
    iget-object v1, v3, Lqy/f;->x:Ljava/lang/String;

    :cond_2
    move-object v7, v1

    const/16 v5, 0x1ad

    const/4 v6, 0x0

    move-object v2, p0

    .line 3
    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/core/exception/StripeException;-><init>(Lqy/f;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "rateLimitError"

    return-object v0
.end method
