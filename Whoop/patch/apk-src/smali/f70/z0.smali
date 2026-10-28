.class public final Lf70/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008\u0001\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0004\u0008\u001b\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010$R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lf70/z0;",
        "",
        "Lcom/whoop/activation/domain/ActivationApi;",
        "activationApi",
        "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;",
        "activationAuthenticatedApi",
        "Lod1/j;",
        "pendingUserSessionRepository",
        "Lp70/b;",
        "whoopStrapInfoProvider",
        "Lcom/whoop/data/datastore/EmailDataStoreHelper;",
        "emailDataStoreHelper",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lod1/j;Lp70/b;Lcom/whoop/data/datastore/EmailDataStoreHelper;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V",
        "Lcom/whoop/domain/model/AuthMaterial;",
        "pendingAuthMaterial",
        "Lf70/e$b;",
        "prevDomainResult",
        "Lf70/f;",
        "e",
        "(Lcom/whoop/domain/model/AuthMaterial;Lf70/e$b;Lq83/d;)Ljava/lang/Object;",
        "g",
        "(Lf70/e$b;Lq83/d;)Ljava/lang/Object;",
        "f",
        "a",
        "Lcom/whoop/activation/domain/ActivationApi;",
        "b",
        "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;",
        "c",
        "Lod1/j;",
        "d",
        "Lp70/b;",
        "Lcom/whoop/data/datastore/EmailDataStoreHelper;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
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
.field private final a:Lcom/whoop/activation/domain/ActivationApi;

.field private final b:Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

.field private final c:Lod1/j;

.field private final d:Lp70/b;

.field private final e:Lcom/whoop/data/datastore/EmailDataStoreHelper;

.field private final f:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final g:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lod1/j;Lp70/b;Lcom/whoop/data/datastore/EmailDataStoreHelper;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V
    .locals 1

    const-string v0, "activationApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activationAuthenticatedApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pendingUserSessionRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapInfoProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailDataStoreHelper"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf70/z0;->a:Lcom/whoop/activation/domain/ActivationApi;

    iput-object p2, p0, Lf70/z0;->b:Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    iput-object p3, p0, Lf70/z0;->c:Lod1/j;

    iput-object p4, p0, Lf70/z0;->d:Lp70/b;

    iput-object p5, p0, Lf70/z0;->e:Lcom/whoop/data/datastore/EmailDataStoreHelper;

    iput-object p6, p0, Lf70/z0;->f:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p7, p0, Lf70/z0;->g:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lf70/z0;Lcom/whoop/domain/model/AuthMaterial;Lf70/e$b;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lf70/z0;->e(Lcom/whoop/domain/model/AuthMaterial;Lf70/e$b;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lf70/z0;)Lcom/whoop/activation/domain/ActivationApi;
    .locals 0

    iget-object p0, p0, Lf70/z0;->a:Lcom/whoop/activation/domain/ActivationApi;

    return-object p0
.end method

.method public static final synthetic c(Lf70/z0;)Lcom/whoop/activation/domain/ActivationAuthenticatedApi;
    .locals 0

    iget-object p0, p0, Lf70/z0;->b:Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    return-object p0
.end method

