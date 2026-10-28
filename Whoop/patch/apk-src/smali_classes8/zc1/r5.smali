.class public abstract Lzc1/r5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/r5;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/r5;->e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/runtime/Composer;I)V
    .locals 42

    move/from16 v0, p1

    move-object/from16 v4, p0

    check-cast v4, Lp1/q;

    const v1, -0x20c2a044

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v7, 0x1

    if-eqz v0, :cond_0

    move v1, v7

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v4, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x2

    int-to-float v2, v1

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v6, 0x6

    invoke-static {v2, v5, v4, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v8, v4, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v4, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v4, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v4, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v4, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-nez v8, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    :cond_2
    invoke-static {v5, v4, v5, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v4, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "Member Discovery picker"

    invoke-static {v2, v4, v6}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v2, Lb31/c;

    const-string v3, "Member Discovery"

    invoke-static {v3}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v10

    const-string v3, "Can discover you via the community search and send a request."

    invoke-static {v3}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v11

    new-instance v3, Lm91/o;

    new-instance v12, Lry0/d;

    sget-object v20, Lry0/c;->BLUE_OUTLINED:Lry0/c;

    const/16 v28, 0x7f3c

    const/16 v29, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v20

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const-string v13, "member_discovery_no_one"

    const-string v14, "No One"

    invoke-direct/range {v12 .. v29}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x0

    invoke-direct {v3, v12, v5, v1, v5}, Lm91/o;-><init>(Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lm91/o;

    new-instance v13, Lry0/d;

    const/16 v29, 0x7f3c

    const/16 v30, 0x0

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const-string v14, "member_discovery_followers"

    const-string v15, "Followers"

    invoke-direct/range {v13 .. v30}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v19, v20

    const/4 v6, 0x0

    invoke-direct {v5, v13, v6, v1, v6}, Lm91/o;-><init>(Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lm91/o;

    new-instance v13, Lry0/d;

    const/16 v19, 0x0

    const/16 v21, 0x1

    const-string v14, "member_discovery_all"

    const-string v15, "All Members"

    invoke-direct/range {v13 .. v30}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v8, 0x0

    invoke-direct {v6, v13, v8, v1, v8}, Lm91/o;-><init>(Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3, v5, v6}, [Lm91/o;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const-string v1, "SAVE"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    sget-object v21, Lny0/p;->LIGHT_BACKGROUND:Lny0/p;

    new-instance v14, Lny0/h;

    const v40, 0x1ff1fbe

    const/16 v41, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x1

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const-string v30, "save_button"

    invoke-direct/range {v14 .. v41}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v15, 0x8

    const/4 v12, 0x0

    const-string v9, "member_discovery_option_commit"

    move-object v8, v2

    invoke-direct/range {v8 .. v16}, Lb31/c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/util/List;Lny0/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_4

    new-instance v1, Lzc1/w1;

    const/16 v3, 0x15

    invoke-direct {v1, v3}, Lzc1/w1;-><init>(I)V

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget v1, Lb31/c;->g:I

    shl-int/lit8 v1, v1, 0x3

    or-int/lit16 v5, v1, 0x180

    const/4 v6, 0x1

    const/4 v1, 0x0

    invoke-static/range {v1 .. v6}, Lb31/b;->e(Landroidx/compose/ui/Modifier;Lb31/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_5
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_6

    new-instance v2, Lzc1/a5;

    const/16 v3, 0x13

    invoke-direct {v2, v0, v3}, Lzc1/a5;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final d(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/r5;->c(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
