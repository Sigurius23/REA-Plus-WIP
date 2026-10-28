.class public final Lk2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/e;


# instance fields
.field public final w:Lk2/a;

.field public final x:La3/p;

.field public y:Li2/h;

.field public z:Li2/h;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lk2/a;

    sget-object v1, Ly3/m;->w:Ly3/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v2, Lk2/d;->a:Ly3/d;

    iput-object v2, v0, Lk2/a;->a:Ly3/c;

    iput-object v1, v0, Lk2/a;->b:Ly3/m;

    sget-object v1, Lk2/g;->a:Lk2/g;

    iput-object v1, v0, Lk2/a;->c:Li2/v;

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lk2/a;->d:J

    iput-object v0, p0, Lk2/b;->w:Lk2/a;

    new-instance v0, La3/p;

    invoke-direct {v0, p0}, La3/p;-><init>(Lk2/b;)V

    iput-object v0, p0, Lk2/b;->x:La3/p;

    return-void
.end method

.method public static a(Lk2/b;JLk2/f;FLi2/y;I)Li2/q0;
    .locals 2

    invoke-virtual {p0, p3}, Lk2/b;->f(Lk2/f;)Li2/q0;

    move-result-object p0

    const/high16 p3, 0x3f800000    # 1.0f

    cmpg-float p3, p4, p3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Li2/x;->e(J)F

    move-result p3

    mul-float/2addr p3, p4

    invoke-static {p3, p1, p2}, Li2/x;->c(FJ)J

    move-result-wide p1

    :goto_0
    move-object p3, p0

    check-cast p3, Li2/h;

    iget-object p4, p3, Li2/h;->a:Landroid/graphics/Paint;

    invoke-virtual {p4}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    invoke-static {v0}, Li2/w0;->c(I)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Li2/x;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p3, p1, p2}, Li2/h;->e(J)V

    :cond_1
    iget-object p1, p3, Li2/h;->c:Landroid/graphics/Shader;

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    invoke-virtual {p3, p1}, Li2/h;->i(Landroid/graphics/Shader;)V

    :cond_2
    iget-object p1, p3, Li2/h;->d:Li2/y;

    invoke-static {p1, p5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p3, p5}, Li2/h;->f(Li2/y;)V

    :cond_3
    iget p1, p3, Li2/h;->b:I

    if-ne p1, p6, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p3, p6}, Li2/h;->d(I)V

    :goto_1
    invoke-virtual {p4}, Landroid/graphics/Paint;->isFilterBitmap()Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_5

    return-object p0

    :cond_5
    invoke-virtual {p3, p2}, Li2/h;->g(I)V

    return-object p0
.end method

