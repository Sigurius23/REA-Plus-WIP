.class public abstract Lz51/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a1\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000bH\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a/\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "firstKeyStatText",
        "secondKeyStatText",
        "Ll83/a0;",
        "e",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "mainStatText",
        "keyStatText",
        "Lb2/f;",
        "columnAlignment",
        "k",
        "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lb2/f;Landroidx/compose/runtime/Composer;II)V",
        "Lw3/k;",
        "m",
        "(Lb2/f;)I",
        "Ly3/f;",
        "height",
        "width",
        "cornerRadius",
        "Li2/x;",
        "color",
        "g",
        "(FFFJLandroidx/compose/runtime/Composer;I)V",
        "i",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
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


# direct methods
.method public static synthetic a(FFFJILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lz51/i;->h(FFFJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lz51/i;->f(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lz51/i;->j(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lb2/f;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lz51/i;->l(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lb2/f;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v2, p0

    move-object/from16 v7, p1

    move/from16 v8, p3

    const-string v0, "firstKeyStatText"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "secondKeyStatText"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p2

    check-cast v4, Lp1/q;

    const v0, 0x3e0876ce

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v3, v8, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v4, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    move v9, v0

    and-int/lit8 v0, v9, 0x13

    const/16 v3, 0x12

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v0, v3, :cond_4

    move v0, v11

    goto :goto_3

    :cond_4
    move v0, v10

    :goto_3
    and-int/lit8 v3, v9, 0x1

    invoke-virtual {v4, v3, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_c

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v3, v11

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v3, v5

    const/4 v5, 0x0

    invoke-static {v0, v3, v5, v1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->K:Lb2/l;

    sget-object v3, Ll0/m;->e:Ll0/h;

    const/16 v5, 0x36

    invoke-static {v3, v1, v4, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v13, v4, Lp1/q;->S:Z

    if-eqz v13, :cond_5

    invoke-virtual {v4, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_4
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v4, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v4, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v4, Lp1/q;->S:Z

    if-nez v5, :cond_6

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    :cond_6
    invoke-static {v3, v4, v3, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v4, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v0, v12

    const-wide/16 v13, 0x0

    cmpl-double v0, v0, v13

    const-string v15, "invalid weight; must be greater than zero"

    if-lez v0, :cond_8

    goto :goto_5

    :cond_8
    invoke-static {v15}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v0, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v16, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v1, v12, v16

    if-lez v1, :cond_9

    move/from16 v1, v16

    goto :goto_6

    :cond_9
    move v1, v12

    :goto_6
    invoke-direct {v0, v1, v11}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget v1, Lgy0/f;->C1:I

    invoke-static {v4, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lb2/e;->O:Lb2/k;

    shl-int/lit8 v5, v9, 0x6

    and-int/lit16 v5, v5, 0x380

    or-int/lit16 v5, v5, 0xc00

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lz51/i;->k(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lb2/f;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x0

    invoke-static {v0, v4, v10, v11}, Lz51/i;->i(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    float-to-double v0, v12

    cmpl-double v0, v0, v13

    if-lez v0, :cond_a

    goto :goto_7

    :cond_a
    invoke-static {v15}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v0, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v1, v12, v16

    if-lez v1, :cond_b

    move/from16 v12, v16

    :cond_b
    invoke-direct {v0, v12, v11}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget v1, Lgy0/f;->z1:I

    invoke-static {v4, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lb2/e;->M:Lb2/k;

    shl-int/lit8 v2, v9, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/lit16 v5, v2, 0xc00

    const/4 v6, 0x0

    move-object v2, v7

    move-object/from16 v7, p0

    invoke-static/range {v0 .. v6}, Lz51/i;->k(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lb2/f;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_c
    move-object/from16 v17, v7

    move-object v7, v2

    move-object/from16 v2, v17

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v1, Lam0/c;

    const/16 v3, 0x10

    invoke-direct {v1, v7, v2, v8, v3}, Lam0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final f(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lz51/i;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(FFFJLandroidx/compose/runtime/Composer;I)V
    .locals 7

    check-cast p5, Lp1/q;

    const v0, 0x69ce1b4e

    invoke-virtual {p5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p5, p0}, Lp1/q;->d(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p6

    goto :goto_1

    :cond_1
    move v0, p6

    :goto_1
    and-int/lit8 v1, p6, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p5, p1}, Lp1/q;->d(F)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p6, 0x180

    if-nez v1, :cond_5

    invoke-virtual {p5, p2}, Lp1/q;->d(F)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, p6, 0xc00

    if-nez v1, :cond_7

    invoke-virtual {p5, p3, p4}, Lp1/q;->f(J)Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0x800

    goto :goto_4

    :cond_6
    const/16 v1, 0x400

    :goto_4
    or-int/2addr v0, v1

    :cond_7
    and-int/lit16 v1, v0, 0x493

    const/16 v2, 0x492

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_8

    move v1, v4

    goto :goto_5

    :cond_8
    move v1, v3

    :goto_5
    and-int/2addr v0, v4

    invoke-virtual {p5, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {p2}, Lt0/j;->e(F)Lt0/i;

    move-result-object v1

    invoke-static {v0, p3, p4, v1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, p5, v3}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_6

    :cond_9
    invoke-virtual {p5}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {p5}, Lp1/q;->u()Lp1/v1;

    move-result-object p5

    if-eqz p5, :cond_a

    new-instance v0, Lm41/b;

    move v1, p0

    move v2, p1

    move v3, p2

    move-wide v4, p3

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lm41/b;-><init>(FFFJI)V

    iput-object v0, p5, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final h(FFFJILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move v0, p0

    move v1, p1

    move v2, p2

    move-wide v3, p3

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Lz51/i;->g(FFFJLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 18

    move/from16 v0, p2

    move/from16 v1, p3

    move-object/from16 v11, p1

    check-cast v11, Lp1/q;

    const v2, 0x3cd32bca

    invoke-virtual {v11, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-eqz v2, :cond_0

    or-int/lit8 v5, v0, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v11, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v4

    goto :goto_0

    :cond_1
    move v6, v3

    :goto_0
    or-int/2addr v6, v0

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v0

    :goto_1
    and-int/lit8 v7, v6, 0x3

    const/4 v8, 0x0

    const/4 v14, 0x1

    if-eq v7, v3, :cond_3

    move v3, v14

    goto :goto_2

    :cond_3
    move v3, v8

    :goto_2
    and-int/2addr v6, v14

    invoke-virtual {v11, v6, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_8

    sget-object v3, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_4

    move-object v15, v3

    goto :goto_3

    :cond_4
    move-object v15, v5

    :goto_3
    invoke-static {}, Lz51/h;->N()F

    move-result v2

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {}, Lz51/h;->P()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-interface {v2, v15}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Lb2/e;->E:Lb2/m;

    invoke-static {v5, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v11, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-eqz v9, :cond_5

    invoke-virtual {v11, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_4
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v11, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v11, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-nez v7, :cond_6

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_7

    :cond_6
    invoke-static {v6, v11, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v11, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v2, 0x5

    int-to-float v2, v2

    int-to-float v4, v4

    mul-float/2addr v2, v4

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, Lx81/d;->a:Lx81/d;

    invoke-virtual {v10}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/u;->c()I

    move-result v2

    const/4 v12, 0x6

    invoke-static {v2, v11, v12}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    invoke-virtual {v10, v11, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v5

    const/16 v8, 0x1b0

    const/4 v9, 0x0

    const/4 v3, 0x0

    move-object v7, v11

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Lz51/h;->Q()F

    move-result v3

    invoke-virtual {v10, v11, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->W0()J

    move-result-wide v4

    invoke-static {v4, v5}, Li91/c;->o(J)Li91/a;

    move-result-object v5

    invoke-static {}, Lz51/h;->O()F

    move-result v6

    move v2, v12

    const/16 v12, 0x61b0

    const/16 v13, 0x1e1

    move v4, v2

    const/4 v2, 0x0

    move v7, v4

    const/high16 v4, 0x3f800000    # 1.0f

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move/from16 v16, v9

    const/4 v9, 0x0

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move/from16 v14, v16

    move-object/from16 v16, v15

    move v15, v14

    move-object/from16 v14, v17

    invoke-static/range {v2 .. v13}, Lwy0/c;->c(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Lz51/h;->R()F

    move-result v3

    invoke-virtual {v14, v11, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->W0()J

    move-result-wide v4

    invoke-static {v4, v5}, Li91/c;->o(J)Li91/a;

    move-result-object v5

    invoke-static {}, Lz51/h;->O()F

    move-result v6

    const/4 v2, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static/range {v2 .. v13}, Lwy0/c;->c(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x1

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    move-object/from16 v5, v16

    goto :goto_5

    :cond_8
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_9

    new-instance v3, Lyk2/b;

    const/4 v4, 0x2

    invoke-direct {v3, v0, v1, v4, v5}, Lyk2/b;-><init>(IIILandroidx/compose/ui/Modifier;)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final j(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Lz51/i;->i(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lb2/f;Landroidx/compose/runtime/Composer;II)V
    .locals 49

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move/from16 v3, p5

    const-string v4, "mainStatText"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "keyStatText"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "columnAlignment"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v4, 0x4488b085

    invoke-virtual {v10, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, p6, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v6, v3, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v3, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v10, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v3

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v3

    :goto_1
    and-int/lit8 v8, v3, 0x30

    if-nez v8, :cond_4

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_4
    and-int/lit16 v8, v3, 0x180

    if-nez v8, :cond_6

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x100

    goto :goto_3

    :cond_5
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v7, v8

    :cond_6
    and-int/lit16 v8, v3, 0xc00

    if-nez v8, :cond_8

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x800

    goto :goto_4

    :cond_7
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v7, v8

    :cond_8
    move v13, v7

    and-int/lit16 v7, v13, 0x493

    const/16 v8, 0x492

    if-eq v7, v8, :cond_9

    const/4 v7, 0x1

    goto :goto_5

    :cond_9
    const/4 v7, 0x0

    :goto_5
    and-int/lit8 v8, v13, 0x1

    invoke-virtual {v10, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_11

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_a

    move-object v4, v15

    goto :goto_6

    :cond_a
    move-object v4, v6

    :goto_6
    and-int/lit8 v6, v13, 0xe

    shr-int/lit8 v7, v13, 0x3

    and-int/lit16 v8, v7, 0x380

    or-int/2addr v6, v8

    sget-object v9, Ll0/m;->c:Ll0/g;

    const/4 v11, 0x3

    shr-int/2addr v6, v11

    and-int/lit8 v6, v6, 0x70

    invoke-static {v9, v2, v10, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move/from16 v16, v13

    iget-wide v12, v10, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v10, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v5, v10, Lp1/q;->S:Z

    if-eqz v5, :cond_b

    invoke-virtual {v10, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_7
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v10, v5, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v10, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-nez v11, :cond_c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    :cond_c
    invoke-static {v12, v10, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v10, v0, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v11, 0x3

    int-to-float v12, v11

    const/4 v14, 0x4

    int-to-float v14, v14

    mul-float/2addr v12, v14

    move/from16 v18, v12

    const-wide/high16 v11, 0x4023000000000000L    # 9.5

    double-to-float v11, v11

    mul-float/2addr v11, v14

    move-object/from16 v19, v0

    move-object v12, v1

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    double-to-float v0, v0

    mul-float/2addr v0, v14

    sget-object v1, Lx81/d;->a:Lx81/d;

    move-object/from16 v20, v4

    const/4 v4, 0x6

    invoke-virtual {v1, v10, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ly81/i;->W0()J

    move-result-wide v21

    move-object/from16 v23, v6

    move v6, v11

    const/16 v11, 0x1b6

    move/from16 v26, v7

    move v7, v0

    move/from16 v0, v26

    move-object/from16 v32, v5

    move/from16 v26, v8

    move-object/from16 v31, v9

    move/from16 v5, v18

    move-wide/from16 v8, v21

    move-object/from16 v33, v23

    const/16 v27, 0x3

    invoke-static/range {v5 .. v11}, Lz51/i;->g(FFFJLandroidx/compose/runtime/Composer;I)V

    move/from16 v28, v6

    move/from16 v29, v7

    const/4 v5, 0x1

    int-to-float v6, v5

    mul-float v7, v6, v14

    invoke-static {v7, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v10, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v1, v10, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->s()Lb91/a;

    move-result-object v8

    invoke-virtual {v1, v10, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->X0()J

    move-result-wide v17

    and-int/lit8 v23, v0, 0xe

    const/16 v24, 0x0

    const v25, 0x2fffa

    move-object v0, v1

    const/4 v1, 0x0

    move v9, v4

    move v11, v5

    const-wide/16 v4, 0x0

    move/from16 v21, v6

    const/4 v6, 0x0

    move/from16 v22, v7

    const/4 v7, 0x0

    move-object/from16 v30, v20

    move-object/from16 v20, v8

    const/4 v8, 0x0

    move/from16 v35, v9

    move/from16 v34, v22

    move-object/from16 v22, v10

    const-wide/16 v9, 0x0

    move/from16 v36, v11

    const/4 v11, 0x0

    move-object/from16 v37, v12

    const/4 v12, 0x0

    move-object/from16 v38, v13

    move/from16 v39, v14

    const-wide/16 v13, 0x0

    move-object/from16 v40, v15

    const/4 v15, 0x0

    move/from16 v41, v16

    const/16 v16, 0x0

    move-wide/from16 v2, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v42, v19

    const/16 v19, 0x0

    move/from16 v43, v21

    const/16 v21, 0x0

    move-object/from16 v47, v0

    move/from16 p0, v34

    move-object/from16 v44, v37

    move-object/from16 v45, v38

    move-object/from16 v48, v40

    move-object/from16 v46, v42

    move-object/from16 v0, p1

    move-object/from16 v34, v30

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v22

    const/4 v0, 0x2

    int-to-float v0, v0

    mul-float v5, v0, v39

    move-object/from16 v0, v48

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v10, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v1, v47

    const/4 v2, 0x6

    invoke-virtual {v1, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->X()J

    move-result-wide v3

    const v6, 0x3e19999a    # 0.15f

    invoke-static {v6, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v3

    invoke-static/range {p0 .. p0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    invoke-static {v0, v3, v4, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float v6, v43, v4

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    shr-int/lit8 v4, v26, 0x3

    and-int/lit8 v4, v4, 0x70

    move-object/from16 v12, p3

    move-object/from16 v6, v31

    invoke-static {v6, v12, v10, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_e

    move-object/from16 v8, v44

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    :goto_8
    move-object/from16 v8, v32

    goto :goto_9

    :cond_e
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_8

    :goto_9
    invoke-static {v10, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v33

    invoke-static {v10, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-nez v4, :cond_f

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_10

    :cond_f
    move-object/from16 v4, v45

    goto :goto_b

    :cond_10
    :goto_a
    move-object/from16 v4, v46

    goto :goto_c

    :goto_b
    invoke-static {v6, v10, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_a

    :goto_c
    invoke-static {v10, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->X()J

    move-result-wide v8

    const/16 v11, 0x1b6

    move/from16 v6, v28

    move/from16 v7, v29

    invoke-static/range {v5 .. v11}, Lz51/i;->g(FFFJLandroidx/compose/runtime/Composer;I)V

    move/from16 v6, p0

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v10, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    shr-int/lit8 v0, v41, 0x6

    and-int/lit8 v0, v0, 0xe

    move-object/from16 v3, p2

    invoke-static {v3, v10, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v10, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->t()Lb91/a;

    move-result-object v25

    invoke-virtual {v1, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v7

    invoke-static {v12}, Lz51/i;->m(Lb2/f;)I

    move-result v0

    new-instance v1, Lw3/k;

    invoke-direct {v1, v0}, Lw3/k;-><init>(I)V

    const/16 v29, 0xc30

    const v30, 0x2d5fa

    const/4 v6, 0x0

    move-object/from16 v22, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x2

    const/16 v21, 0x0

    move-object/from16 v27, v22

    const/16 v22, 0x2

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v17, v1

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const/4 v11, 0x1

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    move-object/from16 v1, v34

    goto :goto_d

    :cond_11
    move-object v3, v1

    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v6

    :goto_d
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_12

    new-instance v0, Lw71/k;

    const/16 v7, 0x13

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lw71/k;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final l(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lb2/f;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lz51/i;->k(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lb2/f;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lb2/f;)I
    .locals 1

    sget-object v0, Lb2/e;->O:Lb2/k;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x2

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method
