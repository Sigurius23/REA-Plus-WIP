.class public final synthetic Lmp0/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;I)V
    .locals 0

    iput p2, p0, Lmp0/m0;->w:I

    iput-object p1, p0, Lmp0/m0;->x:Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmp0/m0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lmp0/m0;->x:Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;

    invoke-static {v0, p1}, Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;->J(Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmp0/m0;->x:Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;

    check-cast p1, Lop0/a;

    invoke-static {v0, p1}, Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;->O(Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;Lop0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lmp0/m0;->x:Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;

    check-cast p1, Lmp0/p;

    invoke-static {v0, p1}, Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;->H(Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;Lmp0/p;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lmp0/m0;->x:Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;

    check-cast p1, Lmp0/c;

    invoke-static {v0, p1}, Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;->M(Lcom/whoop/coaching/sleepcoach/wizard/SleepCoachWizardConductorFragment;Lmp0/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
