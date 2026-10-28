.class public abstract Landroidx/compose/material3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:F

.field public static final f:Ld0/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lo1/y;->p:F

    sput v0, Landroidx/compose/material3/d;->a:F

    sget v1, Lo1/y;->z:F

    sput v1, Landroidx/compose/material3/d;->b:F

    sget v1, Lo1/y;->w:F

    sput v1, Landroidx/compose/material3/d;->c:F

    sget v1, Lo1/y;->t:F

    sput v1, Landroidx/compose/material3/d;->d:F

    sub-float/2addr v1, v0

    const/4 v0, 0x2

    int-to-float v0, v0

    div-float/2addr v1, v0

    sput v1, Landroidx/compose/material3/d;->e:F

    new-instance v0, Ld0/g1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld0/g1;-><init>(I)V

    sput-object v0, Landroidx/compose/material3/d;->f:Ld0/g1;

    return-void
.end method

.method public static final a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl1/d4;Landroidx/compose/runtime/Composer;II)V
    .locals 50

    move-object/from16 v2, p1

    move-object/from16 v7, p5

    check-cast v7, Lp1/q;

    const v0, -0xfb23c9f

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    move/from16 v1, p0

    invoke-virtual {v7, v1}, Lp1/q;->h(Z)Z

    move-result v0

    const/4 v8, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v8

    :goto_0
    or-int v0, p6, v0

    invoke-virtual {v7, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x20

    goto :goto_1

    :cond_1
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v0, v3

    and-int/lit8 v3, p7, 0x4

    if-eqz v3, :cond_2

    or-int/lit16 v0, v0, 0x180

    move-object/from16 v4, p2

    goto :goto_3

    :cond_2
    move-object/from16 v4, p2

    invoke-virtual {v7, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x100

    goto :goto_2

    :cond_3
    const/16 v5, 0x80

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    or-int/lit16 v0, v0, 0x6c00

    and-int/lit8 v5, p7, 0x20

    if-nez v5, :cond_4

    move-object/from16 v5, p4

    invoke-virtual {v7, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/high16 v6, 0x20000

    goto :goto_4

    :cond_4
    move-object/from16 v5, p4

    :cond_5
    const/high16 v6, 0x10000

    :goto_4
    or-int/2addr v0, v6

    const/high16 v6, 0x180000

    or-int/2addr v0, v6

    const v6, 0x92493

    and-int/2addr v6, v0

    const v9, 0x92492

    const/4 v10, 0x0

    if-eq v6, v9, :cond_6

    const/4 v6, 0x1

    goto :goto_5

    :cond_6
    move v6, v10

    :goto_5
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v7, v9, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-virtual {v7}, Lp1/q;->Z()V

    and-int/lit8 v6, p6, 0x1

    sget-object v9, Lb2/t;->w:Lb2/t;

    const v12, -0x70001

    if-eqz v6, :cond_9

    invoke-virtual {v7}, Lp1/q;->C()Z

    move-result v6

    if-eqz v6, :cond_7

    goto :goto_6

    :cond_7
    invoke-virtual {v7}, Lp1/q;->X()V

    and-int/lit8 v3, p7, 0x20

    if-eqz v3, :cond_8

    and-int/2addr v0, v12

    :cond_8
    move v12, v0

    move-object v11, v4

    move-object v15, v5

    move/from16 v4, p3

    goto/16 :goto_9

    :cond_9
    :goto_6
    if-eqz v3, :cond_a

    move-object v4, v9

    :cond_a
    and-int/lit8 v3, p7, 0x20

    if-eqz v3, :cond_c

    sget-object v3, Ll1/n;->a:Lp1/u2;

    invoke-virtual {v7, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/m;

    iget-object v5, v3, Ll1/m;->b0:Ll1/d4;

    iget-wide v13, v3, Ll1/m;->p:J

    if-nez v5, :cond_b

    new-instance v15, Ll1/d4;

    sget-object v5, Lo1/y;->o:Lo1/f;

    invoke-static {v3, v5}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v16

    sget-object v5, Lo1/y;->r:Lo1/f;

    invoke-static {v3, v5}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v18

    sget-wide v20, Li2/x;->m:J

    sget-object v5, Lo1/y;->q:Lo1/f;

    invoke-static {v3, v5}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v22

    sget-object v5, Lo1/y;->y:Lo1/f;

    invoke-static {v3, v5}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v24

    sget-object v5, Lo1/y;->B:Lo1/f;

    invoke-static {v3, v5}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v26

    sget-object v5, Lo1/y;->x:Lo1/f;

    invoke-static {v3, v5}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v28

    sget-object v5, Lo1/y;->A:Lo1/f;

    invoke-static {v3, v5}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v30

    sget-object v5, Lo1/y;->a:Lo1/f;

    invoke-static {v3, v5}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v5

    sget v11, Lo1/y;->b:F

    invoke-static {v11, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v5

    invoke-static {v5, v6, v13, v14}, Li2/w0;->p(JJ)J

    move-result-wide v32

    sget-object v5, Lo1/y;->e:Lo1/f;

    invoke-static {v3, v5}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v5

    sget v11, Lo1/y;->f:F

    invoke-static {v11, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v5

    invoke-static {v5, v6, v13, v14}, Li2/w0;->p(JJ)J

    move-result-wide v34

    sget-object v5, Lo1/y;->c:Lo1/f;

    invoke-static {v3, v5}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v5

    move/from16 v48, v12

    sget v12, Lo1/y;->d:F

    invoke-static {v12, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v5

    invoke-static {v5, v6, v13, v14}, Li2/w0;->p(JJ)J

    move-result-wide v38

    sget-object v5, Lo1/y;->g:Lo1/f;

    invoke-static {v3, v5}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v5

    sget v12, Lo1/y;->h:F

    invoke-static {v12, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v5

    invoke-static {v5, v6, v13, v14}, Li2/w0;->p(JJ)J

    move-result-wide v40

    sget-object v5, Lo1/y;->k:Lo1/f;

    invoke-static {v3, v5}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v5

    invoke-static {v11, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v5

    invoke-static {v5, v6, v13, v14}, Li2/w0;->p(JJ)J

    move-result-wide v42

    sget-object v5, Lo1/y;->l:Lo1/f;

    invoke-static {v3, v5}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v5

    invoke-static {v11, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v5

    invoke-static {v5, v6, v13, v14}, Li2/w0;->p(JJ)J

    move-result-wide v44

    sget-object v5, Lo1/y;->i:Lo1/f;

    invoke-static {v3, v5}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v5

    sget v11, Lo1/y;->j:F

    invoke-static {v11, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v5

    invoke-static {v5, v6, v13, v14}, Li2/w0;->p(JJ)J

    move-result-wide v46

    move-wide/from16 v36, v20

    invoke-direct/range {v15 .. v47}, Ll1/d4;-><init>(JJJJJJJJJJJJJJJJ)V

    iput-object v15, v3, Ll1/m;->b0:Ll1/d4;

    goto :goto_7

    :cond_b
    move/from16 v48, v12

    move-object v15, v5

    :goto_7
    and-int v0, v0, v48

    goto :goto_8

    :cond_c
    move-object v15, v5

    :goto_8
    move v12, v0

    move-object v11, v4

    const/4 v4, 0x1

    :goto_9
    invoke-virtual {v7}, Lp1/q;->r()V

    const v0, 0x696ac19a

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v0, v3, :cond_d

    invoke-static {v7}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v0

    :cond_d
    check-cast v0, Lj0/i;

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    if-eqz v2, :cond_e

    sget-object v3, Ll1/w1;->a:Ly2/m;

    move-object v2, v0

    sget-object v0, Landroidx/compose/material3/MinimumInteractiveModifier;->w:Landroidx/compose/material3/MinimumInteractiveModifier;

    new-instance v5, Li3/i;

    invoke-direct {v5, v8}, Li3/i;-><init>(I)V

    const/4 v3, 0x0

    move-object/from16 v6, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/selection/d;->a(Landroidx/compose/ui/Modifier;ZLj0/i;Lf0/v0;ZLi3/i;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move/from16 v49, v4

    move-object v4, v2

    move/from16 v2, v49

    goto :goto_a

    :cond_e
    move v2, v4

    move-object v4, v0

    :goto_a
    invoke-interface {v11, v9}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->E:Lb2/m;

    invoke-static {v0, v1, v10, v8}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v1, Landroidx/compose/material3/d;->c:F

    sget v3, Landroidx/compose/material3/d;->d:F

    invoke-static {v0, v1, v3}, Landroidx/compose/foundation/layout/d;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lo1/y;->m:Lo1/t;

    invoke-static {v1, v7}, Ll1/q3;->b(Lo1/t;Landroidx/compose/runtime/Composer;)Li2/a1;

    move-result-object v5

    shl-int/lit8 v1, v12, 0x3

    and-int/lit8 v1, v1, 0x70

    shr-int/lit8 v3, v12, 0x6

    or-int/lit16 v1, v1, 0x180

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v1, v3

    or-int/lit16 v1, v1, 0x6000

    move-object v6, v7

    move-object v3, v15

    move v7, v1

    move/from16 v1, p0

    invoke-static/range {v0 .. v7}, Landroidx/compose/material3/d;->b(Landroidx/compose/ui/Modifier;ZZLl1/d4;Lj0/i;Li2/a1;Landroidx/compose/runtime/Composer;I)V

    move v4, v2

    move-object v5, v3

    move-object v3, v11

    goto :goto_b

    :cond_f
    move-object v6, v7

    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v3, v4

    move/from16 v4, p3

    :goto_b
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_10

    new-instance v0, Ld30/k0;

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Ld30/k0;-><init>(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl1/d4;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method public static final b(Landroidx/compose/ui/Modifier;ZZLl1/d4;Lj0/i;Li2/a1;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    move-object/from16 v0, p6

    check-cast v0, Lp1/q;

    const v8, -0x27fd625d

    invoke-virtual {v0, v8}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v8, v7, 0x6

    if-nez v8, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    const/4 v8, 0x4

    goto :goto_0

    :cond_0
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v7

    goto :goto_1

    :cond_1
    move v8, v7

    :goto_1
    and-int/lit8 v11, v7, 0x30

    if-nez v11, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_2

    const/16 v11, 0x20

    goto :goto_2

    :cond_2
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v8, v11

    :cond_3
    and-int/lit16 v11, v7, 0x180

    if-nez v11, :cond_5

    invoke-virtual {v0, v3}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v11, 0x100

    goto :goto_3

    :cond_4
    const/16 v11, 0x80

    :goto_3
    or-int/2addr v8, v11

    :cond_5
    and-int/lit16 v11, v7, 0xc00

    if-nez v11, :cond_7

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    const/16 v11, 0x800

    goto :goto_4

    :cond_6
    const/16 v11, 0x400

    :goto_4
    or-int/2addr v8, v11

    :cond_7
    and-int/lit16 v11, v7, 0x6000

    if-nez v11, :cond_9

    const/4 v11, 0x0

    invoke-virtual {v0, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x4000

    goto :goto_5

    :cond_8
    const/16 v11, 0x2000

    :goto_5
    or-int/2addr v8, v11

    :cond_9
    const/high16 v11, 0x30000

    and-int/2addr v11, v7

    if-nez v11, :cond_b

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/high16 v11, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v11, 0x10000

    :goto_6
    or-int/2addr v8, v11

    :cond_b
    const/high16 v11, 0x180000

    and-int/2addr v11, v7

    if-nez v11, :cond_d

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    const/high16 v11, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v11, 0x80000

    :goto_7
    or-int/2addr v8, v11

    :cond_d
    const v11, 0x92493

    and-int/2addr v11, v8

    const v12, 0x92492

    const/4 v13, 0x1

    if-eq v11, v12, :cond_e

    move v11, v13

    goto :goto_8

    :cond_e
    const/4 v11, 0x0

    :goto_8
    and-int/2addr v8, v13

    invoke-virtual {v0, v8, v11}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_1e

    if-eqz v3, :cond_10

    if-eqz v2, :cond_f

    iget-wide v11, v4, Ll1/d4;->b:J

    goto :goto_9

    :cond_f
    iget-wide v11, v4, Ll1/d4;->f:J

    goto :goto_9

    :cond_10
    if-eqz v2, :cond_11

    iget-wide v11, v4, Ll1/d4;->j:J

    goto :goto_9

    :cond_11
    iget-wide v11, v4, Ll1/d4;->n:J

    :goto_9
    if-eqz v3, :cond_13

    if-eqz v2, :cond_12

    iget-wide v9, v4, Ll1/d4;->a:J

    goto :goto_a

    :cond_12
    iget-wide v9, v4, Ll1/d4;->e:J

    goto :goto_a

    :cond_13
    if-eqz v2, :cond_14

    iget-wide v9, v4, Ll1/d4;->i:J

    goto :goto_a

    :cond_14
    iget-wide v9, v4, Ll1/d4;->m:J

    :goto_a
    sget-object v15, Lo1/y;->v:Lo1/t;

    invoke-static {v15, v0}, Ll1/q3;->b(Lo1/t;Landroidx/compose/runtime/Composer;)Li2/a1;

    move-result-object v15

    sget v8, Lo1/y;->u:F

    if-eqz v3, :cond_16

    if-eqz v2, :cond_15

    iget-wide v13, v4, Ll1/d4;->c:J

    goto :goto_b

    :cond_15
    iget-wide v13, v4, Ll1/d4;->g:J

    goto :goto_b

    :cond_16
    if-eqz v2, :cond_17

    iget-wide v13, v4, Ll1/d4;->k:J

    goto :goto_b

    :cond_17
    iget-wide v13, v4, Ll1/d4;->o:J

    :goto_b
    invoke-static {v1, v8, v13, v14, v15}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8, v11, v12, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v11, Lb2/e;->w:Lb2/m;

    const/4 v12, 0x0

    invoke-static {v11, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v12, v0, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v0, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_18

    invoke-virtual {v0, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_18
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_c
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v0, v15, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v0, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v1, v0, Lp1/q;->S:Z

    if-nez v1, :cond_19

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    :cond_19
    invoke-static {v12, v0, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v0, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lb2/t;->w:Lb2/t;

    sget-object v8, Lb2/e;->z:Lb2/m;

    sget-object v12, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v12, v3, v8}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v8, Landroidx/compose/material3/ThumbElement;

    sget-object v12, Lo1/n;->x:Lo1/n;

    invoke-static {v12, v0}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v12

    invoke-direct {v8, v5, v2, v12}, Landroidx/compose/material3/ThumbElement;-><init>(Lj0/i;ZLd0/i1;)V

    invoke-interface {v3, v8}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v8, Lo1/y;->s:F

    const/4 v12, 0x2

    int-to-float v12, v12

    div-float/2addr v8, v12

    const/4 v2, 0x0

    const/4 v12, 0x4

    invoke-static {v8, v12, v2}, Ll1/l3;->a(FIZ)Landroidx/compose/material3/c;

    move-result-object v8

    invoke-static {v3, v5, v8}, Landroidx/compose/foundation/d;->a(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3, v9, v10, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, Lb2/e;->E:Lb2/m;

    invoke-static {v8, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v9, v0, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-eqz v10, :cond_1b

    invoke-virtual {v0, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_1b
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v0, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v11, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v0, Lp1/q;->S:Z

    if-nez v8, :cond_1c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1d

    :cond_1c
    invoke-static {v2, v0, v2, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    invoke-static {v0, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x49acf3f3

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    const/4 v12, 0x0

    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_1e
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1f

    new-instance v0, Lb30/v;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    invoke-direct/range {v0 .. v7}, Lb30/v;-><init>(Landroidx/compose/ui/Modifier;ZZLl1/d4;Lj0/i;Li2/a1;I)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method
