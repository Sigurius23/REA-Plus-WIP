.class public abstract Lrq2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\n\u00b2\u0006\u000e\u0010\u0007\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\t\u001a\u00020\u00088\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lrq2/a;",
        "step",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "c",
        "(Lrq2/a;ZLandroidx/compose/runtime/Composer;I)V",
        "animate",
        "",
        "horizontalProgress",
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
.method public static synthetic a(Lrq2/a;Lp1/t2;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrq2/d;->g(Lrq2/a;Lp1/t2;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lrq2/a;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrq2/d;->h(Lrq2/a;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lrq2/a;ZLandroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "step"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v3, -0x43a48c51

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    const/16 v11, 0x20

    if-nez v5, :cond_3

    invoke-virtual {v8, v1}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v11

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit8 v5, v3, 0x13

    const/16 v6, 0x12

    const/4 v13, 0x1

    if-eq v5, v6, :cond_4

    move v5, v13

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    :goto_3
    and-int/lit8 v6, v3, 0x1

    invoke-virtual {v8, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-ne v5, v14, :cond_5

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v15, v5

    check-cast v15, Lp1/c1;

    invoke-static {v15}, Lrq2/d;->d(Lp1/c1;)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v0}, Lrq2/a;->e()F

    move-result v5

    goto :goto_4

    :cond_6
    const/4 v5, 0x0

    :goto_4
    const/16 v6, 0x5dc

    const/16 v7, 0x1f4

    const/4 v9, 0x0

    invoke-static {v6, v7, v9, v4}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v4

    move-object v6, v9

    const/16 v9, 0x30

    const/16 v10, 0x1c

    move-object v7, v6

    const/4 v6, 0x0

    move-object/from16 v16, v7

    const/4 v7, 0x0

    move v12, v5

    move-object v5, v4

    move v4, v12

    move-object/from16 v12, v16

    invoke-static/range {v4 .. v10}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    and-int/lit8 v6, v3, 0x70

    if-ne v6, v11, :cond_7

    goto :goto_5

    :cond_7
    const/4 v13, 0x0

    :goto_5
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v13, :cond_8

    if-ne v6, v14, :cond_9

    :cond_8
    new-instance v6, Lrq2/d$a;

    invoke-direct {v6, v1, v15, v12}, Lrq2/d$a;-><init>(ZLp1/c1;Lq83/d;)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v6, Lc93/m;

    shr-int/lit8 v3, v3, 0x3

    and-int/lit8 v3, v3, 0xe

    invoke-static {v8, v6, v5}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v5, Loq1/c;

    const/16 v6, 0xc

    invoke-direct {v5, v6, v0, v4}, Loq1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v4, -0x73235047

    invoke-static {v4, v8, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    or-int/lit8 v3, v3, 0x30

    invoke-static {v1, v4, v8, v3}, Llq2/a;->e(ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_6

    :cond_a
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_b

    new-instance v4, Lrq2/c;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v1, v2, v5}, Lrq2/c;-><init>(Lrq2/a;ZII)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final d(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
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

.method private static final e(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final f(Lp1/t2;)F
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

.method private static final g(Lrq2/a;Lp1/t2;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 67

    move-object/from16 v0, p3

    const-string v1, "$this$BasicAnimationComponent"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move-object v4, v0

    check-cast v4, Lp1/q;

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    iget-object v9, v4, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-eqz v9, :cond_0

    invoke-virtual {v4, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_0
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v0, v14, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v0, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-nez v9, :cond_1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    :cond_1
    invoke-static {v5, v4, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v0, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lrq2/a;->n()Ljava/lang/String;

    move-result-object v15

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v0, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->r()Lb91/a;

    move-result-object v20

    invoke-virtual {v8, v0, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->b1()J

    move-result-wide v16

    const/4 v10, 0x5

    int-to-float v10, v10

    const/4 v11, 0x4

    int-to-float v11, v11

    mul-float/2addr v10, v11

    move v12, v11

    const/4 v11, 0x0

    move/from16 v18, v12

    const/16 v12, 0xc

    move-object/from16 v19, v8

    move v8, v10

    const/4 v10, 0x0

    move/from16 v21, v9

    move v9, v8

    move/from16 v28, v18

    move-object/from16 v26, v19

    move/from16 v27, v21

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move-object/from16 v30, v7

    move/from16 v29, v8

    sget v31, Lb91/a;->d:I

    shl-int/lit8 v24, v31, 0x12

    const v25, 0x2fff8

    move-object v7, v4

    move-object v8, v5

    const-wide/16 v4, 0x0

    move-object v10, v6

    const/4 v6, 0x0

    move-object v11, v7

    const/4 v7, 0x0

    move-object v12, v8

    const/4 v8, 0x0

    move-object/from16 v19, v1

    move-object v1, v9

    move-object/from16 v18, v10

    const-wide/16 v9, 0x0

    move-object/from16 v21, v11

    const/4 v11, 0x0

    move-object/from16 v22, v12

    const/4 v12, 0x0

    move-object/from16 v23, v13

    move-object/from16 v32, v14

    const-wide/16 v13, 0x0

    move-object v0, v15

    const/4 v15, 0x0

    move/from16 v33, v3

    move-wide/from16 v65, v16

    move-object/from16 v17, v2

    move-wide/from16 v2, v65

    const/16 v16, 0x0

    move-object/from16 v34, v17

    const/16 v17, 0x0

    move-object/from16 v35, v18

    const/16 v18, 0x0

    move-object/from16 v36, v19

    const/16 v19, 0x0

    move-object/from16 v37, v21

    const/16 v21, 0x0

    move-object/from16 v38, v23

    const/16 v23, 0x30

    move-object/from16 v45, v22

    move-object/from16 v42, v32

    move-object/from16 v39, v34

    move-object/from16 v44, v35

    move-object/from16 v43, v36

    move-object/from16 v40, v37

    move-object/from16 v41, v38

    move-object/from16 v22, p3

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    const/4 v11, 0x0

    const/16 v12, 0xe

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v8, v29

    move-object/from16 v7, v30

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x1

    int-to-float v3, v2

    mul-float v3, v3, v28

    move-object/from16 v4, v39

    invoke-static {v3, v4}, Ll0/m;->j(FLb2/f;)Ll0/k;

    move-result-object v3

    sget-object v5, Lb2/e;->J:Lb2/l;

    const/4 v6, 0x6

    invoke-static {v3, v5, v0, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    move-object/from16 v5, v40

    iget-wide v7, v5, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v9, v5, Lp1/q;->S:Z

    if-eqz v9, :cond_3

    move-object/from16 v9, v41

    invoke-virtual {v5, v9}, Lp1/q;->l(Lc93/a;)V

    :goto_1
    move-object/from16 v10, v42

    goto :goto_2

    :cond_3
    move-object/from16 v9, v41

    invoke-virtual {v5}, Lp1/q;->s0()V

    goto :goto_1

    :goto_2
    invoke-static {v0, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v43

    invoke-static {v0, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-nez v8, :cond_4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    :cond_4
    move-object/from16 v8, v44

    goto :goto_4

    :cond_5
    move-object/from16 v8, v44

    :goto_3
    move-object/from16 v7, v45

    goto :goto_5

    :goto_4
    invoke-static {v7, v5, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_3

    :goto_5
    invoke-static {v0, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lrq2/a;->j()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v11, v26

    move/from16 v12, v27

    invoke-virtual {v11, v0, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->u()Lb91/a;

    move-result-object v20

    invoke-virtual {v11, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v13

    sget-object v15, Ly2/d;->b:Ly2/m;

    move-object v0, v1

    new-instance v1, Landroidx/compose/foundation/layout/WithAlignmentLineElement;

    invoke-direct {v1, v15}, Landroidx/compose/foundation/layout/WithAlignmentLineElement;-><init>(Ly2/a;)V

    const/16 v23, 0x0

    const v25, 0x2fff8

    move-object/from16 v17, v4

    move-object/from16 v21, v5

    const-wide/16 v4, 0x0

    move/from16 v16, v6

    const/4 v6, 0x0

    move-object/from16 v45, v7

    const/4 v7, 0x0

    move-object/from16 v44, v8

    const/4 v8, 0x0

    move-object/from16 v38, v9

    move-object/from16 v32, v10

    const-wide/16 v9, 0x0

    move-object/from16 v19, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v18, v2

    move-object/from16 v43, v3

    move-wide v2, v13

    const-wide/16 v13, 0x0

    move-object/from16 v22, v15

    const/4 v15, 0x0

    move/from16 v26, v16

    const/16 v16, 0x0

    move-object/from16 v34, v17

    const/16 v17, 0x0

    move/from16 v33, v18

    const/16 v18, 0x0

    move-object/from16 v35, v19

    const/16 v19, 0x0

    move-object/from16 v37, v21

    const/16 v21, 0x0

    move-object/from16 v56, v22

    move/from16 v55, v27

    move-object/from16 v50, v32

    move-object/from16 v47, v34

    move-object/from16 v54, v35

    move-object/from16 v48, v37

    move-object/from16 v49, v38

    move-object/from16 v51, v43

    move-object/from16 v52, v44

    move-object/from16 v53, v45

    move-object/from16 v22, p3

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    invoke-virtual/range {p0 .. p0}, Lrq2/a;->i()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v54

    move/from16 v3, v55

    invoke-virtual {v2, v0, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->o()Lb91/a;

    move-result-object v20

    invoke-virtual {v2, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v4

    move-object v0, v1

    new-instance v1, Landroidx/compose/foundation/layout/WithAlignmentLineElement;

    move-object/from16 v6, v56

    invoke-direct {v1, v6}, Landroidx/compose/foundation/layout/WithAlignmentLineElement;-><init>(Ly2/a;)V

    move-object/from16 v19, v2

    move/from16 v27, v3

    move-wide v2, v4

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object/from16 v35, v19

    const/16 v19, 0x0

    move/from16 v58, v27

    move-object/from16 v57, v35

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    move-object/from16 v1, v48

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lrq2/a;->m()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, v57

    move/from16 v5, v58

    invoke-virtual {v4, v0, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->P()Lb91/a;

    move-result-object v20

    invoke-virtual {v4, v0, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v13

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v11, v28, v6

    const/4 v12, 0x6

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v8, v29

    move-object/from16 v7, v30

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v23, 0x30

    move-object/from16 v19, v4

    move/from16 v27, v5

    const-wide/16 v4, 0x0

    move v10, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v21, v1

    move-object v1, v9

    move v11, v10

    const-wide/16 v9, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v15, v12

    const/4 v12, 0x0

    move/from16 v33, v2

    move-object v0, v3

    move-wide v2, v13

    const-wide/16 v13, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move-object/from16 v35, v19

    const/16 v19, 0x0

    move-object/from16 v37, v21

    const/16 v21, 0x0

    move/from16 v61, v27

    move/from16 v62, v29

    move-object/from16 v63, v30

    move-object/from16 v60, v35

    move-object/from16 v59, v37

    move/from16 v27, v22

    move-object/from16 v22, p3

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    const/high16 v1, 0x3f800000    # 1.0f

    float-to-double v2, v1

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-lez v2, :cond_6

    goto :goto_6

    :cond_6
    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v3, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v4, v1, v3

    if-lez v4, :cond_7

    :goto_7
    const/4 v4, 0x1

    goto :goto_8

    :cond_7
    move v3, v1

    goto :goto_7

    :goto_8
    invoke-direct {v2, v3, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v3, Lb2/e;->E:Lb2/m;

    const/4 v5, 0x0

    invoke-static {v3, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    move-object/from16 v6, v59

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v9, v6, Lp1/q;->S:Z

    if-eqz v9, :cond_8

    move-object/from16 v9, v49

    invoke-virtual {v6, v9}, Lp1/q;->l(Lc93/a;)V

    :goto_9
    move-object/from16 v10, v50

    goto :goto_a

    :cond_8
    invoke-virtual {v6}, Lp1/q;->s0()V

    goto :goto_9

    :goto_a
    invoke-static {v0, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v51

    invoke-static {v0, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_9

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    move-object/from16 v8, v52

    goto :goto_c

    :cond_a
    :goto_b
    move-object/from16 v12, v53

    goto :goto_d

    :goto_c
    invoke-static {v7, v6, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_b

    :goto_d
    invoke-static {v0, v12, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, 0x3dcccccd    # 0.1f

    move-object/from16 v7, v63

    invoke-static {v2, v7}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v3, v5

    mul-float v3, v3, v28

    const/16 v8, 0x32

    int-to-float v8, v8

    mul-float v8, v8, v28

    invoke-static {v2, v3, v8}, Landroidx/compose/foundation/layout/d;->i(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v9, Lb2/e;->z:Lb2/m;

    sget-object v10, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v10, v2, v9}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lrq2/a;->k()Ljr2/d;

    move-result-object v11

    invoke-static {v2, v11}, Ljr2/b;->a(Landroidx/compose/ui/Modifier;Ljr2/d;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v0, v5}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v7, v3, v8}, Landroidx/compose/foundation/layout/d;->i(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static/range {p1 .. p1}, Lrq2/d;->f(Lp1/t2;)F

    move-result v3

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v10, v2, v9}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lrq2/a;->l()Ljr2/d;

    move-result-object v3

    invoke-static {v2, v3}, Ljr2/b;->a(Landroidx/compose/ui/Modifier;Ljr2/d;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v0, v5}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v4}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lrq2/a;->h()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_b

    const v1, -0x2da72ac5

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lrq2/a;->h()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljr2/c;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    move-object/from16 v11, v60

    move/from16 v12, v61

    invoke-virtual {v11, v0, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->N()Lb91/a;

    move-result-object v21

    const/16 v2, 0xa

    int-to-float v2, v2

    mul-float v2, v2, v28

    move/from16 v8, v62

    invoke-static {v7, v8, v2, v8, v8}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    shl-int/lit8 v24, v31, 0x15

    const v25, 0x1fffc

    move-object v0, v1

    move-object v1, v2

    const-wide/16 v2, 0x0

    move/from16 v33, v4

    move/from16 v46, v5

    const-wide/16 v4, 0x0

    move-object/from16 v37, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, p3

    move-object/from16 v64, v37

    invoke-static/range {v0 .. v25}, Lqz0/n;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Lb91/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v64

    const/4 v5, 0x0

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    :goto_e
    const/4 v2, 0x1

    goto :goto_f

    :cond_b
    move-object v11, v6

    const v2, -0x2da268b0

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-static {v1, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-wide/high16 v2, 0x4004000000000000L    # 2.5

    double-to-float v2, v2

    mul-float v2, v2, v27

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v4, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v4, v47

    invoke-static {v4, v1}, Lev/n;->g(Lb2/k;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lrq2/a;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lrq2/a;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v4, 0x3

    shl-int/lit8 v4, v4, 0x6

    or-int/2addr v4, v6

    invoke-static {v1, v2, v3, v0, v4}, Lkq2/b;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    goto :goto_e

    :goto_f
    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lrq2/a;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lrq2/d;->c(Lrq2/a;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic i(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lrq2/d;->e(Lp1/c1;Z)V

    return-void
.end method
