.class public abstract Lau2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0003\u00a8\u0006\u0006"
    }
    d2 = {
        "Lk2/e;",
        "Ll83/a0;",
        "c",
        "(Lk2/e;)V",
        "b",
        "a",
        "weekly-plan_release"
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
.method public static final a(Lk2/e;)V
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v7

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v1

    const/16 v3, 0x20

    shr-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v2

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    iget-object v3, v7, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {v7}, Li2/j;->k()V

    const/high16 v4, 0x42500000    # 52.0f

    const/4 v8, 0x0

    invoke-virtual {v7, v8, v4}, Li2/j;->i(FF)V

    const/4 v4, 0x2

    int-to-float v4, v4

    const/high16 v5, 0x42000000    # 32.0f

    mul-float v6, v4, v5

    const/high16 v9, 0x41a00000    # 20.0f

    add-float v10, v6, v9

    iget-object v11, v7, Li2/j;->b:Landroid/graphics/RectF;

    if-nez v11, :cond_0

    new-instance v11, Landroid/graphics/RectF;

    invoke-direct {v11}, Landroid/graphics/RectF;-><init>()V

    iput-object v11, v7, Li2/j;->b:Landroid/graphics/RectF;

    :cond_0
    iget-object v11, v7, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v11, v8, v9, v6, v10}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v11, v7, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/high16 v12, 0x43340000    # 180.0f

    const/high16 v13, 0x42b40000    # 90.0f

    const/4 v14, 0x0

    invoke-virtual {v3, v11, v12, v13, v14}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    div-float v11, v1, v4

    const/high16 v12, 0x42200000    # 40.0f

    div-float/2addr v12, v4

    sub-float v4, v11, v12

    invoke-virtual {v7, v4, v9}, Li2/j;->h(FF)V

    invoke-virtual {v7, v11, v8}, Li2/j;->h(FF)V

    add-float/2addr v12, v11

    invoke-virtual {v7, v12, v9}, Li2/j;->h(FF)V

    sub-float v15, v1, v5

    invoke-virtual {v7, v15, v9}, Li2/j;->h(FF)V

    sub-float v15, v1, v6

    move/from16 v16, v5

    iget-object v5, v7, Li2/j;->b:Landroid/graphics/RectF;

    if-nez v5, :cond_1

    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    iput-object v5, v7, Li2/j;->b:Landroid/graphics/RectF;

    :cond_1
    iget-object v5, v7, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v5, v15, v9, v1, v10}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v5, v7, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/high16 v10, 0x43870000    # 270.0f

    invoke-virtual {v3, v5, v10, v13, v14}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    sub-float v5, v2, v16

    invoke-virtual {v7, v1, v5}, Li2/j;->h(FF)V

    sub-float v5, v2, v6

    iget-object v10, v7, Li2/j;->b:Landroid/graphics/RectF;

    if-nez v10, :cond_2

    new-instance v10, Landroid/graphics/RectF;

    invoke-direct {v10}, Landroid/graphics/RectF;-><init>()V

    iput-object v10, v7, Li2/j;->b:Landroid/graphics/RectF;

    :cond_2
    iget-object v10, v7, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v10, v15, v5, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v1, v7, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3, v1, v8, v13, v14}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    move/from16 v1, v16

    invoke-virtual {v7, v1, v2}, Li2/j;->h(FF)V

    iget-object v1, v7, Li2/j;->b:Landroid/graphics/RectF;

    if-nez v1, :cond_3

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, v7, Li2/j;->b:Landroid/graphics/RectF;

    :cond_3
    iget-object v1, v7, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v8, v5, v6, v2}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v1, v7, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3, v1, v13, v13, v14}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    invoke-virtual {v7}, Li2/j;->f()V

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v1

    invoke-virtual {v1, v4, v9}, Li2/j;->i(FF)V

    invoke-virtual {v1, v11, v8}, Li2/j;->h(FF)V

    invoke-virtual {v1, v12, v9}, Li2/j;->h(FF)V

    invoke-virtual {v1}, Li2/j;->f()V

    const v9, 0x1affffff

    invoke-static {v9}, Li2/w0;->c(I)J

    move-result-wide v2

    const/4 v5, 0x0

    const/16 v6, 0x3c

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lk2/e;->z(Lk2/e;Li2/s0;JFLk2/f;I)V

    sget-object v1, Li2/t;->b:Li2/s;

    invoke-static {v9}, Li2/w0;->c(I)J

    move-result-wide v2

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    const v2, 0xdffffff

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v2

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    const v2, 0xffffff

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v9

    new-instance v3, Li2/x;

    invoke-direct {v3, v9, v10}, Li2/x;-><init>(J)V

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v9

    new-instance v2, Li2/x;

    invoke-direct {v2, v9, v10}, Li2/x;-><init>(J)V

    filled-new-array {v4, v5, v3, v2}, [Li2/x;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/16 v3, 0xe

    invoke-static {v1, v2, v8, v8, v3}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v2

    new-instance v4, Lk2/i;

    const/4 v1, 0x1

    int-to-float v1, v1

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v9

    const/4 v13, 0x0

    const/16 v14, 0x1e

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v8, v4

    invoke-direct/range {v8 .. v14}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/16 v5, 0x34

    const/4 v3, 0x0

    move-object v1, v7

    invoke-static/range {v0 .. v5}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V

    return-void
.end method

.method public static final b(Lk2/e;)V
    .locals 16

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0xc

    int-to-float v1, v1

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v1

    sget-object v2, Li2/t;->b:Li2/s;

    const v3, 0x1affffff

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    const v3, 0xdffffff

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    new-instance v6, Li2/x;

    invoke-direct {v6, v3, v4}, Li2/x;-><init>(J)V

    const v3, 0xffffff

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v7

    new-instance v4, Li2/x;

    invoke-direct {v4, v7, v8}, Li2/x;-><init>(J)V

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v7

    new-instance v3, Li2/x;

    invoke-direct {v3, v7, v8}, Li2/x;-><init>(J)V

    filled-new-array {v5, v6, v4, v3}, [Li2/x;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/16 v4, 0xe

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v5, v4}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v2

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v3

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v6

    const-wide v8, 0xffffffffL

    and-long/2addr v6, v8

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    const/4 v7, 0x1

    invoke-static {v5, v6, v3, v4, v7}, Lh2/e;->a(FFJI)J

    move-result-wide v3

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    const/high16 v7, 0x41a00000    # 20.0f

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v10, v7

    const/16 v7, 0x20

    shl-long/2addr v5, v7

    and-long/2addr v10, v8

    or-long/2addr v5, v10

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v10

    int-to-long v10, v10

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v12, v1

    shl-long/2addr v10, v7

    and-long v7, v12, v8

    or-long/2addr v7, v10

    const/4 v9, 0x0

    const/16 v10, 0xf0

    move-object v1, v2

    move-wide v14, v5

    move-wide v4, v3

    move-wide v2, v14

    move-wide v6, v7

    const/4 v8, 0x0

    invoke-static/range {v0 .. v10}, Lk2/e;->J0(Lk2/e;Li2/t;JJJFLk2/f;I)V

    return-void
.end method

.method public static final c(Lk2/e;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lau2/a;->b(Lk2/e;)V

    invoke-static {p0}, Lau2/a;->a(Lk2/e;)V

    return-void
.end method
