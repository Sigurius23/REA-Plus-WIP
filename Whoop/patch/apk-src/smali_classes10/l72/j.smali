.class public final synthetic Ll72/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;I)V
    .locals 0

    iput p2, p0, Ll72/j;->w:I

    iput-object p1, p0, Ll72/j;->x:Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ll72/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll72/j;->x:Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;

    invoke-static {v0}, Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;->F(Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ll72/j;->x:Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;

    invoke-static {v0}, Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;->D(Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ll72/j;->x:Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;

    invoke-static {v0}, Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;->A(Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Ll72/j;->x:Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;

    invoke-static {v0}, Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;->C(Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

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
