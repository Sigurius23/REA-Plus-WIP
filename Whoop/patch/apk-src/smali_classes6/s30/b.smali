.class public abstract Ls30/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# direct methods
.method public static final a(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 12

    const-string v0, "step"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p3

    check-cast v5, Lp1/q;

    const v0, -0x9b8e41b

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x4

    sget-object v1, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object v3, p2

    :goto_0
    const v0, -0x1896950d

    invoke-virtual {v5, v0}, Lp1/q;->f0(I)V

    sget-object v0, Luj/k;->a:Lp1/u2;

    invoke-virtual {v5, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luj/m;

    const/4 v8, 0x0

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    iget v2, v0, Luj/m;->L:F

    invoke-static {v2}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {v5, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/res/Configuration;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v6, v7, :cond_5

    sget-object v6, Lhj/u;->w:Lhj/u;

    invoke-virtual {v6}, Lhj/u;->a()Landroid/app/Activity;

    move-result-object v6

    const v7, 0x3f733333    # 0.95f

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    iget v4, v4, Landroid/content/res/Configuration;->screenHeightDp:I

    int-to-float v4, v4

    const v9, 0x1020002

    invoke-virtual {v6, v9}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/view/ViewGroup;

    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x1e

    if-lt v10, v11, :cond_3

    if-eqz v9, :cond_3

    :try_start_0
    sget-object v10, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v9}, Lh5/i0;->a(Landroid/view/View;)Lh5/q1;

    move-result-object v9

    if-eqz v9, :cond_1

    iget-object v9, v9, Lh5/q1;->a:Lh5/o1;

    const/4 v10, 0x7

    invoke-virtual {v9, v10}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v9

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    :goto_1
    if-eqz v9, :cond_2

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    iget v10, v9, Lv4/b;->b:I

    int-to-float v10, v10

    div-float/2addr v10, v6

    iget v7, v9, Lv4/b;->d:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    int-to-float v7, v7

    div-float/2addr v7, v6

    sub-float/2addr v4, v10

    sub-float/2addr v4, v7

    goto :goto_2

    :catch_0
    :cond_2
    mul-float/2addr v4, v7

    :goto_2
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    goto :goto_3

    :cond_3
    mul-float/2addr v4, v7

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    :goto_3
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    goto :goto_4

    :cond_4
    iget v4, v4, Landroid/content/res/Configuration;->screenHeightDp:I

    int-to-float v4, v4

    mul-float/2addr v4, v7

    :goto_4
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/NudgeStep;->getFormFactor()Lcom/amplitude/android/engagement/types/FormFactor;

    move-result-object v6

    instance-of v7, v6, Lcom/amplitude/android/engagement/types/ModalFormFactor;

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v7, :cond_7

    iget-object v6, v0, Luj/m;->R:Ljava/lang/Float;

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    invoke-static {v6, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    :cond_6
    invoke-static {v1, v9, v4, v10}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    goto :goto_6

    :cond_7
    instance-of v7, v6, Lcom/amplitude/android/engagement/types/PopoverFormFactor;

    if-eqz v7, :cond_8

    move v7, v10

    goto :goto_5

    :cond_8
    instance-of v7, v6, Lcom/amplitude/android/engagement/types/PinFormFactor;

    :goto_5
    if-eqz v7, :cond_a

    iget-object v6, v0, Luj/m;->T:Ljava/lang/Float;

    if-eqz v6, :cond_9

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    invoke-static {v6, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    :cond_9
    invoke-static {v1, v9, v4, v10}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    goto :goto_6

    :cond_a
    instance-of v6, v6, Lcom/amplitude/android/engagement/types/TooltipFormFactor;

    if-eqz v6, :cond_c

    iget-object v6, v0, Luj/m;->V:Ljava/lang/Float;

    if-eqz v6, :cond_b

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    invoke-static {v6, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    :cond_b
    invoke-static {v1, v9, v4, v10}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    :cond_c
    :goto_6
    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/NudgeStep;->getFormFactor()Lcom/amplitude/android/engagement/types/FormFactor;

    move-result-object v4

    instance-of v4, v4, Lcom/amplitude/android/engagement/types/ModalFormFactor;

    xor-int/2addr v4, v10

    new-instance v6, Lnj/f;

    const/4 v7, 0x4

    invoke-direct {v6, v2, v7}, Lnj/f;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1, v4, v6, v5, v8}, Lds/p;->y(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    int-to-float v4, v10

    iget-wide v6, v0, Luj/m;->u:J

    invoke-static {v1, v4, v6, v7, v2}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v2}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    iget-wide v6, v0, Luj/m;->w:J

    sget-object v0, Li2/w0;->a:Li2/v0;

    invoke-static {v1, v6, v7, v0}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->w:Lb2/m;

    invoke-static {v1, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_d

    invoke-virtual {v5, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_d
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_7
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v5, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v5, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_e

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    :cond_e
    invoke-static {v2, v5, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v5, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/NudgeStep;->getFormFactor()Lcom/amplitude/android/engagement/types/FormFactor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/FormFactor;->getLayout()Lcom/amplitude/android/engagement/types/NudgeStepLayout;

    move-result-object v0

    sget-object v1, Lsj/e;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v10, :cond_12

    const/4 v1, 0x2

    const/16 v2, 0x48

    if-eq v0, v1, :cond_11

    const/4 v1, 0x3

    if-eq v0, v1, :cond_10

    const v0, -0x76ea73ba

    invoke-virtual {v5, v0}, Lp1/q;->f0(I)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_10
    const v0, -0x76ea73ee

    invoke-virtual {v5, v0}, Lp1/q;->f0(I)V

    invoke-static {p0, p1, v3, v5, v2}, Ls30/e;->c(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_11
    const v0, -0x76ea7443    # -1.8000927E-33f

    invoke-virtual {v5, v0}, Lp1/q;->f0(I)V

    invoke-static {p0, p1, v3, v5, v2}, Ls3/d;->a(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_12
    const v0, -0x76ea7497    # -1.8000773E-33f

    invoke-virtual {v5, v0}, Lp1/q;->f0(I)V

    const/16 v6, 0x48

    const/16 v7, 0x8

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Ls2/h;->a(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v5, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-nez v0, :cond_13

    goto :goto_9

    :cond_13
    new-instance v6, Lc4/c;

    move-object v7, p0

    move-object v8, p1

    move/from16 v10, p4

    move/from16 v11, p5

    move-object v9, v3

    invoke-direct/range {v6 .. v11}, Lc4/c;-><init>(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;II)V

    iput-object v6, v0, Lp1/v1;->d:Lc93/m;

    :goto_9
    return-void
.end method

.method public static final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 21

    move-object/from16 v7, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v2, p6

    move/from16 v8, p8

    const-string v0, "titleText"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmText"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dismissText"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onConfirmListener"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDismissListener"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p7

    check-cast v9, Lp1/q;

    const v0, -0x9d68f21

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v9, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v1, v8, 0x30

    if-nez v1, :cond_3

    move-object/from16 v1, p1

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    goto :goto_3

    :cond_3
    move-object/from16 v1, p1

    :goto_3
    and-int/lit16 v5, v8, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_4

    :cond_4
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, v8, 0xc00

    if-nez v5, :cond_7

    invoke-virtual {v9, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_5

    :cond_6
    const/16 v5, 0x400

    :goto_5
    or-int/2addr v0, v5

    :cond_7
    and-int/lit16 v5, v8, 0x6000

    if-nez v5, :cond_9

    move/from16 v5, p4

    invoke-virtual {v9, v5}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x4000

    goto :goto_6

    :cond_8
    const/16 v10, 0x2000

    :goto_6
    or-int/2addr v0, v10

    goto :goto_7

    :cond_9
    move/from16 v5, p4

    :goto_7
    const/high16 v10, 0x30000

    and-int/2addr v10, v8

    if-nez v10, :cond_b

    invoke-virtual {v9, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/high16 v10, 0x20000

    goto :goto_8

    :cond_a
    const/high16 v10, 0x10000

    :goto_8
    or-int/2addr v0, v10

    :cond_b
    const/high16 v10, 0x180000

    and-int/2addr v10, v8

    if-nez v10, :cond_d

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    const/high16 v10, 0x100000

    goto :goto_9

    :cond_c
    const/high16 v10, 0x80000

    :goto_9
    or-int/2addr v0, v10

    :cond_d
    const v10, 0x92493

    and-int/2addr v0, v10

    const v10, 0x92492

    if-ne v0, v10, :cond_f

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_a

    :cond_e
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object/from16 v17, v9

    goto :goto_b

    :cond_f
    :goto_a
    new-instance v0, Lx30/o1;

    move-object/from16 v20, v4

    move-object v4, v3

    move-object v3, v6

    move-object/from16 v6, v20

    invoke-direct/range {v0 .. v7}, Lx30/o1;-><init>(Ljava/lang/String;Lc93/a;Lc93/a;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    const v1, -0x68e92e0b

    invoke-static {v1, v9, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v16

    const/high16 v18, 0xc00000

    const/16 v19, 0x7f

    move-object/from16 v17, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v9 .. v19}, Ld40/r;->a(Ld40/n;Ld40/o;Ld40/s;Ljava/lang/Float;Ld40/m;Ld40/g;Ld40/h;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_b
    invoke-virtual/range {v17 .. v17}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_10

    new-instance v0, Lam2/u;

    const/4 v9, 0x7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v0 .. v9}, Lam2/u;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Lc93/a;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method public static c(Lm/m;Ljava/lang/String;Lm30/c;)Landroid/text/SpannableString;
    .locals 3

    const-string v0, "customization"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    check-cast p2, Lm30/a;

    iget-object p1, p2, Lm30/a;->x:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    invoke-direct {v2, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result p1

    invoke-virtual {v0, v2, v1, p1, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :cond_0
    iget p1, p2, Lm30/a;->y:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    if-lez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Lm/m;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    const/4 v2, 0x2

    invoke-static {v2, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p0

    float-to-int p0, p0

    new-instance p1, Landroid/text/style/AbsoluteSizeSpan;

    invoke-direct {p1, p0}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result p0

    invoke-virtual {v0, p1, v1, p0, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :cond_2
    iget-object p0, p2, Lm30/a;->w:Ljava/lang/String;

    if-eqz p0, :cond_3

    new-instance p1, Landroid/text/style/TypefaceSpan;

    invoke-direct {p1, p0}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result p0

    invoke-virtual {v0, p1, v1, p0, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :cond_3
    return-object v0
.end method

.method public static final d(II)V
    .locals 4

    new-instance v0, Ljava/io/EOFException;

    const-string v1, " bytes: only "

    const-string v2, " available for writing"

    const-string v3, "Unable to discard "

    invoke-static {p0, p1, v3, v1, v2}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final e(II)V
    .locals 4

    new-instance v0, Ljava/io/EOFException;

    const-string v1, " bytes: only "

    const-string v2, " available for reading"

    const-string v3, "Unable to discard "

    invoke-static {p0, p1, v3, v1, v2}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final f(Lwf/a;ZLs83/c;)Ljava/io/Serializable;
    .locals 8

    instance-of v0, p2, Lwf/b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwf/b;

    iget v1, v0, Lwf/b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwf/b;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwf/b;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lwf/b;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwf/b;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lwf/b;->y:Lwf/a;

    iget-object p1, v0, Lwf/b;->x:Lyf/k;

    iget-object v0, v0, Lwf/b;->w:Lwf/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, p1

    move-object p1, p0

    move-object p0, v0

    move-object v0, p2

    move-object p2, v7

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lyf/k;

    invoke-direct {p2}, Lyf/k;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "HTTP "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lwf/a;->a:Lmf/t;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "\r\n"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    iget-object v2, p0, Lwf/a;->b:Lmf/h;

    new-instance v5, Lw20/q;

    const/4 v6, 0x2

    invoke-direct {v5, p2, v6}, Lw20/q;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v2, v5}, Lgf/t;->c(Lc93/m;)V

    const/4 v2, 0x2

    invoke-virtual {p2, v2, v4}, Lyf/k;->z(ILjava/lang/String;)V

    if-eqz p1, :cond_9

    iget-object p1, p0, Lwf/a;->c:Lmf/l;

    instance-of v2, p1, Lof/a;

    if-eqz v2, :cond_3

    check-cast p1, Lof/a;

    iget-object p1, p1, Lof/a;->a:[B

    invoke-static {p2, p1}, Lyf/l;->X(Lyf/k;[B)V

    goto :goto_3

    :cond_3
    instance-of v2, p1, Lmf/n;

    if-nez v2, :cond_6

    instance-of v2, p1, Lmf/k;

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    instance-of p1, p1, Lmf/j;

    if-eqz p1, :cond_5

    goto :goto_3

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_6
    :goto_1
    iput-object p0, v0, Lwf/b;->w:Lwf/a;

    iput-object p2, v0, Lwf/b;->x:Lyf/k;

    iput-object p0, v0, Lwf/b;->y:Lwf/a;

    iput v3, v0, Lwf/b;->E:I

    invoke-static {p1, v0}, Lx30/s0;->B(Lmf/l;Ls83/c;)Ljava/io/Serializable;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    move-object v0, p1

    move-object p1, p0

    :goto_2
    check-cast v0, [B

    if-eqz v0, :cond_8

    const/4 p1, 0x0

    array-length v1, v0

    invoke-virtual {p2, v0, p1, v1}, Lyf/k;->write([BII)V

    new-instance p1, Lof/a;

    invoke-direct {p1, v0}, Lof/a;-><init>([B)V

    iget-object v0, p0, Lwf/a;->a:Lmf/t;

    iget-object p0, p0, Lwf/a;->b:Lmf/h;

    new-instance v1, Lwf/a;

    invoke-direct {v1, v0, p0, p1}, Lwf/a;-><init>(Lmf/t;Lmf/h;Lmf/l;)V

    move-object p0, v1

    goto :goto_3

    :cond_8
    move-object p0, p1

    :cond_9
    :goto_3
    invoke-virtual {p2}, Lyf/k;->b()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ll83/k;

    invoke-direct {p2, p0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method

.method public static final g(Lio/seon/androidsdk/service/e1;)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "End gap 8 is too big: capacity is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p0, p0, Lio/seon/androidsdk/service/e1;->f:I

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final h(Lio/seon/androidsdk/service/e1;)V
    .locals 4

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to reserve end gap 8: there are already "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lio/seon/androidsdk/service/e1;->c:I

    iget v3, p0, Lio/seon/androidsdk/service/e1;->b:I

    sub-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " content bytes at offset "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Lio/seon/androidsdk/service/e1;->b:I

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final i(Lio/seon/androidsdk/service/e1;)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "End gap 8 is too big: there are already "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p0, p0, Lio/seon/androidsdk/service/e1;->d:I

    const-string v2, " bytes reserved in the beginning"

    invoke-static {v1, p0, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static l(Landroid/content/Context;)Lwo/b;
    .locals 6

    new-instance v0, Lwo/b;

    sget-object v5, Lcom/google/android/gms/common/api/g;->c:Lcom/google/android/gms/common/api/g;

    const/4 v2, 0x0

    sget-object v3, Lwo/b;->a:Lcom/google/android/gms/common/api/f;

    sget-object v4, Luo/n;->w:Luo/n;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/api/h;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/api/c;Lcom/google/android/gms/common/api/g;)V

    return-object v0
.end method

.method public static final o(Lwf/a;)Ljava/lang/String;
    .locals 1

    const-string v0, "Date"

    iget-object p0, p0, Lwf/a;->b:Lmf/h;

    invoke-interface {p0, v0}, Lgf/t;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static final p(Ljava/lang/Throwable;)Z
    .locals 1

    instance-of v0, p0, Lcom/stripe/android/core/exception/APIException;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/stripe/android/core/exception/APIException;

    iget-object p0, p0, Lcom/stripe/android/core/exception/StripeException;->w:Lqy/f;

    if-eqz p0, :cond_0

    iget-object p0, p0, Lqy/f;->y:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const-string v0, "link_failed_to_attest_request"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final r(Lw3/p;Lw3/p;F)Lw3/p;
    .locals 3

    new-instance v0, Lw3/p;

    iget v1, p0, Lw3/p;->a:F

    iget v2, p1, Lw3/p;->a:F

    invoke-static {v1, v2, p2}, Le93/b;->O(FFF)F

    move-result v1

    iget p0, p0, Lw3/p;->b:F

    iget p1, p1, Lw3/p;->b:F

    invoke-static {p0, p1, p2}, Le93/b;->O(FFF)F

    move-result p0

    invoke-direct {v0, v1, p0}, Lw3/p;-><init>(FF)V

    return-object v0
.end method

.method public static s(Lorg/json/JSONObject;)Ly00/b8;
    .locals 5

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->x:Lt9/c0;

    const-string v1, "type"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->Q:Lt83/b;

    invoke-virtual {v0}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/stripe/android/model/StripeIntent$NextActionType;

    iget-object v4, v4, Lcom/stripe/android/model/StripeIntent$NextActionType;->w:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    check-cast v2, Lcom/stripe/android/model/StripeIntent$NextActionType;

    if-nez v2, :cond_2

    const/4 v0, -0x1

    goto :goto_1

    :cond_2
    sget-object v0, Lz00/d;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    :goto_1
    packed-switch v0, :pswitch_data_0

    :pswitch_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_1
    new-instance v0, Lz00/a;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    goto/16 :goto_2

    :pswitch_2
    new-instance v0, Lz00/a;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    goto/16 :goto_2

    :pswitch_3
    new-instance v0, Lz00/a;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    goto :goto_2

    :pswitch_4
    new-instance v0, Lz00/a;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    goto :goto_2

    :pswitch_5
    new-instance v0, Lz00/a;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    goto :goto_2

    :pswitch_6
    new-instance v0, Lz00/a;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    goto :goto_2

    :pswitch_7
    new-instance v0, Lz00/a;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    goto :goto_2

    :pswitch_8
    new-instance v0, Lz00/a;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    goto :goto_2

    :pswitch_9
    new-instance v0, Lz00/a;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    goto :goto_2

    :pswitch_a
    new-instance v0, Lz00/a;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    goto :goto_2

    :pswitch_b
    new-instance v0, Lz00/a;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    goto :goto_2

    :pswitch_c
    new-instance v0, Lz00/a;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    goto :goto_2

    :pswitch_d
    new-instance v0, Lz00/a;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    goto :goto_2

    :pswitch_e
    new-instance v0, Lz00/a;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    goto :goto_2

    :pswitch_f
    new-instance v0, Lz00/a;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    :goto_2
    iget-object v1, v2, Lcom/stripe/android/model/StripeIntent$NextActionType;->w:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-nez p0, :cond_3

    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    :cond_3
    invoke-interface {v0, p0}, Lwy/b;->m(Lorg/json/JSONObject;)Lvy/b;

    move-result-object p0

    check-cast p0, Ly00/b8;

    return-object p0

    :pswitch_10
    return-object v3

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_10
        :pswitch_0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static final t(ILw63/a;)V
    .locals 1

    iget v0, p1, Lio/seon/androidsdk/service/e1;->b:I

    sub-int/2addr v0, p0

    invoke-virtual {p1, v0}, Lio/seon/androidsdk/service/e1;->e(I)V

    return-void
.end method

.method public static final u(ILw63/a;)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unable to reserve "

    const-string v2, " start gap: there are already "

    invoke-static {p0, v1, v2}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    iget v1, p1, Lio/seon/androidsdk/service/e1;->c:I

    iget v2, p1, Lio/seon/androidsdk/service/e1;->b:I

    sub-int/2addr v1, v2

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " content bytes starting at offset "

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Lio/seon/androidsdk/service/e1;->b:I

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final v(ILw63/a;)V
    .locals 4

    iget v0, p1, Lio/seon/androidsdk/service/e1;->f:I

    if-le p0, v0, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "Start gap "

    const-string v2, " is bigger than the capacity "

    invoke-static {p0, v0, v1, v2}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unable to reserve "

    const-string v3, " start gap: there are already "

    invoke-static {p0, v2, v3}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    iget p1, p1, Lio/seon/androidsdk/service/e1;->e:I

    sub-int/2addr v0, p1

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " bytes reserved in the end"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static final w(Ljava/lang/Object;)Lxz/m0;
    .locals 2

    :try_start_0
    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p0, Ld00/l;

    if-eqz p0, :cond_0

    new-instance v0, Lxz/l0;

    invoke-direct {v0, p0}, Lxz/l0;-><init>(Ld00/l;)V

    return-object v0

    :cond_0
    sget-object p0, Lxz/k0;->a:Lxz/k0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    invoke-static {p0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_3

    :cond_1
    instance-of p0, v0, Lcom/stripe/attestation/AttestationError;

    if-nez p0, :cond_6

    invoke-static {v0}, Ls30/b;->p(Ljava/lang/Throwable;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_2

    :cond_2
    instance-of p0, v0, Lcom/stripe/android/core/exception/APIException;

    if-eqz p0, :cond_4

    move-object p0, v0

    check-cast p0, Lcom/stripe/android/core/exception/APIException;

    iget-object p0, p0, Lcom/stripe/android/core/exception/StripeException;->w:Lqy/f;

    if-eqz p0, :cond_3

    iget-object p0, p0, Lqy/f;->y:Ljava/lang/String;

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    :goto_0
    const-string v1, "link_consumer_details_not_available"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    goto :goto_1

    :cond_4
    const/4 p0, 0x0

    :goto_1
    if-eqz p0, :cond_5

    new-instance p0, Lxz/h0;

    invoke-direct {p0, v0}, Lxz/h0;-><init>(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_5
    new-instance p0, Lxz/j0;

    invoke-direct {p0, v0}, Lxz/j0;-><init>(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_6
    :goto_2
    new-instance p0, Lxz/i0;

    invoke-direct {p0, v0}, Lxz/i0;-><init>(Ljava/lang/Throwable;)V

    :goto_3
    check-cast p0, Lxz/m0;

    return-object p0
.end method

.method public static final x(Lyf/u;)Lne3/p0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lzf/f;

    if-eqz v0, :cond_0

    check-cast p0, Lzf/f;

    iget-object p0, p0, Lzf/f;->w:Lne3/j;

    return-object p0

    :cond_0
    new-instance v0, Lzf/h;

    invoke-direct {v0, p0}, Lzf/h;-><init>(Lyf/u;)V

    return-object v0
.end method


# virtual methods
.method public abstract j(Ljava/lang/Class;Ljava/lang/reflect/Field;)Ljava/lang/reflect/Method;
.end method

.method public abstract k(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
.end method

.method public abstract n(Ljava/lang/Class;)[Ljava/lang/String;
.end method

.method public abstract q(Ljava/lang/Class;)Z
.end method
