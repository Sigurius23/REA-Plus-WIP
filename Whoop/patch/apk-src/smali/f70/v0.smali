.class public final Lf70/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ:\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000c\u001a\u00020\n2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lf70/v0;",
        "",
        "Lcom/whoop/activation/domain/ActivationApi;",
        "activationApi",
        "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;",
        "activationAuthenticatedApi",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Ltr2/n;)V",
        "",
        "accessToken",
        "strapSignature",
        "",
        "specifiedIndex",
        "Lf70/q0;",
        "memberInfo",
        "Lf70/e;",
        "c",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lf70/q0;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/activation/domain/ActivationApi;",
        "b",
        "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;",
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

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Ltr2/n;)V
    .locals 1

    const-string v0, "activationApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activationAuthenticatedApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf70/v0;->a:Lcom/whoop/activation/domain/ActivationApi;

    iput-object p2, p0, Lf70/v0;->b:Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    iput-object p3, p0, Lf70/v0;->c:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lf70/v0;)Lcom/whoop/activation/domain/ActivationApi;
    .locals 0

    iget-object p0, p0, Lf70/v0;->a:Lcom/whoop/activation/domain/ActivationApi;

    return-object p0
.end method

.method public static final synthetic b(Lf70/v0;)Lcom/whoop/activation/domain/ActivationAuthenticatedApi;
    .locals 0

    iget-object p0, p0, Lf70/v0;->b:Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    return-object p0
.end method


