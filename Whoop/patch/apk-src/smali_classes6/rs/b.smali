.class public abstract Lrs/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ln6/o;Lv6/c;Lc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 8

    check-cast p3, Lp1/q;

    const v0, 0xd8870fc

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
    and-int/lit16 v1, v1, 0x93

    const/16 v3, 0x92

    if-ne v1, v3, :cond_5

    invoke-virtual {p3}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_5

    :cond_4
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_4
    move-object v3, p0

    move-object v4, p1

    goto :goto_7

    :cond_5
    :goto_5
    if-eqz v0, :cond_6

    sget-object p0, Ln6/m;->a:Ln6/m;

    :cond_6
    if-eqz v2, :cond_7

    sget-object p1, Lv6/c;->c:Lv6/c;

    :cond_7
    const v0, 0x6e3c21fe

    invoke-virtual {p3, v0}, Lp1/q;->f0(I)V

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_8

    sget-object v0, Lv6/d;->w:Lv6/d;

    invoke-virtual {p3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v0, Lj93/g;

    const/4 v1, 0x0

    invoke-virtual {p3, v1}, Lp1/q;->q(Z)V

    check-cast v0, Lc93/a;

    const v2, -0x28c122f7

    invoke-virtual {p3, v2}, Lp1/q;->f0(I)V

    const v2, -0x20ad3f64

    invoke-virtual {p3, v2}, Lp1/q;->f0(I)V

    iget-object v2, p3, Lp1/q;->a:Lhb3/a0;

    instance-of v2, v2, Ln6/b;

    if-eqz v2, :cond_b

    invoke-virtual {p3}, Lp1/q;->c0()V

    iget-boolean v2, p3, Lp1/q;->S:Z

    if-eqz v2, :cond_9

    invoke-virtual {p3, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {p3}, Lp1/q;->s0()V

    :goto_6
    new-instance v0, Lsl0/b2;

    const/16 v2, 0x19

    invoke-direct {v0, v2}, Lsl0/b2;-><init>(I)V

    invoke-static {p3, v0, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v0, Lsl0/b2;

    const/16 v2, 0x1a

    invoke-direct {v0, v2}, Lsl0/b2;-><init>(I)V

    invoke-static {p3, v0, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, p3, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lp1/q;->q(Z)V

    invoke-virtual {p3, v1}, Lp1/q;->q(Z)V

    invoke-virtual {p3, v1}, Lp1/q;->q(Z)V

    goto :goto_4

    :goto_7
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_a

    new-instance v2, Ls01/e;

    move-object v5, p2

    move v6, p4

    move v7, p5

    invoke-direct/range {v2 .. v7}, Ls01/e;-><init>(Ln6/o;Lv6/c;Lc93/m;II)V

    iput-object v2, p0, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void

    :cond_b
    invoke-static {}, Lp1/x;->w()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final b(ZLx30/w;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 23

    move/from16 v0, p0

    move-object/from16 v8, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v9, p4

    move/from16 v10, p6

    const-string v1, "controller"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v8, Lx30/w;->b:Lx30/v;

    const-string v4, "hiddenIdentifiers"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p5

    check-cast v14, Lp1/q;

    const v4, -0x602f5a7d

    invoke-virtual {v14, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v10, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v14, v0}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v10

    goto :goto_1

    :cond_1
    move v4, v10

    :goto_1
    and-int/lit8 v5, v10, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_4

    and-int/lit8 v5, v10, 0x40

    if-nez v5, :cond_2

    invoke-virtual {v14, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_2
    invoke-virtual {v14, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-eqz v5, :cond_3

    move v5, v6

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v4, v5

    :cond_4
    and-int/lit16 v5, v10, 0x180

    if-nez v5, :cond_6

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x100

    goto :goto_4

    :cond_5
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v4, v5

    :cond_6
    and-int/lit16 v5, v10, 0xc00

    if-nez v5, :cond_9

    and-int/lit16 v5, v10, 0x1000

    if-nez v5, :cond_7

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_5

    :cond_7
    invoke-virtual {v14, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_5
    if-eqz v5, :cond_8

    const/16 v5, 0x800

    goto :goto_6

    :cond_8
    const/16 v5, 0x400

    :goto_6
    or-int/2addr v4, v5

    :cond_9
    and-int/lit16 v5, v10, 0x6000

    if-nez v5, :cond_b

    invoke-virtual {v14, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    const/16 v5, 0x4000

    goto :goto_7

    :cond_a
    const/16 v5, 0x2000

    :goto_7
    or-int/2addr v4, v5

    :cond_b
    and-int/lit16 v5, v4, 0x2493

    const/16 v7, 0x2492

    if-ne v5, v7, :cond_d

    invoke-virtual {v14}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v14}, Lp1/q;->X()V

    goto/16 :goto_17

    :cond_d
    :goto_8
    sget-object v5, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v14, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/Context;

    const v11, 0xc936ec7

    invoke-virtual {v14, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/Context;

    const v11, -0x6837d131

    invoke-virtual {v14, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-nez v11, :cond_e

    if-ne v12, v13, :cond_f

    :cond_e
    const v11, 0x7f01005d

    const v12, 0x7f01005e

    invoke-static {v5, v11, v12}, Landroidx/core/app/ActivityOptionsCompat;->makeCustomAnimation(Landroid/content/Context;II)Landroidx/core/app/ActivityOptionsCompat;

    move-result-object v12

    invoke-virtual {v14, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v12, Landroidx/core/app/ActivityOptionsCompat;

    const/4 v5, 0x0

    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    invoke-static {v12}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    invoke-static {v14}, Lh/g;->a(Landroidx/compose/runtime/Composer;)Lj/k;

    move-result-object v11

    const v15, 0x2ecdb51a

    invoke-virtual {v14, v15}, Lp1/q;->e0(I)V

    if-eqz v11, :cond_1a

    sget-object v11, Lv30/c;->a:Lp1/b0;

    invoke-virtual {v14, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lv30/b;

    const v15, 0x2ecdd511

    invoke-virtual {v14, v15}, Lp1/q;->e0(I)V

    and-int/lit8 v15, v4, 0x70

    if-eq v15, v6, :cond_11

    and-int/lit8 v15, v4, 0x40

    if-eqz v15, :cond_10

    invoke-virtual {v14, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    goto :goto_9

    :cond_10
    move v15, v5

    goto :goto_a

    :cond_11
    :goto_9
    const/4 v15, 0x1

    :goto_a
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v15, :cond_12

    if-ne v6, v13, :cond_13

    :cond_12
    new-instance v6, Luo1/b;

    const/16 v15, 0x1c

    invoke-direct {v6, v8, v15}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    const-string v15, "context"

    invoke-static {v7, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "eventsReporter"

    invoke-static {v11, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "onResult"

    invoke-static {v6, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v15, 0x67db535a

    invoke-virtual {v14, v15}, Lp1/q;->e0(I)V

    sget-object v15, Lv30/f;->a:Lp1/b0;

    invoke-virtual {v14, v15}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lv30/k;

    const v5, -0x277422fb

    invoke-virtual {v14, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v14, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    or-int v5, v5, v17

    invoke-virtual {v14, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    or-int v5, v5, v17

    invoke-virtual {v14, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    or-int v5, v5, v17

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v5, :cond_14

    if-ne v2, v13, :cond_15

    :cond_14
    new-instance v2, Lv30/e;

    invoke-direct {v2, v7, v12, v11, v15}, Lv30/e;-><init>(Landroid/content/Context;Landroidx/core/app/ActivityOptionsCompat;Lv30/b;Lv30/k;)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v2, Lv30/e;

    const/4 v5, 0x0

    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    new-instance v5, Landroidx/activity/result/contract/ActivityResultContracts$StartIntentSenderForResult;

    invoke-direct {v5}, Landroidx/activity/result/contract/ActivityResultContracts$StartIntentSenderForResult;-><init>()V

    const v11, -0x2773ec16

    invoke-virtual {v14, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v14, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_16

    if-ne v12, v13, :cond_17

    :cond_16
    new-instance v12, Lum0/b;

    const/4 v11, 0x5

    invoke-direct {v12, v11, v2, v6}, Lum0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v14, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v12, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    invoke-virtual {v14, v6}, Lp1/q;->q(Z)V

    invoke-static {v5, v12, v14, v6}, Lwb3/f;->a0(Lk/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh/i;

    move-result-object v5

    const v6, -0x2773d8e6

    invoke-virtual {v14, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v6, :cond_19

    if-ne v11, v13, :cond_18

    goto :goto_b

    :cond_18
    move-object v2, v11

    goto :goto_c

    :cond_19
    :goto_b
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "<set-?>"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v2, Lv30/e;->g:Lh/i;

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    check-cast v2, Lv30/e;

    const/4 v5, 0x0

    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_1a
    const/4 v2, 0x0

    :goto_d
    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    const v5, 0x2ecddeee

    invoke-virtual {v14, v5}, Lp1/q;->e0(I)V

    iget-object v5, v8, Lx30/w;->a:Lb5/d;

    if-eqz v5, :cond_1d

    iget-object v6, v5, Lb5/d;->y:Ljava/lang/Object;

    check-cast v6, Landroidx/lifecycle/k1;

    const-string v11, "KEY_HAS_AUTOMATICALLY_LAUNCHED_CARD_SCAN"

    invoke-virtual {v6, v11}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    if-eqz v6, :cond_1b

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto :goto_e

    :cond_1b
    iget-boolean v6, v5, Lb5/d;->w:Z

    :goto_e
    if-nez v6, :cond_1c

    iget-boolean v5, v5, Lb5/d;->x:Z

    if-eqz v5, :cond_1c

    const/4 v5, 0x1

    :goto_f
    const/4 v6, 0x1

    goto :goto_10

    :cond_1c
    const/4 v5, 0x0

    goto :goto_f

    :goto_10
    if-ne v5, v6, :cond_1d

    const/4 v5, 0x1

    goto :goto_11

    :cond_1d
    const/4 v5, 0x0

    :goto_11
    if-eqz v5, :cond_22

    if-eqz v2, :cond_22

    const v5, 0x2ecdeb23

    invoke-virtual {v14, v5}, Lp1/q;->e0(I)V

    and-int/lit8 v5, v4, 0x70

    const/16 v6, 0x20

    if-eq v5, v6, :cond_1f

    and-int/lit8 v5, v4, 0x40

    if-eqz v5, :cond_1e

    invoke-virtual {v14, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1e

    goto :goto_12

    :cond_1e
    const/4 v5, 0x0

    goto :goto_13

    :cond_1f
    :goto_12
    const/4 v5, 0x1

    :goto_13
    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v14, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_20

    if-ne v6, v13, :cond_21

    :cond_20
    new-instance v6, Lre1/k;

    const/16 v5, 0x15

    invoke-direct {v6, v8, v2, v7, v5}, Lre1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v6, Lc93/a;

    const/4 v5, 0x0

    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    invoke-static {v6, v14}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    goto :goto_14

    :cond_22
    const/4 v5, 0x0

    :goto_14
    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v7, v14, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v11, v14, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v14, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-eqz v15, :cond_23

    invoke-virtual {v14, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_23
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_15
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v14, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v14, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v3, v14, Lp1/q;->S:Z

    if-nez v3, :cond_24

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_25

    :cond_24
    invoke-static {v5, v14, v5, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_25
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v14, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Ll0/m;->g:Ll0/h;

    sget-object v8, Lb2/e;->L:Lb2/l;

    const/high16 v11, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/16 v10, 0x36

    invoke-static {v5, v8, v14, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    move-object v8, v1

    iget-wide v0, v14, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {v14, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v11, v14, Lp1/q;->S:Z

    if-eqz v11, :cond_26

    invoke-virtual {v14, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_16

    :cond_26
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_16
    invoke-static {v14, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-nez v1, :cond_27

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    :cond_27
    invoke-static {v0, v14, v0, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_28
    invoke-static {v14, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x7f141059

    invoke-static {v14, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    const v0, -0x2b459aa8

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v13, :cond_29

    new-instance v0, Lwz/h1;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lwz/h1;-><init>(I)V

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    const/4 v6, 0x1

    invoke-static {v9, v6, v0}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/4 v15, 0x0

    const/16 v16, 0x4

    const/4 v13, 0x0

    move v10, v6

    const/4 v0, 0x0

    invoke-static/range {v11 .. v16}, Lcom/squareup/wire/n;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    and-int/lit8 v1, v4, 0xe

    or-int/lit8 v3, v1, 0x40

    move/from16 v5, p0

    invoke-static {v5, v2, v14, v3}, Ls2/h;->c(ZLv30/e;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    const/16 v2, 0x8

    int-to-float v2, v2

    const/16 v21, 0x0

    const/16 v22, 0xd

    const/16 v18, 0x0

    const/16 v20, 0x0

    move/from16 v19, v2

    move-object/from16 v17, v9

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v3, Lg40/w2;

    sget-object v6, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "credit_details"

    invoke-static {v6}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    new-instance v9, La33/d;

    iget-object v8, v8, Lx30/v;->c:Lx30/t;

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-direct {v9, v8, v0}, La33/d;-><init>(Ljava/util/List;Lzy/c;)V

    invoke-direct {v3, v6, v7, v9}, Lg40/w2;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;La33/d;)V

    or-int/lit16 v0, v1, 0x6040

    and-int/lit16 v1, v4, 0x380

    or-int/2addr v0, v1

    sget v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v1, v1, 0x9

    or-int/2addr v0, v1

    and-int/lit16 v1, v4, 0x1c00

    or-int v6, v0, v1

    const/4 v7, 0x0

    move-object v4, v2

    move-object v1, v3

    move v0, v5

    move-object v5, v14

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-static/range {v0 .. v7}, Lkotlin/jvm/internal/j;->p(ZLg40/w2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    :goto_17
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_2a

    new-instance v0, Lb30/j2;

    const/16 v7, 0x14

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lb30/j2;-><init>(ZLg40/z2;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/Modifier;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_2a
    return-void
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;)Lvv/b;
    .locals 9

    new-instance v0, Lvv/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lvv/a;->a:Z

    const v1, 0x800053

    iput v1, v0, Lvv/a;->b:I

    const/high16 v1, 0x40800000    # 4.0f

    iput v1, v0, Lvv/a;->c:F

    iput v1, v0, Lvv/a;->d:F

    iput v1, v0, Lvv/a;->e:F

    iput v1, v0, Lvv/a;->f:F

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lvv/b;

    iget-boolean v8, v0, Lvv/a;->a:Z

    iget v7, v0, Lvv/a;->b:I

    iget v3, v0, Lvv/a;->c:F

    iget v4, v0, Lvv/a;->d:F

    iget v5, v0, Lvv/a;->e:F

    iget v6, v0, Lvv/a;->f:F

    invoke-direct/range {v2 .. v8}, Lvv/b;-><init>(FFFFIZ)V

    return-object v2
.end method

.method public static d(Lcom/google/android/gms/tasks/Task;Ls83/c;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->isComplete()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lbc3/m;

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance p1, Leu/f;

    const/16 v1, 0x9

    invoke-direct {p1, v0, v1}, Leu/f;-><init>(Lbc3/m;I)V

    sget-object v1, Lt40/b;->w:Lt40/b;

    invoke-virtual {p0, v1, p1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcq/d;)Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static e([B)[B
    .locals 6

    array-length v0, p0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_2

    new-array v0, v1, [B

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/16 v4, 0xf

    if-ge v3, v1, :cond_1

    aget-byte v5, p0, v3

    shl-int/lit8 v5, v5, 0x1

    and-int/lit16 v5, v5, 0xfe

    int-to-byte v5, v5

    aput-byte v5, v0, v3

    if-ge v3, v4, :cond_0

    add-int/lit8 v4, v3, 0x1

    aget-byte v4, p0, v4

    shr-int/lit8 v4, v4, 0x7

    and-int/lit8 v4, v4, 0x1

    int-to-byte v4, v4

    or-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v0, v3

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    aget-byte v1, v0, v4

    aget-byte p0, p0, v2

    shr-int/lit8 p0, p0, 0x7

    and-int/lit16 p0, p0, 0x87

    int-to-byte p0, p0

    xor-int/2addr p0, v1

    int-to-byte p0, p0

    aput-byte p0, v0, v4

    return-object v0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "value must be a block."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f(I[B)Landroid/graphics/Bitmap;
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v1, p0, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance p0, Ljava/io/ByteArrayInputStream;

    invoke-direct {p0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    :try_start_0
    new-instance p1, Lk6/g;

    invoke-direct {p1, p0}, Lk6/g;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    invoke-virtual {p1}, Lk6/g;->l()I

    move-result p0

    if-eqz p0, :cond_0

    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    int-to-float p0, p0

    invoke-virtual {v7, p0}, Landroid/graphics/Matrix;->postRotate(F)Z

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v8}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v2

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object p0, v0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    const-string p1, "Could not decode image data"

    invoke-static {p0, p1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object p0

    throw p0
.end method

.method public static final g(Lvg/l;)Ljava/lang/String;
    .locals 2

    const-string v0, "platformEnvironProvider"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lyd/f;->n:Ljf/a;

    invoke-static {v0, p0}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_0

    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "aws-sdk-kotlin-"

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v0, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v0

    invoke-static {v0}, Lug/c;->b(Lug/b;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final h(Ljg/b;)Lre/c0;
    .locals 9

    new-instance v0, Lq30/w0;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lq30/w0;-><init>(IB)V

    new-instance v1, Lhg/i;

    sget-object v3, Lhg/l;->i:Lhg/l;

    new-instance v4, Ljg/e;

    const-string v5, "AttributeName"

    invoke-direct {v4, v5}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v5, 0x1

    new-array v6, v5, [Lhg/d;

    aput-object v4, v6, v2

    invoke-static {v6}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v1, v3, v4, v2}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v4, Lhg/i;

    sget-object v6, Lhg/l;->d:Lhg/l;

    new-instance v7, Ljg/e;

    const-string v8, "DeliveryMedium"

    invoke-direct {v7, v8}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v5, [Lhg/d;

    aput-object v7, v8, v2

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    invoke-direct {v4, v6, v7, v2}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v6, Lhg/i;

    new-instance v7, Ljg/e;

    const-string v8, "Destination"

    invoke-direct {v7, v8}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v5, v5, [Lhg/d;

    aput-object v7, v5, v2

    invoke-static {v5}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    invoke-direct {v6, v3, v5, v2}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v2, Lxl/a;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lxl/a;-><init>(I)V

    invoke-virtual {v2, v1}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v2, v4}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v2, v6}, Lxl/a;->p(Lhg/i;)V

    invoke-static {v2, p0}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v2

    iget v3, v1, Lhg/i;->b:I

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v3, :cond_1

    invoke-interface {p0}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lq30/w0;->x:Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    iget v3, v4, Lhg/i;->b:I

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v3, :cond_3

    invoke-interface {p0}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v2

    sget v3, Lre/g0;->a:I

    invoke-static {v2}, Lvp/c;->K(Ljava/lang/String;)Lre/g0;

    move-result-object v2

    iput-object v2, v0, Lq30/w0;->y:Ljava/lang/Object;

    goto :goto_0

    :cond_3
    :goto_2
    iget v3, v6, Lhg/i;->b:I

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v3, :cond_5

    invoke-interface {p0}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lq30/w0;->z:Ljava/lang/Object;

    goto :goto_0

    :cond_5
    :goto_3
    if-eqz v2, :cond_6

    invoke-interface {p0}, Lhg/c;->skipValue()V

    goto :goto_0

    :cond_6
    new-instance p0, Lre/c0;

    invoke-direct {p0, v0}, Lre/c0;-><init>(Lq30/w0;)V

    return-object p0
.end method

.method public static i(I)B
    .locals 8

    const/16 v0, 0x1a

    invoke-static {p0, v0}, Lrs/b;->o(II)I

    move-result v0

    const/16 v1, 0x19

    invoke-static {p0, v1}, Lrs/b;->n(II)I

    move-result v1

    const/16 v2, 0x34

    invoke-static {p0, v2}, Lrs/b;->o(II)I

    move-result v2

    and-int/2addr v1, v2

    const/16 v2, 0x33

    invoke-static {p0, v2}, Lrs/b;->n(II)I

    move-result v2

    const/16 v3, 0x3e

    invoke-static {p0, v3}, Lrs/b;->o(II)I

    move-result v4

    and-int/2addr v2, v4

    invoke-static {p0, v3}, Lrs/b;->m(II)I

    move-result v3

    const/16 v4, 0x3f

    invoke-static {p0, v4}, Lrs/b;->m(II)I

    move-result v4

    add-int/lit8 v5, p0, 0x41

    add-int/lit8 v6, p0, 0x47

    add-int/lit8 p0, p0, -0x4

    const/4 v7, 0x0

    invoke-static {v0, v5, v7}, Lrs/b;->p(III)I

    move-result v0

    invoke-static {v1, v6, v7}, Lrs/b;->p(III)I

    move-result v1

    or-int/2addr v0, v1

    invoke-static {v2, p0, v7}, Lrs/b;->p(III)I

    move-result p0

    or-int/2addr p0, v0

    const/16 v0, 0x2d

    invoke-static {v3, v0, v7}, Lrs/b;->p(III)I

    move-result v0

    or-int/2addr p0, v0

    const/16 v0, 0x5f

    invoke-static {v4, v0, v7}, Lrs/b;->p(III)I

    move-result v0

    or-int/2addr p0, v0

    int-to-byte p0, p0

    return p0
.end method

.method public static final j(Ldg/a;)Luf/t;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Luf/i;->a:Lgf/a;

    sget-object v0, Luf/i;->g:Lgf/a;

    invoke-virtual {p0, v0}, Ldg/a;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Luf/t;

    if-nez p0, :cond_0

    sget-object p0, Luf/t;->n:Luf/t;

    sget-object p0, Luf/t;->n:Luf/t;

    :cond_0
    return-object p0
.end method

.method public static varargs k(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 9

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    aget-object v2, p1, v1

    if-nez v2, :cond_0

    const-string v2, "null"

    goto :goto_1

    :cond_0
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x40

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "com.google.common.base.Strings"

    invoke-static {v4}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v4

    sget-object v5, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Exception during lenientFormat for "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v4, "<"

    const-string v5, " threw "

    invoke-static {v4, v2, v5}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ">"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1
    aput-object v2, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    array-length v3, p1

    mul-int/lit8 v3, v3, 0x10

    add-int/2addr v3, v2

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    move v2, v0

    :goto_2
    array-length v3, p1

    if-ge v0, v3, :cond_3

    const-string v3, "%s"

    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v1, p0, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v0, 0x1

    aget-object v0, p1, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v3, 0x2

    move v8, v2

    move v2, v0

    move v0, v8

    goto :goto_2

    :cond_3
    :goto_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v1, p0, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    array-length p0, p1

    if-ge v0, p0, :cond_5

    const-string p0, " ["

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p0, v0, 0x1

    aget-object v0, p1, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_4
    array-length v0, p1

    if-ge p0, v0, :cond_4

    const-string v0, ", "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, p0, 0x1

    aget-object p0, p1, p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move p0, v0

    goto :goto_4

    :cond_4
    const/16 p0, 0x5d

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_5
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string v0, "Task was canceled"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p0

    if-nez p0, :cond_2

    new-instance p0, Ljava/lang/Exception;

    const-string v0, "Unknown error occurred"

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    :cond_2
    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    return-object p0
.end method

.method public static m(II)I
    .locals 0

    xor-int/2addr p0, p1

    add-int/lit8 p1, p0, -0x1

    not-int p0, p0

    and-int/2addr p0, p1

    ushr-int/lit8 p0, p0, 0x3f

    return p0
.end method

.method public static n(II)I
    .locals 2

    int-to-long v0, p1

    int-to-long p0, p0

    sub-long/2addr v0, p0

    const/16 p0, 0x3f

    ushr-long p0, v0, p0

    long-to-int p0, p0

    return p0
.end method

.method public static o(II)I
    .locals 2

    int-to-long v0, p0

    int-to-long p0, p1

    sub-long/2addr v0, p0

    const/16 p0, 0x3f

    ushr-long p0, v0, p0

    long-to-int p0, p0

    return p0
.end method

.method public static p(III)I
    .locals 0

    add-int/lit8 p0, p0, -0x1

    xor-int/2addr p2, p1

    and-int/2addr p0, p2

    xor-int/2addr p0, p1

    return p0
.end method
