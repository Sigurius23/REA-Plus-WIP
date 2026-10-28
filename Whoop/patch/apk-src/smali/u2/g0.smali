.class public final Lu2/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/b;
.implements Ly3/c;
.implements Lq83/d;


# instance fields
.field public final E:Lq83/k;

.field public final synthetic F:Lu2/h0;

.field public final synthetic w:Lu2/h0;

.field public final x:Lbc3/m;

.field public y:Lbc3/m;

.field public z:Lu2/l;


# direct methods
.method public constructor <init>(Lu2/h0;Lbc3/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/g0;->F:Lu2/h0;

    iput-object p1, p0, Lu2/g0;->w:Lu2/h0;

    iput-object p2, p0, Lu2/g0;->x:Lbc3/m;

    sget-object p1, Lu2/l;->x:Lu2/l;

    iput-object p1, p0, Lu2/g0;->z:Lu2/l;

    sget-object p1, Lq83/k;->w:Lq83/k;

    iput-object p1, p0, Lu2/g0;->E:Lq83/k;

    return-void
.end method


# virtual methods
.method public final D0(J)J
    .locals 1

    iget-object v0, p0, Lu2/g0;->w:Lu2/h0;

    invoke-interface {v0, p1, p2}, Ly3/c;->D0(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final F(F)I
    .locals 1

    iget-object v0, p0, Lu2/g0;->w:Lu2/h0;

    invoke-interface {v0, p1}, Ly3/c;->F(F)I

    move-result p1

    return p1
.end method

.method public final K(J)F
    .locals 1

    iget-object v0, p0, Lu2/g0;->w:Lu2/h0;

    invoke-interface {v0, p1, p2}, Ly3/c;->K(J)F

    move-result p1

    return p1
.end method

.method public final a(Lu2/l;Lq83/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lbc3/m;

    invoke-static {p2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    iput-object p1, p0, Lu2/g0;->z:Lu2/l;

    iput-object v0, p0, Lu2/g0;->y:Lbc3/m;

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method public final b()J
    .locals 10

    iget-object v0, p0, Lu2/g0;->F:Lu2/h0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v1

    iget-object v1, v1, La3/n0;->Z:Lb3/j3;

    invoke-interface {v1}, Lb3/j3;->e()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Ly3/c;->D0(J)J

    move-result-wide v1

    iget-wide v3, v0, Lu2/h0;->Y:J

    const/16 v0, 0x20

    shr-long v5, v1, v0

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    shr-long v6, v3, v0

    long-to-int v6, v6

    int-to-float v6, v6

    sub-float/2addr v5, v6

    const/4 v6, 0x0

    invoke-static {v6, v5}, Ljava/lang/Math;->max(FF)F

    move-result v5

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v5, v7

    const-wide v8, 0xffffffffL

    and-long/2addr v1, v8

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    and-long v2, v3, v8

    long-to-int v2, v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    invoke-static {v6, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    div-float/2addr v1, v7

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v4, v1

    shl-long v0, v2, v0

    and-long v2, v4, v8

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final e0(I)F
    .locals 1

    iget-object v0, p0, Lu2/g0;->w:Lu2/h0;

    invoke-interface {v0, p1}, Ly3/c;->e0(I)F

    move-result p1

    return p1
.end method

.method public final f()Lb3/j3;
    .locals 1

    iget-object v0, p0, Lu2/g0;->F:Lu2/h0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    iget-object v0, v0, La3/n0;->Z:Lb3/j3;

    return-object v0
.end method

.method public final f0(F)F
    .locals 1

    iget-object v0, p0, Lu2/g0;->w:Lu2/h0;

    invoke-virtual {v0}, Lu2/h0;->getDensity()F

    move-result v0

    div-float/2addr p1, v0

    return p1
.end method

.method public final getContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lu2/g0;->E:Lq83/k;

    return-object v0
.end method

.method public final getDensity()F
    .locals 1

    iget-object v0, p0, Lu2/g0;->w:Lu2/h0;

    invoke-virtual {v0}, Lu2/h0;->getDensity()F

    move-result v0

    return v0
.end method

.method public final h(F)J
    .locals 2

    iget-object v0, p0, Lu2/g0;->w:Lu2/h0;

    invoke-interface {v0, p1}, Ly3/c;->h(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final i(J)J
    .locals 1

    iget-object v0, p0, Lu2/g0;->w:Lu2/h0;

    invoke-interface {v0, p1, p2}, Ly3/c;->i(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final k(JLc93/m;Ls83/a;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p4, Lu2/e0;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lu2/e0;

    iget v1, v0, Lu2/e0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lu2/e0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lu2/e0;

    invoke-direct {v0, p0, p4}, Lu2/e0;-><init>(Lu2/g0;Ls83/a;)V

    :goto_0
    iget-object p4, v0, Lu2/e0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lu2/e0;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lu2/e0;->w:Lbc3/c2;

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v7, p0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p2, v0

    move-object v7, p0

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    const-wide/16 v4, 0x0

    cmp-long p4, p1, v4

    if-gtz p4, :cond_3

    iget-object p4, p0, Lu2/g0;->y:Lbc3/m;

    if-eqz p4, :cond_3

    new-instance v2, Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException;

    invoke-direct {v2, p1, p2}, Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException;-><init>(J)V

    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v2

    invoke-virtual {p4, v2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_3
    iget-object p4, p0, Lu2/g0;->F:Lu2/h0;

    invoke-virtual {p4}, Lb2/v;->L0()Lbc3/c0;

    move-result-object p4

    new-instance v4, Lb4/i;

    const/4 v9, 0x6

    const/4 v8, 0x0

    move-object v7, p0

    move-wide v5, p1

    invoke-direct/range {v4 .. v9}, Lb4/i;-><init>(JLjava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {p4, v8, v8, v4, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    :try_start_1
    iput-object p1, v0, Lu2/e0;->w:Lbc3/c2;

    iput v3, v0, Lu2/e0;->z:I

    invoke-interface {p3, p0, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p4, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    sget-object p2, Landroidx/compose/ui/input/pointer/CancelTimeoutCancellationException;->w:Landroidx/compose/ui/input/pointer/CancelTimeoutCancellationException;

    invoke-interface {p1, p2}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-object p4

    :catchall_1
    move-exception v0

    move-object p2, v0

    :goto_2
    sget-object p3, Landroidx/compose/ui/input/pointer/CancelTimeoutCancellationException;->w:Landroidx/compose/ui/input/pointer/CancelTimeoutCancellationException;

    invoke-interface {p1, p3}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    throw p2
.end method

.method public final l(J)F
    .locals 1

    iget-object v0, p0, Lu2/g0;->w:Lu2/h0;

    invoke-interface {v0, p1, p2}, Ly3/c;->l(J)F

    move-result p1

    return p1
.end method

.method public final m0()F
    .locals 1

    iget-object v0, p0, Lu2/g0;->w:Lu2/h0;

    invoke-virtual {v0}, Lu2/h0;->m0()F

    move-result v0

    return v0
.end method

.method public final o(JLh0/g3;Ls83/a;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p4, Lu2/f0;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lu2/f0;

    iget v1, v0, Lu2/f0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lu2/f0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lu2/f0;

    invoke-direct {v0, p0, p4}, Lu2/f0;-><init>(Lu2/g0;Ls83/a;)V

    :goto_0
    iget-object p4, v0, Lu2/f0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lu2/f0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iput v3, v0, Lu2/f0;->y:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lu2/g0;->k(JLc93/m;Ls83/a;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final q(F)J
    .locals 2

    iget-object v0, p0, Lu2/g0;->w:Lu2/h0;

    invoke-interface {v0, p1}, Ly3/c;->q(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final q0(F)F
    .locals 1

    iget-object v0, p0, Lu2/g0;->w:Lu2/h0;

    invoke-virtual {v0}, Lu2/h0;->getDensity()F

    move-result v0

    mul-float/2addr v0, p1

    return v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lu2/g0;->F:Lu2/h0;

    iget-object v1, v0, Lu2/h0;->V:Lr1/c;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Lu2/h0;->U:Lr1/c;

    invoke-virtual {v0, p0}, Lr1/c;->k(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    iget-object v0, p0, Lu2/g0;->x:Lbc3/m;

    invoke-virtual {v0, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1
.end method
