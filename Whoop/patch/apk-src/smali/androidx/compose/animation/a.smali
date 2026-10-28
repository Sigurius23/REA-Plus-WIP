.class public abstract Landroidx/compose/animation/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final synthetic b:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/high16 v0, -0x80000000

    int-to-long v0, v0

    const/16 v2, 0x20

    shl-long v2, v0, v2

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    or-long/2addr v0, v2

    sput-wide v0, Landroidx/compose/animation/a;->a:J

    return-void
.end method

.method public static final a(Ld0/z1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;I)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v7, p1

    move-object/from16 v3, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    move/from16 v10, p7

    move-object/from16 v11, p6

    check-cast v11, Lp1/q;

    const v0, 0x1e804e2f

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v10, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v10

    goto :goto_1

    :cond_1
    move v0, v10

    :goto_1
    and-int/lit8 v4, v10, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v11, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_3
    and-int/lit16 v4, v10, 0x180

    if-nez v4, :cond_5

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v0, v4

    :cond_5
    and-int/lit16 v4, v10, 0xc00

    if-nez v4, :cond_7

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x800

    goto :goto_4

    :cond_6
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v0, v4

    :cond_7
    and-int/lit16 v4, v10, 0x6000

    if-nez v4, :cond_9

    invoke-virtual {v11, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x4000

    goto :goto_5

    :cond_8
    const/16 v4, 0x2000

    :goto_5
    or-int/2addr v0, v4

    :cond_9
    const/high16 v4, 0x30000

    and-int/2addr v4, v10

    move-object/from16 v6, p5

    if-nez v4, :cond_b

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    const/high16 v4, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v4, 0x10000

    :goto_6
    or-int/2addr v0, v4

    :cond_b
    const v4, 0x12493

    and-int/2addr v4, v0

    const v5, 0x12492

    if-eq v4, v5, :cond_c

    const/4 v4, 0x1

    goto :goto_7

    :cond_c
    const/4 v4, 0x0

    :goto_7
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v11, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_33

    sget-object v4, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v11, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly3/m;

    and-int/lit8 v0, v0, 0xe

    if-ne v0, v2, :cond_d

    const/4 v5, 0x1

    goto :goto_8

    :cond_d
    const/4 v5, 0x0

    :goto_8
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_e

    if-ne v14, v15, :cond_f

    :cond_e
    new-instance v14, Lc0/x;

    invoke-direct {v14, v1, v8, v4}, Lc0/x;-><init>(Ld0/z1;Lb2/h;Ly3/m;)V

    invoke-virtual {v11, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v14, Lc0/x;

    if-ne v0, v2, :cond_10

    const/4 v5, 0x1

    goto :goto_9

    :cond_10
    const/4 v5, 0x0

    :goto_9
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v5, :cond_11

    if-ne v13, v15, :cond_12

    :cond_11
    iget-object v5, v1, Ld0/z1;->a:Lal/a;

    invoke-virtual {v5}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    new-instance v13, Lz1/p;

    invoke-direct {v13}, Lz1/p;-><init>()V

    invoke-static {v5}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-virtual {v13, v5}, Lz1/p;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v5, v13

    check-cast v5, Lz1/p;

    if-ne v0, v2, :cond_13

    const/4 v0, 0x1

    goto :goto_a

    :cond_13
    const/4 v0, 0x0

    :goto_a
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_14

    if-ne v2, v15, :cond_15

    :cond_14
    sget-object v0, La0/d1;->a:[J

    new-instance v2, La0/v0;

    invoke-direct {v2}, La0/v0;-><init>()V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v13, v2

    check-cast v13, La0/v0;

    iget-object v0, v1, Ld0/z1;->a:Lal/a;

    iget-object v2, v1, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v0}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v5, v12}, Lz1/p;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_16

    invoke-virtual {v5}, Lz1/p;->clear()V

    invoke-virtual {v0}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v5, v12}, Lz1/p;->add(Ljava/lang/Object;)Z

    :cond_16
    invoke-virtual {v0}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v16, v0

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-virtual {v5}, Lz1/p;->size()I

    move-result v0

    const/4 v12, 0x1

    if-ne v0, v12, :cond_17

    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual/range {v16 .. v16}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    :cond_17
    invoke-virtual {v5}, Lz1/p;->clear()V

    invoke-virtual/range {v16 .. v16}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v5, v0}, Lz1/p;->add(Ljava/lang/Object;)Z

    :cond_18
    iget v0, v13, La0/v0;->e:I

    const/4 v12, 0x1

    if-ne v0, v12, :cond_19

    invoke-virtual/range {v16 .. v16}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v13, v0}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    :cond_19
    invoke-virtual {v13}, La0/v0;->a()V

    :cond_1a
    iput-object v8, v14, Lc0/x;->b:Lb2/h;

    iput-object v4, v14, Lc0/x;->c:Ly3/m;

    :cond_1b
    invoke-virtual/range {v16 .. v16}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v5, v0}, Lz1/p;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    invoke-virtual {v5}, Lz1/p;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    const/4 v4, 0x0

    :goto_b
    move-object v12, v0

    check-cast v12, Ln83/b;

    invoke-virtual {v12}, Ln83/b;->hasNext()Z

    move-result v17

    move-object/from16 v18, v0

    if-eqz v17, :cond_1d

    invoke-virtual {v12}, Ln83/b;->next()Ljava/lang/Object;

    move-result-object v12

    invoke-interface {v9, v12}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v9, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    :goto_c
    const/4 v0, -0x1

    goto :goto_d

    :cond_1c
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v0, v18

    goto :goto_b

    :cond_1d
    const/4 v4, -0x1

    goto :goto_c

    :goto_d
    if-ne v4, v0, :cond_1e

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v5, v0}, Lz1/p;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_1e
    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v5, v4, v0}, Lz1/p;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_1f
    :goto_e
    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v13, v0}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-virtual/range {v16 .. v16}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v13, v0}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto :goto_f

    :cond_20
    const v0, 0x755d6173

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move-object v6, v3

    move-object v0, v14

    goto :goto_11

    :cond_21
    :goto_f
    const v0, 0x7535ef71

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13}, La0/v0;->a()V

    invoke-virtual {v5}, Lz1/p;->size()I

    move-result v12

    const/4 v0, 0x0

    :goto_10
    if-ge v0, v12, :cond_22

    invoke-virtual {v5, v0}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v2

    move v4, v0

    new-instance v0, Lc0/j;

    move-object/from16 v19, v14

    move v14, v4

    move-object/from16 v4, v19

    invoke-direct/range {v0 .. v6}, Lc0/j;-><init>(Ld0/z1;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lc0/x;Lz1/p;Lc93/n;)V

    move-object v1, v0

    move-object v6, v3

    move-object v0, v4

    const v3, -0x16ceaa7

    invoke-static {v3, v11, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    invoke-virtual {v13, v2, v1}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v1, v14, 0x1

    move-object v14, v0

    move v0, v1

    move-object v3, v6

    move-object/from16 v1, p0

    move-object/from16 v6, p5

    goto :goto_10

    :cond_22
    move-object v6, v3

    move-object v0, v14

    const/4 v1, 0x0

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual/range {p0 .. p0}, Ld0/z1;->f()Ld0/t1;

    move-result-object v1

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v1, v2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_23

    if-ne v2, v15, :cond_24

    :cond_23
    invoke-interface {v6, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lc0/l0;

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    check-cast v2, Lc0/l0;

    iget-object v1, v0, Lc0/x;->a:Ld0/z1;

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_25

    if-ne v4, v15, :cond_26

    :cond_25
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    check-cast v4, Lp1/c1;

    iget-object v2, v2, Lc0/l0;->d:Lc0/r1;

    invoke-static {v2, v11}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v12

    iget-object v2, v1, Ld0/z1;->a:Lal/a;

    invoke-virtual {v2}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v2

    iget-object v1, v1, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_27

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v4, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    goto :goto_12

    :cond_27
    invoke-interface {v12}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_28

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v4, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_28
    :goto_12
    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_2c

    const v1, 0x50a7e5f9

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    move-object v4, v0

    iget-object v0, v4, Lc0/x;->a:Ld0/z1;

    sget-object v1, Ld0/f;->p:Ld0/f2;

    move-object v2, v4

    const/4 v4, 0x0

    move-object v3, v5

    const/4 v5, 0x2

    move-object/from16 v16, v2

    const/4 v2, 0x0

    move-object/from16 v19, v16

    move-object/from16 v16, v3

    move-object v3, v11

    move-object/from16 v11, v19

    invoke-static/range {v0 .. v5}, Ld0/d2;->c(Ld0/z1;Ld0/f2;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/s1;

    move-result-object v0

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_29

    if-ne v2, v15, :cond_2b

    :cond_29
    invoke-interface {v12}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc0/r1;

    if-eqz v1, :cond_2a

    iget-boolean v1, v1, Lc0/r1;->a:Z

    if-nez v1, :cond_2a

    goto :goto_13

    :cond_2a
    invoke-static {v14}, Lwb3/f;->s(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    :goto_13
    invoke-virtual {v3, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v14

    :cond_2b
    move-object v14, v2

    check-cast v14, Landroidx/compose/ui/Modifier;

    const/4 v1, 0x0

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_2c
    move-object/from16 v16, v5

    move-object v3, v11

    const/4 v1, 0x0

    move-object v11, v0

    const v0, 0x50abf533

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    iput-object v0, v11, Lc0/x;->f:Ld0/r1;

    :goto_14
    new-instance v1, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;

    invoke-direct {v1, v0, v12, v11}, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;-><init>(Ld0/s1;Lp1/c1;Lc0/x;)V

    invoke-interface {v14, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v7, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v15, :cond_2d

    new-instance v1, Lc0/n;

    invoke-direct {v1, v11}, Lc0/n;-><init>(Lc0/x;)V

    invoke-virtual {v3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2d
    check-cast v1, Lc0/n;

    iget-wide v4, v3, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v3, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v11, v3, Lp1/q;->S:Z

    if-eqz v11, :cond_2e

    invoke-virtual {v3, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_2e
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_15
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v3, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v3, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, v3, Lp1/q;->S:Z

    if-nez v4, :cond_2f

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_30

    :cond_2f
    invoke-static {v2, v3, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_30
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v3, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x334534ba    # -9.793387E7f

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {v16 .. v16}, Lz1/p;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_16
    if-ge v1, v0, :cond_32

    move-object/from16 v5, v16

    invoke-virtual {v5, v1}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v2

    const v4, -0x78c25a0a

    invoke-interface {v9, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v3, v4, v11}, Lp1/q;->b0(ILjava/lang/Object;)V

    invoke-virtual {v13, v2}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc93/m;

    if-nez v2, :cond_31

    const v2, 0x6077a733

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    const/4 v4, 0x0

    :goto_17
    invoke-virtual {v3, v4}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_31
    const/4 v4, 0x0

    const v11, -0x78c25572

    invoke-virtual {v3, v11}, Lp1/q;->e0(I)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v2, v3, v11}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_17

    :goto_18
    invoke-virtual {v3, v4}, Lp1/q;->q(Z)V

    add-int/lit8 v1, v1, 0x1

    move-object/from16 v16, v5

    goto :goto_16

    :cond_32
    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lp1/q;->q(Z)V

    const/4 v12, 0x1

    invoke-virtual {v3, v12}, Lp1/q;->q(Z)V

    goto :goto_19

    :cond_33
    move-object v6, v3

    move-object v3, v11

    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_19
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_34

    new-instance v0, Lc0/k;

    move-object/from16 v1, p0

    move-object v3, v6

    move-object v2, v7

    move-object v4, v8

    move-object v5, v9

    move v7, v10

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v7}, Lc0/k;-><init>(Ld0/z1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Lkotlin/jvm/functions/Function1;Lc93/n;I)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_34
    return-void
.end method

.method public static final b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V
    .locals 17

    move-object/from16 v1, p0

    move/from16 v8, p8

    move-object/from16 v15, p7

    check-cast v15, Lp1/q;

    const v0, 0x598416e0

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v8, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v8

    goto :goto_2

    :cond_2
    move v0, v8

    :goto_2
    and-int/lit8 v2, p9, 0x2

    if-eqz v2, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v3, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v3, v8, 0x30

    if-nez v3, :cond_3

    move-object/from16 v3, p1

    invoke-virtual {v15, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x20

    goto :goto_3

    :cond_5
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v0, v4

    :goto_4
    and-int/lit8 v4, p9, 0x4

    if-eqz v4, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v5, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v5, v8, 0x180

    if-nez v5, :cond_6

    move-object/from16 v5, p2

    invoke-virtual {v15, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x100

    goto :goto_5

    :cond_8
    const/16 v6, 0x80

    :goto_5
    or-int/2addr v0, v6

    :goto_6
    or-int/lit16 v6, v0, 0xc00

    and-int/lit8 v7, p9, 0x10

    if-eqz v7, :cond_a

    or-int/lit16 v6, v0, 0x6c00

    :cond_9
    move-object/from16 v0, p4

    goto :goto_8

    :cond_a
    and-int/lit16 v0, v8, 0x6000

    if-nez v0, :cond_9

    move-object/from16 v0, p4

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    const/16 v9, 0x4000

    goto :goto_7

    :cond_b
    const/16 v9, 0x2000

    :goto_7
    or-int/2addr v6, v9

    :goto_8
    and-int/lit8 v9, p9, 0x20

    const/high16 v10, 0x30000

    if-eqz v9, :cond_d

    or-int/2addr v6, v10

    :cond_c
    move-object/from16 v10, p5

    goto :goto_a

    :cond_d
    and-int/2addr v10, v8

    if-nez v10, :cond_c

    move-object/from16 v10, p5

    invoke-virtual {v15, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    const/high16 v11, 0x20000

    goto :goto_9

    :cond_e
    const/high16 v11, 0x10000

    :goto_9
    or-int/2addr v6, v11

    :goto_a
    const/high16 v11, 0x180000

    and-int/2addr v11, v8

    move-object/from16 v14, p6

    if-nez v11, :cond_10

    invoke-virtual {v15, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_f

    const/high16 v11, 0x100000

    goto :goto_b

    :cond_f
    const/high16 v11, 0x80000

    :goto_b
    or-int/2addr v6, v11

    :cond_10
    const v11, 0x92493

    and-int/2addr v11, v6

    const v12, 0x92492

    const/4 v13, 0x0

    if-eq v11, v12, :cond_11

    const/4 v11, 0x1

    goto :goto_c

    :cond_11
    move v11, v13

    :goto_c
    and-int/lit8 v12, v6, 0x1

    invoke-virtual {v15, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_18

    if-eqz v2, :cond_12

    sget-object v2, Lb2/t;->w:Lb2/t;

    move-object v10, v2

    goto :goto_d

    :cond_12
    move-object v10, v3

    :goto_d
    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_14

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_13

    sget-object v3, Lc0/c;->x:Lc0/c;

    invoke-virtual {v15, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v11, v3

    goto :goto_e

    :cond_14
    move-object v11, v5

    :goto_e
    sget-object v12, Lb2/e;->w:Lb2/m;

    if-eqz v7, :cond_15

    const-string v0, "AnimatedContent"

    :cond_15
    if-eqz v9, :cond_17

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_16

    sget-object v3, Lc0/d;->x:Lc0/d;

    invoke-virtual {v15, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    move-object v2, v3

    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_f

    :cond_17
    move-object/from16 v2, p5

    :goto_f
    and-int/lit8 v3, v6, 0xe

    shr-int/lit8 v4, v6, 0x9

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v3, v4

    invoke-static {v1, v0, v15, v3, v13}, Ld0/d2;->f(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/z1;

    move-result-object v9

    and-int/lit16 v3, v6, 0x1ff0

    shr-int/lit8 v4, v6, 0x3

    const v5, 0xe000

    and-int/2addr v5, v4

    or-int/2addr v3, v5

    const/high16 v5, 0x70000

    and-int/2addr v4, v5

    or-int v16, v3, v4

    move-object v13, v2

    invoke-static/range {v9 .. v16}, Landroidx/compose/animation/a;->a(Ld0/z1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;I)V

    move-object v2, v10

    move-object v3, v11

    move-object v4, v12

    move-object v6, v13

    :goto_10
    move-object v5, v0

    goto :goto_11

    :cond_18
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object v2, v3

    move-object v3, v5

    goto :goto_10

    :goto_11
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_19

    new-instance v0, Lc0/e;

    move-object/from16 v7, p6

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lc0/e;-><init>(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method public static final c(Lc0/d1;Lc0/f1;)Lc0/l0;
    .locals 3

    new-instance v0, Lc0/l0;

    const/4 v1, 0x0

    const/16 v2, 0xc

    invoke-direct {v0, p0, p1, v1, v2}, Lc0/l0;-><init>(Lc0/d1;Lc0/f1;Lc0/r1;I)V

    return-object v0
.end method
