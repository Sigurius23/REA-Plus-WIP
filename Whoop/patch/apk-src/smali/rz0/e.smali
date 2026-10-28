.class public abstract Lrz0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u001ai\u0010\u0011\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a-\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a%\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0016\u001a%\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a+\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\"\u0014\u0010!\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lrz0/f;",
        "style",
        "Li2/x;",
        "backgroundColor",
        "Lt0/i;",
        "shape",
        "Lf0/t;",
        "border",
        "Lrz0/a;",
        "dashedEffect",
        "Ly3/f;",
        "elevation",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "cardContent",
        "j",
        "(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V",
        "m",
        "(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;)Landroidx/compose/ui/Modifier;",
        "s",
        "(Landroidx/compose/ui/Modifier;Lrz0/f;Lt0/i;)Landroidx/compose/ui/Modifier;",
        "o",
        "n",
        "(Landroidx/compose/ui/Modifier;Lrz0/a;J)Landroidx/compose/ui/Modifier;",
        "strokeWidth",
        "color",
        "cornerRadiusDp",
        "u",
        "(Landroidx/compose/ui/Modifier;FJF)Landroidx/compose/ui/Modifier;",
        "a",
        "F",
        "LEADING_ACCENT_WIDTH",
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

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    double-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lrz0/e;->a:F

    return-void
.end method

