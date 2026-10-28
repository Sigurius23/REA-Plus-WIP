.class public final synthetic Lay/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;I)V
    .locals 0

    iput p2, p0, Lay/k;->w:I

    iput-object p1, p0, Lay/k;->x:Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lay/k;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lay/d0;

    new-instance v1, Lab/g0;

    const/4 v2, 0x2

    iget-object v3, p0, Lay/k;->x:Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;

    invoke-direct {v1, v3, v2}, Lab/g0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v1}, Lay/d0;-><init>(Lab/g0;)V

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lay/k;->x:Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;

    iget-object v0, v0, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;->w:Ll8/d;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
