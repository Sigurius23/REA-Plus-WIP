.class public abstract Lzk2/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001ac\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00002\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0012\"\u0014\u0010\u0016\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0012\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "durationLeading",
        "durationTrailing",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "durationTargetText",
        "Ltk2/n;",
        "durationProgressBar",
        "",
        "isPaused",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onCloseClick",
        "c",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ltk2/n;ZLc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Ly3/f;",
        "a",
        "F",
        "ToolbarIconTouchArea",
        "b",
        "ToolbarPauseIconSize",
        "ToolbarTitleToDurationSpacing",
        "track-activity_release"
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

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xc

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lzk2/z;->a:F

    mul-float/2addr v1, v1

    sput v1, Lzk2/z;->b:F

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    double-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lzk2/z;->c:F

    return-void
.end method

.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lzk2/z;->d()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ltk2/n;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lzk2/z;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ltk2/n;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ltk2/n;ZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 51
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/whoop/design/util/TextResource;",
            "Ltk2/n;",
            "Z",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v0, p4

    move/from16 v9, p9

    move/from16 v10, p10

    const-string v4, "title"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "durationLeading"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "durationTrailing"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p8

    check-cast v4, Lp1/q;

    const v5, -0x5e289c30

    invoke-virtual {v4, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v9, 0x6

    if-nez v5, :cond_2

    and-int/lit8 v5, v9, 0x8

    if-nez v5, :cond_0

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_0

    :cond_0
    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_0
    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_1

    :cond_1
    const/4 v5, 0x2

    :goto_1
    or-int/2addr v5, v9

    goto :goto_2

    :cond_2
    move v5, v9

    :goto_2
    and-int/lit8 v8, v9, 0x30

    if-nez v8, :cond_5

    and-int/lit8 v8, v9, 0x40

    if-nez v8, :cond_3

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_3

    :cond_3
    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_3
    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_4

    :cond_4
    const/16 v8, 0x10

    :goto_4
    or-int/2addr v5, v8

    :cond_5
    and-int/lit16 v8, v9, 0x180

    if-nez v8, :cond_8

    and-int/lit16 v8, v9, 0x200

    if-nez v8, :cond_6

    invoke-virtual {v4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_5

    :cond_6
    invoke-virtual {v4, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_5
    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_6

    :cond_7
    const/16 v8, 0x80

    :goto_6
    or-int/2addr v5, v8

    :cond_8
    and-int/lit8 v8, v10, 0x8

    if-eqz v8, :cond_a

    or-int/lit16 v5, v5, 0xc00

    :cond_9
    move-object/from16 v11, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v11, v9, 0xc00

    if-nez v11, :cond_9

    move-object/from16 v11, p3

    invoke-virtual {v4, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_7

    :cond_b
    const/16 v12, 0x400

    :goto_7
    or-int/2addr v5, v12

    :goto_8
    and-int/lit8 v12, v10, 0x10

    if-eqz v12, :cond_c

    or-int/lit16 v5, v5, 0x6000

    goto :goto_b

    :cond_c
    and-int/lit16 v13, v9, 0x6000

    if-nez v13, :cond_f

    const v13, 0x8000

    and-int/2addr v13, v9

    if-nez v13, :cond_d

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    goto :goto_9

    :cond_d
    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    :goto_9
    if-eqz v13, :cond_e

    const/16 v13, 0x4000

    goto :goto_a

    :cond_e
    const/16 v13, 0x2000

    :goto_a
    or-int/2addr v5, v13

    :cond_f
    :goto_b
    and-int/lit8 v13, v10, 0x20

    const/high16 v14, 0x30000

    if-eqz v13, :cond_11

    or-int/2addr v5, v14

    :cond_10
    move-object/from16 v14, p5

    goto :goto_d

    :cond_11
    and-int/2addr v14, v9

    if-nez v14, :cond_10

    move-object/from16 v14, p5

    invoke-virtual {v4, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_12

    const/high16 v15, 0x20000

    goto :goto_c

    :cond_12
    const/high16 v15, 0x10000

    :goto_c
    or-int/2addr v5, v15

    :goto_d
    and-int/lit8 v15, v10, 0x40

    const/high16 v16, 0x180000

    if-eqz v15, :cond_13

    or-int v5, v5, v16

    move/from16 v7, p6

    goto :goto_f

    :cond_13
    and-int v16, v9, v16

    move/from16 v7, p6

    if-nez v16, :cond_15

    invoke-virtual {v4, v7}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_14

    const/high16 v16, 0x100000

    goto :goto_e

    :cond_14
    const/high16 v16, 0x80000

    :goto_e
    or-int v5, v5, v16

    :cond_15
    :goto_f
    and-int/lit16 v6, v10, 0x80

    const/high16 v17, 0xc00000

    if-eqz v6, :cond_16

    or-int v5, v5, v17

    move-object/from16 v0, p7

    goto :goto_11

    :cond_16
    and-int v17, v9, v17

    move-object/from16 v0, p7

    if-nez v17, :cond_18

    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_17

    const/high16 v17, 0x800000

    goto :goto_10

    :cond_17
    const/high16 v17, 0x400000

    :goto_10
    or-int v5, v5, v17

    :cond_18
    :goto_11
    const v17, 0x492493

    and-int v0, v5, v17

    move/from16 v37, v5

    const v5, 0x492492

    if-eq v0, v5, :cond_19

    const/4 v0, 0x1

    goto :goto_12

    :cond_19
    const/4 v0, 0x0

    :goto_12
    and-int/lit8 v5, v37, 0x1

    invoke-virtual {v4, v5, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_31

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz v8, :cond_1a

    move-object v5, v0

    goto :goto_13

    :cond_1a
    move-object v5, v11

    :goto_13
    const/4 v8, 0x0

    if-eqz v12, :cond_1b

    move-object v11, v8

    goto :goto_14

    :cond_1b
    move-object/from16 v11, p4

    :goto_14
    if-eqz v13, :cond_1c

    goto :goto_15

    :cond_1c
    move-object/from16 v8, p5

    :goto_15
    if-eqz v15, :cond_1d

    const/4 v7, 0x0

    :cond_1d
    if-eqz v6, :cond_1f

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v6, v12, :cond_1e

    new-instance v6, Lzk2/r;

    const/4 v12, 0x1

    invoke-direct {v6, v12}, Lzk2/r;-><init>(I)V

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v6, Lc93/a;

    move-object v15, v6

    goto :goto_16

    :cond_1f
    move-object/from16 v15, p7

    :goto_16
    sget-object v6, Ly81/f;->BRAND_WHITE:Ly81/f;

    const/4 v12, 0x6

    move-object/from16 p3, v15

    invoke-virtual {v6, v4, v12}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v14

    new-instance v12, Ly71/g;

    move-wide/from16 p5, v14

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-static {v14}, Lyb0/f;->a(Lx81/d;)I

    move-result v15

    sget v18, Lgy0/f;->K:I

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v13

    invoke-direct {v12, v15, v13}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    move-object/from16 v31, v14

    const-wide/high16 v13, 0x3ff8000000000000L    # 1.5

    double-to-float v13, v13

    const/4 v14, 0x4

    int-to-float v14, v14

    mul-float/2addr v14, v13

    move-object/from16 v38, v5

    const/4 v5, 0x0

    move-object/from16 v21, v6

    const/4 v6, 0x2

    invoke-static {v15, v14, v5, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v22

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v24, v13, v6

    const/16 v26, 0x0

    const/16 v27, 0xd

    const/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, Ll0/m;->g:Ll0/h;

    sget-object v15, Lb2/e;->K:Lb2/l;

    const/16 v5, 0x36

    invoke-static {v14, v15, v4, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v14

    move/from16 v39, v6

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v40, v7

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-eqz v9, :cond_20

    invoke-virtual {v4, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_17

    :cond_20
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_17
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v4, v9, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v4, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-nez v10, :cond_21

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v16, v11

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_22

    goto :goto_18

    :cond_21
    move-object/from16 v16, v11

    :goto_18
    invoke-static {v5, v4, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_22
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v4, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v10, Lzk2/z;->a:F

    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const-string v13, "toolbar_left_icon_tag"

    invoke-static {v11, v13}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    new-instance v11, Lny0/o;

    sget-object v19, Lny0/q$a;->f:Lny0/q$a;

    invoke-virtual {v12}, Ly71/g;->b()I

    move-result v20

    const/16 v29, 0x3f8

    const/16 v30, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v18, v11

    invoke-direct/range {v18 .. v30}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v12}, Ly71/g;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    move-object/from16 v18, v14

    sget v14, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v12, v4, v14}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    sget v19, Lny0/o;->k:I

    shr-int/lit8 v20, v37, 0x9

    const v21, 0xe000

    and-int v20, v20, v21

    or-int v19, v19, v20

    move-object/from16 v20, v18

    const/16 v18, 0x8

    move/from16 v21, v14

    const/4 v14, 0x0

    move-wide/from16 v42, p5

    move/from16 p4, v10

    move-object/from16 v45, v15

    move-object/from16 v41, v16

    move/from16 v17, v19

    move-object/from16 v46, v20

    move/from16 v47, v21

    move-object/from16 v44, v31

    const/4 v10, 0x6

    move-object/from16 v15, p3

    move-object/from16 v16, v4

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static/range {v11 .. v18}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v48, v15

    move-object/from16 v11, v16

    float-to-double v12, v4

    const-wide/16 v14, 0x0

    cmpl-double v12, v12, v14

    if-lez v12, :cond_23

    const/4 v14, 0x1

    goto :goto_19

    :cond_23
    const/4 v14, 0x0

    :goto_19
    if-nez v14, :cond_24

    const-string v12, "invalid weight; must be greater than zero"

    invoke-static {v12}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_24
    new-instance v12, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v13, 0x1

    invoke-direct {v12, v4, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    int-to-float v14, v13

    mul-float v14, v14, v39

    const/4 v13, 0x0

    const/4 v15, 0x2

    invoke-static {v12, v14, v13, v15}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, Lb2/e;->N:Lb2/k;

    sget-object v14, Ll0/m;->e:Ll0/h;

    const/16 v15, 0x36

    invoke-static {v14, v13, v11, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    move-object/from16 p6, v13

    move-object/from16 p8, v14

    iget-wide v13, v11, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v11, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_25

    invoke-virtual {v11, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1a

    :cond_25
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1a
    invoke-static {v11, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v46

    invoke-static {v11, v4, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-nez v14, :cond_26

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_27

    :cond_26
    invoke-static {v13, v11, v13, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_27
    invoke-static {v11, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v12, v37, 0xe

    move/from16 v21, v47

    or-int v12, v21, v12

    invoke-static {v1, v11, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    sget-object v13, Ly81/f;->WHITE_70:Ly81/f;

    move-object v15, v13

    invoke-virtual {v15, v11, v10}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v13

    sget v10, Lx81/d;->b:I

    move-object/from16 v16, v12

    move-object/from16 v12, v44

    invoke-virtual {v12, v11, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lb91/d;->a()Lb91/a;

    move-result-object v31

    new-instance v1, Lw3/k;

    const/4 v12, 0x3

    invoke-direct {v1, v12}, Lw3/k;-><init>(I)V

    sget v47, Lb91/a;->d:I

    shl-int/lit8 v35, v47, 0x12

    const v36, 0x2fdfa

    move/from16 v17, v12

    const/4 v12, 0x0

    move-object/from16 v33, v11

    move-object/from16 v18, v15

    move-object/from16 v11, v16

    const-wide/16 v15, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move-object/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v22, v19

    const/16 v19, 0x0

    move-object/from16 v24, v20

    move/from16 v23, v21

    const-wide/16 v20, 0x0

    move/from16 v25, v22

    const/16 v22, 0x0

    move-object/from16 v26, v24

    move/from16 v27, v25

    const-wide/16 v24, 0x0

    move-object/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v29, v27

    const/16 v27, 0x0

    move-object/from16 v30, v28

    const/16 v28, 0x0

    move/from16 v32, v29

    const/16 v29, 0x0

    move-object/from16 v34, v30

    const/16 v30, 0x0

    move/from16 v49, v32

    const/16 v32, 0x0

    move-object/from16 v50, v34

    const/16 v34, 0x0

    move-object/from16 v3, p8

    move-object/from16 p8, v8

    move-object/from16 v8, p6

    move/from16 p6, v23

    move-object/from16 v23, v1

    move-object/from16 v1, v50

    invoke-static/range {v11 .. v36}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v33

    sget v12, Lzk2/z;->c:F

    invoke-static {v12, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-static {v11, v12}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v12, v45

    const/16 v15, 0x36

    invoke-static {v3, v12, v11, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v11, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_28

    invoke-virtual {v11, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1b

    :cond_28
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1b
    invoke-static {v11, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-nez v3, :cond_29

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v3, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2a

    :cond_29
    invoke-static {v12, v11, v12, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2a
    invoke-static {v11, v5, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v40, :cond_2b

    const v3, -0x4bad285b

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    sget v3, Lkk2/c;->c:I

    const/4 v12, 0x6

    invoke-static {v3, v11, v12}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    sget v13, Lkk2/d;->b0:I

    invoke-static {v13}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v13

    sget v14, Lcom/whoop/design/util/TextResource$b;->c:I

    invoke-static {v13, v11, v14}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1, v11, v12}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v14

    sget v12, Lzk2/z;->b:F

    invoke-static {v12, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    move-object/from16 v16, v3

    const-string v3, "track_session_toolbar_pause_icon"

    invoke-static {v12, v3}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v12, v16

    move-object/from16 v16, v11

    move-object v11, v12

    move-object v12, v13

    move-object v13, v3

    invoke-static/range {v11 .. v18}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v16

    const-wide/high16 v12, 0x3fe8000000000000L    # 0.75

    double-to-float v3, v12

    move/from16 v12, v39

    const/4 v13, 0x0

    invoke-static {v3, v12, v0, v11, v13}, Lih0/d0;->v(FFLb2/t;Lp1/q;Z)V

    goto :goto_1c

    :cond_2b
    move/from16 v12, v39

    const/4 v13, 0x0

    const v3, -0x4ba405ac

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    :goto_1c
    sget-object v3, Ll0/a1;->x:Ll0/a1;

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v13, Ll0/m;->c:Ll0/g;

    const/16 v14, 0x30

    invoke-static {v13, v8, v11, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v14, v11, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v11, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-eqz v13, :cond_2c

    invoke-virtual {v11, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1d

    :cond_2c
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1d
    invoke-static {v11, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v4, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v11, Lp1/q;->S:Z

    if-nez v4, :cond_2d

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2e

    :cond_2d
    invoke-static {v14, v11, v14, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2e
    invoke-static {v11, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v3, "track_session_toolbar_duration"

    invoke-static {v0, v3}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const v4, 0x5d4482a6

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v4

    shr-int/lit8 v5, v37, 0x3

    and-int/lit8 v5, v5, 0xe

    or-int v5, p6, v5

    invoke-static {v2, v11, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v6, v44

    invoke-virtual {v6, v11, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->x()Lb91/a;

    move-result-object v7

    invoke-virtual {v7}, Lb91/a;->d()Ll3/v0;

    move-result-object v7

    move-wide/from16 v13, v42

    const/4 v8, 0x0

    invoke-static {v7, v13, v14, v11, v8}, Lb91/e;->f(Ll3/v0;JLandroidx/compose/runtime/Composer;I)Ll3/m0;

    move-result-object v7

    new-instance v9, Ll83/k;

    invoke-direct {v9, v5, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v9}, Ln83/c;->add(Ljava/lang/Object;)Z

    const/16 v46, 0x6

    shr-int/lit8 v5, v37, 0x6

    and-int/lit8 v5, v5, 0xe

    or-int v5, p6, v5

    move-object/from16 v9, p2

    invoke-static {v9, v11, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v11, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->A()Lb91/a;

    move-result-object v7

    invoke-virtual {v7}, Lb91/a;->d()Ll3/v0;

    move-result-object v7

    invoke-static {v7, v13, v14, v11, v8}, Lb91/e;->f(Ll3/v0;JLandroidx/compose/runtime/Composer;I)Ll3/m0;

    move-result-object v7

    new-instance v15, Ll83/k;

    invoke-direct {v15, v5, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v15}, Ln83/c;->add(Ljava/lang/Object;)Z

    move-object/from16 v5, v41

    if-nez v5, :cond_2f

    const v1, -0x6b2df104

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    goto :goto_1e

    :cond_2f
    const v7, -0x6b2df103

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    move/from16 v7, p6

    invoke-static {v5, v11, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v11, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->E()Lb91/a;

    move-result-object v15

    invoke-virtual {v15}, Lb91/a;->d()Ll3/v0;

    move-result-object v15

    const/4 v2, 0x6

    invoke-virtual {v1, v11, v2}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v1

    invoke-static {v15, v1, v2, v11, v8}, Lb91/e;->f(Ll3/v0;JLandroidx/compose/runtime/Composer;I)Ll3/m0;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v7, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, Ln83/c;->add(Ljava/lang/Object;)Z

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    :goto_1e
    invoke-static {v4}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v1

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v11, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->x()Lb91/a;

    move-result-object v32

    new-instance v2, Lw3/k;

    const/4 v4, 0x3

    invoke-direct {v2, v4}, Lw3/k;-><init>(I)V

    shl-int/lit8 v4, v47, 0x15

    or-int/lit16 v4, v4, 0xc00

    const v36, 0x1ddf8

    const/16 v6, 0x30

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x1

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v34, 0x0

    move-object/from16 v23, v2

    move/from16 v35, v4

    move-object/from16 v33, v11

    move/from16 v39, v12

    move-object v11, v1

    move-object v12, v3

    invoke-static/range {v11 .. v36}, Lqz0/n;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Lb91/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v33

    if-nez p8, :cond_30

    const v2, 0x4b59caf9    # 1.4273273E7f

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    const/4 v13, 0x0

    invoke-virtual {v1, v13}, Lp1/q;->q(Z)V

    move-object/from16 v8, p8

    :goto_1f
    const/4 v13, 0x1

    goto :goto_20

    :cond_30
    const v2, 0x4b59cafa    # 1.4273274E7f

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    double-to-float v2, v2

    mul-float v12, v2, v39

    const/4 v14, 0x0

    const/16 v15, 0xd

    const/4 v11, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v8, p8

    const/4 v13, 0x0

    invoke-static {v8, v2, v1, v6, v13}, Lzk2/i;->e(Ltk2/n;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1, v13}, Lp1/q;->q(Z)V

    goto :goto_1f

    :goto_20
    invoke-static {v1, v13, v13, v13}, Lm4/a;->y(Lp1/q;ZZZ)V

    move/from16 v2, p4

    invoke-static {v0, v2, v1, v13}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    move-object v6, v8

    move-object/from16 v4, v38

    move/from16 v7, v40

    move-object/from16 v8, v48

    goto :goto_21

    :cond_31
    move-object v9, v3

    move-object v1, v4

    invoke-virtual {v1}, Lp1/q;->X()V

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object v4, v11

    :goto_21
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_32

    new-instance v0, Lb30/w1;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v10, p10

    move-object v3, v9

    move/from16 v9, p9

    invoke-direct/range {v0 .. v10}, Lb30/w1;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ltk2/n;ZLc93/a;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_32
    return-void
.end method

.method private static final d()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ltk2/n;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Lzk2/z;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ltk2/n;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
