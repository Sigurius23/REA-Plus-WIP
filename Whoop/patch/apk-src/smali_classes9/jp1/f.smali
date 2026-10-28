.class public abstract Ljp1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljp1/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lhp1/b;",
        "viewState",
        "Lcp1/d;",
        "type",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "j",
        "(Lhp1/b;Lcp1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "hormonal-insights_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lcp1/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljp1/f;->l(Lcp1/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/Calendar;Lhp1/b;Landroid/content/Context;)Landroid/widget/CalendarView;
    .locals 0

    invoke-static {p0, p1, p2}, Ljp1/f;->m(Ljava/util/Calendar;Lhp1/b;Landroid/content/Context;)Landroid/widget/CalendarView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/f;->r(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcp1/d;Lkotlin/jvm/functions/Function1;Lhp1/b;Lkotlin/jvm/internal/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ljp1/f;->p(Lcp1/d;Lkotlin/jvm/functions/Function1;Lhp1/b;Lkotlin/jvm/internal/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/util/Calendar;Lkotlin/jvm/internal/g0;Ljava/text/SimpleDateFormat;Landroid/widget/CalendarView;III)V
    .locals 0

    invoke-static/range {p0 .. p6}, Ljp1/f;->o(Ljava/util/Calendar;Lkotlin/jvm/internal/g0;Ljava/text/SimpleDateFormat;Landroid/widget/CalendarView;III)V

    return-void
.end method

.method public static synthetic f(Ljava/util/Calendar;Lkotlin/jvm/internal/g0;Ljava/text/SimpleDateFormat;Landroid/widget/CalendarView;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ljp1/f;->n(Ljava/util/Calendar;Lkotlin/jvm/internal/g0;Ljava/text/SimpleDateFormat;Landroid/widget/CalendarView;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/f;->k(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Lhp1/b;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ljp1/f;->q(Lkotlin/jvm/functions/Function1;Lhp1/b;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lhp1/b;Lcp1/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ljp1/f;->s(Lhp1/b;Lcp1/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Lhp1/b;Lcp1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhp1/b;",
            "Lcp1/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v6, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x70af83ca

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_4

    :cond_2
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_5

    if-nez p1, :cond_3

    const/4 v5, -0x1

    goto :goto_2

    :cond_3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    :goto_2
    invoke-virtual {v10, v5}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_3

    :cond_4
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    :goto_4
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_5

    :cond_8
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v0, v9

    :goto_6
    and-int/lit16 v9, v0, 0x93

    const/16 v11, 0x92

    const/4 v12, 0x0

    if-eq v9, v11, :cond_9

    const/4 v9, 0x1

    goto :goto_7

    :cond_9
    move v9, v12

    :goto_7
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v10, v11, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_21

    if-eqz v3, :cond_a

    sget-object v3, Lcp1/d;->POSTPARTUM:Lcp1/d;

    goto :goto_8

    :cond_a
    move-object/from16 v3, p1

    :goto_8
    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v9, :cond_b

    new-instance v5, Ljg/c;

    const/16 v8, 0x12

    invoke-direct {v5, v8}, Ljg/c;-><init>(I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_c
    move-object v5, v8

    :goto_9
    new-instance v8, Ljava/text/SimpleDateFormat;

    const-string v11, "yyyy-MM-dd"

    invoke-direct {v8, v11}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v11

    new-instance v14, Lkotlin/jvm/internal/g0;

    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1}, Lhp1/b;->i()Ljava/util/Date;

    move-result-object v15

    invoke-virtual {v11, v15}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    invoke-virtual {v11}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v15

    invoke-virtual {v8, v15}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v15

    iput-object v15, v14, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    const/high16 v15, 0x3f800000    # 1.0f

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v15, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Ll0/f;->n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v15, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v15, v7, v10, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    move-object/from16 p2, v5

    iget-wide v4, v10, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v10, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v18, v11

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_d

    invoke-virtual {v10, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_d
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_a
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v10, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v10, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-nez v15, :cond_e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v15, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_f

    :cond_e
    invoke-static {v4, v10, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v10, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v6, v7

    invoke-virtual {v1}, Lhp1/b;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    move-object v13, v8

    invoke-virtual {v1}, Lhp1/b;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    and-int/lit8 v15, v0, 0x70

    move-object/from16 v21, v6

    const/16 v6, 0x20

    if-ne v15, v6, :cond_10

    const/4 v6, 0x1

    goto :goto_b

    :cond_10
    const/4 v6, 0x0

    :goto_b
    and-int/lit16 v0, v0, 0x380

    const/16 v15, 0x100

    if-ne v0, v15, :cond_11

    const/16 v16, 0x1

    goto :goto_c

    :cond_11
    const/16 v16, 0x0

    :goto_c
    or-int v6, v6, v16

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v6, :cond_13

    if-ne v15, v9, :cond_12

    goto :goto_d

    :cond_12
    move-object/from16 v20, v9

    move-object/from16 v9, p2

    goto :goto_e

    :cond_13
    :goto_d
    new-instance v15, Ljp1/b;

    const/4 v6, 0x0

    move-object/from16 v20, v9

    move-object/from16 v9, p2

    invoke-direct {v15, v3, v9, v6}, Ljp1/b;-><init>(Lcp1/d;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_e
    check-cast v15, Lc93/a;

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v22, v6, 0x3

    or-int v22, v6, v22

    move-object/from16 v23, v12

    move-object v12, v15

    const/16 v15, 0x1c

    move-object/from16 v24, v9

    const/4 v9, 0x0

    move-object/from16 v29, v10

    const/4 v10, 0x0

    move-object/from16 v25, v11

    const/4 v11, 0x0

    move/from16 p1, v0

    move-object/from16 v34, v3

    move-object/from16 v16, v4

    move/from16 v37, v6

    move-object/from16 p2, v13

    move-object/from16 v35, v14

    move-object/from16 v36, v18

    move-object/from16 v38, v20

    move-object/from16 v3, v21

    move/from16 v14, v22

    move-object/from16 v1, v23

    move-object/from16 v33, v24

    move-object/from16 v0, v25

    move-object/from16 v13, v29

    const/4 v4, 0x1

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static/range {v7 .. v15}, Ljp1/q;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v13

    float-to-double v7, v6

    const-wide/16 v11, 0x0

    cmpl-double v7, v7, v11

    if-lez v7, :cond_14

    goto :goto_f

    :cond_14
    const-string v7, "invalid weight; must be greater than zero"

    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_f
    invoke-static {v6, v4, v10}, Ldc/b;->y(FZLp1/q;)V

    const/4 v7, 0x3

    int-to-float v8, v7

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v9, v8

    invoke-static {v9, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v11, Lb2/e;->N:Lb2/k;

    const/4 v12, 0x4

    int-to-float v12, v12

    const/16 v13, 0x36

    invoke-static {v8, v12, v11, v10, v13}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v8

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v10, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_15

    invoke-virtual {v10, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_15
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v10, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v3, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_17

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_12

    :cond_16
    :goto_11
    move-object/from16 v0, v16

    goto :goto_13

    :cond_17
    :goto_12
    invoke-static {v11, v10, v11, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_11

    :goto_13
    invoke-static {v10, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lhp1/b;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move/from16 v1, v37

    invoke-static {v0, v10, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v3, v10, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    invoke-virtual {v3, v10, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->N()Lb91/a;

    move-result-object v27

    move-object/from16 v29, v10

    move-wide v9, v8

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v11, Lw3/k;

    const/4 v12, 0x5

    invoke-direct {v11, v12}, Lw3/k;-><init>(I)V

    sget v12, Lb91/a;->d:I

    shl-int/lit8 v31, v12, 0x12

    const v32, 0x2fdf8

    move-object/from16 v19, v11

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x30

    move/from16 v39, v7

    move-object v7, v0

    move/from16 v0, v39

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v29

    move-object/from16 v7, v36

    invoke-virtual {v10, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    move-object/from16 v13, p0

    invoke-virtual {v10, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v14, v38

    if-nez v8, :cond_18

    if-ne v9, v14, :cond_19

    :cond_18
    new-instance v9, Ljp1/c;

    const/4 v8, 0x0

    invoke-direct {v9, v8, v7, v13}, Ljp1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    invoke-static {v2, v8, v0}, Landroidx/compose/foundation/layout/d;->z(Landroidx/compose/ui/Modifier;Lb2/f;I)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object v0, v9

    new-instance v9, Lig0/h;

    const/16 v11, 0x19

    move-object/from16 v12, p2

    move/from16 v17, v4

    move-object/from16 v4, v35

    invoke-direct {v9, v7, v4, v12, v11}, Lig0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/16 v11, 0x30

    const/4 v12, 0x0

    move-object v7, v0

    invoke-static/range {v7 .. v12}, Landroidx/compose/ui/viewinterop/a;->a(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object v8, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual {v13}, Lhp1/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v10, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v10, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->i0()J

    move-result-wide v11

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v15, Lam2/d;

    const/16 v5, 0x11

    move/from16 v6, p1

    move/from16 v37, v1

    move-object v3, v13

    move-object v0, v15

    move-object/from16 v2, v33

    move-object/from16 v1, v34

    invoke-direct/range {v0 .. v5}, Lam2/d;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v1, v3

    move/from16 v4, v17

    const/16 v17, 0x36

    const/16 v18, 0x68

    move-object/from16 v29, v10

    const/4 v10, 0x0

    const/4 v13, 0x0

    move-object/from16 v20, v14

    const/4 v14, 0x0

    move-object/from16 v0, v20

    move-object/from16 v16, v29

    invoke-static/range {v7 .. v18}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v10, v16

    invoke-virtual {v1}, Lhp1/b;->g()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v3

    if-nez v3, :cond_1a

    const v3, 0x6c5c560c

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    const/16 v5, 0x100

    goto :goto_15

    :cond_1a
    const/4 v3, 0x0

    const v5, 0x6c5c560d

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lhp1/b;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const/16 v5, 0x100

    if-ne v6, v5, :cond_1b

    move v12, v4

    goto :goto_14

    :cond_1b
    move v12, v3

    :goto_14
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v7, v12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_1c

    if-ne v8, v0, :cond_1d

    :cond_1c
    new-instance v8, Ljp1/c;

    const/4 v7, 0x1

    invoke-direct {v8, v7, v2, v1}, Ljp1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    move-object/from16 v19, v8

    check-cast v19, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v21, v37, 0x6

    const/16 v22, 0x0

    const/16 v23, 0xffb

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v29, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v20, v29

    invoke-static/range {v7 .. v23}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v20

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    :goto_15
    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    if-ne v6, v5, :cond_1e

    move v12, v4

    goto :goto_16

    :cond_1e
    move v12, v3

    :goto_16
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v12, :cond_1f

    if-ne v5, v0, :cond_20

    :cond_1f
    new-instance v5, Lif0/b;

    const/16 v0, 0x1a

    invoke-direct {v5, v2, v0}, Lif0/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v5, Lc93/a;

    invoke-static {v5, v3, v10, v3, v4}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    move-object v3, v2

    move-object/from16 v2, v34

    goto :goto_17

    :cond_21
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object/from16 v2, p1

    move-object v3, v8

    :goto_17
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_22

    new-instance v0, Ljp1/d;

    const/4 v6, 0x0

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ljp1/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_22
    return-void
.end method

.method private static final k(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lcp1/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ljp1/f$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Lcp1/i$a;->a:Lcp1/i$a;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lhp1/f$a;->a:Lhp1/f$a;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Ljava/util/Calendar;Lhp1/b;Landroid/content/Context;)Landroid/widget/CalendarView;
    .locals 4

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/widget/CalendarView;

    new-instance v1, Landroid/view/ContextThemeWrapper;

    sget v2, Lxn1/d;->a:I

    invoke-direct {v1, p2, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v0, v1}, Landroid/widget/CalendarView;-><init>(Landroid/content/Context;)V

    sget p2, Lxn1/d;->c:I

    invoke-virtual {v0, p2}, Landroid/widget/CalendarView;->setWeekDayTextAppearance(I)V

    sget p2, Lxn1/d;->b:I

    invoke-virtual {v0, p2}, Landroid/widget/CalendarView;->setDateTextAppearance(I)V

    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/widget/CalendarView;->setDate(J)V

    invoke-virtual {p0}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object p2

    const-string v1, "null cannot be cast to non-null type java.util.Calendar"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/util/Calendar;

    invoke-virtual {p1}, Lhp1/b;->c()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    invoke-virtual {p2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Landroid/widget/CalendarView;->setMinDate(J)V

    invoke-virtual {p0}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/util/Calendar;

    invoke-virtual {p1}, Lhp1/b;->b()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide p0

    invoke-virtual {v0, p0, p1}, Landroid/widget/CalendarView;->setMaxDate(J)V

    const/4 p0, 0x1

    invoke-virtual {v0, p0}, Landroid/widget/CalendarView;->setFirstDayOfWeek(I)V

    return-object v0
.end method

.method private static final n(Ljava/util/Calendar;Lkotlin/jvm/internal/g0;Ljava/text/SimpleDateFormat;Landroid/widget/CalendarView;)Ll83/a0;
    .locals 1

    const-string v0, "views"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljp1/e;

    invoke-direct {v0, p0, p1, p2}, Ljp1/e;-><init>(Ljava/util/Calendar;Lkotlin/jvm/internal/g0;Ljava/text/SimpleDateFormat;)V

    invoke-virtual {p3, v0}, Landroid/widget/CalendarView;->setOnDateChangeListener(Landroid/widget/CalendarView$OnDateChangeListener;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Ljava/util/Calendar;Lkotlin/jvm/internal/g0;Ljava/text/SimpleDateFormat;Landroid/widget/CalendarView;III)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p4, p5, p6}, Ljava/util/Calendar;->set(III)V

    invoke-virtual {p0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-void
.end method

.method private static final p(Lcp1/d;Lkotlin/jvm/functions/Function1;Lhp1/b;Lkotlin/jvm/internal/g0;)Ll83/a0;
    .locals 14

    sget-object v0, Ljp1/f$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_0
    new-instance p0, Ll83/j;

    const-string v0, "An operation is not implemented: CALL PREGNANCY ONBOARDING"

    invoke-direct {p0, v0}, Ll83/j;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Lhp1/f$c;

    invoke-virtual/range {p2 .. p2}, Lhp1/b;->f()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v0

    new-instance v1, Lfp1/d;

    move-object/from16 v2, p3

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const/16 v12, 0x3fe

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, Lfp1/d;-><init>(Ljava/lang/String;Lfp1/b;Ljava/util/List;ZLjava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v0, v1}, Lhp1/f$c;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lfp1/d;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;Lhp1/b;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lhp1/f$g;

    invoke-virtual {p1}, Lhp1/b;->g()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object p1

    invoke-direct {p2, p1}, Lhp1/f$g;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lhp1/f$a;->a:Lhp1/f$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lhp1/b;Lcp1/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ljp1/f;->j(Lhp1/b;Lcp1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
