.class public abstract Lwl0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\u001a#\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a!\u0010\t\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u0014\u00b2\u0006\u000e\u0010\u000c\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0012\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\r8\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u0011\u001a\u00020\u000f8\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\u0012\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0013\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lwl0/b;",
        "bucketProvider",
        "Ll83/a0;",
        "d",
        "(Landroidx/compose/ui/Modifier;Lwl0/b;Landroidx/compose/runtime/Composer;II)V",
        "",
        "text",
        "i",
        "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V",
        "",
        "messageIndex",
        "",
        "textResources",
        "",
        "textViewSize",
        "shimmerPosition",
        "textIndex",
        "displayText",
        "bot_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lwl0/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lwl0/a;->h(Landroidx/compose/ui/Modifier;Lwl0/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lwl0/a;->l(Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/z0;Ly2/y;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lwl0/a;->k(Lp1/z0;Ly2/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lwl0/b;Landroidx/compose/runtime/Composer;II)V
    .locals 11

    check-cast p2, Lp1/q;

    const v0, 0x5e89da4

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_2

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_2
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_4

    and-int/lit8 v2, p4, 0x2

    if-nez v2, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_2

    :cond_3
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_4
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x0

    if-eq v2, v3, :cond_5

    const/4 v2, 0x1

    goto :goto_3

    :cond_5
    move v2, v4

    :goto_3
    and-int/lit8 v3, v1, 0x1

    invoke-virtual {p2, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {p2}, Lp1/q;->Z()V

    and-int/lit8 v2, p3, 0x1

    if-eqz v2, :cond_7

    invoke-virtual {p2}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {p2}, Lp1/q;->X()V

    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_9

    :goto_4
    and-int/lit8 v1, v1, -0x71

    goto :goto_6

    :cond_7
    :goto_5
    if-eqz v0, :cond_8

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_8
    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_9

    new-instance p1, Lwl0/b;

    invoke-direct {p1}, Lwl0/b;-><init>()V

    goto :goto_4

    :cond_9
    :goto_6
    invoke-virtual {p2}, Lp1/q;->r()V

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v0, v2, :cond_a

    invoke-static {v4, p2}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v0

    :cond_a
    check-cast v0, Lp1/a1;

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_b

    invoke-virtual {p1}, Lwl0/b;->a()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {p2, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v3, Lp1/c1;

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_c

    new-instance v5, Lwl0/a$a;

    const/4 v2, 0x0

    invoke-direct {v5, v0, v3, v2}, Lwl0/a$a;-><init>(Lp1/a1;Lp1/c1;Lq83/d;)V

    invoke-virtual {p2, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v5, Lc93/m;

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    invoke-static {p2, v5, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3}, Lwl0/a;->g(Lp1/c1;)Ljava/util/List;

    move-result-object v2

    invoke-static {v0}, Lwl0/a;->e(Lp1/a1;)I

    move-result v0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0, p2, v4}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    and-int/lit8 v1, v1, 0xe

    invoke-static {p0, v0, p2, v1, v4}, Lwl0/a;->i(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    :goto_7
    move-object v6, p0

    move-object v8, p1

    goto :goto_8

    :cond_d
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_7

    :goto_8
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_e

    new-instance v5, Lt80/b;

    const/16 v10, 0x1b

    move v7, p3

    move v9, p4

    invoke-direct/range {v5 .. v10}, Lt80/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v5, p0, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final e(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final f(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final g(Lp1/c1;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static final h(Landroidx/compose/ui/Modifier;Lwl0/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lwl0/a;->d(Landroidx/compose/ui/Modifier;Lwl0/b;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
    .locals 29

    move-object/from16 v2, p1

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v0, 0x16bbd394

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v3, p3, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v8, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    const/16 v11, 0x20

    if-nez v5, :cond_4

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v11

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_4
    move v12, v4

    and-int/lit8 v4, v12, 0x13

    const/16 v5, 0x12

    const/4 v13, 0x0

    if-eq v4, v5, :cond_5

    const/4 v4, 0x1

    goto :goto_3

    :cond_5
    move v4, v13

    :goto_3
    and-int/lit8 v5, v12, 0x1

    invoke-virtual {v8, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_f

    if-eqz v0, :cond_6

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_4

    :cond_6
    move-object v0, v3

    :goto_4
    const-string v3, "shimmerEffect"

    invoke-static {v3, v8, v13}, Ld0/f;->s(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/l0;

    move-result-object v3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    const/4 v15, 0x0

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_7

    invoke-static {v15, v8}, Ld;->v(FLp1/q;)Lp1/g1;

    move-result-object v4

    :cond_7
    check-cast v4, Lp1/z0;

    move-object v6, v5

    invoke-static {v4}, Lwl0/a;->j(Lp1/z0;)F

    move-result v5

    sget-object v7, Ld0/b0;->c:Lb23/h;

    new-instance v9, Ld0/e2;

    const/16 v10, 0x5dc

    const/16 v14, 0x3e8

    invoke-direct {v9, v10, v14, v7}, Ld0/e2;-><init>(IILd0/z;)V

    const/4 v14, 0x0

    const/4 v7, 0x6

    invoke-static {v9, v14, v7}, Ld0/f;->q(Ld0/y;Ld0/v0;I)Ld0/i0;

    move-result-object v7

    const/16 v9, 0x7038

    const/4 v10, 0x0

    move-object/from16 v16, v4

    const/4 v4, 0x0

    move-object/from16 v17, v6

    move-object v6, v7

    const-string v7, "animateShimmer"

    move/from16 p0, v15

    move-object/from16 v15, v16

    move-object/from16 v1, v17

    invoke-static/range {v3 .. v10}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object v3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_8

    invoke-static {v13, v8}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v4

    :cond_8
    check-cast v4, Lp1/a1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_9

    const-string v5, ""

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lp1/c1;

    and-int/lit8 v6, v12, 0x70

    if-ne v6, v11, :cond_a

    const/4 v13, 0x1

    :cond_a
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v13, :cond_b

    if-ne v6, v1, :cond_c

    :cond_b
    new-instance v6, Lwl0/a$b;

    invoke-direct {v6, v2, v4, v5, v14}, Lwl0/a$b;-><init>(Ljava/lang/String;Lp1/a1;Lp1/c1;Lq83/d;)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v6, Lc93/m;

    invoke-static {v8, v6, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v8, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly3/c;

    const/4 v6, 0x2

    int-to-float v6, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    invoke-interface {v4, v6}, Ly3/c;->q0(F)F

    move-result v4

    const-string v6, "ShimmerText"

    invoke-static {v0, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_d

    new-instance v7, Lm22/n;

    const/4 v1, 0x2

    invoke-direct {v7, v15, v1}, Lm22/n;-><init>(Lp1/z0;I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v7}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5}, Lwl0/a;->q(Lp1/c1;)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-static {v6, v8, v7}, Lte0/d;->t(Lx81/d;Lp1/q;I)Ll3/v0;

    move-result-object v12

    sget-object v13, Li2/t;->b:Li2/s;

    invoke-static/range {p0 .. p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    const-wide v14, 0x80ffffffL

    move/from16 p2, v11

    move-object v10, v12

    invoke-static {v14, v15}, Li2/w0;->e(J)J

    move-result-wide v11

    move-wide/from16 v16, v14

    new-instance v14, Li2/x;

    invoke-direct {v14, v11, v12}, Li2/x;-><init>(J)V

    new-instance v11, Ll83/k;

    invoke-direct {v11, v9, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v9, 0x3f000000    # 0.5f

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    const-wide v18, 0xffffffffL

    invoke-static/range {v18 .. v19}, Li2/w0;->e(J)J

    move-result-wide v14

    new-instance v12, Li2/x;

    invoke-direct {v12, v14, v15}, Li2/x;-><init>(J)V

    new-instance v14, Ll83/k;

    invoke-direct {v14, v9, v12}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    move-object/from16 v28, v0

    move-object/from16 v21, v1

    invoke-static/range {v16 .. v17}, Li2/w0;->e(J)J

    move-result-wide v0

    new-instance v12, Li2/x;

    invoke-direct {v12, v0, v1}, Li2/x;-><init>(J)V

    new-instance v0, Ll83/k;

    invoke-direct {v0, v9, v12}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v11, v14, v0}, [Ll83/k;

    move-result-object v14

    invoke-static {v3}, Lwl0/a;->n(Lp1/t2;)F

    move-result v0

    sub-float/2addr v0, v4

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    const/high16 v9, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v11

    int-to-long v11, v11

    shl-long v0, v0, p2

    and-long v11, v11, v18

    or-long v15, v0, v11

    invoke-static {v3}, Lwl0/a;->n(Lp1/t2;)F

    move-result v0

    cmpg-float v0, v0, p0

    if-nez v0, :cond_e

    move/from16 v0, p0

    goto :goto_5

    :cond_e
    invoke-static {v3}, Lwl0/a;->n(Lp1/t2;)F

    move-result v0

    add-float/2addr v0, v4

    :goto_5
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    shl-long v0, v0, p2

    and-long v3, v3, v18

    or-long v17, v0, v3

    const/16 v19, 0x8

    invoke-static/range {v13 .. v19}, Li2/s;->e(Li2/s;[Ll83/k;JJI)Li2/k0;

    move-result-object v13

    const-wide/16 v18, 0x0

    const v20, 0x1fffffe

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v12, v10

    invoke-static/range {v12 .. v20}, Ll3/v0;->a(Ll3/v0;Li2/t;JLp3/r;Lp3/i;JI)Ll3/v0;

    move-result-object v23

    invoke-virtual {v6, v8, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v0

    const/16 v26, 0x0

    const v27, 0xfff8

    move-object/from16 v24, v8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v4, v21

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    move-object v3, v5

    move-wide v5, v0

    invoke-static/range {v3 .. v27}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v24

    move-object/from16 v1, v28

    goto :goto_6

    :cond_f
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v1, v3

    :goto_6
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_10

    new-instance v0, Leo2/l;

    const/16 v5, 0x9

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Leo2/l;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final j(Lp1/z0;)F
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0}, Lp1/g1;->x()F

    move-result p0

    return p0
.end method

.method private static final k(Lp1/z0;Ly2/y;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ly2/y;->n()J

    move-result-wide v0

    const/16 p1, 0x20

    shr-long/2addr v0, p1

    long-to-int p1, v0

    int-to-float p1, p1

    invoke-static {p0, p1}, Lwl0/a;->m(Lp1/z0;F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lwl0/a;->i(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lp1/z0;F)V
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0, p1}, Lp1/g1;->y(F)V

    return-void
.end method

.method private static final n(Lp1/t2;)F
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

.method private static final o(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final p(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final q(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final r(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic s(Lp1/a1;)I
    .locals 0

    invoke-static {p0}, Lwl0/a;->e(Lp1/a1;)I

    move-result p0

    return p0
.end method

.method public static final synthetic t(Lp1/a1;I)V
    .locals 0

    invoke-static {p0, p1}, Lwl0/a;->f(Lp1/a1;I)V

    return-void
.end method

.method public static final synthetic u(Lp1/c1;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lwl0/a;->g(Lp1/c1;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic v(Lp1/a1;)I
    .locals 0

    invoke-static {p0}, Lwl0/a;->o(Lp1/a1;)I

    move-result p0

    return p0
.end method

.method public static final synthetic w(Lp1/a1;I)V
    .locals 0

    invoke-static {p0, p1}, Lwl0/a;->p(Lp1/a1;I)V

    return-void
.end method

.method public static final synthetic x(Lp1/c1;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lwl0/a;->r(Lp1/c1;Ljava/lang/String;)V

    return-void
.end method
