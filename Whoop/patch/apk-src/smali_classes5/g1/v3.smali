.class public final Lg1/v3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt2/a;


# instance fields
.field public final synthetic w:Lg1/a0;


# direct methods
.method public constructor <init>(Lg1/a0;)V
    .locals 1

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/v3;->w:Lg1/a0;

    return-void
.end method


# virtual methods
.method public final J(JJI)J
    .locals 0

    const/4 p1, 0x1

    if-ne p5, p1, :cond_0

    sget-object p1, Lh0/d2;->w:Lh0/d2;

    const-wide p1, 0xffffffffL

    and-long/2addr p1, p3

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    iget-object p2, p0, Lg1/v3;->w:Lg1/a0;

    invoke-virtual {p2, p1}, Lg1/a0;->d(F)F

    move-result p1

    invoke-virtual {p0, p1}, Lg1/v3;->a(F)J

    move-result-wide p1

    return-wide p1

    :cond_0
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public final V(JJLq83/d;)Ljava/lang/Object;
    .locals 2

    instance-of p1, p5, Lg1/t3;

    if-eqz p1, :cond_0

    move-object p1, p5

    check-cast p1, Lg1/t3;

    iget p2, p1, Lg1/t3;->z:I

    const/high16 v0, -0x80000000

    and-int v1, p2, v0

    if-eqz v1, :cond_0

    sub-int/2addr p2, v0

    iput p2, p1, Lg1/t3;->z:I

    goto :goto_0

    :cond_0
    new-instance p1, Lg1/t3;

    check-cast p5, Ls83/c;

    invoke-direct {p1, p0, p5}, Lg1/t3;-><init>(Lg1/v3;Ls83/c;)V

    :goto_0
    iget-object p2, p1, Lg1/t3;->x:Ljava/lang/Object;

    sget-object p5, Lr83/a;->w:Lr83/a;

    iget v0, p1, Lg1/t3;->z:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-ne v0, v1, :cond_1

    iget-wide p3, p1, Lg1/t3;->w:J

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p2, Lh0/d2;->w:Lh0/d2;

    invoke-static {p3, p4}, Ly3/q;->e(J)F

    move-result p2

    iput-wide p3, p1, Lg1/t3;->w:J

    iput v1, p1, Lg1/t3;->z:I

    iget-object v0, p0, Lg1/v3;->w:Lg1/a0;

    invoke-virtual {v0, p2, p1}, Lg1/a0;->i(FLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p5, :cond_3

    return-object p5

    :cond_3
    :goto_1
    new-instance p1, Ly3/q;

    invoke-direct {p1, p3, p4}, Ly3/q;-><init>(J)V

    return-object p1
.end method

.method public final a(F)J
    .locals 6

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v2, p1

    const/16 p1, 0x20

    shl-long/2addr v0, p1

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final l0(JI)J
    .locals 2

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    const-wide v0, 0xffffffffL

    and-long/2addr p1, v0

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    const/4 p2, 0x0

    cmpg-float p2, p1, p2

    if-gez p2, :cond_0

    const/4 p2, 0x1

    if-ne p3, p2, :cond_0

    iget-object p2, p0, Lg1/v3;->w:Lg1/a0;

    invoke-virtual {p2, p1}, Lg1/a0;->d(F)F

    move-result p1

    invoke-virtual {p0, p1}, Lg1/v3;->a(F)J

    move-result-wide p1

    return-wide p1

    :cond_0
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public final p0(JLq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lg1/u3;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lg1/u3;

    iget v1, v0, Lg1/u3;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lg1/u3;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lg1/u3;

    check-cast p3, Ls83/c;

    invoke-direct {v0, p0, p3}, Lg1/u3;-><init>(Lg1/v3;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lg1/u3;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lg1/u3;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide p1, v0, Lg1/u3;->w:J

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p3, Lh0/d2;->w:Lh0/d2;

    invoke-static {p1, p2}, Ly3/q;->e(J)F

    move-result p3

    iget-object v2, p0, Lg1/v3;->w:Lg1/a0;

    invoke-virtual {v2}, Lg1/a0;->g()F

    move-result v4

    const/4 v5, 0x0

    cmpg-float v5, p3, v5

    if-gez v5, :cond_3

    invoke-virtual {v2}, Lg1/a0;->e()Lg1/k3;

    move-result-object v5

    invoke-virtual {v5}, Lg1/k3;->c()F

    move-result v5

    cmpl-float v4, v4, v5

    if-lez v4, :cond_3

    iput-wide p1, v0, Lg1/u3;->w:J

    iput v3, v0, Lg1/u3;->z:I

    invoke-virtual {v2, p3, v0}, Lg1/a0;->i(FLs83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_3
    const-wide/16 p1, 0x0

    :cond_4
    :goto_1
    new-instance p3, Ly3/q;

    invoke-direct {p3, p1, p2}, Ly3/q;-><init>(J)V

    return-object p3
.end method
