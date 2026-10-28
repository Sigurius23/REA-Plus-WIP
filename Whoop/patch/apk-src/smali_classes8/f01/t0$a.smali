.class public final Lf01/t0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf01/t0;->k(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
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
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 45

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v4, p2, 0x1

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_b

    const v0, -0x70f14e07

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v0, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->o()J

    move-result-wide v5

    sget-object v0, Li2/w0;->a:Li2/v0;

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v5, v6, v0}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v3, v3

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v5, v3

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v6, v8, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v8, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v8, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v8, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v8, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v5, v8, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v8, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v0, 0x8

    int-to-float v0, v0

    mul-float/2addr v3, v0

    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v6, Lf01/u0;

    new-instance v14, Lkd1/o$a;

    sget v0, Lgy0/a;->c:I

    invoke-direct {v14, v0}, Lkd1/o$a;-><init>(I)V

    const/16 v20, 0x6d

    const/16 v21, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    sget-object v27, Lm83/y;->w:Lm83/y;

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v12, v6

    move-object/from16 v17, v27

    invoke-direct/range {v12 .. v21}, Lf01/u0;-><init>(Ljava/lang/String;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLy3/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v0, v4, :cond_4

    sget-object v0, Lf01/t0$b;->w:Lf01/t0$b;

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x186

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Lf01/t0;->f(Landroidx/compose/ui/Modifier;Lf01/u0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v22, Lf01/u0;

    new-instance v0, Lkd1/o$a;

    sget v6, Lgy0/a;->c:I

    invoke-direct {v0, v6}, Lkd1/o$a;-><init>(I)V

    const/16 v30, 0x69

    const/16 v31, 0x0

    const/16 v23, 0x0

    const-string v25, "Welcome to Whoop"

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 v24, v0

    invoke-direct/range {v22 .. v31}, Lf01/u0;-><init>(Ljava/lang/String;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLy3/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_5

    sget-object v0, Lf01/t0$c;->w:Lf01/t0$c;

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x186

    const/4 v10, 0x0

    move-object/from16 v6, v22

    invoke-static/range {v5 .. v10}, Lf01/t0;->f(Landroidx/compose/ui/Modifier;Lf01/u0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v22, Lf01/u0;

    new-instance v0, Lkd1/o$a;

    sget v6, Lgy0/a;->c:I

    invoke-direct {v0, v6}, Lkd1/o$a;-><init>(I)V

    const/16 v30, 0x65

    const/16 v31, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const-string v26, "Whoop AdvancedLabs"

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 v24, v0

    invoke-direct/range {v22 .. v31}, Lf01/u0;-><init>(Ljava/lang/String;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLy3/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_6

    sget-object v0, Lf01/t0$d;->w:Lf01/t0$d;

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x186

    const/4 v10, 0x0

    move-object/from16 v6, v22

    invoke-static/range {v5 .. v10}, Lf01/t0;->f(Landroidx/compose/ui/Modifier;Lf01/u0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v6, Lf01/u0;

    new-instance v14, Lkd1/o$a;

    sget v0, Lgy0/a;->c:I

    invoke-direct {v14, v0}, Lkd1/o$a;-><init>(I)V

    new-instance v15, Lny0/h;

    const-string v0, "PURCHASE TEST"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    new-instance v17, Lcom/whoop/navigation/e;

    const/16 v21, 0x7

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v17 .. v22}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v41, 0x1ffdf7e

    const/16 v42, 0x0

    move-object/from16 v23, v17

    const/16 v17, 0x0

    const/16 v21, 0x0

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

    invoke-direct/range {v15 .. v42}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lny0/h;

    const-string v44, "LEARN MORE"

    invoke-static/range {v44 .. v44}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    new-instance v18, Lcom/whoop/navigation/e;

    const/16 v22, 0x7

    const/16 v23, 0x0

    invoke-direct/range {v18 .. v23}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v42, 0x1ffdf7e

    const/16 v43, 0x0

    move-object/from16 v24, v18

    const/16 v18, 0x0

    const/16 v22, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v41, 0x0

    invoke-direct/range {v16 .. v43}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v16

    filled-new-array {v15, v7}, [Lny0/h;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const/16 v20, 0x6d

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object v12, v6

    invoke-direct/range {v12 .. v21}, Lf01/u0;-><init>(Ljava/lang/String;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLy3/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_7

    sget-object v7, Lf01/t0$e;->w:Lf01/t0$e;

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x186

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Lf01/t0;->f(Landroidx/compose/ui/Modifier;Lf01/u0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v6, Lf01/u0;

    new-instance v14, Lkd1/o$a;

    sget v7, Lgy0/a;->b:I

    invoke-direct {v14, v7}, Lkd1/o$a;-><init>(I)V

    new-instance v15, Lny0/h;

    const-string v7, "SCHEDULE YOUR TEST"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    new-instance v17, Lcom/whoop/navigation/e;

    const/16 v21, 0x7

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v17 .. v22}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v41, 0x1ffdf7e

    const/16 v42, 0x0

    move-object/from16 v23, v17

    const/16 v17, 0x0

    const/16 v21, 0x0

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

    invoke-direct/range {v15 .. v42}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v15}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const/16 v20, 0x61

    const/4 v13, 0x0

    const-string v15, "Schedule Your First Test"

    const-string v16, "Get started with Advanced Labs by scheduling your first test."

    const/16 v18, 0x0

    move-object v12, v6

    invoke-direct/range {v12 .. v21}, Lf01/u0;-><init>(Ljava/lang/String;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLy3/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_8

    sget-object v7, Lf01/t0$f;->w:Lf01/t0$f;

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x186

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Lf01/t0;->f(Landroidx/compose/ui/Modifier;Lf01/u0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v6, Lf01/u0;

    new-instance v14, Lkd1/o$a;

    sget v7, Lgy0/a;->c:I

    invoke-direct {v14, v7}, Lkd1/o$a;-><init>(I)V

    new-instance v15, Lny0/h;

    const-string v7, "GET STARTED"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    new-instance v17, Lcom/whoop/navigation/e;

    const/16 v21, 0x7

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v17 .. v22}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v41, 0x1ffdf7e

    const/16 v42, 0x0

    move-object/from16 v23, v17

    const/16 v17, 0x0

    const/16 v21, 0x0

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

    invoke-direct/range {v15 .. v42}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v15}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const/16 v20, 0x61

    const/4 v13, 0x0

    const-string v15, "Welcome to WHOOP"

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object v12, v6

    invoke-direct/range {v12 .. v21}, Lf01/u0;-><init>(Ljava/lang/String;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLy3/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_9

    sget-object v7, Lf01/t0$g;->w:Lf01/t0$g;

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x186

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Lf01/t0;->f(Landroidx/compose/ui/Modifier;Lf01/u0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v6, Lf01/u0;

    new-instance v11, Lkd1/o$a;

    sget v3, Lgy0/a;->c:I

    invoke-direct {v11, v3}, Lkd1/o$a;-><init>(I)V

    new-instance v12, Lny0/h;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    new-instance v14, Lcom/whoop/navigation/e;

    const/16 v18, 0x7

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v38, 0x1ffdf7e

    const/16 v39, 0x0

    move-object/from16 v20, v14

    const/4 v14, 0x0

    const/16 v18, 0x0

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

    invoke-direct/range {v12 .. v39}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lny0/h;

    invoke-static/range {v44 .. v44}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    new-instance v15, Lcom/whoop/navigation/e;

    const/16 v19, 0x7

    const/16 v20, 0x0

    invoke-direct/range {v15 .. v20}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v39, 0x1ffdf7e

    const/16 v40, 0x0

    move-object/from16 v21, v15

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v13 .. v40}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v12, v13}, [Lny0/h;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const/16 v17, 0x61

    const/4 v10, 0x0

    const/4 v15, 0x0

    const-string v12, "Advanced Labs"

    const-string v13, "Discover what\'s happening inside your body with comprehensive biomarker testing."

    move-object v9, v6

    invoke-direct/range {v9 .. v18}, Lf01/u0;-><init>(Ljava/lang/String;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLy3/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_a

    sget-object v0, Lf01/t0$h;->w:Lf01/t0$h;

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x186

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Lf01/t0;->f(Landroidx/compose/ui/Modifier;Lf01/u0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    return-void

    :cond_b
    invoke-virtual {v8}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lf01/t0$a;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
