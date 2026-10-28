.class public abstract Lg0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lg0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    sget-object v0, Lc4/k0;->w:Lc4/k0;

    sget-object v0, Lc4/r;->a:Lp1/b0;

    sget-object v0, Lc4/k0;->w:Lc4/k0;

    sget-object v0, Lc4/k0;->w:Lc4/k0;

    new-instance v1, Lg0/c;

    sget-wide v2, Li2/x;->f:J

    sget-wide v4, Li2/x;->b:J

    const v0, 0x3ec28f5c    # 0.38f

    invoke-static {v0, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v8

    invoke-static {v0, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v10

    move-wide v6, v4

    invoke-direct/range {v1 .. v11}, Lg0/c;-><init>(JJJJJ)V

    sput-object v1, Lg0/f;->a:Lg0/c;

    return-void
.end method

.method public static final a(Lg0/c;Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, 0x250a92d0

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v4, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v4

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    move-object/from16 v6, p1

    if-nez v5, :cond_3

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :cond_3
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v2, v5

    :cond_5
    and-int/lit16 v5, v2, 0x93

    const/16 v7, 0x92

    const/4 v15, 0x0

    const/4 v8, 0x1

    if-eq v5, v7, :cond_6

    move v5, v8

    goto :goto_4

    :cond_6
    move v5, v15

    :goto_4
    and-int/lit8 v7, v2, 0x1

    invoke-virtual {v0, v7, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_a

    sget v7, Lg0/e;->d:F

    sget v5, Lg0/e;->e:F

    invoke-static {v5}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    const-wide/16 v12, 0x0

    const/16 v14, 0x1c

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    move/from16 v16, v8

    move-object v8, v5

    move/from16 v5, v16

    invoke-static/range {v6 .. v14}, Le93/b;->a0(Landroidx/compose/ui/Modifier;FLi2/a1;ZJJI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    iget-wide v8, v1, Lg0/c;->a:J

    sget-object v6, Li2/w0;->a:Li2/v0;

    invoke-static {v7, v8, v9, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Ll0/a1;->x:Ll0/a1;

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v7, 0x0

    sget v8, Lg0/e;->i:F

    invoke-static {v6, v7, v8, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v15, v0, v5}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v7

    const/16 v8, 0xe

    invoke-static {v6, v7, v8}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    shl-int/lit8 v2, v2, 0x3

    and-int/lit16 v2, v2, 0x1c00

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v8, v0, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v0, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v0, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-eqz v11, :cond_7

    invoke-virtual {v0, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_5
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v0, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v0, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-nez v9, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    :cond_8
    invoke-static {v8, v0, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v0, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v2, v2, 0x6

    and-int/lit8 v2, v2, 0x70

    or-int/lit8 v2, v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v6, Ll0/z;->a:Ll0/z;

    invoke-virtual {v3, v6, v0, v2}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_b

    new-instance v0, Lcy1/b;

    const/16 v5, 0x14

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v5}, Lcy1/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lg0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 8

    check-cast p3, Lp1/q;

    const v0, -0x55480bb2

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, p4, 0x6

    goto :goto_1

    :cond_0
    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    :goto_1
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_2
    invoke-virtual {p3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_2

    :cond_3
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :goto_3
    invoke-virtual {p3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_4

    :cond_4
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v1, v3

    and-int/lit16 v3, v1, 0x93

    const/16 v4, 0x92

    if-eq v3, v4, :cond_5

    const/4 v3, 0x1

    goto :goto_5

    :cond_5
    const/4 v3, 0x0

    :goto_5
    and-int/lit8 v4, v1, 0x1

    invoke-virtual {p3, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_8

    if-eqz v0, :cond_6

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_6
    if-eqz v2, :cond_7

    sget-object p1, Lg0/f;->a:Lg0/c;

    :cond_7
    new-instance v0, Ld30/b0;

    const/4 v2, 0x2

    invoke-direct {v0, v2, p2, p1}, Ld30/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x33468687

    invoke-static {v2, p3, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    shr-int/lit8 v2, v1, 0x3

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v2, v2, 0x180

    shl-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v2

    invoke-static {p1, p0, v0, p3, v1}, Lg0/f;->a(Lg0/c;Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_6
    move-object v3, p0

    move-object v4, p1

    goto :goto_7

    :cond_8
    invoke-virtual {p3}, Lp1/q;->X()V

    goto :goto_6

    :goto_7
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_9

    new-instance v2, Lcy1/b;

    move-object v5, p2

    move v6, p4

    move v7, p5

    invoke-direct/range {v2 .. v7}, Lcy1/b;-><init>(Landroidx/compose/ui/Modifier;Lg0/c;Lkotlin/jvm/functions/Function1;II)V

    iput-object v2, p0, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method public static final c(Ljava/lang/String;Lg0/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v1, -0x3d3c5ad4

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v6, 0x6

    const/4 v3, 0x2

    move-object/from16 v9, p0

    if-nez v1, :cond_1

    invoke-virtual {v0, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    or-int/2addr v1, v6

    goto :goto_1

    :cond_1
    move v1, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    const/4 v8, 0x1

    const/16 v10, 0x20

    if-nez v7, :cond_3

    invoke-virtual {v0, v8}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_2

    move v7, v10

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v1, v7

    :cond_3
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v1, v7

    :cond_5
    and-int/lit16 v7, v6, 0xc00

    if-nez v7, :cond_7

    move-object/from16 v7, p2

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    const/16 v11, 0x800

    goto :goto_4

    :cond_6
    const/16 v11, 0x400

    :goto_4
    or-int/2addr v1, v11

    goto :goto_5

    :cond_7
    move-object/from16 v7, p2

    :goto_5
    and-int/lit16 v11, v6, 0x6000

    if-nez v11, :cond_9

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x4000

    goto :goto_6

    :cond_8
    const/16 v11, 0x2000

    :goto_6
    or-int/2addr v1, v11

    :cond_9
    const/high16 v11, 0x30000

    and-int/2addr v11, v6

    const/high16 v12, 0x20000

    if-nez v11, :cond_b

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    move v11, v12

    goto :goto_7

    :cond_a
    const/high16 v11, 0x10000

    :goto_7
    or-int/2addr v1, v11

    :cond_b
    const v11, 0x12493

    and-int/2addr v11, v1

    const v13, 0x12492

    if-eq v11, v13, :cond_c

    const/4 v11, 0x1

    goto :goto_8

    :cond_c
    const/4 v11, 0x0

    :goto_8
    and-int/lit8 v13, v1, 0x1

    invoke-virtual {v0, v13, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_19

    sget-object v13, Lg0/e;->f:Lb2/l;

    sget-object v11, Ll0/m;->a:Ll0/e;

    sget v11, Lg0/e;->h:F

    invoke-static {v11}, Ll0/m;->i(F)Ll0/k;

    move-result-object v15

    and-int/lit8 v8, v1, 0x70

    if-ne v8, v10, :cond_d

    const/4 v8, 0x1

    goto :goto_9

    :cond_d
    const/4 v8, 0x0

    :goto_9
    const/high16 v10, 0x70000

    and-int/2addr v10, v1

    if-ne v10, v12, :cond_e

    const/4 v10, 0x1

    goto :goto_a

    :cond_e
    const/4 v10, 0x0

    :goto_a
    or-int/2addr v8, v10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_f

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v10, v8, :cond_10

    :cond_f
    new-instance v10, Ld42/o;

    const/16 v8, 0x19

    invoke-direct {v10, v5, v8}, Ld42/o;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v10, Lc93/a;

    const/16 v12, 0xc

    move v8, v11

    move-object v11, v10

    const/4 v10, 0x0

    move v14, v8

    const/4 v8, 0x1

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget v9, Lg0/e;->a:F

    sget v10, Lg0/e;->b:F

    sget v11, Lg0/e;->c:F

    invoke-static {v8, v9, v11, v10, v11}, Landroidx/compose/foundation/layout/d;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {v8, v14, v9, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v8, 0x36

    invoke-static {v15, v13, v0, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v9, v0, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-eqz v12, :cond_11

    invoke-virtual {v0, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_11
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_b
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v0, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v0, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-nez v13, :cond_12

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_13

    :cond_12
    invoke-static {v9, v0, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v0, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez v4, :cond_14

    const v3, -0x586c6915

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_14
    const v3, -0x586c6914

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    sget v19, Lg0/e;->j:F

    const/16 v20, 0x0

    const/16 v23, 0x2

    sget-object v18, Lb2/t;->w:Lb2/t;

    move/from16 v21, v19

    move/from16 v22, v19

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/d;->n(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v13, Lb2/e;->w:Lb2/m;

    const/4 v14, 0x0

    invoke-static {v13, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    iget-wide v14, v0, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-eqz v7, :cond_15

    invoke-virtual {v0, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_15
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v0, v12, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v8, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-nez v7, :cond_16

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_17

    :cond_16
    invoke-static {v14, v0, v14, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v0, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-wide v7, v2, Lg0/c;->c:J

    new-instance v3, Li2/x;

    invoke-direct {v3, v7, v8}, Li2/x;-><init>(J)V

    const/4 v14, 0x0

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v4, v3, v0, v7}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    :goto_d
    iget-wide v7, v2, Lg0/c;->b:J

    sget v29, Lg0/e;->g:I

    sget-wide v20, Lg0/e;->m:J

    sget-object v22, Lg0/e;->n:Lp3/r;

    sget-wide v30, Lg0/e;->o:J

    sget-wide v25, Lg0/e;->p:J

    new-instance v9, Ll3/v0;

    const/16 v28, 0x0

    const v32, 0xfd7f78

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-wide/from16 v18, v7

    move-object/from16 v17, v9

    invoke-direct/range {v17 .. v32}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v7, v3

    const-wide/16 v10, 0x0

    cmpl-double v7, v7, v10

    if-lez v7, :cond_18

    goto :goto_e

    :cond_18
    const-string v7, "invalid weight; must be greater than zero"

    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_e
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v7, 0x1

    invoke-direct {v8, v3, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    and-int/lit8 v1, v1, 0xe

    const/high16 v3, 0x180000

    or-int v18, v1, v3

    const/16 v19, 0x3b8

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v0

    move v3, v7

    move-object/from16 v7, p0

    invoke-static/range {v7 .. v19}, Lq83/g;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIILi2/a0;Lu0/z0;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_19
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_f
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1a

    new-instance v0, Laq1/c;

    const/16 v7, 0xa

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v7}, Laq1/c;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method
