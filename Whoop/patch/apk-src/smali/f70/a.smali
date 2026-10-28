.class public final Lf70/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0001\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lf70/a;",
        "",
        "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;",
        "activationAuthenticatedApi",
        "Lp70/b;",
        "whoopStrapInfoProvider",
        "Lod1/j;",
        "pendingUserSessionRepository",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "ffChecker",
        "Lwn0/b;",
        "passwordRequirementsFetcher",
        "Lh80/c;",
        "analyticsHelper",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lod1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwn0/b;Lh80/c;Ltr2/n;)V",
        "Lf70/e$b;",
        "prevDomainResult",
        "Lf70/e;",
        "b",
        "(Lf70/e$b;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;",
        "Lp70/b;",
        "c",
        "Lod1/j;",
        "d",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "e",
        "Lwn0/b;",
        "f",
        "Lh80/c;",
        "g",
        "Ltr2/n;",
        "activation_release"
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
.field private final a:Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

.field private final b:Lp70/b;

.field private final c:Lod1/j;

.field private final d:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final e:Lwn0/b;

.field private final f:Lh80/c;

.field private final g:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lod1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwn0/b;Lh80/c;Ltr2/n;)V
    .locals 1

    const-string v0, "activationAuthenticatedApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapInfoProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pendingUserSessionRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ffChecker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "passwordRequirementsFetcher"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf70/a;->a:Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    .line 3
    iput-object p2, p0, Lf70/a;->b:Lp70/b;

    .line 4
    iput-object p3, p0, Lf70/a;->c:Lod1/j;

    .line 5
    iput-object p4, p0, Lf70/a;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 6
    iput-object p5, p0, Lf70/a;->e:Lwn0/b;

    .line 7
    iput-object p6, p0, Lf70/a;->f:Lh80/c;

    .line 8
    iput-object p7, p0, Lf70/a;->g:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lod1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwn0/b;Lh80/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    .line 9
    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "AccountActivationFetcher"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    move-object v8, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    goto :goto_1

    :cond_0
    move-object/from16 v8, p7

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {v1 .. v8}, Lf70/a;-><init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lod1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwn0/b;Lh80/c;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lf70/a;)Lcom/whoop/activation/domain/ActivationAuthenticatedApi;
    .locals 0

    iget-object p0, p0, Lf70/a;->a:Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    return-object p0
.end method


