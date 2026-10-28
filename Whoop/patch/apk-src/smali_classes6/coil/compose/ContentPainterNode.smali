.class public final Lcoil/compose/ContentPainterNode;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/r;
.implements La3/c0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcoil/compose/ContentPainterNode;",
        "Lb2/v;",
        "La3/r;",
        "La3/c0;",
        "Ln2/a;",
        "painter",
        "Ln2/a;",
        "Y0",
        "()Ln2/a;",
        "a1",
        "(Ln2/a;)V",
        "coil-compose-base_release"
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

.field private painter:Ln2/a;


# direct methods
.method public constructor <init>(Ln2/a;Lb2/h;Ly2/k;F)V
    .locals 0

    invoke-direct {p0}, Lb2/v;-><init>()V

    iput-object p1, p0, Lcoil/compose/ContentPainterNode;->painter:Ln2/a;

    iput-object p2, p0, Lcoil/compose/ContentPainterNode;->O:Lb2/h;

    iput-object p3, p0, Lcoil/compose/ContentPainterNode;->P:Ly2/k;

    iput p4, p0, Lcoil/compose/ContentPainterNode;->Q:F

    return-void
.end method


# virtual methods
.method public final E(La3/w0;Ly2/q0;I)I
    .locals 4

    iget-object p1, p0, Lcoil/compose/ContentPainterNode;->painter:Ln2/a;

    invoke-virtual {p1}, Ln2/a;->h()J

    move-result-wide v0

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    const/16 v0, 0xd

    invoke-static {p3, p1, v0}, Ly3/b;->b(III)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcoil/compose/ContentPainterNode;->Z0(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ly3/a;->i(J)I

    move-result p1

    invoke-interface {p2, p1}, Ly2/q0;->b(I)I

    move-result p1

    int-to-float p2, p3

    int-to-float p3, p1

    invoke-static {p2, p3}, Ljc/x;->b(FF)J

    move-result-wide p2

    invoke-virtual {p0, p2, p3}, Lcoil/compose/ContentPainterNode;->X0(J)J

    move-result-wide p2

    invoke-static {p2, p3}, Lh2/e;->c(J)F

    move-result p2

    invoke-static {p2}, Le93/b;->X(F)I

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
    .locals 13

    iget-object v0, p1, La3/p0;->w:Lk2/b;

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v1

    invoke-virtual {p0, v1, v2}, Lcoil/compose/ContentPainterNode;->X0(J)J

    move-result-wide v5

    iget-object v7, p0, Lcoil/compose/ContentPainterNode;->O:Lb2/h;

    sget-object v1, Lch/v;->b:Lnh/e;

    invoke-static {v5, v6}, Lh2/e;->e(J)F

    move-result v1

    invoke-static {v1}, Le93/b;->X(F)I

    move-result v1

    invoke-static {v5, v6}, Lh2/e;->c(J)F

    move-result v2

    invoke-static {v2}, Le93/b;->X(F)I

    move-result v2

    invoke-static {v1, v2}, Lv63/b;->a(II)J

    move-result-wide v8

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Lh2/e;->e(J)F

    move-result v3

    invoke-static {v3}, Le93/b;->X(F)I

    move-result v3

    invoke-static {v1, v2}, Lh2/e;->c(J)F

    move-result v1

    invoke-static {v1}, Le93/b;->X(F)I

    move-result v1

    invoke-static {v3, v1}, Lv63/b;->a(II)J

    move-result-wide v10

    invoke-virtual {p1}, La3/p0;->getLayoutDirection()Ly3/m;

    move-result-object v12

    invoke-interface/range {v7 .. v12}, Lb2/h;->a(JJLy3/m;)J

    move-result-wide v1

    const/16 v3, 0x20

    shr-long v3, v1, v3

    long-to-int v3, v3

    const-wide v7, 0xffffffffL

    and-long/2addr v1, v7

    long-to-int v1, v1

    int-to-float v2, v3

    int-to-float v1, v1

    iget-object v3, v0, Lk2/b;->x:La3/p;

    iget-object v3, v3, La3/p;->x:Ljava/lang/Object;

    check-cast v3, Laj/d;

    invoke-virtual {v3, v2, v1}, Laj/d;->B(FF)V

    iget-object v3, p0, Lcoil/compose/ContentPainterNode;->painter:Ln2/a;

    iget v7, p0, Lcoil/compose/ContentPainterNode;->Q:F

    const/4 v8, 0x0

    move-object v4, p1

    invoke-virtual/range {v3 .. v8}, Ln2/a;->g(Lk2/e;JFLi2/y;)V

    iget-object p1, v0, Lk2/b;->x:La3/p;

    iget-object p1, p1, La3/p;->x:Ljava/lang/Object;

    check-cast p1, Laj/d;

    neg-float v0, v2

    neg-float v1, v1

    invoke-virtual {p1, v0, v1}, Laj/d;->B(FF)V

    invoke-virtual {v4}, La3/p0;->a()V

    return-void
.end method

.method public final X0(J)J
    .locals 6

    invoke-static {p1, p2}, Lh2/e;->f(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 p1, 0x0

    return-wide p1

    :cond_0
    iget-object v0, p0, Lcoil/compose/ContentPainterNode;->painter:Ln2/a;

    invoke-virtual {v0}, Ln2/a;->h()J

    move-result-wide v0

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v2, v0, v2

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {v0, v1}, Lh2/e;->e(J)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {p1, p2}, Lh2/e;->e(J)F

    move-result v2

    :goto_0
    invoke-static {v0, v1}, Lh2/e;->c(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {p1, p2}, Lh2/e;->c(J)F

    move-result v0

    :goto_1
    invoke-static {v2, v0}, Ljc/x;->b(FF)J

    move-result-wide v0

    iget-object v2, p0, Lcoil/compose/ContentPainterNode;->P:Ly2/k;

    invoke-interface {v2, v0, v1, p1, p2}, Ly2/k;->a(JJ)J

    move-result-wide v2

    sget v4, Ly2/p1;->a:I

    const/16 v4, 0x20

    shr-long v4, v2, v4

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_4

    const-wide v4, 0xffffffffL

    and-long/2addr v4, v2

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-static {v0, v1, v2, v3}, Ly2/q1;->i(JJ)J

    move-result-wide p1

    :cond_4
    :goto_2
    return-wide p1
.end method

.method public final Y0()Ln2/a;
    .locals 1

    iget-object v0, p0, Lcoil/compose/ContentPainterNode;->painter:Ln2/a;

    return-object v0
.end method

.method public final Z0(J)J
    .locals 13

    invoke-static {p1, p2}, Ly3/a;->g(J)Z

    move-result v0

    invoke-static {p1, p2}, Ly3/a;->f(J)Z

    move-result v1

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    :cond_0
    move-wide v6, p1

    goto :goto_1

    :cond_1
    invoke-static {p1, p2}, Ly3/a;->e(J)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {p1, p2}, Ly3/a;->d(J)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lcoil/compose/ContentPainterNode;->painter:Ln2/a;

    invoke-virtual {v3}, Ln2/a;->h()J

    move-result-wide v3

    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v5, v3, v5

    if-nez v5, :cond_3

    if-eqz v2, :cond_0

    invoke-static {p1, p2}, Ly3/a;->i(J)I

    move-result v8

    invoke-static {p1, p2}, Ly3/a;->h(J)I

    move-result v10

    const/4 v11, 0x0

    const/16 v12, 0xa

    const/4 v9, 0x0

    move-wide v6, p1

    invoke-static/range {v6 .. v12}, Ly3/a;->b(JIIIII)J

    move-result-wide p1

    return-wide p1

    :goto_1
    return-wide v6

    :cond_3
    move-wide v6, p1

    if-eqz v2, :cond_5

    if-nez v0, :cond_4

    if-eqz v1, :cond_5

    :cond_4
    invoke-static {v6, v7}, Ly3/a;->i(J)I

    move-result p1

    int-to-float p1, p1

    invoke-static {v6, v7}, Ly3/a;->h(J)I

    move-result p2

    :goto_2
    int-to-float p2, p2

    goto :goto_4

    :cond_5
    invoke-static {v3, v4}, Lh2/e;->e(J)F

    move-result p1

    invoke-static {v3, v4}, Lh2/e;->c(J)F

    move-result p2

    invoke-static {p1}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Lch/v;->b:Lnh/e;

    invoke-static {v6, v7}, Ly3/a;->k(J)I

    move-result v0

    int-to-float v0, v0

    invoke-static {v6, v7}, Ly3/a;->i(J)I

    move-result v1

    int-to-float v1, v1

    invoke-static {p1, v0, v1}, Le93/b;->m(FFF)F

    move-result p1

    goto :goto_3

    :cond_6
    invoke-static {v6, v7}, Ly3/a;->k(J)I

    move-result p1

    int-to-float p1, p1

    :goto_3
    invoke-static {p2}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_7

    sget-object v0, Lch/v;->b:Lnh/e;

    invoke-static {v6, v7}, Ly3/a;->j(J)I

    move-result v0

    int-to-float v0, v0

    invoke-static {v6, v7}, Ly3/a;->h(J)I

    move-result v1

    int-to-float v1, v1

    invoke-static {p2, v0, v1}, Le93/b;->m(FFF)F

    move-result p2

    goto :goto_4

    :cond_7
    invoke-static {v6, v7}, Ly3/a;->j(J)I

    move-result p2

    goto :goto_2

    :goto_4
    invoke-static {p1, p2}, Ljc/x;->b(FF)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcoil/compose/ContentPainterNode;->X0(J)J

    move-result-wide p1

    invoke-static {p1, p2}, Lh2/e;->e(J)F

    move-result v0

    invoke-static {p1, p2}, Lh2/e;->c(J)F

    move-result p1

    invoke-static {v0}, Le93/b;->X(F)I

    move-result p2

    invoke-static {p2, v6, v7}, Ly3/b;->g(IJ)I

    move-result v2

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    invoke-static {p1, v6, v7}, Ly3/b;->f(IJ)I

    move-result v4

    const/4 v5, 0x0

    move-wide v0, v6

    const/16 v6, 0xa

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Ly3/a;->b(JIIIII)J

    move-result-wide p1

    return-wide p1
.end method

.method public final a1(Ln2/a;)V
    .locals 0

    iput-object p1, p0, Lcoil/compose/ContentPainterNode;->painter:Ln2/a;

    return-void
.end method

.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 2

    invoke-virtual {p0, p3, p4}, Lcoil/compose/ContentPainterNode;->Z0(J)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget p3, p2, Ly2/j1;->w:I

    iget p4, p2, Ly2/j1;->x:I

    new-instance v0, Lch/m;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1}, Lch/m;-><init>(Ly2/j1;I)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p3, p4, p2, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

.method public final g0(La3/w0;Ly2/q0;I)I
    .locals 4

    iget-object p1, p0, Lcoil/compose/ContentPainterNode;->painter:Ln2/a;

    invoke-virtual {p1}, Ln2/a;->h()J

    move-result-wide v0

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    const/4 v0, 0x7

    invoke-static {p1, p3, v0}, Ly3/b;->b(III)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcoil/compose/ContentPainterNode;->Z0(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ly3/a;->h(J)I

    move-result p1

    invoke-interface {p2, p1}, Ly2/q0;->O(I)I

    move-result p1

    int-to-float p2, p1

    int-to-float p3, p3

    invoke-static {p2, p3}, Ljc/x;->b(FF)J

    move-result-wide p2

    invoke-virtual {p0, p2, p3}, Lcoil/compose/ContentPainterNode;->X0(J)J

    move-result-wide p2

    invoke-static {p2, p3}, Lh2/e;->e(J)F

    move-result p2

    invoke-static {p2}, Le93/b;->X(F)I

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
    .locals 4

    iget-object p1, p0, Lcoil/compose/ContentPainterNode;->painter:Ln2/a;

    invoke-virtual {p1}, Ln2/a;->h()J

    move-result-wide v0

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    const/4 v0, 0x7

    invoke-static {p1, p3, v0}, Ly3/b;->b(III)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcoil/compose/ContentPainterNode;->Z0(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ly3/a;->h(J)I

    move-result p1

    invoke-interface {p2, p1}, Ly2/q0;->Q(I)I

    move-result p1

    int-to-float p2, p1

    int-to-float p3, p3

    invoke-static {p2, p3}, Ljc/x;->b(FF)J

    move-result-wide p2

    invoke-virtual {p0, p2, p3}, Lcoil/compose/ContentPainterNode;->X0(J)J

    move-result-wide p2

    invoke-static {p2, p3}, Lh2/e;->e(J)F

    move-result p2

    invoke-static {p2}, Le93/b;->X(F)I

    move-result p2

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p2, p3}, Ly2/q0;->Q(I)I

    move-result p1

    return p1
.end method

.method public final y(La3/w0;Ly2/q0;I)I
    .locals 4

    iget-object p1, p0, Lcoil/compose/ContentPainterNode;->painter:Ln2/a;

    invoke-virtual {p1}, Ln2/a;->h()J

    move-result-wide v0

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    const/16 v0, 0xd

    invoke-static {p3, p1, v0}, Ly3/b;->b(III)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcoil/compose/ContentPainterNode;->Z0(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ly3/a;->i(J)I

    move-result p1

    invoke-interface {p2, p1}, Ly2/q0;->C(I)I

    move-result p1

    int-to-float p2, p3

    int-to-float p3, p1

    invoke-static {p2, p3}, Ljc/x;->b(FF)J

    move-result-wide p2

    invoke-virtual {p0, p2, p3}, Lcoil/compose/ContentPainterNode;->X0(J)J

    move-result-wide p2

    invoke-static {p2, p3}, Lh2/e;->c(J)F

    move-result p2

    invoke-static {p2}, Le93/b;->X(F)I

    move-result p2

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p2, p3}, Ly2/q0;->C(I)I

    move-result p1

    return p1
.end method
