.class public abstract Lzc1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0006\u00b2\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0005\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "e",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Lc41/r;",
        "selectableUnselected",
        "selectableSelected",
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/h;->l(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/h;->k(Landroid/content/Context;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/h;->m(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/content/Context;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/h;->j(Landroid/content/Context;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/runtime/Composer;I)V
    .locals 28

    move/from16 v0, p1

    move-object/from16 v5, p0

    check-cast v5, Lp1/q;

    const v1, 0x1f2c6bdc

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v5, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_c

    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v5, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroid/content/Context;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "10:37"

    const-string v4, "9:57"

    const-string v6, "16.4"

    const-string v9, "Run"

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v2, v10, :cond_1

    new-instance v11, Lc41/r;

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    new-instance v2, Lkd1/o$a;

    invoke-static {}, Lc13/a;->a()I

    move-result v1

    invoke-direct {v2, v1}, Lkd1/o$a;-><init>(I)V

    sget-object v22, Lcom/whoop/design/models/ActivityTileSelectionState;->SELECTABLE:Lcom/whoop/design/models/ActivityTileSelectionState;

    const/16 v25, 0x13c0

    const/16 v26, 0x0

    const-string v17, "activity-1"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v16, v2

    invoke-direct/range {v11 .. v26}, Lc41/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;ZLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ActivityTileSelectionState;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v11}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v2, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_2

    new-instance v11, Lc41/r;

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    new-instance v1, Lkd1/o$a;

    invoke-static {}, Lc13/a;->a()I

    move-result v7

    invoke-direct {v1, v7}, Lkd1/o$a;-><init>(I)V

    sget-object v22, Lcom/whoop/design/models/ActivityTileSelectionState;->SELECTABLE:Lcom/whoop/design/models/ActivityTileSelectionState;

    const/16 v25, 0x13c0

    const/16 v26, 0x0

    const-string v17, "activity-2"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x1

    const/16 v24, 0x0

    move-object/from16 v16, v1

    invoke-direct/range {v11 .. v26}, Lc41/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;ZLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ActivityTileSelectionState;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v11}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v7, v1

    check-cast v7, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_3

    new-instance v11, Lc41/r;

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    new-instance v1, Lkd1/o$a;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    invoke-direct {v1, v3}, Lkd1/o$a;-><init>(I)V

    sget-object v22, Lcom/whoop/design/models/ActivityTileSelectionState;->NOT_SELECTABLE:Lcom/whoop/design/models/ActivityTileSelectionState;

    const/16 v25, 0x1bc0

    const/16 v26, 0x0

    const-string v17, "activity-3"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v16, v1

    invoke-direct/range {v11 .. v26}, Lc41/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;ZLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ActivityTileSelectionState;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v11

    :cond_3
    move-object v9, v1

    check-cast v9, Lc41/r;

    const/high16 v11, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v3, 0x1

    int-to-float v4, v3

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v4, v3

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v13, v5, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v14, v5, Lp1/q;->S:Z

    if-eqz v14, :cond_4

    invoke-virtual {v5, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_1
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v5, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v5, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-nez v6, :cond_5

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v6, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    :cond_5
    invoke-static {v4, v5, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v5, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "Selectable - not selected"

    const/4 v13, 0x6

    invoke-static {v1, v5, v13}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x2

    int-to-float v1, v1

    const/4 v3, 0x4

    int-to-float v14, v3

    mul-float v15, v1, v14

    invoke-static {v15, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v1, Lc41/q;

    invoke-direct {v1}, Lc41/q;-><init>()V

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object v4, v3

    invoke-static {v2}, Lzc1/h;->f(Lp1/c1;)Lc41/r;

    move-result-object v3

    invoke-virtual {v5, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v6, :cond_7

    if-ne v11, v10, :cond_8

    :cond_7
    new-instance v11, Lzc1/g;

    const/4 v6, 0x0

    invoke-direct {v11, v8, v2, v6}, Lzc1/g;-><init>(Landroid/content/Context;Lp1/c1;I)V

    invoke-virtual {v5, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v11, Lkotlin/jvm/functions/Function1;

    sget v2, Lc41/r;->n:I

    shl-int/lit8 v2, v2, 0x3

    or-int/lit8 v6, v2, 0x6

    sget v16, Lc41/q;->a:I

    shl-int/lit8 v16, v16, 0x9

    or-int v6, v6, v16

    move-object/from16 v27, v11

    move v11, v2

    move-object v2, v4

    move-object/from16 v4, v27

    invoke-virtual/range {v1 .. v6}, Lc41/q;->b(Landroidx/compose/ui/Modifier;Lc41/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    mul-float/2addr v14, v14

    invoke-static {v14, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "Selectable - selected"

    invoke-static {v1, v5, v13}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v15, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v1, Lc41/q;

    invoke-direct {v1}, Lc41/q;-><init>()V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object v2, v3

    invoke-static {v7}, Lzc1/h;->h(Lp1/c1;)Lc41/r;

    move-result-object v3

    invoke-virtual {v5, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v4, :cond_9

    if-ne v13, v10, :cond_a

    :cond_9
    new-instance v13, Lzc1/g;

    const/4 v4, 0x1

    invoke-direct {v13, v8, v7, v4}, Lzc1/g;-><init>(Landroid/content/Context;Lp1/c1;I)V

    invoke-virtual {v5, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v4, v13

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual/range {v1 .. v6}, Lc41/q;->b(Landroidx/compose/ui/Modifier;Lc41/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v14, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "Not selectable"

    const/4 v2, 0x6

    invoke-static {v1, v5, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v15, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v1, Lc41/q;

    invoke-direct {v1}, Lc41/q;-><init>()V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v10, :cond_b

    new-instance v3, Lz72/f;

    const/16 v4, 0x8

    invoke-direct {v3, v4}, Lz72/f;-><init>(I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v4, v3

    check-cast v4, Lkotlin/jvm/functions/Function1;

    or-int/lit16 v3, v11, 0x186

    or-int v6, v3, v16

    move-object v3, v9

    invoke-virtual/range {v1 .. v6}, Lc41/q;->b(Landroidx/compose/ui/Modifier;Lc41/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v3, 0x1

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_c
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_d

    new-instance v2, Lv41/c;

    const/16 v3, 0x1c

    invoke-direct {v2, v0, v3}, Lv41/c;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final f(Lp1/c1;)Lc41/r;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lc41/r;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc41/r;

    return-object p0
.end method

.method private static final g(Lp1/c1;Lc41/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lc41/r;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final h(Lp1/c1;)Lc41/r;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lc41/r;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc41/r;

    return-object p0
.end method

.method private static final i(Lp1/c1;Lc41/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lc41/r;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final j(Landroid/content/Context;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 18

    move-object/from16 v0, p2

    const-string v1, "event"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lc41/v;

    if-eqz v1, :cond_0

    invoke-static/range {p1 .. p1}, Lzc1/h;->f(Lp1/c1;)Lc41/r;

    move-result-object v2

    check-cast v0, Lc41/v;

    invoke-virtual {v0}, Lc41/v;->b()Z

    move-result v14

    const/16 v16, 0x17ff

    const/16 v17, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static/range {v2 .. v17}, Lc41/r;->b(Lc41/r;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;ZLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ActivityTileSelectionState;ZLjava/lang/String;ILjava/lang/Object;)Lc41/r;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lzc1/h;->g(Lp1/c1;Lc41/r;)V

    invoke-virtual {v0}, Lc41/v;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lc41/v;->b()Z

    move-result v0

    const-string v2, "Toggle "

    const-string v3, " selected="

    invoke-static {v2, v1, v3, v0}, Ld13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    move-object/from16 v2, p0

    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final k(Landroid/content/Context;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 18

    move-object/from16 v0, p2

    const-string v1, "event"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lc41/v;

    if-eqz v1, :cond_0

    invoke-static/range {p1 .. p1}, Lzc1/h;->h(Lp1/c1;)Lc41/r;

    move-result-object v2

    check-cast v0, Lc41/v;

    invoke-virtual {v0}, Lc41/v;->b()Z

    move-result v14

    const/16 v16, 0x17ff

    const/16 v17, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static/range {v2 .. v17}, Lc41/r;->b(Lc41/r;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;ZLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ActivityTileSelectionState;ZLjava/lang/String;ILjava/lang/Object;)Lc41/r;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lzc1/h;->i(Lp1/c1;Lc41/r;)V

    invoke-virtual {v0}, Lc41/v;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lc41/v;->b()Z

    move-result v0

    const-string v2, "Toggle "

    const-string v3, " selected="

    invoke-static {v2, v1, v3, v0}, Ld13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    move-object/from16 v2, p0

    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final l(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/h;->e(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
