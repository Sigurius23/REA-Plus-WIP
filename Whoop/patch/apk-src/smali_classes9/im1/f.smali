.class public abstract Lim1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lim1/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aM\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u001e\u0008\u0002\u0010\t\u001a\u0018\u0012\u000e\u0012\u000c\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\u0008\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lem1/v;",
        "homeViewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onCalendarPaged",
        "Lkb1/e;",
        "Lcom/whoop/design/models/calendar/CalendarDateModel;",
        "Lcom/whoop/design/reducer/calendar/CalendarDateArguments;",
        "onCalendarDateClick",
        "f",
        "(Lem1/v;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Li2/x;",
        "m",
        "(Lem1/v;Landroidx/compose/runtime/Composer;I)J",
        "Lhy0/i0;",
        "l",
        "(Lem1/v;)Lhy0/i0;",
        "home_release"
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
.method public static synthetic a(I)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lim1/f;->g(I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lem1/v;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lim1/f;->k(Lem1/v;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkb1/e;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lim1/f;->h(Lkb1/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lim1/f;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lh91/b;I)Lg51/c;
    .locals 0

    invoke-static {p0, p1}, Lim1/f;->j(Lh91/b;I)Lg51/c;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lem1/v;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lem1/v;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p4

    const-string v0, "homeViewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0xdab0913

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :goto_3
    and-int/lit8 v6, p5, 0x4

    const/16 v7, 0x100

    if-eqz v6, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    move v9, v7

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit16 v9, v0, 0x93

    const/16 v11, 0x92

    const/4 v13, 0x0

    if-eq v9, v11, :cond_8

    const/4 v9, 0x1

    goto :goto_6

    :cond_8
    move v9, v13

    :goto_6
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v10, v11, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_17

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v9, :cond_9

    new-instance v3, Lih0/t;

    const/16 v5, 0xe

    invoke-direct {v3, v5}, Lih0/t;-><init>(I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_a
    move-object v3, v5

    :goto_7
    if-eqz v6, :cond_c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v9, :cond_b

    new-instance v5, Lih0/t;

    const/16 v6, 0xf

    invoke-direct {v5, v6}, Lih0/t;-><init>(I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_c
    move-object v5, v8

    :goto_8
    invoke-virtual {v1}, Lem1/v;->c()Ljava/time/LocalDate;

    move-result-object v6

    if-eqz v6, :cond_d

    invoke-virtual {v6}, Ljava/time/LocalDate;->getDayOfMonth()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    goto :goto_9

    :cond_d
    const/4 v6, 0x0

    :goto_9
    invoke-virtual {v1}, Lem1/v;->b()Lh91/b;

    move-result-object v8

    if-eqz v8, :cond_16

    if-eqz v6, :cond_16

    const v6, -0x2474796e

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v6, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->n()J

    move-result-wide v14

    sget-object v6, Li2/w0;->a:Li2/v0;

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v14, v15, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v14, v10, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v14, v10, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_e

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_e
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_a
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v10, v12, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v10, v11, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-nez v12, :cond_f

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_10

    :cond_f
    invoke-static {v14, v10, v14, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v10, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1}, Lim1/f;->l(Lem1/v;)Lhy0/i0;

    move-result-object v11

    int-to-float v2, v2

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v18, v2, v6

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v8

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v1}, Lem1/v;->b()Lh91/b;

    move-result-object v12

    invoke-virtual {v1}, Lem1/v;->b()Lh91/b;

    move-result-object v6

    invoke-virtual {v6}, Lh91/b;->j()I

    move-result v6

    and-int/lit16 v8, v0, 0x380

    if-ne v8, v7, :cond_11

    const/4 v7, 0x1

    goto :goto_b

    :cond_11
    const/4 v7, 0x0

    :goto_b
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_12

    if-ne v8, v9, :cond_13

    :cond_12
    new-instance v8, Lim1/d;

    const/4 v7, 0x0

    invoke-direct {v8, v5, v7}, Lim1/d;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v9, :cond_14

    new-instance v7, Li22/b;

    const/16 v9, 0xb

    invoke-direct {v7, v9}, Li22/b;-><init>(I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object v13, v7

    check-cast v13, Lc93/m;

    shl-int/lit8 v7, v0, 0xc

    const/high16 v9, 0x70000

    and-int/2addr v7, v9

    const v9, 0x6000006

    or-int/2addr v7, v9

    sget v9, Lh91/b;->k:I

    shl-int/lit8 v9, v9, 0x15

    or-int v15, v7, v9

    move-object/from16 v7, v16

    const/16 v16, 0xa

    move-object v9, v7

    move v7, v6

    const/4 v6, 0x0

    move-object v14, v9

    move-object v9, v8

    const/4 v8, 0x0

    move-object/from16 v22, v5

    move-object v5, v2

    move-object/from16 v2, v22

    move-object/from16 v22, v14

    move-object v14, v10

    move-object v10, v3

    const/4 v3, 0x1

    invoke-static/range {v5 .. v16}, Lv81/c;->j(Landroidx/compose/ui/Modifier;IIFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lhy0/i0;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v10

    move-object v10, v14

    invoke-virtual {v1}, Lem1/v;->b()Lh91/b;

    move-result-object v5

    if-eqz v5, :cond_15

    invoke-virtual {v5}, Lh91/b;->l()Z

    move-result v5

    if-ne v5, v3, :cond_15

    const v5, -0x55143b24

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v0, 0xe

    invoke-static {v1, v10, v0}, Lim1/f;->m(Lem1/v;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    const/high16 v0, 0x3f800000    # 1.0f

    move-object/from16 v14, v22

    invoke-static {v0, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const v0, 0x3dcccccd    # 0.1f

    invoke-static {v0, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v8

    const/4 v11, 0x6

    invoke-static/range {v5 .. v11}, Lg1/v4;->c(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_15
    const/4 v0, 0x0

    const v5, -0x550f1d07

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_16
    move-object v12, v3

    move-object v2, v5

    move v0, v13

    const v3, -0x24625218

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_d
    move-object v3, v2

    move-object v2, v12

    goto :goto_e

    :cond_17
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v2, v5

    move-object v3, v8

    :goto_e
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_18

    new-instance v0, Lim1/e;

    const/4 v6, 0x0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lim1/e;-><init>(Lem1/v;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final g(I)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkb1/e;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lkb1/e;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lh91/b;I)Lg51/c;
    .locals 3

    const-string v0, "domainState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lkb1/h;->c(Lh91/b;IZILjava/lang/Object;)Lg51/c;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lem1/v;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lim1/f;->f(Lem1/v;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lem1/v;)Lhy0/i0;
    .locals 1

    invoke-virtual {p0}, Lem1/v;->l()Lfm1/c;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lfm1/c;->b()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lem1/v;->d()I

    move-result p0

    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfm1/f;

    invoke-virtual {p0}, Lfm1/f;->c()Lfm1/g;

    move-result-object p0

    sget-object v0, Lim1/f$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    sget-object p0, Lhy0/i0;->SLEEP:Lhy0/i0;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lhy0/i0;->RECOVERY:Lhy0/i0;

    goto :goto_0

    :cond_2
    sget-object p0, Lhy0/i0;->STRAIN:Lhy0/i0;

    :goto_0
    if-nez p0, :cond_3

    goto :goto_1

    :cond_3
    return-object p0

    :cond_4
    :goto_1
    sget-object p0, Lhy0/i0;->STRAIN:Lhy0/i0;

    return-object p0
.end method

.method private static final m(Lem1/v;Landroidx/compose/runtime/Composer;I)J
    .locals 4

    invoke-virtual {p0}, Lem1/v;->l()Lfm1/c;

    move-result-object p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    move-object p0, p1

    check-cast p0, Lp1/q;

    const p2, -0x44862640

    invoke-virtual {p0, p2}, Lp1/q;->e0(I)V

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    const/4 p0, 0x0

    goto :goto_2

    :cond_0
    move-object v1, p1

    check-cast v1, Lp1/q;

    const v2, -0x4486263f

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {p2}, Lfm1/c;->b()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0}, Lem1/v;->d()I

    move-result p0

    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfm1/f;

    invoke-virtual {p0}, Lfm1/f;->c()Lfm1/g;

    move-result-object p0

    sget-object p2, Lim1/f$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p2, p0

    const/4 p2, 0x1

    if-eq p0, p2, :cond_3

    const/4 p2, 0x2

    if-eq p0, p2, :cond_2

    const/4 p2, 0x3

    if-eq p0, p2, :cond_2

    const/4 p2, 0x4

    if-ne p0, p2, :cond_1

    goto :goto_0

    :cond_1
    const p0, 0x3775fa65

    invoke-static {p0, v1, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_2
    :goto_0
    const p0, 0x3776155c

    invoke-virtual {v1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p2, Lx81/d;->b:I

    invoke-virtual {p0, v1, p2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->X()J

    move-result-wide v2

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_3
    const p0, 0x377608fa

    invoke-virtual {v1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p2, Lx81/d;->b:I

    invoke-virtual {p0, v1, p2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->k0()J

    move-result-wide v2

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    :goto_1
    invoke-static {v1, v0, v2, v3}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object p0

    :goto_2
    if-nez p0, :cond_4

    check-cast p1, Lp1/q;

    const p0, 0x271494c2

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p2, Lx81/d;->b:I

    invoke-virtual {p0, p1, p2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->k0()J

    move-result-wide v1

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_4
    check-cast p1, Lp1/q;

    const p2, 0x27146f95

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    iget-wide v1, p0, Li2/x;->a:J

    :goto_3
    return-wide v1
.end method
