.class public abstract Lg1/o3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:F

.field public static final f:F

.field public static final g:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x8

    int-to-float v0, v0

    sput v0, Lg1/o3;->a:F

    const/16 v1, 0x30

    int-to-float v1, v1

    sput v1, Lg1/o3;->b:F

    const/16 v2, 0x10

    int-to-float v2, v2

    sput v2, Lg1/o3;->c:F

    sput v0, Lg1/o3;->d:F

    const/16 v0, 0x70

    int-to-float v0, v0

    sput v0, Lg1/o3;->e:F

    const/16 v0, 0x118

    int-to-float v0, v0

    sput v0, Lg1/o3;->f:F

    sput v1, Lg1/o3;->g:F

    return-void
.end method

.method public static final a(Ld0/q0;Lp1/c1;Lf0/r1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v11, p5

    check-cast v11, Lp1/q;

    const v0, 0x4037b988

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int v0, p6, v0

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/16 v7, 0x100

    goto :goto_1

    :cond_1
    const/16 v7, 0x80

    :goto_1
    or-int/2addr v0, v7

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x800

    goto :goto_2

    :cond_2
    const/16 v7, 0x400

    :goto_2
    or-int/2addr v0, v7

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x4000

    goto :goto_3

    :cond_3
    const/16 v7, 0x2000

    :goto_3
    or-int/2addr v0, v7

    and-int/lit16 v7, v0, 0x2493

    const/16 v8, 0x2492

    const/4 v13, 0x0

    const/4 v9, 0x1

    if-eq v7, v8, :cond_4

    move v7, v9

    goto :goto_4

    :cond_4
    move v7, v13

    :goto_4
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v11, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_d

    and-int/lit8 v0, v0, 0xe

    const/16 v7, 0x30

    or-int/2addr v0, v7

    const-string v7, "DropDownMenu"

    invoke-static {v1, v7, v11, v0}, Ld0/d2;->e(Lal/a;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/z1;

    move-result-object v0

    sget-object v10, Ld0/f;->i:Ld0/f2;

    iget-object v7, v0, Ld0/z1;->a:Lal/a;

    iget-object v14, v0, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v7}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    const v8, -0x6d4ea05c

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    const v12, 0x3f4ccccd    # 0.8f

    if-eqz v7, :cond_5

    const/high16 v7, 0x3f800000    # 1.0f

    goto :goto_5

    :cond_5
    move v7, v12

    :goto_5
    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v14}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/Boolean;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v16

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    if-eqz v16, :cond_6

    const/high16 v12, 0x3f800000    # 1.0f

    :cond_6
    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual {v0}, Ld0/z1;->f()Ld0/t1;

    move-result-object v12

    const v15, 0x1a8d69bf

    invoke-virtual {v11, v15}, Lp1/q;->e0(I)V

    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v12, v15, v6}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    move/from16 v17, v12

    if-eqz v17, :cond_7

    const/16 v9, 0x78

    sget-object v12, Ld0/b0;->b:Ld0/v;

    invoke-static {v9, v13, v12, v2}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v2

    move-object v9, v2

    move v2, v13

    const/4 v12, 0x0

    goto :goto_6

    :cond_7
    const/16 v2, 0x4a

    const/4 v12, 0x0

    const/4 v13, 0x4

    invoke-static {v9, v2, v12, v13}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v2

    move-object v9, v2

    const/4 v2, 0x0

    :goto_6
    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    move-object/from16 v17, v12

    const/4 v12, 0x0

    move-object v2, v6

    move-object v6, v0

    move-object v0, v2

    move-object/from16 v2, v17

    invoke-static/range {v6 .. v12}, Ld0/d2;->d(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Ld0/f2;Landroidx/compose/runtime/Composer;I)Ld0/v1;

    move-result-object v13

    iget-object v7, v6, Ld0/z1;->a:Lal/a;

    invoke-virtual {v7}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    const v8, -0x5e139348

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    if-eqz v7, :cond_8

    const/high16 v7, 0x3f800000    # 1.0f

    :goto_7
    const/4 v9, 0x0

    goto :goto_8

    :cond_8
    const/4 v7, 0x0

    goto :goto_7

    :goto_8
    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v14}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    if-eqz v14, :cond_9

    const/high16 v16, 0x3f800000    # 1.0f

    goto :goto_9

    :cond_9
    const/16 v16, 0x0

    :goto_9
    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual {v6}, Ld0/z1;->f()Ld0/t1;

    move-result-object v14

    const v12, 0x29c876d3

    invoke-virtual {v11, v12}, Lp1/q;->e0(I)V

    invoke-interface {v14, v15, v0}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v12, 0x6

    if-eqz v0, :cond_a

    const/16 v0, 0x1e

    invoke-static {v0, v9, v2, v12}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    goto :goto_a

    :cond_a
    const/16 v0, 0x4b

    invoke-static {v0, v9, v2, v12}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    :goto_a
    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    move-object v9, v0

    const/4 v12, 0x0

    invoke-static/range {v6 .. v12}, Ld0/d2;->d(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Ld0/f2;Landroidx/compose/runtime/Composer;I)Ld0/v1;

    move-result-object v0

    invoke-virtual {v11, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v2, v6

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_c

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v6, v2, :cond_b

    goto :goto_b

    :cond_b
    move-object/from16 v7, p1

    goto :goto_c

    :cond_c
    :goto_b
    new-instance v6, Lep1/g;

    const/16 v2, 0xd

    move-object/from16 v7, p1

    invoke-direct {v6, v7, v13, v0, v2}, Lep1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    check-cast v6, Lkotlin/jvm/functions/Function1;

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v6}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    new-instance v0, Lg1/f;

    const/4 v2, 0x1

    invoke-direct {v0, v4, v3, v5, v2}, Lg1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v2, -0x2a2547bb

    invoke-static {v2, v11, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    const/high16 v14, 0x1b0000

    const/16 v15, 0x1e

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-object v13, v11

    sget v11, Lg1/o3;->a:F

    invoke-static/range {v6 .. v15}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v13

    goto :goto_d

    :cond_d
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_e

    new-instance v0, La81/g;

    const/4 v7, 0x4

    move-object/from16 v2, p1

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, La81/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final b(Lc93/a;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    check-cast p3, Lp1/q;

    const v0, -0x2832668a

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 v1, p4, 0x30

    sget-object v2, Lb2/t;->w:Lb2/t;

    if-nez v1, :cond_3

    invoke-virtual {p3, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p4, 0x180

    const/4 v9, 0x1

    if-nez v1, :cond_5

    invoke-virtual {p3, v9}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, p4, 0xc00

    if-nez v1, :cond_7

    invoke-virtual {p3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0x800

    goto :goto_4

    :cond_6
    const/16 v1, 0x400

    :goto_4
    or-int/2addr v0, v1

    :cond_7
    and-int/lit16 v1, p4, 0x6000

    if-nez v1, :cond_9

    const/4 v1, 0x0

    invoke-virtual {p3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    const/16 v1, 0x4000

    goto :goto_5

    :cond_8
    const/16 v1, 0x2000

    :goto_5
    or-int/2addr v0, v1

    :cond_9
    const/high16 v1, 0x30000

    and-int/2addr v1, p4

    if-nez v1, :cond_b

    invoke-virtual {p3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    const/high16 v1, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v1, 0x10000

    :goto_6
    or-int/2addr v0, v1

    :cond_b
    const v1, 0x12493

    and-int/2addr v1, v0

    const v3, 0x12492

    if-eq v1, v3, :cond_c

    move v1, v9

    goto :goto_7

    :cond_c
    const/4 v1, 0x0

    :goto_7
    and-int/2addr v0, v9

    invoke-virtual {p3, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_10

    const/4 v0, 0x0

    const-wide/16 v3, 0x0

    const/4 v1, 0x6

    invoke-static {v3, v4, v1, v9, v0}, Lg1/z4;->a(JIZF)Landroidx/compose/material/d;

    move-result-object v4

    const/4 v6, 0x0

    const/16 v8, 0x18

    const/4 v3, 0x0

    const/4 v5, 0x1

    move-object v7, p0

    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v5, 0x0

    const/16 v6, 0x8

    sget v2, Lg1/o3;->e:F

    sget v3, Lg1/o3;->g:F

    sget v4, Lg1/o3;->f:F

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/d;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-static {p1, p0}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object v0, Lb2/e;->K:Lb2/l;

    sget-object v1, Ll0/m;->a:Ll0/e;

    const/16 v2, 0x30

    invoke-static {v1, v0, p3, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v3, p3, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {p3}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {p3, p0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {p3}, Lp1/q;->i0()V

    iget-boolean v5, p3, Lp1/q;->S:Z

    if-eqz v5, :cond_d

    invoke-virtual {p3, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {p3}, Lp1/q;->s0()V

    :goto_8
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {p3, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {p3, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v3, p3, Lp1/q;->S:Z

    if-nez v3, :cond_e

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    :cond_e
    invoke-static {v1, p3, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {p3, v0, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p0, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {p3, p0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg1/h9;

    iget-object p0, p0, Lg1/h9;->g:Ll3/v0;

    new-instance v0, Lg1/m0;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p2}, Lg1/m0;-><init>(ILkotlin/jvm/functions/Function3;)V

    const v1, -0x4a23075

    invoke-static {v1, p3, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    invoke-static {p0, v0, p3, v2}, Lg1/f9;->a(Ll3/v0;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v9}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_10
    move-object v7, p0

    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_11

    new-instance p3, Lcy1/b;

    invoke-direct {p3, v7, p1, p2, p4}, Lcy1/b;-><init>(Lc93/a;Ll0/k1;Lkotlin/jvm/functions/Function3;I)V

    iput-object p3, p0, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method
