.class public abstract Lrs2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a?\u0010\n\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0005H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a?\u0010\u000e\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000c2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0005H\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u001f\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u0014H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001b\u00b2\u0006\u000e\u0010\u0018\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lp31/l;",
        "headerSection",
        "",
        "Lm91/u;",
        "carouselItems",
        "Lkotlin/Function2;",
        "",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "l",
        "(Lp31/l;Ljava/util/List;Lc93/m;Landroidx/compose/runtime/Composer;I)V",
        "Lq0/y;",
        "pagerState",
        "q",
        "(Lq0/y;Ljava/util/List;Lc93/m;Landroidx/compose/runtime/Composer;I)V",
        "pageCount",
        "activePage",
        "o",
        "(IILandroidx/compose/runtime/Composer;I)V",
        "",
        "isActive",
        "z",
        "(ZLandroidx/compose/runtime/Composer;I)V",
        "maxHeightPx",
        "Li2/x;",
        "dotColor",
        "weekly-plan_release"
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
.method private static final A(Lp1/t2;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")J"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li2/x;

    iget-wide v0, p0, Li2/x;->a:J

    return-wide v0
.end method

.method private static final B(FLp1/t2;Lk2/e;)Ll83/a0;
    .locals 13

    const-string v0, "$this$Canvas"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lrs2/a;->A(Lp1/t2;)J

    move-result-wide v2

    invoke-interface {p2, p0}, Ly3/c;->q0(F)F

    move-result p1

    invoke-interface {p2, p0}, Ly3/c;->q0(F)F

    move-result v0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v4, p1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v0, p1

    const/16 p1, 0x20

    shl-long/2addr v4, p1

    const-wide v6, 0xffffffffL

    and-long/2addr v0, v6

    or-long/2addr v0, v4

    invoke-interface {p2, p0}, Ly3/c;->q0(F)F

    move-result v4

    invoke-interface {p2, p0}, Ly3/c;->q0(F)F

    move-result p0

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v8, p0

    shl-long p0, v4, p1

    and-long v4, v8, v6

    or-long v8, p0, v4

    const/4 v11, 0x0

    const/16 v12, 0xf2

    const-wide/16 v4, 0x0

    const/4 v10, 0x0

    move-wide v6, v0

    move-object v1, p2

    invoke-static/range {v1 .. v12}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lrs2/a;->z(ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lp31/l;Ljava/util/List;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lrs2/a;->n(Lp31/l;Ljava/util/List;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/m;ILjava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lrs2/a;->x(Lc93/m;ILjava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(FLp1/t2;Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lrs2/a;->B(FLp1/t2;Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrs2/a;->p(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/util/List;Ljava/util/List;Lc93/m;Lp1/a1;Lq0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lrs2/a;->w(Ljava/util/List;Ljava/util/List;Lc93/m;Lp1/a1;Lq0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lz1/s;ILp1/a1;Ly2/y;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lrs2/a;->u(Lz1/s;ILp1/a1;Ly2/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Li2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrs2/a;->t(Li2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lq0/y;Ljava/util/List;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lrs2/a;->y(Lq0/y;Ljava/util/List;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lrs2/a;->C(ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lp1/a1;Ly2/y;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lrs2/a;->v(Lp1/a1;Ly2/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljava/util/List;)I
    .locals 0

    invoke-static {p0}, Lrs2/a;->m(Ljava/util/List;)I

    move-result p0

    return p0
.end method

.method public static final l(Lp31/l;Ljava/util/List;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp31/l;",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move/from16 v9, p4

    const-string v1, "headerSection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "carouselItems"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p3

    check-cast v4, Lp1/q;

    const v1, 0x2d14e5f6

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v9, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_2

    and-int/lit8 v1, v9, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    or-int/2addr v1, v9

    goto :goto_2

    :cond_2
    move v1, v9

    :goto_2
    and-int/lit8 v3, v9, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v4, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v1, v3

    :cond_4
    and-int/lit16 v3, v9, 0x180

    if-nez v3, :cond_6

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const/16 v3, 0x100

    goto :goto_4

    :cond_5
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v1, v3

    :cond_6
    move v10, v1

    and-int/lit16 v1, v10, 0x93

    const/16 v3, 0x92

    const/4 v12, 0x0

    if-eq v1, v3, :cond_7

    const/4 v1, 0x1

    goto :goto_5

    :cond_7
    move v1, v12

    :goto_5
    and-int/lit8 v3, v10, 0x1

    invoke-virtual {v4, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual {v4, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_8

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v3, v1, :cond_9

    :cond_8
    new-instance v3, Lh02/z;

    const/4 v1, 0x3

    invoke-direct {v3, v7, v1}, Lh02/z;-><init>(Ljava/util/List;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lc93/a;

    const/4 v1, 0x3

    invoke-static {v3, v12, v12, v4, v1}, Lq0/c0;->b(Lc93/a;IILandroidx/compose/runtime/Composer;I)Lq0/b;

    move-result-object v13

    sget-object v1, Ll0/m;->c:Ll0/g;

    const/16 v3, 0x12c

    const/4 v5, 0x0

    const/4 v6, 0x6

    invoke-static {v3, v12, v5, v6}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v3

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v3, v2}, Landroidx/compose/animation/c;->a(Landroidx/compose/ui/Modifier;Ld0/e2;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v1, v5, v4, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_a

    invoke-virtual {v4, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_6
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v4, v11, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v4, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v12, v4, Lp1/q;->S:Z

    if-nez v12, :cond_b

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v12, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    :cond_b
    invoke-static {v5, v4, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v4, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v3, 0x2

    int-to-float v5, v3

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float/2addr v12, v5

    const/4 v5, 0x0

    invoke-static {v14, v12, v5, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->w:Lb2/m;

    const/4 v0, 0x0

    invoke-static {v5, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v7, v4, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v4, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-eqz v8, :cond_d

    invoke-virtual {v4, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_d
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v4, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v4, Lp1/q;->S:Z

    if-nez v1, :cond_e

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    :cond_e
    invoke-static {v0, v4, v0, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v4, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Lp31/l;->c:I

    and-int/lit8 v1, v10, 0xe

    or-int v5, v0, v1

    const/16 v6, 0xe

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    and-int/lit16 v1, v10, 0x3f0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-static {v13, v2, v3, v4, v1}, Lrs2/a;->q(Lq0/y;Ljava/util/List;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v0, :cond_10

    const v0, 0x418274ba

    invoke-static {v4, v0, v14, v12, v4}, Lte0/d;->z(Lp1/q;ILb2/t;FLp1/q;)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v13}, Lq0/y;->k()I

    move-result v1

    const/4 v5, 0x0

    invoke-static {v0, v1, v4, v5}, Lrs2/a;->o(IILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v5}, Lp1/q;->q(Z)V

    :goto_8
    const/4 v0, 0x1

    goto :goto_9

    :cond_10
    const/4 v5, 0x0

    const v0, 0x4185ae96

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v5}, Lp1/q;->q(Z)V

    goto :goto_8

    :goto_9
    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_11
    move-object v2, v7

    move-object v3, v8

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_12

    new-instance v0, Lnx1/g;

    const/16 v5, 0x1b

    move-object/from16 v1, p0

    move v4, v9

    invoke-direct/range {v0 .. v5}, Lnx1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final m(Ljava/util/List;)I
    .locals 0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method private static final n(Lp31/l;Ljava/util/List;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lrs2/a;->l(Lp31/l;Ljava/util/List;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(IILandroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p2, Lp1/q;

    const v0, 0x65a93be7

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->e(I)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_4

    move v1, v4

    goto :goto_3

    :cond_4
    move v1, v3

    :goto_3
    and-int/2addr v0, v4

    invoke-virtual {p2, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object v0, Lb2/e;->K:Lb2/l;

    sget-object v1, Ll0/m;->a:Ll0/e;

    int-to-float v1, v4

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sget-object v2, Lb2/e;->N:Lb2/k;

    invoke-static {v1, v2}, Ll0/m;->j(FLb2/f;)Ll0/k;

    move-result-object v1

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v5, 0x36

    invoke-static {v1, v0, p2, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v5, p2, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {p2}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {p2, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p2}, Lp1/q;->i0()V

    iget-boolean v7, p2, Lp1/q;->S:Z

    if-eqz v7, :cond_5

    invoke-virtual {p2, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {p2}, Lp1/q;->s0()V

    :goto_4
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p2, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {p2, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v5, p2, Lp1/q;->S:Z

    if-nez v5, :cond_6

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    :cond_6
    invoke-static {v1, p2, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {p2, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x48abdede

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    move v0, v3

    :goto_5
    if-ge v0, p0, :cond_9

    if-ne v0, p1, :cond_8

    move v1, v4

    goto :goto_6

    :cond_8
    move v1, v3

    :goto_6
    invoke-static {v1, p2, v3}, Lrs2/a;->z(ZLandroidx/compose/runtime/Composer;I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_9
    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_b

    new-instance v0, Lid2/q;

    const/4 v1, 0x3

    invoke-direct {v0, p0, p1, p3, v1}, Lid2/q;-><init>(IIII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final p(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lrs2/a;->o(IILandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lq0/y;Ljava/util/List;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq0/y;",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p1

    move/from16 v6, p4

    sget-object v0, Lb2/e;->w:Lb2/m;

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v2, 0x1d89b551

    invoke-virtual {v11, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v6, 0x6

    const/4 v3, 0x4

    move-object/from16 v14, p0

    if-nez v2, :cond_1

    invoke-virtual {v11, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v6

    goto :goto_1

    :cond_1
    move v2, v6

    :goto_1
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :cond_3
    and-int/lit16 v5, v6, 0x180

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v2, v7

    :goto_4
    move v15, v2

    goto :goto_5

    :cond_5
    move-object/from16 v5, p2

    goto :goto_4

    :goto_5
    and-int/lit16 v2, v15, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x0

    if-eq v2, v7, :cond_6

    const/4 v2, 0x1

    goto :goto_6

    :cond_6
    move v2, v8

    :goto_6
    and-int/lit8 v7, v15, 0x1

    invoke-virtual {v11, v7, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1f

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v2, v7, :cond_7

    new-instance v2, Lz1/s;

    invoke-direct {v2}, Lz1/s;-><init>()V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lz1/s;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v7, :cond_8

    invoke-static {v8, v11}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v10

    :cond_8
    check-cast v10, Lp1/a1;

    sget-object v12, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v11, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ly3/c;

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v13, :cond_9

    if-ne v9, v7, :cond_d

    :cond_9
    move-object v9, v1

    check-cast v9, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v9, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v13, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lm91/u;

    instance-of v8, v9, Ly41/f;

    if-eqz v8, :cond_a

    move-object/from16 v18, v9

    check-cast v18, Ly41/f;

    const/16 v28, 0xff

    const/16 v29, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v18 .. v29}, Ly41/f;->b(Ly41/f;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ly41/i;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly41/e;ZILjava/lang/Object;)Ly41/f;

    move-result-object v9

    goto :goto_8

    :cond_a
    instance-of v8, v9, Lk11/f;

    if-eqz v8, :cond_b

    move-object/from16 v18, v9

    check-cast v18, Lk11/f;

    const/16 v32, 0x1dff

    const/16 v33, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v18 .. v33}, Lk11/f;->b(Lk11/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lhy0/h1;Lny0/h;Lny0/h;Lf01/q1;Lk11/a;ZZLcom/whoop/analytics/AnalyticEventModel;FILjava/lang/Object;)Lk11/f;

    move-result-object v9

    :cond_b
    :goto_8
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v8, 0x0

    goto :goto_7

    :cond_c
    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v9, v13

    :cond_d
    move-object v4, v9

    check-cast v4, Ljava/util/List;

    invoke-static {v10}, Lrs2/a;->r(Lp1/a1;)I

    move-result v8

    sget-object v9, Lb2/t;->w:Lb2/t;

    const/4 v13, 0x3

    move/from16 v18, v8

    if-lez v18, :cond_e

    invoke-static {v10}, Lrs2/a;->r(Lp1/a1;)I

    move-result v8

    invoke-interface {v12, v8}, Ly3/c;->e0(I)F

    move-result v8

    int-to-float v12, v13

    int-to-float v13, v3

    mul-float/2addr v12, v13

    add-float/2addr v12, v8

    invoke-static {v12, v9}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    goto :goto_9

    :cond_e
    move v8, v13

    const/4 v12, 0x0

    invoke-static {v9, v12, v8}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v13

    move-object v8, v13

    :goto_9
    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/4 v3, 0x0

    invoke-static {v0, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    move-object/from16 v22, v4

    iget-wide v3, v11, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v11, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v23, La3/l;->a:La3/k;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-eqz v5, :cond_f

    invoke-virtual {v11, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_f
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_a
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v11, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v11, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v11, Lp1/q;->S:Z

    if-nez v6, :cond_10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v23, v8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    goto :goto_b

    :cond_10
    move-object/from16 v23, v8

    :goto_b
    invoke-static {v3, v11, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v11, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10}, Lrs2/a;->r(Lp1/a1;)I

    move-result v6

    if-lez v6, :cond_1d

    const v6, 0x21bf4c74

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/4 v6, 0x3

    const/4 v8, 0x0

    invoke-static {v13, v8, v6}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v7, :cond_12

    new-instance v6, Lrm2/d;

    const/16 v8, 0xf

    invoke-direct {v6, v8}, Lrm2/d;-><init>(I)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v13, v6}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v8, 0x0

    invoke-static {v0, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    move/from16 v26, v15

    iget-wide v14, v11, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_13

    invoke-virtual {v11, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_13
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v11, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v12, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-nez v1, :cond_14

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    :cond_14
    invoke-static {v8, v11, v8, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v11, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x5bd17ae

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    move-object/from16 v4, v22

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    if-ltz v3, :cond_1b

    check-cast v4, Lm91/u;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v12, 0x2

    int-to-float v13, v12

    const/16 v14, 0x8

    int-to-float v15, v14

    mul-float/2addr v13, v15

    const/4 v15, 0x0

    invoke-static {v8, v13, v15, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v11, v3}, Lp1/q;->e(I)Z

    move-result v12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_16

    if-ne v13, v7, :cond_17

    :cond_16
    new-instance v13, Lcom/whoop/data/local/room/dao/wipeable/d;

    const/16 v12, 0xe

    invoke-direct {v13, v2, v3, v10, v12}, Lcom/whoop/data/local/room/dao/wipeable/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v13}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v8, 0x0

    invoke-static {v0, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    move-object v13, v7

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v11, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_18

    invoke-virtual {v11, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_18
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_e
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v11, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v11, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-nez v8, :cond_19

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1a

    :cond_19
    invoke-static {v6, v11, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v11, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v12, 0x0

    move-object v3, v13

    const/16 v13, 0xe

    const/4 v8, 0x0

    move-object v6, v9

    const/4 v9, 0x0

    move-object v7, v10

    const/4 v10, 0x0

    move-object/from16 p3, v7

    move-object v7, v4

    move-object/from16 v4, p3

    move-object v15, v3

    move/from16 p3, v5

    move-object v14, v6

    move-object/from16 v3, v23

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/16 v25, 0x0

    invoke-static/range {v7 .. v13}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    move-object v10, v4

    move-object v9, v14

    move-object v7, v15

    move/from16 v3, p3

    goto/16 :goto_d

    :cond_1b
    const/16 v25, 0x0

    invoke-static {}, Lwb3/f;->d0()V

    throw v25

    :cond_1c
    move-object v15, v7

    move-object v14, v9

    move-object v4, v10

    move-object/from16 v3, v23

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v11, v6, v5, v6}, Lm4/a;->y(Lp1/q;ZZZ)V

    :goto_f
    const/high16 v6, 0x3f800000    # 1.0f

    goto :goto_10

    :cond_1d
    move-object v14, v9

    move-object v4, v10

    move/from16 v26, v15

    move-object/from16 v3, v23

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v15, v7

    const v0, 0x21d03c37

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    invoke-static {v6, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v0, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v15, :cond_1e

    new-instance v1, Lfc0/f;

    const/16 v2, 0xa

    invoke-direct {v1, v4, v2}, Lfc0/f;-><init>(Lp1/a1;I)V

    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v6, 0x3

    int-to-float v0, v6

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float v12, v0, v1

    const/4 v0, 0x2

    int-to-float v0, v0

    const/16 v14, 0x8

    int-to-float v1, v14

    mul-float/2addr v0, v1

    mul-float/2addr v1, v1

    const/4 v15, 0x0

    invoke-static {v0, v12, v1, v15, v14}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v9

    sget-object v13, Lb2/e;->J:Lb2/l;

    new-instance v0, Lbm0/f;

    move v1, v5

    const/16 v5, 0x8

    move-object/from16 v3, p2

    move v6, v1

    move-object/from16 v2, v22

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v5}, Lbm0/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v1, -0x5b607d6

    invoke-static {v1, v11, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v19

    and-int/lit8 v0, v26, 0xe

    const/high16 v1, 0x1b0000

    or-int v21, v0, v1

    const/16 v22, 0x6000

    const/16 v23, 0x3f98

    const/4 v10, 0x0

    move-object/from16 v20, v11

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v7, p0

    invoke-static/range {v7 .. v23}, Ldp/d;->d(Lq0/y;Landroidx/compose/ui/Modifier;Ll0/k1;Lq0/e;IFLb2/g;Lh0/p3;ZLt2/a;Li0/n;Lf0/k;Lx1/b;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v20

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_1f
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_11
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_20

    new-instance v0, Lnx1/g;

    const/16 v5, 0x1c

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lnx1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final r(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final s(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final t(Li2/g0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    check-cast p0, Li2/x0;

    invoke-virtual {p0, v0}, Li2/x0;->a(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lz1/s;ILp1/a1;Ly2/y;)Ll83/a0;
    .locals 4

    const-string v0, "coordinates"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3}, Ly2/y;->n()J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p3, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz1/s;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v0, p3, :cond_2

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p0, p1, p3}, Lz1/s;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, p0, Lz1/s;->z:Lz1/m;

    invoke-static {p0}, Lm83/s;->S0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    invoke-static {p2}, Lrs2/a;->r(Lp1/a1;)I

    move-result p1

    if-eq p0, p1, :cond_2

    invoke-static {p2, p0}, Lrs2/a;->s(Lp1/a1;I)V

    :cond_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lp1/a1;Ly2/y;)Ll83/a0;
    .locals 4

    const-string v0, "coordinates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lrs2/a;->r(Lp1/a1;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Ly2/y;->n()J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p1, v0

    if-lez p1, :cond_0

    invoke-static {p0, p1}, Lrs2/a;->s(Lp1/a1;I)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Ljava/util/List;Ljava/util/List;Lc93/m;Lp1/a1;Lq0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    const-string v0, "$this$HorizontalPager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lrs2/a;->r(Lp1/a1;)I

    move-result p3

    if-lez p3, :cond_0

    invoke-interface {p0, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    check-cast p0, Lm91/u;

    move-object p1, p0

    goto :goto_1

    :cond_0
    invoke-interface {p1, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :goto_1
    check-cast p6, Lp1/q;

    invoke-virtual {p6, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    and-int/lit8 p3, p7, 0x70

    xor-int/lit8 p3, p3, 0x30

    const/16 p4, 0x20

    if-le p3, p4, :cond_1

    invoke-virtual {p6, p5}, Lp1/q;->e(I)Z

    move-result p3

    if-nez p3, :cond_2

    :cond_1
    and-int/lit8 p3, p7, 0x30

    if-ne p3, p4, :cond_3

    :cond_2
    const/4 p3, 0x1

    goto :goto_2

    :cond_3
    const/4 p3, 0x0

    :goto_2
    or-int/2addr p0, p3

    invoke-virtual {p6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p0, :cond_4

    sget-object p0, Lp1/l;->a:Lp1/v0;

    if-ne p3, p0, :cond_5

    :cond_4
    new-instance p3, Lkw1/a;

    const/4 p0, 0x1

    invoke-direct {p3, p2, p5, p0}, Lkw1/a;-><init>(Lc93/m;II)V

    invoke-virtual {p6, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object p4, p3

    check-cast p4, Lkotlin/jvm/functions/Function1;

    move-object p5, p6

    const/4 p6, 0x0

    const/4 p7, 0x6

    const/4 p2, 0x0

    const/4 p3, 0x0

    invoke-static/range {p1 .. p7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lc93/m;ILjava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p2, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lq0/y;Ljava/util/List;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lrs2/a;->q(Lq0/y;Ljava/util/List;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(ZLandroidx/compose/runtime/Composer;I)V
    .locals 10

    move-object v4, p1

    check-cast v4, Lp1/q;

    const p1, -0x28ac7fcc

    invoke-virtual {v4, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v7, 0x4

    const/4 v8, 0x2

    if-nez p1, :cond_1

    invoke-virtual {v4, p0}, Lp1/q;->h(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v7

    goto :goto_0

    :cond_0
    move p1, v8

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 v0, p1, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v8, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    and-int/2addr p1, v1

    invoke-virtual {v4, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_6

    if-eqz p0, :cond_3

    const p1, 0x5074553e

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget v0, Lx81/d;->b:I

    invoke-static {p1, v4, v0, v2}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v0

    goto :goto_3

    :cond_3
    const p1, 0x5074597b

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget v0, Lx81/d;->b:I

    invoke-static {p1, v4, v0, v2}, Lih0/d0;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v0

    :goto_3
    const/16 p1, 0x12c

    const/4 v3, 0x0

    const/4 v9, 0x6

    invoke-static {p1, v2, v3, v9}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v2

    const/16 v5, 0x1b0

    const/16 v6, 0x8

    const-string v3, "dot_color"

    invoke-static/range {v0 .. v6}, Lc0/m1;->a(JLd0/c0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object p1

    int-to-float v0, v8

    int-to-float v1, v7

    mul-float/2addr v0, v1

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v0, v0}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_4

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_5

    :cond_4
    new-instance v3, Lbb2/d;

    const/4 v2, 0x2

    invoke-direct {v3, v0, p1, v2}, Lbb2/d;-><init>(FLp1/t2;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3, v4, v9}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_6
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance v0, Lbb2/e;

    const/4 v1, 0x3

    invoke-direct {v0, p0, p2, v1}, Lbb2/e;-><init>(ZII)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method
