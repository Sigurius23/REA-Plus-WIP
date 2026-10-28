.class public abstract Lm81/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u001ai\u0010\u000f\u001a\u00020\r2\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u000cH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001ae\u0010\u0013\u001a\u00020\r2\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u000cH\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001aa\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00072\u0008\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u000c2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000cH\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006!\u00b2\u0006\u000e\u0010 \u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "",
        "Lm81/g;",
        "viewState",
        "",
        "initialSelectedId",
        "Li2/x;",
        "activeColor",
        "Ly3/f;",
        "paddingSize",
        "Lm81/f;",
        "selectedStyle",
        "unselectedStyle",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onSelect",
        "m",
        "(Ljava/util/List;Ljava/lang/String;JLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "selectedIndex",
        "l",
        "(Ljava/util/List;IJLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "initialToggle",
        "minHeight",
        "style",
        "onMeasuredHeight",
        "onToggle",
        "k",
        "(Lm81/g;JZFLm81/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "a",
        "F",
        "DefaultSelectorButtonMinHeight",
        "sharedMinHeightPx",
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

    const/16 v0, 0x9

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lm81/e;->a:F

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/util/List;IZ)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lm81/e;->u(Lkotlin/jvm/functions/Function1;Ljava/util/List;IZ)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lm81/e;->w(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/h1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lm81/e;->n(Lp1/a1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ly3/f;Ljava/util/List;JFLm81/f;Lm81/f;Lp1/a1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p13}, Lm81/e;->s(Ly3/f;Ljava/util/List;JFLm81/f;Lm81/f;Lp1/a1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Li2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lm81/e;->r(Li2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lm81/g;JZFLm81/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lm81/e;->y(Lm81/g;JZFLm81/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/util/List;Ljava/lang/String;JLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lm81/e;->o(Ljava/util/List;Ljava/lang/String;JLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Ly2/y;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lm81/e;->x(Lkotlin/jvm/functions/Function1;Ly2/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/util/List;IJLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lm81/e;->v(Ljava/util/List;IJLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lp1/a1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lm81/e;->t(Lp1/a1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lm81/g;JZFLm81/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm81/g;",
            "JZF",
            "Lm81/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v3, p3

    move/from16 v0, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move/from16 v11, p9

    move-object/from16 v12, p8

    check-cast v12, Lp1/q;

    const v2, 0x3f9cb727

    invoke-virtual {v12, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v11, 0x6

    const/4 v13, 0x2

    const/4 v14, 0x4

    if-nez v2, :cond_2

    and-int/lit8 v2, v11, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v14

    goto :goto_1

    :cond_1
    move v2, v13

    :goto_1
    or-int/2addr v2, v11

    goto :goto_2

    :cond_2
    move v2, v11

    :goto_2
    and-int/lit8 v4, v11, 0x30

    if-nez v4, :cond_4

    move-wide/from16 v4, p1

    invoke-virtual {v12, v4, v5}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v2, v6

    goto :goto_4

    :cond_4
    move-wide/from16 v4, p1

    :goto_4
    and-int/lit16 v6, v11, 0x180

    if-nez v6, :cond_6

    invoke-virtual {v12, v3}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_5

    :cond_5
    const/16 v6, 0x80

    :goto_5
    or-int/2addr v2, v6

    :cond_6
    and-int/lit16 v6, v11, 0xc00

    if-nez v6, :cond_8

    invoke-virtual {v12, v0}, Lp1/q;->d(F)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x800

    goto :goto_6

    :cond_7
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v2, v6

    :cond_8
    and-int/lit16 v6, v11, 0x6000

    if-nez v6, :cond_b

    const v6, 0x8000

    and-int/2addr v6, v11

    if-nez v6, :cond_9

    invoke-virtual {v12, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_7

    :cond_9
    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_7
    if-eqz v6, :cond_a

    const/16 v6, 0x4000

    goto :goto_8

    :cond_a
    const/16 v6, 0x2000

    :goto_8
    or-int/2addr v2, v6

    :cond_b
    const/high16 v6, 0x30000

    and-int/2addr v6, v11

    if-nez v6, :cond_d

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    const/high16 v6, 0x20000

    goto :goto_9

    :cond_c
    const/high16 v6, 0x10000

    :goto_9
    or-int/2addr v2, v6

    :cond_d
    const/high16 v6, 0x180000

    and-int/2addr v6, v11

    if-nez v6, :cond_f

    invoke-virtual {v12, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    const/high16 v6, 0x100000

    goto :goto_a

    :cond_e
    const/high16 v6, 0x80000

    :goto_a
    or-int/2addr v2, v6

    :cond_f
    move/from16 v16, v2

    const v2, 0x92493

    and-int v2, v16, v2

    const v6, 0x92492

    const/4 v4, 0x0

    if-eq v2, v6, :cond_10

    const/4 v2, 0x1

    goto :goto_b

    :cond_10
    move v2, v4

    :goto_b
    and-int/lit8 v5, v16, 0x1

    invoke-virtual {v12, v5, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_2e

    if-eqz v8, :cond_11

    invoke-virtual {v8}, Lm81/f;->d()Ly81/e;

    move-result-object v5

    goto :goto_c

    :cond_11
    const/4 v5, 0x0

    :goto_c
    if-nez v5, :cond_12

    const v5, -0x61d624f9

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    const/4 v5, 0x0

    goto :goto_d

    :cond_12
    const v6, -0x34b453c6    # -1.3347898E7f

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    invoke-interface {v5, v12, v4}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    invoke-static {v12, v4, v5, v6}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v5

    :goto_d
    const/4 v6, 0x6

    if-eqz v5, :cond_13

    iget-wide v2, v5, Li2/x;->a:J

    :goto_e
    move-wide/from16 v20, v2

    goto :goto_f

    :cond_13
    if-eqz p3, :cond_14

    const v2, -0x34b44c4f    # -1.3349809E7f

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-static {v2, v12, v6, v4}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v2

    goto :goto_e

    :cond_14
    const v2, -0x34b4480f    # -1.3350897E7f

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-static {v2, v12, v6, v4}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v2

    goto :goto_e

    :goto_f
    if-eqz v8, :cond_15

    invoke-virtual {v8}, Lm81/f;->a()Ly81/e;

    move-result-object v2

    goto :goto_10

    :cond_15
    const/4 v2, 0x0

    :goto_10
    if-nez v2, :cond_16

    const v2, -0x61d3cc59

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    const/4 v2, 0x0

    goto :goto_11

    :cond_16
    const v3, -0x34b44066    # -1.3352858E7f

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    invoke-interface {v2, v12, v4}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v2

    invoke-static {v12, v4, v2, v3}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v2

    :goto_11
    if-eqz v2, :cond_17

    iget-wide v2, v2, Li2/x;->a:J

    goto :goto_12

    :cond_17
    if-eqz p3, :cond_18

    const v2, -0x34b43b2e    # -1.3354194E7f

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    move-wide/from16 v2, p1

    goto :goto_12

    :cond_18
    const v2, -0x34b436d2    # -1.335531E7f

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-static {v2, v12, v6, v4}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v2

    :goto_12
    if-eqz v8, :cond_19

    invoke-virtual {v8}, Lm81/f;->f()Ly81/e;

    move-result-object v5

    goto :goto_13

    :cond_19
    const/4 v5, 0x0

    :goto_13
    if-nez v5, :cond_1a

    const v5, -0x61d1efb9

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    const/4 v5, 0x0

    goto :goto_14

    :cond_1a
    const v15, -0x34b43106    # -1.3356794E7f

    invoke-virtual {v12, v15}, Lp1/q;->e0(I)V

    invoke-interface {v5, v12, v4}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    invoke-static {v12, v4, v7, v8}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v5

    :goto_14
    if-eqz v5, :cond_1b

    iget-wide v7, v5, Li2/x;->a:J

    :goto_15
    move-wide/from16 v22, v7

    goto :goto_16

    :cond_1b
    if-eqz p3, :cond_1c

    const v5, -0x34b42992    # -1.3358702E7f

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, v12, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->t()J

    move-result-wide v7

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    goto :goto_15

    :cond_1c
    const v5, -0x34b425b2    # -1.3359694E7f

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-static {v5, v12, v6, v4}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v7

    goto :goto_15

    :goto_16
    invoke-virtual {v1}, Lm81/g;->b()Lgz0/m0;

    move-result-object v5

    if-eqz v5, :cond_1d

    const-wide v7, 0x4033800000000000L    # 19.5

    double-to-float v5, v7

    :goto_17
    int-to-float v7, v14

    mul-float/2addr v5, v7

    move v8, v5

    goto :goto_18

    :cond_1d
    const/16 v5, 0xa

    int-to-float v5, v5

    goto :goto_17

    :goto_18
    invoke-virtual {v1}, Lm81/g;->b()Lgz0/m0;

    move-result-object v5

    if-eqz v5, :cond_1e

    int-to-float v5, v13

    int-to-float v7, v14

    mul-float/2addr v5, v7

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    goto :goto_19

    :cond_1e
    sget-object v5, Ll0/m;->e:Ll0/h;

    :goto_19
    const/4 v7, 0x3

    if-eqz p5, :cond_1f

    invoke-virtual/range {p5 .. p5}, Lm81/f;->e()F

    move-result v19

    move/from16 v6, v19

    goto :goto_1a

    :cond_1f
    int-to-float v6, v7

    int-to-float v7, v14

    mul-float/2addr v6, v7

    :goto_1a
    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    if-eqz p5, :cond_20

    invoke-virtual/range {p5 .. p5}, Lm81/f;->b()Ly81/e;

    move-result-object v7

    :goto_1b
    move-wide/from16 v25, v2

    goto :goto_1c

    :cond_20
    const/4 v7, 0x0

    goto :goto_1b

    :goto_1c
    sget-object v2, Lb2/t;->w:Lb2/t;

    if-nez v7, :cond_21

    const v3, -0x61cbc86a

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    const/4 v3, 0x0

    goto :goto_1d

    :cond_21
    const v3, -0x61cbc869

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p5 .. p5}, Lm81/f;->c()F

    move-result v3

    invoke-interface {v7, v12, v4}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v13

    invoke-static {v3, v13, v14}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v3

    iget v7, v3, Lf0/t;->a:F

    iget-object v3, v3, Lf0/t;->b:Li2/t;

    invoke-static {v7, v2, v3, v6}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    :goto_1d
    if-nez v3, :cond_22

    move-object v13, v2

    goto :goto_1e

    :cond_22
    move-object v13, v3

    :goto_1e
    const/high16 v3, 0x380000

    and-int v3, v16, v3

    const/high16 v15, 0x100000

    if-ne v3, v15, :cond_23

    const/4 v3, 0x1

    goto :goto_1f

    :cond_23
    move v3, v4

    :goto_1f
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v3, :cond_24

    if-ne v7, v14, :cond_25

    :cond_24
    new-instance v7, Ll80/k;

    const/16 v3, 0xf

    invoke-direct {v7, v10, v3}, Ll80/k;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v3, v6

    move-object v6, v7

    const/16 v7, 0xe

    move v15, v4

    const/4 v4, 0x0

    move-object/from16 v28, v5

    const/4 v5, 0x0

    move-object v1, v3

    move-wide/from16 v10, v25

    const/4 v15, 0x3

    move/from16 v3, p3

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/selection/d;->b(Landroidx/compose/ui/Modifier;ZZLi3/i;Lkotlin/jvm/functions/Function1;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4, v8, v0}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3, v1}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface {v1, v13}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Li2/w0;->a:Li2/v0;

    invoke-static {v1, v10, v11, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    int-to-float v3, v15

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    const/4 v5, 0x2

    int-to-float v5, v5

    mul-float/2addr v5, v4

    invoke-static {v1, v3, v5}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v3, 0x70000

    and-int v3, v16, v3

    const/high16 v5, 0x20000

    if-ne v3, v5, :cond_26

    const/4 v3, 0x1

    goto :goto_20

    :cond_26
    const/4 v3, 0x0

    :goto_20
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_27

    if-ne v5, v14, :cond_28

    :cond_27
    new-instance v5, Ll80/k;

    const/16 v3, 0x10

    invoke-direct {v5, v9, v3}, Ll80/k;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v5}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->K:Lb2/l;

    const/16 v5, 0x30

    move-object/from16 v6, v28

    invoke-static {v6, v3, v12, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v5, v12, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_29

    invoke-virtual {v12, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_21

    :cond_29
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_21
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v12, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v12, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-nez v6, :cond_2a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2b

    :cond_2a
    invoke-static {v5, v12, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2b
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v12, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lm81/g;->b()Lgz0/m0;

    move-result-object v1

    if-nez v1, :cond_2c

    const v1, -0x36840889

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    const/4 v15, 0x0

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    move-object v4, v12

    move v1, v15

    const/4 v2, 0x1

    const/4 v3, 0x6

    goto :goto_22

    :cond_2c
    const/4 v15, 0x0

    const v1, -0x36840888

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lm81/g;->b()Lgz0/m0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    const/4 v3, 0x6

    invoke-static {v1, v12, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v1

    mul-float/2addr v4, v4

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/4 v2, 0x1

    const/16 v18, 0x1b0

    const/16 v19, 0x0

    const/4 v13, 0x0

    move-object/from16 v17, v12

    move-object v12, v1

    move v1, v15

    move-wide/from16 v15, v22

    invoke-static/range {v12 .. v19}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v4, v17

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    :goto_22
    invoke-virtual/range {p0 .. p0}, Lm81/g;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v4, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lm81/g;->d()Lb91/a;

    move-result-object v5

    if-nez v5, :cond_2d

    const v5, 0x380c7205

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, v4, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->s()Lb91/a;

    move-result-object v5

    :goto_23
    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    move-object/from16 v32, v5

    goto :goto_24

    :cond_2d
    const v3, 0x380c6c35

    invoke-virtual {v4, v3}, Lp1/q;->e0(I)V

    goto :goto_23

    :goto_24
    const v1, 0x3fb33333    # 1.4f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v33

    const/high16 v36, 0xc00000

    const v37, 0xfffa

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-wide/from16 v14, v20

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v35, 0x0

    move-object/from16 v34, v4

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    goto :goto_25

    :cond_2e
    move-object v4, v12

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_25
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_2f

    new-instance v0, Lm81/d;

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object v7, v9

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lm81/d;-><init>(Lm81/g;JZFLm81/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_2f
    return-void
.end method

.method public static final l(Ljava/util/List;IJLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm81/g;",
            ">;IJ",
            "Ly3/f;",
            "Lm81/f;",
            "Lm81/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v10, p1

    move-object/from16 v0, p5

    move-object/from16 v2, p6

    move-object/from16 v8, p7

    move/from16 v11, p9

    const-string v3, "viewState"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onSelect"

    invoke-static {v8, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p8

    check-cast v12, Lp1/q;

    const v3, 0x556e15b

    invoke-virtual {v12, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v11, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v11

    goto :goto_1

    :cond_1
    move v3, v11

    :goto_1
    and-int/lit8 v6, v11, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v12, v10}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit16 v6, v11, 0x180

    if-nez v6, :cond_5

    move-wide/from16 v6, p2

    invoke-virtual {v12, v6, v7}, Lp1/q;->f(J)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_3

    :cond_4
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v3, v9

    goto :goto_4

    :cond_5
    move-wide/from16 v6, p2

    :goto_4
    and-int/lit8 v9, p10, 0x8

    if-eqz v9, :cond_7

    or-int/lit16 v3, v3, 0xc00

    :cond_6
    move-object/from16 v13, p4

    goto :goto_6

    :cond_7
    and-int/lit16 v13, v11, 0xc00

    if-nez v13, :cond_6

    move-object/from16 v13, p4

    invoke-virtual {v12, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_8

    const/16 v14, 0x800

    goto :goto_5

    :cond_8
    const/16 v14, 0x400

    :goto_5
    or-int/2addr v3, v14

    :goto_6
    and-int/lit8 v14, p10, 0x10

    if-eqz v14, :cond_9

    or-int/lit16 v3, v3, 0x6000

    goto :goto_9

    :cond_9
    and-int/lit16 v15, v11, 0x6000

    if-nez v15, :cond_c

    const v15, 0x8000

    and-int/2addr v15, v11

    if-nez v15, :cond_a

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    goto :goto_7

    :cond_a
    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    :goto_7
    if-eqz v15, :cond_b

    const/16 v15, 0x4000

    goto :goto_8

    :cond_b
    const/16 v15, 0x2000

    :goto_8
    or-int/2addr v3, v15

    :cond_c
    :goto_9
    and-int/lit8 v15, p10, 0x20

    const/high16 v16, 0x30000

    if-eqz v15, :cond_d

    :goto_a
    or-int v3, v3, v16

    goto :goto_c

    :cond_d
    and-int v16, v11, v16

    if-nez v16, :cond_10

    const/high16 v16, 0x40000

    and-int v16, v11, v16

    if-nez v16, :cond_e

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    goto :goto_b

    :cond_e
    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    :goto_b
    if-eqz v16, :cond_f

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v16, 0x10000

    goto :goto_a

    :cond_10
    :goto_c
    const/high16 v16, 0x180000

    and-int v16, v11, v16

    if-nez v16, :cond_12

    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_11

    const/high16 v16, 0x100000

    goto :goto_d

    :cond_11
    const/high16 v16, 0x80000

    :goto_d
    or-int v3, v3, v16

    :cond_12
    const v16, 0x92493

    and-int v5, v3, v16

    const v4, 0x92492

    const/4 v0, 0x0

    const/16 v17, 0x1

    if-eq v5, v4, :cond_13

    move/from16 v4, v17

    goto :goto_e

    :cond_13
    move v4, v0

    :goto_e
    and-int/lit8 v3, v3, 0x1

    invoke-virtual {v12, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_1a

    const/4 v3, 0x0

    if-eqz v9, :cond_14

    move-object v13, v3

    :cond_14
    if-eqz v14, :cond_15

    move-object v6, v3

    goto :goto_f

    :cond_15
    move-object/from16 v6, p5

    :goto_f
    if-eqz v15, :cond_16

    move-object v7, v3

    goto :goto_10

    :cond_16
    move-object v7, v2

    :goto_10
    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_17

    if-ne v3, v4, :cond_18

    :cond_17
    invoke-static {v0, v12}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v3

    :cond_18
    check-cast v3, Lp1/a1;

    sget-object v2, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v12, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/c;

    invoke-static {v3}, Lm81/e;->p(Lp1/a1;)I

    move-result v5

    invoke-interface {v2, v5}, Ly3/c;->e0(I)F

    move-result v2

    new-instance v5, Ly3/f;

    invoke-direct {v5, v2}, Ly3/f;-><init>(F)V

    sget v2, Lm81/e;->a:F

    new-instance v9, Ly3/f;

    invoke-direct {v9, v2}, Ly3/f;-><init>(F)V

    invoke-static {v5, v9}, Le93/b;->k(Ly3/f;Ly3/f;)Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ly3/f;

    iget v5, v2, Ly3/f;->w:F

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_19

    new-instance v2, Lm01/c;

    const/16 v4, 0x12

    invoke-direct {v2, v4}, Lm01/c;-><init>(I)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v2, Lkotlin/jvm/functions/Function1;

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v2}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object v2

    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v15

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v10, v0, v2}, Le93/b;->n(III)I

    move-result v0

    const/4 v2, 0x2

    int-to-float v2, v2

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v2, v4

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v16

    move-object/from16 v17, v15

    move-object/from16 v15, v16

    sget-object v16, Lb2/e;->K:Lb2/l;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    new-instance v0, Lm81/a;

    move-object v2, v1

    move-object v9, v8

    move-object v1, v13

    move-object v8, v3

    move-wide/from16 v3, p2

    invoke-direct/range {v0 .. v9}, Lm81/a;-><init>(Ly3/f;Ljava/util/List;JFLm81/f;Lm81/f;Lp1/a1;Lkotlin/jvm/functions/Function1;)V

    const v2, 0x7265927

    invoke-static {v2, v12, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const v19, 0x36d80

    const/16 v20, 0x0

    move-object/from16 v13, v18

    move-object/from16 v18, v12

    move-object/from16 v12, v17

    move-object/from16 v17, v0

    invoke-static/range {v12 .. v20}, Lf31/c;->e(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ll0/i;Lb2/g;Lc93/o;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v1

    goto :goto_11

    :cond_1a
    move-object/from16 v18, v12

    invoke-virtual/range {v18 .. v18}, Lp1/q;->X()V

    move-object/from16 v6, p5

    move-object v7, v2

    move-object v5, v13

    :goto_11
    invoke-virtual/range {v18 .. v18}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_1b

    new-instance v0, Lm81/b;

    move-object/from16 v1, p0

    move-wide/from16 v3, p2

    move-object/from16 v8, p7

    move v2, v10

    move v9, v11

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lm81/b;-><init>(Ljava/util/List;IJLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method public static final m(Ljava/util/List;Ljava/lang/String;JLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm81/g;",
            ">;",
            "Ljava/lang/String;",
            "J",
            "Ly3/f;",
            "Lm81/f;",
            "Lm81/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    move-object/from16 v11, p7

    move/from16 v12, p9

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onSelect"

    invoke-static {v11, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p8

    check-cast v8, Lp1/q;

    const v3, -0x321531b7

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v12, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v12

    goto :goto_1

    :cond_1
    move v3, v12

    :goto_1
    and-int/lit8 v4, p10, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v3, v3, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v12, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :goto_3
    and-int/lit16 v6, v12, 0x180

    if-nez v6, :cond_6

    move-wide/from16 v6, p2

    invoke-virtual {v8, v6, v7}, Lp1/q;->f(J)Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, 0x100

    goto :goto_4

    :cond_5
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v3, v9

    goto :goto_5

    :cond_6
    move-wide/from16 v6, p2

    :goto_5
    and-int/lit8 v9, p10, 0x8

    if-eqz v9, :cond_8

    or-int/lit16 v3, v3, 0xc00

    :cond_7
    move-object/from16 v10, p4

    goto :goto_7

    :cond_8
    and-int/lit16 v10, v12, 0xc00

    if-nez v10, :cond_7

    move-object/from16 v10, p4

    invoke-virtual {v8, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_9

    const/16 v13, 0x800

    goto :goto_6

    :cond_9
    const/16 v13, 0x400

    :goto_6
    or-int/2addr v3, v13

    :goto_7
    and-int/lit8 v13, p10, 0x10

    if-eqz v13, :cond_a

    or-int/lit16 v3, v3, 0x6000

    goto :goto_a

    :cond_a
    and-int/lit16 v14, v12, 0x6000

    if-nez v14, :cond_d

    const v14, 0x8000

    and-int/2addr v14, v12

    if-nez v14, :cond_b

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    goto :goto_8

    :cond_b
    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    :goto_8
    if-eqz v14, :cond_c

    const/16 v14, 0x4000

    goto :goto_9

    :cond_c
    const/16 v14, 0x2000

    :goto_9
    or-int/2addr v3, v14

    :cond_d
    :goto_a
    and-int/lit8 v14, p10, 0x20

    const/high16 v15, 0x30000

    if-eqz v14, :cond_e

    :goto_b
    or-int/2addr v3, v15

    goto :goto_d

    :cond_e
    and-int/2addr v15, v12

    if-nez v15, :cond_11

    const/high16 v15, 0x40000

    and-int/2addr v15, v12

    if-nez v15, :cond_f

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    goto :goto_c

    :cond_f
    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    :goto_c
    if-eqz v15, :cond_10

    const/high16 v15, 0x20000

    goto :goto_b

    :cond_10
    const/high16 v15, 0x10000

    goto :goto_b

    :cond_11
    :goto_d
    const/high16 v15, 0x180000

    and-int/2addr v15, v12

    if-nez v15, :cond_13

    invoke-virtual {v8, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_12

    const/high16 v15, 0x100000

    goto :goto_e

    :cond_12
    const/high16 v15, 0x80000

    :goto_e
    or-int/2addr v3, v15

    :cond_13
    const v15, 0x92493

    and-int/2addr v15, v3

    const v1, 0x92492

    const/16 v16, 0x0

    const/16 v17, 0x1

    if-eq v15, v1, :cond_14

    move/from16 v1, v17

    goto :goto_f

    :cond_14
    move/from16 v1, v16

    :goto_f
    and-int/lit8 v15, v3, 0x1

    invoke-virtual {v8, v15, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1f

    const/4 v1, 0x0

    if-eqz v4, :cond_15

    move-object v15, v1

    goto :goto_10

    :cond_15
    move-object v15, v5

    :goto_10
    if-eqz v9, :cond_16

    move-object v4, v1

    goto :goto_11

    :cond_16
    move-object v4, v10

    :goto_11
    if-eqz v13, :cond_17

    move-object v5, v1

    goto :goto_12

    :cond_17
    move-object/from16 v5, p5

    :goto_12
    if-eqz v14, :cond_18

    move-object v6, v1

    goto :goto_13

    :cond_18
    move-object v6, v2

    :goto_13
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_1b

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move/from16 v7, v16

    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lm81/g;

    invoke-virtual {v9}, Lm81/g;->a()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_19

    goto :goto_15

    :cond_19
    add-int/lit8 v7, v7, 0x1

    goto :goto_14

    :cond_1a
    const/4 v7, -0x1

    :goto_15
    invoke-static {v7, v8}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v1

    :cond_1b
    check-cast v1, Lp1/a1;

    check-cast v1, Lp1/h1;

    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v7

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    const/high16 v10, 0x380000

    and-int/2addr v10, v3

    const/high16 v13, 0x100000

    if-ne v10, v13, :cond_1c

    move/from16 v16, v17

    :cond_1c
    or-int v9, v9, v16

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_1d

    if-ne v10, v2, :cond_1e

    :cond_1d
    new-instance v10, Ljs2/h;

    const/16 v2, 0x11

    invoke-direct {v10, v1, v0, v11, v2}, Ljs2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v10, Lkotlin/jvm/functions/Function1;

    const v1, 0x7ff8e

    and-int v9, v3, v1

    move v1, v7

    move-object v7, v10

    const/4 v10, 0x0

    move-wide/from16 v2, p2

    invoke-static/range {v0 .. v10}, Lm81/e;->l(Ljava/util/List;IJLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v6

    move-object v2, v15

    move-object v6, v5

    move-object v5, v4

    goto :goto_16

    :cond_1f
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object/from16 v6, p5

    move-object v7, v2

    move-object v2, v5

    move-object v5, v10

    :goto_16
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_20

    new-instance v0, Lm81/c;

    move-object/from16 v1, p0

    move-wide/from16 v3, p2

    move/from16 v10, p10

    move-object v8, v11

    move v9, v12

    invoke-direct/range {v0 .. v10}, Lm81/c;-><init>(Ljava/util/List;Ljava/lang/String;JLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final n(Lp1/a1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 2

    const-string v0, "buttonId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm81/g;

    invoke-virtual {v1}, Lm81/g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_1
    check-cast p0, Lp1/h1;

    invoke-virtual {p0, v0}, Lp1/h1;->y(I)V

    invoke-interface {p2, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Ljava/util/List;Ljava/lang/String;JLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Lm81/e;->m(Ljava/util/List;Ljava/lang/String;JLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final q(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final r(Li2/g0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    check-cast p0, Li2/x0;

    invoke-virtual {p0, v0}, Li2/x0;->f(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Ly3/f;Ljava/util/List;JFLm81/f;Lm81/f;Lp1/a1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p7

    move-object/from16 v3, p8

    move/from16 v4, p10

    move-object/from16 v5, p11

    move/from16 v6, p13

    const-string v7, "$this$RadioGroup"

    move-object/from16 v8, p9

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "state"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v7, v6, 0x30

    const/16 v8, 0x20

    if-nez v7, :cond_1

    move-object/from16 v7, p12

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v4}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_0

    move v7, v8

    goto :goto_0

    :cond_0
    const/16 v7, 0x10

    :goto_0
    or-int/2addr v7, v6

    goto :goto_1

    :cond_1
    move v7, v6

    :goto_1
    and-int/lit16 v6, v6, 0x180

    if-nez v6, :cond_3

    move-object/from16 v6, p12

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x100

    goto :goto_2

    :cond_2
    const/16 v6, 0x80

    :goto_2
    or-int/2addr v7, v6

    :cond_3
    and-int/lit16 v6, v7, 0x491

    const/16 v9, 0x490

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eq v6, v9, :cond_4

    move v6, v10

    goto :goto_3

    :cond_4
    move v6, v11

    :goto_3
    and-int/lit8 v9, v7, 0x1

    move-object/from16 v12, p12

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v9, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_d

    sget-object v6, Lb2/t;->w:Lb2/t;

    if-nez v4, :cond_5

    if-eqz v0, :cond_5

    const v9, 0x7a1bdf6

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    iget v9, v0, Ly3/f;->w:F

    invoke-static {v6, v9, v12, v11}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    goto :goto_4

    :cond_5
    const v9, 0x7a2c0fb

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    :goto_4
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lm81/g;

    invoke-virtual {v5}, Lf31/a;->c()Z

    move-result v15

    invoke-virtual {v5}, Lf31/a;->c()Z

    move-result v5

    if-eqz v5, :cond_6

    move-object/from16 v17, p5

    goto :goto_5

    :cond_6
    move-object/from16 v17, p6

    :goto_5
    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_7

    if-ne v13, v14, :cond_8

    :cond_7
    new-instance v13, Lfc0/f;

    const/4 v5, 0x4

    invoke-direct {v13, v2, v5}, Lfc0/f;-><init>(Lp1/a1;I)V

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v18, v13

    check-cast v18, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    and-int/lit8 v5, v7, 0x70

    if-ne v5, v8, :cond_9

    goto :goto_6

    :cond_9
    move v10, v11

    :goto_6
    or-int/2addr v2, v10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_a

    if-ne v5, v14, :cond_b

    :cond_a
    new-instance v5, Lcom/whoop/data/local/room/dao/wipeable/d;

    const/4 v2, 0x6

    invoke-direct {v5, v3, v1, v4, v2}, Lcom/whoop/data/local/room/dao/wipeable/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v19, v5

    check-cast v19, Lkotlin/jvm/functions/Function1;

    const/16 v21, 0x0

    move-wide/from16 v13, p2

    move/from16 v16, p4

    move-object/from16 v20, v12

    move-object v12, v9

    invoke-static/range {v12 .. v21}, Lm81/e;->k(Lm81/g;JZFLm81/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v2, v20

    invoke-static {v1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    if-ne v4, v1, :cond_c

    if-eqz v0, :cond_c

    const v1, 0x7aaf9b6

    invoke-virtual {v2, v1}, Lp1/q;->e0(I)V

    iget v0, v0, Ly3/f;->w:F

    invoke-static {v6, v0, v2, v11}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    goto :goto_7

    :cond_c
    const v0, 0x7abfcbb

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v11}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_d
    move-object v2, v12

    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final t(Lp1/a1;I)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lm81/e;->p(Lp1/a1;)I

    move-result v0

    if-le p1, v0, :cond_0

    invoke-static {p0, p1}, Lm81/e;->q(Lp1/a1;I)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lkotlin/jvm/functions/Function1;Ljava/util/List;IZ)Ll83/a0;
    .locals 0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm81/g;

    invoke-virtual {p1}, Lm81/g;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Ljava/util/List;IJLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move-object v1, p0

    move v2, p1

    move-wide v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Lm81/e;->l(Ljava/util/List;IJLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lkotlin/jvm/functions/Function1;Ly2/y;)Ll83/a0;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ly2/y;->n()J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lm81/g;JZFLm81/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move-object v1, p0

    move-wide v2, p1

    move v4, p3

    move v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p9

    invoke-static/range {v1 .. v10}, Lm81/e;->k(Lm81/g;JZFLm81/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
