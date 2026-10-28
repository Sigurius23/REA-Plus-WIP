.class public abstract Lg71/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a;\u0010\n\u001a\u00020\t2\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\r\"\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\"\u001a\u0010\u0017\u001a\u00020\u00128\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "",
        "Lg71/d;",
        "zoomBuckets",
        "Li71/h;",
        "scrollPosition",
        "Lg71/a;",
        "zoomer",
        "Lh2/c;",
        "customRect",
        "Ll83/a0;",
        "b",
        "(Ljava/util/List;Li71/h;Lg71/a;Lh2/c;Landroidx/compose/runtime/Composer;II)V",
        "a",
        "Lg71/d;",
        "bucketOne",
        "bucketTwo",
        "c",
        "Li71/h;",
        "Lj71/b$m;",
        "d",
        "Lj71/b$m;",
        "getXAxisPlot",
        "()Lj71/b$m;",
        "xAxisPlot",
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
.field private static final a:Lg71/d;

.field private static final b:Lg71/d;

.field private static final c:Li71/h;

.field private static final d:Lj71/b$m;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lyy0/c;

    const-string v1, "Label_1"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget-object v2, Lg71/c$b;->w:Lg71/c$b;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v3

    const/16 v7, 0x32

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/high16 v4, 0x3e800000    # 0.25f

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lg71/d;

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-direct {v1, v2, v3, v0}, Lg71/d;-><init>(DLjava/util/List;)V

    sput-object v1, Lg71/c;->a:Lg71/d;

    new-instance v4, Lyy0/c;

    const-string v0, "Label_3"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v0, Lg71/c$c;->w:Lg71/c$c;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v7

    const/16 v11, 0x32

    const/4 v12, 0x0

    const/high16 v8, 0x3f000000    # 0.5f

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v2, Lg71/d;

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    invoke-direct {v2, v3, v4, v0}, Lg71/d;-><init>(DLjava/util/List;)V

    sput-object v2, Lg71/c;->b:Lg71/d;

    new-instance v5, Li71/h;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v6, v0

    const/16 v0, 0x20

    shl-long/2addr v3, v0

    const-wide v8, 0xffffffffL

    and-long/2addr v6, v8

    or-long/2addr v6, v3

    const/high16 v3, 0x44870000    # 1080.0f

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v10, v4

    const/high16 v4, 0x43c80000    # 400.0f

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v12

    int-to-long v12, v12

    shl-long/2addr v10, v0

    and-long/2addr v12, v8

    or-long/2addr v10, v12

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v12, v3

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    shl-long/2addr v12, v0

    and-long/2addr v3, v8

    or-long/2addr v3, v12

    const/16 v13, 0x8

    const/4 v14, 0x0

    const/4 v12, 0x0

    move-wide v8, v10

    move-wide v10, v3

    invoke-direct/range {v5 .. v14}, Li71/h;-><init>(JJJFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Lg71/c;->c:Li71/h;

    new-instance v6, Lj71/b$m;

    filled-new-array {v1, v2}, [Lg71/d;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lj71/b$m;-><init>(Ljava/util/List;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lg71/c;->d:Lj71/b$m;

    return-void
.end method

.method public static synthetic a(Ljava/util/List;Li71/h;Lg71/a;Lh2/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lg71/c;->c(Ljava/util/List;Li71/h;Lg71/a;Lh2/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/util/List;Li71/h;Lg71/a;Lh2/c;Landroidx/compose/runtime/Composer;II)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg71/d;",
            ">;",
            "Li71/h;",
            "Lg71/a;",
            "Lh2/c;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    const-string v0, "zoomBuckets"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v2, 0x53363023

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v5, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v5

    goto :goto_1

    :cond_1
    move v2, v5

    :goto_1
    and-int/lit8 v4, v5, 0x30

    if-nez v4, :cond_4

    and-int/lit8 v4, p6, 0x2

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    move-object/from16 v4, p1

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v2, v7

    goto :goto_3

    :cond_4
    move-object/from16 v4, p1

    :goto_3
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_7

    and-int/lit8 v7, p6, 0x4

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_4

    :cond_5
    move-object/from16 v7, p2

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v2, v8

    goto :goto_5

    :cond_7
    move-object/from16 v7, p2

    :goto_5
    and-int/lit8 v8, p6, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v2, v2, 0xc00

    :cond_8
    move-object/from16 v9, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v5, 0xc00

    if-nez v9, :cond_8

    move-object/from16 v9, p3

    invoke-virtual {v0, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_6

    :cond_a
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v2, v10

    :goto_7
    and-int/lit16 v10, v2, 0x493

    const/16 v11, 0x492

    const/4 v12, 0x1

    if-eq v10, v11, :cond_b

    move v10, v12

    goto :goto_8

    :cond_b
    const/4 v10, 0x0

    :goto_8
    and-int/2addr v2, v12

    invoke-virtual {v0, v2, v10}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1d

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v2, v5, 0x1

    const/4 v10, 0x0

    if-eqz v2, :cond_d

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_9

    :cond_c
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v2, v7

    move-object v6, v9

    goto :goto_d

    :cond_d
    :goto_9
    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_e

    new-instance v14, Li71/h;

    const/16 v22, 0xf

    const/16 v23, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v14 .. v23}, Li71/h;-><init>(JJJFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_a

    :cond_e
    move-object v14, v4

    :goto_a
    and-int/lit8 v2, p6, 0x4

    if-eqz v2, :cond_f

    new-instance v2, Lg71/a;

    invoke-direct {v2, v1}, Lg71/a;-><init>(Ljava/util/List;)V

    goto :goto_b

    :cond_f
    move-object v2, v7

    :goto_b
    if-eqz v8, :cond_10

    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v7, v4

    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    move-wide v15, v7

    const/16 p4, 0x20

    int-to-long v6, v4

    shl-long v8, v15, p4

    const-wide v15, 0xffffffffL

    and-long/2addr v6, v15

    or-long/2addr v6, v8

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v12, v4

    shl-long v8, v8, p4

    and-long/2addr v12, v15

    or-long/2addr v8, v12

    invoke-static {v6, v7, v8, v9}, Lhg3/i;->h(JJ)Lh2/c;

    move-result-object v4

    move-object v6, v4

    :goto_c
    move-object v4, v14

    goto :goto_d

    :cond_10
    move-object v6, v9

    goto :goto_c

    :goto_d
    invoke-virtual {v0}, Lp1/q;->r()V

    move-object v7, v1

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_11

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg71/d;

    invoke-virtual {v9}, Lg71/d;->a()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    invoke-static {v8, v9}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_e

    :cond_11
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v7, v9, :cond_13

    new-instance v7, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v8, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v7, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_f
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_12

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lyy0/c;

    invoke-static {v10}, Ld0/f;->a(F)Ld0/e;

    move-result-object v13

    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_12
    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v7, Ljava/util/List;

    invoke-virtual {v4}, Li71/h;->e()F

    move-result v12

    invoke-virtual {v2, v12}, Lg71/a;->a(F)Ljava/util/List;

    move-result-object v12

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v0, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    const/4 v15, 0x0

    if-nez v13, :cond_14

    if-ne v14, v9, :cond_15

    :cond_14
    new-instance v14, Lg71/c$a;

    invoke-direct {v14, v8, v12, v7, v15}, Lg71/c$a;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lq83/d;)V

    invoke-virtual {v0, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v14, Lc93/m;

    invoke-static {v0, v14, v12}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v6, v15, v3, v15}, Le61/h;->G(Landroidx/compose/ui/Modifier;Lh2/c;Lp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const-wide/high16 v13, 0x3fe0000000000000L    # 0.5

    double-to-float v13, v13

    const/16 v14, 0x8

    int-to-float v14, v14

    mul-float/2addr v13, v14

    invoke-static {v12, v13, v10, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v12, Lb2/e;->G:Lb2/m;

    const/4 v13, 0x0

    invoke-static {v12, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_16

    invoke-virtual {v0, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_16
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_10
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v0, v11, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v0, v11, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-nez v12, :cond_17

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_18

    :cond_17
    invoke-static {v13, v0, v13, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v0, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, 0x48098cd5

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v13, 0x0

    :goto_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v32, v13, 0x1

    if-ltz v13, :cond_1b

    check-cast v8, Lyy0/c;

    invoke-interface {v7, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ld0/e;

    invoke-virtual {v11}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    move-result v11

    invoke-virtual {v8}, Lyy0/c;->g()F

    move-result v12

    sget-object v13, Lp91/a;->e:Lp91/a$a;

    invoke-virtual {v13}, Lp91/a$a;->b()Lp91/a;

    move-result-object v13

    invoke-static {v9, v12, v10, v13}, Lp91/e;->j(Landroidx/compose/ui/Modifier;FFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-static {v11, v12}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v8}, Lyy0/c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    const/4 v13, 0x0

    invoke-static {v12, v0, v13}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8}, Lyy0/c;->c()Ly81/e;

    move-result-object v8

    if-nez v8, :cond_19

    const v8, -0xafa0eb6

    invoke-virtual {v0, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v13}, Lp1/q;->q(Z)V

    const/4 v8, 0x0

    goto :goto_12

    :cond_19
    const v14, 0x73424197

    invoke-virtual {v0, v14}, Lp1/q;->e0(I)V

    invoke-interface {v8, v0, v13}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v14

    invoke-static {v0, v13, v14, v15}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v8

    :goto_12
    const/4 v14, 0x6

    if-nez v8, :cond_1a

    const v8, 0x734246ab

    invoke-virtual {v0, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-static {v8, v0, v14, v13}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v15

    move-object/from16 p3, v11

    goto :goto_13

    :cond_1a
    const v15, 0x73423fa5

    invoke-virtual {v0, v15}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v13}, Lp1/q;->q(Z)V

    move-object/from16 p3, v11

    iget-wide v10, v8, Li2/x;->a:J

    move-wide v15, v10

    :goto_13
    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-virtual {v8, v0, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->F()Lb91/a;

    move-result-object v26

    invoke-virtual {v8, v0, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->F()Lb91/a;

    move-result-object v8

    invoke-virtual {v8}, Lb91/a;->d()Ll3/v0;

    move-result-object v8

    iget-object v8, v8, Ll3/v0;->a:Ll3/m0;

    iget-wide v10, v8, Ll3/m0;->b:J

    invoke-static {v10, v11}, Ly3/o;->c(J)F

    move-result v8

    sget-object v10, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v0, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ly3/c;

    const-wide v13, 0x100000000L

    invoke-static {v8, v13, v14, v10}, Lr80/c;->b(FJLy3/c;)J

    move-result-wide v10

    const/16 v30, 0x0

    const v31, 0x2fff0

    move-object v8, v6

    move-object v6, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v18, v8

    move-object/from16 v19, v9

    move-wide v8, v15

    const-wide/16 v15, 0x0

    const/16 v20, 0x0

    const/16 v17, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move-object/from16 v22, v19

    move/from16 v23, v20

    const-wide/16 v19, 0x0

    move-object/from16 v24, v21

    const/16 v21, 0x0

    move-object/from16 v25, v22

    const/16 v22, 0x0

    move/from16 v27, v23

    const/16 v23, 0x0

    move-object/from16 v28, v24

    const/16 v24, 0x0

    move-object/from16 v29, v25

    const/16 v25, 0x0

    move/from16 v33, v27

    const/16 v27, 0x0

    move-object/from16 v34, v29

    const/16 v29, 0x0

    move-object/from16 p1, v28

    const/16 v35, 0x0

    const/16 v36, 0x0

    move-object/from16 v28, v0

    move/from16 v0, v33

    move-object/from16 v33, v7

    move-object/from16 v7, p3

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, p1

    move-object/from16 v0, v28

    move/from16 v13, v32

    move-object/from16 v7, v33

    move-object/from16 v9, v34

    move/from16 v10, v35

    goto/16 :goto_11

    :cond_1b
    const/16 v36, 0x0

    invoke-static {}, Lwb3/f;->d0()V

    throw v36

    :cond_1c
    move-object/from16 p1, v6

    move-object v6, v0

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    const/4 v11, 0x1

    invoke-virtual {v6, v11}, Lp1/q;->q(Z)V

    move-object v3, v2

    move-object v2, v4

    move-object/from16 v4, p1

    goto :goto_14

    :cond_1d
    move-object v6, v0

    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v2, v4

    move-object v3, v7

    move-object v4, v9

    :goto_14
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1e

    new-instance v0, Lg1/m3;

    const/4 v7, 0x2

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lg1/m3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method private static final c(Ljava/util/List;Li71/h;Lg71/a;Lh2/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lg71/c;->b(Ljava/util/List;Li71/h;Lg71/a;Lh2/c;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
