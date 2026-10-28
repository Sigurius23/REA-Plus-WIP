.class public abstract Lf01/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a!\u0010\n\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a!\u0010\u000c\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\u000b\u001a#\u0010\u000f\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u001f\u0010\u0014\u001a\u00020\u00062\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a)\u0010\u001c\u001a\u00020\u0006*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u001a\u000f\u0010\u001e\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\"\u0017\u0010)\u001a\u00020$8\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(\u00a8\u0006*"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lf01/o0;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "q",
        "(Landroidx/compose/ui/Modifier;Lf01/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "l",
        "(Landroidx/compose/ui/Modifier;Lf01/o0;Landroidx/compose/runtime/Composer;II)V",
        "A",
        "Lf01/p0;",
        "footer",
        "n",
        "(Landroidx/compose/ui/Modifier;Lf01/p0;Landroidx/compose/runtime/Composer;II)V",
        "",
        "Lm91/u;",
        "subItems",
        "y",
        "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V",
        "Lk2/e;",
        "Li2/x;",
        "color",
        "Ly3/f;",
        "width",
        "height",
        "C",
        "(Lk2/e;JFF)V",
        "w",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "a",
        "F",
        "rightContentWeightPercent",
        "Lh2/c;",
        "b",
        "Lh2/c;",
        "D",
        "()Lh2/c;",
        "graphDescriptionCardInset",
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
.field private static final a:F = 0.6f

.field private static final b:Lh2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lh2/c;

    const v1, 0x3d23d70a    # 0.04f

    const v2, 0x3ca3d70a    # 0.02f

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2, v1}, Lh2/c;-><init>(FFFF)V

    sput-object v0, Lf01/n0;->b:Lh2/c;

    return-void
.end method

