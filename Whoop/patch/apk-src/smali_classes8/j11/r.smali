.class public abstract Lj11/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0008\u0003\u001a=\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a-\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lorg/joda/time/LocalDate;",
        "startingDate",
        "",
        "daysToShow",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onDateSelected",
        "d",
        "(Lorg/joda/time/LocalDate;ILzr2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "h",
        "(ILzr2/a;Lorg/joda/time/LocalDate;)Ljava/util/List;",
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lorg/joda/time/LocalDate;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lj11/r;->e(Lkotlin/jvm/functions/Function1;Lorg/joda/time/LocalDate;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lorg/joda/time/LocalDate;ILzr2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lj11/r;->g(Lorg/joda/time/LocalDate;ILzr2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lorg/joda/time/LocalDate;Lzr2/a;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lj11/r;->f(Lorg/joda/time/LocalDate;Lzr2/a;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lorg/joda/time/LocalDate;ILzr2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/joda/time/LocalDate;",
            "I",
            "Lzr2/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "startingDate"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateAndTimeProvider"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDateSelected"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, -0x4a50ee3f

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_2

    move/from16 v6, p1

    invoke-virtual {v11, v6}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_6

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_4

    :cond_5
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :cond_6
    and-int/lit16 v7, v5, 0xc00

    const/16 v14, 0x800

    if-nez v7, :cond_8

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    move v7, v14

    goto :goto_5

    :cond_7
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v0, v7

    :cond_8
    and-int/lit16 v7, v0, 0x493

    const/16 v8, 0x492

    const/4 v15, 0x0

    const/16 v16, 0x1

    if-eq v7, v8, :cond_9

    move/from16 v7, v16

    goto :goto_6

    :cond_9
    move v7, v15

    :goto_6
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v11, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_e

    if-eqz v2, :cond_a

    const/16 v2, 0x14

    goto :goto_7

    :cond_a
    move v2, v6

    :goto_7
    invoke-static {v2, v3, v1}, Lj11/r;->h(ILzr2/a;Lorg/joda/time/LocalDate;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_8
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/joda/time/LocalDate;

    and-int/lit16 v7, v0, 0x1c00

    if-ne v7, v14, :cond_b

    move/from16 v7, v16

    goto :goto_9

    :cond_b
    move v7, v15

    :goto_9
    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_c

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v8, v7, :cond_d

    :cond_c
    new-instance v8, Lj11/q;

    const/4 v7, 0x0

    invoke-direct {v8, v7, v4, v6}, Lj11/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v8, Lc93/a;

    new-instance v7, Lih1/f;

    const/4 v9, 0x3

    invoke-direct {v7, v9, v6, v3}, Lih1/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v6, -0x72ab233e

    invoke-static {v6, v11, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const/high16 v12, 0x30000

    const/16 v13, 0x1e

    const/4 v7, 0x0

    move-object v6, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v13}, Lg1/f0;->b(Lc93/a;Landroidx/compose/ui/Modifier;ZLl0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_8

    :cond_e
    invoke-virtual {v11}, Lp1/q;->X()V

    move v2, v6

    :cond_f
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_10

    new-instance v0, Lh00/i;

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lh00/i;-><init>(Lorg/joda/time/LocalDate;ILzr2/a;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Lorg/joda/time/LocalDate;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lorg/joda/time/LocalDate;Lzr2/a;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    move-object/from16 v0, p0

    const-string v1, "$this$DropdownMenuItem"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p4, 0x11

    const/16 v2, 0x10

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    and-int/lit8 v2, p4, 0x1

    move-object/from16 v3, p3

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface/range {p1 .. p1}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const v1, -0x746f41c9

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v4}, Lp1/q;->q(Z)V

    const-string v1, "EE MMM d"

    invoke-virtual {v0, v1}, Lorg/joda/time/LocalDate;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    move-object v5, v0

    goto :goto_2

    :cond_1
    const v0, -0x746f3e5a

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    sget v0, Lgy0/f;->C2:I

    invoke-static {v0, v3, v4}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4}, Lp1/q;->q(Z)V

    goto :goto_1

    :goto_2
    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v28, 0x0

    const v29, 0x1fffe

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

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

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v3

    invoke-static/range {v5 .. v29}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_2
    move-object/from16 v26, v3

    invoke-virtual/range {v26 .. v26}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lorg/joda/time/LocalDate;ILzr2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lj11/r;->d(Lorg/joda/time/LocalDate;ILzr2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(ILzr2/a;Lorg/joda/time/LocalDate;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lzr2/a;",
            "Lorg/joda/time/LocalDate;",
            ")",
            "Ljava/util/List<",
            "Lorg/joda/time/LocalDate;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x1

    if-gt v1, p0, :cond_2

    :goto_0
    invoke-interface {p1}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object v2

    invoke-virtual {v2}, Lorg/joda/time/LocalDate;->getYear()I

    move-result v2

    invoke-virtual {p2}, Lorg/joda/time/LocalDate;->getYear()I

    move-result v3

    if-ne v2, v3, :cond_0

    invoke-interface {p1}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object v2

    invoke-virtual {v2}, Lorg/joda/time/LocalDate;->getDayOfYear()I

    move-result v2

    invoke-virtual {p2}, Lorg/joda/time/LocalDate;->getDayOfYear()I

    move-result v3

    sub-int/2addr v2, v3

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object v2

    invoke-virtual {v2}, Lorg/joda/time/LocalDate;->getDayOfYear()I

    move-result v2

    invoke-virtual {p2}, Lorg/joda/time/LocalDate;->getDayOfYear()I

    move-result v3

    add-int/2addr v2, v3

    :goto_1
    int-to-float v3, p0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-float v3, v3

    float-to-int v3, v3

    if-le v3, v2, :cond_1

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p2, v2}, Lorg/joda/time/LocalDate;->plusDays(I)Lorg/joda/time/LocalDate;

    move-result-object v2

    invoke-virtual {v2, v1}, Lorg/joda/time/LocalDate;->minusDays(I)Lorg/joda/time/LocalDate;

    move-result-object v2

    goto :goto_2

    :cond_1
    invoke-virtual {p2, v3}, Lorg/joda/time/LocalDate;->plusDays(I)Lorg/joda/time/LocalDate;

    move-result-object v2

    invoke-virtual {v2, v1}, Lorg/joda/time/LocalDate;->minusDays(I)Lorg/joda/time/LocalDate;

    move-result-object v2

    :goto_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v1, p0, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method
