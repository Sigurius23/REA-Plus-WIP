.class public abstract Li21/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aM\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "Li2/x;",
        "titleColor",
        "Ly11/r;",
        "horizontalImpactBarViewState",
        "Li21/l$c;",
        "impactCardType",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLy11/r;Li21/l$c;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "design_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lc93/a;Lcom/whoop/design/util/TextResource;JLi21/l$c;Ly11/r;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Li21/e;->g(Landroidx/compose/ui/Modifier;Lc93/a;Lcom/whoop/design/util/TextResource;JLi21/l$c;Ly11/r;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Li21/e;->f()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Li21/e;->h(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLy11/r;Li21/l$c;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Li21/e;->i(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLy11/r;Li21/l$c;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLy11/r;Li21/l$c;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/whoop/design/util/TextResource;",
            "J",
            "Ly11/r;",
            "Li21/l$c;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v7, p4

    move-object/from16 v6, p5

    move/from16 v9, p8

    const-string v0, "horizontalImpactBarViewState"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "impactCardType"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p7

    check-cast v10, Lp1/q;

    const v0, 0x56f9c71f

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p9, 0x1

    const/4 v2, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v3, v9, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v9, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v2

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v9

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v9

    :goto_1
    and-int/lit8 v5, v9, 0x30

    if-nez v5, :cond_5

    and-int/lit8 v5, p9, 0x2

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v5, p1

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v4, v8

    goto :goto_3

    :cond_5
    move-object/from16 v5, p1

    :goto_3
    and-int/lit16 v8, v9, 0x180

    if-nez v8, :cond_7

    and-int/lit8 v8, p9, 0x4

    move-wide/from16 v11, p2

    if-nez v8, :cond_6

    invoke-virtual {v10, v11, v12}, Lp1/q;->f(J)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v4, v8

    goto :goto_5

    :cond_7
    move-wide/from16 v11, p2

    :goto_5
    and-int/lit16 v8, v9, 0xc00

    if-nez v8, :cond_9

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x800

    goto :goto_6

    :cond_8
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v4, v8

    :cond_9
    and-int/lit16 v8, v9, 0x6000

    if-nez v8, :cond_b

    invoke-virtual {v10, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x4000

    goto :goto_7

    :cond_a
    const/16 v8, 0x2000

    :goto_7
    or-int/2addr v4, v8

    :cond_b
    and-int/lit8 v8, p9, 0x20

    const/high16 v13, 0x30000

    if-eqz v8, :cond_d

    or-int/2addr v4, v13

    :cond_c
    move-object/from16 v13, p6

    goto :goto_9

    :cond_d
    and-int/2addr v13, v9

    if-nez v13, :cond_c

    move-object/from16 v13, p6

    invoke-virtual {v10, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_e

    const/high16 v14, 0x20000

    goto :goto_8

    :cond_e
    const/high16 v14, 0x10000

    :goto_8
    or-int/2addr v4, v14

    :goto_9
    const v14, 0x12493

    and-int/2addr v14, v4

    const v15, 0x12492

    const/4 v1, 0x1

    if-eq v14, v15, :cond_f

    move v14, v1

    goto :goto_a

    :cond_f
    const/4 v14, 0x0

    :goto_a
    and-int/2addr v4, v1

    invoke-virtual {v10, v4, v14}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_17

    invoke-virtual {v10}, Lp1/q;->Z()V

    and-int/lit8 v4, v9, 0x1

    const/4 v14, 0x6

    if-eqz v4, :cond_12

    invoke-virtual {v10}, Lp1/q;->C()Z

    move-result v4

    if-eqz v4, :cond_10

    goto :goto_c

    :cond_10
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v0, v3

    move-object v3, v5

    :cond_11
    :goto_b
    move-wide v4, v11

    goto :goto_f

    :cond_12
    :goto_c
    if-eqz v0, :cond_13

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_d

    :cond_13
    move-object v0, v3

    :goto_d
    and-int/lit8 v3, p9, 0x2

    if-eqz v3, :cond_14

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    goto :goto_e

    :cond_14
    move-object v3, v5

    :goto_e
    and-int/lit8 v4, p9, 0x4

    if-eqz v4, :cond_15

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v10, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v4

    move-wide v11, v4

    :cond_15
    if-eqz v8, :cond_11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_16

    new-instance v4, Lhb1/l;

    const/16 v5, 0x1b

    invoke-direct {v4, v5}, Lhb1/l;-><init>(I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v4, Lc93/a;

    move-object v13, v4

    goto :goto_b

    :goto_f
    invoke-virtual {v10}, Lp1/q;->r()V

    int-to-float v1, v1

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v11

    const/4 v1, 0x2

    int-to-float v1, v1

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2, v10, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    move-object/from16 p0, v3

    move-wide/from16 p1, v4

    invoke-virtual {v8}, Ly81/i;->X0()J

    move-result-wide v3

    invoke-static {v1, v3, v4}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v12

    invoke-virtual {v2, v10, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->V0()J

    move-result-wide v14

    const/4 v1, 0x0

    int-to-float v1, v1

    move v2, v1

    move-object v1, v0

    new-instance v0, Li21/d;

    const/4 v8, 0x0

    move-object v3, v13

    move v13, v2

    move-object v2, v3

    move-object/from16 v3, p0

    move-wide/from16 v4, p1

    invoke-direct/range {v0 .. v8}, Li21/d;-><init>(Landroidx/compose/ui/Modifier;Lc93/a;Lcom/whoop/design/util/TextResource;JLi21/l;Ly11/r;I)V

    const v6, 0x392f70

    invoke-static {v6, v10, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v16

    const/high16 v18, 0x1b0000

    const/16 v19, 0x9

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move-wide/from16 v20, v14

    move-object v14, v12

    move v15, v13

    move-wide/from16 v12, v20

    invoke-static/range {v10 .. v19}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v2

    move-object v2, v3

    move-wide v3, v4

    goto :goto_10

    :cond_17
    move-object/from16 v17, v10

    invoke-virtual/range {v17 .. v17}, Lp1/q;->X()V

    move-object v1, v3

    move-object v2, v5

    move-wide v3, v11

    move-object v7, v13

    :goto_10
    invoke-virtual/range {v17 .. v17}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_18

    new-instance v0, Lbu2/v;

    const/4 v10, 0x2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move v8, v9

    move/from16 v9, p9

    invoke-direct/range {v0 .. v10}, Lbu2/v;-><init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLy11/r;Li21/l;Lc93/a;III)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final f()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lc93/a;Lcom/whoop/design/util/TextResource;JLi21/l$c;Ly11/r;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 46

    move-object/from16 v0, p1

    and-int/lit8 v1, p8, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    and-int/lit8 v2, p8, 0x1

    move-object/from16 v5, p7

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1c

    sget-object v1, Lb2/e;->w:Lb2/m;

    invoke-static {v1, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    move-object/from16 v7, p0

    invoke-static {v5, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v9, v5, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v5, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v5, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v5, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-nez v10, :cond_2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    :cond_2
    invoke-static {v2, v5, v2, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v5, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_4

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v13, v12, :cond_5

    :cond_4
    new-instance v13, Lg40/i3;

    const/16 v12, 0x15

    invoke-direct {v13, v0, v12}, Lg40/i3;-><init>(Lc93/a;I)V

    invoke-virtual {v5, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v15, v13

    check-cast v15, Lc93/a;

    const/16 v16, 0xf

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v12, v5, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    iget-wide v14, v5, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_6

    invoke-virtual {v5, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_6
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v5, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v1, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-nez v7, :cond_7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v7, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    :cond_7
    invoke-static {v14, v5, v14, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v5, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Ll0/m;->a:Ll0/e;

    sget-object v7, Lb2/e;->J:Lb2/l;

    invoke-static {v0, v7, v5, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v13

    iget-wide v14, v5, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v5, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-eqz v4, :cond_9

    invoke-virtual {v5, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_9
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v5, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v1, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_a

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v4, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    invoke-static {v14, v5, v14, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v5, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x40400000    # 3.0f

    float-to-double v13, v3

    const-wide/16 v31, 0x0

    cmpl-double v4, v13, v31

    const-string v33, "invalid weight; must be greater than zero"

    if-lez v4, :cond_c

    goto :goto_4

    :cond_c
    invoke-static/range {v33 .. v33}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_4
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v34, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v13, v3, v34

    if-lez v13, :cond_d

    move/from16 v3, v34

    :cond_d
    const/4 v13, 0x1

    invoke-direct {v4, v3, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v3, 0x0

    invoke-static {v11, v12, v5, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v12

    iget-wide v13, v5, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v5, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v14, v5, Lp1/q;->S:Z

    if-eqz v14, :cond_e

    invoke-virtual {v5, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_e
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v5, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v12, v5, Lp1/q;->S:Z

    if-nez v12, :cond_f

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_10

    :cond_f
    invoke-static {v3, v5, v3, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    invoke-static {v5, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, p2

    const/4 v4, 0x0

    invoke-static {v3, v5, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v12, 0x6

    invoke-virtual {v4, v5, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->s()Lb91/a;

    move-result-object v25

    const/16 v29, 0x0

    const v30, 0x2fffa

    move-object v13, v6

    const/4 v6, 0x0

    move-object v14, v9

    move-object v15, v10

    const-wide/16 v9, 0x0

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move/from16 v17, v12

    const/4 v12, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    move-object/from16 v19, v14

    move-object/from16 v20, v15

    const-wide/16 v14, 0x0

    move-object/from16 v21, v16

    const/16 v16, 0x0

    move/from16 v22, v17

    const/16 v17, 0x0

    move-object/from16 v24, v18

    move-object/from16 v23, v19

    const-wide/16 v18, 0x0

    move-object/from16 v26, v20

    const/16 v20, 0x0

    move-object/from16 v27, v21

    const/16 v21, 0x0

    move/from16 v28, v22

    const/16 v22, 0x0

    move-object/from16 v35, v23

    const/16 v23, 0x0

    move-object/from16 v36, v24

    const/16 v24, 0x0

    move-object/from16 v37, v26

    const/16 v26, 0x0

    move/from16 v38, v28

    const/16 v28, 0x0

    move-object/from16 v43, v7

    move-object/from16 v39, v8

    move-object/from16 v42, v27

    move-object/from16 v40, v35

    move-object/from16 v41, v36

    move-object/from16 v44, v37

    move-wide/from16 v7, p3

    move-object/from16 v27, v5

    move-object v5, v3

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    const/4 v13, 0x1

    invoke-virtual {v5, v13}, Lp1/q;->q(Z)V

    float-to-double v6, v3

    cmpl-double v6, v6, v31

    if-lez v6, :cond_11

    goto :goto_6

    :cond_11
    invoke-static/range {v33 .. v33}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v7, v3, v34

    if-lez v7, :cond_12

    move/from16 v7, v34

    :goto_7
    const/4 v13, 0x1

    goto :goto_8

    :cond_12
    move v7, v3

    goto :goto_7

    :goto_8
    invoke-direct {v6, v7, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v3, Lb2/e;->O:Lb2/k;

    const/16 v7, 0x30

    move-object/from16 v8, v42

    invoke-static {v8, v3, v5, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v7, v5, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v5, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v9, v5, Lp1/q;->S:Z

    if-eqz v9, :cond_13

    move-object/from16 v9, v39

    invoke-virtual {v5, v9}, Lp1/q;->l(Lc93/a;)V

    :goto_9
    move-object/from16 v10, v40

    goto :goto_a

    :cond_13
    move-object/from16 v9, v39

    invoke-virtual {v5}, Lp1/q;->s0()V

    goto :goto_9

    :goto_a
    invoke-static {v5, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-nez v3, :cond_14

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    :cond_14
    move-object/from16 v3, v41

    goto :goto_b

    :cond_15
    move-object/from16 v3, v41

    goto :goto_c

    :goto_b
    invoke-static {v7, v5, v7, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_c
    invoke-static {v5, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v6, 0x6

    invoke-virtual {v4, v5, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->b1()J

    move-result-wide v7

    invoke-virtual {v4, v5, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->F()Lb91/a;

    move-result-object v25

    const/16 v29, 0x0

    const v30, 0x2fffa

    move-object/from16 v27, v5

    const-string v5, "--%"

    move/from16 v38, v6

    const/4 v6, 0x0

    move-object/from16 v39, v9

    move-object/from16 v23, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v40, v23

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x6

    move-object/from16 p7, v2

    move-object/from16 p0, v4

    move-object/from16 v4, v39

    move-object/from16 v2, v40

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    const/4 v13, 0x1

    invoke-virtual {v5, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v13}, Lp1/q;->q(Z)V

    int-to-float v6, v13

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float/2addr v6, v7

    move-object/from16 v7, v44

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v5, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v8, v43

    const/4 v9, 0x0

    invoke-static {v0, v8, v5, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    iget-wide v11, v5, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v5, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v13, v5, Lp1/q;->S:Z

    if-eqz v13, :cond_16

    invoke-virtual {v5, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_16
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v5, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v1, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-nez v10, :cond_18

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_17

    goto :goto_f

    :cond_17
    :goto_e
    move-object/from16 v9, p7

    goto :goto_10

    :cond_18
    :goto_f
    invoke-static {v9, v5, v9, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_e

    :goto_10
    invoke-static {v5, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p5 .. p5}, Li21/l$c;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    const/4 v11, 0x0

    invoke-static {v10, v5, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p5 .. p5}, Li21/l$c;->b()J

    move-result-wide v11

    const/4 v14, 0x6

    move-object/from16 v13, p0

    invoke-virtual {v13, v5, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->c()Lb91/a;

    move-result-object v25

    const/16 v29, 0x0

    const v30, 0x2fffa

    move v13, v6

    const/4 v6, 0x0

    move-object/from16 v27, v5

    move-object v14, v9

    move-object v5, v10

    const-wide/16 v9, 0x0

    move-object/from16 v37, v7

    move-object/from16 v43, v8

    move-wide v7, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    move/from16 v17, v15

    const-wide/16 v14, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move-object/from16 v20, v18

    move/from16 v21, v19

    const-wide/16 v18, 0x0

    move-object/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v26, v23

    const/16 v23, 0x0

    move-object/from16 v28, v24

    const/16 v24, 0x0

    move/from16 v31, v26

    const/16 v26, 0x0

    move-object/from16 v32, v28

    const/16 v28, 0x0

    move-object/from16 p0, v1

    move-object/from16 v35, v2

    move-object/from16 v36, v3

    move/from16 v1, v31

    move-object/from16 v45, v32

    move-object/from16 v2, v37

    move-object/from16 v3, v43

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    const/4 v13, 0x1

    invoke-static {v2, v1, v5, v13}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    const/4 v9, 0x0

    invoke-static {v0, v3, v5, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-eqz v6, :cond_19

    invoke-virtual {v5, v4}, Lp1/q;->l(Lc93/a;)V

    :goto_11
    move-object/from16 v10, v35

    goto :goto_12

    :cond_19
    invoke-virtual {v5}, Lp1/q;->s0()V

    goto :goto_11

    :goto_12
    invoke-static {v5, v10, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, p0

    invoke-static {v5, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v5, Lp1/q;->S:Z

    if-nez v0, :cond_1a

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    :cond_1a
    move-object/from16 v13, v36

    goto :goto_14

    :cond_1b
    :goto_13
    move-object/from16 v9, v45

    goto :goto_15

    :goto_14
    invoke-static {v1, v5, v1, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_13

    :goto_15
    invoke-static {v5, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x0

    move-object/from16 v1, p6

    const/4 v9, 0x0

    const/4 v13, 0x1

    invoke-static {v0, v1, v5, v9, v13}, Ly11/n;->f(Landroidx/compose/ui/Modifier;Ly11/r;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v5, v13, v13, v13}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_16

    :cond_1c
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_16
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLy11/r;Li21/l$c;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v9

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v10, p8

    move-object/from16 v8, p9

    invoke-static/range {v1 .. v10}, Li21/e;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLy11/r;Li21/l$c;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
