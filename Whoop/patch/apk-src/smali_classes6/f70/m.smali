.class public final Lf70/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf70/m$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0013B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ&\u0010\u0011\u001a\u00020\u00102\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0086@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lf70/m;",
        "",
        "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;",
        "activationAuthenticatedApi",
        "Lp70/b;",
        "whoopStrapInfoProvider",
        "Lh80/c;",
        "analyticsHelper",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lh80/c;Ltr2/n;)V",
        "",
        "source",
        "Lf70/q0;",
        "memberInfo",
        "Lf70/e;",
        "b",
        "(Ljava/lang/String;Lf70/q0;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;",
        "Lp70/b;",
        "c",
        "Lh80/c;",
        "d",
        "Ltr2/n;",
        "e",
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


# static fields
.field private static final e:Lf70/m$a;

.field public static final f:I

.field private static final g:Lcom/whoop/navigation/e;


# instance fields
.field private final a:Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

.field private final b:Lp70/b;

.field private final c:Lh80/c;

.field private final d:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lf70/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf70/m$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lf70/m;->e:Lf70/m$a;

    const/16 v0, 0x8

    sput v0, Lf70/m;->f:I

    new-instance v2, Lcom/whoop/navigation/e;

    sget-object v3, Lcom/whoop/navigation/AppScreen$u2;->w:Lcom/whoop/navigation/AppScreen$u2;

    new-instance v4, Lcom/whoop/navigation/HomeScreenModel;

    const/4 v0, 0x3

    invoke-direct {v4, v1, v1, v0, v1}, Lcom/whoop/navigation/HomeScreenModel;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lf70/m;->g:Lcom/whoop/navigation/e;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lh80/c;Ltr2/n;)V
    .locals 1

    const-string v0, "activationAuthenticatedApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapInfoProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf70/m;->a:Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    .line 3
    iput-object p2, p0, Lf70/m;->b:Lp70/b;

    .line 4
    iput-object p3, p0, Lf70/m;->c:Lh80/c;

    .line 5
    iput-object p4, p0, Lf70/m;->d:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lh80/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "AfterActivationFinalScreensHelper"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lf70/m;-><init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lh80/c;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lf70/m;)Lcom/whoop/activation/domain/ActivationAuthenticatedApi;
    .locals 0

    iget-object p0, p0, Lf70/m;->a:Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Lf70/q0;Lq83/d;)Ljava/lang/Object;
    .locals 55
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lf70/q0;",
            "Lq83/d<",
            "-",
            "Lf70/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lf70/m$b;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lf70/m$b;

    iget v3, v2, Lf70/m$b;->F:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lf70/m$b;->F:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lf70/m$b;

    invoke-direct {v2, v0, v1}, Lf70/m$b;-><init>(Lf70/m;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Lf70/m$b;->z:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Lf70/m$b;->F:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v2, v8, Lf70/m$b;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v8, Lf70/m$b;->x:Ljava/lang/Object;

    check-cast v2, Lf70/q0;

    iget-object v3, v8, Lf70/m$b;->w:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

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

    iget-object v1, v0, Lf70/m;->b:Lp70/b;

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

    iget-object v6, v0, Lf70/m;->d:Ltr2/n;

    new-instance v7, Lf70/m$c;

    move-object/from16 v9, p1

    invoke-direct {v7, v0, v9, v1, v3}, Lf70/m$c;-><init>(Lf70/m;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput-object v3, v8, Lf70/m$b;->w:Ljava/lang/Object;

    move-object/from16 v1, p2

    iput-object v1, v8, Lf70/m$b;->x:Ljava/lang/Object;

    iput-object v3, v8, Lf70/m$b;->y:Ljava/lang/Object;

    iput v4, v8, Lf70/m$b;->F:I

    move-object v3, v5

    const/4 v5, 0x0

    move-object v4, v6

    const-string v6, "Failed to fetch after-activation final screens"

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

    if-eqz v2, :cond_a

    check-cast v3, Lu02/a$c;

    invoke-virtual {v3}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/activation/domain/models/AfterActivationFinalScreensResponse;

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/AfterActivationFinalScreensResponse;->getItems()Ljava/util/List;

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

    const/4 v4, 0x0

    if-eqz v2, :cond_7

    iget-object v1, v0, Lf70/m;->d:Ltr2/n;

    const-string v2, "After-activation final screens BFF returned an empty list of screens; falling back to Home"

    new-array v3, v4, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v4, Lf70/e$b;

    new-instance v5, Ln70/e;

    sget-object v9, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->AFTER_ACTIVATION_FINAL_SCREENS:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    new-instance v10, Ln70/d$b;

    sget-object v1, Lf70/m;->g:Lcom/whoop/navigation/e;

    invoke-direct {v10, v1}, Ln70/d$b;-><init>(Lcom/whoop/navigation/e;)V

    const/4 v11, 0x7

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v12}, Ln70/e;-><init>(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v22, 0x1fffd

    const/16 v23, 0x0

    move-object v6, v5

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

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v4 .. v23}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_7
    invoke-virtual {v3}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/activation/domain/models/AfterActivationFinalScreensResponse;

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/AfterActivationFinalScreensResponse;->getOnComplete()Lcom/whoop/navigation/e;

    move-result-object v2

    if-nez v2, :cond_8

    iget-object v2, v0, Lf70/m;->d:Ltr2/n;

    const-string v6, "After-activation final screens BFF omitted onComplete; falling back to Home"

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v2, v6, v4}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v2, Lf70/m;->g:Lcom/whoop/navigation/e;

    :cond_8
    move-object/from16 v21, v2

    iget-object v2, v0, Lf70/m;->c:Lh80/c;

    invoke-virtual {v3}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/activation/domain/models/AfterActivationFinalScreensResponse;

    invoke-virtual {v3}, Lcom/whoop/activation/domain/models/AfterActivationFinalScreensResponse;->getEventProperties()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v2, v3}, Lh80/c;->C(Ljava/util/Map;)V

    sget-object v9, Lf70/b0;->CONTENT:Lf70/b0;

    if-nez v1, :cond_9

    new-instance v22, Lf70/q0;

    const v53, 0x3fffffff    # 1.9999999f

    const/16 v54, 0x0

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

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    invoke-direct/range {v22 .. v54}, Lf70/q0;-><init>(Ld70/c;Ld70/e;Ld70/d;Ld70/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld70/b;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp90/e;Lr80/a;Lcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/Integer;Ljava/util/List;ZZZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/domain/model/UnitSystem;IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v8, v22

    goto :goto_5

    :cond_9
    move-object v8, v1

    :goto_5
    new-instance v6, Ln70/e;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v12

    sget-object v14, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->AFTER_ACTIVATION_FINAL_SCREENS:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

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

    :cond_a
    instance-of v1, v3, Lu02/a$b;

    if-eqz v1, :cond_b

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

    :cond_b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
