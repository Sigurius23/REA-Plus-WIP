.class public abstract Lsg2/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0017\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u000bH\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lrg2/p;",
        "heartRateState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "k",
        "(Lrg2/p;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "",
        "heartRate",
        "g",
        "(ILandroidx/compose/runtime/Composer;I)V",
        "Lrg2/p$a;",
        "e",
        "(Lrg2/p$a;Landroidx/compose/runtime/Composer;I)V",
        "Lrg2/p$c;",
        "state",
        "i",
        "(Lrg2/p$c;Landroidx/compose/runtime/Composer;I)V",
        "start-activity_release"
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
.method public static synthetic a(Lrg2/p$a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsg2/q;->f(Lrg2/p$a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsg2/q;->h(IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lrg2/p$c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsg2/q;->j(Lrg2/p$c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lrg2/p;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsg2/q;->l(Lrg2/p;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lrg2/p$a;Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    const v2, -0x17354f8b

    invoke-virtual {v8, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v5, v2, 0x3

    const/4 v11, 0x0

    const/4 v6, 0x1

    if-eq v5, v3, :cond_2

    move v3, v6

    goto :goto_2

    :cond_2
    move v3, v11

    :goto_2
    and-int/2addr v2, v6

    invoke-virtual {v8, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Lgz0/m0;->TINY_HEART_RATE:Lgz0/m0;

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    const/4 v3, 0x6

    invoke-static {v2, v8, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    sget-object v12, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v12, v8, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->k0()J

    move-result-wide v5

    int-to-float v3, v3

    int-to-float v4, v4

    mul-float/2addr v3, v4

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v9, 0x6186

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x1

    move-object/from16 v31, v3

    move-object v3, v2

    move-object/from16 v2, v31

    invoke-static/range {v2 .. v10}, Ln71/o;->M(Landroidx/compose/ui/Modifier;Lo2/e;Ljava/lang/String;JZLandroidx/compose/runtime/Composer;II)V

    invoke-static {v0}, Lsg2/x;->f(Lrg2/p;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-eqz v2, :cond_3

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v8, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v12, v8, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v12, v8, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v4

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v26, v3, 0x12

    const v27, 0x2fffa

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    move-object/from16 v24, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v15, v11

    move-object v14, v12

    const-wide/16 v11, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v19, v15

    move/from16 v18, v16

    const-wide/16 v15, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    const/16 v19, 0x0

    move-object/from16 v25, v20

    const/16 v20, 0x0

    move/from16 v28, v21

    const/16 v21, 0x0

    move/from16 v29, v23

    const/16 v23, 0x0

    move-object/from16 v30, v25

    const/16 v25, 0x0

    move/from16 v1, v28

    move/from16 v0, v29

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v24

    sget v2, Lhg2/a;->v:I

    invoke-static {v2, v8, v0}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v14, v30

    invoke-virtual {v14, v8, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->r()Lb91/a;

    move-result-object v22

    invoke-virtual {v14, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v4

    const/4 v8, 0x0

    const/4 v14, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    move-object/from16 v24, v8

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_3
    invoke-virtual/range {v24 .. v24}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v1, Los0/d;

    const/16 v2, 0x1c

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Los0/d;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final f(Lrg2/p$a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lsg2/q;->e(Lrg2/p$a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(ILandroidx/compose/runtime/Composer;I)V
    .locals 32

    move/from16 v0, p0

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    const v2, 0x5b7dd4e5

    invoke-virtual {v8, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->e(I)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v5, v2, 0x3

    const/4 v11, 0x0

    const/4 v6, 0x1

    if-eq v5, v3, :cond_2

    move v3, v6

    goto :goto_2

    :cond_2
    move v3, v11

    :goto_2
    and-int/2addr v2, v6

    invoke-virtual {v8, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v2, Lgz0/m0;->TINY_HEART_RATE:Lgz0/m0;

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    const/4 v3, 0x6

    invoke-static {v2, v8, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    sget-object v12, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v12, v8, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->k0()J

    move-result-wide v5

    int-to-float v3, v3

    int-to-float v4, v4

    mul-float/2addr v3, v4

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v9, 0x6186

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x1

    move-object/from16 v31, v3

    move-object v3, v2

    move-object/from16 v2, v31

    invoke-static/range {v2 .. v10}, Ln71/o;->M(Landroidx/compose/ui/Modifier;Lo2/e;Ljava/lang/String;JZLandroidx/compose/runtime/Composer;II)V

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v12, v8, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->x()Lb91/a;

    move-result-object v22

    invoke-virtual {v12, v8, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v4

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v26, v3, 0x12

    const v27, 0x2fffa

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    move-object/from16 v24, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v15, v11

    move-object v14, v12

    const-wide/16 v11, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v19, v15

    move/from16 v18, v16

    const-wide/16 v15, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    const/16 v19, 0x0

    move-object/from16 v25, v20

    const/16 v20, 0x0

    move/from16 v28, v21

    const/16 v21, 0x0

    move/from16 v29, v23

    const/16 v23, 0x0

    move-object/from16 v30, v25

    const/16 v25, 0x0

    move/from16 v1, v28

    move/from16 v0, v29

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v24

    sget v2, Lhg2/a;->v:I

    invoke-static {v2, v8, v0}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v14, v30

    invoke-virtual {v14, v8, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->r()Lb91/a;

    move-result-object v22

    invoke-virtual {v14, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v4

    const/4 v8, 0x0

    const/4 v14, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_3
    move-object/from16 v24, v8

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_3
    invoke-virtual/range {v24 .. v24}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v1, Lbm2/h;

    const/4 v2, 0x4

    move/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lbm2/h;-><init>(III)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final h(IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lsg2/q;->g(ILandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lrg2/p$c;Landroidx/compose/runtime/Composer;I)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v2, 0x65c22cd7

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_2

    and-int/lit8 v2, p2, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    or-int v2, p2, v2

    goto :goto_2

    :cond_2
    move/from16 v2, p2

    :goto_2
    and-int/lit8 v4, v2, 0x3

    const/4 v5, 0x1

    const/4 v10, 0x0

    if-eq v4, v3, :cond_3

    move v3, v5

    goto :goto_3

    :cond_3
    move v3, v10

    :goto_3
    and-int/2addr v2, v5

    invoke-virtual {v7, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Lrg2/p$c;->a()Lgz0/m0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    const/4 v3, 0x6

    invoke-static {v2, v7, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v11, v7, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->b1()J

    move-result-wide v5

    const/16 v8, 0x30

    const/4 v9, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    sget v2, Lhg2/a;->w:I

    invoke-static {v2, v7, v10}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v7, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->x()Lb91/a;

    move-result-object v22

    invoke-virtual {v11, v7, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v4

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v26, v3, 0x12

    const v27, 0x2fffa

    const/4 v3, 0x0

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v13, v10

    const/4 v10, 0x0

    move-object v14, v11

    move v15, v12

    const-wide/16 v11, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v18, v15

    move/from16 v19, v16

    const-wide/16 v15, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    const/16 v19, 0x0

    move-object/from16 v25, v20

    const/16 v20, 0x0

    move/from16 v28, v21

    const/16 v21, 0x0

    move/from16 v29, v23

    const/16 v23, 0x0

    move-object/from16 v30, v25

    const/16 v25, 0x0

    move/from16 v1, v28

    move/from16 v0, v29

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    sget v2, Lhg2/a;->v:I

    invoke-static {v2, v7, v0}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v14, v30

    invoke-virtual {v14, v7, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->r()Lb91/a;

    move-result-object v22

    invoke-virtual {v14, v7, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    const/4 v14, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_4

    :cond_4
    move-object/from16 v24, v7

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_4
    invoke-virtual/range {v24 .. v24}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v1, Los0/d;

    const/16 v2, 0x1d

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Los0/d;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final j(Lrg2/p$c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lsg2/q;->i(Lrg2/p$c;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Lrg2/p;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 9

    const-string v0, "heartRateState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, -0xa7066c8

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_2

    :cond_3
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_4
    :goto_3
    and-int/lit8 v3, v0, 0x13

    const/16 v4, 0x12

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v3, v4, :cond_5

    move v3, v5

    goto :goto_4

    :cond_5
    move v3, v6

    :goto_4
    and-int/lit8 v4, v0, 0x1

    invoke-virtual {p2, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_d

    if-eqz v2, :cond_6

    sget-object p1, Lb2/t;->w:Lb2/t;

    :cond_6
    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v3

    mul-float/2addr v3, v2

    invoke-static {p1, v3, v1}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/4 v4, 0x6

    invoke-static {v2, v3, p2, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, p2, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {p2}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {p2, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {p2}, Lp1/q;->i0()V

    iget-boolean v8, p2, Lp1/q;->S:Z

    if-eqz v8, :cond_7

    invoke-virtual {p2, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {p2}, Lp1/q;->s0()V

    :goto_5
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {p2, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {p2, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, p2, Lp1/q;->S:Z

    if-nez v4, :cond_8

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    :cond_8
    invoke-static {v3, p2, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {p2, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    instance-of v1, p0, Lrg2/p$b;

    if-eqz v1, :cond_a

    const v0, -0x56c980ff

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    move-object v0, p0

    check-cast v0, Lrg2/p$b;

    invoke-virtual {v0}, Lrg2/p$b;->a()I

    move-result v0

    invoke-static {v0, p2, v6}, Lsg2/q;->g(ILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v6}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
    instance-of v1, p0, Lrg2/p$a;

    if-eqz v1, :cond_b

    const v1, -0x56c97542

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    move-object v1, p0

    check-cast v1, Lrg2/p$a;

    and-int/lit8 v0, v0, 0xe

    invoke-static {v1, p2, v0}, Lsg2/q;->e(Lrg2/p$a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v6}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_b
    instance-of v1, p0, Lrg2/p$c;

    if-eqz v1, :cond_c

    const v1, -0x56c96a4e

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    move-object v1, p0

    check-cast v1, Lrg2/p$c;

    and-int/lit8 v0, v0, 0xe

    invoke-static {v1, p2, v0}, Lsg2/q;->i(Lrg2/p$c;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v6}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    :goto_7
    move-object v3, p1

    goto :goto_8

    :cond_c
    const p0, -0x56c9869a

    invoke-static {p0, p2, v6}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_d
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_7

    :goto_8
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_e

    new-instance v0, Lqk2/i;

    const/16 v5, 0x12

    move-object v1, p0

    move v2, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lqk2/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final l(Lrg2/p;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lsg2/q;->k(Lrg2/p;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
