.class public final synthetic Lcom/whoop/data/onboarding/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;

.field public final synthetic y:Lcom/whoop/data/onboarding/FeatureEducationType;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;Lcom/whoop/data/onboarding/FeatureEducationType;I)V
    .locals 0

    iput p3, p0, Lcom/whoop/data/onboarding/a;->w:I

    iput-object p1, p0, Lcom/whoop/data/onboarding/a;->x:Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;

    iput-object p2, p0, Lcom/whoop/data/onboarding/a;->y:Lcom/whoop/data/onboarding/FeatureEducationType;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/whoop/data/onboarding/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/data/onboarding/a;->y:Lcom/whoop/data/onboarding/FeatureEducationType;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lcom/whoop/data/onboarding/a;->x:Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;

    invoke-static {v1, v0, p1}, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->e(Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;Lcom/whoop/data/onboarding/FeatureEducationType;Ltb/a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/data/onboarding/a;->y:Lcom/whoop/data/onboarding/FeatureEducationType;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lcom/whoop/data/onboarding/a;->x:Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;

    invoke-static {v1, v0, p1}, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->b(Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;Lcom/whoop/data/onboarding/FeatureEducationType;Ltb/a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