.method public static c(Lk2/b;JFILi2/t0;)Li2/q0;
    .locals 4

    iget-object v0, p0, Lk2/b;->z:Li2/h;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-static {}, Li2/w0;->j()Li2/h;

    move-result-object v0

    invoke-virtual {v0, v1}, Li2/h;->m(I)V

    iput-object v0, p0, Lk2/b;->z:Li2/h;

    :cond_0
    iget-object p0, v0, Li2/h;->a:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/graphics/Paint;->getColor()I

    move-result v2

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v2

    invoke-static {v2, v3, p1, p2}, Li2/x;->d(JJ)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0, p1, p2}, Li2/h;->e(J)V

    :cond_1
    iget-object p1, v0, Li2/h;->c:Landroid/graphics/Shader;

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {v0, p2}, Li2/h;->i(Landroid/graphics/Shader;)V

    :cond_2
    iget-object p1, v0, Li2/h;->d:Li2/y;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {v0, p2}, Li2/h;->f(Li2/y;)V

    :cond_3
    iget p1, v0, Li2/h;->b:I

    const/4 p2, 0x3

    if-ne p1, p2, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {v0, p2}, Li2/h;->d(I)V

    :goto_0
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result p1

    cmpg-float p1, p1, p3

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {v0, p3}, Li2/h;->l(F)V

    :goto_1
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeMiter()F

    move-result p1

    const/high16 p2, 0x40800000    # 4.0f

    cmpg-float p1, p1, p2

    if-nez p1, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    :goto_2
    invoke-virtual {v0}, Li2/h;->a()I

    move-result p1

    if-ne p1, p4, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v0, p4}, Li2/h;->j(I)V

    :goto_3
    invoke-virtual {v0}, Li2/h;->b()I

    move-result p1

    if-nez p1, :cond_8

    goto :goto_4

    :cond_8
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Li2/h;->k(I)V

    :goto_4
    iget-object p1, v0, Li2/h;->e:Li2/t0;

    invoke-static {p1, p5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    invoke-virtual {v0, p5}, Li2/h;->h(Li2/t0;)V

    :cond_9
    invoke-virtual {p0}, Landroid/graphics/Paint;->isFilterBitmap()Z

    move-result p0

    if-ne p0, v1, :cond_a

    return-object v0

    :cond_a
    invoke-virtual {v0, v1}, Li2/h;->g(I)V

    return-object v0
.end method


# virtual methods
.method public final B(Li2/s0;Li2/t;FLk2/f;I)V
    .locals 8

    iget-object v0, p0, Lk2/b;->w:Lk2/a;

    iget-object v0, v0, Lk2/a;->c:Li2/v;

    const/4 v7, 0x1

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p2

    move v4, p3

    move-object v3, p4

    move v6, p5

    invoke-virtual/range {v1 .. v7}, Lk2/b;->b(Li2/t;Lk2/f;FLi2/y;II)Li2/q0;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Li2/v;->t(Li2/s0;Li2/q0;)V

    return-void
.end method

.method public final E0(Li2/s0;JFLk2/f;)V
    .locals 8

    iget-object v0, p0, Lk2/b;->w:Lk2/a;

    iget-object v0, v0, Lk2/a;->c:Li2/v;

    const/4 v6, 0x0

    const/4 v7, 0x3

    move-object v1, p0

    move-wide v2, p2

    move v5, p4

    move-object v4, p5

    invoke-static/range {v1 .. v7}, Lk2/b;->a(Lk2/b;JLk2/f;FLi2/y;I)Li2/q0;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Li2/v;->t(Li2/s0;Li2/q0;)V

    return-void
.end method

.method public final I(Li2/g;JJJFLi2/y;I)V
    .locals 10

    iget-object v0, p0, Lk2/b;->w:Lk2/a;

    iget-object v1, v0, Lk2/a;->c:Li2/v;

    const/4 v3, 0x0

    sget-object v4, Lk2/h;->a:Lk2/h;

    const/4 v7, 0x3

    move-object v2, p0

    move/from16 v5, p8

    move-object/from16 v6, p9

    move/from16 v8, p10

    invoke-virtual/range {v2 .. v8}, Lk2/b;->b(Li2/t;Lk2/f;FLi2/y;II)Li2/q0;

    move-result-object v9

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    move-wide/from16 v7, p6

    invoke-interface/range {v1 .. v9}, Li2/v;->c(Li2/g;JJJLi2/q0;)V

    return-void
.end method

.method public final R(Li2/t;JJFLi2/t0;F)V
    .locals 6

    iget-object v0, p0, Lk2/b;->w:Lk2/a;

    iget-object v0, v0, Lk2/a;->c:Li2/v;

    iget-object v1, p0, Lk2/b;->z:Li2/h;

    const/4 v2, 0x1

    if-nez v1, :cond_0

    invoke-static {}, Li2/w0;->j()Li2/h;

    move-result-object v1

    invoke-virtual {v1, v2}, Li2/h;->m(I)V

    iput-object v1, p0, Lk2/b;->z:Li2/h;

    :cond_0
    iget-object v3, v1, Li2/h;->a:Landroid/graphics/Paint;

    if-eqz p1, :cond_1

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide v4

    invoke-virtual {p1, v4, v5, v1, p8}, Li2/t;->a(JLi2/q0;F)V

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Landroid/graphics/Paint;->getAlpha()I

    move-result p1

    int-to-float p1, p1

    const/high16 v4, 0x437f0000    # 255.0f

    div-float/2addr p1, v4

    cmpg-float p1, p1, p8

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v1, p8}, Li2/h;->c(F)V

    :goto_0
    iget-object p1, v1, Li2/h;->d:Li2/y;

    const/4 p8, 0x0

    invoke-static {p1, p8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {v1, p8}, Li2/h;->f(Li2/y;)V

    :cond_3
    iget p1, v1, Li2/h;->b:I

    const/4 p8, 0x3

    if-ne p1, p8, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v1, p8}, Li2/h;->d(I)V

    :goto_1
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result p1

    cmpg-float p1, p1, p6

    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v1, p6}, Li2/h;->l(F)V

    :goto_2
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeMiter()F

    move-result p1

    const/high16 p6, 0x40800000    # 4.0f

    cmpg-float p1, p1, p6

    if-nez p1, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v3, p6}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    :goto_3
    invoke-virtual {v1}, Li2/h;->a()I

    move-result p1

    const/4 p6, 0x0

    if-nez p1, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {v1, p6}, Li2/h;->j(I)V

    :goto_4
    invoke-virtual {v1}, Li2/h;->b()I

    move-result p1

    if-nez p1, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {v1, p6}, Li2/h;->k(I)V

    :goto_5
    iget-object p1, v1, Li2/h;->e:Li2/t0;

    invoke-static {p1, p7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    invoke-virtual {v1, p7}, Li2/h;->h(Li2/t0;)V

    :cond_9
    invoke-virtual {v3}, Landroid/graphics/Paint;->isFilterBitmap()Z

    move-result p1

    if-ne p1, v2, :cond_a

    :goto_6
    move-object p1, v0

    move-object p6, v1

    goto :goto_7

    :cond_a
    invoke-virtual {v1, v2}, Li2/h;->g(I)V

    goto :goto_6

    :goto_7
    invoke-interface/range {p1 .. p6}, Li2/v;->k(JJLi2/q0;)V

    return-void
.end method

.method public final a0(Li2/t;JJFLk2/f;I)V
    .locals 11

    iget-object v0, p0, Lk2/b;->w:Lk2/a;

    iget-object v0, v0, Lk2/a;->c:Li2/v;

    const/16 v1, 0x20

    shr-long v2, p2, v1

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    const-wide v4, 0xffffffffL

    and-long/2addr p2, v4

    long-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    shr-long v6, p4, v1

    long-to-int v1, v6

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    add-float/2addr v1, v2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    and-long/2addr v4, p4

    long-to-int v2, v4

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    add-float/2addr v2, p2

    const/4 v10, 0x1

    const/4 v8, 0x0

    move-object v4, p0

    move-object v5, p1

    move/from16 v7, p6

    move-object/from16 v6, p7

    move/from16 v9, p8

    invoke-virtual/range {v4 .. v10}, Lk2/b;->b(Li2/t;Lk2/f;FLi2/y;II)Li2/q0;

    move-result-object p1

    move-object/from16 p6, p1

    move-object p1, v0

    move p4, v1

    move/from16 p5, v2

    move p2, v3

    invoke-interface/range {p1 .. p6}, Li2/v;->b(FFFFLi2/q0;)V

    return-void
.end method

.method public final b(Li2/t;Lk2/f;FLi2/y;II)Li2/q0;
    .locals 5

    invoke-virtual {p0, p2}, Lk2/b;->f(Lk2/f;)Li2/q0;

    move-result-object p2

    if-eqz p1, :cond_0

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1, p2, p3}, Li2/t;->a(JLi2/q0;F)V

    goto :goto_0

    :cond_0
    move-object p1, p2

    check-cast p1, Li2/h;

    iget-object v0, p1, Li2/h;->a:Landroid/graphics/Paint;

    iget-object v1, p1, Li2/h;->c:Landroid/graphics/Shader;

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Li2/h;->i(Landroid/graphics/Shader;)V

    :cond_1
    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v1

    invoke-static {v1}, Li2/w0;->c(I)J

    move-result-wide v1

    sget-wide v3, Li2/x;->b:J

    invoke-static {v1, v2, v3, v4}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p1, v3, v4}, Li2/h;->e(J)V

    :cond_2
    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x437f0000    # 255.0f

    div-float/2addr v0, v1

    cmpg-float v0, v0, p3

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p1, p3}, Li2/h;->c(F)V

    :goto_0
    move-object p1, p2

    check-cast p1, Li2/h;

    iget-object p3, p1, Li2/h;->d:Li2/y;

    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_4

    invoke-virtual {p1, p4}, Li2/h;->f(Li2/y;)V

    :cond_4
    iget p3, p1, Li2/h;->b:I

    if-ne p3, p5, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {p1, p5}, Li2/h;->d(I)V

    :goto_1
    iget-object p3, p1, Li2/h;->a:Landroid/graphics/Paint;

    invoke-virtual {p3}, Landroid/graphics/Paint;->isFilterBitmap()Z

    move-result p3

    if-ne p3, p6, :cond_6

    return-object p2

    :cond_6
    invoke-virtual {p1, p6}, Li2/h;->g(I)V

    return-object p2
