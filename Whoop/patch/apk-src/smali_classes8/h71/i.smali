.class public final Lh71/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J]\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lh71/i;",
        "",
        "Lb61/l;",
        "fixedPlotFactory",
        "<init>",
        "(Lb61/l;)V",
        "Lj71/b;",
        "plotState",
        "Landroidx/compose/ui/Modifier;",
        "plotModifier",
        "linePlotModifier",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onViewEvent",
        "Li71/g;",
        "dataScroller",
        "Li71/h;",
        "scrollPosition",
        "Lh2/c;",
        "xAxisLabelCustomRect",
        "",
        "parentWidth",
        "b",
        "(Lj71/b;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Li71/g;Li71/h;Lh2/c;FLandroidx/compose/runtime/Composer;I)V",
        "a",
        "Lb61/l;",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lb61/l;


# direct methods
.method public constructor <init>(Lb61/l;)V
    .locals 1

    const-string v0, "fixedPlotFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lh71/i;->a:Lb61/l;

    return-void
.end method

.method public synthetic constructor <init>(Lb61/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    new-instance p1, Lb61/l;

    invoke-direct {p1}, Lb61/l;-><init>()V

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lh71/i;-><init>(Lb61/l;)V

    return-void
.end method

.method public static synthetic a(Lh71/i;Lj71/b;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Li71/g;Li71/h;Lh2/c;FILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lh71/i;->c(Lh71/i;Lj71/b;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Li71/g;Li71/h;Lh2/c;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lh71/i;Lj71/b;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Li71/g;Li71/h;Lh2/c;FILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p9, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p10

    invoke-virtual/range {v1 .. v11}, Lh71/i;->b(Lj71/b;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Li71/g;Li71/h;Lh2/c;FLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b(Lj71/b;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Li71/g;Li71/h;Lh2/c;FLandroidx/compose/runtime/Composer;I)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj71/b;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Li71/g;",
            "Li71/h;",
            "Lh2/c;",
            "F",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v0, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v11, p7

    move/from16 v12, p8

    move/from16 v13, p10

    const-string v5, "plotState"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "plotModifier"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "linePlotModifier"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onViewEvent"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "dataScroller"

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "scrollPosition"

    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p9

    check-cast v8, Lp1/q;

    const v5, -0x767a9439

    invoke-virtual {v8, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v13, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v13

    goto :goto_1

    :cond_1
    move v5, v13

    :goto_1
    and-int/lit8 v9, v13, 0x30

    if-nez v9, :cond_3

    invoke-virtual {v8, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v5, v9

    :cond_3
    and-int/lit16 v9, v13, 0x180

    if-nez v9, :cond_5

    invoke-virtual {v8, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_3

    :cond_4
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v5, v9

    :cond_5
    and-int/lit16 v9, v13, 0xc00

    if-nez v9, :cond_7

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x800

    goto :goto_4

    :cond_6
    const/16 v9, 0x400

    :goto_4
    or-int/2addr v5, v9

    :cond_7
    and-int/lit16 v9, v13, 0x6000

    if-nez v9, :cond_a

    const v9, 0x8000

    and-int/2addr v9, v13

    if-nez v9, :cond_8

    invoke-virtual {v8, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_5

    :cond_8
    invoke-virtual {v8, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_5
    if-eqz v9, :cond_9

    const/16 v9, 0x4000

    goto :goto_6

    :cond_9
    const/16 v9, 0x2000

    :goto_6
    or-int/2addr v5, v9

    :cond_a
    const/high16 v9, 0x30000

    and-int/2addr v9, v13

    if-nez v9, :cond_c

    invoke-virtual {v8, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    const/high16 v9, 0x20000

    goto :goto_7

    :cond_b
    const/high16 v9, 0x10000

    :goto_7
    or-int/2addr v5, v9

    :cond_c
    const/high16 v9, 0x180000

    and-int/2addr v9, v13

    if-nez v9, :cond_e

    invoke-virtual {v8, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    const/high16 v9, 0x100000

    goto :goto_8

    :cond_d
    const/high16 v9, 0x80000

    :goto_8
    or-int/2addr v5, v9

    :cond_e
    const/high16 v9, 0xc00000

    and-int/2addr v9, v13

    if-nez v9, :cond_10

    invoke-virtual {v8, v12}, Lp1/q;->d(F)Z

    move-result v9

    if-eqz v9, :cond_f

    const/high16 v9, 0x800000

    goto :goto_9

    :cond_f
    const/high16 v9, 0x400000

    :goto_9
    or-int/2addr v5, v9

    :cond_10
    const/high16 v9, 0x6000000

    and-int/2addr v9, v13

    if-nez v9, :cond_12

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_11

    const/high16 v9, 0x4000000

    goto :goto_a

    :cond_11
    const/high16 v9, 0x2000000

    :goto_a
    or-int/2addr v5, v9

    :cond_12
    const v9, 0x2492493

    and-int/2addr v9, v5

    const v14, 0x2492492

    const/4 v15, 0x0

    if-eq v9, v14, :cond_13

    const/4 v9, 0x1

    goto :goto_b

    :cond_13
    move v9, v15

    :goto_b
    and-int/lit8 v14, v5, 0x1

    invoke-virtual {v8, v14, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_18

    instance-of v9, v2, Lj71/b$g;

    if-eqz v9, :cond_14

    const v9, 0x7d5eab2d

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    move-object v9, v2

    check-cast v9, Lj71/b$g;

    invoke-virtual {v9}, Lj71/b$g;->g()Ljava/util/List;

    move-result-object v9

    shr-int/lit8 v5, v5, 0x6

    and-int/lit16 v5, v5, 0x1f8e

    const/4 v10, 0x0

    move-object/from16 v22, v9

    move v9, v5

    move-object/from16 v5, v22

    invoke-static/range {v4 .. v10}, Lt61/c;->c(Landroidx/compose/ui/Modifier;Ljava/util/List;Li71/g;Li71/h;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    :goto_c
    move-object v6, v8

    goto/16 :goto_e

    :cond_14
    instance-of v4, v2, Lj71/b$m;

    if-eqz v4, :cond_16

    const v4, 0x7d62fb6e

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    move-object v4, v2

    check-cast v4, Lj71/b$m;

    invoke-virtual {v4}, Lj71/b$m;->e()Ljava/util/List;

    move-result-object v4

    if-nez v11, :cond_15

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    move/from16 p9, v6

    int-to-long v6, v7

    invoke-static/range {p9 .. p9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    const/16 v14, 0x20

    int-to-long v10, v9

    shl-long/2addr v6, v14

    const-wide v16, 0xffffffffL

    and-long v9, v10, v16

    or-long/2addr v6, v9

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v10

    int-to-long v10, v10

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    move/from16 p9, v14

    int-to-long v14, v9

    shl-long v9, v10, p9

    and-long v14, v14, v16

    or-long/2addr v9, v14

    invoke-static {v6, v7, v9, v10}, Lhg3/i;->h(JJ)Lh2/c;

    move-result-object v6

    move-object v7, v6

    goto :goto_d

    :cond_15
    move-object/from16 v7, p7

    :goto_d
    shr-int/lit8 v5, v5, 0xc

    and-int/lit8 v9, v5, 0x70

    const/4 v10, 0x4

    const/4 v6, 0x0

    move-object/from16 v5, p6

    invoke-static/range {v4 .. v10}, Lg71/c;->b(Ljava/util/List;Li71/h;Lg71/a;Lh2/c;Landroidx/compose/runtime/Composer;II)V

    const/4 v4, 0x0

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_16
    move v4, v15

    instance-of v6, v2, Lj71/b$i;

    if-eqz v6, :cond_17

    const v5, 0x7d67b9c2

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    move-object v14, v2

    check-cast v14, Lj71/b$i;

    new-instance v5, Lx61/a;

    const/4 v6, 0x1

    invoke-direct {v5, v6, v12}, Lx61/a;-><init>(ZF)V

    const/16 v20, 0x1d

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v5

    invoke-static/range {v14 .. v21}, Lj71/b$i;->f(Lj71/b$i;Ljava/util/List;Lx61/a;Ljava/lang/String;ZZILjava/lang/Object;)Lj71/b$i;

    move-result-object v15

    const/16 v19, 0x5

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v8

    move v8, v4

    invoke-static/range {v14 .. v19}, Lv61/f;->d(Landroidx/compose/ui/Modifier;Lj71/b$i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v6, v17

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_17
    move-object v6, v8

    move v8, v4

    const v4, 0x7d6a93f4

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    iget-object v4, v1, Lh71/i;->a:Lb61/l;

    invoke-virtual {v4, v2}, Lb61/l;->a(Lj71/b;)Lb61/a;

    move-result-object v4

    shr-int/lit8 v7, v5, 0x3

    and-int/lit8 v9, v7, 0xe

    shl-int/lit8 v5, v5, 0x3

    and-int/lit8 v5, v5, 0x70

    or-int/2addr v5, v9

    and-int/lit16 v7, v7, 0x380

    or-int/2addr v7, v5

    move-object v5, v4

    move-object v4, v2

    move-object v2, v5

    move-object v5, v0

    invoke-interface/range {v2 .. v7}, Lb61/a;->a(Landroidx/compose/ui/Modifier;Lj71/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_18
    move-object v6, v8

    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_19

    new-instance v0, Lh71/h;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move v9, v12

    move v10, v13

    invoke-direct/range {v0 .. v10}, Lh71/h;-><init>(Lh71/i;Lj71/b;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Li71/g;Li71/h;Lh2/c;FI)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method
