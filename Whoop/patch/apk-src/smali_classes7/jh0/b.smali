.class public abstract Ljh0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a;\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "",
        "startIcon",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "e",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Lt0/i;",
        "a",
        "Lt0/i;",
        "tileShape",
        "bot_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lt0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x2

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v0

    sput-object v0, Ljh0/b;->a:Lt0/i;

    return-void
.end method

.method public static synthetic a(Li2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljh0/b;->f(Li2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lf2/d;)Lf2/g;
    .locals 0

    invoke-static {p0}, Ljh0/b;->g(Lf2/d;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ljh0/b;->i(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljh0/b;->h(Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/Integer;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v0, p5

    const-string v1, "title"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onClick"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p4

    check-cast v1, Lp1/q;

    const v3, -0x59ea8661

    invoke-virtual {v1, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p6, 0x1

    const/4 v10, 0x4

    const/4 v9, 0x2

    if-eqz v3, :cond_0

    or-int/lit8 v5, v0, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v1, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v10

    goto :goto_0

    :cond_1
    move v6, v9

    :goto_0
    or-int/2addr v6, v0

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v0

    :goto_1
    and-int/lit8 v7, v0, 0x30

    if-nez v7, :cond_5

    and-int/lit8 v7, v0, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v1, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_3

    :cond_4
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit8 v7, p6, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v6, v6, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v0, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-virtual {v1, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x100

    goto :goto_4

    :cond_8
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v6, v11

    :goto_5
    and-int/lit16 v11, v0, 0xc00

    if-nez v11, :cond_a

    invoke-virtual {v1, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    const/16 v11, 0x800

    goto :goto_6

    :cond_9
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v6, v11

    :cond_a
    move v11, v6

    and-int/lit16 v6, v11, 0x493

    const/16 v12, 0x492

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v6, v12, :cond_b

    move v6, v14

    goto :goto_7

    :cond_b
    move v6, v13

    :goto_7
    and-int/lit8 v12, v11, 0x1

    invoke-virtual {v1, v12, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_16

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_c

    move-object v12, v15

    goto :goto_8

    :cond_c
    move-object v12, v5

    :goto_8
    const/4 v3, 0x0

    if-eqz v7, :cond_d

    move-object/from16 v29, v3

    goto :goto_9

    :cond_d
    move-object/from16 v29, v8

    :goto_9
    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v7, 0x3

    invoke-static {v6, v3, v7}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Ljh0/b;->a:Lt0/i;

    invoke-static {v6, v8}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {}, Lgb1/b0;->D()Li2/t;

    move-result-object v8

    const/4 v5, 0x0

    move/from16 v21, v11

    const/4 v11, 0x6

    invoke-static {v6, v8, v3, v5, v11}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v6, 0x0

    const/16 v8, 0xf

    const/4 v4, 0x0

    const/4 v5, 0x0

    move/from16 v22, v7

    move-object/from16 v7, p3

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v4, v9

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v3, v4, v4}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->K:Lb2/l;

    sget-object v6, Ll0/m;->g:Ll0/h;

    const/16 v7, 0x36

    invoke-static {v6, v4, v1, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v6, v1, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v1, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v9, v1, Lp1/q;->S:Z

    if-eqz v9, :cond_e

    invoke-virtual {v1, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_e
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_a
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v1, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v1, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-nez v7, :cond_f

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_10

    :cond_f
    invoke-static {v6, v1, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v1, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v29, :cond_11

    const v3, 0x5c8a617d

    invoke-virtual {v1, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {v29 .. v29}, Ljava/lang/Integer;->intValue()I

    move-result v3

    shr-int/lit8 v4, v21, 0x3

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v4, v11

    invoke-static {v3, v1, v4}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v4, v1, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v6

    new-instance v4, Li2/p;

    const/4 v8, 0x5

    invoke-direct {v4, v6, v7, v8}, Li2/p;-><init>(JI)V

    int-to-float v6, v14

    mul-float v18, v6, v5

    const/16 v19, 0x0

    const/16 v20, 0xb

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v31, v15

    int-to-float v7, v11

    int-to-float v8, v10

    mul-float/2addr v7, v8

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v8, 0x1b0

    const/16 v9, 0x38

    move v7, v5

    move-object v5, v6

    move-object v6, v4

    const/4 v4, 0x0

    move/from16 v34, v7

    move-object v7, v1

    move/from16 v1, v34

    invoke-static/range {v3 .. v9}, Lpf/c;->d(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;Li2/p;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v13}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_11
    move-object v7, v1

    move v1, v5

    move-object/from16 v31, v15

    const v3, 0x5c8f5f07

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v13}, Lp1/q;->q(Z)V

    :goto_b
    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shr-int/lit8 v4, v21, 0x3

    and-int/lit8 v4, v4, 0xe

    or-int/2addr v3, v4

    invoke-static {v2, v7, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v7, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v23

    invoke-virtual {v4, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    const/high16 v8, 0x3f800000    # 1.0f

    float-to-double v10, v8

    const-wide/16 v15, 0x0

    cmpl-double v9, v10, v15

    if-lez v9, :cond_12

    move v13, v14

    :cond_12
    if-nez v13, :cond_13

    const-string v9, "invalid weight; must be greater than zero"

    invoke-static {v9}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_13
    move-object v9, v4

    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v4, v8, v14}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v27, v8, 0x12

    const v28, 0x2fff8

    move-object/from16 v25, v7

    const-wide/16 v7, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v13, v11

    const/4 v11, 0x0

    move-object v15, v12

    move-object/from16 v16, v13

    const-wide/16 v12, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v18, v15

    const/4 v15, 0x0

    move-object/from16 v19, v16

    move/from16 v20, v17

    const-wide/16 v16, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move-object/from16 v22, v19

    const/16 v19, 0x0

    move/from16 v24, v20

    const/16 v20, 0x0

    move-object/from16 v26, v21

    const/16 v21, 0x0

    move-object/from16 v30, v22

    const/16 v22, 0x0

    move/from16 v32, v24

    const/16 v24, 0x0

    move-object/from16 v33, v26

    const/16 v26, 0x0

    const/4 v0, 0x6

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v25

    invoke-virtual/range {v30 .. v30}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/w;->b()I

    move-result v3

    invoke-static {v3, v7, v0}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    const/4 v0, 0x1

    int-to-float v4, v0

    mul-float v16, v4, v1

    const/16 v19, 0x0

    const/16 v20, 0xe

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v15, v31

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v4, v4

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_14

    new-instance v4, Ljg/c;

    const/4 v6, 0x5

    invoke-direct {v4, v6}, Ljg/c;-><init>(I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v4}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_15

    new-instance v4, Ljg/c;

    const/4 v5, 0x6

    invoke-direct {v4, v5}, Ljg/c;-><init>(I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v4}, Landroidx/compose/ui/draw/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v8, 0x30

    const/16 v9, 0x78

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v9}, Lpf/c;->d(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;Li2/p;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, v29

    move-object/from16 v1, v33

    goto :goto_c

    :cond_16
    move-object v7, v1

    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v1, v5

    move-object v3, v8

    :goto_c
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_17

    new-instance v0, Lg1/m3;

    const/16 v7, 0x14

    move-object/from16 v4, p3

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lg1/m3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final f(Li2/g0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3f7d70a4    # 0.99f

    check-cast p0, Li2/x0;

    invoke-virtual {p0, v0}, Li2/x0;->a(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lf2/d;)Lf2/g;
    .locals 2

    const-string v0, "$this$drawWithCache"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljg/c;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ljg/c;-><init>(I)V

    invoke-virtual {p0, v0}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lk2/c;)Ll83/a0;
    .locals 11

    const-string v0, "$this$onDrawWithContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v2

    const/16 v9, 0x9

    const/16 v10, 0x3e

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v10}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Ljh0/b;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