.end method

.method public final d0(JJJFILi2/t0;)V
    .locals 8

    iget-object v0, p0, Lk2/b;->w:Lk2/a;

    iget-object v1, v0, Lk2/a;->c:Li2/v;

    move-object v2, p0

    move-wide v3, p1

    move v5, p7

    move/from16 v6, p8

    move-object/from16 v7, p9

    invoke-static/range {v2 .. v7}, Lk2/b;->c(Lk2/b;JFILi2/t0;)Li2/q0;

    move-result-object v6

    move-wide v2, p3

    move-wide v4, p5

    invoke-interface/range {v1 .. v6}, Li2/v;->k(JJLi2/q0;)V

    return-void
.end method

.method public final e(Li2/g;Li2/p;)V
    .locals 8

    iget-object v0, p0, Lk2/b;->w:Lk2/a;

    iget-object v0, v0, Lk2/a;->c:Li2/v;

    const/4 v2, 0x0

    const/4 v7, 0x1

    sget-object v3, Lk2/h;->a:Lk2/h;

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v6, 0x3

    move-object v1, p0

    move-object v5, p2

    invoke-virtual/range {v1 .. v7}, Lk2/b;->b(Li2/t;Lk2/f;FLi2/y;II)Li2/q0;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Li2/v;->d(Li2/g;Li2/q0;)V

    return-void
