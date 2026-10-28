.class public abstract Lcom/whoop/design/atomic/organism/toolbar/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a]\u0010\n\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0010\u0008\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\"\u001a\u0010\u0011\u001a\u00020\u000c8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/design/atomic/organism/toolbar/d;",
        "state",
        "titleColumnModifier",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onLeftButtonClick",
        "onRightButtonClick",
        "onTagClick",
        "d",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Ly3/f;",
        "a",
        "F",
        "h",
        "()F",
        "TOOLBAR_ICON_TOUCH_AREA",
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


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xc

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lcom/whoop/design/atomic/organism/toolbar/b;->a:F

    return-void
.end method

.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lcom/whoop/design/atomic/organism/toolbar/b;->f()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lcom/whoop/design/atomic/organism/toolbar/b;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lcom/whoop/design/atomic/organism/toolbar/b;->g(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/whoop/design/atomic/organism/toolbar/d;",
            "Landroidx/compose/ui/Modifier;",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move/from16 v1, p7

    const-string v0, "state"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p6

    check-cast v11, Lp1/q;

    const v0, -0x400976fe

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v2, v1, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v1, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v1

    :goto_1
    and-int/lit8 v4, v1, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v11, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, p8, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v6, v1, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v11, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_3

    :cond_7
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v3, v7

    :goto_4
    and-int/lit8 v7, p8, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v3, v3, 0xc00

    :cond_8
    move-object/from16 v8, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v8, v1, 0xc00

    if-nez v8, :cond_8

    move-object/from16 v8, p3

    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_5

    :cond_a
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v3, v9

    :goto_6
    and-int/lit8 v9, p8, 0x10

    if-eqz v9, :cond_c

    or-int/lit16 v3, v3, 0x6000

    :cond_b
    move-object/from16 v10, p4

    goto :goto_8

    :cond_c
    and-int/lit16 v10, v1, 0x6000

    if-nez v10, :cond_b

    move-object/from16 v10, p4

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_d

    const/16 v12, 0x4000

    goto :goto_7

    :cond_d
    const/16 v12, 0x2000

    :goto_7
    or-int/2addr v3, v12

    :goto_8
    and-int/lit8 v12, p8, 0x20

    const/high16 v13, 0x30000

    if-eqz v12, :cond_f

    or-int/2addr v3, v13

    :cond_e
    move-object/from16 v13, p5

    goto :goto_a

    :cond_f
    and-int/2addr v13, v1

    if-nez v13, :cond_e

    move-object/from16 v13, p5

    invoke-virtual {v11, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_10

    const/high16 v14, 0x20000

    goto :goto_9

    :cond_10
    const/high16 v14, 0x10000

    :goto_9
    or-int/2addr v3, v14

    :goto_a
    const v14, 0x12493

    and-int/2addr v14, v3

    const v15, 0x12492

    move/from16 p6, v0

    const/4 v0, 0x0

    if-eq v14, v15, :cond_11

    const/4 v14, 0x1

    goto :goto_b

    :cond_11
    move v14, v0

    :goto_b
    and-int/lit8 v15, v3, 0x1

    invoke-virtual {v11, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_1b

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz p6, :cond_12

    move-object v6, v14

    goto :goto_c

    :cond_12
    move-object v6, v2

    :goto_c
    if-eqz v4, :cond_13

    move-object v8, v14

    goto :goto_d

    :cond_13
    move-object/from16 v8, p2

    :goto_d
    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_15

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_14

    new-instance v4, Lnx1/a;

    const/16 v7, 0xb

    invoke-direct {v4, v7}, Lnx1/a;-><init>(I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v4, Lc93/a;

    move/from16 v16, v9

    move-object v9, v4

    move/from16 v4, v16

    goto :goto_e

    :cond_15
    move v4, v9

    move-object/from16 v9, p3

    :goto_e
    if-eqz v4, :cond_17

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_16

    new-instance v4, Lnx1/a;

    const/16 v2, 0xc

    invoke-direct {v4, v2}, Lnx1/a;-><init>(I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    move-object v2, v4

    check-cast v2, Lc93/a;

    move-object v10, v2

    :cond_17
    if-eqz v12, :cond_18

    const/4 v2, 0x0

    move-object v13, v2

    :cond_18
    instance-of v2, v5, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    if-eqz v2, :cond_19

    const v2, -0x63878996

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    move-object v7, v5

    check-cast v7, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    const v2, 0x7fffe

    and-int/2addr v2, v3

    const/4 v14, 0x0

    move-object v12, v11

    move-object v11, v13

    move v13, v2

    invoke-static/range {v6 .. v14}, Lcom/whoop/design/atomic/organism/toolbar/a;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d$a;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v8

    move-object v2, v11

    move-object v11, v12

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_19
    move-object v7, v8

    move-object v2, v13

    instance-of v4, v5, Lcom/whoop/design/atomic/organism/toolbar/d$c;

    if-eqz v4, :cond_1a

    const v4, -0x638777a6

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    move-object v8, v5

    check-cast v8, Lcom/whoop/design/atomic/organism/toolbar/d$c;

    and-int/lit8 v4, v3, 0xe

    shr-int/lit8 v12, v3, 0x3

    and-int/lit8 v12, v12, 0x70

    or-int/2addr v4, v12

    shl-int/lit8 v12, v3, 0x3

    and-int/lit16 v12, v12, 0x380

    or-int/2addr v4, v12

    and-int/lit16 v12, v3, 0x1c00

    or-int/2addr v4, v12

    const v12, 0xe000

    and-int/2addr v3, v12

    or-int v12, v4, v3

    const/4 v13, 0x0

    invoke-static/range {v6 .. v13}, Lcom/whoop/design/atomic/organism/toolbar/c;->d(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d$c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_f
    move-object v4, v6

    move-object v6, v7

    move-object v7, v9

    move-object v9, v2

    :goto_10
    move-object v8, v10

    goto :goto_11

    :cond_1a
    const v1, -0x63878eff

    invoke-static {v1, v11, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_1b
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move-object v4, v2

    move-object v9, v13

    goto :goto_10

    :goto_11
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_1c

    new-instance v0, Laz1/f;

    const/16 v3, 0x1d

    move/from16 v2, p8

    invoke-direct/range {v0 .. v9}, Laz1/f;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ll83/e;Ll83/e;)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final e()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h()F
    .locals 1

    sget v0, Lcom/whoop/design/atomic/organism/toolbar/b;->a:F

    return v0
.end method
