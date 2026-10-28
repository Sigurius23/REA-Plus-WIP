.class public abstract Lr81/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a-\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lr81/c;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onClick",
        "l",
        "(Lr81/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "h",
        "(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V",
        "Lr81/e;",
        "perks",
        "j",
        "(Lr81/e;Landroidx/compose/runtime/Composer;I)V",
        "Lr81/d;",
        "whoopProCta",
        "o",
        "(Lr81/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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

    invoke-static {p0}, Lr81/b;->m(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lr81/b;->p(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lr81/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lr81/b;->r(Lr81/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lr81/d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lr81/b;->q(Lkotlin/jvm/functions/Function1;Lr81/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lr81/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lr81/b;->n(Lr81/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lr81/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lr81/b;->k(Lr81/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lr81/b;->i(Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "title"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v2, -0x4de1a8a1

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x4

    const/4 v10, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v10

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v4, v2, 0x3

    const/4 v11, 0x1

    if-eq v4, v10, :cond_2

    move v4, v11

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    and-int/lit8 v5, v2, 0x1

    invoke-virtual {v7, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_9

    sget-object v4, Ll0/m;->a:Ll0/e;

    const/4 v13, 0x6

    int-to-float v4, v13

    int-to-float v14, v3

    mul-float/2addr v4, v14

    sget-object v3, Lb2/e;->J:Lb2/l;

    invoke-static {v4, v3}, Ll0/m;->k(FLb2/g;)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->N:Lb2/k;

    const/16 v5, 0x36

    invoke-static {v3, v4, v7, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    const/16 p1, 0xe

    iget-boolean v12, v7, Lp1/q;->S:Z

    if-eqz v12, :cond_3

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_3
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v7, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v7, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-nez v10, :cond_4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    :cond_4
    invoke-static {v4, v7, v4, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v7, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v8, v11

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v8, v10

    invoke-static {v8}, Ll0/m;->i(F)Ll0/k;

    move-result-object v8

    sget-object v10, Lb2/e;->K:Lb2/l;

    invoke-static {v8, v10, v7, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    move-object v8, v12

    iget-wide v11, v7, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v7, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-eqz v10, :cond_6

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v7, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v3, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-nez v3, :cond_7

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    :cond_7
    invoke-static {v11, v7, v11, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v7, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    mul-float v11, v14, v14

    const/4 v12, 0x0

    const/4 v10, 0x1

    invoke-static {v15, v12, v11, v10}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v4, 0x27

    int-to-float v4, v4

    mul-float/2addr v4, v14

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v13, Lx81/d;->a:Lx81/d;

    invoke-virtual {v13}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/u;->g()I

    move-result v3

    const/4 v4, 0x6

    invoke-static {v3, v7, v4}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    const/16 v8, 0x1b0

    const/16 v9, 0x78

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v9}, Lpf/c;->d(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;Li2/p;Landroidx/compose/runtime/Composer;II)V

    const/4 v10, 0x1

    invoke-static {v15, v12, v11, v10}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v4, 0xd

    int-to-float v4, v4

    mul-float/2addr v4, v14

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v13}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/u;->b()I

    move-result v3

    const/4 v11, 0x6

    invoke-static {v3, v7, v11}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static/range {v3 .. v9}, Lpf/c;->d(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;Li2/p;Landroidx/compose/runtime/Composer;II)V

    const/4 v10, 0x1

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    and-int/lit8 v2, v2, 0xe

    invoke-static {v0, v7, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v13, v7, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->q()Lb91/a;

    move-result-object v2

    invoke-virtual {v13, v7, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->q()Lb91/a;

    move-result-object v4

    invoke-virtual {v4}, Lb91/a;->d()Ll3/v0;

    move-result-object v17

    invoke-virtual {v13, v7, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b1()J

    move-result-wide v18

    const/16 v30, 0x0

    const v31, 0xfffffe

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v17 .. v31}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-static {v2, v4, v5, v6, v5}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v23

    const/16 v27, 0x0

    const v28, 0x2fffe

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object/from16 v25, v7

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    move/from16 v18, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    move/from16 v2, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v25

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_9
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_a

    new-instance v3, Lbm2/b1;

    const/16 v4, 0xe

    invoke-direct {v3, v0, v1, v4}, Lbm2/b1;-><init>(Lcom/whoop/design/util/TextResource;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final i(Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lr81/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lr81/e;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v2, 0x5f925d34

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v5, v2, 0x3

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v5, v3, :cond_2

    move v3, v11

    goto :goto_2

    :cond_2
    move v3, v10

    :goto_2
    and-int/2addr v2, v11

    invoke-virtual {v7, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_6

    int-to-float v2, v11

    int-to-float v3, v4

    mul-float/2addr v2, v3

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/4 v5, 0x0

    invoke-static {v4, v5, v2, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Ll0/m;->a:Ll0/e;

    const/4 v4, 0x3

    int-to-float v4, v4

    mul-float/2addr v4, v3

    sget-object v3, Lb2/e;->N:Lb2/k;

    invoke-static {v4, v3}, Ll0/m;->j(FLb2/f;)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->K:Lb2/l;

    const/16 v5, 0x36

    invoke-static {v3, v4, v7, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v4, v7, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_3

    invoke-virtual {v7, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_3
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v7, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v7, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-nez v5, :cond_4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    invoke-static {v4, v7, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v7, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lr81/e;->b()I

    move-result v2

    const/4 v12, 0x6

    invoke-static {v2, v7, v12}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    sget-object v13, Lx81/d;->a:Lx81/d;

    invoke-virtual {v13, v7, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->z()J

    move-result-wide v5

    const/16 v8, 0x30

    const/4 v9, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0}, Lr81/e;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v7, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v7, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v13, v7, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v4

    const/16 v26, 0x0

    const v27, 0x2fffa

    const/4 v3, 0x0

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v13, v11

    const-wide/16 v11, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const-wide/16 v15, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v28, v25

    const/16 v25, 0x0

    move/from16 v0, v28

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    move v0, v11

    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_7

    new-instance v3, Ld81/b;

    move-object/from16 v4, p0

    invoke-direct {v3, v4, v1, v0}, Ld81/b;-><init>(Lr81/e;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final k(Lr81/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lr81/b;->j(Lr81/e;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final l(Lr81/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr81/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v0, -0x20855d05

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :goto_3
    and-int/lit8 v6, v0, 0x13

    const/16 v7, 0x12

    const/4 v9, 0x0

    if-eq v6, v7, :cond_5

    const/4 v6, 0x1

    goto :goto_4

    :cond_5
    move v6, v9

    :goto_4
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v12, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_12

    if-eqz v4, :cond_7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_6

    new-instance v4, Lr61/h;

    invoke-direct {v4, v3}, Lr61/h;-><init>(I)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v10, v4

    goto :goto_5

    :cond_7
    move-object v10, v5

    :goto_5
    const/16 v4, 0x8

    int-to-float v4, v4

    int-to-float v2, v2

    mul-float/2addr v4, v2

    const/4 v5, 0x0

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v4, v5, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/m;->a:Ll0/e;

    const/4 v4, 0x6

    int-to-float v4, v4

    mul-float/2addr v4, v2

    sget-object v2, Lb2/e;->J:Lb2/l;

    invoke-static {v4, v2}, Ll0/m;->k(FLb2/g;)Ll0/k;

    move-result-object v2

    sget-object v4, Lb2/e;->N:Lb2/k;

    const/16 v5, 0x36

    invoke-static {v2, v4, v12, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v4, v12, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v12, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-eqz v6, :cond_8

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_6
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v12, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v12, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-nez v6, :cond_9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    :cond_9
    invoke-static {v4, v12, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v12, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lr81/c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v12, v9}, Lr81/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    move-object v3, v2

    invoke-virtual {v1}, Lr81/c;->a()Lm91/u;

    move-result-object v2

    if-nez v2, :cond_b

    const v2, 0x7f787e92

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    move-object/from16 v18, v4

    move-object v15, v5

    move-object v6, v12

    move-object v12, v3

    goto :goto_7

    :cond_b
    const v6, 0x7f787e93

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    const/4 v7, 0x0

    const/16 v8, 0xe

    move-object v6, v3

    const/4 v3, 0x0

    move-object/from16 v16, v4

    const/4 v4, 0x0

    move-object/from16 v17, v5

    const/4 v5, 0x0

    move-object v15, v12

    move-object v12, v6

    move-object v6, v15

    move-object/from16 v18, v16

    move-object/from16 v15, v17

    invoke-static/range {v2 .. v8}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v1}, Lr81/c;->b()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_10

    const v2, 0x7f79cef9

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    sget-object v3, Lhy0/g;->DOTTED:Lhy0/g;

    move-object v2, v13

    const/16 v13, 0x30

    move-object v4, v14

    const/16 v14, 0xfd

    move-object v5, v2

    const/4 v2, 0x0

    move-object v7, v4

    const/4 v4, 0x0

    move-object v8, v5

    const/4 v5, 0x0

    move-object/from16 v16, v12

    move-object v12, v6

    const/4 v6, 0x0

    move-object/from16 v19, v7

    move-object/from16 v17, v8

    const-wide/16 v7, 0x0

    move/from16 v21, v9

    move-object/from16 v20, v10

    const-wide/16 v9, 0x0

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move/from16 v23, v0

    move-object/from16 v1, v17

    move-object/from16 v0, v19

    move-object/from16 v24, v22

    move-object/from16 v17, v15

    move/from16 v15, v21

    invoke-static/range {v2 .. v14}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v3, v12, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, v12, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    move-object/from16 v5, v24

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-eqz v6, :cond_c

    invoke-virtual {v12, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v12, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v6, v16

    invoke-static {v12, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_d

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    :cond_d
    move-object/from16 v0, v17

    goto :goto_a

    :cond_e
    :goto_9
    move-object/from16 v0, v18

    goto :goto_b

    :goto_a
    invoke-static {v3, v12, v3, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_9

    :goto_b
    invoke-static {v12, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x6c8a47ac

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lr81/c;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr81/e;

    invoke-static {v1, v12, v15}, Lr81/b;->j(Lr81/e;Landroidx/compose/runtime/Composer;I)V

    goto :goto_c

    :cond_f
    const/4 v1, 0x1

    invoke-static {v12, v15, v1, v15}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_d

    :cond_10
    move/from16 v23, v0

    move-object v12, v6

    move v15, v9

    move-object/from16 v20, v10

    const v0, 0x7f7d26dd

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual/range {p0 .. p0}, Lr81/c;->e()Lr81/d;

    move-result-object v0

    if-nez v0, :cond_11

    const v0, 0x7f7da548

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    move-object/from16 v4, v20

    :goto_e
    const/4 v1, 0x1

    goto :goto_f

    :cond_11
    const v1, 0x7f7da549

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    sget-object v3, Lhy0/g;->DOTTED:Lhy0/g;

    const/16 v13, 0x30

    const/16 v14, 0xfd

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v2 .. v14}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    sget v1, Lcom/whoop/navigation/e;->d:I

    and-int/lit8 v2, v23, 0x70

    or-int/2addr v1, v2

    move-object/from16 v4, v20

    invoke-static {v0, v4, v12, v1, v15}, Lr81/b;->o(Lr81/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    goto :goto_e

    :goto_f
    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    move-object v3, v4

    goto :goto_10

    :cond_12
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v3, v5

    :goto_10
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_13

    new-instance v0, Lqk2/i;

    const/4 v5, 0x3

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lqk2/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final m(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lr81/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lr81/b;->l(Lr81/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lr81/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 46
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr81/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v0, -0x585f6ab1

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_3

    :cond_5
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v0, v7

    :goto_4
    and-int/lit8 v7, v0, 0x13

    const/16 v8, 0x12

    if-eq v7, v8, :cond_6

    const/4 v7, 0x1

    goto :goto_5

    :cond_6
    const/4 v7, 0x0

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v11, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_15

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v7, :cond_7

    new-instance v4, Lr61/h;

    const/4 v6, 0x3

    invoke-direct {v4, v6}, Lr61/h;-><init>(I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_8
    move-object v4, v6

    :goto_6
    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, Lb2/e;->N:Lb2/k;

    sget-object v14, Ll0/m;->a:Ll0/e;

    const/16 v14, 0x18

    int-to-float v14, v14

    sget-object v15, Lb2/e;->J:Lb2/l;

    invoke-static {v14, v15}, Ll0/m;->k(FLb2/g;)Ll0/k;

    move-result-object v14

    const/16 v15, 0x36

    invoke-static {v14, v13, v11, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    iget-wide v14, v11, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v11, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-eqz v3, :cond_9

    invoke-virtual {v11, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_7
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v11, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v11, v13, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-nez v5, :cond_a

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    :cond_a
    invoke-static {v14, v11, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v11, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, Lb2/e;->L:Lb2/l;

    sget-object v12, Ll0/m;->a:Ll0/e;

    const/16 v14, 0x30

    invoke-static {v12, v6, v11, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v9, v11, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_c

    invoke-virtual {v11, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v11, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v13, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-nez v2, :cond_d

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    :cond_d
    invoke-static {v9, v11, v9, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v11, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lr81/d;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/4 v12, 0x0

    invoke-static {v2, v11, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v3, v11, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->y()Lb91/a;

    move-result-object v22

    invoke-virtual {v3, v11, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v9

    const/16 v26, 0x0

    const v27, 0x2fffa

    move-object v6, v3

    const/4 v3, 0x0

    move-object v13, v6

    move-object v14, v7

    const-wide/16 v6, 0x0

    move-object v15, v8

    const/4 v8, 0x0

    move/from16 v18, v5

    move-wide/from16 v44, v9

    move-object v10, v4

    move-wide/from16 v4, v44

    const/4 v9, 0x0

    move-object/from16 v20, v10

    const/4 v10, 0x0

    move-object/from16 v24, v11

    move/from16 v21, v12

    const-wide/16 v11, 0x0

    move-object/from16 v23, v13

    const/4 v13, 0x0

    move-object/from16 v25, v14

    const/4 v14, 0x0

    move-object/from16 v29, v15

    const/16 v28, 0x2

    const-wide/16 v15, 0x0

    const/16 v30, 0x20

    const/16 v17, 0x0

    move/from16 v31, v18

    const/16 v18, 0x0

    const/16 v32, 0x1

    const/16 v19, 0x0

    move-object/from16 v33, v20

    const/16 v20, 0x0

    move/from16 v34, v21

    const/16 v21, 0x0

    move-object/from16 v35, v23

    const/16 v23, 0x0

    move-object/from16 v36, v25

    const/16 v25, 0x0

    move/from16 v37, v0

    move/from16 v1, v31

    move/from16 v0, v32

    move-object/from16 v38, v33

    move-object/from16 v39, v35

    move-object/from16 v40, v36

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v24

    int-to-float v2, v0

    const/4 v3, 0x4

    int-to-float v4, v3

    mul-float v16, v2, v4

    const/16 v17, 0x7

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v12, v29

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lr81/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/4 v12, 0x0

    invoke-static {v2, v11, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v5, v39

    invoke-virtual {v5, v11, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->b()Lb91/a;

    move-result-object v6

    invoke-static {v5, v11, v1}, Lih0/d0;->r(Lx81/d;Lp1/q;I)Ll3/v0;

    move-result-object v12

    invoke-virtual {v5, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v13

    const/16 v25, 0x0

    const v26, 0xfffffe

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    invoke-static/range {v12 .. v26}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v7

    const/4 v9, 0x2

    invoke-static {v6, v7, v8, v9, v8}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v22

    const/16 v26, 0x0

    const v27, 0x2fffc

    move v6, v4

    move-object v13, v5

    const-wide/16 v4, 0x0

    move v8, v6

    const-wide/16 v6, 0x0

    move v10, v8

    const/4 v8, 0x0

    move/from16 v41, v9

    const/4 v9, 0x0

    move v12, v10

    const/4 v10, 0x0

    move-object/from16 v24, v11

    move v14, v12

    const-wide/16 v11, 0x0

    move-object/from16 v35, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const-wide/16 v15, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v28, v25

    const/16 v25, 0x30

    move-object/from16 v43, v29

    move-object/from16 v42, v35

    move/from16 v1, v41

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v24

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    const/4 v2, 0x5

    int-to-float v2, v2

    mul-float v2, v2, v28

    const/4 v3, 0x0

    move-object/from16 v12, v43

    invoke-static {v12, v2, v3, v1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual/range {p0 .. p0}, Lr81/d;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const/4 v12, 0x0

    invoke-static {v1, v11, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v13, v42

    const/4 v1, 0x6

    invoke-virtual {v13, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->z()J

    move-result-wide v6

    and-int/lit8 v1, v37, 0x70

    const/16 v5, 0x20

    if-ne v1, v5, :cond_f

    move v9, v0

    goto :goto_9

    :cond_f
    move v9, v12

    :goto_9
    and-int/lit8 v1, v37, 0xe

    const/4 v5, 0x4

    if-eq v1, v5, :cond_11

    and-int/lit8 v1, v37, 0x8

    if-eqz v1, :cond_10

    move-object/from16 v1, p0

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_12

    goto :goto_a

    :cond_10
    move-object/from16 v1, p0

    goto :goto_b

    :cond_11
    move-object/from16 v1, p0

    :goto_a
    move v12, v0

    :cond_12
    :goto_b
    or-int v5, v9, v12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_14

    move-object/from16 v14, v40

    if-ne v8, v14, :cond_13

    goto :goto_c

    :cond_13
    move-object/from16 v14, v38

    goto :goto_d

    :cond_14
    :goto_c
    new-instance v8, Lqt2/e;

    const/16 v5, 0xa

    move-object/from16 v14, v38

    invoke-direct {v8, v5, v14, v1}, Lqt2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_d
    move-object v10, v8

    check-cast v10, Lc93/a;

    const/16 v12, 0x36

    const/16 v13, 0x68

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v13}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move-object v3, v14

    goto :goto_e

    :cond_15
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v3, v6

    :goto_e
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_16

    new-instance v0, Lqk2/i;

    const/4 v5, 0x4

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lqk2/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final p(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;Lr81/d;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lr81/d;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lr81/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lr81/b;->o(Lr81/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
