.class public abstract Lrq2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\t\u00b2\u0006\u000c\u0010\u0008\u001a\u00020\u00078\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lrq2/a;",
        "step",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "c",
        "(Lrq2/a;ZLandroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lrq2/a;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrq2/e;->f(Lrq2/a;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lrq2/a;Lp1/t2;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lrq2/e;->e(Lrq2/a;Lp1/t2;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lrq2/a;ZLandroidx/compose/runtime/Composer;I)V
    .locals 9

    const-string v0, "step"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Lp1/q;

    const p2, 0x691b0baf

    invoke-virtual {v4, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    const/4 v0, 0x4

    if-nez p2, :cond_1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {v4, p1}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr p2, v1

    :cond_3
    and-int/lit8 v1, p2, 0x13

    const/16 v2, 0x12

    const/4 v8, 0x0

    const/4 v3, 0x1

    if-eq v1, v2, :cond_4

    move v1, v3

    goto :goto_3

    :cond_4
    move v1, v8

    :goto_3
    and-int/2addr p2, v3

    invoke-virtual {v4, p2, v1}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_8

    if-eqz p1, :cond_7

    const p2, 0x42583435

    invoke-virtual {v4, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne p2, v1, :cond_5

    new-instance p2, Ld0/q0;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p2, v1}, Ld0/q0;-><init>(Ljava/lang/Object;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, v1}, Ld0/q0;->I0(Ljava/lang/Boolean;)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast p2, Ld0/q0;

    iget-object v1, p2, Ld0/q0;->y:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lrq2/a;->e()F

    move-result v1

    goto :goto_4

    :cond_6
    const/4 v1, 0x0

    :goto_4
    const/16 v2, 0x5dc

    const/16 v3, 0x1f4

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v0}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v2

    const/16 v6, 0x30

    const/16 v7, 0x1c

    const/4 v3, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v0

    new-instance v1, Lpp2/o;

    const/16 v2, 0x8

    invoke-direct {v1, v2, p0, v0}, Lpp2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v0, 0x10ef3dda

    invoke-static {v0, v5, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    move-object v4, v5

    const/16 v5, 0x180

    const/4 v6, 0x2

    const/4 v2, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v6}, Lkr2/b;->k(Ld0/q0;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v4

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    move-object v5, v4

    const p2, 0x428f8b73

    invoke-virtual {v5, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    move-object v5, v4

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_9

    new-instance v0, Lrq2/c;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lrq2/c;-><init>(Lrq2/a;ZII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final d(Lp1/t2;)F
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

.method private static final e(Lrq2/a;Lp1/t2;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 49

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v4, p3, 0x1

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_d

    sget-object v0, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v0, v4, v5, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v5, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_1
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v5, v15, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v5, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-nez v10, :cond_2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    :cond_2
    invoke-static {v6, v5, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v5, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lrq2/a;->n()Ljava/lang/String;

    move-result-object v16

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v5, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->r()Lb91/a;

    move-result-object v25

    invoke-virtual {v9, v5, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->b1()J

    move-result-wide v17

    const/4 v11, 0x5

    int-to-float v11, v11

    const/4 v12, 0x4

    int-to-float v12, v12

    mul-float/2addr v11, v12

    move v13, v12

    const/4 v12, 0x0

    move/from16 v19, v13

    const/16 v13, 0xc

    move-object/from16 v20, v9

    move v9, v11

    const/4 v11, 0x0

    move/from16 v21, v10

    move v10, v9

    move/from16 v31, v19

    move-object/from16 v3, v20

    move/from16 v1, v21

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    move-object/from16 v33, v8

    move/from16 v32, v9

    sget v34, Lb91/a;->d:I

    shl-int/lit8 v29, v34, 0x12

    const v30, 0x2fff8

    move-object v8, v6

    move-object v6, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v19, v14

    move-object/from16 v20, v15

    const-wide/16 v14, 0x0

    move-object/from16 v27, v5

    move-object/from16 v5, v16

    const/16 v16, 0x0

    move-object/from16 v21, v8

    move-wide/from16 v47, v17

    move-object/from16 v18, v7

    move-wide/from16 v7, v47

    const/16 v17, 0x0

    move-object/from16 v23, v18

    move-object/from16 v22, v19

    const-wide/16 v18, 0x0

    move-object/from16 v24, v20

    const/16 v20, 0x0

    move-object/from16 v26, v21

    const/16 v21, 0x0

    move-object/from16 v28, v22

    const/16 v22, 0x0

    move-object/from16 v35, v23

    const/16 v23, 0x0

    move-object/from16 v36, v24

    const/16 v24, 0x0

    move-object/from16 v37, v26

    const/16 v26, 0x0

    move-object/from16 v38, v28

    const/16 v28, 0x30

    move-object/from16 v41, v35

    move-object/from16 v40, v36

    move-object/from16 v42, v37

    move-object/from16 v39, v38

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    const/4 v12, 0x0

    const/16 v13, 0xe

    const/4 v10, 0x0

    const/4 v11, 0x0

    move/from16 v9, v32

    move-object/from16 v8, v33

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v7, v2

    mul-float v7, v7, v31

    invoke-static {v7, v4}, Ll0/m;->j(FLb2/f;)Ll0/k;

    move-result-object v7

    sget-object v8, Lb2/e;->J:Lb2/l;

    const/4 v9, 0x6

    invoke-static {v7, v8, v5, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v10, v5, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v5, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-eqz v11, :cond_4

    move-object/from16 v11, v39

    invoke-virtual {v5, v11}, Lp1/q;->l(Lc93/a;)V

    :goto_2
    move-object/from16 v12, v40

    goto :goto_3

    :cond_4
    move-object/from16 v11, v39

    invoke-virtual {v5}, Lp1/q;->s0()V

    goto :goto_2

    :goto_3
    invoke-static {v5, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-nez v7, :cond_5

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    :cond_5
    move-object/from16 v7, v41

    goto :goto_5

    :cond_6
    move-object/from16 v7, v41

    :goto_4
    move-object/from16 v8, v42

    goto :goto_6

    :goto_5
    invoke-static {v8, v5, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_4

    :goto_6
    invoke-static {v5, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lrq2/a;->j()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->u()Lb91/a;

    move-result-object v25

    invoke-virtual {v3, v5, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v13

    sget-object v10, Ly2/d;->b:Ly2/m;

    move-object/from16 v27, v5

    move-object v5, v6

    new-instance v6, Landroidx/compose/foundation/layout/WithAlignmentLineElement;

    invoke-direct {v6, v10}, Landroidx/compose/foundation/layout/WithAlignmentLineElement;-><init>(Ly2/a;)V

    const/16 v28, 0x0

    const v30, 0x2fff8

    move/from16 v16, v9

    move-object v15, v10

    const-wide/16 v9, 0x0

    move-object/from16 v19, v11

    const/4 v11, 0x0

    move-object/from16 v20, v12

    const/4 v12, 0x0

    move-object/from16 v18, v7

    move-object/from16 v42, v8

    move-wide v7, v13

    const/4 v13, 0x0

    move-object/from16 v17, v15

    const-wide/16 v14, 0x0

    move/from16 v21, v16

    const/16 v16, 0x0

    move-object/from16 v22, v17

    const/16 v17, 0x0

    move-object/from16 v35, v18

    move-object/from16 v38, v19

    const-wide/16 v18, 0x0

    move-object/from16 v36, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v26, v23

    const/16 v23, 0x0

    move-object/from16 v37, v24

    const/16 v24, 0x0

    move/from16 v39, v26

    const/16 v26, 0x0

    move-object/from16 v45, v35

    move-object/from16 v44, v36

    move-object/from16 v2, v37

    move-object/from16 v43, v38

    move-object/from16 v46, v42

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    invoke-virtual/range {p0 .. p0}, Lrq2/a;->i()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->o()Lb91/a;

    move-result-object v25

    invoke-virtual {v3, v5, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    move-object v5, v6

    new-instance v6, Landroidx/compose/foundation/layout/WithAlignmentLineElement;

    invoke-direct {v6, v2}, Landroidx/compose/foundation/layout/WithAlignmentLineElement;-><init>(Ly2/a;)V

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    const/4 v2, 0x1

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lrq2/a;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v5, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->P()Lb91/a;

    move-result-object v25

    invoke-virtual {v3, v5, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    const/16 v8, 0x8

    int-to-float v14, v8

    mul-float v12, v31, v14

    const/4 v13, 0x6

    const/4 v10, 0x0

    const/4 v11, 0x0

    move/from16 v9, v32

    move-object/from16 v8, v33

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/16 v28, 0x30

    move-wide v7, v6

    move-object v6, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v16, v14

    const-wide/16 v14, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const-wide/16 v18, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v27, v26

    const/16 v26, 0x0

    move-object/from16 p2, v5

    move-object v5, v2

    move/from16 v2, v32

    move/from16 v32, v27

    move-object/from16 v27, p2

    move-object/from16 p2, v4

    move-object/from16 v4, v33

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    const/high16 v6, 0x3f800000    # 1.0f

    float-to-double v7, v6

    const-wide/16 v9, 0x0

    cmpl-double v7, v7, v9

    if-lez v7, :cond_7

    goto :goto_7

    :cond_7
    const-string v7, "invalid weight; must be greater than zero"

    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v8, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v9, v6, v8

    if-lez v9, :cond_8

    :goto_8
    const/4 v9, 0x1

    goto :goto_9

    :cond_8
    move v8, v6

    goto :goto_8

    :goto_9
    invoke-direct {v7, v8, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v8, Lb2/e;->E:Lb2/m;

    const/4 v9, 0x0

    invoke-static {v8, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v9, v5, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v5, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-eqz v11, :cond_9

    move-object/from16 v11, v43

    invoke-virtual {v5, v11}, Lp1/q;->l(Lc93/a;)V

    :goto_a
    move-object/from16 v12, v44

    goto :goto_b

    :cond_9
    invoke-virtual {v5}, Lp1/q;->s0()V

    goto :goto_a

    :goto_b
    invoke-static {v5, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v5, Lp1/q;->S:Z

    if-nez v0, :cond_a

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    :cond_a
    move-object/from16 v0, v45

    goto :goto_d

    :cond_b
    :goto_c
    move-object/from16 v8, v46

    goto :goto_e

    :goto_d
    invoke-static {v9, v5, v9, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_c

    :goto_e
    invoke-static {v5, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x3dcccccd    # 0.1f

    invoke-static {v0, v4}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v9, 0x0

    int-to-float v7, v9

    mul-float v7, v7, v31

    const/16 v8, 0x32

    int-to-float v8, v8

    mul-float v8, v8, v31

    invoke-static {v0, v7, v8}, Landroidx/compose/foundation/layout/d;->i(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v9, Lb2/e;->z:Lb2/m;

    sget-object v10, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v10, v0, v9}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lrq2/a;->k()Ljr2/d;

    move-result-object v11

    invoke-static {v0, v11}, Ljr2/b;->a(Landroidx/compose/ui/Modifier;Ljr2/d;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v11, 0x0

    invoke-static {v0, v5, v11}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v4, v7, v8}, Landroidx/compose/foundation/layout/d;->i(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static/range {p1 .. p1}, Lrq2/e;->d(Lp1/t2;)F

    move-result v7

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v10, v0, v9}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lrq2/a;->l()Ljr2/d;

    move-result-object v7

    invoke-static {v0, v7}, Ljr2/b;->a(Landroidx/compose/ui/Modifier;Ljr2/d;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v5, v11}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 v9, 0x1

    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lrq2/a;->h()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    const v0, -0x398b6ae4

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lrq2/a;->h()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljr2/c;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v3, v5, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->N()Lb91/a;

    move-result-object v26

    const/16 v1, 0xa

    int-to-float v1, v1

    mul-float v1, v1, v31

    invoke-static {v4, v2, v1, v2, v2}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v2, "HorizontalBarHighlightedText"

    invoke-static {v1, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    shl-int/lit8 v29, v34, 0x15

    const v30, 0x1fffc

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    move-object/from16 v27, v5

    move-object v5, v0

    invoke-static/range {v5 .. v30}, Lqz0/n;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Lb91/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    const/4 v9, 0x0

    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    :goto_f
    const/4 v9, 0x1

    goto :goto_10

    :cond_c
    const v0, -0x3984e141

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v1, 0x4004000000000000L    # 2.5

    double-to-float v1, v1

    mul-float v1, v1, v32

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v1, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    move-object/from16 v2, p2

    invoke-direct {v1, v2}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v1, "HorizontalBarFooterText"

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lrq2/a;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lrq2/a;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v4, v3, 0x3

    shl-int/lit8 v3, v3, 0x6

    or-int/2addr v3, v4

    invoke-static {v0, v1, v2, v5, v3}, Lkq2/b;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    const/4 v9, 0x0

    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_d
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_11
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lrq2/a;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lrq2/e;->c(Lrq2/a;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
