.class public final synthetic Lop0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;I)V
    .locals 0

    iput p2, p0, Lop0/j;->w:I

    iput-object p1, p0, Lop0/j;->x:Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lop0/j;->w:I

    check-cast p1, Lop0/c;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lop0/j;->x:Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;->G(Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;Lop0/c;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lop0/j;->x:Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;->H(Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;Lop0/c;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
