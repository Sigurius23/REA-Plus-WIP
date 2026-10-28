.class public abstract Lzc1/j8;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u001d\u0010\u0006\u001a\u00020\u00002\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a;\u0010\r\u001a\u00020\u00002\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Ll83/a0;",
        "h",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "Lcom/whoop/design/util/TextResource$e;",
        "textList",
        "f",
        "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V",
        "Li2/x;",
        "textColor",
        "Li2/a1;",
        "textPartitionShape",
        "partitionShapeColor",
        "d",
        "(Ljava/util/List;JLi2/a1;JLandroidx/compose/runtime/Composer;II)V",
        "design-showcase_release"
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
.method public static synthetic a(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzc1/j8;->g(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/List;JLi2/a1;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lzc1/j8;->e(Ljava/util/List;JLi2/a1;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/j8;->i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljava/util/List;JLi2/a1;JLandroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/util/TextResource$e;",
            ">;J",
            "Li2/a1;",
            "J",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v7, p7

    move-object/from16 v15, p6

    check-cast v15, Lp1/q;

    const v0, 0x7f3c13c6    # 2.4999753E38f

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    const/4 v1, 0x2

    const/4 v2, 0x4

    move-object/from16 v9, p0

    if-nez v0, :cond_1

    invoke-virtual {v15, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    and-int/lit8 v3, v7, 0x30

    if-nez v3, :cond_4

    and-int/lit8 v3, p8, 0x2

    if-nez v3, :cond_2

    move-wide/from16 v3, p1

    invoke-virtual {v15, v3, v4}, Lp1/q;->f(J)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    move-wide/from16 v3, p1

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    goto :goto_3

    :cond_4
    move-wide/from16 v3, p1

    :goto_3
    and-int/lit16 v5, v7, 0x180

    if-nez v5, :cond_7

    and-int/lit8 v5, p8, 0x4

    if-nez v5, :cond_5

    move-object/from16 v5, p3

    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_4

    :cond_5
    move-object/from16 v5, p3

    :cond_6
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v0, v6

    goto :goto_5

    :cond_7
    move-object/from16 v5, p3

    :goto_5
    and-int/lit16 v6, v7, 0xc00

    if-nez v6, :cond_9

    and-int/lit8 v6, p8, 0x8

    move-wide/from16 v10, p4

    if-nez v6, :cond_8

    invoke-virtual {v15, v10, v11}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x800

    goto :goto_6

    :cond_8
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v0, v6

    goto :goto_7

    :cond_9
    move-wide/from16 v10, p4

    :goto_7
    and-int/lit16 v6, v0, 0x493

    const/16 v8, 0x492

    if-eq v6, v8, :cond_a

    const/4 v6, 0x1

    goto :goto_8

    :cond_a
    const/4 v6, 0x0

    :goto_8
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v15, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_12

    invoke-virtual {v15}, Lp1/q;->Z()V

    and-int/lit8 v6, v7, 0x1

    if-eqz v6, :cond_f

    invoke-virtual {v15}, Lp1/q;->C()Z

    move-result v6

    if-eqz v6, :cond_b

    goto :goto_a

    :cond_b
    invoke-virtual {v15}, Lp1/q;->X()V

    and-int/lit8 v6, p8, 0x2

    if-eqz v6, :cond_c

    and-int/lit8 v0, v0, -0x71

    :cond_c
    and-int/lit8 v6, p8, 0x4

    if-eqz v6, :cond_d

    and-int/lit16 v0, v0, -0x381

    :cond_d
    and-int/lit8 v6, p8, 0x8

    if-eqz v6, :cond_e

    :goto_9
    and-int/lit16 v0, v0, -0x1c01

    :cond_e
    move-object v12, v5

    move-wide v13, v10

    move-wide v10, v3

    goto :goto_b

    :cond_f
    :goto_a
    and-int/lit8 v6, p8, 0x2

    if-eqz v6, :cond_10

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v15, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->b1()J

    move-result-wide v3

    and-int/lit8 v0, v0, -0x71

    :cond_10
    and-int/lit8 v6, p8, 0x4

    if-eqz v6, :cond_11

    sget-object v5, Lt0/j;->a:Lt0/i;

    and-int/lit16 v0, v0, -0x381

    :cond_11
    and-int/lit8 v6, p8, 0x8

    if-eqz v6, :cond_e

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v6, v15, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->W0()J

    move-result-wide v10

    goto :goto_9

    :goto_b
    invoke-virtual {v15}, Lp1/q;->r()V

    shl-int/lit8 v0, v0, 0x3

    and-int/lit8 v3, v0, 0x70

    or-int/lit8 v3, v3, 0x6

    and-int/lit16 v4, v0, 0x380

    or-int/2addr v3, v4

    and-int/lit16 v4, v0, 0x1c00

    or-int/2addr v3, v4

    const v4, 0xe000

    and-int/2addr v0, v4

    or-int v16, v3, v0

    const/16 v17, 0x0

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static/range {v8 .. v17}, Lc41/n5;->b(Landroidx/compose/ui/Modifier;Ljava/util/List;JLi2/a1;JLandroidx/compose/runtime/Composer;II)V

    int-to-float v0, v1

    int-to-float v1, v2

    invoke-static {v0, v1, v8, v15}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    move-wide v2, v10

    move-object v4, v12

    move-wide v5, v13

    goto :goto_c

    :cond_12
    invoke-virtual {v15}, Lp1/q;->X()V

    move-wide v2, v3

    move-object v4, v5

    move-wide v5, v10

    :goto_c
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_13

    new-instance v0, Lhy0/w;

    move-object/from16 v1, p0

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lhy0/w;-><init>(Ljava/util/List;JLi2/a1;JII)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final e(Ljava/util/List;JLi2/a1;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    move-wide v5, p4

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lzc1/j8;->d(Ljava/util/List;JLi2/a1;JLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/util/TextResource$e;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object v7, p1

    check-cast v7, Lp1/q;

    const p1, -0x72640a09

    invoke-virtual {v7, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v10, 0x4

    const/4 v11, 0x2

    if-nez p1, :cond_1

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v10

    goto :goto_0

    :cond_0
    move p1, v11

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 v0, p1, 0x3

    if-eq v0, v11, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v7, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    shl-int/lit8 p1, p1, 0x3

    and-int/lit8 p1, p1, 0x70

    or-int/lit8 v8, p1, 0x6

    const/16 v9, 0x1c

    sget-object v0, Lb2/t;->w:Lb2/t;

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v9}, Lc41/n5;->b(Landroidx/compose/ui/Modifier;Ljava/util/List;JLi2/a1;JLandroidx/compose/runtime/Composer;II)V

    int-to-float p0, v11

    int-to-float p1, v10

    invoke-static {p0, p1, v0, v7}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    goto :goto_3

    :cond_3
    move-object v1, p0

    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance p1, Lbm0/o;

    const/16 v0, 0x1b

    invoke-direct {p1, v1, p2, v0}, Lbm0/o;-><init>(Ljava/util/List;II)V

    iput-object p1, p0, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final g(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lzc1/j8;->f(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Landroidx/compose/runtime/Composer;I)V
    .locals 26

    move-object/from16 v7, p0

    check-cast v7, Lp1/q;

    const v1, 0x74d1347c

    invoke-virtual {v7, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v10, 0x1

    if-eqz p1, :cond_0

    move v1, v10

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p1, 0x1

    invoke-virtual {v7, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x4

    int-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v10}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->N:Lb2/k;

    sget-object v3, Ll0/m;->c:Ll0/g;

    const/16 v4, 0x30

    invoke-static {v3, v2, v7, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, v7, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v7, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {v7, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v7, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v7, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v3, v7, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v7, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "Standard"

    const/4 v2, 0x6

    invoke-static {v1, v7, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    const-string v3, "Monday"

    invoke-direct {v1, v3}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sget v8, Lcom/whoop/design/util/TextResource$e;->b:I

    invoke-static {v1, v7, v8}, Lzc1/j8;->f(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    const-string v11, "Day"

    invoke-direct {v1, v11}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v4, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v4, v11}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v5, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v5, v11}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    filled-new-array {v1, v4, v5}, [Lcom/whoop/design/util/TextResource$e;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v7, v8}, Lzc1/j8;->f(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    new-instance v12, Lcom/whoop/design/util/TextResource$e;

    const-string v1, "Mon"

    invoke-direct {v12, v1}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v13, Lcom/whoop/design/util/TextResource$e;

    const-string v4, "Tue"

    invoke-direct {v13, v4}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v14, Lcom/whoop/design/util/TextResource$e;

    const-string v5, "Wed"

    invoke-direct {v14, v5}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v15, Lcom/whoop/design/util/TextResource$e;

    const-string v6, "Thu"

    invoke-direct {v15, v6}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v9, Lcom/whoop/design/util/TextResource$e;

    const-string v10, "Fri"

    invoke-direct {v9, v10}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v2, Lcom/whoop/design/util/TextResource$e;

    move-object/from16 v20, v4

    const-string v4, "Sat"

    invoke-direct {v2, v4}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    move-object/from16 v21, v1

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    move-object/from16 v22, v4

    const-string v4, "Sun"

    invoke-direct {v1, v4}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    move-object/from16 v18, v1

    move-object/from16 v17, v2

    move-object/from16 v16, v9

    filled-new-array/range {v12 .. v18}, [Lcom/whoop/design/util/TextResource$e;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v7, v8}, Lzc1/j8;->f(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    const-string v1, "With Custom colors and shapes"

    const/4 v2, 0x6

    invoke-static {v1, v7, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v1, v3}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sget-object v12, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v12, v7, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->J()J

    move-result-wide v2

    move-object v14, v5

    move-object v9, v6

    const-wide/16 v5, 0x0

    move-object v15, v9

    const/16 v9, 0xc

    move-object/from16 v16, v4

    const/4 v4, 0x0

    move/from16 v17, v13

    move-object v0, v15

    move-object/from16 v18, v16

    move-object/from16 v13, v20

    move-object/from16 v15, v22

    move-object/from16 v16, v12

    move-object v12, v14

    move-object/from16 v14, v21

    invoke-static/range {v1 .. v9}, Lzc1/j8;->d(Ljava/util/List;JLi2/a1;JLandroidx/compose/runtime/Composer;II)V

    move v1, v8

    new-instance v2, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v2, v11}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v3, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v3, v11}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v4, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v4, v11}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    filled-new-array {v2, v3, v4}, [Lcom/whoop/design/util/TextResource$e;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    or-int/lit16 v8, v1, 0x180

    const/16 v9, 0xa

    move v4, v1

    move-object v1, v2

    const-wide/16 v2, 0x0

    move v5, v4

    sget-object v4, Li2/w0;->a:Li2/v0;

    move v11, v5

    const-wide/16 v5, 0x0

    invoke-static/range {v1 .. v9}, Lzc1/j8;->d(Ljava/util/List;JLi2/a1;JLandroidx/compose/runtime/Composer;II)V

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v1, v14}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v2, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v2, v13}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v3, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v3, v12}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v4, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v4, v0}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v0, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v0, v10}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v5, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v5, v15}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v6, Lcom/whoop/design/util/TextResource$e;

    move-object/from16 v8, v18

    invoke-direct {v6, v8}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    move-object/from16 v23, v0

    move-object/from16 v19, v1

    move-object/from16 v20, v2

    move-object/from16 v21, v3

    move-object/from16 v22, v4

    move-object/from16 v24, v5

    move-object/from16 v25, v6

    filled-new-array/range {v19 .. v25}, [Lcom/whoop/design/util/TextResource$e;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    move-object/from16 v0, v16

    move/from16 v2, v17

    invoke-virtual {v0, v7, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c0()J

    move-result-wide v3

    invoke-virtual {v0, v7, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->p0()J

    move-result-wide v5

    const/4 v9, 0x4

    move-wide v2, v3

    const/4 v4, 0x0

    move v8, v11

    invoke-static/range {v1 .. v9}, Lzc1/j8;->d(Ljava/util/List;JLi2/a1;JLandroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v1, Lzc1/t7;

    const/16 v2, 0x11

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/t7;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/j8;->h(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
