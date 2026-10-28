.class public final Lf70/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001c\u0010\u0011\u001a\u00020\u00102\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0086@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lf70/c;",
        "",
        "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;",
        "activationAuthenticatedApi",
        "Lp70/b;",
        "whoopStrapInfoProvider",
        "Lh80/c;",
        "analyticsHelper",
        "Lrv1/a;",
        "membershipRepository",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lh80/c;Lrv1/a;Ltr2/n;)V",
        "Lf70/q0;",
        "memberInfo",
        "Lf70/e;",
        "b",
        "(Lf70/q0;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;",
        "Lp70/b;",
        "c",
        "Lh80/c;",
        "d",
        "Lrv1/a;",
        "e",
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

.field private final c:Lh80/c;

.field private final d:Lrv1/a;

.field private final e:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lh80/c;Lrv1/a;Ltr2/n;)V
    .locals 1

    const-string v0, "activationAuthenticatedApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapInfoProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "membershipRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf70/c;->a:Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    .line 3
    iput-object p2, p0, Lf70/c;->b:Lp70/b;

    .line 4
    iput-object p3, p0, Lf70/c;->c:Lh80/c;

    .line 5
    iput-object p4, p0, Lf70/c;->d:Lrv1/a;

    .line 6
    iput-object p5, p0, Lf70/c;->e:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lh80/c;Lrv1/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 7
    sget-object p5, Ltr2/n;->a:Ltr2/n$a;

    const-string p6, "AccountTransitionLegacyAfterActivationHelper"

    invoke-virtual {p5, p6}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p5

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lf70/c;-><init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lh80/c;Lrv1/a;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lf70/c;)Lcom/whoop/activation/domain/ActivationAuthenticatedApi;
    .locals 0

    iget-object p0, p0, Lf70/c;->a:Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    return-object p0
.end method


# virtual methods
.method public final b(Lf70/q0;Lq83/d;)Ljava/lang/Object;
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/q0;",
            "Lq83/d<",
            "-",
            "Lf70/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lf70/c$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lf70/c$a;

    iget v3, v2, Lf70/c$a;->E:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lf70/c$a;->E:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lf70/c$a;

    invoke-direct {v2, v0, v1}, Lf70/c$a;-><init>(Lf70/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Lf70/c$a;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Lf70/c$a;->E:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v2, v8, Lf70/c$a;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v8, Lf70/c$a;->w:Ljava/lang/Object;

    check-cast v2, Lf70/q0;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v3, v1

    move-object v1, v2

    goto :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lf70/c;->b:Lp70/b;

    invoke-interface {v1}, Lp70/b;->a()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getStrapSignature()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_3
    move-object v1, v3

    :goto_2
    sget-object v5, Lu02/a;->a:Lu02/a$a;

    iget-object v6, v0, Lf70/c;->e:Ltr2/n;

    new-instance v7, Lf70/c$b;

    invoke-direct {v7, v0, v1, v3}, Lf70/c$b;-><init>(Lf70/c;Ljava/lang/String;Lq83/d;)V

    move-object/from16 v1, p1

    iput-object v1, v8, Lf70/c$a;->w:Ljava/lang/Object;

    iput-object v3, v8, Lf70/c$a;->x:Ljava/lang/Object;

    iput v4, v8, Lf70/c$a;->E:I

    move-object v3, v5

    const/4 v5, 0x0

    move-object v4, v6

    const-string v6, "Failed to fetch account transition legacy after-activation screens"

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_4

    return-object v2

    :cond_4
    :goto_3
    check-cast v3, Lu02/a;

    instance-of v2, v3, Lu02/a$c;

    if-eqz v2, :cond_9

    iget-object v2, v0, Lf70/c;->d:Lrv1/a;

    invoke-virtual {v2}, Lrv1/a;->M()V

    check-cast v3, Lu02/a$c;

    invoke-virtual {v3}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/activation/domain/models/AccountTransitionLegacyAfterActivationResponse;

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/AccountTransitionLegacyAfterActivationResponse;->getItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v6, v4, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    if-eqz v6, :cond_5

    invoke-interface {v5, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v1, v0, Lf70/c;->e:Ltr2/n;

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "Account transition legacy after-activation BFF returned an empty list of screens"

    invoke-interface {v1, v3, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v4, Lf70/e$b;

    sget-object v9, Lf70/b0;->ERROR:Lf70/b0;

    const v22, 0x1ffef

    const/16 v23, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

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

    const/16 v21, 0x0

    invoke-direct/range {v4 .. v23}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_7
    iget-object v2, v0, Lf70/c;->c:Lh80/c;

    invoke-virtual {v3}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/activation/domain/models/AccountTransitionLegacyAfterActivationResponse;

    invoke-virtual {v4}, Lcom/whoop/activation/domain/models/AccountTransitionLegacyAfterActivationResponse;->getEventProperties()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v2, v4}, Lh80/c;->A(Ljava/util/Map;)V

    sget-object v9, Lf70/b0;->CONTENT:Lf70/b0;

    if-nez v1, :cond_8

    new-instance v10, Lf70/q0;

    const v41, 0x3fffffff    # 1.9999999f

    const/16 v42, 0x0

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

    invoke-direct/range {v10 .. v42}, Lf70/q0;-><init>(Ld70/c;Ld70/e;Ld70/d;Ld70/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld70/b;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp90/e;Lr80/a;Lcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/Integer;Ljava/util/List;ZZZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/domain/model/UnitSystem;IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v10

    goto :goto_5

    :cond_8
    move-object v8, v1

    :goto_5
    invoke-virtual {v3}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/activation/domain/models/AccountTransitionLegacyAfterActivationResponse;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/AccountTransitionLegacyAfterActivationResponse;->getOnComplete()Lcom/whoop/navigation/e;

    move-result-object v21

    new-instance v6, Ln70/e;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v12

    sget-object v14, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->ACCOUNT_TRANSITION_LEGACY_AFTER_ACTIVATION:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object v10, v6

    invoke-direct/range {v10 .. v15}, Ln70/e;-><init>(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;)V

    new-instance v4, Lf70/e$b;

    const v22, 0xffe4

    const/16 v23, 0x0

    const/4 v7, 0x0

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

    invoke-direct/range {v4 .. v23}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_9
    instance-of v1, v3, Lu02/a$b;

    if-eqz v1, :cond_a

    new-instance v2, Lf70/e$b;

    sget-object v7, Lf70/b0;->ERROR:Lf70/b0;

    const v20, 0x1ffef

    const/16 v21, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

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

    const/16 v19, 0x0

    invoke-direct/range {v2 .. v21}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_a
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