.end method

.method public final f(Lk2/f;)Li2/q0;
    .locals 5

    sget-object v0, Lk2/h;->a:Lk2/h;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lk2/b;->y:Li2/h;

    if-nez p1, :cond_0

    invoke-static {}, Li2/w0;->j()Li2/h;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Li2/h;->m(I)V

    iput-object p1, p0, Lk2/b;->y:Li2/h;

    :cond_0
    return-object p1

    :cond_1
    instance-of v0, p1, Lk2/i;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lk2/b;->z:Li2/h;

    if-nez v0, :cond_2

    invoke-static {}, Li2/w0;->j()Li2/h;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Li2/h;->m(I)V

    iput-object v0, p0, Lk2/b;->z:Li2/h;

    :cond_2
    iget-object v1, v0, Li2/h;->a:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v2

    check-cast p1, Lk2/i;

    iget-object v3, p1, Lk2/i;->e:Li2/t0;

    iget v4, p1, Lk2/i;->a:F

    cmpg-float v2, v2, v4

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v0, v4}, Li2/h;->l(F)V

    :goto_0
    invoke-virtual {v0}, Li2/h;->a()I

    move-result v2

    iget v4, p1, Lk2/i;->c:I

    if-ne v2, v4, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v0, v4}, Li2/h;->j(I)V

    :goto_1
    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeMiter()F

    move-result v2

    iget v4, p1, Lk2/i;->b:F

    cmpg-float v2, v2, v4

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    :goto_2
    invoke-virtual {v0}, Li2/h;->b()I

    move-result v1

    iget p1, p1, Lk2/i;->d:I

    if-ne v1, p1, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v0, p1}, Li2/h;->k(I)V

    :goto_3
    iget-object p1, v0, Li2/h;->e:Li2/t0;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {v0, v3}, Li2/h;->h(Li2/t0;)V

    :cond_7
    return-object v0

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final getDensity()F
    .locals 1

    iget-object v0, p0, Lk2/b;->w:Lk2/a;

    iget-object v0, v0, Lk2/a;->a:Ly3/c;

    invoke-interface {v0}, Ly3/c;->getDensity()F

    move-result v0

    return v0
.end method

.method public final getLayoutDirection()Ly3/m;
    .locals 1

    iget-object v0, p0, Lk2/b;->w:Lk2/a;

    iget-object v0, v0, Lk2/a;->b:Ly3/m;

    return-object v0
