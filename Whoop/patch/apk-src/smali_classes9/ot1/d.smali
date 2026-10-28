.class public abstract Lot1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t\u00b2\u0006\u000e\u0010\u0008\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lnt1/i;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onSavedClicked",
        "f",
        "(Lnt1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "selectedRegion",
        "labrador_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lot1/d;->l(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lnt1/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lot1/d;->m(Lnt1/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c([Ljava/lang/String;Lp1/c1;Landroid/content/Context;)Landroid/widget/NumberPicker;
    .locals 0

    invoke-static {p0, p1, p2}, Lot1/d;->i([Ljava/lang/String;Lp1/c1;Landroid/content/Context;)Landroid/widget/NumberPicker;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d([Ljava/lang/String;Lp1/c1;Landroid/widget/NumberPicker;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lot1/d;->j([Ljava/lang/String;Lp1/c1;Landroid/widget/NumberPicker;II)V

    return-void
.end method

.method public static synthetic e(Lnt1/i;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lot1/d;->k(Lnt1/i;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lnt1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt1/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onSavedClicked"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v3, 0x374620d8

    invoke-virtual {v13, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit8 v6, v3, 0x13

    const/16 v7, 0x12

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v6, v7, :cond_4

    move v6, v12

    goto :goto_3

    :cond_4
    move v6, v11

    :goto_3
    and-int/lit8 v7, v3, 0x1

    invoke-virtual {v13, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_f

    const-string v6, "---"

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v6

    const v7, 0x7e416329

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lnt1/i;->e()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v7, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/design/util/TextResource;

    sget v14, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v9, v13, v14}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    new-array v7, v11, [Ljava/lang/String;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v7}, Lm83/n;->H0([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Ljava/lang/String;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-ne v7, v14, :cond_6

    aget-object v7, v6, v12

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v15, v7

    check-cast v15, Lp1/c1;

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    int-to-float v5, v5

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v5, v7

    invoke-static {v5, v9}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v9, Lb2/e;->N:Lb2/k;

    int-to-float v4, v4

    const/16 v10, 0x36

    invoke-static {v4, v4, v9, v13, v10}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v9

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v13, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    move/from16 v18, v3

    iget-boolean v3, v13, Lp1/q;->S:Z

    if-eqz v3, :cond_7

    invoke-virtual {v13, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_5
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v13, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v13, v3, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_8

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    :cond_8
    invoke-static {v11, v13, v11, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v13, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v3, 0x23

    int-to-float v3, v3

    mul-float/2addr v3, v4

    invoke-static {v3, v8}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v13, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v3, :cond_a

    if-ne v9, v14, :cond_b

    :cond_a
    new-instance v9, Lhe2/a;

    const/4 v3, 0x1

    invoke-direct {v9, v6, v15, v3}, Lhe2/a;-><init>([Ljava/lang/String;Lp1/c1;I)V

    invoke-virtual {v13, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v9, Lkotlin/jvm/functions/Function1;

    move-object v3, v8

    const/16 v8, 0x30

    move v6, v4

    move-object v4, v9

    const/4 v9, 0x4

    move v10, v6

    const/4 v6, 0x0

    move-object v12, v3

    move v3, v7

    move-object v7, v13

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static/range {v4 .. v9}, Landroidx/compose/ui/viewinterop/a;->a(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v4, 0x1

    invoke-virtual {v13, v4}, Lp1/q;->q(Z)V

    move/from16 v16, v4

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v13, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->Y()J

    move-result-wide v7

    const/4 v9, 0x3

    int-to-float v9, v9

    mul-float/2addr v9, v10

    invoke-static {v9}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    new-instance v11, Loe2/c;

    move-object/from16 v19, v4

    const/16 v4, 0x8

    invoke-direct {v11, v0, v4}, Loe2/c;-><init>(Ljava/lang/Object;I)V

    const v4, 0x36f81468

    invoke-static {v4, v13, v11}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    move-object v11, v14

    const v14, 0xc00006

    move-object/from16 v20, v15

    const/16 v15, 0x72

    move-object/from16 v21, v5

    const/4 v5, 0x0

    move/from16 v22, v6

    move-wide v6, v7

    move-object v8, v9

    const/4 v9, 0x0

    move/from16 v23, v10

    const/4 v10, 0x0

    move-object/from16 v24, v11

    const/4 v11, 0x0

    move-object v0, v12

    move/from16 v1, v22

    move/from16 v2, v23

    move-object/from16 v25, v24

    const/16 v17, 0x0

    move-object v12, v4

    move-object/from16 v4, v19

    invoke-static/range {v4 .. v15}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v2, v3, v0, v13}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual/range {p0 .. p0}, Lnt1/i;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v13, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, v21

    invoke-virtual {v0, v13, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v8

    and-int/lit8 v0, v18, 0x70

    const/16 v1, 0x20

    if-ne v0, v1, :cond_c

    move/from16 v11, v16

    goto :goto_6

    :cond_c
    move/from16 v11, v17

    :goto_6
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v11, :cond_e

    move-object/from16 v11, v25

    if-ne v0, v11, :cond_d

    goto :goto_7

    :cond_d
    move-object/from16 v2, p1

    goto :goto_8

    :cond_e
    :goto_7
    new-instance v0, Lbs1/i;

    const/16 v1, 0x1b

    move-object/from16 v2, p1

    move-object/from16 v7, v20

    invoke-direct {v0, v2, v7, v1}, Lbs1/i;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_8
    move-object v12, v0

    check-cast v12, Lc93/a;

    const/16 v14, 0x36

    const/16 v15, 0x68

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v4 .. v15}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_9

    :cond_f
    move-object v2, v1

    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_10

    new-instance v1, Lof2/d;

    const/4 v3, 0x5

    move-object/from16 v4, p0

    move/from16 v5, p3

    invoke-direct {v1, v4, v2, v5, v3}, Lof2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final g(Lp1/c1;)Ljava/lang/String;
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

.method private static final h(Lp1/c1;Ljava/lang/String;)V
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

.method private static final i([Ljava/lang/String;Lp1/c1;Landroid/content/Context;)Landroid/widget/NumberPicker;
    .locals 3

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lgy0/g;->c:I

    new-instance v1, Landroid/widget/NumberPicker;

    new-instance v2, Lq/d;

    invoke-direct {v2, p2, v0}, Lq/d;-><init>(Landroid/content/Context;I)V

    invoke-direct {v1, v2}, Landroid/widget/NumberPicker;-><init>(Landroid/content/Context;)V

    new-instance p2, Lhe2/b;

    const/4 v0, 0x1

    invoke-direct {p2, p0, p1, v0}, Lhe2/b;-><init>(Ljava/lang/Object;Lp1/c1;I)V

    invoke-virtual {v1, p2}, Landroid/widget/NumberPicker;->setOnValueChangedListener(Landroid/widget/NumberPicker$OnValueChangeListener;)V

    const/4 p2, 0x0

    invoke-virtual {v1, p2}, Landroid/widget/NumberPicker;->setMinValue(I)V

    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    invoke-virtual {v1, p2}, Landroid/widget/NumberPicker;->setWrapSelectorWheel(Z)V

    invoke-static {p1}, Lot1/d;->g(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lm83/n;->z0([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/NumberPicker;->setValue(I)V

    invoke-virtual {v1, p0}, Landroid/widget/NumberPicker;->setDisplayedValues([Ljava/lang/String;)V

    const/high16 p0, 0x60000

    invoke-virtual {v1, p0}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    return-object v1
.end method

.method private static final j([Ljava/lang/String;Lp1/c1;Landroid/widget/NumberPicker;II)V
    .locals 0

    aget-object p0, p0, p4

    invoke-static {p1, p0}, Lot1/d;->h(Lp1/c1;Ljava/lang/String;)V

    return-void
.end method

.method private static final k(Lnt1/i;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 29

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v0, v3, v3}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lb2/e;->K:Lb2/l;

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    const/16 v5, 0x36

    invoke-static {v3, v4, v8, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v8, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v8, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v8, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, v8, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v8, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lnt1/i;->b()I

    move-result v0

    const/4 v3, 0x6

    invoke-static {v0, v8, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    int-to-float v3, v3

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v1, v8, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->X()J

    move-result-wide v6

    const/16 v9, 0x1b0

    const/4 v10, 0x0

    const/4 v4, 0x0

    move-object v3, v0

    invoke-static/range {v3 .. v10}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p0 .. p0}, Lnt1/i;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v8, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v8, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    invoke-virtual {v1, v8, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X()J

    move-result-wide v5

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v27, v0, 0x12

    const v28, 0x2fffa

    move-object/from16 v25, v8

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

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Lot1/d;->g(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lnt1/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lot1/d;->f(Lnt1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
