.class public final Ln1/n;
.super La3/o;
.source "SourceFile"

# interfaces
.implements Lt2/a;


# instance fields
.field public Q:Z

.field public R:Lc93/a;

.field public S:Z

.field public T:Ln1/o;

.field public U:F

.field public final V:Lt2/g;

.field public final W:Lp1/g1;

.field public final X:Lp1/g1;


# direct methods
.method public constructor <init>(ZLc93/a;ZLn1/o;F)V
    .locals 0

    invoke-direct {p0}, La3/o;-><init>()V

    iput-boolean p1, p0, Ln1/n;->Q:Z

    iput-object p2, p0, Ln1/n;->R:Lc93/a;

    iput-boolean p3, p0, Ln1/n;->S:Z

    iput-object p4, p0, Ln1/n;->T:Ln1/o;

    iput p5, p0, Ln1/n;->U:F

    new-instance p1, Lt2/g;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lt2/g;-><init>(Lt2/a;Lt2/d;)V

    iput-object p1, p0, Ln1/n;->V:Lt2/g;

    new-instance p1, Lp1/g1;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lp1/g1;-><init>(F)V

    iput-object p1, p0, Ln1/n;->W:Lp1/g1;

    new-instance p1, Lp1/g1;

    invoke-direct {p1, p2}, Lp1/g1;-><init>(F)V

    iput-object p1, p0, Ln1/n;->X:Lp1/g1;

    return-void
.end method

