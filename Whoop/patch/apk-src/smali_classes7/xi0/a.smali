.class public abstract Lxi0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u001aG\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007H\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\"\u001a\u0010\u0011\u001a\u00020\u00038\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u001a\u0010\u0014\u001a\u00020\u00038\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u000e\u001a\u0004\u0008\u0013\u0010\u0010\u00a8\u0006\u0015"
    }
    d2 = {
        "Ll0/u;",
        "Lkd1/o;",
        "imageSource",
        "Ly3/f;",
        "maxHeight",
        "",
        "scrollOffset",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onHeightChanged",
        "f",
        "(Ll0/u;Lkd1/o;Ly3/f;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "a",
        "F",
        "getBACKGROUND_IMAGE_FADE_HEIGHT",
        "()F",
        "BACKGROUND_IMAGE_FADE_HEIGHT",
        "b",
        "l",
        "HERO_IMAGE_MAX_HEIGHT",
        "arch-v2_release"
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
.field private static final a:F

.field private static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x96

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lxi0/a;->a:F

    const/16 v0, 0x230

    int-to-float v0, v0

    sput v0, Lxi0/a;->b:F

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ly3/l;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lxi0/a;->i(Lkotlin/jvm/functions/Function1;Ly3/l;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(FLi2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lxi0/a;->h(FLi2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(FLi2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lxi0/a;->j(FLi2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ll0/u;Lkd1/o;Ly3/f;FLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lxi0/a;->k(Ll0/u;Lkd1/o;Ly3/f;FLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(I)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lxi0/a;->g(I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ll0/u;Lkd1/o;Ly3/f;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll0/u;",
            "Lkd1/o;",
            "Ly3/f;",
            "F",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v0, p6

    sget-object v8, Lb2/e;->x:Lb2/m;

    const-string v3, "$this$TemplateBackgroundImage"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "imageSource"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p5

    check-cast v5, Lp1/q;

    const v3, 0x2c88bc3f

    invoke-virtual {v5, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v0

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    and-int/lit8 v4, v0, 0x30

    if-nez v4, :cond_4

    and-int/lit8 v4, v0, 0x40

    if-nez v4, :cond_2

    invoke-virtual {v5, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_2

    :cond_2
    invoke-virtual {v5, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, p7, 0x2

    if-eqz v4, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v0, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v5, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v3, v7

    :goto_5
    and-int/lit8 v7, p7, 0x4

    if-eqz v7, :cond_9

    or-int/lit16 v3, v3, 0xc00

    :cond_8
    move/from16 v10, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v0, 0xc00

    if-nez v10, :cond_8

    move/from16 v10, p3

    invoke-virtual {v5, v10}, Lp1/q;->d(F)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v3, v11

    :goto_7
    and-int/lit8 v11, p7, 0x8

    if-eqz v11, :cond_c

    or-int/lit16 v3, v3, 0x6000

    :cond_b
    move-object/from16 v13, p4

    :goto_8
    move v14, v3

    goto :goto_a

    :cond_c
    and-int/lit16 v13, v0, 0x6000

    if-nez v13, :cond_b

    move-object/from16 v13, p4

    invoke-virtual {v5, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    const/16 v14, 0x4000

    goto :goto_9

    :cond_d
    const/16 v14, 0x2000

    :goto_9
    or-int/2addr v3, v14

    goto :goto_8

    :goto_a
    and-int/lit16 v3, v14, 0x2493

    const/16 v15, 0x2492

    const/4 v10, 0x1

    if-eq v3, v15, :cond_e

    move v3, v10

    goto :goto_b

    :cond_e
    const/4 v3, 0x0

    :goto_b
    and-int/lit8 v15, v14, 0x1

    invoke-virtual {v5, v15, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_20

    if-eqz v4, :cond_f

    const/4 v3, 0x0

    move-object v15, v3

    goto :goto_c

    :cond_f
    move-object v15, v6

    :goto_c
    const/4 v3, 0x0

    if-eqz v7, :cond_10

    move v4, v3

    goto :goto_d

    :cond_10
    move/from16 v4, p3

    :goto_d
    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v11, :cond_12

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v6, :cond_11

    new-instance v7, Lxa0/a;

    const/16 v11, 0x13

    invoke-direct {v7, v11}, Lxa0/a;-><init>(I)V

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v13, v7

    :cond_12
    sget v7, Lkd1/o;->a:I

    shr-int/lit8 v11, v14, 0x3

    and-int/lit8 v11, v11, 0xe

    or-int/2addr v7, v11

    move-object v11, v6

    move v6, v7

    const/4 v7, 0x3

    move/from16 v16, v3

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    move-object v12, v11

    move/from16 v9, v16

    move/from16 v11, v17

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v3

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    if-eqz v15, :cond_19

    iget v6, v15, Ly3/f;->w:F

    const v7, 0x7c0e74ad

    invoke-virtual {v5, v7}, Lp1/q;->e0(I)V

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-interface {v1, v7, v8}, Ll0/u;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7, v9, v6, v10}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/high16 v8, 0x3f000000    # 0.5f

    mul-float/2addr v6, v8

    invoke-static {v7, v6}, Lgb1/c;->e(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v6

    and-int/lit16 v7, v14, 0x1c00

    const/16 v8, 0x800

    if-ne v7, v8, :cond_13

    move v7, v10

    goto :goto_e

    :cond_13
    const/4 v7, 0x0

    :goto_e
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_14

    if-ne v8, v12, :cond_15

    :cond_14
    new-instance v8, Lb01/k;

    const/4 v7, 0x7

    invoke-direct {v8, v11, v7}, Lb01/k;-><init>(FI)V

    invoke-virtual {v5, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v8}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->w:Lb2/m;

    const/4 v8, 0x0

    invoke-static {v7, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v8, v5, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v5, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v14, v5, Lp1/q;->S:Z

    if-eqz v14, :cond_16

    invoke-virtual {v5, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_16
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_f
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v5, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v5, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, v5, Lp1/q;->S:Z

    if-nez v9, :cond_17

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_18

    :cond_17
    invoke-static {v8, v5, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v5, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move/from16 v17, v11

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, Lb2/e;->E:Lb2/m;

    move/from16 v2, v17

    const/16 v17, 0x6db0

    const/16 v18, 0x60

    move v4, v10

    const/4 v10, 0x0

    move-object v7, v13

    sget-object v13, Ly2/j;->a:Ly2/b1;

    const/4 v14, 0x0

    move-object v6, v15

    const/4 v15, 0x0

    move-object v9, v3

    move-object/from16 v16, v5

    const/4 v3, 0x0

    move v5, v2

    move v2, v4

    invoke-static/range {v9 .. v18}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v9, v16

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_12

    :cond_19
    move-object v9, v5

    move v5, v11

    move-object v7, v13

    move-object v6, v15

    move v11, v10

    move-object v10, v3

    const/4 v3, 0x0

    const v13, 0x7c1788b5

    invoke-virtual {v9, v13}, Lp1/q;->e0(I)V

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-interface {v1, v2, v8}, Ll0/u;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const v4, 0xe000

    and-int/2addr v4, v14

    const/16 v8, 0x4000

    if-ne v4, v8, :cond_1a

    move v4, v11

    goto :goto_10

    :cond_1a
    move v4, v3

    :goto_10
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_1b

    if-ne v8, v12, :cond_1c

    :cond_1b
    new-instance v8, Lwo1/h;

    const/16 v4, 0xe

    invoke-direct {v8, v7, v4}, Lwo1/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v8}, Landroidx/compose/ui/layout/b;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v4, Lxi0/a;->a:F

    invoke-static {v2, v4}, Lgb1/c;->e(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v2

    and-int/lit16 v4, v14, 0x1c00

    const/16 v8, 0x800

    if-ne v4, v8, :cond_1d

    goto :goto_11

    :cond_1d
    move v11, v3

    :goto_11
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v11, :cond_1e

    if-ne v4, v12, :cond_1f

    :cond_1e
    new-instance v4, Lb01/k;

    const/16 v8, 0x8

    invoke-direct {v4, v5, v8}, Lb01/k;-><init>(FI)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v4}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/16 v17, 0x6030

    const/16 v18, 0x68

    move-object/from16 v16, v9

    move-object v9, v10

    const/4 v10, 0x0

    const/4 v12, 0x0

    sget-object v13, Ly2/j;->d:Ly2/b1;

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v9 .. v18}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v9, v16

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    :goto_12
    move v4, v5

    move-object v5, v7

    :goto_13
    move-object v3, v6

    goto :goto_14

    :cond_20
    move-object v9, v5

    invoke-virtual {v9}, Lp1/q;->X()V

    move/from16 v4, p3

    move-object v5, v13

    goto :goto_13

    :goto_14
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_21

    new-instance v0, Lc51/b;

    move-object/from16 v2, p1

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lc51/b;-><init>(Ll0/u;Lkd1/o;Ly3/f;FLkotlin/jvm/functions/Function1;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final g(I)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(FLi2/g0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    neg-float p0, p0

    check-cast p1, Li2/x0;

    invoke-virtual {p1, p0}, Li2/x0;->E(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Ly3/l;)Ll83/a0;
    .locals 4

    iget-wide v0, p1, Ly3/l;->a:J

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(FLi2/g0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    neg-float p0, p0

    check-cast p1, Li2/x0;

    invoke-virtual {p1, p0}, Li2/x0;->E(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Ll0/u;Lkd1/o;Ly3/f;FLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lxi0/a;->f(Ll0/u;Lkd1/o;Ly3/f;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final l()F
    .locals 1

    sget v0, Lxi0/a;->b:F

    return v0
.end method