.method public static synthetic a(Lrz0/f;Lt0/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrz0/e;->p(Lrz0/f;Lt0/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lrz0/f;JLt0/i;Lrz0/a;Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lrz0/e;->k(Lrz0/f;JLt0/i;Lrz0/a;Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lrz0/f;Lt0/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrz0/e;->t(Lrz0/f;Lt0/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(JFFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static/range {p0 .. p6}, Lrz0/e;->v(JFFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(FFJLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrz0/e;->x(FFJLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(FLi2/j;Li2/t;Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lrz0/e;->r(FLi2/s0;Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(FFJLf2/d;)Lf2/g;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrz0/e;->w(FFJLf2/d;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p12}, Lrz0/e;->l(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lt0/i;Li2/t;Lf2/d;)Lf2/g;
    .locals 0

    invoke-static {p0, p1, p2}, Lrz0/e;->q(Lt0/i;Li2/t;Lf2/d;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lrz0/f;",
            "J",
            "Lt0/i;",
            "Lf0/t;",
            "Lrz0/a;",
            "F",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v9, p8

    move/from16 v10, p10

    const-string v0, "cardContent"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p9

    check-cast v0, Lp1/q;

    const v1, -0x5f6ba13d

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p11, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v10, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v10, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v10

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v10

    :goto_1
    and-int/lit8 v4, p11, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v5, v10, 0x30

    if-nez v5, :cond_6

    if-nez p1, :cond_4

    const/4 v5, -0x1

    goto :goto_2

    :cond_4
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    :goto_2
    invoke-virtual {v0, v5}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_3

    :cond_5
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_6
    :goto_4
    and-int/lit16 v5, v10, 0x180

    if-nez v5, :cond_9

    and-int/lit8 v5, p11, 0x4

    if-nez v5, :cond_7

    move-wide/from16 v5, p2

    invoke-virtual {v0, v5, v6}, Lp1/q;->f(J)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x100

    goto :goto_5

    :cond_7
    move-wide/from16 v5, p2

    :cond_8
    const/16 v7, 0x80

    :goto_5
    or-int/2addr v3, v7

    goto :goto_6

    :cond_9
    move-wide/from16 v5, p2

    :goto_6
    and-int/lit16 v7, v10, 0xc00

    if-nez v7, :cond_c

    and-int/lit8 v7, p11, 0x8

    if-nez v7, :cond_a

    move-object/from16 v7, p4

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    const/16 v8, 0x800

    goto :goto_7

    :cond_a
    move-object/from16 v7, p4

    :cond_b
    const/16 v8, 0x400

    :goto_7
    or-int/2addr v3, v8

    goto :goto_8

    :cond_c
    move-object/from16 v7, p4

    :goto_8
    and-int/lit8 v8, p11, 0x10

    if-eqz v8, :cond_e

    or-int/lit16 v3, v3, 0x6000

    :cond_d
    move-object/from16 v11, p5

    goto :goto_a

    :cond_e
    and-int/lit16 v11, v10, 0x6000

    if-nez v11, :cond_d

    move-object/from16 v11, p5

    invoke-virtual {v0, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    const/16 v12, 0x4000

    goto :goto_9

    :cond_f
    const/16 v12, 0x2000

    :goto_9
    or-int/2addr v3, v12

    :goto_a
    and-int/lit8 v12, p11, 0x20

    const/high16 v13, 0x30000

    if-eqz v12, :cond_11

    or-int/2addr v3, v13

    :cond_10
    move-object/from16 v13, p6

    goto :goto_c

    :cond_11
    and-int/2addr v13, v10

    if-nez v13, :cond_10

    move-object/from16 v13, p6

    invoke-virtual {v0, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_12

    const/high16 v14, 0x20000

    goto :goto_b

    :cond_12
    const/high16 v14, 0x10000

    :goto_b
    or-int/2addr v3, v14

    :goto_c
    and-int/lit8 v14, p11, 0x40

    const/high16 v15, 0x180000

    if-eqz v14, :cond_14

    or-int/2addr v3, v15

    :cond_13
    move/from16 v15, p7

    goto :goto_e

    :cond_14
    and-int/2addr v15, v10

    if-nez v15, :cond_13

    move/from16 v15, p7

    invoke-virtual {v0, v15}, Lp1/q;->d(F)Z

    move-result v16

    if-eqz v16, :cond_15

    const/high16 v16, 0x100000

    goto :goto_d

    :cond_15
    const/high16 v16, 0x80000

    :goto_d
    or-int v3, v3, v16

    :goto_e
    const/high16 v16, 0xc00000

    and-int v16, v10, v16

    if-nez v16, :cond_17

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_16

    const/high16 v16, 0x800000

    goto :goto_f

    :cond_16
    const/high16 v16, 0x400000

    :goto_f
    or-int v3, v3, v16

    :cond_17
    const v16, 0x492493

    move/from16 p9, v1

    and-int v1, v3, v16

    const v2, 0x492492

    move/from16 v16, v4

    const/4 v4, 0x0

    if-eq v1, v2, :cond_18

    const/4 v1, 0x1

    goto :goto_10

    :cond_18
    move v1, v4

    :goto_10
    and-int/lit8 v2, v3, 0x1

    invoke-virtual {v0, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_24

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v1, v10, 0x1

    if-eqz v1, :cond_1c

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_19

    goto :goto_11

    :cond_19
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v1, p11, 0x4

    if-eqz v1, :cond_1a

    and-int/lit16 v3, v3, -0x381

    :cond_1a
    and-int/lit8 v1, p11, 0x8

    if-eqz v1, :cond_1b

    and-int/lit16 v3, v3, -0x1c01

    :cond_1b
    move-object/from16 v16, p1

    move-object v12, v7

    move v2, v15

    move-object v15, v11

    move-object/from16 v11, p0

    goto :goto_15

    :cond_1c
    :goto_11
    if-eqz p9, :cond_1d

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_12

    :cond_1d
    move-object/from16 v1, p0

    :goto_12
    const/4 v2, 0x0

    if-eqz v16, :cond_1e

    move-object/from16 v16, v2

    goto :goto_13

    :cond_1e
    move-object/from16 v16, p1

    :goto_13
    and-int/lit8 v17, p11, 0x4

    if-eqz v17, :cond_1f

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v5, v0, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->W0()J

    move-result-wide v5

    and-int/lit16 v3, v3, -0x381

    :cond_1f
    and-int/lit8 v17, p11, 0x8

    if-eqz v17, :cond_20

    sget-object v7, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v7}, Lkd1/w;->a()Lk91/a;

    move-result-object v7

    invoke-virtual {v7}, Lk91/a;->c()Lt0/i;

    move-result-object v7

    and-int/lit16 v3, v3, -0x1c01

    :cond_20
    if-eqz v8, :cond_21

    move-object v11, v2

    :cond_21
    if-eqz v12, :cond_22

    move-object v13, v2

    :cond_22
    if-eqz v14, :cond_23

    int-to-float v2, v4

    move-object v12, v7

    :goto_14
    move-object v15, v11

    move-object v11, v1

    goto :goto_15

    :cond_23
    move-object v12, v7

    move v2, v15

    goto :goto_14

    :goto_15
    invoke-virtual {v0}, Lp1/q;->r()V

    move-object v1, v13

    sget-wide v13, Li2/x;->m:J

    new-instance v4, Lrz0/b;

    move-object/from16 p5, v1

    move-object/from16 p0, v4

    move-wide/from16 p2, v5

    move-object/from16 p6, v9

    move-object/from16 p4, v12

    move-object/from16 p1, v16

    invoke-direct/range {p0 .. p6}, Lrz0/b;-><init>(Lrz0/f;JLt0/i;Lrz0/a;Lc93/m;)V

    move-object/from16 v7, p0

    move-object/from16 v1, p1

    move-object/from16 v4, p5

    const v8, -0x21358a9a

    invoke-static {v8, v0, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v17

    and-int/lit8 v7, v3, 0xe

    const v8, 0x180180

    or-int/2addr v7, v8

    shr-int/lit8 v8, v3, 0x6

    and-int/lit8 v8, v8, 0x70

    or-int/2addr v7, v8

    const v8, 0xe000

    and-int/2addr v8, v3

    or-int/2addr v7, v8

    shr-int/lit8 v3, v3, 0x3

    const/high16 v8, 0x70000

    and-int/2addr v3, v8

    or-int v19, v7, v3

    const/16 v20, 0x8

    move-object/from16 v18, v0

    move/from16 v16, v2

    invoke-static/range {v11 .. v20}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v1

    move-object v7, v4

    move-wide v3, v5

    move-object v1, v11

    move-object v5, v12

    move-object v6, v15

    move/from16 v8, v16

    goto :goto_16

    :cond_24
    move-object/from16 v18, v0

    invoke-virtual/range {v18 .. v18}, Lp1/q;->X()V

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide v3, v5

    move-object v5, v7

    move-object v6, v11

    move-object v7, v13

    move v8, v15

    :goto_16
    invoke-virtual/range {v18 .. v18}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_25

    new-instance v0, Lrz0/c;

    move-object/from16 v9, p8

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lrz0/c;-><init>(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_25
    return-void
.end method

.method private static final k(Lrz0/f;JLt0/i;Lrz0/a;Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p7, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p7, v3

    check-cast p6, Lp1/q;

    invoke-virtual {p6, p7, v0}, Lp1/q;->U(IZ)Z

    move-result p7

    if-eqz p7, :cond_4

    sget-object p7, Lb2/t;->w:Lb2/t;

    invoke-static {p7, p0, p1, p2, p3}, Lrz0/e;->m(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;)Landroidx/compose/ui/Modifier;

    move-result-object p7

    invoke-static {p7, p0, p3}, Lrz0/e;->s(Landroidx/compose/ui/Modifier;Lrz0/f;Lt0/i;)Landroidx/compose/ui/Modifier;

    move-result-object p7

    invoke-static {p7, p4, p1, p2}, Lrz0/e;->n(Landroidx/compose/ui/Modifier;Lrz0/a;J)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-static {p1, p0, p3}, Lrz0/e;->o(Landroidx/compose/ui/Modifier;Lrz0/f;Lt0/i;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object p1, Lb2/e;->w:Lb2/m;

    invoke-static {p1, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p1

    iget-wide p2, p6, Lp1/q;->T:J

    invoke-static {p2, p3}, Ljava/lang/Long;->hashCode(J)I

    move-result p2

    invoke-virtual {p6}, Lp1/q;->m()Lp1/p1;

    move-result-object p3

    invoke-static {p6, p0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object p4, La3/l;->a:La3/k;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p4, La3/k;->b:La3/j;

    invoke-virtual {p6}, Lp1/q;->i0()V

    iget-boolean p7, p6, Lp1/q;->S:Z

    if-eqz p7, :cond_1

    invoke-virtual {p6, p4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p6}, Lp1/q;->s0()V

    :goto_1
    sget-object p4, La3/k;->g:La3/i;

    invoke-static {p6, p4, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p1, La3/k;->f:La3/i;

    invoke-static {p6, p1, p3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p1, La3/k;->j:La3/i;

    iget-boolean p3, p6, Lp1/q;->S:Z

    if-nez p3, :cond_2

    invoke-virtual {p6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_3

    :cond_2
    invoke-static {p2, p6, p2, p1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p1, La3/k;->d:La3/i;

    invoke-static {p6, p1, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, p5, p6, v3}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {p6}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

    or-int/lit8 v0, p9, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v11

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v12, p10

    move-object/from16 v10, p11

    invoke-static/range {v1 .. v12}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;)Landroidx/compose/ui/Modifier;
    .locals 6

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lrz0/f;->getBackground()Li91/a;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v1, p1

    goto :goto_2

    :cond_1
    :goto_1
    invoke-static {p2, p3}, Li91/c;->o(J)Li91/a;

    move-result-object p1

    goto :goto_0

    :goto_2
    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v2, p4

    invoke-static/range {v0 .. v5}, Li91/c;->e(Landroidx/compose/ui/Modifier;Li91/a;Li2/a1;Ljava/lang/Float;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Landroidx/compose/ui/Modifier;Lrz0/a;J)Landroidx/compose/ui/Modifier;
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lrz0/a;->b()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, p2, p3}, Li2/x;->c(FJ)J

    move-result-wide p2

    invoke-virtual {p1}, Lrz0/a;->a()F

    move-result p1

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v0, p2, p3, p1}, Lrz0/e;->u(Landroidx/compose/ui/Modifier;FJF)Landroidx/compose/ui/Modifier;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p0, p1}, Lgb1/d;->f(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Landroidx/compose/ui/Modifier;Lrz0/f;Lt0/i;)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Loq1/c;

    const/16 v1, 0xd

    invoke-direct {v0, v1, p1, p2}, Loq1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Lrz0/f;Lt0/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string p4, "$this$composed"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const p4, -0x5e099e94

    invoke-virtual {p3, p4}, Lp1/q;->e0(I)V

    const/4 p4, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lrz0/f;->getLeadingAccentBrush()Lj91/b;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, p4

    :goto_0
    const/4 v0, 0x0

    if-nez p0, :cond_1

    const p0, -0x416c117e

    invoke-virtual {p3, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p3, v0}, Lp1/q;->q(Z)V

    move-object p0, p4

    goto :goto_1

    :cond_1
    const v1, -0x21c42a1

    invoke-virtual {p3, v1}, Lp1/q;->e0(I)V

    invoke-interface {p0, p3, v0}, Lj91/b;->a(Landroidx/compose/runtime/Composer;I)Li2/t;

    move-result-object p0

    invoke-virtual {p3, v0}, Lp1/q;->q(Z)V

    :goto_1
    if-nez p0, :cond_2

    const p0, -0x416b4bbf

    invoke-virtual {p3, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p3, v0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_2
    const p4, -0x416b4bbe

    invoke-virtual {p3, p4}, Lp1/q;->e0(I)V

    invoke-virtual {p3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p4, v1

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p4, :cond_3

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-ne v1, p4, :cond_4

    :cond_3
    new-instance v1, Lq11/c;

    const/16 p4, 0x17

    invoke-direct {v1, p4, p1, p0}, Lq11/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v1, Lkotlin/jvm/functions/Function1;

    sget-object p0, Lb2/t;->w:Lb2/t;

    invoke-static {p0, v1}, Landroidx/compose/ui/draw/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p4

    invoke-virtual {p3, v0}, Lp1/q;->q(Z)V

    :goto_2
    invoke-static {p2, p4}, Lgb1/d;->f(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-virtual {p3, v0}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final q(Lt0/i;Li2/t;Lf2/d;)Lf2/g;
    .locals 13

    const-string v0, "$this$drawWithCache"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lt0/a;->i()Lt0/b;

    move-result-object p0

    iget-object v0, p2, Lf2/d;->w:Lf2/b;

    invoke-interface {v0}, Lf2/b;->d()J

    move-result-wide v0

    invoke-interface {p0, v0, v1, p2}, Lt0/b;->a(JLy3/c;)F

    move-result p0

    sget v0, Lrz0/e;->a:F

    invoke-virtual {p2}, Lf2/d;->getDensity()F

    move-result v1

    mul-float v4, v1, v0

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Li2/j;->l(I)V

    iget-object v1, p2, Lf2/d;->w:Lf2/b;

    invoke-interface {v1}, Lf2/b;->d()J

    move-result-wide v1

    const/16 v3, 0x20

    shr-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    iget-object v1, p2, Lf2/d;->w:Lf2/b;

    invoke-interface {v1}, Lf2/b;->d()J

    move-result-wide v1

    const-wide v11, 0xffffffffL

    and-long/2addr v1, v11

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v10

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    shl-long/2addr v1, v3

    and-long/2addr v5, v11

    or-long/2addr v5, v1

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lj93/l0;->d(JFFFF)Lh2/d;

    move-result-object v1

    invoke-static {v0, v1}, Li2/s0;->b(Li2/s0;Lh2/d;)V

    iget-object v1, p2, Lf2/d;->w:Lf2/b;

    invoke-interface {v1}, Lf2/b;->d()J

    move-result-wide v1

    shr-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    iget-object v1, p2, Lf2/d;->w:Lf2/b;

    invoke-interface {v1}, Lf2/b;->d()J

    move-result-wide v1

    and-long/2addr v1, v11

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    sub-float v1, p0, v4

    const/4 v2, 0x0

    cmpg-float v5, v1, v2

    if-gez v5, :cond_0

    move v1, v2

    :cond_0
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v8, v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    shl-long/2addr v8, v3

    and-long/2addr v1, v11

    or-long v2, v8, v1

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lj93/l0;->d(JFFFF)Lh2/d;

    move-result-object v1

    invoke-static {v0, v1}, Li2/s0;->b(Li2/s0;Lh2/d;)V

    new-instance v1, Lh0/b4;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v0, p1, v2}, Lh0/b4;-><init>(FLjava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p2, v1}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final r(FLi2/s0;Li2/t;Lk2/c;)Ll83/a0;
    .locals 12

    const-string v1, "$this$onDrawWithContent"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p3

    check-cast v1, La3/p0;

    invoke-virtual {v1}, La3/p0;->a()V

    iget-object v1, v1, La3/p0;->w:Lk2/b;

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v2

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    iget-object v9, v1, Lk2/b;->x:La3/p;

    invoke-virtual {v9}, La3/p;->A()J

    move-result-wide v10

    invoke-virtual {v9}, La3/p;->w()Li2/v;

    move-result-object v1

    invoke-interface {v1}, Li2/v;->q()V

    :try_start_0
    iget-object v1, v9, La3/p;->x:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Laj/d;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x1

    move v6, p0

    invoke-virtual/range {v3 .. v8}, Laj/d;->d(FFFFI)V

    const/4 v4, 0x0

    const/16 v5, 0x3c

    const/4 v3, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v0, p3

    invoke-static/range {v0 .. v5}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v9, v10, v11}, Ld;->z(La3/p;J)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :catchall_0
    move-exception v0

    invoke-static {v9, v10, v11}, Ld;->z(La3/p;J)V

    throw v0
.end method

.method private static final s(Landroidx/compose/ui/Modifier;Lrz0/f;Lt0/i;)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Lbp0/h;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1, p2}, Lbp0/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final t(Lrz0/f;Lt0/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 3

    const-string p4, "$this$composed"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const p4, -0x60733c01

    invoke-virtual {p3, p4}, Lp1/q;->e0(I)V

    const/4 p4, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lrz0/f;->getBorderBrush()Lj91/b;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, p4

    :goto_0
    const/4 v0, 0x0

    if-nez p0, :cond_1

    const p0, -0x1f2e227

    invoke-virtual {p3, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p3, v0}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_1
    const p4, -0x1f2e226

    invoke-virtual {p3, p4}, Lp1/q;->e0(I)V

    const-wide/high16 v1, 0x3ff8000000000000L    # 1.5

    double-to-float p4, v1

    invoke-interface {p0, p3, v0}, Lj91/b;->a(Landroidx/compose/runtime/Composer;I)Li2/t;

    move-result-object p0

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {p4, v1, p0, p1}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p4

    invoke-virtual {p3, v0}, Lp1/q;->q(Z)V

    :goto_1
    invoke-static {p2, p4}, Lgb1/d;->f(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-virtual {p3, v0}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final u(Landroidx/compose/ui/Modifier;FJF)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Lrz0/d;

    invoke-direct {v0, p1, p2, p3, p4}, Lrz0/d;-><init>(FJF)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final v(JFFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 6

    const-string p6, "$this$composed"

    invoke-static {p4, p6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p5, Lp1/q;

    const p6, 0x992cdca

    invoke-virtual {p5, p6}, Lp1/q;->e0(I)V

    sget-object p6, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {p5, p6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Ly3/c;

    invoke-interface {p6, p2}, Ly3/c;->q0(F)F

    move-result v1

    invoke-interface {p6, p3}, Ly3/c;->q0(F)F

    move-result v2

    invoke-virtual {p5, v1}, Lp1/q;->d(F)Z

    move-result p2

    invoke-virtual {p5, v2}, Lp1/q;->d(F)Z

    move-result p3

    or-int/2addr p2, p3

    invoke-virtual {p5, p0, p1}, Lp1/q;->f(J)Z

    move-result p3

    or-int/2addr p2, p3

    invoke-virtual {p5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_0

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p3, p2, :cond_1

    :cond_0
    new-instance v0, Le61/l;

    const/16 v5, 0x8

    move-wide v3, p0

    invoke-direct/range {v0 .. v5}, Le61/l;-><init>(FFJI)V

    invoke-virtual {p5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object p3, v0

    :cond_1
    check-cast p3, Lkotlin/jvm/functions/Function1;

    sget-object p0, Lb2/t;->w:Lb2/t;

    invoke-static {p0, p3}, Landroidx/compose/ui/draw/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-interface {p4, p0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p5, p1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final w(FFJLf2/d;)Lf2/g;
    .locals 7

    const-string v0, "$this$drawWithCache"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Le61/l;

    const/16 v6, 0x9

    move v2, p0

    move v3, p1

    move-wide v4, p2

    invoke-direct/range {v1 .. v6}, Le61/l;-><init>(FFJI)V

    new-instance p0, La0/a1;

    const/16 p1, 0x15

    invoke-direct {p0, v1, p1}, La0/a1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p4, p0}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final x(FFJLk2/e;)Ll83/a0;
    .locals 13

    const-string v0, "$this$onDrawBehind"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lk2/i;

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    new-instance v7, Li2/k;

    new-instance v3, Landroid/graphics/DashPathEffect;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v7, v3}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/16 v8, 0xe

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v3, p0

    invoke-direct/range {v2 .. v8}, Lk2/i;-><init>(FFIILi2/t0;I)V

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v3, p0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    const/16 v0, 0x20

    shl-long/2addr v3, v0

    const-wide v5, 0xffffffffL

    and-long/2addr p0, v5

    or-long v8, v3, p0

    const/4 v11, 0x0

    const/16 v12, 0xe6

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    move-object v10, v2

    move-wide v2, p2

    invoke-static/range {v1 .. v12}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :array_0
    .array-data 4
        0x41200000    # 10.0f
        0x41200000    # 10.0f
    .end array-data
.end method