.method public static final synthetic d(Lf70/z0;Lf70/e$b;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lf70/z0;->g(Lf70/e$b;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final e(Lcom/whoop/domain/model/AuthMaterial;Lf70/e$b;Lq83/d;)Ljava/lang/Object;
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/AuthMaterial;",
            "Lf70/e$b;",
            "Lq83/d<",
            "-",
            "Lf70/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    instance-of v3, v2, Lf70/z0$a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lf70/z0$a;

    iget v4, v3, Lf70/z0$a;->G:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lf70/z0$a;->G:I

    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lf70/z0$a;

    invoke-direct {v3, v0, v2}, Lf70/z0$a;-><init>(Lf70/z0;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v2, v9, Lf70/z0$a;->E:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v9, Lf70/z0$a;->G:I

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eqz v4, :cond_2

    if-ne v4, v12, :cond_1

    iget-object v1, v9, Lf70/z0$a;->z:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/activation/domain/models/FinishAccountCreationBody;

    iget-object v1, v9, Lf70/z0$a;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/WhoopStrapInfo;

    iget-object v1, v9, Lf70/z0$a;->x:Ljava/lang/Object;

    check-cast v1, Lf70/e$b;

    iget-object v3, v9, Lf70/z0$a;->w:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/domain/model/AuthMaterial;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v23, v3

    :goto_2
    move-object v14, v1

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lf70/z0;->d:Lp70/b;

    invoke-interface {v2}, Lp70/b;->a()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v2

    if-nez v2, :cond_3

    iget-object v4, v0, Lf70/z0;->f:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v5, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ACCOUNT_CREATION_SKIP_STRAP_INFO_CHECK:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v4, v5}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v4

    if-nez v4, :cond_3

    new-instance v2, Lf70/f;

    invoke-direct {v2, v1, v13}, Lf70/f;-><init>(Lf70/e$b;Z)V

    return-object v2

    :cond_3
    new-instance v14, Lcom/whoop/activation/domain/models/FinishAccountCreationBody;

    invoke-virtual {v1}, Lf70/e$b;->h()Lf70/q0;

    move-result-object v4

    invoke-virtual {v4}, Lf70/q0;->l()Ld70/d;

    move-result-object v4

    invoke-virtual {v4}, Ld70/d;->a()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1}, Lf70/e$b;->h()Lf70/q0;

    move-result-object v4

    invoke-virtual {v4}, Lf70/q0;->q()Ld70/d;

    move-result-object v4

    invoke-virtual {v4}, Ld70/d;->a()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v1}, Lf70/e$b;->h()Lf70/q0;

    move-result-object v4

    invoke-virtual {v4}, Lf70/q0;->C()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v1}, Lf70/e$b;->h()Lf70/q0;

    move-result-object v4

    invoke-virtual {v4}, Lf70/q0;->i()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v1}, Lf70/e$b;->h()Lf70/q0;

    move-result-object v4

    invoke-virtual {v4}, Lf70/q0;->z()Ljava/lang/String;

    move-result-object v19

    invoke-direct/range {v14 .. v19}, Lcom/whoop/activation/domain/models/FinishAccountCreationBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v4, Lu02/a;->a:Lu02/a$a;

    iget-object v5, v0, Lf70/z0;->g:Ltr2/n;

    new-instance v8, Lf70/z0$b;

    const/4 v6, 0x0

    invoke-direct {v8, v0, v14, v2, v6}, Lf70/z0$b;-><init>(Lf70/z0;Lcom/whoop/activation/domain/models/FinishAccountCreationBody;Lcom/whoop/domain/model/WhoopStrapInfo;Lq83/d;)V

    move-object/from16 v2, p1

    iput-object v2, v9, Lf70/z0$a;->w:Ljava/lang/Object;

    iput-object v1, v9, Lf70/z0$a;->x:Ljava/lang/Object;

    iput-object v6, v9, Lf70/z0$a;->y:Ljava/lang/Object;

    iput-object v6, v9, Lf70/z0$a;->z:Ljava/lang/Object;

    iput v12, v9, Lf70/z0$a;->G:I

    const-string v7, "Failed to finish account creation"

    const/4 v10, 0x2

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_4

    return-object v3

    :cond_4
    move-object/from16 v23, v2

    move-object v2, v4

    goto :goto_2

    :goto_3
    check-cast v2, Lu02/a;

    instance-of v1, v2, Lu02/a$c;

    if-eqz v1, :cond_5

    iget-object v1, v0, Lf70/z0;->g:Ltr2/n;

    const-string v2, "Successfully finished account creation"

    new-array v3, v13, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v1, Lf70/f;

    const v32, 0x1feff

    const/16 v33, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v14 .. v33}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v2

    invoke-direct {v1, v2, v12}, Lf70/f;-><init>(Lf70/e$b;Z)V

    return-object v1

    :cond_5
    instance-of v1, v2, Lu02/a$b;

    if-eqz v1, :cond_7

    check-cast v2, Lu02/a$b;

    invoke-static {v2}, Ls70/a;->a(Lu02/a$b;)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Lf70/f;

    invoke-static {}, Ls70/a;->b()Lf70/e$b;

    move-result-object v2

    invoke-direct {v1, v2, v13}, Lf70/f;-><init>(Lf70/e$b;Z)V

    return-object v1

    :cond_6
    new-instance v1, Lf70/f;

    const v42, 0x1ffdf

    const/16 v43, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x1

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    move-object/from16 v24, v14

    invoke-static/range {v24 .. v43}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v2

    invoke-direct {v1, v2, v13}, Lf70/f;-><init>(Lf70/e$b;Z)V

    return-object v1

    :cond_7
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method private final g(Lf70/e$b;Lq83/d;)Ljava/lang/Object;
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/e$b;",
            "Lq83/d<",
            "-",
            "Lf70/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lf70/z0$d;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lf70/z0$d;

    iget v4, v3, Lf70/z0$d;->G:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lf70/z0$d;->G:I

    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lf70/z0$d;

    invoke-direct {v3, v0, v2}, Lf70/z0$d;-><init>(Lf70/z0;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v2, v9, Lf70/z0$d;->E:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v9, Lf70/z0$d;->G:I

    const/4 v5, 0x2

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v12, :cond_3

    if-ne v4, v5, :cond_2

    iget-object v1, v9, Lf70/z0$d;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;

    iget-object v1, v9, Lf70/z0$d;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/WhoopStrapInfo;

    iget-object v1, v9, Lf70/z0$d;->w:Ljava/lang/Object;

    check-cast v1, Lf70/e$b;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_1
    move-object v14, v1

    goto/16 :goto_4

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    iget-object v1, v9, Lf70/z0$d;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/WhoopStrapInfo;

    iget-object v4, v9, Lf70/z0$d;->w:Ljava/lang/Object;

    check-cast v4, Lf70/e$b;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v34, v2

    move-object v2, v1

    move-object v1, v4

    move-object/from16 v4, v34

    goto :goto_2

    :cond_4
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lf70/z0;->d:Lp70/b;

    invoke-interface {v2}, Lp70/b;->a()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v2

    if-nez v2, :cond_5

    iget-object v4, v0, Lf70/z0;->f:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v6, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ACCOUNT_CREATION_SKIP_STRAP_INFO_CHECK:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v4, v6}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v4

    if-nez v4, :cond_5

    new-instance v2, Lf70/f;

    invoke-direct {v2, v1, v13}, Lf70/f;-><init>(Lf70/e$b;Z)V

    return-object v2

    :cond_5
    invoke-virtual {v1}, Lf70/e$b;->h()Lf70/q0;

    move-result-object v4

    invoke-virtual {v4}, Lf70/q0;->j()Ld70/c;

    move-result-object v4

    invoke-virtual {v4}, Ld70/c;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-nez v6, :cond_7

    iget-object v4, v0, Lf70/z0;->e:Lcom/whoop/data/datastore/EmailDataStoreHelper;

    iput-object v1, v9, Lf70/z0$d;->w:Ljava/lang/Object;

    iput-object v2, v9, Lf70/z0$d;->x:Ljava/lang/Object;

    iput v13, v9, Lf70/z0$d;->z:I

    iput v12, v9, Lf70/z0$d;->G:I

    invoke-virtual {v4, v9}, Lcom/whoop/data/datastore/EmailDataStoreHelper;->getEmail(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_7

    const-string v4, ""

    :cond_7
    move-object v15, v4

    invoke-virtual {v1}, Lf70/e$b;->h()Lf70/q0;

    move-result-object v4

    invoke-virtual {v4}, Lf70/q0;->s()Ld70/e;

    move-result-object v4

    invoke-virtual {v4}, Ld70/e;->a()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v1}, Lf70/e$b;->h()Lf70/q0;

    move-result-object v4

    invoke-virtual {v4}, Lf70/q0;->C()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v1}, Lf70/e$b;->h()Lf70/q0;

    move-result-object v4

    invoke-virtual {v4}, Lf70/q0;->l()Ld70/d;

    move-result-object v4

    invoke-virtual {v4}, Ld70/d;->a()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v1}, Lf70/e$b;->h()Lf70/q0;

    move-result-object v4

    invoke-virtual {v4}, Lf70/q0;->q()Ld70/d;

    move-result-object v4

    invoke-virtual {v4}, Ld70/d;->a()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v1}, Lf70/e$b;->h()Lf70/q0;

    move-result-object v4

    invoke-virtual {v4}, Lf70/q0;->i()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v1}, Lf70/e$b;->h()Lf70/q0;

    move-result-object v4

    invoke-virtual {v4}, Lf70/q0;->z()Ljava/lang/String;

    move-result-object v21

    new-instance v14, Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;

    invoke-direct/range {v14 .. v21}, Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v4, Lu02/a;->a:Lu02/a$a;

    iget-object v6, v0, Lf70/z0;->g:Ltr2/n;

    new-instance v8, Lf70/z0$e;

    const/4 v7, 0x0

    invoke-direct {v8, v0, v14, v2, v7}, Lf70/z0$e;-><init>(Lf70/z0;Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;Lcom/whoop/domain/model/WhoopStrapInfo;Lq83/d;)V

    iput-object v1, v9, Lf70/z0$d;->w:Ljava/lang/Object;

    iput-object v7, v9, Lf70/z0$d;->x:Ljava/lang/Object;

    iput-object v7, v9, Lf70/z0$d;->y:Ljava/lang/Object;

    iput v5, v9, Lf70/z0$d;->G:I

    move-object v5, v6

    const/4 v6, 0x0

    const-string v7, "Failed to sign user up"

    const/4 v10, 0x2

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_1

    :goto_3
    return-object v3

    :goto_4
    check-cast v2, Lu02/a;

    instance-of v1, v2, Lu02/a$c;

    if-eqz v1, :cond_8

    iget-object v1, v0, Lf70/z0;->g:Ltr2/n;

    const-string v3, "Successfully signed up"

    new-array v4, v13, [Lqr2/a$a;

    invoke-interface {v1, v3, v4}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, v0, Lf70/z0;->c:Lod1/j;

    check-cast v2, Lu02/a$c;

    invoke-virtual {v2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/domain/model/AuthMaterial;

    invoke-virtual {v3}, Lcom/whoop/domain/model/AuthMaterial;->getAccessToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lod1/j;->e(Ljava/lang/String;)V

    iget-object v1, v0, Lf70/z0;->c:Lod1/j;

    invoke-virtual {v2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/domain/model/AuthMaterial;

    invoke-virtual {v1, v3}, Lod1/j;->f(Lcom/whoop/domain/model/AuthMaterial;)V

    new-instance v1, Lf70/f;

    invoke-virtual {v2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v23, v2

    check-cast v23, Lcom/whoop/domain/model/AuthMaterial;

    const v32, 0x1feff

    const/16 v33, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v14 .. v33}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v2

    invoke-direct {v1, v2, v12}, Lf70/f;-><init>(Lf70/e$b;Z)V

    return-object v1

    :cond_8
    instance-of v1, v2, Lu02/a$b;

    if-eqz v1, :cond_d

    instance-of v1, v2, Lu02/a$b$a;

    if-eqz v1, :cond_b

    move-object v1, v2

    check-cast v1, Lu02/a$b$a;

    invoke-virtual {v1}, Lu02/a$b$a;->d()I

    move-result v1

    const/16 v3, 0x199

    if-eq v1, v3, :cond_a

    const/16 v3, 0x1a6

    if-eq v1, v3, :cond_9

    goto :goto_5

    :cond_9
    iget-object v1, v0, Lf70/z0;->g:Ltr2/n;

    const-string v2, "Password policy violation during signup"

    new-array v3, v13, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v1, Lf70/f;

    sget-object v30, Lf70/u0$b;->a:Lf70/u0$b;

    const v32, 0x17fdf

    const/16 v33, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    invoke-static/range {v14 .. v33}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v2

    invoke-direct {v1, v2, v13}, Lf70/f;-><init>(Lf70/e$b;Z)V

    return-object v1

    :cond_a
    iget-object v1, v0, Lf70/z0;->g:Ltr2/n;

    const-string v2, "Password reused error during signup"

    new-array v3, v13, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v1, Lf70/f;

    sget-object v30, Lf70/u0$a;->a:Lf70/u0$a;

    const v32, 0x17fdf

    const/16 v33, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    invoke-static/range {v14 .. v33}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v2

    invoke-direct {v1, v2, v13}, Lf70/f;-><init>(Lf70/e$b;Z)V

    return-object v1

    :cond_b
    :goto_5
    check-cast v2, Lu02/a$b;

    invoke-static {v2}, Ls70/a;->a(Lu02/a$b;)Z

    move-result v1

    if-eqz v1, :cond_c

    new-instance v1, Lf70/f;

    invoke-static {}, Ls70/a;->b()Lf70/e$b;

    move-result-object v2

    invoke-direct {v1, v2, v13}, Lf70/f;-><init>(Lf70/e$b;Z)V

    return-object v1

    :cond_c
    new-instance v1, Lf70/f;

    const v32, 0x1ffdf

    const/16 v33, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v14 .. v33}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v2

    invoke-direct {v1, v2, v13}, Lf70/f;-><init>(Lf70/e$b;Z)V

    return-object v1

    :cond_d
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method


# virtual methods
.method public final f(Lf70/e$b;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/e$b;",
            "Lq83/d<",
            "-",
            "Lf70/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lf70/z0$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lf70/z0$c;

    iget v1, v0, Lf70/z0$c;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf70/z0$c;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf70/z0$c;

    invoke-direct {v0, p0, p2}, Lf70/z0$c;-><init>(Lf70/z0;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lf70/z0$c;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf70/z0$c;->F:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lf70/z0$c;->x:Ljava/lang/Object;

    check-cast p1, Lf70/z0;

    iget-object p1, v0, Lf70/z0$c;->w:Ljava/lang/Object;

    check-cast p1, Lf70/e$b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lf70/z0$c;->x:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/domain/model/AuthMaterial;

    iget-object p1, v0, Lf70/z0$c;->w:Ljava/lang/Object;

    check-cast p1, Lf70/e$b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lf70/z0;->c:Lod1/j;

    invoke-virtual {p2}, Lod1/j;->b()Lcom/whoop/domain/model/AuthMaterial;

    move-result-object p2

    if-eqz p2, :cond_6

    iput-object p1, v0, Lf70/z0$c;->w:Ljava/lang/Object;

    iput-object v6, v0, Lf70/z0$c;->x:Ljava/lang/Object;

    iput v3, v0, Lf70/z0$c;->y:I

    iput v5, v0, Lf70/z0$c;->F:I

    invoke-direct {p0, p2, p1, v0}, Lf70/z0;->e(Lcom/whoop/domain/model/AuthMaterial;Lf70/e$b;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    check-cast p2, Lf70/f;

    if-nez p2, :cond_5

    goto :goto_2

    :cond_5
    return-object p2

    :cond_6
    :goto_2
    iput-object v6, v0, Lf70/z0$c;->w:Ljava/lang/Object;

    iput-object v6, v0, Lf70/z0$c;->x:Ljava/lang/Object;

    iput v3, v0, Lf70/z0$c;->y:I

    iput v4, v0, Lf70/z0$c;->F:I

    invoke-direct {p0, p1, v0}, Lf70/z0;->g(Lf70/e$b;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    check-cast p2, Lf70/f;

    return-object p2
.end method