.end method

.method public final k0(JFFJJFLk2/f;)V
    .locals 12

    iget-object v1, p0, Lk2/b;->w:Lk2/a;

    iget-object v7, v1, Lk2/a;->c:Li2/v;

    const/16 v1, 0x20

    shr-long v2, p5, v1

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    const-wide v3, 0xffffffffL

    and-long v5, p5, v3

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    shr-long v10, p7, v1

    long-to-int v1, v10

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    add-float v10, v1, v2

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    and-long v2, p7, v3

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    add-float v11, v2, v1

    const/4 v5, 0x0

    const/4 v6, 0x3

    move-object v0, p0

    move-wide v1, p1

    move/from16 v4, p9

    move-object/from16 v3, p10

    invoke-static/range {v0 .. v6}, Lk2/b;->a(Lk2/b;JLk2/f;FLi2/y;I)Li2/q0;

    move-result-object v1

    move v4, v9

    const/4 v9, 0x0

    move-object v2, v7

    move v3, v8

    move v5, v10

    move v6, v11

    move v7, p3

    move/from16 v8, p4

    move-object v10, v1

    invoke-interface/range {v2 .. v10}, Li2/v;->u(FFFFFFZLi2/q0;)V

    return-void
.end method

.method public final m(Li2/t;JJJFLk2/f;)V
    .locals 14

    iget-object v1, p0, Lk2/b;->w:Lk2/a;

    iget-object v7, v1, Lk2/a;->c:Li2/v;

    const/16 v1, 0x20

    shr-long v2, p2, v1

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    const-wide v3, 0xffffffffL

    and-long v5, p2, v3

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    shr-long v10, p4, v1

    long-to-int v6, v10

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    add-float v10, v6, v2

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    and-long v5, p4, v3

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    add-float v11, v5, v2

    shr-long v1, p6, v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    and-long v1, p6, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    const/4 v6, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x3

    move-object v0, p0

    move-object v1, p1

    move/from16 v3, p8

    move-object/from16 v2, p9

    invoke-virtual/range {v0 .. v6}, Lk2/b;->b(Li2/t;Lk2/f;FLi2/y;II)Li2/q0;

    move-result-object v1

    move-object/from16 p8, v1

    move-object p1, v7

    move/from16 p2, v8

    move/from16 p3, v9

    move/from16 p4, v10

    move/from16 p5, v11

    move/from16 p6, v12

    move/from16 p7, v13

    invoke-interface/range {p1 .. p8}, Li2/v;->o(FFFFFFLi2/q0;)V

    return-void
.end method

.method public final m0()F
    .locals 1

    iget-object v0, p0, Lk2/b;->w:Lk2/a;

    iget-object v0, v0, Lk2/a;->a:Ly3/c;

    invoke-interface {v0}, Ly3/c;->m0()F

    move-result v0

    return v0
.end method

.method public final n0(JJJFLi2/y;I)V
    .locals 12

    iget-object v1, p0, Lk2/b;->w:Lk2/a;

    iget-object v7, v1, Lk2/a;->c:Li2/v;

    const/16 v1, 0x20

    shr-long v2, p3, v1

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    const-wide v3, 0xffffffffL

    and-long v5, p3, v3

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    shr-long v10, p5, v1

    long-to-int v1, v10

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    add-float v10, v1, v2

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    and-long v2, p5, v3

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    add-float v11, v2, v1

    sget-object v3, Lk2/h;->a:Lk2/h;

    move-object v0, p0

    move-wide v1, p1

    move/from16 v4, p7

    move-object/from16 v5, p8

    move/from16 v6, p9

    invoke-static/range {v0 .. v6}, Lk2/b;->a(Lk2/b;JLk2/f;FLi2/y;I)Li2/q0;

    move-result-object v1

    move-object/from16 p6, v1

    move-object p1, v7

    move p2, v8

    move p3, v9

    move/from16 p4, v10

    move/from16 p5, v11

    invoke-interface/range {p1 .. p6}, Li2/v;->b(FFFFLi2/q0;)V

    return-void
.end method

.method public final t0()La3/p;
    .locals 1

    iget-object v0, p0, Lk2/b;->x:La3/p;

    return-object v0
