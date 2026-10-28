.class public abstract Llf0/f2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llf0/f2$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a7\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a)\u0010\r\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a%\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0011H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u001e\u00b2\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0017\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0012\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a8\nX\u008a\u0084\u0002\u00b2\u0006\u0014\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lld0/r;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "q",
        "(Lld0/r;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "title",
        "subtitle",
        "K",
        "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V",
        "Lld0/f;",
        "entryPoint",
        "Lkotlin/Function0;",
        "onClick",
        "n",
        "(Lld0/f;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "",
        "showBottomSheet",
        "searchQuery",
        "Lld0/h;",
        "selectedSortOption",
        "",
        "La01/m;",
        "filterableStatusTypes",
        "selectedStatusFilters",
        "advanced-labs_release"
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
.method private static final A(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Llf0/f2;->F(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lp1/c1;La01/m;)Ll83/a0;
    .locals 1

    const-string v0, "statusType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llf0/f2;->u(Lp1/c1;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Llf0/f2;->u(Lp1/c1;)Ljava/util/Set;

    move-result-object v0

    invoke-static {p1, v0}, Ldt/b;->y(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p0}, Llf0/f2;->u(Lp1/c1;)Ljava/util/Set;

    move-result-object v0

    invoke-static {p1, v0}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    :goto_0
    invoke-static {p0, p1}, Llf0/f2;->v(Lp1/c1;Ljava/util/Set;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lp1/c1;Lld0/h;)Ll83/a0;
    .locals 1

    const-string v0, "sortOptionType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Llf0/f2;->J(Lp1/c1;Lld0/h;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
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

.method private static final E(Lld0/r;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Llf0/f2;->q(Lld0/r;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final G(Lp1/c1;)Ljava/lang/String;
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

.method private static final H(Lp1/c1;Ljava/lang/String;)V
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

.method private static final I(Lp1/c1;)Lld0/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lld0/h;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lld0/h;

    return-object p0
.end method

.method private static final J(Lp1/c1;Lld0/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lld0/h;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final K(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
    .locals 38

    move-object/from16 v0, p1

    move/from16 v1, p4

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    const v3, 0x30b1ab55

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p5, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v4, v1, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v2, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v1

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v1

    :goto_1
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v1, 0x180

    if-nez v6, :cond_6

    move-object/from16 v6, p2

    invoke-virtual {v2, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_3

    :cond_5
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v5, v7

    goto :goto_4

    :cond_6
    move-object/from16 v6, p2

    :goto_4
    and-int/lit16 v7, v5, 0x93

    const/16 v8, 0x92

    const/4 v10, 0x1

    if-eq v7, v8, :cond_7

    move v7, v10

    goto :goto_5

    :cond_7
    const/4 v7, 0x0

    :goto_5
    and-int/lit8 v8, v5, 0x1

    invoke-virtual {v2, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_d

    sget-object v7, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_8

    move-object v3, v7

    goto :goto_6

    :cond_8
    move-object v3, v4

    :goto_6
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v8, "SearchableBiomarkerListHeader_"

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const-wide/high16 v12, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v12

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float v15, v4, v12

    const-wide/high16 v13, 0x3fe0000000000000L    # 0.5

    double-to-float v4, v13

    mul-float/2addr v12, v4

    const/4 v13, 0x0

    const/16 v16, 0x2

    move v14, v12

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v11, Lb2/e;->K:Lb2/l;

    sget-object v12, Ll0/m;->a:Ll0/e;

    const/16 v13, 0x30

    invoke-static {v12, v11, v2, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

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

    iget-boolean v9, v2, Lp1/q;->S:Z

    if-eqz v9, :cond_9

    invoke-virtual {v2, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_7
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v2, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v2, v9, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v11, v2, Lp1/q;->S:Z

    if-nez v11, :cond_a

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_b

    :cond_a
    invoke-static {v12, v2, v12, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v2, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v11, v8

    const-wide/16 v14, 0x0

    cmpl-double v4, v11, v14

    if-lez v4, :cond_c

    goto :goto_8

    :cond_c
    const-string v4, "invalid weight; must be greater than zero"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_8
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v1, v8, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v4, v2, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->P()Lb91/a;

    move-result-object v20

    invoke-virtual {v4, v2, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v11

    shr-int/lit8 v9, v5, 0x3

    and-int/lit8 v23, v9, 0xe

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v24, v9, 0x12

    const v25, 0x2fff8

    move-object v14, v4

    move v9, v5

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object v15, v7

    const/4 v7, 0x0

    move/from16 v16, v8

    const/4 v8, 0x0

    move/from16 v17, v9

    move/from16 v18, v10

    const-wide/16 v9, 0x0

    move-object/from16 v22, v2

    move-wide/from16 v36, v11

    move-object v12, v3

    move-wide/from16 v2, v36

    const/4 v11, 0x0

    move-object/from16 v19, v12

    const/4 v12, 0x0

    move/from16 v26, v13

    move-object/from16 v21, v14

    const-wide/16 v13, 0x0

    move-object/from16 v27, v15

    const/4 v15, 0x0

    move/from16 v28, v16

    const/16 v16, 0x0

    move/from16 v29, v17

    const/16 v17, 0x0

    move/from16 v30, v18

    const/16 v18, 0x0

    move-object/from16 v31, v19

    const/16 v19, 0x0

    move-object/from16 v32, v21

    const/16 v21, 0x0

    move-object/from16 v35, v27

    move/from16 v34, v28

    move-object/from16 v33, v32

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    const/4 v1, 0x0

    const/4 v2, 0x3

    move-object/from16 v15, v35

    const/4 v3, 0x0

    invoke-static {v15, v1, v3, v2}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v14, v33

    move/from16 v2, v34

    invoke-virtual {v14, v0, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v20

    invoke-virtual {v14, v0, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v2

    shr-int/lit8 v4, v29, 0x6

    and-int/lit8 v4, v4, 0xe

    or-int/lit8 v23, v4, 0x30

    const-wide/16 v4, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v0, p2

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    move-object/from16 v1, v31

    goto :goto_9

    :cond_d
    move-object v0, v2

    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v1, v4

    :goto_9
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_e

    new-instance v0, Lb30/k6;

    const/4 v6, 0x3

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lb30/k6;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final L(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Llf0/f2;->K(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llf0/f2;->A(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llf0/f2;->x(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llf0/f2;->y(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;La01/m;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llf0/f2;->B(Lp1/c1;La01/m;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp1/c1;Lld0/h;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llf0/f2;->C(Lp1/c1;Lld0/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Llf0/f2;->L(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llf0/f2;->w(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Lld0/e;Ly2/y;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Llf0/f2;->z(Lkotlin/jvm/functions/Function1;Lld0/e;Ly2/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lld0/r;)Ljava/util/Set;
    .locals 0

    invoke-static {p0}, Llf0/f2;->s(Lld0/r;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lc93/a;Lld0/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Llf0/f2;->o(Lc93/a;Lld0/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llf0/f2;->r(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lld0/r;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Llf0/f2;->E(Lld0/r;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lld0/f;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Llf0/f2;->p(Lld0/f;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Lld0/f;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lld0/f;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object v9, p2

    check-cast v9, Lp1/q;

    const p2, -0x355b17f4    # -5403654.0f

    invoke-virtual {v9, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    const/4 v0, 0x2

    if-nez p2, :cond_1

    invoke-virtual {v9, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {v9, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr p2, v1

    :cond_3
    and-int/lit8 v1, p2, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x1

    if-eq v1, v2, :cond_4

    move v1, v3

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    and-int/2addr p2, v3

    invoke-virtual {v9, p2, v1}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_5

    int-to-float p2, v0

    const/16 v0, 0x8

    int-to-float v0, v0

    mul-float v5, p2, v0

    const/4 v6, 0x7

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p2

    const-string v0, "BottomSheetEntryPoint"

    invoke-static {p2, v0}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance p2, Lj21/d;

    const/16 v1, 0xe

    invoke-direct {p2, v1, p1, p0}, Lj21/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x500b8a7c

    invoke-static {v1, v9, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const v10, 0xc00006

    const/16 v11, 0x7e

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v11}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_5
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lkl2/f;

    const/16 v1, 0x11

    invoke-direct {v0, p0, p1, p3, v1}, Lkl2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final o(Lc93/a;Lld0/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 32

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v4, p3, 0x1

    move-object/from16 v10, p2

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lb2/e;->K:Lb2/l;

    const/4 v7, 0x0

    const/16 v9, 0xf

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v8, p0

    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->a:Ll0/e;

    const/16 v7, 0x30

    invoke-static {v6, v0, v10, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v10, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v6, v10, v6, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v10, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lld0/f;->b()Ljava/lang/String;

    move-result-object v5

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v0, v10, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->s()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v10, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    const/high16 v9, 0x3f800000    # 1.0f

    float-to-double v11, v9

    const-wide/16 v13, 0x0

    cmpl-double v11, v11, v13

    if-lez v11, :cond_4

    goto :goto_2

    :cond_4
    const-string v11, "invalid weight; must be greater than zero"

    invoke-static {v11}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_2
    new-instance v11, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v11, v9, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    int-to-float v3, v3

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v3, v9

    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v29, v11, 0x12

    const v30, 0x2fff8

    move v11, v6

    move-object v6, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move v12, v11

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

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v31, v28

    const/16 v28, 0x0

    move/from16 v1, v31

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual/range {p1 .. p1}, Lld0/f;->a()Lgz0/m0;

    move-result-object v5

    if-nez v5, :cond_5

    const v0, 0x5c83fdcb

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_3
    const/4 v0, 0x1

    goto :goto_4

    :cond_5
    const v6, 0x5c83fdcc

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Lgz0/m0;->toWhoopIcon()I

    move-result v5

    invoke-static {v5, v10, v2}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v5

    invoke-virtual {v0, v10, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v8

    const/4 v15, 0x0

    const/16 v16, 0xb

    const/4 v12, 0x0

    const/4 v13, 0x0

    move v14, v3

    move-object v11, v4

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v1, v1

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_3

    :goto_4
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_6
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final p(Lld0/f;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Llf0/f2;->n(Lld0/f;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final q(Lld0/r;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lld0/r;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, 0x35f36a20

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v8, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v10, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v10, v1, 0x180

    if-nez v10, :cond_5

    move-object/from16 v10, p2

    invoke-virtual {v8, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_4

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v0, v11

    :goto_5
    and-int/lit16 v11, v0, 0x93

    const/16 v12, 0x92

    if-eq v11, v12, :cond_8

    const/4 v11, 0x1

    goto :goto_6

    :cond_8
    const/4 v11, 0x0

    :goto_6
    and-int/lit8 v12, v0, 0x1

    invoke-virtual {v8, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_43

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_9

    move-object v3, v15

    goto :goto_7

    :cond_9
    move-object v3, v6

    :goto_7
    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v6, :cond_a

    new-instance v7, Llc0/g;

    const/16 v10, 0x11

    invoke-direct {v7, v10}, Llc0/g;-><init>(I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_b
    move-object v7, v10

    :goto_8
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v6, :cond_c

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v10}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v10

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v10, Lp1/c1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v6, :cond_e

    invoke-virtual {v4}, Lld0/r;->f()Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_d

    const-string v11, ""

    :cond_d
    invoke-static {v11}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v8, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v11, Lp1/c1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v6, :cond_f

    sget-object v12, Lld0/h;->STATUS:Lld0/h;

    invoke-static {v12}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v12

    invoke-virtual {v8, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v12, Lp1/c1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v6, :cond_10

    new-instance v13, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/16 v9, 0x1b

    invoke-direct {v13, v4, v9}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {v13}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v13

    invoke-virtual {v8, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v13, Lp1/t2;

    invoke-static {v13}, Llf0/f2;->t(Lp1/t2;)Ljava/util/Set;

    move-result-object v9

    invoke-virtual {v8, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v9, :cond_11

    if-ne v2, v6, :cond_12

    :cond_11
    invoke-static {v13}, Llf0/f2;->t(Lp1/t2;)Ljava/util/Set;

    move-result-object v2

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v8, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v2, Lp1/c1;

    invoke-virtual {v4}, Lld0/r;->b()Ljava/util/List;

    move-result-object v9

    invoke-static {v11}, Llf0/f2;->G(Lp1/c1;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v5, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_14

    if-ne v9, v6, :cond_13

    goto :goto_9

    :cond_13
    move-object/from16 p2, v10

    goto :goto_c

    :cond_14
    :goto_9
    invoke-static {v11}, Llf0/f2;->G(Lp1/c1;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-virtual {v4}, Lld0/r;->b()Ljava/util/List;

    move-result-object v5

    move-object v9, v5

    :cond_15
    move-object/from16 p2, v10

    goto :goto_b

    :cond_16
    invoke-virtual {v4}, Lld0/r;->b()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_15

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v17, v14

    check-cast v17, La01/h;

    invoke-virtual/range {v17 .. v17}, La01/h;->l()Ljava/lang/String;

    move-result-object v1

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 p1, v5

    const-string v5, "toUpperCase(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 p2, v10

    invoke-static {v11}, Llf0/f2;->G(Lp1/c1;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v1, v4, v5}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_17
    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move-object/from16 v10, p2

    move/from16 v1, p4

    goto :goto_a

    :goto_b
    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    check-cast v9, Ljava/util/List;

    invoke-virtual/range {p0 .. p0}, Lld0/r;->g()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v8, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v1, v4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_19

    if-ne v4, v6, :cond_18

    goto :goto_d

    :cond_18
    move-object/from16 v23, v12

    goto/16 :goto_10

    :cond_19
    :goto_d
    invoke-virtual/range {p0 .. p0}, Lld0/r;->g()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/LinkedHashMap;

    const/16 v5, 0xa

    invoke-static {v1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-static {v5}, Lm83/g0;->W(I)I

    move-result v5

    const/16 v10, 0x10

    if-ge v5, v10, :cond_1a

    move v5, v10

    :cond_1a
    invoke-direct {v4, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Lld0/e;

    move-object v14, v9

    check-cast v14, Ljava/lang/Iterable;

    move-object/from16 p1, v1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_f
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_1c

    move-object/from16 v16, v9

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v17, v9

    check-cast v17, La01/h;

    move-object/from16 v18, v10

    invoke-virtual/range {v17 .. v17}, La01/h;->k()La01/m;

    move-result-object v10

    move-object/from16 v23, v12

    invoke-virtual/range {v18 .. v18}, Lld0/e;->b()La01/m;

    move-result-object v12

    if-ne v10, v12, :cond_1b

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1b
    move-object/from16 v9, v16

    move-object/from16 v10, v18

    move-object/from16 v12, v23

    goto :goto_f

    :cond_1c
    move-object/from16 v16, v9

    move-object/from16 v23, v12

    invoke-interface {v4, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, p1

    goto :goto_e

    :cond_1d
    move-object/from16 v23, v12

    invoke-virtual {v8, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    check-cast v4, Ljava/util/Map;

    invoke-static {v2}, Llf0/f2;->u(Lp1/c1;)Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v8, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v1, v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v9, Lm83/y;->w:Lm83/y;

    if-nez v1, :cond_1f

    if-ne v5, v6, :cond_1e

    goto :goto_11

    :cond_1e
    move-object/from16 v24, v9

    goto :goto_14

    :cond_1f
    :goto_11
    invoke-virtual/range {p0 .. p0}, Lld0/r;->g()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_23

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Lld0/e;

    invoke-interface {v4, v12, v9}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/Collection;

    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    move-result v14

    xor-int/lit8 v16, v14, 0x1

    move-object/from16 p1, v1

    invoke-static {v13}, Llf0/f2;->t(Lp1/t2;)Ljava/util/Set;

    move-result-object v1

    move-object/from16 v24, v9

    invoke-virtual {v12}, Lld0/e;->b()La01/m;

    move-result-object v9

    invoke-interface {v1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_21

    if-nez v14, :cond_20

    invoke-static {v2}, Llf0/f2;->u(Lp1/c1;)Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v12}, Lld0/e;->b()La01/m;

    move-result-object v9

    invoke-interface {v1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    const/16 v16, 0x1

    goto :goto_13

    :cond_20
    const/16 v16, 0x0

    :cond_21
    :goto_13
    if-eqz v16, :cond_22

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_22
    move-object/from16 v1, p1

    move-object/from16 v9, v24

    goto :goto_12

    :cond_23
    move-object/from16 v24, v9

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    move-object v1, v5

    check-cast v1, Ljava/util/List;

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x0

    invoke-static {v5, v9, v8, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v12, v8, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_24

    invoke-virtual {v8, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_24
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_15
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v8, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v8, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-nez v10, :cond_25

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_26

    :cond_25
    invoke-static {v9, v8, v9, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_26
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v8, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11}, Llf0/f2;->G(Lp1/c1;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lld0/r;->e()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const/4 v10, 0x2

    int-to-float v12, v10

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float v19, v12, v10

    const/16 v20, 0x7

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    and-int/lit16 v0, v0, 0x380

    const/16 v13, 0x100

    if-ne v0, v13, :cond_27

    const/4 v14, 0x1

    goto :goto_16

    :cond_27
    const/4 v14, 0x0

    :goto_16
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v14, :cond_28

    if-ne v13, v6, :cond_29

    :cond_28
    new-instance v13, Ll80/k;

    const/16 v14, 0x9

    invoke-direct {v13, v7, v14}, Ll80/k;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    move-object/from16 v20, v13

    check-cast v20, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v6, :cond_2a

    new-instance v13, Ljs2/e;

    const/4 v14, 0x7

    invoke-direct {v13, v14, v11}, Ljs2/e;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2a
    check-cast v13, Lkotlin/jvm/functions/Function1;

    sget v11, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v14, v11, 0x3

    or-int/lit8 v14, v14, 0x6

    shl-int/lit8 v11, v11, 0x6

    or-int/2addr v11, v14

    move-object/from16 v14, v24

    const/16 v24, 0x6180

    const/16 v25, 0xff8

    move-object/from16 v22, v8

    const/16 v16, 0x0

    const/4 v8, 0x0

    move-object/from16 v17, v7

    move-object v7, v9

    move/from16 v18, v10

    const-wide/16 v9, 0x0

    move-object/from16 v19, v23

    move/from16 v23, v11

    const/4 v11, 0x0

    move-object/from16 v27, v6

    move-object v6, v5

    move-object v5, v12

    const/4 v12, 0x0

    move-object/from16 v21, v13

    const/16 v28, 0x100

    const/4 v13, 0x0

    move-object/from16 v30, v14

    move-object/from16 v29, v15

    const-wide/16 v14, 0x0

    move/from16 v31, v16

    const/16 v16, 0x0

    move-object/from16 v32, v17

    const/16 v17, 0x0

    move/from16 v33, v18

    const/16 v18, 0x0

    move-object/from16 v34, v19

    const/16 v19, 0x1

    move-object/from16 v35, p2

    move-object/from16 p1, v1

    move-object/from16 v39, v27

    move-object/from16 v37, v29

    move-object/from16 v38, v30

    move/from16 v1, v31

    move/from16 v36, v33

    invoke-static/range {v5 .. v25}, Lhy0/v0;->j(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;JIZLg1/e8;JZLn0/u;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v22

    invoke-virtual/range {p0 .. p0}, Lld0/r;->c()Lld0/g;

    move-result-object v5

    if-nez v5, :cond_2b

    const v5, -0x4cb1f546

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    move-object/from16 v12, v35

    move-object/from16 v11, v39

    goto :goto_18

    :cond_2b
    const v6, -0x4cb1f545

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Lld0/g;->a()Lld0/f;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v11, v39

    if-ne v6, v11, :cond_2c

    new-instance v6, Ljt1/b;

    const/16 v7, 0x10

    move-object/from16 v12, v35

    invoke-direct {v6, v7, v12}, Ljt1/b;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_17

    :cond_2c
    move-object/from16 v12, v35

    :goto_17
    check-cast v6, Lc93/a;

    const/16 v7, 0x30

    invoke-static {v5, v6, v8, v7}, Llf0/f2;->n(Lld0/f;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    :goto_18
    invoke-static/range {v34 .. v34}, Llf0/f2;->I(Lp1/c1;)Lld0/h;

    move-result-object v5

    sget-object v6, Llf0/f2$b;->a:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v6, v5

    const/16 v18, 0x0

    const-wide/high16 v13, 0x3ff8000000000000L    # 1.5

    const/4 v6, 0x1

    if-eq v5, v6, :cond_33

    const/4 v10, 0x2

    if-ne v5, v10, :cond_32

    const v5, -0x4c917586

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    move-object/from16 v5, p1

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_19
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lld0/e;

    move-object/from16 v9, v38

    invoke-interface {v4, v7, v9}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v6, v7}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_19

    :cond_2d
    new-instance v4, Llf0/f2$a;

    invoke-direct {v4}, Llf0/f2$a;-><init>()V

    invoke-static {v6, v4}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lld0/r;->a()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2e

    const v6, 0x47da8157

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    sget v6, Lma0/d;->a:I

    invoke-static {v8, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    :goto_1a
    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    goto :goto_1b

    :cond_2e
    const v7, 0x47da7d77

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    goto :goto_1a

    :goto_1b
    sget v7, Lma0/c;->a:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v9

    sget-object v10, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->c:Lp1/b0;

    invoke-virtual {v8, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/content/res/Resources;

    const/16 p2, 0x3

    const/4 v15, 0x1

    invoke-static {v9, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v10, v7, v5, v9}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v5, 0x0

    invoke-static/range {v5 .. v10}, Llf0/f2;->K(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v4

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    move v5, v1

    :goto_1c
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_31

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v16, v5, 0x1

    if-ltz v5, :cond_30

    check-cast v6, La01/h;

    sget v7, La01/h;->q:I

    shl-int/lit8 v7, v7, 0x3

    or-int v9, v7, v0

    const/4 v10, 0x1

    move v7, v5

    const/4 v5, 0x0

    move v1, v7

    move-object/from16 v7, v32

    invoke-static/range {v5 .. v10}, La01/g;->g(Landroidx/compose/ui/Modifier;La01/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v7

    invoke-static {v4}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v6

    if-ge v1, v6, :cond_2f

    const v1, 0x479ff74c

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    double-to-float v1, v13

    move/from16 v6, v36

    move-object/from16 v7, v37

    const/4 v10, 0x0

    invoke-static {v1, v6, v7, v8, v10}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    goto :goto_1d

    :cond_2f
    move/from16 v6, v36

    move-object/from16 v7, v37

    const/4 v10, 0x0

    const v1, 0x47a1636d

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    :goto_1d
    move-object/from16 v32, v5

    move/from16 v36, v6

    move-object/from16 v37, v7

    move v1, v10

    move/from16 v5, v16

    goto :goto_1c

    :cond_30
    invoke-static {}, Lwb3/f;->d0()V

    throw v18

    :cond_31
    move v10, v1

    move-object/from16 v5, v32

    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    move-object/from16 v26, v3

    move-object v0, v11

    move-object v3, v12

    :goto_1e
    const/4 v15, 0x1

    goto/16 :goto_26

    :cond_32
    move v10, v1

    const v0, 0x47d96211

    invoke-static {v0, v8, v10}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_33
    move-object/from16 v5, v32

    move/from16 v6, v36

    move-object/from16 v7, v37

    move-object/from16 v9, v38

    const/16 p2, 0x3

    const v1, -0x4cac8ade

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v15, 0x0

    :goto_1f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_3c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v19, v15, 0x1

    if-ltz v15, :cond_3b

    check-cast v10, Lld0/e;

    invoke-interface {v4, v10, v9}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/util/List;

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v13

    const/16 v14, 0x100

    if-ne v0, v14, :cond_34

    const/16 v17, 0x1

    goto :goto_20

    :cond_34
    const/16 v17, 0x0

    :goto_20
    invoke-virtual {v8, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    or-int v17, v17, v23

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v17, :cond_36

    if-ne v14, v11, :cond_35

    goto :goto_21

    :cond_35
    move/from16 v23, v0

    goto :goto_22

    :cond_36
    :goto_21
    new-instance v14, Ljp1/c;

    move/from16 v23, v0

    const/16 v0, 0x1a

    invoke-direct {v14, v0, v5, v10}, Ljp1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_22
    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-static {v7, v14}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v10}, Lld0/e;->a()Ljava/lang/String;

    move-result-object v10

    sget v14, Lma0/c;->a:I

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    move-object/from16 v24, v0

    filled-new-array/range {v17 .. v17}, [Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v25, v1

    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->c:Lp1/b0;

    invoke-virtual {v8, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/res/Resources;

    move-object/from16 v26, v3

    const/4 v3, 0x1

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v14, v13, v0}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object v14, v9

    const/4 v9, 0x0

    move/from16 v33, v6

    move-object v6, v10

    const/4 v10, 0x0

    move-object/from16 v32, v5

    move-object v1, v7

    move-object/from16 v30, v14

    move-object/from16 v5, v24

    move-object v7, v0

    move/from16 v0, v33

    invoke-static/range {v5 .. v10}, Llf0/f2;->K(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    const v3, 0x47d9ea68

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    move-object/from16 v3, v16

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v14, 0x0

    :goto_23
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_39

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v13, v14, 0x1

    if-ltz v14, :cond_38

    move-object v6, v5

    check-cast v6, La01/h;

    sget v5, La01/h;->q:I

    shl-int/lit8 v5, v5, 0x3

    or-int v9, v5, v23

    const/4 v10, 0x1

    const/4 v5, 0x0

    move-object/from16 v7, v32

    invoke-static/range {v5 .. v10}, La01/g;->g(Landroidx/compose/ui/Modifier;La01/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static/range {v16 .. v16}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v5

    if-ge v14, v5, :cond_37

    const v5, 0xb851cda

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    const-wide/high16 v5, 0x3ff8000000000000L    # 1.5

    double-to-float v7, v5

    const/4 v10, 0x0

    invoke-static {v7, v0, v1, v8, v10}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    goto :goto_24

    :cond_37
    const-wide/high16 v5, 0x3ff8000000000000L    # 1.5

    const/4 v10, 0x0

    const v7, 0xb86a703

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    :goto_24
    move v14, v13

    goto :goto_23

    :cond_38
    invoke-static {}, Lwb3/f;->d0()V

    throw v18

    :cond_39
    const-wide/high16 v5, 0x3ff8000000000000L    # 1.5

    const/4 v10, 0x0

    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    invoke-static/range {p1 .. p1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v3

    if-ge v15, v3, :cond_3a

    const v3, 0x408790f5

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    move/from16 v3, p2

    int-to-float v7, v3

    mul-float/2addr v7, v0

    const/4 v9, 0x0

    const/4 v15, 0x1

    invoke-static {v1, v9, v7, v15}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v16, 0x6

    const/16 v17, 0xfe

    move-wide/from16 v20, v5

    const/4 v6, 0x0

    move-object v5, v7

    const/4 v7, 0x0

    move-object v15, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v27, v11

    const-wide/16 v10, 0x0

    move-object/from16 v35, v12

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    move/from16 v33, v0

    move/from16 v24, v3

    move-object/from16 v0, v27

    move-object/from16 v3, v35

    const/16 v28, 0x100

    invoke-static/range {v5 .. v17}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v15

    const/4 v10, 0x0

    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    goto :goto_25

    :cond_3a
    move/from16 v24, p2

    move/from16 v33, v0

    move-wide/from16 v20, v5

    move-object v0, v11

    move-object v3, v12

    const/4 v10, 0x0

    const/16 v28, 0x100

    const v5, 0x40893926

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    :goto_25
    move-object v11, v0

    move-object v7, v1

    move-object v12, v3

    move/from16 v15, v19

    move-wide/from16 v13, v20

    move/from16 v0, v23

    move/from16 p2, v24

    move-object/from16 v1, v25

    move-object/from16 v3, v26

    move-object/from16 v9, v30

    move-object/from16 v5, v32

    move/from16 v6, v33

    goto/16 :goto_1f

    :cond_3b
    invoke-static {}, Lwb3/f;->d0()V

    throw v18

    :cond_3c
    move-object/from16 v26, v3

    move-object/from16 v32, v5

    move-object v0, v11

    move-object v3, v12

    const/4 v10, 0x0

    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    goto/16 :goto_1e

    :goto_26
    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    invoke-static {v3}, Llf0/f2;->D(Lp1/c1;)Z

    move-result v1

    if-eqz v1, :cond_42

    const v1, -0x793b7a9a

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lld0/r;->c()Lld0/g;

    move-result-object v5

    if-nez v5, :cond_3d

    const v0, 0x51cc275b

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    goto :goto_27

    :cond_3d
    const v1, 0x51cc275c

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-static {v2}, Llf0/f2;->u(Lp1/c1;)Ljava/util/Set;

    move-result-object v6

    invoke-static/range {v34 .. v34}, Llf0/f2;->I(Lp1/c1;)Lld0/h;

    move-result-object v7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3e

    new-instance v1, Ljt1/b;

    const/16 v4, 0x11

    invoke-direct {v1, v4, v3}, Ljt1/b;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3e
    move-object v9, v1

    check-cast v9, Lc93/a;

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_3f

    if-ne v3, v0, :cond_40

    :cond_3f
    new-instance v3, Ljs2/e;

    const/16 v1, 0x8

    invoke-direct {v3, v1, v2}, Ljs2/e;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_40
    move-object v10, v3

    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_41

    new-instance v1, Ljs2/e;

    const/16 v0, 0x9

    move-object/from16 v12, v34

    invoke-direct {v1, v0, v12}, Ljs2/e;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_41
    move-object v11, v1

    check-cast v11, Lkotlin/jvm/functions/Function1;

    const v13, 0x186000

    const/16 v14, 0x8

    move-object v15, v8

    const/4 v8, 0x0

    move-object v12, v15

    invoke-static/range {v5 .. v14}, Llf0/b2;->i(Lld0/g;Ljava/util/Set;Lld0/h;Ll1/w3;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v12

    const/4 v10, 0x0

    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    :goto_27
    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    goto :goto_28

    :cond_42
    const v0, 0x51d81042

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    :goto_28
    move-object/from16 v5, v26

    move-object/from16 v6, v32

    goto :goto_29

    :cond_43
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v5, v6

    move-object v6, v10

    :goto_29
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_44

    new-instance v0, Ll72/h;

    const/16 v3, 0x13

    move-object/from16 v4, p0

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Ll72/h;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_44
    return-void
.end method

.method private static final r(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lld0/r;)Ljava/util/Set;
    .locals 2

    invoke-virtual {p0}, Lld0/r;->c()Lld0/g;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lld0/g;->c()Lld0/l;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lld0/l;->a()Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_2

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lld0/k;

    invoke-virtual {v1}, Lld0/k;->a()La01/m;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object p0, Lm83/a0;->w:Lm83/a0;

    return-object p0
.end method

.method private static final t(Lp1/t2;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Ljava/util/Set<",
            "La01/m;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method

.method private static final u(Lp1/c1;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/util/Set<",
            "La01/m;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method

.method private static final v(Lp1/c1;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/util/Set<",
            "+",
            "La01/m;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final w(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, Llf0/d2;->a:Llf0/d2;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lhy0/x0$a;

    if-eqz v0, :cond_0

    const-string p1, ""

    invoke-static {p0, p1}, Llf0/f2;->H(Lp1/c1;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lhy0/x0$c;

    if-eqz v0, :cond_1

    check-cast p1, Lhy0/x0$c;

    invoke-virtual {p1}, Lhy0/x0$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Llf0/f2;->H(Lp1/c1;Ljava/lang/String;)V

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Llf0/f2;->F(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;Lld0/e;Ly2/y;)Ll83/a0;
    .locals 5

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llf0/c2;

    invoke-virtual {p1}, Lld0/e;->b()La01/m;

    move-result-object p1

    const-wide/16 v1, 0x0

    invoke-interface {p2, v1, v2}, Ly2/y;->Z(J)J

    move-result-wide v1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    long-to-int p2, v1

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    float-to-int p2, p2

    invoke-direct {v0, p1, p2}, Llf0/c2;-><init>(La01/m;I)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
