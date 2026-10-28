.class public abstract Llf0/v1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u000f\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Llf0/w1;",
        "state",
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/ui/Modifier;Llf0/w1;Landroidx/compose/runtime/Composer;II)V",
        "Liz0/m;",
        "f",
        "(Landroidx/compose/runtime/Composer;I)Liz0/m;",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Llf0/w1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Llf0/v1;->e(Landroidx/compose/ui/Modifier;Llf0/w1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llf0/w1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Llf0/v1;->d(Llf0/w1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Llf0/w1;Landroidx/compose/runtime/Composer;II)V
    .locals 16

    move-object/from16 v3, p1

    const-string v0, "state"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v0, -0x7dd8e409

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, p3, 0x6

    move v2, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move/from16 v2, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_4
    and-int/lit8 v4, v2, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v4, v5, :cond_5

    move v4, v7

    goto :goto_3

    :cond_5
    move v4, v6

    :goto_3
    and-int/2addr v2, v7

    invoke-virtual {v13, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_7

    if-eqz v0, :cond_6

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_4

    :cond_6
    move-object v0, v1

    :goto_4
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v13, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->T()J

    move-result-wide v1

    const/16 v5, 0xc

    int-to-float v5, v5

    invoke-static {v5}, Lt0/j;->e(F)Lt0/i;

    move-result-object v8

    int-to-float v11, v6

    new-instance v5, Lkk1/b;

    const/16 v6, 0x11

    invoke-direct {v5, v3, v6}, Lkk1/b;-><init>(Ljava/lang/Object;I)V

    const v6, 0x3e5b8b87

    invoke-static {v6, v13, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    const/high16 v14, 0xd80000

    const/16 v15, 0x32

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-wide v6, v1

    invoke-static/range {v4 .. v15}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v0

    goto :goto_5

    :cond_7
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_8

    new-instance v0, Lio2/k0;

    const/16 v5, 0x1a

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lio2/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final d(Llf0/w1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 15

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v12, p1

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x10

    int-to-float v0, v0

    const/16 v1, 0xc

    int-to-float v1, v1

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v0, v1}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {p0}, Llf0/w1;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v12, v2}, Llf0/v1;->f(Landroidx/compose/runtime/Composer;I)Liz0/m;

    move-result-object v6

    sget p0, Liz0/m;->p:I

    shl-int/lit8 p0, p0, 0x9

    or-int/lit8 v13, p0, 0x30

    const/16 v14, 0x1f4

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v3 .. v14}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Llf0/w1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Llf0/v1;->c(Landroidx/compose/ui/Modifier;Llf0/w1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final f(Landroidx/compose/runtime/Composer;I)Liz0/m;
    .locals 27

    move-object/from16 v0, p0

    sget-object v1, Liz0/l;->a:Liz0/l;

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v0, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->c()Lb91/a;

    move-result-object v4

    invoke-virtual {v4}, Lb91/a;->d()Ll3/v0;

    move-result-object v4

    invoke-virtual {v2, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v5

    sget-object v7, Lp3/r;->x:Lp3/r;

    sget-object v9, Lp3/r;->z:Lp3/r;

    invoke-virtual {v2, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->d1()J

    move-result-wide v10

    invoke-virtual {v2, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->X()J

    move-result-wide v13

    sget v2, Liz0/l;->b:I

    shl-int/lit8 v25, v2, 0xf

    const/16 v26, 0x7f0c

    move-object v2, v4

    move-wide v3, v5

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x6000

    move-object/from16 v23, v0

    invoke-virtual/range {v1 .. v26}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v0

    return-object v0
.end method
