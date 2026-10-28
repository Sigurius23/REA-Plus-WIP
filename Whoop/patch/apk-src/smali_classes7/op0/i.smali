.class public final synthetic Lop0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;I)V
    .locals 0

    iput p2, p0, Lop0/i;->w:I

    iput-object p1, p0, Lop0/i;->x:Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lop0/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lop0/i;->x:Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;

    invoke-static {v0}, Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;->E(Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lop0/i;->x:Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;

    invoke-static {v0}, Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;->F(Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
