.class public final Lg70/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg70/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J \u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lg70/a;",
        "",
        "Lh80/c;",
        "analyticsHelper",
        "Ln70/c;",
        "progressInteractor",
        "Lf70/y0;",
        "screenAdvancementCalculator",
        "Lod1/j;",
        "pendingUserSessionRepository",
        "Lf70/r0;",
        "memberInfoHandler",
        "<init>",
        "(Lh80/c;Ln70/c;Lf70/y0;Lod1/j;Lf70/r0;)V",
        "Lf70/e$b;",
        "prevDomainResult",
        "b",
        "(Lf70/e$b;)Lf70/e$b;",
        "Lf70/e;",
        "Lf70/d$c0;",
        "action",
        "a",
        "(Lf70/e;Lf70/d$c0;Lq83/d;)Ljava/lang/Object;",
        "Lh80/c;",
        "Ln70/c;",
        "c",
        "Lf70/y0;",
        "d",
        "Lod1/j;",
        "e",
        "Lf70/r0;",
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
.field private final a:Lh80/c;

.field private final b:Ln70/c;

.field private final c:Lf70/y0;

.field private final d:Lod1/j;

.field private final e:Lf70/r0;


# direct methods
.method public constructor <init>(Lh80/c;Ln70/c;Lf70/y0;Lod1/j;Lf70/r0;)V
    .locals 1

    const-string v0, "analyticsHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressInteractor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screenAdvancementCalculator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pendingUserSessionRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberInfoHandler"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg70/a;->a:Lh80/c;

    iput-object p2, p0, Lg70/a;->b:Ln70/c;

    iput-object p3, p0, Lg70/a;->c:Lf70/y0;

    iput-object p4, p0, Lg70/a;->d:Lod1/j;

    iput-object p5, p0, Lg70/a;->e:Lf70/r0;

    return-void
.end method

.method private final b(Lf70/e$b;)Lf70/e$b;
    .locals 2

    invoke-virtual {p1}, Lf70/e$b;->m()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lf70/e$b;->l()Ln70/e;

    move-result-object v1

    invoke-virtual {v1}, Ln70/e;->d()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    instance-of v0, v0, Lcom/whoop/activation/domain/models/steps/StateSelectionStepModel;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lg70/a;->e:Lf70/r0;

    invoke-virtual {v0, p1}, Lf70/r0;->c(Lf70/e$b;)Lf70/e$b;

    move-result-object p1

    :cond_1
    return-object p1
.end method


