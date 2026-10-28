.class public final synthetic Lmp0/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;I)V
    .locals 0

    iput p2, p0, Lmp0/n0;->w:I

    iput-object p1, p0, Lmp0/n0;->x:Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmp0/n0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmp0/n0;->x:Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;

    invoke-static {v0}, Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;->G(Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;)Landroidx/constraintlayout/widget/p;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lmp0/n0;->x:Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;

    invoke-static {v0}, Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;->I(Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;)Landroidx/constraintlayout/widget/p;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lmp0/n0;->x:Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;

    invoke-static {v0}, Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;->L(Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lmp0/n0;->x:Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;

    invoke-static {v0}, Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;->P(Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;)Lcom/whoop/coaching/sleepcoach/wizard/f;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