.method public static final a1(Ln1/n;Ls83/c;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p1, Ln1/j;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ln1/j;

    iget v1, v0, Ln1/j;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln1/j;->y:I

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ln1/j;

    invoke-direct {v0, p0, p1}, Ln1/j;-><init>(Ln1/n;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p1, v5, Ln1/j;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ln1/j;->y:I

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Ln1/n;->T:Ln1/o;

    iput v2, v5, Ln1/j;->y:I

    iget-object v1, p1, Ln1/o;->a:Ld0/e;

    new-instance v2, Ljava/lang/Float;

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-direct {v2, p1}, Ljava/lang/Float;-><init>(F)V

    const/4 v4, 0x0

    const/16 v6, 0xe

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    move-object p1, v7

    :goto_2
    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_3
    iget-boolean p1, p0, Lb2/v;->N:Z

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Ln1/n;->d1()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Ln1/n;->f1(F)V

    invoke-virtual {p0}, Ln1/n;->d1()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Ln1/n;->g1(F)V

    :cond_5
    return-object v7

    :goto_4
    iget-boolean v0, p0, Lb2/v;->N:Z

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Ln1/n;->d1()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Ln1/n;->f1(F)V

    invoke-virtual {p0}, Ln1/n;->d1()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Ln1/n;->g1(F)V

    :cond_6
    throw p1
.end method


# virtual methods
.method public final J(JJI)J
    .locals 1

    iget-object p1, p0, Ln1/n;->T:Ln1/o;

    iget-object p1, p1, Ln1/o;->a:Ld0/e;

    invoke-virtual {p1}, Ld0/e;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, Ln1/n;->S:Z

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    if-ne p5, p1, :cond_2

    invoke-virtual {p0, p3, p4}, Ln1/n;->c1(J)J

    move-result-wide p1

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object p3

    new-instance p4, Ln1/k;

    const/4 p5, 0x1

    const/4 v0, 0x0

    invoke-direct {p4, p0, v0, p5}, Ln1/k;-><init>(Ln1/n;Lq83/d;I)V

    const/4 p5, 0x3

    invoke-static {p3, v0, v0, p4, p5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-wide p1

    :cond_2
    :goto_0
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public final M0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final P0()V
    .locals 4

    iget-object v0, p0, Ln1/n;->V:Lt2/g;

    invoke-virtual {p0, v0}, La3/o;->X0(La3/n;)La3/n;

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v0

    new-instance v1, Ln1/k;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3, v2}, Ln1/k;-><init>(Ln1/n;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {v0, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-boolean v0, p0, Ln1/n;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ln1/n;->d1()I

    move-result v0

    int-to-float v0, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Ln1/n;->g1(F)V

    return-void
.end method

.method public final b1(Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p1, Ln1/i;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ln1/i;

    iget v1, v0, Ln1/i;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln1/i;->y:I

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ln1/i;

    invoke-direct {v0, p0, p1}, Ln1/i;-><init>(Ln1/n;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p1, v5, Ln1/i;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ln1/i;->y:I

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    const/4 v2, 0x1

    const/4 v8, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Ln1/n;->T:Ln1/o;

    iput v2, v5, Ln1/i;->y:I

    iget-object v1, p1, Ln1/o;->a:Ld0/e;

    new-instance v2, Ljava/lang/Float;

    invoke-direct {v2, v8}, Ljava/lang/Float;-><init>(F)V

    const/4 v4, 0x0

    const/16 v6, 0xe

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    move-object p1, v7

    :goto_2
    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_3
    invoke-virtual {p0, v8}, Ln1/n;->f1(F)V

    invoke-virtual {p0, v8}, Ln1/n;->g1(F)V

    return-object v7

    :goto_4
    invoke-virtual {p0, v8}, Ln1/n;->f1(F)V

    invoke-virtual {p0, v8}, Ln1/n;->g1(F)V

    throw p1
.end method

.method public final c1(J)J
    .locals 8

    iget-boolean v0, p0, Ln1/n;->Q:Z

    const-wide v1, 0xffffffffL

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    move p2, v3

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ln1/n;->X:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v4

    and-long/2addr p1, v1

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    add-float/2addr p1, v4

    cmpg-float p2, p1, v3

    if-gez p2, :cond_1

    move p1, v3

    :cond_1
    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result p2

    sub-float p2, p1, p2

    invoke-virtual {p0, p1}, Ln1/n;->f1(F)V

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result p1

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float/2addr p1, v4

    invoke-virtual {p0}, Ln1/n;->d1()I

    move-result v5

    int-to-float v5, v5

    cmpg-float p1, p1, v5

    if-gtz p1, :cond_2

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result p1

    mul-float/2addr p1, v4

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result p1

    mul-float/2addr p1, v4

    invoke-virtual {p0}, Ln1/n;->d1()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr p1, v0

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p1, v3, v0}, Le93/b;->m(FFF)F

    move-result p1

    float-to-double v4, p1

    const/4 v0, 0x2

    int-to-double v6, v0

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    double-to-float v0, v4

    const/4 v4, 0x4

    int-to-float v4, v4

    div-float/2addr v0, v4

    sub-float/2addr p1, v0

    invoke-virtual {p0}, Ln1/n;->d1()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    invoke-virtual {p0}, Ln1/n;->d1()I

    move-result p1

    int-to-float p1, p1

    add-float/2addr p1, v0

    :goto_0
    invoke-virtual {p0, p1}, Ln1/n;->g1(F)V

    :goto_1
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v3, p1

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    const/16 v0, 0x20

    shl-long/2addr v3, v0

    and-long/2addr p1, v1

    or-long/2addr p1, v3

    return-wide p1
.end method

.method public final d1()I
    .locals 2

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    iget-object v0, v0, La3/n0;->X:Ly3/c;

    iget v1, p0, Ln1/n;->U:F

    invoke-interface {v0, v1}, Ly3/c;->F(F)I

    move-result v0

    return v0
.end method

.method public final e1(FLs83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Ln1/m;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ln1/m;

    iget v1, v0, Ln1/m;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln1/m;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Ln1/m;

    invoke-direct {v0, p0, p2}, Ln1/m;-><init>(Ln1/n;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Ln1/m;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ln1/m;->z:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Ln1/m;->w:F

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p2, p0, Ln1/n;->Q:Z

    if-eqz p2, :cond_3

    new-instance p1, Ljava/lang/Float;

    invoke-direct {p1, v4}, Ljava/lang/Float;-><init>(F)V

    return-object p1

    :cond_3
    iget-object p2, p0, Ln1/n;->X:Lp1/g1;

    invoke-virtual {p2}, Lp1/g1;->x()F

    move-result v2

    const/high16 v5, 0x3f000000    # 0.5f

    mul-float/2addr v2, v5

    invoke-virtual {p0}, Ln1/n;->d1()I

    move-result v5

    int-to-float v5, v5

    cmpl-float v2, v2, v5

    if-lez v2, :cond_4

    iget-object v2, p0, Ln1/n;->R:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_4
    invoke-virtual {p2}, Lp1/g1;->x()F

    move-result p2

    cmpg-float p2, p2, v4

    if-nez p2, :cond_5

    :goto_1
    move p1, v4

    goto :goto_2

    :cond_5
    cmpg-float p2, p1, v4

    if-gez p2, :cond_6

    goto :goto_1

    :cond_6
    :goto_2
    iput p1, v0, Ln1/m;->w:F

    iput v3, v0, Ln1/m;->z:I

    invoke-virtual {p0, v0}, Ln1/n;->b1(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    return-object v1

    :cond_7
    :goto_3
    invoke-virtual {p0, v4}, Ln1/n;->f1(F)V

    new-instance p2, Ljava/lang/Float;

    invoke-direct {p2, p1}, Ljava/lang/Float;-><init>(F)V

    return-object p2
.end method

.method public final f1(F)V
    .locals 1

    iget-object v0, p0, Ln1/n;->X:Lp1/g1;

    invoke-virtual {v0, p1}, Lp1/g1;->y(F)V

    return-void
.end method

.method public final g1(F)V
    .locals 1

    iget-object v0, p0, Ln1/n;->W:Lp1/g1;

    invoke-virtual {v0, p1}, Lp1/g1;->y(F)V

    return-void
.end method

.method public final l0(JI)J
    .locals 5

    iget-object v0, p0, Ln1/n;->T:Ln1/o;

    iget-object v0, v0, Ln1/o;->a:Ld0/e;

    invoke-virtual {v0}, Ld0/e;->f()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    return-wide v1

    :cond_0
    iget-boolean v0, p0, Ln1/n;->S:Z

    if-nez v0, :cond_1

    return-wide v1

    :cond_1
    const/4 v0, 0x1

    if-ne p3, v0, :cond_2

    const-wide v3, 0xffffffffL

    and-long/2addr v3, p1

    long-to-int p3, v3

    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    const/4 v0, 0x0

    cmpg-float p3, p3, v0

    if-gez p3, :cond_2

    invoke-virtual {p0, p1, p2}, Ln1/n;->c1(J)J

    move-result-wide p1

    return-wide p1

    :cond_2
    return-wide v1
.end method

.method public final p0(JLq83/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Ln1/l;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ln1/l;

    iget v1, v0, Ln1/l;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln1/l;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ln1/l;

    check-cast p3, Ls83/c;

    invoke-direct {v0, p0, p3}, Ln1/l;-><init>(Ln1/n;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Ln1/l;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ln1/l;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {p1, p2}, Ly3/q;->e(J)F

    move-result p1

    iput v3, v0, Ln1/l;->y:I

    invoke-virtual {p0, p1, v0}, Ln1/n;->e1(FLs83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p1

    const/4 p2, 0x0

    invoke-static {p2, p1}, Ls4/i;->a(FF)J

    move-result-wide p1

    new-instance p3, Ly3/q;

    invoke-direct {p3, p1, p2}, Ly3/q;-><init>(J)V

    return-object p3
.end method