# virtual methods
.method public final c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lf70/q0;Lq83/d;)Ljava/lang/Object;
    .locals 52
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
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

    move-object/from16 v2, p5

    instance-of v3, v2, Lf70/v0$a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lf70/v0$a;

    iget v4, v3, Lf70/v0$a;->I:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lf70/v0$a;->I:I

    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lf70/v0$a;

    invoke-direct {v3, v0, v2}, Lf70/v0$a;-><init>(Lf70/v0;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v2, v9, Lf70/v0$a;->G:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v9, Lf70/v0$a;->I:I

    const/4 v12, 0x2

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v13, :cond_2

    if-ne v4, v12, :cond_1

    iget-object v1, v9, Lf70/v0$a;->E:Ljava/lang/Object;

    check-cast v1, Lf70/v0;

    iget-object v1, v9, Lf70/v0$a;->z:Ljava/lang/Object;

    check-cast v1, Lf70/q0;

    iget-object v3, v9, Lf70/v0$a;->y:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    iget-object v4, v9, Lf70/v0$a;->x:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v9, Lf70/v0$a;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v9, Lf70/v0$a;->E:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v9, Lf70/v0$a;->z:Ljava/lang/Object;

    check-cast v1, Lf70/q0;

    iget-object v4, v9, Lf70/v0$a;->y:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    iget-object v5, v9, Lf70/v0$a;->x:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v9, Lf70/v0$a;->w:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v51, v4

    move-object v4, v1

    move-object v1, v5

    move-object v5, v2

    move-object/from16 v2, v51

    goto :goto_2

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p1, :cond_5

    sget-object v4, Lu02/a;->a:Lu02/a$a;

    iget-object v5, v0, Lf70/v0;->c:Ltr2/n;

    new-instance v8, Lf70/v0$b;

    invoke-direct {v8, v0, v1, v15}, Lf70/v0$b;-><init>(Lf70/v0;Ljava/lang/String;Lq83/d;)V

    iput-object v15, v9, Lf70/v0$a;->w:Ljava/lang/Object;

    iput-object v1, v9, Lf70/v0$a;->x:Ljava/lang/Object;

    move-object/from16 v2, p3

    iput-object v2, v9, Lf70/v0$a;->y:Ljava/lang/Object;

    move-object/from16 v6, p4

    iput-object v6, v9, Lf70/v0$a;->z:Ljava/lang/Object;

    iput-object v15, v9, Lf70/v0$a;->E:Ljava/lang/Object;

    iput v14, v9, Lf70/v0$a;->F:I

    iput v13, v9, Lf70/v0$a;->I:I

    const/4 v6, 0x0

    const-string v7, "Failed to get postPairing (authed)"

    const/4 v10, 0x2

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_4

    goto :goto_4

    :cond_4
    move-object v5, v4

    move-object/from16 v4, p4

    :goto_2
    check-cast v5, Lu02/a;

    if-nez v5, :cond_7

    goto :goto_3

    :cond_5
    move-object/from16 v2, p3

    move-object/from16 v4, p4

    :goto_3
    sget-object v5, Lu02/a;->a:Lu02/a$a;

    move-object v6, v5

    iget-object v5, v0, Lf70/v0;->c:Ltr2/n;

    new-instance v8, Lf70/v0$c;

    invoke-direct {v8, v0, v1, v15}, Lf70/v0$c;-><init>(Lf70/v0;Ljava/lang/String;Lq83/d;)V

    iput-object v15, v9, Lf70/v0$a;->w:Ljava/lang/Object;

    iput-object v15, v9, Lf70/v0$a;->x:Ljava/lang/Object;

    iput-object v2, v9, Lf70/v0$a;->y:Ljava/lang/Object;

    iput-object v4, v9, Lf70/v0$a;->z:Ljava/lang/Object;

    iput-object v15, v9, Lf70/v0$a;->E:Ljava/lang/Object;

    iput v14, v9, Lf70/v0$a;->F:I

    iput v12, v9, Lf70/v0$a;->I:I

    move-object v1, v4

    move-object v4, v6

    const/4 v6, 0x0

    const-string v7, "Failed to get PostPairing (un-authed)"

    const/4 v10, 0x2

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_6

    :goto_4
    return-object v3

    :cond_6
    move-object v3, v2

    move-object v2, v4

    :goto_5
    move-object v5, v2

    check-cast v5, Lu02/a;

    move-object v4, v1

    move-object v2, v3

    :cond_7
    instance-of v1, v5, Lu02/a$c;

    if-eqz v1, :cond_c

    check-cast v5, Lu02/a$c;

    invoke-virtual {v5}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/activation/domain/models/PostPairingEmailResponse;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/PostPairingEmailResponse;->getItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    if-eqz v6, :cond_8

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_9
    new-instance v15, Lf70/e$b;

    new-instance v17, Ln70/e;

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v13

    invoke-static {v1, v14, v2}, Le93/b;->n(III)I

    move-result v14

    :cond_a
    move v6, v14

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    sget-object v9, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->POST_PAIRING:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object/from16 v5, v17

    invoke-direct/range {v5 .. v10}, Ln70/e;-><init>(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;)V

    if-nez v4, :cond_b

    new-instance v18, Lf70/q0;

    const v49, 0x3fffffff    # 1.9999999f

    const/16 v50, 0x0

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

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    invoke-direct/range {v18 .. v50}, Lf70/q0;-><init>(Ld70/c;Ld70/e;Ld70/d;Ld70/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld70/b;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp90/e;Lr80/a;Lcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/Integer;Ljava/util/List;ZZZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/domain/model/UnitSystem;IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v19, v18

    goto :goto_7

    :cond_b
    move-object/from16 v19, v4

    :goto_7
    const v33, 0x1fff4

    const/16 v34, 0x0

    const/16 v18, 0x0

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

    move-object/from16 v16, v3

    invoke-direct/range {v15 .. v34}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v15

    :cond_c
    instance-of v1, v5, Lu02/a$b;

    if-eqz v1, :cond_e

    check-cast v5, Lu02/a$b;

    invoke-static {v5}, Ls70/a;->a(Lu02/a$b;)Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {}, Ls70/a;->b()Lf70/e$b;

    move-result-object v1

    return-object v1

    :cond_d
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

    :cond_e
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
