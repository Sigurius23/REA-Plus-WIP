.class public abstract Lpy0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\u0015\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0003\u001a\u0015\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0003\u001a\u0015\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\u0003\u00a8\u0006\t"
    }
    d2 = {
        "",
        "Ll83/a0;",
        "X",
        "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;",
        "S",
        "N",
        "I",
        "D",
        "y",
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
.method private static final A()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final B()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final C()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static final D(Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    sget-object v4, Lny0/v0$b;->d:Lny0/v0$b;

    move-object/from16 v10, p0

    check-cast v10, Lp1/q;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-ne v0, v13, :cond_0

    new-instance v0, Lpy0/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    move-object v9, v0

    check-cast v9, Lc93/a;

    const v11, 0x30030db0

    const/16 v12, 0x1c1

    const/4 v0, 0x0

    const-string v1, "Med Settings Text"

    const-string v2, "Settings label"

    const-string v3, "Support text"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v12}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float v14, v0, v1

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v10, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v13, :cond_1

    new-instance v0, Lpy0/c;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v9, v0

    check-cast v9, Lc93/a;

    const v11, 0x30030db0

    const/16 v12, 0x1c1

    const/4 v0, 0x0

    const-string v1, "Med Settings Text"

    const-string v2, "Settings label"

    const-string v3, "Support text"

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v12}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v10, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v13, :cond_2

    new-instance v0, Lpy0/c;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v9, v0

    check-cast v9, Lc93/a;

    const v11, 0x301b0db0

    const/16 v12, 0x181

    const/4 v0, 0x0

    const-string v1, "Med Settings Text"

    const-string v2, "Settings label"

    const-string v3, "Support text"

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v12}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v10, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v13, :cond_3

    new-instance v0, Lpy0/c;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v9, v0

    check-cast v9, Lc93/a;

    const v11, 0x301b0db0

    const/16 v12, 0x181

    const/4 v0, 0x0

    const-string v1, "Med Settings Text"

    const-string v2, "Settings label"

    const-string v3, "Support text"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v12}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object v13, Ll83/a0;->a:Ll83/a0;

    move-object v14, v13

    move-object v15, v13

    move-object/from16 v16, v13

    move-object/from16 v17, v13

    move-object/from16 v18, v13

    move-object/from16 v19, v13

    filled-new-array/range {v13 .. v19}, [Ll83/a0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final E()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final F()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final G()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final H()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static final I(Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v4, Lny0/v0$c;

    sget-object v13, Lny0/e1;->FIXED:Lny0/e1;

    const/4 v14, 0x0

    const/4 v15, 0x2

    invoke-direct {v4, v13, v14, v15, v14}, Lny0/v0$c;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v10, p0

    check-cast v10, Lp1/q;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_0

    new-instance v0, Lpc3/r;

    const/16 v2, 0x1c

    invoke-direct {v0, v2}, Lpc3/r;-><init>(I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    move-object v9, v0

    check-cast v9, Lc93/a;

    const v11, 0x301b0030

    const/16 v12, 0x18d

    const/4 v0, 0x0

    move-object v2, v1

    const-string v1, "1"

    move-object v3, v2

    const/4 v2, 0x0

    move-object v5, v3

    const/4 v3, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object/from16 v16, v8

    const/4 v8, 0x0

    move-object/from16 v29, v16

    invoke-static/range {v0 .. v12}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v10, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Lny0/v0$c;

    invoke-direct {v2, v13, v14, v15, v14}, Lny0/v0$c;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v5, v29

    if-ne v3, v5, :cond_1

    new-instance v3, Lpy0/c;

    const/16 v4, 0x9

    invoke-direct {v3, v4}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object/from16 v25, v3

    check-cast v25, Lc93/a;

    const v27, 0x301b0030

    const/16 v28, 0x18d

    const/16 v16, 0x0

    const-string v17, "1"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, v2

    move-object/from16 v26, v10

    invoke-static/range {v16 .. v28}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v10, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Lny0/v0$c;

    invoke-direct {v2, v13, v14, v15, v14}, Lny0/v0$c;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_2

    new-instance v3, Lpy0/c;

    const/16 v4, 0xe

    invoke-direct {v3, v4}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object/from16 v25, v3

    check-cast v25, Lc93/a;

    const v27, 0x30030030

    const/16 v28, 0x1cd

    const/16 v16, 0x0

    const-string v17, "1"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, v2

    move-object/from16 v26, v10

    invoke-static/range {v16 .. v28}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v10, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v0, Lny0/v0$c;

    invoke-direct {v0, v13, v14, v15, v14}, Lny0/v0$c;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_3

    new-instance v1, Lpy0/c;

    const/16 v2, 0xf

    invoke-direct {v1, v2}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object/from16 v25, v1

    check-cast v25, Lc93/a;

    const v27, 0x30030030

    const/16 v28, 0x1cd

    const/16 v16, 0x0

    const-string v17, "1"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, v0

    move-object/from16 v26, v10

    invoke-static/range {v16 .. v28}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    filled-new-array/range {v1 .. v7}, [Ll83/a0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final J()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final K()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final L()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final M()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static final N(Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v4, Lny0/v0$d;

    sget-object v13, Lny0/e1;->FIXED:Lny0/e1;

    const/4 v14, 0x0

    const/4 v15, 0x2

    invoke-direct {v4, v13, v14, v15, v14}, Lny0/v0$d;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v10, p0

    check-cast v10, Lp1/q;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_0

    new-instance v0, Lpy0/c;

    const/16 v2, 0x14

    invoke-direct {v0, v2}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    move-object v9, v0

    check-cast v9, Lc93/a;

    const v11, 0x30030030

    const/16 v12, 0x1cd

    const/4 v0, 0x0

    move-object v2, v1

    const-string v1, "F"

    move-object v3, v2

    const/4 v2, 0x0

    move-object v5, v3

    const/4 v3, 0x0

    move-object v6, v5

    const/4 v5, 0x1

    move-object v7, v6

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object/from16 v16, v8

    const/4 v8, 0x0

    move-object/from16 v29, v16

    invoke-static/range {v0 .. v12}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v10, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Lny0/v0$d;

    invoke-direct {v2, v13, v14, v15, v14}, Lny0/v0$d;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v5, v29

    if-ne v3, v5, :cond_1

    new-instance v3, Lpy0/c;

    const/16 v4, 0x15

    invoke-direct {v3, v4}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object/from16 v25, v3

    check-cast v25, Lc93/a;

    const v27, 0x301b0030

    const/16 v28, 0x18d

    const/16 v16, 0x0

    const-string v17, "F"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, v2

    move-object/from16 v26, v10

    invoke-static/range {v16 .. v28}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v10, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Lny0/v0$d;

    invoke-direct {v2, v13, v14, v15, v14}, Lny0/v0$d;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_2

    new-instance v3, Lpc3/r;

    const/16 v4, 0x1d

    invoke-direct {v3, v4}, Lpc3/r;-><init>(I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object/from16 v25, v3

    check-cast v25, Lc93/a;

    const v27, 0x301b0030

    const/16 v28, 0x18d

    const/16 v16, 0x0

    const-string v17, "F"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, v2

    move-object/from16 v26, v10

    invoke-static/range {v16 .. v28}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v10, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v0, Lny0/v0$d;

    invoke-direct {v0, v13, v14, v15, v14}, Lny0/v0$d;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_3

    new-instance v1, Lpy0/c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object/from16 v25, v1

    check-cast v25, Lc93/a;

    const v27, 0x30030030

    const/16 v28, 0x1cd

    const/16 v16, 0x0

    const-string v17, "F"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, v0

    move-object/from16 v26, v10

    invoke-static/range {v16 .. v28}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    filled-new-array/range {v1 .. v7}, [Ll83/a0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final O()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final P()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final Q()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final R()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static final S(Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v4, Lny0/v0$c;

    sget-object v13, Lny0/e1;->FLEXIBLE:Lny0/e1;

    const/4 v14, 0x0

    const/4 v15, 0x2

    invoke-direct {v4, v13, v14, v15, v14}, Lny0/v0$c;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v10, p0

    check-cast v10, Lp1/q;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_0

    new-instance v0, Lpy0/c;

    const/4 v2, 0x5

    invoke-direct {v0, v2}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    move-object v9, v0

    check-cast v9, Lc93/a;

    const v11, 0x30030030

    const/16 v12, 0x1cd

    const/4 v0, 0x0

    move-object v2, v1

    const-string v1, "123456789"

    move-object v3, v2

    const/4 v2, 0x0

    move-object v5, v3

    const/4 v3, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object/from16 v16, v8

    const/4 v8, 0x0

    move-object/from16 v29, v16

    invoke-static/range {v0 .. v12}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v10, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Lny0/v0$c;

    invoke-direct {v2, v13, v14, v15, v14}, Lny0/v0$c;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v5, v29

    if-ne v3, v5, :cond_1

    new-instance v3, Lpy0/c;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object/from16 v25, v3

    check-cast v25, Lc93/a;

    const v27, 0x30030030

    const/16 v28, 0x1cd

    const/16 v16, 0x0

    const-string v17, "1234"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, v2

    move-object/from16 v26, v10

    invoke-static/range {v16 .. v28}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v10, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Lny0/v0$c;

    invoke-direct {v2, v13, v14, v15, v14}, Lny0/v0$c;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_2

    new-instance v3, Lpy0/c;

    const/4 v4, 0x7

    invoke-direct {v3, v4}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object/from16 v25, v3

    check-cast v25, Lc93/a;

    const v27, 0x301b0030

    const/16 v28, 0x18d

    const/16 v16, 0x0

    const-string v17, "12345"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, v2

    move-object/from16 v26, v10

    invoke-static/range {v16 .. v28}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v10, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v0, Lny0/v0$c;

    invoke-direct {v0, v13, v14, v15, v14}, Lny0/v0$c;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_3

    new-instance v1, Lpy0/c;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object/from16 v25, v1

    check-cast v25, Lc93/a;

    const v27, 0x301b0030

    const/16 v28, 0x18d

    const/16 v16, 0x0

    const-string v17, "12"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, v0

    move-object/from16 v26, v10

    invoke-static/range {v16 .. v28}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    filled-new-array/range {v1 .. v7}, [Ll83/a0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final T()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final U()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final V()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final W()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static final X(Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v4, Lny0/v0$d;

    sget-object v13, Lny0/e1;->FLEXIBLE:Lny0/e1;

    const/4 v14, 0x0

    const/4 v15, 0x2

    invoke-direct {v4, v13, v14, v15, v14}, Lny0/v0$d;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v10, p0

    check-cast v10, Lp1/q;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_0

    new-instance v0, Lpy0/c;

    const/16 v2, 0xa

    invoke-direct {v0, v2}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    move-object v9, v0

    check-cast v9, Lc93/a;

    const v11, 0x30030030

    const/16 v12, 0x1cd

    const/4 v0, 0x0

    move-object v2, v1

    const-string v1, "Once upon"

    move-object v3, v2

    const/4 v2, 0x0

    move-object v5, v3

    const/4 v3, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object/from16 v16, v8

    const/4 v8, 0x0

    move-object/from16 v29, v16

    invoke-static/range {v0 .. v12}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v10, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Lny0/v0$d;

    invoke-direct {v2, v13, v14, v15, v14}, Lny0/v0$d;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v5, v29

    if-ne v3, v5, :cond_1

    new-instance v3, Lpy0/c;

    const/16 v4, 0xb

    invoke-direct {v3, v4}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object/from16 v25, v3

    check-cast v25, Lc93/a;

    const v27, 0x30030030

    const/16 v28, 0x1cd

    const/16 v16, 0x0

    const-string v17, "a time"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, v2

    move-object/from16 v26, v10

    invoke-static/range {v16 .. v28}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v10, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Lny0/v0$d;

    invoke-direct {v2, v13, v14, v15, v14}, Lny0/v0$d;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_2

    new-instance v3, Lpy0/c;

    const/16 v4, 0xc

    invoke-direct {v3, v4}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object/from16 v25, v3

    check-cast v25, Lc93/a;

    const v27, 0x301b0030

    const/16 v28, 0x18d

    const/16 v16, 0x0

    const-string v17, "there were three little pigs"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, v2

    move-object/from16 v26, v10

    invoke-static/range {v16 .. v28}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v10, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v0, Lny0/v0$d;

    invoke-direct {v0, v13, v14, v15, v14}, Lny0/v0$d;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_3

    new-instance v1, Lpy0/c;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object/from16 v25, v1

    check-cast v25, Lc93/a;

    const v27, 0x301b0030

    const/16 v28, 0x18d

    const/16 v16, 0x0

    const-string v17, "--------"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, v0

    move-object/from16 v26, v10

    invoke-static/range {v16 .. v28}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    filled-new-array/range {v1 .. v7}, [Ll83/a0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final Y()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final Z()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->M()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method private static final a0()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->C()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method private static final b0()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->K()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->L()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->E()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->P()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->H()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->A()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->V()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic j()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->W()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic k()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->R()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic l()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->z()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic m()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->Q()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic n()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->b0()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic o()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->B()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic p()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->Y()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic q()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->F()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic r()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->G()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic s()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->U()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic t()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->T()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic u()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->O()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic v()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->J()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic w()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->a0()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic x()Ll83/a0;
    .locals 1

    invoke-static {}, Lpy0/d;->Z()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final y(Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v4, Lny0/v0$a;

    const/4 v13, 0x0

    const/4 v14, 0x1

    invoke-direct {v4, v13, v14, v13}, Lny0/v0$a;-><init>(Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v10, p0

    check-cast v10, Lp1/q;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-ne v0, v15, :cond_0

    new-instance v0, Lpy0/c;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    move-object v9, v0

    check-cast v9, Lc93/a;

    const v11, 0x30030db0

    const/16 v12, 0x1c1

    const/4 v0, 0x0

    const-string v1, "123456"

    const-string v2, "Settings label"

    const-string v3, "Support text"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v12}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    int-to-float v0, v14

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v10, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Lny0/v0$a;

    invoke-direct {v2, v13, v14, v13}, Lny0/v0$a;-><init>(Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v15, :cond_1

    new-instance v3, Lpy0/c;

    const/16 v4, 0x11

    invoke-direct {v3, v4}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object/from16 v24, v3

    check-cast v24, Lc93/a;

    const v26, 0x30030db0

    const/16 v27, 0x1c1

    move-object v3, v15

    const/4 v15, 0x0

    const-string v16, "123456"

    const-string v17, "Settings label"

    const-string v18, "Support text"

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v19, v2

    move-object/from16 v25, v10

    invoke-static/range {v15 .. v27}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v10, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Lny0/v0$a;

    invoke-direct {v2, v13, v14, v13}, Lny0/v0$a;-><init>(Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_2

    new-instance v4, Lpy0/c;

    const/16 v5, 0x12

    invoke-direct {v4, v5}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object/from16 v24, v4

    check-cast v24, Lc93/a;

    const v26, 0x301b0db0

    const/16 v27, 0x181

    const/4 v15, 0x0

    const-string v16, "123456"

    const-string v17, "Settings label"

    const-string v18, "Support text"

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v19, v2

    move-object/from16 v25, v10

    invoke-static/range {v15 .. v27}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v10, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v0, Lny0/v0$a;

    invoke-direct {v0, v13, v14, v13}, Lny0/v0$a;-><init>(Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_3

    new-instance v1, Lpy0/c;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Lpy0/c;-><init>(I)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object/from16 v24, v1

    check-cast v24, Lc93/a;

    const v26, 0x301b0db0

    const/16 v27, 0x181

    const/4 v15, 0x0

    const-string v16, "123456"

    const-string v17, "Settings label"

    const-string v18, "Support text"

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v19, v0

    move-object/from16 v25, v10

    invoke-static/range {v15 .. v27}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    filled-new-array/range {v1 .. v7}, [Ll83/a0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final z()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
