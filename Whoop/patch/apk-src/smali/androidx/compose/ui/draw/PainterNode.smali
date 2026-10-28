.class final Landroidx/compose/ui/draw/PainterNode;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/c0;
.implements La3/r;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroidx/compose/ui/draw/PainterNode;",
        "La3/c0;",
        "Lb2/v;",
        "La3/r;",
        "Ln2/a;",
        "painter",
        "Ln2/a;",
        "X0",
        "()Ln2/a;",
        "c1",
        "(Ln2/a;)V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public O:Lb2/h;

.field public P:Ly2/k;

.field public Q:F

.field public R:Li2/y;

.field private painter:Ln2/a;


# direct methods
.method public constructor <init>(Ln2/a;Lb2/h;Ly2/k;FLi2/y;)V
    .locals 0

    invoke-direct {p0}, Lb2/v;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/draw/PainterNode;->painter:Ln2/a;

    iput-object p2, p0, Landroidx/compose/ui/draw/PainterNode;->O:Lb2/h;

    iput-object p3, p0, Landroidx/compose/ui/draw/PainterNode;->P:Ly2/k;

    iput p4, p0, Landroidx/compose/ui/draw/PainterNode;->Q:F

    iput-object p5, p0, Landroidx/compose/ui/draw/PainterNode;->R:Li2/y;

    return-void
.end method

