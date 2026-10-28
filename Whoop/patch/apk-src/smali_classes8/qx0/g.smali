.class public abstract Lqx0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\r\u00b2\u0006\u000c\u0010\u000c\u001a\u00020\u000b8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lqx0/i;",
        "viewModel",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onNavigateBack",
        "m",
        "(Lqx0/i;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "Lqx0/c;",
        "experimentCard",
        "k",
        "(Lqx0/c;Landroidx/compose/runtime/Composer;I)V",
        "Lqx0/h;",
        "uiState",
        "debug-tools_release"
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
.method public static synthetic a(Lqx0/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqx0/g;->v(Lqx0/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lqx0/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqx0/g;->r(Lqx0/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lqx0/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqx0/g;->q(Lqx0/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lqx0/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lqx0/g;->l(Lqx0/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lqx0/i;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lqx0/g;->w(Lqx0/i;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lqx0/i;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lqx0/g;->t(Lqx0/i;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lqx0/h$c;Lqx0/i;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lqx0/g;->s(Lqx0/h;Lqx0/i;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lqx0/i;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lqx0/g;->o(Lqx0/i;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lqx0/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqx0/g;->u(Lqx0/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lqx0/i;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lqx0/g;->p(Lqx0/i;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lqx0/c;Landroidx/compose/runtime/Composer;I)V
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x327eb38a

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

    move v4, v7

    goto :goto_2

    :cond_2
    move v4, v6

    :goto_2
    and-int/2addr v3, v7

    invoke-virtual {v2, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_9

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v4, 0xc

    int-to-float v4, v4

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    invoke-static {v3, v5}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v5, v7

    sget-object v14, Lx81/d;->a:Lx81/d;

    sget v15, Lx81/d;->b:I

    invoke-virtual {v14, v2, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->b1()J

    move-result-wide v9

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v4

    invoke-static {v3, v5, v9, v10, v4}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v4, 0x10

    int-to-float v12, v4

    invoke-static {v12, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v9, v2, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v11, v2, Lp1/q;->S:Z

    if-eqz v11, :cond_3

    invoke-virtual {v2, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v2, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v2, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v13, v2, Lp1/q;->S:Z

    if-nez v13, :cond_4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v13, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    :cond_4
    invoke-static {v5, v2, v5, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v2, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v7, v2, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v6, v2, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v2, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v2}, Lp1/q;->i0()V

    move-object/from16 v16, v8

    iget-boolean v8, v2, Lp1/q;->S:Z

    if-eqz v8, :cond_6

    invoke-virtual {v2, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v2, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v2, Lp1/q;->S:Z

    if-nez v3, :cond_7

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    :cond_7
    invoke-static {v6, v2, v6, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v2, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lqx0/c;->b()Lhf1/a;

    move-result-object v3

    invoke-interface {v3}, Lhf1/a;->getName()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "toUpperCase(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v14, v2, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->s()Lb91/a;

    move-result-object v22

    invoke-virtual {v14, v2, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v4

    sget-object v6, Lp3/r;->I:Lp3/r;

    const/4 v11, 0x0

    const/4 v13, 0x7

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v8, v16

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v26, v8, 0x12

    const v27, 0x2ffd8

    move-object/from16 v24, v2

    move-object v2, v3

    move-object v9, v6

    move-object v3, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v18, v15

    move-object/from16 v17, v16

    const-wide/16 v15, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move-object/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v28, v23

    const/16 v23, 0x0

    move-object/from16 v29, v25

    const v25, 0x30030

    move/from16 v1, v28

    move-object/from16 v0, v29

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual/range {p0 .. p0}, Lqx0/c;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->t()Lb91/a;

    move-result-object v22

    invoke-virtual {v0, v2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->Z()J

    move-result-wide v4

    sget-object v9, Lp3/r;->G:Lp3/r;

    const/high16 v25, 0x30000

    const v27, 0x2ffda

    move-object v2, v3

    const/4 v3, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_9
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_a

    new-instance v1, Los0/d;

    const/16 v2, 0x15

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Los0/d;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final l(Lqx0/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lqx0/g;->k(Lqx0/c;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final m(Lqx0/i;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqx0/i;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    const-string v1, "viewModel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onNavigateBack"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v1, -0x772b812e

    invoke-virtual {v7, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    const/4 v12, 0x0

    if-eq v2, v3, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    move v2, v12

    :goto_3
    and-int/lit8 v3, v1, 0x1

    invoke-virtual {v7, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-virtual {v0}, Lqx0/i;->p()Lec3/f2;

    move-result-object v2

    invoke-static {v2, v7, v12}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v15

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_5

    if-ne v3, v5, :cond_6

    :cond_5
    new-instance v3, Lqx0/g$a;

    const/4 v2, 0x0

    invoke-direct {v3, v0, v2}, Lqx0/g$a;-><init>(Lqx0/i;Lq83/d;)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lc93/m;

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    invoke-static {v7, v3, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v9, v7, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    move-object v9, v3

    iget-wide v2, v7, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v7, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v13, v7, Lp1/q;->S:Z

    if-eqz v13, :cond_7

    invoke-virtual {v7, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v7, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v7, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v14, v7, Lp1/q;->S:Z

    if-nez v14, :cond_8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v14, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    :cond_8
    invoke-static {v2, v7, v2, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v7, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v2, Lcom/whoop/design/atomic/organism/toolbar/d$c;

    const-string v6, "EXPERIMENTS DEBUG"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-virtual {v14}, Lx81/d;->d()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/w;->a()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v24

    invoke-virtual {v14}, Lx81/d;->d()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/u;->c()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v26

    const/16 v34, 0x1fd5

    const/16 v35, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v20, v2

    invoke-direct/range {v20 .. v35}, Lcom/whoop/design/atomic/organism/toolbar/d$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lny0/q;Lny0/q;Ly81/f;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v6, Lcom/whoop/design/atomic/organism/toolbar/d$c;->p:I

    shl-int/lit8 v6, v6, 0x3

    shl-int/lit8 v1, v1, 0x6

    and-int/lit16 v1, v1, 0x1c00

    or-int/2addr v1, v6

    move-object v6, v9

    const/16 v9, 0x35

    move-object/from16 v20, v8

    move v8, v1

    const/4 v1, 0x0

    move-object/from16 v21, v3

    const/4 v3, 0x0

    move-object/from16 v22, v5

    const/4 v5, 0x0

    move-object/from16 v23, v6

    const/4 v6, 0x0

    move-object/from16 p2, v14

    move-object/from16 v24, v15

    move-object/from16 v15, v20

    move-object/from16 v10, v21

    move-object/from16 v36, v22

    move-object/from16 v14, v23

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static/range {v1 .. v9}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static/range {v24 .. v24}, Lqx0/g;->n(Lp1/t2;)Lqx0/h;

    move-result-object v1

    instance-of v2, v1, Lqx0/h$b;

    if-eqz v2, :cond_d

    const v1, -0x4a099d77

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    invoke-static {v0, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Ll0/m;->e:Ll0/h;

    sget-object v2, Lb2/e;->N:Lb2/k;

    const/16 v3, 0x36

    invoke-static {v1, v2, v7, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v2, v7, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-eqz v5, :cond_a

    invoke-virtual {v7, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_a
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v7, v13, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v15, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v7, Lp1/q;->S:Z

    if-nez v1, :cond_b

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    :cond_b
    invoke-static {v2, v7, v2, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v7, v11, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Lx81/d;->b:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v7, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v12

    const/16 v19, 0x0

    const/16 v20, 0x1d

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v0, 0x0

    const-wide/16 v15, 0x0

    const/4 v1, 0x1

    const/16 v17, 0x0

    move v3, v0

    move v5, v1

    move-object/from16 v18, v7

    const/16 v2, 0xe

    invoke-static/range {v11 .. v20}, Lg1/v4;->b(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    move-object/from16 v6, p0

    goto/16 :goto_6

    :cond_d
    const/16 v2, 0xe

    const/4 v3, 0x0

    const/4 v5, 0x1

    instance-of v6, v1, Lqx0/h$a;

    const/4 v8, 0x7

    const/4 v9, 0x0

    if-eqz v6, :cond_10

    const v1, -0x4a01d006

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    invoke-static {v0, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v1, 0x10

    int-to-float v1, v1

    invoke-static {v0, v1, v1}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v0, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v7}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v0

    iget-object v0, v0, Ll0/c2;->e:Ll0/b;

    invoke-static {v0, v7}, Ll0/f;->e(Ll0/b2;Landroidx/compose/runtime/Composer;)Ll0/x0;

    move-result-object v0

    invoke-virtual {v0}, Ll0/x0;->a()F

    move-result v0

    invoke-static {v9, v9, v9, v0, v8}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v13

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v14

    move-object/from16 v6, p0

    invoke-virtual {v7, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_e

    move-object/from16 v10, v36

    if-ne v1, v10, :cond_f

    :cond_e
    new-instance v1, Lpf/b;

    const/16 v0, 0x11

    invoke-direct {v1, v6, v0}, Lpf/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object/from16 v19, v1

    check-cast v19, Lkotlin/jvm/functions/Function1;

    const/16 v21, 0x6006

    const/16 v22, 0x1ea

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v20, v7

    invoke-static/range {v11 .. v22}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_10
    move-object/from16 v6, p0

    move-object/from16 v10, v36

    instance-of v11, v1, Lqx0/h$c;

    if-eqz v11, :cond_13

    const v11, -0x49c2ae3f

    invoke-virtual {v7, v11}, Lp1/q;->e0(I)V

    invoke-static {v0, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v11, 0x10

    int-to-float v11, v11

    invoke-static {v0, v11, v11}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v12, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v7}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v12

    iget-object v12, v12, Ll0/c2;->e:Ll0/b;

    invoke-static {v12, v7}, Ll0/f;->e(Ll0/b2;Landroidx/compose/runtime/Composer;)Ll0/x0;

    move-result-object v12

    invoke-virtual {v12}, Ll0/x0;->a()F

    move-result v12

    invoke-static {v9, v9, v9, v12, v8}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v13

    invoke-static {v11}, Ll0/m;->i(F)Ll0/k;

    move-result-object v14

    invoke-virtual {v7, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_11

    if-ne v9, v10, :cond_12

    :cond_11
    new-instance v9, Lq11/c;

    check-cast v1, Lqx0/h$c;

    invoke-direct {v9, v2, v1, v6}, Lq11/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object/from16 v19, v9

    check-cast v19, Lkotlin/jvm/functions/Function1;

    const/16 v21, 0x6006

    const/16 v22, 0x1ea

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v11, v0

    move-object/from16 v20, v7

    invoke-static/range {v11 .. v22}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {v7, v5}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_13
    const v0, -0x76003a5d

    invoke-static {v0, v7, v3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_14
    move-object v6, v0

    const/16 v2, 0xe

    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_15

    new-instance v1, Lq81/e;

    move/from16 v10, p3

    invoke-direct {v1, v6, v4, v10, v2}, Lq81/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final n(Lp1/t2;)Lqx0/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lqx0/h;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lqx0/h;

    return-object p0
.end method

.method private static final o(Lqx0/i;Ln0/q;)Ll83/a0;
    .locals 3

    const-string v0, "$this$LazyColumn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqx0/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lqx0/e;-><init>(Lqx0/i;I)V

    new-instance p0, Lx1/b;

    const/4 v1, 0x1

    const v2, 0x579c966

    invoke-direct {p0, v0, v1, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p1, v0, p0, v1}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    sget-object p0, Lqx0/b;->a:Lqx0/b;

    invoke-virtual {p0}, Lqx0/b;->i()Lkotlin/jvm/functions/Function3;

    move-result-object p0

    invoke-static {p1, v0, p0, v1}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lqx0/i;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 32

    move-object/from16 v0, p0

    const-string v1, "$this$item"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0x11

    const/16 v2, 0x10

    const/4 v4, 0x1

    if-eq v1, v2, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p3, 0x1

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v9, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->r()Lb91/a;

    move-result-object v25

    invoke-virtual {v1, v9, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v7

    const/16 v5, 0xc

    int-to-float v14, v5

    const/4 v15, 0x7

    sget-object v10, Lb2/t;->w:Lb2/t;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v29, v5, 0x12

    const v30, 0x2fff8

    const-string v5, "HELPERS \ud83d\udd27"

    move-object v11, v9

    move-object v12, v10

    const-wide/16 v9, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const-wide/16 v14, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v20, v18

    const-wide/16 v18, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v26, v24

    const/16 v24, 0x0

    move-object/from16 v28, v26

    const/16 v26, 0x0

    move-object/from16 v31, v28

    const/16 v28, 0x36

    move-object/from16 v3, v31

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v27

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v6, 0x8

    int-to-float v9, v6

    const/4 v10, 0x7

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v5, Lg1/v0;->a:Ll0/l1;

    invoke-virtual {v1, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->w()J

    move-result-wide v5

    invoke-virtual {v1, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    const/4 v10, 0x4

    move-object v9, v11

    invoke-static/range {v5 .. v10}, Lg1/v0;->c(JJLp1/q;I)Lg1/m1;

    move-result-object v5

    int-to-float v15, v4

    invoke-virtual {v1, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v6

    invoke-static {v15, v6, v7}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v8

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-nez v6, :cond_1

    if-ne v7, v9, :cond_2

    :cond_1
    new-instance v7, Lqx0/f;

    const/4 v6, 0x0

    invoke-direct {v7, v0, v6}, Lqx0/f;-><init>(Lqx0/i;I)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v7, Lc93/a;

    sget-object v16, Lqx0/b;->a:Lqx0/b;

    invoke-virtual/range {v16 .. v16}, Lqx0/b;->n()Lkotlin/jvm/functions/Function3;

    move-result-object v10

    move-object v6, v12

    const v12, 0x30000030

    const/16 v13, 0x13c

    move-object/from16 v17, v9

    move-object v9, v5

    move-object v5, v7

    const/4 v7, 0x0

    move-object/from16 v4, v17

    invoke-static/range {v5 .. v13}, Ldt/b;->c(Lc93/a;Landroidx/compose/ui/Modifier;ZLf0/t;Lg1/m1;Lkotlin/jvm/functions/Function3;Lp1/q;II)V

    invoke-static {v14, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v1, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->w()J

    move-result-wide v5

    invoke-virtual {v1, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    const/4 v10, 0x4

    move-object v9, v11

    invoke-static/range {v5 .. v10}, Lg1/v0;->c(JJLp1/q;I)Lg1/m1;

    move-result-object v5

    invoke-virtual {v1, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v1

    invoke-static {v15, v1, v2}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v8

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_3

    if-ne v2, v4, :cond_4

    :cond_3
    new-instance v2, Lqx0/f;

    const/4 v1, 0x1

    invoke-direct {v2, v0, v1}, Lqx0/f;-><init>(Lqx0/i;I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lc93/a;

    invoke-virtual/range {v16 .. v16}, Lqx0/b;->l()Lkotlin/jvm/functions/Function3;

    move-result-object v10

    const v12, 0x30000030

    const/16 v13, 0x13c

    const/4 v7, 0x0

    move-object v6, v3

    move-object v9, v5

    move-object v5, v2

    invoke-static/range {v5 .. v13}, Ldt/b;->c(Lc93/a;Landroidx/compose/ui/Modifier;ZLf0/t;Lg1/m1;Lkotlin/jvm/functions/Function3;Lp1/q;II)V

    goto :goto_1

    :cond_5
    move-object v11, v9

    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final q(Lqx0/i;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lqx0/i;->o()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lqx0/i;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lqx0/i;->r()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lqx0/h;Lqx0/i;Ln0/q;)Ll83/a0;
    .locals 7

    const-string v0, "$this$LazyColumn"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqx0/e;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lqx0/e;-><init>(Lqx0/i;I)V

    new-instance p1, Lx1/b;

    const v2, -0x76d9a619

    invoke-direct {p1, v0, v1, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 v0, 0x0

    const/4 v2, 0x3

    invoke-static {p2, v0, p1, v2}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    sget-object p1, Lqx0/b;->a:Lqx0/b;

    invoke-virtual {p1}, Lqx0/b;->m()Lkotlin/jvm/functions/Function3;

    move-result-object v3

    invoke-static {p2, v0, v3, v2}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    check-cast p0, Lqx0/h$c;

    invoke-virtual {p0}, Lqx0/h$c;->a()Ljava/util/List;

    move-result-object p0

    sget-object v3, Lqx0/g$b;->w:Lqx0/g$b;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    new-instance v5, Lqx0/g$c;

    invoke-direct {v5, v3, p0}, Lqx0/g$c;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v3, Lqx0/g$d;

    invoke-direct {v3, p0}, Lqx0/g$d;-><init>(Ljava/util/List;)V

    new-instance p0, Lx1/b;

    const v6, 0x2fd4df92

    invoke-direct {p0, v3, v1, v6}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object v1, p2

    check-cast v1, Ln0/f;

    invoke-virtual {v1, v4, v0, v5, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    invoke-virtual {p1}, Lqx0/b;->k()Lkotlin/jvm/functions/Function3;

    move-result-object p0

    invoke-static {p2, v0, p0, v2}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lqx0/i;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 31

    move-object/from16 v0, p0

    const-string v1, "$this$item"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0x11

    const/16 v2, 0x10

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p3, 0x1

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v8, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->r()Lb91/a;

    move-result-object v24

    invoke-virtual {v1, v8, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v6

    const/16 v4, 0xc

    int-to-float v13, v4

    const/4 v14, 0x7

    sget-object v9, Lb2/t;->w:Lb2/t;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v28, v4, 0x12

    const v29, 0x2fff8

    const-string v4, "HELPERS \ud83d\udd27"

    move-object v10, v8

    move-object v11, v9

    const-wide/16 v8, 0x0

    move-object/from16 v26, v10

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object v15, v13

    const-wide/16 v13, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v19, v17

    const-wide/16 v17, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    move-object/from16 v25, v23

    const/16 v23, 0x0

    move-object/from16 v27, v25

    const/16 v25, 0x0

    move-object/from16 v30, v27

    const/16 v27, 0x36

    move-object/from16 v3, v30

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v26

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v5, 0x8

    int-to-float v8, v5

    const/4 v9, 0x7

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v4, Lg1/v0;->a:Ll0/l1;

    invoke-virtual {v1, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->w()J

    move-result-wide v4

    invoke-virtual {v1, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    const/4 v9, 0x4

    move-object v8, v10

    invoke-static/range {v4 .. v9}, Lg1/v0;->c(JJLp1/q;I)Lg1/m1;

    move-result-object v4

    const/4 v5, 0x1

    int-to-float v14, v5

    invoke-virtual {v1, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v5

    invoke-static {v14, v5, v6}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v7

    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_1

    if-ne v6, v15, :cond_2

    :cond_1
    new-instance v6, Lqx0/f;

    const/4 v5, 0x2

    invoke-direct {v6, v0, v5}, Lqx0/f;-><init>(Lqx0/i;I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v6, Lc93/a;

    sget-object v16, Lqx0/b;->a:Lqx0/b;

    invoke-virtual/range {v16 .. v16}, Lqx0/b;->h()Lkotlin/jvm/functions/Function3;

    move-result-object v9

    move-object v5, v11

    const v11, 0x30000030

    const/16 v12, 0x13c

    move-object v8, v4

    move-object v4, v6

    const/4 v6, 0x0

    invoke-static/range {v4 .. v12}, Ldt/b;->c(Lc93/a;Landroidx/compose/ui/Modifier;ZLf0/t;Lg1/m1;Lkotlin/jvm/functions/Function3;Lp1/q;II)V

    invoke-static {v13, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v1, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->w()J

    move-result-wide v4

    invoke-virtual {v1, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    const/4 v9, 0x4

    move-object v8, v10

    invoke-static/range {v4 .. v9}, Lg1/v0;->c(JJLp1/q;I)Lg1/m1;

    move-result-object v4

    invoke-virtual {v1, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v1

    invoke-static {v14, v1, v2}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v7

    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_3

    if-ne v2, v15, :cond_4

    :cond_3
    new-instance v2, Lqx0/f;

    const/4 v1, 0x3

    invoke-direct {v2, v0, v1}, Lqx0/f;-><init>(Lqx0/i;I)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lc93/a;

    invoke-virtual/range {v16 .. v16}, Lqx0/b;->j()Lkotlin/jvm/functions/Function3;

    move-result-object v9

    const v11, 0x30000030

    const/16 v12, 0x13c

    const/4 v6, 0x0

    move-object v5, v3

    move-object v8, v4

    move-object v4, v2

    invoke-static/range {v4 .. v12}, Ldt/b;->c(Lc93/a;Landroidx/compose/ui/Modifier;ZLf0/t;Lg1/m1;Lkotlin/jvm/functions/Function3;Lp1/q;II)V

    goto :goto_1

    :cond_5
    move-object v10, v8

    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final u(Lqx0/i;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lqx0/i;->o()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lqx0/i;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lqx0/i;->r()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lqx0/i;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lqx0/g;->m(Lqx0/i;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic x(Lqx0/c;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lqx0/g;->k(Lqx0/c;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
