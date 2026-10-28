.class public final Lcom/stripe/android/core/exception/InvalidRequestException;
.super Lcom/stripe/android/core/exception/StripeException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lcom/stripe/android/core/exception/InvalidRequestException;",
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
    .locals 7

    .line 1
    const/4 v5, 0x0

    const/16 v2, 0x1f

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/core/exception/InvalidRequestException;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V
    .locals 2

    and-int/lit8 v0, p2, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p6, v1

    :cond_0
    and-int/lit8 v0, p2, 0x2

    if-eqz v0, :cond_1

    move-object p3, v1

    :cond_1
    and-int/lit8 v0, p2, 0x4

    if-eqz v0, :cond_2

    const/4 p1, 0x0

    :cond_2
    and-int/lit8 v0, p2, 0x8

    if-eqz v0, :cond_4

    if-eqz p6, :cond_3

    .line 2
    iget-object p4, p6, Lqy/f;->x:Ljava/lang/String;

    goto :goto_0

    :cond_3
    move-object p4, v1

    :cond_4
    :goto_0
    and-int/lit8 p2, p2, 0x10

    if-eqz p2, :cond_5

    move-object p5, v1

    :cond_5
    move-object p2, p6

    move-object p6, p4

    move p4, p1

    move-object p1, p0

    .line 3
    invoke-direct/range {p1 .. p6}, Lcom/stripe/android/core/exception/StripeException;-><init>(Lqy/f;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "invalidRequestError"

    return-object v0
.end method
