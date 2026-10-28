.class public abstract Lzc1/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "e",
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
.method public static synthetic a(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/r0;->h(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/r0;->f(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/r0;->g(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/r0;->i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/runtime/Composer;I)V
    .locals 37

    move/from16 v0, p1

    move-object/from16 v7, p0

    check-cast v7, Lp1/q;

    const v1, -0x1b514044

    invoke-virtual {v7, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x0

    const/4 v10, 0x1

    if-eqz v0, :cond_0

    move v2, v10

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v7, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v7, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroid/content/Context;

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v13, v10

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v3, v13

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v4, v7, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v3, v7, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {v7, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v7, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v7, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v3, v7, v3, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v7, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "Informational"

    const/4 v14, 0x6

    invoke-static {v1, v7, v14}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x2

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v15, v2

    mul-float/2addr v1, v15

    invoke-static {v1, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v7, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Lc41/u0$d;

    sget-object v16, Lx81/d;->a:Lx81/d;

    invoke-static/range {v16 .. v16}, Lm4/a;->A(Lx81/d;)I

    move-result v3

    const-string v4, "LOW RECOVERY WITH GOOD SLEEP?"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const-string v5, "Learn why your Recovery is in the RED, although your Sleep Performance is above 85%."

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lc41/u0$d;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    sget v3, Lc41/u0$d;->d:I

    shl-int/lit8 v8, v3, 0x3

    const/16 v9, 0x1d

    move v3, v1

    const/4 v1, 0x0

    move v5, v3

    const-wide/16 v3, 0x0

    move v6, v5

    const/4 v5, 0x0

    move/from16 v17, v6

    const/4 v6, 0x0

    move/from16 v10, v17

    invoke-static/range {v1 .. v9}, Lc41/q0;->p(Landroidx/compose/ui/Modifier;Lc41/u0;JLf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    mul-float/2addr v15, v15

    invoke-static {v15, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v7, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "Generic Informational"

    invoke-static {v1, v7, v14}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v10, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v7, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {}, Lgb1/b0;->E0()Li2/t;

    move-result-object v1

    invoke-static {v1}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object v1

    invoke-static {v12, v1}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-wide v3, Li2/x;->m:J

    new-instance v5, Lf0/t;

    invoke-static {}, Lgb1/b0;->F0()Li2/t;

    move-result-object v2

    invoke-direct {v5, v13, v2}, Lf0/t;-><init>(FLi2/t;)V

    invoke-virtual/range {v16 .. v16}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/a;->f()I

    move-result v18

    sget-object v21, Ly81/f;->BLACK_30:Ly81/f;

    const-string v2, "Enable Your Journal"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    sget-object v22, Ly81/f;->BRAND_BLACK:Ly81/f;

    const-string v2, "Enable your journal to start tracking behaviors and see your recovery impacts"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    new-instance v17, Lc41/u0$c;

    move-object/from16 v23, v22

    invoke-direct/range {v17 .. v23}, Lc41/u0$c;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Ly81/f;)V

    sget v2, Lc41/u0$c;->g:I

    shl-int/lit8 v2, v2, 0x3

    or-int/lit16 v8, v2, 0x180

    const/16 v9, 0x10

    move-object/from16 v2, v17

    invoke-static/range {v1 .. v9}, Lc41/q0;->p(Landroidx/compose/ui/Modifier;Lc41/u0;JLf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v7, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "Error"

    invoke-static {v1, v7, v14}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v10, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v7, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v17, Lc41/u0$b;

    invoke-virtual/range {v16 .. v16}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/a;->f()I

    move-result v18

    const-string v13, "ALARM ON"

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    const-string v26, "In The Green"

    invoke-static/range {v26 .. v26}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    const-string v27, "CHARGE YOUR WHOOP\nFOR 8:00 WAKEUP"

    invoke-static/range {v27 .. v27}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    const/16 v24, 0x22

    const/16 v25, 0x0

    const/16 v19, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v17 .. v25}, Lc41/u0$b;-><init>(ILy81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v1, Lc41/u0$b;->g:I

    shl-int/lit8 v8, v1, 0x3

    const/16 v9, 0x1d

    const/4 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object/from16 v2, v17

    invoke-static/range {v1 .. v9}, Lc41/q0;->p(Landroidx/compose/ui/Modifier;Lc41/u0;JLf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v10, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v7, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v17, Lc41/u0$b;

    invoke-virtual/range {v16 .. v16}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/a;->f()I

    move-result v18

    sget-object v19, Ly81/f;->RECOVERY_HIGH_RECOVERY:Ly81/f;

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    invoke-static/range {v26 .. v26}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    invoke-static/range {v27 .. v27}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    const/16 v23, 0x1

    invoke-direct/range {v17 .. v23}, Lc41/u0$b;-><init>(ILy81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V

    const/4 v1, 0x0

    move-object/from16 v2, v17

    invoke-static/range {v1 .. v9}, Lc41/q0;->p(Landroidx/compose/ui/Modifier;Lc41/u0;JLf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v10, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v7, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Lc41/u0$b;

    invoke-virtual/range {v16 .. v16}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/a;->f()I

    move-result v29

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v31

    const-string v17, "100% Sleep Needed"

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v32

    invoke-static/range {v27 .. v27}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v33

    const/16 v35, 0x22

    const/16 v36, 0x0

    const/16 v30, 0x0

    const/16 v34, 0x0

    move-object/from16 v28, v2

    invoke-direct/range {v28 .. v36}, Lc41/u0$b;-><init>(ILy81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x0

    invoke-static/range {v1 .. v9}, Lc41/q0;->p(Landroidx/compose/ui/Modifier;Lc41/u0;JLf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v7, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Lc41/u0$b;

    invoke-virtual/range {v16 .. v16}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/a;->f()I

    move-result v21

    sget-object v22, Ly81/f;->ACCENT_ACTION:Ly81/f;

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-static/range {v27 .. v27}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    const/16 v26, 0x1

    move-object/from16 v20, v2

    invoke-direct/range {v20 .. v26}, Lc41/u0$b;-><init>(ILy81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V

    const/4 v1, 0x0

    invoke-static/range {v1 .. v9}, Lc41/q0;->p(Landroidx/compose/ui/Modifier;Lc41/u0;JLf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v7, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "Text Link"

    invoke-static {v1, v7, v14}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v10, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v7, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Lc41/u0$e;

    invoke-virtual/range {v16 .. v16}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->n()Lgz0/g0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/g0;->d()I

    move-result v21

    sget-object v22, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    const-string v1, "8:00am"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    const-string v14, "PLAN YOUR\nBEDTIME"

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    move-object/from16 v20, v2

    invoke-direct/range {v20 .. v25}, Lc41/u0$e;-><init>(ILy81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v7, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_4

    if-ne v3, v4, :cond_5

    :cond_4
    new-instance v3, Lal0/f;

    const/16 v1, 0x15

    invoke-direct {v3, v11, v1}, Lal0/f;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v6, v3

    check-cast v6, Lc93/a;

    sget v1, Lc41/u0$e;->f:I

    shl-int/lit8 v8, v1, 0x3

    const/16 v9, 0xd

    const/4 v1, 0x0

    move-object v5, v4

    const-wide/16 v3, 0x0

    move-object/from16 v17, v5

    const/4 v5, 0x0

    move-object/from16 v18, v13

    move-object/from16 v13, v17

    invoke-static/range {v1 .. v9}, Lc41/q0;->p(Landroidx/compose/ui/Modifier;Lc41/u0;JLf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v10, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v7, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Lc41/u0$e;

    invoke-virtual/range {v16 .. v16}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/k0;->A()I

    move-result v21

    sget-object v22, Ly81/f;->WHITE_50:Ly81/f;

    const-string v1, "STRAIN COACH"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    const-string v1, "START ACTIVITY"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    const/16 v26, 0x8

    const/16 v27, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, v2

    invoke-direct/range {v20 .. v27}, Lc41/u0$e;-><init>(ILy81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v7, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_6

    if-ne v3, v13, :cond_7

    :cond_6
    new-instance v3, Lal0/f;

    const/16 v1, 0x16

    invoke-direct {v3, v11, v1}, Lal0/f;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v6, v3

    check-cast v6, Lc93/a;

    const/16 v9, 0xd

    const/4 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v9}, Lc41/q0;->p(Landroidx/compose/ui/Modifier;Lc41/u0;JLf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v10, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v7, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v1, Lc41/u0$e;

    invoke-static/range {v16 .. v16}, Lm4/a;->b(Lx81/d;)I

    move-result v2

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const-string v3, "In The Green (8:00am)"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move-object/from16 v3, v19

    invoke-direct/range {v1 .. v6}, Lc41/u0$e;-><init>(ILy81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v7, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_8

    if-ne v3, v13, :cond_9

    :cond_8
    new-instance v3, Lal0/f;

    const/16 v2, 0x17

    invoke-direct {v3, v11, v2}, Lal0/f;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v6, v3

    check-cast v6, Lc93/a;

    const/16 v9, 0xd

    move-object v2, v1

    const/4 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v9}, Lc41/q0;->p(Landroidx/compose/ui/Modifier;Lc41/u0;JLf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-static {v12, v15, v7, v1}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    goto :goto_2

    :cond_a
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_b

    new-instance v2, Lzc1/j;

    const/16 v3, 0x1a

    invoke-direct {v2, v0, v3}, Lzc1/j;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final f(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "TEXT LINK - STRAP"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "TEXT LINK - STRAIN"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "TEXT LINK - SLEEP"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/r0;->e(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
