.class public final La30/b1;
.super La30/e1;
.source "SourceFile"


# instance fields
.field public final w:Lcom/stripe/android/model/StripeIntent$Status;

.field public final x:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/stripe/android/model/StripeIntent$Status;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    iput-object p1, p0, La30/b1;->w:Lcom/stripe/android/model/StripeIntent$Status;

    const-string p1, "paymentIntentInTerminalState"

    iput-object p1, p0, La30/b1;->x:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La30/b1;->x:Ljava/lang/String;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, La30/b1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, La30/b1;

    iget-object v1, p0, La30/b1;->w:Lcom/stripe/android/model/StripeIntent$Status;

    iget-object p1, p1, La30/b1;->w:Lcom/stripe/android/model/StripeIntent$Status;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\n                PaymentSheet cannot set up a PaymentIntent in status \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, La30/b1;->w:Lcom/stripe/android/model/StripeIntent$Status;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\'.\n                See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-status.\n            "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/s;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, La30/b1;->w:Lcom/stripe/android/model/StripeIntent$Status;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PaymentIntentInTerminalState(status="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, La30/b1;->w:Lcom/stripe/android/model/StripeIntent$Status;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
