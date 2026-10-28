.class public abstract Lh01/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a7\u0010\n\u001a\u00020\t*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a?\u0010\u0011\u001a\u00020\t*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c2\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000fH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\"\u0017\u0010\u0018\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u0017\u0010\u001b\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0015\u001a\u0004\u0008\u001a\u0010\u0017\u00a8\u0006\u001c"
    }
    d2 = {
        "Ll0/u;",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll0/k1;",
        "paddingValues",
        "Lgz0/m0;",
        "icon",
        "Ly81/e;",
        "color",
        "Ll83/a0;",
        "i",
        "(Ll0/u;Landroidx/compose/ui/Modifier;Ll0/k1;Lgz0/m0;Ly81/e;Landroidx/compose/runtime/Composer;II)V",
        "",
        "isExpanded",
        "isHealthFutureIA",
        "Lkotlin/Function0;",
        "onClick",
        "e",
        "(Ll0/u;Landroidx/compose/ui/Modifier;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Ly3/f;",
        "a",
        "F",
        "getIconVerticalPadding",
        "()F",
        "iconVerticalPadding",
        "b",
        "getIconEndPadding",
        "iconEndPadding",
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


# static fields
.field private static final a:F

.field private static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-wide/high16 v0, 0x4004000000000000L    # 2.5

    double-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lh01/x;->a:F

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    double-to-float v0, v2

    mul-float/2addr v0, v1

    sput v0, Lh01/x;->b:F

    return-void
.end method

.method public static synthetic a(Ll0/u;Landroidx/compose/ui/Modifier;Ll0/k1;Lgz0/m0;Ly81/e;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lh01/x;->j(Ll0/u;Landroidx/compose/ui/Modifier;Ll0/k1;Lgz0/m0;Ly81/e;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lh01/x;->g(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lh01/x;->f()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Ll0/u;Landroidx/compose/ui/Modifier;ZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lh01/x;->h(Ll0/u;Landroidx/compose/ui/Modifier;ZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ll0/u;Landroidx/compose/ui/Modifier;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll0/u;",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v3, p2

    move/from16 v6, p6

    const-string v0, "<this>"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, -0x24b8ffb2

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v2, p7, 0x1

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit16 v5, v6, 0x180

    if-nez v5, :cond_6

    invoke-virtual {v12, v3}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x100

    goto :goto_4

    :cond_5
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v0, v5

    :cond_6
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_8

    or-int/lit16 v0, v0, 0xc00

    :cond_7
    move/from16 v7, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v7, v6, 0xc00

    if-nez v7, :cond_7

    move/from16 v7, p3

    invoke-virtual {v12, v7}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x800

    goto :goto_5

    :cond_9
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v0, v8

    :goto_6
    and-int/lit8 v8, p7, 0x8

    const/16 v9, 0x4000

    if-eqz v8, :cond_b

    or-int/lit16 v0, v0, 0x6000

    :cond_a
    move-object/from16 v10, p4

    goto :goto_8

    :cond_b
    and-int/lit16 v10, v6, 0x6000

    if-nez v10, :cond_a

    move-object/from16 v10, p4

    invoke-virtual {v12, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    move v11, v9

    goto :goto_7

    :cond_c
    const/16 v11, 0x2000

    :goto_7
    or-int/2addr v0, v11

    :goto_8
    and-int/lit16 v11, v0, 0x2493

    const/16 v13, 0x2492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v11, v13, :cond_d

    move v11, v15

    goto :goto_9

    :cond_d
    move v11, v14

    :goto_9
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v12, v13, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_17

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_e

    move-object/from16 v16, v11

    goto :goto_a

    :cond_e
    move-object/from16 v16, v4

    :goto_a
    if-eqz v5, :cond_f

    move v2, v14

    goto :goto_b

    :cond_f
    move v2, v7

    :goto_b
    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v8, :cond_11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_10

    new-instance v5, Lh00/d0;

    const/4 v7, 0x2

    invoke-direct {v5, v7}, Lh00/d0;-><init>(I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v5, Lc93/a;

    goto :goto_c

    :cond_11
    move-object v5, v10

    :goto_c
    if-eqz v2, :cond_12

    sget-object v7, Lny0/q$c;->f:Lny0/q$c;

    :goto_d
    move-object/from16 v18, v7

    goto :goto_e

    :cond_12
    sget-object v7, Lny0/q$b;->f:Lny0/q$b;

    goto :goto_d

    :goto_e
    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v7

    if-eqz v3, :cond_13

    invoke-virtual {v7}, Lgz0/i0;->B()I

    move-result v7

    :goto_f
    move/from16 v19, v7

    goto :goto_10

    :cond_13
    invoke-virtual {v7}, Lgz0/i0;->l()I

    move-result v7

    goto :goto_f

    :goto_10
    new-instance v17, Lny0/o;

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x3fc

    const/16 v29, 0x0

    invoke-direct/range {v17 .. v29}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v17

    sget v8, Lgy0/f;->s1:I

    invoke-static {v8, v12, v14}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    sget v19, Lh01/x;->b:F

    const/16 v18, 0x0

    const/16 v21, 0x3

    const/16 v17, 0x0

    move/from16 v20, v19

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v13, Lb2/e;->I:Lb2/m;

    invoke-interface {v1, v11, v13}, Ll0/u;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const v13, 0xe000

    and-int/2addr v0, v13

    if-ne v0, v9, :cond_14

    move v14, v15

    :cond_14
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v14, :cond_15

    if-ne v0, v4, :cond_16

    :cond_15
    new-instance v0, Lg40/i3;

    const/16 v4, 0xa

    invoke-direct {v0, v5, v4}, Lg40/i3;-><init>(Lc93/a;I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v0, Lc93/a;

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v9, v10

    move-object v10, v11

    move-object v11, v0

    invoke-static/range {v7 .. v14}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move v4, v2

    move-object/from16 v2, v16

    goto :goto_11

    :cond_17
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v2, v4

    move v4, v7

    move-object v5, v10

    :goto_11
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_18

    new-instance v0, Lep1/p;

    const/4 v8, 0x6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lep1/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZZLc93/a;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final f()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Ll0/u;Landroidx/compose/ui/Modifier;ZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lh01/x;->e(Ll0/u;Landroidx/compose/ui/Modifier;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(Ll0/u;Landroidx/compose/ui/Modifier;Ll0/k1;Lgz0/m0;Ly81/e;Landroidx/compose/runtime/Composer;II)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v5, p4

    move/from16 v6, p6

    const-string v0, "<this>"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "color"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, 0x545e841d

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v3, p7, 0x1

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_2

    move-object/from16 v7, p1

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v0, v8

    :goto_3
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_7

    and-int/lit8 v8, p7, 0x2

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v12, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x100

    goto :goto_4

    :cond_5
    move-object/from16 v8, p2

    :cond_6
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    goto :goto_5

    :cond_7
    move-object/from16 v8, p2

    :goto_5
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_9

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    invoke-virtual {v12, v9}, Lp1/q;->e(I)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x800

    goto :goto_6

    :cond_8
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v0, v9

    :cond_9
    and-int/lit16 v9, v6, 0x6000

    if-nez v9, :cond_c

    const v9, 0x8000

    and-int/2addr v9, v6

    if-nez v9, :cond_a

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_7

    :cond_a
    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_7
    if-eqz v9, :cond_b

    const/16 v9, 0x4000

    goto :goto_8

    :cond_b
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v0, v9

    :cond_c
    and-int/lit16 v9, v0, 0x2493

    const/16 v10, 0x2492

    const/4 v11, 0x1

    if-eq v9, v10, :cond_d

    move v9, v11

    goto :goto_9

    :cond_d
    const/4 v9, 0x0

    :goto_9
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v12, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_12

    invoke-virtual {v12}, Lp1/q;->Z()V

    and-int/lit8 v9, v6, 0x1

    sget-object v10, Lb2/t;->w:Lb2/t;

    if-eqz v9, :cond_10

    invoke-virtual {v12}, Lp1/q;->C()Z

    move-result v9

    if-eqz v9, :cond_e

    goto :goto_a

    :cond_e
    invoke-virtual {v12}, Lp1/q;->X()V

    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_f

    and-int/lit16 v0, v0, -0x381

    :cond_f
    move-object v3, v7

    move v7, v0

    move-object v0, v3

    move-object v3, v8

    goto :goto_b

    :cond_10
    :goto_a
    if-eqz v3, :cond_11

    move-object v7, v10

    :cond_11
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_f

    sget v3, Lh01/x;->a:F

    sget v8, Lh01/x;->b:F

    const/4 v9, 0x0

    invoke-static {v9, v3, v8, v3, v11}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v3

    and-int/lit16 v0, v0, -0x381

    move-object v15, v7

    move v7, v0

    move-object v0, v15

    :goto_b
    invoke-virtual {v12}, Lp1/q;->r()V

    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result v8

    const/4 v9, 0x6

    invoke-static {v8, v12, v9}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v8

    shr-int/lit8 v7, v7, 0xc

    and-int/lit8 v7, v7, 0xe

    invoke-interface {v5, v12, v7}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v13

    invoke-static {v3, v10}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v2, v2

    mul-float/2addr v2, v2

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, Lb2/e;->y:Lb2/m;

    invoke-interface {v1, v2, v7}, Ll0/u;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-interface {v2, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move-wide v10, v13

    const/16 v13, 0x30

    const/4 v14, 0x0

    move-object v7, v8

    const/4 v8, 0x0

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v2, v0

    goto :goto_c

    :cond_12
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v2, v7

    move-object v3, v8

    :goto_c
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_13

    new-instance v0, La01/f;

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, La01/f;-><init>(Ll0/u;Landroidx/compose/ui/Modifier;Ll0/k1;Lgz0/m0;Ly81/e;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final j(Ll0/u;Landroidx/compose/ui/Modifier;Ll0/k1;Lgz0/m0;Ly81/e;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lh01/x;->i(Ll0/u;Landroidx/compose/ui/Modifier;Ll0/k1;Lgz0/m0;Ly81/e;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
