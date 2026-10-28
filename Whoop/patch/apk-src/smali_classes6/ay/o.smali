.class public final Lay/o;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;I)V
    .locals 0

    iput p2, p0, Lay/o;->w:I

    iput-object p1, p0, Lay/o;->x:Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lay/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lay/o;->x:Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;

    invoke-virtual {v0}, Lg/l;->getDefaultViewModelCreationExtras()Ll8/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lay/o;->x:Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;

    invoke-virtual {v0}, Lg/l;->getViewModelStore()Landroidx/lifecycle/e2;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
