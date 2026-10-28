.class public final Lxo0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lxo0/c;",
        "",
        "Lpo0/a;",
        "analyticHelper",
        "<init>",
        "(Lpo0/a;)V",
        "Lvo0/b;",
        "domainResult",
        "Ll83/a0;",
        "b",
        "(Lvo0/b;)V",
        "Lyo0/f;",
        "a",
        "(Lvo0/b;)Lyo0/f;",
        "Lpo0/a;",
        "coach-everywhere_release"
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
.field private final a:Lpo0/a;


# direct methods
.method public constructor <init>(Lpo0/a;)V
    .locals 1

    const-string v0, "analyticHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo0/c;->a:Lpo0/a;

    return-void
.end method

.method private final b(Lvo0/b;)V
    .locals 3

    invoke-virtual {p1}, Lvo0/b;->h()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lvo0/b;->d()I

    move-result v1

    invoke-static {v1, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepModel;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lxo0/c;->a:Lpo0/a;

    invoke-virtual {v0}, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepModel;->getStepId()Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepID;

    move-result-object v0

    invoke-virtual {v1, v0}, Lpo0/a;->h(Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepID;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lxo0/c;->a:Lpo0/a;

    new-instance v2, Ldp0/e$g;

    invoke-virtual {p1}, Lvo0/b;->d()I

    move-result p1

    invoke-direct {v2, v0, p1}, Ldp0/e$g;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1, v2}, Lpo0/a;->k(Ldp0/e;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lvo0/b;)Lyo0/f;
    .locals 17

    const-string v0, "domainResult"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lvo0/b;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lyo0/f;

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

    invoke-direct/range {v1 .. v12}, Lyo0/f;-><init>(ZLcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    invoke-virtual {v1}, Lvo0/b;->k()Z

    move-result v0

    sget-object v4, Lm83/y;->w:Lm83/y;

    if-eqz v0, :cond_1

    new-instance v1, Lyo0/f;

    const/16 v11, 0x180

    const/4 v12, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v12}, Lyo0/f;-><init>(ZLcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    invoke-virtual {v1}, Lvo0/b;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v0, "Error occurred"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const-string v0, "Retry"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v1}, Lvo0/b;->e()Ljava/lang/String;

    move-result-object v8

    new-instance v1, Lyo0/f;

    const/16 v11, 0x180

    const/4 v12, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v12}, Lyo0/f;-><init>(ZLcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    invoke-virtual {v1}, Lvo0/b;->g()Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v5, Lyo0/f;

    const/16 v15, 0x1fe

    const/16 v16, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v5 .. v16}, Lyo0/f;-><init>(ZLcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_3
    invoke-direct/range {p0 .. p1}, Lxo0/c;->b(Lvo0/b;)V

    invoke-virtual {v1}, Lvo0/b;->c()Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepModel;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepModel;->getHighlight()Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;

    move-result-object v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    move-object v7, v2

    goto :goto_2

    :cond_5
    :goto_1
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepModel;->getStepId()Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepID;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepID;->getHighlightID()Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;

    move-result-object v2

    goto :goto_0

    :cond_6
    move-object v7, v1

    :goto_2
    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepModel;->getLines()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_7

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    move-object v8, v4

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepModel;->getButtonText()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    :cond_8
    move-object v9, v1

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepModel;->getShowsBottomBar()Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_4
    move v10, v2

    goto :goto_5

    :cond_9
    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepModel;->getStepId()Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepID;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepID;->getShowBottomBar()Z

    move-result v2

    goto :goto_4

    :cond_a
    move v10, v1

    :goto_5
    if-eqz v0, :cond_b

    invoke-virtual {v0}, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepModel;->getAutoAdvance()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_b
    move v14, v1

    new-instance v5, Lyo0/f;

    const/16 v15, 0x80

    const/16 v16, 0x0

    const/4 v6, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v5 .. v16}, Lyo0/f;-><init>(ZLcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5
.end method
