.class public final Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment$b;
.super Lhc/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment$b",
        "Lhc/h;",
        "",
        "position",
        "Ll83/a0;",
        "onPageSelected",
        "(I)V",
        "sleep-coach_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic a:Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment$b;->a:Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageSelected(I)V
    .locals 3

    const/4 v0, 0x1

    add-int/2addr p1, v0

    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment$b;->a:Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;

    invoke-static {v1}, Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;->I(Lcom/whoop/coaching/sleepcoach/wizard/onboarding/SleepCoachWizarOnboardingFragment;)Lop0/e;

    move-result-object v1

    if-ne p1, v0, :cond_0

    const-string v0, "SLEEP IS THE FOUNDATION OF PERFORMANCE"

    goto :goto_0

    :cond_0
    const-string v0, "UNLOCK THE PERFECT NIGHT\u2019S SLEEP"

    :goto_0
    const-string v2, "Onboarding Screen"

    invoke-virtual {v1, p1, v0, v2}, Lop0/e;->I(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
