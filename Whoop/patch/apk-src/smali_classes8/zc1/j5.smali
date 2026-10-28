.class public abstract Lzc1/j5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "k",
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

    invoke-static {p0}, Lzc1/j5;->o(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/j5;->p(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/j5;->m(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/j5;->n(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/j5;->s(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/j5;->q(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/j5;->r(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/j5;->t(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/j5;->l(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/j5;->u(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Landroidx/compose/runtime/Composer;I)V
    .locals 62

    move/from16 v0, p1

    move-object/from16 v5, p0

    check-cast v5, Lp1/q;

    const v1, 0x2b4bf3c0

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v8, 0x1

    if-eqz v0, :cond_0

    move v1, v8

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v5, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_d

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x6

    invoke-static {v1, v3, v5, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v3, v5, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v5, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v5, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v5, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v3, v5, v3, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v5, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "VoW Item"

    invoke-static {v1, v5, v9}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v10, "New impact unlocked"

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    const-string v25, "Lorem ipsum dolor sit amet, consetetur."

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    new-instance v2, Lh01/a0;

    const/16 v23, 0x778

    const/16 v24, 0x0

    const-string v12, "1"

    const-string v14, "VOW_PRIMARY"

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object v11, v2

    invoke-direct/range {v11 .. v24}, Lh01/a0;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lcom/whoop/design/util/TextResource;ZLgz0/m0;Lkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v1, Lh01/a0;->l:I

    shl-int/lit8 v6, v1, 0x3

    const/16 v7, 0xd

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lh01/z;->i(Landroidx/compose/ui/Modifier;Lh01/a0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    const-string v1, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. "

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    new-instance v2, Lh01/a0;

    const-string v12, "2"

    const-string v14, "VOW_PRIMARY"

    move-object v11, v2

    invoke-direct/range {v11 .. v24}, Lh01/a0;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lcom/whoop/design/util/TextResource;ZLgz0/m0;Lkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x0

    invoke-static/range {v1 .. v7}, Lh01/z;->i(Landroidx/compose/ui/Modifier;Lh01/a0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "CTA - Highlighted"

    invoke-static {v1, v5, v9}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v37

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v28

    const-string v11, "BUTTON TEXT"

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v35

    sget-object v46, Lkd1/l;->ONBOARDING_TASK_LIST:Lkd1/l;

    new-instance v1, Lkd1/o$a;

    sget v2, Lgy0/a;->s:I

    invoke-direct {v1, v2}, Lkd1/o$a;-><init>(I)V

    sget-object v33, Lh01/a;->ONBOARDING:Lh01/a;

    new-instance v42, Lcom/whoop/navigation/e;

    const/16 v16, 0x7

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v12, v42

    invoke-direct/range {v12 .. v17}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lh01/q;

    const v48, 0x1f7838

    const/16 v49, 0x0

    const-string v27, "3"

    const-string v29, "IMPACT_UNLOCKED"

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    move-object/from16 v34, v46

    const/16 v46, 0x0

    const/16 v47, 0x0

    move-object/from16 v36, v1

    move-object/from16 v26, v2

    invoke-direct/range {v26 .. v49}, Lh01/q;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/l;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZZZLcom/whoop/navigation/e;ZLgz0/m0;Lkd1/o;Lb91/a;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v46, v34

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v1, v12, :cond_4

    new-instance v1, Lzc1/w1;

    const/16 v3, 0xb

    invoke-direct {v1, v3}, Lzc1/w1;-><init>(I)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v4, v1

    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget v1, Lh01/q;->v:I

    shl-int/lit8 v1, v1, 0x3

    or-int/lit16 v6, v1, 0xc00

    const/4 v7, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lh01/p;->z(Landroidx/compose/ui/Modifier;Lh01/q;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v49

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v40

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v47

    new-instance v1, Lkd1/o$a;

    sget v2, Lgy0/a;->s:I

    invoke-direct {v1, v2}, Lkd1/o$a;-><init>(I)V

    sget-object v45, Lh01/a;->DEFAULT:Lh01/a;

    new-instance v54, Lcom/whoop/navigation/e;

    const/16 v17, 0x7

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v13, v54

    invoke-direct/range {v13 .. v18}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lh01/q;

    const v60, 0x1f7838

    const/16 v61, 0x0

    const-string v39, "4"

    const-string v41, "IMPACT_UNLOCKED"

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    move-object/from16 v48, v1

    move-object/from16 v38, v2

    invoke-direct/range {v38 .. v61}, Lh01/q;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/l;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZZZLcom/whoop/navigation/e;ZLgz0/m0;Lkd1/o;Lb91/a;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v13, v45

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_5

    new-instance v1, Lzc1/w1;

    const/16 v3, 0xc

    invoke-direct {v1, v3}, Lzc1/w1;-><init>(I)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v4, v1

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lh01/p;->z(Landroidx/compose/ui/Modifier;Lh01/q;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v49

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v40

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v47

    new-instance v1, Lkd1/o$a;

    sget v2, Lgy0/a;->s:I

    invoke-direct {v1, v2}, Lkd1/o$a;-><init>(I)V

    sget-object v45, Lh01/a;->ALERT:Lh01/a;

    new-instance v14, Lcom/whoop/navigation/e;

    const/16 v18, 0x7

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lh01/q;

    const v60, 0x1f7838

    const/16 v61, 0x0

    const-string v39, "5"

    const-string v41, "IMPACT_UNLOCKED"

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    move-object/from16 v48, v1

    move-object/from16 v38, v2

    move-object/from16 v54, v14

    invoke-direct/range {v38 .. v61}, Lh01/q;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/l;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZZZLcom/whoop/navigation/e;ZLgz0/m0;Lkd1/o;Lb91/a;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v14, v45

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_6

    new-instance v1, Lzc1/w1;

    const/16 v3, 0xd

    invoke-direct {v1, v3}, Lzc1/w1;-><init>(I)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v4, v1

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lh01/p;->z(Landroidx/compose/ui/Modifier;Lh01/q;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v49

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v40

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v47

    new-instance v1, Lkd1/o$a;

    sget v2, Lgy0/a;->s:I

    invoke-direct {v1, v2}, Lkd1/o$a;-><init>(I)V

    sget-object v45, Lh01/a;->WARNING:Lh01/a;

    new-instance v15, Lcom/whoop/navigation/e;

    const/16 v19, 0x7

    const/16 v20, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v15 .. v20}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lh01/q;

    const v60, 0x1f7838

    const/16 v61, 0x0

    const-string v39, "5"

    const-string v41, "IMPACT_UNLOCKED"

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    move-object/from16 v48, v1

    move-object/from16 v38, v2

    move-object/from16 v54, v15

    invoke-direct/range {v38 .. v61}, Lh01/q;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/l;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZZZLcom/whoop/navigation/e;ZLgz0/m0;Lkd1/o;Lb91/a;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v15, v45

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_7

    new-instance v1, Lzc1/w1;

    const/16 v3, 0xe

    invoke-direct {v1, v3}, Lzc1/w1;-><init>(I)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v4, v1

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lh01/p;->z(Landroidx/compose/ui/Modifier;Lh01/q;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "CTA - Not Highlighted"

    invoke-static {v1, v5, v9}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v49

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v40

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v47

    new-instance v1, Lkd1/o$a;

    sget v2, Lgy0/a;->s:I

    invoke-direct {v1, v2}, Lkd1/o$a;-><init>(I)V

    new-instance v16, Lcom/whoop/navigation/e;

    const/16 v20, 0x7

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v16 .. v21}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lh01/q;

    const v60, 0x1f6838

    const/16 v61, 0x0

    const-string v39, "6"

    const-string v41, "IMPACT_UNLOCKED"

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    move-object/from16 v48, v1

    move-object/from16 v38, v2

    move-object/from16 v54, v16

    move-object/from16 v45, v33

    invoke-direct/range {v38 .. v61}, Lh01/q;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/l;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZZZLcom/whoop/navigation/e;ZLgz0/m0;Lkd1/o;Lb91/a;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_8

    new-instance v1, Lzc1/w1;

    const/16 v3, 0xf

    invoke-direct {v1, v3}, Lzc1/w1;-><init>(I)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v4, v1

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lh01/p;->z(Landroidx/compose/ui/Modifier;Lh01/q;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v49

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v40

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v47

    new-instance v1, Lkd1/o$a;

    sget v2, Lgy0/a;->s:I

    invoke-direct {v1, v2}, Lkd1/o$a;-><init>(I)V

    new-instance v16, Lcom/whoop/navigation/e;

    const/16 v20, 0x7

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v16 .. v21}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lh01/q;

    const v60, 0x1f6838

    const/16 v61, 0x0

    const-string v39, "7"

    const-string v41, "IMPACT_UNLOCKED"

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    move-object/from16 v48, v1

    move-object/from16 v38, v2

    move-object/from16 v45, v13

    move-object/from16 v54, v16

    invoke-direct/range {v38 .. v61}, Lh01/q;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/l;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZZZLcom/whoop/navigation/e;ZLgz0/m0;Lkd1/o;Lb91/a;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_9

    new-instance v1, Lzc1/w1;

    const/16 v3, 0x10

    invoke-direct {v1, v3}, Lzc1/w1;-><init>(I)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v4, v1

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lh01/p;->z(Landroidx/compose/ui/Modifier;Lh01/q;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v49

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v40

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v47

    new-instance v1, Lkd1/o$a;

    sget v2, Lgy0/a;->s:I

    invoke-direct {v1, v2}, Lkd1/o$a;-><init>(I)V

    new-instance v16, Lcom/whoop/navigation/e;

    const/16 v20, 0x7

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v16 .. v21}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lh01/q;

    const v60, 0x1f6838

    const/16 v61, 0x0

    const-string v39, "8"

    const-string v41, "IMPACT_UNLOCKED"

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    move-object/from16 v48, v1

    move-object/from16 v38, v2

    move-object/from16 v45, v14

    move-object/from16 v54, v16

    invoke-direct/range {v38 .. v61}, Lh01/q;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/l;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZZZLcom/whoop/navigation/e;ZLgz0/m0;Lkd1/o;Lb91/a;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_a

    new-instance v1, Lzc1/w1;

    const/16 v3, 0x11

    invoke-direct {v1, v3}, Lzc1/w1;-><init>(I)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v4, v1

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lh01/p;->z(Landroidx/compose/ui/Modifier;Lh01/q;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v49

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v40

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v47

    new-instance v1, Lkd1/o$a;

    sget v2, Lgy0/a;->s:I

    invoke-direct {v1, v2}, Lkd1/o$a;-><init>(I)V

    new-instance v16, Lcom/whoop/navigation/e;

    const/16 v20, 0x7

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v16 .. v21}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lh01/q;

    const v60, 0x1f6838

    const/16 v61, 0x0

    const-string v39, "8"

    const-string v41, "IMPACT_UNLOCKED"

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    move-object/from16 v48, v1

    move-object/from16 v38, v2

    move-object/from16 v45, v15

    move-object/from16 v54, v16

    invoke-direct/range {v38 .. v61}, Lh01/q;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/l;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZZZLcom/whoop/navigation/e;ZLgz0/m0;Lkd1/o;Lb91/a;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_b

    new-instance v1, Lzc1/w1;

    const/16 v3, 0x12

    invoke-direct {v1, v3}, Lzc1/w1;-><init>(I)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v4, v1

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lh01/p;->z(Landroidx/compose/ui/Modifier;Lh01/q;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "CTA - Non-Interactive, No Navigation"

    invoke-static {v1, v5, v9}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v49

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v40

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v47

    new-instance v1, Lkd1/o$a;

    sget v2, Lgy0/a;->s:I

    invoke-direct {v1, v2}, Lkd1/o$a;-><init>(I)V

    sget-object v45, Lh01/a;->LOCKED:Lh01/a;

    new-instance v2, Lh01/q;

    const v60, 0x1ff838

    const/16 v61, 0x0

    const-string v39, "8"

    const-string v41, "ONBOARDING"

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    move-object/from16 v48, v1

    move-object/from16 v38, v2

    invoke-direct/range {v38 .. v61}, Lh01/q;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/l;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZZZLcom/whoop/navigation/e;ZLgz0/m0;Lkd1/o;Lb91/a;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_c

    new-instance v1, Lzc1/w1;

    const/16 v3, 0x13

    invoke-direct {v1, v3}, Lzc1/w1;-><init>(I)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v4, v1

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lh01/p;->z(Landroidx/compose/ui/Modifier;Lh01/q;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_d
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_e

    new-instance v2, Lzc1/a5;

    const/16 v3, 0xa

    invoke-direct {v2, v0, v3}, Lzc1/a5;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
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

.method private static final s(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/j5;->k(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
