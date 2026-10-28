.class public final Lcom/stripe/android/uicore/image/StripeImageState$Success;
.super Lm40/y;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/stripe/android/uicore/image/StripeImageState$Success",
        "Lm40/y;",
        "Ln2/a;",
        "painter",
        "Ln2/a;",
        "a",
        "()Ln2/a;",
        "stripe-ui-core_release"
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
.field private final painter:Ln2/a;


# direct methods
.method public constructor <init>(Ln2/a;)V
    .locals 1

    const-string v0, "painter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/image/StripeImageState$Success;->painter:Ln2/a;

    return-void
.end method


# virtual methods
.method public final a()Ln2/a;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/image/StripeImageState$Success;->painter:Ln2/a;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/image/StripeImageState$Success;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/image/StripeImageState$Success;

    iget-object v1, p0, Lcom/stripe/android/uicore/image/StripeImageState$Success;->painter:Ln2/a;

    iget-object p1, p1, Lcom/stripe/android/uicore/image/StripeImageState$Success;->painter:Ln2/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/image/StripeImageState$Success;->painter:Ln2/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/uicore/image/StripeImageState$Success;->painter:Ln2/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Success(painter="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
