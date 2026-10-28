.class public abstract Lgb1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0007\u001a+\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001b\u0010\u0008\u001a\u00020\u0000*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\n\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "Ly3/f;",
        "fadeHeight",
        "Lkotlin/Function0;",
        "",
        "fadeProgress",
        "h",
        "(Landroidx/compose/ui/Modifier;FLc93/a;)Landroidx/compose/ui/Modifier;",
        "e",
        "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;",
        "l",
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
.method public static synthetic a(Lc93/a;FLk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lgb1/c;->k(Lc93/a;FLk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(FLk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lgb1/c;->g(FLk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()F
    .locals 1

    invoke-static {}, Lgb1/c;->j()F

    move-result v0

    return v0
.end method

.method public static synthetic d(FLk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lgb1/c;->n(FLk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
    .locals 12

    const-string v0, "$this$fadeBottomEdge"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x1

    const v11, 0x6ffff

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v11}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object p0

    new-instance v0, Lb01/k;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Lb01/k;-><init>(FI)V

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0x10

    int-to-float p1, p1

    :cond_0
    invoke-static {p0, p1}, Lgb1/c;->e(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final g(FLk2/c;)Ll83/a0;
    .locals 11

    const-string v1, "$this$drawWithContent"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, La3/p0;

    invoke-virtual {v1}, La3/p0;->a()V

    iget-object v2, v1, La3/p0;->w:Lk2/b;

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v3

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    sget-object v10, Ll83/a0;->a:Ll83/a0;

    if-gtz v3, :cond_0

    return-object v10

    :cond_0
    invoke-virtual {v1, p0}, La3/p0;->q0(F)F

    move-result v1

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v2

    and-long/2addr v2, v5

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    div-float/2addr v1, v2

    const/high16 v2, 0x3f000000    # 0.5f

    cmpl-float v3, v1, v2

    if-lez v3, :cond_1

    move v1, v2

    :cond_1
    sget-object v2, Li2/t;->b:Li2/s;

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v1, v3, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    sget-wide v5, Li2/x;->b:J

    new-instance v7, Li2/x;

    invoke-direct {v7, v5, v6}, Li2/x;-><init>(J)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v1, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    sget-wide v6, Li2/x;->m:J

    new-instance v3, Li2/x;

    invoke-direct {v3, v6, v7}, Li2/x;-><init>(J)V

    new-instance v6, Ll83/k;

    invoke-direct {v6, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v6}, [Ll83/k;

    move-result-object v1

    const/16 v3, 0xe

    invoke-static {v2, v1, v4, v4, v3}, Li2/s;->l(Li2/s;[Ll83/k;FFI)Li2/k0;

    move-result-object v1

    const/4 v8, 0x6

    const/16 v9, 0x3e

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v9}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    return-object v10
.end method

.method public static final h(Landroidx/compose/ui/Modifier;FLc93/a;)Landroidx/compose/ui/Modifier;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "F",
            "Lc93/a;",
            ")",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    const-string v0, "$this$fadeTopEdge"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fadeProgress"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x1

    const v11, 0x6ffff

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v11}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object p0

    new-instance v0, Lgb1/b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, p2}, Lgb1/b;-><init>(FILc93/a;)V

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static i(Landroidx/compose/ui/Modifier;FLc93/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/16 p1, 0x10

    int-to-float p1, p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    new-instance p2, Lga1/a;

    const/4 p3, 0x3

    invoke-direct {p2, p3}, Lga1/a;-><init>(I)V

    :cond_1
    invoke-static {p0, p1, p2}, Lgb1/c;->h(Landroidx/compose/ui/Modifier;FLc93/a;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final j()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method private static final k(Lc93/a;FLk2/c;)Ll83/a0;
    .locals 11

    const-string v1, "$this$drawWithContent"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p2

    check-cast v1, La3/p0;

    invoke-virtual {v1}, La3/p0;->a()V

    iget-object v2, v1, La3/p0;->w:Lk2/b;

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v3

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    sget-object v10, Ll83/a0;->a:Ll83/a0;

    if-gtz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    cmpg-float v7, v3, v4

    if-gtz v7, :cond_1

    :goto_0
    return-object v10

    :cond_1
    invoke-virtual {v1, p1}, La3/p0;->q0(F)F

    move-result v1

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v7

    and-long/2addr v5, v7

    long-to-int v2, v5

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    div-float/2addr v1, v2

    const/high16 v2, 0x3f000000    # 0.5f

    cmpl-float v5, v1, v2

    if-lez v5, :cond_2

    move v1, v2

    :cond_2
    sget-object v2, Li2/t;->b:Li2/s;

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    sget-wide v6, Li2/x;->b:J

    const/high16 v8, 0x3f800000    # 1.0f

    sub-float/2addr v8, v3

    invoke-static {v8, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v8

    new-instance v3, Li2/x;

    invoke-direct {v3, v8, v9}, Li2/x;-><init>(J)V

    new-instance v8, Ll83/k;

    invoke-direct {v8, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v6, v7}, Li2/x;-><init>(J)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v8, v5}, [Ll83/k;

    move-result-object v1

    const/16 v3, 0xe

    invoke-static {v2, v1, v4, v4, v3}, Li2/s;->l(Li2/s;[Ll83/k;FFI)Li2/k0;

    move-result-object v1

    const/4 v8, 0x6

    const/16 v9, 0x3e

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v9}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    return-object v10
.end method

.method public static final l(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
    .locals 12

    const-string v0, "$this$fadeVerticalEdges"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x1

    const v11, 0x6ffff

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v11}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object p0

    new-instance v0, Lb01/k;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lb01/k;-><init>(FI)V

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static m(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0x10

    int-to-float p1, p1

    :cond_0
    invoke-static {p0, p1}, Lgb1/c;->l(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final n(FLk2/c;)Ll83/a0;
    .locals 13

    const-string v1, "$this$drawWithContent"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, La3/p0;

    invoke-virtual {v1}, La3/p0;->a()V

    iget-object v2, v1, La3/p0;->w:Lk2/b;

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v3

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    sget-object v10, Ll83/a0;->a:Ll83/a0;

    if-gtz v3, :cond_0

    return-object v10

    :cond_0
    invoke-virtual {v1, p0}, La3/p0;->q0(F)F

    move-result v1

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v2

    and-long/2addr v2, v5

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    div-float/2addr v1, v2

    const/high16 v2, 0x3f000000    # 0.5f

    cmpl-float v3, v1, v2

    if-lez v3, :cond_1

    move v1, v2

    :cond_1
    sget-object v2, Li2/t;->b:Li2/s;

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    sget-wide v5, Li2/x;->m:J

    new-instance v7, Li2/x;

    invoke-direct {v7, v5, v6}, Li2/x;-><init>(J)V

    new-instance v8, Ll83/k;

    invoke-direct {v8, v3, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    sget-wide v11, Li2/x;->b:J

    new-instance v7, Li2/x;

    invoke-direct {v7, v11, v12}, Li2/x;-><init>(J)V

    new-instance v9, Ll83/k;

    invoke-direct {v9, v3, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v1, v3, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    new-instance v7, Li2/x;

    invoke-direct {v7, v11, v12}, Li2/x;-><init>(J)V

    new-instance v11, Ll83/k;

    invoke-direct {v11, v1, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v5, v6}, Li2/x;-><init>(J)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v8, v9, v11, v5}, [Ll83/k;

    move-result-object v1

    const/16 v3, 0xe

    invoke-static {v2, v1, v4, v4, v3}, Li2/s;->l(Li2/s;[Ll83/k;FFI)Li2/k0;

    move-result-object v1

    const/4 v8, 0x6

    const/16 v9, 0x3e

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v9}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    return-object v10
.end method
