.class public abstract Lno0/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a5\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0010\u00b2\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\r\u001a\u00020\u000c8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Llo0/e0;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "f",
        "(Llo0/e0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "",
        "isExpanded",
        "",
        "expandableContentHeightPx",
        "Ly3/f;",
        "animatedHeight",
        "clinician-in-the-loop_release"
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
.method public static synthetic a(Llo0/e0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lno0/v0;->p(Llo0/e0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llo0/e0;Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lno0/v0;->o(Llo0/e0;Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/t2;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1}, Lno0/v0;->m(Lp1/t2;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/a1;Ly2/y;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lno0/v0;->n(Lp1/a1;Ly2/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Llo0/e0;ZLp1/t2;Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/a1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lno0/v0;->l(Llo0/e0;ZLp1/t2;Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/a1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Llo0/e0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llo0/e0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v5, p1

    move/from16 v7, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x5cb1926d

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    and-int/lit8 v3, v7, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v4, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v4, v7, 0x180

    if-nez v4, :cond_4

    move-object/from16 v4, p2

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_3

    :cond_6
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit16 v6, v0, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v6, v8, :cond_7

    move v6, v10

    goto :goto_5

    :cond_7
    move v6, v9

    :goto_5
    and-int/2addr v0, v10

    invoke-virtual {v11, v0, v6}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_10

    if-eqz v3, :cond_8

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v14, v0

    goto :goto_6

    :cond_8
    move-object v14, v4

    :goto_6
    invoke-virtual {v1}, Llo0/e0;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_9

    if-ne v3, v4, :cond_a

    :cond_9
    invoke-virtual {v1}, Llo0/e0;->g()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v3, Lp1/c1;

    invoke-virtual {v1}, Llo0/e0;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_b

    if-ne v6, v4, :cond_c

    :cond_b
    invoke-static {v9, v11}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v6

    :cond_c
    check-cast v6, Lp1/a1;

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v11, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/c;

    invoke-static {v6}, Lno0/v0;->i(Lp1/a1;)I

    move-result v4

    invoke-interface {v0, v4}, Ly3/c;->e0(I)F

    move-result v0

    invoke-virtual {v1}, Llo0/e0;->b()F

    move-result v4

    invoke-static {v0, v4}, Ljava/lang/Float;->compare(FF)I

    move-result v4

    if-lez v4, :cond_d

    move v4, v10

    goto :goto_7

    :cond_d
    move v4, v9

    :goto_7
    invoke-static {v6}, Lno0/v0;->i(Lp1/a1;)I

    move-result v8

    if-nez v8, :cond_e

    invoke-virtual {v1}, Llo0/e0;->b()F

    move-result v0

    :goto_8
    move v8, v0

    goto :goto_9

    :cond_e
    invoke-static {v3}, Lno0/v0;->g(Lp1/c1;)Z

    move-result v8

    if-eqz v8, :cond_f

    goto :goto_8

    :cond_f
    invoke-virtual {v1}, Llo0/e0;->b()F

    move-result v8

    invoke-static {v0, v8}, Ljava/lang/Math;->min(FF)F

    move-result v0

    goto :goto_8

    :goto_9
    const/16 v0, 0x12c

    sget-object v10, Ld0/b0;->a:Ld0/v;

    invoke-static {v0, v9, v10, v2}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v9

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v10, 0x0

    invoke-static/range {v8 .. v13}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v2, v11, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->a1()J

    move-result-wide v9

    move v2, v4

    move-object v4, v3

    move-object v3, v0

    new-instance v0, Lc41/t1;

    invoke-direct/range {v0 .. v6}, Lc41/t1;-><init>(Llo0/e0;ZLp1/t2;Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/a1;)V

    const v1, 0x593ba403

    invoke-static {v1, v11, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v16

    const/high16 v18, 0xc00000

    const/16 v19, 0x7a

    move-object/from16 v17, v11

    move-wide v10, v9

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v0, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v8 .. v19}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v17

    move-object v4, v0

    goto :goto_a

    :cond_10
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_11

    new-instance v0, Lm31/h;

    const/16 v3, 0x11

    move-object/from16 v5, p0

    move-object/from16 v6, p1

    move/from16 v2, p5

    move v1, v7

    invoke-direct/range {v0 .. v6}, Lm31/h;-><init>(IIILandroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final g(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final h(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final i(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final j(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final k(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/f;

    iget p0, p0, Ly3/f;->w:F

    return p0
.end method

.method private static final l(Llo0/e0;ZLp1/t2;Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/a1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v10, p5

    sget-object v11, Lb2/e;->M:Lb2/k;

    and-int/lit8 v3, p7, 0x3

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    move v3, v12

    goto :goto_0

    :cond_0
    move v3, v13

    :goto_0
    and-int/lit8 v5, p7, 0x1

    move-object/from16 v7, p6

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_1c

    int-to-float v14, v4

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float v15, v14, v3

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v15, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->c:Ll0/g;

    invoke-static {v6, v11, v7, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v13, v7, Lp1/q;->S:Z

    if-eqz v13, :cond_1

    invoke-virtual {v7, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_1
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v7, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v7, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    move/from16 v16, v3

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-nez v3, :cond_2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 p6, v4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_2

    :cond_2
    move-object/from16 p6, v4

    :goto_2
    invoke-static {v8, v7, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v7, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Llo0/e0;->f()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_8

    const v4, 0x625e75dc

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    move-object/from16 p7, v6

    const-wide/high16 v5, 0x4004000000000000L    # 2.5

    double-to-float v5, v5

    mul-float v20, v5, v16

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, p6

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static/range {v20 .. v20}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    const/4 v4, 0x6

    invoke-static {v6, v11, v7, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move-object/from16 p6, v5

    iget-wide v4, v7, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    move-object/from16 v8, p6

    invoke-static {v7, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v7}, Lp1/q;->i0()V

    move/from16 p6, v15

    iget-boolean v15, v7, Lp1/q;->S:Z

    if-eqz v15, :cond_4

    invoke-virtual {v7, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v7, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v6, p7

    invoke-static {v7, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-nez v5, :cond_5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v4, v7, v4, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v7, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, -0x5db0395a

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Llo0/e0;->f()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm91/u;

    invoke-static {}, Lmo0/b;->y()Lm91/p;

    move-result-object v4

    sget v5, Lm91/p;->b:I

    shl-int/lit8 v8, v5, 0x3

    const/4 v9, 0x4

    const/4 v5, 0x0

    move-object/from16 v6, p4

    move-object/from16 v13, v16

    const/4 v15, 0x6

    invoke-static/range {v3 .. v9}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_7
    move-object/from16 v13, v16

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v15, 0x6

    invoke-static {v7, v4, v3, v4}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_5

    :cond_8
    move-object/from16 v13, p6

    move/from16 p6, v15

    const/4 v4, 0x0

    const/4 v15, 0x6

    const v3, 0x626655b5

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v0}, Llo0/e0;->e()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1b

    const v3, 0x62687a81

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v1}, Lno0/v0;->k(Lp1/t2;)F

    move-result v5

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->s(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v2}, Lno0/v0;->g(Lp1/c1;)Z

    move-result v5

    if-nez v5, :cond_9

    if-eqz p1, :cond_9

    const/4 v5, 0x1

    goto :goto_6

    :cond_9
    const/4 v5, 0x0

    :goto_6
    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v6, :cond_a

    if-ne v8, v12, :cond_b

    :cond_a
    new-instance v8, Lb;

    const/16 v6, 0x8

    invoke-direct {v8, v1, v6}, Lb;-><init>(Lp1/t2;I)V

    invoke-virtual {v7, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v4, v5, v8}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v4, Lb2/e;->w:Lb2/m;

    const/4 v5, 0x0

    invoke-static {v4, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_c

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_c
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_7
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v7, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v7, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v15, v7, Lp1/q;->S:Z

    if-nez v15, :cond_d

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v15, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    :cond_d
    invoke-static {v5, v7, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v7, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, Lb2/e;->J:Lb2/l;

    const/4 v15, 0x1

    invoke-static {v1, v5, v15}, Landroidx/compose/foundation/layout/d;->w(Landroidx/compose/ui/Modifier;Lb2/g;Z)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v7, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v5, :cond_f

    if-ne v15, v12, :cond_10

    :cond_f
    new-instance v15, Lfc0/f;

    const/4 v5, 0x6

    invoke-direct {v15, v10, v5}, Lfc0/f;-><init>(Lp1/a1;I)V

    invoke-virtual {v7, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v15, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v15}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static/range {p6 .. p6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    const/4 v15, 0x6

    invoke-static {v5, v11, v7, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v10, v7, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v7, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v15, v7, Lp1/q;->S:Z

    if-eqz v15, :cond_11

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_11
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v7, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-nez v4, :cond_12

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_13

    :cond_12
    invoke-static {v10, v7, v10, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v7, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0x34c960d5    # -1.1968299E7f

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Llo0/e0;->e()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm91/u;

    invoke-static {}, Lmo0/b;->y()Lm91/p;

    move-result-object v4

    sget v5, Lm91/p;->b:I

    shl-int/lit8 v8, v5, 0x3

    const/4 v9, 0x4

    const/4 v5, 0x0

    move-object/from16 v6, p4

    invoke-static/range {v3 .. v9}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_9

    :cond_14
    move-object/from16 v6, p4

    const/4 v4, 0x0

    const/4 v15, 0x1

    invoke-static {v7, v4, v15, v15}, Lm4/a;->y(Lp1/q;ZZZ)V

    if-eqz p1, :cond_1a

    const v1, 0x627b10c3

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x4

    int-to-float v1, v1

    invoke-static {v14, v1, v13, v7}, Ld;->w(FFLb2/t;Lp1/q;)V

    invoke-static {v2}, Lno0/v0;->g(Lp1/c1;)Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-virtual {v0}, Llo0/e0;->a()Lny0/p0;

    move-result-object v1

    goto :goto_a

    :cond_15
    invoke-virtual {v0}, Llo0/e0;->c()Lny0/p0;

    move-result-object v1

    :goto_a
    invoke-static {v2}, Lno0/v0;->g(Lp1/c1;)Z

    move-result v3

    if-eqz v3, :cond_16

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/w;->h()I

    move-result v3

    goto :goto_b

    :cond_16
    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/w;->g()I

    move-result v3

    :goto_b
    invoke-virtual {v1}, Lny0/p0;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v16

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v7, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->k()Lb91/a;

    move-result-object v4

    invoke-virtual {v1}, Lny0/p0;->k()Ly71/g;

    move-result-object v1

    if-eqz v1, :cond_17

    invoke-virtual {v1}, Ly71/g;->b()I

    move-result v3

    :cond_17
    const/4 v5, 0x0

    int-to-float v1, v5

    new-instance v5, Ll0/l1;

    invoke-direct {v5, v1, v1, v1, v1}, Ll0/l1;-><init>(FFFF)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v20

    invoke-virtual {v7, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v7, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_18

    if-ne v3, v12, :cond_19

    :cond_18
    new-instance v3, Ln0/j;

    const/4 v1, 0x4

    invoke-direct {v3, v0, v2, v6, v1}, Ln0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    move-object/from16 v24, v3

    check-cast v24, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    const/16 v17, 0x6

    shl-int/lit8 v0, v0, 0x6

    const/high16 v1, 0x36030000

    or-int/2addr v0, v1

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v1, v1, 0x9

    or-int v26, v0, v1

    const/16 v27, 0x0

    const/16 v28, 0x93

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v17, v4

    move-object/from16 v23, v5

    move-object/from16 v25, v7

    invoke-static/range {v14 .. v28}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    const/4 v4, 0x0

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_1a
    const/4 v4, 0x0

    const v0, 0x628f81b5

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    :goto_d
    const/4 v15, 0x1

    goto :goto_e

    :cond_1b
    const/4 v4, 0x0

    const v0, 0x628fb7f5

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    goto :goto_d

    :goto_e
    invoke-virtual {v7, v15}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_1c
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_f
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m(Lp1/t2;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "$this$applyIf"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lno0/v0;->k(Lp1/t2;)F

    move-result p0

    const v0, 0x3ecccccd    # 0.4f

    mul-float/2addr p0, v0

    invoke-static {p1, p0}, Lgb1/c;->e(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Lp1/a1;Ly2/y;)Ll83/a0;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ly2/y;->n()J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p1, v0

    invoke-static {p0, p1}, Lno0/v0;->j(Lp1/a1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Llo0/e0;Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    invoke-static {p1}, Lno0/v0;->g(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v1, v0, 0x1

    invoke-static {p1, v1}, Lno0/v0;->h(Lp1/c1;Z)V

    if-nez v0, :cond_0

    invoke-virtual {p0}, Llo0/e0;->c()Lny0/p0;

    move-result-object p0

    invoke-virtual {p0}, Lny0/p0;->f()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Llo0/e0;->a()Lny0/p0;

    move-result-object p0

    invoke-virtual {p0}, Lny0/p0;->f()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    const/4 p1, 0x0

    invoke-static {p1, p0, p2}, Lev/n;->y(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;)V

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Llo0/e0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lno0/v0;->f(Llo0/e0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
