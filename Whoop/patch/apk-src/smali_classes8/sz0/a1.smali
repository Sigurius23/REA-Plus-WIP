.class public abstract Lsz0/a1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0002\u0008\u000c\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a+\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\tH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001d\u00b2\u0006\u000c\u0010\u001c\u001a\u00020\u00118\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lsz0/b1;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "n",
        "(Lsz0/b1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "",
        "title",
        "Lgz0/m0;",
        "leadingIcon",
        "trailingIcon",
        "f",
        "(Ljava/lang/String;Lgz0/m0;Lgz0/m0;Landroidx/compose/runtime/Composer;I)V",
        "icon",
        "h",
        "(Lgz0/m0;Landroidx/compose/runtime/Composer;I)V",
        "",
        "progress",
        "l",
        "(FLandroidx/compose/runtime/Composer;I)V",
        "leadingSubtext",
        "trailingSubtext",
        "j",
        "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V",
        "a",
        "Lsz0/b1;",
        "previewViewState",
        "animatedProgress",
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
.field private static final a:Lsz0/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lsz0/b1;

    sget-object v5, Lgz0/m0;->NEW_ARRIVALS:Lgz0/m0;

    const/16 v8, 0x60

    const/4 v9, 0x0

    const-string v1, "SPEND $26 MORE TO GET FREE SHIPPING"

    const v2, 0x3f266666    # 0.65f

    const-string v3, "$0"

    const-string v4, "$75"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lsz0/b1;-><init>(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lsz0/a1;->a:Lsz0/b1;

    return-void
.end method

.method public static synthetic a(Lgz0/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsz0/a1;->i(Lgz0/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lsz0/b1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsz0/a1;->p(Lsz0/b1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;Lgz0/m0;Lgz0/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsz0/a1;->g(Ljava/lang/String;Lgz0/m0;Lgz0/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(FILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsz0/a1;->m(FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lsz0/a1;->k(Ljava/lang/String;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Ljava/lang/String;Lgz0/m0;Lgz0/m0;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v1, -0x2541097c

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_1
    move-object/from16 v1, p0

    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    const/4 v7, -0x1

    if-nez v6, :cond_4

    if-nez v2, :cond_2

    move v6, v7

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    :goto_2
    invoke-virtual {v0, v6}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_7

    if-nez v3, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    :goto_4
    invoke-virtual {v0, v7}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_5

    :cond_6
    const/16 v6, 0x80

    :goto_5
    or-int/2addr v5, v6

    :cond_7
    and-int/lit16 v6, v5, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v6, v7, :cond_8

    move v6, v8

    goto :goto_6

    :cond_8
    move v6, v9

    :goto_6
    and-int/lit8 v7, v5, 0x1

    invoke-virtual {v0, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_10

    if-eqz v2, :cond_9

    sget-object v6, Lb2/e;->K:Lb2/l;

    goto :goto_7

    :cond_9
    sget-object v6, Lb2/e;->L:Lb2/l;

    :goto_7
    sget-object v7, Ll0/m;->a:Ll0/e;

    invoke-static {v7, v6, v0, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v10, v0, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-eqz v14, :cond_a

    invoke-virtual {v0, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_a
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_8
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v0, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v0, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-nez v10, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    :cond_b
    invoke-static {v7, v0, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v0, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez v2, :cond_d

    const v6, -0x305695bb

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_d
    const v6, -0x305695ba

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    invoke-static {v2, v0, v9}, Lsz0/a1;->h(Lgz0/m0;Landroidx/compose/runtime/Composer;I)V

    const/16 v6, 0x8

    int-to-float v6, v6

    const/high16 v7, 0x3fc00000    # 1.5f

    invoke-static {v6, v7, v11, v0, v9}, Lih0/d0;->v(FFLb2/t;Lp1/q;Z)V

    :goto_9
    sget-object v6, Lx81/d;->a:Lx81/d;

    const/4 v7, 0x6

    invoke-virtual {v6, v0, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->L()Lb91/a;

    move-result-object v25

    invoke-virtual {v6, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->a()J

    move-result-wide v6

    const/high16 v10, 0x3f800000    # 1.0f

    float-to-double v11, v10

    const-wide/16 v13, 0x0

    cmpl-double v11, v11, v13

    if-lez v11, :cond_e

    :goto_a
    move-wide v11, v6

    goto :goto_b

    :cond_e
    const-string v11, "invalid weight; must be greater than zero"

    invoke-static {v11}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_a

    :goto_b
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v6, v10, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    and-int/lit8 v28, v5, 0xe

    const/16 v29, 0x0

    const v30, 0x2fff8

    move v5, v9

    const-wide/16 v9, 0x0

    move-wide/from16 v31, v11

    move v12, v8

    move-wide/from16 v7, v31

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const-wide/16 v14, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const-wide/16 v18, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v27, v26

    const/16 v26, 0x0

    move/from16 v31, v27

    move-object/from16 v27, v0

    move/from16 v0, v31

    move/from16 v31, v5

    move-object v5, v1

    move/from16 v1, v31

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    if-nez v3, :cond_f

    const v6, -0x3051873d

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_f
    const v6, -0x3051873c

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    invoke-static {v3, v5, v1}, Lsz0/a1;->h(Lgz0/m0;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_10
    move-object v5, v0

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_11

    new-instance v0, Ls01/e;

    const/16 v5, 0xe

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Ls01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final g(Ljava/lang/String;Lgz0/m0;Lgz0/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lsz0/a1;->f(Ljava/lang/String;Lgz0/m0;Lgz0/m0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lgz0/m0;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    move-object v5, p1

    check-cast v5, Lp1/q;

    const p1, -0x66390a62

    invoke-virtual {v5, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    const/4 v1, 0x4

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-virtual {v5, p1}, Lp1/q;->e(I)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 v2, p1, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v2, v0, :cond_2

    move v0, v4

    goto :goto_2

    :cond_2
    move v0, v3

    :goto_2
    and-int/2addr p1, v4

    invoke-virtual {v5, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lgz0/m0;->toWhoopIcon()I

    move-result p1

    invoke-static {p1, v5, v3}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    sget-object p1, Lx81/d;->a:Lx81/d;

    const/4 v2, 0x6

    invoke-virtual {p1, v5, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p1

    invoke-virtual {p1}, Ly81/i;->y()J

    move-result-wide v3

    int-to-float p1, v2

    int-to-float v1, v1

    mul-float/2addr p1, v1

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v1, 0x0

    const/16 v6, 0x1b0

    invoke-static/range {v0 .. v6}, Ll1/r1;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_3
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Lj50/b;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p2, v1}, Lj50/b;-><init>(Lgz0/m0;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final i(Lgz0/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lsz0/a1;->h(Lgz0/m0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    const v3, -0x3c103ee2

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    move/from16 v26, v3

    and-int/lit8 v3, v26, 0x13

    const/16 v4, 0x12

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v4, :cond_4

    move v3, v6

    goto :goto_3

    :cond_4
    move v3, v5

    :goto_3
    and-int/lit8 v4, v26, 0x1

    invoke-virtual {v2, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_9

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v7, Ll0/m;->a:Ll0/e;

    sget-object v8, Lb2/e;->J:Lb2/l;

    invoke-static {v7, v8, v2, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v7, v2, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v10, v2, Lp1/q;->S:Z

    if-eqz v10, :cond_5

    invoke-virtual {v2, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_4
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v2, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v2, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v2, Lp1/q;->S:Z

    if-nez v8, :cond_6

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    :cond_6
    invoke-static {v7, v2, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v2, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v3, v2, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->F()Lb91/a;

    move-result-object v20

    invoke-virtual {v3, v2, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v7

    float-to-double v9, v4

    const-wide/16 v11, 0x0

    cmpl-double v9, v9, v11

    if-lez v9, :cond_8

    goto :goto_5

    :cond_8
    const-string v9, "invalid weight; must be greater than zero"

    invoke-static {v9}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v1, v4, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    and-int/lit8 v23, v26, 0xe

    const/16 v24, 0x0

    const v25, 0x2fff8

    move v9, v5

    const-wide/16 v4, 0x0

    move v10, v6

    const/4 v6, 0x0

    move-object/from16 v22, v2

    move-wide/from16 v31, v7

    move-object v8, v3

    move-wide/from16 v2, v31

    const/4 v7, 0x0

    move-object v11, v8

    const/4 v8, 0x0

    move v13, v9

    move v12, v10

    const-wide/16 v9, 0x0

    move-object v14, v11

    const/4 v11, 0x0

    move v15, v12

    const/4 v12, 0x0

    move/from16 v17, v13

    move-object/from16 v16, v14

    const-wide/16 v13, 0x0

    move/from16 v18, v15

    const/4 v15, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move/from16 v27, v18

    const/16 v18, 0x0

    move-object/from16 v28, v19

    const/16 v19, 0x0

    move/from16 v29, v21

    const/16 v21, 0x0

    move-object/from16 v30, v28

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    move-object/from16 v14, v30

    const/4 v13, 0x6

    invoke-virtual {v14, v0, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->F()Lb91/a;

    move-result-object v20

    invoke-virtual {v14, v0, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v2

    shr-int/lit8 v1, v26, 0x3

    and-int/lit8 v23, v1, 0xe

    const v25, 0x2fffa

    const/4 v1, 0x0

    const-wide/16 v13, 0x0

    move-object/from16 v0, p1

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v22

    const/4 v12, 0x1

    invoke-virtual {v1, v12}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    move-object v0, v1

    move-object v1, v2

    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_a

    new-instance v2, Lbm2/b0;

    const/4 v3, 0x2

    move-object/from16 v4, p0

    move/from16 v5, p3

    invoke-direct {v2, v4, v0, v5, v3}, Lbm2/b0;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final k(Ljava/lang/String;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lsz0/a1;->j(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(FLandroidx/compose/runtime/Composer;I)V
    .locals 16

    move/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x581af45d

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->d(F)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v6, v3, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v6, v5, :cond_2

    move v6, v8

    goto :goto_2

    :cond_2
    move v6, v7

    :goto_2
    and-int/2addr v3, v8

    invoke-virtual {v2, v3, v6}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_6

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    int-to-float v10, v8

    int-to-float v4, v4

    mul-float/2addr v10, v4

    invoke-static {v10, v9}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    int-to-float v5, v5

    mul-float/2addr v5, v4

    invoke-static {v5}, Lt0/j;->e(F)Lt0/i;

    move-result-object v4

    invoke-static {v9, v4}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, Lx81/d;->a:Lx81/d;

    const/4 v10, 0x6

    invoke-virtual {v9, v2, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->a()J

    move-result-wide v11

    const/high16 v13, 0x3e800000    # 0.25f

    invoke-static {v13, v11, v12}, Li2/x;->c(FJ)J

    move-result-wide v11

    sget-object v13, Li2/w0;->a:Li2/v0;

    invoke-static {v4, v11, v12, v13}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v11, Lb2/e;->w:Lb2/m;

    invoke-static {v11, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v14, v2, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v2, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v8, v2, Lp1/q;->S:Z

    if-eqz v8, :cond_3

    invoke-virtual {v2, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v2, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v2, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v11, v2, Lp1/q;->S:Z

    if-nez v11, :cond_4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5

    :cond_4
    invoke-static {v12, v2, v12, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v2, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v5}, Lt0/j;->e(F)Lt0/i;

    move-result-object v4

    invoke-static {v3, v4}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v9, v2, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->a()J

    move-result-wide v4

    invoke-static {v3, v4, v5, v13}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3, v2, v7}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_7

    new-instance v3, Ldp0/b;

    const/4 v4, 0x6

    invoke-direct {v3, v0, v1, v4}, Ldp0/b;-><init>(FII)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final m(FILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lsz0/a1;->l(FLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final n(Lsz0/b1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 12

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p2

    check-cast v6, Lp1/q;

    const v0, -0x6814e5d6

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v6, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_4
    :goto_3
    and-int/lit8 v4, v0, 0x13

    const/16 v5, 0x12

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v4, v5, :cond_5

    move v4, v9

    goto :goto_4

    :cond_5
    move v4, v10

    :goto_4
    and-int/2addr v0, v9

    invoke-virtual {v6, v0, v4}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_d

    if-eqz v2, :cond_6

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_6
    move-object v0, p1

    :goto_5
    invoke-virtual {p0}, Lsz0/b1;->f()F

    move-result v2

    const/4 v3, 0x0

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v2, v3, v11}, Le93/b;->m(FFF)F

    move-result v2

    const/16 v7, 0xc00

    const/16 v8, 0x16

    const/4 v3, 0x0

    const-string v4, "shipping-progress-bar"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v2

    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v4, 0x8

    int-to-float v4, v4

    const/high16 v5, 0x3f400000    # 0.75f

    mul-float/2addr v4, v5

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v7, 0x6

    invoke-static {v4, v5, v6, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v11, v6, Lp1/q;->S:Z

    if-eqz v11, :cond_7

    invoke-virtual {v6, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_6
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v6, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v6, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-nez v7, :cond_8

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    :cond_8
    invoke-static {v5, v6, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v6, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lsz0/b1;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lsz0/b1;->c()Lgz0/m0;

    move-result-object v4

    invoke-virtual {p0}, Lsz0/b1;->b()Lgz0/m0;

    move-result-object v5

    invoke-static {v3, v4, v5, v6, v10}, Lsz0/a1;->f(Ljava/lang/String;Lgz0/m0;Lgz0/m0;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0}, Lsz0/b1;->a()Z

    move-result v3

    if-nez v3, :cond_a

    const v3, -0x9caa6a0

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-static {v2}, Lsz0/a1;->o(Lp1/t2;)F

    move-result v2

    invoke-static {v2, v6, v10}, Lsz0/a1;->l(FLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    const v2, -0x9c9aede

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {p0}, Lsz0/b1;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {p0}, Lsz0/b1;->h()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_8

    :cond_b
    const v2, -0x9c59c7e

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_c
    :goto_8
    const v2, -0x9c829ac

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lsz0/b1;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lsz0/b1;->h()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v6, v10}, Lsz0/a1;->j(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    move-object v2, v0

    goto :goto_a

    :cond_d
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v2, p1

    :goto_a
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Lsz0/z0;

    const/4 v5, 0x0

    move-object v1, p0

    move v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lsz0/z0;-><init>(Lsz0/b1;Landroidx/compose/ui/Modifier;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final o(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final p(Lsz0/b1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lsz0/a1;->n(Lsz0/b1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