.method private static final A(Landroidx/compose/ui/Modifier;Lf01/o0;Landroidx/compose/runtime/Composer;II)V
    .locals 36

    move-object/from16 v4, p2

    check-cast v4, Lp1/q;

    const v0, 0x4f60e9f3    # 3.7734285E9f

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v2, p3, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v3, v1

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move/from16 v3, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_4

    move-object/from16 v5, p1

    invoke-virtual {v4, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    goto :goto_3

    :cond_4
    move-object/from16 v5, p1

    :goto_3
    and-int/lit8 v6, v3, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_5

    move v6, v9

    goto :goto_4

    :cond_5
    move v6, v8

    :goto_4
    and-int/2addr v3, v9

    invoke-virtual {v4, v3, v6}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_d

    sget-object v26, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_6

    move-object/from16 v0, v26

    goto :goto_5

    :cond_6
    move-object v0, v2

    :goto_5
    sget-object v2, Lb2/e;->K:Lb2/l;

    sget-object v3, Ll0/m;->a:Ll0/e;

    const/16 v6, 0x30

    invoke-static {v3, v2, v4, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v6, v4, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_7

    invoke-virtual {v4, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_6
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v4, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v4, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-nez v6, :cond_8

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    :cond_8
    invoke-static {v3, v4, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v4, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    float-to-double v6, v2

    const-wide/16 v10, 0x0

    cmpl-double v3, v6, v10

    if-lez v3, :cond_a

    :goto_7
    move v3, v1

    goto :goto_8

    :cond_a
    const-string v3, "invalid weight; must be greater than zero"

    invoke-static {v3}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_7

    :goto_8
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v1, v2, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual {v5}, Lf01/o0;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v4, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v6, Lx81/d;->a:Lx81/d;

    const/4 v7, 0x6

    invoke-virtual {v6, v4, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v6, v4, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->L()Lb91/a;

    move-result-object v20

    const/16 v24, 0x0

    const v25, 0x2fff8

    move-object/from16 v22, v4

    const-wide/16 v4, 0x0

    move-object v12, v6

    const/4 v6, 0x0

    move v13, v7

    const/4 v7, 0x0

    move v14, v8

    const/4 v8, 0x0

    move v15, v3

    move/from16 v16, v9

    move-wide/from16 v34, v10

    move-object v11, v0

    move-object v0, v2

    move-wide/from16 v2, v34

    const-wide/16 v9, 0x0

    move-object/from16 v17, v11

    const/4 v11, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    move/from16 v19, v13

    move/from16 v21, v14

    const-wide/16 v13, 0x0

    move/from16 v23, v15

    const/4 v15, 0x0

    move/from16 v27, v16

    const/16 v16, 0x0

    move-object/from16 v28, v17

    const/16 v17, 0x0

    move-object/from16 v29, v18

    const/16 v18, 0x0

    move/from16 v30, v19

    const/16 v19, 0x0

    move/from16 v31, v21

    const/16 v21, 0x0

    move/from16 v32, v23

    const/16 v23, 0x0

    move-object/from16 v33, v29

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v22

    invoke-virtual/range {p1 .. p1}, Lf01/o0;->j()Lm91/u;

    move-result-object v0

    if-nez v0, :cond_b

    const v0, 0x39034019

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    const/4 v8, 0x0

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_b
    const/4 v8, 0x0

    const v1, 0x3903401a

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual/range {p1 .. p1}, Lf01/o0;->g()Lgz0/m0;

    move-result-object v0

    if-nez v0, :cond_c

    const v0, 0x390491d4

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    const/4 v9, 0x1

    goto :goto_a

    :cond_c
    const v1, 0x390491d5

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    const/4 v9, 0x1

    int-to-float v1, v9

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float v11, v1, v2

    const/4 v14, 0x0

    const/16 v15, 0xe

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v10, v26

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v15, 0x4

    int-to-float v2, v15

    mul-float/2addr v2, v2

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {v2, v1}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v13, 0x6

    invoke-static {v0, v4, v13}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    move-object/from16 v12, v33

    invoke-virtual {v12, v4, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v5

    move-object/from16 v22, v4

    move-wide v3, v5

    const/16 v6, 0x1b0

    const/4 v7, 0x0

    const/4 v1, 0x0

    move-object/from16 v5, v22

    invoke-static/range {v0 .. v7}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v4, v5

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    move-object/from16 v7, v28

    goto :goto_b

    :cond_d
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v7, v2

    :goto_b
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_e

    new-instance v6, Lf01/m0;

    const/4 v11, 0x1

    move-object/from16 v8, p1

    move/from16 v9, p3

    move/from16 v10, p4

    invoke-direct/range {v6 .. v11}, Lf01/m0;-><init>(Landroidx/compose/ui/Modifier;Lf01/o0;III)V

    iput-object v6, v0, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final B(Landroidx/compose/ui/Modifier;Lf01/o0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lf01/n0;->A(Landroidx/compose/ui/Modifier;Lf01/o0;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final C(Lk2/e;JFF)V
    .locals 10

    const-string v0, "$this$drawTriangle"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p3}, Ly3/c;->q0(F)F

    move-result p3

    const/4 v0, 0x2

    int-to-float v0, v0

    div-float/2addr p3, v0

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v2

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide v3

    const/16 v1, 0x20

    shr-long/2addr v3, v1

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    div-float/2addr v3, v0

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Li2/j;->i(FF)V

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide v3

    shr-long/2addr v3, v1

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    div-float/2addr v3, v0

    sub-float/2addr v3, p3

    invoke-interface {p0, p4}, Ly3/c;->q0(F)F

    move-result v4

    invoke-virtual {v2, v3, v4}, Li2/j;->h(FF)V

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide v3

    shr-long/2addr v3, v1

    long-to-int v1, v3

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    div-float/2addr v1, v0

    add-float/2addr v1, p3

    invoke-interface {p0, p4}, Ly3/c;->q0(F)F

    move-result p3

    invoke-virtual {v2, v1, p3}, Li2/j;->h(FF)V

    invoke-virtual {v2}, Li2/j;->f()V

    const/4 v6, 0x0

    const/16 v7, 0x3c

    const/4 v5, 0x0

    move-object v1, p0

    move-wide v3, p1

    invoke-static/range {v1 .. v7}, Lk2/e;->z(Lk2/e;Li2/s0;JFLk2/f;I)V

    new-instance v3, Lk2/i;

    const/4 v8, 0x0

    const/16 v9, 0x1e

    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/16 v7, 0x34

    move-object v6, v3

    move-wide v3, p1

    invoke-static/range {v1 .. v7}, Lk2/e;->z(Lk2/e;Li2/s0;JFLk2/f;I)V

    return-void
.end method

.method public static final D()Lh2/c;
    .locals 1

    sget-object v0, Lf01/n0;->b:Lh2/c;

    return-object v0
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Lf01/o0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lf01/n0;->m(Landroidx/compose/ui/Modifier;Lf01/o0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lf01/o0;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lf01/n0;->r(Lf01/o0;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lf01/o0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lf01/n0;->u(Lf01/o0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lf01/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lf01/n0;->s(Lf01/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Lf01/p0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lf01/n0;->p(Landroidx/compose/ui/Modifier;Lf01/p0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lf01/n0;->z(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroidx/compose/ui/Modifier;Lf01/o0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lf01/n0;->B(Landroidx/compose/ui/Modifier;Lf01/o0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lf01/n0;->x(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroidx/compose/ui/Modifier;Lf01/o0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lf01/n0;->v(Landroidx/compose/ui/Modifier;Lf01/o0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(FFJLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p2, p3, p0, p1, p4}, Lf01/n0;->o(JFFLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lf01/n0;->t(Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Landroidx/compose/ui/Modifier;Lf01/o0;Landroidx/compose/runtime/Composer;II)V
    .locals 50

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, 0x2becba5c

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p3, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

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
    or-int v3, p3, v3

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_4

    move-object/from16 v4, p1

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    goto :goto_3

    :cond_4
    move-object/from16 v4, p1

    :goto_3
    and-int/lit8 v5, v3, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_5

    move v5, v8

    goto :goto_4

    :cond_5
    move v5, v7

    :goto_4
    and-int/2addr v3, v8

    invoke-virtual {v0, v3, v5}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_e

    sget-object v3, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_6

    move-object v1, v3

    goto :goto_5

    :cond_6
    move-object v1, v2

    :goto_5
    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v5, v0, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v5, v0, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-eqz v11, :cond_7

    invoke-virtual {v0, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_6
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v0, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v0, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-nez v12, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_9

    :cond_8
    invoke-static {v5, v0, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v0, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v4}, Lf01/o0;->c()Lf01/k0;

    move-result-object v9

    invoke-virtual {v9}, Lf01/k0;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v9, v0, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    sget-object v12, Lx81/d;->a:Lx81/d;

    const/4 v13, 0x6

    invoke-virtual {v12, v0, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->c1()J

    move-result-wide v14

    invoke-virtual {v12, v0, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->s()Lb91/a;

    move-result-object v20

    const/16 v24, 0xc30

    const v25, 0x2d7fa

    move-object/from16 v16, v1

    const/4 v1, 0x0

    move-object/from16 v17, v5

    const-wide/16 v4, 0x0

    move-object/from16 v18, v6

    const/4 v6, 0x0

    move/from16 v19, v7

    const/4 v7, 0x0

    move/from16 v21, v8

    const/4 v8, 0x0

    move-object/from16 v23, v0

    move-object v0, v9

    move-object/from16 v22, v10

    const-wide/16 v9, 0x0

    move-object/from16 v26, v11

    const/4 v11, 0x0

    move-object/from16 v27, v12

    const/4 v12, 0x0

    move-object/from16 v28, v3

    move/from16 v29, v13

    move-wide/from16 v48, v14

    move-object v15, v2

    move-wide/from16 v2, v48

    const-wide/16 v13, 0x0

    move-object/from16 v30, v15

    const/4 v15, 0x2

    move-object/from16 v31, v16

    const/16 v16, 0x0

    move-object/from16 v32, v17

    const/16 v17, 0x2

    move-object/from16 v33, v18

    const/16 v18, 0x0

    move/from16 v34, v19

    const/16 v19, 0x0

    move/from16 v35, v21

    const/16 v21, 0x0

    move-object/from16 v36, v22

    move-object/from16 v22, v23

    const/16 v23, 0x0

    move-object/from16 v38, v26

    move-object/from16 v42, v27

    move-object/from16 v43, v28

    move-object/from16 v39, v30

    move-object/from16 v41, v32

    move-object/from16 v40, v33

    move-object/from16 v37, v36

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    double-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v2, Lb2/e;->J:Lb2/l;

    const/4 v3, 0x6

    invoke-static {v1, v2, v0, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v4, v0, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    move-object/from16 v5, v43

    invoke-static {v0, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-eqz v7, :cond_a

    move-object/from16 v7, v37

    invoke-virtual {v0, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_7
    move-object/from16 v7, v38

    goto :goto_8

    :cond_a
    invoke-virtual {v0}, Lp1/q;->s0()V

    goto :goto_7

    :goto_8
    invoke-static {v0, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v15, v39

    invoke-static {v0, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v0, Lp1/q;->S:Z

    if-nez v1, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    :cond_b
    move-object/from16 v1, v40

    goto :goto_a

    :cond_c
    :goto_9
    move-object/from16 v1, v41

    goto :goto_b

    :goto_a
    invoke-static {v2, v0, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_9

    :goto_b
    invoke-static {v0, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Ly2/d;->a:Ly2/m;

    new-instance v2, Landroidx/compose/foundation/layout/WithAlignmentLineElement;

    invoke-direct {v2, v1}, Landroidx/compose/foundation/layout/WithAlignmentLineElement;-><init>(Ly2/a;)V

    invoke-virtual/range {p1 .. p1}, Lf01/o0;->c()Lf01/k0;

    move-result-object v4

    invoke-virtual {v4}, Lf01/k0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const/4 v6, 0x0

    invoke-static {v4, v0, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v7, v42

    invoke-virtual {v7, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    invoke-virtual {v7, v0, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->A()Lb91/a;

    move-result-object v20

    const/16 v24, 0xc30

    const v25, 0x2d7f8

    move-object/from16 v22, v0

    move-object v0, v4

    move-object/from16 v43, v5

    const-wide/16 v4, 0x0

    move/from16 v44, v6

    const/4 v6, 0x0

    move-object/from16 v27, v7

    const/4 v7, 0x0

    move/from16 v29, v3

    move-wide/from16 v48, v8

    move-object v9, v1

    move-object v1, v2

    move-wide/from16 v2, v48

    const/4 v8, 0x0

    move-object v11, v9

    const-wide/16 v9, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object v15, v13

    const-wide/16 v13, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x2

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x1

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v26, v23

    const/16 v23, 0x0

    move-object/from16 v46, v26

    move-object/from16 v45, v27

    move-object/from16 v47, v43

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    new-instance v1, Landroidx/compose/foundation/layout/WithAlignmentLineElement;

    move-object/from16 v9, v46

    invoke-direct {v1, v9}, Landroidx/compose/foundation/layout/WithAlignmentLineElement;-><init>(Ly2/a;)V

    invoke-virtual/range {p1 .. p1}, Lf01/o0;->c()Lf01/k0;

    move-result-object v2

    invoke-virtual {v2}, Lf01/k0;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v0, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v7, v45

    const/4 v4, 0x6

    invoke-virtual {v7, v0, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v5

    invoke-virtual {v7, v0, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->a()Lb91/a;

    move-result-object v20

    move-object v0, v2

    move/from16 v44, v3

    move/from16 v29, v4

    move-wide v2, v5

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v9, 0x0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Lf01/o0;->c()Lf01/k0;

    move-result-object v2

    invoke-virtual {v2}, Lf01/k0;->f()Lhy0/c2;

    move-result-object v2

    if-nez v2, :cond_d

    const v2, -0x7e3dc949

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_d
    const/4 v3, 0x0

    const v4, -0x7e3dc948

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    const/4 v4, 0x6

    int-to-float v4, v4

    move-object/from16 v5, v47

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v0, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget v4, Lcom/whoop/navigation/e;->d:I

    invoke-static {v2, v0, v4}, Lhy0/z1;->c(Lhy0/c2;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    move-object/from16 v6, v31

    goto :goto_d

    :cond_e
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v6, v2

    :goto_d
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_f

    new-instance v5, Lf01/m0;

    const/4 v10, 0x0

    move-object/from16 v7, p1

    move/from16 v8, p3

    move/from16 v9, p4

    invoke-direct/range {v5 .. v10}, Lf01/m0;-><init>(Landroidx/compose/ui/Modifier;Lf01/o0;III)V

    iput-object v5, v0, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final m(Landroidx/compose/ui/Modifier;Lf01/o0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lf01/n0;->l(Landroidx/compose/ui/Modifier;Lf01/o0;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Landroidx/compose/ui/Modifier;Lf01/p0;Landroidx/compose/runtime/Composer;II)V
    .locals 33

    move-object/from16 v3, p1

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    const v0, 0x5108374c

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v4, p3, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, p3, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v9, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    move v5, v1

    :goto_0
    or-int v5, p3, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move/from16 v5, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_5

    and-int/lit8 v6, p3, 0x40

    if-nez v6, :cond_3

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_2

    :cond_3
    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_2
    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_3

    :cond_4
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit8 v6, v5, 0x13

    const/16 v7, 0x12

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v6, v7, :cond_6

    move v6, v13

    goto :goto_4

    :cond_6
    move v6, v12

    :goto_4
    and-int/2addr v5, v13

    invoke-virtual {v9, v5, v6}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_1e

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_7

    move-object v0, v14

    goto :goto_5

    :cond_7
    move-object v0, v4

    :goto_5
    if-nez v3, :cond_8

    const v1, -0x34e1f1fe    # -1.0358274E7f

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    move-object/from16 v30, v0

    goto/16 :goto_10

    :cond_8
    const v4, -0x34e1f1fd    # -1.0358275E7f

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lf01/p0;->f()Lhy0/c2;

    move-result-object v4

    invoke-virtual {v4}, Lhy0/c2;->p()Lhy0/b2;

    move-result-object v4

    invoke-static {v4, v9, v12}, Lhy0/z1;->g(Lhy0/b2;Landroidx/compose/runtime/Composer;I)Lhy0/a2;

    move-result-object v15

    const/16 v4, 0xc

    int-to-float v4, v4

    const/4 v5, 0x6

    int-to-float v6, v5

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-virtual {v7, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->q()J

    move-result-wide v10

    invoke-virtual {v3}, Lf01/p0;->d()Z

    move-result v8

    const/16 v13, 0x8

    if-nez v8, :cond_9

    const v8, 0x6480b774

    invoke-virtual {v9, v8}, Lp1/q;->e0(I)V

    int-to-float v8, v1

    int-to-float v1, v13

    invoke-static {v8, v1, v14, v9, v12}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_6

    :cond_9
    const v1, 0x6481ba79

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    :goto_6
    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v1, v8, v9, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v12, v9, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v9, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-eqz v5, :cond_a

    invoke-virtual {v9, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_7
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v9, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v9, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-nez v3, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v26, v15

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v3, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_8

    :cond_b
    move-object/from16 v26, v15

    :goto_8
    invoke-static {v8, v9, v8, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v9, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lf01/p0;->d()Z

    move-result v8

    const/high16 v13, 0x3f800000    # 1.0f

    if-eqz v8, :cond_12

    const v8, 0x73c022a9

    invoke-virtual {v9, v8}, Lp1/q;->e0(I)V

    invoke-static {v13, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v15, Ll0/m;->b:Ll0/e;

    sget-object v13, Lb2/e;->J:Lb2/l;

    move-object/from16 v30, v0

    const/4 v0, 0x6

    invoke-static {v15, v13, v9, v0}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v13

    move-wide/from16 v17, v10

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_d

    invoke-virtual {v9, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_d
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v9, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-nez v10, :cond_e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_f

    :cond_e
    invoke-static {v0, v9, v0, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v9, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v4, v6}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-wide/from16 v10, v17

    invoke-virtual {v9, v10, v11}, Lp1/q;->f(J)Z

    move-result v8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v8, :cond_10

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v13, v8, :cond_11

    :cond_10
    new-instance v16, Le61/l;

    const/16 v21, 0x1

    move/from16 v19, v4

    move/from16 v20, v6

    move-wide/from16 v17, v10

    invoke-direct/range {v16 .. v21}, Le61/l;-><init>(JFFI)V

    move-object/from16 v13, v16

    invoke-virtual {v9, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/4 v4, 0x6

    invoke-static {v0, v13, v9, v4}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/16 v0, 0x16

    int-to-float v0, v0

    const/4 v6, 0x4

    int-to-float v8, v6

    const/4 v10, 0x1

    invoke-static {v0, v8, v14, v9, v10}, Lih0/d0;->v(FFLb2/t;Lp1/q;Z)V

    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_12
    move-object/from16 v30, v0

    const/4 v0, 0x0

    const/4 v4, 0x6

    const/4 v6, 0x4

    const v8, 0x73c7bb2f

    invoke-virtual {v9, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v7, v9, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->q()J

    move-result-wide v10

    const/4 v0, 0x2

    int-to-float v0, v0

    int-to-float v13, v6

    mul-float/2addr v0, v13

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v4

    move-object/from16 v15, v30

    invoke-static {v15, v10, v11, v4}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v10, 0x1

    int-to-float v6, v10

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v8, v6

    invoke-static {v8, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, Lb2/e;->E:Lb2/m;

    const/4 v10, 0x0

    invoke-static {v8, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    move-object/from16 p0, v7

    move-object v10, v8

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v9, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v9}, Lp1/q;->i0()V

    move-object/from16 v16, v10

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-eqz v10, :cond_13

    invoke-virtual {v9, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_13
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v9, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-nez v8, :cond_14

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_15

    :cond_14
    invoke-static {v7, v9, v7, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v9, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->a:Ll0/e;

    const/16 v10, 0x30

    invoke-static {v8, v7, v9, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_16

    invoke-virtual {v9, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_16
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v9, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-nez v7, :cond_17

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_18

    :cond_17
    invoke-static {v8, v9, v8, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    invoke-static {v9, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lf01/p0;->f()Lhy0/c2;

    move-result-object v4

    invoke-virtual {v4}, Lhy0/c2;->f()Lgz0/m0;

    move-result-object v4

    if-eqz v4, :cond_19

    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_d

    :cond_19
    invoke-virtual/range {v26 .. v26}, Lhy0/a2;->f()Ljava/lang/Integer;

    move-result-object v4

    :goto_d
    if-nez v4, :cond_1a

    const v1, -0x3ee00707

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    move-object/from16 v1, p0

    move v3, v10

    const/4 v2, 0x6

    const/4 v10, 0x1

    goto/16 :goto_f

    :cond_1a
    const/4 v10, 0x0

    const v7, -0x3ee00706

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    mul-float v7, v13, v13

    invoke-static {v7, v14}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual/range {v26 .. v26}, Lhy0/a2;->c()J

    move-result-wide v10

    invoke-static {v7, v6, v13, v10, v11}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->w:Lb2/m;

    const/4 v10, 0x0

    invoke-static {v7, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_1b

    invoke-virtual {v9, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_1b
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v9, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-nez v1, :cond_1c

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    :cond_1c
    invoke-static {v8, v9, v8, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    invoke-static {v9, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v14}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {v2, v1}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    move-object/from16 v10, v16

    invoke-virtual {v2, v1, v10}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v1, 0x6

    invoke-static {v4, v9, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v4

    invoke-virtual/range {v26 .. v26}, Lhy0/a2;->e()J

    move-result-wide v7

    const/16 v10, 0x30

    const/4 v11, 0x0

    const/4 v5, 0x0

    move v2, v1

    move-object/from16 v1, p0

    invoke-static/range {v4 .. v11}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    const/4 v3, 0x0

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    :goto_f
    const/4 v4, 0x3

    int-to-float v4, v4

    mul-float/2addr v4, v13

    invoke-static {v4, v14}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v9, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p1 .. p1}, Lf01/p0;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v9, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {v26 .. v26}, Lhy0/a2;->j()J

    move-result-wide v6

    invoke-virtual {v1, v9, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->c()Lb91/a;

    move-result-object v24

    const/16 v28, 0x0

    const v29, 0x2fffa

    const/4 v5, 0x0

    move-object/from16 v26, v9

    const-wide/16 v8, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move/from16 v17, v13

    move-object/from16 v16, v14

    const-wide/16 v13, 0x0

    move-object/from16 v30, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v20, v17

    move-object/from16 v19, v18

    const-wide/16 v17, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v25, v22

    const/16 v22, 0x0

    move-object/from16 v27, v23

    const/16 v23, 0x0

    move/from16 v31, v25

    const/16 v25, 0x0

    move-object/from16 v32, v27

    const/16 v27, 0x0

    move v2, v3

    move-object/from16 v3, v32

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v26

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v9, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p1 .. p1}, Lf01/p0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v9, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    const/4 v0, 0x6

    invoke-virtual {v1, v9, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v6

    invoke-virtual {v1, v9, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->c()Lb91/a;

    move-result-object v24

    const-wide/16 v8, 0x0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v26

    const/4 v10, 0x1

    invoke-static {v9, v10, v10, v10, v2}, Lb9/y;->B(Lp1/q;ZZZZ)V

    :goto_10
    move-object/from16 v1, v30

    goto :goto_11

    :cond_1e
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v1, v4

    :goto_11
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1f

    new-instance v0, Ld62/b;

    const/16 v5, 0x16

    move-object/from16 v3, p1

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ld62/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method private static final o(JFFLk2/e;)Ll83/a0;
    .locals 1

    const-string v0, "$this$Canvas"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p0, p1, p2, p3}, Lf01/n0;->C(Lk2/e;JFF)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Landroidx/compose/ui/Modifier;Lf01/p0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lf01/n0;->n(Landroidx/compose/ui/Modifier;Lf01/p0;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final q(Landroidx/compose/ui/Modifier;Lf01/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lf01/o0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, 0x605dd158

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p5, 0x1

    const/4 v3, 0x4

    if-eqz v2, :cond_0

    or-int/lit8 v4, v1, 0x6

    move v7, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v3

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v1, 0x30

    if-nez v8, :cond_4

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_4
    and-int/lit16 v8, v1, 0x180

    const/16 v9, 0x100

    if-nez v8, :cond_6

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v9

    goto :goto_3

    :cond_5
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v7, v8

    :cond_6
    and-int/lit16 v8, v7, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v8, v10, :cond_7

    move v8, v12

    goto :goto_4

    :cond_7
    move v8, v11

    :goto_4
    and-int/lit8 v10, v7, 0x1

    invoke-virtual {v0, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_c

    if-eqz v2, :cond_8

    sget-object v2, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_8
    move-object v2, v4

    :goto_5
    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit16 v7, v7, 0x380

    if-ne v7, v9, :cond_9

    goto :goto_6

    :cond_9
    move v12, v11

    :goto_6
    or-int/2addr v4, v12

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_a

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v7, v4, :cond_b

    :cond_a
    new-instance v7, Ld30/l;

    const/16 v4, 0x1a

    invoke-direct {v7, v4, v5, v6}, Ld30/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lc93/a;

    const/4 v4, 0x0

    const/4 v8, 0x3

    invoke-static {v2, v11, v4, v7, v8}, Landroidx/room/c1;->i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const-string v7, "GraphDescriptionCard"

    invoke-static {v4, v7}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v4, v8

    int-to-float v3, v3

    mul-float/2addr v4, v3

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v11

    new-instance v3, Lf01/f;

    const/4 v4, 0x2

    invoke-direct {v3, v4, v5, v6}, Lf01/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v4, -0x1ecb6318

    invoke-static {v4, v0, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    const/high16 v17, 0xc00000

    const/16 v18, 0x76

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v0

    invoke-static/range {v7 .. v18}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v2

    goto :goto_7

    :cond_c
    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    :goto_7
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v0, Le11/b;

    const/16 v3, 0x19

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Le11/b;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final r(Lf01/o0;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lf01/o0;->f()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lf01/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    and-int/lit8 v2, p3, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eq v2, v5, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    and-int/lit8 v6, p3, 0x1

    move-object/from16 v14, p2

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v6, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_13

    int-to-float v2, v5

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v9, v2, v5

    move v7, v9

    const/4 v9, 0x0

    const/4 v11, 0x4

    sget-object v6, Lb2/t;->w:Lb2/t;

    move v8, v7

    move v10, v7

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move v9, v7

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v8, v14, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v10, v14, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v14, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v11, v14, Lp1/q;->S:Z

    if-eqz v11, :cond_1

    invoke-virtual {v14, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_1
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v14, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v14, v15, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-nez v10, :cond_2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    :cond_2
    invoke-static {v8, v14, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v14, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v10, 0x0

    const/16 v11, 0xb

    move-object v2, v7

    const/4 v7, 0x0

    move-object/from16 v16, v8

    const/4 v8, 0x0

    move-object/from16 v17, v16

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v8, 0x6

    invoke-static {v7, v0, v14, v8, v4}, Lf01/n0;->A(Landroidx/compose/ui/Modifier;Lf01/o0;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0}, Lf01/o0;->h()Lf01/p0;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lf01/p0;->d()Z

    move-result v7

    if-ne v7, v3, :cond_4

    const v7, 0x77c6cf24

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    const v7, 0x77c5ae17

    invoke-static {v14, v7, v6, v9, v14}, Lr80/c;->C(Lp1/q;ILb2/t;FLp1/q;)V

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    :goto_2
    sget-object v7, Lb2/e;->K:Lb2/l;

    sget-object v10, Ll0/m;->a:Ll0/e;

    const/16 v11, 0x30

    invoke-static {v10, v7, v14, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v10, v14, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v14, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v4, v14, Lp1/q;->S:Z

    if-eqz v4, :cond_5

    invoke-virtual {v14, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_5
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v14, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v15, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v14, Lp1/q;->S:Z

    if-nez v4, :cond_7

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_5

    :cond_6
    :goto_4
    move-object/from16 v4, v17

    goto :goto_6

    :cond_7
    :goto_5
    invoke-static {v10, v14, v10, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_4

    :goto_6
    invoke-static {v14, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v7, v3

    sget v8, Lf01/n0;->a:F

    sub-float v10, v7, v8

    sget-object v11, Ll0/t1;->a:Ll0/t1;

    invoke-virtual {v11, v6, v3, v10}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v3, 0x0

    invoke-static {v10, v0, v14, v3, v3}, Lf01/n0;->l(Landroidx/compose/ui/Modifier;Lf01/o0;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0}, Lf01/o0;->k()Lm91/u;

    move-result-object v10

    move/from16 v16, v7

    const/high16 v7, 0x40000000    # 2.0f

    if-eqz v10, :cond_f

    const v1, -0x5ec82be7

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x1

    invoke-virtual {v11, v6, v1, v8}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v1, Lb2/e;->F:Lb2/m;

    invoke-static {v1, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v10, v14, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v14, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v11, v14, Lp1/q;->S:Z

    if-eqz v11, :cond_8

    invoke-virtual {v14, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_8
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v14, v13, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v15, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-nez v1, :cond_9

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    :cond_9
    invoke-static {v3, v14, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    invoke-static {v14, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lf01/o0;->k()Lm91/u;

    move-result-object v1

    instance-of v1, v1, Lc51/s;

    if-eqz v1, :cond_b

    const v1, 0x7e7806fc

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    mul-float v1, v16, v5

    const/4 v10, 0x0

    const/16 v11, 0x9

    move v2, v7

    const/4 v7, 0x0

    move v8, v9

    const/4 v3, 0x6

    move v9, v1

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v18

    move v5, v8

    sget-object v1, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v14, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly3/c;

    const/16 v7, 0x2a

    int-to-float v7, v7

    invoke-interface {v4, v7}, Ly3/c;->q0(F)F

    move-result v4

    neg-float v4, v4

    invoke-virtual {v14, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/c;

    const/16 v7, 0x14

    int-to-float v7, v7

    invoke-interface {v1, v7}, Ly3/c;->q0(F)F

    move-result v1

    neg-float v1, v1

    const/16 v27, 0x0

    const v28, 0x7ffe7

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move/from16 v23, v1

    move/from16 v22, v4

    invoke-static/range {v18 .. v28}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v2, v6}, Ldt/b;->N(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v1, 0x0

    invoke-static {v1, v6}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v0}, Lf01/o0;->k()Lm91/u;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lc51/s;

    invoke-static {v1, v6}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/16 v15, 0x6d80

    const/16 v16, 0x22

    const/4 v8, 0x0

    const/4 v12, 0x0

    invoke-static/range {v7 .. v16}, Lc51/k;->q(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc51/s;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x0

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    const/4 v4, 0x1

    goto :goto_9

    :cond_b
    move v5, v9

    const/4 v1, 0x0

    const/4 v3, 0x6

    const v7, 0x7e8560bc

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    const/4 v7, 0x4

    int-to-float v7, v7

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lb2/e;->w:Lb2/m;

    invoke-static {v8, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v9, v14, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v14, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-eqz v10, :cond_c

    invoke-virtual {v14, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v14, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v15, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v14, Lp1/q;->S:Z

    if-nez v8, :cond_d

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_e

    :cond_d
    invoke-static {v1, v14, v1, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v14, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lf01/o0;->k()Lm91/u;

    move-result-object v7

    const/4 v12, 0x0

    const/16 v13, 0xe

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v11, v14

    invoke-static/range {v7 .. v13}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v4, 0x1

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    const/4 v1, 0x0

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    move v1, v4

    move-object v2, v6

    goto/16 :goto_a

    :cond_f
    move v2, v7

    move v5, v9

    const/4 v3, 0x6

    const/4 v4, 0x1

    const v7, -0x5eb16f88

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v6, v4, v8}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v18

    const/16 v27, 0x1

    const v28, 0x6ffff

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v18 .. v28}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v7, v12, :cond_10

    new-instance v7, Lev2/b;

    const/16 v8, 0x14

    invoke-direct {v7, v8}, Lev2/b;-><init>(I)V

    invoke-virtual {v14, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v4, v7}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v7, 0x0

    invoke-static {v4, v7, v2}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v7, 0x1

    invoke-virtual {v11, v4, v7, v2}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v4, "GraphDescriptionCardGraph"

    invoke-static {v2, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v10, 0x0

    const/16 v11, 0xb

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v9, v6

    move-object v6, v2

    move-object v2, v9

    move v9, v5

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v0}, Lf01/o0;->i()Lj71/c;

    move-result-object v8

    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_11

    if-ne v6, v12, :cond_12

    :cond_11
    new-instance v6, Lcom/whoop/profile/view/edit/n;

    const/16 v4, 0x19

    invoke-direct {v6, v4, v0, v1}, Lcom/whoop/profile/view/edit/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v13, v6

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/4 v15, 0x0

    const/16 v16, 0x3c

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v7 .. v16}, Lb61/k;->p(Landroidx/compose/ui/Modifier;Lj71/c;Lj71/c;Lj71/c;ZLb61/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x0

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    const/4 v1, 0x1

    :goto_a
    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    const/4 v10, 0x0

    const/16 v11, 0xb

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, v2

    move v9, v5

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v0}, Lf01/o0;->h()Lf01/p0;

    move-result-object v2

    sget v4, Lcom/whoop/navigation/e;->d:I

    shl-int/lit8 v4, v4, 0x3

    or-int/2addr v3, v4

    const/4 v7, 0x0

    invoke-static {v1, v2, v14, v3, v7}, Lf01/n0;->n(Landroidx/compose/ui/Modifier;Lf01/p0;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0}, Lf01/o0;->l()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v14, v7}, Lf01/n0;->y(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x1

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_13
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final t(Lk2/c;)Ll83/a0;
    .locals 12

    const-string v0, "$this$drawWithContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    sget-wide v1, Li2/x;->m:J

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0x3e99999a    # 0.3f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    sget-wide v2, Li2/x;->b:J

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2}, [Ll83/k;

    move-result-object v0

    move-object v1, p0

    check-cast v1, La3/p0;

    invoke-virtual {v1}, La3/p0;->a()V

    sget-object v1, Li2/t;->b:Li2/s;

    const/4 v2, 0x2

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll83/k;

    invoke-static {v1, v0}, Li2/s;->b(Li2/s;[Ll83/k;)Li2/k0;

    move-result-object v3

    const/4 v10, 0x6

    const/16 v11, 0x3e

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v11}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lf01/o0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf01/o0;->f()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Landroidx/compose/ui/Modifier;Lf01/o0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lf01/n0;->q(Landroidx/compose/ui/Modifier;Lf01/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final w(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x86ca48a

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lf01/n0$a;

    invoke-direct {v1}, Lf01/n0$a;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lf01/c0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v2, p1, v1}, Lf01/c0;-><init>(BII)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final x(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lf01/n0;->w(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v6, p1

    check-cast v6, Lp1/q;

    const v2, 0x47bf73c9

    invoke-virtual {v6, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v4, v2, 0x3

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v4, v3, :cond_2

    move v4, v10

    goto :goto_2

    :cond_2
    move v4, v9

    :goto_2
    and-int/2addr v2, v10

    invoke-virtual {v6, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_8

    if-nez v0, :cond_3

    const v2, 0x60842580

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    goto/16 :goto_5

    :cond_3
    const v2, 0x60842581

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    int-to-float v2, v3

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float v13, v2, v3

    const/4 v15, 0x0

    const/16 v16, 0x9

    const/4 v12, 0x0

    move v14, v13

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v13}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v3, v4, v6, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_4

    invoke-virtual {v6, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_3
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v6, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v6, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-nez v5, :cond_5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v4, v6, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v6, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, 0xdfa902f

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm91/u;

    const/4 v7, 0x0

    const/16 v8, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_7
    invoke-static {v6, v9, v10, v9}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_5

    :cond_8
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_9

    new-instance v3, Lbm0/o;

    const/4 v4, 0x3

    invoke-direct {v3, v0, v1, v4}, Lbm0/o;-><init>(Ljava/util/List;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final z(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lf01/n0;->y(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