.method public static Z0(J)Z
    .locals 2

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-static {p0, p1, v0, v1}, Lh2/e;->b(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide v0, 0xffffffffL

    and-long/2addr p0, v0

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    const p1, 0x7fffffff

    and-int/2addr p0, p1

    const/high16 p1, 0x7f800000    # Float.POSITIVE_INFINITY

    if-ge p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static a1(J)Z
    .locals 2

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-static {p0, p1, v0, v1}, Lh2/e;->b(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x20

    shr-long/2addr p0, v0

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    const p1, 0x7fffffff

    and-int/2addr p0, p1

    const/high16 p1, 0x7f800000    # Float.POSITIVE_INFINITY

    if-ge p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final E(La3/w0;Ly2/q0;I)I
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/draw/PainterNode;->Y0()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    const/16 v0, 0xd

    invoke-static {p3, p1, v0}, Ly3/b;->b(III)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/draw/PainterNode;->b1(J)J

    move-result-wide v0

    invoke-interface {p2, p3}, Ly2/q0;->b(I)I

    move-result p1

    invoke-static {v0, v1}, Ly3/a;->j(J)I

    move-result p2

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p2, p3}, Ly2/q0;->b(I)I

    move-result p1

    return p1
.end method

.method public final M0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final O(La3/p0;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    iget-object v8, v3, La3/p0;->w:Lk2/b;

    iget-object v0, v1, Landroidx/compose/ui/draw/PainterNode;->painter:Ln2/a;

    invoke-virtual {v0}, Ln2/a;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/compose/ui/draw/PainterNode;->a1(J)Z

    move-result v0

    const/16 v2, 0x20

    if-eqz v0, :cond_0

    shr-long v6, v4, v2

    long-to-int v0, v6

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    goto :goto_0

    :cond_0
    invoke-interface {v8}, Lk2/e;->d()J

    move-result-wide v6

    shr-long/2addr v6, v2

    long-to-int v0, v6

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    :goto_0
    invoke-static {v4, v5}, Landroidx/compose/ui/draw/PainterNode;->Z0(J)Z

    move-result v6

    const-wide v9, 0xffffffffL

    if-eqz v6, :cond_1

    and-long/2addr v4, v9

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    goto :goto_1

    :cond_1
    invoke-interface {v8}, Lk2/e;->d()J

    move-result-wide v4

    and-long/2addr v4, v9

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    :goto_1
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v5, v0

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v11, v0

    shl-long v4, v5, v2

    and-long v6, v11, v9

    or-long/2addr v4, v6

    invoke-interface {v8}, Lk2/e;->d()J

    move-result-wide v6

    shr-long/2addr v6, v2

    long-to-int v0, v6

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const/4 v6, 0x0

    cmpg-float v0, v0, v6

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v8}, Lk2/e;->d()J

    move-result-wide v11

    and-long/2addr v11, v9

    long-to-int v0, v11

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    cmpg-float v0, v0, v6

    if-nez v0, :cond_3

    :goto_2
    const-wide/16 v4, 0x0

    goto :goto_3

    :cond_3
    iget-object v0, v1, Landroidx/compose/ui/draw/PainterNode;->P:Ly2/k;

    invoke-interface {v8}, Lk2/e;->d()J

    move-result-wide v6

    invoke-interface {v0, v4, v5, v6, v7}, Ly2/k;->a(JJ)J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Ly2/q1;->i(JJ)J

    move-result-wide v4

    :goto_3
    iget-object v11, v1, Landroidx/compose/ui/draw/PainterNode;->O:Lb2/h;

    shr-long v6, v4, v2

    long-to-int v0, v6

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    and-long v6, v4, v9

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    int-to-long v12, v0

    shl-long/2addr v12, v2

    int-to-long v6, v6

    and-long/2addr v6, v9

    or-long/2addr v12, v6

    invoke-interface {v8}, Lk2/e;->d()J

    move-result-wide v6

    shr-long/2addr v6, v2

    long-to-int v0, v6

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-interface {v8}, Lk2/e;->d()J

    move-result-wide v6

    and-long/2addr v6, v9

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    int-to-long v14, v0

    shl-long/2addr v14, v2

    int-to-long v6, v6

    and-long/2addr v6, v9

    or-long/2addr v14, v6

    invoke-virtual {v3}, La3/p0;->getLayoutDirection()Ly3/m;

    move-result-object v16

    invoke-interface/range {v11 .. v16}, Lb2/h;->a(JJLy3/m;)J

    move-result-wide v6

    shr-long v11, v6, v2

    long-to-int v0, v11

    int-to-float v11, v0

    and-long/2addr v6, v9

    long-to-int v0, v6

    int-to-float v9, v0

    iget-object v0, v8, Lk2/b;->x:La3/p;

    iget-object v0, v0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Laj/d;

    invoke-virtual {v0, v11, v9}, Laj/d;->B(FF)V

    :try_start_0
    iget-object v2, v1, Landroidx/compose/ui/draw/PainterNode;->painter:Ln2/a;

    iget v6, v1, Landroidx/compose/ui/draw/PainterNode;->Q:F

    iget-object v7, v1, Landroidx/compose/ui/draw/PainterNode;->R:Li2/y;

    invoke-virtual/range {v2 .. v7}, Ln2/a;->g(Lk2/e;JFLi2/y;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, v8, Lk2/b;->x:La3/p;

    iget-object v0, v0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Laj/d;

    neg-float v2, v11

    neg-float v3, v9

    invoke-virtual {v0, v2, v3}, Laj/d;->B(FF)V

    invoke-virtual/range {p1 .. p1}, La3/p0;->a()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v2, v8, Lk2/b;->x:La3/p;

    iget-object v2, v2, La3/p;->x:Ljava/lang/Object;

    check-cast v2, Laj/d;

    neg-float v3, v11

    neg-float v4, v9

    invoke-virtual {v2, v3, v4}, Laj/d;->B(FF)V

    throw v0
.end method

.method public final X0()Ln2/a;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/draw/PainterNode;->painter:Ln2/a;

    return-object v0
.end method

.method public final Y0()Z
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/draw/PainterNode;->painter:Ln2/a;

    invoke-virtual {v0}, Ln2/a;->h()J

    move-result-wide v0

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 2

    invoke-virtual {p0, p3, p4}, Landroidx/compose/ui/draw/PainterNode;->b1(J)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget p3, p2, Ly2/j1;->w:I

    iget p4, p2, Ly2/j1;->x:I

    new-instance v0, Lc0/g0;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1}, Lc0/g0;-><init>(Ly2/j1;I)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p3, p4, p2, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

.method public final b1(J)J
    .locals 11

    invoke-static {p1, p2}, Ly3/a;->e(J)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Ly3/a;->d(J)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {p1, p2}, Ly3/a;->g(J)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1, p2}, Ly3/a;->f(J)Z

    move-result v3

    if-eqz v3, :cond_1

    move v1, v2

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/draw/PainterNode;->Y0()Z

    move-result v2

    if-nez v2, :cond_2

    if-nez v0, :cond_3

    :cond_2
    if-eqz v1, :cond_4

    :cond_3
    invoke-static {p1, p2}, Ly3/a;->i(J)I

    move-result v5

    invoke-static {p1, p2}, Ly3/a;->h(J)I

    move-result v7

    const/4 v8, 0x0

    const/16 v9, 0xa

    const/4 v6, 0x0

    move-wide v3, p1

    invoke-static/range {v3 .. v9}, Ly3/a;->b(JIIIII)J

    move-result-wide p1

    return-wide p1

    :cond_4
    move-wide v0, p1

    iget-object p1, p0, Landroidx/compose/ui/draw/PainterNode;->painter:Ln2/a;

    invoke-virtual {p1}, Ln2/a;->h()J

    move-result-wide p1

    invoke-static {p1, p2}, Landroidx/compose/ui/draw/PainterNode;->a1(J)Z

    move-result v2

    const/16 v3, 0x20

    if-eqz v2, :cond_5

    shr-long v4, p1, v3

    long-to-int v2, v4

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    goto :goto_1

    :cond_5
    invoke-static {v0, v1}, Ly3/a;->k(J)I

    move-result v2

    :goto_1
    invoke-static {p1, p2}, Landroidx/compose/ui/draw/PainterNode;->Z0(J)Z

    move-result v4

    const-wide v5, 0xffffffffL

    if-eqz v4, :cond_6

    and-long/2addr p1, v5

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    goto :goto_2

    :cond_6
    invoke-static {v0, v1}, Ly3/a;->j(J)I

    move-result p1

    :goto_2
    invoke-static {v2, v0, v1}, Ly3/b;->g(IJ)I

    move-result p2

    invoke-static {p1, v0, v1}, Ly3/b;->f(IJ)I

    move-result p1

    int-to-float p2, p2

    int-to-float p1, p1

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long v7, p2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    shl-long/2addr v7, v3

    and-long/2addr p1, v5

    or-long/2addr p1, v7

    invoke-virtual {p0}, Landroidx/compose/ui/draw/PainterNode;->Y0()Z

    move-result v2

    if-nez v2, :cond_7

    goto/16 :goto_6

    :cond_7
    iget-object v2, p0, Landroidx/compose/ui/draw/PainterNode;->painter:Ln2/a;

    invoke-virtual {v2}, Ln2/a;->h()J

    move-result-wide v7

    invoke-static {v7, v8}, Landroidx/compose/ui/draw/PainterNode;->a1(J)Z

    move-result v2

    if-nez v2, :cond_8

    shr-long v7, p1, v3

    long-to-int v2, v7

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    goto :goto_3

    :cond_8
    iget-object v2, p0, Landroidx/compose/ui/draw/PainterNode;->painter:Ln2/a;

    invoke-virtual {v2}, Ln2/a;->h()J

    move-result-wide v7

    shr-long/2addr v7, v3

    long-to-int v2, v7

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    :goto_3
    iget-object v4, p0, Landroidx/compose/ui/draw/PainterNode;->painter:Ln2/a;

    invoke-virtual {v4}, Ln2/a;->h()J

    move-result-wide v7

    invoke-static {v7, v8}, Landroidx/compose/ui/draw/PainterNode;->Z0(J)Z

    move-result v4

    if-nez v4, :cond_9

    and-long v7, p1, v5

    long-to-int v4, v7

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    goto :goto_4

    :cond_9
    iget-object v4, p0, Landroidx/compose/ui/draw/PainterNode;->painter:Ln2/a;

    invoke-virtual {v4}, Ln2/a;->h()J

    move-result-wide v7

    and-long/2addr v7, v5

    long-to-int v4, v7

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    :goto_4
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v7, v2

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v9, v2

    shl-long/2addr v7, v3

    and-long/2addr v9, v5

    or-long/2addr v7, v9

    shr-long v9, p1, v3

    long-to-int v2, v9

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const/4 v4, 0x0

    cmpg-float v2, v2, v4

    if-nez v2, :cond_a

    goto :goto_5

    :cond_a
    and-long v9, p1, v5

    long-to-int v2, v9

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    cmpg-float v2, v2, v4

    if-nez v2, :cond_b

    :goto_5
    const-wide/16 p1, 0x0

    goto :goto_6

    :cond_b
    iget-object v2, p0, Landroidx/compose/ui/draw/PainterNode;->P:Ly2/k;

    invoke-interface {v2, v7, v8, p1, p2}, Ly2/k;->a(JJ)J

    move-result-wide p1

    invoke-static {v7, v8, p1, p2}, Ly2/q1;->i(JJ)J

    move-result-wide p1

    :goto_6
    shr-long v2, p1, v3

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-static {v2, v0, v1}, Ly3/b;->g(IJ)I

    move-result v2

    and-long/2addr p1, v5

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-static {p1, v0, v1}, Ly3/b;->f(IJ)I

    move-result v4

    const/4 v5, 0x0

    const/16 v6, 0xa

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Ly3/a;->b(JIIIII)J

    move-result-wide p1

    return-wide p1
