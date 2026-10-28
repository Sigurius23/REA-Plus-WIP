.class public final Lf0/l0;
.super La3/o;
.source "SourceFile"

# interfaces
.implements La3/r;


# instance fields
.field public final Q:Lf0/k;

.field public final R:Lf0/g0;

.field public final S:Ll0/k1;


# direct methods
.method public constructor <init>(Lu2/h0;Lf0/k;Lf0/g0;Ll0/k1;)V
    .locals 0

    invoke-direct {p0}, La3/o;-><init>()V

    iput-object p2, p0, Lf0/l0;->Q:Lf0/k;

    iput-object p3, p0, Lf0/l0;->R:Lf0/g0;

    iput-object p4, p0, Lf0/l0;->S:Ll0/k1;

    invoke-virtual {p0, p1}, La3/o;->X0(La3/n;)La3/n;

    return-void
.end method

.method public static a1(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 3

    invoke-virtual {p4}, Landroid/graphics/Canvas;->save()I

    move-result v0

    invoke-virtual {p4, p0}, Landroid/graphics/Canvas;->rotate(F)V

    const/16 p0, 0x20

    shr-long v1, p1, p0

    long-to-int p0, v1

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    const-wide v1, 0xffffffffL

    and-long/2addr p1, v1

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-virtual {p4, p0, p1}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {p3, p4}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result p0

    invoke-virtual {p4, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return p0
.end method


# virtual methods
.method public final O(La3/p0;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v1, La3/p0;->w:Lk2/b;

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v3

    iget-object v5, v0, Lf0/l0;->Q:Lf0/k;

    invoke-virtual {v5, v3, v4}, Lf0/k;->i(J)V

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v3

    invoke-static {v3, v4}, Lh2/e;->f(J)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, La3/p0;->a()V

    return-void

    :cond_0
    invoke-virtual {v1}, La3/p0;->a()V

    iget-object v3, v5, Lf0/k;->d:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    iget-object v3, v2, Lk2/b;->x:La3/p;

    invoke-virtual {v3}, La3/p;->w()Li2/v;

    move-result-object v3

    invoke-static {v3}, Li2/d;->a(Li2/v;)Landroid/graphics/Canvas;

    move-result-object v3

    iget-object v4, v0, Lf0/l0;->R:Lf0/g0;

    iget-object v6, v4, Lf0/g0;->f:Landroid/widget/EdgeEffect;

    invoke-static {v6}, Lf0/g0;->f(Landroid/widget/EdgeEffect;)Z

    move-result v6

    const/16 v7, 0x20

    iget-object v8, v0, Lf0/l0;->S:Ll0/k1;

    const-wide v9, 0xffffffffL

    const/4 v11, 0x0

    if-eqz v6, :cond_1

    invoke-virtual {v4}, Lf0/g0;->c()Landroid/widget/EdgeEffect;

    move-result-object v6

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v12

    and-long/2addr v12, v9

    long-to-int v12, v12

    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    neg-float v12, v12

    invoke-virtual {v1}, La3/p0;->getLayoutDirection()Ly3/m;

    move-result-object v13

    invoke-interface {v8, v13}, Ll0/k1;->b(Ly3/m;)F

    move-result v13

    invoke-virtual {v1, v13}, La3/p0;->q0(F)F

    move-result v13

    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v12

    int-to-long v14, v12

    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v12

    int-to-long v12, v12

    shl-long/2addr v14, v7

    and-long/2addr v12, v9

    or-long/2addr v12, v14

    const/high16 v14, 0x43870000    # 270.0f

    invoke-static {v14, v12, v13, v6, v3}, Lf0/l0;->a1(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v6

    goto :goto_0

    :cond_1
    move v6, v11

    :goto_0
    iget-object v12, v4, Lf0/g0;->d:Landroid/widget/EdgeEffect;

    invoke-static {v12}, Lf0/g0;->f(Landroid/widget/EdgeEffect;)Z

    move-result v12

    const/4 v13, 0x0

    if-eqz v12, :cond_4

    invoke-virtual {v4}, Lf0/g0;->e()Landroid/widget/EdgeEffect;

    move-result-object v12

    invoke-interface {v8}, Ll0/k1;->d()F

    move-result v15

    invoke-virtual {v1, v15}, La3/p0;->q0(F)F

    move-result v15

    move/from16 v16, v7

    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    move-wide/from16 v17, v9

    int-to-long v9, v7

    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v14, v7

    shl-long v9, v9, v16

    and-long v14, v14, v17

    or-long/2addr v9, v14

    invoke-static {v13, v9, v10, v12, v3}, Lf0/l0;->a1(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v7

    if-nez v7, :cond_3

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    move v6, v11

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v6, 0x1

    goto :goto_2

    :cond_4
    move/from16 v16, v7

    move-wide/from16 v17, v9

    :goto_2
    iget-object v7, v4, Lf0/g0;->g:Landroid/widget/EdgeEffect;

    invoke-static {v7}, Lf0/g0;->f(Landroid/widget/EdgeEffect;)Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-virtual {v4}, Lf0/g0;->d()Landroid/widget/EdgeEffect;

    move-result-object v7

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v9

    shr-long v9, v9, v16

    long-to-int v9, v9

    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    invoke-static {v9}, Le93/b;->X(F)I

    move-result v9

    invoke-virtual {v1}, La3/p0;->getLayoutDirection()Ly3/m;

    move-result-object v10

    invoke-interface {v8, v10}, Ll0/k1;->c(Ly3/m;)F

    move-result v10

    int-to-float v9, v9

    neg-float v9, v9

    invoke-virtual {v1, v10}, La3/p0;->q0(F)F

    move-result v10

    add-float/2addr v10, v9

    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    int-to-long v12, v9

    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    int-to-long v9, v9

    shl-long v12, v12, v16

    and-long v9, v9, v17

    or-long/2addr v9, v12

    const/high16 v12, 0x42b40000    # 90.0f

    invoke-static {v12, v9, v10, v7, v3}, Lf0/l0;->a1(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v7

    if-nez v7, :cond_6

    if-eqz v6, :cond_5

    goto :goto_3

    :cond_5
    move v6, v11

    goto :goto_4

    :cond_6
    :goto_3
    const/4 v6, 0x1

    :cond_7
    :goto_4
    iget-object v7, v4, Lf0/g0;->e:Landroid/widget/EdgeEffect;

    invoke-static {v7}, Lf0/g0;->f(Landroid/widget/EdgeEffect;)Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-virtual {v4}, Lf0/g0;->b()Landroid/widget/EdgeEffect;

    move-result-object v4

    invoke-interface {v8}, Ll0/k1;->a()F

    move-result v7

    invoke-virtual {v1, v7}, La3/p0;->q0(F)F

    move-result v1

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v7

    shr-long v7, v7, v16

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    neg-float v7, v7

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v8

    and-long v8, v8, v17

    long-to-int v2, v8

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    neg-float v2, v2

    add-float/2addr v2, v1

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v7, v1

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    shl-long v7, v7, v16

    and-long v1, v1, v17

    or-long/2addr v1, v7

    const/high16 v7, 0x43340000    # 180.0f

    invoke-static {v7, v1, v2, v4, v3}, Lf0/l0;->a1(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v1

    if-nez v1, :cond_8

    if-eqz v6, :cond_9

    :cond_8
    const/4 v11, 0x1

    :cond_9
    move v6, v11

    :cond_a
    if-eqz v6, :cond_b

    invoke-virtual {v5}, Lf0/k;->d()V

    :cond_b
    return-void
.end method
