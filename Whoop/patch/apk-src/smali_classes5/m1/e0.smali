.class public abstract Lm1/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/StackTraceElement;

.field public static b:Lo2/e;

.field public static c:Lo2/e;

.field public static d:Lo2/e;

.field public static e:Lo2/e;

.field public static f:Lo2/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/StackTraceElement;

    sput-object v0, Lm1/e0;->a:[Ljava/lang/StackTraceElement;

    return-void
.end method

.method public static final a(Lc4/i0;Lx1/b;Ll1/x4;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v1, p2

    move-object/from16 v8, p3

    move/from16 v9, p5

    move-object/from16 v6, p4

    check-cast v6, Lp1/q;

    const v0, -0x48d45f10

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    if-nez v0, :cond_1

    move-object/from16 v0, p0

    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v9

    goto :goto_1

    :cond_1
    move-object/from16 v0, p0

    move v2, v9

    :goto_1
    and-int/lit8 v3, v9, 0x30

    move-object/from16 v5, p1

    if-nez v3, :cond_3

    invoke-virtual {v6, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v9, 0x180

    if-nez v3, :cond_6

    and-int/lit16 v3, v9, 0x200

    if-nez v3, :cond_4

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_3

    :cond_4
    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_3
    if-eqz v3, :cond_5

    const/16 v3, 0x100

    goto :goto_4

    :cond_5
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v2, v3

    :cond_6
    and-int/lit16 v3, v9, 0xc00

    sget-object v4, Lb2/t;->w:Lb2/t;

    if-nez v3, :cond_8

    invoke-virtual {v6, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    const/16 v3, 0x800

    goto :goto_5

    :cond_7
    const/16 v3, 0x400

    :goto_5
    or-int/2addr v2, v3

    :cond_8
    and-int/lit16 v3, v9, 0x6000

    if-nez v3, :cond_a

    const/4 v3, 0x0

    invoke-virtual {v6, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    const/16 v3, 0x4000

    goto :goto_6

    :cond_9
    const/16 v3, 0x2000

    :goto_6
    or-int/2addr v2, v3

    :cond_a
    const/high16 v3, 0x30000

    and-int v7, v9, v3

    const/4 v11, 0x0

    if-nez v7, :cond_c

    invoke-virtual {v6, v11}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_b

    const/high16 v7, 0x20000

    goto :goto_7

    :cond_b
    const/high16 v7, 0x10000

    :goto_7
    or-int/2addr v2, v7

    :cond_c
    const/high16 v7, 0x180000

    and-int/2addr v7, v9

    const/4 v12, 0x1

    if-nez v7, :cond_e

    invoke-virtual {v6, v12}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_d

    const/high16 v7, 0x100000

    goto :goto_8

    :cond_d
    const/high16 v7, 0x80000

    :goto_8
    or-int/2addr v2, v7

    :cond_e
    const/high16 v7, 0xc00000

    and-int/2addr v7, v9

    if-nez v7, :cond_10

    invoke-virtual {v6, v11}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_f

    const/high16 v7, 0x800000

    goto :goto_9

    :cond_f
    const/high16 v7, 0x400000

    :goto_9
    or-int/2addr v2, v7

    :cond_10
    const/high16 v7, 0x6000000

    and-int/2addr v7, v9

    if-nez v7, :cond_12

    invoke-virtual {v6, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_11

    const/high16 v7, 0x4000000

    goto :goto_a

    :cond_11
    const/high16 v7, 0x2000000

    :goto_a
    or-int/2addr v2, v7

    :cond_12
    move v13, v2

    const v2, 0x2492493

    and-int/2addr v2, v13

    const v7, 0x2492492

    if-eq v2, v7, :cond_13

    move v2, v12

    goto :goto_b

    :cond_13
    move v2, v11

    :goto_b
    and-int/lit8 v7, v13, 0x1

    invoke-virtual {v6, v7, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1e

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-ne v2, v14, :cond_14

    invoke-static {v6}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v2

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v2, Lbc3/c0;

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v14, :cond_15

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v6, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v7, Lp1/c1;

    sget-object v15, Lb2/e;->w:Lb2/m;

    invoke-static {v15, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v15

    move/from16 v16, v13

    iget-wide v12, v6, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v6, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v17, v3

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v10, v6, Lp1/q;->S:Z

    if-eqz v10, :cond_16

    invoke-virtual {v6, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_16
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_c
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v6, v3, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v6, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v10, v6, Lp1/q;->S:Z

    if-nez v10, :cond_17

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_18

    :cond_17
    invoke-static {v12, v6, v12, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v6, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Ll1/x4;->b()Z

    move-result v3

    if-eqz v3, :cond_19

    const v3, -0x70ba143f

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    and-int/lit8 v3, v16, 0xe

    or-int v3, v3, v17

    shr-int/lit8 v4, v16, 0x3

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v3, v4

    shr-int/lit8 v4, v16, 0x6

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v3, v4

    shl-int/lit8 v4, v16, 0xf

    const/high16 v10, 0x380000

    and-int/2addr v4, v10

    or-int/2addr v3, v4

    move-object v4, v7

    move v7, v3

    const/4 v3, 0x0

    invoke-static/range {v0 .. v7}, Lm1/e0;->c(Lc4/i0;Ll1/x4;Lbc3/c0;ZLp1/c1;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v11}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_19
    move-object v4, v7

    const v0, -0x70b44974

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v11}, Lp1/q;->q(Z)V

    :goto_d
    shr-int/lit8 v0, v16, 0x12

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v0, v0, 0x180

    shr-int/lit8 v2, v16, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v0, v2

    shr-int/lit8 v2, v16, 0xc

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v0, v2

    const v2, 0xe000

    shl-int/lit8 v3, v16, 0x3

    and-int/2addr v2, v3

    or-int/2addr v0, v2

    shr-int/lit8 v2, v16, 0x9

    const/high16 v3, 0x70000

    and-int/2addr v2, v3

    or-int/2addr v0, v2

    invoke-static {v1, v4, v8, v6, v0}, Lm1/e0;->d(Ll1/x4;Lp1/c1;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    move/from16 v2, v16

    and-int/lit16 v3, v2, 0x380

    const/16 v4, 0x100

    if-eq v3, v4, :cond_1a

    and-int/lit16 v2, v2, 0x200

    if-eqz v2, :cond_1b

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1b

    :cond_1a
    move v11, v0

    :cond_1b
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v11, :cond_1c

    if-ne v0, v14, :cond_1d

    :cond_1c
    new-instance v0, Llc0/c;

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Llc0/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, v6}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    goto :goto_e

    :cond_1e
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1f

    new-instance v0, Llf0/p1;

    move-object/from16 v2, p1

    move-object v3, v1

    move-object v4, v8

    move v5, v9

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Llf0/p1;-><init>(Lc4/i0;Lx1/b;Ll1/x4;Lx1/b;I)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method public static final b(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    check-cast p4, Lp1/q;

    const v0, -0x28d355e8

    invoke-virtual {p4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p4, p0, p1}, Lp1/q;->f(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p5

    goto :goto_1

    :cond_1
    move v0, p5

    :goto_1
    and-int/lit8 v1, p5, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p5, 0x180

    if-nez v1, :cond_5

    invoke-virtual {p4, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v0, 0x93

    const/16 v2, 0x92

    if-eq v1, v2, :cond_6

    const/4 v1, 0x1

    goto :goto_4

    :cond_6
    const/4 v1, 0x0

    :goto_4
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p4, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v1, Ll1/o4;->a:Lp1/b0;

    invoke-virtual {p4, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll3/v0;

    invoke-virtual {v2, p2}, Ll3/v0;->e(Ll3/v0;)Ll3/v0;

    move-result-object v2

    sget-object v3, Ll1/s;->a:Lp1/b0;

    new-instance v4, Li2/x;

    invoke-direct {v4, p0, p1}, Li2/x;-><init>(J)V

    invoke-virtual {v3, v4}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v3

    invoke-virtual {v1, v2}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    filled-new-array {v3, v1}, [Lp1/u1;

    move-result-object v1

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    const/16 v2, 0x8

    or-int/2addr v0, v2

    invoke-static {v1, p3, p4, v0}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_7
    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p4}, Lp1/q;->u()Lp1/v1;

    move-result-object p4

    if-eqz p4, :cond_8

    new-instance v0, Lm1/f0;

    const/4 v6, 0x0

    move-wide v1, p0

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lm1/f0;-><init>(JLl3/v0;Lc93/m;II)V

    iput-object v0, p4, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static final c(Lc4/i0;Ll1/x4;Lbc3/c0;ZLp1/c1;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    move-object/from16 v12, p6

    check-cast v12, Lp1/q;

    const v0, -0x5443a8da

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    move-object/from16 v8, p0

    if-nez v0, :cond_1

    invoke-virtual {v12, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    and-int/lit8 v1, v7, 0x30

    const/16 v9, 0x20

    if-nez v1, :cond_4

    and-int/lit8 v1, v7, 0x40

    if-nez v1, :cond_2

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_2

    :cond_2
    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_2
    if-eqz v1, :cond_3

    move v1, v9

    goto :goto_3

    :cond_3
    const/16 v1, 0x10

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    and-int/lit16 v1, v7, 0x180

    const/16 v10, 0x100

    if-nez v1, :cond_6

    const/4 v1, 0x0

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    move v1, v10

    goto :goto_4

    :cond_5
    const/16 v1, 0x80

    :goto_4
    or-int/2addr v0, v1

    :cond_6
    and-int/lit16 v1, v7, 0xc00

    if-nez v1, :cond_8

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const/16 v1, 0x800

    goto :goto_5

    :cond_7
    const/16 v1, 0x400

    :goto_5
    or-int/2addr v0, v1

    :cond_8
    and-int/lit16 v1, v7, 0x6000

    if-nez v1, :cond_a

    invoke-virtual {v12, v4}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_9

    const/16 v1, 0x4000

    goto :goto_6

    :cond_9
    const/16 v1, 0x2000

    :goto_6
    or-int/2addr v0, v1

    :cond_a
    const/high16 v1, 0x30000

    and-int/2addr v1, v7

    const/high16 v11, 0x20000

    if-nez v1, :cond_c

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    move v1, v11

    goto :goto_7

    :cond_b
    const/high16 v1, 0x10000

    :goto_7
    or-int/2addr v0, v1

    :cond_c
    const/high16 v1, 0x180000

    and-int/2addr v1, v7

    if-nez v1, :cond_e

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    const/high16 v1, 0x100000

    goto :goto_8

    :cond_d
    const/high16 v1, 0x80000

    :goto_8
    or-int/2addr v0, v1

    :cond_e
    const v1, 0x92493

    and-int/2addr v1, v0

    const v13, 0x92492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v1, v13, :cond_f

    move v1, v15

    goto :goto_9

    :cond_f
    move v1, v14

    :goto_9
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v12, v13, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_16

    const v1, 0x7f1411a8

    invoke-static {v12, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    and-int/lit16 v13, v0, 0x380

    if-ne v13, v10, :cond_10

    move v10, v15

    goto :goto_a

    :cond_10
    move v10, v14

    :goto_a
    and-int/lit8 v13, v0, 0x70

    if-eq v13, v9, :cond_12

    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_11

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_11

    goto :goto_b

    :cond_11
    move v9, v14

    goto :goto_c

    :cond_12
    :goto_b
    move v9, v15

    :goto_c
    or-int/2addr v9, v10

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    const/high16 v10, 0x70000

    and-int/2addr v10, v0

    if-ne v10, v11, :cond_13

    move v14, v15

    :cond_13
    or-int/2addr v9, v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_14

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v10, v9, :cond_15

    :cond_14
    new-instance v10, Lim1/a0;

    const/16 v9, 0x19

    invoke-direct {v10, v2, v3, v5, v9}, Lim1/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v12, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v9, v10

    check-cast v9, Lc93/a;

    new-instance v10, Lc4/j0;

    const/16 v11, 0xe

    invoke-direct {v10, v4, v11}, Lc4/j0;-><init>(ZI)V

    new-instance v13, Lb30/w2;

    const/16 v14, 0x16

    invoke-direct {v13, v14, v1, v6}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v1, -0x4cc0d43c

    invoke-static {v1, v12, v13}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    and-int/2addr v0, v11

    or-int/lit16 v13, v0, 0xc00

    const/4 v14, 0x0

    move-object v11, v1

    invoke-static/range {v8 .. v14}, Lc4/r;->a(Lc4/i0;Lc93/a;Lc4/j0;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    goto :goto_d

    :cond_16
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_17

    new-instance v0, Ld30/l0;

    const/4 v8, 0x3

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v8}, Ld30/l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ll83/e;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method public static final d(Ll1/x4;Lp1/c1;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p3, Lp1/q;

    const v0, 0x6fa740c0

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p3, v1}, Lp1/q;->h(Z)Z

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
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_4

    and-int/lit8 v2, p4, 0x40

    if-nez v2, :cond_2

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_2

    :cond_2
    invoke-virtual {p3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v0, v2

    :cond_4
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_6

    invoke-virtual {p3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/16 v2, 0x100

    goto :goto_4

    :cond_5
    const/16 v2, 0x80

    :goto_4
    or-int/2addr v0, v2

    :cond_6
    and-int/lit16 v2, p4, 0xc00

    const/4 v3, 0x0

    if-nez v2, :cond_8

    invoke-virtual {p3, v3}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_7

    const/16 v2, 0x800

    goto :goto_5

    :cond_7
    const/16 v2, 0x400

    :goto_5
    or-int/2addr v0, v2

    :cond_8
    and-int/lit16 v2, p4, 0x6000

    sget-object v4, Lb2/t;->w:Lb2/t;

    if-nez v2, :cond_a

    invoke-virtual {p3, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    const/16 v2, 0x4000

    goto :goto_6

    :cond_9
    const/16 v2, 0x2000

    :goto_6
    or-int/2addr v0, v2

    :cond_a
    const/high16 v2, 0x30000

    and-int/2addr v2, p4

    if-nez v2, :cond_c

    invoke-virtual {p3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const/high16 v2, 0x20000

    goto :goto_7

    :cond_b
    const/high16 v2, 0x10000

    :goto_7
    or-int/2addr v0, v2

    :cond_c
    const v2, 0x12493

    and-int/2addr v2, v0

    const v5, 0x12492

    if-eq v2, v5, :cond_d

    move v2, v1

    goto :goto_8

    :cond_d
    move v2, v3

    :goto_8
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {p3, v5, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v2, v5, :cond_e

    invoke-static {p3}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v2

    invoke-virtual {p3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v2, Lbc3/c0;

    const v5, 0x7f1411a9

    invoke-static {p3, v5}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lm1/m;

    const/4 v7, 0x0

    invoke-direct {v6, p0, v7}, Lm1/m;-><init>(Ll1/x4;I)V

    invoke-static {v4, p0, v6}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v6, Lm1/m;

    const/4 v7, 0x1

    invoke-direct {v6, p0, v7}, Lm1/m;-><init>(Ll1/x4;I)V

    invoke-static {v4, p0, v6}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v6, Ljs2/h;

    const/16 v7, 0xe

    invoke-direct {v6, v5, v2, p0, v7}, Ljs2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v5, Landroidx/compose/material3/internal/ParentSemanticsNodeElement;

    invoke-direct {v5, v6}, Landroidx/compose/material3/internal/ParentSemanticsNodeElement;-><init>(Ljs2/h;)V

    invoke-interface {v4, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v5, Llq0/d;

    const/4 v6, 0x5

    invoke-direct {v5, v6, v2, p0}, Llq0/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v5}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v4, Landroidx/room/d;

    const/4 v5, 0x4

    invoke-direct {v4, v5, p0, p1}, Landroidx/room/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v4}, Landroidx/compose/ui/input/key/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, p3, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {p3}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {p3, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p3}, Lp1/q;->i0()V

    iget-boolean v7, p3, Lp1/q;->S:Z

    if-eqz v7, :cond_f

    invoke-virtual {p3, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {p3}, Lp1/q;->s0()V

    :goto_9
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p3, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {p3, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, p3, Lp1/q;->S:Z

    if-nez v5, :cond_10

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_11

    :cond_10
    invoke-static {v4, p3, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {p3, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v0, 0xf

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0, p2, p3, v1}, Lih0/d0;->y(ILx1/b;Lp1/q;Z)V

    goto :goto_a

    :cond_12
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_13

    new-instance v0, Ll72/n;

    invoke-direct {v0, p0, p1, p2, p4}, Ll72/n;-><init>(Ll1/x4;Lp1/c1;Lx1/b;I)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method public static e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Lkx1/b;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lkx1/b;-><init>(I)V

    new-instance v1, Landroidx/compose/material3/internal/ChildSemanticsNodeElement;

    invoke-direct {v1, v0}, Landroidx/compose/material3/internal/ChildSemanticsNodeElement;-><init>(Lkx1/b;)V

    invoke-interface {p0, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final f(JLjava/lang/String;Ljava/util/Locale;Ljava/util/LinkedHashMap;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "S:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {p2, p3}, Landroid/icu/text/DateFormat;->getInstanceForSkeleton(Ljava/lang/String;Ljava/util/Locale;)Landroid/icu/text/DateFormat;

    move-result-object v1

    sget-object p2, Landroid/icu/text/DisplayContext;->CAPITALIZATION_FOR_STANDALONE:Landroid/icu/text/DisplayContext;

    invoke-virtual {v1, p2}, Landroid/icu/text/DateFormat;->setContext(Landroid/icu/text/DisplayContext;)V

    sget-object p2, Landroid/icu/util/TimeZone;->GMT_ZONE:Landroid/icu/util/TimeZone;

    invoke-virtual {v1, p2}, Landroid/icu/text/DateFormat;->setTimeZone(Landroid/icu/util/TimeZone;)V

    invoke-interface {p4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v1, Landroid/icu/text/DateFormat;

    new-instance p2, Ljava/util/Date;

    invoke-direct {p2, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, p2}, Landroid/icu/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ljava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/time/format/DateTimeFormatter;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "P:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {p0, p1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object p0

    invoke-static {p1}, Ljava/time/format/DecimalStyle;->of(Ljava/util/Locale;)Ljava/time/format/DecimalStyle;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/time/format/DateTimeFormatter;->withDecimalStyle(Ljava/time/format/DecimalStyle;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string p0, "null cannot be cast to non-null type java.time.format.DateTimeFormatter"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/time/format/DateTimeFormatter;

    return-object v1
.end method

.method public static final h(Ly2/q0;)Ljava/lang/Object;
    .locals 2

    invoke-interface {p0}, Ly2/q0;->p()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Ly2/a0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Ly2/a0;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-interface {p0}, Ly2/a0;->T()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v1
.end method

.method public static final i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    check-cast p0, Lp1/q;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final j(II)I
    .locals 1

    const v0, 0x7fffffff

    if-ne p0, v0, :cond_0

    return p0

    :cond_0
    sub-int/2addr p0, p1

    if-gez p0, :cond_1

    const/4 p0, 0x0

    :cond_1
    return p0
.end method
