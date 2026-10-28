.class public abstract Lrg/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ZLx30/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 36

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "element"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v2, Lx30/c;->b:Ljava/lang/String;

    move-object/from16 v15, p3

    check-cast v15, Lp1/q;

    const v1, -0x4891d860

    invoke-virtual {v15, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v4, 0x6

    move/from16 v11, p0

    if-nez v1, :cond_1

    invoke-virtual {v15, v11}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v4

    goto :goto_1

    :cond_1
    move v1, v4

    :goto_1
    and-int/lit8 v3, v4, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit16 v3, v4, 0x180

    if-nez v3, :cond_5

    move-object/from16 v3, p2

    invoke-virtual {v15, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v1, v5

    goto :goto_4

    :cond_5
    move-object/from16 v3, p2

    :goto_4
    and-int/lit16 v5, v1, 0x93

    const/16 v6, 0x92

    if-ne v5, v6, :cond_7

    invoke-virtual {v15}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v15}, Lp1/q;->X()V

    goto/16 :goto_9

    :cond_7
    :goto_5
    sget-object v5, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v15, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const-string v7, "getResources(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v7, 0x7f140fae

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    const-string v7, "getString(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "<img/>\u00a0<b>\u24d8</b>"

    const-string v8, "<img/>"

    const/4 v9, 0x0

    invoke-static {v6, v8, v7, v9}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v6

    const-string v7, "<img src=\"afterpay\"/>"

    invoke-static {v6, v8, v7, v9}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lp40/a;

    const-string v8, "GBP"

    invoke-virtual {v8, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_8

    const v10, 0x7f0807c5

    goto :goto_6

    :cond_8
    const v10, 0x7f0807a4

    :goto_6
    invoke-virtual {v8, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    const v0, 0x7f1410a1

    goto :goto_7

    :cond_9
    const v0, 0x7f141095

    :goto_7
    invoke-static {v15}, Lg1/l3;->a(Landroidx/compose/runtime/Composer;)Lg1/c1;

    move-result-object v8

    invoke-virtual {v8}, Lg1/c1;->h()J

    move-result-wide v12

    invoke-static {v12, v13}, Ld40/r;->p(J)Z

    move-result v8

    if-eqz v8, :cond_a

    const/4 v8, 0x0

    goto :goto_8

    :cond_a
    sget-wide v12, Li2/x;->f:J

    new-instance v8, Li2/p;

    const/4 v14, 0x5

    invoke-direct {v8, v12, v13, v14}, Li2/p;-><init>(JI)V

    :goto_8
    invoke-direct {v7, v10, v0, v8}, Lp40/a;-><init>(IILi2/p;)V

    new-instance v0, Ll83/k;

    const-string v8, "afterpay"

    invoke-direct {v0, v8, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v7

    invoke-static {v15}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v0

    iget-wide v12, v0, Ld40/n;->e:J

    invoke-static {v15}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v0

    iget-object v10, v0, Lg1/h9;->f:Ll3/v0;

    new-instance v16, Ll3/m0;

    const/16 v34, 0x0

    const v35, 0xffff

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v16 .. v35}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    const v0, 0x63a4f501

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v0, v8

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v0, :cond_b

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v8, v0, :cond_c

    :cond_b
    new-instance v8, Lwr0/r;

    const/4 v0, 0x5

    invoke-direct {v8, v0, v2, v5}, Lwr0/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v15, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v14, v8

    check-cast v14, Lc93/a;

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    shr-int/lit8 v0, v1, 0x3

    and-int/lit8 v0, v0, 0x70

    const/high16 v5, 0x180000

    or-int/2addr v0, v5

    shl-int/lit8 v1, v1, 0xf

    const/high16 v5, 0x70000

    and-int/2addr v1, v5

    or-int/2addr v0, v1

    const/16 v17, 0x0

    move-wide v8, v12

    const/4 v13, 0x3

    move-object v5, v6

    move-object/from16 v12, v16

    move/from16 v16, v0

    move-object v6, v3

    invoke-static/range {v5 .. v17}, Lup/d;->d(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLl3/v0;ZLl3/m0;ILc93/a;Landroidx/compose/runtime/Composer;II)V

    :goto_9
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_d

    new-instance v0, Lsg2/o;

    const/4 v5, 0x7

    move/from16 v1, p0

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v5}, Lsg2/o;-><init>(ZLjava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method public static final b(Lv20/r;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    check-cast p1, Lp1/q;

    const v0, -0x7f32b257

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    and-int/lit8 v0, v0, 0x3

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    move-object v6, p0

    goto :goto_5

    :cond_2
    :goto_1
    invoke-virtual {p1}, Lp1/q;->Z()V

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lp1/q;->X()V

    :cond_4
    :goto_2
    invoke-virtual {p1}, Lp1/q;->r()V

    iget-object v0, p0, Lv20/r;->y:Lec3/r1;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv20/s;

    const v2, -0x3e671024

    invoke-virtual {p1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_6

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_5

    goto :goto_3

    :cond_5
    move-object v6, p0

    goto :goto_4

    :cond_6
    :goto_3
    new-instance v4, Lv20/g;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v5, 0x1

    const-class v7, Lv20/r;

    const-string v8, "handleViewAction"

    const-string v9, "handleViewAction(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationViewAction;)V"

    move-object v6, p0

    invoke-direct/range {v4 .. v11}, Lv20/g;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {p1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v4

    :goto_4
    check-cast v3, Lj93/g;

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 p0, 0x0

    invoke-static {v0, v3, p0, p1, v1}, Lrg/a;->c(Lv20/s;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_5
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_7

    new-instance p1, Ltx0/a;

    const/16 v0, 0x11

    invoke-direct {p1, v6, p2, v0}, Ltx0/a;-><init>(Ljava/lang/Object;II)V

    iput-object p1, p0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final c(Lv20/s;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p4

    const-string v3, "state"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "viewActionHandler"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p3

    check-cast v7, Lp1/q;

    const v3, -0x465837ac

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x2

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v2

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    const/16 v6, 0x10

    if-eqz v5, :cond_1

    const/16 v5, 0x20

    goto :goto_1

    :cond_1
    move v5, v6

    :goto_1
    or-int/2addr v3, v5

    or-int/lit16 v3, v3, 0x180

    and-int/lit16 v5, v3, 0x93

    const/16 v8, 0x92

    if-ne v5, v8, :cond_3

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object/from16 v12, p2

    goto/16 :goto_10

    :cond_3
    :goto_2
    sget-object v5, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v5

    sget-object v10, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v7, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg1/c1;

    invoke-virtual {v8}, Lg1/c1;->h()J

    move-result-wide v8

    sget-object v11, Li2/w0;->a:Li2/v0;

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v8, v9, v11}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v5, v8}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v6, v6

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x6

    invoke-static {v6, v8, v7, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v13, v7, Lp1/q;->S:Z

    if-eqz v13, :cond_4

    invoke-virtual {v7, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_3
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v7, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v7, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v14, v7, Lp1/q;->S:Z

    if-nez v14, :cond_5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_6

    :cond_5
    invoke-static {v8, v7, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v7, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v5, 0x7f141063

    invoke-static {v7, v5}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    int-to-float v4, v4

    const/16 v17, 0x7

    move-object v14, v13

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v24, v16

    move/from16 v16, v4

    move-object/from16 v4, v24

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/16 v14, 0x30

    const/4 v15, 0x0

    invoke-static {v5, v13, v7, v14, v15}, Ls/s;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v14, v4

    iget-object v4, v0, Lv20/s;->a:Ljava/lang/String;

    iget-object v5, v0, Lv20/s;->b:Ljava/lang/String;

    move-object v13, v6

    iget-object v6, v0, Lv20/s;->c:Ljava/lang/String;

    move-object/from16 v16, v8

    move-object v8, v7

    iget-object v7, v0, Lv20/s;->d:Ljava/lang/String;

    move-object/from16 v17, v9

    const/4 v9, 0x0

    move-object/from16 v19, v16

    move-object/from16 v18, v17

    invoke-static/range {v4 .. v9}, Lrg/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move-object v7, v8

    iget-object v4, v0, Lv20/s;->a:Ljava/lang/String;

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const v5, 0x7f14105f

    invoke-static {v5, v4, v7}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x0

    const/4 v9, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lrg/a;->f(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    iget-object v4, v0, Lv20/s;->e:Lzy/b;

    invoke-static {v4, v7}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const v5, 0x7f141066

    invoke-static {v5, v4, v7}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static/range {v4 .. v9}, Lrg/a;->f(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    sget-object v4, Ll0/m;->a:Ll0/e;

    sget-object v5, Lb2/e;->J:Lb2/l;

    invoke-static {v4, v5, v7, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_7

    invoke-virtual {v7, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v7, v14, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-nez v4, :cond_8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    :cond_8
    move-object/from16 v4, v18

    goto :goto_6

    :cond_9
    move-object/from16 v4, v18

    :goto_5
    move-object/from16 v5, v19

    goto :goto_7

    :goto_6
    invoke-static {v5, v7, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_5

    :goto_7
    invoke-static {v7, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v6, v0, Lv20/s;->g:Lzy/b;

    invoke-static {v6, v7}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const v8, 0x7f141067

    invoke-static {v8, v6, v7}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v6

    const v8, 0x3f19999a    # 0.6f

    move/from16 v16, v3

    move-object/from16 v17, v4

    float-to-double v3, v8

    const-wide/16 v18, 0x0

    cmpl-double v3, v3, v18

    const-string v20, "invalid weight; must be greater than zero"

    if-lez v3, :cond_a

    :goto_8
    move-object v3, v5

    goto :goto_9

    :cond_a
    invoke-static/range {v20 .. v20}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_8

    :goto_9
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v21, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v4, v8, v21

    if-lez v4, :cond_b

    move/from16 v8, v21

    :cond_b
    const/4 v4, 0x1

    invoke-direct {v5, v8, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v8, 0x180

    const/4 v9, 0x0

    move/from16 v22, v4

    move-object v4, v6

    const/4 v6, 0x1

    move-object/from16 v23, v3

    move-object/from16 v3, v17

    move/from16 v15, v22

    invoke-static/range {v4 .. v9}, Lrg/a;->f(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    const v4, 0x3ecccccd    # 0.4f

    float-to-double v5, v4

    cmpl-double v5, v5, v18

    if-lez v5, :cond_c

    goto :goto_a

    :cond_c
    invoke-static/range {v20 .. v20}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v6, v4, v21

    if-lez v6, :cond_d

    move/from16 v4, v21

    :cond_d
    invoke-direct {v5, v4, v15}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v4, Lb2/e;->F:Lb2/m;

    const/4 v6, 0x0

    invoke-static {v4, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_e

    invoke-virtual {v7, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_e
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v7, v14, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-nez v4, :cond_10

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    goto :goto_d

    :cond_f
    :goto_c
    move-object/from16 v3, v23

    goto :goto_e

    :cond_10
    :goto_d
    invoke-static {v6, v7, v6, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_c

    :goto_e
    invoke-static {v7, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v7, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/c1;

    invoke-virtual {v3}, Lg1/c1;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, Ld40/r;->p(J)Z

    move-result v3

    if-eqz v3, :cond_11

    sget-wide v3, Li2/x;->b:J

    goto :goto_f

    :cond_11
    sget-wide v3, Li2/x;->f:J

    :goto_f
    const v5, 0x7f08079c

    const/4 v6, 0x0

    invoke-static {v5, v7, v6}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v5

    const/high16 v6, 0x3f000000    # 0.5f

    invoke-static {v6, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v3

    const/16 v10, 0x30

    const/4 v11, 0x4

    move-object v9, v7

    move-wide v7, v3

    move-object v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v11}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v7, v9

    invoke-virtual {v7, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v15}, Lp1/q;->q(Z)V

    iget-object v3, v0, Lv20/s;->f:Lzy/b;

    invoke-static {v3, v7}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v4

    const/16 v8, 0x180

    const/4 v9, 0x2

    const/4 v6, 0x1

    invoke-static/range {v4 .. v9}, Lrg/a;->f(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    shr-int/lit8 v3, v16, 0x3

    and-int/lit8 v3, v3, 0xe

    invoke-static {v1, v7, v3}, Lrg/a;->g(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v3, 0x0

    const/4 v6, 0x0

    invoke-static {v3, v6, v7, v15}, Lds/p;->e(FILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v15}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_12

    new-instance v4, Ljp1/k;

    invoke-direct {v4, v0, v1, v12, v2}, Ljp1/k;-><init>(Lv20/s;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;I)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public static final d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    const-string v0, "email"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameOnAccount"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sortCode"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accountNumber"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v5, 0x5d2a54f6

    invoke-virtual {v0, v5}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int v5, p5, v5

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/16 v6, 0x20

    goto :goto_1

    :cond_1
    const/16 v6, 0x10

    :goto_1
    or-int/2addr v5, v6

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x100

    goto :goto_2

    :cond_2
    const/16 v6, 0x80

    :goto_2
    or-int/2addr v5, v6

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x800

    goto :goto_3

    :cond_3
    const/16 v6, 0x400

    :goto_3
    or-int/2addr v5, v6

    and-int/lit16 v6, v5, 0x493

    const/16 v7, 0x492

    if-ne v6, v7, :cond_5

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Lp1/q;->X()V

    goto/16 :goto_7

    :cond_5
    :goto_4
    invoke-static {v0}, Lg1/l3;->b(Landroidx/compose/runtime/Composer;)Lg1/l5;

    move-result-object v6

    iget-object v6, v6, Lg1/l5;->a:Lt0/a;

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v8, 0x1

    int-to-float v9, v8

    invoke-static {v0}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v10

    iget-wide v10, v10, Ld40/n;->b:J

    invoke-static {v9, v10, v11}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v9

    invoke-static {v0}, Lg1/l3;->b(Landroidx/compose/runtime/Composer;)Lg1/l5;

    move-result-object v10

    iget-object v10, v10, Lg1/l5;->a:Lt0/a;

    iget v11, v9, Lf0/t;->a:F

    iget-object v9, v9, Lf0/t;->b:Li2/t;

    invoke-static {v11, v6, v9, v10}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v0}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v9

    iget-wide v9, v9, Ld40/n;->a:J

    sget-object v11, Li2/w0;->a:Li2/v0;

    invoke-static {v6, v9, v10, v11}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v9, 0xc

    int-to-float v9, v9

    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v9, Lb2/e;->w:Lb2/m;

    const/4 v10, 0x0

    invoke-static {v9, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v10, v0, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v0, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-eqz v13, :cond_6

    invoke-virtual {v0, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_5
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v0, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v0, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-nez v14, :cond_7

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_8

    :cond_7
    invoke-static {v10, v0, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v0, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v6, 0xa

    int-to-float v6, v6

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v14, Lb2/e;->M:Lb2/k;

    const/4 v15, 0x6

    invoke-static {v6, v14, v0, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move-object v14, v9

    iget-wide v8, v0, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v0, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v0}, Lp1/q;->i0()V

    move/from16 v16, v15

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_9

    invoke-virtual {v0, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v0, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v0, Lp1/q;->S:Z

    if-nez v6, :cond_a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    :cond_a
    invoke-static {v8, v0, v8, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v0, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v6, 0x7f140ff5

    invoke-static {v0, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    shl-int/lit8 v7, v5, 0x3

    and-int/lit8 v7, v7, 0x70

    const/4 v8, 0x0

    invoke-static {v6, v1, v8, v0, v7}, Lrg/a;->e(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const v6, 0x7f140fb3

    invoke-static {v0, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    and-int/lit8 v7, v5, 0x70

    invoke-static {v6, v2, v8, v0, v7}, Lrg/a;->e(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const v6, 0x7f140fbb

    invoke-static {v0, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    shr-int/lit8 v7, v5, 0x3

    and-int/lit8 v7, v7, 0x70

    invoke-static {v6, v3, v8, v0, v7}, Lrg/a;->e(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const v6, 0x7f140fb7

    invoke-static {v0, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    shr-int/lit8 v5, v5, 0x6

    and-int/lit8 v5, v5, 0x70

    invoke-static {v6, v4, v8, v0, v5}, Lrg/a;->e(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 v5, 0x1

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_c

    new-instance v0, Lo71/b;

    const/16 v6, 0x8

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lo71/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static final e(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "label"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "value"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    const v3, 0x59543e37

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p4, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p4, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p4

    :goto_1
    and-int/lit8 v4, p4, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    or-int/lit16 v3, v3, 0x180

    and-int/lit16 v4, v3, 0x93

    const/16 v5, 0x92

    if-ne v4, v5, :cond_5

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v2}, Lp1/q;->X()V

    move-object/from16 v3, p2

    move-object v0, v2

    goto/16 :goto_7

    :cond_5
    :goto_3
    sget-object v4, Lb2/e;->K:Lb2/l;

    sget-object v5, Ll0/m;->a:Ll0/e;

    const/16 v6, 0x30

    invoke-static {v5, v4, v2, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v5, v2, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v10, v2, Lp1/q;->S:Z

    if-eqz v10, :cond_6

    invoke-virtual {v2, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_4
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v2, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v2, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v2, Lp1/q;->S:Z

    if-nez v6, :cond_7

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    :cond_7
    invoke-static {v5, v2, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v2, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, 0x3ecccccd    # 0.4f

    float-to-double v5, v4

    const-wide/16 v25, 0x0

    cmpl-double v5, v5, v25

    const-string v27, "invalid weight; must be greater than zero"

    if-lez v5, :cond_9

    goto :goto_5

    :cond_9
    invoke-static/range {v27 .. v27}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v28, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v5, v4, v28

    if-lez v5, :cond_a

    move/from16 v4, v28

    :cond_a
    const/4 v5, 0x1

    invoke-direct {v1, v4, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move-object v4, v7

    new-instance v7, Lp3/r;

    invoke-static {v2}, Ld40/r;->m(Landroidx/compose/runtime/Composer;)Ld40/s;

    move-result-object v6

    iget v6, v6, Ld40/s;->b:I

    invoke-direct {v7, v6}, Lp3/r;-><init>(I)V

    invoke-static {v2}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v6

    iget-wide v8, v6, Ld40/n;->d:J

    and-int/lit8 v22, v3, 0xe

    const/16 v23, 0x0

    const v24, 0x1ffd8

    move-object v10, v4

    move v6, v5

    const-wide/16 v4, 0x0

    move v11, v6

    const/4 v6, 0x0

    move-object/from16 v21, v2

    move-wide/from16 v32, v8

    move v9, v3

    move-wide/from16 v2, v32

    const/4 v8, 0x0

    move v12, v9

    move-object v13, v10

    const-wide/16 v9, 0x0

    move v14, v11

    const/4 v11, 0x0

    move v15, v12

    const/4 v12, 0x0

    move-object/from16 v17, v13

    move/from16 v16, v14

    const-wide/16 v13, 0x0

    move/from16 v18, v15

    const/4 v15, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v29, v18

    const/16 v18, 0x0

    move/from16 v30, v19

    const/16 v19, 0x0

    move-object/from16 v31, v20

    const/16 v20, 0x0

    invoke-static/range {v0 .. v24}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    const v0, 0x3f19999a    # 0.6f

    float-to-double v1, v0

    cmpl-double v1, v1, v25

    if-lez v1, :cond_b

    goto :goto_6

    :cond_b
    invoke-static/range {v27 .. v27}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v2, v0, v28

    if-lez v2, :cond_c

    move/from16 v0, v28

    :cond_c
    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    new-instance v7, Lp3/r;

    invoke-static/range {v21 .. v21}, Ld40/r;->m(Landroidx/compose/runtime/Composer;)Ld40/s;

    move-result-object v0

    iget v0, v0, Ld40/s;->a:I

    invoke-direct {v7, v0}, Lp3/r;-><init>(I)V

    invoke-static/range {v21 .. v21}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v0

    iget-wide v3, v0, Ld40/n;->d:J

    shr-int/lit8 v0, v29, 0x3

    and-int/lit8 v22, v0, 0xe

    const/16 v23, 0x0

    const v24, 0x1ffd8

    move v11, v2

    move-wide v2, v3

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    move v14, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v30, v14

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v0, p1

    invoke-static/range {v0 .. v24}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v21

    const/4 v11, 0x1

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    move-object/from16 v3, v31

    :goto_7
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_d

    new-instance v0, Ls01/e;

    const/16 v5, 0x1b

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ls01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/Modifier;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method public static final f(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V
    .locals 36

    move-object/from16 v0, p0

    move/from16 v13, p4

    const-string v1, "text"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v1, 0x63fea9bf

    invoke-virtual {v10, v1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v13

    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_1

    or-int/lit8 v1, v1, 0x30

    move-object/from16 v3, p1

    goto :goto_2

    :cond_1
    move-object/from16 v3, p1

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_1

    :cond_2
    const/16 v4, 0x10

    :goto_1
    or-int/2addr v1, v4

    :goto_2
    and-int/lit8 v4, p5, 0x4

    if-eqz v4, :cond_4

    or-int/lit16 v1, v1, 0x180

    :cond_3
    move/from16 v5, p2

    goto :goto_4

    :cond_4
    and-int/lit16 v5, v13, 0x180

    if-nez v5, :cond_3

    move/from16 v5, p2

    invoke-virtual {v10, v5}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_3

    :cond_5
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v1, v6

    :goto_4
    and-int/lit16 v6, v1, 0x93

    const/16 v7, 0x92

    if-ne v6, v7, :cond_7

    invoke-virtual {v10}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v2, v3

    move v3, v5

    goto/16 :goto_9

    :cond_7
    :goto_5
    if-eqz v2, :cond_8

    sget-object v2, Lb2/t;->w:Lb2/t;

    goto :goto_6

    :cond_8
    move-object v2, v3

    :goto_6
    const/4 v14, 0x0

    if-eqz v4, :cond_9

    move v15, v14

    goto :goto_7

    :cond_9
    move v15, v5

    :goto_7
    const/4 v3, 0x1

    if-ne v15, v3, :cond_a

    const v3, 0x5fc51f6d

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-static {v10}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v3

    iget-object v3, v3, Lg1/h9;->l:Ll3/v0;

    sget-object v21, Lp3/r;->F:Lp3/r;

    const/16 v29, 0x0

    const v30, 0xfffffb

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v16, v3

    invoke-static/range {v16 .. v30}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v5

    invoke-static {v10}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v3

    iget-wide v3, v3, Ld40/n;->e:J

    new-instance v16, Ll3/m0;

    invoke-static {v10}, Lg1/l3;->a(Landroidx/compose/runtime/Composer;)Lg1/c1;

    move-result-object v6

    invoke-virtual {v6}, Lg1/c1;->f()J

    move-result-wide v17

    const/16 v34, 0x0

    const v35, 0xfffe

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v16 .. v35}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    and-int/lit8 v11, v1, 0x7e

    const/16 v12, 0x1a4

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v7, v16

    invoke-static/range {v0 .. v12}, Lup/d;->d(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLl3/v0;ZLl3/m0;ILc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v1

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    move/from16 v25, v15

    goto :goto_8

    :cond_a
    if-nez v15, :cond_c

    const v0, 0x5fca4797

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-static {v10}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v0

    iget-object v0, v0, Lg1/h9;->l:Ll3/v0;

    sget-object v21, Lp3/r;->F:Lp3/r;

    const/16 v29, 0x0

    const v30, 0xfffffb

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v16, v0

    invoke-static/range {v16 .. v30}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v20

    invoke-static {v10}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v0

    iget-wide v3, v0, Ld40/n;->e:J

    and-int/lit8 v22, v1, 0x7e

    const/16 v23, 0x0

    const v24, 0xfff8

    move-object v1, v2

    move-wide v2, v3

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v21, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v0, v14

    const-wide/16 v13, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v25, v19

    const/16 v19, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v24}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v21

    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_8
    move-object v2, v1

    move/from16 v3, v25

    :goto_9
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_b

    new-instance v0, Lg40/j1;

    const/4 v6, 0x2

    move-object/from16 v1, p0

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lg40/j1;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZIII)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void

    :cond_c
    move v0, v14

    const v1, 0x76b3c449

    invoke-static {v1, v10, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    check-cast p1, Lp1/q;

    const v0, 0x505437f3

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x6

    const/4 v1, 0x2

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    goto :goto_1

    :cond_1
    move v0, p2

    :goto_1
    and-int/lit8 v3, v0, 0x3

    if-ne v3, v1, :cond_3

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lp1/q;->X()V

    goto/16 :goto_6

    :cond_3
    :goto_2
    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/4 v4, 0x6

    invoke-static {v1, v3, p1, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v5, p1, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v8, p1, Lp1/q;->S:Z

    if-eqz v8, :cond_4

    invoke-virtual {p1, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_3
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {p1, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {p1, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, p1, Lp1/q;->S:Z

    if-nez v5, :cond_5

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v3, p1, v3, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {p1, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lv20/a;->w:Lv20/a;

    const v3, 0x7f14107c

    invoke-static {p1, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    const v5, 0x35a17821

    invoke-virtual {p1, v5}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v0, 0xe

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-ne v0, v2, :cond_7

    move v7, v5

    goto :goto_4

    :cond_7
    move v7, v6

    :goto_4
    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-nez v7, :cond_8

    if-ne v8, v9, :cond_9

    :cond_8
    new-instance v8, Luf0/e;

    const/16 v7, 0x8

    invoke-direct {v8, p0, v7}, Luf0/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p1, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v8, Lc93/a;

    invoke-virtual {p1, v6}, Lp1/q;->q(Z)V

    invoke-static {v1, v3, v8, p1, v4}, Lsc3/l;->b(Lv20/a;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Lv20/a;->x:Lv20/a;

    const v3, 0x7f141064

    invoke-static {p1, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    const v7, 0x35a1a007

    invoke-virtual {p1, v7}, Lp1/q;->e0(I)V

    if-ne v0, v2, :cond_a

    move v0, v5

    goto :goto_5

    :cond_a
    move v0, v6

    :goto_5
    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_b

    if-ne v2, v9, :cond_c

    :cond_b
    new-instance v2, Luf0/e;

    const/16 v0, 0x9

    invoke-direct {v2, p0, v0}, Luf0/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v2, Lc93/a;

    invoke-virtual {p1, v6}, Lp1/q;->q(Z)V

    invoke-static {v1, v3, v2, p1, v4}, Lsc3/l;->b(Lv20/a;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v5}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_d

    new-instance v0, Lcd0/a;

    const/16 v1, 0x12

    invoke-direct {v0, p0, p2, v1}, Lcd0/a;-><init>(Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method public static h(CIILjava/lang/String;)V
    .locals 2

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-ge p2, v0, :cond_1

    invoke-virtual {p3, p2}, Ljava/lang/String;->charAt(I)C

    move-result p1

    if-ne p1, p0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/time/format/DateTimeParseException;

    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    add-int/lit8 v0, p2, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p3, p2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    filled-new-array {p0, v0, v1, p3}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "Expected character %s at position %d, found %s: %s"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0, p3, p2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw p1

    :cond_1
    new-instance p0, Ljava/time/format/DateTimeParseException;

    invoke-static {p1}, Lvl/b;->y(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Unexpected end of input, missing field "

    const-string v1, ": "

    invoke-static {v0, p1, v1, p3}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p3, p2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw p0
.end method

.method public static i(FFFFF)F
    .locals 2

    cmpg-float v0, p2, p3

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move p4, v1

    goto :goto_0

    :cond_0
    sub-float/2addr p4, p2

    sub-float/2addr p3, p2

    div-float/2addr p4, p3

    :goto_0
    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p4}, Ljava/lang/Math;->min(FF)F

    move-result p2

    invoke-static {v1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    invoke-static {p0, p1, p2}, Lrg/a;->o(FFF)F

    move-result p0

    return p0
.end method

.method public static j([BLandroid/os/Parcelable$Creator;)Lvo/d;
    .locals 3

    invoke-static {p1}, Luo/w;->f(Ljava/lang/Object;)V

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    array-length v1, p0

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v2, v1}, Landroid/os/Parcel;->unmarshall([BII)V

    invoke-virtual {v0, v2}, Landroid/os/Parcel;->setDataPosition(I)V

    invoke-interface {p1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvo/d;

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object p0
.end method

.method public static k(Ljava/lang/String;Lvg/n;JJLwc/h0;)Ljava/lang/Object;
    .locals 7

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Lvg/r;

    invoke-virtual {p1}, Lvg/r;->c()Lvg/j;

    move-result-object p1

    iget-object p1, p1, Lvg/j;->a:Lvg/k;

    sget-object v0, Lwc/n;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const-string p1, "cmd.exe"

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string p1, "/C"

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string p1, "sh"

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string p1, "-c"

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p0, Lbc3/q0;->a:Lkc3/e;

    sget-object p0, Lkc3/d;->w:Lkc3/d;

    new-instance v0, Lwc/o;

    const/4 v6, 0x0

    move-wide v4, p2

    move-wide v2, p4

    invoke-direct/range {v0 .. v6}, Lwc/o;-><init>(Ljava/util/ArrayList;JJLq83/d;)V

    invoke-static {p0, v0, p6}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static l(Ljava/util/Map;)Lt23/y1;
    .locals 10

    const-string v0, "qualityLimitationReason"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    const-string v0, "jitter"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Double;

    if-eqz v1, :cond_1

    check-cast v0, Ljava/lang/Double;

    move-object v5, v0

    goto :goto_1

    :cond_1
    move-object v5, v2

    :goto_1
    const-string v0, "frameWidth"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Long;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/Long;

    goto :goto_2

    :cond_2
    move-object v0, v2

    :goto_2
    const-wide/16 v6, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    cmp-long v1, v8, v6

    if-lez v1, :cond_3

    goto :goto_3

    :cond_3
    move-object v0, v2

    :goto_3
    const-string v1, "frameHeight"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/Long;

    if-eqz v3, :cond_4

    check-cast v1, Ljava/lang/Long;

    goto :goto_4

    :cond_4
    move-object v1, v2

    :goto_4
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    cmp-long v3, v8, v6

    if-lez v3, :cond_5

    move-object v7, v1

    goto :goto_5

    :cond_5
    move-object v7, v2

    :goto_5
    const-string v1, "framesPerSecond"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/Double;

    if-eqz v3, :cond_6

    check-cast v1, Ljava/lang/Double;

    move-object v8, v1

    goto :goto_6

    :cond_6
    move-object v8, v2

    :goto_6
    const-string v1, "totalPacketSendDelay"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v1, p0, Ljava/lang/Double;

    if-eqz v1, :cond_7

    move-object v2, p0

    check-cast v2, Ljava/lang/Double;

    :cond_7
    move-object v9, v2

    new-instance v3, Lt23/y1;

    move-object v6, v0

    invoke-direct/range {v3 .. v9}, Lt23/y1;-><init>(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;)V

    return-object v3
.end method

.method public static final m(Lq83/j;)Lrg/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lrg/i;->x:Lrg/b;

    invoke-interface {p0, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p0

    check-cast p0, Lrg/i;

    if-eqz p0, :cond_0

    iget-object p0, p0, Lrg/i;->w:Lrg/h;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static n(Lud3/e0;)Ljava/lang/String;
    .locals 1

    const-string v0, "url"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lne3/l;->z:Lne3/k;

    iget-object p0, p0, Lud3/e0;->i:Ljava/lang/String;

    invoke-static {p0}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object p0

    const-string v0, "MD5"

    invoke-virtual {p0, v0}, Lne3/l;->c(Ljava/lang/String;)Lne3/l;

    move-result-object p0

    invoke-virtual {p0}, Lne3/l;->e()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static o(FFF)F
    .locals 0

    invoke-static {p1, p0, p2, p0}, Lb9/y;->a(FFFF)F

    move-result p0

    return p0
.end method

.method public static p(I)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x1a

    if-eq p0, v0, :cond_6

    const/16 v0, 0x1e

    if-eq p0, v0, :cond_5

    const/16 v0, 0x22

    if-eq p0, v0, :cond_4

    const/16 v0, 0x2a

    if-eq p0, v0, :cond_3

    const/16 v0, 0x101

    if-eq p0, v0, :cond_2

    const/16 v0, 0x3a

    if-eq p0, v0, :cond_1

    const/16 v0, 0x3b

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    packed-switch p0, :pswitch_data_2

    packed-switch p0, :pswitch_data_3

    const-string v0, "DFU INIT PACKET REQUIRED"

    packed-switch p0, :pswitch_data_4

    const-string v0, "UNKNOWN ("

    const-string v1, ")"

    invoke-static {p0, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_0
    const-string p0, "DFU DEVICE NOT BONDED"

    return-object p0

    :pswitch_1
    const-string p0, "DFU CRC ERROR"

    return-object p0

    :pswitch_2
    return-object v0

    :pswitch_3
    const-string p0, "BLUETOOTH ADAPTER DISABLED"

    return-object p0

    :pswitch_4
    const-string p0, "DFU FILE TYPE NOT SUPPORTED"

    return-object p0

    :pswitch_5
    const-string p0, "DFU INVALID RESPONSE"

    return-object p0

    :pswitch_6
    const-string p0, "DFU CHARACTERISTICS NOT FOUND"

    return-object p0

    :pswitch_7
    const-string p0, "DFU SERVICE DISCOVERY NOT STARTED"

    return-object p0

    :pswitch_8
    const-string p0, "DFU IO EXCEPTION"

    return-object p0

    :pswitch_9
    const-string p0, "DFU NOT A VALID HEX FILE"

    return-object p0

    :pswitch_a
    const-string p0, "DFU FILE ERROR"

    return-object p0

    :pswitch_b
    const-string p0, "DFU FILE NOT FOUND"

    return-object p0

    :pswitch_c
    const-string p0, "DFU DEVICE DISCONNECTED"

    return-object p0

    :pswitch_d
    const-string p0, "GATT VALUE OUT OF RANGE"

    return-object p0

    :pswitch_e
    const-string p0, "GATT PROCEDURE IN PROGRESS"

    return-object p0

    :pswitch_f
    const-string p0, "GATT CCCD CFG ERROR"

    return-object p0

    :pswitch_10
    const-string p0, "GATT CONGESTED"

    return-object p0

    :pswitch_11
    const-string p0, "GATT NOT ENCRYPTED"

    return-object p0

    :pswitch_12
    const-string p0, "GATT ENCRYPTED NO MITM"

    return-object p0

    :pswitch_13
    const-string p0, "GATT SERVICE STARTED"

    return-object p0

    :pswitch_14
    const-string p0, "GATT INVALID CFG"

    return-object p0

    :pswitch_15
    const-string p0, "GATT MORE"

    return-object p0

    :pswitch_16
    const-string p0, "GATT AUTH FAIL"

    return-object p0

    :pswitch_17
    const-string p0, "GATT PENDING"

    return-object p0

    :pswitch_18
    const-string p0, "GATT ILLEGAL PARAMETER"

    return-object p0

    :pswitch_19
    const-string p0, "GATT CMD STARTED"

    return-object p0

    :pswitch_1a
    const-string p0, "GATT ERROR"

    return-object p0

    :pswitch_1b
    const-string p0, "GATT BUSY"

    return-object p0

    :pswitch_1c
    const-string p0, "GATT DB FULL"

    return-object p0

    :pswitch_1d
    const-string p0, "GATT WRONG STATE"

    return-object p0

    :pswitch_1e
    const-string p0, "GATT INTERNAL ERROR"

    return-object p0

    :pswitch_1f
    const-string p0, "GATT NO RESOURCES"

    return-object p0

    :pswitch_20
    const-string p0, "GATT INSUF RESOURCE"

    return-object p0

    :pswitch_21
    const-string p0, "GATT UNSUPPORT GRP TYPE"

    return-object p0

    :pswitch_22
    const-string p0, "GATT INSUF ENCRYPTION"

    return-object p0

    :pswitch_23
    const-string p0, "GATT ERR UNLIKELY"

    return-object p0

    :pswitch_24
    const-string p0, "GATT INVALID ATTR LEN"

    return-object p0

    :pswitch_25
    const-string p0, "GATT INSUF KEY SIZE"

    return-object p0

    :pswitch_26
    const-string p0, "GATT NOT LONG"

    return-object p0

    :pswitch_27
    const-string p0, "GATT NOT FOUND"

    return-object p0

    :pswitch_28
    const-string p0, "GATT PREPARE Q FULL"

    return-object p0

    :pswitch_29
    const-string p0, "GATT INSUF AUTHORIZATION"

    return-object p0

    :pswitch_2a
    const-string p0, "GATT INVALID OFFSET"

    return-object p0

    :pswitch_2b
    const-string p0, "GATT REQ NOT SUPPORTED"

    return-object p0

    :pswitch_2c
    const-string p0, "GATT INSUF AUTHENTICATION"

    return-object p0

    :pswitch_2d
    const-string p0, "GATT INVALID PDU"

    return-object p0

    :pswitch_2e
    const-string p0, "GATT WRITE NOT PERMIT"

    return-object p0

    :pswitch_2f
    const-string p0, "GATT READ NOT PERMIT"

    return-object p0

    :pswitch_30
    const-string p0, "GATT INVALID HANDLE"

    return-object p0

    :cond_0
    const-string p0, "GATT UNACCEPT CONN INTERVAL"

    return-object p0

    :cond_1
    const-string p0, "GATT CONTROLLER BUSY"

    return-object p0

    :cond_2
    const-string p0, "TOO MANY OPEN CONNECTIONS"

    return-object p0

    :cond_3
    const-string p0, "HCI ERROR DIFF TRANSACTION COLLISION"

    return-object p0

    :cond_4
    const-string p0, "GATT CONN LMP TIMEOUT"

    return-object p0

    :cond_5
    const-string p0, "HCI ERROR INVALID LMP PARAM"

    return-object p0

    :cond_6
    const-string p0, "HCI ERROR UNSUPPORTED REMOTE FEATURE"

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x80
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0xfd
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1000
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1008
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static q(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_8

    const/4 v0, 0x1

    if-eq p0, v0, :cond_7

    const/16 v0, 0x8

    if-eq p0, v0, :cond_6

    const/16 v0, 0x13

    if-eq p0, v0, :cond_5

    const/16 v0, 0x16

    if-eq p0, v0, :cond_4

    const/16 v0, 0x22

    if-eq p0, v0, :cond_3

    const/16 v0, 0x3e

    if-eq p0, v0, :cond_2

    const/16 v0, 0x85

    if-eq p0, v0, :cond_1

    const/16 v0, 0x100

    if-eq p0, v0, :cond_0

    const-string v0, "UNKNOWN ("

    const-string v1, ")"

    invoke-static {p0, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "GATT CONN CANCEL "

    return-object p0

    :cond_1
    const-string p0, "GATT ERROR"

    return-object p0

    :cond_2
    const-string p0, "GATT CONN FAIL ESTABLISH"

    return-object p0

    :cond_3
    const-string p0, "GATT CONN LMP TIMEOUT"

    return-object p0

    :cond_4
    const-string p0, "GATT CONN TERMINATE LOCAL HOST"

    return-object p0

    :cond_5
    const-string p0, "GATT CONN TERMINATE PEER USER"

    return-object p0

    :cond_6
    const-string p0, "GATT CONN TIMEOUT"

    return-object p0

    :cond_7
    const-string p0, "GATT CONN L2C FAILURE"

    return-object p0

    :cond_8
    const-string p0, "SUCCESS"

    return-object p0
.end method

.method public static r(I)Ljava/lang/String;
    .locals 2

    and-int/lit16 v0, p0, 0xf00

    const/16 v1, 0x100

    if-eq v0, v1, :cond_3

    const/16 v1, 0x200

    if-eq v0, v1, :cond_2

    const/16 v1, 0x400

    if-eq v0, v1, :cond_1

    const/16 v1, 0x800

    if-eq v0, v1, :cond_0

    const-string v0, "UNKNOWN ("

    const-string v1, ")"

    invoke-static {p0, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lrj/j;->w(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0}, Lrj/j;->x(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {p0}, Lrj/j;->v(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-static {p0}, Lrg/j;->j(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static varargs s(Ljava/lang/String;I[C)V
    .locals 3

    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-static {p2}, Ljava/util/Arrays;->toString([C)Ljava/lang/String;

    move-result-object p2

    add-int/lit8 v1, p1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    filled-new-array {p2, v1, v2, p0}, [Ljava/lang/Object;

    move-result-object p2

    const-string v1, "Expected character %s at position %d, found %s: %s"

    invoke-static {v1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p0, p1}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0
.end method

.method public static t(Lne3/j0;)I
    .locals 12

    const-string v0, "expected an int but was \""

    :try_start_0
    iget-object v1, p0, Lne3/j0;->x:Lne3/h;

    const-wide/16 v2, 0x1

    invoke-virtual {p0, v2, v3}, Lne3/j0;->g0(J)V

    const-wide/16 v4, 0x0

    move-wide v6, v4

    :goto_0
    add-long v8, v6, v2

    invoke-virtual {p0, v8, v9}, Lne3/j0;->request(J)Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-virtual {v1, v6, v7}, Lne3/h;->s(J)B

    move-result v10

    const/16 v11, 0x30

    if-lt v10, v11, :cond_0

    const/16 v11, 0x39

    if-le v10, v11, :cond_1

    :cond_0
    cmp-long v6, v6, v4

    if-nez v6, :cond_2

    const/16 v7, 0x2d

    if-eq v10, v7, :cond_1

    goto :goto_1

    :cond_1
    move-wide v6, v8

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v6, :cond_3

    goto :goto_2

    :cond_3
    new-instance p0, Ljava/lang/NumberFormatException;

    const/16 v0, 0x10

    invoke-static {v0}, Lva3/d;->c(I)V

    invoke-static {v10, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "Expected a digit or \'-\' but was 0x"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    :goto_2
    invoke-virtual {v1}, Lne3/h;->o0()J

    move-result-wide v1

    const-wide v6, 0x7fffffffffffffffL

    invoke-virtual {p0, v6, v7}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object p0

    cmp-long v3, v1, v4

    if-ltz v3, :cond_5

    const-wide/32 v3, 0x7fffffff

    cmp-long v3, v1, v3

    if-gtz v3, :cond_5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-gtz v3, :cond_5

    long-to-int p0, v1

    return p0

    :cond_5
    new-instance v3, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x22

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v3, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static u(Lud3/d0;)Ljava/util/Set;
    .locals 7

    invoke-virtual {p0}, Lud3/d0;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_3

    const-string v4, "Vary"

    invoke-virtual {p0, v3}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p0, v3}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v4

    if-nez v1, :cond_1

    new-instance v1, Ljava/util/TreeSet;

    invoke-static {}, Lyb3/y;->G()V

    sget-object v5, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {v1, v5}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    :cond_1
    const/4 v5, 0x1

    new-array v5, v5, [C

    const/16 v6, 0x2c

    aput-char v6, v5, v2

    const/4 v6, 0x6

    invoke-static {v4, v5, v2, v6}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    if-nez v1, :cond_4

    sget-object p0, Lm83/a0;->w:Lm83/a0;

    return-object p0

    :cond_4
    return-object v1
.end method

.method public static v(Lm/m;)V
    .locals 6

    sget v0, Lg/n;->a:I

    sget-object v0, Lg/c0;->x:Lg/c0;

    new-instance v1, Lg/d0;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2, v2, v0}, Lg/d0;-><init>(IIILkotlin/jvm/functions/Function1;)V

    sget v3, Lg/n;->a:I

    sget v4, Lg/n;->b:I

    new-instance v5, Lg/d0;

    invoke-direct {v5, v3, v4, v2, v0}, Lg/d0;-><init>(IIILkotlin/jvm/functions/Function1;)V

    invoke-static {p0, v1, v5}, Lg/n;->a(Lm/m;Lg/d0;Lg/d0;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lpf/c;->V(Landroid/view/Window;Z)V

    return-void
.end method
