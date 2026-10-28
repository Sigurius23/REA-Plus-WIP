.class public final synthetic Lep1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;I)V
    .locals 0

    iput p2, p0, Lep1/k;->w:I

    iput-object p1, p0, Lep1/k;->x:Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lep1/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lep1/k;->x:Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;

    check-cast p1, Lyn1/a;

    invoke-static {v0, p1}, Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;->B(Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;Lyn1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lep1/k;->x:Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;

    check-cast p1, Lcp1/i;

    invoke-static {v0, p1}, Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;->E(Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;Lcp1/i;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
