.class public abstract Ljd2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a3\u0010\u000b\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00080\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u000f\u0010\r\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0019\u0010\u0011\u001a\u00020\u00042\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lhd2/a;",
        "state",
        "Ll83/a0;",
        "n",
        "(Landroidx/compose/ui/Modifier;Lhd2/a;Landroidx/compose/runtime/Composer;II)V",
        "",
        "Ll83/k;",
        "",
        "coordinates",
        "i",
        "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "p",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "activityIconUrl",
        "g",
        "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V",
        "share_release"
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ljd2/b;->q(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    move-object v0, p1

    move-object p1, p0

    move-object p0, v0

    invoke-static/range {p0 .. p5}, Ljd2/b;->j(Ljava/util/List;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/List;JLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ljd2/b;->k(Ljava/util/List;JLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ljd2/b;->h(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Lhd2/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ljd2/b;->o(Landroidx/compose/ui/Modifier;Lhd2/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/Modifier;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    move-object v0, p1

    move-object p1, p0

    move-object p0, v0

    invoke-static/range {p0 .. p5}, Ljd2/b;->m(Ljava/util/List;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v3, p1

    check-cast v3, Lp1/q;

    const p1, 0x717ed9c2

    invoke-virtual {v3, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    if-nez p1, :cond_1

    invoke-virtual {v3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 v1, p1, 0x3

    const/4 v2, 0x1

    if-eq v1, v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    and-int/2addr p1, v2

    invoke-virtual {v3, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_4

    if-eqz p0, :cond_3

    new-instance v4, Lkd1/o$c;

    sget v6, Lgy0/a;->N2:I

    const/16 v9, 0xc

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, p0

    invoke-direct/range {v4 .. v10}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_3
    move-object v0, v4

    goto :goto_4

    :cond_3
    new-instance v4, Lkd1/o$a;

    sget p1, Lgy0/a;->N2:I

    invoke-direct {v4, p1}, Lkd1/o$a;-><init>(I)V

    goto :goto_3

    :goto_4
    sget v4, Lkd1/o;->a:I

    const/4 v5, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v0

    const/16 p1, 0x28

    int-to-float p1, p1

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {p1, v3, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p1

    invoke-virtual {p1}, Ly81/i;->y()J

    move-result-wide v4

    new-instance v6, Li2/p;

    const/4 p1, 0x5

    invoke-direct {v6, v4, v5, p1}, Li2/p;-><init>(JI)V

    const/16 v8, 0x1b0

    const/16 v9, 0x38

    const/4 v1, 0x0

    move-object v7, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v7

    goto :goto_5

    :cond_4
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance v0, Lcp0/a;

    const/16 v1, 0xd

    invoke-direct {v0, p0, p2, v1}, Lcp0/a;-><init>(Ljava/lang/String;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final h(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ljd2/b;->g(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ll83/k;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    check-cast p2, Lp1/q;

    const v0, 0x457b80a8

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

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

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_2

    :cond_3
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_4
    :goto_3
    and-int/lit8 v3, v0, 0x13

    const/16 v4, 0x12

    if-eq v3, v4, :cond_5

    const/4 v3, 0x1

    goto :goto_4

    :cond_5
    const/4 v3, 0x0

    :goto_4
    and-int/lit8 v4, v0, 0x1

    invoke-virtual {p2, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_a

    if-eqz v2, :cond_6

    sget-object p1, Lb2/t;->w:Lb2/t;

    :cond_6
    move-object v4, p1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    if-ge p1, v1, :cond_7

    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_b

    new-instance v2, Le81/g;

    const/4 v7, 0x2

    move-object v3, p0

    move v5, p3

    move v6, p4

    invoke-direct/range {v2 .. v7}, Le81/g;-><init>(Ljava/util/List;Landroidx/compose/ui/Modifier;III)V

    iput-object v2, p1, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_7
    move-object v3, p0

    move v5, p3

    move v6, p4

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p1, Lx81/d;->b:I

    invoke-virtual {p0, p2, p1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->y()J

    move-result-wide p0

    invoke-virtual {p2, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {p2, p0, p1}, Lp1/q;->f(J)Z

    move-result p4

    or-int/2addr p3, p4

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    if-nez p3, :cond_8

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p4, p3, :cond_9

    :cond_8
    new-instance p4, Ljd2/a;

    const/4 p3, 0x0

    invoke-direct {p4, v3, p3, p0, p1}, Ljd2/a;-><init>(Ljava/util/List;IJ)V

    invoke-virtual {p2, p4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast p4, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 p0, v0, 0x3

    and-int/lit8 p0, p0, 0xe

    invoke-static {v4, p4, p2, p0}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object p1, v4

    goto :goto_5

    :cond_a
    move-object v3, p0

    move v5, p3

    move v6, p4

    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_b

    move-object v4, v3

    new-instance v3, Le81/g;

    const/4 v8, 0x3

    move v7, v6

    move v6, v5

    move-object v5, p1

    invoke-direct/range {v3 .. v8}, Le81/g;-><init>(Ljava/util/List;Landroidx/compose/ui/Modifier;III)V

    iput-object v3, p0, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final j(Ljava/util/List;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ljd2/b;->i(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Ljava/util/List;JLk2/e;)Ll83/a0;
    .locals 27

    move-object/from16 v0, p3

    const-string v1, "$this$Canvas"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll83/k;

    iget-object v5, v5, Ll83/k;->w:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll83/k;

    iget-object v5, v5, Ll83/k;->x:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {v2}, Lm83/s;->Z0(Ljava/util/ArrayList;)D

    move-result-wide v5

    invoke-static {v2}, Lm83/s;->V0(Ljava/util/ArrayList;)D

    move-result-wide v14

    invoke-static {v4}, Lm83/s;->Z0(Ljava/util/ArrayList;)D

    move-result-wide v8

    invoke-static {v4}, Lm83/s;->V0(Ljava/util/ArrayList;)D

    move-result-wide v2

    sub-double v4, v14, v5

    const-wide v6, 0x3f1a36e2eb1c432dL    # 1.0E-4

    cmpg-double v10, v4, v6

    if-gez v10, :cond_2

    move-wide/from16 v16, v6

    goto :goto_2

    :cond_2
    move-wide/from16 v16, v4

    :goto_2
    sub-double/2addr v2, v8

    cmpg-double v4, v2, v6

    if-gez v4, :cond_3

    move-wide v10, v6

    goto :goto_3

    :cond_3
    move-wide v10, v2

    :goto_3
    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v2

    invoke-static {v2, v3}, Lh2/e;->d(J)F

    move-result v2

    const v3, 0x3dcccccd    # 0.1f

    mul-float v7, v2, v3

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v2

    const/16 v4, 0x20

    shr-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const/4 v3, 0x2

    int-to-float v3, v3

    mul-float/2addr v3, v7

    sub-float v12, v2, v3

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v5

    const-wide v23, 0xffffffffL

    and-long v5, v5, v23

    long-to-int v2, v5

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    sub-float v18, v2, v3

    move-object v2, v1

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v1

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v3, 0x1

    if-ltz v3, :cond_5

    check-cast v5, Ll83/k;

    iget-object v13, v5, Ll83/k;->w:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v19

    iget-object v5, v5, Ll83/k;->x:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v21

    move v13, v7

    invoke-static/range {v7 .. v22}, Ljd2/b;->l(FDDFFDDFDD)J

    move-result-wide v19

    if-nez v3, :cond_4

    move v3, v4

    shr-long v4, v19, v3

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    move v5, v3

    move v13, v4

    and-long v3, v19, v23

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-virtual {v1, v13, v3}, Li2/j;->i(FF)V

    move v4, v6

    goto :goto_5

    :cond_4
    move v5, v4

    shr-long v3, v19, v5

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    move v4, v6

    and-long v5, v19, v23

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    invoke-virtual {v1, v3, v5}, Li2/j;->h(FF)V

    :goto_5
    move v3, v4

    const/16 v4, 0x20

    goto :goto_4

    :cond_5
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_6
    new-instance v19, Lk2/i;

    const/4 v2, 0x3

    int-to-float v2, v2

    invoke-interface {v0, v2}, Ly3/c;->q0(F)F

    move-result v20

    const/16 v24, 0x0

    const/16 v25, 0x12

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x1

    invoke-direct/range {v19 .. v25}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/16 v6, 0x34

    const/4 v4, 0x0

    move-wide/from16 v2, p1

    move-object/from16 v5, v19

    invoke-static/range {v0 .. v6}, Lk2/e;->z(Lk2/e;Li2/s0;JFLk2/f;I)V

    const/4 v1, 0x5

    int-to-float v1, v1

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v3

    invoke-static/range {p0 .. p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll83/k;

    iget-object v2, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v19

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v21

    invoke-static/range {p0 .. p0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll83/k;

    iget-object v2, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v23

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v25

    move v13, v7

    invoke-static/range {v7 .. v22}, Ljd2/b;->l(FDDFFDDFDD)J

    move-result-wide v4

    move/from16 v19, v18

    move/from16 v18, v12

    move-wide v11, v10

    move-wide v9, v8

    const/4 v7, 0x0

    const/16 v8, 0x78

    const/4 v6, 0x0

    move-wide/from16 v1, p1

    invoke-static/range {v0 .. v8}, Lk2/e;->M(Lk2/e;JFJFLk2/f;I)V

    move v7, v13

    move-wide v8, v9

    move-wide v10, v11

    move/from16 v12, v18

    move/from16 v18, v19

    move-wide/from16 v19, v23

    move-wide/from16 v21, v25

    invoke-static/range {v7 .. v22}, Ljd2/b;->l(FDDFFDDFDD)J

    move-result-wide v4

    const/4 v7, 0x0

    const/16 v8, 0x78

    move-object/from16 v0, p3

    invoke-static/range {v0 .. v8}, Lk2/e;->M(Lk2/e;JFJFLk2/f;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final l(FDDFFDDFDD)J
    .locals 0

    sub-double p1, p14, p1

    div-double/2addr p1, p3

    float-to-double p3, p5

    mul-double/2addr p1, p3

    double-to-float p1, p1

    add-float/2addr p0, p1

    sub-double/2addr p7, p12

    div-double/2addr p7, p9

    float-to-double p1, p11

    mul-double/2addr p7, p1

    double-to-float p1, p7

    add-float/2addr p6, p1

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    invoke-static {p6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long p2, p2

    const/16 p4, 0x20

    shl-long/2addr p0, p4

    const-wide p4, 0xffffffffL

    and-long/2addr p2, p4

    or-long/2addr p0, p2

    return-wide p0
.end method

.method private static final m(Ljava/util/List;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ljd2/b;->i(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final n(Landroidx/compose/ui/Modifier;Lhd2/a;Landroidx/compose/runtime/Composer;II)V
    .locals 14

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v0, 0x70402a65

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v2, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    invoke-virtual {v8, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_2
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v8, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_4
    and-int/lit8 v4, v2, 0x13

    const/16 v5, 0x12

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v4, v5, :cond_5

    move v4, v12

    goto :goto_3

    :cond_5
    move v4, v11

    :goto_3
    and-int/2addr v2, v12

    invoke-virtual {v8, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_c

    sget-object v2, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_6

    move-object p0, v2

    :cond_6
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v4, 0x5

    int-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    const/4 v6, 0x0

    invoke-static {v0, v6, v4, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lb2/e;->N:Lb2/k;

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v7, 0x30

    invoke-static {v6, v4, v8, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v13, v8, Lp1/q;->S:Z

    if-eqz v13, :cond_7

    invoke-virtual {v8, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_4
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v8, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v8, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-nez v9, :cond_8

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    :cond_8
    invoke-static {v6, v8, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v8, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v11}, Ljd2/b;->p(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1}, Lhd2/a;->b()Ljava/util/List;

    move-result-object v0

    const/16 v4, 0xa0

    int-to-float v4, v4

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v0, v4, v8, v7, v11}, Ljd2/b;->i(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    int-to-float v0, v1

    mul-float/2addr v0, v5

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v8, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {p1}, Lhd2/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v8, v11}, Ljd2/b;->g(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1}, Lhd2/a;->c()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_b

    const v1, 0x58938117

    invoke-static {v8, v1, v2, v0, v8}, Lte0/d;->z(Lp1/q;ILb2/t;FLp1/q;)V

    invoke-virtual {p1}, Lhd2/a;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lm91/o;

    sget v9, Lm91/o;->c:I

    const/16 v10, 0xe

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v10}, Lm91/l;->q(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_a
    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_b
    const v0, 0x589642d3

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    :goto_7
    move-object v1, p0

    goto :goto_8

    :cond_c
    invoke-virtual {v8}, Lp1/q;->X()V

    goto :goto_7

    :goto_8
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_d

    new-instance v0, Lio2/k0;

    const/4 v5, 0x3

    move-object v3, p1

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lio2/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final o(Landroidx/compose/ui/Modifier;Lhd2/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ljd2/b;->n(Landroidx/compose/ui/Modifier;Lhd2/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Landroidx/compose/runtime/Composer;I)V
    .locals 10

    move-object v7, p0

    check-cast v7, Lp1/q;

    const p0, -0xcb27387

    invoke-virtual {v7, p0}, Lp1/q;->g0(I)Lp1/q;

    const/4 p0, 0x0

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, p0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v7, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lgy0/a;->Q4:I

    invoke-static {v0, v7, p0}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    const/16 p0, 0x4b

    int-to-float p0, p0

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {p0, v1}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/16 v1, 0x10

    int-to-float v1, v1

    invoke-static {v1, p0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {p0, v7, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->y()J

    move-result-wide v3

    new-instance v6, Li2/p;

    const/4 p0, 0x5

    invoke-direct {v6, v3, v4, p0}, Li2/p;-><init>(JI)V

    const/16 v8, 0x1b0

    const/16 v9, 0x38

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lhy0/e0;

    const/16 v1, 0xe

    invoke-direct {v0, p1, v1}, Lhy0/e0;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final q(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Ljd2/b;->p(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
