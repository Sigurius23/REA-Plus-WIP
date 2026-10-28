.class public abstract Lno0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000e\u00b2\u0006\u000c\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\r\u001a\u00020\u000c8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Llo0/a;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Llo0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "isButtonPressed",
        "",
        "indicationScale",
        "clinician-in-the-loop_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Llo0/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lno0/b;->g(Landroidx/compose/ui/Modifier;Llo0/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llo0/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lno0/b;->f(Llo0/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Llo0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Llo0/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, -0x5668dcde

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v5, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v6, v4, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v4, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v5

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v4

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v4

    :goto_1
    and-int/lit8 v8, v4, 0x30

    if-nez v8, :cond_5

    and-int/lit8 v8, v4, 0x40

    if-nez v8, :cond_3

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_2

    :cond_3
    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_2
    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_3

    :cond_4
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v7, v8

    :cond_5
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_7

    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v7, v8

    :cond_7
    move v14, v7

    and-int/lit16 v7, v14, 0x93

    const/16 v8, 0x92

    const/4 v15, 0x0

    if-eq v7, v8, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    move v7, v15

    :goto_5
    and-int/lit8 v8, v14, 0x1

    invoke-virtual {v9, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1c

    sget-object v7, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object/from16 v16, v7

    goto :goto_6

    :cond_9
    move-object/from16 v16, v6

    :goto_6
    const/4 v0, 0x3

    int-to-float v0, v0

    int-to-float v5, v5

    mul-float/2addr v0, v5

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v0

    invoke-virtual {v2}, Llo0/a;->f()Z

    move-result v5

    invoke-virtual {v9, v5}, Lp1/q;->h(Z)Z

    move-result v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_a

    if-ne v6, v8, :cond_c

    :cond_a
    invoke-virtual {v2}, Llo0/a;->f()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {v2}, Llo0/a;->c()Ly81/f;

    move-result-object v5

    :goto_7
    move-object v6, v5

    goto :goto_8

    :cond_b
    sget-object v5, Ly81/f;->WHITE_10:Ly81/f;

    goto :goto_7

    :goto_8
    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v6, Ly81/f;

    invoke-virtual {v2}, Llo0/a;->f()Z

    move-result v5

    invoke-virtual {v9, v5}, Lp1/q;->h(Z)Z

    move-result v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    const/16 v27, 0x0

    if-nez v5, :cond_d

    if-ne v11, v8, :cond_f

    :cond_d
    invoke-virtual {v2}, Llo0/a;->f()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-virtual {v2}, Llo0/a;->b()Ly81/f;

    move-result-object v5

    move-object v11, v5

    goto :goto_9

    :cond_e
    move-object/from16 v11, v27

    :goto_9
    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v11, Ly81/f;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v8, :cond_10

    invoke-static {v9}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v5

    :cond_10
    check-cast v5, Lj0/i;

    const/4 v10, 0x6

    invoke-static {v5, v9, v10}, Lge3/g;->m(Lj0/i;Lp1/q;I)Lp1/c1;

    move-result-object v10

    invoke-static {v10}, Lno0/b;->d(Lp1/t2;)Z

    move-result v10

    if-eqz v10, :cond_11

    const v10, 0x3f733333    # 0.95f

    goto :goto_a

    :cond_11
    const/high16 v10, 0x3f800000    # 1.0f

    :goto_a
    const/16 v17, 0x0

    move-object/from16 v18, v11

    const/16 v11, 0x1e

    move-object/from16 v19, v6

    const/4 v6, 0x0

    move-object/from16 v20, v7

    const/4 v7, 0x0

    move-object/from16 v21, v8

    const/4 v8, 0x0

    move-object/from16 v30, v5

    move v5, v10

    move/from16 v10, v17

    move-object/from16 v12, v18

    move-object/from16 v13, v19

    move-object/from16 v1, v20

    move-object/from16 v31, v21

    invoke-static/range {v5 .. v11}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v5

    invoke-static {v5}, Lno0/b;->e(Lp1/t2;)F

    move-result v17

    invoke-static {v5}, Lno0/b;->e(Lp1/t2;)F

    move-result v18

    const/16 v25, 0x0

    const v26, 0x7fffc

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v16 .. v26}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v32, v16

    invoke-static {v5, v0}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    if-nez v12, :cond_12

    const v0, 0x6b0f4cb3

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_12
    const v8, 0x6b0f4cb4

    invoke-virtual {v9, v8}, Lp1/q;->e0(I)V

    double-to-float v8, v6

    invoke-virtual {v12, v9, v15}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    invoke-static {v1, v8, v10, v11, v0}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    move-object/from16 v27, v0

    :goto_b
    if-nez v27, :cond_13

    goto :goto_c

    :cond_13
    move-object/from16 v1, v27

    :goto_c
    invoke-interface {v5, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v13, v9, v15}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    sget-object v1, Li2/w0;->a:Li2/v0;

    invoke-static {v0, v10, v11, v1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    and-int/lit8 v0, v14, 0x70

    const/16 v1, 0x20

    if-eq v0, v1, :cond_15

    and-int/lit8 v0, v14, 0x40

    if-eqz v0, :cond_14

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    goto :goto_d

    :cond_14
    move v10, v15

    goto :goto_e

    :cond_15
    :goto_d
    const/4 v10, 0x1

    :goto_e
    and-int/lit16 v0, v14, 0x380

    const/16 v1, 0x100

    if-ne v0, v1, :cond_16

    const/4 v0, 0x1

    goto :goto_f

    :cond_16
    move v0, v15

    :goto_f
    or-int/2addr v0, v10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_17

    move-object/from16 v0, v31

    if-ne v1, v0, :cond_18

    :cond_17
    new-instance v1, Lno0/o0;

    const/4 v0, 0x1

    invoke-direct {v1, v0, v2, v3}, Lno0/o0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object/from16 v22, v1

    check-cast v22, Lc93/a;

    const/16 v23, 0x1c

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v18, v30

    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    double-to-float v1, v6

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v1, v5

    const/4 v6, 0x2

    int-to-float v6, v6

    mul-float/2addr v6, v5

    invoke-static {v0, v6, v1}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v2}, Llo0/a;->getId()Ljava/lang/String;

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "appointment_button_"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->E:Lb2/m;

    invoke-static {v1, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-eqz v8, :cond_19

    invoke-virtual {v9, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_19
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_10
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v9, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v9, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-nez v6, :cond_1a

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1b

    :cond_1a
    invoke-static {v5, v9, v5, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v9, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Llo0/a;->e()Ljava/lang/String;

    move-result-object v5

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v9, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->E()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v9, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v7

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v0, v0, 0x12

    or-int/lit16 v0, v0, 0xc30

    const v30, 0x2d7fa

    const/4 v6, 0x0

    move-object/from16 v27, v9

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move/from16 v29, v0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v27

    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    move-object/from16 v1, v32

    goto :goto_11

    :cond_1c
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v1, v6

    :goto_11
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1d

    new-instance v0, Lm31/h;

    const/16 v6, 0xb

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lm31/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method private static final d(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final e(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final f(Llo0/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Llo0/a;->a()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Llo0/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lno0/b;->c(Landroidx/compose/ui/Modifier;Llo0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic h(Landroidx/compose/ui/Modifier;Llo0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lno0/b;->c(Landroidx/compose/ui/Modifier;Llo0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
