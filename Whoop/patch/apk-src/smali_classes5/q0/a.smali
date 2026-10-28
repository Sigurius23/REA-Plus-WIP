.class public final Lq0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt2/a;


# instance fields
.field public final w:Lq0/y;

.field public final x:Lh0/d2;


# direct methods
.method public constructor <init>(Lq0/y;Lh0/d2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/a;->w:Lq0/y;

    iput-object p2, p0, Lq0/a;->x:Lh0/d2;

    return-void
.end method


# virtual methods
.method public final J(JJI)J
    .locals 0

    const/4 p1, 0x2

    if-ne p5, p1, :cond_2

    iget-object p1, p0, Lq0/a;->x:Lh0/d2;

    sget-object p2, Lh0/d2;->x:Lh0/d2;

    if-ne p1, p2, :cond_0

    const/16 p1, 0x20

    shr-long p1, p3, p1

    :goto_0
    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    goto :goto_1

    :cond_0
    const-wide p1, 0xffffffffL

    and-long/2addr p1, p3

    goto :goto_0

    :goto_1
    const/4 p2, 0x0

    cmpg-float p1, p1, p2

    if-nez p1, :cond_1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string p2, "Scroll cancelled"

    invoke-direct {p1, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_2
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public final V(JJLq83/d;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Lq0/a;->x:Lh0/d2;

    sget-object p2, Lh0/d2;->w:Lh0/d2;

    const/4 p5, 0x0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x2

    invoke-static {p5, p5, p3, p4, p1}, Ly3/q;->b(FFJI)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    invoke-static {p5, p5, p3, p4, p1}, Ly3/q;->b(FFJI)J

    move-result-wide p1

    :goto_0
    new-instance p3, Ly3/q;

    invoke-direct {p3, p1, p2}, Ly3/q;-><init>(J)V

    return-object p3
.end method

.method public final l0(JI)J
    .locals 10

    const/4 v0, 0x1

    if-ne p3, v0, :cond_4

    iget-object p3, p0, Lq0/a;->w:Lq0/y;

    iget-object v0, p3, Lq0/y;->d:Ll9/o;

    iget-object v1, p3, Lq0/y;->d:Ll9/o;

    iget-object v0, v0, Ll9/o;->d:Ljava/lang/Object;

    check-cast v0, Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v2, v0

    const-wide v4, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpl-double v0, v2, v4

    if-lez v0, :cond_4

    iget-object v0, v1, Ll9/o;->d:Ljava/lang/Object;

    check-cast v0, Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    invoke-virtual {p3}, Lq0/y;->n()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v0, v2

    invoke-virtual {p3}, Lq0/y;->l()Lq0/q;

    move-result-object v2

    iget v2, v2, Lq0/q;->b:I

    invoke-virtual {p3}, Lq0/y;->l()Lq0/q;

    move-result-object v3

    iget v3, v3, Lq0/q;->c:I

    add-int/2addr v2, v3

    int-to-float v2, v2

    iget-object v3, v1, Ll9/o;->d:Ljava/lang/Object;

    check-cast v3, Lp1/g1;

    invoke-virtual {v3}, Lp1/g1;->x()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    move-result v3

    neg-float v3, v3

    mul-float/2addr v2, v3

    add-float/2addr v2, v0

    iget-object v1, v1, Ll9/o;->d:Ljava/lang/Object;

    check-cast v1, Lp1/g1;

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v1

    const/4 v3, 0x0

    cmpl-float v1, v1, v3

    if-lez v1, :cond_0

    move v9, v2

    move v2, v0

    move v0, v9

    :cond_0
    sget-object v1, Lh0/d2;->x:Lh0/d2;

    const-wide v3, 0xffffffffL

    const/16 v5, 0x20

    iget-object v6, p0, Lq0/a;->x:Lh0/d2;

    if-ne v6, v1, :cond_1

    shr-long v7, p1, v5

    :goto_0
    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    goto :goto_1

    :cond_1
    and-long v7, p1, v3

    goto :goto_0

    :goto_1
    invoke-static {v7, v0, v2}, Le93/b;->m(FFF)F

    move-result v0

    neg-float v0, v0

    iget-object p3, p3, Lq0/y;->k:Lh0/d0;

    invoke-virtual {p3, v0}, Lh0/d0;->e(F)F

    move-result p3

    neg-float p3, p3

    if-ne v6, v1, :cond_2

    move v0, p3

    goto :goto_2

    :cond_2
    shr-long v0, p1, v5

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    :goto_2
    sget-object v1, Lh0/d2;->w:Lh0/d2;

    if-ne v6, v1, :cond_3

    goto :goto_3

    :cond_3
    and-long/2addr p1, v3

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    :goto_3
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p3

    int-to-long v0, p3

    shl-long/2addr p1, v5

    and-long/2addr v0, v3

    or-long/2addr p1, v0

    return-wide p1

    :cond_4
    const-wide/16 p1, 0x0

    return-wide p1
.end method