# virtual methods
.method public final b(Lf70/e$b;Lq83/d;)Ljava/lang/Object;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/e$b;",
            "Lq83/d<",
            "-",
            "Lf70/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lf70/a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lf70/a$a;

    iget v3, v2, Lf70/a$a;->F:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lf70/a$a;->F:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lf70/a$a;

    invoke-direct {v2, v0, v1}, Lf70/a$a;-><init>(Lf70/a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Lf70/a$a;->z:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Lf70/a$a;->F:I

    const/4 v11, 0x2

    const/4 v4, 0x1

    const/4 v12, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v4, :cond_2

    if-ne v3, v11, :cond_1

    iget-object v2, v8, Lf70/a$a;->y:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    iget-object v3, v8, Lf70/a$a;->x:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/domain/model/WhoopStrapInfo;

    iget-object v3, v8, Lf70/a$a;->w:Ljava/lang/Object;

    check-cast v3, Lf70/e$b;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v3, v8, Lf70/a$a;->x:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/domain/model/WhoopStrapInfo;

    iget-object v3, v8, Lf70/a$a;->w:Ljava/lang/Object;

    check-cast v3, Lf70/e$b;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v23, v3

    move-object v3, v1

    move-object/from16 v1, v23

    goto/16 :goto_2

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lf70/a;->b:Lp70/b;

    invoke-interface {v1}, Lp70/b;->a()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v1

    if-nez v1, :cond_4

    sget-object v6, Lf70/b0;->ERROR:Lf70/b0;

    const v19, 0x1ffef

    const/16 v20, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v20}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v1

    return-object v1

    :cond_4
    move-object v3, v1

    move-object/from16 v1, p1

    iget-object v5, v0, Lf70/a;->c:Lod1/j;

    iget-object v6, v0, Lf70/a;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v7, Lf70/l0$b;->a:Lf70/l0$b;

    invoke-static {v1, v5, v6, v7}, Lf70/i;->b(Lf70/e$b;Lod1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;Lf70/l0;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_5

    sget-object v6, Lf70/b0;->ERROR:Lf70/b0;

    const v19, 0x1ffef

    const/16 v20, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v1 .. v20}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v1

    return-object v1

    :cond_5
    sget-object v5, Lu02/a;->a:Lu02/a$a;

    iget-object v6, v0, Lf70/a;->g:Ltr2/n;

    new-instance v7, Lf70/a$b;

    invoke-direct {v7, v0, v3, v12}, Lf70/a$b;-><init>(Lf70/a;Lcom/whoop/domain/model/WhoopStrapInfo;Lq83/d;)V

    iput-object v1, v8, Lf70/a$a;->w:Ljava/lang/Object;

    iput-object v12, v8, Lf70/a$a;->x:Ljava/lang/Object;

    iput v4, v8, Lf70/a$a;->F:I

    move-object v3, v5

    const/4 v5, 0x0

    move-object v4, v6

    const-string v6, "Failed to get account activation screens"

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    check-cast v3, Lu02/a;

    iget-object v4, v0, Lf70/a;->e:Lwn0/b;

    iput-object v1, v8, Lf70/a$a;->w:Ljava/lang/Object;

    iput-object v12, v8, Lf70/a$a;->x:Ljava/lang/Object;

    iput-object v3, v8, Lf70/a$a;->y:Ljava/lang/Object;

    iput v11, v8, Lf70/a$a;->F:I

    invoke-virtual {v4, v8}, Lwn0/b;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_7

    :goto_3
    return-object v2

    :cond_7
    move-object v2, v3

    move-object v3, v1

    move-object v1, v4

    :goto_4
    check-cast v1, Lwn0/a;

    instance-of v4, v1, Lwn0/a$b;

    if-eqz v4, :cond_8

    check-cast v1, Lwn0/a$b;

    invoke-virtual {v1}, Lwn0/a$b;->a()Ljava/util/List;

    move-result-object v1

    :goto_5
    move-object/from16 v18, v1

    goto :goto_6

    :cond_8
    instance-of v4, v1, Lwn0/a$a;

    if-eqz v4, :cond_13

    iget-object v4, v0, Lf70/a;->g:Ltr2/n;

    check-cast v1, Lwn0/a$a;

    invoke-virtual {v1}, Lwn0/a$a;->a()Lwn0/c;

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Failed to fetch password requirements: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x0

    new-array v5, v5, [Lqr2/a$a;

    invoke-interface {v4, v1, v5}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v1, Lm83/y;->w:Lm83/y;

    goto :goto_5

    :goto_6
    instance-of v1, v2, Lu02/a$c;

    if-eqz v1, :cond_10

    iget-object v1, v0, Lf70/a;->f:Lh80/c;

    check-cast v2, Lu02/a$c;

    invoke-virtual {v2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/activation/domain/models/ActivationFlowActivateResponse;

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/ActivationFlowActivateResponse;->getEventProperties()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v1, v4}, Lh80/c;->C(Ljava/util/Map;)V

    invoke-virtual {v2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/activation/domain/models/ActivationFlowActivateResponse;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/ActivationFlowActivateResponse;->getItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_9
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    if-eqz v6, :cond_9

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_a
    iget-object v1, v0, Lf70/a;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v5, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->UPCYCLE_ONBOARDING_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v1, v5}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v1

    if-nez v1, :cond_e

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_b
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    instance-of v7, v6, Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;

    if-nez v7, :cond_b

    instance-of v6, v6, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;

    if-eqz v6, :cond_c

    goto :goto_8

    :cond_c
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_d
    move-object v4, v1

    :cond_e
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_f

    sget-object v8, Lf70/b0;->ERROR:Lf70/b0;

    const v21, 0x1ffef

    const/16 v22, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v3 .. v22}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v1

    return-object v1

    :cond_f
    sget-object v8, Lf70/b0;->CONTENT:Lf70/b0;

    new-instance v5, Ln70/e;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v11

    sget-object v13, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->ACCOUNT_ACTIVATION:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object v9, v5

    invoke-direct/range {v9 .. v14}, Ln70/e;-><init>(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;)V

    invoke-virtual {v2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/activation/domain/models/ActivationFlowActivateResponse;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/ActivationFlowActivateResponse;->getExperimentProperties()Ljava/util/Map;

    move-result-object v16

    const v21, 0x1afec

    const/16 v22, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v3 .. v22}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v1

    return-object v1

    :cond_10
    instance-of v1, v2, Lu02/a$b;

    if-eqz v1, :cond_12

    check-cast v2, Lu02/a$b;

    invoke-static {v2}, Ls70/a;->a(Lu02/a$b;)Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-static {}, Ls70/a;->b()Lf70/e$b;

    move-result-object v1

    return-object v1

    :cond_11
    sget-object v8, Lf70/b0;->ERROR:Lf70/b0;

    const v21, 0x1ffef

    const/16 v22, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v3 .. v22}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v1

    return-object v1

    :cond_12
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_13
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
