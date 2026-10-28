.class public abstract Lzc1/v6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "n",
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
.method private static final A(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/v6;->n(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/v6;->z()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/v6;->A(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/v6;->t()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/v6;->w()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/v6;->q()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/v6;->y(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/v6;->p()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/v6;->r(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/v6;->v(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/v6;->s(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/v6;->o()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic l()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/v6;->x()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic m()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/v6;->u()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final n(Landroidx/compose/runtime/Composer;I)V
    .locals 58

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, 0x120a03d4

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p1, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    and-int/lit8 v5, p1, 0x1

    invoke-virtual {v1, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_10

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v6, v3

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v7, v6

    invoke-static {v7, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v8, v1, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v7, v1, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v1, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v10, v1, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v1, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v1, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v1, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v8, v1, Lp1/q;->S:Z

    if-nez v8, :cond_2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    :cond_2
    invoke-static {v7, v1, v7, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v1, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "Schedule Tile With No Tag"

    const/4 v4, 0x6

    invoke-static {v2, v1, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v6, v2

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v1, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v7, Lc41/w4;

    invoke-direct {v7}, Lc41/w4;-><init>()V

    new-instance v8, Lcom/whoop/design/util/TextResource$e;

    const-string v9, "Day"

    invoke-direct {v8, v9}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    new-instance v13, Lcom/whoop/design/util/TextResource$e;

    const-string v8, "7:00am"

    invoke-direct {v13, v8}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v10, Lcom/whoop/design/util/TextResource$e;

    const-string v11, "Edit"

    invoke-direct {v10, v11}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v14, Lcom/whoop/design/util/TextResource$e;

    const-string v15, "Delete"

    invoke-direct {v14, v15}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move/from16 v24, v4

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_4

    new-instance v3, Lzc1/h6;

    move/from16 v25, v2

    const/16 v2, 0xa

    invoke-direct {v3, v2}, Lzc1/h6;-><init>(I)V

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    move/from16 v25, v2

    :goto_2
    move-object/from16 v20, v3

    check-cast v20, Lc93/a;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_5

    new-instance v2, Lzc1/h6;

    const/16 v3, 0xe

    invoke-direct {v2, v3}, Lzc1/h6;-><init>(I)V

    invoke-virtual {v1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object/from16 v21, v2

    check-cast v21, Lc93/a;

    move-object/from16 v17, v10

    new-instance v10, Lc41/a5;

    move-object v2, v11

    const/4 v11, 0x0

    move-object/from16 v18, v14

    const/4 v14, 0x1

    move-object v3, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x131

    const/16 v23, 0x0

    invoke-direct/range {v10 .. v23}, Lc41/a5;-><init>(Ly81/f;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZZLhy0/h1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v4, :cond_6

    new-instance v11, Lzc1/t5;

    const/16 v12, 0xd

    invoke-direct {v11, v12}, Lzc1/t5;-><init>(I)V

    invoke-virtual {v1, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v11, Lkotlin/jvm/functions/Function1;

    sget v12, Lc41/a5;->l:I

    or-int/lit8 v12, v12, 0x30

    sget v13, Lc41/w4;->a:I

    shl-int/lit8 v13, v13, 0x6

    or-int/2addr v12, v13

    invoke-virtual {v7, v10, v11, v1, v12}, Lc41/w4;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v7, 0x2

    int-to-float v10, v7

    mul-float v10, v10, v25

    invoke-static {v10, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v1, v11}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v11, Lc41/w4;

    invoke-direct {v11}, Lc41/w4;-><init>()V

    new-instance v13, Lcom/whoop/design/util/TextResource$e;

    const-string v14, "Mon"

    invoke-direct {v13, v14}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v14, Lcom/whoop/design/util/TextResource$e;

    const-string v15, "Tue"

    invoke-direct {v14, v15}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v15, Lcom/whoop/design/util/TextResource$e;

    const-string v7, "Wed"

    invoke-direct {v15, v7}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v7, Lcom/whoop/design/util/TextResource$e;

    move-object/from16 v16, v13

    const-string v13, "Thu"

    invoke-direct {v7, v13}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v13, Lcom/whoop/design/util/TextResource$e;

    move-object/from16 v17, v7

    const-string v7, "Fri"

    invoke-direct {v13, v7}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v7, Lcom/whoop/design/util/TextResource$e;

    move-object/from16 v18, v13

    const-string v13, "Sat"

    invoke-direct {v7, v13}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v13, Lcom/whoop/design/util/TextResource$e;

    move-object/from16 v19, v7

    const-string v7, "Sun"

    invoke-direct {v13, v7}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    move-object/from16 v57, v19

    move-object/from16 v19, v13

    move-object/from16 v13, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v57

    filled-new-array/range {v13 .. v19}, [Lcom/whoop/design/util/TextResource$e;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v27

    new-instance v7, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v7, v8}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v13, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v13, v2}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v14, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v14, v3}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v4, :cond_7

    new-instance v15, Lzc1/h6;

    move-object/from16 v28, v7

    const/16 v7, 0xf

    invoke-direct {v15, v7}, Lzc1/h6;-><init>(I)V

    invoke-virtual {v1, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    move-object/from16 v28, v7

    :goto_3
    move-object/from16 v35, v15

    check-cast v35, Lc93/a;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_8

    new-instance v7, Lzc1/h6;

    const/16 v15, 0x10

    invoke-direct {v7, v15}, Lzc1/h6;-><init>(I)V

    invoke-virtual {v1, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v36, v7

    check-cast v36, Lc93/a;

    new-instance v25, Lc41/a5;

    const/16 v26, 0x0

    const/16 v29, 0x1

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v34, 0x0

    const/16 v37, 0x131

    const/16 v38, 0x0

    move-object/from16 v32, v13

    move-object/from16 v33, v14

    invoke-direct/range {v25 .. v38}, Lc41/a5;-><init>(Ly81/f;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZZLhy0/h1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v25

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v4, :cond_9

    new-instance v13, Lzc1/t5;

    const/16 v14, 0xe

    invoke-direct {v13, v14}, Lzc1/t5;-><init>(I)V

    invoke-virtual {v1, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v11, v7, v13, v1, v12}, Lc41/w4;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v10, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v1, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v7, "Schedule Tile With Tag Expanded"

    move/from16 v11, v24

    invoke-static {v7, v1, v11}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v1, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v7, Lc41/w4;

    invoke-direct {v7}, Lc41/w4;-><init>()V

    new-instance v11, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v11, v9}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v13, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v13, v9}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v14, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v14, v9}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    filled-new-array {v11, v13, v14}, [Lcom/whoop/design/util/TextResource$e;

    move-result-object v11

    invoke-static {v11}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v27

    new-instance v11, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v11, v8}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v31, Lhy0/h1;

    new-instance v13, Lcom/whoop/design/util/TextResource$e;

    const-string v14, "Alarm On"

    invoke-direct {v13, v14}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v15, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v16

    move-object/from16 v17, v11

    invoke-virtual/range {v16 .. v16}, Lgz0/i0;->i()I

    move-result v11

    move-object/from16 v29, v13

    const/4 v13, 0x0

    const/4 v0, 0x2

    invoke-direct {v15, v11, v13, v0, v13}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v35, Ly81/f;->RECOVERY_HIGH_RECOVERY:Ly81/f;

    sget-object v33, Ly81/f;->BLACK_50:Ly81/f;

    const v51, 0x3fffe8

    const/16 v52, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    move-object/from16 v28, v31

    move-object/from16 v31, v35

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

    move-object/from16 v30, v15

    invoke-direct/range {v28 .. v52}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v31

    new-instance v11, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v11, v2}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v15, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v15, v3}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v4, :cond_a

    new-instance v13, Lzc1/h6;

    move-object/from16 v18, v0

    const/16 v0, 0x11

    invoke-direct {v13, v0}, Lzc1/h6;-><init>(I)V

    invoke-virtual {v1, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_4

    :cond_a
    move-object/from16 v18, v0

    :goto_4
    move-object/from16 v35, v13

    check-cast v35, Lc93/a;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_b

    new-instance v0, Lzc1/h6;

    const/16 v13, 0xb

    invoke-direct {v0, v13}, Lzc1/h6;-><init>(I)V

    invoke-virtual {v1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v36, v0

    check-cast v36, Lc93/a;

    new-instance v25, Lc41/a5;

    const/16 v26, 0x0

    const/16 v29, 0x1

    const/16 v30, 0x1

    const/16 v34, 0x0

    const/16 v37, 0x101

    const/16 v38, 0x0

    move-object/from16 v32, v11

    move-object/from16 v33, v15

    move-object/from16 v31, v28

    move-object/from16 v28, v17

    invoke-direct/range {v25 .. v38}, Lc41/a5;-><init>(Ly81/f;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZZLhy0/h1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v25

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v4, :cond_c

    new-instance v11, Lzc1/t5;

    const/16 v13, 0xb

    invoke-direct {v11, v13}, Lzc1/t5;-><init>(I)V

    invoke-virtual {v1, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7, v0, v11, v1, v12}, Lc41/w4;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v10, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v1, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v0, "Schedule Tile With Tag and Collapsed"

    const/4 v11, 0x6

    invoke-static {v0, v1, v11}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v1, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v0, Lc41/w4;

    invoke-direct {v0}, Lc41/w4;-><init>()V

    new-instance v5, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v5, v9}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v23

    new-instance v5, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v5, v8}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v32, Lhy0/h1;

    new-instance v6, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v6, v14}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v7, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v8

    invoke-virtual {v8}, Lgz0/o0;->n()Lgz0/g0;

    move-result-object v8

    invoke-virtual {v8}, Lgz0/g0;->d()I

    move-result v8

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-direct {v7, v8, v10, v9, v10}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v55, 0x3ffff8

    const/16 v56, 0x0

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

    const/16 v53, 0x0

    const/16 v54, 0x0

    move-object/from16 v33, v6

    move-object/from16 v34, v7

    move-object/from16 v35, v18

    invoke-direct/range {v32 .. v56}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v6, v2}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v2, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v2, v3}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_d

    new-instance v3, Lzc1/h6;

    const/16 v7, 0xc

    invoke-direct {v3, v7}, Lzc1/h6;-><init>(I)V

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v31, v3

    check-cast v31, Lc93/a;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_e

    new-instance v3, Lzc1/h6;

    const/16 v7, 0xd

    invoke-direct {v3, v7}, Lzc1/h6;-><init>(I)V

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v3, Lc93/a;

    new-instance v21, Lc41/a5;

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x1

    const/16 v30, 0x0

    const/16 v33, 0x101

    const/16 v34, 0x0

    move-object/from16 v29, v2

    move-object/from16 v24, v5

    move-object/from16 v28, v6

    move-object/from16 v27, v32

    move-object/from16 v32, v3

    invoke-direct/range {v21 .. v34}, Lc41/a5;-><init>(Ly81/f;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZZLhy0/h1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v21

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_f

    new-instance v3, Lzc1/t5;

    const/16 v4, 0xc

    invoke-direct {v3, v4}, Lzc1/t5;-><init>(I)V

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v2, v3, v1, v12}, Lc41/w4;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_10
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_11

    new-instance v1, Lzc1/g6;

    const/16 v2, 0xa

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/g6;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final o()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final p()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final q()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final r(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final u()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final v(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final x()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final y(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
