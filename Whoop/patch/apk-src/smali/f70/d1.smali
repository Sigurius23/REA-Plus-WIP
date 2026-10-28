.class public final Lf70/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J-\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008*\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lf70/d1;",
        "",
        "Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;",
        "membershipApi",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;Ltr2/n;)V",
        "",
        "Lcom/whoop/activation/domain/models/steps/PlanOption;",
        "previous",
        "d",
        "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;",
        "Lf70/e$b;",
        "prevDomainResult",
        "",
        "flow",
        "Lf70/f;",
        "b",
        "(Lf70/e$b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;",
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
.field private final a:Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;Ltr2/n;)V
    .locals 1

    const-string v0, "membershipApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf70/d1;->a:Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;

    .line 3
    iput-object p2, p0, Lf70/d1;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "UpcycleUpdateInfoHelper"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lf70/d1;-><init>(Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lf70/d1;)Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;
    .locals 0

    iget-object p0, p0, Lf70/d1;->a:Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;

    return-object p0
.end method

.method public static synthetic c(Lf70/d1;Lf70/e$b;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lf70/d1;->b(Lf70/e$b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final d(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/PlanOption;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/PlanOption;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/PlanOption;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/whoop/activation/domain/models/steps/PlanOption;

    invoke-virtual {v3}, Lcom/whoop/activation/domain/models/steps/PlanOption;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_2

    :cond_0
    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/whoop/activation/domain/models/steps/PlanOption;

    invoke-virtual {v5}, Lcom/whoop/activation/domain/models/steps/PlanOption;->getCommitmentType()Lcom/whoop/activation/domain/models/steps/CommitmentType;

    move-result-object v5

    invoke-virtual {v3}, Lcom/whoop/activation/domain/models/steps/PlanOption;->getCommitmentType()Lcom/whoop/activation/domain/models/steps/CommitmentType;

    move-result-object v6

    if-ne v5, v6, :cond_1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    check-cast v4, Lcom/whoop/activation/domain/models/steps/PlanOption;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/steps/PlanOption;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v15

    if-eqz v15, :cond_3

    const/16 v16, 0x7ff

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v3 .. v17}, Lcom/whoop/activation/domain/models/steps/PlanOption;->copy$default(Lcom/whoop/activation/domain/models/steps/PlanOption;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/activation/domain/models/steps/PlanOption;

    move-result-object v3

    :cond_3
    :goto_2
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    return-object v1
.end method


# virtual methods
.method public final b(Lf70/e$b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 48
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/e$b;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lf70/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lf70/d1$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lf70/d1$a;

    iget v3, v2, Lf70/d1$a;->E:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lf70/d1$a;->E:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lf70/d1$a;

    invoke-direct {v2, v0, v1}, Lf70/d1$a;-><init>(Lf70/d1;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Lf70/d1$a;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Lf70/d1$a;->E:I

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v12, :cond_1

    iget-object v2, v8, Lf70/d1$a;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v8, Lf70/d1$a;->w:Ljava/lang/Object;

    check-cast v2, Lf70/e$b;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v2

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v3, Lu02/a;->a:Lu02/a$a;

    iget-object v4, v0, Lf70/d1;->b:Ltr2/n;

    new-instance v7, Lf70/d1$b;

    move-object/from16 v1, p2

    invoke-direct {v7, v0, v1, v11}, Lf70/d1$b;-><init>(Lf70/d1;Ljava/lang/String;Lq83/d;)V

    move-object/from16 v1, p1

    iput-object v1, v8, Lf70/d1$a;->w:Ljava/lang/Object;

    iput-object v11, v8, Lf70/d1$a;->x:Ljava/lang/Object;

    iput v12, v8, Lf70/d1$a;->E:I

    const/4 v5, 0x0

    const-string v6, "Failed to acquire upcycle updated info"

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_3

    return-object v2

    :cond_3
    move-object v13, v1

    move-object v1, v3

    :goto_2
    check-cast v1, Lu02/a;

    instance-of v2, v1, Lu02/a$c;

    if-eqz v2, :cond_6

    check-cast v1, Lu02/a$c;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/activation/domain/models/steps/FinalizedUpcycleDetails;

    invoke-virtual {v13}, Lf70/e$b;->m()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_5

    check-cast v2, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v11, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    instance-of v4, v3, Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;

    if-eqz v4, :cond_4

    move-object v14, v3

    check-cast v14, Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/FinalizedUpcycleDetails;->getPlanPickerScreenContent()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v14}, Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;->getPlanOptions()Ljava/util/List;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Lf70/d1;->d(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v17

    const/16 v24, 0x1fb

    const/16 v25, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v14 .. v25}, Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;->copy$default(Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;

    move-result-object v3

    :cond_4
    invoke-interface {v11, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    move-object v14, v11

    invoke-virtual {v13}, Lf70/e$b;->h()Lf70/q0;

    move-result-object v15

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/FinalizedUpcycleDetails;->getJoinTodayScreenContent()Ljava/util/List;

    move-result-object v34

    const v46, 0x3ffbffff

    const/16 v47, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

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

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    invoke-static/range {v15 .. v47}, Lf70/q0;->b(Lf70/q0;Ld70/c;Ld70/e;Ld70/d;Ld70/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld70/b;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp90/e;Lr80/a;Lcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/Integer;Ljava/util/List;ZZZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/domain/model/UnitSystem;IZZZILjava/lang/Object;)Lf70/q0;

    move-result-object v17

    new-instance v1, Lf70/f;

    const v31, 0x1fff6

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v13 .. v32}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v2

    invoke-direct {v1, v2, v12}, Lf70/f;-><init>(Lf70/e$b;Z)V

    return-object v1

    :cond_6
    instance-of v1, v1, Lu02/a$b;

    if-eqz v1, :cond_7

    invoke-virtual {v13}, Lf70/e$b;->h()Lf70/q0;

    move-result-object v14

    const v45, 0x3ffbffff

    const/16 v46, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

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

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    invoke-static/range {v14 .. v46}, Lf70/q0;->b(Lf70/q0;Ld70/c;Ld70/e;Ld70/d;Ld70/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld70/b;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp90/e;Lr80/a;Lcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/Integer;Ljava/util/List;ZZZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/domain/model/UnitSystem;IZZZILjava/lang/Object;)Lf70/q0;

    move-result-object v17

    new-instance v1, Lf70/f;

    const v31, 0x1fff7

    const/4 v14, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v25, 0x0

    invoke-static/range {v13 .. v32}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v2

    invoke-direct {v1, v2, v12}, Lf70/f;-><init>(Lf70/e$b;Z)V

    return-object v1

    :cond_7
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
