.class public final synthetic Lep1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;I)V
    .locals 0

    iput p2, p0, Lep1/j;->w:I

    iput-object p1, p0, Lep1/j;->x:Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lep1/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lep1/j;->x:Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;

    invoke-static {v0}, Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;->y(Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lep1/j;->x:Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;

    invoke-static {v0}, Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;->z(Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lep1/j;->x:Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;

    invoke-static {v0}, Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;->C(Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