.end method

.method public final c1(Ln2/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/draw/PainterNode;->painter:Ln2/a;

    return-void
.end method

.method public final g0(La3/w0;Ly2/q0;I)I
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/draw/PainterNode;->Y0()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    const/4 v0, 0x7

    invoke-static {p1, p3, v0}, Ly3/b;->b(III)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/draw/PainterNode;->b1(J)J

    move-result-wide v0

    invoke-interface {p2, p3}, Ly2/q0;->O(I)I

    move-result p1

    invoke-static {v0, v1}, Ly3/a;->k(J)I

    move-result p2

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p2, p3}, Ly2/q0;->O(I)I

    move-result p1

    return p1
.end method

.method public final o(La3/w0;Ly2/q0;I)I
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/draw/PainterNode;->Y0()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    const/4 v0, 0x7

    invoke-static {p1, p3, v0}, Ly3/b;->b(III)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/draw/PainterNode;->b1(J)J

    move-result-wide v0

    invoke-interface {p2, p3}, Ly2/q0;->Q(I)I

    move-result p1

    invoke-static {v0, v1}, Ly3/a;->k(J)I

    move-result p2

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p2, p3}, Ly2/q0;->Q(I)I

    move-result p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PainterModifier(painter="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterNode;->painter:Ln2/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sizeToIntrinsics=true, alignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterNode;->O:Lb2/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", alpha="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/draw/PainterNode;->Q:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", colorFilter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterNode;->R:Li2/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final y(La3/w0;Ly2/q0;I)I
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/draw/PainterNode;->Y0()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    const/16 v0, 0xd

    invoke-static {p3, p1, v0}, Ly3/b;->b(III)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/draw/PainterNode;->b1(J)J

    move-result-wide v0

    invoke-interface {p2, p3}, Ly2/q0;->C(I)I

    move-result p1

    invoke-static {v0, v1}, Ly3/a;->j(J)I

    move-result p2

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p2, p3}, Ly2/q0;->C(I)I

    move-result p1

    return p1
.end method
