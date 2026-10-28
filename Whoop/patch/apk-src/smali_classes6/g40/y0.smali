.class public abstract Lg40/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x118

    int-to-float v0, v0

    sput v0, Lg40/y0;->a:F

    const/16 v0, 0x30

    int-to-float v0, v0

    sput v0, Lg40/y0;->b:F

    return-void
.end method

.method public static final a(Lg40/r0;ZLandroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;I)V
    .locals 32

    move-object/from16 v1, p0

    move/from16 v8, p1

    move-object/from16 v9, p2

    move/from16 v10, p5

    const-string v0, "controller"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, v1, Lg40/r0;->l:Z

    iget-object v2, v1, Lg40/r0;->g:Lec3/h2;

    move-object/from16 v15, p4

    check-cast v15, Lp1/q;

    const v3, 0x391a9445

    invoke-virtual {v15, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v10, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v10

    goto :goto_1

    :cond_1
    move v3, v10

    :goto_1
    and-int/lit8 v6, v10, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v15, v8}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit16 v6, v10, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v15, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v3, v6

    :cond_5
    or-int/lit16 v3, v3, 0xc00

    and-int/lit16 v6, v3, 0x493

    const/16 v7, 0x492

    if-ne v6, v7, :cond_7

    invoke-virtual {v15}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v15}, Lp1/q;->X()V

    move/from16 v4, p3

    goto/16 :goto_14

    :cond_7
    :goto_4
    iget-object v6, v1, Lg40/r0;->h:Lec3/h2;

    const/4 v7, 0x0

    invoke-static {v6, v15, v7}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v6

    invoke-static {v2, v15, v7}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v19

    iget-object v11, v1, Lg40/r0;->b:Ljava/util/List;

    move-object v12, v11

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12}, Ljava/util/Collection;->size()I

    move-result v12

    const/4 v13, 0x1

    if-ne v12, v13, :cond_8

    iget-boolean v12, v1, Lg40/r0;->c:Z

    if-eqz v12, :cond_8

    move v14, v13

    goto :goto_5

    :cond_8
    move v14, v7

    :goto_5
    if-eqz v8, :cond_9

    if-nez v14, :cond_9

    move v12, v13

    goto :goto_6

    :cond_9
    move v12, v7

    :goto_6
    const v13, 0x1becb7a2

    invoke-virtual {v15, v13}, Lp1/q;->e0(I)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v13, v4, :cond_a

    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v13}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v13

    invoke-virtual {v15, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v13, Lp1/c1;

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    iget-object v5, v1, Lg40/r0;->j:Ln53/e;

    invoke-static {v5, v15, v7}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v5

    invoke-static {v2, v15, v7}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v2

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    const v7, 0x1becd07a

    invoke-virtual {v15, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_b

    if-ne v7, v4, :cond_e

    :cond_b
    invoke-interface/range {v19 .. v19}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_d

    iget-object v7, v1, Lg40/r0;->a:Lg40/p0;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v7, v2}, Lg40/p0;->e(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_c

    goto :goto_8

    :cond_c
    :goto_7
    move-object v7, v2

    goto :goto_9

    :cond_d
    :goto_8
    const-string v2, ""

    goto :goto_7

    :goto_9
    invoke-virtual {v15, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v7, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    if-eqz v12, :cond_f

    const v2, 0x61af4d4c

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    invoke-static {v15}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v2

    move/from16 v17, v0

    iget-wide v0, v2, Ld40/n;->d:J

    const/4 v2, 0x0

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    move-object/from16 v21, v5

    move-object/from16 v18, v6

    goto :goto_b

    :cond_f
    move/from16 v17, v0

    const v0, 0x61b03a28

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-static {v15}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v0

    iget-wide v0, v0, Ld40/n;->d:J

    sget-object v2, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v15, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    move-object/from16 v21, v5

    move-object/from16 v18, v6

    iget-wide v5, v2, Li2/x;->a:J

    sget-object v2, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v15, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/c1;

    invoke-virtual {v2}, Lg1/c1;->i()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-static {v5, v6}, Li2/w0;->x(J)F

    goto :goto_a

    :cond_10
    invoke-static {v5, v6}, Li2/w0;->x(J)F

    :goto_a
    const v2, 0x3ec28f5c    # 0.38f

    invoke-static {v2, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    :goto_b
    sget-object v5, Lb2/e;->w:Lb2/m;

    sget-object v6, Lb2/t;->w:Lb2/t;

    move-wide/from16 v22, v0

    const/4 v0, 0x2

    invoke-static {v6, v5, v2, v0}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v15}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v1

    move/from16 v16, v3

    iget-wide v2, v1, Ld40/n;->a:J

    sget-object v1, Li2/w0;->a:Li2/v0;

    invoke-static {v0, v2, v3, v1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v0, v9}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v5, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    move-object v2, v7

    iget-wide v7, v15, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v15, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v24, La3/l;->a:La3/k;

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v24, v2

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v9, v15, Lp1/q;->S:Z

    if-eqz v9, :cond_11

    invoke-virtual {v15, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_11
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_c
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v15, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v15, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v15, Lp1/q;->S:Z

    if-nez v10, :cond_12

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v25, v11

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_13

    goto :goto_d

    :cond_12
    move-object/from16 v25, v11

    :goto_d
    invoke-static {v7, v15, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v15, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x1a1f2d35

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    const v0, -0x1a1f4e4d

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_14

    new-instance v0, Lg1/u4;

    const/16 v10, 0x17

    invoke-direct {v0, v10}, Lg1/u4;-><init>(I)V

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v10, 0x0

    invoke-virtual {v15, v10}, Lp1/q;->q(Z)V

    invoke-static {v6, v0}, Landroidx/compose/ui/focus/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v10, 0x7f140fe4

    invoke-static {v15, v10}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    const v11, -0x1a1f358e

    invoke-virtual {v15, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v4, :cond_15

    new-instance v11, Lg11/b;

    move/from16 v26, v14

    const/4 v14, 0x1

    invoke-direct {v11, v14, v13}, Lg11/b;-><init>(ILp1/c1;)V

    invoke-virtual {v15, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_e

    :cond_15
    move/from16 v26, v14

    :goto_e
    check-cast v11, Lc93/a;

    const/4 v14, 0x0

    invoke-virtual {v15, v14}, Lp1/q;->q(Z)V

    const/4 v14, 0x4

    invoke-static {v0, v12, v10, v11, v14}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v10, -0x1a1f2a21

    invoke-virtual {v15, v10}, Lp1/q;->e0(I)V

    const v10, 0x19b53c3d

    invoke-virtual {v15, v10}, Lp1/q;->e0(I)V

    sget-object v10, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v15, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v10

    const-string v11, "android.software.leanback"

    invoke-virtual {v10, v11}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v10

    const/4 v14, 0x0

    invoke-virtual {v15, v14}, Lp1/q;->q(Z)V

    if-eqz v10, :cond_17

    const v10, 0x268678b1

    invoke-virtual {v15, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v4, :cond_16

    new-instance v10, Lg11/b;

    const/4 v11, 0x2

    invoke-direct {v10, v11, v13}, Lg11/b;-><init>(ILp1/c1;)V

    invoke-virtual {v15, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v10, Lc93/a;

    const/4 v14, 0x0

    invoke-virtual {v15, v14}, Lp1/q;->q(Z)V

    invoke-static {v0, v14, v12, v10}, Landroidx/compose/foundation/selection/b;->b(Landroidx/compose/ui/Modifier;ZZLc93/a;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto :goto_f

    :cond_17
    const/4 v14, 0x0

    :goto_f
    invoke-virtual {v15, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v14}, Lp1/q;->q(Z)V

    if-eqz v17, :cond_18

    const-string v10, "tiny"

    goto :goto_10

    :cond_18
    const-string v10, "normal"

    :goto_10
    const-string v11, "DropDown:"

    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v0, v10}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v5, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v10, v15, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v15, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v12, v15, Lp1/q;->S:Z

    if-eqz v12, :cond_19

    invoke-virtual {v15, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_19
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v15, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v15, Lp1/q;->S:Z

    if-nez v2, :cond_1a

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    :cond_1a
    invoke-static {v10, v15, v10, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v15, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v17, :cond_1c

    const v0, -0x55b30841

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    move/from16 v0, v16

    and-int/lit16 v0, v0, 0x1c00

    move/from16 v16, v0

    move-object v2, v13

    move-wide/from16 v12, v22

    move-object/from16 v11, v24

    move/from16 v14, v26

    const/4 v8, 0x1

    invoke-static/range {v11 .. v16}, Lg40/y0;->d(Ljava/lang/String;JZLandroidx/compose/runtime/Composer;I)V

    const/4 v14, 0x0

    invoke-virtual {v15, v14}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_1c
    move-object v2, v13

    move/from16 v0, v16

    move-wide/from16 v12, v22

    move-object/from16 v11, v24

    const/4 v8, 0x1

    const v3, -0x55adfbb3

    invoke-virtual {v15, v3}, Lp1/q;->e0(I)V

    invoke-interface/range {v18 .. v18}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzy/c;

    invoke-interface/range {v21 .. v21}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg40/h1;

    if-eqz v5, :cond_1d

    move v12, v8

    goto :goto_12

    :cond_1d
    const/4 v12, 0x0

    :goto_12
    const/high16 v5, 0x70000

    shl-int/lit8 v0, v0, 0x6

    and-int v18, v0, v5

    move-object v13, v11

    move-object/from16 v17, v15

    move-wide/from16 v14, v22

    move/from16 v16, v26

    move-object v11, v3

    invoke-static/range {v11 .. v18}, Lg40/y0;->c(Lzy/c;ZLjava/lang/String;JZLandroidx/compose/runtime/Composer;I)V

    move-wide v12, v14

    move-object/from16 v15, v17

    const/4 v14, 0x0

    invoke-virtual {v15, v14}, Lp1/q;->q(Z)V

    :goto_13
    invoke-virtual {v15, v8}, Lp1/q;->q(Z)V

    invoke-static {v14, v15, v8}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v16

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    const v0, -0x1a1e816d

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_1e

    new-instance v0, Lg11/b;

    const/4 v3, 0x3

    invoke-direct {v0, v3, v2}, Lg11/b;-><init>(ILp1/c1;)V

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    move-object v9, v0

    check-cast v9, Lc93/a;

    const/4 v14, 0x0

    invoke-virtual {v15, v14}, Lp1/q;->q(Z)V

    invoke-static {v15}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v0

    iget-wide v3, v0, Ld40/n;->a:J

    invoke-static {v6, v3, v4, v1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v1, Lg40/y0;->a:F

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v26

    sget v0, Lg40/y0;->b:F

    const v1, 0x410e6666    # 8.9f

    mul-float v30, v0, v1

    const/16 v31, 0x7

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-static/range {v26 .. v31}, Landroidx/compose/foundation/layout/d;->n(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    new-instance v0, Lg40/v0;

    move-object/from16 v4, p0

    move-object v6, v2

    move-wide v2, v12

    move-object/from16 v7, v16

    move-object/from16 v5, v19

    move-object/from16 v1, v25

    invoke-direct/range {v0 .. v7}, Lg40/v0;-><init>(Ljava/util/List;JLg40/r0;Lp1/c1;Lp1/c1;Lf0/r1;)V

    const v1, 0x5134a1fe

    invoke-static {v1, v15, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v18

    const v20, 0x180030

    const/16 v21, 0x28

    move-object/from16 v17, v15

    const-wide/16 v14, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move-object v12, v9

    move-object v13, v10

    invoke-static/range {v11 .. v21}, Lg1/f0;->a(ZLc93/a;Landroidx/compose/ui/Modifier;JLf0/r1;Lc4/j0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v15, v19

    invoke-virtual {v15, v8}, Lp1/q;->q(Z)V

    move v4, v8

    :goto_14
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1f

    new-instance v0, Lg40/s0;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lg40/s0;-><init>(Lg40/r0;ZLandroidx/compose/ui/Modifier;ZI)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method public static final b(Ljava/lang/String;ZJLandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    const-string v4, "displayValue"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p6

    check-cast v10, Lp1/q;

    const v4, -0x3270e

    invoke-virtual {v10, v4}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int v4, p7, v4

    invoke-virtual {v10, v1}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x20

    goto :goto_1

    :cond_1
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v4, v5

    move-wide/from16 v5, p2

    invoke-virtual {v10, v5, v6}, Lp1/q;->f(J)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x100

    goto :goto_2

    :cond_2
    const/16 v7, 0x80

    :goto_2
    or-int/2addr v4, v7

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x800

    goto :goto_3

    :cond_3
    const/16 v7, 0x400

    :goto_3
    or-int/2addr v4, v7

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    const/16 v8, 0x4000

    if-eqz v7, :cond_4

    move v7, v8

    goto :goto_4

    :cond_4
    const/16 v7, 0x2000

    :goto_4
    or-int/2addr v4, v7

    and-int/lit16 v7, v4, 0x2493

    const/16 v9, 0x2492

    if-ne v7, v9, :cond_6

    invoke-virtual {v10}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v10}, Lp1/q;->X()V

    goto/16 :goto_b

    :cond_6
    :goto_5
    sget-object v7, Lb2/e;->K:Lb2/l;

    sget-object v9, Ll0/m;->a:Ll0/e;

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/16 v16, 0x0

    const/16 v17, 0xd

    const/4 v13, 0x0

    sget v14, Lg40/y0;->b:F

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/d;->n(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const v12, 0x3f1d1f5b

    invoke-virtual {v10, v12}, Lp1/q;->e0(I)V

    const v12, 0xe000

    and-int/2addr v12, v4

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-ne v12, v8, :cond_7

    move v8, v14

    goto :goto_6

    :cond_7
    move v8, v13

    :goto_6
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v8, :cond_8

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v12, v8, :cond_9

    :cond_8
    new-instance v12, Ld42/o;

    const/16 v8, 0x1d

    invoke-direct {v12, v3, v8}, Ld42/o;-><init>(Lc93/a;I)V

    invoke-virtual {v10, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v12, Lc93/a;

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    const/4 v8, 0x7

    const/4 v15, 0x0

    invoke-static {v11, v13, v15, v12, v8}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v11, 0x36

    invoke-static {v9, v7, v10, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_a

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_7
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v10, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v10, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-nez v11, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_c

    :cond_b
    invoke-static {v9, v10, v9, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v10, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v7, 0xd

    int-to-float v7, v7

    const/16 v19, 0x0

    const/16 v20, 0xe

    sget-object v15, Lb2/t;->w:Lb2/t;

    const/16 v17, 0x0

    const/16 v18, 0x0

    move/from16 v16, v7

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const v8, 0x3f4ccccd    # 0.8f

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const v8, 0x45829073

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    if-eqz v1, :cond_d

    sget-object v8, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v10, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg1/c1;

    invoke-virtual {v8}, Lg1/c1;->f()J

    move-result-wide v8

    goto :goto_8

    :cond_d
    move-wide v8, v5

    :goto_8
    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    if-eqz v1, :cond_e

    sget-object v11, Lp3/r;->I:Lp3/r;

    goto :goto_9

    :cond_e
    sget-object v11, Lp3/r;->F:Lp3/r;

    :goto_9
    and-int/lit8 v4, v4, 0xe

    or-int/lit8 v22, v4, 0x30

    const/16 v23, 0x0

    const v24, 0x1ffd8

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-wide v2, v8

    const/4 v8, 0x0

    move-object/from16 v21, v10

    const-wide/16 v9, 0x0

    move-object v1, v7

    move-object v7, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v16, v13

    move/from16 v17, v14

    const-wide/16 v13, 0x0

    move-object/from16 v18, v15

    const/4 v15, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move-object/from16 v25, v18

    const/16 v18, 0x0

    move/from16 v26, v19

    const/16 v19, 0x0

    move/from16 v27, v20

    const/16 v20, 0x0

    move-object/from16 v28, v25

    invoke-static/range {v0 .. v24}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v21

    const v0, 0x4582b5fe

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    if-eqz p1, :cond_f

    const v0, 0x7f0807c0

    const/4 v1, 0x0

    invoke-static {v0, v10, v1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v5

    const/16 v0, 0x18

    int-to-float v0, v0

    move-object/from16 v15, v28

    invoke-static {v0, v15}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v0, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v10, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->f()J

    move-result-wide v8

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    goto :goto_a

    :cond_f
    const/4 v1, 0x0

    :goto_a
    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_10

    new-instance v0, Lg40/u0;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lg40/u0;-><init>(Ljava/lang/String;ZJLandroidx/compose/ui/Modifier;Lc93/a;I)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method public static final c(Lzy/c;ZLjava/lang/String;JZLandroidx/compose/runtime/Composer;I)V
    .locals 26

    move-object/from16 v1, p0

    move/from16 v10, p1

    move-object/from16 v0, p2

    move-wide/from16 v12, p3

    move/from16 v2, p5

    move/from16 v3, p7

    move-object/from16 v4, p6

    check-cast v4, Lp1/q;

    const v5, -0x19f1668

    invoke-virtual {v4, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v3, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v3

    goto :goto_1

    :cond_1
    move v5, v3

    :goto_1
    and-int/lit8 v6, v3, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v4, v10}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit16 v6, v3, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit16 v6, v3, 0xc00

    if-nez v6, :cond_7

    invoke-virtual {v4, v12, v13}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_4

    :cond_6
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v5, v6

    :cond_7
    and-int/lit16 v6, v3, 0x6000

    if-nez v6, :cond_9

    invoke-virtual {v4, v2}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x4000

    goto :goto_5

    :cond_8
    const/16 v6, 0x2000

    :goto_5
    or-int/2addr v5, v6

    :cond_9
    const/high16 v6, 0x30000

    and-int/2addr v6, v3

    const/4 v7, 0x1

    if-nez v6, :cond_b

    invoke-virtual {v4, v7}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_a

    const/high16 v6, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v6, 0x10000

    :goto_6
    or-int/2addr v5, v6

    :cond_b
    const v6, 0x12493

    and-int/2addr v6, v5

    const v8, 0x12492

    if-ne v6, v8, :cond_d

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_c

    goto :goto_7

    :cond_c
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object/from16 v20, v4

    goto/16 :goto_f

    :cond_d
    :goto_7
    sget-object v6, Ld40/r;->j:Lp1/u2;

    invoke-virtual {v4, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ld40/g;

    new-instance v2, Lq3/y;

    if-nez v0, :cond_e

    const-string v8, ""

    goto :goto_8

    :cond_e
    move-object v8, v0

    :goto_8
    const-wide/16 v14, 0x0

    const/4 v9, 0x6

    invoke-direct {v2, v9, v8, v14, v15}, Lq3/y;-><init>(ILjava/lang/String;J)V

    const v8, -0x7dbe5d56

    invoke-virtual {v4, v8}, Lp1/q;->e0(I)V

    if-nez p5, :cond_f

    new-instance v8, Lg40/w0;

    const/4 v9, 0x0

    invoke-direct {v8, v12, v13, v9}, Lg40/w0;-><init>(JI)V

    const v9, -0x50f07ac1

    invoke-static {v9, v4, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    :goto_9
    move-object v9, v8

    goto :goto_a

    :cond_f
    const/4 v8, 0x0

    goto :goto_9

    :goto_a
    const/4 v8, 0x0

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v6}, Ld40/g;->a()Ll0/l1;

    move-result-object v6

    if-ne v10, v7, :cond_10

    sget-object v7, Lg40/e1;->x:Lg40/e1;

    :goto_b
    move-object v11, v7

    goto :goto_c

    :cond_10
    if-nez v10, :cond_14

    sget-object v7, Lg40/e1;->w:Lg40/e1;

    goto :goto_b

    :goto_c
    const v7, -0x7dbe072b

    invoke-virtual {v4, v7}, Lp1/q;->e0(I)V

    if-eqz v10, :cond_11

    sget-object v7, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v4, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg1/c1;

    invoke-virtual {v7}, Lg1/c1;->c()J

    move-result-wide v14

    :goto_d
    move-wide/from16 v18, v14

    goto :goto_e

    :cond_11
    sget-wide v14, Li2/x;->m:J

    goto :goto_d

    :goto_e
    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    shr-int/lit8 v7, v5, 0x6

    and-int/lit8 v7, v7, 0x70

    shr-int/lit8 v5, v5, 0x3

    and-int/lit16 v14, v5, 0x380

    or-int v21, v7, v14

    const/16 v22, 0x8

    const-wide/16 v16, 0x0

    move-wide/from16 v14, p3

    move-object/from16 v20, v4

    invoke-static/range {v11 .. v22}, Lg40/j4;->d(Lg40/e1;JJJJLandroidx/compose/runtime/Composer;II)Lg1/y1;

    move-result-object v4

    move-object/from16 v7, v20

    sget-object v11, Lb2/t;->w:Lb2/t;

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const v12, -0x7dbe71c7

    invoke-virtual {v7, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-ne v12, v13, :cond_12

    new-instance v12, Lg1/u4;

    const/16 v13, 0x18

    invoke-direct {v12, v13}, Lg1/u4;-><init>(I)V

    invoke-virtual {v7, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    new-instance v8, Lg40/x0;

    const/4 v13, 0x0

    invoke-direct {v8, v1, v13}, Lg40/x0;-><init>(Lzy/c;I)V

    const v13, 0x49b525de    # 1483963.8f

    invoke-static {v13, v7, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    and-int/lit8 v5, v5, 0xe

    or-int/lit8 v24, v5, 0x30

    const v25, 0xff1b0

    const/4 v5, 0x0

    move-object/from16 v21, v6

    const/4 v6, 0x0

    move-object/from16 v20, v7

    move-object v7, v8

    const/4 v8, 0x0

    move-object/from16 v22, v20

    move-object/from16 v20, v4

    move-object v4, v11

    const/4 v11, 0x0

    move-object v3, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v23, 0x180db0

    invoke-static/range {v2 .. v25}, Lvp/c;->h(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lc93/m;ZLjava/lang/String;Lq3/g0;Lu0/r0;Lu0/q0;ZIILj0/i;Li2/a1;Lg1/y1;Ll0/l1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v20, v22

    :goto_f
    invoke-virtual/range {v20 .. v20}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_13

    new-instance v0, Lg40/t0;

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v4, p3

    move/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lg40/t0;-><init>(Lzy/c;ZLjava/lang/String;JZI)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void

    :cond_14
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public static final d(Ljava/lang/String;JZLandroidx/compose/runtime/Composer;I)V
    .locals 29

    move/from16 v3, p3

    move/from16 v1, p5

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, 0x4b3b4f51    # 1.2275537E7f

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    move-object/from16 v2, p0

    if-nez v0, :cond_1

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v4, v1, 0x30

    if-nez v4, :cond_3

    move-wide/from16 v4, p1

    invoke-virtual {v9, v4, v5}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    goto :goto_3

    :cond_3
    move-wide/from16 v4, p1

    :goto_3
    and-int/lit16 v6, v1, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v9, v3}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_4

    :cond_4
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v0, v6

    :cond_5
    and-int/lit16 v6, v1, 0xc00

    const/4 v7, 0x1

    if-nez v6, :cond_7

    invoke-virtual {v9, v7}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_5

    :cond_6
    const/16 v6, 0x400

    :goto_5
    or-int/2addr v0, v6

    :cond_7
    and-int/lit16 v6, v0, 0x493

    const/16 v8, 0x492

    if-ne v6, v8, :cond_9

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {v9}, Lp1/q;->X()V

    goto/16 :goto_8

    :cond_9
    :goto_6
    sget-object v6, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->a:Ll0/e;

    const/16 v10, 0x30

    invoke-static {v8, v6, v9, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v14, v9, Lp1/q;->S:Z

    if-eqz v14, :cond_a

    invoke-virtual {v9, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_7
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v9, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v9, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-nez v10, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    :cond_b
    invoke-static {v8, v9, v8, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v9, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v6, v0, 0xe

    shl-int/lit8 v0, v0, 0x3

    and-int/lit16 v0, v0, 0x380

    or-int v26, v6, v0

    const/16 v27, 0x0

    const v28, 0x1fffa

    const/4 v5, 0x0

    move-object/from16 v25, v9

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-object v0, v11

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

    move-object v4, v2

    move-object v2, v0

    move v0, v7

    move-wide/from16 v6, p1

    invoke-static/range {v4 .. v28}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v25

    const v4, -0x7ae3a976

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    const/4 v12, 0x0

    if-nez v3, :cond_d

    const v4, 0x7f0807c2

    invoke-static {v4, v9, v12}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v4

    const/16 v5, 0x18

    int-to-float v5, v5

    invoke-static {v5, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v9}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v2

    iget-wide v7, v2, Ld40/n;->g:J

    const/16 v10, 0x1b0

    const/4 v11, 0x0

    const/4 v5, 0x0

    invoke-static/range {v4 .. v11}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    :cond_d
    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Lb30/a3;

    move-object/from16 v2, p0

    move-wide/from16 v4, p1

    invoke-direct/range {v0 .. v5}, Lb30/a3;-><init>(ILjava/lang/String;ZJ)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method
