.class public abstract Lp21/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a1\u0010\u000b\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a+\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a7\u0010 \u001a\u00020\t2\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\u0008 \u0010!\u00a8\u0006$\u00b2\u0006\u000c\u0010\"\u001a\u00020\u00138\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010#\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "Lp21/f;",
        "cardSize",
        "A",
        "(Landroidx/compose/ui/Modifier;Lp21/f;)Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lp21/g;",
        "state",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "l",
        "(Landroidx/compose/ui/Modifier;Lp21/g;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Lcom/whoop/design/util/TextResource;",
        "tag",
        "Lhy0/o1;",
        "tagStyle",
        "j",
        "(Lcom/whoop/design/util/TextResource;Lhy0/o1;Landroidx/compose/runtime/Composer;I)V",
        "",
        "showPlayIcon",
        "title",
        "subTitle",
        "v",
        "(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V",
        "Li2/x;",
        "color",
        "tint",
        "",
        "icon",
        "Ly3/f;",
        "iconSize",
        "x",
        "(JJIFLandroidx/compose/runtime/Composer;II)V",
        "isPressed",
        "imageModifier",
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
.method private static final A(Landroidx/compose/ui/Modifier;Lp21/f;)Landroidx/compose/ui/Modifier;
    .locals 1

    instance-of v0, p1, Lp21/f$a;

    if-eqz v0, :cond_0

    check-cast p1, Lp21/f$a;

    invoke-virtual {p1}, Lp21/f$a;->a()F

    move-result v0

    invoke-static {v0, p0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-virtual {p1}, Lp21/f$a;->b()F

    move-result p1

    invoke-static {p1, p0}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p1, Lp21/f$c;

    if-eqz v0, :cond_1

    check-cast p1, Lp21/f$c;

    invoke-virtual {p1}, Lp21/f$c;->a()F

    move-result p1

    invoke-static {p1, p0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object v0, Lp21/f$b;->a:Lp21/f$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const p1, 0x3fc7ae14    # 1.56f

    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static synthetic a(FLp21/g;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lp21/e;->p(FLp21/g;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(FLp21/g;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lp21/e;->q(FLp21/g;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp21/g;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lp21/e;->o(Lp21/g;Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lp21/g;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lp21/e;->u(Landroidx/compose/ui/Modifier;Lp21/g;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(JJIFIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lp21/e;->y(JJIFIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Lp21/e;->m()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lp21/e;->w(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/whoop/design/util/TextResource;Lhy0/o1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lp21/e;->k(Lcom/whoop/design/util/TextResource;Lhy0/o1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(IILp1/c1;Lmh/h;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lp21/e;->t(IILp1/c1;Lmh/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lcom/whoop/design/util/TextResource;Lhy0/o1;Landroidx/compose/runtime/Composer;I)V
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    check-cast v1, Lp1/q;

    const v2, -0x7bad8ab8

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_3

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    invoke-virtual {v1, v3}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v4, :cond_4

    move v3, v6

    goto :goto_3

    :cond_4
    move v3, v5

    :goto_3
    and-int/lit8 v4, v2, 0x1

    invoke-virtual {v1, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_8

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v4, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v4, v7

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->y:Lb2/m;

    invoke-static {v4, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v7, v1, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v1, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v9, v1, Lp1/q;->S:Z

    if-eqz v9, :cond_5

    invoke-virtual {v1, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_4
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v1, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v1, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-nez v7, :cond_6

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_7

    :cond_6
    invoke-static {v5, v1, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v1, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v3, v1, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->r()J

    move-result-wide v3

    and-int/lit8 v5, v2, 0xe

    shl-int/lit8 v2, v2, 0x18

    const/high16 v7, 0x70000000

    and-int/2addr v2, v7

    or-int v26, v5, v2

    const/16 v28, 0x0

    const v29, 0x7ffdfc

    move-object/from16 v25, v1

    move-wide v1, v3

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move v7, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 v11, p1

    invoke-static/range {v0 .. v29}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v1, v25

    const/4 v7, 0x1

    invoke-virtual {v1, v7}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_9

    new-instance v2, Lof2/d;

    const/16 v3, 0xc

    move-object/from16 v11, p1

    move/from16 v4, p3

    invoke-direct {v2, v0, v11, v4, v3}, Lof2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final k(Lcom/whoop/design/util/TextResource;Lhy0/o1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lp21/e;->j(Lcom/whoop/design/util/TextResource;Lhy0/o1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final l(Landroidx/compose/ui/Modifier;Lp21/g;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lp21/g;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, 0x43ca2dff

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v3, v4, 0x6

    move v5, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v4, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v1

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit8 v6, p5, 0x4

    const/16 v7, 0x100

    if-eqz v6, :cond_6

    or-int/lit16 v5, v5, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    move v9, v7

    goto :goto_3

    :cond_7
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v5, v9

    :goto_4
    and-int/lit16 v9, v5, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    const/4 v13, 0x1

    if-eq v9, v10, :cond_8

    move v9, v13

    goto :goto_5

    :cond_8
    move v9, v11

    :goto_5
    and-int/lit8 v10, v5, 0x1

    invoke-virtual {v12, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_11

    if-eqz v0, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_6

    :cond_9
    move-object v0, v3

    :goto_6
    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_b

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_a

    new-instance v6, Lou1/a;

    const/16 v8, 0xa

    invoke-direct {v6, v8}, Lou1/a;-><init>(I)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v6, Lc93/a;

    move-object v15, v6

    goto :goto_7

    :cond_b
    move-object v15, v8

    :goto_7
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_c

    invoke-static {v12}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v6

    :cond_c
    check-cast v6, Lj0/i;

    const/4 v8, 0x6

    invoke-static {v6, v12, v8}, Lge3/g;->m(Lj0/i;Lp1/q;I)Lp1/c1;

    move-result-object v9

    invoke-static {v9}, Lp21/e;->n(Lp1/t2;)Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-virtual {v2}, Lp21/g;->e()Z

    move-result v9

    if-eqz v9, :cond_d

    const/high16 v9, 0x3f000000    # 0.5f

    goto :goto_8

    :cond_d
    const/high16 v9, 0x3f800000    # 1.0f

    :goto_8
    invoke-virtual {v2}, Lp21/g;->a()Lp21/f;

    move-result-object v10

    invoke-static {v0, v10}, Lp21/e;->A(Landroidx/compose/ui/Modifier;Lp21/f;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    new-instance v10, Li3/i;

    invoke-direct {v10, v11}, Li3/i;-><init>(I)V

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    and-int/lit16 v5, v5, 0x380

    if-ne v5, v7, :cond_e

    move v5, v13

    goto :goto_9

    :cond_e
    move v5, v11

    :goto_9
    or-int/2addr v5, v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_f

    if-ne v7, v3, :cond_10

    :cond_f
    new-instance v7, Lox0/b;

    const/16 v3, 0x9

    invoke-direct {v7, v3, v2, v15}, Lox0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object/from16 v21, v7

    check-cast v21, Lc93/a;

    const/16 v22, 0xc

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, v6

    move-object/from16 v20, v10

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v3, v13

    int-to-float v1, v1

    mul-float/2addr v3, v1

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v12, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->t()J

    move-result-wide v7

    int-to-float v10, v11

    new-instance v1, Lis0/m;

    const/4 v3, 0x1

    invoke-direct {v1, v9, v2, v3}, Lis0/m;-><init>(FLjava/lang/Object;I)V

    const v3, -0x4634ad1e

    invoke-static {v3, v12, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    const/high16 v13, 0x1b0000

    const/16 v14, 0x18

    const/4 v9, 0x0

    invoke-static/range {v5 .. v14}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v0

    move-object v3, v15

    goto :goto_a

    :cond_11
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v1, v3

    move-object v3, v8

    :goto_a
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_12

    new-instance v0, Lot1/f;

    const/16 v6, 0x8

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lot1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc93/a;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final m()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final o(Lp21/g;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lp21/g;->e()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(FLp21/g;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p3, v2

    move-object v8, p2

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_5

    new-instance p2, Lp21/b;

    invoke-direct {p2, p0, p1}, Lp21/b;-><init>(FLp21/g;)V

    const p0, -0xf2a8b48

    invoke-static {p0, v8, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const/16 v9, 0xc00

    const/4 v10, 0x7

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v10}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll0/m;->c:Ll0/g;

    sget-object p2, Lb2/e;->M:Lb2/k;

    invoke-static {p0, p2, v8, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object p0

    iget-wide p2, v8, Lp1/q;->T:J

    invoke-static {p2, p3}, Ljava/lang/Long;->hashCode(J)I

    move-result p2

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object p3

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, La3/l;->a:La3/k;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-eqz v4, :cond_1

    invoke-virtual {v8, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v8, v1, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p0, La3/k;->f:La3/i;

    invoke-static {v8, p0, p3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p0, La3/k;->j:La3/i;

    iget-boolean p3, v8, Lp1/q;->S:Z

    if-nez p3, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_3

    :cond_2
    invoke-static {p2, v8, p2, p0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p0, La3/k;->d:La3/i;

    invoke-static {v8, p0, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const p0, 0x76135419

    invoke-virtual {v8, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p1}, Lp21/g;->g()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    if-nez p0, :cond_4

    const p0, 0x6e3265aa

    invoke-virtual {v8, p0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    const p2, 0x6e3265ab

    invoke-virtual {v8, p2}, Lp1/q;->e0(I)V

    invoke-virtual {p1}, Lp21/g;->h()Lhy0/o1;

    move-result-object p2

    invoke-static {p0, p2, v8, v3}, Lp21/e;->j(Lcom/whoop/design/util/TextResource;Lhy0/o1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    :goto_2
    invoke-virtual {p1}, Lp21/g;->e()Z

    move-result p0

    invoke-virtual {p1}, Lp21/g;->i()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    invoke-virtual {p1}, Lp21/g;->f()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p0, p2, p1, v8, v3}, Lp21/e;->v(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_5
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(FLp21/g;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 16

    move-object/from16 v0, p2

    const-string v1, "$this$BoxWithConstraints"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p3

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p4, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p4

    :goto_1
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v2, v3, :cond_2

    move v2, v4

    goto :goto_2

    :cond_2
    move v2, v5

    :goto_2
    and-int/2addr v1, v4

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v1, v2}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v1, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v13, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/c;

    check-cast v0, Landroidx/compose/foundation/layout/c;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/c;->d()F

    move-result v3

    invoke-interface {v2, v3}, Ly3/c;->q0(F)F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v13, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/c;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/c;->c()F

    move-result v0

    invoke-interface {v1, v0}, Ly3/c;->q0(F)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_3

    const/16 v1, 0x78

    int-to-float v1, v1

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v13, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v1, Lp1/c1;

    invoke-static {v1}, Lp21/e;->r(Lp1/c1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Lb2/e;->E:Lb2/m;

    sget-object v7, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v7, v4, v6}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move/from16 v6, p0

    invoke-static {v6, v4}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lp21/g;->c()Lkd1/o;

    move-result-object v6

    invoke-virtual {v13, v2}, Lp1/q;->e(I)Z

    move-result v7

    invoke-virtual {v13, v0}, Lp1/q;->e(I)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_4

    if-ne v8, v3, :cond_5

    :cond_4
    new-instance v8, Lp21/d;

    const/4 v3, 0x0

    invoke-direct {v8, v2, v0, v1, v3}, Lp21/d;-><init>(IILp1/c1;I)V

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v7, 0x0

    move-object v9, v13

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lp21/g;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_6

    const v0, 0x18285651

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v5}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    :goto_3
    move-object v7, v0

    goto :goto_4

    :cond_6
    const v1, 0x18285652

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    invoke-static {v0, v13, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v5}, Lp1/q;->q(Z)V

    goto :goto_3

    :goto_4
    const/16 v14, 0x6000

    const/16 v15, 0x68

    const/4 v9, 0x0

    sget-object v10, Ly2/j;->a:Ly2/b1;

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v8, v4

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_7
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final r(Lp1/c1;)Landroidx/compose/ui/Modifier;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/Modifier;

    return-object p0
.end method

.method private static final s(Lp1/c1;Landroidx/compose/ui/Modifier;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Landroidx/compose/ui/Modifier;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final t(IILp1/c1;Lmh/h;)Ll83/a0;
    .locals 1

    const-string v0, "$this$rememberImagePainter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p0, p1}, Lmh/h;->d(II)V

    new-instance p0, Lph/a;

    const/4 p1, 0x0

    const/4 v0, 0x3

    invoke-direct {p0, p1, v0}, Lph/a;-><init>(II)V

    iput-object p0, p3, Lmh/h;->j:Lph/e;

    new-instance p0, Lp21/e$a;

    invoke-direct {p0, p2}, Lp21/e$a;-><init>(Lp1/c1;)V

    iput-object p0, p3, Lmh/h;->e:Lmh/i;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Landroidx/compose/ui/Modifier;Lp21/g;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lp21/e;->l(Landroidx/compose/ui/Modifier;Lp21/g;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0xe87012a

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    :cond_5
    and-int/lit16 v6, v0, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x0

    if-eq v6, v7, :cond_6

    const/4 v6, 0x1

    goto :goto_4

    :cond_6
    move v6, v8

    :goto_4
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v11, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_14

    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v12, Lb2/e;->G:Lb2/m;

    invoke-static {v12, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    iget-wide v13, v11, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v11, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-eqz v8, :cond_7

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_5
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v11, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v11, v12, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-nez v9, :cond_8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v9, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    :cond_8
    invoke-static {v13, v11, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v11, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Ll0/a1;->x:Ll0/a1;

    invoke-static {v7, v9}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    const/4 v7, 0x2

    int-to-float v7, v7

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float v19, v7, v9

    const/4 v7, 0x3

    int-to-float v7, v7

    mul-float v21, v7, v9

    const/16 v22, 0x0

    const/16 v23, 0xa

    const/16 v20, 0x0

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move/from16 v10, v21

    const/4 v13, 0x0

    const/4 v6, 0x1

    invoke-static {v7, v13, v10, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v6, Lb2/e;->K:Lb2/l;

    sget-object v10, Ll0/m;->a:Ll0/e;

    const/16 v13, 0x30

    invoke-static {v10, v6, v11, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    move/from16 v31, v0

    iget-wide v0, v11, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {v11, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_a

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v11, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v12, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-nez v1, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    :cond_b
    invoke-static {v0, v11, v0, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v11, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    float-to-double v6, v0

    const-wide/16 v17, 0x0

    cmpl-double v1, v6, v17

    if-lez v1, :cond_d

    goto :goto_7

    :cond_d
    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v6, 0x1

    invoke-direct {v1, v0, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    double-to-float v0, v6

    mul-float/2addr v0, v9

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    sget-object v6, Lb2/e;->M:Lb2/k;

    const/4 v7, 0x6

    invoke-static {v0, v6, v11, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v9, v11, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_e

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_e
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v11, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v12, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_f

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    :cond_f
    invoke-static {v6, v11, v6, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    invoke-static {v11, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez v2, :cond_11

    const v0, -0x43e4fdc5

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move v1, v7

    goto :goto_9

    :cond_11
    const/4 v0, 0x0

    const v1, -0x43e4fdc4

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    shr-int/lit8 v1, v31, 0x3

    and-int/lit8 v1, v1, 0xe

    invoke-static {v2, v11, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v11, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->q()Lb91/a;

    move-result-object v25

    invoke-virtual {v1, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v8

    const/16 v29, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    move v1, v7

    move-wide v7, v8

    const-wide/16 v9, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v17, 0x1

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

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v32, v28

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v27

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_9
    if-nez v3, :cond_12

    const v1, -0x43e0ef26

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_a
    const/4 v6, 0x1

    goto :goto_b

    :cond_12
    const v5, -0x43e0ef25

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    shr-int/lit8 v5, v31, 0x6

    and-int/lit8 v5, v5, 0xe

    invoke-static {v3, v11, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6, v11, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->M()Lb91/a;

    move-result-object v25

    invoke-virtual {v6, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v7

    const/16 v29, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v27

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :goto_b
    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    if-eqz p0, :cond_13

    const v1, 0x742a116a

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    const/4 v12, 0x0

    const/16 v13, 0xf

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v13}, Lp21/e;->x(JJIFLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_c
    const/4 v6, 0x1

    goto :goto_d

    :cond_13
    const v1, 0x742ab696

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_c

    :goto_d
    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_14
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_15

    new-instance v0, Lar2/f;

    const/16 v5, 0x1b

    move/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Lar2/f;-><init>(ZLjava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final w(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lp21/e;->v(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final x(JJIFLandroidx/compose/runtime/Composer;II)V
    .locals 17

    move/from16 v7, p7

    move-object/from16 v13, p6

    check-cast v13, Lp1/q;

    const v0, 0xc087bd2

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    and-int/lit8 v0, p8, 0x1

    move-wide/from16 v2, p0

    if-nez v0, :cond_0

    invoke-virtual {v13, v2, v3}, Lp1/q;->f(J)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move-wide/from16 v2, p0

    move v0, v7

    :goto_1
    and-int/lit8 v4, v7, 0x30

    if-nez v4, :cond_4

    and-int/lit8 v4, p8, 0x2

    if-nez v4, :cond_2

    move-wide/from16 v4, p2

    invoke-virtual {v13, v4, v5}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    move-wide/from16 v4, p2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    goto :goto_3

    :cond_4
    move-wide/from16 v4, p2

    :goto_3
    and-int/lit16 v6, v7, 0x180

    if-nez v6, :cond_7

    and-int/lit8 v6, p8, 0x4

    if-nez v6, :cond_5

    move/from16 v6, p4

    invoke-virtual {v13, v6}, Lp1/q;->e(I)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_4

    :cond_5
    move/from16 v6, p4

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v0, v8

    goto :goto_5

    :cond_7
    move/from16 v6, p4

    :goto_5
    and-int/lit8 v8, p8, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move/from16 v9, p5

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v7, 0xc00

    if-nez v9, :cond_8

    move/from16 v9, p5

    invoke-virtual {v13, v9}, Lp1/q;->d(F)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_6

    :cond_a
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v0, v10

    :goto_7
    and-int/lit16 v10, v0, 0x493

    const/16 v11, 0x492

    const/4 v12, 0x0

    if-eq v10, v11, :cond_b

    const/4 v10, 0x1

    goto :goto_8

    :cond_b
    move v10, v12

    :goto_8
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v13, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_17

    invoke-virtual {v13}, Lp1/q;->Z()V

    and-int/lit8 v10, v7, 0x1

    const/4 v11, 0x6

    if-eqz v10, :cond_10

    invoke-virtual {v13}, Lp1/q;->C()Z

    move-result v10

    if-eqz v10, :cond_c

    goto :goto_9

    :cond_c
    invoke-virtual {v13}, Lp1/q;->X()V

    and-int/lit8 v8, p8, 0x1

    if-eqz v8, :cond_d

    and-int/lit8 v0, v0, -0xf

    :cond_d
    and-int/lit8 v8, p8, 0x2

    if-eqz v8, :cond_e

    and-int/lit8 v0, v0, -0x71

    :cond_e
    and-int/lit8 v8, p8, 0x4

    if-eqz v8, :cond_f

    and-int/lit16 v0, v0, -0x381

    :cond_f
    move v8, v0

    move v0, v9

    goto :goto_a

    :cond_10
    :goto_9
    and-int/lit8 v10, p8, 0x1

    if-eqz v10, :cond_11

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2, v13, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->u()J

    move-result-wide v2

    and-int/lit8 v0, v0, -0xf

    :cond_11
    and-int/lit8 v10, p8, 0x2

    if-eqz v10, :cond_12

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v13, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v4

    and-int/lit8 v0, v0, -0x71

    :cond_12
    and-int/lit8 v10, p8, 0x4

    if-eqz v10, :cond_13

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6}, Lx81/d;->d()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/i0;->p()I

    move-result v6

    and-int/lit16 v0, v0, -0x381

    :cond_13
    if-eqz v8, :cond_f

    int-to-float v8, v11

    int-to-float v9, v1

    mul-float/2addr v8, v9

    move/from16 v16, v8

    move v8, v0

    move/from16 v0, v16

    :goto_a
    invoke-virtual {v13}, Lp1/q;->r()V

    const/16 v9, 0xc

    int-to-float v9, v9

    int-to-float v1, v1

    mul-float/2addr v9, v1

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, Lt0/j;->a:Lt0/i;

    invoke-static {v9, v2, v3, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, Lb2/e;->E:Lb2/m;

    invoke-static {v10, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    move/from16 p6, v11

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v13, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v14, v13, Lp1/q;->S:Z

    if-eqz v14, :cond_14

    invoke-virtual {v13, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_14
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_b
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v13, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v13, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-nez v12, :cond_15

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_16

    :cond_15
    invoke-static {v11, v13, v11, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v13, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v9, v8, 0x3

    and-int/lit8 v9, v9, 0x70

    or-int/lit8 v9, v9, 0x6

    invoke-static {v6, v13, v9}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v9

    sget v10, Lgy0/f;->H1:I

    invoke-static {v13, v10}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    shl-int/lit8 v8, v8, 0x6

    and-int/lit16 v14, v8, 0x1c00

    const/4 v15, 0x0

    move-wide v11, v4

    move-object v8, v9

    move-object v9, v10

    move-object v10, v1

    const/4 v1, 0x1

    invoke-static/range {v8 .. v15}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    move-wide v1, v2

    move v5, v6

    move-wide v3, v11

    move v6, v0

    goto :goto_c

    :cond_17
    invoke-virtual {v13}, Lp1/q;->X()V

    move-wide v1, v2

    move-wide v3, v4

    move v5, v6

    move v6, v9

    :goto_c
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_18

    new-instance v0, Lp21/c;

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lp21/c;-><init>(JJIFII)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final y(JJIFIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-wide v1, p0

    move-wide v3, p2

    move v5, p4

    move v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lp21/e;->x(JJIFLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic z(Lp1/c1;Landroidx/compose/ui/Modifier;)V
    .locals 0

    invoke-static {p0, p1}, Lp21/e;->s(Lp1/c1;Landroidx/compose/ui/Modifier;)V

    return-void
.end method
