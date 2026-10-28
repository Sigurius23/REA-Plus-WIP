.class public abstract Lz81/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u001a)\u0010\u0005\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001aA\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000fH\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001aA\u0010\u0014\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000fH\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0013\u001aA\u0010\u0015\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000fH\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0013\u001a?\u0010\u0016\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000fH\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0013\"\u0017\u0010\u001b\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lkotlin/Function1;",
        "Lkd1/g;",
        "Lf0/t;",
        "Lz81/b;",
        "block",
        "r",
        "(Lkotlin/jvm/functions/Function1;)Lz81/b;",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "width",
        "Ly81/e;",
        "color",
        "Li2/t0;",
        "pathEffect",
        "Ly3/f;",
        "cornerRadius",
        "Ll83/a0;",
        "i",
        "(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FLandroidx/compose/runtime/Composer;II)V",
        "m",
        "k",
        "h",
        "a",
        "Lz81/b;",
        "q",
        "()Lz81/b;",
        "Borders",
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
.field private static final a:Lz81/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz1/k;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lz1/k;-><init>(I)V

    invoke-static {v0}, Lz81/d;->r(Lkotlin/jvm/functions/Function1;)Lz81/b;

    move-result-object v0

    sput-object v0, Lz81/d;->a:Lz81/b;

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lz81/d;->p(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkd1/g;)Lz81/b;
    .locals 0

    invoke-static {p0}, Lz81/d;->g(Lkd1/g;)Lz81/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lz81/d;->l(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lz81/d;->n(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(FLi2/t0;JJLk2/e;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lz81/d;->o(FLi2/t0;JJLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lz81/d;->j(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lkd1/g;)Lz81/b;
    .locals 11

    const-string v0, "$this$whoopBorders"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lz81/b;

    const-wide/high16 v2, 0x4004000000000000L    # 2.5

    double-to-float v0, v2

    const v2, 0x4dffffff    # 5.3687088E8f

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v3

    invoke-static {v0, v3, v4}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v6

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v7, "1 dp border"

    const/4 v8, 0x0

    move-object v5, p0

    invoke-static/range {v5 .. v10}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, v5

    check-cast p0, Lf0/t;

    const/4 v0, 0x3

    int-to-float v0, v0

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v4

    invoke-static {v0, v4, v5}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v4

    const/4 v7, 0x4

    const-string v5, "2 dp border"

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/t;

    const-wide/high16 v4, 0x400a000000000000L    # 3.25

    double-to-float v4, v4

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v5

    invoke-static {v4, v5, v6}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v4

    const-string v5, "2.5 dp border"

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Lf0/t;

    const/4 v4, 0x5

    int-to-float v4, v4

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v5

    invoke-static {v4, v5, v6}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v4

    const-string v5, "5 dp border"

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Lf0/t;

    const/4 v4, 0x7

    int-to-float v4, v4

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v5

    invoke-static {v4, v5, v6}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v4

    const-string v5, "7 dp border"

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lf0/t;

    invoke-virtual {v3}, Lkd1/g;->c()Ljava/util/List;

    move-result-object v7

    move-object v2, p0

    move-object v3, v0

    move-object v4, v9

    move-object v5, v10

    invoke-direct/range {v1 .. v7}, Lz81/b;-><init>(Lf0/t;Lf0/t;Lf0/t;Lf0/t;Lf0/t;Ljava/util/List;)V

    return-object v1
.end method

.method private static final h(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FLandroidx/compose/runtime/Composer;II)V
    .locals 22

    move-object/from16 v0, p2

    move/from16 v6, p6

    move-object/from16 v1, p5

    check-cast v1, Lp1/q;

    const v2, 0x305bd855

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p7, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v6, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v6, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v6

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v6

    :goto_1
    and-int/lit8 v5, v6, 0x30

    const/16 v7, 0x20

    move/from16 v9, p1

    if-nez v5, :cond_4

    invoke-virtual {v1, v9}, Lp1/q;->d(F)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v7

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_4
    and-int/lit16 v5, v6, 0x180

    if-nez v5, :cond_7

    and-int/lit8 v5, p7, 0x4

    if-nez v5, :cond_6

    and-int/lit16 v5, v6, 0x200

    if-nez v5, :cond_5

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_3

    :cond_5
    invoke-virtual {v1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_3
    if-eqz v5, :cond_6

    const/16 v5, 0x100

    goto :goto_4

    :cond_6
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v4, v5

    :cond_7
    and-int/lit16 v5, v6, 0xc00

    if-nez v5, :cond_a

    and-int/lit8 v5, p7, 0x8

    if-nez v5, :cond_8

    move-object/from16 v5, p3

    invoke-virtual {v1, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x800

    goto :goto_5

    :cond_8
    move-object/from16 v5, p3

    :cond_9
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v4, v8

    goto :goto_6

    :cond_a
    move-object/from16 v5, p3

    :goto_6
    and-int/lit16 v8, v6, 0x6000

    if-nez v8, :cond_d

    and-int/lit8 v8, p7, 0x10

    if-nez v8, :cond_b

    move/from16 v8, p4

    invoke-virtual {v1, v8}, Lp1/q;->d(F)Z

    move-result v10

    if-eqz v10, :cond_c

    const/16 v10, 0x4000

    goto :goto_7

    :cond_b
    move/from16 v8, p4

    :cond_c
    const/16 v10, 0x2000

    :goto_7
    or-int/2addr v4, v10

    goto :goto_8

    :cond_d
    move/from16 v8, p4

    :goto_8
    and-int/lit16 v10, v4, 0x2493

    const/16 v11, 0x2492

    if-eq v10, v11, :cond_e

    const/4 v10, 0x1

    goto :goto_9

    :cond_e
    const/4 v10, 0x0

    :goto_9
    and-int/lit8 v11, v4, 0x1

    invoke-virtual {v1, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_1b

    invoke-virtual {v1}, Lp1/q;->Z()V

    and-int/lit8 v10, v6, 0x1

    const v11, -0xe001

    if-eqz v10, :cond_13

    invoke-virtual {v1}, Lp1/q;->C()Z

    move-result v10

    if-eqz v10, :cond_f

    goto :goto_b

    :cond_f
    invoke-virtual {v1}, Lp1/q;->X()V

    and-int/lit8 v2, p7, 0x4

    if-eqz v2, :cond_10

    and-int/lit16 v4, v4, -0x381

    :cond_10
    and-int/lit8 v2, p7, 0x8

    if-eqz v2, :cond_11

    and-int/lit16 v4, v4, -0x1c01

    :cond_11
    and-int/lit8 v2, p7, 0x10

    if-eqz v2, :cond_12

    and-int/2addr v4, v11

    :cond_12
    move-object v2, v3

    move-object v10, v5

    :goto_a
    move v5, v8

    goto :goto_e

    :cond_13
    :goto_b
    if-eqz v2, :cond_14

    sget-object v2, Lb2/t;->w:Lb2/t;

    goto :goto_c

    :cond_14
    move-object v2, v3

    :goto_c
    and-int/lit8 v3, p7, 0x4

    if-eqz v3, :cond_15

    sget-object v0, Lz81/a;->a:Lz81/a;

    invoke-virtual {v0}, Lz81/a;->a()Ly81/e;

    move-result-object v0

    and-int/lit16 v4, v4, -0x381

    :cond_15
    and-int/lit8 v3, p7, 0x8

    if-eqz v3, :cond_16

    sget-object v3, Lz81/a;->a:Lz81/a;

    invoke-virtual {v3}, Lz81/a;->c()Li2/t0;

    move-result-object v3

    and-int/lit16 v4, v4, -0x1c01

    goto :goto_d

    :cond_16
    move-object v3, v5

    :goto_d
    and-int/lit8 v5, p7, 0x10

    if-eqz v5, :cond_17

    sget-object v5, Lz81/a;->a:Lz81/a;

    invoke-virtual {v5}, Lz81/a;->b()F

    move-result v5

    and-int/2addr v4, v11

    move-object v10, v3

    goto :goto_e

    :cond_17
    move-object v10, v3

    goto :goto_a

    :goto_e
    invoke-virtual {v1}, Lp1/q;->r()V

    shr-int/lit8 v3, v4, 0x6

    and-int/lit8 v3, v3, 0xe

    invoke-interface {v0, v1, v3}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v14

    sget-object v3, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v1, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/c;

    invoke-interface {v3, v5}, Ly3/c;->q0(F)F

    move-result v8

    invoke-interface {v3, v5}, Ly3/c;->q0(F)F

    move-result v3

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v12, v8

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    move-wide/from16 p2, v12

    int-to-long v11, v3

    shl-long v16, p2, v7

    const-wide v18, 0xffffffffL

    and-long v11, v11, v18

    or-long v11, v16, v11

    and-int/lit8 v3, v4, 0x70

    if-ne v3, v7, :cond_18

    const/4 v3, 0x1

    goto :goto_f

    :cond_18
    const/4 v3, 0x0

    :goto_f
    invoke-virtual {v1, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v3, v7

    invoke-virtual {v1, v14, v15}, Lp1/q;->f(J)Z

    move-result v7

    or-int/2addr v3, v7

    invoke-virtual {v1, v11, v12}, Lp1/q;->f(J)Z

    move-result v7

    or-int/2addr v3, v7

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_19

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v7, v3, :cond_1a

    :cond_19
    new-instance v8, Lg1/t4;

    move-wide/from16 v20, v14

    move-wide v13, v11

    move-wide/from16 v11, v20

    invoke-direct/range {v8 .. v14}, Lg1/t4;-><init>(FLi2/t0;JJ)V

    invoke-virtual {v1, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v7, v8

    :cond_1a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v3, v4, 0xe

    invoke-static {v2, v7, v1, v3}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object v4, v10

    :goto_10
    move-object v3, v0

    goto :goto_11

    :cond_1b
    invoke-virtual {v1}, Lp1/q;->X()V

    move-object v2, v3

    move-object v4, v5

    move v5, v8

    goto :goto_10

    :goto_11
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_1c

    new-instance v0, Lz81/c;

    const/4 v8, 0x1

    move/from16 v7, p7

    move-object v1, v2

    move/from16 v2, p1

    invoke-direct/range {v0 .. v8}, Lz81/c;-><init>(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIII)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method public static final i(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FLandroidx/compose/runtime/Composer;II)V
    .locals 15

    move-object/from16 v0, p2

    move/from16 v6, p6

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v1, 0x5b81c4d8

    invoke-virtual {v12, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p7, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v6, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v6, 0x6

    if-nez v2, :cond_2

    invoke-virtual {v12, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v6

    goto :goto_1

    :cond_2
    move v2, v6

    :goto_1
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move/from16 v4, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_3

    move/from16 v4, p1

    invoke-virtual {v12, v4}, Lp1/q;->d(F)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_2

    :cond_5
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :goto_3
    and-int/lit16 v5, v6, 0x180

    if-nez v5, :cond_8

    and-int/lit8 v5, p7, 0x4

    if-nez v5, :cond_7

    and-int/lit16 v5, v6, 0x200

    if-nez v5, :cond_6

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_4

    :cond_6
    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_4
    if-eqz v5, :cond_7

    const/16 v5, 0x100

    goto :goto_5

    :cond_7
    const/16 v5, 0x80

    :goto_5
    or-int/2addr v2, v5

    :cond_8
    and-int/lit16 v5, v6, 0xc00

    if-nez v5, :cond_b

    and-int/lit8 v5, p7, 0x8

    if-nez v5, :cond_9

    move-object/from16 v5, p3

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x800

    goto :goto_6

    :cond_9
    move-object/from16 v5, p3

    :cond_a
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v2, v7

    goto :goto_7

    :cond_b
    move-object/from16 v5, p3

    :goto_7
    and-int/lit16 v7, v6, 0x6000

    if-nez v7, :cond_e

    and-int/lit8 v7, p7, 0x10

    if-nez v7, :cond_c

    move/from16 v7, p4

    invoke-virtual {v12, v7}, Lp1/q;->d(F)Z

    move-result v8

    if-eqz v8, :cond_d

    const/16 v8, 0x4000

    goto :goto_8

    :cond_c
    move/from16 v7, p4

    :cond_d
    const/16 v8, 0x2000

    :goto_8
    or-int/2addr v2, v8

    goto :goto_9

    :cond_e
    move/from16 v7, p4

    :goto_9
    and-int/lit16 v8, v2, 0x2493

    const/16 v9, 0x2492

    if-eq v8, v9, :cond_f

    const/4 v8, 0x1

    goto :goto_a

    :cond_f
    const/4 v8, 0x0

    :goto_a
    and-int/lit8 v9, v2, 0x1

    invoke-virtual {v12, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_1a

    invoke-virtual {v12}, Lp1/q;->Z()V

    and-int/lit8 v8, v6, 0x1

    const v9, -0xe001

    if-eqz v8, :cond_14

    invoke-virtual {v12}, Lp1/q;->C()Z

    move-result v8

    if-eqz v8, :cond_10

    goto :goto_c

    :cond_10
    invoke-virtual {v12}, Lp1/q;->X()V

    and-int/lit8 v1, p7, 0x4

    if-eqz v1, :cond_11

    and-int/lit16 v2, v2, -0x381

    :cond_11
    and-int/lit8 v1, p7, 0x8

    if-eqz v1, :cond_12

    and-int/lit16 v2, v2, -0x1c01

    :cond_12
    and-int/lit8 v1, p7, 0x10

    if-eqz v1, :cond_13

    and-int/2addr v2, v9

    :cond_13
    move-object v9, v0

    move v8, v4

    move-object v10, v5

    :goto_b
    move v11, v7

    move-object v7, p0

    goto :goto_f

    :cond_14
    :goto_c
    if-eqz v1, :cond_15

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_15
    if-eqz v3, :cond_16

    const/high16 v1, 0x40200000    # 2.5f

    goto :goto_d

    :cond_16
    move v1, v4

    :goto_d
    and-int/lit8 v3, p7, 0x4

    if-eqz v3, :cond_17

    sget-object v0, Lz81/a;->a:Lz81/a;

    invoke-virtual {v0}, Lz81/a;->a()Ly81/e;

    move-result-object v0

    and-int/lit16 v2, v2, -0x381

    :cond_17
    and-int/lit8 v3, p7, 0x8

    if-eqz v3, :cond_18

    sget-object v3, Lz81/a;->a:Lz81/a;

    invoke-virtual {v3}, Lz81/a;->c()Li2/t0;

    move-result-object v3

    and-int/lit16 v2, v2, -0x1c01

    goto :goto_e

    :cond_18
    move-object v3, v5

    :goto_e
    and-int/lit8 v4, p7, 0x10

    if-eqz v4, :cond_19

    sget-object v4, Lz81/a;->a:Lz81/a;

    invoke-virtual {v4}, Lz81/a;->b()F

    move-result v4

    and-int/2addr v2, v9

    move-object v7, p0

    move-object v9, v0

    move v8, v1

    move-object v10, v3

    move v11, v4

    goto :goto_f

    :cond_19
    move-object v9, v0

    move v8, v1

    move-object v10, v3

    goto :goto_b

    :goto_f
    invoke-virtual {v12}, Lp1/q;->r()V

    const p0, 0xfffe

    and-int v13, v2, p0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v14}, Lz81/d;->h(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FLandroidx/compose/runtime/Composer;II)V

    move-object v1, v7

    move v2, v8

    move-object v3, v9

    move-object v4, v10

    move v5, v11

    goto :goto_10

    :cond_1a
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v1, p0

    move-object v3, v0

    move v2, v4

    move-object v4, v5

    move v5, v7

    :goto_10
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_1b

    new-instance v0, Lz81/c;

    const/4 v8, 0x0

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lz81/c;-><init>(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIII)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final j(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lz81/d;->i(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FLandroidx/compose/runtime/Composer;II)V
    .locals 15

    move-object/from16 v0, p2

    move/from16 v6, p6

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v1, -0x783aa32b

    invoke-virtual {v12, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p7, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v6, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v6, 0x6

    if-nez v2, :cond_2

    invoke-virtual {v12, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v6

    goto :goto_1

    :cond_2
    move v2, v6

    :goto_1
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move/from16 v4, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_3

    move/from16 v4, p1

    invoke-virtual {v12, v4}, Lp1/q;->d(F)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_2

    :cond_5
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :goto_3
    and-int/lit16 v5, v6, 0x180

    if-nez v5, :cond_8

    and-int/lit8 v5, p7, 0x4

    if-nez v5, :cond_7

    and-int/lit16 v5, v6, 0x200

    if-nez v5, :cond_6

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_4

    :cond_6
    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_4
    if-eqz v5, :cond_7

    const/16 v5, 0x100

    goto :goto_5

    :cond_7
    const/16 v5, 0x80

    :goto_5
    or-int/2addr v2, v5

    :cond_8
    and-int/lit16 v5, v6, 0xc00

    if-nez v5, :cond_b

    and-int/lit8 v5, p7, 0x8

    if-nez v5, :cond_9

    move-object/from16 v5, p3

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x800

    goto :goto_6

    :cond_9
    move-object/from16 v5, p3

    :cond_a
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v2, v7

    goto :goto_7

    :cond_b
    move-object/from16 v5, p3

    :goto_7
    and-int/lit16 v7, v6, 0x6000

    if-nez v7, :cond_e

    and-int/lit8 v7, p7, 0x10

    if-nez v7, :cond_c

    move/from16 v7, p4

    invoke-virtual {v12, v7}, Lp1/q;->d(F)Z

    move-result v8

    if-eqz v8, :cond_d

    const/16 v8, 0x4000

    goto :goto_8

    :cond_c
    move/from16 v7, p4

    :cond_d
    const/16 v8, 0x2000

    :goto_8
    or-int/2addr v2, v8

    goto :goto_9

    :cond_e
    move/from16 v7, p4

    :goto_9
    and-int/lit16 v8, v2, 0x2493

    const/16 v9, 0x2492

    if-eq v8, v9, :cond_f

    const/4 v8, 0x1

    goto :goto_a

    :cond_f
    const/4 v8, 0x0

    :goto_a
    and-int/lit8 v9, v2, 0x1

    invoke-virtual {v12, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_1a

    invoke-virtual {v12}, Lp1/q;->Z()V

    and-int/lit8 v8, v6, 0x1

    const v9, -0xe001

    if-eqz v8, :cond_14

    invoke-virtual {v12}, Lp1/q;->C()Z

    move-result v8

    if-eqz v8, :cond_10

    goto :goto_c

    :cond_10
    invoke-virtual {v12}, Lp1/q;->X()V

    and-int/lit8 v1, p7, 0x4

    if-eqz v1, :cond_11

    and-int/lit16 v2, v2, -0x381

    :cond_11
    and-int/lit8 v1, p7, 0x8

    if-eqz v1, :cond_12

    and-int/lit16 v2, v2, -0x1c01

    :cond_12
    and-int/lit8 v1, p7, 0x10

    if-eqz v1, :cond_13

    and-int/2addr v2, v9

    :cond_13
    move-object v9, v0

    move v8, v4

    move-object v10, v5

    :goto_b
    move v11, v7

    move-object v7, p0

    goto :goto_f

    :cond_14
    :goto_c
    if-eqz v1, :cond_15

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_15
    if-eqz v3, :cond_16

    const/high16 v1, 0x40500000    # 3.25f

    goto :goto_d

    :cond_16
    move v1, v4

    :goto_d
    and-int/lit8 v3, p7, 0x4

    if-eqz v3, :cond_17

    sget-object v0, Lz81/a;->a:Lz81/a;

    invoke-virtual {v0}, Lz81/a;->a()Ly81/e;

    move-result-object v0

    and-int/lit16 v2, v2, -0x381

    :cond_17
    and-int/lit8 v3, p7, 0x8

    if-eqz v3, :cond_18

    sget-object v3, Lz81/a;->a:Lz81/a;

    invoke-virtual {v3}, Lz81/a;->c()Li2/t0;

    move-result-object v3

    and-int/lit16 v2, v2, -0x1c01

    goto :goto_e

    :cond_18
    move-object v3, v5

    :goto_e
    and-int/lit8 v4, p7, 0x10

    if-eqz v4, :cond_19

    sget-object v4, Lz81/a;->a:Lz81/a;

    invoke-virtual {v4}, Lz81/a;->b()F

    move-result v4

    and-int/2addr v2, v9

    move-object v7, p0

    move-object v9, v0

    move v8, v1

    move-object v10, v3

    move v11, v4

    goto :goto_f

    :cond_19
    move-object v9, v0

    move v8, v1

    move-object v10, v3

    goto :goto_b

    :goto_f
    invoke-virtual {v12}, Lp1/q;->r()V

    const p0, 0xfffe

    and-int v13, v2, p0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v14}, Lz81/d;->h(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FLandroidx/compose/runtime/Composer;II)V

    move-object v1, v7

    move v2, v8

    move-object v3, v9

    move-object v4, v10

    move v5, v11

    goto :goto_10

    :cond_1a
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v1, p0

    move-object v3, v0

    move v2, v4

    move-object v4, v5

    move v5, v7

    :goto_10
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_1b

    new-instance v0, Lz81/c;

    const/4 v8, 0x3

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lz81/c;-><init>(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIII)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final l(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lz81/d;->k(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final m(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FLandroidx/compose/runtime/Composer;II)V
    .locals 15

    move-object/from16 v0, p2

    move/from16 v6, p6

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v1, 0x3c8dff59

    invoke-virtual {v12, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p7, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v6, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v6, 0x6

    if-nez v2, :cond_2

    invoke-virtual {v12, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v6

    goto :goto_1

    :cond_2
    move v2, v6

    :goto_1
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move/from16 v4, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_3

    move/from16 v4, p1

    invoke-virtual {v12, v4}, Lp1/q;->d(F)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_2

    :cond_5
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :goto_3
    and-int/lit16 v5, v6, 0x180

    if-nez v5, :cond_8

    and-int/lit8 v5, p7, 0x4

    if-nez v5, :cond_7

    and-int/lit16 v5, v6, 0x200

    if-nez v5, :cond_6

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_4

    :cond_6
    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_4
    if-eqz v5, :cond_7

    const/16 v5, 0x100

    goto :goto_5

    :cond_7
    const/16 v5, 0x80

    :goto_5
    or-int/2addr v2, v5

    :cond_8
    and-int/lit16 v5, v6, 0xc00

    if-nez v5, :cond_b

    and-int/lit8 v5, p7, 0x8

    if-nez v5, :cond_9

    move-object/from16 v5, p3

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x800

    goto :goto_6

    :cond_9
    move-object/from16 v5, p3

    :cond_a
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v2, v7

    goto :goto_7

    :cond_b
    move-object/from16 v5, p3

    :goto_7
    and-int/lit16 v7, v6, 0x6000

    if-nez v7, :cond_e

    and-int/lit8 v7, p7, 0x10

    if-nez v7, :cond_c

    move/from16 v7, p4

    invoke-virtual {v12, v7}, Lp1/q;->d(F)Z

    move-result v8

    if-eqz v8, :cond_d

    const/16 v8, 0x4000

    goto :goto_8

    :cond_c
    move/from16 v7, p4

    :cond_d
    const/16 v8, 0x2000

    :goto_8
    or-int/2addr v2, v8

    goto :goto_9

    :cond_e
    move/from16 v7, p4

    :goto_9
    and-int/lit16 v8, v2, 0x2493

    const/16 v9, 0x2492

    if-eq v8, v9, :cond_f

    const/4 v8, 0x1

    goto :goto_a

    :cond_f
    const/4 v8, 0x0

    :goto_a
    and-int/lit8 v9, v2, 0x1

    invoke-virtual {v12, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_1a

    invoke-virtual {v12}, Lp1/q;->Z()V

    and-int/lit8 v8, v6, 0x1

    const v9, -0xe001

    if-eqz v8, :cond_14

    invoke-virtual {v12}, Lp1/q;->C()Z

    move-result v8

    if-eqz v8, :cond_10

    goto :goto_c

    :cond_10
    invoke-virtual {v12}, Lp1/q;->X()V

    and-int/lit8 v1, p7, 0x4

    if-eqz v1, :cond_11

    and-int/lit16 v2, v2, -0x381

    :cond_11
    and-int/lit8 v1, p7, 0x8

    if-eqz v1, :cond_12

    and-int/lit16 v2, v2, -0x1c01

    :cond_12
    and-int/lit8 v1, p7, 0x10

    if-eqz v1, :cond_13

    and-int/2addr v2, v9

    :cond_13
    move-object v9, v0

    move v8, v4

    move-object v10, v5

    :goto_b
    move v11, v7

    move-object v7, p0

    goto :goto_f

    :cond_14
    :goto_c
    if-eqz v1, :cond_15

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_15
    if-eqz v3, :cond_16

    const/high16 v1, 0x40400000    # 3.0f

    goto :goto_d

    :cond_16
    move v1, v4

    :goto_d
    and-int/lit8 v3, p7, 0x4

    if-eqz v3, :cond_17

    sget-object v0, Lz81/a;->a:Lz81/a;

    invoke-virtual {v0}, Lz81/a;->a()Ly81/e;

    move-result-object v0

    and-int/lit16 v2, v2, -0x381

    :cond_17
    and-int/lit8 v3, p7, 0x8

    if-eqz v3, :cond_18

    sget-object v3, Lz81/a;->a:Lz81/a;

    invoke-virtual {v3}, Lz81/a;->c()Li2/t0;

    move-result-object v3

    and-int/lit16 v2, v2, -0x1c01

    goto :goto_e

    :cond_18
    move-object v3, v5

    :goto_e
    and-int/lit8 v4, p7, 0x10

    if-eqz v4, :cond_19

    sget-object v4, Lz81/a;->a:Lz81/a;

    invoke-virtual {v4}, Lz81/a;->b()F

    move-result v4

    and-int/2addr v2, v9

    move-object v7, p0

    move-object v9, v0

    move v8, v1

    move-object v10, v3

    move v11, v4

    goto :goto_f

    :cond_19
    move-object v9, v0

    move v8, v1

    move-object v10, v3

    goto :goto_b

    :goto_f
    invoke-virtual {v12}, Lp1/q;->r()V

    const p0, 0xfffe

    and-int v13, v2, p0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v14}, Lz81/d;->h(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FLandroidx/compose/runtime/Composer;II)V

    move-object v1, v7

    move v2, v8

    move-object v3, v9

    move-object v4, v10

    move v5, v11

    goto :goto_10

    :cond_1a
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v1, p0

    move-object v3, v0

    move v2, v4

    move-object v4, v5

    move v5, v7

    :goto_10
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_1b

    new-instance v0, Lz81/c;

    const/4 v8, 0x2

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lz81/c;-><init>(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIII)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final n(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lz81/d;->m(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(FLi2/t0;JJLk2/e;)Ll83/a0;
    .locals 13

    const-string v0, "$this$Canvas"

    move-object/from16 v1, p6

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Lk2/i;

    const/4 v6, 0x0

    const/16 v8, 0xe

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v3, p0

    move-object v7, p1

    move-object v2, v10

    invoke-direct/range {v2 .. v8}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/4 v11, 0x0

    const/16 v12, 0xe6

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    move-wide v2, p2

    move-wide/from16 v8, p4

    invoke-static/range {v1 .. v12}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lz81/d;->h(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final q()Lz81/b;
    .locals 1

    sget-object v0, Lz81/d;->a:Lz81/b;

    return-object v0
.end method

.method public static final r(Lkotlin/jvm/functions/Function1;)Lz81/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lz81/b;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkd1/g;

    invoke-direct {v0}, Lkd1/g;-><init>()V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lz81/b;

    return-object p0
.end method