# virtual methods
.method public final a(Lf70/e;Lf70/d$c0;Lq83/d;)Ljava/lang/Object;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/e;",
            "Lf70/d$c0;",
            "Lq83/d<",
            "-",
            "Lf70/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lg70/a$b;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lg70/a$b;

    iget v4, v3, Lg70/a$b;->G:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lg70/a$b;->G:I

    goto :goto_0

    :cond_0
    new-instance v3, Lg70/a$b;

    invoke-direct {v3, v0, v2}, Lg70/a$b;-><init>(Lg70/a;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lg70/a$b;->E:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lg70/a$b;->G:I

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v3, Lg70/a$b;->z:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    iget-object v1, v3, Lg70/a$b;->y:Ljava/lang/Object;

    check-cast v1, Lf70/e$b;

    iget-object v4, v3, Lg70/a$b;->x:Ljava/lang/Object;

    check-cast v4, Lf70/d$c0;

    iget-object v3, v3, Lg70/a$b;->w:Ljava/lang/Object;

    check-cast v3, Lf70/e;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, v1

    goto/16 :goto_7

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v2, v1, Lf70/e$b;

    if-eqz v2, :cond_e

    check-cast v1, Lf70/e$b;

    invoke-virtual {v1}, Lf70/e$b;->m()Ljava/util/List;

    move-result-object v2

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Lf70/e$b;->l()Ln70/e;

    move-result-object v7

    invoke-virtual {v7}, Ln70/e;->d()I

    move-result v7

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    goto :goto_1

    :cond_3
    move-object v2, v5

    :goto_1
    instance-of v2, v2, Lcom/whoop/activation/domain/models/steps/FamilyPlanBlockStepModel;

    if-nez v2, :cond_9

    iget-object v2, v0, Lg70/a;->a:Lh80/c;

    new-instance v7, Lh80/b$i;

    invoke-virtual {v1}, Lf70/e$b;->m()Ljava/util/List;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-virtual {v1}, Lf70/e$b;->l()Ln70/e;

    move-result-object v9

    invoke-virtual {v9}, Ln70/e;->d()I

    move-result v9

    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    if-eqz v8, :cond_4

    invoke-interface {v8}, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v8

    goto :goto_2

    :cond_4
    move-object v8, v5

    :goto_2
    if-nez v8, :cond_5

    const-string v8, ""

    :cond_5
    invoke-virtual/range {p2 .. p2}, Lf70/d$c0;->a()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object v9

    sget-object v10, Lg70/a$a;->a:[I

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v9, v10, v9

    if-eq v9, v6, :cond_8

    const/4 v10, 0x2

    if-eq v9, v10, :cond_8

    const/4 v10, 0x3

    if-eq v9, v10, :cond_8

    const/4 v10, 0x4

    if-eq v9, v10, :cond_7

    const/4 v10, 0x5

    if-eq v9, v10, :cond_6

    invoke-virtual/range {p2 .. p2}, Lf70/d$c0;->a()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "toLowerCase(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_3
    move-object v12, v9

    goto :goto_4

    :cond_6
    const-string v9, "device_education"

    goto :goto_3

    :cond_7
    const-string v9, "pairing"

    goto :goto_3

    :cond_8
    const-string v9, "account_creation"

    goto :goto_3

    :goto_4
    const/16 v14, 0x22

    const/4 v15, 0x0

    const/4 v9, 0x0

    const-string v10, "icon"

    const-string v11, "back"

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v15}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v7}, Lh80/c;->p(Lh80/b;)V

    :cond_9
    invoke-direct {v0, v1}, Lg70/a;->b(Lf70/e$b;)Lf70/e$b;

    move-result-object v2

    invoke-virtual {v1}, Lf70/e$b;->m()Ljava/util/List;

    move-result-object v7

    if-eqz v7, :cond_a

    invoke-virtual {v1}, Lf70/e$b;->l()Ln70/e;

    move-result-object v8

    invoke-virtual {v8}, Ln70/e;->d()I

    move-result v8

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    goto :goto_5

    :cond_a
    move-object v7, v5

    :goto_5
    iget-object v8, v0, Lg70/a;->b:Ln70/c;

    iget-object v9, v0, Lg70/a;->c:Lf70/y0;

    invoke-virtual {v9, v1}, Lf70/y0;->b(Lf70/e$b;)I

    move-result v9

    const/4 v10, 0x0

    if-eqz v7, :cond_b

    new-instance v11, Ln70/f;

    invoke-direct {v11, v7, v10}, Ln70/f;-><init>(Lcom/whoop/activation/domain/models/ActivationFlowStepModel;Z)V

    goto :goto_6

    :cond_b
    move-object v11, v5

    :goto_6
    new-instance v7, Ln70/b$a;

    invoke-direct {v7, v9, v11}, Ln70/b$a;-><init>(ILn70/f;)V

    invoke-virtual {v1}, Lf70/e$b;->l()Ln70/e;

    move-result-object v12

    invoke-virtual/range {p2 .. p2}, Lf70/d$c0;->a()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object v16

    const/16 v18, 0x17

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-static/range {v12 .. v19}, Ln70/e;->b(Ln70/e;IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;ILjava/lang/Object;)Ln70/e;

    move-result-object v1

    iget-object v9, v0, Lg70/a;->d:Lod1/j;

    invoke-virtual {v9}, Lod1/j;->a()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_c

    move v10, v6

    :cond_c
    new-instance v9, Ln70/a;

    invoke-direct {v9, v7, v1, v10}, Ln70/a;-><init>(Ln70/b;Ln70/e;Z)V

    iput-object v5, v3, Lg70/a$b;->w:Ljava/lang/Object;

    iput-object v5, v3, Lg70/a$b;->x:Ljava/lang/Object;

    iput-object v2, v3, Lg70/a$b;->y:Ljava/lang/Object;

    iput-object v5, v3, Lg70/a$b;->z:Ljava/lang/Object;

    iput v6, v3, Lg70/a$b;->G:I

    invoke-virtual {v8, v9, v3}, Ln70/c;->k(Ln70/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_d

    return-object v4

    :cond_d
    move-object v5, v2

    move-object v2, v1

    :goto_7
    move-object v7, v2

    check-cast v7, Ln70/e;

    const v23, 0x1fddd

    const/16 v24, 0x0

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

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v5 .. v24}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v1

    :cond_e
    return-object v1
.end method
