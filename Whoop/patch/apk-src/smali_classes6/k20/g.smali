.class public final Lk20/g;
.super Lk20/h;
.source "SourceFile"


# instance fields
.field public final w:Ljava/lang/Throwable;

.field public final x:Lcom/stripe/android/core/exception/StripeException;

.field public final y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "cause"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    iput-object p1, p0, Lk20/g;->w:Ljava/lang/Throwable;

    sget v0, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {p1}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object p1

    iput-object p1, p0, Lk20/g;->x:Lcom/stripe/android/core/exception/StripeException;

    iget-object p1, p1, Lcom/stripe/android/core/exception/StripeException;->w:Lqy/f;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lqy/f;->y:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lk20/g;->y:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk20/g;->x:Lcom/stripe/android/core/exception/StripeException;

    invoke-virtual {v0}, Lcom/stripe/android/core/exception/StripeException;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk20/g;->y:Ljava/lang/String;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lk20/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lk20/g;

    iget-object v1, p0, Lk20/g;->w:Ljava/lang/Throwable;

    iget-object p1, p1, Lk20/g;->w:Ljava/lang/Throwable;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getCause()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lk20/g;->w:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lk20/g;->w:Ljava/lang/Throwable;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const-string v0, "Stripe(cause="

    const-string v1, ")"

    iget-object v2, p0, Lk20/g;->w:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2}, Lvl/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
