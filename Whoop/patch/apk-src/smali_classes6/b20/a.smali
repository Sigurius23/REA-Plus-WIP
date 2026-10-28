.class public final Lb20/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Ljava/lang/Throwable;)Ljava/util/Map;
    .locals 1

    const-string v0, "error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/stripe/android/core/exception/StripeException;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/stripe/android/core/exception/StripeException;

    invoke-static {p0}, Lb20/a;->b(Lcom/stripe/android/core/exception/StripeException;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_0
    sget v0, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {p0}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object p0

    invoke-static {p0}, Lb20/a;->b(Lcom/stripe/android/core/exception/StripeException;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lcom/stripe/android/core/exception/StripeException;)Ljava/util/Map;
    .locals 7

    const-string v0, "stripeException"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/stripe/android/core/exception/StripeException;->y:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/core/exception/StripeException;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ll83/k;

    const-string v4, "analytics_value"

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    new-instance v2, Ll83/k;

    const-string v4, "status_code"

    invoke-direct {v2, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/stripe/android/core/exception/StripeException;->x:Ljava/lang/String;

    new-instance v4, Ll83/k;

    const-string v5, "request_id"

    invoke-direct {v4, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p0, p0, Lcom/stripe/android/core/exception/StripeException;->w:Lqy/f;

    if-eqz p0, :cond_2

    iget-object v0, p0, Lqy/f;->w:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    new-instance v5, Ll83/k;

    const-string v6, "error_type"

    invoke-direct {v5, v6, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz p0, :cond_3

    iget-object v1, p0, Lqy/f;->y:Ljava/lang/String;

    :cond_3
    new-instance p0, Ll83/k;

    const-string v0, "error_code"

    invoke-direct {p0, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v2, v4, v5, p0}, [Ll83/k;

    move-result-object p0

    invoke-static {p0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p0

    invoke-static {p0}, Lcom/squareup/wire/n;->y(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method
