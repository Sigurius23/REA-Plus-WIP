.class public final Lj12/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lj12/d;",
        "",
        "<init>",
        "()V",
        "Lk12/b;",
        "domainResult",
        "Lm12/e;",
        "a",
        "(Lk12/b;)Lm12/e;",
        "onboarding-story_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lk12/b;)Lm12/e;
    .locals 23

    const-string v0, "domainResult"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lk12/b;->d()Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v1, Lm12/e;

    const/16 v11, 0x1fe

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v12}, Lm12/e;-><init>(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/onboarding/overlay/ui/OnboardingOverlayStyle;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    invoke-virtual {v1}, Lk12/b;->c()I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    invoke-virtual {v0}, Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;->getSteps()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/onboarding/overlay/model/OnboardingStep;

    invoke-virtual {v3}, Lcom/whoop/onboarding/overlay/model/OnboardingStep;->getOverlayStyle()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/whoop/onboarding/overlay/ui/OnboardingOverlayStyle;->TOP:Lcom/whoop/onboarding/overlay/ui/OnboardingOverlayStyle;

    invoke-static {}, Lcom/whoop/onboarding/overlay/ui/OnboardingOverlayStyle;->values()[Lcom/whoop/onboarding/overlay/ui/OnboardingOverlayStyle;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x0

    move v9, v8

    :goto_0
    if-ge v9, v7, :cond_2

    aget-object v10, v6, v9

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_2
    const/4 v10, 0x0

    :goto_1
    if-nez v10, :cond_3

    move-object/from16 v19, v5

    goto :goto_2

    :cond_3
    move-object/from16 v19, v10

    :goto_2
    invoke-virtual {v3}, Lcom/whoop/onboarding/overlay/model/OnboardingStep;->getHeader()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v3}, Lcom/whoop/onboarding/overlay/model/OnboardingStep;->getBody()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v3}, Lcom/whoop/onboarding/overlay/model/OnboardingStep;->getButtonText()Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-virtual {v3}, Lcom/whoop/onboarding/overlay/model/OnboardingStep;->getSecondaryButtonText()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v3}, Lcom/whoop/onboarding/overlay/model/OnboardingStep;->getImageUrl()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v0}, Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;->getSteps()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v0

    if-ne v1, v0, :cond_4

    move/from16 v20, v2

    goto :goto_3

    :cond_4
    move/from16 v20, v8

    :goto_3
    new-instance v11, Lm12/e;

    const/16 v21, 0x2

    const/16 v22, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    invoke-direct/range {v11 .. v22}, Lm12/e;-><init>(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/onboarding/overlay/ui/OnboardingOverlayStyle;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v11
.end method
