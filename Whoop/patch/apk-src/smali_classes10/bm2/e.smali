.class public abstract Lbm2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a+\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0017\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lbm2/f;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "g",
        "(Landroidx/compose/ui/Modifier;Lbm2/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "m",
        "(Lbm2/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "k",
        "(Lbm2/f;Landroidx/compose/runtime/Composer;I)V",
        "Ll3/g;",
        "input",
        "p",
        "(Ll3/g;Landroidx/compose/runtime/Composer;I)Ll3/g;",
        "trends_release"
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
.method public static synthetic a(Lbm2/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbm2/e;->i(Lbm2/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lbm2/i0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lbm2/e;->n(Lkotlin/jvm/functions/Function1;Lbm2/i0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lbm2/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lbm2/e;->j(Landroidx/compose/ui/Modifier;Lbm2/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lbm2/f;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbm2/e;->l(Lbm2/f;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbm2/e;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lbm2/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lbm2/e;->o(Lbm2/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Lbm2/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lbm2/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, 0x4c8c86a7    # 7.367609E7f

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v3, v4, 0x6

    move v5, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v4, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    move v5, v1

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v5, v5, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v14, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_3

    :cond_7
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v5, v8

    :goto_4
    and-int/lit16 v8, v5, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x1

    if-eq v8, v9, :cond_8

    move v8, v10

    goto :goto_5

    :cond_8
    const/4 v8, 0x0

    :goto_5
    and-int/2addr v5, v10

    invoke-virtual {v14, v5, v8}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_c

    sget-object v7, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v3, v7

    :cond_9
    if-eqz v6, :cond_b

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v0, v5, :cond_a

    new-instance v0, Lb72/a;

    const/16 v5, 0x17

    invoke-direct {v0, v5}, Lb72/a;-><init>(I)V

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v0, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_b
    move-object/from16 v0, p2

    :goto_6
    int-to-float v1, v1

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v9, v1, v5

    const/4 v11, 0x0

    const/16 v12, 0xd

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface {v1, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v1, v14, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->W0()J

    move-result-wide v7

    sget-object v1, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v1}, Lkd1/w;->a()Lk91/a;

    move-result-object v1

    invoke-virtual {v1}, Lk91/a;->c()Lt0/i;

    move-result-object v9

    new-instance v1, La0;

    const/4 v6, 0x6

    invoke-direct {v1, v6, v2, v0}, La0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v6, -0x4fcde9c9

    invoke-static {v6, v14, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/high16 v15, 0xc00000

    const/16 v16, 0x72

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v16}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v3

    move-object v3, v0

    goto :goto_7

    :cond_c
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v1, v3

    move-object/from16 v3, p2

    :goto_7
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v0, La01/e;

    const/16 v6, 0x14

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, La01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final h(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lbm2/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p3, v2

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_4

    sget-object p3, Ll0/m;->c:Ll0/g;

    sget-object v0, Lb2/e;->M:Lb2/k;

    invoke-static {p3, v0, p2, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object p3

    iget-wide v0, p2, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {p2}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {p2, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {p2}, Lp1/q;->i0()V

    iget-boolean v6, p2, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {p2, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p2, v5, p3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p3, La3/k;->f:La3/i;

    invoke-static {p2, p3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p3, La3/k;->j:La3/i;

    iget-boolean v1, p2, Lp1/q;->S:Z

    if-nez v1, :cond_2

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    invoke-static {v0, p2, v0, p3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p3, La3/k;->d:La3/i;

    invoke-static {p2, p3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p0, p1, p2, v3}, Lbm2/e;->m(Lbm2/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0}, Lbm2/f;->c()Lbm2/h0;

    move-result-object p1

    invoke-static {p1, p2, v3}, Lbm2/i;->e(Lbm2/h0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, p2, v3}, Lbm2/e;->k(Lbm2/f;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;Lbm2/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lbm2/e;->g(Landroidx/compose/ui/Modifier;Lbm2/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lbm2/f;Landroidx/compose/runtime/Composer;I)V
    .locals 38

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x3e0ac5ee

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p2, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int v3, p2, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v3, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v5, v4, :cond_2

    move v5, v7

    goto :goto_2

    :cond_2
    move v5, v6

    :goto_2
    and-int/2addr v3, v7

    invoke-virtual {v2, v3, v5}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_9

    int-to-float v3, v4

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v8}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v9, v2, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v9, v2, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v12, v2, Lp1/q;->S:Z

    if-eqz v12, :cond_3

    invoke-virtual {v2, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v2, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v2, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v13, v2, Lp1/q;->S:Z

    if-nez v13, :cond_4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5

    :cond_4
    invoke-static {v9, v2, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v2, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Ll0/m;->a:Ll0/e;

    sget-object v13, Lb2/e;->J:Lb2/l;

    invoke-static {v3, v13, v2, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v13, v2, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v2, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v15, v2, Lp1/q;->S:Z

    if-eqz v15, :cond_6

    invoke-virtual {v2, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v2, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v2, Lp1/q;->S:Z

    if-nez v3, :cond_7

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    :cond_7
    invoke-static {v6, v2, v6, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v2, v9, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lbm2/f;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v2, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    int-to-float v6, v7

    mul-float v10, v6, v4

    const/4 v12, 0x0

    const/16 v13, 0xb

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v29, v8

    move/from16 v28, v11

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v6, v2, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    invoke-virtual {v6, v2, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v26, v11, 0x12

    const v27, 0x2fff8

    move-object v11, v6

    move v12, v7

    const-wide/16 v6, 0x0

    move v13, v8

    const/4 v8, 0x0

    move-object/from16 v24, v2

    move-object v2, v3

    move-object v3, v4

    move-wide/from16 v36, v9

    move v10, v5

    move-wide/from16 v4, v36

    const/4 v9, 0x0

    move v14, v10

    const/4 v10, 0x0

    move-object v15, v11

    move/from16 v16, v12

    const-wide/16 v11, 0x0

    move/from16 v17, v13

    const/4 v13, 0x0

    move/from16 v18, v14

    const/4 v14, 0x0

    move-object/from16 v19, v15

    move/from16 v20, v16

    const-wide/16 v15, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move/from16 v23, v18

    const/16 v18, 0x0

    move-object/from16 v25, v19

    const/16 v19, 0x0

    move/from16 v30, v20

    const/16 v20, 0x0

    move/from16 v31, v21

    const/16 v21, 0x0

    move/from16 v32, v23

    const/16 v23, 0x0

    move-object/from16 v33, v25

    const/16 v25, 0x30

    move/from16 v34, v31

    move/from16 v0, v32

    move-object/from16 v1, v33

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual/range {p0 .. p0}, Lbm2/f;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v2, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    move/from16 v4, v34

    invoke-virtual {v1, v2, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v5

    invoke-virtual {v1, v2, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    const/16 v25, 0x0

    const v27, 0x2fffa

    move-object v2, v3

    const/4 v3, 0x0

    move v13, v4

    move-wide v4, v5

    const-wide/16 v6, 0x0

    move/from16 v31, v13

    const/4 v13, 0x0

    move/from16 v35, v31

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lbm2/f;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v2, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    const/4 v12, 0x0

    const/16 v13, 0xd

    const/4 v9, 0x0

    const/4 v11, 0x0

    move/from16 v10, v28

    move-object/from16 v8, v29

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move/from16 v13, v35

    invoke-virtual {v1, v2, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v5

    invoke-virtual {v1, v2, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->c()Lb91/a;

    move-result-object v22

    const/16 v25, 0x30

    const v27, 0x2fff8

    move/from16 v30, v3

    move-object v3, v4

    move-wide v4, v5

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    move-object v2, v0

    move/from16 v0, v30

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_9
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_a

    new-instance v1, La41/i;

    const/16 v2, 0xb

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, La41/i;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final l(Lbm2/f;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lbm2/e;->k(Lbm2/f;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lbm2/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbm2/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v3, 0x1cece92d

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_3

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v7

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    move/from16 v29, v3

    and-int/lit8 v3, v29, 0x13

    const/16 v6, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v3, v6, :cond_4

    move v3, v10

    goto :goto_3

    :cond_4
    move v3, v9

    :goto_3
    and-int/lit8 v11, v29, 0x1

    invoke-virtual {v8, v11, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_d

    int-to-float v3, v5

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v3, v5

    const-wide/high16 v11, 0x4006000000000000L    # 2.75

    double-to-float v11, v11

    mul-float/2addr v11, v5

    int-to-float v12, v10

    mul-float/2addr v12, v5

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v13, v3, v11, v3, v12}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, Lb2/e;->K:Lb2/l;

    sget-object v12, Ll0/m;->a:Ll0/e;

    const-wide/high16 v14, 0x3ff8000000000000L    # 1.5

    double-to-float v12, v14

    mul-float/2addr v12, v5

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v12, v5}, Ll0/m;->j(FLb2/f;)Ll0/k;

    move-result-object v5

    const/16 v12, 0x36

    invoke-static {v5, v11, v8, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v11, v8, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v15, v8, Lp1/q;->S:Z

    if-eqz v15, :cond_5

    invoke-virtual {v8, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_4
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v8, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v8, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v12, v8, Lp1/q;->S:Z

    if-nez v12, :cond_6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_7

    :cond_6
    invoke-static {v11, v8, v11, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v8, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lbm2/f;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v8, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    const/high16 v5, 0x3f800000    # 1.0f

    float-to-double v11, v5

    const-wide/16 v14, 0x0

    cmpl-double v11, v11, v14

    if-lez v11, :cond_8

    :goto_5
    move v11, v4

    goto :goto_6

    :cond_8
    const-string v11, "invalid weight; must be greater than zero"

    invoke-static {v11}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_5

    :goto_6
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v4, v5, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v5, v8, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->y()J

    move-result-wide v14

    invoke-virtual {v5, v8, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->r()Lb91/a;

    move-result-object v23

    sget v16, Lb91/a;->d:I

    shl-int/lit8 v27, v16, 0x12

    const v28, 0x2fff8

    move v6, v7

    move-object/from16 v25, v8

    const-wide/16 v7, 0x0

    move/from16 v16, v9

    const/4 v9, 0x0

    move/from16 v17, v10

    const/4 v10, 0x0

    move/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    move-object/from16 v20, v13

    const-wide/16 v12, 0x0

    move/from16 v21, v6

    move-wide/from16 v39, v14

    move-object v15, v5

    move-wide/from16 v5, v39

    const/4 v14, 0x0

    move-object/from16 v22, v15

    const/4 v15, 0x0

    move/from16 v24, v16

    move/from16 v26, v17

    const-wide/16 v16, 0x0

    move/from16 v30, v18

    const/16 v18, 0x0

    move/from16 v31, v19

    const/16 v19, 0x0

    move-object/from16 v32, v20

    const/16 v20, 0x0

    move/from16 v33, v21

    const/16 v21, 0x0

    move-object/from16 v34, v22

    const/16 v22, 0x0

    move/from16 v35, v24

    const/16 v24, 0x0

    move/from16 v36, v26

    const/16 v26, 0x0

    move/from16 v38, v31

    move-object/from16 v37, v34

    move/from16 v0, v35

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    invoke-virtual/range {p0 .. p0}, Lbm2/f;->e()Lbm2/i0;

    move-result-object v3

    if-nez v3, :cond_9

    const v3, -0x3274aae3

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_7
    const/4 v0, 0x1

    goto :goto_9

    :cond_9
    const v4, -0x3274aae2

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lbm2/f;->b()Lgz0/m0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result v4

    const/4 v5, 0x6

    invoke-static {v4, v8, v5}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v4

    move-object/from16 v15, v37

    move/from16 v5, v38

    invoke-virtual {v15, v8, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->b1()J

    move-result-wide v6

    and-int/lit8 v5, v29, 0x70

    const/16 v9, 0x20

    if-ne v5, v9, :cond_a

    const/4 v9, 0x1

    goto :goto_8

    :cond_a
    move v9, v0

    :goto_8
    invoke-virtual {v8, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v5, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_b

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v9, v5, :cond_c

    :cond_b
    new-instance v9, Li;

    const/16 v5, 0x19

    invoke-direct {v9, v5, v1, v3}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object/from16 v17, v9

    check-cast v17, Lc93/a;

    const/16 v18, 0xf

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v13, v32

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v11, 0x4

    int-to-float v5, v11

    mul-float/2addr v5, v5

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-string v5, "right caret"

    invoke-static {v3, v5}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v9, 0x30

    const/4 v10, 0x0

    move-object v3, v4

    const/4 v4, 0x0

    invoke-static/range {v3 .. v10}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :goto_9
    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_d
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_e

    new-instance v3, Lk;

    const/16 v4, 0x14

    move-object/from16 v5, p0

    invoke-direct {v3, v5, v1, v2, v4}, Lk;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v0, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;Lbm2/i0;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lbm2/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lbm2/e;->m(Lbm2/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final p(Ll3/g;Landroidx/compose/runtime/Composer;I)Ll3/g;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "**"

    const-string v3, "substring(...)"

    const-string v4, "\n"

    const-string v5, "input"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v1, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v5, v1, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    new-instance v5, Ll3/d;

    invoke-direct {v5}, Ll3/d;-><init>()V

    new-instance v6, Ll3/b0;

    const/16 v8, 0x1fe

    const/4 v9, 0x5

    const/4 v10, 0x0

    invoke-direct {v6, v9, v10, v8}, Ll3/b0;-><init>(ILw3/q;I)V

    invoke-virtual {v5, v6}, Ll3/d;->i(Ll3/b0;)I

    move-result v6

    :try_start_0
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x6

    invoke-static {v0, v8, v9}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v11, 0x0

    move v12, v11

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    add-int/lit8 v14, v12, 0x1

    if-ltz v12, :cond_2

    check-cast v13, Ljava/lang/String;

    invoke-static {v13, v2, v11, v11, v9}, Lyb3/r;->g0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v15

    invoke-static {v13, v2, v11, v9}, Lyb3/r;->l0(Ljava/lang/CharSequence;Ljava/lang/String;II)I

    move-result v10

    const v9, 0xfffe

    const/4 v11, -0x1

    if-eq v15, v11, :cond_0

    if-eq v10, v11, :cond_0

    if-ge v15, v10, :cond_0

    invoke-virtual {v7}, Lb91/d;->b()Lb91/a;

    move-result-object v11

    invoke-virtual {v11}, Lb91/a;->d()Ll3/v0;

    move-result-object v11

    iget-object v11, v11, Ll3/v0;->a:Ll3/m0;

    move-object/from16 v17, v1

    move-object/from16 v16, v2

    invoke-virtual/range {v17 .. v17}, Ly81/i;->b1()J

    move-result-wide v1

    move-object/from16 v18, v7

    const/4 v7, 0x0

    invoke-static {v11, v1, v2, v7, v9}, Ll3/m0;->a(Ll3/m0;JLp3/r;I)Ll3/m0;

    move-result-object v1

    invoke-virtual {v5, v1}, Ll3/d;->j(Ll3/m0;)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    :try_start_1
    invoke-virtual {v13, v2, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v7}, Ll3/d;->b(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :try_start_2
    invoke-virtual {v5, v1}, Ll3/d;->f(I)V

    invoke-virtual/range {v18 .. v18}, Lb91/d;->b()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    move-object v7, v3

    invoke-virtual/range {v17 .. v17}, Ly81/i;->y()J

    move-result-wide v2

    sget-object v11, Lp3/r;->I:Lp3/r;

    const v9, 0xfffa

    invoke-static {v1, v2, v3, v11, v9}, Ll3/m0;->a(Ll3/m0;JLp3/r;I)Ll3/m0;

    move-result-object v1

    invoke-virtual {v5, v1}, Ll3/d;->j(Ll3/m0;)I

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    add-int/lit8 v15, v15, 0x2

    :try_start_3
    invoke-virtual {v13, v15, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ll3/d;->b(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {v5, v1}, Ll3/d;->f(I)V

    invoke-virtual/range {v18 .. v18}, Lb91/d;->b()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    invoke-virtual/range {v17 .. v17}, Ly81/i;->b1()J

    move-result-wide v2

    const v9, 0xfffe

    const/4 v11, 0x0

    invoke-static {v1, v2, v3, v11, v9}, Ll3/m0;->a(Ll3/m0;JLp3/r;I)Ll3/m0;

    move-result-object v1

    invoke-virtual {v5, v1}, Ll3/d;->j(Ll3/m0;)I

    move-result v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    add-int/lit8 v10, v10, 0x2

    :try_start_5
    invoke-virtual {v13, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ll3/d;->b(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    invoke-virtual {v5, v1}, Ll3/d;->f(I)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v5, v1}, Ll3/d;->f(I)V

    throw v0

    :catchall_2
    move-exception v0

    invoke-virtual {v5, v1}, Ll3/d;->f(I)V

    throw v0

    :catchall_3
    move-exception v0

    invoke-virtual {v5, v1}, Ll3/d;->f(I)V

    throw v0

    :cond_0
    move-object/from16 v17, v1

    move-object/from16 v16, v2

    move-object/from16 v18, v7

    move-object v7, v3

    invoke-virtual/range {v18 .. v18}, Lb91/d;->b()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    invoke-virtual/range {v17 .. v17}, Ly81/i;->b1()J

    move-result-wide v2

    const v9, 0xfffe

    const/4 v11, 0x0

    invoke-static {v1, v2, v3, v11, v9}, Ll3/m0;->a(Ll3/m0;JLp3/r;I)Ll3/m0;

    move-result-object v1

    invoke-virtual {v5, v1}, Ll3/d;->j(Ll3/m0;)I

    move-result v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    invoke-virtual {v5, v13}, Ll3/d;->b(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :try_start_8
    invoke-virtual {v5, v1}, Ll3/d;->f(I)V

    :goto_1
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v0, v1, v2}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    if-eq v12, v1, :cond_1

    invoke-virtual {v5, v4}, Ll3/d;->b(Ljava/lang/String;)V

    :cond_1
    move v9, v2

    move-object v3, v7

    move v12, v14

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v7, v18

    const/4 v10, 0x0

    const/4 v11, 0x0

    goto/16 :goto_0

    :catchall_4
    move-exception v0

    invoke-virtual {v5, v1}, Ll3/d;->f(I)V

    throw v0

    :cond_2
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v11, 0x0

    throw v11
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :cond_3
    invoke-virtual {v5, v6}, Ll3/d;->f(I)V

    invoke-virtual {v5}, Ll3/d;->k()Ll3/g;

    move-result-object v0

    return-object v0

    :goto_2
    invoke-virtual {v5, v6}, Ll3/d;->f(I)V

    throw v0
.end method
