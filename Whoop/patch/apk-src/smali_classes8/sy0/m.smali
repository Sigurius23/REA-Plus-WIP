.class public abstract Lsy0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a\u00a3\u0001\u0010\u0018\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00062\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015H\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "markdownText",
        "Lb91/a;",
        "style",
        "",
        "initialToggle",
        "isEnabled",
        "Ly3/f;",
        "spacerSize",
        "Li2/x;",
        "textColor",
        "linkColor",
        "Ll0/k1;",
        "paddingValues",
        "localMinimumInteractiveComponentEnforcement",
        "Lb2/f;",
        "horizontalAlignment",
        "trimStartGutter",
        "checkedColor",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onToggle",
        "d",
        "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lb91/a;ZZFJJLl0/k1;ZLb2/f;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V",
        "a",
        "F",
        "CHECKBOX_MIN_TOUCH_TARGET",
        "b",
        "CHECKBOX_COMPONENT_SIZE",
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
    .locals 2

    const/16 v0, 0xc

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lsy0/m;->a:F

    const/4 v0, 0x6

    int-to-float v0, v0

    mul-float/2addr v0, v1

    sput v0, Lsy0/m;->b:F

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lb91/a;ZZFJJLl0/k1;ZLb2/f;ZJLkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p21}, Lsy0/m;->g(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lb91/a;ZZFJJLl0/k1;ZLb2/f;ZJLkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ZLkotlin/jvm/functions/Function1;ZJLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lsy0/m;->f(ZLkotlin/jvm/functions/Function1;ZJLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsy0/m;->e(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lb91/a;ZZFJJLl0/k1;ZLb2/f;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/lang/String;",
            "Lb91/a;",
            "ZZFJJ",
            "Ll0/k1;",
            "Z",
            "Lb2/f;",
            "ZJ",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v0, p16

    move/from16 v1, p18

    move/from16 v4, p19

    move/from16 v5, p20

    const-string v6, "markdownText"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "style"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "onToggle"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p17

    check-cast v6, Lp1/q;

    const v7, 0x72d7db70

    invoke-virtual {v6, v7}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v7, v5, 0x1

    if-eqz v7, :cond_0

    or-int/lit8 v10, v1, 0x6

    move v11, v10

    move-object/from16 v10, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v10, v1, 0x6

    if-nez v10, :cond_2

    move-object/from16 v10, p0

    invoke-virtual {v6, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    const/4 v11, 0x4

    goto :goto_0

    :cond_1
    const/4 v11, 0x2

    :goto_0
    or-int/2addr v11, v1

    goto :goto_1

    :cond_2
    move-object/from16 v10, p0

    move v11, v1

    :goto_1
    and-int/lit8 v12, v1, 0x30

    if-nez v12, :cond_4

    invoke-virtual {v6, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    const/16 v12, 0x20

    goto :goto_2

    :cond_3
    const/16 v12, 0x10

    :goto_2
    or-int/2addr v11, v12

    :cond_4
    and-int/lit16 v12, v1, 0x180

    const/16 v16, 0x80

    if-nez v12, :cond_7

    and-int/lit16 v12, v1, 0x200

    if-nez v12, :cond_5

    invoke-virtual {v6, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    goto :goto_3

    :cond_5
    invoke-virtual {v6, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    :goto_3
    if-eqz v12, :cond_6

    const/16 v12, 0x100

    goto :goto_4

    :cond_6
    move/from16 v12, v16

    :goto_4
    or-int/2addr v11, v12

    :cond_7
    and-int/lit8 v12, v5, 0x8

    const/16 v17, 0x400

    if-eqz v12, :cond_9

    or-int/lit16 v11, v11, 0xc00

    :cond_8
    move/from16 v14, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v14, v1, 0xc00

    if-nez v14, :cond_8

    move/from16 v14, p3

    invoke-virtual {v6, v14}, Lp1/q;->h(Z)Z

    move-result v19

    if-eqz v19, :cond_a

    const/16 v19, 0x800

    goto :goto_5

    :cond_a
    move/from16 v19, v17

    :goto_5
    or-int v11, v11, v19

    :goto_6
    and-int/lit8 v19, v5, 0x10

    if-eqz v19, :cond_c

    or-int/lit16 v11, v11, 0x6000

    :cond_b
    move/from16 v15, p4

    goto :goto_8

    :cond_c
    and-int/lit16 v15, v1, 0x6000

    if-nez v15, :cond_b

    move/from16 v15, p4

    invoke-virtual {v6, v15}, Lp1/q;->h(Z)Z

    move-result v21

    if-eqz v21, :cond_d

    const/16 v21, 0x4000

    goto :goto_7

    :cond_d
    const/16 v21, 0x2000

    :goto_7
    or-int v11, v11, v21

    :goto_8
    and-int/lit8 v21, v5, 0x20

    const/high16 v22, 0x30000

    if-eqz v21, :cond_e

    or-int v11, v11, v22

    move/from16 v13, p5

    goto :goto_a

    :cond_e
    and-int v22, v1, v22

    move/from16 v13, p5

    if-nez v22, :cond_10

    invoke-virtual {v6, v13}, Lp1/q;->d(F)Z

    move-result v23

    if-eqz v23, :cond_f

    const/high16 v23, 0x20000

    goto :goto_9

    :cond_f
    const/high16 v23, 0x10000

    :goto_9
    or-int v11, v11, v23

    :cond_10
    :goto_a
    const/high16 v23, 0x180000

    and-int v23, v1, v23

    if-nez v23, :cond_12

    and-int/lit8 v23, v5, 0x40

    move-wide/from16 v9, p6

    if-nez v23, :cond_11

    invoke-virtual {v6, v9, v10}, Lp1/q;->f(J)Z

    move-result v24

    if-eqz v24, :cond_11

    const/high16 v24, 0x100000

    goto :goto_b

    :cond_11
    const/high16 v24, 0x80000

    :goto_b
    or-int v11, v11, v24

    goto :goto_c

    :cond_12
    move-wide/from16 v9, p6

    :goto_c
    const/high16 v24, 0xc00000

    and-int v24, v1, v24

    if-nez v24, :cond_14

    and-int/lit16 v8, v5, 0x80

    move-wide/from16 v1, p8

    if-nez v8, :cond_13

    invoke-virtual {v6, v1, v2}, Lp1/q;->f(J)Z

    move-result v8

    if-eqz v8, :cond_13

    const/high16 v8, 0x800000

    goto :goto_d

    :cond_13
    const/high16 v8, 0x400000

    :goto_d
    or-int/2addr v11, v8

    goto :goto_e

    :cond_14
    move-wide/from16 v1, p8

    :goto_e
    and-int/lit16 v8, v5, 0x100

    const/high16 v25, 0x6000000

    if-eqz v8, :cond_15

    or-int v11, v11, v25

    move-object/from16 v1, p10

    goto :goto_10

    :cond_15
    and-int v25, p18, v25

    move-object/from16 v1, p10

    if-nez v25, :cond_17

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_16

    const/high16 v2, 0x4000000

    goto :goto_f

    :cond_16
    const/high16 v2, 0x2000000

    :goto_f
    or-int/2addr v11, v2

    :cond_17
    :goto_10
    and-int/lit16 v2, v5, 0x200

    const/high16 v25, 0x30000000

    if-eqz v2, :cond_18

    or-int v11, v11, v25

    move/from16 v1, p11

    goto :goto_12

    :cond_18
    and-int v25, p18, v25

    move/from16 v1, p11

    if-nez v25, :cond_1a

    invoke-virtual {v6, v1}, Lp1/q;->h(Z)Z

    move-result v25

    if-eqz v25, :cond_19

    const/high16 v25, 0x20000000

    goto :goto_11

    :cond_19
    const/high16 v25, 0x10000000

    :goto_11
    or-int v11, v11, v25

    :cond_1a
    :goto_12
    and-int/lit16 v1, v5, 0x400

    if-eqz v1, :cond_1b

    or-int/lit8 v25, v4, 0x6

    move/from16 v26, v25

    move/from16 v25, v1

    move-object/from16 v1, p12

    goto :goto_14

    :cond_1b
    and-int/lit8 v25, v4, 0x6

    if-nez v25, :cond_1d

    move/from16 v25, v1

    move-object/from16 v1, p12

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_1c

    const/16 v26, 0x4

    goto :goto_13

    :cond_1c
    const/16 v26, 0x2

    :goto_13
    or-int v26, v4, v26

    goto :goto_14

    :cond_1d
    move/from16 v25, v1

    move-object/from16 v1, p12

    move/from16 v26, v4

    :goto_14
    and-int/lit16 v1, v5, 0x800

    if-eqz v1, :cond_1f

    or-int/lit8 v26, v26, 0x30

    :cond_1e
    move/from16 v27, v1

    move/from16 v1, p13

    goto :goto_16

    :cond_1f
    and-int/lit8 v27, v4, 0x30

    if-nez v27, :cond_1e

    move/from16 v27, v1

    move/from16 v1, p13

    invoke-virtual {v6, v1}, Lp1/q;->h(Z)Z

    move-result v28

    if-eqz v28, :cond_20

    const/16 v18, 0x20

    goto :goto_15

    :cond_20
    const/16 v18, 0x10

    :goto_15
    or-int v26, v26, v18

    :goto_16
    and-int/lit16 v1, v4, 0x180

    if-nez v1, :cond_23

    and-int/lit16 v1, v5, 0x1000

    move/from16 v18, v2

    if-nez v1, :cond_21

    move-wide/from16 v1, p14

    invoke-virtual {v6, v1, v2}, Lp1/q;->f(J)Z

    move-result v28

    if-eqz v28, :cond_22

    const/16 v16, 0x100

    goto :goto_17

    :cond_21
    move-wide/from16 v1, p14

    :cond_22
    :goto_17
    or-int v26, v26, v16

    goto :goto_18

    :cond_23
    move/from16 v18, v2

    move-wide/from16 v1, p14

    :goto_18
    and-int/lit16 v1, v4, 0xc00

    if-nez v1, :cond_25

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_24

    const/16 v17, 0x800

    :cond_24
    or-int v26, v26, v17

    :cond_25
    move/from16 v1, v26

    const v2, 0x12492493

    and-int/2addr v2, v11

    const v3, 0x12492492

    if-ne v2, v3, :cond_27

    and-int/lit16 v2, v1, 0x493

    const/16 v3, 0x492

    if-eq v2, v3, :cond_26

    goto :goto_19

    :cond_26
    const/4 v2, 0x0

    goto :goto_1a

    :cond_27
    :goto_19
    const/4 v2, 0x1

    :goto_1a
    and-int/lit8 v3, v11, 0x1

    invoke-virtual {v6, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_44

    invoke-virtual {v6}, Lp1/q;->Z()V

    and-int/lit8 v2, p18, 0x1

    const/4 v3, 0x3

    sget-object v4, Lb2/t;->w:Lb2/t;

    const v16, -0x1c00001

    const v17, -0x380001

    const/16 v13, 0x8

    if-eqz v2, :cond_2c

    invoke-virtual {v6}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_28

    goto :goto_1b

    :cond_28
    invoke-virtual {v6}, Lp1/q;->X()V

    and-int/lit8 v2, v5, 0x40

    if-eqz v2, :cond_29

    and-int v11, v11, v17

    :cond_29
    and-int/lit16 v2, v5, 0x80

    if-eqz v2, :cond_2a

    and-int v11, v11, v16

    :cond_2a
    and-int/lit16 v2, v5, 0x1000

    if-eqz v2, :cond_2b

    and-int/lit16 v1, v1, -0x381

    :cond_2b
    move-object/from16 v2, p0

    move-object/from16 p0, p10

    move/from16 v34, p11

    move-object/from16 v35, p12

    move/from16 v36, p13

    move-wide/from16 v7, p14

    move v13, v1

    move/from16 v33, v3

    move v1, v11

    move/from16 v3, p5

    move-wide/from16 v11, p8

    goto/16 :goto_23

    :cond_2c
    :goto_1b
    if-eqz v7, :cond_2d

    move-object v2, v4

    goto :goto_1c

    :cond_2d
    move-object/from16 v2, p0

    :goto_1c
    if-eqz v12, :cond_2e

    const/4 v14, 0x0

    :cond_2e
    if-eqz v19, :cond_2f

    const/4 v15, 0x1

    :cond_2f
    if-eqz v21, :cond_30

    int-to-float v7, v3

    move/from16 v33, v3

    const/4 v12, 0x4

    int-to-float v3, v12

    mul-float/2addr v3, v7

    goto :goto_1d

    :cond_30
    move/from16 v33, v3

    move/from16 v3, p5

    :goto_1d
    and-int/lit8 v7, v5, 0x40

    const/4 v12, 0x6

    if-eqz v7, :cond_31

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-virtual {v7, v6, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v9

    and-int v11, v11, v17

    :cond_31
    and-int/lit16 v7, v5, 0x80

    if-eqz v7, :cond_32

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-virtual {v7, v6, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->k0()J

    move-result-wide v28

    and-int v7, v11, v16

    move v11, v7

    goto :goto_1e

    :cond_32
    move-wide/from16 v28, p8

    :goto_1e
    if-eqz v8, :cond_33

    const/4 v7, 0x1

    int-to-float v8, v7

    int-to-float v7, v13

    mul-float/2addr v8, v7

    new-instance v7, Ll0/l1;

    invoke-direct {v7, v8, v8, v8, v8}, Ll0/l1;-><init>(FFFF)V

    goto :goto_1f

    :cond_33
    move-object/from16 v7, p10

    :goto_1f
    if-eqz v18, :cond_34

    const/4 v8, 0x1

    goto :goto_20

    :cond_34
    move/from16 v8, p11

    :goto_20
    if-eqz v25, :cond_35

    const/16 v16, 0x0

    goto :goto_21

    :cond_35
    move-object/from16 v16, p12

    :goto_21
    if-eqz v27, :cond_36

    const/16 v17, 0x0

    goto :goto_22

    :cond_36
    move/from16 v17, p13

    :goto_22
    and-int/lit16 v13, v5, 0x1000

    if-eqz v13, :cond_37

    sget-object v13, Lx81/d;->a:Lx81/d;

    invoke-virtual {v13, v6, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v12

    and-int/lit16 v1, v1, -0x381

    move-object/from16 p0, v7

    move/from16 v34, v8

    move-wide v7, v12

    move-object/from16 v35, v16

    move/from16 v36, v17

    move v13, v1

    move v1, v11

    move-wide/from16 v11, v28

    goto :goto_23

    :cond_37
    move v13, v1

    move-object/from16 p0, v7

    move/from16 v34, v8

    move v1, v11

    move-object/from16 v35, v16

    move/from16 v36, v17

    move-wide/from16 v11, v28

    move-wide/from16 v7, p14

    :goto_23
    invoke-virtual {v6}, Lp1/q;->r()V

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move-wide/from16 p10, v7

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v5, v7, :cond_38

    invoke-static {v6}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v5

    :cond_38
    check-cast v5, Lj0/i;

    if-eqz v35, :cond_39

    const/4 v8, 0x1

    :goto_24
    move-object/from16 p4, v5

    goto :goto_25

    :cond_39
    const/4 v8, 0x0

    goto :goto_24

    :goto_25
    const/4 v5, 0x0

    if-eqz v8, :cond_3a

    invoke-interface/range {p0 .. p0}, Ll0/k1;->d()F

    move-result v8

    move-wide/from16 p12, v9

    invoke-interface/range {p0 .. p0}, Ll0/k1;->a()F

    move-result v9

    const/4 v10, 0x5

    invoke-static {v5, v8, v5, v9, v10}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v8

    goto :goto_26

    :cond_3a
    move-wide/from16 p12, v9

    move-object/from16 v8, p0

    :goto_26
    if-eqz v36, :cond_3b

    if-eqz v34, :cond_3b

    sget v9, Lsy0/m;->a:F

    sget v10, Lsy0/m;->b:F

    sub-float/2addr v9, v10

    neg-float v9, v9

    const/4 v10, 0x2

    int-to-float v5, v10

    div-float/2addr v9, v5

    :goto_27
    const/4 v5, 0x0

    goto :goto_28

    :cond_3b
    const/4 v10, 0x2

    const/4 v5, 0x0

    int-to-float v9, v5

    const/16 v5, 0x8

    int-to-float v10, v5

    mul-float/2addr v9, v10

    const/4 v10, 0x2

    goto :goto_27

    :goto_28
    invoke-static {v2, v9, v5, v10}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v8, v5}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5, v15}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v8, Li3/i;

    const/4 v9, 0x1

    invoke-direct {v8, v9}, Li3/i;-><init>(I)V

    and-int/lit16 v9, v13, 0x1c00

    const/16 v10, 0x800

    if-ne v9, v10, :cond_3c

    const/4 v9, 0x1

    goto :goto_29

    :cond_3c
    const/4 v9, 0x0

    :goto_29
    and-int/lit16 v13, v1, 0x1c00

    if-ne v13, v10, :cond_3d

    const/4 v10, 0x1

    goto :goto_2a

    :cond_3d
    const/4 v10, 0x0

    :goto_2a
    or-int/2addr v9, v10

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_3e

    if-ne v10, v7, :cond_3f

    :cond_3e
    new-instance v10, Lbv2/b;

    const/16 v7, 0x8

    invoke-direct {v10, v0, v14, v7}, Lbv2/b;-><init>(Lkotlin/jvm/functions/Function1;ZI)V

    invoke-virtual {v6, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3f
    check-cast v10, Lc93/a;

    const/16 v7, 0x8

    const/4 v9, 0x0

    move-object/from16 p3, v5

    move/from16 p9, v7

    move-object/from16 p7, v8

    move-object/from16 p5, v9

    move-object/from16 p8, v10

    move/from16 p6, v15

    invoke-static/range {p3 .. p9}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Ll0/m;->a:Ll0/e;

    if-nez v35, :cond_40

    sget-object v7, Lb2/e;->M:Lb2/k;

    goto :goto_2b

    :cond_40
    move-object/from16 v7, v35

    :goto_2b
    new-instance v8, Ll0/k;

    const/4 v9, 0x0

    int-to-float v9, v9

    new-instance v10, Lkk1/b;

    const/4 v13, 0x4

    invoke-direct {v10, v7, v13}, Lkk1/b;-><init>(Ljava/lang/Object;I)V

    const/4 v7, 0x1

    invoke-direct {v8, v9, v7, v10}, Ll0/k;-><init>(FZLc93/m;)V

    sget-object v9, Lb2/e;->K:Lb2/l;

    const/16 v10, 0x30

    invoke-static {v8, v9, v6, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v9, v6, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v6, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-eqz v7, :cond_41

    invoke-virtual {v6, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2c

    :cond_41
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_2c
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v6, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v6, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-nez v8, :cond_42

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_43

    :cond_42
    invoke-static {v9, v6, v9, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_43
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v6, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Lg1/h3;->a:Lp1/u2;

    invoke-static/range {v34 .. v34}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual {v5, v7}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v5

    new-instance v7, Ll1/g2;

    move-wide/from16 p7, p10

    move-object/from16 p5, v0

    move-object/from16 p3, v7

    move/from16 p4, v14

    move/from16 p6, v15

    invoke-direct/range {p3 .. p8}, Ll1/g2;-><init>(ZLkotlin/jvm/functions/Function1;ZJ)V

    move/from16 v37, p4

    move/from16 v0, p6

    move-wide/from16 v38, p7

    const v8, -0x2d945434

    invoke-static {v8, v6, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const/16 v8, 0x38

    invoke-static {v5, v7, v6, v8}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v6, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v7, Liz0/l;->a:Liz0/l;

    invoke-virtual/range {p2 .. p2}, Lb91/a;->d()Ll3/v0;

    move-result-object v8

    shr-int/lit8 v4, v1, 0xf

    and-int/lit16 v4, v4, 0x3f0

    const/high16 v31, 0x30000

    const/16 v32, 0x7ff8

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/4 v9, 0x1

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move/from16 v30, v4

    move-object/from16 v29, v6

    move v4, v9

    move-wide/from16 v9, p12

    invoke-virtual/range {v7 .. v32}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v5

    shr-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0xe

    const/16 v6, 0x1f6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 p3, p1

    move/from16 p13, v1

    move-object/from16 p6, v5

    move/from16 p14, v6

    move-object/from16 p4, v7

    move/from16 p5, v8

    move-object/from16 p7, v13

    move/from16 p8, v14

    move/from16 p9, v15

    move/from16 p10, v16

    move/from16 p11, v17

    move-object/from16 p12, v29

    invoke-static/range {p3 .. p14}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v1, p12

    invoke-virtual {v1, v4}, Lp1/q;->q(Z)V

    move v5, v0

    move v6, v3

    move-wide v7, v9

    move-wide v9, v11

    move/from16 v12, v34

    move-object/from16 v13, v35

    move/from16 v14, v36

    move/from16 v4, v37

    move-wide/from16 v15, v38

    move-object/from16 v11, p0

    goto :goto_2d

    :cond_44
    move-object v1, v6

    invoke-virtual {v1}, Lp1/q;->X()V

    move-object/from16 v2, p0

    move/from16 v6, p5

    move-object/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v13, p12

    move-wide v7, v9

    move v4, v14

    move v5, v15

    move-wide/from16 v9, p8

    move/from16 v14, p13

    move-wide/from16 v15, p14

    :goto_2d
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_45

    move-object v1, v0

    new-instance v0, Lsy0/l;

    move-object/from16 v3, p2

    move-object/from16 v17, p16

    move/from16 v18, p18

    move/from16 v19, p19

    move/from16 v20, p20

    move-object/from16 v40, v1

    move-object v1, v2

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v20}, Lsy0/l;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lb91/a;ZZFJJLl0/k1;ZLb2/f;ZJLkotlin/jvm/functions/Function1;III)V

    move-object/from16 v1, v40

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_45
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(ZLkotlin/jvm/functions/Function1;ZJLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

    and-int/lit8 v0, p6, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p6, 0x1

    move-object/from16 v10, p5

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v1, 0x6

    invoke-virtual {v0, v10, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->w()J

    move-result-wide v6

    invoke-virtual {v0, v10, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v4

    const/4 v11, 0x0

    const/16 v12, 0x18

    const-wide/16 v8, 0x0

    move-wide/from16 v2, p3

    invoke-static/range {v2 .. v12}, Ldp/d;->r(JJJJLandroidx/compose/runtime/Composer;II)Lg1/r1;

    move-result-object v6

    const/4 v8, 0x0

    const/16 v9, 0x14

    const/4 v4, 0x0

    move v2, p0

    move-object v3, p1

    move v5, p2

    move-object v7, v10

    invoke-static/range {v2 .. v9}, Lg1/b1;->a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLg1/a1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lb91/a;ZZFJJLl0/k1;ZLb2/f;ZJLkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 22

    or-int/lit8 v0, p17, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v19

    invoke-static/range {p18 .. p18}, Lp1/x;->L(I)I

    move-result v20

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move-object/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move-wide/from16 v15, p14

    move-object/from16 v17, p16

    move/from16 v21, p19

    move-object/from16 v18, p20

    invoke-static/range {v1 .. v21}, Lsy0/m;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lb91/a;ZZFJJLl0/k1;ZLb2/f;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
