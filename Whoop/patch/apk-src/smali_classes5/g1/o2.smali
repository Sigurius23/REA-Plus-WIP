.class public final Lg1/o2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt2/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lg1/a0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lg1/o2;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lg1/o2;->y:Ljava/lang/Object;

    .line 5
    sget-object p1, Lh0/d2;->w:Lh0/d2;

    iput-object p1, p0, Lg1/o2;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll1/w3;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg1/o2;->w:I

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lg1/o2;->x:Ljava/lang/Object;

    iput-object p2, p0, Lg1/o2;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final J(JJI)J
    .locals 5

    iget p1, p0, Lg1/o2;->w:I

    const-wide/16 v0, 0x0

    const-wide v2, 0xffffffffL

    iget-object p2, p0, Lg1/o2;->x:Ljava/lang/Object;

    const/4 v4, 0x1

    packed-switch p1, :pswitch_data_0

    if-ne p5, v4, :cond_1

    check-cast p2, Ll1/w3;

    iget-object p1, p2, Ll1/w3;->e:Lm1/g;

    sget-object p2, Lh0/d2;->w:Lh0/d2;

    and-long p2, p3, v2

    long-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    invoke-virtual {p1, p2}, Lm1/g;->e(F)F

    move-result p2

    iget-object p1, p1, Lm1/g;->j:Lp1/g1;

    invoke-virtual {p1}, Lp1/g1;->x()F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lp1/g1;->x()F

    move-result p3

    :goto_0
    invoke-virtual {p1, p2}, Lp1/g1;->y(F)V

    sub-float/2addr p2, p3

    invoke-virtual {p0, p2}, Lg1/o2;->b(F)J

    move-result-wide v0

    :cond_1
    return-wide v0

    :pswitch_0
    if-ne p5, v4, :cond_3

    iget-object p1, p0, Lg1/o2;->y:Ljava/lang/Object;

    check-cast p1, Lg1/a0;

    check-cast p2, Lh0/d2;

    sget-object p5, Lh0/d2;->x:Lh0/d2;

    if-ne p2, p5, :cond_2

    const/16 p2, 0x20

    shr-long p2, p3, p2

    :goto_1
    long-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    goto :goto_2

    :cond_2
    and-long p2, p3, v2

    goto :goto_1

    :goto_2
    invoke-virtual {p1, p2}, Lg1/a0;->d(F)F

    move-result p1

    invoke-virtual {p0, p1}, Lg1/o2;->a(F)J

    move-result-wide v0

    :cond_3
    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final V(JJLq83/d;)Ljava/lang/Object;
    .locals 3

    iget p1, p0, Lg1/o2;->w:I

    iget-object p2, p0, Lg1/o2;->y:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    check-cast p2, Lkotlin/jvm/functions/Function1;

    sget-object p1, Lh0/d2;->w:Lh0/d2;

    invoke-static {p3, p4}, Ly3/q;->e(J)F

    move-result p1

    new-instance p5, Ljava/lang/Float;

    invoke-direct {p5, p1}, Ljava/lang/Float;-><init>(F)V

    invoke-interface {p2, p5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Ly3/q;

    invoke-direct {p1, p3, p4}, Ly3/q;-><init>(J)V

    return-object p1

    :pswitch_0
    instance-of p1, p5, Lg1/m2;

    if-eqz p1, :cond_0

    move-object p1, p5

    check-cast p1, Lg1/m2;

    iget v0, p1, Lg1/m2;->z:I

    const/high16 v1, -0x80000000

    and-int v2, v0, v1

    if-eqz v2, :cond_0

    sub-int/2addr v0, v1

    iput v0, p1, Lg1/m2;->z:I

    goto :goto_0

    :cond_0
    new-instance p1, Lg1/m2;

    check-cast p5, Ls83/c;

    invoke-direct {p1, p0, p5}, Lg1/m2;-><init>(Lg1/o2;Ls83/c;)V

    :goto_0
    iget-object p5, p1, Lg1/m2;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p1, Lg1/m2;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-wide p3, p1, Lg1/m2;->w:J

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Lg1/a0;

    iget-object p5, p0, Lg1/o2;->x:Ljava/lang/Object;

    check-cast p5, Lh0/d2;

    sget-object v1, Lh0/d2;->x:Lh0/d2;

    if-ne p5, v1, :cond_3

    invoke-static {p3, p4}, Ly3/q;->d(J)F

    move-result p5

    goto :goto_1

    :cond_3
    invoke-static {p3, p4}, Ly3/q;->e(J)F

    move-result p5

    :goto_1
    iput-wide p3, p1, Lg1/m2;->w:J

    iput v2, p1, Lg1/m2;->z:I

    invoke-virtual {p2, p5, p1}, Lg1/a0;->i(FLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    new-instance v0, Ly3/q;

    invoke-direct {v0, p3, p4}, Ly3/q;-><init>(J)V

    :goto_3
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public a(F)J
    .locals 6

    iget-object v0, p0, Lg1/o2;->x:Ljava/lang/Object;

    check-cast v0, Lh0/d2;

    sget-object v1, Lh0/d2;->x:Lh0/d2;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    move v1, p1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    sget-object v3, Lh0/d2;->w:Lh0/d2;

    if-ne v0, v3, :cond_1

    goto :goto_1

    :cond_1
    move p1, v2

    :goto_1
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

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

.method public b(F)J
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
    .locals 8

    iget v0, p0, Lg1/o2;->w:I

    const-wide/16 v1, 0x0

    iget-object v3, p0, Lg1/o2;->x:Ljava/lang/Object;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide v6, 0xffffffffL

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    and-long/2addr p1, v6

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    cmpg-float p2, p1, v5

    if-gez p2, :cond_1

    if-ne p3, v4, :cond_1

    check-cast v3, Ll1/w3;

    iget-object p2, v3, Ll1/w3;->e:Lm1/g;

    invoke-virtual {p2, p1}, Lm1/g;->e(F)F

    move-result p1

    iget-object p2, p2, Lm1/g;->j:Lp1/g1;

    invoke-virtual {p2}, Lp1/g1;->x()F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lp1/g1;->x()F

    move-result v5

    :goto_0
    invoke-virtual {p2, p1}, Lp1/g1;->y(F)V

    sub-float/2addr p1, v5

    invoke-virtual {p0, p1}, Lg1/o2;->b(F)J

    move-result-wide v1

    :cond_1
    return-wide v1

    :pswitch_0
    check-cast v3, Lh0/d2;

    sget-object v0, Lh0/d2;->x:Lh0/d2;

    if-ne v3, v0, :cond_2

    const/16 v0, 0x20

    shr-long/2addr p1, v0

    :goto_1
    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    goto :goto_2

    :cond_2
    and-long/2addr p1, v6

    goto :goto_1

    :goto_2
    cmpg-float p2, p1, v5

    if-gez p2, :cond_3

    if-ne p3, v4, :cond_3

    iget-object p2, p0, Lg1/o2;->y:Ljava/lang/Object;

    check-cast p2, Lg1/a0;

    invoke-virtual {p2, p1}, Lg1/a0;->d(F)F

    move-result p1

    invoke-virtual {p0, p1}, Lg1/o2;->a(F)J

    move-result-wide v1

    :cond_3
    return-wide v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p0(JLq83/d;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lg1/o2;->w:I

    const-wide/16 v1, 0x0

    iget-object v3, p0, Lg1/o2;->y:Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lg1/o2;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    sget-object p3, Lh0/d2;->w:Lh0/d2;

    invoke-static {p1, p2}, Ly3/q;->e(J)F

    move-result p3

    check-cast v5, Ll1/w3;

    iget-object v0, v5, Ll1/w3;->e:Lm1/g;

    invoke-virtual {v0}, Lm1/g;->f()F

    move-result v0

    iget-object v5, v5, Ll1/w3;->e:Lm1/g;

    invoke-virtual {v5}, Lm1/g;->d()Lm1/b0;

    move-result-object v5

    invoke-virtual {v5}, Lm1/b0;->c()F

    move-result v5

    cmpg-float v4, p3, v4

    if-gez v4, :cond_0

    cmpl-float v0, v0, v5

    if-lez v0, :cond_0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    new-instance v0, Ljava/lang/Float;

    invoke-direct {v0, p3}, Ljava/lang/Float;-><init>(F)V

    invoke-interface {v3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-wide p1, v1

    :goto_0
    new-instance p3, Ly3/q;

    invoke-direct {p3, p1, p2}, Ly3/q;-><init>(J)V

    return-object p3

    :pswitch_0
    check-cast v3, Lg1/a0;

    instance-of v0, p3, Lg1/n2;

    if-eqz v0, :cond_1

    move-object v0, p3

    check-cast v0, Lg1/n2;

    iget v6, v0, Lg1/n2;->z:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_1

    sub-int/2addr v6, v7

    iput v6, v0, Lg1/n2;->z:I

    goto :goto_1

    :cond_1
    new-instance v0, Lg1/n2;

    check-cast p3, Ls83/c;

    invoke-direct {v0, p0, p3}, Lg1/n2;-><init>(Lg1/o2;Ls83/c;)V

    :goto_1
    iget-object p3, v0, Lg1/n2;->x:Ljava/lang/Object;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v7, v0, Lg1/n2;->z:I

    const/4 v8, 0x1

    if-eqz v7, :cond_3

    if-ne v7, v8, :cond_2

    iget-wide p1, v0, Lg1/n2;->w:J

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v5, Lh0/d2;

    sget-object p3, Lh0/d2;->x:Lh0/d2;

    if-ne v5, p3, :cond_4

    invoke-static {p1, p2}, Ly3/q;->d(J)F

    move-result p3

    goto :goto_2

    :cond_4
    invoke-static {p1, p2}, Ly3/q;->e(J)F

    move-result p3

    :goto_2
    invoke-virtual {v3}, Lg1/a0;->g()F

    move-result v5

    cmpg-float v4, p3, v4

    if-gez v4, :cond_6

    invoke-virtual {v3}, Lg1/a0;->e()Lg1/k3;

    move-result-object v4

    invoke-virtual {v4}, Lg1/k3;->c()F

    move-result v4

    cmpl-float v4, v5, v4

    if-lez v4, :cond_6

    iput-wide p1, v0, Lg1/n2;->w:J

    iput v8, v0, Lg1/n2;->z:I

    invoke-virtual {v3, p3, v0}, Lg1/a0;->i(FLs83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v6, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    move-wide v1, p1

    :cond_6
    new-instance v6, Ly3/q;

    invoke-direct {v6, v1, v2}, Ly3/q;-><init>(J)V

    :goto_4
    return-object v6

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
