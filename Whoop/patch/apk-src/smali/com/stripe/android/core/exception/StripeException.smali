.class public abstract Lcom/stripe/android/core/exception/StripeException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/core/exception/StripeException;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "s4/d",
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


# static fields
.field public static final synthetic E:I


# instance fields
.field public final w:Lqy/f;

.field public final x:Ljava/lang/String;

.field public final y:I

.field public final z:Z


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/4 v4, 0x0

    const/16 v2, 0x1f

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/core/exception/StripeException;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V
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

    if-eqz v0, :cond_3

    move-object p5, v1

    :cond_3
    and-int/lit8 p2, p2, 0x10

    if-eqz p2, :cond_5

    if-eqz p6, :cond_4

    .line 2
    invoke-virtual {p6}, Lqy/f;->b()Ljava/lang/String;

    move-result-object p2

    move-object p4, p2

    goto :goto_0

    :cond_4
    move-object p4, v1

    :cond_5
    :goto_0
    move-object p2, p6

    move-object p6, p4

    move p4, p1

    move-object p1, p0

    .line 3
    invoke-direct/range {p1 .. p6}, Lcom/stripe/android/core/exception/StripeException;-><init>(Lqy/f;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lqy/f;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    .line 4
    invoke-direct {p0, p5, p4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 5
    iput-object p1, p0, Lcom/stripe/android/core/exception/StripeException;->w:Lqy/f;

    .line 6
    iput-object p2, p0, Lcom/stripe/android/core/exception/StripeException;->x:Ljava/lang/String;

    .line 7
    iput p3, p0, Lcom/stripe/android/core/exception/StripeException;->y:I

    const/16 p1, 0x190

    const/4 p2, 0x0

    if-gt p1, p3, :cond_0

    const/16 p1, 0x1f4

    if-ge p3, p1, :cond_0

    const/4 p2, 0x1

    .line 8
    :cond_0
    iput-boolean p2, p0, Lcom/stripe/android/core/exception/StripeException;->z:Z

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const-string v0, "stripeException"

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/core/exception/StripeException;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lcom/stripe/android/core/exception/StripeException;

    iget-object v1, p0, Lcom/stripe/android/core/exception/StripeException;->w:Lqy/f;

    iget-object v3, p1, Lcom/stripe/android/core/exception/StripeException;->w:Lqy/f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/stripe/android/core/exception/StripeException;->x:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/core/exception/StripeException;->x:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/stripe/android/core/exception/StripeException;->y:I

    iget v3, p1, Lcom/stripe/android/core/exception/StripeException;->y:I

    if-ne v1, v3, :cond_1

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/stripe/android/core/exception/StripeException;->y:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/core/exception/StripeException;->w:Lqy/f;

    iget-object v3, p0, Lcom/stripe/android/core/exception/StripeException;->x:Ljava/lang/String;

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/core/exception/StripeException;->x:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, "Request-id: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const-string v2, "\n"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
