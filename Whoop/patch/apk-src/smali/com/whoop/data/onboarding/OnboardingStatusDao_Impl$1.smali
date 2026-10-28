.class Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl$1;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/k;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl$1;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Ltb/c;Lcom/whoop/data/onboarding/OnboardingStatus;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl$1;->this$0:Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;

    invoke-static {v0}, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->f(Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;)Lcom/whoop/data/onboarding/FeatureEducationTypeConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/data/onboarding/OnboardingStatus;->getType()Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/onboarding/FeatureEducationTypeConverter;->fromFeatureEducationType(Lcom/whoop/data/onboarding/FeatureEducationType;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 3
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 5
    :goto_0
    invoke-virtual {p2}, Lcom/whoop/data/onboarding/OnboardingStatus;->isCompleted()Z

    move-result p2

    const/4 v0, 0x2

    int-to-long v1, p2

    .line 6
    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/whoop/data/onboarding/OnboardingStatus;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl$1;->bind(Ltb/c;Lcom/whoop/data/onboarding/OnboardingStatus;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `table_onboarding_status` (`type`,`isCompleted`) VALUES (?,?)"

    return-object v0
.end method
