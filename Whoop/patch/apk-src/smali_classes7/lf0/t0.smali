.class public abstract Llf0/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000e\u00b2\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\r\u001a\u00020\u000c8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lld0/p;",
        "viewState",
        "Lkotlin/Function1;",
        "Llf0/q0;",
        "Ll83/a0;",
        "onViewEvent",
        "h",
        "(Landroidx/compose/ui/Modifier;Lld0/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "isExpanded",
        "",
        "rotationAngle",
        "advanced-labs_release"
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
.method public static synthetic a(Lld0/p;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Llf0/t0;->p(Lld0/p;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llf0/t0;->n(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lld0/p;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Llf0/t0;->r(Landroidx/compose/ui/Modifier;Lld0/p;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lny0/p0;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Llf0/t0;->q(Lkotlin/jvm/functions/Function1;Lny0/p0;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lp1/c1;Lld0/p;Lp1/t2;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Llf0/t0;->m(Lkotlin/jvm/functions/Function1;Lp1/c1;Lld0/p;Lp1/t2;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lld0/p;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Llf0/t0;->o(Lld0/p;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Llf0/q0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llf0/t0;->i(Llf0/q0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/Modifier;Lld0/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lld0/p;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v3, p1

    move/from16 v6, p4

    const-string v0, "viewState"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x5ed6e545

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v6, 0x6

    move v2, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v6, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v6

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v2, v6

    :goto_1
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_4
    and-int/lit8 v4, p5, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move-object/from16 v5, p2

    :goto_3
    move v14, v2

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v6, 0x180

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v2, v7

    goto :goto_3

    :goto_5
    and-int/lit16 v2, v14, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x0

    if-eq v2, v7, :cond_8

    const/4 v2, 0x1

    goto :goto_6

    :cond_8
    move v2, v8

    :goto_6
    and-int/lit8 v7, v14, 0x1

    invoke-virtual {v11, v7, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_e

    if-eqz v0, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v15, v0

    goto :goto_7

    :cond_9
    move-object v15, v1

    :goto_7
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_a

    new-instance v1, Llc0/g;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Llc0/g;-><init>(I)V

    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v1, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_b
    move-object v1, v5

    :goto_8
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_c

    invoke-virtual {v3}, Lld0/p;->g()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v2, Lp1/c1;

    invoke-static {v2}, Llf0/t0;->j(Lp1/c1;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/high16 v0, -0x3ccc0000    # -180.0f

    :goto_9
    move v7, v0

    goto :goto_a

    :cond_d
    const/4 v0, 0x0

    goto :goto_9

    :goto_a
    const/16 v0, 0x12c

    const/4 v4, 0x0

    const/4 v5, 0x6

    invoke-static {v0, v8, v4, v5}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v8

    const/16 v12, 0x30

    const/16 v13, 0x1c

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v13}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v4

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v0, v11, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->a1()J

    move-result-wide v9

    new-instance v0, Lat2/u;

    const/16 v5, 0x14

    invoke-direct/range {v0 .. v5}, Lat2/u;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v2, -0x6c6cf6d5

    invoke-static {v2, v11, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    and-int/lit8 v2, v14, 0xe

    const/high16 v3, 0xc00000

    or-int v17, v2, v3

    const/16 v18, 0x7a

    const/4 v8, 0x0

    move-object/from16 v16, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v7, v15

    move-object v15, v0

    invoke-static/range {v7 .. v18}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v16

    move-object v6, v1

    move-object v4, v7

    goto :goto_b

    :cond_e
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v4, v1

    move-object v6, v5

    :goto_b
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_f

    new-instance v0, Ll72/h;

    const/16 v3, 0xe

    move-object/from16 v5, p1

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Ll72/h;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final i(Llf0/q0;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lp1/c1;)Z
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

.method private static final k(Lp1/c1;Z)V
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

.method private static final l(Lp1/t2;)F
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

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;Lp1/c1;Lld0/p;Lp1/t2;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 32

    move-object/from16 v0, p0

    and-int/lit8 v1, p5, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    and-int/lit8 v5, p5, 0x1

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_b

    int-to-float v1, v4

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v1, v4

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v6, v11, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v11, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v11, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v11, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-nez v10, :cond_2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    :cond_2
    invoke-static {v6, v11, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v11, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v10, :cond_5

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v13, v10, :cond_4

    goto :goto_2

    :cond_4
    move-object/from16 v14, p1

    goto :goto_3

    :cond_5
    :goto_2
    new-instance v13, Lbs1/i;

    const/16 v10, 0x18

    move-object/from16 v14, p1

    invoke-direct {v13, v0, v14, v10}, Lbs1/i;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_3
    move-object/from16 v16, v13

    check-cast v16, Lc93/a;

    const/16 v17, 0xf

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v12, Ll0/m;->a:Ll0/e;

    sget-object v13, Lb2/e;->J:Lb2/l;

    invoke-static {v12, v13, v11, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    iget-wide v13, v11, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v11, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_6

    invoke-virtual {v11, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v11, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v5, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-nez v5, :cond_7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    :cond_7
    invoke-static {v13, v11, v13, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v11, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v5, v1

    const-wide/16 v7, 0x0

    cmpl-double v5, v5, v7

    if-lez v5, :cond_9

    goto :goto_5

    :cond_9
    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v7, v1, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual/range {p2 .. p2}, Lld0/p;->f()Ljava/lang/String;

    move-result-object v6

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v1, v11, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->r()Lb91/a;

    move-result-object v26

    invoke-virtual {v1, v11, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v30, v10, 0x12

    const v31, 0x2fff8

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    invoke-virtual {v1}, Lx81/d;->d()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/w;->r()I

    move-result v6

    const/4 v7, 0x6

    invoke-static {v6, v11, v7}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    invoke-static/range {p1 .. p1}, Llf0/t0;->j(Lp1/c1;)Z

    move-result v7

    if-eqz v7, :cond_a

    const v7, 0x5598275

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    sget v7, Lgy0/f;->S:I

    :goto_6
    invoke-static {v11, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    const v7, 0x55987b3

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    sget v7, Lgy0/f;->p0:I

    goto :goto_6

    :goto_7
    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v3, v3

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static/range {p3 .. p3}, Llf0/t0;->l(Lp1/t2;)F

    move-result v4

    invoke-static {v4, v3}, Landroidx/room/c1;->L(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v1, v11, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v9

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    invoke-static/range {p1 .. p1}, Llf0/t0;->j(Lp1/c1;)Z

    move-result v7

    new-instance v1, Lih1/f;

    const/16 v3, 0x11

    move-object/from16 v4, p2

    invoke-direct {v1, v3, v4, v0}, Lih1/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v0, -0x59824a63

    invoke-static {v0, v11, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    const v14, 0x180006

    const/16 v15, 0x1e

    sget-object v6, Ll0/z;->a:Ll0/z;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v28, v11

    const/4 v11, 0x0

    move-object/from16 v13, v28

    invoke-static/range {v6 .. v15}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v13

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_b
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_8
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p1}, Llf0/t0;->j(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Llf0/t0;->k(Lp1/c1;Z)V

    new-instance v0, Llf0/q0$b;

    invoke-static {p1}, Llf0/t0;->j(Lp1/c1;)Z

    move-result p1

    invoke-direct {v0, p1}, Llf0/q0$b;-><init>(Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lld0/p;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 37

    move-object/from16 v11, p3

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    const/4 v3, 0x0

    invoke-static {v1, v2, v11, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move-object v2, v11

    check-cast v2, Lp1/q;

    iget-wide v4, v2, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    iget-object v9, v2, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v9, v2, Lp1/q;->S:Z

    if-eqz v9, :cond_0

    invoke-virtual {v2, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_0
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v11, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v11, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v2, Lp1/q;->S:Z

    if-nez v5, :cond_1

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    :cond_1
    invoke-static {v4, v2, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v11, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x2

    int-to-float v4, v1

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v14, v4, v5

    const/16 v16, 0x0

    const/16 v17, 0xd

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object v12, v6

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move v7, v1

    move-object/from16 v27, v12

    invoke-virtual/range {p0 .. p0}, Lld0/p;->b()Ljava/lang/String;

    move-result-object v1

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v11, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->a()Lb91/a;

    move-result-object v21

    invoke-virtual {v8, v11, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->c1()J

    move-result-wide v9

    sget v12, Lb91/a;->d:I

    shl-int/lit8 v25, v12, 0x12

    const v26, 0x2fff8

    move-object v13, v2

    move v12, v5

    move-object v2, v6

    const-wide/16 v5, 0x0

    move v14, v7

    const/4 v7, 0x0

    move-object v15, v8

    const/4 v8, 0x0

    move/from16 v16, v3

    move-wide/from16 v35, v9

    move v10, v4

    move-wide/from16 v3, v35

    const/4 v9, 0x0

    move/from16 v17, v10

    const-wide/16 v10, 0x0

    move/from16 v18, v12

    const/4 v12, 0x0

    move-object/from16 v19, v13

    const/4 v13, 0x0

    move/from16 v22, v14

    move-object/from16 v20, v15

    const-wide/16 v14, 0x0

    move/from16 v23, v16

    const/16 v16, 0x0

    move/from16 v24, v17

    const/16 v17, 0x0

    move/from16 v28, v18

    const/16 v18, 0x0

    move-object/from16 v29, v19

    const/16 v19, 0x0

    move-object/from16 v30, v20

    const/16 v20, 0x0

    move/from16 v31, v22

    const/16 v22, 0x0

    move/from16 v32, v24

    const/16 v24, 0x30

    move-object/from16 v23, p3

    move-object/from16 v0, v29

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    const/4 v1, 0x3

    int-to-float v1, v1

    mul-float v8, v1, v28

    const/4 v10, 0x0

    const/16 v11, 0xd

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v6, v27

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object v15, v6

    move v14, v8

    invoke-virtual/range {p0 .. p0}, Lld0/p;->c()Lhy0/e;

    move-result-object v2

    invoke-virtual {v2}, Lhy0/e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lld0/p;->c()Lhy0/e;

    move-result-object v2

    invoke-virtual {v2}, Lhy0/e;->b()Lhy0/g;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lld0/p;->c()Lhy0/e;

    move-result-object v3

    invoke-virtual {v3}, Lhy0/e;->a()Lhy0/f;

    move-result-object v3

    sget v16, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v16, 0x9

    or-int/lit8 v12, v5, 0x6

    const/16 v13, 0xf0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-object/from16 v11, p3

    invoke-static/range {v1 .. v13}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p0 .. p0}, Lld0/p;->e()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v12, 0x1

    if-nez v1, :cond_3

    const v1, 0x3c0d0855

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v6, 0x0

    const/16 v7, 0xd

    const/4 v3, 0x0

    const/4 v5, 0x0

    move v4, v14

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float v4, v32, v2

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    int-to-float v4, v12

    mul-float/2addr v4, v2

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    new-instance v4, Lb30/a1;

    const/16 v5, 0x1a

    move-object/from16 v13, p0

    invoke-direct {v4, v13, v5}, Lb30/a1;-><init>(Ljava/lang/Object;I)V

    const v5, 0x3ad4e567

    invoke-static {v5, v11, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const v9, 0x1801b6

    const/16 v10, 0x38

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v8, v3

    move-object v3, v2

    move-object v2, v8

    move-object v8, v11

    invoke-static/range {v1 .. v10}, Ll0/g2;->a(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_3
    move-object/from16 v13, p0

    const/4 v1, 0x0

    const v2, 0x3c1ef39b

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    :goto_1
    invoke-virtual {v13}, Lld0/p;->a()Lny0/p0;

    move-result-object v2

    if-nez v2, :cond_4

    const v2, 0x3c1fd8b6

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    move-object v13, v0

    move v11, v12

    goto/16 :goto_2

    :cond_4
    const v3, 0x3c1fd8b7

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    int-to-float v3, v12

    mul-float v10, v3, v28

    const/4 v11, 0x5

    const/4 v7, 0x0

    const/4 v9, 0x0

    move v8, v14

    move-object v6, v15

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v2}, Lny0/p0;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v5, v6, :cond_5

    sget-object v5, Llf0/t0$a;->w:Llf0/t0$a;

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v5}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v5

    move-object v7, v4

    new-instance v4, Ly71/g;

    invoke-static/range {v30 .. v30}, Lih0/d0;->E(Lx81/d;)I

    move-result v8

    const/4 v9, 0x0

    const/4 v14, 0x2

    invoke-direct {v4, v8, v9, v14, v9}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v8, p1

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_6

    if-ne v10, v6, :cond_7

    :cond_6
    new-instance v10, Llf0/s0;

    const/4 v6, 0x0

    invoke-direct {v10, v8, v2, v6}, Llf0/s0;-><init>(Lkotlin/jvm/functions/Function1;Lny0/p0;I)V

    invoke-virtual {v0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v10, Lkotlin/jvm/functions/Function1;

    const v2, 0x6000006

    shl-int/lit8 v6, v16, 0x6

    or-int/2addr v2, v6

    sget v6, Ly71/g;->c:I

    shl-int/lit8 v6, v6, 0xc

    or-int v14, v2, v6

    const/4 v15, 0x0

    const/16 v16, 0xeaa

    move/from16 v33, v1

    const/4 v1, 0x0

    move-object v13, v0

    move-object v0, v3

    const/4 v3, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v2, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v11, v12

    move-object v12, v10

    const/4 v10, 0x0

    move/from16 v17, v11

    const/4 v11, 0x0

    move-object/from16 v34, v13

    move-object/from16 v13, p3

    invoke-static/range {v0 .. v16}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v34

    const/4 v1, 0x0

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    const/4 v11, 0x1

    :goto_2
    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final p(Lld0/p;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    const-string v0, "$this$FlowRow"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v4, p2

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual/range {p0 .. p0}, Lld0/p;->e()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v5, 0x3

    int-to-float v5, v5

    const/4 v6, 0x4

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-static {v5}, Lt0/j;->e(F)Lt0/i;

    move-result-object v7

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v7}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v4, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->a1()J

    move-result-wide v10

    sget-object v12, Li2/w0;->a:Li2/v0;

    invoke-static {v7, v10, v11, v12}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v10, 0x2

    int-to-float v10, v10

    mul-float/2addr v10, v6

    invoke-static {v7, v5, v10}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v10, v4, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v4, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v12, v4, Lp1/q;->S:Z

    if-eqz v12, :cond_1

    invoke-virtual {v4, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_2
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v4, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v4, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-nez v10, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    :cond_2
    invoke-static {v7, v4, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v4, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v8, v4, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    invoke-virtual {v8, v4, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v6

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v28, v5, 0x12

    const v29, 0x2fffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

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

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v4

    move-object v4, v1

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v26

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    move-object v4, v1

    goto/16 :goto_1

    :cond_4
    move-object v1, v4

    invoke-virtual {v1}, Lp1/q;->X()V

    :cond_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;Lny0/p0;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Llf0/q0$a;

    invoke-virtual {p1}, Lny0/p0;->j()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p2, p1}, Llf0/q0$a;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Landroidx/compose/ui/Modifier;Lld0/p;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Llf0/t0;->h(Landroidx/compose/ui/Modifier;Lld0/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
