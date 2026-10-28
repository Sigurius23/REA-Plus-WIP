.class public abstract Lg40/j4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lg40/e4;->w:Lg40/e4;

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lg40/j4;->a:Lp1/u2;

    return-void
.end method

.method public static final a(Ljava/util/List;ZLandroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v5, p2

    check-cast v5, Lp1/q;

    const p2, -0x7b39b82d

    invoke-virtual {v5, p2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    invoke-virtual {v5, p1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr p2, v0

    and-int/lit8 p2, p2, 0x13

    const/16 v0, 0x12

    if-ne p2, v0, :cond_3

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v5}, Lp1/q;->X()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_8

    new-instance v0, Lg40/b4;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p3, p1, v1}, Lg40/b4;-><init>(Ljava/util/List;IZI)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_4
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p2, v0, :cond_5

    invoke-static {v5}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object p2

    new-instance v1, Lp1/a0;

    invoke-direct {v1, p2}, Lp1/a0;-><init>(Lbc3/c0;)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object p2, v1

    :cond_5
    check-cast p2, Lp1/a0;

    iget-object p2, p2, Lp1/a0;->w:Lbc3/c0;

    sget-object v1, Ld40/r;->h:Lp1/u2;

    invoke-virtual {v5, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    const v3, 0x2f1c5225

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v1}, Lp1/q;->h(Z)Z

    move-result v3

    invoke-virtual {v5, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_6

    if-ne v4, v0, :cond_7

    :cond_6
    new-instance v4, Lg1/q7;

    const/4 v0, 0x0

    invoke-direct {v4, v1, p2, p0, v0}, Lg1/q7;-><init>(ZLbc3/c0;Ljava/util/List;Lq83/d;)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v4, Lc93/m;

    const/4 p2, 0x0

    invoke-virtual {v5, p2}, Lp1/q;->q(Z)V

    invoke-static {v5, v4, v2}, Lp1/x;->A(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)Lp1/c1;

    move-result-object p2

    invoke-interface {p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lg40/q3;

    new-instance p2, Lg40/d4;

    const/4 v1, 0x0

    invoke-direct {p2, p1, v1}, Lg40/d4;-><init>(ZI)V

    const v1, 0x7c89e66a

    invoke-static {v1, v5, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    const/16 v6, 0x6000

    const/16 v7, 0xe

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v7}, Lpf/c;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ld0/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_8

    new-instance v0, Lg40/b4;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p3, p1, v1}, Lg40/b4;-><init>(Ljava/util/List;IZI)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static final b(Lg40/r3;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v1, p0

    move/from16 v3, p1

    move-object/from16 v0, p2

    move-object/from16 v5, p3

    check-cast v5, Lp1/q;

    const v2, -0x127bb136

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p4, v2

    invoke-virtual {v5, v3}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0x20

    goto :goto_1

    :cond_1
    const/16 v4, 0x10

    :goto_1
    or-int/2addr v2, v4

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x100

    goto :goto_2

    :cond_2
    const/16 v4, 0x80

    :goto_2
    or-int v8, v2, v4

    and-int/lit16 v2, v8, 0x93

    const/16 v4, 0x92

    if-ne v2, v4, :cond_4

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v5}, Lp1/q;->X()V

    goto/16 :goto_8

    :cond_4
    :goto_3
    sget-object v2, Ll0/m;->a:Ll0/e;

    sget-object v4, Lb2/e;->J:Lb2/l;

    const/4 v9, 0x0

    invoke-static {v2, v4, v5, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v10, v5, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v14, v5, Lp1/q;->S:Z

    if-eqz v14, :cond_5

    invoke-virtual {v5, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_4
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v5, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v5, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v15, v5, Lp1/q;->S:Z

    if-nez v15, :cond_6

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v15, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    :cond_6
    invoke-static {v7, v5, v7, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v5, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    instance-of v9, v1, Lg40/q3;

    const/4 v12, 0x1

    if-eqz v9, :cond_8

    const v2, -0x404c38bf

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    move-object v2, v1

    check-cast v2, Lg40/q3;

    and-int/lit8 v6, v8, 0x70

    const/4 v7, 0x4

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lg40/j4;->h(Lg40/q3;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x0

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    move/from16 v3, p1

    goto/16 :goto_7

    :cond_8
    const/4 v3, 0x0

    instance-of v9, v1, Lg40/p3;

    if-eqz v9, :cond_d

    const v9, -0x404a55f2

    invoke-virtual {v5, v9}, Lp1/q;->e0(I)V

    const/16 v9, 0xa

    int-to-float v9, v9

    invoke-static {v9, v11}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v2, v4, v5, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v3, v5, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v5, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-eqz v11, :cond_9

    invoke-virtual {v5, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v5, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-nez v2, :cond_a

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :cond_a
    invoke-static {v3, v5, v3, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v5, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x360ecf55

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    move-object v9, v1

    check-cast v9, Lg40/p3;

    iget-object v2, v9, Lg40/p3;->a:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg40/q3;

    and-int/lit8 v6, v8, 0x70

    const/4 v7, 0x4

    const/4 v4, 0x0

    move/from16 v3, p1

    invoke-static/range {v2 .. v7}, Lg40/j4;->h(Lg40/q3;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    goto :goto_6

    :cond_c
    move/from16 v3, p1

    const/4 v2, 0x0

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    iget-object v4, v9, Lg40/p3;->b:Ljava/util/List;

    and-int/lit8 v6, v8, 0x70

    invoke-static {v4, v3, v5, v6}, Lg40/j4;->a(Ljava/util/List;ZLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_d
    move v2, v3

    move/from16 v3, p1

    instance-of v4, v1, Lg40/o3;

    if-eqz v4, :cond_f

    const v4, -0x40457651

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    move-object v4, v1

    check-cast v4, Lg40/o3;

    and-int/lit16 v6, v8, 0x3f0

    invoke-static {v4, v3, v0, v5, v6}, Lg40/j4;->g(Lg40/o3;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, La31/c;

    const/4 v5, 0x3

    move/from16 v4, p4

    move v2, v3

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v5}, La31/c;-><init>(Ljava/lang/Object;ZLl83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void

    :cond_f
    const v0, -0x1ad930c7

    const/4 v2, 0x0

    invoke-static {v0, v5, v2}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0
.end method

.method public static final c(Lg40/m3;ZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILg2/s;ZZLandroidx/compose/runtime/Composer;II)V
    .locals 42

    move-object/from16 v1, p0

    move/from16 v3, p2

    move/from16 v11, p11

    move/from16 v12, p12

    const-string v0, "textFieldController"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p10

    check-cast v0, Lp1/q;

    const v2, 0x7438a479

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v11, 0x6

    if-nez v2, :cond_2

    and-int/lit8 v2, v11, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_1

    :cond_1
    const/4 v2, 0x2

    :goto_1
    or-int/2addr v2, v11

    goto :goto_2

    :cond_2
    move v2, v11

    :goto_2
    and-int/lit8 v6, v11, 0x30

    move/from16 v14, p1

    if-nez v6, :cond_4

    invoke-virtual {v0, v14}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v2, v6

    :cond_4
    and-int/lit16 v6, v11, 0x180

    if-nez v6, :cond_6

    invoke-virtual {v0, v3}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v2, v6

    :cond_6
    and-int/lit8 v6, v12, 0x8

    if-eqz v6, :cond_8

    or-int/lit16 v2, v2, 0xc00

    :cond_7
    move-object/from16 v8, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v8, v11, 0xc00

    if-nez v8, :cond_7

    move-object/from16 v8, p3

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    const/16 v9, 0x800

    goto :goto_5

    :cond_9
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v2, v9

    :goto_6
    or-int/lit16 v9, v2, 0x6000

    const/high16 v10, 0x30000

    and-int/2addr v10, v11

    if-nez v10, :cond_a

    const v9, 0x16000

    or-int/2addr v9, v2

    :cond_a
    const/high16 v2, 0x180000

    and-int/2addr v2, v11

    if-nez v2, :cond_b

    const/high16 v2, 0x80000

    or-int/2addr v9, v2

    :cond_b
    and-int/lit16 v2, v12, 0x80

    const/high16 v10, 0xc00000

    if-eqz v2, :cond_d

    or-int/2addr v9, v10

    :cond_c
    move-object/from16 v10, p7

    goto :goto_8

    :cond_d
    and-int/2addr v10, v11

    if-nez v10, :cond_c

    move-object/from16 v10, p7

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    const/high16 v13, 0x800000

    goto :goto_7

    :cond_e
    const/high16 v13, 0x400000

    :goto_7
    or-int/2addr v9, v13

    :goto_8
    and-int/lit16 v13, v12, 0x100

    const/high16 v15, 0x6000000

    if-eqz v13, :cond_10

    or-int/2addr v9, v15

    :cond_f
    move/from16 v15, p8

    goto :goto_a

    :cond_10
    and-int/2addr v15, v11

    if-nez v15, :cond_f

    move/from16 v15, p8

    invoke-virtual {v0, v15}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_11

    const/high16 v16, 0x4000000

    goto :goto_9

    :cond_11
    const/high16 v16, 0x2000000

    :goto_9
    or-int v9, v9, v16

    :goto_a
    and-int/lit16 v5, v12, 0x200

    const/high16 v17, 0x30000000

    if-eqz v5, :cond_12

    or-int v9, v9, v17

    move/from16 v7, p9

    goto :goto_c

    :cond_12
    and-int v17, v11, v17

    move/from16 v7, p9

    if-nez v17, :cond_14

    invoke-virtual {v0, v7}, Lp1/q;->h(Z)Z

    move-result v18

    if-eqz v18, :cond_13

    const/high16 v18, 0x20000000

    goto :goto_b

    :cond_13
    const/high16 v18, 0x10000000

    :goto_b
    or-int v9, v9, v18

    :cond_14
    :goto_c
    const v18, 0x12492493

    and-int v4, v9, v18

    move/from16 v18, v2

    const v2, 0x12492492

    if-ne v4, v2, :cond_16

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_15

    goto :goto_d

    :cond_15
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v30, v0

    move-object v4, v8

    move-object v8, v10

    move v9, v15

    move v10, v7

    move/from16 v7, p6

    goto/16 :goto_21

    :cond_16
    :goto_d
    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v2, v11, 0x1

    const v20, -0x3f0001

    sget-object v4, Lp1/l;->a:Lp1/v0;

    move/from16 v21, v2

    const/16 v22, 0x1

    if-eqz v21, :cond_18

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v21

    if-eqz v21, :cond_17

    goto :goto_e

    :cond_17
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int v5, v9, v20

    move-object/from16 v2, p4

    move v9, v5

    move-object v6, v8

    move/from16 v13, v22

    move/from16 v5, p5

    move v8, v7

    move/from16 v22, v15

    move/from16 v7, p6

    goto :goto_11

    :cond_18
    :goto_e
    if-eqz v6, :cond_19

    sget-object v6, Lb2/t;->w:Lb2/t;

    goto :goto_f

    :cond_19
    move-object v6, v8

    :goto_f
    const v8, 0x7c830ba0

    invoke-virtual {v0, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v4, :cond_1a

    new-instance v8, Lg40/y1;

    const/4 v2, 0x7

    invoke-direct {v8, v2}, Lg40/y1;-><init>(I)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object v2, v8

    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    and-int v9, v9, v20

    if-eqz v18, :cond_1c

    const v10, 0x7c83215b

    invoke-virtual {v0, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v4, :cond_1b

    invoke-static {v0}, Lte0/d;->h(Lp1/q;)Lg2/s;

    move-result-object v10

    :cond_1b
    check-cast v10, Lg2/s;

    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    :cond_1c
    if-eqz v13, :cond_1d

    move/from16 v15, v22

    :cond_1d
    if-eqz v5, :cond_1e

    move/from16 v5, v22

    move v8, v5

    move v13, v8

    :goto_10
    const/4 v7, 0x2

    move/from16 v22, v15

    goto :goto_11

    :cond_1e
    move v8, v7

    move/from16 v5, v22

    move v13, v5

    goto :goto_10

    :goto_11
    invoke-virtual {v0}, Lp1/q;->r()V

    sget-object v15, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v0, v15}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lg2/i;

    invoke-interface {v1}, Lg40/m3;->p()Lec3/f2;

    move-result-object v13

    move-object/from16 v20, v2

    const/4 v2, 0x0

    invoke-static {v13, v0, v2}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v13

    move/from16 v23, v9

    invoke-interface {v1}, Lg40/m3;->a()Lec3/f2;

    move-result-object v9

    invoke-static {v9, v0, v2}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v9

    move-object/from16 v24, v9

    invoke-interface {v1}, Lg40/m3;->t()Lec3/f2;

    move-result-object v9

    invoke-static {v9, v0, v2}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v9

    move-object/from16 v25, v9

    invoke-interface {v1}, Lg40/m3;->getLoading()Lec3/f2;

    move-result-object v9

    invoke-static {v9, v0, v2}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v9

    move-object/from16 p9, v9

    invoke-interface {v1}, Lg40/m3;->getContentDescription()Ln53/e;

    move-result-object v9

    invoke-static {v9, v0, v2}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v9

    invoke-interface {v1}, Lg40/m3;->d()Lec3/f2;

    move-result-object v11

    invoke-static {v11, v0, v2}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v11

    move-object/from16 v26, v11

    invoke-interface {v1}, Lg40/m3;->e()Lec3/f2;

    move-result-object v11

    invoke-static {v11, v0, v2}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v11

    move-object/from16 v27, v11

    new-array v11, v2, [Ljava/lang/Object;

    const v2, 0x7c838037

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_1f

    new-instance v2, Lfw0/a;

    move-object/from16 p3, v11

    const/16 v11, 0x19

    invoke-direct {v2, v11}, Lfw0/a;-><init>(I)V

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_12

    :cond_1f
    move-object/from16 p3, v11

    :goto_12
    check-cast v2, Lc93/a;

    const/4 v11, 0x0

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    const/16 v21, 0xc00

    const/16 v28, 0x6

    const/16 v29, 0x0

    move-object/from16 p6, v0

    move-object/from16 p5, v2

    move/from16 p7, v21

    move/from16 p8, v28

    move-object/from16 p4, v29

    invoke-static/range {p3 .. p8}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v2, p6

    check-cast v0, Lp1/c1;

    invoke-interface {v1}, Lg40/m3;->r()Lec3/f2;

    move-result-object v12

    invoke-static {v12, v2, v11}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v12

    invoke-interface {v1}, Lg40/m3;->getLabel()Lec3/f2;

    move-result-object v14

    invoke-static {v14, v2, v11}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v14

    move-object/from16 v28, v14

    invoke-interface {v1}, Lg40/z2;->f()Lec3/f2;

    move-result-object v14

    invoke-static {v14, v2, v11}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v14

    invoke-interface {v12}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lg40/s3;

    move-object/from16 v29, v14

    const v14, 0x7c83a1d9

    invoke-virtual {v2, v14}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v30

    or-int v14, v14, v30

    invoke-virtual {v2, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v30

    or-int v14, v14, v30

    invoke-virtual {v2, v5}, Lp1/q;->e(I)Z

    move-result v30

    or-int v14, v14, v30

    move-object/from16 p4, v0

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v14, :cond_21

    if-ne v0, v4, :cond_20

    goto :goto_13

    :cond_20
    move-object v14, v12

    move-object/from16 v12, p4

    goto :goto_14

    :cond_21
    :goto_13
    new-instance v0, Lg20/p;

    const/4 v14, 0x0

    move-object/from16 p3, v0

    move/from16 p6, v5

    move-object/from16 p7, v12

    move-object/from16 p8, v14

    move-object/from16 p5, v15

    invoke-direct/range {p3 .. p8}, Lg20/p;-><init>(Lp1/c1;Lg2/i;ILp1/c1;Lq83/d;)V

    move-object/from16 v12, p4

    move-object/from16 v14, p7

    invoke-virtual {v2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    check-cast v0, Lc93/m;

    move-object/from16 v30, v13

    const/4 v13, 0x0

    invoke-virtual {v2, v13}, Lp1/q;->q(Z)V

    invoke-static {v2, v0, v11}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lg40/j4;->a:Lp1/u2;

    invoke-virtual {v2, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const v11, 0x7c83cb37

    invoke-virtual {v2, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    const/4 v13, 0x0

    if-ne v11, v4, :cond_22

    invoke-static {v13}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v2, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    check-cast v11, Lp1/c1;

    move-object/from16 p3, v13

    const v13, 0x7c83d577

    move-object/from16 v31, v11

    const/4 v11, 0x0

    invoke-static {v13, v2, v11}, Lr;->h(ILp1/q;Z)Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v4, :cond_23

    invoke-static/range {p3 .. p3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v13

    invoke-virtual {v2, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    check-cast v13, Lp1/c1;

    invoke-virtual {v2, v11}, Lp1/q;->q(Z)V

    sget-object v11, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v2, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/content/Context;

    move-object/from16 v32, v13

    new-instance v13, Lq3/y;

    invoke-interface/range {v30 .. v30}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v33

    move-object/from16 v34, v14

    move-object/from16 v14, v33

    check-cast v14, Ljava/lang/String;

    invoke-interface/range {v31 .. v31}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v33

    move/from16 v35, v5

    move-object/from16 v5, v33

    check-cast v5, Ll3/u0;

    if-eqz v5, :cond_24

    move/from16 v33, v8

    move-object/from16 v36, v9

    iget-wide v8, v5, Ll3/u0;->a:J

    goto :goto_15

    :cond_24
    move/from16 v33, v8

    move-object/from16 v36, v9

    invoke-interface/range {v30 .. v30}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    invoke-static {v5, v5}, Lj93/l0;->f(II)J

    move-result-wide v8

    :goto_15
    invoke-interface/range {v32 .. v32}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll3/u0;

    invoke-direct {v13, v14, v8, v9, v5}, Lq3/y;-><init>(Ljava/lang/String;JLl3/u0;)V

    invoke-interface/range {p9 .. p9}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    const v8, 0x7c844988

    invoke-virtual {v2, v8}, Lp1/q;->e0(I)V

    and-int/lit8 v8, v23, 0xe

    const/4 v9, 0x4

    if-eq v8, v9, :cond_26

    and-int/lit8 v9, v23, 0x8

    if-eqz v9, :cond_25

    invoke-virtual {v2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_25

    goto :goto_16

    :cond_25
    const/4 v9, 0x0

    goto :goto_17

    :cond_26
    :goto_16
    const/4 v9, 0x1

    :goto_17
    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v9, :cond_27

    if-ne v14, v4, :cond_28

    :cond_27
    new-instance v9, Lg40/f4;

    const/4 v14, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x1

    const-class v39, Lg40/m3;

    const-string v40, "onDropdownItemClicked"

    const-string v41, "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V"

    move-object/from16 p5, v1

    move-object/from16 p3, v9

    move/from16 p9, v14

    move/from16 p10, v37

    move/from16 p4, v38

    move-object/from16 p6, v39

    move-object/from16 p7, v40

    move-object/from16 p8, v41

    invoke-direct/range {p3 .. p10}, Lg40/f4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object/from16 v14, p3

    invoke-virtual {v2, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    check-cast v14, Lj93/g;

    const/4 v9, 0x0

    invoke-virtual {v2, v9}, Lp1/q;->q(Z)V

    invoke-interface/range {v30 .. v30}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    move/from16 p10, v5

    new-instance v5, Lg40/i4;

    invoke-direct {v5, v9, v15, v7}, Lg40/i4;-><init>(Ljava/lang/String;Lg2/i;I)V

    invoke-static {v6, v5}, Landroidx/compose/ui/input/key/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    shl-int/lit8 v9, v23, 0x3

    move-object/from16 v37, v6

    const v6, -0x405880f1

    invoke-virtual {v2, v6}, Lp1/q;->e0(I)V

    invoke-interface {v1}, Lg40/m3;->k()Lc2/n;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    move/from16 v38, v7

    const v7, 0x21434cbf

    invoke-virtual {v2, v7}, Lp1/q;->e0(I)V

    and-int/lit8 v7, v9, 0x70

    xor-int/lit8 v7, v7, 0x30

    move/from16 v39, v9

    const/16 v9, 0x20

    if-le v7, v9, :cond_29

    invoke-virtual {v2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2a

    :cond_29
    and-int/lit8 v7, v39, 0x30

    if-ne v7, v9, :cond_2b

    :cond_2a
    const/4 v7, 0x1

    goto :goto_18

    :cond_2b
    const/4 v7, 0x0

    :goto_18
    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_2c

    if-ne v9, v4, :cond_2d

    :cond_2c
    new-instance v9, Lfd3/a;

    const/16 v7, 0x13

    invoke-direct {v9, v7, v1, v0}, Lfd3/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2d
    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    invoke-static {v5, v6, v9, v2, v0}, Lug/m;->n(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    new-instance v0, Lfd3/a;

    const/16 v6, 0x14

    invoke-direct {v0, v6, v12, v1}, Lfd3/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5, v0}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v10}, Landroidx/compose/ui/focus/a;->b(Landroidx/compose/ui/Modifier;Lg2/s;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v5, 0x7c849552

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    move-object/from16 v5, v36

    invoke-virtual {v2, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v2, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    const/high16 v7, 0x70000000

    and-int v9, v23, v7

    const/high16 v12, 0x20000000

    if-ne v9, v12, :cond_2e

    const/4 v9, 0x1

    goto :goto_19

    :cond_2e
    const/4 v9, 0x0

    :goto_19
    or-int/2addr v6, v9

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v6, :cond_30

    if-ne v9, v4, :cond_2f

    goto :goto_1a

    :cond_2f
    move/from16 v12, v33

    goto :goto_1b

    :cond_30
    :goto_1a
    new-instance v9, Lam2/i0;

    const/4 v6, 0x6

    move/from16 v12, v33

    invoke-direct {v9, v11, v12, v5, v6}, Lam2/i0;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    invoke-virtual {v2, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1b
    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    invoke-virtual {v2, v11}, Lp1/q;->q(Z)V

    invoke-static {v0, v11, v9}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface/range {v28 .. v28}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lzy/c;

    invoke-static {v5, v2}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v16

    const/4 v9, 0x4

    invoke-interface {v1}, Lg40/m3;->m()Z

    move-result v19

    invoke-interface/range {v27 .. v27}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v17, v5

    check-cast v17, Ljava/lang/String;

    invoke-interface/range {v24 .. v24}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg40/r3;

    invoke-interface/range {v25 .. v25}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    invoke-interface/range {v29 .. v29}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lg40/h1;

    invoke-interface/range {v26 .. v26}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v24

    check-cast v24, Lq3/g0;

    invoke-interface {v1}, Lg40/m3;->getLayoutDirection()Ly3/m;

    move-result-object v25

    move/from16 v26, v7

    invoke-interface {v1}, Lg40/m3;->o()I

    move-result v7

    invoke-interface {v1}, Lg40/m3;->h()I

    move-result v9

    move-object/from16 v27, v0

    new-instance v0, Lu0/r0;

    move-object/from16 v28, v5

    const/16 v5, 0x72

    invoke-direct {v0, v9, v7, v3, v5}, Lu0/r0;-><init>(IIII)V

    const v5, 0x7c85199b

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_31

    if-ne v7, v4, :cond_32

    :cond_31
    new-instance v7, Lb30/l1;

    const/16 v5, 0x8

    invoke-direct {v7, v15, v5}, Lb30/l1;-><init>(Lg2/i;I)V

    invoke-virtual {v2, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_32
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v9, 0x0

    invoke-virtual {v2, v9}, Lp1/q;->q(Z)V

    const v5, 0x7c850cce

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    move/from16 v9, v35

    invoke-virtual {v2, v9}, Lp1/q;->e(I)Z

    move-result v29

    or-int v5, v5, v29

    move-object/from16 v29, v0

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v5, :cond_33

    if-ne v0, v4, :cond_34

    :cond_33
    new-instance v0, Lcom/whoop/data/local/room/dao/wipeable/c;

    const/4 v5, 0x7

    invoke-direct {v0, v15, v9, v5}, Lcom/whoop/data/local/room/dao/wipeable/c;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_34
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Lp1/q;->q(Z)V

    new-instance v5, Lu0/q0;

    const/4 v15, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x3a

    move-object/from16 p6, v0

    move-object/from16 p4, v5

    move-object/from16 p5, v7

    move-object/from16 p7, v15

    move-object/from16 p8, v33

    move/from16 p9, v35

    invoke-direct/range {p4 .. p9}, Lu0/q0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    move-object/from16 v0, p4

    const v5, 0x7c84016d

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    move-object/from16 v5, v34

    invoke-virtual {v2, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    move-object/from16 v15, v30

    invoke-virtual {v2, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v30

    or-int v7, v7, v30

    move-object/from16 v30, v0

    const/4 v0, 0x4

    if-eq v8, v0, :cond_36

    and-int/lit8 v0, v23, 0x8

    if-eqz v0, :cond_35

    invoke-virtual {v2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_35

    goto :goto_1c

    :cond_35
    const/4 v8, 0x0

    goto :goto_1d

    :cond_36
    :goto_1c
    const/4 v8, 0x1

    :goto_1d
    or-int v0, v7, v8

    const v7, 0xe000

    and-int v7, v23, v7

    const/16 v8, 0x4000

    if-ne v7, v8, :cond_37

    const/16 v18, 0x1

    goto :goto_1e

    :cond_37
    const/16 v18, 0x0

    :goto_1e
    or-int v0, v0, v18

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_39

    if-ne v7, v4, :cond_38

    goto :goto_1f

    :cond_38
    move-object/from16 v0, v20

    goto :goto_20

    :cond_39
    :goto_1f
    new-instance v0, Lam2/b;

    move-object/from16 p3, v0

    move-object/from16 p4, v1

    move-object/from16 p6, v5

    move-object/from16 p7, v15

    move-object/from16 p5, v20

    move-object/from16 p8, v31

    move-object/from16 p9, v32

    invoke-direct/range {p3 .. p9}, Lam2/b;-><init>(Lg40/m3;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)V

    move-object/from16 v7, p3

    move-object/from16 v0, p5

    invoke-virtual {v2, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_20
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Lp1/q;->q(Z)V

    check-cast v14, Lkotlin/jvm/functions/Function1;

    and-int v31, v39, v26

    move/from16 v15, p10

    move/from16 v20, v6

    move-object/from16 v21, v11

    move-object/from16 v23, v27

    move-object/from16 v18, v28

    move-object/from16 v26, v29

    move-object/from16 v27, v30

    move-object/from16 v30, v2

    move-object/from16 v28, v7

    move-object/from16 v29, v14

    move/from16 v14, p1

    invoke-static/range {v13 .. v31}, Lg40/j4;->f(Lq3/y;ZZLjava/lang/String;Ljava/lang/String;Lg40/r3;ZZLg40/h1;ZLandroidx/compose/ui/Modifier;Lq3/g0;Ly3/m;Lu0/r0;Lu0/q0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object v5, v0

    move v6, v9

    move-object v8, v10

    move v10, v12

    move/from16 v9, v22

    move-object/from16 v4, v37

    move/from16 v7, v38

    :goto_21
    invoke-virtual/range {v30 .. v30}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_3a

    new-instance v0, Lg40/c4;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Lg40/c4;-><init>(Lg40/m3;ZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILg2/s;ZZII)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_3a
    return-void
.end method

.method public static final d(Lg40/e1;JJJJLandroidx/compose/runtime/Composer;II)Lg1/y1;
    .locals 29

    move-object/from16 v0, p9

    check-cast v0, Lp1/q;

    const v1, -0x397c1799

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    and-int/lit8 v1, p11, 0x1

    if-eqz v1, :cond_0

    sget-object v1, Lg40/e1;->w:Lg40/e1;

    goto :goto_0

    :cond_0
    move-object/from16 v1, p0

    :goto_0
    and-int/lit8 v2, p11, 0x2

    if-eqz v2, :cond_1

    invoke-static {v0}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v2

    iget-wide v2, v2, Ld40/n;->d:J

    goto :goto_1

    :cond_1
    move-wide/from16 v2, p1

    :goto_1
    and-int/lit8 v4, p11, 0x4

    if-eqz v4, :cond_3

    sget-object v4, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v0, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li2/x;

    iget-wide v4, v4, Li2/x;->a:J

    sget-object v6, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v0, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg1/c1;

    invoke-virtual {v6}, Lg1/c1;->i()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v4, v5}, Li2/w0;->x(J)F

    goto :goto_2

    :cond_2
    invoke-static {v4, v5}, Li2/w0;->x(J)F

    :goto_2
    const v4, 0x3ec28f5c    # 0.38f

    invoke-static {v4, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v4

    goto :goto_3

    :cond_3
    move-wide/from16 v4, p3

    :goto_3
    and-int/lit8 v6, p11, 0x8

    if-eqz v6, :cond_4

    invoke-static {v0}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v6

    iget-wide v6, v6, Ld40/n;->a:J

    goto :goto_4

    :cond_4
    move-wide/from16 v6, p5

    :goto_4
    and-int/lit8 v8, p11, 0x10

    if-eqz v8, :cond_5

    sget-wide v8, Li2/x;->m:J

    move-wide v15, v8

    goto :goto_5

    :cond_5
    move-wide/from16 v15, p7

    :goto_5
    sget-object v8, Lg1/i8;->a:Lg1/i8;

    const v8, 0x8cc2355

    invoke-virtual {v0, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lg40/e1;->x:Lg40/e1;

    if-ne v1, v8, :cond_6

    sget-object v2, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v0, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/c1;

    invoke-virtual {v2}, Lg1/c1;->c()J

    move-result-wide v2

    goto :goto_6

    :cond_6
    sget-object v9, Lg40/e1;->w:Lg40/e1;

    if-eq v1, v9, :cond_8

    sget-object v9, Lg40/e1;->y:Lg40/e1;

    if-ne v1, v9, :cond_7

    goto :goto_6

    :cond_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_8
    :goto_6
    const/4 v9, 0x0

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    invoke-static {v0}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v10

    iget-wide v10, v10, Ld40/n;->g:J

    invoke-static {v0}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v12

    iget-wide v12, v12, Ld40/n;->g:J

    invoke-static {v0}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v14

    move-wide/from16 v21, v10

    iget-wide v9, v14, Ld40/n;->g:J

    move-wide/from16 v19, v12

    sget-wide v11, Li2/x;->m:J

    invoke-static {v0}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v13

    iget-wide v13, v13, Ld40/n;->f:J

    move-wide/from16 p1, v2

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_9

    const/4 v3, 0x1

    if-eq v2, v3, :cond_b

    const/4 v3, 0x2

    if-ne v2, v3, :cond_a

    :cond_9
    const/4 v2, 0x0

    goto :goto_7

    :cond_a
    const v1, 0x8cc7911

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_b
    const/4 v2, 0x0

    const v3, 0x8cc82b3

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-static {v0}, Lg1/l3;->a(Landroidx/compose/runtime/Composer;)Lg1/c1;

    move-result-object v3

    invoke-virtual {v3}, Lg1/c1;->c()J

    move-result-wide v17

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    move-wide/from16 p3, v4

    goto :goto_8

    :goto_7
    const v3, 0x8cc8eb8

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-static {v0}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v3

    move-wide/from16 p3, v4

    iget-wide v3, v3, Ld40/n;->f:J

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    move-wide/from16 v17, v3

    :goto_8
    const v2, 0x8cc94dd

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    if-ne v1, v8, :cond_c

    invoke-static {v0}, Lg1/l3;->a(Landroidx/compose/runtime/Composer;)Lg1/c1;

    move-result-object v1

    invoke-virtual {v1}, Lg1/c1;->c()J

    move-result-wide v1

    :goto_9
    const/4 v3, 0x0

    goto :goto_b

    :cond_c
    sget-object v2, Lg40/e1;->w:Lg40/e1;

    if-eq v1, v2, :cond_e

    sget-object v2, Lg40/e1;->y:Lg40/e1;

    if-ne v1, v2, :cond_d

    goto :goto_a

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_e
    :goto_a
    move-wide v1, v11

    goto :goto_9

    :goto_b
    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    const-wide/16 v25, 0x0

    const v28, 0x167e00

    move-wide v5, v6

    move-wide v7, v13

    move-wide v13, v11

    move-object/from16 v27, v0

    move v0, v3

    move-wide/from16 v23, v9

    move-wide/from16 v9, v17

    move-wide/from16 v3, p3

    move-wide/from16 v17, v1

    move-wide/from16 v1, p1

    invoke-static/range {v1 .. v28}, Lg1/i8;->h(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;I)Lg1/y1;

    move-result-object v1

    move-object/from16 v2, v27

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    return-object v1
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lg40/m3;ZLx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 14

    move/from16 v5, p5

    const-string v0, "textFieldController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, 0x7b01950e

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v1, v5, 0x30

    if-nez v1, :cond_4

    and-int/lit8 v1, v5, 0x40

    if-nez v1, :cond_2

    invoke-virtual {v11, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_2

    :cond_2
    invoke-virtual {v11, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_2
    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_3

    :cond_3
    const/16 v1, 0x10

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    and-int/lit8 v1, p6, 0x4

    if-eqz v1, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move/from16 v2, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v2, v5, 0x180

    if-nez v2, :cond_5

    move/from16 v2, p2

    invoke-virtual {v11, v2}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_7

    const/16 v3, 0x100

    goto :goto_4

    :cond_7
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v0, v3

    :goto_5
    or-int/lit16 v0, v0, 0xc00

    and-int/lit16 v3, v5, 0x6000

    move-object/from16 v10, p3

    if-nez v3, :cond_9

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x4000

    goto :goto_6

    :cond_8
    const/16 v3, 0x2000

    :goto_6
    or-int/2addr v0, v3

    :cond_9
    and-int/lit16 v3, v0, 0x2493

    const/16 v4, 0x2492

    if-ne v3, v4, :cond_b

    invoke-virtual {v11}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v11}, Lp1/q;->X()V

    move v3, v2

    goto :goto_9

    :cond_b
    :goto_7
    const/4 v3, 0x0

    if-eqz v1, :cond_c

    move v9, v3

    goto :goto_8

    :cond_c
    move v9, v2

    :goto_8
    invoke-interface {p1}, Lg40/z2;->f()Lec3/f2;

    move-result-object v1

    invoke-static {v1, v11, v3}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v1

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lg40/h1;

    shl-int/lit8 v1, v0, 0x6

    and-int/lit16 v1, v1, 0x380

    shl-int/lit8 v2, v0, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v1, v2

    const v2, 0xe000

    and-int/2addr v0, v2

    or-int v12, v1, v0

    const/4 v13, 0x0

    const/4 v6, 0x0

    move-object v8, p0

    invoke-static/range {v6 .. v13}, Lse/a;->o(Lzy/c;Lg40/h1;Landroidx/compose/ui/Modifier;ZLx1/b;Landroidx/compose/runtime/Composer;II)V

    move v3, v9

    :goto_9
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_d

    new-instance v0, Law0/h;

    const/16 v7, 0xa

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v4, p3

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Law0/h;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;ZLl83/e;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method public static final f(Lq3/y;ZZLjava/lang/String;Ljava/lang/String;Lg40/r3;ZZLg40/h1;ZLandroidx/compose/ui/Modifier;Lq3/g0;Ly3/m;Lu0/r0;Lu0/q0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 31

    move-object/from16 v15, p3

    move/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v0, p12

    move/from16 v1, p18

    const-string v2, "label"

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p17

    check-cast v2, Lp1/q;

    const v3, 0x1e8883bd

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    if-nez v3, :cond_1

    move-object/from16 v3, p0

    invoke-virtual {v2, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v1

    goto :goto_1

    :cond_1
    move-object/from16 v3, p0

    move v6, v1

    :goto_1
    and-int/lit8 v9, v1, 0x30

    if-nez v9, :cond_3

    move/from16 v9, p1

    invoke-virtual {v2, v9}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_2

    const/16 v12, 0x20

    goto :goto_2

    :cond_2
    const/16 v12, 0x10

    :goto_2
    or-int/2addr v6, v12

    goto :goto_3

    :cond_3
    move/from16 v9, p1

    :goto_3
    and-int/lit16 v12, v1, 0x180

    const/16 v13, 0x80

    const/16 v14, 0x100

    if-nez v12, :cond_5

    move/from16 v12, p2

    invoke-virtual {v2, v12}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_4

    move/from16 v16, v14

    goto :goto_4

    :cond_4
    move/from16 v16, v13

    :goto_4
    or-int v6, v6, v16

    goto :goto_5

    :cond_5
    move/from16 v12, p2

    :goto_5
    and-int/lit16 v4, v1, 0xc00

    const/16 v16, 0x400

    const/16 v17, 0x800

    if-nez v4, :cond_7

    invoke-virtual {v2, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    move/from16 v4, v17

    goto :goto_6

    :cond_6
    move/from16 v4, v16

    :goto_6
    or-int/2addr v6, v4

    :cond_7
    and-int/lit16 v4, v1, 0x6000

    const/16 v18, 0x2000

    const/16 v19, 0x4000

    if-nez v4, :cond_9

    move-object/from16 v4, p4

    invoke-virtual {v2, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_8

    move/from16 v20, v19

    goto :goto_7

    :cond_8
    move/from16 v20, v18

    :goto_7
    or-int v6, v6, v20

    goto :goto_8

    :cond_9
    move-object/from16 v4, p4

    :goto_8
    const/high16 v20, 0x30000

    and-int v20, v1, v20

    const/high16 v21, 0x20000

    const/high16 v22, 0x10000

    move-object/from16 v5, p5

    if-nez v20, :cond_b

    invoke-virtual {v2, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_a

    move/from16 v23, v21

    goto :goto_9

    :cond_a
    move/from16 v23, v22

    :goto_9
    or-int v6, v6, v23

    :cond_b
    const/high16 v23, 0x180000

    and-int v23, v1, v23

    const/high16 v24, 0x80000

    const/high16 v25, 0x100000

    move/from16 v10, p6

    if-nez v23, :cond_d

    invoke-virtual {v2, v10}, Lp1/q;->h(Z)Z

    move-result v26

    if-eqz v26, :cond_c

    move/from16 v26, v25

    goto :goto_a

    :cond_c
    move/from16 v26, v24

    :goto_a
    or-int v6, v6, v26

    :cond_d
    const/high16 v26, 0xc00000

    and-int v26, v1, v26

    if-nez v26, :cond_f

    invoke-virtual {v2, v7}, Lp1/q;->h(Z)Z

    move-result v26

    if-eqz v26, :cond_e

    const/high16 v26, 0x800000

    goto :goto_b

    :cond_e
    const/high16 v26, 0x400000

    :goto_b
    or-int v6, v6, v26

    :cond_f
    const/high16 v26, 0x6000000

    and-int v26, v1, v26

    if-nez v26, :cond_11

    invoke-virtual {v2, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_10

    const/high16 v26, 0x4000000

    goto :goto_c

    :cond_10
    const/high16 v26, 0x2000000

    :goto_c
    or-int v6, v6, v26

    :cond_11
    const/high16 v26, 0x30000000

    and-int v26, v1, v26

    move/from16 v11, p9

    if-nez v26, :cond_13

    invoke-virtual {v2, v11}, Lp1/q;->h(Z)Z

    move-result v27

    if-eqz v27, :cond_12

    const/high16 v27, 0x20000000

    goto :goto_d

    :cond_12
    const/high16 v27, 0x10000000

    :goto_d
    or-int v6, v6, v27

    :cond_13
    move-object/from16 v3, p10

    invoke-virtual {v2, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_14

    const/16 v20, 0x4

    :goto_e
    move-object/from16 v9, p11

    goto :goto_f

    :cond_14
    const/16 v20, 0x2

    goto :goto_e

    :goto_f
    invoke-virtual {v2, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_15

    const/16 v23, 0x20

    goto :goto_10

    :cond_15
    const/16 v23, 0x10

    :goto_10
    or-int v20, v20, v23

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_16

    move v13, v14

    :cond_16
    or-int v13, v20, v13

    move-object/from16 v14, p13

    invoke-virtual {v2, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_17

    move/from16 v16, v17

    :cond_17
    or-int v13, v13, v16

    move-object/from16 v0, p14

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_18

    move/from16 v18, v19

    :cond_18
    or-int v13, v13, v18

    move-object/from16 v0, p15

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_19

    goto :goto_11

    :cond_19
    move/from16 v21, v22

    :goto_11
    or-int v13, v13, v21

    move-object/from16 v0, p16

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1a

    move/from16 v24, v25

    :cond_1a
    or-int v13, v13, v24

    const v16, 0x12492493

    and-int v6, v6, v16

    const v0, 0x12492492

    if-ne v6, v0, :cond_1c

    const v0, 0x92493

    and-int/2addr v0, v13

    const v6, 0x92492

    if-ne v0, v6, :cond_1c

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_12

    :cond_1b
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_19

    :cond_1c
    :goto_12
    invoke-virtual {v2}, Lp1/q;->Z()V

    and-int/lit8 v0, v1, 0x1

    if-eqz v0, :cond_1e

    invoke-virtual {v2}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_1d

    goto :goto_13

    :cond_1d
    invoke-virtual {v2}, Lp1/q;->X()V

    :cond_1e
    :goto_13
    invoke-virtual {v2}, Lp1/q;->r()V

    const/4 v0, 0x1

    if-ne v7, v0, :cond_22

    instance-of v0, v8, Lg40/f1;

    if-nez v0, :cond_21

    if-nez v8, :cond_1f

    goto :goto_15

    :cond_1f
    instance-of v0, v8, Lg40/g1;

    if-eqz v0, :cond_20

    sget-object v0, Lg40/e1;->y:Lg40/e1;

    :goto_14
    move-object/from16 v16, v0

    goto :goto_16

    :cond_20
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_21
    :goto_15
    sget-object v0, Lg40/e1;->x:Lg40/e1;

    goto :goto_14

    :cond_22
    if-nez v7, :cond_25

    sget-object v0, Lg40/e1;->w:Lg40/e1;

    goto :goto_14

    :goto_16
    const/16 v26, 0x0

    const/16 v27, 0x1e

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    move-object/from16 v25, v2

    invoke-static/range {v16 .. v27}, Lg40/j4;->d(Lg40/e1;JJJJLandroidx/compose/runtime/Composer;II)Lg1/y1;

    move-result-object v0

    sget-object v6, Ld40/r;->j:Lp1/u2;

    invoke-virtual {v2, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    move-object v13, v6

    check-cast v13, Ld40/g;

    const v6, 0x5df51641

    invoke-virtual {v2, v6}, Lp1/q;->e0(I)V

    if-nez p12, :cond_23

    sget-object v6, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v2, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly3/m;

    :goto_17
    move-object/from16 p17, v0

    goto :goto_18

    :cond_23
    move-object/from16 v6, p12

    goto :goto_17

    :goto_18
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    sget-object v0, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v0, v6}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    move-object v6, v0

    new-instance v0, Lg40/h4;

    move-object v1, v14

    move v14, v10

    move-object v10, v1

    move-object/from16 v1, p0

    move-object/from16 v18, p16

    move-object/from16 v28, v2

    move-object/from16 v29, v6

    move/from16 v16, v11

    move/from16 v17, v12

    move-object/from16 v11, p14

    move-object/from16 v2, p15

    move-object/from16 v12, p17

    move-object v6, v5

    move-object v5, v4

    move/from16 v4, p1

    invoke-direct/range {v0 .. v18}, Lg40/h4;-><init>(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lg40/r3;ZLg40/h1;Lq3/g0;Lu0/r0;Lu0/q0;Lg1/y1;Ld40/g;ZLjava/lang/String;ZZLkotlin/jvm/functions/Function1;)V

    const v1, 0x7800487d

    move-object/from16 v2, v28

    invoke-static {v1, v2, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x38

    move-object/from16 v6, v29

    invoke-static {v6, v0, v2, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    :goto_19
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_24

    move-object v1, v0

    new-instance v0, Lg40/a4;

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v18, p18

    move-object/from16 v30, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v18}, Lg40/a4;-><init>(Lq3/y;ZZLjava/lang/String;Ljava/lang/String;Lg40/r3;ZZLg40/h1;ZLandroidx/compose/ui/Modifier;Lq3/g0;Ly3/m;Lu0/r0;Lu0/q0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    move-object/from16 v1, v30

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_24
    return-void

    :cond_25
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public static final g(Lg40/o3;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 20

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v0, p2

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v3, -0x376d09f

    invoke-virtual {v12, v3}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p4, v3

    invoke-virtual {v12, v2}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x20

    goto :goto_1

    :cond_1
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v3, v5

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x100

    goto :goto_2

    :cond_2
    const/16 v5, 0x80

    :goto_2
    or-int v9, v3, v5

    and-int/lit16 v3, v9, 0x93

    const/16 v5, 0x92

    if-ne v3, v5, :cond_4

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v12}, Lp1/q;->X()V

    goto/16 :goto_a

    :cond_4
    :goto_3
    const v3, 0x5bbc2e4a

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v3, v10, :cond_5

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v11, v3

    check-cast v11, Lp1/c1;

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    if-nez v2, :cond_6

    iget-boolean v3, v1, Lg40/o3;->b:Z

    if-nez v3, :cond_6

    const/4 v15, 0x1

    goto :goto_4

    :cond_6
    move v15, v13

    :goto_4
    const v3, 0x5bbc4150

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v10, :cond_7

    new-instance v3, Lg40/y1;

    const/4 v5, 0x6

    invoke-direct {v3, v5}, Lg40/y1;-><init>(I)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v3}, Landroidx/compose/ui/focus/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const v6, 0x5bbc48cf

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v10, :cond_8

    new-instance v6, Lg11/b;

    const/4 v7, 0x4

    invoke-direct {v6, v7, v11}, Lg11/b;-><init>(ILp1/c1;)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v6, Lc93/a;

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static {v3, v15, v8, v6, v7}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-string v6, "dropdown_menu_clickable"

    invoke-static {v3, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    move/from16 v16, v15

    iget-wide v14, v12, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_9

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_5
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v12, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v12, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-nez v13, :cond_a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v13, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    invoke-static {v7, v12, v7, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v12, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v3, 0xa

    int-to-float v7, v3

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Lb2/e;->K:Lb2/l;

    const/4 v13, 0x4

    int-to-float v13, v13

    invoke-static {v13}, Ll0/m;->i(F)Ll0/k;

    move-result-object v13

    const/16 v3, 0x36

    invoke-static {v13, v7, v12, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    move-object v13, v10

    move-object/from16 v17, v11

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_c

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_c
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v12, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v12, Lp1/q;->S:Z

    if-nez v3, :cond_d

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    :cond_d
    invoke-static {v7, v12, v7, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v12, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v2, Lg40/q3;

    iget-object v3, v1, Lg40/o3;->c:Lg40/n3;

    iget v3, v3, Lg40/n3;->c:I

    const/16 v4, 0xa

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct {v2, v3, v6, v5, v4}, Lg40/q3;-><init>(IZLh02/n0;I)V

    and-int/lit8 v6, v9, 0x70

    const/4 v7, 0x4

    const/4 v4, 0x0

    move/from16 v3, p1

    move-object v5, v12

    invoke-static/range {v2 .. v7}, Lg40/j4;->h(Lg40/q3;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const v2, -0xffbed84

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    if-eqz v16, :cond_f

    sget-object v2, Lg1/l1;->a:Lp1/b0;

    invoke-static {v12}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v3

    iget-wide v3, v3, Ld40/n;->g:J

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    invoke-virtual {v2, v5}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v2

    sget-object v3, Lg40/h0;->a:Lx1/b;

    const/16 v4, 0x38

    invoke-static {v2, v3, v12, v4}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    :cond_f
    const/4 v6, 0x0

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    const/4 v2, 0x1

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    invoke-interface/range {v17 .. v17}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-object v3, v1, Lg40/o3;->a:Lzy/b;

    iget-object v4, v1, Lg40/o3;->c:Lg40/n3;

    iget-object v5, v1, Lg40/o3;->d:Ljava/util/ArrayList;

    invoke-static {v12}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v6

    iget-wide v7, v6, Ld40/n;->e:J

    invoke-static {v12}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v6

    iget-wide v10, v6, Ld40/n;->d:J

    const v6, -0x2f87c020

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    and-int/lit16 v6, v9, 0x380

    const/16 v9, 0x100

    if-ne v6, v9, :cond_10

    const/4 v6, 0x1

    goto :goto_7

    :cond_10
    const/4 v6, 0x0

    :goto_7
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v6, :cond_12

    if-ne v9, v13, :cond_11

    goto :goto_8

    :cond_11
    move-object/from16 v14, v17

    goto :goto_9

    :cond_12
    :goto_8
    new-instance v9, Lb30/r;

    const/16 v6, 0xc

    move-object/from16 v14, v17

    invoke-direct {v9, v0, v14, v6}, Lb30/r;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    move-object v6, v9

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const v9, -0x2f87b075

    const/4 v15, 0x0

    invoke-static {v9, v12, v15}, Lr;->h(ILp1/q;Z)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v13, :cond_13

    new-instance v9, Lg11/b;

    const/4 v13, 0x5

    invoke-direct {v9, v13, v14}, Lg11/b;-><init>(ILp1/c1;)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v9, Lc93/a;

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    const/high16 v13, 0xc00000

    move-wide/from16 v18, v10

    move-object v11, v9

    move-wide/from16 v9, v18

    invoke-static/range {v2 .. v13}, Lse/b;->s(ZLzy/b;Lg40/g3;Ljava/util/List;Lkotlin/jvm/functions/Function1;JJLc93/a;Landroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x1

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_14

    new-instance v0, La31/c;

    const/4 v5, 0x4

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, La31/c;-><init>(Ljava/lang/Object;ZLl83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method public static final h(Lg40/q3;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 17

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "trailingIcon"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, Lg40/q3;->d:Lc93/a;

    iget v3, v1, Lg40/q3;->a:I

    iget-object v5, v1, Lg40/q3;->b:Ljava/lang/Integer;

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v6, 0x229d3640

    invoke-virtual {v13, v6}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v6, v4, 0x6

    if-nez v6, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_1
    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v13, v2}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_3
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_5

    or-int/lit16 v6, v6, 0x180

    :cond_4
    move-object/from16 v8, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_4

    move-object/from16 v8, p2

    invoke-virtual {v13, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x100

    goto :goto_3

    :cond_6
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v6, v9

    :goto_4
    and-int/lit16 v6, v6, 0x93

    const/16 v9, 0x92

    if-ne v6, v9, :cond_8

    invoke-virtual {v13}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v3, v8

    goto/16 :goto_c

    :cond_8
    :goto_5
    if-eqz v7, :cond_9

    sget-object v6, Lb2/t;->w:Lb2/t;

    goto :goto_6

    :cond_9
    move-object v6, v8

    :goto_6
    const/4 v7, 0x0

    if-eqz v2, :cond_a

    const v0, 0x249e33b2

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    new-instance v0, Ldc1/c;

    const/16 v3, 0x1d

    invoke-direct {v0, v3}, Ldc1/c;-><init>(I)V

    const/4 v3, 0x1

    invoke-static {v6, v3, v0}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v3, 0x18

    int-to-float v3, v3

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v14, 0x0

    const/16 v15, 0x1e

    move v3, v7

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v16, v6

    move-object v6, v0

    move-object/from16 v0, v16

    invoke-static/range {v6 .. v15}, Lg1/v4;->b(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :cond_a
    move-object v14, v6

    move v15, v7

    iget-boolean v6, v1, Lg40/q3;->c:Z

    const/4 v7, 0x7

    const/4 v8, 0x0

    if-eqz v6, :cond_d

    const v6, 0x24a1683a    # 6.9999187E-17f

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    invoke-static {v3, v13, v15}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v6

    const v3, 0x19f4c217

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    if-nez v5, :cond_b

    move-object v3, v8

    goto :goto_7

    :cond_b
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v13, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    :goto_7
    invoke-virtual {v13, v15}, Lp1/q;->q(Z)V

    if-eqz v0, :cond_c

    new-instance v5, Lg40/i3;

    const/4 v9, 0x1

    invoke-direct {v5, v0, v9}, Lg40/i3;-><init>(Lc93/a;I)V

    invoke-static {v14, v15, v8, v5, v7}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object v8, v0

    goto :goto_8

    :cond_c
    move-object v8, v14

    :goto_8
    const/4 v12, 0x0

    move-object v11, v13

    const/16 v13, 0x8

    const-wide/16 v9, 0x0

    move-object v7, v3

    invoke-static/range {v6 .. v13}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v13, v11

    invoke-virtual {v13, v15}, Lp1/q;->q(Z)V

    move-object v0, v14

    goto :goto_b

    :cond_d
    const v6, 0x24a66719

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    invoke-static {v3, v13, v15}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v6

    const v3, 0x19f4eb77

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    if-nez v5, :cond_e

    move-object v3, v8

    goto :goto_9

    :cond_e
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v13, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    :goto_9
    invoke-virtual {v13, v15}, Lp1/q;->q(Z)V

    if-eqz v0, :cond_f

    new-instance v5, Lg40/i3;

    const/4 v9, 0x1

    invoke-direct {v5, v0, v9}, Lg40/i3;-><init>(Lc93/a;I)V

    invoke-static {v14, v15, v8, v5, v7}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object v8, v0

    move-object v0, v14

    goto :goto_a

    :cond_f
    move-object v0, v14

    move-object v8, v0

    :goto_a
    const/4 v14, 0x0

    move v5, v15

    const/16 v15, 0x78

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v7, v3

    move v3, v5

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    :goto_b
    move-object v3, v0

    :goto_c
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_10

    new-instance v0, Lbg0/h;

    const/16 v6, 0x8

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lbg0/h;-><init>(Ljava/lang/Object;ZLjava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method
