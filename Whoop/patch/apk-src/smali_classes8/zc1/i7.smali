.class public abstract Lzc1/i7;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "j",
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

    invoke-static {p0}, Lzc1/i7;->p(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/i7;->s(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/i7;->l(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/i7;->o(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/i7;->n(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/i7;->k(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/i7;->q(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/i7;->r(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/i7;->m(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Landroidx/compose/runtime/Composer;I)V
    .locals 42

    move/from16 v0, p1

    move-object/from16 v5, p0

    check-cast v5, Lp1/q;

    const v1, -0xdfd1f4a

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v5, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_c

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    move v3, v2

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v4, 0x3

    int-to-float v6, v4

    mul-float/2addr v6, v3

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v6, Lb2/e;->M:Lb2/k;

    const/4 v8, 0x6

    invoke-static {v3, v6, v5, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v9, v5, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v5, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-eqz v11, :cond_1

    invoke-virtual {v5, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_1
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v5, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v5, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v9, v5, Lp1/q;->S:Z

    if-nez v9, :cond_2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    :cond_2
    invoke-static {v6, v5, v6, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v5, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "Single Select List (max_selection = 1)"

    invoke-static {v1, v5, v8}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v1, Ln01/b;

    invoke-direct {v1}, Ln01/b;-><init>()V

    new-instance v3, Ln01/e;

    new-instance v9, Lry0/d;

    sget-object v14, Lgz0/m0;->BLOOD_OXYGEN:Lgz0/m0;

    sget-object v17, Lry0/c;->MCI_FLOW:Lry0/c;

    const/16 v25, 0x7f30

    const/16 v26, 0x0

    const-string v10, "single-light"

    const-string v11, "Light Flow"

    const-string v12, "Minimal menstrual flow"

    move-object v13, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v9 .. v26}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v13

    new-instance v10, Lry0/d;

    const/16 v26, 0x7f30

    const/16 v27, 0x0

    const-string v11, "single-medium"

    const-string v12, "Medium Flow"

    const-string v13, "Normal menstrual flow"

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v10 .. v27}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v10

    move-object/from16 v16, v17

    new-instance v10, Lry0/d;

    const-string v11, "single-heavy"

    const-string v12, "Heavy Flow"

    const-string v13, "Heavy menstrual flow"

    const/16 v16, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v10 .. v27}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v9, v6, v10}, [Lry0/d;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const/16 v17, 0x74

    const/16 v18, 0x0

    const-string v10, "single-select-example"

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object v9, v3

    invoke-direct/range {v9 .. v18}, Ln01/e;-><init>(Ljava/lang/String;IILjava/util/List;Ljava/util/Set;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v6, v9, :cond_4

    new-instance v6, Lzc1/t5;

    const/16 v10, 0x17

    invoke-direct {v6, v10}, Lzc1/t5;-><init>(I)V

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v6, Lkotlin/jvm/functions/Function1;

    sget v10, Ln01/e;->h:I

    shl-int/lit8 v4, v10, 0x3

    or-int/lit16 v4, v4, 0x186

    sget v10, Ln01/b;->a:I

    shl-int/lit8 v10, v10, 0x9

    or-int/2addr v4, v10

    move-object/from16 v41, v6

    move v6, v4

    move-object/from16 v4, v41

    invoke-virtual/range {v1 .. v6}, Ln01/b;->c(Landroidx/compose/ui/Modifier;Ln01/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const-string v1, "Multi-Select List (max_selection = 3)"

    invoke-static {v1, v5, v8}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v1, Ln01/b;

    invoke-direct {v1}, Ln01/b;-><init>()V

    new-instance v3, Ln01/e;

    new-instance v10, Lry0/d;

    sget-object v15, Lgz0/m0;->ACTIVITY:Lgz0/m0;

    sget-object v18, Lry0/c;->CERVICAL_MUCUS:Lry0/c;

    const/16 v26, 0x7f30

    const/16 v27, 0x0

    move-object v14, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v18

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-string v11, "multi-creamy"

    const-string v12, "Creamy"

    const-string v13, "Smooth, lotion-like consistency"

    invoke-direct/range {v10 .. v27}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v15, v14

    move-object/from16 v18, v17

    new-instance v11, Lry0/d;

    const/16 v27, 0x7f30

    const/16 v28, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const-string v12, "multi-sticky"

    const-string v13, "Sticky"

    const-string v14, "Thick, tacky texture"

    invoke-direct/range {v11 .. v28}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v11

    new-instance v11, Lry0/d;

    const/16 v19, 0x1

    const-string v12, "multi-egg-white"

    const-string v13, "Egg White"

    const-string v14, "Clear, stretchy consistency"

    invoke-direct/range {v11 .. v28}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lry0/d;

    const/16 v19, 0x0

    move-object v13, v11

    move-object v11, v12

    const-string v12, "multi-dry"

    move-object v14, v13

    const-string v13, "Dry"

    move-object/from16 v29, v14

    const-string v14, "No noticeable mucus"

    move-object/from16 v7, v29

    invoke-direct/range {v11 .. v28}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v20, v15

    filled-new-array {v10, v4, v7, v11}, [Lry0/d;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const/16 v18, 0x74

    const/16 v19, 0x0

    const/4 v12, 0x3

    const/4 v13, 0x0

    const/4 v15, 0x0

    const-string v11, "multi-select-example"

    move-object v10, v3

    invoke-direct/range {v10 .. v19}, Ln01/e;-><init>(Ljava/lang/String;IILjava/util/List;Ljava/util/Set;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v9, :cond_5

    new-instance v4, Lzc1/t5;

    const/16 v7, 0x18

    invoke-direct {v4, v7}, Lzc1/t5;-><init>(I)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual/range {v1 .. v6}, Ln01/b;->c(Landroidx/compose/ui/Modifier;Ln01/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const-string v1, "Mandatory Selection (max_selection = 1, min_selection = 1)"

    invoke-static {v1, v5, v8}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v1, Ln01/b;

    invoke-direct {v1}, Ln01/b;-><init>()V

    new-instance v3, Ln01/e;

    new-instance v21, Lry0/d;

    sget-object v26, Lgz0/m0;->HOME:Lgz0/m0;

    sget-object v29, Lry0/c;->DEFAULT:Lry0/c;

    const/16 v37, 0x7f30

    const/16 v38, 0x0

    const-string v22, "mandatory-yes"

    const-string v23, "Yes"

    const-string v24, "Tapping the selected cell again can\'t unselect it"

    move-object/from16 v25, v26

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v18, v29

    const/16 v29, 0x1

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    move-object/from16 v28, v18

    invoke-direct/range {v21 .. v38}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v21

    move-object/from16 v26, v25

    move-object/from16 v29, v28

    new-instance v22, Lry0/d;

    const/16 v38, 0x7f30

    const/16 v39, 0x0

    const-string v23, "mandatory-no"

    const-string v24, "No"

    const-string v25, "Selecting a different cell swaps the choice"

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v22 .. v39}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v22

    filled-new-array {v4, v7}, [Lry0/d;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const/16 v18, 0x70

    const/16 v19, 0x0

    const-string v11, "mandatory-select-example"

    const/4 v12, 0x1

    const/4 v13, 0x1

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v10, v3

    invoke-direct/range {v10 .. v19}, Ln01/e;-><init>(Ljava/lang/String;IILjava/util/List;Ljava/util/Set;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v9, :cond_6

    new-instance v4, Lzc1/t5;

    const/16 v7, 0x19

    invoke-direct {v4, v7}, Lzc1/t5;-><init>(I)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual/range {v1 .. v6}, Ln01/b;->c(Landroidx/compose/ui/Modifier;Ln01/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const-string v1, "Unlimited Selection (max_selection = 4)"

    invoke-static {v1, v5, v8}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v1, Ln01/b;

    invoke-direct {v1}, Ln01/b;-><init>()V

    new-instance v3, Ln01/e;

    new-instance v22, Lry0/d;

    const/16 v38, 0x7f30

    const/16 v39, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x1

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const-string v23, "unlimited-option1"

    const-string v24, "Option 1"

    const-string v25, "First unlimited option"

    invoke-direct/range {v22 .. v39}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v22

    new-instance v22, Lry0/d;

    const/16 v30, 0x0

    const-string v23, "unlimited-option2"

    const-string v24, "Option 2"

    const-string v25, "Second unlimited option"

    invoke-direct/range {v22 .. v39}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v22

    new-instance v22, Lry0/d;

    const/16 v30, 0x1

    const-string v23, "unlimited-option3"

    const-string v24, "Option 3"

    const-string v25, "Third unlimited option"

    invoke-direct/range {v22 .. v39}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v10, v22

    new-instance v22, Lry0/d;

    const-string v23, "unlimited-option4"

    const-string v24, "Option 4"

    const-string v25, "Fourth unlimited option"

    invoke-direct/range {v22 .. v39}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v11, v22

    filled-new-array {v4, v7, v10, v11}, [Lry0/d;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const/16 v18, 0x74

    const/16 v19, 0x0

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-string v11, "unlimited-select-example"

    move-object v10, v3

    invoke-direct/range {v10 .. v19}, Ln01/e;-><init>(Ljava/lang/String;IILjava/util/List;Ljava/util/Set;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v9, :cond_7

    new-instance v4, Lzc1/t5;

    const/16 v7, 0x1a

    invoke-direct {v4, v7}, Lzc1/t5;-><init>(I)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual/range {v1 .. v6}, Ln01/b;->c(Landroidx/compose/ui/Modifier;Ln01/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const-string v1, "Bindable Single Select (state_update_value_key)"

    invoke-static {v1, v5, v8}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v1, Ln01/b;

    invoke-direct {v1}, Ln01/b;-><init>()V

    new-instance v22, Lry0/d;

    const/16 v38, 0x7eb4

    const/16 v39, 0x0

    const-string v23, "AU"

    const-string v24, "Australia"

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x1

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v22 .. v39}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v22

    new-instance v22, Lry0/d;

    const/16 v38, 0x7e34

    const-string v23, "CA"

    const-string v24, "Canada"

    const/16 v30, 0x1

    invoke-direct/range {v22 .. v39}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v22

    new-instance v22, Lry0/d;

    const/16 v38, 0x7eb4

    const-string v23, "US"

    const-string v24, "United States"

    const/16 v30, 0x0

    invoke-direct/range {v22 .. v39}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v10, v22

    move-object/from16 v7, v26

    filled-new-array {v3, v4, v10}, [Lry0/d;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    new-instance v3, Ln01/e;

    const/16 v18, 0x50

    const/16 v19, 0x0

    const-string v11, "bindable-country-list"

    const/4 v12, 0x1

    const/4 v13, 0x1

    const/4 v15, 0x0

    const-string v16, "$country"

    const/16 v17, 0x0

    move-object v10, v3

    invoke-direct/range {v10 .. v19}, Ln01/e;-><init>(Ljava/lang/String;IILjava/util/List;Ljava/util/Set;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v9, :cond_8

    new-instance v4, Lzc1/t5;

    const/16 v10, 0x1b

    invoke-direct {v4, v10}, Lzc1/t5;-><init>(I)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual/range {v1 .. v6}, Ln01/b;->c(Landroidx/compose/ui/Modifier;Ln01/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const-string v1, "Bindable Multi Select (state_update_value_key)"

    invoke-static {v1, v5, v8}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v1, Ln01/b;

    invoke-direct {v1}, Ln01/b;-><init>()V

    new-instance v11, Lry0/d;

    const/16 v27, 0x7e34

    const/16 v28, 0x0

    const-string v12, "RUNNING"

    const-string v13, "Running"

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x1

    move-object/from16 v15, v20

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v18, v29

    invoke-direct/range {v11 .. v28}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v11

    new-instance v11, Lry0/d;

    const/16 v27, 0x7eb4

    const-string v12, "CYCLING"

    const-string v13, "Cycling"

    const/16 v19, 0x0

    invoke-direct/range {v11 .. v28}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v11

    new-instance v11, Lry0/d;

    const-string v12, "SWIMMING"

    const-string v13, "Swimming"

    invoke-direct/range {v11 .. v28}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3, v4, v11}, [Lry0/d;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    new-instance v3, Ln01/e;

    const/16 v18, 0x54

    const/16 v19, 0x0

    const-string v11, "bindable-activity-list"

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v15, 0x0

    const-string v16, "$activities"

    move-object v10, v3

    invoke-direct/range {v10 .. v19}, Ln01/e;-><init>(Ljava/lang/String;IILjava/util/List;Ljava/util/Set;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v9, :cond_9

    new-instance v4, Lzc1/t5;

    const/16 v10, 0x1c

    invoke-direct {v4, v10}, Lzc1/t5;-><init>(I)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual/range {v1 .. v6}, Ln01/b;->c(Landroidx/compose/ui/Modifier;Ln01/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const-string v1, "Disabled List (is_disabled)"

    invoke-static {v1, v5, v8}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v1, Ln01/b;

    invoke-direct {v1}, Ln01/b;-><init>()V

    new-instance v22, Lry0/d;

    sget-object v30, Lry0/c;->BLUE_OUTLINED:Lry0/c;

    const/16 v38, 0x7eb0

    const/16 v39, 0x0

    const-string v23, "disabled-skin-type-1"

    const-string v24, "Skin Type 1"

    const-string v25, "The whole list is disabled in one flag"

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v29, v30

    const/16 v30, 0x0

    const/16 v31, 0x1

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    move-object/from16 v26, v7

    invoke-direct/range {v22 .. v39}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v22

    move-object/from16 v30, v29

    new-instance v22, Lry0/d;

    const/16 v38, 0x7e30

    const-string v23, "disabled-skin-type-2"

    const-string v24, "Skin Type 2"

    const-string v25, "Selected cells stay selected, just untappable"

    const/16 v30, 0x1

    invoke-direct/range {v22 .. v39}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v22

    move-object/from16 v30, v29

    new-instance v22, Lry0/d;

    const/16 v38, 0x6eb0

    const-string v23, "disabled-skin-type-3"

    const-string v24, "Skin Type 3"

    const-string v25, "Already disabled on its own"

    const/16 v30, 0x0

    const/16 v35, 0x1

    invoke-direct/range {v22 .. v39}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v22

    move-object/from16 v30, v29

    filled-new-array {v3, v4, v7}, [Lry0/d;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    new-instance v3, Ln01/e;

    const/16 v18, 0x34

    const/16 v19, 0x0

    const-string v11, "disabled-list-example"

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1

    move-object v10, v3

    invoke-direct/range {v10 .. v19}, Ln01/e;-><init>(Ljava/lang/String;IILjava/util/List;Ljava/util/Set;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v9, :cond_a

    new-instance v4, Lzc1/t5;

    const/16 v7, 0x1d

    invoke-direct {v4, v7}, Lzc1/t5;-><init>(I)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual/range {v1 .. v6}, Ln01/b;->c(Landroidx/compose/ui/Modifier;Ln01/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const-string v1, "Grouped List (section_title)"

    invoke-static {v1, v5, v8}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v1, Ln01/b;

    invoke-direct {v1}, Ln01/b;-><init>()V

    new-instance v3, Ln01/e;

    new-instance v23, Lry0/d;

    const/16 v39, 0x3e38

    const/16 v40, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x1

    const/16 v32, 0x1

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const-string v24, "running"

    const-string v25, "Running"

    const-string v26, "Listed again under All Activities"

    const-string v38, "FREQUENTLY RECORDED"

    invoke-direct/range {v23 .. v40}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v23

    new-instance v23, Lry0/d;

    const/16 v39, 0x3eb8

    const/16 v31, 0x0

    const-string v24, "walking"

    const-string v25, "Walking"

    const-string v26, "Same section, so no second header"

    const-string v38, "FREQUENTLY RECORDED"

    invoke-direct/range {v23 .. v40}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v23

    new-instance v23, Lry0/d;

    const/16 v39, 0x3ebc

    const/16 v26, 0x0

    const-string v24, "boxing"

    const-string v25, "Boxing"

    const-string v38, "ALL ACTIVITIES"

    invoke-direct/range {v23 .. v40}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v8, v23

    new-instance v23, Lry0/d;

    const/16 v39, 0x3e38

    const/16 v31, 0x1

    const-string v24, "running"

    const-string v25, "Running"

    const-string v26, "Same id as above, ticks together"

    const-string v38, "ALL ACTIVITIES"

    invoke-direct/range {v23 .. v40}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v10, v23

    filled-new-array {v4, v7, v8, v10}, [Lry0/d;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const/16 v18, 0x74

    const/16 v19, 0x0

    const/16 v12, 0xc8

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-string v11, "grouped-list-example"

    move-object v10, v3

    invoke-direct/range {v10 .. v19}, Ln01/e;-><init>(Ljava/lang/String;IILjava/util/List;Ljava/util/Set;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v9, :cond_b

    new-instance v4, Lzc1/h7;

    const/4 v7, 0x0

    invoke-direct {v4, v7}, Lzc1/h7;-><init>(I)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual/range {v1 .. v6}, Ln01/b;->c(Landroidx/compose/ui/Modifier;Ln01/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x1

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_c
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_d

    new-instance v2, Lzc1/g6;

    const/16 v3, 0x14

    invoke-direct {v2, v0, v3}, Lzc1/g6;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final k(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/i7;->j(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
