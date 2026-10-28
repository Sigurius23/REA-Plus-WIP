.class public abstract Lf01/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lf01/u;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Landroidx/compose/ui/Modifier;Lf01/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "k",
        "(Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lf01/t;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lf01/u;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lf01/t;->j(Landroidx/compose/ui/Modifier;Lf01/u;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lf01/u;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lf01/t;->i(Lf01/u;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lf01/u;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lf01/t;->h(Lf01/u;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lf01/t;->l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lf01/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lf01/u;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p3

    check-cast v15, Lp1/q;

    const v0, -0x388785ca

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v2, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v3, v1, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v1, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v15, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v2

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v1

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v1

    :goto_1
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v15, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_4
    and-int/lit8 v6, p5, 0x4

    const/16 v12, 0x100

    if-eqz v6, :cond_6

    or-int/lit16 v4, v4, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v7, v1, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v15, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    move v8, v12

    goto :goto_3

    :cond_7
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v4, v8

    :goto_4
    and-int/lit16 v8, v4, 0x93

    const/16 v9, 0x92

    const/4 v13, 0x0

    if-eq v8, v9, :cond_8

    const/4 v8, 0x1

    goto :goto_5

    :cond_8
    move v8, v13

    :goto_5
    and-int/lit8 v9, v4, 0x1

    invoke-virtual {v15, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_11

    if-eqz v0, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_6

    :cond_9
    move-object v0, v3

    :goto_6
    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_b

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_a

    new-instance v6, Lev2/b;

    const/16 v7, 0x11

    invoke-direct {v6, v7}, Lev2/b;-><init>(I)V

    invoke-virtual {v15, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v6, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_b
    move-object v6, v7

    :goto_7
    const/4 v7, 0x3

    int-to-float v8, v7

    int-to-float v2, v2

    mul-float/2addr v8, v2

    invoke-static {v8}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    move v8, v7

    invoke-virtual {v5}, Lf01/u;->a()Lm51/a;

    move-result-object v7

    move-object v9, v6

    invoke-static {v0, v2}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    if-eqz v7, :cond_c

    const v10, -0x34bd0f6b    # -1.2775573E7f

    invoke-virtual {v15, v10}, Lp1/q;->e0(I)V

    const/4 v10, 0x0

    const/4 v11, 0x2

    move/from16 v16, v8

    const/4 v8, 0x0

    move-object v14, v15

    move-object v15, v9

    move-object v9, v14

    move/from16 v14, v16

    invoke-static/range {v6 .. v11}, Lm51/b;->b(Landroidx/compose/ui/Modifier;Lm51/a;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;

    move-result-object v6

    :goto_8
    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_c
    move-object v14, v15

    move-object v15, v9

    move-object v9, v14

    move v14, v8

    const v8, -0x34bd0adb    # -1.2776741E7f

    invoke-virtual {v9, v8}, Lp1/q;->e0(I)V

    goto :goto_8

    :goto_9
    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    and-int/lit16 v4, v4, 0x380

    if-ne v4, v12, :cond_d

    const/4 v4, 0x1

    goto :goto_a

    :cond_d
    move v4, v13

    :goto_a
    or-int/2addr v4, v8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_e

    if-ne v8, v3, :cond_f

    :cond_e
    new-instance v8, Ld30/l;

    const/16 v3, 0x19

    invoke-direct {v8, v3, v5, v15}, Ld30/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v8, Lc93/a;

    const/4 v3, 0x0

    invoke-static {v6, v13, v3, v8, v14}, Landroidx/room/c1;->i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-string v4, "CardContainer"

    invoke-static {v3, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    if-eqz v7, :cond_10

    const v3, -0x34bcf0ff    # -1.2783361E7f

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    sget-wide v3, Li2/x;->m:J

    goto :goto_b

    :cond_10
    const v3, -0x34bceca3    # -1.2784477E7f

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-static {v3, v9, v4, v13}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v3

    :goto_b
    new-instance v7, Lej1/h;

    const/4 v8, 0x6

    invoke-direct {v7, v5, v8}, Lej1/h;-><init>(Ljava/lang/Object;I)V

    const v8, -0x277b235a

    invoke-static {v8, v9, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    const/high16 v16, 0xc00000

    const/16 v17, 0x72

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v10, v2

    move-object v2, v15

    move-object v15, v9

    move-wide v8, v3

    invoke-static/range {v6 .. v17}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v15

    move-object v4, v0

    move-object v6, v2

    goto :goto_c

    :cond_11
    move-object v9, v15

    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v4, v3

    move-object v6, v7

    :goto_c
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_12

    new-instance v0, Le11/b;

    const/16 v3, 0x16

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Le11/b;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final g(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lf01/u;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    invoke-virtual {p0}, Lf01/u;->getEvent()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lf01/u;->getEvent()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1
.end method

.method private static final i(Lf01/u;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 34

    sget-object v0, Lb2/e;->K:Lb2/l;

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x1

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v5, p2, 0x1

    move-object/from16 v11, p1

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_19

    int-to-float v1, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v1, v5

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v14}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v15, 0x6

    invoke-static {v1, v7, v11, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v11, v10, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v11, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-nez v12, :cond_2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3

    :cond_2
    invoke-static {v7, v11, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v11, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lf01/u;->c()Lf01/q0;

    move-result-object v6

    const-string v18, "invalid weight; must be greater than zero"

    const-wide/16 v19, 0x0

    const/high16 v12, 0x3f800000    # 1.0f

    const/16 v13, 0x30

    const/4 v2, 0x4

    if-eqz v6, :cond_12

    const v6, 0x8c29156

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-static {v12, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v12, 0x5

    int-to-float v12, v12

    int-to-float v2, v2

    mul-float/2addr v12, v2

    const/4 v15, 0x0

    invoke-static {v6, v12, v15, v4}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Ll0/m;->a:Ll0/e;

    invoke-static {v6, v0, v11, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    move-object v6, v4

    iget-wide v3, v11, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-eqz v13, :cond_4

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v11, v10, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    :cond_5
    invoke-static {v3, v11, v3, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v11, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lf01/u;->c()Lf01/q0;

    move-result-object v0

    invoke-virtual {v0}, Lf01/q0;->a()Lgz0/m0;

    move-result-object v0

    if-nez v0, :cond_7

    const v0, -0x16eacbbc

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move v6, v0

    move v0, v12

    const/4 v1, 0x6

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, 0x3f000000    # 0.5f

    goto :goto_3

    :cond_7
    const v1, -0x16eacbbb

    invoke-static {v11, v1, v2, v2, v14}, Lih0/d0;->f(Lp1/q;IFFLb2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v0, v11, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v9

    move v0, v12

    const/16 v12, 0x1b0

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v6, 0x0

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lf01/u;->c()Lf01/q0;

    move-result-object v7

    invoke-virtual {v7}, Lf01/q0;->b()Lkd1/o;

    move-result-object v7

    if-nez v7, :cond_8

    const v0, -0x16e45044

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    move-object/from16 v32, v14

    goto :goto_6

    :cond_8
    const v8, -0x16e45043

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lf01/u;->c()Lf01/q0;

    move-result-object v8

    invoke-virtual {v8}, Lf01/q0;->a()Lgz0/m0;

    move-result-object v8

    if-eqz v8, :cond_9

    const/4 v8, 0x1

    int-to-float v9, v8

    mul-float/2addr v9, v5

    :goto_4
    move v13, v9

    goto :goto_5

    :cond_9
    int-to-float v8, v6

    mul-float v9, v8, v5

    goto :goto_4

    :goto_5
    const/16 v16, 0x0

    const/16 v17, 0xe

    move-object v12, v14

    const/4 v14, 0x0

    move v6, v15

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object/from16 v32, v12

    invoke-static {v0, v8}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v8, 0xf

    int-to-float v8, v8

    mul-float/2addr v8, v2

    const/4 v9, 0x1

    invoke-static {v0, v6, v8, v9}, Landroidx/compose/foundation/layout/d;->v(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v10, 0x0

    move-object/from16 v28, v11

    const/4 v11, 0x3

    move-object v6, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v9, v28

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    move-object v11, v9

    const/16 v14, 0x30

    const/16 v15, 0x78

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v28, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v8, v0

    move-object/from16 v13, v28

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v13

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual/range {p0 .. p0}, Lf01/u;->c()Lf01/q0;

    move-result-object v0

    invoke-virtual {v0}, Lf01/q0;->c()Ljava/lang/String;

    move-result-object v0

    const v12, 0x7f7fffff    # Float.MAX_VALUE

    if-eqz v0, :cond_e

    const v0, -0x16db35d0

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    float-to-double v6, v3

    cmpl-double v0, v6, v19

    if-lez v0, :cond_a

    goto :goto_7

    :cond_a
    invoke-static/range {v18 .. v18}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v0, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v6, v3, v12

    if-lez v6, :cond_b

    :goto_8
    const/4 v8, 0x1

    goto :goto_9

    :cond_b
    move v12, v3

    goto :goto_8

    :goto_9
    invoke-direct {v0, v12, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual/range {p0 .. p0}, Lf01/u;->c()Lf01/q0;

    move-result-object v3

    invoke-virtual {v3}, Lf01/q0;->a()Lgz0/m0;

    move-result-object v3

    if-nez v3, :cond_c

    invoke-virtual/range {p0 .. p0}, Lf01/u;->c()Lf01/q0;

    move-result-object v3

    invoke-virtual {v3}, Lf01/q0;->b()Lkd1/o;

    move-result-object v3

    if-eqz v3, :cond_d

    :cond_c
    const/4 v8, 0x1

    goto :goto_b

    :cond_d
    const/4 v6, 0x0

    int-to-float v3, v6

    :goto_a
    mul-float/2addr v3, v5

    move/from16 v20, v3

    goto :goto_c

    :goto_b
    int-to-float v3, v8

    goto :goto_a

    :goto_c
    const/16 v23, 0x0

    const/16 v24, 0xe

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v19, v0

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lf01/u;->c()Lf01/q0;

    move-result-object v0

    invoke-virtual {v0}, Lf01/q0;->c()Ljava/lang/String;

    move-result-object v6

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v8

    invoke-virtual {v0, v11, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->L()Lb91/a;

    move-result-object v26

    const/16 v30, 0xc30

    const v31, 0x2d7f8

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x2

    const/16 v22, 0x0

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_e
    const v0, -0x16ce87e5

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    float-to-double v6, v3

    cmpl-double v0, v6, v19

    if-lez v0, :cond_f

    goto :goto_d

    :cond_f
    invoke-static/range {v18 .. v18}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_d
    new-instance v0, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v6, v3, v12

    if-lez v6, :cond_10

    :goto_e
    const/4 v8, 0x1

    goto :goto_f

    :cond_10
    move v12, v3

    goto :goto_e

    :goto_f
    invoke-direct {v0, v12, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v11, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual/range {p0 .. p0}, Lf01/u;->c()Lf01/q0;

    move-result-object v3

    invoke-virtual {v3}, Lf01/q0;->d()Lgz0/m0;

    move-result-object v3

    if-nez v3, :cond_11

    const v1, -0x16cc193c

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move v2, v0

    :goto_11
    const/4 v8, 0x1

    goto :goto_12

    :cond_11
    const v0, -0x16cc193b

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    const/4 v8, 0x1

    int-to-float v0, v8

    mul-float v13, v0, v5

    const/16 v16, 0x0

    const/16 v17, 0xe

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v12, v32

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    mul-float/2addr v2, v2

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v4, v0}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-static {v0, v11, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    sget v0, Lgy0/f;->m1:I

    const/4 v2, 0x0

    invoke-static {v0, v11, v2}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v9

    const/16 v12, 0x180

    const/4 v13, 0x0

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    goto :goto_11

    :goto_12
    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_17

    :cond_12
    move v3, v12

    move-object v12, v14

    move v6, v15

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-virtual/range {p0 .. p0}, Lf01/u;->f()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_18

    const v14, 0x8ee38b7

    invoke-virtual {v11, v14}, Lp1/q;->e0(I)V

    invoke-static {v3, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v15, Ll0/m;->a:Ll0/e;

    invoke-static {v15, v0, v11, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    move/from16 v32, v5

    iget-wide v4, v11, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v11, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_13

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_13
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_13
    invoke-static {v11, v10, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_14

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    :cond_14
    invoke-static {v4, v11, v4, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v11, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v0, v3

    cmpl-double v0, v0, v19

    if-lez v0, :cond_16

    goto :goto_14

    :cond_16
    invoke-static/range {v18 .. v18}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_14
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v8, 0x1

    invoke-direct {v7, v3, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual/range {p0 .. p0}, Lf01/u;->f()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v11, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v8

    invoke-virtual {v1, v11, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->L()Lb91/a;

    move-result-object v26

    const/16 v30, 0x0

    const v31, 0x2fff8

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    move-object v3, v12

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

    move/from16 v33, v6

    move-object v6, v0

    move/from16 v0, v33

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    invoke-virtual/range {p0 .. p0}, Lf01/u;->b()Lgz0/m0;

    move-result-object v4

    if-nez v4, :cond_17

    const v0, 0x3736c0a1

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_15
    const/4 v8, 0x1

    goto :goto_16

    :cond_17
    const v5, 0x3736c0a2

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    const/4 v8, 0x1

    int-to-float v5, v8

    mul-float v13, v5, v32

    const/16 v16, 0x0

    const/16 v17, 0xe

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v12, v3

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v2, v2

    mul-float/2addr v2, v2

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-static {v3, v2}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-static {v2, v11, v0}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    invoke-virtual {v1, v11, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v9

    const/16 v12, 0x1b0

    const/4 v13, 0x0

    const/4 v7, 0x0

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_15

    :goto_16
    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_18
    const/4 v0, 0x0

    const v1, 0x8fd29f2

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_17
    invoke-virtual/range {p0 .. p0}, Lf01/u;->e()Lm91/u;

    move-result-object v6

    move-object/from16 v28, v11

    const/4 v11, 0x0

    const/16 v12, 0xe

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v10, v28

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v10

    const/4 v8, 0x1

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_19
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_18
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;Lf01/u;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lf01/t;->f(Landroidx/compose/ui/Modifier;Lf01/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move/from16 v0, p1

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, -0x27b7b0b5

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v1, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v3, Lf01/u;

    sget-object v6, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    sget-object v2, Le81/b;->a:Le81/b;

    invoke-virtual {v2}, Le81/b;->n()Le81/n;

    move-result-object v7

    sget-object v9, Le81/l;->PIE_RIGHT:Le81/l;

    const/16 v17, 0x1fd

    const/16 v18, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v7 .. v18}, Le81/n;->c(Le81/n;Ljava/lang/String;Le81/l;Le81/f0;Le81/a;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Le81/m;FILjava/lang/Object;)Le81/n;

    move-result-object v8

    new-instance v9, Lcom/whoop/navigation/e;

    const/4 v13, 0x7

    invoke-direct/range {v9 .. v14}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v12, 0x88

    const/4 v13, 0x0

    const-string v4, "advanced_labs_dynamic_entry_point"

    const-string v5, "ADVANCED LABS"

    const/4 v7, 0x0

    move-object v10, v9

    const-string v9, "ADVANCED LABS"

    invoke-direct/range {v3 .. v13}, Lf01/u;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lf01/q0;Lm91/u;Ljava/lang/String;Ljava/lang/Object;Lm51/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lkotlin/jvm/internal/k0;

    const/16 v4, 0xa

    invoke-direct {v2, v4}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v4

    invoke-static {v4, v2}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v4

    invoke-static {v4, v2}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v4

    invoke-static {v4, v2}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v4

    invoke-static {v4, v2}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v4

    sget-object v5, Lm83/a0;->w:Lm83/a0;

    invoke-static {v5, v4, v2}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v4

    invoke-static {v5, v4, v2}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v4

    sget-object v5, Lfy1/i;->a:Lfy1/i;

    invoke-static {v4, v5, v2}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v4

    sget-object v5, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v4, v5}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v4

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v4, Lb3/v1;->l:Lp1/u2;

    iget-object v5, v2, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v4, v2, v5}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v2

    new-array v2, v2, [Lp1/u1;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lp1/u1;

    new-instance v4, Lf01/t$a;

    invoke-direct {v4, v3}, Lf01/t$a;-><init>(Lf01/u;)V

    const v3, -0x124c2861

    invoke-static {v3, v1, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v4, 0x38

    invoke-static {v2, v3, v1, v4}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lcom/whoop/profile/view/edit/preview/a;

    const/16 v3, 0x1c

    invoke-direct {v2, v0, v3}, Lcom/whoop/profile/view/edit/preview/a;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lf01/t;->k(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
