.class public abstract Lbr2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lbr2/j;",
        "step",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "c",
        "(Lbr2/j;ZLandroidx/compose/runtime/Composer;I)V",
        "user-journey_release"
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
.method public static synthetic a(Lbr2/j;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lbr2/m;->e(Lbr2/j;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lbr2/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lbr2/m;->d(Lbr2/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lbr2/j;ZLandroidx/compose/runtime/Composer;I)V
    .locals 52

    move-object/from16 v0, p0

    move/from16 v1, p1

    const-string v3, "step"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v3, -0x63f697c

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v8, v1}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x1

    if-eq v4, v5, :cond_4

    move v4, v6

    goto :goto_3

    :cond_4
    const/4 v4, 0x0

    :goto_3
    and-int/2addr v3, v6

    invoke-virtual {v8, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_13

    if-eqz v1, :cond_12

    const v3, -0xd50fed0

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_5

    new-instance v3, Ld0/q0;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v3, v4}, Ld0/q0;-><init>(Ljava/lang/Object;)V

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v4}, Ld0/q0;->I0(Ljava/lang/Boolean;)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Ld0/q0;

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v9}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Ll0/m;->g:Ll0/h;

    sget-object v12, Lb2/e;->M:Lb2/k;

    const/4 v13, 0x6

    invoke-static {v11, v12, v8, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v14, v8, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v8, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 p2, v12

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    move/from16 v16, v5

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-eqz v5, :cond_6

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_4
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v8, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v8, v11, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v13, v8, Lp1/q;->S:Z

    if-nez v13, :cond_7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v13, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    :cond_7
    invoke-static {v14, v8, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v8, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, Ll0/z;->a:Ll0/z;

    invoke-virtual {v10, v9, v6, v4}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-static {v8, v13}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v0}, Lbr2/j;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v14, 0x8

    if-nez v13, :cond_9

    const v13, -0x421a7262

    invoke-virtual {v8, v13}, Lp1/q;->e0(I)V

    const/4 v13, 0x0

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    move-object/from16 v43, p2

    move-object/from16 v42, v3

    move-object/from16 v45, v5

    move-object/from16 v48, v7

    move-object v2, v9

    move-object/from16 v49, v10

    move-object/from16 v46, v11

    move-object/from16 v44, v12

    move v3, v13

    move-object/from16 v47, v15

    goto/16 :goto_5

    :cond_9
    const/16 v18, 0x0

    const v4, -0x421a7261

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    const/4 v4, 0x6

    int-to-float v4, v4

    move-object/from16 v17, v10

    int-to-float v10, v14

    invoke-static {v4, v10, v9, v8}, Ld;->w(FFLb2/t;Lp1/q;)V

    const-string v4, "StackedHorizontalBarTitle"

    invoke-static {v9, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    move-object/from16 v26, v7

    const-wide/high16 v6, 0x4004000000000000L    # 2.5

    double-to-float v6, v6

    mul-float v21, v6, v10

    const/16 v24, 0x0

    const/16 v25, 0xa

    const/16 v22, 0x0

    move/from16 v23, v21

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v13, v8, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v13, v8, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Lb91/d;->O()Lb91/a;

    move-result-object v24

    invoke-virtual {v13, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v21

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v28, v4, 0x12

    const v29, 0x2fff8

    move-object v13, v9

    move-object/from16 v4, v26

    move-object/from16 v26, v8

    const-wide/16 v8, 0x0

    move/from16 v16, v10

    const/4 v10, 0x0

    move-object/from16 v23, v11

    const/4 v11, 0x0

    move-object/from16 v25, v12

    const/4 v12, 0x0

    move-object/from16 v27, v13

    move/from16 v30, v14

    const-wide/16 v13, 0x0

    move-object/from16 v31, v15

    const/4 v15, 0x0

    move/from16 v32, v16

    const/16 v16, 0x0

    move-object/from16 v34, v17

    move/from16 v33, v18

    const-wide/16 v17, 0x0

    const/high16 v35, 0x3f800000    # 1.0f

    const/16 v19, 0x0

    const/16 v36, 0x1

    const/16 v20, 0x0

    move-object/from16 v37, v4

    move-object v4, v7

    move-wide/from16 v50, v21

    move-object/from16 v22, v5

    move-object v5, v6

    move-wide/from16 v6, v50

    const/16 v21, 0x0

    move-object/from16 v38, v22

    const/16 v22, 0x0

    move-object/from16 v39, v23

    const/16 v23, 0x0

    move-object/from16 v40, v25

    const/16 v25, 0x0

    move-object/from16 v41, v27

    const/16 v27, 0x30

    move-object/from16 v43, p2

    move-object/from16 v42, v3

    move-object/from16 v47, v31

    move/from16 v1, v32

    move/from16 v3, v33

    move-object/from16 v49, v34

    move-object/from16 v48, v37

    move-object/from16 v45, v38

    move-object/from16 v46, v39

    move-object/from16 v44, v40

    move-object/from16 v2, v41

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v26

    const/4 v4, 0x3

    int-to-float v4, v4

    invoke-static {v4, v1, v2, v8, v3}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    :goto_5
    const-wide/high16 v4, 0x3ff4000000000000L    # 1.25

    double-to-float v1, v4

    const/16 v4, 0x8

    int-to-float v15, v4

    mul-float v11, v1, v15

    const/4 v13, 0x0

    const/16 v14, 0xd

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object v9, v2

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object v13, v9

    sget-object v2, Ll0/m;->c:Ll0/g;

    move-object/from16 v4, v43

    invoke-static {v2, v4, v8, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-eqz v6, :cond_a

    move-object/from16 v6, v44

    invoke-virtual {v8, v6}, Lp1/q;->l(Lc93/a;)V

    :goto_6
    move-object/from16 v6, v45

    goto :goto_7

    :cond_a
    invoke-virtual {v8}, Lp1/q;->s0()V

    goto :goto_6

    :goto_7
    invoke-static {v8, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v46

    invoke-static {v8, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v8, Lp1/q;->S:Z

    if-nez v2, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    :cond_b
    move-object/from16 v2, v47

    goto :goto_9

    :cond_c
    :goto_8
    move-object/from16 v4, v48

    goto :goto_a

    :goto_9
    invoke-static {v4, v8, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_8

    :goto_a
    invoke-static {v8, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0x1bbede15

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lbr2/j;->e()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v7, v3

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v11, v7, 0x1

    if-ltz v7, :cond_d

    move-object v4, v2

    check-cast v4, Lbr2/c;

    invoke-static {v4}, Lbr2/l;->d(Lbr2/c;)Lbr2/a;

    move-result-object v2

    invoke-virtual {v2}, Lbr2/a;->b()F

    move-result v5

    move-object/from16 v12, v49

    invoke-virtual {v12, v13, v3, v5}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v2}, Lbr2/a;->a()F

    move-result v2

    const/4 v6, 0x0

    const/4 v14, 0x1

    invoke-static {v5, v6, v2, v14}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v2, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v7, v2}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v6

    const-wide/high16 v9, 0x3fe0000000000000L    # 0.5

    invoke-static {v6, v7, v9, v10}, Lkotlin/time/Duration;->times-UwyO8pc(JD)J

    move-result-wide v6

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v9, Lkd1/o;->a:I

    or-int/2addr v2, v9

    sget v9, Lb91/a;->d:I

    or-int/2addr v2, v9

    or-int/2addr v9, v2

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lbr2/h;->k(Lbr2/c;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const-wide/high16 v4, 0x3fd0000000000000L    # 0.25

    double-to-float v2, v4

    mul-float/2addr v2, v15

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v8, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move v7, v11

    goto :goto_b

    :cond_d
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_e
    move-object/from16 v12, v49

    const/4 v14, 0x1

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v14}, Lp1/q;->q(Z)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v12, v13, v14, v1}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v8, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v1, Lb2/e;->H:Lb2/m;

    invoke-static {v1, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v8, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_f

    invoke-virtual {v8, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_f
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_c
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v8, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v8, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-nez v4, :cond_10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_11

    :cond_10
    invoke-static {v2, v8, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v8, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Lkr2/g;->BOTTOM:Lkr2/g;

    new-instance v1, La80/c;

    const/16 v2, 0x11

    invoke-direct {v1, v0, v2}, La80/c;-><init>(Ljava/lang/Object;I)V

    const v2, 0x65268062

    invoke-static {v2, v8, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const/16 v9, 0xc30

    const/4 v10, 0x4

    const/4 v6, 0x0

    move-object/from16 v4, v42

    invoke-static/range {v4 .. v10}, Lkr2/b;->u(Ld0/q0;Lkr2/g;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v8, v14, v14, v3}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_d

    :cond_12
    const/4 v3, 0x0

    const v1, -0xd270722

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_13
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_14

    new-instance v2, Lam0/b;

    const/4 v3, 0x5

    move/from16 v4, p1

    move/from16 v5, p3

    invoke-direct {v2, v0, v4, v5, v3}, Lam0/b;-><init>(Ljava/lang/Object;ZII)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final d(Lbr2/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

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
    and-int/lit8 v2, p2, 0x1

    move-object/from16 v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual/range {p0 .. p0}, Lbr2/j;->h()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljr2/c;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    sget-object v5, Lb2/t;->w:Lb2/t;

    if-nez v0, :cond_1

    const v0, -0x48847cd

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lbr2/j;->h()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljr2/c;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v4, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->O()Lb91/a;

    move-result-object v25

    const/4 v2, 0x5

    int-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float v6, v2, v3

    const/4 v9, 0x0

    const/16 v10, 0x8

    move v7, v6

    move v8, v6

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v3, "StackedHorizontalBarV2Text"

    invoke-static {v2, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v28, v2, 0x15

    const v29, 0x1fffc

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v4

    move-object v4, v0

    invoke-static/range {v4 .. v29}, Lqz0/n;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Lb91/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v26

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_1
    move-object v0, v4

    const v2, -0x481db97

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v4, 0x4004000000000000L    # 2.5

    double-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    const/4 v5, 0x0

    invoke-static {v2, v4, v5, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lbr2/j;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lbr2/j;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v5, 0x3

    or-int/lit8 v6, v6, 0x6

    shl-int/lit8 v5, v5, 0x6

    or-int/2addr v5, v6

    invoke-static {v2, v3, v4, v0, v5}, Lbr2/l;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    move-object v0, v4

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(Lbr2/j;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lbr2/m;->c(Lbr2/j;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
