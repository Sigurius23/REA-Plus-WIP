.class public abstract Lg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lf;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf;-><init>(I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, -0xad7388

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lg;->a:Lx1/b;

    return-void
.end method

.method public static final a(Le0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 37

    move-object/from16 v1, p0

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, v1, Le0;->a:F

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v2, 0x4e7b1f5c

    invoke-virtual {v12, v2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    const/4 v15, 0x4

    if-eqz v2, :cond_0

    move v2, v15

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    const/16 v6, 0x30

    or-int/2addr v2, v6

    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    const/4 v9, 0x0

    if-eq v3, v4, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    move v3, v9

    :goto_1
    and-int/lit8 v4, v2, 0x1

    invoke-virtual {v12, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    const/4 v10, 0x0

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v3, v11, :cond_2

    invoke-static {v10, v12}, Ld;->v(FLp1/q;)Lp1/g1;

    move-result-object v3

    :cond_2
    check-cast v3, Lp1/z0;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v11, :cond_3

    invoke-static {v10, v12}, Ld;->v(FLp1/q;)Lp1/g1;

    move-result-object v4

    :cond_3
    check-cast v4, Lp1/z0;

    sget-object v5, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v12, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/c;

    iget v13, v1, Le0;->j:F

    invoke-interface {v5, v13}, Ly3/c;->q0(F)F

    move-result v13

    iget v14, v1, Le0;->k:F

    invoke-interface {v5, v14}, Ly3/c;->q0(F)F

    move-result v14

    iget v6, v1, Le0;->l:F

    invoke-interface {v5, v6}, Ly3/c;->q0(F)F

    move-result v6

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    and-int/lit8 v2, v2, 0xe

    if-ne v2, v15, :cond_4

    const/16 v16, 0x1

    goto :goto_2

    :cond_4
    move/from16 v16, v9

    :goto_2
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move/from16 v18, v2

    move-object v2, v3

    move-object v3, v4

    const/4 v4, 0x0

    if-nez v16, :cond_5

    if-ne v8, v11, :cond_6

    :cond_5
    move-object v8, v0

    goto :goto_3

    :cond_6
    move-object v1, v8

    move-object v8, v0

    move-object v0, v1

    move-object/from16 v16, v2

    move-object v1, v4

    move-object v10, v5

    move/from16 v34, v18

    goto :goto_4

    :goto_3
    new-instance v0, Ld0;

    move-object/from16 v16, v5

    const/4 v5, 0x0

    move-object/from16 v10, v16

    move/from16 v34, v18

    invoke-direct/range {v0 .. v5}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object/from16 v16, v2

    move-object v1, v4

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_4
    check-cast v0, Lc93/m;

    invoke-static {v8, v10, v0, v12}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    const v0, -0x160278f6

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    move-object v4, v3

    check-cast v4, Lp1/g1;

    invoke-virtual {v4}, Lp1/g1;->x()F

    move-result v8

    const/4 v0, 0x6

    move v2, v9

    invoke-static {v2, v2, v1, v0}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v9

    move v4, v13

    const/16 v13, 0xc30

    move v3, v14

    const/16 v14, 0x14

    const-string v10, "GaugeAnimation"

    move-object v5, v11

    const/4 v11, 0x0

    move-object/from16 v35, v5

    const/16 v17, 0x1

    move v5, v2

    const/4 v2, 0x0

    invoke-static/range {v8 .. v14}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v8

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    move-object/from16 v9, v16

    check-cast v9, Lp1/g1;

    invoke-virtual {v9}, Lp1/g1;->x()F

    move-result v9

    const/high16 v10, 0x42aa0000    # 85.0f

    cmpl-float v9, v9, v10

    if-gez v9, :cond_7

    move/from16 v18, v5

    goto :goto_5

    :cond_7
    move/from16 v18, v17

    :goto_5
    const/high16 v10, 0x3f800000    # 1.0f

    move v9, v8

    if-eqz v18, :cond_8

    move v8, v10

    goto :goto_6

    :cond_8
    move v8, v2

    :goto_6
    const/16 v11, 0x258

    move v13, v9

    invoke-static {v11, v5, v1, v0}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v9

    move v14, v13

    const/16 v13, 0xc30

    move/from16 v19, v14

    const/16 v14, 0x14

    move/from16 v20, v10

    const-string v10, "FadeAlpha"

    move/from16 v21, v11

    const/4 v11, 0x0

    move/from16 v36, v19

    move/from16 v15, v21

    invoke-static/range {v8 .. v14}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v8

    if-eqz v18, :cond_9

    int-to-float v9, v5

    :goto_7
    move v10, v2

    goto :goto_8

    :cond_9
    const/16 v9, 0xa

    int-to-float v9, v9

    goto :goto_7

    :goto_8
    invoke-static {v15, v5, v1, v0}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v2

    move v11, v5

    const/16 v5, 0x1b0

    move v13, v6

    const/16 v6, 0x8

    move v14, v3

    const-string v3, "SlideUpOffset"

    move v10, v4

    move-object v4, v12

    move-object v12, v1

    move v1, v9

    move-object/from16 v9, p0

    invoke-static/range {v1 .. v6}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v1

    if-eqz v18, :cond_a

    int-to-float v2, v11

    goto :goto_9

    :cond_a
    const/16 v2, -0xa

    int-to-float v2, v2

    :goto_9
    invoke-static {v15, v11, v12, v0}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v3

    const/16 v5, 0x1b0

    const/16 v6, 0x8

    move-object v12, v1

    move v1, v2

    move-object v2, v3

    const-string v3, "SlideDownOffset"

    invoke-static/range {v1 .. v6}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v15

    move-object v1, v4

    iget v2, v9, Le0;->t:F

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->E:Lb2/m;

    invoke-static {v4, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v5, v1, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v0, v1, Lp1/q;->S:Z

    if-eqz v0, :cond_b

    invoke-virtual {v1, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_b
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_a
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v1, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v1, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    move-object/from16 v21, v0

    iget-boolean v0, v1, Lp1/q;->S:Z

    if-nez v0, :cond_c

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_b

    :cond_c
    move-object/from16 v22, v4

    :goto_b
    invoke-static {v5, v1, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v1, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v4, v34

    const/4 v5, 0x4

    if-ne v4, v5, :cond_e

    const/16 v17, 0x1

    :goto_c
    move-object v4, v2

    move/from16 v2, v36

    goto :goto_d

    :cond_e
    const/16 v17, 0x0

    goto :goto_c

    :goto_d
    invoke-virtual {v1, v2}, Lp1/q;->d(F)Z

    move-result v5

    or-int v5, v17, v5

    invoke-virtual {v1, v10}, Lp1/q;->d(F)Z

    move-result v17

    or-int v5, v5, v17

    invoke-virtual {v1, v13}, Lp1/q;->d(F)Z

    move-result v17

    or-int v5, v5, v17

    invoke-virtual {v1, v14}, Lp1/q;->d(F)Z

    move-result v17

    or-int v5, v5, v17

    move-object/from16 v17, v0

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v5, :cond_10

    move-object/from16 v5, v35

    if-ne v0, v5, :cond_f

    goto :goto_e

    :cond_f
    move-object v7, v9

    move-object v9, v1

    move-object v1, v7

    move-object v7, v4

    move-object v14, v6

    move-object/from16 v16, v15

    move-object/from16 v15, v17

    move-object/from16 v10, v21

    move-object/from16 v13, v22

    move-object/from16 v21, v3

    move-object/from16 v17, v8

    const/4 v8, 0x6

    goto :goto_f

    :cond_10
    :goto_e
    new-instance v0, Ly;

    move-object v5, v9

    move-object v9, v1

    move-object v1, v5

    move v5, v14

    move-object v14, v6

    move v6, v5

    move-object v7, v4

    move v4, v10

    move v5, v13

    move-object/from16 v10, v21

    move-object/from16 v13, v22

    move-object/from16 v21, v3

    move-object/from16 v3, v16

    move-object/from16 v16, v15

    move-object/from16 v15, v17

    move-object/from16 v17, v8

    const/4 v8, 0x6

    invoke-direct/range {v0 .. v6}, Ly;-><init>(Le0;FLp1/z0;FFF)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_f
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v7, v0, v9, v8}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x5

    int-to-float v0, v0

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float v25, v0, v3

    const/16 v26, 0x7

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v3, v21

    sget-object v4, Lb2/e;->N:Lb2/k;

    sget-object v5, Ll0/m;->c:Ll0/g;

    const/16 v6, 0x30

    invoke-static {v5, v4, v9, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_11

    invoke-virtual {v9, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_11
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v9, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-nez v4, :cond_12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_13

    :cond_12
    invoke-static {v5, v9, v5, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v9, v15, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lb3/v1;->n:Lp1/u2;

    sget-object v4, Ly3/m;->w:Ly3/m;

    invoke-virtual {v0, v4}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    new-instance v4, Lz;

    move-object/from16 v5, v17

    invoke-direct {v4, v12, v5, v2, v1}, Lz;-><init>(Lp1/t2;Lp1/t2;FLe0;)V

    const v2, -0x74cef1e8

    invoke-static {v2, v9, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/16 v4, 0x38

    invoke-static {v0, v2, v9, v4}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    iget-object v0, v1, Le0;->b:Ljava/lang/String;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2, v9, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v10

    invoke-virtual {v2, v9, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->r()Lb91/a;

    move-result-object v28

    invoke-interface/range {v16 .. v16}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/f;

    iget v2, v2, Ly3/f;->w:F

    const/4 v4, 0x0

    const/4 v6, 0x1

    invoke-static {v3, v4, v2, v6}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4, v2}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v32, 0x0

    const v33, 0x2fff8

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    move-object v8, v0

    move-object/from16 v30, v9

    move-object v9, v2

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v30

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_14
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object/from16 v3, p1

    :goto_11
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_15

    new-instance v2, La0;

    const/4 v4, 0x0

    move/from16 v7, p3

    invoke-direct {v2, v1, v3, v7, v4}, La0;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method
