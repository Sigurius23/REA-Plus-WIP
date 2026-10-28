.class public final Lu2/h0;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements Lu2/v;
.implements Ly3/c;
.implements La3/f2;


# instance fields
.field public O:Ljava/lang/Object;

.field public P:Ljava/lang/Object;

.field public Q:[Ljava/lang/Object;

.field public R:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

.field public S:Lbc3/c2;

.field public T:Lu2/k;

.field public final U:Lr1/c;

.field public final V:Lr1/c;

.field public final W:Lr1/c;

.field public X:Lu2/k;

.field public Y:J


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V
    .locals 0

    invoke-direct {p0}, Lb2/v;-><init>()V

    iput-object p1, p0, Lu2/h0;->O:Ljava/lang/Object;

    iput-object p2, p0, Lu2/h0;->P:Ljava/lang/Object;

    iput-object p3, p0, Lu2/h0;->Q:[Ljava/lang/Object;

    iput-object p4, p0, Lu2/h0;->R:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    sget-object p1, Lu2/c0;->a:Lu2/k;

    iput-object p1, p0, Lu2/h0;->T:Lu2/k;

    new-instance p1, Lr1/c;

    const/16 p2, 0x10

    new-array p3, p2, [Lu2/g0;

    invoke-direct {p1, p3}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Lu2/h0;->U:Lr1/c;

    iput-object p1, p0, Lu2/h0;->V:Lr1/c;

    new-instance p1, Lr1/c;

    new-array p2, p2, [Lu2/g0;

    invoke-direct {p1, p2}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Lu2/h0;->W:Lr1/c;

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lu2/h0;->Y:J

    return-void
.end method


# virtual methods
.method public final F0()V
    .locals 0

    invoke-virtual {p0}, Lu2/h0;->Z0()V

    return-void
.end method

.method public final Q0()V
    .locals 0

    invoke-virtual {p0}, Lu2/h0;->Z0()V

    return-void
.end method

.method public final X0(Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 4

    new-instance v0, Lbc3/m;

    invoke-static {p2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance p2, Lu2/g0;

    invoke-direct {p2, p0, v0}, Lu2/g0;-><init>(Lu2/h0;Lbc3/m;)V

    iget-object v1, p0, Lu2/h0;->V:Lr1/c;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lu2/h0;->U:Lr1/c;

    invoke-virtual {v2, p2}, Lr1/c;->b(Ljava/lang/Object;)V

    new-instance v2, Lq83/l;

    invoke-static {p1, p2, p2}, Lge3/g;->p(Lc93/m;Lq83/d;Lq83/d;)Lq83/d;

    move-result-object p1

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    sget-object v3, Lr83/a;->w:Lr83/a;

    invoke-direct {v2, p1, v3}, Lq83/l;-><init>(Lq83/d;Lr83/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v2, p1}, Lq83/l;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    new-instance p1, Lj43/a;

    const/16 v1, 0x10

    invoke-direct {p1, p2, v1}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final Y0(Lu2/k;Lu2/l;)V
    .locals 6

    iget-object v0, p0, Lu2/h0;->V:Lr1/c;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lu2/h0;->W:Lr1/c;

    iget-object v2, p0, Lu2/h0;->U:Lr1/c;

    iget v3, v1, Lr1/c;->y:I

    invoke-virtual {v1, v3, v2}, Lr1/c;->d(ILr1/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    :try_start_1
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    iget-object v0, p0, Lu2/h0;->W:Lr1/c;

    iget v3, v0, Lr1/c;->y:I

    sub-int/2addr v3, v2

    iget-object v0, v0, Lr1/c;->w:[Ljava/lang/Object;

    array-length v2, v0

    if-ge v3, v2, :cond_5

    :goto_0
    if-ltz v3, :cond_5

    aget-object v2, v0, v3

    check-cast v2, Lu2/g0;

    iget-object v4, v2, Lu2/g0;->z:Lu2/l;

    if-ne p2, v4, :cond_2

    iget-object v4, v2, Lu2/g0;->y:Lbc3/m;

    if-eqz v4, :cond_2

    iput-object v1, v2, Lu2/g0;->y:Lbc3/m;

    invoke-virtual {v4, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_2
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_3
    :goto_1
    iget-object v0, p0, Lu2/h0;->W:Lr1/c;

    iget-object v2, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v0, :cond_5

    aget-object v4, v2, v3

    check-cast v4, Lu2/g0;

    iget-object v5, v4, Lu2/g0;->z:Lu2/l;

    if-ne p2, v5, :cond_4

    iget-object v5, v4, Lu2/g0;->y:Lbc3/m;

    if-eqz v5, :cond_4

    iput-object v1, v4, Lu2/g0;->y:Lbc3/m;

    invoke-virtual {v5, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lu2/h0;->W:Lr1/c;

    invoke-virtual {p1}, Lr1/c;->g()V

    return-void

    :goto_3
    iget-object p2, p0, Lu2/h0;->W:Lr1/c;

    invoke-virtual {p2}, Lr1/c;->g()V

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final Z0()V
    .locals 2

    iget-object v0, p0, Lu2/h0;->S:Lbc3/c2;

    if-eqz v0, :cond_0

    new-instance v1, Landroidx/compose/ui/input/pointer/PointerInputResetException;

    invoke-direct {v1}, Landroidx/compose/ui/input/pointer/PointerInputResetException;-><init>()V

    invoke-virtual {v0, v1}, Lbc3/t1;->p(Ljava/util/concurrent/CancellationException;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lu2/h0;->S:Lbc3/c2;

    :cond_0
    return-void
.end method

.method public final b0()V
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lu2/h0;->X:Lu2/k;

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v1, v1, Lu2/k;->a:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_3

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu2/r;

    invoke-virtual {v5}, Lu2/r;->f()Z

    move-result v5

    if-eqz v5, :cond_2

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    :goto_1
    if-ge v3, v4, :cond_1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu2/r;

    invoke-virtual {v5}, Lu2/r;->d()J

    move-result-wide v7

    invoke-virtual {v5}, Lu2/r;->e()J

    move-result-wide v11

    invoke-virtual {v5}, Lu2/r;->k()J

    move-result-wide v9

    invoke-virtual {v5}, Lu2/r;->g()F

    move-result v13

    invoke-virtual {v5}, Lu2/r;->e()J

    move-result-wide v16

    invoke-virtual {v5}, Lu2/r;->k()J

    move-result-wide v14

    invoke-virtual {v5}, Lu2/r;->f()Z

    move-result v18

    invoke-virtual {v5}, Lu2/r;->f()Z

    move-result v19

    invoke-virtual {v5}, Lu2/r;->j()I

    move-result v20

    new-instance v6, Lu2/r;

    invoke-direct/range {v6 .. v20}, Lu2/r;-><init>(JJJFJJZZI)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    new-instance v1, Lu2/k;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lu2/k;-><init>(Ljava/util/List;Lf1/p1;)V

    iput-object v1, v0, Lu2/h0;->T:Lu2/k;

    sget-object v2, Lu2/l;->w:Lu2/l;

    invoke-virtual {v0, v1, v2}, Lu2/h0;->Y0(Lu2/k;Lu2/l;)V

    sget-object v2, Lu2/l;->x:Lu2/l;

    invoke-virtual {v0, v1, v2}, Lu2/h0;->Y0(Lu2/k;Lu2/l;)V

    sget-object v2, Lu2/l;->y:Lu2/l;

    invoke-virtual {v0, v1, v2}, Lu2/h0;->Y0(Lu2/k;Lu2/l;)V

    iput-object v3, v0, Lu2/h0;->X:Lu2/k;

    return-void

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method public final c()V
    .locals 0

    invoke-virtual {p0}, Lu2/h0;->Z0()V

    return-void
.end method

.method public final getDensity()F
    .locals 1

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    iget-object v0, v0, La3/n0;->X:Ly3/c;

    invoke-interface {v0}, Ly3/c;->getDensity()F

    move-result v0

    return v0
.end method

.method public final m0()F
    .locals 1

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    iget-object v0, v0, La3/n0;->X:Ly3/c;

    invoke-interface {v0}, Ly3/c;->m0()F

    move-result v0

    return v0
.end method

.method public final r0(Lu2/k;Lu2/l;J)V
    .locals 3

    iput-wide p3, p0, Lu2/h0;->Y:J

    sget-object p3, Lu2/l;->w:Lu2/l;

    if-ne p2, p3, :cond_0

    iput-object p1, p0, Lu2/h0;->T:Lu2/k;

    :cond_0
    iget-object p3, p0, Lu2/h0;->S:Lbc3/c2;

    const/4 p4, 0x0

    if-nez p3, :cond_1

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object p3

    sget-object v0, Lbc3/d0;->z:Lbc3/d0;

    new-instance v1, Lsz/q;

    const/16 v2, 0x9

    invoke-direct {v1, p0, p4, v2}, Lsz/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x1

    invoke-static {p3, p4, v0, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p3

    iput-object p3, p0, Lu2/h0;->S:Lbc3/c2;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lu2/h0;->Y0(Lu2/k;Lu2/l;)V

    iget-object p2, p1, Lu2/k;->a:Ljava/lang/Object;

    move-object p3, p2

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p3}, Ljava/util/Collection;->size()I

    move-result p3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_3

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu2/r;

    invoke-static {v1}, Lu2/d0;->e(Lu2/r;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    move-object p1, p4

    :goto_1
    iput-object p1, p0, Lu2/h0;->X:Lu2/k;

    return-void
.end method