.end method

.method public final u0(JFJFLk2/f;)V
    .locals 8

    iget-object v0, p0, Lk2/b;->w:Lk2/a;

    iget-object v0, v0, Lk2/a;->c:Li2/v;

    const/4 v6, 0x0

    const/4 v7, 0x3

    move-object v1, p0

    move-wide v2, p1

    move v5, p6

    move-object v4, p7

    invoke-static/range {v1 .. v7}, Lk2/b;->a(Lk2/b;JLk2/f;FLi2/y;I)Li2/q0;

    move-result-object p1

    invoke-interface {v0, p4, p5, p1, p3}, Li2/v;->l(JLi2/q0;F)V

    return-void
.end method

.method public final w(Li2/t;FFZJJLk2/f;I)V
    .locals 12

    iget-object v1, p0, Lk2/b;->w:Lk2/a;

    iget-object v7, v1, Lk2/a;->c:Li2/v;

    const/16 v1, 0x20

    shr-long v2, p5, v1

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    const-wide v3, 0xffffffffL

    and-long v5, p5, v3

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    shr-long v10, p7, v1

    long-to-int v1, v10

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    add-float v10, v1, v2

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    and-long v2, p7, v3

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    add-float v11, v2, v1

    const/4 v6, 0x1

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p9

    move/from16 v5, p10

    invoke-virtual/range {v0 .. v6}, Lk2/b;->b(Li2/t;Lk2/f;FLi2/y;II)Li2/q0;

    move-result-object v1

    move-object v2, v7

    move v3, v8

    move v4, v9

    move v5, v10

    move v6, v11

    move v7, p2

    move v8, p3

    move/from16 v9, p4

    move-object v10, v1

    invoke-interface/range {v2 .. v10}, Li2/v;->u(FFFFFFZLi2/q0;)V

    return-void
.end method

.method public final x(Li2/t;FJFLk2/f;)V
    .locals 8

    iget-object v0, p0, Lk2/b;->w:Lk2/a;

    iget-object v0, v0, Lk2/a;->c:Li2/v;

    const/4 v7, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x3

    move-object v1, p0

    move-object v2, p1

    move v4, p5

    move-object v3, p6

    invoke-virtual/range {v1 .. v7}, Lk2/b;->b(Li2/t;Lk2/f;FLi2/y;II)Li2/q0;

    move-result-object p1

    invoke-interface {v0, p3, p4, p1, p2}, Li2/v;->l(JLi2/q0;F)V

    return-void
.end method

.method public final y0(Ljava/util/ArrayList;JF)V
    .locals 7

    iget-object v0, p0, Lk2/b;->w:Lk2/a;

    iget-object v0, v0, Lk2/a;->c:Li2/v;

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, p0

    move-wide v2, p2

    move v4, p4

    invoke-static/range {v1 .. v6}, Lk2/b;->c(Lk2/b;JFILi2/t0;)Li2/q0;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Li2/v;->m(Ljava/util/ArrayList;Li2/q0;)V

    return-void
.end method

.method public final z0(JJJJLk2/f;FI)V
    .locals 14

    iget-object v1, p0, Lk2/b;->w:Lk2/a;

    iget-object v7, v1, Lk2/a;->c:Li2/v;

    const/16 v1, 0x20

    shr-long v2, p3, v1

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    const-wide v3, 0xffffffffL

    and-long v5, p3, v3

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    shr-long v10, p5, v1

    long-to-int v6, v10

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    add-float v10, v6, v2

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    and-long v5, p5, v3

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    add-float v11, v5, v2

    shr-long v1, p7, v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    and-long v1, p7, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object/from16 v3, p9

    move/from16 v4, p10

    move/from16 v6, p11

    invoke-static/range {v0 .. v6}, Lk2/b;->a(Lk2/b;JLk2/f;FLi2/y;I)Li2/q0;

    move-result-object v1

    move-object/from16 p8, v1

    move-object p1, v7

    move/from16 p2, v8

    move/from16 p3, v9

    move/from16 p4, v10

    move/from16 p5, v11

    move/from16 p6, v12

    move/from16 p7, v13

    invoke-interface/range {p1 .. p8}, Li2/v;->o(FFFFFFLi2/q0;)V

    return-void
.end method
